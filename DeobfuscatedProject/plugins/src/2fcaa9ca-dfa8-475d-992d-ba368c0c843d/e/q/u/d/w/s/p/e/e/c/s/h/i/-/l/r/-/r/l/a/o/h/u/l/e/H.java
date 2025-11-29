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

public final class H
extends Enum<H> {
    private static /* synthetic */ String[] lllIIIIIlIIl;
    private static final /* synthetic */ H[] $VALUES;
    public static final /* synthetic */ /* enum */ H BLADE_STRANGE_TILES;
    private static /* synthetic */ int[] lllIIIIIlIlI;
    public static final /* synthetic */ /* enum */ H STRANGE_TILES;
    public static final /* synthetic */ /* enum */ H DART_STRANGE_TILES;

    static {
        H.lIIIlIIIIIllIll();
        H.lIIIlIIIIIllIlI();
        STRANGE_TILES = new H();
        DART_STRANGE_TILES = new H();
        BLADE_STRANGE_TILES = new H();
        H[] hArray = new H[lllIIIIIlIlI[3]];
        hArray[H.lllIIIIIlIlI[0]] = STRANGE_TILES;
        hArray[H.lllIIIIIlIlI[1]] = DART_STRANGE_TILES;
        hArray[H.lllIIIIIlIlI[2]] = BLADE_STRANGE_TILES;
        $VALUES = hArray;
    }

    public static H[] values() {
        return (H[])$VALUES.clone();
    }

    private static String lIIIlIIIIIllIII(String lllllllllllllllIIlllIIllIIIlIIlI, String lllllllllllllllIIlllIIllIIIlIIIl) {
        lllllllllllllllIIlllIIllIIIlIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIllIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlllIIllIIIlIIII = new StringBuilder();
        char[] lllllllllllllllIIlllIIllIIIIllll = lllllllllllllllIIlllIIllIIIlIIIl.toCharArray();
        int lllllllllllllllIIlllIIllIIIIlllI = lllIIIIIlIlI[0];
        char[] lllllllllllllllIIlllIIllIIIIlIII = lllllllllllllllIIlllIIllIIIlIIlI.toCharArray();
        int lllllllllllllllIIlllIIllIIIIIlll = lllllllllllllllIIlllIIllIIIIlIII.length;
        int lllllllllllllllIIlllIIllIIIIIllI = lllIIIIIlIlI[0];
        while (H.lIIIlIIIIIlllII(lllllllllllllllIIlllIIllIIIIIllI, lllllllllllllllIIlllIIllIIIIIlll)) {
            char lllllllllllllllIIlllIIllIIIlIIll = lllllllllllllllIIlllIIllIIIIlIII[lllllllllllllllIIlllIIllIIIIIllI];
            lllllllllllllllIIlllIIllIIIlIIII.append((char)(lllllllllllllllIIlllIIllIIIlIIll ^ lllllllllllllllIIlllIIllIIIIllll[lllllllllllllllIIlllIIllIIIIlllI % lllllllllllllllIIlllIIllIIIIllll.length]));
            "".length();
            ++lllllllllllllllIIlllIIllIIIIlllI;
            ++lllllllllllllllIIlllIIllIIIIIllI;
            "".length();
            if ((0x83 ^ 0x87) >= (0x15 ^ 0x11)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlllIIllIIIlIIII);
    }

    public static H valueOf(String string) {
        return Enum.valueOf(H.class, string);
    }

    private static void lIIIlIIIIIllIlI() {
        lllIIIIIlIIl = new String[lllIIIIIlIlI[3]];
        H.lllIIIIIlIIl[H.lllIIIIIlIlI[0]] = H.lIIIlIIIIIllIII("FBshFRYACiwAEQsKIA==", "GOsTX");
        H.lllIIIIIlIIl[H.lllIIIIIlIlI[1]] = H.lIIIlIIIIIllIIl("NNhdfEqxK2hQih7vJUzFfzclJvqZ92Yc", "CyfYU");
        H.lllIIIIIlIIl[H.lllIIIIIlIlI[2]] = H.lIIIlIIIIIllIIl("jQmIXVBcZFHsc5bQNM2RbD5PsRacjwm2", "rjSKP");
    }

    private static String lIIIlIIIIIllIIl(String lllllllllllllllIIlllIIlIlllllIll, String lllllllllllllllIIlllIIlIllllllII) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIllIIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlIllllllII.getBytes(StandardCharsets.UTF_8)), lllIIIIIlIlI[4]), "DES");
            Cipher lllllllllllllllIIlllIIlIllllllll = Cipher.getInstance("DES");
            lllllllllllllllIIlllIIlIllllllll.init(lllIIIIIlIlI[2], lllllllllllllllIIlllIIllIIIIIIII);
            return new String(lllllllllllllllIIlllIIlIllllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlllIIlIlllllllI) {
            lllllllllllllllIIlllIIlIlllllllI.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIIIIllIll() {
        lllIIIIIlIlI = new int[5];
        H.lllIIIIIlIlI[0] = (0x7D ^ 0x55) & ~(0xB1 ^ 0x99);
        H.lllIIIIIlIlI[1] = " ".length();
        H.lllIIIIIlIlI[2] = "  ".length();
        H.lllIIIIIlIlI[3] = "   ".length();
        H.lllIIIIIlIlI[4] = 0xD ^ 0x5C ^ (0x98 ^ 0xC1);
    }

    private static boolean lIIIlIIIIIlllII(int n2, int n3) {
        return n2 < n3;
    }
}

