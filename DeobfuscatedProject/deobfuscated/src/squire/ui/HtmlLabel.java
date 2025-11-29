/*
 * Decompiled with CFR 0.152.
 */
package squire.auth;

import squire.ui.AuthPanel;
import java.awt.Dimension;
import javax.swing.JLabel;

class HtmlLabel
extends JLabel {
    final /* synthetic */ c P;
    private static /* synthetic */ int[] lI;

    e(c c2, String string) {
        this.P = c2;
        super(string);
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension dimension = super.getPreferredSize();
        dimension.width = c.B.width - lI[0];
        return dimension;
    }

    static {
        e.l();
    }

    private static void l() {
        lI = new int[1];
        e.lI[0] = 0xAB ^ 0xA4;
    }
}
