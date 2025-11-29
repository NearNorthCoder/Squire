/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameObject
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.tithefarm.tasks;

import java.time.Duration;
import java.time.Instant;
import net.runelite.api.GameObject;
import net.runelite.api.coords.WorldPoint;
import gg.squire.tithefarm.tasks.GameEnum12;
import gg.squire.tithefarm.tasks.GameEnum17;

public class BHelper {
    private final  WorldPoint l;
    private  Instant m;
    private final  f j;
    private static final  Duration h;
    private final  e i;
    private final  GameObject k;

    BHelper(e e2, f f2, GameObject gameObject) {
        this.m = Instant.now();
        this.i = e2;
        this.j = f2;
        this.k = gameObject;
        this.l = gameObject.getWorldLocation();
    }

    public f e() {
        return this.j;
    }

    static {
        h = Duration.ofMinutes(1L);
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
        double d2;
        Duration duration = Duration.between(this.m, Instant.now());
        if (b.lIllIllIIIlIIlI(duration.compareTo(h))) {
            d2 = (double)duration.toMillis() / (double)h.toMillis();

            }
        } else {
            d2 = 1.0;
        }
        return d2;
    }

    public void a(Instant instant) {
        this.m = instant;
    }

    public e d() {
        return this.i;
    }

    private static boolean lIllIllIIIlIIlI(int n2) {
        return n2 < 0;
    }
}

