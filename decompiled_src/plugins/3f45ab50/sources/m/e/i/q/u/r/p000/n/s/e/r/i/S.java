package m.e.i.q.u.r.p000.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.mining.SquireMinerConfig;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.S  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/S.class */
public abstract class S extends Task {
    protected static final /* synthetic */ int at;
    protected static final /* synthetic */ int ar;
    protected final /* synthetic */ SquireMinerConfig au;
    protected static final /* synthetic */ int as;
    private static /* synthetic */ int[] lllllIlIIIlI;

    private static boolean lIIlIIllIIlIlIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    public boolean run() {
        if ((!lIIlIIllIIlIIlI(this.au.activity(), EnumC0000a.SANDSTONE) || !lIIlIIllIIlIIlI(this.au.activity(), EnumC0000a.GRANITE)) && !lIIlIIllIIlIIll(this.au.waterskins())) {
            int[] iArr = new int[lllllIlIIIlI[3]];
            iArr[lllllIlIIIlI[1]] = lllllIlIIIlI[11];
            return lIIlIIllIIlIlII(Equipment.contains(iArr) ? 1 : 0) ? lllllIlIIIlI[1] : (lIIlIIllIIlIlIl(y()) && lIIlIIllIIlIlII(z() ? 1 : 0)) ? lllllIlIIIlI[1] : t();
        }
        return lllllIlIIIlI[1];
    }

    private static boolean lIIlIIllIIlIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIIllIIlIIII(int i, int i2) {
        return i <= i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean z() {
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        if (!lIIlIIllIIlIIII(worldLocation.getX(), lllllIlIIIlI[9]) || lIIlIIllIIlIIIl(worldLocation.getY(), lllllIlIIIlI[10])) {
            ?? r0 = lllllIlIIIlI[3];
            "".length();
            return (((((72 + 198) - 192) + 128) ^ (((112 + 73) - 65) + 77)) & (((120 ^ 33) ^ (238 ^ 188)) ^ (-" ".length()))) >= " ".length() ? ((((26 + 24) - (-37)) + 66) ^ (((37 + 6) - (-104)) + 4)) & (((31 ^ 13) ^ (13 ^ 17)) ^ (-" ".length())) : r0;
        }
        return lllllIlIIIlI[1];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int y() {
        int[] iArr = new int[lllllIlIIIlI[0]];
        iArr[lllllIlIIIlI[1]] = lllllIlIIIlI[2];
        iArr[lllllIlIIIlI[3]] = lllllIlIIIlI[4];
        iArr[lllllIlIIIlI[5]] = lllllIlIIIlI[6];
        iArr[lllllIlIIIlI[7]] = lllllIlIIIlI[8];
        return Inventory.getCount(iArr);
    }

    private static boolean lIIlIIllIIlIIIl(int i, int i2) {
        return i > i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public S(SquireMinerConfig squireMinerConfig) {
        this.au = squireMinerConfig;
    }

    public abstract boolean t();

    private static boolean lIIlIIllIIlIlII(int i) {
        return i != 0;
    }

    private static void lIIlIIllIIIllll() {
        lllllIlIIIlI = new int[13];
        lllllIlIIIlI[0] = (((22 + 40) - 40) + 116) ^ (((53 + 123) - 38) + 4);
        lllllIlIIIlI[1] = ((((32 + 149) - 157) + 143) ^ (((44 + 44) - (-6)) + 88)) & (((((103 + 60) - 145) + 192) ^ (((148 + 50) - 63) + 60)) ^ (-" ".length()));
        lllllIlIIIlI[2] = (-((-16705) & 31169)) & (-97) & 16383;
        lllllIlIIIlI[3] = " ".length();
        lllllIlIIIlI[4] = (-(40 ^ 47)) & (-28889) & 30719;
        lllllIlIIIlI[5] = "  ".length();
        lllllIlIIIlI[6] = (-((-805) & 31717)) & (-29) & 32767;
        lllllIlIIIlI[7] = "   ".length();
        lllllIlIIIlI[8] = (-26825) & 28653;
        lllllIlIIIlI[9] = (-((-57) & 4799)) & (-8193) & 16127;
        lllllIlIIIlI[10] = (-25630) & 28479;
        lllllIlIIIlI[11] = (-1191) & 28159;
        lllllIlIIIlI[12] = (-((-35) & 20019)) & (-1) & 61310;
    }

    private static boolean lIIlIIllIIlIIll(int i) {
        return i == 0;
    }

    static {
        lIIlIIllIIIllll();
        at = lllllIlIIIlI[12];
        as = lllllIlIIIlI[10];
        ar = lllllIlIIIlI[9];
    }
}
