/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;

@TaskDesc(name="Going to house", priority=50)
public class GoingToHouseTask
extends Task {
    
    private final  SquireBarrowsConfig am;
    private final  SquireBarrows al;

    static {
        x.var2();
    }

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public GoingToHouseTask(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.al = squireBarrows;
        this.am = squireBarrowsConfig;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static void var2() {
        var1 = new int[3];
        x.var1[0] = (0xFE ^ 0xC2) & ~(0x93 ^ 0xAF);
        x.var1[1] = 0x25 ^ 6 ^ (0x17 ^ 0x32);
        x.var1[2] = 1;
    }

    public boolean run() {
        x var5;
        if (x.var4(this.am.useHouse() ? 1 : 0)) {
            return var1[0];
        }
        if (x.var4(var5.al.h() ? 1 : 0)) {
            return var1[0];
        }
        if (x.var3(var5.al.e(), var1[1])) {
            return var1[0];
        }
        if (x.var4(var5.al.v() ? 1 : 0)) {
            return var1[0];
        }
        if (x.var4(TeleportLoader.canEnterHouse() ? 1 : 0)) {
            return var1[0];
        }
        TeleportLoader.enterHouse();
        0;
        return var1[2];
    }
}

