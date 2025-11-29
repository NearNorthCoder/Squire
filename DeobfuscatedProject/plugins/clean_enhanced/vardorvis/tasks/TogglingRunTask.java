/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.vardorvis.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import javax.inject.Inject;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Toggling run", priority=0x7FFFFFFF)
public class TogglingRunTask
extends Task {
    
    private final  SquireVardorvis ad;
    private final  SquireVardorvisConfig ae;

    @Inject
    TogglingRunTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.ad = squireVardorvis;
        this.ae = squireVardorvisConfig;
    }

    private static boolean var2(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        if (n.var3(Movement.isRunEnabled() ? 1 : 0)) {
            return var1[0];
        }
        if (n.var2(Movement.getRunEnergy(), var1[1])) {
            return var1[0];
        }
        Movement.toggleRun();
        return var1[2];
    }

    private static void var4() {
        var1 = new int[3];
        n.var1[0] = (0x4A ^ 0x18) & ~(0xD3 ^ 0x81);
        n.var1[1] = 125 + 136 - 131 + 23 ^ 100 + 82 - 139 + 104;
        n.var1[2] = 1;
    }

    static {
        n.var4();
    }
}

