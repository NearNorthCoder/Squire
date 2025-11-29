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

public final class GEnum
extends Enum<g> {
    private static final /* synthetic */ g[] $VALUES;
    public static final /* synthetic */ /* enum */ g BLADE;
    public static final /* synthetic */ /* enum */ g GOLDEN_BLADE_II;
    public static final /* synthetic */ /* enum */ g GOLDEN_BLADE_V;
    public static final /* synthetic */ /* enum */ g BLADE_I;
    public static final /* synthetic */ /* enum */ g BLADE_III;
    public static final /* synthetic */ /* enum */ g BLADE_II;
    public static final /* synthetic */ /* enum */ g BLUE_BLADE_II;
    public static final /* synthetic */ /* enum */ g BLADE_IV;
    public static final /* synthetic */ /* enum */ g GOLDEN_BLADE_III;
    public static final /* synthetic */ /* enum */ g GOLDEN_BLADE_IV;
    public static final /* synthetic */ /* enum */ g GOLDEN_BLADE_VI;
    private static /* synthetic */ int[] lllIIIIIlIII;
    public static final /* synthetic */ /* enum */ g BLUE_BLADE_I;
    private static /* synthetic */ String[] lllIIIIIIlll;
    public static final /* synthetic */ /* enum */ g GOLDEN_BLADE_I;

    static {
        g.lIIIlIIIIIlIllI();
        g.lIIIlIIIIIlIlIl();
        BLADE = new g();
        BLADE_I = new g();
        BLADE_II = new g();
        BLADE_III = new g();
        BLADE_IV = new g();
        GOLDEN_BLADE_II = new g();
        GOLDEN_BLADE_I = new g();
        GOLDEN_BLADE_III = new g();
        GOLDEN_BLADE_IV = new g();
        GOLDEN_BLADE_V = new g();
        GOLDEN_BLADE_VI = new g();
        BLUE_BLADE_I = new g();
        BLUE_BLADE_II = new g();
        g[] gArray = new g[lllIIIIIlIII[13]];
        gArray[g.lllIIIIIlIII[0]] = BLADE;
        gArray[g.lllIIIIIlIII[1]] = BLADE_I;
        gArray[g.lllIIIIIlIII[2]] = BLADE_II;
        gArray[g.lllIIIIIlIII[3]] = BLADE_III;
        gArray[g.lllIIIIIlIII[4]] = BLADE_IV;
        gArray[g.lllIIIIIlIII[5]] = GOLDEN_BLADE_II;
        gArray[g.lllIIIIIlIII[6]] = GOLDEN_BLADE_I;
        gArray[g.lllIIIIIlIII[7]] = GOLDEN_BLADE_III;
        gArray[g.lllIIIIIlIII[8]] = GOLDEN_BLADE_IV;
        gArray[g.lllIIIIIlIII[9]] = GOLDEN_BLADE_V;
        gArray[g.lllIIIIIlIII[10]] = GOLDEN_BLADE_VI;
        gArray[g.lllIIIIIlIII[11]] = BLUE_BLADE_I;
        gArray[g.lllIIIIIlIII[12]] = BLUE_BLADE_II;
        $VALUES = gArray;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    private static String lIIIlIIIIIlIIll(String var19, String var7) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lllIIIIIlIII[8]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lllIIIIIlIII[2], var4);
            return new String(var17.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIIIIlIllI() {
        lllIIIIIlIII = new int[14];
        g.lllIIIIIlIII[0] = (0xAB ^ 0xB2 ^ (0x8A ^ 0xA1)) & (96 + 98 - 109 + 43 ^ 133 + 140 - 209 + 114 ^ -1);
        g.lllIIIIIlIII[1] = 1;
        g.lllIIIIIlIII[2] = 2;
        g.lllIIIIIlIII[3] = 3;
        g.lllIIIIIlIII[4] = 0x5D ^ 0x59;
        g.lllIIIIIlIII[5] = 0xB6 ^ 0xB3;
        g.lllIIIIIlIII[6] = 0x74 ^ 0x12 ^ (0x2D ^ 0x4D);
        g.lllIIIIIlIII[7] = 0x53 ^ 0x54;
        g.lllIIIIIlIII[8] = 0x12 ^ 0x1A;
        g.lllIIIIIlIII[9] = 0x51 ^ 0x1A ^ (0x41 ^ 3);
        g.lllIIIIIlIII[10] = 43 + 72 - 14 + 38 ^ 107 + 3 - 61 + 80;
        g.lllIIIIIlIII[11] = 0x64 ^ 0x75 ^ (0x72 ^ 0x68);
        g.lllIIIIIlIII[12] = 0x92 ^ 0x9E;
        g.lllIIIIIlIII[13] = 0x5D ^ 3 ^ (0x6E ^ 0x3D);
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private static boolean lIIIlIIIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIlIIIIIlIlII(String var13, String var14) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(lllIIIIIlIII[2], var1);
            return new String(var18.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIIIIlIIlI(String var15, String var10) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var6 = var10.toCharArray();
        int var5 = lllIIIIIlIII[0];
        char[] var12 = var15.toCharArray();
        int var3 = var12.length;
        int var8 = lllIIIIIlIII[0];
        while (g.lIIIlIIIIIlIlll(var8, var3)) {
            char var16 = var12[var8];
            var9.append((char)(var16 ^ var6[var5 % var6.length]));
            0;
            ++var5;
            ++var8;
            0;
            if (3 > -1) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static void lIIIlIIIIIlIlIl() {
        lllIIIIIIlll = new String[lllIIIIIlIII[13]];
        g.lllIIIIIIlll[g.lllIIIIIlIII[0]] = g."BLADE";
        g.lllIIIIIIlll[g.lllIIIIIlIII[1]] = g."BLADE_I";
        g.lllIIIIIIlll[g.lllIIIIIlIII[2]] = g."BLADE_II";
        g.lllIIIIIIlll[g.lllIIIIIlIII[3]] = g."BLADE_III";
        g.lllIIIIIIlll[g.lllIIIIIlIII[4]] = g."BLADE_IV";
        g.lllIIIIIIlll[g.lllIIIIIlIII[5]] = g."GOLDEN_BLADE_II";
        g.lllIIIIIIlll[g.lllIIIIIlIII[6]] = g."GOLDEN_BLADE_I";
        g.lllIIIIIIlll[g.lllIIIIIlIII[7]] = g."GOLDEN_BLADE_III";
        g.lllIIIIIIlll[g.lllIIIIIlIII[8]] = g."GOLDEN_BLADE_IV";
        g.lllIIIIIIlll[g.lllIIIIIlIII[9]] = g."GOLDEN_BLADE_V";
        g.lllIIIIIIlll[g.lllIIIIIlIII[10]] = g."GOLDEN_BLADE_VI";
        g.lllIIIIIIlll[g.lllIIIIIlIII[11]] = g."BLUE_BLADE_I";
        g.lllIIIIIIlll[g.lllIIIIIlIII[12]] = g."BLUE_BLADE_II";
    }
}

