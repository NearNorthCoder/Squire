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
        U.var2();
    }

    @Inject
    protected WalkToGrandExchangeTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.du = S.ds;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ci() {
        U var6;
        Player player = Players.getLocal();
        if (U.var4(player)) {
            return var1[0];
        }
        if (U.var3(var6.cn() ? 1 : 0)) {
            return var1[0];
        }
        if (U.var5(Movement.shouldWalk() ? 1 : 0)) {
            return var1[0];
        }
        Movement.walkTo((WorldPoint)this.du.getCenter());
        0;
        return var1[1];
    }

    private static void var2() {
        var1 = new int[2];
        U.var1[0] = (0xF0 ^ 0xB5) & ~(0xCC ^ 0x89);
        U.var1[1] = 1;
    }
}

