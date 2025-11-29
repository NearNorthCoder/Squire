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

    private static boolean lIIIlllIIlIllII(int n2) {
        return n2 == 0;
    }

    @Inject
    protected WalkingToBankTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    @Override
    public boolean bY() {
        H var1;
        if (H.lIIIlllIIlIlIlI(this.cW.ad() ? 1 : 0)) {
            return lllIlllllIlI[0];
        }
        if (H.lIIIlllIIlIlIlI(var1.cW.ae() ? 1 : 0)) {
            return lllIlllllIlI[0];
        }
        if (H.lIIIlllIIlIllII(var1.cW.s() ? 1 : 0)) {
            return lllIlllllIlI[0];
        }
        if (H.lIIIlllIIlIlIlI(Bank.isOpen() ? 1 : 0)) {
            return lllIlllllIlI[0];
        }
        if (H.lIIIlllIIlIlIlI(var1.cc() ? 1 : 0)) {
            return lllIlllllIlI[0];
        }
        return this.cV.bankLocation().bI().getAsBoolean();
    }

    static {
        H.lIIIlllIIlIlIII();
    }

    private static boolean lIIIlllIIlIlIlI(int n2) {
        return n2 != 0;
    }
}

