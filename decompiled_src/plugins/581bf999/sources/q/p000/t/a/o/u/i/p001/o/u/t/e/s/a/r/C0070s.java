package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.api.coords.WorldPoint;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.s  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/s.class */
public class C0070s {
    private final /* synthetic */ Map<WorldPoint, Boolean> aO;
    private /* synthetic */ List<WorldPoint> aP = new ArrayList();
    private static /* synthetic */ int[] llIlllIIIIl;

    private static boolean lIlIlIlIlllIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
        if (r0 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<WorldPoint> af() {
        ArrayList arrayList = new ArrayList();
        if (lIlIlIlIllIIIl(a(this.aO) ? 1 : 0)) {
            return Collections.emptyList();
        }
        for (WorldPoint worldPoint : this.aO.keySet()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(worldPoint);
            "".length();
            List<WorldPoint> a = a(this.aO, worldPoint, arrayList2, llIlllIIIIl[0]);
            if (lIlIlIlIllIIIl(a.isEmpty() ? 1 : 0)) {
                "".length();
                if ("   ".length() != "   ".length()) {
                    return null;
                }
            } else {
                if (lIlIlIlIllIIlI(arrayList.isEmpty() ? 1 : 0)) {
                    boolean lIlIlIlIllIIll = lIlIlIlIllIIll(arrayList.size(), a.size());
                    arrayList = arrayList;
                }
                arrayList = a;
                "".length();
                if ((112 ^ 117) <= 0) {
                    return null;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean a(Map<WorldPoint, Boolean> map) {
        for (Boolean bool : map.values()) {
            if (lIlIlIlIllIIlI(bool.booleanValue() ? 1 : 0)) {
                return llIlllIIIIl[3];
            }
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (!true) & ((true ^ true) ^ true);
            }
        }
        return llIlllIIIIl[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<WorldPoint> a(Map<WorldPoint, Boolean> map, WorldPoint worldPoint, List<WorldPoint> list, int i) {
        int size;
        boolean z;
        if (lIlIlIlIllIIll(list.size(), i)) {
            return Collections.emptyList();
        }
        HashMap hashMap = new HashMap();
        for (WorldPoint worldPoint2 : map.keySet()) {
            if (!lIlIlIlIllIlII(worldPoint2.distanceTo2D(worldPoint), llIlllIIIIl[1]) || (lIlIlIlIllIlIl(worldPoint2.getX(), worldPoint.getX()) && !lIlIlIlIllIllI(worldPoint2.getY(), worldPoint.getY()))) {
                hashMap.put(worldPoint2, map.get(worldPoint2));
                "".length();
            } else {
                if (lIlIlIlIllIIlI(map.get(worldPoint2).booleanValue() ? 1 : 0)) {
                    int i2 = llIlllIIIIl[2];
                    "".length();
                    z = i2;
                    if ((-((((155 + 52) - 72) + 52) ^ (((4 + 3) - (-11)) + 172))) >= 0) {
                        return null;
                    }
                } else {
                    z = llIlllIIIIl[3];
                }
                hashMap.put(worldPoint2, Boolean.valueOf(z));
                "".length();
                "".length();
                if ((((((121 + 148) - 234) + 138) ^ (((18 + 109) - 10) + 19)) & (((188 ^ 170) ^ (61 ^ 14)) ^ (-" ".length()))) != 0) {
                    return null;
                }
            }
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        if (lIlIlIlIllIIIl(a(hashMap) ? 1 : 0)) {
            return list;
        }
        ArrayList<WorldPoint> arrayList = new ArrayList(hashMap.keySet());
        Collections.shuffle(arrayList);
        if (lIlIlIlIllIIIl(this.aP.isEmpty() ? 1 : 0)) {
            size = llIlllIIIIl[4];
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        } else {
            size = this.aP.size();
        }
        int i3 = size;
        if (lIlIlIlIllIlll(list.size(), i3)) {
            return this.aP;
        }
        for (WorldPoint worldPoint3 : arrayList) {
            if (lIlIlIlIllIIIl(worldPoint3.equals(worldPoint) ? 1 : 0)) {
                "".length();
                if ((-" ".length()) > 0) {
                    return null;
                }
            } else {
                ArrayList arrayList2 = new ArrayList(list);
                arrayList2.add(worldPoint3);
                "".length();
                List<WorldPoint> a = a(hashMap, worldPoint3, arrayList2, i);
                if (lIlIlIlIllIIIl(a.isEmpty() ? 1 : 0)) {
                    "".length();
                    if ((-" ".length()) >= 0) {
                        return null;
                    }
                } else {
                    if (lIlIlIlIlllIII(a.size(), i3)) {
                        this.aP = a;
                    }
                    "".length();
                    if (((((38 + 124) - 91) + 61) ^ (((102 + 72) - 96) + 50)) == 0) {
                        return null;
                    }
                }
            }
        }
        return this.aP;
    }

    private static boolean lIlIlIlIllIIll(int i, int i2) {
        return i > i2;
    }

    public C0070s(Map<WorldPoint, Boolean> map) {
        this.aO = map;
    }

    private static boolean lIlIlIlIllIIlI(int i) {
        return i == 0;
    }

    private static boolean lIlIlIlIllIllI(int i, int i2) {
        return i == i2;
    }

    private static void lIlIlIlIllIIII() {
        llIlllIIIIl = new int[5];
        llIlllIIIIl[0] = (55 ^ 124) ^ (223 ^ 141);
        llIlllIIIIl[1] = "  ".length();
        llIlllIIIIl[2] = " ".length();
        llIlllIIIIl[3] = ((207 ^ 161) ^ (9 ^ 4)) & (((((80 + 182) - 118) + 111) ^ (((78 + 126) - 140) + 92)) ^ (-" ".length()));
        llIlllIIIIl[4] = (-" ".length()) & (-1) & Integer.MAX_VALUE;
    }

    static {
        lIlIlIlIllIIII();
    }

    private static boolean lIlIlIlIllIlll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIlIlIllIIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIlIlIllIlII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIlIlIllIlIl(int i, int i2) {
        return i != i2;
    }
}
