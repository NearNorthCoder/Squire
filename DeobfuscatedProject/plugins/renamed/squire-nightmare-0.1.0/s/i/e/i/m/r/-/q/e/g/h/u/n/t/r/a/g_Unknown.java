/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.Comparator;
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
    @Inject
    private /* synthetic */ Client bv;
    private static /* synthetic */ int[] llllIlIIllIl;

    /*
     * WARNING - void declaration
     */
    public boolean l(int n2) {
        void var3;
        int[] nArray = this.bv.getMapRegions();
        int n3 = nArray.length;
        int var2 = llllIlIIllIl[0];
        while (g.lIIlIIIIlIIllll(var2, (int)var3)) {
            void var4;
            void var5;
            void var1 = var5[var2];
            if (g.lIIlIIIIlIlIIII((int)var1, (int)var4)) {
                return llllIlIIllIl[1];
            }
            ++var2;
            0;
            if (1 != 0) continue;
            return false;
        }
        return llllIlIIllIl[0];
    }

    private static boolean lIIlIIIIlIlIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIlIIIIlIIlllI() {
        llllIlIIllIl = new int[2];
        g.llllIlIIllIl[0] = (0x17 ^ 0x45) & ~(0x54 ^ 6);
        g.llllIlIIllIl[1] = 1;
    }

    public int aE() {
        WorldPoint worldPoint = this.bv.getLocalPlayer().getWorldLocation();
        LocalPoint localPoint = this.bv.getLocalPlayer().getLocalLocation();
        if (g.lIIlIIIIlIlIIlI(this.bv.isInInstancedRegion() ? 1 : 0)) {
            return WorldPoint.fromLocalInstance((Client)this.bv, (LocalPoint)localPoint).getRegionID();
        }
        return worldPoint.getRegionID();
    }

    private static boolean lIIlIIIIlIIllll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        g.lIIlIIIIlIIlllI();
    }

    private static boolean lIIlIIIIlIlIIlI(int n2) {
        return n2 != 0;
    }

    public boolean m(int n2) {
        boolean bl;
        if (g.lIIlIIIIlIlIIII(this.aE(), n2)) {
            bl = llllIlIIllIl[1];
            0;
            if (((0x3E ^ 0x2B) & ~(0x1B ^ 0xE)) != 0) {
                return false;
            }
        } else {
            bl = llllIlIIllIl[0];
        }
        return bl;
    }

    public WorldPoint a(RegionPoint regionPoint) {
        Client client = Static.getClient();
        WorldPoint worldPoint2 = regionPoint.toWorld();
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)worldPoint2);
        return collection.stream().filter(worldPoint -> {
            boolean bl;
            if (g.lIIlIIIIlIlIIII(worldPoint.getPlane(), client.getPlane())) {
                bl = llllIlIIllIl[1];
                0;
                if (-2 > 0) {
                    return false;
                }
            } else {
                bl = llllIlIIllIl[0];
            }
            return bl;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(null);
    }
}

