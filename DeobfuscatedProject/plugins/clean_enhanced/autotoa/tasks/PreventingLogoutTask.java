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

    private static boolean var2(int n2, int n3) {
        return n2 < n3;
    }

    private boolean aW() {
        boolean bl2;
        Y var3;
        int var4;
        int n2 = this.ai.getKeyboardIdleTicks();
        if (Y.var2(this.ai.getMouseIdleTicks(), n2)) {
            var4 = this.ai.getMouseIdleTicks();
        }
        if (Y.var5(Y.var6(var4, var3.cq))) {
            bl2 = var1[0];
            0;
            if (2 == 3) {
                return ((19 + 69 - 7 + 49 ^ 31 + 4 - -56 + 78) & (66 + 69 - 109 + 114 ^ 69 + 30 - 44 + 112 ^ -1)) != 0;
            }
        } else {
            bl2 = var1[1];
        }
        return bl2;
    }

    static {
        Y.var7();
    }

    private long aU() {
        return (long)this.a(Math.round(ThreadLocalRandom.current().nextGaussian() * 8000.0));
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

    private static void var7() {
        var1 = new int[7];
        Y.var1[0] = 1;
        Y.var1[1] = (0xA ^ 0x4C) & ~(0xF9 ^ 0xBF);
        Y.var1[2] = 0xFFFF8999 & 0x77F7;
        Y.var1[3] = -(0xFFFFBEED & 0x4BB7) & (0xFFFF9EBD & 0x6FE6);
        Y.var1[4] = 0x92 ^ 0x9A;
        Y.var1[5] = 0xFFFFD197 & 0x2FFA;
        Y.var1[6] = 0xFFFFFFD9 & 0x1B6;
    }

    public boolean run() {
        if (Y.var8(this.aW() ? 1 : 0)) {
            this.cq = this.aU();
            Executors.newSingleThreadExecutor().submit(this::aV);
            0;
            return var1[0];
        }
        return var1[1];
    }

    private void aV() {
        KeyEvent keyEvent = new KeyEvent(this.ai.getCanvas(), var1[2], System.currentTimeMillis(), var1[3], var1[4]);
        this.ai.getCanvas().dispatchEvent(keyEvent);
        KeyEvent keyEvent2 = new KeyEvent(this.ai.getCanvas(), var1[5], System.currentTimeMillis(), var1[1], var1[4]);
        this.ai.getCanvas().dispatchEvent(keyEvent2);
        KeyEvent keyEvent3 = new KeyEvent(this.ai.getCanvas(), var1[6], System.currentTimeMillis(), var1[1], var1[4]);
        this.ai.getCanvas().dispatchEvent(keyEvent3);
    }

    private double a(double d2) {
        return Math.max(1.0, Math.min(13000.0, d2));
    }

    private static boolean var5(int n2) {
        return n2 >= 0;
    }

    private static int var6(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }
}

