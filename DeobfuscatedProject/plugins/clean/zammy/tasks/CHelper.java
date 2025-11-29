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
package gg.squire.zammy.tasks;

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

public class CHelper {
    private static final  List<RegionPoint> k;
    private static final  RegionPoint i;
    private static final  RegionPoint h;
    private static final  HashMap<RegionPoint, Boolean> j;
    public static final  int g;

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
        Iterator<RegionPoint> var1 = k.iterator();
        while (c.llIIIlIIllIllII(var1.hasNext() ? 1 : 0)) {
            double var2;
            void var3;
            RegionPoint var4 = var1.next();
            WorldPoint var5 = c.a(var4);
            double var6 = var5.distanceTo2DHypotenuse((WorldPoint)var3);
            if (c.llIIIlIIlllIIIl(c.llIIIlIIlllIIII(var6, var2))) {
                var2 = var6;
                WorldPoint var7 = var5;
            }

            if (-2 < 0) continue;
            return null;
        }
        return worldPoint2;
    }

    /*
     * WARNING - void declaration
     */
    public RegionPoint e() {
        void var8;
        Player player = Players.getLocal();
        WorldPoint worldPoint = player.getWorldLocation();
        WorldPoint var9 = k.iterator();
        while (c.llIIIlIIllIllII(var9.hasNext() ? 1 : 0)) {
            RegionPoint var10 = var9.next();
            WorldPoint var11 = c.a(var10);
            if (c.llIIIlIIllIllII(var8.equals((Object)var11) ? 1 : 0)) {
                return var10;
            }

            return null;
        }
        var9 = c.a(i);
        if (c.llIIIlIIllIllII(var8.equals((Object)var9) ? 1 : 0)) {
            return i;
        }
        return null;
    }

    public static boolean CHelper() {
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

        j.put(regionPoint, bl);

    }

    private static boolean llIIIlIIllIllIl(int n2, int n3) {
        return n2 == n3;
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
        c var12;
        if (c.llIIIlIIllIllII(c.CHelper() ? 1 : 0)) {
            return k.get(lIllIIIlIIlll[2]);
        }
        RegionPoint var13 = var12.e();
        int var14 = k.indexOf(var13);
        if (c.llIIIlIIllIllIl(var14, lIllIIIlIIlll[3])) {
            return null;
        }
        return k.get((int)((var2_2 + lIllIIIlIIlll[2]) % k.size()));
    }
}

