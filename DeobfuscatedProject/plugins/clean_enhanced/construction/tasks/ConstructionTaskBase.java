/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.unethicalite.api.items.Bank
 */
package gg.squire.construction.tasks;

import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.construction.tasks.ConstructionManager;
import net.unethicalite.api.items.Bank;

public abstract class ConstructionTaskBase
extends Task {
    protected final  SquireCerberusConfig av;
    private static  int[] lIlIlllII;
    protected final  a au;
    protected final  SquireCerberus at;

    private static boolean var1(int n2) {
        return n2 != 0;
    }

    static {
        p.var2();
    }

    private static void var2() {
        lIlIlllII = new int[1];
        p.lIlIlllII[0] = (2 ^ 0x1E) & ~(0x8E ^ 0x92);
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    protected ConstructionTaskBase(SquireCerberus squireCerberus, SquireCerberusConfig squireCerberusConfig, a a2) {
        this.at = squireCerberus;
        this.av = squireCerberusConfig;
        this.au = a2;
    }

    public boolean run() {
        p var4;
        if (p.var3(this.av.bankLoadout().isSelected() ? 1 : 0)) {
            return lIlIlllII[0];
        }
        if (p.var3(var4.at.r() ? 1 : 0)) {
            return lIlIlllII[0];
        }
        if (p.var3(Bank.isOpen() ? 1 : 0)) {
            return lIlIlllII[0];
        }
        if (p.var1(var4.au.l() ? 1 : 0)) {
            var4.au.a(lIlIlllII[0]);
        }
        return this.V();
    }

    public abstract boolean V();
}

