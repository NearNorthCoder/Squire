/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.LHelper;

@TaskDesc(name="Drinking stamina dose", priority=8)
public class DrinkingStaminaDoseTask
extends Task {

    private final  a aa;
    private final  l Z;
    private final  g Y;

    private static void var3() {
        var1 = new int[6];
        r.var1[0] = (0x76 ^ 0x36 ^ (0x6A ^ 0x35)) & (125 + 101 - 198 + 163 ^ 22 + 20 - -68 + 50 ^ -1);
        r.var1[1] = 0xB1 ^ 0xAF;
        r.var1[2] = 3;
        r.var1[3] = 1;
        r.var1[4] = 2;
        r.var1[5] = 108 + 15 - 107 + 129 ^ 39 + 146 - 103 + 71;
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[0];
        while (r.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        r var16;
        if (r.var17(this.Y.m() ? 1 : 0)) {
            return var1[0];
        }
        if (!r.var18(var16.Y.l() ? 1 : 0) || r.var4(var16.Z.M())) {
            return var1[0];
        }
        if (!r.var14(Movement.getRunEnergy(), var1[1]) || r.var18(Movement.isStaminaBoosted() ? 1 : 0)) {
            return var1[0];
        }
        Item var19 = Inventory.getFirst(item -> item.getName().startsWith(var2[var1[3]]));
        if (!r.var4(var19) || r.var17(var16.aa.e() ? 1 : 0)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[0]]);
        this.aa.b();
        this.sleep(var1[2]);
        return var1[3];
    }

    private static boolean var17(int n2) {
        return n2 == 0;
    }

    @Inject
    public DrinkingStaminaDoseTask(g g2, l l2, a a2) {
        this.Y = g2;
        this.Z = l2;
        this.aa = a2;
    }

    static {
        r.var3();
        r.var20();
    }

    private static boolean var18(int n2) {
        return n2 != 0;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static void var20() {
        var2 = new String[var1[4]];
        r.var2[r.var1[0]] = "Drink";
        r.var2[r.var1[3]] = "Stamina";
    }
}

