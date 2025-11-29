/*
 * Decompiled with CFR 0.152.
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class aA
extends Enum<aA> {
    private static /* synthetic */ int[] lllIIll;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ aA RED;
    public static final /* synthetic */ /* enum */ aA ALL;
    public static final /* synthetic */ /* enum */ aA BROWN;
    private static final /* synthetic */ aA[] $VALUES;
    private static /* synthetic */ String[] lllIIlI;
    public static final /* synthetic */ /* enum */ aA YELLOW;
    public static final /* synthetic */ /* enum */ aA ORANGE;

    public String ax() {
        return this.name;
    }

    public static aA[] values() {
        return (aA[])$VALUES.clone();
    }

    private static void lllIIlIII() {
        lllIIll = new int[11];
        aA.lllIIll[0] = (0x56 ^ 0) & ~(0x4A ^ 0x1C);
        aA.lllIIll[1] = " ".length();
        aA.lllIIll[2] = "  ".length();
        aA.lllIIll[3] = "   ".length();
        aA.lllIIll[4] = 0x8C ^ 0xB8 ^ (0x57 ^ 0x67);
        aA.lllIIll[5] = 0x7C ^ 0x79;
        aA.lllIIll[6] = 0xB3 ^ 0xB5;
        aA.lllIIll[7] = 69 + 137 - 71 + 3 ^ 63 + 47 - 96 + 127;
        aA.lllIIll[8] = 0x83 ^ 0x8B;
        aA.lllIIll[9] = 0x6A ^ 0x63;
        aA.lllIIll[10] = 0x54 ^ 0x47 ^ (0x2C ^ 0x35);
    }

    private static void lllIIIlll() {
        lllIIlI = new String[lllIIll[10]];
        aA.lllIIlI[aA.lllIIll[0]] = aA.lllIIIlII("o/LiTGTJ6jk=", "VXDVY");
        aA.lllIIlI[aA.lllIIll[1]] = aA.lllIIIlII("8PMcY2H14iU=", "kBhmw");
        aA.lllIIlI[aA.lllIIll[2]] = aA.lllIIIlIl("KiAkIQAk", "sehmO");
        aA.lllIIlI[aA.lllIIll[3]] = aA.lllIIIllI("zabpWp/qumEqu38nb3CZRw==", "nEzwz");
        aA.lllIIlI[aA.lllIIll[4]] = aA.lllIIIlIl("BQgCFi0=", "GZMAc");
        aA.lllIIlI[aA.lllIIll[5]] = aA.lllIIIlII("LzeqgDOtkg9PWG0K06JKWg==", "RXwdd");
        aA.lllIIlI[aA.lllIIll[6]] = aA.lllIIIllI("/GzzQfCE+AA=", "lTvXB");
        aA.lllIIlI[aA.lllIIll[7]] = aA.lllIIIlII("4GWOTv2rg2X5xRxdUysY3w==", "EqQzC");
        aA.lllIIlI[aA.lllIIll[8]] = aA.lllIIIlII("+3LXXE05/dM=", "FQgOF");
        aA.lllIIlI[aA.lllIIll[9]] = aA.lllIIIlII("Un13D/ainTnmFaV4t+dDlw==", "bQEWD");
    }

    static {
        aA.lllIIlIII();
        aA.lllIIIlll();
        ALL = new aA(lllIIlI[lllIIll[1]]);
        YELLOW = new aA(lllIIlI[lllIIll[3]]);
        BROWN = new aA(lllIIlI[lllIIll[5]]);
        RED = new aA(lllIIlI[lllIIll[7]]);
        ORANGE = new aA(lllIIlI[lllIIll[9]]);
        aA[] aAArray = new aA[lllIIll[5]];
        aAArray[aA.lllIIll[0]] = ALL;
        aAArray[aA.lllIIll[1]] = YELLOW;
        aAArray[aA.lllIIll[2]] = BROWN;
        aAArray[aA.lllIIll[3]] = RED;
        aAArray[aA.lllIIll[4]] = ORANGE;
        $VALUES = aAArray;
    }

    private static boolean lllIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static aA valueOf(String string) {
        return Enum.valueOf(aA.class, string);
    }

    private static String lllIIIllI(String lllIIlIllllIllI, String lllIIlIllllIlll) {
        try {
            SecretKeySpec lllIIlIlllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIlIllllIlll.getBytes(StandardCharsets.UTF_8)), lllIIll[8]), "DES");
            Cipher lllIIlIlllllIlI = Cipher.getInstance("DES");
            lllIIlIlllllIlI.init(lllIIll[2], lllIIlIlllllIll);
            return new String(lllIIlIlllllIlI.doFinal(Base64.getDecoder().decode(lllIIlIllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIlIlllllIIl) {
            lllIIlIlllllIIl.printStackTrace();
            return null;
        }
    }

    private static String lllIIIlII(String lllIIllllIlIlIl, String lllIIllllIlIIlI) {
        try {
            SecretKeySpec lllIIllllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIllllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIllllIlIlll = Cipher.getInstance("Blowfish");
            lllIIllllIlIlll.init(lllIIll[2], lllIIllllIllIII);
            return new String(lllIIllllIlIlll.doFinal(Base64.getDecoder().decode(lllIIllllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIllllIlIllI) {
            lllIIllllIlIllI.printStackTrace();
            return null;
        }
    }

    private static String lllIIIlIl(String lllIIllIIIIllIl, String lllIIllIIIIllII) {
        lllIIllIIIIllIl = new String(Base64.getDecoder().decode(lllIIllIIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIllIIIIlIll = new StringBuilder();
        char[] lllIIllIIIIlIlI = lllIIllIIIIllII.toCharArray();
        int lllIIllIIIIlIIl = lllIIll[0];
        char[] lllIIllIIIIIIll = lllIIllIIIIllIl.toCharArray();
        int lllIIllIIIIIIlI = lllIIllIIIIIIll.length;
        int lllIIllIIIIIIIl = lllIIll[0];
        while (aA.lllIIlIIl(lllIIllIIIIIIIl, lllIIllIIIIIIlI)) {
            char lllIIllIIIIlllI = lllIIllIIIIIIll[lllIIllIIIIIIIl];
            lllIIllIIIIlIll.append((char)(lllIIllIIIIlllI ^ lllIIllIIIIlIlI[lllIIllIIIIlIIl % lllIIllIIIIlIlI.length]));
            "".length();
            ++lllIIllIIIIlIIl;
            ++lllIIllIIIIIIIl;
            "".length();
            if ((" ".length() & (" ".length() ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(lllIIllIIIIlIll);
    }

    private aA(String string2) {
        this.name = string2;
    }
}

