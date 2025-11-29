/*
 * Decompiled with CFR 0.152.
 */
package -.r.u.q.e.s.o.t.a.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class n
extends Enum<n> {
    public static final /* synthetic */ /* enum */ n NORMAL;
    private static /* synthetic */ int[] lIlIIIIIIIIlI;
    private static final /* synthetic */ n[] $VALUES;
    public static final /* synthetic */ /* enum */ n FLICK;
    public static final /* synthetic */ /* enum */ n NONE;
    private static /* synthetic */ String[] lIlIIIIIIIIIl;

    private static String lIllIlIllIllIIl(String var9, String var6) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var2 = lIlIIIIIIIIlI[0];
        char[] var13 = var9.toCharArray();
        int var7 = var13.length;
        int var10 = lIlIIIIIIIIlI[0];
        while (n.lIllIlIllIlllIl(var10, var7)) {
            char var4 = var13[var10];
            var14.append((char)(var4 ^ var8[var2 % var8.length]));
            0;
            ++var2;
            ++var10;
            0;
            
            return null;
        }
        return String.valueOf(var14);
    }

    private static void lIllIlIllIlllII() {
        lIlIIIIIIIIlI = new int[4];
        n.lIlIIIIIIIIlI[0] = (0xA8 ^ 0xA2 ^ (0x2E ^ 0x2A)) & (75 + 134 - 164 + 133 ^ 43 + 80 - -25 + 40 ^ -1);
        n.lIlIIIIIIIIlI[1] = 1;
        n.lIlIIIIIIIIlI[2] = 2;
        n.lIlIIIIIIIIlI[3] = 3;
    }

    private static boolean lIllIlIllIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    static {
        n.lIllIlIllIlllII();
        n.lIllIlIllIllIll();
        NONE = new n();
        NORMAL = new n();
        FLICK = new n();
        n[] nArray = new n[lIlIIIIIIIIlI[3]];
        nArray[n.lIlIIIIIIIIlI[0]] = NONE;
        nArray[n.lIlIIIIIIIIlI[1]] = NORMAL;
        nArray[n.lIlIIIIIIIIlI[2]] = FLICK;
        $VALUES = nArray;
    }

    private static String lIllIlIllIllIlI(String var1, String var12) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIlIIIIIIIIlI[2], var11);
            return new String(var3.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIllIllIll() {
        lIlIIIIIIIIIl = new String[lIlIIIIIIIIlI[3]];
        n.lIlIIIIIIIIIl[n.lIlIIIIIIIIlI[0]] = n."NONE";
        n.lIlIIIIIIIIIl[n.lIlIIIIIIIIlI[1]] = n."NORMAL";
        n.lIlIIIIIIIIIl[n.lIlIIIIIIIIlI[2]] = n."FLICK";
    }
}

