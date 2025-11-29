/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.quest.tasks;

import net.unethicalite.api.widgets.Dialog;
import gg.squire.quest.tasks.QuestManager;

public class FHelper
implements o {
    
    private static  int ah;

    private static void var2() {
        var1 = new int[3];
        F.var1[0] = 1;
        F.var1[1] = (70 + 26 - 12 + 121 ^ 191 + 164 - 200 + 38) & (74 + 7 - 59 + 107 ^ 65 + 34 - 83 + 125 ^ -1);
        F.var1[2] = 3;
    }

    static {
        F.var2();
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean D() {
        if (F.var4(ah, var1[0])) {
            ah -= var1[0];
            return var1[1];
        }
        if (F.var3(M.H() ? 1 : 0)) {
            return var1[1];
        }
        Dialog.continueSpace();
        ah = M.a(var1[0], var1[2]);
        return var1[0];
    }

    private static boolean var4(int n2, int n3) {
        return n2 >= n3;
    }
}

