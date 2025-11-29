/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.unethicalite.api.entities.Players
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.g;
import gg.squire.client.plugins.fw.Task;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.entities.Players;

public abstract class i
extends Task {
    protected final /* synthetic */ Client Q;
    protected final /* synthetic */ g R;
    private static /* synthetic */ int[] llIlIlllIIII;
    protected final /* synthetic */ a P;

    private static boolean lIIIIIlllllIIlI(int n2) {
        return n2 != 0;
    }

    private static void lIIIIIllllIlllI() {
        llIlIlllIIII = new int[2];
        i.llIlIlllIIII[0] = (0xA4 ^ 0x85) & ~(0x31 ^ 0x10);
        i.llIlIlllIIII[1] = -" ".length();
    }

    static {
        i.lIIIIIllllIlllI();
    }

    private static boolean lIIIIIllllIllll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIIIIlllllIIIl(int n2) {
        return n2 == 0;
    }

    protected abstract boolean N();

    private static boolean lIIIIIlllllIIII(int n2, int n3) {
        return n2 == n3;
    }

    public boolean run() {
        i lllllllllllllllIlIIIIIlIlIlIIlII;
        if (i.lIIIIIllllIllll((Object)this.P.k(), (Object)this.R)) {
            return llIlIlllIIII[0];
        }
        if (i.lIIIIIlllllIIII(lllllllllllllllIlIIIIIlIlIlIIlII.P.m(), llIlIlllIIII[1])) {
            return llIlIlllIIII[0];
        }
        if (i.lIIIIIlllllIIIl(lllllllllllllllIlIIIIIlIlIlIIlII.P.f() ? 1 : 0)) {
            return llIlIlllIIII[0];
        }
        if (i.lIIIIIlllllIIIl(lllllllllllllllIlIIIIIlIlIlIIlII.P.n() ? 1 : 0)) {
            return llIlIlllIIII[0];
        }
        if (i.lIIIIIlllllIIlI(lllllllllllllllIlIIIIIlIlIlIIlII.P.a(lllllllllllllllIlIIIIIlIlIlIIlII.Q) ? 1 : 0)) {
            return lllllllllllllllIlIIIIIlIlIlIIlII.N();
        }
        if (i.lIIIIIlllllIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIlIlllIIII[0];
        }
        return this.M();
    }

    protected abstract boolean M();

    @Inject
    public i(a a2, g g2) {
        this.P = a2;
        this.Q = a2.t();
        this.R = g2;
    }
}

