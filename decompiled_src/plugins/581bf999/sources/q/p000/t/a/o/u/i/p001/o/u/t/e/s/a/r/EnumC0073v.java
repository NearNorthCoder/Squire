package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.v  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/v.class */
public final class EnumC0073v {
    public static final /* synthetic */ EnumC0073v FLICK;
    private static /* synthetic */ String[] llIIIlIIIll;
    private static /* synthetic */ int[] llIIIlIIlII;
    private static final /* synthetic */ EnumC0073v[] $VALUES;
    public static final /* synthetic */ EnumC0073v NORMAL;
    public static final /* synthetic */ EnumC0073v NONE;

    public static EnumC0073v valueOf(String str) {
        return (EnumC0073v) Enum.valueOf(EnumC0073v.class, str);
    }

    private static String lIIlllIlllllll(String llllllllllllllllIlIIIlIlIlIIIlll, String llllllllllllllllIlIIIlIlIlIIlIll) {
        String llllllllllllllllIlIIIlIlIlIIIlll2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIlIlIlIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIlIIIlIlIlIIlIIl = llllllllllllllllIlIIIlIlIlIIlIll.toCharArray();
        int llllllllllllllllIlIIIlIlIlIIlIII = llIIIlIIlII[0];
        char[] charArray = llllllllllllllllIlIIIlIlIlIIIlll2.toCharArray();
        int length = charArray.length;
        int i = llIIIlIIlII[0];
        while (lIIllllIIIIIlI(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllllIlIIIlIlIlIIlIIl[llllllllllllllllIlIIIlIlIlIIlIII % llllllllllllllllIlIIIlIlIlIIlIIl.length]));
            "".length();
            llllllllllllllllIlIIIlIlIlIIlIII++;
            i++;
            "".length();
            if ((5 ^ 1) == " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static EnumC0073v[] values() {
        return (EnumC0073v[]) $VALUES.clone();
    }

    static {
        lIIllllIIIIIIl();
        lIIllllIIIIIII();
        NONE = new EnumC0073v(llIIIlIIIll[llIIIlIIlII[0]], llIIIlIIlII[0]);
        NORMAL = new EnumC0073v(llIIIlIIIll[llIIIlIIlII[1]], llIIIlIIlII[1]);
        FLICK = new EnumC0073v(llIIIlIIIll[llIIIlIIlII[2]], llIIIlIIlII[2]);
        EnumC0073v[] enumC0073vArr = new EnumC0073v[llIIIlIIlII[3]];
        enumC0073vArr[llIIIlIIlII[0]] = NONE;
        enumC0073vArr[llIIIlIIlII[1]] = NORMAL;
        enumC0073vArr[llIIIlIIlII[2]] = FLICK;
        $VALUES = enumC0073vArr;
    }

    private EnumC0073v(String str, int i) {
    }

    private static void lIIllllIIIIIIl() {
        llIIIlIIlII = new int[4];
        llIIIlIIlII[0] = ((((101 + 173) - 137) + 111) ^ (((40 + 135) - 169) + 146)) & (((107 ^ 40) ^ (23 ^ 52)) ^ (-" ".length()));
        llIIIlIIlII[1] = " ".length();
        llIIIlIIlII[2] = "  ".length();
        llIIIlIIlII[3] = "   ".length();
    }

    private static void lIIllllIIIIIII() {
        llIIIlIIIll = new String[llIIIlIIlII[3]];
        llIIIlIIIll[llIIIlIIlII[0]] = lIIlllIllllllI("suOFNvoaEbU=", "hDLck");
        llIIIlIIIll[llIIIlIIlII[1]] = lIIlllIlllllll("AwQwFRYB", "MKbXW");
        llIIIlIIIll[llIIIlIIlII[2]] = lIIlllIllllllI("vmzZko/I+VU=", "PIBMv");
    }

    private static String lIIlllIllllllI(String llllllllllllllllIlIIIlIlIlIlllII, String llllllllllllllllIlIIIlIlIlIllIll) {
        try {
            SecretKeySpec llllllllllllllllIlIIIlIlIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIlIlIlIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIIlIlIlIllllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIIlIlIlIllllI.init(llIIIlIIlII[2], llllllllllllllllIlIIIlIlIlIlllll);
            return new String(llllllllllllllllIlIIIlIlIlIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIlIlIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIlIlIlIlllIl) {
            llllllllllllllllIlIIIlIlIlIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIIIIIlI(int i, int i2) {
        return i < i2;
    }
}
