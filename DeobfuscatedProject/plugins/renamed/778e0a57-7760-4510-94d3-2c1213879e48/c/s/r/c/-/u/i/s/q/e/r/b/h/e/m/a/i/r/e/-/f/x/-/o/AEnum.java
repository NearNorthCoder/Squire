/*
 * Decompiled with CFR 0.152.
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class AEnum
extends Enum<A> {
    public static final /* synthetic */ /* enum */ A UNKNOWN;
    private static /* synthetic */ int[] lIlIlIllIlll;
    public static final /* synthetic */ /* enum */ A ACID;
    public static final /* synthetic */ /* enum */ A CRYSTAL;
    private static /* synthetic */ String[] lIlIlIllIllI;
    public static final /* synthetic */ /* enum */ A FLAME;
    private static final /* synthetic */ A[] $VALUES;

    static {
        A.llIllllIllllII();
        A.llIllllIlllIll();
        FLAME = new A();
        ACID = new A();
        CRYSTAL = new A();
        UNKNOWN = new A();
        A[] aArray = new A[lIlIlIllIlll[4]];
        aArray[A.lIlIlIllIlll[0]] = FLAME;
        aArray[A.lIlIlIllIlll[1]] = ACID;
        aArray[A.lIlIlIllIlll[2]] = CRYSTAL;
        aArray[A.lIlIlIllIlll[3]] = UNKNOWN;
        $VALUES = aArray;
    }

    private static boolean llIllllIllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIllllIlllIIl(String var8, String var7) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIlIlIllIlll[2], var11);
            return new String(var12.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String llIllllIlllIlI(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var6 = var5.toCharArray();
        int var13 = lIlIlIllIlll[0];
        char[] var3 = var4.toCharArray();
        int var14 = var3.length;
        int var2 = lIlIlIllIlll[0];
        while (A.llIllllIllllIl(var2, var14)) {
            char var9 = var3[var2];
            var1.append((char)(var9 ^ var6[var13 % var6.length]));
            0;
            ++var13;
            ++var2;
            0;
            if (((0xFB ^ 0x82 ^ (0x79 ^ 0x11)) & (3 + 140 - 115 + 132 ^ 82 + 133 - 138 + 100 ^ -1)) != 2) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static void llIllllIllllII() {
        lIlIlIllIlll = new int[5];
        A.lIlIlIllIlll[0] = (0x5F ^ 6) & ~(0x13 ^ 0x4A);
        A.lIlIlIllIlll[1] = 1;
        A.lIlIlIllIlll[2] = 2;
        A.lIlIlIllIlll[3] = 3;
        A.lIlIlIllIlll[4] = 0x67 ^ 0x53 ^ (0xF5 ^ 0xC5);
    }

    private static void llIllllIlllIll() {
        lIlIlIllIllI = new String[lIlIlIllIlll[4]];
        A.lIlIlIllIllI[A.lIlIlIllIlll[0]] = A."FLAME";
        A.lIlIlIllIllI[A.lIlIlIllIlll[1]] = A."ACID";
        A.lIlIlIllIllI[A.lIlIlIllIlll[2]] = A."CRYSTAL";
        A.lIlIlIllIllI[A.lIlIlIllIlll[3]] = A."UNKNOWN";
    }

    public static A valueOf(String string) {
        return Enum.valueOf(A.class, string);
    }

    public static A[] values() {
        return (A[])$VALUES.clone();
    }
}

