/*
 * Decompiled with CFR 0.152.
 */
package -.r.u.q.e.s.o.t.a.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class c
extends Enum<c> {
    public static final /* synthetic */ /* enum */ c RANGE_2;
    public static final /* synthetic */ /* enum */ c MAGE;
    public static final /* synthetic */ /* enum */ c MELEE_1;
    private static /* synthetic */ String[] lIlIIIIIlIIll;
    public static final /* synthetic */ /* enum */ c RANGE_1;
    private static final /* synthetic */ c[] $VALUES;
    private static /* synthetic */ int[] lIlIIIIIlIlII;
    public static final /* synthetic */ /* enum */ c NONE;
    public static final /* synthetic */ /* enum */ c MELEE_2;

    static {
        c.lIllIllIIIllIIl();
        c.lIllIllIIIllIII();
        NONE = new c();
        MELEE_1 = new c();
        MELEE_2 = new c();
        RANGE_1 = new c();
        RANGE_2 = new c();
        MAGE = new c();
        c[] cArray = new c[lIlIIIIIlIlII[6]];
        cArray[c.lIlIIIIIlIlII[0]] = NONE;
        cArray[c.lIlIIIIIlIlII[1]] = MELEE_1;
        cArray[c.lIlIIIIIlIlII[2]] = MELEE_2;
        cArray[c.lIlIIIIIlIlII[3]] = RANGE_1;
        cArray[c.lIlIIIIIlIlII[4]] = RANGE_2;
        cArray[c.lIlIIIIIlIlII[5]] = MAGE;
        $VALUES = cArray;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private static void lIllIllIIIllIII() {
        lIlIIIIIlIIll = new String[lIlIIIIIlIlII[6]];
        c.lIlIIIIIlIIll[c.lIlIIIIIlIlII[0]] = c.lIllIllIIIlIlIl("XW+10ztTdos=", "pVhUH");
        c.lIlIIIIIlIIll[c.lIlIIIIIlIlII[1]] = c.lIllIllIIIlIllI("LBYrAyQ+Yg==", "aSgFa");
        c.lIlIIIIIlIIll[c.lIlIIIIIlIlII[2]] = c.lIllIllIIIlIlll("ypzmMus5o7E=", "CnkBS");
        c.lIlIIIIIlIIll[c.lIlIIIIIlIlII[3]] = c.lIllIllIIIlIllI("ARIsNSAMYg==", "SSbre");
        c.lIlIIIIIlIIll[c.lIlIIIIIlIlII[4]] = c.lIllIllIIIlIlIl("d2QxRRo1MeY=", "vpStS");
        c.lIlIIIIIlIIll[c.lIlIIIIIlIlII[5]] = c.lIllIllIIIlIlIl("d7dq833AH9s=", "VjdoZ");
    }

    private static void lIllIllIIIllIIl() {
        lIlIIIIIlIlII = new int[8];
        c.lIlIIIIIlIlII[0] = (0x17 ^ 0x47) & ~(0xE ^ 0x5E);
        c.lIlIIIIIlIlII[1] = " ".length();
        c.lIlIIIIIlIlII[2] = "  ".length();
        c.lIlIIIIIlIlII[3] = "   ".length();
        c.lIlIIIIIlIlII[4] = 0xB0 ^ 0xB4;
        c.lIlIIIIIlIlII[5] = 0x22 ^ 0x27;
        c.lIlIIIIIlIlII[6] = 0xF4 ^ 0xA9 ^ (0x5C ^ 7);
        c.lIlIIIIIlIlII[7] = 0x58 ^ 0x44 ^ (0x73 ^ 0x67);
    }

    private static String lIllIllIIIlIlIl(String llllllllllllllIlllIIllIIIIlllIII, String llllllllllllllIlllIIllIIIIllIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIllIIIIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIIIIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIllIIIIlllIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIllIIIIlllIlI.init(lIlIIIIIlIlII[2], llllllllllllllIlllIIllIIIIlllIll);
            return new String(llllllllllllllIlllIIllIIIIlllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIIIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIllIIIIlllIIl) {
            llllllllllllllIlllIIllIIIIlllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIllIIIlIllI(String llllllllllllllIlllIIllIIIlIllIlI, String llllllllllllllIlllIIllIIIlIllIIl) {
        llllllllllllllIlllIIllIIIlIllIlI = new String(Base64.getDecoder().decode(llllllllllllllIlllIIllIIIlIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIllIIIlIllIII = new StringBuilder();
        char[] llllllllllllllIlllIIllIIIlIlIlll = llllllllllllllIlllIIllIIIlIllIIl.toCharArray();
        int llllllllllllllIlllIIllIIIlIlIllI = lIlIIIIIlIlII[0];
        char[] llllllllllllllIlllIIllIIIlIlIIII = llllllllllllllIlllIIllIIIlIllIlI.toCharArray();
        int llllllllllllllIlllIIllIIIlIIllll = llllllllllllllIlllIIllIIIlIlIIII.length;
        int llllllllllllllIlllIIllIIIlIIlllI = lIlIIIIIlIlII[0];
        while (c.lIllIllIIIllIlI(llllllllllllllIlllIIllIIIlIIlllI, llllllllllllllIlllIIllIIIlIIllll)) {
            char llllllllllllllIlllIIllIIIlIllIll = llllllllllllllIlllIIllIIIlIlIIII[llllllllllllllIlllIIllIIIlIIlllI];
            llllllllllllllIlllIIllIIIlIllIII.append((char)(llllllllllllllIlllIIllIIIlIllIll ^ llllllllllllllIlllIIllIIIlIlIlll[llllllllllllllIlllIIllIIIlIlIllI % llllllllllllllIlllIIllIIIlIlIlll.length]));
            "".length();
            ++llllllllllllllIlllIIllIIIlIlIllI;
            ++llllllllllllllIlllIIllIIIlIIlllI;
            "".length();
            if ((0x33 ^ 0x37) > "  ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIllIIIlIllIII);
    }

    private static String lIllIllIIIlIlll(String llllllllllllllIlllIIllIIIlIIIlIl, String llllllllllllllIlllIIllIIIlIIIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIIllIIIlIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIlII[7]), "DES");
            Cipher llllllllllllllIlllIIllIIIlIIIlll = Cipher.getInstance("DES");
            llllllllllllllIlllIIllIIIlIIIlll.init(lIlIIIIIlIlII[2], llllllllllllllIlllIIllIIIlIIlIII);
            return new String(llllllllllllllIlllIIllIIIlIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIllIIIlIIIllI) {
            llllllllllllllIlllIIllIIIlIIIllI.printStackTrace();
            return null;
        }
    }
}

