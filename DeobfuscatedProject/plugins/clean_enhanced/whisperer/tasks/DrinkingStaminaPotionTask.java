/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Drinking Stamina Potion")
public class DrinkingStaminaPotionTask
extends Task {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 1;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 1;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            
            return null;
        }
        return String.valueOf(var12);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (!(Movement.isStaminaBoosted( == 0) ? 1 : 0) || (Movement.getRunEnergy() >= 0)) {
            return 1;
        }
        Item var19 = Inventory.getFirst(item -> item.getName().startsWith(var2[2]));
        if (var19 == null && (var19 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[3];
            stringArray[1] = var2[3];
            if ((item.hasAction(stringArray != 0 == null) ? 1 : 0) && (item.getName( != 0).contains(var2[4]) ? 1 : 0)) {
                n2 = 3;
                0;
                if (((158 + 151 - 153 + 33 ^ 120 + 104 - 156 + 63) & (117 + 9 - 102 + 115 ^ 17 + 162 - 6 + 8 ^ -1)) < 0) {
                    return ((0x5F ^ 0x50 ^ (0xCC ^ 0x9B)) & (136 + 76 - 92 + 89 ^ 83 + 12 - 59 + 101 ^ -1)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        }))) {
            return 1;
        }
        var1_1.interact(var2[1]);
        this.sleep(2);
        return 3;
    }
}

