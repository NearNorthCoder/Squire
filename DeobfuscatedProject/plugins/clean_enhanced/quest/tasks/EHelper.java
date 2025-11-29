/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.quest.tasks;

import gg.squire.quest.tasks.QuestManager;

public class EHelper
implements o {
    private final  String aB;
    
    private final  int az;
    private final  int aA;

    static {
        E.var2();
    }

    @Override
    public boolean D() {
        M.a(this.az, this.aA, this.aB);
        0;
        return var1[0];
    }

    private static void var2() {
        var1 = new int[1];
        E.var1[0] = 1;
    }

    public EHelper(int n2, int n3, String string) {
        this.az = n2;
        this.aA = n3;
        this.aB = string;
    }
}

