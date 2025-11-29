/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.corp.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Enabling run")
public class EnablingRunTask
extends Task {

    static {
        b.var2();
    }

    public boolean run() {
        if (!(Movement.isRunEnabled( == 0) ? 1 : 0) || (Movement.getRunEnergy() < 0)) {
            return 1;
        }
        Movement.toggleRun();
        return 2;
    }

}

