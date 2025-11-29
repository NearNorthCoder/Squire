/*
 * Decompiled with CFR 0.152.
 */
package o.m.-.g.q.i.l.i.r.y.o.e.x.u.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class FEnum
extends Enum<f> {
    private static final /* synthetic */ f[] $VALUES;
    public static final /* synthetic */ /* enum */ f SINGLE_ORDER;
    private static /* synthetic */ String[] lIIIIIIIIIlll;
    public static final /* synthetic */ /* enum */ f MULTI_ORDER;
    private static /* synthetic */ int[] lIIIIIIIIlIII;

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    private static void lIIlIllIIlIIlIl() {
        lIIIIIIIIIlll = new String[lIIIIIIIIlIII[2]];
        f.lIIIIIIIIIlll[f.lIIIIIIIIlIII[0]] = f."SINGLE_ORDER";
        f.lIIIIIIIIIlll[f.lIIIIIIIIlIII[1]] = f."MULTI_ORDER";
    }

    private static boolean lIIlIllIIlIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIllIIlIIlII(String var14, String var4) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIIIIIIIIlIII[3]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lIIIIIIIIlIII[2], var1);
            return new String(var13.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String lIIlIllIIlIIIll(String var9, String var5) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var2 = var5.toCharArray();
        int var6 = lIIIIIIIIlIII[0];
        char[] var11 = var9.toCharArray();
        int var3 = var11.length;
        int var12 = lIIIIIIIIlIII[0];
        while (f.lIIlIllIIlIIlll(var12, var3)) {
            char var7 = var11[var12];
            var8.append((char)(var7 ^ var2[var6 % var2.length]));
            0;
            ++var6;
            ++var12;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static void lIIlIllIIlIIllI() {
        lIIIIIIIIlIII = new int[4];
        f.lIIIIIIIIlIII[0] = (0xF6 ^ 0xBE ^ (0xE0 ^ 0x89)) & (0xAD ^ 0x84 ^ (0x8F ^ 0x87) ^ -1);
        f.lIIIIIIIIlIII[1] = 1;
        f.lIIIIIIIIlIII[2] = 2;
        f.lIIIIIIIIlIII[3] = 0x30 ^ 0x38;
    }

    static {
        f.lIIlIllIIlIIllI();
        f.lIIlIllIIlIIlIl();
        SINGLE_ORDER = new f();
        MULTI_ORDER = new f();
        f[] fArray = new f[lIIIIIIIIlIII[2]];
        fArray[f.lIIIIIIIIlIII[0]] = SINGLE_ORDER;
        fArray[f.lIIIIIIIIlIII[1]] = MULTI_ORDER;
        $VALUES = fArray;
    }
}

