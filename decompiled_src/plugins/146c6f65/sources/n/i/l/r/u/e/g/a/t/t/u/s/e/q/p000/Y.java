package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.DepositBox;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Depositing", priority = 25, blocking = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.Y  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/Y.class */
public class Y extends AbstractC0013n {
    private static /* synthetic */ int[] llIlIIIlIIII;

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Y(C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIlIIIlIIII[0]];
        enumC0003dArr[llIlIIIlIIII[1]] = EnumC0003d.OUTSIDE;
    }

    private static boolean lIIIIIIlIIIIllI(int i, int i2) {
        return i >= i2;
    }

    private static void lIIIIIIlIIIIlII() {
        llIlIIIlIIII = new int[6];
        llIlIIIlIIII[0] = " ".length();
        llIlIIIlIIII[1] = (140 ^ 131) & ((106 ^ 101) ^ (-1));
        llIlIIIlIIII[2] = (81 ^ 75) ^ " ".length();
        llIlIIIlIIII[3] = "  ".length();
        llIlIIIlIIII[4] = (52 ^ 25) ^ (126 ^ 89);
        llIlIIIlIIII[5] = (-17161) & 53246;
    }

    private static boolean lIIIIIIlIIIlIII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        if (lIIIIIIlIIIIlIl(this.ba.h().deposit() ? 1 : 0)) {
            return llIlIIIlIIII[1];
        }
        int freeSlots = Inventory.getFreeSlots();
        if (lIIIIIIlIIIIllI(freeSlots, llIlIIIlIIII[2])) {
            return llIlIIIlIIII[1];
        }
        if (lIIIIIIlIIIIlll(DepositBox.isOpen() ? 1 : 0)) {
            DepositBox.depositInventory();
            DepositBox.close();
            sleep(llIlIIIlIIII[3]);
            return llIlIIIlIIII[0];
        } else if (lIIIIIIlIIIIllI(freeSlots, llIlIIIlIIII[4])) {
            return llIlIIIlIIII[1];
        } else {
            int[] iArr = new int[llIlIIIlIIII[0]];
            iArr[llIlIIIlIIII[1]] = llIlIIIlIIII[5];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (lIIIIIIlIIIlIII(nearest)) {
                return llIlIIIlIIII[1];
            }
            nearest.interact(llIlIIIlIIII[1]);
            return llIlIIIlIIII[0];
        }
    }

    private static boolean lIIIIIIlIIIIlIl(int i) {
        return i == 0;
    }

    private static boolean lIIIIIIlIIIIlll(int i) {
        return i != 0;
    }

    static {
        lIIIIIIlIIIIlII();
    }
}
