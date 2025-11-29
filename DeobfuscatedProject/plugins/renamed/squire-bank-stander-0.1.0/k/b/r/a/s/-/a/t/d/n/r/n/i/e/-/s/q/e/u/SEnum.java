/*
 * Decompiled with CFR 0.152.
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class SEnum
extends Enum<s> {
    private static final /* synthetic */ s[] $VALUES;
    private static /* synthetic */ String[] lllIIlIIllI;
    public static final /* synthetic */ /* enum */ s SERUMS;
    public static final /* synthetic */ /* enum */ s COMPOST;
    private static /* synthetic */ int[] lllIIlIIlll;

    private static void lIlIllIllllIII() {
        lllIIlIIlll = new int[4];
        s.lllIIlIIlll[0] = (0xA8 ^ 0xB6 ^ (0x1F ^ 0x10)) & (0x99 ^ 0xA7 ^ (0x41 ^ 0x6E) ^ -1);
        s.lllIIlIIlll[1] = 1;
        s.lllIIlIIlll[2] = 2;
        s.lllIIlIIlll[3] = 0x78 ^ 0x67 ^ (0xA ^ 0x1D);
    }

    private static boolean lIlIllIllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static s valueOf(String string) {
        return Enum.valueOf(s.class, string);
    }

    private static String lIlIllIlllIllI(String var6, String var8) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var4 = var8.toCharArray();
        int var10 = lllIIlIIlll[0];
        char[] var11 = var6.toCharArray();
        int var1 = var11.length;
        int var2 = lllIIlIIlll[0];
        while (s.lIlIllIllllIIl(var2, var1)) {
            char var12 = var11[var2];
            var9.append((char)(var12 ^ var4[var10 % var4.length]));
            0;
            ++var10;
            ++var2;
            0;
            if ((2 & ~2) <= (0x6A ^ 0x6E)) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static void lIlIllIlllIlll() {
        lllIIlIIllI = new String[lllIIlIIlll[2]];
        s.lllIIlIIllI[s.lllIIlIIlll[0]] = s."SERUMS";
        s.lllIIlIIllI[s.lllIIlIIlll[1]] = s."COMPOST";
    }

    public static s[] values() {
        return (s[])$VALUES.clone();
    }

    private static String lIlIllIlllIlIl(String var13, String var14) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), lllIIlIIlll[3]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lllIIlIIlll[2], var3);
            return new String(var5.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    static {
        s.lIlIllIllllIII();
        s.lIlIllIlllIlll();
        SERUMS = new s();
        COMPOST = new s();
        s[] sArray = new s[lllIIlIIlll[2]];
        sArray[s.lllIIlIIlll[0]] = SERUMS;
        sArray[s.lllIIlIIlll[1]] = COMPOST;
        $VALUES = sArray;
    }
}

