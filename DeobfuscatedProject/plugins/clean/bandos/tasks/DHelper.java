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
package gg.squire.bandos.tasks;

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

public class DHelper {
    private static final  RegionPoint k;
    private static final  RegionPoint j;
    public static final  int h;
    private static final  HashMap<RegionPoint, Boolean> l;
    private static final  List<RegionPoint> m;
    
    public static final  int i;

    public static boolean j() {
        Player player = Players.getLocal();
        WorldPoint worldPoint = player.getWorldLocation();
        WorldPoint worldPoint2 = d.a(k);
        return worldPoint.equals((Object)worldPoint2);
    }

    private static void a(int n2, int n3, boolean bl) {
        RegionPoint regionPoint = new RegionPoint(n2, n3, lllIIIllIIl[1], d.i());
        m.add(regionPoint);

        l.put(regionPoint, bl);

    }

    public boolean n() {
        RegionPoint regionPoint = this.m();
        if (!d.lIlIlllIIIIlll(regionPoint) || d.lIlIlllIIIlIII(regionPoint, k)) {
            return lllIIIllIIl[2];
        }
        return l.get(regionPoint);
    }

    static {
        d.lIlIlllIIIIIIl();
        h = lllIIIllIIl[0];
        i = lllIIIllIIl[5];
        j = new RegionPoint(lllIIIllIIl[6], lllIIIllIIl[7], lllIIIllIIl[1], d.i());
        k = new RegionPoint(lllIIIllIIl[8], lllIIIllIIl[8], lllIIIllIIl[1], d.i());
        l = new HashMap();
        m = new ArrayList<RegionPoint>();
        d.a(lllIIIllIIl[9], lllIIIllIIl[10], lllIIIllIIl[2]);
        d.a(lllIIIllIIl[11], lllIIIllIIl[12], lllIIIllIIl[2]);
        d.a(lllIIIllIIl[8], lllIIIllIIl[13], lllIIIllIIl[2]);
        d.a(lllIIIllIIl[9], lllIIIllIIl[12], lllIIIllIIl[2]);
        d.a(lllIIIllIIl[10], lllIIIllIIl[14], lllIIIllIIl[2]);
        d.a(lllIIIllIIl[15], lllIIIllIIl[16], lllIIIllIIl[4]);
        d.a(lllIIIllIIl[8], lllIIIllIIl[17], lllIIIllIIl[2]);
        d.a(lllIIIllIIl[8], lllIIIllIIl[18], lllIIIllIIl[2]);
        d.a(lllIIIllIIl[8], lllIIIllIIl[19], lllIIIllIIl[2]);
    }

    private static boolean lIlIlllIIIlIII(Object object, Object object2) {
        return object == object2;
    }

    public static WorldPoint a(RegionPoint regionPoint) {
        Client client = Static.getClient();
        WorldPoint worldPoint2 = regionPoint.toWorld();
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)worldPoint2);
        return collection.stream().filter(worldPoint -> {
            boolean bl;
            if (d.lIlIlllIIIIIll(worldPoint.getPlane(), client.getPlane())) {
                bl = lllIIIllIIl[4];

                if (((0x4F ^ 0x7B ^ (9 ^ 0x2D)) & (0x12 ^ 0x55 ^ (0xD5 ^ 0x82) ^ -1)) != 0) {
                    return ((0x6C ^ 0x19 ^ (0xFF ^ 0x84)) & (142 + 167 - 240 + 121 ^ 123 + 113 - 69 + 9 ^ -1)) != 0;
                }
            } else {
                bl = lllIIIllIIl[2];
            }
            return bl;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(null);
    }

    public WorldPoint p() {
        return d.a(k);
    }

    private static boolean lIlIlllIIIIlll(Object object) {
        return object != null;
    }

    private static boolean lIlIlllIIIIlIl(Object object) {
        return object == null;
    }

    public WorldPoint q() {
        return d.a(m.get(lllIIIllIIl[2]));
    }

    private static boolean lIlIlllIIIIIlI(int n2) {
        return n2 != 0;
    }

    private static int lIlIlllIIIIlII(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 < f3 ? -1 : 1);
    }

    public RegionPoint b(RegionPoint regionPoint) {
        int n2 = m.indexOf(regionPoint);
        if (d.lIlIlllIIIIIll(n2, lllIIIllIIl[3])) {
            return null;
        }
        return m.get((n2 + lllIIIllIIl[4]) % m.size());
    }

    /*
     * WARNING - void declaration
     */
    public RegionPoint m() {
        void var1;
        Player player = Players.getLocal();
        WorldPoint worldPoint = player.getWorldLocation();
        WorldPoint var2 = m.iterator();
        while (d.lIlIlllIIIIIlI(var2.hasNext() ? 1 : 0)) {
            RegionPoint var3 = var2.next();
            WorldPoint var4 = d.a(var3);
            if (d.lIlIlllIIIIIlI(var1.equals((Object)var4) ? 1 : 0)) {
                return var3;
            }

            if (1 <= (0x43 ^ 0x47)) continue;
            return null;
        }
        var2 = d.a(k);
        if (d.lIlIlllIIIIIlI(var1.equals((Object)var2) ? 1 : 0)) {
            return k;
        }
        return null;
    }

    public static int i() {
        return lllIIIllIIl[0];
    }

    /*
     * WARNING - void declaration
     */
    public RegionPoint k() {
        void var2_2;
        d var5;
        if (d.lIlIlllIIIIIlI(d.j() ? 1 : 0)) {
            return m.get(lllIIIllIIl[2]);
        }
        RegionPoint var6 = var5.m();
        int var7 = m.indexOf(var6);
        if (d.lIlIlllIIIIIll(var7, lllIIIllIIl[3])) {
            return null;
        }
        return m.get((int)((var2_2 + lllIIIllIIl[4]) % m.size()));
    }

    private static boolean lIlIlllIIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    public WorldPoint o() {
        return d.a(j);
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint l() {
        WorldPoint worldPoint = null;
        WorldPoint worldPoint2 = Players.getLocal().getWorldLocation();
        Iterator<RegionPoint> var8 = m.iterator();
        while (d.lIlIlllIIIIIlI(var8.hasNext() ? 1 : 0)) {
            void var9;
            WorldPoint var10;
            RegionPoint var11 = var8.next();
            WorldPoint var12 = d.a(var11);
            if (d.lIlIlllIIIIlIl(var12)) {

                if (1 > 0) continue;
                return null;
            }
            if (d.lIlIlllIIIIlIl(var10)) {
                var10 = var12;

                if (-1 < 3) continue;
                return null;
            }
            if (d.lIlIlllIIIIllI(d.lIlIlllIIIIlII(var12.distanceTo2DHypotenuse((WorldPoint)var9), var10.distanceTo2DHypotenuse((WorldPoint)var9)))) {
                var10 = var12;
            }

            if (((0x66 ^ 0x2E) & ~(0x2D ^ 0x65)) == ((0xF4 ^ 0xAD) & ~(0xDB ^ 0x82))) continue;
            return null;
        }
        return worldPoint;
    }

    private static boolean lIlIlllIIIIllI(int n2) {
        return n2 < 0;
    }
}

