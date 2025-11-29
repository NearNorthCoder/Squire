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
package gg.squire.saradomin.tasks;

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

public class LHelper {
    private static final  RegionPoint B;
    
    public static final  int y;
    private static final  RegionPoint A;
    private static final  HashMap<RegionPoint, Boolean> C;
    private static final  RegionPoint z;
    private static final  List<RegionPoint> D;

    public static boolean H() {
        Player player = Players.getLocal();
        WorldPoint worldPoint = player.getWorldLocation();
        WorldPoint worldPoint2 = l.a(z);
        return worldPoint.equals((Object)worldPoint2);
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public RegionPoint L() {
        void var2_2;
        l var3;
        if (l.var2(l.H() ? 1 : 0)) {
            return D.get(var1[0]);
        }
        RegionPoint var4 = var3.M();
        int var5 = D.indexOf(var4);
        if (l.var6(var5, var1[2])) {
            return null;
        }
        return D.get((int)((var2_2 + var1[3]) % D.size()));
    }

    public WorldPoint N() {
        return l.a(z);
    }

    static {
        l.var7();
        y = var1[1];
        z = new RegionPoint(var1[4], var1[5], var1[0], var1[1]);
        A = new RegionPoint(var1[4], var1[6], var1[0], var1[1]);
        B = new RegionPoint(var1[4], var1[7], var1[0], var1[1]);
        C = new HashMap();
        D = new ArrayList<RegionPoint>();
        l.a(var1[8], var1[9], var1[3]);
        l.a(var1[8], var1[6], var1[0]);
        l.a(var1[8], var1[10], var1[3]);
        l.a(var1[8], var1[11], var1[0]);
        l.a(var1[8], var1[12], var1[3]);
        l.a(var1[13], var1[12], var1[3]);
        l.a(var1[14], var1[12], var1[0]);
        l.a(var1[15], var1[12], var1[3]);
        l.a(var1[16], var1[12], var1[0]);
        l.a(var1[17], var1[10], var1[3]);
        l.a(var1[18], var1[14], var1[3]);
        l.a(var1[18], var1[5], var1[3]);
        l.a(var1[17], var1[8], var1[0]);
        l.a(var1[16], var1[4], var1[3]);
        l.a(var1[13], var1[8], var1[3]);
        l.a(var1[7], var1[8], var1[0]);
        l.a(var1[5], var1[5], var1[3]);
    }

    private static void a(int n2, int n3, boolean bl) {
        RegionPoint regionPoint = new RegionPoint(n2, n3, var1[0], var1[1]);
        D.add(regionPoint);
        0;
        C.put(regionPoint, bl);
        0;
    }

    private static void var7() {
        var1 = new int[19];
        l.var1[0] = (0x1F ^ 0x24) & ~(0x31 ^ 0xA);
        l.var1[1] = 0xFFFFED52 & 0x3FFF;
        l.var1[2] = -1;
        l.var1[3] = 1;
        l.var1[4] = 0x4C ^ 0x57;
        l.var1[5] = 0x7B ^ 0x63;
        l.var1[6] = 0x77 ^ 0x66;
        l.var1[7] = 0x25 ^ 0x30;
        l.var1[8] = 63 + 73 - 22 + 26 ^ 96 + 21 - -10 + 23;
        l.var1[9] = (0x27 ^ 0x20) & ~(0x16 ^ 0x11) ^ (0x2C ^ 0x3E);
        l.var1[10] = 61 + 61 - 117 + 145 ^ 72 + 39 - 17 + 58;
        l.var1[11] = 0x2E ^ 0x2B ^ (0x22 ^ 0x2A);
        l.var1[12] = 75 + 26 - 93 + 195 ^ 186 + 39 - 177 + 145;
        l.var1[13] = 0x4C ^ 0x58;
        l.var1[14] = 86 + 2 - -122 + 5 ^ 108 + 57 - 49 + 80;
        l.var1[15] = 0x97 ^ 0x87;
        l.var1[16] = 0x78 ^ 0x77;
        l.var1[17] = 2 ^ (0x81 ^ 0x88);
        l.var1[18] = 9 ^ 0x44 ^ (9 ^ 0x4D);
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint Q() {
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        RegionPoint regionPoint = RegionPoint.fromWorld((WorldPoint)worldPoint);
        RegionPoint regionPoint2 = null;
        double d2 = Double.MAX_VALUE;
        Iterator<RegionPoint> var8 = D.iterator();
        while (l.var2(var8.hasNext() ? 1 : 0)) {
            double var9;
            void var10;
            RegionPoint var11 = var8.next();
            double var12 = var11.distanceTo((RegionPoint)var10);
            if (l.var13(l.var14(var12, var9))) {
                var9 = var12;
                RegionPoint var15 = var11;
            }
            0;
            if (-1 < (0x8E ^ 0x8A)) continue;
            return null;
        }
        return l.a(this.b(regionPoint2));
    }

    private static boolean var6(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public RegionPoint M() {
        void var16;
        Player player = Players.getLocal();
        WorldPoint worldPoint = player.getWorldLocation();
        WorldPoint var17 = D.iterator();
        while (l.var2(var17.hasNext() ? 1 : 0)) {
            RegionPoint var18 = var17.next();
            WorldPoint var19 = l.a(var18);
            if (l.var2(var16.equals((Object)var19) ? 1 : 0)) {
                return var18;
            }
            0;
            if ((95 + 108 - 78 + 26 ^ 86 + 48 - 110 + 123) > 0) continue;
            return null;
        }
        var17 = l.a(z);
        if (l.var2(var16.equals((Object)var17) ? 1 : 0)) {
            return z;
        }
        return null;
    }

    public boolean P() {
        if (l.var2(l.H() ? 1 : 0)) {
            return var1[3];
        }
        return C.getOrDefault(this.M(), var1[0]);
    }

    public static WorldPoint a(RegionPoint regionPoint) {
        Client client = Static.getClient();
        WorldPoint worldPoint2 = regionPoint.toWorld();
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)worldPoint2);
        return collection.stream().filter(worldPoint -> {
            boolean bl;
            if (l.var6(worldPoint.getPlane(), client.getPlane())) {
                bl = var1[3];
                0;
                if (2 < 0) {
                    return ((0x99 ^ 0xC1 ^ (0x78 ^ 0x11)) & (0x2C ^ 1 ^ (0x8E ^ 0x92) ^ -1)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(null);
    }

    public boolean K() {
        Player player = Players.getLocal();
        WorldPoint worldPoint = player.getWorldLocation();
        WorldPoint worldPoint2 = l.a(B);
        return worldPoint.equals((Object)worldPoint2);
    }

    public boolean J() {
        Player player = Players.getLocal();
        WorldPoint worldPoint = player.getWorldLocation();
        WorldPoint worldPoint2 = l.a(A);
        return worldPoint.equals((Object)worldPoint2);
    }

    public WorldPoint I() {
        return l.a(A);
    }

    private static boolean var13(int n2) {
        return n2 < 0;
    }

    public RegionPoint b(RegionPoint regionPoint) {
        int n2 = D.indexOf(regionPoint);
        if (l.var6(n2, var1[2])) {
            return null;
        }
        return D.get((n2 + var1[3]) % D.size());
    }

    public WorldPoint O() {
        return l.a(D.get(var1[0]));
    }

    private static int var14(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }
}

