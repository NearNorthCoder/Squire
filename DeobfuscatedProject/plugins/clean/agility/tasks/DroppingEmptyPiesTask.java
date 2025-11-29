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

    private static boolean lIIlIlIllIlIlI(int n) {
        return n == 0;
    }

    static {
        e.lIIlIlIllIlIIl();
        t = LoggerFactory.getLogger(DroppingEmptyPiesTask.class);
    }

    public boolean run() {
        int[] nArray = new int[lIllIIIllll[0]];
        nArray[e.lIllIIIllll[1]] = lIllIIIllll[2];
        if (e.lIIlIlIllIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIllIIIllll[1];
        }
        int[] nArray2 = new int[lIllIIIllll[0]];
        nArray2[e.lIllIIIllll[1]] = lIllIIIllll[2];
        Inventory.dropAll((int[])nArray2);

        return lIllIIIllll[0];
    }
}

