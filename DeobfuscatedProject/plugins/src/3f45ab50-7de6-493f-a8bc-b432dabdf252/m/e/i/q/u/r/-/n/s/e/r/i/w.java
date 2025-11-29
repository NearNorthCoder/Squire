/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import m.e.i.q.u.r.-.n.s.e.r.i.b;
import net.runelite.api.Item;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Chiseling amethyst", priority=10, blocking=true)
public class w
extends Task {
    private /* synthetic */ boolean J;
    private static /* synthetic */ int[] lllllIlIIllI;
    private final /* synthetic */ SquireMinerConfig I;

    @Inject
    public w(SquireMinerConfig squireMinerConfig) {
        this.J = lllllIlIIllI[0];
        this.I = squireMinerConfig;
    }

    private static boolean lIIlIIllIlIIIIl(int n2) {
        return n2 != 0;
    }

    static {
        w.lIIlIIllIIllllI();
    }

    private static boolean lIIlIIllIlIIIII(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        w lllllllllllllllIIlIIlIlIlIlIlIll;
        if (w.lIIlIIllIIlllll((Object)this.I.activity(), (Object)a.AMETHYST)) {
            return lllllIlIIllI[0];
        }
        if (w.lIIlIIllIlIIIII((Object)lllllllllllllllIIlIIlIlIlIlIlIll.I.craft(), (Object)b.DISABLE)) {
            return lllllIlIIllI[0];
        }
        if (w.lIIlIIllIlIIIIl(Inventory.isFull() ? 1 : 0)) {
            lllllllllllllllIIlIIlIlIlIlIlIll.J = lllllIlIIllI[1];
            "".length();
            if ("   ".length() <= " ".length()) {
                return ((0x68 ^ 6 ^ (0xC6 ^ 0xBD)) & (59 + 110 - 50 + 90 ^ 150 + 172 - 301 + 175 ^ -" ".length())) != 0;
            }
        } else {
            int[] nArray = new int[lllllIlIIllI[1]];
            nArray[w.lllllIlIIllI[0]] = lllllIlIIllI[2];
            if (w.lIIlIIllIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                lllllllllllllllIIlIIlIlIlIlIlIll.J = lllllIlIIllI[0];
            }
        }
        if (w.lIIlIIllIlIIIlI(lllllllllllllllIIlIIlIlIlIlIlIll.J ? 1 : 0)) {
            return lllllIlIIllI[0];
        }
        int[] nArray = new int[lllllIlIIllI[1]];
        nArray[w.lllllIlIIllI[0]] = lllllIlIIllI[3];
        Item lllllllllllllllIIlIIlIlIlIlIlIlI = Inventory.getFirst((int[])nArray);
        if (w.lIIlIIllIlIIIll(lllllllllllllllIIlIIlIlIlIlIlIlI)) {
            return lllllIlIIllI[0];
        }
        if (w.lIIlIIllIlIIIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
            lllllllllllllllIIlIIlIlIlIlIlIll.sleep(Rand.nextInt((int)lllllIlIIllI[4], (int)lllllIlIIllI[5]));
            return lllllIlIIllI[1];
        }
        if (w.lIIlIIllIlIIIIl(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption((int)(lllllllllllllllIIlIIlIlIlIlIlIll.I.craft().ordinal() + lllllIlIIllI[1]));
            lllllllllllllllIIlIIlIlIlIlIlIll.sleep(lllllIlIIllI[6]);
            return lllllIlIIllI[1];
        }
        int[] nArray2 = new int[lllllIlIIllI[1]];
        nArray2[w.lllllIlIIllI[0]] = lllllIlIIllI[2];
        Item item = Inventory.getFirst((int[])nArray2);
        var1_1.useOn(item);
        return lllllIlIIllI[1];
    }

    private static void lIIlIIllIIllllI() {
        lllllIlIIllI = new int[7];
        w.lllllIlIIllI[0] = (0x34 ^ 0x2D) & ~(0x33 ^ 0x2A);
        w.lllllIlIIllI[1] = " ".length();
        w.lllllIlIIllI[2] = 0xFFFFF7FF & 0x5B63;
        w.lllllIlIIllI[3] = 0xFFFFEFDB & 0x16FF;
        w.lllllIlIIllI[4] = 135 + 40 - 65 + 34 ^ 50 + 27 - 50 + 122;
        w.lllllIlIIllI[5] = 0xDB ^ 0x99 ^ (0xF8 ^ 0xB2);
        w.lllllIlIIllI[6] = "  ".length();
    }

    private static boolean lIIlIIllIlIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIllIIlllll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIIllIlIIIll(Object object) {
        return object == null;
    }
}

