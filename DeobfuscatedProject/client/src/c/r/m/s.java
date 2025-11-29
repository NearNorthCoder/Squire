/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

class s
extends MouseAdapter {
    private static /* synthetic */ int[] lIIlII;
    final /* synthetic */ Runnable ax;
    final /* synthetic */ JLabel ay;

    s(Runnable runnable, JLabel jLabel) {
        this.ax = runnable;
        this.ay = jLabel;
    }

    private static void lIIlIIl() {
        lIIlII = new int[1];
        s.lIIlII[0] = 0x6F ^ 0x53;
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        this.ay.setBackground(new Color(lIIlII[0], lIIlII[0], lIIlII[0]));
        this.ay.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        this.ax.run();
    }

    static {
        s.lIIlIIl();
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.ay.setBackground(null);
        this.ay.repaint();
    }
}
