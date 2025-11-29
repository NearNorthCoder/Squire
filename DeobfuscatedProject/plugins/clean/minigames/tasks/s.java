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
package gg.squire.minigames.tasks;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;

public class s {
    private  Item[] aq;
    private  ItemContainer ap;
    
    @Inject
    private  Client g;

    public boolean f(int n2) {
        boolean bl;
        if (s.llIIlllllIlIII(this.c(n2))) {
            bl = lIIllIlIlllI[1];

            if (((0x82 ^ 0xA7) & ~(0x7A ^ 0x5F)) != 0) {
                return (1 & ~1) != 0;
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
        void var1;
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
        int var2 = lIIllIlIlllI[0];
        while (s.llIIlllllIlIIl(var2, (int)var1)) {
            void var3;
            void var4;
            void var5 = var4[var2];
            if (s.llIIlllllIlIII(IntStream.of((int[])var3).noneMatch(arg_0 -> s.a((Item)var5, arg_0)) ? 1 : 0) && s.llIIlllllIlIlI(var5.getQuantity())) {
                void var6;
                --var6;
            }
            ++var2;

            if (1 == 1) continue;
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
        void var7;
        this.B();
        int n2 = lIIllIlIlllI[2];
        Item[] itemArray = this.ap.getItems();
        int n3 = itemArray.length;
        int var8 = lIIllIlIlllI[0];
        while (s.llIIlllllIlIIl(var8, (int)var7)) {
            void var9;
            void var10 = var9[var8];
            if (s.llIIlllllIlIlI(var10.getQuantity())) {
                void var11;
                --var11;
            }
            ++var8;

            if (2 >= 0) continue;
            return (0xAB ^ 0xC1 ^ (0x85 ^ 0xB8)) & (215 + 146 - 272 + 136 ^ 34 + 0 - -5 + 143 ^ -1);
        }
        return n2;
    }

    private static  boolean a(Item item, int n2) {
        boolean bl;
        if (s.llIIlllllIlIll(n2, item.getId())) {
            bl = lIIllIlIlllI[1];

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

                if (((0x20 ^ 0x16) & ~(0x27 ^ 0x11)) < 0) {
                    return false;
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

            if (1 <= -1) {
                return ((58 + 24 - -21 + 95 ^ 91 + 78 - 60 + 24) & (0xF9 ^ 0xC7 ^ (0xF7 ^ 0x8A) ^ -1)) != 0;
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
        void var12;
        this.B();
        int n2 = lIIllIlIlllI[0];
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int var13 = lIIllIlIlllI[0];
        while (s.llIIlllllIlIIl(var13, (int)var12)) {
            s var14;
            void var15;
            void var16 = var15[var13];
            var17 += var14.ap.count((int)var16);
            ++var13;

            if (1 != 0) continue;
            return (0xFC ^ 0xC3 ^ (0x77 ^ 0x1D)) & (0xE8 ^ 0xB1 ^ (0x18 ^ 0x14) ^ -1);
        }
        return n2;
    }
}

