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

public final class AEnum
extends Enum<a> {
    public static final /* synthetic */ /* enum */ a MELEE;
    public static final /* synthetic */ /* enum */ a RANGED;
    public static final /* synthetic */ /* enum */ a MAGIC;
    private static /* synthetic */ String[] llIIlIIIIlll;
    private static final /* synthetic */ a[] $VALUES;
    private static /* synthetic */ int[] llIIlIIIlIII;
    public static final /* synthetic */ /* enum */ a MIXED;

    static {
        a.lllllIIIIlIIIl();
        a.lllllIIIIlIIII();
        MELEE = new a();
        RANGED = new a();
        MAGIC = new a();
        MIXED = new a();
        a[] aArray = new a[llIIlIIIlIII[4]];
        aArray[a.llIIlIIIlIII[0]] = MELEE;
        aArray[a.llIIlIIIlIII[1]] = RANGED;
        aArray[a.llIIlIIIlIII[2]] = MAGIC;
        aArray[a.llIIlIIIlIII[3]] = MIXED;
        $VALUES = aArray;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private static void lllllIIIIlIIII() {
        llIIlIIIIlll = new String[llIIlIIIlIII[4]];
        a.llIIlIIIIlll[a.llIIlIIIlIII[0]] = a."MELEE";
        a.llIIlIIIIlll[a.llIIlIIIlIII[1]] = a."RANGED";
        a.llIIlIIIIlll[a.llIIlIIIlIII[2]] = a."MAGIC";
        a.llIIlIIIIlll[a.llIIlIIIlIII[3]] = a."MIXED";
    }

    private static String lllllIIIIIlllI(String var7, String var16) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), llIIlIIIlIII[5]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(llIIlIIIlIII[2], var12);
            return new String(var2.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    private static String lllllIIIIIllIl(String var3, String var4) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(llIIlIIIlIII[2], var5);
            return new String(var19.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void lllllIIIIlIIIl() {
        llIIlIIIlIII = new int[6];
        a.llIIlIIIlIII[0] = (0xDD ^ 0x99 ^ (0x97 ^ 0x91)) & (4 + 2 - -239 + 8 ^ 45 + 140 - 7 + 13 ^ -1);
        a.llIIlIIIlIII[1] = 1;
        a.llIIlIIIlIII[2] = 2;
        a.llIIlIIIlIII[3] = 3;
        a.llIIlIIIlIII[4] = 0xA1 ^ 0xBF ^ (0x3E ^ 0x24);
        a.llIIlIIIlIII[5] = 5 ^ 0xD;
    }

    private static String lllllIIIIIllll(String var17, String var8) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var14 = var8.toCharArray();
        int var15 = llIIlIIIlIII[0];
        char[] var13 = var17.toCharArray();
        int var9 = var13.length;
        int var6 = llIIlIIIlIII[0];
        while (a.lllllIIIIlIIlI(var6, var9)) {
            char var1 = var13[var6];
            var11.append((char)(var1 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var6;
            0;
            if ((0x24 ^ 0x20) >= (0x8F ^ 0x8B)) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static boolean lllllIIIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }
}

