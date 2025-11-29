/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum4;
import -.m.e.a.u.s.r.r.q.i.r.e.f.az;
import gg.squire.farmer.tasks.FarmerManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Picking up produce", priority=6, blocking=true)
public class PickingUpProduceTask
extends az {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public PickingUpProduceTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = au.LIMPWURT.au();
        List var9 = TileItems.getAll((int[])nArray);
        if ((var9.isEmpty( != 0) ? 1 : 0)) {
            return 0;
        }
        ((TileItem)var1_1.get(0)).interact(var2[0]);
        return 1;
    }
}

