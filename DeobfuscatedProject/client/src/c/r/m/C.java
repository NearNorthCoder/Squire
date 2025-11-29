/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import c.r.m.k;
import c.r.m.z;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

class C
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
        this.bk.setBackground(k.ad);
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
