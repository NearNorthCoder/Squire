/*
 * Deobfuscated from: c/r/m/G.java
 * Original class name: G
 * Purpose: Operating system type enumeration
 */
package squire.launcher.config;

/**
 * Enumeration of supported operating system types.
 * Used throughout the launcher for platform-specific behavior.
 */
public enum OSType {
    /**
     * Microsoft Windows operating systems
     */
    Windows,

    /**
     * Apple macOS / Mac OS X
     */
    MacOS,

    /**
     * Linux distributions
     */
    Linux,

    /**
     * Any other operating system not explicitly supported
     */
    Other
}
