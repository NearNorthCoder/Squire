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

public abstract class N_Unknown
extends Task {
    protected final /* synthetic */ SquireVorkathConfig cw;
    @Inject
    private /* synthetic */ SquireVorkathPlugin x;
    private final /* synthetic */ Client cx;
    public static final /* synthetic */ int cu;
    private static final /* synthetic */ int cv;
    private static /* synthetic */ int[] lIlIlIllIIlll;

    private static boolean lIlllllllIlIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlllllllIIllII() {
        lIlIlIllIIlll = new int[4];
        N.lIlIlIllIIlll[0] = (0x88 ^ 0xC5) & ~(0xD1 ^ 0x9C);
        N.lIlIlIllIIlll[1] = -(0xFFFFF4D7 & 0x5F2F) & (0xFFFFFDBF & 0x7F7F);
        N.lIlIlIllIIlll[2] = -(0xFFFFD25F & 0x6DE3) & (0xFFFFEDFA & 0x7B7F);
        N.lIlIlIllIIlll[3] = 1;
    }

    private static boolean lIlllllllIIllll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlllllllIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        N.lIlllllllIIllII();
        cu = lIlIlIllIIlll[2];
        cv = lIlIlIllIIlll[1];
    }

    private static boolean lIlllllllIIllIl(int n2) {
        return n2 != 0;
    }

    protected N(Client client, SquireVorkathConfig squireVorkathConfig) {
        this.cx = client;
        this.cw = squireVorkathConfig;
    }

    public abstract boolean Q();

    public boolean run() {
        int n2;
        N var2;
        if (N.lIlllllllIIllIl(this.cx.isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIllIIlll[0];
        }
        if (N.lIlllllllIIllIl(var2.x.c() ? 1 : 0)) {
            return lIlIlIllIIlll[0];
        }
        int[] var3 = var2.cx.getMapRegions();
        int var1 = lIlIlIllIIlll[0];
        int[] var5 = var3;
        int var6 = var5.length;
        int var4 = lIlIlIllIIlll[0];
        while (N.lIlllllllIIlllI(var4, var6)) {
            int var7 = var5[var4];
            if (!N.lIlllllllIIllll(var7, lIlIlIllIIlll[1]) || N.lIlllllllIlIIII(var7, lIlIlIllIIlll[2])) {
                var1 = lIlIlIllIIlll[3];
                0;
                if (3 >= 0) break;
                return ((0xE ^ 0x3B ^ (0x78 ^ 0x6E)) & (0x8E ^ 0xA9 ^ (0x51 ^ 0x55) ^ -1)) != 0;
            }
            ++var4;
            0;
            
            return false;
        }
        if (N.lIlllllllIIllIl(var1) && N.lIlllllllIIllIl(var2.Q() ? 1 : 0)) {
            n2 = lIlIlIllIIlll[3];
            0;
            if (((0xAD ^ 0x9C ^ (0xDD ^ 0xC2)) & (0xAC ^ 0x81 ^ 3 ^ -1)) != 0) {
                return false;
            }
        } else {
            n2 = lIlIlIllIIlll[0];
        }
        return n2 != 0;
    }
}

