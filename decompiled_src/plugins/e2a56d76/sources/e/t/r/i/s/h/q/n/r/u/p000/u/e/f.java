package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import java.time.Duration;
import java.time.Instant;
import net.runelite.api.GameObject;
import net.runelite.api.coords.WorldPoint;
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.f  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/f.class */
public class f {
    public static final /* synthetic */ Duration n = Duration.ofMinutes(1);
    private final /* synthetic */ WorldPoint o;
    private /* synthetic */ int r;
    private /* synthetic */ g q = g.OPEN;
    private /* synthetic */ Instant p = Instant.now();

    public void a(g gVar) {
        this.q = gVar;
    }

    public WorldPoint o() {
        return this.o;
    }

    public int r() {
        return this.r;
    }

    public void b(int i) {
        this.r = i;
    }

    public double m() {
        Duration between = Duration.between(this.p, Instant.now());
        if (lIIIlllIllIlllI(between.compareTo(n))) {
            double millis = between.toMillis() / n.toMillis();
            "".length();
            if (((((16 + 23) - (-41)) + 57) ^ (((61 + 101) - 146) + 125)) > ((((61 + 75) - (-4)) + 16) ^ (((80 + 69) - 124) + 127))) {
                return 0.0d;
            }
            return millis;
        }
        return 1.0d;
    }

    public g q() {
        return this.q;
    }

    private static boolean lIIIlllIllIlllI(int i) {
        return i < 0;
    }

    public void n() {
        this.p = Instant.now();
    }

    public f(GameObject gameObject) {
        this.r = gameObject.getId();
        this.o = gameObject.getWorldLocation();
    }

    public Instant p() {
        return this.p;
    }
}
