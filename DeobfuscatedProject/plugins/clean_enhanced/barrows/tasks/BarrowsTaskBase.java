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
        i var2;
        if (i.var3(this.H.useBank() ? 1 : 0)) {
            return var1[0];
        }
        if (i.var3(var2.G.u() ? 1 : 0)) {
            return var1[0];
        }
        if (i.var3(Bank.isOpen() ? 1 : 0)) {
            return var1[0];
        }
        return this.K();
    }

    protected BarrowsTaskBase(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.G = squireBarrows;
        this.H = squireBarrowsConfig;
        this.I = squireBarrows.t();
    }

    private static void var4() {
        var1 = new int[1];
        i.var1[0] = (4 ^ 0x77 ^ (0x2D ^ 0x61)) & (0xA0 ^ 0x9D ^ 2 ^ -1);
    }

    static {
        i.var4();
    }

    public abstract boolean K();

    private static boolean var3(int n2) {
        return n2 == 0;
    }
}

