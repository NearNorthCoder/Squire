/*
 * Stub class for RuneLite Launcher
 * This provides the minimal interface needed by Squire launcher
 */
package net.runelite.launcher;

/**
 * Stub for the RuneLite launcher class.
 * Provides Java version detection and launcher operations.
 */
public class Launcher {

    /**
     * Checks if running on Java 17 or higher.
     * Originally obfuscated as B()
     *
     * @return true if Java version >= 17
     */
    public static boolean isJava17OrHigher() {
        int version = Runtime.version().feature();
        return version >= 17;
    }

    /**
     * Alias for isJava17OrHigher() - matches original obfuscated name
     */
    public static boolean B() {
        return isJava17OrHigher();
    }
}
