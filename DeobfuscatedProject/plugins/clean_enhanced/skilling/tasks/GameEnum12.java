/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

public final class GameEnum12
extends Enum<l> {
    private final  int finishedID;
    public static final  /* enum */ l MAPLE_SHIELD;
    public static final  /* enum */ l MAPLE_CROSSBOW_STOCK;
    public static final  /* enum */ l OAK_LONGBOW_U;
    public static final  /* enum */ l MAGIC_SHORTBOW_U;
    public static final  /* enum */ l YEW_SHORTBOW_U;
    public static final  /* enum */ l LONGBOW_U;
    private final  int craftingOption;
    private final  int materialID;
    public static final  /* enum */ l YEW_SHIELD;
    private static final  l[] $VALUES;
    
    public static final  /* enum */ l OAK_CROSSBOW_STOCK;
    public static final  /* enum */ l OAK_SHORTBOW_U;
    public static final  /* enum */ l ARROW_SHAFT;
    public static final  /* enum */ l MAGIC_CROSSBOW_STOCK;
    public static final  /* enum */ l YEW_CROSSBOW_STOCK;
    public static final  /* enum */ l JAVELIN_SHAFT;
    public static final  /* enum */ l OAK_SHIELD;
    
    public static final  /* enum */ l MAGIC_LONGBOW_U;
    public static final  /* enum */ l WILLOW_SHORTBOW_U;
    public static final  /* enum */ l CROSSBOW_STOCK;
    public static final  /* enum */ l YEW_LONGBOW_U;
    public static final  /* enum */ l REDWOOD_SHIELD;
    public static final  /* enum */ l SHORTBOW_U;
    public static final  /* enum */ l WILLOW_CROSSBOW_STOCK;
    public static final  /* enum */ l MAPLE_LONGBOW_U;
    public static final  /* enum */ l WILLOW_SHIELD;
    public static final  /* enum */ l MAGIC_SHIELD;
    public static final  /* enum */ l WILLOW_LONGBOW_U;
    public static final  /* enum */ l MAPLE_SHORTBOW_U;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (l.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (((149 + 36 - 166 + 132 ^ 109 + 52 - 96 + 70) & (0x19 ^ 0x3A ^ (0x73 ^ 0x40) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public boolean G() {
        return this.name().endsWith(var2[var1[0]]);
    }

    public int z() {
        return this.materialID;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static void var20() {
        var1 = new int[61];
        l.var1[0] = (0xD9 ^ 0xC6 ^ 2) & (0xCD ^ 0xBD ^ (0x17 ^ 0x7A) ^ -1);
        l.var1[1] = 1;
        l.var1[2] = -(0xFFFFFF5B & 0x42AD) & (0xFFFFF7FF & 0x4FEF);
        l.var1[3] = 0xE ^ 0x3A;
        l.var1[4] = 2;
        l.var1[5] = -(0xFFFFB5EF & 0x7A54) & (0xFFFFFCDB & 0x7FE7);
        l.var1[6] = 3;
        l.var1[7] = 0x74 ^ 0x46;
        l.var1[8] = 0x38 ^ 0x3C;
        l.var1[9] = 116 + 15 - 79 + 103 ^ 110 + 116 - 104 + 49;
        l.var1[10] = 0x51 ^ 0x54;
        l.var1[11] = 0xFFFFFEEB & 0x25F4;
        l.var1[12] = 140 + 85 - 134 + 72 ^ 20 + 60 - 53 + 138;
        l.var1[13] = -(0xFFFFDECD & 0x7137) & (0xFFFFFDFF & 0x57F5);
        l.var1[14] = 0xF0 ^ 0xC6;
        l.var1[15] = 0x56 ^ 0xE ^ (0x31 ^ 0x6E);
        l.var1[16] = 0x4D ^ 0x75;
        l.var1[17] = 0xA6 ^ 0xAE;
        l.var1[18] = 0xFFFFAEF6 & 0x75EB;
        l.var1[19] = 0x6F ^ 0x66;
        l.var1[20] = -(0xFFFFEB3F & 0x1DC5) & (0xFFFFDFFF & 0x7FEF);
        l.var1[21] = 0x9D ^ 0x9B ^ (0x2A ^ 0x26);
        l.var1[22] = -(0xFFFFF629 & 0x2BD7) & (0xFFFFE7EF & 0x3FFF);
        l.var1[23] = 0x7A ^ 0x46;
        l.var1[24] = 0x53 ^ 9 ^ (0x60 ^ 0x31);
        l.var1[25] = 198 + 91 - 72 + 35 ^ 178 + 158 - 302 + 164;
        l.var1[26] = 0x50 ^ 0x5C;
        l.var1[27] = -(0xFFFFFB8E & 0x5C7D) & (0xFFFFFEFF & 0x7DEF);
        l.var1[28] = 2 ^ 0xF;
        l.var1[29] = 0xFFFFF7EE & 0x5EFF;
        l.var1[30] = 0xA0 ^ 0x97 ^ (0x7B ^ 0x42);
        l.var1[31] = -(0xFFFFA8F1 & 0x5F0F) & (0xFFFF8DFD & 0x7FEF);
        l.var1[32] = 0x22 ^ 0x7D ^ (0x69 ^ 0x76);
        l.var1[33] = 1 ^ 0xE;
        l.var1[34] = 0x2A ^ 0x78 ^ (0x4F ^ 0x23);
        l.var1[35] = 0x48 ^ 0x58;
        l.var1[36] = -(0xFFFFDF4B & 0x79BC) & (0xFFFFFFFF & 0x7DEF);
        l.var1[37] = 130 + 177 - 110 + 11 ^ 93 + 88 - 124 + 136;
        l.var1[38] = 0xFFFFFEF5 & 0x57FB;
        l.var1[39] = 0x14 ^ 0x18 ^ (0x8B ^ 0x95);
        l.var1[40] = -(0xFFFFFACF & 0x5D35) & (0xFFFFDDEF & Short.MAX_VALUE);
        l.var1[41] = 0x42 ^ 0xA ^ (3 ^ 0xF);
        l.var1[42] = 0x18 ^ 0xB;
        l.var1[43] = 0xE3 ^ 0x91 ^ (1 ^ 0x31);
        l.var1[44] = 0x74 ^ 0x38 ^ (0xC8 ^ 0x90);
        l.var1[45] = 0xFFFFEDFE & 0x36ED;
        l.var1[46] = 0x9C ^ 0x89;
        l.var1[47] = 0xFFFFDEFC & 0x77F7;
        l.var1[48] = 0xB ^ 0x49 ^ (0x30 ^ 0x64);
        l.var1[49] = -(0xFFFFFAC7 & 0x7F3B) & (0xFFFFFFFB & 0x7FEF);
        l.var1[50] = 0xA9 ^ 0xA4 ^ (0x41 ^ 4);
        l.var1[51] = 87 + 25 - 64 + 128 ^ 115 + 65 - 79 + 66;
        l.var1[52] = 0x57 ^ 0x11;
        l.var1[53] = 0xF2 ^ 0xB4 ^ (0xD8 ^ 0x86);
        l.var1[54] = 0xFFFFDDD1 & 0x77EE;
        l.var1[55] = 0x53 ^ 0x6A ^ (0xE2 ^ 0xC2);
        l.var1[56] = -(0xFFFFA323 & 0x7DDD) & (0xFFFFF7F7 & Short.MAX_VALUE);
        l.var1[57] = 0x3D ^ 0x30 ^ (0x3D ^ 0x2A);
        l.var1[58] = 0xFFFFDEFF & 0x6DD5;
        l.var1[59] = 0xFFFFD7FA & 0x7EFF;
        l.var1[60] = 0x10 ^ 0xB;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    public int E() {
        return this.finishedID;
    }

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public static l valueOf(String string) {
        return Enum.valueOf(GameEnum12.class, string);
    }

    private GameEnum12(int n3, int n4, int n5) {
        this.materialID = n3;
        this.finishedID = n4;
        this.craftingOption = n5;
    }

    private static void var27() {
        var2 = new String[var1[60]];
        l.var2[l.var1[0]] = "_SHIELD";
        l.var2[l.var1[1]] = "ARROW_SHAFT";
        l.var2[l.var1[4]] = "JAVELIN_SHAFT";
        l.var2[l.var1[6]] = "SHORTBOW_U";
        l.var2[l.var1[8]] = "LONGBOW_U";
        l.var2[l.var1[10]] = "CROSSBOW_STOCK";
        l.var2[l.var1[12]] = "OAK_SHORTBOW_U";
        l.var2[l.var1[15]] = "OAK_LONGBOW_U";
        l.var2[l.var1[17]] = "OAK_CROSSBOW_STOCK";
        l.var2[l.var1[19]] = "OAK_SHIELD";
        l.var2[l.var1[21]] = "WILLOW_SHORTBOW_U";
        l.var2[l.var1[24]] = "WILLOW_LONGBOW_U";
        l.var2[l.var1[26]] = "WILLOW_CROSSBOW_STOCK";
        l.var2[l.var1[28]] = "WILLOW_SHIELD";
        l.var2[l.var1[30]] = "MAPLE_SHORTBOW_U";
        l.var2[l.var1[33]] = "MAPLE_LONGBOW_U";
        l.var2[l.var1[35]] = "MAPLE_CROSSBOW_STOCK";
        l.var2[l.var1[37]] = "MAPLE_SHIELD";
        l.var2[l.var1[39]] = "YEW_SHORTBOW_U";
        l.var2[l.var1[42]] = "YEW_LONGBOW_U";
        l.var2[l.var1[44]] = "YEW_CROSSBOW_STOCK";
        l.var2[l.var1[46]] = "YEW_SHIELD";
        l.var2[l.var1[48]] = "MAGIC_SHORTBOW_U";
        l.var2[l.var1[51]] = "MAGIC_LONGBOW_U";
        l.var2[l.var1[53]] = "MAGIC_CROSSBOW_STOCK";
        l.var2[l.var1[55]] = "MAGIC_SHIELD";
        l.var2[l.var1[57]] = "REDWOOD_SHIELD";
    }

    static {
        l.var20();
        l.var27();
        ARROW_SHAFT = new GameEnum12(var1[2], var1[3], var1[1]);
        JAVELIN_SHAFT = new GameEnum12(var1[2], var1[5], var1[4]);
        SHORTBOW_U = new GameEnum12(var1[2], var1[7], var1[6]);
        LONGBOW_U = new GameEnum12(var1[2], var1[9], var1[8]);
        CROSSBOW_STOCK = new GameEnum12(var1[2], var1[11], var1[10]);
        OAK_SHORTBOW_U = new GameEnum12(var1[13], var1[14], var1[4]);
        OAK_LONGBOW_U = new GameEnum12(var1[13], var1[16], var1[6]);
        OAK_CROSSBOW_STOCK = new GameEnum12(var1[13], var1[18], var1[8]);
        OAK_SHIELD = new GameEnum12(var1[13], var1[20], var1[10]);
        WILLOW_SHORTBOW_U = new GameEnum12(var1[22], var1[23], var1[4]);
        WILLOW_LONGBOW_U = new GameEnum12(var1[22], var1[25], var1[6]);
        WILLOW_CROSSBOW_STOCK = new GameEnum12(var1[22], var1[27], var1[8]);
        WILLOW_SHIELD = new GameEnum12(var1[22], var1[29], var1[10]);
        MAPLE_SHORTBOW_U = new GameEnum12(var1[31], var1[32], var1[4]);
        MAPLE_LONGBOW_U = new GameEnum12(var1[31], var1[34], var1[6]);
        MAPLE_CROSSBOW_STOCK = new GameEnum12(var1[31], var1[36], var1[8]);
        MAPLE_SHIELD = new GameEnum12(var1[31], var1[38], var1[10]);
        YEW_SHORTBOW_U = new GameEnum12(var1[40], var1[41], var1[4]);
        YEW_LONGBOW_U = new GameEnum12(var1[40], var1[43], var1[6]);
        YEW_CROSSBOW_STOCK = new GameEnum12(var1[40], var1[45], var1[8]);
        YEW_SHIELD = new GameEnum12(var1[40], var1[47], var1[10]);
        MAGIC_SHORTBOW_U = new GameEnum12(var1[49], var1[50], var1[4]);
        MAGIC_LONGBOW_U = new GameEnum12(var1[49], var1[52], var1[6]);
        MAGIC_CROSSBOW_STOCK = new GameEnum12(var1[49], var1[54], var1[8]);
        MAGIC_SHIELD = new GameEnum12(var1[49], var1[56], var1[10]);
        REDWOOD_SHIELD = new GameEnum12(var1[58], var1[59], var1[4]);
        l[] lArray = new l[var1[57]];
        lArray[l.var1[0]] = ARROW_SHAFT;
        lArray[l.var1[1]] = JAVELIN_SHAFT;
        lArray[l.var1[4]] = SHORTBOW_U;
        lArray[l.var1[6]] = LONGBOW_U;
        lArray[l.var1[8]] = CROSSBOW_STOCK;
        lArray[l.var1[10]] = OAK_SHORTBOW_U;
        lArray[l.var1[12]] = OAK_LONGBOW_U;
        lArray[l.var1[15]] = OAK_CROSSBOW_STOCK;
        lArray[l.var1[17]] = OAK_SHIELD;
        lArray[l.var1[19]] = WILLOW_SHORTBOW_U;
        lArray[l.var1[21]] = WILLOW_LONGBOW_U;
        lArray[l.var1[24]] = WILLOW_CROSSBOW_STOCK;
        lArray[l.var1[26]] = WILLOW_SHIELD;
        lArray[l.var1[28]] = MAPLE_SHORTBOW_U;
        lArray[l.var1[30]] = MAPLE_LONGBOW_U;
        lArray[l.var1[33]] = MAPLE_CROSSBOW_STOCK;
        lArray[l.var1[35]] = MAPLE_SHIELD;
        lArray[l.var1[37]] = YEW_SHORTBOW_U;
        lArray[l.var1[39]] = YEW_LONGBOW_U;
        lArray[l.var1[42]] = YEW_CROSSBOW_STOCK;
        lArray[l.var1[44]] = YEW_SHIELD;
        lArray[l.var1[46]] = MAGIC_SHORTBOW_U;
        lArray[l.var1[48]] = MAGIC_LONGBOW_U;
        lArray[l.var1[51]] = MAGIC_CROSSBOW_STOCK;
        lArray[l.var1[53]] = MAGIC_SHIELD;
        lArray[l.var1[55]] = REDWOOD_SHIELD;
        $VALUES = lArray;
    }

    public int C() {
        return this.craftingOption;
    }
}

