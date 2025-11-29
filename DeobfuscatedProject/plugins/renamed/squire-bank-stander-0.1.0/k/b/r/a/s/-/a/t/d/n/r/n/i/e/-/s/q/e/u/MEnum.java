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

public final class MEnum
extends Enum<m> {
    private static final /* synthetic */ m[] $VALUES;
    public static final /* synthetic */ /* enum */ m JADE;
    public static final /* synthetic */ /* enum */ m SAPPHIRE;
    public static final /* synthetic */ /* enum */ m AMETHYST;
    private final /* synthetic */ int craftingOption;
    private static /* synthetic */ int[] lllIIIIIIll;
    public static final /* synthetic */ /* enum */ m RED_TOPAZ;
    private final /* synthetic */ int materialID;
    public static final /* synthetic */ /* enum */ m DRAGONSTONE;
    public static final /* synthetic */ /* enum */ m DIAMOND;
    private final /* synthetic */ int finishedID;
    public static final /* synthetic */ /* enum */ m ZENYTE;
    public static final /* synthetic */ /* enum */ m EMERALD;
    public static final /* synthetic */ /* enum */ m ONYX;
    private static /* synthetic */ String[] lllIIIIIIlI;
    public static final /* synthetic */ /* enum */ m RUBY;
    public static final /* synthetic */ /* enum */ m OPAL;

    private static void lIlIllIIIlIIIl() {
        lllIIIIIIll = new int[34];
        m.lllIIIIIIll[0] = (0x66 ^ 0x2D) & ~(0x7E ^ 0x35);
        m.lllIIIIIIll[1] = -(0xFFFFEB3F & 0x7DE7) & (0xFFFFEFFF & 0x7F7F);
        m.lllIIIIIIll[2] = 0xFFFFB75D & 0x4EEB;
        m.lllIIIIIIll[3] = 1;
        m.lllIIIIIIll[4] = 0xFFFFD7DB & 0x2E7F;
        m.lllIIIIIIll[5] = 0xFFFFD6EB & 0x2F5F;
        m.lllIIIIIIll[6] = 2;
        m.lllIIIIIIll[7] = 0xFFFFEF5F & 0x16FD;
        m.lllIIIIIIll[8] = 0xFFFFAF7F & 0x56CD;
        m.lllIIIIIIll[9] = 3;
        m.lllIIIIIIll[10] = 0xFFFFD7F7 & 0x2E5F;
        m.lllIIIIIIll[11] = -(0xFFFFFA6F & 0x5D99) & (0xFFFFFF5F & 0x5EEF);
        m.lllIIIIIIll[12] = 71 + 88 - 46 + 22 ^ 63 + 56 - 4 + 16;
        m.lllIIIIIIll[13] = -(0xFFFFBBB9 & 0x7D6F) & (0xFFFFFFFF & 0x3F7D);
        m.lllIIIIIIll[14] = -(0xFFFFFC7F & 0x63BB) & (0xFFFFE77F & 0x7EFF);
        m.lllIIIIIIll[15] = 0x7F ^ 0x7A;
        m.lllIIIIIIll[16] = 0xFFFFA6D3 & 0x5F7F;
        m.lllIIIIIIll[17] = 0xFFFFDEC7 & 0x277B;
        m.lllIIIIIIll[18] = 0x78 ^ 0xE ^ (0xC2 ^ 0xB2);
        m.lllIIIIIIll[19] = -(0x74 ^ 0x53) & (0xFFFFDE77 & 0x27FF);
        m.lllIIIIIIll[20] = 0xFFFFEE59 & 0x17E7;
        m.lllIIIIIIll[21] = 0x99 ^ 0xA4 ^ (0x2D ^ 0x17);
        m.lllIIIIIIll[22] = 0xFFFFA7DF & 0x5E7F;
        m.lllIIIIIIll[23] = -(0xFFFFBDB1 & 0x7B7F) & (0xFFFFFF7F & 0x3FFF);
        m.lllIIIIIIll[24] = 0x80 ^ 0x88;
        m.lllIIIIIIll[25] = 0xFFFFFBEB & 0x1DBF;
        m.lllIIIIIIll[26] = 0xFFFFFFED & 0x19BF;
        m.lllIIIIIIll[27] = 0x6E ^ 0x62 ^ (0x5D ^ 0x58);
        m.lllIIIIIIll[28] = -(0xFFFFFC8F & 0x27FD) & (0xFFFFF7EF & Short.MAX_VALUE);
        m.lllIIIIIIll[29] = -(0xFFFFDF25 & 0x22DB) & (0xFFFFFEFD & 0x67FF);
        m.lllIIIIIIll[30] = 0x2D ^ 0x27;
        m.lllIIIIIIll[31] = 0xFFFFDC3F & 0x6FE8;
        m.lllIIIIIIll[32] = -(0xFFFFF7C3 & 0x28FD) & (0xFFFFFCFD & 0x6FE7);
        m.lllIIIIIIll[33] = 0x25 ^ 0x2E;
    }

    private m(int n3, int n4, int n5) {
        this.materialID = n3;
        this.finishedID = n4;
        this.craftingOption = n5;
    }

    private static boolean lIlIllIIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        m.lIlIllIIIlIIIl();
        m.lIlIllIIIlIIII();
        OPAL = new m(lllIIIIIIll[1], lllIIIIIIll[2], lllIIIIIIll[3]);
        JADE = new m(lllIIIIIIll[4], lllIIIIIIll[5], lllIIIIIIll[3]);
        RED_TOPAZ = new m(lllIIIIIIll[7], lllIIIIIIll[8], lllIIIIIIll[3]);
        SAPPHIRE = new m(lllIIIIIIll[10], lllIIIIIIll[11], lllIIIIIIll[3]);
        EMERALD = new m(lllIIIIIIll[13], lllIIIIIIll[14], lllIIIIIIll[3]);
        RUBY = new m(lllIIIIIIll[16], lllIIIIIIll[17], lllIIIIIIll[3]);
        DIAMOND = new m(lllIIIIIIll[19], lllIIIIIIll[20], lllIIIIIIll[3]);
        DRAGONSTONE = new m(lllIIIIIIll[22], lllIIIIIIll[23], lllIIIIIIll[3]);
        ONYX = new m(lllIIIIIIll[25], lllIIIIIIll[26], lllIIIIIIll[3]);
        AMETHYST = new m(lllIIIIIIll[28], lllIIIIIIll[29], lllIIIIIIll[12]);
        ZENYTE = new m(lllIIIIIIll[31], lllIIIIIIll[32], lllIIIIIIll[3]);
        m[] mArray = new m[lllIIIIIIll[33]];
        mArray[m.lllIIIIIIll[0]] = OPAL;
        mArray[m.lllIIIIIIll[3]] = JADE;
        mArray[m.lllIIIIIIll[6]] = RED_TOPAZ;
        mArray[m.lllIIIIIIll[9]] = SAPPHIRE;
        mArray[m.lllIIIIIIll[12]] = EMERALD;
        mArray[m.lllIIIIIIll[15]] = RUBY;
        mArray[m.lllIIIIIIll[18]] = DIAMOND;
        mArray[m.lllIIIIIIll[21]] = DRAGONSTONE;
        mArray[m.lllIIIIIIll[24]] = ONYX;
        mArray[m.lllIIIIIIll[27]] = AMETHYST;
        mArray[m.lllIIIIIIll[30]] = ZENYTE;
        $VALUES = mArray;
    }

    private static void lIlIllIIIlIIII() {
        lllIIIIIIlI = new String[lllIIIIIIll[33]];
        m.lllIIIIIIlI[m.lllIIIIIIll[0]] = m."OPAL";
        m.lllIIIIIIlI[m.lllIIIIIIll[3]] = m."JADE";
        m.lllIIIIIIlI[m.lllIIIIIIll[6]] = m."RED_TOPAZ";
        m.lllIIIIIIlI[m.lllIIIIIIll[9]] = m."SAPPHIRE";
        m.lllIIIIIIlI[m.lllIIIIIIll[12]] = m."EMERALD";
        m.lllIIIIIIlI[m.lllIIIIIIll[15]] = m."RUBY";
        m.lllIIIIIIlI[m.lllIIIIIIll[18]] = m."DIAMOND";
        m.lllIIIIIIlI[m.lllIIIIIIll[21]] = m."DRAGONSTONE";
        m.lllIIIIIIlI[m.lllIIIIIIll[24]] = m."ONYX";
        m.lllIIIIIIlI[m.lllIIIIIIll[27]] = m."AMETHYST";
        m.lllIIIIIIlI[m.lllIIIIIIll[30]] = m."ZENYTE";
    }

    private static String lIlIllIIIIllll(String var12, String var13) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), lllIIIIIIll[24]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lllIIIIIIll[6], var1);
            return new String(var15.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

    public int C() {
        return this.craftingOption;
    }

    public int z() {
        return this.materialID;
    }

    private static String lIlIllIIIIlllI(String var11, String var5) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var17 = var5.toCharArray();
        int var2 = lllIIIIIIll[0];
        char[] var7 = var11.toCharArray();
        int var6 = var7.length;
        int var10 = lllIIIIIIll[0];
        while (m.lIlIllIIIlIIlI(var10, var6)) {
            char var18 = var7[var10];
            var19.append((char)(var18 ^ var17[var2 % var17.length]));
            0;
            ++var2;
            ++var10;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private static String lIlIllIIIIllIl(String var16, String var3) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lllIIIIIIll[6], var9);
            return new String(var4.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public int E() {
        return this.finishedID;
    }
}

