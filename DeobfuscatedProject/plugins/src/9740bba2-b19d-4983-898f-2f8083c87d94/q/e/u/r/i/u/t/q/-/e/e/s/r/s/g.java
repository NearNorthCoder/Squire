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
        g lllllllllllllllIIIIlIIlIlIIIlIlI;
        ArrayList<Item> arrayList = new ArrayList<Item>();
        int lllllllllllllllIIIIlIIlIlIIIlIII = lIIIllIlIIllI[0];
        while (g.lIlIIIlIlIIIlll(lllllllllllllllIIIIlIIlIlIIIlIII, lllllllllllllllIIIIlIIlIlIIIlIlI.ab.length - lIIIllIlIIllI[1])) {
            void lllllllllllllllIIIIlIIlIlIIIlIIl;
            lllllllllllllllIIIIlIIlIlIIIlIIl.add(new Item(lllllllllllllllIIIIlIIlIlIIIlIlI.ab[lllllllllllllllIIIIlIIlIlIIIlIII], lllllllllllllllIIIIlIIlIlIIIlIlI.ab[lllllllllllllllIIIIlIIlIlIIIlIII + lIIIllIlIIllI[2]]));
            "".length();
            lllllllllllllllIIIIlIIlIlIIIlIII += 2;
            "".length();
            if (((0x38 ^ 0x77 ^ "  ".length()) & (66 + 225 - 260 + 210 ^ 78 + 128 - 177 + 159 ^ -" ".length()) & ((0x5E ^ 0x38 ^ (0x32 ^ 0x36)) & (15 + 98 - -69 + 70 ^ 37 + 13 - -4 + 104 ^ -" ".length()) ^ -" ".length())) == 0) continue;
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
        void lllllllllllllllIIIIlIIlIlIIlIIIl;
        int[] nArray = new int[list.size() * lIIIllIlIIllI[1]];
        int lllllllllllllllIIIIlIIlIlIIIllll = lIIIllIlIIllI[0];
        while (g.lIlIIIlIlIIIlll(lllllllllllllllIIIIlIIlIlIIIllll, lllllllllllllllIIIIlIIlIlIIlIIIl.size())) {
            Item lllllllllllllllIIIIlIIlIlIIIlllI = (Item)lllllllllllllllIIIIlIIlIlIIlIIIl.get(lllllllllllllllIIIIlIIlIlIIIllll);
            lllllllllllllllIIIIlIIlIlIIlIIII[lllllllllllllllIIIIlIIlIlIIIllll * g.lIIIllIlIIllI[1]] = lllllllllllllllIIIIlIIlIlIIIlllI.getId();
            lllllllllllllllIIIIlIIlIlIIlIIII[lllllllllllllllIIIIlIIlIlIIIllll * g.lIIIllIlIIllI[1] + g.lIIIllIlIIllI[2]] = lllllllllllllllIIIIlIIlIlIIIlllI.getQuantity();
            ++lllllllllllllllIIIIlIIlIlIIIllll;
            "".length();
            if (((0xD ^ 0x25 ^ (0x16 ^ 0x25)) & (0x96 ^ 0x85 ^ (0x2F ^ 0x27) ^ -" ".length())) == 0) continue;
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
        g.lIIIllIlIIllI[0] = (0x95 ^ 0x89 ^ (0x3E ^ 0x74)) & (1 ^ 0x57 ^ (0x86 ^ 0x97) & ~(0x89 ^ 0x98) ^ -" ".length());
        g.lIIIllIlIIllI[1] = "  ".length();
        g.lIIIllIlIIllI[2] = " ".length();
        g.lIIIllIlIIllI[3] = 0xD5 ^ 0xC7 ^ (0x13 ^ 0x3A);
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        g lllllllllllllllIIIIlIIlIlIIIIlII;
        void lllllllllllllllIIIIlIIlIlIIIIIll;
        if (g.lIlIIIlIlIIlIII(object, this)) {
            return lIIIllIlIIllI[2];
        }
        if (g.lIlIIIlIlIIlIIl(lllllllllllllllIIIIlIIlIlIIIIIll instanceof g)) {
            return lIIIllIlIIllI[0];
        }
        g lllllllllllllllIIIIlIIlIlIIIIIlI = (g)lllllllllllllllIIIIlIIlIlIIIIIll;
        if (g.lIlIIIlIlIIlIIl(lllllllllllllllIIIIlIIlIlIIIIIlI.a(lllllllllllllllIIIIlIIlIlIIIIlII) ? 1 : 0)) {
            return lIIIllIlIIllI[0];
        }
        if (g.lIlIIIlIlIIlIIl(Arrays.equals(lllllllllllllllIIIIlIIlIlIIIIlII.v(), lllllllllllllllIIIIlIIlIlIIIIIlI.v()) ? 1 : 0)) {
            return lIIIllIlIIllI[0];
        }
        return lIIIllIlIIllI[2];
    }
}

