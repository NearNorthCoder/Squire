/*
 * Decompiled with CFR 0.152.
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.O;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class K {
    private static /* synthetic */ int[] lIlIlIIlIlIl;
    private final /* synthetic */ List<O> cd;
    private static /* synthetic */ String[] lIlIlIIlIIll;

    public K() {
        this.cd = new ArrayList<O>();
    }

    static {
        K.llIlllIlIIIIll();
        K.llIlllIlIIIIlI();
    }

    private static String llIlllIIllIIll(String var13, String var4) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(lIlIlIIlIlIl[2], var17);
            return new String(var16.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    public void a(O o2) {
        this.cd.add(o2);
        0;
    }

    public String bO() {
        return this.d().replaceAll(lIlIlIIlIIll[lIlIlIIlIlIl[0]], lIlIlIIlIIll[lIlIlIIlIlIl[1]]).replaceAll(lIlIlIIlIIll[lIlIlIIlIlIl[2]], lIlIlIIlIIll[lIlIlIIlIlIl[3]]);
    }

    private static void llIlllIlIIIIlI() {
        lIlIlIIlIIll = new String[lIlIlIIlIlIl[4]];
        K.lIlIlIIlIIll[K.lIlIlIIlIlIl[0]] = K."#";
        K.lIlIlIIlIIll[K.lIlIlIIlIlIl[1]] = K."";
        K.lIlIlIIlIIll[K.lIlIlIIlIlIl[2]] = K."¤";
        K.lIlIlIIlIIll[K.lIlIlIIlIlIl[3]] = K."";
    }

    public List<O> bP() {
        return this.cd;
    }

    private static String llIlllIlIIIIIl(String var20, String var12) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var23 = var12.toCharArray();
        int var14 = lIlIlIIlIlIl[0];
        char[] var10 = var20.toCharArray();
        int var25 = var10.length;
        int var7 = lIlIlIIlIlIl[0];
        while (K.llIlllIlIIIllI(var7, var25)) {
            char var5 = var10[var7];
            var24.append((char)(var5 ^ var23[var14 % var23.length]));
            0;
            ++var14;
            ++var7;
            0;
            if (((65 + 138 - 201 + 171 ^ 102 + 49 - 58 + 67) & (0x77 ^ 0x3F ^ (0xD8 ^ 0x9D) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var24);
    }

    private static String llIlllIlIIIIII(String var22, String var11) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIlIlIIlIlIl[5]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIlIlIIlIlIl[2], var6);
            return new String(var9.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllIlIIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llIlllIlIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIlllIlIIIIll() {
        lIlIlIIlIlIl = new int[6];
        K.lIlIlIIlIlIl[0] = 1 & (1 ^ -1);
        K.lIlIlIIlIlIl[1] = 1;
        K.lIlIlIIlIlIl[2] = 2;
        K.lIlIlIIlIlIl[3] = 3;
        K.lIlIlIIlIlIl[4] = 0xB3 ^ 0xB7;
        K.lIlIlIIlIlIl[5] = 0xA1 ^ 0xC3 ^ (0xFF ^ 0x95);
    }

    private static boolean llIlllIlIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public String d() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<O> var8 = this.cd.iterator();
        while (K.llIlllIlIIIlII(var8.hasNext() ? 1 : 0)) {
            void var3;
            O var21 = var8.next();
            var3.append(var21.ca());
            0;
            0;
            if ((0x8B ^ 0x8F) == (0x73 ^ 0x77)) continue;
            return null;
        }
        return String.valueOf(stringBuilder);
    }

    /*
     * WARNING - void declaration
     */
    public O w(int n2) {
        Iterator<O> var18 = this.cd.iterator();
        while (K.llIlllIlIIIlII(var18.hasNext() ? 1 : 0)) {
            void var19;
            O var1 = var18.next();
            if (K.llIlllIlIIIlIl(var1.bZ(), (int)var19)) {
                return var1;
            }
            0;
            if (-1 < 0) continue;
            return null;
        }
        return null;
    }
}

