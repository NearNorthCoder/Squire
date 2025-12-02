/*
 * Deobfuscated from: c/r/m/i.java
 * Original class name: i
 * Purpose: Demo/test application for the color combobox components
 */
package squire.launcher.ui.components;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Demo application that showcases the color combobox components.
 * Creates a simple window with:
 * - An editable color combobox (using ColorListCellRenderer and ColorComboBoxEditor)
 * - A preview label that changes background based on selection
 *
 * This class is used for testing/demonstration and is not part of the
 * main launcher functionality.
 */
public class ColorComboDemo {

    /**
     * Window title
     */
    private static final String WINDOW_TITLE = "Color Demo";

    /**
     * Window width
     */
    private static final int WINDOW_WIDTH = 400;

    /**
     * Window height
     */
    private static final int WINDOW_HEIGHT = 200;

    /**
     * Main entry point for the demo application.
     * Creates a JFrame with a color combobox and preview label.
     *
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        // Create array of predefined colors
        Color[] colors = new Color[6];
        colors[0] = Color.BLACK;
        colors[1] = Color.BLUE;
        colors[2] = Color.GREEN;
        colors[3] = Color.RED;
        colors[4] = Color.WHITE;
        colors[5] = Color.YELLOW;

        // Create main frame
        JFrame frame = new JFrame(WINDOW_TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create color combobox
        JComboBox<Color> colorComboBox = new JComboBox<>(colors);
        colorComboBox.setEditable(true);
        colorComboBox.setRenderer(new ColorListCellRenderer());

        // Get initial selected color and create editor
        Color initialColor = (Color) colorComboBox.getSelectedItem();
        ColorComboBoxEditor editor = new ColorComboBoxEditor(initialColor);
        colorComboBox.setEditor(editor);

        // Add combobox to north position
        frame.add(colorComboBox, BorderLayout.NORTH);

        // Create preview label
        JLabel previewLabel = new JLabel();
        previewLabel.setOpaque(true);
        previewLabel.setBackground((Color) colorComboBox.getSelectedItem());

        // Add preview label to center
        frame.add(previewLabel, BorderLayout.CENTER);

        // Add selection listener to update preview
        ColorSelectionListener selectionListener = new ColorSelectionListener(colorComboBox, previewLabel);
        colorComboBox.addActionListener(selectionListener);

        // Configure and show frame
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setVisible(true);
    }
}
