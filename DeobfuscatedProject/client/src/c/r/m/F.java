/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import c.r.m.G;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class F {
    private static /* synthetic */ int[] lIIll;
    private static /* synthetic */ String[] lllI;
    private static final /* synthetic */ Logger bp;
    private static final /* synthetic */ G bq;

    private static boolean lIIIlI(int n, int n2) {
        return n < n2;
    }

    public static G j(@Nonnull String string) {
        String lllllllIlllIlIl;
        if (!F.lllll((string = string.toLowerCase()).contains(lllI[lIIll[0]]) ? 1 : 0) || F.lIIIIl(string.contains(lllI[lIIll[1]]) ? 1 : 0)) {
            return G.MacOS;
        }
        if (F.lIIIIl(lllllllIlllIlIl.contains(lllI[lIIll[2]]) ? 1 : 0)) {
            return G.Windows;
        }
        if (F.lIIIIl(lllllllIlllIlIl.contains(lllI[lIIll[3]]) ? 1 : 0)) {
            return G.Linux;
        }
        return G.Other;
    }

    public static G R() {
        return bq;
    }

    private static void lllIl() {
        lIIll = new int[9];
        F.lIIll[0] = ((0x3A ^ 0x64) & ~(0x79 ^ 0x27) ^ (0x37 ^ 0x24)) & (41 + 36 - -65 + 27 ^ 109 + 176 - 145 + 46 ^ -" ".length());
        F.lIIll[1] = " ".length();
        F.lIIll[2] = "  ".length();
        F.lIIll[3] = "   ".length();
        F.lIIll[4] = 0x87 ^ 0x83;
        F.lIIll[5] = 0x31 ^ 0x39 ^ (0x79 ^ 0x74);
        F.lIIll[6] = 0xE ^ 8;
        F.lIIll[7] = 0x56 ^ 0x51;
        F.lIIll[8] = 112 + 95 - 120 + 69 ^ 110 + 48 - 105 + 95;
    }

    static {
        F.lllIl();
        F.llIll();
        bp = LoggerFactory.getLogger(F.class);
        String string = System.getProperty(lllI[lIIll[4]], lllI[lIIll[5]]).toLowerCase();
        bq = F.j(string);
        bp.debug(lllI[lIIll[6]], (Object)bq);
    }

    private static boolean lIIIIl(int n) {
        return n != 0;
    }

    private static String lIIll(String lllllllIllIIIII, String lllllllIlIlllll) {
        try {
            SecretKeySpec lllllllIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllIllIIIlI = Cipher.getInstance("Blowfish");
            lllllllIllIIIlI.init(lIIll[2], lllllllIllIIIll);
            return new String(lllllllIllIIIlI.doFinal(Base64.getDecoder().decode(lllllllIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllIllIIIIl) {
            lllllllIllIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllll(int n) {
        return n == 0;
    }

    private static String lIIIl(String lllllllIlIlIIII, String lllllllIlIIlIlI) {
        lllllllIlIlIIII = new String(Base64.getDecoder().decode(lllllllIlIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllIlIIlllI = new StringBuilder();
        char[] lllllllIlIIllIl = lllllllIlIIlIlI.toCharArray();
        int lllllllIlIIllII = lIIll[0];
        char[] lllllllIlIIIllI = lllllllIlIlIIII.toCharArray();
        int lllllllIlIIIlIl = lllllllIlIIIllI.length;
        int lllllllIlIIIlII = lIIll[0];
        while (F.lIIIlI(lllllllIlIIIlII, lllllllIlIIIlIl)) {
            char lllllllIlIlIIIl = lllllllIlIIIllI[lllllllIlIIIlII];
            lllllllIlIIlllI.append((char)(lllllllIlIlIIIl ^ lllllllIlIIllIl[lllllllIlIIllII % lllllllIlIIllIl.length]));
            "".length();
            ++lllllllIlIIllII;
            ++lllllllIlIIIlII;
            "".length();
            if (-(0x12 ^ 0x16) <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllIlIIlllI);
    }

    private static void llIll() {
        lllI = new String[lIIll[7]];
        F.lllI[F.lIIll[0]] = F.lIIIl("IxAX", "NqtaI");
        F.lllI[F.lIIll[1]] = F.lIIlI("YuiT1IHk9mo=", "fZjmD");
        F.lllI[F.lIIll[2]] = F.lIIll("tNm7L5oRS14=", "AiELd");
        F.lllI[F.lIIll[3]] = F.lIIlI("BCeIj61XA/A=", "PiWQf");
        F.lllI[F.lIIll[4]] = F.lIIlI("c0iQCYoJ0Iw=", "dhymq");
        F.lllI[F.lIIll[5]] = F.lIIIl("MBEDHzY+Fw==", "WtmzD");
        F.lllI[F.lIIll[6]] = F.lIIlI("36y+8Sq2evl5MU+qPUwfJg==", "zxICv");
    }

    private static String lIIlI(String lllllllIllIllIl, String lllllllIllIlIlI) {
        try {
            SecretKeySpec lllllllIlllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllIllIlIlI.getBytes(StandardCharsets.UTF_8)), lIIll[8]), "DES");
            Cipher lllllllIllIllll = Cipher.getInstance("DES");
            lllllllIllIllll.init(lIIll[2], lllllllIlllIIII);
            return new String(lllllllIllIllll.doFinal(Base64.getDecoder().decode(lllllllIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllIllIlllI) {
            lllllllIllIlllI.printStackTrace();
            return null;
        }
    }
}
