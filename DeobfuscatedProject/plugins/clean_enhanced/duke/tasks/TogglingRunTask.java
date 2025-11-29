/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.duke.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import javax.inject.Inject;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Toggling run", priority=2146483647)
public class TogglingRunTask
extends Task {
    
    private final  SquireDukeSucellus aj;
    private final  SquireDukeSucellusConfig ak;

    public boolean run() {
        if ((Movement.isRunEnabled( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Movement.getRunEnergy() < 1)) {
            return 0;
        }
        Movement.toggleRun();
        return 2;
    }

    @Inject
    TogglingRunTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aj = squireDukeSucellus;
        this.ak = squireDukeSucellusConfig;
    }

    static {
        k.var2();
    }
}

