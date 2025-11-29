/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package gg.squire.quest.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.runelite.api.Item;

class GHelper {
    
     int[] ac;

    void u() {
        this.ac = new int[lIlIIlIIIIIlI[0]];
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        g var1;
        void var2;
        if (g.lIlllIIIllIIllI(object, this)) {
            return lIlIIlIIIIIlI[2];
        }
        if (g.lIlllIIIllIIlll(var2 instanceof g)) {
            return lIlIIlIIIIIlI[0];
        }
        g var3 = (GHelper) ar2;
        if (g.lIlllIIIllIIlll(var3.a(var1) ? 1 : 0)) {
            return lIlIIlIIIIIlI[0];
        }
        if (g.lIlllIIIllIIlll(Arrays.equals(var1.w(), var3.w()) ? 1 : 0)) {
            return lIlIIlIIIIIlI[0];
        }
        return lIlIIlIIIIIlI[2];
    }

    public String toString() {
        return "QuestBankData(idAndQuantity=" + Arrays.toString(this.w()) + ")";
    }

    public int hashCode() {
        int n2 = lIlIIlIIIIIlI[3];
        int n3 = lIlIIlIIIIIlI[2];
        n3 = n3 * lIlIIlIIIIIlI[3] + Arrays.hashCode(this.w());
        return n3;
    }

    private static boolean lIlllIIIllIIllI(Object object, Object object2) {
        return object == object2;
    }

    static {
        g.lIlllIIIllIIlII();
    }

    void b(Item[] itemArray) {
        this.a(Arrays.asList(itemArray));
    }

    private static boolean lIlllIIIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    GHelper() {
        this.ac = new int[lIlIIlIIIIIlI[0]];
    }

    protected boolean a(Object object) {
        return object instanceof g;
    }

    /*
     * WARNING - void declaration
     */
    void a(List<Item> list) {
        void var4;
        int[] nArray = new int[list.size() * lIlIIlIIIIIlI[1]];
        int var5 = lIlIIlIIIIIlI[0];
        while (g.lIlllIIIllIIlIl(var5, var4.size())) {
            Item var6 = (Item)var4.get(var5);
            var7[var5 * g.lIlIIlIIIIIlI[1]] = var6.getId();
            var7[var5 * g.lIlIIlIIIIIlI[1] + g.lIlIIlIIIIIlI[2]] = var6.getQuantity();
            ++var5;

            if (-1 == -1) continue;
            return;
        }
        this.ac = nArray;
    }

    public int[] w() {
        return this.ac;
    }

    private static boolean lIlllIIIllIIlll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    List<Item> v() {
        g var8;
        ArrayList<Item> arrayList = new ArrayList<Item>();
        int var9 = lIlIIlIIIIIlI[0];
        while (g.lIlllIIIllIIlIl(var9, var8.ac.length - lIlIIlIIIIIlI[1])) {
            void var10;
            var10.add(new Item(var8.ac[var9], var8.ac[var9 + lIlIIlIIIIIlI[2]]));

            var9 += 2;

            if (-1 < 0) continue;
            return null;
        }
        return arrayList;
    }

    public void a(int[] nArray) {
        this.ac = nArray;
    }

}

