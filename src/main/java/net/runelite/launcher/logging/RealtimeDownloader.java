package net.runelite.launcher.logging;

import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Real-time JAR downloader that runs alongside the launcher.
 * Monitors logged URLs and downloads them immediately before they expire.
 *
 * This is built into the JAR - no external scripts needed.
 */
public class RealtimeDownloader {

    private static final String SAVE_DIR;
    private static final Set<String> downloadedUrls = ConcurrentHashMap.newKeySet();
    private static final Set<String> downloadedFiles = ConcurrentHashMap.newKeySet();
    private static final ExecutorService downloadExecutor = Executors.newFixedThreadPool(4);
    private static PrintWriter logWriter;
    private static volatile boolean running = true;
    private static int successCount = 0;
    private static int failCount = 0;

    // Patterns for S3 URLs
    private static final Pattern S3_SIGNED_URL = Pattern.compile(
        "https://[^\"\\s]+\\.s3[^\"\\s]*\\.amazonaws\\.com/[^\"\\s]+\\?[^\"\\s]*X-Amz-[^\"\\s]+",
        Pattern.CASE_INSENSITIVE
    );

    private static final Pattern S3_DIRECT_URL = Pattern.compile(
        "https://[^\"\\s]+\\.s3[^\"\\s]*\\.amazonaws\\.com/[^\"\\s]+\\.jar",
        Pattern.CASE_INSENSITIVE
    );

    private static final Pattern SQUIRE_URL = Pattern.compile(
        "https://[^\"\\s]*(squire-bootload|squire-hosting)[^\"\\s]+",
        Pattern.CASE_INSENSITIVE
    );

    static {
        String userHome = System.getProperty("user.home");
        String timestamp = new SimpleDateFormat("yyyy-MM-dd_HHmmss").format(new Date());
        SAVE_DIR = userHome + "/.squire/captured_jars/" + timestamp;

        try {
            Files.createDirectories(Paths.get(SAVE_DIR));
            File logFile = new File(SAVE_DIR, "download_log.txt");
            logWriter = new PrintWriter(new FileWriter(logFile, true), true);
        } catch (Exception e) {
            System.err.println("[RealtimeDownloader] Failed to initialize: " + e.getMessage());
        }
    }

    private static void log(String message) {
        String timestamp = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
        String line = "[" + timestamp + "] " + message;
        System.out.println("[Downloader] " + line);
        if (logWriter != null) {
            logWriter.println(line);
            logWriter.flush();
        }
    }

    /**
     * Start the real-time downloader.
     */
    public static void start() {
        log("");
        log("╔══════════════════════════════════════════════════════════════════════════════╗");
        log("║              REAL-TIME JAR DOWNLOADER ACTIVE                                 ║");
        log("╠══════════════════════════════════════════════════════════════════════════════╣");
        log("║  JARs will be downloaded automatically as URLs are detected                  ║");
        log("║  Saving to: " + SAVE_DIR.substring(Math.max(0, SAVE_DIR.length() - 50)));
        log("╚══════════════════════════════════════════════════════════════════════════════╝");
        log("");

        // Add shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(RealtimeDownloader::shutdown));
    }

    /**
     * Called when a URL is detected in logs - triggers immediate download.
     */
    public static void onUrlDetected(String url) {
        if (url == null || url.isEmpty()) return;

        // Clean URL
        url = url.trim().replaceAll("[\"',>\\s]+$", "");

        // Check if it's a downloadable URL
        if (!isDownloadableUrl(url)) return;

        // Skip if already downloaded
        if (downloadedUrls.contains(url)) return;
        downloadedUrls.add(url);

        final String finalUrl = url;
        downloadExecutor.submit(() -> downloadUrl(finalUrl));
    }

    /**
     * Scan text for URLs and download them.
     */
    public static void scanAndDownload(String text) {
        if (text == null) return;

        Set<String> urls = new HashSet<>();

        // Find signed S3 URLs
        Matcher m1 = S3_SIGNED_URL.matcher(text);
        while (m1.find()) {
            String url = m1.group().replaceAll("[\"',>\\s]+$", "");
            if (url.toLowerCase().contains(".jar") || url.toLowerCase().contains("squire")) {
                urls.add(url);
            }
        }

        // Find direct S3 URLs
        Matcher m2 = S3_DIRECT_URL.matcher(text);
        while (m2.find()) {
            urls.add(m2.group().replaceAll("[\"',>\\s]+$", ""));
        }

        // Find squire URLs
        Matcher m3 = SQUIRE_URL.matcher(text);
        while (m3.find()) {
            String url = m3.group().replaceAll("[\"',>\\s]+$", "");
            if (url.toLowerCase().contains(".jar")) {
                urls.add(url);
            }
        }

        for (String url : urls) {
            onUrlDetected(url);
        }
    }

    private static boolean isDownloadableUrl(String url) {
        String lower = url.toLowerCase();
        return (lower.contains(".jar") || lower.contains("squire-bootload") || lower.contains("squire-hosting"))
            && (lower.contains("s3.") || lower.contains("amazonaws.com"));
    }

    private static String extractFilename(String url) {
        // Try to find .jar filename in path
        Pattern jarPattern = Pattern.compile("/([^/]+\\.jar)", Pattern.CASE_INSENSITIVE);
        Matcher m = jarPattern.matcher(url);
        if (m.find()) {
            return m.group(1);
        }

        // Try UUID pattern
        Pattern uuidPattern = Pattern.compile("/([a-f0-9-]{36})(?:\\.jar)?", Pattern.CASE_INSENSITIVE);
        m = uuidPattern.matcher(url);
        if (m.find()) {
            return m.group(1) + ".jar";
        }

        // Fallback
        return "download_" + Math.abs(url.hashCode()) + ".jar";
    }

    private static void downloadUrl(String url) {
        String filename = extractFilename(url);

        // Skip if we have this file already
        if (downloadedFiles.contains(filename)) {
            return;
        }

        try {
            log("");
            log("╔═══════════════════════════════════════════════════════════════════════════════");
            log("║ DOWNLOADING: " + filename);
            log("╚═══════════════════════════════════════════════════════════════════════════════");

            URL urlObj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) urlObj.openConnection();
            conn.setConnectTimeout(30000);
            conn.setReadTimeout(60000);
            conn.setRequestProperty("User-Agent", "Mozilla/5.0");

            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                log("  [ERROR] HTTP " + responseCode);
                failCount++;
                return;
            }

            int contentLength = conn.getContentLength();
            log("  Size: " + formatSize(contentLength));

            // Read content
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            try (InputStream in = conn.getInputStream()) {
                byte[] chunk = new byte[8192];
                int read;
                while ((read = in.read(chunk)) != -1) {
                    buffer.write(chunk, 0, read);
                }
            }

            byte[] data = buffer.toByteArray();

            // Check for XML error response
            if (data.length < 1000) {
                String preview = new String(data, 0, Math.min(data.length, 200));
                if (preview.contains("<?xml") && (preview.contains("AccessDenied") || preview.contains("expired"))) {
                    log("  [EXPIRED] URL has expired - too late!");
                    failCount++;
                    return;
                }
            }

            // Verify it looks like a JAR
            if (data.length > 2 && data[0] != 'P' || data[1] != 'K') {
                log("  [WARN] File doesn't look like a JAR/ZIP");
            }

            // Save file
            File outFile = new File(SAVE_DIR, filename);
            Files.write(outFile.toPath(), data);
            downloadedFiles.add(filename);
            successCount++;

            log("  [SUCCESS] Saved: " + outFile.getName());
            log("  Total captured: " + successCount + " files");

            // Save URL reference
            File urlFile = new File(SAVE_DIR, filename + ".url");
            Files.writeString(urlFile.toPath(), url);

        } catch (Exception e) {
            log("  [ERROR] " + e.getMessage());
            failCount++;
        }
    }

    private static String formatSize(long bytes) {
        if (bytes < 0) return "unknown";
        if (bytes < 1024) return bytes + " B";
        if (bytes < 1024 * 1024) return String.format("%.1f KB", bytes / 1024.0);
        return String.format("%.1f MB", bytes / (1024.0 * 1024.0));
    }

    private static void shutdown() {
        running = false;
        downloadExecutor.shutdown();

        log("");
        log("╔══════════════════════════════════════════════════════════════════════════════╗");
        log("║                    DOWNLOAD SUMMARY                                          ║");
        log("╠══════════════════════════════════════════════════════════════════════════════╣");
        log("║  Successfully downloaded: " + successCount + " files");
        log("║  Failed/Expired: " + failCount);
        log("║  Saved to: " + SAVE_DIR);
        log("╚══════════════════════════════════════════════════════════════════════════════╝");

        if (!downloadedFiles.isEmpty()) {
            log("");
            log("Downloaded files:");
            int i = 1;
            for (String file : downloadedFiles) {
                log("  " + i + ". " + file);
                i++;
            }
        }

        if (logWriter != null) {
            logWriter.close();
        }
    }

    public static String getSaveDir() {
        return SAVE_DIR;
    }

    public static int getSuccessCount() {
        return successCount;
    }
}
