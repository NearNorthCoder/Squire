/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Keybind
 *  net.runelite.client.input.KeyListener
 */
package gg.squire.construction.tasks;

import gg.squire.basics.questing.SquireQuestHelper;
import java.awt.event.KeyEvent;
import net.runelite.client.config.Keybind;
import net.runelite.client.input.KeyListener;

public class bh
implements KeyListener {
    private static  int[] llIIIlIII;
    final  SquireQuestHelper fE;

    private static boolean var1(int n2) {
        return n2 != 0;
    }

    public void keyTyped(KeyEvent keyEvent) {
        Keybind keybind = this.fE.fA.pauseRestart();
        if (bh.var1(keybind.matches(keyEvent) ? 1 : 0)) {
            keyEvent.consume();
        }
    }

    public bh(SquireQuestHelper squireQuestHelper) {
        this.fE = squireQuestHelper;
    }

    public void keyReleased(KeyEvent keyEvent) {
        Keybind keybind = this.fE.fA.pauseRestart();
        if (bh.var1(keybind.matches(keyEvent) ? 1 : 0)) {
            keyEvent.consume();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void keyPressed(KeyEvent keyEvent) {
        Keybind keybind = this.fE.fA.pauseRestart();
        if (bh.var1(keybind.matches(keyEvent) ? 1 : 0)) {
            void var2;
            int n2;
            if (bh.var3(this.fE.fu)) {
                n2 = llIIIlIII[0];
                0;
                if (-3 > 0) {
                    return;
                }
            } else {
                n2 = llIIIlIII[1];
            }
            this.fE.fu = n2;
            var2.consume();
        }
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    static {
        bh.var4();
    }

    private static void var4() {
        llIIIlIII = new int[2];
        bh.llIIIlIII[0] = 1;
        bh.llIIIlIII[1] = (0x2B ^ 0x2C) & ~(0x9B ^ 0x9C);
    }
}

