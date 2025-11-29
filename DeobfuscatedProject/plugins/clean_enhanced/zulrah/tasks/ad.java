/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.GameEnum6;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;

public abstract class ad
extends Task {
    protected final  SquireZulrahConfig aA;
    
    protected final  v az;
    @Inject
    protected  SquireZulrah E;
    protected final  Client aB;

    protected k C() {
        return this.az.V().C();
    }

    protected ad(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        this.az = v2;
        this.aB = client;
        this.aA = squireZulrahConfig;
    }

    static {
        ad.var2();
    }

    public boolean run() {
        ad var3;
        if ((this.aB.isInInstancedRegion( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var3.az.V( == null))) {
            return 0;
        }
        return this.ac();
    }

    protected WorldPoint ai() {
        return this.C().a(this.az.X());
    }

    public abstract boolean ac();
}

