/*
 * Decompiled with CFR 0.152.
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class F {
    private static /* synthetic */ String[] lIIllIIIIIll;
    private static /* synthetic */ int[] lIIllIIIIlII;

    private static void llIIllIllllIIl() {
        lIIllIIIIIll = new String[lIIllIIIIlII[7]];
        F.lIIllIIIIIll[F.lIIllIIIIlII[1]] = F."%,d";
        F.lIIllIIIIIll[F.lIIllIIIIlII[2]] = F."%,dK";
        F.lIIllIIIIIll[F.lIIllIIIIlII[5]] = F."%,dM";
    }

    private static boolean llIIllIllllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIllIllllIII(String lllllllllllllllIllllIIIIIIlIIIlI, String lllllllllllllllIllllIIIIIIlIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIllllIIIIIIlIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllllIIIIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllllIIIIIIlIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllllIIIIIIlIIlII.init(lIIllIIIIlII[5], lllllllllllllllIllllIIIIIIlIIlIl);
            return new String(lllllllllllllllIllllIIIIIIlIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllllIIIIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllllIIIIIIlIIIll) {
            lllllllllllllllIllllIIIIIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static String llIIllIlllIlll(String lllllllllllllllIllllIIIIIIllIIlI, String lllllllllllllllIllllIIIIIIllIllI) {
        lllllllllllllllIllllIIIIIIllIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIllllIIIIIIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllllIIIIIIllIlIl = new StringBuilder();
        char[] lllllllllllllllIllllIIIIIIllIlII = lllllllllllllllIllllIIIIIIllIllI.toCharArray();
        int lllllllllllllllIllllIIIIIIllIIll = lIIllIIIIlII[1];
        char[] lllllllllllllllIllllIIIIIIlIllIl = lllllllllllllllIllllIIIIIIllIIlI.toCharArray();
        int lllllllllllllllIllllIIIIIIlIllII = lllllllllllllllIllllIIIIIIlIllIl.length;
        int lllllllllllllllIllllIIIIIIlIlIll = lIIllIIIIlII[1];
        while (F.llIIllIllllIll(lllllllllllllllIllllIIIIIIlIlIll, lllllllllllllllIllllIIIIIIlIllII)) {
            char lllllllllllllllIllllIIIIIIlllIII = lllllllllllllllIllllIIIIIIlIllIl[lllllllllllllllIllllIIIIIIlIlIll];
            lllllllllllllllIllllIIIIIIllIlIl.append((char)(lllllllllllllllIllllIIIIIIlllIII ^ lllllllllllllllIllllIIIIIIllIlII[lllllllllllllllIllllIIIIIIllIIll % lllllllllllllllIllllIIIIIIllIlII.length]));
            0;
            ++lllllllllllllllIllllIIIIIIllIIll;
            ++lllllllllllllllIllllIIIIIIlIlIll;
            0;
            if (((0xF3 ^ 0xB0) & ~(0x18 ^ 0x5B)) < (0x6F ^ 0x6B)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllllIIIIIIllIlIl);
    }

    private static void llIIllIllllIlI() {
        lIIllIIIIlII = new int[8];
        F.lIIllIIIIlII[0] = 0xFFFF8EBE & 0x1F7E1;
        F.lIIllIIIIlII[1] = (0xF0 ^ 0xA4) & ~(0xE3 ^ 0xB7);
        F.lIIllIIIIlII[2] = 1;
        F.lIIllIIIIlII[3] = -(0xFFFFF97C & 0x6E9F) & (0xFFFFFE9B & 0x98FFFF);
        F.lIIllIIIIlII[4] = 0xFFFFDFFA & 0x23ED;
        F.lIIllIIIIlII[5] = 2;
        F.lIIllIIIIlII[6] = -(0xFFFFBFE7 & 0x4DBF) & (0xFFFFFFEF & 0xF4FF6);
        F.lIIllIIIIlII[7] = 3;
    }

    public static String a(double d2) {
        return F.h((int)d2);
    }

    public static String h(int n2) {
        int lllllllllllllllIllllIIIIIlIIIIlI;
        if (F.llIIllIllllIll(n2, lIIllIIIIlII[0])) {
            Object[] objectArray = new Object[lIIllIIIIlII[2]];
            objectArray[F.lIIllIIIIlII[1]] = n2;
            return String.format(lIIllIIIIIll[lIIllIIIIlII[1]], objectArray);
        }
        if (F.llIIllIllllIll(lllllllllllllllIllllIIIIIlIIIIlI, lIIllIIIIlII[3])) {
            Object[] objectArray = new Object[lIIllIIIIlII[2]];
            objectArray[F.lIIllIIIIlII[1]] = lllllllllllllllIllllIIIIIlIIIIlI / lIIllIIIIlII[4];
            return String.format(lIIllIIIIIll[lIIllIIIIlII[2]], objectArray);
        }
        Object[] objectArray = new Object[lIIllIIIIlII[2]];
        objectArray[F.lIIllIIIIlII[1]] = n2 / lIIllIIIIlII[6];
        return String.format(lIIllIIIIIll[lIIllIIIIlII[5]], objectArray);
    }

    static {
        F.llIIllIllllIlI();
        F.llIIllIllllIIl();
    }
}

