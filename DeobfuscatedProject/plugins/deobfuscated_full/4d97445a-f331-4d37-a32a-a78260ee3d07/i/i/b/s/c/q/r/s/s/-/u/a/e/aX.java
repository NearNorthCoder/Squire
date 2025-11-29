/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.membership.SquireMembershipBuyer;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;

/* TASK: Buying Bond -> BuyingbondTask */
@TaskDesc(name="Buying Bond")
public class aX
extends Task {
    private final /* synthetic */ SquireMembershipBuyer fg;
    private static /* synthetic */ int[] lllllllI;
    private /* synthetic */ int fh;

    private static void llIlllllII() {
        lllllllI = new int[6];
        aX.lllllllI[0] = 1;
        aX.lllllllI[1] = (24 + 94 - 52 + 86 ^ 32 + 61 - 83 + 189) & (48 + 62 - 8 + 128 ^ 49 + 94 - 37 + 79 ^ -1);
        aX.lllllllI[2] = -(0xFFFFF4E3 & 0x4F3F) & (0xFFFFFFEE & 0x77BB);
        aX.lllllllI[3] = 0xFFFFB3F3 & 0x4FEF;
        aX.lllllllI[4] = 0xFFFFFFFF & 0x989680;
        aX.lllllllI[5] = 0xFFFFF7BF & 0x3BC6;
    }

    private static boolean llIlllllIl(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        aX llIIllllIlIIlll;
        int[] nArray = new int[lllllllI[0]];
        nArray[aX.lllllllI[1]] = lllllllI[2];
        if (aX.llIlllllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllllllI[1];
        }
        int[] nArray2 = new int[lllllllI[0]];
        nArray2[aX.lllllllI[1]] = lllllllI[3];
        if (aX.llIllllllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lllllllI[0]];
            nArray3[aX.lllllllI[1]] = lllllllI[3];
            if (aX.llIlllllll(Inventory.getCount((boolean)lllllllI[0], (int[])nArray3), lllllllI[4])) {
                return lllllllI[1];
            }
        }
        if (aX.lllIIIIIII(llIIllllIlIIlll.fh, lllllllI[0])) {
            llIIllllIlIIlll.fh -= lllllllI[0];
            return lllllllI[1];
        }
        if (aX.llIlllllIl(GrandExchange.isOpen() ? 1 : 0)) {
            if (aX.llIlllllIl(GrandExchange.canCollect() ? 1 : 0)) {
                GrandExchange.collect();
                return lllllllI[0];
            }
            GrandExchange.buy((int)lllllllI[5], (int)lllllllI[0], (int)lllllllI[4]);
            0;
            llIIllllIlIIlll.fh += lllllllI[0];
            0;
            if (3 <= 1) {
                return false;
            }
        } else {
            GrandExchange.open();
        }
        return lllllllI[0];
    }

    public boolean cr() {
        return lllllllI[0];
    }

    static {
        aX.llIlllllII();
    }

    private static boolean lllIIIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIllllllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIlllllll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public aX(SquireMembershipBuyer squireMembershipBuyer) {
        this.fg = squireMembershipBuyer;
    }
}

