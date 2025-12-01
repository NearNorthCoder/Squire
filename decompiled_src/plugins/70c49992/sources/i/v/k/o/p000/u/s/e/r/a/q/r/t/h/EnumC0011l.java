package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.l  reason: invalid package and case insensitive filesystem */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/l.class */
public final class EnumC0011l {
    public static final /* synthetic */ EnumC0011l ANTI_VENOM;
    private static /* synthetic */ int[] lIlIlIllllIIl;
    private final /* synthetic */ String name;
    public static final /* synthetic */ EnumC0011l ANTI_VENOM_PLUS;
    private static /* synthetic */ String[] lIlIlIllllIII;
    public static final /* synthetic */ EnumC0011l CURE_SELF;
    private final /* synthetic */ List<Integer> items;
    public static final /* synthetic */ EnumC0011l IGNORE;
    public static final /* synthetic */ EnumC0011l ANTI_DOTE;
    private static final /* synthetic */ EnumC0011l[] $VALUES;
    public static final /* synthetic */ EnumC0011l ANTI_POISON;

    static {
        lIlllllllllIlII();
        lIlllllllllIIll();
        String str = lIlIlIllllIII[lIlIlIllllIIl[1]];
        int i2 = lIlIlIllllIIl[0];
        String str2 = lIlIlIllllIII[lIlIlIllllIIl[2]];
        int[] iArr = new int[lIlIlIllllIIl[3]];
        iArr[lIlIlIllllIIl[0]] = lIlIlIllllIIl[4];
        iArr[lIlIlIllllIIl[1]] = lIlIlIllllIIl[5];
        iArr[lIlIlIllllIIl[2]] = lIlIlIllllIIl[6];
        iArr[lIlIlIllllIIl[7]] = lIlIlIllllIIl[8];
        ANTI_VENOM_PLUS = new EnumC0011l(str, i2, str2, iArr);
        String str3 = lIlIlIllllIII[lIlIlIllllIIl[7]];
        int i3 = lIlIlIllllIIl[1];
        String str4 = lIlIlIllllIII[lIlIlIllllIIl[3]];
        int[] iArr2 = new int[lIlIlIllllIIl[3]];
        iArr2[lIlIlIllllIIl[0]] = lIlIlIllllIIl[9];
        iArr2[lIlIlIllllIIl[1]] = lIlIlIllllIIl[10];
        iArr2[lIlIlIllllIIl[2]] = lIlIlIllllIIl[11];
        iArr2[lIlIlIllllIIl[7]] = lIlIlIllllIIl[12];
        ANTI_VENOM = new EnumC0011l(str3, i3, str4, iArr2);
        String str5 = lIlIlIllllIII[lIlIlIllllIIl[13]];
        int i4 = lIlIlIllllIIl[2];
        String str6 = lIlIlIllllIII[lIlIlIllllIIl[14]];
        int[] iArr3 = new int[lIlIlIllllIIl[2]];
        iArr3[lIlIlIllllIIl[0]] = lIlIlIllllIIl[15];
        iArr3[lIlIlIllllIIl[1]] = lIlIlIllllIIl[16];
        ANTI_DOTE = new EnumC0011l(str5, i4, str6, iArr3);
        String str7 = lIlIlIllllIII[lIlIlIllllIIl[17]];
        int i5 = lIlIlIllllIIl[7];
        String str8 = lIlIlIllllIII[lIlIlIllllIIl[18]];
        int[] iArr4 = new int[lIlIlIllllIIl[2]];
        iArr4[lIlIlIllllIIl[0]] = lIlIlIllllIIl[19];
        iArr4[lIlIlIllllIIl[1]] = lIlIlIllllIIl[20];
        ANTI_POISON = new EnumC0011l(str7, i5, str8, iArr4);
        String str9 = lIlIlIllllIII[lIlIlIllllIIl[21]];
        int i6 = lIlIlIllllIIl[3];
        int[] iArr5 = new int[lIlIlIllllIIl[2]];
        iArr5[lIlIlIllllIIl[0]] = lIlIlIllllIIl[22];
        iArr5[lIlIlIllllIIl[1]] = lIlIlIllllIIl[23];
        CURE_SELF = new EnumC0011l(str9, i6, iArr5);
        IGNORE = new EnumC0011l(lIlIlIllllIII[lIlIlIllllIIl[24]], lIlIlIllllIIl[13], new int[lIlIlIllllIIl[0]]);
        EnumC0011l[] enumC0011lArr = new EnumC0011l[lIlIlIllllIIl[14]];
        enumC0011lArr[lIlIlIllllIIl[0]] = ANTI_VENOM_PLUS;
        enumC0011lArr[lIlIlIllllIIl[1]] = ANTI_VENOM;
        enumC0011lArr[lIlIlIllllIIl[2]] = ANTI_DOTE;
        enumC0011lArr[lIlIlIllllIIl[7]] = ANTI_POISON;
        enumC0011lArr[lIlIlIllllIIl[3]] = CURE_SELF;
        enumC0011lArr[lIlIlIllllIIl[13]] = IGNORE;
        $VALUES = enumC0011lArr;
    }

    public String M() {
        return this.name;
    }

    private static String lIlllllllllIIII(String llllllllllllllIllIlIlIIIIIlllllI, String llllllllllllllIllIlIlIIIIIllllIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIIIIIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIlIIIIIllllIl.toCharArray();
        int llllllllllllllIllIlIlIIIIIlllIlI = lIlIlIllllIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int llllllllllllllIllIlIlIIIIIllIIlI = lIlIlIllllIIl[0];
        while (lIlllllllllIlIl(llllllllllllllIllIlIlIIIIIllIIlI, length)) {
            sb.append((char) (charArray2[llllllllllllllIllIlIlIIIIIllIIlI] ^ charArray[llllllllllllllIllIlIlIIIIIlllIlI % charArray.length]));
            "".length();
            llllllllllllllIllIlIlIIIIIlllIlI++;
            llllllllllllllIllIlIlIIIIIllIIlI++;
            "".length();
            if ("   ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlllllllllIlIl(int i2, int i3) {
        return i2 < i3;
    }

    private static void lIlllllllllIIll() {
        lIlIlIllllIII = new String[lIlIlIllllIIl[25]];
        lIlIlIllllIII[lIlIlIllllIIl[0]] = lIlllllllllIIII("", "szBRv");
        lIlIlIllllIII[lIlIlIllllIIl[1]] = lIlllllllllIIIl("R9CnVFCmroWykKIb7j/BjQ==", "mUzDN");
        lIlIlIllllIII[lIlIlIllllIIl[2]] = lIlllllllllIIII("EAQmBV8nDzwDHw==", "QjRlr");
        lIlIlIllllIII[lIlIlIllllIIl[7]] = lIlllllllllIIII("JwkQLjEwAgooIw==", "fGDgn");
        lIlIlIllllIII[lIlIlIllllIIl[3]] = lIlllllllllIIlI("tFprbQ59Kc4DqVMWyUfKtA==", "sSsbE");
        lIlIlIllllIII[lIlIlIllllIIl[13]] = lIlllllllllIIII("NwAsETMyASwd", "vNxXl");
        lIlIlIllllIII[lIlIlIllllIIl[14]] = lIlllllllllIIIl("Qu8xIQCkU00f7C7LHkTgug==", "Zdylg");
        lIlIlIllllIII[lIlIlIllllIIl[17]] = lIlllllllllIIlI("4hXOpSmNVr2G2o4hS+DKUw==", "vYfrt");
        lIlIlIllllIII[lIlIlIllllIIl[18]] = lIlllllllllIIlI("IXVthsJnuNt8Ou2cIo/FOw==", "ETZCV");
        lIlIlIllllIII[lIlIlIllllIIl[21]] = lIlllllllllIIII("LiIePSg+MgA+", "mwLxw");
        lIlIlIllllIII[lIlIlIllllIIl[24]] = lIlllllllllIIlI("cJtmiH58B7Q=", "dBFfq");
    }

    public List<Integer> P() {
        return this.items;
    }

    public static EnumC0011l[] values() {
        return (EnumC0011l[]) $VALUES.clone();
    }

    private static String lIlllllllllIIIl(String llllllllllllllIllIlIlIIIIIIllIlI, String llllllllllllllIllIlIlIIIIIIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIIIIIIllIll.getBytes(StandardCharsets.UTF_8)), lIlIlIllllIIl[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIllllIIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIIIIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIIIIIIlllIl) {
            llllllllllllllIllIlIlIIIIIIlllIl.printStackTrace();
            return null;
        }
    }

    private static void lIlllllllllIlII() {
        lIlIlIllllIIl = new int[26];
        lIlIlIllllIIl[0] = ((((14 + 109) - 77) + 96) ^ (((24 + 100) - (-34)) + 41)) & (((42 ^ 31) ^ (62 ^ 66)) ^ (-" ".length()));
        lIlIlIllllIIl[1] = " ".length();
        lIlIlIllllIIl[2] = "  ".length();
        lIlIlIllllIIl[3] = (97 ^ 50) ^ (239 ^ 184);
        lIlIlIllllIIl[4] = (-((-16405) & 17695)) & (-18561) & 32763;
        lIlIlIllllIIl[5] = (-18689) & 31603;
        lIlIlIllllIIl[6] = (-18571) & 31487;
        lIlIlIllllIIl[7] = "   ".length();
        lIlIlIllllIIl[8] = (-((-12625) & 32217)) & (-257) & 32767;
        lIlIlIllllIIl[9] = (-2055) & 14959;
        lIlIlIllllIIl[10] = (-((-13363) & 15667)) & (-16385) & 31599;
        lIlIlIllllIIl[11] = (-((-18485) & 19637)) & (-18451) & 32511;
        lIlIlIllllIIl[12] = (-((-5377) & 23957)) & (-1281) & 32767;
        lIlIlIllllIIl[13] = 144 ^ 149;
        lIlIlIllllIIl[14] = 45 ^ 43;
        lIlIlIllllIIl[15] = (-10313) & 16255;
        lIlIlIllllIIl[16] = (-2085) & 8036;
        lIlIlIllllIIl[17] = 171 ^ 172;
        lIlIlIllllIIl[18] = 112 ^ 120;
        lIlIlIllllIIl[19] = (-((-18561) & 22766)) & (-8707) & 15359;
        lIlIlIllllIIl[20] = (-((-24586) & 25195)) & (-4113) & 7167;
        lIlIlIllllIIl[21] = (108 ^ 113) ^ (142 ^ 154);
        lIlIlIllllIIl[22] = (-1545) & 14335;
        lIlIlIllllIIl[23] = (-4417) & 31697;
        lIlIlIllllIIl[24] = (((121 + 91) - 70) + 64) ^ (((151 + 176) - 238) + 107);
        lIlIlIllllIIl[25] = 86 ^ 93;
    }

    private static String lIlllllllllIIlI(String llllllllllllllIllIlIlIIIIIlIlIIl, String llllllllllllllIllIlIlIIIIIlIlIII) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIIIIIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIIIIIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIllllIIl[2], llllllllllllllIllIlIlIIIIIlIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIIIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIIIIIlIlIlI) {
            llllllllllllllIllIlIlIIIIIlIlIlI.printStackTrace();
            return null;
        }
    }

    private EnumC0011l(String str, int i2, int... iArr) {
        this(str, i2, lIlIlIllllIII[lIlIlIllllIIl[0]], iArr);
    }

    private EnumC0011l(String str, int i2, String str2, int... iArr) {
        this.name = str2;
        this.items = new ArrayList();
        int length = iArr.length;
        int i3 = lIlIlIllllIIl[0];
        while (lIlllllllllIlIl(i3, length)) {
            this.items.add(Integer.valueOf(iArr[i3]));
            "".length();
            i3++;
            "".length();
            if ((54 ^ 50) <= 0) {
                throw null;
            }
        }
    }

    public static EnumC0011l valueOf(String str) {
        return (EnumC0011l) Enum.valueOf(EnumC0011l.class, str);
    }
}
