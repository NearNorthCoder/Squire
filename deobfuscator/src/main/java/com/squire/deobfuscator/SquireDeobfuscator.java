package com.squire.deobfuscator;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.security.MessageDigest;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * SquireDeobfuscator - Deobfuscates encrypted strings in Squire OSRS bot plugin source code.
 *
 * Supports three encryption methods:
 * 1. XOR encryption (most common)
 * 2. Blowfish/ECB with MD5 key derivation
 * 3. DES/ECB with MD5[:8] key derivation
 *
 * Usage: java SquireDeobfuscator <input_directory> <output_directory>
 */
public class SquireDeobfuscator {

    // Statistics tracking
    private int filesProcessed = 0;
    private int filesModified = 0;
    private int stringsDecrypted = 0;
    private int deadCodeRemoved = 0;
    private int typeDeclarationsFixed = 0;
    private Map<String, Integer> decryptionMethodStats = new HashMap<>();

    // Pattern for matching encrypted string calls
    // Matches patterns like: methodName("base64string", "key")
    private static final Pattern ENCRYPTED_PATTERN = Pattern.compile(
        "\\w+\\s*\\(\\s*\"([A-Za-z0-9+/=]+)\"\\s*,\\s*\"([^\"]{5})\"\\s*\\)"
    );

    // Pattern for dead code: "".length()
    private static final Pattern EMPTY_LENGTH_PATTERN = Pattern.compile(
        "\"\"\\s*\\.\\s*length\\s*\\(\\s*\\)\\s*;"
    );

    // Pattern for dead code: if (0 != 0) { ... }
    private static final Pattern DEAD_IF_PATTERN = Pattern.compile(
        "if\\s*\\(\\s*0\\s*!=\\s*0\\s*\\)\\s*\\{[^}]*\\}"
    );

    // Pattern for JADX decompiler errors: ?? type
    private static final Pattern TYPE_ERROR_PATTERN = Pattern.compile(
        "\\?\\?(?=\\s+\\w+\\s*[=;,)])"
    );

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java SquireDeobfuscator <input_directory> <output_directory>");
            System.exit(1);
        }

        String inputDir = args[0];
        String outputDir = args[1];

        File inputDirectory = new File(inputDir);
        File outputDirectory = new File(outputDir);

        if (!inputDirectory.exists() || !inputDirectory.isDirectory()) {
            System.err.println("Error: Input directory does not exist or is not a directory: " + inputDir);
            System.exit(1);
        }

        if (!outputDirectory.exists()) {
            outputDirectory.mkdirs();
        }

        System.out.println("=== Squire Deobfuscator ===");
        System.out.println("Input directory:  " + inputDirectory.getAbsolutePath());
        System.out.println("Output directory: " + outputDirectory.getAbsolutePath());
        System.out.println();

        SquireDeobfuscator deobfuscator = new SquireDeobfuscator();

        try {
            deobfuscator.processDirectory(inputDirectory, inputDirectory, outputDirectory);
            deobfuscator.printStatistics();
        } catch (Exception e) {
            System.err.println("Error during deobfuscation: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * Recursively processes all .java files in the directory
     */
    private void processDirectory(File currentDir, File baseInputDir, File baseOutputDir) throws IOException {
        File[] files = currentDir.listFiles();
        if (files == null) {
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                processDirectory(file, baseInputDir, baseOutputDir);
            } else if (file.getName().endsWith(".java")) {
                processJavaFile(file, baseInputDir, baseOutputDir);
            }
        }
    }

    /**
     * Processes a single Java file
     */
    private void processJavaFile(File inputFile, File baseInputDir, File baseOutputDir) throws IOException {
        filesProcessed++;

        // Read the entire file
        String content = new String(Files.readAllBytes(inputFile.toPath()), StandardCharsets.UTF_8);
        String originalContent = content;

        // Deobfuscate encrypted strings
        content = deobfuscateStrings(content);

        // Remove dead code patterns
        content = removeDeadCode(content);

        // Fix type declarations
        content = fixTypeDeclarations(content);

        // Only write if content changed
        if (!content.equals(originalContent)) {
            filesModified++;

            // Calculate output path maintaining directory structure
            String relativePath = baseInputDir.toPath().relativize(inputFile.toPath()).toString();
            File outputFile = new File(baseOutputDir, relativePath);

            // Create parent directories if needed
            outputFile.getParentFile().mkdirs();

            // Write deobfuscated content
            Files.write(outputFile.toPath(), content.getBytes(StandardCharsets.UTF_8));

            System.out.println("Processed: " + relativePath);
        }
    }

    /**
     * Deobfuscates encrypted strings in the content
     */
    private String deobfuscateStrings(String content) {
        StringBuffer result = new StringBuffer();
        Matcher matcher = ENCRYPTED_PATTERN.matcher(content);

        while (matcher.find()) {
            String base64Encrypted = matcher.group(1);
            String key = matcher.group(2);

            // Try to decrypt with all three methods
            String decrypted = tryDecrypt(base64Encrypted, key);

            if (decrypted != null) {
                stringsDecrypted++;
                // Escape the decrypted string for Java string literal
                String escaped = escapeJavaString(decrypted);
                matcher.appendReplacement(result, Matcher.quoteReplacement("\"" + escaped + "\""));
            } else {
                // Keep original if decryption failed
                matcher.appendReplacement(result, Matcher.quoteReplacement(matcher.group(0)));
            }
        }
        matcher.appendTail(result);

        return result.toString();
    }

    /**
     * Tries all three decryption methods and returns the first successful result
     */
    private String tryDecrypt(String base64Encrypted, String key) {
        // Try XOR first (most common)
        String result = decryptXOR(base64Encrypted, key);
        if (result != null && isPrintableString(result)) {
            incrementMethodStat("XOR");
            return result;
        }

        // Try Blowfish
        result = decryptBlowfish(base64Encrypted, key);
        if (result != null && isPrintableString(result)) {
            incrementMethodStat("Blowfish");
            return result;
        }

        // Try DES
        result = decryptDES(base64Encrypted, key);
        if (result != null && isPrintableString(result)) {
            incrementMethodStat("DES");
            return result;
        }

        return null;
    }

    /**
     * XOR decryption: for (i, b) in encrypted: decrypted[i] = b ^ key[i % len(key)]
     */
    private String decryptXOR(String base64Encrypted, String key) {
        try {
            byte[] encrypted = Base64.getDecoder().decode(base64Encrypted);
            byte[] keyBytes = key.getBytes(StandardCharsets.UTF_8);
            byte[] decrypted = new byte[encrypted.length];

            for (int i = 0; i < encrypted.length; i++) {
                decrypted[i] = (byte) (encrypted[i] ^ keyBytes[i % keyBytes.length]);
            }

            return new String(decrypted, StandardCharsets.UTF_8);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Blowfish/ECB decryption with MD5 key derivation
     */
    private String decryptBlowfish(String base64Encrypted, String key) {
        try {
            byte[] encrypted = Base64.getDecoder().decode(base64Encrypted);

            // Derive key using MD5
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] keyBytes = md5.digest(key.getBytes(StandardCharsets.UTF_8));

            // Decrypt using Blowfish/ECB/PKCS5Padding
            SecretKeySpec secretKey = new SecretKeySpec(keyBytes, "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            byte[] decrypted = cipher.doFinal(encrypted);
            return new String(decrypted, StandardCharsets.UTF_8);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * DES/ECB decryption with MD5[:8] key derivation
     */
    private String decryptDES(String base64Encrypted, String key) {
        try {
            byte[] encrypted = Base64.getDecoder().decode(base64Encrypted);

            // Derive key using MD5, take first 8 bytes
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] md5Hash = md5.digest(key.getBytes(StandardCharsets.UTF_8));
            byte[] keyBytes = Arrays.copyOf(md5Hash, 8);

            // Decrypt using DES/ECB/PKCS5Padding
            SecretKeySpec secretKey = new SecretKeySpec(keyBytes, "DES");
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            byte[] decrypted = cipher.doFinal(encrypted);
            return new String(decrypted, StandardCharsets.UTF_8);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Checks if a string contains only printable characters
     */
    private boolean isPrintableString(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (c < 32 && c != '\n' && c != '\r' && c != '\t') {
                return false;
            }
            if (c == 127) {
                return false;
            }
        }
        return true;
    }

    /**
     * Escapes a string for use in Java string literal
     */
    private String escapeJavaString(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            switch (c) {
                case '\n':
                    result.append("\\n");
                    break;
                case '\r':
                    result.append("\\r");
                    break;
                case '\t':
                    result.append("\\t");
                    break;
                case '\\':
                    result.append("\\\\");
                    break;
                case '"':
                    result.append("\\\"");
                    break;
                default:
                    result.append(c);
            }
        }

        return result.toString();
    }

    /**
     * Removes dead code patterns from the content
     */
    private String removeDeadCode(String content) {
        String result = content;

        // Remove "".length();
        Matcher emptyMatcher = EMPTY_LENGTH_PATTERN.matcher(result);
        int emptyCount = 0;
        while (emptyMatcher.find()) {
            emptyCount++;
        }
        result = emptyMatcher.replaceAll("");
        deadCodeRemoved += emptyCount;

        // Remove if (0 != 0) { ... }
        Matcher deadIfMatcher = DEAD_IF_PATTERN.matcher(result);
        int deadIfCount = 0;
        while (deadIfMatcher.find()) {
            deadIfCount++;
        }
        result = deadIfMatcher.replaceAll("");
        deadCodeRemoved += deadIfCount;

        return result;
    }

    /**
     * Fixes ?? type declarations by replacing with int
     */
    private String fixTypeDeclarations(String content) {
        Matcher matcher = TYPE_ERROR_PATTERN.matcher(content);
        int count = 0;

        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            count++;
            matcher.appendReplacement(result, "int");
        }
        matcher.appendTail(result);

        typeDeclarationsFixed += count;
        return result.toString();
    }

    /**
     * Increments statistics for a decryption method
     */
    private void incrementMethodStat(String method) {
        decryptionMethodStats.put(method, decryptionMethodStats.getOrDefault(method, 0) + 1);
    }

    /**
     * Prints statistics about the deobfuscation process
     */
    private void printStatistics() {
        System.out.println();
        System.out.println("=== Deobfuscation Statistics ===");
        System.out.println("Files processed:         " + filesProcessed);
        System.out.println("Files modified:          " + filesModified);
        System.out.println("Strings decrypted:       " + stringsDecrypted);
        System.out.println("Dead code removed:       " + deadCodeRemoved);
        System.out.println("Type declarations fixed: " + typeDeclarationsFixed);
        System.out.println();

        if (!decryptionMethodStats.isEmpty()) {
            System.out.println("Decryption method breakdown:");
            for (Map.Entry<String, Integer> entry : decryptionMethodStats.entrySet()) {
                System.out.printf("  %-10s: %d (%.1f%%)%n",
                    entry.getKey(),
                    entry.getValue(),
                    100.0 * entry.getValue() / stringsDecrypted);
            }
        }

        System.out.println();
        System.out.println("Deobfuscation complete!");
    }
}
