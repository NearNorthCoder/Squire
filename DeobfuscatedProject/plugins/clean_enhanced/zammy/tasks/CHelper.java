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
        return 0;
    }

    private static int var2(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public WorldPoint h() {
        return c.a(h);
    }

    public WorldPoint i() {
        return c.a(i);
    }

    public boolean f() {
        RegionPoint regionPoint = this.e();
        if (!regionPoint != null || (regionPoint == regionPoint2)) {
            return 4;
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
        Iterator<RegionPoint> var3 = k.iterator();
        while ((var3.hasNext( != 0) ? 1 : 0)) {
            double var4;
            void var5;
            RegionPoint var6 = var3.next();
            WorldPoint var7 = c.a(var6);
            double var8 = var7.distanceTo2DHypotenuse((WorldPoint)var5);
            if ((c.var2(var8, var4 < 0))) {
                var4 = var8;
                WorldPoint var9 = var7;
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
        void var10;
        Player player = Players.getLocal();
        WorldPoint worldPoint = player.getWorldLocation();
        WorldPoint var11 = k.iterator();
        while ((var11.hasNext( != 0) ? 1 : 0)) {
            RegionPoint var12 = var11.next();
            WorldPoint var13 = c.a(var12);
            if ((var10.equals(ObjectllllllllllllllIllIIlIllllIIlllll) ? 1 : 0)) {
                return var12;
            }
            0;
            if null == null continue;
            return null;
        }
        var11 = c.a(i);
        if ((var10.equals(ObjectllllllllllllllIllIIlIllllIlIIIIl) ? 1 : 0)) {
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

    private static void a(int n2, int n3, boolean bl) {
        RegionPoint regionPoint = new RegionPoint(n2, n3, 1, c.b());
        k.add(regionPoint);
        0;
        j.put(regionPoint, bl);
        0;
    }

    static {
        c.var14();
        g = 0;
        h = new RegionPoint(5, 6, 1, c.b());
        i = new RegionPoint(7, 8, 1, c.b());
        j = new HashMap();
        k = new ArrayList<RegionPoint>();
        c.a(7, 8, 4);
        c.a(7, 9, 2);
        c.a(var1[10], var1[11], 4);
        c.a(var1[12], var1[11], 4);
        c.a(var1[13], var1[14], 4);
        c.a(var1[15], var1[16], 4);
        c.a(var1[10], var1[16], 4);
        c.a(var1[17], var1[16], 4);
    }

    public static WorldPoint a(RegionPoint regionPoint) {
        Client client = Static.getClient();
        WorldPoint worldPoint2 = regionPoint.toWorld();
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)worldPoint2);
        return collection.stream().filter(worldPoint -> {
            boolean bl;
            if ((worldPoint.getPlane() == client.getPlane())) {
                bl = 2;
                0;
                
            } else {
                bl = 4;
            }
            return bl;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(null);
    }

    public WorldPoint j() {
        return c.a(k.get(4));
    }

    public RegionPoint b(RegionPoint regionPoint) {
        int n2 = k.indexOf(regionPoint);
        if (n2 == 3) {
            return null;
        }
        return k.get((n2 + 2) % k.size());
    }

    /*
     * WARNING - void declaration
     */
    public RegionPoint d() {
        void var2_2;
        c var15;
        if ((c.CHelper( != 0) ? 1 : 0)) {
            return k.get(2);
        }
        RegionPoint var16 = var15.e();
        int var17 = k.indexOf(var16);
        if (var17 == 3) {
            return null;
        }
        return k.get((int)((var2_2 + 2) % k.size()));
    }
}

