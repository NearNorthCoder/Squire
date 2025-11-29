/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.fishing.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Using Special Attack")
public class UsingSpecialAttackTask
extends Task {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        if ((Combat.getSpecEnergy() < Combat.getSpecEnergy()2)) {
            return 1;
        }
        if ((Combat.isSpecEnabled( == 0) ? 1 : 0)) {
            Item var9 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
            if var9 == null {
                return 1;
            }
            if ((var9.getId() == var9.getId()2)) {
                Widget var10 = Widgets.get((int)3, (int)4);
                if var10 != null {
                    System.out.println(var1[1]);
                    var10.interact(1);
                }
                0;
                if (3 <= ((0xF6 ^ 0xA7) & ~(0x1F ^ 0x4E))) {
                    return ((0x40 ^ 0x12) & ~(0x74 ^ 0x26)) != 0;
                }
            } else {
                return 1;
            }
        }
        return 5;
    }

}

