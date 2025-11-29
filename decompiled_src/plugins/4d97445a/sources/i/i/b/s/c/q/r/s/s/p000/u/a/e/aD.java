package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.log.RelogConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Game;
@TaskDesc(name = "Logging Out", register = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aD  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aD.class */
public class aD extends Task {
    private /* synthetic */ int dY;
    private final /* synthetic */ Client dX;
    private final /* synthetic */ RelogConfig dW;
    private static /* synthetic */ int[] lllIIIlll;

    private static boolean llIIIIlIlll(int i2, int i3) {
        return i2 < i3;
    }

    static {
        llIIIIlIIll();
    }

    private static void llIIIIlIIll() {
        lllIIIlll = new int[3];
        lllIIIlll[0] = (162 ^ 150) & ((72 ^ 124) ^ (-1));
        lllIIIlll[1] = (((84 + 156) - 122) + 92) ^ (((99 + 72) - (-11)) + 0);
        lllIIIlll[2] = " ".length();
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        this.dY += lllIIIlll[2];
    }

    private static boolean llIIIIlIllI(int i2) {
        return i2 != 0;
    }

    private static boolean llIIIIlIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (llIIIIlIlII(Game.getState(), GameState.LOGGED_IN)) {
            return lllIIIlll[0];
        }
        if (!llIIIIlIlIl(Game.isInCutscene() ? 1 : 0) || llIIIIlIllI(this.dX.isInInstancedRegion() ? 1 : 0)) {
            return lllIIIlll[0];
        }
        if (!llIIIIlIlIl(this.dW.logOutPlayer() ? 1 : 0) && !llIIIIlIlll(this.dY, lllIIIlll[1] * this.dW.logoutMinutes())) {
            Game.logout();
            return lllIIIlll[2];
        }
        return lllIIIlll[0];
    }

    private static boolean llIIIIlIlIl(int i2) {
        return i2 == 0;
    }

    @Inject
    public aD(RelogConfig relogConfig, Client client) {
        this.dW = relogConfig;
        this.dX = client;
    }
}
