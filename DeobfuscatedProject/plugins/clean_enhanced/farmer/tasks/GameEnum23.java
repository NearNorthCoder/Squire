/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package gg.squire.farmer.tasks;

import net.runelite.api.Item;

public final class GameEnum23
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

    private GameEnum23(int n3, int n4, int ... nArray) {
        this.inventoryChild = n4;
        this.child = n3;
        this.itemIds = nArray;
    }

    public int aF() {
        return this.child;
    }

    public static K[] values() {
        return (K[])$VALUES.clone();
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public int[] aH() {
        return this.itemIds;
    }

    public int aG() {
        return this.inventoryChild;
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 0;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 0;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    static {
        K.var25();
        K.var26();
        int[] nArray = new int[1];
        nArray[0] = 3;
        RAKE = new GameEnum23(2, 1, nArray);
        int[] nArray2 = new int[1];
        nArray2[0] = 6;
        SEED_DIBBER = new GameEnum23(5, 4, nArray2);
        int[] nArray3 = new int[1];
        nArray3[0] = 9;
        SPADE = new GameEnum23(8, 7, nArray3);
        int[] nArray4 = new int[4];
        nArray4[0] = var1[12];
        nArray4[1] = var1[13];
        SECATEURS = new GameEnum23(var1[11], var1[10], nArray4);
        int[] nArray5 = new int[1];
        nArray5[0] = var1[17];
        PLANT_CURE = new GameEnum23(var1[15], var1[16], nArray5);
        int[] nArray6 = new int[1];
        nArray6[0] = var1[20];
        BOTTOMLESS_BUCKET = new GameEnum23(var1[19], 2, nArray6);
        int[] nArray7 = new int[1];
        nArray7[0] = var1[22];
        EMPTY_BUCKET = new GameEnum23(var1[21], 5, nArray7);
        int[] nArray8 = new int[1];
        nArray8[0] = var1[24];
        COMPOST = new GameEnum23(var1[23], 8, nArray8);
        int[] nArray9 = new int[1];
        nArray9[0] = var1[26];
        SUPER_COMPOST = new GameEnum23(var1[25], var1[11], nArray9);
        int[] nArray10 = new int[1];
        nArray10[0] = var1[29];
        ULTRA_COMPOST = new GameEnum23(var1[27], var1[28], nArray10);
        K[] kArray = new K[8];
        kArray[0] = RAKE;
        kArray[1] = SEED_DIBBER;
        kArray[4] = SPADE;
        kArray[7] = SECATEURS;
        kArray[K.var1[10]] = PLANT_CURE;
        kArray[K.var1[14]] = BOTTOMLESS_BUCKET;
        kArray[K.var1[18]] = EMPTY_BUCKET;
        kArray[K.var1[16]] = COMPOST;
        kArray[2] = SUPER_COMPOST;
        kArray[5] = ULTRA_COMPOST;
        $VALUES = kArray;
    }

    public static K valueOf(String string) {
        return Enum.valueOf(GameEnum23.class, string);
    }

    /*
     * WARNING - void declaration
     */
    public static K d(Item item) {
        Item var27;
        void var28;
        K[] kArray = K.values();
        int n2 = kArray.length;
        int var29 = 0;
        while ((var29 < (int)var28)) {
            void var30;
            void var31 = var30[var29];
            int[] var32 = var31.itemIds;
            int var33 = var32.length;
            int var34 = 0;
            while (var34 < var33) {
                int var35 = var32[var34];
                if ((var27.getId() == var35)) {
                    return var31;
                }
                ++var34;
                0;
                if null == null continue;
                return null;
            }
            ++var29;
            0;
            if null == null continue;
            return null;
        }
        if ((var27.getName( != 0).contains(var2[0]) ? 1 : 0)) {
            return BOTTOMLESS_BUCKET;
        }
        return null;
    }

}

