/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.fishing.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Opening the barrel")
public class OpeningTheBarrelTask
extends Task {
    private static final  int M;
    private final  SquireFisherConfig N;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        i.var9();
        i.var10();
        M = 3;
    }

    public boolean run() {
        i var11;
        if ((this.N.fishBarrel( == 0) ? 1 : 0)) {
            return 0;
        }
        if (!(var11.N.fishingTrawler( == 0) ? 1 : 0) || (var11.N.fish( != 0).h().equals(var1[0]) ? 1 : 0)) {
            return 0;
        }
        if ((Bank.isOpen( != 0) ? 1 : 0)) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        Item var12 = Inventory.getFirst((int[])nArray);
        if var12 != null {
            var12.interact(var1[1]);
            return 1;
        }
        return 0;
    }

    @Inject
    public OpeningTheBarrelTask(SquireFisherConfig squireFisherConfig) {
        this.N = squireFisherConfig;
    }

}

