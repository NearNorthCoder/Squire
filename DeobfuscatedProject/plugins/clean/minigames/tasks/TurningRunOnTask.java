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
        this.cf = lIIllIlIllII[0];
    }

    private static boolean llIIlllllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        U var1;
        if (U.llIIlllllIIIIl(Movement.isRunEnabled() ? 1 : 0)) {
            return lIIllIlIllII[1];
        }
        if (U.llIIlllllIIIlI(Movement.getRunEnergy(), var1.cf)) {
            return lIIllIlIllII[1];
        }
        Movement.toggleRun();
        this.cf = Rand.nextInt((int)lIIllIlIllII[2], (int)lIIllIlIllII[3]);
        return lIIllIlIllII[4];
    }

    private static boolean llIIlllllIIIIl(int n2) {
        return n2 != 0;
    }

    static {
        U.llIIlllllIIIII();
    }

}

