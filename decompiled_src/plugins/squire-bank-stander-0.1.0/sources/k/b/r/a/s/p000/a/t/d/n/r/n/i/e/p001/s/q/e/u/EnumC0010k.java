package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.k  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/k.class */
public final class EnumC0010k {
    public static final /* synthetic */ EnumC0010k JADE_AMULET;
    public static final /* synthetic */ EnumC0010k RUBY_RING;
    public static final /* synthetic */ EnumC0010k JADE_BRACELET;
    public static final /* synthetic */ EnumC0010k TOPAZ_NECKLACE;
    public static final /* synthetic */ EnumC0010k SAPPHIRE_RING;
    private static /* synthetic */ int[] lllIIIlllll;
    public static final /* synthetic */ EnumC0010k DIAMOND_BRACELET;
    public static final /* synthetic */ EnumC0010k SAPPHIRE_NECKLACE;
    public static final /* synthetic */ EnumC0010k DIAMOND_NECKLACE;
    public static final /* synthetic */ EnumC0010k OPAL_AMULET;
    public static final /* synthetic */ EnumC0010k DIAMOND_AMULET;
    public static final /* synthetic */ EnumC0010k TOPAZ_AMULET;
    public static final /* synthetic */ EnumC0010k OPAL_RING;
    private final /* synthetic */ int finishedID;
    public static final /* synthetic */ EnumC0010k EMERALD_RING;
    private static /* synthetic */ String[] lllIIIllllI;
    private final /* synthetic */ Spell spell;
    public static final /* synthetic */ EnumC0010k EMERALD_AMULET;
    public static final /* synthetic */ EnumC0010k DIAMOND_RING;
    public static final /* synthetic */ EnumC0010k OPAL_NECKLACE;
    public static final /* synthetic */ EnumC0010k EMERALD_BRACELET;
    private static final /* synthetic */ EnumC0010k[] $VALUES;
    public static final /* synthetic */ EnumC0010k RUBY_AMULET;
    public static final /* synthetic */ EnumC0010k JADE_NECKLACE;
    private final /* synthetic */ int materialID;
    public static final /* synthetic */ EnumC0010k RUBY_NECKLACE;
    public static final /* synthetic */ EnumC0010k TOPAZ_RING;
    public static final /* synthetic */ EnumC0010k RUBY_BRACELET;
    public static final /* synthetic */ EnumC0010k SAPPHIRE_AMULET;
    public static final /* synthetic */ EnumC0010k JADE_RING;
    public static final /* synthetic */ EnumC0010k SAPPHIRE_BRACELET;
    public static final /* synthetic */ EnumC0010k TOPAZ_BRACELET;
    public static final /* synthetic */ EnumC0010k OPAL_BRACELET;
    public static final /* synthetic */ EnumC0010k EMERALD_NECKLACE;

    private static String lIlIllIlIlllll(String llllllllllllllllIIlIlIIIllllIlll, String llllllllllllllllIIlIlIIIllllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIllllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIIIlllllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIIIlllllIIl.init(lllIIIlllll[6], secretKeySpec);
            return new String(llllllllllllllllIIlIlIIIlllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIIlllllIII) {
            llllllllllllllllIIlIlIIIlllllIII.printStackTrace();
            return null;
        }
    }

    public int z() {
        return this.materialID;
    }

    public static EnumC0010k valueOf(String str) {
        return (EnumC0010k) Enum.valueOf(EnumC0010k.class, str);
    }

    public Spell F() {
        return this.spell;
    }

    private static void lIlIllIllIIIlI() {
        lllIIIlllll = new int[85];
        lllIIIlllll[0] = (121 ^ 56) & ((255 ^ 190) ^ (-1));
        lllIIIlllll[1] = (-24833) & 26469;
        lllIIIlllll[2] = (-((-6357) & 30942)) & (-4097) & 31231;
        lllIIIlllll[3] = " ".length();
        lllIIIlllll[4] = (-((-3479) & 23959)) & (-1217) & 32767;
        lllIIIlllll[5] = (-((-25185) & 29301)) & (-16385) & 31574;
        lllIIIlllll[6] = "  ".length();
        lllIIIlllll[7] = (-24710) & 26365;
        lllIIIlllll[8] = (-8307) & 12159;
        lllIIIlllll[9] = "   ".length();
        lllIIIlllll[10] = (-16418) & 18111;
        lllIIIlllll[11] = (-((-2657) & 14945)) & (-18497) & 32511;
        lllIIIlllll[12] = (136 ^ 164) ^ (105 ^ 65);
        lllIIIlllll[13] = (-3367) & 24447;
        lllIIIlllll[14] = (-((-5121) & 15737)) & (-1026) & 32767;
        lllIIIlllll[15] = (((146 + 102) - 228) + 143) ^ (((165 + 140) - 281) + 142);
        lllIIIlllll[16] = (-1) & 21117;
        lllIIIlllll[17] = (-11269) & 32445;
        lllIIIlllll[18] = (((110 + 3) - 73) + 101) ^ (((74 + 32) - 64) + 97);
        lllIIIlllll[19] = (-((-18951) & 27551)) & (-3074) & 32763;
        lllIIIlllll[20] = (-((-5763) & 6123)) & (-9217) & 30719;
        lllIIIlllll[21] = 147 ^ 148;
        lllIIIlllll[22] = (-11395) & 32502;
        lllIIIlllll[23] = (-((-675) & 4067)) & (-8213) & 32764;
        lllIIIlllll[24] = (((59 + 88) - 83) + 64) ^ (((24 + 106) - 38) + 44);
        lllIIIlllll[25] = (-((-12807) & 15119)) & (-12417) & 16367;
        lllIIIlllll[26] = (-29189) & 31740;
        lllIIIlllll[27] = 129 ^ 136;
        lllIIIlllll[28] = (-6401) & 8058;
        lllIIIlllll[29] = (-26729) & 32249;
        lllIIIlllll[30] = (((87 + 144) - 103) + 47) ^ (((78 + 32) - 89) + 144);
        lllIIIlllll[31] = (-1059) & 12134;
        lllIIIlllll[32] = (-((-5573) & 21973)) & (-1057) & 28535;
        lllIIIlllll[33] = (189 ^ 161) ^ (0 ^ 23);
        lllIIIlllll[34] = (-((-5379) & 23903)) & (-4098) & 24317;
        lllIIIlllll[35] = (-((-25799) & 32223)) & (-16421) & 24573;
        lllIIIlllll[36] = 79 ^ 67;
        lllIIIlllll[37] = (-3460) & 24543;
        lllIIIlllll[38] = (-323) & 21451;
        lllIIIlllll[39] = (113 ^ 37) ^ (64 ^ 25);
        lllIIIlllll[40] = (-((-20739) & 32058)) & (-1) & 32439;
        lllIIIlllll[41] = (-8257) & 29436;
        lllIIIlllll[42] = (63 ^ 97) ^ (20 ^ 68);
        lllIIIlllll[43] = (-8321) & 29413;
        lllIIIlllll[44] = (-3362) & 24507;
        lllIIIlllll[45] = (((71 + 144) - 63) + 36) ^ (((133 + 14) - 103) + 135);
        lllIIIlllll[46] = (-((-28705) & 31137)) & (-9225) & 32767;
        lllIIIlllll[47] = (-3077) & 24239;
        lllIIIlllll[48] = (((60 + 39) - (-77)) + 13) ^ (((49 + 48) - 63) + 139);
        lllIIIlllll[49] = (-30983) & 32623;
        lllIIIlllll[50] = (-25601) & 28168;
        lllIIIlllll[51] = 162 ^ 179;
        lllIIIlllll[52] = (-" ".length()) & (-28674) & 30333;
        lllIIIlllll[53] = (-1089) & 12282;
        lllIIIlllll[54] = (41 ^ 53) ^ (83 ^ 93);
        lllIIIlllll[55] = (-16433) & 27517;
        lllIIIlllll[56] = (-17418) & 28505;
        lllIIIlllll[57] = (((55 + 115) - 131) + 108) ^ (((46 + 66) - 32) + 48);
        lllIIIlllll[58] = (-24837) & 26534;
        lllIIIlllll[59] = (-((-27429) & 31527)) & (-2305) & 8127;
        lllIIIlllll[60] = (((107 + 51) - 151) + 148) ^ (((113 + 99) - 173) + 104);
        lllIIIlllll[61] = (-10401) & 31487;
        lllIIIlllll[62] = (-1066) & 22205;
        lllIIIlllll[63] = 214 ^ 195;
        lllIIIlllll[64] = (-((-20481) & 30077)) & (-2049) & 32767;
        lllIIIlllll[65] = (-10561) & 31743;
        lllIIIlllll[66] = (57 ^ 12) ^ (32 ^ 3);
        lllIIIlllll[67] = (-((-9766) & 10167)) & (-3) & 21499;
        lllIIIlllll[68] = (-10521) & 31677;
        lllIIIlllll[69] = (107 ^ 55) ^ (106 ^ 33);
        lllIIIlllll[70] = (-((-733) & 10205)) & (-6) & 30591;
        lllIIIlllll[71] = (-((-1213) & 11710)) & (-81) & 31743;
        lllIIIlllll[72] = 86 ^ 78;
        lllIIIlllll[73] = (-14469) & 16111;
        lllIIIlllll[74] = (-((-1033) & 25886)) & (-1089) & 28511;
        lllIIIlllll[75] = 79 ^ 86;
        lllIIIlllll[76] = (-((-737) & 29665)) & (-2050) & 32639;
        lllIIIlllll[77] = (-((-2579) & 23199)) & (-33) & 31742;
        lllIIIlllll[78] = (154 ^ 163) ^ (179 ^ 144);
        lllIIIlllll[79] = (-((-10690) & 31179)) & (-1) & 31581;
        lllIIIlllll[80] = (-((-8013) & 24525)) & (-33) & 27639;
        lllIIIlllll[81] = (((157 + 49) - 46) + 14) ^ (((86 + 50) - 33) + 78);
        lllIIIlllll[82] = (-((-9574) & 15743)) & (-16641) & 24509;
        lllIIIlllll[83] = (-2341) & 4071;
        lllIIIlllll[84] = 34 ^ 62;
    }

    private static String lIlIllIlIllllI(String llllllllllllllllIIlIlIIlIIIIllII, String llllllllllllllllIIlIlIIlIIIIlIll) {
        String llllllllllllllllIIlIlIIlIIIIllII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIlIIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIIlIIIIlIlI = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIlIIlIIIIlIll.toCharArray();
        int llllllllllllllllIIlIlIIlIIIIlIII = lllIIIlllll[0];
        char[] charArray2 = llllllllllllllllIIlIlIIlIIIIllII2.toCharArray();
        int length = charArray2.length;
        int i = lllIIIlllll[0];
        while (lIlIllIllIIIll(i, length)) {
            char llllllllllllllllIIlIlIIlIIIIllIl = charArray2[i];
            llllllllllllllllIIlIlIIlIIIIlIlI.append((char) (llllllllllllllllIIlIlIIlIIIIllIl ^ charArray[llllllllllllllllIIlIlIIlIIIIlIII % charArray.length]));
            "".length();
            llllllllllllllllIIlIlIIlIIIIlIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIlIIlIIIIlIlI);
    }

    public static EnumC0010k[] values() {
        return (EnumC0010k[]) $VALUES.clone();
    }

    private static String lIlIllIllIIIII(String llllllllllllllllIIlIlIIIlllIlIlI, String llllllllllllllllIIlIlIIIlllIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIlllIlIIl.getBytes(StandardCharsets.UTF_8)), lllIIIlllll[24]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIlllll[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIlllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIIlllIlIll) {
            llllllllllllllllIIlIlIIIlllIlIll.printStackTrace();
            return null;
        }
    }

    public int E() {
        return this.finishedID;
    }

    private static boolean lIlIllIllIIIll(int i, int i2) {
        return i < i2;
    }

    static {
        lIlIllIllIIIlI();
        lIlIllIllIIIIl();
        SAPPHIRE_RING = new EnumC0010k(lllIIIllllI[lllIIIlllll[0]], lllIIIlllll[0], lllIIIlllll[1], lllIIIlllll[2], SpellBook.Standard.LVL_1_ENCHANT);
        SAPPHIRE_BRACELET = new EnumC0010k(lllIIIllllI[lllIIIlllll[3]], lllIIIlllll[3], lllIIIlllll[4], lllIIIlllll[5], SpellBook.Standard.LVL_1_ENCHANT);
        SAPPHIRE_NECKLACE = new EnumC0010k(lllIIIllllI[lllIIIlllll[6]], lllIIIlllll[6], lllIIIlllll[7], lllIIIlllll[8], SpellBook.Standard.LVL_1_ENCHANT);
        SAPPHIRE_AMULET = new EnumC0010k(lllIIIllllI[lllIIIlllll[9]], lllIIIlllll[9], lllIIIlllll[10], lllIIIlllll[11], SpellBook.Standard.LVL_1_ENCHANT);
        OPAL_RING = new EnumC0010k(lllIIIllllI[lllIIIlllll[12]], lllIIIlllll[12], lllIIIlllll[13], lllIIIlllll[14], SpellBook.Standard.LVL_1_ENCHANT);
        OPAL_BRACELET = new EnumC0010k(lllIIIllllI[lllIIIlllll[15]], lllIIIlllll[15], lllIIIlllll[16], lllIIIlllll[17], SpellBook.Standard.LVL_1_ENCHANT);
        OPAL_NECKLACE = new EnumC0010k(lllIIIllllI[lllIIIlllll[18]], lllIIIlllll[18], lllIIIlllll[19], lllIIIlllll[20], SpellBook.Standard.LVL_1_ENCHANT);
        OPAL_AMULET = new EnumC0010k(lllIIIllllI[lllIIIlllll[21]], lllIIIlllll[21], lllIIIlllll[22], lllIIIlllll[23], SpellBook.Standard.LVL_1_ENCHANT);
        EMERALD_RING = new EnumC0010k(lllIIIllllI[lllIIIlllll[24]], lllIIIlllll[24], lllIIIlllll[25], lllIIIlllll[26], SpellBook.Standard.LVL_2_ENCHANT);
        EMERALD_NECKLACE = new EnumC0010k(lllIIIllllI[lllIIIlllll[27]], lllIIIlllll[27], lllIIIlllll[28], lllIIIlllll[29], SpellBook.Standard.LVL_2_ENCHANT);
        EMERALD_BRACELET = new EnumC0010k(lllIIIllllI[lllIIIlllll[30]], lllIIIlllll[30], lllIIIlllll[31], lllIIIlllll[32], SpellBook.Standard.LVL_2_ENCHANT);
        EMERALD_AMULET = new EnumC0010k(lllIIIllllI[lllIIIlllll[33]], lllIIIlllll[33], lllIIIlllll[34], lllIIIlllll[35], SpellBook.Standard.LVL_2_ENCHANT);
        JADE_RING = new EnumC0010k(lllIIIllllI[lllIIIlllll[36]], lllIIIlllll[36], lllIIIlllll[37], lllIIIlllll[38], SpellBook.Standard.LVL_2_ENCHANT);
        JADE_BRACELET = new EnumC0010k(lllIIIllllI[lllIIIlllll[39]], lllIIIlllll[39], lllIIIlllll[40], lllIIIlllll[41], SpellBook.Standard.LVL_2_ENCHANT);
        JADE_NECKLACE = new EnumC0010k(lllIIIllllI[lllIIIlllll[42]], lllIIIlllll[42], lllIIIlllll[43], lllIIIlllll[44], SpellBook.Standard.LVL_2_ENCHANT);
        JADE_AMULET = new EnumC0010k(lllIIIllllI[lllIIIlllll[45]], lllIIIlllll[45], lllIIIlllll[46], lllIIIlllll[47], SpellBook.Standard.LVL_2_ENCHANT);
        RUBY_RING = new EnumC0010k(lllIIIllllI[lllIIIlllll[48]], lllIIIlllll[48], lllIIIlllll[49], lllIIIlllll[50], SpellBook.Standard.LVL_3_ENCHANT);
        RUBY_NECKLACE = new EnumC0010k(lllIIIllllI[lllIIIlllll[51]], lllIIIlllll[51], lllIIIlllll[52], lllIIIlllll[53], SpellBook.Standard.LVL_3_ENCHANT);
        RUBY_BRACELET = new EnumC0010k(lllIIIllllI[lllIIIlllll[54]], lllIIIlllll[54], lllIIIlllll[55], lllIIIlllll[56], SpellBook.Standard.LVL_3_ENCHANT);
        RUBY_AMULET = new EnumC0010k(lllIIIllllI[lllIIIlllll[57]], lllIIIlllll[57], lllIIIlllll[58], lllIIIlllll[59], SpellBook.Standard.LVL_3_ENCHANT);
        TOPAZ_RING = new EnumC0010k(lllIIIllllI[lllIIIlllll[60]], lllIIIlllll[60], lllIIIlllll[61], lllIIIlllll[62], SpellBook.Standard.LVL_3_ENCHANT);
        TOPAZ_BRACELET = new EnumC0010k(lllIIIllllI[lllIIIlllll[63]], lllIIIlllll[63], lllIIIlllll[64], lllIIIlllll[65], SpellBook.Standard.LVL_3_ENCHANT);
        TOPAZ_NECKLACE = new EnumC0010k(lllIIIllllI[lllIIIlllll[66]], lllIIIlllll[66], lllIIIlllll[67], lllIIIlllll[68], SpellBook.Standard.LVL_3_ENCHANT);
        TOPAZ_AMULET = new EnumC0010k(lllIIIllllI[lllIIIlllll[69]], lllIIIlllll[69], lllIIIlllll[70], lllIIIlllll[71], SpellBook.Standard.LVL_3_ENCHANT);
        DIAMOND_RING = new EnumC0010k(lllIIIllllI[lllIIIlllll[72]], lllIIIlllll[72], lllIIIlllll[73], lllIIIlllll[74], SpellBook.Standard.LVL_4_ENCHANT);
        DIAMOND_NECKLACE = new EnumC0010k(lllIIIllllI[lllIIIlllll[75]], lllIIIlllll[75], lllIIIlllll[76], lllIIIlllll[77], SpellBook.Standard.LVL_4_ENCHANT);
        DIAMOND_BRACELET = new EnumC0010k(lllIIIllllI[lllIIIlllll[78]], lllIIIlllll[78], lllIIIlllll[79], lllIIIlllll[80], SpellBook.Standard.LVL_4_ENCHANT);
        DIAMOND_AMULET = new EnumC0010k(lllIIIllllI[lllIIIlllll[81]], lllIIIlllll[81], lllIIIlllll[82], lllIIIlllll[83], SpellBook.Standard.LVL_4_ENCHANT);
        EnumC0010k[] enumC0010kArr = new EnumC0010k[lllIIIlllll[84]];
        enumC0010kArr[lllIIIlllll[0]] = SAPPHIRE_RING;
        enumC0010kArr[lllIIIlllll[3]] = SAPPHIRE_BRACELET;
        enumC0010kArr[lllIIIlllll[6]] = SAPPHIRE_NECKLACE;
        enumC0010kArr[lllIIIlllll[9]] = SAPPHIRE_AMULET;
        enumC0010kArr[lllIIIlllll[12]] = OPAL_RING;
        enumC0010kArr[lllIIIlllll[15]] = OPAL_BRACELET;
        enumC0010kArr[lllIIIlllll[18]] = OPAL_NECKLACE;
        enumC0010kArr[lllIIIlllll[21]] = OPAL_AMULET;
        enumC0010kArr[lllIIIlllll[24]] = EMERALD_RING;
        enumC0010kArr[lllIIIlllll[27]] = EMERALD_NECKLACE;
        enumC0010kArr[lllIIIlllll[30]] = EMERALD_BRACELET;
        enumC0010kArr[lllIIIlllll[33]] = EMERALD_AMULET;
        enumC0010kArr[lllIIIlllll[36]] = JADE_RING;
        enumC0010kArr[lllIIIlllll[39]] = JADE_BRACELET;
        enumC0010kArr[lllIIIlllll[42]] = JADE_NECKLACE;
        enumC0010kArr[lllIIIlllll[45]] = JADE_AMULET;
        enumC0010kArr[lllIIIlllll[48]] = RUBY_RING;
        enumC0010kArr[lllIIIlllll[51]] = RUBY_NECKLACE;
        enumC0010kArr[lllIIIlllll[54]] = RUBY_BRACELET;
        enumC0010kArr[lllIIIlllll[57]] = RUBY_AMULET;
        enumC0010kArr[lllIIIlllll[60]] = TOPAZ_RING;
        enumC0010kArr[lllIIIlllll[63]] = TOPAZ_BRACELET;
        enumC0010kArr[lllIIIlllll[66]] = TOPAZ_NECKLACE;
        enumC0010kArr[lllIIIlllll[69]] = TOPAZ_AMULET;
        enumC0010kArr[lllIIIlllll[72]] = DIAMOND_RING;
        enumC0010kArr[lllIIIlllll[75]] = DIAMOND_NECKLACE;
        enumC0010kArr[lllIIIlllll[78]] = DIAMOND_BRACELET;
        enumC0010kArr[lllIIIlllll[81]] = DIAMOND_AMULET;
        $VALUES = enumC0010kArr;
    }

    private static void lIlIllIllIIIIl() {
        lllIIIllllI = new String[lllIIIlllll[84]];
        lllIIIllllI[lllIIIlllll[0]] = lIlIllIlIllllI("HDsbOy8GKA40NQY0DA==", "OzKkg");
        lllIIIllllI[lllIIIlllll[3]] = lIlIllIlIlllll("uqrpXdh96PLmOcK1uxeNcJX7TSrpny4w", "kzlMH");
        lllIIIllllI[lllIIIlllll[6]] = lIlIllIlIllllI("ISAGICE7MxMvJzciHTwoMSQ=", "raVpi");
        lllIIIllllI[lllIIIlllll[9]] = lIlIllIlIlllll("elPzQzKwKFtpwkgUFVH95w==", "QmLoW");
        lllIIIllllI[lllIIIlllll[12]] = lIlIllIlIllllI("DCAFJzgROQos", "CpDkg");
        lllIIIllllI[lllIIIlllll[15]] = lIlIllIlIlllll("uC6jjKyzAL4sniZeZmyQAA==", "aikqp");
        lllIIIllllI[lllIIIlllll[18]] = lIlIllIllIIIII("3QXSOzVppOENNVg9rP7VmQ==", "tSZHC");
        lllIIIllllI[lllIIIlllll[21]] = lIlIllIlIlllll("Sohpg5ChCZtTzPBKumhOMQ==", "zGHpZ");
        lllIIIllllI[lllIIIlllll[24]] = lIlIllIlIllllI("ETsxFCoYMisUIhox", "TvtFk");
        lllIIIllllI[lllIIIlllll[27]] = lIlIllIllIIIII("nsMRXkotlPIKN7jvXQ3wCxKCDKJ6EYSK", "kgRhO");
        lllIIIllllI[lllIIIlllll[30]] = lIlIllIllIIIII("01Du8S33GFE6a/J+YDLQveiI4ldSX8I6", "xeObZ");
        lllIIIllllI[lllIIIlllll[33]] = lIlIllIlIlllll("fWJcet3qFUZjMlBY7l+rag==", "TKGfN");
        lllIIIllllI[lllIIIlllll[36]] = lIlIllIllIIIII("AN6tlJs4xDINgYzpdchHAQ==", "NktOJ");
        lllIIIllllI[lllIIIlllll[39]] = lIlIllIlIllllI("HDU0ADsUJjEGIRoxJA==", "VtpEd");
        lllIIIllllI[lllIIIlllll[42]] = lIlIllIlIlllll("0floSINZypAL9bUWkvrKXw==", "UPJXj");
        lllIIIllllI[lllIIIlllll[45]] = lIlIllIlIlllll("dyarJs0smcft7hqpNrCK7A==", "koUzJ");
        lllIIIllllI[lllIIIlllll[48]] = lIlIllIllIIIII("lXRgktClSE4kO3FVogPS3Q==", "zlTqE");
        lllIIIllllI[lllIIIlllll[51]] = lIlIllIllIIIII("4qtZWi+T6CyRYKpuTg9m3g==", "mNeJz");
        lllIIIllllI[lllIIIlllll[54]] = lIlIllIllIIIII("AKFDRsRUghOdxbGOMDxmWg==", "uHMVR");
        lllIIIllllI[lllIIIlllll[57]] = lIlIllIlIlllll("fPmHivImTSuoonpDmFmJsw==", "HTuqY");
        lllIIIllllI[lllIIIlllll[60]] = lIlIllIllIIIII("tq6KQw/+5wU2WZrkz8qUxA==", "PjYUO");
        lllIIIllllI[lllIIIlllll[63]] = lIlIllIllIIIII("wZvRYuPR2YsRVxJX3U9DNg==", "Dfiek");
        lllIIIllllI[lllIIIlllll[66]] = lIlIllIlIlllll("cBYkTCZdJOw8HWzH+3FLVQ==", "MVGFZ");
        lllIIIllllI[lllIIIlllll[69]] = lIlIllIlIllllI("BCgIAy4PJhUXOBUz", "PgXBt");
        lllIIIllllI[lllIIIlllll[72]] = lIlIllIlIllllI("MAIsGj46DzIFODoM", "tKmWq");
        lllIIIllllI[lllIIIlllll[75]] = lIlIllIllIIIII("h3DGc7EXJkV/2/ljJGCEVF+7kvpxuvtL", "RcPgf");
        lllIIIllllI[lllIIIlllll[78]] = lIlIllIlIllllI("ChEKCCgAHBQHNQ8bDgkiGg==", "NXKEg");
        lllIIIllllI[lllIIIlllll[81]] = lIlIllIlIlllll("QqjiSaMqIA3xinsqMMFqBw==", "fmqYT");
    }

    private EnumC0010k(String str, int i, int i2, int i3, Spell spell) {
        this.materialID = i2;
        this.finishedID = i3;
        this.spell = spell;
    }
}
