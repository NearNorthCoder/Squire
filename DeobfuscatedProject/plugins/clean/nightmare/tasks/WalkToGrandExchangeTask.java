/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Walk to Grand Exchange", priority=15837, blocking=true)
public class WalkToGrandExchangeTask
extends NightmareTaskBase {
    private final  WorldArea du;

    static {
        U.lIIIlllllIIIlIl();
    }

    @Inject
    protected WalkToGrandExchangeTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.du = S.ds;
    }

    private static boolean lIIIlllllIIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllllIIIllI(Object object) {
        return object == null;
    }

    private static boolean lIIIlllllIIlIII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ci() {
        U var1;
        Player player = Players.getLocal();
        if (U.lIIIlllllIIIllI(player)) {
            return llllIIlIlIIl[0];
        }
        if (U.lIIIlllllIIIlll(var1.cn() ? 1 : 0)) {
            return llllIIlIlIIl[0];
        }
        if (U.lIIIlllllIIlIII(Movement.shouldWalk() ? 1 : 0)) {
            return llllIIlIlIIl[0];
        }
        Movement.walkTo((WorldPoint)this.du.getCenter());

        return llllIIlIlIIl[1];
    }

}

