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
        g llllllllllllllIlllIIIIllIIIIIlII;
        void llllllllllllllIlllIIIIllIIIIIIll;
        if (g.lIlllIIIllIIllI(object, this)) {
            return lIlIIlIIIIIlI[2];
        }
        if (g.lIlllIIIllIIlll(llllllllllllllIlllIIIIllIIIIIIll instanceof g)) {
            return lIlIIlIIIIIlI[0];
        }
        g llllllllllllllIlllIIIIllIIIIIIlI = (g)llllllllllllllIlllIIIIllIIIIIIll;
        if (g.lIlllIIIllIIlll(llllllllllllllIlllIIIIllIIIIIIlI.a(llllllllllllllIlllIIIIllIIIIIlII) ? 1 : 0)) {
            return lIlIIlIIIIIlI[0];
        }
        if (g.lIlllIIIllIIlll(Arrays.equals(llllllllllllllIlllIIIIllIIIIIlII.w(), llllllllllllllIlllIIIIllIIIIIIlI.w()) ? 1 : 0)) {
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
        void llllllllllllllIlllIIIIllIIIlIIIl;
        int[] nArray = new int[list.size() * lIlIIlIIIIIlI[1]];
        int llllllllllllllIlllIIIIllIIIIllll = lIlIIlIIIIIlI[0];
        while (g.lIlllIIIllIIlIl(llllllllllllllIlllIIIIllIIIIllll, llllllllllllllIlllIIIIllIIIlIIIl.size())) {
            Item llllllllllllllIlllIIIIllIIIIlllI = (Item)llllllllllllllIlllIIIIllIIIlIIIl.get(llllllllllllllIlllIIIIllIIIIllll);
            llllllllllllllIlllIIIIllIIIlIIII[llllllllllllllIlllIIIIllIIIIllll * g.lIlIIlIIIIIlI[1]] = llllllllllllllIlllIIIIllIIIIlllI.getId();
            llllllllllllllIlllIIIIllIIIlIIII[llllllllllllllIlllIIIIllIIIIllll * g.lIlIIlIIIIIlI[1] + g.lIlIIlIIIIIlI[2]] = llllllllllllllIlllIIIIllIIIIlllI.getQuantity();
            ++llllllllllllllIlllIIIIllIIIIllll;
            "".length();
            if (-" ".length() == -" ".length()) continue;
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
        g llllllllllllllIlllIIIIllIIIIlIlI;
        ArrayList<Item> arrayList = new ArrayList<Item>();
        int llllllllllllllIlllIIIIllIIIIlIII = lIlIIlIIIIIlI[0];
        while (g.lIlllIIIllIIlIl(llllllllllllllIlllIIIIllIIIIlIII, llllllllllllllIlllIIIIllIIIIlIlI.ac.length - lIlIIlIIIIIlI[1])) {
            void llllllllllllllIlllIIIIllIIIIlIIl;
            llllllllllllllIlllIIIIllIIIIlIIl.add(new Item(llllllllllllllIlllIIIIllIIIIlIlI.ac[llllllllllllllIlllIIIIllIIIIlIII], llllllllllllllIlllIIIIllIIIIlIlI.ac[llllllllllllllIlllIIIIllIIIIlIII + lIlIIlIIIIIlI[2]]));
            "".length();
            llllllllllllllIlllIIIIllIIIIlIII += 2;
            "".length();
            if (-" ".length() < 0) continue;
            return null;
        }
        return arrayList;
    }

    public void a(int[] nArray) {
        this.ac = nArray;
    }

    private static void lIlllIIIllIIlII() {
        lIlIIlIIIIIlI = new int[4];
        g.lIlIIlIIIIIlI[0] = (0x38 ^ 0x7A ^ (0x84 ^ 0xA5)) & (0x25 ^ 0x2E ^ (0x7B ^ 0x13) ^ -" ".length());
        g.lIlIIlIIIIIlI[1] = "  ".length();
        g.lIlIIlIIIIIlI[2] = " ".length();
        g.lIlIIlIIIIIlI[3] = 0x57 ^ 0x1A ^ (0xEE ^ 0x98);
    }
}

