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
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

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
public class c {
    private static /* synthetic */ int[] lIlIllIlIIIlI;
    @Inject
    private /* synthetic */ Client j;

    private static boolean llIIIIIlIIIIIll(int n2) {
        return n2 != 0;
    }

    private static void llIIIIIlIIIIIII() {
        lIlIllIlIIIlI = new int[2];
        c.lIlIllIlIIIlI[0] = (0x2F ^ 0x4C) & ~(0xA7 ^ 0xC4);
        c.lIlIllIlIIIlI[1] = 1;
    }

    public WorldPoint a(RegionPoint regionPoint) {
        Client client = Static.getClient();
        WorldPoint worldPoint2 = regionPoint.toWorld();
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)worldPoint2);
        return collection.stream().filter(worldPoint -> {
            boolean bl;
            if (c.llIIIIIlIIIIIlI(worldPoint.getPlane(), client.getPlane())) {
                bl = lIlIllIlIIIlI[1];
                0;
                if ((0xF8 ^ 0x8F ^ (0xFB ^ 0x88)) > (0x21 ^ 0x61 ^ (0x68 ^ 0x2C))) {
                    return ((0xAC ^ 0x9C ^ (0xDE ^ 0xA4)) & (0xF1 ^ 0x84 ^ (8 ^ 0x37) ^ -1)) != 0;
                }
            } else {
                bl = lIlIllIlIIIlI[0];
            }
            return bl;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(null);
    }

    public int d() {
        WorldPoint worldPoint = this.j.getLocalPlayer().getWorldLocation();
        LocalPoint localPoint = this.j.getLocalPlayer().getLocalLocation();
        if (c.llIIIIIlIIIIIll(this.j.isInInstancedRegion() ? 1 : 0)) {
            return WorldPoint.fromLocalInstance((Client)this.j, (LocalPoint)localPoint).getRegionID();
        }
        return worldPoint.getRegionID();
    }

    static {
        c.llIIIIIlIIIIIII();
    }

    private static boolean llIIIIIlIIIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIIIlIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(int n2) {
        void var3;
        int[] nArray = this.j.getMapRegions();
        int n3 = nArray.length;
        int var1 = lIlIllIlIIIlI[0];
        while (c.llIIIIIlIIIIIIl(var1, (int)var3)) {
            void var4;
            void var5;
            void var2 = var5[var1];
            if (c.llIIIIIlIIIIIlI((int)var2, (int)var4)) {
                return lIlIllIlIIIlI[1];
            }
            ++var1;
            0;
            if (-3 < 0) continue;
            return false;
        }
        return lIlIllIlIIIlI[0];
    }

    public boolean c(int n2) {
        boolean bl;
        if (c.llIIIIIlIIIIIlI(this.d(), n2)) {
            bl = lIlIllIlIIIlI[1];
            0;
            if (2 > 2) {
                return ((0x96 ^ 0xBB ^ (0xEA ^ 0x9E)) & (0x84 ^ 0xAC ^ (0xEC ^ 0x9D) ^ -1)) != 0;
            }
        } else {
            bl = lIlIllIlIIIlI[0];
        }
        return bl;
    }
}

