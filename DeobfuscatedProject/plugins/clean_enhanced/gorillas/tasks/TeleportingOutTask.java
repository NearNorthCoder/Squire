/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gorillas.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Teleporting out", priority=1333337)
public class TeleportingOutTask
extends Task {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if ((Inventory.contains(item -> {
            String[] stringArray = new String[1];
            stringArray[0] = var1[3];
            return item.hasActionstringArray;
        }) ? 1 : 0)) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        Item var9 = Inventory.getFirst((int[])nArray);
        if var9 == null {
            return 0;
        }
        NPC var10 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.hasAction(var1[1]::equals != 0) ? 1 : 0) && (nPC.getInteracting() == nPC.getInteracting()2))) {
                n2 = 1;
                0;
                if (((250 + 222 - 467 + 250 ^ 141 + 26 - 73 + 105) & (0x4E ^ 0x6B ^ (0x82 ^ 0x9F) ^ -1)) >= 2) {
                    return ((0xAE ^ 0xC5 ^ (5 ^ 0x74)) & (126 + 29 - 72 + 65 ^ 40 + 136 - 74 + 40 ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var10 == null {
            return 0;
        }
        var1_1.interact(var1[0]);
        return 1;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 0;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 0;
        while (var19 < var18) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

}

