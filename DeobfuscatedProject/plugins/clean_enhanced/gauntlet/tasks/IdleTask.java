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
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.GauntletTaskBase;

@TaskDesc(name="Idle")
public class IdleTask
extends GauntletTaskBase {

    @Inject
    public IdleTask(c c2) {
        d[] dArray = new d[0];
        dArray[1] = d.BOSS_FIGHT;
        super(c2, dArray);
    }

    @Override
    public boolean be() {
        return 0;
    }

    static {
        x.var2();
    }
}

