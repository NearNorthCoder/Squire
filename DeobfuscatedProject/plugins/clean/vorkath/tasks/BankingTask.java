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
import gg.squire.vorkath.tasks.GHelper;
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

    private static boolean llIIIIIIIIlllII(int n2) {
        return n2 == 0;
    }

    protected BankLoadout T() {
        return (BankLoadout)this.bS.bankLoadout().selected(BankLoadout.class);
    }

    public int U() {
        return lIlIllIIIIlll[3];
    }

    protected boolean R() {
        return this.bS.bankLocation().j().stream().anyMatch(n2 -> this.bV.d((int)n2));
    }

    static {
        o.llIIIIIIIIllIlI();
    }

    private static boolean llIIIIIIIIllllI(int n2, int n3) {
        return n2 == n3;
    }

    public boolean run() {
        o var1;
        if (o.llIIIIIIIIllIll(this.R() ? 1 : 0)) {
            this.bU.a(this.T().needsToBank());
        }
        if (o.llIIIIIIIIlllII(var1.bU.c() ? 1 : 0)) {
            return lIlIllIIIIlll[0];
        }
        return this.Q();
    }

    private static boolean llIIIIIIIIllIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIIIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    protected boolean S() {
        o var2;
        if (o.llIIIIIIIIlllII(this.bT.isInInstancedRegion() ? 1 : 0)) {
            return lIlIllIIIIlll[0];
        }
        int[] var3 = var2.bT.getMapRegions();
        int var4 = var3.length;
        int var5 = lIlIllIIIIlll[0];
        while (o.llIIIIIIIIlllIl(var5, var4)) {
            int var6 = var3[var5];
            if (o.llIIIIIIIIllllI(var6, lIlIllIIIIlll[1])) {
                return lIlIllIIIIlll[2];
            }
            ++var5;

            if (3 == 3) continue;
            return false;
        }
        return lIlIllIIIIlll[0];
    }
}

