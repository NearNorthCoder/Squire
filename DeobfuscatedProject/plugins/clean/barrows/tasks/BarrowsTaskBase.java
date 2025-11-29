/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.unethicalite.api.items.Bank
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import net.unethicalite.api.items.Bank;
import gg.squire.barrows.tasks.BarrowsManager;

public abstract class BarrowsTaskBase
extends Task {
    protected final  SquireBarrowsConfig H;
    
    protected final  a I;
    protected final  SquireBarrows G;

    public boolean run() {
        i var1;
        if (i.lIllIlIlIIlIlI(this.H.useBank() ? 1 : 0)) {
            return llllIlIIIlI[0];
        }
        if (i.lIllIlIlIIlIlI(var1.G.u() ? 1 : 0)) {
            return llllIlIIIlI[0];
        }
        if (i.lIllIlIlIIlIlI(Bank.isOpen() ? 1 : 0)) {
            return llllIlIIIlI[0];
        }
        return this.K();
    }

    protected BarrowsTaskBase(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.G = squireBarrows;
        this.H = squireBarrowsConfig;
        this.I = squireBarrows.t();
    }

    static {
        i.lIllIlIlIIlIIl();
    }

    public abstract boolean K();

    private static boolean lIllIlIlIIlIlI(int n2) {
        return n2 == 0;
    }
}

