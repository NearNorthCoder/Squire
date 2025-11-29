/*
 * Decompiled with CFR 0.152.
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class B_Unknown
extends HashMap<Integer, String> {
    private static /* synthetic */ int[] lIIIIIlIIII;
    private static /* synthetic */ String[] lIIIIIIllll;

    B() {
        this.put(lIIIIIlIIII[0], lIIIIIIllll[lIIIIIlIIII[0]]);
        0;
        this.put(lIIIIIlIIII[1], lIIIIIIllll[lIIIIIlIIII[1]]);
        0;
        this.put(lIIIIIlIIII[2], lIIIIIIllll[lIIIIIlIIII[2]]);
        0;
        this.put(lIIIIIlIIII[3], lIIIIIIllll[lIIIIIlIIII[3]]);
        0;
        this.put(lIIIIIlIIII[4], lIIIIIIllll[lIIIIIlIIII[4]]);
        0;
    }

    private static void llIlllIIlllIl() {
        lIIIIIlIIII = new int[7];
        B.lIIIIIlIIII[0] = (0x44 ^ 0x5B) & ~(0x37 ^ 0x28);
        B.lIIIIIlIIII[1] = 1;
        B.lIIIIIlIIII[2] = 2;
        B.lIIIIIlIIII[3] = 3;
        B.lIIIIIlIIII[4] = 0x66 ^ 0x3C ^ (0xCD ^ 0x93);
        B.lIIIIIlIIII[5] = 113 + 65 - 125 + 76 ^ 28 + 34 - -29 + 41;
        B.lIIIIIlIIII[6] = 0x9B ^ 0x93;
    }

    private static String llIlllIIllIIl(String var15, String var7) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var12 = lIIIIIlIIII[0];
        char[] var4 = var15.toCharArray();
        int var18 = var4.length;
        int var1 = lIIIIIlIIII[0];
        while (B.llIlllIIllllI(var1, var18)) {
            char var11 = var4[var1];
            var17.append((char)(var11 ^ var9[var12 % var9.length]));
            0;
            ++var12;
            ++var1;
            0;
            if ((3 & ~3) == 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static String llIlllIIllIll(String var3, String var19) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIIIIIlIIII[2], var8);
            return new String(var2.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static void llIlllIIlllII() {
        lIIIIIIllll = new String[lIIIIIlIIII[5]];
        B.lIIIIIIllll[B.lIIIIIlIIII[0]] = B."Carlem";
        B.lIIIIIIllll[B.lIIIIIlIIII[1]] = B."Aber";
        B.lIIIIIIllll[B.lIIIIIlIIII[2]] = B."Camerinthum";
        B.lIIIIIIllll[B.lIIIIIlIIII[3]] = B."Purchai";
        B.lIIIIIIllll[B.lIIIIIlIIII[4]] = B."Gabindo";
    }

    static {
        B.llIlllIIlllIl();
        B.llIlllIIlllII();
    }

    private static boolean llIlllIIllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIlllIIllIlI(String var16, String var10) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lIIIIIlIIII[6]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIIIIIlIIII[2], var13);
            return new String(var5.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }
}

