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
public class A {
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
            "".length();
            if ("  ".length() > "   ".length()) {
                return ((0x2E ^ 0x3E) & ~(0xBE ^ 0xAE)) != 0;
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
        A.lIllIlllIlI[1] = " ".length();
    }

    public WorldPoint b(RegionPoint regionPoint) {
        Client client = Static.getClient();
        WorldPoint worldPoint2 = regionPoint.toWorld();
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)worldPoint2);
        return collection.stream().filter(worldPoint -> {
            boolean bl2;
            if (A.lIIllIIIIIIlll(worldPoint.getPlane(), client.getPlane())) {
                bl2 = lIllIlllIlI[1];
                "".length();
                if ((0x78 ^ 0x7C) <= 0) {
                    return ((0x74 ^ 0x7F) & ~(0x74 ^ 0x7F)) != 0;
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
        void llllllllllllllllIlIIlllllIllllll;
        int[] nArray = this.ai.getMapRegions();
        int n3 = nArray.length;
        int llllllllllllllllIlIIlllllIlllllI = lIllIlllIlI[0];
        while (A.lIIllIIIIIIllI(llllllllllllllllIlIIlllllIlllllI, (int)llllllllllllllllIlIIlllllIllllll)) {
            void llllllllllllllllIlIIllllllIIIIIl;
            void llllllllllllllllIlIIllllllIIIIII;
            void llllllllllllllllIlIIlllllIllllIl = llllllllllllllllIlIIllllllIIIIII[llllllllllllllllIlIIlllllIlllllI];
            if (A.lIIllIIIIIIlll((int)llllllllllllllllIlIIlllllIllllIl, (int)llllllllllllllllIlIIllllllIIIIIl)) {
                return lIllIlllIlI[1];
            }
            ++llllllllllllllllIlIIlllllIlllllI;
            "".length();
            if ("  ".length() > 0) continue;
            return ((0xF9 ^ 0xB1) & ~(0xF6 ^ 0xBE)) != 0;
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

