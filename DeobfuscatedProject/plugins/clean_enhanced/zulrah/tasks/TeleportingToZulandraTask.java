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
import gg.squire.zulrah.tasks.ZulrahManager;
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
        if ((this.ae( != 0).needsToBank() ? 1 : 0)) {
            return 1;
        }
        if ((Bank.isOpen( != 0) ? 1 : 0)) {
            return 1;
        }
        if ((Dialog.isEnterInputOpen( != 0) ? 1 : 0)) {
            Dialog.enterAmount((int)1);
        }
        return 2;
    }

    @Override
    public int af() {
        return 0;
    }

    static {
        J.var2();
        ae = 0;
    }

    @Inject
    protected TeleportingToZulandraTask(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, t t2) {
        super(squireZulrah, squireZulrahConfig, client, t2);
    }
}

