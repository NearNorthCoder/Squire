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

public final class u
extends Enum<u> {
    private static /* synthetic */ int[] lllIIIIlIIll;
    public static final /* synthetic */ /* enum */ u GRAPPLE;
    public static final /* synthetic */ /* enum */ u FIX_BRIDGE;
    public static final /* synthetic */ /* enum */ u CAST_PORTAL;
    public static final /* synthetic */ /* enum */ u HOLY_BARRIER;
    public static final /* synthetic */ /* enum */ u BRAZIER;
    private static /* synthetic */ String[] lllIIIIlIIlI;
    private static final /* synthetic */ u[] $VALUES;

    private static void lIIIlIIIIlllllI() {
        lllIIIIlIIll = new int[7];
        u.lllIIIIlIIll[0] = (0xFE ^ 0xA1) & ~(0xD4 ^ 0x8B);
        u.lllIIIIlIIll[1] = 1;
        u.lllIIIIlIIll[2] = 2;
        u.lllIIIIlIIll[3] = 3;
        u.lllIIIIlIIll[4] = 0x74 ^ 0x70;
        u.lllIIIIlIIll[5] = 91 + 37 - 16 + 15 ^ (0x61 ^ 0x1B);
        u.lllIIIIlIIll[6] = 0xC ^ 4;
    }

    private static String lIIIlIIIIlllIll(String var2, String var11) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var19 = var11.toCharArray();
        int var5 = lllIIIIlIIll[0];
        char[] var1 = var2.toCharArray();
        int var6 = var1.length;
        int var7 = lllIIIIlIIll[0];
        while (u.lIIIlIIIIllllll(var7, var6)) {
            char var9 = var1[var7];
            var17.append((char)(var9 ^ var19[var5 % var19.length]));
            0;
            ++var5;
            ++var7;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static String lIIIlIIIIlllIlI(String var13, String var12) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(lllIIIIlIIll[2], var10);
            return new String(var15.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    static {
        u.lIIIlIIIIlllllI();
        u.lIIIlIIIIllllIl();
        FIX_BRIDGE = new u();
        HOLY_BARRIER = new u();
        CAST_PORTAL = new u();
        BRAZIER = new u();
        GRAPPLE = new u();
        u[] uArray = new u[lllIIIIlIIll[5]];
        uArray[u.lllIIIIlIIll[0]] = FIX_BRIDGE;
        uArray[u.lllIIIIlIIll[1]] = HOLY_BARRIER;
        uArray[u.lllIIIIlIIll[2]] = CAST_PORTAL;
        uArray[u.lllIIIIlIIll[3]] = BRAZIER;
        uArray[u.lllIIIIlIIll[4]] = GRAPPLE;
        $VALUES = uArray;
    }

    public static u valueOf(String string) {
        return Enum.valueOf(u.class, string);
    }

    private static String lIIIlIIIIllllII(String var8, String var18) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lllIIIIlIIll[6]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lllIIIIlIIll[2], var14);
            return new String(var3.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIIIIllllIl() {
        lllIIIIlIIlI = new String[lllIIIIlIIll[5]];
        u.lllIIIIlIIlI[u.lllIIIIlIIll[0]] = u."FIX_BRIDGE";
        u.lllIIIIlIIlI[u.lllIIIIlIIll[1]] = u."HOLY_BARRIER";
        u.lllIIIIlIIlI[u.lllIIIIlIIll[2]] = u."CAST_PORTAL";
        u.lllIIIIlIIlI[u.lllIIIIlIIll[3]] = u."BRAZIER";
        u.lllIIIIlIIlI[u.lllIIIIlIIll[4]] = u."GRAPPLE";
    }

    public static u[] values() {
        return (u[])$VALUES.clone();
    }
}

