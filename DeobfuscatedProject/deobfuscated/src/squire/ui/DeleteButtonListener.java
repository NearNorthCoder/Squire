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

class DeleteButtonListener
extends MouseAdapter {
    final /* synthetic */ JButton bk;
    final /* synthetic */ z bl;
    private static /* synthetic */ int[] lIIIlIl;

    private static void lIIIlllI() {
        lIIIlIl = new int[1];
        C.lIIIlIl[0] = 126 + 114 - 129 + 144 ^ 117 + 6 - -45 + 27;
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.bk.setBackground(k.INPUT_BACKGROUND);
        this.bk.repaint();
    }

    static {
        C.lIIIlllI();
    }

    C(z z2, JButton jButton) {
        this.bl = z2;
        this.bk = jButton;
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        this.bk.setBackground(new Color(lIIIlIl[0], lIIIlIl[0], lIIIlIl[0]));
        this.bk.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }
}
