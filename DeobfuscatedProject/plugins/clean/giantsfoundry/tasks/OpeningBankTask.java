/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.giantsfoundry.tasks.GiantsfoundryTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Opening bank", priority=50)
public class OpeningBankTask
extends GiantsfoundryTaskBase {

    static {
        v.lIIIIIllIIlIIll();
    }

    @Inject
    public OpeningBankTask(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

    @Override
    public boolean M() {
        v var1;
        if (v.lIIIIIllIIlIlII(this.T.g() ? 1 : 0)) {
            return llIlIlIlIllI[0];
        }
        if (v.lIIIIIllIIlIlII(var1.T.d() ? 1 : 0)) {
            return llIlIlIlIllI[0];
        }
        int[] nArray = new int[llIlIlIlIllI[1]];
        nArray[v.llIlIlIlIllI[0]] = var1.V.primaryBar().OpeningBankTask();
        if (v.lIIIIIllIIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[llIlIlIlIllI[1]];
            nArray2[v.llIlIlIlIllI[0]] = var1.V.secondaryBar().OpeningBankTask();
            if (v.lIIIIIllIIlIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                return llIlIlIlIllI[0];
            }
        }
        if (v.lIIIIIllIIlIlII(Bank.isOpen() ? 1 : 0)) {
            Bank.open();

            return llIlIlIlIllI[1];
        }
        return llIlIlIlIllI[0];
    }

    private static boolean lIIIIIllIIlIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIllIIlIlII(int n2) {
        return n2 == 0;
    }
}

