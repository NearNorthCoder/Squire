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

    private static String llllIllIlIlIIl(String var18, String var11) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var15 = var11.toCharArray();
        int var2 = llIIIlllIIII[0];
        char[] var16 = var18.toCharArray();
        int var19 = var16.length;
        int var6 = llIIIlllIIII[0];
        while (d.llllIllIlIlllI(var6, var19)) {
            char var7 = var16[var6];
            var4.append((char)(var7 ^ var15[var2 % var15.length]));
            0;
            ++var2;
            ++var6;
            0;
            
            return null;
        }
        return String.valueOf(var4);
    }

    private static String llllIllIlIlIll(String var5, String var10) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(llIIIlllIIII[2], var13);
            return new String(var12.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static void llllIllIlIllIl() {
        llIIIlllIIII = new int[7];
        d.llIIIlllIIII[0] = (0x27 ^ 0x13) & ~(0x11 ^ 0x25);
        d.llIIIlllIIII[1] = 1;
        d.llIIIlllIIII[2] = 2;
        d.llIIIlllIIII[3] = 3;
        d.llIIIlllIIII[4] = 0xB3 ^ 0xB7;
        d.llIIIlllIIII[5] = 0x1B ^ 0x62 ^ (0xC5 ^ 0xB9);
        d.llIIIlllIIII[6] = 39 + 67 - 104 + 126 ^ 48 + 9 - 11 + 90;
    }

    private static void llllIllIlIllII() {
        llIIIllIllll = new String[llIIIlllIIII[5]];
        d.llIIIllIllll[d.llIIIlllIIII[0]] = d."VERY_LOW";
        d.llIIIllIllll[d.llIIIlllIIII[1]] = d."LOW";
        d.llIIIllIllll[d.llIIIlllIIII[2]] = d."MEDIUM";
        d.llIIIllIllll[d.llIIIlllIIII[3]] = d."HIGH";
        d.llIIIllIllll[d.llIIIlllIIII[4]] = d."VERY_HIGH";
    }

    private static String llllIllIlIlIlI(String var9, String var8) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), llIIIlllIIII[6]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(llIIIlllIIII[2], var14);
            return new String(var3.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
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

