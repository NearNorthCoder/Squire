/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Prep Dropping Tools", priority=21000, blocking=true)
public class PrepDroppingToolsTask
extends CoxManager {

    @Override
    public boolean dY() {
        if (!(this.cq() >= this.el) || (this.cp() < this.ee())) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        nArray[3] = 4;
        nArray[5] = 6;
        nArray[7] = 8;
        nArray[9] = var1[10];
        nArray[aZ.var1[11]] = var1[12];
        nArray[aZ.var1[13]] = var1[14];
        nArray[aZ.var1[15]] = var1[16];
        nArray[aZ.var1[17]] = var1[18];
        nArray[aZ.var1[19]] = var1[20];
        if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0)) {
            return 0;
        }
        int[] nArray2 = new int[1];
        nArray2[0] = 2;
        nArray2[3] = 4;
        nArray2[5] = 6;
        nArray2[7] = 8;
        nArray2[9] = var1[10];
        nArray2[aZ.var1[11]] = var1[12];
        nArray2[aZ.var1[13]] = var1[14];
        nArray2[aZ.var1[15]] = var1[16];
        nArray2[aZ.var1[17]] = var1[18];
        nArray2[aZ.var1[19]] = var1[20];
        Inventory.dropAll((int[])nArray2);
        0;
        return 3;
    }

    static {
        aZ.var2();
    }

    @Inject
    protected PrepDroppingToolsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

}

