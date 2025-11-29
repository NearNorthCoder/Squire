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

public class A
implements o {

    @Override
    public boolean D() {
        if (A.lIlllIIIllIIIll(M.J() ? 1 : 0)) {
            return lIlIIlIIIIIII[0];
        }
        Dialog.chooseOption((int)M.a(lIlIIlIIIIIII[1], lIlIIlIIIIIII[2]));

        return lIlIIlIIIIIII[1];
    }

    static {
        A.lIlllIIIllIIIlI();
    }

    private static boolean lIlllIIIllIIIll(int n2) {
        return n2 == 0;
    }

}

