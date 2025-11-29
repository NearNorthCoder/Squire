/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  javax.inject.Inject
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import javax.inject.Inject;
import net.unethicalite.api.entities.Players;

public abstract class GiantsfoundryTaskBase
extends Task {
    protected final  SquireGiantsFoundry U;
    protected final  SquireGiantsConfig V;
    protected final  a T;
    
    protected static final  int S;

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    @Inject
    public GiantsfoundryTaskBase(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        this.T = a2;
        this.U = squireGiantsFoundry;
        this.V = squireGiantsConfig;
    }

    private static void var3() {
        var1 = new int[2];
        j.var1[0] = (0xB2 ^ 0xBC ^ (0xFE ^ 0xAD)) & (0xC5 ^ 0x90 ^ (0x3C ^ 0x34) ^ -1);
        j.var1[1] = 0xFFFFEFFE & 0xBEE9;
    }

    public boolean run() {
        if (j.var2(this.T.f() ? 1 : 0)) {
            return var1[0];
        }
        if (j.var2(Players.getLocal().isMoving() ? 1 : 0)) {
            return var1[0];
        }
        return this.M();
    }

    public abstract boolean M();

    static {
        j.var3();
        S = var1[1];
    }
}

