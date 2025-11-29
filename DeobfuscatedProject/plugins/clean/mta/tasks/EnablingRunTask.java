/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.mta.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Enabling run", priority=100)
public class EnablingRunTask
extends Task {
    
    private  int ax;

    static {
        t.lIIIllIIIlllIIl();
    }

    public EnablingRunTask() {
        this.ax = lllIlIllIllI[0];
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

