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

public final class k
extends Enum<k> {
    public static final /* synthetic */ /* enum */ k NORTH;
    public static final /* synthetic */ /* enum */ k SOUTH_BLADE;
    public static final /* synthetic */ /* enum */ k EAST;
    public static final /* synthetic */ /* enum */ k WEST;
    public static final /* synthetic */ /* enum */ k SOUTH;
    private static /* synthetic */ String[] lllIIIIlllll;
    private static final /* synthetic */ k[] $VALUES;
    private static /* synthetic */ int[] lllIIIlIIIII;

    public static k valueOf(String string) {
        return Enum.valueOf(k.class, string);
    }

    static {
        k.lIIIlIIIllIllIl();
        k.lIIIlIIIllIllII();
        NORTH = new k();
        SOUTH = new k();
        WEST = new k();
        EAST = new k();
        SOUTH_BLADE = new k();
        k[] kArray = new k[lllIIIlIIIII[5]];
        kArray[k.lllIIIlIIIII[0]] = NORTH;
        kArray[k.lllIIIlIIIII[1]] = SOUTH;
        kArray[k.lllIIIlIIIII[2]] = WEST;
        kArray[k.lllIIIlIIIII[3]] = EAST;
        kArray[k.lllIIIlIIIII[4]] = SOUTH_BLADE;
        $VALUES = kArray;
    }

    private static void lIIIlIIIllIllIl() {
        lllIIIlIIIII = new int[7];
        k.lllIIIlIIIII[0] = (155 + 13 - 135 + 182 ^ 57 + 155 - 141 + 87) & (0xB6 ^ 0x86 ^ (0x32 ^ 0x4B) ^ -1);
        k.lllIIIlIIIII[1] = 1;
        k.lllIIIlIIIII[2] = 2;
        k.lllIIIlIIIII[3] = 3;
        k.lllIIIlIIIII[4] = 0x1B ^ 0xD ^ (5 ^ 0x17);
        k.lllIIIlIIIII[5] = 0x29 ^ 0x2C;
        k.lllIIIlIIIII[6] = 0x7F ^ 0x24 ^ (0xE5 ^ 0xB6);
    }

    private static boolean lIIIlIIIllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIlIIIllIlIlI(String var8, String var4) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var4.toCharArray();
        int var9 = lllIIIlIIIII[0];
        char[] var10 = var8.toCharArray();
        int var12 = var10.length;
        int var11 = lllIIIlIIIII[0];
        while (k.lIIIlIIIllIlllI(var11, var12)) {
            char var7 = var10[var11];
            var13.append((char)(var7 ^ var14[var9 % var14.length]));
            0;
            ++var9;
            ++var11;
            0;
            if ((0x54 ^ 0x22 ^ (0xF3 ^ 0x81)) > ((0x89 ^ 0xB1 ^ 3) & (56 + 153 - 43 + 24 ^ 14 + 87 - 23 + 55 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static String lIIIlIIIllIlIll(String var6, String var1) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lllIIIlIIIII[6]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lllIIIlIIIII[2], var2);
            return new String(var3.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIIllIllII() {
        lllIIIIlllll = new String[lllIIIlIIIII[5]];
        k.lllIIIIlllll[k.lllIIIlIIIII[0]] = k."NORTH";
        k.lllIIIIlllll[k.lllIIIlIIIII[1]] = k."SOUTH";
        k.lllIIIIlllll[k.lllIIIlIIIII[2]] = k."WEST";
        k.lllIIIIlllll[k.lllIIIlIIIII[3]] = k."EAST";
        k.lllIIIIlllll[k.lllIIIlIIIII[4]] = k."SOUTH_BLADE";
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
    }
}

