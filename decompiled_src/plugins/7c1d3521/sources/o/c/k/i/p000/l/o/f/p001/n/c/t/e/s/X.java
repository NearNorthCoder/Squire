package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.X  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/X.class */
public class X implements InterfaceC0003ac {
    private static /* synthetic */ int[] lIllllIlIl;
    private static final /* synthetic */ int mo;
    private static final /* synthetic */ int mv;
    private static final /* synthetic */ int ms;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int cG;
    static /* synthetic */ String[] fG;
    static /* synthetic */ boolean dj;
    private static final /* synthetic */ int mp;
    static /* synthetic */ String ly;
    public static /* synthetic */ List<C0017d> bv;
    private static final /* synthetic */ int mw;
    private static final /* synthetic */ int mq;
    private static final /* synthetic */ int mr;
    private static final /* synthetic */ int mx;
    static /* synthetic */ int di;
    private static final /* synthetic */ int mu;
    private static final /* synthetic */ int mn;
    private static final /* synthetic */ WorldPoint mm;
    private static final /* synthetic */ int mt;
    private static /* synthetic */ String[] lIllllIlII;

    private static void lIIllllllIlll() {
        lIllllIlIl = new int[97];
        lIllllIlIl[0] = ((175 ^ 153) ^ (183 ^ 149)) & (((20 ^ 101) ^ (246 ^ 147)) ^ (-" ".length()));
        lIllllIlIl[1] = " ".length();
        lIllllIlIl[2] = (((((108 + 84) - 145) + 100) + (252 ^ 188)) - (((112 + 151) - 103) + 1)) + (229 ^ 139);
        lIllllIlIl[3] = "  ".length();
        lIllllIlIl[4] = "   ".length();
        lIllllIlIl[5] = (-((-4376) & 22847)) & (-1089) & 24559;
        lIllllIlIl[6] = (122 ^ 49) ^ (136 ^ 199);
        lIllllIlIl[7] = (-((-4929) & 21493)) & (-8195) & 32767;
        lIllllIlIl[8] = (171 ^ 195) ^ (12 ^ 110);
        lIllllIlIl[9] = 144 ^ 149;
        lIllllIlIl[10] = (-26642) & 27199;
        lIllllIlIl[11] = (-30724) & 31723;
        lIllllIlIl[12] = (19 ^ 109) ^ (61 ^ 69);
        lIllllIlIl[13] = (-13635) & 14191;
        lIllllIlIl[14] = (214 ^ 170) ^ (213 ^ 174);
        lIllllIlIl[15] = (-31057) & 31611;
        lIllllIlIl[16] = 81 ^ 89;
        lIllllIlIl[17] = (-((-1993) & 16345)) & (-37) & 16373;
        lIllllIlIl[18] = 9 ^ 0;
        lIllllIlIl[19] = (((87 + 63) - 37) + 36) ^ (((58 + 81) - 111) + 130);
        lIllllIlIl[20] = (-((-4611) & 12987)) & (-1) & 16383;
        lIllllIlIl[21] = (-((-4435) & 29523)) & (-1) & 26558;
        lIllllIlIl[22] = (-6173) & 7644;
        lIllllIlIl[23] = (-((-9575) & 32615)) & (-30) & 24543;
        lIllllIlIl[24] = (-6196) & 7671;
        lIllllIlIl[25] = (-3585) & 3963;
        lIllllIlIl[26] = (-((-709) & 6861)) & (-513) & 7164;
        lIllllIlIl[27] = (-((-20881) & 21919)) & (-16545) & 30207;
        lIllllIlIl[28] = (-((-8343) & 13759)) & (-8193) & 16188;
        lIllllIlIl[29] = (-4376) & 7455;
        lIllllIlIl[30] = (((84 + 102) - 108) + 68) ^ (((8 + 84) - (-6)) + 36);
        lIllllIlIl[31] = 35 ^ 44;
        lIllllIlIl[32] = (21 ^ 121) ^ (12 ^ 108);
        lIllllIlIl[33] = 201 ^ 196;
        lIllllIlIl[34] = (214 ^ 199) ^ (185 ^ 166);
        lIllllIlIl[35] = (((21 + 34) - (-66)) + 45) ^ (((92 + 158) - 205) + 137);
        lIllllIlIl[36] = (((28 + 185) - 169) + 170) ^ (((165 + 38) - 25) + 21);
        lIllllIlIl[37] = (-16385) & 25894;
        lIllllIlIl[38] = 65 ^ 83;
        lIllllIlIl[39] = (-(71 ^ 102)) & (-66) & 9207;
        lIllllIlIl[40] = 28 ^ 15;
        lIllllIlIl[41] = 81 ^ 68;
        lIllllIlIl[42] = 225 ^ 133;
        lIllllIlIl[43] = (-7214) & 7613;
        lIllllIlIl[44] = (111 ^ 2) ^ (204 ^ 183);
        lIllllIlIl[45] = 127 ^ 87;
        lIllllIlIl[46] = 158 ^ 137;
        lIllllIlIl[47] = (-26625) & 31734;
        lIllllIlIl[48] = (((41 + 103) - 129) + 149) ^ (((68 + 43) - 82) + 159);
        lIllllIlIl[49] = (192 ^ 137) ^ (63 ^ 111);
        lIllllIlIl[50] = (-((-25356) & 29471)) & (-257) & 16351;
        lIllllIlIl[51] = (-3477) & 20476;
        lIllllIlIl[52] = (((178 + 96) - 187) + 131) ^ (((171 + 41) - 192) + 172);
        lIllllIlIl[53] = (-((-1354) & 30043)) & (-2177) & 32765;
        lIllllIlIl[54] = (101 ^ 121) ^ (162 ^ 165);
        lIllllIlIl[55] = 95 ^ 67;
        lIllllIlIl[56] = 57 ^ 36;
        lIllllIlIl[57] = 155 ^ 133;
        lIllllIlIl[58] = (-((-2257) & 14591)) & (-16386) & 30719;
        lIllllIlIl[59] = (-12306) & 12861;
        lIllllIlIl[60] = 26 ^ 5;
        lIllllIlIl[61] = 91 ^ 123;
        lIllllIlIl[62] = (((34 + 0) - (-72)) + 57) ^ (((58 + 46) - (-8)) + 18);
        lIllllIlIl[63] = (95 ^ 115) ^ (48 ^ 62);
        lIllllIlIl[64] = (((157 + 32) - 51) + 38) ^ (((125 + 108) - 114) + 28);
        lIllllIlIl[65] = (98 ^ 49) ^ (214 ^ 161);
        lIllllIlIl[66] = (203 ^ 134) ^ (62 ^ 86);
        lIllllIlIl[67] = 32 ^ 6;
        lIllllIlIl[68] = 76 ^ 107;
        lIllllIlIl[69] = (((51 + 32) - (-30)) + 47) ^ (((48 + 82) - (-1)) + 6);
        lIllllIlIl[70] = (((65 + 99) - 89) + 52) ^ (146 ^ 199);
        lIllllIlIl[71] = 2 ^ 41;
        lIllllIlIl[72] = (83 ^ 41) ^ (16 ^ 70);
        lIllllIlIl[73] = 11 ^ 38;
        lIllllIlIl[74] = 2 ^ 44;
        lIllllIlIl[75] = (11 ^ 100) ^ (97 ^ 33);
        lIllllIlIl[76] = (120 ^ 1) ^ (194 ^ 139);
        lIllllIlIl[77] = 0 ^ 49;
        lIllllIlIl[78] = 191 ^ 141;
        lIllllIlIl[79] = 78 ^ 125;
        lIllllIlIl[80] = 21 ^ 33;
        lIllllIlIl[81] = 191 ^ 138;
        lIllllIlIl[82] = 180 ^ 130;
        lIllllIlIl[83] = 160 ^ 151;
        lIllllIlIl[84] = (6 ^ 59) ^ (184 ^ 189);
        lIllllIlIl[85] = 133 ^ 188;
        lIllllIlIl[86] = (-30993) & 31546;
        lIllllIlIl[87] = (-((-389) & 29647)) & (-261) & 32622;
        lIllllIlIl[88] = (-21121) & 24283;
        lIllllIlIl[89] = (99 ^ 50) ^ (212 ^ 191);
        lIllllIlIl[90] = (((139 + 67) - 195) + 155) ^ (((101 + 68) - 144) + 132);
        lIllllIlIl[91] = 12 ^ 48;
        lIllllIlIl[92] = (79 ^ 118) ^ (123 ^ 127);
        lIllllIlIl[93] = 161 ^ 159;
        lIllllIlIl[94] = (134 ^ 194) ^ (88 ^ 35);
        lIllllIlIl[95] = 74 ^ 10;
        lIllllIlIl[96] = 90 ^ 27;
    }

    private static String lIIllllllIIlI(String llllllllllllllllllIlllIIllllllll, String llllllllllllllllllIlllIIlllllllI) {
        String llllllllllllllllllIlllIIllllllll2 = new String(Base64.getDecoder().decode(llllllllllllllllllIlllIIllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlllIIllllllIl = new StringBuilder();
        char[] llllllllllllllllllIlllIIllllllII = llllllllllllllllllIlllIIlllllllI.toCharArray();
        int llllllllllllllllllIlllIIlllllIll = lIllllIlIl[0];
        char[] charArray = llllllllllllllllllIlllIIllllllll2.toCharArray();
        int llllllllllllllllllIlllIIllllIlII = charArray.length;
        int llllllllllllllllllIlllIIllllIIll = lIllllIlIl[0];
        while (lIIllllllllIl(llllllllllllllllllIlllIIllllIIll, llllllllllllllllllIlllIIllllIlII)) {
            llllllllllllllllllIlllIIllllllIl.append((char) (charArray[llllllllllllllllllIlllIIllllIIll] ^ llllllllllllllllllIlllIIllllllII[llllllllllllllllllIlllIIlllllIll % llllllllllllllllllIlllIIllllllII.length]));
            "".length();
            llllllllllllllllllIlllIIlllllIll++;
            llllllllllllllllllIlllIIllllIIll++;
            "".length();
            if ((-" ".length()) > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIlllIIllllllIl);
    }

    private static boolean lIlIIIIIIIIII(int i) {
        return i > 0;
    }

    static {
        lIIllllllIlll();
        lIIllllllIlIl();
        mo = lIllllIlIl[21];
        mq = lIllllIlIl[23];
        mx = lIllllIlIl[17];
        mn = lIllllIlIl[2];
        mp = lIllllIlIl[22];
        mu = lIllllIlIl[13];
        mv = lIllllIlIl[86];
        mt = lIllllIlIl[15];
        mr = lIllllIlIl[24];
        ms = lIllllIlIl[10];
        mw = lIllllIlIl[25];
        mm = new WorldPoint(lIllllIlIl[87], lIllllIlIl[88], lIllllIlIl[3]);
        bv = new ArrayList();
        ly = lIllllIlII[lIllllIlIl[89]];
        String[] strArr = new String[lIllllIlIl[12]];
        strArr[lIllllIlIl[0]] = lIllllIlII[lIllllIlIl[90]];
        strArr[lIllllIlIl[1]] = lIllllIlII[lIllllIlIl[91]];
        strArr[lIllllIlIl[3]] = lIllllIlII[lIllllIlIl[92]];
        strArr[lIllllIlIl[4]] = lIllllIlII[lIllllIlIl[93]];
        strArr[lIllllIlIl[6]] = lIllllIlII[lIllllIlIl[94]];
        strArr[lIllllIlIl[9]] = lIllllIlII[lIllllIlIl[95]];
        fG = strArr;
        cG = lIllllIlIl[0];
    }

    private static boolean lIlIIIIIIIIll(int i, int i2) {
        return i != i2;
    }

    private static void lIIllllllIlIl() {
        lIllllIlII = new String[lIllllIlIl[96]];
        lIllllIlII[lIllllIlIl[0]] = lIIllllllIIlI("DwEeKjYqVA43PSAH", "MtgCX");
        lIllllIlII[lIllllIlIl[1]] = lIIllllllIIll("k90lfymaqDDKPl+yjBJNGjA6lArRE8/j9d6dubeJ5gQeJooIM2cudXM6tdDwafXWJCP/ng2Mrb4=", "Uwiqa");
        lIllllIlII[lIllllIlIl[3]] = lIIllllllIIlI("JCA/JikLNSAhKUo1Jm8sCy8i", "jAION");
        lIllllIlII[lIllllIlIl[4]] = lIIllllllIlII("Om2xOas1qUkcpn6+25tWOA==", "nLRXB");
        lIllllIlII[lIllllIlIl[6]] = lIIllllllIIlI("GCAnFB05Ly5QEzEvIhkfNw==", "PAIpq");
        lIllllIlII[lIllllIlIl[9]] = lIIllllllIlII("IOc+U43ObXIJdpk6ShNkuFHpmjOPcdxqnjs57gAAP9JInVrgfbS/pHV4L5Qe2p0I", "zAcpG");
        lIllllIlII[lIllllIlIl[12]] = lIIllllllIIll("tJOiA1viDmawlVb2jeEPl0SaC/I9Addm4UPZU+5bvaqKuTpjupwyya3GtF/INg68", "AVInw");
        lIllllIlII[lIllllIlIl[14]] = lIIllllllIlII("19YExfsDWe3O11c9CwnLMSKJPFB/SAYPZT0vkwqwqBL1UNR5DWybfJuZCUlWu42m", "TvHxS");
        lIllllIlII[lIllllIlIl[16]] = lIIllllllIlII("h/Xo3/mHAVt08xwm5sjOD8f9UQz+kK8Pk8ig9/AiOez4X7fZdPSvcm6v5wSkULn3", "dvWNP");
        lIllllIlII[lIllllIlIl[18]] = lIIllllllIIlI("BxxwECg1WT0YKSMQPhZ6IwwgATY5HCNdeiMOOQU5OBA+FnokFnAzDwkwHjY=", "PyPqZ");
        lIllllIlII[lIllllIlIl[8]] = lIIllllllIIll("3zXAUcRt1H7H8SdBf6DqZs52eipyizbjgYGoBS8a8xQuzZCA0ner/Ub4ZQWd3DAO", "lVdTd");
        lIllllIlII[lIllllIlIl[19]] = lIIllllllIIll("M8Dblwk+WpMXDXBDAMcG850UvV8eMKcv", "ASuLM");
        lIllllIlII[lIllllIlIl[32]] = lIIllllllIIll("Vdf/y1eocbp1Qj3GVGe4mg==", "YYPcU");
        lIllllIlII[lIllllIlIl[33]] = lIIllllllIIlI("JCg8AhA=", "aFHgb");
        lIllllIlII[lIllllIlIl[34]] = lIIllllllIlII("LoD4z3vzTm0PndRg91DSCQ==", "mkANL");
        lIllllIlII[lIllllIlIl[31]] = lIIllllllIIll("G9Ii/2rP1m9k+P4pV9QFmA==", "uoOdm");
        lIllllIlII[lIllllIlIl[35]] = lIIllllllIIll("+Ot5s27KwjVHLIIjKoJU9w==", "XAKNH");
        lIllllIlII[lIllllIlIl[36]] = lIIllllllIIlI("JTQOOx4DcBg3FEQyDzMURCQFchIRKUo+GRck", "dPjRp");
        lIllllIlII[lIllllIlIl[38]] = lIIllllllIIlI("BRUHPhYjURoyFCgeFHcaIRAHdwwrUQEiAWQdCiQM", "DqcWx");
        lIllllIlII[lIllllIlIl[40]] = lIIllllllIIll("gxB0U/h3ZZ06QKfRwJDEzhszkrM+uir8dkUgp0V4I7c=", "pSevU");
        lIllllIlII[lIllllIlIl[30]] = lIIllllllIlII("TnWOTQ2kIND7VcUv58oyr9hvqu/6YBg82RBRqOdjVWw=", "nBHRP");
        lIllllIlII[lIllllIlIl[41]] = lIIllllllIlII("L8lQhYsuB5zHTfCTtsO/TKwjHNde64mDNd4sW4ZgPRQ=", "umRXf");
        lIllllIlII[lIllllIlIl[44]] = lIIllllllIIll("zeRrGJBdd4TeoCGps5UJD0wvbVmxEB78dICBTOgabeo=", "jtkJC");
        lIllllIlII[lIllllIlIl[46]] = lIIllllllIIll("Nl8VB5aN5CrT0x+wAjzpYdrYm+DVecaa41o0MhWSuDY=", "FIHvS");
        lIllllIlII[lIllllIlIl[48]] = lIIllllllIIll("pq50oQ/j0WxvZGYjQMgBTDcF3fK9IPLU1rEHvzkQuZQ=", "dwfwc");
        lIllllIlII[lIllllIlIl[49]] = lIIllllllIIlI("MhUoEyIUUTsfLR8FJFo4HFEuDzVTHSUJOA==", "sqLzL");
        lIllllIlII[lIllllIlIl[52]] = lIIllllllIlII("E8aasYWTudoPl/o5aHOTkD+Rf2Vv2cNE//k6Sd+5LRY=", "CkIsb");
        lIllllIlII[lIllllIlIl[54]] = lIIllllllIIll("sVmxL57mD8f74Bt+ZnL8eImO1Kgupkx5weAW5zVUvDk=", "QakAo");
        lIllllIlII[lIllllIlIl[55]] = lIIllllllIIlI("DxICIT0pVgApPyIPRjwyLAVGPDxuFBMxcyIfFTw=", "NvfHS");
        lIllllIlII[lIllllIlIl[56]] = lIIllllllIIll("zjPAGx40tBB4k4dWiF5HEZHBdjnkRwKtpaJ7ZZ4TxuY=", "CFhpE");
        lIllllIlII[lIllllIlIl[57]] = lIIllllllIIlI("GysLBzY9bwIHNj5vHRs2PzxPGjd6LRoXeDYmHBo=", "ZOonX");
        lIllllIlII[lIllllIlIl[60]] = lIIllllllIIll("BudsQNA+2XLFjL2AjmlHOmSb+eYDjZF1bMGkF8xrJxM=", "MhSZD");
        lIllllIlII[lIllllIlIl[61]] = lIIllllllIIlI("MzENLz0VdR4nJxcnSTQmHDAaZicddQszKlI5ADUn", "rUiFS");
        lIllllIlII[lIllllIlIl[62]] = lIIllllllIIll("r/5t86oxEDSquFk+ib5JEa4btZrmIBongRqcVeHfpow=", "obeBE");
        lIllllIlII[lIllllIlIl[63]] = lIIllllllIIll("wknZzkJLuMjQjtwugahCkcg/77EBJzN8ibdKbJzu7h0=", "XOOhL");
        lIllllIlII[lIllllIlIl[64]] = lIIllllllIIll("efAfyVaymCDeDcT4r0M9GjAuqy3mFLI4dAcOU2mLdgE=", "GRlPJ");
        lIllllIlII[lIllllIlIl[65]] = lIIllllllIIll("mbkJRmWEznOTp8SCevI30oTIJqtq2jwJeRGE68AxTIA=", "pAEbk");
        lIllllIlII[lIllllIlIl[66]] = lIIllllllIIlI("OTwqCBofeCMIGhx4PBQaHStuFRtYOjsYVBQxPRU=", "xXNat");
        lIllllIlII[lIllllIlIl[67]] = lIIllllllIIll("yEtK4TjcF6I9ug3Fanb6mw==", "rgCKD");
        lIllllIlII[lIllllIlIl[68]] = lIIllllllIIll("pMhjp0fyx+VImBRz0aA/qQ==", "xBRTe");
        lIllllIlII[lIllllIlIl[45]] = lIIllllllIlII("kDslQQvkRbTY94dApqiIDQ==", "oGJyg");
        lIllllIlII[lIllllIlIl[69]] = lIIllllllIIll("EDCcs0fuTk7aXSVuN23kcA==", "ifnlb");
        lIllllIlII[lIllllIlIl[70]] = lIIllllllIlII("c29HDF7/MAY=", "dVcgB");
        lIllllIlII[lIllllIlIl[71]] = lIIllllllIIll("2Za5XB+8/WukaHkW8C1V1fW76r/odWsT", "IDvMq");
        lIllllIlII[lIllllIlIl[72]] = lIIllllllIlII("Atw5DjX22UrBn/px3PUAXw==", "vMfXg");
        lIllllIlII[lIllllIlIl[73]] = lIIllllllIIlI("LDIHLw8NPQ5rAQU9AiINAw==", "dSiKc");
        lIllllIlII[lIllllIlIl[74]] = lIIllllllIIlI("OCMqL2IHPyou", "uJDKB");
        lIllllIlII[lIllllIlIl[75]] = lIIllllllIIlI("AjsNEEc9Jw0R", "ORctg");
        lIllllIlII[lIllllIlIl[76]] = lIIllllllIIll("XLoLEwul5BsfaKFU3sQtJxIc7M/Kteika4SXo76ArYC4LrMHZ3vW0hilPeuzsGMc", "iIJdH");
        lIllllIlII[lIllllIlIl[77]] = lIIllllllIIlI("AQ4wDjJkHTcUPw==", "DoBzZ");
        lIllllIlII[lIllllIlIl[78]] = lIIllllllIlII("nKO+m2mG8RJCZb7vzPB12w==", "YBlTb");
        lIllllIlII[lIllllIlIl[79]] = lIIllllllIlII("9GQLV+vv96NVaUjJRloWdpJScGSQu5alSFej7OXCWmT4Wr/NDB2xGfYXwdU0IYvO", "vVASG");
        lIllllIlII[lIllllIlIl[80]] = lIIllllllIlII("hNgUYmaytaM2c3eP4hpZ0g==", "UwRCZ");
        lIllllIlII[lIllllIlIl[81]] = lIIllllllIlII("PERyxxQEY8n6JJCLTUTMQw==", "PHdVN");
        lIllllIlII[lIllllIlIl[82]] = lIIllllllIIlI("LQ15FyQfSDQfJQkBNxF2CR0pBjoTDSpadgkfMAI1EgE3EXYOB3k0AyMhFzE=", "zhYvV");
        lIllllIlII[lIllllIlIl[83]] = lIIllllllIlII("dcp4gDMjptfSVNHdilUc8VJP6ki/uI5MnQ6ibYJattzfJ11gHYSj9OG5cpsc39aw", "ZFtIY");
        lIllllIlII[lIllllIlIl[84]] = lIIllllllIIlI("IQsESA8JEhcAKRpGBR0pGxI=", "hfthL");
        lIllllIlII[lIllllIlIl[85]] = lIIllllllIIll("aTH2/nLQlbYPUbuNTnwSxD/xMcTZflw+", "jslhF");
        lIllllIlII[lIllllIlIl[89]] = lIIllllllIIll("ZiIqXvKfU0Wwe/zun8dQwg==", "bPDxU");
        lIllllIlII[lIllllIlIl[90]] = lIIllllllIIlI("EBoPKHc6FlksdyYGHD4jdwMVKDYkFlc=", "WsyMW");
        lIllllIlII[lIllllIlIl[91]] = lIIllllllIIlI("DVQJBFEwARxG", "Dsehq");
        lIllllIlII[lIllllIlIl[92]] = lIIllllllIIlI("ByIAFwgqLQ1OSQ9hHwwGMWEDCgw0JFQWBmYnHQwNZjUcCxpmMgAXDyBv", "FAtbi");
        lIllllIlII[lIllllIlIl[93]] = lIIllllllIIlI("Ci41bA==", "SKFBi");
        lIllllIlII[lIllllIlIl[94]] = lIIllllllIIlI("ED8pGHE0dzwEM2c6KRgiIiV3", "GWHlV");
        lIllllIlII[lIllllIlIl[95]] = lIIllllllIIlI("Hx5ucCZ3GS5wHDUQYicHMQFiGU8zFCxwCz9b", "PuBPo");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v244, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v253, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v262, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v271, types: [boolean] */
    private static void dA() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIIllllllllll(nearest) && lIIlllllllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lIllllIlII[lIllllIlIl[71]];
            C0000a.a(nearest);
        }
        if (lIIllllllllll(nearest) && lIIllllllllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIlllllllllI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderSotf.c = lIllllIlII[lIllllIlIl[72]];
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIllllIlIl[5]);
                "".length();
            }
            if (lIIllllllllII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderSotf.c = lIllllIlII[lIllllIlIl[73]];
                if (lIlIIIIIIIIII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIllllIlIl[4]);
                    "".length();
                }
                if (lIlIIIIIIIIII(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lIllllIlIl[3]);
                    "".length();
                }
                String[] strArr = new String[lIllllIlIl[1]];
                strArr[lIllllIlIl[0]] = lIllllIlII[lIllllIlIl[74]];
                if (lIIllllllllII(Bank.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIllllIlIl[1]];
                    strArr2[lIllllIlIl[0]] = lIllllIlII[lIllllIlIl[75]];
                    if (lIIllllllllIl(Bank.getFirst(strArr2).getQuantity(), lIllllIlIl[11])) {
                        Q();
                        System.out.println(lIllllIlII[lIllllIlIl[76]]);
                        bt = lIllllIlIl[1];
                        return;
                    }
                }
                String[] strArr3 = new String[lIllllIlIl[1]];
                strArr3[lIllllIlIl[0]] = lIllllIlII[lIllllIlIl[77]];
                if (lIIllllllllII(Bank.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIllllIlIl[1]];
                    strArr4[lIllllIlIl[0]] = lIllllIlII[lIllllIlIl[78]];
                    if (lIIllllllllIl(Bank.getFirst(strArr4).getQuantity(), lIllllIlIl[11])) {
                        Q();
                        System.out.println(lIllllIlII[lIllllIlIl[79]]);
                        bt = lIllllIlIl[1];
                        return;
                    }
                }
                String[] strArr5 = new String[lIllllIlIl[1]];
                strArr5[lIllllIlIl[0]] = lIllllIlII[lIllllIlIl[80]];
                if (lIIllllllllII(Bank.contains(strArr5) ? 1 : 0)) {
                    String[] strArr6 = new String[lIllllIlIl[1]];
                    strArr6[lIllllIlIl[0]] = lIllllIlII[lIllllIlIl[81]];
                    if (lIIllllllllIl(Bank.getFirst(strArr6).getQuantity(), lIllllIlIl[11])) {
                        Q();
                        System.out.println(lIllllIlII[lIllllIlIl[82]]);
                        bt = lIllllIlIl[1];
                        return;
                    }
                }
                int[] iArr = new int[lIllllIlIl[19]];
                iArr[lIllllIlIl[0]] = lIllllIlIl[20];
                iArr[lIllllIlIl[1]] = lIllllIlIl[21];
                iArr[lIllllIlIl[3]] = lIllllIlIl[22];
                iArr[lIllllIlIl[4]] = lIllllIlIl[23];
                iArr[lIllllIlIl[6]] = lIllllIlIl[24];
                iArr[lIllllIlIl[9]] = lIllllIlIl[7];
                iArr[lIllllIlIl[12]] = lIllllIlIl[17];
                iArr[lIllllIlIl[14]] = lIllllIlIl[25];
                iArr[lIllllIlIl[16]] = lIllllIlIl[10];
                iArr[lIllllIlIl[18]] = lIllllIlIl[15];
                iArr[lIllllIlIl[8]] = lIllllIlIl[13];
                if (lIIlllllllllI(C0018e.c(iArr) ? 1 : 0)) {
                    Q();
                    System.out.println(lIllllIlII[lIllllIlIl[83]]);
                    bt = lIllllIlIl[1];
                    return;
                }
                while (lIIlllllllllI(I.co() ? 1 : 0)) {
                    I.cm();
                    Time.sleepTicks(lIllllIlIl[1]);
                    "".length();
                    "".length();
                    if ("   ".length() < "   ".length()) {
                        return;
                    }
                }
                if (lIIlllllllllI(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepTicks(lIllllIlIl[6]);
                    "".length();
                }
                int[] iArr2 = new int[lIllllIlIl[1]];
                iArr2[lIllllIlIl[0]] = lIllllIlIl[22];
                if (lIIllllllllII(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIllllIlIl[1]];
                    iArr3[lIllllIlIl[0]] = lIllllIlIl[22];
                    if (lIIllllllllIl(Inventory.getCount(iArr3), lIllllIlIl[1])) {
                        Bank.withdraw(lIllllIlIl[22], lIllllIlIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllllIlIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr4 = new int[lIllllIlIl[1]];
                            iArr4[lIllllIlIl[0]] = lIllllIlIl[22];
                            if (lIlIIIIIIIIII(Inventory.getCount(iArr4))) {
                                ?? r0 = lIllllIlIl[1];
                                "".length();
                                return (-" ".length()) >= "  ".length() ? ((63 ^ 118) ^ (153 ^ 140)) & (((((4 + 224) - 120) + 136) ^ (((140 + 86) - 130) + 72)) ^ (-" ".length())) : r0;
                            }
                            return lIllllIlIl[0];
                        }, lIllllIlIl[5]);
                        "".length();
                    }
                }
                int[] iArr4 = new int[lIllllIlIl[1]];
                iArr4[lIllllIlIl[0]] = lIllllIlIl[23];
                if (lIIllllllllII(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr5 = new int[lIllllIlIl[1]];
                    iArr5[lIllllIlIl[0]] = lIllllIlIl[23];
                    if (lIIllllllllIl(Inventory.getCount(iArr5), lIllllIlIl[1])) {
                        Bank.withdraw(lIllllIlIl[23], lIllllIlIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllllIlIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr6 = new int[lIllllIlIl[1]];
                            iArr6[lIllllIlIl[0]] = lIllllIlIl[23];
                            if (lIlIIIIIIIIII(Inventory.getCount(iArr6))) {
                                ?? r0 = lIllllIlIl[1];
                                "".length();
                                return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIllllIlIl[0];
                        }, lIllllIlIl[5]);
                        "".length();
                    }
                }
                int[] iArr6 = new int[lIllllIlIl[1]];
                iArr6[lIllllIlIl[0]] = lIllllIlIl[21];
                if (lIIllllllllII(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr7 = new int[lIllllIlIl[1]];
                    iArr7[lIllllIlIl[0]] = lIllllIlIl[21];
                    if (lIIllllllllIl(Inventory.getCount(iArr7), lIllllIlIl[1])) {
                        Bank.withdraw(lIllllIlIl[21], lIllllIlIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllllIlIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr8 = new int[lIllllIlIl[1]];
                            iArr8[lIllllIlIl[0]] = lIllllIlIl[21];
                            if (lIlIIIIIIIIII(Inventory.getCount(iArr8))) {
                                ?? r0 = lIllllIlIl[1];
                                "".length();
                                return (((118 ^ 111) ^ (5 ^ 34)) & (((((71 + 163) - 78) + 97) ^ (((76 + 64) - 138) + 193)) ^ (-" ".length()))) != 0 ? ((65 ^ 3) ^ (35 ^ 101)) & (((((58 + 114) - 133) + 108) ^ (((63 + 92) - 74) + 70)) ^ (-" ".length())) : r0;
                            }
                            return lIllllIlIl[0];
                        }, lIllllIlIl[5]);
                        "".length();
                    }
                }
                int[] iArr8 = new int[lIllllIlIl[1]];
                iArr8[lIllllIlIl[0]] = lIllllIlIl[24];
                if (lIIllllllllII(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lIllllIlIl[1]];
                    iArr9[lIllllIlIl[0]] = lIllllIlIl[24];
                    if (lIIllllllllIl(Inventory.getCount(iArr9), lIllllIlIl[1])) {
                        Bank.withdraw(lIllllIlIl[24], lIllllIlIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllllIlIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr10 = new int[lIllllIlIl[1]];
                            iArr10[lIllllIlIl[0]] = lIllllIlIl[24];
                            if (lIlIIIIIIIIII(Inventory.getCount(iArr10))) {
                                ?? r0 = lIllllIlIl[1];
                                "".length();
                                return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIllllIlIl[0];
                        }, lIllllIlIl[5]);
                        "".length();
                    }
                }
                int[] iArr10 = new int[lIllllIlIl[1]];
                iArr10[lIllllIlIl[0]] = lIllllIlIl[7];
                if (lIIllllllllII(Bank.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[lIllllIlIl[1]];
                    iArr11[lIllllIlIl[0]] = lIllllIlIl[7];
                    if (lIIllllllllIl(Inventory.getCount(iArr11), lIllllIlIl[1])) {
                        Bank.withdraw(lIllllIlIl[7], lIllllIlIl[9], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllllIlIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr12 = new int[lIllllIlIl[1]];
                            iArr12[lIllllIlIl[0]] = lIllllIlIl[7];
                            if (lIlIIIIIIIIII(Inventory.getCount(iArr12))) {
                                ?? r0 = lIllllIlIl[1];
                                "".length();
                                return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIllllIlIl[0];
                        }, lIllllIlIl[5]);
                        "".length();
                    }
                }
                int[] iArr12 = new int[lIllllIlIl[1]];
                iArr12[lIllllIlIl[0]] = lIllllIlIl[17];
                if (lIIllllllllII(Bank.contains(iArr12) ? 1 : 0)) {
                    int[] iArr13 = new int[lIllllIlIl[1]];
                    iArr13[lIllllIlIl[0]] = lIllllIlIl[17];
                    if (lIIllllllllIl(Inventory.getCount(iArr13), lIllllIlIl[1])) {
                        Bank.withdraw(lIllllIlIl[17], lIllllIlIl[6], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllllIlIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr14 = new int[lIllllIlIl[1]];
                            iArr14[lIllllIlIl[0]] = lIllllIlIl[17];
                            if (lIlIIIIIIIIII(Inventory.getCount(iArr14))) {
                                ?? r0 = lIllllIlIl[1];
                                "".length();
                                return 0 != 0 ? ((57 ^ 116) ^ (56 ^ 36)) & (((19 ^ 51) ^ (81 ^ 32)) ^ (-" ".length())) : r0;
                            }
                            return lIllllIlIl[0];
                        }, lIllllIlIl[5]);
                        "".length();
                    }
                }
                int[] iArr14 = new int[lIllllIlIl[1]];
                iArr14[lIllllIlIl[0]] = lIllllIlIl[10];
                if (lIIllllllllII(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIllllIlIl[1]];
                    iArr15[lIllllIlIl[0]] = lIllllIlIl[10];
                    if (lIIllllllllIl(Inventory.getCount(iArr15), lIllllIlIl[1])) {
                        Bank.withdraw(lIllllIlIl[10], lIllllIlIl[26], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllllIlIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[lIllllIlIl[1]];
                            iArr16[lIllllIlIl[0]] = lIllllIlIl[10];
                            if (lIlIIIIIIIIII(Inventory.getCount(iArr16))) {
                                ?? r0 = lIllllIlIl[1];
                                "".length();
                                return (true ^ true) == ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIllllIlIl[0];
                        }, lIllllIlIl[5]);
                        "".length();
                    }
                }
                int[] iArr16 = new int[lIllllIlIl[1]];
                iArr16[lIllllIlIl[0]] = lIllllIlIl[15];
                if (lIIllllllllII(Bank.contains(iArr16) ? 1 : 0)) {
                    int[] iArr17 = new int[lIllllIlIl[1]];
                    iArr17[lIllllIlIl[0]] = lIllllIlIl[15];
                    if (lIIllllllllIl(Inventory.getCount(iArr17), lIllllIlIl[1])) {
                        Bank.withdraw(lIllllIlIl[15], lIllllIlIl[26], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllllIlIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr18 = new int[lIllllIlIl[1]];
                            iArr18[lIllllIlIl[0]] = lIllllIlIl[15];
                            if (lIlIIIIIIIIII(Inventory.getCount(iArr18))) {
                                ?? r0 = lIllllIlIl[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIllllIlIl[0];
                        }, lIllllIlIl[5]);
                        "".length();
                    }
                }
                int[] iArr18 = new int[lIllllIlIl[1]];
                iArr18[lIllllIlIl[0]] = lIllllIlIl[13];
                if (lIIllllllllII(Bank.contains(iArr18) ? 1 : 0)) {
                    int[] iArr19 = new int[lIllllIlIl[1]];
                    iArr19[lIllllIlIl[0]] = lIllllIlIl[13];
                    if (lIIllllllllIl(Inventory.getCount(iArr19), lIllllIlIl[1])) {
                        Bank.withdraw(lIllllIlIl[13], lIllllIlIl[26], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllllIlIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr20 = new int[lIllllIlIl[1]];
                            iArr20[lIllllIlIl[0]] = lIllllIlIl[13];
                            if (lIlIIIIIIIIII(Inventory.getCount(iArr20))) {
                                ?? r0 = lIllllIlIl[1];
                                "".length();
                                return ((122 ^ 55) ^ (7 ^ 78)) < (-" ".length()) ? ((((30 + 123) - 27) + 4) ^ (((129 + 134) - 153) + 87)) & (((28 ^ 127) ^ (81 ^ 117)) ^ (-" ".length())) : r0;
                            }
                            return lIllllIlIl[0];
                        }, lIllllIlIl[5]);
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIllllIlIl[1]];
                iArr20[lIllllIlIl[0]] = lIllllIlIl[27];
                if (lIIllllllllII(Bank.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[lIllllIlIl[1]];
                    iArr21[lIllllIlIl[0]] = lIllllIlIl[27];
                    if (lIIlllllllllI(Inventory.contains(iArr21) ? 1 : 0)) {
                        Bank.withdraw(lIllllIlIl[27], lIllllIlIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllllIlIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr22 = new int[lIllllIlIl[1]];
                            iArr22[lIllllIlIl[0]] = lIllllIlIl[27];
                            return Inventory.contains(iArr22);
                        }, lIllllIlIl[5]);
                        "".length();
                    }
                }
                int[] iArr22 = new int[lIllllIlIl[1]];
                iArr22[lIllllIlIl[0]] = lIllllIlIl[25];
                if (lIIllllllllII(Bank.contains(iArr22) ? 1 : 0)) {
                    int[] iArr23 = new int[lIllllIlIl[1]];
                    iArr23[lIllllIlIl[0]] = lIllllIlIl[25];
                    if (lIIllllllllIl(Inventory.getCount(iArr23), lIllllIlIl[1])) {
                        Bank.withdrawAll(lIllllIlIl[25], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllllIlIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr24 = new int[lIllllIlIl[1]];
                            iArr24[lIllllIlIl[0]] = lIllllIlIl[25];
                            if (lIlIIIIIIIIII(Inventory.getCount(iArr24))) {
                                ?? r0 = lIllllIlIl[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIllllIlIl[0];
                        }, lIllllIlIl[5]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean lIlIIIIIIIllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIllllllllll(Object obj) {
        return obj != null;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            dR();
            "".length();
            if (0 != 0) {
                return ((121 ^ 44) ^ (155 ^ 137)) & (((17 ^ 26) ^ (63 ^ 115)) ^ (-" ".length()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lIllllIlIl[42];
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x02d9, code lost:
        if (lIIllllllllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.X.lIllllIlIl[9]) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x03bb, code lost:
        if (lIIllllllllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.X.lIllllIlIl[30]) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04aa, code lost:
        if (lIIllllllllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.X.lIllllIlIl[30]) != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11;
        int[] iArr12;
        int[] iArr13 = new int[lIllllIlIl[1]];
        iArr13[lIllllIlIl[0]] = lIllllIlIl[21];
        if (lIIlllllllllI(Bank.contains(iArr13) ? 1 : 0)) {
            System.out.println(lIllllIlII[lIllllIlIl[36]]);
            bv.add(new C0017d(lIllllIlIl[21], lIllllIlIl[1], lIllllIlIl[37]));
            "".length();
        }
        int[] iArr14 = new int[lIllllIlIl[1]];
        iArr14[lIllllIlIl[0]] = lIllllIlIl[22];
        if (lIIlllllllllI(Bank.contains(iArr14) ? 1 : 0)) {
            System.out.println(lIllllIlII[lIllllIlIl[38]]);
            bv.add(new C0017d(lIllllIlIl[22], lIllllIlIl[1], lIllllIlIl[39]));
            "".length();
        }
        int[] iArr15 = new int[lIllllIlIl[1]];
        iArr15[lIllllIlIl[0]] = lIllllIlIl[23];
        if (lIIlllllllllI(Bank.contains(iArr15) ? 1 : 0)) {
            System.out.println(lIllllIlII[lIllllIlIl[40]]);
            bv.add(new C0017d(lIllllIlIl[23], lIllllIlIl[1], lIllllIlIl[39]));
            "".length();
        }
        int[] iArr16 = new int[lIllllIlIl[1]];
        iArr16[lIllllIlIl[0]] = lIllllIlIl[24];
        if (lIIlllllllllI(Bank.contains(iArr16) ? 1 : 0)) {
            System.out.println(lIllllIlII[lIllllIlIl[30]]);
            bv.add(new C0017d(lIllllIlIl[24], lIllllIlIl[1], lIllllIlIl[39]));
            "".length();
        }
        int[] iArr17 = new int[lIllllIlIl[1]];
        iArr17[lIllllIlIl[0]] = lIllllIlIl[25];
        if (lIIlllllllllI(Bank.contains(iArr17) ? 1 : 0)) {
            System.out.println(lIllllIlII[lIllllIlIl[41]]);
            bv.add(new C0017d(lIllllIlIl[25], lIllllIlIl[42], lIllllIlIl[43]));
            "".length();
        }
        int[] iArr18 = new int[lIllllIlIl[1]];
        iArr18[lIllllIlIl[0]] = lIllllIlIl[25];
        if (lIIllllllllII(Bank.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[lIllllIlIl[1]];
            iArr19[lIllllIlIl[0]] = lIllllIlIl[25];
            if (lIIllllllllIl(Bank.getFirst(iArr19).getQuantity(), lIllllIlIl[30])) {
                System.out.println(lIllllIlII[lIllllIlIl[44]]);
                bv.add(new C0017d(lIllllIlIl[25], lIllllIlIl[45], lIllllIlIl[43]));
                "".length();
            }
        }
        int[] iArr20 = new int[lIllllIlIl[1]];
        iArr20[lIllllIlIl[0]] = lIllllIlIl[17];
        if (lIIlllllllllI(Bank.contains(iArr20) ? 1 : 0)) {
            System.out.println(lIllllIlII[lIllllIlIl[46]]);
            bv.add(new C0017d(lIllllIlIl[17], lIllllIlIl[9], lIllllIlIl[47]));
            "".length();
        }
        int[] iArr21 = new int[lIllllIlIl[1]];
        iArr21[lIllllIlIl[0]] = lIllllIlIl[17];
        if (lIIllllllllII(Bank.contains(iArr21) ? 1 : 0)) {
            int[] iArr22 = new int[lIllllIlIl[1]];
            iArr22[lIllllIlIl[0]] = lIllllIlIl[17];
            if (lIIllllllllII(Bank.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[lIllllIlIl[1]];
                iArr23[lIllllIlIl[0]] = lIllllIlIl[17];
            }
            if (lIIlllllllllI(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIllllIlII[lIllllIlIl[85]]);
            }) ? 1 : 0)) {
                System.out.println(lIllllIlII[lIllllIlIl[49]]);
                bv.add(new C0017d(lIllllIlIl[50], lIllllIlIl[38], lIllllIlIl[51]));
                "".length();
            }
            iArr = new int[lIllllIlIl[1]];
            iArr[lIllllIlIl[0]] = lIllllIlIl[20];
            if (lIIllllllllII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr24 = new int[lIllllIlIl[1]];
                iArr24[lIllllIlIl[0]] = lIllllIlIl[20];
                if (lIIllllllllII(Bank.contains(iArr24) ? 1 : 0)) {
                    int[] iArr25 = new int[lIllllIlIl[1]];
                    iArr25[lIllllIlIl[0]] = lIllllIlIl[20];
                }
                iArr2 = new int[lIllllIlIl[1]];
                iArr2[lIllllIlIl[0]] = lIllllIlIl[7];
                if (lIIlllllllllI(Bank.contains(iArr2) ? 1 : 0)) {
                    System.out.println(lIllllIlII[lIllllIlIl[54]]);
                    bv.add(new C0017d(lIllllIlIl[7], lIllllIlIl[30], lIllllIlIl[53]));
                    "".length();
                }
                iArr3 = new int[lIllllIlIl[1]];
                iArr3[lIllllIlIl[0]] = lIllllIlIl[7];
                if (lIIllllllllII(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr26 = new int[lIllllIlIl[1]];
                    iArr26[lIllllIlIl[0]] = lIllllIlIl[7];
                    if (lIIllllllllII(Bank.contains(iArr26) ? 1 : 0)) {
                        int[] iArr27 = new int[lIllllIlIl[1]];
                        iArr27[lIllllIlIl[0]] = lIllllIlIl[7];
                    }
                    iArr4 = new int[lIllllIlIl[1]];
                    iArr4[lIllllIlIl[0]] = lIllllIlIl[27];
                    if (lIIlllllllllI(Bank.contains(iArr4) ? 1 : 0)) {
                        System.out.println(lIllllIlII[lIllllIlIl[56]]);
                        bv.add(new C0017d(lIllllIlIl[27], lIllllIlIl[9], C0023j.cf));
                        "".length();
                    }
                    iArr5 = new int[lIllllIlIl[1]];
                    iArr5[lIllllIlIl[0]] = lIllllIlIl[10];
                    if (lIIllllllllII(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr28 = new int[lIllllIlIl[1]];
                        iArr28[lIllllIlIl[0]] = lIllllIlIl[10];
                        if (lIIllllllllIl(Bank.getFirst(iArr28).getQuantity(), lIllllIlIl[11])) {
                            System.out.println(lIllllIlII[lIllllIlIl[57]]);
                            bv.add(new C0017d(lIllllIlIl[10], lIllllIlIl[58], lIllllIlIl[14]));
                            "".length();
                        }
                    }
                    iArr6 = new int[lIllllIlIl[1]];
                    iArr6[lIllllIlIl[0]] = lIllllIlIl[59];
                    if (lIIllllllllII(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr29 = new int[lIllllIlIl[1]];
                        iArr29[lIllllIlIl[0]] = lIllllIlIl[59];
                        if (lIIllllllllIl(Bank.getFirst(iArr29).getQuantity(), lIllllIlIl[11])) {
                            System.out.println(lIllllIlII[lIllllIlIl[60]]);
                            bv.add(new C0017d(lIllllIlIl[59], lIllllIlIl[58], lIllllIlIl[14]));
                            "".length();
                        }
                    }
                    iArr7 = new int[lIllllIlIl[1]];
                    iArr7[lIllllIlIl[0]] = lIllllIlIl[15];
                    if (lIIllllllllII(Bank.contains(iArr7) ? 1 : 0)) {
                        int[] iArr30 = new int[lIllllIlIl[1]];
                        iArr30[lIllllIlIl[0]] = lIllllIlIl[15];
                        if (lIIllllllllIl(Bank.getFirst(iArr30).getQuantity(), lIllllIlIl[11])) {
                            System.out.println(lIllllIlII[lIllllIlIl[61]]);
                            bv.add(new C0017d(lIllllIlIl[15], lIllllIlIl[58], lIllllIlIl[14]));
                            "".length();
                        }
                    }
                    iArr8 = new int[lIllllIlIl[1]];
                    iArr8[lIllllIlIl[0]] = lIllllIlIl[13];
                    if (lIIllllllllII(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr31 = new int[lIllllIlIl[1]];
                        iArr31[lIllllIlIl[0]] = lIllllIlIl[13];
                        if (lIIllllllllIl(Bank.getFirst(iArr31).getQuantity(), lIllllIlIl[11])) {
                            System.out.println(lIllllIlII[lIllllIlIl[62]]);
                            bv.add(new C0017d(lIllllIlIl[13], lIllllIlIl[58], lIllllIlIl[14]));
                            "".length();
                        }
                    }
                    iArr9 = new int[lIllllIlIl[1]];
                    iArr9[lIllllIlIl[0]] = lIllllIlIl[59];
                    if (lIIlllllllllI(Bank.contains(iArr9) ? 1 : 0)) {
                        System.out.println(lIllllIlII[lIllllIlIl[63]]);
                        bv.add(new C0017d(lIllllIlIl[59], lIllllIlIl[58], lIllllIlIl[14]));
                        "".length();
                    }
                    iArr10 = new int[lIllllIlIl[1]];
                    iArr10[lIllllIlIl[0]] = lIllllIlIl[15];
                    if (lIIlllllllllI(Bank.contains(iArr10) ? 1 : 0)) {
                        System.out.println(lIllllIlII[lIllllIlIl[64]]);
                        bv.add(new C0017d(lIllllIlIl[15], lIllllIlIl[58], lIllllIlIl[14]));
                        "".length();
                    }
                    iArr11 = new int[lIllllIlIl[1]];
                    iArr11[lIllllIlIl[0]] = lIllllIlIl[13];
                    if (lIIlllllllllI(Bank.contains(iArr11) ? 1 : 0)) {
                        System.out.println(lIllllIlII[lIllllIlIl[65]]);
                        bv.add(new C0017d(lIllllIlIl[13], lIllllIlIl[58], lIllllIlIl[14]));
                        "".length();
                    }
                    iArr12 = new int[lIllllIlIl[1]];
                    iArr12[lIllllIlIl[0]] = lIllllIlIl[10];
                    if (lIIlllllllllI(Bank.contains(iArr12) ? 1 : 0)) {
                        return;
                    }
                    System.out.println(lIllllIlII[lIllllIlIl[66]]);
                    bv.add(new C0017d(lIllllIlIl[10], lIllllIlIl[58], lIllllIlIl[14]));
                    "".length();
                    return;
                }
                System.out.println(lIllllIlII[lIllllIlIl[55]]);
                bv.add(new C0017d(lIllllIlIl[7], lIllllIlIl[30], lIllllIlIl[53]));
                "".length();
                iArr4 = new int[lIllllIlIl[1]];
                iArr4[lIllllIlIl[0]] = lIllllIlIl[27];
                if (lIIlllllllllI(Bank.contains(iArr4) ? 1 : 0)) {
                }
                iArr5 = new int[lIllllIlIl[1]];
                iArr5[lIllllIlIl[0]] = lIllllIlIl[10];
                if (lIIllllllllII(Bank.contains(iArr5) ? 1 : 0)) {
                }
                iArr6 = new int[lIllllIlIl[1]];
                iArr6[lIllllIlIl[0]] = lIllllIlIl[59];
                if (lIIllllllllII(Bank.contains(iArr6) ? 1 : 0)) {
                }
                iArr7 = new int[lIllllIlIl[1]];
                iArr7[lIllllIlIl[0]] = lIllllIlIl[15];
                if (lIIllllllllII(Bank.contains(iArr7) ? 1 : 0)) {
                }
                iArr8 = new int[lIllllIlIl[1]];
                iArr8[lIllllIlIl[0]] = lIllllIlIl[13];
                if (lIIllllllllII(Bank.contains(iArr8) ? 1 : 0)) {
                }
                iArr9 = new int[lIllllIlIl[1]];
                iArr9[lIllllIlIl[0]] = lIllllIlIl[59];
                if (lIIlllllllllI(Bank.contains(iArr9) ? 1 : 0)) {
                }
                iArr10 = new int[lIllllIlIl[1]];
                iArr10[lIllllIlIl[0]] = lIllllIlIl[15];
                if (lIIlllllllllI(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[lIllllIlIl[1]];
                iArr11[lIllllIlIl[0]] = lIllllIlIl[13];
                if (lIIlllllllllI(Bank.contains(iArr11) ? 1 : 0)) {
                }
                iArr12 = new int[lIllllIlIl[1]];
                iArr12[lIllllIlIl[0]] = lIllllIlIl[10];
                if (lIIlllllllllI(Bank.contains(iArr12) ? 1 : 0)) {
                }
            }
            System.out.println(lIllllIlII[lIllllIlIl[52]]);
            bv.add(new C0017d(lIllllIlIl[20], lIllllIlIl[45], lIllllIlIl[53]));
            "".length();
            iArr2 = new int[lIllllIlIl[1]];
            iArr2[lIllllIlIl[0]] = lIllllIlIl[7];
            if (lIIlllllllllI(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lIllllIlIl[1]];
            iArr3[lIllllIlIl[0]] = lIllllIlIl[7];
            if (lIIllllllllII(Bank.contains(iArr3) ? 1 : 0)) {
            }
            System.out.println(lIllllIlII[lIllllIlIl[55]]);
            bv.add(new C0017d(lIllllIlIl[7], lIllllIlIl[30], lIllllIlIl[53]));
            "".length();
            iArr4 = new int[lIllllIlIl[1]];
            iArr4[lIllllIlIl[0]] = lIllllIlIl[27];
            if (lIIlllllllllI(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIllllIlIl[1]];
            iArr5[lIllllIlIl[0]] = lIllllIlIl[10];
            if (lIIllllllllII(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lIllllIlIl[1]];
            iArr6[lIllllIlIl[0]] = lIllllIlIl[59];
            if (lIIllllllllII(Bank.contains(iArr6) ? 1 : 0)) {
            }
            iArr7 = new int[lIllllIlIl[1]];
            iArr7[lIllllIlIl[0]] = lIllllIlIl[15];
            if (lIIllllllllII(Bank.contains(iArr7) ? 1 : 0)) {
            }
            iArr8 = new int[lIllllIlIl[1]];
            iArr8[lIllllIlIl[0]] = lIllllIlIl[13];
            if (lIIllllllllII(Bank.contains(iArr8) ? 1 : 0)) {
            }
            iArr9 = new int[lIllllIlIl[1]];
            iArr9[lIllllIlIl[0]] = lIllllIlIl[59];
            if (lIIlllllllllI(Bank.contains(iArr9) ? 1 : 0)) {
            }
            iArr10 = new int[lIllllIlIl[1]];
            iArr10[lIllllIlIl[0]] = lIllllIlIl[15];
            if (lIIlllllllllI(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[lIllllIlIl[1]];
            iArr11[lIllllIlIl[0]] = lIllllIlIl[13];
            if (lIIlllllllllI(Bank.contains(iArr11) ? 1 : 0)) {
            }
            iArr12 = new int[lIllllIlIl[1]];
            iArr12[lIllllIlIl[0]] = lIllllIlIl[10];
            if (lIIlllllllllI(Bank.contains(iArr12) ? 1 : 0)) {
            }
        }
        System.out.println(lIllllIlII[lIllllIlIl[48]]);
        bv.add(new C0017d(lIllllIlIl[17], lIllllIlIl[9], lIllllIlIl[47]));
        "".length();
        if (lIIlllllllllI(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIllllIlII[lIllllIlIl[85]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lIllllIlIl[1]];
        iArr[lIllllIlIl[0]] = lIllllIlIl[20];
        if (lIIllllllllII(Bank.contains(iArr) ? 1 : 0)) {
        }
        System.out.println(lIllllIlII[lIllllIlIl[52]]);
        bv.add(new C0017d(lIllllIlIl[20], lIllllIlIl[45], lIllllIlIl[53]));
        "".length();
        iArr2 = new int[lIllllIlIl[1]];
        iArr2[lIllllIlIl[0]] = lIllllIlIl[7];
        if (lIIlllllllllI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIllllIlIl[1]];
        iArr3[lIllllIlIl[0]] = lIllllIlIl[7];
        if (lIIllllllllII(Bank.contains(iArr3) ? 1 : 0)) {
        }
        System.out.println(lIllllIlII[lIllllIlIl[55]]);
        bv.add(new C0017d(lIllllIlIl[7], lIllllIlIl[30], lIllllIlIl[53]));
        "".length();
        iArr4 = new int[lIllllIlIl[1]];
        iArr4[lIllllIlIl[0]] = lIllllIlIl[27];
        if (lIIlllllllllI(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIllllIlIl[1]];
        iArr5[lIllllIlIl[0]] = lIllllIlIl[10];
        if (lIIllllllllII(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIllllIlIl[1]];
        iArr6[lIllllIlIl[0]] = lIllllIlIl[59];
        if (lIIllllllllII(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[lIllllIlIl[1]];
        iArr7[lIllllIlIl[0]] = lIllllIlIl[15];
        if (lIIllllllllII(Bank.contains(iArr7) ? 1 : 0)) {
        }
        iArr8 = new int[lIllllIlIl[1]];
        iArr8[lIllllIlIl[0]] = lIllllIlIl[13];
        if (lIIllllllllII(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[lIllllIlIl[1]];
        iArr9[lIllllIlIl[0]] = lIllllIlIl[59];
        if (lIIlllllllllI(Bank.contains(iArr9) ? 1 : 0)) {
        }
        iArr10 = new int[lIllllIlIl[1]];
        iArr10[lIllllIlIl[0]] = lIllllIlIl[15];
        if (lIIlllllllllI(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[lIllllIlIl[1]];
        iArr11[lIllllIlIl[0]] = lIllllIlIl[13];
        if (lIIlllllllllI(Bank.contains(iArr11) ? 1 : 0)) {
        }
        iArr12 = new int[lIllllIlIl[1]];
        iArr12[lIllllIlIl[0]] = lIllllIlIl[10];
        if (lIIlllllllllI(Bank.contains(iArr12) ? 1 : 0)) {
        }
    }

    private static boolean lIIllllllllII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lIllllIlIl[0];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return lIllllIlII[lIllllIlIl[84]];
    }

    private static boolean lIlIIIIIIIlII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIIIIIIIIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIllllllllIl(int i, int i2) {
        return i < i2;
    }

    private static String lIIllllllIlII(String llllllllllllllllllIlllIlIIIIllll, String llllllllllllllllllIlllIlIIIIlllI) {
        try {
            SecretKeySpec llllllllllllllllllIlllIlIIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllIlIIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllllIlIl[3], llllllllllllllllllIlllIlIIIlIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllIlIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlllIlIIIlIIII) {
            llllllllllllllllllIlllIlIIIlIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean aM() {
        String[] strArr = new String[lIllllIlIl[1]];
        strArr[lIllllIlIl[0]] = lIllllIlII[lIllllIlIl[67]];
        if (lIIllllllllII(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lIllllIlIl[1]];
            strArr2[lIllllIlIl[0]] = lIllllIlII[lIllllIlIl[68]];
            if (lIIllllllllII(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[lIllllIlIl[1]];
                strArr3[lIllllIlIl[0]] = lIllllIlII[lIllllIlIl[45]];
                if (lIIllllllllII(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIllllIlIl[1]];
                    strArr4[lIllllIlIl[0]] = lIllllIlII[lIllllIlIl[69]];
                    if (lIIllllllllII(Inventory.contains(strArr4) ? 1 : 0)) {
                        int[] iArr = new int[lIllllIlIl[1]];
                        iArr[lIllllIlIl[0]] = lIllllIlIl[10];
                        if (lIIllllllllII(Inventory.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIllllIlIl[1]];
                            iArr2[lIllllIlIl[0]] = lIllllIlIl[15];
                            if (lIIllllllllII(Inventory.contains(iArr2) ? 1 : 0)) {
                                int[] iArr3 = new int[lIllllIlIl[1]];
                                iArr3[lIllllIlIl[0]] = lIllllIlIl[13];
                                if (lIIllllllllII(Inventory.contains(iArr3) ? 1 : 0)) {
                                    int[] iArr4 = new int[lIllllIlIl[1]];
                                    iArr4[lIllllIlIl[0]] = lIllllIlIl[7];
                                    if (lIIllllllllII(Inventory.contains(iArr4) ? 1 : 0)) {
                                        int[] iArr5 = new int[lIllllIlIl[1]];
                                        iArr5[lIllllIlIl[0]] = lIllllIlIl[25];
                                        if (lIIllllllllII(Inventory.contains(iArr5) ? 1 : 0)) {
                                            String[] strArr5 = new String[lIllllIlIl[1]];
                                            strArr5[lIllllIlIl[0]] = lIllllIlII[lIllllIlIl[70]];
                                            if (lIIllllllllII(Inventory.contains(strArr5) ? 1 : 0)) {
                                                ?? r0 = lIllllIlIl[1];
                                                "".length();
                                                return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return lIllllIlIl[0];
    }

    private static String lIIllllllIIll(String llllllllllllllllllIlllIIlllIlIlI, String llllllllllllllllllIlllIIlllIlIIl) {
        try {
            SecretKeySpec llllllllllllllllllIlllIIlllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllIIlllIlIIl.getBytes(StandardCharsets.UTF_8)), lIllllIlIl[16]), "DES");
            Cipher llllllllllllllllllIlllIIlllIllII = Cipher.getInstance("DES");
            llllllllllllllllllIlllIIlllIllII.init(lIllllIlIl[3], llllllllllllllllllIlllIIlllIllIl);
            return new String(llllllllllllllllllIlllIIlllIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllIIlllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlllIIlllIlIll) {
            llllllllllllllllllIlllIIlllIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllllllllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v367, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v376, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v385, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v394, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v403, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v412, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v438, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    public static void dR() {
        if (lIIllllllllII(bt ? 1 : 0)) {
            AccBuilderSotf.c = lIllllIlII[lIllllIlIl[0]];
            C0015b.a(bv);
            if (lIIllllllllIl(bv.size(), lIllllIlIl[1])) {
                System.out.println(lIllllIlII[lIllllIlIl[1]]);
                bt = lIllllIlIl[0];
            }
        }
        if (lIIlllllllllI(bt ? 1 : 0)) {
            if (lIIlllllllllI(C0018e.j(lIllllIlIl[2]))) {
                if (lIIlllllllllI(aM() ? 1 : 0)) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (lIIllllllllll(nearest) && lIIlllllllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lIllllIlII[lIllllIlIl[3]];
                        C0000a.a(nearest);
                    }
                    if (lIIllllllllll(nearest) && lIIllllllllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIIlllllllllI(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = lIllllIlII[lIllllIlIl[4]];
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIllllIlIl[5]);
                            "".length();
                        }
                        if (lIIllllllllII(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = lIllllIlII[lIllllIlIl[6]];
                            if (lIlIIIIIIIIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIllllIlIl[4]);
                                "".length();
                            }
                            if (lIlIIIIIIIIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIllllIlIl[3]);
                                "".length();
                            }
                            int[] iArr = new int[lIllllIlIl[1]];
                            iArr[lIllllIlIl[0]] = lIllllIlIl[7];
                            if (lIIllllllllII(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIllllIlIl[1]];
                                iArr2[lIllllIlIl[0]] = lIllllIlIl[7];
                                if (lIIllllllllIl(Bank.getFirst(iArr2).getQuantity(), lIllllIlIl[8])) {
                                    Q();
                                    System.out.println(lIllllIlII[lIllllIlIl[9]]);
                                    bt = lIllllIlIl[1];
                                    return;
                                }
                            }
                            int[] iArr3 = new int[lIllllIlIl[1]];
                            iArr3[lIllllIlIl[0]] = lIllllIlIl[10];
                            if (lIIllllllllII(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIllllIlIl[1]];
                                iArr4[lIllllIlIl[0]] = lIllllIlIl[10];
                                if (lIIllllllllIl(Bank.getFirst(iArr4).getQuantity(), lIllllIlIl[11])) {
                                    Q();
                                    System.out.println(lIllllIlII[lIllllIlIl[12]]);
                                    bt = lIllllIlIl[1];
                                    return;
                                }
                            }
                            int[] iArr5 = new int[lIllllIlIl[1]];
                            iArr5[lIllllIlIl[0]] = lIllllIlIl[13];
                            if (lIIllllllllII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIllllIlIl[1]];
                                iArr6[lIllllIlIl[0]] = lIllllIlIl[13];
                                if (lIIllllllllIl(Bank.getFirst(iArr6).getQuantity(), lIllllIlIl[11])) {
                                    Q();
                                    System.out.println(lIllllIlII[lIllllIlIl[14]]);
                                    bt = lIllllIlIl[1];
                                    return;
                                }
                            }
                            int[] iArr7 = new int[lIllllIlIl[1]];
                            iArr7[lIllllIlIl[0]] = lIllllIlIl[15];
                            if (lIIllllllllII(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIllllIlIl[1]];
                                iArr8[lIllllIlIl[0]] = lIllllIlIl[15];
                                if (lIIllllllllIl(Bank.getFirst(iArr8).getQuantity(), lIllllIlIl[11])) {
                                    Q();
                                    System.out.println(lIllllIlII[lIllllIlIl[16]]);
                                    bt = lIllllIlIl[1];
                                    return;
                                }
                            }
                            int[] iArr9 = new int[lIllllIlIl[1]];
                            iArr9[lIllllIlIl[0]] = lIllllIlIl[17];
                            if (lIIllllllllII(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIllllIlIl[1]];
                                iArr10[lIllllIlIl[0]] = lIllllIlIl[17];
                                if (lIIllllllllIl(Bank.getFirst(iArr10).getQuantity(), lIllllIlIl[9])) {
                                    Q();
                                    System.out.println(lIllllIlII[lIllllIlIl[18]]);
                                    bt = lIllllIlIl[1];
                                    return;
                                }
                            }
                            int[] iArr11 = new int[lIllllIlIl[19]];
                            iArr11[lIllllIlIl[0]] = lIllllIlIl[20];
                            iArr11[lIllllIlIl[1]] = lIllllIlIl[21];
                            iArr11[lIllllIlIl[3]] = lIllllIlIl[22];
                            iArr11[lIllllIlIl[4]] = lIllllIlIl[23];
                            iArr11[lIllllIlIl[6]] = lIllllIlIl[24];
                            iArr11[lIllllIlIl[9]] = lIllllIlIl[7];
                            iArr11[lIllllIlIl[12]] = lIllllIlIl[17];
                            iArr11[lIllllIlIl[14]] = lIllllIlIl[25];
                            iArr11[lIllllIlIl[16]] = lIllllIlIl[10];
                            iArr11[lIllllIlIl[18]] = lIllllIlIl[15];
                            iArr11[lIllllIlIl[8]] = lIllllIlIl[13];
                            if (lIIlllllllllI(C0018e.c(iArr11) ? 1 : 0)) {
                                Q();
                                System.out.println(lIllllIlII[lIllllIlIl[8]]);
                                bt = lIllllIlIl[1];
                                return;
                            }
                            while (lIIlllllllllI(I.co() ? 1 : 0)) {
                                I.cm();
                                Time.sleepTicks(lIllllIlIl[1]);
                                "".length();
                                "".length();
                                if ((-"  ".length()) >= 0) {
                                    return;
                                }
                            }
                            if (lIIlllllllllI(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepTicks(lIllllIlIl[6]);
                                "".length();
                            }
                            int[] iArr12 = new int[lIllllIlIl[1]];
                            iArr12[lIllllIlIl[0]] = lIllllIlIl[22];
                            if (lIIllllllllII(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIllllIlIl[1]];
                                iArr13[lIllllIlIl[0]] = lIllllIlIl[22];
                                if (lIIllllllllIl(Inventory.getCount(iArr13), lIllllIlIl[1])) {
                                    Bank.withdraw(lIllllIlIl[22], lIllllIlIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr14 = new int[lIllllIlIl[1]];
                                        iArr14[lIllllIlIl[0]] = lIllllIlIl[22];
                                        if (lIlIIIIIIIIII(Inventory.getCount(iArr14))) {
                                            ?? r0 = lIllllIlIl[1];
                                            "".length();
                                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIllllIlIl[0];
                                    }, lIllllIlIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr14 = new int[lIllllIlIl[1]];
                            iArr14[lIllllIlIl[0]] = lIllllIlIl[23];
                            if (lIIllllllllII(Bank.contains(iArr14) ? 1 : 0)) {
                                int[] iArr15 = new int[lIllllIlIl[1]];
                                iArr15[lIllllIlIl[0]] = lIllllIlIl[23];
                                if (lIIllllllllIl(Inventory.getCount(iArr15), lIllllIlIl[1])) {
                                    Bank.withdraw(lIllllIlIl[23], lIllllIlIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr16 = new int[lIllllIlIl[1]];
                                        iArr16[lIllllIlIl[0]] = lIllllIlIl[23];
                                        if (lIlIIIIIIIIII(Inventory.getCount(iArr16))) {
                                            ?? r0 = lIllllIlIl[1];
                                            "".length();
                                            return ((177 ^ 191) & ((19 ^ 29) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIllllIlIl[0];
                                    }, lIllllIlIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr16 = new int[lIllllIlIl[1]];
                            iArr16[lIllllIlIl[0]] = lIllllIlIl[21];
                            if (lIIllllllllII(Bank.contains(iArr16) ? 1 : 0)) {
                                int[] iArr17 = new int[lIllllIlIl[1]];
                                iArr17[lIllllIlIl[0]] = lIllllIlIl[21];
                                if (lIIllllllllIl(Inventory.getCount(iArr17), lIllllIlIl[1])) {
                                    Bank.withdraw(lIllllIlIl[21], lIllllIlIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr18 = new int[lIllllIlIl[1]];
                                        iArr18[lIllllIlIl[0]] = lIllllIlIl[21];
                                        if (lIlIIIIIIIIII(Inventory.getCount(iArr18))) {
                                            ?? r0 = lIllllIlIl[1];
                                            "".length();
                                            return (76 ^ 72) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIllllIlIl[0];
                                    }, lIllllIlIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr18 = new int[lIllllIlIl[1]];
                            iArr18[lIllllIlIl[0]] = lIllllIlIl[24];
                            if (lIIllllllllII(Bank.contains(iArr18) ? 1 : 0)) {
                                int[] iArr19 = new int[lIllllIlIl[1]];
                                iArr19[lIllllIlIl[0]] = lIllllIlIl[24];
                                if (lIIllllllllIl(Inventory.getCount(iArr19), lIllllIlIl[1])) {
                                    Bank.withdraw(lIllllIlIl[24], lIllllIlIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr20 = new int[lIllllIlIl[1]];
                                        iArr20[lIllllIlIl[0]] = lIllllIlIl[24];
                                        if (lIlIIIIIIIIII(Inventory.getCount(iArr20))) {
                                            ?? r0 = lIllllIlIl[1];
                                            "".length();
                                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIllllIlIl[0];
                                    }, lIllllIlIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr20 = new int[lIllllIlIl[1]];
                            iArr20[lIllllIlIl[0]] = lIllllIlIl[7];
                            if (lIIllllllllII(Bank.contains(iArr20) ? 1 : 0)) {
                                int[] iArr21 = new int[lIllllIlIl[1]];
                                iArr21[lIllllIlIl[0]] = lIllllIlIl[7];
                                if (lIIllllllllIl(Inventory.getCount(iArr21), lIllllIlIl[1])) {
                                    Bank.withdraw(lIllllIlIl[7], lIllllIlIl[9], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr22 = new int[lIllllIlIl[1]];
                                        iArr22[lIllllIlIl[0]] = lIllllIlIl[7];
                                        if (lIlIIIIIIIIII(Inventory.getCount(iArr22))) {
                                            ?? r0 = lIllllIlIl[1];
                                            "".length();
                                            return "   ".length() <= 0 ? ((76 ^ 56) ^ (108 ^ 30)) & (((197 ^ 189) ^ (103 ^ 25)) ^ (-" ".length())) : r0;
                                        }
                                        return lIllllIlIl[0];
                                    }, lIllllIlIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr22 = new int[lIllllIlIl[1]];
                            iArr22[lIllllIlIl[0]] = lIllllIlIl[17];
                            if (lIIllllllllII(Bank.contains(iArr22) ? 1 : 0)) {
                                int[] iArr23 = new int[lIllllIlIl[1]];
                                iArr23[lIllllIlIl[0]] = lIllllIlIl[17];
                                if (lIIllllllllIl(Inventory.getCount(iArr23), lIllllIlIl[1])) {
                                    Bank.withdraw(lIllllIlIl[17], lIllllIlIl[6], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr24 = new int[lIllllIlIl[1]];
                                        iArr24[lIllllIlIl[0]] = lIllllIlIl[17];
                                        if (lIlIIIIIIIIII(Inventory.getCount(iArr24))) {
                                            ?? r0 = lIllllIlIl[1];
                                            "".length();
                                            return (((75 ^ 91) ^ (238 ^ 188)) & (((66 ^ 50) ^ (110 ^ 92)) ^ (-" ".length()))) >= "   ".length() ? ((82 ^ 99) ^ (175 ^ 149)) & (((232 ^ 160) ^ (119 ^ 52)) ^ (-" ".length())) : r0;
                                        }
                                        return lIllllIlIl[0];
                                    }, lIllllIlIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr24 = new int[lIllllIlIl[1]];
                            iArr24[lIllllIlIl[0]] = lIllllIlIl[10];
                            if (lIIllllllllII(Bank.contains(iArr24) ? 1 : 0)) {
                                int[] iArr25 = new int[lIllllIlIl[1]];
                                iArr25[lIllllIlIl[0]] = lIllllIlIl[10];
                                if (lIIllllllllIl(Inventory.getCount(iArr25), lIllllIlIl[1])) {
                                    Bank.withdraw(lIllllIlIl[10], lIllllIlIl[26], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr26 = new int[lIllllIlIl[1]];
                                        iArr26[lIllllIlIl[0]] = lIllllIlIl[10];
                                        if (lIlIIIIIIIIII(Inventory.getCount(iArr26))) {
                                            ?? r0 = lIllllIlIl[1];
                                            "".length();
                                            return "   ".length() != "   ".length() ? ((((92 + 49) - 109) + 169) ^ (((137 + 131) - 253) + 130)) & (((((86 + 59) - 61) + 43) ^ (161 ^ 134)) ^ (-" ".length())) : r0;
                                        }
                                        return lIllllIlIl[0];
                                    }, lIllllIlIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr26 = new int[lIllllIlIl[1]];
                            iArr26[lIllllIlIl[0]] = lIllllIlIl[15];
                            if (lIIllllllllII(Bank.contains(iArr26) ? 1 : 0)) {
                                int[] iArr27 = new int[lIllllIlIl[1]];
                                iArr27[lIllllIlIl[0]] = lIllllIlIl[15];
                                if (lIIllllllllIl(Inventory.getCount(iArr27), lIllllIlIl[1])) {
                                    Bank.withdraw(lIllllIlIl[15], lIllllIlIl[26], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr28 = new int[lIllllIlIl[1]];
                                        iArr28[lIllllIlIl[0]] = lIllllIlIl[15];
                                        if (lIlIIIIIIIIII(Inventory.getCount(iArr28))) {
                                            ?? r0 = lIllllIlIl[1];
                                            "".length();
                                            return (-" ".length()) == (34 ^ 38) ? "   ".length() & ("   ".length() ^ (-1)) : r0;
                                        }
                                        return lIllllIlIl[0];
                                    }, lIllllIlIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr28 = new int[lIllllIlIl[1]];
                            iArr28[lIllllIlIl[0]] = lIllllIlIl[13];
                            if (lIIllllllllII(Bank.contains(iArr28) ? 1 : 0)) {
                                int[] iArr29 = new int[lIllllIlIl[1]];
                                iArr29[lIllllIlIl[0]] = lIllllIlIl[13];
                                if (lIIllllllllIl(Inventory.getCount(iArr29), lIllllIlIl[1])) {
                                    Bank.withdraw(lIllllIlIl[13], lIllllIlIl[26], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr30 = new int[lIllllIlIl[1]];
                                        iArr30[lIllllIlIl[0]] = lIllllIlIl[13];
                                        if (lIlIIIIIIIIII(Inventory.getCount(iArr30))) {
                                            ?? r0 = lIllllIlIl[1];
                                            "".length();
                                            return "  ".length() == 0 ? ((59 ^ 51) ^ (63 ^ 19)) & (((((36 + 19) - 34) + 134) ^ (((40 + 65) - 61) + 147)) ^ (-" ".length())) : r0;
                                        }
                                        return lIllllIlIl[0];
                                    }, lIllllIlIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr30 = new int[lIllllIlIl[1]];
                            iArr30[lIllllIlIl[0]] = lIllllIlIl[27];
                            if (lIIllllllllII(Bank.contains(iArr30) ? 1 : 0)) {
                                int[] iArr31 = new int[lIllllIlIl[1]];
                                iArr31[lIllllIlIl[0]] = lIllllIlIl[27];
                                if (lIIlllllllllI(Inventory.contains(iArr31) ? 1 : 0)) {
                                    Bank.withdraw(lIllllIlIl[27], lIllllIlIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr32 = new int[lIllllIlIl[1]];
                                        iArr32[lIllllIlIl[0]] = lIllllIlIl[27];
                                        return Inventory.contains(iArr32);
                                    }, lIllllIlIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr32 = new int[lIllllIlIl[1]];
                            iArr32[lIllllIlIl[0]] = lIllllIlIl[25];
                            if (lIIllllllllII(Bank.contains(iArr32) ? 1 : 0)) {
                                int[] iArr33 = new int[lIllllIlIl[1]];
                                iArr33[lIllllIlIl[0]] = lIllllIlIl[25];
                                if (lIIllllllllIl(Inventory.getCount(iArr33), lIllllIlIl[1])) {
                                    Bank.withdrawAll(lIllllIlIl[25], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr34 = new int[lIllllIlIl[1]];
                                        iArr34[lIllllIlIl[0]] = lIllllIlIl[25];
                                        if (lIlIIIIIIIIII(Inventory.getCount(iArr34))) {
                                            ?? r0 = lIllllIlIl[1];
                                            "".length();
                                            return (44 ^ 40) == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIllllIlIl[0];
                                    }, lIllllIlIl[5]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
                if (lIlIIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(mm), lIllllIlIl[6]) && lIlIIIIIIIIll(Players.getLocal().getWorldLocation().getPlane(), lIllllIlIl[3]) && lIIllllllllII(aM() ? 1 : 0)) {
                    if (lIIllllllllII(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks(lIllllIlIl[6]);
                        "".length();
                    }
                    AccBuilderSotf.c = lIllllIlII[lIllllIlIl[19]];
                    if (lIIlllllllllI(Bank.isOpen() ? 1 : 0)) {
                        if (lIIllllllllIl(cG, lIllllIlIl[1])) {
                            C0018e.x();
                            cG += lIllllIlIl[1];
                        }
                        if (lIIllllllllII(new WorldArea(lIllllIlIl[28], lIllllIlIl[29], lIllllIlIl[30], lIllllIlIl[31], lIllllIlIl[3]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr = new String[lIllllIlIl[1]];
                            strArr[lIllllIlIl[0]] = lIllllIlII[lIllllIlIl[32]];
                            TileObjects.getNearest(strArr).interact(lIllllIlII[lIllllIlIl[33]]);
                            Time.sleepTicks(C0018e.c(lIllllIlIl[12], lIllllIlIl[16]));
                            "".length();
                        }
                        Movement.walkTo(mm);
                        "".length();
                        Time.sleepTicks(lIllllIlIl[3]);
                        "".length();
                    }
                }
                if (lIlIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(mm), lIllllIlIl[12])) {
                    AccBuilderSotf.c = lIllllIlII[lIllllIlIl[34]];
                    di = lIllllIlIl[0];
                    C0020g.a(ly, fG);
                    if (lIIllllllllII(C0020g.M() ? 1 : 0)) {
                        C0020g.a(fG);
                    }
                }
            }
            if (lIlIIIIIIIIII(C0018e.j(lIllllIlIl[2])) && lIIllllllllIl(C0018e.j(lIllllIlIl[2]), lIllllIlIl[3])) {
                if (lIIlllllllllI(aM() ? 1 : 0)) {
                    dA();
                }
                if (lIIllllllllII(aM() ? 1 : 0)) {
                    if (lIlIIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(mm), lIllllIlIl[12])) {
                        AccBuilderSotf.c = lIllllIlII[lIllllIlIl[31]];
                        if (lIIllllllllII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(mm);
                        "".length();
                        Time.sleepTicks(lIllllIlIl[1]);
                        "".length();
                    }
                    if (lIlIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(mm), lIllllIlIl[12])) {
                        AccBuilderSotf.c = lIllllIlII[lIllllIlIl[35]];
                        if (lIIllllllllIl(di, lIllllIlIl[1])) {
                            aN.sZ += lIllllIlIl[1];
                            aN.u(AccBuilderSotf.m);
                            di += lIllllIlIl[1];
                            aN.sZ = lIllllIlIl[0];
                            dj = lIllllIlIl[0];
                        }
                        C0020g.a(ly, fG);
                        if (lIIllllllllII(C0020g.M() ? 1 : 0)) {
                            C0020g.a(fG);
                        }
                    }
                }
            }
            System.out.println("Setting: " + C0018e.j(lIllllIlIl[2]));
            C0020g.a(new String[lIllllIlIl[0]]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIIIIIIIllI(C0018e.j(lIllllIlIl[2]), lIllllIlIl[3])) {
            ?? r0 = lIllllIlIl[1];
            "".length();
            return (((120 ^ 38) ^ (89 ^ 79)) & (((((36 + 81) - (-74)) + 25) ^ (((5 + 98) - (-37)) + 4)) ^ (-" ".length()))) != 0 ? ((((2 + 11) - (-61)) + 181) ^ (((156 + 136) - 264) + 166)) & (((118 ^ 80) ^ (42 ^ 49)) ^ (-" ".length())) : r0;
        }
        return lIllllIlIl[0];
    }
}
