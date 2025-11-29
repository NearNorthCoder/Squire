/*
 * Decompiled with CFR 0.152.
 */
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class L
extends HashMap<Integer, String> {
    private static /* synthetic */ int[] lIIlIIlIl;
    private static /* synthetic */ String[] lIIlIIlII;

    private static void llllIIlllll() {
        lIIlIIlII = new String[lIIlIIlIl[5]];
        L.lIIlIIlII[L.lIIlIIlIl[0]] = L.llllIIlllII("Bhg8JSko", "EyNIL");
        L.lIIlIIlII[L.lIIlIIlIl[1]] = L.llllIIlllIl("FwN4m2TCFxE=", "mCGGZ");
        L.lIIlIIlII[L.lIIlIIlIl[2]] = L.llllIIllllI("XCrCYMSkGqD0hxSEFVPaSg==", "atEVi");
        L.lIIlIIlII[L.lIIlIIlIl[3]] = L.llllIIlllII("JRszLiAUBw==", "unAMH");
        L.lIIlIIlII[L.lIIlIIlIl[4]] = L.llllIIllllI("egojMh4FalQ=", "psJBY");
    }

    L() {
        this.put(lIIlIIlIl[0], lIIlIIlII[lIIlIIlIl[0]]);
        "".length();
        this.put(lIIlIIlIl[1], lIIlIIlII[lIIlIIlIl[1]]);
        "".length();
        this.put(lIIlIIlIl[2], lIIlIIlII[lIIlIIlIl[2]]);
        "".length();
        this.put(lIIlIIlIl[3], lIIlIIlII[lIIlIIlIl[3]]);
        "".length();
        this.put(lIIlIIlIl[4], lIIlIIlII[lIIlIIlIl[4]]);
        "".length();
    }

    private static String llllIIllllI(String lIIIlIIlIIlllII, String lIIIlIIlIIllIll) {
        try {
            SecretKeySpec lIIIlIIlIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIlIIlIIllIll.getBytes(StandardCharsets.UTF_8)), lIIlIIlIl[6]), "DES");
            Cipher lIIIlIIlIlIIIII = Cipher.getInstance("DES");
            lIIIlIIlIlIIIII.init(lIIlIIlIl[2], lIIIlIIlIlIIIIl);
            return new String(lIIIlIIlIlIIIII.doFinal(Base64.getDecoder().decode(lIIIlIIlIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlIIlIIlllll) {
            lIIIlIIlIIlllll.printStackTrace();
            return null;
        }
    }

    private static String llllIIlllIl(String lIIIlIIIllllIIl, String lIIIlIIIllllIII) {
        try {
            SecretKeySpec lIIIlIIIlllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlIIIllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIlIIIllllIll = Cipher.getInstance("Blowfish");
            lIIIlIIIllllIll.init(lIIlIIlIl[2], lIIIlIIIlllllII);
            return new String(lIIIlIIIllllIll.doFinal(Base64.getDecoder().decode(lIIIlIIIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlIIIllllIlI) {
            lIIIlIIIllllIlI.printStackTrace();
            return null;
        }
    }

    static {
        L.llllIlIIIII();
        L.llllIIlllll();
    }

    private static String llllIIlllII(String lIIIlIIlIIIlllI, String lIIIlIIlIIIllIl) {
        lIIIlIIlIIIlllI = new String(Base64.getDecoder().decode(lIIIlIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIlIIlIIIllII = new StringBuilder();
        char[] lIIIlIIlIIIlIll = lIIIlIIlIIIllIl.toCharArray();
        int lIIIlIIlIIIlIlI = lIIlIIlIl[0];
        char[] lIIIlIIlIIIIlII = lIIIlIIlIIIlllI.toCharArray();
        int lIIIlIIlIIIIIll = lIIIlIIlIIIIlII.length;
        int lIIIlIIlIIIIIlI = lIIlIIlIl[0];
        while (L.llllIlIIIIl(lIIIlIIlIIIIIlI, lIIIlIIlIIIIIll)) {
            char lIIIlIIlIIIllll = lIIIlIIlIIIIlII[lIIIlIIlIIIIIlI];
            lIIIlIIlIIIllII.append((char)(lIIIlIIlIIIllll ^ lIIIlIIlIIIlIll[lIIIlIIlIIIlIlI % lIIIlIIlIIIlIll.length]));
            "".length();
            ++lIIIlIIlIIIlIlI;
            ++lIIIlIIlIIIIIlI;
            "".length();
            if ((109 + 157 - 86 + 17 ^ 70 + 86 - -5 + 32) != " ".length()) continue;
            return null;
        }
        return String.valueOf(lIIIlIIlIIIllII);
    }

    private static void llllIlIIIII() {
        lIIlIIlIl = new int[7];
        L.lIIlIIlIl[0] = (0x2F ^ 5 ^ (0xF ^ 9)) & (0xCD ^ 0xA7 ^ (0xE8 ^ 0xAE) ^ -" ".length());
        L.lIIlIIlIl[1] = " ".length();
        L.lIIlIIlIl[2] = "  ".length();
        L.lIIlIIlIl[3] = "   ".length();
        L.lIIlIIlIl[4] = 4 ^ 0;
        L.lIIlIIlIl[5] = 111 + 73 - 182 + 158 ^ 72 + 126 - 140 + 107;
        L.lIIlIIlIl[6] = 39 + 97 - -35 + 14 ^ 82 + 43 - 24 + 76;
    }

    private static boolean llllIlIIIIl(int n2, int n3) {
        return n2 < n3;
    }
}

