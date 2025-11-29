/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import com.google.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.a;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.f;

public abstract class i
extends f {
    @Inject
    protected /* synthetic */ a f;
    private static /* synthetic */ int[] lIlIlllIIIlll;

    private static boolean llIIIIlIIIIlIII(int n2) {
        return n2 == 0;
    }

    private static void llIIIIlIIIIIllI() {
        lIlIlllIIIlll = new int[3];
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.i.lIlIlllIIIlll[0] = " ".length();
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.i.lIlIlllIIIlll[1] = (50 + 2 - 25 + 166 ^ 14 + 92 - 14 + 68) & (0x90 ^ 0x8B ^ (0x2E ^ 0x54) ^ -" ".length());
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.i.lIlIlllIIIlll[2] = 13 + 53 - -60 + 22 ^ 124 + 106 - 195 + 117;
    }

    private static boolean llIIIIlIIIIIlll(int n2) {
        return n2 != 0;
    }

    protected BankLoadout o() {
        return (BankLoadout)this.i.bankLoadout().selected(BankLoadout.class);
    }

    public boolean run() {
        i llllllllllllllIllIlIIIIIllIllIll;
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.i.llIIIIlIIIIIlll(this.n() ? 1 : 0) && r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.i.llIIIIlIIIIIlll(((BankLoadout)this.i.bankLoadout().selected(BankLoadout.class)).needsToBank() ? 1 : 0)) {
            this.f.a(lIlIlllIIIlll[0]);
        }
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.i.llIIIIlIIIIlIII(llllllllllllllIllIlIIIIIllIllIll.f.b() ? 1 : 0)) {
            return lIlIlllIIIlll[1];
        }
        return this.p();
    }

    protected abstract boolean p();

    private static boolean llIIIIlIIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.i.llIIIIlIIIIIllI();
    }

    protected boolean n() {
        int n2;
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.i.llIIIIlIIIIIlll(this.p.c(this.i.bank().d()) ? 1 : 0) && r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.i.llIIIIlIIIIlIIl(this.i.bank().m().distanceTo((Locatable)Players.getLocal()), lIlIlllIIIlll[2])) {
            n2 = lIlIlllIIIlll[0];
            "".length();
            if ("   ".length() < "   ".length()) {
                return ((0x7E ^ 0x33) & ~(0xB ^ 0x46)) != 0;
            }
        } else {
            n2 = lIlIlllIIIlll[1];
        }
        return n2 != 0;
    }
}

