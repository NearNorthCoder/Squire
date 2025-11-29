/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import net.runelite.api.coords.WorldPoint;

public class d_Unknown {
    private final /* synthetic */ int H;
    private /* synthetic */ int L;
    private final /* synthetic */ int I;
    private final /* synthetic */ int J;
    private /* synthetic */ int M;
    private final /* synthetic */ int K;
    private static /* synthetic */ int[] lIlIIIlIlIlIl;

    private static void lIlllIIIIIIIIll() {
        lIlIIIlIlIlIl = new int[11];
        d.lIlIIIlIlIlIl[0] = (0x2B ^ 0x78) & ~(0x56 ^ 5);
        d.lIlIIIlIlIlIl[1] = 2;
        d.lIlIIIlIlIlIl[2] = -(0xFFFFFE7F & 0x4BFF) & (0xFFFFFEFF & 0x4FFE);
        d.lIlIIIlIlIlIl[3] = 0xFFFF9FFF & 0x6F3F;
        d.lIlIIIlIlIlIl[4] = -(0x5B ^ 0x4D) & (0xFFFF99FF & 0x6FD5);
        d.lIlIIIlIlIlIl[5] = -(0xFFFFFF75 & 0x6B8B) & (0xFFFFFFFF & 0x7B3F);
        d.lIlIIIlIlIlIl[6] = 0x34 ^ 0x3C;
        d.lIlIIIlIlIlIl[7] = 90 + 29 - 55 + 63 + (73 + 130 - 117 + 85) - (13 + 103 - -53 + 50) + (118 + 150 - 232 + 140);
        d.lIlIIIlIlIlIl[8] = 64 + 88 - 76 + 53 ^ 98 + 55 - 23 + 5;
        d.lIlIIIlIlIlIl[9] = 0x56 ^ 0x16;
        d.lIlIIIlIlIlIl[10] = 1;
    }

    public int f() {
        return this.H;
    }

    public d(WorldPoint worldPoint, WorldPoint worldPoint2) {
        this.L = lIlIIIlIlIlIl[0];
        this.M = lIlIIIlIlIlIl[1];
        this.H = Math.min(worldPoint.getX(), worldPoint2.getX());
        this.I = Math.max(worldPoint.getX(), worldPoint2.getX());
        this.J = Math.min(worldPoint.getY(), worldPoint2.getY());
        this.K = Math.max(worldPoint.getY(), worldPoint2.getY());
        this.L = Math.min(worldPoint.getPlane(), worldPoint2.getPlane());
        this.M = Math.max(worldPoint.getPlane(), worldPoint2.getPlane());
    }

    public d() {
        this.L = lIlIIIlIlIlIl[0];
        this.M = lIlIIIlIlIlIl[1];
        this.H = lIlIIIlIlIlIl[2];
        this.I = lIlIIIlIlIlIl[3];
        this.J = lIlIIIlIlIlIl[4];
        this.K = lIlIIIlIlIlIl[5];
        this.M = lIlIIIlIlIlIl[0];
    }

    static {
        d.lIlllIIIIIIIIll();
    }

    public int g() {
        return this.I;
    }

    public d(int n2, int n3) {
        this(n2);
        this.L = n3;
        this.M = n3;
    }

    public d(WorldPoint worldPoint) {
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

    private static boolean lIlllIIIIIIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    public d(int n2) {
        this.L = lIlIIIlIlIlIl[0];
        this.M = lIlIIIlIlIlIl[1];
        this.H = (n2 >> lIlIIIlIlIlIl[6] & lIlIIIlIlIlIl[7]) << lIlIIIlIlIlIl[8];
        this.I = this.H + lIlIIIlIlIlIl[9];
        this.J = (n2 & lIlIIIlIlIlIl[7]) << lIlIIIlIlIlIl[8];
        this.K = this.J + lIlIIIlIlIlIl[9];
    }

    public boolean a(WorldPoint worldPoint) {
        int n2;
        if (d.lIlllIIIIIIIlII(this.H, worldPoint.getX()) && d.lIlllIIIIIIIlII(worldPoint.getX(), this.I) && d.lIlllIIIIIIIlII(this.J, worldPoint.getY()) && d.lIlllIIIIIIIlII(worldPoint.getY(), this.K) && d.lIlllIIIIIIIlII(this.L, worldPoint.getPlane()) && d.lIlllIIIIIIIlII(worldPoint.getPlane(), this.M)) {
            n2 = lIlIIIlIlIlIl[10];
            0;
            if (((143 + 31 - 119 + 98 ^ 40 + 27 - 47 + 119) & (103 + 34 - -8 + 64 ^ 119 + 190 - 301 + 187 ^ -1)) != 0) {
                return ((0xB6 ^ 0xA5 ^ (0x1F ^ 0x30)) & (123 + 143 - 178 + 88 ^ 22 + 9 - -51 + 58 ^ -1)) != 0;
            }
        } else {
            n2 = lIlIIIlIlIlIl[0];
        }
        return n2 != 0;
    }

    public WorldPoint e() {
        return new WorldPoint(this.H, this.J, this.L);
    }
}

