package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.cb  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/cb.class */
public final class cb {
    public static final /* synthetic */ cb SARADOMIN_GODSWORD;
    public static final /* synthetic */ cb BLACK_2H_SWORD;
    public static final /* synthetic */ cb BRONZE_2H_SWORD;
    public static final /* synthetic */ cb STEEL_2H_SWORD;
    public static final /* synthetic */ cb SARADOMIN_GODSWORD_OR;
    private static /* synthetic */ String[] llllIlIlI;
    private static final /* synthetic */ cb[] $VALUES;
    private static /* synthetic */ int[] llllIlIll;
    public static final /* synthetic */ cb SARADOMIN_SWORD;
    public static final /* synthetic */ cb COLOSSAL_BLADE;
    public static final /* synthetic */ cb BANDOS_GODSWORD;
    public static final /* synthetic */ cb ARMADYL_GODSWORD;
    public static final /* synthetic */ cb SHADOW_SWORD;
    public static final /* synthetic */ cb ZAMORAK_GODSWORD_OR;
    private final /* synthetic */ Prayer protectionPrayer;
    public static final /* synthetic */ cb IRON_2H_SWORD;
    public static final /* synthetic */ cb SARADOMIN_BLESSED_SWORD;
    public static final /* synthetic */ cb ANCIENT_GODSWORD;
    public static final /* synthetic */ cb ARMADYL_GODSWORD_OR;
    private final /* synthetic */ int itemID;
    public static final /* synthetic */ cb SPATULA;
    public static final /* synthetic */ cb WHITE_2H_SWORD;
    public static final /* synthetic */ cb RUNE_2H_SWORD;
    public static final /* synthetic */ cb MITHRIL_2H_SWORD;
    public static final /* synthetic */ cb DRAGON_2H_SWORD;
    public static final /* synthetic */ cb BANDOS_GODSWORD_OR;
    public static final /* synthetic */ cb GILDED_2H_SWORD;
    public static final /* synthetic */ cb ZAMORAK_GODSWORD;
    public static final /* synthetic */ cb ADAMANT_2H_SWORD;

    private static void llIlIIIIlll() {
        llllIlIll = new int[49];
        llllIlIll[0] = ((17 ^ 15) ^ " ".length()) & (((16 ^ 127) ^ (203 ^ 187)) ^ (-" ".length()));
        llllIlIll[1] = (-15013) & 16319;
        llllIlIll[2] = " ".length();
        llllIlIll[3] = (-((-1365) & 8151)) & (-8289) & 16383;
        llllIlIll[4] = "  ".length();
        llllIlIll[5] = (-10913) & 12223;
        llllIlIll[6] = "   ".length();
        llllIlIll[7] = (-((-243) & 26875)) & (-65) & 28009;
        llllIlIll[8] = (123 ^ 116) ^ (202 ^ 193);
        llllIlIll[9] = (-17953) & 24561;
        llllIlIll[10] = 14 ^ 11;
        llllIlIll[11] = (-10833) & 12147;
        llllIlIll[12] = (101 ^ 96) ^ "   ".length();
        llllIlIll[13] = (-20569) & 21885;
        llllIlIll[14] = 16 ^ 23;
        llllIlIll[15] = (-((-17671) & 27935)) & (-20993) & 32575;
        llllIlIll[16] = 149 ^ 157;
        llllIlIll[17] = (-2) & 7159;
        llllIlIll[18] = 145 ^ 152;
        llllIlIll[19] = (-6535) & 32767;
        llllIlIll[20] = 34 ^ 40;
        llllIlIll[21] = (-((-11393) & 31973)) & (-129) & 32510;
        llllIlIll[22] = (((73 + 141) - 187) + 134) ^ (((69 + 153) - 217) + 165);
        llllIlIll[23] = (-((-5201) & 13428)) & (-77) & 28671;
        llllIlIll[24] = (124 ^ 1) ^ (199 ^ 182);
        llllIlIll[25] = (-((-3145) & 23883)) & (-194) & 32735;
        llllIlIll[26] = 81 ^ 92;
        llllIlIll[27] = (-8257) & 28626;
        llllIlIll[28] = (((83 + 134) - 212) + 201) ^ (((148 + 84) - 121) + 81);
        llllIlIll[29] = (-((-5659) & 22491)) & (-2) & 28639;
        llllIlIll[30] = 105 ^ 102;
        llllIlIll[31] = (-((-2052) & 14447)) & (-1) & 32767;
        llllIlIll[32] = 27 ^ 11;
        llllIlIll[33] = (-16775) & 28582;
        llllIlIll[34] = 168 ^ 185;
        llllIlIll[35] = (-4201) & 24574;
        llllIlIll[36] = (128 ^ 179) ^ (6 ^ 39);
        llllIlIll[37] = (-((-2113) & 24021)) & (-2) & 32767;
        llllIlIll[38] = (23 ^ 67) ^ (22 ^ 81);
        llllIlIll[39] = (-((-823) & 17335)) & (-8753) & 32703;
        llllIlIll[40] = 2 ^ 22;
        llllIlIll[41] = (-12289) & 32443;
        llllIlIll[42] = (((77 + 50) - 72) + 131) ^ (((154 + 2) - 67) + 86);
        llllIlIll[43] = (-16578) & 28415;
        llllIlIll[44] = 161 ^ 183;
        llllIlIll[45] = (-((-2185) & 6811)) & (-65) & 31711;
        llllIlIll[46] = (((44 + 117) - 15) + 10) ^ (((0 + 89) - 67) + 117);
        llllIlIll[47] = (-((-9) & 18893)) & (-19) & 31711;
        llllIlIll[48] = (((102 + 83) - 104) + 52) ^ (((125 + 153) - 254) + 133);
    }

    private static String llIlIIIIlII(String lIlIIlllIIIlIII, String lIlIIlllIIIIlll) {
        try {
            SecretKeySpec lIlIIlllIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIlllIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIlllIIIlIlI = Cipher.getInstance("Blowfish");
            lIlIIlllIIIlIlI.init(llllIlIll[4], lIlIIlllIIIlIll);
            return new String(lIlIIlllIIIlIlI.doFinal(Base64.getDecoder().decode(lIlIIlllIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIlllIIIlIIl) {
            lIlIIlllIIIlIIl.printStackTrace();
            return null;
        }
    }

    public Prayer dc() {
        return this.protectionPrayer;
    }

    public static cb[] values() {
        return (cb[]) $VALUES.clone();
    }

    private static boolean llIlIIIlIII(int i2, int i3) {
        return i2 < i3;
    }

    static {
        llIlIIIIlll();
        llIlIIIIllI();
        BRONZE_2H_SWORD = new cb(llllIlIlI[llllIlIll[0]], llllIlIll[0], llllIlIll[1], Prayer.PROTECT_FROM_MELEE);
        IRON_2H_SWORD = new cb(llllIlIlI[llllIlIll[2]], llllIlIll[2], llllIlIll[3], Prayer.PROTECT_FROM_MELEE);
        STEEL_2H_SWORD = new cb(llllIlIlI[llllIlIll[4]], llllIlIll[4], llllIlIll[5], Prayer.PROTECT_FROM_MELEE);
        BLACK_2H_SWORD = new cb(llllIlIlI[llllIlIll[6]], llllIlIll[6], llllIlIll[7], Prayer.PROTECT_FROM_MELEE);
        WHITE_2H_SWORD = new cb(llllIlIlI[llllIlIll[8]], llllIlIll[8], llllIlIll[9], Prayer.PROTECT_FROM_MELEE);
        MITHRIL_2H_SWORD = new cb(llllIlIlI[llllIlIll[10]], llllIlIll[10], llllIlIll[11], Prayer.PROTECT_FROM_MELEE);
        ADAMANT_2H_SWORD = new cb(llllIlIlI[llllIlIll[12]], llllIlIll[12], llllIlIll[13], Prayer.PROTECT_FROM_MELEE);
        RUNE_2H_SWORD = new cb(llllIlIlI[llllIlIll[14]], llllIlIll[14], llllIlIll[15], Prayer.PROTECT_FROM_MELEE);
        DRAGON_2H_SWORD = new cb(llllIlIlI[llllIlIll[16]], llllIlIll[16], llllIlIll[17], Prayer.PROTECT_FROM_MELEE);
        ANCIENT_GODSWORD = new cb(llllIlIlI[llllIlIll[18]], llllIlIll[18], llllIlIll[19], Prayer.PROTECT_FROM_MELEE);
        ARMADYL_GODSWORD = new cb(llllIlIlI[llllIlIll[20]], llllIlIll[20], llllIlIll[21], Prayer.PROTECT_FROM_MELEE);
        ARMADYL_GODSWORD_OR = new cb(llllIlIlI[llllIlIll[22]], llllIlIll[22], llllIlIll[23], Prayer.PROTECT_FROM_MELEE);
        BANDOS_GODSWORD = new cb(llllIlIlI[llllIlIll[24]], llllIlIll[24], llllIlIll[25], Prayer.PROTECT_FROM_MELEE);
        BANDOS_GODSWORD_OR = new cb(llllIlIlI[llllIlIll[26]], llllIlIll[26], llllIlIll[27], Prayer.PROTECT_FROM_MELEE);
        SARADOMIN_GODSWORD = new cb(llllIlIlI[llllIlIll[28]], llllIlIll[28], llllIlIll[29], Prayer.PROTECT_FROM_MELEE);
        SARADOMIN_GODSWORD_OR = new cb(llllIlIlI[llllIlIll[30]], llllIlIll[30], llllIlIll[31], Prayer.PROTECT_FROM_MELEE);
        ZAMORAK_GODSWORD = new cb(llllIlIlI[llllIlIll[32]], llllIlIll[32], llllIlIll[33], Prayer.PROTECT_FROM_MELEE);
        ZAMORAK_GODSWORD_OR = new cb(llllIlIlI[llllIlIll[34]], llllIlIll[34], llllIlIll[35], Prayer.PROTECT_FROM_MELEE);
        SHADOW_SWORD = new cb(llllIlIlI[llllIlIll[36]], llllIlIll[36], llllIlIll[37], Prayer.PROTECT_FROM_MELEE);
        SPATULA = new cb(llllIlIlI[llllIlIll[38]], llllIlIll[38], llllIlIll[39], Prayer.PROTECT_FROM_MELEE);
        GILDED_2H_SWORD = new cb(llllIlIlI[llllIlIll[40]], llllIlIll[40], llllIlIll[41], Prayer.PROTECT_FROM_MELEE);
        SARADOMIN_SWORD = new cb(llllIlIlI[llllIlIll[42]], llllIlIll[42], llllIlIll[43], Prayer.PROTECT_FROM_MELEE);
        COLOSSAL_BLADE = new cb(llllIlIlI[llllIlIll[44]], llllIlIll[44], llllIlIll[45], Prayer.PROTECT_FROM_MELEE);
        SARADOMIN_BLESSED_SWORD = new cb(llllIlIlI[llllIlIll[46]], llllIlIll[46], llllIlIll[47], Prayer.PROTECT_FROM_MELEE);
        cb[] cbVarArr = new cb[llllIlIll[48]];
        cbVarArr[llllIlIll[0]] = BRONZE_2H_SWORD;
        cbVarArr[llllIlIll[2]] = IRON_2H_SWORD;
        cbVarArr[llllIlIll[4]] = STEEL_2H_SWORD;
        cbVarArr[llllIlIll[6]] = BLACK_2H_SWORD;
        cbVarArr[llllIlIll[8]] = WHITE_2H_SWORD;
        cbVarArr[llllIlIll[10]] = MITHRIL_2H_SWORD;
        cbVarArr[llllIlIll[12]] = ADAMANT_2H_SWORD;
        cbVarArr[llllIlIll[14]] = RUNE_2H_SWORD;
        cbVarArr[llllIlIll[16]] = DRAGON_2H_SWORD;
        cbVarArr[llllIlIll[18]] = ANCIENT_GODSWORD;
        cbVarArr[llllIlIll[20]] = ARMADYL_GODSWORD;
        cbVarArr[llllIlIll[22]] = ARMADYL_GODSWORD_OR;
        cbVarArr[llllIlIll[24]] = BANDOS_GODSWORD;
        cbVarArr[llllIlIll[26]] = BANDOS_GODSWORD_OR;
        cbVarArr[llllIlIll[28]] = SARADOMIN_GODSWORD;
        cbVarArr[llllIlIll[30]] = SARADOMIN_GODSWORD_OR;
        cbVarArr[llllIlIll[32]] = ZAMORAK_GODSWORD;
        cbVarArr[llllIlIll[34]] = ZAMORAK_GODSWORD_OR;
        cbVarArr[llllIlIll[36]] = SHADOW_SWORD;
        cbVarArr[llllIlIll[38]] = SPATULA;
        cbVarArr[llllIlIll[40]] = GILDED_2H_SWORD;
        cbVarArr[llllIlIll[42]] = SARADOMIN_SWORD;
        cbVarArr[llllIlIll[44]] = COLOSSAL_BLADE;
        cbVarArr[llllIlIll[46]] = SARADOMIN_BLESSED_SWORD;
        $VALUES = cbVarArr;
    }

    private static void llIlIIIIllI() {
        llllIlIlI = new String[llllIlIll[48]];
        llllIlIlI[llllIlIll[0]] = llIlIIIIIll("m9rzNt724jgkPeKG6pVgig==", "kqioa");
        llllIlIlI[llllIlIll[2]] = llIlIIIIlII("rWrNikfW53cVHQ3bdJu61Q==", "VqfRf");
        llllIlIlI[llllIlIll[4]] = llIlIIIIIll("L/xtQy+6s+cV9Hhlt3uzfQ==", "AsIAB");
        llllIlIlI[llllIlIll[6]] = llIlIIIIIll("4hfUsaMScuhXL6MOu0ou1g==", "RrTRa");
        llllIlIlI[llllIlIll[8]] = llIlIIIIlII("nUtiU+WcOK2sNNKlbh8tsw==", "SPdYD");
        llllIlIlI[llllIlIll[10]] = llIlIIIIlIl("BwAOBDEDBQV+KxUaDQMxDg==", "JIZLc");
        llllIlIlI[llllIlIll[12]] = llIlIIIIlII("UgtDFtRLry9UqPfaB/Z57zFgPRNE/l1v", "aoWAe");
        llllIlIlI[llllIlIll[14]] = llIlIIIIlIl("OzQADiVbKREYLSYzCg==", "iaNKz");
        llllIlIlI[llllIlIll[16]] = llIlIIIIlIl("IjkLEx0oNHgcDTU8BQYW", "fkJTR");
        llllIlIlI[llllIlIll[18]] = llIlIIIIlIl("Nj4rBwE5JDcJCzMjPwEWMw==", "wphND");
        llllIlIlI[llllIlIll[20]] = llIlIIIIIll("+7a89IZTQNWoPmf8L1M8BDFk4jTEN5wZ", "WdFcw");
        llllIlIlI[llllIlIll[22]] = llIlIIIIlII("x1jQBAzp72Qoo1Z58GAS6ciJT5y3pTg1", "RvphK");
        llllIlIlI[llllIlIll[24]] = llIlIIIIlIl("FQ8kFz4EES0cNQQZJQE1", "WNjSq");
        llllIlIlI[llllIlIll[26]] = llIlIIIIlIl("MS0FJSUgMwwuLiA7BDMuLCMZ", "slKaj");
        llllIlIlI[llllIlIll[28]] = llIlIIIIlII("aaNfPNTrJSZ6Kme76oDS8TQVHyyZuhgv", "wTfbC");
        llllIlIlI[llllIlIll[30]] = llIlIIIIlIl("JishDTc6JzoCLDIlNx8kOjg3Ezwn", "ujsLs");
        llllIlIlI[llllIlIll[32]] = llIlIIIIlIl("DjQ1OD8VPicwIhAmLzg/EA==", "Tuxwm");
        llllIlIlI[llllIlIll[34]] = llIlIIIIlII("Rbl9qE+1aazck01d1BOlUJgKYS7yY/dH", "MaMUt");
        llllIlIlI[llllIlIll[36]] = llIlIIIIlII("YuDJOCDafdQxPHrqDVTFmQ==", "UAsPN");
        llllIlIlI[llllIlIll[38]] = llIlIIIIlII("75bcwqfZ0NQ=", "dPUkR");
        llllIlIlI[llllIlIll[40]] = llIlIIIIlIl("AQUKAg4CE3QOFBUbCRQP", "FLFFK");
        llllIlIlI[llllIlIll[42]] = llIlIIIIlIl("JxQfEwM7GAQcGCcCAgAD", "tUMRG");
        llllIlIlI[llllIlIll[44]] = llIlIIIIIll("yhvpagc+9+xaCUb2qUVG+g==", "JMJxN");
        llllIlIlI[llllIlIll[46]] = llIlIIIIIll("D4FQ9ZzpQBD46p15GSlh3n+HegidQZC1", "gVRNH");
    }

    private static String llIlIIIIIll(String lIlIIlllIIlIlIl, String lIlIIlllIIlIlII) {
        try {
            SecretKeySpec lIlIIlllIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIlllIIlIlII.getBytes(StandardCharsets.UTF_8)), llllIlIll[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIlIll[4], lIlIIlllIIllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIIlllIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIlllIIlIllI) {
            lIlIIlllIIlIllI.printStackTrace();
            return null;
        }
    }

    private cb(String str, int i2, int i3, Prayer prayer) {
        this.itemID = i3;
        this.protectionPrayer = prayer;
    }

    public int ar() {
        return this.itemID;
    }

    private static String llIlIIIIlIl(String lIlIIllIllllIII, String lIlIIllIlllIlll) {
        String str = new String(Base64.getDecoder().decode(lIlIIllIllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlIIllIlllIlll.toCharArray();
        int lIlIIllIlllIlII = llllIlIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = llllIlIll[0];
        while (llIlIIIlIII(i2, length)) {
            char lIlIIllIllllIIl = charArray2[i2];
            sb.append((char) (lIlIIllIllllIIl ^ charArray[lIlIIllIlllIlII % charArray.length]));
            "".length();
            lIlIIllIlllIlII++;
            i2++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static cb valueOf(String str) {
        return (cb) Enum.valueOf(cb.class, str);
    }
}
