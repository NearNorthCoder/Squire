/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.unethicalite.api.commons.Predicates
 *  net.unethicalite.api.items.Items
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.D;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.items.Items;

public class E
extends Items {
    private static /* synthetic */ int[] lIlIIIIllllI;

    public static int a(boolean bl2, int ... nArray) {
        return D.bY.count(bl2, nArray);
    }

    static {
        E.llIlIlIlIIllIl();
    }

    public static int a(boolean bl2, String ... stringArray) {
        return D.bY.count(bl2, stringArray);
    }

    public static List<Item> a(String ... stringArray) {
        return D.bY.all(Predicates.names((String[])stringArray));
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(List<Integer> list) {
        int[] nArray;
        Iterator<Integer> var2 = list.iterator();
        do {
            void var1_1;
            if (E.llIlIlIlIIllll(var2.hasNext() ? 1 : 0)) {
                return lIlIIIIllllI[1];
            }
            int n2 = (Integer)var1_1.next();
            nArray = new int[lIlIIIIllllI[1]];
            nArray[E.lIlIIIIllllI[0]] = n2;
        } while (!E.llIlIlIlIIllll(D.bY.exists(nArray) ? 1 : 0));
        return lIlIIIIllllI[0];
    }

    public static int h(int ... nArray) {
        return D.bY.count(lIlIIIIllllI[0], nArray);
    }

    public static List<Item> f(int ... nArray) {
        return D.bY.all(nArray);
    }

    private static void llIlIlIlIIllIl() {
        lIlIIIIllllI = new int[3];
        E.lIlIIIIllllI[0] = 1 & ~1;
        E.lIlIIIIllllI[1] = 1;
        E.lIlIIIIllllI[2] = 0xFFFFDA21 & 0x22725DF;
    }

    public static Item b(Predicate<Item> predicate) {
        return D.bY.first(predicate);
    }

    private static boolean llIlIlIlIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    public static int a(boolean bl2, Predicate<Item> predicate) {
        return D.bY.count(bl2, predicate);
    }

    public static Item g(int ... nArray) {
        return D.bY.first(nArray);
    }

    public E() {
        super(InventoryID.INVENTORY, item -> {
            item.setWidgetId(lIlIIIIllllI[2]);
            return lIlIIIIllllI[1];
        });
    }

    private static boolean llIlIlIlIIllll(int n2) {
        return n2 == 0;
    }

    public static List<Item> a(Predicate<Item> predicate) {
        return D.bY.all(predicate);
    }

    public static List<Item> bF() {
        return E.a((Item item) -> lIlIIIIllllI[1]);
    }

    public static int c(String ... stringArray) {
        return D.bY.count(lIlIIIIllllI[0], stringArray);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean i(int ... nArray) {
        void var1;
        int[] nArray2 = nArray;
        int n2 = nArray.length;
        int var5 = lIlIIIIllllI[0];
        while (E.llIlIlIlIIlllI(var5, (int)var1)) {
            void var3;
            void var4 = var3[var5];
            int[] nArray3 = new int[lIlIIIIllllI[1]];
            nArray3[E.lIlIIIIllllI[0]] = var4;
            if (E.llIlIlIlIIllll(D.bY.exists(nArray3) ? 1 : 0)) {
                return lIlIIIIllllI[0];
            }
            ++var5;
            0;
            if (-1 <= 0) continue;
            return ((0x12 ^ 0x4A ^ (0x1F ^ 0x7E)) & (3 + 81 - 33 + 122 ^ 95 + 14 - -14 + 25 ^ -1)) != 0;
        }
        return lIlIIIIllllI[1];
    }

    public static int c(Predicate<Item> predicate) {
        return D.bY.count(lIlIIIIllllI[0], predicate);
    }

    public static Item b(String ... stringArray) {
        return D.bY.first(stringArray);
    }
}

