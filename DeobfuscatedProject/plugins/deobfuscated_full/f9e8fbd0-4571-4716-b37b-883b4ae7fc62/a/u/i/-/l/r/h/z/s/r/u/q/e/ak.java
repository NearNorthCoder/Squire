/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Combat
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.am;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.unethicalite.api.game.Combat;

/* TASK: Drinking potions -> DrinkPotionsTask */
@TaskDesc(name="Drinking potions", priority=5)
public class ak
extends am {
    private static /* synthetic */ int[] lIllIlIllllll;

    private static void llIIlIIIlIIIlll() {
        lIllIlIllllll = new int[1];
        ak.lIllIlIllllll[0] = 48 + 71 - 105 + 161 ^ 11 + 92 - 24 + 78;
    }

    @Inject
    protected ak(Client client, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
    }

    static {
        ak.llIIlIIIlIIIlll();
    }

    @Override
    public boolean ac() {
        return Combat.drinkBoostingPotion((int)lIllIlIllllll[0]);
    }
}

