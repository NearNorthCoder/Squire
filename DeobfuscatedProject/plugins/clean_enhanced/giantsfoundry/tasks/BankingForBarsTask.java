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

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    static {
        s.var3();
    }

    private static void var3() {
        var1 = new int[3];
        s.var1[0] = (0xDD ^ 0x82) & ~(0x5E ^ 1);
        s.var1[1] = 1;
        s.var1[2] = 2;
    }

    @Inject
    public BankingForBarsTask(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean M() {
        s var5;
        if (s.var4(this.T.g() ? 1 : 0)) {
            return var1[0];
        }
        if (s.var4(var5.T.d() ? 1 : 0)) {
            return var1[0];
        }
        if (s.var4(Bank.isOpen() ? 1 : 0)) {
            return var1[0];
        }
        if (s.var2(var5.U.b().matchesInventory() ? 1 : 0)) {
            Bank.close();
            return var1[1];
        }
        if (s.var2(Bank.isOpen() ? 1 : 0)) {
            var5.U.b().withdraw();
            0;
            var5.sleep(var1[2]);
            return var1[1];
        }
        return var1[0];
    }
}

