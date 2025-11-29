package net.runelite.launcher.logging;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Intercepts all HTTP/HTTPS connections made via java.net.URL.
 * Outputs clean, copy-paste friendly URLs for easy sharing.
 */
public class HttpConnectionLogger {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    private static final SimpleDateFormat FILE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd_HHmmss");
    private static final AtomicLong requestCounter = new AtomicLong(0);
    private static PrintWriter logWriter;
    private static PrintWriter urlWriter;  // Separate file for just URLs
    private static final Object writerLock = new Object();

    // Track unique downloads for summary
    private static final Map<String, String> capturedUrls = new ConcurrentHashMap<>();
    private static final Map<String, Long> fileSizes = new ConcurrentHashMap<>();

    static {
        initializeLogWriter();
        // Register shutdown hook to print summary
        Runtime.getRuntime().addShutdownHook(new Thread(HttpConnectionLogger::printFinalSummary));
    }

    private static void initializeLogWriter() {
        try {
            String userHome = System.getProperty("user.home");
            File logDir = new File(userHome, ".squire/logs");
            if (!logDir.exists()) {
                logDir.mkdirs();
            }
            String timestamp = FILE_DATE_FORMAT.format(new Date());

            // Main log file
            File logFile = new File(logDir, "network_" + timestamp + ".log");
            logWriter = new PrintWriter(new FileWriter(logFile, true), true);

            // URL-only file for easy copying
            File urlFile = new File(logDir, "urls_" + timestamp + ".txt");
            urlWriter = new PrintWriter(new FileWriter(urlFile, true), true);

            System.out.println("[HttpLogger] Full log: " + logFile.getAbsolutePath());
            System.out.println("[HttpLogger] URL list: " + urlFile.getAbsolutePath());
        } catch (Exception e) {
            System.err.println("[HttpLogger] Failed to initialize log file: " + e.getMessage());
        }
    }

    public static void install() {
        System.out.println("\n[HttpLogger] Installing HTTP connection logger...");
        System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
        ResponseCache.setDefault(new LoggingResponseCache());
        System.out.println("[HttpLogger] Ready to capture URLs\n");
    }

    /**
     * Logs an HTTP request - outputs clean URL format for easy copying
     */
    public static void logRequest(URL url, String method, Map<String, List<String>> headers) {
        long requestId = requestCounter.incrementAndGet();
        String timestamp = DATE_FORMAT.format(new Date());
        String urlStr = url.toString();

        // TRIGGER AUTOMATIC DOWNLOAD
        RealtimeDownloader.onUrlDetected(urlStr);

        // Extract filename
        String filename = extractFilename(urlStr);

        // Skip duplicate URLs (same file)
        if (filename != null && capturedUrls.containsKey(filename)) {
            return;
        }

        // Store URL
        if (filename != null) {
            capturedUrls.put(filename, urlStr);
        }

        // Print clean output to terminal
        System.out.println("\n┌─────────────────────────────────────────────────────────────");
        System.out.println("│ [" + requestId + "] " + timestamp);
        System.out.println("│ FILE: " + (filename != null ? filename : "unknown"));
        System.out.println("├─────────────────────────────────────────────────────────────");
        System.out.println("│ URL (copy this):");
        System.out.println("│ " + urlStr);
        System.out.println("└─────────────────────────────────────────────────────────────");

        // Write to URL file
        if (urlWriter != null && filename != null) {
            urlWriter.println("# " + filename);
            urlWriter.println(urlStr);
            urlWriter.println();
            urlWriter.flush();
        }

        // Write detailed log
        writeDetailedLog(requestId, timestamp, method, url, headers);
    }

    /**
     * Logs HTTP response and tracks file size
     */
    public static void logResponse(URL url, int responseCode, String responseMessage,
                                    Map<String, List<String>> headers, long contentLength) {
        String filename = extractFilename(url.toString());

        if (filename != null && contentLength > 0) {
            fileSizes.put(filename, contentLength);
            System.out.println("│ ✓ Downloaded: " + filename + " (" + formatSize(contentLength) + ")");
        }

        // Write to main log
        String timestamp = DATE_FORMAT.format(new Date());
        StringBuilder log = new StringBuilder();
        log.append("\n╔═══ RESPONSE ═══════════════════════════════════════════════\n");
        log.append("║ ").append(responseCode).append(" ").append(responseMessage).append("\n");
        log.append("║ URL: ").append(url).append("\n");
        if (contentLength >= 0) {
            log.append("║ Size: ").append(formatSize(contentLength)).append("\n");
        }
        log.append("╚══════════════════════════════════════════════════════════════\n");
        writeToLog(log.toString());
    }

    /**
     * Extract filename from URL
     */
    private static String extractFilename(String url) {
        try {
            // Match .jar files
            int jarIdx = url.indexOf(".jar");
            if (jarIdx > 0) {
                int startIdx = url.lastIndexOf('/', jarIdx);
                if (startIdx >= 0) {
                    return url.substring(startIdx + 1, jarIdx + 4);
                }
            }
        } catch (Exception e) {
            // ignore
        }
        return null;
    }

    /**
     * Format file size in human readable format
     */
    private static String formatSize(long bytes) {
        if (bytes < 1024) return bytes + " B";
        if (bytes < 1024 * 1024) return String.format("%.1f KB", bytes / 1024.0);
        return String.format("%.1f MB", bytes / (1024.0 * 1024.0));
    }

    /**
     * Print final summary with all captured URLs
     */
    private static void printFinalSummary() {
        if (capturedUrls.isEmpty()) {
            return;
        }

        // Separate plugins from dependencies
        Map<String, String> plugins = new TreeMap<>();
        Map<String, String> deps = new TreeMap<>();

        for (Map.Entry<String, String> entry : capturedUrls.entrySet()) {
            if (entry.getKey().startsWith("squire-")) {
                plugins.put(entry.getKey(), entry.getValue());
            } else {
                deps.put(entry.getKey(), entry.getValue());
            }
        }

        StringBuilder summary = new StringBuilder();
        summary.append("\n\n");
        summary.append("╔══════════════════════════════════════════════════════════════════════════════\n");
        summary.append("║                     CAPTURED URLS SUMMARY                                    \n");
        summary.append("║                  Copy everything below this line                             \n");
        summary.append("╠══════════════════════════════════════════════════════════════════════════════\n");
        summary.append("║ Total files: ").append(capturedUrls.size()).append("\n");
        summary.append("║ Plugins: ").append(plugins.size()).append("\n");
        summary.append("║ Dependencies: ").append(deps.size()).append("\n");
        summary.append("╚══════════════════════════════════════════════════════════════════════════════\n\n");

        // Print plugins section
        summary.append("=== PLUGINS ===\n\n");
        for (Map.Entry<String, String> entry : plugins.entrySet()) {
            Long size = fileSizes.get(entry.getKey());
            summary.append("# ").append(entry.getKey());
            if (size != null) {
                summary.append(" (").append(formatSize(size)).append(")");
            }
            summary.append("\n");
            summary.append(entry.getValue()).append("\n\n");
        }

        // Print dependencies section
        summary.append("\n=== DEPENDENCIES ===\n\n");
        for (Map.Entry<String, String> entry : deps.entrySet()) {
            Long size = fileSizes.get(entry.getKey());
            summary.append("# ").append(entry.getKey());
            if (size != null) {
                summary.append(" (").append(formatSize(size)).append(")");
            }
            summary.append("\n");
            summary.append(entry.getValue()).append("\n\n");
        }

        summary.append("╔══════════════════════════════════════════════════════════════════════════════\n");
        summary.append("║                         END OF CAPTURED URLS                                 \n");
        summary.append("╚══════════════════════════════════════════════════════════════════════════════\n");

        String summaryStr = summary.toString();
        System.out.print(summaryStr);
        writeToLog(summaryStr);

        // Also write to URL file
        if (urlWriter != null) {
            urlWriter.print(summaryStr);
            urlWriter.flush();
        }
    }

    /**
     * Call this to print current summary without waiting for shutdown
     */
    public static void printCurrentSummary() {
        printFinalSummary();
    }

    private static void writeDetailedLog(long requestId, String timestamp, String method,
                                          URL url, Map<String, List<String>> headers) {
        StringBuilder log = new StringBuilder();
        log.append("\n╔═══ REQUEST #").append(requestId).append(" @ ").append(timestamp).append(" ═══\n");
        log.append("║ ").append(method).append(" ").append(url).append("\n");
        if (headers != null && !headers.isEmpty()) {
            log.append("║ Headers:\n");
            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                if (entry.getKey() != null) {
                    for (String value : entry.getValue()) {
                        log.append("║   ").append(entry.getKey()).append(": ").append(value).append("\n");
                    }
                }
            }
        }
        log.append("╚══════════════════════════════════════════════════════════════\n");
        writeToLog(log.toString());
    }

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
     * Custom ResponseCache that logs requests
     */
    static class LoggingResponseCache extends ResponseCache {
        @Override
        public CacheResponse get(URI uri, String requestMethod, Map<String, List<String>> requestHeaders) throws IOException {
            try {
                logRequest(uri.toURL(), requestMethod, requestHeaders);
            } catch (Exception e) {
                System.err.println("[HttpLogger] Error logging request: " + e.getMessage());
            }
            return null;
        }

        @Override
        public CacheRequest put(URI uri, URLConnection conn) throws IOException {
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
            return null;
        }
    }
}
