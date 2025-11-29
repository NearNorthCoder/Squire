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

    private static boolean lIIlIlIIIIIIIl(int n, int n2) {
        return n < n2;
    }

    @Inject
    public HoppingToAvoidNearbyPlayerTask(SquireAerialFisherConfig squireAerialFisherConfig) {
        this.l = squireAerialFisherConfig;
    }

    private static boolean lIIlIIllllllll(int n) {
        return n != 0;
    }

    private static boolean lIIlIIlllllllI(int n) {
        return n == 0;
    }

    private static boolean lIIlIlIIIIIIII(int n, int n2) {
        return n != n2;
    }

    public boolean run() {
        Player player2 = Players.getNearest(player -> {
            boolean bl;
            if (e.lIIlIlIIIIIIlI(player, Players.getLocal())) {
                bl = lIlIlllIlIl[2];

                if (1 > (0x12 ^ 0x16)) {
                    return false;
                }
            } else {
                bl = lIlIlllIlIl[0];
            }
            return bl;
        });
        if (!e.lIIlIIllllllIl(player2) || e.lIIlIIlllllllI(this.l.hopWorlds() ? 1 : 0)) {
            return lIlIlllIlIl[0];
        }
        Worlds.hopTo((World)Worlds.getRandom(world -> {
            int n;
            if (e.lIIlIIllllllll(world.isNormal() ? 1 : 0) && e.lIIlIIllllllll(world.isMembers() ? 1 : 0) && e.lIIlIlIIIIIIII(world.getId(), Worlds.getCurrentId()) && e.lIIlIlIIIIIIIl(world.getPlayerCount(), lIlIlllIlIl[3])) {
                n = lIlIlllIlIl[2];

            } else {
                n = lIlIlllIlIl[0];
            }
            return n != 0;
        }));
        this.sleep(lIlIlllIlIl[1]);
        return lIlIlllIlIl[2];
    }

    static {
        e.lIIlIIllllllII();
    }

    private static boolean lIIlIIllllllIl(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIIIIIIlI(Object object, Object object2) {
        return object != object2;
    }
}

