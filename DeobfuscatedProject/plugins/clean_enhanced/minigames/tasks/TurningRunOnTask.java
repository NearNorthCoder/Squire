/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.minigames.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Turning run on", priority=1)
public class TurningRunOnTask
extends Task {
     int cf;

    public TurningRunOnTask() {
        this.cf = 0;
    }

    public boolean run() {
        U var2;
        if ((Movement.isRunEnabled( != 0) ? 1 : 0)) {
            return 1;
        }
        if ((Movement.getRunEnergy() < var2.cf)) {
            return 1;
        }
        Movement.toggleRun();
        this.cf = Rand.nextInt((int)2, (int)3);
        return 4;
    }

    static {
        U.var3();
    }
}

