/*
 * Decompiled with CFR 0.152.
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class F
extends Enum<F> {
    private static final /* synthetic */ F[] $VALUES;
    private final /* synthetic */ int personalItemCapacity;
    public static final /* synthetic */ /* enum */ F LARGE;
    public static final /* synthetic */ /* enum */ F MEDIUM;
    public static final /* synthetic */ /* enum */ F TINY;
    private final /* synthetic */ int raidItemCapacity;
    public static final /* synthetic */ /* enum */ F MASSIVE;
    private static /* synthetic */ String[] lIlIIllllIlI;
    private static /* synthetic */ int[] lIlIIllllIll;
    public static final /* synthetic */ /* enum */ F SMALL;

    private static void llIllIllIllIIl() {
        lIlIIllllIll = new int[16];
        F.lIlIIllllIll[0] = (0 ^ 0x37) & ~(0x43 ^ 0x74);
        F.lIlIIllllIll[1] = 0 + 102 - 89 + 114 ^ (0xD7 ^ 0xB1);
        F.lIlIIllllIll[2] = 1;
        F.lIlIIllllIll[3] = 0x66 ^ 0x29 ^ (0x27 ^ 0x76);
        F.lIlIIllllIll[4] = (0x8F ^ 0xC3) + (104 + 79 - 85 + 36) - (53 + 3 - 24 + 97) + (0 + 106 - -29 + 34);
        F.lIlIIllllIll[5] = 2;
        F.lIlIIllllIll[6] = 0x74 ^ 0x48;
        F.lIlIIllllIll[7] = 0xFFFFE7FC & 0x19F7;
        F.lIlIIllllIll[8] = 3;
        F.lIlIIllllIll[9] = 0xF6 ^ 0xAC;
        F.lIlIIllllIll[10] = -(0xFFFFFC4B & 0xFB7) & (0xFFFF9FFF & 0x6FEA);
        F.lIlIIllllIll[11] = 132 + 5 - 13 + 12 ^ 27 + 73 - -31 + 9;
        F.lIlIIllllIll[12] = 0x5E ^ 0x37 ^ (0x31 ^ 0x20);
        F.lIlIIllllIll[13] = -(0xFFFFB09D & 0x7F63) & (0xFFFFFDFD & 0x37DE);
        F.lIlIIllllIll[14] = 0xBE ^ 0xBB;
        F.lIlIIllllIll[15] = 0x15 ^ 0x2F ^ (0x90 ^ 0xA2);
    }

    private static String llIllIllIlIllI(String var3, String var10) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIlIIllllIll[5], var16);
            return new String(var6.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private F(int n3, int n4) {
        this.personalItemCapacity = n3;
        this.raidItemCapacity = n4;
    }

    private static void llIllIllIllIII() {
        lIlIIllllIlI = new String[lIlIIllllIll[14]];
        F.lIlIIllllIlI[F.lIlIIllllIll[0]] = F."TINY";
        F.lIlIIllllIlI[F.lIlIIllllIll[2]] = F."SMALL";
        F.lIlIIllllIlI[F.lIlIIllllIll[5]] = F."MEDIUM";
        F.lIlIIllllIlI[F.lIlIIllllIll[8]] = F."LARGE";
        F.lIlIIllllIlI[F.lIlIIllllIll[11]] = F."MASSIVE";
    }

    public static F[] values() {
        return (F[])$VALUES.clone();
    }

    private static String llIllIllIlIlIl(String var2, String var12) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lIlIIllllIll[15]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIlIIllllIll[5], var18);
            return new String(var7.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    static {
        F.llIllIllIllIIl();
        F.llIllIllIllIII();
        TINY = new F(lIlIIllllIll[1]);
        SMALL = new F(lIlIIllllIll[3], lIlIIllllIll[4]);
        MEDIUM = new F(lIlIIllllIll[6], lIlIIllllIll[7]);
        LARGE = new F(lIlIIllllIll[9], lIlIIllllIll[10]);
        MASSIVE = new F(lIlIIllllIll[12], lIlIIllllIll[13]);
        F[] fArray = new F[lIlIIllllIll[14]];
        fArray[F.lIlIIllllIll[0]] = TINY;
        fArray[F.lIlIIllllIll[2]] = SMALL;
        fArray[F.lIlIIllllIll[5]] = MEDIUM;
        fArray[F.lIlIIllllIll[8]] = LARGE;
        fArray[F.lIlIIllllIll[11]] = MASSIVE;
        $VALUES = fArray;
    }

    private static String llIllIllIlIlll(String var15, String var19) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var13 = var19.toCharArray();
        int var1 = lIlIIllllIll[0];
        char[] var4 = var15.toCharArray();
        int var14 = var4.length;
        int var9 = lIlIIllllIll[0];
        while (F.llIllIllIllIlI(var9, var14)) {
            char var8 = var4[var9];
            var17.append((char)(var8 ^ var13[var1 % var13.length]));
            0;
            ++var1;
            ++var9;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    public int bM() {
        return this.raidItemCapacity;
    }

    private static boolean llIllIllIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private F(int n3) {
        this(n3, lIlIIllllIll[0]);
    }

    public static F valueOf(String string) {
        return Enum.valueOf(F.class, string);
    }

    public int bL() {
        return this.personalItemCapacity;
    }
}

