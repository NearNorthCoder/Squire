/*
 * Deobfuscated from: c/r/m/r.java, s.java
 * Original class names: r, s
 * Purpose: Mouse adapter for clickable labels with hover effects
 *
 * Note: r.java and s.java have identical logic - consolidated here.
 */
package squire.launcher.ui.components;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

/**
 * Mouse adapter that makes labels clickable with hover effects.
 * Used for link-style labels in the sidebar.
 */
public class ClickableLabelAdapter extends MouseAdapter {

    /**
     * Hover highlight color (light gray)
     * r.java uses 0x26 (38), s.java uses 0x3C (60)
     */
    private static final int HOVER_COLOR_VALUE = 38;
    private static final Color HOVER_COLOR = new Color(HOVER_COLOR_VALUE, HOVER_COLOR_VALUE, HOVER_COLOR_VALUE);

    /**
     * The action to run when clicked
     */
    private final Runnable onClick;

    /**
     * The label to apply effects to
     */
    private final JLabel label;

    /**
     * Creates a clickable label adapter.
     *
     * @param onClick Action to run when label is clicked
     * @param label The label to make clickable
     */
    public ClickableLabelAdapter(Runnable onClick, JLabel label) {
        this.onClick = onClick;
        this.label = label;
    }

    /**
     * Called when mouse exits - clears background.
     */
    @Override
    public void mouseExited(MouseEvent e) {
        label.setBackground(null);
        label.repaint();
    }

    /**
     * Called when label is clicked - runs the action.
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        onClick.run();
    }

    /**
     * Called when mouse enters - shows hover color.
     */
    @Override
    public void mouseEntered(MouseEvent e) {
        label.setBackground(HOVER_COLOR);
        label.repaint();
    }
}
