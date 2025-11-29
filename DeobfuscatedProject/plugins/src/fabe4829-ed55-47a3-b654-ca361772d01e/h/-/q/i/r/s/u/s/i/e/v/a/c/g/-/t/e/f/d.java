/*
 * Decompiled with CFR 0.152.
 */
package h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class d
extends Enum<d> {
    private static /* synthetic */ String[] llIIIllIllll;
    public static final /* synthetic */ /* enum */ d LOW;
    public static final /* synthetic */ /* enum */ d VERY_LOW;
    private static /* synthetic */ int[] llIIIlllIIII;
    public static final /* synthetic */ /* enum */ d VERY_HIGH;
    private static final /* synthetic */ d[] $VALUES;
    public static final /* synthetic */ /* enum */ d HIGH;
    public static final /* synthetic */ /* enum */ d MEDIUM;

    private static String llllIllIlIlIIl(String lllllllllllllllIlIlIIIlIllllIlll, String lllllllllllllllIlIlIIIlIllllIIIl) {
        lllllllllllllllIlIlIIIlIllllIlll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlIllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIIlIllllIlIl = new StringBuilder();
        char[] lllllllllllllllIlIlIIIlIllllIlII = lllllllllllllllIlIlIIIlIllllIIIl.toCharArray();
        int lllllllllllllllIlIlIIIlIllllIIll = llIIIlllIIII[0];
        char[] lllllllllllllllIlIlIIIlIlllIllIl = lllllllllllllllIlIlIIIlIllllIlll.toCharArray();
        int lllllllllllllllIlIlIIIlIlllIllII = lllllllllllllllIlIlIIIlIlllIllIl.length;
        int lllllllllllllllIlIlIIIlIlllIlIll = llIIIlllIIII[0];
        while (d.llllIllIlIlllI(lllllllllllllllIlIlIIIlIlllIlIll, lllllllllllllllIlIlIIIlIlllIllII)) {
            char lllllllllllllllIlIlIIIlIlllllIII = lllllllllllllllIlIlIIIlIlllIllIl[lllllllllllllllIlIlIIIlIlllIlIll];
            lllllllllllllllIlIlIIIlIllllIlIl.append((char)(lllllllllllllllIlIlIIIlIlllllIII ^ lllllllllllllllIlIlIIIlIllllIlII[lllllllllllllllIlIlIIIlIllllIIll % lllllllllllllllIlIlIIIlIllllIlII.length]));
            "".length();
            ++lllllllllllllllIlIlIIIlIllllIIll;
            ++lllllllllllllllIlIlIIIlIlllIlIll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIIIlIllllIlIl);
    }

    private static String llllIllIlIlIll(String lllllllllllllllIlIlIIIlIllIlIlIl, String lllllllllllllllIlIlIIIlIllIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIlIllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIlIllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIIlIllIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIIlIllIlIlll.init(llIIIlllIIII[2], lllllllllllllllIlIlIIIlIllIllIII);
            return new String(lllllllllllllllIlIlIIIlIllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIIlIllIlIllI) {
            lllllllllllllllIlIlIIIlIllIlIllI.printStackTrace();
            return null;
        }
    }

    private static void llllIllIlIllIl() {
        llIIIlllIIII = new int[7];
        d.llIIIlllIIII[0] = (0x27 ^ 0x13) & ~(0x11 ^ 0x25);
        d.llIIIlllIIII[1] = " ".length();
        d.llIIIlllIIII[2] = "  ".length();
        d.llIIIlllIIII[3] = "   ".length();
        d.llIIIlllIIII[4] = 0xB3 ^ 0xB7;
        d.llIIIlllIIII[5] = 0x1B ^ 0x62 ^ (0xC5 ^ 0xB9);
        d.llIIIlllIIII[6] = 39 + 67 - 104 + 126 ^ 48 + 9 - 11 + 90;
    }

    private static void llllIllIlIllII() {
        llIIIllIllll = new String[llIIIlllIIII[5]];
        d.llIIIllIllll[d.llIIIlllIIII[0]] = d.llllIllIlIlIIl("LB0kEyw2FyE=", "zXvJs");
        d.llIIIllIllll[d.llIIIlllIIII[1]] = d.llllIllIlIlIIl("ACwD", "LcTRi");
        d.llIIIllIllll[d.llIIIlllIIII[2]] = d.llllIllIlIlIlI("xEB6dzt6NYs=", "usVIC");
        d.llIIIllIllll[d.llIIIlllIIII[3]] = d.llllIllIlIlIIl("GS8jJA==", "QfdlU");
        d.llIIIllIllll[d.llIIIlllIIII[4]] = d.llllIllIlIlIll("sBa0dh7BPFncDVv414++oQ==", "JwnYc");
    }

    private static String llllIllIlIlIlI(String lllllllllllllllIlIlIIIlIlllIIIII, String lllllllllllllllIlIlIIIlIllIlllll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIlIlllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIlIllIlllll.getBytes(StandardCharsets.UTF_8)), llIIIlllIIII[6]), "DES");
            Cipher lllllllllllllllIlIlIIIlIlllIIlII = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIIlIlllIIlII.init(llIIIlllIIII[2], lllllllllllllllIlIlIIIlIlllIIlIl);
            return new String(lllllllllllllllIlIlIIIlIlllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIIlIlllIIIll) {
            lllllllllllllllIlIlIIIlIlllIIIll.printStackTrace();
            return null;
        }
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    static {
        d.llllIllIlIllIl();
        d.llllIllIlIllII();
        VERY_LOW = new d();
        LOW = new d();
        MEDIUM = new d();
        HIGH = new d();
        VERY_HIGH = new d();
        d[] dArray = new d[llIIIlllIIII[5]];
        dArray[d.llIIIlllIIII[0]] = VERY_LOW;
        dArray[d.llIIIlllIIII[1]] = LOW;
        dArray[d.llIIIlllIIII[2]] = MEDIUM;
        dArray[d.llIIIlllIIII[3]] = HIGH;
        dArray[d.llIIIlllIIII[4]] = VERY_HIGH;
        $VALUES = dArray;
    }

    private static boolean llllIllIlIlllI(int n2, int n3) {
        return n2 < n3;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }
}

