/*
 * Decompiled with CFR 0.152.
 */
package -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class d {
    private static /* synthetic */ String[] lIllIIIIIIIll;
    private static /* synthetic */ int[] lIllIIIIIIlII;

    private static void llIIIIllllIIlll() {
        lIllIIIIIIIll = new String[lIllIIIIIIlII[7]];
        d.lIllIIIIIIIll[d.lIllIIIIIIlII[1]] = d."%,d";
        d.lIllIIIIIIIll[d.lIllIIIIIIlII[2]] = d."%,dK";
        d.lIllIIIIIIIll[d.lIllIIIIIIlII[5]] = d."%,dM";
    }

    public static String a(double d2) {
        return d.a((int)d2);
    }

    static {
        d.llIIIIllllIlIII();
        d.llIIIIllllIIlll();
    }

    public static String a(int n2) {
        int var4;
        if (d.llIIIIllllIlIIl(n2, lIllIIIIIIlII[0])) {
            Object[] objectArray = new Object[lIllIIIIIIlII[2]];
            objectArray[d.lIllIIIIIIlII[1]] = n2;
            return String.format(lIllIIIIIIIll[lIllIIIIIIlII[1]], objectArray);
        }
        if (d.llIIIIllllIlIIl(var4, lIllIIIIIIlII[3])) {
            Object[] objectArray = new Object[lIllIIIIIIlII[2]];
            objectArray[d.lIllIIIIIIlII[1]] = var4 / lIllIIIIIIlII[4];
            return String.format(lIllIIIIIIIll[lIllIIIIIIlII[2]], objectArray);
        }
        Object[] objectArray = new Object[lIllIIIIIIlII[2]];
        objectArray[d.lIllIIIIIIlII[1]] = n2 / lIllIIIIIIlII[6];
        return String.format(lIllIIIIIIIll[lIllIIIIIIlII[5]], objectArray);
    }

    private static String llIIIIllllIIlIl(String var12, String var1) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIllIIIIIIlII[5], var14);
            return new String(var6.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static void llIIIIllllIlIII() {
        lIllIIIIIIlII = new int[8];
        d.lIllIIIIIIlII[0] = 0xFFFFCEE6 & 0x1B7B9;
        d.lIllIIIIIIlII[1] = (23 + 104 - 97 + 126 ^ 29 + 61 - 21 + 66) & (0x7A ^ 0x30 ^ (0xE6 ^ 0xB7) ^ -1);
        d.lIllIIIIIIlII[2] = 1;
        d.lIllIIIIIIlII[3] = 0xFFFFB7ED & 0x98DE92;
        d.lIllIIIIIIlII[4] = 0xFFFF83FA & 0x7FED;
        d.lIllIIIIIIlII[5] = 2;
        d.lIllIIIIIIlII[6] = -(0xFFFFEFAF & 0x19F3) & (0xFFFFFBEB & 0xF4FF6);
        d.lIllIIIIIIlII[7] = 3;
    }

    private static boolean llIIIIllllIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIIllllIIllI(String var10, String var8) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var9 = var8.toCharArray();
        int var5 = lIllIIIIIIlII[1];
        char[] var13 = var10.toCharArray();
        int var15 = var13.length;
        int var3 = lIllIIIIIIlII[1];
        while (d.llIIIIllllIlIIl(var3, var15)) {
            char var7 = var13[var3];
            var11.append((char)(var7 ^ var9[var5 % var9.length]));
            0;
            ++var5;
            ++var3;
            0;
            if (-(2 ^ 5 ^ 2) < 0) continue;
            return null;
        }
        return String.valueOf(var11);
    }
}

