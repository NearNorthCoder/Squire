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

public final class t
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

    private static String lIIlIlIllllllII(String lllllllllllllllIIlIIIIIllIIlIllI, String lllllllllllllllIIlIIIIIllIIlIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIIllIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIllIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIIIllIIllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIIIllIIllIII.init(llllllllllll[6], lllllllllllllllIIlIIIIIllIIllIIl);
            return new String(lllllllllllllllIIlIIIIIllIIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIllIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIIIllIIlIlll) {
            lllllllllllllllIIlIIIIIllIIlIlll.printStackTrace();
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
        t.lllllllllllI[t.llllllllllll[0]] = t.lIIlIlIlllllIll("rVtKLiBAI/dcY+IPmXDn/g==", "ullCF");
        t.lllllllllllI[t.llllllllllll[1]] = t.lIIlIlIllllllII("bBhwpRx/4O3sTj3EVGseQQ==", "nLmok");
        t.lllllllllllI[t.llllllllllll[6]] = t.lIIlIlIlllllIll("AXE777Yed+I=", "GJNuz");
        t.lllllllllllI[t.llllllllllll[4]] = t.lIIlIlIlllllIll("/Hp34tBvD/qJ3kK2bbw18/nogibk3Fgk", "mmhiU");
        t.lllllllllllI[t.llllllllllll[7]] = t.lIIlIlIlllllIll("gNIDHLakd5Z/M2nV1ABmmPemNyC/J2y7", "JJlVB");
        t.lllllllllllI[t.llllllllllll[10]] = t.lIIlIlIllllllIl("JB8J", "ExhsA");
        t.lllllllllllI[t.llllllllllll[11]] = t.lIIlIlIllllllIl("DDkkDhwVMDYOGgYwPQ==", "AxiCS");
        t.lllllllllllI[t.llllllllllll[12]] = t.lIIlIlIlllllIll("LfpGQHMrZdJYPg2hhMCZfQyZRSRWWb7A", "HHMZV");
        t.lllllllllllI[t.llllllllllll[15]] = t.lIIlIlIllllllIl("ACEi", "mNZhu");
        t.lllllllllllI[t.llllllllllll[16]] = t.lIIlIlIllllllIl("OzAgGjw1Nj4POzc2MgM0Oi4yAw==", "visNu");
        t.lllllllllllI[t.llllllllllll[17]] = t.lIIlIlIlllllIll("J6AoBxI/VTtRUpcyI3kMi/9wG2t5zme6", "dwZUS");
        t.lllllllllllI[t.llllllllllll[21]] = t.lIIlIlIllllllII("D3lReTi5dss=", "eOprq");
        t.lllllllllllI[t.llllllllllll[22]] = t.lIIlIlIllllllII("UqQ4+mxQdWbgMscvgh9Rza+/2M2CYNVA", "bBmzh");
        t.lllllllllllI[t.llllllllllll[23]] = t.lIIlIlIllllllIl("KjQ6BT0ecjtJNQg6JgUxAD08", "gUHiX");
        t.lllllllllllI[t.llllllllllll[27]] = t.lIIlIlIllllllIl("DBc5", "axAeK");
        t.lllllllllllI[t.llllllllllll[28]] = t.lIIlIlIllllllII("XqLRKMHqB2MVmkIkzEWpYQ==", "MZeoc");
        t.lllllllllllI[t.llllllllllll[29]] = t.lIIlIlIllllllIl("MA0eOChRFh44LFEaAjI=", "qwkJM");
        t.lllllllllllI[t.llllllllllll[33]] = t.lIIlIlIllllllIl("JTMx", "DTPHb");
        t.lllllllllllI[t.llllllllllll[34]] = t.lIIlIlIllllllIl("OSQzFT8tLTkVPjk5IRU+", "xufTs");
        t.lllllllllllI[t.llllllllllll[35]] = t.lIIlIlIllllllIl("JSsUKDsRIkEoOgU2Big6", "dZaIW");
        t.lllllllllllI[t.llllllllllll[39]] = t.lIIlIlIllllllII("+M+9bcDdvQw=", "mmBjY");
        t.lllllllllllI[t.llllllllllll[40]] = t.lIIlIlIllllllIl("HjQKOTYaJQgnNhogGDE+", "SqMxz");
        t.lllllllllllI[t.llllllllllll[41]] = t.lIIlIlIllllllIl("GBAgMg08ASJzDTwEMjoF", "UuGSa");
        t.lllllllllllI[t.llllllllllll[45]] = t.lIIlIlIllllllII("uYbJqu28zw8=", "zmIwn");
        t.lllllllllllI[t.llllllllllll[46]] = t.lIIlIlIllllllIl("FSsQLxQYIAElAwspCzICGys=", "TeDfK");
        t.lllllllllllI[t.llllllllllll[47]] = t.lIIlIlIlllllIll("BM/XMcCkoMR5v6MIFN9TwwA0fnjZ57CS", "EEAmK");
        t.lllllllllllI[t.llllllllllll[51]] = t.lIIlIlIllllllII("BuKmDVbLtpc=", "msDLl");
        t.lllllllllllI[t.llllllllllll[52]] = t.lIIlIlIlllllIll("JdVq811XQ2c=", "yhGVo");
        t.lllllllllllI[t.llllllllllll[53]] = t.lIIlIlIlllllIll("QFo7+0T/2+Y=", "YuQao");
        t.lllllllllllI[t.llllllllllll[57]] = t.lIIlIlIllllllIl("HB4r", "pgNOt");
    }

    public int p() {
        return this.xpReward;
    }

    private static void lIIlIlIllllllll() {
        llllllllllll = new int[59];
        t.llllllllllll[0] = (0x69 ^ 0x34 ^ (0x5F ^ 0x2C)) & (0x34 ^ 0x73 ^ (0xCC ^ 0xA5) ^ -" ".length());
        t.llllllllllll[1] = " ".length();
        t.llllllllllll[2] = -(111 + 5 - 57 + 128) & (0xFFFFF5FF & 0x7FFB);
        t.llllllllllll[3] = 0xFFFFF77F & 0x7DCB;
        t.llllllllllll[4] = "   ".length();
        t.llllllllllll[5] = 65 + 177 - 62 + 0 + (0x3E ^ 0x1A) - (103 + 97 - 146 + 81) + (0xFD ^ 0x90);
        t.llllllllllll[6] = "  ".length();
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
        t.llllllllllll[57] = "  ".length() ^ (0x12 ^ 0xD);
        t.llllllllllll[58] = "  ".length() ^ (0x52 ^ 0x4E);
    }

    public static t valueOf(String string) {
        return Enum.valueOf(t.class, string);
    }

    private static String lIIlIlIllllllIl(String lllllllllllllllIIlIIIIIlIllllIIl, String lllllllllllllllIIlIIIIIlIllllIII) {
        lllllllllllllllIIlIIIIIlIllllIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIlIllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIIIlIlllIlll = new StringBuilder();
        char[] lllllllllllllllIIlIIIIIlIlllIllI = lllllllllllllllIIlIIIIIlIllllIII.toCharArray();
        int lllllllllllllllIIlIIIIIlIlllIlIl = llllllllllll[0];
        char[] lllllllllllllllIIlIIIIIlIllIllll = lllllllllllllllIIlIIIIIlIllllIIl.toCharArray();
        int lllllllllllllllIIlIIIIIlIllIlllI = lllllllllllllllIIlIIIIIlIllIllll.length;
        int lllllllllllllllIIlIIIIIlIllIllIl = llllllllllll[0];
        while (t.lIIlIllIIIIIIII(lllllllllllllllIIlIIIIIlIllIllIl, lllllllllllllllIIlIIIIIlIllIlllI)) {
            char lllllllllllllllIIlIIIIIlIllllIlI = lllllllllllllllIIlIIIIIlIllIllll[lllllllllllllllIIlIIIIIlIllIllIl];
            lllllllllllllllIIlIIIIIlIlllIlll.append((char)(lllllllllllllllIIlIIIIIlIllllIlI ^ lllllllllllllllIIlIIIIIlIlllIllI[lllllllllllllllIIlIIIIIlIlllIlIl % lllllllllllllllIIlIIIIIlIlllIllI.length]));
            "".length();
            ++lllllllllllllllIIlIIIIIlIlllIlIl;
            ++lllllllllllllllIIlIIIIIlIllIllIl;
            "".length();
            if ("   ".length() > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIIIIlIlllIlll);
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

    private static String lIIlIlIlllllIll(String lllllllllllllllIIlIIIIIllIIIlIIl, String lllllllllllllllIIlIIIIIllIIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIIllIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIllIIIIllI.getBytes(StandardCharsets.UTF_8)), llllllllllll[15]), "DES");
            Cipher lllllllllllllllIIlIIIIIllIIIlIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIIIllIIIlIll.init(llllllllllll[6], lllllllllllllllIIlIIIIIllIIIllII);
            return new String(lllllllllllllllIIlIIIIIllIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIllIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIIIllIIIlIlI) {
            lllllllllllllllIIlIIIIIllIIIlIlI.printStackTrace();
            return null;
        }
    }
}

