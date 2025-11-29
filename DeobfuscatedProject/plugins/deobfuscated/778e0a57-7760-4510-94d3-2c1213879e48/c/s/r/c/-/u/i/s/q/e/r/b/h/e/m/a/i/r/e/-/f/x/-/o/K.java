/*
 * Decompiled with CFR 0.152.
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.O;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class K {
    private static /* synthetic */ int[] lIlIlIIlIlIl;
    private final /* synthetic */ List<O> cd;
    private static /* synthetic */ String[] lIlIlIIlIIll;

    public K() {
        this.cd = new ArrayList<O>();
    }

    static {
        K.llIlllIlIIIIll();
        K.llIlllIlIIIIlI();
    }

    private static String llIlllIIllIIll(String lllllllllllllllIllIlIIIllIlllIII, String lllllllllllllllIllIlIIIllIllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIllIlIIIllIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIIllIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIIIllIlllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIIIllIlllIlI.init(lIlIlIIlIlIl[2], lllllllllllllllIllIlIIIllIlllIll);
            return new String(lllllllllllllllIllIlIIIllIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIIllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIIIllIlllIIl) {
            lllllllllllllllIllIlIIIllIlllIIl.printStackTrace();
            return null;
        }
    }

    public void a(O o2) {
        this.cd.add(o2);
        0;
    }

    public String bO() {
        return this.d().replaceAll(lIlIlIIlIIll[lIlIlIIlIlIl[0]], lIlIlIIlIIll[lIlIlIIlIlIl[1]]).replaceAll(lIlIlIIlIIll[lIlIlIIlIlIl[2]], lIlIlIIlIIll[lIlIlIIlIlIl[3]]);
    }

    private static void llIlllIlIIIIlI() {
        lIlIlIIlIIll = new String[lIlIlIIlIlIl[4]];
        K.lIlIlIIlIIll[K.lIlIlIIlIlIl[0]] = K."#";
        K.lIlIlIIlIIll[K.lIlIlIIlIlIl[1]] = K."";
        K.lIlIlIIlIIll[K.lIlIlIIlIlIl[2]] = K."¤";
        K.lIlIlIIlIIll[K.lIlIlIIlIlIl[3]] = K."";
    }

    public List<O> bP() {
        return this.cd;
    }

    private static String llIlllIlIIIIIl(String lllllllllllllllIllIlIIIlllIIlIII, String lllllllllllllllIllIlIIIlllIIllII) {
        lllllllllllllllIllIlIIIlllIIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIIIlllIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIIIlllIIlIll = new StringBuilder();
        char[] lllllllllllllllIllIlIIIlllIIlIlI = lllllllllllllllIllIlIIIlllIIllII.toCharArray();
        int lllllllllllllllIllIlIIIlllIIlIIl = lIlIlIIlIlIl[0];
        char[] lllllllllllllllIllIlIIIlllIIIIll = lllllllllllllllIllIlIIIlllIIlIII.toCharArray();
        int lllllllllllllllIllIlIIIlllIIIIlI = lllllllllllllllIllIlIIIlllIIIIll.length;
        int lllllllllllllllIllIlIIIlllIIIIIl = lIlIlIIlIlIl[0];
        while (K.llIlllIlIIIllI(lllllllllllllllIllIlIIIlllIIIIIl, lllllllllllllllIllIlIIIlllIIIIlI)) {
            char lllllllllllllllIllIlIIIlllIIlllI = lllllllllllllllIllIlIIIlllIIIIll[lllllllllllllllIllIlIIIlllIIIIIl];
            lllllllllllllllIllIlIIIlllIIlIll.append((char)(lllllllllllllllIllIlIIIlllIIlllI ^ lllllllllllllllIllIlIIIlllIIlIlI[lllllllllllllllIllIlIIIlllIIlIIl % lllllllllllllllIllIlIIIlllIIlIlI.length]));
            0;
            ++lllllllllllllllIllIlIIIlllIIlIIl;
            ++lllllllllllllllIllIlIIIlllIIIIIl;
            0;
            if (((65 + 138 - 201 + 171 ^ 102 + 49 - 58 + 67) & (0x77 ^ 0x3F ^ (0xD8 ^ 0x9D) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIlIIIlllIIlIll);
    }

    private static String llIlllIlIIIIII(String lllllllllllllllIllIlIIIllIlIlIIl, String lllllllllllllllIllIlIIIllIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIllIlIIIllIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), lIlIlIIlIlIl[5]), "DES");
            Cipher lllllllllllllllIllIlIIIllIlIllIl = Cipher.getInstance("DES");
            lllllllllllllllIllIlIIIllIlIllIl.init(lIlIlIIlIlIl[2], lllllllllllllllIllIlIIIllIlIlllI);
            return new String(lllllllllllllllIllIlIIIllIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIIllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIIIllIlIllII) {
            lllllllllllllllIllIlIIIllIlIllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllIlIIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llIlllIlIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIlllIlIIIIll() {
        lIlIlIIlIlIl = new int[6];
        K.lIlIlIIlIlIl[0] = 1 & (1 ^ -1);
        K.lIlIlIIlIlIl[1] = 1;
        K.lIlIlIIlIlIl[2] = 2;
        K.lIlIlIIlIlIl[3] = 3;
        K.lIlIlIIlIlIl[4] = 0xB3 ^ 0xB7;
        K.lIlIlIIlIlIl[5] = 0xA1 ^ 0xC3 ^ (0xFF ^ 0x95);
    }

    private static boolean llIlllIlIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public String d() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<O> lllllllllllllllIllIlIIIlllIllIIl = this.cd.iterator();
        while (K.llIlllIlIIIlII(lllllllllllllllIllIlIIIlllIllIIl.hasNext() ? 1 : 0)) {
            void lllllllllllllllIllIlIIIlllIllIlI;
            O lllllllllllllllIllIlIIIlllIllIII = lllllllllllllllIllIlIIIlllIllIIl.next();
            lllllllllllllllIllIlIIIlllIllIlI.append(lllllllllllllllIllIlIIIlllIllIII.ca());
            0;
            0;
            if ((0x8B ^ 0x8F) == (0x73 ^ 0x77)) continue;
            return null;
        }
        return String.valueOf(stringBuilder);
    }

    /*
     * WARNING - void declaration
     */
    public O w(int n2) {
        Iterator<O> lllllllllllllllIllIlIIIllllIIIIl = this.cd.iterator();
        while (K.llIlllIlIIIlII(lllllllllllllllIllIlIIIllllIIIIl.hasNext() ? 1 : 0)) {
            void lllllllllllllllIllIlIIIllllIIIlI;
            O lllllllllllllllIllIlIIIllllIIIII = lllllllllllllllIllIlIIIllllIIIIl.next();
            if (K.llIlllIlIIIlIl(lllllllllllllllIllIlIIIllllIIIII.bZ(), (int)lllllllllllllllIllIlIIIllllIIIlI)) {
                return lllllllllllllllIllIlIIIllllIIIII;
            }
            0;
            if (-1 < 0) continue;
            return null;
        }
        return null;
    }
}

