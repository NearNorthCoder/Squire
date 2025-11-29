/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.movement.Movement
 */
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.movement.Movement;

/* TASK: Enabling run -> EnableRunTask */
@TaskDesc(name="Enabling run")
public class b
extends Task {
    private static /* synthetic */ int[] lIllIIIIllIl;

    static {
        b.lllIIIllllIIlI();
    }

    private static void lllIIIllllIIlI() {
        lIllIIIIllIl = new int[3];
        b.lIllIIIIllIl[0] = 0x5B ^ 0x51;
        b.lIllIIIIllIl[1] = (1 ^ (0xEA ^ 0xBF)) & (0x4D ^ 0x5C ^ (0x46 ^ 3) ^ -1);
        b.lIllIIIIllIl[2] = 1;
    }

    public boolean run() {
        if (!b.lllIIIllllIIll(Movement.isRunEnabled() ? 1 : 0) || b.lllIIIllllIlII(Movement.getRunEnergy(), lIllIIIIllIl[0])) {
            return lIllIIIIllIl[1];
        }
        Movement.toggleRun();
        return lIllIIIIllIl[2];
    }

    private static boolean lllIIIllllIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIllllIlII(int n2, int n3) {
        return n2 < n3;
    }
}

