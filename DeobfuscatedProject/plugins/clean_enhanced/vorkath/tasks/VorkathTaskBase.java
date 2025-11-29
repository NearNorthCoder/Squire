/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  javax.inject.Inject
 *  net.runelite.api.Client
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import javax.inject.Inject;
import net.runelite.api.Client;

public abstract class VorkathTaskBase
extends Task {
    private static final  int cH;
    private final  Client cJ;
    @Inject
    private  SquireVorkathPlugin x;
    
    protected final  SquireVorkathConfig cI;

    public abstract boolean VorkathTaskBase();

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private static void var3() {
        var1 = new int[3];
        Q.var1[0] = (0xD4 ^ 0xBD ^ (0xE2 ^ 0xBC)) & (130 + 125 - 182 + 72 ^ 35 + 52 - -12 + 67 ^ -1) & ((34 + 125 - 47 + 22 ^ 72 + 146 - 202 + 132) & (0x6B ^ 0x4E ^ (0x67 ^ 0x50) ^ -1) ^ -1);
        Q.var1[1] = 0xFFFFF77F & 0x2BBF;
        Q.var1[2] = 1;
    }

    protected VorkathTaskBase(Client client, SquireVorkathConfig squireVorkathConfig) {
        this.cJ = client;
        this.cI = squireVorkathConfig;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        int n2;
        Q var5;
        if (Q.var2(this.cJ.isInInstancedRegion() ? 1 : 0)) {
            return var1[0];
        }
        if (Q.var2(var5.x.c() ? 1 : 0)) {
            return var1[0];
        }
        int[] var6 = var5.cJ.getMapRegions();
        int var7 = var1[0];
        int[] var8 = var6;
        int var9 = var8.length;
        int var10 = var1[0];
        while (Q.var4(var10, var9)) {
            int var11 = var8[var10];
            if (Q.var12(var11, var1[1])) {
                var7 = var1[2];
                0;
                if (-1 < ((0xB5 ^ 0xB0) & ~(0xC5 ^ 0xC0))) break;
                return ((0x3C ^ 0x25) & ~(0x3E ^ 0x27)) != 0;
            }
            ++var10;
            0;
            if (((0xF8 ^ 0xAF ^ (0x55 ^ 8)) & (0x3E ^ 0x55 ^ (0xA5 ^ 0xC4) ^ -1)) >= 0) continue;
            return ((142 + 153 - 200 + 116 ^ 131 + 3 - 100 + 104) & (0x87 ^ 0x80 ^ (0x7E ^ 0x20) ^ -1)) != 0;
        }
        if (Q.var2(var7) && Q.var2(var5.VorkathTaskBase() ? 1 : 0)) {
            n2 = var1[2];
            0;
            if (3 < 2) {
                return ((0x77 ^ 0x40) & ~(0x67 ^ 0x50)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    private static boolean var12(int n2, int n3) {
        return n2 == n3;
    }

    static {
        Q.var3();
        cH = var1[1];
    }
}

