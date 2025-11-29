/*
 * Decompiled with CFR 0.152.
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class d
extends Enum<d> {
    public static final /* synthetic */ /* enum */ d RING_OF_RECOIL;
    public static final /* synthetic */ /* enum */ d CHAOS_RUNE;
    private /* synthetic */ int amount;
    public static final /* synthetic */ /* enum */ d ANTI_VENOM;
    public static final /* synthetic */ /* enum */ d FIRE_RUNE;
    public static final /* synthetic */ /* enum */ d DEATH_RUNE;
    public static final /* synthetic */ /* enum */ d ZUL_ANDRA_TELEPORT;
    public static final /* synthetic */ /* enum */ d RANGING_POTION;
    public static final /* synthetic */ /* enum */ d RING_OF_WEALTH;
    private static /* synthetic */ String[] lIllIlIlllIIl;
    private /* synthetic */ int id;
    private static /* synthetic */ int[] lIllIllIIIIIl;
    private /* synthetic */ int price;
    public static final /* synthetic */ /* enum */ d SHARK;
    private /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ d PRAYER_POTION;
    public static final /* synthetic */ /* enum */ d ADAMANT_DART;
    public static final /* synthetic */ /* enum */ d COOKED_KARAMBWAN;
    public static final /* synthetic */ /* enum */ d ZULRAH_SCALES;
    public static final /* synthetic */ /* enum */ d LUMBRIDGE_TELEPORT;
    public static final /* synthetic */ /* enum */ d RING_OF_DUELING;
    private static final /* synthetic */ d[] $VALUES;
    public static final /* synthetic */ /* enum */ d MAGIC_POTION;

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public int o() {
        return this.price;
    }

    public void a(String string) {
        this.name = string;
    }

    static {
        d.llIIlIIIlIIlIll();
        d.llIIlIIIlIIIllI();
        RING_OF_DUELING = new d(lIllIllIIIIIl[1], lIllIllIIIIIl[2], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[3]]);
        RING_OF_RECOIL = new d(lIllIllIIIIIl[5], lIllIllIIIIIl[6], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[7]]);
        RING_OF_WEALTH = new d(lIllIllIIIIIl[9], lIllIllIIIIIl[10], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[10]]);
        LUMBRIDGE_TELEPORT = new d(lIllIllIIIIIl[12], lIllIllIIIIIl[13], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[14]]);
        ZUL_ANDRA_TELEPORT = new d(lIllIllIIIIIl[16], lIllIllIIIIIl[17], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[18]]);
        FIRE_RUNE = new d(lIllIllIIIIIl[19], lIllIllIIIIIl[20], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[21]]);
        CHAOS_RUNE = new d(lIllIllIIIIIl[23], lIllIllIIIIIl[24], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[25]]);
        DEATH_RUNE = new d(lIllIllIIIIIl[27], lIllIllIIIIIl[24], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[2]]);
        SHARK = new d(lIllIllIIIIIl[29], lIllIllIIIIIl[30], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[31]]);
        ANTI_VENOM = new d(lIllIllIIIIIl[33], lIllIllIIIIIl[17], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[34]]);
        RANGING_POTION = new d(lIllIllIIIIIl[36], lIllIllIIIIIl[17], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[37]]);
        MAGIC_POTION = new d(lIllIllIIIIIl[39], lIllIllIIIIIl[17], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[40]]);
        PRAYER_POTION = new d(lIllIllIIIIIl[42], lIllIllIIIIIl[17], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[43]]);
        ADAMANT_DART = new d(lIllIllIIIIIl[45], lIllIllIIIIIl[46], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[47]]);
        COOKED_KARAMBWAN = new d(lIllIllIIIIIl[49], lIllIllIIIIIl[50], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[51]]);
        ZULRAH_SCALES = new d(lIllIllIIIIIl[52], lIllIllIIIIIl[46], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[53]]);
        d[] dArray = new d[lIllIllIIIIIl[28]];
        dArray[d.lIllIllIIIIIl[0]] = RING_OF_DUELING;
        dArray[d.lIllIllIIIIIl[3]] = RING_OF_RECOIL;
        dArray[d.lIllIllIIIIIl[4]] = RING_OF_WEALTH;
        dArray[d.lIllIllIIIIIl[7]] = LUMBRIDGE_TELEPORT;
        dArray[d.lIllIllIIIIIl[8]] = ZUL_ANDRA_TELEPORT;
        dArray[d.lIllIllIIIIIl[10]] = FIRE_RUNE;
        dArray[d.lIllIllIIIIIl[11]] = CHAOS_RUNE;
        dArray[d.lIllIllIIIIIl[14]] = DEATH_RUNE;
        dArray[d.lIllIllIIIIIl[15]] = SHARK;
        dArray[d.lIllIllIIIIIl[18]] = ANTI_VENOM;
        dArray[d.lIllIllIIIIIl[13]] = RANGING_POTION;
        dArray[d.lIllIllIIIIIl[21]] = MAGIC_POTION;
        dArray[d.lIllIllIIIIIl[22]] = PRAYER_POTION;
        dArray[d.lIllIllIIIIIl[25]] = ADAMANT_DART;
        dArray[d.lIllIllIIIIIl[26]] = COOKED_KARAMBWAN;
        dArray[d.lIllIllIIIIIl[2]] = ZULRAH_SCALES;
        $VALUES = dArray;
    }

    private static void llIIlIIIlIIIllI() {
        lIllIlIlllIIl = new String[lIllIllIIIIIl[54]];
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[0]] = d."RING_OF_DUELING";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[3]] = d."Ring of dueling(8)";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[4]] = d."RING_OF_RECOIL";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[7]] = d."Ring of recoil";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[8]] = d."RING_OF_WEALTH";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[10]] = d."Ring of wealth (5)";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[11]] = d."LUMBRIDGE_TELEPORT";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[14]] = d."Lumbridge teleport";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[15]] = d."ZUL_ANDRA_TELEPORT";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[18]] = d."Zul-andra teleport";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[13]] = d."FIRE_RUNE";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[21]] = d."Fire rune";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[22]] = d."CHAOS_RUNE";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[25]] = d."Chaos rune";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[26]] = d."DEATH_RUNE";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[2]] = d."Death rune";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[28]] = d."SHARK";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[31]] = d."Shark";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[32]] = d."ANTI_VENOM";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[34]] = d."Anti-venom+(4)";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[35]] = d."RANGING_POTION";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[37]] = d."Ranging potion(4)";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[38]] = d."MAGIC_POTION";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[40]] = d."Magic potion(4)";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[41]] = d."PRAYER_POTION";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[43]] = d."Prayer potion(4)";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[44]] = d."ADAMANT_DART";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[47]] = d."Adamant dart";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[48]] = d."COOKED_KARAMBWAN";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[51]] = d."Cooked karambwan";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[17]] = d."ZULRAH_SCALES";
        d.lIllIlIlllIIl[d.lIllIllIIIIIl[53]] = d."Zulrah's scales";
    }

    private static String llIIlIIIIllllIl(String var23, String var10) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lIllIllIIIIIl[15]), "DES");
            Cipher var20 = Cipher.getInstance("DES");
            var20.init(lIllIllIIIIIl[4], var19);
            return new String(var20.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    public int n() {
        return this.amount;
    }

    private static void llIIlIIIlIIlIll() {
        lIllIllIIIIIl = new int[55];
        d.lIllIllIIIIIl[0] = (95 + 189 - 154 + 111 ^ 77 + 0 - 76 + 175) & (46 + 3 - -61 + 108 ^ 127 + 77 - 199 + 150 ^ -1);
        d.lIllIllIIIIIl[1] = -(0xFFFFE7C7 & 0x7C3E) & (0xFFFFFFFF & 0x6DFD);
        d.lIllIllIIIIIl[2] = 0x40 ^ 0x4F;
        d.lIllIllIIIIIl[3] = 1;
        d.lIllIllIIIIIl[4] = 2;
        d.lIllIllIIIIIl[5] = -(0xFFFFFB79 & 0x368F) & (0xFFFFFFFE & 0x3BFF);
        d.lIllIllIIIIIl[6] = 38 + 75 - 82 + 119;
        d.lIllIllIIIIIl[7] = 3;
        d.lIllIllIIIIIl[8] = 0x5F ^ 0x5B;
        d.lIllIllIIIIIl[9] = -(0xFFFFDCDE & 0x7333) & (0xFFFFFFFD & 0x7EDF);
        d.lIllIllIIIIIl[10] = 63 + 163 - 98 + 48 ^ 165 + 92 - 171 + 95;
        d.lIllIllIIIIIl[11] = 65 + 84 - 121 + 107 ^ 99 + 76 - 81 + 35;
        d.lIllIllIIIIIl[12] = -(0xFFFFC976 & 0x76BF) & (0xFFFFDFFF & 0x7F7D);
        d.lIllIllIIIIIl[13] = 0x5D ^ 0x11 ^ (0x53 ^ 0x15);
        d.lIllIllIIIIIl[14] = 0x56 ^ 0x51;
        d.lIllIllIIIIIl[15] = 0x1A ^ 0x27 ^ (0xBC ^ 0x89);
        d.lIllIllIIIIIl[16] = -(0xFFFFDF6D & 0x6C97) & (0xFFFFFEBE & 0x7FCF);
        d.lIllIllIIIIIl[17] = 0x1B ^ 0x2A ^ (0xC ^ 0x23);
        d.lIllIllIIIIIl[18] = 82 + 102 - 42 + 21 ^ 144 + 113 - 92 + 5;
        d.lIllIllIIIIIl[19] = 0xFFFFB7FB & 0x4A2E;
        d.lIllIllIIIIIl[20] = 0xFFFFDF4E & 0x3DFD;
        d.lIllIllIIIIIl[21] = 24 + 11 - -35 + 65 ^ 20 + 71 - 27 + 76;
        d.lIllIllIIIIIl[22] = 0x48 ^ 0x44;
        d.lIllIllIIIIIl[23] = 0xFFFF97B7 & 0x6A7A;
        d.lIllIllIIIIIl[24] = -(0xFFFFD3AA & 0x2E7F) & (0xFFFFFFEF & 0xBFD);
        d.lIllIllIIIIIl[25] = 41 + 57 - -27 + 7 ^ 28 + 107 - 106 + 108;
        d.lIllIllIIIIIl[26] = 0x84 ^ 0x8A;
        d.lIllIllIIIIIl[27] = -(0xFFFFB9EE & 0x6F5D) & (0xFFFFFFFF & 0x2B7B);
        d.lIllIllIIIIIl[28] = 70 + 15 - -45 + 9 ^ 31 + 105 - 126 + 145;
        d.lIllIllIIIIIl[29] = -(0xFFFFCA7F & 0x7DB7) & (0xFFFFEFF7 & 0x59BF);
        d.lIllIllIIIIIl[30] = -(0xFFFFFD17 & 0x7EEC) & (0xFFFFFFFF & 0x7DF7);
        d.lIllIllIIIIIl[31] = 0xF1 ^ 0xAA ^ (9 ^ 0x43);
        d.lIllIllIIIIIl[32] = 0x64 ^ 0x6D ^ (0xAA ^ 0xB1);
        d.lIllIllIIIIIl[33] = 0xFFFFF779 & 0x3AF7;
        d.lIllIllIIIIIl[34] = 0x19 ^ 0xA;
        d.lIllIllIIIIIl[35] = 0x5B ^ 0x4F;
        d.lIllIllIIIIIl[36] = -(0xFFFFB67B & 0x6FF6) & (0xFFFFAFFF & 0x7FFD);
        d.lIllIllIIIIIl[37] = 23 + 32 - 7 + 164 ^ 136 + 46 - 152 + 163;
        d.lIllIllIIIIIl[38] = 0xFC ^ 0xA7 ^ (0x56 ^ 0x1B);
        d.lIllIllIIIIIl[39] = -(0xFFFFA6FD & 0x5D1B) & (0xFFFF9FFB & 0x6FFC);
        d.lIllIllIIIIIl[40] = 7 + 206 - 70 + 70 ^ 23 + 63 - 53 + 161;
        d.lIllIllIIIIIl[41] = 0x88 ^ 0x90;
        d.lIllIllIIIIIl[42] = 0xFFFF8DF3 & 0x7B8E;
        d.lIllIllIIIIIl[43] = 2 ^ 0x12 ^ (0x85 ^ 0x8C);
        d.lIllIllIIIIIl[44] = 0x43 ^ 0x59;
        d.lIllIllIIIIIl[45] = -(0xFFFFE6D7 & 0x1DA9) & (0xFFFF87AB & 0x7FFE);
        d.lIllIllIIIIIl[46] = 0xFFFF8FE8 & 0x73FF;
        d.lIllIllIIIIIl[47] = 0x5A ^ 0x29 ^ (0x32 ^ 0x5A);
        d.lIllIllIIIIIl[48] = 0x4C ^ 0x50;
        d.lIllIllIIIIIl[49] = 0xFFFFDFFD & 0x2C4A;
        d.lIllIllIIIIIl[50] = 222 + 20 - 36 + 24 ^ 56 + 103 - 68 + 39;
        d.lIllIllIIIIIl[51] = 0x3D ^ 0x20;
        d.lIllIllIIIIIl[52] = 0xFFFFBADF & 0x77A6;
        d.lIllIllIIIIIl[53] = 0x92 ^ 0x8D;
        d.lIllIllIIIIIl[54] = 34 + 44 - -10 + 49 ^ 55 + 4 - -19 + 91;
    }

    private static boolean llIIlIIIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIIIlIIllIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public static d b(int n2) {
        void var17;
        d[] dArray = d.values();
        int n3 = dArray.length;
        int var12 = lIllIllIIIIIl[0];
        while (d.llIIlIIIlIIllII(var12, (int)var17)) {
            int var2;
            void var15;
            void var8 = var15[var12];
            if (d.llIIlIIIlIIllIl(var8.m(), var2)) {
                return var8;
            }
            ++var12;
            0;
            if ((0x64 ^ 0x7D ^ (0xDE ^ 0xC3)) >= 2) continue;
            return null;
        }
        return null;
    }

    public void c(int n2) {
        this.id = n2;
    }

    private static String llIIlIIIIllIIIl(String var16, String var4) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var5 = var4.toCharArray();
        int var13 = lIllIllIIIIIl[0];
        char[] var14 = var16.toCharArray();
        int var11 = var14.length;
        int var6 = lIllIllIIIIIl[0];
        while (d.llIIlIIIlIIllII(var6, var11)) {
            char var21 = var14[var6];
            var22.append((char)(var21 ^ var5[var13 % var5.length]));
            0;
            ++var13;
            ++var6;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    public String k() {
        return this.name;
    }

    private static String llIIlIIIIllIIlI(String var7, String var18) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIllIllIIIIIl[4], var9);
            return new String(var3.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    public void d(int n2) {
        this.amount = n2;
    }

    public int m() {
        return this.id;
    }

    public void e(int n2) {
        this.price = n2;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private d(int n3, int n4, int n5, String string2) {
        this.id = n3;
        this.amount = n4;
        this.price = n5;
        this.name = string2;
    }
}

