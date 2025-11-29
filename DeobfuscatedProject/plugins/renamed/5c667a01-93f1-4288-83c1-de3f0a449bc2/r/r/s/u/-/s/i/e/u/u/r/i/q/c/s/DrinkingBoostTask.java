/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Combat
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import net.runelite.api.Client;
import net.unethicalite.api.game.Combat;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a_Unknown;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.b_Unknown;

/* TASK: Drinking boost -> DrinkingboostTask */
@TaskDesc(name="Drinking boost", priority=10000)
public class DrinkingBoostTask
extends a_Unknown {
    private static /* synthetic */ int[] lIIlIlIllIIll;

    static {
        o.lIlIllIIIlIIllI();
    }

    private static void lIlIllIIIlIIllI() {
        lIIlIlIllIIll = new int[1];
        o.lIIlIlIllIIll[0] = 0xA7 ^ 0x95;
    }

    @Override
    public boolean a() {
        return Combat.drinkBoostingPotion((int)lIIlIlIllIIll[0]);
    }

    @Inject
    protected o(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2, Client client) {
        super(squireScurrius, squireScurriusConfig, b2, client);
    }
}

