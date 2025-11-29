/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.S;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

/* TASK: Walk to Grand Exchange -> WalktograndexchangeTask */
@TaskDesc(name="Walk to Grand Exchange", priority=15837, blocking=true)
public class U
extends S {
    private final /* synthetic */ WorldArea du;
    private static /* synthetic */ int[] llllIIlIlIIl;

    static {
        U.lIIIlllllIIIlIl();
    }

    @Inject
    protected U(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.du = S.ds;
    }

    private static boolean lIIIlllllIIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllllIIIllI(Object object) {
        return object == null;
    }

    private static boolean lIIIlllllIIlIII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ci() {
        U var1;
        Player player = Players.getLocal();
        if (U.lIIIlllllIIIllI(player)) {
            return llllIIlIlIIl[0];
        }
        if (U.lIIIlllllIIIlll(var1.cn() ? 1 : 0)) {
            return llllIIlIlIIl[0];
        }
        if (U.lIIIlllllIIlIII(Movement.shouldWalk() ? 1 : 0)) {
            return llllIIlIlIIl[0];
        }
        Movement.walkTo((WorldPoint)this.du.getCenter());
        0;
        return llllIIlIlIIl[1];
    }

    private static void lIIIlllllIIIlIl() {
        llllIIlIlIIl = new int[2];
        U.llllIIlIlIIl[0] = (0xF0 ^ 0xB5) & ~(0xCC ^ 0x89);
        U.llllIIlIlIIl[1] = 1;
    }
}

