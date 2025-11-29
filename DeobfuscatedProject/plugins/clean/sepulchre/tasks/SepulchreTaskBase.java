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

    private static boolean lIIIlIIllllIIII(int n2) {
        return n2 == 0;
    }

    protected SepulchreTaskBase(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        this.aC = squireSepulchre;
        this.aD = squireSepulchreConfig;
    }

    static {
        V.lIIIlIIlllIllll();
    }

    public boolean run() {
        if (V.lIIIlIIllllIIII(this.aD.sackOpener() ? 1 : 0)) {
            return lllIIlIIIlII[0];
        }
        return this.J();
    }
}

