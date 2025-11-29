/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.hydra.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.hydra.tasks.HydraManager;

@TaskDesc(name="Curing poison", priority=20)
public class CuringPoisonTask
extends Task {
    private final  a aq;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (o.var3(this.aq.g() ? 1 : 0)) {
            return var1[0];
        }
        if (o.var3(Combat.isPoisoned() ? 1 : 0)) {
            return var1[0];
        }
        Item var4 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[var1[2]];
            stringArray[o.var1[0]] = var2[var1[2]];
            if (o.var5(item.hasAction(stringArray) ? 1 : 0) && o.var5(item.getName().toLowerCase().contains(var2[var1[3]]) ? 1 : 0)) {
                n2 = var1[2];
                0;
                if ((152 + 117 - 198 + 124 ^ 79 + 197 - 129 + 51) <= 0) {
                    return ((37 + 175 - 205 + 241 ^ 95 + 102 - 37 + 1) & (18 + 3 - -203 + 18 ^ 169 + 113 - 230 + 119 ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (o.var6(var4)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[0]]);
        this.sleep(var1[1]);
        return var1[2];
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = var1[0];
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = var1[0];
        while (o.var16(var15, var14)) {
            char var17 = var13[var15];
            var10.append((char)(var17 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if (1 < 2) continue;
            return null;
        }
        return String.valueOf(var10);
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static void var24() {
        var2 = new String[var1[4]];
        o.var2[o.var1[0]] = "Drink";
        o.var2[o.var1[2]] = "Drink";
        o.var2[o.var1[3]] = "anti";
    }

    private static boolean var16(int n2, int n3) {
        return n2 < n3;
    }

    static {
        o.var25();
        o.var24();
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static void var25() {
        var1 = new int[6];
        o.var1[0] = (0xDF ^ 0x86) & ~(0x9D ^ 0xC4);
        o.var1[1] = 0x55 ^ 0x51;
        o.var1[2] = 1;
        o.var1[3] = 2;
        o.var1[4] = 3;
        o.var1[5] = 0x56 ^ 0x5E;
    }

    @Inject
    public CuringPoisonTask(a a2) {
        this.aq = a2;
    }

    private static boolean var6(Object object) {
        return object == null;
    }
}

