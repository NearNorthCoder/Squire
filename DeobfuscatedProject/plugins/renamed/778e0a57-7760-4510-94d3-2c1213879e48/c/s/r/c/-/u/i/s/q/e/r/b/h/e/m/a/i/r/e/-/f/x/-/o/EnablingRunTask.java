/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.movement.Movement
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.movement.Movement;

/* TASK: Enabling run -> EnableRunTask */
@TaskDesc(name="Enabling run", priority=30000)
public class EnablingRunTask
extends Task {
    private static /* synthetic */ int[] lIlIllIlIIll;
    private /* synthetic */ int cI;

    private boolean cB() {
        if (af.lllIIIIIlIIIII(Movement.getRunEnergy(), this.cI)) {
            return lIlIllIlIIll[1];
        }
        if (af.lllIIIIIlIIIIl(Movement.isRunEnabled() ? 1 : 0)) {
            return lIlIllIlIIll[1];
        }
        this.cI = Rand.nextInt((int)lIlIllIlIIll[2], (int)lIlIllIlIIll[3]);
        Movement.toggleRun();
        return lIlIllIlIIll[2];
    }

    public af() {
        this.cI = lIlIllIlIIll[0];
    }

    private static void lllIIIIIIlllll() {
        lIlIllIlIIll = new int[4];
        af.lIlIllIlIIll[0] = 134 + 26 - 116 + 137 ^ 68 + 112 - 33 + 30;
        af.lIlIllIlIIll[1] = (0xD9 ^ 0x98) & ~(0x44 ^ 5);
        af.lIlIllIlIIll[2] = 1;
        af.lIlIllIlIIll[3] = 0x20 ^ 0x25;
    }

    private static boolean lllIIIIIlIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIIIIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        af.lllIIIIIIlllll();
    }

    public boolean run() {
        return this.cB();
    }
}

