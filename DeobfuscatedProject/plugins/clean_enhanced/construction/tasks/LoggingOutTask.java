/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.game.Game
 */
package gg.squire.construction.tasks;

import gg.squire.basics.log.RelogConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Game;

@TaskDesc(name="Logging Out", register=true)
public class LoggingOutTask
extends Task {
    private  int dY;
    private final  Client dX;
    private final  RelogConfig dW;
    private static  int[] lllIIIlll;

    static {
        aD.var1();
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        this.dY += 2;
    }

    public boolean run() {
        aD var2;
        if ((Game.getState() != Game.getState()2)) {
            return 0;
        }
        if (!(Game.isInCutscene( == 0) ? 1 : 0) || (var2.dX.isInInstancedRegion( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var2.dW.logOutPlayer( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var2.dY < 1 * var2.dW.logoutMinutes())) {
            return 0;
        }
        Game.logout();
        return 2;
    }

    @Inject
    public LoggingOutTask(RelogConfig relogConfig, Client client) {
        this.dW = relogConfig;
        this.dX = client;
    }
}

