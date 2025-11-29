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

@TaskDesc(name="Opening bank", priority=500, blocking=true)
public class OpeningBankTask
extends BankingTask {

    @Inject
    protected OpeningBankTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    private static void var3() {
        var1 = new int[1];
        I.var1[0] = (4 ^ 0 ^ (0x33 ^ 0x10)) & (0xE9 ^ 0xA2 ^ (0x68 ^ 4) ^ -1);
    }

    @Override
    public boolean bY() {
        I var4;
        if (I.var5(this.cW.ae() ? 1 : 0)) {
            return var1[0];
        }
        if (I.var2(var4.cc() ? 1 : 0)) {
            return var1[0];
        }
        if (I.var5(Bank.isOpen() ? 1 : 0)) {
            return var1[0];
        }
        if (I.var2(var4.ce().needsToBank() ? 1 : 0)) {
            return var1[0];
        }
        return this.cV.bankLocation().bK().getAsBoolean();
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    static {
        I.var3();
    }
}

