/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.slayer.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperConfig;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Drinking Stamina")
public class DrinkingStaminaTask
extends Task {

    private final  SquireSkipperConfig B;

    private static boolean var3(Object object) {
        return object == null;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var5(int n2, int n3) {
        return n2 > n3;
    }

    private static void var6() {
        var2 = new String[var1[3]];
        g.var2[g.var1[0]] = "Drink";
        g.var2[g.var1[2]] = "Stamina";
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    private static void var8() {
        var1 = new int[4];
        g.var1[0] = (0xE3 ^ 0x96 ^ (0x85 ^ 0xAA)) & (0x40 ^ 0x3B ^ (0xA ^ 0x2B) ^ -1);
        g.var1[1] = 11 + 108 - 51 + 77 ^ 108 + 47 - 119 + 122;
        g.var1[2] = 1;
        g.var1[3] = 2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (g.var4(this.B.sipStam() ? 1 : 0)) {
            return var1[0];
        }
        if (g.var5(Movement.getRunEnergy(), var1[1]) && g.var7(Movement.isStaminaBoosted() ? 1 : 0)) {
            return var1[0];
        }
        Item var9 = Inventory.getFirst(item -> item.getName().contains(var2[var1[2]]));
        if (g.var3(var9)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[0]]);
        return var1[2];
    }

    @Inject
    public DrinkingStaminaTask(SquireSkipperConfig squireSkipperConfig) {
        this.B = squireSkipperConfig;
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = var1[0];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = var1[0];
        while (g.var19(var18, var17)) {
            char var20 = var16[var18];
            var13.append((char)(var20 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if ((0x1A ^ 0x1F) > 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    static {
        g.var8();
        g.var6();
    }

    private static boolean var19(int n2, int n3) {
        return n2 < n3;
    }
}

