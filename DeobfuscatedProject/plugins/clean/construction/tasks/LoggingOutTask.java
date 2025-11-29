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

    private static boolean llIIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        aD.llIIIIlIIll();
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        this.dY += lllIIIlll[2];
    }

    private static boolean llIIIIlIllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIlIlII(Object object, Object object2) {
        return object != object2;
    }

    public boolean run() {
        aD lIlIllIIllIIlII;
        if (aD.llIIIIlIlII(Game.getState(), GameState.LOGGED_IN)) {
            return lllIIIlll[0];
        }
        if (!aD.llIIIIlIlIl(Game.isInCutscene() ? 1 : 0) || aD.llIIIIlIllI(lIlIllIIllIIlII.dX.isInInstancedRegion() ? 1 : 0)) {
            return lllIIIlll[0];
        }
        if (aD.llIIIIlIlIl(lIlIllIIllIIlII.dW.logOutPlayer() ? 1 : 0)) {
            return lllIIIlll[0];
        }
        if (aD.llIIIIlIlll(lIlIllIIllIIlII.dY, lllIIIlll[1] * lIlIllIIllIIlII.dW.logoutMinutes())) {
            return lllIIIlll[0];
        }
        Game.logout();
        return lllIIIlll[2];
    }

    private static boolean llIIIIlIlIl(int n2) {
        return n2 == 0;
    }

    @Inject
    public LoggingOutTask(RelogConfig relogConfig, Client client) {
        this.dW = relogConfig;
        this.dX = client;
    }
}

