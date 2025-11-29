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

    private static boolean llIIlIIIIIIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        C.llIIlIIIIIIIllI();
    }

    private static boolean llIIlIIIIIIlIII(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        if (C.llIIlIIIIIIIlll(Movement.getRunEnergy(), lIllIlIlIlIIl[0]) && C.llIIlIIIIIIlIII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return lIllIlIlIlIIl[1];
        }
        return lIllIlIlIlIIl[2];
    }
}

