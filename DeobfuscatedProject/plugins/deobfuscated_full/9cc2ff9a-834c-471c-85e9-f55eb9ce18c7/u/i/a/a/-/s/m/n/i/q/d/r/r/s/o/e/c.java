/*
 * Decompiled with CFR 0.152.
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.b;

class c
extends HashMap<String, Integer> {
    private static /* synthetic */ String[] lIIlIlIIIllII;
    private static /* synthetic */ int[] lIIlIlIIIllIl;
    final /* synthetic */ b j;

    c(b b2) {
        this.j = b2;
        this.put(lIIlIlIIIllII[lIIlIlIIIllIl[0]], lIIlIlIIIllIl[1]);
        0;
        this.put(lIIlIlIIIllII[lIIlIlIIIllIl[2]], lIIlIlIIIllIl[1]);
        0;
        this.put(lIIlIlIIIllII[lIIlIlIIIllIl[3]], lIIlIlIIIllIl[1]);
        0;
        this.put(lIIlIlIIIllII[lIIlIlIIIllIl[4]], lIIlIlIIIllIl[5]);
        0;
        this.put(lIIlIlIIIllII[lIIlIlIIIllIl[6]], lIIlIlIIIllIl[7]);
        0;
        this.put(lIIlIlIIIllII[lIIlIlIIIllIl[8]], lIIlIlIIIllIl[9]);
        0;
        this.put(lIIlIlIIIllII[lIIlIlIIIllIl[10]], lIIlIlIIIllIl[11]);
        0;
        this.put(lIIlIlIIIllII[lIIlIlIIIllIl[12]], lIIlIlIIIllIl[13]);
        0;
        this.put(lIIlIlIIIllII[lIIlIlIIIllIl[14]], lIIlIlIIIllIl[14]);
        0;
        this.put(lIIlIlIIIllII[lIIlIlIIIllIl[15]], lIIlIlIIIllIl[14]);
        0;
    }

    private static void lIlIlIllIIlllII() {
        lIIlIlIIIllII = new String[lIIlIlIIIllIl[16]];
        c.lIIlIlIIIllII[c.lIIlIlIIIllIl[0]] = c."Anglerfish";
        c.lIIlIlIIIllII[c.lIIlIlIIIllIl[2]] = c."Manta ray";
        c.lIIlIlIIIllII[c.lIIlIlIIIllIl[3]] = c."Summer pie";
        c.lIIlIlIIIllII[c.lIIlIlIIIllIl[4]] = c."Shark";
        c.lIIlIlIIIllII[c.lIIlIlIIIllIl[6]] = c."Cooked karambwan";
        c.lIIlIlIIIllII[c.lIIlIlIIIllIl[8]] = c."Monkfish";
        c.lIIlIlIIIllII[c.lIIlIlIIIllIl[10]] = c."Chilli potato";
        c.lIIlIlIIIllII[c.lIIlIlIIIllIl[12]] = c."Half a summer pie";
        c.lIIlIlIIIllII[c.lIIlIlIIIllIl[14]] = c."Peach";
        c.lIIlIlIIIllII[c.lIIlIlIIIllIl[15]] = c."Bones";
    }

    private static String lIlIlIllIIllIll(String var7, String var5) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIIlIlIIIllIl[3], var15);
            return new String(var12.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIllIIlllIl() {
        lIIlIlIIIllIl = new int[17];
        c.lIIlIlIIIllIl[0] = 1 & (1 ^ -1);
        c.lIIlIlIIIllIl[1] = 0x4D ^ 0x5B;
        c.lIIlIlIIIllIl[2] = 1;
        c.lIIlIlIIIllIl[3] = 2;
        c.lIIlIlIIIllIl[4] = 3;
        c.lIIlIlIIIllIl[5] = 0xA0 ^ 0xB4;
        c.lIIlIlIIIllIl[6] = 23 + 179 - 55 + 52 ^ 20 + 51 - -92 + 32;
        c.lIIlIlIIIllIl[7] = 0x9D ^ 0x8D ^ 2;
        c.lIIlIlIIIllIl[8] = 0x39 ^ 0x3C;
        c.lIIlIlIIIllIl[9] = 0xAF ^ 0xBF;
        c.lIIlIlIIIllIl[10] = 0x69 ^ 0x6F;
        c.lIIlIlIIIllIl[11] = 36 + 105 - 132 + 146 ^ 51 + 123 - 114 + 89;
        c.lIIlIlIIIllIl[12] = 0x5C ^ 0x6F ^ (0xA1 ^ 0x95);
        c.lIIlIlIIIllIl[13] = 0x33 ^ 0x38;
        c.lIIlIlIIIllIl[14] = 0x91 ^ 0x87 ^ (2 ^ 0x1C);
        c.lIIlIlIIIllIl[15] = 0x1B ^ 0x30 ^ (0x14 ^ 0x36);
        c.lIIlIlIIIllIl[16] = 0x25 ^ 0x2F;
    }

    private static String lIlIlIllIIllIlI(String var8, String var6) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var19 = var6.toCharArray();
        int var13 = lIIlIlIIIllIl[0];
        char[] var17 = var8.toCharArray();
        int var10 = var17.length;
        int var18 = lIIlIlIIIllIl[0];
        while (c.lIlIlIllIIllllI(var18, var10)) {
            char var9 = var17[var18];
            var11.append((char)(var9 ^ var19[var13 % var19.length]));
            0;
            ++var13;
            ++var18;
            0;
            if (((0xEC ^ 0xB1) & ~(0x47 ^ 0x1A)) == 0) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    static {
        c.lIlIlIllIIlllIl();
        c.lIlIlIllIIlllII();
    }

    private static String lIlIlIllIIllIIl(String var4, String var1) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIIlIlIIIllIl[14]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIIlIlIIIllIl[3], var16);
            return new String(var2.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllIIllllI(int n2, int n3) {
        return n2 < n3;
    }
}

