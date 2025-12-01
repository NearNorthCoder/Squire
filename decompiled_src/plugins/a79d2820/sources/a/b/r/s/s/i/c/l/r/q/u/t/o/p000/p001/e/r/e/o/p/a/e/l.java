package a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import net.runelite.api.GameState;
import net.runelite.api.World;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Worlds;
@TaskDesc(name = "Hopping for free world", priority = Integer.MAX_VALUE, blocking = true, register = true)
/* renamed from: a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.l  reason: invalid package */
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:a/b/r/s/s/i/c/l/r/q/u/t/o/-/-/e/r/e/o/p/a/e/l.class */
public class l extends m {
    @Inject
    private /* synthetic */ SquireCorp p;
    private static /* synthetic */ int[] lIlIllllIIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (lllIIIlIIIllIl(gameStateChanged.getGameState(), GameState.HOPPING)) {
            this.p.c(lIlIllllIIlI[0]);
        }
    }

    private static boolean lllIIIlIIIllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lllIIIlIIIlIll(int i) {
        return i == 0;
    }

    private static boolean lllIIIlIIIllII(Object obj) {
        return obj == null;
    }

    private static void lllIIIlIIIlIlI() {
        lIlIllllIIlI = new int[2];
        lIlIllllIIlI[0] = ((177 ^ 159) ^ (32 ^ 38)) & (("  ".length() ^ (121 ^ 83)) ^ (-" ".length()));
        lIlIllllIIlI[1] = " ".length();
    }

    private static boolean lllIIIlIIIlllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    public boolean run() {
        if (!lllIIIlIIIlIll(this.p.d() ? 1 : 0) && !lllIIIlIIIlIll(l() ? 1 : 0)) {
            World random = Worlds.getRandom(world -> {
                if (lllIIIlIIIlllI(world.isNormal() ? 1 : 0) && lllIIIlIIIlllI(world.isMembers() ? 1 : 0)) {
                    ?? r0 = lIlIllllIIlI[1];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIllllIIlI[0];
            });
            if (lllIIIlIIIllII(random)) {
                return lIlIllllIIlI[0];
            }
            if (lllIIIlIIIlIll(Worlds.isHopperOpen() ? 1 : 0)) {
                Worlds.openHopper();
                return lIlIllllIIlI[1];
            }
            Worlds.hopTo(random);
            return lIlIllllIIlI[1];
        }
        return lIlIllllIIlI[0];
    }

    static {
        lllIIIlIIIlIlI();
    }
}
