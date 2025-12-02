/*
 * Deobfuscated from: c/r/m/j.java
 * Original class name: j
 * Purpose: ActionListener that updates a label's background based on combobox selection
 */
package squire.launcher.ui.components;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 * ActionListener that synchronizes a preview label's background color
 * with the currently selected color in a JComboBox.
 *
 * Used in the ColorComboDemo to show a preview of the selected color.
 */
class ColorSelectionListener implements ActionListener {

    /**
     * The color combobox to listen to
     */
    private final JComboBox<Color> colorComboBox;

    /**
     * The preview label to update
     */
    private final JLabel previewLabel;

    /**
     * Creates a new color selection listener.
     *
     * @param colorComboBox The combobox containing color selections
     * @param previewLabel The label whose background should reflect the selection
     */
    ColorSelectionListener(JComboBox<Color> colorComboBox, JLabel previewLabel) {
        this.colorComboBox = colorComboBox;
        this.previewLabel = previewLabel;
    }

    /**
     * Updates the preview label's background when combobox selection changes.
     *
     * @param event The action event (unused)
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        Color selectedColor = (Color) this.colorComboBox.getSelectedItem();
        this.previewLabel.setBackground(selectedColor);
    }
}
