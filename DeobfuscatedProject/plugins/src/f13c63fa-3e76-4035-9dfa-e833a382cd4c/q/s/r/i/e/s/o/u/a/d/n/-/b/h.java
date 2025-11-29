/*
 * Decompiled with CFR 0.152.
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import q.s.r.i.e.s.o.u.a.d.n.-.b.g;

class h
extends HashMap<String, Integer> {
    final /* synthetic */ g w;
    private static /* synthetic */ String[] llIllllllll;
    private static /* synthetic */ int[] lllIIIIIIll;

    private static boolean lIlIllIIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        h.lIlIllIIllIIIl();
        h.lIlIllIIlIllIl();
    }

    private static String lIlIllIIlIIIll(String llllllllllllllllIIlIlIIIlIllllll, String llllllllllllllllIIlIlIIIlIllllII) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIIllIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIlIllllII.getBytes(StandardCharsets.UTF_8)), lllIIIIIIll[14]), "DES");
            Cipher llllllllllllllllIIlIlIIIllIIIIIl = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIIIllIIIIIl.init(lllIIIIIIll[3], llllllllllllllllIIlIlIIIllIIIIlI);
            return new String(llllllllllllllllIIlIlIIIllIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIIllIIIIII) {
            llllllllllllllllIIlIlIIIllIIIIII.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIIlIlIIl(String llllllllllllllllIIlIlIIIllIIllII, String llllllllllllllllIIlIlIIIllIIlIll) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIIllIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIIIllIIlllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIIIllIIlllI.init(lllIIIIIIll[3], llllllllllllllllIIlIlIIIllIIllll);
            return new String(llllllllllllllllIIlIlIIIllIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIIllIIllIl) {
            llllllllllllllllIIlIlIIIllIIllIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIIllIIIl() {
        lllIIIIIIll = new int[17];
        h.lllIIIIIIll[0] = (0x28 ^ 0x1E ^ (2 ^ 0x1F)) & (0xD8 ^ 0x9E ^ (0xD0 ^ 0xBD) ^ -" ".length());
        h.lllIIIIIIll[1] = 0x1D ^ 0xB;
        h.lllIIIIIIll[2] = " ".length();
        h.lllIIIIIIll[3] = "  ".length();
        h.lllIIIIIIll[4] = "   ".length();
        h.lllIIIIIIll[5] = 0xAC ^ 0xB8;
        h.lllIIIIIIll[6] = 6 ^ 2;
        h.lllIIIIIIll[7] = 7 ^ 0x15;
        h.lllIIIIIIll[8] = 0x17 ^ 0x6D ^ 18 + 100 - 55 + 64;
        h.lllIIIIIIll[9] = 91 + 54 - 27 + 29 ^ 96 + 40 - 66 + 61;
        h.lllIIIIIIll[10] = 0xB2 ^ 0xB4;
        h.lllIIIIIIll[11] = 0x21 ^ 0x2F;
        h.lllIIIIIIll[12] = 0x9C ^ 0x9B;
        h.lllIIIIIIll[13] = 0x2A ^ 0x21;
        h.lllIIIIIIll[14] = 0xBF ^ 0xB7;
        h.lllIIIIIIll[15] = 0x73 ^ 0x7A;
        h.lllIIIIIIll[16] = 0xCB ^ 0xC1;
    }

    private static void lIlIllIIlIllIl() {
        llIllllllll = new String[lllIIIIIIll[16]];
        h.llIllllllll[h.lllIIIIIIll[0]] = h.lIlIllIIlIIIlI("Iz8mGgsQNygFBg==", "bQAvn");
        h.llIllllllll[h.lllIIIIIIll[2]] = h.lIlIllIIlIIIlI("Lhg5NRZDCzY4", "cyWAw");
        h.llIllllllll[h.lllIIIIIIll[3]] = h.lIlIllIIlIIIlI("PicICC8fchUMLw==", "mReeJ");
        h.llIllllllll[h.lllIIIIIIll[4]] = h.lIlIllIIlIIIll("nOHD7IIAi4s=", "OdIPe");
        h.llIllllllll[h.lllIIIIIIll[6]] = h.lIlIllIIlIIIll("X2KmDlx4jDKiYYYUzcgQi8VuQsId5tbS", "UotfZ");
        h.llIllllllll[h.lllIIIIIIll[8]] = h.lIlIllIIlIIIll("bAu4SrwVhf10/7FPN2P7vA==", "QkDoN");
        h.llIllllllll[h.lllIIIIIIll[10]] = h.lIlIllIIlIIIlI("Jik9IhUMYSQhDQQ1Ow==", "eATNy");
        h.llIllllllll[h.lllIIIIIIll[12]] = h.lIlIllIIlIlIIl("ErJsmFz7GDIsQI/yQvjGnVoUlX0TFfID", "VdPDl");
        h.llIllllllll[h.lllIIIIIIll[14]] = h.lIlIllIIlIlIIl("yuPcq2Jbmug=", "rnEfw");
        h.llIllllllll[h.lllIIIIIIll[15]] = h.lIlIllIIlIlIIl("77yEbGd+e3s=", "DBLVz");
    }

    private static String lIlIllIIlIIIlI(String llllllllllllllllIIlIlIIIlIlIlIlI, String llllllllllllllllIIlIlIIIlIlIlIIl) {
        llllllllllllllllIIlIlIIIlIlIlIlI = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIIIlIlIllIl = new StringBuilder();
        char[] llllllllllllllllIIlIlIIIlIlIllII = llllllllllllllllIIlIlIIIlIlIlIIl.toCharArray();
        int llllllllllllllllIIlIlIIIlIlIlIll = lllIIIIIIll[0];
        char[] llllllllllllllllIIlIlIIIlIlIIlIl = llllllllllllllllIIlIlIIIlIlIlIlI.toCharArray();
        int llllllllllllllllIIlIlIIIlIlIIlII = llllllllllllllllIIlIlIIIlIlIIlIl.length;
        int llllllllllllllllIIlIlIIIlIlIIIll = lllIIIIIIll[0];
        while (h.lIlIllIIllIIlI(llllllllllllllllIIlIlIIIlIlIIIll, llllllllllllllllIIlIlIIIlIlIIlII)) {
            char llllllllllllllllIIlIlIIIlIllIIII = llllllllllllllllIIlIlIIIlIlIIlIl[llllllllllllllllIIlIlIIIlIlIIIll];
            llllllllllllllllIIlIlIIIlIlIllIl.append((char)(llllllllllllllllIIlIlIIIlIllIIII ^ llllllllllllllllIIlIlIIIlIlIllII[llllllllllllllllIIlIlIIIlIlIlIll % llllllllllllllllIIlIlIIIlIlIllII.length]));
            "".length();
            ++llllllllllllllllIIlIlIIIlIlIlIll;
            ++llllllllllllllllIIlIlIIIlIlIIIll;
            "".length();
            if ("   ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIlIIIlIlIllIl);
    }

    h(g g2) {
        this.w = g2;
        this.put(llIllllllll[lllIIIIIIll[0]], lllIIIIIIll[1]);
        "".length();
        this.put(llIllllllll[lllIIIIIIll[2]], lllIIIIIIll[1]);
        "".length();
        this.put(llIllllllll[lllIIIIIIll[3]], lllIIIIIIll[1]);
        "".length();
        this.put(llIllllllll[lllIIIIIIll[4]], lllIIIIIIll[5]);
        "".length();
        this.put(llIllllllll[lllIIIIIIll[6]], lllIIIIIIll[7]);
        "".length();
        this.put(llIllllllll[lllIIIIIIll[8]], lllIIIIIIll[9]);
        "".length();
        this.put(llIllllllll[lllIIIIIIll[10]], lllIIIIIIll[11]);
        "".length();
        this.put(llIllllllll[lllIIIIIIll[12]], lllIIIIIIll[13]);
        "".length();
        this.put(llIllllllll[lllIIIIIIll[14]], lllIIIIIIll[14]);
        "".length();
        this.put(llIllllllll[lllIIIIIIll[15]], lllIIIIIIll[14]);
        "".length();
    }
}

