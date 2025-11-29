/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.DepositBox
 *  net.unethicalite.api.items.Inventory
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.DepositBox;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Depositing", priority=25, blocking=true)
public class Y
extends n {
    private static /* synthetic */ int[] llIlIIIlIIII;

    @Inject
    public Y(c c2) {
        d[] dArray = new d[llIlIIIlIIII[0]];
        dArray[Y.llIlIIIlIIII[1]] = d.OUTSIDE;
        super(c2, dArray);
    }

    private static boolean lIIIIIIlIIIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIIIIIlIIIIlII() {
        llIlIIIlIIII = new int[6];
        Y.llIlIIIlIIII[0] = " ".length();
        Y.llIlIIIlIIII[1] = (0x8C ^ 0x83) & ~(0x6A ^ 0x65);
        Y.llIlIIIlIIII[2] = 0x51 ^ 0x4B ^ " ".length();
        Y.llIlIIIlIIII[3] = "  ".length();
        Y.llIlIIIlIIII[4] = 0x34 ^ 0x19 ^ (0x7E ^ 0x59);
        Y.llIlIIIlIIII[5] = 0xFFFFBCF7 & 0xCFFE;
    }

    private static boolean lIIIIIIlIIIlIII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var2_2;
        if (Y.lIIIIIIlIIIIlIl(this.ba.h().deposit() ? 1 : 0)) {
            return llIlIIIlIIII[1];
        }
        int lllllllllllllllIlIIIllIlIIIIllIl = Inventory.getFreeSlots();
        if (Y.lIIIIIIlIIIIllI(lllllllllllllllIlIIIllIlIIIIllIl, llIlIIIlIIII[2])) {
            return llIlIIIlIIII[1];
        }
        if (Y.lIIIIIIlIIIIlll(DepositBox.isOpen() ? 1 : 0)) {
            Y lllllllllllllllIlIIIllIlIIIIlllI;
            DepositBox.depositInventory();
            DepositBox.close();
            lllllllllllllllIlIIIllIlIIIIlllI.sleep(llIlIIIlIIII[3]);
            return llIlIIIlIIII[0];
        }
        if (Y.lIIIIIIlIIIIllI(lllllllllllllllIlIIIllIlIIIIllIl, llIlIIIlIIII[4])) {
            return llIlIIIlIIII[1];
        }
        int[] nArray = new int[llIlIIIlIIII[0]];
        nArray[Y.llIlIIIlIIII[1]] = llIlIIIlIIII[5];
        TileObject lllllllllllllllIlIIIllIlIIIIllII = TileObjects.getNearest((int[])nArray);
        if (Y.lIIIIIIlIIIlIII(lllllllllllllllIlIIIllIlIIIIllII)) {
            return llIlIIIlIIII[1];
        }
        var2_2.interact(llIlIIIlIIII[1]);
        return llIlIIIlIIII[0];
    }

    private static boolean lIIIIIIlIIIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIIlIIIIlll(int n2) {
        return n2 != 0;
    }

    static {
        Y.lIIIIIIlIIIIlII();
    }
}

