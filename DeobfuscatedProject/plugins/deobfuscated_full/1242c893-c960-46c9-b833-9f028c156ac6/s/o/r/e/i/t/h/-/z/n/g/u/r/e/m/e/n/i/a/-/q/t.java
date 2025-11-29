/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Bank
 */
package s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.items.Bank;

/* TASK: Waiting for pin -> WaitingforpinTask */
@TaskDesc(name="Waiting for pin", blocking=true, priority=0x7FFFFFFF)
public class t
extends Task {
    private static /* synthetic */ int[] lIIIlIIlIlIll;

    static {
        t.lIIlllllIIIIlIl();
    }

    public boolean run() {
        if (t.lIIlllllIIIIllI(Bank.isPinWindowOpen() ? 1 : 0)) {
            return lIIIlIIlIlIll[0];
        }
        return lIIIlIIlIlIll[1];
    }

    private static void lIIlllllIIIIlIl() {
        lIIIlIIlIlIll = new int[2];
        t.lIIIlIIlIlIll[0] = 1;
        t.lIIIlIIlIlIll[1] = (0x7B ^ 0x3D) & ~(0x2D ^ 0x6B);
    }

    private static boolean lIIlllllIIIIllI(int n2) {
        return n2 != 0;
    }
}

