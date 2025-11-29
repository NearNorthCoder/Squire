/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package -.r.u.q.e.s.o.t.a.i;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.runelite.api.coords.WorldPoint;

public class k {
    private static /* synthetic */ int[] lIIllllllIllI;
    private final /* synthetic */ Map<WorldPoint, Boolean> aq;
    private /* synthetic */ List<WorldPoint> ar;

    private static boolean lIllIlIlIlllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIlIllIlll(int n2, int n3) {
        return n2 != n3;
    }

    static {
        k.lIllIlIlIllIIlI();
    }

    private static boolean lIllIlIlIllIlIl(int n2, int n3) {
        return n2 > n3;
    }

    public List<WorldPoint> y() {
        k llllllllllllllIlllIIllllIlIIlllI;
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        if (k.lIllIlIlIllIIll(this.a(this.aq) ? 1 : 0)) {
            return Collections.emptyList();
        }
        Iterator<WorldPoint> llllllllllllllIlllIIllllIlIIllII = llllllllllllllIlllIIllllIlIIlllI.aq.keySet().iterator();
        while (k.lIllIlIlIllIIll(llllllllllllllIlllIIllllIlIIllII.hasNext() ? 1 : 0)) {
            List<WorldPoint> llllllllllllllIlllIIllllIlIIllIl;
            WorldPoint llllllllllllllIlllIIllllIlIIlIll = llllllllllllllIlllIIllllIlIIllII.next();
            List<WorldPoint> llllllllllllllIlllIIllllIlIIlIlI = new ArrayList<WorldPoint>();
            llllllllllllllIlllIIllllIlIIlIlI.add(llllllllllllllIlllIIllllIlIIlIll);
            "".length();
            llllllllllllllIlllIIllllIlIIlIlI = llllllllllllllIlllIIllllIlIIlllI.a(llllllllllllllIlllIIllllIlIIlllI.aq, llllllllllllllIlllIIllllIlIIlIll, llllllllllllllIlllIIllllIlIIlIlI, lIIllllllIllI[0]);
            if (k.lIllIlIlIllIIll(llllllllllllllIlllIIllllIlIIlIlI.isEmpty() ? 1 : 0)) {
                "".length();
                if (((0xC ^ 0x10) & ~(0x88 ^ 0x94)) == 0) continue;
                return null;
            }
            if (!k.lIllIlIlIllIlII(llllllllllllllIlllIIllllIlIIllIl.isEmpty() ? 1 : 0) || k.lIllIlIlIllIlIl(llllllllllllllIlllIIllllIlIIllIl.size(), llllllllllllllIlllIIllllIlIIlIlI.size())) {
                llllllllllllllIlllIIllllIlIIllIl = llllllllllllllIlllIIllllIlIIlIlI;
            }
            "".length();
            if (null == null) continue;
            return null;
        }
        return arrayList;
    }

    public k(Map<WorldPoint, Boolean> map) {
        this.ar = new ArrayList<WorldPoint>();
        this.aq = map;
    }

    private static boolean lIllIlIlIllIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIlIlIllIlII(int n2) {
        return n2 == 0;
    }

    private static void lIllIlIlIllIIlI() {
        lIIllllllIllI = new int[5];
        k.lIIllllllIllI[0] = 0x8D ^ 0x94;
        k.lIIllllllIllI[1] = "  ".length();
        k.lIIllllllIllI[2] = " ".length();
        k.lIIllllllIllI[3] = (0x64 ^ 0x43) & ~(5 ^ 0x22);
        k.lIIllllllIllI[4] = 0xFFFFFFFF & Integer.MAX_VALUE;
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> a(Map<WorldPoint, Boolean> map, WorldPoint worldPoint, List<WorldPoint> list, int n2) {
        int llllllllllllllIlllIIllllIIllIllI2;
        int n3;
        void llllllllllllllIlllIIllllIIlllIlI;
        k llllllllllllllIlllIIllllIIllllIl;
        void llllllllllllllIlllIIllllIIlllIll;
        void llllllllllllllIlllIIllllIIllllII;
        if (k.lIllIlIlIllIlIl(list.size(), n2)) {
            return Collections.emptyList();
        }
        HashMap<WorldPoint, Boolean> llllllllllllllIlllIIllllIIlllIII = new HashMap<WorldPoint, Boolean>();
        Object llllllllllllllIlllIIllllIIllIlll = llllllllllllllIlllIIllllIIllllII.keySet().iterator();
        while (k.lIllIlIlIllIIll(llllllllllllllIlllIIllllIIllIlll.hasNext() ? 1 : 0)) {
            WorldPoint llllllllllllllIlllIIllllIIllIllI2 = (WorldPoint)llllllllllllllIlllIIllllIIllIlll.next();
            if (k.lIllIlIlIllIllI(llllllllllllllIlllIIllllIIllIllI2.distanceTo2D((WorldPoint)llllllllllllllIlllIIllllIIlllIll), lIIllllllIllI[1]) && (!k.lIllIlIlIllIlll(llllllllllllllIlllIIllllIIllIllI2.getX(), llllllllllllllIlllIIllllIIlllIll.getX()) || k.lIllIlIlIlllIII(llllllllllllllIlllIIllllIIllIllI2.getY(), llllllllllllllIlllIIllllIIlllIll.getY()))) {
                boolean bl;
                if (k.lIllIlIlIllIlII(((Boolean)llllllllllllllIlllIIllllIIllllII.get(llllllllllllllIlllIIllllIIllIllI2)).booleanValue() ? 1 : 0)) {
                    bl = lIIllllllIllI[2];
                    "".length();
                    if (((0xC9 ^ 0xA9 ^ (0x1D ^ 0x56)) & (0x68 ^ 0x62 ^ (0x44 ^ 0x65) ^ -" ".length())) != 0) {
                        return null;
                    }
                } else {
                    bl = lIIllllllIllI[3];
                }
                llllllllllllllIlllIIllllIIlllIII.put(llllllllllllllIlllIIllllIIllIllI2, bl);
                "".length();
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
            } else {
                llllllllllllllIlllIIllllIIlllIII.put(llllllllllllllIlllIIllllIIllIllI2, (Boolean)llllllllllllllIlllIIllllIIllllII.get(llllllllllllllIlllIIllllIIllIllI2));
                "".length();
            }
            "".length();
            if (-" ".length() < "   ".length()) continue;
            return null;
        }
        if (k.lIllIlIlIllIIll(llllllllllllllIlllIIllllIIllllIl.a(llllllllllllllIlllIIllllIIlllIII) ? 1 : 0)) {
            return llllllllllllllIlllIIllllIIlllIlI;
        }
        llllllllllllllIlllIIllllIIllIlll = new ArrayList(llllllllllllllIlllIIllllIIlllIII.keySet());
        Collections.shuffle(llllllllllllllIlllIIllllIIllIlll);
        if (k.lIllIlIlIllIIll(llllllllllllllIlllIIllllIIllllIl.ar.isEmpty() ? 1 : 0)) {
            n3 = lIIllllllIllI[4];
            "".length();
            if ((0x99 ^ 0x9D) <= ((0xB1 ^ 0x98) & ~(0xAB ^ 0x82) & ~((0xC9 ^ 0x87) & ~(0x19 ^ 0x57)))) {
                return null;
            }
        } else {
            n3 = llllllllllllllIlllIIllllIIllIllI2 = llllllllllllllIlllIIllllIIllllIl.ar.size();
        }
        if (k.lIllIlIlIlllIIl(llllllllllllllIlllIIllllIIlllIlI.size(), llllllllllllllIlllIIllllIIllIllI2)) {
            return llllllllllllllIlllIIllllIIllllIl.ar;
        }
        Iterator llllllllllllllIlllIIllllIIllIlIl = llllllllllllllIlllIIllllIIllIlll.iterator();
        while (k.lIllIlIlIllIIll(llllllllllllllIlllIIllllIIllIlIl.hasNext() ? 1 : 0)) {
            void llllllllllllllIlllIIllllIIlllIIl;
            WorldPoint llllllllllllllIlllIIllllIIllIlII = (WorldPoint)llllllllllllllIlllIIllllIIllIlIl.next();
            if (k.lIllIlIlIllIIll(llllllllllllllIlllIIllllIIllIlII.equals((Object)llllllllllllllIlllIIllllIIlllIll) ? 1 : 0)) {
                "".length();
                if ((0xB9 ^ 0xBD) > "   ".length()) continue;
                return null;
            }
            ArrayList<WorldPoint> llllllllllllllIlllIIllllIIllIIll = new ArrayList<WorldPoint>((Collection<WorldPoint>)llllllllllllllIlllIIllllIIlllIlI);
            llllllllllllllIlllIIllllIIllIIll.add(llllllllllllllIlllIIllllIIllIlII);
            "".length();
            List<WorldPoint> llllllllllllllIlllIIllllIIllIIlI = llllllllllllllIlllIIllllIIllllIl.a(llllllllllllllIlllIIllllIIlllIII, llllllllllllllIlllIIllllIIllIlII, llllllllllllllIlllIIllllIIllIIll, (int)llllllllllllllIlllIIllllIIlllIIl);
            if (k.lIllIlIlIllIIll(llllllllllllllIlllIIllllIIllIIlI.isEmpty() ? 1 : 0)) {
                "".length();
                if ("   ".length() > "  ".length()) continue;
                return null;
            }
            if (k.lIllIlIlIlllIlI(llllllllllllllIlllIIllllIIllIIlI.size(), llllllllllllllIlllIIllllIIllIllI2)) {
                llllllllllllllIlllIIllllIIllllIl.ar = llllllllllllllIlllIIllllIIllIIlI;
            }
            "".length();
            if ("   ".length() < (104 + 108 - 204 + 185 ^ 150 + 131 - 92 + 8)) continue;
            return null;
        }
        return this.ar;
    }

    private boolean a(Map<WorldPoint, Boolean> map) {
        Iterator<Boolean> llllllllllllllIlllIIllllIIlIllIl = map.values().iterator();
        while (k.lIllIlIlIllIIll(llllllllllllllIlllIIllllIIlIllIl.hasNext() ? 1 : 0)) {
            int llllllllllllllIlllIIllllIIlIllII = llllllllllllllIlllIIllllIIlIllIl.next().booleanValue() ? 1 : 0;
            if (k.lIllIlIlIllIlII(llllllllllllllIlllIIllllIIlIllII)) {
                return lIIllllllIllI[3];
            }
            "".length();
            if (-" ".length() < 0) continue;
            return ((0x53 ^ 8) & ~(0xCC ^ 0x97)) != 0;
        }
        return lIIllllllIllI[2];
    }

    private static boolean lIllIlIlIlllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIlIlIllIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIlIlllIII(int n2, int n3) {
        return n2 == n3;
    }
}

