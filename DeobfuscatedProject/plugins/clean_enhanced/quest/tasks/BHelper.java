/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.quest.tasks;

import net.unethicalite.api.widgets.Dialog;
import gg.squire.quest.tasks.QuestManager;

public class BHelper
implements o {
    private  int ah;

    static {
        B.var2();
    }

    @Override
    public boolean D() {
        B var3;
        if (B.var4(M.I() ? 1 : 0)) {
            return var1[0];
        }
        if (B.var5(var3.ah, var1[1])) {
            var3.ah -= var1[1];
            return var1[0];
        }
        Dialog.continueTutorial();
        this.ah = M.a(var1[1], var1[2]);
        return var1[1];
    }

    private static boolean var5(int n2, int n3) {
        return n2 >= n3;
    }

    private static void var2() {
        var1 = new int[3];
        B.var1[0] = (38 + 157 - 64 + 52 ^ 79 + 57 - 105 + 118) & (0x8B ^ 0xB7 ^ (0x6C ^ 0x72) ^ -1);
        B.var1[1] = 1;
        B.var1[2] = 3;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }
}

