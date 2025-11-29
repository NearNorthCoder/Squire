package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import java.util.Random;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.z  reason: invalid package */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/z.class */
public class z implements o {
    private final /* synthetic */ WorldPoint ar;
    private static /* synthetic */ int[] lIlIIIlIllIll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.o
    public boolean D() {
        if (lIlllIIIIIIllIl(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIIlIllIll[0];
        }
        b(this.ar);
        return lIlIIIlIllIll[1];
    }

    private static void lIlllIIIIIIllII() {
        lIlIIIlIllIll = new int[4];
        lIlIIIlIllIll[0] = (13 ^ 66) & ((205 ^ 130) ^ (-1));
        lIlIIIlIllIll[1] = " ".length();
        lIlIIIlIllIll[2] = 197 ^ 194;
        lIlIIIlIllIll[3] = "   ".length();
    }

    static {
        lIlllIIIIIIllII();
    }

    private static boolean lIlllIIIIIIllIl(int i) {
        return i == 0;
    }

    public z(WorldPoint worldPoint) {
        this.ar = worldPoint;
    }

    public void b(WorldPoint worldPoint) {
        Random random = new Random();
        int nextInt = random.nextInt(lIlIIIlIllIll[2]) - lIlIIIlIllIll[3];
        int nextInt2 = random.nextInt(lIlIIIlIllIll[2]) - lIlIIIlIllIll[3];
        if (lIlllIIIIIIllIl(nextInt) && lIlllIIIIIIllIl(nextInt2)) {
            nextInt = lIlIIIlIllIll[1];
        }
        Walker.walkTo(new WorldPoint(worldPoint.getX() + nextInt, worldPoint.getY() + nextInt2, worldPoint.getPlane()));
        "".length();
    }
}
