/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.tasks.ZammyManager;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Drinking range potion")
public class DrinkingRangePotionTask
extends Task {
    private final  l aF;

    @Inject
    public DrinkingRangePotionTask(l l2) {
        this.aF = l2;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        C var9;
        if (!(this.aF.B( != 0) ? 1 : 0) || (this.aF.A( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var9.aF.z() > 1)) {
            return 0;
        }
        Item var10 = Inventory.getFirst(item -> {
            int n2;
            if (!(item.getName( == 0).toLowerCase().contains(var2[3]) ? 1 : 0) || (item.getName( != 0).toLowerCase().contains(var2[4]) ? 1 : 0)) {
                n2 = 3;
                0;
                if null != null {
                    return ((0xDE ^ 0x90) & ~(0xDA ^ 0x94)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var10 == null {
            return 0;
        }
        if ((Skills.getBoostedLevel((SkiSkill.RANGED) - Skills.getLevel((SkiSkill.RANGED) > 2)) {
            return 0;
        }
        var1_1.interact(var2[0]);
        return 3;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 0;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 0;
        while (var19 < var18) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

}

