/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

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
    private final /* synthetic */ List<l> aN;
    private static final /* synthetic */ Logger aJ;
    private final /* synthetic */ m aM;
    private final /* synthetic */ Point aL;
    private final /* synthetic */ l[][] aK;
    private static /* synthetic */ int[] llIIlllIIlII;

    private static boolean lllllllIlllIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public List<l> a(WorldPoint worldPoint, l l2) {
        void var8_9;
        void var7_7;
        void var35;
        Object var18;
        void var38;
        l l3 = this.d(worldPoint);
        if (h.lllllllIllllII(l3, l2)) {
            return Collections.emptyList();
        }
        HashMap<Object, Integer> var31 = new HashMap<Object, Integer>();
        HashMap<l, Object> var40 = new HashMap<l, Object>();
        var31.put(var38, llIIlllIIlII[3]);
        0;
        LinkedList<Object> var15 = new LinkedList<Object>();
        var15.add(var38);
        0;
        while (h.lllllllIlllIll(var15.isEmpty() ? 1 : 0)) {
            h var22;
            var18 = (l)var15.remove();
            int var46 = (Integer)var31.get(var18);
            List<l> var23 = var22.c((l)var18);
            Iterator<l> var27 = var23.iterator();
            while (h.lllllllIlllIIl(var27.hasNext() ? 1 : 0)) {
                l var42 = var27.next();
                if (h.lllllllIllIlll(var42.aO(), llIIlllIIlII[1]) && h.lllllllIllIlll(var42.aP(), llIIlllIIlII[1])) {
                    0;
                    if (2 != 0) continue;
                    return null;
                }
                int var26 = var31.getOrDefault(var42, llIIlllIIlII[8]);
                float var36 = ((l)var18).aQ().distanceTo2DHypotenuse(var42.aQ());
                int var32 = (int)((float)var46 + var36);
                if (h.lllllllIllllIl(var32, var26)) {
                    0;
                    
                    return null;
                }
                var31.put(var42, var32);
                0;
                var15.add(var42);
                0;
                var40.put(var42, var18);
                0;
                0;
                if (((0x12 ^ 0x34) & ~(0x21 ^ 7)) == 0) continue;
                return null;
            }
            0;
            if (2 > ((0x68 ^ 0x60 ^ (0xC1 ^ 0xC4)) & (0xA4 ^ 0x95 ^ (0x95 ^ 0xA9) ^ -1))) continue;
            return null;
        }
        if (h.lllllllIlllIll(var40.containsKey(var35) ? 1 : 0)) {
            return Collections.emptyList();
        }
        var18 = new ArrayList();
        l var46 = var35;
        while (h.lllllllIlllllI(var46, var38)) {
            var18.add(var46);
            0;
            if (!h.lllllllIllllll(var46 = (l)var40.getOrDefault(var46, null))) continue;
            return Collections.emptyList();
        }
        var7_7.add(var8_9);
        0;
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
                0;
                if (-1 >= 0) {
                    return ((0x76 ^ 0x6C ^ (0xB7 ^ 0xA2)) & (0xBC ^ 0xAD ^ (0x30 ^ 0x2E) ^ -1)) != 0;
                }
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
        h var29;
        int var8 = llIIlllIIlII[3];
        while (h.lllllllIllIllI(var8, var29.aK.length)) {
            int var10 = llIIlllIIlII[3];
            while (h.lllllllIllIllI(var10, var29.aK[var8].length)) {
                if (!h.lllllllIllIlll(var8, llIIlllIIlII[1]) || h.lllllllIlllIII(var10, llIIlllIIlII[1])) {
                    if (h.lllllllIllIlll(var8, var29.aL.getX()) && h.lllllllIllIlll(var10, var29.aL.getY())) {
                        0;
                        if ((0x58 ^ 0x5C) <= 3) {
                            return;
                        }
                    } else {
                        l var30;
                        Point var44 = new Point(var8 - llIIlllIIlII[1], var10 - llIIlllIIlII[1]);
                        var29.aK[var8][var10] = var30 = l.a(var29.aq().aW().dx(var44.getX() * llIIlllIIlII[4]).dy(var44.getY() * llIIlllIIlII[4]), new Point(var8, var10));
                    }
                }
                ++var10;
                0;
                
                return;
            }
            ++var8;
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
        void var28;
        int n2;
        Point point = this.b(l2);
        Point point2 = this.b(l3);
        Point point3 = new Point(Math.abs(point.getX() - point2.getX()), Math.abs(point.getY() - point2.getY()));
        if (h.lllllllIlllIIl(bl ? 1 : 0)) {
            if (h.lllllllIlllIlI(point3.getX(), llIIlllIIlII[2]) && h.lllllllIlllIlI(point3.getY(), llIIlllIIlII[2])) {
                n2 = llIIlllIIlII[2];
                0;
                if ((0xAF ^ 0x81 ^ (0x43 ^ 0x68)) <= 0) {
                    return ((0xC8 ^ 0xA1 ^ (0x34 ^ 0x11)) & (190 + 78 - 216 + 183 ^ 57 + 49 - -50 + 11 ^ -1)) != 0;
                }
            } else {
                n2 = llIIlllIIlII[3];
                0;
                if (1 >= (0x5E ^ 0x22 ^ (0xC3 ^ 0xBB))) {
                    return ((0x6C ^ 0x5E ^ (0xB7 ^ 0x92)) & (0x18 ^ 0x78 ^ (0x2C ^ 0x5B) ^ -1)) != 0;
                }
            }
        } else if (h.lllllllIlllIlI(var28.getX() + var28.getY(), llIIlllIIlII[2])) {
            n2 = llIIlllIIlII[2];
            0;
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
        h var5;
        int n4;
        int n5 = llIIlllIIlII[10];
        int n6 = llIIlllIIlII[2];
        n6 = n6 * llIIlllIIlII[10] + Arrays.deepHashCode((Object[])this.at());
        Point point = this.au();
        int n7 = n6 * llIIlllIIlII[10];
        if (h.lllllllIllllll(point)) {
            n4 = llIIlllIIlII[11];
            0;
            if (2 < 0) {
                return (0x98 ^ 0x8B ^ (0x51 ^ 0x63)) & (1 ^ (0x98 ^ 0xB8) ^ -1);
            }
        } else {
            void var7;
            n4 = var7.hashCode();
        }
        int var12 = n7 + n4;
        m var1 = var5.av();
        int n8 = var12 * llIIlllIIlII[10];
        if (h.lllllllIllllll(var1)) {
            n3 = llIIlllIIlII[11];
            0;
            if (-1 >= ((0xA3 ^ 0xC0 ^ (0xAF ^ 0x86)) & (231 + 212 - 262 + 74 ^ 98 + 107 - 128 + 104 ^ -1))) {
                return (0xE3 ^ 0xB6 ^ (0xB0 ^ 0xAD)) & (3 ^ 0x7A ^ (0x1D ^ 0x2C) ^ -1);
            }
        } else {
            n3 = ((Object)var1).hashCode();
        }
        var12 = n8 + n3;
        List<l> var19 = var5.aw();
        int n9 = var12 * llIIlllIIlII[10];
        if (h.lllllllIllllll(var19)) {
            n2 = llIIlllIIlII[11];
            0;
            if (-2 > 0) {
                return (0xD6 ^ 0x8D) & ~(0x62 ^ 0x39);
            }
        } else {
            n2 = ((Object)var19).hashCode();
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
                0;
                
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
        h var14;
        this.aN.clear();
        int var39 = llIIlllIIlII[3];
        while (h.lllllllIllIllI(var39, var14.aK.length)) {
            int var3 = llIIlllIIlII[3];
            while (h.lllllllIllIllI(var3, var14.aK[var39].length)) {
                var14.aK[var39][var3].ao();
                var14.aK[var39][var3] = null;
                ++var3;
                0;
                if (1 < 2) continue;
                return;
            }
            ++var39;
            0;
            
            return;
        }
    }

    public Point au() {
        return this.aL;
    }

    public l aq() {
        return this.aK[llIIlllIIlII[1]][llIIlllIIlII[1]];
    }

    private static void lllllllIllIlIl() {
        llIIlllIIlII = new int[12];
        h.llIIlllIIlII[0] = 0xAD ^ 0xAA;
        h.llIIlllIIlII[1] = 3;
        h.llIIlllIIlII[2] = 1;
        h.llIIlllIIlII[3] = (0x47 ^ 0x16) & ~(0xF4 ^ 0xA5);
        h.llIIlllIIlII[4] = 88 + 24 - -31 + 43 ^ 126 + 96 - 185 + 133;
        h.llIIlllIIlII[5] = 0xA6 ^ 0xA2;
        h.llIIlllIIlII[6] = -1;
        h.llIIlllIIlII[7] = 2;
        h.llIIlllIIlII[8] = 0xFFFFFFFF & Integer.MAX_VALUE;
        h.llIIlllIIlII[9] = 0xA7 ^ 0xA2;
        h.llIIlllIIlII[10] = 0x16 ^ 0x2D;
        h.llIIlllIIlII[11] = 0x70 ^ 0x5B;
    }

    /*
     * WARNING - void declaration
     */
    public List<l> b(Predicate<l> predicate) {
        void var20;
        ArrayList<l> arrayList = new ArrayList<l>();
        l[][] lArray = this.aK;
        int n2 = lArray.length;
        int var47 = llIIlllIIlII[3];
        while (h.lllllllIllIllI(var47, (int)var20)) {
            void var33;
            void var41;
            void var4 = var41 = var33[var47];
            int var45 = ((void)var4).length;
            int var2 = llIIlllIIlII[3];
            while (h.lllllllIllIllI(var2, var45)) {
                void var21;
                void var9 = var4[var2];
                if (h.lllllllIlllIll(var21.test(var9) ? 1 : 0)) {
                    0;
                    if (1 > 3) {
                        return null;
                    }
                } else {
                    void var6;
                    var6.add(var9);
                    0;
                }
                ++var2;
                0;
                if ((0xB8 ^ 0xBC) > 1) continue;
                return null;
            }
            ++var47;
            0;
            
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
                List<l> var24;
                List<l> var11;
                block25: {
                    h var13;
                    h var25;
                    block23: {
                        block24: {
                            m var43;
                            m var34;
                            block22: {
                                block20: {
                                    block21: {
                                        Point var16;
                                        Point var37;
                                        block19: {
                                            void var17;
                                            if (h.lllllllIllllII(object, this)) {
                                                return llIIlllIIlII[2];
                                            }
                                            if (h.lllllllIlllIll(var17 instanceof h)) {
                                                return llIIlllIIlII[3];
                                            }
                                            var25 = (h)var17;
                                            if (h.lllllllIlllIll(var25.a(var13) ? 1 : 0)) {
                                                return llIIlllIIlII[3];
                                            }
                                            if (h.lllllllIlllIll(Arrays.deepEquals((Object[])var13.at(), (Object[])var25.at()) ? 1 : 0)) {
                                                return llIIlllIIlII[3];
                                            }
                                            var37 = var13.au();
                                            var16 = var25.au();
                                            if (!h.lllllllIllllll(var37)) break block19;
                                            if (!h.llllllllIIIIlI(var16)) break block20;
                                            0;
                                            if ((0x18 ^ 0x1C) < 0) {
                                                return false;
                                            }
                                            break block21;
                                        }
                                        if (!h.lllllllIlllIll(var37.equals(var16) ? 1 : 0)) break block20;
                                    }
                                    return llIIlllIIlII[3];
                                }
                                var34 = var13.av();
                                var43 = var25.av();
                                if (!h.lllllllIllllll(var34)) break block22;
                                if (!h.llllllllIIIIlI(var43)) break block23;
                                0;
                                if (3 == 0) {
                                    return ((0x44 ^ 0x4B ^ (0x45 ^ 2)) & (0xB2 ^ 0xC7 ^ (0x36 ^ 0xB) ^ -1)) != 0;
                                }
                                break block24;
                            }
                            if (!h.lllllllIlllIll(((Object)var34).equals(var43) ? 1 : 0)) break block23;
                        }
                        return llIIlllIIlII[3];
                    }
                    var11 = var13.aw();
                    var24 = var25.aw();
                    if (!h.lllllllIllllll(var11)) break block25;
                    if (!h.llllllllIIIIlI(var24)) break block26;
                    0;
                    if (-3 > 0) {
                        return ((72 + 41 - 92 + 158 ^ 73 + 30 - -32 + 29) & (0x56 ^ 0x7E ^ (0x8C ^ 0xB3) ^ -1)) != 0;
                    }
                    break block27;
                }
                if (!h.lllllllIlllIll(((Object)var11).equals(var24) ? 1 : 0)) break block26;
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

