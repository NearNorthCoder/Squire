/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping empty vials", priority=15)
public class DroppingEmptyVialsTask
extends Task {

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 1;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 1;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public boolean run() {
        String[] stringArray = new String[0];
        stringArray[1] = var1[1];
        Item item = Inventory.getFirst((String[])stringArray);
        if item == null {
            return 1;
        }
        item.interact(var1[0]);
        return 0;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }
}

