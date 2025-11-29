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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
public class A_Unknown {
    private static /* synthetic */ int[] lIllIlllIlI;
    @Inject
    private /* synthetic */ Client ai;

    public int aj() {
        WorldPoint worldPoint = this.ai.getLocalPlayer().getWorldLocation();
        LocalPoint localPoint = this.ai.getLocalPlayer().getLocalLocation();
        if (A.lIIllIIIIIlIII(this.ai.isInInstancedRegion() ? 1 : 0)) {
            return WorldPoint.fromLocalInstance((Client)this.ai, (LocalPoint)localPoint).getRegionID();
        }
        return worldPoint.getRegionID();
    }

    public boolean j(int n2) {
        boolean bl2;
        if (A.lIIllIIIIIIlll(this.aj(), n2)) {
            bl2 = lIllIlllIlI[1];
            0;
            if (2 > 3) {
                return false;
            }
        } else {
            bl2 = lIllIlllIlI[0];
        }
        return bl2;
    }

    private static boolean lIIllIIIIIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIIIIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIllIIIIIIlIl() {
        lIllIlllIlI = new int[2];
        A.lIllIlllIlI[0] = (0x20 ^ 0x29) & ~(0x2E ^ 0x27);
        A.lIllIlllIlI[1] = 1;
    }

    public WorldPoint b(RegionPoint regionPoint) {
        Client client = Static.getClient();
        WorldPoint worldPoint2 = regionPoint.toWorld();
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)worldPoint2);
        return collection.stream().filter(worldPoint -> {
            boolean bl2;
            if (A.lIIllIIIIIIlll(worldPoint.getPlane(), client.getPlane())) {
                bl2 = lIllIlllIlI[1];
                0;
                if ((0x78 ^ 0x7C) <= 0) {
                    return false;
                }
            } else {
                bl2 = lIllIlllIlI[0];
            }
            return bl2;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(null);
    }

    /*
     * WARNING - void declaration
     */
    public boolean k(int n2) {
        void var2;
        int[] nArray = this.ai.getMapRegions();
        int n3 = nArray.length;
        int var4 = lIllIlllIlI[0];
        while (A.lIIllIIIIIIllI(var4, (int)var2)) {
            void var5;
            void var3;
            void var1 = var3[var4];
            if (A.lIIllIIIIIIlll((int)var1, (int)var5)) {
                return lIllIlllIlI[1];
            }
            ++var4;
            0;
            if (2 > 0) continue;
            return false;
        }
        return lIllIlllIlI[0];
    }

    static {
        A.lIIllIIIIIIlIl();
    }

    private static boolean lIIllIIIIIIlll(int n2, int n3) {
        return n2 == n3;
    }
}

