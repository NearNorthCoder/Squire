package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/l.class */
public class C0011l {
    private /* synthetic */ EnumC0006g aY = null;
    private static /* synthetic */ int[] llIIllIIllll;
    private final /* synthetic */ WorldPoint aV;
    private /* synthetic */ boolean aX;
    private final /* synthetic */ Point aW;

    private static boolean llllllIllIllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    public boolean aY() {
        return this.aX;
    }

    public int aP() {
        return llllllIllIlIIl(this.aW) ? this.aW.getY() : llIIllIIllll[1];
    }

    public int aM() {
        return this.aV.getX();
    }

    public WorldPoint aW() {
        return this.aV;
    }

    public int hashCode() {
        int i;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i2 = llIIllIIllll[7];
        int i3 = llIIllIIllll[5] * llIIllIIllll[7];
        if (llllllIlllIIIl(aY() ? 1 : 0)) {
            i = llIIllIIllll[8];
            "".length();
            if (((148 ^ 175) ^ (173 ^ 146)) <= "  ".length()) {
                return ((((58 + 39) - 56) + 96) ^ (((68 + 96) - 92) + 120)) & (((134 ^ 153) ^ (27 ^ 77)) ^ (-" ".length()));
            }
        } else {
            i = llIIllIIllll[9];
        }
        int i4 = i3 + i;
        WorldPoint aW = aW();
        int i5 = i4 * llIIllIIllll[7];
        if (llllllIlllIIII(aW)) {
            hashCode = llIIllIIllll[10];
            "".length();
            if (" ".length() == (186 ^ 190)) {
                return (66 ^ 15) & ((232 ^ 165) ^ (-1));
            }
        } else {
            hashCode = aW.hashCode();
        }
        int i6 = i5 + hashCode;
        Point aX = aX();
        int i7 = i6 * llIIllIIllll[7];
        if (llllllIlllIIII(aX)) {
            hashCode2 = llIIllIIllll[10];
            "".length();
            if ((1 ^ 5) <= 0) {
                return (80 ^ 98) & ((84 ^ 102) ^ (-1));
            }
        } else {
            hashCode2 = aX.hashCode();
        }
        int i8 = i7 + hashCode2;
        EnumC0006g aZ = aZ();
        int i9 = i8 * llIIllIIllll[7];
        if (llllllIlllIIII(aZ)) {
            hashCode3 = llIIllIIllll[10];
            "".length();
            if ("  ".length() != "  ".length()) {
                return (78 ^ 19) & ((105 ^ 52) ^ (-1));
            }
        } else {
            hashCode3 = aZ.hashCode();
        }
        return i9 + hashCode3;
    }

    private static boolean llllllIllIlIll(int i, int i2) {
        return i > i2;
    }

    private static boolean llllllIlllIIIl(int i) {
        return i != 0;
    }

    private static boolean llllllIllIlIIl(Object obj) {
        return obj != null;
    }

    public void b(boolean z) {
        this.aX = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public void ao() {
        this.aX = llIIllIIllll[6];
        this.aY = null;
    }

    private static boolean llllllIllIlIlI(int i) {
        return i == 0;
    }

    private static boolean llllllIllIllII(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    public boolean aS() {
        Point aX = aX();
        int x = aX.getX();
        int y = aX.getY();
        if ((!llllllIllIlIlI(x % llIIllIIllll[3]) || llllllIllIlIll(Math.abs(y - llIIllIIllll[4]), llIIllIIllll[5])) && !(llllllIllIlIlI(y % llIIllIIllll[3]) && llllllIllIllII(Math.abs(x - llIIllIIllll[4]), llIIllIIllll[5]))) {
            return llIIllIIllll[6];
        }
        ?? r0 = llIIllIIllll[5];
        "".length();
        return (-" ".length()) >= " ".length() ? ((94 ^ 17) ^ (71 ^ 3)) & (((((71 + 33) - 90) + 141) ^ (((93 + 7) - 2) + 46)) ^ (-" ".length())) : r0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bc, code lost:
        if (llllllIllIlIlI(r0.equals(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0128, code lost:
        if (llllllIllIlIlI(r0.equals(r0) ? 1 : 0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0197, code lost:
        if (llllllIllIlIlI(r0.equals(r0) ? 1 : 0) != false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (llllllIllIllll(obj, this)) {
            return llIIllIIllll[5];
        }
        if (llllllIllIlIlI(obj instanceof C0011l ? 1 : 0)) {
            return llIIllIIllll[6];
        }
        C0011l c0011l = (C0011l) obj;
        if (llllllIllIlIlI(c0011l.a(this) ? 1 : 0)) {
            return llIIllIIllll[6];
        }
        if (llllllIllIlllI(aY() ? 1 : 0, c0011l.aY() ? 1 : 0)) {
            return llIIllIIllll[6];
        }
        WorldPoint aW = aW();
        WorldPoint aW2 = c0011l.aW();
        if (llllllIlllIIII(aW)) {
            if (llllllIllIlIIl(aW2)) {
                "".length();
                if ((((79 ^ 8) ^ (123 ^ 3)) & (((((136 + 135) - 182) + 55) ^ (((55 + 37) - 64) + 147)) ^ (-" ".length()))) >= "  ".length()) {
                    return " ".length() & (" ".length() ^ (-" ".length()));
                }
                return llIIllIIllll[6];
            }
            Point aX = aX();
            Point aX2 = c0011l.aX();
            if (llllllIlllIIII(aX)) {
                if (llllllIllIlIIl(aX2)) {
                    "".length();
                    if (" ".length() == 0) {
                        return ((164 ^ 155) ^ (107 ^ 76)) & (((((115 + 96) - 190) + 116) ^ (((21 + 80) - 73) + 117)) ^ (-" ".length()));
                    }
                    return llIIllIIllll[6];
                }
                EnumC0006g aZ = aZ();
                EnumC0006g aZ2 = c0011l.aZ();
                if (llllllIlllIIII(aZ)) {
                    if (llllllIllIlIIl(aZ2)) {
                        "".length();
                        if ("  ".length() <= (-" ".length())) {
                            return ((((29 + 135) - 85) + 66) ^ (((3 + 134) - (-15)) + 47)) & (((0 ^ 76) ^ (38 ^ 60)) ^ (-" ".length()));
                        }
                        return llIIllIIllll[6];
                    }
                    return llIIllIIllll[5];
                }
            }
        }
    }

    public int aU() {
        return aQ().distanceTo(Players.getLocal());
    }

    public String toString() {
        return "Room(base=" + String.valueOf(aW()) + ", indices=" + String.valueOf(aX()) + ", discovered=" + aY() + ", demiBoss=" + String.valueOf(aZ()) + ")";
    }

    public int aN() {
        return this.aV.getY();
    }

    static {
        llllllIllIlIII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    public boolean e(C0011l c0011l) {
        Point aX = aX();
        int x = aX.getX();
        int y = aX.getY();
        Point aX2 = c0011l.aX();
        int x2 = aX2.getX();
        int y2 = aX2.getY();
        if ((!llllllIllIllIl(x, x2) || llllllIllIlllI(Math.abs(y - y2), llIIllIIllll[5])) && !(llllllIllIllIl(y, y2) && llllllIllIllIl(Math.abs(x - x2), llIIllIIllll[5]))) {
            return llIIllIIllll[6];
        }
        ?? r0 = llIIllIIllll[5];
        "".length();
        return (((((63 + 105) - 143) + 138) ^ (((134 + 99) - 153) + 108)) & (((106 ^ 75) ^ (132 ^ 186)) ^ (-" ".length()))) > ((182 ^ 186) ^ (112 ^ 120)) ? ((11 ^ 94) ^ (181 ^ 197)) & (((12 ^ 24) ^ (241 ^ 192)) ^ (-" ".length())) : r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean aV() {
        if (!llllllIllIllIl(this.aW.getX(), llIIllIIllll[4]) || llllllIllIlllI(this.aW.getY(), llIIllIIllll[4])) {
            ?? r0 = llIIllIIllll[5];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIllIIllll[6];
    }

    public EnumC0006g aZ() {
        return this.aY;
    }

    public Point aX() {
        return this.aW;
    }

    public boolean e(WorldPoint worldPoint) {
        return worldPoint.dx((-worldPoint.getX()) % llIIllIIllll[0]).dy((-worldPoint.getY()) % llIIllIIllll[0]).equals(this.aV);
    }

    private static void llllllIllIlIII() {
        llIIllIIllll = new int[11];
        llIIllIIllll[0] = 57 ^ 41;
        llIIllIIllll[1] = -" ".length();
        llIIllIIllll[2] = (7 ^ 77) ^ (9 ^ 75);
        llIIllIIllll[3] = (193 ^ 158) ^ (46 ^ 119);
        llIIllIIllll[4] = "   ".length();
        llIIllIIllll[5] = " ".length();
        llIIllIIllll[6] = (243 ^ 168) & ((83 ^ 8) ^ (-1));
        llIIllIIllll[7] = 93 ^ 102;
        llIIllIIllll[8] = 248 ^ 183;
        llIIllIIllll[9] = 79 ^ 46;
        llIIllIIllll[10] = (221 ^ 164) ^ (194 ^ 144);
    }

    public int aT() {
        return Math.abs(this.aW.getX() - llIIllIIllll[4]) + Math.abs(this.aW.getY() - llIIllIIllll[4]);
    }

    private static boolean llllllIlllIIII(Object obj) {
        return obj == null;
    }

    @Inject
    public C0011l(WorldPoint worldPoint, Point point) {
        this.aV = worldPoint;
        this.aW = point;
    }

    public void b(EnumC0006g enumC0006g) {
        this.aY = enumC0006g;
    }

    public int aO() {
        return llllllIllIlIIl(this.aW) ? this.aW.getX() : llIIllIIllll[1];
    }

    public WorldArea aR() {
        return new WorldArea(this.aV, this.aV.dx(llIIllIIllll[0]).dy(llIIllIIllll[0]));
    }

    protected boolean a(Object obj) {
        return obj instanceof C0011l;
    }

    private static boolean llllllIllIlllI(int i, int i2) {
        return i != i2;
    }

    public static C0011l a(WorldPoint worldPoint, Point point) {
        return new C0011l(worldPoint.dx((-worldPoint.getX()) % llIIllIIllll[0]).dy((-worldPoint.getY()) % llIIllIIllll[0]), point);
    }

    private static boolean llllllIllIllIl(int i, int i2) {
        return i == i2;
    }

    public WorldPoint aQ() {
        return this.aV.dx(llIIllIIllll[2]).dy(llIIllIIllll[2]);
    }
}
