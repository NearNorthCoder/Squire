/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.gauntlet.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import gg.squire.gauntlet.tasks.LHelper;
import gg.squire.gauntlet.tasks.MHelper;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HHelper {
    private final  List<l> aN;
    private static final  Logger aJ;
    private final  m aM;
    private final  Point aL;
    private final  l[][] aK;

    /*
     * WARNING - void declaration
     */
    public List<l> a(WorldPoint worldPoint, l l2) {
        void var8_9;
        void var7_7;
        void var2;
        Object var3;
        void var4;
        l l3 = this.d(worldPoint);
        if (l3 == l32) {
            return Collections.emptyList();
        }
        HashMap<Object, Integer> var5 = new HashMap<Object, Integer>();
        HashMap<l, Object> var6 = new HashMap<l, Object>();
        var5.put(var4, 3);
        0;
        LinkedList<Object> var7 = new LinkedList<Object>();
        var7.add(var4);
        0;
        while ((var7.isEmpty( == 0) ? 1 : 0)) {
            h var8;
            var3 = (var7.remove();
            int var9 = (Integer)var5.get(var3);
            List<l> var10 = var8.c((var3);
            Iterator<l> var11 = var10.iterator();
            while ((var11.hasNext( != 0) ? 1 : 0)) {
                l var12 = var11.next();
                if ((var12.aO() == 1) && (var12.aP() == 1)) {
                    0;
                    if (2 != 0) continue;
                    return null;
                }
                int var13 = var5.getOrDefault(var12, 8);
                float var14 = ((var3).aQ().distanceTo2DHypotenuse(var12.aQ());
                int var15 = (int)((float)var9 + var14);
                if (var15 > var13) {
                    0;
                    if null == null continue;
                    return null;
                }
                var5.put(var12, var15);
                0;
                var7.add(var12);
                0;
                var6.put(var12, var3);
                0;
                0;
                if (((0x12 ^ 0x34) & ~(0x21 ^ 7)) == 0) continue;
                return null;
            }
            0;
            if (2 > ((0x68 ^ 0x60 ^ (0xC1 ^ 0xC4)) & (0xA4 ^ 0x95 ^ (0x95 ^ 0xA9) ^ -1))) continue;
            return null;
        }
        if ((var6.containsKey(var2 == 0) ? 1 : 0)) {
            return Collections.emptyList();
        }
        var3 = new ArrayList();
        l var9 = var2;
        while (var9 != lllllllllllllllIlIIlIIlIllIIllll2) {
            var3.add(var9);
            0;
            if (!(var9 = l == nulllllllllllllllllIlIIlIIlIllIlIIlI.getOrDefault(var9, null))) continue;
            return Collections.emptyList();
        }
        var7_7.add(var8_9);
        0;
        return var7_7;
    }

    public Point c(WorldPoint worldPoint) {
        WorldPoint worldPoint2 = worldPoint.dx(-worldPoint.getX() % 4).dy(-worldPoint.getY() % 4);
        l l2 = this.aq();
        int n2 = worldPoint2.getX() - l2.aM();
        int n3 = worldPoint2.getY() - l2.aN();
        int n4 = n2 / 4;
        int n5 = n3 / 4;
        return new Point(1 + n4, 1 + n5);
    }

    public Optional<l> ar() {
        return this.aw().stream().filter(l2 -> {
            boolean bl;
            if ((l2.aY( == 0) ? 1 : 0)) {
                bl = 2;
                0;
                if (-1 >= 0) {
                    return ((0x76 ^ 0x6C ^ (0xB7 ^ 0xA2)) & (0xBC ^ 0xAD ^ (0x30 ^ 0x2E) ^ -1)) != 0;
                }
            } else {
                bl = 3;
            }
            return bl;
        }).findFirst();
    }

    private void ap() {
        h var16;
        int var17 = 3;
        while (var17 < var16.aK.length) {
            int var18 = 3;
            while (var18 < var16.aK[var17].length) {
                if (!(var17 == 1) || (var18 != 1)) {
                    if ((var17 == var16.aL.getX()) && (var18 == var16.aL.getY())) {
                        0;
                        if ((0x58 ^ 0x5C) <= 3) {
                            return;
                        }
                    } else {
                        l var19;
                        Point var20 = new Point(var17 - 1, var18 - 1);
                        var16.aK[var17][var18] = var19 = l.a(var16.aq().aW().dx(var20.getX() * 4).dy(var20.getY() * 4), new Point(var17, var18));
                    }
                }
                ++var18;
                0;
                if null == null continue;
                return;
            }
            ++var17;
            0;
            if (((0xC4 ^ 0x8A) & ~(0xCF ^ 0x81)) == 0) continue;
            return;
        }
    }

    public l as() {
        Stream<l> stream = this.aw().stream().filter(l::aY);
        List<l> list = this.aw();
        Objects.requireNonNull(list);
        0;
        return stream.max(Comparator.comparingInt(list::indexOf)).orElse(this.av());
    }

    static {
        h.var21();
        aJ = LoggerFactory.getLogger(HHelper.class);
    }

    public l[][] at() {
        return this.aK;
    }

    public List<l> aw() {
        return this.aN;
    }

    public Point b(l l2) {
        return l2.aX();
    }

    public m av() {
        return this.aM;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(l l2, l l3, boolean bl) {
        void var22;
        int n2;
        Point point = this.b(l2);
        Point point2 = this.b(l3);
        Point point3 = new Point(Math.abs(point.getX() - point2.getX()), Math.abs(point.getY() - point2.getY()));
        if (bl != 0) {
            if ((point3.getX() <= 2) && (point3.getY() <= 2)) {
                n2 = 2;
                0;
                if ((0xAF ^ 0x81 ^ (0x43 ^ 0x68)) <= 0) {
                    return ((0xC8 ^ 0xA1 ^ (0x34 ^ 0x11)) & (190 + 78 - 216 + 183 ^ 57 + 49 - -50 + 11 ^ -1)) != 0;
                }
            } else {
                n2 = 3;
                0;
                if (1 >= (0x5E ^ 0x22 ^ (0xC3 ^ 0xBB))) {
                    return ((0x6C ^ 0x5E ^ (0xB7 ^ 0x92)) & (0x18 ^ 0x78 ^ (0x2C ^ 0x5B) ^ -1)) != 0;
                }
            }
        } else if ((var22.getX() + var22.getY() <= 2)) {
            n2 = 2;
            0;
            if (((0xF ^ 0x5D ^ (0x2D ^ 0x26)) & (0x52 ^ 0x62 ^ (0xF4 ^ 0x9D) ^ -1)) >= 2) {
                return ((0x14 ^ 0x78 ^ (0x71 ^ 0x38)) & (0x7E ^ 0x57 ^ (0x42 ^ 0x4E) ^ -1)) != 0;
            }
        } else {
            n2 = 3;
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        int n3;
        h var23;
        int n4;
        int n5 = var1[10];
        int n6 = 2;
        n6 = n6 * var1[10] + Arrays.deepHashCode((Object[])this.at());
        Point point = this.au();
        int n7 = n6 * var1[10];
        if point == null {
            n4 = var1[11];
            0;
            if (2 < 0) {
                return (0x98 ^ 0x8B ^ (0x51 ^ 0x63)) & (1 ^ (0x98 ^ 0xB8) ^ -1);
            }
        } else {
            void var24;
            n4 = var24.hashCode();
        }
        int var25 = n7 + n4;
        m var26 = var23.av();
        int n8 = var25 * var1[10];
        if var26 == null {
            n3 = var1[11];
            0;
            if (-1 >= ((0xA3 ^ 0xC0 ^ (0xAF ^ 0x86)) & (231 + 212 - 262 + 74 ^ 98 + 107 - 128 + 104 ^ -1))) {
                return (0xE3 ^ 0xB6 ^ (0xB0 ^ 0xAD)) & (3 ^ 0x7A ^ (0x1D ^ 0x2C) ^ -1);
            }
        } else {
            n3 = ((Object)var26).hashCode();
        }
        var25 = n8 + n3;
        List<l> var27 = var23.aw();
        int n9 = var25 * var1[10];
        if var27 == null {
            n2 = var1[11];
            0;
            if (-2 > 0) {
                return (0xD6 ^ 0x8D) & ~(0x62 ^ 0x39);
            }
        } else {
            n2 = ((Object)var27).hashCode();
        }
        n6 = n9 + n2;
        return n6;
    }

    public List<l> c(l l2) {
        Point point2 = this.b(l2);
        Point[] pointArray = new Point[5];
        pointArray[3] = point2.offset(6, 3);
        pointArray[2] = point2.offset(2, 3);
        pointArray[7] = point2.offset(3, 6);
        pointArray[1] = point2.offset(3, 2);
        return Arrays.stream(pointArray).filter(point -> {
            int n2;
            if ((point.getX( >= 0)) && (point.getX() < 0) && (point.getY( >= 0)) && (point.getY() < 0)) {
                n2 = 2;
                0;
                if null != null {
                    return ((0x7B ^ 0x2B) & ~(3 ^ 0x53)) != 0;
                }
            } else {
                n2 = 3;
            }
            return n2 != 0;
        }).map(point -> this.aK[point.getX()][point.getY()]).collect(Collectors.toList());
    }

    private List<l> a(Point point2) {
        int n2 = point2.getX() - 1;
        int n3 = point2.getY() - 1;
        Point[] pointArray = new Point[9];
        pointArray[3] = new Point(point2.getX() + n3, point2.getY() + n2);
        pointArray[2] = new Point(point2.getX() + n3 + n2, point2.getY() + n2 + n3);
        pointArray[7] = new Point(point2.getX() + n2, point2.getY() + n3);
        pointArray[1] = new Point(point2.getX() + n2 - n3, point2.getY() + n3 - n2);
        pointArray[5] = new Point(point2.getX() - n3, point2.getY() - n2);
        return Stream.of(pointArray).map(point -> this.aK[point.getX()][point.getY()]).collect(Collectors.toList());
    }

    public void ao() {
        h var28;
        this.aN.clear();
        int var29 = 3;
        while (var29 < var28.aK.length) {
            int var30 = 3;
            while (var30 < var28.aK[var29].length) {
                var28.aK[var29][var30].ao();
                var28.aK[var29][var30] = null;
                ++var30;
                0;
                if (1 < 2) continue;
                return;
            }
            ++var29;
            0;
            if null == null continue;
            return;
        }
    }

    public Point au() {
        return this.aL;
    }

    public l aq() {
        return this.aK[1][1];
    }

    /*
     * WARNING - void declaration
     */
    public List<l> b(Predicate<l> predicate) {
        void var31;
        ArrayList<l> arrayList = new ArrayList<l>();
        l[][] lArray = this.aK;
        int n2 = lArray.length;
        int var32 = 3;
        while ((var32 < (int)var31)) {
            void var33;
            void var34;
            void var35 = var34 = var33[var32];
            int var36 = ((void)var35).length;
            int var37 = 3;
            while (var37 < var36) {
                void var38;
                void var39 = var35[var37];
                if ((var38.test(var39 == 0) ? 1 : 0)) {
                    0;
                    if (1 > 3) {
                        return null;
                    }
                } else {
                    void var40;
                    var40.add(var39);
                    0;
                }
                ++var37;
                0;
                if ((0xB8 ^ 0xBC) > 1) continue;
                return null;
            }
            ++var32;
            0;
            if null == null continue;
            return null;
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block26: {
            block27: {
                List<l> var41;
                List<l> var42;
                block25: {
                    h var43;
                    h var44;
                    block23: {
                        block24: {
                            m var45;
                            m var46;
                            block22: {
                                block20: {
                                    block21: {
                                        Point var47;
                                        Point var48;
                                        block19: {
                                            void var49;
                                            if (object == this) {
                                                return 2;
                                            }
                                            if (var49 instanceof h == 0) {
                                                return 3;
                                            }
                                            var44 = (h)var49;
                                            if ((var44.a(var43 == 0) ? 1 : 0)) {
                                                return 3;
                                            }
                                            if ((Arrays.deepEquals((Object[] == 0)var43.at(), (Object[])var44.at()) ? 1 : 0)) {
                                                return 3;
                                            }
                                            var48 = var43.au();
                                            var47 = var44.au();
                                            if (!var48 == null) break block19;
                                            if (!var47 != null) break block20;
                                            0;
                                            if ((0x18 ^ 0x1C) < 0) {
                                                return ((0x34 ^ 6) & ~(0xF ^ 0x3D)) != 0;
                                            }
                                            break block21;
                                        }
                                        if (!(var48.equals(var47 == 0) ? 1 : 0)) break block20;
                                    }
                                    return 3;
                                }
                                var46 = var43.av();
                                var45 = var44.av();
                                if (!var46 == null) break block22;
                                if (!var45 != null) break block23;
                                0;
                                
                                break block24;
                            }
                            if (!(((Object == 0)var46).equals(var45) ? 1 : 0)) break block23;
                        }
                        return 3;
                    }
                    var42 = var43.aw();
                    var41 = var44.aw();
                    if (!var42 == null) break block25;
                    if (!var41 != null) break block26;
                    0;
                    if (-3 > 0) {
                        return ((72 + 41 - 92 + 158 ^ 73 + 30 - -32 + 29) & (0x56 ^ 0x7E ^ (0x8C ^ 0xB3) ^ -1)) != 0;
                    }
                    break block27;
                }
                if (!(((Object == 0)var42).equals(var41) ? 1 : 0)) break block26;
            }
            return 3;
        }
        return 2;
    }

    protected boolean a(Object object) {
        return object instanceof h;
    }

    public l d(WorldPoint worldPoint) {
        Point point = this.c(worldPoint);
        int n2 = point.getX();
        int n3 = point.getY();
        if (!(n2 >= 0) || !(n2 < 0) || !(n3 >= 0) || (0 >= 0)) {
            return null;
        }
        return this.aK[n2][n3];
    }

    public HHelper(WorldPoint worldPoint, l l2) {
        this.aK = new l[0][0];
        this.aK[1][1] = l2;
        l2.b(2);
        this.aL = this.c(worldPoint);
        this.ap();
        this.aM = m.b(worldPoint, this.aL);
        this.aM.b(2);
        this.aK[this.aL.getX()][this.aL.getY()] = this.aM;
        this.aN = this.a(this.aL);
    }

    public String toString() {
        return "GauntletMap(rooms=" + Arrays.deepToString((Object[])this.at()) + ", spawn=" + String.valueOf(this.au()) + ", spawnRoom=" + String.valueOf(this.av()) + ", orderedCycleRooms=" + String.valueOf(this.aw()) + ")";
    }

}

