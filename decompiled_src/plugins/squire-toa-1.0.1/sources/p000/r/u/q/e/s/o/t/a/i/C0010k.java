package p000.r.u.q.e.s.o.t.a.i;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.api.coords.WorldPoint;
/* renamed from: -.r.u.q.e.s.o.t.a.i.k  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/k.class */
public class C0010k {
    private static /* synthetic */ int[] lIIllllllIllI;
    private final /* synthetic */ Map<WorldPoint, Boolean> aq;
    private /* synthetic */ List<WorldPoint> ar = new ArrayList();

    private static boolean lIllIlIlIlllIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIlIlIllIlll(int i, int i2) {
        return i != i2;
    }

    static {
        lIllIlIlIllIIlI();
    }

    private static boolean lIllIlIlIllIlIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
        if (r0 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<WorldPoint> y() {
        ArrayList arrayList = new ArrayList();
        if (lIllIlIlIllIIll(a(this.aq) ? 1 : 0)) {
            return Collections.emptyList();
        }
        for (WorldPoint worldPoint : this.aq.keySet()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(worldPoint);
            "".length();
            List<WorldPoint> a = a(this.aq, worldPoint, arrayList2, lIIllllllIllI[0]);
            if (lIllIlIlIllIIll(a.isEmpty() ? 1 : 0)) {
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return null;
                }
            } else {
                if (lIllIlIlIllIlII(arrayList.isEmpty() ? 1 : 0)) {
                    boolean lIllIlIlIllIlIl = lIllIlIlIllIlIl(arrayList.size(), a.size());
                    arrayList = arrayList;
                }
                arrayList = a;
                "".length();
                if (0 != 0) {
                    return null;
                }
            }
        }
        return arrayList;
    }

    public C0010k(Map<WorldPoint, Boolean> map) {
        this.aq = map;
    }

    private static boolean lIllIlIlIllIllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIllIlIlIllIlII(int i) {
        return i == 0;
    }

    private static void lIllIlIlIllIIlI() {
        lIIllllllIllI = new int[5];
        lIIllllllIllI[0] = 141 ^ 148;
        lIIllllllIllI[1] = "  ".length();
        lIIllllllIllI[2] = " ".length();
        lIIllllllIllI[3] = (100 ^ 67) & ((5 ^ 34) ^ (-1));
        lIIllllllIllI[4] = (-1) & Integer.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<WorldPoint> a(Map<WorldPoint, Boolean> map, WorldPoint worldPoint, List<WorldPoint> list, int i) {
        int size;
        boolean z;
        if (lIllIlIlIllIlIl(list.size(), i)) {
            return Collections.emptyList();
        }
        HashMap hashMap = new HashMap();
        for (WorldPoint worldPoint2 : map.keySet()) {
            if (!lIllIlIlIllIllI(worldPoint2.distanceTo2D(worldPoint), lIIllllllIllI[1]) || (lIllIlIlIllIlll(worldPoint2.getX(), worldPoint.getX()) && !lIllIlIlIlllIII(worldPoint2.getY(), worldPoint.getY()))) {
                hashMap.put(worldPoint2, map.get(worldPoint2));
                "".length();
            } else {
                if (lIllIlIlIllIlII(map.get(worldPoint2).booleanValue() ? 1 : 0)) {
                    int i2 = lIIllllllIllI[2];
                    "".length();
                    z = i2;
                    if ((((201 ^ 169) ^ (29 ^ 86)) & (((104 ^ 98) ^ (68 ^ 101)) ^ (-" ".length()))) != 0) {
                        return null;
                    }
                } else {
                    z = lIIllllllIllI[3];
                }
                hashMap.put(worldPoint2, Boolean.valueOf(z));
                "".length();
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
            }
            "".length();
            if ((-" ".length()) >= "   ".length()) {
                return null;
            }
        }
        if (lIllIlIlIllIIll(a(hashMap) ? 1 : 0)) {
            return list;
        }
        ArrayList<WorldPoint> arrayList = new ArrayList(hashMap.keySet());
        Collections.shuffle(arrayList);
        if (lIllIlIlIllIIll(this.ar.isEmpty() ? 1 : 0)) {
            size = lIIllllllIllI[4];
            "".length();
            if ((153 ^ 157) <= ((177 ^ 152) & ((171 ^ 130) ^ (-1)) & (((201 ^ 135) & ((25 ^ 87) ^ (-1))) ^ (-1)))) {
                return null;
            }
        } else {
            size = this.ar.size();
        }
        int i3 = size;
        if (lIllIlIlIlllIIl(list.size(), i3)) {
            return this.ar;
        }
        for (WorldPoint worldPoint3 : arrayList) {
            if (lIllIlIlIllIIll(worldPoint3.equals(worldPoint) ? 1 : 0)) {
                "".length();
                if ((185 ^ 189) <= "   ".length()) {
                    return null;
                }
            } else {
                ArrayList arrayList2 = new ArrayList(list);
                arrayList2.add(worldPoint3);
                "".length();
                List<WorldPoint> a = a(hashMap, worldPoint3, arrayList2, i);
                if (lIllIlIlIllIIll(a.isEmpty() ? 1 : 0)) {
                    "".length();
                    if ("   ".length() <= "  ".length()) {
                        return null;
                    }
                } else {
                    if (lIllIlIlIlllIlI(a.size(), i3)) {
                        this.ar = a;
                    }
                    "".length();
                    if ("   ".length() >= ((((104 + 108) - 204) + 185) ^ (((150 + 131) - 92) + 8))) {
                        return null;
                    }
                }
            }
        }
        return this.ar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean a(Map<WorldPoint, Boolean> map) {
        for (Boolean bool : map.values()) {
            if (lIllIlIlIllIlII(bool.booleanValue() ? 1 : 0)) {
                return lIIllllllIllI[3];
            }
            "".length();
            if ((-" ".length()) >= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIIllllllIllI[2];
    }

    private static boolean lIllIlIlIlllIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIlIlIllIIll(int i) {
        return i != 0;
    }

    private static boolean lIllIlIlIlllIII(int i, int i2) {
        return i == i2;
    }
}
