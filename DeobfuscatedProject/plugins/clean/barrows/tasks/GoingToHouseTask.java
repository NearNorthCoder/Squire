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
        x.lIllIllIIIlIlI();
    }

    private static boolean lIllIllIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public GoingToHouseTask(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.al = squireBarrows;
        this.am = squireBarrowsConfig;
    }

    private static boolean lIllIllIIIlIll(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        x var1;
        if (x.lIllIllIIIlIll(this.am.useHouse() ? 1 : 0)) {
            return llllIllIIlI[0];
        }
        if (x.lIllIllIIIlIll(var1.al.h() ? 1 : 0)) {
            return llllIllIIlI[0];
        }
        if (x.lIllIllIIIllII(var1.al.e(), llllIllIIlI[1])) {
            return llllIllIIlI[0];
        }
        if (x.lIllIllIIIlIll(var1.al.v() ? 1 : 0)) {
            return llllIllIIlI[0];
        }
        if (x.lIllIllIIIlIll(TeleportLoader.canEnterHouse() ? 1 : 0)) {
            return llllIllIIlI[0];
        }
        TeleportLoader.enterHouse();

        return llllIllIIlI[2];
    }
}

