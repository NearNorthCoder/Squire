/*
 * Deobfuscated from: c/r/m/m.java
 * Original class name: m
 * Purpose: Loads and manages custom fonts for the launcher UI
 */
package squire.launcher.util;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import javax.swing.text.StyleContext;
import net.runelite.launcher.Launcher;

/**
 * Manages custom font loading for the Squire launcher.
 * Loads Roboto font family from resources.
 */
public final class FontManager {

    /**
     * Regular weight Roboto font (16pt)
     */
    private static final Font ROBOTO_REGULAR;

    /**
     * Bold weight Roboto font (16pt)
     */
    private static final Font ROBOTO_BOLD;

    /**
     * Default font size in points
     */
    private static final int DEFAULT_SIZE = 16;

    static {
        GraphicsEnvironment graphicsEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();

        try {
            // Load Roboto Regular
            Font regularBase = Font.createFont(
                Font.TRUETYPE_FONT,
                Launcher.class.getResourceAsStream("/Roboto-Regular.ttf")
            ).deriveFont(Font.PLAIN, DEFAULT_SIZE);
            graphicsEnv.registerFont(regularBase);
            ROBOTO_REGULAR = StyleContext.getDefaultStyleContext()
                .getFont(regularBase.getName(), Font.PLAIN, DEFAULT_SIZE);
            graphicsEnv.registerFont(ROBOTO_REGULAR);

            // Load Roboto Bold
            Font boldBase = Font.createFont(
                Font.TRUETYPE_FONT,
                Launcher.class.getResourceAsStream("/Roboto-Bold.ttf")
            ).deriveFont(Font.PLAIN, DEFAULT_SIZE);
            graphicsEnv.registerFont(boldBase);
            ROBOTO_BOLD = StyleContext.getDefaultStyleContext()
                .getFont(boldBase.getName(), Font.PLAIN, DEFAULT_SIZE);
            graphicsEnv.registerFont(ROBOTO_BOLD);

        } catch (FontFormatException e) {
            throw new RuntimeException("Failed to parse font format", e);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load font file", e);
        }
    }

    /**
     * Gets the regular weight Roboto font.
     *
     * @return The Roboto Regular font
     */
    public static Font getRegularFont() {
        return ROBOTO_REGULAR;
    }

    /**
     * Gets the bold weight Roboto font.
     *
     * @return The Roboto Bold font
     */
    public static Font getBoldFont() {
        return ROBOTO_BOLD;
    }

    // Private constructor to prevent instantiation
    private FontManager() {
    }
}
