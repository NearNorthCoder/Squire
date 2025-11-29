package r.g.q.p000.s.r.s.u.i.e.r.r.n.c.s.p001.e.s.e.o.e.d.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireSorceressGardenConfig;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Making Juice")
/* renamed from: r.g.q.-.s.r.s.u.i.e.r.r.n.c.s.-.e.s.e.o.e.d.a.d  reason: invalid package */
/* loaded from: 36afa564-21f3-409d-8955-c6e80fe75d70.jar:r/g/q/-/s/r/s/u/i/e/r/r/n/c/s/-/e/s/e/o/e/d/a/d.class */
public class d extends Task {
    private final /* synthetic */ SquireSorceressGardenConfig u;
    private static /* synthetic */ int[] lIIllIIIlllll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private boolean u() {
        if (lIlIllllIllIllI(Bank.isOpen() ? 1 : 0)) {
            return x();
        }
        Bank.open();
        "".length();
        return lIIllIIIlllll[1];
    }

    private static boolean lIlIllllIlllIlI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean v() {
        int[] iArr = new int[lIIllIIIlllll[1]];
        iArr[lIIllIIIlllll[0]] = lIIllIIIlllll[2];
        if (lIlIllllIllIllI(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIllIIIlllll[1]];
            iArr2[lIIllIIIlllll[0]] = lIIllIIIlllll[2];
            if (lIlIllllIllIlll(Inventory.getCount(iArr2), lIIllIIIlllll[3])) {
                int[] iArr3 = new int[lIIllIIIlllll[1]];
                iArr3[lIIllIIIlllll[0]] = lIIllIIIlllll[4];
                if (lIlIllllIllIllI(Inventory.contains(iArr3) ? 1 : 0)) {
                    ?? r0 = lIIllIIIlllll[1];
                    "".length();
                    return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lIIllIIIlllll[0];
    }

    private static boolean lIlIllllIllIlll(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    private boolean x() {
        int[] iArr = new int[lIIllIIIlllll[1]];
        iArr[lIIllIIIlllll[0]] = lIIllIIIlllll[6];
        if (lIlIllllIllIllI(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIllIIIlllll[1]];
            iArr2[lIIllIIIlllll[0]] = lIIllIIIlllll[6];
            Bank.depositAll(iArr2);
            return lIIllIIIlllll[1];
        }
        int[] iArr3 = new int[lIIllIIIlllll[1]];
        iArr3[lIIllIIIlllll[0]] = lIIllIIIlllll[4];
        if (lIlIllllIlllIll(Inventory.contains(iArr3) ? 1 : 0)) {
            Bank.withdraw(lIIllIIIlllll[4], lIIllIIIlllll[7], Bank.WithdrawMode.ITEM);
            return lIIllIIIlllll[1];
        }
        int[] iArr4 = new int[lIIllIIIlllll[1]];
        iArr4[lIIllIIIlllll[0]] = lIIllIIIlllll[2];
        if (lIlIllllIlllIll(Inventory.contains(iArr4) ? 1 : 0)) {
            Bank.withdraw(lIIllIIIlllll[2], lIIllIIIlllll[8], Bank.WithdrawMode.ITEM);
            return lIIllIIIlllll[1];
        }
        return lIIllIIIlllll[0];
    }

    private static boolean lIlIllllIlllIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIllllIllIlIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIlIllllIlllIIl(Object obj) {
        return obj != null;
    }

    static {
        lIlIllllIllIlII();
    }

    private static void lIlIllllIllIlII() {
        lIIllIIIlllll = new int[9];
        lIIllIIIlllll[0] = ("  ".length() ^ (154 ^ 150)) & (((126 ^ 97) ^ (94 ^ 79)) ^ (-" ".length()));
        lIIllIIIlllll[1] = " ".length();
        lIIllIIIlllll[2] = (-16769) & 27613;
        lIIllIIIlllll[3] = "  ".length();
        lIIllIIIlllll[4] = (-((-17997) & 32461)) & (-16385) & 32767;
        lIIllIIIlllll[5] = ((207 + 158) - 155) + 23;
        lIIllIIIlllll[6] = (-((-25617) & 29981)) & (-1043) & 16255;
        lIIllIIIlllll[7] = 36 ^ 45;
        lIIllIIIlllll[8] = (94 ^ 35) ^ (230 ^ 143);
    }

    private static boolean lIlIllllIllIllI(int i) {
        return i != 0;
    }

    @Inject
    public d(SquireSorceressGardenConfig squireSorceressGardenConfig) {
        this.u = squireSorceressGardenConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    public boolean run() {
        if (lIlIllllIllIlIl(this.u.botActivity(), a.MAKE)) {
            return lIIllIIIlllll[0];
        }
        if (lIlIllllIllIllI(v() ? 1 : 0)) {
            w();
            return lIIllIIIlllll[1];
        }
        return u();
    }

    private void w() {
        int[] iArr = new int[lIIllIIIlllll[1]];
        iArr[lIIllIIIlllll[0]] = lIIllIIIlllll[5];
        Item first = Inventory.getFirst(iArr);
        int i = lIIllIIIlllll[0];
        while (lIlIllllIlllIII(i, Inventory.getAll().size())) {
            Item item = Inventory.getItem(i);
            if (lIlIllllIlllIIl(item) && lIlIllllIlllIlI(item.getId(), lIIllIIIlllll[2])) {
                first.useOn(item);
            }
            i++;
            "".length();
            if ((12 ^ 8) < 0) {
                return;
            }
        }
    }

    private static boolean lIlIllllIlllIll(int i) {
        return i == 0;
    }
}
