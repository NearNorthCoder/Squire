/*
 * Decompiled with CFR 0.152.
 */
package r.e.o.r.h.s.b.e.q.l.e.u.-.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.c;

public final class b
extends Enum<b> {
    public static final /* synthetic */ /* enum */ b LANTADYME;
    public static final /* synthetic */ /* enum */ b TORSTOL;
    public static final /* synthetic */ /* enum */ b CADANTINE;
    public static final /* synthetic */ /* enum */ b TARROMIN;
    public static final /* synthetic */ /* enum */ b DWARF_WEED;
    public static final /* synthetic */ /* enum */ b TOADFLAX;
    private final /* synthetic */ int unfPotionId;
    private static /* synthetic */ int[] lllIIlllllll;
    public static final /* synthetic */ /* enum */ b AVANTOE;
    public static final /* synthetic */ /* enum */ b MARRENTILL;
    private final /* synthetic */ int cleanId;
    public static final /* synthetic */ /* enum */ b IRIT_LEAF;
    private static /* synthetic */ String[] lllIIllllllI;
    public static final /* synthetic */ /* enum */ b KWUARM;
    public static final /* synthetic */ /* enum */ b GUAM_LEAF;
    public static final /* synthetic */ /* enum */ b RANARR_WEED;
    private static final /* synthetic */ b[] $VALUES;
    public static final /* synthetic */ /* enum */ b SNAPDRAGON;
    private final /* synthetic */ int grimyId;
    public static final /* synthetic */ /* enum */ b HARRALANDER;

    /*
     * WARNING - void declaration
     */
    public static b a(Integer n) {
        void var15;
        b[] bArray = b.values();
        int n2 = bArray.length;
        int var23 = lllIIlllllll[0];
        while (b.lIIIlIllIlIllII(var23, (int)var15)) {
            Integer var2;
            void var26;
            void var19 = var26[var23];
            if (b.lIIIlIllIlIllIl(var19.a(var2) ? 1 : 0)) {
                return var19;
            }
            ++var23;
            0;
            if (((0x12 ^ 0x3A) & ~(0x62 ^ 0x4A)) <= 1) continue;
            return null;
        }
        return null;
    }

    public int e() {
        return this.grimyId;
    }

    private b(int n2, int n3, int n4) {
        this.grimyId = n2;
        this.cleanId = n3;
        this.unfPotionId = n4;
    }

    private static boolean lIIIlIllIlIllIl(int n) {
        return n != 0;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static boolean lIIIlIllIlIllII(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIIlIllIlIlllI(int n, int n2) {
        return n != n2;
    }

    private static String lIIIlIllIlIIlll(String var14, String var6) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lllIIlllllll[32]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lllIIlllllll[8], var20);
            return new String(var10.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIllIlIlIII(String var4, String var17) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var9 = var17.toCharArray();
        int var13 = lllIIlllllll[0];
        char[] var24 = var4.toCharArray();
        int var18 = var24.length;
        int var5 = lllIIlllllll[0];
        while (b.lIIIlIllIlIllII(var5, var18)) {
            char var11 = var24[var5];
            var1.append((char)(var11 ^ var9[var13 % var9.length]));
            0;
            ++var13;
            ++var5;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    public int g() {
        return this.unfPotionId;
    }

    private static void lIIIlIllIlIlIll() {
        lllIIlllllll = new int[57];
        b.lllIIlllllll[0] = (1 ^ 8) & ~(0xBC ^ 0xB5);
        b.lllIIlllllll[1] = 1;
        b.lllIIlllllll[2] = (0x31 ^ 0x78) + (0x31 ^ 0x6A) - -(0x45 ^ 0x56) + (0x33 ^ 0x23);
        b.lllIIlllllll[3] = 55 + 98 - 83 + 94 + (0x7B ^ 0x2C) - (157 + 118 - 57 + 15) + (13 + 142 - -27 + 49);
        b.lllIIlllllll[4] = 0x5B ^ 0;
        b.lllIIlllllll[5] = 188 + 88 - 169 + 94;
        b.lllIIlllllll[6] = 101 + 122 - 202 + 192 + (144 + 36 - 103 + 73) - (53 + 16 - 57 + 175) + (0xF5 ^ 0xBE);
        b.lllIIlllllll[7] = 0x73 ^ 0x2E;
        b.lllIIlllllll[8] = 2;
        b.lllIIlllllll[9] = (0x38 ^ 0x73) + (0 ^ 0x66) - (0x51 ^ 0x3C) + (20 + 19 - 8 + 104);
        b.lllIIlllllll[10] = 63 + 150 - 179 + 167 + (0x3B ^ 9) - (0xD0 ^ 0x82) + (0x56 ^ 2);
        b.lllIIlllllll[11] = 0xF6 ^ 0x90 ^ (0xB0 ^ 0x89);
        b.lllIIlllllll[12] = 3;
        b.lllIIlllllll[13] = 138 + 138 - 156 + 67 + (88 + 64 - 100 + 81) - (141 + 5 - 3 + 10) + (0x2B ^ 0xD);
        b.lllIIlllllll[14] = 97 + 99 - 13 + 72;
        b.lllIIlllllll[15] = 91 + 111 - 52 + 44 ^ 11 + 0 - -79 + 73;
        b.lllIIlllllll[16] = 0x67 ^ 0x63;
        b.lllIIlllllll[17] = 80 + 133 - 132 + 54 + (71 + 93 - 94 + 87) - (127 + 0 - 11 + 13) + (0x68 ^ 0x44);
        b.lllIIlllllll[18] = 0xFFFF8555 & 0x7BAB;
        b.lllIIlllllll[19] = 134 + 45 - 20 + 38 ^ 60 + 19 - 44 + 131;
        b.lllIIlllllll[20] = 0x90 ^ 0x95;
        b.lllIIlllllll[21] = 0xFFFFABFF & 0x5FE9;
        b.lllIIlllllll[22] = 0xFFFFDBB7 & 0x2FFE;
        b.lllIIlllllll[23] = -(0xFFFFDCF9 & 0x7747) & (0xFFFFDFFF & 0x7FFA);
        b.lllIIlllllll[24] = 133 + 59 - 23 + 25 ^ 30 + 169 - 110 + 107;
        b.lllIIlllllll[25] = (0x85 ^ 0xB4) + (58 + 92 - 132 + 114) - (108 + 32 - 114 + 114) + (66 + 26 - -12 + 64);
        b.lllIIlllllll[26] = -(0xFFFFBF7F & 0x7AED) & (0xFFFFFB7F & 0x3FEF);
        b.lllIIlllllll[27] = 93 + 102 - 47 + 63 ^ 42 + 138 - 137 + 139;
        b.lllIIlllllll[28] = 0x79 ^ 0x7E;
        b.lllIIlllllll[29] = 92 + 124 - 210 + 205;
        b.lllIIlllllll[30] = 0xFFFFC777 & 0x398D;
        b.lllIIlllllll[31] = 0x7A ^ 0x55 ^ (0x66 ^ 0x2E);
        b.lllIIlllllll[32] = 106 + 34 - 81 + 108 ^ 11 + 158 - 12 + 18;
        b.lllIIlllllll[33] = 45 + 1 - -119 + 48;
        b.lllIIlllllll[34] = -(0xFFFFE86F & 0x3799) & (0xFFFFB73F & 0x69CF);
        b.lllIIlllllll[35] = 0xAD ^ 0xC4;
        b.lllIIlllllll[36] = 0x85 ^ 0x96 ^ (9 ^ 0x13);
        b.lllIIlllllll[37] = 0xFFFF8FFB & 0x7BEF;
        b.lllIIlllllll[38] = -(0xFFFFD1F5 & 0x3E0F) & (0xFFFF9FFE & 0x7BBD);
        b.lllIIlllllll[39] = -(0xFFFFB0EF & 0x7F12) & (0xFFFFBFFD & 0x7BBF);
        b.lllIIlllllll[40] = 0x75 ^ 0x7F;
        b.lllIIlllllll[41] = 46 + 185 - 206 + 190;
        b.lllIIlllllll[42] = 0xFFFF9569 & 0x6B9F;
        b.lllIIlllllll[43] = 0x79 ^ 0x7F ^ (0xF5 ^ 0x98);
        b.lllIIlllllll[44] = 130 + 146 - 132 + 31 ^ 66 + 18 - 65 + 145;
        b.lllIIlllllll[45] = 0xFFFFB9BD & 0x4FF7;
        b.lllIIlllllll[46] = 0xFFFFBBB3 & 0x4DFD;
        b.lllIIlllllll[47] = -(0xFFFFEE9F & 0x7769) & (0xFFFFEFBB & Short.MAX_VALUE);
        b.lllIIlllllll[48] = 0x66 ^ 0x6A;
        b.lllIIlllllll[49] = 39 + 30 - -55 + 93;
        b.lllIIlllllll[50] = 0xFFFFE53B & 0x1BCF;
        b.lllIIlllllll[51] = 0x25 ^ 0x48;
        b.lllIIlllllll[52] = 135 + 155 - 289 + 166 ^ 136 + 30 - 108 + 112;
        b.lllIIlllllll[53] = 33 + 56 - -93 + 37;
        b.lllIIlllllll[54] = 0xFFFFD78F & 0x297D;
        b.lllIIlllllll[55] = 0x11 ^ 0x7E;
        b.lllIIlllllll[56] = 0x8E ^ 0x80;
    }

    private static String lIIIlIllIlIlIIl(String var22, String var12) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(lllIIlllllll[8], var7);
            return new String(var16.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public int f() {
        return this.cleanId;
    }

    private static void lIIIlIllIlIlIlI() {
        lllIIllllllI = new String[lllIIlllllll[56]];
        b.lllIIllllllI[b.lllIIlllllll[0]] = b."GUAM_LEAF";
        b.lllIIllllllI[b.lllIIlllllll[1]] = b."MARRENTILL";
        b.lllIIllllllI[b.lllIIlllllll[8]] = b."TARROMIN";
        b.lllIIllllllI[b.lllIIlllllll[12]] = b."HARRALANDER";
        b.lllIIllllllI[b.lllIIlllllll[16]] = b."RANARR_WEED";
        b.lllIIllllllI[b.lllIIlllllll[20]] = b."TOADFLAX";
        b.lllIIllllllI[b.lllIIlllllll[24]] = b."IRIT_LEAF";
        b.lllIIllllllI[b.lllIIlllllll[28]] = b."AVANTOE";
        b.lllIIllllllI[b.lllIIlllllll[32]] = b."KWUARM";
        b.lllIIllllllI[b.lllIIlllllll[36]] = b."SNAPDRAGON";
        b.lllIIllllllI[b.lllIIlllllll[40]] = b."CADANTINE";
        b.lllIIllllllI[b.lllIIlllllll[44]] = b."LANTADYME";
        b.lllIIllllllI[b.lllIIlllllll[48]] = b."DWARF_WEED";
        b.lllIIllllllI[b.lllIIlllllll[52]] = b."TORSTOL";
    }

    /*
     * WARNING - void declaration
     */
    public c b(int n) {
        b var25;
        void var8;
        if (b.lIIIlIllIlIllll(n, this.grimyId)) {
            return c.CLEAN_HERBS;
        }
        if (b.lIIIlIllIlIllll((int)var8, var25.cleanId)) {
            return c.MAKE_UNF_POTS;
        }
        if (b.lIIIlIllIlIllll((int)var8, var25.unfPotionId)) {
            return c.FINISH_POTS;
        }
        return null;
    }

    private static boolean lIIIlIllIlIllll(int n, int n2) {
        return n == n2;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    static {
        b.lIIIlIllIlIlIll();
        b.lIIIlIllIlIlIlI();
        GUAM_LEAF = new b(lllIIlllllll[2], lllIIlllllll[3], lllIIlllllll[4]);
        MARRENTILL = new b(lllIIlllllll[5], lllIIlllllll[6], lllIIlllllll[7]);
        TARROMIN = new b(lllIIlllllll[9], lllIIlllllll[10], lllIIlllllll[11]);
        HARRALANDER = new b(lllIIlllllll[13], lllIIlllllll[14], lllIIlllllll[15]);
        RANARR_WEED = new b(lllIIlllllll[17], lllIIlllllll[18], lllIIlllllll[19]);
        TOADFLAX = new b(lllIIlllllll[21], lllIIlllllll[22], lllIIlllllll[23]);
        IRIT_LEAF = new b(lllIIlllllll[25], lllIIlllllll[26], lllIIlllllll[27]);
        AVANTOE = new b(lllIIlllllll[29], lllIIlllllll[30], lllIIlllllll[31]);
        KWUARM = new b(lllIIlllllll[33], lllIIlllllll[34], lllIIlllllll[35]);
        SNAPDRAGON = new b(lllIIlllllll[37], lllIIlllllll[38], lllIIlllllll[39]);
        CADANTINE = new b(lllIIlllllll[41], lllIIlllllll[42], lllIIlllllll[43]);
        LANTADYME = new b(lllIIlllllll[45], lllIIlllllll[46], lllIIlllllll[47]);
        DWARF_WEED = new b(lllIIlllllll[49], lllIIlllllll[50], lllIIlllllll[51]);
        TORSTOL = new b(lllIIlllllll[53], lllIIlllllll[54], lllIIlllllll[55]);
        b[] bArray = new b[lllIIlllllll[56]];
        bArray[b.lllIIlllllll[0]] = GUAM_LEAF;
        bArray[b.lllIIlllllll[1]] = MARRENTILL;
        bArray[b.lllIIlllllll[8]] = TARROMIN;
        bArray[b.lllIIlllllll[12]] = HARRALANDER;
        bArray[b.lllIIlllllll[16]] = RANARR_WEED;
        bArray[b.lllIIlllllll[20]] = TOADFLAX;
        bArray[b.lllIIlllllll[24]] = IRIT_LEAF;
        bArray[b.lllIIlllllll[28]] = AVANTOE;
        bArray[b.lllIIlllllll[32]] = KWUARM;
        bArray[b.lllIIlllllll[36]] = SNAPDRAGON;
        bArray[b.lllIIlllllll[40]] = CADANTINE;
        bArray[b.lllIIlllllll[44]] = LANTADYME;
        bArray[b.lllIIlllllll[48]] = DWARF_WEED;
        bArray[b.lllIIlllllll[52]] = TORSTOL;
        $VALUES = bArray;
    }

    public boolean a(int n) {
        boolean bl;
        if (!b.lIIIlIllIlIlllI(n, this.grimyId) || !b.lIIIlIllIlIlllI(n, this.cleanId) || b.lIIIlIllIlIllll(n, this.unfPotionId)) {
            bl = lllIIlllllll[1];
            0;
            if ((16 + 46 - 22 + 109 ^ 132 + 90 - 182 + 105) <= 0) {
                return false;
            }
        } else {
            bl = lllIIlllllll[0];
        }
        return bl;
    }
}

