/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.gorillas.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Turning on run", priority=1000)
public class TurningOnRunTask
extends Task {

    private static boolean lllllIlllIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllllIlllIIIlI(int n2) {
        return n2 == 0;
    }

    static {
        i.lllllIlllIIIIl();
    }

    public boolean run() {
        if (!i.lllllIlllIIIlI(Movement.isRunEnabled() ? 1 : 0) || i.lllllIlllIIIll(Movement.getRunEnergy(), llIIlIlllIII[0])) {
            return llIIlIlllIII[1];
        }
        Movement.toggleRun();
        return llIIlIlllIII[2];
    }

}

