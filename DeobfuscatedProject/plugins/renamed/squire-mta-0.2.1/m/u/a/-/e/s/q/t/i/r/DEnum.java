/*
 * Decompiled with CFR 0.152.
 */
package m.u.a.-.e.s.q.t.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class DEnum
extends Enum<d> {
    public static final /* synthetic */ /* enum */ d POSSIBLY_EMPTY;
    public static final /* synthetic */ /* enum */ d RUNE_LONGSWORD;
    public static final /* synthetic */ /* enum */ d UNKNOWN;
    public static final /* synthetic */ /* enum */ d EMPTY;
    private static /* synthetic */ String[] lllIlIllllll;
    public static final /* synthetic */ /* enum */ d EMERALD;
    private final /* synthetic */ int id;
    public static final /* synthetic */ /* enum */ d ADAMANT_MED_HELM;
    private final /* synthetic */ String name;
    private static final /* synthetic */ d[] $VALUES;
    public static final /* synthetic */ /* enum */ d ADAMANT_KITESHIELD;
    private static /* synthetic */ int[] lllIllIIIIIl;
    public static final /* synthetic */ /* enum */ d LEATHER_BOOTS;

    private static String lIIIllIIlIlllIl(String var24, String var23) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), lllIllIIIIIl[12]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lllIllIIIIIl[3], var10);
            return new String(var2.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    public int i() {
        return this.id;
    }

    private d(String string2, int n3) {
        this.id = n3;
        this.name = string2;
    }

    private static void lIIIllIIllIIlII() {
        lllIllIIIIIl = new int[24];
        d.lllIllIIIIIl[0] = (0x90 ^ 0x8E) & ~(0x9B ^ 0x85);
        d.lllIllIIIIIl[1] = 1;
        d.lllIllIIIIIl[2] = 0xFFFFFAFF & 0x1FED;
        d.lllIllIIIIIl[3] = 2;
        d.lllIllIIIIIl[4] = 3;
        d.lllIllIIIIIl[5] = -(0xD6 ^ 0xC4) & (0xFFFFFFFF & 0x1AFF);
        d.lllIllIIIIIl[6] = 0x55 ^ 0x51;
        d.lllIllIIIIIl[7] = 0x68 ^ 0x6D;
        d.lllIllIIIIIl[8] = 0xFFFF9BEF & 0x7EFF;
        d.lllIllIIIIIl[9] = 0x5A ^ 0x5C;
        d.lllIllIIIIIl[10] = 10 + 73 - 14 + 72 ^ 83 + 13 - -31 + 11;
        d.lllIllIIIIIl[11] = -(0x80 ^ 0x87) & (0xFFFFFBF6 & 0x1EFF);
        d.lllIllIIIIIl[12] = 0xB3 ^ 0xBB;
        d.lllIllIIIIIl[13] = 0xF8 ^ 0x80 ^ (0x37 ^ 0x46);
        d.lllIllIIIIIl[14] = -(0xFFFF85DB & 0x7E25) & (0xFFFFFFFF & 0x1EF1);
        d.lllIllIIIIIl[15] = 0x40 ^ 0x4A;
        d.lllIllIIIIIl[16] = 81 + 2 - 51 + 174 ^ 153 + 35 - 76 + 85;
        d.lllIllIIIIIl[17] = -1;
        d.lllIllIIIIIl[18] = 175 + 69 - 178 + 122 ^ 37 + 165 - 50 + 24;
        d.lllIllIIIIIl[19] = 0x78 ^ 0x75;
        d.lllIllIIIIIl[20] = -(0xFFFFF67F & 0x6B89) & (0xFFFFFFFF & 0x7F7E);
        d.lllIllIIIIIl[21] = 0xA8 ^ 0x8D ^ (0x5E ^ 0x75);
        d.lllIllIIIIIl[22] = 75 + 33 - -56 + 6 ^ 100 + 139 - 92 + 18;
        d.lllIllIIIIIl[23] = 0x59 ^ 0x7B ^ (0x94 ^ 0xA6);
    }

    static {
        d.lIIIllIIllIIlII();
        d.lIIIllIIllIIIll();
        LEATHER_BOOTS = new d(lllIlIllllll[lllIllIIIIIl[1]], lllIllIIIIIl[2]);
        ADAMANT_KITESHIELD = new d(lllIlIllllll[lllIllIIIIIl[4]], lllIllIIIIIl[5]);
        ADAMANT_MED_HELM = new d(lllIlIllllll[lllIllIIIIIl[7]], lllIllIIIIIl[8]);
        EMERALD = new d(lllIlIllllll[lllIllIIIIIl[10]], lllIllIIIIIl[11]);
        RUNE_LONGSWORD = new d(lllIlIllllll[lllIllIIIIIl[13]], lllIllIIIIIl[14]);
        EMPTY = new d(lllIlIllllll[lllIllIIIIIl[16]], lllIllIIIIIl[17]);
        POSSIBLY_EMPTY = new d(lllIlIllllll[lllIllIIIIIl[19]], lllIllIIIIIl[20]);
        UNKNOWN = new d(lllIlIllllll[lllIllIIIIIl[22]], lllIllIIIIIl[20]);
        d[] dArray = new d[lllIllIIIIIl[12]];
        dArray[d.lllIllIIIIIl[0]] = LEATHER_BOOTS;
        dArray[d.lllIllIIIIIl[1]] = ADAMANT_KITESHIELD;
        dArray[d.lllIllIIIIIl[3]] = ADAMANT_MED_HELM;
        dArray[d.lllIllIIIIIl[4]] = EMERALD;
        dArray[d.lllIllIIIIIl[6]] = RUNE_LONGSWORD;
        dArray[d.lllIllIIIIIl[7]] = EMPTY;
        dArray[d.lllIllIIIIIl[9]] = POSSIBLY_EMPTY;
        dArray[d.lllIllIIIIIl[10]] = UNKNOWN;
        $VALUES = dArray;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    public String j() {
        return this.name;
    }

    private static String lIIIllIIlIlllll(String var3, String var4) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var14 = var4.toCharArray();
        int var8 = lllIllIIIIIl[0];
        char[] var5 = var3.toCharArray();
        int var6 = var5.length;
        int var19 = lllIllIIIIIl[0];
        while (d.lIIIllIIllIIlIl(var19, var6)) {
            char var7 = var5[var19];
            var1.append((char)(var7 ^ var14[var8 % var14.length]));
            0;
            ++var8;
            ++var19;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public static d a(String string) {
        void var17;
        d[] dArray = d.values();
        int n2 = dArray.length;
        int var9 = lllIllIIIIIl[0];
        while (d.lIIIllIIllIIlIl(var9, (int)var17)) {
            String var12;
            void var16;
            void var18 = var16[var9];
            if (d.lIIIllIIllIIllI(var12.toLowerCase().contains(var18.name.toLowerCase()) ? 1 : 0)) {
                return var18;
            }
            ++var9;
            0;
            if (((0x7C ^ 0x61 ^ (0x31 ^ 0x78)) & (49 + 13 - -63 + 71 ^ 143 + 134 - 221 + 88 ^ -1)) <= (0x92 ^ 0xBE ^ (0xA7 ^ 0x8F))) continue;
            return null;
        }
        return null;
    }

    private static boolean lIIIllIIllIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllIIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIllIIllIIIll() {
        lllIlIllllll = new String[lllIllIIIIIl[23]];
        d.lllIlIllllll[d.lllIllIIIIIl[0]] = d."LEATHER_BOOTS";
        d.lllIlIllllll[d.lllIllIIIIIl[1]] = d."Leather Boots";
        d.lllIlIllllll[d.lllIllIIIIIl[3]] = d."ADAMANT_KITESHIELD";
        d.lllIlIllllll[d.lllIllIIIIIl[4]] = d."Adamant Kiteshield";
        d.lllIlIllllll[d.lllIllIIIIIl[6]] = d."ADAMANT_MED_HELM";
        d.lllIlIllllll[d.lllIllIIIIIl[7]] = d."Helm";
        d.lllIlIllllll[d.lllIllIIIIIl[9]] = d."EMERALD";
        d.lllIlIllllll[d.lllIllIIIIIl[10]] = d."Emerald";
        d.lllIlIllllll[d.lllIllIIIIIl[12]] = d."RUNE_LONGSWORD";
        d.lllIlIllllll[d.lllIllIIIIIl[13]] = d."Rune Longsword";
        d.lllIlIllllll[d.lllIllIIIIIl[15]] = d."EMPTY";
        d.lllIlIllllll[d.lllIllIIIIIl[16]] = d."";
        d.lllIlIllllll[d.lllIllIIIIIl[18]] = d."POSSIBLY_EMPTY";
        d.lllIlIllllll[d.lllIllIIIIIl[19]] = d."";
        d.lllIlIllllll[d.lllIllIIIIIl[21]] = d."UNKNOWN";
        d.lllIlIllllll[d.lllIllIIIIIl[22]] = d."Unknown";
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static String lIIIllIIlIllllI(String var13, String var20) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var21 = Cipher.getInstance("Blowfish");
            var21.init(lllIllIIIIIl[3], var15);
            return new String(var21.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }
}

