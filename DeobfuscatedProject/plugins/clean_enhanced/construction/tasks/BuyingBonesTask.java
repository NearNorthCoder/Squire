/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.loot.LooterConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Buying Bones")
public class BuyingBonesTask
extends Task {
    private static  String[] lllIIlll;
    private static  int[] lllIlIll;
    private final  LooterConfig ez;

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = 0;
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = 0;
        while (var15 < var14) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    public boolean run() {
        Item var17;
        if ((this.ez.buryBones( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((Inventory.contains(item -> item.getName( != 0).toLowerCase().contains(lllIIlll[5])) ? 1 : 0)) {
            var17 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lllIIlll[4]));
            var17.interact(lllIIlll[0]);
        }
        if ((Inventory.contains(item -> item.getName( != 0).toLowerCase().contains(lllIIlll[3])) ? 1 : 0)) {
            var17 = Inventory.getFirst(item -> item.getName().contains(lllIIlll[2]));
            var17.interact(lllIIlll[1]);
        }
        return 1;
    }

    @Inject
    public BuyingBonesTask(LooterConfig looterConfig) {
        this.ez = looterConfig;
    }
}

