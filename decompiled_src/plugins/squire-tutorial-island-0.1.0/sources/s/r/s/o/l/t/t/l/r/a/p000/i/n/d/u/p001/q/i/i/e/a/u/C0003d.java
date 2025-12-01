package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import net.runelite.api.coords.WorldPoint;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.d  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/d.class */
public class C0003d {
    private final /* synthetic */ int H;
    private /* synthetic */ int L;
    private final /* synthetic */ int I;
    private final /* synthetic */ int J;
    private /* synthetic */ int M;
    private final /* synthetic */ int K;
    private static /* synthetic */ int[] lIlIIIlIlIlIl;

    private static void lIlllIIIIIIIIll() {
        lIlIIIlIlIlIl = new int[11];
        lIlIIIlIlIlIl[0] = (43 ^ 120) & ((86 ^ 5) ^ (-1));
        lIlIIIlIlIlIl[1] = "  ".length();
        lIlIIIlIlIlIl[2] = (-((-385) & 19455)) & (-257) & 20478;
        lIlIIIlIlIlIl[3] = (-24577) & 28479;
        lIlIIIlIlIlIl[4] = (-(91 ^ 77)) & (-26113) & 28629;
        lIlIIIlIlIlIl[5] = (-((-139) & 27531)) & (-1) & 31551;
        lIlIIIlIlIlIl[6] = 52 ^ 60;
        lIlIIIlIlIlIl[7] = (((((90 + 29) - 55) + 63) + (((73 + 130) - 117) + 85)) - (((13 + 103) - (-53)) + 50)) + ((118 + 150) - 232) + 140;
        lIlIIIlIlIlIl[8] = (((64 + 88) - 76) + 53) ^ (((98 + 55) - 23) + 5);
        lIlIIIlIlIlIl[9] = 86 ^ 22;
        lIlIIIlIlIlIl[10] = " ".length();
    }

    public int f() {
        return this.H;
    }

    public C0003d(WorldPoint worldPoint, WorldPoint worldPoint2) {
        this.L = lIlIIIlIlIlIl[0];
        this.M = lIlIIIlIlIlIl[1];
        this.H = Math.min(worldPoint.getX(), worldPoint2.getX());
        this.I = Math.max(worldPoint.getX(), worldPoint2.getX());
        this.J = Math.min(worldPoint.getY(), worldPoint2.getY());
        this.K = Math.max(worldPoint.getY(), worldPoint2.getY());
        this.L = Math.min(worldPoint.getPlane(), worldPoint2.getPlane());
        this.M = Math.max(worldPoint.getPlane(), worldPoint2.getPlane());
    }

    public C0003d() {
        this.L = lIlIIIlIlIlIl[0];
        this.M = lIlIIIlIlIlIl[1];
        this.H = lIlIIIlIlIlIl[2];
        this.I = lIlIIIlIlIlIl[3];
        this.J = lIlIIIlIlIlIl[4];
        this.K = lIlIIIlIlIlIl[5];
        this.M = lIlIIIlIlIlIl[0];
    }

    static {
        lIlllIIIIIIIIll();
    }

    public int g() {
        return this.I;
    }

    public C0003d(int i, int i2) {
        this(i);
        this.L = i2;
        this.M = i2;
    }

    public C0003d(WorldPoint worldPoint) {
        this.L = lIlIIIlIlIlIl[0];
        this.M = lIlIIIlIlIlIl[1];
        this.H = worldPoint.getX();
        this.I = worldPoint.getX();
        this.J = worldPoint.getY();
        this.K = worldPoint.getY();
        this.L = worldPoint.getPlane();
        this.M = worldPoint.getPlane();
    }

    public int i() {
        return this.K;
    }

    public int h() {
        return this.J;
    }

    private static boolean lIlllIIIIIIIlII(int i, int i2) {
        return i <= i2;
    }

    public C0003d(int i) {
        this.L = lIlIIIlIlIlIl[0];
        this.M = lIlIIIlIlIlIl[1];
        this.H = ((i >> lIlIIIlIlIlIl[6]) & lIlIIIlIlIlIl[7]) << lIlIIIlIlIlIl[8];
        this.I = this.H + lIlIIIlIlIlIl[9];
        this.J = (i & lIlIIIlIlIlIl[7]) << lIlIIIlIlIlIl[8];
        this.K = this.J + lIlIIIlIlIlIl[9];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean a(WorldPoint worldPoint) {
        if (lIlllIIIIIIIlII(this.H, worldPoint.getX()) && lIlllIIIIIIIlII(worldPoint.getX(), this.I) && lIlllIIIIIIIlII(this.J, worldPoint.getY()) && lIlllIIIIIIIlII(worldPoint.getY(), this.K) && lIlllIIIIIIIlII(this.L, worldPoint.getPlane()) && lIlllIIIIIIIlII(worldPoint.getPlane(), this.M)) {
            ?? r0 = lIlIIIlIlIlIl[10];
            "".length();
            return (((((143 + 31) - 119) + 98) ^ (((40 + 27) - 47) + 119)) & (((((103 + 34) - (-8)) + 64) ^ (((119 + 190) - 301) + 187)) ^ (-" ".length()))) != 0 ? ((182 ^ 165) ^ (31 ^ 48)) & (((((123 + 143) - 178) + 88) ^ (((22 + 9) - (-51)) + 58)) ^ (-" ".length())) : r0;
        }
        return lIlIIIlIlIlIl[0];
    }

    public WorldPoint e() {
        return new WorldPoint(this.H, this.J, this.L);
    }
}
