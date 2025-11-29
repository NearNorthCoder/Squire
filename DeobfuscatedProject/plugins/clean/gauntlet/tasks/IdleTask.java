/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import gg.squire.gauntlet.tasks.GauntletTaskBase;

@TaskDesc(name="Idle")
public class IdleTask
extends GauntletTaskBase {

    @Inject
    public IdleTask(c c2) {
        d[] dArray = new d[llIIllIllIll[0]];
        dArray[x.llIIllIllIll[1]] = d.BOSS_FIGHT;
        super(c2, dArray);
    }

    @Override
    public boolean be() {
        return llIIllIllIll[0];
    }

    static {
        x.lllllllIIlllII();
    }
}

