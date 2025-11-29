/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zulrah.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Equipping recoil ring", priority=0x7FFFFFFE, blocking=true)
public class EquippingRecoilRingTask
extends Task {

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        Item item = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.RING);
        if (item != null && (item.getId() == 0)) {
            return 1;
        }
        int[] nArray = new int[2];
        nArray[1] = 0;
        Item var3 = Inventory.getFirst((int[])nArray);
        if var3 == null {
            return 1;
        }
        var2_2.interact(var2[1]);
        return 2;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }
}

