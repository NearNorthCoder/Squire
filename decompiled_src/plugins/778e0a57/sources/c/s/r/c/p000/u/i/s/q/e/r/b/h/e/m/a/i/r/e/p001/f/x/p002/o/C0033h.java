package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
@Singleton
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.h  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/h.class */
public class C0033h {
    @Inject
    /* synthetic */ SquireChambersConfig k;
    @Inject
    /* synthetic */ SquireChambersPlugin v;
    @Inject
    /* synthetic */ Client u;
    private static /* synthetic */ int[] lIlIlIIIIllI;
    private /* synthetic */ int av = lIlIlIIIIllI[0];
    private /* synthetic */ int aw = lIlIlIIIIllI[0];
    private /* synthetic */ int ax = lIlIlIIIIllI[0];

    static {
        llIllIlllllIIl();
    }

    private static boolean llIllIllllllII(int i) {
        return i != 0;
    }

    private static boolean llIllIlllllIll(int i) {
        return i == 0;
    }

    public int W() {
        return this.ax;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        int bo = C0046u.bo();
        if (llIllIlllllIlI(bo, this.aw)) {
            this.aw = bo;
        }
        if (llIllIlllllIll(C0046u.be() ? 1 : 0) && llIllIllllllII(this.aw)) {
            this.av += this.aw;
            this.aw = lIlIlIIIIllI[0];
            this.ax += lIlIlIIIIllI[1];
        }
    }

    public int V() {
        return this.aw;
    }

    private static boolean llIllIlllllIlI(int i, int i2) {
        return i > i2;
    }

    public int U() {
        return this.av;
    }

    private static void llIllIlllllIIl() {
        lIlIlIIIIllI = new int[2];
        lIlIlIIIIllI[0] = (210 ^ 147) & ((217 ^ 152) ^ (-1));
        lIlIlIIIIllI[1] = " ".length();
    }

    public void T() {
        this.aw = lIlIlIIIIllI[0];
        this.av = lIlIlIIIIllI[0];
        this.ax = lIlIlIIIIllI[0];
    }
}
