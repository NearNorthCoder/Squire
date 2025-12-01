package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.membership.SquireMembershipBuyer;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Buying Bond")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aX  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aX.class */
public class aX extends Task {
    private final /* synthetic */ SquireMembershipBuyer fg;
    private static /* synthetic */ int[] lllllllI;
    private /* synthetic */ int fh;

    private static void llIlllllII() {
        lllllllI = new int[6];
        lllllllI[0] = " ".length();
        lllllllI[1] = ((((24 + 94) - 52) + 86) ^ (((32 + 61) - 83) + 189)) & (((((48 + 62) - 8) + 128) ^ (((49 + 94) - 37) + 79)) ^ (-" ".length()));
        lllllllI[2] = (-((-2845) & 20287)) & (-18) & 30651;
        lllllllI[3] = (-19469) & 20463;
        lllllllI[4] = (-1) & 10000000;
        lllllllI[5] = (-2113) & 15302;
    }

    private static boolean llIlllllIl(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[lllllllI[0]];
        iArr[lllllllI[1]] = lllllllI[2];
        if (llIlllllIl(Inventory.contains(iArr) ? 1 : 0)) {
            return lllllllI[1];
        }
        int[] iArr2 = new int[lllllllI[0]];
        iArr2[lllllllI[1]] = lllllllI[3];
        if (llIllllllI(Inventory.contains(iArr2) ? 1 : 0)) {
            ?? r0 = lllllllI[0];
            int[] iArr3 = new int[lllllllI[0]];
            iArr3[lllllllI[1]] = lllllllI[3];
            if (llIlllllll(Inventory.getCount((boolean) r0, iArr3), lllllllI[4])) {
                return lllllllI[1];
            }
        }
        if (lllIIIIIII(this.fh, lllllllI[0])) {
            this.fh -= lllllllI[0];
            return lllllllI[1];
        }
        if (!llIlllllIl(GrandExchange.isOpen() ? 1 : 0)) {
            GrandExchange.open();
        } else if (llIlllllIl(GrandExchange.canCollect() ? 1 : 0)) {
            GrandExchange.collect();
            return lllllllI[0];
        } else {
            GrandExchange.buy(lllllllI[5], lllllllI[0], lllllllI[4]);
            "".length();
            this.fh += lllllllI[0];
            "".length();
            if ("   ".length() <= " ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lllllllI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public boolean cr() {
        return lllllllI[0];
    }

    static {
        llIlllllII();
    }

    private static boolean lllIIIIIII(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean llIllllllI(int i2) {
        return i2 == 0;
    }

    private static boolean llIlllllll(int i2, int i3) {
        return i2 < i3;
    }

    @Inject
    public aX(SquireMembershipBuyer squireMembershipBuyer) {
        this.fg = squireMembershipBuyer;
    }
}
