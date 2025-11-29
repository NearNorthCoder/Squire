/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.quest.tasks;

import net.runelite.api.coords.WorldPoint;

public class d {
    private final  int H;
    private  int L;
    private final  int I;
    private final  int J;
    private  int M;
    private final  int K;

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

