package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.F  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/F.class */
public class F {
    private static /* synthetic */ String[] lIIllIIIIIll;
    private static /* synthetic */ int[] lIIllIIIIlII;

    private static void llIIllIllllIIl() {
        lIIllIIIIIll = new String[lIIllIIIIlII[7]];
        lIIllIIIIIll[lIIllIIIIlII[1]] = llIIllIlllIlll("VEYN", "qjiUr");
        lIIllIIIIIll[lIIllIIIIlII[2]] = llIIllIlllIlll("YmQtDg==", "GHIEA");
        lIIllIIIIIll[lIIllIIIIlII[5]] = llIIllIllllIII("BQfsiEwecPE=", "uKpVG");
    }

    private static boolean llIIllIllllIll(int i, int i2) {
        return i < i2;
    }

    private static String llIIllIllllIII(String lllllllllllllllIllllIIIIIIlIIIlI, String lllllllllllllllIllllIIIIIIlIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIllllIIIIIIlIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllllIIIIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIIIIlII[5], lllllllllllllllIllllIIIIIIlIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllllIIIIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllllIIIIIIlIIIll) {
            lllllllllllllllIllllIIIIIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static String llIIllIlllIlll(String lllllllllllllllIllllIIIIIIllIlll, String lllllllllllllllIllllIIIIIIllIllI) {
        String lllllllllllllllIllllIIIIIIllIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllIllllIIIIIIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllllIIIIIIllIlIl = new StringBuilder();
        char[] lllllllllllllllIllllIIIIIIllIlII = lllllllllllllllIllllIIIIIIllIllI.toCharArray();
        int lllllllllllllllIllllIIIIIIlIlllI = lIIllIIIIlII[1];
        char[] charArray = lllllllllllllllIllllIIIIIIllIlll2.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIllllIIIIIIlIlIll = lIIllIIIIlII[1];
        while (llIIllIllllIll(lllllllllllllllIllllIIIIIIlIlIll, length)) {
            char lllllllllllllllIllllIIIIIIlllIII = charArray[lllllllllllllllIllllIIIIIIlIlIll];
            lllllllllllllllIllllIIIIIIllIlIl.append((char) (lllllllllllllllIllllIIIIIIlllIII ^ lllllllllllllllIllllIIIIIIllIlII[lllllllllllllllIllllIIIIIIlIlllI % lllllllllllllllIllllIIIIIIllIlII.length]));
            "".length();
            lllllllllllllllIllllIIIIIIlIlllI++;
            lllllllllllllllIllllIIIIIIlIlIll++;
            "".length();
            if (((243 ^ 176) & ((24 ^ 91) ^ (-1))) >= (111 ^ 107)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllllIIIIIIllIlIl);
    }

    private static void llIIllIllllIlI() {
        lIIllIIIIlII = new int[8];
        lIIllIIIIlII[0] = (-28994) & 128993;
        lIIllIIIIlII[1] = (240 ^ 164) & ((227 ^ 183) ^ (-1));
        lIIllIIIIlII[2] = " ".length();
        lIIllIIIIlII[3] = (-((-1668) & 28319)) & (-357) & 10027007;
        lIIllIIIIlII[4] = (-8198) & 9197;
        lIIllIIIIlII[5] = "  ".length();
        lIIllIIIIlII[6] = (-((-16409) & 19903)) & (-17) & 1003510;
        lIIllIIIIlII[7] = "   ".length();
    }

    public static String a(double d) {
        return h((int) d);
    }

    public static String h(int i) {
        if (llIIllIllllIll(i, lIIllIIIIlII[0])) {
            String str = lIIllIIIIIll[lIIllIIIIlII[1]];
            Object[] objArr = new Object[lIIllIIIIlII[2]];
            objArr[lIIllIIIIlII[1]] = Integer.valueOf(i);
            return String.format(str, objArr);
        } else if (llIIllIllllIll(i, lIIllIIIIlII[3])) {
            String str2 = lIIllIIIIIll[lIIllIIIIlII[2]];
            Object[] objArr2 = new Object[lIIllIIIIlII[2]];
            objArr2[lIIllIIIIlII[1]] = Integer.valueOf(i / lIIllIIIIlII[4]);
            return String.format(str2, objArr2);
        } else {
            String str3 = lIIllIIIIIll[lIIllIIIIlII[5]];
            Object[] objArr3 = new Object[lIIllIIIIlII[2]];
            objArr3[lIIllIIIIlII[1]] = Integer.valueOf(i / lIIllIIIIlII[6]);
            return String.format(str3, objArr3);
        }
    }

    static {
        llIIllIllllIlI();
        llIIllIllllIIl();
    }
}
