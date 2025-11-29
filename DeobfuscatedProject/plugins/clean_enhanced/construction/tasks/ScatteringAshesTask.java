/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Scattering ashes", priority=9990)
public class ScatteringAshesTask
extends Task {
    private static  String[] llIlIIl;
    private static  int[] llIlIlI;
    private final  SquireCerberusConfig aL;

        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if ((this.aL.scatterAshes( == 0) ? 1 : 0)) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        Item var6 = Inventory.getFirst((int[])nArray);
        if var6 == null {
            return 0;
        }
        var1_1.interact(llIlIIl[0]);
        return 1;
    }

    @Inject
    public ScatteringAshesTask(SquireCerberusConfig squireCerberusConfig) {
        this.aL = squireCerberusConfig;
    }
}

