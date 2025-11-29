/*
 * Decompiled with CFR 0.152.
 */
package -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class d {
    private static /* synthetic */ String[] lIllIIIIIIIll;
    private static /* synthetic */ int[] lIllIIIIIIlII;

    private static void llIIIIllllIIlll() {
        lIllIIIIIIIll = new String[lIllIIIIIIlII[7]];
        d.lIllIIIIIIIll[d.lIllIIIIIIlII[1]] = d."%,d";
        d.lIllIIIIIIIll[d.lIllIIIIIIlII[2]] = d."%,dK";
        d.lIllIIIIIIIll[d.lIllIIIIIIlII[5]] = d."%,dM";
    }

    public static String a(double d2) {
        return d.a((int)d2);
    }

    static {
        d.llIIIIllllIlIII();
        d.llIIIIllllIIlll();
    }

    public static String a(int n2) {
        int llllllllllllllIllIIllIllIlIIllII;
        if (d.llIIIIllllIlIIl(n2, lIllIIIIIIlII[0])) {
            Object[] objectArray = new Object[lIllIIIIIIlII[2]];
            objectArray[d.lIllIIIIIIlII[1]] = n2;
            return String.format(lIllIIIIIIIll[lIllIIIIIIlII[1]], objectArray);
        }
        if (d.llIIIIllllIlIIl(llllllllllllllIllIIllIllIlIIllII, lIllIIIIIIlII[3])) {
            Object[] objectArray = new Object[lIllIIIIIIlII[2]];
            objectArray[d.lIllIIIIIIlII[1]] = llllllllllllllIllIIllIllIlIIllII / lIllIIIIIIlII[4];
            return String.format(lIllIIIIIIIll[lIllIIIIIIlII[2]], objectArray);
        }
        Object[] objectArray = new Object[lIllIIIIIIlII[2]];
        objectArray[d.lIllIIIIIIlII[1]] = n2 / lIllIIIIIIlII[6];
        return String.format(lIllIIIIIIIll[lIllIIIIIIlII[5]], objectArray);
    }

    private static String llIIIIllllIIlIl(String llllllllllllllIllIIllIllIlIIIlII, String llllllllllllllIllIIllIllIlIIIIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIllIllIlIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIllIlIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIllIllIlIIIllI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIllIllIlIIIllI.init(lIllIIIIIIlII[5], llllllllllllllIllIIllIllIlIIIlll);
            return new String(llllllllllllllIllIIllIllIlIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIllIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllIllIlIIIlIl) {
            llllllllllllllIllIIllIllIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static void llIIIIllllIlIII() {
        lIllIIIIIIlII = new int[8];
        d.lIllIIIIIIlII[0] = 0xFFFFCEE6 & 0x1B7B9;
        d.lIllIIIIIIlII[1] = (23 + 104 - 97 + 126 ^ 29 + 61 - 21 + 66) & (0x7A ^ 0x30 ^ (0xE6 ^ 0xB7) ^ -1);
        d.lIllIIIIIIlII[2] = 1;
        d.lIllIIIIIIlII[3] = 0xFFFFB7ED & 0x98DE92;
        d.lIllIIIIIIlII[4] = 0xFFFF83FA & 0x7FED;
        d.lIllIIIIIIlII[5] = 2;
        d.lIllIIIIIIlII[6] = -(0xFFFFEFAF & 0x19F3) & (0xFFFFFBEB & 0xF4FF6);
        d.lIllIIIIIIlII[7] = 3;
    }

    private static boolean llIIIIllllIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIIllllIIllI(String llllllllllllllIllIIllIllIIllIlII, String llllllllllllllIllIIllIllIIlIlllI) {
        llllllllllllllIllIIllIllIIllIlII = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIllIIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIllIllIIllIIlI = new StringBuilder();
        char[] llllllllllllllIllIIllIllIIllIIIl = llllllllllllllIllIIllIllIIlIlllI.toCharArray();
        int llllllllllllllIllIIllIllIIllIIII = lIllIIIIIIlII[1];
        char[] llllllllllllllIllIIllIllIIlIlIlI = llllllllllllllIllIIllIllIIllIlII.toCharArray();
        int llllllllllllllIllIIllIllIIlIlIIl = llllllllllllllIllIIllIllIIlIlIlI.length;
        int llllllllllllllIllIIllIllIIlIlIII = lIllIIIIIIlII[1];
        while (d.llIIIIllllIlIIl(llllllllllllllIllIIllIllIIlIlIII, llllllllllllllIllIIllIllIIlIlIIl)) {
            char llllllllllllllIllIIllIllIIllIlIl = llllllllllllllIllIIllIllIIlIlIlI[llllllllllllllIllIIllIllIIlIlIII];
            llllllllllllllIllIIllIllIIllIIlI.append((char)(llllllllllllllIllIIllIllIIllIlIl ^ llllllllllllllIllIIllIllIIllIIIl[llllllllllllllIllIIllIllIIllIIII % llllllllllllllIllIIllIllIIllIIIl.length]));
            0;
            ++llllllllllllllIllIIllIllIIllIIII;
            ++llllllllllllllIllIIllIllIIlIlIII;
            0;
            if (-(2 ^ 5 ^ 2) < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIllIllIIllIIlI);
    }
}

