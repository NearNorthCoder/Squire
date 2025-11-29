/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.ui.ColorScheme
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.C;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;

public final class F
extends Enum<F> {
    private static /* synthetic */ int[] lIlllIllIlII;
    public static final /* synthetic */ /* enum */ F UNKNOWN;
    public static final /* synthetic */ /* enum */ F BUILT;
    private static /* synthetic */ String[] lIlllIllIIll;
    private final /* synthetic */ Color color;
    public static final /* synthetic */ /* enum */ F SEEDED;
    public static final /* synthetic */ /* enum */ F EMPTY;
    private static final /* synthetic */ F[] $VALUES;

    public static F valueOf(String string) {
        return Enum.valueOf(F.class, string);
    }

    private static boolean lllIllIIllllIl(int n2, int n3) {
        return n2 > n3;
    }

    public static F[] values() {
        return (F[])$VALUES.clone();
    }

    private static String lllIllIIlllIII(String lllllllllllllllIlIllIlIlIIlIIllI, String lllllllllllllllIlIllIlIlIIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllIlIlIIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIlllIllIlII[5]), "DES");
            Cipher lllllllllllllllIlIllIlIlIIlIlIII = Cipher.getInstance("DES");
            lllllllllllllllIlIllIlIlIIlIlIII.init(lIlllIllIlII[3], lllllllllllllllIlIllIlIlIIlIlIIl);
            return new String(lllllllllllllllIlIllIlIlIIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlIlIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIlIlIIlIIlll) {
            lllllllllllllllIlIllIlIlIIlIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIllIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIllIIllllII(int n2) {
        return n2 >= 0;
    }

    private static void lllIllIIlllIll() {
        lIlllIllIlII = new int[6];
        F.lIlllIllIlII[0] = "   ".length();
        F.lIlllIllIlII[1] = (0x94 ^ 0xBD ^ (0x9C ^ 0xA8)) & (0x11 ^ 0x38 ^ (0x58 ^ 0x6C) ^ -" ".length());
        F.lIlllIllIlII[2] = " ".length();
        F.lIlllIllIlII[3] = "  ".length();
        F.lIlllIllIlII[4] = 94 + 128 - 182 + 129 ^ 105 + 99 - 181 + 150;
        F.lIlllIllIlII[5] = 0x4A ^ 0x42;
    }

    private F(Color color) {
        this.color = color;
    }

    private static void lllIllIIlllIlI() {
        lIlllIllIIll = new String[lIlllIllIlII[4]];
        F.lIlllIllIIll[F.lIlllIllIlII[1]] = F.lllIllIIllIlll("V/R1JYfg9sQ=", "BlruL");
        F.lIlllIllIIll[F.lIlllIllIlII[2]] = F.lllIllIIlllIII("Bs+GVxZUUKg=", "buvoa");
        F.lIlllIllIIll[F.lIlllIllIlII[3]] = F.lllIllIIlllIIl("PRwBEwM=", "xQQGZ");
        F.lIlllIllIIll[F.lIlllIllIlII[0]] = F.lllIllIIlllIIl("PB0kGh4+HQ==", "iSoTQ");
    }

    private static String lllIllIIllIlll(String lllllllllllllllIlIllIlIlIIIIIIIl, String lllllllllllllllIlIllIlIlIIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIllIlIlIIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlIlIIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIlIlIIIIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIlIlIIIIIIll.init(lIlllIllIlII[3], lllllllllllllllIlIllIlIlIIIIIlII);
            return new String(lllllllllllllllIlIllIlIlIIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlIlIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIlIlIIIIIIlI) {
            lllllllllllllllIlIllIlIlIIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static String lllIllIIlllIIl(String lllllllllllllllIlIllIlIlIIIlIllI, String lllllllllllllllIlIllIlIlIIIlIlIl) {
        lllllllllllllllIlIllIlIlIIIlIllI = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIlIlIIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIlIlIIIlIlII = new StringBuilder();
        char[] lllllllllllllllIlIllIlIlIIIlIIll = lllllllllllllllIlIllIlIlIIIlIlIl.toCharArray();
        int lllllllllllllllIlIllIlIlIIIlIIlI = lIlllIllIlII[1];
        char[] lllllllllllllllIlIllIlIlIIIIllII = lllllllllllllllIlIllIlIlIIIlIllI.toCharArray();
        int lllllllllllllllIlIllIlIlIIIIlIll = lllllllllllllllIlIllIlIlIIIIllII.length;
        int lllllllllllllllIlIllIlIlIIIIlIlI = lIlllIllIlII[1];
        while (F.lllIllIIllllll(lllllllllllllllIlIllIlIlIIIIlIlI, lllllllllllllllIlIllIlIlIIIIlIll)) {
            char lllllllllllllllIlIllIlIlIIIlIlll = lllllllllllllllIlIllIlIlIIIIllII[lllllllllllllllIlIllIlIlIIIIlIlI];
            lllllllllllllllIlIllIlIlIIIlIlII.append((char)(lllllllllllllllIlIllIlIlIIIlIlll ^ lllllllllllllllIlIllIlIlIIIlIIll[lllllllllllllllIlIllIlIlIIIlIIlI % lllllllllllllllIlIllIlIlIIIlIIll.length]));
            "".length();
            ++lllllllllllllllIlIllIlIlIIIlIIlI;
            ++lllllllllllllllIlIllIlIlIIIIlIlI;
            "".length();
            if ("  ".length() > -" ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIllIlIlIIIlIlII);
    }

    static {
        F.lllIllIIlllIll();
        F.lllIllIIlllIlI();
        SEEDED = new F(ColorScheme.PROGRESS_COMPLETE_COLOR);
        BUILT = new F(ColorScheme.PROGRESS_INPROGRESS_COLOR);
        EMPTY = new F(ColorScheme.MEDIUM_GRAY_COLOR);
        UNKNOWN = new F(ColorScheme.MEDIUM_GRAY_COLOR);
        F[] fArray = new F[lIlllIllIlII[4]];
        fArray[F.lIlllIllIlII[1]] = SEEDED;
        fArray[F.lIlllIllIlII[2]] = BUILT;
        fArray[F.lIlllIllIlII[3]] = EMPTY;
        fArray[F.lIlllIllIlII[0]] = UNKNOWN;
        $VALUES = fArray;
    }

    private static boolean lllIllIIlllllI(int n2) {
        return n2 == 0;
    }

    public static F d(int n2) {
        int lllllllllllllllIlIllIlIlIIlIlllI;
        if (!F.lllIllIIllllII(n2) || F.lllIllIIllllIl(n2, C.values().length * lIlllIllIlII[0])) {
            return UNKNOWN;
        }
        if (F.lllIllIIlllllI(lllllllllllllllIlIllIlIlIIlIlllI)) {
            return EMPTY;
        }
        if (F.lllIllIIlllllI(lllllllllllllllIlIllIlIlIIlIlllI % lIlllIllIlII[0])) {
            return SEEDED;
        }
        return BUILT;
    }

    public Color V() {
        return this.color;
    }
}

