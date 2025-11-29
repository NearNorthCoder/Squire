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

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private double a(double d2) {
        return Math.max(1.0, Math.min(13000.0, d2));
    }

    private long K() {
        return (long)this.a(Math.round(ThreadLocalRandom.current().nextGaussian() * 8000.0));
    }

    private static void var3() {
        var1 = new int[7];
        B.var1[0] = 1;
        B.var1[1] = (0x7A ^ 0x2A) & ~(0xC2 ^ 0x92);
        B.var1[2] = -(0xFFFFFF7D & 0x7AAF) & (0xFFFFFBFF & 0x7FBD);
        B.var1[3] = 0xFFFFD467 & 0x2F98;
        B.var1[4] = 0x5C ^ 0x59 ^ (0x5D ^ 0x50);
        B.var1[5] = -(0xFFFFBBE6 & 0x661B) & (0xFFFFFBD3 & 0x27BF);
        B.var1[6] = 0xFFFFBB9A & 0x45F5;
    }

    private void L() {
        KeyEvent keyEvent = new KeyEvent(this.M.getCanvas(), var1[2], System.currentTimeMillis(), var1[3], var1[4]);
        this.M.getCanvas().dispatchEvent(keyEvent);
        KeyEvent keyEvent2 = new KeyEvent(this.M.getCanvas(), var1[5], System.currentTimeMillis(), var1[1], var1[4]);
        this.M.getCanvas().dispatchEvent(keyEvent2);
        KeyEvent keyEvent3 = new KeyEvent(this.M.getCanvas(), var1[6], System.currentTimeMillis(), var1[1], var1[4]);
        this.M.getCanvas().dispatchEvent(keyEvent3);
    }

    private boolean M() {
        boolean bl;
        B var4;
        int var5;
        int n2 = this.M.getKeyboardIdleTicks();
        if (B.var6(this.M.getMouseIdleTicks(), n2)) {
            var5 = this.M.getMouseIdleTicks();
        }
        if (B.var7(B.var8(var5, var4.aV))) {
            bl = var1[0];
            0;
            if (-1 > 1) {
                return ((0xA3 ^ 0x8C) & ~(0x96 ^ 0xB9)) != 0;
            }
        } else {
            bl = var1[1];
        }
        return bl;
    }

    static {
        B.var3();
    }

    public boolean run() {
        if (B.var2(this.M() ? 1 : 0)) {
            this.aV = this.K();
            Executors.newSingleThreadExecutor().submit(this::L);
            0;
            return var1[0];
        }
        return var1[1];
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    private static int var8(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean var7(int n2) {
        return n2 >= 0;
    }
}

