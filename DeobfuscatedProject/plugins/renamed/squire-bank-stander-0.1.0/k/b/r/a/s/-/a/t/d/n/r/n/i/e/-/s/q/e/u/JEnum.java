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

public final class JEnum
extends Enum<j> {
    public static final /* synthetic */ /* enum */ j BRONZE;
    public static final /* synthetic */ /* enum */ j IRON;
    public static final /* synthetic */ /* enum */ j DRAGON;
    public static final /* synthetic */ /* enum */ j AMETHYST;
    private final /* synthetic */ int dartTipId;
    public static final /* synthetic */ /* enum */ j ADAMANT;
    private static final /* synthetic */ j[] $VALUES;
    public static final /* synthetic */ /* enum */ j STEEL;
    private static /* synthetic */ int[] lllIlIIlIIl;
    public static final /* synthetic */ /* enum */ j RUNE;
    private static /* synthetic */ String[] lllIlIIlIII;
    public static final /* synthetic */ /* enum */ j MITHRIL;

    private static void lIlIllllIlIllI() {
        lllIlIIlIIl = new int[17];
        j.lllIlIIlIIl[0] = (0x20 ^ 0x3E) & ~(0x8B ^ 0x95);
        j.lllIlIIlIIl[1] = -(106 + 9 - 91 + 109) & (0xFFFFFFFF & 0x3B7);
        j.lllIlIIlIIl[2] = 1;
        j.lllIlIIlIIl[3] = 0xFFFFA375 & 0x5FBE;
        j.lllIlIIlIIl[4] = 2;
        j.lllIlIIlIIl[5] = 0xFFFFCB7F & 0x37B5;
        j.lllIlIIlIIl[6] = 3;
        j.lllIlIIlIIl[7] = 0xFFFFCF7E & 0x33B7;
        j.lllIlIIlIIl[8] = 0x8C ^ 0x88;
        j.lllIlIIlIIl[9] = 0xFFFFCFBF & 0x3377;
        j.lllIlIIlIIl[10] = 0 ^ 0x70 ^ (0x12 ^ 0x67);
        j.lllIlIIlIIl[11] = -(0xFFFFF7F9 & 0x1CC7) & (0xFFFFBFFE & 0x57F9);
        j.lllIlIIlIIl[12] = 18 + 111 - 106 + 135 ^ 57 + 0 - -72 + 23;
        j.lllIlIIlIIl[13] = 0xFFFFFFFD & 0x64FF;
        j.lllIlIIlIIl[14] = 0x77 ^ 0x70;
        j.lllIlIIlIIl[15] = 0xFFFFAFF5 & 0x7BEA;
        j.lllIlIIlIIl[16] = 0xDF ^ 0xA9 ^ (0x63 ^ 0x1D);
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    private static void lIlIllllIlIlIl() {
        lllIlIIlIII = new String[lllIlIIlIIl[16]];
        j.lllIlIIlIII[j.lllIlIIlIIl[0]] = j."BRONZE";
        j.lllIlIIlIII[j.lllIlIIlIIl[2]] = j."IRON";
        j.lllIlIIlIII[j.lllIlIIlIIl[4]] = j."STEEL";
        j.lllIlIIlIII[j.lllIlIIlIIl[6]] = j."MITHRIL";
        j.lllIlIIlIII[j.lllIlIIlIIl[8]] = j."ADAMANT";
        j.lllIlIIlIII[j.lllIlIIlIIl[10]] = j."RUNE";
        j.lllIlIIlIII[j.lllIlIIlIIl[12]] = j."AMETHYST";
        j.lllIlIIlIII[j.lllIlIIlIIl[14]] = j."DRAGON";
    }

    public int D() {
        return this.dartTipId;
    }

    private static boolean lIlIllllIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIllllIlIlII(String var11, String var6) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var19 = lllIlIIlIIl[0];
        char[] var13 = var11.toCharArray();
        int var1 = var13.length;
        int var4 = lllIlIIlIIl[0];
        while (j.lIlIllllIlIlll(var4, var1)) {
            char var10 = var13[var4];
            var16.append((char)(var10 ^ var8[var19 % var8.length]));
            0;
            ++var19;
            ++var4;
            0;
            if (((0xBF ^ 0xB5) & ~(0x39 ^ 0x33)) < 1) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    static {
        j.lIlIllllIlIllI();
        j.lIlIllllIlIlIl();
        BRONZE = new j(lllIlIIlIIl[1]);
        IRON = new j(lllIlIIlIIl[3]);
        STEEL = new j(lllIlIIlIIl[5]);
        MITHRIL = new j(lllIlIIlIIl[7]);
        ADAMANT = new j(lllIlIIlIIl[9]);
        RUNE = new j(lllIlIIlIIl[11]);
        AMETHYST = new j(lllIlIIlIIl[13]);
        DRAGON = new j(lllIlIIlIIl[15]);
        j[] jArray = new j[lllIlIIlIIl[16]];
        jArray[j.lllIlIIlIIl[0]] = BRONZE;
        jArray[j.lllIlIIlIIl[2]] = IRON;
        jArray[j.lllIlIIlIIl[4]] = STEEL;
        jArray[j.lllIlIIlIIl[6]] = MITHRIL;
        jArray[j.lllIlIIlIIl[8]] = ADAMANT;
        jArray[j.lllIlIIlIIl[10]] = RUNE;
        jArray[j.lllIlIIlIIl[12]] = AMETHYST;
        jArray[j.lllIlIIlIIl[14]] = DRAGON;
        $VALUES = jArray;
    }

    private j(int n3) {
        this.dartTipId = n3;
    }

    private static String lIlIllllIlIIll(String var18, String var3) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lllIlIIlIIl[16]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lllIlIIlIIl[4], var7);
            return new String(var15.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    private static String lIlIllllIlIIlI(String var14, String var17) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lllIlIIlIIl[4], var9);
            return new String(var2.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }
}

