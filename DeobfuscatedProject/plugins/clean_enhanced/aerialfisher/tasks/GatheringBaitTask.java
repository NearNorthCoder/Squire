/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.aerialfisher.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Gathering bait", priority=7, blocking=true)
public class GatheringBaitTask
extends Task {

    private static boolean var3(int n) {
        return n == 0;
    }

    private static boolean var4(int n, int n2) {
        return n >= n2;
    }

    static {
        c.var5();
        c.var6();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        block5: {
            block4: {
                int[] nArray = new int[var1[0]];
                nArray[c.var1[1]] = var1[2];
                if (!c.var3(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray2 = new int[var1[0]];
                nArray2[c.var1[1]] = var1[3];
                if (!c.var4(Inventory.getCount((int[])nArray2), var1[4])) break block5;
            }
            return var1[1];
        }
        int[] nArray = new int[var1[0]];
        nArray[c.var1[1]] = var1[5];
        TileObject var7 = TileObjects.getNearest((int[])nArray);
        if (c.var8(var7)) {
            return var1[1];
        }
        var1_1.interact(var2[var1[1]]);
        return var1[0];
    }

    private static void var6() {
        var2 = new String[var1[0]];
        c.var2[c.var1[1]] = "Take";
    }

    private static void var5() {
        var1 = new int[7];
        c.var1[0] = 1;
        c.var1[1] = (0x57 ^ 0x2A ^ (0x24 ^ 0x16)) & (0xD9 ^ 0x97 ^ 1 ^ -1);
        c.var1[2] = -(0xFFFFF7CE & 0x2A77) & (0xFFFFFB7F & 0x7FE7);
        c.var1[3] = 0xFFFF99FF & 0x6E72;
        c.var1[4] = 2;
        c.var1[5] = 0xFFFFCFFC & 0xB75B;
        c.var1[6] = 7 ^ 0xF;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean var8(Object object) {
        return object == null;
    }
}

