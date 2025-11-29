/*
 * Decompiled with CFR 0.152.
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class g
extends Enum<g> {
    private static /* synthetic */ String[] lllIlllIIlIl;
    private static /* synthetic */ int[] lllIlllIlIIl;
    public static final /* synthetic */ /* enum */ g FULL;
    private static final /* synthetic */ g[] $VALUES;
    public static final /* synthetic */ /* enum */ g TRANSITION;
    public static final /* synthetic */ /* enum */ g OPEN;
    public static final /* synthetic */ /* enum */ g EMPTY;

    private static String lIIIllIllIllIll(String lllllllllllllllIIlIlllIIlIllIlII, String lllllllllllllllIIlIlllIIlIllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIIlIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIIlIllIIIl.getBytes(StandardCharsets.UTF_8)), lllIlllIlIIl[5]), "DES");
            Cipher lllllllllllllllIIlIlllIIlIllIllI = Cipher.getInstance("DES");
            lllllllllllllllIIlIlllIIlIllIllI.init(lllIlllIlIIl[2], lllllllllllllllIIlIlllIIlIllIlll);
            return new String(lllllllllllllllIIlIlllIIlIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIlIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllIIlIllIlIl) {
            lllllllllllllllIIlIlllIIlIllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIlllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        g.lIIIllIlllIIIlI();
        g.lIIIllIlllIIIII();
        OPEN = new g();
        EMPTY = new g();
        FULL = new g();
        TRANSITION = new g();
        g[] gArray = new g[lllIlllIlIIl[4]];
        gArray[g.lllIlllIlIIl[0]] = OPEN;
        gArray[g.lllIlllIlIIl[1]] = EMPTY;
        gArray[g.lllIlllIlIIl[2]] = FULL;
        gArray[g.lllIlllIlIIl[3]] = TRANSITION;
        $VALUES = gArray;
    }

    private static String lIIIllIllIlllll(String lllllllllllllllIIlIlllIIllIlIllI, String lllllllllllllllIIlIlllIIllIlIIII) {
        lllllllllllllllIIlIlllIIllIlIllI = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIllIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlllIIllIlIlII = new StringBuilder();
        char[] lllllllllllllllIIlIlllIIllIlIIll = lllllllllllllllIIlIlllIIllIlIIII.toCharArray();
        int lllllllllllllllIIlIlllIIllIlIIlI = lllIlllIlIIl[0];
        char[] lllllllllllllllIIlIlllIIllIIllII = lllllllllllllllIIlIlllIIllIlIllI.toCharArray();
        int lllllllllllllllIIlIlllIIllIIlIll = lllllllllllllllIIlIlllIIllIIllII.length;
        int lllllllllllllllIIlIlllIIllIIlIlI = lllIlllIlIIl[0];
        while (g.lIIIllIlllIIlIl(lllllllllllllllIIlIlllIIllIIlIlI, lllllllllllllllIIlIlllIIllIIlIll)) {
            char lllllllllllllllIIlIlllIIllIlIlll = lllllllllllllllIIlIlllIIllIIllII[lllllllllllllllIIlIlllIIllIIlIlI];
            lllllllllllllllIIlIlllIIllIlIlII.append((char)(lllllllllllllllIIlIlllIIllIlIlll ^ lllllllllllllllIIlIlllIIllIlIIll[lllllllllllllllIIlIlllIIllIlIIlI % lllllllllllllllIIlIlllIIllIlIIll.length]));
            0;
            ++lllllllllllllllIIlIlllIIllIlIIlI;
            ++lllllllllllllllIIlIlllIIllIIlIlI;
            0;
            if (-(0xC ^ 8) < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlllIIllIlIlII);
    }

    private static void lIIIllIlllIIIII() {
        lllIlllIIlIl = new String[lllIlllIlIIl[4]];
        g.lllIlllIIlIl[g.lllIlllIlIIl[0]] = g."OPEN";
        g.lllIlllIIlIl[g.lllIlllIlIIl[1]] = g."EMPTY";
        g.lllIlllIIlIl[g.lllIlllIlIIl[2]] = g."FULL";
        g.lllIlllIIlIl[g.lllIlllIlIIl[3]] = g."TRANSITION";
    }

    private static void lIIIllIlllIIIlI() {
        lllIlllIlIIl = new int[6];
        g.lllIlllIlIIl[0] = (0x60 ^ 0x75) & ~(9 ^ 0x1C);
        g.lllIlllIlIIl[1] = 1;
        g.lllIlllIlIIl[2] = 2;
        g.lllIlllIlIIl[3] = 3;
        g.lllIlllIlIIl[4] = 0x3C ^ 0x38;
        g.lllIlllIlIIl[5] = 50 + 37 - -70 + 5 ^ 27 + 106 - 3 + 40;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private static String lIIIllIllIlllII(String lllllllllllllllIIlIlllIIlIllllll, String lllllllllllllllIIlIlllIIlIlllllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIIllIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIIlIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllIIllIIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllIIllIIIIll.init(lllIlllIlIIl[2], lllllllllllllllIIlIlllIIllIIIlII);
            return new String(lllllllllllllllIIlIlllIIllIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllIIllIIIIlI) {
            lllllllllllllllIIlIlllIIllIIIIlI.printStackTrace();
            return null;
        }
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }
}

