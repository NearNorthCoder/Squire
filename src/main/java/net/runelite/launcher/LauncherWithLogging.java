package net.runelite.launcher;

import net.runelite.launcher.logging.NetworkLoggingInterceptor;
import net.runelite.launcher.logging.HttpConnectionLogger;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Wrapper launcher that enables network logging before starting the main launcher.
 * This ensures all HTTP requests and responses are logged in clear text.
 *
 * Captures traffic from:
 * 1. OkHttpClient (API calls) - via NetworkLoggingInterceptor injection
 * 2. HttpURLConnection (JAR downloads) - via ResponseCache hook
 * 3. All URL connections - via custom URLStreamHandlerFactory
 */
public class LauncherWithLogging {

    private static final NetworkLoggingInterceptor LOGGING_INTERCEPTOR = new NetworkLoggingInterceptor();
    private static volatile boolean interceptorInstalled = false;

    public static void main(String[] args) throws Exception {
        printBanner();

        System.out.println("[NetworkLogger] Initializing comprehensive network logging...");

        // Add shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\n═══════════════════════════════════════════════════════════════════════════════");
            System.out.println("Network logging session ended. Check logs at: ~/.squire/logs/network_*.log");
            System.out.println("═══════════════════════════════════════════════════════════════════════════════\n");
        }));

        // Strategy 1: Install HTTP connection logger (for HttpURLConnection / JAR downloads)
        try {
            HttpConnectionLogger.install();
            System.out.println("[NetworkLogger] HttpURLConnection logger installed!");
        } catch (Exception e) {
            System.err.println("[NetworkLogger] Warning: HttpURLConnection logger failed: " + e.getMessage());
        }

        // Strategy 2: Install custom URLStreamHandlerFactory
        try {
            installUrlStreamHandlerFactory();
            System.out.println("[NetworkLogger] URLStreamHandlerFactory installed!");
        } catch (Exception e) {
            System.err.println("[NetworkLogger] Warning: URLStreamHandlerFactory failed: " + e.getMessage());
        }

        // Strategy 3: Set up Authenticator to see auth challenges
        try {
            installAuthenticator();
            System.out.println("[NetworkLogger] Authenticator installed!");
        } catch (Exception e) {
            System.err.println("[NetworkLogger] Warning: Authenticator failed: " + e.getMessage());
        }

        interceptorInstalled = true;
        System.out.println("[NetworkLogger] All interceptors installed!");
        System.out.println("[NetworkLogger] Launching Squire...\n");

        // Call the original launcher
        Launcher.main(args);
    }

    /**
     * Installs a custom URLStreamHandlerFactory to wrap all URL connections.
     */
    private static void installUrlStreamHandlerFactory() throws Exception {
        // Try to install our factory - this can only be done once per JVM
        try {
            URL.setURLStreamHandlerFactory(new LoggingURLStreamHandlerFactory());
            System.out.println("[NetworkLogger] URLStreamHandlerFactory set successfully");
        } catch (Error e) {
            // Factory already set - try to reset it via reflection
            System.out.println("[NetworkLogger] Factory already set, attempting reflection override...");

            Field factoryField = URL.class.getDeclaredField("factory");
            factoryField.setAccessible(true);

            // Get existing factory
            URLStreamHandlerFactory existingFactory = (URLStreamHandlerFactory) factoryField.get(null);

            // Reset the factory field to null first
            Field lockField = URL.class.getDeclaredField("streamHandlerLock");
            lockField.setAccessible(true);
            synchronized (lockField.get(null)) {
                factoryField.set(null, null);
                // Now set our wrapping factory
                URL.setURLStreamHandlerFactory(new LoggingURLStreamHandlerFactory(existingFactory));
            }
            System.out.println("[NetworkLogger] Factory replaced via reflection");
        }
    }

    /**
     * Installs a custom Authenticator to log authentication challenges.
     */
    private static void installAuthenticator() {
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                HttpConnectionLogger.log(String.format(
                    "AUTH CHALLENGE: %s %s://%s:%d%s (scheme: %s, prompt: %s)",
                    getRequestorType(),
                    getRequestingProtocol(),
                    getRequestingHost(),
                    getRequestingPort(),
                    getRequestingURL() != null ? getRequestingURL().getPath() : "",
                    getRequestingScheme(),
                    getRequestingPrompt()
                ));
                return null; // Don't provide credentials, let the original auth handle it
            }
        });
    }

    /**
     * Get a pre-configured OkHttpClient with logging enabled.
     */
    public static OkHttpClient.Builder getLoggingClientBuilder() {
        return new OkHttpClient.Builder().addInterceptor(LOGGING_INTERCEPTOR);
    }

    /**
     * Get the logging interceptor instance.
     */
    public static NetworkLoggingInterceptor getLoggingInterceptor() {
        return LOGGING_INTERCEPTOR;
    }

    /**
     * Check if the interceptor is installed.
     */
    public static boolean isInterceptorInstalled() {
        return interceptorInstalled;
    }

    /**
     * Create an OkHttpClient with logging already configured.
     */
    public static OkHttpClient createLoggingClient() {
        return getLoggingClientBuilder().build();
    }

    private static void printBanner() {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println();
        System.out.println("╔═══════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                                               ║");
        System.out.println("║     ███╗   ██╗███████╗████████╗██╗    ██╗ ██████╗ ██████╗ ██╗  ██╗           ║");
        System.out.println("║     ████╗  ██║██╔════╝╚══██╔══╝██║    ██║██╔═══██╗██╔══██╗██║ ██╔╝           ║");
        System.out.println("║     ██╔██╗ ██║█████╗     ██║   ██║ █╗ ██║██║   ██║██████╔╝█████╔╝            ║");
        System.out.println("║     ██║╚██╗██║██╔══╝     ██║   ██║███╗██║██║   ██║██╔══██╗██╔═██╗            ║");
        System.out.println("║     ██║ ╚████║███████╗   ██║   ╚███╔███╔╝╚██████╔╝██║  ██║██║  ██╗           ║");
        System.out.println("║     ╚═╝  ╚═══╝╚══════╝   ╚═╝    ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝           ║");
        System.out.println("║                                                                               ║");
        System.out.println("║              ██╗      ██████╗  ██████╗  ██████╗ ███████╗██████╗              ║");
        System.out.println("║              ██║     ██╔═══██╗██╔════╝ ██╔════╝ ██╔════╝██╔══██╗             ║");
        System.out.println("║              ██║     ██║   ██║██║  ███╗██║  ███╗█████╗  ██████╔╝             ║");
        System.out.println("║              ██║     ██║   ██║██║   ██║██║   ██║██╔══╝  ██╔══██╗             ║");
        System.out.println("║              ███████╗╚██████╔╝╚██████╔╝╚██████╔╝███████╗██║  ██║             ║");
        System.out.println("║              ╚══════╝ ╚═════╝  ╚═════╝  ╚═════╝ ╚══════╝╚═╝  ╚═╝             ║");
        System.out.println("║                                                                               ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║  Captures: OkHttpClient + HttpURLConnection + All URL connections             ║");
        System.out.println("║  Logs: ~/.squire/logs/network_*.log                                           ║");
        System.out.println("║  Started: " + timestamp + "                                             ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════╝");
        System.out.println();
    }

    /**
     * Custom URLStreamHandlerFactory that wraps URL connections for logging.
     */
    static class LoggingURLStreamHandlerFactory implements URLStreamHandlerFactory {
        private final URLStreamHandlerFactory delegate;

        LoggingURLStreamHandlerFactory() {
            this(null);
        }

        LoggingURLStreamHandlerFactory(URLStreamHandlerFactory delegate) {
            this.delegate = delegate;
        }

        @Override
        public URLStreamHandler createURLStreamHandler(String protocol) {
            // For http and https, return our logging handler
            if ("http".equalsIgnoreCase(protocol) || "https".equalsIgnoreCase(protocol)) {
                return new LoggingURLStreamHandler(protocol);
            }
            // For other protocols, delegate to existing factory or return null
            if (delegate != null) {
                return delegate.createURLStreamHandler(protocol);
            }
            return null;
        }
    }

    /**
     * Custom URLStreamHandler that wraps connections for logging.
     */
    static class LoggingURLStreamHandler extends URLStreamHandler {
        private final String protocol;

        LoggingURLStreamHandler(String protocol) {
            this.protocol = protocol;
        }

        @Override
        protected URLConnection openConnection(URL url) throws java.io.IOException {
            HttpConnectionLogger.log("Opening connection: " + url);

            // Get the default handler for this protocol
            URLStreamHandler defaultHandler = getDefaultHandler(protocol);
            if (defaultHandler != null) {
                try {
                    // Use reflection to call the protected openConnection method
                    Method openMethod = URLStreamHandler.class.getDeclaredMethod("openConnection", URL.class);
                    openMethod.setAccessible(true);
                    URLConnection conn = (URLConnection) openMethod.invoke(defaultHandler, url);

                    // Wrap in logging connection
                    if (conn instanceof HttpURLConnection) {
                        return new LoggingHttpURLConnection((HttpURLConnection) conn, url);
                    }
                    return conn;
                } catch (Exception e) {
                    HttpConnectionLogger.log("Error wrapping connection: " + e.getMessage());
                }
            }

            // Fallback - create connection directly
            if ("https".equalsIgnoreCase(protocol)) {
                return new javax.net.ssl.HttpsURLConnection(url) {
                    private final HttpURLConnection delegate = (HttpURLConnection) new URL(url.toString()).openConnection();

                    @Override
                    public void connect() throws java.io.IOException {
                        HttpConnectionLogger.log("HTTPS CONNECT: " + url);
                        delegate.connect();
                    }

                    @Override
                    public void disconnect() {
                        delegate.disconnect();
                    }

                    @Override
                    public boolean usingProxy() {
                        return delegate.usingProxy();
                    }

                    @Override
                    public java.io.InputStream getInputStream() throws java.io.IOException {
                        return delegate.getInputStream();
                    }

                    @Override
                    public java.io.OutputStream getOutputStream() throws java.io.IOException {
                        return delegate.getOutputStream();
                    }

                    @Override
                    public int getResponseCode() throws java.io.IOException {
                        int code = delegate.getResponseCode();
                        HttpConnectionLogger.log("HTTPS RESPONSE: " + code + " from " + url);
                        return code;
                    }

                    @Override
                    public String getCipherSuite() {
                        if (delegate instanceof javax.net.ssl.HttpsURLConnection) {
                            return ((javax.net.ssl.HttpsURLConnection) delegate).getCipherSuite();
                        }
                        return null;
                    }

                    @Override
                    public java.security.cert.Certificate[] getLocalCertificates() {
                        if (delegate instanceof javax.net.ssl.HttpsURLConnection) {
                            return ((javax.net.ssl.HttpsURLConnection) delegate).getLocalCertificates();
                        }
                        return null;
                    }

                    @Override
                    public java.security.cert.Certificate[] getServerCertificates() throws javax.net.ssl.SSLPeerUnverifiedException {
                        if (delegate instanceof javax.net.ssl.HttpsURLConnection) {
                            return ((javax.net.ssl.HttpsURLConnection) delegate).getServerCertificates();
                        }
                        return null;
                    }
                };
            }

            throw new java.io.IOException("Cannot create connection for: " + url);
        }

        private URLStreamHandler getDefaultHandler(String protocol) {
            try {
                // Try to get the default sun handler
                String className = "sun.net.www.protocol." + protocol + ".Handler";
                Class<?> handlerClass = Class.forName(className);
                return (URLStreamHandler) handlerClass.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                return null;
            }
        }
    }

    /**
     * Wrapper for HttpURLConnection that logs all activity.
     */
    static class LoggingHttpURLConnection extends HttpURLConnection {
        private final HttpURLConnection delegate;

        LoggingHttpURLConnection(HttpURLConnection delegate, URL url) {
            super(url);
            this.delegate = delegate;
        }

        @Override
        public void connect() throws java.io.IOException {
            HttpConnectionLogger.log("HTTP CONNECT: " + getRequestMethod() + " " + getURL());
            Map<String, List<String>> headers = delegate.getRequestProperties();
            if (headers != null && !headers.isEmpty()) {
                StringBuilder sb = new StringBuilder("Request headers:\n");
                for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                    if (entry.getKey() != null) {
                        sb.append("  ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
                    }
                }
                HttpConnectionLogger.log(sb.toString());
            }
            delegate.connect();
        }

        @Override
        public void disconnect() {
            HttpConnectionLogger.log("HTTP DISCONNECT: " + getURL());
            delegate.disconnect();
        }

        @Override
        public boolean usingProxy() {
            return delegate.usingProxy();
        }

        @Override
        public java.io.InputStream getInputStream() throws java.io.IOException {
            return delegate.getInputStream();
        }

        @Override
        public java.io.OutputStream getOutputStream() throws java.io.IOException {
            return delegate.getOutputStream();
        }

        @Override
        public int getResponseCode() throws java.io.IOException {
            int code = delegate.getResponseCode();
            HttpConnectionLogger.log("HTTP RESPONSE: " + code + " " + delegate.getResponseMessage() + " from " + getURL());

            // Log response headers
            Map<String, List<String>> headers = delegate.getHeaderFields();
            if (headers != null && !headers.isEmpty()) {
                StringBuilder sb = new StringBuilder("Response headers:\n");
                for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                    if (entry.getKey() != null) {
                        sb.append("  ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
                    }
                }
                long contentLength = delegate.getContentLengthLong();
                if (contentLength >= 0) {
                    sb.append("  Content-Length: ").append(contentLength).append(" bytes\n");
                }
                HttpConnectionLogger.log(sb.toString());
            }
            return code;
        }

        @Override
        public String getResponseMessage() throws java.io.IOException {
            return delegate.getResponseMessage();
        }

        @Override
        public void setRequestMethod(String method) throws java.net.ProtocolException {
            delegate.setRequestMethod(method);
        }

        @Override
        public String getRequestMethod() {
            return delegate.getRequestMethod();
        }

        @Override
        public void setRequestProperty(String key, String value) {
            delegate.setRequestProperty(key, value);
        }

        @Override
        public void addRequestProperty(String key, String value) {
            delegate.addRequestProperty(key, value);
        }

        @Override
        public String getRequestProperty(String key) {
            return delegate.getRequestProperty(key);
        }

        @Override
        public Map<String, List<String>> getRequestProperties() {
            return delegate.getRequestProperties();
        }

        @Override
        public String getHeaderField(String name) {
            return delegate.getHeaderField(name);
        }

        @Override
        public Map<String, List<String>> getHeaderFields() {
            return delegate.getHeaderFields();
        }

        @Override
        public long getContentLengthLong() {
            return delegate.getContentLengthLong();
        }

        @Override
        public String getContentType() {
            return delegate.getContentType();
        }

        @Override
        public void setDoOutput(boolean doOutput) {
            delegate.setDoOutput(doOutput);
        }

        @Override
        public void setDoInput(boolean doInput) {
            delegate.setDoInput(doInput);
        }

        @Override
        public void setConnectTimeout(int timeout) {
            delegate.setConnectTimeout(timeout);
        }

        @Override
        public void setReadTimeout(int timeout) {
            delegate.setReadTimeout(timeout);
        }

        @Override
        public java.io.InputStream getErrorStream() {
            return delegate.getErrorStream();
        }
    }
}
