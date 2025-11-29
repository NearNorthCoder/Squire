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
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.m;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import net.runelite.api.GameState;
import net.runelite.api.World;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Worlds;

@TaskDesc(name="Hopping for free world", priority=0x7FFFFFFF, blocking=true, register=true)
public class l
extends m {
    @Inject
    private /* synthetic */ SquireCorp p;
    private static /* synthetic */ int[] lIlIllllIIlI;

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (l.lllIIIlIIIllIl(gameStateChanged.getGameState(), GameState.HOPPING)) {
            this.p.c(lIlIllllIIlI[0]);
        }
    }

    private static boolean lllIIIlIIIllIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllIIIlIIIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIlIIIllII(Object object) {
        return object == null;
    }

    private static void lllIIIlIIIlIlI() {
        lIlIllllIIlI = new int[2];
        l.lIlIllllIIlI[0] = (0xB1 ^ 0x9F ^ (0x20 ^ 0x26)) & ("  ".length() ^ (0x79 ^ 0x53) ^ -" ".length());
        l.lIlIllllIIlI[1] = " ".length();
    }

    private static boolean lllIIIlIIIlllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        l lllllllllllllllIllIIIlllIllIllll;
        if (l.lllIIIlIIIlIll(this.p.d() ? 1 : 0)) {
            return lIlIllllIIlI[0];
        }
        if (l.lllIIIlIIIlIll(lllllllllllllllIllIIIlllIllIllll.l() ? 1 : 0)) {
            return lIlIllllIIlI[0];
        }
        World lllllllllllllllIllIIIlllIllIlllI = Worlds.getRandom(world -> {
            int n2;
            if (l.lllIIIlIIIlllI(world.isNormal() ? 1 : 0) && l.lllIIIlIIIlllI(world.isMembers() ? 1 : 0)) {
                n2 = lIlIllllIIlI[1];
                "".length();
                if (((0xB9 ^ 0x90) & ~(0x6C ^ 0x45)) != 0) {
                    return ((0x19 ^ 0x47) & ~(0x76 ^ 0x28)) != 0;
                }
            } else {
                n2 = lIlIllllIIlI[0];
            }
            return n2 != 0;
        });
        if (l.lllIIIlIIIllII(lllllllllllllllIllIIIlllIllIlllI)) {
            return lIlIllllIIlI[0];
        }
        if (l.lllIIIlIIIlIll(Worlds.isHopperOpen() ? 1 : 0)) {
            Worlds.openHopper();
            return lIlIllllIIlI[1];
        }
        Worlds.hopTo((World)var1_1);
        return lIlIllllIIlI[1];
    }

    static {
        l.lllIIIlIIIlIlI();
    }
}

