package h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.a  reason: invalid package */
/* loaded from: fabe4829-ed55-47a3-b654-ca361772d01e.jar:h/-/q/i/r/s/u/s/i/e/v/a/c/g/-/t/e/f/a.class */
public final class a {
    public static final /* synthetic */ a MELEE;
    public static final /* synthetic */ a RANGED;
    public static final /* synthetic */ a MAGIC;
    private static /* synthetic */ String[] llIIlIIIIlll;
    private static final /* synthetic */ a[] $VALUES;
    private static /* synthetic */ int[] llIIlIIIlIII;
    public static final /* synthetic */ a MIXED;

    static {
        lllllIIIIlIIIl();
        lllllIIIIlIIII();
        MELEE = new a(llIIlIIIIlll[llIIlIIIlIII[0]], llIIlIIIlIII[0]);
        RANGED = new a(llIIlIIIIlll[llIIlIIIlIII[1]], llIIlIIIlIII[1]);
        MAGIC = new a(llIIlIIIIlll[llIIlIIIlIII[2]], llIIlIIIlIII[2]);
        MIXED = new a(llIIlIIIIlll[llIIlIIIlIII[3]], llIIlIIIlIII[3]);
        a[] aVarArr = new a[llIIlIIIlIII[4]];
        aVarArr[llIIlIIIlIII[0]] = MELEE;
        aVarArr[llIIlIIIlIII[1]] = RANGED;
        aVarArr[llIIlIIIlIII[2]] = MAGIC;
        aVarArr[llIIlIIIlIII[3]] = MIXED;
        $VALUES = aVarArr;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    private a(String str, int i) {
    }

    private static void lllllIIIIlIIII() {
        llIIlIIIIlll = new String[llIIlIIIlIII[4]];
        llIIlIIIIlll[llIIlIIIlIII[0]] = lllllIIIIIllIl("c/8If96KM4s=", "iTkvS");
        llIIlIIIIlll[llIIlIIIlIII[1]] = lllllIIIIIlllI("Wx3Ft7N1fcM=", "GZrWS");
        llIIlIIIIlll[llIIlIIIlIII[2]] = lllllIIIIIlllI("EYE5kQhCOn0=", "kkhdJ");
        llIIlIIIIlll[llIIlIIIlIII[3]] = lllllIIIIIllll("PgwuMhU=", "sEvwQ");
    }

    private static String lllllIIIIIlllI(String lllllllllllllllIlIIllllllIlIIIII, String lllllllllllllllIlIIllllllIIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllllIIlllll.getBytes(StandardCharsets.UTF_8)), llIIlIIIlIII[5]), "DES");
            Cipher lllllllllllllllIlIIllllllIlIIIlI = Cipher.getInstance("DES");
            lllllllllllllllIlIIllllllIlIIIlI.init(llIIlIIIlIII[2], secretKeySpec);
            return new String(lllllllllllllllIlIIllllllIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllllIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllllllIIlllII) {
            lllllllllllllllIlIIllllllIIlllII.printStackTrace();
            return null;
        }
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    private static String lllllIIIIIllIl(String lllllllllllllllIlIIllllllIlIllIl, String lllllllllllllllIlIIllllllIlIllII) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllllIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllllIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllllllIlIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllllllIlIllll.init(llIIlIIIlIII[2], lllllllllllllllIlIIllllllIllIIII);
            return new String(lllllllllllllllIlIIllllllIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllllIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllllllIlIlllI) {
            lllllllllllllllIlIIllllllIlIlllI.printStackTrace();
            return null;
        }
    }

    private static void lllllIIIIlIIIl() {
        llIIlIIIlIII = new int[6];
        llIIlIIIlIII[0] = ((221 ^ 153) ^ (151 ^ 145)) & (((((4 + 2) - (-239)) + 8) ^ (((45 + 140) - 7) + 13)) ^ (-" ".length()));
        llIIlIIIlIII[1] = " ".length();
        llIIlIIIlIII[2] = "  ".length();
        llIIlIIIlIII[3] = "   ".length();
        llIIlIIIlIII[4] = (161 ^ 191) ^ (62 ^ 36);
        llIIlIIIlIII[5] = 5 ^ 13;
    }

    private static String lllllIIIIIllll(String lllllllllllllllIlIIlllllllIIIIlI, String lllllllllllllllIlIIlllllllIIIIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllllllIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlllllllIIIIII = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIlllllllIIIIIl.toCharArray();
        int lllllllllllllllIlIIllllllIlllIIl = llIIlIIIlIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIlIIIlIII[0];
        while (lllllIIIIlIIlI(i, length)) {
            char lllllllllllllllIlIIlllllllIIIIll = charArray2[i];
            lllllllllllllllIlIIlllllllIIIIII.append((char) (lllllllllllllllIlIIlllllllIIIIll ^ charArray[lllllllllllllllIlIIllllllIlllIIl % charArray.length]));
            "".length();
            lllllllllllllllIlIIllllllIlllIIl++;
            i++;
            "".length();
            if ((36 ^ 32) < (143 ^ 139)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlllllllIIIIII);
    }

    private static boolean lllllIIIIlIIlI(int i, int i2) {
        return i < i2;
    }
}
