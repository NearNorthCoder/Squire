/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;

@Singleton
public class h {
    private /* synthetic */ int aw;
    @Inject
    /* synthetic */ SquireChambersConfig k;
    @Inject
    /* synthetic */ SquireChambersPlugin v;
    @Inject
    /* synthetic */ Client u;
    private static /* synthetic */ int[] lIlIlIIIIllI;
    private /* synthetic */ int av;
    private /* synthetic */ int ax;

    static {
        h.llIllIlllllIIl();
    }

    private static boolean llIllIllllllII(int n2) {
        return n2 != 0;
    }

    private static boolean llIllIlllllIll(int n2) {
        return n2 == 0;
    }

    public int W() {
        return this.ax;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        h lllllllllllllllIllIlIlIIlllIIIlI;
        int n2 = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bo();
        if (h.llIllIlllllIlI(n2, this.aw)) {
            this.aw = n2;
        }
        if (h.llIllIlllllIll(c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.be() ? 1 : 0) && h.llIllIllllllII(lllllllllllllllIllIlIlIIlllIIIlI.aw)) {
            lllllllllllllllIllIlIlIIlllIIIlI.av += lllllllllllllllIllIlIlIIlllIIIlI.aw;
            lllllllllllllllIllIlIlIIlllIIIlI.aw = lIlIlIIIIllI[0];
            lllllllllllllllIllIlIlIIlllIIIlI.ax += lIlIlIIIIllI[1];
        }
    }

    public int V() {
        return this.aw;
    }

    private static boolean llIllIlllllIlI(int n2, int n3) {
        return n2 > n3;
    }

    public h() {
        this.av = lIlIlIIIIllI[0];
        this.aw = lIlIlIIIIllI[0];
        this.ax = lIlIlIIIIllI[0];
    }

    public int U() {
        return this.av;
    }

    private static void llIllIlllllIIl() {
        lIlIlIIIIllI = new int[2];
        h.lIlIlIIIIllI[0] = (0xD2 ^ 0x93) & ~(0xD9 ^ 0x98);
        h.lIlIlIIIIllI[1] = " ".length();
    }

    public void T() {
        this.aw = lIlIlIIIIllI[0];
        this.av = lIlIlIIIIllI[0];
        this.ax = lIlIlIIIIllI[0];
    }
}

