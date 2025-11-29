package r.e.o.r.h.s.b.e.q.l.e.u.p000.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.e  reason: invalid package */
/* loaded from: 5d6a9183-7b7a-42a1-8cad-f88f0a9fad3c.jar:r/e/o/r/h/s/b/e/q/l/e/u/-/i/r/e.class */
public final class e {
    public static final /* synthetic */ e SUPER_ENERGY;
    public static final /* synthetic */ e DIVINE_MAGIC_POTION;
    public static final /* synthetic */ e ENERGY_POTION;
    public static final /* synthetic */ e DIVINE_RANGE_POTION;
    private final /* synthetic */ Map<Integer, Integer> components;
    public static final /* synthetic */ e DIVINE_SUPER_ATTACK;
    private final /* synthetic */ boolean tickable;
    public static final /* synthetic */ e DIVINE_SUPER_COMBAT;
    public static final /* synthetic */ e PRAYER_POTION;
    public static final /* synthetic */ e SUPER_ATTACK;
    public static final /* synthetic */ e ATTACK_POTION;
    private static /* synthetic */ int[] lllIlIIlIlII;
    private final /* synthetic */ int level;
    public static final /* synthetic */ e AGILITY_POTION;
    private static final /* synthetic */ e[] $VALUES;
    public static final /* synthetic */ e SARADOMIN_BREW;
    public static final /* synthetic */ e DIVINE_SUPER_DEFENCE;
    public static final /* synthetic */ e STAMINA;
    public static final /* synthetic */ e SUPER_ANTI_POISON;
    public static final /* synthetic */ e SERUM_207;
    public static final /* synthetic */ e SUPER_DEFENCE;
    public static final /* synthetic */ e DIVINE_SUPER_STRENGTH;
    public static final /* synthetic */ e MAGIC_POTION;
    public static final /* synthetic */ e RANGING_POTION;
    public static final /* synthetic */ e ANCIENT_BREW;
    public static final /* synthetic */ e SUPER_RESTORE;
    public static final /* synthetic */ e SUPER_STRENGTH;
    public static final /* synthetic */ e STRENGTH_POTION;
    private static /* synthetic */ String[] lllIlIIlIIlI;
    public static final /* synthetic */ e COMPOST_POTION;
    public static final /* synthetic */ e ANTIFIRE_POTION;
    public static final /* synthetic */ e SUPER_COMBAT_POTION;
    public static final /* synthetic */ e ANTIPOISON;
    public static final /* synthetic */ e MENAPHITE_REMEDY;

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public Map<Integer, Integer> n() {
        return this.components;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    private e(String str, int i, Map map, int i2) {
        this.components = map;
        this.level = i2;
        this.tickable = lllIlIIlIlII[1];
    }

    private static String lIIIlIllllIIIII(String lllllllllllllllIIllIIIlllIllIlII, String lllllllllllllllIIllIIIlllIllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIlllIllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIIlllIllIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIIlllIllIllI.init(lllIlIIlIlII[7], secretKeySpec);
            return new String(lllllllllllllllIIllIIIlllIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIlllIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIlllIllIlIl) {
            lllllllllllllllIIllIIIlllIllIlIl.printStackTrace();
            return null;
        }
    }

    public static e a(b bVar) {
        e[] values = values();
        int length = values.length;
        int i = lllIlIIlIlII[1];
        while (lIIIlIllllIIlll(i, length)) {
            e eVar = values[i];
            if (lIIIlIllllIlIII(eVar.n().containsKey(Integer.valueOf(bVar.g())) ? 1 : 0)) {
                return eVar;
            }
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v117, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v87, types: [boolean] */
    static {
        lIIIlIllllIIllI();
        lIIIlIllllIIlIl();
        ATTACK_POTION = new e(lllIlIIlIIlI[lllIlIIlIlII[1]], lllIlIIlIlII[1], b.GUAM_LEAF, lllIlIIlIlII[2], lllIlIIlIlII[3]);
        ANTIPOISON = new e(lllIlIIlIIlI[lllIlIIlIlII[4]], lllIlIIlIlII[4], b.MARRENTILL, lllIlIIlIlII[5], lllIlIIlIlII[6]);
        STRENGTH_POTION = new e(lllIlIIlIIlI[lllIlIIlIlII[7]], lllIlIIlIlII[7], b.TARROMIN, lllIlIIlIlII[8], lllIlIIlIlII[9]);
        SERUM_207 = new e(lllIlIIlIIlI[lllIlIIlIlII[3]], lllIlIIlIlII[3], b.TARROMIN, lllIlIIlIlII[10], lllIlIIlIlII[11]);
        COMPOST_POTION = new e(lllIlIIlIIlI[lllIlIIlIlII[12]], lllIlIIlIlII[12], Map.of(Integer.valueOf(b.HARRALANDER.g()), Integer.valueOf(lllIlIIlIlII[13]), Integer.valueOf(lllIlIIlIlII[14]), Integer.valueOf(lllIlIIlIlII[15])), lllIlIIlIlII[16]);
        ENERGY_POTION = new e(lllIlIIlIIlI[lllIlIIlIlII[6]], lllIlIIlIlII[6], b.HARRALANDER, lllIlIIlIlII[17], lllIlIIlIlII[18]);
        AGILITY_POTION = new e(lllIlIIlIIlI[lllIlIIlIlII[19]], lllIlIIlIlII[19], b.TOADFLAX, lllIlIIlIlII[20], lllIlIIlIlII[21]);
        PRAYER_POTION = new e(lllIlIIlIIlI[lllIlIIlIlII[22]], lllIlIIlIlII[22], b.RANARR_WEED, lllIlIIlIlII[23], lllIlIIlIlII[24]);
        SUPER_ATTACK = new e(lllIlIIlIIlI[lllIlIIlIlII[25]], lllIlIIlIlII[25], b.IRIT_LEAF, lllIlIIlIlII[2], lllIlIIlIlII[26]);
        SUPER_ANTI_POISON = new e(lllIlIIlIIlI[lllIlIIlIlII[27]], lllIlIIlIlII[27], b.IRIT_LEAF, lllIlIIlIlII[5], lllIlIIlIlII[28]);
        SUPER_ENERGY = new e(lllIlIIlIIlI[lllIlIIlIlII[29]], lllIlIIlIlII[29], b.AVANTOE, lllIlIIlIlII[30], lllIlIIlIlII[31]);
        SUPER_STRENGTH = new e(lllIlIIlIIlI[lllIlIIlIlII[32]], lllIlIIlIlII[32], b.KWUARM, lllIlIIlIlII[8], lllIlIIlIlII[33]);
        SUPER_RESTORE = new e(lllIlIIlIIlI[lllIlIIlIlII[9]], lllIlIIlIlII[9], b.SNAPDRAGON, lllIlIIlIlII[34], lllIlIIlIlII[35]);
        SUPER_DEFENCE = new e(lllIlIIlIIlI[lllIlIIlIlII[36]], lllIlIIlIlII[36], b.CADANTINE, lllIlIIlIlII[37], lllIlIIlIlII[38]);
        DIVINE_SUPER_ATTACK = new e(lllIlIIlIIlI[lllIlIIlIlII[0]], lllIlIIlIlII[0], Map.of(Integer.valueOf(lllIlIIlIlII[39]), Integer.valueOf(lllIlIIlIlII[15]), Integer.valueOf(lllIlIIlIlII[40]), Integer.valueOf(lllIlIIlIlII[13])), lllIlIIlIlII[41], (boolean) lllIlIIlIlII[4]);
        DIVINE_SUPER_STRENGTH = new e(lllIlIIlIIlI[lllIlIIlIlII[11]], lllIlIIlIlII[11], Map.of(Integer.valueOf(lllIlIIlIlII[39]), Integer.valueOf(lllIlIIlIlII[15]), Integer.valueOf(lllIlIIlIlII[42]), Integer.valueOf(lllIlIIlIlII[13])), lllIlIIlIlII[41], (boolean) lllIlIIlIlII[4]);
        DIVINE_SUPER_DEFENCE = new e(lllIlIIlIIlI[lllIlIIlIlII[43]], lllIlIIlIlII[43], Map.of(Integer.valueOf(lllIlIIlIlII[39]), Integer.valueOf(lllIlIIlIlII[15]), Integer.valueOf(lllIlIIlIlII[44]), Integer.valueOf(lllIlIIlIlII[13])), lllIlIIlIlII[41], (boolean) lllIlIIlIlII[4]);
        ANTIFIRE_POTION = new e(lllIlIIlIIlI[lllIlIIlIlII[45]], lllIlIIlIlII[45], b.LANTADYME, lllIlIIlIlII[46], lllIlIIlIlII[47]);
        RANGING_POTION = new e(lllIlIIlIIlI[lllIlIIlIlII[48]], lllIlIIlIlII[48], b.DWARF_WEED, lllIlIIlIlII[49], lllIlIIlIlII[50]);
        DIVINE_RANGE_POTION = new e(lllIlIIlIIlI[lllIlIIlIlII[51]], lllIlIIlIlII[51], Map.of(Integer.valueOf(lllIlIIlIlII[39]), Integer.valueOf(lllIlIIlIlII[15]), Integer.valueOf(lllIlIIlIlII[52]), Integer.valueOf(lllIlIIlIlII[13])), lllIlIIlIlII[53], (boolean) lllIlIIlIlII[4]);
        MAGIC_POTION = new e(lllIlIIlIIlI[lllIlIIlIlII[54]], lllIlIIlIlII[54], b.LANTADYME, lllIlIIlIlII[55], lllIlIIlIlII[56]);
        DIVINE_MAGIC_POTION = new e(lllIlIIlIIlI[lllIlIIlIlII[57]], lllIlIIlIlII[57], Map.of(Integer.valueOf(lllIlIIlIlII[39]), Integer.valueOf(lllIlIIlIlII[15]), Integer.valueOf(lllIlIIlIlII[58]), Integer.valueOf(lllIlIIlIlII[13])), lllIlIIlIlII[59], (boolean) lllIlIIlIlII[4]);
        STAMINA = new e(lllIlIIlIIlI[lllIlIIlIlII[16]], lllIlIIlIlII[16], Map.of(Integer.valueOf(lllIlIIlIlII[60]), Integer.valueOf(lllIlIIlIlII[15]), Integer.valueOf(lllIlIIlIlII[61]), Integer.valueOf(lllIlIIlIlII[13])), lllIlIIlIlII[62]);
        SARADOMIN_BREW = new e(lllIlIIlIIlI[lllIlIIlIlII[63]], lllIlIIlIlII[63], b.TOADFLAX, lllIlIIlIlII[64], lllIlIIlIlII[65]);
        ANCIENT_BREW = new e(lllIlIIlIIlI[lllIlIIlIlII[66]], lllIlIIlIlII[66], Map.of(Integer.valueOf(lllIlIIlIlII[67]), Integer.valueOf(lllIlIIlIlII[15]), Integer.valueOf(lllIlIIlIlII[68]), Integer.valueOf(lllIlIIlIlII[13])), lllIlIIlIlII[69], (boolean) lllIlIIlIlII[4]);
        MENAPHITE_REMEDY = new e(lllIlIIlIIlI[lllIlIIlIlII[70]], lllIlIIlIlII[70], b.DWARF_WEED, lllIlIIlIlII[71], lllIlIIlIlII[72]);
        SUPER_COMBAT_POTION = new e(lllIlIIlIIlI[lllIlIIlIlII[18]], lllIlIIlIlII[18], Map.of(Integer.valueOf(lllIlIIlIlII[73]), Integer.valueOf(lllIlIIlIlII[22]), Integer.valueOf(lllIlIIlIlII[40]), Integer.valueOf(lllIlIIlIlII[22]), Integer.valueOf(lllIlIIlIlII[42]), Integer.valueOf(lllIlIIlIlII[22]), Integer.valueOf(lllIlIIlIlII[44]), Integer.valueOf(lllIlIIlIlII[22])), lllIlIIlIlII[74]);
        DIVINE_SUPER_COMBAT = new e(lllIlIIlIIlI[lllIlIIlIlII[13]], lllIlIIlIlII[13], Map.of(Integer.valueOf(lllIlIIlIlII[39]), Integer.valueOf(lllIlIIlIlII[15]), Integer.valueOf(lllIlIIlIlII[75]), Integer.valueOf(lllIlIIlIlII[13])), lllIlIIlIlII[76], (boolean) lllIlIIlIlII[4]);
        e[] eVarArr = new e[lllIlIIlIlII[77]];
        eVarArr[lllIlIIlIlII[1]] = ATTACK_POTION;
        eVarArr[lllIlIIlIlII[4]] = ANTIPOISON;
        eVarArr[lllIlIIlIlII[7]] = STRENGTH_POTION;
        eVarArr[lllIlIIlIlII[3]] = SERUM_207;
        eVarArr[lllIlIIlIlII[12]] = COMPOST_POTION;
        eVarArr[lllIlIIlIlII[6]] = ENERGY_POTION;
        eVarArr[lllIlIIlIlII[19]] = AGILITY_POTION;
        eVarArr[lllIlIIlIlII[22]] = PRAYER_POTION;
        eVarArr[lllIlIIlIlII[25]] = SUPER_ATTACK;
        eVarArr[lllIlIIlIlII[27]] = SUPER_ANTI_POISON;
        eVarArr[lllIlIIlIlII[29]] = SUPER_ENERGY;
        eVarArr[lllIlIIlIlII[32]] = SUPER_STRENGTH;
        eVarArr[lllIlIIlIlII[9]] = SUPER_RESTORE;
        eVarArr[lllIlIIlIlII[36]] = SUPER_DEFENCE;
        eVarArr[lllIlIIlIlII[0]] = DIVINE_SUPER_ATTACK;
        eVarArr[lllIlIIlIlII[11]] = DIVINE_SUPER_STRENGTH;
        eVarArr[lllIlIIlIlII[43]] = DIVINE_SUPER_DEFENCE;
        eVarArr[lllIlIIlIlII[45]] = ANTIFIRE_POTION;
        eVarArr[lllIlIIlIlII[48]] = RANGING_POTION;
        eVarArr[lllIlIIlIlII[51]] = DIVINE_RANGE_POTION;
        eVarArr[lllIlIIlIlII[54]] = MAGIC_POTION;
        eVarArr[lllIlIIlIlII[57]] = DIVINE_MAGIC_POTION;
        eVarArr[lllIlIIlIlII[16]] = STAMINA;
        eVarArr[lllIlIIlIlII[63]] = SARADOMIN_BREW;
        eVarArr[lllIlIIlIlII[66]] = ANCIENT_BREW;
        eVarArr[lllIlIIlIlII[70]] = MENAPHITE_REMEDY;
        eVarArr[lllIlIIlIlII[18]] = SUPER_COMBAT_POTION;
        eVarArr[lllIlIIlIlII[13]] = DIVINE_SUPER_COMBAT;
        $VALUES = eVarArr;
    }

    private static void lIIIlIllllIIllI() {
        lllIlIIlIlII = new int[78];
        lllIlIIlIlII[0] = 202 ^ 196;
        lllIlIIlIlII[1] = "   ".length() & ("   ".length() ^ (-1));
        lllIlIIlIlII[2] = (((((66 + 61) - 114) + 122) + (219 ^ 144)) - (((48 + 152) - 114) + 68)) + ((159 + 10) - 158) + 154;
        lllIlIIlIlII[3] = "   ".length();
        lllIlIIlIlII[4] = " ".length();
        lllIlIIlIlII[5] = ((10 + 158) - (-36)) + 31;
        lllIlIIlIlII[6] = 49 ^ 52;
        lllIlIIlIlII[7] = "  ".length();
        lllIlIIlIlII[8] = (((190 ^ 141) + (146 ^ 163)) - (-(95 ^ 60))) + (25 ^ 3);
        lllIlIIlIlII[9] = (11 ^ 23) ^ (160 ^ 176);
        lllIlIIlIlII[10] = (-((-16903) & 32310)) & (-16385) & 32383;
        lllIlIIlIlII[11] = (31 ^ 71) ^ (8 ^ 95);
        lllIlIIlIlII[12] = (((87 + 124) - 118) + 62) ^ (((16 + 47) - (-50)) + 46);
        lllIlIIlIlII[13] = (((146 + 183) - 279) + 171) ^ (((167 + 181) - 309) + 159);
        lllIlIIlIlII[14] = (-2314) & 23935;
        lllIlIIlIlII[15] = 37 ^ 64;
        lllIlIIlIlII[16] = 168 ^ 190;
        lllIlIIlIlII[17] = (-((-8853) & 25301)) & (-10241) & 28663;
        lllIlIIlIlII[18] = 70 ^ 92;
        lllIlIIlIlII[19] = 17 ^ 23;
        lllIlIIlIlII[20] = (-4866) & 7017;
        lllIlIIlIlII[21] = 8 ^ 42;
        lllIlIIlIlII[22] = 113 ^ 118;
        lllIlIIlIlII[23] = (((((159 + 106) - 78) + 18) + (84 ^ 61)) - ((-12877) & 13183)) + ((62 + 180) - 183) + 169;
        lllIlIIlIlII[24] = 52 ^ 18;
        lllIlIIlIlII[25] = (219 ^ 190) ^ (198 ^ 171);
        lllIlIIlIlII[26] = 64 ^ 109;
        lllIlIIlIlII[27] = 59 ^ 50;
        lllIlIIlIlII[28] = (10 ^ 41) ^ (69 ^ 86);
        lllIlIIlIlII[29] = 16 ^ 26;
        lllIlIIlIlII[30] = (-((-11409) & 31925)) & (-2) & 23487;
        lllIlIIlIlII[31] = 112 ^ 68;
        lllIlIIlIlII[32] = (((10 + 74) - 39) + 159) ^ (((36 + 135) - (-4)) + 24);
        lllIlIIlIlII[33] = 26 ^ 45;
        lllIlIIlIlII[34] = (((9 ^ 92) + (54 ^ 107)) - (96 ^ 2)) + ((117 + 21) - 2) + 7;
        lllIlIIlIlII[35] = (52 ^ 29) ^ (68 ^ 82);
        lllIlIIlIlII[36] = (((16 + 47) - 2) + 78) ^ (((116 + 121) - 228) + 125);
        lllIlIIlIlII[37] = ((236 + 25) - 241) + 219;
        lllIlIIlIlII[38] = 31 ^ 93;
        lllIlIIlIlII[39] = (-((-29705) & 30284)) & (-33) & 24575;
        lllIlIIlIlII[40] = (-((-21894) & 30207)) & (-4097) & 14845;
        lllIlIIlIlII[41] = (((181 + 67) - 146) + 102) ^ (((29 + 131) - 104) + 82);
        lllIlIIlIlII[42] = (-5635) & 8074;
        lllIlIIlIlII[43] = 2 ^ 18;
        lllIlIIlIlII[44] = (-21574) & 24015;
        lllIlIIlIlII[45] = 151 ^ 134;
        lllIlIIlIlII[46] = ((80 + 73) - 75) + 163;
        lllIlIIlIlII[47] = (212 ^ 141) ^ (54 ^ 42);
        lllIlIIlIlII[48] = (((141 + 137) - 229) + 102) ^ (((76 + 30) - 46) + 73);
        lllIlIIlIlII[49] = ((207 + 66) - 238) + 210;
        lllIlIIlIlII[50] = 91 ^ 19;
        lllIlIIlIlII[51] = (((157 + 6) - 9) + 15) ^ (((52 + 123) - 28) + 39);
        lllIlIIlIlII[52] = (-4724) & 7167;
        lllIlIIlIlII[53] = (((195 + 32) - 114) + 139) ^ (((107 + 84) - 170) + 161);
        lllIlIIlIlII[54] = 91 ^ 79;
        lllIlIIlIlII[55] = (-8465) & 11602;
        lllIlIIlIlII[56] = 207 ^ 131;
        lllIlIIlIlII[57] = (((79 + 34) - 4) + 38) ^ (((101 + 77) - 88) + 44);
        lllIlIIlIlII[58] = (-((-866) & 30591)) & (-1) & 32765;
        lllIlIIlIlII[59] = 240 ^ 190;
        lllIlIIlIlII[60] = (-17426) & 30065;
        lllIlIIlIlII[61] = (-4148) & 7163;
        lllIlIIlIlII[62] = 209 ^ 156;
        lllIlIIlIlII[63] = 115 ^ 100;
        lllIlIIlIlII[64] = (-((-16931) & 26619)) & (-3) & 16383;
        lllIlIIlIlII[65] = 114 ^ 35;
        lllIlIIlIlII[66] = (7 ^ 114) ^ (174 ^ 195);
        lllIlIIlIlII[67] = (-(222 ^ 137)) & (-2) & 26455;
        lllIlIIlIlII[68] = 65 ^ 44;
        lllIlIIlIlII[69] = (((2 + 64) - (-115)) + 24) ^ (((140 + 150) - 184) + 46);
        lllIlIIlIlII[70] = 112 ^ 105;
        lllIlIIlIlII[71] = (-((-25414) & 30567)) & (-67) & 32491;
        lllIlIIlIlII[72] = (64 ^ 91) ^ (73 ^ 10);
        lllIlIIlIlII[73] = (-129) & 397;
        lllIlIIlIlII[74] = 223 ^ 133;
        lllIlIIlIlII[75] = (-3081) & 15775;
        lllIlIIlIlII[76] = (60 ^ 83) ^ (46 ^ 35);
        lllIlIIlIlII[77] = (((134 + 118) - 97) + 1) ^ (((11 + 38) - (-3)) + 76);
    }

    public boolean m() {
        return this.tickable;
    }

    private static String lIIIlIllllIIlII(String lllllllllllllllIIllIIIlllIllllll, String lllllllllllllllIIllIIIllllIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIllllIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIllllIIIIII.getBytes(StandardCharsets.UTF_8)), lllIlIIlIlII[25]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlIIlIlII[7], lllllllllllllllIIllIIIllllIIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIlllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIllllIIIIlI) {
            lllllllllllllllIIllIIIllllIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIllllIIlll(int i, int i2) {
        return i < i2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    private static boolean lIIIlIllllIlIII(int i) {
        return i != 0;
    }

    public int l() {
        return this.level;
    }

    private e(String str, int i, Map map, int i2, boolean z) {
        this.components = map;
        this.level = i2;
        this.tickable = z;
    }

    private static String lIIIlIllllIIIlI(String lllllllllllllllIIllIIIlllIlIIlII, String lllllllllllllllIIllIIIlllIlIIIll) {
        String lllllllllllllllIIllIIIlllIlIIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIIlllIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIIlllIlIIIlI = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIIIlllIlIIIll.toCharArray();
        int lllllllllllllllIIllIIIlllIlIIIII = lllIlIIlIlII[1];
        char[] charArray2 = lllllllllllllllIIllIIIlllIlIIlII2.toCharArray();
        int length = charArray2.length;
        int i = lllIlIIlIlII[1];
        while (lIIIlIllllIIlll(i, length)) {
            lllllllllllllllIIllIIIlllIlIIIlI.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIllIIIlllIlIIIII % charArray.length]));
            "".length();
            lllllllllllllllIIllIIIlllIlIIIII++;
            i++;
            "".length();
            if ((-((((118 + 109) - 157) + 108) ^ (((54 + 66) - 73) + 135))) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIIIlllIlIIIlI);
    }

    private static void lIIIlIllllIIlIl() {
        lllIlIIlIIlI = new String[lllIlIIlIlII[77]];
        lllIlIIlIIlI[lllIlIIlIlII[1]] = lIIIlIllllIIIII("DGG+0JvVgaW9Y+nc+9hfKA==", "DRRIA");
        lllIlIIlIIlI[lllIlIIlIlII[4]] = lIIIlIllllIIIlI("NgUSJCk4AhUiNw==", "wKFmy");
        lllIlIIlIIlI[lllIlIIlIlII[7]] = lIIIlIllllIIIII("KBV5bstLThxAFp8BifPclw==", "PdlDI");
        lllIlIIlIIlI[lllIlIIlIlII[3]] = lIIIlIllllIIIII("4pFwzj8IlDPtmeVA7tujig==", "tTOux");
        lllIlIIlIIlI[lllIlIIlIlII[12]] = lIIIlIllllIIIlI("NgkvNjsmEj02OyEPLSg=", "uFbft");
        lllIlIIlIIlI[lllIlIIlIlII[6]] = lIIIlIllllIIlII("DZ+lVRRdVKl0uUFCnKA/nA==", "NTkvj");
        lllIlIIlIIlI[lllIlIIlIlII[19]] = lIIIlIllllIIIII("/1vaVUVXKPjzZzsQsucDvg==", "lArFA");
        lllIlIIlIIlI[lllIlIIlIlII[22]] = lIIIlIllllIIIII("LbWCVks7hrYnkTD3YYBo6Q==", "VkMtp");
        lllIlIIlIIlI[lllIlIIlIlII[25]] = lIIIlIllllIIIII("yubmtyWYfHBLY9IKiT4Y1g==", "ZSkBO");
        lllIlIIlIIlI[lllIlIIlIlII[27]] = lIIIlIllllIIIlI("GTMHDRkVJxkcAhU2GAEYBSg=", "JfWHK");
        lllIlIIlIIlI[lllIlIIlIlII[29]] = lIIIlIllllIIIII("LipQjccjanSM0vbOterwdw==", "ixVRE");
        lllIlIIlIIlI[lllIlIIlIlII[32]] = lIIIlIllllIIIII("D1Fa/ojaNFu4/U7+5LfZdw==", "HSmmY");
        lllIlIIlIIlI[lllIlIIlIlII[9]] = lIIIlIllllIIlII("1DQZ6O9rdqU41tqgcuE4ow==", "oxgaw");
        lllIlIIlIIlI[lllIlIIlIlII[36]] = lIIIlIllllIIIII("1UTGJVgCK1UYzQvzKCJ9TQ==", "DNuWk");
        lllIlIIlIIlI[lllIlIIlIlII[0]] = lIIIlIllllIIIlI("NCwcAgE1OhkeHzU3FQobJCQJAA==", "peJKO");
        lllIlIIlIIlI[lllIlIIlIlII[11]] = lIIIlIllllIIlII("Zr5WaNOnloNk8L7Pe/tG07wtDCfbFzZm", "mdIuV");
        lllIlIIlIIlI[lllIlIIlIlII[43]] = lIIIlIllllIIlII("xDcC2mFbrzyaiLNvFqYrp09GiPBTBkmQ", "gkNxv");
        lllIlIIlIIlI[lllIlIIlIlII[45]] = lIIIlIllllIIIlI("CTw6HiIBICsINAcmJxgq", "HrnWd");
        lllIlIIlIIlI[lllIlIIlIlII[48]] = lIIIlIllllIIIII("e15P+3iMvRWa0PijjmDMbg==", "asPuR");
        lllIlIIlIIlI[lllIlIIlIlII[51]] = lIIIlIllllIIlII("ivatd9kecHFNhS1aNV5Fsqs/O0O8t5ES", "bzNIc");
        lllIlIIlIIlI[lllIlIIlIlII[54]] = lIIIlIllllIIIlI("DggoLi4cGSAzJAwH", "CIogm");
        lllIlIIlIIlI[lllIlIIlIlII[57]] = lIIIlIllllIIIlI("JS4ACAokOBsAAygkCRELNS4ZDw==", "agVAD");
        lllIlIIlIIlI[lllIlIIlIlII[16]] = lIIIlIllllIIIII("KFmaNTLGL5A=", "DyfDR");
        lllIlIIlIIlI[lllIlIIlIlII[63]] = lIIIlIllllIIIII("wjkvtqXA/HkaLnWMd5Bl7Q==", "mpysF");
        lllIlIIlIIlI[lllIlIIlIlII[66]] = lIIIlIllllIIIlI("DCAqGRYDOjYSAQg5", "MniPS");
        lllIlIIlIIlI[lllIlIIlIlII[70]] = lIIIlIllllIIlII("vEQoj+zNORja8ba8w3KSaKC+8ontEDQg", "ZyBai");
        lllIlIIlIIlI[lllIlIIlIlII[18]] = lIIIlIllllIIIII("yymT4Tsl6KFFVVaDAkh+qUB8BU+HIhCc", "xXIAo");
        lllIlIIlIIlI[lllIlIIlIlII[13]] = lIIIlIllllIIIII("L5gMsPbDXeOEismd7glJETXY6KMpZUlv", "gzicN");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    private e(String str, int i, b bVar, int i2, int i3) {
        this.level = i3;
        this.components = new HashMap();
        this.components.put(Integer.valueOf(bVar.g()), Integer.valueOf(lllIlIIlIlII[0]));
        "".length();
        this.components.put(Integer.valueOf(i2), Integer.valueOf(lllIlIIlIlII[0]));
        "".length();
        this.tickable = lllIlIIlIlII[1];
    }
}
