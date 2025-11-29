/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.World
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Worlds
 */
package gg.squire.aerialfisher.tasks;

import com.google.inject.Inject;
import gg.squire.aerialfisher.SquireAerialFisherConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;

@TaskDesc(name="Hopping to avoid nearby player", priority=10, blocking=true)
public class HoppingToAvoidNearbyPlayerTask
extends Task {
    
    private final  SquireAerialFisherConfig l;

    private static boolean var2(int n, int n2) {
        return n < n2;
    }

    @Inject
    public HoppingToAvoidNearbyPlayerTask(SquireAerialFisherConfig squireAerialFisherConfig) {
        this.l = squireAerialFisherConfig;
    }

    private static boolean var3(int n) {
        return n != 0;
    }

    private static void var4() {
        var1 = new int[4];
        e.var1[0] = (25 + 73 - 40 + 152 ^ 39 + 92 - 25 + 31) & (0x26 ^ 0x62 ^ (0x97 ^ 0x88) ^ -1);
        e.var1[1] = 0xC6 ^ 0xC2;
        e.var1[2] = 1;
        e.var1[3] = -(0xFFFFFB5D & 0x6CFB) & (0xFFFFEFFC & 0x7BDF);
    }

    private static boolean var5(int n) {
        return n == 0;
    }

    private static boolean var6(int n, int n2) {
        return n != n2;
    }

    public boolean run() {
        Player player2 = Players.getNearest(player -> {
            boolean bl;
            if (e.var7(player, Players.getLocal())) {
                bl = var1[2];
                0;
                if (1 > (0x12 ^ 0x16)) {
                    return ((0x29 ^ 6) & ~(0x14 ^ 0x3B)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        });
        if (!e.var8(player2) || e.var5(this.l.hopWorlds() ? 1 : 0)) {
            return var1[0];
        }
        Worlds.hopTo((World)Worlds.getRandom(world -> {
            int n;
            if (e.var3(world.isNormal() ? 1 : 0) && e.var3(world.isMembers() ? 1 : 0) && e.var6(world.getId(), Worlds.getCurrentId()) && e.var2(world.getPlayerCount(), var1[3])) {
                n = var1[2];
                0;
                if (-3 > 0) {
                    return ((0xD6 ^ 0x91 ^ (0x1B ^ 0x16)) & (0x2F ^ 0x63 ^ (0x56 ^ 0x50) ^ -1)) != 0;
                }
            } else {
                n = var1[0];
            }
            return n != 0;
        }));
        this.sleep(var1[1]);
        return var1[2];
    }

    static {
        e.var4();
    }

    private static boolean var8(Object object) {
        return object != null;
    }

    private static boolean var7(Object object, Object object2) {
        return object != object2;
    }
}

