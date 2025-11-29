/*
 * Decompiled with CFR 0.152.
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class y
extends Enum<y> {
    public static final /* synthetic */ /* enum */ y CRYSTAL_HALBERD;
    public static final /* synthetic */ /* enum */ y NONE;
    private static final /* synthetic */ y[] $VALUES;
    public static final /* synthetic */ /* enum */ y OSMUMTENS_FANG;
    public static final /* synthetic */ /* enum */ y ARMADYL_GODSWORD;
    private final /* synthetic */ boolean twoHanded;
    public static final /* synthetic */ /* enum */ y BANDOS_GODSWORD;
    public static final /* synthetic */ /* enum */ y ANCIENT_GODSWORD;
    public static final /* synthetic */ /* enum */ y DRAGON_MACE;
    private final /* synthetic */ int itemID;
    private final /* synthetic */ int specAmount;
    private static /* synthetic */ int[] lllIlllIlIII;
    public static final /* synthetic */ /* enum */ y VOID_WAKER;
    public static final /* synthetic */ /* enum */ y DRAGON_WARHAMMER;
    public static final /* synthetic */ /* enum */ y GRANITE_MAUL;
    public static final /* synthetic */ /* enum */ y DRAGON_CLAWS;
    public static final /* synthetic */ /* enum */ y SARADOMIN_GODSWORD;
    private static /* synthetic */ String[] lllIlllIIIll;

    static {
        y.lIIIllIlllIlIll();
        y.lIIIllIlllIIlII();
        GRANITE_MAUL = new y(lllIlllIlIII[1], lllIlllIlIII[2], lllIlllIlIII[3]);
        DRAGON_CLAWS = new y(lllIlllIlIII[4], lllIlllIlIII[2], lllIlllIlIII[3]);
        VOID_WAKER = new y(lllIlllIlIII[6], lllIlllIlIII[2], lllIlllIlIII[0]);
        ANCIENT_GODSWORD = new y(lllIlllIlIII[8], lllIlllIlIII[2], lllIlllIlIII[3]);
        DRAGON_MACE = new y(lllIlllIlIII[10], lllIlllIlIII[11], lllIlllIlIII[0]);
        OSMUMTENS_FANG = new y(lllIlllIlIII[13], lllIlllIlIII[11], lllIlllIlIII[0]);
        SARADOMIN_GODSWORD = new y(lllIlllIlIII[15], lllIlllIlIII[2], lllIlllIlIII[3]);
        DRAGON_WARHAMMER = new y(lllIlllIlIII[17], lllIlllIlIII[2], lllIlllIlIII[0]);
        ARMADYL_GODSWORD = new y(lllIlllIlIII[19], lllIlllIlIII[2], lllIlllIlIII[3]);
        BANDOS_GODSWORD = new y(lllIlllIlIII[21], lllIlllIlIII[2], lllIlllIlIII[3]);
        CRYSTAL_HALBERD = new y(lllIlllIlIII[23], lllIlllIlIII[24], lllIlllIlIII[3]);
        NONE = new y(lllIlllIlIII[26], lllIlllIlIII[0], lllIlllIlIII[0]);
        y[] yArray = new y[lllIlllIlIII[27]];
        yArray[y.lllIlllIlIII[0]] = GRANITE_MAUL;
        yArray[y.lllIlllIlIII[3]] = DRAGON_CLAWS;
        yArray[y.lllIlllIlIII[5]] = VOID_WAKER;
        yArray[y.lllIlllIlIII[7]] = ANCIENT_GODSWORD;
        yArray[y.lllIlllIlIII[9]] = DRAGON_MACE;
        yArray[y.lllIlllIlIII[12]] = OSMUMTENS_FANG;
        yArray[y.lllIlllIlIII[14]] = SARADOMIN_GODSWORD;
        yArray[y.lllIlllIlIII[16]] = DRAGON_WARHAMMER;
        yArray[y.lllIlllIlIII[18]] = ARMADYL_GODSWORD;
        yArray[y.lllIlllIlIII[20]] = BANDOS_GODSWORD;
        yArray[y.lllIlllIlIII[22]] = CRYSTAL_HALBERD;
        yArray[y.lllIlllIlIII[25]] = NONE;
        $VALUES = yArray;
    }

    private static void lIIIllIlllIIlII() {
        lllIlllIIIll = new String[lllIlllIlIII[27]];
        y.lllIlllIIIll[y.lllIlllIlIII[0]] = y."GRANITE_MAUL";
        y.lllIlllIIIll[y.lllIlllIlIII[3]] = y."DRAGON_CLAWS";
        y.lllIlllIIIll[y.lllIlllIlIII[5]] = y."VOID_WAKER";
        y.lllIlllIIIll[y.lllIlllIlIII[7]] = y."ANCIENT_GODSWORD";
        y.lllIlllIIIll[y.lllIlllIlIII[9]] = y."DRAGON_MACE";
        y.lllIlllIIIll[y.lllIlllIlIII[12]] = y."OSMUMTENS_FANG";
        y.lllIlllIIIll[y.lllIlllIlIII[14]] = y."SARADOMIN_GODSWORD";
        y.lllIlllIIIll[y.lllIlllIlIII[16]] = y."DRAGON_WARHAMMER";
        y.lllIlllIIIll[y.lllIlllIlIII[18]] = y."ARMADYL_GODSWORD";
        y.lllIlllIIIll[y.lllIlllIlIII[20]] = y."BANDOS_GODSWORD";
        y.lllIlllIIIll[y.lllIlllIlIII[22]] = y."CRYSTAL_HALBERD";
        y.lllIlllIIIll[y.lllIlllIlIII[25]] = y."NONE";
    }

    private y(int n3, int n4, boolean bl) {
        this.itemID = n3;
        this.specAmount = n4;
        this.twoHanded = bl;
    }

    public int bH() {
        return this.itemID;
    }

    private static String lIIIllIllIllllI(String var2, String var16) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lllIlllIlIII[5], var7);
            return new String(var3.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIlllIllII(int n2, int n3) {
        return n2 < n3;
    }

    public boolean bR() {
        return this.twoHanded;
    }

    public static y[] values() {
        return (y[])$VALUES.clone();
    }

    private static void lIIIllIlllIlIll() {
        lllIlllIlIII = new int[28];
        y.lllIlllIlIII[0] = (28 + 176 - 160 + 147 ^ 72 + 36 - 91 + 145) & (0x59 ^ 0x17 ^ (0x95 ^ 0xC6) ^ -1);
        y.lllIlllIlIII[1] = 0xFFFFDFE7 & 0x7EB9;
        y.lllIlllIlIII[2] = 0x7C ^ 0x4E;
        y.lllIlllIlIII[3] = 1;
        y.lllIlllIlIII[4] = 0xFFFFF57C & 0x3FD7;
        y.lllIlllIlIII[5] = 2;
        y.lllIlllIlIII[6] = 0xFFFFEF6A & 0x7CBF;
        y.lllIlllIlIII[7] = 3;
        y.lllIlllIlIII[8] = -(0xFFFFDDB7 & 0x3A4D) & (0xFFFFFF7D & 0x7EFF);
        y.lllIlllIlIII[9] = 0xF ^ 0xB;
        y.lllIlllIlIII[10] = 0xFFFF95FE & 0x6F9B;
        y.lllIlllIlIII[11] = 61 + 36 - -6 + 29 ^ 107 + 70 - 46 + 26;
        y.lllIlllIlIII[12] = 0xA6 ^ 0xA3;
        y.lllIlllIlIII[13] = 0xFFFFEE6F & 0x77FB;
        y.lllIlllIlIII[14] = 0x89 ^ 0x8F;
        y.lllIlllIlIII[15] = -(0xFFFFEDEF & 0x1371) & (0xFFFFEF7E & 0x3FFF);
        y.lllIlllIlIII[16] = 96 + 103 - 123 + 102 ^ 58 + 7 - -102 + 14;
        y.lllIlllIlIII[17] = -(0xFFFF8E74 & 0x7BEF) & (0xFFFFFFEB & 0x3F7F);
        y.lllIlllIlIII[18] = 0x14 ^ 0x1C;
        y.lllIlllIlIII[19] = 0xFFFFFF3A & 0x2EDF;
        y.lllIlllIlIII[20] = 0xC0 ^ 0xB7 ^ (0x32 ^ 0x4C);
        y.lllIlllIlIII[21] = 0xFFFFEF9E & 0x3E7D;
        y.lllIlllIlIII[22] = 110 + 130 - 141 + 41 ^ 84 + 101 - 130 + 79;
        y.lllIlllIlIII[23] = -(0xFFFFB3DD & 0x4E2B) & (0xFFFFDFBF & 0x7FFB);
        y.lllIlllIlIII[24] = 0xD2 ^ 0xB9 ^ (0xDE ^ 0xAB);
        y.lllIlllIlIII[25] = 1 ^ 0xA;
        y.lllIlllIlIII[26] = -1;
        y.lllIlllIlIII[27] = 0x8C ^ 0x80;
    }

    private static String lIIIllIlllIIIlI(String var12, String var17) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lllIlllIlIII[18]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lllIlllIlIII[5], var8);
            return new String(var4.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public static y valueOf(String string) {
        return Enum.valueOf(y.class, string);
    }

    private static String lIIIllIllIlllIl(String var11, String var15) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var13 = var15.toCharArray();
        int var1 = lllIlllIlIII[0];
        char[] var5 = var11.toCharArray();
        int var18 = var5.length;
        int var9 = lllIlllIlIII[0];
        while (y.lIIIllIlllIllII(var9, var18)) {
            char var6 = var5[var9];
            var10.append((char)(var6 ^ var13[var1 % var13.length]));
            0;
            ++var1;
            ++var9;
            0;
            if (((0x9C ^ 0x9B ^ (0x63 ^ 0x47)) & (0x2D ^ 0x3B ^ (0x21 ^ 0x14) ^ -1)) >= 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    public int bQ() {
        return this.specAmount;
    }
}

