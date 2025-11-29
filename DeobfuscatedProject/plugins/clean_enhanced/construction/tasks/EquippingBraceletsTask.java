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
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Equipping bracelets")
public class EquippingBraceletsTask
extends Task {
    private static  String[] lllIllIll;
    private static  int[] lllIlllII;

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        Item item = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.GLOVES);
        if (item != null && (item.getName( != null))) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        nArray[3] = 4;
        Item var7 = Inventory.getFirst((int[])nArray);
        if var7 == null {
            return 0;
        }
        String[] stringArray = new String[5];
        stringArray[0] = lllIllIll[0];
        stringArray[3] = lllIllIll[3];
        stringArray[1] = lllIllIll[1];
        var2_2.interact(stringArray);
        return 3;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

}

