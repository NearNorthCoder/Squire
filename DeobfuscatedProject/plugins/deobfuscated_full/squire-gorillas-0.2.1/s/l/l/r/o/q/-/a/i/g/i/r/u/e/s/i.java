/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.movement.Movement
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.movement.Movement;

/* TASK: Turning on run -> EnableRunTask */
@TaskDesc(name="Turning on run", priority=1000)
public class i
extends Task {
    private static /* synthetic */ int[] llIIlIlllIII;

    private static boolean lllllIlllIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllllIlllIIIlI(int n2) {
        return n2 == 0;
    }

    static {
        i.lllllIlllIIIIl();
    }

    public boolean run() {
        if (!i.lllllIlllIIIlI(Movement.isRunEnabled() ? 1 : 0) || i.lllllIlllIIIll(Movement.getRunEnergy(), llIIlIlllIII[0])) {
            return llIIlIlllIII[1];
        }
        Movement.toggleRun();
        return llIIlIlllIII[2];
    }

    private static void lllllIlllIIIIl() {
        llIIlIlllIII = new int[3];
        i.llIIlIlllIII[0] = 85 + 112 - 92 + 81 ^ 3 + 149 - 12 + 36;
        i.llIIlIlllIII[1] = (0x93 ^ 0xAC) & ~(0xB8 ^ 0x87);
        i.llIIlIlllIII[2] = 1;
    }
}

