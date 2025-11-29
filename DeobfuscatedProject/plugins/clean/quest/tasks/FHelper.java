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

public class FHelper
implements o {
    
    private static  int ah;

    static {
        F.lIlllIIIlIIlIII();
    }

    private static boolean lIlllIIIlIIlIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean D() {
        if (F.lIlllIIIlIIlIIl(ah, lIlIIIlllIllI[0])) {
            ah -= lIlIIIlllIllI[0];
            return lIlIIIlllIllI[1];
        }
        if (F.lIlllIIIlIIlIlI(M.H() ? 1 : 0)) {
            return lIlIIIlllIllI[1];
        }
        Dialog.continueSpace();
        ah = M.a(lIlIIIlllIllI[0], lIlIIIlllIllI[2]);
        return lIlIIIlllIllI[0];
    }

    private static boolean lIlllIIIlIIlIIl(int n2, int n3) {
        return n2 >= n3;
    }
}

