/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package m.e.a.i.z.m.r.-.q.s.y.u;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;

public class c {
    private static final /* synthetic */ List<RegionPoint> k;
    private static final /* synthetic */ RegionPoint i;
    private static final /* synthetic */ RegionPoint h;
    private static final /* synthetic */ HashMap<RegionPoint, Boolean> j;
    public static final /* synthetic */ int g;
    private static /* synthetic */ int[] lIllIIIlIIlll;

    public static int b() {
        return lIllIIIlIIlll[0];
    }

    private static int llIIIlIIlllIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIIIlIIlllIIIl(int n2) {
        return n2 < 0;
    }

    public WorldPoint h() {
        return c.a(h);
    }

    public WorldPoint i() {
        return c.a(i);
    }

    public boolean f() {
        RegionPoint regionPoint = this.e();
        if (!c.llIIIlIIllIlllI(regionPoint) || c.llIIIlIIllIllll(regionPoint, i)) {
            return lIllIIIlIIlll[4];
        }
        return j.get(regionPoint);
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint g() {
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        WorldPoint worldPoint2 = null;
        double d2 = Double.MAX_VALUE;
        Iterator<RegionPoint> llllllllllllllIllIIlIllllIIlIIII = k.iterator();
        while (c.llIIIlIIllIllII(llllllllllllllIllIIlIllllIIlIIII.hasNext() ? 1 : 0)) {
            double llllllllllllllIllIIlIllllIIlIIIl;
            void llllllllllllllIllIIlIllllIIlIIll;
            RegionPoint llllllllllllllIllIIlIllllIIIllll = llllllllllllllIllIIlIllllIIlIIII.next();
            WorldPoint llllllllllllllIllIIlIllllIIIlllI = c.a(llllllllllllllIllIIlIllllIIIllll);
            double llllllllllllllIllIIlIllllIIIllIl = llllllllllllllIllIIlIllllIIIlllI.distanceTo2DHypotenuse((WorldPoint)llllllllllllllIllIIlIllllIIlIIll);
            if (c.llIIIlIIlllIIIl(c.llIIIlIIlllIIII(llllllllllllllIllIIlIllllIIIllIl, llllllllllllllIllIIlIllllIIlIIIl))) {
                llllllllllllllIllIIlIllllIIlIIIl = llllllllllllllIllIIlIllllIIIllIl;
                WorldPoint llllllllllllllIllIIlIllllIIlIIlI = llllllllllllllIllIIlIllllIIIlllI;
            }
            "".length();
            if (-"  ".length() < 0) continue;
            return null;
        }
        return worldPoint2;
    }

    /*
     * WARNING - void declaration
     */
    public RegionPoint e() {
        void llllllllllllllIllIIlIllllIlIIIlI;
        Player player = Players.getLocal();
        WorldPoint worldPoint = player.getWorldLocation();
        WorldPoint llllllllllllllIllIIlIllllIlIIIIl = k.iterator();
        while (c.llIIIlIIllIllII(llllllllllllllIllIIlIllllIlIIIIl.hasNext() ? 1 : 0)) {
            RegionPoint llllllllllllllIllIIlIllllIlIIIII = llllllllllllllIllIIlIllllIlIIIIl.next();
            WorldPoint llllllllllllllIllIIlIllllIIlllll = c.a(llllllllllllllIllIIlIllllIlIIIII);
            if (c.llIIIlIIllIllII(llllllllllllllIllIIlIllllIlIIIlI.equals((Object)llllllllllllllIllIIlIllllIIlllll) ? 1 : 0)) {
                return llllllllllllllIllIIlIllllIlIIIII;
            }
            "".length();
            if (null == null) continue;
            return null;
        }
        llllllllllllllIllIIlIllllIlIIIIl = c.a(i);
        if (c.llIIIlIIllIllII(llllllllllllllIllIIlIllllIlIIIlI.equals((Object)llllllllllllllIllIIlIllllIlIIIIl) ? 1 : 0)) {
            return i;
        }
        return null;
    }

    public static boolean c() {
        Player player = Players.getLocal();
        WorldPoint worldPoint = player.getWorldLocation();
        WorldPoint worldPoint2 = c.a(i);
        return worldPoint.equals((Object)worldPoint2);
    }

    private static boolean llIIIlIIllIlllI(Object object) {
        return object != null;
    }

    private static boolean llIIIlIIllIllll(Object object, Object object2) {
        return object == object2;
    }

    private static void a(int n2, int n3, boolean bl) {
        RegionPoint regionPoint = new RegionPoint(n2, n3, lIllIIIlIIlll[1], c.b());
        k.add(regionPoint);
        "".length();
        j.put(regionPoint, bl);
        "".length();
    }

    private static boolean llIIIlIIllIllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIIIlIIllIlIll() {
        lIllIIIlIIlll = new int[18];
        c.lIllIIIlIIlll[0] = 0xFFFFAD77 & 0x7FDB;
        c.lIllIIIlIIlll[1] = "  ".length();
        c.lIllIIIlIIlll[2] = " ".length();
        c.lIllIIIlIIlll[3] = -" ".length();
        c.lIllIIIlIIlll[4] = (0xE6 ^ 0xBA ^ (0x59 ^ 0x28)) & (0x6E ^ 0x78 ^ (1 ^ 0x3A) ^ -" ".length());
        c.lIllIIIlIIlll[5] = 0x39 ^ 0x16;
        c.lIllIIIlIIlll[6] = 0x94 ^ 0x86;
        c.lIllIIIlIIlll[7] = 9 ^ 0x2F;
        c.lIllIIIlIIlll[8] = 0xA3 ^ 0xAF;
        c.lIllIIIlIIlll[9] = 0x51 ^ 0x57;
        c.lIllIIIlIIlll[10] = 0x15 ^ 0x3B;
        c.lIllIIIlIIlll[11] = 0xA2 ^ 0xB2;
        c.lIllIIIlIIlll[12] = 0x7E ^ 0x1D ^ (0x75 ^ 0x25);
        c.lIllIIIlIIlll[13] = 0x72 ^ 8 ^ (0x4A ^ 7);
        c.lIllIIIlIIlll[14] = 0x46 ^ 0x49;
        c.lIllIIIlIIlll[15] = 0xCA ^ 0xA1 ^ (0x74 ^ 0x2B);
        c.lIllIIIlIIlll[16] = 0x66 ^ 0x6F;
        c.lIllIIIlIIlll[17] = 0x62 ^ 0x48;
    }

    static {
        c.llIIIlIIllIlIll();
        g = lIllIIIlIIlll[0];
        h = new RegionPoint(lIllIIIlIIlll[5], lIllIIIlIIlll[6], lIllIIIlIIlll[1], c.b());
        i = new RegionPoint(lIllIIIlIIlll[7], lIllIIIlIIlll[8], lIllIIIlIIlll[1], c.b());
        j = new HashMap();
        k = new ArrayList<RegionPoint>();
        c.a(lIllIIIlIIlll[7], lIllIIIlIIlll[8], lIllIIIlIIlll[4]);
        c.a(lIllIIIlIIlll[7], lIllIIIlIIlll[9], lIllIIIlIIlll[2]);
        c.a(lIllIIIlIIlll[10], lIllIIIlIIlll[11], lIllIIIlIIlll[4]);
        c.a(lIllIIIlIIlll[12], lIllIIIlIIlll[11], lIllIIIlIIlll[4]);
        c.a(lIllIIIlIIlll[13], lIllIIIlIIlll[14], lIllIIIlIIlll[4]);
        c.a(lIllIIIlIIlll[15], lIllIIIlIIlll[16], lIllIIIlIIlll[4]);
        c.a(lIllIIIlIIlll[10], lIllIIIlIIlll[16], lIllIIIlIIlll[4]);
        c.a(lIllIIIlIIlll[17], lIllIIIlIIlll[16], lIllIIIlIIlll[4]);
    }

    public static WorldPoint a(RegionPoint regionPoint) {
        Client client = Static.getClient();
        WorldPoint worldPoint2 = regionPoint.toWorld();
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)worldPoint2);
        return collection.stream().filter(worldPoint -> {
            boolean bl;
            if (c.llIIIlIIllIllIl(worldPoint.getPlane(), client.getPlane())) {
                bl = lIllIIIlIIlll[2];
                "".length();
                if (" ".length() == 0) {
                    return ((0xA7 ^ 0x9B ^ (0x70 ^ 0x16)) & (133 + 56 - 51 + 65 ^ 28 + 141 - 138 + 114 ^ -" ".length())) != 0;
                }
            } else {
                bl = lIllIIIlIIlll[4];
            }
            return bl;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(null);
    }

    public WorldPoint j() {
        return c.a(k.get(lIllIIIlIIlll[4]));
    }

    private static boolean llIIIlIIllIllII(int n2) {
        return n2 != 0;
    }

    public RegionPoint b(RegionPoint regionPoint) {
        int n2 = k.indexOf(regionPoint);
        if (c.llIIIlIIllIllIl(n2, lIllIIIlIIlll[3])) {
            return null;
        }
        return k.get((n2 + lIllIIIlIIlll[2]) % k.size());
    }

    /*
     * WARNING - void declaration
     */
    public RegionPoint d() {
        void var2_2;
        c llllllllllllllIllIIlIllllIlIllll;
        if (c.llIIIlIIllIllII(c.c() ? 1 : 0)) {
            return k.get(lIllIIIlIIlll[2]);
        }
        RegionPoint llllllllllllllIllIIlIllllIlIlllI = llllllllllllllIllIIlIllllIlIllll.e();
        int llllllllllllllIllIIlIllllIlIllIl = k.indexOf(llllllllllllllIllIIlIllllIlIlllI);
        if (c.llIIIlIIllIllIl(llllllllllllllIllIIlIllllIlIllIl, lIllIIIlIIlll[3])) {
            return null;
        }
        return k.get((int)((var2_2 + lIllIIIlIIlll[2]) % k.size()));
    }
}

