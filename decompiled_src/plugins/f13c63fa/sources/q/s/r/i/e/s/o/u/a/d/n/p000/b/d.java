package q.s.r.i.e.s.o.u.a.d.n.p000.b;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.d  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/d.class */
public class d {
    private static final /* synthetic */ RegionPoint k;
    private static final /* synthetic */ RegionPoint j;
    public static final /* synthetic */ int h;
    private static final /* synthetic */ HashMap<RegionPoint, Boolean> l;
    private static final /* synthetic */ List<RegionPoint> m;
    private static /* synthetic */ int[] lllIIIllIIl;
    public static final /* synthetic */ int i;

    public static boolean j() {
        return Players.getLocal().getWorldLocation().equals(a(k));
    }

    private static void a(int i2, int i3, boolean z) {
        RegionPoint regionPoint = new RegionPoint(i2, i3, lllIIIllIIl[1], i());
        m.add(regionPoint);
        "".length();
        l.put(regionPoint, Boolean.valueOf(z));
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean n() {
        RegionPoint m2 = m();
        return (!lIlIlllIIIIlll(m2) || lIlIlllIIIlIII(m2, k)) ? lllIIIllIIl[2] : l.get(m2).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    static {
        lIlIlllIIIIIIl();
        h = lllIIIllIIl[0];
        i = lllIIIllIIl[5];
        j = new RegionPoint(lllIIIllIIl[6], lllIIIllIIl[7], lllIIIllIIl[1], i());
        k = new RegionPoint(lllIIIllIIl[8], lllIIIllIIl[8], lllIIIllIIl[1], i());
        l = new HashMap<>();
        m = new ArrayList();
        a(lllIIIllIIl[9], lllIIIllIIl[10], lllIIIllIIl[2]);
        a(lllIIIllIIl[11], lllIIIllIIl[12], lllIIIllIIl[2]);
        a(lllIIIllIIl[8], lllIIIllIIl[13], lllIIIllIIl[2]);
        a(lllIIIllIIl[9], lllIIIllIIl[12], lllIIIllIIl[2]);
        a(lllIIIllIIl[10], lllIIIllIIl[14], lllIIIllIIl[2]);
        a(lllIIIllIIl[15], lllIIIllIIl[16], lllIIIllIIl[4]);
        a(lllIIIllIIl[8], lllIIIllIIl[17], lllIIIllIIl[2]);
        a(lllIIIllIIl[8], lllIIIllIIl[18], lllIIIllIIl[2]);
        a(lllIIIllIIl[8], lllIIIllIIl[19], lllIIIllIIl[2]);
    }

    private static boolean lIlIlllIIIlIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static WorldPoint a(RegionPoint regionPoint) {
        Client client = Static.getClient();
        return (WorldPoint) WorldPoint.toLocalInstance(client, regionPoint.toWorld()).stream().filter(worldPoint -> {
            if (lIlIlllIIIIIll(worldPoint.getPlane(), client.getPlane())) {
                ?? r0 = lllIIIllIIl[4];
                "".length();
                return (((79 ^ 123) ^ (9 ^ 45)) & (((18 ^ 85) ^ (213 ^ 130)) ^ (-" ".length()))) != 0 ? ((108 ^ 25) ^ (255 ^ 132)) & (((((142 + 167) - 240) + 121) ^ (((123 + 113) - 69) + 9)) ^ (-" ".length())) : r0;
            }
            return lllIIIllIIl[2];
        }).min(Comparator.comparingInt(worldPoint2 -> {
            return worldPoint2.distanceTo(Players.getLocal());
        })).orElse(null);
    }

    public WorldPoint p() {
        return a(k);
    }

    private static boolean lIlIlllIIIIlll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlllIIIIlIl(Object obj) {
        return obj == null;
    }

    public WorldPoint q() {
        return a(m.get(lllIIIllIIl[2]));
    }

    private static boolean lIlIlllIIIIIlI(int i2) {
        return i2 != 0;
    }

    private static int lIlIlllIIIIlII(float f, float f2) {
        return (f > f2 ? 1 : (f == f2 ? 0 : -1));
    }

    public RegionPoint b(RegionPoint regionPoint) {
        int indexOf = m.indexOf(regionPoint);
        if (lIlIlllIIIIIll(indexOf, lllIIIllIIl[3])) {
            return null;
        }
        return m.get((indexOf + lllIIIllIIl[4]) % m.size());
    }

    public RegionPoint m() {
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        for (RegionPoint regionPoint : m) {
            if (lIlIlllIIIIIlI(worldLocation.equals(a(regionPoint)) ? 1 : 0)) {
                return regionPoint;
            }
            "".length();
            if (" ".length() > (67 ^ 71)) {
                return null;
            }
        }
        if (lIlIlllIIIIIlI(worldLocation.equals(a(k)) ? 1 : 0)) {
            return k;
        }
        return null;
    }

    private static void lIlIlllIIIIIIl() {
        lllIIIllIIl = new int[20];
        lllIIIllIIl[0] = (-((-3217) & 23989)) & (-641) & 32759;
        lllIIIllIIl[1] = "  ".length();
        lllIIIllIIl[2] = ((((8 + 17) - (-53)) + 83) ^ (((125 + 51) - 131) + 126)) & (((47 ^ 123) ^ (100 ^ 58)) ^ (-" ".length()));
        lllIIIllIIl[3] = -" ".length();
        lllIIIllIIl[4] = " ".length();
        lllIIIllIIl[5] = (-8329) & 45727;
        lllIIIllIIl[6] = (27 ^ 7) ^ (77 ^ 106);
        lllIIIllIIl[7] = (111 ^ 22) ^ (123 ^ 48);
        lllIIIllIIl[8] = (((31 + 108) - 82) + 124) ^ (((11 + 107) - 107) + 129);
        lllIIIllIIl[9] = 31 ^ 44;
        lllIIIllIIl[10] = 96 ^ 86;
        lllIIIllIIl[11] = 138 ^ 189;
        lllIIIllIIl[12] = (63 ^ 34) ^ (52 ^ 25);
        lllIIIllIIl[13] = 112 ^ 92;
        lllIIIllIIl[14] = 67 ^ 105;
        lllIIIllIIl[15] = 53 ^ 4;
        lllIIIllIIl[16] = 181 ^ 146;
        lllIIIllIIl[17] = (2 ^ 37) ^ (114 ^ 122);
        lllIIIllIIl[18] = (20 ^ 78) ^ (29 ^ 115);
        lllIIIllIIl[19] = (250 ^ 185) ^ (201 ^ 178);
    }

    public static int i() {
        return lllIIIllIIl[0];
    }

    public RegionPoint k() {
        if (lIlIlllIIIIIlI(j() ? 1 : 0)) {
            return m.get(lllIIIllIIl[2]);
        }
        int indexOf = m.indexOf(m());
        if (lIlIlllIIIIIll(indexOf, lllIIIllIIl[3])) {
            return null;
        }
        return m.get((indexOf + lllIIIllIIl[4]) % m.size());
    }

    private static boolean lIlIlllIIIIIll(int i2, int i3) {
        return i2 == i3;
    }

    public WorldPoint o() {
        return a(j);
    }

    public WorldPoint l() {
        WorldPoint worldPoint = null;
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        for (RegionPoint regionPoint : m) {
            WorldPoint a = a(regionPoint);
            if (lIlIlllIIIIlIl(a)) {
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
            } else if (lIlIlllIIIIlIl(worldPoint)) {
                worldPoint = a;
                "".length();
                if ((-" ".length()) >= "   ".length()) {
                    return null;
                }
            } else {
                if (lIlIlllIIIIllI(lIlIlllIIIIlII(a.distanceTo2DHypotenuse(worldLocation), worldPoint.distanceTo2DHypotenuse(worldLocation)))) {
                    worldPoint = a;
                }
                "".length();
                if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                    return null;
                }
            }
        }
        return worldPoint;
    }

    private static boolean lIlIlllIIIIllI(int i2) {
        return i2 < 0;
    }
}
