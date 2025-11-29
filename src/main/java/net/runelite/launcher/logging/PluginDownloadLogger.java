package net.runelite.launcher.logging;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * DEDICATED PLUGIN DOWNLOAD LOGGER
 *
 * Creates a specific log file ONLY for plugin/artifact downloads.
 * Separates signed S3 URLs from direct URLs for easy identification.
 *
 * Log files created:
 *   - plugin_downloads_TIMESTAMP.log  (detailed log)
 *   - signed_urls_TIMESTAMP.txt       (copy-paste ready signed URLs)
 *   - direct_urls_TIMESTAMP.txt       (copy-paste ready direct URLs)
 */
public class PluginDownloadLogger {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    private static final SimpleDateFormat FILE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd_HHmmss");

    private static PrintWriter mainLogWriter;
    private static PrintWriter signedUrlWriter;
    private static PrintWriter directUrlWriter;
    private static PrintWriter bootstrapLogWriter;

    private static final Object writerLock = new Object();
    private static final AtomicInteger downloadCount = new AtomicInteger(0);

    // Track downloads by source
    private static final Map<String, String> signedUrls = new ConcurrentHashMap<>();
    private static final Map<String, String> directUrls = new ConcurrentHashMap<>();
    private static final Map<String, Long> fileSizes = new ConcurrentHashMap<>();

    private static String logDir;
    private static boolean initialized = false;

    public static synchronized void initialize() {
        if (initialized) return;

        try {
            String userHome = System.getProperty("user.home");
            File logDirFile = new File(userHome, ".squire/logs/plugins");
            if (!logDirFile.exists()) {
                logDirFile.mkdirs();
            }
            logDir = logDirFile.getAbsolutePath();

            String timestamp = FILE_DATE_FORMAT.format(new Date());

            // Main detailed log
            File mainLogFile = new File(logDirFile, "plugin_downloads_" + timestamp + ".log");
            mainLogWriter = new PrintWriter(new FileWriter(mainLogFile, true), true);

            // Signed URLs only (squire-bootload-storage)
            File signedFile = new File(logDirFile, "signed_urls_" + timestamp + ".txt");
            signedUrlWriter = new PrintWriter(new FileWriter(signedFile, true), true);

            // Direct URLs only (squire-hosting, maven, etc)
            File directFile = new File(logDirFile, "direct_urls_" + timestamp + ".txt");
            directUrlWriter = new PrintWriter(new FileWriter(directFile, true), true);

            // Bootstrap JSON log
            File bootstrapFile = new File(logDirFile, "bootstrap_" + timestamp + ".json");
            bootstrapLogWriter = new PrintWriter(new FileWriter(bootstrapFile, true), true);

            initialized = true;

            // Print header
            String header = "\n" +
                "╔══════════════════════════════════════════════════════════════════════════════╗\n" +
                "║                    PLUGIN DOWNLOAD LOGGER INITIALIZED                        ║\n" +
                "╠══════════════════════════════════════════════════════════════════════════════╣\n" +
                "║  Log directory: " + padRight(logDir, 60) + "║\n" +
                "║                                                                              ║\n" +
                "║  Files created:                                                              ║\n" +
                "║    • plugin_downloads_*.log  - Detailed download log                         ║\n" +
                "║    • signed_urls_*.txt       - Signed S3 URLs (squire-bootload-storage)      ║\n" +
                "║    • direct_urls_*.txt       - Direct URLs (squire-hosting, maven, etc)      ║\n" +
                "║    • bootstrap_*.json        - Raw bootstrap JSON data                       ║\n" +
                "╚══════════════════════════════════════════════════════════════════════════════╝\n";

            System.out.println(header);
            writeMain(header);

            // Add shutdown hook
            Runtime.getRuntime().addShutdownHook(new Thread(PluginDownloadLogger::printSummary));

        } catch (Exception e) {
            System.err.println("[PluginDownloadLogger] Failed to initialize: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }

    /**
     * Log a bootstrap JSON response
     */
    public static void logBootstrap(String modeLabel, String url, String jsonContent) {
        initialize();

        String timestamp = DATE_FORMAT.format(new Date());

        String header = "\n" +
            "╔══════════════════════════════════════════════════════════════════════════════╗\n" +
            "║  BOOTSTRAP JSON RECEIVED                                                     ║\n" +
            "╠══════════════════════════════════════════════════════════════════════════════╣\n" +
            "║  Mode: " + padRight(modeLabel, 68) + "║\n" +
            "║  URL:  " + padRight(url.length() > 68 ? url.substring(0, 65) + "..." : url, 68) + "║\n" +
            "║  Time: " + padRight(timestamp, 68) + "║\n" +
            "╚══════════════════════════════════════════════════════════════════════════════╝\n";

        System.out.println(header);
        writeMain(header);

        // Write raw JSON to bootstrap log
        if (bootstrapLogWriter != null) {
            bootstrapLogWriter.println("// Mode: " + modeLabel);
            bootstrapLogWriter.println("// URL: " + url);
            bootstrapLogWriter.println("// Time: " + timestamp);
            bootstrapLogWriter.println(jsonContent);
            bootstrapLogWriter.println("\n// === END ===\n");
            bootstrapLogWriter.flush();
        }
    }

    /**
     * Log an artifact download start
     */
    public static void logDownloadStart(String name, String url, long size) {
        initialize();

        int count = downloadCount.incrementAndGet();
        String timestamp = DATE_FORMAT.format(new Date());
        boolean isSigned = url.contains("squire-bootload-storage") ||
                           url.contains("X-Amz-Signature") ||
                           url.contains("AWSAccessKeyId");

        String source = isSigned ? "SIGNED (squire-bootload-storage)" : "DIRECT";

        // Track URL by type
        if (isSigned) {
            signedUrls.put(name, url);
        } else {
            directUrls.put(name, url);
        }
        fileSizes.put(name, size);

        // Console output
        String msg = String.format("[%d] %s | %s | %s (%s)",
            count, timestamp, source, name, formatSize(size));
        System.out.println(msg);

        // Detailed log
        String detail = "\n" +
            "┌──────────────────────────────────────────────────────────────────────────────\n" +
            "│ DOWNLOAD #" + count + " @ " + timestamp + "\n" +
            "├──────────────────────────────────────────────────────────────────────────────\n" +
            "│ File:   " + name + "\n" +
            "│ Size:   " + formatSize(size) + " (" + size + " bytes)\n" +
            "│ Source: " + source + "\n" +
            "│ URL:\n" +
            "│   " + url + "\n" +
            "└──────────────────────────────────────────────────────────────────────────────\n";
        writeMain(detail);

        // Write to appropriate URL file
        if (isSigned && signedUrlWriter != null) {
            signedUrlWriter.println("# " + name + " (" + formatSize(size) + ")");
            signedUrlWriter.println(url);
            signedUrlWriter.println();
            signedUrlWriter.flush();
        } else if (directUrlWriter != null) {
            directUrlWriter.println("# " + name + " (" + formatSize(size) + ")");
            directUrlWriter.println(url);
            directUrlWriter.println();
            directUrlWriter.flush();
        }
    }

    /**
     * Log download completion
     */
    public static void logDownloadComplete(String name, boolean success, String error) {
        String timestamp = DATE_FORMAT.format(new Date());
        String status = success ? "✓ SUCCESS" : "✗ FAILED: " + error;

        String msg = "  └─ " + status + " - " + name;
        System.out.println(msg);
        writeMain("[" + timestamp + "] " + msg + "\n");
    }

    /**
     * Log API call (for S3Utils)
     */
    public static void logApiCall(String apiName, String url, Map<String, String> headers) {
        initialize();

        String timestamp = DATE_FORMAT.format(new Date());

        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("╔══════════════════════════════════════════════════════════════════════════════╗\n");
        sb.append("║  API CALL: ").append(padRight(apiName, 64)).append("║\n");
        sb.append("╠══════════════════════════════════════════════════════════════════════════════╣\n");
        sb.append("║  Time: ").append(padRight(timestamp, 68)).append("║\n");
        sb.append("║  URL:  ").append(padRight(url.length() > 68 ? url.substring(0, 65) + "..." : url, 68)).append("║\n");
        sb.append("║                                                                              ║\n");
        sb.append("║  HEADERS (copy these for manual API calls):                                  ║\n");

        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                String headerLine = "  " + entry.getKey() + ": " + entry.getValue();
                sb.append("║  ").append(padRight(headerLine, 74)).append("║\n");
            }
        }

        sb.append("╚══════════════════════════════════════════════════════════════════════════════╝\n");

        String output = sb.toString();
        System.out.println(output);
        writeMain(output);
    }

    /**
     * Log API response
     */
    public static void logApiResponse(String apiName, int statusCode, String responseBody) {
        String timestamp = DATE_FORMAT.format(new Date());

        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("╔══════════════════════════════════════════════════════════════════════════════╗\n");
        sb.append("║  API RESPONSE: ").append(padRight(apiName + " [" + statusCode + "]", 60)).append("║\n");
        sb.append("╠══════════════════════════════════════════════════════════════════════════════╣\n");
        sb.append("║  Time: ").append(padRight(timestamp, 68)).append("║\n");
        sb.append("║                                                                              ║\n");
        sb.append("║  RESPONSE BODY:                                                              ║\n");
        sb.append("╚══════════════════════════════════════════════════════════════════════════════╝\n");
        sb.append(responseBody).append("\n");
        sb.append("════════════════════════════════════════════════════════════════════════════════\n");

        String output = sb.toString();
        System.out.println(output);
        writeMain(output);
    }

    /**
     * Print final summary
     */
    private static void printSummary() {
        if (!initialized) return;

        StringBuilder sb = new StringBuilder();
        sb.append("\n\n");
        sb.append("╔══════════════════════════════════════════════════════════════════════════════╗\n");
        sb.append("║                        PLUGIN DOWNLOAD SUMMARY                               ║\n");
        sb.append("╠══════════════════════════════════════════════════════════════════════════════╣\n");
        sb.append("║  Total downloads: ").append(padRight(String.valueOf(downloadCount.get()), 57)).append("║\n");
        sb.append("║  Signed URLs:     ").append(padRight(String.valueOf(signedUrls.size()), 57)).append("║\n");
        sb.append("║  Direct URLs:     ").append(padRight(String.valueOf(directUrls.size()), 57)).append("║\n");
        sb.append("║                                                                              ║\n");
        sb.append("║  Log files saved to: ").append(padRight(logDir != null ? logDir : "N/A", 54)).append("║\n");
        sb.append("╚══════════════════════════════════════════════════════════════════════════════╝\n");

        // List signed URL files
        if (!signedUrls.isEmpty()) {
            sb.append("\n=== SIGNED URLs (squire-bootload-storage) ===\n");
            for (Map.Entry<String, String> entry : signedUrls.entrySet()) {
                Long size = fileSizes.get(entry.getKey());
                sb.append("\n# ").append(entry.getKey());
                if (size != null) sb.append(" (").append(formatSize(size)).append(")");
                sb.append("\n").append(entry.getValue()).append("\n");
            }
        }

        // List direct URL files
        if (!directUrls.isEmpty()) {
            sb.append("\n=== DIRECT URLs ===\n");
            for (Map.Entry<String, String> entry : directUrls.entrySet()) {
                Long size = fileSizes.get(entry.getKey());
                sb.append("\n# ").append(entry.getKey());
                if (size != null) sb.append(" (").append(formatSize(size)).append(")");
                sb.append("\n").append(entry.getValue()).append("\n");
            }
        }

        String output = sb.toString();
        System.out.println(output);
        writeMain(output);

        // Close writers
        closeWriters();
    }

    private static String formatSize(long bytes) {
        if (bytes < 1024) return bytes + " B";
        if (bytes < 1024 * 1024) return String.format("%.1f KB", bytes / 1024.0);
        return String.format("%.1f MB", bytes / (1024.0 * 1024.0));
    }

    private static void writeMain(String content) {
        synchronized (writerLock) {
            if (mainLogWriter != null) {
                mainLogWriter.print(content);
                mainLogWriter.flush();
            }
        }
    }

    private static void closeWriters() {
        synchronized (writerLock) {
            if (mainLogWriter != null) { mainLogWriter.close(); mainLogWriter = null; }
            if (signedUrlWriter != null) { signedUrlWriter.close(); signedUrlWriter = null; }
            if (directUrlWriter != null) { directUrlWriter.close(); directUrlWriter = null; }
            if (bootstrapLogWriter != null) { bootstrapLogWriter.close(); bootstrapLogWriter = null; }
        }
    }
}
