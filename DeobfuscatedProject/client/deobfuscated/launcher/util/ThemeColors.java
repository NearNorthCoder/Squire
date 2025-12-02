/*
 * Deobfuscated from: c/r/m/k.java
 * Original class name: k
 * Purpose: Color constants for the launcher UI theme
 */
package squire.launcher.util;

import java.awt.Color;

/**
 * Color constants used throughout the Squire launcher UI.
 * Defines a dark theme color palette.
 */
public final class ThemeColors {

    /**
     * Primary accent color - gold/orange tint
     * Used for highlights and important elements
     * RGB approximately (124, 183, 64) - greenish accent
     */
    public static final Color PRIMARY_ACCENT = new Color(124, 183, 64);

    /**
     * Secondary color - purple/magenta tint
     * Used for secondary highlights
     * RGB approximately (246, 144, 15) - orange
     */
    public static final Color SECONDARY_ACCENT = new Color(246, 144, 15);

    /**
     * Dark border color
     * RGB (40, 40, 40)
     */
    public static final Color BORDER_DARK = new Color(40, 40, 40);

    /**
     * Main background color - very dark gray
     * RGB (30, 30, 30)
     */
    public static final Color BACKGROUND_DARK = new Color(30, 30, 30);

    /**
     * Component background - slightly lighter gray
     * RGB (50, 50, 50)
     */
    public static final Color COMPONENT_BACKGROUND = new Color(50, 50, 50);

    /**
     * Track/scrollbar background color
     * RGB (60, 60, 60)
     */
    public static final Color TRACK_BACKGROUND = new Color(60, 60, 60);

    /**
     * Error/warning color - red tint
     * RGB approximately (197, 30, 30) - red
     */
    public static final Color ERROR_COLOR = new Color(197, 30, 30);

    // Private constructor to prevent instantiation
    private ThemeColors() {
    }
}
