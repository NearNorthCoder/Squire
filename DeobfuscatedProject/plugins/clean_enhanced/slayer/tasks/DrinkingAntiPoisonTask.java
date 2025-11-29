/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.slayer.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Drinking Anti Poison")
public class DrinkingAntiPoisonTask
extends Task {

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (f.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (((0xEB ^ 0x9A ^ (0xD0 ^ 0xB7)) & (0x6C ^ 0x67 ^ (0x57 ^ 0x4A) ^ -1)) < 3) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static void var14() {
        var1 = new int[5];
        f.var1[0] = (0x31 ^ 0x27) & ~(0x5C ^ 0x4A);
        f.var1[1] = 1;
        f.var1[2] = 2;
        f.var1[3] = 3;
        f.var1[4] = 0xC4 ^ 0x81 ^ (0xFB ^ 0xBA);
    }

    private static void var15() {
        var2 = new String[var1[4]];
        f.var2[f.var1[0]] = "Drink";
        f.var2[f.var1[1]] = "anti";
        f.var2[f.var1[2]] = "anti";
        f.var2[f.var1[3]] = "Drink";
    }

    private static boolean var16(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        if (f.var16(Combat.isPoisoned() ? 1 : 0)) {
            return var1[0];
        }
        if (f.var16(Inventory.contains(item -> {
            int n2;
            if (f.var17(item.getName().toLowerCase().contains(var2[var1[2]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[f.var1[0]] = var2[var1[3]];
                if (f.var17(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (-1 <= (0x99 ^ 0x9D)) return n2 != 0;
                    return ((0x6B ^ 0x6F) & ~(0xB1 ^ 0xB5)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }) ? 1 : 0)) {
            return var1[0];
        }
        Inventory.getFirst(item -> item.getName().toLowerCase().contains(var2[var1[1]])).interact(var2[var1[0]]);
        return var1[1];
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    static {
        f.var14();
        f.var15();
    }
}

