/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import java.util.Collection;
import java.util.Comparator;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;

@Singleton
public class g_Unknown {
    private static /* synthetic */ int[] lIlIllIIIIIIl;
    @Inject
    private /* synthetic */ Client D;

    private static void llIIIIIIIIIIIIl() {
        lIlIllIIIIIIl = new int[2];
        g.lIlIllIIIIIIl[0] = (0x6E ^ 0x3E) & ~(0xC9 ^ 0x99);
        g.lIlIllIIIIIIl[1] = 1;
    }

    private static boolean llIIIIIIIIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    public WorldPoint a(RegionPoint regionPoint) {
        Client client = Static.getClient();
        WorldPoint worldPoint2 = regionPoint.toWorld();
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)worldPoint2);
        return collection.stream().filter(worldPoint -> {
            boolean bl;
            if (g.llIIIIIIIIIIIll(worldPoint.getPlane(), client.getPlane())) {
                bl = lIlIllIIIIIIl[1];
                0;
                if (3 != 3) {
                    return ((0xFA ^ 0x88 ^ (0xFE ^ 0xA7)) & (0x49 ^ 0x78 ^ (0x1A ^ 0) ^ -1)) != 0;
                }
            } else {
                bl = lIlIllIIIIIIl[0];
            }
            return bl;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(null);
    }

    private static boolean llIIIIIIIIIIlII(int n2) {
        return n2 != 0;
    }

    public boolean d(int n2) {
        boolean bl;
        if (g.llIIIIIIIIIIIll(this.J(), n2)) {
            bl = lIlIllIIIIIIl[1];
            0;
            if (((0x76 ^ 0x52) & ~(0x3F ^ 0x1B)) != 0) {
                return false;
            }
        } else {
            bl = lIlIllIIIIIIl[0];
        }
        return bl;
    }

    static {
        g.llIIIIIIIIIIIIl();
    }

    private static boolean llIIIIIIIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public int J() {
        WorldPoint worldPoint = this.D.getLocalPlayer().getWorldLocation();
        LocalPoint localPoint = this.D.getLocalPlayer().getLocalLocation();
        if (g.llIIIIIIIIIIlII(this.D.isInInstancedRegion() ? 1 : 0)) {
            return WorldPoint.fromLocalInstance((Client)this.D, (LocalPoint)localPoint).getRegionID();
        }
        return worldPoint.getRegionID();
    }

    /*
     * WARNING - void declaration
     */
    public boolean c(int n2) {
        void var4;
        int[] nArray = this.D.getMapRegions();
        int n3 = nArray.length;
        int var5 = lIlIllIIIIIIl[0];
        while (g.llIIIIIIIIIIIlI(var5, (int)var4)) {
            void var2;
            void var1;
            void var3 = var1[var5];
            if (g.llIIIIIIIIIIIll((int)var3, (int)var2)) {
                return lIlIllIIIIIIl[1];
            }
            ++var5;
            0;
            if ((65 + 54 - -3 + 10 ^ 118 + 33 - 88 + 65) >= 1) continue;
            return ((0x5B ^ 8 ^ (0x8D ^ 0xC7)) & (0xE8 ^ 0x8A ^ (0x35 ^ 0x4E) ^ -1)) != 0;
        }
        return lIlIllIIIIIIl[0];
    }
}

