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

public abstract class ZulrahTaskBase
extends Task {
    
    @Inject
    private  u ab;
    private static final  int aI;
    protected final  SquireZulrahConfig aJ;
    private final  Client aK;
    @Inject
    protected  SquireZulrah E;

    public abstract boolean ac();

    protected ZulrahTaskBase(Client client, SquireZulrahConfig squireZulrahConfig) {
        this.aK = client;
        this.aJ = squireZulrahConfig;
    }

    static {
        am.llIIlIlIIIlIIlI();
        aI = lIlllIIIIIIII[1];
    }

    private static boolean llIIlIlIIIlIlII(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        am var1;
        if (am.llIIlIlIIIlIIll(this.aK.isInInstancedRegion() ? 1 : 0)) {
            return lIlllIIIIIIII[0];
        }
        if (am.llIIlIlIIIlIIll(var1.E.d() ? 1 : 0)) {
            return lIlllIIIIIIII[0];
        }
        if (am.llIIlIlIIIlIlII(var1.ab.h(lIlllIIIIIIII[1]) ? 1 : 0)) {
            return lIlllIIIIIIII[0];
        }
        return this.ac();
    }

    private static boolean llIIlIlIIIlIIll(int n2) {
        return n2 != 0;
    }
}

