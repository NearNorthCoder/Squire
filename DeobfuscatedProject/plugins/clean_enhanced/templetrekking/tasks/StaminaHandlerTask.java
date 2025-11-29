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
package gg.squire.templetrekking.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Stamina handler")
public class StaminaHandlerTask
extends Task {
    
    private final  TempleTrekkingConfig P;
    private final  TempleTrekkingPlugin O;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var2[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var2[0];
        while (p.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (1 != 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean var14(Object object) {
        return object == null;
    }

    private static void var15() {
        var1 = new String[var2[4]];
        p.var1[p.var2[0]] = "Drink";
        p.var1[p.var2[3]] = "Stamina";
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static void var16() {
        var2 = new int[5];
        p.var2[0] = (0x62 ^ 0x40) & ~(0x6E ^ 0x4C);
        p.var2[1] = 0xBB ^ 0xA5;
        p.var2[2] = 0x6A ^ 3 ^ (0xF9 ^ 0xAC);
        p.var2[3] = 1;
        p.var2[4] = 2;
    }

    static {
        p.var16();
        p.var15();
    }

    @Inject
    StaminaHandlerTask(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig) {
        this.O = templeTrekkingPlugin;
        this.P = templeTrekkingConfig;
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    private static boolean var18(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        Item item2 = Inventory.getFirst(item -> item.getName().contains(var1[var2[3]]));
        if (p.var14(item2)) {
            return var2[0];
        }
        if (p.var18(Movement.getRunEnergy(), var2[1])) {
            return var2[0];
        }
        if (p.var17(Movement.isStaminaBoosted() ? 1 : 0)) {
            return var2[0];
        }
        if (p.var12(Movement.getRunEnergy(), var2[2])) {
            void var19;
            var19.interact(var1[var2[0]]);
            return var2[3];
        }
        return var2[0];
    }
}

