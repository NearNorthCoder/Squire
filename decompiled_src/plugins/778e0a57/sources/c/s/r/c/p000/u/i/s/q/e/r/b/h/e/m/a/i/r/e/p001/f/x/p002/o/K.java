package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.K  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/K.class */
public class K {
    private static /* synthetic */ int[] lIlIlIIlIlIl;
    private final /* synthetic */ List<O> cd = new ArrayList();
    private static /* synthetic */ String[] lIlIlIIlIIll;

    static {
        llIlllIlIIIIll();
        llIlllIlIIIIlI();
    }

    private static String llIlllIIllIIll(String lllllllllllllllIllIlIIIllIlllIII, String lllllllllllllllIllIlIIIllIllIlll) {
        try {
            SecretKeySpec lllllllllllllllIllIlIIIllIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIIllIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIlIlIl[2], lllllllllllllllIllIlIIIllIlllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIIllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIIIllIlllIIl) {
            lllllllllllllllIllIlIIIllIlllIIl.printStackTrace();
            return null;
        }
    }

    public void a(O o) {
        this.cd.add(o);
        "".length();
    }

    public String bO() {
        return d().replaceAll(lIlIlIIlIIll[lIlIlIIlIlIl[0]], lIlIlIIlIIll[lIlIlIIlIlIl[1]]).replaceAll(lIlIlIIlIIll[lIlIlIIlIlIl[2]], lIlIlIIlIIll[lIlIlIIlIlIl[3]]);
    }

    private static void llIlllIlIIIIlI() {
        lIlIlIIlIIll = new String[lIlIlIIlIlIl[4]];
        lIlIlIIlIIll[lIlIlIIlIlIl[0]] = llIlllIIllIIll("NxLoYezOPH4=", "wTyZx");
        lIlIlIIlIIll[lIlIlIIlIlIl[1]] = llIlllIlIIIIII("Co0jlF6Oauk=", "ZLOAe");
        lIlIlIIlIIll[lIlIlIIlIlIl[2]] = llIlllIlIIIIII("/up0qRa1e6M=", "uCUgp");
        lIlIlIIlIIll[lIlIlIIlIlIl[3]] = llIlllIlIIIIIl("", "orTmW");
    }

    public List<O> bP() {
        return this.cd;
    }

    private static String llIlllIlIIIIIl(String lllllllllllllllIllIlIIIlllIIllIl, String lllllllllllllllIllIlIIIlllIIllII) {
        String lllllllllllllllIllIlIIIlllIIllIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIIIlllIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIlIIIlllIIllII.toCharArray();
        int lllllllllllllllIllIlIIIlllIIlIIl = lIlIlIIlIlIl[0];
        char[] charArray2 = lllllllllllllllIllIlIIIlllIIllIl2.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIIlIlIl[0];
        while (llIlllIlIIIllI(i, length)) {
            char lllllllllllllllIllIlIIIlllIIlllI = charArray2[i];
            sb.append((char) (lllllllllllllllIllIlIIIlllIIlllI ^ charArray[lllllllllllllllIllIlIIIlllIIlIIl % charArray.length]));
            "".length();
            lllllllllllllllIllIlIIIlllIIlIIl++;
            i++;
            "".length();
            if ((((((65 + 138) - 201) + 171) ^ (((102 + 49) - 58) + 67)) & (((119 ^ 63) ^ (216 ^ 157)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llIlllIlIIIIII(String lllllllllllllllIllIlIIIllIlIlIll, String lllllllllllllllIllIlIIIllIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIllIlIIIllIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), lIlIlIIlIlIl[5]), "DES");
            Cipher lllllllllllllllIllIlIIIllIlIllIl = Cipher.getInstance("DES");
            lllllllllllllllIllIlIIIllIlIllIl.init(lIlIlIIlIlIl[2], lllllllllllllllIllIlIIIllIlIlllI);
            return new String(lllllllllllllllIllIlIIIllIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIIllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIIIllIlIllII) {
            lllllllllllllllIllIlIIIllIlIllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllIlIIIlII(int i) {
        return i != 0;
    }

    private static boolean llIlllIlIIIlIl(int i, int i2) {
        return i == i2;
    }

    private static void llIlllIlIIIIll() {
        lIlIlIIlIlIl = new int[6];
        lIlIlIIlIlIl[0] = " ".length() & (" ".length() ^ (-" ".length()));
        lIlIlIIlIlIl[1] = " ".length();
        lIlIlIIlIlIl[2] = "  ".length();
        lIlIlIIlIlIl[3] = "   ".length();
        lIlIlIIlIlIl[4] = 179 ^ 183;
        lIlIlIIlIlIl[5] = (161 ^ 195) ^ (255 ^ 149);
    }

    private static boolean llIlllIlIIIllI(int i, int i2) {
        return i < i2;
    }

    public String d() {
        StringBuilder sb = new StringBuilder();
        for (O o : this.cd) {
            sb.append(o.ca());
            "".length();
            "".length();
            if ((true ^ true) != (true ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public O w(int i) {
        for (O o : this.cd) {
            if (llIlllIlIIIlIl(o.bZ(), i)) {
                return o;
            }
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return null;
    }
}
