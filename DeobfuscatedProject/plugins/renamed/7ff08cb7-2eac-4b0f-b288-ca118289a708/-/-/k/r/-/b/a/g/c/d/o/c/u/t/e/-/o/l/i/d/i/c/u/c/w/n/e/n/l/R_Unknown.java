/*
 * Decompiled with CFR 0.152.
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class R_Unknown
extends HashMap<Integer, String> {
    private static /* synthetic */ int[] llIllllIl;
    private static /* synthetic */ String[] llIlllIll;

    static {
        R.lIlllIllllll();
        R.lIlllIlllllI();
    }

    private static void lIlllIllllll() {
        llIllllIl = new int[7];
        R.llIllllIl[0] = (14 + 15 - -42 + 182 ^ 59 + 108 - 58 + 54) & (190 + 47 - 133 + 112 ^ 48 + 2 - -68 + 16 ^ -1);
        R.llIllllIl[1] = 1;
        R.llIllllIl[2] = 2;
        R.llIllllIl[3] = 3;
        R.llIllllIl[4] = 0xC0 ^ 0xC4;
        R.llIllllIl[5] = 0x62 ^ 0x43 ^ (0x36 ^ 0x12);
        R.llIllllIl[6] = 0x75 ^ 0x7D;
    }

    private static void lIlllIlllllI() {
        llIlllIll = new String[llIllllIl[5]];
        R.llIlllIll[R.llIllllIl[0]] = R."Carlem";
        R.llIlllIll[R.llIllllIl[1]] = R."Aber";
        R.llIlllIll[R.llIllllIl[2]] = R."Camerinthum";
        R.llIlllIll[R.llIllllIl[3]] = R."Purchai";
        R.llIlllIll[R.llIllllIl[4]] = R."Gabindo";
    }

    private static String lIlllIllllII(String lIIIIIllIllIII, String lIIIIIllIllIIl) {
        try {
            SecretKeySpec lIIIIIllIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIllIllIIl.getBytes(StandardCharsets.UTF_8)), llIllllIl[6]), "DES");
            Cipher lIIIIIllIlllII = Cipher.getInstance("DES");
            lIIIIIllIlllII.init(llIllllIl[2], lIIIIIllIlllIl);
            return new String(lIIIIIllIlllII.doFinal(Base64.getDecoder().decode(lIIIIIllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIIllIllIll) {
            lIIIIIllIllIll.printStackTrace();
            return null;
        }
    }

    private static String lIlllIlllIll(String lIIIIIllIIlIlI, String lIIIIIllIIIlII) {
        lIIIIIllIIlIlI = new String(Base64.getDecoder().decode(lIIIIIllIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIIllIIlIII = new StringBuilder();
        char[] lIIIIIllIIIlll = lIIIIIllIIIlII.toCharArray();
        int lIIIIIllIIIllI = llIllllIl[0];
        char[] lIIIIIllIIIIII = lIIIIIllIIlIlI.toCharArray();
        int lIIIIIlIllllll = lIIIIIllIIIIII.length;
        int lIIIIIlIlllllI = llIllllIl[0];
        while (R.lIllllIIIIII(lIIIIIlIlllllI, lIIIIIlIllllll)) {
            char lIIIIIllIIlIll = lIIIIIllIIIIII[lIIIIIlIlllllI];
            lIIIIIllIIlIII.append((char)(lIIIIIllIIlIll ^ lIIIIIllIIIlll[lIIIIIllIIIllI % lIIIIIllIIIlll.length]));
            0;
            ++lIIIIIllIIIllI;
            ++lIIIIIlIlllllI;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(lIIIIIllIIlIII);
    }

    private static String lIlllIllllIl(String lIIIIIlIllIIll, String lIIIIIlIllIlII) {
        try {
            SecretKeySpec lIIIIIlIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIlIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIIlIllIlll = Cipher.getInstance("Blowfish");
            lIIIIIlIllIlll.init(llIllllIl[2], lIIIIIlIlllIII);
            return new String(lIIIIIlIllIlll.doFinal(Base64.getDecoder().decode(lIIIIIlIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIIlIllIllI) {
            lIIIIIlIllIllI.printStackTrace();
            return null;
        }
    }

    R() {
        this.put(llIllllIl[0], llIlllIll[llIllllIl[0]]);
        0;
        this.put(llIllllIl[1], llIlllIll[llIllllIl[1]]);
        0;
        this.put(llIllllIl[2], llIlllIll[llIllllIl[2]]);
        0;
        this.put(llIllllIl[3], llIlllIll[llIllllIl[3]]);
        0;
        this.put(llIllllIl[4], llIlllIll[llIllllIl[4]]);
        0;
    }

    private static boolean lIllllIIIIII(int n2, int n3) {
        return n2 < n3;
    }
}

