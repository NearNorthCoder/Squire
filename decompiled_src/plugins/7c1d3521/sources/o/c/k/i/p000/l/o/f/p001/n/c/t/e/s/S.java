package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.S  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/S.class */
class S extends HashMap<Integer, String> {
    private static /* synthetic */ String[] llIlIIlllI;
    private static /* synthetic */ int[] llIlIIllll;

    private static void lIllIIlIlllII() {
        llIlIIllll = new int[7];
        llIlIIllll[0] = "   ".length() & ("   ".length() ^ (-1)) & (((201 ^ 192) & ((30 ^ 23) ^ (-1))) ^ (-1));
        llIlIIllll[1] = " ".length();
        llIlIIllll[2] = "  ".length();
        llIlIIllll[3] = "   ".length();
        llIlIIllll[4] = 69 ^ 65;
        llIlIIllll[5] = 126 ^ 123;
        llIlIIllll[6] = 152 ^ 144;
    }

    static {
        lIllIIlIlllII();
        lIllIIlIllIll();
    }

    private static void lIllIIlIllIll() {
        llIlIIlllI = new String[llIlIIllll[5]];
        llIlIIlllI[llIlIIllll[0]] = lIllIIlIlIlll("NIeOWbpZXEA=", "YvaAE");
        llIlIIlllI[llIlIIllll[1]] = lIllIIlIlIlll("qthi9vvtbig=", "pRwNw");
        llIlIIlllI[llIlIIllll[2]] = lIllIIlIlIlll("xqVjXXyYWnoUG1Ww7f4pbQ==", "bkltL");
        llIlIIlllI[llIlIIllll[3]] = lIllIIlIlIlll("VQdcRbADG9k=", "fueKo");
        llIlIIlllI[llIlIIllll[4]] = lIllIIlIlIlll("prlE27//S+c=", "WZkGY");
    }

    private static String lIllIIlIlIlll(String llllllllllllllllllIIIlllllIIlIIl, String llllllllllllllllllIIIlllllIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlllllIIlIII.getBytes(StandardCharsets.UTF_8)), llIlIIllll[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIIllll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlllllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIlllllIIlIlI) {
            llllllllllllllllllIIIlllllIIlIlI.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public S() {
        put(Integer.valueOf(llIlIIllll[0]), llIlIIlllI[llIlIIllll[0]]);
        "".length();
        put(Integer.valueOf(llIlIIllll[1]), llIlIIlllI[llIlIIllll[1]]);
        "".length();
        put(Integer.valueOf(llIlIIllll[2]), llIlIIlllI[llIlIIllll[2]]);
        "".length();
        put(Integer.valueOf(llIlIIllll[3]), llIlIIlllI[llIlIIllll[3]]);
        "".length();
        put(Integer.valueOf(llIlIIllll[4]), llIlIIlllI[llIlIIllll[4]]);
        "".length();
    }
}
