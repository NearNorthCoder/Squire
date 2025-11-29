/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.runelite.api.coords.WorldPoint;

public class s {
    private final /* synthetic */ Map<WorldPoint, Boolean> aO;
    private /* synthetic */ List<WorldPoint> aP;
    private static /* synthetic */ int[] llIlllIIIIl;

    private static boolean lIlIlIlIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> af() {
        void var1_1;
        s llllllllllllllllIIlIlIlllIlllIII;
        List<Object> llllllllllllllllIIlIlIlllIllIlll = new ArrayList();
        if (s.lIlIlIlIllIIIl(llllllllllllllllIIlIlIlllIlllIII.a(llllllllllllllllIIlIlIlllIlllIII.aO) ? 1 : 0)) {
            return Collections.emptyList();
        }
        Iterator<WorldPoint> llllllllllllllllIIlIlIlllIllIllI = llllllllllllllllIIlIlIlllIlllIII.aO.keySet().iterator();
        while (s.lIlIlIlIllIIIl(llllllllllllllllIIlIlIlllIllIllI.hasNext() ? 1 : 0)) {
            WorldPoint llllllllllllllllIIlIlIlllIllIlIl = llllllllllllllllIIlIlIlllIllIllI.next();
            List<WorldPoint> llllllllllllllllIIlIlIlllIllIlII = new ArrayList<WorldPoint>();
            llllllllllllllllIIlIlIlllIllIlII.add(llllllllllllllllIIlIlIlllIllIlIl);
            "".length();
            llllllllllllllllIIlIlIlllIllIlII = llllllllllllllllIIlIlIlllIlllIII.a(llllllllllllllllIIlIlIlllIlllIII.aO, llllllllllllllllIIlIlIlllIllIlIl, llllllllllllllllIIlIlIlllIllIlII, llIlllIIIIl[0]);
            if (s.lIlIlIlIllIIIl(llllllllllllllllIIlIlIlllIllIlII.isEmpty() ? 1 : 0)) {
                "".length();
                if ("   ".length() == "   ".length()) continue;
                return null;
            }
            if (!s.lIlIlIlIllIIlI(llllllllllllllllIIlIlIlllIllIlll.isEmpty() ? 1 : 0) || s.lIlIlIlIllIIll(llllllllllllllllIIlIlIlllIllIlll.size(), llllllllllllllllIIlIlIlllIllIlII.size())) {
                llllllllllllllllIIlIlIlllIllIlll = llllllllllllllllIIlIlIlllIllIlII;
            }
            "".length();
            if ((0x70 ^ 0x75) > 0) continue;
            return null;
        }
        return var1_1;
    }

    private boolean a(Map<WorldPoint, Boolean> map) {
        Iterator<Boolean> llllllllllllllllIIlIlIlllIIlIlll = map.values().iterator();
        while (s.lIlIlIlIllIIIl(llllllllllllllllIIlIlIlllIIlIlll.hasNext() ? 1 : 0)) {
            int llllllllllllllllIIlIlIlllIIlIllI = llllllllllllllllIIlIlIlllIIlIlll.next().booleanValue() ? 1 : 0;
            if (s.lIlIlIlIllIIlI(llllllllllllllllIIlIlIlllIIlIllI)) {
                return llIlllIIIIl[3];
            }
            "".length();
            if (((0x3B ^ 0x78) & ~(0x50 ^ 0x13)) == 0) continue;
            return ((0x4A ^ 1) & ~(0x68 ^ 0x23)) != 0;
        }
        return llIlllIIIIl[2];
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> a(Map<WorldPoint, Boolean> map, WorldPoint worldPoint, List<WorldPoint> list, int n2) {
        int llllllllllllllllIIlIlIlllIlIIIII2;
        int n3;
        void llllllllllllllllIIlIlIlllIlIIlII;
        s llllllllllllllllIIlIlIlllIlIIlll;
        void llllllllllllllllIIlIlIlllIlIIlIl;
        void llllllllllllllllIIlIlIlllIlIIllI;
        if (s.lIlIlIlIllIIll(list.size(), n2)) {
            return Collections.emptyList();
        }
        HashMap<WorldPoint, Boolean> llllllllllllllllIIlIlIlllIlIIIlI = new HashMap<WorldPoint, Boolean>();
        Object llllllllllllllllIIlIlIlllIlIIIIl = llllllllllllllllIIlIlIlllIlIIllI.keySet().iterator();
        while (s.lIlIlIlIllIIIl(llllllllllllllllIIlIlIlllIlIIIIl.hasNext() ? 1 : 0)) {
            WorldPoint llllllllllllllllIIlIlIlllIlIIIII2 = (WorldPoint)llllllllllllllllIIlIlIlllIlIIIIl.next();
            if (s.lIlIlIlIllIlII(llllllllllllllllIIlIlIlllIlIIIII2.distanceTo2D((WorldPoint)llllllllllllllllIIlIlIlllIlIIlIl), llIlllIIIIl[1]) && (!s.lIlIlIlIllIlIl(llllllllllllllllIIlIlIlllIlIIIII2.getX(), llllllllllllllllIIlIlIlllIlIIlIl.getX()) || s.lIlIlIlIllIllI(llllllllllllllllIIlIlIlllIlIIIII2.getY(), llllllllllllllllIIlIlIlllIlIIlIl.getY()))) {
                boolean bl2;
                if (s.lIlIlIlIllIIlI(((Boolean)llllllllllllllllIIlIlIlllIlIIllI.get(llllllllllllllllIIlIlIlllIlIIIII2)).booleanValue() ? 1 : 0)) {
                    bl2 = llIlllIIIIl[2];
                    "".length();
                    if (-(155 + 52 - 72 + 52 ^ 4 + 3 - -11 + 172) >= 0) {
                        return null;
                    }
                } else {
                    bl2 = llIlllIIIIl[3];
                }
                llllllllllllllllIIlIlIlllIlIIIlI.put(llllllllllllllllIIlIlIlllIlIIIII2, bl2);
                "".length();
                "".length();
                if (((121 + 148 - 234 + 138 ^ 18 + 109 - 10 + 19) & (0xBC ^ 0xAA ^ (0x3D ^ 0xE) ^ -" ".length())) != 0) {
                    return null;
                }
            } else {
                llllllllllllllllIIlIlIlllIlIIIlI.put(llllllllllllllllIIlIlIlllIlIIIII2, (Boolean)llllllllllllllllIIlIlIlllIlIIllI.get(llllllllllllllllIIlIlIlllIlIIIII2));
                "".length();
            }
            "".length();
            if (-" ".length() < 0) continue;
            return null;
        }
        if (s.lIlIlIlIllIIIl(llllllllllllllllIIlIlIlllIlIIlll.a(llllllllllllllllIIlIlIlllIlIIIlI) ? 1 : 0)) {
            return llllllllllllllllIIlIlIlllIlIIlII;
        }
        llllllllllllllllIIlIlIlllIlIIIIl = new ArrayList(llllllllllllllllIIlIlIlllIlIIIlI.keySet());
        Collections.shuffle(llllllllllllllllIIlIlIlllIlIIIIl);
        if (s.lIlIlIlIllIIIl(llllllllllllllllIIlIlIlllIlIIlll.aP.isEmpty() ? 1 : 0)) {
            n3 = llIlllIIIIl[4];
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        } else {
            n3 = llllllllllllllllIIlIlIlllIlIIIII2 = llllllllllllllllIIlIlIlllIlIIlll.aP.size();
        }
        if (s.lIlIlIlIllIlll(llllllllllllllllIIlIlIlllIlIIlII.size(), llllllllllllllllIIlIlIlllIlIIIII2)) {
            return llllllllllllllllIIlIlIlllIlIIlll.aP;
        }
        Iterator llllllllllllllllIIlIlIlllIIlllll = llllllllllllllllIIlIlIlllIlIIIIl.iterator();
        while (s.lIlIlIlIllIIIl(llllllllllllllllIIlIlIlllIIlllll.hasNext() ? 1 : 0)) {
            void llllllllllllllllIIlIlIlllIlIIIll;
            WorldPoint llllllllllllllllIIlIlIlllIIllllI = (WorldPoint)llllllllllllllllIIlIlIlllIIlllll.next();
            if (s.lIlIlIlIllIIIl(llllllllllllllllIIlIlIlllIIllllI.equals((Object)llllllllllllllllIIlIlIlllIlIIlIl) ? 1 : 0)) {
                "".length();
                if (-" ".length() <= 0) continue;
                return null;
            }
            ArrayList<WorldPoint> llllllllllllllllIIlIlIlllIIlllIl = new ArrayList<WorldPoint>((Collection<WorldPoint>)llllllllllllllllIIlIlIlllIlIIlII);
            llllllllllllllllIIlIlIlllIIlllIl.add(llllllllllllllllIIlIlIlllIIllllI);
            "".length();
            List<WorldPoint> llllllllllllllllIIlIlIlllIIlllII = llllllllllllllllIIlIlIlllIlIIlll.a(llllllllllllllllIIlIlIlllIlIIIlI, llllllllllllllllIIlIlIlllIIllllI, llllllllllllllllIIlIlIlllIIlllIl, (int)llllllllllllllllIIlIlIlllIlIIIll);
            if (s.lIlIlIlIllIIIl(llllllllllllllllIIlIlIlllIIlllII.isEmpty() ? 1 : 0)) {
                "".length();
                if (-" ".length() < 0) continue;
                return null;
            }
            if (s.lIlIlIlIlllIII(llllllllllllllllIIlIlIlllIIlllII.size(), llllllllllllllllIIlIlIlllIlIIIII2)) {
                llllllllllllllllIIlIlIlllIlIIlll.aP = llllllllllllllllIIlIlIlllIIlllII;
            }
            "".length();
            if ((38 + 124 - 91 + 61 ^ 102 + 72 - 96 + 50) != 0) continue;
            return null;
        }
        return this.aP;
    }

    private static boolean lIlIlIlIllIIll(int n2, int n3) {
        return n2 > n3;
    }

    public s(Map<WorldPoint, Boolean> map) {
        this.aP = new ArrayList<WorldPoint>();
        this.aO = map;
    }

    private static boolean lIlIlIlIllIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIlIllIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIlIlIllIIII() {
        llIlllIIIIl = new int[5];
        s.llIlllIIIIl[0] = 0x37 ^ 0x7C ^ (0xDF ^ 0x8D);
        s.llIlllIIIIl[1] = "  ".length();
        s.llIlllIIIIl[2] = " ".length();
        s.llIlllIIIIl[3] = (0xCF ^ 0xA1 ^ (9 ^ 4)) & (80 + 182 - 118 + 111 ^ 78 + 126 - 140 + 92 ^ -" ".length());
        s.llIlllIIIIl[4] = -" ".length() & (0xFFFFFFFF & Integer.MAX_VALUE);
    }

    static {
        s.lIlIlIlIllIIII();
    }

    private static boolean lIlIlIlIllIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlIlIllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIlIllIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIlIlIllIlIl(int n2, int n3) {
        return n2 != n3;
    }
}

