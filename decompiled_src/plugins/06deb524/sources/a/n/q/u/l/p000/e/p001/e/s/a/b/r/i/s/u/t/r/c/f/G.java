package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.ItemContainer;
import net.unethicalite.api.items.Equipment;
@Singleton
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.G  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/G.class */
public class G {
    private static /* synthetic */ int[] lIIllIlIIIlI;
    private /* synthetic */ Instant aI;
    @Inject
    private /* synthetic */ C0014o j;
    @Inject
    private /* synthetic */ Client g;
    private /* synthetic */ ItemContainer aL;
    @Inject
    private /* synthetic */ D aG;
    private final /* synthetic */ Map<Integer, Integer> aF = new HashMap();
    private /* synthetic */ int aH = lIIllIlIIIlI[0];
    private /* synthetic */ int aJ = lIIllIlIIIlI[0];
    private /* synthetic */ int aK = lIIllIlIIIlI[0];

    private void k(int lllllllllllllllIlllIllIllIllIlIl) {
        Instant now = Instant.now();
        if (llIIllllIIlIIl(this.aI)) {
            this.aI = now;
        }
        Duration between = Duration.between(this.aI, now);
        double millis = (between.toMillis() / 1000) / 3600.0d;
        if (llIIllllIIlIlI(between.isNegative() ? 1 : 0) && llIIllllIIIlll(llIIllllIIllIl(millis, 0.0d))) {
            this.aJ = (int) Math.floor(lllllllllllllllIlllIllIllIllIlIl / millis);
        }
    }

    private static boolean llIIllllIIlIlI(int i) {
        return i == 0;
    }

    public int ad() {
        AbstractC0007h X = this.aG.X();
        return llIIllllIIIlll(X instanceof AbstractC0005f ? 1 : 0) ? i(lIIllIlIIIlI[5]) + i(((AbstractC0005f) X).c()) : llIIllllIIIlll(X instanceof AbstractC0006g ? 1 : 0) ? i(((AbstractC0006g) X).c()) : llIIllllIIIlll(X instanceof C0004e ? 1 : 0) ? i(lIIllIlIIIlI[5]) : lIIllIlIIIlI[0];
    }

    private ItemContainer ac() {
        ItemContainer itemContainer = this.g.getItemContainer(InventoryID.BANK);
        if (llIIllllIIlIII(itemContainer)) {
            this.aL = itemContainer;
            return itemContainer;
        }
        return this.aL;
    }

    private static int llIIllllIIlllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIIllllIIlIll(int i, int i2) {
        return i < i2;
    }

    public void T() {
        this.aF.clear();
        this.aH = lIIllIlIIIlI[0];
        this.aI = null;
    }

    private static boolean llIIllllIIIlll(int i) {
        return i != 0;
    }

    private static boolean llIIllllIIlIIl(Object obj) {
        return obj == null;
    }

    public int ag() {
        return this.aH;
    }

    private static int llIIllllIIllIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    public void af() {
        int[] iArr = new int[lIIllIlIIIlI[6]];
        iArr[lIIllIlIIIlI[0]] = lIIllIlIIIlI[7];
        iArr[lIIllIlIIIlI[1]] = lIIllIlIIIlI[8];
        iArr[lIIllIlIIIlI[3]] = lIIllIlIIIlI[9];
        iArr[lIIllIlIIIlI[10]] = lIIllIlIIIlI[11];
        iArr[lIIllIlIIIlI[12]] = lIIllIlIIIlI[13];
        int length = iArr.length;
        int i = lIIllIlIIIlI[0];
        while (llIIllllIIlIll(i, length)) {
            int i2 = iArr[i];
            int lllllllllllllllIlllIllIllIllllII = this.j.p().c(i2);
            if (llIIllllIIllII(lllllllllllllllIlllIllIllIllllII)) {
                this.aF.put(Integer.valueOf(i2), Integer.valueOf(this.aF.getOrDefault(Integer.valueOf(i2), Integer.valueOf(lIIllIlIIIlI[0])).intValue() + lllllllllllllllIlllIllIllIllllII));
                "".length();
            }
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return;
            }
        }
    }

    public int ah() {
        return this.aJ;
    }

    private static void llIIllllIIIllI() {
        lIIllIlIIIlI = new int[14];
        lIIllIlIIIlI[0] = ((206 ^ 184) ^ (31 ^ 82)) & (((12 ^ 58) ^ (139 ^ 134)) ^ (-" ".length()));
        lIIllIlIIIlI[1] = " ".length();
        lIIllIlIIIlI[2] = (-((-32134) & 32661)) & (-1297) & 26559;
        lIIllIlIIIlI[3] = "  ".length();
        lIIllIlIIIlI[4] = (-21539) & 21991;
        lIIllIlIIIlI[5] = (-((-33) & 11876)) & (-20481) & 32767;
        lIIllIlIIIlI[6] = 127 ^ 122;
        lIIllIlIIIlI[7] = (-22083) & 24439;
        lIIllIlIIIlI[8] = (-4237) & 6589;
        lIIllIlIIIlI[9] = (-((-2413) & 19437)) & (-12297) & 31679;
        lIIllIlIIIlI[10] = "   ".length();
        lIIllIlIIIlI[11] = (-((-153) & 13471)) & (-16449) & 32127;
        lIIllIlIIIlI[12] = 78 ^ 74;
        lIIllIlIIIlI[13] = (-((-4617) & 22029)) & (-4737) & 24511;
    }

    public int ai() {
        return this.aK;
    }

    private int a(J j) {
        ItemContainer ac = ac();
        if (llIIllllIIlIIl(ac)) {
            return lIIllIlIIIlI[0];
        }
        int count = ac.count(j.am());
        return llIIllllIIlIlI(j.ao()) ? count : Math.min(count, ac.count(lIIllIlIIIlI[4]) / j.ao());
    }

    public double ae() {
        AbstractC0007h X = this.aG.X();
        if (llIIllllIIIlll(X instanceof AbstractC0005f ? 1 : 0)) {
            return j(lIIllIlIIIlI[5]) + j(((AbstractC0005f) X).c());
        }
        if (llIIllllIIIlll(X instanceof AbstractC0006g ? 1 : 0)) {
            return j(((AbstractC0006g) X).c());
        }
        if (llIIllllIIIlll(X instanceof C0004e ? 1 : 0)) {
            return j(lIIllIlIIIlI[5]);
        }
        return 0.0d;
    }

    private int i(int i) {
        return a(J.o(i));
    }

    public void Z() {
        int[] iArr = new int[lIIllIlIIIlI[1]];
        iArr[lIIllIlIIIlI[0]] = lIIllIlIIIlI[2];
        if (!llIIllllIIIlll(Equipment.contains(iArr) ? 1 : 0)) {
            this.aH += lIIllIlIIIlI[1];
            return;
        }
        this.aH += lIIllIlIIIlI[3];
        "".length();
        if (" ".length() < (-" ".length())) {
        }
    }

    public int aa() {
        int i = lIIllIlIIIlI[0];
        for (Integer num : this.aF.keySet()) {
            i += this.aF.getOrDefault(Integer.valueOf(num.intValue()), Integer.valueOf(lIIllIlIIIlI[0])).intValue();
            "".length();
            if (0 != 0) {
                return (5 ^ 18) & ((132 ^ 147) ^ (-1));
            }
        }
        k(i);
        return i;
    }

    static {
        llIIllllIIIllI();
    }

    private static boolean llIIllllIIlIII(Object obj) {
        return obj != null;
    }

    private double j(int i) {
        return b(J.o(i));
    }

    private double b(J j) {
        return a(j) * j.ap();
    }

    private void b(double d) {
        Instant now = Instant.now();
        if (llIIllllIIlIIl(this.aI)) {
            this.aI = now;
        }
        Duration between = Duration.between(this.aI, now);
        double lllllllllllllllIlllIllIllIlIlIII = (between.toMillis() / 1000) / 3600.0d;
        if (llIIllllIIlIlI(between.isNegative() ? 1 : 0) && llIIllllIIIlll(llIIllllIIlllI(lllllllllllllllIlllIllIllIlIlIII, 0.0d))) {
            this.aK = (int) Math.floor(d / lllllllllllllllIlllIllIllIlIlIII);
        }
    }

    private static boolean llIIllllIIllII(int i) {
        return i > 0;
    }

    public double ab() {
        int intValue;
        double d = 0.0d;
        for (Integer num : this.aF.keySet()) {
            d += J.o(num.intValue()).ap() * this.aF.getOrDefault(Integer.valueOf(intValue), Integer.valueOf(lIIllIlIIIlI[0])).intValue();
            "".length();
            if (0 != 0) {
                return 0.0d;
            }
        }
        b(d);
        return d;
    }
}
