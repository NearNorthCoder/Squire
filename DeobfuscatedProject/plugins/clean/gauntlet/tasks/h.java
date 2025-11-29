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
import java.util.Arrays;
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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.m;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class h {
    private final  List<l> aN;
    private static final  Logger aJ;
    private final  m aM;
    private final  Point aL;
    private final  l[][] aK;

    private static boolean lllllllIlllIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public List<l> a(WorldPoint worldPoint, l l2) {
        void var8_9;
        void var7_7;
        void var1;
        Object var2;
        void var3;
        l l3 = this.d(worldPoint);
        if (h.lllllllIllllII(l3, l2)) {
            return Collections.emptyList();
        }
        HashMap<Object, Integer> var4 = new HashMap<Object, Integer>();
        HashMap<l, Object> var5 = new HashMap<l, Object>();
        var4.put(var3, llIIlllIIlII[3]);

        LinkedList<Object> var6 = new LinkedList<Object>();
        var6.add(var3);

        while (h.lllllllIlllIll(var6.isEmpty() ? 1 : 0)) {
            h var7;
            var2 = (l)var6.remove();
            int var8 = (Integer)var4.get(var2);
            List<l> var9 = var7.c((l)var2);
            Iterator<l> var10 = var9.iterator();
            while (h.lllllllIlllIIl(var10.hasNext() ? 1 : 0)) {
                l var11 = var10.next();
                if (h.lllllllIllIlll(var11.aO(), llIIlllIIlII[1]) && h.lllllllIllIlll(var11.aP(), llIIlllIIlII[1])) {

                    if (2 != 0) continue;
                    return null;
                }
                int var12 = var4.getOrDefault(var11, llIIlllIIlII[8]);
                float var13 = ((l)var2).aQ().distanceTo2DHypotenuse(var11.aQ());
                int var14 = (int)((float)var8 + var13);
                if (h.lllllllIllllIl(var14, var12)) {

                    return null;
                }
                var4.put(var11, var14);

                var6.add(var11);

                var5.put(var11, var2);

                if (((0x12 ^ 0x34) & ~(0x21 ^ 7)) == 0) continue;
                return null;
            }

            if (2 > ((0x68 ^ 0x60 ^ (0xC1 ^ 0xC4)) & (0xA4 ^ 0x95 ^ (0x95 ^ 0xA9) ^ -1))) continue;
            return null;
        }
        if (h.lllllllIlllIll(var5.containsKey(var1) ? 1 : 0)) {
            return Collections.emptyList();
        }
        var2 = new ArrayList();
        l var8 = var1;
        while (h.lllllllIlllllI(var8, var3)) {
            var2.add(var8);

            if (!h.lllllllIllllll(var8 = (l)var5.getOrDefault(var8, null))) continue;
            return Collections.emptyList();
        }
        var7_7.add(var8_9);

        return var7_7;
    }

    private static boolean lllllllIlllIII(int n2, int n3) {
        return n2 != n3;
    }

    public Point c(WorldPoint worldPoint) {
        WorldPoint worldPoint2 = worldPoint.dx(-worldPoint.getX() % llIIlllIIlII[4]).dy(-worldPoint.getY() % llIIlllIIlII[4]);
        l l2 = this.aq();
        int n2 = worldPoint2.getX() - l2.aM();
        int n3 = worldPoint2.getY() - l2.aN();
        int n4 = n2 / llIIlllIIlII[4];
        int n5 = n3 / llIIlllIIlII[4];
        return new Point(llIIlllIIlII[1] + n4, llIIlllIIlII[1] + n5);
    }

    public Optional<l> ar() {
        return this.aw().stream().filter(l2 -> {
            boolean bl;
            if (h.lllllllIlllIll(l2.aY() ? 1 : 0)) {
                bl = llIIlllIIlII[2];

            } else {
                bl = llIIlllIIlII[3];
            }
            return bl;
        }).findFirst();
    }

    private static boolean llllllllIIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private void ap() {
        h var15;
        int var16 = llIIlllIIlII[3];
        while (h.lllllllIllIllI(var16, var15.aK.length)) {
            int var17 = llIIlllIIlII[3];
            while (h.lllllllIllIllI(var17, var15.aK[var16].length)) {
                if (!h.lllllllIllIlll(var16, llIIlllIIlII[1]) || h.lllllllIlllIII(var17, llIIlllIIlII[1])) {
                    if (h.lllllllIllIlll(var16, var15.aL.getX()) && h.lllllllIllIlll(var17, var15.aL.getY())) {

                        if ((0x58 ^ 0x5C) <= 3) {
                            return;
                        }
                    } else {
                        l var18;
                        Point var19 = new Point(var16 - llIIlllIIlII[1], var17 - llIIlllIIlII[1]);
                        var15.aK[var16][var17] = var18 = l.a(var15.aq().aW().dx(var19.getX() * llIIlllIIlII[4]).dy(var19.getY() * llIIlllIIlII[4]), new Point(var16, var17));
                    }
                }
                ++var17;

                return;
            }
            ++var16;

            if (((0xC4 ^ 0x8A) & ~(0xCF ^ 0x81)) == 0) continue;
            return;
        }
    }

    public l as() {
        Stream<l> stream = this.aw().stream().filter(l::aY);
        List<l> list = this.aw();
        Objects.requireNonNull(list);

        return stream.max(Comparator.comparingInt(list::indexOf)).orElse(this.av());
    }

    private static boolean lllllllIllIllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        h.lllllllIllIlIl();
        aJ = LoggerFactory.getLogger(h.class);
    }

    private static boolean lllllllIlllIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllllllIllIlll(int n2, int n3) {
        return n2 == n3;
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

    private static boolean llllllllIIIIlI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(l l2, l l3, boolean bl) {
        void var20;
        int n2;
        Point point = this.b(l2);
        Point point2 = this.b(l3);
        Point point3 = new Point(Math.abs(point.getX() - point2.getX()), Math.abs(point.getY() - point2.getY()));
        if (h.lllllllIlllIIl(bl ? 1 : 0)) {
            if (h.lllllllIlllIlI(point3.getX(), llIIlllIIlII[2]) && h.lllllllIlllIlI(point3.getY(), llIIlllIIlII[2])) {
                n2 = llIIlllIIlII[2];

                if ((0xAF ^ 0x81 ^ (0x43 ^ 0x68)) <= 0) {
                    return ((0xC8 ^ 0xA1 ^ (0x34 ^ 0x11)) & (190 + 78 - 216 + 183 ^ 57 + 49 - -50 + 11 ^ -1)) != 0;
                }
            } else {
                n2 = llIIlllIIlII[3];

                if (1 >= (0x5E ^ 0x22 ^ (0xC3 ^ 0xBB))) {
                    return ((0x6C ^ 0x5E ^ (0xB7 ^ 0x92)) & (0x18 ^ 0x78 ^ (0x2C ^ 0x5B) ^ -1)) != 0;
                }
            }
        } else if (h.lllllllIlllIlI(var20.getX() + var20.getY(), llIIlllIIlII[2])) {
            n2 = llIIlllIIlII[2];

            if (((0xF ^ 0x5D ^ (0x2D ^ 0x26)) & (0x52 ^ 0x62 ^ (0xF4 ^ 0x9D) ^ -1)) >= 2) {
                return ((0x14 ^ 0x78 ^ (0x71 ^ 0x38)) & (0x7E ^ 0x57 ^ (0x42 ^ 0x4E) ^ -1)) != 0;
            }
        } else {
            n2 = llIIlllIIlII[3];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        int n3;
        h var21;
        int n4;
        int n5 = llIIlllIIlII[10];
        int n6 = llIIlllIIlII[2];
        n6 = n6 * llIIlllIIlII[10] + Arrays.deepHashCode((Object[])this.at());
        Point point = this.au();
        int n7 = n6 * llIIlllIIlII[10];
        if (h.lllllllIllllll(point)) {
            n4 = llIIlllIIlII[11];

            if (2 < 0) {
                return (0x98 ^ 0x8B ^ (0x51 ^ 0x63)) & (1 ^ (0x98 ^ 0xB8) ^ -1);
            }
        } else {
            void var22;
            n4 = var22.hashCode();
        }
        int var23 = n7 + n4;
        m var24 = var21.av();
        int n8 = var23 * llIIlllIIlII[10];
        if (h.lllllllIllllll(var24)) {
            n3 = llIIlllIIlII[11];

            if (-1 >= ((0xA3 ^ 0xC0 ^ (0xAF ^ 0x86)) & (231 + 212 - 262 + 74 ^ 98 + 107 - 128 + 104 ^ -1))) {
                return (0xE3 ^ 0xB6 ^ (0xB0 ^ 0xAD)) & (3 ^ 0x7A ^ (0x1D ^ 0x2C) ^ -1);
            }
        } else {
            n3 = ((Object)var24).hashCode();
        }
        var23 = n8 + n3;
        List<l> var25 = var21.aw();
        int n9 = var23 * llIIlllIIlII[10];
        if (h.lllllllIllllll(var25)) {
            n2 = llIIlllIIlII[11];

        } else {
            n2 = ((Object)var25).hashCode();
        }
        n6 = n9 + n2;
        return n6;
    }

    private static boolean lllllllIllllIl(int n2, int n3) {
        return n2 > n3;
    }

    public List<l> c(l l2) {
        Point point2 = this.b(l2);
        Point[] pointArray = new Point[llIIlllIIlII[5]];
        pointArray[h.llIIlllIIlII[3]] = point2.offset(llIIlllIIlII[6], llIIlllIIlII[3]);
        pointArray[h.llIIlllIIlII[2]] = point2.offset(llIIlllIIlII[2], llIIlllIIlII[3]);
        pointArray[h.llIIlllIIlII[7]] = point2.offset(llIIlllIIlII[3], llIIlllIIlII[6]);
        pointArray[h.llIIlllIIlII[1]] = point2.offset(llIIlllIIlII[3], llIIlllIIlII[2]);
        return Arrays.stream(pointArray).filter(point -> {
            int n2;
            if (h.llllllllIIIIII(point.getX()) && h.lllllllIllIllI(point.getX(), llIIlllIIlII[0]) && h.llllllllIIIIII(point.getY()) && h.lllllllIllIllI(point.getY(), llIIlllIIlII[0])) {
                n2 = llIIlllIIlII[2];

                }
            } else {
                n2 = llIIlllIIlII[3];
            }
            return n2 != 0;
        }).map(point -> this.aK[point.getX()][point.getY()]).collect(Collectors.toList());
    }

    private static boolean llllllllIIIIII(int n2) {
        return n2 >= 0;
    }

    private static boolean lllllllIllllll(Object object) {
        return object == null;
    }

    private List<l> a(Point point2) {
        int n2 = point2.getX() - llIIlllIIlII[1];
        int n3 = point2.getY() - llIIlllIIlII[1];
        Point[] pointArray = new Point[llIIlllIIlII[9]];
        pointArray[h.llIIlllIIlII[3]] = new Point(point2.getX() + n3, point2.getY() + n2);
        pointArray[h.llIIlllIIlII[2]] = new Point(point2.getX() + n3 + n2, point2.getY() + n2 + n3);
        pointArray[h.llIIlllIIlII[7]] = new Point(point2.getX() + n2, point2.getY() + n3);
        pointArray[h.llIIlllIIlII[1]] = new Point(point2.getX() + n2 - n3, point2.getY() + n3 - n2);
        pointArray[h.llIIlllIIlII[5]] = new Point(point2.getX() - n3, point2.getY() - n2);
        return Stream.of(pointArray).map(point -> this.aK[point.getX()][point.getY()]).collect(Collectors.toList());
    }

    private static boolean lllllllIlllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    public void ao() {
        h var26;
        this.aN.clear();
        int var27 = llIIlllIIlII[3];
        while (h.lllllllIllIllI(var27, var26.aK.length)) {
            int var28 = llIIlllIIlII[3];
            while (h.lllllllIllIllI(var28, var26.aK[var27].length)) {
                var26.aK[var27][var28].ao();
                var26.aK[var27][var28] = null;
                ++var28;

                if (1 < 2) continue;
                return;
            }
            ++var27;

            return;
        }
    }

    public Point au() {
        return this.aL;
    }

    public l aq() {
        return this.aK[llIIlllIIlII[1]][llIIlllIIlII[1]];
    }

    /*
     * WARNING - void declaration
     */
    public List<l> b(Predicate<l> predicate) {
        void var29;
        ArrayList<l> arrayList = new ArrayList<l>();
        l[][] lArray = this.aK;
        int n2 = lArray.length;
        int var30 = llIIlllIIlII[3];
        while (h.lllllllIllIllI(var30, (int)var29)) {
            void var31;
            void var32;
            void var33 = var32 = var31[var30];
            int var34 = ((void)var33).length;
            int var35 = llIIlllIIlII[3];
            while (h.lllllllIllIllI(var35, var34)) {
                void var36;
                void var37 = var33[var35];
                if (h.lllllllIlllIll(var36.test(var37) ? 1 : 0)) {

                    if (1 > 3) {
                        return null;
                    }
                } else {
                    void var38;
                    var38.add(var37);

                }
                ++var35;

                if ((0xB8 ^ 0xBC) > 1) continue;
                return null;
            }
            ++var30;

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
                List<l> var39;
                List<l> var40;
                block25: {
                    h var41;
                    h var42;
                    block23: {
                        block24: {
                            m var43;
                            m var44;
                            block22: {
                                block20: {
                                    block21: {
                                        Point var45;
                                        Point var46;
                                        block19: {
                                            void var47;
                                            if (h.lllllllIllllII(object, this)) {
                                                return llIIlllIIlII[2];
                                            }
                                            if (h.lllllllIlllIll(var47 instanceof h)) {
                                                return llIIlllIIlII[3];
                                            }
                                            var42 = (h)var47;
                                            if (h.lllllllIlllIll(var42.a(var41) ? 1 : 0)) {
                                                return llIIlllIIlII[3];
                                            }
                                            if (h.lllllllIlllIll(Arrays.deepEquals((Object[])var41.at(), (Object[])var42.at()) ? 1 : 0)) {
                                                return llIIlllIIlII[3];
                                            }
                                            var46 = var41.au();
                                            var45 = var42.au();
                                            if (!h.lllllllIllllll(var46)) break block19;
                                            if (!h.llllllllIIIIlI(var45)) break block20;

                                            if ((0x18 ^ 0x1C) < 0) {
                                                return false;
                                            }
                                            break block21;
                                        }
                                        if (!h.lllllllIlllIll(var46.equals(var45) ? 1 : 0)) break block20;
                                    }
                                    return llIIlllIIlII[3];
                                }
                                var44 = var41.av();
                                var43 = var42.av();
                                if (!h.lllllllIllllll(var44)) break block22;
                                if (!h.llllllllIIIIlI(var43)) break block23;

                                if (3 == 0) {
                                    return ((0x44 ^ 0x4B ^ (0x45 ^ 2)) & (0xB2 ^ 0xC7 ^ (0x36 ^ 0xB) ^ -1)) != 0;
                                }
                                break block24;
                            }
                            if (!h.lllllllIlllIll(((Object)var44).equals(var43) ? 1 : 0)) break block23;
                        }
                        return llIIlllIIlII[3];
                    }
                    var40 = var41.aw();
                    var39 = var42.aw();
                    if (!h.lllllllIllllll(var40)) break block25;
                    if (!h.llllllllIIIIlI(var39)) break block26;

                    break block27;
                }
                if (!h.lllllllIlllIll(((Object)var40).equals(var39) ? 1 : 0)) break block26;
            }
            return llIIlllIIlII[3];
        }
        return llIIlllIIlII[2];
    }

    protected boolean a(Object object) {
        return object instanceof h;
    }

    public l d(WorldPoint worldPoint) {
        Point point = this.c(worldPoint);
        int n2 = point.getX();
        int n3 = point.getY();
        if (!h.llllllllIIIIII(n2) || !h.lllllllIllIllI(n2, llIIlllIIlII[0]) || !h.llllllllIIIIII(n3) || h.llllllllIIIIIl(n3, llIIlllIIlII[0])) {
            return null;
        }
        return this.aK[n2][n3];
    }

    public h(WorldPoint worldPoint, l l2) {
        this.aK = new l[llIIlllIIlII[0]][llIIlllIIlII[0]];
        this.aK[h.llIIlllIIlII[1]][h.llIIlllIIlII[1]] = l2;
        l2.b(llIIlllIIlII[2]);
        this.aL = this.c(worldPoint);
        this.ap();
        this.aM = m.b(worldPoint, this.aL);
        this.aM.b(llIIlllIIlII[2]);
        this.aK[this.aL.getX()][this.aL.getY()] = this.aM;
        this.aN = this.a(this.aL);
    }

    private static boolean lllllllIllllII(Object object, Object object2) {
        return object == object2;
    }

    public String toString() {
        return "GauntletMap(rooms=" + Arrays.deepToString((Object[])this.at()) + ", spawn=" + String.valueOf(this.au()) + ", spawnRoom=" + String.valueOf(this.av()) + ", orderedCycleRooms=" + String.valueOf(this.aw()) + ")";
    }

    private static boolean lllllllIlllllI(Object object, Object object2) {
        return object != object2;
    }
}

