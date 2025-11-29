package a.u.i.p000.l.r.h.z.s.r.u.q.e;

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
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.o  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/o.class */
public final class EnumC0014o {
    private static final /* synthetic */ EnumC0014o[] $VALUES;
    public static final /* synthetic */ EnumC0014o IGNORE;
    public static final /* synthetic */ EnumC0014o ANTI_POISON;
    private final /* synthetic */ List<Integer> items;
    public static final /* synthetic */ EnumC0014o CURE_SELF;
    public static final /* synthetic */ EnumC0014o ANTI_VENOM;
    private static /* synthetic */ String[] lIllIllIIlllI;
    private static /* synthetic */ int[] lIllIllIlIIII;
    public static final /* synthetic */ EnumC0014o ANTI_DOTE;
    private final /* synthetic */ String name;

    public String k() {
        return this.name;
    }

    static {
        llIIlIIlIIIIIll();
        llIIlIIIlllllIl();
        String str = lIllIllIIlllI[lIllIllIlIIII[1]];
        int i = lIllIllIlIIII[0];
        String str2 = lIllIllIIlllI[lIllIllIlIIII[2]];
        int[] iArr = new int[lIllIllIlIIII[3]];
        iArr[lIllIllIlIIII[0]] = lIllIllIlIIII[4];
        iArr[lIllIllIlIIII[1]] = lIllIllIlIIII[5];
        iArr[lIllIllIlIIII[2]] = lIllIllIlIIII[6];
        iArr[lIllIllIlIIII[7]] = lIllIllIlIIII[8];
        iArr[lIllIllIlIIII[9]] = lIllIllIlIIII[10];
        iArr[lIllIllIlIIII[11]] = lIllIllIlIIII[12];
        ANTI_VENOM = new EnumC0014o(str, i, str2, iArr);
        String str3 = lIllIllIIlllI[lIllIllIlIIII[7]];
        int i2 = lIllIllIlIIII[1];
        String str4 = lIllIllIIlllI[lIllIllIlIIII[9]];
        int[] iArr2 = new int[lIllIllIlIIII[2]];
        iArr2[lIllIllIlIIII[0]] = lIllIllIlIIII[13];
        iArr2[lIllIllIlIIII[1]] = lIllIllIlIIII[14];
        ANTI_DOTE = new EnumC0014o(str3, i2, str4, iArr2);
        String str5 = lIllIllIIlllI[lIllIllIlIIII[11]];
        int i3 = lIllIllIlIIII[2];
        String str6 = lIllIllIIlllI[lIllIllIlIIII[3]];
        int[] iArr3 = new int[lIllIllIlIIII[3]];
        iArr3[lIllIllIlIIII[0]] = lIllIllIlIIII[15];
        iArr3[lIllIllIlIIII[1]] = lIllIllIlIIII[16];
        iArr3[lIllIllIlIIII[2]] = lIllIllIlIIII[17];
        iArr3[lIllIllIlIIII[7]] = lIllIllIlIIII[18];
        iArr3[lIllIllIlIIII[9]] = lIllIllIlIIII[19];
        iArr3[lIllIllIlIIII[11]] = lIllIllIlIIII[20];
        ANTI_POISON = new EnumC0014o(str5, i3, str6, iArr3);
        String str7 = lIllIllIIlllI[lIllIllIlIIII[21]];
        int i4 = lIllIllIlIIII[7];
        int[] iArr4 = new int[lIllIllIlIIII[2]];
        iArr4[lIllIllIlIIII[0]] = lIllIllIlIIII[22];
        iArr4[lIllIllIlIIII[1]] = lIllIllIlIIII[23];
        CURE_SELF = new EnumC0014o(str7, i4, iArr4);
        IGNORE = new EnumC0014o(lIllIllIIlllI[lIllIllIlIIII[24]], lIllIllIlIIII[9], new int[lIllIllIlIIII[0]]);
        EnumC0014o[] enumC0014oArr = new EnumC0014o[lIllIllIlIIII[11]];
        enumC0014oArr[lIllIllIlIIII[0]] = ANTI_VENOM;
        enumC0014oArr[lIllIllIlIIII[1]] = ANTI_DOTE;
        enumC0014oArr[lIllIllIlIIII[2]] = ANTI_POISON;
        enumC0014oArr[lIllIllIlIIII[7]] = CURE_SELF;
        enumC0014oArr[lIllIllIlIIII[9]] = IGNORE;
        $VALUES = enumC0014oArr;
    }

    private static void llIIlIIlIIIIIll() {
        lIllIllIlIIII = new int[26];
        lIllIllIlIIII[0] = (159 ^ 193) & ((40 ^ 118) ^ (-1));
        lIllIllIlIIII[1] = " ".length();
        lIllIllIlIIII[2] = "  ".length();
        lIllIllIlIIII[3] = 153 ^ 159;
        lIllIllIlIIII[4] = (-1281) & 14185;
        lIllIllIlIIII[5] = (-18563) & 31475;
        lIllIllIlIIII[6] = (-18825) & 31739;
        lIllIllIlIIII[7] = "   ".length();
        lIllIllIlIIII[8] = (-((-1003) & 18411)) & (-257) & 30571;
        lIllIllIlIIII[9] = 107 ^ 111;
        lIllIllIlIIII[10] = (-2193) & 15101;
        lIllIllIlIIII[11] = 68 ^ 65;
        lIllIllIlIIII[12] = (-((-4175) & 20943)) & (-1033) & 30717;
        lIllIllIlIIII[13] = (-8201) & 14143;
        lIllIllIlIIII[14] = (-((-4994) & 21407)) & (-10273) & 32637;
        lIllIllIlIIII[15] = (-1126) & 3573;
        lIllIllIlIIII[16] = (-20529) & 22974;
        lIllIllIlIIII[17] = ((45 + 10) - (-106)) + 20;
        lIllIllIlIIII[18] = ((35 + 86) - (-7)) + 47;
        lIllIllIlIIII[19] = (((175 ^ 195) + (64 ^ 87)) - (72 ^ 126)) + (22 ^ 124);
        lIllIllIlIIII[20] = ((101 + 120) - 89) + 45;
        lIllIllIlIIII[21] = (((12 + 9) - 7) + 133) ^ (((129 + 8) - 84) + 95);
        lIllIllIlIIII[22] = (-513) & 13303;
        lIllIllIlIIII[23] = (-5133) & 32413;
        lIllIllIlIIII[24] = (((69 + 151) - 146) + 86) ^ (((135 + 49) - 73) + 57);
        lIllIllIlIIII[25] = 170 ^ 163;
    }

    public static EnumC0014o valueOf(String str) {
        return (EnumC0014o) Enum.valueOf(EnumC0014o.class, str);
    }

    public static EnumC0014o[] values() {
        return (EnumC0014o[]) $VALUES.clone();
    }

    private EnumC0014o(String str, int i, int... iArr) {
        this(str, i, lIllIllIIlllI[lIllIllIlIIII[0]], iArr);
    }

    private EnumC0014o(String str, int i, String str2, int... iArr) {
        this.name = str2;
        this.items = new ArrayList();
        int length = iArr.length;
        int i2 = lIllIllIlIIII[0];
        while (llIIlIIlIIIIlII(i2, length)) {
            this.items.add(Integer.valueOf(iArr[i2]));
            "".length();
            i2++;
            "".length();
            if (0 != 0) {
                throw null;
            }
        }
    }

    private static boolean llIIlIIlIIIIlII(int i, int i2) {
        return i < i2;
    }

    private static void llIIlIIIlllllIl() {
        lIllIllIIlllI = new String[lIllIllIlIIII[25]];
        lIllIllIIlllI[lIllIllIlIIII[0]] = llIIlIIIllllIII("ycDyk0yEy9E=", "sdrKz");
        lIllIllIIlllI[lIllIllIlIIII[1]] = llIIlIIIllllIII("pqjdTcWySty2EzRhqUk2fg==", "qvwDv");
        lIllIllIIlllI[lIllIllIlIIII[2]] = llIIlIIIllllIll("5l2L7jzBn+dfnM9JaK5Mug==", "NxlZz");
        lIllIllIIlllI[lIllIllIlIIII[7]] = llIIlIIIllllIll("5Kjx/T6cFcxojtPxY4QfnQ==", "djpIV");
        lIllIllIIlllI[lIllIllIlIIII[9]] = llIIlIIIlllllII("KAciPAYGHTM=", "iiVUb");
        lIllIllIIlllI[lIllIllIlIIII[11]] = llIIlIIIlllllII("LiU1OTU/JCgjJSE=", "okapj");
        lIllIllIIlllI[lIllIllIlIIII[3]] = llIIlIIIlllllII("Fx8NMBY5GAo2CA==", "VqyYf");
        lIllIllIIlllI[lIllIllIlIIII[21]] = llIIlIIIlllllII("CCELBxAYMRUE", "KtYBO");
        lIllIllIIlllI[lIllIllIlIIII[24]] = llIIlIIIllllIII("gsQDNZihZHQ=", "wcBRA");
    }

    public List<Integer> I() {
        return this.items;
    }

    private static String llIIlIIIllllIll(String llllllllllllllIllIIIlIlIlIIIIlIl, String llllllllllllllIllIIIlIlIlIIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIlIlIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIllIlIIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIlIlIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIlIlIIIIllI) {
            llllllllllllllIllIIIlIlIlIIIIllI.printStackTrace();
            return null;
        }
    }

    private static String llIIlIIIlllllII(String llllllllllllllIllIIIlIlIlIlIIlll, String llllllllllllllIllIIIlIlIlIlIIllI) {
        String llllllllllllllIllIIIlIlIlIlIIlll2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlIlIlIlIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIlIlIlIlIIlIl = new StringBuilder();
        char[] charArray = llllllllllllllIllIIIlIlIlIlIIllI.toCharArray();
        int llllllllllllllIllIIIlIlIlIIllllI = lIllIllIlIIII[0];
        char[] charArray2 = llllllllllllllIllIIIlIlIlIlIIlll2.toCharArray();
        int length = charArray2.length;
        int i = lIllIllIlIIII[0];
        while (llIIlIIlIIIIlII(i, length)) {
            char llllllllllllllIllIIIlIlIlIlIlIII = charArray2[i];
            llllllllllllllIllIIIlIlIlIlIIlIl.append((char) (llllllllllllllIllIIIlIlIlIlIlIII ^ charArray[llllllllllllllIllIIIlIlIlIIllllI % charArray.length]));
            "".length();
            llllllllllllllIllIIIlIlIlIIllllI++;
            i++;
            "".length();
            if ((((139 ^ 191) ^ (98 ^ 88)) & (((189 ^ 175) ^ (22 ^ 10)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIIlIlIlIlIIlIl);
    }

    private static String llIIlIIIllllIII(String llllllllllllllIllIIIlIlIlIIlIIlI, String llllllllllllllIllIIIlIlIlIIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIlIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), lIllIllIlIIII[24]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIllIlIIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIlIlIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIlIlIIlIIll) {
            llllllllllllllIllIIIlIlIlIIlIIll.printStackTrace();
            return null;
        }
    }
}
