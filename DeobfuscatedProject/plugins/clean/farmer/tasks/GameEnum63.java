/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package gg.squire.farmer.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;

public final class GameEnum63
extends Enum<K> {
    
    public static final  /* enum */ K EMPTY_BUCKET;
    public static final  /* enum */ K SUPER_COMPOST;
    private final  int child;
    public static final  /* enum */ K SEED_DIBBER;
    private static final  K[] $VALUES;
    public static final  /* enum */ K COMPOST;
    
    public static final  /* enum */ K PLANT_CURE;
    public static final  /* enum */ K ULTRA_COMPOST;
    public static final  /* enum */ K RAKE;
    public static final  /* enum */ K SPADE;
    private final  int inventoryChild;
    public static final  /* enum */ K SECATEURS;
    private final  int[] itemIds;
    public static final  /* enum */ K BOTTOMLESS_BUCKET;

    private GameEnum63(int n3, int n4, int ... nArray) {
        this.inventoryChild = n4;
        this.child = n3;
        this.itemIds = nArray;
    }

    public int aF() {
        return this.child;
    }

    private static boolean llllIlIllIllII(int n2, int n3) {
        return n2 == n3;
    }

    private static void llllIlIllIlIIl() {
        llIIIllIIIII = new String[llIIIllIIIIl[11]];
        K.llIIIllIIIII[K.llIIIllIIIIl[0]] = "Bottomless";
        K.llIIIllIIIII[K.llIIIllIIIIl[1]] = "RAKE";
        K.llIIIllIIIII[K.llIIIllIIIIl[4]] = "SEED_DIBBER";
        K.llIIIllIIIII[K.llIIIllIIIIl[7]] = "SPADE";
        K.llIIIllIIIII[K.llIIIllIIIIl[10]] = "SECATEURS";
        K.llIIIllIIIII[K.llIIIllIIIIl[14]] = "PLANT_CURE";
        K.llIIIllIIIII[K.llIIIllIIIIl[18]] = "BOTTOMLESS_BUCKET";
        K.llIIIllIIIII[K.llIIIllIIIIl[16]] = "EMPTY_BUCKET";
        K.llIIIllIIIII[K.llIIIllIIIIl[2]] = "COMPOST";
        K.llIIIllIIIII[K.llIIIllIIIIl[5]] = "SUPER_COMPOST";
        K.llIIIllIIIII[K.llIIIllIIIIl[8]] = "ULTRA_COMPOST";
    }

    public static K[] values() {
        return (K[])$VALUES.clone();
    }

    public int[] aH() {
        return this.itemIds;
    }

    public int aG() {
        return this.inventoryChild;
    }

        return String.valueOf(var1);
    }

    static {
        K.llllIlIllIlIlI();
        K.llllIlIllIlIIl();
        int[] nArray = new int[llIIIllIIIIl[1]];
        nArray[K.llIIIllIIIIl[0]] = llIIIllIIIIl[3];
        RAKE = new GameEnum63(llIIIllIIIIl[2], llIIIllIIIIl[1], nArray);
        int[] nArray2 = new int[llIIIllIIIIl[1]];
        nArray2[K.llIIIllIIIIl[0]] = llIIIllIIIIl[6];
        SEED_DIBBER = new GameEnum63(llIIIllIIIIl[5], llIIIllIIIIl[4], nArray2);
        int[] nArray3 = new int[llIIIllIIIIl[1]];
        nArray3[K.llIIIllIIIIl[0]] = llIIIllIIIIl[9];
        SPADE = new GameEnum63(llIIIllIIIIl[8], llIIIllIIIIl[7], nArray3);
        int[] nArray4 = new int[llIIIllIIIIl[4]];
        nArray4[K.llIIIllIIIIl[0]] = llIIIllIIIIl[12];
        nArray4[K.llIIIllIIIIl[1]] = llIIIllIIIIl[13];
        SECATEURS = new GameEnum63(llIIIllIIIIl[11], llIIIllIIIIl[10], nArray4);
        int[] nArray5 = new int[llIIIllIIIIl[1]];
        nArray5[K.llIIIllIIIIl[0]] = llIIIllIIIIl[17];
        PLANT_CURE = new GameEnum63(llIIIllIIIIl[15], llIIIllIIIIl[16], nArray5);
        int[] nArray6 = new int[llIIIllIIIIl[1]];
        nArray6[K.llIIIllIIIIl[0]] = llIIIllIIIIl[20];
        BOTTOMLESS_BUCKET = new GameEnum63(llIIIllIIIIl[19], llIIIllIIIIl[2], nArray6);
        int[] nArray7 = new int[llIIIllIIIIl[1]];
        nArray7[K.llIIIllIIIIl[0]] = llIIIllIIIIl[22];
        EMPTY_BUCKET = new GameEnum63(llIIIllIIIIl[21], llIIIllIIIIl[5], nArray7);
        int[] nArray8 = new int[llIIIllIIIIl[1]];
        nArray8[K.llIIIllIIIIl[0]] = llIIIllIIIIl[24];
        COMPOST = new GameEnum63(llIIIllIIIIl[23], llIIIllIIIIl[8], nArray8);
        int[] nArray9 = new int[llIIIllIIIIl[1]];
        nArray9[K.llIIIllIIIIl[0]] = llIIIllIIIIl[26];
        SUPER_COMPOST = new GameEnum63(llIIIllIIIIl[25], llIIIllIIIIl[11], nArray9);
        int[] nArray10 = new int[llIIIllIIIIl[1]];
        nArray10[K.llIIIllIIIIl[0]] = llIIIllIIIIl[29];
        ULTRA_COMPOST = new GameEnum63(llIIIllIIIIl[27], llIIIllIIIIl[28], nArray10);
        K[] kArray = new K[llIIIllIIIIl[8]];
        kArray[K.llIIIllIIIIl[0]] = RAKE;
        kArray[K.llIIIllIIIIl[1]] = SEED_DIBBER;
        kArray[K.llIIIllIIIIl[4]] = SPADE;
        kArray[K.llIIIllIIIIl[7]] = SECATEURS;
        kArray[K.llIIIllIIIIl[10]] = PLANT_CURE;
        kArray[K.llIIIllIIIIl[14]] = BOTTOMLESS_BUCKET;
        kArray[K.llIIIllIIIIl[18]] = EMPTY_BUCKET;
        kArray[K.llIIIllIIIIl[16]] = COMPOST;
        kArray[K.llIIIllIIIIl[2]] = SUPER_COMPOST;
        kArray[K.llIIIllIIIIl[5]] = ULTRA_COMPOST;
        $VALUES = kArray;
    }

    public static K valueOf(String string) {
        return Enum.valueOf(GameEnum63.class, string);
    }

    /*
     * WARNING - void declaration
     */
    public static K d(Item item) {
        Item var2;
        void var3;
        K[] kArray = K.values();
        int n2 = kArray.length;
        int var4 = llIIIllIIIIl[0];
        while (K.llllIlIllIlIll(var4, (int)var3)) {
            void var5;
            void var6 = var5[var4];
            int[] var7 = var6.itemIds;
            int var8 = var7.length;
            int var9 = llIIIllIIIIl[0];
            while (K.llllIlIllIlIll(var9, var8)) {
                int var10 = var7[var9];
                if (K.llllIlIllIllII(var2.getId(), var10)) {
                    return var6;
                }
                ++var9;

                return null;
            }
            ++var4;

            return null;
        }
        if (K.llllIlIllIllIl(var2.getName().contains(llIIIllIIIII[llIIIllIIIIl[0]]) ? 1 : 0)) {
            return BOTTOMLESS_BUCKET;
        }
        return null;
    }

    private static boolean llllIlIllIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean llllIlIllIlIll(int n2, int n3) {
        return n2 < n3;
    }
}

