package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.m  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/m.class */
public final class EnumC0038m {
    public static final /* synthetic */ EnumC0038m UNOWNED;
    public static final /* synthetic */ EnumC0038m OFF;
    private static final /* synthetic */ EnumC0038m[] $VALUES;
    private static /* synthetic */ int[] llIIIIllIlll;
    public static final /* synthetic */ EnumC0038m ON;
    private static /* synthetic */ String[] llIIIIllIlII;

    private static boolean llllIIllIlIIlI(int i, int i2) {
        return i < i2;
    }

    private static String llllIIllIIlIIl(String lllllllllllllllIlIlIlIlIIIllIIlI, String lllllllllllllllIlIlIlIlIIIllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIlIIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIlIlIIIllIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIlIlIIIllIlII.init(llIIIIllIlll[2], secretKeySpec);
            return new String(lllllllllllllllIlIlIlIlIIIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlIlIIIllIIll) {
            lllllllllllllllIlIlIlIlIIIllIIll.printStackTrace();
            return null;
        }
    }

    public static EnumC0038m[] values() {
        return (EnumC0038m[]) $VALUES.clone();
    }

    private static String llllIIllIIlIlI(String lllllllllllllllIlIlIlIlIIIIIllIl, String lllllllllllllllIlIlIlIlIIIIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIlIIIIIllII.getBytes(StandardCharsets.UTF_8)), llIIIIllIlll[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIIllIlll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlIlIIIIIlllI) {
            lllllllllllllllIlIlIlIlIIIIIlllI.printStackTrace();
            return null;
        }
    }

    static {
        llllIIllIlIIIl();
        llllIIllIIllII();
        UNOWNED = new EnumC0038m(llIIIIllIlII[llIIIIllIlll[0]], llIIIIllIlll[0]);
        OFF = new EnumC0038m(llIIIIllIlII[llIIIIllIlll[1]], llIIIIllIlll[1]);
        ON = new EnumC0038m(llIIIIllIlII[llIIIIllIlll[2]], llIIIIllIlll[2]);
        EnumC0038m[] enumC0038mArr = new EnumC0038m[llIIIIllIlll[3]];
        enumC0038mArr[llIIIIllIlll[0]] = UNOWNED;
        enumC0038mArr[llIIIIllIlll[1]] = OFF;
        enumC0038mArr[llIIIIllIlll[2]] = ON;
        $VALUES = enumC0038mArr;
    }

    private static void llllIIllIlIIIl() {
        llIIIIllIlll = new int[5];
        llIIIIllIlll[0] = (142 ^ 129) & ((33 ^ 46) ^ (-1));
        llIIIIllIlll[1] = " ".length();
        llIIIIllIlll[2] = "  ".length();
        llIIIIllIlll[3] = "   ".length();
        llIIIIllIlll[4] = 132 ^ 140;
    }

    private static void llllIIllIIllII() {
        llIIIIllIlII = new String[llIIIIllIlll[3]];
        llIIIIllIlII[llIIIIllIlll[0]] = llllIIllIIlIIl("sOcOJMg04PA=", "RJROF");
        llIIIIllIlII[llIIIIllIlll[1]] = llllIIllIIlIlI("DGtxP68DgDY=", "TeiWG");
        llIIIIllIlII[llIIIIllIlll[2]] = llllIIllIIlIll("ITs=", "nuGOd");
    }

    private static String llllIIllIIlIll(String lllllllllllllllIlIlIlIlIIIlIIIlI, String lllllllllllllllIlIlIlIlIIIIlllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIlIlIIIlIIIII = new StringBuilder();
        char[] lllllllllllllllIlIlIlIlIIIIlllll = lllllllllllllllIlIlIlIlIIIIlllII.toCharArray();
        int lllllllllllllllIlIlIlIlIIIIllllI = llIIIIllIlll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIIIllIlll[0];
        while (llllIIllIlIIlI(i, length)) {
            lllllllllllllllIlIlIlIlIIIlIIIII.append((char) (charArray[i] ^ lllllllllllllllIlIlIlIlIIIIlllll[lllllllllllllllIlIlIlIlIIIIllllI % lllllllllllllllIlIlIlIlIIIIlllll.length]));
            "".length();
            lllllllllllllllIlIlIlIlIIIIllllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlIlIlIIIlIIIII);
    }

    private EnumC0038m(String str, int i) {
    }

    public static EnumC0038m valueOf(String str) {
        return (EnumC0038m) Enum.valueOf(EnumC0038m.class, str);
    }
}
