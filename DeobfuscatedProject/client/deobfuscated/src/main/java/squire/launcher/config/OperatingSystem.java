/*
 * Deobfuscated from: c/r/m/F.java
 * Original class name: F
 * Purpose: Operating system detection utility
 */
package squire.launcher.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Utility class for detecting the current operating system.
 * Parses the "os.name" system property to determine the OS type.
 */
public class OperatingSystem {
    private static final Logger log = LoggerFactory.getLogger(OperatingSystem.class);

    /**
     * The detected operating system type (cached at class load)
     */
    private static final OSType currentOS;

    static {
        String osName = System.getProperty("os.name", "unknown").toLowerCase();
        currentOS = detectOS(osName);
        log.debug("Detected operating system: {}", currentOS);
    }

    /**
     * Gets the current operating system type.
     *
     * @return The detected OSType for this system
     */
    public static OSType getCurrent() {
        return currentOS;
    }

    /**
     * Detects the operating system from an OS name string.
     *
     * @param osName The os.name system property value (case-insensitive)
     * @return The detected OSType
     */
    public static OSType detectOS(String osName) {
        osName = osName.toLowerCase();

        // Check for Windows first (most common)
        if (osName.contains("win")) {
            return OSType.Windows;
        }

        // Check for macOS (darwin or mac)
        if (osName.contains("mac") || osName.contains("darwin")) {
            return OSType.MacOS;
        }

        // Check for Linux
        if (osName.contains("nux")) {
            return OSType.Linux;
        }

        // Unknown/other OS
        return OSType.Other;
    }
}
