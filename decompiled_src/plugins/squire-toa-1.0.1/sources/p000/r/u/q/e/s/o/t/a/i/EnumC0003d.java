package p000.r.u.q.e.s.o.t.a.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.r.u.q.e.s.o.t.a.i.d  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/d.class */
public final class EnumC0003d {
    private static final /* synthetic */ EnumC0003d[] $VALUES;
    public static final /* synthetic */ EnumC0003d SPECIAL_2;
    public static final /* synthetic */ EnumC0003d SPECIAL_1;
    private static /* synthetic */ int[] lIIlllllIlIII;
    public static final /* synthetic */ EnumC0003d NONE;
    private static /* synthetic */ String[] lIIlllllIIlll;

    private static String lIllIlIlIIIlIll(String llllllllllllllIlllIlIIIIIllIIIll, String llllllllllllllIlllIlIIIIIllIIIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIIllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlIIIIIllIIIIl = new StringBuilder();
        char[] charArray = llllllllllllllIlllIlIIIIIllIIIlI.toCharArray();
        int llllllllllllllIlllIlIIIIIlIlllll = lIIlllllIlIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlllllIlIII[0];
        while (lIllIlIlIIIlllI(i, length)) {
            char llllllllllllllIlllIlIIIIIllIIlII = charArray2[i];
            llllllllllllllIlllIlIIIIIllIIIIl.append((char) (llllllllllllllIlllIlIIIIIllIIlII ^ charArray[llllllllllllllIlllIlIIIIIlIlllll % charArray.length]));
            "".length();
            llllllllllllllIlllIlIIIIIlIlllll++;
            i++;
            "".length();
            if (((41 ^ 54) & ((189 ^ 162) ^ (-1))) >= (69 ^ 65)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIlIIIIIllIIIIl);
    }

    private EnumC0003d(String str, int i) {
    }

    public static EnumC0003d[] values() {
        return (EnumC0003d[]) $VALUES.clone();
    }

    private static void lIllIlIlIIIllIl() {
        lIIlllllIlIII = new int[5];
        lIIlllllIlIII[0] = (99 ^ 123) & ((104 ^ 112) ^ (-1));
        lIIlllllIlIII[1] = " ".length();
        lIIlllllIlIII[2] = "  ".length();
        lIIlllllIlIII[3] = "   ".length();
        lIIlllllIlIII[4] = (146 ^ 137) ^ (167 ^ 180);
    }

    public static EnumC0003d valueOf(String str) {
        return (EnumC0003d) Enum.valueOf(EnumC0003d.class, str);
    }

    private static void lIllIlIlIIIllII() {
        lIIlllllIIlll = new String[lIIlllllIlIII[3]];
        lIIlllllIIlll[lIIlllllIlIII[0]] = lIllIlIlIIIlIlI("fW+ITVzlEBBXr1zGuyDBOQ==", "gRMtf");
        lIIlllllIIlll[lIIlllllIlIII[1]] = lIllIlIlIIIlIlI("p2/zJX0Ib3Xqn2vAGZEYvg==", "TdGWL");
        lIIlllllIIlll[lIIlllllIlIII[2]] = lIllIlIlIIIlIll("IxUoKQ==", "mZfll");
    }

    private static boolean lIllIlIlIIIlllI(int i, int i2) {
        return i < i2;
    }

    private static String lIllIlIlIIIlIlI(String llllllllllllllIlllIlIIIIIlIIlllI, String llllllllllllllIlllIlIIIIIlIIllIl) {
        try {
            SecretKeySpec llllllllllllllIlllIlIIIIIlIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIIIlIIllIl.getBytes(StandardCharsets.UTF_8)), lIIlllllIlIII[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllllIlIII[2], llllllllllllllIlllIlIIIIIlIlIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlIIIIIlIIllll) {
            llllllllllllllIlllIlIIIIIlIIllll.printStackTrace();
            return null;
        }
    }

    static {
        lIllIlIlIIIllIl();
        lIllIlIlIIIllII();
        SPECIAL_1 = new EnumC0003d(lIIlllllIIlll[lIIlllllIlIII[0]], lIIlllllIlIII[0]);
        SPECIAL_2 = new EnumC0003d(lIIlllllIIlll[lIIlllllIlIII[1]], lIIlllllIlIII[1]);
        NONE = new EnumC0003d(lIIlllllIIlll[lIIlllllIlIII[2]], lIIlllllIlIII[2]);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[lIIlllllIlIII[3]];
        enumC0003dArr[lIIlllllIlIII[0]] = SPECIAL_1;
        enumC0003dArr[lIIlllllIlIII[1]] = SPECIAL_2;
        enumC0003dArr[lIIlllllIlIII[2]] = NONE;
        $VALUES = enumC0003dArr;
    }
}
