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

public final class C
extends Enum<C> {
    public static final /* synthetic */ /* enum */ C STATUE_BLUE_STRICT;
    public static final /* synthetic */ /* enum */ C STATUE_BLUE_I;
    private static /* synthetic */ int[] lllIIlIIIIlI;
    public static final /* synthetic */ /* enum */ C STATUE_BLUE_SHORT;
    public static final /* synthetic */ /* enum */ C STATUE_BLUE_II;
    public static final /* synthetic */ /* enum */ C STATUE_SHORT;
    private static /* synthetic */ String[] lllIIlIIIIIl;
    private static final /* synthetic */ C[] $VALUES;
    public static final /* synthetic */ /* enum */ C STATUE_BLUE_III;
    public static final /* synthetic */ /* enum */ C STATUE_4;
    public static final /* synthetic */ /* enum */ C STATUE_STRICT;
    public static final /* synthetic */ /* enum */ C STATUE_GOLD_SHORT;
    public static final /* synthetic */ /* enum */ C STATUE_GOLD_6;
    public static final /* synthetic */ /* enum */ C STATUE;

    private static String lIIIlIIlllIlIlI(String lllllllllllllllIIllIlIlllIIllIIl, String lllllllllllllllIIllIlIlllIIllIII) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIlllIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlllIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIlllIIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIlllIIllIll.init(lllIIlIIIIlI[2], lllllllllllllllIIllIlIlllIIlllII);
            return new String(lllllllllllllllIIllIlIlllIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIlllIIllIlI) {
            lllllllllllllllIIllIlIlllIIllIlI.printStackTrace();
            return null;
        }
    }

    public static C[] values() {
        return (C[])$VALUES.clone();
    }

    static {
        C.lIIIlIIlllIllIl();
        C.lIIIlIIlllIllII();
        STATUE = new C();
        STATUE_SHORT = new C();
        STATUE_4 = new C();
        STATUE_GOLD_SHORT = new C();
        STATUE_GOLD_6 = new C();
        STATUE_STRICT = new C();
        STATUE_BLUE_STRICT = new C();
        STATUE_BLUE_SHORT = new C();
        STATUE_BLUE_I = new C();
        STATUE_BLUE_II = new C();
        STATUE_BLUE_III = new C();
        C[] cArray = new C[lllIIlIIIIlI[11]];
        cArray[C.lllIIlIIIIlI[0]] = STATUE;
        cArray[C.lllIIlIIIIlI[1]] = STATUE_SHORT;
        cArray[C.lllIIlIIIIlI[2]] = STATUE_4;
        cArray[C.lllIIlIIIIlI[3]] = STATUE_GOLD_SHORT;
        cArray[C.lllIIlIIIIlI[4]] = STATUE_GOLD_6;
        cArray[C.lllIIlIIIIlI[5]] = STATUE_STRICT;
        cArray[C.lllIIlIIIIlI[6]] = STATUE_BLUE_STRICT;
        cArray[C.lllIIlIIIIlI[7]] = STATUE_BLUE_SHORT;
        cArray[C.lllIIlIIIIlI[8]] = STATUE_BLUE_I;
        cArray[C.lllIIlIIIIlI[9]] = STATUE_BLUE_II;
        cArray[C.lllIIlIIIIlI[10]] = STATUE_BLUE_III;
        $VALUES = cArray;
    }

    private static void lIIIlIIlllIllIl() {
        lllIIlIIIIlI = new int[12];
        C.lllIIlIIIIlI[0] = ((0x63 ^ 0x52) & ~(0x21 ^ 0x10) ^ (0xA ^ 0x4A)) & (0xA0 ^ 0x8B ^ (0xD8 ^ 0xB3) ^ -" ".length());
        C.lllIIlIIIIlI[1] = " ".length();
        C.lllIIlIIIIlI[2] = "  ".length();
        C.lllIIlIIIIlI[3] = "   ".length();
        C.lllIIlIIIIlI[4] = 0xE1 ^ 0x94 ^ (0x17 ^ 0x66);
        C.lllIIlIIIIlI[5] = 0xB9 ^ 0xBC;
        C.lllIIlIIIIlI[6] = 0x8F ^ 0x89;
        C.lllIIlIIIIlI[7] = 0xFF ^ 0x98 ^ (0x5E ^ 0x3E);
        C.lllIIlIIIIlI[8] = 0xE3 ^ 0x93 ^ (0xBA ^ 0xC2);
        C.lllIIlIIIIlI[9] = 0x1B ^ 0x12;
        C.lllIIlIIIIlI[10] = 0x15 ^ 0x1F;
        C.lllIIlIIIIlI[11] = 0x5C ^ 0x57;
    }

    private static boolean lIIIlIIlllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIlIIlllIlIIl(String lllllllllllllllIIllIlIllIlllllII, String lllllllllllllllIIllIlIllIlllIllI) {
        lllllllllllllllIIllIlIllIlllllII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIllIlllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIllIllllIlI = new StringBuilder();
        char[] lllllllllllllllIIllIlIllIllllIIl = lllllllllllllllIIllIlIllIlllIllI.toCharArray();
        int lllllllllllllllIIllIlIllIllllIII = lllIIlIIIIlI[0];
        char[] lllllllllllllllIIllIlIllIlllIIlI = lllllllllllllllIIllIlIllIlllllII.toCharArray();
        int lllllllllllllllIIllIlIllIlllIIIl = lllllllllllllllIIllIlIllIlllIIlI.length;
        int lllllllllllllllIIllIlIllIlllIIII = lllIIlIIIIlI[0];
        while (C.lIIIlIIlllIlllI(lllllllllllllllIIllIlIllIlllIIII, lllllllllllllllIIllIlIllIlllIIIl)) {
            char lllllllllllllllIIllIlIllIlllllIl = lllllllllllllllIIllIlIllIlllIIlI[lllllllllllllllIIllIlIllIlllIIII];
            lllllllllllllllIIllIlIllIllllIlI.append((char)(lllllllllllllllIIllIlIllIlllllIl ^ lllllllllllllllIIllIlIllIllllIIl[lllllllllllllllIIllIlIllIllllIII % lllllllllllllllIIllIlIllIllllIIl.length]));
            "".length();
            ++lllllllllllllllIIllIlIllIllllIII;
            ++lllllllllllllllIIllIlIllIlllIIII;
            "".length();
            if ((0xF1 ^ 0xB4 ^ (0x2E ^ 0x6F)) == (0x1F ^ 0x54 ^ (0x67 ^ 0x28))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlIllIllllIlI);
    }

    public static C valueOf(String string) {
        return Enum.valueOf(C.class, string);
    }

    private static void lIIIlIIlllIllII() {
        lllIIlIIIIIl = new String[lllIIlIIIIlI[11]];
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[0]] = C.lIIIlIIlllIlIIl("PBIwBBsq", "oFqPN");
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[1]] = C.lIIIlIIlllIlIlI("p8F/B9fOCYbzTFKERCDSlA==", "zDFRC");
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[2]] = C.lIIIlIIlllIlIlI("kqoTKjD4BkiURdRycKHm9A==", "Qlqnc");
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[3]] = C.lIIIlIIlllIlIlI("h4Gv0eIm0HttyawBvaocQQXx61ue3YDB", "lVrHv");
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[4]] = C.lIIIlIIlllIlIIl("Jwc1ARcxDDMaDjAMQg==", "tStUB");
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[5]] = C.lIIIlIIlllIlIll("Rm0Ex9c1ReGtXyjOYYzcvA==", "CVloD");
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[6]] = C.lIIIlIIlllIlIIl("GhkbMx4MEhgrHgwSCTMZAA4O", "IMZgK");
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[7]] = C.lIIIlIIlllIlIll("UzsAnSlgHl5FWCAKuAEDW9CcXAeQWyIC", "AxeGg");
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[8]] = C.lIIIlIIlllIlIll("86Dwssi9pGC6WEyEPV2y2A==", "dCbCl");
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[9]] = C.lIIIlIIlllIlIll("8S+aHQXgEASFOBg4cGviWw==", "hknvy");
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[10]] = C.lIIIlIIlllIlIlI("wu/f7c79LtROWnCdbGgABg==", "ebaqF");
    }

    private static String lIIIlIIlllIlIll(String lllllllllllllllIIllIlIlllIIIlIlI, String lllllllllllllllIIllIlIlllIIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIlllIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlllIIIlIIl.getBytes(StandardCharsets.UTF_8)), lllIIlIIIIlI[8]), "DES");
            Cipher lllllllllllllllIIllIlIlllIIIlllI = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIlllIIIlllI.init(lllIIlIIIIlI[2], lllllllllllllllIIllIlIlllIIIllll);
            return new String(lllllllllllllllIIllIlIlllIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlllIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIlllIIIllIl) {
            lllllllllllllllIIllIlIlllIIIllIl.printStackTrace();
            return null;
        }
    }
}

