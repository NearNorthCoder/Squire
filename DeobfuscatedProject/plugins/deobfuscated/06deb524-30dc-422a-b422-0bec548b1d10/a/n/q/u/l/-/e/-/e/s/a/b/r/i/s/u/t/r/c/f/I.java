/*
 * Decompiled with CFR 0.152.
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class I {
    private static /* synthetic */ String[] lIIllIIlIlll;
    public static /* synthetic */ String by;
    public static /* synthetic */ String bH;
    public static /* synthetic */ String aV;
    public static /* synthetic */ String bv;
    public static /* synthetic */ String aZ;
    public static /* synthetic */ String bd;
    public static /* synthetic */ String aY;
    public static /* synthetic */ String bl;
    public static /* synthetic */ String aU;
    public static /* synthetic */ String bm;
    public static /* synthetic */ String bw;
    public static /* synthetic */ String bb;
    private static /* synthetic */ int[] lIIllIIlllII;
    public static /* synthetic */ String bA;
    public static /* synthetic */ String bj;
    public static /* synthetic */ String bg;
    public static /* synthetic */ String bc;
    public static /* synthetic */ String aW;
    public static /* synthetic */ String ba;
    public static /* synthetic */ String bz;
    public static /* synthetic */ String bo;
    public static /* synthetic */ String be;
    public static /* synthetic */ String aQ;
    public static /* synthetic */ String bt;
    public static /* synthetic */ String bq;
    public static /* synthetic */ String bn;
    public static /* synthetic */ String bu;
    public static /* synthetic */ String bs;
    public static /* synthetic */ String bp;
    public static /* synthetic */ String bG;
    public static /* synthetic */ String bB;
    public static /* synthetic */ String br;
    public static /* synthetic */ String aX;
    public static /* synthetic */ String bF;
    public static /* synthetic */ String bC;
    public static /* synthetic */ String aT;
    public static /* synthetic */ String aS;
    public static /* synthetic */ String bh;
    public static /* synthetic */ String bJ;
    public static /* synthetic */ String bf;
    public static /* synthetic */ String bi;
    public static /* synthetic */ String bL;
    public static /* synthetic */ String aR;
    public static /* synthetic */ String bE;
    public static /* synthetic */ String bI;
    public static /* synthetic */ String bD;
    public static /* synthetic */ String bx;
    public static /* synthetic */ String bk;
    public static /* synthetic */ String bK;

    private static String llIIlllIlIlIIl(String lllllllllllllllIlllIlllIIllllIlI, String lllllllllllllllIlllIlllIIllllIIl) {
        lllllllllllllllIlllIlllIIllllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlllIIllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlllIIllllIII = new StringBuilder();
        char[] lllllllllllllllIlllIlllIIlllIlll = lllllllllllllllIlllIlllIIllllIIl.toCharArray();
        int lllllllllllllllIlllIlllIIlllIllI = lIIllIIlllII[0];
        char[] lllllllllllllllIlllIlllIIlllIIII = lllllllllllllllIlllIlllIIllllIlI.toCharArray();
        int lllllllllllllllIlllIlllIIllIllll = lllllllllllllllIlllIlllIIlllIIII.length;
        int lllllllllllllllIlllIlllIIllIlllI = lIIllIIlllII[0];
        while (I.llIIlllIlllIIl(lllllllllllllllIlllIlllIIllIlllI, lllllllllllllllIlllIlllIIllIllll)) {
            char lllllllllllllllIlllIlllIIllllIll = lllllllllllllllIlllIlllIIlllIIII[lllllllllllllllIlllIlllIIllIlllI];
            lllllllllllllllIlllIlllIIllllIII.append((char)(lllllllllllllllIlllIlllIIllllIll ^ lllllllllllllllIlllIlllIIlllIlll[lllllllllllllllIlllIlllIIlllIllI % lllllllllllllllIlllIlllIIlllIlll.length]));
            0;
            ++lllllllllllllllIlllIlllIIlllIllI;
            ++lllllllllllllllIlllIlllIIllIlllI;
            0;
            if (1 != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIlllIIllllIII);
    }

    static {
        I.llIIlllIlllIII();
        I.llIIlllIllIlII();
        aQ = lIIllIIlIlll[lIIllIIlllII[0]];
        aR = lIIllIIlIlll[lIIllIIlllII[1]];
        aS = lIIllIIlIlll[lIIllIIlllII[2]];
        aT = lIIllIIlIlll[lIIllIIlllII[3]];
        aU = lIIllIIlIlll[lIIllIIlllII[4]];
        aV = lIIllIIlIlll[lIIllIIlllII[5]];
        aW = lIIllIIlIlll[lIIllIIlllII[6]];
        aX = lIIllIIlIlll[lIIllIIlllII[7]];
        aY = lIIllIIlIlll[lIIllIIlllII[8]];
        aZ = lIIllIIlIlll[lIIllIIlllII[9]];
        ba = lIIllIIlIlll[lIIllIIlllII[10]];
        bb = lIIllIIlIlll[lIIllIIlllII[11]];
        bc = lIIllIIlIlll[lIIllIIlllII[12]];
        bd = lIIllIIlIlll[lIIllIIlllII[13]];
        be = lIIllIIlIlll[lIIllIIlllII[14]];
        bf = lIIllIIlIlll[lIIllIIlllII[15]];
        bg = lIIllIIlIlll[lIIllIIlllII[16]];
        bh = lIIllIIlIlll[lIIllIIlllII[17]];
        bi = lIIllIIlIlll[lIIllIIlllII[18]];
        bj = lIIllIIlIlll[lIIllIIlllII[19]];
        bk = lIIllIIlIlll[lIIllIIlllII[20]];
        bl = lIIllIIlIlll[lIIllIIlllII[21]];
        bm = lIIllIIlIlll[lIIllIIlllII[22]];
        bn = lIIllIIlIlll[lIIllIIlllII[23]];
        bo = lIIllIIlIlll[lIIllIIlllII[24]];
        bp = null;
        bq = lIIllIIlIlll[lIIllIIlllII[25]];
        br = lIIllIIlIlll[lIIllIIlllII[26]];
        bs = lIIllIIlIlll[lIIllIIlllII[27]];
        bt = lIIllIIlIlll[lIIllIIlllII[28]];
        bu = lIIllIIlIlll[lIIllIIlllII[29]];
        bv = lIIllIIlIlll[lIIllIIlllII[30]];
        bw = lIIllIIlIlll[lIIllIIlllII[31]];
        bx = lIIllIIlIlll[lIIllIIlllII[32]];
        by = lIIllIIlIlll[lIIllIIlllII[33]];
        bz = lIIllIIlIlll[lIIllIIlllII[34]];
        bA = lIIllIIlIlll[lIIllIIlllII[35]];
        bB = lIIllIIlIlll[lIIllIIlllII[36]];
        bC = lIIllIIlIlll[lIIllIIlllII[37]];
        bD = lIIllIIlIlll[lIIllIIlllII[38]];
        bE = lIIllIIlIlll[lIIllIIlllII[39]];
        bF = lIIllIIlIlll[lIIllIIlllII[40]];
        bG = lIIllIIlIlll[lIIllIIlllII[41]];
        bH = lIIllIIlIlll[lIIllIIlllII[42]];
        bI = lIIllIIlIlll[lIIllIIlllII[43]];
        bJ = lIIllIIlIlll[lIIllIIlllII[44]];
        bK = lIIllIIlIlll[lIIllIIlllII[45]];
        bL = lIIllIIlIlll[lIIllIIlllII[46]];
    }

    private static void llIIlllIllIlII() {
        lIIllIIlIlll = new String[lIIllIIlllII[47]];
        I.lIIllIIlIlll[I.lIIllIIlllII[0]] = I."Fill coal bag";
        I.lIIllIIlIlll[I.lIIllIIlllII[1]] = I."Refill coal bag";
        I.lIIllIIlIlll[I.lIIllIIlllII[2]] = I."Empty coal bag";
        I.lIIllIIlIlll[I.lIIllIIlllII[3]] = I."Withdraw coal bag";
        I.lIIllIIlIlll[I.lIIllIIlllII[4]] = I."Withdraw coal";
        I.lIIllIIlIlll[I.lIIllIIlllII[5]] = I."Withdraw gold ore";
        I.lIIllIIlIlll[I.lIIllIIlllII[6]] = I."Withdraw iron ore";
        I.lIIllIIlIlll[I.lIIllIIlllII[7]] = I."Withdraw mithril ore";
        I.lIIllIIlIlll[I.lIIllIIlllII[8]] = I."Withdraw adamantite ore";
        I.lIIllIIlIlll[I.lIIllIIlllII[9]] = I."Withdraw runite ore";
        I.lIIllIIlIlll[I.lIIllIIlllII[10]] = I."Deposit bars/ore";
        I.lIIllIIlIlll[I.lIIllIIlllII[11]] = I."Deposit stamina potions";
        I.lIIllIIlIlll[I.lIIllIIlllII[12]] = I."Withdraw ice gloves or smiths gloves (i)";
        I.lIIllIIlIlll[I.lIIllIIlllII[13]] = I."Equip ice gloves or smiths gloves (i)";
        I.lIIllIIlIlll[I.lIIllIIlllII[14]] = I."Withdraw goldsmith gauntlets";
        I.lIIllIIlIlll[I.lIIllIIlllII[15]] = I."Equip goldsmith gauntlets";
        I.lIIllIIlIlll[I.lIIllIIlllII[16]] = I."Withdraw Smithing cape";
        I.lIIllIIlIlll[I.lIIllIIlllII[17]] = I."Withdraw Max cape";
        I.lIIllIIlIlll[I.lIIllIIlllII[18]] = I."Equip Smithing cape";
        I.lIIllIIlIlll[I.lIIllIIlllII[19]] = I."Equip Max cape";
        I.lIIllIIlIlll[I.lIIllIIlllII[20]] = I."Deposit inventory";
        I.lIIllIIlIlll[I.lIIllIIlllII[21]] = I."Put ore onto conveyor belt";
        I.lIIllIIlIlll[I.lIIllIIlllII[22]] = I."Open bank chest";
        I.lIIllIIlIlll[I.lIIllIIlllII[23]] = I."Collect bars";
        I.lIIllIIlIlll[I.lIIllIIlllII[24]] = I."Wait for bars to smelt";
        I.lIIllIIlIlll[I.lIIllIIlllII[25]] = I."Gold + adamantite bars";
        I.lIIllIIlIlll[I.lIIllIIlllII[26]] = I."Adamantite bars";
        I.lIIllIIlIlll[I.lIIllIIlllII[27]] = I."Gold bars";
        I.lIIllIIlIlll[I.lIIllIIlllII[28]] = I."Mithril bars";
        I.lIIllIIlIlll[I.lIIllIIlllII[29]] = I."Gold + mithril bars";
        I.lIIllIIlIlll[I.lIIllIIlllII[30]] = I."Runite bars";
        I.lIIllIIlIlll[I.lIIllIIlllII[31]] = I."Gold + runite bars";
        I.lIIllIIlIlll[I.lIIllIIlllII[32]] = I."Steel bars";
        I.lIIllIIlIlll[I.lIIllIIlllII[33]] = I."^The coal bag contains 36 pieces of coal.$";
        I.lIIllIIlIlll[I.lIIllIIlllII[34]] = I."^The coal bag is now empty.$";
        I.lIIllIIlIlll[I.lIIllIIlllII[35]] = I."Fill";
        I.lIIllIIlIlll[I.lIIllIIlllII[36]] = I."Empty";
        I.lIIllIIlIlll[I.lIIllIIlllII[37]] = I."Drink";
        I.lIIllIIlIlll[I.lIIllIIlllII[38]] = I."Withdraw stamina potion";
        I.lIIllIIlIlll[I.lIIllIIlllII[39]] = I."Withdraw stamina potion";
        I.lIIllIIlIlll[I.lIIllIIlllII[40]] = I."Withdraw stamina potion";
        I.lIIllIIlIlll[I.lIIllIIlllII[41]] = I."Withdraw stamina potion";
        I.lIIllIIlIlll[I.lIIllIIlllII[42]] = I."Drink stamina potion";
        I.lIIllIIlIlll[I.lIIllIIlllII[43]] = I."Drink stamina potion";
        I.lIIllIIlIlll[I.lIIllIIlllII[44]] = I."Drink stamina potion";
        I.lIIllIIlIlll[I.lIIllIIlllII[45]] = I."Drink stamina potion";
        I.lIIllIIlIlll[I.lIIllIIlllII[46]] = I."Get more stamina potions! Check settings to disable this";
    }

    private static void llIIlllIlllIII() {
        lIIllIIlllII = new int[48];
        I.lIIllIIlllII[0] = (0x34 ^ 0x23 ^ (0x7E ^ 0x47)) & (0x1C ^ 0x4E ^ (0xC9 ^ 0xB5) ^ -1);
        I.lIIllIIlllII[1] = 1;
        I.lIIllIIlllII[2] = 2;
        I.lIIllIIlllII[3] = 3;
        I.lIIllIIlllII[4] = 0x6C ^ 0x2C ^ (0xD3 ^ 0x97);
        I.lIIllIIlllII[5] = 0xA9 ^ 0xC5 ^ (0xEC ^ 0x85);
        I.lIIllIIlllII[6] = 0x64 ^ 0x62;
        I.lIIllIIlllII[7] = 0x4E ^ 0x49;
        I.lIIllIIlllII[8] = 0xC ^ 4;
        I.lIIllIIlllII[9] = 0x6B ^ 0x62;
        I.lIIllIIlllII[10] = 0x62 ^ 0x68;
        I.lIIllIIlllII[11] = 0x17 ^ 0x1C;
        I.lIIllIIlllII[12] = 0x50 ^ 0x5C;
        I.lIIllIIlllII[13] = 0x56 ^ 0x5B;
        I.lIIllIIlllII[14] = 0xD1 ^ 0xBF ^ (0xF1 ^ 0x91);
        I.lIIllIIlllII[15] = 59 + 5 - -54 + 49 ^ 122 + 167 - 125 + 4;
        I.lIIllIIlllII[16] = 0x6D ^ 0x7D;
        I.lIIllIIlllII[17] = 0x94 ^ 0x85;
        I.lIIllIIlllII[18] = 73 + 20 - 47 + 138 ^ 42 + 148 - 28 + 8;
        I.lIIllIIlllII[19] = 0x3A ^ 4 ^ (0x24 ^ 9);
        I.lIIllIIlllII[20] = 0xF1 ^ 0xAE ^ (0xC9 ^ 0x82);
        I.lIIllIIlllII[21] = 71 + 147 - 159 + 115 ^ 109 + 161 - 133 + 50;
        I.lIIllIIlllII[22] = 0x50 ^ 0x46;
        I.lIIllIIlllII[23] = 0x81 ^ 0x9A ^ (0x3D ^ 0x31);
        I.lIIllIIlllII[24] = 0x21 ^ 0x7D ^ (0xFE ^ 0xBA);
        I.lIIllIIlllII[25] = 0x5E ^ 0x34 ^ (0xC2 ^ 0xB1);
        I.lIIllIIlllII[26] = 0x85 ^ 0x8E ^ (0xAA ^ 0xBB);
        I.lIIllIIlllII[27] = 0x32 ^ 0x7A ^ (0x40 ^ 0x13);
        I.lIIllIIlllII[28] = 88 + 63 - 95 + 118 ^ 31 + 64 - 82 + 165;
        I.lIIllIIlllII[29] = 1 ^ 0x35 ^ (0xA7 ^ 0x8E);
        I.lIIllIIlllII[30] = 21 + 86 - -37 + 23 ^ 154 + 152 - 136 + 15;
        I.lIIllIIlllII[31] = 0x36 ^ 0x29;
        I.lIIllIIlllII[32] = 0x29 ^ 9;
        I.lIIllIIlllII[33] = 0x9D ^ 0xBC;
        I.lIIllIIlllII[34] = 0x8F ^ 0xAD;
        I.lIIllIIlllII[35] = 0xE6 ^ 0xC5;
        I.lIIllIIlllII[36] = 41 + 0 - 12 + 137 ^ 76 + 64 - 101 + 91;
        I.lIIllIIlllII[37] = 0x46 ^ 0x58 ^ (0x33 ^ 8);
        I.lIIllIIlllII[38] = 0x6E ^ 0x75 ^ (0x54 ^ 0x69);
        I.lIIllIIlllII[39] = 0xB1 ^ 0x98 ^ (0x7B ^ 0x75);
        I.lIIllIIlllII[40] = 0x3C ^ 0x55 ^ (0x73 ^ 0x32);
        I.lIIllIIlllII[41] = 0x38 ^ 0x11;
        I.lIIllIIlllII[42] = 0x84 ^ 0xAE;
        I.lIIllIIlllII[43] = 15 + 74 - -23 + 18 ^ 56 + 20 - 45 + 138;
        I.lIIllIIlllII[44] = 0x56 ^ 0x7A;
        I.lIIllIIlllII[45] = 0x1F ^ 0x32;
        I.lIIllIIlllII[46] = 0x46 ^ 0x68;
        I.lIIllIIlllII[47] = 0xC ^ 3 ^ (0xA6 ^ 0x86);
    }

    private static String llIIlllIlIlIlI(String lllllllllllllllIlllIlllIlIIlIlll, String lllllllllllllllIlllIlllIlIIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlllIlIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlllIlIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlllIlIIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlllIlIIllIIl.init(lIIllIIlllII[2], lllllllllllllllIlllIlllIlIIllIlI);
            return new String(lllllllllllllllIlllIlllIlIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlllIlIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlllIlIIllIII) {
            lllllllllllllllIlllIlllIlIIllIII.printStackTrace();
            return null;
        }
    }

    private static String llIIlllIlIlIll(String lllllllllllllllIlllIlllIlIIIlIII, String lllllllllllllllIlllIlllIlIIIIlll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlllIlIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlllIlIIIIlll.getBytes(StandardCharsets.UTF_8)), lIIllIIlllII[8]), "DES");
            Cipher lllllllllllllllIlllIlllIlIIIllII = Cipher.getInstance("DES");
            lllllllllllllllIlllIlllIlIIIllII.init(lIIllIIlllII[2], lllllllllllllllIlllIlllIlIIIllIl);
            return new String(lllllllllllllllIlllIlllIlIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlllIlIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlllIlIIIlIll) {
            lllllllllllllllIlllIlllIlIIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlllIlllIIl(int n2, int n3) {
        return n2 < n3;
    }
}

