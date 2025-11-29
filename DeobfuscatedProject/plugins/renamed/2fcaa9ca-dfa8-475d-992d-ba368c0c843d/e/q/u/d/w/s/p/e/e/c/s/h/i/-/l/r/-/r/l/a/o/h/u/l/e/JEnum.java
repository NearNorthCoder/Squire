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

public final class JEnum
extends Enum<j> {
    public static final /* synthetic */ /* enum */ j EAST;
    private static /* synthetic */ int[] lllIIIIIllII;
    public static final /* synthetic */ /* enum */ j NORTH;
    public static final /* synthetic */ /* enum */ j SOUTH;
    private static /* synthetic */ String[] lllIIIIIlIll;
    public static final /* synthetic */ /* enum */ j WEST;
    private static final /* synthetic */ j[] $VALUES;

    private static String lIIIlIIIIIlllll(String var2, String var5) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lllIIIIIllII[5]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lllIIIIIllII[2], var6);
            return new String(var9.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIIIlIIIIl() {
        lllIIIIIllII = new int[6];
        j.lllIIIIIllII[0] = 3 & ~3;
        j.lllIIIIIllII[1] = 1;
        j.lllIIIIIllII[2] = 2;
        j.lllIIIIIllII[3] = 3;
        j.lllIIIIIllII[4] = 0x69 ^ 0x6D;
        j.lllIIIIIllII[5] = 0xEF ^ 0xC1 ^ (0x58 ^ 0x7E);
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    private static void lIIIlIIIIlIIIII() {
        lllIIIIIlIll = new String[lllIIIIIllII[4]];
        j.lllIIIIIlIll[j.lllIIIIIllII[0]] = j."NORTH";
        j.lllIIIIIlIll[j.lllIIIIIllII[1]] = j."SOUTH";
        j.lllIIIIIlIll[j.lllIIIIIllII[2]] = j."WEST";
        j.lllIIIIIlIll[j.lllIIIIIllII[3]] = j."EAST";
    }

    private static String lIIIlIIIIIlllIl(String var18, String var8) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lllIIIIIllII[2], var17);
            return new String(var10.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIIIIllllI(String var1, String var14) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var11 = var14.toCharArray();
        int var16 = lllIIIIIllII[0];
        char[] var13 = var1.toCharArray();
        int var19 = var13.length;
        int var4 = lllIIIIIllII[0];
        while (j.lIIIlIIIIlIIIlI(var4, var19)) {
            char var15 = var13[var4];
            var12.append((char)(var15 ^ var11[var16 % var11.length]));
            0;
            ++var16;
            ++var4;
            0;
            if (1 <= 1) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static boolean lIIIlIIIIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        j.lIIIlIIIIlIIIIl();
        j.lIIIlIIIIlIIIII();
        NORTH = new j();
        SOUTH = new j();
        WEST = new j();
        EAST = new j();
        j[] jArray = new j[lllIIIIIllII[4]];
        jArray[j.lllIIIIIllII[0]] = NORTH;
        jArray[j.lllIIIIIllII[1]] = SOUTH;
        jArray[j.lllIIIIIllII[2]] = WEST;
        jArray[j.lllIIIIIllII[3]] = EAST;
        $VALUES = jArray;
    }
}

