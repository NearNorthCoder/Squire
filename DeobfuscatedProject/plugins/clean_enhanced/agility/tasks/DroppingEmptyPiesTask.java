/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Inventory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.agility.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Dropping empty pies")
public class DroppingEmptyPiesTask
extends Task {
    private static final  Logger t;

    private static boolean var2(int n) {
        return n == 0;
    }

    private static void var3() {
        var1 = new int[3];
        e.var1[0] = 1;
        e.var1[1] = (0 + 6 - -10 + 111 ^ (0x46 ^ 0x1E)) & (140 + 88 - 126 + 44 ^ 110 + 55 - 58 + 74 ^ -1);
        e.var1[2] = 0xFFFFDF7D & 0x298B;
    }

    static {
        e.var3();
        t = LoggerFactory.getLogger(DroppingEmptyPiesTask.class);
    }

    public boolean run() {
        int[] nArray = new int[var1[0]];
        nArray[e.var1[1]] = var1[2];
        if (e.var2(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var1[1];
        }
        int[] nArray2 = new int[var1[0]];
        nArray2[e.var1[1]] = var1[2];
        Inventory.dropAll((int[])nArray2);
        0;
        return var1[0];
    }
}

