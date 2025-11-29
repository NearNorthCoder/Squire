/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Prep Farming", priority=21002, blocking=true)
public class PrepFarmingTask
extends CoxManager {
    private final  int ek = 7603;
    
    private final  int ej = 29742;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var2_2;
        void var1_1;
        int[] nArray = new int[2];
        nArray[3] = 4;
        if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0)) {
            return 3;
        }
        int[] nArray2 = new int[2];
        nArray2[3] = 5;
        Item var2 = Inventory.getFirst((int[])nArray2);
        if var2 == null {
            return 3;
        }
        int[] nArray3 = new int[2];
        nArray3[3] = 6;
        TileObject var3 = TileObjects.getNearest((int[])nArray3);
        if var3 == null {
            return 3;
        }
        var1_1.useOn((TileObject)var2_2);
        return 2;
    }

    @Inject
    protected PrepFarmingTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.ej = 0;
        this.ek = 1;
    }

    static {
        bf.var4();
    }
}

