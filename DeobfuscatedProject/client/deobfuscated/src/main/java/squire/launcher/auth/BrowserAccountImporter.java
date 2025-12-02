/*
 * Browser-based Account Importer
 * Uses system browser for Jagex OAuth2 authentication
 * Falls back to manual URL entry if port 80 isn't available
 */
package squire.launcher.auth;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Imports Jagex accounts using the system browser for OAuth2.
 * This avoids the JCEF dependency which requires native libraries.
 */
public class BrowserAccountImporter {

    private static final Logger log = LoggerFactory.getLogger(BrowserAccountImporter.class);
    private static final Gson gson = new Gson();

    // OAuth Configuration - must match Jagex's registered values exactly
    private static final String OAUTH_AUTH_CLIENT_ID = "com_jagex_auth_desktop_launcher";
    private static final String OAUTH_SCOPE = "openid offline gamesso.token.create user.profile.read";

    // Jagex-registered redirect URI - MUST be exactly this
    private static final String REDIRECT_URI = "https://secure.runescape.com/m=weblogin/launcher-redirect";

    // API Endpoints
    private static final String OAUTH_AUTH_URL = "https://account.jagex.com/oauth2/auth";
    private static final String OAUTH_TOKEN_URL = "https://account.jagex.com/oauth2/token";
    private static final String GAME_SESSION_URL = "https://auth.runescape.com/game-session/v1/sessions";
    private static final String GAME_ACCOUNTS_URL = "https://auth.runescape.com/game-session/v1/accounts";

    // Squire home
    private static final File SQUIRE_HOME = new File(System.getProperty("user.home"), ".squire");
    private static final File LAUNCHER_DATA = new File(SQUIRE_HOME, "launcher.dat");

    private static OkHttpClient httpClient;

    /**
     * Import Jagex accounts using system browser OAuth flow.
     * Since we can't intercept the redirect, user must copy-paste the final URL.
     *
     * @param callback Called when import completes (success or failure)
     */
    public static void importAccounts(Runnable callback) {
        log.info("Starting browser-based account import...");

        // Initialize HTTP client
        httpClient = new OkHttpClient.Builder()
            .followRedirects(false)
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .build();

        // Build OAuth URL
        String authUrl = buildAuthUrl();
        log.info("Auth URL: {}", authUrl);

        // Open system browser
        boolean browserOpened = openBrowser(authUrl);

        // Show dialog asking user to paste the redirect URL
        SwingUtilities.invokeLater(() -> {
            showManualEntryDialog(browserOpened, authUrl, callback);
        });
    }

    /**
     * Show dialog for manual URL/code entry after browser auth.
     */
    private static void showManualEntryDialog(boolean browserOpened, String authUrl, Runnable callback) {
        String message;
        if (browserOpened) {
            message = "Your browser should open to the Jagex login page.\n\n" +
                "1. Log in with your Jagex account\n" +
                "2. After login, you'll see a page or error (this is normal)\n" +
                "3. Copy the ENTIRE URL from your browser's address bar\n" +
                "4. Paste it below\n\n" +
                "The URL will look like:\n" +
                "https://secure.runescape.com/m=weblogin/launcher-redirect?code=XXXXX";
        } else {
            message = "Could not open browser automatically.\n\n" +
                "Please manually open this URL:\n" + authUrl + "\n\n" +
                "After logging in, copy the redirect URL and paste it below.";
        }

        String input = JOptionPane.showInputDialog(
            null,
            message,
            "Paste Redirect URL",
            JOptionPane.QUESTION_MESSAGE
        );

        if (input == null || input.trim().isEmpty()) {
            log.info("User cancelled import");
            if (callback != null) callback.run();
            return;
        }

        // Process the URL in background thread
        new Thread(() -> {
            try {
                processRedirectUrl(input.trim(), callback);
            } catch (Exception e) {
                log.error("Failed to process URL", e);
                showError("Failed to process URL: " + e.getMessage());
                if (callback != null) callback.run();
            }
        }).start();
    }

    /**
     * Build the OAuth authorization URL.
     */
    private static String buildAuthUrl() {
        return OAUTH_AUTH_URL + "?" +
            "client_id=" + OAUTH_AUTH_CLIENT_ID +
            "&redirect_uri=" + encodeUrl(REDIRECT_URI) +
            "&response_type=code" +
            "&scope=" + encodeUrl(OAUTH_SCOPE) +
            "&state=SquireLocal" +
            "&prompt=login";
    }

    /**
     * Process the redirect URL pasted by user.
     * Extracts auth code and continues the OAuth flow.
     */
    private static void processRedirectUrl(String url, Runnable callback) {
        log.info("=== PROCESSING REDIRECT URL ===");
        log.info("Full URL: {}", url);
        log.info("URL length: {}", url.length());

        try {
            // Extract authorization code from URL
            String code = null;

            // Try query parameter first (?code=XXX)
            if (url.contains("code=")) {
                log.info("Found 'code=' in URL");
                String query = url.contains("?") ? url.substring(url.indexOf("?") + 1) : url;
                log.info("Query string: {}", query);

                // Also handle fragments (#code=XXX)
                if (query.contains("#")) {
                    query = query.replace("#", "&");
                }
                for (String param : query.split("&")) {
                    log.info("Parsing param: {}", param.length() > 50 ? param.substring(0, 50) + "..." : param);
                    if (param.startsWith("code=")) {
                        code = param.substring(5);
                        // Remove any trailing parameters or fragments
                        if (code.contains("&")) code = code.substring(0, code.indexOf("&"));
                        if (code.contains("#")) code = code.substring(0, code.indexOf("#"));
                        log.info("Raw code (before decode): {}", code);
                        code = URLDecoder.decode(code, StandardCharsets.UTF_8.name());
                        log.info("Decoded code: {}", code);
                        break;
                    }
                }
            } else {
                log.error("No 'code=' found in URL!");
            }

            if (code == null || code.isEmpty()) {
                log.error("Code is null or empty!");
                showError("Could not find authorization code in URL.\n\n" +
                    "Make sure you copied the entire URL after logging in.\n" +
                    "It should contain 'code=' in it.");
                if (callback != null) callback.run();
                return;
            }

            log.info("=== AUTH CODE EXTRACTED ===");
            log.info("Code length: {}", code.length());
            log.info("Code preview: {}...", code.substring(0, Math.min(20, code.length())));

            processAuthCode(code, callback);

        } catch (Exception e) {
            log.error("Failed to parse URL", e);
            e.printStackTrace();
            showError("Failed to parse URL: " + e.getMessage());
            if (callback != null) callback.run();
        }
    }

    /**
     * Process the authorization code - exchange for tokens and get accounts.
     */
    private static void processAuthCode(String code, Runnable callback) {
        log.info("=== EXCHANGING AUTH CODE FOR TOKENS ===");
        log.info("Code to exchange: {}...", code.substring(0, Math.min(30, code.length())));

        try {
            // Exchange code for tokens
            log.info("Calling token endpoint: {}", OAUTH_TOKEN_URL);
            log.info("Using client_id: {}", OAUTH_AUTH_CLIENT_ID);
            log.info("Using redirect_uri: {}", REDIRECT_URI);

            Map<String, Object> tokens = exchangeCodeForTokens(code);

            log.info("=== TOKEN RESPONSE ===");
            log.info("Response keys: {}", tokens.keySet());

            if (tokens.containsKey("error")) {
                String error = (String) tokens.get("error");
                String desc = (String) tokens.getOrDefault("error_description", "Unknown error");
                log.error("TOKEN EXCHANGE FAILED!");
                log.error("Error: {}", error);
                log.error("Description: {}", desc);
                showError("Failed to exchange code: " + desc);
                if (callback != null) callback.run();
                return;
            }

            String idToken = (String) tokens.get("id_token");
            String accessToken = (String) tokens.get("access_token");
            String refreshToken = (String) tokens.get("refresh_token");

            log.info("id_token present: {}", idToken != null);
            log.info("access_token present: {}", accessToken != null);
            log.info("refresh_token present: {}", refreshToken != null);

            if (idToken != null) {
                log.info("id_token length: {}", idToken.length());
                log.info("id_token preview: {}...", idToken.substring(0, Math.min(50, idToken.length())));
            }

            if (idToken == null) {
                log.error("NO ID TOKEN IN RESPONSE!");
                log.error("Full response: {}", tokens);
                showError("Failed to get ID token from Jagex.\nThe authorization code may have expired. Please try again.");
                if (callback != null) callback.run();
                return;
            }

            log.info("=== CREATING GAME SESSION ===");
            log.info("Session endpoint: {}", GAME_SESSION_URL);

            // Create game session
            String sessionId = createGameSession(idToken);

            if (sessionId == null) {
                log.error("FAILED TO CREATE GAME SESSION - sessionId is null");
                showError("Failed to create game session");
                if (callback != null) callback.run();
                return;
            }

            log.info("Session created successfully!");
            log.info("Session ID: {}...", sessionId.substring(0, Math.min(20, sessionId.length())));

            log.info("=== GETTING LINKED ACCOUNTS ===");
            log.info("Accounts endpoint: {}", GAME_ACCOUNTS_URL);

            // Get linked accounts
            List<Map<String, Object>> accounts = getLinkedAccounts(sessionId);
            log.info("Found {} linked accounts", accounts.size());

            if (accounts.isEmpty()) {
                log.warn("No accounts found!");
                showError("No game accounts found linked to this Jagex account.\n\n" +
                    "Make sure you have an OSRS character linked to your Jagex account.");
                if (callback != null) callback.run();
                return;
            }

            // Log account details
            for (int i = 0; i < accounts.size(); i++) {
                Map<String, Object> acc = accounts.get(i);
                log.info("Account {}: id={}, displayName={}", i, acc.get("accountId"), acc.get("displayName"));
            }

            // Save accounts
            log.info("=== SAVING ACCOUNTS ===");
            int imported = 0;
            for (Map<String, Object> account : accounts) {
                String accountId = (String) account.get("accountId");
                String displayName = (String) account.get("displayName");

                if (displayName == null || displayName.isEmpty()) {
                    displayName = "Account-" + accountId.substring(0, Math.min(8, accountId.length()));
                }

                log.info("Saving account: {} ({})", displayName, accountId);
                if (saveAccount(sessionId, accountId, displayName)) {
                    imported++;
                    log.info("Successfully saved!");
                } else {
                    log.info("Account already exists or failed to save");
                }
            }

            // Show success
            int total = countSavedAccounts();
            log.info("=== IMPORT COMPLETE ===");
            log.info("Imported: {}, Total: {}", imported, total);

            String message = String.format(
                "Successfully imported %d account(s)!\nTotal saved accounts: %d\n\n" +
                "You can now run with --jagexlauncher to select an account.",
                imported, total
            );
            JOptionPane.showMessageDialog(null, message, "Import Complete", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            log.error("=== EXCEPTION DURING IMPORT ===");
            log.error("Exception type: {}", e.getClass().getName());
            log.error("Exception message: {}", e.getMessage());
            e.printStackTrace();
            showError("Failed to import account: " + e.getMessage());
        } finally {
            if (callback != null) callback.run();
        }
    }

    /**
     * Exchange authorization code for OAuth tokens.
     */
    private static Map<String, Object> exchangeCodeForTokens(String code) throws IOException {
        log.info("Building token request...");

        FormBody formBody = new FormBody.Builder()
            .add("grant_type", "authorization_code")
            .add("client_id", OAUTH_AUTH_CLIENT_ID)
            .add("code", code)
            .add("redirect_uri", REDIRECT_URI)
            .build();

        Request request = new Request.Builder()
            .url(OAUTH_TOKEN_URL)
            .post(formBody)
            .build();

        log.info("Sending token request to: {}", OAUTH_TOKEN_URL);

        try (Response response = httpClient.newCall(request).execute()) {
            int statusCode = response.code();
            String body = response.body().string();

            log.info("Token response status: {}", statusCode);
            log.info("Token response body: {}", body);

            if (statusCode != 200) {
                log.error("Non-200 status code from token endpoint!");
            }

            return gson.fromJson(body, new TypeToken<Map<String, Object>>(){}.getType());
        }
    }

    /**
     * Create a game session with the ID token.
     */
    private static String createGameSession(String idToken) throws IOException {
        String payload = "{\"idToken\":\"" + idToken + "\"}";
        log.info("Session request payload length: {}", payload.length());

        RequestBody body = RequestBody.create(MediaType.parse("application/json"), payload);

        Request request = new Request.Builder()
            .url(GAME_SESSION_URL)
            .post(body)
            .build();

        log.info("Sending session request to: {}", GAME_SESSION_URL);

        try (Response response = httpClient.newCall(request).execute()) {
            int statusCode = response.code();
            String responseBody = response.body().string();

            log.info("Session response status: {}", statusCode);
            log.info("Session response body: {}", responseBody);

            if (statusCode != 200) {
                log.error("Non-200 status from session endpoint!");
                log.error("This likely means the ID token is invalid or expired");
            }

            Map<String, Object> result = gson.fromJson(responseBody, new TypeToken<Map<String, Object>>(){}.getType());

            if (result.containsKey("error")) {
                log.error("Session API returned error: {}", result.get("error"));
                log.error("Error description: {}", result.get("message"));
            }

            return (String) result.get("sessionId");
        }
    }

    /**
     * Get accounts linked to the session.
     */
    private static List<Map<String, Object>> getLinkedAccounts(String sessionId) throws IOException {
        Request request = new Request.Builder()
            .url(GAME_ACCOUNTS_URL)
            .header("Authorization", "Bearer " + sessionId)
            .get()
            .build();

        log.info("Sending accounts request to: {}", GAME_ACCOUNTS_URL);
        log.info("Using session ID: {}...", sessionId.substring(0, Math.min(20, sessionId.length())));

        try (Response response = httpClient.newCall(request).execute()) {
            int statusCode = response.code();
            String body = response.body().string();

            log.info("Accounts response status: {}", statusCode);
            log.info("Accounts response body: {}", body);

            if (statusCode != 200) {
                log.error("Non-200 status from accounts endpoint!");
            }

            return gson.fromJson(body, new TypeToken<List<Map<String, Object>>>(){}.getType());
        }
    }

    /**
     * Save account to launcher.dat
     * Format: ::sessionId:accountId:displayName
     * @return true if saved, false if already exists
     */
    private static boolean saveAccount(String sessionId, String accountId, String displayName) {
        SQUIRE_HOME.mkdirs();

        // Check if account already exists
        if (accountExists(accountId)) {
            log.info("Account {} already exists, updating session", displayName);
            updateAccountSession(accountId, sessionId);
            return false;
        }

        try (FileWriter writer = new FileWriter(LAUNCHER_DATA, true)) {
            writer.write(String.format("::%s:%s:%s%n", sessionId, accountId, displayName));
            return true;
        } catch (IOException e) {
            log.error("Failed to save account", e);
            return false;
        }
    }

    /**
     * Update session ID for existing account.
     */
    private static void updateAccountSession(String accountId, String newSessionId) {
        if (!LAUNCHER_DATA.exists()) return;

        try {
            List<String> lines = new ArrayList<>();
            try (Scanner scanner = new Scanner(LAUNCHER_DATA)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.contains(":" + accountId + ":")) {
                        // Update session ID
                        String[] parts = line.split(":");
                        if (parts.length >= 5) {
                            line = String.format("::%s:%s:%s", newSessionId, parts[3], parts[4]);
                        }
                    }
                    lines.add(line);
                }
            }

            try (FileWriter writer = new FileWriter(LAUNCHER_DATA, false)) {
                for (String line : lines) {
                    writer.write(line + "\n");
                }
            }
        } catch (IOException e) {
            log.error("Failed to update account session", e);
        }
    }

    /**
     * Check if account already exists in launcher.dat
     */
    private static boolean accountExists(String accountId) {
        if (!LAUNCHER_DATA.exists()) return false;

        try (Scanner scanner = new Scanner(LAUNCHER_DATA)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(":" + accountId + ":")) {
                    return true;
                }
            }
        } catch (IOException e) {
            log.error("Failed to check existing accounts", e);
        }
        return false;
    }

    /**
     * Count total saved accounts.
     */
    private static int countSavedAccounts() {
        if (!LAUNCHER_DATA.exists()) return 0;

        int count = 0;
        try (Scanner scanner = new Scanner(LAUNCHER_DATA)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("::")) count++;
            }
        } catch (IOException e) {
            log.error("Failed to count accounts", e);
        }
        return count;
    }

    /**
     * Open URL in system browser.
     */
    private static boolean openBrowser(String url) {
        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(new URI(url));
                return true;
            }

            // Fallback for different OSes
            String os = System.getProperty("os.name").toLowerCase();
            ProcessBuilder pb;
            if (os.contains("win")) {
                pb = new ProcessBuilder("cmd", "/c", "start", "", url);
            } else if (os.contains("mac")) {
                pb = new ProcessBuilder("open", url);
            } else {
                pb = new ProcessBuilder("xdg-open", url);
            }
            pb.start();
            return true;
        } catch (Exception e) {
            log.error("Failed to open browser", e);
            return false;
        }
    }

    /**
     * URL encode a string.
     */
    private static String encodeUrl(String s) {
        try {
            return java.net.URLEncoder.encode(s, StandardCharsets.UTF_8.name()).replace("+", "%20");
        } catch (Exception e) {
            return s;
        }
    }

    /**
     * Show error dialog.
     */
    private static void showError(String message) {
        SwingUtilities.invokeLater(() -> {
            JOptionPane.showMessageDialog(null, message, "Import Error", JOptionPane.ERROR_MESSAGE);
        });
    }
}
