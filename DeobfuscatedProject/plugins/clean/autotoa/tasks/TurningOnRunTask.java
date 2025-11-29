/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Turning on run", priority=0x7FFFFFFF)
public class TurningOnRunTask
extends Task {
    
    protected final  SquireAutoTOA cx;

    private static boolean lIlIIIIlIllIll(int n2) {
        return n2 != 0;
    }

    static {
        aa.lIlIIIIlIllIlI();
    }

    @Inject
    public TurningOnRunTask(SquireAutoTOA squireAutoTOA) {
        this.cx = squireAutoTOA;
    }

    public boolean run() {
        if (aa.lIlIIIIlIllIll(this.cx.d() ? 1 : 0)) {
            return llIIlIllIIl[0];
        }
        if (aa.lIlIIIIlIlllII(Movement.getRunEnergy(), llIIlIllIIl[1]) && aa.lIlIIIIlIlllIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return llIIlIllIIl[2];
        }
        return llIIlIllIIl[0];
    }

    private static boolean lIlIIIIlIlllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIIlIlllII(int n2, int n3) {
        return n2 > n3;
    }
}

