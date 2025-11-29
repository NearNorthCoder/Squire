/*
 * Decompiled with CFR 0.152.
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

final class AVEnum
extends Enum<av> {
    public static final /* synthetic */ /* enum */ av WEST;
    private static /* synthetic */ int[] llllIIlIIllI;
    private static /* synthetic */ String[] llllIIlIIlIl;
    public static final /* synthetic */ /* enum */ av NORTH;
    private static final /* synthetic */ av[] $VALUES;
    public static final /* synthetic */ /* enum */ av EAST;
    public static final /* synthetic */ /* enum */ av SOUTH;

    private static String lIIIllllIllllll(String var8, String var3) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), llllIIlIIllI[5]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(llllIIlIIllI[2], var15);
            return new String(var9.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public static av valueOf(String string) {
        return Enum.valueOf(AVEnum.class, string);
    }

    public static av[] values() {
        return (av[])$VALUES.clone();
    }

    private static String lIIIlllllIIIIIl(String var13, String var2) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(llllIIlIIllI[2], var18);
            return new String(var12.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    static {
        av.lIIIlllllIIIIll();
        av.lIIIlllllIIIIlI();
        NORTH = new av();
        SOUTH = new av();
        EAST = new av();
        WEST = new av();
        av[] avArray = new av[llllIIlIIllI[4]];
        avArray[av.llllIIlIIllI[0]] = NORTH;
        avArray[av.llllIIlIIllI[1]] = SOUTH;
        avArray[av.llllIIlIIllI[2]] = EAST;
        avArray[av.llllIIlIIllI[3]] = WEST;
        $VALUES = avArray;
    }

    private static void lIIIlllllIIIIll() {
        llllIIlIIllI = new int[6];
        av.llllIIlIIllI[0] = (0xC5 ^ 0x8B) & ~(0xE7 ^ 0xA9);
        av.llllIIlIIllI[1] = 1;
        av.llllIIlIIllI[2] = 2;
        av.llllIIlIIllI[3] = 3;
        av.llllIIlIIllI[4] = 93 + 138 - 173 + 98 ^ 90 + 15 - -22 + 25;
        av.llllIIlIIllI[5] = 0x71 ^ 0x79 ^ (0x10 ^ 0x1C) & ~(0xB0 ^ 0xBC);
    }

    private static String lIIIlllllIIIIII(String var4, String var1) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var16 = var1.toCharArray();
        int var7 = llllIIlIIllI[0];
        char[] var19 = var4.toCharArray();
        int var17 = var19.length;
        int var5 = llllIIlIIllI[0];
        while (av.lIIIlllllIIIlII(var5, var17)) {
            char var10 = var19[var5];
            var11.append((char)(var10 ^ var16[var7 % var16.length]));
            0;
            ++var7;
            ++var5;
            0;
            if (1 == 1) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static void lIIIlllllIIIIlI() {
        llllIIlIIlIl = new String[llllIIlIIllI[4]];
        av.llllIIlIIlIl[av.llllIIlIIllI[0]] = av."NORTH";
        av.llllIIlIIlIl[av.llllIIlIIllI[1]] = av."SOUTH";
        av.llllIIlIIlIl[av.llllIIlIIllI[2]] = av."EAST";
        av.llllIIlIIlIl[av.llllIIlIIllI[3]] = av."WEST";
    }

    private static boolean lIIIlllllIIIlII(int n2, int n3) {
        return n2 < n3;
    }
}

