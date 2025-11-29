/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.runelite.api.Item;

class g {
    private static /* synthetic */ int[] lIlIIlIIIIIlI;
    /* synthetic */ int[] ac;

    void u() {
        this.ac = new int[lIlIIlIIIIIlI[0]];
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        g var6;
        void var5;
        if (g.lIlllIIIllIIllI(object, this)) {
            return lIlIIlIIIIIlI[2];
        }
        if (g.lIlllIIIllIIlll(var5 instanceof g)) {
            return lIlIIlIIIIIlI[0];
        }
        g var2 = (g)var5;
        if (g.lIlllIIIllIIlll(var2.a(var6) ? 1 : 0)) {
            return lIlIIlIIIIIlI[0];
        }
        if (g.lIlllIIIllIIlll(Arrays.equals(var6.w(), var2.w()) ? 1 : 0)) {
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

    g() {
        this.ac = new int[lIlIIlIIIIIlI[0]];
    }

    protected boolean a(Object object) {
        return object instanceof g;
    }

    /*
     * WARNING - void declaration
     */
    void a(List<Item> list) {
        void var8;
        int[] nArray = new int[list.size() * lIlIIlIIIIIlI[1]];
        int var4 = lIlIIlIIIIIlI[0];
        while (g.lIlllIIIllIIlIl(var4, var8.size())) {
            Item var10 = (Item)var8.get(var4);
            var7[var4 * g.lIlIIlIIIIIlI[1]] = var10.getId();
            var7[var4 * g.lIlIIlIIIIIlI[1] + g.lIlIIlIIIIIlI[2]] = var10.getQuantity();
            ++var4;
            0;
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
        g var1;
        ArrayList<Item> arrayList = new ArrayList<Item>();
        int var3 = lIlIIlIIIIIlI[0];
        while (g.lIlllIIIllIIlIl(var3, var1.ac.length - lIlIIlIIIIIlI[1])) {
            void var9;
            var9.add(new Item(var1.ac[var3], var1.ac[var3 + lIlIIlIIIIIlI[2]]));
            0;
            var3 += 2;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return arrayList;
    }

    public void a(int[] nArray) {
        this.ac = nArray;
    }

    private static void lIlllIIIllIIlII() {
        lIlIIlIIIIIlI = new int[4];
        g.lIlIIlIIIIIlI[0] = (0x38 ^ 0x7A ^ (0x84 ^ 0xA5)) & (0x25 ^ 0x2E ^ (0x7B ^ 0x13) ^ -1);
        g.lIlIIlIIIIIlI[1] = 2;
        g.lIlIIlIIIIIlI[2] = 1;
        g.lIlIIlIIIIIlI[3] = 0x57 ^ 0x1A ^ (0xEE ^ 0x98);
    }
}

