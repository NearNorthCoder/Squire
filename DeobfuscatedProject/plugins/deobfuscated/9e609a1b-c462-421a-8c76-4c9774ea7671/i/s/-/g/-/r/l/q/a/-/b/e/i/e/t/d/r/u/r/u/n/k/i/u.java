/*
 * Decompiled with CFR 0.152.
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class u
extends HashMap<Integer, String> {
    private static /* synthetic */ String[] lIIlIIIIlIIII;
    private static /* synthetic */ int[] lIIlIIIIlIIIl;

    private static String lIlIIllllIlIIII(String llllllllllllllIlllllllIIlIIlIIll, String llllllllllllllIlllllllIIlIIlIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllllllIIlIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllllIIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), lIIlIIIIlIIIl[6]), "DES");
            Cipher llllllllllllllIlllllllIIlIIlIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllllllIIlIIlIlIl.init(lIIlIIIIlIIIl[2], llllllllllllllIlllllllIIlIIlIllI);
            return new String(llllllllllllllIlllllllIIlIIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllIIlIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllllIIlIIlIlII) {
            llllllllllllllIlllllllIIlIIlIlII.printStackTrace();
            return null;
        }
    }

    private static String lIlIIllllIlIIIl(String llllllllllllllIlllllllIIlIlIlIII, String llllllllllllllIlllllllIIlIlIIlll) {
        llllllllllllllIlllllllIIlIlIlIII = new String(Base64.getDecoder().decode(llllllllllllllIlllllllIIlIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllllllIIlIlIIllI = new StringBuilder();
        char[] llllllllllllllIlllllllIIlIlIIlIl = llllllllllllllIlllllllIIlIlIIlll.toCharArray();
        int llllllllllllllIlllllllIIlIlIIlII = lIIlIIIIlIIIl[0];
        char[] llllllllllllllIlllllllIIlIIllllI = llllllllllllllIlllllllIIlIlIlIII.toCharArray();
        int llllllllllllllIlllllllIIlIIlllIl = llllllllllllllIlllllllIIlIIllllI.length;
        int llllllllllllllIlllllllIIlIIlllII = lIIlIIIIlIIIl[0];
        while (u.lIlIIllllIlIlIl(llllllllllllllIlllllllIIlIIlllII, llllllllllllllIlllllllIIlIIlllIl)) {
            char llllllllllllllIlllllllIIlIlIlIIl = llllllllllllllIlllllllIIlIIllllI[llllllllllllllIlllllllIIlIIlllII];
            llllllllllllllIlllllllIIlIlIIllI.append((char)(llllllllllllllIlllllllIIlIlIlIIl ^ llllllllllllllIlllllllIIlIlIIlIl[llllllllllllllIlllllllIIlIlIIlII % llllllllllllllIlllllllIIlIlIIlIl.length]));
            0;
            ++llllllllllllllIlllllllIIlIlIIlII;
            ++llllllllllllllIlllllllIIlIIlllII;
            0;
            if (((95 + 116 - 179 + 169 ^ 65 + 107 - 139 + 102) & (48 + 65 - 53 + 193 ^ 80 + 4 - 27 + 122 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllllllIIlIlIIllI);
    }

    private static void lIlIIllllIlIlII() {
        lIIlIIIIlIIIl = new int[7];
        u.lIIlIIIIlIIIl[0] = 2 & ~2;
        u.lIIlIIIIlIIIl[1] = 1;
        u.lIIlIIIIlIIIl[2] = 2;
        u.lIIlIIIIlIIIl[3] = 3;
        u.lIIlIIIIlIIIl[4] = 0x25 ^ 0x21;
        u.lIIlIIIIlIIIl[5] = 0x9D ^ 0x98;
        u.lIIlIIIIlIIIl[6] = (0x50 ^ 0xF) & ~(0xC0 ^ 0x9F) ^ (0x94 ^ 0x9C);
    }

    private static void lIlIIllllIlIIll() {
        lIIlIIIIlIIII = new String[lIIlIIIIlIIIl[5]];
        u.lIIlIIIIlIIII[u.lIIlIIIIlIIIl[0]] = u."Carlem";
        u.lIIlIIIIlIIII[u.lIIlIIIIlIIIl[1]] = u."Aber";
        u.lIIlIIIIlIIII[u.lIIlIIIIlIIIl[2]] = u."Camerinthum";
        u.lIIlIIIIlIIII[u.lIIlIIIIlIIIl[3]] = u."Purchai";
        u.lIIlIIIIlIIII[u.lIIlIIIIlIIIl[4]] = u."Gabindo";
    }

    private static boolean lIlIIllllIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    u() {
        this.put(lIIlIIIIlIIIl[0], lIIlIIIIlIIII[lIIlIIIIlIIIl[0]]);
        0;
        this.put(lIIlIIIIlIIIl[1], lIIlIIIIlIIII[lIIlIIIIlIIIl[1]]);
        0;
        this.put(lIIlIIIIlIIIl[2], lIIlIIIIlIIII[lIIlIIIIlIIIl[2]]);
        0;
        this.put(lIIlIIIIlIIIl[3], lIIlIIIIlIIII[lIIlIIIIlIIIl[3]]);
        0;
        this.put(lIIlIIIIlIIIl[4], lIIlIIIIlIIII[lIIlIIIIlIIIl[4]]);
        0;
    }

    static {
        u.lIlIIllllIlIlII();
        u.lIlIIllllIlIIll();
    }

    private static String lIlIIllllIlIIlI(String llllllllllllllIlllllllIIlIIIIllI, String llllllllllllllIlllllllIIlIIIIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllllllIIlIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllllIIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllllIIlIIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllllIIlIIIlIII.init(lIIlIIIIlIIIl[2], llllllllllllllIlllllllIIlIIIlIIl);
            return new String(llllllllllllllIlllllllIIlIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllIIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllllIIlIIIIlll) {
            llllllllllllllIlllllllIIlIIIIlll.printStackTrace();
            return null;
        }
    }
}

