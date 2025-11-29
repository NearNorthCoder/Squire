/*
 * Decompiled with CFR 0.152.
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import q.s.r.i.e.s.o.u.a.d.n.-.b.g;

class h
extends HashMap<String, Integer> {
    final /* synthetic */ g w;
    private static /* synthetic */ String[] llIllllllll;
    private static /* synthetic */ int[] lllIIIIIIll;

    private static boolean lIlIllIIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        h.lIlIllIIllIIIl();
        h.lIlIllIIlIllIl();
    }

    private static String lIlIllIIlIIIll(String var7, String var9) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lllIIIIIIll[14]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lllIIIIIIll[3], var10);
            return new String(var16.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIIlIlIIl(String var15, String var12) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lllIIIIIIll[3], var3);
            return new String(var8.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIIllIIIl() {
        lllIIIIIIll = new int[17];
        h.lllIIIIIIll[0] = (0x28 ^ 0x1E ^ (2 ^ 0x1F)) & (0xD8 ^ 0x9E ^ (0xD0 ^ 0xBD) ^ -1);
        h.lllIIIIIIll[1] = 0x1D ^ 0xB;
        h.lllIIIIIIll[2] = 1;
        h.lllIIIIIIll[3] = 2;
        h.lllIIIIIIll[4] = 3;
        h.lllIIIIIIll[5] = 0xAC ^ 0xB8;
        h.lllIIIIIIll[6] = 6 ^ 2;
        h.lllIIIIIIll[7] = 7 ^ 0x15;
        h.lllIIIIIIll[8] = 0x17 ^ 0x6D ^ 18 + 100 - 55 + 64;
        h.lllIIIIIIll[9] = 91 + 54 - 27 + 29 ^ 96 + 40 - 66 + 61;
        h.lllIIIIIIll[10] = 0xB2 ^ 0xB4;
        h.lllIIIIIIll[11] = 0x21 ^ 0x2F;
        h.lllIIIIIIll[12] = 0x9C ^ 0x9B;
        h.lllIIIIIIll[13] = 0x2A ^ 0x21;
        h.lllIIIIIIll[14] = 0xBF ^ 0xB7;
        h.lllIIIIIIll[15] = 0x73 ^ 0x7A;
        h.lllIIIIIIll[16] = 0xCB ^ 0xC1;
    }

    private static void lIlIllIIlIllIl() {
        llIllllllll = new String[lllIIIIIIll[16]];
        h.llIllllllll[h.lllIIIIIIll[0]] = h."Anglerfish";
        h.llIllllllll[h.lllIIIIIIll[2]] = h."Manta ray";
        h.llIllllllll[h.lllIIIIIIll[3]] = h."Summer pie";
        h.llIllllllll[h.lllIIIIIIll[4]] = h."Shark";
        h.llIllllllll[h.lllIIIIIIll[6]] = h."Cooked karambwan";
        h.llIllllllll[h.lllIIIIIIll[8]] = h."Monkfish";
        h.llIllllllll[h.lllIIIIIIll[10]] = h."Chilli potato";
        h.llIllllllll[h.lllIIIIIIll[12]] = h."Half a summer pie";
        h.llIllllllll[h.lllIIIIIIll[14]] = h."Peach";
        h.llIllllllll[h.lllIIIIIIll[15]] = h."Bones";
    }

    private static String lIlIllIIlIIIlI(String var13, String var11) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var4 = var11.toCharArray();
        int var14 = lllIIIIIIll[0];
        char[] var17 = var13.toCharArray();
        int var1 = var17.length;
        int var18 = lllIIIIIIll[0];
        while (h.lIlIllIIllIIlI(var18, var1)) {
            char var19 = var17[var18];
            var5.append((char)(var19 ^ var4[var14 % var4.length]));
            0;
            ++var14;
            ++var18;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    h(g g2) {
        this.w = g2;
        this.put(llIllllllll[lllIIIIIIll[0]], lllIIIIIIll[1]);
        0;
        this.put(llIllllllll[lllIIIIIIll[2]], lllIIIIIIll[1]);
        0;
        this.put(llIllllllll[lllIIIIIIll[3]], lllIIIIIIll[1]);
        0;
        this.put(llIllllllll[lllIIIIIIll[4]], lllIIIIIIll[5]);
        0;
        this.put(llIllllllll[lllIIIIIIll[6]], lllIIIIIIll[7]);
        0;
        this.put(llIllllllll[lllIIIIIIll[8]], lllIIIIIIll[9]);
        0;
        this.put(llIllllllll[lllIIIIIIll[10]], lllIIIIIIll[11]);
        0;
        this.put(llIllllllll[lllIIIIIIll[12]], lllIIIIIIll[13]);
        0;
        this.put(llIllllllll[lllIIIIIIll[14]], lllIIIIIIll[14]);
        0;
        this.put(llIllllllll[lllIIIIIIll[15]], lllIIIIIIll[14]);
        0;
    }
}

