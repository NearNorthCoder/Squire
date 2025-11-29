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

class B
extends MouseAdapter {
    private static /* synthetic */ int[] lIIlI;
    final /* synthetic */ z bj;
    final /* synthetic */ JButton bi;

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.bi.setBackground(k.ad);
        this.bi.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    static {
        B.lllII();
    }

    private static void lllII() {
        lIIlI = new int[1];
        B.lIIlI[0] = 0x32 ^ 0xE;
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        this.bi.setBackground(new Color(lIIlI[0], lIIlI[0], lIIlI[0]));
        this.bi.repaint();
    }

    B(z z2, JButton jButton) {
        this.bj = z2;
        this.bi = jButton;
    }
}
