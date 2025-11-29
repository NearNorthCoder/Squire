/*
 * Decompiled with CFR 0.152.
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class SEnum
extends Enum<S> {
    public static /* synthetic */ int EAST;
    public static /* synthetic */ int NORTH;
    public static final /* synthetic */ /* enum */ S TEMPLATE_EAST;
    public static final /* synthetic */ /* enum */ S TEMPLATE_NORTH;
    public static /* synthetic */ int SOUTH;
    public static final /* synthetic */ /* enum */ S TEMPLATE_WEST;
    private static final /* synthetic */ S[] $VALUES;
    private static /* synthetic */ String[] lIlIlIlIllIl;
    public static final /* synthetic */ /* enum */ S TEMPLATE_UNKNOWN;
    public static /* synthetic */ int WEST;
    private static /* synthetic */ int[] lIlIlIlIlllI;

    public static S valueOf(String string) {
        return Enum.valueOf(S.class, string);
    }

    static {
        S.llIllllIIllIlI();
        S.llIllllIIllIIl();
        TEMPLATE_WEST = new S();
        TEMPLATE_NORTH = new S();
        TEMPLATE_EAST = new S();
        TEMPLATE_UNKNOWN = new S();
        S[] sArray = new S[lIlIlIlIlllI[2]];
        sArray[S.lIlIlIlIlllI[3]] = TEMPLATE_WEST;
        sArray[S.lIlIlIlIlllI[4]] = TEMPLATE_NORTH;
        sArray[S.lIlIlIlIlllI[1]] = TEMPLATE_EAST;
        sArray[S.lIlIlIlIlllI[5]] = TEMPLATE_UNKNOWN;
        $VALUES = sArray;
        NORTH = lIlIlIlIlllI[3];
        EAST = lIlIlIlIlllI[4];
        SOUTH = lIlIlIlIlllI[1];
        WEST = lIlIlIlIlllI[5];
    }

    public static int d(char c2) {
        switch (c2) {
            case 'N': {
                return NORTH;
            }
            case 'S': {
                return SOUTH;
            }
            case 'E': {
                return EAST;
            }
            case 'W': {
                return WEST;
            }
        }
        return lIlIlIlIlllI[0];
    }

    private static boolean llIllllIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    public static S a(char c2, char c3) {
        int n2 = S.b(c2, c3);
        switch (n2) {
            case 1: {
                return TEMPLATE_WEST;
            }
            case 2: {
                return TEMPLATE_NORTH;
            }
            case 3: {
                return TEMPLATE_EAST;
            }
        }
        return TEMPLATE_UNKNOWN;
    }

    private static String llIllllIIllIII(String var8, String var3) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlllI[6]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIlIlIlIlllI[1], var7);
            return new String(var6.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static int b(char c2, char c3) {
        int n2 = S.e(c2);
        int n3 = S.d(c3);
        int n4 = (n3 - n2 + lIlIlIlIlllI[2]) % lIlIlIlIlllI[2];
        return n4;
    }

    public static int e(char c2) {
        return (S.d(c2) + lIlIlIlIlllI[1]) % lIlIlIlIlllI[2];
    }

    private static void llIllllIIllIIl() {
        lIlIlIlIllIl = new String[lIlIlIlIlllI[2]];
        S.lIlIlIlIllIl[S.lIlIlIlIlllI[3]] = S."TEMPLATE_WEST";
        S.lIlIlIlIllIl[S.lIlIlIlIlllI[4]] = S."TEMPLATE_NORTH";
        S.lIlIlIlIllIl[S.lIlIlIlIlllI[1]] = S."TEMPLATE_EAST";
        S.lIlIlIlIllIl[S.lIlIlIlIlllI[5]] = S."TEMPLATE_UNKNOWN";
    }

    private static void llIllllIIllIlI() {
        lIlIlIlIlllI = new int[7];
        S.lIlIlIlIlllI[0] = -1;
        S.lIlIlIlIlllI[1] = 2;
        S.lIlIlIlIlllI[2] = 0x6E ^ 0x6A;
        S.lIlIlIlIlllI[3] = (0x2B ^ 0x70) & ~(0xED ^ 0xB6);
        S.lIlIlIlIlllI[4] = 1;
        S.lIlIlIlIlllI[5] = 3;
        S.lIlIlIlIlllI[6] = 0x5C ^ 0x6C ^ (9 ^ 0x31);
    }

    private static String llIllllIIlIlll(String var13, String var4) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var10 = var4.toCharArray();
        int var2 = lIlIlIlIlllI[3];
        char[] var1 = var13.toCharArray();
        int var11 = var1.length;
        int var5 = lIlIlIlIlllI[3];
        while (S.llIllllIIllIll(var5, var11)) {
            char var9 = var1[var5];
            var12.append((char)(var9 ^ var10[var2 % var10.length]));
            0;
            ++var2;
            ++var5;
            0;
            if ((6 ^ 0x56 ^ (4 ^ 0x50)) == (68 + 33 - -74 + 7 ^ 46 + 150 - 105 + 87)) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public static S[] values() {
        return (S[])$VALUES.clone();
    }
}

