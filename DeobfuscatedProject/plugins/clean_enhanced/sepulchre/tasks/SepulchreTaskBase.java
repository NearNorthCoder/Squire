/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 */
package gg.squire.sepulchre.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;

public abstract class SepulchreTaskBase
extends Task {
    private final  SquireSepulchre aC;
    
    private final  SquireSepulchreConfig aD;

    public abstract boolean J();

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    private static void var3() {
        var1 = new int[1];
        V.var1[0] = (117 + 9 - 5 + 28 ^ 99 + 29 - 47 + 101) & (0x45 ^ 0x13 ^ (0xB6 ^ 0xC3) ^ -1);
    }

    protected SepulchreTaskBase(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        this.aC = squireSepulchre;
        this.aD = squireSepulchreConfig;
    }

    static {
        V.var3();
    }

    public boolean run() {
        if (V.var2(this.aD.sackOpener() ? 1 : 0)) {
            return var1[0];
        }
        return this.J();
    }
}

