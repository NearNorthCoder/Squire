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
package gg.squire.vorkath.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import gg.squire.vorkath.tasks.VorkathManager;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

@TaskDesc(name="Banking", priority=80, blocking=true)
public abstract class BankingTask
extends Task {
    protected final  SquireVorkathPlugin bU;
    @Inject
    protected  g bV;
    
    protected final  SquireVorkathConfig bS;
    protected final  Client bT;

    protected BankingTask(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        this.bU = squireVorkathPlugin;
        this.bS = squireVorkathConfig;
        this.bT = client;
    }

    public abstract boolean Q();

    protected BankLoadout T() {
        return (BankLoadout)this.bS.bankLoadout().selected(BankLoadout.class);
    }

    public int U() {
        return 3;
    }

    protected boolean R() {
        return this.bS.bankLocation().j().stream().anyMatch(n2 -> this.bV.d((int)n2));
    }

    static {
        o.var2();
    }

    public boolean run() {
        o var3;
        if ((this.R( != 0) ? 1 : 0)) {
            this.bU.a(this.T().needsToBank());
        }
        if ((var3.bU.c( == 0) ? 1 : 0)) {
            return 0;
        }
        return this.Q();
    }

    protected boolean S() {
        o var4;
        if ((this.bT.isInInstancedRegion( == 0) ? 1 : 0)) {
            return 0;
        }
        int[] var5 = var4.bT.getMapRegions();
        int var6 = var5.length;
        int var7 = 0;
        while (var7 < var6) {
            int var8 = var5[var7];
            if (var8 == 1) {
                return 2;
            }
            ++var7;
            0;
            if (3 == 3) continue;
            return ((0x76 ^ 0x48) & ~(0x6C ^ 0x52)) != 0;
        }
        return 0;
    }
}

