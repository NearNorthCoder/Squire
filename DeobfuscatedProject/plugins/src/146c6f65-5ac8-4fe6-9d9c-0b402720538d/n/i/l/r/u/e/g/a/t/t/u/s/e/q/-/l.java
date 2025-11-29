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
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.g;
import net.runelite.api.Locatable;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;

public class l {
    private /* synthetic */ g aY;
    private static /* synthetic */ int[] llIIllIIllll;
    private final /* synthetic */ WorldPoint aV;
    private /* synthetic */ boolean aX;
    private final /* synthetic */ Point aW;

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
        l lllllllllllllllIlIIlIlIllIIIllII;
        int n5;
        int n6 = llIIllIIllll[7];
        int n7 = llIIllIIllll[5];
        int n8 = n7 * llIIllIIllll[7];
        if (l.llllllIlllIIIl(this.aY() ? 1 : 0)) {
            n5 = llIIllIIllll[8];
            "".length();
            if ((0x94 ^ 0xAF ^ (0xAD ^ 0x92)) <= "  ".length()) {
                return (58 + 39 - 56 + 96 ^ 68 + 96 - 92 + 120) & (0x86 ^ 0x99 ^ (0x1B ^ 0x4D) ^ -" ".length());
            }
        } else {
            n5 = llIIllIIllll[9];
        }
        int lllllllllllllllIlIIlIlIllIIIlIlI = n8 + n5;
        WorldPoint lllllllllllllllIlIIlIlIllIIIlIIl = lllllllllllllllIlIIlIlIllIIIllII.aW();
        int n9 = lllllllllllllllIlIIlIlIllIIIlIlI * llIIllIIllll[7];
        if (l.llllllIlllIIII(lllllllllllllllIlIIlIlIllIIIlIIl)) {
            n4 = llIIllIIllll[10];
            "".length();
            if (" ".length() == (0xBA ^ 0xBE)) {
                return (0x42 ^ 0xF) & ~(0xE8 ^ 0xA5);
            }
        } else {
            n4 = lllllllllllllllIlIIlIlIllIIIlIIl.hashCode();
        }
        lllllllllllllllIlIIlIlIllIIIlIlI = n9 + n4;
        Point lllllllllllllllIlIIlIlIllIIIlIII = lllllllllllllllIlIIlIlIllIIIllII.aX();
        int n10 = lllllllllllllllIlIIlIlIllIIIlIlI * llIIllIIllll[7];
        if (l.llllllIlllIIII(lllllllllllllllIlIIlIlIllIIIlIII)) {
            n3 = llIIllIIllll[10];
            "".length();
            if ((1 ^ 5) <= 0) {
                return (0x50 ^ 0x62) & ~(0x54 ^ 0x66);
            }
        } else {
            n3 = lllllllllllllllIlIIlIlIllIIIlIII.hashCode();
        }
        lllllllllllllllIlIIlIlIllIIIlIlI = n10 + n3;
        g lllllllllllllllIlIIlIlIllIIIIlll = lllllllllllllllIlIIlIlIllIIIllII.aZ();
        int n11 = lllllllllllllllIlIIlIlIllIIIlIlI * llIIllIIllll[7];
        if (l.llllllIlllIIII((Object)lllllllllllllllIlIIlIlIllIIIIlll)) {
            n2 = llIIllIIllll[10];
            "".length();
            if ("  ".length() != "  ".length()) {
                return (0x4E ^ 0x13) & ~(0x69 ^ 0x34);
            }
        } else {
            n2 = ((Object)((Object)lllllllllllllllIlIIlIlIllIIIIlll)).hashCode();
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
        void lllllllllllllllIlIIlIlIllIlllIII;
        void lllllllllllllllIlIIlIlIllIllIlll;
        Point point = this.aX();
        int n3 = point.getX();
        int n4 = point.getY();
        if (l.llllllIllIlIlI(n3 % llIIllIIllll[3]) && !l.llllllIllIlIll(Math.abs(n4 - llIIllIIllll[4]), llIIllIIllll[5]) || l.llllllIllIlIlI((int)(lllllllllllllllIlIIlIlIllIllIlll % llIIllIIllll[3])) && l.llllllIllIllII(Math.abs((int)(lllllllllllllllIlIIlIlIllIlllIII - llIIllIIllll[4])), llIIllIIllll[5])) {
            n2 = llIIllIIllll[5];
            "".length();
            if (-" ".length() >= " ".length()) {
                return ((0x5E ^ 0x11 ^ (0x47 ^ 3)) & (71 + 33 - 90 + 141 ^ 93 + 7 - 2 + 46 ^ -" ".length())) != 0;
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
                g lllllllllllllllIlIIlIlIllIIlIIll;
                g lllllllllllllllIlIIlIlIllIIlIlII;
                block25: {
                    l lllllllllllllllIlIIlIlIllIIllIll;
                    l lllllllllllllllIlIIlIlIllIIllIIl;
                    block23: {
                        block24: {
                            Point lllllllllllllllIlIIlIlIllIIlIlIl;
                            Point lllllllllllllllIlIIlIlIllIIlIllI;
                            block22: {
                                block20: {
                                    block21: {
                                        WorldPoint lllllllllllllllIlIIlIlIllIIlIlll;
                                        WorldPoint lllllllllllllllIlIIlIlIllIIllIII;
                                        block19: {
                                            void lllllllllllllllIlIIlIlIllIIllIlI;
                                            if (l.llllllIllIllll(object, this)) {
                                                return llIIllIIllll[5];
                                            }
                                            if (l.llllllIllIlIlI(lllllllllllllllIlIIlIlIllIIllIlI instanceof l)) {
                                                return llIIllIIllll[6];
                                            }
                                            lllllllllllllllIlIIlIlIllIIllIIl = (l)lllllllllllllllIlIIlIlIllIIllIlI;
                                            if (l.llllllIllIlIlI(lllllllllllllllIlIIlIlIllIIllIIl.a(lllllllllllllllIlIIlIlIllIIllIll) ? 1 : 0)) {
                                                return llIIllIIllll[6];
                                            }
                                            if (l.llllllIllIlllI(lllllllllllllllIlIIlIlIllIIllIll.aY() ? 1 : 0, lllllllllllllllIlIIlIlIllIIllIIl.aY() ? 1 : 0)) {
                                                return llIIllIIllll[6];
                                            }
                                            lllllllllllllllIlIIlIlIllIIllIII = lllllllllllllllIlIIlIlIllIIllIll.aW();
                                            lllllllllllllllIlIIlIlIllIIlIlll = lllllllllllllllIlIIlIlIllIIllIIl.aW();
                                            if (!l.llllllIlllIIII(lllllllllllllllIlIIlIlIllIIllIII)) break block19;
                                            if (!l.llllllIllIlIIl(lllllllllllllllIlIIlIlIllIIlIlll)) break block20;
                                            "".length();
                                            if (((0x4F ^ 8 ^ (0x7B ^ 3)) & (136 + 135 - 182 + 55 ^ 55 + 37 - 64 + 147 ^ -" ".length())) >= "  ".length()) {
                                                return (" ".length() & (" ".length() ^ -" ".length())) != 0;
                                            }
                                            break block21;
                                        }
                                        if (!l.llllllIllIlIlI(lllllllllllllllIlIIlIlIllIIllIII.equals(lllllllllllllllIlIIlIlIllIIlIlll) ? 1 : 0)) break block20;
                                    }
                                    return llIIllIIllll[6];
                                }
                                lllllllllllllllIlIIlIlIllIIlIllI = lllllllllllllllIlIIlIlIllIIllIll.aX();
                                lllllllllllllllIlIIlIlIllIIlIlIl = lllllllllllllllIlIIlIlIllIIllIIl.aX();
                                if (!l.llllllIlllIIII(lllllllllllllllIlIIlIlIllIIlIllI)) break block22;
                                if (!l.llllllIllIlIIl(lllllllllllllllIlIIlIlIllIIlIlIl)) break block23;
                                "".length();
                                if (" ".length() == 0) {
                                    return ((0xA4 ^ 0x9B ^ (0x6B ^ 0x4C)) & (115 + 96 - 190 + 116 ^ 21 + 80 - 73 + 117 ^ -" ".length())) != 0;
                                }
                                break block24;
                            }
                            if (!l.llllllIllIlIlI(lllllllllllllllIlIIlIlIllIIlIllI.equals(lllllllllllllllIlIIlIlIllIIlIlIl) ? 1 : 0)) break block23;
                        }
                        return llIIllIIllll[6];
                    }
                    lllllllllllllllIlIIlIlIllIIlIlII = lllllllllllllllIlIIlIlIllIIllIll.aZ();
                    lllllllllllllllIlIIlIlIllIIlIIll = lllllllllllllllIlIIlIlIllIIllIIl.aZ();
                    if (!l.llllllIlllIIII((Object)lllllllllllllllIlIIlIlIllIIlIlII)) break block25;
                    if (!l.llllllIllIlIIl((Object)lllllllllllllllIlIIlIlIllIIlIIll)) break block26;
                    "".length();
                    if ("  ".length() <= -" ".length()) {
                        return ((29 + 135 - 85 + 66 ^ 3 + 134 - -15 + 47) & (0 ^ 0x4C ^ (0x26 ^ 0x3C) ^ -" ".length())) != 0;
                    }
                    break block27;
                }
                if (!l.llllllIllIlIlI(((Object)((Object)lllllllllllllllIlIIlIlIllIIlIlII)).equals((Object)lllllllllllllllIlIIlIlIllIIlIIll) ? 1 : 0)) break block26;
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
        void lllllllllllllllIlIIlIlIllIlIlIII;
        void lllllllllllllllIlIIlIlIllIlIlIll;
        void lllllllllllllllIlIIlIlIllIlIIlll;
        void lllllllllllllllIlIIlIlIllIlIlIlI;
        Point point = this.aX();
        int n3 = point.getX();
        int n4 = point.getY();
        Point point2 = l2.aX();
        int n5 = point2.getX();
        int n6 = point2.getY();
        if (l.llllllIllIllIl(n3, n5) && !l.llllllIllIlllI(Math.abs(n4 - n6), llIIllIIllll[5]) || l.llllllIllIllIl((int)lllllllllllllllIlIIlIlIllIlIlIlI, (int)lllllllllllllllIlIIlIlIllIlIIlll) && l.llllllIllIllIl(Math.abs((int)(lllllllllllllllIlIIlIlIllIlIlIll - lllllllllllllllIlIIlIlIllIlIlIII)), llIIllIIllll[5])) {
            n2 = llIIllIIllll[5];
            "".length();
            if (((63 + 105 - 143 + 138 ^ 134 + 99 - 153 + 108) & (0x6A ^ 0x4B ^ (0x84 ^ 0xBA) ^ -" ".length())) > (0xB6 ^ 0xBA ^ (0x70 ^ 0x78))) {
                return ((0xB ^ 0x5E ^ (0xB5 ^ 0xC5)) & (0xC ^ 0x18 ^ (0xF1 ^ 0xC0) ^ -" ".length())) != 0;
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
            "".length();
            if (null != null) {
                return ((0xCC ^ 0xC5) & ~(0x93 ^ 0x9A)) != 0;
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

    private static void llllllIllIlIII() {
        llIIllIIllll = new int[11];
        l.llIIllIIllll[0] = 0x39 ^ 0x29;
        l.llIIllIIllll[1] = -" ".length();
        l.llIIllIIllll[2] = 7 ^ 0x4D ^ (9 ^ 0x4B);
        l.llIIllIIllll[3] = 0xC1 ^ 0x9E ^ (0x2E ^ 0x77);
        l.llIIllIIllll[4] = "   ".length();
        l.llIIllIIllll[5] = " ".length();
        l.llIIllIIllll[6] = (0xF3 ^ 0xA8) & ~(0x53 ^ 8);
        l.llIIllIIllll[7] = 0x5D ^ 0x66;
        l.llIIllIIllll[8] = 0xF8 ^ 0xB7;
        l.llIIllIIllll[9] = 0x4F ^ 0x2E;
        l.llIIllIIllll[10] = 0xDD ^ 0xA4 ^ (0xC2 ^ 0x90);
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

