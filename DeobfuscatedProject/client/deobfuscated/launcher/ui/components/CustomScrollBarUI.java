/*
 * Deobfuscated from: c/r/m/l.java
 * Original class name: l
 * Purpose: Custom scrollbar UI with dark theme styling
 */
package squire.launcher.ui.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicScrollBarUI;
import squire.launcher.util.ThemeColors;

/**
 * Custom scrollbar UI with dark theme colors.
 * Provides thin scrollbars with no arrow buttons.
 */
public class CustomScrollBarUI extends BasicScrollBarUI {

    /**
     * Scrollbar width in pixels
     */
    private static final int SCROLLBAR_WIDTH = 7;

    /**
     * Unit scroll increment
     */
    private static final int UNIT_INCREMENT = 16;

    /**
     * Thumb (draggable) color
     */
    private Color thumbColor;

    /**
     * Track (background) color
     */
    private Color trackColor;

    /**
     * Creates a new scrollbar UI with default dark theme colors.
     */
    public CustomScrollBarUI() {
        this.thumbColor = ThemeColors.COMPONENT_BACKGROUND;  // k.ad
        this.trackColor = ThemeColors.TRACK_BACKGROUND;      // k.ae
    }

    /**
     * Factory method for creating the UI.
     *
     * @param component The scrollbar component
     * @return New CustomScrollBarUI instance
     */
    public static ComponentUI createUI(JComponent component) {
        JScrollBar scrollBar = (JScrollBar) component;
        scrollBar.setUnitIncrement(UNIT_INCREMENT);
        scrollBar.setPreferredSize(new Dimension(SCROLLBAR_WIDTH, 0));
        return new CustomScrollBarUI();
    }

    /**
     * Sets the thumb color.
     *
     * @param color The new thumb color
     */
    public void setThumbColor(Color color) {
        this.thumbColor = color;
    }

    /**
     * Sets the track color.
     *
     * @param color The new track color
     */
    public void setTrackColor(Color color) {
        this.trackColor = color;
    }

    /**
     * Creates invisible decrease button (no arrow).
     */
    @Override
    protected JButton createDecreaseButton(int orientation) {
        return createInvisibleButton();
    }

    /**
     * Creates invisible increase button (no arrow).
     */
    @Override
    protected JButton createIncreaseButton(int orientation) {
        return createInvisibleButton();
    }

    /**
     * Creates an invisible zero-size button.
     */
    private JButton createInvisibleButton() {
        JButton button = new JButton();
        Dimension zero = new Dimension(0, 0);
        button.setPreferredSize(zero);
        button.setMinimumSize(zero);
        button.setMaximumSize(zero);
        return button;
    }

    /**
     * Paints the track (background).
     */
    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
        g.setColor(trackColor);
        g.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
    }

    /**
     * Paints the thumb (draggable part).
     */
    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
        g.setColor(thumbColor);
        g.fillRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height);
    }
}
