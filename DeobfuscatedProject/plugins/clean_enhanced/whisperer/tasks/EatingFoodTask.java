/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Eating food")
public class EatingFoodTask
extends WhispererTaskBase {

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        void var1_1;
        if ((Combat.getCurrentHealth() > this.i.eatAt())) {
            return 0;
        }
        Item var3 = Inventory.getFirst(item -> item.hasAction(var2[1]::equals));
        if var3 == null {
            return 0;
        }
        var1_1.interact(var2[0]);
        return 1;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }
}

