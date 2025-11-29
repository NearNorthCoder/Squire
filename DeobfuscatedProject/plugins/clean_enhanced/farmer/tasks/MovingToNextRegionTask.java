/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.farmer.tasks;

import -.m.e.a.u.s.r.r.q.i.r.e.f.az;
import gg.squire.farmer.tasks.FarmerManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Moving to next region", priority=25, blocking=true)
public class MovingToNextRegionTask
extends az {

    @Inject
    public MovingToNextRegionTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        void var9;
        bc var10;
        Player player = Players.getLocal();
        if (!player != null || (player.isAnimating( != 0) ? 1 : 0)) {
            return 0;
        }
        WorldPoint var11 = var10.bR.u();
        WorldPoint var12 = var9.getWorldLocation();
        if (!var11 != null || (var10.bR.blllllllllllllllIlIlIlIIlllIllIll)) {
            return 0;
        }
        if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
            int[] nArray = new int[1];
            nArray[0] = 2;
            Item var13 = Inventory.getFirst((int[])nArray);
            if var13 != null {
                var13.interact(var1[0]);
            }
            return 1;
        }
        Movement.walkTo((WorldPoint)var2_2);
        0;
        return 1;
    }
}

