/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Bank
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.giantsfoundry.tasks.GiantsfoundryTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;

@TaskDesc(name="Banking for bars", priority=150)
public class BankingForBarsTask
extends GiantsfoundryTaskBase {

    private static boolean lIIIIIlllIIIIII(int n2) {
        return n2 != 0;
    }

    static {
        s.lIIIIIllIlllllI();
    }

    @Inject
    public BankingForBarsTask(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

    private static boolean lIIIIIllIllllll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean M() {
        s var1;
        if (s.lIIIIIllIllllll(this.T.g() ? 1 : 0)) {
            return llIlIllIIIIl[0];
        }
        if (s.lIIIIIllIllllll(var1.T.d() ? 1 : 0)) {
            return llIlIllIIIIl[0];
        }
        if (s.lIIIIIllIllllll(Bank.isOpen() ? 1 : 0)) {
            return llIlIllIIIIl[0];
        }
        if (s.lIIIIIlllIIIIII(var1.U.b().matchesInventory() ? 1 : 0)) {
            Bank.close();
            return llIlIllIIIIl[1];
        }
        if (s.lIIIIIlllIIIIII(Bank.isOpen() ? 1 : 0)) {
            var1.U.b().withdraw();

            var1.sleep(llIlIllIIIIl[2]);
            return llIlIllIIIIl[1];
        }
        return llIlIllIIIIl[0];
    }
}

