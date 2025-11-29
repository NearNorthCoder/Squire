/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 */
package gg.squire.gorillas.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.gorillas.SquireGorillaConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

public abstract class GorillasTaskBase
extends Task {
    protected final  SquireGorillaConfig T;
    
    protected final  Client U;
    protected final  int S = 9782;
    public static final  WorldPoint R;

    protected boolean J() {
        BankLoadout bankLoadout = (BankLoadout)this.T.bankLoadout().selected(BankLoadout.class);
        if bankLoadout == null {
            return 1;
        }
        return bankLoadout.needsToBank();
    }

    static {
        j.var2();
        R = new WorldPoint(2, 3, 4);
    }

    @Inject
    public GorillasTaskBase(SquireGorillaConfig squireGorillaConfig, Client client) {
        this.S = 0;
        this.T = squireGorillaConfig;
        this.U = client;
    }
}

