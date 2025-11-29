/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.BankingTask;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;

@TaskDesc(name="Opening bank", priority=5, blocking=true)
public class OpeningBankTask
extends BankingTask {

    @Inject
    protected OpeningBankTask(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, t t2) {
        super(squireZulrah, squireZulrahConfig, client, t2);
    }

    static {
        I.var2();
    }

    @Override
    public boolean ac() {
        return 0;
    }
}

