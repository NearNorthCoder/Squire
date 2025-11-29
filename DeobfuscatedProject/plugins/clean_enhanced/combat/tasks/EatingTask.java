/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.combat.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating", priority=130)
public class EatingTask
extends Task {

    private final  SquireBlueDragonKillerConfig C;

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
        if ((h.var9(Combat.getHealthPercent( > 0), this.C.eatAt()))) {
            return 0;
        }
        Item var10 = Inventory.getFirst(item -> {
            String[] stringArray = new String[2];
            stringArray[0] = var1[2];
            return item.hasAction(stringArray);
        });
        if var10 == null {
            return 0;
        }
        var1_1.interact(var1[0]);
        this.sleep(1);
        return 2;
    }

    @Inject
    public EatingTask(SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.C = squireBlueDragonKillerConfig;
    }

    private static int var9(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }
}

