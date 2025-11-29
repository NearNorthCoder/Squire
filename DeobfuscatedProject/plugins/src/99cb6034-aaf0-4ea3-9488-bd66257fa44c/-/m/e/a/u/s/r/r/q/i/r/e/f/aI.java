/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.E;
import -.m.e.a.u.s.r.r.q.i.r.e.f.F;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aG;
import -.m.e.a.u.s.r.r.q.i.r.e.f.j;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Moving to next birdhouse", priority=1)
public class aI
extends aG {
    private static /* synthetic */ int[] llIIIIIIIlIl;

    static {
        aI.llllIIIIllIllI();
    }

    private static void llllIIIIllIllI() {
        llIIIIIIIlIl = new int[6];
        aI.llIIIIIIIlIl[0] = 0x5B ^ 0x5F;
        aI.llIIIIIIIlIl[1] = (0x47 ^ 0x26 ^ (0x50 ^ 0x7C)) & (0xE3 ^ 0xC6 ^ (0x46 ^ 0x2E) ^ -" ".length());
        aI.llIIIIIIIlIl[2] = " ".length();
        aI.llIIIIIIIlIl[3] = "  ".length();
        aI.llIIIIIIIlIl[4] = "   ".length();
        aI.llIIIIIIIlIl[5] = 0x42 ^ 0x52;
    }

    @Inject
    protected aI(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, j j2) {
        F[] fArray = new F[llIIIIIIIlIl[0]];
        fArray[aI.llIIIIIIIlIl[1]] = F.EMPTY;
        fArray[aI.llIIIIIIIlIl[2]] = F.BUILT;
        fArray[aI.llIIIIIIIlIl[3]] = F.SEEDED;
        fArray[aI.llIIIIIIIlIl[4]] = F.UNKNOWN;
        super(squireFarmer, squireFarmerConfig, j2, fArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean f(E e2) {
        void lllllllllllllllIlIlIlllIIIlIllII;
        aI lllllllllllllllIlIlIlllIIIlIllIl;
        TileObject tileObject = this.cu.a(e2);
        if (aI.llllIIIIllIlll(tileObject) && aI.llllIIIIlllIII(tileObject.distanceTo((Locatable)Players.getLocal()), llIIIIIIIlIl[5])) {
            return llIIIIIIIlIl[1];
        }
        if (aI.llllIIIIlllIIl(lllllllllllllllIlIlIlllIIIlIllIl.cu.c((E)lllllllllllllllIlIlIlllIIIlIllII) ? 1 : 0) && aI.llllIIIIlllIlI((Object)lllllllllllllllIlIlIlllIIIlIllIl.cu.b((E)lllllllllllllllIlIlIlllIIIlIllII), (Object)F.SEEDED)) {
            return llIIIIIIIlIl[1];
        }
        Player lllllllllllllllIlIlIlllIIIlIlIlI = Players.getLocal();
        if (aI.llllIIIIlllIll(lllllllllllllllIlIlIlllIIIlIlIlI.isAnimating() ? 1 : 0)) {
            lllllllllllllllIlIlIlllIIIlIllIl.sleep(llIIIIIIIlIl[4]);
            return llIIIIIIIlIl[1];
        }
        if (aI.llllIIIIlllIll(Movement.shouldWalk() ? 1 : 0)) {
            boolean bl;
            int n2 = j.ax.contains((Object)lllllllllllllllIlIlIlllIIIlIlIlI.getWorldLocation().getRegionID());
            WorldPoint worldPoint = lllllllllllllllIlIlIlllIIIlIllII.az();
            if (aI.llllIIIIlllIIl(n2)) {
                bl = llIIIIIIIlIl[2];
                "".length();
                if (null != null) {
                    return ((0xD7 ^ 0x85 ^ (0xCF ^ 0xBC)) & (6 ^ 0x73 ^ (0xF4 ^ 0xA0) ^ -" ".length())) != 0;
                }
            } else {
                bl = llIIIIIIIlIl[1];
            }
            Movement.walkTo((WorldPoint)worldPoint, (boolean)bl);
            "".length();
        }
        return llIIIIIIIlIl[2];
    }

    private static boolean llllIIIIlllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llllIIIIlllIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllIIIIllIlll(Object object) {
        return object != null;
    }

    private static boolean llllIIIIlllIll(int n2) {
        return n2 != 0;
    }

    private static boolean llllIIIIlllIII(int n2, int n3) {
        return n2 <= n3;
    }
}

