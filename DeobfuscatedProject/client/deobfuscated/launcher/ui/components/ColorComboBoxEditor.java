/*
 * Deobfuscated from: c/r/m/g.java
 * Original class name: g
 * Purpose: Editable combobox editor for color selection
 */
package squire.launcher.ui.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.event.EventListenerList;

/**
 * ComboBox editor that shows a button with the selected color.
 * Clicking the button opens a color chooser dialog.
 */
public class ColorComboBoxEditor implements ComboBoxEditor {

    /**
     * Event listener list for action events
     */
    private final EventListenerList listenerList;

    /**
     * Button that displays the selected color
     */
    private final JButton colorButton;

    /**
     * Creates a new color combobox editor.
     *
     * @param initialColor The initial color to display
     */
    public ColorComboBoxEditor(Color initialColor) {
        this.listenerList = new EventListenerList();
        this.colorButton = new JButton("");
        this.colorButton.setBackground(initialColor);

        // Add click handler to open color chooser
        this.colorButton.addActionListener(e -> {
            Color currentColor = colorButton.getBackground();
            Color newColor = JColorChooser.showDialog(
                colorButton,
                "Choose Color",
                currentColor
            );
            if (newColor != null && !newColor.equals(currentColor)) {
                colorButton.setBackground(newColor);
                fireColorChanged(newColor);
            }
        });
    }

    /**
     * Gets the editor component (the color button).
     *
     * @return The color button
     */
    @Override
    public Component getEditorComponent() {
        return colorButton;
    }

    /**
     * Sets the current item (color).
     *
     * @param item The color to set
     */
    @Override
    public void setItem(Object item) {
        if (item instanceof Color) {
            colorButton.setBackground((Color) item);
        } else if (item != null) {
            try {
                Color color = Color.decode(item.toString());
                colorButton.setBackground(color);
            } catch (NumberFormatException e) {
                // Ignore invalid color strings
            }
        }
    }

    /**
     * Gets the current item (color).
     *
     * @return The current color
     */
    @Override
    public Object getItem() {
        return colorButton.getBackground();
    }

    /**
     * Select all - no-op for this editor.
     */
    @Override
    public void selectAll() {
        // No text to select
    }

    /**
     * Adds an action listener for color changes.
     *
     * @param listener The listener to add
     */
    @Override
    public void addActionListener(ActionListener listener) {
        listenerList.add(ActionListener.class, listener);
    }

    /**
     * Removes an action listener.
     *
     * @param listener The listener to remove
     */
    @Override
    public void removeActionListener(ActionListener listener) {
        listenerList.remove(ActionListener.class, listener);
    }

    /**
     * Fires an action event when color changes.
     *
     * @param color The new color
     */
    protected void fireColorChanged(Color color) {
        Object[] listeners = listenerList.getListenerList();

        // Iterate backwards through listener pairs
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == ActionListener.class) {
                ActionEvent event = new ActionEvent(
                    colorButton,
                    ActionEvent.ACTION_PERFORMED,
                    color.toString()
                );
                ((ActionListener) listeners[i + 1]).actionPerformed(event);
            }
        }
    }
}
