/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class G
extends Enum<G> {
    private static final /* synthetic */ G[] $VALUES;
    public static final /* synthetic */ /* enum */ G JUTE;
    public static final /* synthetic */ /* enum */ G HAMMERSTONE;
    public static final /* synthetic */ /* enum */ G ASGARNIAN;
    public static final /* synthetic */ /* enum */ G YANILLIAN;
    public static final /* synthetic */ /* enum */ G KRANDORIAN;
    private static /* synthetic */ String[] lIllllIIllll;
    private static /* synthetic */ int[] lIllllIlIIII;
    public static final /* synthetic */ /* enum */ G BARLEY;
    private final /* synthetic */ int seed;
    public static final /* synthetic */ /* enum */ G WILDBLOOD;

    private static String lllIlllIIllIlI(String lllllllllllllllIlIllIIlIIllllIlI, String lllllllllllllllIlIllIIlIIlllIlII) {
        lllllllllllllllIlIllIIlIIllllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIIllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIIlIIllllIII = new StringBuilder();
        char[] lllllllllllllllIlIllIIlIIlllIlll = lllllllllllllllIlIllIIlIIlllIlII.toCharArray();
        int lllllllllllllllIlIllIIlIIlllIllI = lIllllIlIIII[0];
        char[] lllllllllllllllIlIllIIlIIlllIIII = lllllllllllllllIlIllIIlIIllllIlI.toCharArray();
        int lllllllllllllllIlIllIIlIIllIllll = lllllllllllllllIlIllIIlIIlllIIII.length;
        int lllllllllllllllIlIllIIlIIllIlllI = lIllllIlIIII[0];
        while (G.lllIlllIIllllI(lllllllllllllllIlIllIIlIIllIlllI, lllllllllllllllIlIllIIlIIllIllll)) {
            char lllllllllllllllIlIllIIlIIllllIll = lllllllllllllllIlIllIIlIIlllIIII[lllllllllllllllIlIllIIlIIllIlllI];
            lllllllllllllllIlIllIIlIIllllIII.append((char)(lllllllllllllllIlIllIIlIIllllIll ^ lllllllllllllllIlIllIIlIIlllIlll[lllllllllllllllIlIllIIlIIlllIllI % lllllllllllllllIlIllIIlIIlllIlll.length]));
            "".length();
            ++lllllllllllllllIlIllIIlIIlllIllI;
            ++lllllllllllllllIlIllIIlIIllIlllI;
            "".length();
            if ((0x52 ^ 0x56) >= (0x67 ^ 0x63)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIllIIlIIllllIII);
    }

    private static void lllIlllIIlllII() {
        lIllllIIllll = new String[lIllllIlIIII[14]];
        G.lIllllIIllll[G.lIllllIlIIII[0]] = G.lllIlllIIllIIl("iYnGHgzJXoo=", "eJOXo");
        G.lIllllIIllll[G.lIllllIlIIII[2]] = G.lllIlllIIllIlI("CgM6ARIQESMDGQc=", "BBwLW");
        G.lIllllIIllll[G.lIllllIlIIII[4]] = G.lllIlllIIllIIl("ASk41zknFklPKnj1vatPnA==", "UGsId");
        G.lIllllIIllll[G.lIllllIlIIII[6]] = G.lllIlllIIllIIl("8K/ESCsxpFI=", "XwGAa");
        G.lIllllIIllll[G.lIllllIlIIII[8]] = G.lllIlllIIllIlI("EyQ/LRYGLDAq", "JeqdZ");
        G.lIllllIIllll[G.lIllllIlIIII[10]] = G.lllIlllIIllIll("sgG7kS55yst5BVabMxPfnA==", "aGcCC");
        G.lIllllIIllll[G.lIllllIlIIII[12]] = G.lllIlllIIllIIl("Ghcf1/E0GPq/YB0HMxyUuQ==", "IjGbL");
    }

    private static String lllIlllIIllIll(String lllllllllllllllIlIllIIlIIlIllIII, String lllllllllllllllIlIllIIlIIlIlIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIlIIlIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIlIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIIlIIlIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIIlIIlIllIlI.init(lIllllIlIIII[4], lllllllllllllllIlIllIIlIIlIllIll);
            return new String(lllllllllllllllIlIllIIlIIlIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIIlIIlIllIIl) {
            lllllllllllllllIlIllIIlIIlIllIIl.printStackTrace();
            return null;
        }
    }

    private G(int n3) {
        this.seed = n3;
    }

    public static G[] values() {
        return (G[])$VALUES.clone();
    }

    public int aA() {
        return this.seed;
    }

    private static void lllIlllIIlllIl() {
        lIllllIlIIII = new int[16];
        G.lIllllIlIIII[0] = (0x7C ^ 0x22) & ~(0xD3 ^ 0x8D);
        G.lIllllIlIIII[1] = -(0xFFFFDFE7 & 0x6A1B) & (0xFFFFFFFB & 0x5EBF);
        G.lIllllIlIIII[2] = " ".length();
        G.lIllllIlIIII[3] = -(0xFFFFEB27 & 0x7FDD) & (0xFFFFFFFF & 0x7FBF);
        G.lIllllIlIIII[4] = "  ".length();
        G.lIllllIlIIII[5] = 0xFFFF9CFD & 0x77BE;
        G.lIllllIlIIII[6] = "   ".length();
        G.lIllllIlIIII[7] = -(0xFFFFBBE2 & 0x6F5F) & (0xFFFFFFFB & 0x3FFF);
        G.lIllllIlIIII[8] = 0x48 ^ 0x4C;
        G.lIllllIlIIII[9] = 0xFFFFB7FF & 0x5CBD;
        G.lIllllIlIIII[10] = 0x39 ^ 0x74 ^ (0x5A ^ 0x12);
        G.lIllllIlIIII[11] = 0xFFFF94FE & 0x7FBF;
        G.lIllllIlIIII[12] = 118 + 92 - 97 + 74 ^ 24 + 12 - 28 + 181;
        G.lIllllIlIIII[13] = -" ".length() & (0xFFFFBDFF & 0x56BF);
        G.lIllllIlIIII[14] = 0 + 81 - -22 + 33 ^ 31 + 54 - 49 + 107;
        G.lIllllIlIIII[15] = 0x60 ^ 0x68;
    }

    static {
        G.lllIlllIIlllIl();
        G.lllIlllIIlllII();
        BARLEY = new G(lIllllIlIIII[1]);
        HAMMERSTONE = new G(lIllllIlIIII[3]);
        ASGARNIAN = new G(lIllllIlIIII[5]);
        JUTE = new G(lIllllIlIIII[7]);
        YANILLIAN = new G(lIllllIlIIII[9]);
        KRANDORIAN = new G(lIllllIlIIII[11]);
        WILDBLOOD = new G(lIllllIlIIII[13]);
        G[] gArray = new G[lIllllIlIIII[14]];
        gArray[G.lIllllIlIIII[0]] = BARLEY;
        gArray[G.lIllllIlIIII[2]] = HAMMERSTONE;
        gArray[G.lIllllIlIIII[4]] = ASGARNIAN;
        gArray[G.lIllllIlIIII[6]] = JUTE;
        gArray[G.lIllllIlIIII[8]] = YANILLIAN;
        gArray[G.lIllllIlIIII[10]] = KRANDORIAN;
        gArray[G.lIllllIlIIII[12]] = WILDBLOOD;
        $VALUES = gArray;
    }

    private static boolean lllIlllIIllllI(int n2, int n3) {
        return n2 < n3;
    }

    public static G valueOf(String string) {
        return Enum.valueOf(G.class, string);
    }

    private static String lllIlllIIllIIl(String lllllllllllllllIlIllIIlIIllIIIll, String lllllllllllllllIlIllIIlIIllIIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIlIIllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIlIIllIIlII.getBytes(StandardCharsets.UTF_8)), lIllllIlIIII[15]), "DES");
            Cipher lllllllllllllllIlIllIIlIIllIIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIllIIlIIllIIlll.init(lIllllIlIIII[4], lllllllllllllllIlIllIIlIIllIlIII);
            return new String(lllllllllllllllIlIllIIlIIllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIIlIIllIIllI) {
            lllllllllllllllIlIllIIlIIllIIllI.printStackTrace();
            return null;
        }
    }
}

