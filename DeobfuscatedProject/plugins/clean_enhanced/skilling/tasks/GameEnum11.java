/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

public final class GameEnum11
extends Enum<e> {
    public static final  /* enum */ e MITHRIL;
    private  int bar;
    private  int secondaryOre;
    
    private  int primaryOreRequired;
    public static final  /* enum */ e GOLD;
    
    public static final  /* enum */ e RUNITE;
    private  int productionOption;
    private  int secondaryAmountToWithdraw;
    private  int primaryAmountToWithdraw;
    private  int secondaryAmountRequired;
    public static final  /* enum */ e ADAMANT;
    public static final  /* enum */ e SILVER;
    public static final  /* enum */ e IRON;
    private static final  e[] $VALUES;
    public static final  /* enum */ e BLURITE;
    private  int primaryOre;
    public static final  /* enum */ e BRONZE;
    public static final  /* enum */ e STEEL;

    private GameEnum11(int n3, int n4, int n5, int n6) {
        this.bar = n3;
        this.primaryOre = n4;
        this.primaryOreRequired = var1[0];
        this.primaryAmountToWithdraw = n5;
        this.secondaryOre = var1[1];
        this.secondaryAmountRequired = var1[1];
        this.secondaryAmountToWithdraw = var1[1];
        this.productionOption = n6;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum11.class, string);
    }

    private static void var3() {
        var1 = new int[35];
        e.var1[0] = 1;
        e.var1[1] = -1;
        e.var1[2] = (0x4A ^ 0x6B ^ (0xC9 ^ 0xAB) & ~(0xB ^ 0x69)) & (0x75 ^ 0x14 ^ (0x38 ^ 0x78) ^ -1);
        e.var1[3] = 0xFFFFFFBF & 0x96D;
        e.var1[4] = 0xFFFFEDFF & 0x13B6;
        e.var1[5] = 0x6D ^ 0x48 ^ (0x20 ^ 0xB);
        e.var1[6] = -(0xFFFFE64F & 0x3FF4) & (0xFFFFBFF7 & 0x67FF);
        e.var1[7] = 0xFFFFAEFB & 0x75FF;
        e.var1[8] = -(0xFFFFFFE3 & 0x753D) & (0xFFFFF7BF & 0x7FFC);
        e.var1[9] = 72 + 116 - 166 + 118 ^ 42 + 38 - 60 + 124;
        e.var1[10] = 2;
        e.var1[11] = 0xFFFFBDEF & 0x4B3F;
        e.var1[12] = 0xFFFF85BA & 0x7BFD;
        e.var1[13] = 3;
        e.var1[14] = -(0xFFFFDF4F & 0x34B5) & (0xFFFF9FBF & 0x7D77);
        e.var1[15] = -(0xFFFFCF4F & 0x7CF5) & (0xFFFFEFFF & 0x5DFE);
        e.var1[16] = 94 + 30 - 114 + 156 ^ 79 + 132 - 118 + 69;
        e.var1[17] = -(0xFFFFB4EF & 0x7FDF) & (0xFFFFBFFF & 0x7DFF);
        e.var1[18] = 0x84 ^ 0x8D;
        e.var1[19] = -(0xFFFFFA6F & 0x6DB9) & (0xFFFFEFED & 0x79FF);
        e.var1[20] = 0xA3 ^ 0xBE ^ (0x4C ^ 0x42);
        e.var1[21] = 0x99 ^ 0xB5 ^ (0x57 ^ 0x7E);
        e.var1[22] = 0xFFFFBDF7 & 0x4B3D;
        e.var1[23] = -(0xFFFFDFCD & 0x6673) & (0xFFFFDFFE & 0x67FD);
        e.var1[24] = 0x60 ^ 0x66;
        e.var1[25] = 0xFFFFFDF7 & 0xB3F;
        e.var1[26] = -(0xFFFFE2ED & 0x5F53) & (0xFFFFDFFF & 0x63FF);
        e.var1[27] = 0xCE ^ 0xA9 ^ (0xF7 ^ 0x98);
        e.var1[28] = 9 ^ 0x1D;
        e.var1[29] = 9 ^ 0xE;
        e.var1[30] = 0xFFFFBDB9 & 0x4B7F;
        e.var1[31] = -(0xFFFF9F3F & 0x66EF) & (0xFFFFB7EF & 0x4FFF);
        e.var1[32] = 0x8A ^ 0x92;
        e.var1[33] = -(0xFFFFF7D3 & 0x3EAD) & (0xFFFFFFFB & 0x3FBF);
        e.var1[34] = -(0xFFFFFE75 & 0x3BAF) & (0xFFFFBBEF & 0x7FF7);
    }

    public int u() {
        return this.secondaryAmountRequired;
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public int v() {
        return this.secondaryAmountToWithdraw;
    }

    public int s() {
        return this.primaryAmountToWithdraw;
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[2];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[2];
        while (e.var10(var19, var18)) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    public int r() {
        return this.primaryOreRequired;
    }

    public int q() {
        return this.primaryOre;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public int p() {
        return this.bar;
    }

    private GameEnum11(int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        this.bar = n3;
        this.primaryOre = n4;
        this.primaryOreRequired = n5;
        this.primaryAmountToWithdraw = n6;
        this.secondaryOre = n7;
        this.secondaryAmountToWithdraw = n8;
        this.secondaryAmountRequired = n9;
        this.productionOption = n10;
    }

    private static void var27() {
        var2 = new String[var1[18]];
        e.var2[e.var1[2]] = "BRONZE";
        e.var2[e.var1[0]] = "BLURITE";
        e.var2[e.var1[10]] = "IRON";
        e.var2[e.var1[13]] = "SILVER";
        e.var2[e.var1[16]] = "STEEL";
        e.var2[e.var1[21]] = "GOLD";
        e.var2[e.var1[24]] = "MITHRIL";
        e.var2[e.var1[29]] = "ADAMANT";
        e.var2[e.var1[27]] = "RUNITE";
    }

    public int w() {
        return this.productionOption;
    }

    static {
        e.var3();
        e.var27();
        BRONZE = new GameEnum11(var1[3], var1[4], var1[0], var1[5], var1[6], var1[5], var1[0], var1[0]);
        BLURITE = new GameEnum11(var1[7], var1[8], var1[9], var1[10]);
        IRON = new GameEnum11(var1[11], var1[12], var1[9], var1[13]);
        SILVER = new GameEnum11(var1[14], var1[15], var1[9], var1[16]);
        STEEL = new GameEnum11(var1[17], var1[12], var1[0], var1[18], var1[19], var1[20], var1[10], var1[21]);
        GOLD = new GameEnum11(var1[22], var1[23], var1[9], var1[24]);
        MITHRIL = new GameEnum11(var1[25], var1[26], var1[0], var1[27], var1[19], var1[28], var1[16], var1[29]);
        ADAMANT = new GameEnum11(var1[30], var1[31], var1[0], var1[16], var1[19], var1[32], var1[24], var1[27]);
        RUNITE = new GameEnum11(var1[33], var1[34], var1[0], var1[13], var1[19], var1[32], var1[27], var1[18]);
        e[] eArray = new e[var1[18]];
        eArray[e.var1[2]] = BRONZE;
        eArray[e.var1[0]] = BLURITE;
        eArray[e.var1[10]] = IRON;
        eArray[e.var1[13]] = SILVER;
        eArray[e.var1[16]] = STEEL;
        eArray[e.var1[21]] = GOLD;
        eArray[e.var1[24]] = MITHRIL;
        eArray[e.var1[29]] = ADAMANT;
        eArray[e.var1[27]] = RUNITE;
        $VALUES = eArray;
    }

    public int t() {
        return this.secondaryOre;
    }
}

