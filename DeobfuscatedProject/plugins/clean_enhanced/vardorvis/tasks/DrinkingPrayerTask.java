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
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.vardorvis.tasks.VardorvisManager;

@TaskDesc(name="Drinking prayer", priority=10000)
public class DrinkingPrayerTask
extends Task {
    
    private final  SquireVardorvis aq;
    private final  e as;
    private final  SquireVardorvisConfig ar;

    static {
        y.var3();
        y.var4();
    }

    private static void var3() {
        var1 = new int[5];
        y.var1[0] = (168 + 42 - 146 + 153 ^ 10 + 95 - 83 + 177) & (0xF6 ^ 0x84 ^ (0x26 ^ 0x4A) ^ -1);
        y.var1[1] = 1;
        y.var1[2] = 2;
        y.var1[3] = 3;
        y.var1[4] = 9 ^ 0x62 ^ (8 ^ 0x6B);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (y.var17(Prayers.getPoints(), this.ar.drinkPrayerAt())) {
            return var1[0];
        }
        Item var18 = Inventory.getFirst(item -> {
            int n2;
            if (!y.var19(item.getName().toLowerCase().contains(var2[var1[1]]) ? 1 : 0) || y.var20(item.getName().toLowerCase().contains(var2[var1[2]]) ? 1 : 0)) {
                n2 = var1[1];
                0;
                if (3 <= -1) {
                    return (3 & (3 ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (y.var21(var18)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[0]]);
        return var1[1];
    }

    private static boolean var17(int n2, int n3) {
        return n2 > n3;
    }

    private static void var4() {
        var2 = new String[var1[3]];
        y.var2[y.var1[0]] = "Drink";
        y.var2[y.var1[1]] = "prayer potion";
        y.var2[y.var1[2]] = "super restore";
    }

    private static boolean var21(Object object) {
        return object == null;
    }

    private static boolean var19(int n2) {
        return n2 == 0;
    }

    private static boolean var20(int n2) {
        return n2 != 0;
    }

    @Inject
    public DrinkingPrayerTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.aq = squireVardorvis;
        this.ar = squireVardorvisConfig;
        this.as = squireVardorvis.j();
    }
}

