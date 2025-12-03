/*
 * Bypassed Squire class - Anti-tamper code disabled
 * TODO: Re-enable anti-tamper checks when proper licensing is implemented
 *
 * This class replaces the original gg.squire.client.Squire to bypass:
 * 1. The doThings() anti-tamper that calls System.exit(0) for short keys
 * 2. Discord webhook uploads of client JARs
 * 3. Launcher version checks that could block startup
 */
package gg.squire.client;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.LinkOption;
import java.util.Objects;
import java.util.Scanner;
import java.util.UUID;

/**
 * Bypassed Squire authentication and state management.
 * Anti-tamper protections have been disabled for local development.
 */
public class Squire {

    public static final File SQUIRE_HOME = new File(System.getProperty("user.home") + "/.squire/");
    public static final String VERSION = "1.3.2";

    private static String key;
    private static String identifier;
    private static boolean reloading;
    private static String ip;
    private static UUID uuid;
    private static volatile Squire instance;
    private static String hash;
    private static String discordId;

    // Stub fields for compatibility - these would normally reference other classes
    private static Object nog; // EggNog
    private static Object linkage; // Linkage

    public Squire() {
        instance = this;
    }

    private static Squire getInstance() {
        return instance;
    }

    /**
     * Sets the authentication key and identifier.
     * BYPASSED: doThings() anti-tamper check is disabled.
     */
    public static void setAuthentication(String key, String identifier) {
        System.out.println("[BYPASS] Squire.setAuthentication() called with key length: " +
            (key != null ? key.length() : "null"));
        Squire.key = key;
        Squire.identifier = Objects.requireNonNullElse(identifier, "null");
        uuid = UUID.randomUUID();
        Squire.storeKey();

        // TODO: Re-enable when proper licensing is implemented
        // Squire.doThings();
        doThingsBypassed();
    }

    /**
     * BYPASSED version of doThings() - anti-tamper disabled.
     * Original code would:
     * 1. Check launcher version
     * 2. If key.length() <= 8 or contains space: upload client JAR to Discord webhook and System.exit(0)
     */
    private static void doThingsBypassed() {
        System.out.println("[BYPASS] doThings() - Anti-tamper check DISABLED");

        // TODO: Re-enable these checks when ready
        // Squire.checkIfLauncherUpToDate();

        // DISABLED: Anti-tamper code that kills the client for short keys
        /*
        if (key.contains(" ") || key.length() <= 8) {
            System.out.println("Test");
            // ... uploads client JAR to Discord webhook ...
            // System.exit(0);  // THIS IS WHAT KILLED THE CLIENT
        }
        */

        System.out.println("[BYPASS] Authentication accepted, client will continue loading");
    }

    /**
     * Original doThings() - DISABLED
     */
    @SuppressWarnings("unused")
    private static void doThings() {
        // DISABLED - this contains the anti-tamper that calls System.exit(0)
        doThingsBypassed();
    }

    private static void checkIfLauncherUpToDate() {
        // DISABLED - launcher version check bypassed
        System.out.println("[BYPASS] checkIfLauncherUpToDate() - skipped");
    }

    public static String readKeyFile() {
        File keyFile = new File(SQUIRE_HOME, "cfg.sqr");
        // MouseRecording.transfer(); // Requires RuneLite classes - skipped
        if (!keyFile.exists()) {
            return null;
        }
        try (Scanner reader = new Scanner(keyFile)) {
            if (!reader.hasNextLine()) {
                return "";
            }
            return reader.nextLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void storeKey() {
        String key;
        File keyFile = new File(SQUIRE_HOME, "cfg.sqr");
        if (!keyFile.exists()) {
            try {
                if ((SQUIRE_HOME.exists() || SQUIRE_HOME.mkdirs()) && !keyFile.createNewFile()) {
                    return;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if ((key = Squire.getKey()) == null || key.isEmpty()) {
            return;
        }
        try (FileWriter writer = new FileWriter(keyFile)) {
            writer.write(key);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void stop() {
        // Requires PluginManager - stubbed
        System.out.println("[BYPASS] Squire.stop() called - no-op");
    }

    public static void initialize() {
        System.out.println("[BYPASS] Squire.initialize() called");
        // Would normally register with event bus and compute hash
        // Static.getEventBus().register((Object)Squire.getInstance());
        // HashUtil hu = new HashUtil();
        // hash = hu.getCurrentHash();
        hash = "BYPASSED";
    }

    public static void boggers() {
        System.out.println("[BYPASS] Squire.boggers() called - no-op");
        // Would normally start EggNog telemetry
        // nog = new EggNog();
        // nog.start(Squire.bogger());
    }

    private static String bogger() {
        java.util.Map<String, String> env = System.getenv();
        if (env.containsKey("COMPUTERNAME")) {
            return env.get("COMPUTERNAME");
        }
        return env.getOrDefault("HOSTNAME", "Unknown Computer");
    }

    public static void capture(String s) {
        // No-op
    }

    public static Path getTempDir() {
        Path path = SQUIRE_HOME.toPath().resolve("cache").resolve("temp");
        if (!Files.exists(path, new LinkOption[0])) {
            try {
                Files.createDirectories(path, new FileAttribute[0]);
            } catch (IOException e) {
                // Ignore
            }
        }
        return path;
    }

    public static File getInstanceFile() {
        // Stubbed - returns null
        return null;
    }

    public static boolean setPluginEnabled(Object plugin, boolean enabled) {
        // Stubbed
        return true;
    }

    public static void createClickMarkers() {
        // Requires Client/SpritePixels - no-op
    }

    public static void sendSquireClick(Object mouse) {
        // Requires Client - no-op
    }

    public static void claim(String v1, String v2) {
        // Disabled webhook call
        System.out.println("[BYPASS] Squire.claim() called - webhook disabled");
    }

    public static void wh(String c) {
        // Disabled webhook call
        System.out.println("[BYPASS] Squire.wh() called - webhook disabled");
    }

    public static void checkDiscordId(String userId) {
        // Would set on client - stubbed
        System.out.println("[BYPASS] checkDiscordId: " + userId);
    }

    public static boolean platformValidate(String v1, String v2) {
        return false;
    }

    public static String amazonCheck() {
        try {
            java.net.HttpURLConnection connection = (java.net.HttpURLConnection)
                new java.net.URL("http://checkip.amazonaws.com/").openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            java.io.BufferedReader reader = new java.io.BufferedReader(
                new java.io.InputStreamReader(connection.getInputStream()));
            String ip = reader.readLine();
            reader.close();
            connection.disconnect();
            return ip;
        } catch (IOException e) {
            return "Unknown";
        }
    }

    public static java.util.List<String> check() {
        return new java.util.ArrayList<>();
    }

    public static java.util.List<String> valid() {
        return java.util.Collections.singletonList("squire");
    }

    public static String transform(String name) {
        return name;
    }

    // Getters and setters

    public static String getKey() {
        return key;
    }

    public static String getIdentifier() {
        return identifier;
    }

    public static boolean isReloading() {
        return reloading;
    }

    public static void setReloading(boolean reloading) {
        Squire.reloading = reloading;
    }

    public static String getIp() {
        return ip;
    }

    public static void setIp(String ip) {
        Squire.ip = ip;
    }

    public static UUID getUuid() {
        return uuid;
    }

    public static String getHash() {
        return hash;
    }

    public static void setHash(String hash) {
        Squire.hash = hash;
    }

    public static void setDiscordId(String discordId) {
        Squire.discordId = discordId;
    }

    public static Object getLinkage() {
        return linkage;
    }

    public static void setLinkage(Object linkage) {
        Squire.linkage = linkage;
    }
}
