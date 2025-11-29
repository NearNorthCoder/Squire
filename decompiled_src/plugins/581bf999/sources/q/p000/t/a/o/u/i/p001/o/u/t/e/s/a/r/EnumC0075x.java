package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.x  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/x.class */
public final class EnumC0075x {
    public static final /* synthetic */ EnumC0075x RANGE;
    public static final /* synthetic */ EnumC0075x MAGE;
    private static final /* synthetic */ EnumC0075x[] $VALUES;
    public static final /* synthetic */ EnumC0075x MELEE;
    private static /* synthetic */ int[] llIlIIlIlIl;
    private static /* synthetic */ String[] llIlIIlIlII;

    public static EnumC0075x[] values() {
        return (EnumC0075x[]) $VALUES.clone();
    }

    private static String lIlIIlIlIllIlI(String llllllllllllllllIIllIllIlIIIllIl, String llllllllllllllllIIllIllIlIIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIllIlIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllIllIlIIIllll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllIllIlIIIllll.init(llIlIIlIlIl[2], secretKeySpec);
            return new String(llllllllllllllllIIllIllIlIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIllIlIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIllIlIIIlllI) {
            llllllllllllllllIIllIllIlIIIlllI.printStackTrace();
            return null;
        }
    }

    private EnumC0075x(String str, int i) {
    }

    private static void lIlIIlIlIlllIl() {
        llIlIIlIlIl = new int[4];
        llIlIIlIlIl[0] = ((38 ^ 25) ^ (140 ^ 153)) & ((((187 ^ 129) & ((0 ^ 58) ^ (-1))) ^ (49 ^ 27)) ^ (-" ".length()));
        llIlIIlIlIl[1] = " ".length();
        llIlIIlIlIl[2] = "  ".length();
        llIlIIlIlIl[3] = "   ".length();
    }

    static {
        lIlIIlIlIlllIl();
        lIlIIlIlIlllII();
        RANGE = new EnumC0075x(llIlIIlIlII[llIlIIlIlIl[0]], llIlIIlIlIl[0]);
        MAGE = new EnumC0075x(llIlIIlIlII[llIlIIlIlIl[1]], llIlIIlIlIl[1]);
        MELEE = new EnumC0075x(llIlIIlIlII[llIlIIlIlIl[2]], llIlIIlIlIl[2]);
        EnumC0075x[] enumC0075xArr = new EnumC0075x[llIlIIlIlIl[3]];
        enumC0075xArr[llIlIIlIlIl[0]] = RANGE;
        enumC0075xArr[llIlIIlIlIl[1]] = MAGE;
        enumC0075xArr[llIlIIlIlIl[2]] = MELEE;
        $VALUES = enumC0075xArr;
    }

    private static void lIlIIlIlIlllII() {
        llIlIIlIlII = new String[llIlIIlIlIl[3]];
        llIlIIlIlII[llIlIIlIlIl[0]] = lIlIIlIlIllIlI("6unOBo+axXo=", "oPXcw");
        llIlIIlIlII[llIlIIlIlIl[1]] = lIlIIlIlIllIll("BAAOKg==", "IAIod");
        llIlIIlIlII[llIlIIlIlIl[2]] = lIlIIlIlIllIlI("Fcf9o/YBDrU=", "frELg");
    }

    private static String lIlIIlIlIllIll(String llllllllllllllllIIllIllIlIlIIIlI, String llllllllllllllllIIllIllIlIlIIIIl) {
        String llllllllllllllllIIllIllIlIlIIIlI2 = new String(Base64.getDecoder().decode(llllllllllllllllIIllIllIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIllIllIlIIlllll = llllllllllllllllIIllIllIlIlIIIIl.toCharArray();
        int llllllllllllllllIIllIllIlIIllllI = llIlIIlIlIl[0];
        char[] charArray = llllllllllllllllIIllIllIlIlIIIlI2.toCharArray();
        int length = charArray.length;
        int i = llIlIIlIlIl[0];
        while (lIlIIlIlIllllI(i, length)) {
            char llllllllllllllllIIllIllIlIlIIIll = charArray[i];
            sb.append((char) (llllllllllllllllIIllIllIlIlIIIll ^ llllllllllllllllIIllIllIlIIlllll[llllllllllllllllIIllIllIlIIllllI % llllllllllllllllIIllIllIlIIlllll.length]));
            "".length();
            llllllllllllllllIIllIllIlIIllllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static EnumC0075x valueOf(String str) {
        return (EnumC0075x) Enum.valueOf(EnumC0075x.class, str);
    }

    private static boolean lIlIIlIlIllllI(int i, int i2) {
        return i < i2;
    }
}
