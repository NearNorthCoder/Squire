package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.R  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/R.class */
class R extends HashMap<Integer, String> {
    private static /* synthetic */ int[] llIllllIl;
    private static /* synthetic */ String[] llIlllIll;

    static {
        lIlllIllllll();
        lIlllIlllllI();
    }

    private static void lIlllIllllll() {
        llIllllIl = new int[7];
        llIllllIl[0] = ((((14 + 15) - (-42)) + 182) ^ (((59 + 108) - 58) + 54)) & (((((190 + 47) - 133) + 112) ^ (((48 + 2) - (-68)) + 16)) ^ (-" ".length()));
        llIllllIl[1] = " ".length();
        llIllllIl[2] = "  ".length();
        llIllllIl[3] = "   ".length();
        llIllllIl[4] = 192 ^ 196;
        llIllllIl[5] = (98 ^ 67) ^ (54 ^ 18);
        llIllllIl[6] = 117 ^ 125;
    }

    private static void lIlllIlllllI() {
        llIlllIll = new String[llIllllIl[5]];
        llIlllIll[llIllllIl[0]] = lIlllIlllIll("ATQrBhEv", "BUYjt");
        llIlllIll[llIllllIl[1]] = lIlllIllllII("VIdes9nmaPw=", "IJxtF");
        llIlllIll[llIllllIl[2]] = lIlllIllllIl("uvQ7QVXBVthllR55OpGpfg==", "xYnuI");
        llIlllIll[llIllllIl[3]] = lIlllIlllIll("GSw7DAooMA==", "IYIob");
        llIlllIll[llIllllIl[4]] = lIlllIlllIll("HzgXJAA8Ng==", "XYuMn");
    }

    private static String lIlllIllllII(String lIIIIIllIllIlI, String lIIIIIllIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIllIllIIl.getBytes(StandardCharsets.UTF_8)), llIllllIl[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIllllIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIIllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIIllIllIll) {
            lIIIIIllIllIll.printStackTrace();
            return null;
        }
    }

    private static String lIlllIlllIll(String lIIIIIllIIlIlI, String lIIIIIllIIlIIl) {
        String str = new String(Base64.getDecoder().decode(lIIIIIllIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIIllIIlIII = new StringBuilder();
        char[] lIIIIIllIIIlll = lIIIIIllIIlIIl.toCharArray();
        int lIIIIIllIIIllI = llIllllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIllllIl[0];
        while (lIllllIIIIII(i, length)) {
            lIIIIIllIIlIII.append((char) (charArray[i] ^ lIIIIIllIIIlll[lIIIIIllIIIllI % lIIIIIllIIIlll.length]));
            "".length();
            lIIIIIllIIIllI++;
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lIIIIIllIIlIII);
    }

    private static String lIlllIllllIl(String lIIIIIlIllIlIl, String lIIIIIlIllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIlIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIIlIllIlll = Cipher.getInstance("Blowfish");
            lIIIIIlIllIlll.init(llIllllIl[2], secretKeySpec);
            return new String(lIIIIIlIllIlll.doFinal(Base64.getDecoder().decode(lIIIIIlIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIIlIllIllI) {
            lIIIIIlIllIllI.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public R() {
        put(Integer.valueOf(llIllllIl[0]), llIlllIll[llIllllIl[0]]);
        "".length();
        put(Integer.valueOf(llIllllIl[1]), llIlllIll[llIllllIl[1]]);
        "".length();
        put(Integer.valueOf(llIllllIl[2]), llIlllIll[llIllllIl[2]]);
        "".length();
        put(Integer.valueOf(llIllllIl[3]), llIlllIll[llIllllIl[3]]);
        "".length();
        put(Integer.valueOf(llIllllIl[4]), llIlllIll[llIllllIl[4]]);
        "".length();
    }

    private static boolean lIllllIIIIII(int i, int i2) {
        return i < i2;
    }
}
