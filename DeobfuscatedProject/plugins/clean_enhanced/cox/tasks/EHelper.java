/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.unethicalite.api.commons.Predicates
 *  net.unethicalite.api.items.Items
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.items.Items;

public class EHelper
extends Items {

    public static int a(boolean bl2, int ... nArray) {
        return D.bY.count(bl2, nArray);
    }

    static {
        E.var2();
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
        Iterator<Integer> var3 = list.iterator();
        do {
            void var1_1;
            if ((var3.hasNext( == 0) ? 1 : 0)) {
                return 1;
            }
            int n2 = (Integer)var1_1.next();
            nArray = new int[1];
            nArray[0] = n2;
        } while (!(D.bY.exists(nArray == 0) ? 1 : 0));
        return 0;
    }

    public static int h(int ... nArray) {
        return D.bY.count(0, nArray);
    }

    public static List<Item> f(int ... nArray) {
        return D.bY.all(nArray);
    }

    public static Item b(Predicate<Item> predicate) {
        return D.bY.first(predicate);
    }

    public static int a(boolean bl2, Predicate<Item> predicate) {
        return D.bY.count(bl2, predicate);
    }

    public static Item g(int ... nArray) {
        return D.bY.first(nArray);
    }

    public EHelper() {
        super(InventoryID.INVENTORY, item -> {
            item.setWidgetId(2);
            return 1;
        });
    }

    public static List<Item> a(Predicate<Item> predicate) {
        return D.bY.all(predicate);
    }

    public static List<Item> bF() {
        return E.a((Item item) -> 1);
    }

    public static int c(String ... stringArray) {
        return D.bY.count(0, stringArray);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean i(int ... nArray) {
        void var4;
        int[] nArray2 = nArray;
        int n2 = nArray.length;
        int var5 = 0;
        while ((var5 < (int)var4)) {
            void var6;
            void var7 = var6[var5];
            int[] nArray3 = new int[1];
            nArray3[0] = var7;
            if ((D.bY.exists(nArray3 == 0) ? 1 : 0)) {
                return 0;
            }
            ++var5;
            0;
            if (-1 <= 0) continue;
            return ((0x12 ^ 0x4A ^ (0x1F ^ 0x7E)) & (3 + 81 - 33 + 122 ^ 95 + 14 - -14 + 25 ^ -1)) != 0;
        }
        return 1;
    }

    public static int c(Predicate<Item> predicate) {
        return D.bY.count(0, predicate);
    }

    public static Item b(String ... stringArray) {
        return D.bY.first(stringArray);
    }
}

