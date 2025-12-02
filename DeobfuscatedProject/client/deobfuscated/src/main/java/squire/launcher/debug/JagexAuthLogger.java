/*
 * Jagex Authentication Logger
 * Detailed logging of all authentication and game connection events
 */
package squire.launcher.debug;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Comprehensive logger for Jagex authentication debugging.
 * Logs all network requests, environment variables, and authentication flow.
 */
public class JagexAuthLogger {

    private static final File LOG_DIR = new File(System.getProperty("user.home"), ".squire/logs/auth");
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
    private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss.SSS");

    private static PrintWriter logWriter;
    private static final Map<String, String> capturedEnvVars = new ConcurrentHashMap<>();
    private static long startTime;
    private static volatile boolean initialized = false;

    /**
     * Initialize the logger
     */
    public static synchronized void init() {
        if (initialized) return;

        try {
            LOG_DIR.mkdirs();
            String timestamp = DATE_FORMAT.format(new Date());
            File logFile = new File(LOG_DIR, "jagex_auth_" + timestamp + ".log");
            logWriter = new PrintWriter(new BufferedWriter(new FileWriter(logFile)), true);
            startTime = System.currentTimeMillis();
            initialized = true;

            log("============================================================");
            log("JAGEX AUTHENTICATION DEBUG LOG");
            log("============================================================");
            log("Log started: " + new Date());
            log("Log file: " + logFile.getAbsolutePath());
            log("Java version: " + System.getProperty("java.version"));
            log("OS: " + System.getProperty("os.name") + " " + System.getProperty("os.arch"));
            log("============================================================");

            // Capture and log all JX_* environment variables
            captureJagexEnvVars();

            // Install shutdown hook
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                log("============================================================");
                log("SHUTDOWN - Logger closing");
                log("Total runtime: " + (System.currentTimeMillis() - startTime) + "ms");
                log("============================================================");
                if (logWriter != null) {
                    logWriter.flush();
                    logWriter.close();
                }
            }));

            log("Logger initialized successfully");

        } catch (Exception e) {
            System.err.println("[JagexAuthLogger] Failed to initialize: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Capture all JX_* environment variables
     */
    private static void captureJagexEnvVars() {
        log("");
        log("=== JAGEX ENVIRONMENT VARIABLES ===");

        Map<String, String> env = System.getenv();
        String[] jxVars = {"JX_SESSION_ID", "JX_ACCESS_TOKEN", "JX_REFRESH_TOKEN",
                          "JX_CHARACTER_ID", "JX_DISPLAY_NAME"};

        for (String var : jxVars) {
            String value = env.get(var);
            if (value != null) {
                capturedEnvVars.put(var, value);

                // Log with appropriate masking for sensitive values
                if (var.equals("JX_SESSION_ID")) {
                    log(String.format("  %s: %s (length: %d)", var, maskValue(value), value.length()));
                    log(String.format("    Full value: %s", value));
                    log(String.format("    Is JWT format: %s", value.contains(".") && value.length() > 100));
                    log(String.format("    Is session format: %s", !value.contains(".") && value.length() < 50));
                } else if (var.contains("TOKEN")) {
                    log(String.format("  %s: %s (length: %d)", var, maskValue(value), value.length()));
                    if (value.length() > 0) {
                        log(String.format("    First 50 chars: %s", value.substring(0, Math.min(50, value.length()))));
                    }
                } else {
                    log(String.format("  %s: %s", var, value));
                }
            } else {
                log(String.format("  %s: NOT SET", var));
            }
        }

        // Check for critical issues
        log("");
        log("=== ENVIRONMENT VARIABLE VALIDATION ===");

        String sessionId = env.get("JX_SESSION_ID");
        String accessToken = env.get("JX_ACCESS_TOKEN");

        if (sessionId == null || sessionId.isEmpty()) {
            log("  ERROR: JX_SESSION_ID is missing or empty!");
        } else if (sessionId.startsWith("eyJ")) {
            log("  WARNING: JX_SESSION_ID appears to be a JWT token (starts with eyJ)");
            log("    This should be a 22-char game session ID, not a JWT!");
            log("    Expected format: 22 random characters like 'ABC123xyz...'");
        } else if (sessionId.length() == 22) {
            log("  OK: JX_SESSION_ID is 22 chars (correct game session format)");
        } else {
            log("  WARNING: JX_SESSION_ID is " + sessionId.length() + " chars (expected 22)");
        }

        if (accessToken == null || accessToken.isEmpty()) {
            log("  ERROR: JX_ACCESS_TOKEN is missing or empty!");
        } else if (accessToken.startsWith("eyJ")) {
            log("  OK: JX_ACCESS_TOKEN is a JWT token (correct format)");
        } else {
            log("  WARNING: JX_ACCESS_TOKEN doesn't look like a JWT");
        }

        log("");
    }

    /**
     * Log a network request
     */
    public static void logRequest(String method, String url, Map<String, String> headers, String body) {
        log("");
        log(">>> HTTP REQUEST >>>");
        log("  Method: " + method);
        log("  URL: " + url);

        if (headers != null && !headers.isEmpty()) {
            log("  Headers:");
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                String value = entry.getValue();
                if (entry.getKey().toLowerCase().contains("auth") ||
                    entry.getKey().toLowerCase().contains("token")) {
                    value = maskValue(value);
                }
                log("    " + entry.getKey() + ": " + value);
            }
        }

        if (body != null && !body.isEmpty()) {
            log("  Body length: " + body.length());
            if (body.length() < 500) {
                log("  Body: " + body);
            } else {
                log("  Body (first 500 chars): " + body.substring(0, 500) + "...");
            }
        }
    }

    /**
     * Log a network response
     */
    public static void logResponse(String url, int statusCode, String statusMessage, String body) {
        log("");
        log("<<< HTTP RESPONSE <<<");
        log("  URL: " + url);
        log("  Status: " + statusCode + " " + statusMessage);

        if (body != null && !body.isEmpty()) {
            log("  Body length: " + body.length());
            if (body.length() < 1000) {
                log("  Body: " + body);
            } else {
                log("  Body (first 1000 chars): " + body.substring(0, 1000) + "...");
            }
        }

        // Flag errors
        if (statusCode >= 400) {
            log("  !!! ERROR RESPONSE !!!");
        }
    }

    /**
     * Log a game connection event
     */
    public static void logGameConnection(String event, Object... details) {
        log("");
        log("=== GAME CONNECTION EVENT ===");
        log("  Event: " + event);
        for (int i = 0; i < details.length; i += 2) {
            if (i + 1 < details.length) {
                log("  " + details[i] + ": " + details[i + 1]);
            }
        }
    }

    /**
     * Log an authentication event
     */
    public static void logAuthEvent(String event, String details) {
        log("");
        log("*** AUTH EVENT ***");
        log("  " + event);
        if (details != null && !details.isEmpty()) {
            log("  Details: " + details);
        }
    }

    /**
     * Log an error
     */
    public static void logError(String context, Throwable t) {
        log("");
        log("!!! ERROR !!!");
        log("  Context: " + context);
        log("  Exception: " + t.getClass().getName());
        log("  Message: " + t.getMessage());
        log("  Stack trace:");

        StringWriter sw = new StringWriter();
        t.printStackTrace(new PrintWriter(sw));
        for (String line : sw.toString().split("\n")) {
            log("    " + line);
        }
    }

    /**
     * Log a message with timestamp
     */
    public static void log(String message) {
        if (!initialized) {
            System.out.println("[JagexAuth] " + message);
            return;
        }

        String timestamp = TIME_FORMAT.format(new Date());
        long elapsed = System.currentTimeMillis() - startTime;
        String line = String.format("[%s +%dms] %s", timestamp, elapsed, message);

        // Write to log file
        if (logWriter != null) {
            logWriter.println(line);
            logWriter.flush();
        }

        // Also write to console for visibility
        System.out.println("[JagexAuth] " + message);
    }

    /**
     * Mask sensitive values for logging
     */
    private static String maskValue(String value) {
        if (value == null || value.length() < 10) {
            return "***";
        }
        return value.substring(0, 10) + "..." + value.substring(value.length() - 5);
    }

    /**
     * Get captured environment variable
     */
    public static String getCapturedEnvVar(String name) {
        return capturedEnvVars.get(name);
    }

    /**
     * Dump current state for debugging
     */
    public static void dumpState(String context) {
        log("");
        log("=== STATE DUMP: " + context + " ===");
        log("  Time since start: " + (System.currentTimeMillis() - startTime) + "ms");
        log("  Thread: " + Thread.currentThread().getName());
        log("  Available memory: " + Runtime.getRuntime().freeMemory() / 1024 / 1024 + "MB");

        // Dump captured env vars
        log("  Captured JX_* vars:");
        for (Map.Entry<String, String> entry : capturedEnvVars.entrySet()) {
            log("    " + entry.getKey() + ": " + entry.getValue().length() + " chars");
        }
    }
}
