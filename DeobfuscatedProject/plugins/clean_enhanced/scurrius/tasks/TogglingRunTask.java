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
        if (f.var2(Movement.isRunEnabled() ? 1 : 0)) {
            return var1[0];
        }
        if (f.var3(Movement.getRunEnergy(), var1[1])) {
            return var1[0];
        }
        Movement.toggleRun();
        return var1[2];
    }

    @Inject
    TogglingRunTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.M = squireScurrius;
        this.N = squireScurriusConfig;
    }

    static {
        f.var4();
    }

    private static void var4() {
        var1 = new int[3];
        f.var1[0] = 3 & ~3;
        f.var1[1] = 0x33 ^ 0x62 ^ (0x9B ^ 0xC0);
        f.var1[2] = 1;
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }
}

