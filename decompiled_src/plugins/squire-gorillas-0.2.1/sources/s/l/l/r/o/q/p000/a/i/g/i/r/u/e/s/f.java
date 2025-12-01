package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Hitsplat;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.f  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/f.class */
public class f {
    private /* synthetic */ WorldArea y;
    private /* synthetic */ List<Hitsplat> K = new ArrayList();
    private /* synthetic */ Player J;

    public f(Player player) {
        this.J = player;
    }

    public void a(WorldArea worldArea) {
        this.y = worldArea;
    }

    public Player D() {
        return this.J;
    }

    public List<Hitsplat> E() {
        return this.K;
    }

    public WorldArea r() {
        return this.y;
    }
}
