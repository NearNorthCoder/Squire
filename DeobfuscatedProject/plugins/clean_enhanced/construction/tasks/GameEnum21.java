/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

import gg.squire.construction.tasks.GameEnum19;

public final class GameEnum21
extends Enum<aI> {
    private static  String[] llIIIlII;
    public static final  /* enum */ aI WATER_RUNE;
    private static  int[] llIIIlll;
    public static final  /* enum */ aI EARTH_RUNE;
    public static final  /* enum */ aI MIND_RUNE;
    private final  String itemName;
    private final  int id;
    public static final  /* enum */ aI AIR_RUNE;
    public static final  /* enum */ aI DEATH_RUNE;
    public static final  /* enum */ aI BODY_RUNE;
    private static final  aI[] $VALUES;
    public static final  /* enum */ aI FIRE_RUNE;
    public static final  /* enum */ aI COSMIC_RUNE;
    public static final  /* enum */ aI NATURE_RUNE;
    public static final  /* enum */ aI CHAOS_RUNE;
    public static final  /* enum */ aI LAW_RUNE;

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    public int P() {
        return this.id;
    }

    private static void var7() {
        llIIIlII = new String[llIIIlll[33]];
        aI.llIIIlII[aI.llIIIlll[0]] = "J =∳0J";
        aI.llIIIlII[aI.llIIIlll[1]] = "Air rune";
        aI.llIIIlII[aI.llIIIlll[3]] = "MIND_RUNE";
        aI.llIIIlII[aI.llIIIlll[4]] = "Mind rune";
        aI.llIIIlII[aI.llIIIlll[6]] = "WATER_RUNE";
        aI.llIIIlII[aI.llIIIlll[7]] = "Water rune";
        aI.llIIIlII[aI.llIIIlll[9]] = "EARTH_RUNE";
        aI.llIIIlII[aI.llIIIlll[10]] = "Earth rune";
        aI.llIIIlII[aI.llIIIlll[12]] = "FIRE_RUNE";
        aI.llIIIlII[aI.llIIIlll[13]] = "Fire rune";
        aI.llIIIlII[aI.llIIIlll[15]] = "BODY_RUNE";
        aI.llIIIlII[aI.llIIIlll[16]] = "Body rune";
        aI.llIIIlII[aI.llIIIlll[18]] = "COSMIC_RUNE";
        aI.llIIIlII[aI.llIIIlll[19]] = "Cosmic rune";
        aI.llIIIlII[aI.llIIIlll[21]] = "CHAOS_RUNE";
        aI.llIIIlII[aI.llIIIlll[22]] = "Chaos rune";
        aI.llIIIlII[aI.llIIIlll[24]] = "NATURE_RUNE";
        aI.llIIIlII[aI.llIIIlll[25]] = "Nature rune";
        aI.llIIIlII[aI.llIIIlll[27]] = "LAW_RUNE";
        aI.llIIIlII[aI.llIIIlll[28]] = "Law rune";
        aI.llIIIlII[aI.llIIIlll[30]] = "DEATH_RUNE";
        aI.llIIIlII[aI.llIIIlll[31]] = "Death rune";
    }

    private static String var8(String var9, String var10) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var12 = var10.toCharArray();
        int var13 = llIIIlll[0];
        char[] var14 = var9.toCharArray();
        int var15 = var14.length;
        int var16 = llIIIlll[0];
        while (aI.var17(var16, var15)) {
            char var18 = var14[var16];
            var11.append((char)(var18 ^ var12[var13 % var12.length]));
            0;
            ++var13;
            ++var16;
            0;
            if ((0x6E ^ 0x6A) > 2) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static void var19() {
        llIIIlll = new int[34];
        aI.llIIIlll[0] = (0x33 ^ 0xC ^ (0x61 ^ 0x65)) & (37 + 134 - 131 + 118 ^ 108 + 113 - 185 + 129 ^ -1);
        aI.llIIIlll[1] = 1;
        aI.llIIIlll[2] = -(0xFFFFBCF7 & 0x5F5A) & (0xFFFFDE7D & 0x3FFF);
        aI.llIIIlll[3] = 2;
        aI.llIIIlll[4] = 3;
        aI.llIIIlll[5] = -(0xFFFFEDD2 & Short.MAX_VALUE) & (0xFFFFFFFF & 0x6FFF);
        aI.llIIIlll[6] = 0x53 ^ 0x57;
        aI.llIIIlll[7] = 54 + 162 - 135 + 101 ^ 49 + 14 - 17 + 133;
        aI.llIIIlll[8] = -(0xFFFFFC71 & 0x3B9F) & (0xFFFFBBBB & 0x7E7F);
        aI.llIIIlll[9] = 0x95 ^ 0x93;
        aI.llIIIlll[10] = 108 + 124 - 166 + 109 ^ 35 + 34 - -85 + 14;
        aI.llIIIlll[11] = 0xFFFFB3BF & 0x4E6D;
        aI.llIIIlll[12] = 0x88 ^ 0xB3 ^ (0x57 ^ 0x64);
        aI.llIIIlll[13] = 0x78 ^ 0x74 ^ (0x83 ^ 0x86);
        aI.llIIIlll[14] = -(0xFFFF9DD5 & 0x67BF) & (0xFFFFA7FE & 0x5FBF);
        aI.llIIIlll[15] = 0xA5 ^ 0xAF;
        aI.llIIIlll[16] = 0xB ^ 0x6C ^ (0x37 ^ 0x5B);
        aI.llIIIlll[17] = 0xFFFFAE7F & 0x53AF;
        aI.llIIIlll[18] = 0x38 ^ 0x5C ^ (0xF1 ^ 0x99);
        aI.llIIIlll[19] = 0x74 ^ 0x4E ^ (0xBB ^ 0x8C);
        aI.llIIIlll[20] = 0xFFFFFBFE & 0x635;
        aI.llIIIlll[21] = 0x23 ^ 0x17 ^ (0x84 ^ 0xBE);
        aI.llIIIlll[22] = 118 + 92 - 79 + 43 ^ 151 + 5 - -2 + 3;
        aI.llIIIlll[23] = -(0xFFFFBFE6 & 0x6DDF) & (0xFFFFAFF7 & Short.MAX_VALUE);
        aI.llIIIlll[24] = 0xA9 ^ 0xA3 ^ (0x90 ^ 0x8A);
        aI.llIIIlll[25] = 91 + 34 - 86 + 148 ^ 86 + 3 - -60 + 21;
        aI.llIIIlll[26] = 0xFFFFFF7F & 0x2B1;
        aI.llIIIlll[27] = 0x22 ^ 0x78 ^ (0xDC ^ 0x94);
        aI.llIIIlll[28] = 8 ^ 0x1B;
        aI.llIIIlll[29] = 0xFFFFF7BB & 0xA77;
        aI.llIIIlll[30] = 37 + 74 - -8 + 18 ^ 97 + 87 - 123 + 96;
        aI.llIIIlll[31] = 6 ^ 0x13;
        aI.llIIIlll[32] = 0xFFFFB37A & 0x4EB5;
        aI.llIIIlll[33] = 141 + 71 - 14 + 13 ^ 124 + 83 - 141 + 131;
    }

    public static aI valueOf(String string) {
        return Enum.valueOf(GameEnum21.class, string);
    }

    private static boolean var17(int n2, int n3) {
        return n2 < n3;
    }

    public static aI[] values() {
        return (aI[])$VALUES.clone();
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private static boolean var26(int n2, int n3) {
        return n2 == n3;
    }

    private GameEnum21(String string2, int n3) {
        this.itemName = string2;
        this.id = n3;
    }

    public String N() {
        return this.itemName;
    }

    /*
     * WARNING - void declaration
     */
    public static aG x(int n2) {
        void var27;
        aG[] aGArray = aG.values();
        int n3 = aGArray.length;
        int var28 = llIIIlll[0];
        while (aI.var17(var28, (int)var27)) {
            int var29;
            void var30;
            void var31 = var30[var28];
            if (aI.var26(var31.P(), var29)) {
                return var31;
            }
            ++var28;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return null;
    }
}

