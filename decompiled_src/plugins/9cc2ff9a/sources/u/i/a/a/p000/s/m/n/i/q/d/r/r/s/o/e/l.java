package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.l  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/l.class */
public class l {
    private static final /* synthetic */ RegionPoint B;
    private static /* synthetic */ int[] lIIlIlIIlllll;
    public static final /* synthetic */ int y;
    private static final /* synthetic */ RegionPoint A;
    private static final /* synthetic */ HashMap<RegionPoint, Boolean> C;
    private static final /* synthetic */ RegionPoint z;
    private static final /* synthetic */ List<RegionPoint> D;

    public static boolean H() {
        return Players.getLocal().getWorldLocation().equals(a(z));
    }

    private static boolean lIlIlIlllIlllIl(int i) {
        return i != 0;
    }

    public RegionPoint L() {
        if (lIlIlIlllIlllIl(H() ? 1 : 0)) {
            return D.get(lIIlIlIIlllll[0]);
        }
        int indexOf = D.indexOf(M());
        if (lIlIlIlllIllllI(indexOf, lIIlIlIIlllll[2])) {
            return null;
        }
        return D.get((indexOf + lIIlIlIIlllll[3]) % D.size());
    }

    public WorldPoint N() {
        return a(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    static {
        lIlIlIlllIlllII();
        y = lIIlIlIIlllll[1];
        z = new RegionPoint(lIIlIlIIlllll[4], lIIlIlIIlllll[5], lIIlIlIIlllll[0], lIIlIlIIlllll[1]);
        A = new RegionPoint(lIIlIlIIlllll[4], lIIlIlIIlllll[6], lIIlIlIIlllll[0], lIIlIlIIlllll[1]);
        B = new RegionPoint(lIIlIlIIlllll[4], lIIlIlIIlllll[7], lIIlIlIIlllll[0], lIIlIlIIlllll[1]);
        C = new HashMap<>();
        D = new ArrayList();
        a(lIIlIlIIlllll[8], lIIlIlIIlllll[9], lIIlIlIIlllll[3]);
        a(lIIlIlIIlllll[8], lIIlIlIIlllll[6], lIIlIlIIlllll[0]);
        a(lIIlIlIIlllll[8], lIIlIlIIlllll[10], lIIlIlIIlllll[3]);
        a(lIIlIlIIlllll[8], lIIlIlIIlllll[11], lIIlIlIIlllll[0]);
        a(lIIlIlIIlllll[8], lIIlIlIIlllll[12], lIIlIlIIlllll[3]);
        a(lIIlIlIIlllll[13], lIIlIlIIlllll[12], lIIlIlIIlllll[3]);
        a(lIIlIlIIlllll[14], lIIlIlIIlllll[12], lIIlIlIIlllll[0]);
        a(lIIlIlIIlllll[15], lIIlIlIIlllll[12], lIIlIlIIlllll[3]);
        a(lIIlIlIIlllll[16], lIIlIlIIlllll[12], lIIlIlIIlllll[0]);
        a(lIIlIlIIlllll[17], lIIlIlIIlllll[10], lIIlIlIIlllll[3]);
        a(lIIlIlIIlllll[18], lIIlIlIIlllll[14], lIIlIlIIlllll[3]);
        a(lIIlIlIIlllll[18], lIIlIlIIlllll[5], lIIlIlIIlllll[3]);
        a(lIIlIlIIlllll[17], lIIlIlIIlllll[8], lIIlIlIIlllll[0]);
        a(lIIlIlIIlllll[16], lIIlIlIIlllll[4], lIIlIlIIlllll[3]);
        a(lIIlIlIIlllll[13], lIIlIlIIlllll[8], lIIlIlIIlllll[3]);
        a(lIIlIlIIlllll[7], lIIlIlIIlllll[8], lIIlIlIIlllll[0]);
        a(lIIlIlIIlllll[5], lIIlIlIIlllll[5], lIIlIlIIlllll[3]);
    }

    private static void a(int i, int i2, boolean z2) {
        RegionPoint regionPoint = new RegionPoint(i, i2, lIIlIlIIlllll[0], lIIlIlIIlllll[1]);
        D.add(regionPoint);
        "".length();
        C.put(regionPoint, Boolean.valueOf(z2));
        "".length();
    }

    private static void lIlIlIlllIlllII() {
        lIIlIlIIlllll = new int[19];
        lIIlIlIIlllll[0] = (31 ^ 36) & ((49 ^ 10) ^ (-1));
        lIIlIlIIlllll[1] = (-4782) & 16383;
        lIIlIlIIlllll[2] = -" ".length();
        lIIlIlIIlllll[3] = " ".length();
        lIIlIlIIlllll[4] = 76 ^ 87;
        lIIlIlIIlllll[5] = 123 ^ 99;
        lIIlIlIIlllll[6] = 119 ^ 102;
        lIIlIlIIlllll[7] = 37 ^ 48;
        lIIlIlIIlllll[8] = (((63 + 73) - 22) + 26) ^ (((96 + 21) - (-10)) + 23);
        lIIlIlIIlllll[9] = ((39 ^ 32) & ((22 ^ 17) ^ (-1))) ^ (44 ^ 62);
        lIIlIlIIlllll[10] = (((61 + 61) - 117) + 145) ^ (((72 + 39) - 17) + 58);
        lIIlIlIIlllll[11] = (46 ^ 43) ^ (34 ^ 42);
        lIIlIlIIlllll[12] = (((75 + 26) - 93) + 195) ^ (((186 + 39) - 177) + 145);
        lIIlIlIIlllll[13] = 76 ^ 88;
        lIIlIlIIlllll[14] = (((86 + 2) - (-122)) + 5) ^ (((108 + 57) - 49) + 80);
        lIIlIlIIlllll[15] = 151 ^ 135;
        lIIlIlIIlllll[16] = 120 ^ 119;
        lIIlIlIIlllll[17] = "  ".length() ^ (129 ^ 136);
        lIIlIlIIlllll[18] = (9 ^ 68) ^ (9 ^ 77);
    }

    public WorldPoint Q() {
        RegionPoint fromWorld = RegionPoint.fromWorld(Players.getLocal().getWorldLocation());
        RegionPoint regionPoint = null;
        double d = Double.MAX_VALUE;
        for (RegionPoint regionPoint2 : D) {
            double distanceTo = regionPoint2.distanceTo(fromWorld);
            if (lIlIlIllllIIIII(lIlIlIlllIlllll(distanceTo, d))) {
                d = distanceTo;
                regionPoint = regionPoint2;
            }
            "".length();
            if ((-" ".length()) >= (142 ^ 138)) {
                return null;
            }
        }
        return a(b(regionPoint));
    }

    private static boolean lIlIlIlllIllllI(int i, int i2) {
        return i == i2;
    }

    public RegionPoint M() {
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        for (RegionPoint regionPoint : D) {
            if (lIlIlIlllIlllIl(worldLocation.equals(a(regionPoint)) ? 1 : 0)) {
                return regionPoint;
            }
            "".length();
            if (((((95 + 108) - 78) + 26) ^ (((86 + 48) - 110) + 123)) <= 0) {
                return null;
            }
        }
        if (lIlIlIlllIlllIl(worldLocation.equals(a(z)) ? 1 : 0)) {
            return z;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public boolean P() {
        return lIlIlIlllIlllIl(H() ? 1 : 0) ? lIIlIlIIlllll[3] : C.getOrDefault(M(), Boolean.valueOf((boolean) lIIlIlIIlllll[0])).booleanValue();
    }

    public static WorldPoint a(RegionPoint regionPoint) {
        Client client = Static.getClient();
        return (WorldPoint) WorldPoint.toLocalInstance(client, regionPoint.toWorld()).stream().filter(worldPoint -> {
            if (lIlIlIlllIllllI(worldPoint.getPlane(), client.getPlane())) {
                ?? r0 = lIIlIlIIlllll[3];
                "".length();
                return "  ".length() < 0 ? ((153 ^ 193) ^ (120 ^ 17)) & (((44 ^ 1) ^ (142 ^ 146)) ^ (-" ".length())) : r0;
            }
            return lIIlIlIIlllll[0];
        }).min(Comparator.comparingInt(worldPoint2 -> {
            return worldPoint2.distanceTo(Players.getLocal());
        })).orElse(null);
    }

    public boolean K() {
        return Players.getLocal().getWorldLocation().equals(a(B));
    }

    public boolean J() {
        return Players.getLocal().getWorldLocation().equals(a(A));
    }

    public WorldPoint I() {
        return a(A);
    }

    private static boolean lIlIlIllllIIIII(int i) {
        return i < 0;
    }

    public RegionPoint b(RegionPoint regionPoint) {
        int indexOf = D.indexOf(regionPoint);
        if (lIlIlIlllIllllI(indexOf, lIIlIlIIlllll[2])) {
            return null;
        }
        return D.get((indexOf + lIIlIlIIlllll[3]) % D.size());
    }

    public WorldPoint O() {
        return a(D.get(lIIlIlIIlllll[0]));
    }

    private static int lIlIlIlllIlllll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }
}
