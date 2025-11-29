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
package gg.squire.pvm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import gg.squire.pvm.tasks.PvmManager;

@TaskDesc(name="Drinking Range Potion")
public class DrinkingRangePotionTask
extends Task {
    private final  c aa;

    private final  SquireShamanConfig Z;

    private static void var3() {
        var2 = new String[var1[2]];
        o.var2[o.var1[0]] = "Drink";
    }

    static {
        o.var4();
        o.var3();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        o var5;
        if (o.var6(this.aa.s() ? 1 : 0)) {
            return var1[0];
        }
        if (o.var7(Skills.getBoostedLevel((SkiSkill.RANGED) - Skills.getLevel((SkiSkill.RANGED), var1[1])) {
            return var1[0];
        }
        Item var8 = Inventory.getFirst(var5.Z.rangePotion().u());
        if (o.var9(var8)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[0]]);
        return var1[2];
    }

    private static void var4() {
        var1 = new int[3];
        o.var1[0] = (0x26 ^ 0x1D) & ~(0xBB ^ 0x80);
        o.var1[1] = 0x83 ^ 0x85;
        o.var1[2] = 1;
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[0];
        while (o.var10(var19, var18)) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (((0x5C ^ 5 ^ (0xAB ^ 0xA4)) & (0x5D ^ 0x74 ^ 84 + 26 - 56 + 73 ^ -1)) <= 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean var7(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    @Inject
    public DrinkingRangePotionTask(SquireShamanConfig squireShamanConfig, c c2) {
        this.Z = squireShamanConfig;
        this.aa = c2;
    }
}

