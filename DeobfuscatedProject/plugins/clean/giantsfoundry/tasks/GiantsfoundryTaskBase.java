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

    private static boolean lIIIIIlIllllIlI(int n2) {
        return n2 != 0;
    }

    @Inject
    public GiantsfoundryTaskBase(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        this.T = a2;
        this.U = squireGiantsFoundry;
        this.V = squireGiantsConfig;
    }

    public boolean run() {
        if (j.lIIIIIlIllllIlI(this.T.f() ? 1 : 0)) {
            return llIlIlIIllIl[0];
        }
        if (j.lIIIIIlIllllIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIlIlIIllIl[0];
        }
        return this.M();
    }

    public abstract boolean M();

    static {
        j.lIIIIIlIllllIIl();
        S = llIlIlIIllIl[1];
    }
}

