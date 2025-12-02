/*
 * Deobfuscated from: c/r/m/E.java
 * Original class name: E
 * Purpose: JLabel subclass that constrains width for the profile selection panel
 */
package squire.launcher.ui.components;

import java.awt.Dimension;
import javax.swing.JLabel;
import squire.launcher.ui.ProfileSelectionPanel;

/**
 * A JLabel subclass that automatically constrains its preferred width
 * to fit within the ProfileSelectionPanel with some padding.
 *
 * Used for displaying wrapped text content in the profile selection panel
 * where the width needs to be constrained to prevent horizontal overflow.
 */
class ProfileWrappingLabel extends JLabel {

    /**
     * Horizontal padding to subtract from panel width
     */
    private static final int WIDTH_PADDING = 15;

    /**
     * Reference to the parent profile selection panel
     */
    private final ProfileSelectionPanel parentPanel;

    /**
     * Creates a new profile wrapping label.
     *
     * @param parentPanel The parent ProfileSelectionPanel
     * @param text The label text (typically HTML-formatted)
     */
    ProfileWrappingLabel(ProfileSelectionPanel parentPanel, String text) {
        super(text);
        this.parentPanel = parentPanel;
    }

    /**
     * Returns the preferred size with width constrained to fit the panel.
     * The width is set to ProfileSelectionPanel.PANEL_SIZE.width minus padding.
     *
     * @return The constrained preferred size
     */
    @Override
    public Dimension getPreferredSize() {
        Dimension dimension = super.getPreferredSize();
        dimension.width = ProfileSelectionPanel.PANEL_SIZE.width - WIDTH_PADDING;
        return dimension;
    }
}
