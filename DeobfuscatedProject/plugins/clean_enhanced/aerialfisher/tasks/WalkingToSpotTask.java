/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.aerialfisher.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Walking to spot", priority=5, blocking=true)
public class WalkingToSpotTask
extends Task {
    private static final  WorldPoint m;

    public boolean run() {
        if (f.var2(Players.getLocal().getWorldLocation().equals((Object)m) ? 1 : 0)) {
            return var1[0];
        }
        Movement.setDestination((WorldPoint)m);
        return var1[1];
    }

    private static void var3() {
        var1 = new int[4];
        f.var1[0] = (0x33 ^ 0x42 ^ (0x1A ^ 0x7B)) & (0x93 ^ 0x84 ^ (0x83 ^ 0x84) ^ -1);
        f.var1[1] = 1;
        f.var1[2] = 0xFFFF956B & 0x6FF4;
        f.var1[3] = 0xFFFFDFAD & 0x2E7F;
    }

    static {
        f.var3();
        m = new WorldPoint(var1[2], var1[3], var1[0]);
    }

    private static boolean var2(int n) {
        return n != 0;
    }
}

