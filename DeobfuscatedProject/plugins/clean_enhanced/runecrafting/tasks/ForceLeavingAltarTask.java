/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Force Leaving Altar")
public class ForceLeavingAltarTask
extends Task {

    private final  SquireGOTRPlugin aQ;

    @Inject
    public ForceLeavingAltarTask(SquireGOTRPlugin squireGOTRPlugin) {
        this.aQ = squireGOTRPlugin;
    }

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
        if ((this.aQ.ForceLeavingAltarTask( != 0) ? 1 : 0)) {
            return 0;
        }
        TileObject var9 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).contains(var2[1]) ? 1 : 0) && (tileObject.hasAction(string -> {
                int n2;
                if ((string != null != 0) && (string.equals(var2[3] != 0) ? 1 : 0)) {
                    n2 = 1;
                    0;
                    if (1 <= -1) {
                        return ((0x16 ^ 0x1D) & ~(0x2F ^ 0x24)) != 0;
                    }
                } else {
                    n2 = 0;
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                n2 = 1;
                0;
                if null != null {
                    return ((68 + 11 - 25 + 78 ^ 168 + 101 - 220 + 126) & (0x2A ^ 0x3A ^ (0xA7 ^ 0x9C) ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var9 == null {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        if ((Inventory.getCount((int[] > 0)nArray))) {
            return 0;
        }
        var1_1.interact(var2[0]);
        return 1;
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = 0;
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = 0;
        while (var18 < var17) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if (3 != 1) continue;
            return null;
        }
        return String.valueOf(var13);
    }
}

