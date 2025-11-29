/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

import net.runelite.api.coords.WorldPoint;

public class d {
    private final /* synthetic */ int J;
    private static /* synthetic */ int[] lIIIllIllllII;
    private /* synthetic */ int L;
    private /* synthetic */ int K;
    private final /* synthetic */ int H;
    private final /* synthetic */ int I;
    private final /* synthetic */ int G;

    static {
        d.lIlIIIllIllIIll();
    }

    public int f() {
        return this.H;
    }

    public boolean a(WorldPoint worldPoint) {
        int n2;
        if (d.lIlIIIllIllIlII(this.G, worldPoint.getX()) && d.lIlIIIllIllIlII(worldPoint.getX(), this.H) && d.lIlIIIllIllIlII(this.I, worldPoint.getY()) && d.lIlIIIllIllIlII(worldPoint.getY(), this.J) && d.lIlIIIllIllIlII(this.K, worldPoint.getPlane()) && d.lIlIIIllIllIlII(worldPoint.getPlane(), this.L)) {
            n2 = lIIIllIllllII[10];
            "".length();
            if (((0x43 ^ 0x7B) & ~(0x59 ^ 0x61)) > " ".length()) {
                return ((0xBD ^ 0x85) & ~(0x8B ^ 0xB3)) != 0;
            }
        } else {
            n2 = lIIIllIllllII[0];
        }
        return n2 != 0;
    }

    public int g() {
        return this.I;
    }

    public d() {
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

    public d(WorldPoint worldPoint, WorldPoint worldPoint2) {
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
        d.lIIIllIllllII[0] = (0x49 ^ 6 ^ (0x72 ^ 2)) & (0xF8 ^ 0xC0 ^ (0x19 ^ 0x1E) ^ -" ".length());
        d.lIIIllIllllII[1] = "  ".length();
        d.lIIIllIllllII[2] = -(0xFFFFD936 & 0x7FFB) & (0xFFFFFFF3 & 0x5DBD);
        d.lIIIllIllllII[3] = 0xFFFF9F7F & 0x6FBF;
        d.lIIIllIllllII[4] = 0xFFFFA9F2 & 0x5FCD;
        d.lIIIllIllllII[5] = 0xFFFFFCFF & 0x133F;
        d.lIIIllIllllII[6] = 0x9F ^ 0x97;
        d.lIIIllIllllII[7] = 183 + 81 - 262 + 253;
        d.lIIIllIllllII[8] = 0xF6 ^ 0xBD ^ (0x10 ^ 0x5D);
        d.lIIIllIllllII[9] = 12 + 111 - 21 + 31 ^ 13 + 151 - 147 + 180;
        d.lIIIllIllllII[10] = " ".length();
    }

    public d(int n2, int n3) {
        this(n2);
        this.K = n3;
        this.L = n3;
    }

    private static boolean lIlIIIllIllIlII(int n2, int n3) {
        return n2 <= n3;
    }

    public d(WorldPoint worldPoint) {
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

    public d(int n2) {
        this.K = lIIIllIllllII[0];
        this.L = lIIIllIllllII[1];
        this.G = (n2 >> lIIIllIllllII[6] & lIIIllIllllII[7]) << lIIIllIllllII[8];
        this.H = this.G + lIIIllIllllII[9];
        this.I = (n2 & lIIIllIllllII[7]) << lIIIllIllllII[8];
        this.J = this.I + lIIIllIllllII[9];
    }
}

