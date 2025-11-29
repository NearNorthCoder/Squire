package net.runelite.launcher.logging;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.*;

/**
 * A simple logging HTTP/HTTPS proxy server.
 * Intercepts all HTTP traffic and logs requests/responses in clear text.
 */
public class LoggingProxyServer implements Runnable {

    private static final int DEFAULT_PORT = 18888;
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    private static final SimpleDateFormat FILE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    private final int port;
    private final ExecutorService executor;
    private final AtomicInteger requestCounter = new AtomicInteger(0);
    private ServerSocket serverSocket;
    private volatile boolean running = false;
    private PrintWriter logWriter;

    public LoggingProxyServer() {
        this(DEFAULT_PORT);
    }

    public LoggingProxyServer(int port) {
        this.port = port;
        this.executor = Executors.newCachedThreadPool(r -> {
            Thread t = new Thread(r, "ProxyHandler");
            t.setDaemon(true);
            return t;
        });
        initLogWriter();
    }

    private void initLogWriter() {
        try {
            String userHome = System.getProperty("user.home");
            File logDir = new File(userHome, ".squire/logs");
            if (!logDir.exists()) {
                logDir.mkdirs();
            }
            String filename = "network_" + FILE_DATE_FORMAT.format(new Date()) + ".log";
            File logFile = new File(logDir, filename);
            logWriter = new PrintWriter(new FileWriter(logFile, true), true);
            System.out.println("[LoggingProxy] Logging to: " + logFile.getAbsolutePath());
        } catch (Exception e) {
            System.err.println("[LoggingProxy] Failed to initialize log file: " + e.getMessage());
        }
    }

    /**
     * Starts the proxy server and configures the JVM to use it.
     */
    public void startAndConfigure() throws IOException {
        start();
        configureSystemProxy();
    }

    /**
     * Starts the proxy server.
     */
    public void start() throws IOException {
        serverSocket = new ServerSocket(port);
        running = true;
        System.out.println("[LoggingProxy] Proxy server started on port " + port);

        Thread serverThread = new Thread(this, "LoggingProxy-Server");
        serverThread.setDaemon(true);
        serverThread.start();
    }

    /**
     * Configures the JVM to use this proxy for all HTTP/HTTPS connections.
     */
    public void configureSystemProxy() {
        System.setProperty("http.proxyHost", "127.0.0.1");
        System.setProperty("http.proxyPort", String.valueOf(port));
        System.setProperty("https.proxyHost", "127.0.0.1");
        System.setProperty("https.proxyPort", String.valueOf(port));

        System.out.println("[LoggingProxy] System proxy configured: 127.0.0.1:" + port);

        // Also set the default proxy selector
        ProxySelector.setDefault(new ProxySelector() {
            @Override
            public java.util.List<Proxy> select(URI uri) {
                return java.util.Collections.singletonList(
                    new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", port))
                );
            }

            @Override
            public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
                System.err.println("[LoggingProxy] Connection failed: " + uri + " - " + ioe.getMessage());
            }
        });

        System.out.println("[LoggingProxy] ProxySelector configured");
    }

    /**
     * Stops the proxy server.
     */
    public void stop() {
        running = false;
        try {
            if (serverSocket != null) {
                serverSocket.close();
            }
        } catch (IOException e) {
            // Ignore
        }
        executor.shutdownNow();
    }

    @Override
    public void run() {
        while (running) {
            try {
                Socket clientSocket = serverSocket.accept();
                executor.submit(new ProxyHandler(clientSocket, requestCounter.incrementAndGet()));
            } catch (IOException e) {
                if (running) {
                    System.err.println("[LoggingProxy] Accept failed: " + e.getMessage());
                }
            }
        }
    }

    /**
     * Handles a single proxy request.
     */
    private class ProxyHandler implements Runnable {
        private final Socket clientSocket;
        private final int requestId;

        ProxyHandler(Socket clientSocket, int requestId) {
            this.clientSocket = clientSocket;
            this.requestId = requestId;
        }

        @Override
        public void run() {
            try {
                handleRequest();
            } catch (Exception e) {
                System.err.println("[LoggingProxy] Handler error: " + e.getMessage());
            } finally {
                try {
                    clientSocket.close();
                } catch (IOException e) {
                    // Ignore
                }
            }
        }

        private void handleRequest() throws IOException {
            InputStream clientIn = clientSocket.getInputStream();
            OutputStream clientOut = clientSocket.getOutputStream();

            BufferedReader reader = new BufferedReader(new InputStreamReader(clientIn));
            String requestLine = reader.readLine();

            if (requestLine == null || requestLine.isEmpty()) {
                return;
            }

            String[] parts = requestLine.split(" ");
            if (parts.length < 3) {
                return;
            }

            String method = parts[0];
            String url = parts[1];

            String timestamp = DATE_FORMAT.format(new Date());

            // Log the request
            StringBuilder requestLog = new StringBuilder();
            requestLog.append("\n");
            requestLog.append("╔══════════════════════════════════════════════════════════════════════════════\n");
            requestLog.append(String.format("║ REQUEST #%d @ %s\n", requestId, timestamp));
            requestLog.append("╠══════════════════════════════════════════════════════════════════════════════\n");
            requestLog.append(String.format("║ %s %s\n", method, url));
            requestLog.append("║\n");
            requestLog.append("║ HEADERS:\n");

            // Handle CONNECT method (for HTTPS tunneling)
            if ("CONNECT".equalsIgnoreCase(method)) {
                handleConnect(reader, clientOut, url, requestLog);
                return;
            }

            // Parse URL
            URL targetUrl;
            try {
                if (url.startsWith("http://") || url.startsWith("https://")) {
                    targetUrl = new URL(url);
                } else {
                    // Relative URL - need host from headers
                    String host = null;
                    String line;
                    StringBuilder headers = new StringBuilder();
                    while ((line = reader.readLine()) != null && !line.isEmpty()) {
                        headers.append(line).append("\r\n");
                        requestLog.append(String.format("║   %s\n", line));
                        if (line.toLowerCase().startsWith("host:")) {
                            host = line.substring(5).trim();
                        }
                    }
                    if (host == null) {
                        return;
                    }
                    targetUrl = new URL("http://" + host + url);
                }
            } catch (MalformedURLException e) {
                return;
            }

            // Read remaining headers
            StringBuilder headers = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                headers.append(line).append("\r\n");
                requestLog.append(String.format("║   %s\n", line));
            }

            requestLog.append("╚══════════════════════════════════════════════════════════════════════════════\n");

            // Print and log request
            String requestLogStr = requestLog.toString();
            System.out.print(requestLogStr);
            writeToLog(requestLogStr);

            // Forward request to target server
            try {
                HttpURLConnection conn = (HttpURLConnection) targetUrl.openConnection(Proxy.NO_PROXY);
                conn.setRequestMethod(method);
                conn.setDoInput(true);

                // Set headers
                for (String headerLine : headers.toString().split("\r\n")) {
                    if (!headerLine.isEmpty()) {
                        int colonPos = headerLine.indexOf(":");
                        if (colonPos > 0) {
                            String key = headerLine.substring(0, colonPos);
                            String value = headerLine.substring(colonPos + 1).trim();
                            // Skip hop-by-hop headers
                            if (!key.equalsIgnoreCase("Proxy-Connection") &&
                                !key.equalsIgnoreCase("Connection") &&
                                !key.equalsIgnoreCase("Keep-Alive")) {
                                conn.setRequestProperty(key, value);
                            }
                        }
                    }
                }

                conn.connect();

                // Read response
                int responseCode = conn.getResponseCode();
                String responseMessage = conn.getResponseMessage();

                // Log response
                StringBuilder responseLog = new StringBuilder();
                responseLog.append("\n");
                responseLog.append("╔══════════════════════════════════════════════════════════════════════════════\n");
                responseLog.append(String.format("║ RESPONSE #%d @ %s\n", requestId, DATE_FORMAT.format(new Date())));
                responseLog.append("╠══════════════════════════════════════════════════════════════════════════════\n");
                responseLog.append(String.format("║ %d %s\n", responseCode, responseMessage));
                responseLog.append(String.format("║ URL: %s\n", targetUrl));
                responseLog.append("║\n");
                responseLog.append("║ HEADERS:\n");

                // Forward response to client
                StringBuilder responseHeaders = new StringBuilder();
                responseHeaders.append("HTTP/1.1 ").append(responseCode).append(" ").append(responseMessage).append("\r\n");

                for (int i = 1; ; i++) {
                    String key = conn.getHeaderFieldKey(i);
                    String value = conn.getHeaderField(i);
                    if (key == null && value == null) break;
                    if (key != null) {
                        responseHeaders.append(key).append(": ").append(value).append("\r\n");
                        responseLog.append(String.format("║   %s: %s\n", key, value));
                    }
                }
                responseHeaders.append("\r\n");

                // Read response body
                InputStream responseStream;
                try {
                    responseStream = conn.getInputStream();
                } catch (IOException e) {
                    responseStream = conn.getErrorStream();
                }

                if (responseStream != null) {
                    ByteArrayOutputStream bodyBuffer = new ByteArrayOutputStream();
                    byte[] buffer = new byte[4096];
                    int bytesRead;
                    while ((bytesRead = responseStream.read(buffer)) != -1) {
                        bodyBuffer.write(buffer, 0, bytesRead);
                    }

                    byte[] body = bodyBuffer.toByteArray();

                    // Check if body is text
                    String contentType = conn.getContentType();
                    if (contentType != null &&
                        (contentType.contains("text") || contentType.contains("json") ||
                         contentType.contains("xml") || contentType.contains("javascript"))) {
                        responseLog.append("║\n");
                        responseLog.append("║ RESPONSE BODY:\n");
                        responseLog.append("║   ─────────────────────────────────────────────────────────────────────────\n");
                        String bodyText = new String(body, "UTF-8");
                        if (bodyText.length() > 50000) {
                            bodyText = bodyText.substring(0, 50000) + "... [TRUNCATED]";
                        }
                        for (String bodyLine : bodyText.split("\n")) {
                            responseLog.append(String.format("║   %s\n", bodyLine));
                        }
                    } else {
                        responseLog.append(String.format("║\n║ RESPONSE BODY: [Binary content - %d bytes]\n", body.length));
                    }

                    // Send response to client
                    clientOut.write(responseHeaders.toString().getBytes());
                    clientOut.write(body);
                    clientOut.flush();
                }

                responseLog.append("╚══════════════════════════════════════════════════════════════════════════════\n");

                String responseLogStr = responseLog.toString();
                System.out.print(responseLogStr);
                writeToLog(responseLogStr);

            } catch (Exception e) {
                System.err.println("[LoggingProxy] Forward error: " + e.getMessage());
            }
        }

        private void handleConnect(BufferedReader reader, OutputStream clientOut, String url, StringBuilder requestLog) throws IOException {
            // Read and log remaining headers
            String line;
            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                requestLog.append(String.format("║   %s\n", line));
            }
            requestLog.append("╚══════════════════════════════════════════════════════════════════════════════\n");

            String requestLogStr = requestLog.toString();
            System.out.print(requestLogStr);
            writeToLog(requestLogStr);

            // Parse host:port
            String[] hostPort = url.split(":");
            String host = hostPort[0];
            int port = hostPort.length > 1 ? Integer.parseInt(hostPort[1]) : 443;

            // Connect to target
            try (Socket targetSocket = new Socket(host, port)) {
                // Send 200 Connection Established
                clientOut.write("HTTP/1.1 200 Connection Established\r\n\r\n".getBytes());
                clientOut.flush();

                // Log the tunnel establishment
                StringBuilder tunnelLog = new StringBuilder();
                tunnelLog.append("\n");
                tunnelLog.append("╔══════════════════════════════════════════════════════════════════════════════\n");
                tunnelLog.append(String.format("║ HTTPS TUNNEL #%d ESTABLISHED\n", requestId));
                tunnelLog.append(String.format("║ Target: %s:%d\n", host, port));
                tunnelLog.append("║ Note: HTTPS content is encrypted - only connection visible\n");
                tunnelLog.append("╚══════════════════════════════════════════════════════════════════════════════\n");

                String tunnelLogStr = tunnelLog.toString();
                System.out.print(tunnelLogStr);
                writeToLog(tunnelLogStr);

                // Create bidirectional tunnel
                Thread clientToServer = new Thread(() -> {
                    try {
                        pipe(clientSocket.getInputStream(), targetSocket.getOutputStream());
                    } catch (IOException e) {
                        // Tunnel closed
                    }
                });
                clientToServer.start();

                // Server to client (in current thread)
                pipe(targetSocket.getInputStream(), clientSocket.getOutputStream());

                clientToServer.interrupt();

            } catch (Exception e) {
                clientOut.write("HTTP/1.1 502 Bad Gateway\r\n\r\n".getBytes());
            }
        }

        private void pipe(InputStream in, OutputStream out) throws IOException {
            byte[] buffer = new byte[8192];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
                out.flush();
            }
        }
    }

    private synchronized void writeToLog(String content) {
        if (logWriter != null) {
            logWriter.print(content);
            logWriter.flush();
        }
    }

    /**
     * Main method for standalone testing.
     */
    public static void main(String[] args) throws Exception {
        LoggingProxyServer proxy = new LoggingProxyServer();
        proxy.startAndConfigure();

        System.out.println("Proxy server running. Press Enter to stop...");
        System.in.read();

        proxy.stop();
    }
}
