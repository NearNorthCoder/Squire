/*
 * Deobfuscated from: c/r/m/B.java, C.java, D.java
 * Original class names: B, C, D
 * Purpose: Mouse adapter for button hover effects in ProfileSelectionPanel
 *
 * Note: B.java = Launch button, C.java = Delete button, D.java = Refresh button
 * All have identical logic - consolidated into single reusable class.
 */
package squire.launcher.ui.components;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import squire.launcher.util.ThemeColors;

/**
 * Mouse adapter that provides hover effects for buttons.
 * Changes button background color on mouse enter/exit.
 */
public class ButtonHoverAdapter extends MouseAdapter {

    /**
     * Hover highlight color (light gray)
     */
    private static final int HOVER_COLOR_VALUE = 44;  // 0x2C from original
    private static final Color HOVER_COLOR = new Color(HOVER_COLOR_VALUE, HOVER_COLOR_VALUE, HOVER_COLOR_VALUE);

    /**
     * The button to apply hover effects to
     */
    private final JButton button;

    /**
     * Optional button type identifier (unused, kept for API compatibility)
     */
    private final String buttonType;

    /**
     * Creates a new hover adapter for the given button.
     *
     * @param button The button to apply hover effects to
     */
    public ButtonHoverAdapter(JButton button) {
        this(button, null);
    }

    /**
     * Creates a new hover adapter for the given button with a type identifier.
     *
     * @param button The button to apply hover effects to
     * @param buttonType Optional button type identifier (e.g., "launch", "delete", "refresh")
     */
    public ButtonHoverAdapter(JButton button, String buttonType) {
        this.button = button;
        this.buttonType = buttonType;
    }

    /**
     * Called when mouse exits the button - restores default background.
     */
    @Override
    public void mouseExited(MouseEvent e) {
        button.setBackground(ThemeColors.COMPONENT_BACKGROUND);
        button.repaint();
    }

    /**
     * Called when mouse enters the button - shows hover color.
     */
    @Override
    public void mouseEntered(MouseEvent e) {
        button.setBackground(HOVER_COLOR);
        button.repaint();
    }

    /**
     * Called when button is clicked - no-op, handled by ActionListener.
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        // Click handling done via ActionListener
    }
}
