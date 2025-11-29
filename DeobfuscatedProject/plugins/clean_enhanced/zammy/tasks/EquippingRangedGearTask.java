/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.game.Combat
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import gg.squire.zammy.tasks.ZammyManager;
import gg.squire.zammy.tasks.ZammyManager;
import net.unethicalite.api.game.Combat;

@TaskDesc(name="Equipping Ranged Gear", priority=100)
public class EquippingRangedGearTask
extends ZammyManager {

    @Inject
    public EquippingRangedGearTask(SquireZammyConfig squireZammyConfig, l l2) {
        super(squireZammyConfig, l2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        y var2;
        if (!(this.I.B( != 0) ? 1 : 0) || (this.I.A( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var2.I.H( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var2.H.useBlowpipe( != 0) ? 1 : 0) && (Combat.isSpecEnabled( != 0) ? 1 : 0) && (var2.I.z() > 1)) {
            return 0;
        }
        int[] var3 = var2.L();
        if ((var2.b(var3 == 0) ? 1 : 0)) {
            return 0;
        }
        this.a((int[])var1_1);
        0;
        return 2;
    }

    static {
        y.var4();
    }
}

