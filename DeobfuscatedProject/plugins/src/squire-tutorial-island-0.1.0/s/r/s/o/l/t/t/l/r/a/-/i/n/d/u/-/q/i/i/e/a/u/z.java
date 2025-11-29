/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import java.util.Random;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;

public class z
implements o {
    private final /* synthetic */ WorldPoint ar;
    private static /* synthetic */ int[] lIlIIIlIllIll;

    @Override
    public boolean D() {
        if (z.lIlllIIIIIIllIl(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIIlIllIll[0];
        }
        this.b(this.ar);
        return lIlIIIlIllIll[1];
    }

    private static void lIlllIIIIIIllII() {
        lIlIIIlIllIll = new int[4];
        z.lIlIIIlIllIll[0] = (0xD ^ 0x42) & ~(0xCD ^ 0x82);
        z.lIlIIIlIllIll[1] = " ".length();
        z.lIlIIIlIllIll[2] = 0xC5 ^ 0xC2;
        z.lIlIIIlIllIll[3] = "   ".length();
    }

    static {
        z.lIlllIIIIIIllII();
    }

    private static boolean lIlllIIIIIIllIl(int n2) {
        return n2 == 0;
    }

    public z(WorldPoint worldPoint) {
        this.ar = worldPoint;
    }

    public void b(WorldPoint worldPoint) {
        Random random = new Random();
        int n2 = random.nextInt(lIlIIIlIllIll[2]) - lIlIIIlIllIll[3];
        int n3 = random.nextInt(lIlIIIlIllIll[2]) - lIlIIIlIllIll[3];
        if (z.lIlllIIIIIIllIl(n2) && z.lIlllIIIIIIllIl(n3)) {
            n2 = lIlIIIlIllIll[1];
        }
        WorldPoint worldPoint2 = new WorldPoint(worldPoint.getX() + n2, worldPoint.getY() + n3, worldPoint.getPlane());
        Walker.walkTo((WorldPoint)worldPoint2);
        "".length();
    }
}

