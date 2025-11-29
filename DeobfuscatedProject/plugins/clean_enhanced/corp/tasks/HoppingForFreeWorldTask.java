/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GameState
 *  net.runelite.api.World
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.game.Worlds
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import net.runelite.api.GameState;
import net.runelite.api.World;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Worlds;

@TaskDesc(name="Hopping for free world", priority=0x7FFFFFFF, blocking=true, register=true)
public class HoppingForFreeWorldTask
extends CorpManager {
    @Inject
    private  SquireCorp p;

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if ((gameStateChanged.getGameState() == gameStateChanged.getGameState()2)) {
            this.p.c(0);
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        l var2;
        if ((this.p.d( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var2.HoppingForFreeWorldTask( == 0) ? 1 : 0)) {
            return 0;
        }
        World var3 = Worlds.getRandom(world -> {
            int n2;
            if ((world.isNormal( != 0) ? 1 : 0) && (world.isMembers( != 0) ? 1 : 0)) {
                n2 = 1;
                0;
                if (((0xB9 ^ 0x90) & ~(0x6C ^ 0x45)) != 0) {
                    return ((0x19 ^ 0x47) & ~(0x76 ^ 0x28)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var3 == null {
            return 0;
        }
        if ((Worlds.isHopperOpen( == 0) ? 1 : 0)) {
            Worlds.openHopper();
            return 1;
        }
        Worlds.hopTo((World)var1_1);
        return 1;
    }

    static {
        l.var4();
    }
}

