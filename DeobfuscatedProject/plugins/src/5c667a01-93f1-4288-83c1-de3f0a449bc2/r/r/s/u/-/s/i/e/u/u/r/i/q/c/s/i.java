/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d;

public abstract class i
extends Task {
    @Inject
    protected /* synthetic */ SquireScurriusConfig b;
    @Inject
    protected /* synthetic */ SquireScurrius a;
    private static /* synthetic */ int[] lIIlIllIlIIIl;
    @Inject
    protected /* synthetic */ Client d;

    private static boolean lIlIllIlIIlIIII(int n2, int n3) {
        return n2 == n3;
    }

    protected boolean s() {
        int n2;
        if (i.lIlIllIlIIIlllI(this.d(this.b.bank().q()) ? 1 : 0) && i.lIlIllIlIIIllll(Players.getLocal().distanceTo(this.b.bank().r()), lIIlIllIlIIIl[1])) {
            n2 = lIIlIllIlIIIl[2];
            "".length();
            if ("  ".length() > "   ".length()) {
                return ((0x6A ^ 0x5B) & ~(0x91 ^ 0xA0)) != 0;
            }
        } else {
            n2 = lIIlIllIlIIIl[0];
        }
        return n2 != 0;
    }

    private static boolean lIlIllIlIIIllll(int n2, int n3) {
        return n2 < n3;
    }

    protected BankLoadout t() {
        return (BankLoadout)this.b.bankLoadout().selected(BankLoadout.class);
    }

    protected abstract boolean a();

    public boolean d(int n2) {
        boolean bl;
        if (i.lIlIllIlIIlIIII(this.q(), n2)) {
            bl = lIIlIllIlIIIl[2];
            "".length();
            if (-" ".length() > -" ".length()) {
                return ((0x8E ^ 0xB9) & ~(0xF0 ^ 0xC7)) != 0;
            }
        } else {
            bl = lIIlIllIlIIIl[0];
        }
        return bl;
    }

    private static void lIlIllIlIIIllII() {
        lIIlIllIlIIIl = new int[3];
        i.lIIlIllIlIIIl[0] = (0x17 ^ 0xF) & ~(0x1D ^ 5);
        i.lIIlIllIlIIIl[1] = 14 + 146 - 130 + 124 ^ 33 + 86 - -29 + 0;
        i.lIIlIllIlIIIl[2] = " ".length();
    }

    public int q() {
        WorldPoint worldPoint = this.d.getLocalPlayer().getWorldLocation();
        LocalPoint localPoint = this.d.getLocalPlayer().getLocalLocation();
        if (i.lIlIllIlIIIlllI(this.d.isInInstancedRegion() ? 1 : 0)) {
            return WorldPoint.fromLocalInstance((Client)this.d, (LocalPoint)localPoint).getRegionID();
        }
        return worldPoint.getRegionID();
    }

    static {
        i.lIlIllIlIIIllII();
    }

    private static boolean lIlIllIlIIIllIl(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        if (i.lIlIllIlIIIllIl(this.a.m() ? 1 : 0)) {
            return lIIlIllIlIIIl[0];
        }
        return this.a();
    }

    private static boolean lIlIllIlIIIlllI(int n2) {
        return n2 != 0;
    }

    protected boolean c() {
        if (i.lIlIllIlIIIlllI(this.d.isInInstancedRegion() ? 1 : 0)) {
            return lIIlIllIlIIIl[2];
        }
        if (i.lIlIllIlIIIlllI(r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d.F.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return lIIlIllIlIIIl[2];
        }
        return lIIlIllIlIIIl[0];
    }
}

