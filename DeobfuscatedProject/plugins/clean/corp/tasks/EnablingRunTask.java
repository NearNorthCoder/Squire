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
        b.lllIIIllllIIlI();
    }

    public boolean run() {
        if (!b.lllIIIllllIIll(Movement.isRunEnabled() ? 1 : 0) || b.lllIIIllllIlII(Movement.getRunEnergy(), lIllIIIIllIl[0])) {
            return lIllIIIIllIl[1];
        }
        Movement.toggleRun();
        return lIllIIIIllIl[2];
    }

    private static boolean lllIIIllllIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIllllIlII(int n2, int n3) {
        return n2 < n3;
    }
}

