/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.gauntlet.tasks.GameEnum18;
import net.runelite.api.Locatable;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;

public class l {
    private  g aY;
    
    private final  WorldPoint aV;
    private  boolean aX;
    private final  Point aW;

    private static boolean llllllIllIllll(Object object, Object object2) {
        return object == object2;
    }

    public boolean aY() {
        return this.aX;
    }

    public int aP() {
        if (l.llllllIllIlIIl(this.aW)) {
            return this.aW.getY();
        }
        return llIIllIIllll[1];
    }

    public int aM() {
        return this.aV.getX();
    }

    public WorldPoint aW() {
        return this.aV;
    }

    public int hashCode() {
        int n2;
        int n3;
        int n4;
        l var1;
        int n5;
        int n6 = llIIllIIllll[7];
        int n7 = llIIllIIllll[5];
        int n8 = n7 * llIIllIIllll[7];
        if (l.llllllIlllIIIl(this.aY() ? 1 : 0)) {
            n5 = llIIllIIllll[8];

            if ((0x94 ^ 0xAF ^ (0xAD ^ 0x92)) <= 2) {
                return (58 + 39 - 56 + 96 ^ 68 + 96 - 92 + 120) & (0x86 ^ 0x99 ^ (0x1B ^ 0x4D) ^ -1);
            }
        } else {
            n5 = llIIllIIllll[9];
        }
        int var2 = n8 + n5;
        WorldPoint var3 = var1.aW();
        int n9 = var2 * llIIllIIllll[7];
        if (l.llllllIlllIIII(var3)) {
            n4 = llIIllIIllll[10];

            if (1 == (0xBA ^ 0xBE)) {
                return (0x42 ^ 0xF) & ~(0xE8 ^ 0xA5);
            }
        } else {
            n4 = var3.hashCode();
        }
        var2 = n9 + n4;
        Point var4 = var1.aX();
        int n10 = var2 * llIIllIIllll[7];
        if (l.llllllIlllIIII(var4)) {
            n3 = llIIllIIllll[10];

            if ((1 ^ 5) <= 0) {
                return (0x50 ^ 0x62) & ~(0x54 ^ 0x66);
            }
        } else {
            n3 = var4.hashCode();
        }
        var2 = n10 + n3;
        g var5 = var1.aZ();
        int n11 = var2 * llIIllIIllll[7];
        if (l.llllllIlllIIII((Object)var5)) {
            n2 = llIIllIIllll[10];

            if (2 != 2) {
                return (0x4E ^ 0x13) & ~(0x69 ^ 0x34);
            }
        } else {
            n2 = ((Object)((Object)var5)).hashCode();
        }
        n7 = n11 + n2;
        return n7;
    }

    private static boolean llllllIllIlIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllllIlllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean llllllIllIlIIl(Object object) {
        return object != null;
    }

    public void b(boolean bl) {
        this.aX = bl;
    }

    public void ao() {
        this.aX = llIIllIIllll[6];
        this.aY = null;
    }

    private static boolean llllllIllIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llllllIllIllII(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean aS() {
        int n2;
        void var6;
        void var7;
        Point point = this.aX();
        int n3 = point.getX();
        int n4 = point.getY();
        if (l.llllllIllIlIlI(n3 % llIIllIIllll[3]) && !l.llllllIllIlIll(Math.abs(n4 - llIIllIIllll[4]), llIIllIIllll[5]) || l.llllllIllIlIlI((int)(var7 % llIIllIIllll[3])) && l.llllllIllIllII(Math.abs((int)(var6 - llIIllIIllll[4])), llIIllIIllll[5])) {
            n2 = llIIllIIllll[5];

            if (-1 >= 1) {
                return ((0x5E ^ 0x11 ^ (0x47 ^ 3)) & (71 + 33 - 90 + 141 ^ 93 + 7 - 2 + 46 ^ -1)) != 0;
            }
        } else {
            n2 = llIIllIIllll[6];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block26: {
            block27: {
                g var8;
                g var9;
                block25: {
                    l var10;
                    l var11;
                    block23: {
                        block24: {
                            Point var12;
                            Point var13;
                            block22: {
                                block20: {
                                    block21: {
                                        WorldPoint var14;
                                        WorldPoint var15;
                                        block19: {
                                            void var16;
                                            if (l.llllllIllIllll(object, this)) {
                                                return llIIllIIllll[5];
                                            }
                                            if (l.llllllIllIlIlI(var16 instanceof l)) {
                                                return llIIllIIllll[6];
                                            }
                                            var11 = (l)var16;
                                            if (l.llllllIllIlIlI(var11.a(var10) ? 1 : 0)) {
                                                return llIIllIIllll[6];
                                            }
                                            if (l.llllllIllIlllI(var10.aY() ? 1 : 0, var11.aY() ? 1 : 0)) {
                                                return llIIllIIllll[6];
                                            }
                                            var15 = var10.aW();
                                            var14 = var11.aW();
                                            if (!l.llllllIlllIIII(var15)) break block19;
                                            if (!l.llllllIllIlIIl(var14)) break block20;

                                            if (((0x4F ^ 8 ^ (0x7B ^ 3)) & (136 + 135 - 182 + 55 ^ 55 + 37 - 64 + 147 ^ -1)) >= 2) {
                                                return (1 & (1 ^ -1)) != 0;
                                            }
                                            break block21;
                                        }
                                        if (!l.llllllIllIlIlI(var15.equals(var14) ? 1 : 0)) break block20;
                                    }
                                    return llIIllIIllll[6];
                                }
                                var13 = var10.aX();
                                var12 = var11.aX();
                                if (!l.llllllIlllIIII(var13)) break block22;
                                if (!l.llllllIllIlIIl(var12)) break block23;

                                if (1 == 0) {
                                    return ((0xA4 ^ 0x9B ^ (0x6B ^ 0x4C)) & (115 + 96 - 190 + 116 ^ 21 + 80 - 73 + 117 ^ -1)) != 0;
                                }
                                break block24;
                            }
                            if (!l.llllllIllIlIlI(var13.equals(var12) ? 1 : 0)) break block23;
                        }
                        return llIIllIIllll[6];
                    }
                    var9 = var10.aZ();
                    var8 = var11.aZ();
                    if (!l.llllllIlllIIII((Object)var9)) break block25;
                    if (!l.llllllIllIlIIl((Object)var8)) break block26;

                    if (2 <= -1) {
                        return ((29 + 135 - 85 + 66 ^ 3 + 134 - -15 + 47) & (0 ^ 0x4C ^ (0x26 ^ 0x3C) ^ -1)) != 0;
                    }
                    break block27;
                }
                if (!l.llllllIllIlIlI(((Object)((Object)var9)).equals((Object)var8) ? 1 : 0)) break block26;
            }
            return llIIllIIllll[6];
        }
        return llIIllIIllll[5];
    }

    public int aU() {
        return this.aQ().distanceTo((Locatable)Players.getLocal());
    }

    public String toString() {
        return "Room(base=" + String.valueOf(this.aW()) + ", indices=" + String.valueOf(this.aX()) + ", discovered=" + this.aY() + ", demiBoss=" + String.valueOf((Object)this.aZ()) + ")";
    }

    public int aN() {
        return this.aV.getY();
    }

    static {
        l.llllllIllIlIII();
    }

    /*
     * WARNING - void declaration
     */
    public boolean e(l l2) {
        int n2;
        void var17;
        void var18;
        void var19;
        void var20;
        Point point = this.aX();
        int n3 = point.getX();
        int n4 = point.getY();
        Point point2 = l2.aX();
        int n5 = point2.getX();
        int n6 = point2.getY();
        if (l.llllllIllIllIl(n3, n5) && !l.llllllIllIlllI(Math.abs(n4 - n6), llIIllIIllll[5]) || l.llllllIllIllIl((int)var20, (int)var19) && l.llllllIllIllIl(Math.abs((int)(var18 - var17)), llIIllIIllll[5])) {
            n2 = llIIllIIllll[5];

            if (((63 + 105 - 143 + 138 ^ 134 + 99 - 153 + 108) & (0x6A ^ 0x4B ^ (0x84 ^ 0xBA) ^ -1)) > (0xB6 ^ 0xBA ^ (0x70 ^ 0x78))) {
                return ((0xB ^ 0x5E ^ (0xB5 ^ 0xC5)) & (0xC ^ 0x18 ^ (0xF1 ^ 0xC0) ^ -1)) != 0;
            }
        } else {
            n2 = llIIllIIllll[6];
        }
        return n2 != 0;
    }

    public boolean aV() {
        int n2;
        if (!l.llllllIllIllIl(this.aW.getX(), llIIllIIllll[4]) || l.llllllIllIlllI(this.aW.getY(), llIIllIIllll[4])) {
            n2 = llIIllIIllll[5];

            }
        } else {
            n2 = llIIllIIllll[6];
        }
        return n2 != 0;
    }

    public g aZ() {
        return this.aY;
    }

    public Point aX() {
        return this.aW;
    }

    public boolean e(WorldPoint worldPoint) {
        WorldPoint worldPoint2 = worldPoint.dx(-worldPoint.getX() % llIIllIIllll[0]).dy(-worldPoint.getY() % llIIllIIllll[0]);
        return worldPoint2.equals((Object)this.aV);
    }

    public int aT() {
        return Math.abs(this.aW.getX() - llIIllIIllll[4]) + Math.abs(this.aW.getY() - llIIllIIllll[4]);
    }

    private static boolean llllllIlllIIII(Object object) {
        return object == null;
    }

    @Inject
    public l(WorldPoint worldPoint, Point point) {
        this.aY = null;
        this.aV = worldPoint;
        this.aW = point;
    }

    public void b(g g2) {
        this.aY = g2;
    }

    public int aO() {
        if (l.llllllIllIlIIl(this.aW)) {
            return this.aW.getX();
        }
        return llIIllIIllll[1];
    }

    public WorldArea aR() {
        return new WorldArea(this.aV, this.aV.dx(llIIllIIllll[0]).dy(llIIllIIllll[0]));
    }

    protected boolean a(Object object) {
        return object instanceof l;
    }

    private static boolean llllllIllIlllI(int n2, int n3) {
        return n2 != n3;
    }

    public static l a(WorldPoint worldPoint, Point point) {
        WorldPoint worldPoint2 = worldPoint.dx(-worldPoint.getX() % llIIllIIllll[0]).dy(-worldPoint.getY() % llIIllIIllll[0]);
        return new l(worldPoint2, point);
    }

    private static boolean llllllIllIllIl(int n2, int n3) {
        return n2 == n3;
    }

    public WorldPoint aQ() {
        return this.aV.dx(llIIllIIllll[2]).dy(llIIllIIllll[2]);
    }
}

