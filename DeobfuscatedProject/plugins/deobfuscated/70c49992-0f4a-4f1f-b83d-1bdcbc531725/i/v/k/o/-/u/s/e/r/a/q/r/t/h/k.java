/*
 * Decompiled with CFR 0.152.
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class k {
    public static final /* synthetic */ k aG;
    public static final /* synthetic */ k aj;
    public static final /* synthetic */ k aX;
    public static final /* synthetic */ k Y;
    public static final /* synthetic */ k aQ;
    public static final /* synthetic */ k ao;
    public static final /* synthetic */ k be;
    public static final /* synthetic */ List<k> bo;
    public static final /* synthetic */ k bk;
    public static final /* synthetic */ k ah;
    public static final /* synthetic */ k bm;
    public static final /* synthetic */ k ar;
    public static final /* synthetic */ k aM;
    private /* synthetic */ boolean bq;
    public static final /* synthetic */ k ay;
    public static final /* synthetic */ k af;
    public static final /* synthetic */ k aw;
    public static final /* synthetic */ k X;
    public static final /* synthetic */ k ag;
    public static final /* synthetic */ k ad;
    public static final /* synthetic */ k aE;
    public static final /* synthetic */ k W;
    public static final /* synthetic */ k aK;
    public static final /* synthetic */ k aV;
    public static final /* synthetic */ k bj;
    public static final /* synthetic */ k aH;
    public static final /* synthetic */ k bf;
    public static final /* synthetic */ k ax;
    public static final /* synthetic */ k V;
    public static final /* synthetic */ k bi;
    public static final /* synthetic */ k aD;
    public static final /* synthetic */ k bn;
    public static final /* synthetic */ k bg;
    public static final /* synthetic */ k bc;
    public static final /* synthetic */ k aN;
    public static final /* synthetic */ k bd;
    public static final /* synthetic */ k aW;
    public static final /* synthetic */ k az;
    public static final /* synthetic */ k as;
    public static final /* synthetic */ k aL;
    private static /* synthetic */ int[] lIlIlIlIIIlIl;
    public static final /* synthetic */ k al;
    public static final /* synthetic */ k aF;
    private /* synthetic */ boolean br;
    public static final /* synthetic */ k ak;
    public static final /* synthetic */ k aP;
    public static final /* synthetic */ k ac;
    public static final /* synthetic */ k aT;
    public static final /* synthetic */ k Z;
    public static final /* synthetic */ k aJ;
    public static final /* synthetic */ k aO;
    public static final /* synthetic */ k at;
    public static final /* synthetic */ k ba;
    public static final /* synthetic */ k an;
    public static final /* synthetic */ k aU;
    public static final /* synthetic */ k aI;
    public static final /* synthetic */ k ai;
    public static final /* synthetic */ k bh;
    private final /* synthetic */ String bp;
    public static final /* synthetic */ k av;
    public static final /* synthetic */ k aY;
    public static final /* synthetic */ k aa;
    public static final /* synthetic */ k am;
    public static final /* synthetic */ k au;
    public static final /* synthetic */ k bl;
    public static final /* synthetic */ k ab;
    public static final /* synthetic */ k bb;
    public static final /* synthetic */ k ae;
    public static final /* synthetic */ k aS;
    private static /* synthetic */ String[] lIlIlIlIIIIIl;
    public static final /* synthetic */ k aR;
    public static final /* synthetic */ k aC;
    public static final /* synthetic */ k aZ;
    public static final /* synthetic */ k ap;
    public static final /* synthetic */ k aB;
    public static final /* synthetic */ k aq;
    public static final /* synthetic */ k aA;

    public k(String string, boolean bl, boolean bl2) {
        this.bp = string;
        this.bq = bl;
        this.br = bl2;
    }

    public String M() {
        return this.bp;
    }

    private static String lIlllllIIllIlIl(String llllllllllllllIllIlIllIlIIIllllI, String llllllllllllllIllIlIllIlIIIlllIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIllIlIIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIllIlIIlIIIII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIllIlIIlIIIII.init(lIlIlIlIIIlIl[2], llllllllllllllIllIlIllIlIIlIIIIl);
            return new String(llllllllllllllIllIlIllIlIIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllIlIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIllIlIIIlllll) {
            llllllllllllllIllIlIllIlIIIlllll.printStackTrace();
            return null;
        }
    }

    public boolean N() {
        return this.bq;
    }

    static {
        k.lIlllllIlIIIlII();
        k.lIlllllIIlllIlI();
        V = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[0]], lIlIlIlIIIlIl[1], lIlIlIlIIIlIl[1]);
        W = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[1]], lIlIlIlIIIlIl[1], lIlIlIlIIIlIl[1]);
        X = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[2]], lIlIlIlIIIlIl[1], lIlIlIlIIIlIl[1]);
        Y = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[3]], lIlIlIlIIIlIl[1], lIlIlIlIIIlIl[1]);
        Z = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[4]], lIlIlIlIIIlIl[1], lIlIlIlIIIlIl[1]);
        aa = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[5]], lIlIlIlIIIlIl[1], lIlIlIlIIIlIl[1]);
        ab = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[6]], lIlIlIlIIIlIl[1], lIlIlIlIIIlIl[1]);
        ac = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[7]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ad = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[8]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ae = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[9]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        af = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[10]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ag = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[11]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ah = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[12]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ai = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[13]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aj = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[14]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ak = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[15]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        al = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[16]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        am = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[17]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        an = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[18]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ao = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[19]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ap = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[20]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aq = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[21]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ar = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[22]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        as = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[23]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        at = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[24]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        au = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[25]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        av = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[26]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aw = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[27]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ax = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[28]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ay = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[29]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        az = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[30]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aA = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[31]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aB = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[32]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aC = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[33]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aD = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[34]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aE = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[35]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aF = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[36]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aG = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[37]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aH = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[38]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aI = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[39]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aJ = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[40]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aK = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[41]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aL = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[42]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aM = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[43]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aN = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[44]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aO = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[45]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aP = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[46]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aQ = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[47]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aR = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[48]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aS = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[49]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aT = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[50]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aU = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[51]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aV = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[52]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aW = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[53]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aX = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[54]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aY = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[55]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        aZ = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[56]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        ba = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[57]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bb = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[58]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bc = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[59]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bd = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[60]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        be = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[61]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bf = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[62]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bg = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[63]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bh = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[64]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bi = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[65]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bj = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[66]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bk = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[67]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bl = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[68]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bm = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[69]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
        bn = new k(lIlIlIlIIIIIl[lIlIlIlIIIlIl[70]], lIlIlIlIIIlIl[0], lIlIlIlIIIlIl[0]);
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

    private static String lIlllllIIllIlII(String llllllllllllllIllIlIllIlIIIlIIIl, String llllllllllllllIllIlIllIlIIIIlllI) {
        try {
            SecretKeySpec llllllllllllllIllIlIllIlIIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllIlIIIIlllI.getBytes(StandardCharsets.UTF_8)), lIlIlIlIIIlIl[8]), "DES");
            Cipher llllllllllllllIllIlIllIlIIIlIIll = Cipher.getInstance("DES");
            llllllllllllllIllIlIllIlIIIlIIll.init(lIlIlIlIIIlIl[2], llllllllllllllIllIlIllIlIIIlIlII);
            return new String(llllllllllllllIllIlIllIlIIIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllIlIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIllIlIIIlIIlI) {
            llllllllllllllIllIlIllIlIIIlIIlI.printStackTrace();
            return null;
        }
    }

    public boolean O() {
        return this.br;
    }

    public void e(boolean bl) {
        this.bq = bl;
    }

    private static void lIlllllIlIIIlII() {
        lIlIlIlIIIlIl = new int[72];
        k.lIlIlIlIIIlIl[0] = (0xD9 ^ 0x96) & ~(0xFD ^ 0xB2);
        k.lIlIlIlIIIlIl[1] = 1;
        k.lIlIlIlIIIlIl[2] = 2;
        k.lIlIlIlIIIlIl[3] = 3;
        k.lIlIlIlIIIlIl[4] = 0x8F ^ 0x8B;
        k.lIlIlIlIIIlIl[5] = 0xB0 ^ 0xB5;
        k.lIlIlIlIIIlIl[6] = 0x2E ^ 0x28;
        k.lIlIlIlIIIlIl[7] = 0x8D ^ 0x8A;
        k.lIlIlIlIIIlIl[8] = 0x64 ^ 0x30 ^ (0xC7 ^ 0x9B);
        k.lIlIlIlIIIlIl[9] = 0x3D ^ 0x34;
        k.lIlIlIlIIIlIl[10] = 180 + 6 - 127 + 123 ^ 104 + 173 - 126 + 37;
        k.lIlIlIlIIIlIl[11] = 3 ^ (0xB1 ^ 0xB9);
        k.lIlIlIlIIIlIl[12] = 102 + 105 - 50 + 15 ^ 19 + 59 - -77 + 5;
        k.lIlIlIlIIIlIl[13] = 0x18 ^ 0x15;
        k.lIlIlIlIIIlIl[14] = 0x80 ^ 0x8E;
        k.lIlIlIlIIIlIl[15] = 0x4B ^ 0x44;
        k.lIlIlIlIIIlIl[16] = 1 + 153 - 110 + 131 ^ 165 + 80 - 98 + 44;
        k.lIlIlIlIIIlIl[17] = 0x52 ^ 0x43;
        k.lIlIlIlIIIlIl[18] = 8 + 156 - 141 + 139 ^ 102 + 14 - 100 + 160;
        k.lIlIlIlIIIlIl[19] = 0x5D ^ 0x4E;
        k.lIlIlIlIIIlIl[20] = (0xD9 ^ 0x89) & ~(0xCB ^ 0x9B) ^ (3 ^ 0x17);
        k.lIlIlIlIIIlIl[21] = 0x43 ^ 0x73 ^ (2 ^ 0x27);
        k.lIlIlIlIIIlIl[22] = 0xBF ^ 0xA9;
        k.lIlIlIlIIIlIl[23] = 125 + 114 - 158 + 58 ^ 143 + 31 - 165 + 147;
        k.lIlIlIlIIIlIl[24] = 0xE9 ^ 0xBA ^ (0x29 ^ 0x62);
        k.lIlIlIlIIIlIl[25] = 0x7A ^ 0x63;
        k.lIlIlIlIIIlIl[26] = 160 + 37 - 71 + 45 ^ 7 + 114 - 78 + 134;
        k.lIlIlIlIIIlIl[27] = 155 + 148 - 274 + 153 ^ 94 + 49 - -1 + 29;
        k.lIlIlIlIIIlIl[28] = 0x38 ^ 0x24;
        k.lIlIlIlIIIlIl[29] = 0x92 ^ 0x8F;
        k.lIlIlIlIIIlIl[30] = 0x40 ^ 0x77 ^ (0x49 ^ 0x60);
        k.lIlIlIlIIIlIl[31] = 0x67 ^ 0x78;
        k.lIlIlIlIIIlIl[32] = 142 + 9 - 120 + 123 ^ 180 + 95 - 164 + 75;
        k.lIlIlIlIIIlIl[33] = 0x57 ^ 0x76;
        k.lIlIlIlIIIlIl[34] = 0x44 ^ 0x18 ^ (0x21 ^ 0x5F);
        k.lIlIlIlIIIlIl[35] = 0xA8 ^ 0x8B;
        k.lIlIlIlIIIlIl[36] = 0xBA ^ 0x9E;
        k.lIlIlIlIIIlIl[37] = 0x11 ^ 0x34;
        k.lIlIlIlIIIlIl[38] = 0x48 ^ 0x7E ^ (0x59 ^ 0x49);
        k.lIlIlIlIIIlIl[39] = 0x14 ^ 0x33;
        k.lIlIlIlIIIlIl[40] = 0x37 ^ 0x1F;
        k.lIlIlIlIIIlIl[41] = 0x8D ^ 0xB4 ^ (0xA4 ^ 0xB4);
        k.lIlIlIlIIIlIl[42] = 0xA1 ^ 0x88 ^ 3;
        k.lIlIlIlIIIlIl[43] = 0x41 ^ 0x6A;
        k.lIlIlIlIIIlIl[44] = 0x1D ^ 0x31;
        k.lIlIlIlIIIlIl[45] = 0x61 ^ 0x4C;
        k.lIlIlIlIIIlIl[46] = 0xE9 ^ 0xB0 ^ (5 ^ 0x72);
        k.lIlIlIlIIIlIl[47] = 0x94 ^ 0xBB;
        k.lIlIlIlIIIlIl[48] = 0xE9 ^ 0xBA ^ (0xC ^ 0x6F);
        k.lIlIlIlIIIlIl[49] = 0x49 ^ 0x78;
        k.lIlIlIlIIIlIl[50] = 0x11 ^ 0x23;
        k.lIlIlIlIIIlIl[51] = 26 + 68 - 28 + 62 ^ 140 + 73 - 70 + 36;
        k.lIlIlIlIIIlIl[52] = 0x9E ^ 0xAA;
        k.lIlIlIlIIIlIl[53] = 0x2F ^ 0x1A;
        k.lIlIlIlIIIlIl[54] = 84 + 115 - 77 + 48 ^ 118 + 40 - 40 + 38;
        k.lIlIlIlIIIlIl[55] = 0xA0 ^ 0x93 ^ (0x2B ^ 0x2F);
        k.lIlIlIlIIIlIl[56] = 0x20 ^ 0x37 ^ (0x61 ^ 0x4E);
        k.lIlIlIlIIIlIl[57] = 21 + 82 - -43 + 36 ^ 40 + 125 - 91 + 69;
        k.lIlIlIlIIIlIl[58] = 0x2A ^ 0x69 ^ (0x20 ^ 0x59);
        k.lIlIlIlIIIlIl[59] = 0xF9 ^ 0x96 ^ (0xFE ^ 0xAA);
        k.lIlIlIlIIIlIl[60] = 1 ^ (0x25 ^ 0x18);
        k.lIlIlIlIIIlIl[61] = 0x41 ^ 0x7C;
        k.lIlIlIlIIIlIl[62] = 0x38 ^ 6;
        k.lIlIlIlIIIlIl[63] = 0x5D ^ 0x62;
        k.lIlIlIlIIIlIl[64] = 0x34 ^ 0x74;
        k.lIlIlIlIIIlIl[65] = 0x7C ^ 0x3D;
        k.lIlIlIlIIIlIl[66] = 0x85 ^ 0xC6 ^ 1;
        k.lIlIlIlIIIlIl[67] = 0x65 ^ 0x1E ^ (0x58 ^ 0x60);
        k.lIlIlIlIIIlIl[68] = 0x53 ^ 0x17;
        k.lIlIlIlIIIlIl[69] = 0x1A ^ 0x5F;
        k.lIlIlIlIIIlIl[70] = 3 ^ 0x3C ^ (0xCF ^ 0xB6);
        k.lIlIlIlIIIlIl[71] = 0x83 ^ 0xA8 ^ (0x12 ^ 0x7E);
    }

    private static boolean lIlllllIlIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlllllIIllIllI(String llllllllllllllIllIlIllIlIIlIlllI, String llllllllllllllIllIlIllIlIIlIllIl) {
        llllllllllllllIllIlIllIlIIlIlllI = new String(Base64.getDecoder().decode(llllllllllllllIllIlIllIlIIlIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIllIlIIllIIIl = new StringBuilder();
        char[] llllllllllllllIllIlIllIlIIllIIII = llllllllllllllIllIlIllIlIIlIllIl.toCharArray();
        int llllllllllllllIllIlIllIlIIlIllll = lIlIlIlIIIlIl[0];
        char[] llllllllllllllIllIlIllIlIIlIlIIl = llllllllllllllIllIlIllIlIIlIlllI.toCharArray();
        int llllllllllllllIllIlIllIlIIlIlIII = llllllllllllllIllIlIllIlIIlIlIIl.length;
        int llllllllllllllIllIlIllIlIIlIIlll = lIlIlIlIIIlIl[0];
        while (k.lIlllllIlIIIlIl(llllllllllllllIllIlIllIlIIlIIlll, llllllllllllllIllIlIllIlIIlIlIII)) {
            char llllllllllllllIllIlIllIlIIllIlII = llllllllllllllIllIlIllIlIIlIlIIl[llllllllllllllIllIlIllIlIIlIIlll];
            llllllllllllllIllIlIllIlIIllIIIl.append((char)(llllllllllllllIllIlIllIlIIllIlII ^ llllllllllllllIllIlIllIlIIllIIII[llllllllllllllIllIlIllIlIIlIllll % llllllllllllllIllIlIllIlIIllIIII.length]));
            0;
            ++llllllllllllllIllIlIllIlIIlIllll;
            ++llllllllllllllIllIlIllIlIIlIIlll;
            0;
            if (1 < 2) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIllIlIIllIIIl);
    }

    public void f(boolean bl) {
        this.br = bl;
    }

    private static void lIlllllIIlllIlI() {
        lIlIlIlIIIIIl = new String[lIlIlIlIIIlIl[71]];
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[0]] = k."Vorkath's head";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[1]] = k."Brimstone key";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[2]] = k."Clue scroll (elite)";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[3]] = k."Dragonbone necklace";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[4]] = k."Jar of decay";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[5]] = k."Draconic visage";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[6]] = k."Skeletal visage";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[7]] = k."Superior dragon bones";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[8]] = k."Blue dragonhide";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[9]] = k."Rune longsword";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[10]] = k."Rune kiteshield";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[11]] = k."Battlestaff";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[12]] = k."Dragon battleaxe";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[13]] = k."Dragon longsword";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[14]] = k."Dragon platelegs";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[15]] = k."Dragon plateskirt";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[16]] = k."Chaos rune";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[17]] = k."Death rune";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[18]] = k."Wrath rune";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[19]] = k."Green dragonhide";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[20]] = k."Red dragonhide";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[21]] = k."Black dragonhide";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[22]] = k."Rune dart tip";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[23]] = k."Dragon dart tip";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[24]] = k."Dragon bolts (unf)";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[25]] = k."Onyx bolt tips";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[26]] = k."Dragonstone bolt tips";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[27]] = k."Diamond bolt tips";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[28]] = k."Emerald bolt tips";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[29]] = k."Ruby bolt tips";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[30]] = k."Sapphire bolt tips";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[31]] = k."Dragon arrowtips";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[32]] = k."Snapdragon seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[33]] = k."Torstol seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[34]] = k."Ranarr seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[35]] = k."Watermelon seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[36]] = k."Willow seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[37]] = k."Mahogany seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[38]] = k."Maple seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[39]] = k."Teak seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[40]] = k."Yew seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[41]] = k."Papaya tree seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[42]] = k."Magic seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[43]] = k."Palm tree seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[44]] = k."Spirit seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[45]] = k."Dragon fruit seed";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[46]] = k."Adamantite ore";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[47]] = k."Coins";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[48]] = k."Grapes";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[49]] = k."Magic logs";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[50]] = k."Manta ray";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[51]] = k."Dragon bones";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[52]] = k."Diamond";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[53]] = k."Dragonstone";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[54]] = k."Wrath talisman";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[55]] = k."Loop half of key";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[56]] = k."Tooth half of key";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[57]] = k."Uncut sapphire";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[58]] = k."Runite bar";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[59]] = k."Nature rune";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[60]] = k."Rune 2h sword";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[61]] = k."Rune battleaxe";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[62]] = k."Uncut emerald";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[63]] = k."Law rune";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[64]] = k."Rune arrow";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[65]] = k."Rune sq shield";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[66]] = k."Silver ore";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[67]] = k."Dragon med helm";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[68]] = k."Rune spear";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[69]] = k."Shield left half";
        k.lIlIlIlIIIIIl[k.lIlIlIlIIIlIl[70]] = k."Dragon spear";
    }
}

