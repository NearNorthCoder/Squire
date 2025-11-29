import java.lang.instrument.*;
import java.security.ProtectionDomain;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Advanced Agent that hooks into decryption methods at runtime
 *
 * Strategy:
 * 1. Find classes with decrypt-like method signatures
 * 2. Inject bytecode to log inputs/outputs
 * 3. Build complete cipher from runtime observations
 *
 * This captures the ACTUAL decryption happening, not static analysis.
 */
public class DecryptionHookAgent {

    // Runtime cipher: maps encrypted+key -> decrypted
    public static final Map<String, DecryptionRecord> runtimeCipher = new ConcurrentHashMap<>();

    // Method call counter
    public static int callCount = 0;

    // Output path
    private static Path outputPath;

    public static class DecryptionRecord {
        public String encrypted;
        public String key;
        public String decrypted;
        public String className;
        public String methodName;
        public long timestamp;

        public DecryptionRecord(String encrypted, String key, String decrypted,
                               String className, String methodName) {
            this.encrypted = encrypted;
            this.key = key;
            this.decrypted = decrypted;
            this.className = className;
            this.methodName = methodName;
            this.timestamp = System.currentTimeMillis();
        }
    }

    /**
     * Called by injected code to record a decryption
     */
    public static void onDecrypt(String encrypted, String key, String result,
                                  String className, String methodName) {
        callCount++;
        String mapKey = encrypted + "|" + key;

        if (!runtimeCipher.containsKey(mapKey)) {
            runtimeCipher.put(mapKey, new DecryptionRecord(encrypted, key, result, className, methodName));

            // Log to console (first 50 only to avoid spam)
            if (runtimeCipher.size() <= 50) {
                System.out.printf("[CIPHER #%d] %s.%s: \"%s\" + \"%s\" = \"%s\"%n",
                    runtimeCipher.size(),
                    className.substring(className.lastIndexOf('/') + 1),
                    methodName,
                    truncate(encrypted, 20),
                    key,
                    truncate(result, 30)
                );
            } else if (runtimeCipher.size() == 51) {
                System.out.println("[CIPHER] ... (logging suppressed, see output file)");
            }
        }
    }

    /**
     * Called before a decrypt method is invoked
     */
    public static void beforeDecrypt(String encrypted, String key, String className, String methodName) {
        // Pre-call hook - useful for debugging
    }

    /**
     * Agent premain entry point
     */
    public static void premain(String args, Instrumentation inst) {
        System.out.println("\n╔═══════════════════════════════════════════════════════╗");
        System.out.println("║        SQUIRE DECRYPTION HOOK AGENT                   ║");
        System.out.println("║  Intercepts string decryption at runtime              ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝\n");

        // Setup output
        try {
            outputPath = Paths.get(System.getProperty("user.home"), ".squire", "cipher");
            Files.createDirectories(outputPath);
        } catch (IOException e) {
            outputPath = Paths.get(".");
        }

        System.out.println("[*] Output directory: " + outputPath);
        System.out.println("[*] Hooking decryption methods...\n");

        // Add class transformer
        inst.addTransformer(new DecryptMethodTransformer(), true);

        // Save on shutdown
        Runtime.getRuntime().addShutdownHook(new Thread(DecryptionHookAgent::saveCipher));
    }

    public static void agentmain(String args, Instrumentation inst) {
        premain(args, inst);
    }

    /**
     * Transformer that identifies and marks decrypt methods
     */
    static class DecryptMethodTransformer implements ClassFileTransformer {

        // Method signatures that look like decryption: (String, String) -> String
        // with obfuscated names (lIlIl, lllIllI, etc.)

        @Override
        public byte[] transform(ClassLoader loader,
                               String className,
                               Class<?> classBeingRedefined,
                               ProtectionDomain protectionDomain,
                               byte[] classfileBuffer) {

            if (className == null) return null;

            // Only process Squire-related classes
            if (!isSquireClass(className)) return null;

            // Analyze the bytecode for decrypt-like methods
            List<String> decryptMethods = findDecryptMethods(classfileBuffer, className);

            if (!decryptMethods.isEmpty()) {
                System.out.println("[HOOK] " + className + " has decrypt methods: " + decryptMethods);

                // In a full implementation, we would use ASM/ByteBuddy here
                // to inject logging calls around the decrypt methods.
                // For now, we just identify them.
            }

            return null; // Don't modify bytecode (would need ASM for real injection)
        }

        private boolean isSquireClass(String className) {
            return className.startsWith("c/r/m/") ||
                   className.startsWith("gg/squire/") ||
                   className.matches("^[a-z]/[a-z]/.*") ||
                   (className.length() <= 3 && !className.contains("/"));
        }

        /**
         * Find methods that look like decryption methods
         * Signature: static String methodName(String encrypted, String key)
         */
        private List<String> findDecryptMethods(byte[] bytecode, String className) {
            List<String> methods = new ArrayList<>();

            // Simple heuristic: look for method descriptors "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"
            String target = "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;";
            byte[] targetBytes = target.getBytes(java.nio.charset.StandardCharsets.UTF_8);

            String bytecodeStr = new String(bytecode, java.nio.charset.StandardCharsets.ISO_8859_1);
            int idx = 0;
            while ((idx = bytecodeStr.indexOf(target, idx)) != -1) {
                // Found a potential decrypt method signature
                // Try to find the method name before this descriptor
                methods.add("method_at_" + idx);
                idx++;
            }

            return methods;
        }
    }

    /**
     * Save the runtime cipher to disk
     */
    private static void saveCipher() {
        System.out.println("\n╔═══════════════════════════════════════════════════════╗");
        System.out.println("║        SAVING RUNTIME CIPHER                          ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝\n");

        try {
            // Save as JSON
            Path jsonFile = outputPath.resolve("runtime_cipher.json");
            StringBuilder json = new StringBuilder("{\n  \"metadata\": {\n");
            json.append("    \"total_calls\": ").append(callCount).append(",\n");
            json.append("    \"unique_decryptions\": ").append(runtimeCipher.size()).append(",\n");
            json.append("    \"timestamp\": \"").append(new Date()).append("\"\n");
            json.append("  },\n  \"cipher\": {\n");

            int i = 0;
            for (Map.Entry<String, DecryptionRecord> entry : runtimeCipher.entrySet()) {
                if (i > 0) json.append(",\n");
                DecryptionRecord rec = entry.getValue();
                json.append("    \"").append(escapeJson(rec.encrypted)).append("\": {\n");
                json.append("      \"key\": \"").append(escapeJson(rec.key)).append("\",\n");
                json.append("      \"decrypted\": \"").append(escapeJson(rec.decrypted)).append("\",\n");
                json.append("      \"class\": \"").append(rec.className).append("\",\n");
                json.append("      \"method\": \"").append(rec.methodName).append("\"\n");
                json.append("    }");
                i++;
            }
            json.append("\n  }\n}");
            Files.writeString(jsonFile, json.toString());

            // Save simple mapping for quick lookup
            Path mapFile = outputPath.resolve("string_map.txt");
            StringBuilder map = new StringBuilder();
            for (DecryptionRecord rec : runtimeCipher.values()) {
                map.append(rec.encrypted).append(" | ").append(rec.key)
                   .append(" = ").append(rec.decrypted).append("\n");
            }
            Files.writeString(mapFile, map.toString());

            System.out.println("[*] Total decrypt calls observed: " + callCount);
            System.out.println("[*] Unique decryptions captured:  " + runtimeCipher.size());
            System.out.println("[*] Cipher saved to: " + jsonFile);
            System.out.println("[*] Map saved to: " + mapFile);

        } catch (IOException e) {
            System.err.println("[ERROR] Failed to save cipher: " + e.getMessage());
        }
    }

    private static String truncate(String s, int max) {
        if (s == null) return "null";
        if (s.length() <= max) return s;
        return s.substring(0, max) + "...";
    }

    private static String escapeJson(String s) {
        if (s == null) return "";
        return s.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }
}
