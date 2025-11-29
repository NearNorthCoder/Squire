/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.templetrekking.tasks;

public final class GameEnum
extends Enum<c> {
    public static final  /* enum */ c DARK_CRAB;
    public static final  /* enum */ c SHARK;
    public static final  /* enum */ c SEA_TURTLE;
    private static final  c[] $VALUES;
    public static final  /* enum */ c BASS;
    public static final  /* enum */ c SALMON;
    public static final  /* enum */ c TROUT;
    public static final  /* enum */ c SWORDFISH;
    public static final  /* enum */ c MONKFISH;
    public static final  /* enum */ c MANTA_RAY;
    public static final  /* enum */ c STEW;
    public static final  /* enum */ c PIKE;
    private final  int healAmount;
    public static final  /* enum */ c KARAMBWAN;
    
    public static final  /* enum */ c LOBSTER;
    public static final  /* enum */ c JUG_OF_WINE;
    public static final  /* enum */ c TUNA;
    private final  int itemId;

    private GameEnum(int n3, int n4) {
        this.itemId = n3;
        this.healAmount = n4;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public int v() {
        return this.healAmount;
    }

    private static void var15() {
        var2 = new int[36];
        c.var2[0] = (0x8C ^ 0xAD) & ~(0x6E ^ 0x4F);
        c.var2[1] = -(0xFFFFFE35 & 0x7FEB) & (0xFFFFFFEF & 0x7F7D);
        c.var2[2] = 0xA0 ^ 0xA7;
        c.var2[3] = 1;
        c.var2[4] = -(0xFFFFF9E7 & 0x7E39) & (0xFFFFFDFF & 0x7B7F);
        c.var2[5] = 124 + 27 - 83 + 119 ^ 127 + 144 - 134 + 42;
        c.var2[6] = 2;
        c.var2[7] = 0xFFFFD3FF & 0x2D49;
        c.var2[8] = 0xCA ^ 0xC3;
        c.var2[9] = 3;
        c.var2[10] = -(0xFFFFFE4D & 0x35B7) & (0xFFFFB5FF & 0x7F6D);
        c.var2[11] = 0x7E ^ 0x1A ^ (0xA9 ^ 0xC7);
        c.var2[12] = 0x28 ^ 0x2C;
        c.var2[13] = 0xFFFFD7FB & 0x2FD7;
        c.var2[14] = 0xD3 ^ 0xA3 ^ (0x60 ^ 0x1B);
        c.var2[15] = 0xEC ^ 0x89 ^ (0xD9 ^ 0xB9);
        c.var2[16] = 0xFFFFE7DF & 0x1FE9;
        c.var2[17] = 0x90 ^ 0xC2 ^ (0x3F ^ 0x6B);
        c.var2[18] = 0xFFFF997F & 0x67FB;
        c.var2[19] = 84 + 42 - -2 + 2 ^ 100 + 90 - 103 + 55;
        c.var2[20] = 0xFFFFAF7F & 0x51ED;
        c.var2[21] = 9 ^ 4;
        c.var2[22] = -(0xFFFFDD9D & 0x3AE3) & (0xFFFFB9F7 & 0x5FFD);
        c.var2[23] = 188 + 159 - 147 + 3 ^ 194 + 13 - 26 + 16;
        c.var2[24] = -(0xFFFFFDF7 & 0x42CA) & (0xFFFFDFEB & 0x7FDF);
        c.var2[25] = 0x93 ^ 0x83;
        c.var2[26] = -(0xFFFFEFFE & 0x7395) & (0xFFFFFFFB & 0x6FDF);
        c.var2[27] = 0x14 ^ 6;
        c.var2[28] = 0xFFFF8DD9 & 0x73A7;
        c.var2[29] = 0x2B ^ 0x3F;
        c.var2[30] = -(0xFFFFF6B3 & 0x197F) & (0xFFFFDDBF & 0x33FF);
        c.var2[31] = 79 + 77 - 103 + 100 ^ 9 + 72 - 24 + 83;
        c.var2[32] = 0xFFFF89FF & 0x7787;
        c.var2[33] = 0x5D ^ 0x19 ^ (0xB ^ 0x59);
        c.var2[34] = -(0xFFFFBD51 & 0x53FF) & (0xFFFFFFF3 & 0x3FFC);
        c.var2[35] = 0x7F ^ 0x70;
    }

    private static boolean var16(int n2, int n3) {
        return n2 < n3;
    }

    static {
        c.var15();
        c.var17();
        TROUT = new GameEnum(var2[1], var2[2]);
        PIKE = new GameEnum(var2[4], var2[5]);
        SALMON = new GameEnum(var2[7], var2[8]);
        TUNA = new GameEnum(var2[10], var2[11]);
        STEW = new GameEnum(var2[13], var2[14]);
        JUG_OF_WINE = new GameEnum(var2[16], var2[14]);
        LOBSTER = new GameEnum(var2[18], var2[19]);
        BASS = new GameEnum(var2[20], var2[21]);
        SWORDFISH = new GameEnum(var2[22], var2[23]);
        MONKFISH = new GameEnum(var2[24], var2[25]);
        KARAMBWAN = new GameEnum(var2[26], var2[27]);
        SHARK = new GameEnum(var2[28], var2[29]);
        SEA_TURTLE = new GameEnum(var2[30], var2[31]);
        MANTA_RAY = new GameEnum(var2[32], var2[33]);
        DARK_CRAB = new GameEnum(var2[34], var2[33]);
        c[] cArray = new c[var2[35]];
        cArray[c.var2[0]] = TROUT;
        cArray[c.var2[3]] = PIKE;
        cArray[c.var2[6]] = SALMON;
        cArray[c.var2[9]] = TUNA;
        cArray[c.var2[12]] = STEW;
        cArray[c.var2[15]] = JUG_OF_WINE;
        cArray[c.var2[17]] = LOBSTER;
        cArray[c.var2[2]] = BASS;
        cArray[c.var2[5]] = SWORDFISH;
        cArray[c.var2[8]] = MONKFISH;
        cArray[c.var2[11]] = KARAMBWAN;
        cArray[c.var2[14]] = SHARK;
        cArray[c.var2[19]] = SEA_TURTLE;
        cArray[c.var2[21]] = MANTA_RAY;
        cArray[c.var2[23]] = DARK_CRAB;
        $VALUES = cArray;
    }

    private static void var17() {
        var1 = new String[var2[35]];
        c.var1[c.var2[0]] = "TROUT";
        c.var1[c.var2[3]] = "PIKE";
        c.var1[c.var2[6]] = "SALMON";
        c.var1[c.var2[9]] = "TUNA";
        c.var1[c.var2[12]] = "STEW";
        c.var1[c.var2[15]] = "JUG_OF_WINE";
        c.var1[c.var2[17]] = "LOBSTER";
        c.var1[c.var2[2]] = "BASS";
        c.var1[c.var2[5]] = "SWORDFISH";
        c.var1[c.var2[8]] = "MONKFISH";
        c.var1[c.var2[11]] = "KARAMBWAN";
        c.var1[c.var2[14]] = "SHARK";
        c.var1[c.var2[19]] = "SEA_TURTLE";
        c.var1[c.var2[21]] = "MANTA_RAY";
        c.var1[c.var2[23]] = "DARK_CRAB";
    }

    public int u() {
        return this.itemId;
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var2[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var2[0];
        while (c.var16(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if ((0x9E ^ 0x9A) > 2) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }
}

