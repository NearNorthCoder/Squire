/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.quest.tasks;

import net.runelite.api.coords.WorldPoint;

public class DHelper {
    private final  int H;
    private  int L;
    private final  int I;
    private final  int J;
    private  int M;
    private final  int K;

    private static void var2() {
        var1 = new int[11];
        d.var1[0] = (0x2B ^ 0x78) & ~(0x56 ^ 5);
        d.var1[1] = 2;
        d.var1[2] = -(0xFFFFFE7F & 0x4BFF) & (0xFFFFFEFF & 0x4FFE);
        d.var1[3] = 0xFFFF9FFF & 0x6F3F;
        d.var1[4] = -(0x5B ^ 0x4D) & (0xFFFF99FF & 0x6FD5);
        d.var1[5] = -(0xFFFFFF75 & 0x6B8B) & (0xFFFFFFFF & 0x7B3F);
        d.var1[6] = 0x34 ^ 0x3C;
        d.var1[7] = 90 + 29 - 55 + 63 + (73 + 130 - 117 + 85) - (13 + 103 - -53 + 50) + (118 + 150 - 232 + 140);
        d.var1[8] = 64 + 88 - 76 + 53 ^ 98 + 55 - 23 + 5;
        d.var1[9] = 0x56 ^ 0x16;
        d.var1[10] = 1;
    }

    public int f() {
        return this.H;
    }

    public DHelper(WorldPoint worldPoint, WorldPoint worldPoint2) {
        this.L = var1[0];
        this.M = var1[1];
        this.H = Math.min(worldPoint.getX(), worldPoint2.getX());
        this.I = Math.max(worldPoint.getX(), worldPoint2.getX());
        this.J = Math.min(worldPoint.getY(), worldPoint2.getY());
        this.K = Math.max(worldPoint.getY(), worldPoint2.getY());
        this.L = Math.min(worldPoint.getPlane(), worldPoint2.getPlane());
        this.M = Math.max(worldPoint.getPlane(), worldPoint2.getPlane());
    }

    public DHelper() {
        this.L = var1[0];
        this.M = var1[1];
        this.H = var1[2];
        this.I = var1[3];
        this.J = var1[4];
        this.K = var1[5];
        this.M = var1[0];
    }

    static {
        d.var2();
    }

    public int g() {
        return this.I;
    }

    public DHelper(int n2, int n3) {
        this(n2);
        this.L = n3;
        this.M = n3;
    }

    public DHelper(WorldPoint worldPoint) {
        this.L = var1[0];
        this.M = var1[1];
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

    private static boolean var3(int n2, int n3) {
        return n2 <= n3;
    }

    public DHelper(int n2) {
        this.L = var1[0];
        this.M = var1[1];
        this.H = (n2 >> var1[6] & var1[7]) << var1[8];
        this.I = this.H + var1[9];
        this.J = (n2 & var1[7]) << var1[8];
        this.K = this.J + var1[9];
    }

    public boolean a(WorldPoint worldPoint) {
        int n2;
        if (d.var3(this.H, worldPoint.getX()) && d.var3(worldPoint.getX(), this.I) && d.var3(this.J, worldPoint.getY()) && d.var3(worldPoint.getY(), this.K) && d.var3(this.L, worldPoint.getPlane()) && d.var3(worldPoint.getPlane(), this.M)) {
            n2 = var1[10];
            0;
            if (((143 + 31 - 119 + 98 ^ 40 + 27 - 47 + 119) & (103 + 34 - -8 + 64 ^ 119 + 190 - 301 + 187 ^ -1)) != 0) {
                return ((0xB6 ^ 0xA5 ^ (0x1F ^ 0x30)) & (123 + 143 - 178 + 88 ^ 22 + 9 - -51 + 58 ^ -1)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    public WorldPoint e() {
        return new WorldPoint(this.H, this.J, this.L);
    }
}

