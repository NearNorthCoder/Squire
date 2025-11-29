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
import gg.squire.gauntlet.tasks.GameEnum38;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Turning off prayers", priority=0x7FFFFFFF, blocking=true)
public class TurningOffPrayersTask
extends GauntletTaskBase {

    @Override
    public boolean be() {
        if (ab.lIIIIIIlIIlllll(Prayers.anyActive() ? 1 : 0)) {
            return llIlIIIllIII[1];
        }
        Prayers.disableAll();
        return llIlIIIllIII[0];
    }

    @Inject
    public TurningOffPrayersTask(c c2) {
        d[] dArray = new d[llIlIIIllIII[0]];
        dArray[ab.llIlIIIllIII[1]] = d.OUTSIDE;
        super(c2, dArray);
    }

    static {
        ab.lIIIIIIlIIllllI();
    }

    private static boolean lIIIIIIlIIlllll(int n2) {
        return n2 == 0;
    }

}

