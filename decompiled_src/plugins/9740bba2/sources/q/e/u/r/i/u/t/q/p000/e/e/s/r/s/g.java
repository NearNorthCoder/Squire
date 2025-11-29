package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.runelite.api.Item;
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.g  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/g.class */
class g {
    private static /* synthetic */ int[] lIIIllIlIIllI;
    /* synthetic */ int[] ab = new int[lIIIllIlIIllI[0]];

    protected boolean a(Object obj) {
        return obj instanceof g;
    }

    static {
        lIlIIIlIlIIIllI();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Item> u() {
        ArrayList arrayList = new ArrayList();
        int lllllllllllllllIIIIlIIlIlIIIlIII = lIIIllIlIIllI[0];
        while (lIlIIIlIlIIIlll(lllllllllllllllIIIIlIIlIlIIIlIII, this.ab.length - lIIIllIlIIllI[1])) {
            arrayList.add(new Item(this.ab[lllllllllllllllIIIIlIIlIlIIIlIII], this.ab[lllllllllllllllIIIIlIIlIlIIIlIII + lIIIllIlIIllI[2]]));
            "".length();
            lllllllllllllllIIIIlIIlIlIIIlIII += 2;
            "".length();
            if ((((56 ^ 119) ^ "  ".length()) & (((((66 + 225) - 260) + 210) ^ (((78 + 128) - 177) + 159)) ^ (-" ".length())) & ((((94 ^ 56) ^ (50 ^ 54)) & (((((15 + 98) - (-69)) + 70) ^ (((37 + 13) - (-4)) + 104)) ^ (-" ".length()))) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return arrayList;
    }

    private static boolean lIlIIIlIlIIlIIl(int i) {
        return i == 0;
    }

    public void a(int[] iArr) {
        this.ab = iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Item[] itemArr) {
        a(Arrays.asList(itemArr));
    }

    public String toString() {
        return "QuestBankData(idAndQuantity=" + Arrays.toString(v()) + ")";
    }

    private static boolean lIlIIIlIlIIlIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIIIlIlIIIlll(int i, int i2) {
        return i < i2;
    }

    public int[] v() {
        return this.ab;
    }

    void a(List<Item> list) {
        int[] iArr = new int[list.size() * lIIIllIlIIllI[1]];
        int i = lIIIllIlIIllI[0];
        while (lIlIIIlIlIIIlll(i, list.size())) {
            Item item = list.get(i);
            iArr[i * lIIIllIlIIllI[1]] = item.getId();
            iArr[(i * lIIIllIlIIllI[1]) + lIIIllIlIIllI[2]] = item.getQuantity();
            i++;
            "".length();
            if ((((13 ^ 37) ^ (22 ^ 37)) & (((150 ^ 133) ^ (47 ^ 39)) ^ (-" ".length()))) != 0) {
                return;
            }
        }
        this.ab = iArr;
    }

    public int hashCode() {
        int i = lIIIllIlIIllI[3];
        return (lIIIllIlIIllI[2] * lIIIllIlIIllI[3]) + Arrays.hashCode(v());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        this.ab = new int[lIIIllIlIIllI[0]];
    }

    private static void lIlIIIlIlIIIllI() {
        lIIIllIlIIllI = new int[4];
        lIIIllIlIIllI[0] = ((149 ^ 137) ^ (62 ^ 116)) & (((1 ^ 87) ^ ((134 ^ 151) & ((137 ^ 152) ^ (-1)))) ^ (-" ".length()));
        lIIIllIlIIllI[1] = "  ".length();
        lIIIllIlIIllI[2] = " ".length();
        lIIIllIlIIllI[3] = (213 ^ 199) ^ (19 ^ 58);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    public boolean equals(Object obj) {
        if (lIlIIIlIlIIlIII(obj, this)) {
            return lIIIllIlIIllI[2];
        }
        if (lIlIIIlIlIIlIIl(obj instanceof g ? 1 : 0)) {
            return lIIIllIlIIllI[0];
        }
        g gVar = (g) obj;
        if (!lIlIIIlIlIIlIIl(gVar.a(this) ? 1 : 0) && !lIlIIIlIlIIlIIl(Arrays.equals(v(), gVar.v()) ? 1 : 0)) {
            return lIIIllIlIIllI[2];
        }
        return lIIIllIlIIllI[0];
    }
}
