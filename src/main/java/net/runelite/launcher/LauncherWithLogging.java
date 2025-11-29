package net.runelite.launcher;

import net.runelite.launcher.logging.NetworkLoggingInterceptor;
import net.runelite.launcher.logging.HttpConnectionLogger;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Wrapper launcher that enables network logging before starting the main launcher.
 * Uses ResponseCache hook which is non-invasive and won't break OkHttp.
 */
public class LauncherWithLogging {

    private static final NetworkLoggingInterceptor LOGGING_INTERCEPTOR = new NetworkLoggingInterceptor();
    private static PrintWriter debugLog;

    public static void main(String[] args) throws Exception {
        // Initialize debug log FIRST
        initDebugLog();
        debug("=== LauncherWithLogging started ===");
        debug("Java version: " + System.getProperty("java.version"));
        debug("Java home: " + System.getProperty("java.home"));
        debug("OS: " + System.getProperty("os.name") + " " + System.getProperty("os.arch"));
        debug("Working dir: " + System.getProperty("user.dir"));
        debug("Args: " + String.join(" ", args));

        printBanner();

        System.out.println("[NetworkLogger] Initializing network logging...");
        debug("Initializing network logging...");

        // Add shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            debug("=== Shutdown hook triggered ===");
            System.out.println("\n═══════════════════════════════════════════════════════════════════════════════");
            System.out.println("Network logging session ended. Check logs at: ~/.squire/logs/");
            System.out.println("═══════════════════════════════════════════════════════════════════════════════\n");
            closeDebugLog();
        }));

        // Install HTTP connection logger using ResponseCache (safe, non-invasive)
        try {
            debug("Installing HttpConnectionLogger...");
            HttpConnectionLogger.install();
            System.out.println("[NetworkLogger] ResponseCache logger installed!");
            debug("ResponseCache logger installed successfully");
        } catch (Exception e) {
            System.err.println("[NetworkLogger] Warning: ResponseCache logger failed: " + e.getMessage());
            debug("ResponseCache logger FAILED: " + e.getMessage());
            debugException(e);
        }

        System.out.println("[NetworkLogger] Logging installed. Launching Squire...\n");
        System.out.println("═══════════════════════════════════════════════════════════════════════════════\n");
        debug("About to call Launcher.main()...");

        // Call the original launcher
        try {
            debug("Calling Launcher.main()");
            Launcher.main(args);
            debug("Launcher.main() returned normally");
        } catch (Exception e) {
            System.err.println("[NetworkLogger] Launcher threw exception: " + e.getMessage());
            debug("Launcher.main() threw exception: " + e.getMessage());
            debugException(e);
            throw e;
        } catch (Throwable t) {
            debug("Launcher.main() threw Throwable: " + t.getMessage());
            debugException(t);
            throw t;
        }

        debug("LauncherWithLogging.main() completing...");
    }

    private static void initDebugLog() {
        try {
            String userHome = System.getProperty("user.home");
            File logDir = new File(userHome, ".squire/logs");
            if (!logDir.exists()) {
                logDir.mkdirs();
            }
            String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
            File debugFile = new File(logDir, "debug_" + timestamp + ".log");
            debugLog = new PrintWriter(new FileWriter(debugFile, true), true);
            System.out.println("[NetworkLogger] Debug log: " + debugFile.getAbsolutePath());
        } catch (Exception e) {
            System.err.println("[NetworkLogger] Failed to create debug log: " + e.getMessage());
        }
    }

    private static void debug(String message) {
        String timestamp = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
        String line = "[" + timestamp + "] " + message;
        System.out.println("[DEBUG] " + line);
        if (debugLog != null) {
            debugLog.println(line);
            debugLog.flush();
        }
    }

    private static void debugException(Throwable t) {
        if (debugLog != null) {
            t.printStackTrace(debugLog);
            debugLog.flush();
        }
        t.printStackTrace();
    }

    private static void closeDebugLog() {
        if (debugLog != null) {
            debug("Closing debug log");
            debugLog.close();
        }
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
        System.out.println("║  Logs: ~/.squire/logs/                                                        ║");
        System.out.println("║  Started: " + timestamp + "                                             ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════╝");
        System.out.println();
    }
}
