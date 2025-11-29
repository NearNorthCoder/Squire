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
        t.lIIlllllIIIIlIl();
    }

    public boolean run() {
        if (t.lIIlllllIIIIllI(Bank.isPinWindowOpen() ? 1 : 0)) {
            return lIIIlIIlIlIll[0];
        }
        return lIIIlIIlIlIll[1];
    }

    private static boolean lIIlllllIIIIllI(int n2) {
        return n2 != 0;
    }
}

