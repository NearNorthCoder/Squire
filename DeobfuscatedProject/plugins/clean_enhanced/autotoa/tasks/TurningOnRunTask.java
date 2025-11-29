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

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    static {
        aa.var3();
    }

    @Inject
    public TurningOnRunTask(SquireAutoTOA squireAutoTOA) {
        this.cx = squireAutoTOA;
    }

    private static void var3() {
        var1 = new int[3];
        aa.var1[0] = (0xE7 ^ 0x85 ^ (5 ^ 0x57)) & (0x56 ^ 0x30 ^ (3 ^ 0x55) ^ -1);
        aa.var1[1] = 0x9E ^ 0x80 ^ (0x88 ^ 0x9C);
        aa.var1[2] = 1;
    }

    public boolean run() {
        if (aa.var2(this.cx.d() ? 1 : 0)) {
            return var1[0];
        }
        if (aa.var4(Movement.getRunEnergy(), var1[1]) && aa.var5(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return var1[2];
        }
        return var1[0];
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static boolean var4(int n2, int n3) {
        return n2 > n3;
    }
}

