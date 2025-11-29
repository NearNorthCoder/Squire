package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

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
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.b  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/b.class */
public final class b {
    private final /* synthetic */ Skill[] skills;
    public static final /* synthetic */ b BASTION_POTION;
    public static final /* synthetic */ b DIVINE_RANGING_POTION;
    public static final /* synthetic */ b DIVINE_MAGIC_POTION;
    public static final /* synthetic */ b DIVINE_SUPER_COMBAT;
    private final /* synthetic */ String name;
    public static final /* synthetic */ b RANGING_POTION;
    private static /* synthetic */ String[] llIIlIlIlIll;
    private static /* synthetic */ int[] llIIlIlIllII;
    public static final /* synthetic */ b MAGIC_POTION;
    public static final /* synthetic */ b SUPER_ATTACK;
    public static final /* synthetic */ b SUPER_DEFENCE;
    private static final /* synthetic */ b[] $VALUES;
    private final /* synthetic */ int percentage;
    public static final /* synthetic */ b ANCIENT_BREW;
    public static final /* synthetic */ b SUPER_STRENGTH;
    public static final /* synthetic */ b SUPER_COMBAT;
    private final /* synthetic */ int boostAmount;

    private static String lllllIlIllIlIl(String lllllllllllllllIlIIllllIllIIIIll, String lllllllllllllllIlIIllllIllIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllIllIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIllIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllllIllIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllllIllIIIlIl.init(llIIlIlIllII[6], lllllllllllllllIlIIllllIllIIIllI);
            return new String(lllllllllllllllIlIIllllIllIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllllIllIIIlII) {
            lllllllllllllllIlIIllllIllIIIlII.printStackTrace();
            return null;
        }
    }

    private b(String str, int i, String str2, int i2, int i3, Skill... skillArr) {
        this.name = str2;
        this.percentage = i3;
        this.skills = skillArr;
        this.boostAmount = i2;
    }

    private static void lllllIlIllIllI() {
        llIIlIlIlIll = new String[llIIlIlIllII[23]];
        llIIlIlIlIll[llIIlIlIllII[1]] = lllllIlIllIIll("BTonDxgJLDgHCBc7", "VowJJ");
        llIIlIlIlIll[llIIlIlIllII[2]] = lllllIlIllIlII("oqDoOn15R9Q8oLwFiipaERbs2R5vRrGF", "uiYIZ");
        llIIlIlIlIll[llIIlIlIllII[6]] = lllllIlIllIlII("hr6PfFthM/v7RlfcmxEne0/R1Q9SZ0LV", "JZXlb");
        llIIlIlIlIll[llIIlIlIllII[5]] = lllllIlIllIlIl("/3nlX0umWIh8YTsCfhdTkPNYyfEOqv3i33mkq89Nx5g=", "rbOzG");
        llIIlIlIlIll[llIIlIlIllII[7]] = lllllIlIllIlII("kNr2gGoZjpaHxBDL5Kwqhg==", "muUwO");
        llIIlIlIlIll[llIIlIlIllII[3]] = lllllIlIllIlIl("Jra5vVc/XffCWVDNbP9V0A==", "nxiNR");
        llIIlIlIlIll[llIIlIlIllII[8]] = lllllIlIllIIll("PDAxAx0wJDUSDiwu", "oeaFO");
        llIIlIlIlIll[llIIlIlIllII[9]] = lllllIlIllIIll("GT46DgpqKj4fGSkg", "JKJkx");
        llIIlIlIlIll[llIIlIlIllII[10]] = lllllIlIllIlIl("sVloPJOe6kGPNLmWLFS8VA==", "ihGMx");
        llIIlIlIlIll[llIIlIlIllII[11]] = lllllIlIllIlII("jtc3QnCNFDkvQM9igGTyPg==", "nWsKn");
        llIIlIlIlIll[llIIlIlIllII[12]] = lllllIlIllIlII("Nl0v4RaxoBN6OA6pJRiW5A==", "QQOpn");
        llIIlIlIlIll[llIIlIlIllII[13]] = lllllIlIllIlII("cT9ocdGUS8lhNZDrc03orA==", "lQzvP");
        llIIlIlIlIll[llIIlIlIllII[14]] = lllllIlIllIlII("PGTKFfEf2JBBK8Pcfi4K4YDK03x/rulT", "hMObH");
        llIIlIlIlIll[llIIlIlIllII[15]] = lllllIlIllIlII("Ctoml4dUU0jocbYtCMN0ZcwPa0+y7pJ3", "nJRdi");
        llIIlIlIlIll[llIIlIlIllII[16]] = lllllIlIllIIll("EScRFwccKB0TAQcvDQ0=", "SfBCN");
        llIIlIlIlIll[llIIlIlIllII[4]] = lllllIlIllIlIl("K8BO/Ab3Bn7ar+uf8hGhAw==", "wTgoP");
        llIIlIlIlIll[llIIlIlIllII[17]] = lllllIlIllIIll("NCwUHC4mPRwBJDYj", "ymSUm");
        llIIlIlIlIll[llIIlIlIllII[18]] = lllllIlIllIIll("PjAXOzNTIR8mORw/", "sQpRP");
        llIIlIlIlIll[llIIlIlIllII[19]] = lllllIlIllIlII("fJ/sz8eSjlen6Ct86edSP5yTScAeq1U/", "PrCQq");
        llIIlIlIlIll[llIIlIlIllII[20]] = lllllIlIllIlII("UmIJ/SQcRgq7ehlkloOp3GxP0+yTahNI", "MISZl");
        llIIlIlIlIll[llIIlIlIllII[21]] = lllllIlIllIlII("aW2QLDRLzME2trUwKpZRVg==", "jJOtm");
        llIIlIlIlIll[llIIlIlIllII[22]] = lllllIlIllIlIl("ptD9ibqp7RQtW7Lx5p2tUw==", "GkFRo");
    }

    public int a(Skill skill) {
        return this.boostAmount + ((Skills.getLevel(skill) * this.percentage) / llIIlIlIllII[0]);
    }

    static {
        lllllIlIllIlll();
        lllllIlIllIllI();
        String str = llIIlIlIlIll[llIIlIlIllII[1]];
        int i = llIIlIlIllII[1];
        String str2 = llIIlIlIlIll[llIIlIlIllII[2]];
        int i2 = llIIlIlIllII[3];
        int i3 = llIIlIlIllII[4];
        Skill[] skillArr = new Skill[llIIlIlIllII[5]];
        skillArr[llIIlIlIllII[1]] = Skill.STRENGTH;
        skillArr[llIIlIlIllII[2]] = Skill.ATTACK;
        skillArr[llIIlIlIllII[6]] = Skill.DEFENCE;
        SUPER_COMBAT = new b(str, i, str2, i2, i3, skillArr);
        String str3 = llIIlIlIlIll[llIIlIlIllII[6]];
        int i4 = llIIlIlIllII[2];
        String str4 = llIIlIlIlIll[llIIlIlIllII[5]];
        int i5 = llIIlIlIllII[3];
        int i6 = llIIlIlIllII[4];
        Skill[] skillArr2 = new Skill[llIIlIlIllII[5]];
        skillArr2[llIIlIlIllII[1]] = Skill.STRENGTH;
        skillArr2[llIIlIlIllII[2]] = Skill.ATTACK;
        skillArr2[llIIlIlIllII[6]] = Skill.DEFENCE;
        DIVINE_SUPER_COMBAT = new b(str3, i4, str4, i5, i6, skillArr2);
        String str5 = llIIlIlIlIll[llIIlIlIllII[7]];
        int i7 = llIIlIlIllII[6];
        String str6 = llIIlIlIlIll[llIIlIlIllII[3]];
        int i8 = llIIlIlIllII[3];
        int i9 = llIIlIlIllII[4];
        Skill[] skillArr3 = new Skill[llIIlIlIllII[2]];
        skillArr3[llIIlIlIllII[1]] = Skill.STRENGTH;
        SUPER_STRENGTH = new b(str5, i7, str6, i8, i9, skillArr3);
        String str7 = llIIlIlIlIll[llIIlIlIllII[8]];
        int i10 = llIIlIlIllII[5];
        String str8 = llIIlIlIlIll[llIIlIlIllII[9]];
        int i11 = llIIlIlIllII[3];
        int i12 = llIIlIlIllII[4];
        Skill[] skillArr4 = new Skill[llIIlIlIllII[2]];
        skillArr4[llIIlIlIllII[1]] = Skill.ATTACK;
        SUPER_ATTACK = new b(str7, i10, str8, i11, i12, skillArr4);
        String str9 = llIIlIlIlIll[llIIlIlIllII[10]];
        int i13 = llIIlIlIllII[7];
        String str10 = llIIlIlIlIll[llIIlIlIllII[11]];
        int i14 = llIIlIlIllII[3];
        int i15 = llIIlIlIllII[4];
        Skill[] skillArr5 = new Skill[llIIlIlIllII[2]];
        skillArr5[llIIlIlIllII[1]] = Skill.DEFENCE;
        SUPER_DEFENCE = new b(str9, i13, str10, i14, i15, skillArr5);
        String str11 = llIIlIlIlIll[llIIlIlIllII[12]];
        int i16 = llIIlIlIllII[3];
        String str12 = llIIlIlIlIll[llIIlIlIllII[13]];
        int i17 = llIIlIlIllII[7];
        int i18 = llIIlIlIllII[12];
        Skill[] skillArr6 = new Skill[llIIlIlIllII[2]];
        skillArr6[llIIlIlIllII[1]] = Skill.RANGED;
        RANGING_POTION = new b(str11, i16, str12, i17, i18, skillArr6);
        String str13 = llIIlIlIlIll[llIIlIlIllII[14]];
        int i19 = llIIlIlIllII[8];
        String str14 = llIIlIlIlIll[llIIlIlIllII[15]];
        int i20 = llIIlIlIllII[7];
        int i21 = llIIlIlIllII[12];
        Skill[] skillArr7 = new Skill[llIIlIlIllII[2]];
        skillArr7[llIIlIlIllII[1]] = Skill.RANGED;
        DIVINE_RANGING_POTION = new b(str13, i19, str14, i20, i21, skillArr7);
        String str15 = llIIlIlIlIll[llIIlIlIllII[16]];
        int i22 = llIIlIlIllII[9];
        String str16 = llIIlIlIlIll[llIIlIlIllII[4]];
        int i23 = llIIlIlIllII[7];
        int i24 = llIIlIlIllII[12];
        Skill[] skillArr8 = new Skill[llIIlIlIllII[6]];
        skillArr8[llIIlIlIllII[1]] = Skill.RANGED;
        skillArr8[llIIlIlIllII[2]] = Skill.DEFENCE;
        BASTION_POTION = new b(str15, i22, str16, i23, i24, skillArr8);
        String str17 = llIIlIlIlIll[llIIlIlIllII[17]];
        int i25 = llIIlIlIllII[10];
        String str18 = llIIlIlIlIll[llIIlIlIllII[18]];
        int i26 = llIIlIlIllII[7];
        int i27 = llIIlIlIllII[1];
        Skill[] skillArr9 = new Skill[llIIlIlIllII[2]];
        skillArr9[llIIlIlIllII[1]] = Skill.MAGIC;
        MAGIC_POTION = new b(str17, i25, str18, i26, i27, skillArr9);
        String str19 = llIIlIlIlIll[llIIlIlIllII[19]];
        int i28 = llIIlIlIllII[11];
        String str20 = llIIlIlIlIll[llIIlIlIllII[20]];
        int i29 = llIIlIlIllII[7];
        int i30 = llIIlIlIllII[1];
        Skill[] skillArr10 = new Skill[llIIlIlIllII[2]];
        skillArr10[llIIlIlIllII[1]] = Skill.MAGIC;
        DIVINE_MAGIC_POTION = new b(str19, i28, str20, i29, i30, skillArr10);
        String str21 = llIIlIlIlIll[llIIlIlIllII[21]];
        int i31 = llIIlIlIllII[12];
        String str22 = llIIlIlIlIll[llIIlIlIllII[22]];
        int i32 = llIIlIlIllII[6];
        int i33 = llIIlIlIllII[3];
        Skill[] skillArr11 = new Skill[llIIlIlIllII[2]];
        skillArr11[llIIlIlIllII[1]] = Skill.MAGIC;
        ANCIENT_BREW = new b(str21, i31, str22, i32, i33, skillArr11);
        b[] bVarArr = new b[llIIlIlIllII[13]];
        bVarArr[llIIlIlIllII[1]] = SUPER_COMBAT;
        bVarArr[llIIlIlIllII[2]] = DIVINE_SUPER_COMBAT;
        bVarArr[llIIlIlIllII[6]] = SUPER_STRENGTH;
        bVarArr[llIIlIlIllII[5]] = SUPER_ATTACK;
        bVarArr[llIIlIlIllII[7]] = SUPER_DEFENCE;
        bVarArr[llIIlIlIllII[3]] = RANGING_POTION;
        bVarArr[llIIlIlIllII[8]] = DIVINE_RANGING_POTION;
        bVarArr[llIIlIlIllII[9]] = BASTION_POTION;
        bVarArr[llIIlIlIllII[10]] = MAGIC_POTION;
        bVarArr[llIIlIlIllII[11]] = DIVINE_MAGIC_POTION;
        bVarArr[llIIlIlIllII[12]] = ANCIENT_BREW;
        $VALUES = bVarArr;
    }

    private static void lllllIlIllIlll() {
        llIIlIlIllII = new int[24];
        llIIlIlIllII[0] = 222 ^ 186;
        llIIlIlIllII[1] = (180 ^ 146) & ((133 ^ 163) ^ (-1));
        llIIlIlIllII[2] = " ".length();
        llIIlIlIllII[3] = 123 ^ 126;
        llIIlIlIllII[4] = 18 ^ 29;
        llIIlIlIllII[5] = "   ".length();
        llIIlIlIllII[6] = "  ".length();
        llIIlIlIllII[7] = 180 ^ 176;
        llIIlIlIllII[8] = 9 ^ 15;
        llIIlIlIllII[9] = 66 ^ 69;
        llIIlIlIllII[10] = 4 ^ 12;
        llIIlIlIllII[11] = (111 ^ 54) ^ (209 ^ 129);
        llIIlIlIllII[12] = 29 ^ 23;
        llIIlIlIllII[13] = (183 ^ 160) ^ (120 ^ 100);
        llIIlIlIllII[14] = 182 ^ 186;
        llIIlIlIllII[15] = 7 ^ 10;
        llIIlIlIllII[16] = 185 ^ 183;
        llIIlIlIllII[17] = 117 ^ 101;
        llIIlIlIllII[18] = (((164 + 54) - 212) + 181) ^ (((140 + 33) - 20) + 17);
        llIIlIlIllII[19] = (((145 + 142) - 221) + 105) ^ (((96 + 24) - (-19)) + 46);
        llIIlIlIllII[20] = (((81 + 88) - 135) + 94) ^ (((90 + 108) - 148) + 97);
        llIIlIlIllII[21] = 83 ^ 71;
        llIIlIlIllII[22] = (31 ^ 126) ^ (5 ^ 113);
        llIIlIlIllII[23] = (20 ^ 32) ^ (177 ^ 147);
    }

    private static String lllllIlIllIIll(String lllllllllllllllIlIIllllIlIllIIll, String lllllllllllllllIlIIllllIlIllIIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllllIlIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIllllIlIllIIlI.toCharArray();
        int lllllllllllllllIlIIllllIlIlIllll = llIIlIlIllII[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIlIlIllII[1];
        while (lllllIlIlllIII(i, length)) {
            char lllllllllllllllIlIIllllIlIllIlII = charArray2[i];
            sb.append((char) (lllllllllllllllIlIIllllIlIllIlII ^ charArray[lllllllllllllllIlIIllllIlIlIllll % charArray.length]));
            "".length();
            lllllllllllllllIlIIllllIlIlIllll++;
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public Skill[] k() {
        return this.skills;
    }

    public String j() {
        return this.name;
    }

    private static String lllllIlIllIlII(String lllllllllllllllIlIIllllIlIIllllI, String lllllllllllllllIlIIllllIlIIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllIlIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIlIIlllIl.getBytes(StandardCharsets.UTF_8)), llIIlIlIllII[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIlIllII[6], lllllllllllllllIlIIllllIlIlIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIlIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllllIlIIlllll) {
            lllllllllllllllIlIIllllIlIIlllll.printStackTrace();
            return null;
        }
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    private static boolean lllllIlIlllIII(int i, int i2) {
        return i < i2;
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
