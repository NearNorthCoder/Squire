/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;

/* TASK: Idling -> IdlingTask */
@TaskDesc(name="Idling")
public class k
extends Task {
    private static /* synthetic */ int[] llllIIIlIIlI;

    private static void lIIIlllIllIllll() {
        llllIIIlIIlI = new int[1];
        k.llllIIIlIIlI[0] = (0xF4 ^ 0xAC) & ~(0x63 ^ 0x3B);
    }

    static {
        k.lIIIlllIllIllll();
    }

    public boolean run() {
        return llllIIIlIIlI[0];
    }
}

