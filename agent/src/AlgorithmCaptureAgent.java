import java.lang.instrument.*;
import java.lang.reflect.*;
import java.security.ProtectionDomain;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.*;

/**
 * SMART APPROACH: Capture the decryption ALGORITHM, not just input/output
 *
 * Instead of capturing every string decryption:
 * 1. Hook into the Cipher.init() and Cipher.doFinal() calls
 * 2. Capture the algorithm, mode, padding, and key derivation
 * 3. Then we can decrypt ALL strings statically
 *
 * This is smarter because:
 * - Captures the MECHANISM once
 * - Can decrypt strings that never ran
 * - Validates our existing cipher implementation
 */
public class AlgorithmCaptureAgent {

    // Captured crypto configurations
    public static final List<CryptoCapture> captures = Collections.synchronizedList(new ArrayList<>());

    public static class CryptoCapture {
        public String algorithm;      // DES, Blowfish, AES
        public String mode;           // ECB, CBC, etc.
        public String padding;        // PKCS5Padding, etc.
        public byte[] key;            // The actual key bytes
        public byte[] iv;             // IV if used
        public String keyDerivation;  // How key was derived (MD5, etc.)
        public String callerClass;
        public String callerMethod;
        public StackTraceElement[] stackTrace;

        @Override
        public String toString() {
            return String.format("%s/%s/%s key=%s caller=%s.%s",
                algorithm, mode, padding,
                bytesToHex(key),
                callerClass, callerMethod);
        }
    }

    /**
     * Hook Cipher.getInstance() to capture algorithm choice
     */
    public static void onCipherGetInstance(String transformation) {
        System.out.println("[CRYPTO] Cipher.getInstance(\"" + transformation + "\")");
    }

    /**
     * Hook Cipher.init() to capture key material
     */
    public static void onCipherInit(int opmode, Key key, Object params) {
        CryptoCapture cap = new CryptoCapture();

        // Capture algorithm details
        cap.algorithm = key.getAlgorithm();
        cap.key = key.getEncoded();

        // Capture IV if present
        if (params instanceof IvParameterSpec) {
            cap.iv = ((IvParameterSpec) params).getIV();
        }

        // Capture caller info
        cap.stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement ste : cap.stackTrace) {
            String cls = ste.getClassName();
            if (cls.startsWith("c.r.m.") || cls.startsWith("gg.squire.") ||
                cls.length() <= 3 || cls.contains("lIlI")) {
                cap.callerClass = cls;
                cap.callerMethod = ste.getMethodName();
                break;
            }
        }

        captures.add(cap);

        System.out.println("[CRYPTO] Cipher.init() - " + cap);
    }

    /**
     * Hook MessageDigest to capture key derivation
     */
    public static void onMessageDigest(String algorithm, byte[] input, byte[] output) {
        System.out.printf("[CRYPTO] MessageDigest.%s: input=%d bytes -> output=%s%n",
            algorithm, input.length, bytesToHex(output));
    }

    /**
     * Hook SecretKeySpec constructor
     */
    public static void onSecretKeySpec(byte[] key, String algorithm) {
        System.out.printf("[CRYPTO] SecretKeySpec: algorithm=%s, key=%s (%d bytes)%n",
            algorithm, bytesToHex(key), key.length);
    }

    public static void premain(String args, Instrumentation inst) {
        System.out.println("\n╔═══════════════════════════════════════════════════════╗");
        System.out.println("║      ALGORITHM CAPTURE AGENT                          ║");
        System.out.println("║  Captures crypto algorithms, not just strings         ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝\n");

        System.out.println("[*] This agent hooks:");
        System.out.println("    - Cipher.getInstance() - algorithm choice");
        System.out.println("    - Cipher.init() - key material");
        System.out.println("    - MessageDigest.digest() - key derivation");
        System.out.println("    - SecretKeySpec.<init>() - key creation");
        System.out.println();

        // In production, would use ByteBuddy or ASM to actually inject hooks
        // For now, this demonstrates the concept

        Runtime.getRuntime().addShutdownHook(new Thread(AlgorithmCaptureAgent::saveCapture));
    }

    public static void agentmain(String args, Instrumentation inst) {
        premain(args, inst);
    }

    private static void saveCapture() {
        System.out.println("\n[*] Crypto captures: " + captures.size());

        if (captures.isEmpty()) {
            System.out.println("[*] No crypto calls captured.");
            System.out.println("[*] Note: This requires ByteBuddy/ASM for actual injection.");
            return;
        }

        try {
            Path out = Paths.get(System.getProperty("user.home"), ".squire", "crypto_capture.json");
            StringBuilder json = new StringBuilder("[\n");
            for (int i = 0; i < captures.size(); i++) {
                if (i > 0) json.append(",\n");
                CryptoCapture cap = captures.get(i);
                json.append("  {\n");
                json.append("    \"algorithm\": \"").append(cap.algorithm).append("\",\n");
                json.append("    \"key\": \"").append(bytesToHex(cap.key)).append("\",\n");
                json.append("    \"caller\": \"").append(cap.callerClass).append(".").append(cap.callerMethod).append("\"\n");
                json.append("  }");
            }
            json.append("\n]");
            Files.writeString(out, json.toString());
            System.out.println("[*] Saved to: " + out);
        } catch (IOException e) {
            System.err.println("[ERROR] " + e.getMessage());
        }
    }

    private static String bytesToHex(byte[] bytes) {
        if (bytes == null) return "null";
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
