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

public final class LEnum
extends Enum<l> {
    private final /* synthetic */ int finishedID;
    public static final /* synthetic */ /* enum */ l MAPLE_SHIELD;
    public static final /* synthetic */ /* enum */ l MAPLE_CROSSBOW_STOCK;
    public static final /* synthetic */ /* enum */ l OAK_LONGBOW_U;
    public static final /* synthetic */ /* enum */ l MAGIC_SHORTBOW_U;
    public static final /* synthetic */ /* enum */ l YEW_SHORTBOW_U;
    public static final /* synthetic */ /* enum */ l LONGBOW_U;
    private final /* synthetic */ int craftingOption;
    private final /* synthetic */ int materialID;
    public static final /* synthetic */ /* enum */ l YEW_SHIELD;
    private static final /* synthetic */ l[] $VALUES;
    private static /* synthetic */ int[] lllIIllllll;
    public static final /* synthetic */ /* enum */ l OAK_CROSSBOW_STOCK;
    public static final /* synthetic */ /* enum */ l OAK_SHORTBOW_U;
    public static final /* synthetic */ /* enum */ l ARROW_SHAFT;
    public static final /* synthetic */ /* enum */ l MAGIC_CROSSBOW_STOCK;
    public static final /* synthetic */ /* enum */ l YEW_CROSSBOW_STOCK;
    public static final /* synthetic */ /* enum */ l JAVELIN_SHAFT;
    public static final /* synthetic */ /* enum */ l OAK_SHIELD;
    private static /* synthetic */ String[] lllIIlllllI;
    public static final /* synthetic */ /* enum */ l MAGIC_LONGBOW_U;
    public static final /* synthetic */ /* enum */ l WILLOW_SHORTBOW_U;
    public static final /* synthetic */ /* enum */ l CROSSBOW_STOCK;
    public static final /* synthetic */ /* enum */ l YEW_LONGBOW_U;
    public static final /* synthetic */ /* enum */ l REDWOOD_SHIELD;
    public static final /* synthetic */ /* enum */ l SHORTBOW_U;
    public static final /* synthetic */ /* enum */ l WILLOW_CROSSBOW_STOCK;
    public static final /* synthetic */ /* enum */ l MAPLE_LONGBOW_U;
    public static final /* synthetic */ /* enum */ l WILLOW_SHIELD;
    public static final /* synthetic */ /* enum */ l MAGIC_SHIELD;
    public static final /* synthetic */ /* enum */ l WILLOW_LONGBOW_U;
    public static final /* synthetic */ /* enum */ l MAPLE_SHORTBOW_U;

    private static String lIlIlllIllIIll(String var8, String var3) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var9 = var3.toCharArray();
        int var15 = lllIIllllll[0];
        char[] var11 = var8.toCharArray();
        int var6 = var11.length;
        int var7 = lllIIllllll[0];
        while (l.lIlIlllIllIlll(var7, var6)) {
            char var18 = var11[var7];
            var10.append((char)(var18 ^ var9[var15 % var9.length]));
            0;
            ++var15;
            ++var7;
            0;
            if (((149 + 36 - 166 + 132 ^ 109 + 52 - 96 + 70) & (0x19 ^ 0x3A ^ (0x73 ^ 0x40) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    public boolean G() {
        return this.name().endsWith(lllIIlllllI[lllIIllllll[0]]);
    }

    public int z() {
        return this.materialID;
    }

    private static String lIlIlllIllIlII(String var19, String var16) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), lllIIllllll[17]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lllIIllllll[4], var5);
            return new String(var17.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static void lIlIlllIllIllI() {
        lllIIllllll = new int[61];
        l.lllIIllllll[0] = (0xD9 ^ 0xC6 ^ 2) & (0xCD ^ 0xBD ^ (0x17 ^ 0x7A) ^ -1);
        l.lllIIllllll[1] = 1;
        l.lllIIllllll[2] = -(0xFFFFFF5B & 0x42AD) & (0xFFFFF7FF & 0x4FEF);
        l.lllIIllllll[3] = 0xE ^ 0x3A;
        l.lllIIllllll[4] = 2;
        l.lllIIllllll[5] = -(0xFFFFB5EF & 0x7A54) & (0xFFFFFCDB & 0x7FE7);
        l.lllIIllllll[6] = 3;
        l.lllIIllllll[7] = 0x74 ^ 0x46;
        l.lllIIllllll[8] = 0x38 ^ 0x3C;
        l.lllIIllllll[9] = 116 + 15 - 79 + 103 ^ 110 + 116 - 104 + 49;
        l.lllIIllllll[10] = 0x51 ^ 0x54;
        l.lllIIllllll[11] = 0xFFFFFEEB & 0x25F4;
        l.lllIIllllll[12] = 140 + 85 - 134 + 72 ^ 20 + 60 - 53 + 138;
        l.lllIIllllll[13] = -(0xFFFFDECD & 0x7137) & (0xFFFFFDFF & 0x57F5);
        l.lllIIllllll[14] = 0xF0 ^ 0xC6;
        l.lllIIllllll[15] = 0x56 ^ 0xE ^ (0x31 ^ 0x6E);
        l.lllIIllllll[16] = 0x4D ^ 0x75;
        l.lllIIllllll[17] = 0xA6 ^ 0xAE;
        l.lllIIllllll[18] = 0xFFFFAEF6 & 0x75EB;
        l.lllIIllllll[19] = 0x6F ^ 0x66;
        l.lllIIllllll[20] = -(0xFFFFEB3F & 0x1DC5) & (0xFFFFDFFF & 0x7FEF);
        l.lllIIllllll[21] = 0x9D ^ 0x9B ^ (0x2A ^ 0x26);
        l.lllIIllllll[22] = -(0xFFFFF629 & 0x2BD7) & (0xFFFFE7EF & 0x3FFF);
        l.lllIIllllll[23] = 0x7A ^ 0x46;
        l.lllIIllllll[24] = 0x53 ^ 9 ^ (0x60 ^ 0x31);
        l.lllIIllllll[25] = 198 + 91 - 72 + 35 ^ 178 + 158 - 302 + 164;
        l.lllIIllllll[26] = 0x50 ^ 0x5C;
        l.lllIIllllll[27] = -(0xFFFFFB8E & 0x5C7D) & (0xFFFFFEFF & 0x7DEF);
        l.lllIIllllll[28] = 2 ^ 0xF;
        l.lllIIllllll[29] = 0xFFFFF7EE & 0x5EFF;
        l.lllIIllllll[30] = 0xA0 ^ 0x97 ^ (0x7B ^ 0x42);
        l.lllIIllllll[31] = -(0xFFFFA8F1 & 0x5F0F) & (0xFFFF8DFD & 0x7FEF);
        l.lllIIllllll[32] = 0x22 ^ 0x7D ^ (0x69 ^ 0x76);
        l.lllIIllllll[33] = 1 ^ 0xE;
        l.lllIIllllll[34] = 0x2A ^ 0x78 ^ (0x4F ^ 0x23);
        l.lllIIllllll[35] = 0x48 ^ 0x58;
        l.lllIIllllll[36] = -(0xFFFFDF4B & 0x79BC) & (0xFFFFFFFF & 0x7DEF);
        l.lllIIllllll[37] = 130 + 177 - 110 + 11 ^ 93 + 88 - 124 + 136;
        l.lllIIllllll[38] = 0xFFFFFEF5 & 0x57FB;
        l.lllIIllllll[39] = 0x14 ^ 0x18 ^ (0x8B ^ 0x95);
        l.lllIIllllll[40] = -(0xFFFFFACF & 0x5D35) & (0xFFFFDDEF & Short.MAX_VALUE);
        l.lllIIllllll[41] = 0x42 ^ 0xA ^ (3 ^ 0xF);
        l.lllIIllllll[42] = 0x18 ^ 0xB;
        l.lllIIllllll[43] = 0xE3 ^ 0x91 ^ (1 ^ 0x31);
        l.lllIIllllll[44] = 0x74 ^ 0x38 ^ (0xC8 ^ 0x90);
        l.lllIIllllll[45] = 0xFFFFEDFE & 0x36ED;
        l.lllIIllllll[46] = 0x9C ^ 0x89;
        l.lllIIllllll[47] = 0xFFFFDEFC & 0x77F7;
        l.lllIIllllll[48] = 0xB ^ 0x49 ^ (0x30 ^ 0x64);
        l.lllIIllllll[49] = -(0xFFFFFAC7 & 0x7F3B) & (0xFFFFFFFB & 0x7FEF);
        l.lllIIllllll[50] = 0xA9 ^ 0xA4 ^ (0x41 ^ 4);
        l.lllIIllllll[51] = 87 + 25 - 64 + 128 ^ 115 + 65 - 79 + 66;
        l.lllIIllllll[52] = 0x57 ^ 0x11;
        l.lllIIllllll[53] = 0xF2 ^ 0xB4 ^ (0xD8 ^ 0x86);
        l.lllIIllllll[54] = 0xFFFFDDD1 & 0x77EE;
        l.lllIIllllll[55] = 0x53 ^ 0x6A ^ (0xE2 ^ 0xC2);
        l.lllIIllllll[56] = -(0xFFFFA323 & 0x7DDD) & (0xFFFFF7F7 & Short.MAX_VALUE);
        l.lllIIllllll[57] = 0x3D ^ 0x30 ^ (0x3D ^ 0x2A);
        l.lllIIllllll[58] = 0xFFFFDEFF & 0x6DD5;
        l.lllIIllllll[59] = 0xFFFFD7FA & 0x7EFF;
        l.lllIIllllll[60] = 0x10 ^ 0xB;
    }

    private static boolean lIlIlllIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    public int E() {
        return this.finishedID;
    }

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

    private static String lIlIlllIllIIlI(String var13, String var14) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lllIIllllll[4], var4);
            return new String(var12.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }

    private l(int n3, int n4, int n5) {
        this.materialID = n3;
        this.finishedID = n4;
        this.craftingOption = n5;
    }

    private static void lIlIlllIllIlIl() {
        lllIIlllllI = new String[lllIIllllll[60]];
        l.lllIIlllllI[l.lllIIllllll[0]] = l."_SHIELD";
        l.lllIIlllllI[l.lllIIllllll[1]] = l."ARROW_SHAFT";
        l.lllIIlllllI[l.lllIIllllll[4]] = l."JAVELIN_SHAFT";
        l.lllIIlllllI[l.lllIIllllll[6]] = l."SHORTBOW_U";
        l.lllIIlllllI[l.lllIIllllll[8]] = l."LONGBOW_U";
        l.lllIIlllllI[l.lllIIllllll[10]] = l."CROSSBOW_STOCK";
        l.lllIIlllllI[l.lllIIllllll[12]] = l."OAK_SHORTBOW_U";
        l.lllIIlllllI[l.lllIIllllll[15]] = l."OAK_LONGBOW_U";
        l.lllIIlllllI[l.lllIIllllll[17]] = l."OAK_CROSSBOW_STOCK";
        l.lllIIlllllI[l.lllIIllllll[19]] = l."OAK_SHIELD";
        l.lllIIlllllI[l.lllIIllllll[21]] = l."WILLOW_SHORTBOW_U";
        l.lllIIlllllI[l.lllIIllllll[24]] = l."WILLOW_LONGBOW_U";
        l.lllIIlllllI[l.lllIIllllll[26]] = l."WILLOW_CROSSBOW_STOCK";
        l.lllIIlllllI[l.lllIIllllll[28]] = l."WILLOW_SHIELD";
        l.lllIIlllllI[l.lllIIllllll[30]] = l."MAPLE_SHORTBOW_U";
        l.lllIIlllllI[l.lllIIllllll[33]] = l."MAPLE_LONGBOW_U";
        l.lllIIlllllI[l.lllIIllllll[35]] = l."MAPLE_CROSSBOW_STOCK";
        l.lllIIlllllI[l.lllIIllllll[37]] = l."MAPLE_SHIELD";
        l.lllIIlllllI[l.lllIIllllll[39]] = l."YEW_SHORTBOW_U";
        l.lllIIlllllI[l.lllIIllllll[42]] = l."YEW_LONGBOW_U";
        l.lllIIlllllI[l.lllIIllllll[44]] = l."YEW_CROSSBOW_STOCK";
        l.lllIIlllllI[l.lllIIllllll[46]] = l."YEW_SHIELD";
        l.lllIIlllllI[l.lllIIllllll[48]] = l."MAGIC_SHORTBOW_U";
        l.lllIIlllllI[l.lllIIllllll[51]] = l."MAGIC_LONGBOW_U";
        l.lllIIlllllI[l.lllIIllllll[53]] = l."MAGIC_CROSSBOW_STOCK";
        l.lllIIlllllI[l.lllIIllllll[55]] = l."MAGIC_SHIELD";
        l.lllIIlllllI[l.lllIIllllll[57]] = l."REDWOOD_SHIELD";
    }

    static {
        l.lIlIlllIllIllI();
        l.lIlIlllIllIlIl();
        ARROW_SHAFT = new l(lllIIllllll[2], lllIIllllll[3], lllIIllllll[1]);
        JAVELIN_SHAFT = new l(lllIIllllll[2], lllIIllllll[5], lllIIllllll[4]);
        SHORTBOW_U = new l(lllIIllllll[2], lllIIllllll[7], lllIIllllll[6]);
        LONGBOW_U = new l(lllIIllllll[2], lllIIllllll[9], lllIIllllll[8]);
        CROSSBOW_STOCK = new l(lllIIllllll[2], lllIIllllll[11], lllIIllllll[10]);
        OAK_SHORTBOW_U = new l(lllIIllllll[13], lllIIllllll[14], lllIIllllll[4]);
        OAK_LONGBOW_U = new l(lllIIllllll[13], lllIIllllll[16], lllIIllllll[6]);
        OAK_CROSSBOW_STOCK = new l(lllIIllllll[13], lllIIllllll[18], lllIIllllll[8]);
        OAK_SHIELD = new l(lllIIllllll[13], lllIIllllll[20], lllIIllllll[10]);
        WILLOW_SHORTBOW_U = new l(lllIIllllll[22], lllIIllllll[23], lllIIllllll[4]);
        WILLOW_LONGBOW_U = new l(lllIIllllll[22], lllIIllllll[25], lllIIllllll[6]);
        WILLOW_CROSSBOW_STOCK = new l(lllIIllllll[22], lllIIllllll[27], lllIIllllll[8]);
        WILLOW_SHIELD = new l(lllIIllllll[22], lllIIllllll[29], lllIIllllll[10]);
        MAPLE_SHORTBOW_U = new l(lllIIllllll[31], lllIIllllll[32], lllIIllllll[4]);
        MAPLE_LONGBOW_U = new l(lllIIllllll[31], lllIIllllll[34], lllIIllllll[6]);
        MAPLE_CROSSBOW_STOCK = new l(lllIIllllll[31], lllIIllllll[36], lllIIllllll[8]);
        MAPLE_SHIELD = new l(lllIIllllll[31], lllIIllllll[38], lllIIllllll[10]);
        YEW_SHORTBOW_U = new l(lllIIllllll[40], lllIIllllll[41], lllIIllllll[4]);
        YEW_LONGBOW_U = new l(lllIIllllll[40], lllIIllllll[43], lllIIllllll[6]);
        YEW_CROSSBOW_STOCK = new l(lllIIllllll[40], lllIIllllll[45], lllIIllllll[8]);
        YEW_SHIELD = new l(lllIIllllll[40], lllIIllllll[47], lllIIllllll[10]);
        MAGIC_SHORTBOW_U = new l(lllIIllllll[49], lllIIllllll[50], lllIIllllll[4]);
        MAGIC_LONGBOW_U = new l(lllIIllllll[49], lllIIllllll[52], lllIIllllll[6]);
        MAGIC_CROSSBOW_STOCK = new l(lllIIllllll[49], lllIIllllll[54], lllIIllllll[8]);
        MAGIC_SHIELD = new l(lllIIllllll[49], lllIIllllll[56], lllIIllllll[10]);
        REDWOOD_SHIELD = new l(lllIIllllll[58], lllIIllllll[59], lllIIllllll[4]);
        l[] lArray = new l[lllIIllllll[57]];
        lArray[l.lllIIllllll[0]] = ARROW_SHAFT;
        lArray[l.lllIIllllll[1]] = JAVELIN_SHAFT;
        lArray[l.lllIIllllll[4]] = SHORTBOW_U;
        lArray[l.lllIIllllll[6]] = LONGBOW_U;
        lArray[l.lllIIllllll[8]] = CROSSBOW_STOCK;
        lArray[l.lllIIllllll[10]] = OAK_SHORTBOW_U;
        lArray[l.lllIIllllll[12]] = OAK_LONGBOW_U;
        lArray[l.lllIIllllll[15]] = OAK_CROSSBOW_STOCK;
        lArray[l.lllIIllllll[17]] = OAK_SHIELD;
        lArray[l.lllIIllllll[19]] = WILLOW_SHORTBOW_U;
        lArray[l.lllIIllllll[21]] = WILLOW_LONGBOW_U;
        lArray[l.lllIIllllll[24]] = WILLOW_CROSSBOW_STOCK;
        lArray[l.lllIIllllll[26]] = WILLOW_SHIELD;
        lArray[l.lllIIllllll[28]] = MAPLE_SHORTBOW_U;
        lArray[l.lllIIllllll[30]] = MAPLE_LONGBOW_U;
        lArray[l.lllIIllllll[33]] = MAPLE_CROSSBOW_STOCK;
        lArray[l.lllIIllllll[35]] = MAPLE_SHIELD;
        lArray[l.lllIIllllll[37]] = YEW_SHORTBOW_U;
        lArray[l.lllIIllllll[39]] = YEW_LONGBOW_U;
        lArray[l.lllIIllllll[42]] = YEW_CROSSBOW_STOCK;
        lArray[l.lllIIllllll[44]] = YEW_SHIELD;
        lArray[l.lllIIllllll[46]] = MAGIC_SHORTBOW_U;
        lArray[l.lllIIllllll[48]] = MAGIC_LONGBOW_U;
        lArray[l.lllIIllllll[51]] = MAGIC_CROSSBOW_STOCK;
        lArray[l.lllIIllllll[53]] = MAGIC_SHIELD;
        lArray[l.lllIIllllll[55]] = REDWOOD_SHIELD;
        $VALUES = lArray;
    }

    public int C() {
        return this.craftingOption;
    }
}

