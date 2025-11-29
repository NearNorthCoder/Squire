package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import net.runelite.api.coords.WorldPoint;
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.G  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/G.class */
public class G {
    private static /* synthetic */ int[] lIlIllIIlIll;
    /* synthetic */ int bZ;
    private /* synthetic */ int cb = lIlIllIIlIll[0];
    /* synthetic */ int ca;

    public WorldPoint c(char c2, WorldPoint worldPoint) {
        switch (a(c2)) {
            case 0:
                return worldPoint.dx(this.bZ).dy(this.ca);
            case 1:
                return worldPoint.dx(this.cb - this.ca).dy(this.bZ);
            case 2:
                return worldPoint.dx(this.cb - this.bZ).dy(this.cb - this.ca);
            case 3:
                return worldPoint.dx(this.ca).dy(this.cb - this.bZ);
            default:
                return null;
        }
    }

    private static int a(char c2) {
        return ((lIlIllIIlIll[1] - S.e(c2)) + lIlIllIIlIll[2]) % lIlIllIIlIll[2];
    }

    public G(int i, int i2) {
        this.bZ = i;
        this.ca = i2;
    }

    public G v(int i) {
        return new G(this.bZ, this.ca + i);
    }

    static {
        llIlllllllIIll();
    }

    public G u(int i) {
        return new G(this.bZ + i, this.ca);
    }

    private static void llIlllllllIIll() {
        lIlIllIIlIll = new int[3];
        lIlIllIIlIll[0] = 68 ^ 91;
        lIlIllIIlIll[1] = "  ".length();
        lIlIllIIlIll[2] = 36 ^ 32;
    }
}
