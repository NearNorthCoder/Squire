/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.movement.Movement
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.movement.Movement;

/* TASK: Turning run on -> TurningrunonTask */
@TaskDesc(name="Turning run on", priority=1)
public class TurningRunOnTask
extends Task {
    /* synthetic */ int cf;
    private static /* synthetic */ int[] lIIllIlIllII;

    public U() {
        this.cf = lIIllIlIllII[0];
    }

    private static boolean llIIlllllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        U var1;
        if (U.llIIlllllIIIIl(Movement.isRunEnabled() ? 1 : 0)) {
            return lIIllIlIllII[1];
        }
        if (U.llIIlllllIIIlI(Movement.getRunEnergy(), var1.cf)) {
            return lIIllIlIllII[1];
        }
        Movement.toggleRun();
        this.cf = Rand.nextInt((int)lIIllIlIllII[2], (int)lIIllIlIllII[3]);
        return lIIllIlIllII[4];
    }

    private static boolean llIIlllllIIIIl(int n2) {
        return n2 != 0;
    }

    static {
        U.llIIlllllIIIII();
    }

    private static void llIIlllllIIIII() {
        lIIllIlIllII = new int[5];
        U.lIIllIlIllII[0] = 32 + 158 - 180 + 165 ^ 35 + 148 - 67 + 66;
        U.lIIllIlIllII[1] = (0xF ^ 0x4D) & ~(0x7A ^ 0x38);
        U.lIIllIlIllII[2] = 156 + 143 - 223 + 127 ^ 3 + 173 - 129 + 149;
        U.lIIllIlIllII[3] = 0x8D ^ 0xBF;
        U.lIIllIlIllII[4] = 1;
    }
}

