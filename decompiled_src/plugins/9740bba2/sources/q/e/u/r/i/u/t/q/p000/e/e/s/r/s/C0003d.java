package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

import net.runelite.api.coords.WorldPoint;
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.d  reason: invalid package and case insensitive filesystem */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/d.class */
public class C0003d {
    private final /* synthetic */ int J;
    private static /* synthetic */ int[] lIIIllIllllII;
    private /* synthetic */ int L;
    private /* synthetic */ int K;
    private final /* synthetic */ int H;
    private final /* synthetic */ int I;
    private final /* synthetic */ int G;

    static {
        lIlIIIllIllIIll();
    }

    public int f() {
        return this.H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean a(WorldPoint worldPoint) {
        if (lIlIIIllIllIlII(this.G, worldPoint.getX()) && lIlIIIllIllIlII(worldPoint.getX(), this.H) && lIlIIIllIllIlII(this.I, worldPoint.getY()) && lIlIIIllIllIlII(worldPoint.getY(), this.J) && lIlIIIllIllIlII(this.K, worldPoint.getPlane()) && lIlIIIllIllIlII(worldPoint.getPlane(), this.L)) {
            ?? r0 = lIIIllIllllII[10];
            "".length();
            return ((67 ^ 123) & ((89 ^ 97) ^ (-1))) > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIllIllllII[0];
    }

    public int g() {
        return this.I;
    }

    public C0003d() {
        this.K = lIIIllIllllII[0];
        this.L = lIIIllIllllII[1];
        this.G = lIIIllIllllII[2];
        this.H = lIIIllIllllII[3];
        this.I = lIIIllIllllII[4];
        this.J = lIIIllIllllII[5];
        this.L = lIIIllIllllII[0];
    }

    public int e() {
        return this.G;
    }

    public C0003d(WorldPoint worldPoint, WorldPoint worldPoint2) {
        this.K = lIIIllIllllII[0];
        this.L = lIIIllIllllII[1];
        this.G = Math.min(worldPoint.getX(), worldPoint2.getX());
        this.H = Math.max(worldPoint.getX(), worldPoint2.getX());
        this.I = Math.min(worldPoint.getY(), worldPoint2.getY());
        this.J = Math.max(worldPoint.getY(), worldPoint2.getY());
        this.K = Math.min(worldPoint.getPlane(), worldPoint2.getPlane());
        this.L = Math.max(worldPoint.getPlane(), worldPoint2.getPlane());
    }

    public int h() {
        return this.J;
    }

    private static void lIlIIIllIllIIll() {
        lIIIllIllllII = new int[11];
        lIIIllIllllII[0] = ((73 ^ 6) ^ (114 ^ 2)) & (((248 ^ 192) ^ (25 ^ 30)) ^ (-" ".length()));
        lIIIllIllllII[1] = "  ".length();
        lIIIllIllllII[2] = (-((-9930) & 32763)) & (-13) & 23997;
        lIIIllIllllII[3] = (-24705) & 28607;
        lIIIllIllllII[4] = (-22030) & 24525;
        lIIIllIllllII[5] = (-769) & 4927;
        lIIIllIllllII[6] = 159 ^ 151;
        lIIIllIllllII[7] = ((183 + 81) - 262) + 253;
        lIIIllIllllII[8] = (246 ^ 189) ^ (16 ^ 93);
        lIIIllIllllII[9] = (((12 + 111) - 21) + 31) ^ (((13 + 151) - 147) + 180);
        lIIIllIllllII[10] = " ".length();
    }

    public C0003d(int i, int i2) {
        this(i);
        this.K = i2;
        this.L = i2;
    }

    private static boolean lIlIIIllIllIlII(int i, int i2) {
        return i <= i2;
    }

    public C0003d(WorldPoint worldPoint) {
        this.K = lIIIllIllllII[0];
        this.L = lIIIllIllllII[1];
        this.G = worldPoint.getX();
        this.H = worldPoint.getX();
        this.I = worldPoint.getY();
        this.J = worldPoint.getY();
        this.K = worldPoint.getPlane();
        this.L = worldPoint.getPlane();
    }

    public WorldPoint d() {
        return new WorldPoint(this.G, this.I, this.K);
    }

    public C0003d(int i) {
        this.K = lIIIllIllllII[0];
        this.L = lIIIllIllllII[1];
        this.G = ((i >> lIIIllIllllII[6]) & lIIIllIllllII[7]) << lIIIllIllllII[8];
        this.H = this.G + lIIIllIllllII[9];
        this.I = (i & lIIIllIllllII[7]) << lIIIllIllllII[8];
        this.J = this.I + lIIIllIllllII[9];
    }
}
