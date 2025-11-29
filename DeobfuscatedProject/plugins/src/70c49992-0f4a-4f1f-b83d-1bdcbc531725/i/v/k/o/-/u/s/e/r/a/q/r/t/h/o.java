/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.g;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

@TaskDesc(name="Banking", priority=80, blocking=true)
public abstract class o
extends Task {
    protected final /* synthetic */ SquireVorkathPlugin bU;
    @Inject
    protected /* synthetic */ g bV;
    private static /* synthetic */ int[] lIlIllIIIIlll;
    protected final /* synthetic */ SquireVorkathConfig bS;
    protected final /* synthetic */ Client bT;

    private static void llIIIIIIIIllIlI() {
        lIlIllIIIIlll = new int[4];
        o.lIlIllIIIIlll[0] = (30 + 118 - 19 + 52 ^ 154 + 144 - 187 + 64) & (0x9C ^ 0xAA ^ (0x78 ^ 0x54) ^ -" ".length());
        o.lIlIllIIIIlll[1] = 0xFFFFFE3F & 0x23EF;
        o.lIlIllIIIIlll[2] = " ".length();
        o.lIlIllIIIIlll[3] = -" ".length();
    }

    protected o(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        this.bU = squireVorkathPlugin;
        this.bS = squireVorkathConfig;
        this.bT = client;
    }

    public abstract boolean Q();

    private static boolean llIIIIIIIIlllII(int n2) {
        return n2 == 0;
    }

    protected BankLoadout T() {
        return (BankLoadout)this.bS.bankLoadout().selected(BankLoadout.class);
    }

    public int U() {
        return lIlIllIIIIlll[3];
    }

    protected boolean R() {
        return this.bS.bankLocation().j().stream().anyMatch(n2 -> this.bV.d((int)n2));
    }

    static {
        o.llIIIIIIIIllIlI();
    }

    private static boolean llIIIIIIIIllllI(int n2, int n3) {
        return n2 == n3;
    }

    public boolean run() {
        o llllllllllllllIllIlIIlllIIlIlIIl;
        if (o.llIIIIIIIIllIll(this.R() ? 1 : 0)) {
            this.bU.a(this.T().needsToBank());
        }
        if (o.llIIIIIIIIlllII(llllllllllllllIllIlIIlllIIlIlIIl.bU.c() ? 1 : 0)) {
            return lIlIllIIIIlll[0];
        }
        return this.Q();
    }

    private static boolean llIIIIIIIIllIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIIIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    protected boolean S() {
        o llllllllllllllIllIlIIlllIIlIIIll;
        if (o.llIIIIIIIIlllII(this.bT.isInInstancedRegion() ? 1 : 0)) {
            return lIlIllIIIIlll[0];
        }
        int[] llllllllllllllIllIlIIlllIIlIIIlI = llllllllllllllIllIlIIlllIIlIIIll.bT.getMapRegions();
        int llllllllllllllIllIlIIlllIIlIIIIl = llllllllllllllIllIlIIlllIIlIIIlI.length;
        int llllllllllllllIllIlIIlllIIlIIIII = lIlIllIIIIlll[0];
        while (o.llIIIIIIIIlllIl(llllllllllllllIllIlIIlllIIlIIIII, llllllllllllllIllIlIIlllIIlIIIIl)) {
            int llllllllllllllIllIlIIlllIIIlllll = llllllllllllllIllIlIIlllIIlIIIlI[llllllllllllllIllIlIIlllIIlIIIII];
            if (o.llIIIIIIIIllllI(llllllllllllllIllIlIIlllIIIlllll, lIlIllIIIIlll[1])) {
                return lIlIllIIIIlll[2];
            }
            ++llllllllllllllIllIlIIlllIIlIIIII;
            "".length();
            if ("   ".length() == "   ".length()) continue;
            return ((0x76 ^ 0x48) & ~(0x6C ^ 0x52)) != 0;
        }
        return lIlIllIIIIlll[0];
    }
}

