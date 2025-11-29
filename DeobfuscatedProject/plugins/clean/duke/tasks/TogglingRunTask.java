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

    private static boolean lllIIllIIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        if (k.lllIIllIIIIlII(Movement.isRunEnabled() ? 1 : 0)) {
            return lIllIIlllIII[0];
        }
        if (k.lllIIllIIIIlIl(Movement.getRunEnergy(), lIllIIlllIII[1])) {
            return lIllIIlllIII[0];
        }
        Movement.toggleRun();
        return lIllIIlllIII[2];
    }

    @Inject
    TogglingRunTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aj = squireDukeSucellus;
        this.ak = squireDukeSucellusConfig;
    }

    private static boolean lllIIllIIIIlII(int n2) {
        return n2 != 0;
    }

    static {
        k.lllIIllIIIIIll();
    }
}

