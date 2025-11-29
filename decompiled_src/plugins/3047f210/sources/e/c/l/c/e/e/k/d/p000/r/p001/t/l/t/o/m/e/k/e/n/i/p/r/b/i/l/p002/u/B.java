package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.B  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/B.class */
class B extends HashMap<Integer, String> {
    private static /* synthetic */ int[] lIIIIIlIIII;
    private static /* synthetic */ String[] lIIIIIIllll;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B() {
        put(Integer.valueOf(lIIIIIlIIII[0]), lIIIIIIllll[lIIIIIlIIII[0]]);
        "".length();
        put(Integer.valueOf(lIIIIIlIIII[1]), lIIIIIIllll[lIIIIIlIIII[1]]);
        "".length();
        put(Integer.valueOf(lIIIIIlIIII[2]), lIIIIIIllll[lIIIIIlIIII[2]]);
        "".length();
        put(Integer.valueOf(lIIIIIlIIII[3]), lIIIIIIllll[lIIIIIlIIII[3]]);
        "".length();
        put(Integer.valueOf(lIIIIIlIIII[4]), lIIIIIIllll[lIIIIIlIIII[4]]);
        "".length();
    }

    private static void llIlllIIlllIl() {
        lIIIIIlIIII = new int[7];
        lIIIIIlIIII[0] = (68 ^ 91) & ((55 ^ 40) ^ (-1));
        lIIIIIlIIII[1] = " ".length();
        lIIIIIlIIII[2] = "  ".length();
        lIIIIIlIIII[3] = "   ".length();
        lIIIIIlIIII[4] = (102 ^ 60) ^ (205 ^ 147);
        lIIIIIlIIII[5] = (((113 + 65) - 125) + 76) ^ (((28 + 34) - (-29)) + 41);
        lIIIIIlIIII[6] = 155 ^ 147;
    }

    private static String llIlllIIllIIl(String lllllllllllllllllIIllllIIIlllIll, String lllllllllllllllllIIllllIIIlllIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIIllllIIIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllIIllllIIIlllIII = lllllllllllllllllIIllllIIIlllIlI.toCharArray();
        int lllllllllllllllllIIllllIIIllIlll = lIIIIIlIIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int lllllllllllllllllIIllllIIIlIllll = lIIIIIlIIII[0];
        while (llIlllIIllllI(lllllllllllllllllIIllllIIIlIllll, length)) {
            char lllllllllllllllllIIllllIIIlIlllI = charArray[lllllllllllllllllIIllllIIIlIllll];
            sb.append((char) (lllllllllllllllllIIllllIIIlIlllI ^ lllllllllllllllllIIllllIIIlllIII[lllllllllllllllllIIllllIIIllIlll % lllllllllllllllllIIllllIIIlllIII.length]));
            "".length();
            lllllllllllllllllIIllllIIIllIlll++;
            lllllllllllllllllIIllllIIIlIllll++;
            "".length();
            if (("   ".length() & ("   ".length() ^ (-1))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llIlllIIllIll(String lllllllllllllllllIIllllIIIlIIllI, String lllllllllllllllllIIllllIIIlIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIllllIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIlIIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIllllIIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIIllllIIIlIIlll) {
            lllllllllllllllllIIllllIIIlIIlll.printStackTrace();
            return null;
        }
    }

    private static void llIlllIIlllII() {
        lIIIIIIllll = new String[lIIIIIlIIII[5]];
        lIIIIIIllll[lIIIIIlIIII[0]] = llIlllIIllIIl("KyQIFT0F", "hEzyX");
        lIIIIIIllll[lIIIIIlIIII[1]] = llIlllIIllIlI("b5uLSghdISc=", "yqpfV");
        lIIIIIIllll[lIIIIIlIIII[2]] = llIlllIIllIIl("MhMhMhwYHDg/Gxw=", "qrLWn");
        lIIIIIIllll[lIIIIIlIIII[3]] = llIlllIIllIll("R4cBfiAzgCg=", "aJGjb");
        lIIIIIIllll[lIIIIIlIIII[4]] = llIlllIIllIlI("Gvo1lgwtn/Q=", "MskXB");
    }

    static {
        llIlllIIlllIl();
        llIlllIIlllII();
    }

    private static boolean llIlllIIllllI(int i, int i2) {
        return i < i2;
    }

    private static String llIlllIIllIlI(String lllllllllllllllllIIllllIIlIIlIll, String lllllllllllllllllIIllllIIlIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllllIIllllIIlIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIllllIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), lIIIIIlIIII[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIlIIII[2], lllllllllllllllllIIllllIIlIIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIllllIIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIIllllIIlIIllII) {
            lllllllllllllllllIIllllIIlIIllII.printStackTrace();
            return null;
        }
    }
}
