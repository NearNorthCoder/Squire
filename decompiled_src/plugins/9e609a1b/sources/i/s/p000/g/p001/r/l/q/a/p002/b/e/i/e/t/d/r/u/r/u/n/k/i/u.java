package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.u  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/u.class */
class u extends HashMap<Integer, String> {
    private static /* synthetic */ String[] lIIlIIIIlIIII;
    private static /* synthetic */ int[] lIIlIIIIlIIIl;

    private static String lIlIIllllIlIIII(String llllllllllllllIlllllllIIlIIlIIll, String llllllllllllllIlllllllIIlIIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllllIIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), lIIlIIIIlIIIl[6]), "DES");
            Cipher llllllllllllllIlllllllIIlIIlIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllllllIIlIIlIlIl.init(lIIlIIIIlIIIl[2], secretKeySpec);
            return new String(llllllllllllllIlllllllIIlIIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllIIlIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllllIIlIIlIlII) {
            llllllllllllllIlllllllIIlIIlIlII.printStackTrace();
            return null;
        }
    }

    private static String lIlIIllllIlIIIl(String llllllllllllllIlllllllIIlIlIlIII, String llllllllllllllIlllllllIIlIlIIlll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllllllIIlIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllllllIIlIlIIlll.toCharArray();
        int llllllllllllllIlllllllIIlIlIIlII = lIIlIIIIlIIIl[0];
        char[] charArray2 = str.toCharArray();
        int llllllllllllllIlllllllIIlIIlllIl = charArray2.length;
        int i2 = lIIlIIIIlIIIl[0];
        while (lIlIIllllIlIlIl(i2, llllllllllllllIlllllllIIlIIlllIl)) {
            sb.append((char) (charArray2[i2] ^ charArray[llllllllllllllIlllllllIIlIlIIlII % charArray.length]));
            "".length();
            llllllllllllllIlllllllIIlIlIIlII++;
            i2++;
            "".length();
            if ((((((95 + 116) - 179) + 169) ^ (((65 + 107) - 139) + 102)) & (((((48 + 65) - 53) + 193) ^ (((80 + 4) - 27) + 122)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIIllllIlIlII() {
        lIIlIIIIlIIIl = new int[7];
        lIIlIIIIlIIIl[0] = "  ".length() & ("  ".length() ^ (-1));
        lIIlIIIIlIIIl[1] = " ".length();
        lIIlIIIIlIIIl[2] = "  ".length();
        lIIlIIIIlIIIl[3] = "   ".length();
        lIIlIIIIlIIIl[4] = 37 ^ 33;
        lIIlIIIIlIIIl[5] = 157 ^ 152;
        lIIlIIIIlIIIl[6] = ((80 ^ 15) & ((192 ^ 159) ^ (-1))) ^ (148 ^ 156);
    }

    private static void lIlIIllllIlIIll() {
        lIIlIIIIlIIII = new String[lIIlIIIIlIIIl[5]];
        lIIlIIIIlIIII[lIIlIIIIlIIIl[0]] = lIlIIllllIlIIII("yeRwSPQwsGk=", "vEUvL");
        lIIlIIIIlIIII[lIIlIIIIlIIIl[1]] = lIlIIllllIlIIII("fmWFc4QYW+I=", "jgUQN");
        lIIlIIIIlIIII[lIIlIIIIlIIIl[2]] = lIlIIllllIlIIIl("ICUoHSMKKjEQJA4=", "cDExQ");
        lIIlIIIIlIIII[lIIlIIIIlIIIl[3]] = lIlIIllllIlIIIl("OQYHDgYIGg==", "isumn");
        lIIlIIIIlIIII[lIIlIIIIlIIIl[4]] = lIlIIllllIlIIlI("FUVGUCLM3Ck=", "zdXjL");
    }

    private static boolean lIlIIllllIlIlIl(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u() {
        put(Integer.valueOf(lIIlIIIIlIIIl[0]), lIIlIIIIlIIII[lIIlIIIIlIIIl[0]]);
        "".length();
        put(Integer.valueOf(lIIlIIIIlIIIl[1]), lIIlIIIIlIIII[lIIlIIIIlIIIl[1]]);
        "".length();
        put(Integer.valueOf(lIIlIIIIlIIIl[2]), lIIlIIIIlIIII[lIIlIIIIlIIIl[2]]);
        "".length();
        put(Integer.valueOf(lIIlIIIIlIIIl[3]), lIIlIIIIlIIII[lIIlIIIIlIIIl[3]]);
        "".length();
        put(Integer.valueOf(lIIlIIIIlIIIl[4]), lIIlIIIIlIIII[lIIlIIIIlIIIl[4]]);
        "".length();
    }

    static {
        lIlIIllllIlIlII();
        lIlIIllllIlIIll();
    }

    private static String lIlIIllllIlIIlI(String llllllllllllllIlllllllIIlIIIIllI, String llllllllllllllIlllllllIIlIIIIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllllllIIlIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllllIIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIIIIlIIIl[2], llllllllllllllIlllllllIIlIIIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllIIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllllIIlIIIIlll) {
            llllllllllllllIlllllllIIlIIIIlll.printStackTrace();
            return null;
        }
    }
}
