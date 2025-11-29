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

import java.util.Optional;
import java.util.stream.IntStream;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;

public class SHelper {
    private  Item[] aq;
    private  ItemContainer ap;
    
    @Inject
    private  Client g;

    public boolean f(int n2) {
        boolean bl;
        if ((this.cn2)) {
            bl = 1;
            0;
            if (((0x82 ^ 0xA7) & ~(0x7A ^ 0x5F)) != 0) {
                return (1 & ~1) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    public void i() {
        this.B();
        if (this.ap != null) {
            this.aq = (Item[])this.ap.getItems().clone();
        }
    }

    public int c(int n2) {
        int[] nArray = new int[1];
        nArray[0] = n2;
        return this.a(nArray) - this.e(n2);
    }

    /*
     * WARNING - void declaration
     */
    public int D() {
        void var2;
        this.B();
        int n2 = 2;
        int[] nArray = new int[3];
        nArray[0] = 4;
        nArray[1] = 5;
        nArray[6] = 7;
        nArray[8] = 9;
        nArray[s.var1[10]] = var1[11];
        nArray[s.var1[12]] = var1[13];
        nArray[s.var1[14]] = var1[15];
        nArray[s.var1[16]] = var1[17];
        nArray[s.var1[18]] = var1[19];
        nArray[s.var1[20]] = var1[21];
        nArray[s.var1[22]] = var1[23];
        nArray[s.var1[24]] = var1[25];
        int[] nArray2 = nArray;
        Item[] itemArray = this.ap.getItems();
        int n3 = itemArray.length;
        int var3 = 0;
        while ((var3 < (int)var2)) {
            void var4;
            void var5;
            void var6 = var5[var3];
            if ((IntStream.of((int[] != 0)var4).noneMatch(arg_0 -> s.a((Item)var6, arg_0)) ? 1 : 0) && (var6.getQuantity( > 0))) {
                void var7;
                --var7;
            }
            ++var3;
            0;
            if (1 == 1) continue;
            return (0x60 ^ 0x24) & ~(0xF2 ^ 0xB6);
        }
        return n2;
    }

    public SHelper() {
        this.aq = new Item[0];
    }

    /*
     * WARNING - void declaration
     */
    public int C() {
        void var8;
        this.B();
        int n2 = 2;
        Item[] itemArray = this.ap.getItems();
        int n3 = itemArray.length;
        int var9 = 0;
        while ((var9 < (int)var8)) {
            void var10;
            void var11 = var10[var9];
            if ((var11.getQuantity( > 0))) {
                void var12;
                --var12;
            }
            ++var9;
            0;
            
            return (0xAB ^ 0xC1 ^ (0x85 ^ 0xB8)) & (215 + 146 - 272 + 136 ^ 34 + 0 - -5 + 143 ^ -1);
        }
        return n2;
    }

    private static  boolean a(Item item, int n2) {
        boolean bl;
        if ((n2 == item.getId())) {
            bl = 1;
            0;
            if (-3 > 0) {
                return ((0x5D ^ 0x2A ^ (3 ^ 0x62)) & (115 + 168 - 143 + 29 ^ 52 + 15 - -121 + 3 ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    static {
        s.var13();
    }

    private void B() {
        ItemContainer itemContainer = this.g.getItemContainer(InventoryID.INVENTORY);
        if itemContainer != null {
            this.ap = itemContainer;
        }
    }

    private int e(int n2) {
        Optional<Item> optional = Arrays.stream(this.aq).filter(item -> {
            boolean bl;
            if ((item.getId() == n2)) {
                bl = 1;
                0;
                if (((0x20 ^ 0x16) & ~(0x27 ^ 0x11)) < 0) {
                    return ((0xE ^ 4) & ~(6 ^ 0xC)) != 0;
                }
            } else {
                bl = 0;
            }
            return bl;
        }).findFirst();
        return optional.map(Item::getQuantity).orElse(0);
    }

    public boolean b(int ... nArray) {
        boolean bl;
        if ((this.a(nArray > 0))) {
            bl = 1;
            0;
            if (1 <= -1) {
                return ((58 + 24 - -21 + 95 ^ 91 + 78 - 60 + 24) & (0xF9 ^ 0xC7 ^ (0xF7 ^ 0x8A) ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    public boolean E() {
        boolean bl;
        if ((this.C( > 0))) {
            bl = 1;
            0;
            if null != null {
                return ((92 + 88 - 15 + 4 ^ 180 + 180 - 183 + 7) & (3 ^ (0xD6 ^ 0xC4) ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    public void j() {
        this.ap = null;
        this.aq = new Item[0];
    }

    /*
     * WARNING - void declaration
     */
    public int a(int ... nArray) {
        void var14;
        this.B();
        int n2 = 0;
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int var15 = 0;
        while ((var15 < (int)var14)) {
            s var16;
            void var17;
            void var18 = var17[var15];
            var19 += var16.ap.count((int)var18);
            ++var15;
            0;
            if (1 != 0) continue;
            return (0xFC ^ 0xC3 ^ (0x77 ^ 0x1D)) & (0xE8 ^ 0xB1 ^ (0x18 ^ 0x14) ^ -1);
        }
        return n2;
    }
}

