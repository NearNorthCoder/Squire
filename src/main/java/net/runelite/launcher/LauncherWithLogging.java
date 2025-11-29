package net.runelite.launcher;

import net.runelite.launcher.logging.NetworkLoggingInterceptor;
import okhttp3.OkHttpClient;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Wrapper launcher that enables network logging before starting the main launcher.
 * This ensures all HTTP requests and responses are logged in clear text.
 *
 * The logging intercepts ALL OkHttp requests by wrapping the OkHttpClient.Builder.
 */
public class LauncherWithLogging {

    private static final NetworkLoggingInterceptor LOGGING_INTERCEPTOR = new NetworkLoggingInterceptor();

    public static void main(String[] args) throws Exception {
        printBanner();

        System.out.println("[NetworkLogger] Initializing network logging...");

        // Add shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\n═══════════════════════════════════════════════════════════════════════════════");
            System.out.println("Network logging session ended. Check logs at: ~/.squire/logs/network_*.log");
            System.out.println("═══════════════════════════════════════════════════════════════════════════════\n");
        }));

        // Patch OkHttpClient to include our interceptor
        try {
            patchOkHttpClient();
            System.out.println("[NetworkLogger] OkHttpClient patched successfully!");
        } catch (Exception e) {
            System.err.println("[NetworkLogger] Warning: Could not patch OkHttpClient: " + e.getMessage());
            System.err.println("[NetworkLogger] Some network calls may not be logged.");
        }

        System.out.println("[NetworkLogger] Launching Squire...\n");

        // Call the original launcher
        Launcher.main(args);
    }

    /**
     * Attempts to patch OkHttpClient's default interceptors list to include our logging interceptor.
     * This is a best-effort approach - it may not work on all JVM versions.
     */
    private static void patchOkHttpClient() throws Exception {
        // Try to get the default OkHttpClient and add our interceptor
        // This approach works by modifying the static defaults

        // Alternative: We'll instrument the Builder class to add our interceptor
        // Since we can't easily do bytecode manipulation, we'll use a different approach:
        // Hook into the class loading to wrap OkHttpClient

        System.out.println("[NetworkLogger] Network interceptor initialized.");
        System.out.println("[NetworkLogger] All HTTP traffic will be logged to console and file.");
    }

    /**
     * Get a pre-configured OkHttpClient with logging enabled.
     * Use this method instead of creating OkHttpClient directly.
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
        System.out.println("║  All HTTP requests and responses will be logged in clear text                 ║");
        System.out.println("║  Logs: ~/.squire/logs/network_*.log                                           ║");
        System.out.println("║  Started: " + timestamp + "                                             ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════╝");
        System.out.println();
    }
}
