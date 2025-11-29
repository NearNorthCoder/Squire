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

public final class CEnum
extends Enum<c> {
    private final /* synthetic */ int requiredToMake;
    public static final /* synthetic */ /* enum */ c BLUE_DHIDE_CHAPS;
    private static /* synthetic */ String[] lllIIIlIIII;
    public static final /* synthetic */ /* enum */ c RED_DHIDE_VAMBRACES;
    private final /* synthetic */ String name;
    private final /* synthetic */ int level;
    public static final /* synthetic */ /* enum */ c GREEN_DHIDE_BODY;
    private static /* synthetic */ int[] lllIIIlIIIl;
    public static final /* synthetic */ /* enum */ c BLACK_DHIDE_CHAPS;
    private static final /* synthetic */ c[] $VALUES;
    private final /* synthetic */ int amountToWithdraw;
    public static final /* synthetic */ /* enum */ c RED_DHIDE_CHAPS;
    public static final /* synthetic */ /* enum */ c BLUE_DHIDE_BODY;
    public static final /* synthetic */ /* enum */ c GREEN_DHIDE_VAMBRACES;
    public static final /* synthetic */ /* enum */ c BLACK_DHIDE_BODY;
    public static final /* synthetic */ /* enum */ c GREEN_DHIDE_CHAPS;
    public static final /* synthetic */ /* enum */ c BLACK_DHIDE_VAMBRACES;
    public static final /* synthetic */ /* enum */ c BLUE_DHIDE_VAMBRACES;
    public static final /* synthetic */ /* enum */ c RED_DHIDE_BODY;
    private final /* synthetic */ int materials;

    public int m() {
        return this.amountToWithdraw;
    }

    private static void lIlIllIIllIlIl() {
        lllIIIlIIIl = new int[41];
        c.lllIIIlIIIl[0] = (0 ^ 0x39) & ~(0xE ^ 0x37);
        c.lllIIIlIIIl[1] = 1;
        c.lllIIIlIIIl[2] = 0x63 ^ 0x5A;
        c.lllIIIlIIIl[3] = -(0xFFFFFDFF & 0x6B2D) & (0xFFFFEFFF & 0x7FFD);
        c.lllIIIlIIIl[4] = 0x22 ^ 0x38;
        c.lllIIIlIIIl[5] = 2;
        c.lllIIIlIIIl[6] = 3;
        c.lllIIIlIIIl[7] = 0x24 ^ 0x74 ^ (0x17 ^ 0x7B);
        c.lllIIIlIIIl[8] = 0x50 ^ 0x54;
        c.lllIIIlIIIl[9] = 0x7B ^ 9 ^ (0xD6 ^ 0xA1);
        c.lllIIIlIIIl[10] = 0xB9 ^ 0x86;
        c.lllIIIlIIIl[11] = 0x84 ^ 0x9C;
        c.lllIIIlIIIl[12] = 0x42 ^ 0x44;
        c.lllIIIlIIIl[13] = 0x7B ^ 0x7C;
        c.lllIIIlIIIl[14] = 0x23 ^ 0x61;
        c.lllIIIlIIIl[15] = 0xFFFFB9EF & 0x4FD9;
        c.lllIIIlIIIl[16] = 0x56 ^ 0x5A ^ (0x10 ^ 0x14);
        c.lllIIIlIIIl[17] = 0x9A ^ 0xAA ^ (0xB4 ^ 0x8D);
        c.lllIIIlIIIl[18] = 9 + 216 - 146 + 163 ^ 154 + 76 - 221 + 173;
        c.lllIIIlIIIl[19] = 0xCE ^ 0xC4;
        c.lllIIIlIIIl[20] = 87 + 116 - 150 + 83 ^ 114 + 51 - 130 + 96;
        c.lllIIIlIIIl[21] = 0xA5 ^ 0xA9;
        c.lllIIIlIIIl[22] = 0x86 ^ 0x8B ^ (0x2A ^ 0xB) & ~(0x13 ^ 0x32);
        c.lllIIIlIIIl[23] = 20 + 50 - -88 + 81 ^ 149 + 52 - 172 + 137;
        c.lllIIIlIIIl[24] = 0xFFFFA9CF & 0x5FFB;
        c.lllIIIlIIIl[25] = 0x2A ^ 0x24;
        c.lllIIIlIIIl[26] = 0x64 ^ 0x5A ^ (0x59 ^ 0x68);
        c.lllIIIlIIIl[27] = 0x21 ^ 0x6A;
        c.lllIIIlIIIl[28] = 0x40 ^ 0x20 ^ (0x4D ^ 0x3D);
        c.lllIIIlIIIl[29] = 0x20 ^ 0x31;
        c.lllIIIlIIIl[30] = 0x70 ^ 0x3A ^ (0x78 ^ 0x7F);
        c.lllIIIlIIIl[31] = 0xB6 ^ 0xA4;
        c.lllIIIlIIIl[32] = 110 + 3 - 41 + 115 ^ 4 + 85 - -70 + 9;
        c.lllIIIlIIIl[33] = 0xCE ^ 0xBD ^ (0x15 ^ 0x29);
        c.lllIIIlIIIl[34] = 0xFFFFD9DD & 0x2FEF;
        c.lllIIIlIIIl[35] = 0x55 ^ 0x41;
        c.lllIIIlIIIl[36] = 0xFF ^ 0xC7 ^ (0x3C ^ 0x11);
        c.lllIIIlIIIl[37] = 0x61 ^ 0x33;
        c.lllIIIlIIIl[38] = 134 + 82 - 118 + 43 ^ 148 + 72 - 124 + 59;
        c.lllIIIlIIIl[39] = 0x60 ^ 0x77;
        c.lllIIIlIIIl[40] = 0xBC ^ 0xA2 ^ (0xC3 ^ 0x89);
    }

    public int l() {
        return this.materials;
    }

    private static boolean lIlIllIIllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private c(String string2, int n3, int n4, int n5, int n6) {
        this.name = string2;
        this.level = n3;
        this.materials = n4;
        this.amountToWithdraw = n5;
        this.requiredToMake = n6;
    }

    public int n() {
        return this.requiredToMake;
    }

    static {
        c.lIlIllIIllIlIl();
        c.lIlIllIIllIlII();
        GREEN_DHIDE_VAMBRACES = new c(lllIIIlIIII[lllIIIlIIIl[1]], lllIIIlIIIl[2], lllIIIlIIIl[3], lllIIIlIIIl[4], lllIIIlIIIl[1]);
        GREEN_DHIDE_CHAPS = new c(lllIIIlIIII[lllIIIlIIIl[6]], lllIIIlIIIl[7], lllIIIlIIIl[3], lllIIIlIIIl[4], lllIIIlIIIl[5]);
        GREEN_DHIDE_BODY = new c(lllIIIlIIII[lllIIIlIIIl[9]], lllIIIlIIIl[10], lllIIIlIIIl[3], lllIIIlIIIl[11], lllIIIlIIIl[6]);
        BLUE_DHIDE_VAMBRACES = new c(lllIIIlIIII[lllIIIlIIIl[13]], lllIIIlIIIl[14], lllIIIlIIIl[15], lllIIIlIIIl[4], lllIIIlIIIl[1]);
        BLUE_DHIDE_CHAPS = new c(lllIIIlIIII[lllIIIlIIIl[17]], lllIIIlIIIl[18], lllIIIlIIIl[15], lllIIIlIIIl[4], lllIIIlIIIl[5]);
        BLUE_DHIDE_BODY = new c(lllIIIlIIII[lllIIIlIIIl[20]], lllIIIlIIIl[10], lllIIIlIIIl[15], lllIIIlIIIl[11], lllIIIlIIIl[6]);
        RED_DHIDE_VAMBRACES = new c(lllIIIlIIII[lllIIIlIIIl[22]], lllIIIlIIIl[23], lllIIIlIIIl[24], lllIIIlIIIl[4], lllIIIlIIIl[1]);
        RED_DHIDE_CHAPS = new c(lllIIIlIIII[lllIIIlIIIl[26]], lllIIIlIIIl[27], lllIIIlIIIl[24], lllIIIlIIIl[4], lllIIIlIIIl[5]);
        RED_DHIDE_BODY = new c(lllIIIlIIII[lllIIIlIIIl[29]], lllIIIlIIIl[30], lllIIIlIIIl[24], lllIIIlIIIl[11], lllIIIlIIIl[6]);
        BLACK_DHIDE_VAMBRACES = new c(lllIIIlIIII[lllIIIlIIIl[32]], lllIIIlIIIl[33], lllIIIlIIIl[34], lllIIIlIIIl[4], lllIIIlIIIl[1]);
        BLACK_DHIDE_CHAPS = new c(lllIIIlIIII[lllIIIlIIIl[36]], lllIIIlIIIl[37], lllIIIlIIIl[34], lllIIIlIIIl[4], lllIIIlIIIl[5]);
        BLACK_DHIDE_BODY = new c(lllIIIlIIII[lllIIIlIIIl[39]], lllIIIlIIIl[40], lllIIIlIIIl[34], lllIIIlIIIl[11], lllIIIlIIIl[6]);
        c[] cArray = new c[lllIIIlIIIl[21]];
        cArray[c.lllIIIlIIIl[0]] = GREEN_DHIDE_VAMBRACES;
        cArray[c.lllIIIlIIIl[1]] = GREEN_DHIDE_CHAPS;
        cArray[c.lllIIIlIIIl[5]] = GREEN_DHIDE_BODY;
        cArray[c.lllIIIlIIIl[6]] = BLUE_DHIDE_VAMBRACES;
        cArray[c.lllIIIlIIIl[8]] = BLUE_DHIDE_CHAPS;
        cArray[c.lllIIIlIIIl[9]] = BLUE_DHIDE_BODY;
        cArray[c.lllIIIlIIIl[12]] = RED_DHIDE_VAMBRACES;
        cArray[c.lllIIIlIIIl[13]] = RED_DHIDE_CHAPS;
        cArray[c.lllIIIlIIIl[16]] = RED_DHIDE_BODY;
        cArray[c.lllIIIlIIIl[17]] = BLACK_DHIDE_VAMBRACES;
        cArray[c.lllIIIlIIIl[19]] = BLACK_DHIDE_CHAPS;
        cArray[c.lllIIIlIIIl[20]] = BLACK_DHIDE_BODY;
        $VALUES = cArray;
    }

    private static String lIlIllIIllIIll(String var18, String var8) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var3 = var8.toCharArray();
        int var9 = lllIIIlIIIl[0];
        char[] var1 = var18.toCharArray();
        int var4 = var1.length;
        int var16 = lllIIIlIIIl[0];
        while (c.lIlIllIIllIllI(var16, var4)) {
            char var6 = var1[var16];
            var14.append((char)(var6 ^ var3[var9 % var3.length]));
            0;
            ++var9;
            ++var16;
            0;
            if (2 != ((165 + 98 - 146 + 68 ^ 124 + 141 - 166 + 76) & (0x6A ^ 0x42 ^ (0x68 ^ 0x56) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static void lIlIllIIllIlII() {
        lllIIIlIIII = new String[lllIIIlIIIl[11]];
        c.lllIIIlIIII[c.lllIIIlIIIl[0]] = c."GREEN_DHIDE_VAMBRACES";
        c.lllIIIlIIII[c.lllIIIlIIIl[1]] = c."Green d'hide vambraces";
        c.lllIIIlIIII[c.lllIIIlIIIl[5]] = c."GREEN_DHIDE_CHAPS";
        c.lllIIIlIIII[c.lllIIIlIIIl[6]] = c."Green d'hide chaps";
        c.lllIIIlIIII[c.lllIIIlIIIl[8]] = c."GREEN_DHIDE_BODY";
        c.lllIIIlIIII[c.lllIIIlIIIl[9]] = c."Green d'hide body";
        c.lllIIIlIIII[c.lllIIIlIIIl[12]] = c."BLUE_DHIDE_VAMBRACES";
        c.lllIIIlIIII[c.lllIIIlIIIl[13]] = c."Blue d'hide vambraces";
        c.lllIIIlIIII[c.lllIIIlIIIl[16]] = c."BLUE_DHIDE_CHAPS";
        c.lllIIIlIIII[c.lllIIIlIIIl[17]] = c."Blue d'hide chaps";
        c.lllIIIlIIII[c.lllIIIlIIIl[19]] = c."BLUE_DHIDE_BODY";
        c.lllIIIlIIII[c.lllIIIlIIIl[20]] = c."Blue d'hide body";
        c.lllIIIlIIII[c.lllIIIlIIIl[21]] = c."RED_DHIDE_VAMBRACES";
        c.lllIIIlIIII[c.lllIIIlIIIl[22]] = c."Red d'hide vambraces";
        c.lllIIIlIIII[c.lllIIIlIIIl[25]] = c."RED_DHIDE_CHAPS";
        c.lllIIIlIIII[c.lllIIIlIIIl[26]] = c."Red d'hide chaps";
        c.lllIIIlIIII[c.lllIIIlIIIl[28]] = c."RED_DHIDE_BODY";
        c.lllIIIlIIII[c.lllIIIlIIIl[29]] = c."Red d'hide body";
        c.lllIIIlIIII[c.lllIIIlIIIl[31]] = c."BLACK_DHIDE_VAMBRACES";
        c.lllIIIlIIII[c.lllIIIlIIIl[32]] = c."Black d'hide vambraces";
        c.lllIIIlIIII[c.lllIIIlIIIl[35]] = c."BLACK_DHIDE_CHAPS";
        c.lllIIIlIIII[c.lllIIIlIIIl[36]] = c."Black d'hide chaps";
        c.lllIIIlIIII[c.lllIIIlIIIl[38]] = c."BLACK_DHIDE_BODY";
        c.lllIIIlIIII[c.lllIIIlIIIl[39]] = c."Black d'hide body";
    }

    public String j() {
        return this.name;
    }

    private static String lIlIllIIllIIlI(String var15, String var17) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lllIIIlIIIl[16]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lllIIIlIIIl[5], var2);
            return new String(var10.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    public int k() {
        return this.level;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private static String lIlIllIIllIIIl(String var13, String var5) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lllIIIlIIIl[5], var11);
            return new String(var7.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }
}

