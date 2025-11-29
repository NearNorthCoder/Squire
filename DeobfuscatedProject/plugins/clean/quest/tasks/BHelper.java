/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.quest.tasks;

import net.unethicalite.api.widgets.Dialog;
import gg.squire.quest.tasks.MHelper;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;

public class BHelper
implements o {
    private  int ah;

    static {
        B.lIlllIIIIIlIIIl();
    }

    @Override
    public boolean D() {
        B var1;
        if (B.lIlllIIIIIlIIlI(M.I() ? 1 : 0)) {
            return lIlIIIlIlllll[0];
        }
        if (B.lIlllIIIIIlIIll(var1.ah, lIlIIIlIlllll[1])) {
            var1.ah -= lIlIIIlIlllll[1];
            return lIlIIIlIlllll[0];
        }
        Dialog.continueTutorial();
        this.ah = M.a(lIlIIIlIlllll[1], lIlIIIlIlllll[2]);
        return lIlIIIlIlllll[1];
    }

    private static boolean lIlllIIIIIlIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlllIIIIIlIIlI(int n2) {
        return n2 == 0;
    }
}

