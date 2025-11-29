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
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;

@Singleton
public class CoxManager {
    private  int aw;
    @Inject
     SquireChambersConfig k;
    @Inject
     SquireChambersPlugin v;
    @Inject
     Client u;
    
    private  int av;
    private  int ax;

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
        h var1;
        int n2 = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bo();
        if (h.llIllIlllllIlI(n2, this.aw)) {
            this.aw = n2;
        }
        if (h.llIllIlllllIll(c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.be() ? 1 : 0) && h.llIllIllllllII(var1.aw)) {
            var1.av += var1.aw;
            var1.aw = lIlIlIIIIllI[0];
            var1.ax += lIlIlIIIIllI[1];
        }
    }

    public int V() {
        return this.aw;
    }

    private static boolean llIllIlllllIlI(int n2, int n3) {
        return n2 > n3;
    }

    public CoxManager() {
        this.av = lIlIlIIIIllI[0];
        this.aw = lIlIlIIIIllI[0];
        this.ax = lIlIlIIIIllI[0];
    }

    public int U() {
        return this.av;
    }

    public void T() {
        this.aw = lIlIlIIIIllI[0];
        this.av = lIlIlIIIIllI[0];
        this.ax = lIlIlIIIIllI[0];
    }
}

