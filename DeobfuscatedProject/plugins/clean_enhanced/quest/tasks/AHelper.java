/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.quest.tasks;

import net.unethicalite.api.widgets.Dialog;
import gg.squire.quest.tasks.QuestManager;

public class AHelper
implements o {

    @Override
    public boolean D() {
        if (A.var2(M.J() ? 1 : 0)) {
            return var1[0];
        }
        Dialog.chooseOption((int)M.a(var1[1], var1[2]));
        0;
        return var1[1];
    }

    static {
        A.var3();
    }

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    private static void var3() {
        var1 = new int[3];
        A.var1[0] = 1 & ~1;
        A.var1[1] = 1;
        A.var1[2] = 3;
    }
}

