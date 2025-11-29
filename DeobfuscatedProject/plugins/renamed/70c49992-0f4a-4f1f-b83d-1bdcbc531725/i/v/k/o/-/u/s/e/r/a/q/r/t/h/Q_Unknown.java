/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  javax.inject.Inject
 *  net.runelite.api.Client
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.Task;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import javax.inject.Inject;
import net.runelite.api.Client;

public abstract class Q_Unknown
extends Task {
    private static final /* synthetic */ int cH;
    private final /* synthetic */ Client cJ;
    @Inject
    private /* synthetic */ SquireVorkathPlugin x;
    private static /* synthetic */ int[] lIlIlIlIIlIlI;
    protected final /* synthetic */ SquireVorkathConfig cI;

    public abstract boolean Q();

    private static boolean lIlllllIlIlIIIl(int n2) {
        return n2 != 0;
    }

    private static void lIlllllIlIIllll() {
        lIlIlIlIIlIlI = new int[3];
        Q.lIlIlIlIIlIlI[0] = (0xD4 ^ 0xBD ^ (0xE2 ^ 0xBC)) & (130 + 125 - 182 + 72 ^ 35 + 52 - -12 + 67 ^ -1) & ((34 + 125 - 47 + 22 ^ 72 + 146 - 202 + 132) & (0x6B ^ 0x4E ^ (0x67 ^ 0x50) ^ -1) ^ -1);
        Q.lIlIlIlIIlIlI[1] = 0xFFFFF77F & 0x2BBF;
        Q.lIlIlIlIIlIlI[2] = 1;
    }

    protected Q(Client client, SquireVorkathConfig squireVorkathConfig) {
        this.cJ = client;
        this.cI = squireVorkathConfig;
    }

    private static boolean lIlllllIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        int n2;
        Q var4;
        if (Q.lIlllllIlIlIIIl(this.cJ.isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIlIIlIlI[0];
        }
        if (Q.lIlllllIlIlIIIl(var4.x.c() ? 1 : 0)) {
            return lIlIlIlIIlIlI[0];
        }
        int[] var7 = var4.cJ.getMapRegions();
        int var1 = lIlIlIlIIlIlI[0];
        int[] var2 = var7;
        int var3 = var2.length;
        int var6 = lIlIlIlIIlIlI[0];
        while (Q.lIlllllIlIlIIlI(var6, var3)) {
            int var5 = var2[var6];
            if (Q.lIlllllIlIlIIll(var5, lIlIlIlIIlIlI[1])) {
                var1 = lIlIlIlIIlIlI[2];
                0;
                if (-1 < ((0xB5 ^ 0xB0) & ~(0xC5 ^ 0xC0))) break;
                return false;
            }
            ++var6;
            0;
            if (((0xF8 ^ 0xAF ^ (0x55 ^ 8)) & (0x3E ^ 0x55 ^ (0xA5 ^ 0xC4) ^ -1)) >= 0) continue;
            return ((142 + 153 - 200 + 116 ^ 131 + 3 - 100 + 104) & (0x87 ^ 0x80 ^ (0x7E ^ 0x20) ^ -1)) != 0;
        }
        if (Q.lIlllllIlIlIIIl(var1) && Q.lIlllllIlIlIIIl(var4.Q() ? 1 : 0)) {
            n2 = lIlIlIlIIlIlI[2];
            0;
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

