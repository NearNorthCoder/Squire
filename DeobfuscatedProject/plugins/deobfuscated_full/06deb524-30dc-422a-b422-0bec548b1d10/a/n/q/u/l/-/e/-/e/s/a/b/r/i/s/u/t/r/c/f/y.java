/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.w;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;

public class y
extends w {
    private final /* synthetic */ WorldPoint ay;
    private static /* synthetic */ int[] lIIlIlllIIlI;

    private static void llIIllIlIllIIl() {
        lIIlIlllIIlI = new int[1];
        y.lIIlIlllIIlI[0] = 1;
    }

    static {
        y.llIIllIlIllIIl();
    }

    public WorldPoint L() {
        return this.ay;
    }

    @Override
    public boolean c(o o2) {
        Movement.setDestination((WorldPoint)this.ay);
        return lIIlIlllIIlI[0];
    }

    public y(String string, WorldPoint worldPoint) {
        super(string);
        this.ay = worldPoint;
    }
}

