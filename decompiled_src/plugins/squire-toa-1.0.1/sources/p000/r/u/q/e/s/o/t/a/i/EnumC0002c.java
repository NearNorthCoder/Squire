package p000.r.u.q.e.s.o.t.a.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.r.u.q.e.s.o.t.a.i.c  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/c.class */
public final class EnumC0002c {
    public static final /* synthetic */ EnumC0002c RANGE_2;
    public static final /* synthetic */ EnumC0002c MAGE;
    public static final /* synthetic */ EnumC0002c MELEE_1;
    private static /* synthetic */ String[] lIlIIIIIlIIll;
    public static final /* synthetic */ EnumC0002c RANGE_1;
    private static final /* synthetic */ EnumC0002c[] $VALUES;
    private static /* synthetic */ int[] lIlIIIIIlIlII;
    public static final /* synthetic */ EnumC0002c NONE;
    public static final /* synthetic */ EnumC0002c MELEE_2;

    static {
        lIllIllIIIllIIl();
        lIllIllIIIllIII();
        NONE = new EnumC0002c(lIlIIIIIlIIll[lIlIIIIIlIlII[0]], lIlIIIIIlIlII[0]);
        MELEE_1 = new EnumC0002c(lIlIIIIIlIIll[lIlIIIIIlIlII[1]], lIlIIIIIlIlII[1]);
        MELEE_2 = new EnumC0002c(lIlIIIIIlIIll[lIlIIIIIlIlII[2]], lIlIIIIIlIlII[2]);
        RANGE_1 = new EnumC0002c(lIlIIIIIlIIll[lIlIIIIIlIlII[3]], lIlIIIIIlIlII[3]);
        RANGE_2 = new EnumC0002c(lIlIIIIIlIIll[lIlIIIIIlIlII[4]], lIlIIIIIlIlII[4]);
        MAGE = new EnumC0002c(lIlIIIIIlIIll[lIlIIIIIlIlII[5]], lIlIIIIIlIlII[5]);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[lIlIIIIIlIlII[6]];
        enumC0002cArr[lIlIIIIIlIlII[0]] = NONE;
        enumC0002cArr[lIlIIIIIlIlII[1]] = MELEE_1;
        enumC0002cArr[lIlIIIIIlIlII[2]] = MELEE_2;
        enumC0002cArr[lIlIIIIIlIlII[3]] = RANGE_1;
        enumC0002cArr[lIlIIIIIlIlII[4]] = RANGE_2;
        enumC0002cArr[lIlIIIIIlIlII[5]] = MAGE;
        $VALUES = enumC0002cArr;
    }

    public static EnumC0002c[] values() {
        return (EnumC0002c[]) $VALUES.clone();
    }

    public static EnumC0002c valueOf(String str) {
        return (EnumC0002c) Enum.valueOf(EnumC0002c.class, str);
    }

    private static void lIllIllIIIllIII() {
        lIlIIIIIlIIll = new String[lIlIIIIIlIlII[6]];
        lIlIIIIIlIIll[lIlIIIIIlIlII[0]] = lIllIllIIIlIlIl("XW+10ztTdos=", "pVhUH");
        lIlIIIIIlIIll[lIlIIIIIlIlII[1]] = lIllIllIIIlIllI("LBYrAyQ+Yg==", "aSgFa");
        lIlIIIIIlIIll[lIlIIIIIlIlII[2]] = lIllIllIIIlIlll("ypzmMus5o7E=", "CnkBS");
        lIlIIIIIlIIll[lIlIIIIIlIlII[3]] = lIllIllIIIlIllI("ARIsNSAMYg==", "SSbre");
        lIlIIIIIlIIll[lIlIIIIIlIlII[4]] = lIllIllIIIlIlIl("d2QxRRo1MeY=", "vpStS");
        lIlIIIIIlIIll[lIlIIIIIlIlII[5]] = lIllIllIIIlIlIl("d7dq833AH9s=", "VjdoZ");
    }

    private static void lIllIllIIIllIIl() {
        lIlIIIIIlIlII = new int[8];
        lIlIIIIIlIlII[0] = (23 ^ 71) & ((14 ^ 94) ^ (-1));
        lIlIIIIIlIlII[1] = " ".length();
        lIlIIIIIlIlII[2] = "  ".length();
        lIlIIIIIlIlII[3] = "   ".length();
        lIlIIIIIlIlII[4] = 176 ^ 180;
        lIlIIIIIlIlII[5] = 34 ^ 39;
        lIlIIIIIlIlII[6] = (244 ^ 169) ^ (92 ^ 7);
        lIlIIIIIlIlII[7] = (88 ^ 68) ^ (115 ^ 103);
    }

    private static String lIllIllIIIlIlIl(String llllllllllllllIlllIIllIIIIlllIII, String llllllllllllllIlllIIllIIIIllIlll) {
        try {
            SecretKeySpec llllllllllllllIlllIIllIIIIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIIIIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIIIlIlII[2], llllllllllllllIlllIIllIIIIlllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIIIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIllIIIIlllIIl) {
            llllllllllllllIlllIIllIIIIlllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIIllIlI(int i, int i2) {
        return i < i2;
    }

    private static String lIllIllIIIlIllI(String llllllllllllllIlllIIllIIIlIllIlI, String llllllllllllllIlllIIllIIIlIllIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIIllIIIlIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIIllIIIlIllIIl.toCharArray();
        int llllllllllllllIlllIIllIIIlIlIllI = lIlIIIIIlIlII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIIIlIlII[0];
        while (lIllIllIIIllIlI(i, length)) {
            char llllllllllllllIlllIIllIIIlIllIll = charArray2[i];
            sb.append((char) (llllllllllllllIlllIIllIIIlIllIll ^ charArray[llllllllllllllIlllIIllIIIlIlIllI % charArray.length]));
            "".length();
            llllllllllllllIlllIIllIIIlIlIllI++;
            i++;
            "".length();
            if ((51 ^ 55) <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private EnumC0002c(String str, int i) {
    }

    private static String lIllIllIIIlIlll(String llllllllllllllIlllIIllIIIlIIIIll, String llllllllllllllIlllIIllIIIlIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIIIlIIIlII.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIlII[7]), "DES");
            Cipher llllllllllllllIlllIIllIIIlIIIlll = Cipher.getInstance("DES");
            llllllllllllllIlllIIllIIIlIIIlll.init(lIlIIIIIlIlII[2], secretKeySpec);
            return new String(llllllllllllllIlllIIllIIIlIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIIIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIllIIIlIIIllI) {
            llllllllllllllIlllIIllIIIlIIIllI.printStackTrace();
            return null;
        }
    }
}
