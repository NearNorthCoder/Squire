/*
 * Decompiled with CFR 0.152.
 */
package squire.auth;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

class RequestBuilder
extends MouseAdapter {
    final /* synthetic */ JLabel aw;
    private static /* synthetic */ int[] lIIllII;
    final /* synthetic */ Runnable av;

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.aw.setBackground(null);
        this.aw.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        this.av.run();
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        this.aw.setBackground(new Color(lIIllII[0], lIIllII[0], lIIllII[0]));
        this.aw.repaint();
    }

    r(Runnable runnable, JLabel jLabel) {
        this.av = runnable;
        this.aw = jLabel;
    }

    private static void lIIlIlII() {
        lIIllII = new int[1];
        r.lIIllII[0] = 0xB5 ^ 0x86 ^ (0x98 ^ 0x97);
    }

    static {
        r.lIIlIlII();
    }
}
