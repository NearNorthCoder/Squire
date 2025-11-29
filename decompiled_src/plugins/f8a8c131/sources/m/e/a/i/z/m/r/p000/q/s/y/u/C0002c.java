package m.e.a.i.z.m.r.p000.q.s.y.u;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.c  reason: invalid package and case insensitive filesystem */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/c.class */
public class C0002c {
    private static final /* synthetic */ List<RegionPoint> k;
    private static final /* synthetic */ RegionPoint i;
    private static final /* synthetic */ RegionPoint h;
    private static final /* synthetic */ HashMap<RegionPoint, Boolean> j;
    public static final /* synthetic */ int g;
    private static /* synthetic */ int[] lIllIIIlIIlll;

    public static int b() {
        return lIllIIIlIIlll[0];
    }

    private static int llIIIlIIlllIIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIIIlIIlllIIIl(int i2) {
        return i2 < 0;
    }

    public WorldPoint h() {
        return a(h);
    }

    public WorldPoint i() {
        return a(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean f() {
        RegionPoint e = e();
        return (!llIIIlIIllIlllI(e) || llIIIlIIllIllll(e, i)) ? lIllIIIlIIlll[4] : j.get(e).booleanValue();
    }

    public WorldPoint g() {
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        WorldPoint worldPoint = null;
        double d = Double.MAX_VALUE;
        for (RegionPoint regionPoint : k) {
            WorldPoint a = a(regionPoint);
            double distanceTo2DHypotenuse = a.distanceTo2DHypotenuse(worldLocation);
            if (llIIIlIIlllIIIl(llIIIlIIlllIIII(distanceTo2DHypotenuse, d))) {
                d = distanceTo2DHypotenuse;
                worldPoint = a;
            }
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return worldPoint;
    }

    public RegionPoint e() {
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        for (RegionPoint regionPoint : k) {
            if (llIIIlIIllIllII(worldLocation.equals(a(regionPoint)) ? 1 : 0)) {
                return regionPoint;
            }
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        if (llIIIlIIllIllII(worldLocation.equals(a(i)) ? 1 : 0)) {
            return i;
        }
        return null;
    }

    public static boolean c() {
        return Players.getLocal().getWorldLocation().equals(a(i));
    }

    private static boolean llIIIlIIllIlllI(Object obj) {
        return obj != null;
    }

    private static boolean llIIIlIIllIllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void a(int i2, int i3, boolean z) {
        RegionPoint regionPoint = new RegionPoint(i2, i3, lIllIIIlIIlll[1], b());
        k.add(regionPoint);
        "".length();
        j.put(regionPoint, Boolean.valueOf(z));
        "".length();
    }

    private static boolean llIIIlIIllIllIl(int i2, int i3) {
        return i2 == i3;
    }

    private static void llIIIlIIllIlIll() {
        lIllIIIlIIlll = new int[18];
        lIllIIIlIIlll[0] = (-21129) & 32731;
        lIllIIIlIIlll[1] = "  ".length();
        lIllIIIlIIlll[2] = " ".length();
        lIllIIIlIIlll[3] = -" ".length();
        lIllIIIlIIlll[4] = ((230 ^ 186) ^ (89 ^ 40)) & (((110 ^ 120) ^ (1 ^ 58)) ^ (-" ".length()));
        lIllIIIlIIlll[5] = 57 ^ 22;
        lIllIIIlIIlll[6] = 148 ^ 134;
        lIllIIIlIIlll[7] = 9 ^ 47;
        lIllIIIlIIlll[8] = 163 ^ 175;
        lIllIIIlIIlll[9] = 81 ^ 87;
        lIllIIIlIIlll[10] = 21 ^ 59;
        lIllIIIlIIlll[11] = 162 ^ 178;
        lIllIIIlIIlll[12] = (126 ^ 29) ^ (117 ^ 37);
        lIllIIIlIIlll[13] = (114 ^ 8) ^ (74 ^ 7);
        lIllIIIlIIlll[14] = 70 ^ 73;
        lIllIIIlIIlll[15] = (202 ^ 161) ^ (116 ^ 43);
        lIllIIIlIIlll[16] = 102 ^ 111;
        lIllIIIlIIlll[17] = 98 ^ 72;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    static {
        llIIIlIIllIlIll();
        g = lIllIIIlIIlll[0];
        h = new RegionPoint(lIllIIIlIIlll[5], lIllIIIlIIlll[6], lIllIIIlIIlll[1], b());
        i = new RegionPoint(lIllIIIlIIlll[7], lIllIIIlIIlll[8], lIllIIIlIIlll[1], b());
        j = new HashMap<>();
        k = new ArrayList();
        a(lIllIIIlIIlll[7], lIllIIIlIIlll[8], lIllIIIlIIlll[4]);
        a(lIllIIIlIIlll[7], lIllIIIlIIlll[9], lIllIIIlIIlll[2]);
        a(lIllIIIlIIlll[10], lIllIIIlIIlll[11], lIllIIIlIIlll[4]);
        a(lIllIIIlIIlll[12], lIllIIIlIIlll[11], lIllIIIlIIlll[4]);
        a(lIllIIIlIIlll[13], lIllIIIlIIlll[14], lIllIIIlIIlll[4]);
        a(lIllIIIlIIlll[15], lIllIIIlIIlll[16], lIllIIIlIIlll[4]);
        a(lIllIIIlIIlll[10], lIllIIIlIIlll[16], lIllIIIlIIlll[4]);
        a(lIllIIIlIIlll[17], lIllIIIlIIlll[16], lIllIIIlIIlll[4]);
    }

    public static WorldPoint a(RegionPoint regionPoint) {
        Client client = Static.getClient();
        return (WorldPoint) WorldPoint.toLocalInstance(client, regionPoint.toWorld()).stream().filter(worldPoint -> {
            if (llIIIlIIllIllIl(worldPoint.getPlane(), client.getPlane())) {
                ?? r0 = lIllIIIlIIlll[2];
                "".length();
                return " ".length() == 0 ? ((167 ^ 155) ^ (112 ^ 22)) & (((((133 + 56) - 51) + 65) ^ (((28 + 141) - 138) + 114)) ^ (-" ".length())) : r0;
            }
            return lIllIIIlIIlll[4];
        }).min(Comparator.comparingInt(worldPoint2 -> {
            return worldPoint2.distanceTo(Players.getLocal());
        })).orElse(null);
    }

    public WorldPoint j() {
        return a(k.get(lIllIIIlIIlll[4]));
    }

    private static boolean llIIIlIIllIllII(int i2) {
        return i2 != 0;
    }

    public RegionPoint b(RegionPoint regionPoint) {
        int indexOf = k.indexOf(regionPoint);
        if (llIIIlIIllIllIl(indexOf, lIllIIIlIIlll[3])) {
            return null;
        }
        return k.get((indexOf + lIllIIIlIIlll[2]) % k.size());
    }

    public RegionPoint d() {
        if (llIIIlIIllIllII(c() ? 1 : 0)) {
            return k.get(lIllIIIlIIlll[2]);
        }
        int indexOf = k.indexOf(e());
        if (llIIIlIIllIllIl(indexOf, lIllIIIlIIlll[3])) {
            return null;
        }
        return k.get((indexOf + lIllIIIlIIlll[2]) % k.size());
    }
}
