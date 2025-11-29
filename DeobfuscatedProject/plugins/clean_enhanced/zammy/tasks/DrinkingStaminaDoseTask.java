/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.tasks.CHelper;
import gg.squire.zammy.tasks.ZammyManager;
import gg.squire.zammy.tasks.ZammyManager;
import gg.squire.zammy.tasks.MovingToNextTileTask;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Drinking stamina dose", priority=8)
public class DrinkingStaminaDoseTask
extends Task {
    
    private final  f U;
    private final  l S;
    private final  c T;
    private final  u V;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        q var9;
        if (!(this.S.B( != 0) ? 1 : 0) || (this.S.G( == 0) ? 1 : 0)) {
            return 0;
        }
        if (!(var9.S.A( != 0) ? 1 : 0) || (var9.T.e( != null))) {
            return 0;
        }
        if (!(Movement.getRunEnergy() < 1) || (Movement.isStaminaBoosted( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var9.V.O( != 0) ? 1 : 0)) {
            return 0;
        }
        Item var10 = Inventory.getFirst(item -> item.getName().startsWith(var1[3]));
        if (!var10 != null || (var9.U.u( == 0) ? 1 : 0)) {
            return 0;
        }
        var1_1.interact(var1[0]);
        this.U.r();
        this.sleep(2);
        return 3;
    }

    @Inject
    public DrinkingStaminaDoseTask(l l2, c c2, f f2, u u2) {
        this.S = l2;
        this.T = c2;
        this.U = f2;
        this.V = u2;
    }

}

