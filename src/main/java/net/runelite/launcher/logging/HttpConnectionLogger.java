package net.runelite.launcher.logging;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Intercepts all HTTP/HTTPS connections made via java.net.URL.
 * This captures traffic from HttpURLConnection which is used for JAR downloads.
 */
public class HttpConnectionLogger {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    private static final SimpleDateFormat FILE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    private static final AtomicLong requestCounter = new AtomicLong(0);
    private static PrintWriter logWriter;
    private static final Object writerLock = new Object();

    static {
        initializeLogWriter();
    }

    private static void initializeLogWriter() {
        try {
            String userHome = System.getProperty("user.home");
            File logDir = new File(userHome, ".squire/logs");
            if (!logDir.exists()) {
                logDir.mkdirs();
            }
            String filename = "network_" + FILE_DATE_FORMAT.format(new Date()) + ".log";
            File logFile = new File(logDir, filename);
            logWriter = new PrintWriter(new FileWriter(logFile, true), true);
            System.out.println("[HttpLogger] Logging to: " + logFile.getAbsolutePath());
        } catch (Exception e) {
            System.err.println("[HttpLogger] Failed to initialize log file: " + e.getMessage());
        }
    }

    /**
     * Installs a custom ResponseCache that logs all HTTP requests.
     * This is called before any network activity starts.
     */
    public static void install() {
        System.out.println("[HttpLogger] Installing HTTP connection logger...");

        // Set system properties to ensure Java uses our configuration
        System.setProperty("sun.net.http.allowRestrictedHeaders", "true");

        // Install our custom ResponseCache to intercept requests
        ResponseCache.setDefault(new LoggingResponseCache());

        System.out.println("[HttpLogger] HTTP connection logger installed");
    }

    /**
     * Logs an HTTP request before it's sent.
     */
    public static void logRequest(URL url, String method, Map<String, List<String>> headers) {
        long requestId = requestCounter.incrementAndGet();
        String timestamp = DATE_FORMAT.format(new Date());

        StringBuilder log = new StringBuilder();
        log.append("\n");
        log.append("╔══════════════════════════════════════════════════════════════════════════════\n");
        log.append(String.format("║ HTTP REQUEST #%d @ %s\n", requestId, timestamp));
        log.append("╠══════════════════════════════════════════════════════════════════════════════\n");
        log.append(String.format("║ %s %s\n", method, url.toString()));
        log.append("║\n");
        log.append("║ HEADERS:\n");

        if (headers != null) {
            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    for (String value : entry.getValue()) {
                        log.append(String.format("║   %s: %s\n", key, value));
                    }
                }
            }
        }

        log.append("╚══════════════════════════════════════════════════════════════════════════════\n");

        String logStr = log.toString();
        System.out.print(logStr);
        writeToLog(logStr);
    }

    /**
     * Logs an HTTP response after it's received.
     */
    public static void logResponse(URL url, int responseCode, String responseMessage,
                                    Map<String, List<String>> headers, long contentLength) {
        String timestamp = DATE_FORMAT.format(new Date());

        StringBuilder log = new StringBuilder();
        log.append("\n");
        log.append("╔══════════════════════════════════════════════════════════════════════════════\n");
        log.append(String.format("║ HTTP RESPONSE @ %s\n", timestamp));
        log.append("╠══════════════════════════════════════════════════════════════════════════════\n");
        log.append(String.format("║ %d %s\n", responseCode, responseMessage != null ? responseMessage : ""));
        log.append(String.format("║ URL: %s\n", url.toString()));

        if (contentLength >= 0) {
            log.append(String.format("║ Content-Length: %d bytes\n", contentLength));
        }

        log.append("║\n");
        log.append("║ HEADERS:\n");

        if (headers != null) {
            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    for (String value : entry.getValue()) {
                        log.append(String.format("║   %s: %s\n", key, value));
                    }
                }
            }
        }

        log.append("╚══════════════════════════════════════════════════════════════════════════════\n");

        String logStr = log.toString();
        System.out.print(logStr);
        writeToLog(logStr);
    }

    /**
     * Logs a simple message.
     */
    public static void log(String message) {
        String timestamp = DATE_FORMAT.format(new Date());
        String logStr = String.format("[%s] %s\n", timestamp, message);
        System.out.print(logStr);
        writeToLog(logStr);
    }

    private static void writeToLog(String content) {
        synchronized (writerLock) {
            if (logWriter != null) {
                try {
                    logWriter.print(content);
                    logWriter.flush();
                } catch (Exception e) {
                    // Ignore
                }
            }
        }
    }

    /**
     * A custom ResponseCache that logs requests but doesn't actually cache anything.
     * This hooks into the Java URL connection system to see all requests.
     */
    static class LoggingResponseCache extends ResponseCache {
        @Override
        public CacheResponse get(URI uri, String requestMethod, Map<String, List<String>> requestHeaders) throws IOException {
            // Log the request
            try {
                logRequest(uri.toURL(), requestMethod, requestHeaders);
            } catch (Exception e) {
                System.err.println("[HttpLogger] Error logging request: " + e.getMessage());
            }
            // Return null to indicate no cached response - let the actual request proceed
            return null;
        }

        @Override
        public CacheRequest put(URI uri, URLConnection conn) throws IOException {
            // Log the response
            try {
                if (conn instanceof HttpURLConnection) {
                    HttpURLConnection httpConn = (HttpURLConnection) conn;
                    logResponse(
                        uri.toURL(),
                        httpConn.getResponseCode(),
                        httpConn.getResponseMessage(),
                        httpConn.getHeaderFields(),
                        httpConn.getContentLengthLong()
                    );
                }
            } catch (Exception e) {
                System.err.println("[HttpLogger] Error logging response: " + e.getMessage());
            }
            // Return null - we don't want to cache anything
            return null;
        }
    }
}
