package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
@Singleton
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.k  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/k.class */
public class C0036k {
    @Inject
    /* synthetic */ SquireChambersPlugin v;
    /* synthetic */ int bi = lIlIIIlllIIl[0];
    /* synthetic */ int bj = lIlIIIlllIIl[0];
    @Inject
    /* synthetic */ Client u;
    private static /* synthetic */ int[] lIlIIIlllIIl;
    @Inject
    /* synthetic */ SquireChambersConfig k;

    static {
        llIlIlllIIlIII();
    }

    public int aJ() {
        return llIlIlllIIlIIl(this.bi, lIlIIIlllIIl[0]) ? lIlIIIlllIIl[0] : this.bi - this.u.getTickCount();
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if (llIlIlllIIlIIl(varbitChanged.getVarbitId(), lIlIIIlllIIl[1])) {
            int tickCount = this.u.getTickCount();
            if (llIlIlllIIlIlI(varbitChanged.getValue())) {
                this.bi = lIlIIIlllIIl[0];
                this.bj = lIlIIIlllIIl[0];
                return;
            }
            if (llIlIlllIIlIlI(this.bi - tickCount)) {
                this.bi = tickCount + lIlIIIlllIIl[2];
            }
            this.bj = varbitChanged.getValue();
        }
    }

    private static void llIlIlllIIlIII() {
        lIlIIIlllIIl = new int[3];
        lIlIIIlllIIl[0] = -" ".length();
        lIlIIIlllIIl[1] = (-25237) & 30654;
        lIlIIIlllIIl[2] = 156 ^ 133;
    }

    public int aK() {
        return this.bj;
    }

    private static boolean llIlIlllIIlIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean llIlIlllIIlIlI(int i) {
        return i <= 0;
    }
}
