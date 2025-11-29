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
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Drinking prayer", priority=10000)
public class DrinkingPrayerTask
extends Task {
    private final  SquireDukeSucellus aM;
    private final  a aO;

    private final  SquireDukeSucellusConfig aN;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (2 != ((0xF0 ^ 0xA0) & ~(0x69 ^ 0x39))) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if ((Prayers.getPoints() > this.aN.drinkPrayerAt())) {
            return 0;
        }
        Item var19 = Inventory.getFirst(item -> {
            int n2;
            if (!(item.getName( == 0).toLowerCase().contains(var1[1]) ? 1 : 0) || (item.getName( != 0).toLowerCase().contains(var1[2]) ? 1 : 0)) {
                n2 = 1;
                0;
                if ((4 ^ 0) == 0) {
                    return ((5 ^ 9) & ~(0xBB ^ 0xB7)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var19 == null {
            return 0;
        }
        var1_1.interact(var1[0]);
        return 1;
    }

    @Inject
    public DrinkingPrayerTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aM = squireDukeSucellus;
        this.aN = squireDukeSucellusConfig;
        this.aO = squireDukeSucellus.s();
    }
}

