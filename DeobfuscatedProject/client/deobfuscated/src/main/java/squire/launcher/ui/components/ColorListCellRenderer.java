/*
 * Deobfuscated from: c/r/m/f.java
 * Original class name: f
 * Purpose: List cell renderer for color selection combobox
 */
package squire.launcher.ui.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.LineBorder;

/**
 * Renders colors in a JList for color selection.
 * Shows the color as the cell background with optional selection border.
 */
public class ColorListCellRenderer implements ListCellRenderer<Color> {

    /**
     * Preferred cell size
     */
    private static final Dimension CELL_SIZE = new Dimension(0, 20);

    /**
     * Default renderer to delegate to
     */
    private final DefaultListCellRenderer defaultRenderer;

    /**
     * Creates a new color list cell renderer.
     */
    public ColorListCellRenderer() {
        this.defaultRenderer = new DefaultListCellRenderer();
    }

    /**
     * Returns the component for rendering the cell.
     *
     * @param list The JList
     * @param value The color value
     * @param index Cell index
     * @param isSelected Whether the cell is selected
     * @param cellHasFocus Whether the cell has focus
     * @return The rendering component
     */
    @Override
    public Component getListCellRendererComponent(
            JList<? extends Color> list,
            Color value,
            int index,
            boolean isSelected,
            boolean cellHasFocus) {

        JLabel label = (JLabel) defaultRenderer.getListCellRendererComponent(
            list, value, index, isSelected, cellHasFocus
        );

        // Set the background to the color value
        if (value instanceof Color) {
            label.setBackground(value);
        }

        // Add border for selected/focused cells
        if (index == 0 || isSelected) {
            label.setBorder(new LineBorder(Color.DARK_GRAY));
        } else {
            label.setBorder(null);
        }

        label.setPreferredSize(CELL_SIZE);
        return label;
    }
}
