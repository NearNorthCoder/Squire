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

public final class k
extends Enum<k> {
    public static final /* synthetic */ /* enum */ k NORTH;
    public static final /* synthetic */ /* enum */ k SOUTH_BLADE;
    public static final /* synthetic */ /* enum */ k EAST;
    public static final /* synthetic */ /* enum */ k WEST;
    public static final /* synthetic */ /* enum */ k SOUTH;
    private static /* synthetic */ String[] lllIIIIlllll;
    private static final /* synthetic */ k[] $VALUES;
    private static /* synthetic */ int[] lllIIIlIIIII;

    public static k valueOf(String string) {
        return Enum.valueOf(k.class, string);
    }

    static {
        k.lIIIlIIIllIllIl();
        k.lIIIlIIIllIllII();
        NORTH = new k();
        SOUTH = new k();
        WEST = new k();
        EAST = new k();
        SOUTH_BLADE = new k();
        k[] kArray = new k[lllIIIlIIIII[5]];
        kArray[k.lllIIIlIIIII[0]] = NORTH;
        kArray[k.lllIIIlIIIII[1]] = SOUTH;
        kArray[k.lllIIIlIIIII[2]] = WEST;
        kArray[k.lllIIIlIIIII[3]] = EAST;
        kArray[k.lllIIIlIIIII[4]] = SOUTH_BLADE;
        $VALUES = kArray;
    }

    private static void lIIIlIIIllIllIl() {
        lllIIIlIIIII = new int[7];
        k.lllIIIlIIIII[0] = (155 + 13 - 135 + 182 ^ 57 + 155 - 141 + 87) & (0xB6 ^ 0x86 ^ (0x32 ^ 0x4B) ^ -" ".length());
        k.lllIIIlIIIII[1] = " ".length();
        k.lllIIIlIIIII[2] = "  ".length();
        k.lllIIIlIIIII[3] = "   ".length();
        k.lllIIIlIIIII[4] = 0x1B ^ 0xD ^ (5 ^ 0x17);
        k.lllIIIlIIIII[5] = 0x29 ^ 0x2C;
        k.lllIIIlIIIII[6] = 0x7F ^ 0x24 ^ (0xE5 ^ 0xB6);
    }

    private static boolean lIIIlIIIllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIlIIIllIlIlI(String lllllllllllllllIIlllIIIIIIIllllI, String lllllllllllllllIIlllIIIIIIIlllIl) {
        lllllllllllllllIIlllIIIIIIIllllI = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIIIIIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlllIIIIIIlIIIIl = new StringBuilder();
        char[] lllllllllllllllIIlllIIIIIIlIIIII = lllllllllllllllIIlllIIIIIIIlllIl.toCharArray();
        int lllllllllllllllIIlllIIIIIIIlllll = lllIIIlIIIII[0];
        char[] lllllllllllllllIIlllIIIIIIIllIIl = lllllllllllllllIIlllIIIIIIIllllI.toCharArray();
        int lllllllllllllllIIlllIIIIIIIllIII = lllllllllllllllIIlllIIIIIIIllIIl.length;
        int lllllllllllllllIIlllIIIIIIIlIlll = lllIIIlIIIII[0];
        while (k.lIIIlIIIllIlllI(lllllllllllllllIIlllIIIIIIIlIlll, lllllllllllllllIIlllIIIIIIIllIII)) {
            char lllllllllllllllIIlllIIIIIIlIIlII = lllllllllllllllIIlllIIIIIIIllIIl[lllllllllllllllIIlllIIIIIIIlIlll];
            lllllllllllllllIIlllIIIIIIlIIIIl.append((char)(lllllllllllllllIIlllIIIIIIlIIlII ^ lllllllllllllllIIlllIIIIIIlIIIII[lllllllllllllllIIlllIIIIIIIlllll % lllllllllllllllIIlllIIIIIIlIIIII.length]));
            "".length();
            ++lllllllllllllllIIlllIIIIIIIlllll;
            ++lllllllllllllllIIlllIIIIIIIlIlll;
            "".length();
            if ((0x54 ^ 0x22 ^ (0xF3 ^ 0x81)) > ((0x89 ^ 0xB1 ^ "   ".length()) & (56 + 153 - 43 + 24 ^ 14 + 87 - 23 + 55 ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlllIIIIIIlIIIIl);
    }

    private static String lIIIlIIIllIlIll(String lllllllllllllllIIlllIIIIIIIIlllI, String lllllllllllllllIIlllIIIIIIIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIIIIIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIIIIIIlIll.getBytes(StandardCharsets.UTF_8)), lllIIIlIIIII[6]), "DES");
            Cipher lllllllllllllllIIlllIIIIIIIlIIII = Cipher.getInstance("DES");
            lllllllllllllllIIlllIIIIIIIlIIII.init(lllIIIlIIIII[2], lllllllllllllllIIlllIIIIIIIlIIIl);
            return new String(lllllllllllllllIIlllIIIIIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlllIIIIIIIIllll) {
            lllllllllllllllIIlllIIIIIIIIllll.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIIllIllII() {
        lllIIIIlllll = new String[lllIIIlIIIII[5]];
        k.lllIIIIlllll[k.lllIIIlIIIII[0]] = k.lIIIlIIIllIlIlI("CiwLMSA=", "DcYeh");
        k.lllIIIIlllll[k.lllIIIlIIIII[1]] = k.lIIIlIIIllIlIlI("ERgUDSo=", "BWAYb");
        k.lllIIIIlllll[k.lllIIIlIIIII[2]] = k.lIIIlIIIllIlIll("QMoyd3Bc0Pg=", "XMifH");
        k.lllIIIIlllll[k.lllIIIlIIIII[3]] = k.lIIIlIIIllIlIll("stEZvTFiWTU=", "yjRtu");
        k.lllIIIIlllll[k.lllIIIlIIIII[4]] = k.lIIIlIIIllIlIll("tIE6YVBzUqQAYr+6xb0YRA==", "xgldU");
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
    }
}

