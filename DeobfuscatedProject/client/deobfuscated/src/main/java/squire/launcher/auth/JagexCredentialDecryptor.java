/*
 * Jagex Launcher Credential Decryptor
 *
 * Decrypts credentials stored by the official Jagex Launcher.
 * The Jagex Launcher uses CEF (Chromium Embedded Framework) which encrypts
 * credentials using Chromium's os_crypt module:
 * - On Windows: Uses DPAPI to protect an AES key, then AES-256-GCM for data
 * - On macOS: Uses Keychain
 * - On Linux: Uses gnome-keyring or similar
 *
 * Credential file location: %LOCALAPPDATA%\Jagex Launcher\auth\creds
 * Local State file: %LOCALAPPDATA%\Jagex Launcher\User Data\Local State
 */
package squire.launcher.auth;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.sun.jna.Platform;
import com.sun.jna.platform.win32.Crypt32;
import com.sun.jna.platform.win32.WinCrypt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Decrypts credentials from the official Jagex Launcher.
 *
 * This enables automatic token refresh without requiring the user to
 * re-authenticate through the OAuth flow every time tokens expire.
 */
public class JagexCredentialDecryptor {

    private static final Logger log = LoggerFactory.getLogger(JagexCredentialDecryptor.class);
    private static final Gson gson = new Gson();

    // Jagex Launcher paths (Windows)
    private static final String JAGEX_LAUNCHER_DIR = "Jagex Launcher";
    private static final String LOCAL_STATE_PATH = "User Data/Local State";
    private static final String CREDS_PATH = "auth/creds";

    // Chromium encryption constants
    private static final String DPAPI_PREFIX = "DPAPI";
    private static final int GCM_NONCE_LENGTH = 12;  // 96 bits for AES-GCM
    private static final int GCM_TAG_LENGTH = 128;    // 128-bit auth tag

    /**
     * Represents decrypted credentials from the Jagex Launcher.
     */
    public static class JagexCredentials {
        public String accessToken;
        public String idToken;
        public String refreshToken;
        public long expiry;
        public String loginProvider;
        public String sub;  // Unique account ID
        public String displayName;

        @Override
        public String toString() {
            return String.format("JagexCredentials{sub=%s, displayName=%s, hasAccessToken=%b, hasRefreshToken=%b, expiry=%d}",
                    sub, displayName, accessToken != null, refreshToken != null, expiry);
        }
    }

    /**
     * Gets the Jagex Launcher installation directory.
     */
    public static File getJagexLauncherDir() {
        if (Platform.isWindows()) {
            String localAppData = System.getenv("LOCALAPPDATA");
            if (localAppData != null) {
                return new File(localAppData, JAGEX_LAUNCHER_DIR);
            }
        } else if (Platform.isMac()) {
            String home = System.getProperty("user.home");
            return new File(home, "Library/Application Support/Jagex Launcher");
        } else {
            // Linux - check common locations
            String home = System.getProperty("user.home");
            File configDir = new File(home, ".config/jagex-launcher");
            if (configDir.exists()) return configDir;
            // Wine prefix location
            configDir = new File(home, ".wine/drive_c/users/" + System.getProperty("user.name") +
                    "/AppData/Local/Jagex Launcher");
            if (configDir.exists()) return configDir;
        }
        return null;
    }

    /**
     * Reads the encrypted credentials file from the Jagex Launcher.
     *
     * @return List of decrypted credentials, or empty list if not found/decryption fails
     */
    public static List<JagexCredentials> readCredentials() {
        List<JagexCredentials> credentials = new ArrayList<>();

        File jagexDir = getJagexLauncherDir();
        if (jagexDir == null || !jagexDir.exists()) {
            log.info("Jagex Launcher directory not found");
            return credentials;
        }

        log.info("Found Jagex Launcher directory: {}", jagexDir.getAbsolutePath());

        // Read the encrypted AES key from Local State
        File localStateFile = new File(jagexDir, LOCAL_STATE_PATH);
        byte[] aesKey = null;

        if (localStateFile.exists()) {
            log.info("Found Local State file: {}", localStateFile.getAbsolutePath());
            aesKey = extractAndDecryptKey(localStateFile);
            if (aesKey != null) {
                log.info("Successfully decrypted AES key (length: {} bytes)", aesKey.length);
            } else {
                log.warn("Failed to decrypt AES key from Local State");
            }
        } else {
            log.info("Local State file not found, will try alternative decryption");
        }

        // Read the encrypted credentials file
        File credsFile = new File(jagexDir, CREDS_PATH);
        if (!credsFile.exists()) {
            log.info("Credentials file not found: {}", credsFile.getAbsolutePath());
            return credentials;
        }

        log.info("Found credentials file: {}", credsFile.getAbsolutePath());

        try {
            String content = Files.readString(credsFile.toPath(), StandardCharsets.UTF_8);
            return decryptCredentialsFile(content, aesKey);
        } catch (IOException e) {
            log.error("Failed to read credentials file", e);
            return credentials;
        }
    }

    /**
     * Reads credentials from a specific creds file (for testing or custom locations).
     *
     * @param credsFile Path to the creds file
     * @param localStateFile Path to the Local State file (optional, for AES key)
     * @return List of decrypted credentials
     */
    public static List<JagexCredentials> readCredentials(File credsFile, File localStateFile) {
        byte[] aesKey = null;

        if (localStateFile != null && localStateFile.exists()) {
            aesKey = extractAndDecryptKey(localStateFile);
        }

        try {
            String content = Files.readString(credsFile.toPath(), StandardCharsets.UTF_8);
            return decryptCredentialsFile(content, aesKey);
        } catch (IOException e) {
            log.error("Failed to read credentials file", e);
            return new ArrayList<>();
        }
    }

    /**
     * Extracts and decrypts the AES key from the Local State file.
     *
     * The Local State file is a JSON file containing:
     * {
     *   "os_crypt": {
     *     "encrypted_key": "RFBBUEkx..." (Base64 encoded, DPAPI prefix + encrypted key)
     *   }
     * }
     */
    private static byte[] extractAndDecryptKey(File localStateFile) {
        try {
            String content = Files.readString(localStateFile.toPath(), StandardCharsets.UTF_8);
            JsonObject json = gson.fromJson(content, JsonObject.class);

            JsonObject osCrypt = json.getAsJsonObject("os_crypt");
            if (osCrypt == null) {
                log.warn("No os_crypt section in Local State");
                return null;
            }

            String encryptedKeyB64 = osCrypt.get("encrypted_key").getAsString();
            if (encryptedKeyB64 == null || encryptedKeyB64.isEmpty()) {
                log.warn("No encrypted_key in Local State");
                return null;
            }

            // Decode Base64
            byte[] encryptedKey = Base64.getDecoder().decode(encryptedKeyB64);

            // Check for DPAPI prefix
            String prefix = new String(encryptedKey, 0, Math.min(5, encryptedKey.length), StandardCharsets.US_ASCII);
            if (!prefix.equals(DPAPI_PREFIX)) {
                log.warn("Encrypted key doesn't have DPAPI prefix, got: {}", prefix);
                return null;
            }

            // Remove DPAPI prefix (5 bytes)
            byte[] keyToDecrypt = Arrays.copyOfRange(encryptedKey, 5, encryptedKey.length);

            // Decrypt with DPAPI
            return decryptWithDPAPI(keyToDecrypt);

        } catch (Exception e) {
            log.error("Failed to extract AES key from Local State", e);
            return null;
        }
    }

    /**
     * Decrypts data using Windows DPAPI.
     */
    private static byte[] decryptWithDPAPI(byte[] encryptedData) {
        if (!Platform.isWindows()) {
            log.warn("DPAPI decryption is only available on Windows");
            return null;
        }

        try {
            WinCrypt.DATA_BLOB pDataIn = new WinCrypt.DATA_BLOB(encryptedData);
            WinCrypt.DATA_BLOB pDataOut = new WinCrypt.DATA_BLOB();

            boolean result = Crypt32.INSTANCE.CryptUnprotectData(
                    pDataIn,
                    null,     // ppszDataDescr
                    null,     // pOptionalEntropy
                    null,     // pvReserved
                    null,     // pPromptStruct
                    0,        // dwFlags
                    pDataOut
            );

            if (result && pDataOut.pbData != null) {
                byte[] decrypted = pDataOut.getData();
                // Free the memory allocated by CryptUnprotectData
                com.sun.jna.platform.win32.Kernel32.INSTANCE.LocalFree(pDataOut.pbData);
                return decrypted;
            } else {
                int error = com.sun.jna.platform.win32.Kernel32.INSTANCE.GetLastError();
                log.error("DPAPI decryption failed with error code: {}", error);
                return null;
            }

        } catch (Exception e) {
            log.error("Exception during DPAPI decryption", e);
            return null;
        }
    }

    /**
     * Decrypts the credentials file content.
     *
     * Format: IV:Base64(EncryptedData)
     * Where:
     * - IV is a 16-character Base64 string that decodes to 12 bytes (GCM nonce)
     * - EncryptedData is Base64(ciphertext + 16-byte GCM tag)
     */
    private static List<JagexCredentials> decryptCredentialsFile(String content, byte[] aesKey) {
        List<JagexCredentials> credentials = new ArrayList<>();

        try {
            // Split by colon to get IV and encrypted data
            int colonIndex = content.indexOf(':');
            if (colonIndex == -1) {
                log.error("Invalid creds file format - no colon separator found");
                return tryParseAsPlainJson(content);
            }

            String ivString = content.substring(0, colonIndex);
            String encryptedB64 = content.substring(colonIndex + 1).trim();

            log.info("IV string: {} (length: {})", ivString, ivString.length());
            log.info("Encrypted data length: {} (Base64)", encryptedB64.length());

            // The IV string is Base64-encoded and decodes to 12 bytes (GCM nonce)
            byte[] nonce;
            try {
                nonce = Base64.getDecoder().decode(ivString);
                log.info("Decoded nonce: {} bytes (hex: {})", nonce.length, bytesToHex(nonce));
            } catch (IllegalArgumentException e) {
                // Fallback: use IV as raw ASCII bytes
                log.warn("IV is not valid Base64, using as raw ASCII");
                nonce = ivString.getBytes(StandardCharsets.US_ASCII);
            }

            // Decode the encrypted data (contains ciphertext + GCM tag)
            byte[] encryptedData = Base64.getDecoder().decode(encryptedB64);
            log.info("Encrypted data length: {} bytes (decoded)", encryptedData.length);

            // Try different decryption methods
            String decrypted = null;

            // Method 1: AES-GCM with provided key and Base64-decoded nonce
            if (aesKey != null && aesKey.length == 32) {
                log.info("Attempting AES-256-GCM with DPAPI key...");
                log.info("  Key length: {} bytes", aesKey.length);
                log.info("  Nonce length: {} bytes", nonce.length);

                decrypted = decryptAESGCMWithNonce(encryptedData, aesKey, nonce);
                if (decrypted != null) {
                    log.info("SUCCESS: Decrypted using AES-GCM with DPAPI key and Base64-decoded nonce");
                }
            }

            // Method 2: Try AES-GCM with nonce truncated/padded to 12 bytes
            if (decrypted == null && aesKey != null && aesKey.length == 32 && nonce.length != 12) {
                log.info("Attempting AES-GCM with nonce adjusted to 12 bytes...");
                byte[] adjustedNonce = new byte[12];
                System.arraycopy(nonce, 0, adjustedNonce, 0, Math.min(nonce.length, 12));
                decrypted = decryptAESGCMWithNonce(encryptedData, aesKey, adjustedNonce);
                if (decrypted != null) {
                    log.info("SUCCESS: Decrypted using AES-GCM with adjusted nonce");
                }
            }

            // Method 3: Try DPAPI directly on the encrypted blob
            if (decrypted == null && Platform.isWindows()) {
                log.info("Attempting direct DPAPI decryption...");
                byte[] dpapiDecrypted = decryptWithDPAPI(encryptedData);
                if (dpapiDecrypted != null) {
                    decrypted = new String(dpapiDecrypted, StandardCharsets.UTF_8);
                    log.info("SUCCESS: Decrypted using direct DPAPI");
                }
            }

            // Method 4: AES-CBC fallback
            if (decrypted == null && aesKey != null) {
                log.info("Attempting AES-CBC fallback...");
                // For CBC, use 16-byte IV (pad nonce if needed)
                byte[] iv16 = new byte[16];
                System.arraycopy(nonce, 0, iv16, 0, Math.min(nonce.length, 16));
                decrypted = decryptAESCBC(encryptedData, aesKey, iv16);
                if (decrypted != null) {
                    log.info("SUCCESS: Decrypted using AES-CBC");
                }
            }

            // Method 5: AES-CTR fallback
            if (decrypted == null && aesKey != null) {
                log.info("Attempting AES-CTR fallback...");
                byte[] iv16 = new byte[16];
                System.arraycopy(nonce, 0, iv16, 0, Math.min(nonce.length, 16));
                decrypted = decryptAESCTR(encryptedData, aesKey, iv16);
                if (decrypted != null) {
                    log.info("SUCCESS: Decrypted using AES-CTR");
                }
            }

            if (decrypted != null) {
                return parseCredentialsJson(decrypted);
            }

            log.warn("All decryption methods failed");
            log.warn("Please ensure you're running on Windows with the same user account that installed the Jagex Launcher");
            log.warn("The DPAPI key is tied to the Windows user profile");
            return credentials;

        } catch (Exception e) {
            log.error("Failed to decrypt credentials file", e);
            return credentials;
        }
    }

    /**
     * Convert bytes to hex string for logging.
     */
    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    /**
     * Decrypts using AES-256-GCM with provided nonce.
     * Tries multiple data format variations to handle different encryption implementations.
     */
    private static String decryptAESGCMWithNonce(byte[] encryptedData, byte[] key, byte[] nonce) {
        // Ensure nonce is exactly 12 bytes for GCM
        byte[] gcmNonce = nonce;
        if (nonce.length != GCM_NONCE_LENGTH) {
            log.info("Adjusting nonce from {} to {} bytes", nonce.length, GCM_NONCE_LENGTH);
            gcmNonce = new byte[GCM_NONCE_LENGTH];
            System.arraycopy(nonce, 0, gcmNonce, 0, Math.min(nonce.length, GCM_NONCE_LENGTH));
        }

        log.info("AES-GCM decryption attempt:");
        log.info("  Nonce (hex): {}", bytesToHex(gcmNonce));
        log.info("  Key (first 8 bytes hex): {}", bytesToHex(Arrays.copyOf(key, 8)));
        log.info("  Encrypted data: {} bytes", encryptedData.length);

        // Try multiple format variations
        String[] attempts = {
            "Standard format (ciphertext || tag)",
            "Tag at beginning (tag || ciphertext)",
            "Skip first 16 bytes header (header || ciphertext || tag)",
            "Nonce embedded (skip first 12 bytes)",
            "Nonce embedded (skip first 16 bytes)"
        };

        for (int attempt = 0; attempt < attempts.length; attempt++) {
            try {
                byte[] dataToDecrypt;
                byte[] nonceToUse = gcmNonce;

                switch (attempt) {
                    case 0:
                        // Standard: ciphertext || tag (tag at end)
                        dataToDecrypt = encryptedData;
                        break;

                    case 1:
                        // Tag at beginning: tag || ciphertext -> ciphertext || tag
                        if (encryptedData.length < 16) continue;
                        byte[] tag = Arrays.copyOfRange(encryptedData, 0, 16);
                        byte[] ciphertext = Arrays.copyOfRange(encryptedData, 16, encryptedData.length);
                        dataToDecrypt = new byte[encryptedData.length];
                        System.arraycopy(ciphertext, 0, dataToDecrypt, 0, ciphertext.length);
                        System.arraycopy(tag, 0, dataToDecrypt, ciphertext.length, 16);
                        break;

                    case 2:
                        // Header at beginning: skip first 16 bytes
                        if (encryptedData.length < 32) continue;
                        dataToDecrypt = Arrays.copyOfRange(encryptedData, 16, encryptedData.length);
                        break;

                    case 3:
                        // 12-byte nonce embedded at start of data
                        if (encryptedData.length < 12) continue;
                        nonceToUse = Arrays.copyOfRange(encryptedData, 0, 12);
                        dataToDecrypt = Arrays.copyOfRange(encryptedData, 12, encryptedData.length);
                        break;

                    case 4:
                        // 16-byte IV embedded at start (use first 12 as nonce)
                        if (encryptedData.length < 16) continue;
                        nonceToUse = Arrays.copyOfRange(encryptedData, 0, 12);
                        dataToDecrypt = Arrays.copyOfRange(encryptedData, 16, encryptedData.length);
                        break;

                    default:
                        continue;
                }

                log.info("  Trying: {}", attempts[attempt]);
                log.info("    Data length: {} bytes, Nonce: {}", dataToDecrypt.length, bytesToHex(nonceToUse));

                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
                GCMParameterSpec gcmSpec = new GCMParameterSpec(GCM_TAG_LENGTH, nonceToUse);

                cipher.init(Cipher.DECRYPT_MODE, keySpec, gcmSpec);
                byte[] decrypted = cipher.doFinal(dataToDecrypt);

                String result = new String(decrypted, StandardCharsets.UTF_8);

                // Validate result looks like JSON
                if (result.trim().startsWith("[") || result.trim().startsWith("{")) {
                    log.info("SUCCESS with: {}", attempts[attempt]);
                    log.info("Decrypted {} chars, starts with: {}", result.length(),
                            result.substring(0, Math.min(100, result.length())));
                    return result;
                } else {
                    log.info("Decryption produced non-JSON output, continuing to next attempt...");
                }

            } catch (javax.crypto.AEADBadTagException e) {
                log.debug("  {} - Tag mismatch", attempts[attempt]);
            } catch (Exception e) {
                log.debug("  {} - {}: {}", attempts[attempt], e.getClass().getSimpleName(), e.getMessage());
            }
        }

        log.warn("All AES-GCM format variations failed");
        return null;
    }

    /**
     * Decrypts using AES-256-GCM (legacy method for compatibility).
     */
    private static String decryptAESGCM(byte[] encryptedData, byte[] key, byte[] ivFromFile) {
        return decryptAESGCMWithNonce(encryptedData, key, ivFromFile);
    }

    /**
     * Decrypts using AES-256-CBC (fallback method).
     * Tries multiple IV interpretations.
     */
    private static String decryptAESCBC(byte[] encryptedData, byte[] key, byte[] iv) {
        log.info("Attempting AES-CBC decryption...");

        // Try standard CBC with provided IV
        String result = tryAESCBC(encryptedData, key, iv);
        if (result != null) return result;

        // Try with IV embedded at start of encrypted data
        if (encryptedData.length > 16) {
            byte[] embeddedIv = Arrays.copyOfRange(encryptedData, 0, 16);
            byte[] ciphertext = Arrays.copyOfRange(encryptedData, 16, encryptedData.length);
            result = tryAESCBC(ciphertext, key, embeddedIv);
            if (result != null) {
                log.info("AES-CBC succeeded with embedded IV");
                return result;
            }
        }

        return null;
    }

    private static String tryAESCBC(byte[] encryptedData, byte[] key, byte[] iv) {
        try {
            // Ensure IV is 16 bytes
            byte[] ivBytes = new byte[16];
            System.arraycopy(iv, 0, ivBytes, 0, Math.min(iv.length, 16));

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
            javax.crypto.spec.IvParameterSpec ivSpec = new javax.crypto.spec.IvParameterSpec(ivBytes);

            cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
            byte[] decrypted = cipher.doFinal(encryptedData);
            String result = new String(decrypted, StandardCharsets.UTF_8);

            // Validate it looks like JSON
            if (result.trim().startsWith("[") || result.trim().startsWith("{")) {
                log.info("AES-CBC decryption successful!");
                return result;
            }
            return null;

        } catch (Exception e) {
            log.debug("AES-CBC decryption failed: {}", e.getMessage());
            return null;
        }
    }

    /**
     * Decrypts using AES-256-CTR (another fallback method).
     */
    private static String decryptAESCTR(byte[] encryptedData, byte[] key, byte[] iv) {
        log.info("Attempting AES-CTR decryption...");

        try {
            // Ensure IV is 16 bytes
            byte[] ivBytes = new byte[16];
            System.arraycopy(iv, 0, ivBytes, 0, Math.min(iv.length, 16));

            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
            javax.crypto.spec.IvParameterSpec ivSpec = new javax.crypto.spec.IvParameterSpec(ivBytes);

            cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
            byte[] decrypted = cipher.doFinal(encryptedData);
            String result = new String(decrypted, StandardCharsets.UTF_8);

            // Validate it looks like JSON
            if (result.trim().startsWith("[") || result.trim().startsWith("{")) {
                log.info("AES-CTR decryption successful!");
                return result;
            }
            return null;

        } catch (Exception e) {
            log.debug("AES-CTR decryption failed: {}", e.getMessage());
            return null;
        }
    }

    /**
     * Try to parse content as plain JSON (unencrypted credentials).
     */
    private static List<JagexCredentials> tryParseAsPlainJson(String content) {
        try {
            return parseCredentialsJson(content);
        } catch (Exception e) {
            log.debug("Content is not plain JSON");
            return new ArrayList<>();
        }
    }

    /**
     * Parses the decrypted JSON credentials.
     *
     * Expected format:
     * [
     *   {
     *     "access_token": "...",
     *     "id_token": "...",
     *     "refresh_token": "...",
     *     "expiry": 1234567890,
     *     "login_provider": "jagex",
     *     "sub": "unique-account-id"
     *   }
     * ]
     */
    private static List<JagexCredentials> parseCredentialsJson(String json) {
        List<JagexCredentials> credentials = new ArrayList<>();

        try {
            JsonArray array = gson.fromJson(json, JsonArray.class);

            for (JsonElement element : array) {
                JsonObject obj = element.getAsJsonObject();
                JagexCredentials cred = new JagexCredentials();

                if (obj.has("access_token")) {
                    cred.accessToken = obj.get("access_token").getAsString();
                }
                if (obj.has("id_token")) {
                    cred.idToken = obj.get("id_token").getAsString();
                }
                if (obj.has("refresh_token")) {
                    cred.refreshToken = obj.get("refresh_token").getAsString();
                }
                if (obj.has("expiry")) {
                    cred.expiry = obj.get("expiry").getAsLong();
                }
                if (obj.has("login_provider")) {
                    cred.loginProvider = obj.get("login_provider").getAsString();
                }
                if (obj.has("sub")) {
                    cred.sub = obj.get("sub").getAsString();
                }
                if (obj.has("displayName")) {
                    cred.displayName = obj.get("displayName").getAsString();
                }

                credentials.add(cred);
                log.info("Parsed credential: {}", cred);
            }

        } catch (Exception e) {
            log.error("Failed to parse credentials JSON: {}", e.getMessage());
        }

        return credentials;
    }

    /**
     * Checks if the Jagex Launcher credentials are available.
     */
    public static boolean hasJagexLauncherCredentials() {
        File jagexDir = getJagexLauncherDir();
        if (jagexDir == null || !jagexDir.exists()) {
            return false;
        }
        File credsFile = new File(jagexDir, CREDS_PATH);
        return credsFile.exists() && credsFile.length() > 0;
    }

    /**
     * Gets the path to the Jagex Launcher credentials file.
     */
    public static String getCredentialsPath() {
        File jagexDir = getJagexLauncherDir();
        if (jagexDir == null) {
            return null;
        }
        return new File(jagexDir, CREDS_PATH).getAbsolutePath();
    }

    /**
     * Test decryption with a provided key (for testing without DPAPI).
     *
     * @param credsFile Path to the creds file
     * @param hexKey The AES key as a hex string (64 hex chars = 32 bytes)
     * @return List of decrypted credentials
     */
    public static List<JagexCredentials> readCredentialsWithKey(File credsFile, String hexKey) {
        byte[] aesKey = hexStringToBytes(hexKey);
        if (aesKey == null || aesKey.length != 32) {
            log.error("Invalid key: must be 64 hex characters (32 bytes)");
            return new ArrayList<>();
        }

        try {
            String content = Files.readString(credsFile.toPath(), StandardCharsets.UTF_8);
            return decryptCredentialsFile(content, aesKey);
        } catch (IOException e) {
            log.error("Failed to read credentials file", e);
            return new ArrayList<>();
        }
    }

    /**
     * Convert hex string to byte array.
     */
    private static byte[] hexStringToBytes(String hex) {
        if (hex == null || hex.length() % 2 != 0) {
            return null;
        }
        hex = hex.toLowerCase().replaceAll("\\s+", "");
        byte[] bytes = new byte[hex.length() / 2];
        for (int i = 0; i < bytes.length; i++) {
            int index = i * 2;
            int value = Integer.parseInt(hex.substring(index, index + 2), 16);
            bytes[i] = (byte) value;
        }
        return bytes;
    }

    /**
     * Main method for testing decryption.
     *
     * Usage:
     *   java JagexCredentialDecryptor                        # Use default location with DPAPI
     *   java JagexCredentialDecryptor <creds_file>           # Use specific creds file with DPAPI
     *   java JagexCredentialDecryptor <creds_file> <local_state>  # Use specific files with DPAPI
     *   java JagexCredentialDecryptor <creds_file> --key <hex_key> # Use hex key directly
     */
    public static void main(String[] args) {
        System.out.println("=== Jagex Credential Decryptor Test ===");
        System.out.println("Platform: " + System.getProperty("os.name"));
        System.out.println("Jagex Launcher Dir: " + getJagexLauncherDir());
        System.out.println("Has Credentials: " + hasJagexLauncherCredentials());
        System.out.println();

        List<JagexCredentials> creds;

        if (args.length >= 3 && args[1].equals("--key")) {
            // Test with specific creds file and hex key
            File credsFile = new File(args[0]);
            String hexKey = args[2];
            System.out.println("Using creds file: " + credsFile.getAbsolutePath());
            System.out.println("Using hex key: " + hexKey.substring(0, Math.min(16, hexKey.length())) + "...");
            creds = readCredentialsWithKey(credsFile, hexKey);
        } else if (args.length > 0) {
            // Test with specific files
            File credsFile = new File(args[0]);
            File localStateFile = args.length > 1 ? new File(args[1]) : null;
            System.out.println("Using creds file: " + credsFile.getAbsolutePath());
            if (localStateFile != null) {
                System.out.println("Using Local State file: " + localStateFile.getAbsolutePath());
            }
            creds = readCredentials(credsFile, localStateFile);
        } else {
            // Try default location
            System.out.println("Using default Jagex Launcher location");
            creds = readCredentials();
        }

        System.out.println();
        System.out.println("=== Results ===");
        System.out.println("Found " + creds.size() + " credential(s)");
        for (JagexCredentials cred : creds) {
            System.out.println("  " + cred);
            if (cred.accessToken != null) {
                System.out.println("    Access Token: " + cred.accessToken.substring(0, Math.min(50, cred.accessToken.length())) + "...");
            }
            if (cred.refreshToken != null) {
                System.out.println("    Refresh Token: " + cred.refreshToken.substring(0, Math.min(50, cred.refreshToken.length())) + "...");
            }
        }
    }
}
