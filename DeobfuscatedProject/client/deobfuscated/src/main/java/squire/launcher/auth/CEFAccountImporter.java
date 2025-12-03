/*
 * CEF-based Account Importer
 * Uses embedded Chromium browser for seamless OAuth flow
 * Based on Squire's AccountImporter
 */
package squire.launcher.auth;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import me.friwi.jcefmaven.CefAppBuilder;
import me.friwi.jcefmaven.EnumProgress;
import me.friwi.jcefmaven.MavenCefAppHandlerAdapter;
import okhttp3.*;
import org.cef.CefApp;
import org.cef.CefClient;
import org.cef.browser.CefBrowser;
import org.cef.handler.CefDisplayHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Imports Jagex accounts using an embedded CEF browser.
 * This provides a seamless OAuth experience - user logs in once
 * and the redirect is captured automatically.
 */
public class CEFAccountImporter {

    private static final Logger log = LoggerFactory.getLogger(CEFAccountImporter.class);
    private static final Gson gson = new Gson();

    // OAuth Configuration
    private static final String OAUTH_AUTH_CLIENT_ID = "com_jagex_auth_desktop_launcher";
    private static final String OAUTH_GAME_CLIENT_ID = "1fddee4e-b100-4f4e-b2b0-097f9088f9d2";
    private static final String REDIRECT_URI = "https://secure.runescape.com/m=weblogin/launcher-redirect";
    private static final String REDIRECT_URI_LOCALHOST = "http://localhost";
    private static final String OAUTH_NONCE = "YTYyMTU3ODgtZjlkOC00ZmFkLTk4NmQtZTIzNmY3MmMxOTRj";
    private static final String OAUTH_STATE = "SquireCEF";

    // API Endpoints
    private static final String OAUTH_AUTH_URL = "https://account.jagex.com/oauth2/auth";
    private static final String OAUTH_TOKEN_URL = "https://account.jagex.com/oauth2/token";
    private static final String GAME_SESSION_URL = "https://auth.runescape.com/game-session/v1/sessions";
    private static final String GAME_ACCOUNTS_URL = "https://auth.runescape.com/game-session/v1/accounts";

    // Storage
    private static final File SQUIRE_HOME = new File(System.getProperty("user.home"), ".squire");
    private static final File LAUNCHER_DATA = new File(SQUIRE_HOME, "launcher.dat");

    // State
    private static String idToken = "";
    private static String accessToken = "";
    private static String refreshToken = "";

    /**
     * Import accounts using embedded CEF browser.
     * @param callback Called when import is complete
     */
    public static void importAccounts(Runnable callback) {
        log.info("Starting CEF-based account import...");

        String authUrl = buildAuthUrl();
        log.info("Auth URL: {}", authUrl);

        OkHttpClient client = new OkHttpClient.Builder()
            .followRedirects(false)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .callTimeout(60, TimeUnit.SECONDS)
            .build();

        createCefApp(authUrl, client, callback);
    }

    /**
     * Build initial OAuth URL.
     */
    private static String buildAuthUrl() {
        return OAUTH_AUTH_URL +
            "?auth_method=" +
            "&login_type=" +
            "&flow=launcher" +
            "&response_type=code" +
            "&client_id=" + OAUTH_AUTH_CLIENT_ID +
            "&redirect_uri=" + encodeUrl(REDIRECT_URI) +
            "&prompt=login" +
            "&scope=" + encodeUrl("openid offline gamesso.token.create user.profile.read user.entitlement.read user.game.read user.sku.read") +
            "&state=" + OAUTH_STATE;
    }

    /**
     * Build consent URL for Stage 2.
     */
    private static String buildConsentUrl(String idTokenHint) {
        return OAUTH_AUTH_URL + "?" +
            "id_token_hint=" + encodeUrl(idTokenHint) +
            "&nonce=" + OAUTH_NONCE +
            "&prompt=consent" +
            "&redirect_uri=" + encodeUrl(REDIRECT_URI_LOCALHOST) +
            "&response_type=" + encodeUrl("id_token code") +
            "&state=" + OAUTH_STATE +
            "&client_id=" + OAUTH_GAME_CLIENT_ID +
            "&scope=" + encodeUrl("openid offline");
    }

    /**
     * Create CEF browser and handle OAuth flow.
     */
    private static void createCefApp(String url, OkHttpClient client, Runnable callback) {
        try {
            JFrame frame = new JFrame("Import Jagex Account");
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    try {
                        CefApp.getInstance().dispose();
                    } catch (Exception ex) {
                        log.debug("CEF dispose error: {}", ex.getMessage());
                    } finally {
                        frame.dispose();
                        if (callback != null) callback.run();
                    }
                }
            });

            CefAppBuilder builder = new CefAppBuilder();
            builder.getCefSettings().windowless_rendering_enabled = false;

            builder.setProgressHandler((progress, percent) -> {
                if (progress == EnumProgress.DOWNLOADING && percent == 0.0f) {
                    log.info("Downloading CEF browser package...");
                    SwingUtilities.invokeLater(() ->
                        JOptionPane.showMessageDialog(null,
                            "Downloading browser component...\nThis only happens once.",
                            "CEF Download", JOptionPane.INFORMATION_MESSAGE));
                }
                if (progress == EnumProgress.DOWNLOADING && percent == 100.0f) {
                    log.info("CEF browser package downloaded");
                }
            });

            builder.setAppHandler(new MavenCefAppHandlerAdapter() {
                @Override
                public boolean onBeforeTerminate() {
                    return super.onBeforeTerminate();
                }
            });

            CefApp cefApp = builder.build();
            CefClient browserClient = cefApp.createClient();
            CefBrowser browser = browserClient.createBrowser(url, false, true);

            browserClient.addDisplayHandler(new CefDisplayHandlerAdapter() {
                @Override
                public void onTitleChange(CefBrowser browser, String title) {
                    String currentUrl = browser.getURL();
                    log.debug("URL changed: {}", currentUrl);

                    // Stage 2: Capture localhost redirect with real id_token
                    if (currentUrl.contains("localhost")) {
                        log.info("=== STAGE 2 COMPLETE: Got localhost redirect ===");

                        // Extract id_token from fragment
                        if (currentUrl.contains("id_token=")) {
                            String fragment = currentUrl.contains("#") ?
                                currentUrl.substring(currentUrl.indexOf("#") + 1) : currentUrl;
                            for (String param : fragment.split("&")) {
                                if (param.startsWith("id_token=")) {
                                    idToken = param.substring(9);
                                    if (idToken.contains("&")) idToken = idToken.substring(0, idToken.indexOf("&"));
                                    break;
                                }
                            }
                        }

                        log.info("Real id_token captured: {} chars", idToken.length());

                        // MATCH REAL SQUIRE BEHAVIOR:
                        // 1. Create game session from id_token (gets 22-char sessionId)
                        // 2. Use session to get linked accounts
                        // 3. Store in simple format: ::sessionId:accountId:displayName
                        SwingUtilities.invokeLater(() -> {
                            browser.close(true);
                            frame.setVisible(false);

                            try {
                                // Step 1: Create game session (this uses the id_token)
                                log.info("Creating game session from id_token...");
                                String sessionId = createGameSession(idToken, client);

                                if (sessionId == null || sessionId.isEmpty()) {
                                    showError("Failed to create game session");
                                    if (callback != null) callback.run();
                                    return;
                                }

                                log.info("Game session created: {} chars", sessionId.length());

                                // Step 2: Get linked accounts using the session
                                // Pass idToken (JWT) along with sessionId - client needs JWT for JX_ACCESS_TOKEN
                                getAndSaveAccountsRealFormat(sessionId, idToken, client);

                            } catch (Exception e) {
                                log.error("Failed to import account", e);
                                showError("Failed to import account: " + e.getMessage());
                            }

                            if (callback != null) callback.run();
                        });
                    }

                    // Stage 1: Capture launcher redirect with code
                    // Check if URL STARTS WITH the redirect URI (not just contains - redirect_uri param contains it too!)
                    if (title.contains("Launcher Redirect") || currentUrl.startsWith(REDIRECT_URI)) {
                        log.info("=== STAGE 1 COMPLETE: Got launcher redirect ===");

                        // Extract code from URL
                        String code = null;
                        if (currentUrl.contains("code=")) {
                            String query = currentUrl.contains("?") ?
                                currentUrl.substring(currentUrl.indexOf("?") + 1) : currentUrl;
                            for (String param : query.split("&")) {
                                if (param.startsWith("code=")) {
                                    code = param.substring(5);
                                    if (code.contains("&")) code = code.substring(0, code.indexOf("&"));
                                    if (code.contains("#")) code = code.substring(0, code.indexOf("#"));
                                    break;
                                }
                            }
                        }

                        if (code != null) {
                            log.info("Auth code captured: {}...", code.substring(0, Math.min(20, code.length())));

                            // Exchange code for tokens
                            try {
                                Map<String, Object> tokens = exchangeCodeForTokens(code, client);
                                String firstIdToken = (String) tokens.get("id_token");
                                accessToken = (String) tokens.get("access_token");
                                refreshToken = (String) tokens.get("refresh_token");

                                log.info("Got first id_token: {} chars", firstIdToken != null ? firstIdToken.length() : 0);

                                if (firstIdToken != null) {
                                    // Stage 2: Get real id_token via consent
                                    String consentUrl = buildConsentUrl(firstIdToken);
                                    log.info("Loading consent URL for Stage 2...");
                                    browser.loadURL(consentUrl);
                                }
                            } catch (Exception e) {
                                log.error("Token exchange failed", e);
                                showError("Failed to exchange code: " + e.getMessage());
                            }
                        }
                    }
                }
            });

            frame.add(browser.getUIComponent(), "Center");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.pack();
            frame.setSize(500, 650);
            frame.setVisible(true);

        } catch (Exception e) {
            log.error("Failed to create CEF browser", e);
            showError("Failed to start browser: " + e.getMessage() +
                "\n\nFalling back to system browser...");

            // Fallback to system browser importer
            BrowserAccountImporter.importAccounts(callback);
        }
    }

    /**
     * Exchange auth code for tokens.
     */
    private static Map<String, Object> exchangeCodeForTokens(String code, OkHttpClient client) throws IOException {
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

        try (Response response = client.newCall(request).execute()) {
            String body = response.body().string();
            log.info("Token response: {}", response.code());
            return gson.fromJson(body, new TypeToken<Map<String, Object>>(){}.getType());
        }
    }

    /**
     * Create game session with id_token.
     */
    private static String createGameSession(String idToken, OkHttpClient client) throws IOException {
        String payload = "{\"idToken\":\"" + idToken + "\"}";
        RequestBody body = RequestBody.create(MediaType.parse("application/json"), payload);

        Request request = new Request.Builder()
            .url(GAME_SESSION_URL)
            .post(body)
            .build();

        try (Response response = client.newCall(request).execute()) {
            String responseBody = response.body().string();
            log.info("Session response: {} - {}", response.code(), responseBody);

            Map<String, Object> result = gson.fromJson(responseBody, new TypeToken<Map<String, Object>>(){}.getType());
            return (String) result.get("sessionId");
        }
    }

    /**
     * Get linked accounts and save them.
     */
    private static void getAndSaveAccounts(String sessionId, String accessToken, String refreshToken, OkHttpClient client) {
        try {
            Request request = new Request.Builder()
                .url(GAME_ACCOUNTS_URL)
                .header("Authorization", "Bearer " + sessionId)
                .get()
                .build();

            try (Response response = client.newCall(request).execute()) {
                String body = response.body().string();
                List<Map<String, Object>> accounts = gson.fromJson(body,
                    new TypeToken<List<Map<String, Object>>>(){}.getType());

                log.info("Found {} accounts", accounts.size());

                if (accounts.isEmpty()) {
                    showError("No game accounts found.\nMake sure you have an OSRS character linked.");
                    return;
                }

                int imported = 0;
                for (Map<String, Object> account : accounts) {
                    String accountId = (String) account.get("accountId");
                    String displayName = (String) account.get("displayName");

                    if (displayName == null || displayName.isEmpty()) {
                        displayName = "Account-" + accountId.substring(0, Math.min(8, accountId.length()));
                    }

                    if (saveAccount(sessionId, accessToken, refreshToken, accountId, displayName)) {
                        imported++;
                    }
                }

                int total = countAccounts();
                JOptionPane.showMessageDialog(null,
                    String.format("Imported %d account(s)!\nTotal: %d\n\nUse --jagexlauncher to select account.",
                        imported, total),
                    "Import Complete", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            log.error("Failed to get accounts", e);
            showError("Failed to get accounts: " + e.getMessage());
        }
    }

    /**
     * Save account to launcher.dat
     * Format: ::sessionId:accessToken:refreshToken:accountId:displayName
     */
    private static boolean saveAccount(String sessionId, String accessToken, String refreshToken,
                                        String accountId, String displayName) {
        SQUIRE_HOME.mkdirs();

        // Check if exists
        if (accountExists(accountId)) {
            log.info("Account {} exists, updating", displayName);
            return false;
        }

        try (FileWriter writer = new FileWriter(LAUNCHER_DATA, true)) {
            String accessStr = accessToken != null ? accessToken : "";
            String refreshStr = refreshToken != null ? refreshToken : "";
            writer.write(String.format("::%s:%s:%s:%s:%s%n",
                sessionId, accessStr, refreshStr, accountId, displayName));
            log.info("Saved account: {}", displayName);
            return true;
        } catch (IOException e) {
            log.error("Failed to save account", e);
            return false;
        }
    }

    private static boolean accountExists(String accountId) {
        if (!LAUNCHER_DATA.exists()) return false;
        try (Scanner scanner = new Scanner(LAUNCHER_DATA)) {
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().contains(":" + accountId + ":")) return true;
            }
        } catch (Exception e) { }
        return false;
    }

    private static int countAccounts() {
        if (!LAUNCHER_DATA.exists()) return 0;
        int count = 0;
        try (Scanner scanner = new Scanner(LAUNCHER_DATA)) {
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().startsWith("::")) count++;
            }
        } catch (Exception e) { }
        return count;
    }

    private static String encodeUrl(String s) {
        try {
            return java.net.URLEncoder.encode(s, "UTF-8").replace("+", "%20");
        } catch (Exception e) {
            return s;
        }
    }

    private static void showError(String msg) {
        SwingUtilities.invokeLater(() ->
            JOptionPane.showMessageDialog(null, msg, "Import Error", JOptionPane.ERROR_MESSAGE));
    }

    /**
     * Get linked accounts and save with JWT for JX_ACCESS_TOKEN.
     * Format: ::sessionId:idToken:accountId:displayName (6 parts when split by :)
     *
     * The sessionId is used for JX_SESSION_ID.
     * The idToken (JWT) is used for JX_ACCESS_TOKEN - required by the client!
     */
    private static void getAndSaveAccountsRealFormat(String sessionId, String idToken, OkHttpClient client) {
        try {
            log.info("=== FETCHING ACCOUNTS (WITH JWT FOR ACCESS_TOKEN) ===");
            log.info("Using sessionId as Bearer token: {} chars", sessionId.length());
            log.info("JWT idToken for ACCESS_TOKEN: {} chars", idToken != null ? idToken.length() : 0);

            Request request = new Request.Builder()
                .url(GAME_ACCOUNTS_URL)
                .header("Authorization", "Bearer " + sessionId)
                .get()
                .build();

            try (Response response = client.newCall(request).execute()) {
                String body = response.body().string();
                log.info("Accounts response: {} - {}", response.code(), body);

                if (!response.isSuccessful()) {
                    showError("Failed to get accounts: HTTP " + response.code());
                    return;
                }

                List<Map<String, Object>> accounts = gson.fromJson(body,
                    new TypeToken<List<Map<String, Object>>>(){}.getType());

                log.info("Found {} linked accounts", accounts.size());

                if (accounts.isEmpty()) {
                    showError("No game accounts found.\nMake sure you have an OSRS character linked.");
                    return;
                }

                // Clear existing accounts and write fresh
                SQUIRE_HOME.mkdirs();

                int imported = 0;
                try (FileWriter writer = new FileWriter(LAUNCHER_DATA, false)) {  // false = overwrite
                    for (Map<String, Object> account : accounts) {
                        String accountId = (String) account.get("accountId");
                        String displayName = (String) account.get("displayName");

                        if (displayName == null || displayName.isEmpty()) {
                            displayName = "Account-" + accountId.substring(0, Math.min(8, accountId.length()));
                        }

                        // NEW FORMAT with JWT: ::sessionId:idToken:accountId:displayName
                        // idToken is the JWT needed for JX_ACCESS_TOKEN!
                        String line = String.format("::%s:%s:%s:%s%n", sessionId, idToken, accountId, displayName);
                        writer.write(line);

                        log.info("Saved account: {} (id={}) with JWT ({} chars)", displayName, accountId, idToken != null ? idToken.length() : 0);
                        imported++;
                    }
                }

                log.info("=== IMPORT COMPLETE ===");
                log.info("Saved {} accounts in format ::sessionId:idToken:accountId:displayName", imported);
                log.info("SessionId ({} chars) for JX_SESSION_ID", sessionId.length());
                log.info("JWT idToken ({} chars) for JX_ACCESS_TOKEN", idToken != null ? idToken.length() : 0);

                JOptionPane.showMessageDialog(null,
                    String.format("Imported %d account(s)!\n\nJWT saved for JX_ACCESS_TOKEN.\nSession saved for JX_SESSION_ID.\n\nReady to launch!",
                        imported),
                    "Import Complete", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            log.error("Failed to get/save accounts", e);
            showError("Failed to get accounts: " + e.getMessage());
        }
    }

    /**
     * Extract display name (nickname) from JWT token.
     */
    private static String extractDisplayNameFromJwt(String jwt) {
        try {
            String[] parts = jwt.split("\\.");
            if (parts.length != 3) return null;

            String payload = new String(Base64.getUrlDecoder().decode(parts[1]));
            Map<String, Object> claims = gson.fromJson(payload, new TypeToken<Map<String, Object>>(){}.getType());

            // Try nickname first, then sub
            if (claims.containsKey("nickname")) {
                String nickname = (String) claims.get("nickname");
                // Remove the #xxxx suffix if present
                if (nickname != null && nickname.contains("#")) {
                    nickname = nickname.substring(0, nickname.indexOf("#"));
                }
                return nickname;
            }
            return null;
        } catch (Exception e) {
            log.warn("Failed to extract display name from JWT", e);
            return null;
        }
    }

    /**
     * Extract account ID (sub) from JWT token.
     */
    private static String extractAccountIdFromJwt(String jwt) {
        try {
            String[] parts = jwt.split("\\.");
            if (parts.length != 3) return null;

            String payload = new String(Base64.getUrlDecoder().decode(parts[1]));
            Map<String, Object> claims = gson.fromJson(payload, new TypeToken<Map<String, Object>>(){}.getType());

            if (claims.containsKey("sub")) {
                return (String) claims.get("sub");
            }
            return null;
        } catch (Exception e) {
            log.warn("Failed to extract account ID from JWT", e);
            return null;
        }
    }

    /**
     * Save account directly without calling API.
     * Format: ::sessionId:accessToken:refreshToken:accountId:displayName
     */
    private static boolean saveAccountDirect(String sessionId, String accessToken, String refreshToken,
                                              String accountId, String displayName) {
        SQUIRE_HOME.mkdirs();

        // Remove existing account with same display name
        removeExistingAccount(displayName);

        try (FileWriter writer = new FileWriter(LAUNCHER_DATA, true)) {
            String accessStr = accessToken != null ? accessToken : "";
            String refreshStr = refreshToken != null ? refreshToken : "";
            writer.write(String.format("::%s:%s:%s:%s:%s%n",
                sessionId, accessStr, refreshStr, accountId, displayName));
            log.info("Saved account: {} (id={})", displayName, accountId);
            return true;
        } catch (IOException e) {
            log.error("Failed to save account", e);
            return false;
        }
    }

    /**
     * Remove existing account with given display name.
     */
    private static void removeExistingAccount(String displayName) {
        if (!LAUNCHER_DATA.exists()) return;

        try {
            List<String> lines = new ArrayList<>();
            try (Scanner scanner = new Scanner(LAUNCHER_DATA)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    // Keep line if it doesn't end with this display name
                    if (!line.endsWith(":" + displayName)) {
                        lines.add(line);
                    } else {
                        log.info("Removing existing account: {}", displayName);
                    }
                }
            }

            // Rewrite file
            try (FileWriter writer = new FileWriter(LAUNCHER_DATA)) {
                for (String line : lines) {
                    writer.write(line + "\n");
                }
            }
        } catch (Exception e) {
            log.warn("Failed to remove existing account", e);
        }
    }
}
