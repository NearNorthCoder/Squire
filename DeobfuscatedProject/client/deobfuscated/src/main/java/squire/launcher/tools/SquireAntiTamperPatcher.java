/*
 * SquireAntiTamperPatcher - Patches Squire.class to bypass anti-tamper checks
 *
 * The doThings() method in gg.squire.client.Squire checks if key.length() <= 8
 * and if so, uploads your client to Discord and exits. This patcher replaces
 * doThings() with an empty method.
 */
package squire.launcher.tools;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import java.util.zip.*;

/**
 * Patches Squire.class in runelite-client JAR to bypass anti-tamper.
 *
 * Usage: java SquireAntiTamperPatcher <path-to-repository2>
 *
 * This tool:
 * 1. Finds runelite-client-*.jar in repository2
 * 2. Extracts gg/squire/client/Squire.class
 * 3. Patches doThings() method to be a no-op
 * 4. Updates the JAR with patched class
 */
public class SquireAntiTamperPatcher {

    private static final String SQUIRE_CLASS_PATH = "gg/squire/client/Squire.class";

    // doThings method descriptor - private static void doThings()
    // Method name in bytecode (may be obfuscated, need to find by pattern)
    private static final byte[] DO_THINGS_SIGNATURE = {
        // "doThings" in UTF-8
        0x64, 0x6f, 0x54, 0x68, 0x69, 0x6e, 0x67, 0x73
    };

    // Pattern to find: if (key.length() <= 8)
    // BIPUSH 8, IF_ICMPGT
    private static final byte[] KEY_LENGTH_CHECK_PATTERN = {
        0x10, 0x08,  // BIPUSH 8
    };

    public static void main(String[] args) throws Exception {
        Path repository2;

        if (args.length > 0) {
            repository2 = Paths.get(args[0]);
        } else {
            // Default location
            repository2 = Paths.get(System.getProperty("user.home"), ".squire", "repository2");
        }

        if (!Files.exists(repository2)) {
            System.err.println("ERROR: repository2 not found at: " + repository2);
            System.err.println("Usage: java SquireAntiTamperPatcher <path-to-repository2>");
            System.exit(1);
        }

        System.out.println("===========================================");
        System.out.println("Squire Anti-Tamper Patcher");
        System.out.println("===========================================");
        System.out.println("Repository: " + repository2);

        // Find runelite-client JAR
        Path clientJar = findClientJar(repository2);
        if (clientJar == null) {
            System.err.println("ERROR: Could not find runelite-client-*.jar in repository2");
            System.exit(1);
        }

        System.out.println("Found client JAR: " + clientJar.getFileName());

        // Create backup
        Path backup = clientJar.resolveSibling(clientJar.getFileName() + ".backup");
        if (!Files.exists(backup)) {
            System.out.println("Creating backup: " + backup.getFileName());
            Files.copy(clientJar, backup);
        }

        // Patch the JAR
        patchJar(clientJar);

        System.out.println("===========================================");
        System.out.println("Patching complete!");
        System.out.println("===========================================");
    }

    private static Path findClientJar(Path repository2) throws IOException {
        try (var stream = Files.list(repository2)) {
            return stream
                .filter(p -> p.getFileName().toString().startsWith("runelite-client"))
                .filter(p -> p.getFileName().toString().endsWith(".jar"))
                .findFirst()
                .orElse(null);
        }
    }

    private static void patchJar(Path jarPath) throws Exception {
        System.out.println("Reading JAR...");

        // Read all entries from the JAR
        Map<String, byte[]> entries = new LinkedHashMap<>();
        Manifest manifest = null;

        try (JarFile jar = new JarFile(jarPath.toFile())) {
            manifest = jar.getManifest();

            Enumeration<JarEntry> jarEntries = jar.entries();
            while (jarEntries.hasMoreElements()) {
                JarEntry entry = jarEntries.nextElement();
                if (!entry.isDirectory()) {
                    try (InputStream is = jar.getInputStream(entry)) {
                        entries.put(entry.getName(), is.readAllBytes());
                    }
                }
            }
        }

        // Find and patch Squire.class
        if (!entries.containsKey(SQUIRE_CLASS_PATH)) {
            System.err.println("ERROR: " + SQUIRE_CLASS_PATH + " not found in JAR");
            return;
        }

        byte[] originalClass = entries.get(SQUIRE_CLASS_PATH);

        // Check if already patched
        if (isAlreadyPatched(originalClass)) {
            System.out.println("Squire.class already patched, skipping.");
            return;
        }

        System.out.println("Original Squire.class size: " + originalClass.length + " bytes");

        byte[] patchedClass = patchSquireClass(originalClass);
        entries.put(SQUIRE_CLASS_PATH, patchedClass);

        System.out.println("Patched Squire.class size: " + patchedClass.length + " bytes");

        // Write patched JAR
        System.out.println("Writing patched JAR...");

        try (JarOutputStream jos = new JarOutputStream(
                new FileOutputStream(jarPath.toFile()), manifest)) {

            for (Map.Entry<String, byte[]> entry : entries.entrySet()) {
                if (entry.getKey().equals("META-INF/MANIFEST.MF")) {
                    continue; // Skip manifest, already in JarOutputStream
                }

                JarEntry jarEntry = new JarEntry(entry.getKey());
                jos.putNextEntry(jarEntry);
                jos.write(entry.getValue());
                jos.closeEntry();
            }
        }

        System.out.println("JAR updated successfully!");
    }

    /**
     * Checks if Squire.class is already patched.
     * Returns true if the BIPUSH 8 pattern is NOT found (already patched to 0).
     */
    public static boolean isAlreadyPatched(byte[] classBytes) {
        // Look for BIPUSH 8 (0x10 0x08) followed by IF_ICMPGT (0xA3) or IF_ICMPLE (0xA4)
        for (int i = 0; i < classBytes.length - 3; i++) {
            if (classBytes[i] == 0x10 && classBytes[i + 1] == 0x08) {
                // Check if followed by comparison opcode
                for (int j = i + 2; j < Math.min(i + 10, classBytes.length); j++) {
                    if (classBytes[j] == (byte) 0xA3 || classBytes[j] == (byte) 0xA4) {
                        return false; // Found unpatched pattern
                    }
                }
            }
        }
        return true; // No unpatched pattern found
    }

    /**
     * Patches Squire.class to bypass the doThings() anti-tamper check.
     *
     * Strategy: Find the BIPUSH 8 / IF_ICMPGT pattern in doThings() and
     * change the BIPUSH 8 to BIPUSH 0, so the condition (key.length() <= 8)
     * becomes (key.length() <= 0) which is always false for any non-empty key.
     */
    private static byte[] patchSquireClass(byte[] classBytes) {
        // Find "doThings" method name in constant pool
        int doThingsIndex = findPattern(classBytes, DO_THINGS_SIGNATURE, 0);
        if (doThingsIndex == -1) {
            System.out.println("WARNING: Could not find 'doThings' method name");
            System.out.println("Attempting pattern-based patch...");
        } else {
            System.out.println("Found 'doThings' at offset: " + doThingsIndex);
        }

        // Find and patch the BIPUSH 8 pattern
        // This is the key.length() <= 8 check
        int patchCount = 0;
        byte[] patched = classBytes.clone();

        // Look for BIPUSH 8 (0x10 0x08) followed by IF_ICMPGT (0xA3)
        for (int i = 0; i < patched.length - 3; i++) {
            if (patched[i] == 0x10 && patched[i + 1] == 0x08) {
                // Check if followed by IF_ICMPGT (0xA3) or IF_ICMPLE (0xA4) within a few bytes
                boolean isAntiTamperCheck = false;
                for (int j = i + 2; j < Math.min(i + 10, patched.length); j++) {
                    if (patched[j] == (byte) 0xA3 || patched[j] == (byte) 0xA4) {
                        isAntiTamperCheck = true;
                        break;
                    }
                }

                if (isAntiTamperCheck) {
                    System.out.println("Found anti-tamper check at offset: " + i);
                    // Change BIPUSH 8 to BIPUSH 0
                    // This makes (key.length() <= 8) become (key.length() <= 0)
                    // which is false for any valid key
                    patched[i + 1] = 0x00;
                    patchCount++;
                    System.out.println("Patched: BIPUSH 8 -> BIPUSH 0");
                }
            }
        }

        if (patchCount == 0) {
            System.out.println("WARNING: No anti-tamper patterns found to patch");
            System.out.println("The class may already be patched or use different obfuscation");
        } else {
            System.out.println("Applied " + patchCount + " patch(es)");
        }

        return patched;
    }

    private static int findPattern(byte[] data, byte[] pattern, int startIndex) {
        outer:
        for (int i = startIndex; i < data.length - pattern.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (data[i + j] != pattern[j]) {
                    continue outer;
                }
            }
            return i;
        }
        return -1;
    }
}
