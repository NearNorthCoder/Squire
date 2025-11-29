/*
 * Decompiled with CFR 0.152.
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class c
extends Enum<c> {
    public static final /* synthetic */ /* enum */ c DARK_CRAB;
    public static final /* synthetic */ /* enum */ c SHARK;
    public static final /* synthetic */ /* enum */ c SEA_TURTLE;
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ /* enum */ c BASS;
    public static final /* synthetic */ /* enum */ c SALMON;
    public static final /* synthetic */ /* enum */ c TROUT;
    public static final /* synthetic */ /* enum */ c SWORDFISH;
    public static final /* synthetic */ /* enum */ c MONKFISH;
    public static final /* synthetic */ /* enum */ c MANTA_RAY;
    public static final /* synthetic */ /* enum */ c STEW;
    public static final /* synthetic */ /* enum */ c PIKE;
    private final /* synthetic */ int healAmount;
    public static final /* synthetic */ /* enum */ c KARAMBWAN;
    private static /* synthetic */ String[] lIIllIlIIllIl;
    public static final /* synthetic */ /* enum */ c LOBSTER;
    public static final /* synthetic */ /* enum */ c JUG_OF_WINE;
    public static final /* synthetic */ /* enum */ c TUNA;
    private final /* synthetic */ int itemId;
    private static /* synthetic */ int[] lIIllIlIlIlII;

    private c(int n3, int n4) {
        this.itemId = n3;
        this.healAmount = n4;
    }

    private static String lIllIIIIlIIlIIl(String var9, String var5) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIIllIlIlIlII[5]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIIllIlIlIlII[6], var11);
            return new String(var15.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIIlIIlIll(String var17, String var10) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lIIllIlIlIlII[6], var14);
            return new String(var4.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public int v() {
        return this.healAmount;
    }

    private static void lIllIIIIllIIlII() {
        lIIllIlIlIlII = new int[36];
        c.lIIllIlIlIlII[0] = (0x8C ^ 0xAD) & ~(0x6E ^ 0x4F);
        c.lIIllIlIlIlII[1] = -(0xFFFFFE35 & 0x7FEB) & (0xFFFFFFEF & 0x7F7D);
        c.lIIllIlIlIlII[2] = 0xA0 ^ 0xA7;
        c.lIIllIlIlIlII[3] = 1;
        c.lIIllIlIlIlII[4] = -(0xFFFFF9E7 & 0x7E39) & (0xFFFFFDFF & 0x7B7F);
        c.lIIllIlIlIlII[5] = 124 + 27 - 83 + 119 ^ 127 + 144 - 134 + 42;
        c.lIIllIlIlIlII[6] = 2;
        c.lIIllIlIlIlII[7] = 0xFFFFD3FF & 0x2D49;
        c.lIIllIlIlIlII[8] = 0xCA ^ 0xC3;
        c.lIIllIlIlIlII[9] = 3;
        c.lIIllIlIlIlII[10] = -(0xFFFFFE4D & 0x35B7) & (0xFFFFB5FF & 0x7F6D);
        c.lIIllIlIlIlII[11] = 0x7E ^ 0x1A ^ (0xA9 ^ 0xC7);
        c.lIIllIlIlIlII[12] = 0x28 ^ 0x2C;
        c.lIIllIlIlIlII[13] = 0xFFFFD7FB & 0x2FD7;
        c.lIIllIlIlIlII[14] = 0xD3 ^ 0xA3 ^ (0x60 ^ 0x1B);
        c.lIIllIlIlIlII[15] = 0xEC ^ 0x89 ^ (0xD9 ^ 0xB9);
        c.lIIllIlIlIlII[16] = 0xFFFFE7DF & 0x1FE9;
        c.lIIllIlIlIlII[17] = 0x90 ^ 0xC2 ^ (0x3F ^ 0x6B);
        c.lIIllIlIlIlII[18] = 0xFFFF997F & 0x67FB;
        c.lIIllIlIlIlII[19] = 84 + 42 - -2 + 2 ^ 100 + 90 - 103 + 55;
        c.lIIllIlIlIlII[20] = 0xFFFFAF7F & 0x51ED;
        c.lIIllIlIlIlII[21] = 9 ^ 4;
        c.lIIllIlIlIlII[22] = -(0xFFFFDD9D & 0x3AE3) & (0xFFFFB9F7 & 0x5FFD);
        c.lIIllIlIlIlII[23] = 188 + 159 - 147 + 3 ^ 194 + 13 - 26 + 16;
        c.lIIllIlIlIlII[24] = -(0xFFFFFDF7 & 0x42CA) & (0xFFFFDFEB & 0x7FDF);
        c.lIIllIlIlIlII[25] = 0x93 ^ 0x83;
        c.lIIllIlIlIlII[26] = -(0xFFFFEFFE & 0x7395) & (0xFFFFFFFB & 0x6FDF);
        c.lIIllIlIlIlII[27] = 0x14 ^ 6;
        c.lIIllIlIlIlII[28] = 0xFFFF8DD9 & 0x73A7;
        c.lIIllIlIlIlII[29] = 0x2B ^ 0x3F;
        c.lIIllIlIlIlII[30] = -(0xFFFFF6B3 & 0x197F) & (0xFFFFDDBF & 0x33FF);
        c.lIIllIlIlIlII[31] = 79 + 77 - 103 + 100 ^ 9 + 72 - 24 + 83;
        c.lIIllIlIlIlII[32] = 0xFFFF89FF & 0x7787;
        c.lIIllIlIlIlII[33] = 0x5D ^ 0x19 ^ (0xB ^ 0x59);
        c.lIIllIlIlIlII[34] = -(0xFFFFBD51 & 0x53FF) & (0xFFFFFFF3 & 0x3FFC);
        c.lIIllIlIlIlII[35] = 0x7F ^ 0x70;
    }

    private static boolean lIllIIIIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        c.lIllIIIIllIIlII();
        c.lIllIIIIllIIIll();
        TROUT = new c(lIIllIlIlIlII[1], lIIllIlIlIlII[2]);
        PIKE = new c(lIIllIlIlIlII[4], lIIllIlIlIlII[5]);
        SALMON = new c(lIIllIlIlIlII[7], lIIllIlIlIlII[8]);
        TUNA = new c(lIIllIlIlIlII[10], lIIllIlIlIlII[11]);
        STEW = new c(lIIllIlIlIlII[13], lIIllIlIlIlII[14]);
        JUG_OF_WINE = new c(lIIllIlIlIlII[16], lIIllIlIlIlII[14]);
        LOBSTER = new c(lIIllIlIlIlII[18], lIIllIlIlIlII[19]);
        BASS = new c(lIIllIlIlIlII[20], lIIllIlIlIlII[21]);
        SWORDFISH = new c(lIIllIlIlIlII[22], lIIllIlIlIlII[23]);
        MONKFISH = new c(lIIllIlIlIlII[24], lIIllIlIlIlII[25]);
        KARAMBWAN = new c(lIIllIlIlIlII[26], lIIllIlIlIlII[27]);
        SHARK = new c(lIIllIlIlIlII[28], lIIllIlIlIlII[29]);
        SEA_TURTLE = new c(lIIllIlIlIlII[30], lIIllIlIlIlII[31]);
        MANTA_RAY = new c(lIIllIlIlIlII[32], lIIllIlIlIlII[33]);
        DARK_CRAB = new c(lIIllIlIlIlII[34], lIIllIlIlIlII[33]);
        c[] cArray = new c[lIIllIlIlIlII[35]];
        cArray[c.lIIllIlIlIlII[0]] = TROUT;
        cArray[c.lIIllIlIlIlII[3]] = PIKE;
        cArray[c.lIIllIlIlIlII[6]] = SALMON;
        cArray[c.lIIllIlIlIlII[9]] = TUNA;
        cArray[c.lIIllIlIlIlII[12]] = STEW;
        cArray[c.lIIllIlIlIlII[15]] = JUG_OF_WINE;
        cArray[c.lIIllIlIlIlII[17]] = LOBSTER;
        cArray[c.lIIllIlIlIlII[2]] = BASS;
        cArray[c.lIIllIlIlIlII[5]] = SWORDFISH;
        cArray[c.lIIllIlIlIlII[8]] = MONKFISH;
        cArray[c.lIIllIlIlIlII[11]] = KARAMBWAN;
        cArray[c.lIIllIlIlIlII[14]] = SHARK;
        cArray[c.lIIllIlIlIlII[19]] = SEA_TURTLE;
        cArray[c.lIIllIlIlIlII[21]] = MANTA_RAY;
        cArray[c.lIIllIlIlIlII[23]] = DARK_CRAB;
        $VALUES = cArray;
    }

    private static void lIllIIIIllIIIll() {
        lIIllIlIIllIl = new String[lIIllIlIlIlII[35]];
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[0]] = c."TROUT";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[3]] = c."PIKE";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[6]] = c."SALMON";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[9]] = c."TUNA";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[12]] = c."STEW";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[15]] = c."JUG_OF_WINE";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[17]] = c."LOBSTER";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[2]] = c."BASS";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[5]] = c."SWORDFISH";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[8]] = c."MONKFISH";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[11]] = c."KARAMBWAN";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[14]] = c."SHARK";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[19]] = c."SEA_TURTLE";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[21]] = c."MANTA_RAY";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[23]] = c."DARK_CRAB";
    }

    public int u() {
        return this.itemId;
    }

    private static String lIllIIIIlIIlIlI(String var7, String var6) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var16 = var6.toCharArray();
        int var2 = lIIllIlIlIlII[0];
        char[] var1 = var7.toCharArray();
        int var12 = var1.length;
        int var13 = lIIllIlIlIlII[0];
        while (c.lIllIIIIllIIlIl(var13, var12)) {
            char var19 = var1[var13];
            var3.append((char)(var19 ^ var16[var2 % var16.length]));
            0;
            ++var2;
            ++var13;
            0;
            if ((0x9E ^ 0x9A) > 2) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }
}

