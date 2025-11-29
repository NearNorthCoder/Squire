package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import java.util.List;
import java.util.function.Predicate;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.items.Items;
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.E  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/E.class */
public class E extends Items {
    private static /* synthetic */ int[] lIlIIIIllllI;

    public static int a(boolean z, int... iArr) {
        return D.bY.count(z, iArr);
    }

    static {
        llIlIlIlIIllIl();
    }

    public static int a(boolean z, String... strArr) {
        return D.bY.count(z, strArr);
    }

    public static List<Item> a(String... strArr) {
        return D.bY.all(Predicates.names(strArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean a(List<Integer> list) {
        for (Integer num : list) {
            int intValue = num.intValue();
            E e = D.bY;
            int[] iArr = new int[lIlIIIIllllI[1]];
            iArr[lIlIIIIllllI[0]] = intValue;
            if (llIlIlIlIIllll(e.exists(iArr) ? 1 : 0)) {
                return lIlIIIIllllI[0];
            }
        }
        return lIlIIIIllllI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public static int h(int... iArr) {
        return D.bY.count(lIlIIIIllllI[0], iArr);
    }

    public static List<Item> f(int... iArr) {
        return D.bY.all(iArr);
    }

    private static void llIlIlIlIIllIl() {
        lIlIIIIllllI = new int[3];
        lIlIIIIllllI[0] = " ".length() & (" ".length() ^ (-1));
        lIlIIIIllllI[1] = " ".length();
        lIlIIIIllllI[2] = (-9695) & 36120031;
    }

    public static Item b(Predicate<Item> predicate) {
        return D.bY.first(predicate);
    }

    private static boolean llIlIlIlIIlllI(int i, int i2) {
        return i < i2;
    }

    public static int a(boolean z, Predicate<Item> predicate) {
        return D.bY.count(z, predicate);
    }

    public static Item g(int... iArr) {
        return D.bY.first(iArr);
    }

    public E() {
        super(InventoryID.INVENTORY, item -> {
            item.setWidgetId(lIlIIIIllllI[2]);
            return Boolean.valueOf((boolean) lIlIIIIllllI[1]);
        });
    }

    private static boolean llIlIlIlIIllll(int i) {
        return i == 0;
    }

    public static List<Item> a(Predicate<Item> predicate) {
        return D.bY.all(predicate);
    }

    public static List<Item> bF() {
        return a(item -> {
            return lIlIIIIllllI[1];
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public static int c(String... strArr) {
        return D.bY.count(lIlIIIIllllI[0], strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public static boolean i(int... iArr) {
        int length = iArr.length;
        int lllllllllllllllIlllIIIlIIllllIlI = lIlIIIIllllI[0];
        while (llIlIlIlIIlllI(lllllllllllllllIlllIIIlIIllllIlI, length)) {
            int i = iArr[lllllllllllllllIlllIIIlIIllllIlI];
            E e = D.bY;
            int[] iArr2 = new int[lIlIIIIllllI[1]];
            iArr2[lIlIIIIllllI[0]] = i;
            if (llIlIlIlIIllll(e.exists(iArr2) ? 1 : 0)) {
                return lIlIIIIllllI[0];
            }
            lllllllllllllllIlllIIIlIIllllIlI++;
            "".length();
            if ((-" ".length()) > 0) {
                return ((18 ^ 74) ^ (31 ^ 126)) & (((((3 + 81) - 33) + 122) ^ (((95 + 14) - (-14)) + 25)) ^ (-" ".length()));
            }
        }
        return lIlIIIIllllI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public static int c(Predicate<Item> predicate) {
        return D.bY.count(lIlIIIIllllI[0], predicate);
    }

    public static Item b(String... strArr) {
        return D.bY.first(strArr);
    }
}
