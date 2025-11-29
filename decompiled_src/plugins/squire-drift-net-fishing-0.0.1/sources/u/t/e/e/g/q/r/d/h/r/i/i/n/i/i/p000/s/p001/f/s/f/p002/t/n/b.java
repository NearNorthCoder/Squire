package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n;

import net.runelite.api.NPC;
import net.unethicalite.api.commons.StopWatch;
/* renamed from: u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.b  reason: invalid package */
/* loaded from: squire-drift-net-fishing-0.0.1.jar:u/t/e/e/g/q/r/d/h/r/i/i/n/i/i/-/s/-/f/s/f/-/t/n/b.class */
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

    public b(NPC npc) {
        this.k = npc;
    }

    public long m() {
        System.out.println("Watchtime:" + this.l.getElapsed().getSeconds());
        return this.l.getElapsed().getSeconds();
    }
}
