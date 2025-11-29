/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.GameEnum9;
import gg.squire.zulrah.tasks.ZulrahManager;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

@TaskDesc(name="Banking", priority=1000, blocking=true)
public abstract class BankingTask
extends Task {
    protected final  t Y;
    protected final  Client Z;
    protected final  SquireZulrah aa;
    
    protected final  SquireZulrahConfig X;
    @Inject
    protected  u ab;

    public int af() {
        return 1;
    }

    protected BankLoadout ae() {
        return (BankLoadout)this.X.bankLoadout().selected(BankLoadout.class);
    }

    public abstract boolean ac();

    protected boolean ad() {
        return this.X.bankLocation().g().stream().anyMatch(n2 -> this.ab.h((int)n2));
    }

    protected BankingTask(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, t t2) {
        this.aa = squireZulrah;
        this.X = squireZulrahConfig;
        this.Z = client;
        this.Y = t2;
    }

    public boolean run() {
        E var2;
        if (!(this.X.bank( != 0) ? 1 : 0) || ((Object)this.aa.a() != (Object)this.aa.a()2)c.DONE)) {
            return 0;
        }
        if ((var2.ad( != 0) ? 1 : 0)) {
            var2.aa.a(var2.ae().needsToBank());
        }
        if ((var2.aa.d( == 0) ? 1 : 0)) {
            return 0;
        }
        return this.ac();
    }

    static {
        E.var3();
    }

}

