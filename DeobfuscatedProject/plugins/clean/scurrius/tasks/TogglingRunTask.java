/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.scurrius.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import javax.inject.Inject;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Toggling run", priority=2146483647)
public class TogglingRunTask
extends Task {
    private final  SquireScurrius M;
    
    private final  SquireScurriusConfig N;

    public boolean run() {
        if (f.lIlIllIIIllllIl(Movement.isRunEnabled() ? 1 : 0)) {
            return lIIlIlIlllIll[0];
        }
        if (f.lIlIllIIIlllllI(Movement.getRunEnergy(), lIIlIlIlllIll[1])) {
            return lIIlIlIlllIll[0];
        }
        Movement.toggleRun();
        return lIIlIlIlllIll[2];
    }

    @Inject
    TogglingRunTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.M = squireScurrius;
        this.N = squireScurriusConfig;
    }

    static {
        f.lIlIllIIIllllII();
    }

    private static boolean lIlIllIIIllllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIIIlllllI(int n2, int n3) {
        return n2 < n3;
    }
}

