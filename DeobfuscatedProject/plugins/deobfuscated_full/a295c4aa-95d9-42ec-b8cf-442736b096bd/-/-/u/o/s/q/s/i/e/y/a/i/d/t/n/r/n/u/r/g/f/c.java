/*
 * Decompiled with CFR 0.152.
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class c
extends Enum<c> {
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ /* enum */ c ADAMANT_BAR;
    private static /* synthetic */ int[] llIlIlIIlIll;
    private final /* synthetic */ int productionSetting;
    public static final /* synthetic */ /* enum */ c IRON_BAR;
    public static final /* synthetic */ /* enum */ c BRONZE_BAR;
    private final /* synthetic */ int itemId;
    public static final /* synthetic */ /* enum */ c RUNE_BAR;
    private static /* synthetic */ String[] llIlIlIIlIlI;
    public static final /* synthetic */ /* enum */ c MITHRIL_BAR;
    public static final /* synthetic */ /* enum */ c STEEL_BAR;

    private static String lIIIIIlIlllIlII(String var15, String var10) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var10.toCharArray();
        int var16 = llIlIlIIlIll[0];
        char[] var19 = var15.toCharArray();
        int var6 = var19.length;
        int var2 = llIlIlIIlIll[0];
        while (c.lIIIIIlIllllIII(var2, var6)) {
            char var11 = var19[var2];
            var17.append((char)(var11 ^ var18[var16 % var18.length]));
            0;
            ++var16;
            ++var2;
            0;
            if (((0xE ^ 0x30) & ~(0x77 ^ 0x49)) == ((0x71 ^ 0x66) & ~(0x66 ^ 0x71))) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public int w() {
        return this.productionSetting;
    }

    private static String lIIIIIlIlllIIll(String var1, String var13) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(llIlIlIIlIll[4], var14);
            return new String(var3.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIlIlllIllI() {
        llIlIlIIlIlI = new String[llIlIlIIlIll[12]];
        c.llIlIlIIlIlI[c.llIlIlIIlIll[0]] = c."BRONZE_BAR";
        c.llIlIlIIlIlI[c.llIlIlIIlIll[2]] = c."IRON_BAR";
        c.llIlIlIIlIlI[c.llIlIlIIlIll[4]] = c."STEEL_BAR";
        c.llIlIlIIlIlI[c.llIlIlIIlIll[6]] = c."MITHRIL_BAR";
        c.llIlIlIIlIlI[c.llIlIlIIlIll[8]] = c."ADAMANT_BAR";
        c.llIlIlIIlIlI[c.llIlIlIIlIll[10]] = c."RUNE_BAR";
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static String lIIIIIlIlllIlIl(String var5, String var12) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), llIlIlIIlIll[13]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(llIlIlIIlIll[4], var8);
            return new String(var7.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        c.lIIIIIlIlllIlll();
        c.lIIIIIlIlllIllI();
        BRONZE_BAR = new c(llIlIlIIlIll[1], llIlIlIIlIll[2]);
        IRON_BAR = new c(llIlIlIIlIll[3], llIlIlIIlIll[4]);
        STEEL_BAR = new c(llIlIlIIlIll[5], llIlIlIIlIll[6]);
        MITHRIL_BAR = new c(llIlIlIIlIll[7], llIlIlIIlIll[8]);
        ADAMANT_BAR = new c(llIlIlIIlIll[9], llIlIlIIlIll[10]);
        RUNE_BAR = new c(llIlIlIIlIll[11], llIlIlIIlIll[12]);
        c[] cArray = new c[llIlIlIIlIll[12]];
        cArray[c.llIlIlIIlIll[0]] = BRONZE_BAR;
        cArray[c.llIlIlIIlIll[2]] = IRON_BAR;
        cArray[c.llIlIlIIlIll[4]] = STEEL_BAR;
        cArray[c.llIlIlIIlIll[6]] = MITHRIL_BAR;
        cArray[c.llIlIlIIlIll[8]] = ADAMANT_BAR;
        cArray[c.llIlIlIIlIll[10]] = RUNE_BAR;
        $VALUES = cArray;
    }

    private static void lIIIIIlIlllIlll() {
        llIlIlIIlIll = new int[14];
        c.llIlIlIIlIll[0] = (0x84 ^ 0x92) & ~(0xA ^ 0x1C);
        c.llIlIlIIlIll[1] = 0xFFFFDD2D & 0x2BFF;
        c.llIlIlIIlIll[2] = 1;
        c.llIlIlIIlIll[3] = -(0xFFFFA7C1 & 0x7EFF) & (0xFFFFBFEF & 0x6FFF);
        c.llIlIlIIlIll[4] = 2;
        c.llIlIlIIlIll[5] = -(0xFFFFEB5F & 0x56A3) & (0xFFFFDFBB & 0x6B77);
        c.llIlIlIIlIll[6] = 3;
        c.llIlIlIIlIll[7] = -(0xFFFFD657 & 0x7FE9) & (0xFFFFDF77 & Short.MAX_VALUE);
        c.llIlIlIIlIll[8] = 0x5E ^ 0x5A;
        c.llIlIlIIlIll[9] = -(0xFFFFC767 & 0x7E9D) & (0xFFFFFFBF & 0x4F7D);
        c.llIlIlIIlIll[10] = 0x6A ^ 0x16 ^ (9 ^ 0x70);
        c.llIlIlIIlIll[11] = -(0xFFFFFED3 & 0x35AD) & (0xFFFFBDBB & Short.MAX_VALUE);
        c.llIlIlIIlIll[12] = 0x35 ^ 0x33;
        c.llIlIlIIlIll[13] = 0x51 ^ 0x5E ^ (0x4D ^ 0x4A);
    }

    public int v() {
        return this.itemId;
    }

    private static boolean lIIIIIlIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    private c(int n3, int n4) {
        this.itemId = n3;
        this.productionSetting = n4;
    }
}

