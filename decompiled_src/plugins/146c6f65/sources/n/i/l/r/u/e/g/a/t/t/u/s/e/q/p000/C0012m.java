package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.m  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/m.class */
public class C0012m extends C0011l {
    private static /* synthetic */ int[] llIIlIllIIIl;
    private /* synthetic */ int aZ;

    public static C0012m b(WorldPoint worldPoint, Point point) {
        return new C0012m(worldPoint.dx((-worldPoint.getX()) % llIIlIllIIIl[0]).dy((-worldPoint.getY()) % llIIlIllIIIl[0]), point);
    }

    public void l(int i) {
        this.aZ = i;
    }

    public C0012m(WorldPoint worldPoint, Point point) {
        super(worldPoint, point);
    }

    private static void lllllIllIlIlIl() {
        llIIlIllIIIl = new int[2];
        llIIlIllIIIl[0] = (205 ^ 169) ^ (114 ^ 6);
        llIIlIllIIIl[1] = " ".length();
    }

    public int bb() {
        return this.aZ;
    }

    public void k(int i) {
        this.aZ += i;
    }

    public void ba() {
        this.aZ -= llIIlIllIIIl[1];
    }

    static {
        lllllIllIlIlIl();
    }
}
