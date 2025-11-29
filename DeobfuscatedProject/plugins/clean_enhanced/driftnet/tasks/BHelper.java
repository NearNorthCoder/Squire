/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.unethicalite.api.commons.StopWatch
 */
package gg.squire.driftnet.tasks;

import net.runelite.api.NPC;
import net.unethicalite.api.commons.StopWatch;

public class BHelper {
    private final  NPC k;
    private  StopWatch l;

    public void k() {
        this.l = StopWatch.start();
    }

    public StopWatch l() {
        return this.l;
    }

    public NPC j() {
        return this.k;
    }

    public BHelper(NPC nPC) {
        this.k = nPC;
    }

    public long m() {
        System.out.println("Watchtime:" + this.l.getElapsed().getSeconds());
        return this.l.getElapsed().getSeconds();
    }
}

