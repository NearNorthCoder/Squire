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
package i.e.e.f.s.q.i.e.h.r.-.r.u.s.l.a.-.r.i.a;

import com.google.inject.Inject;
import gg.squire.aerialfisher.SquireAerialFisherConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;

@TaskDesc(name="Hopping to avoid nearby player", priority=10, blocking=true)
public class e
extends Task {
    private static /* synthetic */ int[] lIlIlllIlIl;
    private final /* synthetic */ SquireAerialFisherConfig l;

    private static boolean lIIlIlIIIIIIIl(int n, int n2) {
        return n < n2;
    }

    @Inject
    public e(SquireAerialFisherConfig squireAerialFisherConfig) {
        this.l = squireAerialFisherConfig;
    }

    private static boolean lIIlIIllllllll(int n) {
        return n != 0;
    }

    private static void lIIlIIllllllII() {
        lIlIlllIlIl = new int[4];
        e.lIlIlllIlIl[0] = (25 + 73 - 40 + 152 ^ 39 + 92 - 25 + 31) & (0x26 ^ 0x62 ^ (0x97 ^ 0x88) ^ -" ".length());
        e.lIlIlllIlIl[1] = 0xC6 ^ 0xC2;
        e.lIlIlllIlIl[2] = " ".length();
        e.lIlIlllIlIl[3] = -(0xFFFFFB5D & 0x6CFB) & (0xFFFFEFFC & 0x7BDF);
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
                "".length();
                if (" ".length() > (0x12 ^ 0x16)) {
                    return ((0x29 ^ 6) & ~(0x14 ^ 0x3B)) != 0;
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
                "".length();
                if (-"   ".length() > 0) {
                    return ((0xD6 ^ 0x91 ^ (0x1B ^ 0x16)) & (0x2F ^ 0x63 ^ (0x56 ^ 0x50) ^ -" ".length())) != 0;
                }
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

