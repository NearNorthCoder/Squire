/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.eventbus.Subscribe
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;

@Singleton
public class k {
    @Inject
    /* synthetic */ SquireChambersPlugin v;
    /* synthetic */ int bi;
    /* synthetic */ int bj;
    @Inject
    /* synthetic */ Client u;
    private static /* synthetic */ int[] lIlIIIlllIIl;
    @Inject
    /* synthetic */ SquireChambersConfig k;

    static {
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.k.llIlIlllIIlIII();
    }

    public int aJ() {
        if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.k.llIlIlllIIlIIl(this.bi, lIlIIIlllIIl[0])) {
            return lIlIIIlllIIl[0];
        }
        return this.bi - this.u.getTickCount();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.k.llIlIlllIIlIIl(varbitChanged.getVarbitId(), lIlIIIlllIIl[1])) {
            void var1;
            void var2;
            k var3;
            int n2 = this.u.getTickCount();
            if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.k.llIlIlllIIlIlI(varbitChanged.getValue())) {
                this.bi = lIlIIIlllIIl[0];
                this.bj = lIlIIIlllIIl[0];
                return;
            }
            if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.k.llIlIlllIIlIlI(var3.bi - var2)) {
                var3.bi = var2 + lIlIIIlllIIl[2];
            }
            var3.bj = var1.getValue();
        }
    }

    private static void llIlIlllIIlIII() {
        lIlIIIlllIIl = new int[3];
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.k.lIlIIIlllIIl[0] = -1;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.k.lIlIIIlllIIl[1] = 0xFFFF9D6B & 0x77BE;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.k.lIlIIIlllIIl[2] = 0x9C ^ 0x85;
    }

    public int aK() {
        return this.bj;
    }

    private static boolean llIlIlllIIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    public k() {
        this.bi = lIlIIIlllIIl[0];
        this.bj = lIlIIIlllIIl[0];
    }

    private static boolean llIlIlllIIlIlI(int n2) {
        return n2 <= 0;
    }
}

