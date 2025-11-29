/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food", priority=10000)
public class EatingFoodTask
extends Task {
    private final  a aR;

    private final  SquireDukeSucellus aP;
    private final  SquireDukeSucellusConfig aQ;

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
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    @Inject
    public EatingFoodTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aP = squireDukeSucellus;
        this.aQ = squireDukeSucellusConfig;
        this.aR = squireDukeSucellus.s();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if ((Combat.getCurrentHealth() > this.aQ.eatAt())) {
            return 0;
        }
        Item var13 = Inventory.getFirst(item -> {
            String[] stringArray = new String[1];
            stringArray[0] = var2[3];
            return item.hasAction(stringArray);
        });
        if var13 == null {
            w var14;
            Log.error((String)var2[0]);
            var14.aP.g(1);
            return 0;
        }
        var1_1.interact(var2[1]);
        this.sleep(2);
        return 1;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }
}

