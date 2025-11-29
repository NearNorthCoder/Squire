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
package gg.squire.zulrah.tasks;

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
public class ZulrahManager {
    
    @Inject
    private  Client z;

    private static boolean llIIlIIlIlIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIIlIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean g(int n2) {
        void var1;
        int[] nArray = this.z.getMapRegions();
        int n3 = nArray.length;
        int var2 = lIllIllIlllII[0];
        while (u.llIIlIIlIlIIlIl(var2, (int)var1)) {
            void var3;
            void var4;
            void var5 = var4[var2];
            if (u.llIIlIIlIlIIllI((int)var5, (int)var3)) {
                return lIllIllIlllII[1];
            }
            ++var2;

            if ((0x58 ^ 0x50 ^ (0x1E ^ 0x12)) >= 0) continue;
            return ((0xEE ^ 0xC3 ^ (0x54 ^ 0x20)) & (107 + 127 - 148 + 106 ^ 3 + 114 - -27 + 9 ^ -1)) != 0;
        }
        return lIllIllIlllII[0];
    }

    public boolean h(int n2) {
        boolean bl;
        if (u.llIIlIIlIlIIllI(this.Q(), n2)) {
            bl = lIllIllIlllII[1];

            if (-1 >= (74 + 120 - 161 + 104 ^ 118 + 125 - 161 + 59)) {
                return ((0xD4 ^ 0x85 ^ (0xE7 ^ 0x99)) & (0x26 ^ 0x3E ^ (0x9E ^ 0xA9) ^ -1)) != 0;
            }
        } else {
            bl = lIllIllIlllII[0];
        }
        return bl;
    }

    public WorldPoint a(RegionPoint regionPoint) {
        Client client = Static.getClient();
        WorldPoint worldPoint2 = regionPoint.toWorld();
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)worldPoint2);
        return collection.stream().filter(worldPoint -> {
            boolean bl;
            if (u.llIIlIIlIlIIllI(worldPoint.getPlane(), client.getPlane())) {
                bl = lIllIllIlllII[1];

                if ((0x6D ^ 0x69) != (0x5E ^ 0x5A)) {
                    return false;
                }
            } else {
                bl = lIllIllIlllII[0];
            }
            return bl;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(null);
    }

    public int Q() {
        WorldPoint worldPoint = this.z.getLocalPlayer().getWorldLocation();
        LocalPoint localPoint = this.z.getLocalPlayer().getLocalLocation();
        if (u.llIIlIIlIlIIlll(this.z.isInInstancedRegion() ? 1 : 0)) {
            return WorldPoint.fromLocalInstance((Client)this.z, (LocalPoint)localPoint).getRegionID();
        }
        return worldPoint.getRegionID();
    }

    static {
        u.llIIlIIlIlIIlII();
    }

    private static boolean llIIlIIlIlIIllI(int n2, int n3) {
        return n2 == n3;
    }

}

