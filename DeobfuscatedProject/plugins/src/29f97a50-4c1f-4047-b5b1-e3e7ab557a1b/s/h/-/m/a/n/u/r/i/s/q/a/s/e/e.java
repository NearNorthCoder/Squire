/*
 * Decompiled with CFR 0.152.
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class e
extends Enum<e> {
    private static /* synthetic */ String[] lIIlIlllIIlIl;
    public static final /* synthetic */ /* enum */ e DARK_CRAB;
    private static /* synthetic */ int[] lIIlIlllIIllI;
    public static final /* synthetic */ /* enum */ e LOBSTER;
    public static final /* synthetic */ /* enum */ e KARAMBWAN;
    public static final /* synthetic */ /* enum */ e SHARK;
    public static final /* synthetic */ /* enum */ e SWORDFISH;
    public static final /* synthetic */ /* enum */ e MONKFISH;
    private final /* synthetic */ int id;
    public static final /* synthetic */ /* enum */ e MANTA_RAY;
    public static final /* synthetic */ /* enum */ e ANGLERFISH;
    private static final /* synthetic */ e[] $VALUES;

    private static String lIlIllIllIlIIIl(String llllllllllllllIllllIlIIIllllIlll, String llllllllllllllIllllIlIIIlllllIII) {
        try {
            SecretKeySpec llllllllllllllIllllIlIIIllllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIIlllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlIIIlllllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlIIIlllllIll.init(lIIlIlllIIllI[4], llllllllllllllIllllIlIIIllllllII);
            return new String(llllllllllllllIllllIlIIIlllllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIIllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlIIIlllllIlI) {
            llllllllllllllIllllIlIIIlllllIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIllIlIIlI(String llllllllllllllIllllIlIIIllIlIlII, String llllllllllllllIllllIlIIIllIlIIIl) {
        try {
            SecretKeySpec llllllllllllllIllllIlIIIllIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIIllIlIIIl.getBytes(StandardCharsets.UTF_8)), lIIlIlllIIllI[16]), "DES");
            Cipher llllllllllllllIllllIlIIIllIlIllI = Cipher.getInstance("DES");
            llllllllllllllIllllIlIIIllIlIllI.init(lIIlIlllIIllI[4], llllllllllllllIllllIlIIIllIlIlll);
            return new String(llllllllllllllIllllIlIIIllIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIIllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlIIIllIlIlIl) {
            llllllllllllllIllllIlIIIllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIllIlIlIl() {
        lIIlIlllIIllI = new int[17];
        e.lIIlIlllIIllI[0] = (0x37 ^ 0x2D) & ~(0x4A ^ 0x50);
        e.lIIlIlllIIllI[1] = -(0xFFFFF6D1 & 0x5BBF) & (0xFFFFDFDC & 0x7EFB);
        e.lIIlIlllIIllI[2] = " ".length();
        e.lIIlIlllIIllI[3] = 0xFFFFFFDE & 0x1F2B;
        e.lIIlIlllIIllI[4] = "  ".length();
        e.lIIlIlllIIllI[5] = -(0xFFFFDFCF & 0x723F) & (0xFFFFD3CF & 0x7FBF);
        e.lIIlIlllIIllI[6] = "   ".length();
        e.lIIlIlllIIllI[7] = 0xFFFF9FF7 & 0x618F;
        e.lIIlIlllIIllI[8] = 0x5D ^ 0x59;
        e.lIIlIlllIIllI[9] = 0xFFFFB3FF & 0x4D7B;
        e.lIIlIlllIIllI[10] = 55 + 39 - -20 + 72 ^ 80 + 116 - 31 + 26;
        e.lIIlIlllIIllI[11] = -(0xFFFFFDCB & 0x6E3D) & (0xFFFFFFFF & 0x6D7D);
        e.lIIlIlllIIllI[12] = 0x20 ^ 0x26;
        e.lIIlIlllIIllI[13] = -(0xFFFF951F & 0x7AFF) & (0xFFFFBEFE & 0x7FBF);
        e.lIIlIlllIIllI[14] = 0x93 ^ 0x94;
        e.lIIlIlllIIllI[15] = -(0xFFFFEBFF & 0x5D3B) & (0xFFFFFDBF & 0x7FFB);
        e.lIIlIlllIIllI[16] = 0x66 ^ 0x6E;
    }

    private e(int n3) {
        this.id = n3;
    }

    private static String lIlIllIllIlIIll(String llllllllllllllIllllIlIIIlllIIlII, String llllllllllllllIllllIlIIIlllIIIll) {
        llllllllllllllIllllIlIIIlllIIlII = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIIIlllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlIIIlllIIlll = new StringBuilder();
        char[] llllllllllllllIllllIlIIIlllIIllI = llllllllllllllIllllIlIIIlllIIIll.toCharArray();
        int llllllllllllllIllllIlIIIlllIIlIl = lIIlIlllIIllI[0];
        char[] llllllllllllllIllllIlIIIllIlllll = llllllllllllllIllllIlIIIlllIIlII.toCharArray();
        int llllllllllllllIllllIlIIIllIllllI = llllllllllllllIllllIlIIIllIlllll.length;
        int llllllllllllllIllllIlIIIllIlllIl = lIIlIlllIIllI[0];
        while (e.lIlIllIllIlIllI(llllllllllllllIllllIlIIIllIlllIl, llllllllllllllIllllIlIIIllIllllI)) {
            char llllllllllllllIllllIlIIIlllIlIlI = llllllllllllllIllllIlIIIllIlllll[llllllllllllllIllllIlIIIllIlllIl];
            llllllllllllllIllllIlIIIlllIIlll.append((char)(llllllllllllllIllllIlIIIlllIlIlI ^ llllllllllllllIllllIlIIIlllIIllI[llllllllllllllIllllIlIIIlllIIlIl % llllllllllllllIllllIlIIIlllIIllI.length]));
            "".length();
            ++llllllllllllllIllllIlIIIlllIIlIl;
            ++llllllllllllllIllllIlIIIllIlllIl;
            "".length();
            if (-" ".length() >= -" ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIlIIIlllIIlll);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static void lIlIllIllIlIlII() {
        lIIlIlllIIlIl = new String[lIIlIlllIIllI[16]];
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[0]] = e.lIlIllIllIlIIIl("qt//BHhjcIdjlzJ8T/z2Bw==", "gzCYs");
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[2]] = e.lIlIllIllIlIIIl("kQi3evctxJqmAmpqJ3fjDA==", "AJHoj");
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[4]] = e.lIlIllIllIlIIlI("j5CElyFPRvE=", "yCVJx");
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[6]] = e.lIlIllIllIlIIll("Ki0KLTE4PgUg", "glDyp");
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[8]] = e.lIlIllIllIlIIlI("5ZxaZhgaXv0=", "VaEMT");
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[10]] = e.lIlIllIllIlIIlI("4nVPSsPAjwBe64h2H6nvlg==", "EZDbQ");
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[12]] = e.lIlIllIllIlIIlI("GdQsOOK+Hp1PV4ODz1DM3g==", "aAKIn");
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[14]] = e.lIlIllIllIlIIlI("1/6AWmKmo2ypKoQdZxkzhA==", "ezgGK");
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public int w() {
        return this.id;
    }

    private static boolean lIlIllIllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        e.lIlIllIllIlIlIl();
        e.lIlIllIllIlIlII();
        KARAMBWAN = new e(lIIlIlllIIllI[1]);
        MONKFISH = new e(lIIlIlllIIllI[3]);
        SHARK = new e(lIIlIlllIIllI[5]);
        MANTA_RAY = new e(lIIlIlllIIllI[7]);
        LOBSTER = new e(lIIlIlllIIllI[9]);
        SWORDFISH = new e(lIIlIlllIIllI[11]);
        DARK_CRAB = new e(lIIlIlllIIllI[13]);
        ANGLERFISH = new e(lIIlIlllIIllI[15]);
        e[] eArray = new e[lIIlIlllIIllI[16]];
        eArray[e.lIIlIlllIIllI[0]] = KARAMBWAN;
        eArray[e.lIIlIlllIIllI[2]] = MONKFISH;
        eArray[e.lIIlIlllIIllI[4]] = SHARK;
        eArray[e.lIIlIlllIIllI[6]] = MANTA_RAY;
        eArray[e.lIIlIlllIIllI[8]] = LOBSTER;
        eArray[e.lIIlIlllIIllI[10]] = SWORDFISH;
        eArray[e.lIIlIlllIIllI[12]] = DARK_CRAB;
        eArray[e.lIIlIlllIIllI[14]] = ANGLERFISH;
        $VALUES = eArray;
    }
}

