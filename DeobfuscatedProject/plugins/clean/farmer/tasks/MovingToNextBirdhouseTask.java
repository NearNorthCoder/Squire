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
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum60;
import gg.squire.farmer.tasks.GameEnum40;
import gg.squire.farmer.tasks.FarmerTaskBase;
import gg.squire.farmer.tasks.FarmerManager;
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
public class MovingToNextBirdhouseTask
extends FarmerTaskBase {

    static {
        aI.llllIIIIllIllI();
    }

    @Inject
    protected MovingToNextBirdhouseTask(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, j j2) {
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
        aI var2;
        TileObject tileObject = this.cu.a(e2);
        if (aI.llllIIIIllIlll(tileObject) && aI.llllIIIIlllIII(tileObject.distanceTo((Locatable)Players.getLocal()), llIIIIIIIlIl[5])) {
            return llIIIIIIIlIl[1];
        }
        if (aI.llllIIIIlllIIl(var2.cu.c((GameEnum60) ar1) ? 1 : 0) && aI.llllIIIIlllIlI((Object)var2.cu.b((GameEnum60) ar1), (Object)F.SEEDED)) {
            return llIIIIIIIlIl[1];
        }
        Player var3 = Players.getLocal();
        if (aI.llllIIIIlllIll(var3.isAnimating() ? 1 : 0)) {
            var2.sleep(llIIIIIIIlIl[4]);
            return llIIIIIIIlIl[1];
        }
        if (aI.llllIIIIlllIll(Movement.shouldWalk() ? 1 : 0)) {
            boolean bl;
            int n2 = j.ax.contains((Object)var3.getWorldLocation().getRegionID());
            WorldPoint worldPoint = var1.az();
            if (aI.llllIIIIlllIIl(n2)) {
                bl = llIIIIIIIlIl[2];

                }
            } else {
                bl = llIIIIIIIlIl[1];
            }
            Movement.walkTo((WorldPoint)worldPoint, (boolean)bl);

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

