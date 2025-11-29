/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package gg.squire.toa.tasks;

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
    
    private  long aV;
    @Inject
    private  Client M;

    private static boolean lIllIlIllIlllll(int n2) {
        return n2 != 0;
    }

    private double a(double d2) {
        return Math.max(1.0, Math.min(13000.0, d2));
    }

    private long K() {
        return (long)this.a(Math.round(ThreadLocalRandom.current().nextGaussian() * 8000.0));
    }

    private void L() {
        KeyEvent keyEvent = new KeyEvent(this.M.getCanvas(), lIlIIIIIIIllI[2], System.currentTimeMillis(), lIlIIIIIIIllI[3], lIlIIIIIIIllI[4]);
        this.M.getCanvas().dispatchEvent(keyEvent);
        KeyEvent keyEvent2 = new KeyEvent(this.M.getCanvas(), lIlIIIIIIIllI[5], System.currentTimeMillis(), lIlIIIIIIIllI[1], lIlIIIIIIIllI[4]);
        this.M.getCanvas().dispatchEvent(keyEvent2);
        KeyEvent keyEvent3 = new KeyEvent(this.M.getCanvas(), lIlIIIIIIIllI[6], System.currentTimeMillis(), lIlIIIIIIIllI[1], lIlIIIIIIIllI[4]);
        this.M.getCanvas().dispatchEvent(keyEvent3);
    }

    private boolean M() {
        boolean bl;
        B var1;
        int var2;
        int n2 = this.M.getKeyboardIdleTicks();
        if (B.lIllIlIlllIIIIl(this.M.getMouseIdleTicks(), n2)) {
            var2 = this.M.getMouseIdleTicks();
        }
        if (B.lIllIlIlllIIIlI(B.lIllIlIlllIIIII(var2, var1.aV))) {
            bl = lIlIIIIIIIllI[0];

            if (-1 > 1) {
                return false;
            }
        } else {
            bl = lIlIIIIIIIllI[1];
        }
        return bl;
    }

    static {
        B.lIllIlIllIllllI();
    }

    public boolean run() {
        if (B.lIllIlIllIlllll(this.M() ? 1 : 0)) {
            this.aV = this.K();
            Executors.newSingleThreadExecutor().submit(this::L);

            return lIlIIIIIIIllI[0];
        }
        return lIlIIIIIIIllI[1];
    }

    private static boolean lIllIlIlllIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static int lIllIlIlllIIIII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean lIllIlIlllIIIlI(int n2) {
        return n2 >= 0;
    }
}

