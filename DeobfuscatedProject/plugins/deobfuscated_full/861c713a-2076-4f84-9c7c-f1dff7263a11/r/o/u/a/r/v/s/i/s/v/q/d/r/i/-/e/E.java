/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  javax.inject.Inject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.vardorvis.SquireVardorvis;
import javax.inject.Inject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

public abstract class E
extends Task {
    private static /* synthetic */ int[] lIlIlIIIllIII;
    @Inject
    protected /* synthetic */ SquireVardorvis aw;
    protected static final /* synthetic */ WorldArea av;

    private static void lIllllIlIlllllI() {
        lIlIlIIIllIII = new int[10];
        E.lIlIlIIIllIII[0] = (0x33 ^ 0x2F) & ~(9 ^ 0x15);
        E.lIlIlIIIllIII[1] = 1;
        E.lIlIlIIIllIII[2] = 0xFFFFD19B & 0x3FF6;
        E.lIlIlIIIllIII[3] = 2;
        E.lIlIlIIIllIII[4] = 0xFFFFDB5E & 0x27A5;
        E.lIlIlIIIllIII[5] = -(0xFFFF8CD3 & 0x7FAF) & (0xFFFFEFFE & 0x3FFF);
        E.lIlIlIIIllIII[6] = 0xFFFFAC7D & 0x57DB;
        E.lIlIlIIIllIII[7] = 0xFFFFFD77 & 0xFEB;
        E.lIlIlIIIllIII[8] = 0xFFFF8563 & 0x7EFC;
        E.lIlIlIIIllIII[9] = -(0xFFFFFE4D & 0x73B7) & (0xFFFFFF7F & 0x7FEF);
    }

    public boolean run() {
        if (E.lIllllIlIllllll(this.aw.i() ? 1 : 0)) {
            return lIlIlIIIllIII[0];
        }
        if (E.lIllllIllIIIIII(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return lIlIlIIIllIII[1];
        }
        return this.l();
    }

    private static boolean lIllllIlIllllll(int n2) {
        return n2 == 0;
    }

    static {
        E.lIllllIlIlllllI();
        av = new WorldArea(new WorldPoint(lIlIlIIIllIII[6], lIlIlIIIllIII[7], lIlIlIIIllIII[0]), new WorldPoint(lIlIlIIIllIII[8], lIlIlIIIllIII[9], lIlIlIIIllIII[0]));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean X() {
        int n2;
        block3: {
            block2: {
                if (!E.lIllllIllIIIIIl(Vars.getBit((int)lIlIlIIIllIII[2]))) break block2;
                int[] nArray = new int[lIlIlIIIllIII[3]];
                nArray[E.lIlIlIIIllIII[0]] = lIlIlIIIllIII[4];
                nArray[E.lIlIlIIIllIII[1]] = lIlIlIIIllIII[5];
                if (!E.lIllllIlIllllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIlIlIIIllIII[3]];
                nArray2[E.lIlIlIIIllIII[0]] = lIlIlIIIllIII[4];
                nArray2[E.lIlIlIIIllIII[1]] = lIlIlIIIllIII[5];
                if (!E.lIllllIllIIIIII(Equipment.contains((int[])nArray2) ? 1 : 0)) break block3;
            }
            n2 = lIlIlIIIllIII[1];
            0;
            if (-(0x21 ^ 0x24) < 0) return n2 != 0;
            return false;
        }
        n2 = lIlIlIIIllIII[0];
        return n2 != 0;
    }

    public abstract boolean l();

    private static boolean lIllllIllIIIIIl(int n2) {
        return n2 <= 0;
    }

    private static boolean lIllllIllIIIIII(int n2) {
        return n2 != 0;
    }
}

