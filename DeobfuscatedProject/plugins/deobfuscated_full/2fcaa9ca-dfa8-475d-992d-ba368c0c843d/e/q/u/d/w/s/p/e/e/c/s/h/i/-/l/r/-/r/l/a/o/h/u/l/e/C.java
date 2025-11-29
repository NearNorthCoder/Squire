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

public final class C
extends Enum<C> {
    public static final /* synthetic */ /* enum */ C STATUE_BLUE_STRICT;
    public static final /* synthetic */ /* enum */ C STATUE_BLUE_I;
    private static /* synthetic */ int[] lllIIlIIIIlI;
    public static final /* synthetic */ /* enum */ C STATUE_BLUE_SHORT;
    public static final /* synthetic */ /* enum */ C STATUE_BLUE_II;
    public static final /* synthetic */ /* enum */ C STATUE_SHORT;
    private static /* synthetic */ String[] lllIIlIIIIIl;
    private static final /* synthetic */ C[] $VALUES;
    public static final /* synthetic */ /* enum */ C STATUE_BLUE_III;
    public static final /* synthetic */ /* enum */ C STATUE_4;
    public static final /* synthetic */ /* enum */ C STATUE_STRICT;
    public static final /* synthetic */ /* enum */ C STATUE_GOLD_SHORT;
    public static final /* synthetic */ /* enum */ C STATUE_GOLD_6;
    public static final /* synthetic */ /* enum */ C STATUE;

    private static String lIIIlIIlllIlIlI(String var16, String var12) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lllIIlIIIIlI[2], var18);
            return new String(var8.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    public static C[] values() {
        return (C[])$VALUES.clone();
    }

    static {
        C.lIIIlIIlllIllIl();
        C.lIIIlIIlllIllII();
        STATUE = new C();
        STATUE_SHORT = new C();
        STATUE_4 = new C();
        STATUE_GOLD_SHORT = new C();
        STATUE_GOLD_6 = new C();
        STATUE_STRICT = new C();
        STATUE_BLUE_STRICT = new C();
        STATUE_BLUE_SHORT = new C();
        STATUE_BLUE_I = new C();
        STATUE_BLUE_II = new C();
        STATUE_BLUE_III = new C();
        C[] cArray = new C[lllIIlIIIIlI[11]];
        cArray[C.lllIIlIIIIlI[0]] = STATUE;
        cArray[C.lllIIlIIIIlI[1]] = STATUE_SHORT;
        cArray[C.lllIIlIIIIlI[2]] = STATUE_4;
        cArray[C.lllIIlIIIIlI[3]] = STATUE_GOLD_SHORT;
        cArray[C.lllIIlIIIIlI[4]] = STATUE_GOLD_6;
        cArray[C.lllIIlIIIIlI[5]] = STATUE_STRICT;
        cArray[C.lllIIlIIIIlI[6]] = STATUE_BLUE_STRICT;
        cArray[C.lllIIlIIIIlI[7]] = STATUE_BLUE_SHORT;
        cArray[C.lllIIlIIIIlI[8]] = STATUE_BLUE_I;
        cArray[C.lllIIlIIIIlI[9]] = STATUE_BLUE_II;
        cArray[C.lllIIlIIIIlI[10]] = STATUE_BLUE_III;
        $VALUES = cArray;
    }

    private static void lIIIlIIlllIllIl() {
        lllIIlIIIIlI = new int[12];
        C.lllIIlIIIIlI[0] = ((0x63 ^ 0x52) & ~(0x21 ^ 0x10) ^ (0xA ^ 0x4A)) & (0xA0 ^ 0x8B ^ (0xD8 ^ 0xB3) ^ -1);
        C.lllIIlIIIIlI[1] = 1;
        C.lllIIlIIIIlI[2] = 2;
        C.lllIIlIIIIlI[3] = 3;
        C.lllIIlIIIIlI[4] = 0xE1 ^ 0x94 ^ (0x17 ^ 0x66);
        C.lllIIlIIIIlI[5] = 0xB9 ^ 0xBC;
        C.lllIIlIIIIlI[6] = 0x8F ^ 0x89;
        C.lllIIlIIIIlI[7] = 0xFF ^ 0x98 ^ (0x5E ^ 0x3E);
        C.lllIIlIIIIlI[8] = 0xE3 ^ 0x93 ^ (0xBA ^ 0xC2);
        C.lllIIlIIIIlI[9] = 0x1B ^ 0x12;
        C.lllIIlIIIIlI[10] = 0x15 ^ 0x1F;
        C.lllIIlIIIIlI[11] = 0x5C ^ 0x57;
    }

    private static boolean lIIIlIIlllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIlIIlllIlIIl(String var9, String var6) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var2 = var6.toCharArray();
        int var3 = lllIIlIIIIlI[0];
        char[] var5 = var9.toCharArray();
        int var11 = var5.length;
        int var15 = lllIIlIIIIlI[0];
        while (C.lIIIlIIlllIlllI(var15, var11)) {
            char var13 = var5[var15];
            var1.append((char)(var13 ^ var2[var3 % var2.length]));
            0;
            ++var3;
            ++var15;
            0;
            if ((0xF1 ^ 0xB4 ^ (0x2E ^ 0x6F)) == (0x1F ^ 0x54 ^ (0x67 ^ 0x28))) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    public static C valueOf(String string) {
        return Enum.valueOf(C.class, string);
    }

    private static void lIIIlIIlllIllII() {
        lllIIlIIIIIl = new String[lllIIlIIIIlI[11]];
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[0]] = C."STATUE";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[1]] = C."STATUE_SHORT";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[2]] = C."STATUE_4";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[3]] = C."STATUE_GOLD_SHORT";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[4]] = C."STATUE_GOLD_6";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[5]] = C."STATUE_STRICT";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[6]] = C."STATUE_BLUE_STRICT";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[7]] = C."STATUE_BLUE_SHORT";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[8]] = C."STATUE_BLUE_I";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[9]] = C."STATUE_BLUE_II";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[10]] = C."STATUE_BLUE_III";
    }

    private static String lIIIlIIlllIlIll(String var7, String var4) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lllIIlIIIIlI[8]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lllIIlIIIIlI[2], var17);
            return new String(var10.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }
}

