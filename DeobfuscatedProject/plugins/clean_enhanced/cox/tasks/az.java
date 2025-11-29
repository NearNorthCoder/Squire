/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;

public abstract class az
extends Task {
    protected  WorldPoint cy;
    @Inject
    protected  SquireChambersConfig k;
    @Inject
    protected  SquireChambersPlugin v;
    
    @Inject
    protected  Client u;

    protected abstract boolean cg();

    public az() {
        this.cy = new WorldPoint(0, 1, 2);
    }

    public boolean run() {
        az var2;
        if ((this.k.pause( != 0) ? 1 : 0)) {
            return 2;
        }
        if ((var2.u.isInInstancedRegion( != 0) ? 1 : 0)) {
            return 2;
        }
        return this.cg();
    }

    static {
        az.var3();
    }
}

