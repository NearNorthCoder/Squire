/*
 * Decompiled with CFR 0.152.
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class g
extends Enum<g> {
    private static final /* synthetic */ g[] $VALUES;
    public static final /* synthetic */ /* enum */ g BLADE;
    public static final /* synthetic */ /* enum */ g GOLDEN_BLADE_II;
    public static final /* synthetic */ /* enum */ g GOLDEN_BLADE_V;
    public static final /* synthetic */ /* enum */ g BLADE_I;
    public static final /* synthetic */ /* enum */ g BLADE_III;
    public static final /* synthetic */ /* enum */ g BLADE_II;
    public static final /* synthetic */ /* enum */ g BLUE_BLADE_II;
    public static final /* synthetic */ /* enum */ g BLADE_IV;
    public static final /* synthetic */ /* enum */ g GOLDEN_BLADE_III;
    public static final /* synthetic */ /* enum */ g GOLDEN_BLADE_IV;
    public static final /* synthetic */ /* enum */ g GOLDEN_BLADE_VI;
    private static /* synthetic */ int[] lllIIIIIlIII;
    public static final /* synthetic */ /* enum */ g BLUE_BLADE_I;
    private static /* synthetic */ String[] lllIIIIIIlll;
    public static final /* synthetic */ /* enum */ g GOLDEN_BLADE_I;

    static {
        g.lIIIlIIIIIlIllI();
        g.lIIIlIIIIIlIlIl();
        BLADE = new g();
        BLADE_I = new g();
        BLADE_II = new g();
        BLADE_III = new g();
        BLADE_IV = new g();
        GOLDEN_BLADE_II = new g();
        GOLDEN_BLADE_I = new g();
        GOLDEN_BLADE_III = new g();
        GOLDEN_BLADE_IV = new g();
        GOLDEN_BLADE_V = new g();
        GOLDEN_BLADE_VI = new g();
        BLUE_BLADE_I = new g();
        BLUE_BLADE_II = new g();
        g[] gArray = new g[lllIIIIIlIII[13]];
        gArray[g.lllIIIIIlIII[0]] = BLADE;
        gArray[g.lllIIIIIlIII[1]] = BLADE_I;
        gArray[g.lllIIIIIlIII[2]] = BLADE_II;
        gArray[g.lllIIIIIlIII[3]] = BLADE_III;
        gArray[g.lllIIIIIlIII[4]] = BLADE_IV;
        gArray[g.lllIIIIIlIII[5]] = GOLDEN_BLADE_II;
        gArray[g.lllIIIIIlIII[6]] = GOLDEN_BLADE_I;
        gArray[g.lllIIIIIlIII[7]] = GOLDEN_BLADE_III;
        gArray[g.lllIIIIIlIII[8]] = GOLDEN_BLADE_IV;
        gArray[g.lllIIIIIlIII[9]] = GOLDEN_BLADE_V;
        gArray[g.lllIIIIIlIII[10]] = GOLDEN_BLADE_VI;
        gArray[g.lllIIIIIlIII[11]] = BLUE_BLADE_I;
        gArray[g.lllIIIIIlIII[12]] = BLUE_BLADE_II;
        $VALUES = gArray;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    private static String lIIIlIIIIIlIIll(String lllllllllllllllIIlllIIllIIlIIlII, String lllllllllllllllIIlllIIllIIlIIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIllIIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIllIIlIIIll.getBytes(StandardCharsets.UTF_8)), lllIIIIIlIII[8]), "DES");
            Cipher lllllllllllllllIIlllIIllIIlIlIII = Cipher.getInstance("DES");
            lllllllllllllllIIlllIIllIIlIlIII.init(lllIIIIIlIII[2], lllllllllllllllIIlllIIllIIlIlIIl);
            return new String(lllllllllllllllIIlllIIllIIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIllIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlllIIllIIlIIlll) {
            lllllllllllllllIIlllIIllIIlIIlll.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIIIIlIllI() {
        lllIIIIIlIII = new int[14];
        g.lllIIIIIlIII[0] = (0xAB ^ 0xB2 ^ (0x8A ^ 0xA1)) & (96 + 98 - 109 + 43 ^ 133 + 140 - 209 + 114 ^ -" ".length());
        g.lllIIIIIlIII[1] = " ".length();
        g.lllIIIIIlIII[2] = "  ".length();
        g.lllIIIIIlIII[3] = "   ".length();
        g.lllIIIIIlIII[4] = 0x5D ^ 0x59;
        g.lllIIIIIlIII[5] = 0xB6 ^ 0xB3;
        g.lllIIIIIlIII[6] = 0x74 ^ 0x12 ^ (0x2D ^ 0x4D);
        g.lllIIIIIlIII[7] = 0x53 ^ 0x54;
        g.lllIIIIIlIII[8] = 0x12 ^ 0x1A;
        g.lllIIIIIlIII[9] = 0x51 ^ 0x1A ^ (0x41 ^ 3);
        g.lllIIIIIlIII[10] = 43 + 72 - 14 + 38 ^ 107 + 3 - 61 + 80;
        g.lllIIIIIlIII[11] = 0x64 ^ 0x75 ^ (0x72 ^ 0x68);
        g.lllIIIIIlIII[12] = 0x92 ^ 0x9E;
        g.lllIIIIIlIII[13] = 0x5D ^ 3 ^ (0x6E ^ 0x3D);
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private static boolean lIIIlIIIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIlIIIIIlIlII(String lllllllllllllllIIlllIIllIIllIIIl, String lllllllllllllllIIlllIIllIIllIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIllIIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIllIIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlllIIllIIllIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlllIIllIIllIlIl.init(lllIIIIIlIII[2], lllllllllllllllIIlllIIllIIllIllI);
            return new String(lllllllllllllllIIlllIIllIIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIllIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlllIIllIIllIlII) {
            lllllllllllllllIIlllIIllIIllIlII.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIIIIlIIlI(String lllllllllllllllIIlllIIllIlIIlIII, String lllllllllllllllIIlllIIllIlIIIlll) {
        lllllllllllllllIIlllIIllIlIIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIllIlIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlllIIllIlIIIllI = new StringBuilder();
        char[] lllllllllllllllIIlllIIllIlIIIlIl = lllllllllllllllIIlllIIllIlIIIlll.toCharArray();
        int lllllllllllllllIIlllIIllIlIIIlII = lllIIIIIlIII[0];
        char[] lllllllllllllllIIlllIIllIIlllllI = lllllllllllllllIIlllIIllIlIIlIII.toCharArray();
        int lllllllllllllllIIlllIIllIIllllIl = lllllllllllllllIIlllIIllIIlllllI.length;
        int lllllllllllllllIIlllIIllIIllllII = lllIIIIIlIII[0];
        while (g.lIIIlIIIIIlIlll(lllllllllllllllIIlllIIllIIllllII, lllllllllllllllIIlllIIllIIllllIl)) {
            char lllllllllllllllIIlllIIllIlIIlIIl = lllllllllllllllIIlllIIllIIlllllI[lllllllllllllllIIlllIIllIIllllII];
            lllllllllllllllIIlllIIllIlIIIllI.append((char)(lllllllllllllllIIlllIIllIlIIlIIl ^ lllllllllllllllIIlllIIllIlIIIlIl[lllllllllllllllIIlllIIllIlIIIlII % lllllllllllllllIIlllIIllIlIIIlIl.length]));
            "".length();
            ++lllllllllllllllIIlllIIllIlIIIlII;
            ++lllllllllllllllIIlllIIllIIllllII;
            "".length();
            if ("   ".length() > -" ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlllIIllIlIIIllI);
    }

    private static void lIIIlIIIIIlIlIl() {
        lllIIIIIIlll = new String[lllIIIIIlIII[13]];
        g.lllIIIIIIlll[g.lllIIIIIlIII[0]] = g.lIIIlIIIIIlIIlI("FgobKRc=", "TFZmR");
        g.lllIIIIIIlll[g.lllIIIIIlIII[1]] = g.lIIIlIIIIIlIIll("pBjarpFkt0U=", "mCLSU");
        g.lllIIIIIIlll[g.lllIIIIIlIII[2]] = g.lIIIlIIIIIlIIll("Ayekisq87zxE8OrxgLrVqw==", "myooJ");
        g.lllIIIIIIlll[g.lllIIIIIlIII[3]] = g.lIIIlIIIIIlIIlI("FyUYBi8KIBAL", "UiYBj");
        g.lllIIIIIIlll[g.lllIIIIIlIII[4]] = g.lIIIlIIIIIlIIlI("LwkAEzwyDBc=", "mEAWy");
        g.lllIIIIIIlll[g.lllIIIIIlIII[5]] = g.lIIIlIIIIIlIlII("B2T8Mjy3UEk3A0eI02baQQ==", "qQXow");
        g.lllIIIIIIlll[g.lllIIIIIlIII[6]] = g.lIIIlIIIIIlIlII("PR+rtJZ5XWn7bah/mXMhsQ==", "TNkDI");
        g.lllIIIIIIlll[g.lllIIIIIlIII[7]] = g.lIIIlIIIIIlIlII("BUZtE+v0hj9TfmXfi9WCEfc1R2FKauQi", "MOagt");
        g.lllIIIIIIlll[g.lllIIIIIlIII[8]] = g.lIIIlIIIIIlIlII("eO0g0d35NCuV30VurFlmoA==", "CRLfl");
        g.lllIIIIIIlll[g.lllIIIIIlIII[9]] = g.lIIIlIIIIIlIIlI("KBc/DjIhBzEGNisdLBw=", "oXsJw");
        g.lllIIIIIIlll[g.lllIIIIIlIII[10]] = g.lIIIlIIIIIlIIll("xWWaBIrC8LQ2gwTeue+YXA==", "YmBEN");
        g.lllIIIIIIlll[g.lllIIIIIlIII[11]] = g.lIIIlIIIIIlIIll("L+0zSrQ9WJVOcJzcE1VzAw==", "xmqOa");
        g.lllIIIIIIlll[g.lllIIIIIlIII[12]] = g.lIIIlIIIIIlIIlI("KiABAg8qIBUDFTclHQ==", "hlTGP");
    }
}

