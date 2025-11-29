/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package gg.squire.quest.tasks;

import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Item;

class GHelper {
    
     int[] ac;

    void u() {
        this.ac = new int[var1[0]];
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        g var2;
        void var3;
        if (g.var4(object, this)) {
            return var1[2];
        }
        if (g.var5(var3 instanceof g)) {
            return var1[0];
        }
        g var6 = (g)var3;
        if (g.var5(var6.a(var2) ? 1 : 0)) {
            return var1[0];
        }
        if (g.var5(Arrays.equals(var2.w(), var6.w()) ? 1 : 0)) {
            return var1[0];
        }
        return var1[2];
    }

    public String toString() {
        return "QuestBankData(idAndQuantity=" + Arrays.toString(this.w()) + ")";
    }

    public int hashCode() {
        int n2 = var1[3];
        int n3 = var1[2];
        n3 = n3 * var1[3] + Arrays.hashCode(this.w());
        return n3;
    }

    private static boolean var4(Object object, Object object2) {
        return object == object2;
    }

    static {
        g.var7();
    }

    void b(Item[] itemArray) {
        this.a(Arrays.asList(itemArray));
    }

    private static boolean var8(int n2, int n3) {
        return n2 < n3;
    }

    GHelper() {
        this.ac = new int[var1[0]];
    }

    protected boolean a(Object object) {
        return object instanceof g;
    }

    /*
     * WARNING - void declaration
     */
    void a(List<Item> list) {
        void var9;
        int[] nArray = new int[list.size() * var1[1]];
        int var10 = var1[0];
        while (g.var8(var10, var9.size())) {
            Item var11 = (Item)var9.get(var10);
            var12[var10 * g.var1[1]] = var11.getId();
            var12[var10 * g.var1[1] + g.var1[2]] = var11.getQuantity();
            ++var10;
            0;
            if (-1 == -1) continue;
            return;
        }
        this.ac = nArray;
    }

    public int[] w() {
        return this.ac;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    List<Item> v() {
        g var13;
        ArrayList<Item> arrayList = new ArrayList<Item>();
        int var14 = var1[0];
        while (g.var8(var14, var13.ac.length - var1[1])) {
            void var15;
            var15.add(new Item(var13.ac[var14], var13.ac[var14 + var1[2]]));
            0;
            var14 += 2;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return arrayList;
    }

    public void a(int[] nArray) {
        this.ac = nArray;
    }

    private static void var7() {
        var1 = new int[4];
        g.var1[0] = (0x38 ^ 0x7A ^ (0x84 ^ 0xA5)) & (0x25 ^ 0x2E ^ (0x7B ^ 0x13) ^ -1);
        g.var1[1] = 2;
        g.var1[2] = 1;
        g.var1[3] = 0x57 ^ 0x1A ^ (0xEE ^ 0x98);
    }
}

