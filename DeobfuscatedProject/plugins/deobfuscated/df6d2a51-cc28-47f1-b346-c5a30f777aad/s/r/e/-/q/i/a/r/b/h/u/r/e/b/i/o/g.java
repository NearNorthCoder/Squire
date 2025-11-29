/*
 * Decompiled with CFR 0.152.
 */
package s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class g
extends Enum<g> {
    public static final /* synthetic */ /* enum */ g H;
    public static final /* synthetic */ /* enum */ g J;
    private static final /* synthetic */ g[] $VALUES;
    public static final /* synthetic */ /* enum */ g E;
    public static final /* synthetic */ /* enum */ g K;
    public static final /* synthetic */ /* enum */ g C;
    public static final /* synthetic */ /* enum */ g D;
    private static /* synthetic */ int[] lllIIlllllIl;
    public static final /* synthetic */ /* enum */ g F;
    private static /* synthetic */ String[] lllIIlllIlIl;
    public static final /* synthetic */ /* enum */ g I;
    public static final /* synthetic */ /* enum */ g G;
    public static final /* synthetic */ /* enum */ g B;
    public static final /* synthetic */ /* enum */ g A;

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private static boolean lIIIlIllIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    private static String lIIIlIllIIIIlIl(String lllllllllllllllIIllIIlIllIlIIIIl, String lllllllllllllllIIllIIlIllIlIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlIllIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIllIlIIIII.getBytes(StandardCharsets.UTF_8)), lllIIlllllIl[8]), "DES");
            Cipher lllllllllllllllIIllIIlIllIlIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIIlIllIlIIlIl.init(lllIIlllllIl[2], lllllllllllllllIIllIIlIllIlIIllI);
            return new String(lllllllllllllllIIllIIlIllIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIlIllIlIIlII) {
            lllllllllllllllIIllIIlIllIlIIlII.printStackTrace();
            return null;
        }
    }

    static {
        g.lIIIlIllIlIIlIl();
        g.lIIIlIllIlIIlII();
        A = new g();
        B = new g();
        C = new g();
        D = new g();
        E = new g();
        F = new g();
        G = new g();
        H = new g();
        I = new g();
        J = new g();
        K = new g();
        g[] gArray = new g[lllIIlllllIl[11]];
        gArray[g.lllIIlllllIl[0]] = A;
        gArray[g.lllIIlllllIl[1]] = B;
        gArray[g.lllIIlllllIl[2]] = C;
        gArray[g.lllIIlllllIl[3]] = D;
        gArray[g.lllIIlllllIl[4]] = E;
        gArray[g.lllIIlllllIl[5]] = F;
        gArray[g.lllIIlllllIl[6]] = G;
        gArray[g.lllIIlllllIl[7]] = H;
        gArray[g.lllIIlllllIl[8]] = I;
        gArray[g.lllIIlllllIl[9]] = J;
        gArray[g.lllIIlllllIl[10]] = K;
        $VALUES = gArray;
    }

    private static void lIIIlIllIlIIlII() {
        lllIIlllIlIl = new String[lllIIlllllIl[11]];
        g.lllIIlllIlIl[g.lllIIlllllIl[0]] = g."A";
        g.lllIIlllIlIl[g.lllIIlllllIl[1]] = g."B";
        g.lllIIlllIlIl[g.lllIIlllllIl[2]] = g."C";
        g.lllIIlllIlIl[g.lllIIlllllIl[3]] = g."D";
        g.lllIIlllIlIl[g.lllIIlllllIl[4]] = g."E";
        g.lllIIlllIlIl[g.lllIIlllllIl[5]] = g."F";
        g.lllIIlllIlIl[g.lllIIlllllIl[6]] = g."G";
        g.lllIIlllIlIl[g.lllIIlllllIl[7]] = g."H";
        g.lllIIlllIlIl[g.lllIIlllllIl[8]] = g."I";
        g.lllIIlllIlIl[g.lllIIlllllIl[9]] = g."J";
        g.lllIIlllIlIl[g.lllIIlllllIl[10]] = g."K";
    }

    private static String lIIIlIllIIIIIll(String lllllllllllllllIIllIIlIllIlIlllI, String lllllllllllllllIIllIIlIllIlIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlIllIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIllIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIlIllIllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIlIllIllIIlI.init(lllIIlllllIl[2], lllllllllllllllIIllIIlIllIllIIll);
            return new String(lllllllllllllllIIllIIlIllIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIllIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIlIllIllIIIl) {
            lllllllllllllllIIllIIlIllIllIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIllIIIIIlI(String lllllllllllllllIIllIIlIlllIIIIII, String lllllllllllllllIIllIIlIllIllllll) {
        lllllllllllllllIIllIIlIlllIIIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlllIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIlIlllIIIIll = new StringBuilder();
        char[] lllllllllllllllIIllIIlIlllIIIIlI = lllllllllllllllIIllIIlIllIllllll.toCharArray();
        int lllllllllllllllIIllIIlIlllIIIIIl = lllIIlllllIl[0];
        char[] lllllllllllllllIIllIIlIllIlllIll = lllllllllllllllIIllIIlIlllIIIIII.toCharArray();
        int lllllllllllllllIIllIIlIllIlllIlI = lllllllllllllllIIllIIlIllIlllIll.length;
        int lllllllllllllllIIllIIlIllIlllIIl = lllIIlllllIl[0];
        while (g.lIIIlIllIlIIllI(lllllllllllllllIIllIIlIllIlllIIl, lllllllllllllllIIllIIlIllIlllIlI)) {
            char lllllllllllllllIIllIIlIlllIIIllI = lllllllllllllllIIllIIlIllIlllIll[lllllllllllllllIIllIIlIllIlllIIl];
            lllllllllllllllIIllIIlIlllIIIIll.append((char)(lllllllllllllllIIllIIlIlllIIIllI ^ lllllllllllllllIIllIIlIlllIIIIlI[lllllllllllllllIIllIIlIlllIIIIIl % lllllllllllllllIIllIIlIlllIIIIlI.length]));
            0;
            ++lllllllllllllllIIllIIlIlllIIIIIl;
            ++lllllllllllllllIIllIIlIllIlllIIl;
            0;
            if (-(92 + 10 - 101 + 168 ^ 151 + 55 - 80 + 46) < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIlIlllIIIIll);
    }

    private static void lIIIlIllIlIIlIl() {
        lllIIlllllIl = new int[12];
        g.lllIIlllllIl[0] = (0x6D ^ 0x72) & ~(0xA3 ^ 0xBC);
        g.lllIIlllllIl[1] = 1;
        g.lllIIlllllIl[2] = 2;
        g.lllIIlllllIl[3] = 3;
        g.lllIIlllllIl[4] = 0x30 ^ 0x76 ^ (0x19 ^ 0x5B);
        g.lllIIlllllIl[5] = 0x12 ^ 0x17;
        g.lllIIlllllIl[6] = 0xF1 ^ 0xC7 ^ (0x9A ^ 0xAA);
        g.lllIIlllllIl[7] = 0x25 ^ 0x63 ^ (0x81 ^ 0xC0);
        g.lllIIlllllIl[8] = 0xEE ^ 0x82 ^ (0xD1 ^ 0xB5);
        g.lllIIlllllIl[9] = 0xCE ^ 0xC7;
        g.lllIIlllllIl[10] = 0x67 ^ 0xA ^ (0xC3 ^ 0xA4);
        g.lllIIlllllIl[11] = 0xE0 ^ 0x88 ^ (0xE8 ^ 0x8B);
    }
}

