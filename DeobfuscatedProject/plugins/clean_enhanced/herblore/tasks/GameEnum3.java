/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.herblore.tasks;

import java.util.HashMap;
import java.util.Map;
import gg.squire.herblore.tasks.GameEnum;

public final class GameEnum3
extends Enum<e> {
    public static final  /* enum */ e SUPER_ENERGY;
    public static final  /* enum */ e DIVINE_MAGIC_POTION;
    public static final  /* enum */ e ENERGY_POTION;
    public static final  /* enum */ e DIVINE_RANGE_POTION;
    private final  Map<Integer, Integer> components;
    public static final  /* enum */ e DIVINE_SUPER_ATTACK;
    private final  boolean tickable;
    public static final  /* enum */ e DIVINE_SUPER_COMBAT;
    public static final  /* enum */ e PRAYER_POTION;
    public static final  /* enum */ e SUPER_ATTACK;
    public static final  /* enum */ e ATTACK_POTION;
    
    private final  int level;
    public static final  /* enum */ e AGILITY_POTION;
    private static final  e[] $VALUES;
    public static final  /* enum */ e SARADOMIN_BREW;
    public static final  /* enum */ e DIVINE_SUPER_DEFENCE;
    public static final  /* enum */ e STAMINA;
    public static final  /* enum */ e SUPER_ANTI_POISON;
    public static final  /* enum */ e SERUM_207;
    public static final  /* enum */ e SUPER_DEFENCE;
    public static final  /* enum */ e DIVINE_SUPER_STRENGTH;
    public static final  /* enum */ e MAGIC_POTION;
    public static final  /* enum */ e RANGING_POTION;
    public static final  /* enum */ e ANCIENT_BREW;
    public static final  /* enum */ e SUPER_RESTORE;
    public static final  /* enum */ e SUPER_STRENGTH;
    public static final  /* enum */ e STRENGTH_POTION;
    
    public static final  /* enum */ e COMPOST_POTION;
    public static final  /* enum */ e ANTIFIRE_POTION;
    public static final  /* enum */ e SUPER_COMBAT_POTION;
    public static final  /* enum */ e ANTIPOISON;
    public static final  /* enum */ e MENAPHITE_REMEDY;

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    public Map<Integer, Integer> n() {
        return this.components;
    }

    private GameEnum3(Map<Integer, Integer> map, int n2) {
        this.components = map;
        this.level = n2;
        this.tickable = var1[1];
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static e a(b b2) {
        void var9;
        e[] eArray = e.values();
        int n = eArray.length;
        int var10 = var1[1];
        while (e.var11(var10, (int)var9)) {
            b var12;
            void var13;
            void var14 = var13[var10];
            if (e.var15(var14.n().containsKey(var12.g()) ? 1 : 0)) {
                return var14;
            }
            ++var10;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return null;
    }

    private static void var16() {
        var1 = new int[78];
        e.var1[0] = 0xCA ^ 0xC4;
        e.var1[1] = 3 & ~3;
        e.var1[2] = 66 + 61 - 114 + 122 + (0xDB ^ 0x90) - (48 + 152 - 114 + 68) + (159 + 10 - 158 + 154);
        e.var1[3] = 3;
        e.var1[4] = 1;
        e.var1[5] = 10 + 158 - -36 + 31;
        e.var1[6] = 0x31 ^ 0x34;
        e.var1[7] = 2;
        e.var1[8] = (0xBE ^ 0x8D) + (0x92 ^ 0xA3) - -(0x5F ^ 0x3C) + (0x19 ^ 3);
        e.var1[9] = 0xB ^ 0x17 ^ (0xA0 ^ 0xB0);
        e.var1[10] = -(0xFFFFBDF9 & 0x7E36) & (0xFFFFBFFF & 0x7E7F);
        e.var1[11] = 0x1F ^ 0x47 ^ (8 ^ 0x5F);
        e.var1[12] = 87 + 124 - 118 + 62 ^ 16 + 47 - -50 + 46;
        e.var1[13] = 146 + 183 - 279 + 171 ^ 167 + 181 - 309 + 159;
        e.var1[14] = 0xFFFFF6F6 & 0x5D7F;
        e.var1[15] = 0x25 ^ 0x40;
        e.var1[16] = 0xA8 ^ 0xBE;
        e.var1[17] = -(0xFFFFDD6B & 0x62D5) & (0xFFFFD7FF & 0x6FF7);
        e.var1[18] = 0x46 ^ 0x5C;
        e.var1[19] = 0x11 ^ 0x17;
        e.var1[20] = 0xFFFFECFE & 0x1B69;
        e.var1[21] = 8 ^ 0x2A;
        e.var1[22] = 0x71 ^ 0x76;
        e.var1[23] = 159 + 106 - 78 + 18 + (0x54 ^ 0x3D) - (0xFFFFCDB3 & 0x337F) + (62 + 180 - 183 + 169);
        e.var1[24] = 0x34 ^ 0x12;
        e.var1[25] = 0xDB ^ 0xBE ^ (0xC6 ^ 0xAB);
        e.var1[26] = 0x40 ^ 0x6D;
        e.var1[27] = 0x3B ^ 0x32;
        e.var1[28] = 0xA ^ 0x29 ^ (0x45 ^ 0x56);
        e.var1[29] = 0x10 ^ 0x1A;
        e.var1[30] = -(0xFFFFD36F & 0x7CB5) & (0xFFFFFFFE & 0x5BBF);
        e.var1[31] = 0x70 ^ 0x44;
        e.var1[32] = 10 + 74 - 39 + 159 ^ 36 + 135 - -4 + 24;
        e.var1[33] = 0x1A ^ 0x2D;
        e.var1[34] = (9 ^ 0x5C) + (0x36 ^ 0x6B) - (0x60 ^ 2) + (117 + 21 - 2 + 7);
        e.var1[35] = 0x34 ^ 0x1D ^ (0x44 ^ 0x52);
        e.var1[36] = 16 + 47 - 2 + 78 ^ 116 + 121 - 228 + 125;
        e.var1[37] = 236 + 25 - 241 + 219;
        e.var1[38] = 0x1F ^ 0x5D;
        e.var1[39] = -(0xFFFF8BF7 & 0x764C) & (0xFFFFFFDF & 0x5FFF);
        e.var1[40] = -(0xFFFFAA7A & 0x75FF) & (0xFFFFEFFF & 0x39FD);
        e.var1[41] = 181 + 67 - 146 + 102 ^ 29 + 131 - 104 + 82;
        e.var1[42] = 0xFFFFE9FD & 0x1F8A;
        e.var1[43] = 2 ^ 0x12;
        e.var1[44] = 0xFFFFABBA & 0x5DCF;
        e.var1[45] = 0x97 ^ 0x86;
        e.var1[46] = 80 + 73 - 75 + 163;
        e.var1[47] = 0xD4 ^ 0x8D ^ (0x36 ^ 0x2A);
        e.var1[48] = 141 + 137 - 229 + 102 ^ 76 + 30 - 46 + 73;
        e.var1[49] = 207 + 66 - 238 + 210;
        e.var1[50] = 0x5B ^ 0x13;
        e.var1[51] = 157 + 6 - 9 + 15 ^ 52 + 123 - 28 + 39;
        e.var1[52] = 0xFFFFED8C & 0x1BFF;
        e.var1[53] = 195 + 32 - 114 + 139 ^ 107 + 84 - 170 + 161;
        e.var1[54] = 0x5B ^ 0x4F;
        e.var1[55] = 0xFFFFDEEF & 0x2D52;
        e.var1[56] = 0xCF ^ 0x83;
        e.var1[57] = 79 + 34 - 4 + 38 ^ 101 + 77 - 88 + 44;
        e.var1[58] = -(0xFFFFFC9E & 0x777F) & (0xFFFFFFFF & 0x7FFD);
        e.var1[59] = 0xF0 ^ 0xBE;
        e.var1[60] = 0xFFFFBBEE & 0x7571;
        e.var1[61] = 0xFFFFEFCC & 0x1BFB;
        e.var1[62] = 0xD1 ^ 0x9C;
        e.var1[63] = 0x73 ^ 0x64;
        e.var1[64] = -(0xFFFFBDDD & 0x67FB) & (0xFFFFFFFD & 0x3FFF);
        e.var1[65] = 0x72 ^ 0x23;
        e.var1[66] = 7 ^ 0x72 ^ (0xAE ^ 0xC3);
        e.var1[67] = -(0xDE ^ 0x89) & (0xFFFFFFFE & 0x6757);
        e.var1[68] = 0x41 ^ 0x2C;
        e.var1[69] = 2 + 64 - -115 + 24 ^ 140 + 150 - 184 + 46;
        e.var1[70] = 0x70 ^ 0x69;
        e.var1[71] = -(0xFFFF9CBA & 0x7767) & (0xFFFFFFBD & 0x7EEB);
        e.var1[72] = 0x40 ^ 0x5B ^ (0x49 ^ 0xA);
        e.var1[73] = 0xFFFFFF7F & 0x18D;
        e.var1[74] = 0xDF ^ 0x85;
        e.var1[75] = 0xFFFFF3F7 & 0x3D9F;
        e.var1[76] = 0x3C ^ 0x53 ^ (0x2E ^ 0x23);
        e.var1[77] = 134 + 118 - 97 + 1 ^ 11 + 38 - -3 + 76;
    }

    public boolean m() {
        return this.tickable;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n, int n2) {
        return n < n2;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    private static boolean var15(int n) {
        return n != 0;
    }

    public int l() {
        return this.level;
    }

    private GameEnum3(Map<Integer, Integer> map, int n2, boolean bl) {
        this.components = map;
        this.level = n2;
        this.tickable = bl;
    }

    private static String var24(String var25, String var26) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var28 = var26.toCharArray();
        int var29 = var1[1];
        char[] var30 = var25.toCharArray();
        int var31 = var30.length;
        int var32 = var1[1];
        while (e.var11(var32, var31)) {
            char var33 = var30[var32];
            var27.append((char)(var33 ^ var28[var29 % var28.length]));
            0;
            ++var29;
            ++var32;
            0;
            if (-(118 + 109 - 157 + 108 ^ 54 + 66 - 73 + 135) < 0) continue;
            return null;
        }
        return String.valueOf(var27);
    }

    private static void var17() {
        var2 = new String[var1[77]];
        e.var2[e.var1[1]] = "ATTACK_POTION";
        e.var2[e.var1[4]] = "ANTIPOISON";
        e.var2[e.var1[7]] = "STRENGTH_POTION";
        e.var2[e.var1[3]] = "SERUM_207";
        e.var2[e.var1[12]] = "COMPOST_POTION";
        e.var2[e.var1[6]] = "ENERGY_POTION";
        e.var2[e.var1[19]] = "AGILITY_POTION";
        e.var2[e.var1[22]] = "PRAYER_POTION";
        e.var2[e.var1[25]] = "SUPER_ATTACK";
        e.var2[e.var1[27]] = "SUPER_ANTI_POISON";
        e.var2[e.var1[29]] = "SUPER_ENERGY";
        e.var2[e.var1[32]] = "SUPER_STRENGTH";
        e.var2[e.var1[9]] = "SUPER_RESTORE";
        e.var2[e.var1[36]] = "SUPER_DEFENCE";
        e.var2[e.var1[0]] = "DIVINE_SUPER_ATTACK";
        e.var2[e.var1[11]] = "DIVINE_SUPER_STRENGTH";
        e.var2[e.var1[43]] = "DIVINE_SUPER_DEFENCE";
        e.var2[e.var1[45]] = "ANTIFIRE_POTION";
        e.var2[e.var1[48]] = "RANGING_POTION";
        e.var2[e.var1[51]] = "DIVINE_RANGE_POTION";
        e.var2[e.var1[54]] = "MAGIC_POTION";
        e.var2[e.var1[57]] = "DIVINE_MAGIC_POTION";
        e.var2[e.var1[16]] = "STAMINA";
        e.var2[e.var1[63]] = "SARADOMIN_BREW";
        e.var2[e.var1[66]] = "ANCIENT_BREW";
        e.var2[e.var1[70]] = "MENAPHITE_REMEDY";
        e.var2[e.var1[18]] = "SUPER_COMBAT_POTION";
        e.var2[e.var1[13]] = "DIVINE_SUPER_COMBAT";
    }

    private GameEnum3(b b2, int n2, int n3) {
        this.level = n3;
        this.components = new HashMap<Integer, Integer>();
        this.components.put(b2.g(), var1[0]);
        0;
        this.components.put(n2, var1[0]);
        0;
        this.tickable = var1[1];
    }
}

