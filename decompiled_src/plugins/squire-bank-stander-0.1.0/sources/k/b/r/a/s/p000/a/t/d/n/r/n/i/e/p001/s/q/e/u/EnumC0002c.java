package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.c  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/c.class */
public final class EnumC0002c {
    private final /* synthetic */ int requiredToMake;
    public static final /* synthetic */ EnumC0002c BLUE_DHIDE_CHAPS;
    private static /* synthetic */ String[] lllIIIlIIII;
    public static final /* synthetic */ EnumC0002c RED_DHIDE_VAMBRACES;
    private final /* synthetic */ String name;
    private final /* synthetic */ int level;
    public static final /* synthetic */ EnumC0002c GREEN_DHIDE_BODY;
    private static /* synthetic */ int[] lllIIIlIIIl;
    public static final /* synthetic */ EnumC0002c BLACK_DHIDE_CHAPS;
    private static final /* synthetic */ EnumC0002c[] $VALUES;
    private final /* synthetic */ int amountToWithdraw;
    public static final /* synthetic */ EnumC0002c RED_DHIDE_CHAPS;
    public static final /* synthetic */ EnumC0002c BLUE_DHIDE_BODY;
    public static final /* synthetic */ EnumC0002c GREEN_DHIDE_VAMBRACES;
    public static final /* synthetic */ EnumC0002c BLACK_DHIDE_BODY;
    public static final /* synthetic */ EnumC0002c GREEN_DHIDE_CHAPS;
    public static final /* synthetic */ EnumC0002c BLACK_DHIDE_VAMBRACES;
    public static final /* synthetic */ EnumC0002c BLUE_DHIDE_VAMBRACES;
    public static final /* synthetic */ EnumC0002c RED_DHIDE_BODY;
    private final /* synthetic */ int materials;

    public int m() {
        return this.amountToWithdraw;
    }

    private static void lIlIllIIllIlIl() {
        lllIIIlIIIl = new int[41];
        lllIIIlIIIl[0] = (0 ^ 57) & ((14 ^ 55) ^ (-1));
        lllIIIlIIIl[1] = " ".length();
        lllIIIlIIIl[2] = 99 ^ 90;
        lllIIIlIIIl[3] = (-((-513) & 27437)) & (-4097) & 32765;
        lllIIIlIIIl[4] = 34 ^ 56;
        lllIIIlIIIl[5] = "  ".length();
        lllIIIlIIIl[6] = "   ".length();
        lllIIIlIIIl[7] = (36 ^ 116) ^ (23 ^ 123);
        lllIIIlIIIl[8] = 80 ^ 84;
        lllIIIlIIIl[9] = (123 ^ 9) ^ (214 ^ 161);
        lllIIIlIIIl[10] = 185 ^ 134;
        lllIIIlIIIl[11] = 132 ^ 156;
        lllIIIlIIIl[12] = 66 ^ 68;
        lllIIIlIIIl[13] = 123 ^ 124;
        lllIIIlIIIl[14] = 35 ^ 97;
        lllIIIlIIIl[15] = (-17937) & 20441;
        lllIIIlIIIl[16] = (86 ^ 90) ^ (16 ^ 20);
        lllIIIlIIIl[17] = (154 ^ 170) ^ (180 ^ 141);
        lllIIIlIIIl[18] = (((9 + 216) - 146) + 163) ^ (((154 + 76) - 221) + 173);
        lllIIIlIIIl[19] = 206 ^ 196;
        lllIIIlIIIl[20] = (((87 + 116) - 150) + 83) ^ (((114 + 51) - 130) + 96);
        lllIIIlIIIl[21] = 165 ^ 169;
        lllIIIlIIIl[22] = (134 ^ 139) ^ ((42 ^ 11) & ((19 ^ 50) ^ (-1)));
        lllIIIlIIIl[23] = (((20 + 50) - (-88)) + 81) ^ (((149 + 52) - 172) + 137);
        lllIIIlIIIl[24] = (-22065) & 24571;
        lllIIIlIIIl[25] = 42 ^ 36;
        lllIIIlIIIl[26] = (100 ^ 90) ^ (89 ^ 104);
        lllIIIlIIIl[27] = 33 ^ 106;
        lllIIIlIIIl[28] = (64 ^ 32) ^ (77 ^ 61);
        lllIIIlIIIl[29] = 32 ^ 49;
        lllIIIlIIIl[30] = (112 ^ 58) ^ (120 ^ 127);
        lllIIIlIIIl[31] = 182 ^ 164;
        lllIIIlIIIl[32] = (((110 + 3) - 41) + 115) ^ (((4 + 85) - (-70)) + 9);
        lllIIIlIIIl[33] = (206 ^ 189) ^ (21 ^ 41);
        lllIIIlIIIl[34] = (-9763) & 12271;
        lllIIIlIIIl[35] = 85 ^ 65;
        lllIIIlIIIl[36] = (255 ^ 199) ^ (60 ^ 17);
        lllIIIlIIIl[37] = 97 ^ 51;
        lllIIIlIIIl[38] = (((134 + 82) - 118) + 43) ^ (((148 + 72) - 124) + 59);
        lllIIIlIIIl[39] = 96 ^ 119;
        lllIIIlIIIl[40] = (188 ^ 162) ^ (195 ^ 137);
    }

    public int l() {
        return this.materials;
    }

    private static boolean lIlIllIIllIllI(int i, int i2) {
        return i < i2;
    }

    private EnumC0002c(String str, int i, String str2, int i2, int i3, int i4, int i5) {
        this.name = str2;
        this.level = i2;
        this.materials = i3;
        this.amountToWithdraw = i4;
        this.requiredToMake = i5;
    }

    public int n() {
        return this.requiredToMake;
    }

    static {
        lIlIllIIllIlIl();
        lIlIllIIllIlII();
        GREEN_DHIDE_VAMBRACES = new EnumC0002c(lllIIIlIIII[lllIIIlIIIl[0]], lllIIIlIIIl[0], lllIIIlIIII[lllIIIlIIIl[1]], lllIIIlIIIl[2], lllIIIlIIIl[3], lllIIIlIIIl[4], lllIIIlIIIl[1]);
        GREEN_DHIDE_CHAPS = new EnumC0002c(lllIIIlIIII[lllIIIlIIIl[5]], lllIIIlIIIl[1], lllIIIlIIII[lllIIIlIIIl[6]], lllIIIlIIIl[7], lllIIIlIIIl[3], lllIIIlIIIl[4], lllIIIlIIIl[5]);
        GREEN_DHIDE_BODY = new EnumC0002c(lllIIIlIIII[lllIIIlIIIl[8]], lllIIIlIIIl[5], lllIIIlIIII[lllIIIlIIIl[9]], lllIIIlIIIl[10], lllIIIlIIIl[3], lllIIIlIIIl[11], lllIIIlIIIl[6]);
        BLUE_DHIDE_VAMBRACES = new EnumC0002c(lllIIIlIIII[lllIIIlIIIl[12]], lllIIIlIIIl[6], lllIIIlIIII[lllIIIlIIIl[13]], lllIIIlIIIl[14], lllIIIlIIIl[15], lllIIIlIIIl[4], lllIIIlIIIl[1]);
        BLUE_DHIDE_CHAPS = new EnumC0002c(lllIIIlIIII[lllIIIlIIIl[16]], lllIIIlIIIl[8], lllIIIlIIII[lllIIIlIIIl[17]], lllIIIlIIIl[18], lllIIIlIIIl[15], lllIIIlIIIl[4], lllIIIlIIIl[5]);
        BLUE_DHIDE_BODY = new EnumC0002c(lllIIIlIIII[lllIIIlIIIl[19]], lllIIIlIIIl[9], lllIIIlIIII[lllIIIlIIIl[20]], lllIIIlIIIl[10], lllIIIlIIIl[15], lllIIIlIIIl[11], lllIIIlIIIl[6]);
        RED_DHIDE_VAMBRACES = new EnumC0002c(lllIIIlIIII[lllIIIlIIIl[21]], lllIIIlIIIl[12], lllIIIlIIII[lllIIIlIIIl[22]], lllIIIlIIIl[23], lllIIIlIIIl[24], lllIIIlIIIl[4], lllIIIlIIIl[1]);
        RED_DHIDE_CHAPS = new EnumC0002c(lllIIIlIIII[lllIIIlIIIl[25]], lllIIIlIIIl[13], lllIIIlIIII[lllIIIlIIIl[26]], lllIIIlIIIl[27], lllIIIlIIIl[24], lllIIIlIIIl[4], lllIIIlIIIl[5]);
        RED_DHIDE_BODY = new EnumC0002c(lllIIIlIIII[lllIIIlIIIl[28]], lllIIIlIIIl[16], lllIIIlIIII[lllIIIlIIIl[29]], lllIIIlIIIl[30], lllIIIlIIIl[24], lllIIIlIIIl[11], lllIIIlIIIl[6]);
        BLACK_DHIDE_VAMBRACES = new EnumC0002c(lllIIIlIIII[lllIIIlIIIl[31]], lllIIIlIIIl[17], lllIIIlIIII[lllIIIlIIIl[32]], lllIIIlIIIl[33], lllIIIlIIIl[34], lllIIIlIIIl[4], lllIIIlIIIl[1]);
        BLACK_DHIDE_CHAPS = new EnumC0002c(lllIIIlIIII[lllIIIlIIIl[35]], lllIIIlIIIl[19], lllIIIlIIII[lllIIIlIIIl[36]], lllIIIlIIIl[37], lllIIIlIIIl[34], lllIIIlIIIl[4], lllIIIlIIIl[5]);
        BLACK_DHIDE_BODY = new EnumC0002c(lllIIIlIIII[lllIIIlIIIl[38]], lllIIIlIIIl[20], lllIIIlIIII[lllIIIlIIIl[39]], lllIIIlIIIl[40], lllIIIlIIIl[34], lllIIIlIIIl[11], lllIIIlIIIl[6]);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[lllIIIlIIIl[21]];
        enumC0002cArr[lllIIIlIIIl[0]] = GREEN_DHIDE_VAMBRACES;
        enumC0002cArr[lllIIIlIIIl[1]] = GREEN_DHIDE_CHAPS;
        enumC0002cArr[lllIIIlIIIl[5]] = GREEN_DHIDE_BODY;
        enumC0002cArr[lllIIIlIIIl[6]] = BLUE_DHIDE_VAMBRACES;
        enumC0002cArr[lllIIIlIIIl[8]] = BLUE_DHIDE_CHAPS;
        enumC0002cArr[lllIIIlIIIl[9]] = BLUE_DHIDE_BODY;
        enumC0002cArr[lllIIIlIIIl[12]] = RED_DHIDE_VAMBRACES;
        enumC0002cArr[lllIIIlIIIl[13]] = RED_DHIDE_CHAPS;
        enumC0002cArr[lllIIIlIIIl[16]] = RED_DHIDE_BODY;
        enumC0002cArr[lllIIIlIIIl[17]] = BLACK_DHIDE_VAMBRACES;
        enumC0002cArr[lllIIIlIIIl[19]] = BLACK_DHIDE_CHAPS;
        enumC0002cArr[lllIIIlIIIl[20]] = BLACK_DHIDE_BODY;
        $VALUES = enumC0002cArr;
    }

    private static String lIlIllIIllIIll(String llllllllllllllllIIlIlIlIIIIlllIl, String llllllllllllllllIIlIlIlIIIIlllII) {
        String llllllllllllllllIIlIlIlIIIIlllIl2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIlIIIIllIll = new StringBuilder();
        char[] llllllllllllllllIIlIlIlIIIIllIlI = llllllllllllllllIIlIlIlIIIIlllII.toCharArray();
        int llllllllllllllllIIlIlIlIIIIlIlII = lllIIIlIIIl[0];
        char[] charArray = llllllllllllllllIIlIlIlIIIIlllIl2.toCharArray();
        int length = charArray.length;
        int i = lllIIIlIIIl[0];
        while (lIlIllIIllIllI(i, length)) {
            llllllllllllllllIIlIlIlIIIIllIll.append((char) (charArray[i] ^ llllllllllllllllIIlIlIlIIIIllIlI[llllllllllllllllIIlIlIlIIIIlIlII % llllllllllllllllIIlIlIlIIIIllIlI.length]));
            "".length();
            llllllllllllllllIIlIlIlIIIIlIlII++;
            i++;
            "".length();
            if ("  ".length() == (((((165 + 98) - 146) + 68) ^ (((124 + 141) - 166) + 76)) & (((106 ^ 66) ^ (104 ^ 86)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIlIlIIIIllIll);
    }

    private static void lIlIllIIllIlII() {
        lllIIIlIIII = new String[lllIIIlIIIl[11]];
        lllIIIlIIII[lllIIIlIIIl[0]] = lIlIllIIllIIIl("rfkQrw7LwQ7r01nI94cRt4fCi2PFE8Pt", "UKuhb");
        lllIIIlIIII[lllIIIlIIIl[1]] = lIlIllIIllIIlI("zKn4R/1u7ZZiVHSYlaoyOF1K9W/8caVb", "KSXNn");
        lllIIIlIIII[lllIIIlIIIl[5]] = lIlIllIIllIIlI("cYvIkROCEiaJIqNpW9m5icOfvjh6oya/", "gkfPW");
        lllIIIlIIII[lllIIIlIIIl[6]] = lIlIllIIllIIIl("/fCa4IOqAFn+7BTZeVzXJ2lJD5foe5OM", "vOAYQ");
        lllIIIlIIII[lllIIIlIIIl[8]] = lIlIllIIllIIll("HSE1CCIFNzgEKB8sMgIoAw==", "ZspMl");
        lllIIIlIIII[lllIIIlIIIl[9]] = lIlIllIIllIIlI("AKUQyJifyqxU9e5P4sDiHQle1nlf196p", "oEnsx");
        lllIIIlIIII[lllIIIlIIIl[12]] = lIlIllIIllIIIl("ZEsIRR3My38yJ9eKv0dfFnkwCfaK4l1d", "WZpoJ");
        lllIIIlIIII[lllIIIlIIIl[13]] = lIlIllIIllIIll("CggCJEwsQx8oCC1EASABKhYWIgk7", "HdwAl");
        lllIIIlIIII[lllIIIlIIIl[16]] = lIlIllIIllIIIl("XOK4VjwgYLf3ioIxqqQQQQU3EqRERUbx", "nJeTP");
        lllIIIlIIII[lllIIIlIIIl[17]] = lIlIllIIllIIIl("XmJqaXxRlcqLyf4Mj/IgmNjuGYQbzAfn", "UttMa");
        lllIIIlIIII[lllIIIlIIIl[19]] = lIlIllIIllIIlI("su3AdfXNUMZErweOIu4CRw==", "fITfn");
        lllIIIlIIII[lllIIIlIIIl[20]] = lIlIllIIllIIll("Eh8vLm80VDIiKzVTOCQrKQ==", "PsZKO");
        lllIIIlIIII[lllIIIlIIIl[21]] = lIlIllIIllIIIl("UrgsG6sMumOOToYIHlH/A5B6aIQwngG7", "wmCfy");
        lllIIIlIIII[lllIIIlIIIl[22]] = lIlIllIIllIIlI("pqoKSd8dQBvHfpfHHBC8/l9zjeXYlcbC", "TRLPp");
        lllIIIlIIII[lllIIIlIIIl[25]] = lIlIllIIllIIIl("KnCLXfipXxsgiDYqpzSe3A==", "HLduh");
        lllIIIlIIII[lllIIIlIIIl[26]] = lIlIllIIllIIll("IQMJVSFUDgQRIFMFBRQ1AA==", "sfmuE");
        lllIIIlIIII[lllIIIlIIIl[28]] = lIlIllIIllIIll("HyIdHRAFLh0HCw8oHRs=", "MgYBT");
        lllIIIlIIII[lllIIIlIIIl[29]] = lIlIllIIllIIlI("f4/OKAKNns0CeQ2Ci5mBTg==", "Ewxuf");
        lllIIIlIIII[lllIIIlIIIl[31]] = lIlIllIIllIIll("KTY0Nhk0Pj08Fi4lIzQfKSg0Nhc4", "kzuuR");
        lllIIIlIIII[lllIIIlIIIl[32]] = lIlIllIIllIIlI("tCoNL8At4NjWNyRsBMSLP9BfzzHIzuE9", "YmUNM");
        lllIIIlIIII[lllIIIlIIIl[35]] = lIlIllIIllIIlI("2kemrxCgsVM8EevO9qLNucknVTACbB0J", "lzfmL");
        lllIIIlIIII[lllIIIlIIIl[36]] = lIlIllIIllIIlI("ScKUejKNjCOd8/Qlm+Tz4qittiuqExL9", "qGRFo");
        lllIIIlIIII[lllIIIlIIIl[38]] = lIlIllIIllIIIl("czT1c72RNwLOjyI5glLCqtcLoJoz3Me+", "lBkZQ");
        lllIIIlIIII[lllIIIlIIIl[39]] = lIlIllIIllIIlI("RYVd4WPmZdzxc9I7F3dBM6DBazZi6OO6", "FgAUB");
    }

    public String j() {
        return this.name;
    }

    private static String lIlIllIIllIIlI(String llllllllllllllllIIlIlIlIIIlIllIl, String llllllllllllllllIIlIlIlIIIlIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIIIlIllII.getBytes(StandardCharsets.UTF_8)), lllIIIlIIIl[16]), "DES");
            Cipher llllllllllllllllIIlIlIlIIIlIllll = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIlIIIlIllll.init(lllIIIlIIIl[5], secretKeySpec);
            return new String(llllllllllllllllIIlIlIlIIIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIlIIIlIlllI) {
            llllllllllllllllIIlIlIlIIIlIlllI.printStackTrace();
            return null;
        }
    }

    public int k() {
        return this.level;
    }

    public static EnumC0002c[] values() {
        return (EnumC0002c[]) $VALUES.clone();
    }

    public static EnumC0002c valueOf(String str) {
        return (EnumC0002c) Enum.valueOf(EnumC0002c.class, str);
    }

    private static String lIlIllIIllIIIl(String llllllllllllllllIIlIlIlIIIIIlIII, String llllllllllllllllIIlIlIlIIIIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIIIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIlIIIIIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIlIIIIIlIlI.init(lllIIIlIIIl[5], secretKeySpec);
            return new String(llllllllllllllllIIlIlIlIIIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIlIIIIIlIIl) {
            llllllllllllllllIIlIlIlIIIIIlIIl.printStackTrace();
            return null;
        }
    }
}
