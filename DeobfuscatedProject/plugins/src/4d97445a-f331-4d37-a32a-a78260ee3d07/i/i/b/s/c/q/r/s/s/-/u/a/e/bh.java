/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Keybind
 *  net.runelite.client.input.KeyListener
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.questing.SquireQuestHelper;
import java.awt.event.KeyEvent;
import net.runelite.client.config.Keybind;
import net.runelite.client.input.KeyListener;

public class bh
implements KeyListener {
    private static /* synthetic */ int[] llIIIlIII;
    final /* synthetic */ SquireQuestHelper fE;

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
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
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

    private static void lIlIlIllIII() {
        llIIIlIII = new int[2];
        bh.llIIIlIII[0] = " ".length();
        bh.llIIIlIII[1] = (0x2B ^ 0x2C) & ~(0x9B ^ 0x9C);
    }
}

