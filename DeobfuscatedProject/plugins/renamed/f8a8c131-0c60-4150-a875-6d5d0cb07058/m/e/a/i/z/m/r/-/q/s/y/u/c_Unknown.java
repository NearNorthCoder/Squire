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

public class c_Unknown {
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
        Iterator<RegionPoint> var8 = k.iterator();
        while (c.llIIIlIIllIllII(var8.hasNext() ? 1 : 0)) {
            double var12;
            void var1;
            RegionPoint var3 = var8.next();
            WorldPoint var10 = c.a(var3);
            double var4 = var10.distanceTo2DHypotenuse((WorldPoint)var1);
            if (c.llIIIlIIlllIIIl(c.llIIIlIIlllIIII(var4, var12))) {
                var12 = var4;
                WorldPoint llllllllllllllIllIIlIllllIIlIIlI = var10;
            }
            0;
            if (-2 < 0) continue;
            return null;
        }
        return worldPoint2;
    }

    /*
     * WARNING - void declaration
     */
    public RegionPoint e() {
        void var11;
        Player player = Players.getLocal();
        WorldPoint worldPoint = player.getWorldLocation();
        WorldPoint var13 = k.iterator();
        while (c.llIIIlIIllIllII(var13.hasNext() ? 1 : 0)) {
            RegionPoint var2 = var13.next();
            WorldPoint var7 = c.a(var2);
            if (c.llIIIlIIllIllII(var11.equals((Object)var7) ? 1 : 0)) {
                return var2;
            }
            0;
            
            return null;
        }
        var13 = c.a(i);
        if (c.llIIIlIIllIllII(var11.equals((Object)var13) ? 1 : 0)) {
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
        0;
        j.put(regionPoint, bl);
        0;
    }

    private static boolean llIIIlIIllIllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIIIlIIllIlIll() {
        lIllIIIlIIlll = new int[18];
        c.lIllIIIlIIlll[0] = 0xFFFFAD77 & 0x7FDB;
        c.lIllIIIlIIlll[1] = 2;
        c.lIllIIIlIIlll[2] = 1;
        c.lIllIIIlIIlll[3] = -1;
        c.lIllIIIlIIlll[4] = (0xE6 ^ 0xBA ^ (0x59 ^ 0x28)) & (0x6E ^ 0x78 ^ (1 ^ 0x3A) ^ -1);
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
                0;
                if (1 == 0) {
                    return ((0xA7 ^ 0x9B ^ (0x70 ^ 0x16)) & (133 + 56 - 51 + 65 ^ 28 + 141 - 138 + 114 ^ -1)) != 0;
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
        c var5;
        if (c.llIIIlIIllIllII(c.c() ? 1 : 0)) {
            return k.get(lIllIIIlIIlll[2]);
        }
        RegionPoint var6 = var5.e();
        int var9 = k.indexOf(var6);
        if (c.llIIIlIIllIllIl(var9, lIllIIIlIIlll[3])) {
            return null;
        }
        return k.get((int)((var2_2 + lIllIIIlIIlll[2]) % k.size()));
    }
}

