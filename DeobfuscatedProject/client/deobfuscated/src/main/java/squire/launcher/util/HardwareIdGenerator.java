/*
 * Hardware ID Generator for Squire Launcher
 * Generates a unique hardware fingerprint from system properties.
 */
package squire.launcher.util;

import java.net.NetworkInterface;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;

/**
 * Generates a unique Hardware ID (HWID) from system properties.
 *
 * The HWID is a hash of various system identifiers including:
 * - MAC address of primary network interface
 * - Operating system name and version
 * - User name
 * - Processor architecture
 */
public final class HardwareIdGenerator {

    /**
     * Generates a unique hardware ID for this machine.
     *
     * @return A hexadecimal string representing the hardware ID
     */
    public static String generateHwid() {
        StringBuilder fingerprint = new StringBuilder();

        // Collect system properties
        fingerprint.append(getSystemProperty("os.name"));
        fingerprint.append(getSystemProperty("os.version"));
        fingerprint.append(getSystemProperty("os.arch"));
        fingerprint.append(getSystemProperty("user.name"));
        fingerprint.append(getSystemProperty("user.home"));

        // Add MAC address
        String macAddress = getMacAddress();
        if (macAddress != null) {
            fingerprint.append(macAddress);
        }

        // Add processor info
        fingerprint.append(Runtime.getRuntime().availableProcessors());

        // Hash the fingerprint
        return hashString(fingerprint.toString());
    }

    /**
     * Gets a system property, returning empty string if null.
     */
    private static String getSystemProperty(String key) {
        String value = System.getProperty(key);
        return value != null ? value : "";
    }

    /**
     * Gets the MAC address of the primary network interface.
     *
     * @return MAC address as hex string, or null if unavailable
     */
    private static String getMacAddress() {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface networkInterface = interfaces.nextElement();

                // Skip loopback and non-active interfaces
                if (networkInterface.isLoopback() || !networkInterface.isUp()) {
                    continue;
                }

                byte[] mac = networkInterface.getHardwareAddress();
                if (mac == null || mac.length == 0) {
                    continue;
                }

                // Convert to hex string
                StringBuilder macBuilder = new StringBuilder();
                for (byte b : mac) {
                    macBuilder.append(String.format("%02X", b));
                }
                return macBuilder.toString();
            }
        } catch (Exception e) {
            // Fall through to return null
        }
        return null;
    }

    /**
     * Creates a SHA-256 hash of the input string.
     *
     * @param input String to hash
     * @return Hexadecimal hash string
     */
    private static String hashString(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            // Return first 32 characters for a reasonable length
            return hexString.substring(0, 32);
        } catch (NoSuchAlgorithmException e) {
            // SHA-256 should always be available
            throw new RuntimeException("SHA-256 algorithm not available", e);
        }
    }

    // Private constructor to prevent instantiation
    private HardwareIdGenerator() {
    }
}
