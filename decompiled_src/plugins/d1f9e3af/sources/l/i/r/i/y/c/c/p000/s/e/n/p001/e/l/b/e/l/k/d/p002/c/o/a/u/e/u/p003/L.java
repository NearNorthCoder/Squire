package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.L  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/L.class */
class L extends HashMap<Integer, String> {
    private static /* synthetic */ int[] lIIlIIlIl;
    private static /* synthetic */ String[] lIIlIIlII;

    private static void llllIIlllll() {
        lIIlIIlII = new String[lIIlIIlIl[5]];
        lIIlIIlII[lIIlIIlIl[0]] = llllIIlllII("Bhg8JSko", "EyNIL");
        lIIlIIlII[lIIlIIlIl[1]] = llllIIlllIl("FwN4m2TCFxE=", "mCGGZ");
        lIIlIIlII[lIIlIIlIl[2]] = llllIIllllI("XCrCYMSkGqD0hxSEFVPaSg==", "atEVi");
        lIIlIIlII[lIIlIIlIl[3]] = llllIIlllII("JRszLiAUBw==", "unAMH");
        lIIlIIlII[lIIlIIlIl[4]] = llllIIllllI("egojMh4FalQ=", "psJBY");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public L() {
        put(Integer.valueOf(lIIlIIlIl[0]), lIIlIIlII[lIIlIIlIl[0]]);
        "".length();
        put(Integer.valueOf(lIIlIIlIl[1]), lIIlIIlII[lIIlIIlIl[1]]);
        "".length();
        put(Integer.valueOf(lIIlIIlIl[2]), lIIlIIlII[lIIlIIlIl[2]]);
        "".length();
        put(Integer.valueOf(lIIlIIlIl[3]), lIIlIIlII[lIIlIIlIl[3]]);
        "".length();
        put(Integer.valueOf(lIIlIIlIl[4]), lIIlIIlII[lIIlIIlIl[4]]);
        "".length();
    }

    private static String llllIIllllI(String lIIIlIIlIIllllI, String lIIIlIIlIIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIlIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), lIIlIIlIl[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIIlIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIlIIlIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIlIIlIIlllll) {
            lIIIlIIlIIlllll.printStackTrace();
            return null;
        }
    }

    private static String llllIIlllIl(String lIIIlIIIllllIIl, String lIIIlIIIllllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlIIIllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIIlIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIlIIIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIlIIIllllIlI) {
            lIIIlIIIllllIlI.printStackTrace();
            return null;
        }
    }

    static {
        llllIlIIIII();
        llllIIlllll();
    }

    private static String llllIIlllII(String lIIIlIIlIIIlIIl, String lIIIlIIlIIIllIl) {
        String lIIIlIIlIIIlIIl2 = new String(Base64.getDecoder().decode(lIIIlIIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIlIIlIIIllII = new StringBuilder();
        char[] lIIIlIIlIIIlIll = lIIIlIIlIIIllIl.toCharArray();
        int lIIIlIIlIIIlIlI = lIIlIIlIl[0];
        char[] charArray = lIIIlIIlIIIlIIl2.toCharArray();
        int length = charArray.length;
        int i = lIIlIIlIl[0];
        while (llllIlIIIIl(i, length)) {
            char lIIIlIIlIIIIIIl = charArray[i];
            lIIIlIIlIIIllII.append((char) (lIIIlIIlIIIIIIl ^ lIIIlIIlIIIlIll[lIIIlIIlIIIlIlI % lIIIlIIlIIIlIll.length]));
            "".length();
            lIIIlIIlIIIlIlI++;
            i++;
            "".length();
            if (((((109 + 157) - 86) + 17) ^ (((70 + 86) - (-5)) + 32)) == " ".length()) {
                return null;
            }
        }
        return String.valueOf(lIIIlIIlIIIllII);
    }

    private static void llllIlIIIII() {
        lIIlIIlIl = new int[7];
        lIIlIIlIl[0] = ((47 ^ 5) ^ (15 ^ 9)) & (((205 ^ 167) ^ (232 ^ 174)) ^ (-" ".length()));
        lIIlIIlIl[1] = " ".length();
        lIIlIIlIl[2] = "  ".length();
        lIIlIIlIl[3] = "   ".length();
        lIIlIIlIl[4] = 4 ^ 0;
        lIIlIIlIl[5] = (((111 + 73) - 182) + 158) ^ (((72 + 126) - 140) + 107);
        lIIlIIlIl[6] = (((39 + 97) - (-35)) + 14) ^ (((82 + 43) - 24) + 76);
    }

    private static boolean llllIlIIIIl(int i, int i2) {
        return i < i2;
    }
}
