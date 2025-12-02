/*
 * Deobfuscated from: c/r/m/e.java, E.java
 * Original class names: e, E
 * Purpose: JLabel that constrains width for text wrapping
 *
 * Note: e.java is for LicenseValidationPanel (c.java)
 *       E.java is for ProfileSelectionPanel (z.java)
 * Both use same pattern with different parent panel dimension references.
 */
package squire.launcher.ui.components;

import java.awt.Dimension;
import javax.swing.JLabel;

/**
 * A JLabel that constrains its preferred width to enable text wrapping.
 * Subtracts a margin from the parent panel width.
 */
public class WrappingLabel extends JLabel {

    /**
     * Width margin to subtract from panel width
     * e.java uses 0x0F (15), E.java uses 0x0D (13)
     */
    private static final int WIDTH_MARGIN = 15;

    /**
     * The reference width to constrain to (typically panel width)
     */
    private final int referenceWidth;

    /**
     * Creates a wrapping label with the given text and reference width.
     *
     * @param text The label text
     * @param referenceWidth The width to constrain to (usually panel width)
     */
    public WrappingLabel(String text, int referenceWidth) {
        super(text);
        this.referenceWidth = referenceWidth;
    }

    /**
     * Returns preferred size with constrained width for wrapping.
     *
     * @return The preferred size with constrained width
     */
    @Override
    public Dimension getPreferredSize() {
        Dimension size = super.getPreferredSize();
        size.width = referenceWidth - WIDTH_MARGIN;
        return size;
    }
}
