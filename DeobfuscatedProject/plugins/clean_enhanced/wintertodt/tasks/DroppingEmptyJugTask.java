/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.wintertodt.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping empty jug")
public class DroppingEmptyJugTask
extends Task {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        int[] nArray = new int[0];
        nArray[1] = 2;
        if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0)) {
            return 1;
        }
        int[] nArray2 = new int[0];
        nArray2[1] = 2;
        Inventory.getFirst((int[])nArray2).interact(var1[1]);
        return 0;
    }
}

