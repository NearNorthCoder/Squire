/*
 * Decompiled with CFR 0.152.
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import i.i.b.s.c.q.r.s.s.-.u.a.e.av;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class ax
extends KeyAdapter {
    final /* synthetic */ av dB;
    private static /* synthetic */ int[] lllIIIlIl;

    static {
        ax.llIIIIlIIIl();
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (ax.llIIIIlIIlI(this.dB.dz ? 1 : 0)) {
            this.dB.dy.setHotkey(keyEvent.getKeyCode());
            this.dB.dv.setText(KeyEvent.getKeyText(this.dB.dy.getHotkey()));
            this.dB.dz = lllIIIlIl[0];
        }
    }

    private static boolean llIIIIlIIlI(int n2) {
        return n2 != 0;
    }

    private static void llIIIIlIIIl() {
        lllIIIlIl = new int[1];
        ax.lllIIIlIl[0] = (0x92 ^ 0x8E) & ~(0x9F ^ 0x83);
    }

    ax(av av2) {
        this.dB = av2;
    }
}

