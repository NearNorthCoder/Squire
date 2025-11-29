/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Bank
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import net.unethicalite.api.items.Bank;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.F;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

/* TASK: Walking to bank -> WalkToBankTask */
@TaskDesc(name="Walking to bank", priority=250, blocking=true)
public class H
extends F {
    private static /* synthetic */ int[] lllIlllllIlI;

    private static boolean lIIIlllIIlIllII(int n2) {
        return n2 == 0;
    }

    @Inject
    protected H(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    @Override
    public boolean bY() {
        H var1;
        if (H.lIIIlllIIlIlIlI(this.cW.ad() ? 1 : 0)) {
            return lllIlllllIlI[0];
        }
        if (H.lIIIlllIIlIlIlI(var1.cW.ae() ? 1 : 0)) {
            return lllIlllllIlI[0];
        }
        if (H.lIIIlllIIlIllII(var1.cW.s() ? 1 : 0)) {
            return lllIlllllIlI[0];
        }
        if (H.lIIIlllIIlIlIlI(Bank.isOpen() ? 1 : 0)) {
            return lllIlllllIlI[0];
        }
        if (H.lIIIlllIIlIlIlI(var1.cc() ? 1 : 0)) {
            return lllIlllllIlI[0];
        }
        return this.cV.bankLocation().bI().getAsBoolean();
    }

    static {
        H.lIIIlllIIlIlIII();
    }

    private static void lIIIlllIIlIlIII() {
        lllIlllllIlI = new int[1];
        H.lllIlllllIlI[0] = (1 ^ (0xF5 ^ 0xB3)) & (0xE5 ^ 0xA8 ^ (0x82 ^ 0x88) ^ -1);
    }

    private static boolean lIIIlllIIlIlIlI(int n2) {
        return n2 != 0;
    }
}

