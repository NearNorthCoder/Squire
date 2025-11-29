/*
 * Decompiled with CFR 0.152.
 */
package g.r.r.-.t.q.i.u.o.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class CEnum
extends Enum<c> {
    private static /* synthetic */ String[] llIlIIIIIllI;
    public static final /* synthetic */ /* enum */ c OUTSIDE;
    private static final /* synthetic */ c[] $VALUES;
    private static /* synthetic */ int[] llIlIIIIlIIl;
    public static final /* synthetic */ /* enum */ c ACTIVE;
    public static final /* synthetic */ /* enum */ c FINISHING;
    public static final /* synthetic */ /* enum */ c COUNTDOWN;
    public static final /* synthetic */ /* enum */ c ACTIVATING;

    private static boolean lIIIIIIIIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIIIIIIIllIlI(String var6, String var4) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var13 = var4.toCharArray();
        int var5 = llIlIIIIlIIl[0];
        char[] var2 = var6.toCharArray();
        int var3 = var2.length;
        int var10 = llIlIIIIlIIl[0];
        while (c.lIIIIIIIIlIIllI(var10, var3)) {
            char var9 = var2[var10];
            var14.append((char)(var9 ^ var13[var5 % var13.length]));
            0;
            ++var5;
            ++var10;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    static {
        c.lIIIIIIIIlIIlIl();
        c.lIIIIIIIIlIIlII();
        ACTIVATING = new c();
        COUNTDOWN = new c();
        ACTIVE = new c();
        FINISHING = new c();
        OUTSIDE = new c();
        c[] cArray = new c[llIlIIIIlIIl[5]];
        cArray[c.llIlIIIIlIIl[0]] = ACTIVATING;
        cArray[c.llIlIIIIlIIl[1]] = COUNTDOWN;
        cArray[c.llIlIIIIlIIl[2]] = ACTIVE;
        cArray[c.llIlIIIIlIIl[3]] = FINISHING;
        cArray[c.llIlIIIIlIIl[4]] = OUTSIDE;
        $VALUES = cArray;
    }

    private static void lIIIIIIIIlIIlIl() {
        llIlIIIIlIIl = new int[6];
        c.llIlIIIIlIIl[0] = (0x57 ^ 0x18) & ~(0x37 ^ 0x78);
        c.llIlIIIIlIIl[1] = 1;
        c.llIlIIIIlIIl[2] = 2;
        c.llIlIIIIlIIl[3] = 3;
        c.llIlIIIIlIIl[4] = 4 ^ 0x28 ^ (0x35 ^ 0x1D);
        c.llIlIIIIlIIl[5] = 0xC0 ^ 0xC5;
    }

    private static String lIIIIIIIIIllIll(String var8, String var11) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(llIlIIIIlIIl[2], var12);
            return new String(var7.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public String toString() {
        String string = super.toString();
        return string.charAt(llIlIIIIlIIl[0]) + string.substring(llIlIIIIlIIl[1]).toLowerCase();
    }

    private static void lIIIIIIIIlIIlII() {
        llIlIIIIIllI = new String[llIlIIIIlIIl[5]];
        c.llIlIIIIIllI[c.llIlIIIIlIIl[0]] = c."ACTIVATING";
        c.llIlIIIIIllI[c.llIlIIIIlIIl[1]] = c."COUNTDOWN";
        c.llIlIIIIIllI[c.llIlIIIIlIIl[2]] = c."ACTIVE";
        c.llIlIIIIIllI[c.llIlIIIIlIIl[3]] = c."FINISHING";
        c.llIlIIIIIllI[c.llIlIIIIlIIl[4]] = c."OUTSIDE";
    }
}

