/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

public final class GameEnum5
extends Enum<i> {
    public static final  /* enum */ i MONKFISH;
    public static final  /* enum */ i LOBSTER;
    private final  int materialId;
    private final  int craftingOption;
    public static final  /* enum */ i SHRIMP;
    public static final  /* enum */ i KARAMBWAN;
    
    public static final  /* enum */ i BASS;
    public static final  /* enum */ i TROUT;
    private final  int finishedId;
    public static final  /* enum */ i SWORDFISH;
    public static final  /* enum */ i ANCHOVIES;
    public static final  /* enum */ i MANTA_RAY;
    public static final  /* enum */ i SEA_TURTLE;
    
    public static final  /* enum */ i SHARK;
    private static final  i[] $VALUES;
    public static final  /* enum */ i DARK_CRAB;
    public static final  /* enum */ i SARDINE;
    public static final  /* enum */ i SALMON;
    public static final  /* enum */ i ANGLERFISH;
    public static final  /* enum */ i TUNA;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum5(int n3, int n4, int n5) {
        this.materialId = n3;
        this.finishedId = n4;
        this.craftingOption = n5;
    }

    static {
        i.var10();
        i.var11();
        SHRIMP = new GameEnum5(var1[1], var1[1], var1[2]);
        ANCHOVIES = new GameEnum5(var1[3], var1[4], var1[2]);
        SARDINE = new GameEnum5(var1[6], var1[7], var1[2]);
        TROUT = new GameEnum5(var1[9], var1[10], var1[2]);
        SALMON = new GameEnum5(var1[12], var1[13], var1[2]);
        TUNA = new GameEnum5(var1[15], var1[16], var1[2]);
        KARAMBWAN = new GameEnum5(var1[18], var1[19], var1[2]);
        LOBSTER = new GameEnum5(var1[21], var1[22], var1[2]);
        BASS = new GameEnum5(var1[24], var1[25], var1[2]);
        SWORDFISH = new GameEnum5(var1[27], var1[28], var1[2]);
        MONKFISH = new GameEnum5(var1[30], var1[31], var1[2]);
        SHARK = new GameEnum5(var1[33], var1[34], var1[2]);
        SEA_TURTLE = new GameEnum5(var1[36], var1[37], var1[2]);
        ANGLERFISH = new GameEnum5(var1[39], var1[40], var1[2]);
        DARK_CRAB = new GameEnum5(var1[42], var1[43], var1[2]);
        MANTA_RAY = new GameEnum5(var1[45], var1[46], var1[2]);
        i[] iArray = new i[var1[47]];
        iArray[i.var1[0]] = SHRIMP;
        iArray[i.var1[2]] = ANCHOVIES;
        iArray[i.var1[5]] = SARDINE;
        iArray[i.var1[8]] = TROUT;
        iArray[i.var1[11]] = SALMON;
        iArray[i.var1[14]] = TUNA;
        iArray[i.var1[17]] = KARAMBWAN;
        iArray[i.var1[20]] = LOBSTER;
        iArray[i.var1[23]] = BASS;
        iArray[i.var1[26]] = SWORDFISH;
        iArray[i.var1[29]] = MONKFISH;
        iArray[i.var1[32]] = SHARK;
        iArray[i.var1[35]] = SEA_TURTLE;
        iArray[i.var1[38]] = ANGLERFISH;
        iArray[i.var1[41]] = DARK_CRAB;
        iArray[i.var1[44]] = MANTA_RAY;
        $VALUES = iArray;
    }

    public int C() {
        return this.craftingOption;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (i.var9(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (-(0x36 ^ 0x2B ^ (0x58 ^ 0x40)) < 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static void var10() {
        var1 = new int[48];
        i.var1[0] = (0x5D ^ 0x43) & ~(0xB8 ^ 0xA6);
        i.var1[1] = 0xFFFF893F & 0x77FD;
        i.var1[2] = 1;
        i.var1[3] = 0xFFFFDFF1 & 0x214F;
        i.var1[4] = -(0xFFFFF64B & 0x2FF5) & (0xFFFFFFFF & 0x277F);
        i.var1[5] = 2;
        i.var1[6] = -(0xFFFFFFBD & 0x5EDB) & (0xFFFFFFDF & 0x5FFF);
        i.var1[7] = 0xFFFFEFE5 & 0x115F;
        i.var1[8] = 3;
        i.var1[9] = 0xFFFFF3CF & 0xD7F;
        i.var1[10] = -(0xFFFFFA79 & 0x3DB7) & (0xFFFFFFFD & 0x397F);
        i.var1[11] = 0x9B ^ 0x9F;
        i.var1[12] = 0xFFFFFB4B & 0x5FF;
        i.var1[13] = 0xFFFFB3C9 & 0x4D7F;
        i.var1[14] = 0x2B ^ 0xD ^ (0x71 ^ 0x52);
        i.var1[15] = -(0xFFFFEF1D & 0x74FB) & (0xFFFFFF7F & 0x65FF);
        i.var1[16] = -(0xFFFFFFDF & 0x4027) & (0xFFFFE9EF & 0x577F);
        i.var1[17] = 48 + 30 - 56 + 141 ^ 48 + 45 - 1 + 73;
        i.var1[18] = 0xFFFF8FEF & 0x7C56;
        i.var1[19] = -(0xFFFFE87D & 0x37A3) & (0xFFFFECED & 0x3F7A);
        i.var1[20] = 0x1D ^ 0x74 ^ (0x42 ^ 0x2C);
        i.var1[21] = 0xFFFF997D & 0x67FB;
        i.var1[22] = -(0xFFFFBBD5 & 0x7EAF) & (0xFFFFBBFF & Short.MAX_VALUE);
        i.var1[23] = 0x8F ^ 0x87;
        i.var1[24] = 0xFFFFCD7B & 0x33EF;
        i.var1[25] = -(0xFFFFEF9F & 0x7EF3) & (0xFFFFFFFF & 0x6FFF);
        i.var1[26] = 0xED ^ 0xA9 ^ (0x4C ^ 1);
        i.var1[27] = -(0xFFFFEF8F & 0x787D) & (0xFFFFEBFF & 0x7D7F);
        i.var1[28] = 0xFFFFC7F7 & 0x397D;
        i.var1[29] = 8 ^ 0x27 ^ (0x6B ^ 0x4E);
        i.var1[30] = -(0x58 ^ 0x4B) & (0xFFFF9F9F & 0x7F7A);
        i.var1[31] = -(0xFFFFACD7 & 0x73ED) & (0xFFFFBFEF & 0x7FDE);
        i.var1[32] = 0x64 ^ 0x6F;
        i.var1[33] = -(0xFFFFBE85 & 0x537B) & (0xFFFFD37F & 0x3FFF);
        i.var1[34] = -(0xFFFFFCFF & 0x677D) & (0xFFFFFDFF & 0x67FD);
        i.var1[35] = 0x91 ^ 0x9D;
        i.var1[36] = -(0xFFFFDD39 & 0x6AE7) & (0xFFFFDFBB & 0x69EF);
        i.var1[37] = -(0xFFFFD677 & 0x69EB) & (0xFFFFEBFF & 0x55EF);
        i.var1[38] = 0x51 ^ 0x64 ^ (0x47 ^ 0x7F);
        i.var1[39] = 0xFFFFFFFF & 0x347F;
        i.var1[40] = 0xFFFFBCD9 & 0x77A7;
        i.var1[41] = 0x84 ^ 0x8A;
        i.var1[42] = 0xFFFFAEBF & 0x7FDE;
        i.var1[43] = -(0xFFFFF7E9 & 0x495F) & (0xFFFFFFFF & 0x6FE8);
        i.var1[44] = 0x83 ^ 0x8C;
        i.var1[45] = -(0xFFFFFCDF & 0x7779) & (0xFFFFF5DF & 0x7FFD);
        i.var1[46] = 0xFFFFCDE7 & 0x339F;
        i.var1[47] = 0xD2 ^ 0xAF ^ (0x38 ^ 0x55);
    }

    public int B() {
        return this.finishedId;
    }

    private static void var11() {
        var2 = new String[var1[47]];
        i.var2[i.var1[0]] = "SHRIMP";
        i.var2[i.var1[2]] = "ANCHOVIES";
        i.var2[i.var1[5]] = "SARDINE";
        i.var2[i.var1[8]] = "TROUT";
        i.var2[i.var1[11]] = "SALMON";
        i.var2[i.var1[14]] = "TUNA";
        i.var2[i.var1[17]] = "KARAMBWAN";
        i.var2[i.var1[20]] = "LOBSTER";
        i.var2[i.var1[23]] = "BASS";
        i.var2[i.var1[26]] = "SWORDFISH";
        i.var2[i.var1[29]] = "MONKFISH";
        i.var2[i.var1[32]] = "SHARK";
        i.var2[i.var1[35]] = "SEA_TURTLE";
        i.var2[i.var1[38]] = "ANGLERFISH";
        i.var2[i.var1[41]] = "DARK_CRAB";
        i.var2[i.var1[44]] = "MANTA_RAY";
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public int A() {
        return this.materialId;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }
}

