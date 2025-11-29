package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.B  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/B.class */
public final class B {
    private static final /* synthetic */ B[] $VALUES;
    public static final /* synthetic */ B EMPTY;
    public static final /* synthetic */ B COMPLETED;
    private static /* synthetic */ int[] lIlllllllllI;
    public static final /* synthetic */ B IN_PROGRESS;
    public static final /* synthetic */ B OCCUPIED;
    public static final /* synthetic */ B UNKNOWN;
    private static /* synthetic */ String[] lIllllllllII;

    private B(String str, int i) {
    }

    private static void llllIIIIlIIllI() {
        lIllllllllII = new String[lIlllllllllI[5]];
        lIllllllllII[lIlllllllllI[0]] = llllIIIIlIIIlI("9W8Ec95wCidGjmu0LjJShQ==", "ArxuZ");
        lIllllllllII[lIlllllllllI[1]] = llllIIIIlIIlII("Waf35Vajg0MVkScnKSyicg==", "GLSWn");
        lIllllllllII[lIlllllllllI[2]] = llllIIIIlIIlII("iHOInQJT8oiR5JKh0AUUdQ==", "UhPgr");
        lIllllllllII[lIlllllllllI[3]] = llllIIIIlIIlII("uCkw6RHkBss=", "ujkaL");
        lIllllllllII[lIlllllllllI[4]] = llllIIIIlIIlIl("ISo7FAMjKg==", "tdpZL");
    }

    public static B[] values() {
        return (B[]) $VALUES.clone();
    }

    private static String llllIIIIlIIIlI(String lllllllllllllllIlIlIlllIIlllIIll, String lllllllllllllllIlIlIlllIIlllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlllIIlllIIlI.getBytes(StandardCharsets.UTF_8)), lIlllllllllI[6]), "DES");
            Cipher lllllllllllllllIlIlIlllIIlllIlIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlIlllIIlllIlIl.init(lIlllllllllI[2], secretKeySpec);
            return new String(lllllllllllllllIlIlIlllIIlllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlllIIlllIlII) {
            lllllllllllllllIlIlIlllIIlllIlII.printStackTrace();
            return null;
        }
    }

    private static String llllIIIIlIIlII(String lllllllllllllllIlIlIlllIIllIIllI, String lllllllllllllllIlIlIlllIIllIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlllIIllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllllllllI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlllIIllIIlll) {
            lllllllllllllllIlIlIlllIIllIIlll.printStackTrace();
            return null;
        }
    }

    static {
        llllIIIIlIlIll();
        llllIIIIlIIllI();
        COMPLETED = new B(lIllllllllII[lIlllllllllI[0]], lIlllllllllI[0]);
        IN_PROGRESS = new B(lIllllllllII[lIlllllllllI[1]], lIlllllllllI[1]);
        OCCUPIED = new B(lIllllllllII[lIlllllllllI[2]], lIlllllllllI[2]);
        EMPTY = new B(lIllllllllII[lIlllllllllI[3]], lIlllllllllI[3]);
        UNKNOWN = new B(lIllllllllII[lIlllllllllI[4]], lIlllllllllI[4]);
        B[] bArr = new B[lIlllllllllI[5]];
        bArr[lIlllllllllI[0]] = COMPLETED;
        bArr[lIlllllllllI[1]] = IN_PROGRESS;
        bArr[lIlllllllllI[2]] = OCCUPIED;
        bArr[lIlllllllllI[3]] = EMPTY;
        bArr[lIlllllllllI[4]] = UNKNOWN;
        $VALUES = bArr;
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    private static void llllIIIIlIlIll() {
        lIlllllllllI = new int[7];
        lIlllllllllI[0] = ((((24 + 19) - (-44)) + 116) ^ (((163 + 1) - (-26)) + 5)) & (((203 ^ 179) ^ (70 ^ 54)) ^ (-" ".length()));
        lIlllllllllI[1] = " ".length();
        lIlllllllllI[2] = "  ".length();
        lIlllllllllI[3] = "   ".length();
        lIlllllllllI[4] = 21 ^ 17;
        lIlllllllllI[5] = (((123 + 93) - 152) + 109) ^ (((58 + 38) - 14) + 86);
        lIlllllllllI[6] = 184 ^ 176;
    }

    private static String llllIIIIlIIlIl(String lllllllllllllllIlIlIlllIIlIlIllI, String lllllllllllllllIlIlIlllIIlIlIlIl) {
        String lllllllllllllllIlIlIlllIIlIlIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIlIlllIIlIlIIll = lllllllllllllllIlIlIlllIIlIlIlIl.toCharArray();
        int lllllllllllllllIlIlIlllIIlIlIIlI = lIlllllllllI[0];
        char[] charArray = lllllllllllllllIlIlIlllIIlIlIllI2.toCharArray();
        int length = charArray.length;
        int i = lIlllllllllI[0];
        while (llllIIIIlIllII(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIlIlIlllIIlIlIIll[lllllllllllllllIlIlIlllIIlIlIIlI % lllllllllllllllIlIlIlllIIlIlIIll.length]));
            "".length();
            lllllllllllllllIlIlIlllIIlIlIIlI++;
            i++;
            "".length();
            if ((((40 ^ 101) ^ " ".length()) & (((252 ^ 156) ^ (118 ^ 90)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llllIIIIlIllII(int i, int i2) {
        return i < i2;
    }
}
