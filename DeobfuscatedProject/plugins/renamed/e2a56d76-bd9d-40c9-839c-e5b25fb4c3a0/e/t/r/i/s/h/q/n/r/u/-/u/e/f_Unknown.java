/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameObject
 *  net.runelite.api.coords.WorldPoint
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.GEnum;
import java.time.Duration;
import java.time.Instant;
import net.runelite.api.GameObject;
import net.runelite.api.coords.WorldPoint;

public class f_Unknown {
    public static final /* synthetic */ Duration n;
    private /* synthetic */ Instant p;
    private final /* synthetic */ WorldPoint o;
    private /* synthetic */ g q;
    private /* synthetic */ int r;

    public void a(g g2) {
        this.q = g2;
    }

    public WorldPoint o() {
        return this.o;
    }

    public int r() {
        return this.r;
    }

    public void b(int n2) {
        this.r = n2;
    }

    static {
        n = Duration.ofMinutes(1L);
    }

    public double m() {
        double d2;
        Duration duration = Duration.between(this.p, Instant.now());
        if (f.lIIIlllIllIlllI(duration.compareTo(n))) {
            d2 = (double)duration.toMillis() / (double)n.toMillis();
            0;
            if ((16 + 23 - -41 + 57 ^ 61 + 101 - 146 + 125) > (61 + 75 - -4 + 16 ^ 80 + 69 - 124 + 127)) {
                return 0.0;
            }
        } else {
            d2 = 1.0;
        }
        return d2;
    }

    public g q() {
        return this.q;
    }

    private static boolean lIIIlllIllIlllI(int n2) {
        return n2 < 0;
    }

    public void n() {
        this.p = Instant.now();
    }

    public f(GameObject gameObject) {
        this.q = g.OPEN;
        this.p = Instant.now();
        this.r = gameObject.getId();
        this.o = gameObject.getWorldLocation();
    }

    public Instant p() {
        return this.p;
    }
}

