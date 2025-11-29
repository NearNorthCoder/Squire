/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import net.unethicalite.api.movement.Movement;
import gg.squire.saradomin.tasks.SaradominManager;

@TaskDesc(name="Enabling run", priority=10)
public class EnablingRunTask
extends Task {
    
    private final  SquireSaraConfig I;
    private final  g J;

    public boolean run() {
        m var1;
        if (m.lIlIlIllIllllII(Movement.isRunEnabled() ? 1 : 0)) {
            return lIIlIlIIlIllI[0];
        }
        if (m.lIlIlIllIllllII(var1.I.turnOffRun() ? 1 : 0) && m.lIlIlIllIllllIl(var1.J.l() ? 1 : 0) && m.lIlIlIllIlllllI(var1.J.k(), lIIlIlIIlIllI[1])) {
            return lIIlIlIIlIllI[0];
        }
        Movement.toggleRun();
        return lIIlIlIIlIllI[2];
    }

    private static boolean lIlIlIllIllllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIllIllllIl(int n2) {
        return n2 == 0;
    }

    static {
        m.lIlIlIllIlllIll();
    }

    private static boolean lIlIlIllIlllllI(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public EnablingRunTask(SquireSaraConfig squireSaraConfig, g g2) {
        this.I = squireSaraConfig;
        this.J = g2;
    }
}

