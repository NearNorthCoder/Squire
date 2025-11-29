/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.client.Static
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.Static;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.D;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

/* TASK: Logging out before 6h timer -> Loggingoutbefore6HtimerTask */
@TaskDesc(name="Logging out before 6h timer", priority=2147482309, blocking=true, register=true)
public class aC
extends D {
    private static /* synthetic */ int[] llllIlllIIlI;

    private static void lIIlIIIlllIlIll() {
        llllIlllIIlI = new int[2];
        aC.llllIlllIIlI[0] = (0x1E ^ 0x4A ^ (0x56 ^ 0x5C)) & (0x29 ^ 0x11 ^ (0x32 ^ 0x54) ^ -1);
        aC.llllIlllIIlI[1] = 1;
    }

    @Inject
    protected aC(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static boolean lIIlIIIlllIllII(int n2) {
        return n2 == 0;
    }

    static {
        aC.lIIlIIIlllIlIll();
    }

    private static boolean lIIlIIIlllIllIl(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean bY() {
        if (aC.lIIlIIIlllIllII(this.cW.G() ? 1 : 0)) {
            return llllIlllIIlI[0];
        }
        if (aC.lIIlIIIlllIllIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llllIlllIIlI[0];
        }
        Game.logout();
        return llllIlllIIlI[1];
    }
}

