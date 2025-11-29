/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package gg.squire.vorkath.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import gg.squire.vorkath.tasks.BankingTask;
import net.runelite.api.Client;

@TaskDesc(name="Opening bank", priority=75, blocking=true)
public class OpeningBankTask
extends BankingTask {

    @Override
    public boolean Q() {
        if (s.llIIIIIIIIIIIII(this.R() ? 1 : 0)) {
            return lIlIlIlllllll[0];
        }
        return lIlIlIlllllll[0];
    }

    static {
        s.lIlllllllllllll();
    }

    private static boolean llIIIIIIIIIIIII(int n2) {
        return n2 == 0;
    }

    @Inject
    protected OpeningBankTask(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }
}

