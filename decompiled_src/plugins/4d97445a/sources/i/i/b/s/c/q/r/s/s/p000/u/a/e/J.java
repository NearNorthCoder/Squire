package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.J  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/J.class */
public final class J {
    public static final /* synthetic */ J SUPER_DEFENCE;
    private final /* synthetic */ int boostAmount;
    public static final /* synthetic */ J DIVINE_RANGING_POTION;
    public static final /* synthetic */ J SUPER_COMBAT;
    public static final /* synthetic */ J BASTION_POTION;
    private static /* synthetic */ String[] lIlIIll;
    private static /* synthetic */ int[] lIlIlII;
    public static final /* synthetic */ J ANCIENT_BREW;
    private final /* synthetic */ int percentage;
    public static final /* synthetic */ J RANGING_POTION;
    private final /* synthetic */ String name;
    private static final /* synthetic */ J[] $VALUES;
    public static final /* synthetic */ J SUPER_ATTACK;
    public static final /* synthetic */ J DIVINE_MAGIC_POTION;
    private final /* synthetic */ Skill[] skills;
    public static final /* synthetic */ J DIVINE_SUPER_COMBAT;
    public static final /* synthetic */ J MAGIC_POTION;
    public static final /* synthetic */ J SUPER_STRENGTH;

    public int a(Skill skill) {
        return this.boostAmount + ((Skills.getLevel(skill) * this.percentage) / lIlIlII[0]);
    }

    private static String lIlIlIlIl(String lllIlIlIlIIIlII, String lllIlIlIlIIIIll) {
        try {
            SecretKeySpec lllIlIlIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIlIlIIIIll.getBytes(StandardCharsets.UTF_8)), lIlIlII[10]), "DES");
            Cipher lllIlIlIlIIIllI = Cipher.getInstance("DES");
            lllIlIlIlIIIllI.init(lIlIlII[6], lllIlIlIlIIIlll);
            return new String(lllIlIlIlIIIllI.doFinal(Base64.getDecoder().decode(lllIlIlIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIlIlIIIlIl) {
            lllIlIlIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIlll() {
        lIlIlII = new int[24];
        lIlIlII[0] = 244 ^ 144;
        lIlIlII[1] = ((13 ^ 123) ^ (195 ^ 185)) & (((((127 + 104) - 138) + 54) ^ (((89 + 111) - 187) + 146)) ^ (-" ".length()));
        lIlIlII[2] = " ".length();
        lIlIlII[3] = 34 ^ 39;
        lIlIlII[4] = 159 ^ 144;
        lIlIlII[5] = "   ".length();
        lIlIlII[6] = "  ".length();
        lIlIlII[7] = (((73 + 98) - 98) + 105) ^ (((100 + 31) - 90) + 141);
        lIlIlII[8] = 149 ^ 147;
        lIlIlII[9] = 181 ^ 178;
        lIlIlII[10] = 56 ^ 48;
        lIlIlII[11] = (71 ^ 44) ^ (65 ^ 35);
        lIlIlII[12] = (122 ^ 1) ^ (196 ^ 181);
        lIlIlII[13] = 65 ^ 74;
        lIlIlII[14] = 200 ^ 196;
        lIlIlII[15] = 46 ^ 35;
        lIlIlII[16] = "   ".length() ^ (160 ^ 173);
        lIlIlII[17] = 37 ^ 53;
        lIlIlII[18] = 139 ^ 154;
        lIlIlII[19] = (14 ^ 66) ^ (102 ^ 56);
        lIlIlII[20] = 41 ^ 58;
        lIlIlII[21] = 6 ^ 18;
        lIlIlII[22] = (85 ^ 15) ^ (231 ^ 168);
        lIlIlII[23] = 50 ^ 36;
    }

    private static String lIlIlIIll(String lllIlIlIlIlIIIl, String lllIlIlIlIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIlIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlII[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIlIlIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIlIlIlIIlI) {
            lllIlIlIlIlIIlI.printStackTrace();
            return null;
        }
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    private static boolean llIIIllII(int i2, int i3) {
        return i2 < i3;
    }

    public static J[] values() {
        return (J[]) $VALUES.clone();
    }

    public Skill[] ay() {
        return this.skills;
    }

    public String ax() {
        return this.name;
    }

    private static String lIlIlIlII(String lllIlIlIIllIlII, String lllIlIlIIllIIll) {
        String str = new String(Base64.getDecoder().decode(lllIlIlIIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlIlIIllIIlI = new StringBuilder();
        char[] lllIlIlIIllIIIl = lllIlIlIIllIIll.toCharArray();
        int lllIlIlIIllIIII = lIlIlII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIlIlII[1];
        while (llIIIllII(i2, length)) {
            lllIlIlIIllIIlI.append((char) (charArray[i2] ^ lllIlIlIIllIIIl[lllIlIlIIllIIII % lllIlIlIIllIIIl.length]));
            "".length();
            lllIlIlIIllIIII++;
            i2++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllIlIlIIllIIlI);
    }

    private J(String str, int i2, String str2, int i3, int i4, Skill... skillArr) {
        this.name = str2;
        this.percentage = i4;
        this.skills = skillArr;
        this.boostAmount = i3;
    }

    private static void lIlIlIllI() {
        lIlIIll = new String[lIlIlII[23]];
        lIlIIll[lIlIlII[1]] = lIlIlIIll("uRpJqAKKvydX2XhIf5Ruiw==", "WKGkR");
        lIlIIll[lIlIlII[2]] = lIlIlIlII("FCE5PQhnNyY1GCYgaSgVMz0mNg==", "GTIXz");
        lIlIIll[lIlIlII[6]] = lIlIlIlII("EQYgORkQECUlBxAdKTMYGA03JA==", "UOvpW");
        lIlIIll[lIlIlII[5]] = lIlIlIlIl("e37BpFLbF/jVcupEe8WkqgzyRAsxz9Edst1f74hOz7o=", "wXsrf");
        lIlIIll[lIlIlII[7]] = lIlIlIlII("JiUoDSoqIywaPTs3LAA=", "upxHx");
        lIlIIll[lIlIlII[3]] = lIlIlIlIl("OEEh01r1ePbmq8GwNWLe8Q==", "tXJTD");
        lIlIIll[lIlIlII[8]] = lIlIlIIll("HjtDCAaveUmbR4vIifGrUg==", "VMjfX");
        lIlIIll[lIlIlII[9]] = lIlIlIlIl("G+9V3yMWle3yToEsB91KiQ==", "fMuhE");
        lIlIIll[lIlIlII[10]] = lIlIlIlII("FTghLzAZKTQsJwguNA==", "Fmqjb");
        lIlIIll[lIlIlII[11]] = lIlIlIIll("op2UI3wrU7WYXfStmXZ1Gw==", "GTLYE");
        lIlIIll[lIlIlII[12]] = lIlIlIlII("CxY2DywXECcYKg0eNwY=", "YWxHe");
        lIlIIll[lIlIlII[13]] = lIlIlIIll("0V5rsw0uhixyUqBsJ7G/eg==", "dBzgS");
        lIlIIll[lIlIlII[14]] = lIlIlIIll("2tdfLCCycRfn63xLOe1bGIh1P2CUjPdj", "dbQRF");
        lIlIIll[lIlIlII[15]] = lIlIlIlII("AyAlDSoiaSEFKiAgPQNkNyYnDSsp", "GISdD");
        lIlIIll[lIlIlII[16]] = lIlIlIlII("JDU4ASQpOjQFIjI9JBs=", "ftkUm");
        lIlIIll[lIlIlII[4]] = lIlIlIIll("Tt9rojd7vnKfHUkhX5Xkcw==", "WSzZz");
        lIlIIll[lIlIlII[17]] = lIlIlIlIl("T+NODge0HVp12ggSNTOerQ==", "zafQq");
        lIlIIll[lIlIlII[18]] = lIlIlIIll("KGiujSeG7odvYTI/Bqo47Q==", "cFJoR");
        lIlIIll[lIlIlII[19]] = lIlIlIlII("CSg7OikIPiAyIAQiMiMoGSgiPQ==", "Mamsg");
        lIlIIll[lIlIlII[20]] = lIlIlIlII("CxAkBCUqWT8MLCYach0kOxA9Aw==", "OyRmK");
        lIlIIll[lIlIlII[21]] = lIlIlIlIl("+oBWbRaV1Vy6wbU4MlJe3A==", "lqjzQ");
        lIlIIll[lIlIlII[22]] = lIlIlIlIl("/DCmBFtsXCc43LnBFz2kVw==", "jjZcV");
    }

    static {
        lIlIlIlll();
        lIlIlIllI();
        String str = lIlIIll[lIlIlII[1]];
        int i2 = lIlIlII[1];
        String str2 = lIlIIll[lIlIlII[2]];
        int i3 = lIlIlII[3];
        int i4 = lIlIlII[4];
        Skill[] skillArr = new Skill[lIlIlII[5]];
        skillArr[lIlIlII[1]] = Skill.STRENGTH;
        skillArr[lIlIlII[2]] = Skill.ATTACK;
        skillArr[lIlIlII[6]] = Skill.DEFENCE;
        SUPER_COMBAT = new J(str, i2, str2, i3, i4, skillArr);
        String str3 = lIlIIll[lIlIlII[6]];
        int i5 = lIlIlII[2];
        String str4 = lIlIIll[lIlIlII[5]];
        int i6 = lIlIlII[3];
        int i7 = lIlIlII[4];
        Skill[] skillArr2 = new Skill[lIlIlII[5]];
        skillArr2[lIlIlII[1]] = Skill.STRENGTH;
        skillArr2[lIlIlII[2]] = Skill.ATTACK;
        skillArr2[lIlIlII[6]] = Skill.DEFENCE;
        DIVINE_SUPER_COMBAT = new J(str3, i5, str4, i6, i7, skillArr2);
        String str5 = lIlIIll[lIlIlII[7]];
        int i8 = lIlIlII[6];
        String str6 = lIlIIll[lIlIlII[3]];
        int i9 = lIlIlII[3];
        int i10 = lIlIlII[4];
        Skill[] skillArr3 = new Skill[lIlIlII[2]];
        skillArr3[lIlIlII[1]] = Skill.STRENGTH;
        SUPER_STRENGTH = new J(str5, i8, str6, i9, i10, skillArr3);
        String str7 = lIlIIll[lIlIlII[8]];
        int i11 = lIlIlII[5];
        String str8 = lIlIIll[lIlIlII[9]];
        int i12 = lIlIlII[3];
        int i13 = lIlIlII[4];
        Skill[] skillArr4 = new Skill[lIlIlII[2]];
        skillArr4[lIlIlII[1]] = Skill.ATTACK;
        SUPER_ATTACK = new J(str7, i11, str8, i12, i13, skillArr4);
        String str9 = lIlIIll[lIlIlII[10]];
        int i14 = lIlIlII[7];
        String str10 = lIlIIll[lIlIlII[11]];
        int i15 = lIlIlII[3];
        int i16 = lIlIlII[4];
        Skill[] skillArr5 = new Skill[lIlIlII[2]];
        skillArr5[lIlIlII[1]] = Skill.DEFENCE;
        SUPER_DEFENCE = new J(str9, i14, str10, i15, i16, skillArr5);
        String str11 = lIlIIll[lIlIlII[12]];
        int i17 = lIlIlII[3];
        String str12 = lIlIIll[lIlIlII[13]];
        int i18 = lIlIlII[7];
        int i19 = lIlIlII[12];
        Skill[] skillArr6 = new Skill[lIlIlII[2]];
        skillArr6[lIlIlII[1]] = Skill.RANGED;
        RANGING_POTION = new J(str11, i17, str12, i18, i19, skillArr6);
        String str13 = lIlIIll[lIlIlII[14]];
        int i20 = lIlIlII[8];
        String str14 = lIlIIll[lIlIlII[15]];
        int i21 = lIlIlII[7];
        int i22 = lIlIlII[12];
        Skill[] skillArr7 = new Skill[lIlIlII[2]];
        skillArr7[lIlIlII[1]] = Skill.RANGED;
        DIVINE_RANGING_POTION = new J(str13, i20, str14, i21, i22, skillArr7);
        String str15 = lIlIIll[lIlIlII[16]];
        int i23 = lIlIlII[9];
        String str16 = lIlIIll[lIlIlII[4]];
        int i24 = lIlIlII[7];
        int i25 = lIlIlII[12];
        Skill[] skillArr8 = new Skill[lIlIlII[6]];
        skillArr8[lIlIlII[1]] = Skill.RANGED;
        skillArr8[lIlIlII[2]] = Skill.DEFENCE;
        BASTION_POTION = new J(str15, i23, str16, i24, i25, skillArr8);
        String str17 = lIlIIll[lIlIlII[17]];
        int i26 = lIlIlII[10];
        String str18 = lIlIIll[lIlIlII[18]];
        int i27 = lIlIlII[7];
        int i28 = lIlIlII[1];
        Skill[] skillArr9 = new Skill[lIlIlII[2]];
        skillArr9[lIlIlII[1]] = Skill.MAGIC;
        MAGIC_POTION = new J(str17, i26, str18, i27, i28, skillArr9);
        String str19 = lIlIIll[lIlIlII[19]];
        int i29 = lIlIlII[11];
        String str20 = lIlIIll[lIlIlII[20]];
        int i30 = lIlIlII[7];
        int i31 = lIlIlII[1];
        Skill[] skillArr10 = new Skill[lIlIlII[2]];
        skillArr10[lIlIlII[1]] = Skill.MAGIC;
        DIVINE_MAGIC_POTION = new J(str19, i29, str20, i30, i31, skillArr10);
        String str21 = lIlIIll[lIlIlII[21]];
        int i32 = lIlIlII[12];
        String str22 = lIlIIll[lIlIlII[22]];
        int i33 = lIlIlII[6];
        int i34 = lIlIlII[3];
        Skill[] skillArr11 = new Skill[lIlIlII[2]];
        skillArr11[lIlIlII[1]] = Skill.MAGIC;
        ANCIENT_BREW = new J(str21, i32, str22, i33, i34, skillArr11);
        J[] jArr = new J[lIlIlII[13]];
        jArr[lIlIlII[1]] = SUPER_COMBAT;
        jArr[lIlIlII[2]] = DIVINE_SUPER_COMBAT;
        jArr[lIlIlII[6]] = SUPER_STRENGTH;
        jArr[lIlIlII[5]] = SUPER_ATTACK;
        jArr[lIlIlII[7]] = SUPER_DEFENCE;
        jArr[lIlIlII[3]] = RANGING_POTION;
        jArr[lIlIlII[8]] = DIVINE_RANGING_POTION;
        jArr[lIlIlII[9]] = BASTION_POTION;
        jArr[lIlIlII[10]] = MAGIC_POTION;
        jArr[lIlIlII[11]] = DIVINE_MAGIC_POTION;
        jArr[lIlIlII[12]] = ANCIENT_BREW;
        $VALUES = jArr;
    }
}
