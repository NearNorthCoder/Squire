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

public class l {
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

    private static boolean lIlIlIlllIlllIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public RegionPoint L() {
        void var2_2;
        l var1;
        if (l.lIlIlIlllIlllIl(l.H() ? 1 : 0)) {
            return D.get(lIIlIlIIlllll[0]);
        }
        RegionPoint var2 = var1.M();
        int var3 = D.indexOf(var2);
        if (l.lIlIlIlllIllllI(var3, lIIlIlIIlllll[2])) {
            return null;
        }
        return D.get((int)((var2_2 + lIIlIlIIlllll[3]) % D.size()));
    }

    public WorldPoint N() {
        return l.a(z);
    }

    static {
        l.lIlIlIlllIlllII();
        y = lIIlIlIIlllll[1];
        z = new RegionPoint(lIIlIlIIlllll[4], lIIlIlIIlllll[5], lIIlIlIIlllll[0], lIIlIlIIlllll[1]);
        A = new RegionPoint(lIIlIlIIlllll[4], lIIlIlIIlllll[6], lIIlIlIIlllll[0], lIIlIlIIlllll[1]);
        B = new RegionPoint(lIIlIlIIlllll[4], lIIlIlIIlllll[7], lIIlIlIIlllll[0], lIIlIlIIlllll[1]);
        C = new HashMap();
        D = new ArrayList<RegionPoint>();
        l.a(lIIlIlIIlllll[8], lIIlIlIIlllll[9], lIIlIlIIlllll[3]);
        l.a(lIIlIlIIlllll[8], lIIlIlIIlllll[6], lIIlIlIIlllll[0]);
        l.a(lIIlIlIIlllll[8], lIIlIlIIlllll[10], lIIlIlIIlllll[3]);
        l.a(lIIlIlIIlllll[8], lIIlIlIIlllll[11], lIIlIlIIlllll[0]);
        l.a(lIIlIlIIlllll[8], lIIlIlIIlllll[12], lIIlIlIIlllll[3]);
        l.a(lIIlIlIIlllll[13], lIIlIlIIlllll[12], lIIlIlIIlllll[3]);
        l.a(lIIlIlIIlllll[14], lIIlIlIIlllll[12], lIIlIlIIlllll[0]);
        l.a(lIIlIlIIlllll[15], lIIlIlIIlllll[12], lIIlIlIIlllll[3]);
        l.a(lIIlIlIIlllll[16], lIIlIlIIlllll[12], lIIlIlIIlllll[0]);
        l.a(lIIlIlIIlllll[17], lIIlIlIIlllll[10], lIIlIlIIlllll[3]);
        l.a(lIIlIlIIlllll[18], lIIlIlIIlllll[14], lIIlIlIIlllll[3]);
        l.a(lIIlIlIIlllll[18], lIIlIlIIlllll[5], lIIlIlIIlllll[3]);
        l.a(lIIlIlIIlllll[17], lIIlIlIIlllll[8], lIIlIlIIlllll[0]);
        l.a(lIIlIlIIlllll[16], lIIlIlIIlllll[4], lIIlIlIIlllll[3]);
        l.a(lIIlIlIIlllll[13], lIIlIlIIlllll[8], lIIlIlIIlllll[3]);
        l.a(lIIlIlIIlllll[7], lIIlIlIIlllll[8], lIIlIlIIlllll[0]);
        l.a(lIIlIlIIlllll[5], lIIlIlIIlllll[5], lIIlIlIIlllll[3]);
    }

    private static void a(int n2, int n3, boolean bl) {
        RegionPoint regionPoint = new RegionPoint(n2, n3, lIIlIlIIlllll[0], lIIlIlIIlllll[1]);
        D.add(regionPoint);

        C.put(regionPoint, bl);

    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint Q() {
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        RegionPoint regionPoint = RegionPoint.fromWorld((WorldPoint)worldPoint);
        RegionPoint regionPoint2 = null;
        double d2 = Double.MAX_VALUE;
        Iterator<RegionPoint> var4 = D.iterator();
        while (l.lIlIlIlllIlllIl(var4.hasNext() ? 1 : 0)) {
            double var5;
            void var6;
            RegionPoint var7 = var4.next();
            double var8 = var7.distanceTo((RegionPoint)var6);
            if (l.lIlIlIllllIIIII(l.lIlIlIlllIlllll(var8, var5))) {
                var5 = var8;
                RegionPoint var9 = var7;
            }

            if (-1 < (0x8E ^ 0x8A)) continue;
            return null;
        }
        return l.a(this.b(regionPoint2));
    }

    private static boolean lIlIlIlllIllllI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public RegionPoint M() {
        void var10;
        Player player = Players.getLocal();
        WorldPoint worldPoint = player.getWorldLocation();
        WorldPoint var11 = D.iterator();
        while (l.lIlIlIlllIlllIl(var11.hasNext() ? 1 : 0)) {
            RegionPoint var12 = var11.next();
            WorldPoint var13 = l.a(var12);
            if (l.lIlIlIlllIlllIl(var10.equals((Object)var13) ? 1 : 0)) {
                return var12;
            }

            if ((95 + 108 - 78 + 26 ^ 86 + 48 - 110 + 123) > 0) continue;
            return null;
        }
        var11 = l.a(z);
        if (l.lIlIlIlllIlllIl(var10.equals((Object)var11) ? 1 : 0)) {
            return z;
        }
        return null;
    }

    public boolean P() {
        if (l.lIlIlIlllIlllIl(l.H() ? 1 : 0)) {
            return lIIlIlIIlllll[3];
        }
        return C.getOrDefault(this.M(), lIIlIlIIlllll[0]);
    }

    public static WorldPoint a(RegionPoint regionPoint) {
        Client client = Static.getClient();
        WorldPoint worldPoint2 = regionPoint.toWorld();
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)worldPoint2);
        return collection.stream().filter(worldPoint -> {
            boolean bl;
            if (l.lIlIlIlllIllllI(worldPoint.getPlane(), client.getPlane())) {
                bl = lIIlIlIIlllll[3];

                if (2 < 0) {
                    return ((0x99 ^ 0xC1 ^ (0x78 ^ 0x11)) & (0x2C ^ 1 ^ (0x8E ^ 0x92) ^ -1)) != 0;
                }
            } else {
                bl = lIIlIlIIlllll[0];
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

    private static boolean lIlIlIllllIIIII(int n2) {
        return n2 < 0;
    }

    public RegionPoint b(RegionPoint regionPoint) {
        int n2 = D.indexOf(regionPoint);
        if (l.lIlIlIlllIllllI(n2, lIIlIlIIlllll[2])) {
            return null;
        }
        return D.get((n2 + lIIlIlIIlllll[3]) % D.size());
    }

    public WorldPoint O() {
        return l.a(D.get(lIIlIlIIlllll[0]));
    }

    private static int lIlIlIlllIlllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }
}

