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

public final class d
extends Enum<d> {
    private static final /* synthetic */ d[] $VALUES;
    public static final /* synthetic */ /* enum */ d SPECIAL_2;
    public static final /* synthetic */ /* enum */ d SPECIAL_1;
    private static /* synthetic */ int[] lIIlllllIlIII;
    public static final /* synthetic */ /* enum */ d NONE;
    private static /* synthetic */ String[] lIIlllllIIlll;

    private static String lIllIlIlIIIlIll(String var14, String var9) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var6 = var9.toCharArray();
        int var1 = lIIlllllIlIII[0];
        char[] var3 = var14.toCharArray();
        int var13 = var3.length;
        int var12 = lIIlllllIlIII[0];
        while (d.lIllIlIlIIIlllI(var12, var13)) {
            char var11 = var3[var12];
            var7.append((char)(var11 ^ var6[var1 % var6.length]));
            0;
            ++var1;
            ++var12;
            0;
            if (((0x29 ^ 0x36) & ~(0xBD ^ 0xA2)) < (0x45 ^ 0x41)) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static void lIllIlIlIIIllIl() {
        lIIlllllIlIII = new int[5];
        d.lIIlllllIlIII[0] = (0x63 ^ 0x7B) & ~(0x68 ^ 0x70);
        d.lIIlllllIlIII[1] = 1;
        d.lIIlllllIlIII[2] = 2;
        d.lIIlllllIlIII[3] = 3;
        d.lIIlllllIlIII[4] = 0x92 ^ 0x89 ^ (0xA7 ^ 0xB4);
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static void lIllIlIlIIIllII() {
        lIIlllllIIlll = new String[lIIlllllIlIII[3]];
        d.lIIlllllIIlll[d.lIIlllllIlIII[0]] = d."SPECIAL_1";
        d.lIIlllllIIlll[d.lIIlllllIlIII[1]] = d."SPECIAL_2";
        d.lIIlllllIIlll[d.lIIlllllIlIII[2]] = d."NONE";
    }

    private static boolean lIllIlIlIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIlIlIIIlIlI(String var2, String var8) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIIlllllIlIII[4]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIIlllllIlIII[2], var4);
            return new String(var5.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    static {
        d.lIllIlIlIIIllIl();
        d.lIllIlIlIIIllII();
        SPECIAL_1 = new d();
        SPECIAL_2 = new d();
        NONE = new d();
        d[] dArray = new d[lIIlllllIlIII[3]];
        dArray[d.lIIlllllIlIII[0]] = SPECIAL_1;
        dArray[d.lIIlllllIlIII[1]] = SPECIAL_2;
        dArray[d.lIIlllllIlIII[2]] = NONE;
        $VALUES = dArray;
    }
}

