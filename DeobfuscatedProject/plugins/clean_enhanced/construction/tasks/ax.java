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
    private static  int[] lllIIIlIl;

    static {
        ax.var1();
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (this.dB.dz != 0) {
            this.dB.dy.setHotkey(keyEvent.getKeyCode());
            this.dB.dv.setText(KeyEvent.getKeyText(this.dB.dy.getHotkey()));
            this.dB.dz = 0;
        }
    }

    ax(av av2) {
        this.dB = av2;
    }
}

