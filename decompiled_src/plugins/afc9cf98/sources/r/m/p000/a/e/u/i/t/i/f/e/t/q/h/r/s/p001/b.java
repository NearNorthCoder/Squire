package r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001;

import java.time.Duration;
import java.time.Instant;
import net.runelite.api.GameObject;
import net.runelite.api.coords.WorldPoint;
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.b  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/b.class */
public class b {
    private final /* synthetic */ WorldPoint l;
    private /* synthetic */ Instant m = Instant.now();
    private final /* synthetic */ f j;
    private static final /* synthetic */ Duration h = Duration.ofMinutes(1);
    private final /* synthetic */ e i;
    private final /* synthetic */ GameObject k;

    b(e eVar, f fVar, GameObject gameObject) {
        this.i = eVar;
        this.j = fVar;
        this.k = gameObject;
        this.l = gameObject.getWorldLocation();
    }

    public f e() {
        return this.j;
    }

    public Instant h() {
        return this.m;
    }

    public WorldPoint g() {
        return this.l;
    }

    public GameObject f() {
        return this.k;
    }

    public double c() {
        Duration between = Duration.between(this.m, Instant.now());
        if (lIllIllIIIlIIlI(between.compareTo(h))) {
            double millis = between.toMillis() / h.toMillis();
            "".length();
            if (0 != 0) {
                return 0.0d;
            }
            return millis;
        }
        return 1.0d;
    }

    public void a(Instant instant) {
        this.m = instant;
    }

    public e d() {
        return this.i;
    }

    private static boolean lIllIllIIIlIIlI(int i) {
        return i < 0;
    }
}
