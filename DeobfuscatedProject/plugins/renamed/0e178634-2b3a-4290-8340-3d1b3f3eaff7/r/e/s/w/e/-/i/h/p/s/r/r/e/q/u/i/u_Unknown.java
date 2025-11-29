/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.unethicalite.api.game.House
 *  net.unethicalite.api.movement.Movement
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import com.google.inject.Inject;
import net.unethicalite.api.game.House;
import net.unethicalite.api.movement.Movement;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.d_Unknown;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.f;

public abstract class u_Unknown
extends f {
    @Inject
    protected /* synthetic */ d W;
    private static /* synthetic */ int[] lIlIlllIIIlIl;
    protected static final /* synthetic */ int ad;
    protected static final /* synthetic */ int ac;

    public void e() {
    }

    private static boolean llIIIIlIIIIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIlIIIIIIll(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        u var1;
        if (!u.llIIIIlIIIIIIll(this.j.isInInstancedRegion() ? 1 : 0) || u.llIIIIlIIIIIIll(House.isInside() ? 1 : 0)) {
            var1.e();
            return lIlIlllIIIlIl[0];
        }
        if (u.llIIIIlIIIIIlII(var1.W.j())) {
            var1.e();
            return lIlIlllIIIlIl[0];
        }
        if (u.llIIIIlIIIIIlIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        return this.p();
    }

    private static void llIIIIlIIIIIIlI() {
        lIlIlllIIIlIl = new int[3];
        u.lIlIlllIIIlIl[0] = (0x80 ^ 0x9B ^ (0x72 ^ 0x3C)) & (182 + 64 - 90 + 70 ^ 15 + 16 - -17 + 135 ^ -1);
        u.lIlIlllIIIlIl[1] = -(0x18 ^ 0x5A) & (0xFFFFEFF5 & 0x3FFF);
        u.lIlIlllIIIlIl[2] = 0xFFFFAFED & 0x7FBF;
    }

    static {
        u.llIIIIlIIIIIIlI();
        ad = lIlIlllIIIlIl[1];
        ac = lIlIlllIIIlIl[2];
    }

    private static boolean llIIIIlIIIIIlII(Object object) {
        return object == null;
    }

    public abstract boolean p();
}

