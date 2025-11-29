/*
 * Decompiled with CFR 0.152.
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class c
extends Enum<c> {
    public static final /* synthetic */ /* enum */ c DONE;
    public static final /* synthetic */ /* enum */ c TRANSPORTING_ZULRAH;
    public static final /* synthetic */ /* enum */ c BANKING;
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ /* enum */ c COLLECTING_ZULRAH;
    private static /* synthetic */ String[] lIllIlIIlIIII;
    private static /* synthetic */ int[] lIllIlIIlIIIl;

    private static String llIIIllllIIlIIl(String var13, String var2) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var12 = var2.toCharArray();
        int var5 = lIllIlIIlIIIl[0];
        char[] var6 = var13.toCharArray();
        int var3 = var6.length;
        int var7 = lIllIlIIlIIIl[0];
        while (c.llIIIllllIIllII(var7, var3)) {
            char var11 = var6[var7];
            var10.append((char)(var11 ^ var12[var5 % var12.length]));
            0;
            ++var5;
            ++var7;
            0;
            
            return null;
        }
        return String.valueOf(var10);
    }

    private static void llIIIllllIIlIll() {
        lIllIlIIlIIIl = new int[6];
        c.lIllIlIIlIIIl[0] = (0x57 ^ 0x72) & ~(0x5F ^ 0x7A);
        c.lIllIlIIlIIIl[1] = 1;
        c.lIllIlIIlIIIl[2] = 2;
        c.lIllIlIIlIIIl[3] = 3;
        c.lIllIlIIlIIIl[4] = 0xF0 ^ 0x84 ^ (0x7D ^ 0xD);
        c.lIllIlIIlIIIl[5] = 127 + 203 - 230 + 104 ^ 87 + 139 - 106 + 76;
    }

    private static String llIIIllllIIlIII(String var14, String var1) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIllIlIIlIIIl[5]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIllIlIIlIIIl[2], var8);
            return new String(var9.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void llIIIllllIIlIlI() {
        lIllIlIIlIIII = new String[lIllIlIIlIIIl[4]];
        c.lIllIlIIlIIII[c.lIllIlIIlIIIl[0]] = c."BANKING";
        c.lIllIlIIlIIII[c.lIllIlIIlIIIl[1]] = c."TRANSPORTING_ZULRAH";
        c.lIllIlIIlIIII[c.lIllIlIIlIIIl[2]] = c."COLLECTING_ZULRAH";
        c.lIllIlIIlIIII[c.lIllIlIIlIIIl[3]] = c."DONE";
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    static {
        c.llIIIllllIIlIll();
        c.llIIIllllIIlIlI();
        BANKING = new c();
        TRANSPORTING_ZULRAH = new c();
        COLLECTING_ZULRAH = new c();
        DONE = new c();
        c[] cArray = new c[lIllIlIIlIIIl[4]];
        cArray[c.lIllIlIIlIIIl[0]] = BANKING;
        cArray[c.lIllIlIIlIIIl[1]] = TRANSPORTING_ZULRAH;
        cArray[c.lIllIlIIlIIIl[2]] = COLLECTING_ZULRAH;
        cArray[c.lIllIlIIlIIIl[3]] = DONE;
        $VALUES = cArray;
    }

    private static boolean llIIIllllIIllII(int n2, int n3) {
        return n2 < n3;
    }
}

