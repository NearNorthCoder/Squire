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
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.g_Unknown;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking", priority=80, blocking=true)
public abstract class BankingTask
extends Task {
    protected final /* synthetic */ SquireVorkathPlugin bU;
    @Inject
    protected /* synthetic */ g bV;
    private static /* synthetic */ int[] lIlIllIIIIlll;
    protected final /* synthetic */ SquireVorkathConfig bS;
    protected final /* synthetic */ Client bT;

    private static void llIIIIIIIIllIlI() {
        lIlIllIIIIlll = new int[4];
        o.lIlIllIIIIlll[0] = (30 + 118 - 19 + 52 ^ 154 + 144 - 187 + 64) & (0x9C ^ 0xAA ^ (0x78 ^ 0x54) ^ -1);
        o.lIlIllIIIIlll[1] = 0xFFFFFE3F & 0x23EF;
        o.lIlIllIIIIlll[2] = 1;
        o.lIlIllIIIIlll[3] = -1;
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
        o var6;
        if (o.llIIIIIIIIllIll(this.R() ? 1 : 0)) {
            this.bU.a(this.T().needsToBank());
        }
        if (o.llIIIIIIIIlllII(var6.bU.c() ? 1 : 0)) {
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
        o var1;
        if (o.llIIIIIIIIlllII(this.bT.isInInstancedRegion() ? 1 : 0)) {
            return lIlIllIIIIlll[0];
        }
        int[] var3 = var1.bT.getMapRegions();
        int var4 = var3.length;
        int var5 = lIlIllIIIIlll[0];
        while (o.llIIIIIIIIlllIl(var5, var4)) {
            int var2 = var3[var5];
            if (o.llIIIIIIIIllllI(var2, lIlIllIIIIlll[1])) {
                return lIlIllIIIIlll[2];
            }
            ++var5;
            0;
            if (3 == 3) continue;
            return false;
        }
        return lIlIllIIIIlll[0];
    }
}

