package w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import javax.inject.Inject;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Using Special Attack", priority = 99999)
/* renamed from: w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.g  reason: invalid package */
/* loaded from: f90b6cea-b1e4-4f52-8aee-23d3738ff311.jar:w/r/e/i/d/r/q/u/e/-/c/u/o/s/o/t/t/g.class */
public class g extends Task {
    private final /* synthetic */ SquireWoodcutterConfig F;
    private static /* synthetic */ int[] lIllIIIIllIll;
    private final /* synthetic */ SquireWoodcutterPlugin E;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    public boolean run() {
        if (!llIIIlIIlIIIIII(t() ? 1 : 0) && !llIIIlIIlIIIIIl(this.E.p() ? 1 : 0) && !llIIIlIIlIIIIIl(Inventory.isFull() ? 1 : 0) && !llIIIlIIlIIIIlI(Combat.getSpecEnergy(), lIllIIIIllIll[1])) {
            Combat.toggleSpec();
            return lIllIIIIllIll[2];
        }
        return lIllIIIIllIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean t() {
        int[] iArr = new int[lIllIIIIllIll[2]];
        iArr[lIllIIIIllIll[0]] = lIllIIIIllIll[3];
        if (llIIIlIIlIIIIII(Equipment.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIllIIIIllIll[2]];
            iArr2[lIllIIIIllIll[0]] = lIllIIIIllIll[4];
            if (llIIIlIIlIIIIII(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIllIIIIllIll[2]];
                iArr3[lIllIIIIllIll[0]] = lIllIIIIllIll[5];
                if (llIIIlIIlIIIIII(Equipment.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIllIIIIllIll[2]];
                    iArr4[lIllIIIIllIll[0]] = lIllIIIIllIll[6];
                    if (llIIIlIIlIIIIII(Equipment.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIllIIIIllIll[2]];
                        iArr5[lIllIIIIllIll[0]] = lIllIIIIllIll[7];
                        if (llIIIlIIlIIIIII(Equipment.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIllIIIIllIll[2]];
                            iArr6[lIllIIIIllIll[0]] = lIllIIIIllIll[8];
                            if (llIIIlIIlIIIIII(Equipment.contains(iArr6) ? 1 : 0)) {
                                int[] iArr7 = new int[lIllIIIIllIll[2]];
                                iArr7[lIllIIIIllIll[0]] = lIllIIIIllIll[9];
                                if (llIIIlIIlIIIIII(Equipment.contains(iArr7) ? 1 : 0)) {
                                    int[] iArr8 = new int[lIllIIIIllIll[2]];
                                    iArr8[lIllIIIIllIll[0]] = lIllIIIIllIll[10];
                                    if (!llIIIlIIlIIIIIl(Equipment.contains(iArr8) ? 1 : 0)) {
                                        return lIllIIIIllIll[0];
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ?? r0 = lIllIIIIllIll[2];
        "".length();
        return (("  ".length() ^ (63 ^ 24)) & (((199 ^ 155) ^ (124 ^ 5)) ^ (-" ".length()))) > " ".length() ? ((120 ^ 40) ^ (21 ^ 100)) & (((29 ^ 67) ^ (((34 + 51) - 26) + 68)) ^ (-" ".length())) : r0;
    }

    private static boolean llIIIlIIlIIIIlI(int i, int i2) {
        return i != i2;
    }

    @Inject
    public g(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.E = squireWoodcutterPlugin;
        this.F = squireWoodcutterConfig;
    }

    static {
        llIIIlIIIllllll();
    }

    private static boolean llIIIlIIlIIIIII(int i) {
        return i == 0;
    }

    private static void llIIIlIIIllllll() {
        lIllIIIIllIll = new int[11];
        lIllIIIIllIll[0] = (19 ^ 25) & ((35 ^ 41) ^ (-1));
        lIllIIIIllIll[1] = (68 ^ 31) ^ (154 ^ 165);
        lIllIIIIllIll[2] = " ".length();
        lIllIIIIllIll[3] = (-16653) & 23391;
        lIllIIIIllIll[4] = (-6162) & 31539;
        lIllIIIIllIll[5] = (-(((38 + 49) - 76) + 118)) & (-7) & 23807;
        lIllIIIIllIll[6] = (-8453) & 32127;
        lIllIIIIllIll[7] = (-16454) & 29695;
        lIllIIIIllIll[8] = (-4293) & 29663;
        lIllIIIIllIll[9] = (-((-929) & 3047)) & (-1025) & 16383;
        lIllIIIIllIll[10] = (-3606) & 28671;
    }

    private static boolean llIIIlIIlIIIIIl(int i) {
        return i != 0;
    }
}
