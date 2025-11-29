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
        if (f.lIIlIIlllIlIll(Players.getLocal().getWorldLocation().equals((Object)m) ? 1 : 0)) {
            return lIlIllIlllI[0];
        }
        Movement.setDestination((WorldPoint)m);
        return lIlIllIlllI[1];
    }

    static {
        f.lIIlIIlllIlIlI();
        m = new WorldPoint(lIlIllIlllI[2], lIlIllIlllI[3], lIlIllIlllI[0]);
    }

    private static boolean lIIlIIlllIlIll(int n) {
        return n != 0;
    }
}

