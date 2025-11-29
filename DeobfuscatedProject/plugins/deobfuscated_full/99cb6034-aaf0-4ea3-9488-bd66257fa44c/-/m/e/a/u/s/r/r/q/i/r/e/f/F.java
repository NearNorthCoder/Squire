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

    private static String lllIllIIlllIII(String var11, String var9) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lIlllIllIlII[5]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lIlllIllIlII[3], var15);
            return new String(var16.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
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
        F.lIlllIllIlII[0] = 3;
        F.lIlllIllIlII[1] = (0x94 ^ 0xBD ^ (0x9C ^ 0xA8)) & (0x11 ^ 0x38 ^ (0x58 ^ 0x6C) ^ -1);
        F.lIlllIllIlII[2] = 1;
        F.lIlllIllIlII[3] = 2;
        F.lIlllIllIlII[4] = 94 + 128 - 182 + 129 ^ 105 + 99 - 181 + 150;
        F.lIlllIllIlII[5] = 0x4A ^ 0x42;
    }

    private F(Color color) {
        this.color = color;
    }

    private static void lllIllIIlllIlI() {
        lIlllIllIIll = new String[lIlllIllIlII[4]];
        F.lIlllIllIIll[F.lIlllIllIlII[1]] = F."SEEDED";
        F.lIlllIllIIll[F.lIlllIllIlII[2]] = F."BUILT";
        F.lIlllIllIIll[F.lIlllIllIlII[3]] = F."EMPTY";
        F.lIlllIllIIll[F.lIlllIllIlII[0]] = F."UNKNOWN";
    }

    private static String lllIllIIllIlll(String var13, String var14) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIlllIllIlII[3], var6);
            return new String(var19.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static String lllIllIIlllIIl(String var5, String var1) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var3 = var1.toCharArray();
        int var18 = lIlllIllIlII[1];
        char[] var8 = var5.toCharArray();
        int var4 = var8.length;
        int var20 = lIlllIllIlII[1];
        while (F.lllIllIIllllll(var20, var4)) {
            char var7 = var8[var20];
            var17.append((char)(var7 ^ var3[var18 % var3.length]));
            0;
            ++var18;
            ++var20;
            0;
            if (2 > -1) continue;
            return null;
        }
        return String.valueOf(var17);
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
        int var10;
        if (!F.lllIllIIllllII(n2) || F.lllIllIIllllIl(n2, C.values().length * lIlllIllIlII[0])) {
            return UNKNOWN;
        }
        if (F.lllIllIIlllllI(var10)) {
            return EMPTY;
        }
        if (F.lllIllIIlllllI(var10 % lIlllIllIlII[0])) {
            return SEEDED;
        }
        return BUILT;
    }

    public Color V() {
        return this.color;
    }
}

