/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.items.Bank
 */
package gg.squire.vorkath.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import gg.squire.vorkath.tasks.BankingTask;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.items.Bank;

@TaskDesc(name="Using Bankloadout", priority=80, blocking=true)
public class UsingBankloadoutTask
extends BankingTask {

        return String.valueOf(var1);
    }

    private static void llIIIIIIIlIlIlI() {
        lIlIllIIIlIlI = new String[lIlIllIIIlIll[2]];
        n.lIlIllIIIlIlI[n.lIlIllIIIlIll[0]] = "Banking failed 5 times in a row, stopping";
    }

    private static boolean llIIIIIIIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIIIIlIllII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean Q() {
        n var2;
        if (n.llIIIIIIIlIllII(this.R() ? 1 : 0)) {
            return lIlIllIIIlIll[0];
        }
        if (n.llIIIIIIIlIllII(var2.T().needsToBank() ? 1 : 0)) {
            Bank.close();
            return lIlIllIIIlIll[0];
        }
        if (n.llIIIIIIIlIllII(BankLoadouts.withdrawWithRetries((BankLoadout)var2.T(), (int)lIlIllIIIlIll[1]).booleanValue() ? 1 : 0)) {
            Log.info((String)lIlIllIIIlIlI[lIlIllIIIlIll[0]]);
            return lIlIllIIIlIll[0];
        }
        return lIlIllIIIlIll[2];
    }

    @Inject
    protected UsingBankloadoutTask(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }

    static {
        n.llIIIIIIIlIlIll();
        n.llIIIIIIIlIlIlI();
    }
}

