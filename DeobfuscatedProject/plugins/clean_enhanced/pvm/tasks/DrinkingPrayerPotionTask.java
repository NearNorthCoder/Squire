/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.pvm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.pvm.tasks.PvmManager;

@TaskDesc(name="Drinking Prayer Potion")
public class DrinkingPrayerPotionTask
extends Task {

    private final  c Y;

    private static void var3() {
        var2 = new String[var1[3]];
        n.var2[n.var1[0]] = "Drink";
        n.var2[n.var1[2]] = "Prayer potion";
    }

    private static void var4() {
        var1 = new int[5];
        n.var1[0] = (0xE6 ^ 0xA0) & ~(0x6A ^ 0x2C);
        n.var1[1] = 0x4C ^ 0x43;
        n.var1[2] = 1;
        n.var1[3] = 2;
        n.var1[4] = 79 + 160 - 80 + 4 ^ 154 + 146 - 212 + 83;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (n.var5(this.Y.s() ? 1 : 0)) {
            return var1[0];
        }
        if (n.var7(Prayers.getPoints(), var1[1])) {
            return var1[0];
        }
        Item var8 = Inventory.getFirst(item -> item.getName().startsWith(var2[var1[2]]));
        if (n.var6(var8)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[0]]);
        return var1[2];
    }

    private static boolean var7(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public DrinkingPrayerPotionTask(c c2) {
        this.Y = c2;
    }

    static {
        n.var4();
        n.var3();
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = var1[0];
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = var1[0];
        while (n.var9(var24, var23)) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if (((0x70 ^ 0x3A) & ~(0xF4 ^ 0xBE)) == ((0xF ^ 0x24) & ~(0xA4 ^ 0x8F))) continue;
            return null;
        }
        return String.valueOf(var19);
    }
}

