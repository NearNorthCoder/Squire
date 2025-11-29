/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.movement.Movement
 */
package m.u.a.-.e.s.q.t.i.r;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.movement.Movement;

/* TASK: Enabling run -> EnableRunTask */
@TaskDesc(name="Enabling run", priority=100)
public class t
extends Task {
    private static /* synthetic */ int[] lllIlIllIllI;
    private /* synthetic */ int ax;

    static {
        t.lIIIllIIIlllIIl();
    }

    public t() {
        this.ax = lllIlIllIllI[0];
    }

    private static void lIIIllIIIlllIIl() {
        lllIlIllIllI = new int[5];
        t.lllIlIllIllI[0] = 0xF ^ 0x1B;
        t.lllIlIllIllI[1] = (2 ^ 0x69 ^ (0x4C ^ 0x79)) & (60 + 141 - 15 + 17 ^ 58 + 59 - 57 + 89 ^ -1);
        t.lllIlIllIllI[2] = 129 + 68 - 86 + 44 ^ 55 + 56 - 28 + 75;
        t.lllIlIllIllI[3] = 0xEF ^ 0x93 ^ (0xF7 ^ 0x92);
        t.lllIlIllIllI[4] = 1;
    }

    private static boolean lIIIllIIIlllIll(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        if (!t.lIIIllIIIlllIlI(Movement.getRunEnergy(), this.ax) || t.lIIIllIIIlllIll(Movement.isRunEnabled() ? 1 : 0)) {
            return lllIlIllIllI[1];
        }
        Movement.toggleRun();
        this.ax = Rand.nextInt((int)lllIlIllIllI[2], (int)lllIlIllIllI[3]);
        return lllIlIllIllI[4];
    }

    private static boolean lIIIllIIIlllIlI(int n2, int n3) {
        return n2 >= n3;
    }
}

