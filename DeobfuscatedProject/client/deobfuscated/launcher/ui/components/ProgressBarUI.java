/*
 * Deobfuscated from: c/r/m/A.java, d.java
 * Original class names: A, d
 * Purpose: Custom progress bar UI for launcher panels
 *
 * Note: A.java is for ProfileSelectionPanel (z.java)
 *       d.java is for LicenseValidationPanel (c.java)
 * Both have identical styling - consolidated here.
 */
package squire.launcher.ui.components;

import java.awt.Color;
import javax.swing.plaf.basic.BasicProgressBarUI;
import squire.launcher.util.ThemeColors;

/**
 * Custom progress bar UI with dark theme colors.
 * Uses a consistent dark gray for text selection colors.
 */
public class ProgressBarUI extends BasicProgressBarUI {

    /**
     * Gets the foreground color for selected (filled) portion text.
     *
     * @return The selection foreground color
     */
    @Override
    protected Color getSelectionForeground() {
        return ThemeColors.BACKGROUND_DARK;  // k.ac = dark gray
    }

    /**
     * Gets the background color for selected (filled) portion text.
     *
     * @return The selection background color
     */
    @Override
    protected Color getSelectionBackground() {
        return ThemeColors.BACKGROUND_DARK;  // k.ac = dark gray
    }
}
