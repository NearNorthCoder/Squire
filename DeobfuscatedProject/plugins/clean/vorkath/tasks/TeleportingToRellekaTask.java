/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.vorkath.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import gg.squire.vorkath.tasks.BankingTask;
import net.runelite.api.Client;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Teleporting to Relleka", priority=5)
public class TeleportingToRellekaTask
extends BankingTask {
    public static final  int bY;

    private static boolean llIIIIIIIlIllll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean Q() {
        if (t.llIIIIIIIlIllll(this.T().needsToBank() ? 1 : 0)) {
            return lIlIllIIIllIl[1];
        }
        if (t.llIIIIIIIlIllll(Bank.isOpen() ? 1 : 0)) {
            return lIlIllIIIllIl[1];
        }
        if (t.llIIIIIIIlIllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lIlIllIIIllIl[1]);
        }
        return lIlIllIIIllIl[2];
    }

    @Inject
    protected TeleportingToRellekaTask(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }

    static {
        t.llIIIIIIIlIlllI();
        bY = lIlIllIIIllIl[0];
    }

    @Override
    public int U() {
        return lIlIllIIIllIl[0];
    }
}

