package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/h.class */
public class C0007h {
    private final /* synthetic */ List<C0011l> aN;
    private static final /* synthetic */ Logger aJ;
    private final /* synthetic */ C0012m aM;
    private final /* synthetic */ Point aL;
    private final /* synthetic */ C0011l[][] aK = new C0011l[llIIlllIIlII[0]][llIIlllIIlII[0]];
    private static /* synthetic */ int[] llIIlllIIlII;

    private static boolean lllllllIlllIIl(int i) {
        return i != 0;
    }

    public List<C0011l> a(WorldPoint worldPoint, C0011l c0011l) {
        C0011l d = d(worldPoint);
        if (lllllllIllllII(d, c0011l)) {
            return Collections.emptyList();
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put(d, Integer.valueOf(llIIlllIIlII[3]));
        "".length();
        LinkedList linkedList = new LinkedList();
        linkedList.add(d);
        "".length();
        while (lllllllIlllIll(linkedList.isEmpty() ? 1 : 0)) {
            C0011l c0011l2 = (C0011l) linkedList.remove();
            int intValue = ((Integer) hashMap.get(c0011l2)).intValue();
            for (C0011l c0011l3 : c(c0011l2)) {
                if (lllllllIllIlll(c0011l3.aO(), llIIlllIIlII[1]) && lllllllIllIlll(c0011l3.aP(), llIIlllIIlII[1])) {
                    "".length();
                    if ("  ".length() == 0) {
                        return null;
                    }
                } else {
                    int lllllllllllllllIlIIlIIlIllIIlIll = ((Integer) hashMap.getOrDefault(c0011l3, Integer.valueOf(llIIlllIIlII[8]))).intValue();
                    int lllllllllllllllIlIIlIIlIllIIlIIl = (int) (intValue + c0011l2.aQ().distanceTo2DHypotenuse(c0011l3.aQ()));
                    if (lllllllIllllIl(lllllllllllllllIlIIlIIlIllIIlIIl, lllllllllllllllIlIIlIIlIllIIlIll)) {
                        "".length();
                        if (0 != 0) {
                            return null;
                        }
                    } else {
                        hashMap.put(c0011l3, Integer.valueOf(lllllllllllllllIlIIlIIlIllIIlIIl));
                        "".length();
                        linkedList.add(c0011l3);
                        "".length();
                        hashMap2.put(c0011l3, c0011l2);
                        "".length();
                        "".length();
                        if ((true ^ true) & ((true ^ true) ^ true)) {
                            return null;
                        }
                    }
                }
            }
            "".length();
            if ("  ".length() <= (((104 ^ 96) ^ (193 ^ 196)) & (((164 ^ 149) ^ (149 ^ 169)) ^ (-" ".length())))) {
                return null;
            }
        }
        if (lllllllIlllIll(hashMap2.containsKey(c0011l) ? 1 : 0)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        C0011l c0011l4 = c0011l;
        while (lllllllIlllllI(c0011l4, d)) {
            arrayList.add(c0011l4);
            "".length();
            c0011l4 = (C0011l) hashMap2.getOrDefault(c0011l4, null);
            if (lllllllIllllll(c0011l4)) {
                return Collections.emptyList();
            }
        }
        arrayList.add(c0011l4);
        "".length();
        return arrayList;
    }

    private static boolean lllllllIlllIII(int i, int i2) {
        return i != i2;
    }

    public Point c(WorldPoint worldPoint) {
        WorldPoint dy = worldPoint.dx((-worldPoint.getX()) % llIIlllIIlII[4]).dy((-worldPoint.getY()) % llIIlllIIlII[4]);
        C0011l aq = aq();
        int x = dy.getX() - aq.aM();
        int y = dy.getY() - aq.aN();
        return new Point(llIIlllIIlII[1] + (x / llIIlllIIlII[4]), llIIlllIIlII[1] + (y / llIIlllIIlII[4]));
    }

    public Optional<C0011l> ar() {
        return aw().stream().filter(c0011l -> {
            if (lllllllIlllIll(c0011l.aY() ? 1 : 0)) {
                ?? r0 = llIIlllIIlII[2];
                "".length();
                return (-" ".length()) >= 0 ? ((118 ^ 108) ^ (183 ^ 162)) & (((188 ^ 173) ^ (48 ^ 46)) ^ (-" ".length())) : r0;
            }
            return llIIlllIIlII[3];
        }).findFirst();
    }

    private static boolean llllllllIIIIIl(int i, int i2) {
        return i >= i2;
    }

    private void ap() {
        int i = llIIlllIIlII[3];
        while (lllllllIllIllI(i, this.aK.length)) {
            int i2 = llIIlllIIlII[3];
            while (lllllllIllIllI(i2, this.aK[i].length)) {
                if (!lllllllIllIlll(i, llIIlllIIlII[1]) || lllllllIlllIII(i2, llIIlllIIlII[1])) {
                    if (lllllllIllIlll(i, this.aL.getX()) && lllllllIllIlll(i2, this.aL.getY())) {
                        "".length();
                        if ((88 ^ 92) <= "   ".length()) {
                            return;
                        }
                    } else {
                        Point point = new Point(i - llIIlllIIlII[1], i2 - llIIlllIIlII[1]);
                        this.aK[i][i2] = C0011l.a(aq().aW().dx(point.getX() * llIIlllIIlII[4]).dy(point.getY() * llIIlllIIlII[4]), new Point(i, i2));
                    }
                }
                i2++;
                "".length();
                if (0 != 0) {
                    return;
                }
            }
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return;
            }
        }
    }

    public C0011l as() {
        Stream<C0011l> filter = aw().stream().filter((v0) -> {
            return v0.aY();
        });
        List<C0011l> aw = aw();
        Objects.requireNonNull(aw);
        "".length();
        return filter.max(Comparator.comparingInt((v1) -> {
            return r1.indexOf(v1);
        })).orElse(av());
    }

    private static boolean lllllllIllIllI(int i, int i2) {
        return i < i2;
    }

    static {
        lllllllIllIlIl();
        aJ = LoggerFactory.getLogger(C0007h.class);
    }

    private static boolean lllllllIlllIll(int i) {
        return i == 0;
    }

    private static boolean lllllllIllIlll(int i, int i2) {
        return i == i2;
    }

    public C0011l[][] at() {
        return this.aK;
    }

    public List<C0011l> aw() {
        return this.aN;
    }

    public Point b(C0011l c0011l) {
        return c0011l.aX();
    }

    public C0012m av() {
        return this.aM;
    }

    private static boolean llllllllIIIIlI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    private boolean a(C0011l c0011l, C0011l c0011l2, boolean z) {
        Point b = b(c0011l);
        Point b2 = b(c0011l2);
        Point point = new Point(Math.abs(b.getX() - b2.getX()), Math.abs(b.getY() - b2.getY()));
        if (!lllllllIlllIIl(z ? 1 : 0)) {
            if (lllllllIlllIlI(point.getX() + point.getY(), llIIlllIIlII[2])) {
                ?? r0 = llIIlllIIlII[2];
                "".length();
                return (((15 ^ 93) ^ (45 ^ 38)) & (((82 ^ 98) ^ (244 ^ 157)) ^ (-" ".length()))) >= "  ".length() ? ((20 ^ 120) ^ (113 ^ 56)) & (((126 ^ 87) ^ (66 ^ 78)) ^ (-" ".length())) : r0;
            }
            return llIIlllIIlII[3];
        } else if (lllllllIlllIlI(point.getX(), llIIlllIIlII[2]) && lllllllIlllIlI(point.getY(), llIIlllIIlII[2])) {
            ?? r02 = llIIlllIIlII[2];
            "".length();
            return ((175 ^ 129) ^ (67 ^ 104)) <= 0 ? ((200 ^ 161) ^ (52 ^ 17)) & (((((190 + 78) - 216) + 183) ^ (((57 + 49) - (-50)) + 11)) ^ (-" ".length())) : r02;
        } else {
            ?? r03 = llIIlllIIlII[3];
            "".length();
            return " ".length() >= ((94 ^ 34) ^ (195 ^ 187)) ? ((108 ^ 94) ^ (183 ^ 146)) & (((24 ^ 120) ^ (44 ^ 91)) ^ (-" ".length())) : r03;
        }
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = llIIlllIIlII[10];
        int deepHashCode = (llIIlllIIlII[2] * llIIlllIIlII[10]) + Arrays.deepHashCode(at());
        Point au = au();
        int i2 = deepHashCode * llIIlllIIlII[10];
        if (lllllllIllllll(au)) {
            hashCode = llIIlllIIlII[11];
            "".length();
            if ("  ".length() < 0) {
                return ((152 ^ 139) ^ (81 ^ 99)) & ((" ".length() ^ (152 ^ 184)) ^ (-" ".length()));
            }
        } else {
            hashCode = au.hashCode();
        }
        int lllllllllllllllIlIIlIIlIlIlIIlII = i2 + hashCode;
        C0012m av = av();
        int i3 = lllllllllllllllIlIIlIIlIlIlIIlII * llIIlllIIlII[10];
        if (lllllllIllllll(av)) {
            hashCode2 = llIIlllIIlII[11];
            "".length();
            if ((-" ".length()) >= (((163 ^ 192) ^ (175 ^ 134)) & (((((231 + 212) - 262) + 74) ^ (((98 + 107) - 128) + 104)) ^ (-" ".length())))) {
                return ((227 ^ 182) ^ (176 ^ 173)) & (((3 ^ 122) ^ (29 ^ 44)) ^ (-" ".length()));
            }
        } else {
            hashCode2 = av.hashCode();
        }
        int lllllllllllllllIlIIlIIlIlIlIIlII2 = i3 + hashCode2;
        List<C0011l> aw = aw();
        int i4 = lllllllllllllllIlIIlIIlIlIlIIlII2 * llIIlllIIlII[10];
        if (lllllllIllllll(aw)) {
            hashCode3 = llIIlllIIlII[11];
            "".length();
            if ((-"  ".length()) > 0) {
                return (214 ^ 141) & ((98 ^ 57) ^ (-1));
            }
        } else {
            hashCode3 = aw.hashCode();
        }
        return i4 + hashCode3;
    }

    private static boolean lllllllIllllIl(int i, int i2) {
        return i > i2;
    }

    public List<C0011l> c(C0011l c0011l) {
        Point b = b(c0011l);
        Point[] pointArr = new Point[llIIlllIIlII[5]];
        pointArr[llIIlllIIlII[3]] = b.offset(llIIlllIIlII[6], llIIlllIIlII[3]);
        pointArr[llIIlllIIlII[2]] = b.offset(llIIlllIIlII[2], llIIlllIIlII[3]);
        pointArr[llIIlllIIlII[7]] = b.offset(llIIlllIIlII[3], llIIlllIIlII[6]);
        pointArr[llIIlllIIlII[1]] = b.offset(llIIlllIIlII[3], llIIlllIIlII[2]);
        return (List) Arrays.stream(pointArr).filter(point -> {
            if (llllllllIIIIII(point.getX()) && lllllllIllIllI(point.getX(), llIIlllIIlII[0]) && llllllllIIIIII(point.getY()) && lllllllIllIllI(point.getY(), llIIlllIIlII[0])) {
                ?? r0 = llIIlllIIlII[2];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlllIIlII[3];
        }).map(point2 -> {
            return this.aK[point2.getX()][point2.getY()];
        }).collect(Collectors.toList());
    }

    private static boolean llllllllIIIIII(int i) {
        return i >= 0;
    }

    private static boolean lllllllIllllll(Object obj) {
        return obj == null;
    }

    private List<C0011l> a(Point point) {
        int x = point.getX() - llIIlllIIlII[1];
        int y = point.getY() - llIIlllIIlII[1];
        Point[] pointArr = new Point[llIIlllIIlII[9]];
        pointArr[llIIlllIIlII[3]] = new Point(point.getX() + y, point.getY() + x);
        pointArr[llIIlllIIlII[2]] = new Point(point.getX() + y + x, point.getY() + x + y);
        pointArr[llIIlllIIlII[7]] = new Point(point.getX() + x, point.getY() + y);
        pointArr[llIIlllIIlII[1]] = new Point((point.getX() + x) - y, (point.getY() + y) - x);
        pointArr[llIIlllIIlII[5]] = new Point(point.getX() - y, point.getY() - x);
        return (List) Stream.of((Object[]) pointArr).map(point2 -> {
            return this.aK[point2.getX()][point2.getY()];
        }).collect(Collectors.toList());
    }

    private static boolean lllllllIlllIlI(int i, int i2) {
        return i <= i2;
    }

    public void ao() {
        this.aN.clear();
        int i = llIIlllIIlII[3];
        while (lllllllIllIllI(i, this.aK.length)) {
            int i2 = llIIlllIIlII[3];
            while (lllllllIllIllI(i2, this.aK[i].length)) {
                this.aK[i][i2].ao();
                this.aK[i][i2] = null;
                i2++;
                "".length();
                if (" ".length() >= "  ".length()) {
                    return;
                }
            }
            i++;
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }

    public Point au() {
        return this.aL;
    }

    public C0011l aq() {
        return this.aK[llIIlllIIlII[1]][llIIlllIIlII[1]];
    }

    private static void lllllllIllIlIl() {
        llIIlllIIlII = new int[12];
        llIIlllIIlII[0] = 173 ^ 170;
        llIIlllIIlII[1] = "   ".length();
        llIIlllIIlII[2] = " ".length();
        llIIlllIIlII[3] = (71 ^ 22) & ((244 ^ 165) ^ (-1));
        llIIlllIIlII[4] = (((88 + 24) - (-31)) + 43) ^ (((126 + 96) - 185) + 133);
        llIIlllIIlII[5] = 166 ^ 162;
        llIIlllIIlII[6] = -" ".length();
        llIIlllIIlII[7] = "  ".length();
        llIIlllIIlII[8] = (-1) & Integer.MAX_VALUE;
        llIIlllIIlII[9] = 167 ^ 162;
        llIIlllIIlII[10] = 22 ^ 45;
        llIIlllIIlII[11] = 112 ^ 91;
    }

    public List<C0011l> b(Predicate<C0011l> predicate) {
        ArrayList arrayList = new ArrayList();
        C0011l[][] c0011lArr = this.aK;
        int length = c0011lArr.length;
        int i = llIIlllIIlII[3];
        while (lllllllIllIllI(i, length)) {
            C0011l[] c0011lArr2 = c0011lArr[i];
            int length2 = c0011lArr2.length;
            int i2 = llIIlllIIlII[3];
            while (lllllllIllIllI(i2, length2)) {
                C0011l c0011l = c0011lArr2[i2];
                if (lllllllIlllIll(predicate.test(c0011l) ? 1 : 0)) {
                    "".length();
                    if (" ".length() > "   ".length()) {
                        return null;
                    }
                } else {
                    arrayList.add(c0011l);
                    "".length();
                }
                i2++;
                "".length();
                if ((184 ^ 188) <= " ".length()) {
                    return null;
                }
            }
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        if (lllllllIlllIll(r0.equals(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e8, code lost:
        if (lllllllIlllIll(r0.equals(r0) ? 1 : 0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0155, code lost:
        if (lllllllIlllIll(r0.equals(r0) ? 1 : 0) != false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (lllllllIllllII(obj, this)) {
            return llIIlllIIlII[2];
        }
        if (lllllllIlllIll(obj instanceof C0007h ? 1 : 0)) {
            return llIIlllIIlII[3];
        }
        C0007h c0007h = (C0007h) obj;
        if (!lllllllIlllIll(c0007h.a(this) ? 1 : 0) && !lllllllIlllIll(Arrays.deepEquals(at(), c0007h.at()) ? 1 : 0)) {
            Point au = au();
            Point au2 = c0007h.au();
            if (lllllllIllllll(au)) {
                if (llllllllIIIIlI(au2)) {
                    "".length();
                    if ((24 ^ 28) < 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                    return llIIlllIIlII[3];
                }
                C0012m av = av();
                C0012m av2 = c0007h.av();
                if (lllllllIllllll(av)) {
                    if (llllllllIIIIlI(av2)) {
                        "".length();
                        if ("   ".length() == 0) {
                            return ((68 ^ 75) ^ (69 ^ 2)) & (((178 ^ 199) ^ (54 ^ 11)) ^ (-" ".length()));
                        }
                        return llIIlllIIlII[3];
                    }
                    List<C0011l> aw = aw();
                    List<C0011l> aw2 = c0007h.aw();
                    if (lllllllIllllll(aw)) {
                        if (llllllllIIIIlI(aw2)) {
                            "".length();
                            if ((-"   ".length()) > 0) {
                                return ((((72 + 41) - 92) + 158) ^ (((73 + 30) - (-32)) + 29)) & (((86 ^ 126) ^ (140 ^ 179)) ^ (-" ".length()));
                            }
                            return llIIlllIIlII[3];
                        }
                        return llIIlllIIlII[2];
                    }
                }
            }
        }
        return llIIlllIIlII[3];
    }

    protected boolean a(Object obj) {
        return obj instanceof C0007h;
    }

    public C0011l d(WorldPoint worldPoint) {
        Point c = c(worldPoint);
        int x = c.getX();
        int y = c.getY();
        if (llllllllIIIIII(x) && lllllllIllIllI(x, llIIlllIIlII[0]) && llllllllIIIIII(y) && !llllllllIIIIIl(y, llIIlllIIlII[0])) {
            return this.aK[x][y];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    public C0007h(WorldPoint worldPoint, C0011l c0011l) {
        this.aK[llIIlllIIlII[1]][llIIlllIIlII[1]] = c0011l;
        c0011l.b((boolean) llIIlllIIlII[2]);
        this.aL = c(worldPoint);
        ap();
        this.aM = C0012m.b(worldPoint, this.aL);
        this.aM.b((boolean) llIIlllIIlII[2]);
        this.aK[this.aL.getX()][this.aL.getY()] = this.aM;
        this.aN = a(this.aL);
    }

    private static boolean lllllllIllllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    public String toString() {
        return "GauntletMap(rooms=" + Arrays.deepToString(at()) + ", spawn=" + String.valueOf(au()) + ", spawnRoom=" + String.valueOf(av()) + ", orderedCycleRooms=" + String.valueOf(aw()) + ")";
    }

    private static boolean lllllllIlllllI(Object obj, Object obj2) {
        return obj != obj2;
    }
}
