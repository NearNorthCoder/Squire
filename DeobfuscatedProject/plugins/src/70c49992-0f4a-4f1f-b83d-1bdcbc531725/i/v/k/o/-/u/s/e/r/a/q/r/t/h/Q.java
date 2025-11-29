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

public abstract class Q
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
        Q.lIlIlIlIIlIlI[0] = (0xD4 ^ 0xBD ^ (0xE2 ^ 0xBC)) & (130 + 125 - 182 + 72 ^ 35 + 52 - -12 + 67 ^ -" ".length()) & ((34 + 125 - 47 + 22 ^ 72 + 146 - 202 + 132) & (0x6B ^ 0x4E ^ (0x67 ^ 0x50) ^ -" ".length()) ^ -" ".length());
        Q.lIlIlIlIIlIlI[1] = 0xFFFFF77F & 0x2BBF;
        Q.lIlIlIlIIlIlI[2] = " ".length();
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
        Q llllllllllllllIllIlIllIIlIlIllIl;
        if (Q.lIlllllIlIlIIIl(this.cJ.isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIlIIlIlI[0];
        }
        if (Q.lIlllllIlIlIIIl(llllllllllllllIllIlIllIIlIlIllIl.x.c() ? 1 : 0)) {
            return lIlIlIlIIlIlI[0];
        }
        int[] llllllllllllllIllIlIllIIlIlIllII = llllllllllllllIllIlIllIIlIlIllIl.cJ.getMapRegions();
        int llllllllllllllIllIlIllIIlIlIlIll = lIlIlIlIIlIlI[0];
        int[] llllllllllllllIllIlIllIIlIlIlIlI = llllllllllllllIllIlIllIIlIlIllII;
        int llllllllllllllIllIlIllIIlIlIlIIl = llllllllllllllIllIlIllIIlIlIlIlI.length;
        int llllllllllllllIllIlIllIIlIlIlIII = lIlIlIlIIlIlI[0];
        while (Q.lIlllllIlIlIIlI(llllllllllllllIllIlIllIIlIlIlIII, llllllllllllllIllIlIllIIlIlIlIIl)) {
            int llllllllllllllIllIlIllIIlIlIIlll = llllllllllllllIllIlIllIIlIlIlIlI[llllllllllllllIllIlIllIIlIlIlIII];
            if (Q.lIlllllIlIlIIll(llllllllllllllIllIlIllIIlIlIIlll, lIlIlIlIIlIlI[1])) {
                llllllllllllllIllIlIllIIlIlIlIll = lIlIlIlIIlIlI[2];
                "".length();
                if (-" ".length() < ((0xB5 ^ 0xB0) & ~(0xC5 ^ 0xC0))) break;
                return ((0x3C ^ 0x25) & ~(0x3E ^ 0x27)) != 0;
            }
            ++llllllllllllllIllIlIllIIlIlIlIII;
            "".length();
            if (((0xF8 ^ 0xAF ^ (0x55 ^ 8)) & (0x3E ^ 0x55 ^ (0xA5 ^ 0xC4) ^ -" ".length())) >= 0) continue;
            return ((142 + 153 - 200 + 116 ^ 131 + 3 - 100 + 104) & (0x87 ^ 0x80 ^ (0x7E ^ 0x20) ^ -" ".length())) != 0;
        }
        if (Q.lIlllllIlIlIIIl(llllllllllllllIllIlIllIIlIlIlIll) && Q.lIlllllIlIlIIIl(llllllllllllllIllIlIllIIlIlIllIl.Q() ? 1 : 0)) {
            n2 = lIlIlIlIIlIlI[2];
            "".length();
            if ("   ".length() < "  ".length()) {
                return ((0x77 ^ 0x40) & ~(0x67 ^ 0x50)) != 0;
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

