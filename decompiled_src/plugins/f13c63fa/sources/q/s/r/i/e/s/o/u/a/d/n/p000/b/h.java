package q.s.r.i.e.s.o.u.a.d.n.p000.b;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.h  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/h.class */
class h extends HashMap<String, Integer> {
    final /* synthetic */ g w;
    private static /* synthetic */ String[] llIllllllll;
    private static /* synthetic */ int[] lllIIIIIIll;

    private static boolean lIlIllIIllIIlI(int i, int i2) {
        return i < i2;
    }

    static {
        lIlIllIIllIIIl();
        lIlIllIIlIllIl();
    }

    private static String lIlIllIIlIIIll(String llllllllllllllllIIlIlIIIlIllllll, String llllllllllllllllIIlIlIIIlIlllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIlIlllllI.getBytes(StandardCharsets.UTF_8)), lllIIIIIIll[14]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIIIIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIIllIIIIII) {
            llllllllllllllllIIlIlIIIllIIIIII.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIIlIlIIl(String llllllllllllllllIIlIlIIIllIIllII, String llllllllllllllllIIlIlIIIllIIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIIIIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIIllIIllIl) {
            llllllllllllllllIIlIlIIIllIIllIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIIllIIIl() {
        lllIIIIIIll = new int[17];
        lllIIIIIIll[0] = ((40 ^ 30) ^ (2 ^ 31)) & (((216 ^ 158) ^ (208 ^ 189)) ^ (-" ".length()));
        lllIIIIIIll[1] = 29 ^ 11;
        lllIIIIIIll[2] = " ".length();
        lllIIIIIIll[3] = "  ".length();
        lllIIIIIIll[4] = "   ".length();
        lllIIIIIIll[5] = 172 ^ 184;
        lllIIIIIIll[6] = 6 ^ 2;
        lllIIIIIIll[7] = 7 ^ 21;
        lllIIIIIIll[8] = (23 ^ 109) ^ (((18 + 100) - 55) + 64);
        lllIIIIIIll[9] = (((91 + 54) - 27) + 29) ^ (((96 + 40) - 66) + 61);
        lllIIIIIIll[10] = 178 ^ 180;
        lllIIIIIIll[11] = 33 ^ 47;
        lllIIIIIIll[12] = 156 ^ 155;
        lllIIIIIIll[13] = 42 ^ 33;
        lllIIIIIIll[14] = 191 ^ 183;
        lllIIIIIIll[15] = 115 ^ 122;
        lllIIIIIIll[16] = 203 ^ 193;
    }

    private static void lIlIllIIlIllIl() {
        llIllllllll = new String[lllIIIIIIll[16]];
        llIllllllll[lllIIIIIIll[0]] = lIlIllIIlIIIlI("Iz8mGgsQNygFBg==", "bQAvn");
        llIllllllll[lllIIIIIIll[2]] = lIlIllIIlIIIlI("Lhg5NRZDCzY4", "cyWAw");
        llIllllllll[lllIIIIIIll[3]] = lIlIllIIlIIIlI("PicICC8fchUMLw==", "mReeJ");
        llIllllllll[lllIIIIIIll[4]] = lIlIllIIlIIIll("nOHD7IIAi4s=", "OdIPe");
        llIllllllll[lllIIIIIIll[6]] = lIlIllIIlIIIll("X2KmDlx4jDKiYYYUzcgQi8VuQsId5tbS", "UotfZ");
        llIllllllll[lllIIIIIIll[8]] = lIlIllIIlIIIll("bAu4SrwVhf10/7FPN2P7vA==", "QkDoN");
        llIllllllll[lllIIIIIIll[10]] = lIlIllIIlIIIlI("Jik9IhUMYSQhDQQ1Ow==", "eATNy");
        llIllllllll[lllIIIIIIll[12]] = lIlIllIIlIlIIl("ErJsmFz7GDIsQI/yQvjGnVoUlX0TFfID", "VdPDl");
        llIllllllll[lllIIIIIIll[14]] = lIlIllIIlIlIIl("yuPcq2Jbmug=", "rnEfw");
        llIllllllll[lllIIIIIIll[15]] = lIlIllIIlIlIIl("77yEbGd+e3s=", "DBLVz");
    }

    private static String lIlIllIIlIIIlI(String llllllllllllllllIIlIlIIIlIlIllll, String llllllllllllllllIIlIlIIIlIlIlllI) {
        String llllllllllllllllIIlIlIIIlIlIllll2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIlIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIIIlIlIllIl = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIlIIIlIlIlllI.toCharArray();
        int llllllllllllllllIIlIlIIIlIlIlIll = lllIIIIIIll[0];
        char[] charArray2 = llllllllllllllllIIlIlIIIlIlIllll2.toCharArray();
        int length = charArray2.length;
        int llllllllllllllllIIlIlIIIlIlIIIll = lllIIIIIIll[0];
        while (lIlIllIIllIIlI(llllllllllllllllIIlIlIIIlIlIIIll, length)) {
            llllllllllllllllIIlIlIIIlIlIllIl.append((char) (charArray2[llllllllllllllllIIlIlIIIlIlIIIll] ^ charArray[llllllllllllllllIIlIlIIIlIlIlIll % charArray.length]));
            "".length();
            llllllllllllllllIIlIlIIIlIlIlIll++;
            llllllllllllllllIIlIlIIIlIlIIIll++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIlIIIlIlIllIl);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(g gVar) {
        this.w = gVar;
        put(llIllllllll[lllIIIIIIll[0]], Integer.valueOf(lllIIIIIIll[1]));
        "".length();
        put(llIllllllll[lllIIIIIIll[2]], Integer.valueOf(lllIIIIIIll[1]));
        "".length();
        put(llIllllllll[lllIIIIIIll[3]], Integer.valueOf(lllIIIIIIll[1]));
        "".length();
        put(llIllllllll[lllIIIIIIll[4]], Integer.valueOf(lllIIIIIIll[5]));
        "".length();
        put(llIllllllll[lllIIIIIIll[6]], Integer.valueOf(lllIIIIIIll[7]));
        "".length();
        put(llIllllllll[lllIIIIIIll[8]], Integer.valueOf(lllIIIIIIll[9]));
        "".length();
        put(llIllllllll[lllIIIIIIll[10]], Integer.valueOf(lllIIIIIIll[11]));
        "".length();
        put(llIllllllll[lllIIIIIIll[12]], Integer.valueOf(lllIIIIIIll[13]));
        "".length();
        put(llIllllllll[lllIIIIIIll[14]], Integer.valueOf(lllIIIIIIll[14]));
        "".length();
        put(llIllllllll[lllIIIIIIll[15]], Integer.valueOf(lllIIIIIIll[14]));
        "".length();
    }
}
