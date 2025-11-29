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

import gg.squire.farmer.tasks.GameEnum20;
import gg.squire.farmer.tasks.GameEnum15;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aG;
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
extends aG {

    static {
        aI.var2();
    }

    @Inject
    protected MovingToNextBirdhouseTask(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, j j2) {
        F[] fArray = new F[0];
        fArray[1] = F.EMPTY;
        fArray[2] = F.BUILT;
        fArray[3] = F.SEEDED;
        fArray[4] = F.UNKNOWN;
        super(squireFarmer, squireFarmerConfig, j2, fArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean f(E e2) {
        void var3;
        aI var4;
        TileObject tileObject = this.cu.a(e2);
        if (tileObject != null && (tileObject.distanceTo((Locatable)Players.getLocal()) <= 5)) {
            return 1;
        }
        if ((var4.cu.c((E == 0)var3) ? 1 : 0) && ((Object)var4.cu.b((E)var3) == (Object)var4.cu.b((E)var3)2)F.SEEDED)) {
            return 1;
        }
        Player var5 = Players.getLocal();
        if ((var5.isAnimating( != 0) ? 1 : 0)) {
            var4.sleep(4);
            return 1;
        }
        if ((Movement.shouldWalk( != 0) ? 1 : 0)) {
            boolean bl;
            int n2 = j.ax.contains((Object)var5.getWorldLocation().getRegionID());
            WorldPoint worldPoint = var3.az();
            if (n2 == 0) {
                bl = 2;
                0;
                if null != null {
                    return ((0xD7 ^ 0x85 ^ (0xCF ^ 0xBC)) & (6 ^ 0x73 ^ (0xF4 ^ 0xA0) ^ -1)) != 0;
                }
            } else {
                bl = 1;
            }
            Movement.walkTo((WorldPoint)worldPoint, (boolean)bl);
            0;
        }
        return 2;
    }

}

