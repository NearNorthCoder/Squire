/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Activating Blood Essence")
public class ActivatingBloodEssenceTask
extends Task {

    public boolean run() {
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
            return 0;
        }
        int[] nArray2 = new int[1];
        nArray2[0] = 3;
        if ((Inventory.contains((int[] == 0)nArray2) ? 1 : 0)) {
            return 0;
        }
        int[] nArray3 = new int[1];
        nArray3[0] = 3;
        Inventory.getFirst((int[])nArray3).interact(var1[0]);
        return 1;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < llllllllllllllIllIIlIIIlIIIlIIIl2) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((0x12 ^ 0x16) == (0xBB ^ 0xBF)) continue;
            return null;
        }
        return String.valueOf(var6);
    }
}

