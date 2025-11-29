/*
 * Decompiled with CFR 0.152.
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class B
extends HashMap<Integer, String> {
    private static /* synthetic */ int[] lIIIIIlIIII;
    private static /* synthetic */ String[] lIIIIIIllll;

    B() {
        this.put(lIIIIIlIIII[0], lIIIIIIllll[lIIIIIlIIII[0]]);
        0;
        this.put(lIIIIIlIIII[1], lIIIIIIllll[lIIIIIlIIII[1]]);
        0;
        this.put(lIIIIIlIIII[2], lIIIIIIllll[lIIIIIlIIII[2]]);
        0;
        this.put(lIIIIIlIIII[3], lIIIIIIllll[lIIIIIlIIII[3]]);
        0;
        this.put(lIIIIIlIIII[4], lIIIIIIllll[lIIIIIlIIII[4]]);
        0;
    }

    private static void llIlllIIlllIl() {
        lIIIIIlIIII = new int[7];
        B.lIIIIIlIIII[0] = (0x44 ^ 0x5B) & ~(0x37 ^ 0x28);
        B.lIIIIIlIIII[1] = 1;
        B.lIIIIIlIIII[2] = 2;
        B.lIIIIIlIIII[3] = 3;
        B.lIIIIIlIIII[4] = 0x66 ^ 0x3C ^ (0xCD ^ 0x93);
        B.lIIIIIlIIII[5] = 113 + 65 - 125 + 76 ^ 28 + 34 - -29 + 41;
        B.lIIIIIlIIII[6] = 0x9B ^ 0x93;
    }

    private static String llIlllIIllIIl(String lllllllllllllllllIIllllIIIlllIll, String lllllllllllllllllIIllllIIIlllIlI) {
        lllllllllllllllllIIllllIIIlllIll = new String(Base64.getDecoder().decode(lllllllllllllllllIIllllIIIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIIllllIIIlllIIl = new StringBuilder();
        char[] lllllllllllllllllIIllllIIIlllIII = lllllllllllllllllIIllllIIIlllIlI.toCharArray();
        int lllllllllllllllllIIllllIIIllIlll = lIIIIIlIIII[0];
        char[] lllllllllllllllllIIllllIIIllIIIl = lllllllllllllllllIIllllIIIlllIll.toCharArray();
        int lllllllllllllllllIIllllIIIllIIII = lllllllllllllllllIIllllIIIllIIIl.length;
        int lllllllllllllllllIIllllIIIlIllll = lIIIIIlIIII[0];
        while (B.llIlllIIllllI(lllllllllllllllllIIllllIIIlIllll, lllllllllllllllllIIllllIIIllIIII)) {
            char lllllllllllllllllIIllllIIIllllII = lllllllllllllllllIIllllIIIllIIIl[lllllllllllllllllIIllllIIIlIllll];
            lllllllllllllllllIIllllIIIlllIIl.append((char)(lllllllllllllllllIIllllIIIllllII ^ lllllllllllllllllIIllllIIIlllIII[lllllllllllllllllIIllllIIIllIlll % lllllllllllllllllIIllllIIIlllIII.length]));
            0;
            ++lllllllllllllllllIIllllIIIllIlll;
            ++lllllllllllllllllIIllllIIIlIllll;
            0;
            if ((3 & ~3) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIIllllIIIlllIIl);
    }

    private static String llIlllIIllIll(String lllllllllllllllllIIllllIIIlIIllI, String lllllllllllllllllIIllllIIIlIIIll) {
        try {
            SecretKeySpec lllllllllllllllllIIllllIIIlIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIllllIIIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIIllllIIIlIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllllIIllllIIIlIlIII.init(lIIIIIlIIII[2], lllllllllllllllllIIllllIIIlIlIIl);
            return new String(lllllllllllllllllIIllllIIIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIllllIIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIIllllIIIlIIlll) {
            lllllllllllllllllIIllllIIIlIIlll.printStackTrace();
            return null;
        }
    }

    private static void llIlllIIlllII() {
        lIIIIIIllll = new String[lIIIIIlIIII[5]];
        B.lIIIIIIllll[B.lIIIIIlIIII[0]] = B."Carlem";
        B.lIIIIIIllll[B.lIIIIIlIIII[1]] = B."Aber";
        B.lIIIIIIllll[B.lIIIIIlIIII[2]] = B."Camerinthum";
        B.lIIIIIIllll[B.lIIIIIlIIII[3]] = B."Purchai";
        B.lIIIIIIllll[B.lIIIIIlIIII[4]] = B."Gabindo";
    }

    static {
        B.llIlllIIlllIl();
        B.llIlllIIlllII();
    }

    private static boolean llIlllIIllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIlllIIllIlI(String lllllllllllllllllIIllllIIlIIlIIl, String lllllllllllllllllIIllllIIlIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllllIIllllIIlIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIllllIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), lIIIIIlIIII[6]), "DES");
            Cipher lllllllllllllllllIIllllIIlIIllIl = Cipher.getInstance("DES");
            lllllllllllllllllIIllllIIlIIllIl.init(lIIIIIlIIII[2], lllllllllllllllllIIllllIIlIIlllI);
            return new String(lllllllllllllllllIIllllIIlIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIllllIIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIIllllIIlIIllII) {
            lllllllllllllllllIIllllIIlIIllII.printStackTrace();
            return null;
        }
    }
}

