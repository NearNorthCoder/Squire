/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.movement.Movement
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.movement.Movement;

/* TASK: Turning on run -> EnableRunTask */
@TaskDesc(name="Turning on run")
public class C
extends Task {
    private static /* synthetic */ int[] lIllIlIlIlIIl;

    private static boolean llIIlIIIIIIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        C.llIIlIIIIIIIllI();
    }

    private static boolean llIIlIIIIIIlIII(int n2) {
        return n2 == 0;
    }

    private static void llIIlIIIIIIIllI() {
        lIllIlIlIlIIl = new int[3];
        C.lIllIlIlIlIIl[0] = 0x22 ^ 0x1E ^ (0xB6 ^ 0x8F);
        C.lIllIlIlIlIIl[1] = 1;
        C.lIllIlIlIlIIl[2] = (0x75 ^ 0x53) & ~(0x27 ^ 1);
    }

    public boolean run() {
        if (C.llIIlIIIIIIIlll(Movement.getRunEnergy(), lIllIlIlIlIIl[0]) && C.llIIlIIIIIIlIII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return lIllIlIlIlIIl[1];
        }
        return lIllIlIlIlIIl[2];
    }
}

