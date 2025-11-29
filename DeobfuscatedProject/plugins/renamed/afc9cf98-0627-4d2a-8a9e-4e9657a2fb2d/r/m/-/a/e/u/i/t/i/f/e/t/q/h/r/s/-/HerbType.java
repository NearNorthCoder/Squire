/*
 * Decompiled with CFR 0.152.
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class HerbType
extends Enum<a> {
    public static final /* synthetic */ /* enum */ a HERB_BOX;
    public static final /* synthetic */ /* enum */ a SEED_PACK;
    public static final /* synthetic */ /* enum */ a NONE;
    private static /* synthetic */ int[] lIlIIIIIIIlll;
    private static final /* synthetic */ a[] $VALUES;
    private static /* synthetic */ String[] lIlIIIIIIIllI;

    private static String lIllIllIlIIlIlI(String var11, String var14) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var1 = var14.toCharArray();
        int var4 = lIlIIIIIIIlll[0];
        char[] var9 = var11.toCharArray();
        int var8 = var9.length;
        int var6 = lIlIIIIIIIlll[0];
        while (a.lIllIllIlIIlllI(var6, var8)) {
            char var2 = var9[var6];
            var13.append((char)(var2 ^ var1[var4 % var1.length]));
            0;
            ++var4;
            ++var6;
            0;
            if (3 >= ((0x39 ^ 0x59 ^ (0xD8 ^ 0x89)) & (0x11 ^ 0x3E ^ (0x34 ^ 0x2A) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    private static String lIllIllIlIIlIll(String var10, String var7) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIlIIIIIIIlll[2], var3);
            return new String(var5.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    static {
        a.lIllIllIlIIllIl();
        a.lIllIllIlIIllII();
        NONE = new a();
        HERB_BOX = new a();
        SEED_PACK = new a();
        a[] aArray = new a[lIlIIIIIIIlll[3]];
        aArray[a.lIlIIIIIIIlll[0]] = NONE;
        aArray[a.lIlIIIIIIIlll[1]] = HERB_BOX;
        aArray[a.lIlIIIIIIIlll[2]] = SEED_PACK;
        $VALUES = aArray;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private static boolean lIllIllIlIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIllIlIIllII() {
        lIlIIIIIIIllI = new String[lIlIIIIIIIlll[3]];
        a.lIlIIIIIIIllI[a.lIlIIIIIIIlll[0]] = a."NONE";
        a.lIlIIIIIIIllI[a.lIlIIIIIIIlll[1]] = a."HERB_BOX";
        a.lIlIIIIIIIllI[a.lIlIIIIIIIlll[2]] = a."SEED_PACK";
    }

    private static void lIllIllIlIIllIl() {
        lIlIIIIIIIlll = new int[4];
        a.lIlIIIIIIIlll[0] = (0x10 ^ 0x4A ^ (0x4B ^ 0x3F)) & (142 + 104 - 83 + 10 ^ 59 + 123 - 73 + 22 ^ -1);
        a.lIlIIIIIIIlll[1] = 1;
        a.lIlIIIIIIIlll[2] = 2;
        a.lIlIIIIIIIlll[3] = 3;
    }
}

