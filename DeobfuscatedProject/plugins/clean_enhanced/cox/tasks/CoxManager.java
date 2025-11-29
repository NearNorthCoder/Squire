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
        h.var2();
    }

    public int W() {
        return this.ax;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        h var3;
        int n2 = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bo();
        if (n2 > this.aw) {
            this.aw = n2;
        }
        if ((c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.be( == 0) ? 1 : 0) && (var3.aw != 0)) {
            var3.av += var3.aw;
            var3.aw = 0;
            var3.ax += 1;
        }
    }

    public int V() {
        return this.aw;
    }

    public CoxManager() {
        this.av = 0;
        this.aw = 0;
        this.ax = 0;
    }

    public int U() {
        return this.av;
    }

    public void T() {
        this.aw = 0;
        this.av = 0;
        this.ax = 0;
    }
}

