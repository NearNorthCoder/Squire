/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.unethicalite.api.commons.StopWatch
 */
package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n;

import net.runelite.api.NPC;
import net.unethicalite.api.commons.StopWatch;

public class b {
    private final /* synthetic */ NPC k;
    private /* synthetic */ StopWatch l;

    public void k() {
        this.l = StopWatch.start();
    }

    public StopWatch l() {
        return this.l;
    }

    public NPC j() {
        return this.k;
    }

    public b(NPC nPC) {
        this.k = nPC;
    }

    public long m() {
        System.out.println("Watchtime:" + this.l.getElapsed().getSeconds());
        return this.l.getElapsed().getSeconds();
    }
}

