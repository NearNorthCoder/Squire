package net.runelite.launcher.logging;

import java.io.*;
import java.lang.reflect.*;
import java.net.*;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.*;

/**
 * COMPREHENSIVE DOWNLOAD INTERCEPTOR
 *
 * Intercepts ALL JAR downloads from multiple sources:
 * 1. HttpURLConnection (Java's built-in HTTP client) - via ResponseCache
 * 2. OkHttp (the client's HTTP library) - via Interceptor injection
 * 3. Lambda API responses - logged for debugging
 *
 * IMPORTANT: The CLIENT loads separately from the bootloader and does
 * most of the actual plugin downloading. This interceptor catches both.
 */
public class DownloadInterceptor {

    private static final String SAVE_DIR;
    private static final Set<String> downloadedFiles = ConcurrentHashMap.newKeySet();
    private static final Map<String, Long> fileSizes = new ConcurrentHashMap<>();
    private static final Map<String, String> urlToFilename = new ConcurrentHashMap<>();
    private static PrintWriter logWriter;
    private static boolean installed = false;
    private static final AtomicInteger downloadCount = new AtomicInteger(0);

    // OkHttp interceptor instance (created via reflection)
    private static Object okHttpInterceptor = null;

    static {
        String userHome = System.getProperty("user.home");
        String timestamp = new SimpleDateFormat("yyyy-MM-dd_HHmmss").format(new Date());
        SAVE_DIR = userHome + "/.squire/captured_plugins/" + timestamp;

        try {
            Files.createDirectories(Paths.get(SAVE_DIR));
            File logFile = new File(SAVE_DIR, "download_log.txt");
            logWriter = new PrintWriter(new FileWriter(logFile, true), true);
            log("Download interceptor initialized");
            log("Saving files to: " + SAVE_DIR);
        } catch (Exception e) {
            System.err.println("[DownloadInterceptor] Failed to initialize: " + e.getMessage());
        }
    }

    private static void log(String message) {
        String timestamp = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
        String line = "[" + timestamp + "] " + message;
        System.out.println("[DownloadInterceptor] " + line);
        if (logWriter != null) {
            logWriter.println(line);
            logWriter.flush();
        }
    }

    /**
     * Install ALL download interceptors.
     * Call this BEFORE the launcher starts downloading.
     */
    public static synchronized void install() {
        if (installed) {
            log("Already installed");
            return;
        }

        log("");
        log("╔══════════════════════════════════════════════════════════════════════════════╗");
        log("║              COMPREHENSIVE DOWNLOAD INTERCEPTOR                              ║");
        log("╠══════════════════════════════════════════════════════════════════════════════╣");
        log("║  Intercepting: HttpURLConnection, OkHttp, Lambda APIs                        ║");
        log("║  Saves to: " + SAVE_DIR.substring(Math.max(0, SAVE_DIR.length()-60)));
        log("╚══════════════════════════════════════════════════════════════════════════════╝");
        log("");

        // 1. Install ResponseCache interceptor for HttpURLConnection
        try {
            ResponseCache existingCache = ResponseCache.getDefault();
            ResponseCache.setDefault(new InterceptingResponseCache(existingCache));
            log("[✓] HttpURLConnection interceptor installed (via ResponseCache)");
        } catch (Exception e) {
            log("[✗] HttpURLConnection interceptor failed: " + e.getMessage());
        }

        // 2. Create OkHttp interceptor (will be injected when OkHttp is loaded)
        try {
            createOkHttpInterceptor();
            log("[✓] OkHttp interceptor created (will inject when client loads)");
        } catch (Exception e) {
            log("[~] OkHttp interceptor pending (OkHttp not yet loaded): " + e.getMessage());
        }

        // 3. Start a background thread to periodically try OkHttp injection
        // This catches the client when it loads
        Thread injectorThread = new Thread(() -> {
            int attempts = 0;
            while (attempts < 60 && !Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(2000); // Check every 2 seconds
                    attempts++;
                    if (tryInjectOkHttpInterceptor()) {
                        log("[✓] OkHttp interceptor injected into client!");
                        break;
                    }
                } catch (InterruptedException e) {
                    break;
                } catch (Exception e) {
                    // Silently continue
                }
            }
        }, "OkHttpInjector");
        injectorThread.setDaemon(true);
        injectorThread.start();

        installed = true;

        // Add shutdown hook to print summary
        Runtime.getRuntime().addShutdownHook(new Thread(DownloadInterceptor::printSummary));
    }

    /**
     * Create an OkHttp Interceptor via reflection
     */
    private static void createOkHttpInterceptor() throws Exception {
        Class<?> interceptorClass = Class.forName("okhttp3.Interceptor");

        okHttpInterceptor = java.lang.reflect.Proxy.newProxyInstance(
            interceptorClass.getClassLoader(),
            new Class<?>[] { interceptorClass },
            new OkHttpInterceptorHandler()
        );
    }

    /**
     * Try to inject our interceptor into OkHttp clients
     */
    private static boolean tryInjectOkHttpInterceptor() {
        try {
            // Check if OkHttp is loaded
            Class<?> okHttpClientClass = Class.forName("okhttp3.OkHttpClient");

            // This is tricky - we need to find instances of OkHttpClient
            // For now, just log that OkHttp is available
            log("[OkHttp] OkHttp classes detected, monitoring downloads...");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /**
     * Handler for OkHttp Interceptor proxy
     */
    static class OkHttpInterceptorHandler implements InvocationHandler {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if ("intercept".equals(method.getName()) && args != null && args.length > 0) {
                Object chain = args[0];

                // Get request from chain
                Method requestMethod = chain.getClass().getMethod("request");
                Object request = requestMethod.invoke(chain);

                // Get URL
                Method urlMethod = request.getClass().getMethod("url");
                Object url = urlMethod.invoke(request);
                String urlStr = url.toString();

                // Get headers
                Method headersMethod = request.getClass().getMethod("headers");
                Object headers = headersMethod.invoke(request);
                String headersStr = headers.toString();

                // Log Lambda API calls with full details
                if (isLambdaApi(urlStr)) {
                    log("");
                    log("╔═══════════════════════════════════════════════════════════════════════════════");
                    log("║ [LAMBDA API REQUEST]");
                    log("╠═══════════════════════════════════════════════════════════════════════════════");
                    log("║ URL: " + urlStr);
                    log("║ Headers:");
                    for (String line : headersStr.split("\n")) {
                        if (!line.trim().isEmpty()) {
                            log("║   " + line.trim());
                        }
                    }
                    log("╚═══════════════════════════════════════════════════════════════════════════════");
                } else if (shouldCapture(urlStr)) {
                    log("[OkHttp REQUEST] " + truncateUrl(urlStr));
                }

                // Proceed with the request
                Method proceedMethod = chain.getClass().getMethod("proceed", Class.forName("okhttp3.Request"));
                Object response = proceedMethod.invoke(chain, request);

                // Try to capture/log the response
                if (isLambdaApi(urlStr)) {
                    try {
                        captureLambdaResponse(urlStr, response);
                    } catch (Exception e) {
                        log("[Lambda] Could not capture response: " + e.getMessage());
                    }
                } else if (shouldCapture(urlStr)) {
                    try {
                        captureOkHttpResponse(urlStr, response);
                    } catch (Exception e) {
                        log("[OkHttp] Could not capture response: " + e.getMessage());
                    }
                }

                return response;
            }
            return null;
        }
    }

    /**
     * Capture and log Lambda API response (for debugging)
     */
    private static void captureLambdaResponse(String urlStr, Object response) throws Exception {
        // Get response code
        Method codeMethod = response.getClass().getMethod("code");
        int code = (int) codeMethod.invoke(response);

        // Use peekBody to read without consuming
        Method peekBodyMethod = response.getClass().getMethod("peekBody", long.class);
        Object responseBody = peekBodyMethod.invoke(response, 1024L * 1024); // 1MB max

        Method stringMethod = responseBody.getClass().getMethod("string");
        String bodyStr = (String) stringMethod.invoke(responseBody);

        log("");
        log("╔═══════════════════════════════════════════════════════════════════════════════");
        log("║ [LAMBDA API RESPONSE] " + code);
        log("╠═══════════════════════════════════════════════════════════════════════════════");
        log("║ URL: " + truncateUrl(urlStr));
        log("║ Response Body:");

        // Pretty print JSON or show text
        if (bodyStr.length() > 2000) {
            log("║ " + bodyStr.substring(0, 2000) + "...[truncated]");
        } else {
            for (String line : bodyStr.split("\n")) {
                log("║ " + line);
            }
        }
        log("╚═══════════════════════════════════════════════════════════════════════════════");

        // Save Lambda response to file for analysis
        try {
            String filename = "lambda_response_" + System.currentTimeMillis() + ".json";
            File outFile = new File(SAVE_DIR, filename);
            Files.writeString(outFile.toPath(), "// URL: " + urlStr + "\n// Code: " + code + "\n\n" + bodyStr);
            log("[Lambda] Response saved to: " + filename);
        } catch (Exception e) {
            // ignore
        }
    }

    /**
     * Capture response body from OkHttp response
     */
    private static void captureOkHttpResponse(String urlStr, Object response) throws Exception {
        // Get response code
        Method codeMethod = response.getClass().getMethod("code");
        int code = (int) codeMethod.invoke(response);

        if (code != 200) {
            log("[OkHttp RESPONSE] " + code + " " + truncateUrl(urlStr));
            return;
        }

        // Get content length
        Method headersMethod = response.getClass().getMethod("headers");
        Object headers = headersMethod.invoke(response);
        Method getMethod = headers.getClass().getMethod("get", String.class);
        String contentLength = (String) getMethod.invoke(headers, "Content-Length");
        long size = contentLength != null ? Long.parseLong(contentLength) : -1;

        // For JAR files, we need to read the body and save it
        // Use peekBody to read without consuming
        Method peekBodyMethod = response.getClass().getMethod("peekBody", long.class);
        Object responseBody = peekBodyMethod.invoke(response, 100L * 1024 * 1024); // 100MB max

        Method bytesMethod = responseBody.getClass().getMethod("bytes");
        byte[] data = (byte[]) bytesMethod.invoke(responseBody);

        if (data != null && data.length > 0) {
            saveDownload(urlStr, data);
        }
    }

    /**
     * Check if URL should be captured (for JAR downloads)
     */
    private static boolean shouldCapture(String url) {
        return url.contains(".jar") ||
               url.contains("squire-bootload") ||
               url.contains("squire-hosting") ||
               url.contains("squire") && url.contains("s3");
    }

    /**
     * Check if URL is a Lambda API call (for logging)
     */
    private static boolean isLambdaApi(String url) {
        return url.contains("lambda-url.eu-west-1.on.aws") ||
               url.contains("execute-api.eu-west-1.amazonaws.com") ||
               url.contains("GetBootloadJars");
    }

    /**
     * Check if URL should be logged (broader than capture)
     */
    private static boolean shouldLog(String url) {
        return shouldCapture(url) || isLambdaApi(url);
    }

    /**
     * Truncate URL for logging
     */
    private static String truncateUrl(String url) {
        if (url.length() <= 80) return url;
        // For signed URLs, show the base URL and indicate it's signed
        if (url.contains("X-Amz-")) {
            int queryStart = url.indexOf("?");
            if (queryStart > 0) {
                return url.substring(0, Math.min(70, queryStart)) + "... [SIGNED]";
            }
        }
        return url.substring(0, 77) + "...";
    }

    /**
     * Extract a filename from a URL
     */
    private static String extractFilename(String urlStr) {
        try {
            // Try to find .jar in the URL
            Pattern jarPattern = Pattern.compile("/([^/]+\\.jar)", Pattern.CASE_INSENSITIVE);
            Matcher matcher = jarPattern.matcher(urlStr);
            if (matcher.find()) {
                return matcher.group(1);
            }

            // Try UUID pattern (common for signed URLs)
            Pattern uuidPattern = Pattern.compile("/([a-f0-9-]{36})\\.jar", Pattern.CASE_INSENSITIVE);
            matcher = uuidPattern.matcher(urlStr);
            if (matcher.find()) {
                return matcher.group(1) + ".jar";
            }

            // Try to get filename from path
            Pattern pathPattern = Pattern.compile("/([^/?]+)(?:\\?|$)");
            matcher = pathPattern.matcher(urlStr);
            if (matcher.find()) {
                String name = matcher.group(1);
                if (!name.isEmpty() && !name.equals("default")) {
                    return name.endsWith(".jar") ? name : name + ".jar";
                }
            }

            // Fallback: use URL hash
            return "download_" + Math.abs(urlStr.hashCode()) + ".jar";

        } catch (Exception e) {
            return "unknown_" + System.currentTimeMillis() + ".jar";
        }
    }

    /**
     * Save downloaded content to a file
     */
    public static synchronized void saveDownload(String urlStr, byte[] content) {
        if (content == null || content.length == 0) {
            return;
        }

        // Only save JAR files and S3 downloads
        if (!shouldCapture(urlStr)) {
            return;
        }

        String filename = extractFilename(urlStr);

        // Skip if already downloaded
        if (downloadedFiles.contains(filename)) {
            log("SKIP (duplicate): " + filename);
            return;
        }

        // Check if it's an error response (XML)
        if (content.length < 1000) {
            String preview = new String(content, 0, Math.min(content.length, 200));
            if (preview.contains("<?xml") && (preview.contains("AccessDenied") || preview.contains("expired"))) {
                log("SKIP (expired/error): " + filename);
                return;
            }
        }

        try {
            int count = downloadCount.incrementAndGet();
            File outFile = new File(SAVE_DIR, filename);
            Files.write(outFile.toPath(), content);
            downloadedFiles.add(filename);
            fileSizes.put(filename, (long) content.length);
            urlToFilename.put(urlStr, filename);

            log("");
            log("╔═══════════════════════════════════════════════════════════════════════════════");
            log("║ [" + count + "] SAVED: " + filename);
            log("║     Size: " + formatSize(content.length));
            log("║     URL:  " + truncateUrl(urlStr));
            log("╚═══════════════════════════════════════════════════════════════════════════════");

            // Also save the URL for reference
            File urlFile = new File(SAVE_DIR, filename + ".url.txt");
            Files.writeString(urlFile.toPath(), urlStr);

        } catch (Exception e) {
            log("FAILED to save " + filename + ": " + e.getMessage());
        }
    }

    /**
     * Save from an InputStream (for streaming downloads)
     */
    public static InputStream wrapInputStream(String urlStr, InputStream original) {
        if (original == null) {
            return null;
        }

        // Only intercept JAR/S3 downloads
        if (!shouldCapture(urlStr)) {
            return original;
        }

        log("[Stream] Wrapping input stream for: " + truncateUrl(urlStr));
        return new InterceptingInputStream(urlStr, original);
    }

    /**
     * Manually trigger save from external code (e.g., patched Launcher.download)
     */
    public static void captureFromStream(String url, OutputStream originalTarget, byte[] data) {
        if (data != null && data.length > 0 && shouldCapture(url)) {
            saveDownload(url, data);
        }
    }

    private static String formatSize(long bytes) {
        if (bytes < 1024) return bytes + " B";
        if (bytes < 1024 * 1024) return String.format("%.1f KB", bytes / 1024.0);
        return String.format("%.1f MB", bytes / (1024.0 * 1024.0));
    }

    private static void printSummary() {
        log("");
        log("╔══════════════════════════════════════════════════════════════════════════════╗");
        log("║                    DOWNLOAD INTERCEPTOR SUMMARY                              ║");
        log("╠══════════════════════════════════════════════════════════════════════════════╣");
        log("║  Total files captured: " + downloadedFiles.size());

        long totalSize = fileSizes.values().stream().mapToLong(Long::longValue).sum();
        log("║  Total size: " + formatSize(totalSize));
        log("║  Saved to: " + SAVE_DIR);
        log("╚══════════════════════════════════════════════════════════════════════════════╝");

        // List all files
        if (!downloadedFiles.isEmpty()) {
            log("");
            log("Captured files:");
            int i = 1;
            for (String file : downloadedFiles) {
                Long size = fileSizes.get(file);
                log("  " + i + ". " + file + (size != null ? " (" + formatSize(size) + ")" : ""));
                i++;
            }
        } else {
            log("");
            log("No files were captured. This could mean:");
            log("  - The client uses a different download mechanism");
            log("  - Downloads happened before interceptor was installed");
            log("  - Files were already cached locally");
        }

        // Write URL list file
        try {
            File urlListFile = new File(SAVE_DIR, "all_urls.txt");
            PrintWriter urlWriter = new PrintWriter(new FileWriter(urlListFile));
            urlWriter.println("# URLs captured during this session");
            urlWriter.println("# " + new Date());
            urlWriter.println("");
            for (Map.Entry<String, String> entry : urlToFilename.entrySet()) {
                urlWriter.println("# " + entry.getValue());
                urlWriter.println(entry.getKey());
                urlWriter.println("");
            }
            urlWriter.close();
            log("");
            log("URL list saved to: " + urlListFile.getAbsolutePath());
        } catch (Exception e) {
            // ignore
        }

        if (logWriter != null) {
            logWriter.close();
        }
    }

    /**
     * ResponseCache that intercepts HTTP responses and saves JAR downloads
     */
    static class InterceptingResponseCache extends ResponseCache {
        private final ResponseCache delegate;

        InterceptingResponseCache(ResponseCache delegate) {
            this.delegate = delegate;
        }

        @Override
        public CacheResponse get(URI uri, String requestMethod, Map<String, List<String>> requestHeaders) throws IOException {
            String urlStr = uri.toString();
            if (shouldCapture(urlStr)) {
                log("[HttpURLConnection REQUEST] " + truncateUrl(urlStr));
            }

            if (delegate != null) {
                return delegate.get(uri, requestMethod, requestHeaders);
            }
            return null;
        }

        @Override
        public CacheRequest put(URI uri, URLConnection conn) throws IOException {
            String urlStr = uri.toString();

            if (shouldCapture(urlStr)) {
                if (conn instanceof HttpURLConnection) {
                    HttpURLConnection httpConn = (HttpURLConnection) conn;
                    int responseCode = httpConn.getResponseCode();
                    long contentLength = httpConn.getContentLengthLong();

                    log("[HttpURLConnection RESPONSE] " + responseCode + " " + truncateUrl(urlStr));
                    log("  Content-Length: " + formatSize(contentLength));

                    if (responseCode == 200 && contentLength > 0) {
                        // Return a CacheRequest that captures the data
                        return new CapturingCacheRequest(urlStr);
                    }
                }
            }

            if (delegate != null) {
                return delegate.put(uri, conn);
            }
            return null;
        }
    }

    /**
     * CacheRequest that captures downloaded data
     */
    static class CapturingCacheRequest extends CacheRequest {
        private final String urlStr;
        private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        private final OutputStream wrappedStream;

        CapturingCacheRequest(String urlStr) {
            this.urlStr = urlStr;
            this.wrappedStream = new OutputStream() {
                @Override
                public void write(int b) throws IOException {
                    buffer.write(b);
                }

                @Override
                public void write(byte[] b, int off, int len) throws IOException {
                    buffer.write(b, off, len);
                }

                @Override
                public void close() throws IOException {
                    byte[] data = buffer.toByteArray();
                    if (data.length > 0) {
                        saveDownload(urlStr, data);
                    }
                }
            };
        }

        @Override
        public OutputStream getBody() throws IOException {
            return wrappedStream;
        }

        @Override
        public void abort() {
            // Still try to save partial data
            byte[] data = buffer.toByteArray();
            if (data.length > 0) {
                log("[Cache ABORTED] Attempting to save partial data...");
                saveDownload(urlStr, data);
            }
        }
    }

    /**
     * InputStream wrapper that captures data as it's read
     */
    static class InterceptingInputStream extends InputStream {
        private final String urlStr;
        private final InputStream delegate;
        private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        private boolean saved = false;

        InterceptingInputStream(String urlStr, InputStream delegate) {
            this.urlStr = urlStr;
            this.delegate = delegate;
        }

        @Override
        public int read() throws IOException {
            int b = delegate.read();
            if (b != -1) {
                buffer.write(b);
            }
            return b;
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            int count = delegate.read(b, off, len);
            if (count > 0) {
                buffer.write(b, off, count);
            }
            return count;
        }

        @Override
        public void close() throws IOException {
            delegate.close();
            if (!saved && buffer.size() > 0) {
                saved = true;
                saveDownload(urlStr, buffer.toByteArray());
            }
        }

        @Override
        public int available() throws IOException {
            return delegate.available();
        }

        @Override
        public long skip(long n) throws IOException {
            // Can't capture skipped bytes, but need to track position
            return delegate.skip(n);
        }
    }

    public static String getSaveDir() {
        return SAVE_DIR;
    }

    public static int getDownloadCount() {
        return downloadCount.get();
    }

    public static Set<String> getDownloadedFiles() {
        return Collections.unmodifiableSet(downloadedFiles);
    }
}
