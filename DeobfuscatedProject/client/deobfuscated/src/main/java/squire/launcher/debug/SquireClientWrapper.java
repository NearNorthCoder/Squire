/*
 * Squire Client Wrapper
 * Entry point for the subprocess that initializes detailed logging
 * before calling the RuneLite client main method.
 */
package squire.launcher.debug;

import java.io.*;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Wrapper main class that initializes comprehensive logging before
 * launching the RuneLite client. This allows us to capture exactly
 * what happens during Jagex account authentication.
 */
public class SquireClientWrapper {

    private static final File LOG_DIR = new File(System.getProperty("user.home"), ".squire/logs/client");
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
    private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss.SSS");

    private static PrintWriter logWriter;
    private static long startTime;

    /**
     * Main entry point - wraps RuneLite.main() with comprehensive logging
     */
    public static void main(String[] args) {
        try {
            initLogging();

            log("============================================================");
            log("SQUIRE CLIENT WRAPPER - DETAILED DEBUG MODE");
            log("============================================================");
            log("Wrapper started at: " + new Date());
            log("Args: " + Arrays.toString(args));
            log("");

            // Log all system properties
            logSystemProperties();

            // Log all environment variables (especially JX_*)
            logEnvironmentVariables();

            // Install uncaught exception handler
            Thread.setDefaultUncaughtExceptionHandler((t, e) -> {
                log("");
                log("!!! UNCAUGHT EXCEPTION IN THREAD: " + t.getName() + " !!!");
                logException("Uncaught exception", e);
            });

            // Install shutdown hook
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                log("");
                log("============================================================");
                log("SHUTDOWN HOOK TRIGGERED");
                log("============================================================");
                log("Total runtime: " + (System.currentTimeMillis() - startTime) + "ms");
                log("Shutdown reason: JVM is terminating");

                // Dump all threads
                log("");
                log("=== THREAD DUMP AT SHUTDOWN ===");
                for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                    Thread t = entry.getKey();
                    log("Thread: " + t.getName() + " (daemon=" + t.isDaemon() + ", state=" + t.getState() + ")");
                    for (StackTraceElement elem : entry.getValue()) {
                        log("    at " + elem);
                    }
                }

                if (logWriter != null) {
                    logWriter.flush();
                    logWriter.close();
                }
            }));

            log("");
            log("============================================================");
            log("LAUNCHING RUNELITE CLIENT");
            log("============================================================");

            // Try to load and invoke RuneLite.main()
            try {
                log("Loading class: net.runelite.client.RuneLite");
                Class<?> runeLiteClass = Class.forName("net.runelite.client.RuneLite");
                log("Class loaded successfully: " + runeLiteClass);

                log("Getting main method...");
                Method mainMethod = runeLiteClass.getMethod("main", String[].class);
                log("Main method: " + mainMethod);

                log("Invoking main method with args: " + Arrays.toString(args));
                log("--- RuneLite output begins below ---");
                log("");

                mainMethod.invoke(null, (Object) args);

                log("");
                log("--- RuneLite.main() returned normally ---");

            } catch (ClassNotFoundException e) {
                log("ERROR: Could not find RuneLite class!");
                logException("ClassNotFoundException", e);
            } catch (NoSuchMethodException e) {
                log("ERROR: Could not find main method!");
                logException("NoSuchMethodException", e);
            } catch (Exception e) {
                log("ERROR: Exception during RuneLite launch!");
                logException("Launch exception", e);
            }

        } catch (Exception e) {
            System.err.println("[SquireWrapper] FATAL: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Initialize logging to file
     */
    private static void initLogging() {
        try {
            LOG_DIR.mkdirs();
            String timestamp = DATE_FORMAT.format(new Date());
            File logFile = new File(LOG_DIR, "client_debug_" + timestamp + ".log");
            logWriter = new PrintWriter(new BufferedWriter(new FileWriter(logFile)), true);
            startTime = System.currentTimeMillis();

            System.out.println("[SquireWrapper] Log file: " + logFile.getAbsolutePath());

        } catch (Exception e) {
            System.err.println("[SquireWrapper] Failed to init logging: " + e.getMessage());
        }
    }

    /**
     * Log all relevant system properties
     */
    private static void logSystemProperties() {
        log("=== SYSTEM PROPERTIES ===");

        String[] importantProps = {
            "java.version", "java.vendor", "java.home",
            "os.name", "os.arch", "os.version",
            "user.name", "user.home", "user.dir",
            "java.class.path", "java.library.path"
        };

        for (String prop : importantProps) {
            String value = System.getProperty(prop);
            if (prop.equals("java.class.path")) {
                log("  " + prop + ":");
                if (value != null) {
                    for (String path : value.split(File.pathSeparator)) {
                        log("    - " + path);
                    }
                }
            } else {
                log("  " + prop + ": " + value);
            }
        }
        log("");
    }

    /**
     * Log all environment variables, especially JX_* ones
     */
    private static void logEnvironmentVariables() {
        log("=== JAGEX ENVIRONMENT VARIABLES ===");

        Map<String, String> env = System.getenv();

        // First log all JX_* variables
        String[] jxVars = {"JX_SESSION_ID", "JX_ACCESS_TOKEN", "JX_REFRESH_TOKEN",
                          "JX_CHARACTER_ID", "JX_DISPLAY_NAME"};

        for (String var : jxVars) {
            String value = env.get(var);
            if (value != null) {
                log("  " + var + ":");
                log("    Length: " + value.length() + " chars");
                log("    First 30 chars: " + value.substring(0, Math.min(30, value.length())));
                log("    Last 10 chars: " + (value.length() > 10 ? value.substring(value.length() - 10) : value));

                // Special validation
                if (var.equals("JX_SESSION_ID")) {
                    if (value.startsWith("eyJ")) {
                        log("    WARNING: Looks like a JWT (starts with eyJ) - should be 22-char session ID!");
                    } else if (value.length() == 22) {
                        log("    OK: Correct length (22 chars)");
                    } else {
                        log("    WARNING: Unexpected length (expected 22, got " + value.length() + ")");
                    }
                }

                if (var.equals("JX_ACCESS_TOKEN")) {
                    if (value.startsWith("eyJ")) {
                        log("    OK: Looks like a JWT (starts with eyJ)");
                        // Count dots in JWT
                        int dots = value.length() - value.replace(".", "").length();
                        log("    JWT parts: " + (dots + 1) + " (expected 3)");
                    } else {
                        log("    WARNING: Does not look like a JWT!");
                    }
                }
            } else {
                log("  " + var + ": NOT SET");
            }
        }

        log("");
        log("=== VALIDATION SUMMARY ===");

        String sessionId = env.get("JX_SESSION_ID");
        String accessToken = env.get("JX_ACCESS_TOKEN");
        String characterId = env.get("JX_CHARACTER_ID");
        String displayName = env.get("JX_DISPLAY_NAME");

        boolean allGood = true;

        if (sessionId == null || sessionId.isEmpty()) {
            log("  ERROR: JX_SESSION_ID is missing!");
            allGood = false;
        } else if (sessionId.startsWith("eyJ")) {
            log("  ERROR: JX_SESSION_ID contains a JWT instead of session ID!");
            allGood = false;
        } else if (sessionId.length() != 22) {
            log("  WARNING: JX_SESSION_ID is " + sessionId.length() + " chars (expected 22)");
        } else {
            log("  OK: JX_SESSION_ID is valid (22 chars)");
        }

        if (accessToken == null || accessToken.isEmpty()) {
            log("  ERROR: JX_ACCESS_TOKEN is missing!");
            allGood = false;
        } else if (!accessToken.startsWith("eyJ")) {
            log("  ERROR: JX_ACCESS_TOKEN does not look like a JWT!");
            allGood = false;
        } else {
            log("  OK: JX_ACCESS_TOKEN is a JWT (" + accessToken.length() + " chars)");
        }

        if (characterId == null || characterId.isEmpty()) {
            log("  ERROR: JX_CHARACTER_ID is missing!");
            allGood = false;
        } else {
            log("  OK: JX_CHARACTER_ID is set: " + characterId);
        }

        if (displayName == null || displayName.isEmpty()) {
            log("  ERROR: JX_DISPLAY_NAME is missing!");
            allGood = false;
        } else {
            log("  OK: JX_DISPLAY_NAME is set: " + displayName);
        }

        log("");
        if (allGood) {
            log("=== ALL ENVIRONMENT VARIABLES LOOK CORRECT ===");
        } else {
            log("=== PROBLEMS DETECTED IN ENVIRONMENT VARIABLES ===");
        }
        log("");
    }

    /**
     * Log an exception with full stack trace
     */
    private static void logException(String context, Throwable t) {
        log("Exception context: " + context);
        log("Exception type: " + t.getClass().getName());
        log("Exception message: " + t.getMessage());
        log("Stack trace:");

        StringWriter sw = new StringWriter();
        t.printStackTrace(new PrintWriter(sw));
        for (String line : sw.toString().split("\n")) {
            log("  " + line);
        }

        // Log cause chain
        Throwable cause = t.getCause();
        int depth = 0;
        while (cause != null && depth < 10) {
            log("");
            log("Caused by: " + cause.getClass().getName() + ": " + cause.getMessage());
            sw = new StringWriter();
            cause.printStackTrace(new PrintWriter(sw));
            for (String line : sw.toString().split("\n")) {
                log("  " + line);
            }
            cause = cause.getCause();
            depth++;
        }
    }

    /**
     * Log a message with timestamp
     */
    private static void log(String message) {
        String timestamp = TIME_FORMAT.format(new Date());
        long elapsed = System.currentTimeMillis() - startTime;
        String line = String.format("[%s +%dms] %s", timestamp, elapsed, message);

        if (logWriter != null) {
            logWriter.println(line);
            logWriter.flush();
        }

        // Also to console
        System.out.println("[Wrapper] " + message);
    }
}
