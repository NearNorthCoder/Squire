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

    private static boolean lIlllllIlIlIIIl(int n2) {
        return n2 != 0;
    }

    protected VorkathTaskBase(Client client, SquireVorkathConfig squireVorkathConfig) {
        this.cJ = client;
        this.cI = squireVorkathConfig;
    }

    private static boolean lIlllllIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        int n2;
        Q var1;
        if (Q.lIlllllIlIlIIIl(this.cJ.isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIlIIlIlI[0];
        }
        if (Q.lIlllllIlIlIIIl(var1.x.c() ? 1 : 0)) {
            return lIlIlIlIIlIlI[0];
        }
        int[] var2 = var1.cJ.getMapRegions();
        int var3 = lIlIlIlIIlIlI[0];
        int[] var4 = var2;
        int var5 = var4.length;
        int var6 = lIlIlIlIIlIlI[0];
        while (Q.lIlllllIlIlIIlI(var6, var5)) {
            int var7 = var4[var6];
            if (Q.lIlllllIlIlIIll(var7, lIlIlIlIIlIlI[1])) {
                var3 = lIlIlIlIIlIlI[2];

                if (-1 < ((0xB5 ^ 0xB0) & ~(0xC5 ^ 0xC0))) break;
                return false;
            }
            ++var6;

            if (((0xF8 ^ 0xAF ^ (0x55 ^ 8)) & (0x3E ^ 0x55 ^ (0xA5 ^ 0xC4) ^ -1)) >= 0) continue;
            return ((142 + 153 - 200 + 116 ^ 131 + 3 - 100 + 104) & (0x87 ^ 0x80 ^ (0x7E ^ 0x20) ^ -1)) != 0;
        }
        if (Q.lIlllllIlIlIIIl(var3) && Q.lIlllllIlIlIIIl(var1.VorkathTaskBase() ? 1 : 0)) {
            n2 = lIlIlIlIIlIlI[2];

            if (3 < 2) {
                return false;
            }
        } else {
            n2 = lIlIlIlIIlIlI[0];
        }
        return n2 != 0;
    }

    private static boolean lIlllllIlIlIIll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        Q.lIlllllIlIIllll();
        cH = lIlIlIlIIlIlI[1];
    }
}

