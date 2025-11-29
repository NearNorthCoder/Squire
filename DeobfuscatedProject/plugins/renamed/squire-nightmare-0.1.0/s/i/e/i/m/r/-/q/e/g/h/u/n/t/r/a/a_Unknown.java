/*
 * Decompiled with CFR 0.152.
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class a_Unknown
extends HashMap<Integer, String> {
    private static /* synthetic */ int[] lllIllIlIIII;
    private static /* synthetic */ String[] lllIllIIllll;

    private static String lIIIllIlIIIlIII(String var18, String var17) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lllIllIlIIII[5], var10);
            return new String(var3.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    public a() {
        this.put(lllIllIlIIII[0], lllIllIIllll[lllIllIlIIII[1]]);
        0;
        this.put(lllIllIlIIII[2], lllIllIIllll[lllIllIlIIII[3]]);
        0;
        this.put(lllIllIlIIII[4], lllIllIIllll[lllIllIlIIII[5]]);
        0;
        this.put(lllIllIlIIII[6], lllIllIIllll[lllIllIlIIII[7]]);
        0;
        this.put(lllIllIlIIII[8], lllIllIIllll[lllIllIlIIII[9]]);
        0;
        this.put(lllIllIlIIII[10], lllIllIIllll[lllIllIlIIII[11]]);
        0;
        this.put(lllIllIlIIII[12], lllIllIIllll[lllIllIlIIII[13]]);
        0;
        this.put(lllIllIlIIII[14], lllIllIIllll[lllIllIlIIII[15]]);
        0;
        this.put(lllIllIlIIII[16], lllIllIIllll[lllIllIlIIII[17]]);
        0;
        this.put(lllIllIlIIII[18], lllIllIIllll[lllIllIlIIII[19]]);
        0;
        this.put(lllIllIlIIII[20], lllIllIIllll[lllIllIlIIII[21]]);
        0;
        this.put(lllIllIlIIII[22], lllIllIIllll[lllIllIlIIII[23]]);
        0;
    }

    private static boolean lIIIllIlIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIllIlIIIlIlI() {
        lllIllIIllll = new String[lllIllIlIIII[24]];
        a.lllIllIIllll[a.lllIllIlIIII[1]] = a."Southwest";
        a.lllIllIIllll[a.lllIllIlIIII[3]] = a."Southeast";
        a.lllIllIIllll[a.lllIllIlIIII[5]] = a."Northeast";
        a.lllIllIIllll[a.lllIllIlIIII[7]] = a."Northwest";
        a.lllIllIIllll[a.lllIllIlIIII[9]] = a."Southwest";
        a.lllIllIIllll[a.lllIllIlIIII[11]] = a."Southeast";
        a.lllIllIIllll[a.lllIllIlIIII[13]] = a."Northeast";
        a.lllIllIIllll[a.lllIllIlIIII[15]] = a."Northwest";
        a.lllIllIIllll[a.lllIllIlIIII[17]] = a."Southwest";
        a.lllIllIIllll[a.lllIllIlIIII[19]] = a."Southeast";
        a.lllIllIIllll[a.lllIllIlIIII[21]] = a."Northeast";
        a.lllIllIIllll[a.lllIllIlIIII[23]] = a."Northwest";
    }

    private static void lIIIllIlIIIlIll() {
        lllIllIlIIII = new int[25];
        a.lllIllIlIIII[0] = -(0xFFFFD8D5 & 0x7F2E) & (0xFFFFFDFF & 0x7EDF);
        a.lllIllIlIIII[1] = (0x90 ^ 0x88 ^ (0xE8 ^ 0xBF)) & (0xB0 ^ 0x9B ^ (0xDF ^ 0xBB) ^ -1);
        a.lllIllIlIIII[2] = -(0xFFFF8D3B & 0x73E5) & (0xFFFFB7FF & 0x6DFF);
        a.lllIllIlIIII[3] = 1;
        a.lllIllIlIIII[4] = -(0xFFFFC27E & 0x7F9B) & (0xFFFFE6FF & 0x7FFB);
        a.lllIllIlIIII[5] = 2;
        a.lllIllIlIIII[6] = -1 & (0xFFFFB4FF & 0x6FE5);
        a.lllIllIlIIII[7] = 3;
        a.lllIllIlIIII[8] = 0xFFFFE4FB & 0x3FDF;
        a.lllIllIlIIII[9] = 0x2E ^ 0x31 ^ (0x4C ^ 0x57);
        a.lllIllIlIIII[10] = 0xFFFFF6DE & 0x2DFF;
        a.lllIllIlIIII[11] = 2 ^ (0x67 ^ 0x60);
        a.lllIllIlIIII[12] = 0xFFFFA4F9 & 0x7FE7;
        a.lllIllIlIIII[13] = 0xF ^ 9;
        a.lllIllIlIIII[14] = 0xFFFFF6EE & 0x2DF5;
        a.lllIllIlIIII[15] = 0xD8 ^ 0xC1 ^ (0x63 ^ 0x7D);
        a.lllIllIlIIII[16] = 0xFFFFFEDE & 0x25FB;
        a.lllIllIlIIII[17] = 0x5C ^ 0x54;
        a.lllIllIlIIII[18] = -(0xFFFFDBB7 & 0x6E6B) & (0xFFFFFEFF & 0x6FFF);
        a.lllIllIlIIII[19] = 0x1F ^ 9 ^ (0xBC ^ 0xA3);
        a.lllIllIlIIII[20] = -(0xFFFF9B6F & 0x6D96) & (0xFFFFFDF7 & 0x2FED);
        a.lllIllIlIIII[21] = 0xC8 ^ 0xAD ^ (0x51 ^ 0x3E);
        a.lllIllIlIIII[22] = 0xFFFFB6E7 & 0x6DFB;
        a.lllIllIlIIII[23] = 0xD0 ^ 0x85 ^ (0x62 ^ 0x3C);
        a.lllIllIlIIII[24] = 0x85 ^ 0x9E ^ (0x2F ^ 0x38);
    }

    private static String lIIIllIlIIIIlll(String var4, String var8) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lllIllIlIIII[17]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lllIllIlIIII[5], var16);
            return new String(var2.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    static {
        a.lIIIllIlIIIlIll();
        a.lIIIllIlIIIlIlI();
    }

    private static String lIIIllIlIIIlIIl(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var19 = var13.toCharArray();
        int var14 = lllIllIlIIII[1];
        char[] var5 = var12.toCharArray();
        int var15 = var5.length;
        int var7 = lllIllIlIIII[1];
        while (a.lIIIllIlIIIllII(var7, var15)) {
            char var9 = var5[var7];
            var11.append((char)(var9 ^ var19[var14 % var19.length]));
            0;
            ++var14;
            ++var7;
            0;
            if ((47 + 117 - 27 + 39 ^ 162 + 143 - 153 + 28) != -1) continue;
            return null;
        }
        return String.valueOf(var11);
    }
}

