/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.I;
import -.m.e.a.u.s.r.r.q.i.r.e.f.K;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class H
extends Enum<H> {
    public static final /* synthetic */ /* enum */ H LUNAR_SPELL;
    private static /* synthetic */ String[] lIllllllIlII;
    private static final /* synthetic */ H[] $VALUES;
    private static /* synthetic */ int[] lIllllllIllI;
    private final /* synthetic */ int id;
    private final /* synthetic */ K equipment;
    public static final /* synthetic */ /* enum */ H SUPERCOMPOST;
    public static final /* synthetic */ /* enum */ H COMPOST;
    public static final /* synthetic */ /* enum */ H ULTRACOMPOST;

    static {
        H.llllIIIIIllIII();
        H.llllIIIIIIlllI();
        COMPOST = new H(lIllllllIllI[1], K.COMPOST);
        SUPERCOMPOST = new H(lIllllllIllI[3], K.SUPER_COMPOST);
        ULTRACOMPOST = new H(lIllllllIllI[5], K.ULTRA_COMPOST);
        LUNAR_SPELL = new H(lIllllllIllI[7], null);
        H[] hArray = new H[lIllllllIllI[8]];
        hArray[H.lIllllllIllI[0]] = COMPOST;
        hArray[H.lIllllllIllI[2]] = SUPERCOMPOST;
        hArray[H.lIllllllIllI[4]] = ULTRACOMPOST;
        hArray[H.lIllllllIllI[6]] = LUNAR_SPELL;
        $VALUES = hArray;
    }

    private static void llllIIIIIIlllI() {
        lIllllllIlII = new String[lIllllllIllI[8]];
        H.lIllllllIlII[H.lIllllllIllI[0]] = H.llllIIIIIIlIll("hiC8hLJ1U6A=", "FgyOO");
        H.lIllllllIlII[H.lIllllllIllI[2]] = H.llllIIIIIIllII("84IpbEYfJHXRhElV5kSa1Q==", "drSCA");
        H.lIllllllIlII[H.lIllllllIllI[4]] = H.llllIIIIIIlIll("BqoMCoFynlRay6z7IRQgKA==", "FbcZL");
        H.lIllllllIlII[H.lIllllllIllI[6]] = H.llllIIIIIIllIl("JwEgMxM0Bz43DSc=", "kTnrA");
    }

    public static H[] values() {
        return (H[])$VALUES.clone();
    }

    public static H valueOf(String string) {
        return Enum.valueOf(H.class, string);
    }

    private static String llllIIIIIIllIl(String lllllllllllllllIlIlIlllIllllIIIl, String lllllllllllllllIlIlIlllIllllIIII) {
        lllllllllllllllIlIlIlllIllllIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIllllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIlllIllllIlII = new StringBuilder();
        char[] lllllllllllllllIlIlIlllIllllIIll = lllllllllllllllIlIlIlllIllllIIII.toCharArray();
        int lllllllllllllllIlIlIlllIllllIIlI = lIllllllIllI[0];
        char[] lllllllllllllllIlIlIlllIlllIllII = lllllllllllllllIlIlIlllIllllIIIl.toCharArray();
        int lllllllllllllllIlIlIlllIlllIlIll = lllllllllllllllIlIlIlllIlllIllII.length;
        int lllllllllllllllIlIlIlllIlllIlIlI = lIllllllIllI[0];
        while (H.llllIIIIIllIIl(lllllllllllllllIlIlIlllIlllIlIlI, lllllllllllllllIlIlIlllIlllIlIll)) {
            char lllllllllllllllIlIlIlllIllllIlll = lllllllllllllllIlIlIlllIlllIllII[lllllllllllllllIlIlIlllIlllIlIlI];
            lllllllllllllllIlIlIlllIllllIlII.append((char)(lllllllllllllllIlIlIlllIllllIlll ^ lllllllllllllllIlIlIlllIllllIIll[lllllllllllllllIlIlIlllIllllIIlI % lllllllllllllllIlIlIlllIllllIIll.length]));
            "".length();
            ++lllllllllllllllIlIlIlllIllllIIlI;
            ++lllllllllllllllIlIlIlllIlllIlIlI;
            "".length();
            if ("  ".length() > -" ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIlllIllllIlII);
    }

    private static boolean llllIIIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static H c(au au2) {
        switch (I.bm[au2.ordinal()]) {
            case 1: 
            case 2: {
                return ULTRACOMPOST;
            }
            case 3: 
            case 4: {
                return SUPERCOMPOST;
            }
            case 5: 
            case 6: {
                return COMPOST;
            }
        }
        return null;
    }

    public int aB() {
        return this.id;
    }

    public K aC() {
        return this.equipment;
    }

    private static String llllIIIIIIllII(String lllllllllllllllIlIlIlllIlllIIIIl, String lllllllllllllllIlIlIlllIllIllllI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlllIlllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlllIllIllllI.getBytes(StandardCharsets.UTF_8)), lIllllllIllI[9]), "DES");
            Cipher lllllllllllllllIlIlIlllIlllIIIll = Cipher.getInstance("DES");
            lllllllllllllllIlIlIlllIlllIIIll.init(lIllllllIllI[4], lllllllllllllllIlIlIlllIlllIIlII);
            return new String(lllllllllllllllIlIlIlllIlllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIlllIlllIIIlI) {
            lllllllllllllllIlIlIlllIlllIIIlI.printStackTrace();
            return null;
        }
    }

    private static void llllIIIIIllIII() {
        lIllllllIllI = new int[10];
        H.lIllllllIllI[0] = (0x29 ^ 0x62) & ~(0x41 ^ 0xA);
        H.lIllllllIllI[1] = 0xFFFF97BA & 0x7FD5;
        H.lIllllllIllI[2] = " ".length();
        H.lIllllllIllI[3] = -(0xFFFFEDEE & 0x7A77) & (0xFFFFFFFF & 0x7FF7);
        H.lIllllllIllI[4] = "  ".length();
        H.lIllllllIllI[5] = 0xFFFFD7FB & 0x7BEF;
        H.lIllllllIllI[6] = "   ".length();
        H.lIllllllIllI[7] = -" ".length();
        H.lIllllllIllI[8] = 0x55 ^ 0x51;
        H.lIllllllIllI[9] = 0x36 ^ 0x3E;
    }

    private H(int n3, K k2) {
        this.id = n3;
        this.equipment = k2;
    }

    private static String llllIIIIIIlIll(String lllllllllllllllIlIlIlllIllIlIlII, String lllllllllllllllIlIlIlllIllIlIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlllIllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlllIllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIlllIllIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIlllIllIlIllI.init(lIllllllIllI[4], lllllllllllllllIlIlIlllIllIlIlll);
            return new String(lllllllllllllllIlIlIlllIllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIlllIllIlIlIl) {
            lllllllllllllllIlIlIlllIllIlIlIl.printStackTrace();
            return null;
        }
    }
}

