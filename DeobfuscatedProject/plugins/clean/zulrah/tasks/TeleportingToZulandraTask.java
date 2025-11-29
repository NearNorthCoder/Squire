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
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.BankingTask;
import gg.squire.zulrah.tasks.THelper;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Teleporting to Zul'Andra", priority=5)
public class TeleportingToZulandraTask
extends BankingTask {
    
    public static final  int ae;

    @Override
    public boolean ac() {
        if (J.llIIlIIIIIlllll(this.ae().needsToBank() ? 1 : 0)) {
            return lIllIlIllIIlI[1];
        }
        if (J.llIIlIIIIIlllll(Bank.isOpen() ? 1 : 0)) {
            return lIllIlIllIIlI[1];
        }
        if (J.llIIlIIIIIlllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lIllIlIllIIlI[1]);
        }
        return lIllIlIllIIlI[2];
    }

    private static boolean llIIlIIIIIlllll(int n2) {
        return n2 != 0;
    }

    @Override
    public int af() {
        return lIllIlIllIIlI[0];
    }

    static {
        J.llIIlIIIIIllllI();
        ae = lIllIlIllIIlI[0];
    }

    @Inject
    protected TeleportingToZulandraTask(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, t t2) {
        super(squireZulrah, squireZulrahConfig, client, t2);
    }
}

