/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.hydra.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import gg.squire.hydra.tasks.HydraManager;

@TaskDesc(name="Drinking range potion", priority=20)
public class DrinkingRangePotionTask
extends Task {

    private final  a at;
    private final  SquireAlchemicalHydraConfig au;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        q var11;
        if (q.var10(this.at.g() ? 1 : 0)) {
            return var2[0];
        }
        int var12 = Skills.getBoostedLevel((SkiSkill.RANGED) - Skills.getLevel((SkiSkill.RANGED);
        if (q.var13(var12, var2[1])) {
            return var2[0];
        }
        Item var14 = Inventory.getFirst(item -> {
            int n2;
            if (!q.var10(item.getName().toLowerCase().contains(var1[var2[5]]) ? 1 : 0) || q.var15(item.getName().toLowerCase().contains(var1[var2[6]]) ? 1 : 0)) {
                n2 = var2[2];
                0;
                
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (q.var16(var14)) {
            return var2[0];
        }
        if (q.var10(var14.getName().contains(var1[var2[0]]) ? 1 : 0) && q.var15(var11.au.makeDivines() ? 1 : 0)) {
            String[] stringArray = new String[var2[2]];
            stringArray[q.var2[0]] = var1[var2[2]];
            if (q.var9(Inventory.getCount((boolean)var2[2], (String[])stringArray), var2[3])) {
                String[] stringArray2 = new String[var2[2]];
                stringArray2[q.var2[0]] = var1[var2[4]];
                Inventory.getFirst((String[])stringArray2).useOn(var14);
                return var2[2];
            }
        }
        var2_2.interact(var1[var2[3]]);
        return var2[2];
    }

    private static boolean var13(int n2, int n3) {
        return n2 > n3;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    @Inject
    public DrinkingRangePotionTask(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.at = a2;
        this.au = squireAlchemicalHydraConfig;
    }

    private static boolean var15(int n2) {
        return n2 != 0;
    }

    static {
        q.var23();
        q.var24();
    }

    private static void var24() {
        var1 = new String[var2[1]];
        q.var1[q.var2[0]] = "Divine";
        q.var1[q.var2[2]] = "Crystal dust";
        q.var1[q.var2[4]] = "Crystal dust";
        q.var1[q.var2[3]] = "Drink";
        q.var1[q.var2[5]] = "ranging potion";
        q.var1[q.var2[6]] = "bastion potion";
    }

    private static boolean var16(Object object) {
        return object == null;
    }

    private static void var23() {
        var2 = new int[8];
        q.var2[0] = (0x57 ^ 0x7D) & ~(0x75 ^ 0x5F);
        q.var2[1] = 0x55 ^ 0x53;
        q.var2[2] = 1;
        q.var2[3] = 3;
        q.var2[4] = 2;
        q.var2[5] = 0x37 ^ 0x2D ^ (0xD8 ^ 0xC6);
        q.var2[6] = 0x56 ^ 0x53;
        q.var2[7] = 0xB2 ^ 0x82 ^ (0x74 ^ 0x4C);
    }
}

