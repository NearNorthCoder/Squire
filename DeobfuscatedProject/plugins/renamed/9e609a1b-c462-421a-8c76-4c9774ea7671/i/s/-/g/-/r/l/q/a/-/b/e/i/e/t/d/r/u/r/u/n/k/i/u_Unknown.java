/*
 * Decompiled with CFR 0.152.
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class u_Unknown
extends HashMap<Integer, String> {
    private static /* synthetic */ String[] lIIlIIIIlIIII;
    private static /* synthetic */ int[] lIIlIIIIlIIIl;

    private static String lIlIIllllIlIIII(String var12, String var6) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIIlIIIIlIIIl[6]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lIIlIIIIlIIIl[2], var13);
            return new String(var11.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static String lIlIIllllIlIIIl(String var10, String var14) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var2 = var14.toCharArray();
        int var15 = lIIlIIIIlIIIl[0];
        char[] var5 = var10.toCharArray();
        int var18 = var5.length;
        int var9 = lIIlIIIIlIIIl[0];
        while (u.lIlIIllllIlIlIl(var9, var18)) {
            char var16 = var5[var9];
            var19.append((char)(var16 ^ var2[var15 % var2.length]));
            0;
            ++var15;
            ++var9;
            0;
            if (((95 + 116 - 179 + 169 ^ 65 + 107 - 139 + 102) & (48 + 65 - 53 + 193 ^ 80 + 4 - 27 + 122 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private static void lIlIIllllIlIlII() {
        lIIlIIIIlIIIl = new int[7];
        u.lIIlIIIIlIIIl[0] = 2 & ~2;
        u.lIIlIIIIlIIIl[1] = 1;
        u.lIIlIIIIlIIIl[2] = 2;
        u.lIIlIIIIlIIIl[3] = 3;
        u.lIIlIIIIlIIIl[4] = 0x25 ^ 0x21;
        u.lIIlIIIIlIIIl[5] = 0x9D ^ 0x98;
        u.lIIlIIIIlIIIl[6] = (0x50 ^ 0xF) & ~(0xC0 ^ 0x9F) ^ (0x94 ^ 0x9C);
    }

    private static void lIlIIllllIlIIll() {
        lIIlIIIIlIIII = new String[lIIlIIIIlIIIl[5]];
        u.lIIlIIIIlIIII[u.lIIlIIIIlIIIl[0]] = u."Carlem";
        u.lIIlIIIIlIIII[u.lIIlIIIIlIIIl[1]] = u."Aber";
        u.lIIlIIIIlIIII[u.lIIlIIIIlIIIl[2]] = u."Camerinthum";
        u.lIIlIIIIlIIII[u.lIIlIIIIlIIIl[3]] = u."Purchai";
        u.lIIlIIIIlIIII[u.lIIlIIIIlIIIl[4]] = u."Gabindo";
    }

    private static boolean lIlIIllllIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    u() {
        this.put(lIIlIIIIlIIIl[0], lIIlIIIIlIIII[lIIlIIIIlIIIl[0]]);
        0;
        this.put(lIIlIIIIlIIIl[1], lIIlIIIIlIIII[lIIlIIIIlIIIl[1]]);
        0;
        this.put(lIIlIIIIlIIIl[2], lIIlIIIIlIIII[lIIlIIIIlIIIl[2]]);
        0;
        this.put(lIIlIIIIlIIIl[3], lIIlIIIIlIIII[lIIlIIIIlIIIl[3]]);
        0;
        this.put(lIIlIIIIlIIIl[4], lIIlIIIIlIIII[lIIlIIIIlIIIl[4]]);
        0;
    }

    static {
        u.lIlIIllllIlIlII();
        u.lIlIIllllIlIIll();
    }

    private static String lIlIIllllIlIIlI(String var3, String var4) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIIlIIIIlIIIl[2], var1);
            return new String(var8.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }
}

