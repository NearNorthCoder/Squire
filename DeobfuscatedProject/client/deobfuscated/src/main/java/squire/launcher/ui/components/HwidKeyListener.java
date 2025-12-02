/*
 * Deobfuscated from: c/r/m/t.java
 * Original class name: t
 * Purpose: Key listener that updates HWID field in Launcher
 */
package squire.launcher.ui.components;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import net.runelite.launcher.Launcher;

/**
 * Key listener for the HWID text field.
 * Updates the Launcher's HWID value when text changes.
 */
public class HwidKeyListener extends KeyAdapter {

    /**
     * The text field to monitor
     */
    private final JTextField textField;

    /**
     * Creates a new HWID key listener.
     *
     * @param textField The HWID text field to monitor
     */
    public HwidKeyListener(JTextField textField) {
        this.textField = textField;
    }

    /**
     * Called when a key is released - updates Launcher HWID.
     *
     * @param e The key event
     */
    @Override
    public void keyReleased(KeyEvent e) {
        Launcher.auth = textField.getText();
    }
}
