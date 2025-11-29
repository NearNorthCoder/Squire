/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.herblore.tasks;

import gg.squire.herblore.tasks.GameEnum2;

public final class GameEnum
extends Enum<b> {
    public static final  /* enum */ b LANTADYME;
    public static final  /* enum */ b TORSTOL;
    public static final  /* enum */ b CADANTINE;
    public static final  /* enum */ b TARROMIN;
    public static final  /* enum */ b DWARF_WEED;
    public static final  /* enum */ b TOADFLAX;
    private final  int unfPotionId;
    
    public static final  /* enum */ b AVANTOE;
    public static final  /* enum */ b MARRENTILL;
    private final  int cleanId;
    public static final  /* enum */ b IRIT_LEAF;
    
    public static final  /* enum */ b KWUARM;
    public static final  /* enum */ b GUAM_LEAF;
    public static final  /* enum */ b RANARR_WEED;
    private static final  b[] $VALUES;
    public static final  /* enum */ b SNAPDRAGON;
    private final  int grimyId;
    public static final  /* enum */ b HARRALANDER;

    /*
     * WARNING - void declaration
     */
    public static b a(Integer n) {
        void var3;
        b[] bArray = b.values();
        int n2 = bArray.length;
        int var4 = var1[0];
        while (b.var5(var4, (int)var3)) {
            Integer var6;
            void var7;
            void var8 = var7[var4];
            if (b.var9(var8.a(var6) ? 1 : 0)) {
                return var8;
            }
            ++var4;
            0;
            if (((0x12 ^ 0x3A) & ~(0x62 ^ 0x4A)) <= 1) continue;
            return null;
        }
        return null;
    }

    public int e() {
        return this.grimyId;
    }

    private GameEnum(int n2, int n3, int n4) {
        this.grimyId = n2;
        this.cleanId = n3;
        this.unfPotionId = n4;
    }

    private static boolean var9(int n) {
        return n != 0;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static boolean var5(int n, int n2) {
        return n < n2;
    }

    private static boolean var10(int n, int n2) {
        return n != n2;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = var1[0];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = var1[0];
        while (b.var5(var25, var24)) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    public int g() {
        return this.unfPotionId;
    }

    private static void var27() {
        var1 = new int[57];
        b.var1[0] = (1 ^ 8) & ~(0xBC ^ 0xB5);
        b.var1[1] = 1;
        b.var1[2] = (0x31 ^ 0x78) + (0x31 ^ 0x6A) - -(0x45 ^ 0x56) + (0x33 ^ 0x23);
        b.var1[3] = 55 + 98 - 83 + 94 + (0x7B ^ 0x2C) - (157 + 118 - 57 + 15) + (13 + 142 - -27 + 49);
        b.var1[4] = 0x5B ^ 0;
        b.var1[5] = 188 + 88 - 169 + 94;
        b.var1[6] = 101 + 122 - 202 + 192 + (144 + 36 - 103 + 73) - (53 + 16 - 57 + 175) + (0xF5 ^ 0xBE);
        b.var1[7] = 0x73 ^ 0x2E;
        b.var1[8] = 2;
        b.var1[9] = (0x38 ^ 0x73) + (0 ^ 0x66) - (0x51 ^ 0x3C) + (20 + 19 - 8 + 104);
        b.var1[10] = 63 + 150 - 179 + 167 + (0x3B ^ 9) - (0xD0 ^ 0x82) + (0x56 ^ 2);
        b.var1[11] = 0xF6 ^ 0x90 ^ (0xB0 ^ 0x89);
        b.var1[12] = 3;
        b.var1[13] = 138 + 138 - 156 + 67 + (88 + 64 - 100 + 81) - (141 + 5 - 3 + 10) + (0x2B ^ 0xD);
        b.var1[14] = 97 + 99 - 13 + 72;
        b.var1[15] = 91 + 111 - 52 + 44 ^ 11 + 0 - -79 + 73;
        b.var1[16] = 0x67 ^ 0x63;
        b.var1[17] = 80 + 133 - 132 + 54 + (71 + 93 - 94 + 87) - (127 + 0 - 11 + 13) + (0x68 ^ 0x44);
        b.var1[18] = 0xFFFF8555 & 0x7BAB;
        b.var1[19] = 134 + 45 - 20 + 38 ^ 60 + 19 - 44 + 131;
        b.var1[20] = 0x90 ^ 0x95;
        b.var1[21] = 0xFFFFABFF & 0x5FE9;
        b.var1[22] = 0xFFFFDBB7 & 0x2FFE;
        b.var1[23] = -(0xFFFFDCF9 & 0x7747) & (0xFFFFDFFF & 0x7FFA);
        b.var1[24] = 133 + 59 - 23 + 25 ^ 30 + 169 - 110 + 107;
        b.var1[25] = (0x85 ^ 0xB4) + (58 + 92 - 132 + 114) - (108 + 32 - 114 + 114) + (66 + 26 - -12 + 64);
        b.var1[26] = -(0xFFFFBF7F & 0x7AED) & (0xFFFFFB7F & 0x3FEF);
        b.var1[27] = 93 + 102 - 47 + 63 ^ 42 + 138 - 137 + 139;
        b.var1[28] = 0x79 ^ 0x7E;
        b.var1[29] = 92 + 124 - 210 + 205;
        b.var1[30] = 0xFFFFC777 & 0x398D;
        b.var1[31] = 0x7A ^ 0x55 ^ (0x66 ^ 0x2E);
        b.var1[32] = 106 + 34 - 81 + 108 ^ 11 + 158 - 12 + 18;
        b.var1[33] = 45 + 1 - -119 + 48;
        b.var1[34] = -(0xFFFFE86F & 0x3799) & (0xFFFFB73F & 0x69CF);
        b.var1[35] = 0xAD ^ 0xC4;
        b.var1[36] = 0x85 ^ 0x96 ^ (9 ^ 0x13);
        b.var1[37] = 0xFFFF8FFB & 0x7BEF;
        b.var1[38] = -(0xFFFFD1F5 & 0x3E0F) & (0xFFFF9FFE & 0x7BBD);
        b.var1[39] = -(0xFFFFB0EF & 0x7F12) & (0xFFFFBFFD & 0x7BBF);
        b.var1[40] = 0x75 ^ 0x7F;
        b.var1[41] = 46 + 185 - 206 + 190;
        b.var1[42] = 0xFFFF9569 & 0x6B9F;
        b.var1[43] = 0x79 ^ 0x7F ^ (0xF5 ^ 0x98);
        b.var1[44] = 130 + 146 - 132 + 31 ^ 66 + 18 - 65 + 145;
        b.var1[45] = 0xFFFFB9BD & 0x4FF7;
        b.var1[46] = 0xFFFFBBB3 & 0x4DFD;
        b.var1[47] = -(0xFFFFEE9F & 0x7769) & (0xFFFFEFBB & Short.MAX_VALUE);
        b.var1[48] = 0x66 ^ 0x6A;
        b.var1[49] = 39 + 30 - -55 + 93;
        b.var1[50] = 0xFFFFE53B & 0x1BCF;
        b.var1[51] = 0x25 ^ 0x48;
        b.var1[52] = 135 + 155 - 289 + 166 ^ 136 + 30 - 108 + 112;
        b.var1[53] = 33 + 56 - -93 + 37;
        b.var1[54] = 0xFFFFD78F & 0x297D;
        b.var1[55] = 0x11 ^ 0x7E;
        b.var1[56] = 0x8E ^ 0x80;
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    public int f() {
        return this.cleanId;
    }

    private static void var34() {
        var2 = new String[var1[56]];
        b.var2[b.var1[0]] = "GUAM_LEAF";
        b.var2[b.var1[1]] = "MARRENTILL";
        b.var2[b.var1[8]] = "TARROMIN";
        b.var2[b.var1[12]] = "HARRALANDER";
        b.var2[b.var1[16]] = "RANARR_WEED";
        b.var2[b.var1[20]] = "TOADFLAX";
        b.var2[b.var1[24]] = "IRIT_LEAF";
        b.var2[b.var1[28]] = "AVANTOE";
        b.var2[b.var1[32]] = "KWUARM";
        b.var2[b.var1[36]] = "SNAPDRAGON";
        b.var2[b.var1[40]] = "CADANTINE";
        b.var2[b.var1[44]] = "LANTADYME";
        b.var2[b.var1[48]] = "DWARF_WEED";
        b.var2[b.var1[52]] = "TORSTOL";
    }

    /*
     * WARNING - void declaration
     */
    public c GameEnum(int n) {
        b var35;
        void var36;
        if (b.var37(n, this.grimyId)) {
            return c.CLEAN_HERBS;
        }
        if (b.var37((int)var36, var35.cleanId)) {
            return c.MAKE_UNF_POTS;
        }
        if (b.var37((int)var36, var35.unfPotionId)) {
            return c.FINISH_POTS;
        }
        return null;
    }

    private static boolean var37(int n, int n2) {
        return n == n2;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    static {
        b.var27();
        b.var34();
        GUAM_LEAF = new GameEnum(var1[2], var1[3], var1[4]);
        MARRENTILL = new GameEnum(var1[5], var1[6], var1[7]);
        TARROMIN = new GameEnum(var1[9], var1[10], var1[11]);
        HARRALANDER = new GameEnum(var1[13], var1[14], var1[15]);
        RANARR_WEED = new GameEnum(var1[17], var1[18], var1[19]);
        TOADFLAX = new GameEnum(var1[21], var1[22], var1[23]);
        IRIT_LEAF = new GameEnum(var1[25], var1[26], var1[27]);
        AVANTOE = new GameEnum(var1[29], var1[30], var1[31]);
        KWUARM = new GameEnum(var1[33], var1[34], var1[35]);
        SNAPDRAGON = new GameEnum(var1[37], var1[38], var1[39]);
        CADANTINE = new GameEnum(var1[41], var1[42], var1[43]);
        LANTADYME = new GameEnum(var1[45], var1[46], var1[47]);
        DWARF_WEED = new GameEnum(var1[49], var1[50], var1[51]);
        TORSTOL = new GameEnum(var1[53], var1[54], var1[55]);
        b[] bArray = new b[var1[56]];
        bArray[b.var1[0]] = GUAM_LEAF;
        bArray[b.var1[1]] = MARRENTILL;
        bArray[b.var1[8]] = TARROMIN;
        bArray[b.var1[12]] = HARRALANDER;
        bArray[b.var1[16]] = RANARR_WEED;
        bArray[b.var1[20]] = TOADFLAX;
        bArray[b.var1[24]] = IRIT_LEAF;
        bArray[b.var1[28]] = AVANTOE;
        bArray[b.var1[32]] = KWUARM;
        bArray[b.var1[36]] = SNAPDRAGON;
        bArray[b.var1[40]] = CADANTINE;
        bArray[b.var1[44]] = LANTADYME;
        bArray[b.var1[48]] = DWARF_WEED;
        bArray[b.var1[52]] = TORSTOL;
        $VALUES = bArray;
    }

    public boolean a(int n) {
        boolean bl;
        if (!b.var10(n, this.grimyId) || !b.var10(n, this.cleanId) || b.var37(n, this.unfPotionId)) {
            bl = var1[1];
            0;
            if ((16 + 46 - 22 + 109 ^ 132 + 90 - 182 + 105) <= 0) {
                return ((20 + 21 - -10 + 119 ^ 48 + 1 - -62 + 46) & (73 + 35 - 56 + 77 ^ 16 + 132 - 27 + 61 ^ -1)) != 0;
            }
        } else {
            bl = var1[0];
        }
        return bl;
    }
}

