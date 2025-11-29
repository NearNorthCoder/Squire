/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Bank
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import net.unethicalite.api.items.Bank;
import gg.squire.nightmare.tasks.BankingTask;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Walking to bank", priority=250, blocking=true)
public class WalkingToBankTask
extends BankingTask {

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    @Inject
    protected WalkingToBankTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    @Override
    public boolean bY() {
        H var3;
        if (H.var4(this.cW.ad() ? 1 : 0)) {
            return var1[0];
        }
        if (H.var4(var3.cW.ae() ? 1 : 0)) {
            return var1[0];
        }
        if (H.var2(var3.cW.s() ? 1 : 0)) {
            return var1[0];
        }
        if (H.var4(Bank.isOpen() ? 1 : 0)) {
            return var1[0];
        }
        if (H.var4(var3.cc() ? 1 : 0)) {
            return var1[0];
        }
        return this.cV.bankLocation().bI().getAsBoolean();
    }

    static {
        H.var5();
    }

    private static void var5() {
        var1 = new int[1];
        H.var1[0] = (1 ^ (0xF5 ^ 0xB3)) & (0xE5 ^ 0xA8 ^ (0x82 ^ 0x88) ^ -1);
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }
}

