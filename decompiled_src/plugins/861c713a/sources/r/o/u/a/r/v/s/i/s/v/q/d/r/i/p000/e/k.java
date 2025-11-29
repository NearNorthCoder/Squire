package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.k  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/k.class */
public final class k {
    public static final /* synthetic */ k CASTING;
    private final /* synthetic */ String name;
    public static final /* synthetic */ k CONTROLLED;
    public static final /* synthetic */ k DEFENSIVE;
    private static final /* synthetic */ k[] $VALUES;
    public static final /* synthetic */ k OTHER;
    public static final /* synthetic */ k LONGRANGE;
    public static final /* synthetic */ k RANGING;
    public static final /* synthetic */ k ACCURATE;
    private static /* synthetic */ int[] lIlIlIIllIIll;
    private final /* synthetic */ Skill[] skills;
    public static final /* synthetic */ k DEFENSIVE_CASTING;
    private static /* synthetic */ String[] lIlIlIIlIIlIl;
    public static final /* synthetic */ k AGGRESSIVE;

    private static boolean lIlllllIIIlIIIl(int i, int i2) {
        return i < i2;
    }

    private static String lIllllIlllIllII(String llllllllllllllIllIlIlllIlIlIIIII, String llllllllllllllIllIlIlllIlIIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlllIlIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIllIIll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlllIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlllIlIlIIIIl) {
            llllllllllllllIllIlIlllIlIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlllllIIIlIIII() {
        lIlIlIIllIIll = new int[19];
        lIlIlIIllIIll[0] = ((86 ^ 99) ^ (70 ^ 42)) & (((41 ^ 52) ^ (236 ^ 168)) ^ (-" ".length()));
        lIlIlIIllIIll[1] = " ".length();
        lIlIlIIllIIll[2] = "  ".length();
        lIlIlIIllIIll[3] = "   ".length();
        lIlIlIIllIIll[4] = 65 ^ 69;
        lIlIlIIllIIll[5] = 124 ^ 121;
        lIlIlIIllIIll[6] = (((42 + 2) - 27) + 136) ^ (((155 + 151) - 195) + 48);
        lIlIlIIllIIll[7] = 172 ^ 171;
        lIlIlIIllIIll[8] = (((49 + 33) - 58) + 157) ^ (((96 + 117) - 105) + 81);
        lIlIlIIllIIll[9] = (169 ^ 141) ^ (67 ^ 110);
        lIlIlIIllIIll[10] = (((11 + 76) - 13) + 87) ^ (((128 + 15) - 77) + 105);
        lIlIlIIllIIll[11] = 27 ^ 16;
        lIlIlIIllIIll[12] = (17 ^ 90) ^ (211 ^ 148);
        lIlIlIIllIIll[13] = (((136 + 154) - 220) + 121) ^ (((148 + 168) - 149) + 11);
        lIlIlIIllIIll[14] = (((101 + 14) - 105) + 197) ^ (((8 + 94) - (-90)) + 1);
        lIlIlIIllIIll[15] = (158 ^ 190) ^ (50 ^ 29);
        lIlIlIIllIIll[16] = 10 ^ 26;
        lIlIlIIllIIll[17] = (227 ^ 165) ^ (227 ^ 180);
        lIlIlIIllIIll[18] = 66 ^ 80;
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    private static void lIlllllIIIIllll() {
        lIlIlIIlIIlIl = new String[lIlIlIIllIIll[18]];
        lIlIlIIlIIlIl[lIlIlIIllIIll[0]] = lIllllIlllIlIll("p/+iFZduDRghOmt0kGt2mw==", "feqIV");
        lIlIlIIlIIlIl[lIlIlIIllIIll[1]] = lIllllIlllIllII("9Sbcf4bvSYFlNvXZxK42Sw==", "YwBOj");
        lIlIlIIlIIlIl[lIlIlIIllIIll[2]] = lIllllIlllIllIl("EBYkIS4CAiolLg==", "QQcsk");
        lIlIlIIlIIlIl[lIlIlIIllIIll[3]] = lIllllIlllIllII("xURhizXg2ldqhZ0u+E1dqg==", "oNWsS");
        lIlIlIIlIIlIl[lIlIlIIllIIll[4]] = lIllllIlllIlIll("AJkpJMJ9CQ/mwvQRoF6oYg==", "owJtJ");
        lIlIlIIlIIlIl[lIlIlIIllIIll[5]] = lIllllIlllIllII("uA/N9sEO16TRJ84mEF72lA==", "Bbbfj");
        lIlIlIIlIIlIl[lIlIlIIllIIll[6]] = lIllllIlllIllII("XhcOCob02Rtag+oqk8lKqw==", "JyjNq");
        lIlIlIIlIIlIl[lIlIlIIllIIll[7]] = lIllllIlllIllIl("LCsWIQMAKBQwFQ==", "oDxUq");
        lIlIlIIlIIlIl[lIlIlIIllIIll[8]] = lIllllIlllIllII("yFXiFzY8sWQ=", "DwuqL");
        lIlIlIIlIIlIl[lIlIlIIllIIll[9]] = lIllllIlllIlIll("7aZ+ckR/V4A=", "fWQba");
        lIlIlIIlIIlIl[lIlIlIIllIIll[10]] = lIllllIlllIllII("iyNbLqVd6n2Y5wEFbhgb1Q==", "RqXQy");
        lIlIlIIlIIlIl[lIlIlIIllIIll[11]] = lIllllIlllIllIl("GT0BNj00PAg0", "URoQO");
        lIlIlIIlIIlIl[lIlIlIIllIIll[12]] = lIllllIlllIllIl("Nyo9Ljo6LA==", "tknzs");
        lIlIlIIlIIlIl[lIlIlIIllIIll[13]] = lIllllIlllIlIll("VnON+6JvvB0=", "zUzmg");
        lIlIlIIlIIlIl[lIlIlIIllIIll[14]] = lIllllIlllIllII("swNTeHk0Qjq1auuexsViar7PqHEl9lw/", "stmnS");
        lIlIlIIlIIlIl[lIlIlIIllIIll[15]] = lIllllIlllIllII("a8s3FGvn337RG4f0uw+2IJ+4Aen4Rb37", "Qgjzl");
        lIlIlIIlIIlIl[lIlIlIIllIIll[16]] = lIllllIlllIlIll("eU0+Oajhal4=", "CtXrs");
        lIlIlIIlIIlIl[lIlIlIIllIIll[17]] = lIllllIlllIllII("j6g0P29OJEk=", "Heqra");
    }

    private static String lIllllIlllIllIl(String llllllllllllllIllIlIlllIlIIlIIII, String llllllllllllllIllIlIlllIlIIIllll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlllIlIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIlIlllIlIIIllIl = llllllllllllllIllIlIlllIlIIIllll.toCharArray();
        int llllllllllllllIllIlIlllIlIIIllII = lIlIlIIllIIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlIIllIIll[0];
        while (lIlllllIIIlIIIl(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIllIlIlllIlIIIllIl[llllllllllllllIllIlIlllIlIIIllII % llllllllllllllIllIlIlllIlIIIllIl.length]));
            "".length();
            llllllllllllllIllIlIlllIlIIIllII++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIlllllIIIlIIII();
        lIlllllIIIIllll();
        String str = lIlIlIIlIIlIl[lIlIlIIllIIll[0]];
        int i = lIlIlIIllIIll[0];
        String str2 = lIlIlIIlIIlIl[lIlIlIIllIIll[1]];
        Skill[] skillArr = new Skill[lIlIlIIllIIll[1]];
        skillArr[lIlIlIIllIIll[0]] = Skill.ATTACK;
        ACCURATE = new k(str, i, str2, skillArr);
        String str3 = lIlIlIIlIIlIl[lIlIlIIllIIll[2]];
        int i2 = lIlIlIIllIIll[1];
        String str4 = lIlIlIIlIIlIl[lIlIlIIllIIll[3]];
        Skill[] skillArr2 = new Skill[lIlIlIIllIIll[1]];
        skillArr2[lIlIlIIllIIll[0]] = Skill.STRENGTH;
        AGGRESSIVE = new k(str3, i2, str4, skillArr2);
        String str5 = lIlIlIIlIIlIl[lIlIlIIllIIll[4]];
        int i3 = lIlIlIIllIIll[2];
        String str6 = lIlIlIIlIIlIl[lIlIlIIllIIll[5]];
        Skill[] skillArr3 = new Skill[lIlIlIIllIIll[1]];
        skillArr3[lIlIlIIllIIll[0]] = Skill.DEFENCE;
        DEFENSIVE = new k(str5, i3, str6, skillArr3);
        String str7 = lIlIlIIlIIlIl[lIlIlIIllIIll[6]];
        int i4 = lIlIlIIllIIll[3];
        String str8 = lIlIlIIlIIlIl[lIlIlIIllIIll[7]];
        Skill[] skillArr4 = new Skill[lIlIlIIllIIll[3]];
        skillArr4[lIlIlIIllIIll[0]] = Skill.ATTACK;
        skillArr4[lIlIlIIllIIll[1]] = Skill.STRENGTH;
        skillArr4[lIlIlIIllIIll[2]] = Skill.DEFENCE;
        CONTROLLED = new k(str7, i4, str8, skillArr4);
        String str9 = lIlIlIIlIIlIl[lIlIlIIllIIll[8]];
        int i5 = lIlIlIIllIIll[4];
        String str10 = lIlIlIIlIIlIl[lIlIlIIllIIll[9]];
        Skill[] skillArr5 = new Skill[lIlIlIIllIIll[1]];
        skillArr5[lIlIlIIllIIll[0]] = Skill.RANGED;
        RANGING = new k(str9, i5, str10, skillArr5);
        String str11 = lIlIlIIlIIlIl[lIlIlIIllIIll[10]];
        int i6 = lIlIlIIllIIll[5];
        String str12 = lIlIlIIlIIlIl[lIlIlIIllIIll[11]];
        Skill[] skillArr6 = new Skill[lIlIlIIllIIll[2]];
        skillArr6[lIlIlIIllIIll[0]] = Skill.RANGED;
        skillArr6[lIlIlIIllIIll[1]] = Skill.DEFENCE;
        LONGRANGE = new k(str11, i6, str12, skillArr6);
        String str13 = lIlIlIIlIIlIl[lIlIlIIllIIll[12]];
        int i7 = lIlIlIIllIIll[6];
        String str14 = lIlIlIIlIIlIl[lIlIlIIllIIll[13]];
        Skill[] skillArr7 = new Skill[lIlIlIIllIIll[1]];
        skillArr7[lIlIlIIllIIll[0]] = Skill.MAGIC;
        CASTING = new k(str13, i7, str14, skillArr7);
        String str15 = lIlIlIIlIIlIl[lIlIlIIllIIll[14]];
        int i8 = lIlIlIIllIIll[7];
        String str16 = lIlIlIIlIIlIl[lIlIlIIllIIll[15]];
        Skill[] skillArr8 = new Skill[lIlIlIIllIIll[2]];
        skillArr8[lIlIlIIllIIll[0]] = Skill.MAGIC;
        skillArr8[lIlIlIIllIIll[1]] = Skill.DEFENCE;
        DEFENSIVE_CASTING = new k(str15, i8, str16, skillArr8);
        OTHER = new k(lIlIlIIlIIlIl[lIlIlIIllIIll[16]], lIlIlIIllIIll[8], lIlIlIIlIIlIl[lIlIlIIllIIll[17]], new Skill[lIlIlIIllIIll[0]]);
        k[] kVarArr = new k[lIlIlIIllIIll[9]];
        kVarArr[lIlIlIIllIIll[0]] = ACCURATE;
        kVarArr[lIlIlIIllIIll[1]] = AGGRESSIVE;
        kVarArr[lIlIlIIllIIll[2]] = DEFENSIVE;
        kVarArr[lIlIlIIllIIll[3]] = CONTROLLED;
        kVarArr[lIlIlIIllIIll[4]] = RANGING;
        kVarArr[lIlIlIIllIIll[5]] = LONGRANGE;
        kVarArr[lIlIlIIllIIll[6]] = CASTING;
        kVarArr[lIlIlIIllIIll[7]] = DEFENSIVE_CASTING;
        kVarArr[lIlIlIIllIIll[8]] = OTHER;
        $VALUES = kVarArr;
    }

    private static String lIllllIlllIlIll(String llllllllllllllIllIlIlllIlIlIllIl, String llllllllllllllIllIlIlllIlIlIllII) {
        try {
            SecretKeySpec llllllllllllllIllIlIlllIlIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlllIlIlIllII.getBytes(StandardCharsets.UTF_8)), lIlIlIIllIIll[8]), "DES");
            Cipher llllllllllllllIllIlIlllIlIlIllll = Cipher.getInstance("DES");
            llllllllllllllIllIlIlllIlIlIllll.init(lIlIlIIllIIll[2], llllllllllllllIllIlIlllIlIllIIII);
            return new String(llllllllllllllIllIlIlllIlIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlllIlIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlllIlIlIlllI) {
            llllllllllllllIllIlIlllIlIlIlllI.printStackTrace();
            return null;
        }
    }

    private k(String str, int i, String str2, Skill... skillArr) {
        this.name = str2;
        this.skills = skillArr;
    }

    public Skill[] N() {
        return this.skills;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public String M() {
        return this.name;
    }
}
