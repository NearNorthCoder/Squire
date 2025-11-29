/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.D;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

public abstract class Y
extends D {
    private static /* synthetic */ int[] llllIIIllIII;

    static {
        Y.lIIIllllIIlIIIl();
    }

    @Override
    public boolean run() {
        if (Y.lIIIllllIIlIIlI(this.cW.ad() ? 1 : 0)) {
            return llllIIIllIII[0];
        }
        if (Y.lIIIllllIIlIIll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llllIIIllIII[0];
        }
        if (Y.lIIIllllIIlIlII(Players.getLocal().getWorldLocation().getPlane(), llllIIIllIII[1])) {
            return llllIIIllIII[0];
        }
        return this.bY();
    }

    private static void lIIIllllIIlIIIl() {
        llllIIIllIII = new int[2];
        Y.llllIIIllIII[0] = (0x94 ^ 0x9C) & ~(0xB8 ^ 0xB0);
        Y.llllIIIllIII[1] = 3;
    }

    private static boolean lIIIllllIIlIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllllIIlIIlI(int n2) {
        return n2 == 0;
    }

    @Inject
    protected Y(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static boolean lIIIllllIIlIlII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public abstract boolean bY();
}

