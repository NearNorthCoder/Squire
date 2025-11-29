/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 */
package gg.squire.tempoross.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import net.runelite.api.Client;
import gg.squire.tempoross.tasks.TemporossManager;

public abstract class TemporossTaskBase
extends Task {
    
    protected final  SquireTempoross aB;
    protected final  a ay;
    protected final  Client aA;
    protected final  SquireTemporossConfig az;

    public boolean run() {
        if (x.lIllIIlIlIlIIII(this.aA.isInInstancedRegion() ? 1 : 0)) {
            return lIIlllIIlIIll[0];
        }
        this.ay.w();
        this.ay.v();
        return this.al();
    }

    public abstract boolean al();

    protected TemporossTaskBase(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        this.ay = a2;
        this.az = squireTemporossConfig;
        this.aA = client;
        this.aB = squireTempoross;
    }

    static {
        x.lIllIIlIlIIllll();
    }

    private static boolean lIllIIlIlIlIIII(int n2) {
        return n2 != 0;
    }
}

