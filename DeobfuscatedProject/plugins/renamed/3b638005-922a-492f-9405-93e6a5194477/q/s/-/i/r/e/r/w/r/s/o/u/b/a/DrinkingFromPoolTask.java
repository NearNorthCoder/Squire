/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.game.House
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.unethicalite.api.game.House;

/* TASK: Drinking from pool -> DrinkingfrompoolTask */
@TaskDesc(name="Drinking from pool", priority=250, blocking=true)
public class DrinkingFromPoolTask
extends Task {
    private static /* synthetic */ int[] lllIlllllIl;
    private final /* synthetic */ SquireBarrows af;

    private static boolean lIllIIlIlIlllI(int n2) {
        return n2 == 0;
    }

    @Inject
    public t(SquireBarrows squireBarrows) {
        this.af = squireBarrows;
    }

    public boolean run() {
        t var1;
        if (t.lIllIIlIlIlllI(House.isInside() ? 1 : 0)) {
            return lllIlllllIl[0];
        }
        var1.af.b(lllIlllllIl[0]);
        if (t.lIllIIlIlIlllI(House.isPoolDrinkUseful() ? 1 : 0)) {
            return lllIlllllIl[0];
        }
        return House.drinkFromPool();
    }

    static {
        t.lIllIIlIlIllIl();
    }

    private static void lIllIIlIlIllIl() {
        lllIlllllIl = new int[1];
        t.lllIlllllIl[0] = (92 + 158 - 95 + 40 ^ 131 + 18 - 2 + 9) & (112 + 126 - 213 + 212 ^ 52 + 123 - 156 + 159 ^ -1);
    }
}

