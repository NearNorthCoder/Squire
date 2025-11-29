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

public final class j
extends Enum<j> {
    public static final /* synthetic */ /* enum */ j EAST;
    private static /* synthetic */ int[] lllIIIIIllII;
    public static final /* synthetic */ /* enum */ j NORTH;
    public static final /* synthetic */ /* enum */ j SOUTH;
    private static /* synthetic */ String[] lllIIIIIlIll;
    public static final /* synthetic */ /* enum */ j WEST;
    private static final /* synthetic */ j[] $VALUES;

    private static String lIIIlIIIIIlllll(String lllllllllllllllIIlllIIlIllIIIlIl, String lllllllllllllllIIlllIIlIllIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIlIllIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlIllIIIlII.getBytes(StandardCharsets.UTF_8)), lllIIIIIllII[5]), "DES");
            Cipher lllllllllllllllIIlllIIlIllIIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIIlllIIlIllIIlIIl.init(lllIIIIIllII[2], lllllllllllllllIIlllIIlIllIIlIlI);
            return new String(lllllllllllllllIIlllIIlIllIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlllIIlIllIIlIII) {
            lllllllllllllllIIlllIIlIllIIlIII.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIIIlIIIIl() {
        lllIIIIIllII = new int[6];
        j.lllIIIIIllII[0] = "   ".length() & ~"   ".length();
        j.lllIIIIIllII[1] = " ".length();
        j.lllIIIIIllII[2] = "  ".length();
        j.lllIIIIIllII[3] = "   ".length();
        j.lllIIIIIllII[4] = 0x69 ^ 0x6D;
        j.lllIIIIIllII[5] = 0xEF ^ 0xC1 ^ (0x58 ^ 0x7E);
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    private static void lIIIlIIIIlIIIII() {
        lllIIIIIlIll = new String[lllIIIIIllII[4]];
        j.lllIIIIIlIll[j.lllIIIIIllII[0]] = j.lIIIlIIIIIlllIl("FmV23J4yvj0=", "HvjQw");
        j.lllIIIIIlIll[j.lllIIIIIllII[1]] = j.lIIIlIIIIIllllI("OTcQBjA=", "jxERx");
        j.lllIIIIIlIll[j.lllIIIIIllII[2]] = j.lIIIlIIIIIlllll("f+ByjQGwcPA=", "HEMpD");
        j.lllIIIIIlIll[j.lllIIIIIllII[3]] = j.lIIIlIIIIIlllll("U0Ft8iPW3mM=", "ANini");
    }

    private static String lIIIlIIIIIlllIl(String lllllllllllllllIIlllIIlIllIlIIlI, String lllllllllllllllIIlllIIlIllIlIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIlIllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlIllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlllIIlIllIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlllIIlIllIlIllI.init(lllIIIIIllII[2], lllllllllllllllIIlllIIlIllIlIlll);
            return new String(lllllllllllllllIIlllIIlIllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlllIIlIllIlIlIl) {
            lllllllllllllllIIlllIIlIllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIIIIllllI(String lllllllllllllllIIlllIIlIlllIlIIl, String lllllllllllllllIIlllIIlIlllIlIII) {
        lllllllllllllllIIlllIIlIlllIlIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIlllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlllIIlIlllIIlll = new StringBuilder();
        char[] lllllllllllllllIIlllIIlIlllIIllI = lllllllllllllllIIlllIIlIlllIlIII.toCharArray();
        int lllllllllllllllIIlllIIlIlllIIlIl = lllIIIIIllII[0];
        char[] lllllllllllllllIIlllIIlIllIlllll = lllllllllllllllIIlllIIlIlllIlIIl.toCharArray();
        int lllllllllllllllIIlllIIlIllIllllI = lllllllllllllllIIlllIIlIllIlllll.length;
        int lllllllllllllllIIlllIIlIllIlllIl = lllIIIIIllII[0];
        while (j.lIIIlIIIIlIIIlI(lllllllllllllllIIlllIIlIllIlllIl, lllllllllllllllIIlllIIlIllIllllI)) {
            char lllllllllllllllIIlllIIlIlllIlIlI = lllllllllllllllIIlllIIlIllIlllll[lllllllllllllllIIlllIIlIllIlllIl];
            lllllllllllllllIIlllIIlIlllIIlll.append((char)(lllllllllllllllIIlllIIlIlllIlIlI ^ lllllllllllllllIIlllIIlIlllIIllI[lllllllllllllllIIlllIIlIlllIIlIl % lllllllllllllllIIlllIIlIlllIIllI.length]));
            "".length();
            ++lllllllllllllllIIlllIIlIlllIIlIl;
            ++lllllllllllllllIIlllIIlIllIlllIl;
            "".length();
            if (" ".length() <= " ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlllIIlIlllIIlll);
    }

    private static boolean lIIIlIIIIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        j.lIIIlIIIIlIIIIl();
        j.lIIIlIIIIlIIIII();
        NORTH = new j();
        SOUTH = new j();
        WEST = new j();
        EAST = new j();
        j[] jArray = new j[lllIIIIIllII[4]];
        jArray[j.lllIIIIIllII[0]] = NORTH;
        jArray[j.lllIIIIIllII[1]] = SOUTH;
        jArray[j.lllIIIIIllII[2]] = WEST;
        jArray[j.lllIIIIIllII[3]] = EAST;
        $VALUES = jArray;
    }
}

