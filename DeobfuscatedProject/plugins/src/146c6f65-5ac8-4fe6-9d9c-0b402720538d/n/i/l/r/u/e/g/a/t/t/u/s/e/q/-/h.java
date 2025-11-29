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
        void lllllllllllllllIlIIlIIlIllIlIlIl;
        Object lllllllllllllllIlIIlIIlIllIlIIII;
        void lllllllllllllllIlIIlIIlIllIlIlII;
        l l3 = this.d(worldPoint);
        if (h.lllllllIllllII(l3, l2)) {
            return Collections.emptyList();
        }
        HashMap<Object, Integer> lllllllllllllllIlIIlIIlIllIlIIll = new HashMap<Object, Integer>();
        HashMap<l, Object> lllllllllllllllIlIIlIIlIllIlIIlI = new HashMap<l, Object>();
        lllllllllllllllIlIIlIIlIllIlIIll.put(lllllllllllllllIlIIlIIlIllIlIlII, llIIlllIIlII[3]);
        "".length();
        LinkedList<Object> lllllllllllllllIlIIlIIlIllIlIIIl = new LinkedList<Object>();
        lllllllllllllllIlIIlIIlIllIlIIIl.add(lllllllllllllllIlIIlIIlIllIlIlII);
        "".length();
        while (h.lllllllIlllIll(lllllllllllllllIlIIlIIlIllIlIIIl.isEmpty() ? 1 : 0)) {
            h lllllllllllllllIlIIlIIlIllIlIlll;
            lllllllllllllllIlIIlIIlIllIlIIII = (l)lllllllllllllllIlIIlIIlIllIlIIIl.remove();
            int lllllllllllllllIlIIlIIlIllIIllll = (Integer)lllllllllllllllIlIIlIIlIllIlIIll.get(lllllllllllllllIlIIlIIlIllIlIIII);
            List<l> lllllllllllllllIlIIlIIlIllIIlllI = lllllllllllllllIlIIlIIlIllIlIlll.c((l)lllllllllllllllIlIIlIIlIllIlIIII);
            Iterator<l> lllllllllllllllIlIIlIIlIllIIllIl = lllllllllllllllIlIIlIIlIllIIlllI.iterator();
            while (h.lllllllIlllIIl(lllllllllllllllIlIIlIIlIllIIllIl.hasNext() ? 1 : 0)) {
                l lllllllllllllllIlIIlIIlIllIIllII = lllllllllllllllIlIIlIIlIllIIllIl.next();
                if (h.lllllllIllIlll(lllllllllllllllIlIIlIIlIllIIllII.aO(), llIIlllIIlII[1]) && h.lllllllIllIlll(lllllllllllllllIlIIlIIlIllIIllII.aP(), llIIlllIIlII[1])) {
                    "".length();
                    if ("  ".length() != 0) continue;
                    return null;
                }
                int lllllllllllllllIlIIlIIlIllIIlIll = lllllllllllllllIlIIlIIlIllIlIIll.getOrDefault(lllllllllllllllIlIIlIIlIllIIllII, llIIlllIIlII[8]);
                float lllllllllllllllIlIIlIIlIllIIlIlI = ((l)lllllllllllllllIlIIlIIlIllIlIIII).aQ().distanceTo2DHypotenuse(lllllllllllllllIlIIlIIlIllIIllII.aQ());
                int lllllllllllllllIlIIlIIlIllIIlIIl = (int)((float)lllllllllllllllIlIIlIIlIllIIllll + lllllllllllllllIlIIlIIlIllIIlIlI);
                if (h.lllllllIllllIl(lllllllllllllllIlIIlIIlIllIIlIIl, lllllllllllllllIlIIlIIlIllIIlIll)) {
                    "".length();
                    if (null == null) continue;
                    return null;
                }
                lllllllllllllllIlIIlIIlIllIlIIll.put(lllllllllllllllIlIIlIIlIllIIllII, lllllllllllllllIlIIlIIlIllIIlIIl);
                "".length();
                lllllllllllllllIlIIlIIlIllIlIIIl.add(lllllllllllllllIlIIlIIlIllIIllII);
                "".length();
                lllllllllllllllIlIIlIIlIllIlIIlI.put(lllllllllllllllIlIIlIIlIllIIllII, lllllllllllllllIlIIlIIlIllIlIIII);
                "".length();
                "".length();
                if (((0x12 ^ 0x34) & ~(0x21 ^ 7)) == 0) continue;
                return null;
            }
            "".length();
            if ("  ".length() > ((0x68 ^ 0x60 ^ (0xC1 ^ 0xC4)) & (0xA4 ^ 0x95 ^ (0x95 ^ 0xA9) ^ -" ".length()))) continue;
            return null;
        }
        if (h.lllllllIlllIll(lllllllllllllllIlIIlIIlIllIlIIlI.containsKey(lllllllllllllllIlIIlIIlIllIlIlIl) ? 1 : 0)) {
            return Collections.emptyList();
        }
        lllllllllllllllIlIIlIIlIllIlIIII = new ArrayList();
        l lllllllllllllllIlIIlIIlIllIIllll = lllllllllllllllIlIIlIIlIllIlIlIl;
        while (h.lllllllIlllllI(lllllllllllllllIlIIlIIlIllIIllll, lllllllllllllllIlIIlIIlIllIlIlII)) {
            lllllllllllllllIlIIlIIlIllIlIIII.add(lllllllllllllllIlIIlIIlIllIIllll);
            "".length();
            if (!h.lllllllIllllll(lllllllllllllllIlIIlIIlIllIIllll = (l)lllllllllllllllIlIIlIIlIllIlIIlI.getOrDefault(lllllllllllllllIlIIlIIlIllIIllll, null))) continue;
            return Collections.emptyList();
        }
        var7_7.add(var8_9);
        "".length();
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
                "".length();
                if (-" ".length() >= 0) {
                    return ((0x76 ^ 0x6C ^ (0xB7 ^ 0xA2)) & (0xBC ^ 0xAD ^ (0x30 ^ 0x2E) ^ -" ".length())) != 0;
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
        h lllllllllllllllIlIIlIIllIIIIllll;
        int lllllllllllllllIlIIlIIllIIIIlllI = llIIlllIIlII[3];
        while (h.lllllllIllIllI(lllllllllllllllIlIIlIIllIIIIlllI, lllllllllllllllIlIIlIIllIIIIllll.aK.length)) {
            int lllllllllllllllIlIIlIIllIIIIllIl = llIIlllIIlII[3];
            while (h.lllllllIllIllI(lllllllllllllllIlIIlIIllIIIIllIl, lllllllllllllllIlIIlIIllIIIIllll.aK[lllllllllllllllIlIIlIIllIIIIlllI].length)) {
                if (!h.lllllllIllIlll(lllllllllllllllIlIIlIIllIIIIlllI, llIIlllIIlII[1]) || h.lllllllIlllIII(lllllllllllllllIlIIlIIllIIIIllIl, llIIlllIIlII[1])) {
                    if (h.lllllllIllIlll(lllllllllllllllIlIIlIIllIIIIlllI, lllllllllllllllIlIIlIIllIIIIllll.aL.getX()) && h.lllllllIllIlll(lllllllllllllllIlIIlIIllIIIIllIl, lllllllllllllllIlIIlIIllIIIIllll.aL.getY())) {
                        "".length();
                        if ((0x58 ^ 0x5C) <= "   ".length()) {
                            return;
                        }
                    } else {
                        l lllllllllllllllIlIIlIIllIIIIlIll;
                        Point lllllllllllllllIlIIlIIllIIIIllII = new Point(lllllllllllllllIlIIlIIllIIIIlllI - llIIlllIIlII[1], lllllllllllllllIlIIlIIllIIIIllIl - llIIlllIIlII[1]);
                        lllllllllllllllIlIIlIIllIIIIllll.aK[lllllllllllllllIlIIlIIllIIIIlllI][lllllllllllllllIlIIlIIllIIIIllIl] = lllllllllllllllIlIIlIIllIIIIlIll = l.a(lllllllllllllllIlIIlIIllIIIIllll.aq().aW().dx(lllllllllllllllIlIIlIIllIIIIllII.getX() * llIIlllIIlII[4]).dy(lllllllllllllllIlIIlIIllIIIIllII.getY() * llIIlllIIlII[4]), new Point(lllllllllllllllIlIIlIIllIIIIlllI, lllllllllllllllIlIIlIIllIIIIllIl));
                    }
                }
                ++lllllllllllllllIlIIlIIllIIIIllIl;
                "".length();
                if (null == null) continue;
                return;
            }
            ++lllllllllllllllIlIIlIIllIIIIlllI;
            "".length();
            if (((0xC4 ^ 0x8A) & ~(0xCF ^ 0x81)) == 0) continue;
            return;
        }
    }

    public l as() {
        Stream<l> stream = this.aw().stream().filter(l::aY);
        List<l> list = this.aw();
        Objects.requireNonNull(list);
        "".length();
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
        void lllllllllllllllIlIIlIIlIllllllIl;
        int n2;
        Point point = this.b(l2);
        Point point2 = this.b(l3);
        Point point3 = new Point(Math.abs(point.getX() - point2.getX()), Math.abs(point.getY() - point2.getY()));
        if (h.lllllllIlllIIl(bl ? 1 : 0)) {
            if (h.lllllllIlllIlI(point3.getX(), llIIlllIIlII[2]) && h.lllllllIlllIlI(point3.getY(), llIIlllIIlII[2])) {
                n2 = llIIlllIIlII[2];
                "".length();
                if ((0xAF ^ 0x81 ^ (0x43 ^ 0x68)) <= 0) {
                    return ((0xC8 ^ 0xA1 ^ (0x34 ^ 0x11)) & (190 + 78 - 216 + 183 ^ 57 + 49 - -50 + 11 ^ -" ".length())) != 0;
                }
            } else {
                n2 = llIIlllIIlII[3];
                "".length();
                if (" ".length() >= (0x5E ^ 0x22 ^ (0xC3 ^ 0xBB))) {
                    return ((0x6C ^ 0x5E ^ (0xB7 ^ 0x92)) & (0x18 ^ 0x78 ^ (0x2C ^ 0x5B) ^ -" ".length())) != 0;
                }
            }
        } else if (h.lllllllIlllIlI(lllllllllllllllIlIIlIIlIllllllIl.getX() + lllllllllllllllIlIIlIIlIllllllIl.getY(), llIIlllIIlII[2])) {
            n2 = llIIlllIIlII[2];
            "".length();
            if (((0xF ^ 0x5D ^ (0x2D ^ 0x26)) & (0x52 ^ 0x62 ^ (0xF4 ^ 0x9D) ^ -" ".length())) >= "  ".length()) {
                return ((0x14 ^ 0x78 ^ (0x71 ^ 0x38)) & (0x7E ^ 0x57 ^ (0x42 ^ 0x4E) ^ -" ".length())) != 0;
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
        h lllllllllllllllIlIIlIIlIlIlIIllI;
        int n4;
        int n5 = llIIlllIIlII[10];
        int n6 = llIIlllIIlII[2];
        n6 = n6 * llIIlllIIlII[10] + Arrays.deepHashCode((Object[])this.at());
        Point point = this.au();
        int n7 = n6 * llIIlllIIlII[10];
        if (h.lllllllIllllll(point)) {
            n4 = llIIlllIIlII[11];
            "".length();
            if ("  ".length() < 0) {
                return (0x98 ^ 0x8B ^ (0x51 ^ 0x63)) & (" ".length() ^ (0x98 ^ 0xB8) ^ -" ".length());
            }
        } else {
            void lllllllllllllllIlIIlIIlIlIlIIIll;
            n4 = lllllllllllllllIlIIlIIlIlIlIIIll.hashCode();
        }
        int lllllllllllllllIlIIlIIlIlIlIIlII = n7 + n4;
        m lllllllllllllllIlIIlIIlIlIlIIIlI = lllllllllllllllIlIIlIIlIlIlIIllI.av();
        int n8 = lllllllllllllllIlIIlIIlIlIlIIlII * llIIlllIIlII[10];
        if (h.lllllllIllllll(lllllllllllllllIlIIlIIlIlIlIIIlI)) {
            n3 = llIIlllIIlII[11];
            "".length();
            if (-" ".length() >= ((0xA3 ^ 0xC0 ^ (0xAF ^ 0x86)) & (231 + 212 - 262 + 74 ^ 98 + 107 - 128 + 104 ^ -" ".length()))) {
                return (0xE3 ^ 0xB6 ^ (0xB0 ^ 0xAD)) & (3 ^ 0x7A ^ (0x1D ^ 0x2C) ^ -" ".length());
            }
        } else {
            n3 = ((Object)lllllllllllllllIlIIlIIlIlIlIIIlI).hashCode();
        }
        lllllllllllllllIlIIlIIlIlIlIIlII = n8 + n3;
        List<l> lllllllllllllllIlIIlIIlIlIlIIIIl = lllllllllllllllIlIIlIIlIlIlIIllI.aw();
        int n9 = lllllllllllllllIlIIlIIlIlIlIIlII * llIIlllIIlII[10];
        if (h.lllllllIllllll(lllllllllllllllIlIIlIIlIlIlIIIIl)) {
            n2 = llIIlllIIlII[11];
            "".length();
            if (-"  ".length() > 0) {
                return (0xD6 ^ 0x8D) & ~(0x62 ^ 0x39);
            }
        } else {
            n2 = ((Object)lllllllllllllllIlIIlIIlIlIlIIIIl).hashCode();
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
                "".length();
                if (null != null) {
                    return ((0x7B ^ 0x2B) & ~(3 ^ 0x53)) != 0;
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
        h lllllllllllllllIlIIlIIllIIIlIlll;
        this.aN.clear();
        int lllllllllllllllIlIIlIIllIIIlIllI = llIIlllIIlII[3];
        while (h.lllllllIllIllI(lllllllllllllllIlIIlIIllIIIlIllI, lllllllllllllllIlIIlIIllIIIlIlll.aK.length)) {
            int lllllllllllllllIlIIlIIllIIIlIlIl = llIIlllIIlII[3];
            while (h.lllllllIllIllI(lllllllllllllllIlIIlIIllIIIlIlIl, lllllllllllllllIlIIlIIllIIIlIlll.aK[lllllllllllllllIlIIlIIllIIIlIllI].length)) {
                lllllllllllllllIlIIlIIllIIIlIlll.aK[lllllllllllllllIlIIlIIllIIIlIllI][lllllllllllllllIlIIlIIllIIIlIlIl].ao();
                lllllllllllllllIlIIlIIllIIIlIlll.aK[lllllllllllllllIlIIlIIllIIIlIllI][lllllllllllllllIlIIlIIllIIIlIlIl] = null;
                ++lllllllllllllllIlIIlIIllIIIlIlIl;
                "".length();
                if (" ".length() < "  ".length()) continue;
                return;
            }
            ++lllllllllllllllIlIIlIIllIIIlIllI;
            "".length();
            if (null == null) continue;
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
        h.llIIlllIIlII[1] = "   ".length();
        h.llIIlllIIlII[2] = " ".length();
        h.llIIlllIIlII[3] = (0x47 ^ 0x16) & ~(0xF4 ^ 0xA5);
        h.llIIlllIIlII[4] = 88 + 24 - -31 + 43 ^ 126 + 96 - 185 + 133;
        h.llIIlllIIlII[5] = 0xA6 ^ 0xA2;
        h.llIIlllIIlII[6] = -" ".length();
        h.llIIlllIIlII[7] = "  ".length();
        h.llIIlllIIlII[8] = 0xFFFFFFFF & Integer.MAX_VALUE;
        h.llIIlllIIlII[9] = 0xA7 ^ 0xA2;
        h.llIIlllIIlII[10] = 0x16 ^ 0x2D;
        h.llIIlllIIlII[11] = 0x70 ^ 0x5B;
    }

    /*
     * WARNING - void declaration
     */
    public List<l> b(Predicate<l> predicate) {
        void lllllllllllllllIlIIlIIlIlllIllIl;
        ArrayList<l> arrayList = new ArrayList<l>();
        l[][] lArray = this.aK;
        int n2 = lArray.length;
        int lllllllllllllllIlIIlIIlIlllIllII = llIIlllIIlII[3];
        while (h.lllllllIllIllI(lllllllllllllllIlIIlIIlIlllIllII, (int)lllllllllllllllIlIIlIIlIlllIllIl)) {
            void lllllllllllllllIlIIlIIlIlllIlllI;
            void lllllllllllllllIlIIlIIlIlllIlIll;
            void lllllllllllllllIlIIlIIlIlllIlIlI = lllllllllllllllIlIIlIIlIlllIlIll = lllllllllllllllIlIIlIIlIlllIlllI[lllllllllllllllIlIIlIIlIlllIllII];
            int lllllllllllllllIlIIlIIlIlllIlIIl = ((void)lllllllllllllllIlIIlIIlIlllIlIlI).length;
            int lllllllllllllllIlIIlIIlIlllIlIII = llIIlllIIlII[3];
            while (h.lllllllIllIllI(lllllllllllllllIlIIlIIlIlllIlIII, lllllllllllllllIlIIlIIlIlllIlIIl)) {
                void lllllllllllllllIlIIlIIlIllllIIII;
                void lllllllllllllllIlIIlIIlIlllIIlll = lllllllllllllllIlIIlIIlIlllIlIlI[lllllllllllllllIlIIlIIlIlllIlIII];
                if (h.lllllllIlllIll(lllllllllllllllIlIIlIIlIllllIIII.test(lllllllllllllllIlIIlIIlIlllIIlll) ? 1 : 0)) {
                    "".length();
                    if (" ".length() > "   ".length()) {
                        return null;
                    }
                } else {
                    void lllllllllllllllIlIIlIIlIlllIllll;
                    lllllllllllllllIlIIlIIlIlllIllll.add(lllllllllllllllIlIIlIIlIlllIIlll);
                    "".length();
                }
                ++lllllllllllllllIlIIlIIlIlllIlIII;
                "".length();
                if ((0xB8 ^ 0xBC) > " ".length()) continue;
                return null;
            }
            ++lllllllllllllllIlIIlIIlIlllIllII;
            "".length();
            if (null == null) continue;
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
                List<l> lllllllllllllllIlIIlIIlIlIlIllIl;
                List<l> lllllllllllllllIlIIlIIlIlIlIlllI;
                block25: {
                    h lllllllllllllllIlIIlIIlIlIllIlIl;
                    h lllllllllllllllIlIIlIIlIlIllIIll;
                    block23: {
                        block24: {
                            m lllllllllllllllIlIIlIIlIlIlIllll;
                            m lllllllllllllllIlIIlIIlIlIllIIII;
                            block22: {
                                block20: {
                                    block21: {
                                        Point lllllllllllllllIlIIlIIlIlIllIIIl;
                                        Point lllllllllllllllIlIIlIIlIlIllIIlI;
                                        block19: {
                                            void lllllllllllllllIlIIlIIlIlIllIlII;
                                            if (h.lllllllIllllII(object, this)) {
                                                return llIIlllIIlII[2];
                                            }
                                            if (h.lllllllIlllIll(lllllllllllllllIlIIlIIlIlIllIlII instanceof h)) {
                                                return llIIlllIIlII[3];
                                            }
                                            lllllllllllllllIlIIlIIlIlIllIIll = (h)lllllllllllllllIlIIlIIlIlIllIlII;
                                            if (h.lllllllIlllIll(lllllllllllllllIlIIlIIlIlIllIIll.a(lllllllllllllllIlIIlIIlIlIllIlIl) ? 1 : 0)) {
                                                return llIIlllIIlII[3];
                                            }
                                            if (h.lllllllIlllIll(Arrays.deepEquals((Object[])lllllllllllllllIlIIlIIlIlIllIlIl.at(), (Object[])lllllllllllllllIlIIlIIlIlIllIIll.at()) ? 1 : 0)) {
                                                return llIIlllIIlII[3];
                                            }
                                            lllllllllllllllIlIIlIIlIlIllIIlI = lllllllllllllllIlIIlIIlIlIllIlIl.au();
                                            lllllllllllllllIlIIlIIlIlIllIIIl = lllllllllllllllIlIIlIIlIlIllIIll.au();
                                            if (!h.lllllllIllllll(lllllllllllllllIlIIlIIlIlIllIIlI)) break block19;
                                            if (!h.llllllllIIIIlI(lllllllllllllllIlIIlIIlIlIllIIIl)) break block20;
                                            "".length();
                                            if ((0x18 ^ 0x1C) < 0) {
                                                return ((0x34 ^ 6) & ~(0xF ^ 0x3D)) != 0;
                                            }
                                            break block21;
                                        }
                                        if (!h.lllllllIlllIll(lllllllllllllllIlIIlIIlIlIllIIlI.equals(lllllllllllllllIlIIlIIlIlIllIIIl) ? 1 : 0)) break block20;
                                    }
                                    return llIIlllIIlII[3];
                                }
                                lllllllllllllllIlIIlIIlIlIllIIII = lllllllllllllllIlIIlIIlIlIllIlIl.av();
                                lllllllllllllllIlIIlIIlIlIlIllll = lllllllllllllllIlIIlIIlIlIllIIll.av();
                                if (!h.lllllllIllllll(lllllllllllllllIlIIlIIlIlIllIIII)) break block22;
                                if (!h.llllllllIIIIlI(lllllllllllllllIlIIlIIlIlIlIllll)) break block23;
                                "".length();
                                if ("   ".length() == 0) {
                                    return ((0x44 ^ 0x4B ^ (0x45 ^ 2)) & (0xB2 ^ 0xC7 ^ (0x36 ^ 0xB) ^ -" ".length())) != 0;
                                }
                                break block24;
                            }
                            if (!h.lllllllIlllIll(((Object)lllllllllllllllIlIIlIIlIlIllIIII).equals(lllllllllllllllIlIIlIIlIlIlIllll) ? 1 : 0)) break block23;
                        }
                        return llIIlllIIlII[3];
                    }
                    lllllllllllllllIlIIlIIlIlIlIlllI = lllllllllllllllIlIIlIIlIlIllIlIl.aw();
                    lllllllllllllllIlIIlIIlIlIlIllIl = lllllllllllllllIlIIlIIlIlIllIIll.aw();
                    if (!h.lllllllIllllll(lllllllllllllllIlIIlIIlIlIlIlllI)) break block25;
                    if (!h.llllllllIIIIlI(lllllllllllllllIlIIlIIlIlIlIllIl)) break block26;
                    "".length();
                    if (-"   ".length() > 0) {
                        return ((72 + 41 - 92 + 158 ^ 73 + 30 - -32 + 29) & (0x56 ^ 0x7E ^ (0x8C ^ 0xB3) ^ -" ".length())) != 0;
                    }
                    break block27;
                }
                if (!h.lllllllIlllIll(((Object)lllllllllllllllIlIIlIIlIlIlIlllI).equals(lllllllllllllllIlIIlIIlIlIlIllIl) ? 1 : 0)) break block26;
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

