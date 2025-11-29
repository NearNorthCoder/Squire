/*
 * Decompiled with CFR 0.152.
 */
package squire.auth;

import squire.ui.ThemeColors;
import squire.ui.ProgressPanel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

class RefreshButtonListener
extends MouseAdapter {
    final /* synthetic */ JButton bm;
    private static /* synthetic */ int[] lIllIl;
    final /* synthetic */ z bn;

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.bm.setBackground(k.INPUT_BACKGROUND);
        this.bm.repaint();
    }

    private static void lIllIll() {
        lIllIl = new int[1];
        D.lIllIl[0] = 0x8D ^ 0xB1;
    }

    D(z z2, JButton jButton) {
        this.bn = z2;
        this.bm = jButton;
    }

    static {
        D.lIllIll();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        this.bm.setBackground(new Color(lIllIl[0], lIllIl[0], lIllIl[0]));
        this.bm.repaint();
    }
}
