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
        RegionPoint regionPoint = new RegionPoint(n2, n3, var1[1], d.i());
        m.add(regionPoint);
        0;
        l.put(regionPoint, bl);
        0;
    }

    public boolean n() {
        RegionPoint regionPoint = this.m();
        if (!d.var2(regionPoint) || d.var3(regionPoint, k)) {
            return var1[2];
        }
        return l.get(regionPoint);
    }

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    public static WorldPoint a(RegionPoint regionPoint) {
        Client client = Static.getClient();
        WorldPoint worldPoint2 = regionPoint.toWorld();
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)worldPoint2);
        return collection.stream().filter(worldPoint -> {
            boolean bl;
            if (d.var5(worldPoint.getPlane(), client.getPlane())) {
                bl = var1[4];
                0;
                if (((0x4F ^ 0x7B ^ (9 ^ 0x2D)) & (0x12 ^ 0x55 ^ (0xD5 ^ 0x82) ^ -1)) != 0) {
                    return ((0x6C ^ 0x19 ^ (0xFF ^ 0x84)) & (142 + 167 - 240 + 121 ^ 123 + 113 - 69 + 9 ^ -1)) != 0;
                }
            } else {
                bl = var1[2];
            }
            return bl;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(null);
    }

    public WorldPoint p() {
        return d.a(k);
    }

    private static boolean var2(Object object) {
        return object != null;
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    public WorldPoint q() {
        return d.a(m.get(var1[2]));
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    private static int var8(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 < f3 ? -1 : 1);
    }

    public RegionPoint b(RegionPoint regionPoint) {
        int n2 = m.indexOf(regionPoint);
        if (d.var5(n2, var1[3])) {
            return null;
        }
        return m.get((n2 + var1[4]) % m.size());
    }

    /*
     * WARNING - void declaration
     */
    public RegionPoint m() {
        void var9;
        Player player = Players.getLocal();
        WorldPoint worldPoint = player.getWorldLocation();
        WorldPoint var10 = m.iterator();
        while (d.var7(var10.hasNext() ? 1 : 0)) {
            RegionPoint var11 = var10.next();
            WorldPoint var12 = d.a(var11);
            if (d.var7(var9.equals((Object)var12) ? 1 : 0)) {
                return var11;
            }
            0;
            if (1 <= (0x43 ^ 0x47)) continue;
            return null;
        }
        var10 = d.a(k);
        if (d.var7(var9.equals((Object)var10) ? 1 : 0)) {
            return k;
        }
        return null;
    }

    private static void var4() {
        var1 = new int[20];
        d.var1[0] = -(0xFFFFF36F & 0x5DB5) & (0xFFFFFD7F & 0x7FF7);
        d.var1[1] = 2;
        d.var1[2] = (8 + 17 - -53 + 83 ^ 125 + 51 - 131 + 126) & (0x2F ^ 0x7B ^ (0x64 ^ 0x3A) ^ -1);
        d.var1[3] = -1;
        d.var1[4] = 1;
        d.var1[5] = 0xFFFFDF77 & 0xB29F;
        d.var1[6] = 0x1B ^ 7 ^ (0x4D ^ 0x6A);
        d.var1[7] = 0x6F ^ 0x16 ^ (0x7B ^ 0x30);
        d.var1[8] = 31 + 108 - 82 + 124 ^ 11 + 107 - 107 + 129;
        d.var1[9] = 0x1F ^ 0x2C;
        d.var1[10] = 0x60 ^ 0x56;
        d.var1[11] = 0x8A ^ 0xBD;
        d.var1[12] = 0x3F ^ 0x22 ^ (0x34 ^ 0x19);
        d.var1[13] = 0x70 ^ 0x5C;
        d.var1[14] = 0x43 ^ 0x69;
        d.var1[15] = 0x35 ^ 4;
        d.var1[16] = 0xB5 ^ 0x92;
        d.var1[17] = 2 ^ 0x25 ^ (0x72 ^ 0x7A);
        d.var1[18] = 0x14 ^ 0x4E ^ (0x1D ^ 0x73);
        d.var1[19] = 0xFA ^ 0xB9 ^ (0xC9 ^ 0xB2);
    }

    public static int i() {
        return var1[0];
    }

    /*
     * WARNING - void declaration
     */
    public RegionPoint k() {
        void var2_2;
        d var13;
        if (d.var7(d.j() ? 1 : 0)) {
            return m.get(var1[2]);
        }
        RegionPoint var14 = var13.m();
        int var15 = m.indexOf(var14);
        if (d.var5(var15, var1[3])) {
            return null;
        }
        return m.get((int)((var2_2 + var1[4]) % m.size()));
    }

    private static boolean var5(int n2, int n3) {
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
        Iterator<RegionPoint> var16 = m.iterator();
        while (d.var7(var16.hasNext() ? 1 : 0)) {
            void var17;
            WorldPoint var18;
            RegionPoint var19 = var16.next();
            WorldPoint var20 = d.a(var19);
            if (d.var6(var20)) {
                0;
                if (1 > 0) continue;
                return null;
            }
            if (d.var6(var18)) {
                var18 = var20;
                0;
                if (-1 < 3) continue;
                return null;
            }
            if (d.var21(d.var8(var20.distanceTo2DHypotenuse((WorldPoint)var17), var18.distanceTo2DHypotenuse((WorldPoint)var17)))) {
                var18 = var20;
            }
            0;
            if (((0x66 ^ 0x2E) & ~(0x2D ^ 0x65)) == ((0xF4 ^ 0xAD) & ~(0xDB ^ 0x82))) continue;
            return null;
        }
        return worldPoint;
    }

    private static boolean var21(int n2) {
        return n2 < 0;
    }
}

