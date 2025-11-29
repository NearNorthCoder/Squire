/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.pvm.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Curing Poison", priority=2)
public class CuringPoisonTask
extends Task {

    private static final  Logger X;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        m.var10();
        m.var11();
        X = LoggerFactory.getLogger(CuringPoisonTask.class);
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (m.var21(var20, var19)) {
            char var22 = var18[var20];
            var15.append((char)(var22 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (((0x33 ^ 0x24) & ~(0x4E ^ 0x59)) == ((0x1C ^ 7) & ~(0x8F ^ 0x94))) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean var23(int n2) {
        return n2 != 0;
    }

    private static boolean var24(Object object) {
        return object == null;
    }

    private static void var10() {
        var1 = new int[5];
        m.var1[0] = (119 + 29 - 111 + 124 ^ 65 + 42 - 29 + 62) & (0x64 ^ 0x3C ^ (0xB5 ^ 0xC0) ^ -1);
        m.var1[1] = 1;
        m.var1[2] = 2;
        m.var1[3] = 3;
        m.var1[4] = 11 + 42 - 13 + 109 ^ 40 + 93 - 43 + 67;
    }

    private static void var11() {
        var2 = new String[var1[3]];
        m.var2[m.var1[0]] = "Drink";
        m.var2[m.var1[1]] = "anti";
        m.var2[m.var1[2]] = "Drink";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (m.var3(Combat.isPoisoned() ? 1 : 0)) {
            return var1[0];
        }
        Item var25 = Inventory.getFirst(item -> {
            int n2;
            if (m.var23(item.getName().toLowerCase().contains(var2[var1[1]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[m.var1[0]] = var2[var1[2]];
                if (m.var23(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if ((3 ^ 0x1D ^ (0x62 ^ 0x79)) > 0) return n2 != 0;
                    return ((2 ^ (0x82 ^ 0xC4)) & (0x8C ^ 0xB8 ^ (0x32 ^ 0x42) ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        });
        if (m.var24(var25)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[0]]);
        return var1[1];
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }
}

