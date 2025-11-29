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
import gg.squire.zammy.tasks.LHelper;
import gg.squire.zammy.tasks.ZammyTaskBase;
import net.unethicalite.api.game.Combat;

@TaskDesc(name="Equipping Ranged Gear", priority=100)
public class EquippingRangedGearTask
extends ZammyTaskBase {

    private static boolean llIIIllIIIIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public EquippingRangedGearTask(SquireZammyConfig squireZammyConfig, l l2) {
        super(squireZammyConfig, l2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        y var1;
        if (!y.llIIIllIIIIIIIl(this.I.B() ? 1 : 0) || y.llIIIllIIIIIIIl(this.I.A() ? 1 : 0)) {
            return lIllIIlIlIIlI[0];
        }
        if (y.llIIIllIIIIIIIl(var1.I.H() ? 1 : 0)) {
            return lIllIIlIlIIlI[0];
        }
        if (y.llIIIllIIIIIIIl(var1.H.useBlowpipe() ? 1 : 0) && y.llIIIllIIIIIIIl(Combat.isSpecEnabled() ? 1 : 0) && y.llIIIllIIIIIIlI(var1.I.z(), lIllIIlIlIIlI[1])) {
            return lIllIIlIlIIlI[0];
        }
        int[] var2 = var1.L();
        if (y.llIIIllIIIIIIll(var1.b(var2) ? 1 : 0)) {
            return lIllIIlIlIIlI[0];
        }
        this.a((int[])var1_1);

        return lIllIIlIlIIlI[2];
    }

    private static boolean llIIIllIIIIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIllIIIIIIll(int n2) {
        return n2 == 0;
    }

    static {
        y.llIIIllIIIIIIII();
    }
}

