/*
 * Decompiled with CFR 0.152.
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class j
extends Enum<j> {
    public static final /* synthetic */ /* enum */ j BRONZE;
    public static final /* synthetic */ /* enum */ j IRON;
    public static final /* synthetic */ /* enum */ j DRAGON;
    public static final /* synthetic */ /* enum */ j AMETHYST;
    private final /* synthetic */ int dartTipId;
    public static final /* synthetic */ /* enum */ j ADAMANT;
    private static final /* synthetic */ j[] $VALUES;
    public static final /* synthetic */ /* enum */ j STEEL;
    private static /* synthetic */ int[] lllIlIIlIIl;
    public static final /* synthetic */ /* enum */ j RUNE;
    private static /* synthetic */ String[] lllIlIIlIII;
    public static final /* synthetic */ /* enum */ j MITHRIL;

    private static void lIlIllllIlIllI() {
        lllIlIIlIIl = new int[17];
        j.lllIlIIlIIl[0] = (0x20 ^ 0x3E) & ~(0x8B ^ 0x95);
        j.lllIlIIlIIl[1] = -(106 + 9 - 91 + 109) & (0xFFFFFFFF & 0x3B7);
        j.lllIlIIlIIl[2] = " ".length();
        j.lllIlIIlIIl[3] = 0xFFFFA375 & 0x5FBE;
        j.lllIlIIlIIl[4] = "  ".length();
        j.lllIlIIlIIl[5] = 0xFFFFCB7F & 0x37B5;
        j.lllIlIIlIIl[6] = "   ".length();
        j.lllIlIIlIIl[7] = 0xFFFFCF7E & 0x33B7;
        j.lllIlIIlIIl[8] = 0x8C ^ 0x88;
        j.lllIlIIlIIl[9] = 0xFFFFCFBF & 0x3377;
        j.lllIlIIlIIl[10] = 0 ^ 0x70 ^ (0x12 ^ 0x67);
        j.lllIlIIlIIl[11] = -(0xFFFFF7F9 & 0x1CC7) & (0xFFFFBFFE & 0x57F9);
        j.lllIlIIlIIl[12] = 18 + 111 - 106 + 135 ^ 57 + 0 - -72 + 23;
        j.lllIlIIlIIl[13] = 0xFFFFFFFD & 0x64FF;
        j.lllIlIIlIIl[14] = 0x77 ^ 0x70;
        j.lllIlIIlIIl[15] = 0xFFFFAFF5 & 0x7BEA;
        j.lllIlIIlIIl[16] = 0xDF ^ 0xA9 ^ (0x63 ^ 0x1D);
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    private static void lIlIllllIlIlIl() {
        lllIlIIlIII = new String[lllIlIIlIIl[16]];
        j.lllIlIIlIII[j.lllIlIIlIIl[0]] = j.lIlIllllIlIIlI("r6J1SPycffI=", "XAmJU");
        j.lllIlIIlIII[j.lllIlIIlIIl[2]] = j.lIlIllllIlIIll("cIvE/icNVX0=", "KOiXU");
        j.lllIlIIlIII[j.lllIlIIlIIl[4]] = j.lIlIllllIlIIll("zhrQvlVc6X0=", "cFfuc");
        j.lllIlIIlIII[j.lllIlIIlIIl[6]] = j.lIlIllllIlIlII("KCMxKj4sJg==", "ejebl");
        j.lllIlIIlIII[j.lllIlIIlIIl[8]] = j.lIlIllllIlIIlI("iPmDYRzP4RU=", "yiLzp");
        j.lllIlIIlIII[j.lllIlIIlIIl[10]] = j.lIlIllllIlIIlI("WxGJw0E7wkg=", "KoFMb");
        j.lllIlIIlIII[j.lllIlIIlIIl[12]] = j.lIlIllllIlIlII("DAwRNhEUEgA=", "MATbY");
        j.lllIlIIlIII[j.lllIlIIlIIl[14]] = j.lIlIllllIlIIll("OGTyrp6zFKY=", "ZJBbH");
    }

    public int D() {
        return this.dartTipId;
    }

    private static boolean lIlIllllIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIllllIlIlII(String llllllllllllllllIIlIIllIIIIlIIlI, String llllllllllllllllIIlIIllIIIIlIllI) {
        llllllllllllllllIIlIIllIIIIlIIlI = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIllIIIIlIlIl = new StringBuilder();
        char[] llllllllllllllllIIlIIllIIIIlIlII = llllllllllllllllIIlIIllIIIIlIllI.toCharArray();
        int llllllllllllllllIIlIIllIIIIlIIll = lllIlIIlIIl[0];
        char[] llllllllllllllllIIlIIllIIIIIllIl = llllllllllllllllIIlIIllIIIIlIIlI.toCharArray();
        int llllllllllllllllIIlIIllIIIIIllII = llllllllllllllllIIlIIllIIIIIllIl.length;
        int llllllllllllllllIIlIIllIIIIIlIll = lllIlIIlIIl[0];
        while (j.lIlIllllIlIlll(llllllllllllllllIIlIIllIIIIIlIll, llllllllllllllllIIlIIllIIIIIllII)) {
            char llllllllllllllllIIlIIllIIIIllIII = llllllllllllllllIIlIIllIIIIIllIl[llllllllllllllllIIlIIllIIIIIlIll];
            llllllllllllllllIIlIIllIIIIlIlIl.append((char)(llllllllllllllllIIlIIllIIIIllIII ^ llllllllllllllllIIlIIllIIIIlIlII[llllllllllllllllIIlIIllIIIIlIIll % llllllllllllllllIIlIIllIIIIlIlII.length]));
            "".length();
            ++llllllllllllllllIIlIIllIIIIlIIll;
            ++llllllllllllllllIIlIIllIIIIIlIll;
            "".length();
            if (((0xBF ^ 0xB5) & ~(0x39 ^ 0x33)) < " ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIIllIIIIlIlIl);
    }

    static {
        j.lIlIllllIlIllI();
        j.lIlIllllIlIlIl();
        BRONZE = new j(lllIlIIlIIl[1]);
        IRON = new j(lllIlIIlIIl[3]);
        STEEL = new j(lllIlIIlIIl[5]);
        MITHRIL = new j(lllIlIIlIIl[7]);
        ADAMANT = new j(lllIlIIlIIl[9]);
        RUNE = new j(lllIlIIlIIl[11]);
        AMETHYST = new j(lllIlIIlIIl[13]);
        DRAGON = new j(lllIlIIlIIl[15]);
        j[] jArray = new j[lllIlIIlIIl[16]];
        jArray[j.lllIlIIlIIl[0]] = BRONZE;
        jArray[j.lllIlIIlIIl[2]] = IRON;
        jArray[j.lllIlIIlIIl[4]] = STEEL;
        jArray[j.lllIlIIlIIl[6]] = MITHRIL;
        jArray[j.lllIlIIlIIl[8]] = ADAMANT;
        jArray[j.lllIlIIlIIl[10]] = RUNE;
        jArray[j.lllIlIIlIIl[12]] = AMETHYST;
        jArray[j.lllIlIIlIIl[14]] = DRAGON;
        $VALUES = jArray;
    }

    private j(int n3) {
        this.dartTipId = n3;
    }

    private static String lIlIllllIlIIll(String llllllllllllllllIIlIIllIIIlIIlIl, String llllllllllllllllIIlIIllIIIlIIlII) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIIIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIIIlIIlII.getBytes(StandardCharsets.UTF_8)), lllIlIIlIIl[16]), "DES");
            Cipher llllllllllllllllIIlIIllIIIlIlIIl = Cipher.getInstance("DES");
            llllllllllllllllIIlIIllIIIlIlIIl.init(lllIlIIlIIl[4], llllllllllllllllIIlIIllIIIlIlIlI);
            return new String(llllllllllllllllIIlIIllIIIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIllIIIlIlIII) {
            llllllllllllllllIIlIIllIIIlIlIII.printStackTrace();
            return null;
        }
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    private static String lIlIllllIlIIlI(String llllllllllllllllIIlIIllIIIllIlII, String llllllllllllllllIIlIIllIIIllIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIIIllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIllIIIllIllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIllIIIllIllI.init(lllIlIIlIIl[4], llllllllllllllllIIlIIllIIIllIlll);
            return new String(llllllllllllllllIIlIIllIIIllIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIllIIIllIlIl) {
            llllllllllllllllIIlIIllIIIllIlIl.printStackTrace();
            return null;
        }
    }
}

