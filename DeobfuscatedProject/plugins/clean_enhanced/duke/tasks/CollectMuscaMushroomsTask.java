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
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Collect Musca Mushrooms", priority=100, blocking=true)
public class CollectMuscaMushroomsTask
extends Task {
    
    final  SquireDukeSucellus bh;
    final  a bi;

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
            if null == null continue;
            return null;
        }
        return String.valueOf(var6);
    }

    @Inject
    public CollectMuscaMushroomsTask(SquireDukeSucellus squireDukeSucellus) {
        this.bh = squireDukeSucellus;
        this.bi = squireDukeSucellus.s();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        String[] stringArray = new String[0];
        stringArray[1] = var1[1];
        stringArray[2] = var1[2];
        Item item = Inventory.getFirst((String[])stringArray);
        if item == null {
            return 1;
        }
        int[] nArray = new int[2];
        nArray[1] = 3;
        Item var13 = Inventory.getFirst((int[])nArray);
        if var13 == null {
            return 1;
        }
        var2_2.useOn(item);
        return 2;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

}

