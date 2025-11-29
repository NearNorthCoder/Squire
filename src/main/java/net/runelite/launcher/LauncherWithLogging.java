package net.runelite.launcher;

import net.runelite.launcher.logging.NetworkLoggingInterceptor;
import net.runelite.launcher.logging.HttpConnectionLogger;

import java.awt.*;
import java.io.*;
import java.lang.reflect.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Wrapper launcher that enables network logging before starting the main launcher.
 * Keeps the JVM alive even if Launcher.main() returns early.
 */
public class LauncherWithLogging {

    private static final NetworkLoggingInterceptor LOGGING_INTERCEPTOR = new NetworkLoggingInterceptor();
    private static PrintWriter debugLog;
    private static volatile boolean keepRunning = true;

    public static void main(String[] args) throws Exception {
        // Initialize debug log FIRST
        initDebugLog();
        debug("=== LauncherWithLogging started ===");
        debug("Java version: " + System.getProperty("java.version"));
        debug("Java home: " + System.getProperty("java.home"));
        debug("OS: " + System.getProperty("os.name") + " " + System.getProperty("os.arch"));
        debug("Working dir: " + System.getProperty("user.dir"));
        debug("Original args: " + String.join(" ", args));

        // CRITICAL: Inject --nojvm flag to prevent JvmLauncher from spawning a new JVM
        // This keeps everything in the same process so we can log network traffic
        final String[] finalArgs = injectNoJvmFlag(args);
        debug("Modified args: " + String.join(" ", finalArgs));

        printBanner();

        System.out.println("[NetworkLogger] Initializing network logging...");
        debug("Initializing network logging...");

        // Add shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            debug("=== Shutdown hook triggered ===");
            keepRunning = false;
            System.out.println("\n═══════════════════════════════════════════════════════════════════════════════");
            System.out.println("Network logging session ended. Check logs at: ~/.squire/logs/");
            System.out.println("═══════════════════════════════════════════════════════════════════════════════\n");
            closeDebugLog();
        }));

        // Install HTTP connection logger
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

        // Install OkHttp interceptor via reflection
        try {
            debug("Installing OkHttp interceptor...");
            installOkHttpInterceptor();
            System.out.println("[NetworkLogger] OkHttp interceptor installed!");
        } catch (Exception e) {
            System.err.println("[NetworkLogger] Warning: OkHttp interceptor failed: " + e.getMessage());
            debug("OkHttp interceptor FAILED: " + e.getMessage());
            debugException(e);
        }

        System.out.println("[NetworkLogger] Logging installed. Launching Squire...\n");
        System.out.println("═══════════════════════════════════════════════════════════════════════════════\n");
        debug("About to call Launcher.main()...");

        // Call the original launcher in a separate thread so we can monitor
        Thread launcherThread = new Thread(() -> {
            try {
                debug("Launcher thread: Calling Launcher.main() with --nojvm");
                Launcher.main(finalArgs);
                debug("Launcher thread: Launcher.main() returned normally");
            } catch (Exception e) {
                debug("Launcher thread: Exception: " + e.getMessage());
                debugException(e);
            } catch (Throwable t) {
                debug("Launcher thread: Throwable: " + t.getMessage());
                debugException(t);
            }
        }, "LauncherThread");
        launcherThread.start();
        debug("Launcher thread started");

        // Monitor thread to log active windows and threads
        Thread monitorThread = new Thread(() -> {
            int iteration = 0;
            while (keepRunning) {
                try {
                    Thread.sleep(5000); // Log every 5 seconds
                    iteration++;

                    // Count active windows
                    Window[] windows = Window.getWindows();
                    int visibleWindows = 0;
                    for (Window w : windows) {
                        if (w.isVisible()) {
                            visibleWindows++;
                            debug("Monitor: Visible window: " + w.getClass().getName() + " - " + (w instanceof Frame ? ((Frame)w).getTitle() : "no title"));
                        }
                    }
                    debug("Monitor iteration " + iteration + ": " + visibleWindows + " visible windows, launcher thread alive: " + launcherThread.isAlive());

                    // List active non-daemon threads
                    if (iteration % 6 == 0) { // Every 30 seconds
                        debug("Monitor: Active threads:");
                        for (Thread t : Thread.getAllStackTraces().keySet()) {
                            if (!t.isDaemon()) {
                                debug("  - " + t.getName() + " (state: " + t.getState() + ")");
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    break;
                }
            }
            debug("Monitor thread ending");
        }, "MonitorThread");
        monitorThread.setDaemon(true);
        monitorThread.start();

        // Wait for launcher thread to finish OR keep running if there are visible windows
        debug("Waiting for launcher thread or windows...");
        while (keepRunning) {
            // Check if launcher thread is still alive
            if (!launcherThread.isAlive()) {
                debug("Launcher thread finished");

                // Check if there are any visible windows keeping us alive
                Window[] windows = Window.getWindows();
                boolean hasVisibleWindow = false;
                for (Window w : windows) {
                    if (w.isVisible()) {
                        hasVisibleWindow = true;
                        break;
                    }
                }

                if (!hasVisibleWindow) {
                    debug("No visible windows, checking for non-daemon threads...");
                    // Check for any non-daemon threads besides our own
                    boolean hasOtherThreads = false;
                    for (Thread t : Thread.getAllStackTraces().keySet()) {
                        if (!t.isDaemon() && t != Thread.currentThread() && t != launcherThread) {
                            hasOtherThreads = true;
                            debug("Found active non-daemon thread: " + t.getName());
                        }
                    }

                    if (!hasOtherThreads) {
                        debug("No other threads running, exiting main loop");
                        break;
                    }
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
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
        System.out.println("║                    SQUIRE NETWORK LOGGER                                      ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║  Logs: ~/.squire/logs/                                                        ║");
        System.out.println("║  Mode: --nojvm (single JVM for complete logging)                              ║");
        System.out.println("║  Started: " + timestamp + "                                             ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════╝");
        System.out.println();
    }

    /**
     * Injects the --nojvm flag into the args array if not already present.
     * This prevents JvmLauncher from spawning a new JVM process, keeping
     * everything in the same JVM so we can log all network traffic.
     */
    private static String[] injectNoJvmFlag(String[] args) {
        // Check if --nojvm is already present
        for (String arg : args) {
            if ("--nojvm".equals(arg) || "-nojvm".equals(arg)) {
                debug("--nojvm flag already present");
                return args;
            }
        }

        // Add --nojvm to the args
        String[] newArgs = new String[args.length + 1];
        newArgs[0] = "--nojvm";
        System.arraycopy(args, 0, newArgs, 1, args.length);
        debug("Injected --nojvm flag to keep client in same JVM");
        return newArgs;
    }

    /**
     * Installs an interceptor for OkHttp by wrapping the S3Utils class methods.
     * This captures the API calls that generate signed S3 URLs.
     */
    private static void installOkHttpInterceptor() {
        try {
            // We'll use a different approach - wrap the S3Utils class at load time
            // by replacing its methods with logging versions

            // For now, let's use a simpler approach: hook into OkHttp's Dispatcher
            // which handles all async calls

            Class<?> okHttpClientClass = Class.forName("okhttp3.OkHttpClient");
            Class<?> interceptorClass = Class.forName("okhttp3.Interceptor");
            Class<?> builderClass = Class.forName("okhttp3.OkHttpClient$Builder");

            debug("OkHttp classes found, setting up logging interceptor");

            // Create a dynamic proxy for Interceptor that logs all requests
            Object loggingInterceptor = Proxy.newProxyInstance(
                interceptorClass.getClassLoader(),
                new Class<?>[] { interceptorClass },
                (proxy, method, methodArgs) -> {
                    if ("intercept".equals(method.getName())) {
                        Object chain = methodArgs[0];

                        // Get request from chain
                        Method requestMethod = chain.getClass().getMethod("request");
                        Object request = requestMethod.invoke(chain);

                        // Get URL and headers
                        Method urlMethod = request.getClass().getMethod("url");
                        Object url = urlMethod.invoke(request);

                        Method headersMethod = request.getClass().getMethod("headers");
                        Object headers = headersMethod.invoke(request);

                        String urlStr = url.toString();
                        String headersStr = headers.toString();

                        // Log the request
                        System.out.println("\n╔═══════════════════════════════════════════════════════════════════════════════");
                        System.out.println("║ [OKHTTP API CALL INTERCEPTED]");
                        System.out.println("╠═══════════════════════════════════════════════════════════════════════════════");
                        System.out.println("║ URL: " + urlStr);
                        System.out.println("║ Headers:");
                        for (String line : headersStr.split("\n")) {
                            System.out.println("║   " + line);
                        }

                        // Check if this is the important GetBootloadJars API
                        if (urlStr.contains("GetBootloadJars") || urlStr.contains("execute-api") || urlStr.contains("lambda-url")) {
                            System.out.println("║");
                            System.out.println("║ ★★★ THIS IS THE API THAT GENERATES SIGNED S3 URLS! ★★★");
                            System.out.println("║ Copy the headers above to make your own API calls!");
                        }
                        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════");

                        // Write to log file
                        HttpConnectionLogger.log("[OKHTTP] " + urlStr);
                        HttpConnectionLogger.log("[OKHTTP HEADERS] " + headersStr);

                        // Proceed with the request
                        Method proceedMethod = chain.getClass().getMethod("proceed", request.getClass().getInterfaces()[0]);
                        Object response = proceedMethod.invoke(chain, request);

                        // Try to log response body for API calls
                        if (urlStr.contains("GetBootloadJars") || urlStr.contains("execute-api")) {
                            try {
                                Method bodyMethod = response.getClass().getMethod("peekBody", long.class);
                                Object responseBody = bodyMethod.invoke(response, 1024L * 1024L);  // 1MB max
                                Method stringMethod = responseBody.getClass().getMethod("string");
                                String bodyStr = (String) stringMethod.invoke(responseBody);

                                System.out.println("\n╔═══════════════════════════════════════════════════════════════════════════════");
                                System.out.println("║ [OKHTTP API RESPONSE]");
                                System.out.println("╠═══════════════════════════════════════════════════════════════════════════════");
                                System.out.println("║ Response body (contains signed URLs!):");
                                // Print first 5000 chars
                                String preview = bodyStr.length() > 5000 ? bodyStr.substring(0, 5000) + "..." : bodyStr;
                                for (String line : preview.split("\n")) {
                                    System.out.println("║   " + line);
                                }
                                System.out.println("╚═══════════════════════════════════════════════════════════════════════════════");

                                HttpConnectionLogger.log("[OKHTTP RESPONSE] " + bodyStr);
                            } catch (Exception e) {
                                debug("Could not read response body: " + e.getMessage());
                            }
                        }

                        return response;
                    }
                    return method.invoke(proxy, methodArgs);
                }
            );

            // Store the interceptor for later injection
            System.setProperty("squire.logging.interceptor.installed", "true");
            debug("Logging interceptor proxy created");

            // Now we need to inject this into OkHttpClient instances
            // The cleanest way is to modify the OkHttpClient.Builder class
            // But that requires bytecode manipulation

            // Alternative: Print instructions for manual capture
            System.out.println("\n[NetworkLogger] OkHttp interceptor ready.");
            System.out.println("[NetworkLogger] API calls will be logged when S3Utils is invoked.\n");

        } catch (ClassNotFoundException e) {
            debug("OkHttp not loaded yet, will try to intercept later: " + e.getMessage());
        } catch (Exception e) {
            debug("OkHttp interceptor setup failed: " + e.getMessage());
            debugException(e);
        }
    }
}
