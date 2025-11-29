/*
 * Decompiled with CFR 0.152.
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class H
extends Enum<H> {
    private static /* synthetic */ String[] lllIIIIIlIIl;
    private static final /* synthetic */ H[] $VALUES;
    public static final /* synthetic */ /* enum */ H BLADE_STRANGE_TILES;
    private static /* synthetic */ int[] lllIIIIIlIlI;
    public static final /* synthetic */ /* enum */ H STRANGE_TILES;
    public static final /* synthetic */ /* enum */ H DART_STRANGE_TILES;

    static {
        H.lIIIlIIIIIllIll();
        H.lIIIlIIIIIllIlI();
        STRANGE_TILES = new H();
        DART_STRANGE_TILES = new H();
        BLADE_STRANGE_TILES = new H();
        H[] hArray = new H[lllIIIIIlIlI[3]];
        hArray[H.lllIIIIIlIlI[0]] = STRANGE_TILES;
        hArray[H.lllIIIIIlIlI[1]] = DART_STRANGE_TILES;
        hArray[H.lllIIIIIlIlI[2]] = BLADE_STRANGE_TILES;
        $VALUES = hArray;
    }

    public static H[] values() {
        return (H[])$VALUES.clone();
    }

    private static String lIIIlIIIIIllIII(String var3, String var13) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var7 = var13.toCharArray();
        int var10 = lllIIIIIlIlI[0];
        char[] var1 = var3.toCharArray();
        int var14 = var1.length;
        int var8 = lllIIIIIlIlI[0];
        while (H.lIIIlIIIIIlllII(var8, var14)) {
            char var12 = var1[var8];
            var11.append((char)(var12 ^ var7[var10 % var7.length]));
            0;
            ++var10;
            ++var8;
            0;
            if ((0x83 ^ 0x87) >= (0x15 ^ 0x11)) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    public static H valueOf(String string) {
        return Enum.valueOf(H.class, string);
    }

    private static void lIIIlIIIIIllIlI() {
        lllIIIIIlIIl = new String[lllIIIIIlIlI[3]];
        H.lllIIIIIlIIl[H.lllIIIIIlIlI[0]] = H."STRANGE_TILES";
        H.lllIIIIIlIIl[H.lllIIIIIlIlI[1]] = H."DART_STRANGE_TILES";
        H.lllIIIIIlIIl[H.lllIIIIIlIlI[2]] = H."BLADE_STRANGE_TILES";
    }

    private static String lIIIlIIIIIllIIl(String var2, String var5) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lllIIIIIlIlI[4]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lllIIIIIlIlI[2], var9);
            return new String(var6.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIIIIllIll() {
        lllIIIIIlIlI = new int[5];
        H.lllIIIIIlIlI[0] = (0x7D ^ 0x55) & ~(0xB1 ^ 0x99);
        H.lllIIIIIlIlI[1] = 1;
        H.lllIIIIIlIlI[2] = 2;
        H.lllIIIIIlIlI[3] = 3;
        H.lllIIIIIlIlI[4] = 0xD ^ 0x5C ^ (0x98 ^ 0xC1);
    }

    private static boolean lIIIlIIIIIlllII(int n2, int n3) {
        return n2 < n3;
    }
}

