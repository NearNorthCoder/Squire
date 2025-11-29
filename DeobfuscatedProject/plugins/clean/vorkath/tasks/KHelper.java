/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.vorkath.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class KHelper {
    public static final  k aG;
    public static final  k aj;
    public static final  k aX;
    public static final  k Y;
    public static final  k aQ;
    public static final  k ao;
    public static final  k be;
    public static final  List<k> bo;
    public static final  k bk;
    public static final  k ah;
    public static final  k bm;
    public static final  k ar;
    public static final  k aM;
    private  boolean bq;
    public static final  k ay;
    public static final  k af;
    public static final  k aw;
    public static final  k X;
    public static final  k ag;
    public static final  k ad;
    public static final  k aE;
    public static final  k W;
    public static final  k aK;
    public static final  k aV;
    public static final  k bj;
    public static final  k aH;
    public static final  k bf;
    public static final  k ax;
    public static final  k V;
    public static final  k bi;
    public static final  k aD;
    public static final  k bn;
    public static final  k bg;
    public static final  k bc;
    public static final  k aN;
    public static final  k bd;
    public static final  k aW;
    public static final  k az;
    public static final  k as;
    public static final  k aL;
    
    public static final  k al;
    public static final  k aF;
    private  boolean br;
    public static final  k ak;
    public static final  k aP;
    public static final  k ac;
    public static final  k aT;
    public static final  k Z;
    public static final  k aJ;
    public static final  k aO;
    public static final  k at;
    public static final  k ba;
    public static final  k an;
    public static final  k aU;
    public static final  k aI;
    public static final  k ai;
    public static final  k bh;
    private final  String bp;
    public static final  k av;
    public static final  k aY;
    public static final  k aa;
    public static final  k am;
    public static final  k au;
    public static final  k bl;
    public static final  k ab;
    public static final  k bb;
    public static final  k ae;
    public static final  k aS;
    
    public static final  k aR;
    public static final  k aC;
    public static final  k aZ;
    public static final  k ap;
    public static final  k aB;
    public static final  k aq;
    public static final  k aA;

    public KHelper(String string, boolean bl, boolean bl2) {
        this.bp = string;
        this.bq = bl;
        this.br = bl2;
    }

    public String M() {
        return this.bp;
    }

    public boolean N() {
        return this.bq;
    }

    static {
        k.lIlllllIlIIIlII();
        k.lIlllllIIlllIlI();
        V = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[0]], lIlIlIlIIIlIl[1], lIlIlIlIIIlIl[1]);
        W = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[1]], lIlIlIlIIIlIl[1], lIlIlIlIIIlIl[1]);
        X = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[2]], lIlIlIlIIIlIl[1], lIlIlIlIIIlIl[1]);
        Y = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[3]], lIlIlIlIIIlIl[1], lIlIlIlIIIlIl[1]);
        Z = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[4]], lIlIlIlIIIlIl[1], lIlIlIlIIIlIl[1]);
        aa = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[5]], lIlIlIlIIIlIl[1], lIlIlIlIIIlIl[1]);
        ab = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[6]], lIlIlIlIIIlIl[1], lIlIlIlIIIlIl[1]);
        ac = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[7]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ad = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[8]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ae = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[9]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        af = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[10]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ag = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[11]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ah = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[12]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ai = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[13]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aj = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[14]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ak = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[15]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        al = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[16]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        am = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[17]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        an = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[18]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ao = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[19]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ap = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[20]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aq = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[21]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ar = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[22]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        as = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[23]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        at = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[24]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        au = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[25]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        av = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[26]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aw = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[27]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ax = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[28]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ay = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[29]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        az = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[30]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aA = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[31]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aB = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[32]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aC = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[33]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aD = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[34]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aE = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[35]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aF = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[36]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aG = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[37]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aH = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[38]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aI = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[39]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aJ = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[40]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aK = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[41]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aL = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[42]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aM = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[43]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aN = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[44]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aO = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[45]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aP = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[46]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aQ = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[47]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aR = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[48]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aS = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[49]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aT = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[50]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aU = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[51]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aV = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[52]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aW = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[53]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aX = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[54]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aY = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[55]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aZ = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[56]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ba = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[57]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bb = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[58]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bc = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[59]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bd = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[60]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        be = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[61]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bf = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[62]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bg = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[63]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bh = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[64]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bi = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[65]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bj = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[66]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bk = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[67]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bl = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[68]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bm = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[69]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bn = new KHelper(lIlIlIlIIIIIl[lIlIlIlIIIlIl[70]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        k[] kArray = new k[lIlIlIlIIIlIl[71]];
        kArray[k.lIlIlIlIIIlIl[0]] = V;
        kArray[k.lIlIlIlIIIlIl[1]] = W;
        kArray[k.lIlIlIlIIIlIl[2]] = X;
        kArray[k.lIlIlIlIIIlIl[3]] = Y;
        kArray[k.lIlIlIlIIIlIl[4]] = Z;
        kArray[k.lIlIlIlIIIlIl[5]] = aa;
        kArray[k.lIlIlIlIIIlIl[6]] = ab;
        kArray[k.lIlIlIlIIIlIl[7]] = aP;
        kArray[k.lIlIlIlIIIlIl[8]] = aQ;
        kArray[k.lIlIlIlIIIlIl[9]] = aR;
        kArray[k.lIlIlIlIIIlIl[10]] = aS;
        kArray[k.lIlIlIlIIIlIl[11]] = aT;
        kArray[k.lIlIlIlIIIlIl[12]] = aU;
        kArray[k.lIlIlIlIIIlIl[13]] = aV;
        kArray[k.lIlIlIlIIIlIl[14]] = aW;
        kArray[k.lIlIlIlIIIlIl[15]] = aX;
        kArray[k.lIlIlIlIIIlIl[16]] = aY;
        kArray[k.lIlIlIlIIIlIl[17]] = aZ;
        kArray[k.lIlIlIlIIIlIl[18]] = ba;
        kArray[k.lIlIlIlIIIlIl[19]] = bb;
        kArray[k.lIlIlIlIIIlIl[20]] = bc;
        kArray[k.lIlIlIlIIIlIl[21]] = bd;
        kArray[k.lIlIlIlIIIlIl[22]] = be;
        kArray[k.lIlIlIlIIIlIl[23]] = bf;
        kArray[k.lIlIlIlIIIlIl[24]] = bg;
        kArray[k.lIlIlIlIIIlIl[25]] = bh;
        kArray[k.lIlIlIlIIIlIl[26]] = bi;
        kArray[k.lIlIlIlIIIlIl[27]] = bj;
        kArray[k.lIlIlIlIIIlIl[28]] = bk;
        kArray[k.lIlIlIlIIIlIl[29]] = bl;
        kArray[k.lIlIlIlIIIlIl[30]] = bm;
        kArray[k.lIlIlIlIIIlIl[31]] = bn;
        kArray[k.lIlIlIlIIIlIl[32]] = ac;
        kArray[k.lIlIlIlIIIlIl[33]] = ad;
        kArray[k.lIlIlIlIIIlIl[34]] = ae;
        kArray[k.lIlIlIlIIIlIl[35]] = af;
        kArray[k.lIlIlIlIIIlIl[36]] = ag;
        kArray[k.lIlIlIlIIIlIl[37]] = ah;
        kArray[k.lIlIlIlIIIlIl[38]] = ai;
        kArray[k.lIlIlIlIIIlIl[39]] = aj;
        kArray[k.lIlIlIlIIIlIl[40]] = ak;
        kArray[k.lIlIlIlIIIlIl[41]] = al;
        kArray[k.lIlIlIlIIIlIl[42]] = am;
        kArray[k.lIlIlIlIIIlIl[43]] = an;
        kArray[k.lIlIlIlIIIlIl[44]] = ao;
        kArray[k.lIlIlIlIIIlIl[45]] = ap;
        kArray[k.lIlIlIlIIIlIl[46]] = aq;
        kArray[k.lIlIlIlIIIlIl[47]] = ar;
        kArray[k.lIlIlIlIIIlIl[48]] = as;
        kArray[k.lIlIlIlIIIlIl[49]] = at;
        kArray[k.lIlIlIlIIIlIl[50]] = au;
        kArray[k.lIlIlIlIIIlIl[51]] = av;
        kArray[k.lIlIlIlIIIlIl[52]] = aw;
        kArray[k.lIlIlIlIIIlIl[53]] = ax;
        kArray[k.lIlIlIlIIIlIl[54]] = ay;
        kArray[k.lIlIlIlIIIlIl[55]] = az;
        kArray[k.lIlIlIlIIIlIl[56]] = aA;
        kArray[k.lIlIlIlIIIlIl[57]] = aB;
        kArray[k.lIlIlIlIIIlIl[58]] = aC;
        kArray[k.lIlIlIlIIIlIl[59]] = aD;
        kArray[k.lIlIlIlIIIlIl[60]] = aE;
        kArray[k.lIlIlIlIIIlIl[61]] = aF;
        kArray[k.lIlIlIlIIIlIl[62]] = aG;
        kArray[k.lIlIlIlIIIlIl[63]] = aH;
        kArray[k.lIlIlIlIIIlIl[64]] = aI;
        kArray[k.lIlIlIlIIIlIl[65]] = aJ;
        kArray[k.lIlIlIlIIIlIl[66]] = aK;
        kArray[k.lIlIlIlIIIlIl[67]] = aL;
        kArray[k.lIlIlIlIIIlIl[68]] = aM;
        kArray[k.lIlIlIlIIIlIl[69]] = aN;
        kArray[k.lIlIlIlIIIlIl[70]] = aO;
        bo = Arrays.asList(kArray);
    }

    public String toString() {
        return "Loot{name='" + this.bp + "', eatFood=" + this.bq + ", droplower=" + this.br + "}";
    }

    public boolean O() {
        return this.br;
    }

    public void e(boolean bl) {
        this.bq = bl;
    }

    private static boolean lIlllllIlIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    public void f(boolean bl) {
        this.br = bl;
    }

    private static void lIlllllIIlllIlI() {
        lIlIlIlIIIIIl = new String[lIlIlIlIIIlIl[71]];
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[0]] = "Vorkath's head";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[1]] = "Brimstone key";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[2]] = "Clue scroll (elite)";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[3]] = "Dragonbone necklace";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[4]] = "Jar of decay";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[5]] = "Draconic visage";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[6]] = "Skeletal visage";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[7]] = "Superior dragon bones";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[8]] = "Blue dragonhide";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[9]] = "Rune longsword";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[10]] = "Rune kiteshield";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[11]] = "Battlestaff";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[12]] = "Dragon battleaxe";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[13]] = "Dragon longsword";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[14]] = "Dragon platelegs";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[15]] = "Dragon plateskirt";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[16]] = "Chaos rune";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[17]] = "Death rune";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[18]] = "Wrath rune";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[19]] = "Green dragonhide";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[20]] = "Red dragonhide";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[21]] = "Black dragonhide";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[22]] = "Rune dart tip";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[23]] = "Dragon dart tip";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[24]] = "Dragon bolts (unf)";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[25]] = "Onyx bolt tips";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[26]] = "Dragonstone bolt tips";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[27]] = "Diamond bolt tips";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[28]] = "Emerald bolt tips";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[29]] = "Ruby bolt tips";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[30]] = "Sapphire bolt tips";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[31]] = "Dragon arrowtips";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[32]] = "Snapdragon seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[33]] = "Torstol seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[34]] = "Ranarr seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[35]] = "Watermelon seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[36]] = "Willow seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[37]] = "Mahogany seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[38]] = "Maple seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[39]] = "Teak seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[40]] = "Yew seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[41]] = "Papaya tree seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[42]] = "Magic seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[43]] = "Palm tree seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[44]] = "Spirit seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[45]] = "Dragon fruit seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[46]] = "Adamantite ore";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[47]] = "Coins";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[48]] = "Grapes";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[49]] = "Magic logs";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[50]] = "Manta ray";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[51]] = "Dragon bones";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[52]] = "Diamond";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[53]] = "Dragonstone";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[54]] = "Wrath talisman";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[55]] = "Loop half of key";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[56]] = "Tooth half of key";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[57]] = "Uncut sapphire";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[58]] = "Runite bar";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[59]] = "Nature rune";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[60]] = "Rune 2h sword";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[61]] = "Rune battleaxe";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[62]] = "Uncut emerald";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[63]] = "Law rune";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[64]] = "Rune arrow";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[65]] = "Rune sq shield";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[66]] = "Silver ore";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[67]] = "Dragon med helm";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[68]] = "Rune spear";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[69]] = "Shield left half";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[70]] = "Dragon spear";
    }
}

