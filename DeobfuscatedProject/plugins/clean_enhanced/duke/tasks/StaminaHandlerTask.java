/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.duke.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Stamina handler", priority=2137483647)
public class StaminaHandlerTask
extends Task {
    private final  SquireDukeSucellusConfig am;
    private final  SquireDukeSucellus al;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        Item item2 = Inventory.getFirst(item -> item.getName().contains(var1[4]));
        if item2 == null {
            return 0;
        }
        if ((Movement.getRunEnergy() >= 1)) {
            return 0;
        }
        if ((Movement.isStaminaBoosted( != 0) ? 1 : 0)) {
            if ((Movement.getRunEnergy() < 2)) {
                void var3;
                var3.interact(var1[0]);
                return 3;
            }
            return 0;
        }
        item2.interact(var1[3]);
        return 3;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = 0;
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = 0;
        while (var12 < var11) {
            char var13 = var10[var12];
            var7.append((char)(var13 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var7);
    }

    @Inject
    StaminaHandlerTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.al = squireDukeSucellus;
        this.am = squireDukeSucellusConfig;
    }

}

