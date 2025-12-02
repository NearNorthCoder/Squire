/*
 * Deobfuscated from: c/r/m/a.java
 * Original class name: a
 * Purpose: Handles OAuth2/Discord SSO authentication, session management, and profile sync
 */
package squire.launcher.auth;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import okhttp3.CookieJar;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import squire.launcher.util.CookieJarImpl;

/**
 * Manages OAuth2/Discord SSO authentication for the Squire launcher.
 *
 * Handles:
 * - Discord OAuth2 authorization flow
 * - User registration and login
 * - Two-factor authentication (2FA/MFA)
 * - Session token management
 * - Profile synchronization to local file
 */
public class AuthenticationManager {

    // ==================== Static Fields ====================

    /**
     * Current access token for API requests
     */
    private static String accessToken;

    /**
     * Gson instance for JSON parsing
     */
    private static final Gson gson;

    // ==================== API Configuration ====================
    // Note: These constants were encrypted in the original - values shown are descriptive placeholders

    /**
     * Squire API base URL
     */
    public static final String API_BASE_URL;

    /**
     * Discord OAuth2 client ID
     */
    public static final String DISCORD_CLIENT_ID;

    /**
     * Discord OAuth2 redirect URI
     */
    public static final String DISCORD_REDIRECT_URI;

    // ==================== Initialization ====================

    static {
        // Initialize string constants from decryption
        // Original used encrypted strings - these are the functional equivalents
        API_BASE_URL = "https://api.squire.gg";
        DISCORD_CLIENT_ID = "discord-client-id";
        DISCORD_REDIRECT_URI = "https://squire.gg/oauth/callback";
        gson = new Gson();
        accessToken = "";
    }

    // ==================== Public API ====================

    /**
     * Main authentication entry point.
     * Initiates the full OAuth2/Discord SSO flow.
     *
     * Flow:
     * 1. Create CookieJar for session management
     * 2. Get initial OAuth authorization code
     * 3. Register or login user
     * 4. Handle 2FA if required
     * 5. Complete token exchange
     * 6. Fetch and save user profiles
     */
    public static void authenticate() {
        // Create cookie jar for session management
        CookieJarImpl cookieJar = new CookieJarImpl();

        // Build HTTP client with cookie support, no auto-redirects
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .cookieJar(cookieJar)
                .followRedirects(false)
                .build();

        // Step 1: Get initial OAuth authorization code
        String authCode = getInitialAuthCode(httpClient);

        // Step 2: Register or login with authorization code
        Map<String, Object> authResponse = registerOrLogin(httpClient, authCode);
        if (authResponse == null) {
            return;
        }

        // Step 3: Handle 2FA/MFA if required
        String mfaTicket = handleTwoFactorAuth(authResponse, httpClient);
        if (mfaTicket == null) {
            JOptionPane.showMessageDialog(null,
                    "Authentication failed. Unable to complete two-factor authentication.",
                    "Authentication Error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        // Step 4: Follow OAuth redirect and exchange tokens
        String redirectUrl = followOAuthRedirect(mfaTicket, httpClient);
        String tokenUrl = exchangeForTokenUrl(redirectUrl, httpClient);

        // Step 5: Complete token exchange via redirect
        Request tokenRequest = new Request.Builder().url(tokenUrl).build();
        String sessionToken = "";

        try (Response response = httpClient.newCall(tokenRequest).execute()) {
            String locationHeader = response.header("Location");
            sessionToken = locationHeader.split("code=")[1].split("&")[0];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Step 6: Exchange session token for access tokens
        FormBody tokenBody = new FormBody.Builder()
                .add("grant_type", "authorization_code")
                .add("code", sessionToken)
                .add("redirect_uri", DISCORD_REDIRECT_URI)
                .add("client_id", DISCORD_CLIENT_ID)
                .build();

        Request accessTokenRequest = new Request.Builder()
                .url("https://discord.com/api/oauth2/token")
                .post(tokenBody)
                .build();

        String accessTokenValue = "";
        String refreshToken = "";

        try (Response response = httpClient.newCall(accessTokenRequest).execute()) {
            Map<String, Object> tokenResponse = gson.fromJson(response.body().string(), Map.class);
            accessTokenValue = (String) tokenResponse.get("access_token");
            refreshToken = (String) tokenResponse.get("refresh_token");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Step 7: Validate session with Squire API
        validateSession(accessTokenValue, httpClient);

        // Step 8: Perform Discord OAuth flow for additional permissions
        String discordToken = performDiscordOAuth(refreshToken, cookieJar);

        // Step 9: Get final access token
        String finalToken = getFinalAccessToken(discordToken, httpClient);

        // Step 10: Fetch and save user profiles
        fetchAndSaveProfiles(finalToken, httpClient);
    }

    // ==================== OAuth Flow Methods ====================

    /**
     * Gets the initial OAuth authorization code from the auth server.
     *
     * @param httpClient HTTP client to use
     * @return Authorization code from server
     */
    private static String getInitialAuthCode(OkHttpClient httpClient) {
        Request request = new Request.Builder()
                .url("https://api.squire.gg/auth/discord/authorize")
                .header("User-Agent", "Mozilla/5.0")
                .header("Accept", "application/json")
                .header("Origin", "https://squire.gg")
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            String code = response.header("Location").split("=")[1];
            return code;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Registers a new user or logs in existing user.
     *
     * @param httpClient HTTP client to use
     * @param authCode Authorization code from initial auth
     * @return Map containing auth response data
     */
    private static Map<String, Object> registerOrLogin(OkHttpClient httpClient, String authCode) {
        // Prompt for username and password
        String username = JOptionPane.showInputDialog(null,
                "Enter your username:",
                "Login / Register",
                JOptionPane.QUESTION_MESSAGE);

        String password = JOptionPane.showInputDialog(null,
                "Enter your password:",
                "Login / Register",
                JOptionPane.QUESTION_MESSAGE);

        // Build login request body
        String jsonBody = String.format(
                "{\"login\":\"%s\",\"password\":\"%s\",\"auth_code\":\"%s\"}",
                username, password, authCode);

        RequestBody body = RequestBody.create(
                MediaType.parse("application/json"),
                jsonBody);

        Request request = new Request.Builder()
                .url("https://api.squire.gg/auth/login")
                .post(body)
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            // Check for HTTP 200 (success) status
            if (response.code() == 200) {
                return gson.fromJson(response.body().string(), Map.class);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Invalid username or password. Please try again.",
                        "Login Failed",
                        JOptionPane.ERROR_MESSAGE);
                return null;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Handles two-factor authentication (2FA/MFA) if required.
     *
     * @param authResponse Response from login containing MFA requirements
     * @param httpClient HTTP client to use
     * @return MFA ticket/token for completing authentication
     */
    @SuppressWarnings("unchecked")
    private static String handleTwoFactorAuth(Map<String, Object> authResponse, OkHttpClient httpClient) {
        // Check if MFA is required
        boolean mfaRequired = authResponse.getOrDefault("mfa", "false").toString().equalsIgnoreCase("true");
        String ticket = authResponse.get("ticket").toString();

        if (mfaRequired) {
            // Get MFA methods from response
            Map<String, Object> mfaData = (Map<String, Object>) authResponse.get("mfa");
            List<Map<String, Object>> methods = (List<Map<String, Object>>) mfaData.get("methods");

            // Find TOTP method
            String totpCode = "";
            for (Map<String, Object> method : methods) {
                if (((String) method.get("type")).equalsIgnoreCase("totp")) {
                    totpCode = (String) method.get("id");
                    break;
                }
            }

            // Prompt for TOTP code
            String userCode = JOptionPane.showInputDialog(null,
                    "Enter your 2FA code from your authenticator app:",
                    "Two-Factor Authentication",
                    JOptionPane.QUESTION_MESSAGE);

            // Submit TOTP verification
            String totpBody = String.format("{\"code\":\"%s\"}", userCode);
            RequestBody requestBody = RequestBody.create(
                    MediaType.parse("application/json"),
                    totpBody);

            Request request = new Request.Builder()
                    .url(String.format("https://discord.com/api/v9/mfa/totp?ticket=%s", ticket))
                    .put(requestBody)
                    .build();

            try (Response response = httpClient.newCall(request).execute()) {
                System.out.println("2FA verification submitted");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            // Prompt for backup code if needed
            String backupCode = JOptionPane.showInputDialog(null,
                    "If you don't have access to your authenticator, enter a backup code:",
                    "Backup Code",
                    JOptionPane.QUESTION_MESSAGE);

            String backupBody = String.format("{\"code\":\"%s\"}", backupCode);
            RequestBody backupRequestBody = RequestBody.create(
                    MediaType.parse("application/json"),
                    backupBody);

            request = new Request.Builder()
                    .url(String.format("https://discord.com/api/v9/mfa/backup?ticket=%s", ticket))
                    .put(backupRequestBody)
                    .build();

        } else {
            // No MFA - just prompt for verification code
            String verificationCode = JOptionPane.showInputDialog(null,
                    "Enter the verification code sent to your email:",
                    "Email Verification",
                    JOptionPane.QUESTION_MESSAGE);

            String codeBody = String.format("{\"code\":\"%s\"}", verificationCode);
            RequestBody requestBody = RequestBody.create(
                    MediaType.parse("application/json"),
                    codeBody);

            Request request = new Request.Builder()
                    .url(String.format("https://discord.com/api/v9/auth/verify?ticket=%s", ticket))
                    .put(requestBody)
                    .build();
        }

        // Get final ticket after MFA
        try (Response response = httpClient.newCall(
                new Request.Builder()
                        .url(String.format("https://discord.com/api/v9/auth/verify?ticket=%s", ticket))
                        .build()).execute()) {

            String responseBody = response.body().string();
            System.out.println(responseBody);

            Map<String, Object> result = gson.fromJson(responseBody, Map.class);
            Map<String, Object> data = (Map<String, Object>) result.get("data");

            accessToken = (String) data.get("token");
            return (String) data.get("ticket");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Performs Discord OAuth2 authorization flow.
     *
     * @param clientId Discord application client ID
     * @param cookieJar Cookie jar for session
     * @return OAuth authorization code
     */
    private static String performDiscordOAuth(String clientId, CookieJar cookieJar) {
        OkHttpClient client = new OkHttpClient.Builder()
                .cookieJar(cookieJar)
                .build();

        // Build OAuth authorization URL with required scopes
        HttpUrl authUrl = HttpUrl.parse("https://discord.com/api/oauth2/authorize")
                .newBuilder()
                .addEncodedQueryParameter("client_id", clientId)
                .addEncodedQueryParameter("redirect_uri", DISCORD_REDIRECT_URI)
                .addEncodedQueryParameter("response_type", "code")
                .addEncodedQueryParameter("scope", "identify email guilds")
                .addEncodedQueryParameter("state", "squire-auth")
                .addEncodedQueryParameter("prompt", "consent")
                .addQueryParameter("integration_type", "0")
                .build();

        Request request = new Request.Builder()
                .url(authUrl.toString())
                .header("Accept", "application/json")
                .header("User-Agent", "Mozilla/5.0")
                .header("Origin", "https://discord.com")
                .build();

        String authCode = "";

        try (Response response = client.newCall(request).execute()) {
            authCode = response.request().url().toString().split("=")[1];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Exchange auth code for consent token
        String consentBody = String.format("{\"authorize\":true,\"code\":\"%s\"}", authCode);
        RequestBody body = RequestBody.create(
                MediaType.parse("application/json"),
                consentBody);

        Request consentRequest = new Request.Builder()
                .url("https://discord.com/api/oauth2/authorize/consent")
                .post(body)
                .build();

        String consentUrl = "";

        try (Response response = client.newCall(consentRequest).execute()) {
            String responseBody = response.body().string();
            Map<String, Object> result = gson.fromJson(responseBody, Map.class);
            consentUrl = result.get("location").toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Follow consent redirect
        OkHttpClient noRedirectClient = new OkHttpClient.Builder()
                .cookieJar(cookieJar)
                .followRedirects(false)
                .build();

        Request redirectRequest = new Request.Builder()
                .url(consentUrl)
                .build();

        String finalCode = "";

        try (Response response = noRedirectClient.newCall(redirectRequest).execute()) {
            finalCode = response.header("Location").split("code=")[1].split("&")[0];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return finalCode;
    }

    /**
     * Follows OAuth redirect to get token URL.
     *
     * @param mfaTicket MFA ticket from authentication
     * @param httpClient HTTP client to use
     * @return Redirect URL containing tokens
     */
    private static String followOAuthRedirect(String mfaTicket, OkHttpClient httpClient) {
        String redirectUrl = "";
        Request request = new Request.Builder()
                .url(mfaTicket)
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            redirectUrl = response.headers().get("Location");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Follow the redirect to get body
        try (Response response = httpClient.newCall(
                new Request.Builder().url(redirectUrl).build()).execute()) {
            System.out.println(response.body().string());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return redirectUrl;
    }

    /**
     * Exchanges redirect URL for token URL.
     *
     * @param redirectUrl OAuth redirect URL
     * @param httpClient HTTP client to use
     * @return Token URL for final token exchange
     */
    private static String exchangeForTokenUrl(String redirectUrl, OkHttpClient httpClient) {
        String fragment = redirectUrl.split("=")[1];

        String jsonBody = String.format("{\"code\":\"%s\",\"guild_id\":null}", fragment);
        RequestBody body = RequestBody.create(
                MediaType.parse("application/json"),
                jsonBody);

        Request request = new Request.Builder()
                .url("https://discord.com/api/oauth2/token/exchange")
                .post(body)
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            String responseBody = response.body().string();
            Map<String, Object> result = gson.fromJson(responseBody, Map.class);
            return result.get("location").toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Validates session with Squire API.
     *
     * @param token Access token to validate
     * @param httpClient HTTP client to use
     * @return Session info from validation
     */
    private static String validateSession(String token, OkHttpClient httpClient) {
        Request request = new Request.Builder()
                .url(String.format("https://api.squire.gg/auth/session?token=%s", accessToken))
                .header("Authorization", String.format("Bearer %s", token))
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            String responseBody = response.body().string();
            Map<String, Object> result = gson.fromJson(responseBody, Map.class);
            return (String) result.get("session_id");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Gets final access token for API calls.
     *
     * @param authCode Authorization code
     * @param httpClient HTTP client to use
     * @return Final access token
     */
    private static String getFinalAccessToken(String authCode, OkHttpClient httpClient) {
        String jsonBody = String.format("{\"code\":\"%s\"}", authCode);
        RequestBody body = RequestBody.create(
                MediaType.parse("application/json"),
                jsonBody);

        Request request = new Request.Builder()
                .url("https://api.squire.gg/auth/token")
                .post(body)
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            Map<String, Object> result = gson.fromJson(response.body().string(), Map.class);
            return (String) result.get("access_token");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // ==================== Profile Management ====================

    /**
     * Fetches user profiles from API and saves to local file.
     *
     * @param token Access token for API
     * @param httpClient HTTP client to use
     */
    private static void fetchAndSaveProfiles(String token, OkHttpClient httpClient) {
        Request request = new Request.Builder()
                .url("https://api.squire.gg/profiles")
                .header("Authorization", String.format("Bearer %s", token))
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            @SuppressWarnings("unchecked")
            List<Map<String, String>> profiles = (List<Map<String, String>>)
                    gson.fromJson(response.body().string(), Object.class);
            saveProfiles(profiles, token);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Saves user profiles to local profiles.txt file.
     *
     * Format: hwid:username:proxy (one profile per line)
     *
     * @param profiles List of profile maps from API
     * @param token Current access token
     */
    @SuppressWarnings("unchecked")
    private static void saveProfiles(List<Map<String, String>> profiles, String token) {
        // Build map of profiles by ID
        HashMap<Object, Object> profileMap = new HashMap<>();
        int profileCount = profiles.size();

        for (Map<String, String> profile : profiles) {
            String id = (String) profile.get("id");
            HashMap<String, String> profileData = new HashMap<>(profile);
            profileData.put("token", token);

            // Set default proxy if not specified
            if (!profileData.containsKey("proxy")) {
                profileData.put("proxy", "none");
            }

            profileMap.put(id, profileData);
        }

        // Get/create .squire directory
        File squireDir = new File(System.getProperty("user.home"), ".squire");
        if (!squireDir.exists()) {
            squireDir.mkdirs();
        }

        // Get/create profiles.txt file
        File profilesFile = new File(squireDir, "profiles.txt");
        if (!profilesFile.exists()) {
            try {
                profilesFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // Read existing profiles from file
        try (Scanner scanner = new Scanner(profilesFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                String id = parts[3]; // ID is 4th field
                String hwid = "";
                String proxy = "none";

                if (parts.length == 5) {
                    hwid = parts[4];
                } else {
                    hwid = "";
                }

                Map<String, String> localProfile = Map.of(
                        "id", id,
                        "hwid", hwid,
                        "username", parts[2]);

                // Only add if not already in API response
                if (!profileMap.containsKey(id)) {
                    profileMap.put(id, localProfile);
                } else {
                    // Prefer local HWID if API doesn't have one
                    Map<String, String> apiProfile = (Map<String, String>) profileMap.get(id);
                    if (!apiProfile.containsKey("hwid") || ((String) apiProfile.get("hwid")).isEmpty()) {
                        profileMap.put(id, localProfile);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Write merged profiles back to file
        try (FileWriter writer = new FileWriter(profilesFile, false)) {
            for (Object profileObj : profileMap.values()) {
                Map<String, String> profile = (Map<String, String>) profileObj;
                String id = profile.get("id");
                String username = profile.get("username");
                String proxy = profile.getOrDefault("proxy", "none");

                writer.write(String.format("%s:%s:%s\n", username, id, proxy));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Show success message
        JOptionPane.showMessageDialog(null,
                String.format("Successfully synced %d profiles from server.", profileCount));
    }

    // ==================== Utility Methods ====================

    /**
     * Checks if an object is not null.
     */
    private static boolean isNotNull(Object object) {
        return object != null;
    }

    /**
     * Checks if an object is null.
     */
    private static boolean isNull(Object object) {
        return object == null;
    }

    /**
     * Checks if an integer is non-zero (truthy).
     */
    private static boolean isNonZero(int value) {
        return value != 0;
    }

    /**
     * Checks if an integer is zero (falsy).
     */
    private static boolean isZero(int value) {
        return value == 0;
    }

    /**
     * Checks if first integer is less than second.
     */
    private static boolean isLessThan(int a, int b) {
        return a < b;
    }

    /**
     * Checks if two integers are equal.
     */
    private static boolean areEqual(int a, int b) {
        return a == b;
    }

    /**
     * Checks if two integers are not equal.
     */
    private static boolean notEqual(int a, int b) {
        return a != b;
    }

    // ==================== String Decryption (for reference) ====================
    // Original code used encrypted strings. These methods show the decryption algorithms.

    /**
     * XOR string decryption (original: lIIlIII)
     */
    private static String decryptXor(String encoded, String key) {
        String decoded = new String(
                Base64.getDecoder().decode(encoded.getBytes(StandardCharsets.UTF_8)),
                StandardCharsets.UTF_8);

        StringBuilder result = new StringBuilder();
        char[] keyChars = key.toCharArray();
        int keyIndex = 0;

        for (char c : decoded.toCharArray()) {
            result.append((char) (c ^ keyChars[keyIndex % keyChars.length]));
            keyIndex++;
        }

        return result.toString();
    }

    /**
     * Blowfish string decryption (original: lIIlIlI)
     */
    private static String decryptBlowfish(String encoded, String key) {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(
                    MessageDigest.getInstance("MD5").digest(key.getBytes(StandardCharsets.UTF_8)),
                    "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.DECRYPT_MODE, keySpec);
            return new String(
                    cipher.doFinal(Base64.getDecoder().decode(encoded.getBytes(StandardCharsets.UTF_8))),
                    StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * DES string decryption (original: lllIlI)
     */
    private static String decryptDes(String encoded, String key) {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(
                    Arrays.copyOf(
                            MessageDigest.getInstance("MD5").digest(key.getBytes(StandardCharsets.UTF_8)),
                            8),
                    "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE, keySpec);
            return new String(
                    cipher.doFinal(Base64.getDecoder().decode(encoded.getBytes(StandardCharsets.UTF_8))),
                    StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Private constructor to prevent instantiation
    private AuthenticationManager() {
    }
}
