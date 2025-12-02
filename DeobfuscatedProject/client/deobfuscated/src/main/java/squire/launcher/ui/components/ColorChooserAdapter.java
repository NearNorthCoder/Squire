/*
 * Deobfuscated from: c/r/m/h.java
 * Original class name: h
 * Purpose: ActionListener that opens JColorChooser dialog for color selection
 */
package squire.launcher.ui.components;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JColorChooser;

/**
 * ActionListener that displays a color chooser dialog when triggered.
 * When a new color is selected, updates the parent ColorComboBoxEditor.
 *
 * Note: In the final deobfuscated code, this functionality was inlined
 * into ColorComboBoxEditor's constructor as a lambda. This class represents
 * the original separate implementation.
 */
class ColorChooserAdapter implements ActionListener {

    /**
     * Dialog title for color chooser
     */
    private static final String CHOOSE_COLOR_TITLE = "Choose Color";

    /**
     * Reference to parent color combobox editor
     */
    private final ColorComboBoxEditor editor;

    /**
     * Creates a new color chooser adapter.
     *
     * @param editor The parent ColorComboBoxEditor
     */
    ColorChooserAdapter(ColorComboBoxEditor editor) {
        this.editor = editor;
    }

    /**
     * Opens a color chooser dialog when an action is performed.
     * If a new color is selected (different from current), updates
     * the editor's color button and fires a color change event.
     *
     * @param event The action event (unused)
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        // Get current color from the editor's button
        Color currentColor = editor.getEditorComponent().getBackground();

        // Show color chooser dialog
        Color newColor = JColorChooser.showDialog(
            editor.getEditorComponent(),
            CHOOSE_COLOR_TITLE,
            currentColor
        );

        // If a new color was selected (and it's different), update
        if (newColor != null && !newColor.equals(currentColor)) {
            editor.getEditorComponent().setBackground(newColor);
            editor.fireColorChanged(newColor);
        }
    }
}
