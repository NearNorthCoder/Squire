/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class MEnum
extends Enum<m> {
    public static final /* synthetic */ /* enum */ m UNOWNED;
    public static final /* synthetic */ /* enum */ m OFF;
    private static final /* synthetic */ m[] $VALUES;
    private static /* synthetic */ int[] llIIIIllIlll;
    public static final /* synthetic */ /* enum */ m ON;
    private static /* synthetic */ String[] llIIIIllIlII;

    private static boolean llllIIllIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llllIIllIIlIIl(String var3, String var16) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(llIIIIllIlll[2], var4);
            return new String(var9.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

    private static String llllIIllIIlIlI(String var1, String var15) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), llIIIIllIlll[4]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(llIIIIllIlll[2], var18);
            return new String(var2.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    static {
        m.llllIIllIlIIIl();
        m.llllIIllIIllII();
        UNOWNED = new m();
        OFF = new m();
        ON = new m();
        m[] mArray = new m[llIIIIllIlll[3]];
        mArray[m.llIIIIllIlll[0]] = UNOWNED;
        mArray[m.llIIIIllIlll[1]] = OFF;
        mArray[m.llIIIIllIlll[2]] = ON;
        $VALUES = mArray;
    }

    private static void llllIIllIlIIIl() {
        llIIIIllIlll = new int[5];
        m.llIIIIllIlll[0] = (0x8E ^ 0x81) & ~(0x21 ^ 0x2E);
        m.llIIIIllIlll[1] = 1;
        m.llIIIIllIlll[2] = 2;
        m.llIIIIllIlll[3] = 3;
        m.llIIIIllIlll[4] = 0x84 ^ 0x8C;
    }

    private static void llllIIllIIllII() {
        llIIIIllIlII = new String[llIIIIllIlll[3]];
        m.llIIIIllIlII[m.llIIIIllIlll[0]] = m."UNOWNED";
        m.llIIIIllIlII[m.llIIIIllIlll[1]] = m."OFF";
        m.llIIIIllIlII[m.llIIIIllIlll[2]] = m."ON";
    }

    private static String llllIIllIIlIll(String var14, String var8) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var5 = llIIIIllIlll[0];
        char[] var11 = var14.toCharArray();
        int var17 = var11.length;
        int var13 = llIIIIllIlll[0];
        while (m.llllIIllIlIIlI(var13, var17)) {
            char var7 = var11[var13];
            var12.append((char)(var7 ^ var10[var5 % var10.length]));
            0;
            ++var5;
            ++var13;
            0;
            
            return null;
        }
        return String.valueOf(var12);
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }
}

