package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import java.util.Arrays;
import java.util.stream.IntStream;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.s  reason: invalid package and case insensitive filesystem */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/s.class */
public class C0018s {
    private /* synthetic */ Item[] aq = new Item[lIIllIlIlllI[0]];
    private /* synthetic */ ItemContainer ap;
    private static /* synthetic */ int[] lIIllIlIlllI;
    @Inject
    private /* synthetic */ Client g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean f(int i) {
        if (llIIlllllIlIII(c(i))) {
            ?? r0 = lIIllIlIlllI[1];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? " ".length() & (" ".length() ^ (-1)) : r0;
        }
        return lIIllIlIlllI[0];
    }

    private static boolean llIIlllllIlIIl(int i, int i2) {
        return i < i2;
    }

    public void i() {
        B();
        if (llIIlllllIIlIl(this.ap)) {
            this.aq = (Item[]) this.ap.getItems().clone();
        }
    }

    public int c(int i) {
        int[] iArr = new int[lIIllIlIlllI[1]];
        iArr[lIIllIlIlllI[0]] = i;
        return a(iArr) - e(i);
    }

    public int D() {
        B();
        int i = lIIllIlIlllI[2];
        int[] iArr = new int[lIIllIlIlllI[3]];
        iArr[lIIllIlIlllI[0]] = lIIllIlIlllI[4];
        iArr[lIIllIlIlllI[1]] = lIIllIlIlllI[5];
        iArr[lIIllIlIlllI[6]] = lIIllIlIlllI[7];
        iArr[lIIllIlIlllI[8]] = lIIllIlIlllI[9];
        iArr[lIIllIlIlllI[10]] = lIIllIlIlllI[11];
        iArr[lIIllIlIlllI[12]] = lIIllIlIlllI[13];
        iArr[lIIllIlIlllI[14]] = lIIllIlIlllI[15];
        iArr[lIIllIlIlllI[16]] = lIIllIlIlllI[17];
        iArr[lIIllIlIlllI[18]] = lIIllIlIlllI[19];
        iArr[lIIllIlIlllI[20]] = lIIllIlIlllI[21];
        iArr[lIIllIlIlllI[22]] = lIIllIlIlllI[23];
        iArr[lIIllIlIlllI[24]] = lIIllIlIlllI[25];
        Item[] items = this.ap.getItems();
        int lllllllllllllllIlllIllIIlllllllI = items.length;
        int i2 = lIIllIlIlllI[0];
        while (llIIlllllIlIIl(i2, lllllllllllllllIlllIllIIlllllllI)) {
            Item item = items[i2];
            if (llIIlllllIlIII(IntStream.of(iArr).noneMatch(i3 -> {
                if (llIIlllllIlIll(i3, item.getId())) {
                    ?? r0 = lIIllIlIlllI[1];
                    "".length();
                    return (-"   ".length()) > 0 ? ((93 ^ 42) ^ (3 ^ 98)) & (((((115 + 168) - 143) + 29) ^ (((52 + 15) - (-121)) + 3)) ^ (-" ".length())) : r0;
                }
                return lIIllIlIlllI[0];
            }) ? 1 : 0) && llIIlllllIlIlI(item.getQuantity())) {
                i--;
            }
            i2++;
            "".length();
            if (" ".length() != " ".length()) {
                return (96 ^ 36) & ((242 ^ 182) ^ (-1));
            }
        }
        return i;
    }

    private static boolean llIIlllllIlIII(int i) {
        return i != 0;
    }

    public int C() {
        B();
        int i = lIIllIlIlllI[2];
        Item[] items = this.ap.getItems();
        int length = items.length;
        int lllllllllllllllIlllIllIlIIIIlIll = lIIllIlIlllI[0];
        while (llIIlllllIlIIl(lllllllllllllllIlllIllIlIIIIlIll, length)) {
            if (llIIlllllIlIlI(items[lllllllllllllllIlllIllIlIIIIlIll].getQuantity())) {
                i--;
            }
            lllllllllllllllIlllIllIlIIIIlIll++;
            "".length();
            if ("  ".length() < 0) {
                return ((171 ^ 193) ^ (133 ^ 184)) & (((((215 + 146) - 272) + 136) ^ (((34 + 0) - (-5)) + 143)) ^ (-" ".length()));
            }
        }
        return i;
    }

    private static boolean llIIlllllIlIlI(int i) {
        return i > 0;
    }

    static {
        llIIlllllIIIll();
    }

    private static void llIIlllllIIIll() {
        lIIllIlIlllI = new int[26];
        lIIllIlIlllI[0] = ((119 ^ 73) ^ (87 ^ 112)) & (((180 ^ 130) ^ (40 ^ 7)) ^ (-" ".length()));
        lIIllIlIlllI[1] = " ".length();
        lIIllIlIlllI[2] = 172 ^ 176;
        lIIllIlIlllI[3] = 126 ^ 114;
        lIIllIlIlllI[4] = (-((-2339) & 15651)) & (-16529) & 32191;
        lIIllIlIlllI[5] = (-((-2449) & 31193)) & (-1153) & 32255;
        lIIllIlIlllI[6] = "  ".length();
        lIIllIlIlllI[7] = (-((-8449) & 26561)) & (-12295) & 32767;
        lIIllIlIlllI[8] = "   ".length();
        lIIllIlIlllI[9] = (-8389) & 10751;
        lIIllIlIlllI[10] = 180 ^ 176;
        lIIllIlIlllI[11] = (-((-289) & 14251)) & (-16449) & 32767;
        lIIllIlIlllI[12] = (92 ^ 117) ^ (38 ^ 10);
        lIIllIlIlllI[13] = (-4609) & 6961;
        lIIllIlIlllI[14] = (6 ^ 9) ^ (189 ^ 180);
        lIIllIlIlllI[15] = (-21573) & 22012;
        lIIllIlIlllI[16] = (4 ^ 117) ^ (93 ^ 43);
        lIIllIlIlllI[17] = (-((-2153) & 19561)) & (-14401) & 32255;
        lIIllIlIlllI[18] = 77 ^ 69;
        lIIllIlIlllI[19] = (-((-841) & 31595)) & (-537) & 31739;
        lIIllIlIlllI[20] = (152 ^ 146) ^ "   ".length();
        lIIllIlIlllI[21] = (-17457) & 17907;
        lIIllIlIlllI[22] = 112 ^ 122;
        lIIllIlIlllI[23] = (-2628) & 3071;
        lIIllIlIlllI[24] = 92 ^ 87;
        lIIllIlIlllI[25] = (-((-27929) & 32539)) & (-17409) & 22471;
    }

    private void B() {
        ItemContainer itemContainer = this.g.getItemContainer(InventoryID.INVENTORY);
        if (llIIlllllIIlIl(itemContainer)) {
            this.ap = itemContainer;
        }
    }

    private static boolean llIIlllllIlIll(int i, int i2) {
        return i == i2;
    }

    private int e(int i) {
        return ((Integer) Arrays.stream(this.aq).filter(item -> {
            if (llIIlllllIlIll(item.getId(), i)) {
                ?? r0 = lIIllIlIlllI[1];
                "".length();
                return ((32 ^ 22) & ((39 ^ 17) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIllIlIlllI[0];
        }).findFirst().map((v0) -> {
            return v0.getQuantity();
        }).orElse(Integer.valueOf(lIIllIlIlllI[0]))).intValue();
    }

    private static boolean llIIlllllIIlIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean b(int... iArr) {
        if (llIIlllllIlIlI(a(iArr))) {
            ?? r0 = lIIllIlIlllI[1];
            "".length();
            return " ".length() <= (-" ".length()) ? ((((58 + 24) - (-21)) + 95) ^ (((91 + 78) - 60) + 24)) & (((249 ^ 199) ^ (247 ^ 138)) ^ (-" ".length())) : r0;
        }
        return lIIllIlIlllI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean E() {
        if (llIIlllllIlIlI(C())) {
            ?? r0 = lIIllIlIlllI[1];
            "".length();
            return 0 != 0 ? ((((92 + 88) - 15) + 4) ^ (((180 + 180) - 183) + 7)) & (("   ".length() ^ (214 ^ 196)) ^ (-" ".length())) : r0;
        }
        return lIIllIlIlllI[0];
    }

    public void j() {
        this.ap = null;
        this.aq = new Item[lIIllIlIlllI[0]];
    }

    public int a(int... iArr) {
        B();
        int i = lIIllIlIlllI[0];
        int length = iArr.length;
        int i2 = lIIllIlIlllI[0];
        while (llIIlllllIlIIl(i2, length)) {
            i += this.ap.count(iArr[i2]);
            i2++;
            "".length();
            if (" ".length() == 0) {
                return ((252 ^ 195) ^ (119 ^ 29)) & (((232 ^ 177) ^ (24 ^ 20)) ^ (-" ".length()));
            }
        }
        return i;
    }
}
