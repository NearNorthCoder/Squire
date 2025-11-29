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
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

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
    private static final /* synthetic */ RegionPoint B;
    private static /* synthetic */ int[] lIIlIlIIlllll;
    public static final /* synthetic */ int y;
    private static final /* synthetic */ RegionPoint A;
    private static final /* synthetic */ HashMap<RegionPoint, Boolean> C;
    private static final /* synthetic */ RegionPoint z;
    private static final /* synthetic */ List<RegionPoint> D;

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
        l llllllllllllllIllllIllllIllIIIll;
        if (l.lIlIlIlllIlllIl(l.H() ? 1 : 0)) {
            return D.get(lIIlIlIIlllll[0]);
        }
        RegionPoint llllllllllllllIllllIllllIllIIIlI = llllllllllllllIllllIllllIllIIIll.M();
        int llllllllllllllIllllIllllIllIIIIl = D.indexOf(llllllllllllllIllllIllllIllIIIlI);
        if (l.lIlIlIlllIllllI(llllllllllllllIllllIllllIllIIIIl, lIIlIlIIlllll[2])) {
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
        "".length();
        C.put(regionPoint, bl);
        "".length();
    }

    private static void lIlIlIlllIlllII() {
        lIIlIlIIlllll = new int[19];
        l.lIIlIlIIlllll[0] = (0x1F ^ 0x24) & ~(0x31 ^ 0xA);
        l.lIIlIlIIlllll[1] = 0xFFFFED52 & 0x3FFF;
        l.lIIlIlIIlllll[2] = -" ".length();
        l.lIIlIlIIlllll[3] = " ".length();
        l.lIIlIlIIlllll[4] = 0x4C ^ 0x57;
        l.lIIlIlIIlllll[5] = 0x7B ^ 0x63;
        l.lIIlIlIIlllll[6] = 0x77 ^ 0x66;
        l.lIIlIlIIlllll[7] = 0x25 ^ 0x30;
        l.lIIlIlIIlllll[8] = 63 + 73 - 22 + 26 ^ 96 + 21 - -10 + 23;
        l.lIIlIlIIlllll[9] = (0x27 ^ 0x20) & ~(0x16 ^ 0x11) ^ (0x2C ^ 0x3E);
        l.lIIlIlIIlllll[10] = 61 + 61 - 117 + 145 ^ 72 + 39 - 17 + 58;
        l.lIIlIlIIlllll[11] = 0x2E ^ 0x2B ^ (0x22 ^ 0x2A);
        l.lIIlIlIIlllll[12] = 75 + 26 - 93 + 195 ^ 186 + 39 - 177 + 145;
        l.lIIlIlIIlllll[13] = 0x4C ^ 0x58;
        l.lIIlIlIIlllll[14] = 86 + 2 - -122 + 5 ^ 108 + 57 - 49 + 80;
        l.lIIlIlIIlllll[15] = 0x97 ^ 0x87;
        l.lIIlIlIIlllll[16] = 0x78 ^ 0x77;
        l.lIIlIlIIlllll[17] = "  ".length() ^ (0x81 ^ 0x88);
        l.lIIlIlIIlllll[18] = 9 ^ 0x44 ^ (9 ^ 0x4D);
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint Q() {
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        RegionPoint regionPoint = RegionPoint.fromWorld((WorldPoint)worldPoint);
        RegionPoint regionPoint2 = null;
        double d2 = Double.MAX_VALUE;
        Iterator<RegionPoint> llllllllllllllIllllIllllIlIIIIll = D.iterator();
        while (l.lIlIlIlllIlllIl(llllllllllllllIllllIllllIlIIIIll.hasNext() ? 1 : 0)) {
            double llllllllllllllIllllIllllIlIIIlII;
            void llllllllllllllIllllIllllIlIIIllI;
            RegionPoint llllllllllllllIllllIllllIlIIIIlI = llllllllllllllIllllIllllIlIIIIll.next();
            double llllllllllllllIllllIllllIlIIIIIl = llllllllllllllIllllIllllIlIIIIlI.distanceTo((RegionPoint)llllllllllllllIllllIllllIlIIIllI);
            if (l.lIlIlIllllIIIII(l.lIlIlIlllIlllll(llllllllllllllIllllIllllIlIIIIIl, llllllllllllllIllllIllllIlIIIlII))) {
                llllllllllllllIllllIllllIlIIIlII = llllllllllllllIllllIllllIlIIIIIl;
                RegionPoint llllllllllllllIllllIllllIlIIIlIl = llllllllllllllIllllIllllIlIIIIlI;
            }
            "".length();
            if (-" ".length() < (0x8E ^ 0x8A)) continue;
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
        void llllllllllllllIllllIllllIlIlIllI;
        Player player = Players.getLocal();
        WorldPoint worldPoint = player.getWorldLocation();
        WorldPoint llllllllllllllIllllIllllIlIlIlIl = D.iterator();
        while (l.lIlIlIlllIlllIl(llllllllllllllIllllIllllIlIlIlIl.hasNext() ? 1 : 0)) {
            RegionPoint llllllllllllllIllllIllllIlIlIlII = llllllllllllllIllllIllllIlIlIlIl.next();
            WorldPoint llllllllllllllIllllIllllIlIlIIll = l.a(llllllllllllllIllllIllllIlIlIlII);
            if (l.lIlIlIlllIlllIl(llllllllllllllIllllIllllIlIlIllI.equals((Object)llllllllllllllIllllIllllIlIlIIll) ? 1 : 0)) {
                return llllllllllllllIllllIllllIlIlIlII;
            }
            "".length();
            if ((95 + 108 - 78 + 26 ^ 86 + 48 - 110 + 123) > 0) continue;
            return null;
        }
        llllllllllllllIllllIllllIlIlIlIl = l.a(z);
        if (l.lIlIlIlllIlllIl(llllllllllllllIllllIllllIlIlIllI.equals((Object)llllllllllllllIllllIllllIlIlIlIl) ? 1 : 0)) {
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
                "".length();
                if ("  ".length() < 0) {
                    return ((0x99 ^ 0xC1 ^ (0x78 ^ 0x11)) & (0x2C ^ 1 ^ (0x8E ^ 0x92) ^ -" ".length())) != 0;
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

