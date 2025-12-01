import java.lang.instrument.*;
import java.security.ProtectionDomain;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Java Agent to intercept Squire's class loading and string decryption
 *
 * This agent:
 * 1. Captures bytecode as classes are loaded
 * 2. Intercepts string decryption method calls
 * 3. Builds a cipher mapping (encrypted -> decrypted)
 *
 * Usage:
 *   java -javaagent:squire-agent.jar -jar squire-launcher.jar
 */
public class SquireInterceptAgent {

    // Captured decryption mappings: encrypted -> decrypted
    private static final Map<String, String> decryptionCipher = new ConcurrentHashMap<>();

    // Captured class bytecode: className -> bytecode
    private static final Map<String, byte[]> capturedClasses = new ConcurrentHashMap<>();

    // Output directory for captured data
    private static Path outputDir;

    // Track decryption method patterns
    private static final Set<String> DECRYPT_METHOD_PATTERNS = Set.of(
        "lIlIl",      // DES decrypt in c/r/m/L
        "lllIllI",    // Blowfish decrypt in c/r/m/c
        "llIIIIII"    // Various XOR methods
    );

    /**
     * Agent entry point (premain for -javaagent)
     */
    public static void premain(String args, Instrumentation inst) {
        System.out.println("===========================================");
        System.out.println("  SQUIRE INTERCEPT AGENT LOADED");
        System.out.println("===========================================");

        // Setup output directory
        try {
            outputDir = Paths.get(System.getProperty("user.home"), ".squire", "intercepted");
            Files.createDirectories(outputDir);
            System.out.println("  Output: " + outputDir);
        } catch (IOException e) {
            outputDir = Paths.get(".");
            System.out.println("  Output: current directory");
        }

        // Register class transformer to capture bytecode
        inst.addTransformer(new ClassCaptureTransformer(), true);

        // Register shutdown hook to save captured data
        Runtime.getRuntime().addShutdownHook(new Thread(SquireInterceptAgent::saveCapture));

        System.out.println("  Status: Intercepting class loads...");
        System.out.println("===========================================\n");
    }

    /**
     * Agent entry point (agentmain for attach)
     */
    public static void agentmain(String args, Instrumentation inst) {
        premain(args, inst);
    }

    /**
     * Class transformer that captures bytecode
     */
    static class ClassCaptureTransformer implements ClassFileTransformer {

        @Override
        public byte[] transform(ClassLoader loader,
                               String className,
                               Class<?> classBeingRedefined,
                               ProtectionDomain protectionDomain,
                               byte[] classfileBuffer) {

            if (className == null) return null;

            // Capture Squire-related classes
            if (shouldCapture(className)) {
                capturedClasses.put(className, classfileBuffer.clone());
                System.out.println("[CAPTURE] " + className + " (" + classfileBuffer.length + " bytes)");

                // Save bytecode immediately
                saveBytecode(className, classfileBuffer);

                // Analyze for decryption patterns
                analyzeForDecryption(className, classfileBuffer);
            }

            // Return null = don't modify bytecode
            return null;
        }

        private boolean shouldCapture(String className) {
            // Capture Squire's obfuscated packages
            return className.startsWith("c/r/m/") ||           // Squire launcher classes
                   className.startsWith("net/runelite/") ||    // RuneLite classes
                   className.startsWith("gg/squire/") ||       // Squire plugin classes
                   className.matches("^[a-z]/[a-z]/.*") ||     // Obfuscated package names
                   className.matches("^[A-Z]$") ||             // Single letter classes
                   className.contains("lIlI") ||               // Obfuscated names
                   className.contains("llII");                 // Obfuscated names
        }
    }

    /**
     * Save captured bytecode to file
     */
    private static void saveBytecode(String className, byte[] bytecode) {
        try {
            Path classDir = outputDir.resolve("classes");
            Path classFile = classDir.resolve(className + ".class");
            Files.createDirectories(classFile.getParent());
            Files.write(classFile, bytecode);
        } catch (IOException e) {
            System.err.println("[ERROR] Failed to save " + className + ": " + e.getMessage());
        }
    }

    /**
     * Analyze bytecode for decryption method patterns
     */
    private static void analyzeForDecryption(String className, byte[] bytecode) {
        // Simple pattern matching in bytecode for string constants
        // Look for Base64-like patterns followed by short key strings
        String bytecodeStr = new String(bytecode, java.nio.charset.StandardCharsets.ISO_8859_1);

        // Pattern: Base64 string (encrypted) near 5-char string (key)
        // This is a simplified heuristic
        int encryptedCount = 0;
        for (int i = 0; i < bytecode.length - 20; i++) {
            // Look for UTF8 constant pool entries that look like Base64
            if (bytecode[i] == 0x01) { // CONSTANT_Utf8
                int len = ((bytecode[i+1] & 0xFF) << 8) | (bytecode[i+2] & 0xFF);
                if (len > 8 && len < 200) {
                    try {
                        String str = new String(bytecode, i+3, len, "UTF-8");
                        if (looksLikeBase64(str)) {
                            encryptedCount++;
                        }
                    } catch (Exception e) {
                        // Ignore
                    }
                }
            }
        }

        if (encryptedCount > 0) {
            System.out.println("         Found " + encryptedCount + " potential encrypted strings");
        }
    }

    /**
     * Check if string looks like Base64 encoded data
     */
    private static boolean looksLikeBase64(String s) {
        if (s.length() < 8) return false;
        if (s.contains(" ") || s.contains("\n")) return false;

        // Base64 characters + padding
        return s.matches("^[A-Za-z0-9+/=]+$") &&
               (s.endsWith("=") || s.length() % 4 == 0);
    }

    /**
     * Record a decryption (called from instrumented code)
     */
    public static void recordDecryption(String encrypted, String key, String decrypted) {
        String mapKey = encrypted + "|" + key;
        decryptionCipher.put(mapKey, decrypted);
        System.out.println("[DECRYPT] " + encrypted.substring(0, Math.min(20, encrypted.length())) +
                          "... -> \"" + decrypted + "\"");
    }

    /**
     * Save all captured data on shutdown
     */
    private static void saveCapture() {
        System.out.println("\n===========================================");
        System.out.println("  SAVING CAPTURED DATA");
        System.out.println("===========================================");

        try {
            // Save class list
            Path classListFile = outputDir.resolve("captured_classes.txt");
            List<String> classList = new ArrayList<>(capturedClasses.keySet());
            Collections.sort(classList);
            Files.write(classListFile, classList);
            System.out.println("  Classes: " + classList.size() + " captured");

            // Save decryption cipher
            Path cipherFile = outputDir.resolve("runtime_cipher.json");
            StringBuilder json = new StringBuilder("{\n");
            int count = 0;
            for (Map.Entry<String, String> entry : decryptionCipher.entrySet()) {
                if (count > 0) json.append(",\n");
                String[] parts = entry.getKey().split("\\|");
                json.append("  \"").append(escapeJson(parts[0])).append("\": {\n");
                json.append("    \"key\": \"").append(escapeJson(parts.length > 1 ? parts[1] : "")).append("\",\n");
                json.append("    \"decrypted\": \"").append(escapeJson(entry.getValue())).append("\"\n");
                json.append("  }");
                count++;
            }
            json.append("\n}");
            Files.writeString(cipherFile, json.toString());
            System.out.println("  Decryptions: " + count + " captured");

            // Save summary
            Path summaryFile = outputDir.resolve("capture_summary.txt");
            String summary = String.format(
                "Squire Intercept Summary\n" +
                "========================\n" +
                "Classes captured: %d\n" +
                "Decryptions captured: %d\n" +
                "Output directory: %s\n",
                capturedClasses.size(),
                decryptionCipher.size(),
                outputDir.toAbsolutePath()
            );
            Files.writeString(summaryFile, summary);

            System.out.println("  Output: " + outputDir);
            System.out.println("===========================================");

        } catch (IOException e) {
            System.err.println("[ERROR] Failed to save capture: " + e.getMessage());
        }
    }

    private static String escapeJson(String s) {
        return s.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }
}
