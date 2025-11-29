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
    
    final  SquireQuestHelper fE;

    private static boolean lIlIlIllIIl(int n2) {
        return n2 != 0;
    }

    public void keyTyped(KeyEvent keyEvent) {
        Keybind keybind = this.fE.fA.pauseRestart();
        if (bh.lIlIlIllIIl(keybind.matches(keyEvent) ? 1 : 0)) {
            keyEvent.consume();
        }
    }

    public bh(SquireQuestHelper squireQuestHelper) {
        this.fE = squireQuestHelper;
    }

    public void keyReleased(KeyEvent keyEvent) {
        Keybind keybind = this.fE.fA.pauseRestart();
        if (bh.lIlIlIllIIl(keybind.matches(keyEvent) ? 1 : 0)) {
            keyEvent.consume();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void keyPressed(KeyEvent keyEvent) {
        Keybind keybind = this.fE.fA.pauseRestart();
        if (bh.lIlIlIllIIl(keybind.matches(keyEvent) ? 1 : 0)) {
            void lIllIlllIIlIIII;
            int n2;
            if (bh.lIlIlIllIlI(this.fE.fu ? 1 : 0)) {
                n2 = llIIIlIII[0];

            } else {
                n2 = llIIIlIII[1];
            }
            this.fE.fu = n2;
            lIllIlllIIlIIII.consume();
        }
    }

    private static boolean lIlIlIllIlI(int n2) {
        return n2 == 0;
    }

    static {
        bh.lIlIlIllIII();
    }

}

