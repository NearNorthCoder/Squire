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
        if ((Movement.getRunEnergy() < this.cI)) {
            return 1;
        }
        if ((Movement.isRunEnabled( != 0) ? 1 : 0)) {
            return 1;
        }
        this.cI = Rand.nextInt((int)2, (int)3);
        Movement.toggleRun();
        return 2;
    }

    public EnablingRunTask() {
        this.cI = 0;
    }

    static {
        af.var2();
    }

    public boolean run() {
        return this.cB();
    }
}

