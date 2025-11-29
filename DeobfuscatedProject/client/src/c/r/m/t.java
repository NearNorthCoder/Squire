/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import c.r.m.q;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import net.runelite.launcher.Launcher;

class t
extends KeyAdapter {
    final /* synthetic */ q aA;
    final /* synthetic */ JTextField az;

    t(q q2, JTextField jTextField) {
        this.aA = q2;
        this.az = jTextField;
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        Launcher.aM = this.az.getText();
    }
}
