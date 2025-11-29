/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.cox.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Enabling run", priority=30000)
public class EnablingRunTask
extends Task {
    
    private  int cI;

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

    public EnablingRunTask() {
        this.cI = lIlIllIlIIll[0];
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

