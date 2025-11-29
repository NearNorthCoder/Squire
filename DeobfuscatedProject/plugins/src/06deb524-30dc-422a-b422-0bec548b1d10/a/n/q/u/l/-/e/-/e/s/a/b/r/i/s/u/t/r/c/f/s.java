/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.ItemContainer
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;

public class s {
    private /* synthetic */ Item[] aq;
    private /* synthetic */ ItemContainer ap;
    private static /* synthetic */ int[] lIIllIlIlllI;
    @Inject
    private /* synthetic */ Client g;

    public boolean f(int n2) {
        boolean bl;
        if (s.llIIlllllIlIII(this.c(n2))) {
            bl = lIIllIlIlllI[1];
            "".length();
            if (((0x82 ^ 0xA7) & ~(0x7A ^ 0x5F)) != 0) {
                return (" ".length() & ~" ".length()) != 0;
            }
        } else {
            bl = lIIllIlIlllI[0];
        }
        return bl;
    }

    private static boolean llIIlllllIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    public void i() {
        this.B();
        if (s.llIIlllllIIlIl(this.ap)) {
            this.aq = (Item[])this.ap.getItems().clone();
        }
    }

    public int c(int n2) {
        int[] nArray = new int[lIIllIlIlllI[1]];
        nArray[s.lIIllIlIlllI[0]] = n2;
        return this.a(nArray) - this.e(n2);
    }

    /*
     * WARNING - void declaration
     */
    public int D() {
        void lllllllllllllllIlllIllIIlllllllI;
        this.B();
        int n2 = lIIllIlIlllI[2];
        int[] nArray = new int[lIIllIlIlllI[3]];
        nArray[s.lIIllIlIlllI[0]] = lIIllIlIlllI[4];
        nArray[s.lIIllIlIlllI[1]] = lIIllIlIlllI[5];
        nArray[s.lIIllIlIlllI[6]] = lIIllIlIlllI[7];
        nArray[s.lIIllIlIlllI[8]] = lIIllIlIlllI[9];
        nArray[s.lIIllIlIlllI[10]] = lIIllIlIlllI[11];
        nArray[s.lIIllIlIlllI[12]] = lIIllIlIlllI[13];
        nArray[s.lIIllIlIlllI[14]] = lIIllIlIlllI[15];
        nArray[s.lIIllIlIlllI[16]] = lIIllIlIlllI[17];
        nArray[s.lIIllIlIlllI[18]] = lIIllIlIlllI[19];
        nArray[s.lIIllIlIlllI[20]] = lIIllIlIlllI[21];
        nArray[s.lIIllIlIlllI[22]] = lIIllIlIlllI[23];
        nArray[s.lIIllIlIlllI[24]] = lIIllIlIlllI[25];
        int[] nArray2 = nArray;
        Item[] itemArray = this.ap.getItems();
        int n3 = itemArray.length;
        int lllllllllllllllIlllIllIIllllllIl = lIIllIlIlllI[0];
        while (s.llIIlllllIlIIl(lllllllllllllllIlllIllIIllllllIl, (int)lllllllllllllllIlllIllIIlllllllI)) {
            void lllllllllllllllIlllIllIlIIIIIIII;
            void lllllllllllllllIlllIllIIllllllll;
            void lllllllllllllllIlllIllIIllllllII = lllllllllllllllIlllIllIIllllllll[lllllllllllllllIlllIllIIllllllIl];
            if (s.llIIlllllIlIII(IntStream.of((int[])lllllllllllllllIlllIllIlIIIIIIII).noneMatch(arg_0 -> s.a((Item)lllllllllllllllIlllIllIIllllllII, arg_0)) ? 1 : 0) && s.llIIlllllIlIlI(lllllllllllllllIlllIllIIllllllII.getQuantity())) {
                void lllllllllllllllIlllIllIlIIIIIIIl;
                --lllllllllllllllIlllIllIlIIIIIIIl;
            }
            ++lllllllllllllllIlllIllIIllllllIl;
            "".length();
            if (" ".length() == " ".length()) continue;
            return (0x60 ^ 0x24) & ~(0xF2 ^ 0xB6);
        }
        return n2;
    }

    public s() {
        this.aq = new Item[lIIllIlIlllI[0]];
    }

    private static boolean llIIlllllIlIII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public int C() {
        void lllllllllllllllIlllIllIlIIIIllII;
        this.B();
        int n2 = lIIllIlIlllI[2];
        Item[] itemArray = this.ap.getItems();
        int n3 = itemArray.length;
        int lllllllllllllllIlllIllIlIIIIlIll = lIIllIlIlllI[0];
        while (s.llIIlllllIlIIl(lllllllllllllllIlllIllIlIIIIlIll, (int)lllllllllllllllIlllIllIlIIIIllII)) {
            void lllllllllllllllIlllIllIlIIIIllIl;
            void lllllllllllllllIlllIllIlIIIIlIlI = lllllllllllllllIlllIllIlIIIIllIl[lllllllllllllllIlllIllIlIIIIlIll];
            if (s.llIIlllllIlIlI(lllllllllllllllIlllIllIlIIIIlIlI.getQuantity())) {
                void lllllllllllllllIlllIllIlIIIIlllI;
                --lllllllllllllllIlllIllIlIIIIlllI;
            }
            ++lllllllllllllllIlllIllIlIIIIlIll;
            "".length();
            if ("  ".length() >= 0) continue;
            return (0xAB ^ 0xC1 ^ (0x85 ^ 0xB8)) & (215 + 146 - 272 + 136 ^ 34 + 0 - -5 + 143 ^ -" ".length());
        }
        return n2;
    }

    private static /* synthetic */ boolean a(Item item, int n2) {
        boolean bl;
        if (s.llIIlllllIlIll(n2, item.getId())) {
            bl = lIIllIlIlllI[1];
            "".length();
            if (-"   ".length() > 0) {
                return ((0x5D ^ 0x2A ^ (3 ^ 0x62)) & (115 + 168 - 143 + 29 ^ 52 + 15 - -121 + 3 ^ -" ".length())) != 0;
            }
        } else {
            bl = lIIllIlIlllI[0];
        }
        return bl;
    }

    private static boolean llIIlllllIlIlI(int n2) {
        return n2 > 0;
    }

    static {
        s.llIIlllllIIIll();
    }

    private static void llIIlllllIIIll() {
        lIIllIlIlllI = new int[26];
        s.lIIllIlIlllI[0] = (0x77 ^ 0x49 ^ (0x57 ^ 0x70)) & (0xB4 ^ 0x82 ^ (0x28 ^ 7) ^ -" ".length());
        s.lIIllIlIlllI[1] = " ".length();
        s.lIIllIlIlllI[2] = 0xAC ^ 0xB0;
        s.lIIllIlIlllI[3] = 0x7E ^ 0x72;
        s.lIIllIlIlllI[4] = -(0xFFFFF6DD & 0x3D23) & (0xFFFFBF6F & 0x7DBF);
        s.lIIllIlIlllI[5] = -(0xFFFFF66F & 0x79D9) & (0xFFFFFB7F & 0x7DFF);
        s.lIIllIlIlllI[6] = "  ".length();
        s.lIIllIlIlllI[7] = -(0xFFFFDEFF & 0x67C1) & (0xFFFFCFF9 & Short.MAX_VALUE);
        s.lIIllIlIlllI[8] = "   ".length();
        s.lIIllIlIlllI[9] = 0xFFFFDF3B & 0x29FF;
        s.lIIllIlIlllI[10] = 0xB4 ^ 0xB0;
        s.lIIllIlIlllI[11] = -(0xFFFFFEDF & 0x37AB) & (0xFFFFBFBF & Short.MAX_VALUE);
        s.lIIllIlIlllI[12] = 0x5C ^ 0x75 ^ (0x26 ^ 0xA);
        s.lIIllIlIlllI[13] = 0xFFFFEDFF & 0x1B31;
        s.lIIllIlIlllI[14] = 6 ^ 9 ^ (0xBD ^ 0xB4);
        s.lIIllIlIlllI[15] = 0xFFFFABBB & 0x55FC;
        s.lIIllIlIlllI[16] = 4 ^ 0x75 ^ (0x5D ^ 0x2B);
        s.lIIllIlIlllI[17] = -(0xFFFFF797 & 0x4C69) & (0xFFFFC7BF & 0x7DFF);
        s.lIIllIlIlllI[18] = 0x4D ^ 0x45;
        s.lIIllIlIlllI[19] = -(0xFFFFFCB7 & 0x7B6B) & (0xFFFFFDE7 & 0x7BFB);
        s.lIIllIlIlllI[20] = 0x98 ^ 0x92 ^ "   ".length();
        s.lIIllIlIlllI[21] = 0xFFFFBBCF & 0x45F3;
        s.lIIllIlIlllI[22] = 0x70 ^ 0x7A;
        s.lIIllIlIlllI[23] = 0xFFFFF5BC & 0xBFF;
        s.lIIllIlIlllI[24] = 0x5C ^ 0x57;
        s.lIIllIlIlllI[25] = -(0xFFFF92E7 & 0x7F1B) & (0xFFFFBBFF & 0x57C7);
    }

    private void B() {
        ItemContainer itemContainer = this.g.getItemContainer(InventoryID.INVENTORY);
        if (s.llIIlllllIIlIl(itemContainer)) {
            this.ap = itemContainer;
        }
    }

    private static boolean llIIlllllIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private int e(int n2) {
        Optional<Item> optional = Arrays.stream(this.aq).filter(item -> {
            boolean bl;
            if (s.llIIlllllIlIll(item.getId(), n2)) {
                bl = lIIllIlIlllI[1];
                "".length();
                if (((0x20 ^ 0x16) & ~(0x27 ^ 0x11)) < 0) {
                    return ((0xE ^ 4) & ~(6 ^ 0xC)) != 0;
                }
            } else {
                bl = lIIllIlIlllI[0];
            }
            return bl;
        }).findFirst();
        return optional.map(Item::getQuantity).orElse(lIIllIlIlllI[0]);
    }

    private static boolean llIIlllllIIlIl(Object object) {
        return object != null;
    }

    public boolean b(int ... nArray) {
        boolean bl;
        if (s.llIIlllllIlIlI(this.a(nArray))) {
            bl = lIIllIlIlllI[1];
            "".length();
            if (" ".length() <= -" ".length()) {
                return ((58 + 24 - -21 + 95 ^ 91 + 78 - 60 + 24) & (0xF9 ^ 0xC7 ^ (0xF7 ^ 0x8A) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIIllIlIlllI[0];
        }
        return bl;
    }

    public boolean E() {
        boolean bl;
        if (s.llIIlllllIlIlI(this.C())) {
            bl = lIIllIlIlllI[1];
            "".length();
            if (null != null) {
                return ((92 + 88 - 15 + 4 ^ 180 + 180 - 183 + 7) & ("   ".length() ^ (0xD6 ^ 0xC4) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIIllIlIlllI[0];
        }
        return bl;
    }

    public void j() {
        this.ap = null;
        this.aq = new Item[lIIllIlIlllI[0]];
    }

    /*
     * WARNING - void declaration
     */
    public int a(int ... nArray) {
        void lllllllllllllllIlllIllIlIIIlllII;
        this.B();
        int n2 = lIIllIlIlllI[0];
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int lllllllllllllllIlllIllIlIIIllIll = lIIllIlIlllI[0];
        while (s.llIIlllllIlIIl(lllllllllllllllIlllIllIlIIIllIll, (int)lllllllllllllllIlllIllIlIIIlllII)) {
            s lllllllllllllllIlllIllIlIIlIIIII;
            void lllllllllllllllIlllIllIlIIIlllIl;
            void lllllllllllllllIlllIllIlIIIllIlI = lllllllllllllllIlllIllIlIIIlllIl[lllllllllllllllIlllIllIlIIIllIll];
            lllllllllllllllIlllIllIlIIIllllI += lllllllllllllllIlllIllIlIIlIIIII.ap.count((int)lllllllllllllllIlllIllIlIIIllIlI);
            ++lllllllllllllllIlllIllIlIIIllIll;
            "".length();
            if (" ".length() != 0) continue;
            return (0xFC ^ 0xC3 ^ (0x77 ^ 0x1D)) & (0xE8 ^ 0xB1 ^ (0x18 ^ 0x14) ^ -" ".length());
        }
        return n2;
    }
}

