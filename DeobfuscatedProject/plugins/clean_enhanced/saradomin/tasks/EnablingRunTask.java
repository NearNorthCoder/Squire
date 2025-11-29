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
        m var2;
        if (m.var3(Movement.isRunEnabled() ? 1 : 0)) {
            return var1[0];
        }
        if (m.var3(var2.I.turnOffRun() ? 1 : 0) && m.var4(var2.J.l() ? 1 : 0) && m.var5(var2.J.k(), var1[1])) {
            return var1[0];
        }
        Movement.toggleRun();
        return var1[2];
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    static {
        m.var6();
    }

    private static boolean var5(int n2, int n3) {
        return n2 > n3;
    }

    private static void var6() {
        var1 = new int[3];
        m.var1[0] = (0xFB ^ 0xA0 ^ 3) & (54 + 15 - 33 + 185 ^ 14 + 84 - 28 + 63 ^ -1);
        m.var1[1] = 71 + 52 - -19 + 36 ^ 35 + 121 - 139 + 167;
        m.var1[2] = 1;
    }

    @Inject
    public EnablingRunTask(SquireSaraConfig squireSaraConfig, g g2) {
        this.I = squireSaraConfig;
        this.J = g2;
    }
}

