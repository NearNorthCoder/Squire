package i.e.e.f.s.q.i.e.h.r.p000.r.u.s.l.a.p001.r.i.a;

import com.google.inject.Inject;
import gg.squire.aerialfisher.SquireAerialFisherConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
@TaskDesc(name = "Hopping to avoid nearby player", priority = 10, blocking = true)
/* renamed from: i.e.e.f.s.q.i.e.h.r.-.r.u.s.l.a.-.r.i.a.e  reason: invalid package */
/* loaded from: 9bb83689-ff7d-471d-9a08-411d7484ad87.jar:i/e/e/f/s/q/i/e/h/r/-/r/u/s/l/a/-/r/i/a/e.class */
public class e extends Task {
    private static /* synthetic */ int[] lIlIlllIlIl;
    private final /* synthetic */ SquireAerialFisherConfig l;

    private static boolean lIIlIlIIIIIIIl(int i2, int i3) {
        return i2 < i3;
    }

    @Inject
    public e(SquireAerialFisherConfig squireAerialFisherConfig) {
        this.l = squireAerialFisherConfig;
    }

    private static boolean lIIlIIllllllll(int i2) {
        return i2 != 0;
    }

    private static void lIIlIIllllllII() {
        lIlIlllIlIl = new int[4];
        lIlIlllIlIl[0] = ((((25 + 73) - 40) + 152) ^ (((39 + 92) - 25) + 31)) & (((38 ^ 98) ^ (151 ^ 136)) ^ (-" ".length()));
        lIlIlllIlIl[1] = 198 ^ 194;
        lIlIlllIlIl[2] = " ".length();
        lIlIlllIlIl[3] = (-((-1187) & 27899)) & (-4100) & 31711;
    }

    private static boolean lIIlIIlllllllI(int i2) {
        return i2 == 0;
    }

    private static boolean lIIlIlIIIIIIII(int i2, int i3) {
        return i2 != i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!lIIlIIllllllIl(Players.getNearest(player -> {
            if (lIIlIlIIIIIIlI(player, Players.getLocal())) {
                ?? r0 = lIlIlllIlIl[2];
                "".length();
                return " ".length() > (18 ^ 22) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIlllIlIl[0];
        })) || lIIlIIlllllllI(this.l.hopWorlds() ? 1 : 0)) {
            return lIlIlllIlIl[0];
        }
        Worlds.hopTo(Worlds.getRandom(world -> {
            if (lIIlIIllllllll(world.isNormal() ? 1 : 0) && lIIlIIllllllll(world.isMembers() ? 1 : 0) && lIIlIlIIIIIIII(world.getId(), Worlds.getCurrentId()) && lIIlIlIIIIIIIl(world.getPlayerCount(), lIlIlllIlIl[3])) {
                ?? r0 = lIlIlllIlIl[2];
                "".length();
                return (-"   ".length()) > 0 ? ((214 ^ 145) ^ (27 ^ 22)) & (((47 ^ 99) ^ (86 ^ 80)) ^ (-" ".length())) : r0;
            }
            return lIlIlllIlIl[0];
        }));
        sleep(lIlIlllIlIl[1]);
        return lIlIlllIlIl[2];
    }

    static {
        lIIlIIllllllII();
    }

    private static boolean lIIlIIllllllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIlIIIIIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }
}
