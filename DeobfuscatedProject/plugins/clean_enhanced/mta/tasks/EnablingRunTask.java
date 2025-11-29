/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.mta.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Enabling run", priority=100)
public class EnablingRunTask
extends Task {
    
    private  int ax;

    static {
        t.var2();
    }

    public EnablingRunTask() {
        this.ax = var1[0];
    }

    private static void var2() {
        var1 = new int[5];
        t.var1[0] = 0xF ^ 0x1B;
        t.var1[1] = (2 ^ 0x69 ^ (0x4C ^ 0x79)) & (60 + 141 - 15 + 17 ^ 58 + 59 - 57 + 89 ^ -1);
        t.var1[2] = 129 + 68 - 86 + 44 ^ 55 + 56 - 28 + 75;
        t.var1[3] = 0xEF ^ 0x93 ^ (0xF7 ^ 0x92);
        t.var1[4] = 1;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        if (!t.var4(Movement.getRunEnergy(), this.ax) || t.var3(Movement.isRunEnabled() ? 1 : 0)) {
            return var1[1];
        }
        Movement.toggleRun();
        this.ax = Rand.nextInt((int)var1[2], (int)var1[3]);
        return var1[4];
    }

    private static boolean var4(int n2, int n3) {
        return n2 >= n3;
    }
}

