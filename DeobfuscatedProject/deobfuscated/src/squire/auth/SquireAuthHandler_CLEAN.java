/**
 * SquireAuthHandler - Main authentication handler for Squire launcher
 *
 * DEOBFUSCATED VERSION - Original class: c.r.m.a
 *
 * This class handles:
 * - OAuth2 authentication with Jagex accounts
 * - Session management for RuneScape/OSRS
 * - Account import functionality
 * - MFA (2FA) handling (TOTP and email codes)
 */
package squire.auth;

import com.google.gson.Gson;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import javax.swing.JOptionPane;
import okhttp3.*;

public class SquireAuthHandler {

    // ==========================================================================
    // CONSTANTS - Decrypted strings from obfuscated code
    // ==========================================================================

    // OAuth Configuration
    public static final String OAUTH_CLIENT_ID = "1fddee4e-b100-4f4e-b2b0-097f9088f9d2";
    public static final String OAUTH_AUTH_CLIENT_ID = "com_jagex_auth_desktop_launcher";
    public static final String OAUTH_SCOPE = "openid offline";
    public static final String OAUTH_RESPONSE_TYPE = "id_token code";
    public static final String OAUTH_NONCE = "YWI0MTUzZWYtODQ2My00NWRhLTkyZDktNWI3MmIxNDA1Mzgz";
    public static final String OAUTH_STATE = "UcAIZJhXDNKF";

    // API Endpoints
    public static final String OAUTH_TOKEN_URL = "https://account.jagex.com/oauth2/token";
    public static final String OAUTH_AUTH_URL = "https://account.jagex.com/oauth2/auth";
    public static final String OAUTH_REDIRECT_URI = "https://secure.runescape.com/m=weblogin/launcher-redirect";
    public static final String OAUTH_REDIRECT_LOCALHOST = "http://localhost";

    public static final String GAME_SESSION_URL = "https://auth.runescape.com/game-session/v1/sessions";
    public static final String GAME_ACCOUNTS_URL = "https://auth.runescape.com/game-session/v1/accounts";
    public static final String USER_DISPLAYNAME_URL = "https://api.jagex.com/v1/users/%s/displayName";

    public static final String LOGIN_JAGEX_URL = "https://account.jagex.com/api/auth/login/jagex";
    public static final String CONSENT_URL = "https://account.jagex.com/api/auth/consent";
    public static final String SELECT_MFA_URL = "https://account.jagex.com/login/api/auth/login/%s/selectMfa";
    public static final String TOTP_CODE_URL = "https://account.jagex.com/login/api/auth/login/%s/totpCode";
    public static final String EMAIL_CODE_URL = "https://account.jagex.com/login/api/auth/login/%s/emailCode";

    // HTTP Headers
    public static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36";
    public static final String ACCEPT_HEADER = "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9";
    public static final String ACCEPT_ENCODING = "gzip, deflate, br";
    public static final String CONTENT_TYPE_JSON = "application/json";

    // Storage
    public static final String SQUIRE_DIR = ".squire";
    public static final String LAUNCHER_DATA_FILE = "launcher.dat";
    public static final String ACCOUNT_DATA_FORMAT = "::%s:%s:%s\n"; // accountId:displayName:sessionId

    // JSON Keys
    public static final String KEY_ACCESS_TOKEN = "access_token";
    public static final String KEY_ID_TOKEN = "id_token";
    public static final String KEY_SESSION_ID = "sessionId";
    public static final String KEY_ACCOUNT_ID = "accountId";
    public static final String KEY_DISPLAY_NAME = "displayName";
    public static final String KEY_REDIRECT_TO = "redirectTo";
    public static final String KEY_LOCATION = "location";
    public static final String KEY_FLOW_ID = "flowId";
    public static final String KEY_STATE = "state";
    public static final String KEY_DATA = "data";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_AVAILABLE_MFAS = "availableMfas";
    public static final String KEY_TYPE = "type";
    public static final String KEY_ID = "id";

    // MFA Types
    public static final String MFA_STATE_SELECT = "SELECT_MFA";
    public static final String MFA_TYPE_TOTP = "TOTP";
    public static final String NO_DISPLAY_NAME = "NO_DISPLAY_NAME";

    // JSON Payloads
    public static final String PAYLOAD_ID_TOKEN = "{\"idToken\":\"%s\"}";
    public static final String PAYLOAD_CONSENT = "{\"consentChallenge\":\"%s\"}";
    public static final String PAYLOAD_SELECT_TOTP = "{\"id\":\"%s\", \"type\":\"TOTP\"}";
    public static final String PAYLOAD_TOTP_CODE = "{\"totp\":\"%s\"}";
    public static final String PAYLOAD_EMAIL_CODE = "{\"code\":\"%s\"}";
    public static final String PAYLOAD_LOGIN = "{\"email\":\"%s\", \"password\":\"%s\", \"loginChallenge\":\"%s\"}";

    // UI Messages
    public static final String TITLE_IMPORTER = "Squire Jagex Acc Importer";
    public static final String MSG_INVALID_AUTH_CODE = "Invalid authentication code";
    public static final String MSG_INVALID_CREDENTIALS = "Invalid user/pass combination";
    public static final String MSG_ENTER_2FA_CODE = "Please enter the code from your 2FA authenticator";
    public static final String MSG_ENTER_EMAIL_CODE = "Please enter the code sent to your e-mail";
    public static final String MSG_ENTER_EMAIL = "Please enter your e-mail";
    public static final String MSG_ENTER_PASSWORD = "Please enter your password!";
    public static final String MSG_IMPORT_SUCCESS = "Successfully imported %d characters, have a total of %d characters now!";
    public static final String MSG_SELECTED_TOTP = "Selected TOTP as MFA";

    // ==========================================================================
    // INSTANCE FIELDS
    // ==========================================================================

    private static String currentUserId;
    private static final Gson gson = new Gson();
    public static final String squireDir;
    public static final String homeDir;
    public static final String launcherDataPath;

    static {
        homeDir = System.getProperty("user.home");
        squireDir = homeDir + "/" + SQUIRE_DIR + "/";
        launcherDataPath = squireDir + LAUNCHER_DATA_FILE;
    }

    // ==========================================================================
    // OAUTH AUTHENTICATION FLOW
    // ==========================================================================

    /**
     * Exchange authorization code for OAuth tokens
     * POST to https://account.jagex.com/oauth2/token
     */
    public static Map<String, Object> exchangeCodeForTokens(String authCode, OkHttpClient client) {
        FormBody formBody = new FormBody.Builder()
            .add("grant_type", "authorization_code")
            .add("client_id", OAUTH_AUTH_CLIENT_ID)
            .add("code", authCode)
            .add("redirect_uri", OAUTH_REDIRECT_URI)
            .build();

        Request request = new Request.Builder()
            .url(OAUTH_TOKEN_URL)
            .post(formBody)
            .build();

        try (Response response = client.newCall(request).execute()) {
            String body = response.body().string();
            return gson.fromJson(body, Map.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Create game session with ID token
     * POST to https://auth.runescape.com/game-session/v1/sessions
     */
    public static String createGameSession(String idToken, OkHttpClient client) {
        String payload = String.format(PAYLOAD_ID_TOKEN, idToken);
        RequestBody body = RequestBody.create(MediaType.parse(CONTENT_TYPE_JSON), payload);

        Request request = new Request.Builder()
            .url(GAME_SESSION_URL)
            .post(body)
            .build();

        try (Response response = client.newCall(request).execute()) {
            Map<String, Object> result = gson.fromJson(response.body().string(), Map.class);
            return (String) result.get(KEY_SESSION_ID);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get accounts linked to session
     * GET https://auth.runescape.com/game-session/v1/accounts
     */
    public static List<Map<String, Object>> getLinkedAccounts(String sessionId, OkHttpClient client) {
        Request request = new Request.Builder()
            .url(GAME_ACCOUNTS_URL)
            .header("Authorization", String.format("Bearer %s", sessionId))
            .get()
            .build();

        try (Response response = client.newCall(request).execute()) {
            return gson.fromJson(response.body().string(), List.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get display name for a user
     * GET https://api.jagex.com/v1/users/{userId}/displayName
     */
    public static String getDisplayName(String userId, String accessToken, OkHttpClient client) {
        String url = String.format(USER_DISPLAYNAME_URL, userId);

        Request request = new Request.Builder()
            .url(url)
            .header("Authorization", String.format("Bearer %s", accessToken))
            .get()
            .build();

        try (Response response = client.newCall(request).execute()) {
            Map<String, Object> result = gson.fromJson(response.body().string(), Map.class);
            return (String) result.getOrDefault(KEY_DISPLAY_NAME, NO_DISPLAY_NAME);
        } catch (IOException e) {
            return NO_DISPLAY_NAME;
        }
    }

    // ==========================================================================
    // MFA (Two-Factor Authentication) HANDLING
    // ==========================================================================

    /**
     * Handle MFA selection when multiple options available
     */
    public static String handleMfaSelection(Map<String, Object> authData, String flowId, OkHttpClient client) {
        Map<String, Object> data = (Map<String, Object>) authData.get(KEY_DATA);
        List<Map<String, Object>> availableMfas = (List<Map<String, Object>>) data.get(KEY_AVAILABLE_MFAS);

        // Find TOTP option
        String totpId = null;
        for (Map<String, Object> mfa : availableMfas) {
            if (MFA_TYPE_TOTP.equalsIgnoreCase((String) mfa.get(KEY_TYPE))) {
                totpId = (String) mfa.get(KEY_ID);
                break;
            }
        }

        // Select TOTP as MFA method
        String payload = String.format(PAYLOAD_SELECT_TOTP, totpId);
        String url = String.format(SELECT_MFA_URL, flowId);

        RequestBody body = RequestBody.create(MediaType.parse(CONTENT_TYPE_JSON), payload);
        Request request = new Request.Builder()
            .url(url)
            .put(body)
            .build();

        try (Response response = client.newCall(request).execute()) {
            System.out.println(MSG_SELECTED_TOTP);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Prompt for TOTP code
        String totpCode = JOptionPane.showInputDialog(null, MSG_ENTER_2FA_CODE, TITLE_IMPORTER, JOptionPane.QUESTION_MESSAGE);
        return submitTotpCode(flowId, totpCode, client);
    }

    /**
     * Submit TOTP code
     * PUT https://account.jagex.com/login/api/auth/login/{flowId}/totpCode
     */
    public static String submitTotpCode(String flowId, String code, OkHttpClient client) {
        String payload = String.format(PAYLOAD_TOTP_CODE, code);
        String url = String.format(TOTP_CODE_URL, flowId);

        RequestBody body = RequestBody.create(MediaType.parse(CONTENT_TYPE_JSON), payload);
        Request request = new Request.Builder()
            .url(url)
            .put(body)
            .build();

        try (Response response = client.newCall(request).execute()) {
            Map<String, Object> result = gson.fromJson(response.body().string(), Map.class);
            Map<String, Object> data = (Map<String, Object>) result.get(KEY_DATA);
            currentUserId = (String) data.get(KEY_USER_ID);
            return (String) data.get(KEY_REDIRECT_TO);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Submit email verification code
     * PUT https://account.jagex.com/login/api/auth/login/{flowId}/emailCode
     */
    public static String submitEmailCode(String flowId, OkHttpClient client) {
        String code = JOptionPane.showInputDialog(null, MSG_ENTER_EMAIL_CODE, TITLE_IMPORTER, JOptionPane.QUESTION_MESSAGE);
        String payload = String.format(PAYLOAD_EMAIL_CODE, code);
        String url = String.format(EMAIL_CODE_URL, flowId);

        RequestBody body = RequestBody.create(MediaType.parse(CONTENT_TYPE_JSON), payload);
        Request request = new Request.Builder()
            .url(url)
            .put(body)
            .build();

        try (Response response = client.newCall(request).execute()) {
            Map<String, Object> result = gson.fromJson(response.body().string(), Map.class);
            Map<String, Object> data = (Map<String, Object>) result.get(KEY_DATA);
            currentUserId = (String) data.get(KEY_USER_ID);
            return (String) data.get(KEY_REDIRECT_TO);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // ==========================================================================
    // ACCOUNT STORAGE
    // ==========================================================================

    /**
     * Save account data to launcher.dat
     * Format: ::accountId:displayName:sessionId
     */
    public static void saveAccountData(String accountId, String displayName, String sessionId) {
        File dir = new File(squireDir);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        File dataFile = new File(launcherDataPath);
        try (FileWriter writer = new FileWriter(dataFile, true)) {
            String line = String.format(ACCOUNT_DATA_FORMAT, accountId, displayName, sessionId);
            writer.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Load all saved accounts from launcher.dat
     */
    public static List<AccountData> loadSavedAccounts() {
        List<AccountData> accounts = new ArrayList<>();
        File dataFile = new File(launcherDataPath);

        if (!dataFile.exists()) {
            return accounts;
        }

        try (Scanner scanner = new Scanner(dataFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                if (parts.length >= 5) { // Format: ::accountId:displayName:sessionId
                    accounts.add(new AccountData(parts[2], parts[3], parts[4]));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return accounts;
    }

    // ==========================================================================
    // FULL IMPORT FLOW
    // ==========================================================================

    /**
     * Main import method - orchestrates the full OAuth flow
     */
    public static void importAccounts() {
        // Full OAuth2 flow implementation would go here
        // 1. Build OAuth URL with params
        // 2. Open browser/embedded view
        // 3. Handle callback with auth code
        // 4. Exchange code for tokens
        // 5. Create game session
        // 6. Get linked accounts
        // 7. Save to launcher.dat
    }

    /**
     * Build OAuth authorization URL
     */
    public static String buildOAuthUrl() {
        StringBuilder url = new StringBuilder(OAUTH_AUTH_URL);
        url.append("?client_id=").append(OAUTH_CLIENT_ID);
        url.append("&redirect_uri=").append(OAUTH_REDIRECT_LOCALHOST);
        url.append("&response_type=").append(OAUTH_RESPONSE_TYPE.replace(" ", "%20"));
        url.append("&scope=").append(OAUTH_SCOPE.replace(" ", "%20"));
        url.append("&nonce=").append(OAUTH_NONCE);
        url.append("&state=").append(OAUTH_STATE);
        url.append("&prompt=consent");
        return url.toString();
    }

    // ==========================================================================
    // DATA CLASSES
    // ==========================================================================

    public static class AccountData {
        public final String accountId;
        public final String displayName;
        public final String sessionId;

        public AccountData(String accountId, String displayName, String sessionId) {
            this.accountId = accountId;
            this.displayName = displayName != null ? displayName : NO_DISPLAY_NAME;
            this.sessionId = sessionId;
        }

        @Override
        public String toString() {
            return displayName;
        }
    }
}
