/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

import gg.squire.construction.tasks.ConstructionManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class ax
extends KeyAdapter {
    final  av dB;

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

    ax(av av2) {
        this.dB = av2;
    }
}

