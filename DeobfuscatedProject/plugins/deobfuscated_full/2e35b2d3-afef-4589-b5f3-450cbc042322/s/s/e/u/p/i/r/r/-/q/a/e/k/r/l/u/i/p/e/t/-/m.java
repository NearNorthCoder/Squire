/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.House
 */
package s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.unethicalite.api.game.House;

/* TASK: Restoring from pool -> RestoringfrompoolTask */
@TaskDesc(name="Restoring from pool", priority=0x7FFFFFFF, blocking=true)
public class m
extends Task {
    private final /* synthetic */ Client J;
    private static /* synthetic */ int[] lIlIIlIlIIIll;

    public boolean run() {
        if (m.lIlllIlIlllIlll(House.isInside() ? 1 : 0)) {
            return lIlIIlIlIIIll[0];
        }
        if (m.lIlllIlIlllIlll(House.isPoolDrinkUseful() ? 1 : 0)) {
            return lIlIIlIlIIIll[0];
        }
        return House.drinkFromPool();
    }

    private static void lIlllIlIlllIllI() {
        lIlIIlIlIIIll = new int[1];
        m.lIlIIlIlIIIll[0] = (0x67 ^ 0x36) & ~(0x7A ^ 0x2B);
    }

    @Inject
    public m(Client client) {
        this.J = client;
    }

    static {
        m.lIlllIlIlllIllI();
    }

    private static boolean lIlllIlIlllIlll(int n2) {
        return n2 == 0;
    }
}

