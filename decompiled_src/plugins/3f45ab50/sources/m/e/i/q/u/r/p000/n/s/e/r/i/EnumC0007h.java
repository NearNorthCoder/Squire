package m.e.i.q.u.r.p000.n.s.e.r.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.h  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/h.class */
public final class EnumC0007h {
    public static final /* synthetic */ EnumC0007h TIN_ORE;
    private final /* synthetic */ int oreID;
    public static final /* synthetic */ EnumC0007h COPPER_ORE;
    private static /* synthetic */ String[] llllllIIIllI;
    public static final /* synthetic */ EnumC0007h IRON_ORE;
    private static /* synthetic */ int[] llllllIIIlll;
    private static final /* synthetic */ EnumC0007h[] $VALUES;
    private final /* synthetic */ int[] objectID;

    static {
        lIIlIlIIIlIIlll();
        lIIlIlIIIlIIllI();
        String str = llllllIIIllI[llllllIIIlll[0]];
        int i = llllllIIIlll[0];
        int i2 = llllllIIIlll[1];
        int[] iArr = new int[llllllIIIlll[2]];
        iArr[llllllIIIlll[0]] = llllllIIIlll[3];
        iArr[llllllIIIlll[4]] = llllllIIIlll[5];
        COPPER_ORE = new EnumC0007h(str, i, i2, iArr);
        String str2 = llllllIIIllI[llllllIIIlll[4]];
        int i3 = llllllIIIlll[4];
        int i4 = llllllIIIlll[6];
        int[] iArr2 = new int[llllllIIIlll[2]];
        iArr2[llllllIIIlll[0]] = llllllIIIlll[7];
        iArr2[llllllIIIlll[4]] = llllllIIIlll[8];
        TIN_ORE = new EnumC0007h(str2, i3, i4, iArr2);
        String str3 = llllllIIIllI[llllllIIIlll[2]];
        int i5 = llllllIIIlll[2];
        int i6 = llllllIIIlll[9];
        int[] iArr3 = new int[llllllIIIlll[2]];
        iArr3[llllllIIIlll[0]] = llllllIIIlll[10];
        iArr3[llllllIIIlll[4]] = llllllIIIlll[11];
        IRON_ORE = new EnumC0007h(str3, i5, i6, iArr3);
        EnumC0007h[] enumC0007hArr = new EnumC0007h[llllllIIIlll[12]];
        enumC0007hArr[llllllIIIlll[0]] = COPPER_ORE;
        enumC0007hArr[llllllIIIlll[4]] = TIN_ORE;
        enumC0007hArr[llllllIIIlll[2]] = IRON_ORE;
        $VALUES = enumC0007hArr;
    }

    private static String lIIlIlIIIlIIIll(String lllllllllllllllIIlIIIlllIlIllllI, String lllllllllllllllIIlIIIlllIlIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlllIlIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllllIIIlll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlllIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIlllIlIlllll) {
            lllllllllllllllIIlIIIlllIlIlllll.printStackTrace();
            return null;
        }
    }

    public static EnumC0007h valueOf(String str) {
        return (EnumC0007h) Enum.valueOf(EnumC0007h.class, str);
    }

    private static String lIIlIlIIIlIIlII(String lllllllllllllllIIlIIIlllIllIlIll, String lllllllllllllllIIlIIIlllIllIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIlllIllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlllIllIlIlI.getBytes(StandardCharsets.UTF_8)), llllllIIIlll[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllllIIIlll[2], lllllllllllllllIIlIIIlllIllIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlllIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIlllIllIllII) {
            lllllllllllllllIIlIIIlllIllIllII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIIIlIIllI() {
        llllllIIIllI = new String[llllllIIIlll[12]];
        llllllIIIllI[llllllIIIlll[0]] = lIIlIlIIIlIIIll("q6ugCBV8S9zLsOsViw2h7g==", "QBwxr");
        llllllIIIllI[llllllIIIlll[4]] = lIIlIlIIIlIIlII("mjGZus+CtPk=", "gcRXH");
        llllllIIIllI[llllllIIIlll[2]] = lIIlIlIIIlIIlIl("DB4KNzIKHgA=", "ELEym");
    }

    public int m() {
        return this.oreID;
    }

    private EnumC0007h(String str, int i, int i2, int... iArr) {
        this.oreID = i2;
        this.objectID = iArr;
    }

    public int[] l() {
        return this.objectID;
    }

    private static boolean lIIlIlIIIlIlIII(int i, int i2) {
        return i < i2;
    }

    private static void lIIlIlIIIlIIlll() {
        llllllIIIlll = new int[14];
        llllllIIIlll[0] = (167 ^ 197) & ((231 ^ 133) ^ (-1));
        llllllIIIlll[1] = (-12801) & 13236;
        llllllIIIlll[2] = "  ".length();
        llllllIIIlll[3] = (-((-12089) & 32637)) & (-3) & 31711;
        llllllIIIlll[4] = " ".length();
        llllllIIIlll[5] = (-1025) & 11967;
        llllllIIIlll[6] = (-5186) & 5623;
        llllllIIIlll[7] = (-16664) & 28023;
        llllllIIIlll[8] = (-16783) & 28143;
        llllllIIIlll[9] = (-((-7318) & 15575)) & (-7169) & 15865;
        llllllIIIlll[10] = (-((-13527) & 14047)) & (-20609) & 32493;
        llllllIIIlll[11] = (-20745) & 32108;
        llllllIIIlll[12] = "   ".length();
        llllllIIIlll[13] = (((76 + 2) - (-45)) + 32) ^ (((100 + 6) - 85) + 126);
    }

    private static String lIIlIlIIIlIIlIl(String lllllllllllllllIIlIIIlllIlIIlllI, String lllllllllllllllIIlIIIlllIlIIllIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIlllIlIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIlllIlIIllII = new StringBuilder();
        char[] lllllllllllllllIIlIIIlllIlIIlIll = lllllllllllllllIIlIIIlllIlIIllIl.toCharArray();
        int lllllllllllllllIIlIIIlllIlIIlIlI = llllllIIIlll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llllllIIIlll[0];
        while (lIIlIlIIIlIlIII(i, length)) {
            char lllllllllllllllIIlIIIlllIlIIllll = charArray[i];
            lllllllllllllllIIlIIIlllIlIIllII.append((char) (lllllllllllllllIIlIIIlllIlIIllll ^ lllllllllllllllIIlIIIlllIlIIlIll[lllllllllllllllIIlIIIlllIlIIlIlI % lllllllllllllllIIlIIIlllIlIIlIll.length]));
            "".length();
            lllllllllllllllIIlIIIlllIlIIlIlI++;
            i++;
            "".length();
            if (" ".length() > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIIIlllIlIIllII);
    }

    public static EnumC0007h[] values() {
        return (EnumC0007h[]) $VALUES.clone();
    }
}
