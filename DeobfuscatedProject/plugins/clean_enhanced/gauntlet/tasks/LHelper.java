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
import gg.squire.gauntlet.tasks.GameEnum3;
import net.runelite.api.Locatable;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;

public class LHelper {
    private  g aY;
    
    private final  WorldPoint aV;
    private  boolean aX;
    private final  Point aW;

    public boolean aY() {
        return this.aX;
    }

    public int aP() {
        if (this.aW != null) {
            return this.aW.getY();
        }
        return 1;
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
        l var2;
        int n5;
        int n6 = 7;
        int n7 = 5;
        int n8 = n7 * 7;
        if ((this.aY( != 0) ? 1 : 0)) {
            n5 = 8;
            0;
            if ((0x94 ^ 0xAF ^ (0xAD ^ 0x92)) <= 2) {
                return (58 + 39 - 56 + 96 ^ 68 + 96 - 92 + 120) & (0x86 ^ 0x99 ^ (0x1B ^ 0x4D) ^ -1);
            }
        } else {
            n5 = 9;
        }
        int var3 = n8 + n5;
        WorldPoint var4 = var2.aW();
        int n9 = var3 * 7;
        if var4 == null {
            n4 = var1[10];
            0;
            if (1 == (0xBA ^ 0xBE)) {
                return (0x42 ^ 0xF) & ~(0xE8 ^ 0xA5);
            }
        } else {
            n4 = var4.hashCode();
        }
        var3 = n9 + n4;
        Point var5 = var2.aX();
        int n10 = var3 * 7;
        if var5 == null {
            n3 = var1[10];
            0;
            if ((1 ^ 5) <= 0) {
                return (0x50 ^ 0x62) & ~(0x54 ^ 0x66);
            }
        } else {
            n3 = var5.hashCode();
        }
        var3 = n10 + n3;
        g var6 = var2.aZ();
        int n11 = var3 * 7;
        if ((Object == nulllllllllllllllllIlIIlIlIllIIIIlll)) {
            n2 = var1[10];
            0;
            if (2 != 2) {
                return (0x4E ^ 0x13) & ~(0x69 ^ 0x34);
            }
        } else {
            n2 = ((Object)((Object)var6)).hashCode();
        }
        n7 = n11 + n2;
        return n7;
    }

    public void b(boolean bl) {
        this.aX = bl;
    }

    public void ao() {
        this.aX = 6;
        this.aY = null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean aS() {
        int n2;
        void var7;
        void var8;
        Point point = this.aX();
        int n3 = point.getX();
        int n4 = point.getY();
        if ((n3 % 3 == 0) && !(Math.abs(n4 - 4) > 5) || ((int == 0)(var8 % 3)) && (Math.abs((int)(var7 - 4)) <= 5)) {
            n2 = 5;
            0;
            if (-1 >= 1) {
                return ((0x5E ^ 0x11 ^ (0x47 ^ 3)) & (71 + 33 - 90 + 141 ^ 93 + 7 - 2 + 46 ^ -1)) != 0;
            }
        } else {
            n2 = 6;
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block26: {
            block27: {
                g var9;
                g var10;
                block25: {
                    l var11;
                    l var12;
                    block23: {
                        block24: {
                            Point var13;
                            Point var14;
                            block22: {
                                block20: {
                                    block21: {
                                        WorldPoint var15;
                                        WorldPoint var16;
                                        block19: {
                                            void var17;
                                            if (object == this) {
                                                return 5;
                                            }
                                            if (var17 instanceof l == 0) {
                                                return 6;
                                            }
                                            var12 = (var17;
                                            if ((var12.a(var11 == 0) ? 1 : 0)) {
                                                return 6;
                                            }
                                            if ((var11.aY() ? 1 : 0 != var12.aY() ? 1 : 0)) {
                                                return 6;
                                            }
                                            var16 = var11.aW();
                                            var15 = var12.aW();
                                            if (!var16 == null) break block19;
                                            if (!var15 != null) break block20;
                                            0;
                                            if (((0x4F ^ 8 ^ (0x7B ^ 3)) & (136 + 135 - 182 + 55 ^ 55 + 37 - 64 + 147 ^ -1)) >= 2) {
                                                return (1 & (1 ^ -1)) != 0;
                                            }
                                            break block21;
                                        }
                                        if (!(var16.equals(var15 == 0) ? 1 : 0)) break block20;
                                    }
                                    return 6;
                                }
                                var14 = var11.aX();
                                var13 = var12.aX();
                                if (!var14 == null) break block22;
                                if (!var13 != null) break block23;
                                0;
                                
                                break block24;
                            }
                            if (!(var14.equals(var13 == 0) ? 1 : 0)) break block23;
                        }
                        return 6;
                    }
                    var10 = var11.aZ();
                    var9 = var12.aZ();
                    if (!(Object == nulllllllllllllllllIlIIlIlIllIIlIlII)) break block25;
                    if (!(Object != nulllllllllllllllllIlIIlIlIllIIlIIll)) break block26;
                    0;
                    if (2 <= -1) {
                        return ((29 + 135 - 85 + 66 ^ 3 + 134 - -15 + 47) & (0 ^ 0x4C ^ (0x26 ^ 0x3C) ^ -1)) != 0;
                    }
                    break block27;
                }
                if (!(((Object == 0)((Object)var10)).equals((Object)var9) ? 1 : 0)) break block26;
            }
            return 6;
        }
        return 5;
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
        l.var18();
    }

    /*
     * WARNING - void declaration
     */
    public boolean e(l l2) {
        int n2;
        void var19;
        void var20;
        void var21;
        void var22;
        Point point = this.aX();
        int n3 = point.getX();
        int n4 = point.getY();
        Point point2 = l2.aX();
        int n5 = point2.getX();
        int n6 = point2.getY();
        if ((n5 == n5) && !(Math.abs(n4 - n6) != 5) || ((int)var22 == (int)var21) && (Math.abs((int)(var20 - var19)) == 5)) {
            n2 = 5;
            0;
            if (((63 + 105 - 143 + 138 ^ 134 + 99 - 153 + 108) & (0x6A ^ 0x4B ^ (0x84 ^ 0xBA) ^ -1)) > (0xB6 ^ 0xBA ^ (0x70 ^ 0x78))) {
                return ((0xB ^ 0x5E ^ (0xB5 ^ 0xC5)) & (0xC ^ 0x18 ^ (0xF1 ^ 0xC0) ^ -1)) != 0;
            }
        } else {
            n2 = 6;
        }
        return n2 != 0;
    }

    public boolean aV() {
        int n2;
        if (!(this.aW.getX() == 4) || (this.aW.getY() != 4)) {
            n2 = 5;
            0;
            if null != null {
                return ((0xCC ^ 0xC5) & ~(0x93 ^ 0x9A)) != 0;
            }
        } else {
            n2 = 6;
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
        WorldPoint worldPoint2 = worldPoint.dx(-worldPoint.getX() % 0).dy(-worldPoint.getY() % 0);
        return worldPoint2.equals((Object)this.aV);
    }

    public int aT() {
        return Math.abs(this.aW.getX() - 4) + Math.abs(this.aW.getY() - 4);
    }

    @Inject
    public LHelper(WorldPoint worldPoint, Point point) {
        this.aY = null;
        this.aV = worldPoint;
        this.aW = point;
    }

    public void b(g g2) {
        this.aY = g2;
    }

    public int aO() {
        if (this.aW != null) {
            return this.aW.getX();
        }
        return 1;
    }

    public WorldArea aR() {
        return new WorldArea(this.aV, this.aV.dx(0).dy(0));
    }

    protected boolean a(Object object) {
        return object instanceof l;
    }

    public static l a(WorldPoint worldPoint, Point point) {
        WorldPoint worldPoint2 = worldPoint.dx(-worldPoint.getX() % 0).dy(-worldPoint.getY() % 0);
        return new LHelper(worldPoint2, point);
    }

    public WorldPoint aQ() {
        return this.aV.dx(2).dy(2);
    }
}

