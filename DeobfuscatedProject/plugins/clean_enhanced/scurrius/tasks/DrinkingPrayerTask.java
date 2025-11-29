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
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.scurrius.tasks.ScurriusManager;

@TaskDesc(name="Drinking prayer", priority=10000)
public class DrinkingPrayerTask
extends Task {
    private final  SquireScurriusConfig aa;
    private final  b ab;

    private final  SquireScurrius Z;

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
            if null == null continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

    private static boolean var15(Object object) {
        return object == null;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    @Inject
    public DrinkingPrayerTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.Z = squireScurrius;
        this.aa = squireScurriusConfig;
        this.ab = squireScurrius.n();
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var22(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (p.var22(Prayers.getPoints(), this.aa.drinkPrayerAt())) {
            return var2[0];
        }
        Item var23 = Inventory.getFirst(item -> {
            int n2;
            if (!p.var24(item.getName().toLowerCase().contains(var1[var2[1]]) ? 1 : 0) || p.var14(item.getName().toLowerCase().contains(var1[var2[2]]) ? 1 : 0)) {
                n2 = var2[1];
                0;
                if (1 < 0) {
                    return ((5 ^ 0x28) & ~(0xAD ^ 0x80)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (p.var15(var23)) {
            return var2[0];
        }
        var1_1.interact(var1[var2[0]]);
        return var2[1];
    }

    private static void var25() {
        var2 = new int[4];
        p.var2[0] = (74 + 91 - 17 + 7 ^ 48 + 39 - -2 + 67) & (56 + 82 - 97 + 87 ^ 2 + 90 - 16 + 59 ^ -1);
        p.var2[1] = 1;
        p.var2[2] = 2;
        p.var2[3] = 3;
    }

    private static void var26() {
        var1 = new String[var2[3]];
        p.var1[p.var2[0]] = "Drink";
        p.var1[p.var2[1]] = "prayer potion";
        p.var1[p.var2[2]] = "super restore";
    }

    static {
        p.var25();
        p.var26();
    }

    private static boolean var24(int n2) {
        return n2 == 0;
    }
}

