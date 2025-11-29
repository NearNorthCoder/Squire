/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.a;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;

/* TASK: Drinking boost -> DrinkingboostTask */
@TaskDesc(name="Drinking boost", priority=7777)
public class s
extends Task {
    private final /* synthetic */ a aC;
    private static /* synthetic */ int[] lIIIIlIIl;

    private static boolean lllIlIIlll(Object object) {
        return object == null;
    }

    static {
        s.lllIlIIlIl();
    }

    private static void lllIlIIlIl() {
        lIIIIlIIl = new int[2];
        s.lIIIIlIIl[0] = (0x81 ^ 0xAF ^ (0x36 ^ 0x78)) & (0x43 ^ 0x4D ^ (0x4B ^ 0x25) ^ -1);
        s.lIIIIlIIl[1] = 2 ^ 0x30;
    }

    public boolean run() {
        if (!s.lllIlIIllI(this.aC.k()) || s.lllIlIIlll(this.aC.k().y())) {
            return lIIIIlIIl[0];
        }
        if (s.lllIlIIlll(Players.getLocal().getInteracting())) {
            return lIIIIlIIl[0];
        }
        return Combat.drinkBoostingPotion((int)lIIIIlIIl[1]);
    }

    @Inject
    public s(a a2) {
        this.aC = a2;
    }

    private static boolean lllIlIIllI(Object object) {
        return object != null;
    }
}

