/*
 * Decompiled with CFR 0.152.
 */
package r.e.o.r.h.s.b.e.q.l.e.u.-.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.HerbType;

public final class PotionType
extends Enum<e> {
    public static final /* synthetic */ /* enum */ e SUPER_ENERGY;
    public static final /* synthetic */ /* enum */ e DIVINE_MAGIC_POTION;
    public static final /* synthetic */ /* enum */ e ENERGY_POTION;
    public static final /* synthetic */ /* enum */ e DIVINE_RANGE_POTION;
    private final /* synthetic */ Map<Integer, Integer> components;
    public static final /* synthetic */ /* enum */ e DIVINE_SUPER_ATTACK;
    private final /* synthetic */ boolean tickable;
    public static final /* synthetic */ /* enum */ e DIVINE_SUPER_COMBAT;
    public static final /* synthetic */ /* enum */ e PRAYER_POTION;
    public static final /* synthetic */ /* enum */ e SUPER_ATTACK;
    public static final /* synthetic */ /* enum */ e ATTACK_POTION;
    private static /* synthetic */ int[] lllIlIIlIlII;
    private final /* synthetic */ int level;
    public static final /* synthetic */ /* enum */ e AGILITY_POTION;
    private static final /* synthetic */ e[] $VALUES;
    public static final /* synthetic */ /* enum */ e SARADOMIN_BREW;
    public static final /* synthetic */ /* enum */ e DIVINE_SUPER_DEFENCE;
    public static final /* synthetic */ /* enum */ e STAMINA;
    public static final /* synthetic */ /* enum */ e SUPER_ANTI_POISON;
    public static final /* synthetic */ /* enum */ e SERUM_207;
    public static final /* synthetic */ /* enum */ e SUPER_DEFENCE;
    public static final /* synthetic */ /* enum */ e DIVINE_SUPER_STRENGTH;
    public static final /* synthetic */ /* enum */ e MAGIC_POTION;
    public static final /* synthetic */ /* enum */ e RANGING_POTION;
    public static final /* synthetic */ /* enum */ e ANCIENT_BREW;
    public static final /* synthetic */ /* enum */ e SUPER_RESTORE;
    public static final /* synthetic */ /* enum */ e SUPER_STRENGTH;
    public static final /* synthetic */ /* enum */ e STRENGTH_POTION;
    private static /* synthetic */ String[] lllIlIIlIIlI;
    public static final /* synthetic */ /* enum */ e COMPOST_POTION;
    public static final /* synthetic */ /* enum */ e ANTIFIRE_POTION;
    public static final /* synthetic */ /* enum */ e SUPER_COMBAT_POTION;
    public static final /* synthetic */ /* enum */ e ANTIPOISON;
    public static final /* synthetic */ /* enum */ e MENAPHITE_REMEDY;

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    public Map<Integer, Integer> n() {
        return this.components;
    }

    private e(Map<Integer, Integer> map, int n2) {
        this.components = map;
        this.level = n2;
        this.tickable = lllIlIIlIlII[1];
    }

    private static String lIIIlIllllIIIII(String var10, String var21) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lllIlIIlIlII[7], var19);
            return new String(var4.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static e a(b b2) {
        void var11;
        e[] eArray = e.values();
        int n = eArray.length;
        int var14 = lllIlIIlIlII[1];
        while (e.lIIIlIllllIIlll(var14, (int)var11)) {
            b var22;
            void var7;
            void var17 = var7[var14];
            if (e.lIIIlIllllIlIII(var17.n().containsKey(var22.g()) ? 1 : 0)) {
                return var17;
            }
            ++var14;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return null;
    }

    static {
        e.lIIIlIllllIIllI();
        e.lIIIlIllllIIlIl();
        ATTACK_POTION = new e(b.GUAM_LEAF, lllIlIIlIlII[2], lllIlIIlIlII[3]);
        ANTIPOISON = new e(b.MARRENTILL, lllIlIIlIlII[5], lllIlIIlIlII[6]);
        STRENGTH_POTION = new e(b.TARROMIN, lllIlIIlIlII[8], lllIlIIlIlII[9]);
        SERUM_207 = new e(b.TARROMIN, lllIlIIlIlII[10], lllIlIIlIlII[11]);
        COMPOST_POTION = new e(Map.of(b.HARRALANDER.g(), lllIlIIlIlII[13], lllIlIIlIlII[14], lllIlIIlIlII[15]), lllIlIIlIlII[16]);
        ENERGY_POTION = new e(b.HARRALANDER, lllIlIIlIlII[17], lllIlIIlIlII[18]);
        AGILITY_POTION = new e(b.TOADFLAX, lllIlIIlIlII[20], lllIlIIlIlII[21]);
        PRAYER_POTION = new e(b.RANARR_WEED, lllIlIIlIlII[23], lllIlIIlIlII[24]);
        SUPER_ATTACK = new e(b.IRIT_LEAF, lllIlIIlIlII[2], lllIlIIlIlII[26]);
        SUPER_ANTI_POISON = new e(b.IRIT_LEAF, lllIlIIlIlII[5], lllIlIIlIlII[28]);
        SUPER_ENERGY = new e(b.AVANTOE, lllIlIIlIlII[30], lllIlIIlIlII[31]);
        SUPER_STRENGTH = new e(b.KWUARM, lllIlIIlIlII[8], lllIlIIlIlII[33]);
        SUPER_RESTORE = new e(b.SNAPDRAGON, lllIlIIlIlII[34], lllIlIIlIlII[35]);
        SUPER_DEFENCE = new e(b.CADANTINE, lllIlIIlIlII[37], lllIlIIlIlII[38]);
        DIVINE_SUPER_ATTACK = new e(Map.of(lllIlIIlIlII[39], lllIlIIlIlII[15], lllIlIIlIlII[40], lllIlIIlIlII[13]), lllIlIIlIlII[41], lllIlIIlIlII[4]);
        DIVINE_SUPER_STRENGTH = new e(Map.of(lllIlIIlIlII[39], lllIlIIlIlII[15], lllIlIIlIlII[42], lllIlIIlIlII[13]), lllIlIIlIlII[41], lllIlIIlIlII[4]);
        DIVINE_SUPER_DEFENCE = new e(Map.of(lllIlIIlIlII[39], lllIlIIlIlII[15], lllIlIIlIlII[44], lllIlIIlIlII[13]), lllIlIIlIlII[41], lllIlIIlIlII[4]);
        ANTIFIRE_POTION = new e(b.LANTADYME, lllIlIIlIlII[46], lllIlIIlIlII[47]);
        RANGING_POTION = new e(b.DWARF_WEED, lllIlIIlIlII[49], lllIlIIlIlII[50]);
        DIVINE_RANGE_POTION = new e(Map.of(lllIlIIlIlII[39], lllIlIIlIlII[15], lllIlIIlIlII[52], lllIlIIlIlII[13]), lllIlIIlIlII[53], lllIlIIlIlII[4]);
        MAGIC_POTION = new e(b.LANTADYME, lllIlIIlIlII[55], lllIlIIlIlII[56]);
        DIVINE_MAGIC_POTION = new e(Map.of(lllIlIIlIlII[39], lllIlIIlIlII[15], lllIlIIlIlII[58], lllIlIIlIlII[13]), lllIlIIlIlII[59], lllIlIIlIlII[4]);
        STAMINA = new e(Map.of(lllIlIIlIlII[60], lllIlIIlIlII[15], lllIlIIlIlII[61], lllIlIIlIlII[13]), lllIlIIlIlII[62]);
        SARADOMIN_BREW = new e(b.TOADFLAX, lllIlIIlIlII[64], lllIlIIlIlII[65]);
        ANCIENT_BREW = new e(Map.of(lllIlIIlIlII[67], lllIlIIlIlII[15], lllIlIIlIlII[68], lllIlIIlIlII[13]), lllIlIIlIlII[69], lllIlIIlIlII[4]);
        MENAPHITE_REMEDY = new e(b.DWARF_WEED, lllIlIIlIlII[71], lllIlIIlIlII[72]);
        SUPER_COMBAT_POTION = new e(Map.of(lllIlIIlIlII[73], lllIlIIlIlII[22], lllIlIIlIlII[40], lllIlIIlIlII[22], lllIlIIlIlII[42], lllIlIIlIlII[22], lllIlIIlIlII[44], lllIlIIlIlII[22]), lllIlIIlIlII[74]);
        DIVINE_SUPER_COMBAT = new e(Map.of(lllIlIIlIlII[39], lllIlIIlIlII[15], lllIlIIlIlII[75], lllIlIIlIlII[13]), lllIlIIlIlII[76], lllIlIIlIlII[4]);
        e[] eArray = new e[lllIlIIlIlII[77]];
        eArray[e.lllIlIIlIlII[1]] = ATTACK_POTION;
        eArray[e.lllIlIIlIlII[4]] = ANTIPOISON;
        eArray[e.lllIlIIlIlII[7]] = STRENGTH_POTION;
        eArray[e.lllIlIIlIlII[3]] = SERUM_207;
        eArray[e.lllIlIIlIlII[12]] = COMPOST_POTION;
        eArray[e.lllIlIIlIlII[6]] = ENERGY_POTION;
        eArray[e.lllIlIIlIlII[19]] = AGILITY_POTION;
        eArray[e.lllIlIIlIlII[22]] = PRAYER_POTION;
        eArray[e.lllIlIIlIlII[25]] = SUPER_ATTACK;
        eArray[e.lllIlIIlIlII[27]] = SUPER_ANTI_POISON;
        eArray[e.lllIlIIlIlII[29]] = SUPER_ENERGY;
        eArray[e.lllIlIIlIlII[32]] = SUPER_STRENGTH;
        eArray[e.lllIlIIlIlII[9]] = SUPER_RESTORE;
        eArray[e.lllIlIIlIlII[36]] = SUPER_DEFENCE;
        eArray[e.lllIlIIlIlII[0]] = DIVINE_SUPER_ATTACK;
        eArray[e.lllIlIIlIlII[11]] = DIVINE_SUPER_STRENGTH;
        eArray[e.lllIlIIlIlII[43]] = DIVINE_SUPER_DEFENCE;
        eArray[e.lllIlIIlIlII[45]] = ANTIFIRE_POTION;
        eArray[e.lllIlIIlIlII[48]] = RANGING_POTION;
        eArray[e.lllIlIIlIlII[51]] = DIVINE_RANGE_POTION;
        eArray[e.lllIlIIlIlII[54]] = MAGIC_POTION;
        eArray[e.lllIlIIlIlII[57]] = DIVINE_MAGIC_POTION;
        eArray[e.lllIlIIlIlII[16]] = STAMINA;
        eArray[e.lllIlIIlIlII[63]] = SARADOMIN_BREW;
        eArray[e.lllIlIIlIlII[66]] = ANCIENT_BREW;
        eArray[e.lllIlIIlIlII[70]] = MENAPHITE_REMEDY;
        eArray[e.lllIlIIlIlII[18]] = SUPER_COMBAT_POTION;
        eArray[e.lllIlIIlIlII[13]] = DIVINE_SUPER_COMBAT;
        $VALUES = eArray;
    }

    private static void lIIIlIllllIIllI() {
        lllIlIIlIlII = new int[78];
        e.lllIlIIlIlII[0] = 0xCA ^ 0xC4;
        e.lllIlIIlIlII[1] = 3 & ~3;
        e.lllIlIIlIlII[2] = 66 + 61 - 114 + 122 + (0xDB ^ 0x90) - (48 + 152 - 114 + 68) + (159 + 10 - 158 + 154);
        e.lllIlIIlIlII[3] = 3;
        e.lllIlIIlIlII[4] = 1;
        e.lllIlIIlIlII[5] = 10 + 158 - -36 + 31;
        e.lllIlIIlIlII[6] = 0x31 ^ 0x34;
        e.lllIlIIlIlII[7] = 2;
        e.lllIlIIlIlII[8] = (0xBE ^ 0x8D) + (0x92 ^ 0xA3) - -(0x5F ^ 0x3C) + (0x19 ^ 3);
        e.lllIlIIlIlII[9] = 0xB ^ 0x17 ^ (0xA0 ^ 0xB0);
        e.lllIlIIlIlII[10] = -(0xFFFFBDF9 & 0x7E36) & (0xFFFFBFFF & 0x7E7F);
        e.lllIlIIlIlII[11] = 0x1F ^ 0x47 ^ (8 ^ 0x5F);
        e.lllIlIIlIlII[12] = 87 + 124 - 118 + 62 ^ 16 + 47 - -50 + 46;
        e.lllIlIIlIlII[13] = 146 + 183 - 279 + 171 ^ 167 + 181 - 309 + 159;
        e.lllIlIIlIlII[14] = 0xFFFFF6F6 & 0x5D7F;
        e.lllIlIIlIlII[15] = 0x25 ^ 0x40;
        e.lllIlIIlIlII[16] = 0xA8 ^ 0xBE;
        e.lllIlIIlIlII[17] = -(0xFFFFDD6B & 0x62D5) & (0xFFFFD7FF & 0x6FF7);
        e.lllIlIIlIlII[18] = 0x46 ^ 0x5C;
        e.lllIlIIlIlII[19] = 0x11 ^ 0x17;
        e.lllIlIIlIlII[20] = 0xFFFFECFE & 0x1B69;
        e.lllIlIIlIlII[21] = 8 ^ 0x2A;
        e.lllIlIIlIlII[22] = 0x71 ^ 0x76;
        e.lllIlIIlIlII[23] = 159 + 106 - 78 + 18 + (0x54 ^ 0x3D) - (0xFFFFCDB3 & 0x337F) + (62 + 180 - 183 + 169);
        e.lllIlIIlIlII[24] = 0x34 ^ 0x12;
        e.lllIlIIlIlII[25] = 0xDB ^ 0xBE ^ (0xC6 ^ 0xAB);
        e.lllIlIIlIlII[26] = 0x40 ^ 0x6D;
        e.lllIlIIlIlII[27] = 0x3B ^ 0x32;
        e.lllIlIIlIlII[28] = 0xA ^ 0x29 ^ (0x45 ^ 0x56);
        e.lllIlIIlIlII[29] = 0x10 ^ 0x1A;
        e.lllIlIIlIlII[30] = -(0xFFFFD36F & 0x7CB5) & (0xFFFFFFFE & 0x5BBF);
        e.lllIlIIlIlII[31] = 0x70 ^ 0x44;
        e.lllIlIIlIlII[32] = 10 + 74 - 39 + 159 ^ 36 + 135 - -4 + 24;
        e.lllIlIIlIlII[33] = 0x1A ^ 0x2D;
        e.lllIlIIlIlII[34] = (9 ^ 0x5C) + (0x36 ^ 0x6B) - (0x60 ^ 2) + (117 + 21 - 2 + 7);
        e.lllIlIIlIlII[35] = 0x34 ^ 0x1D ^ (0x44 ^ 0x52);
        e.lllIlIIlIlII[36] = 16 + 47 - 2 + 78 ^ 116 + 121 - 228 + 125;
        e.lllIlIIlIlII[37] = 236 + 25 - 241 + 219;
        e.lllIlIIlIlII[38] = 0x1F ^ 0x5D;
        e.lllIlIIlIlII[39] = -(0xFFFF8BF7 & 0x764C) & (0xFFFFFFDF & 0x5FFF);
        e.lllIlIIlIlII[40] = -(0xFFFFAA7A & 0x75FF) & (0xFFFFEFFF & 0x39FD);
        e.lllIlIIlIlII[41] = 181 + 67 - 146 + 102 ^ 29 + 131 - 104 + 82;
        e.lllIlIIlIlII[42] = 0xFFFFE9FD & 0x1F8A;
        e.lllIlIIlIlII[43] = 2 ^ 0x12;
        e.lllIlIIlIlII[44] = 0xFFFFABBA & 0x5DCF;
        e.lllIlIIlIlII[45] = 0x97 ^ 0x86;
        e.lllIlIIlIlII[46] = 80 + 73 - 75 + 163;
        e.lllIlIIlIlII[47] = 0xD4 ^ 0x8D ^ (0x36 ^ 0x2A);
        e.lllIlIIlIlII[48] = 141 + 137 - 229 + 102 ^ 76 + 30 - 46 + 73;
        e.lllIlIIlIlII[49] = 207 + 66 - 238 + 210;
        e.lllIlIIlIlII[50] = 0x5B ^ 0x13;
        e.lllIlIIlIlII[51] = 157 + 6 - 9 + 15 ^ 52 + 123 - 28 + 39;
        e.lllIlIIlIlII[52] = 0xFFFFED8C & 0x1BFF;
        e.lllIlIIlIlII[53] = 195 + 32 - 114 + 139 ^ 107 + 84 - 170 + 161;
        e.lllIlIIlIlII[54] = 0x5B ^ 0x4F;
        e.lllIlIIlIlII[55] = 0xFFFFDEEF & 0x2D52;
        e.lllIlIIlIlII[56] = 0xCF ^ 0x83;
        e.lllIlIIlIlII[57] = 79 + 34 - 4 + 38 ^ 101 + 77 - 88 + 44;
        e.lllIlIIlIlII[58] = -(0xFFFFFC9E & 0x777F) & (0xFFFFFFFF & 0x7FFD);
        e.lllIlIIlIlII[59] = 0xF0 ^ 0xBE;
        e.lllIlIIlIlII[60] = 0xFFFFBBEE & 0x7571;
        e.lllIlIIlIlII[61] = 0xFFFFEFCC & 0x1BFB;
        e.lllIlIIlIlII[62] = 0xD1 ^ 0x9C;
        e.lllIlIIlIlII[63] = 0x73 ^ 0x64;
        e.lllIlIIlIlII[64] = -(0xFFFFBDDD & 0x67FB) & (0xFFFFFFFD & 0x3FFF);
        e.lllIlIIlIlII[65] = 0x72 ^ 0x23;
        e.lllIlIIlIlII[66] = 7 ^ 0x72 ^ (0xAE ^ 0xC3);
        e.lllIlIIlIlII[67] = -(0xDE ^ 0x89) & (0xFFFFFFFE & 0x6757);
        e.lllIlIIlIlII[68] = 0x41 ^ 0x2C;
        e.lllIlIIlIlII[69] = 2 + 64 - -115 + 24 ^ 140 + 150 - 184 + 46;
        e.lllIlIIlIlII[70] = 0x70 ^ 0x69;
        e.lllIlIIlIlII[71] = -(0xFFFF9CBA & 0x7767) & (0xFFFFFFBD & 0x7EEB);
        e.lllIlIIlIlII[72] = 0x40 ^ 0x5B ^ (0x49 ^ 0xA);
        e.lllIlIIlIlII[73] = 0xFFFFFF7F & 0x18D;
        e.lllIlIIlIlII[74] = 0xDF ^ 0x85;
        e.lllIlIIlIlII[75] = 0xFFFFF3F7 & 0x3D9F;
        e.lllIlIIlIlII[76] = 0x3C ^ 0x53 ^ (0x2E ^ 0x23);
        e.lllIlIIlIlII[77] = 134 + 118 - 97 + 1 ^ 11 + 38 - -3 + 76;
    }

    public boolean m() {
        return this.tickable;
    }

    private static String lIIIlIllllIIlII(String var3, String var12) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lllIlIIlIlII[25]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lllIlIIlIlII[7], var1);
            return new String(var8.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIllllIIlll(int n, int n2) {
        return n < n2;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private static boolean lIIIlIllllIlIII(int n) {
        return n != 0;
    }

    public int l() {
        return this.level;
    }

    private e(Map<Integer, Integer> map, int n2, boolean bl) {
        this.components = map;
        this.level = n2;
        this.tickable = bl;
    }

    private static String lIIIlIllllIIIlI(String var24, String var2) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var13 = var2.toCharArray();
        int var6 = lllIlIIlIlII[1];
        char[] var23 = var24.toCharArray();
        int var5 = var23.length;
        int var18 = lllIlIIlIlII[1];
        while (e.lIIIlIllllIIlll(var18, var5)) {
            char var16 = var23[var18];
            var20.append((char)(var16 ^ var13[var6 % var13.length]));
            0;
            ++var6;
            ++var18;
            0;
            if (-(118 + 109 - 157 + 108 ^ 54 + 66 - 73 + 135) < 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static void lIIIlIllllIIlIl() {
        lllIlIIlIIlI = new String[lllIlIIlIlII[77]];
        e.lllIlIIlIIlI[e.lllIlIIlIlII[1]] = e."ATTACK_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[4]] = e."ANTIPOISON";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[7]] = e."STRENGTH_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[3]] = e."SERUM_207";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[12]] = e."COMPOST_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[6]] = e."ENERGY_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[19]] = e."AGILITY_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[22]] = e."PRAYER_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[25]] = e."SUPER_ATTACK";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[27]] = e."SUPER_ANTI_POISON";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[29]] = e."SUPER_ENERGY";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[32]] = e."SUPER_STRENGTH";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[9]] = e."SUPER_RESTORE";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[36]] = e."SUPER_DEFENCE";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[0]] = e."DIVINE_SUPER_ATTACK";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[11]] = e."DIVINE_SUPER_STRENGTH";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[43]] = e."DIVINE_SUPER_DEFENCE";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[45]] = e."ANTIFIRE_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[48]] = e."RANGING_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[51]] = e."DIVINE_RANGE_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[54]] = e."MAGIC_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[57]] = e."DIVINE_MAGIC_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[16]] = e."STAMINA";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[63]] = e."SARADOMIN_BREW";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[66]] = e."ANCIENT_BREW";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[70]] = e."MENAPHITE_REMEDY";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[18]] = e."SUPER_COMBAT_POTION";
        e.lllIlIIlIIlI[e.lllIlIIlIlII[13]] = e."DIVINE_SUPER_COMBAT";
    }

    private e(b b2, int n2, int n3) {
        this.level = n3;
        this.components = new HashMap<Integer, Integer>();
        this.components.put(b2.g(), lllIlIIlIlII[0]);
        0;
        this.components.put(n2, lllIlIIlIlII[0]);
        0;
        this.tickable = lllIlIIlIlII[1];
    }
}

