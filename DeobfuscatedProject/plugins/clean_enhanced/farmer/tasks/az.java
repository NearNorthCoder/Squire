/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  javax.inject.Inject
 *  net.runelite.api.Client
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.farmer.SquireFarmerConfig;
import javax.inject.Inject;
import net.runelite.api.Client;

public abstract class az
extends Task {
    
    protected final  SquireFarmerConfig bS;
    protected final  Client bT;
    protected final  f bR;

    @Inject
    public az(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        this.bR = f2;
        this.bS = squireFarmerConfig;
        this.bT = client;
    }

    static {
        az.var2();
    }

    public boolean sleeping() {
        boolean bl;
        if (!(this.bR.t( != 0) ? 1 : 0) || (super.sleeping( != 0) ? 1 : 0)) {
            bl = 0;
            0;
            if (-(0x30 ^ 0x34) > 0) {
                return ((0xE3 ^ 0xB8) & ~(0x30 ^ 0x6B)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }
}

