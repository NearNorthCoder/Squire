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
import java.io.InputStream;
import javax.swing.text.StyleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Manages custom font loading for the Squire launcher.
 * Loads Roboto font family from resources, falling back to system fonts if unavailable.
 */
public final class FontManager {

    private static final Logger log = LoggerFactory.getLogger(FontManager.class);

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

    /**
     * Fallback font family if Roboto is unavailable
     */
    private static final String FALLBACK_FONT = "SansSerif";

    static {
        GraphicsEnvironment graphicsEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font regular = null;
        Font bold = null;

        try {
            // Try to load Roboto Regular
            InputStream regularStream = FontManager.class.getResourceAsStream("/Roboto-Regular.ttf");
            if (regularStream != null) {
                Font regularBase = Font.createFont(Font.TRUETYPE_FONT, regularStream)
                    .deriveFont(Font.PLAIN, DEFAULT_SIZE);
                graphicsEnv.registerFont(regularBase);
                regular = StyleContext.getDefaultStyleContext()
                    .getFont(regularBase.getName(), Font.PLAIN, DEFAULT_SIZE);
                graphicsEnv.registerFont(regular);
                log.debug("Loaded Roboto Regular font");
            }

            // Try to load Roboto Bold
            InputStream boldStream = FontManager.class.getResourceAsStream("/Roboto-Bold.ttf");
            if (boldStream != null) {
                Font boldBase = Font.createFont(Font.TRUETYPE_FONT, boldStream)
                    .deriveFont(Font.PLAIN, DEFAULT_SIZE);
                graphicsEnv.registerFont(boldBase);
                bold = StyleContext.getDefaultStyleContext()
                    .getFont(boldBase.getName(), Font.PLAIN, DEFAULT_SIZE);
                graphicsEnv.registerFont(bold);
                log.debug("Loaded Roboto Bold font");
            }

        } catch (FontFormatException | IOException e) {
            log.warn("Failed to load custom fonts, using system fallback", e);
        }

        // Use fallback fonts if custom fonts couldn't be loaded
        if (regular == null) {
            regular = new Font(FALLBACK_FONT, Font.PLAIN, DEFAULT_SIZE);
            log.info("Using fallback font for regular: {}", FALLBACK_FONT);
        }
        if (bold == null) {
            bold = new Font(FALLBACK_FONT, Font.BOLD, DEFAULT_SIZE);
            log.info("Using fallback font for bold: {}", FALLBACK_FONT);
        }

        ROBOTO_REGULAR = regular;
        ROBOTO_BOLD = bold;
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
