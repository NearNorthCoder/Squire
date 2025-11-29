package net.runelite.launcher.utils;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LinkedTreeMap;
import net.runelite.launcher.Launcher;
import net.runelite.launcher.SquireSplashScreen;
import net.runelite.launcher.beans.BootstrapMode;
import net.runelite.launcher.beans.SignedBsMode;
import okhttp3.*;

import javax.swing.SwingUtilities;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * PATCHED S3Utils - Logs all API calls and responses for debugging.
 * This captures the authentication headers and signed URL responses.
 */
public class S3Utils {

    private static final String API_URL = "https://g0dp8zyku3.execute-api.eu-west-1.amazonaws.com/default/GetBootloadJars";
    private static final String LAMBDA_URL = "https://jyb5ino5ucg4ylf6dhj7xp6lpe0fvycm.lambda-url.eu-west-1.on.aws/";
    private static final String BOOTSTRAP_URL = "https://squire-hosting.s3.eu-west-1.amazonaws.com/bootstrap-%s.json";

    private static PrintWriter apiLogWriter;

    static {
        initApiLog();
    }

    private static void initApiLog() {
        try {
            String userHome = System.getProperty("user.home");
            File logDir = new File(userHome, ".squire/logs");
            if (!logDir.exists()) {
                logDir.mkdirs();
            }
            String timestamp = new SimpleDateFormat("yyyy-MM-dd_HHmmss").format(new Date());
            File apiLogFile = new File(logDir, "api_calls_" + timestamp + ".log");
            apiLogWriter = new PrintWriter(new FileWriter(apiLogFile, true), true);
            System.out.println("[S3Utils] API call log: " + apiLogFile.getAbsolutePath());
        } catch (Exception e) {
            System.err.println("[S3Utils] Failed to create API log: " + e.getMessage());
        }
    }

    private static void logApi(String message) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        String line = "[" + timestamp + "] " + message;
        System.out.println(line);
        if (apiLogWriter != null) {
            apiLogWriter.println(line);
            apiLogWriter.flush();
        }
    }

    public S3Utils() {
    }

    /**
     * PATCHED: Logs all API calls with full headers and responses
     */
    public static SignedBsMode[] getBootstrapMode(String auth) {
        // Log the API call
        logApi("");
        logApi("╔═══════════════════════════════════════════════════════════════════════════════");
        logApi("║ [API CALL] GetBootloadJars");
        logApi("╠═══════════════════════════════════════════════════════════════════════════════");
        logApi("║ URL: " + API_URL);
        logApi("║ ");
        logApi("║ HEADERS (copy these to make your own API calls!):");
        logApi("║   x-authentication-key: " + auth);
        logApi("║   x-hardware-id: launcher_id");
        logApi("║   Accept: application/json");
        logApi("╚═══════════════════════════════════════════════════════════════════════════════");

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(API_URL)
                .header("x-authentication-key", auth)
                .header("x-hardware-id", "launcher_id")
                .header("Accept", "application/json")
                .build();

        try (Response response = client.newCall(request).execute()) {
            ResponseBody body = response.body();

            logApi("");
            logApi("╔═══════════════════════════════════════════════════════════════════════════════");
            logApi("║ [API RESPONSE] GetBootloadJars");
            logApi("╠═══════════════════════════════════════════════════════════════════════════════");
            logApi("║ Status: " + response.code() + " " + response.message());
            logApi("║ Successful: " + response.isSuccessful());

            if (!response.isSuccessful() || body == null) {
                logApi("║ ERROR: Request failed or empty body");
                logApi("╚═══════════════════════════════════════════════════════════════════════════════");
                return null;
            }

            String json = body.string();

            logApi("║ ");
            logApi("║ RESPONSE BODY (contains signed S3 URLs!):");
            logApi("║ ────────────────────────────────────────────────────────────────────────────");

            // Pretty print the JSON
            for (String line : json.split(",")) {
                logApi("║   " + line.trim());
            }

            logApi("╚═══════════════════════════════════════════════════════════════════════════════");
            logApi("");

            // Also write raw JSON to separate file for easy parsing
            try {
                String userHome = System.getProperty("user.home");
                File jsonFile = new File(userHome, ".squire/logs/api_response_" +
                    new SimpleDateFormat("HHmmss").format(new Date()) + ".json");
                PrintWriter jsonWriter = new PrintWriter(new FileWriter(jsonFile));
                jsonWriter.println(json);
                jsonWriter.close();
                logApi("[S3Utils] Raw JSON saved to: " + jsonFile.getAbsolutePath());
            } catch (Exception e) {
                // ignore
            }

            return new Gson().fromJson(json, SignedBsMode[].class);

        } catch (IOException e) {
            logApi("║ EXCEPTION: " + e.getMessage());
            logApi("╚═══════════════════════════════════════════════════════════════════════════════");
            throw new RuntimeException(e);
        }
    }

    /**
     * PATCHED: Logs getBootstrapModes calls
     */
    public static Map<String, BootstrapMode> getBootstrapModes() {
        logApi("");
        logApi("╔═══════════════════════════════════════════════════════════════════════════════");
        logApi("║ [API CALL] getBootstrapModes");
        logApi("╚═══════════════════════════════════════════════════════════════════════════════");

        try {
            MediaType mediaType = MediaType.parse("text/plain");
            OkHttpClient client = new OkHttpClient().newBuilder().build();

            String auth = Launcher.getSquireAuth();
            logApi("║ Auth from Launcher: " + auth);

            // This method is more complex, keeping original logic
            // but adding logging throughout

            Request request = new Request.Builder()
                    .url(LAMBDA_URL)
                    .header("auth", auth)
                    .build();

            logApi("║ URL: " + LAMBDA_URL);
            logApi("║ Header auth: " + auth);

            try (Response response = client.newCall(request).execute()) {
                ResponseBody body = response.body();

                if (!response.isSuccessful() || body == null) {
                    logApi("║ ERROR: getBootstrapModes failed");
                    return Collections.emptyMap();
                }

                String json = body.string();
                logApi("║ Response: " + json.substring(0, Math.min(500, json.length())));

                List<LinkedTreeMap> codes = new Gson().fromJson(json, List.class);
                Map<String, BootstrapMode> result = new HashMap<>();

                for (LinkedTreeMap ltm : codes) {
                    String label = ltm.get("label").toString().toLowerCase();
                    String code = ltm.get("code").toString();
                    String bootstrapUrl = String.format(BOOTSTRAP_URL, code);
                    result.put(label, new BootstrapMode(label, bootstrapUrl));
                    logApi("║ Mode: " + label + " -> " + bootstrapUrl);
                }

                logApi("╚═══════════════════════════════════════════════════════════════════════════════");
                return result;

            } catch (IOException e) {
                logApi("║ IOException: " + e.getMessage());
                throw new RuntimeException(e);
            }

        } catch (JsonSyntaxException e) {
            logApi("║ JsonSyntaxException: " + e.getMessage());
            System.out.println("Error trying to launch squire using auth " + Launcher.getSquireAuth());

            try {
                SwingUtilities.invokeAndWait(() -> {
                    SquireSplashScreen.init(null);
                    while (!Launcher.authenticated) {
                        if (SquireSplashScreen.getINSTANCE().isShowing()) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }
                });
            } catch (InterruptedException | InvocationTargetException ex) {
                // ignore
            }

            return Collections.emptyMap();
        }
    }
}
