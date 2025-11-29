/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum22;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;

@TaskDesc(name="Picking up seaweed spores", priority=0x7FFFFFFF, blocking=true)
public class PickingUpSeaweedSporesTask
extends Task {
    
    private final  SquireFarmerConfig cT;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public PickingUpSeaweedSporesTask(SquireFarmerConfig squireFarmerConfig) {
        this.cT = squireFarmerConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if ((this.cT.fossil_island_underwaterSpores( == 0) ? 1 : 0)) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        TileItem var9 = TileItems.getNearest((int[])nArray);
        if (!var9 != null || (var9.getWorldLocation().getRegionID() != p.FOSSIL_ISLAND_UNDERWATER.X())) {
            return 0;
        }
        var1_1.interact(var1[0]);
        return 1;
    }

}

