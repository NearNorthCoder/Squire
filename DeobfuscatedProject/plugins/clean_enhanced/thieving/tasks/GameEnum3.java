/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.thieving.tasks;

public final class GameEnum3
extends Enum<e> {
    private final  int foodId;
    
    public static final  /* enum */ e DARK_CRAB;
    
    public static final  /* enum */ e SWORDFISH;
    public static final  /* enum */ e CHOCOLATE_CAKE;
    public static final  /* enum */ e TUNA;
    private static final  e[] $VALUES;
    public static final  /* enum */ e SHRIMP;
    public static final  /* enum */ e SARA_BREW;
    public static final  /* enum */ e SUPER_RESTORE;
    public static final  /* enum */ e CAKE;
    public static final  /* enum */ e SEA_TURTLE;
    public static final  /* enum */ e NONE;
    public static final  /* enum */ e JANGERBERRIES;
    public static final  /* enum */ e WINE;
    public static final  /* enum */ e ANCIENT_BREW;
    public static final  /* enum */ e SHARK;
    public static final  /* enum */ e PLAIN_PIZZA;
    public static final  /* enum */ e PRAYER_POTION;
    public static final  /* enum */ e BASS;
    public static final  /* enum */ e MONKFISH;
    public static final  /* enum */ e ANGLERFISH;
    public static final  /* enum */ e KARAMBWAN;
    public static final  /* enum */ e MANTA_RAY;
    public static final  /* enum */ e PINEAPPLE_PIZZA;
    public static final  /* enum */ e LOBSTER;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var2[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var2[0];
        while (e.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((0x99 ^ 0x9D) > ((0xB0 ^ 0xBA) & ~(0x5A ^ 0x50))) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static void var14() {
        var2 = new int[46];
        e.var2[0] = (159 + 162 - 295 + 142 ^ 85 + 120 - 97 + 43) & (2 ^ (0x7C ^ 0x41) ^ -1);
        e.var2[1] = 1;
        e.var2[2] = 0xFFFFC13B & 0x3FFF;
        e.var2[3] = 2;
        e.var2[4] = 0xFFFFAF73 & 0x57EF;
        e.var2[5] = 3;
        e.var2[6] = 0xFFFFD77D & 0x2FEB;
        e.var2[7] = 6 ^ 2;
        e.var2[8] = 0xFFFF98F3 & 0x6FFD;
        e.var2[9] = 0x32 ^ 0x64 ^ (0x3C ^ 0x6F);
        e.var2[10] = 0xFFFFE8FD & 0x1FFF;
        e.var2[11] = 43 + 80 - 37 + 45 ^ 40 + 112 - 134 + 115;
        e.var2[12] = -(0xFFFFFCF3 & 0x4B2F) & (0xFFFFDFFB & 0x6FEF);
        e.var2[13] = 2 ^ 5;
        e.var2[14] = -(0xFFFFBF9F & 0x5CE1) & (0xFFFFFDFF & 0x1FED);
        e.var2[15] = 72 + 170 - 94 + 42 ^ 164 + 15 - 147 + 150;
        e.var2[16] = -(0xFFFFAFFB & 0x5E97) & (0xFFFF9FFB & 0x6FFF);
        e.var2[17] = 0x2B ^ 0xA ^ (0x8B ^ 0xA3);
        e.var2[18] = -(0xFFFFAFF6 & 0x51BB) & (0xFFFFFFFF & 0xDF9);
        e.var2[19] = 0x7B ^ 0x21 ^ (0x78 ^ 0x28);
        e.var2[20] = -(0xFFFFAC6B & 0x7B95) & (0xFFFFAFFF & 0x797B);
        e.var2[21] = 0x8B ^ 0x80;
        e.var2[22] = -(0xFFFFFBE9 & 0x469F) & (0xFFFFC3FD & Short.MAX_VALUE);
        e.var2[23] = 84 + 201 - 165 + 84 ^ 130 + 113 - 166 + 115;
        e.var2[24] = -(0xFFFFEE35 & 0x51EF) & (0xFFFFDF2E & Short.MAX_VALUE);
        e.var2[25] = 0x2F ^ 0x33 ^ (0x43 ^ 0x52);
        e.var2[26] = -(0xFFFFFEFD & 0x311B) & (0xFFFFF59B & 0x3BFD);
        e.var2[27] = 0x1B ^ 0x15;
        e.var2[28] = 0xFFFFDFAF & 0x21DD;
        e.var2[29] = 71 + 115 - 68 + 9 ^ (0xE5 ^ 0x95);
        e.var2[30] = -(0xFFFFA559 & 0x5EFF) & (0xFFFFCDDF & 0x37FF);
        e.var2[31] = 0xF9 ^ 0xC3 ^ (0x6A ^ 0x40);
        e.var2[32] = -(0xFFFF83AF & 0x7D79) & (0xFFFFB7B9 & 0x7DEF);
        e.var2[33] = 0x91 ^ 0x87 ^ (0xC ^ 0xB);
        e.var2[34] = 0xFFFFFFEB & 0x2EB4;
        e.var2[35] = 0xB4 ^ 0xA6;
        e.var2[36] = -(0xFFFFD1EF & 0x6E11) & (0xFFFFDB7F & 0x7E9D);
        e.var2[37] = 0x8D ^ 0x9E;
        e.var2[38] = 0xFFFFFFFE & 0x66E5;
        e.var2[39] = 0x8D ^ 0x99;
        e.var2[40] = 53 + 0 - -194 + 0;
        e.var2[41] = 0x60 ^ 0x4C ^ (0x74 ^ 0x4D);
        e.var2[42] = -(0xFFFFFF0D & 0x44FF) & (0xFFFFDFDE & 0x6FFD);
        e.var2[43] = 0x8E ^ 0x98;
        e.var2[44] = 0xFFFFAFC2 & 0x59BF;
        e.var2[45] = 0x70 ^ 0x4C ^ (0xAB ^ 0x80);
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    static {
        e.var14();
        e.var27();
        NONE = new GameEnum3(var2[0]);
        SHRIMP = new GameEnum3(var2[2]);
        CAKE = new GameEnum3(var2[4]);
        CHOCOLATE_CAKE = new GameEnum3(var2[6]);
        PLAIN_PIZZA = new GameEnum3(var2[8]);
        PINEAPPLE_PIZZA = new GameEnum3(var2[10]);
        WINE = new GameEnum3(var2[12]);
        BASS = new GameEnum3(var2[14]);
        TUNA = new GameEnum3(var2[16]);
        KARAMBWAN = new GameEnum3(var2[18]);
        LOBSTER = new GameEnum3(var2[20]);
        SWORDFISH = new GameEnum3(var2[22]);
        MONKFISH = new GameEnum3(var2[24]);
        SHARK = new GameEnum3(var2[26]);
        SEA_TURTLE = new GameEnum3(var2[28]);
        MANTA_RAY = new GameEnum3(var2[30]);
        ANGLERFISH = new GameEnum3(var2[32]);
        DARK_CRAB = new GameEnum3(var2[34]);
        SARA_BREW = new GameEnum3(var2[36]);
        ANCIENT_BREW = new GameEnum3(var2[38]);
        JANGERBERRIES = new GameEnum3(var2[40]);
        SUPER_RESTORE = new GameEnum3(var2[42]);
        PRAYER_POTION = new GameEnum3(var2[44]);
        e[] eArray = new e[var2[45]];
        eArray[e.var2[0]] = NONE;
        eArray[e.var2[1]] = SHRIMP;
        eArray[e.var2[3]] = CAKE;
        eArray[e.var2[5]] = CHOCOLATE_CAKE;
        eArray[e.var2[7]] = PLAIN_PIZZA;
        eArray[e.var2[9]] = PINEAPPLE_PIZZA;
        eArray[e.var2[11]] = WINE;
        eArray[e.var2[13]] = BASS;
        eArray[e.var2[15]] = TUNA;
        eArray[e.var2[17]] = KARAMBWAN;
        eArray[e.var2[19]] = LOBSTER;
        eArray[e.var2[21]] = SWORDFISH;
        eArray[e.var2[23]] = MONKFISH;
        eArray[e.var2[25]] = SHARK;
        eArray[e.var2[27]] = SEA_TURTLE;
        eArray[e.var2[29]] = MANTA_RAY;
        eArray[e.var2[31]] = ANGLERFISH;
        eArray[e.var2[33]] = DARK_CRAB;
        eArray[e.var2[35]] = SARA_BREW;
        eArray[e.var2[37]] = ANCIENT_BREW;
        eArray[e.var2[39]] = JANGERBERRIES;
        eArray[e.var2[41]] = SUPER_RESTORE;
        eArray[e.var2[43]] = PRAYER_POTION;
        $VALUES = eArray;
    }

    private static void var27() {
        var1 = new String[var2[45]];
        e.var1[e.var2[0]] = "NONE";
        e.var1[e.var2[1]] = "SHRIMP";
        e.var1[e.var2[3]] = "CAKE";
        e.var1[e.var2[5]] = "CHOCOLATE_CAKE";
        e.var1[e.var2[7]] = "PLAIN_PIZZA";
        e.var1[e.var2[9]] = "PINEAPPLE_PIZZA";
        e.var1[e.var2[11]] = "WINE";
        e.var1[e.var2[13]] = "BASS";
        e.var1[e.var2[15]] = "TUNA";
        e.var1[e.var2[17]] = "KARAMBWAN";
        e.var1[e.var2[19]] = "LOBSTER";
        e.var1[e.var2[21]] = "SWORDFISH";
        e.var1[e.var2[23]] = "MONKFISH";
        e.var1[e.var2[25]] = "SHARK";
        e.var1[e.var2[27]] = "SEA_TURTLE";
        e.var1[e.var2[29]] = "MANTA_RAY";
        e.var1[e.var2[31]] = "ANGLERFISH";
        e.var1[e.var2[33]] = "DARK_CRAB";
        e.var1[e.var2[35]] = "SARA_BREW";
        e.var1[e.var2[37]] = "ANCIENT_BREW";
        e.var1[e.var2[39]] = "JANGERBERRIES";
        e.var1[e.var2[41]] = "SUPER_RESTORE";
        e.var1[e.var2[43]] = "PRAYER_POTION";
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum3(int n3) {
        this.foodId = n3;
    }

    public int x() {
        return this.foodId;
    }
}

