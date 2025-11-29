package m.e.i.q.u.r.p000.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Using Special Attack")
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.k  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/k.class */
public class C0010k extends Task {
    private final /* synthetic */ T u;
    private final /* synthetic */ SquireMinerConfig t;
    private static final /* synthetic */ Logger s;
    private static /* synthetic */ int[] lllllIIIllll;

    static {
        lIIlIIlIlIIIllI();
        s = LoggerFactory.getLogger(C0010k.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean o() {
        int[] iArr = new int[lllllIIIllll[3]];
        iArr[lllllIIIllll[0]] = lllllIIIllll[4];
        if (lIIlIIlIlIIIlll(Equipment.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lllllIIIllll[3]];
            iArr2[lllllIIIllll[0]] = lllllIIIllll[5];
            if (lIIlIIlIlIIIlll(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lllllIIIllll[3]];
                iArr3[lllllIIIllll[0]] = lllllIIIllll[6];
                if (lIIlIIlIlIIIlll(Equipment.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lllllIIIllll[3]];
                    iArr4[lllllIIIllll[0]] = lllllIIIllll[7];
                    if (lIIlIIlIlIIIlll(Equipment.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lllllIIIllll[3]];
                        iArr5[lllllIIIllll[0]] = lllllIIIllll[8];
                        if (lIIlIIlIlIIIlll(Equipment.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lllllIIIllll[3]];
                            iArr6[lllllIIIllll[0]] = lllllIIIllll[9];
                            if (lIIlIIlIlIIIlll(Equipment.contains(iArr6) ? 1 : 0)) {
                                int[] iArr7 = new int[lllllIIIllll[3]];
                                iArr7[lllllIIIllll[0]] = lllllIIIllll[10];
                                if (!lIIlIIlIlIIlIII(Equipment.contains(iArr7) ? 1 : 0)) {
                                    return lllllIIIllll[0];
                                }
                            }
                        }
                    }
                }
            }
        }
        ?? r0 = lllllIIIllll[3];
        "".length();
        return " ".length() == ((154 ^ 128) ^ (181 ^ 171)) ? ((((49 + 36) - 5) + 138) ^ (((127 + 99) - 150) + 72)) & (((((102 + 194) - 258) + 172) ^ (((98 + 82) - 48) + 24)) ^ (-" ".length())) : r0;
    }

    private static boolean lIIlIIlIlIIlIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    public boolean run() {
        if (!lIIlIIlIlIIIlll(o() ? 1 : 0) && !lIIlIIlIlIIlIII(Inventory.isFull() ? 1 : 0) && !lIIlIIlIlIIlIIl(Combat.getSpecEnergy(), lllllIIIllll[1])) {
            Player local = Players.getLocal();
            if (lIIlIIlIlIIlIlI(this.t.activity(), EnumC0000a.MOTHERLODE_MINE) && lIIlIIlIlIIlIll(this.u.a(this.t.mlmArea()).distanceTo(local), lllllIIIllll[2])) {
                return lllllIIIllll[0];
            }
            Combat.toggleSpec();
            return lllllIIIllll[3];
        }
        return lllllIIIllll[0];
    }

    private static boolean lIIlIIlIlIIlIII(int i) {
        return i != 0;
    }

    private static void lIIlIIlIlIIIllI() {
        lllllIIIllll = new int[11];
        lllllIIIllll[0] = ((195 ^ 152) ^ (11 ^ 84)) & (((((76 + 26) - 86) + 131) ^ (((47 + 66) - 15) + 53)) ^ (-" ".length()));
        lllllIIIllll[1] = 221 ^ 185;
        lllllIIIllll[2] = 114 ^ 119;
        lllllIIIllll[3] = " ".length();
        lllllIIIllll[4] = (-((-1490) & 22011)) & (-261) & 32701;
        lllllIIIllll[5] = (-((-2539) & 4075)) & (-1) & 14333;
        lllllIIIllll[6] = (-8835) & 32511;
        lllllIIIllll[7] = (-((-1539) & 5835)) & (-1028) & 30699;
        lllllIIIllll[8] = (-((-31945) & 32718)) & (-8275) & 32727;
        lllllIIIllll[9] = (-137) & 23999;
        lllllIIIllll[10] = (-582) & 24263;
    }

    @Inject
    public C0010k(SquireMinerConfig squireMinerConfig, T t) {
        this.t = squireMinerConfig;
        this.u = t;
    }

    private static boolean lIIlIIlIlIIlIll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIIlIlIIIlll(int i) {
        return i == 0;
    }

    private static boolean lIIlIIlIlIIlIIl(int i, int i2) {
        return i != i2;
    }
}
