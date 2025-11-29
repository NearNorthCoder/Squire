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
import gg.squire.zammy.tasks.GameEnum16;
import gg.squire.zammy.tasks.LHelper;
import gg.squire.zammy.tasks.ZammyTaskBase;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;

@TaskDesc(name="Equipping Mage Gear")
public class EquippingMageGearTask
extends ZammyTaskBase {

    private static boolean llIIIlIlIIlIllI(Object object) {
        return object != null;
    }

    static {
        x.llIIIlIlIIlIIll();
    }

    @Inject
    public EquippingMageGearTask(SquireZammyConfig squireZammyConfig, l l2) {
        super(squireZammyConfig, l2);
    }

    private static boolean llIIIlIlIIlIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIlIlIIlIlII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        x var1;
        if (!x.llIIIlIlIIlIlII(this.I.B() ? 1 : 0) || x.llIIIlIlIIlIlII(this.I.A() ? 1 : 0)) {
            return lIllIIIllIIlI[0];
        }
        if (x.llIIIlIlIIlIlIl(var1.I.D() ? 1 : 0)) {
            return lIllIIIllIIlI[0];
        }
        if (x.llIIIlIlIIlIlIl(var1.I.H() ? 1 : 0)) {
            return lIllIIIllIIlI[0];
        }
        int[] nArray = new int[lIllIIIllIIlI[1]];
        nArray[x.lIllIIIllIIlI[0]] = e.BALFRUG_KREEYATH.n();
        NPC var2 = NPCs.getNearest((int[])nArray);
        if (x.llIIIlIlIIlIllI(var2) && x.llIIIlIlIIlIlIl(var2.isDead() ? 1 : 0)) {
            return lIllIIIllIIlI[0];
        }
        int[] var3 = var1.K();
        if (x.llIIIlIlIIlIlIl(var1.b(var3) ? 1 : 0)) {
            return lIllIIIllIIlI[0];
        }
        this.a((int[])var2_2);

        return lIllIIIllIIlI[1];
    }
}

