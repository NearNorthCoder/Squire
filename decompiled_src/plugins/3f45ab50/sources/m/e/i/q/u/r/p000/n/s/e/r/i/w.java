package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import net.runelite.api.Item;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;
@TaskDesc(name = "Chiseling amethyst", priority = 10, blocking = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.w  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/w.class */
public class w extends Task {
    private /* synthetic */ boolean J = lllllIlIIllI[0];
    private static /* synthetic */ int[] lllllIlIIllI;
    private final /* synthetic */ SquireMinerConfig I;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Inject
    public w(SquireMinerConfig squireMinerConfig) {
        this.I = squireMinerConfig;
    }

    private static boolean lIIlIIllIlIIIIl(int i) {
        return i != 0;
    }

    static {
        lIIlIIllIIllllI();
    }

    private static boolean lIIlIIllIlIIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    public boolean run() {
        if (!lIIlIIllIIlllll(this.I.activity(), EnumC0000a.AMETHYST) && !lIIlIIllIlIIIII(this.I.craft(), EnumC0001b.DISABLE)) {
            if (lIIlIIllIlIIIIl(Inventory.isFull() ? 1 : 0)) {
                this.J = lllllIlIIllI[1];
                "".length();
                if ("   ".length() <= " ".length()) {
                    return ((104 ^ 6) ^ (198 ^ 189)) & (((((59 + 110) - 50) + 90) ^ (((150 + 172) - 301) + 175)) ^ (-" ".length()));
                }
            } else {
                int[] iArr = new int[lllllIlIIllI[1]];
                iArr[lllllIlIIllI[0]] = lllllIlIIllI[2];
                if (lIIlIIllIlIIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                    this.J = lllllIlIIllI[0];
                }
            }
            if (lIIlIIllIlIIIlI(this.J ? 1 : 0)) {
                return lllllIlIIllI[0];
            }
            int[] iArr2 = new int[lllllIlIIllI[1]];
            iArr2[lllllIlIIllI[0]] = lllllIlIIllI[3];
            Item first = Inventory.getFirst(iArr2);
            if (lIIlIIllIlIIIll(first)) {
                return lllllIlIIllI[0];
            }
            if (lIIlIIllIlIIIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                sleep(Rand.nextInt(lllllIlIIllI[4], lllllIlIIllI[5]));
                return lllllIlIIllI[1];
            } else if (lIIlIIllIlIIIIl(Production.isOpen() ? 1 : 0)) {
                Production.chooseOption(this.I.craft().ordinal() + lllllIlIIllI[1]);
                sleep(lllllIlIIllI[6]);
                return lllllIlIIllI[1];
            } else {
                int[] iArr3 = new int[lllllIlIIllI[1]];
                iArr3[lllllIlIIllI[0]] = lllllIlIIllI[2];
                first.useOn(Inventory.getFirst(iArr3));
                return lllllIlIIllI[1];
            }
        }
        return lllllIlIIllI[0];
    }

    private static void lIIlIIllIIllllI() {
        lllllIlIIllI = new int[7];
        lllllIlIIllI[0] = (52 ^ 45) & ((51 ^ 42) ^ (-1));
        lllllIlIIllI[1] = " ".length();
        lllllIlIIllI[2] = (-2049) & 23395;
        lllllIlIIllI[3] = (-4133) & 5887;
        lllllIlIIllI[4] = (((135 + 40) - 65) + 34) ^ (((50 + 27) - 50) + 122);
        lllllIlIIllI[5] = (219 ^ 153) ^ (248 ^ 178);
        lllllIlIIllI[6] = "  ".length();
    }

    private static boolean lIIlIIllIlIIIlI(int i) {
        return i == 0;
    }

    private static boolean lIIlIIllIIlllll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIIllIlIIIll(Object obj) {
        return obj == null;
    }
}
