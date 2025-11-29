/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;

@TaskDesc(name="Drinking Combat Potion", priority=109)
public class F
extends w {
    private static /* synthetic */ int[] lIlIlIlllIIIl;

    private static boolean lIllllllllIIIll(Object object) {
        return object != null;
    }

    @Override
    public boolean Q() {
        int[] nArray = new int[lIlIlIlllIIIl[0]];
        nArray[F.lIlIlIlllIIIl[1]] = lIlIlIlllIIIl[2];
        if (F.lIllllllllIIIll(Projectiles.getNearest((int[])nArray))) {
            return lIlIlIlllIIIl[1];
        }
        this.cg.a(this.cf.getTickCount());
        return Combat.drinkBoostingPotion((int)lIlIlIlllIIIl[3]);
    }

    static {
        F.lIllllllllIIIlI();
    }

    private static void lIllllllllIIIlI() {
        lIlIlIlllIIIl = new int[4];
        F.lIlIlIlllIIIl[0] = " ".length();
        F.lIlIlIlllIIIl[1] = (0xDC ^ 0x84) & ~(0xCE ^ 0x96);
        F.lIlIlIlllIIIl[2] = -(0xFFFFAF67 & 0x72BD) & (0xFFFFEFEF & 0x37FD);
        F.lIlIlIlllIIIl[3] = 0x49 ^ 0x13;
    }

    @Inject
    protected F(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }
}

