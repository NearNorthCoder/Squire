/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.gauntlet.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Turning off prayers", priority=0x7FFFFFFF, blocking=true)
public class TurningOffPrayersTask
extends GauntletTaskBase {

    @Override
    public boolean be() {
        if (ab.var2(Prayers.anyActive() ? 1 : 0)) {
            return var1[1];
        }
        Prayers.disableAll();
        return var1[0];
    }

    @Inject
    public TurningOffPrayersTask(c c2) {
        d[] dArray = new d[var1[0]];
        dArray[ab.var1[1]] = d.OUTSIDE;
        super(c2, dArray);
    }

    static {
        ab.var3();
    }

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    private static void var3() {
        var1 = new int[2];
        ab.var1[0] = 1;
        ab.var1[1] = (0xCD ^ 0xA7 ^ (0x42 ^ 0x68)) & (0x51 ^ 0x60 ^ (0x4F ^ 0x3E) ^ -1);
    }
}

