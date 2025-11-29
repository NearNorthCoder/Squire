/*
 * Decompiled with CFR 0.152.
 */
package -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class c
extends Enum<c> {
    public static final /* synthetic */ /* enum */ c STEEL;
    private static /* synthetic */ int[] lIlIllllllIll;
    private static /* synthetic */ String[] lIlIlllllIllI;
    public static final /* synthetic */ /* enum */ c DRAGON;
    public static final /* synthetic */ /* enum */ c BLACK;
    public static final /* synthetic */ /* enum */ c ADAMANT;
    private final /* synthetic */ int ItemID;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ c BRONZE;
    private final /* synthetic */ int attackLevelRequired;
    public static final /* synthetic */ /* enum */ c RUNE;
    private final /* synthetic */ int woodcuttingLevelRequired;
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ /* enum */ c MITHRIL;
    public static final /* synthetic */ /* enum */ c IRON;

    private c(String string2, int n3, int n4, int n5) {
        this.name = string2;
        this.attackLevelRequired = n3;
        this.woodcuttingLevelRequired = n4;
        this.ItemID = n5;
    }

    static {
        c.llIIIIlllIIIIll();
        c.llIIIIllIllllll();
        BRONZE = new c(lIlIlllllIllI[lIlIllllllIll[1]], lIlIllllllIll[1], lIlIllllllIll[1], lIlIllllllIll[2]);
        IRON = new c(lIlIlllllIllI[lIlIllllllIll[4]], lIlIllllllIll[1], lIlIllllllIll[3], lIlIllllllIll[5]);
        STEEL = new c(lIlIlllllIllI[lIlIllllllIll[7]], lIlIllllllIll[8], lIlIllllllIll[4], lIlIllllllIll[9]);
        BLACK = new c(lIlIlllllIllI[lIlIllllllIll[10]], lIlIllllllIll[8], lIlIllllllIll[6], lIlIllllllIll[11]);
        MITHRIL = new c(lIlIlllllIllI[lIlIllllllIll[13]], lIlIllllllIll[14], lIlIllllllIll[7], lIlIllllllIll[15]);
        ADAMANT = new c(lIlIlllllIllI[lIlIllllllIll[17]], lIlIllllllIll[18], lIlIllllllIll[8], lIlIllllllIll[19]);
        RUNE = new c(lIlIlllllIllI[lIlIllllllIll[21]], lIlIllllllIll[22], lIlIllllllIll[10], lIlIllllllIll[23]);
        DRAGON = new c(lIlIlllllIllI[lIlIllllllIll[25]], lIlIllllllIll[26], lIlIllllllIll[12], lIlIllllllIll[27]);
        c[] cArray = new c[lIlIllllllIll[12]];
        cArray[c.lIlIllllllIll[0]] = BRONZE;
        cArray[c.lIlIllllllIll[1]] = IRON;
        cArray[c.lIlIllllllIll[3]] = STEEL;
        cArray[c.lIlIllllllIll[4]] = BLACK;
        cArray[c.lIlIllllllIll[6]] = MITHRIL;
        cArray[c.lIlIllllllIll[7]] = ADAMANT;
        cArray[c.lIlIllllllIll[8]] = RUNE;
        cArray[c.lIlIllllllIll[10]] = DRAGON;
        $VALUES = cArray;
    }

    private static void llIIIIlllIIIIll() {
        lIlIllllllIll = new int[29];
        c.lIlIllllllIll[0] = (0x7A ^ 0x4A) & ~(0xBF ^ 0x8F);
        c.lIlIllllllIll[1] = 1;
        c.lIlIllllllIll[2] = -(0xFFFFFE7B & 0x7BB5) & (0xFFFFFFF7 & 0x7F7F);
        c.lIlIllllllIll[3] = 2;
        c.lIlIllllllIll[4] = 3;
        c.lIlIllllllIll[5] = -(0xFFFFBBBF & 0x7E7B) & (0xFFFFBFFF & 0x7F7F);
        c.lIlIllllllIll[6] = 0xAC ^ 0x9B ^ (0x95 ^ 0xA6);
        c.lIlIllllllIll[7] = 0x58 ^ 0x6A ^ (8 ^ 0x3F);
        c.lIlIllllllIll[8] = 42 + 102 - 116 + 154 ^ 172 + 164 - 279 + 119;
        c.lIlIllllllIll[9] = -(0xFFFFEE8F & 0x79F1) & (0xFFFFEFFB & 0x7DCD);
        c.lIlIllllllIll[10] = 0xBB ^ 0xBC;
        c.lIlIllllllIll[11] = -(0x37 ^ 0x1A) & (0xFFFFBDFD & 0x477F);
        c.lIlIllllllIll[12] = 0xCB ^ 0xC3;
        c.lIlIllllllIll[13] = 0x66 ^ 4 ^ (0xE8 ^ 0x83);
        c.lIlIllllllIll[14] = 0xE ^ 0x4A ^ (0xA ^ 0x5B);
        c.lIlIllllllIll[15] = -(0xFFFFDEE7 & 0x2B99) & (0xFFFFEFEF & 0x1FDB);
        c.lIlIllllllIll[16] = 0x52 ^ 0x58;
        c.lIlIllllllIll[17] = 0x10 ^ 0x2D ^ (0x78 ^ 0x4E);
        c.lIlIllllllIll[18] = 0xA ^ 0x15;
        c.lIlIllllllIll[19] = 0xFFFFAFCF & 0x557D;
        c.lIlIllllllIll[20] = 0x64 ^ 0x68;
        c.lIlIllllllIll[21] = 40 + 65 - -28 + 15 ^ 26 + 148 - 117 + 96;
        c.lIlIllllllIll[22] = 7 + 128 - -66 + 37 ^ 157 + 42 - 62 + 62;
        c.lIlIllllllIll[23] = 0xFFFFFD4F & 0x7FF;
        c.lIlIllllllIll[24] = 0xF ^ 0x1D ^ (0x4D ^ 0x51);
        c.lIlIllllllIll[25] = 0x42 ^ 0x4D;
        c.lIlIllllllIll[26] = 0xA4 ^ 0x99;
        c.lIlIllllllIll[27] = 0xFFFFDBF7 & 0x3E5B;
        c.lIlIllllllIll[28] = 0x88 ^ 0xBD ^ (0xC ^ 0x29);
    }

    public String v() {
        return this.name;
    }

    private static boolean llIIIIlllIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIIllIlIllll(String var18, String var7) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var2 = var7.toCharArray();
        int var11 = lIlIllllllIll[0];
        char[] var4 = var18.toCharArray();
        int var19 = var4.length;
        int var3 = lIlIllllllIll[0];
        while (c.llIIIIlllIIIlII(var3, var19)) {
            char var15 = var4[var3];
            var6.append((char)(var15 ^ var2[var11 % var2.length]));
            0;
            ++var11;
            ++var3;
            0;
            if (-1 >= -1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static String llIIIIllIllIIIl(String var5, String var16) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIlIllllllIll[3], var10);
            return new String(var12.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void llIIIIllIllllll() {
        lIlIlllllIllI = new String[lIlIllllllIll[28]];
        c.lIlIlllllIllI[c.lIlIllllllIll[0]] = c."BRONZE";
        c.lIlIlllllIllI[c.lIlIllllllIll[1]] = c."Bronze";
        c.lIlIlllllIllI[c.lIlIllllllIll[3]] = c."IRON";
        c.lIlIlllllIllI[c.lIlIllllllIll[4]] = c."Iron";
        c.lIlIlllllIllI[c.lIlIllllllIll[6]] = c."STEEL";
        c.lIlIlllllIllI[c.lIlIllllllIll[7]] = c."Steel";
        c.lIlIlllllIllI[c.lIlIllllllIll[8]] = c."BLACK";
        c.lIlIlllllIllI[c.lIlIllllllIll[10]] = c."Black";
        c.lIlIlllllIllI[c.lIlIllllllIll[12]] = c."MITHRIL";
        c.lIlIlllllIllI[c.lIlIllllllIll[13]] = c."Mithril";
        c.lIlIlllllIllI[c.lIlIllllllIll[16]] = c."ADAMANT";
        c.lIlIlllllIllI[c.lIlIllllllIll[17]] = c."Adamant";
        c.lIlIlllllIllI[c.lIlIllllllIll[20]] = c."RUNE";
        c.lIlIlllllIllI[c.lIlIllllllIll[21]] = c."Rune";
        c.lIlIlllllIllI[c.lIlIllllllIll[24]] = c."DRAGON";
        c.lIlIlllllIllI[c.lIlIllllllIll[25]] = c."Dragon";
    }

    private static String llIIIIllIllIIII(String var13, String var14) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), lIlIllllllIll[12]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIlIllllllIll[3], var17);
            return new String(var9.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public int y() {
        return this.ItemID;
    }

    public int w() {
        return this.attackLevelRequired;
    }

    public int x() {
        return this.woodcuttingLevelRequired;
    }
}

