/*
 * Decompiled with CFR 0.152.
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

final class w
extends Enum<w> {
    private static /* synthetic */ int[] lIlIlllIlIIIl;
    public static final /* synthetic */ /* enum */ w BREWING;
    private static /* synthetic */ String[] lIlIlllIIlllI;
    public static final /* synthetic */ /* enum */ w RESTORING;
    private static final /* synthetic */ w[] $VALUES;
    public static final /* synthetic */ /* enum */ w NONE;

    private static boolean llIIIIlIIlIlllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        w.llIIIIlIIlIllIl();
        w.llIIIIlIIlIIllI();
        NONE = new w();
        BREWING = new w();
        RESTORING = new w();
        w[] wArray = new w[lIlIlllIlIIIl[3]];
        wArray[w.lIlIlllIlIIIl[0]] = NONE;
        wArray[w.lIlIlllIlIIIl[1]] = BREWING;
        wArray[w.lIlIlllIlIIIl[2]] = RESTORING;
        $VALUES = wArray;
    }

    private static String llIIIIlIIlIIlII(String var7, String var2) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var10 = var2.toCharArray();
        int var11 = lIlIlllIlIIIl[0];
        char[] var1 = var7.toCharArray();
        int var3 = var1.length;
        int var14 = lIlIlllIlIIIl[0];
        while (w.llIIIIlIIlIlllI(var14, var3)) {
            char var12 = var1[var14];
            var4.append((char)(var12 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if ((0xC5 ^ 0xC1) > -1) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static String llIIIIlIIlIIlIl(String var8, String var9) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIlIlllIlIIIl[2], var13);
            return new String(var5.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static void llIIIIlIIlIIllI() {
        lIlIlllIIlllI = new String[lIlIlllIlIIIl[3]];
        w.lIlIlllIIlllI[w.lIlIlllIlIIIl[0]] = w."NONE";
        w.lIlIlllIIlllI[w.lIlIlllIlIIIl[1]] = w."BREWING";
        w.lIlIlllIIlllI[w.lIlIlllIlIIIl[2]] = w."RESTORING";
    }

    public static w[] values() {
        return (w[])$VALUES.clone();
    }

    public static w valueOf(String string) {
        return Enum.valueOf(w.class, string);
    }

    private static void llIIIIlIIlIllIl() {
        lIlIlllIlIIIl = new int[4];
        w.lIlIlllIlIIIl[0] = (0x2F ^ 0x2A) & ~(0xC6 ^ 0xC3);
        w.lIlIlllIlIIIl[1] = 1;
        w.lIlIlllIlIIIl[2] = 2;
        w.lIlIlllIlIIIl[3] = 3;
    }
}

