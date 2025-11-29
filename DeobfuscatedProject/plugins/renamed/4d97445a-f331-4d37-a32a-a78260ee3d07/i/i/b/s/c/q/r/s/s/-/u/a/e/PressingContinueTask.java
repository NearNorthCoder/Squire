/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.widgets.Dialog
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Pressing Continue -> PressingcontinueTask */
@TaskDesc(name="Pressing Continue", priority=15, blocking=true)
public class PressingContinueTask
extends Task {
    private static /* synthetic */ int[] lllIIIl;

    private static boolean lllIIIIll(int n2) {
        return n2 == 0;
    }

    static {
        bq.lllIIIIlI();
    }

    private static void lllIIIIlI() {
        lllIIIl = new int[2];
        bq.lllIIIl[0] = (4 ^ 0x40) & ~(0xEE ^ 0xAA);
        bq.lllIIIl[1] = 1;
    }

    public boolean run() {
        if (bq.lllIIIIll(Dialog.canContinue() ? 1 : 0)) {
            return lllIIIl[0];
        }
        Dialog.continueSpace();
        return lllIIIl[1];
    }
}

