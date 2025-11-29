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

    private static void var2() {
        var1 = new int[7];
        B.var1[0] = 1;
        B.var1[1] = (195 + 70 - 226 + 211 ^ 61 + 102 - 25 + 27) & (0x86 ^ 0x8C ^ (3 ^ 0x56) ^ -1);
        B.var1[2] = -(0xFFFFFE5F & 0x57EB) & (0xFFFFF7DB & 0x5FFF);
        B.var1[3] = -(0xFFFFEBFF & 0x3EB0) & (0xFFFFFEAF & 0x2FFF);
        B.var1[4] = 126 + 30 - 125 + 155 ^ 167 + 4 - 1 + 8;
        B.var1[5] = -(0xFFFFFEFD & 0x5F47) & (0xFFFFDFFE & 0x7FD7);
        B.var1[6] = 0xFFFFC7D7 & 0x39B8;
    }

    static {
        B.var2();
    }

    private long bV() {
        return (long)this.b(Math.round(ThreadLocalRandom.current().nextGaussian() * 8000.0));
    }

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private double b(double d2) {
        return Math.max(1.0, Math.min(13000.0, d2));
    }

    public boolean run() {
        if (B.var4(this.bX() ? 1 : 0)) {
            this.cG = this.bV();
            Executors.newSingleThreadExecutor().submit(this::bW);
            0;
            return var1[0];
        }
        return var1[1];
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private boolean bX() {
        boolean bl;
        B var5;
        int var6;
        int n2 = this.bv.getKeyboardIdleTicks();
        if (B.var3(this.bv.getMouseIdleTicks(), n2)) {
            var6 = this.bv.getMouseIdleTicks();
        }
        if (B.var7(B.var8(var6, var5.cG))) {
            bl = var1[0];
            0;
            if (3 <= -1) {
                return ((0x45 ^ 0x60) & ~(0x62 ^ 0x47)) != 0;
            }
        } else {
            bl = var1[1];
        }
        return bl;
    }

    private static boolean var7(int n2) {
        return n2 >= 0;
    }

    private void bW() {
        KeyEvent keyEvent = new KeyEvent(this.bv.getCanvas(), var1[2], System.currentTimeMillis(), var1[3], var1[4]);
        this.bv.getCanvas().dispatchEvent(keyEvent);
        KeyEvent keyEvent2 = new KeyEvent(this.bv.getCanvas(), var1[5], System.currentTimeMillis(), var1[1], var1[4]);
        this.bv.getCanvas().dispatchEvent(keyEvent2);
        KeyEvent keyEvent3 = new KeyEvent(this.bv.getCanvas(), var1[6], System.currentTimeMillis(), var1[1], var1[4]);
        this.bv.getCanvas().dispatchEvent(keyEvent3);
    }

    private static int var8(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }
}

