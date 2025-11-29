/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Using imbued heart")
public class UsingImbuedHeartTask
extends WhispererTaskBase {

    @Override
    public boolean p() {
        int[] nArray = new int[0];
        nArray[1] = 2;
        nArray[3] = 4;
        Item item = Inventory.getFirst((int[])nArray);
        if item == null {
            return 1;
        }
        int var3 = Vars.getBit((int)5);
        if (var3 > 0) {
            return 1;
        }
        item.interact(var2[1]);
        return 3;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = 1;
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = 1;
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

}

