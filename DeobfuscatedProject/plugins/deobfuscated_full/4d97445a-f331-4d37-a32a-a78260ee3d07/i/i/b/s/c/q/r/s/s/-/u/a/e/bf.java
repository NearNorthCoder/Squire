/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Keybind
 *  net.runelite.client.input.KeyListener
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.prayer.prayerflicker.SquirePrayFlick;
import java.awt.event.KeyEvent;
import net.runelite.client.config.Keybind;
import net.runelite.client.input.KeyListener;

public class bf
implements KeyListener {
    final /* synthetic */ SquirePrayFlick fw;
    private static /* synthetic */ int[] lllIIIIlI;

    private static boolean llIIIIIllll(int n2) {
        return n2 != 0;
    }

    static {
        bf.llIIIIIlllI();
    }

    private static void llIIIIIlllI() {
        lllIIIIlI = new int[2];
        bf.lllIIIIlI[0] = 1;
        bf.lllIIIIlI[1] = (0xFC ^ 0xAA) & ~(0x6C ^ 0x3A);
    }

    public bf(SquirePrayFlick squirePrayFlick) {
        this.fw = squirePrayFlick;
    }

    public void keyReleased(KeyEvent keyEvent) {
        Keybind keybind = this.fw.ft.flickHotkey();
        if (bf.llIIIIIllll(keybind.matches(keyEvent) ? 1 : 0)) {
            keyEvent.consume();
        }
    }

    private static boolean llIIIIlIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public void keyPressed(KeyEvent keyEvent) {
        Keybind keybind = this.fw.ft.flickHotkey();
        if (bf.llIIIIIllll(keybind.matches(keyEvent) ? 1 : 0)) {
            void lIlIllIIlllIlll;
            int n2;
            if (bf.llIIIIlIIII(this.fw.fu ? 1 : 0)) {
                n2 = lllIIIIlI[0];
                0;
                if (3 < 1) {
                    return;
                }
            } else {
                n2 = lllIIIIlI[1];
            }
            this.fw.fu = n2;
            lIlIllIIlllIlll.consume();
        }
    }

    public void keyTyped(KeyEvent keyEvent) {
        Keybind keybind = this.fw.ft.flickHotkey();
        if (bf.llIIIIIllll(keybind.matches(keyEvent) ? 1 : 0)) {
            keyEvent.consume();
        }
    }
}

