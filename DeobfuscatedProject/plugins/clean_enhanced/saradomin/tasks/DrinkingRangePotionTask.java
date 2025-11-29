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
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import gg.squire.saradomin.tasks.SaradominManager;

@TaskDesc(name="Drinking range potion")
public class DrinkingRangePotionTask
extends Task {
    private final  g aP;

    private static void var3() {
        var2 = new int[7];
        H.var2[0] = (0x48 ^ 0x29) & ~(0xF ^ 0x6E);
        H.var2[1] = 0x3C ^ 0x28;
        H.var2[2] = 0xB3 ^ 0xB5;
        H.var2[3] = 1;
        H.var2[4] = 2;
        H.var2[5] = 3;
        H.var2[6] = 0x51 ^ 0x26 ^ 100 + 28 - 64 + 63;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        H var4;
        if (!H.var5(this.aP.m() ? 1 : 0) || H.var5(this.aP.l() ? 1 : 0)) {
            return var2[0];
        }
        if (H.var6(var4.aP.k(), var2[1])) {
            return var2[0];
        }
        if (H.var7(var4.aP.t()) && H.var5(var4.aP.t().B() ? 1 : 0)) {
            return var2[0];
        }
        Item var8 = Inventory.getFirst(item -> {
            int n2;
            if (!H.var9(item.getName().toLowerCase().contains(var1[var2[3]]) ? 1 : 0) || H.var5(item.getName().toLowerCase().contains(var1[var2[4]]) ? 1 : 0)) {
                n2 = var2[3];
                0;
                if (1 != 1) {
                    return ((110 + 96 - 203 + 135 ^ 30 + 7 - 3 + 144) & (9 ^ 0x16 ^ (0x7B ^ 0x5C) ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (H.var10(var8)) {
            return var2[0];
        }
        if (H.var6(Skills.getBoostedLevel((SkiSkill.RANGED) - Skills.getLevel((SkiSkill.RANGED), var2[2])) {
            return var2[0];
        }
        var1_1.interact(var1[var2[0]]);
        return var2[3];
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }

    private static boolean var7(Object object) {
        return object != null;
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    @Inject
    public DrinkingRangePotionTask(g g2) {
        this.aP = g2;
    }

    static {
        H.var3();
        H.var12();
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean var6(int n2, int n3) {
        return n2 > n3;
    }

    private static void var12() {
        var1 = new String[var2[5]];
        H.var1[H.var2[0]] = "Drink";
        H.var1[H.var2[3]] = "ranging";
        H.var1[H.var2[4]] = "bastion";
    }

    private static String var19(String var20, String var21) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var24 = var2[0];
        char[] var25 = var20.toCharArray();
        int var26 = var25.length;
        int var27 = var2[0];
        while (H.var11(var27, var26)) {
            char var28 = var25[var27];
            var22.append((char)(var28 ^ var23[var24 % var23.length]));
            0;
            ++var24;
            ++var27;
            0;
            
            return null;
        }
        return String.valueOf(var22);
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }
}

