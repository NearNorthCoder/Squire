package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.runelite.api.Item;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.g  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/g.class */
class C0006g {
    private static /* synthetic */ int[] lIlIIlIIIIIlI;
    /* synthetic */ int[] ac = new int[lIlIIlIIIIIlI[0]];

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u() {
        this.ac = new int[lIlIIlIIIIIlI[0]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    public boolean equals(Object obj) {
        if (lIlllIIIllIIllI(obj, this)) {
            return lIlIIlIIIIIlI[2];
        }
        if (lIlllIIIllIIlll(obj instanceof C0006g ? 1 : 0)) {
            return lIlIIlIIIIIlI[0];
        }
        C0006g c0006g = (C0006g) obj;
        if (!lIlllIIIllIIlll(c0006g.a(this) ? 1 : 0) && !lIlllIIIllIIlll(Arrays.equals(w(), c0006g.w()) ? 1 : 0)) {
            return lIlIIlIIIIIlI[2];
        }
        return lIlIIlIIIIIlI[0];
    }

    public String toString() {
        return "QuestBankData(idAndQuantity=" + Arrays.toString(w()) + ")";
    }

    public int hashCode() {
        int i = lIlIIlIIIIIlI[3];
        return (lIlIIlIIIIIlI[2] * lIlIIlIIIIIlI[3]) + Arrays.hashCode(w());
    }

    private static boolean lIlllIIIllIIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        lIlllIIIllIIlII();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Item[] itemArr) {
        a(Arrays.asList(itemArr));
    }

    private static boolean lIlllIIIllIIlIl(int i, int i2) {
        return i < i2;
    }

    protected boolean a(Object obj) {
        return obj instanceof C0006g;
    }

    void a(List<Item> list) {
        int[] iArr = new int[list.size() * lIlIIlIIIIIlI[1]];
        int i = lIlIIlIIIIIlI[0];
        while (lIlllIIIllIIlIl(i, list.size())) {
            Item item = list.get(i);
            iArr[i * lIlIIlIIIIIlI[1]] = item.getId();
            iArr[(i * lIlIIlIIIIIlI[1]) + lIlIIlIIIIIlI[2]] = item.getQuantity();
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return;
            }
        }
        this.ac = iArr;
    }

    public int[] w() {
        return this.ac;
    }

    private static boolean lIlllIIIllIIlll(int i) {
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Item> v() {
        ArrayList arrayList = new ArrayList();
        int i = lIlIIlIIIIIlI[0];
        while (lIlllIIIllIIlIl(i, this.ac.length - lIlIIlIIIIIlI[1])) {
            arrayList.add(new Item(this.ac[i], this.ac[i + lIlIIlIIIIIlI[2]]));
            "".length();
            i += 2;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return arrayList;
    }

    public void a(int[] iArr) {
        this.ac = iArr;
    }

    private static void lIlllIIIllIIlII() {
        lIlIIlIIIIIlI = new int[4];
        lIlIIlIIIIIlI[0] = ((56 ^ 122) ^ (132 ^ 165)) & (((37 ^ 46) ^ (123 ^ 19)) ^ (-" ".length()));
        lIlIIlIIIIIlI[1] = "  ".length();
        lIlIIlIIIIIlI[2] = " ".length();
        lIlIIlIIIIIlI[3] = (87 ^ 26) ^ (238 ^ 152);
    }
}
