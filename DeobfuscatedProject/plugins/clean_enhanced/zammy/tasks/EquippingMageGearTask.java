/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import gg.squire.zammy.tasks.GameEnum3;
import gg.squire.zammy.tasks.ZammyManager;
import gg.squire.zammy.tasks.ZammyManager;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;

@TaskDesc(name="Equipping Mage Gear")
public class EquippingMageGearTask
extends ZammyManager {

    static {
        x.var2();
    }

    @Inject
    public EquippingMageGearTask(SquireZammyConfig squireZammyConfig, l l2) {
        super(squireZammyConfig, l2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        x var3;
        if (!(this.I.B( != 0) ? 1 : 0) || (this.I.A( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var3.I.D( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var3.I.H( == 0) ? 1 : 0)) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = e.BALFRUG_KREEYATH.n();
        NPC var4 = NPCs.getNearest((int[])nArray);
        if (var4 != null && (var4.isDead( == 0) ? 1 : 0)) {
            return 0;
        }
        int[] var5 = var3.K();
        if ((var3.b(var5 == 0) ? 1 : 0)) {
            return 0;
        }
        this.a((int[])var2_2);
        0;
        return 1;
    }
}

