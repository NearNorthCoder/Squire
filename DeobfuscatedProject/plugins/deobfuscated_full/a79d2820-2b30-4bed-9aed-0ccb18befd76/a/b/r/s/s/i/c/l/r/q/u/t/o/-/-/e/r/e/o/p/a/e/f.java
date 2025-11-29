/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 */
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.a;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;

/* TASK: Drinking boost -> DrinkingboostTask */
@TaskDesc(name="Drinking boost")
public class f
extends a {
    private static /* synthetic */ int[] lIlIlllIIllI;

    private static boolean lllIIIIllIIIIl(Object object) {
        return object == null;
    }

    private static void lllIIIIlIlllll() {
        lIlIlllIIllI = new int[1];
        f.lIlIlllIIllI[0] = (0x23 ^ 0x25 ^ (0xF7 ^ 0xBC)) & (210 + 0 - 139 + 145 ^ 71 + 36 - 36 + 78 ^ -1);
    }

    static {
        f.lllIIIIlIlllll();
    }

    public boolean run() {
        if (f.lllIIIIllIIIII(this.g() ? 1 : 0)) {
            return lIlIlllIIllI[0];
        }
        if (f.lllIIIIllIIIIl(Players.getLocal().getInteracting())) {
            return lIlIlllIIllI[0];
        }
        return Combat.drinkBoostingPotion((int)this.o.boostPercentage());
    }

    private static boolean lllIIIIllIIIII(int n2) {
        return n2 == 0;
    }
}

