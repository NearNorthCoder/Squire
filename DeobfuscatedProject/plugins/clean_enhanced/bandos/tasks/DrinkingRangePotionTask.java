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
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import gg.squire.bandos.tasks.BandosManager;

@TaskDesc(name="Drinking range potion")
public class DrinkingRangePotionTask
extends Task {

    private final  e ax;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    @Inject
    public DrinkingRangePotionTask(e e2) {
        this.ax = e2;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var12(Object object) {
        return object == null;
    }

    private static void var13() {
        var1 = new String[var2[5]];
        x.var1[x.var2[0]] = "Drink";
        x.var1[x.var2[3]] = "ranging";
        x.var1[x.var2[4]] = "bastion";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        x var14;
        if (!x.var3(this.ax.t() ? 1 : 0) || x.var3(this.ax.s() ? 1 : 0)) {
            return var2[0];
        }
        if (x.var11(var14.ax.r(), var2[1])) {
            return var2[0];
        }
        Item var15 = Inventory.getFirst(item -> {
            int n2;
            if (!x.var4(item.getName().toLowerCase().contains(var1[var2[3]]) ? 1 : 0) || x.var3(item.getName().toLowerCase().contains(var1[var2[4]]) ? 1 : 0)) {
                n2 = var2[3];
                0;
                if ((0xAB ^ 0xAF) < 3) {
                    return ((0x5D ^ 0x1B) & ~(0x39 ^ 0x7F)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (x.var12(var15)) {
            return var2[0];
        }
        if (x.var11(Skills.getBoostedLevel((SkiSkill.RANGED) - Skills.getLevel((SkiSkill.RANGED), var2[2])) {
            return var2[0];
        }
        var1_1.interact(var1[var2[0]]);
        return var2[3];
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    static {
        x.var22();
        x.var13();
    }

    private static void var22() {
        var2 = new int[7];
        x.var2[0] = (0xD9 ^ 0x87 ^ (0x1A ^ 0x43)) & (0x13 ^ 0x2B ^ (0x14 ^ 0x2B) ^ -1);
        x.var2[1] = 0x94 ^ 0x91;
        x.var2[2] = 0x14 ^ 0x12;
        x.var2[3] = 1;
        x.var2[4] = 2;
        x.var2[5] = 3;
        x.var2[6] = 0x9A ^ 0x95 ^ (0x43 ^ 0x44);
    }
}

