/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Drinking stamina", priority=100)
public class DrinkingStaminaTask
extends AutotoaManager {

    private static void var3() {
        var2 = new String[var1[4]];
        ai.var2[ai.var1[0]] = "Drink";
        ai.var2[ai.var1[3]] = "Stamina";
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var1[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var1[0];
        while (ai.var13(var12, var11)) {
            char var14 = var10[var12];
            var7.append((char)(var14 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (((0xE7 ^ 0xB4 ^ (0x15 ^ 2)) & (0x4E ^ 0x50 ^ (0x4B ^ 0x11) ^ -1)) > -1) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    static {
        ai.var15();
        ai.var3();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (ai.var16(Movement.isStaminaBoosted() ? 1 : 0)) {
            return var1[0];
        }
        if (ai.var17(Vars.getBit((int)var1[1]))) {
            return var1[0];
        }
        Item var18 = Inventory.getFirst(item -> item.getName().startsWith(var2[var1[3]]));
        if (ai.var19(var18)) {
            return var1[0];
        }
        if (ai.var20(Movement.getRunEnergy(), var1[2])) {
            return var1[0];
        }
        var1_1.interact(var2[var1[0]]);
        return var1[3];
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static boolean var17(int n2) {
        return n2 > 0;
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var20(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var16(int n2) {
        return n2 != 0;
    }

    private static boolean var19(Object object) {
        return object == null;
    }

    private static void var15() {
        var1 = new int[6];
        ai.var1[0] = (0xC4 ^ 0x84) & ~(0xCB ^ 0x8B);
        ai.var1[1] = 0xFFFFBC2B & 0x7BDC;
        ai.var1[2] = 0x7F ^ 0x78 ^ (0x7F ^ 0x72);
        ai.var1[3] = 1;
        ai.var1[4] = 2;
        ai.var1[5] = 0x35 ^ 0x41 ^ (0x43 ^ 0x3F);
    }

    @Inject
    protected DrinkingStaminaTask(Client client) {
        super(client);
    }
}

