/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.zulrah.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Turning on run")
public class TurningOnRunTask
extends Task {

    static {
        C.var2();
    }

    public boolean run() {
        if ((Movement.getRunEnergy() >= 0) && (Movement.isRunEnabled( == 0) ? 1 : 0)) {
            Movement.toggleRun();
            return 1;
        }
        return 2;
    }
}

