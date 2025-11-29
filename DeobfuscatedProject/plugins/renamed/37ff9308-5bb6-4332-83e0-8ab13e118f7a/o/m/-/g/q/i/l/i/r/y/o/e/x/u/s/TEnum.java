/*
 * Decompiled with CFR 0.152.
 */
package o.m.-.g.q.i.l.i.r.y.o.e.x.u.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class TEnum
extends Enum<t> {
    private final /* synthetic */ int lever2Value;
    private static /* synthetic */ String[] lllllllllllI;
    private final /* synthetic */ int unfinishedID;
    private final /* synthetic */ int finishedID;
    public static final /* synthetic */ /* enum */ t AZURE_AURA_MIX;
    public static final /* synthetic */ /* enum */ t ALCO_AUGMENTATOR;
    private final /* synthetic */ int lever3Value;
    public static final /* synthetic */ /* enum */ t MAMMOTH_MIGHT;
    private static final /* synthetic */ t[] $VALUES;
    public static final /* synthetic */ /* enum */ t MYSTIC_MANA_AMALGAM;
    public static final /* synthetic */ /* enum */ t MARLEYS_MOONLIGHT;
    public static final /* synthetic */ /* enum */ t ANTI_LEECH_LOTION;
    public static final /* synthetic */ /* enum */ t MIXALOT;
    private final /* synthetic */ int xpReward;
    private final /* synthetic */ int lever1Value;
    private final /* synthetic */ String rewardType;
    public static final /* synthetic */ /* enum */ t LIPLACK_LIQUOR;
    public static final /* synthetic */ /* enum */ t MEGALITE_LIQUID;
    public static final /* synthetic */ /* enum */ t AQUALUX_AMALGAM;
    private static /* synthetic */ int[] llllllllllll;
    private final /* synthetic */ String name;

    public int n() {
        return this.unfinishedID;
    }

    public static t[] values() {
        return (t[])$VALUES.clone();
    }

    private static boolean lIIlIllIIIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    public int k() {
        return this.lever2Value;
    }

    public String q() {
        return this.rewardType;
    }

    public int m() {
        return this.lever1Value;
    }

    public int l() {
        return this.lever3Value;
    }

    private static String lIIlIlIllllllII(String var10, String var17) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(llllllllllll[6], var1);
            return new String(var18.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    static {
        t.lIIlIlIllllllll();
        t.lIIlIlIlllllllI();
        LIPLACK_LIQUOR = new t(lllllllllllI[llllllllllll[1]], llllllllllll[2], llllllllllll[3], llllllllllll[4], llllllllllll[4], llllllllllll[4], llllllllllll[5], lllllllllllI[llllllllllll[6]]);
        ALCO_AUGMENTATOR = new t(lllllllllllI[llllllllllll[7]], llllllllllll[8], llllllllllll[9], llllllllllll[6], llllllllllll[6], llllllllllll[6], llllllllllll[5], lllllllllllI[llllllllllll[10]]);
        MAMMOTH_MIGHT = new t(lllllllllllI[llllllllllll[12]], llllllllllll[13], llllllllllll[14], llllllllllll[1], llllllllllll[1], llllllllllll[1], llllllllllll[5], lllllllllllI[llllllllllll[15]]);
        MYSTIC_MANA_AMALGAM = new t(lllllllllllI[llllllllllll[17]], llllllllllll[18], llllllllllll[19], llllllllllll[1], llllllllllll[1], llllllllllll[6], llllllllllll[20], lllllllllllI[llllllllllll[21]]);
        MARLEYS_MOONLIGHT = new t(lllllllllllI[llllllllllll[23]], llllllllllll[24], llllllllllll[25], llllllllllll[1], llllllllllll[1], llllllllllll[4], llllllllllll[26], lllllllllllI[llllllllllll[27]]);
        AZURE_AURA_MIX = new t(lllllllllllI[llllllllllll[29]], llllllllllll[30], llllllllllll[31], llllllllllll[6], llllllllllll[6], llllllllllll[1], llllllllllll[32], lllllllllllI[llllllllllll[33]]);
        AQUALUX_AMALGAM = new t(lllllllllllI[llllllllllll[35]], llllllllllll[36], llllllllllll[37], llllllllllll[6], llllllllllll[4], llllllllllll[6], llllllllllll[38], lllllllllllI[llllllllllll[39]]);
        MEGALITE_LIQUID = new t(lllllllllllI[llllllllllll[41]], llllllllllll[42], llllllllllll[43], llllllllllll[1], llllllllllll[4], llllllllllll[4], llllllllllll[44], lllllllllllI[llllllllllll[45]]);
        ANTI_LEECH_LOTION = new t(lllllllllllI[llllllllllll[47]], llllllllllll[48], llllllllllll[49], llllllllllll[6], llllllllllll[4], llllllllllll[4], llllllllllll[50], lllllllllllI[llllllllllll[51]]);
        MIXALOT = new t(lllllllllllI[llllllllllll[53]], llllllllllll[54], llllllllllll[55], llllllllllll[1], llllllllllll[6], llllllllllll[4], llllllllllll[56], lllllllllllI[llllllllllll[57]]);
        t[] tArray = new t[llllllllllll[17]];
        tArray[t.llllllllllll[0]] = LIPLACK_LIQUOR;
        tArray[t.llllllllllll[1]] = ALCO_AUGMENTATOR;
        tArray[t.llllllllllll[6]] = MAMMOTH_MIGHT;
        tArray[t.llllllllllll[4]] = MYSTIC_MANA_AMALGAM;
        tArray[t.llllllllllll[7]] = MARLEYS_MOONLIGHT;
        tArray[t.llllllllllll[10]] = AZURE_AURA_MIX;
        tArray[t.llllllllllll[11]] = AQUALUX_AMALGAM;
        tArray[t.llllllllllll[12]] = MEGALITE_LIQUID;
        tArray[t.llllllllllll[15]] = ANTI_LEECH_LOTION;
        tArray[t.llllllllllll[16]] = MIXALOT;
        $VALUES = tArray;
    }

    public int o() {
        return this.finishedID;
    }

    private static void lIIlIlIlllllllI() {
        lllllllllllI = new String[llllllllllll[58]];
        t.lllllllllllI[t.llllllllllll[0]] = t."LIPLACK_LIQUOR";
        t.lllllllllllI[t.llllllllllll[1]] = t."Liplack liquor";
        t.lllllllllllI[t.llllllllllll[6]] = t."lye";
        t.lllllllllllI[t.llllllllllll[4]] = t."ALCO_AUGMENTATOR";
        t.lllllllllllI[t.llllllllllll[7]] = t."Alco-augmentator";
        t.lllllllllllI[t.llllllllllll[10]] = t."aga";
        t.lllllllllllI[t.llllllllllll[11]] = t."MAMMOTH_MIGHT";
        t.lllllllllllI[t.llllllllllll[12]] = t."Mammoth-might mix";
        t.lllllllllllI[t.llllllllllll[15]] = t."mox";
        t.lllllllllllI[t.llllllllllll[16]] = t."MYSTIC_MANA_AMALGAM";
        t.lllllllllllI[t.llllllllllll[17]] = t."Mystic mana amalgam";
        t.lllllllllllI[t.llllllllllll[21]] = t."mox";
        t.lllllllllllI[t.llllllllllll[22]] = t."MARLEYS_MOONLIGHT";
        t.lllllllllllI[t.llllllllllll[23]] = t."Marley's moonlight";
        t.lllllllllllI[t.llllllllllll[27]] = t."mox";
        t.lllllllllllI[t.llllllllllll[28]] = t."AZURE_AURA_MIX";
        t.lllllllllllI[t.llllllllllll[29]] = t."Azure aura mix";
        t.lllllllllllI[t.llllllllllll[33]] = t."aga";
        t.lllllllllllI[t.llllllllllll[34]] = t."AQUALUX_AMALGAM";
        t.lllllllllllI[t.llllllllllll[35]] = t."Aqualux amalgam";
        t.lllllllllllI[t.llllllllllll[39]] = t."aga";
        t.lllllllllllI[t.llllllllllll[40]] = t."MEGALITE_LIQUID";
        t.lllllllllllI[t.llllllllllll[41]] = t."Megalite liquid";
        t.lllllllllllI[t.llllllllllll[45]] = t."lye";
        t.lllllllllllI[t.llllllllllll[46]] = t."ANTI_LEECH_LOTION";
        t.lllllllllllI[t.llllllllllll[47]] = t."Anti-leech lotion";
        t.lllllllllllI[t.llllllllllll[51]] = t."lye";
        t.lllllllllllI[t.llllllllllll[52]] = t."MIXALOT";
        t.lllllllllllI[t.llllllllllll[53]] = t."Mixalot";
        t.lllllllllllI[t.llllllllllll[57]] = t."lye";
    }

    public int p() {
        return this.xpReward;
    }

    private static void lIIlIlIllllllll() {
        llllllllllll = new int[59];
        t.llllllllllll[0] = (0x69 ^ 0x34 ^ (0x5F ^ 0x2C)) & (0x34 ^ 0x73 ^ (0xCC ^ 0xA5) ^ -1);
        t.llllllllllll[1] = 1;
        t.llllllllllll[2] = -(111 + 5 - 57 + 128) & (0xFFFFF5FF & 0x7FFB);
        t.llllllllllll[3] = 0xFFFFF77F & 0x7DCB;
        t.llllllllllll[4] = 3;
        t.llllllllllll[5] = 65 + 177 - 62 + 0 + (0x3E ^ 0x1A) - (103 + 97 - 146 + 81) + (0xFD ^ 0x90);
        t.llllllllllll[6] = 2;
        t.llllllllllll[7] = 109 + 51 - 79 + 103 ^ 67 + 99 - 77 + 99;
        t.llllllllllll[8] = -(0xFFFF9CEF & 0x6B51) & (0xFFFFFFFF & 0x7D7E);
        t.llllllllllll[9] = -(0xFFFFBDE6 & 0x4ABF) & (0xFFFFFFEF & 0x7DFD);
        t.llllllllllll[10] = 0x42 ^ 0x67 ^ (0x80 ^ 0xA0);
        t.llllllllllll[11] = 0xA5 ^ 0x9E ^ (0x5D ^ 0x60);
        t.llllllllllll[12] = 0x15 ^ 6 ^ (0x4C ^ 0x58);
        t.llllllllllll[13] = -(0xFFFFFFE1 & 0xADF) & (0xFFFFFFFB & Short.MAX_VALUE);
        t.llllllllllll[14] = -(0xFFFF8ABF & 0x7FDB) & (0xFFFFFFFF & 0x7FDF);
        t.llllllllllll[15] = 0xA6 ^ 0xAE;
        t.llllllllllll[16] = 0xB3 ^ 0xBA;
        t.llllllllllll[17] = 0x6B ^ 0x53 ^ (0xAC ^ 0x9E);
        t.llllllllllll[18] = 0xFFFFF7BE & 0x7D7D;
        t.llllllllllll[19] = 0xFFFFFDF7 & 0x774E;
        t.llllllllllll[20] = (0x6E ^ 0x2A) + (0x31 ^ 0x5F) - (9 + 122 - 110 + 108) + (84 + 37 - 26 + 71);
        t.llllllllllll[21] = 0x15 ^ 0x1E;
        t.llllllllllll[22] = 0x6D ^ 0x15 ^ (0x2F ^ 0x5B);
        t.llllllllllll[23] = 0xDA ^ 0xB1 ^ (0xD6 ^ 0xB0);
        t.llllllllllll[24] = 0xFFFFFD3D & 0x77FF;
        t.llllllllllll[25] = -(0xFFFFDAB9 & 0x27FF) & (0xFFFFF7FF & Short.MAX_VALUE);
        t.llllllllllll[26] = 222 + 232 - 361 + 147;
        t.llllllllllll[27] = 0x3D ^ 0x33;
        t.llllllllllll[28] = 0x67 ^ 0x68;
        t.llllllllllll[29] = 133 + 34 - 65 + 76 ^ 120 + 53 - 117 + 106;
        t.llllllllllll[30] = 0xFFFFFDDB & 0x7764;
        t.llllllllllll[31] = -(0xFFFFEBAD & 0x1CF3) & (0xFFFFFDEA & Short.MAX_VALUE);
        t.llllllllllll[32] = 0xFFFFD7CB & 0x293D;
        t.llllllllllll[33] = 0x2C ^ 0x3D;
        t.llllllllllll[34] = 0x3C ^ 0x1D ^ (0xF1 ^ 0xC2);
        t.llllllllllll[35] = 0xD3 ^ 0xC0;
        t.llllllllllll[36] = -(28 + 135 - 83 + 113) & (0xFFFFFDFF & 0x77FF);
        t.llllllllllll[37] = 0xFFFFF55D & 0x7FEB;
        t.llllllllllll[38] = -(0xFFFFFFFE & 0x7C0F) & (0xFFFFFDFF & 0x7F2F);
        t.llllllllllll[39] = 116 + 157 - 236 + 130 ^ 46 + 170 - 196 + 159;
        t.llllllllllll[40] = 0x78 ^ 0x6D;
        t.llllllllllll[41] = 0x25 ^ 0x61 ^ (0 ^ 0x52);
        t.llllllllllll[42] = -(0xFFFFC2B9 & 0x3F4F) & (0xFFFFFFCF & 0x777B);
        t.llllllllllll[43] = -(111 + 88 - 20 + 0) & (0xFFFFF5FF & Short.MAX_VALUE);
        t.llllllllllll[44] = 0xFFFFA9FB & 0x573F;
        t.llllllllllll[45] = 0x1E ^ 9;
        t.llllllllllll[46] = 59 + 105 - 107 + 91 ^ 82 + 65 - 22 + 15;
        t.llllllllllll[47] = 133 + 123 - 172 + 94 ^ 170 + 68 - 79 + 12;
        t.llllllllllll[48] = -(0xFFFFBFA3 & 0x4AFE) & (0xFFFFFFFF & 0x7FE3);
        t.llllllllllll[49] = 0xFFFFFD6E & 0x77DD;
        t.llllllllllll[50] = 0xFFFFC75D & 0x39F6;
        t.llllllllllll[51] = 0x8B ^ 0x91;
        t.llllllllllll[52] = 0x41 ^ 0x79 ^ (0x9C ^ 0xBF);
        t.llllllllllll[53] = 0x84 ^ 0x8A ^ (0x31 ^ 0x23);
        t.llllllllllll[54] = -(0x47 ^ 0x43) & (0xFFFFFF47 & 0x75FF);
        t.llllllllllll[55] = 0xFFFFFF4E & 0x75FF;
        t.llllllllllll[56] = 0xFFFFA96F & 0x57FD;
        t.llllllllllll[57] = 2 ^ (0x12 ^ 0xD);
        t.llllllllllll[58] = 2 ^ (0x52 ^ 0x4E);
    }

    public static t valueOf(String string) {
        return Enum.valueOf(t.class, string);
    }

    private static String lIIlIlIllllllIl(String var13, String var16) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var6 = var16.toCharArray();
        int var7 = llllllllllll[0];
        char[] var11 = var13.toCharArray();
        int var19 = var11.length;
        int var14 = llllllllllll[0];
        while (t.lIIlIllIIIIIIII(var14, var19)) {
            char var8 = var11[var14];
            var4.append((char)(var8 ^ var6[var7 % var6.length]));
            0;
            ++var7;
            ++var14;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private t(String string2, int n3, int n4, int n5, int n6, int n7, int n8, String string3) {
        this.name = string2;
        this.unfinishedID = n3;
        this.finishedID = n4;
        this.lever1Value = n5;
        this.lever2Value = n6;
        this.lever3Value = n7;
        this.xpReward = n8;
        this.rewardType = string3;
    }

    public String a() {
        return this.name;
    }

    private static String lIIlIlIlllllIll(String var2, String var3) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), llllllllllll[15]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(llllllllllll[6], var9);
            return new String(var12.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }
}

