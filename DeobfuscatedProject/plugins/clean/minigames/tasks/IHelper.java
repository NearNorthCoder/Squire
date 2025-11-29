/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigames.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class IHelper {
    
    public static  String by;
    public static  String bH;
    public static  String aV;
    public static  String bv;
    public static  String aZ;
    public static  String bd;
    public static  String aY;
    public static  String bl;
    public static  String aU;
    public static  String bm;
    public static  String bw;
    public static  String bb;
    
    public static  String bA;
    public static  String bj;
    public static  String bg;
    public static  String bc;
    public static  String aW;
    public static  String ba;
    public static  String bz;
    public static  String bo;
    public static  String be;
    public static  String aQ;
    public static  String bt;
    public static  String bq;
    public static  String bn;
    public static  String bu;
    public static  String bs;
    public static  String bp;
    public static  String bG;
    public static  String bB;
    public static  String br;
    public static  String aX;
    public static  String bF;
    public static  String bC;
    public static  String aT;
    public static  String aS;
    public static  String bh;
    public static  String bJ;
    public static  String bf;
    public static  String bi;
    public static  String bL;
    public static  String aR;
    public static  String bE;
    public static  String bI;
    public static  String bD;
    public static  String bx;
    public static  String bk;
    public static  String bK;

        return String.valueOf(var1);
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
        I.lIIllIIlIlll[I.lIIllIIlllII[0]] = "Fill coal bag";
        I.lIIllIIlIlll[I.lIIllIIlllII[1]] = "Refill coal bag";
        I.lIIllIIlIlll[I.lIIllIIlllII[2]] = "Empty coal bag";
        I.lIIllIIlIlll[I.lIIllIIlllII[3]] = "Withdraw coal bag";
        I.lIIllIIlIlll[I.lIIllIIlllII[4]] = "Withdraw coal";
        I.lIIllIIlIlll[I.lIIllIIlllII[5]] = "Withdraw gold ore";
        I.lIIllIIlIlll[I.lIIllIIlllII[6]] = "Withdraw iron ore";
        I.lIIllIIlIlll[I.lIIllIIlllII[7]] = "Withdraw mithril ore";
        I.lIIllIIlIlll[I.lIIllIIlllII[8]] = "Withdraw adamantite ore";
        I.lIIllIIlIlll[I.lIIllIIlllII[9]] = "Withdraw runite ore";
        I.lIIllIIlIlll[I.lIIllIIlllII[10]] = "Deposit bars/ore";
        I.lIIllIIlIlll[I.lIIllIIlllII[11]] = "Deposit stamina potions";
        I.lIIllIIlIlll[I.lIIllIIlllII[12]] = "Withdraw ice gloves or smiths gloves (i)";
        I.lIIllIIlIlll[I.lIIllIIlllII[13]] = "Equip ice gloves or smiths gloves (i)";
        I.lIIllIIlIlll[I.lIIllIIlllII[14]] = "Withdraw goldsmith gauntlets";
        I.lIIllIIlIlll[I.lIIllIIlllII[15]] = "Equip goldsmith gauntlets";
        I.lIIllIIlIlll[I.lIIllIIlllII[16]] = "Withdraw Smithing cape";
        I.lIIllIIlIlll[I.lIIllIIlllII[17]] = "Withdraw Max cape";
        I.lIIllIIlIlll[I.lIIllIIlllII[18]] = "Equip Smithing cape";
        I.lIIllIIlIlll[I.lIIllIIlllII[19]] = "Equip Max cape";
        I.lIIllIIlIlll[I.lIIllIIlllII[20]] = "Deposit inventory";
        I.lIIllIIlIlll[I.lIIllIIlllII[21]] = "Put ore onto conveyor belt";
        I.lIIllIIlIlll[I.lIIllIIlllII[22]] = "Open bank chest";
        I.lIIllIIlIlll[I.lIIllIIlllII[23]] = "Collect bars";
        I.lIIllIIlIlll[I.lIIllIIlllII[24]] = "Wait for bars to smelt";
        I.lIIllIIlIlll[I.lIIllIIlllII[25]] = "Gold + adamantite bars";
        I.lIIllIIlIlll[I.lIIllIIlllII[26]] = "Adamantite bars";
        I.lIIllIIlIlll[I.lIIllIIlllII[27]] = "Gold bars";
        I.lIIllIIlIlll[I.lIIllIIlllII[28]] = "Mithril bars";
        I.lIIllIIlIlll[I.lIIllIIlllII[29]] = "Gold + mithril bars";
        I.lIIllIIlIlll[I.lIIllIIlllII[30]] = "Runite bars";
        I.lIIllIIlIlll[I.lIIllIIlllII[31]] = "Gold + runite bars";
        I.lIIllIIlIlll[I.lIIllIIlllII[32]] = "Steel bars";
        I.lIIllIIlIlll[I.lIIllIIlllII[33]] = "^The coal bag contains 36 pieces of coal.$";
        I.lIIllIIlIlll[I.lIIllIIlllII[34]] = "^The coal bag is now empty.$";
        I.lIIllIIlIlll[I.lIIllIIlllII[35]] = "Fill";
        I.lIIllIIlIlll[I.lIIllIIlllII[36]] = "Empty";
        I.lIIllIIlIlll[I.lIIllIIlllII[37]] = "Drink";
        I.lIIllIIlIlll[I.lIIllIIlllII[38]] = "Withdraw stamina potion";
        I.lIIllIIlIlll[I.lIIllIIlllII[39]] = "Withdraw stamina potion";
        I.lIIllIIlIlll[I.lIIllIIlllII[40]] = "Withdraw stamina potion";
        I.lIIllIIlIlll[I.lIIllIIlllII[41]] = "Withdraw stamina potion";
        I.lIIllIIlIlll[I.lIIllIIlllII[42]] = "Drink stamina potion";
        I.lIIllIIlIlll[I.lIIllIIlllII[43]] = "Drink stamina potion";
        I.lIIllIIlIlll[I.lIIllIIlllII[44]] = "Drink stamina potion";
        I.lIIllIIlIlll[I.lIIllIIlllII[45]] = "Drink stamina potion";
        I.lIIllIIlIlll[I.lIIllIIlllII[46]] = "Get more stamina potions! Check settings to disable this";
    }

    private static boolean llIIlllIlllIIl(int n2, int n3) {
        return n2 < n3;
    }
}

