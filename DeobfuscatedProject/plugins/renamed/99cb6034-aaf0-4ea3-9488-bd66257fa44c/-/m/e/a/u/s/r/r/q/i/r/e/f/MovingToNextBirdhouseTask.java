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

import -.m.e.a.u.s.r.r.q.i.r.e.f.EEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.FEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aG_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.j_Unknown;
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

/* TASK: Moving to next birdhouse -> MovingtonextbirdhouseTask */
@TaskDesc(name="Moving to next birdhouse", priority=1)
public class MovingToNextBirdhouseTask
extends aG_Unknown {
    private static /* synthetic */ int[] llIIIIIIIlIl;

    static {
        aI.llllIIIIllIllI();
    }

    private static void llllIIIIllIllI() {
        llIIIIIIIlIl = new int[6];
        aI.llIIIIIIIlIl[0] = 0x5B ^ 0x5F;
        aI.llIIIIIIIlIl[1] = (0x47 ^ 0x26 ^ (0x50 ^ 0x7C)) & (0xE3 ^ 0xC6 ^ (0x46 ^ 0x2E) ^ -1);
        aI.llIIIIIIIlIl[2] = 1;
        aI.llIIIIIIIlIl[3] = 2;
        aI.llIIIIIIIlIl[4] = 3;
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
        void var1;
        aI var3;
        TileObject tileObject = this.cu.a(e2);
        if (aI.llllIIIIllIlll(tileObject) && aI.llllIIIIlllIII(tileObject.distanceTo((Locatable)Players.getLocal()), llIIIIIIIlIl[5])) {
            return llIIIIIIIlIl[1];
        }
        if (aI.llllIIIIlllIIl(var3.cu.c((E)var1) ? 1 : 0) && aI.llllIIIIlllIlI((Object)var3.cu.b((E)var1), (Object)F.SEEDED)) {
            return llIIIIIIIlIl[1];
        }
        Player var2 = Players.getLocal();
        if (aI.llllIIIIlllIll(var2.isAnimating() ? 1 : 0)) {
            var3.sleep(llIIIIIIIlIl[4]);
            return llIIIIIIIlIl[1];
        }
        if (aI.llllIIIIlllIll(Movement.shouldWalk() ? 1 : 0)) {
            boolean bl;
            int n2 = j.ax.contains((Object)var2.getWorldLocation().getRegionID());
            WorldPoint worldPoint = var1.az();
            if (aI.llllIIIIlllIIl(n2)) {
                bl = llIIIIIIIlIl[2];
                0;
                
                }
            } else {
                bl = llIIIIIIIlIl[1];
            }
            Movement.walkTo((WorldPoint)worldPoint, (boolean)bl);
            0;
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

