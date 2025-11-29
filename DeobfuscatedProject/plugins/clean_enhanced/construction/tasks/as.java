/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.basics.ectofuntus.SquireEctoConfig;
import gg.squire.client.plugins.fw.Task;
import javax.inject.Inject;
import net.unethicalite.api.items.Inventory;

public abstract class as
extends Task {
    private static  int[] lIllllIl;
    protected final  SquireEctoConfig de;
    protected final  SquireEcto dd;

    public abstract boolean bB();

    public boolean run() {
        if (as.var1(this.bC() ? 1 : 0)) {
            return lIllllIl[0];
        }
        return this.bB();
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    protected boolean bC() {
        int n2;
        int[] nArray = new int[lIllllIl[1]];
        nArray[as.lIllllIl[0]] = lIllllIl[2];
        if (as.var2(Inventory.contains((int[])nArray) ? 1 : 0) && as.var2(Inventory.contains(this.de.bankItem().br()) ? 1 : 0)) {
            n2 = lIllllIl[1];
            0;
            if (-1 != -1) {
                return ((0xB6 ^ 0x91 ^ (0x98 ^ 0xB4)) & (3 ^ (0xA0 ^ 0xA8) ^ -1)) != 0;
            }
        } else {
            n2 = lIllllIl[0];
        }
        return n2 != 0;
    }

    private static boolean var1(int n2) {
        return n2 == 0;
    }

    private static void var3() {
        lIllllIl = new int[3];
        as.lIllllIl[0] = (0xAB ^ 0xB3) & ~(0x97 ^ 0x8F);
        as.lIllllIl[1] = 1;
        as.lIllllIl[2] = 0xFFFF9D9B & 0x72FF;
    }

    static {
        as.var3();
    }

    @Inject
    public as(SquireEcto squireEcto, SquireEctoConfig squireEctoConfig) {
        this.dd = squireEcto;
        this.de = squireEctoConfig;
    }
}

