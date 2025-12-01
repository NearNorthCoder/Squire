package com.squire.agent;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.matcher.ElementMatchers;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.io.*;
import java.lang.instrument.Instrumentation;
import java.nio.file.*;
import java.security.Key;
import java.security.MessageDigest;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Java Agent that captures ALL decryption operations at runtime.
 *
 * Hooks into:
 * 1. Cipher.doFinal() - captures encrypted input and decrypted output
 * 2. Cipher.init() - captures keys and algorithms
 * 3. MessageDigest.digest() - captures key derivation
 * 4. Base64.decode() - captures Base64 decoding
 *
 * Usage:
 *   java -javaagent:squire-cipher-agent.jar -jar squire-launcher.jar
 *
 * Output:
 *   ~/.squire/runtime_cipher.json - Complete cipher mapping
 */
public class SquireCipherAgent {

    // Captured data
    public static final Map<String, CipherCapture> captures = new ConcurrentHashMap<>();
    public static final List<String> cipherOps = Collections.synchronizedList(new ArrayList<>());

    // Current cipher state (thread-local for safety)
    public static final ThreadLocal<CipherState> currentCipher = new ThreadLocal<>();

    // Output directory
    public static Path outputDir;

    public static class CipherState {
        public String algorithm;
        public byte[] key;
        public byte[] iv;
        public int mode; // ENCRYPT or DECRYPT
        public long timestamp;

        public CipherState() {
            this.timestamp = System.currentTimeMillis();
        }
    }

    public static class CipherCapture {
        public byte[] input;
        public byte[] output;
        public String algorithm;
        public byte[] key;
        public String inputBase64;
        public String outputString;
        public StackTraceElement[] caller;
        public long timestamp;

        public CipherCapture(byte[] input, byte[] output, CipherState state) {
            this.input = input;
            this.output = output;
            this.algorithm = state != null ? state.algorithm : "unknown";
            this.key = state != null ? state.key : null;
            this.inputBase64 = Base64.getEncoder().encodeToString(input);
            this.outputString = tryDecodeString(output);
            this.caller = Thread.currentThread().getStackTrace();
            this.timestamp = System.currentTimeMillis();
        }

        private String tryDecodeString(byte[] bytes) {
            try {
                // Try to decode as UTF-8 string
                String s = new String(bytes, "UTF-8");
                // Check if it's printable
                if (s.chars().allMatch(c -> c >= 32 && c < 127 || c == '\n' || c == '\r' || c == '\t')) {
                    return s;
                }
            } catch (Exception e) {}
            return null;
        }
    }

    /**
     * Agent entry point
     */
    public static void premain(String args, Instrumentation inst) {
        System.out.println();
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║           SQUIRE CIPHER CAPTURE AGENT v1.0                 ║");
        System.out.println("║   Intercepts ALL decryption at runtime                     ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        System.out.println();

        // Setup output directory
        try {
            outputDir = Paths.get(System.getProperty("user.home"), ".squire", "captured");
            Files.createDirectories(outputDir);
            System.out.println("[*] Output: " + outputDir);
        } catch (IOException e) {
            outputDir = Paths.get(".");
        }

        // Install ByteBuddy hooks
        installCipherHooks(inst);
        installBase64Hooks(inst);
        installMessageDigestHooks(inst);

        // Save on shutdown
        Runtime.getRuntime().addShutdownHook(new Thread(SquireCipherAgent::saveCaptures));

        System.out.println("[*] Hooks installed. Capturing decryption operations...");
        System.out.println();
    }

    public static void agentmain(String args, Instrumentation inst) {
        premain(args, inst);
    }

    /**
     * Install hooks on javax.crypto.Cipher
     */
    private static void installCipherHooks(Instrumentation inst) {
        new AgentBuilder.Default()
            .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
            .disableClassFormatChanges()
            .type(ElementMatchers.named("javax.crypto.Cipher"))
            .transform((builder, type, classLoader, module, protectionDomain) ->
                builder
                    .visit(Advice.to(CipherInitAdvice.class)
                        .on(ElementMatchers.named("init")
                            .and(ElementMatchers.takesArguments(2))))
                    .visit(Advice.to(CipherDoFinalAdvice.class)
                        .on(ElementMatchers.named("doFinal")
                            .and(ElementMatchers.takesArguments(1))
                            .and(ElementMatchers.returns(byte[].class))))
            )
            .installOn(inst);

        System.out.println("[+] Hooked: javax.crypto.Cipher (init, doFinal)");
    }

    /**
     * Install hooks on Base64 decoder
     */
    private static void installBase64Hooks(Instrumentation inst) {
        new AgentBuilder.Default()
            .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
            .disableClassFormatChanges()
            .type(ElementMatchers.named("java.util.Base64$Decoder"))
            .transform((builder, type, classLoader, module, protectionDomain) ->
                builder.visit(Advice.to(Base64DecodeAdvice.class)
                    .on(ElementMatchers.named("decode")
                        .and(ElementMatchers.takesArguments(String.class))))
            )
            .installOn(inst);

        System.out.println("[+] Hooked: java.util.Base64.Decoder (decode)");
    }

    /**
     * Install hooks on MessageDigest
     */
    private static void installMessageDigestHooks(Instrumentation inst) {
        new AgentBuilder.Default()
            .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
            .disableClassFormatChanges()
            .type(ElementMatchers.named("java.security.MessageDigest"))
            .transform((builder, type, classLoader, module, protectionDomain) ->
                builder.visit(Advice.to(MessageDigestAdvice.class)
                    .on(ElementMatchers.named("digest")
                        .and(ElementMatchers.takesArguments(byte[].class))))
            )
            .installOn(inst);

        System.out.println("[+] Hooked: java.security.MessageDigest (digest)");
    }

    /**
     * Record a cipher operation
     */
    public static void recordCipherOp(String op) {
        cipherOps.add(String.format("[%d] %s", System.currentTimeMillis(), op));

        // Log first 100 operations
        if (cipherOps.size() <= 100) {
            System.out.println("[CIPHER] " + op);
        } else if (cipherOps.size() == 101) {
            System.out.println("[CIPHER] ... (output suppressed, see log file)");
        }
    }

    /**
     * Record a decryption capture
     */
    public static void recordCapture(byte[] input, byte[] output) {
        CipherState state = currentCipher.get();
        CipherCapture cap = new CipherCapture(input, output, state);

        // Use input as key
        String key = cap.inputBase64;
        captures.put(key, cap);

        // Log if output is a readable string
        if (cap.outputString != null && cap.outputString.length() > 0) {
            if (captures.size() <= 200) {
                System.out.printf("[DECRYPT #%d] %s -> \"%s\"%n",
                    captures.size(),
                    truncate(cap.inputBase64, 30),
                    truncate(cap.outputString, 40));
            }
        }
    }

    /**
     * Save all captures to disk
     */
    private static void saveCaptures() {
        System.out.println();
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║           SAVING CAPTURED DATA                             ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        System.out.println();

        try {
            // Save cipher mapping as JSON
            Path cipherFile = outputDir.resolve("runtime_cipher.json");
            StringBuilder json = new StringBuilder("{\n");
            json.append("  \"_metadata\": {\n");
            json.append("    \"captures\": ").append(captures.size()).append(",\n");
            json.append("    \"operations\": ").append(cipherOps.size()).append(",\n");
            json.append("    \"timestamp\": \"").append(new Date()).append("\"\n");
            json.append("  },\n");
            json.append("  \"decryptions\": {\n");

            int i = 0;
            for (Map.Entry<String, CipherCapture> entry : captures.entrySet()) {
                CipherCapture cap = entry.getValue();
                if (cap.outputString == null) continue; // Skip non-string outputs

                if (i > 0) json.append(",\n");
                json.append("    \"").append(escapeJson(entry.getKey())).append("\": ");
                json.append("\"").append(escapeJson(cap.outputString)).append("\"");
                i++;
            }

            json.append("\n  }\n}");
            Files.writeString(cipherFile, json.toString());

            // Save operations log
            Path opsFile = outputDir.resolve("cipher_operations.log");
            Files.write(opsFile, cipherOps);

            // Save detailed captures
            Path detailFile = outputDir.resolve("captures_detailed.json");
            StringBuilder detail = new StringBuilder("[\n");
            int j = 0;
            for (CipherCapture cap : captures.values()) {
                if (j > 0) detail.append(",\n");
                detail.append("  {\n");
                detail.append("    \"input_b64\": \"").append(escapeJson(cap.inputBase64)).append("\",\n");
                detail.append("    \"output\": \"").append(escapeJson(cap.outputString != null ? cap.outputString : bytesToHex(cap.output))).append("\",\n");
                detail.append("    \"algorithm\": \"").append(cap.algorithm).append("\",\n");
                detail.append("    \"key\": \"").append(cap.key != null ? bytesToHex(cap.key) : "null").append("\"\n");
                detail.append("  }");
                j++;
            }
            detail.append("\n]");
            Files.writeString(detailFile, detail.toString());

            System.out.println("[*] Decryptions captured: " + captures.size());
            System.out.println("[*] Cipher operations:    " + cipherOps.size());
            System.out.println("[*] Output files:");
            System.out.println("    - " + cipherFile);
            System.out.println("    - " + opsFile);
            System.out.println("    - " + detailFile);

        } catch (IOException e) {
            System.err.println("[ERROR] Failed to save: " + e.getMessage());
        }
    }

    // Utility methods
    private static String truncate(String s, int max) {
        if (s == null) return "null";
        return s.length() <= max ? s : s.substring(0, max) + "...";
    }

    private static String escapeJson(String s) {
        if (s == null) return "";
        return s.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }

    private static String bytesToHex(byte[] bytes) {
        if (bytes == null) return "null";
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) sb.append(String.format("%02x", b));
        return sb.toString();
    }

    // ===================== ADVICE CLASSES =====================

    /**
     * Advice for Cipher.init(int mode, Key key)
     */
    public static class CipherInitAdvice {
        @Advice.OnMethodEnter
        public static void onEnter(@Advice.Argument(0) int mode,
                                   @Advice.Argument(1) Key key,
                                   @Advice.This Cipher cipher) {
            try {
                CipherState state = new CipherState();
                state.mode = mode;
                state.algorithm = cipher.getAlgorithm();
                state.key = key.getEncoded();
                currentCipher.set(state);

                String modeStr = (mode == Cipher.DECRYPT_MODE) ? "DECRYPT" : "ENCRYPT";
                recordCipherOp(String.format("init(%s, %s, key=%s)",
                    modeStr, state.algorithm, bytesToHex(state.key)));
            } catch (Exception e) {
                // Ignore
            }
        }
    }

    /**
     * Advice for Cipher.doFinal(byte[] input)
     */
    public static class CipherDoFinalAdvice {
        @Advice.OnMethodExit
        public static void onExit(@Advice.Argument(0) byte[] input,
                                  @Advice.Return byte[] output,
                                  @Advice.This Cipher cipher) {
            try {
                CipherState state = currentCipher.get();
                if (state != null && state.mode == Cipher.DECRYPT_MODE) {
                    recordCapture(input, output);
                }
            } catch (Exception e) {
                // Ignore
            }
        }
    }

    /**
     * Advice for Base64.Decoder.decode(String)
     */
    public static class Base64DecodeAdvice {
        @Advice.OnMethodExit
        public static void onExit(@Advice.Argument(0) String input,
                                  @Advice.Return byte[] output) {
            // Only log if it looks like encrypted data
            if (input != null && input.length() >= 8 && input.length() <= 200) {
                recordCipherOp(String.format("Base64.decode(%s) -> %d bytes",
                    truncate(input, 30), output != null ? output.length : 0));
            }
        }
    }

    /**
     * Advice for MessageDigest.digest(byte[] input)
     */
    public static class MessageDigestAdvice {
        @Advice.OnMethodExit
        public static void onExit(@Advice.Argument(0) byte[] input,
                                  @Advice.Return byte[] output,
                                  @Advice.This MessageDigest md) {
            try {
                String algo = md.getAlgorithm();
                String inputStr = new String(input, "UTF-8");
                recordCipherOp(String.format("%s.digest(\"%s\") -> %s",
                    algo, truncate(inputStr, 20), bytesToHex(output)));
            } catch (Exception e) {
                // Ignore
            }
        }
    }
}
