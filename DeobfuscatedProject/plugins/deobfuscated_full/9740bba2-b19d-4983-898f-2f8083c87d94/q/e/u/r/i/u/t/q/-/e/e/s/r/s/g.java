/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.runelite.api.Item;

class g {
    private static /* synthetic */ int[] lIIIllIlIIllI;
    /* synthetic */ int[] ab;

    protected boolean a(Object object) {
        return object instanceof g;
    }

    g() {
        this.ab = new int[lIIIllIlIIllI[0]];
    }

    static {
        g.lIlIIIlIlIIIllI();
    }

    /*
     * WARNING - void declaration
     */
    List<Item> u() {
        g var4;
        ArrayList<Item> arrayList = new ArrayList<Item>();
        int var9 = lIIIllIlIIllI[0];
        while (g.lIlIIIlIlIIIlll(var9, var4.ab.length - lIIIllIlIIllI[1])) {
            void var7;
            var7.add(new Item(var4.ab[var9], var4.ab[var9 + lIIIllIlIIllI[2]]));
            0;
            var9 += 2;
            0;
            if (((0x38 ^ 0x77 ^ 2) & (66 + 225 - 260 + 210 ^ 78 + 128 - 177 + 159 ^ -1) & ((0x5E ^ 0x38 ^ (0x32 ^ 0x36)) & (15 + 98 - -69 + 70 ^ 37 + 13 - -4 + 104 ^ -1) ^ -1)) == 0) continue;
            return null;
        }
        return arrayList;
    }

    private static boolean lIlIIIlIlIIlIIl(int n2) {
        return n2 == 0;
    }

    public void a(int[] nArray) {
        this.ab = nArray;
    }

    void b(Item[] itemArray) {
        this.a(Arrays.asList(itemArray));
    }

    public String toString() {
        return "QuestBankData(idAndQuantity=" + Arrays.toString(this.v()) + ")";
    }

    private static boolean lIlIIIlIlIIlIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIIlIlIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    public int[] v() {
        return this.ab;
    }

    /*
     * WARNING - void declaration
     */
    void a(List<Item> list) {
        void var8;
        int[] nArray = new int[list.size() * lIIIllIlIIllI[1]];
        int var3 = lIIIllIlIIllI[0];
        while (g.lIlIIIlIlIIIlll(var3, var8.size())) {
            Item var6 = (Item)var8.get(var3);
            var5[var3 * g.lIIIllIlIIllI[1]] = var6.getId();
            var5[var3 * g.lIIIllIlIIllI[1] + g.lIIIllIlIIllI[2]] = var6.getQuantity();
            ++var3;
            0;
            if (((0xD ^ 0x25 ^ (0x16 ^ 0x25)) & (0x96 ^ 0x85 ^ (0x2F ^ 0x27) ^ -1)) == 0) continue;
            return;
        }
        this.ab = nArray;
    }

    public int hashCode() {
        int n2 = lIIIllIlIIllI[3];
        int n3 = lIIIllIlIIllI[2];
        n3 = n3 * lIIIllIlIIllI[3] + Arrays.hashCode(this.v());
        return n3;
    }

    void t() {
        this.ab = new int[lIIIllIlIIllI[0]];
    }

    private static void lIlIIIlIlIIIllI() {
        lIIIllIlIIllI = new int[4];
        g.lIIIllIlIIllI[0] = (0x95 ^ 0x89 ^ (0x3E ^ 0x74)) & (1 ^ 0x57 ^ (0x86 ^ 0x97) & ~(0x89 ^ 0x98) ^ -1);
        g.lIIIllIlIIllI[1] = 2;
        g.lIIIllIlIIllI[2] = 1;
        g.lIIIllIlIIllI[3] = 0xD5 ^ 0xC7 ^ (0x13 ^ 0x3A);
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        g var2;
        void var10;
        if (g.lIlIIIlIlIIlIII(object, this)) {
            return lIIIllIlIIllI[2];
        }
        if (g.lIlIIIlIlIIlIIl(var10 instanceof g)) {
            return lIIIllIlIIllI[0];
        }
        g var1 = (g)var10;
        if (g.lIlIIIlIlIIlIIl(var1.a(var2) ? 1 : 0)) {
            return lIIIllIlIIllI[0];
        }
        if (g.lIlIIIlIlIIlIIl(Arrays.equals(var2.v(), var1.v()) ? 1 : 0)) {
            return lIIIllIlIIllI[0];
        }
        return lIIIllIlIIllI[2];
    }
}

