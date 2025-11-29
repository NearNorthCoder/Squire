/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package gg.squire.autotoa.tasks;

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
    
    private  long cq;
    @Inject
    private  Client ai;

    private static boolean lIlIlIllIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private boolean aW() {
        boolean bl2;
        Y var1;
        int var2;
        int n2 = this.ai.getKeyboardIdleTicks();
        if (Y.lIlIlIllIIIIIl(this.ai.getMouseIdleTicks(), n2)) {
            var2 = this.ai.getMouseIdleTicks();
        }
        if (Y.lIlIlIllIIIIlI(Y.lIlIlIllIIIIII(var2, var1.cq))) {
            bl2 = llIlllIIlII[0];

            if (2 == 3) {
                return false;
            }
        } else {
            bl2 = llIlllIIlII[1];
        }
        return bl2;
    }

    static {
        Y.lIlIlIlIlllllI();
    }

    private long aU() {
        return (long)this.a(Math.round(ThreadLocalRandom.current().nextGaussian() * 8000.0));
    }

    private static boolean lIlIlIlIllllll(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        if (Y.lIlIlIlIllllll(this.aW() ? 1 : 0)) {
            this.cq = this.aU();
            Executors.newSingleThreadExecutor().submit(this::aV);

            return llIlllIIlII[0];
        }
        return llIlllIIlII[1];
    }

    private void aV() {
        KeyEvent keyEvent = new KeyEvent(this.ai.getCanvas(), llIlllIIlII[2], System.currentTimeMillis(), llIlllIIlII[3], llIlllIIlII[4]);
        this.ai.getCanvas().dispatchEvent(keyEvent);
        KeyEvent keyEvent2 = new KeyEvent(this.ai.getCanvas(), llIlllIIlII[5], System.currentTimeMillis(), llIlllIIlII[1], llIlllIIlII[4]);
        this.ai.getCanvas().dispatchEvent(keyEvent2);
        KeyEvent keyEvent3 = new KeyEvent(this.ai.getCanvas(), llIlllIIlII[6], System.currentTimeMillis(), llIlllIIlII[1], llIlllIIlII[4]);
        this.ai.getCanvas().dispatchEvent(keyEvent3);
    }

    private double a(double d2) {
        return Math.max(1.0, Math.min(13000.0, d2));
    }

    private static boolean lIlIlIllIIIIlI(int n2) {
        return n2 >= 0;
    }

    private static int lIlIlIllIIIIII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }
}

