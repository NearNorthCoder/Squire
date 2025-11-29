/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;

public abstract class am
extends Task {
    
    @Inject
    private  u ab;
    private static final  int aI;
    protected final  SquireZulrahConfig aJ;
    private final  Client aK;
    @Inject
    protected  SquireZulrah E;

    public abstract boolean ac();

    protected am(Client client, SquireZulrahConfig squireZulrahConfig) {
        this.aK = client;
        this.aJ = squireZulrahConfig;
    }

    static {
        am.var2();
        aI = 1;
    }

    public boolean run() {
        am var3;
        if ((this.aK.isInInstancedRegion( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var3.E.d( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var3.ab.h(1 == 0) ? 1 : 0)) {
            return 0;
        }
        return this.ac();
    }

}

