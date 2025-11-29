/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import net.runelite.api.Client;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

public abstract class q_Unknown
extends Task {
    @Inject
    protected /* synthetic */ SquireVardorvisConfig t;
    @Inject
    protected /* synthetic */ SquireVardorvis s;
    @Inject
    protected /* synthetic */ Client w;
    private static /* synthetic */ int[] lIlIIlllllIIl;

    public int E() {
        WorldPoint worldPoint = this.w.getLocalPlayer().getWorldLocation();
        LocalPoint localPoint = this.w.getLocalPlayer().getLocalLocation();
        if (q.lIllllIIlIlIlll(this.w.isInInstancedRegion() ? 1 : 0)) {
            return WorldPoint.fromLocalInstance((Client)this.w, (LocalPoint)localPoint).getRegionID();
        }
        return worldPoint.getRegionID();
    }

    private static void lIllllIIlIlIlII() {
        lIlIIlllllIIl = new int[2];
        q.lIlIIlllllIIl[0] = (28 + 221 - 130 + 115 ^ 89 + 85 - 149 + 113) & (35 + 69 - 7 + 139 ^ 1 + 44 - -64 + 31 ^ -1);
        q.lIlIIlllllIIl[1] = 1;
    }

    protected boolean P() {
        return this.h(this.t.bank().E());
    }

    private static boolean lIllllIIlIlIllI(int n2, int n3) {
        return n2 == n3;
    }

    protected abstract boolean l();

    private static boolean lIllllIIlIlIlll(int n2) {
        return n2 != 0;
    }

    public boolean h(int n2) {
        boolean bl;
        if (q.lIllllIIlIlIllI(this.E(), n2)) {
            bl = lIlIIlllllIIl[1];
            0;
            if (-(0xC1 ^ 0x92 ^ (0x62 ^ 0x35)) >= 0) {
                return ((0x26 ^ 0x5D ^ (0xC2 ^ 0x93)) & (0xBF ^ 0x90 ^ (0x3D ^ 0x38) ^ -1)) != 0;
            }
        } else {
            bl = lIlIIlllllIIl[0];
        }
        return bl;
    }

    static {
        q.lIllllIIlIlIlII();
    }

    public boolean run() {
        if (q.lIllllIIlIlIlIl(this.s.h() ? 1 : 0)) {
            return lIlIIlllllIIl[0];
        }
        return this.l();
    }

    protected BankLoadout Q() {
        return (BankLoadout)this.t.bankLoadout().selected(BankLoadout.class);
    }

    private static boolean lIllllIIlIlIlIl(int n2) {
        return n2 == 0;
    }
}

