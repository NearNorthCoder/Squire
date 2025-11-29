/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.LocalPoint
 */
package gg.squire.mta.tasks;

import net.runelite.api.coords.LocalPoint;

public final class GameEnum3
extends Enum<m> {
    
    public static final  /* enum */ m MAZE_7;
    public static final  /* enum */ m MAZE_4;
    public static final  /* enum */ m MAZE_1;
    public static final  /* enum */ m MAZE_6;
    private final  int walls;
    public static final  /* enum */ m MAZE_2;
    private static final  m[] $VALUES;
    
    public static final  /* enum */ m MAZE_5;
    public static final  /* enum */ m MAZE_9;
    public static final  /* enum */ m MAZE_3;
    public static final  /* enum */ m MAZE_10;
    public static final  /* enum */ m MAZE_8;
    private final  LocalPoint start;

    /*
     * WARNING - void declaration
     */
    public static m b(int n2) {
        void var3;
        m[] mArray = m.values();
        int n3 = mArray.length;
        int var4 = var2[0];
        while (m.var5(var4, (int)var3)) {
            int var6;
            void var7;
            void var8 = var7[var4];
            if (m.var9(var8.C(), var6)) {
                return var8;
            }
            ++var4;
            0;
            if (3 > 2) continue;
            return null;
        }
        return null;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private GameEnum3(int n3, LocalPoint localPoint) {
        this.walls = n3;
        this.start = localPoint;
    }

    public static m valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static void var22() {
        var2 = new int[36];
        m.var2[0] = (0x55 ^ 0x7B) & ~(0x90 ^ 0xBE);
        m.var2[1] = 0x4C ^ 0x68 ^ (9 ^ 0x49);
        m.var2[2] = 0xFFFFDBD9 & 0x3EE6;
        m.var2[3] = 0xFFFFEF64 & 0x1FDB;
        m.var2[4] = 1;
        m.var2[5] = 74 + 9 - 42 + 176 ^ 36 + 141 - 157 + 145;
        m.var2[6] = 0xFFFFF3F3 & 0x1F4C;
        m.var2[7] = 2;
        m.var2[8] = (0x38 ^ 0x16) + (0x2C ^ 0x4E) - (0x5A ^ 0x73) + (0xA1 ^ 0xBB);
        m.var2[9] = -(0xFFFF8E7B & 0x75AE) & (0xFFFF9FF9 & 0x7FEF);
        m.var2[10] = -(0xFFFFEBFF & 0x773F) & (0xFFFFF7FE & Short.MAX_VALUE);
        m.var2[11] = 3;
        m.var2[12] = 0x7B ^ 0x4B ^ (0x7B ^ 0x7E);
        m.var2[13] = 0xFFFFBDEC & 0x5A53;
        m.var2[14] = 0xDB ^ 0xB7 ^ (0x77 ^ 0x1F);
        m.var2[15] = 0x1D ^ 0x71;
        m.var2[16] = -(0xFFFFCF34 & 0x7CDF) & (0xFFFFFFDF & 0x5FF3);
        m.var2[17] = 0xFFFFF4C7 & 0x1F78;
        m.var2[18] = 0x43 ^ 0x46;
        m.var2[19] = 0x7B ^ 2;
        m.var2[20] = -(0xFFFFFFBD & 0x315E) & (0xFFFFFF5F & 0x3FFB);
        m.var2[21] = -(0xFFFFAA64 & 0x77BF) & (0xFFFFB7E7 & 0x7F7B);
        m.var2[22] = 3 + 132 - 119 + 164 ^ 139 + 118 - 240 + 161;
        m.var2[23] = 0xBF ^ 0xB9 ^ (0xF8 ^ 0xB9);
        m.var2[24] = 0xFFFFBFCD & 0x57F2;
        m.var2[25] = -(0xFFFFE9F7 & 0x7EBD) & (0xFFFFFFFE & 0x7EF5);
        m.var2[26] = 1 ^ 6;
        m.var2[27] = 0x4B ^ 0x29;
        m.var2[28] = -(0xFFFFF0BD & 0x2F7F) & (0xFFFFFFFC & 0x377F);
        m.var2[29] = 0xFFFFDFC7 & 0x3CF8;
        m.var2[30] = 0xB6 ^ 0xBE;
        m.var2[31] = 0x94 ^ 0xC3;
        m.var2[32] = 0x5A ^ 0x7A ^ (0x2B ^ 2);
        m.var2[33] = 0xD ^ 0x56;
        m.var2[34] = -(0xFFFFBDCF & 0x5ABE) & (0xFFFFBFFD & 0x7BCF);
        m.var2[35] = 112 + 14 - 48 + 97 ^ 76 + 66 - 139 + 162;
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

    public LocalPoint D() {
        return this.start;
    }

    static {
        m.var22();
        m.var23();
        MAZE_1 = new GameEnum3(var2[1], new LocalPoint(var2[2], var2[3]));
        MAZE_2 = new GameEnum3(var2[5], new LocalPoint(var2[6], var2[2]));
        MAZE_3 = new GameEnum3(var2[8], new LocalPoint(var2[9], var2[10]));
        MAZE_4 = new GameEnum3(var2[12], new LocalPoint(var2[13], var2[6]));
        MAZE_5 = new GameEnum3(var2[15], new LocalPoint(var2[16], var2[17]));
        MAZE_6 = new GameEnum3(var2[19], new LocalPoint(var2[20], var2[21]));
        MAZE_7 = new GameEnum3(var2[23], new LocalPoint(var2[24], var2[25]));
        MAZE_8 = new GameEnum3(var2[27], new LocalPoint(var2[28], var2[29]));
        MAZE_9 = new GameEnum3(var2[31], new LocalPoint(var2[17], var2[13]));
        MAZE_10 = new GameEnum3(var2[33], new LocalPoint(var2[21], var2[34]));
        m[] mArray = new m[var2[35]];
        mArray[m.var2[0]] = MAZE_1;
        mArray[m.var2[4]] = MAZE_2;
        mArray[m.var2[7]] = MAZE_3;
        mArray[m.var2[11]] = MAZE_4;
        mArray[m.var2[14]] = MAZE_5;
        mArray[m.var2[18]] = MAZE_6;
        mArray[m.var2[22]] = MAZE_7;
        mArray[m.var2[26]] = MAZE_8;
        mArray[m.var2[30]] = MAZE_9;
        mArray[m.var2[32]] = MAZE_10;
        $VALUES = mArray;
    }

    public int C() {
        return this.walls;
    }

    private static String var24(String var25, String var26) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var28 = var26.toCharArray();
        int var29 = var2[0];
        char[] var30 = var25.toCharArray();
        int var31 = var30.length;
        int var32 = var2[0];
        while (m.var5(var32, var31)) {
            char var33 = var30[var32];
            var27.append((char)(var33 ^ var28[var29 % var28.length]));
            0;
            ++var29;
            ++var32;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var27);
    }

    private static void var23() {
        var1 = new String[var2[35]];
        m.var1[m.var2[0]] = "MAZE_1";
        m.var1[m.var2[4]] = "MAZE_2";
        m.var1[m.var2[7]] = "MAZE_3";
        m.var1[m.var2[11]] = "MAZE_4";
        m.var1[m.var2[14]] = "MAZE_5";
        m.var1[m.var2[18]] = "MAZE_6";
        m.var1[m.var2[22]] = "MAZE_7";
        m.var1[m.var2[26]] = "MAZE_8";
        m.var1[m.var2[30]] = "MAZE_9";
        m.var1[m.var2[32]] = "MAZE_10";
    }

    private static boolean var9(int n2, int n3) {
        return n2 == n3;
    }
}

