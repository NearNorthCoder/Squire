/*
 * Decompiled with CFR 0.152.
 */
package m.e.a.i.z.m.r.-.q.s.y.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.a.i.z.m.r.-.q.s.y.u.g;

class h
extends HashMap<String, Integer> {
    private static /* synthetic */ String[] lIllIIIlllIII;
    final /* synthetic */ g q;
    private static /* synthetic */ int[] lIllIIIlllIll;

    static {
        h.llIIIlIlIllIIll();
        h.llIIIlIlIllIIIl();
    }

    private static String llIIIlIlIlIlIll(String var10, String var2) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var8 = var2.toCharArray();
        int var3 = lIllIIIlllIll[0];
        char[] var11 = var10.toCharArray();
        int var7 = var11.length;
        int var16 = lIllIIIlllIll[0];
        while (h.llIIIlIlIllIlIl(var16, var7)) {
            char var13 = var11[var16];
            var17.append((char)(var13 ^ var8[var3 % var8.length]));
            0;
            ++var3;
            ++var16;
            0;
            if (-1 < (3 & ~3)) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static String llIIIlIlIlIlIII(String var6, String var19) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), lIllIIIlllIll[14]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIllIIIlllIll[3], var1);
            return new String(var5.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static void llIIIlIlIllIIll() {
        lIllIIIlllIll = new int[16];
        h.lIllIIIlllIll[0] = (0x47 ^ 0x54 ^ (0xFC ^ 0xAE)) & (5 + 98 - -61 + 40 ^ 62 + 24 - -35 + 20 ^ -1);
        h.lIllIIIlllIll[1] = 0x6B ^ 0x4C ^ (0x55 ^ 0x64);
        h.lIllIIIlllIll[2] = 1;
        h.lIllIIIlllIll[3] = 2;
        h.lIllIIIlllIll[4] = 3;
        h.lIllIIIlllIll[5] = 0xA0 ^ 0xB4;
        h.lIllIIIlllIll[6] = 0xAB ^ 0xA5 ^ (0xAE ^ 0xA4);
        h.lIllIIIlllIll[7] = 0x1D ^ 0x11 ^ (5 ^ 0x1B);
        h.lIllIIIlllIll[8] = 0xC3 ^ 0xC6;
        h.lIllIIIlllIll[9] = 0x3D ^ 0x2D;
        h.lIllIIIlllIll[10] = 0x93 ^ 0x95;
        h.lIllIIIlllIll[11] = 0x2F ^ 0xB ^ (0x7D ^ 0x57);
        h.lIllIIIlllIll[12] = 0xFF ^ 0xAE ^ (0xD8 ^ 0x8E);
        h.lIllIIIlllIll[13] = 0xAE ^ 0xA5;
        h.lIllIIIlllIll[14] = 0xF1 ^ 0x85 ^ (0xC ^ 0x70);
        h.lIllIIIlllIll[15] = 0x1F ^ 0x16;
    }

    private static void llIIIlIlIllIIIl() {
        lIllIIIlllIII = new String[lIllIIIlllIll[15]];
        h.lIllIIIlllIII[h.lIllIIIlllIll[0]] = h."Anglerfish";
        h.lIllIIIlllIII[h.lIllIIIlllIll[2]] = h."Manta ray";
        h.lIllIIIlllIII[h.lIllIIIlllIll[3]] = h."Tuna potato";
        h.lIllIIIlllIII[h.lIllIIIlllIll[4]] = h."Shark";
        h.lIllIIIlllIII[h.lIllIIIlllIll[6]] = h."Cooked karambwan";
        h.lIllIIIlllIII[h.lIllIIIlllIll[8]] = h."Monkfish";
        h.lIllIIIlllIII[h.lIllIIIlllIll[10]] = h."Chilli potato";
        h.lIllIIIlllIII[h.lIllIIIlllIll[12]] = h."Half a summer pie";
        h.lIllIIIlllIII[h.lIllIIIlllIll[14]] = h."Bones";
    }

    private static boolean llIIIlIlIllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    h(g g2) {
        this.q = g2;
        this.put(lIllIIIlllIII[lIllIIIlllIll[0]], lIllIIIlllIll[1]);
        0;
        this.put(lIllIIIlllIII[lIllIIIlllIll[2]], lIllIIIlllIll[1]);
        0;
        this.put(lIllIIIlllIII[lIllIIIlllIll[3]], lIllIIIlllIll[1]);
        0;
        this.put(lIllIIIlllIII[lIllIIIlllIll[4]], lIllIIIlllIll[5]);
        0;
        this.put(lIllIIIlllIII[lIllIIIlllIll[6]], lIllIIIlllIll[7]);
        0;
        this.put(lIllIIIlllIII[lIllIIIlllIll[8]], lIllIIIlllIll[9]);
        0;
        this.put(lIllIIIlllIII[lIllIIIlllIll[10]], lIllIIIlllIll[11]);
        0;
        this.put(lIllIIIlllIII[lIllIIIlllIll[12]], lIllIIIlllIll[13]);
        0;
        this.put(lIllIIIlllIII[lIllIIIlllIll[14]], lIllIIIlllIll[14]);
        0;
    }

    private static String llIIIlIlIlIIlll(String var4, String var15) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(lIllIIIlllIll[3], var12);
            return new String(var18.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }
}

