/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Keybind
 *  net.runelite.client.input.KeyListener
 */
package gg.squire.construction.tasks;

import gg.squire.basics.prayer.prayerflicker.SquirePrayFlick;
import java.awt.event.KeyEvent;
import net.runelite.client.config.Keybind;
import net.runelite.client.input.KeyListener;

public class bf
implements KeyListener {
    final  SquirePrayFlick fw;
    private static  int[] lllIIIIlI;

    static {
        bf.var1();
    }

    public bf(SquirePrayFlick squirePrayFlick) {
        this.fw = squirePrayFlick;
    }

    public void keyReleased(KeyEvent keyEvent) {
        Keybind keybind = this.fw.ft.flickHotkey();
        if ((keybind.matcheskeyEvent)) {
            keyEvent.consume();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void keyPressed(KeyEvent keyEvent) {
        Keybind keybind = this.fw.ft.flickHotkey();
        if ((keybind.matcheskeyEvent)) {
            void var2;
            int n2;
            if (this.fw.fu == 0) {
                n2 = 0;
                0;
                if (3 < 1) {
                    return;
                }
            } else {
                n2 = 1;
            }
            this.fw.fu = n2;
            var2.consume();
        }
    }

    public void keyTyped(KeyEvent keyEvent) {
        Keybind keybind = this.fw.ft.flickHotkey();
        if ((keybind.matcheskeyEvent)) {
            keyEvent.consume();
        }
    }
}

