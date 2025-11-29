package m.e.a.i.z.m.r.p000.q.s.y.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.h  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/h.class */
class h extends HashMap<String, Integer> {
    private static /* synthetic */ String[] lIllIIIlllIII;
    final /* synthetic */ g q;
    private static /* synthetic */ int[] lIllIIIlllIll;

    static {
        llIIIlIlIllIIll();
        llIIIlIlIllIIIl();
    }

    private static String llIIIlIlIlIlIll(String llllllllllllllIllIIlIllIIIIlIIIl, String llllllllllllllIllIIlIllIIIIlIlIl) {
        String llllllllllllllIllIIlIllIIIIlIIIl2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIllIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIllIIIIlIlII = new StringBuilder();
        char[] charArray = llllllllllllllIllIIlIllIIIIlIlIl.toCharArray();
        int llllllllllllllIllIIlIllIIIIlIIlI = lIllIIIlllIll[0];
        char[] charArray2 = llllllllllllllIllIIlIllIIIIlIIIl2.toCharArray();
        int length = charArray2.length;
        int i = lIllIIIlllIll[0];
        while (llIIIlIlIllIlIl(i, length)) {
            llllllllllllllIllIIlIllIIIIlIlII.append((char) (charArray2[i] ^ charArray[llllllllllllllIllIIlIllIIIIlIIlI % charArray.length]));
            "".length();
            llllllllllllllIllIIlIllIIIIlIIlI++;
            i++;
            "".length();
            if ((-" ".length()) >= ("   ".length() & ("   ".length() ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIlIllIIIIlIlII);
    }

    private static String llIIIlIlIlIlIII(String llllllllllllllIllIIlIllIIIllIIll, String llllllllllllllIllIIlIllIIIllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIllIIIllIIlI.getBytes(StandardCharsets.UTF_8)), lIllIIIlllIll[14]), "DES");
            Cipher llllllllllllllIllIIlIllIIIllIlIl = Cipher.getInstance("DES");
            llllllllllllllIllIIlIllIIIllIlIl.init(lIllIIIlllIll[3], secretKeySpec);
            return new String(llllllllllllllIllIIlIllIIIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIllIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIllIIIllIlII) {
            llllllllllllllIllIIlIllIIIllIlII.printStackTrace();
            return null;
        }
    }

    private static void llIIIlIlIllIIll() {
        lIllIIIlllIll = new int[16];
        lIllIIIlllIll[0] = ((71 ^ 84) ^ (252 ^ 174)) & (((((5 + 98) - (-61)) + 40) ^ (((62 + 24) - (-35)) + 20)) ^ (-" ".length()));
        lIllIIIlllIll[1] = (107 ^ 76) ^ (85 ^ 100);
        lIllIIIlllIll[2] = " ".length();
        lIllIIIlllIll[3] = "  ".length();
        lIllIIIlllIll[4] = "   ".length();
        lIllIIIlllIll[5] = 160 ^ 180;
        lIllIIIlllIll[6] = (171 ^ 165) ^ (174 ^ 164);
        lIllIIIlllIll[7] = (29 ^ 17) ^ (5 ^ 27);
        lIllIIIlllIll[8] = 195 ^ 198;
        lIllIIIlllIll[9] = 61 ^ 45;
        lIllIIIlllIll[10] = 147 ^ 149;
        lIllIIIlllIll[11] = (47 ^ 11) ^ (125 ^ 87);
        lIllIIIlllIll[12] = (255 ^ 174) ^ (216 ^ 142);
        lIllIIIlllIll[13] = 174 ^ 165;
        lIllIIIlllIll[14] = (241 ^ 133) ^ (12 ^ 112);
        lIllIIIlllIll[15] = 31 ^ 22;
    }

    private static void llIIIlIlIllIIIl() {
        lIllIIIlllIII = new String[lIllIIIlllIll[15]];
        lIllIIIlllIII[lIllIIIlllIll[0]] = llIIIlIlIlIIlll("u9eDuNRPQut5plBkmvllkg==", "RMmJP");
        lIllIIIlllIII[lIllIIIlllIll[2]] = llIIIlIlIlIlIII("M+0Bh3WVQF04Z6Q4ru+cVQ==", "uHldm");
        lIllIIIlllIII[lIllIIIlllIll[3]] = llIIIlIlIlIIlll("FkS/7DM0MRi0+jv4pK6F/w==", "qZbTl");
        lIllIIIlllIII[lIllIIIlllIll[4]] = llIIIlIlIlIlIll("NgY1JD0=", "enTVV");
        lIllIIIlllIII[lIllIIIlllIll[6]] = llIIIlIlIlIlIII("4St0g0wWMuSfwLSyuQtLu7ayKtb7GYtH", "DtjJr");
        lIllIIIlllIII[lIllIIIlllIll[8]] = llIIIlIlIlIlIII("xCmum6poHz28tao0ieip8g==", "nEoqf");
        lIllIIIlllIII[lIllIIIlllIll[10]] = llIIIlIlIlIlIll("NRozAQ0fUioCFRcGNQ==", "vrZma");
        lIllIIIlllIII[lIllIIIlllIll[12]] = llIIIlIlIlIIlll("JzGpA+lh8ObI9ydd5FE4eFYxn716GrSc", "tXtGB");
        lIllIIIlllIII[lIllIIIlllIll[14]] = llIIIlIlIlIlIll("AAggEQQ=", "BgNtw");
    }

    private static boolean llIIIlIlIllIlIl(int i, int i2) {
        return i < i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(g gVar) {
        this.q = gVar;
        put(lIllIIIlllIII[lIllIIIlllIll[0]], Integer.valueOf(lIllIIIlllIll[1]));
        "".length();
        put(lIllIIIlllIII[lIllIIIlllIll[2]], Integer.valueOf(lIllIIIlllIll[1]));
        "".length();
        put(lIllIIIlllIII[lIllIIIlllIll[3]], Integer.valueOf(lIllIIIlllIll[1]));
        "".length();
        put(lIllIIIlllIII[lIllIIIlllIll[4]], Integer.valueOf(lIllIIIlllIll[5]));
        "".length();
        put(lIllIIIlllIII[lIllIIIlllIll[6]], Integer.valueOf(lIllIIIlllIll[7]));
        "".length();
        put(lIllIIIlllIII[lIllIIIlllIll[8]], Integer.valueOf(lIllIIIlllIll[9]));
        "".length();
        put(lIllIIIlllIII[lIllIIIlllIll[10]], Integer.valueOf(lIllIIIlllIll[11]));
        "".length();
        put(lIllIIIlllIII[lIllIIIlllIll[12]], Integer.valueOf(lIllIIIlllIll[13]));
        "".length();
        put(lIllIIIlllIII[lIllIIIlllIll[14]], Integer.valueOf(lIllIIIlllIll[14]));
        "".length();
    }

    private static String llIIIlIlIlIIlll(String llllllllllllllIllIIlIllIIIlIIllI, String llllllllllllllIllIIlIllIIIlIIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIIlIllIIIlIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIllIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIllIIIlIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIllIIIlIlIII.init(lIllIIIlllIll[3], llllllllllllllIllIIlIllIIIlIlIIl);
            return new String(llllllllllllllIllIIlIllIIIlIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIllIIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIllIIIlIIlll) {
            llllllllllllllIllIIlIllIIIlIIlll.printStackTrace();
            return null;
        }
    }
}
