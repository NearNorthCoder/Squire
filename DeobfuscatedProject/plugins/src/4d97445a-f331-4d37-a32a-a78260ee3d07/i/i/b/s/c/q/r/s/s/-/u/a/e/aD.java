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
package i.i.b.s.c.q.r.s.s.-.u.a.e;

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
public class aD
extends Task {
    private /* synthetic */ int dY;
    private final /* synthetic */ Client dX;
    private final /* synthetic */ RelogConfig dW;
    private static /* synthetic */ int[] lllIIIlll;

    private static boolean llIIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        aD.llIIIIlIIll();
    }

    private static void llIIIIlIIll() {
        lllIIIlll = new int[3];
        aD.lllIIIlll[0] = (0xA2 ^ 0x96) & ~(0x48 ^ 0x7C);
        aD.lllIIIlll[1] = 84 + 156 - 122 + 92 ^ 99 + 72 - -11 + 0;
        aD.lllIIIlll[2] = " ".length();
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
    public aD(RelogConfig relogConfig, Client client) {
        this.dW = relogConfig;
        this.dX = client;
    }
}

