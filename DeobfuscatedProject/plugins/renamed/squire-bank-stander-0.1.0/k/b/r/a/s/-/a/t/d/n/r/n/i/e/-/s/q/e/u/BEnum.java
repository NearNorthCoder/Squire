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

public final class BEnum
extends Enum<b> {
    public static final /* synthetic */ /* enum */ b FLETCH_CUTTING;
    public static final /* synthetic */ /* enum */ b JEWELRY;
    public static final /* synthetic */ /* enum */ b SMELTING;
    public static final /* synthetic */ /* enum */ b GLASS_MAKE;
    public static final /* synthetic */ /* enum */ b BOLTS;
    public static final /* synthetic */ /* enum */ b ARROWS;
    public static final /* synthetic */ /* enum */ b ZERO_TICK;
    public static final /* synthetic */ /* enum */ b CANNON_BALLS;
    public static final /* synthetic */ /* enum */ b COOKING;
    public static final /* synthetic */ /* enum */ b ENCHANT_BOLTS;
    public static final /* synthetic */ /* enum */ b DARTS;
    public static final /* synthetic */ /* enum */ b SMITHING;
    public static final /* synthetic */ /* enum */ b ALCHING;
    private static /* synthetic */ int[] lllIlIllIII;
    public static final /* synthetic */ /* enum */ b STRING_BOWS;
    public static final /* synthetic */ /* enum */ b ENCHANTING;
    public static final /* synthetic */ /* enum */ b WINES;
    public static final /* synthetic */ /* enum */ b ARMOUR;
    public static final /* synthetic */ /* enum */ b FURNACE_GLASS;
    private static final /* synthetic */ b[] $VALUES;
    public static final /* synthetic */ /* enum */ b BATTLESTAVES;
    public static final /* synthetic */ /* enum */ b GEM_CUTTING;
    private static /* synthetic */ String[] lllIlIlIlll;
    public static final /* synthetic */ /* enum */ b GLASS_BLOWING;

    private static String lIllIIIIIIIIIl(String var1, String var8) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lllIlIllIII[2], var17);
            return new String(var19.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private static void lIllIIIIIIIlII() {
        lllIlIlIlll = new String[lllIlIllIII[23]];
        b.lllIlIlIlll[b.lllIlIllIII[0]] = b."_";
        b.lllIlIlIlll[b.lllIlIllIII[1]] = b." ";
        b.lllIlIlIlll[b.lllIlIllIII[2]] = b."GEM_CUTTING";
        b.lllIlIlIlll[b.lllIlIllIII[3]] = b."BATTLESTAVES";
        b.lllIlIlIlll[b.lllIlIllIII[4]] = b."JEWELRY";
        b.lllIlIlIlll[b.lllIlIllIII[5]] = b."GLASS_BLOWING";
        b.lllIlIlIlll[b.lllIlIllIII[6]] = b."DARTS";
        b.lllIlIlIlll[b.lllIlIllIII[7]] = b."ARROWS";
        b.lllIlIlIlll[b.lllIlIllIII[8]] = b."FLETCH_CUTTING";
        b.lllIlIlIlll[b.lllIlIllIII[9]] = b."STRING_BOWS";
        b.lllIlIlIlll[b.lllIlIllIII[10]] = b."BOLTS";
        b.lllIlIlIlll[b.lllIlIllIII[11]] = b."COOKING";
        b.lllIlIlIlll[b.lllIlIllIII[12]] = b."WINES";
        b.lllIlIlIlll[b.lllIlIllIII[13]] = b."ALCHING";
        b.lllIlIlIlll[b.lllIlIllIII[14]] = b."GLASS_MAKE";
        b.lllIlIlIlll[b.lllIlIllIII[15]] = b."ENCHANTING";
        b.lllIlIlIlll[b.lllIlIllIII[16]] = b."SMITHING";
        b.lllIlIlIlll[b.lllIlIllIII[17]] = b."ARMOUR";
        b.lllIlIlIlll[b.lllIlIllIII[18]] = b."SMELTING";
        b.lllIlIlIlll[b.lllIlIllIII[19]] = b."CANNON_BALLS";
        b.lllIlIlIlll[b.lllIlIllIII[20]] = b."ENCHANT_BOLTS";
        b.lllIlIlIlll[b.lllIlIllIII[21]] = b."ZERO_TICK";
        b.lllIlIlIlll[b.lllIlIllIII[22]] = b."FURNACE_GLASS";
    }

    public String toString() {
        String string = super.toString();
        char c2 = string.charAt(lllIlIllIII[0]);
        return c2 + string.replaceAll(lllIlIlIlll[lllIlIllIII[0]], lllIlIlIlll[lllIlIllIII[1]]).substring(lllIlIllIII[1]).toLowerCase();
    }

    private static void lIllIIIIIIIlIl() {
        lllIlIllIII = new int[24];
        b.lllIlIllIII[0] = (0x42 ^ 0x1B ^ (0x4D ^ 0x74)) & (0xF ^ 0x17 ^ (0x76 ^ 0xE) ^ -1);
        b.lllIlIllIII[1] = 1;
        b.lllIlIllIII[2] = 2;
        b.lllIlIllIII[3] = 3;
        b.lllIlIllIII[4] = 0x81 ^ 0x85;
        b.lllIlIllIII[5] = 0xB4 ^ 0xB1;
        b.lllIlIllIII[6] = 0xA4 ^ 0xA2;
        b.lllIlIllIII[7] = 0x22 ^ 0x25;
        b.lllIlIllIII[8] = 0x6B ^ 0x63;
        b.lllIlIllIII[9] = 0x3D ^ 0xC ^ (0x51 ^ 0x69);
        b.lllIlIllIII[10] = 0xD6 ^ 0x92 ^ (0x7C ^ 0x32);
        b.lllIlIllIII[11] = 0x92 ^ 0x99;
        b.lllIlIllIII[12] = 0xA4 ^ 0xA8;
        b.lllIlIllIII[13] = 0x23 ^ 0x69 ^ (0x64 ^ 0x23);
        b.lllIlIllIII[14] = 0x9F ^ 0xA0 ^ (0x6E ^ 0x5F);
        b.lllIlIllIII[15] = 160 + 152 - 185 + 40 ^ 155 + 30 - 58 + 41;
        b.lllIlIllIII[16] = 0xBB ^ 0xAB;
        b.lllIlIllIII[17] = 4 ^ 0x30 ^ (0x52 ^ 0x77);
        b.lllIlIllIII[18] = 154 + 57 - 68 + 24 ^ 125 + 164 - 154 + 46;
        b.lllIlIllIII[19] = 0x63 ^ 0x70;
        b.lllIlIllIII[20] = 0x12 ^ 6;
        b.lllIlIllIII[21] = 104 + 27 - 124 + 126 ^ 27 + 21 - 19 + 115;
        b.lllIlIllIII[22] = 0x5E ^ 0x48;
        b.lllIlIllIII[23] = 0x40 ^ 0x57;
    }

    static {
        b.lIllIIIIIIIlIl();
        b.lIllIIIIIIIlII();
        GEM_CUTTING = new b();
        BATTLESTAVES = new b();
        JEWELRY = new b();
        GLASS_BLOWING = new b();
        DARTS = new b();
        ARROWS = new b();
        FLETCH_CUTTING = new b();
        STRING_BOWS = new b();
        BOLTS = new b();
        COOKING = new b();
        WINES = new b();
        ALCHING = new b();
        GLASS_MAKE = new b();
        ENCHANTING = new b();
        SMITHING = new b();
        ARMOUR = new b();
        SMELTING = new b();
        CANNON_BALLS = new b();
        ENCHANT_BOLTS = new b();
        ZERO_TICK = new b();
        FURNACE_GLASS = new b();
        b[] bArray = new b[lllIlIllIII[21]];
        bArray[b.lllIlIllIII[0]] = GEM_CUTTING;
        bArray[b.lllIlIllIII[1]] = BATTLESTAVES;
        bArray[b.lllIlIllIII[2]] = JEWELRY;
        bArray[b.lllIlIllIII[3]] = GLASS_BLOWING;
        bArray[b.lllIlIllIII[4]] = DARTS;
        bArray[b.lllIlIllIII[5]] = ARROWS;
        bArray[b.lllIlIllIII[6]] = FLETCH_CUTTING;
        bArray[b.lllIlIllIII[7]] = STRING_BOWS;
        bArray[b.lllIlIllIII[8]] = BOLTS;
        bArray[b.lllIlIllIII[9]] = COOKING;
        bArray[b.lllIlIllIII[10]] = WINES;
        bArray[b.lllIlIllIII[11]] = ALCHING;
        bArray[b.lllIlIllIII[12]] = GLASS_MAKE;
        bArray[b.lllIlIllIII[13]] = ENCHANTING;
        bArray[b.lllIlIllIII[14]] = SMITHING;
        bArray[b.lllIlIllIII[15]] = ARMOUR;
        bArray[b.lllIlIllIII[16]] = SMELTING;
        bArray[b.lllIlIllIII[17]] = CANNON_BALLS;
        bArray[b.lllIlIllIII[18]] = ENCHANT_BOLTS;
        bArray[b.lllIlIllIII[19]] = ZERO_TICK;
        bArray[b.lllIlIllIII[20]] = FURNACE_GLASS;
        $VALUES = bArray;
    }

    private static String lIllIIIIIIIIll(String var9, String var15) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lllIlIllIII[8]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lllIlIllIII[2], var6);
            return new String(var5.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIIIIIIlI(String var18, String var16) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var4 = var16.toCharArray();
        int var14 = lllIlIllIII[0];
        char[] var7 = var18.toCharArray();
        int var12 = var7.length;
        int var11 = lllIlIllIII[0];
        while (b.lIllIIIIIIIllI(var11, var12)) {
            char var10 = var7[var11];
            var2.append((char)(var10 ^ var4[var14 % var4.length]));
            0;
            ++var14;
            ++var11;
            0;
            if (2 >= ((73 + 150 - 125 + 105 ^ 170 + 65 - 163 + 99) & (78 + 74 - -21 + 30 ^ 119 + 30 - 48 + 70 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static boolean lIllIIIIIIIllI(int n2, int n3) {
        return n2 < n3;
    }
}

