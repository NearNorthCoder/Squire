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
        c.lIlIIIIIlIIll[c.lIlIIIIIlIlII[0]] = c."NONE";
        c.lIlIIIIIlIIll[c.lIlIIIIIlIlII[1]] = c."MELEE_1";
        c.lIlIIIIIlIIll[c.lIlIIIIIlIlII[2]] = c."MELEE_2";
        c.lIlIIIIIlIIll[c.lIlIIIIIlIlII[3]] = c."RANGE_1";
        c.lIlIIIIIlIIll[c.lIlIIIIIlIlII[4]] = c."RANGE_2";
        c.lIlIIIIIlIIll[c.lIlIIIIIlIlII[5]] = c."MAGE";
    }

    private static void lIllIllIIIllIIl() {
        lIlIIIIIlIlII = new int[8];
        c.lIlIIIIIlIlII[0] = (0x17 ^ 0x47) & ~(0xE ^ 0x5E);
        c.lIlIIIIIlIlII[1] = 1;
        c.lIlIIIIIlIlII[2] = 2;
        c.lIlIIIIIlIlII[3] = 3;
        c.lIlIIIIIlIlII[4] = 0xB0 ^ 0xB4;
        c.lIlIIIIIlIlII[5] = 0x22 ^ 0x27;
        c.lIlIIIIIlIlII[6] = 0xF4 ^ 0xA9 ^ (0x5C ^ 7);
        c.lIlIIIIIlIlII[7] = 0x58 ^ 0x44 ^ (0x73 ^ 0x67);
    }

    private static String lIllIllIIIlIlIl(String var17, String var2) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIlIIIIIlIlII[2], var8);
            return new String(var7.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIllIIIlIllI(String var11, String var15) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var5 = var15.toCharArray();
        int var13 = lIlIIIIIlIlII[0];
        char[] var3 = var11.toCharArray();
        int var9 = var3.length;
        int var10 = lIlIIIIIlIlII[0];
        while (c.lIllIllIIIllIlI(var10, var9)) {
            char var19 = var3[var10];
            var18.append((char)(var19 ^ var5[var13 % var5.length]));
            0;
            ++var13;
            ++var10;
            0;
            if ((0x33 ^ 0x37) > 2) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static String lIllIllIIIlIlll(String var1, String var6) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIlII[7]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lIlIIIIIlIlII[2], var4);
            return new String(var16.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }
}

