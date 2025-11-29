/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zulrah.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Using imbued heart", priority=5)
public class UsingImbuedHeartTask
extends Task {
    
    @Inject
    private  SquireZulrah E;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if ((this.E.d( != 0) ? 1 : 0)) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        nArray[3] = 4;
        Item var3 = Inventory.getFirst((int[])nArray);
        if var3 == null {
            return 0;
        }
        int var4 = Vars.getBit((int)5);
        if (var4 > 0) {
            return 0;
        }
        var1_1.interact(var2[0]);
        return 3;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }
}

