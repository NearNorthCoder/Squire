/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.awt.event.KeyEvent;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import net.runelite.api.Client;

@TaskDesc(name="Preventing Logout")
public class PreventingLogoutTask
extends Task {
    @Inject
    private  Client bv;
    
    private  long cG;

    static {
        B.lIIIllIlIIllllI();
    }

    private long bV() {
        return (long)this.b(Math.round(ThreadLocalRandom.current().nextGaussian() * 8000.0));
    }

    private static boolean lIIIllIlIlIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private double b(double d2) {
        return Math.max(1.0, Math.min(13000.0, d2));
    }

    public boolean run() {
        if (B.lIIIllIlIIlllll(this.bX() ? 1 : 0)) {
            this.cG = this.bV();
            Executors.newSingleThreadExecutor().submit(this::bW);

            return lllIllIlIllI[0];
        }
        return lllIllIlIllI[1];
    }

    private static boolean lIIIllIlIIlllll(int n2) {
        return n2 != 0;
    }

    private boolean bX() {
        boolean bl;
        B var1;
        int var2;
        int n2 = this.bv.getKeyboardIdleTicks();
        if (B.lIIIllIlIlIIIIl(this.bv.getMouseIdleTicks(), n2)) {
            var2 = this.bv.getMouseIdleTicks();
        }
        if (B.lIIIllIlIlIIIlI(B.lIIIllIlIlIIIII(var2, var1.cG))) {
            bl = lllIllIlIllI[0];

            if (3 <= -1) {
                return false;
            }
        } else {
            bl = lllIllIlIllI[1];
        }
        return bl;
    }

    private static boolean lIIIllIlIlIIIlI(int n2) {
        return n2 >= 0;
    }

    private void bW() {
        KeyEvent keyEvent = new KeyEvent(this.bv.getCanvas(), lllIllIlIllI[2], System.currentTimeMillis(), lllIllIlIllI[3], lllIllIlIllI[4]);
        this.bv.getCanvas().dispatchEvent(keyEvent);
        KeyEvent keyEvent2 = new KeyEvent(this.bv.getCanvas(), lllIllIlIllI[5], System.currentTimeMillis(), lllIllIlIllI[1], lllIllIlIllI[4]);
        this.bv.getCanvas().dispatchEvent(keyEvent2);
        KeyEvent keyEvent3 = new KeyEvent(this.bv.getCanvas(), lllIllIlIllI[6], System.currentTimeMillis(), lllIllIlIllI[1], lllIllIlIllI[4]);
        this.bv.getCanvas().dispatchEvent(keyEvent3);
    }

    private static int lIIIllIlIlIIIII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }
}

