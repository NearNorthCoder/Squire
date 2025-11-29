/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Bank
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.items.Bank;

@TaskDesc(name="Waiting for pin", blocking=true, priority=0x7FFFFFFF)
public class WaitingForPinTask
extends Task {

    static {
        t.var2();
    }

    public boolean run() {
        if (t.var3(Bank.isPinWindowOpen() ? 1 : 0)) {
            return var1[0];
        }
        return var1[1];
    }

    private static void var2() {
        var1 = new int[2];
        t.var1[0] = 1;
        t.var1[1] = (0x7B ^ 0x3D) & ~(0x2D ^ 0x6B);
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }
}

