/*
 * Browser-based Account Importer
 * Alternative to JCEF-based importer - uses system browser + local callback server
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
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.List;

/**
 * Imports Jagex accounts using the system browser for OAuth2.
 * This avoids the JCEF dependency which requires native libraries.
 */
public class BrowserAccountImporter {

    private static final Logger log = LoggerFactory.getLogger(BrowserAccountImporter.class);
    private static final Gson gson = new Gson();

    // OAuth Configuration (from deobfuscated SquireAuthHandler)
    private static final String OAUTH_CLIENT_ID = "1fddee4e-b100-4f4e-b2b0-097f9088f9d2";
    private static final String OAUTH_AUTH_CLIENT_ID = "com_jagex_auth_desktop_launcher";
    private static final String OAUTH_SCOPE = "openid offline gamesso.token.create user.profile.read";
    private static final String OAUTH_NONCE = "YWI0MTUzZWYtODQ2My00NWRhLTkyZDktNWI3MmIxNDA1Mzgz";
    private static final String OAUTH_STATE = "SquireLocal";

    // API Endpoints
    private static final String OAUTH_AUTH_URL = "https://account.jagex.com/oauth2/auth";
    private static final String OAUTH_TOKEN_URL = "https://account.jagex.com/oauth2/token";
    private static final String GAME_SESSION_URL = "https://auth.runescape.com/game-session/v1/sessions";
    private static final String GAME_ACCOUNTS_URL = "https://auth.runescape.com/game-session/v1/accounts";

    // Local callback server port
    private static final int CALLBACK_PORT = 8432;
    private static final String REDIRECT_URI = "http://localhost:" + CALLBACK_PORT + "/callback";

    // Squire home
    private static final File SQUIRE_HOME = new File(System.getProperty("user.home"), ".squire");
    private static final File LAUNCHER_DATA = new File(SQUIRE_HOME, "launcher.dat");

    private static OkHttpClient httpClient;

    /**
     * Import Jagex accounts using system browser OAuth flow.
     *
     * @param callback Called when import completes (success or failure)
     */
    public static void importAccounts(Runnable callback) {
        log.info("Starting browser-based account import...");

        // Initialize HTTP client
        httpClient = new OkHttpClient.Builder()
            .followRedirects(false)
            .build();

        // Start callback server in background
        Thread serverThread = new Thread(() -> {
            try {
                runCallbackServer(callback);
            } catch (Exception e) {
                log.error("Callback server error", e);
                showError("Failed to start callback server: " + e.getMessage());
            }
        });
        serverThread.setDaemon(true);
        serverThread.start();

        // Give server time to start
        try { Thread.sleep(500); } catch (InterruptedException ignored) {}

        // Build OAuth URL
        String authUrl = buildAuthUrl();
        log.info("Opening browser for authentication...");
        log.info("Auth URL: {}", authUrl);

        // Open system browser
        if (!openBrowser(authUrl)) {
            showError("Failed to open browser. Please manually visit:\n" + authUrl);
        }

        // Show instruction dialog
        SwingUtilities.invokeLater(() -> {
            JOptionPane.showMessageDialog(
                null,
                "Your browser should open to the Jagex login page.\n\n" +
                "1. Log in with your Jagex account\n" +
                "2. Authorize the application\n" +
                "3. You'll be redirected back automatically\n\n" +
                "Waiting for authentication...",
                "Import Jagex Account",
                JOptionPane.INFORMATION_MESSAGE
            );
        });
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
            "&state=" + OAUTH_STATE +
            "&prompt=login";
    }

    /**
     * Run local HTTP server to receive OAuth callback.
     */
    private static void runCallbackServer(Runnable callback) throws IOException {
        try (ServerSocket server = new ServerSocket(CALLBACK_PORT)) {
            server.setSoTimeout(300000); // 5 minute timeout
            log.info("Callback server listening on port {}", CALLBACK_PORT);

            try (Socket client = server.accept()) {
                BufferedReader reader = new BufferedReader(
                    new InputStreamReader(client.getInputStream())
                );

                // Read HTTP request
                String requestLine = reader.readLine();
                log.info("Received callback: {}", requestLine);

                // Parse authorization code from URL
                String code = null;
                String state = null;
                String error = null;

                if (requestLine != null && requestLine.startsWith("GET /callback")) {
                    String queryString = requestLine.split(" ")[1];
                    if (queryString.contains("?")) {
                        String params = queryString.substring(queryString.indexOf("?") + 1);
                        for (String param : params.split("&")) {
                            String[] kv = param.split("=", 2);
                            if (kv.length == 2) {
                                if ("code".equals(kv[0])) code = kv[1];
                                else if ("state".equals(kv[0])) state = kv[1];
                                else if ("error".equals(kv[0])) error = kv[1];
                            }
                        }
                    }
                }

                // Send response to browser
                String responseBody;
                if (code != null) {
                    responseBody = "<html><body><h1>Success!</h1><p>You can close this window.</p></body></html>";
                } else if (error != null) {
                    responseBody = "<html><body><h1>Error</h1><p>" + error + "</p></body></html>";
                } else {
                    responseBody = "<html><body><h1>Error</h1><p>No authorization code received.</p></body></html>";
                }

                PrintWriter writer = new PrintWriter(client.getOutputStream());
                writer.println("HTTP/1.1 200 OK");
                writer.println("Content-Type: text/html");
                writer.println("Content-Length: " + responseBody.length());
                writer.println("Connection: close");
                writer.println();
                writer.print(responseBody);
                writer.flush();

                // Process the authorization code
                if (code != null) {
                    processAuthCode(code, callback);
                } else {
                    log.error("No authorization code received. Error: {}", error);
                    showError("Authentication failed: " + (error != null ? error : "Unknown error"));
                    if (callback != null) callback.run();
                }
            }
        }
    }

    /**
     * Process the authorization code - exchange for tokens and get accounts.
     */
    private static void processAuthCode(String code, Runnable callback) {
        log.info("Processing authorization code...");

        try {
            // Exchange code for tokens
            Map<String, Object> tokens = exchangeCodeForTokens(code);
            String idToken = (String) tokens.get("id_token");
            String accessToken = (String) tokens.get("access_token");

            if (idToken == null) {
                log.error("No ID token received");
                showError("Failed to get ID token from Jagex");
                return;
            }

            log.info("Got tokens, creating game session...");

            // Create game session
            String sessionId = createGameSession(idToken);
            if (sessionId == null) {
                log.error("Failed to create game session");
                showError("Failed to create game session");
                return;
            }

            log.info("Session created: {}", sessionId.substring(0, 10) + "...");

            // Get linked accounts
            List<Map<String, Object>> accounts = getLinkedAccounts(sessionId);
            log.info("Found {} linked accounts", accounts.size());

            if (accounts.isEmpty()) {
                showError("No game accounts found linked to this Jagex account.");
                return;
            }

            // Save accounts
            int imported = 0;
            for (Map<String, Object> account : accounts) {
                String accountId = (String) account.get("accountId");
                String displayName = (String) account.get("displayName");

                if (displayName == null || displayName.isEmpty()) {
                    displayName = "Account-" + accountId.substring(0, 8);
                }

                saveAccount(sessionId, accountId, displayName);
                imported++;
                log.info("Imported account: {} ({})", displayName, accountId);
            }

            // Show success
            int total = countSavedAccounts();
            String message = String.format(
                "Successfully imported %d account(s)!\nTotal saved accounts: %d",
                imported, total
            );
            JOptionPane.showMessageDialog(null, message, "Import Complete", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            log.error("Failed to process auth code", e);
            showError("Failed to import account: " + e.getMessage());
        } finally {
            if (callback != null) callback.run();
        }
    }

    /**
     * Exchange authorization code for OAuth tokens.
     */
    private static Map<String, Object> exchangeCodeForTokens(String code) throws IOException {
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

        try (Response response = httpClient.newCall(request).execute()) {
            String body = response.body().string();
            log.debug("Token response: {}", body);
            return gson.fromJson(body, new TypeToken<Map<String, Object>>(){}.getType());
        }
    }

    /**
     * Create a game session with the ID token.
     */
    private static String createGameSession(String idToken) throws IOException {
        String payload = "{\"idToken\":\"" + idToken + "\"}";
        RequestBody body = RequestBody.create(MediaType.parse("application/json"), payload);

        Request request = new Request.Builder()
            .url(GAME_SESSION_URL)
            .post(body)
            .build();

        try (Response response = httpClient.newCall(request).execute()) {
            String responseBody = response.body().string();
            log.debug("Session response: {}", responseBody);
            Map<String, Object> result = gson.fromJson(responseBody, new TypeToken<Map<String, Object>>(){}.getType());
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

        try (Response response = httpClient.newCall(request).execute()) {
            String body = response.body().string();
            log.debug("Accounts response: {}", body);
            return gson.fromJson(body, new TypeToken<List<Map<String, Object>>>(){}.getType());
        }
    }

    /**
     * Save account to launcher.dat
     * Format: ::sessionId:accountId:displayName
     */
    private static void saveAccount(String sessionId, String accountId, String displayName) {
        SQUIRE_HOME.mkdirs();

        // Check if account already exists
        if (accountExists(accountId)) {
            log.info("Account {} already exists, skipping", displayName);
            return;
        }

        try (FileWriter writer = new FileWriter(LAUNCHER_DATA, true)) {
            writer.write(String.format("::%s:%s:%s%n", sessionId, accountId, displayName));
        } catch (IOException e) {
            log.error("Failed to save account", e);
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
                pb = new ProcessBuilder("cmd", "/c", "start", url);
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
