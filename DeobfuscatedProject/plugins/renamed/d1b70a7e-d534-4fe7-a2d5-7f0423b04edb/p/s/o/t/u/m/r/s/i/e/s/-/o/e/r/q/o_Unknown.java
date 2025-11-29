/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a_Unknown;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.c_Unknown;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.l_Unknown;

public abstract class o_Unknown
extends l_Unknown {
    private static /* synthetic */ int[] lIIllIlllIlIl;

    private static boolean lIllIIIllIlIlII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean run() {
        int var4;
        int n2;
        int var1;
        int n3;
        void var5;
        void var3;
        o var2;
        c c2 = this.ar.N();
        Player player = Players.getLocal();
        if (o.lIllIIIllIIlllI(c2)) {
            return lIIllIlllIlIl[0];
        }
        if (o.lIllIIIllIIllll(var2.ak() ? 1 : 0)) {
            return lIIllIlllIlIl[0];
        }
        if ((!o.lIllIIIllIIllll(var2.as.cookFish() ? 1 : 0) || o.lIllIIIllIlIIII(var2.as.solo() ? 1 : 0)) && o.lIllIIIllIIllll(var2.au.d()) && (!o.lIllIIIllIlIIIl(var2.au.f(), var2.as.numberOfFish()) || o.lIllIIIllIlIIlI(var2.au.f()) && !o.lIllIIIllIlIIll(var3.Y().distanceTo((Locatable)var5), lIIllIlllIlIl[1]) || o.lIllIIIllIlIIII(var2.as.solo() ? 1 : 0) && o.lIllIIIllIlIlII(var2.au.b(), lIIllIlllIlIl[2]))) {
            n3 = lIIllIlllIlIl[3];
            0;
            if (3 != 3) {
                return false;
            }
        } else {
            n3 = var1 = lIIllIlllIlIl[0];
        }
        if (o.lIllIIIllIIllll(var2.as.cookFish() ? 1 : 0) && o.lIllIIIllIIllll(var2.as.solo() ? 1 : 0) && (!o.lIllIIIllIlIIIl(var2.au.d(), var2.as.numberOfFish()) || o.lIllIIIllIlIIlI(var2.au.d()) && !o.lIllIIIllIlIIll(var3.Y().distanceTo((Locatable)var5), lIIllIlllIlIl[1]) || o.lIllIIIllIlIIII(var2.as.solo() ? 1 : 0) && o.lIllIIIllIlIlII(var2.au.b(), lIIllIlllIlIl[2]))) {
            n2 = lIIllIlllIlIl[3];
            0;
            if (1 > 2) {
                return ((0xF2 ^ 0xA6 ^ (0x10 ^ 0x7B)) & (0xA ^ 0x39 ^ (0xB2 ^ 0xBE) ^ -1)) != 0;
            }
        } else {
            n2 = var4 = lIIllIlllIlIl[0];
        }
        if (o.lIllIIIllIlIIII(var2.ar.k() ? 1 : 0)) {
            return lIIllIlllIlIl[0];
        }
        if (o.lIllIIIllIIllll(var1) && o.lIllIIIllIIllll(var4)) {
            return lIIllIlllIlIl[0];
        }
        if (o.lIllIIIllIlIIll(var5.getWorldLocation().distanceTo(var3.af()), lIIllIlllIlIl[1])) {
            var2.ar.f(var3.af());
            0;
            return lIIllIlllIlIl[3];
        }
        return this.al();
    }

    private static boolean lIllIIIllIIllll(int n2) {
        return n2 == 0;
    }

    protected o(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIIllIlIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIIllIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIllIlIIlI(int n2) {
        return n2 > 0;
    }

    @Override
    public abstract boolean al();

    private static boolean lIllIIIllIIlllI(Object object) {
        return object == null;
    }

    static {
        o.lIllIIIllIIllIl();
    }

    private static void lIllIIIllIIllIl() {
        lIIllIlllIlIl = new int[4];
        o.lIIllIlllIlIl[0] = (0x81 ^ 0xB0) & ~(0x6A ^ 0x5B);
        o.lIIllIlllIlIl[1] = 1 + 53 - -91 + 21 ^ 87 + 21 - 0 + 64;
        o.lIIllIlllIlIl[2] = 0x51 ^ 0x72 ^ (0x32 ^ 0x2B);
        o.lIIllIlllIlIl[3] = 1;
    }

    private static boolean lIllIIIllIlIIII(int n2) {
        return n2 != 0;
    }
}

