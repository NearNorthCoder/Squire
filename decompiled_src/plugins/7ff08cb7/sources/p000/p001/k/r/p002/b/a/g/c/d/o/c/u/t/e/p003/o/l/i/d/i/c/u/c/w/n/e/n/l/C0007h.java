package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.h  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/h.class */
public class C0007h {
    private static /* synthetic */ int bK;
    public static /* synthetic */ boolean bw;
    private static /* synthetic */ int ca;
    private static /* synthetic */ int bQ;
    private static /* synthetic */ int cc;
    private static /* synthetic */ int bN;
    private static /* synthetic */ int bT;
    private static /* synthetic */ int bM;
    private static /* synthetic */ int bS;
    private static /* synthetic */ Map<Integer, Integer> bA;
    private static /* synthetic */ Map<Integer, Integer> bF;
    private static /* synthetic */ Map<Integer, Integer> bE;
    private static /* synthetic */ int[] lllIlIIIl;
    private static /* synthetic */ int cd;
    private static /* synthetic */ int bU;
    private static /* synthetic */ Map<Integer, Integer> bz;
    private static /* synthetic */ int bV;
    private static /* synthetic */ int bL;
    private static /* synthetic */ int bZ;
    private static /* synthetic */ int bX;
    private static /* synthetic */ Map<Integer, Integer> bB;
    private static /* synthetic */ int ce;
    public static /* synthetic */ List<C0003d> bx;
    private static /* synthetic */ int bR;
    private static /* synthetic */ String[] lllIlIIII;
    private static /* synthetic */ int bJ;
    private static /* synthetic */ int bO;
    private static /* synthetic */ Map<Integer, Integer> bH;
    private static /* synthetic */ int bW;
    private static /* synthetic */ Map<Integer, Integer> bD;
    private static /* synthetic */ Map<Integer, Integer> bI;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ int bY;
    private static /* synthetic */ int cb;
    private static /* synthetic */ int bP;
    private static /* synthetic */ Map<Integer, Integer> bG;
    private static /* synthetic */ Map<Integer, Integer> by;
    private static /* synthetic */ Map<Integer, Integer> bC;

    private static boolean llIIIlIllIIl(int i) {
        return i == 0;
    }

    private static boolean n(int i) {
        if (llIIIlIlllIl(i, lllIlIIIl[16])) {
            int[] iArr = new int[lllIlIIIl[10]];
            iArr[lllIlIIIl[0]] = bJ;
            iArr[lllIlIIIl[1]] = bK;
            iArr[lllIlIIIl[2]] = bL;
            iArr[lllIlIIIl[3]] = bM;
            iArr[lllIlIIIl[4]] = bN;
            iArr[lllIlIIIl[5]] = bO;
            iArr[lllIlIIIl[6]] = bP;
            iArr[lllIlIIIl[7]] = bQ;
            iArr[lllIlIIIl[8]] = bR;
            iArr[lllIlIIIl[9]] = bS;
            return d(iArr);
        }
        int[] iArr2 = new int[lllIlIIIl[11]];
        iArr2[lllIlIIIl[0]] = bJ;
        iArr2[lllIlIIIl[1]] = bK;
        iArr2[lllIlIIIl[2]] = bL;
        iArr2[lllIlIIIl[3]] = bM;
        iArr2[lllIlIIIl[4]] = bN;
        iArr2[lllIlIIIl[5]] = bO;
        iArr2[lllIlIIIl[6]] = bP;
        iArr2[lllIlIIIl[7]] = bQ;
        iArr2[lllIlIIIl[8]] = bR;
        iArr2[lllIlIIIl[9]] = bS;
        iArr2[lllIlIIIl[10]] = i;
        return d(iArr2);
    }

    private static void Q() {
        if (llIIIlIllIII(bJ)) {
            int[] iArr = new int[lllIlIIIl[1]];
            iArr[lllIlIIIl[0]] = bJ;
            if (llIIIlIllIIl(Bank.contains(iArr) ? 1 : 0)) {
                bx.add(new C0003d(bJ, lllIlIIIl[1], bU));
                "".length();
            }
        }
        if (llIIIlIllIII(bK)) {
            int[] iArr2 = new int[lllIlIIIl[1]];
            iArr2[lllIlIIIl[0]] = bK;
            if (llIIIlIllIIl(Bank.contains(iArr2) ? 1 : 0)) {
                bx.add(new C0003d(bK, lllIlIIIl[1], bV));
                "".length();
            }
        }
        if (llIIIlIllIII(bL)) {
            int[] iArr3 = new int[lllIlIIIl[1]];
            iArr3[lllIlIIIl[0]] = bL;
            if (llIIIlIllIIl(Bank.contains(iArr3) ? 1 : 0)) {
                bx.add(new C0003d(bL, lllIlIIIl[1], bW));
                "".length();
            }
        }
        if (llIIIlIllIII(bM)) {
            int[] iArr4 = new int[lllIlIIIl[1]];
            iArr4[lllIlIIIl[0]] = bM;
            if (llIIIlIllIIl(Bank.contains(iArr4) ? 1 : 0)) {
                bx.add(new C0003d(bM, lllIlIIIl[1], bX));
                "".length();
            }
        }
        if (llIIIlIllIII(bN)) {
            int[] iArr5 = new int[lllIlIIIl[1]];
            iArr5[lllIlIIIl[0]] = bN;
            if (llIIIlIllIIl(Bank.contains(iArr5) ? 1 : 0)) {
                bx.add(new C0003d(bN, lllIlIIIl[1], bY));
                "".length();
            }
        }
        if (llIIIlIllIII(bO)) {
            int[] iArr6 = new int[lllIlIIIl[1]];
            iArr6[lllIlIIIl[0]] = bO;
            if (llIIIlIllIIl(Bank.contains(iArr6) ? 1 : 0)) {
                bx.add(new C0003d(bO, lllIlIIIl[1], bZ));
                "".length();
            }
        }
        if (llIIIlIllIII(bP)) {
            int[] iArr7 = new int[lllIlIIIl[1]];
            iArr7[lllIlIIIl[0]] = bP;
            if (llIIIlIllIIl(Bank.contains(iArr7) ? 1 : 0)) {
                bx.add(new C0003d(bP, lllIlIIIl[1], ca));
                "".length();
            }
        }
        if (llIIIlIllIII(bQ)) {
            int[] iArr8 = new int[lllIlIIIl[1]];
            iArr8[lllIlIIIl[0]] = bQ;
            if (llIIIlIllIIl(Bank.contains(iArr8) ? 1 : 0)) {
                bx.add(new C0003d(bQ, lllIlIIIl[1], cb));
                "".length();
            }
        }
        if (llIIIlIllIII(bR)) {
            int[] iArr9 = new int[lllIlIIIl[1]];
            iArr9[lllIlIIIl[0]] = bR;
            if (llIIIlIllIIl(Bank.contains(iArr9) ? 1 : 0)) {
                bx.add(new C0003d(bR, lllIlIIIl[1], cc));
                "".length();
            }
        }
        if (llIIIlIllIII(bS)) {
            int[] iArr10 = new int[lllIlIIIl[1]];
            iArr10[lllIlIIIl[0]] = bS;
            if (llIIIlIllIIl(Bank.contains(iArr10) ? 1 : 0)) {
                bx.add(new C0003d(bS, lllIlIIIl[1], cd));
                "".length();
            }
        }
        if (llIIIlIllIII(bT)) {
            int[] iArr11 = new int[lllIlIIIl[1]];
            iArr11[lllIlIIIl[0]] = bT;
            if (llIIIlIllIIl(Bank.contains(iArr11) ? 1 : 0)) {
                if (!llIIIlIlllIl(bT, lllIlIIIl[16])) {
                    bx.add(new C0003d(bT, lllIlIIIl[1], ce));
                    "".length();
                    return;
                }
                int[] iArr12 = new int[lllIlIIIl[1]];
                iArr12[lllIlIIIl[0]] = lllIlIIIl[16];
                if (llIIIlIllIIl(Bank.contains(iArr12) ? 1 : 0)) {
                    int[] iArr13 = new int[lllIlIIIl[1]];
                    iArr13[lllIlIIIl[0]] = lllIlIIIl[17];
                    if (llIIIlIllIIl(Bank.contains(iArr13) ? 1 : 0)) {
                        int[] iArr14 = new int[lllIlIIIl[1]];
                        iArr14[lllIlIIIl[0]] = lllIlIIIl[18];
                        if (llIIIlIllIIl(Bank.contains(iArr14) ? 1 : 0)) {
                            bx.add(new C0003d(bT, lllIlIIIl[1], ce));
                            "".length();
                            "".length();
                            if ((-"  ".length()) >= 0) {
                            }
                        }
                    }
                }
            }
        }
    }

    private static void W() {
        Random random = new Random();
        bJ = a(by, random);
        bU = by.getOrDefault(Integer.valueOf(bJ), Integer.valueOf(lllIlIIIl[0])).intValue();
        bK = a(bz, random);
        bV = bz.getOrDefault(Integer.valueOf(bK), Integer.valueOf(lllIlIIIl[0])).intValue();
        bL = a(bA, random);
        bW = bA.getOrDefault(Integer.valueOf(bL), Integer.valueOf(lllIlIIIl[0])).intValue();
        bM = a(bB, random);
        bX = bB.getOrDefault(Integer.valueOf(bM), Integer.valueOf(lllIlIIIl[0])).intValue();
        bN = a(bC, random);
        bY = bC.getOrDefault(Integer.valueOf(bN), Integer.valueOf(lllIlIIIl[0])).intValue();
        bO = a(bD, random);
        bZ = bD.getOrDefault(Integer.valueOf(bO), Integer.valueOf(lllIlIIIl[0])).intValue();
        bP = a(bE, random);
        ca = bE.getOrDefault(Integer.valueOf(bP), Integer.valueOf(lllIlIIIl[0])).intValue();
        bQ = a(bF, random);
        cb = bF.getOrDefault(Integer.valueOf(bQ), Integer.valueOf(lllIlIIIl[0])).intValue();
        bR = a(bG, random);
        cc = bG.getOrDefault(Integer.valueOf(bR), Integer.valueOf(lllIlIIIl[0])).intValue();
        bS = a(bH, random);
        cd = bH.getOrDefault(Integer.valueOf(bS), Integer.valueOf(lllIlIIIl[0])).intValue();
        bT = a(bI, random);
        ce = bI.getOrDefault(Integer.valueOf(bT), Integer.valueOf(lllIlIIIl[0])).intValue();
    }

    private static boolean llIIIlIllIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    public static void X() {
        by.clear();
        bz.clear();
        bA.clear();
        bB.clear();
        bC.clear();
        bD.clear();
        bE.clear();
        bF.clear();
        bG.clear();
        bH.clear();
        bI.clear();
        int i = lllIlIIIl[0];
        bT = i;
        bS = i;
        bR = i;
        bQ = i;
        bP = i;
        bO = i;
        bN = i;
        bM = i;
        bL = i;
        bK = i;
        bJ = i;
        int i2 = lllIlIIIl[0];
        ce = i2;
        cd = i2;
        cc = i2;
        cb = i2;
        ca = i2;
        bZ = i2;
        bY = i2;
        bX = i2;
        bW = i2;
        bV = i2;
        bU = i2;
        bw = lllIlIIIl[0];
        System.out.println(lllIlIIII[lllIlIIIl[46]]);
    }

    private static void llIIIlIlIlll() {
        lllIlIIIl = new int[206];
        lllIlIIIl[0] = ((95 ^ 97) ^ (105 ^ 7)) & (((30 ^ 86) ^ (4 ^ 28)) ^ (-" ".length()));
        lllIlIIIl[1] = " ".length();
        lllIlIIIl[2] = "  ".length();
        lllIlIIIl[3] = "   ".length();
        lllIlIIIl[4] = (((116 + 80) - 21) + 11) ^ (((137 + 99) - 166) + 120);
        lllIlIIIl[5] = (((188 + 114) - 150) + 47) ^ (((174 + 54) - 182) + 148);
        lllIlIIIl[6] = (((99 + 70) - 63) + 46) ^ (((3 + 151) - 23) + 27);
        lllIlIIIl[7] = (65 ^ 120) ^ (56 ^ 6);
        lllIlIIIl[8] = 128 ^ 136;
        lllIlIIIl[9] = (((108 + 96) - 92) + 47) ^ (((96 + 28) - 114) + 140);
        lllIlIIIl[10] = (117 ^ 42) ^ (81 ^ 4);
        lllIlIIIl[11] = 125 ^ 118;
        lllIlIIIl[12] = 156 ^ 144;
        lllIlIIIl[13] = (((138 + 71) - 145) + 93) ^ (((126 + 29) - 112) + 101);
        lllIlIIIl[14] = 100 ^ 106;
        lllIlIIIl[15] = (-((-4110) & 31823)) & (-7) & 32719;
        lllIlIIIl[16] = (-((-77) & 381)) & (-20481) & 32764;
        lllIlIIIl[17] = (-4113) & 16094;
        lllIlIIIl[18] = (-((-9955) & 26606)) & (-4097) & 32731;
        lllIlIIIl[19] = 8 ^ 7;
        lllIlIIIl[20] = 130 ^ 146;
        lllIlIIIl[21] = (((152 + 129) - 105) + 6) ^ (((84 + 45) - 53) + 91);
        lllIlIIIl[22] = (-"  ".length()) & (-4389) & 16375;
        lllIlIIIl[23] = (-4355) & 16342;
        lllIlIIIl[24] = 18 ^ 0;
        lllIlIIIl[25] = (-17167) & 18319;
        lllIlIIIl[26] = (-((-17685) & 28087)) & (-4354) & 32255;
        lllIlIIIl[27] = (-4818) & 24317;
        lllIlIIIl[28] = (-31057) & 32211;
        lllIlIIIl[29] = (-((-5163) & 24443)) & (-4097) & 24565;
        lllIlIIIl[30] = (-5) & 15654;
        lllIlIIIl[31] = (-((-4561) & 13777)) & (-33) & 28588;
        lllIlIIIl[32] = (-((-7337) & 31993)) & (-265) & 26111;
        lllIlIIIl[33] = (-((-2083) & 6887)) & (-16401) & 22527;
        lllIlIIIl[34] = (-((-8326) & 11231)) & (-12321) & 32765;
        lllIlIIIl[35] = (-(192 ^ 130)) & (-9217) & 32511;
        lllIlIIIl[36] = (-6945) & 8061;
        lllIlIIIl[37] = (-1637) & 20086;
        lllIlIIIl[38] = (-((-5159) & 15671)) & (-1026) & 32767;
        lllIlIIIl[39] = (-((-65) & 28773)) & (-2817) & 32639;
        lllIlIIIl[40] = (-257) & 1357;
        lllIlIIIl[41] = (-((-18211) & 26407)) & (-257) & 9519;
        lllIlIIIl[42] = (-2051) & 24550;
        lllIlIIIl[43] = (-4161) & 29560;
        lllIlIIIl[44] = (-((-1111) & 32599)) & (-129) & 32691;
        lllIlIIIl[45] = (-4865) & 5945;
        lllIlIIIl[46] = (((137 + 12) - 41) + 31) ^ (((86 + 120) - 177) + 130);
        lllIlIIIl[47] = (-18731) & 19887;
        lllIlIIIl[48] = (-26707) & 27899;
        lllIlIIIl[49] = (-((-331) & 27611)) & (-1) & 28605;
        lllIlIIIl[50] = (-((-15997) & 32381)) & (-6657) & 24159;
        lllIlIIIl[51] = (-((-1803) & 30683)) & (-259) & 30207;
        lllIlIIIl[52] = (133 ^ 174) ^ (85 ^ 96);
        lllIlIIIl[53] = (-((-11913) & 16377)) & (-16385) & 22007;
        lllIlIIIl[54] = (-8193) & 28370;
        lllIlIIIl[55] = (-((-895) & 26623)) & (-3) & 63230;
        lllIlIIIl[56] = (-((-21345) & 23524)) & (-33) & 51711;
        lllIlIIIl[57] = (-18771) & 19967;
        lllIlIIIl[58] = (-((-22865) & 31705)) & (-20545) & 30713;
        lllIlIIIl[59] = (-((-12385) & 29691)) & (-1) & 18427;
        lllIlIIIl[60] = (-((-9347) & 13443)) & (-1) & 16383;
        lllIlIIIl[61] = (-((-10753) & 11202)) & (-24589) & 63487;
        lllIlIIIl[62] = (-((-1045) & 22262)) & (-17) & 62463;
        lllIlIIIl[63] = (-31505) & 32575;
        lllIlIIIl[64] = (-15169) & 16253;
        lllIlIIIl[65] = (181 ^ 146) ^ (62 ^ 49);
        lllIlIIIl[66] = (-((-3361) & 32117)) & (-769) & 30685;
        lllIlIIIl[67] = (-((-11015) & 28567)) & (-257) & 20413;
        lllIlIIIl[68] = (-24865) & 64364;
        lllIlIIIl[69] = (-((-12431) & 29663)) & (-6145) & 24575;
        lllIlIIIl[70] = (-12485) & 15087;
        lllIlIIIl[71] = (-((-8353) & 29357)) & (-2177) & 24511;
        lllIlIIIl[72] = (-((-17729) & 30685)) & (-18433) & 32511;
        lllIlIIIl[73] = (-30017) & 32623;
        lllIlIIIl[74] = (-((-4098) & 4799)) & (-16385) & 65535;
        lllIlIIIl[75] = (-((-4407) & 6071)) & (-4098) & 56991;
        lllIlIIIl[76] = (-2057) & 3167;
        lllIlIIIl[77] = (-((-1075) & 14335)) & (-2049) & 16381;
        lllIlIIIl[78] = (-((-1025) & 7725)) & (-273) & 8063;
        lllIlIIIl[79] = 46 ^ 18;
        lllIlIIIl[80] = (-6993) & 8155;
        lllIlIIIl[81] = (-12417) & 13563;
        lllIlIIIl[82] = (-(51 ^ 66)) & (-131) & 95742;
        lllIlIIIl[83] = (-16388) & 121887;
        lllIlIIIl[84] = (-((-1617) & 22367)) & (-10241) & 32191;
        lllIlIIIl[85] = (-((-30311) & 30703)) & (-29701) & 32767;
        lllIlIIIl[86] = (-((-8369) & 28348)) & (-321) & 32767;
        lllIlIIIl[87] = (-531) & 1715;
        lllIlIIIl[88] = (-9361) & 12019;
        lllIlIIIl[89] = (-23051) & 24383;
        lllIlIIIl[90] = (-((-7905) & 32762)) & (-2049) & 64445;
        lllIlIIIl[91] = (-17665) & 60894;
        lllIlIIIl[92] = (-4615) & 5727;
        lllIlIIIl[93] = (-19273) & 20351;
        lllIlIIIl[94] = (-(85 ^ 65)) & (-2881) & 65399;
        lllIlIIIl[95] = (-18433) & 93832;
        lllIlIIIl[96] = (-((-17021) & 31615)) & (-16937) & 32623;
        lllIlIIIl[97] = (-((-27861) & 28119)) & (-4161) & 6143;
        lllIlIIIl[98] = (-((-16401) & 17339)) & (-1026) & 20463;
        lllIlIIIl[99] = (-((-7765) & 32637)) & (-4113) & 30715;
        lllIlIIIl[100] = (-17282) & 27645;
        lllIlIIIl[101] = (-((-17457) & 19635)) & (-16393) & 57070;
        lllIlIIIl[102] = (-(((112 + 140) - 219) + 160)) & (-20795) & 63486;
        lllIlIIIl[103] = (-(48 ^ 43)) & (-16421) & 18175;
        lllIlIIIl[104] = (-25601) & 26619;
        lllIlIIIl[105] = (-9305) & 32604;
        lllIlIIIl[106] = (-19) & 29558;
        lllIlIIIl[107] = (-((-2047) & 28671)) & (-1041) & 28671;
        lllIlIIIl[108] = (-11265) & 12287;
        lllIlIIIl[109] = (-(96 ^ 77)) & (-31633) & 32703;
        lllIlIIIl[110] = (-17425) & 21809;
        lllIlIIIl[111] = (-16398) & 17279;
        lllIlIIIl[112] = ((189 + 156) - 157) + 34;
        lllIlIIIl[113] = ((227 + 47) - 78) + 37;
        lllIlIIIl[114] = (-((-16771) & 21403)) & (-24641) & 30331;
        lllIlIIIl[115] = (-145) & 27644;
        lllIlIIIl[116] = (-323) & 32622;
        lllIlIIIl[117] = (-((-2578) & 32407)) & (-1) & 32751;
        lllIlIIIl[118] = (-12425) & 15336;
        lllIlIIIl[119] = (-((-1313) & 14137)) & (-16769) & 30653;
        lllIlIIIl[120] = (-((-10514) & 14643)) & (-17) & 7039;
        lllIlIIIl[121] = (-5142) & 8055;
        lllIlIIIl[122] = (-4228) & 7131;
        lllIlIIIl[123] = (-14605) & 16239;
        lllIlIIIl[124] = (-22547) & 24183;
        lllIlIIIl[125] = (-(((54 + 56) - 17) + 40)) & (-28945) & 30719;
        lllIlIIIl[126] = (-30985) & 32623;
        lllIlIIIl[127] = (-((-8369) & 28669)) & (-129) & 32719;
        lllIlIIIl[128] = (-5253) & 7925;
        lllIlIIIl[129] = (-((-1574) & 32573)) & (-65) & 32767;
        lllIlIIIl[130] = (-8452) & 28671;
        lllIlIIIl[131] = (-2342) & 57341;
        lllIlIIIl[132] = (-18) & 65017;
        lllIlIIIl[133] = (-((-2977) & 15353)) & (-5) & 32606;
        lllIlIIIl[134] = (-4145) & 24379;
        lllIlIIIl[135] = (-((-17801) & 22015)) & (-8194) & 32639;
        lllIlIIIl[136] = (-((-10559) & 31167)) & (-9) & 31742;
        lllIlIIIl[137] = (-13367) & 48766;
        lllIlIIIl[138] = (-18641) & 20477;
        lllIlIIIl[139] = (-999) & 5119;
        lllIlIIIl[140] = (-28162) & 32471;
        lllIlIIIl[141] = (-((-4279) & 5567)) & (-4230) & 6143;
        lllIlIIIl[142] = (-((-115) & 18935)) & (-8769) & 31711;
        lllIlIIIl[143] = (-((-21017) & 32761)) & (-513) & 16383;
        lllIlIIIl[144] = (-2905) & 7035;
        lllIlIIIl[145] = (-7202) & 32701;
        lllIlIIIl[146] = (-((-1325) & 3373)) & (-3) & 31550;
        lllIlIIIl[147] = (110 ^ 57) ^ (85 ^ 68);
        lllIlIIIl[148] = (-8962) & 15287;
        lllIlIIIl[149] = (-((-26897) & 32534)) & (-2129) & 32765;
        lllIlIIIl[150] = (-17477) & 52476;
        lllIlIIIl[151] = (-2572) & 15359;
        lllIlIIIl[152] = (-14473) & 704472;
        lllIlIIIl[153] = (-((-19121) & 32763)) & (-21) & 753662;
        lllIlIIIl[154] = (-5633) & 8131;
        lllIlIIIl[155] = (-16403) & 18903;
        lllIlIIIl[156] = (-((-8835) & 29339)) & (-513) & 23519;
        lllIlIIIl[157] = (-9281) & 11773;
        lllIlIIIl[158] = (-12801) & 15295;
        lllIlIIIl[159] = (-((-17099) & 22271)) & (-8705) & 16373;
        lllIlIIIl[160] = (-4642) & 89641;
        lllIlIIIl[161] = (-((-4401) & 7478)) & (-129) & 98205;
        lllIlIIIl[162] = (-17933) & 28431;
        lllIlIIIl[163] = (-4451) & 899450;
        lllIlIIIl[164] = (-(((31 + 82) - 1) + 52)) & (-24593) & 949755;
        lllIlIIIl[165] = (-((-37) & 25446)) & (-7) & 31743;
        lllIlIIIl[166] = (-((-14153) & 30543)) & (-1) & 191390;
        lllIlIIIl[167] = (-((-24425) & 32635)) & (-2114) & 195323;
        lllIlIIIl[168] = (-((-16689) & 26101)) & (-2) & 30711;
        lllIlIIIl[169] = (-17409) & 23931;
        lllIlIIIl[170] = (-((-2145) & 6389)) & (-3) & 589246;
        lllIlIIIl[171] = (-((-6245) & 31991)) & (-514) & 651259;
        lllIlIIIl[172] = (-((-26981) & 28135)) & (-25090) & 32767;
        lllIlIIIl[173] = (-((-20513) & 31977)) & (-3) & 32767;
        lllIlIIIl[174] = (-18822) & 1468821;
        lllIlIIIl[175] = (-((-11865) & 28541)) & (-11) & 1506686;
        lllIlIIIl[176] = (-193) & 21496;
        lllIlIIIl[177] = (-((-1245) & 30687)) & (-69) & 1179510;
        lllIlIIIl[178] = (-27910) & 1277909;
        lllIlIIIl[179] = (-((-9025) & 30659)) & (-6) & 32767;
        lllIlIIIl[180] = (-((-9165) & 29647)) & (-2182) & 2972663;
        lllIlIIIl[181] = (-66) & 3055065;
        lllIlIIIl[182] = (-((-431) & 26607)) & (-19) & 32762;
        lllIlIIIl[183] = (-((-13062) & 29479)) & (-4127) & 32383;
        lllIlIIIl[184] = (-((-3166) & 11775)) & (-21057) & 30715;
        lllIlIIIl[185] = (-31373) & 32414;
        lllIlIIIl[186] = (-21250) & 22295;
        lllIlIIIl[187] = (-785) & 15284;
        lllIlIIIl[188] = (-2348) & 3391;
        lllIlIIIl[189] = (-10481) & 11518;
        lllIlIIIl[190] = (-((-16713) & 31727)) & (-257) & 16318;
        lllIlIIIl[191] = (-17032) & 18071;
        lllIlIIIl[192] = (-((-27) & 8635)) & (-4611) & 14271;
        lllIlIIIl[193] = (-24841) & 25419;
        lllIlIIIl[194] = (-15361) & 16377;
        lllIlIIIl[195] = (-((-9613) & 30159)) & (-33) & 22527;
        lllIlIIIl[196] = (-((-9915) & 32763)) & (-8193) & 32767;
        lllIlIIIl[197] = (-21139) & 22519;
        lllIlIIIl[198] = (-17619) & 18162;
        lllIlIIIl[199] = (-((-14467) & 14751)) & (-15489) & 16349;
        lllIlIIIl[200] = (-((-267) & 22847)) & (-1) & 23615;
        lllIlIIIl[201] = (-130) & 671;
        lllIlIIIl[202] = (-551) & 1583;
        lllIlIIIl[203] = (((143 + 66) - 78) + 34) ^ (((45 + 114) - 76) + 99);
        lllIlIIIl[204] = 149 ^ 128;
        lllIlIIIl[205] = (((115 + 84) - 50) + 18) ^ (((84 + 10) - 46) + 129);
    }

    private static void U() {
        by.putAll(Map.of(Integer.valueOf(lllIlIIIl[168]), Integer.valueOf(C0004e.c(lllIlIIIl[163], lllIlIIIl[164]))));
        bD.putAll(Map.of(Integer.valueOf(lllIlIIIl[169]), Integer.valueOf(C0004e.c(lllIlIIIl[170], lllIlIIIl[171]))));
        bC.putAll(Map.of(Integer.valueOf(lllIlIIIl[172]), Integer.valueOf(C0004e.c(lllIlIIIl[152], lllIlIIIl[153]))));
        bE.putAll(Map.of(Integer.valueOf(lllIlIIIl[173]), Integer.valueOf(C0004e.c(lllIlIIIl[174], lllIlIIIl[175]))));
        bF.putAll(Map.of(Integer.valueOf(lllIlIIIl[176]), Integer.valueOf(C0004e.c(lllIlIIIl[177], lllIlIIIl[178]))));
        bz.putAll(Map.of(Integer.valueOf(lllIlIIIl[179]), Integer.valueOf(C0004e.c(lllIlIIIl[180], lllIlIIIl[181]))));
        bA.putAll(Map.of(Integer.valueOf(lllIlIIIl[182]), Integer.valueOf(C0004e.c(lllIlIIIl[163], lllIlIIIl[164]))));
        bB.putAll(Map.of(Integer.valueOf(lllIlIIIl[134]), Integer.valueOf(C0004e.c(lllIlIIIl[131], lllIlIIIl[132]))));
        bG.putAll(Map.of(Integer.valueOf(lllIlIIIl[136]), Integer.valueOf(C0004e.c(lllIlIIIl[137], lllIlIIIl[68]))));
        bH.putAll(Map.of(Integer.valueOf(lllIlIIIl[183]), Integer.valueOf(C0004e.c(lllIlIIIl[166], lllIlIIIl[167]))));
        bI.putAll(Map.of(Integer.valueOf(lllIlIIIl[16]), Integer.valueOf(C0004e.c(lllIlIIIl[145], lllIlIIIl[146]))));
    }

    private static boolean llIIIlIllIll(Object obj) {
        return obj != null;
    }

    private static void T() {
        if (llIIIlIllIlI(Skills.getLevel(Skill.RANGED), lllIlIIIl[147])) {
            by.putAll(Map.of(Integer.valueOf(lllIlIIIl[148]), Integer.valueOf(C0004e.c(lllIlIIIl[149], lllIlIIIl[150]))));
        }
        if (llIIIlIlllll(Skills.getLevel(Skill.RANGED), lllIlIIIl[147])) {
            by.putAll(Map.of(Integer.valueOf(lllIlIIIl[148]), Integer.valueOf(C0004e.c(lllIlIIIl[149], lllIlIIIl[150]))));
        }
        bC.putAll(Map.of(Integer.valueOf(lllIlIIIl[151]), Integer.valueOf(C0004e.c(lllIlIIIl[152], lllIlIIIl[153]))));
        if (llIIIlIllIlI(Skills.getLevel(Skill.RANGED), lllIlIIIl[79])) {
            bE.putAll(Map.of(Integer.valueOf(lllIlIIIl[154]), Integer.valueOf(C0004e.c(lllIlIIIl[131], lllIlIIIl[132]))));
        }
        if (llIIIlIlllll(Skills.getLevel(Skill.RANGED), lllIlIIIl[79]) && llIIIlIllIlI(Skills.getLevel(Skill.RANGED), lllIlIIIl[147])) {
            bE.putAll(Map.of(Integer.valueOf(lllIlIIIl[155]), Integer.valueOf(C0004e.c(lllIlIIIl[131], lllIlIIIl[132]))));
        }
        if (llIIIlIlllll(Skills.getLevel(Skill.RANGED), lllIlIIIl[147])) {
            bE.putAll(Map.of(Integer.valueOf(lllIlIIIl[156]), Integer.valueOf(C0004e.c(lllIlIIIl[131], lllIlIIIl[132]))));
        }
        if (llIIIlIllIlI(Skills.getLevel(Skill.RANGED), lllIlIIIl[79])) {
            bF.putAll(Map.of(Integer.valueOf(lllIlIIIl[157]), Integer.valueOf(C0004e.c(lllIlIIIl[131], lllIlIIIl[132]))));
        }
        if (llIIIlIlllll(Skills.getLevel(Skill.RANGED), lllIlIIIl[79]) && llIIIlIllIlI(Skills.getLevel(Skill.RANGED), lllIlIIIl[147])) {
            bF.putAll(Map.of(Integer.valueOf(lllIlIIIl[158]), Integer.valueOf(C0004e.c(lllIlIIIl[131], lllIlIIIl[132]))));
        }
        if (llIIIlIlllll(Skills.getLevel(Skill.RANGED), lllIlIIIl[147])) {
            bF.putAll(Map.of(Integer.valueOf(lllIlIIIl[159]), Integer.valueOf(C0004e.c(lllIlIIIl[131], lllIlIIIl[132]))));
        }
        bz.putAll(Map.of(Integer.valueOf(lllIlIIIl[129]), Integer.valueOf(C0004e.c(lllIlIIIl[160], lllIlIIIl[161]))));
        bA.putAll(Map.of(Integer.valueOf(lllIlIIIl[162]), Integer.valueOf(C0004e.c(lllIlIIIl[163], lllIlIIIl[164]))));
        if (llIIIlIllIlI(Skills.getLevel(Skill.RANGED), lllIlIIIl[147])) {
            bG.putAll(Map.of(Integer.valueOf(lllIlIIIl[136]), Integer.valueOf(C0004e.c(lllIlIIIl[137], lllIlIIIl[68]))));
        }
        if (llIIIlIlllll(Skills.getLevel(Skill.RANGED), lllIlIIIl[147])) {
            bG.putAll(Map.of(Integer.valueOf(lllIlIIIl[136]), Integer.valueOf(C0004e.c(lllIlIIIl[137], lllIlIIIl[68]))));
        }
        if (llIIIlIllIlI(Skills.getLevel(Skill.RANGED), lllIlIIIl[147])) {
            bH.putAll(Map.of(Integer.valueOf(lllIlIIIl[165]), Integer.valueOf(C0004e.c(lllIlIIIl[166], lllIlIIIl[167]))));
        }
        if (llIIIlIlllll(Skills.getLevel(Skill.RANGED), lllIlIIIl[147])) {
            bH.putAll(Map.of(Integer.valueOf(lllIlIIIl[165]), Integer.valueOf(C0004e.c(lllIlIIIl[166], lllIlIIIl[167]))));
        }
        bI.putAll(Map.of(Integer.valueOf(lllIlIIIl[16]), Integer.valueOf(C0004e.c(lllIlIIIl[145], lllIlIIIl[146]))));
    }

    private static void llIIIlIlIllI() {
        lllIlIIII = new String[lllIlIIIl[205]];
        lllIlIIII[lllIlIIIl[0]] = llIIIlIlIIll("mBpuL2IrjtGqn579kYpS0A==", "AtFTT");
        lllIlIIII[lllIlIIIl[1]] = llIIIlIlIlII("Mlc0JB0xFjA=", "TeDUh");
        lllIlIIII[lllIlIIIl[2]] = llIIIlIlIIll("9GEvQL+f9gw=", "zqBpk");
        lllIlIIII[lllIlIIIl[3]] = llIIIlIlIIll("1INKKDUcEDs=", "ERISV");
        lllIlIIII[lllIlIIIl[4]] = llIIIlIlIlII("Px4CJQE=", "NkgVu");
        lllIlIIII[lllIlIIIl[5]] = llIIIlIlIlIl("AhV/VpHXDZ6G0Hr43Qy/9w==", "GIeyx");
        lllIlIIII[lllIlIIIl[6]] = llIIIlIlIlII("IgMFLR0=", "OfiHx");
        lllIlIIII[lllIlIIIl[7]] = llIIIlIlIlII("Nz4RITMiIA==", "VYxMZ");
        lllIlIIII[lllIlIIIl[8]] = llIIIlIlIIll("GRn6wBSrWRiVxTfXd1fxTQ==", "BVhFw");
        lllIlIIII[lllIlIIIl[9]] = llIIIlIlIlIl("3vsuAXRWKMOolCwYy42EOA==", "SuSPf");
        lllIlIIII[lllIlIIIl[10]] = llIIIlIlIlIl("N/vsG4nW26ywYOgQ8i/FidnXIC05tCBJ", "IwmOt");
        lllIlIIII[lllIlIIIl[11]] = llIIIlIlIIll("Z6NCL5D7elF3rTsG87JeRQ==", "AKNla");
        lllIlIIII[lllIlIIIl[12]] = llIIIlIlIlII("CQYbGB4nChFRDzoWHB8KbwYBFAA8Q1UCGiYbFhkEIQhVEwwsBFUFAm8dFB8JIAIyFAw9BhsW", "Oouqm");
        lllIlIIII[lllIlIIIl[13]] = llIIIlIlIlIl("UGL7qm19iWAezGJBMDzHlrI831c3JOLu", "thmiA");
        lllIlIIII[lllIlIIIl[14]] = llIIIlIlIIll("Xv7m8JDDjW+qqanRPhJbEr7MNofHEHNj", "NLtbr");
        lllIlIIII[lllIlIIIl[19]] = llIIIlIlIlII("GjB4MSsodTU5Kj48Njd5PzQ2NDYgdT81OD95eCMuJCE7ODAjMngkNm0XDQkQAxI=", "MUXPY");
        lllIlIIII[lllIlIIIl[20]] = llIIIlIlIIll("/FG1b/xxadi1Hp6PQlyUF7RMXN1Z7HYWjLkkdC59ZdUBvoeydR5Pb42Vgt/iIUHf", "Vabbl");
        lllIlIIII[lllIlIIIl[21]] = llIIIlIlIIll("MUkubvlWXQMPWyvdz7FhfNfDLH7mSxl0lbNDlqqHKNVlCeLw+edq7o+eZWuRJPQm", "YitOg");
        lllIlIIII[lllIlIIIl[24]] = llIIIlIlIIll("mq4XhuCQ0peo4V+wW9591Y4rOf41eSDf", "RQOLC");
        lllIlIIII[lllIlIIIl[203]] = llIIIlIlIIll("kAgXvhGXgackMJEA1YA8q1cYqQoKoPAXLiZYsqtKNK/I9CpYjJI0pWv9yTLuMtZjj0CpKxbJ9Qg=", "EyJhV");
        lllIlIIII[lllIlIIIl[46]] = llIIIlIlIlIl("Hf/gxsrs8O0nr5TgQAHqZl+LwcCnb3bjh/dNixRVw9o=", "Ldgbb");
        lllIlIIII[lllIlIIIl[204]] = llIIIlIlIIll("2u2yaXaCl3M=", "AyDEa");
    }

    private static void R() {
        if (llIIIlIllIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[5])) {
            by.putAll(Map.of(Integer.valueOf(lllIlIIIl[25]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[28]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27]))));
            bD.putAll(Map.of(Integer.valueOf(lllIlIIIl[29]), Integer.valueOf(C0004e.c(lllIlIIIl[30], lllIlIIIl[31])), Integer.valueOf(lllIlIIIl[32]), Integer.valueOf(C0004e.c(lllIlIIIl[30], lllIlIIIl[31]))));
            bC.putAll(Map.of(Integer.valueOf(lllIlIIIl[33]), Integer.valueOf(C0004e.c(lllIlIIIl[34], lllIlIIIl[35]))));
            bE.putAll(Map.of(Integer.valueOf(lllIlIIIl[36]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38])), Integer.valueOf(lllIlIIIl[39]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38])), Integer.valueOf(lllIlIIIl[40]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38]))));
            bF.putAll(Map.of(Integer.valueOf(lllIlIIIl[41]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43])), Integer.valueOf(lllIlIIIl[44]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43])), Integer.valueOf(lllIlIIIl[45]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43]))));
        }
        if (llIIIlIlllll(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[5]) && llIIIlIllIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[46])) {
            by.putAll(Map.of(Integer.valueOf(lllIlIIIl[47]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27]))));
            bD.putAll(Map.of(Integer.valueOf(lllIlIIIl[48]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[32]), Integer.valueOf(C0004e.c(lllIlIIIl[30], lllIlIIIl[31]))));
            bC.putAll(Map.of(Integer.valueOf(lllIlIIIl[49]), Integer.valueOf(C0004e.c(lllIlIIIl[34], lllIlIIIl[35]))));
            bE.putAll(Map.of(Integer.valueOf(lllIlIIIl[50]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38])), Integer.valueOf(lllIlIIIl[39]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38]))));
            bF.putAll(Map.of(Integer.valueOf(lllIlIIIl[41]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43])), Integer.valueOf(lllIlIIIl[51]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43]))));
        }
        if (llIIIlIlllll(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[46]) && llIIIlIllIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[52])) {
            by.putAll(Map.of(Integer.valueOf(lllIlIIIl[53]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[47]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[54]), Integer.valueOf(C0004e.c(lllIlIIIl[55], lllIlIIIl[56]))));
            bD.putAll(Map.of(Integer.valueOf(lllIlIIIl[57]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[48]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27]))));
            bC.putAll(Map.of(Integer.valueOf(lllIlIIIl[58]), Integer.valueOf(C0004e.c(lllIlIIIl[34], lllIlIIIl[35]))));
            bE.putAll(Map.of(Integer.valueOf(lllIlIIIl[50]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38])), Integer.valueOf(lllIlIIIl[59]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38])), Integer.valueOf(lllIlIIIl[60]), Integer.valueOf(C0004e.c(lllIlIIIl[61], lllIlIIIl[62]))));
            bF.putAll(Map.of(Integer.valueOf(lllIlIIIl[63]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43])), Integer.valueOf(lllIlIIIl[51]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43])), Integer.valueOf(lllIlIIIl[64]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43]))));
        }
        if (llIIIlIlllll(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[52]) && llIIIlIllIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[65])) {
            by.putAll(Map.of(Integer.valueOf(lllIlIIIl[66]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[67]), Integer.valueOf(C0004e.c(lllIlIIIl[55], lllIlIIIl[68]))));
            bD.putAll(Map.of(Integer.valueOf(lllIlIIIl[69]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[70]), Integer.valueOf(C0004e.c(lllIlIIIl[55], lllIlIIIl[68])), Integer.valueOf(lllIlIIIl[57]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27]))));
            bC.putAll(Map.of(Integer.valueOf(lllIlIIIl[71]), Integer.valueOf(C0004e.c(lllIlIIIl[34], lllIlIIIl[35]))));
            bE.putAll(Map.of(Integer.valueOf(lllIlIIIl[72]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38])), Integer.valueOf(lllIlIIIl[59]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38])), Integer.valueOf(lllIlIIIl[73]), Integer.valueOf(C0004e.c(lllIlIIIl[74], lllIlIIIl[75])), Integer.valueOf(lllIlIIIl[76]), Integer.valueOf(C0004e.c(lllIlIIIl[74], lllIlIIIl[75]))));
            bF.putAll(Map.of(Integer.valueOf(lllIlIIIl[63]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43])), Integer.valueOf(lllIlIIIl[77]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43])), Integer.valueOf(lllIlIIIl[78]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43]))));
        }
        if (llIIIlIlllll(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[65]) && llIIIlIllIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[79])) {
            by.putAll(Map.of(Integer.valueOf(lllIlIIIl[66]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[80]), Integer.valueOf(C0004e.c(lllIlIIIl[55], lllIlIIIl[68])), Integer.valueOf(lllIlIIIl[81]), Integer.valueOf(C0004e.c(lllIlIIIl[82], lllIlIIIl[83]))));
            bD.putAll(Map.of(Integer.valueOf(lllIlIIIl[69]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[84]), Integer.valueOf(C0004e.c(lllIlIIIl[55], lllIlIIIl[68])), Integer.valueOf(lllIlIIIl[85]), Integer.valueOf(C0004e.c(lllIlIIIl[82], lllIlIIIl[83])), Integer.valueOf(lllIlIIIl[86]), Integer.valueOf(C0004e.c(lllIlIIIl[82], lllIlIIIl[83])), Integer.valueOf(lllIlIIIl[87]), Integer.valueOf(C0004e.c(lllIlIIIl[82], lllIlIIIl[83])), Integer.valueOf(lllIlIIIl[88]), Integer.valueOf(C0004e.c(lllIlIIIl[82], lllIlIIIl[83]))));
            bC.putAll(Map.of(Integer.valueOf(lllIlIIIl[89]), Integer.valueOf(C0004e.c(lllIlIIIl[90], lllIlIIIl[91]))));
            bE.putAll(Map.of(Integer.valueOf(lllIlIIIl[72]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38])), Integer.valueOf(lllIlIIIl[92]), Integer.valueOf(C0004e.c(lllIlIIIl[74], lllIlIIIl[75])), Integer.valueOf(lllIlIIIl[73]), Integer.valueOf(C0004e.c(lllIlIIIl[74], lllIlIIIl[75]))));
            bF.putAll(Map.of(Integer.valueOf(lllIlIIIl[93]), Integer.valueOf(C0004e.c(lllIlIIIl[94], lllIlIIIl[95])), Integer.valueOf(lllIlIIIl[96]), Integer.valueOf(C0004e.c(lllIlIIIl[94], lllIlIIIl[95]))));
        }
        bz.putAll(Map.of(Integer.valueOf(lllIlIIIl[97]), Integer.valueOf(C0004e.c(lllIlIIIl[98], lllIlIIIl[42])), Integer.valueOf(lllIlIIIl[99]), Integer.valueOf(C0004e.c(lllIlIIIl[98], lllIlIIIl[42])), Integer.valueOf(lllIlIIIl[100]), Integer.valueOf(C0004e.c(lllIlIIIl[101], lllIlIIIl[102])), Integer.valueOf(lllIlIIIl[103]), Integer.valueOf(C0004e.c(lllIlIIIl[98], lllIlIIIl[42]))));
        bA.putAll(Map.of(Integer.valueOf(lllIlIIIl[104]), Integer.valueOf(C0004e.c(lllIlIIIl[105], lllIlIIIl[106])), Integer.valueOf(lllIlIIIl[107]), Integer.valueOf(C0004e.c(lllIlIIIl[105], lllIlIIIl[106])), Integer.valueOf(lllIlIIIl[108]), Integer.valueOf(C0004e.c(lllIlIIIl[105], lllIlIIIl[106])), Integer.valueOf(lllIlIIIl[109]), Integer.valueOf(C0004e.c(lllIlIIIl[105], lllIlIIIl[106])), Integer.valueOf(lllIlIIIl[110]), Integer.valueOf(C0004e.c(lllIlIIIl[105], lllIlIIIl[106]))));
        bB.putAll(Map.of(Integer.valueOf(lllIlIIIl[111]), Integer.valueOf(C0004e.c(lllIlIIIl[112], lllIlIIIl[113]))));
        bG.putAll(Map.of(Integer.valueOf(lllIlIIIl[114]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116])), Integer.valueOf(lllIlIIIl[117]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116])), Integer.valueOf(lllIlIIIl[118]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116]))));
        bH.putAll(Map.of(Integer.valueOf(lllIlIIIl[119]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116])), Integer.valueOf(lllIlIIIl[120]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116])), Integer.valueOf(lllIlIIIl[121]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116])), Integer.valueOf(lllIlIIIl[122]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116]))));
        bI.putAll(Map.of(Integer.valueOf(lllIlIIIl[123]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116])), Integer.valueOf(lllIlIIIl[124]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116])), Integer.valueOf(lllIlIIIl[125]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116])), Integer.valueOf(lllIlIIIl[126]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116]))));
    }

    private static boolean llIIIlIlllIl(int i, int i2) {
        return i == i2;
    }

    private static int a(Map<Integer, Integer> map, Random random) {
        if (llIIIlIllIII(map.isEmpty() ? 1 : 0)) {
            return lllIlIIIl[0];
        }
        int nextInt = random.nextInt(map.size());
        int lllIIIlllIIII = lllIlIIIl[0];
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            if (llIIIlIlllIl(lllIIIlllIIII, nextInt)) {
                return intValue;
            }
            lllIIIlllIIII++;
            "".length();
            if ("  ".length() < ((8 ^ 70) & ((116 ^ 58) ^ (-1)))) {
                return (57 ^ 121) & ((0 ^ 64) ^ (-1));
            }
        }
        throw new IllegalStateException(lllIlIIII[lllIlIIIl[203]]);
    }

    private static boolean llIIIlIlllll(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIIlIlllII(int i) {
        return i > 0;
    }

    private static String llIIIlIlIlIl(String lllIIIlIIllII, String lllIIIlIIlIll) {
        try {
            SecretKeySpec lllIIIlIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIlIIlIll.getBytes(StandardCharsets.UTF_8)), lllIlIIIl[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlIIIl[2], lllIIIlIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIIlIIllIl) {
            lllIIIlIIllIl.printStackTrace();
            return null;
        }
    }

    private static String llIIIlIlIIll(String lllIIIIllllll, String lllIIIIlllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlIIIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIIlIIIIII) {
            lllIIIlIIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIllllI(int i, int i2) {
        return i != i2;
    }

    private static String llIIIlIlIlII(String lllIIIllIIIIl, String lllIIIllIIIII) {
        String lllIIIllIIIIl2 = new String(Base64.getDecoder().decode(lllIIIllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIIlIlllll = new StringBuilder();
        char[] charArray = lllIIIllIIIII.toCharArray();
        int lllIIIlIlllIl = lllIlIIIl[0];
        char[] charArray2 = lllIIIllIIIIl2.toCharArray();
        int length = charArray2.length;
        int i = lllIlIIIl[0];
        while (llIIIlIllIlI(i, length)) {
            lllIIIlIlllll.append((char) (charArray2[i] ^ charArray[lllIIIlIlllIl % charArray.length]));
            "".length();
            lllIIIlIlllIl++;
            i++;
            "".length();
            if (((178 ^ 147) & ((169 ^ 136) ^ (-1))) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllIIIlIlllll);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v142, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v188, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v201, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v214, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v238, types: [boolean] */
    public static void d(String str) {
        if (!llIIIlIllIII(bJ) || llIIIlIllIIl(bP)) {
            if (llIIIlIllIII(str.equalsIgnoreCase(lllIlIIII[lllIlIIIl[0]]) ? 1 : 0)) {
                R();
            }
            if (llIIIlIllIII(str.equalsIgnoreCase(lllIlIIII[lllIlIIIl[1]]) ? 1 : 0)) {
            }
            if (llIIIlIllIII(str.equalsIgnoreCase(lllIlIIII[lllIlIIIl[2]]) ? 1 : 0)) {
                V();
            }
            if (llIIIlIllIII(str.equalsIgnoreCase(lllIlIIII[lllIlIIIl[3]]) ? 1 : 0)) {
            }
            if (llIIIlIllIII(str.equalsIgnoreCase(lllIlIIII[lllIlIIIl[4]]) ? 1 : 0)) {
            }
            if (llIIIlIllIII(str.equalsIgnoreCase(lllIlIIII[lllIlIIIl[5]]) ? 1 : 0)) {
            }
            if (llIIIlIllIII(str.equalsIgnoreCase(lllIlIIII[lllIlIIIl[6]]) ? 1 : 0)) {
                S();
            }
            if (llIIIlIllIII(str.equalsIgnoreCase(lllIlIIII[lllIlIIIl[7]]) ? 1 : 0)) {
            }
            if (llIIIlIllIII(str.equalsIgnoreCase(lllIlIIII[lllIlIIIl[8]]) ? 1 : 0)) {
                U();
            }
            if (llIIIlIllIII(str.equalsIgnoreCase(lllIlIIII[lllIlIIIl[9]]) ? 1 : 0)) {
                T();
            }
            W();
            System.out.println(lllIlIIII[lllIlIIIl[10]]);
            System.out.println("Helm: " + bJ + ", Price: " + bU);
            System.out.println("Amulet: " + bK + ", Price: " + bV);
            System.out.println("Cape: " + bL + ", Price: " + bW);
            System.out.println("Ammo: " + bM + ", Price: " + bX);
            System.out.println("Weapon: " + bN + ", Price: " + bY);
            System.out.println("Shield: " + bO + ", Price: " + bZ);
            System.out.println("Body: " + bP + ", Price: " + ca);
            System.out.println("Legs: " + bQ + ", Price: " + cb);
            System.out.println("Gloves: " + bR + ", Price: " + cc);
            System.out.println("Boots: " + bS + ", Price: " + cd);
            System.out.println("Ring: " + bT + ", Price: " + ce);
        }
        if (llIIIlIllIII(bJ) && llIIIlIllIII(bP)) {
            if (llIIIlIllIII(bv ? 1 : 0)) {
                AccBuilderGWD.c = lllIlIIII[lllIlIIIl[11]];
                C0001b.a(bx);
                if (llIIIlIllIlI(bx.size(), lllIlIIIl[1])) {
                    System.out.println(lllIlIIII[lllIlIIIl[12]]);
                    bv = lllIlIIIl[0];
                }
            }
            if (llIIIlIllIIl(bv ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIIlIllIll(nearest) && llIIIlIllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlIIII[lllIlIIIl[13]];
                    C0000a.a(nearest);
                }
                if (llIIIlIllIll(nearest) && llIIIlIllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlIIII[lllIlIIIl[14]];
                    if (llIIIlIllIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIlIIIl[15]);
                        "".length();
                    }
                    if (llIIIlIllIII(Bank.isOpen() ? 1 : 0)) {
                        if (llIIIlIlllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIlIIIl[4]);
                            "".length();
                        }
                        if (llIIIlIlllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIlIIIl[2]);
                            "".length();
                        }
                        if (llIIIlIlllIl(bT, lllIlIIIl[16])) {
                            int[] iArr = new int[lllIlIIIl[1]];
                            iArr[lllIlIIIl[0]] = lllIlIIIl[17];
                            if (llIIIlIllIIl(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lllIlIIIl[1]];
                                iArr2[lllIlIIIl[0]] = lllIlIIIl[16];
                                if (llIIIlIllIIl(Bank.contains(iArr2) ? 1 : 0)) {
                                    int[] iArr3 = new int[lllIlIIIl[1]];
                                    iArr3[lllIlIIIl[0]] = lllIlIIIl[18];
                                    if (llIIIlIllIIl(Bank.contains(iArr3) ? 1 : 0)) {
                                        Q();
                                        System.out.println(lllIlIIII[lllIlIIIl[19]]);
                                        bv = lllIlIIIl[1];
                                        return;
                                    }
                                }
                            }
                            int[] iArr4 = new int[lllIlIIIl[10]];
                            iArr4[lllIlIIIl[0]] = bJ;
                            iArr4[lllIlIIIl[1]] = bK;
                            iArr4[lllIlIIIl[2]] = bL;
                            iArr4[lllIlIIIl[3]] = bM;
                            iArr4[lllIlIIIl[4]] = bN;
                            iArr4[lllIlIIIl[5]] = bO;
                            iArr4[lllIlIIIl[6]] = bP;
                            iArr4[lllIlIIIl[7]] = bQ;
                            iArr4[lllIlIIIl[8]] = bR;
                            iArr4[lllIlIIIl[9]] = bS;
                            if (llIIIlIllIIl(d(iArr4) ? 1 : 0)) {
                                Q();
                                System.out.println(lllIlIIII[lllIlIIIl[20]]);
                                bv = lllIlIIIl[1];
                                return;
                            }
                        }
                        if (llIIIlIllllI(bT, lllIlIIIl[16])) {
                            int[] iArr5 = new int[lllIlIIIl[11]];
                            iArr5[lllIlIIIl[0]] = bJ;
                            iArr5[lllIlIIIl[1]] = bK;
                            iArr5[lllIlIIIl[2]] = bL;
                            iArr5[lllIlIIIl[3]] = bM;
                            iArr5[lllIlIIIl[4]] = bN;
                            iArr5[lllIlIIIl[5]] = bO;
                            iArr5[lllIlIIIl[6]] = bP;
                            iArr5[lllIlIIIl[7]] = bQ;
                            iArr5[lllIlIIIl[8]] = bR;
                            iArr5[lllIlIIIl[9]] = bS;
                            iArr5[lllIlIIIl[10]] = bT;
                            if (llIIIlIllIIl(d(iArr5) ? 1 : 0)) {
                                Q();
                                System.out.println(lllIlIIII[lllIlIIIl[21]]);
                                bv = lllIlIIIl[1];
                                return;
                            }
                        }
                        if (llIIIlIllIII(n(bT) ? 1 : 0)) {
                            int[] iArr6 = new int[lllIlIIIl[11]];
                            iArr6[lllIlIIIl[0]] = bJ;
                            iArr6[lllIlIIIl[1]] = bK;
                            iArr6[lllIlIIIl[2]] = bL;
                            iArr6[lllIlIIIl[3]] = bM;
                            iArr6[lllIlIIIl[4]] = bN;
                            iArr6[lllIlIIIl[5]] = bO;
                            iArr6[lllIlIIIl[6]] = bP;
                            iArr6[lllIlIIIl[7]] = bQ;
                            iArr6[lllIlIIIl[8]] = bR;
                            iArr6[lllIlIIIl[9]] = bS;
                            iArr6[lllIlIIIl[10]] = bT;
                            if (llIIIlIlllIl(bT, lllIlIIIl[16])) {
                                int[] iArr7 = new int[lllIlIIIl[1]];
                                iArr7[lllIlIIIl[0]] = lllIlIIIl[16];
                                if (llIIIlIllIIl(Bank.contains(iArr7) ? 1 : 0)) {
                                    int[] iArr8 = new int[lllIlIIIl[1]];
                                    iArr8[lllIlIIIl[0]] = lllIlIIIl[17];
                                    if (llIIIlIllIII(Bank.contains(iArr8) ? 1 : 0)) {
                                        C0000a.a(lllIlIIIl[17], lllIlIIIl[1]);
                                    }
                                }
                                int[] iArr9 = new int[lllIlIIIl[1]];
                                iArr9[lllIlIIIl[0]] = lllIlIIIl[16];
                                if (llIIIlIllIIl(Bank.contains(iArr9) ? 1 : 0)) {
                                    int[] iArr10 = new int[lllIlIIIl[1]];
                                    iArr10[lllIlIIIl[0]] = lllIlIIIl[17];
                                    if (llIIIlIllIIl(Bank.contains(iArr10) ? 1 : 0)) {
                                        int[] iArr11 = new int[lllIlIIIl[1]];
                                        iArr11[lllIlIIIl[0]] = lllIlIIIl[17];
                                        if (llIIIlIllIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                                            int[] iArr12 = new int[lllIlIIIl[1]];
                                            iArr12[lllIlIIIl[0]] = lllIlIIIl[18];
                                            if (llIIIlIllIII(Bank.contains(iArr12) ? 1 : 0)) {
                                                C0000a.a(lllIlIIIl[18], lllIlIIIl[1]);
                                            }
                                        }
                                    }
                                }
                            }
                            C0000a.a(iArr6, lllIlIIIl[1]);
                            Time.sleepTicks(C0004e.c(lllIlIIIl[10], lllIlIIIl[14]));
                            "".length();
                            if (llIIIlIllIII(Bank.isOpen() ? 1 : 0)) {
                                Bank.close();
                                Time.sleepTicks(C0004e.c(lllIlIIIl[3], lllIlIIIl[5]));
                                "".length();
                            }
                            do {
                                if (llIIIlIllIIl(Inventory.contains(iArr6) ? 1 : 0) && !llIIIlIllIII(Inventory.contains(item -> {
                                    if (llIIIlIllIII(item.getName().contains(lllIlIIII[lllIlIIIl[204]]) ? 1 : 0) && llIIIlIllIIl(item.isNoted() ? 1 : 0)) {
                                        ?? r0 = lllIlIIIl[1];
                                        "".length();
                                        return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lllIlIIIl[0];
                                }) ? 1 : 0)) {
                                    if (llIIIlIllIIl(Bank.isOpen() ? 1 : 0)) {
                                        C0000a.a();
                                        Time.sleepUntil(() -> {
                                            return Bank.isOpen();
                                        }, lllIlIIIl[15]);
                                        "".length();
                                        Time.sleepTicks(lllIlIIIl[4]);
                                        "".length();
                                        System.out.println(lllIlIIII[lllIlIIIl[24]]);
                                        bw = lllIlIIIl[1];
                                        return;
                                    }
                                    return;
                                }
                                C0004e.l(bJ);
                                C0004e.l(bK);
                                C0004e.l(bL);
                                C0004e.l(bM);
                                Time.sleepTicks(lllIlIIIl[1]);
                                "".length();
                                C0004e.l(bN);
                                C0004e.l(bO);
                                C0004e.l(bP);
                                Time.sleepTicks(lllIlIIIl[1]);
                                "".length();
                                C0004e.l(bQ);
                                C0004e.l(bR);
                                C0004e.l(bS);
                                C0004e.l(bT);
                                Time.sleepTicks(lllIlIIIl[1]);
                                "".length();
                                C0004e.l(lllIlIIIl[16]);
                                C0004e.l(lllIlIIIl[17]);
                                C0004e.l(lllIlIIIl[18]);
                                C0004e.l(lllIlIIIl[22]);
                                C0004e.l(lllIlIIIl[23]);
                                "".length();
                            } while (((true ^ true) & ((true ^ true) ^ true)) == ((true ^ true) & ((true ^ true) ^ true)));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean d(int[] iArr) {
        int lllIIIllllllI = lllIlIIIl[0];
        while (llIIIlIllIlI(lllIIIllllllI, iArr.length)) {
            if (llIIIlIlllII(iArr[lllIIIllllllI])) {
                int[] iArr2 = new int[lllIlIIIl[1]];
                iArr2[lllIlIIIl[0]] = iArr[lllIIIllllllI];
                if (llIIIlIllIIl(Bank.contains(iArr2) ? 1 : 0)) {
                    System.out.println("Missing ID: " + iArr[lllIIIllllllI]);
                    return lllIlIIIl[0];
                }
            }
            lllIIIllllllI++;
            "".length();
            if ((-" ".length()) > ((31 ^ 88) ^ (204 ^ 143))) {
                return ((135 ^ 176) ^ (75 ^ 80)) & (((((119 + 8) - 60) + 115) ^ (((48 + 2) - 2) + 106)) ^ (-" ".length()));
            }
        }
        return lllIlIIIl[1];
    }

    private static void S() {
        if (llIIIlIllIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[5])) {
            by.putAll(Map.of(Integer.valueOf(lllIlIIIl[25]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27]))));
            bD.putAll(Map.of(Integer.valueOf(lllIlIIIl[29]), Integer.valueOf(C0004e.c(lllIlIIIl[30], lllIlIIIl[31])), Integer.valueOf(lllIlIIIl[32]), Integer.valueOf(C0004e.c(lllIlIIIl[30], lllIlIIIl[31]))));
            bC.putAll(Map.of(Integer.valueOf(lllIlIIIl[33]), Integer.valueOf(C0004e.c(lllIlIIIl[34], lllIlIIIl[35]))));
            bE.putAll(Map.of(Integer.valueOf(lllIlIIIl[36]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38])), Integer.valueOf(lllIlIIIl[39]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38])), Integer.valueOf(lllIlIIIl[40]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38]))));
            bF.putAll(Map.of(Integer.valueOf(lllIlIIIl[41]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43])), Integer.valueOf(lllIlIIIl[44]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43])), Integer.valueOf(lllIlIIIl[45]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43]))));
        }
        if (llIIIlIlllll(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[5]) && llIIIlIllIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[46])) {
            by.putAll(Map.of(Integer.valueOf(lllIlIIIl[47]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27]))));
            bD.putAll(Map.of(Integer.valueOf(lllIlIIIl[48]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[32]), Integer.valueOf(C0004e.c(lllIlIIIl[30], lllIlIIIl[31]))));
            bC.putAll(Map.of(Integer.valueOf(lllIlIIIl[49]), Integer.valueOf(C0004e.c(lllIlIIIl[34], lllIlIIIl[35]))));
            bE.putAll(Map.of(Integer.valueOf(lllIlIIIl[50]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38])), Integer.valueOf(lllIlIIIl[39]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38]))));
            bF.putAll(Map.of(Integer.valueOf(lllIlIIIl[41]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43])), Integer.valueOf(lllIlIIIl[51]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43]))));
        }
        if (llIIIlIlllll(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[46]) && llIIIlIllIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[52])) {
            by.putAll(Map.of(Integer.valueOf(lllIlIIIl[53]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[47]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[54]), Integer.valueOf(C0004e.c(lllIlIIIl[55], lllIlIIIl[56]))));
            bD.putAll(Map.of(Integer.valueOf(lllIlIIIl[57]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[48]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[127]), Integer.valueOf(C0004e.c(lllIlIIIl[55], lllIlIIIl[56]))));
            bC.putAll(Map.of(Integer.valueOf(lllIlIIIl[58]), Integer.valueOf(C0004e.c(lllIlIIIl[34], lllIlIIIl[35]))));
            bE.putAll(Map.of(Integer.valueOf(lllIlIIIl[50]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38])), Integer.valueOf(lllIlIIIl[59]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38])), Integer.valueOf(lllIlIIIl[60]), Integer.valueOf(C0004e.c(lllIlIIIl[61], lllIlIIIl[62]))));
            bF.putAll(Map.of(Integer.valueOf(lllIlIIIl[63]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43])), Integer.valueOf(lllIlIIIl[51]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43])), Integer.valueOf(lllIlIIIl[64]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43]))));
        }
        if (llIIIlIlllll(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[52]) && llIIIlIllIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[65])) {
            by.putAll(Map.of(Integer.valueOf(lllIlIIIl[66]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[67]), Integer.valueOf(C0004e.c(lllIlIIIl[55], lllIlIIIl[68]))));
            bD.putAll(Map.of(Integer.valueOf(lllIlIIIl[69]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[70]), Integer.valueOf(C0004e.c(lllIlIIIl[55], lllIlIIIl[68])), Integer.valueOf(lllIlIIIl[57]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27]))));
            bC.putAll(Map.of(Integer.valueOf(lllIlIIIl[71]), Integer.valueOf(C0004e.c(lllIlIIIl[34], lllIlIIIl[35]))));
            bE.putAll(Map.of(Integer.valueOf(lllIlIIIl[72]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38])), Integer.valueOf(lllIlIIIl[59]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38])), Integer.valueOf(lllIlIIIl[73]), Integer.valueOf(C0004e.c(lllIlIIIl[74], lllIlIIIl[75])), Integer.valueOf(lllIlIIIl[76]), Integer.valueOf(C0004e.c(lllIlIIIl[74], lllIlIIIl[75]))));
            bF.putAll(Map.of(Integer.valueOf(lllIlIIIl[63]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43])), Integer.valueOf(lllIlIIIl[77]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43])), Integer.valueOf(lllIlIIIl[78]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43]))));
        }
        if (llIIIlIlllll(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[65]) && llIIIlIllIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[79])) {
            by.putAll(Map.of(Integer.valueOf(lllIlIIIl[66]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[80]), Integer.valueOf(C0004e.c(lllIlIIIl[55], lllIlIIIl[68])), Integer.valueOf(lllIlIIIl[128]), Integer.valueOf(C0004e.c(lllIlIIIl[82], lllIlIIIl[83]))));
            bD.putAll(Map.of(Integer.valueOf(lllIlIIIl[69]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[84]), Integer.valueOf(C0004e.c(lllIlIIIl[55], lllIlIIIl[68])), Integer.valueOf(lllIlIIIl[85]), Integer.valueOf(C0004e.c(lllIlIIIl[82], lllIlIIIl[83]))));
            bC.putAll(Map.of(Integer.valueOf(lllIlIIIl[89]), Integer.valueOf(C0004e.c(lllIlIIIl[90], lllIlIIIl[91]))));
            bE.putAll(Map.of(Integer.valueOf(lllIlIIIl[72]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38])), Integer.valueOf(lllIlIIIl[92]), Integer.valueOf(C0004e.c(lllIlIIIl[74], lllIlIIIl[75])), Integer.valueOf(lllIlIIIl[73]), Integer.valueOf(C0004e.c(lllIlIIIl[74], lllIlIIIl[75])), Integer.valueOf(lllIlIIIl[76]), Integer.valueOf(C0004e.c(lllIlIIIl[74], lllIlIIIl[75]))));
            bF.putAll(Map.of(Integer.valueOf(lllIlIIIl[93]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43])), Integer.valueOf(lllIlIIIl[77]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43])), Integer.valueOf(lllIlIIIl[96]), Integer.valueOf(C0004e.c(lllIlIIIl[94], lllIlIIIl[95]))));
        }
        bz.putAll(Map.of(Integer.valueOf(lllIlIIIl[129]), Integer.valueOf(C0004e.c(lllIlIIIl[98], lllIlIIIl[42])), Integer.valueOf(lllIlIIIl[97]), Integer.valueOf(C0004e.c(lllIlIIIl[98], lllIlIIIl[42])), Integer.valueOf(lllIlIIIl[99]), Integer.valueOf(C0004e.c(lllIlIIIl[98], lllIlIIIl[42])), Integer.valueOf(lllIlIIIl[100]), Integer.valueOf(C0004e.c(lllIlIIIl[101], lllIlIIIl[102])), Integer.valueOf(lllIlIIIl[103]), Integer.valueOf(C0004e.c(lllIlIIIl[98], lllIlIIIl[42]))));
        bA.putAll(Map.of(Integer.valueOf(lllIlIIIl[104]), Integer.valueOf(C0004e.c(lllIlIIIl[105], lllIlIIIl[106])), Integer.valueOf(lllIlIIIl[107]), Integer.valueOf(C0004e.c(lllIlIIIl[105], lllIlIIIl[106])), Integer.valueOf(lllIlIIIl[108]), Integer.valueOf(C0004e.c(lllIlIIIl[105], lllIlIIIl[106])), Integer.valueOf(lllIlIIIl[109]), Integer.valueOf(C0004e.c(lllIlIIIl[105], lllIlIIIl[106])), Integer.valueOf(lllIlIIIl[110]), Integer.valueOf(C0004e.c(lllIlIIIl[105], lllIlIIIl[106]))));
        bB.putAll(Map.of(Integer.valueOf(lllIlIIIl[130]), Integer.valueOf(C0004e.c(lllIlIIIl[131], lllIlIIIl[132])), Integer.valueOf(lllIlIIIl[133]), Integer.valueOf(C0004e.c(lllIlIIIl[131], lllIlIIIl[132])), Integer.valueOf(lllIlIIIl[134]), Integer.valueOf(C0004e.c(lllIlIIIl[131], lllIlIIIl[132])), Integer.valueOf(lllIlIIIl[135]), Integer.valueOf(C0004e.c(lllIlIIIl[131], lllIlIIIl[132]))));
        bG.putAll(Map.of(Integer.valueOf(lllIlIIIl[136]), Integer.valueOf(C0004e.c(lllIlIIIl[137], lllIlIIIl[68]))));
        bH.putAll(Map.of(Integer.valueOf(lllIlIIIl[119]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116])), Integer.valueOf(lllIlIIIl[138]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116])), Integer.valueOf(lllIlIIIl[139]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116])), Integer.valueOf(lllIlIIIl[140]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116])), Integer.valueOf(lllIlIIIl[141]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116]))));
        if (llIIIlIlllll(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[5]) && llIIIlIllIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[46])) {
            bH.putAll(Map.of(Integer.valueOf(lllIlIIIl[142]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116]))));
        }
        if (llIIIlIlllll(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[46]) && llIIIlIllIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[52])) {
            bH.putAll(Map.of(Integer.valueOf(lllIlIIIl[143]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116]))));
        }
        if (llIIIlIlllll(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[65]) && llIIIlIllIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIIl[79])) {
            bH.putAll(Map.of(Integer.valueOf(lllIlIIIl[144]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116]))));
        }
        bI.putAll(Map.of(Integer.valueOf(lllIlIIIl[16]), Integer.valueOf(C0004e.c(lllIlIIIl[145], lllIlIIIl[146]))));
    }

    static {
        llIIIlIlIlll();
        llIIIlIlIllI();
        bx = new ArrayList();
        by = new HashMap();
        bz = new HashMap();
        bA = new HashMap();
        bB = new HashMap();
        bC = new HashMap();
        bD = new HashMap();
        bE = new HashMap();
        bF = new HashMap();
        bG = new HashMap();
        bH = new HashMap();
        bI = new HashMap();
    }

    private static void V() {
        by.putAll(Map.of(Integer.valueOf(lllIlIIIl[184]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[185]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27])), Integer.valueOf(lllIlIIIl[186]), Integer.valueOf(C0004e.c(lllIlIIIl[187], lllIlIIIl[98])), Integer.valueOf(lllIlIIIl[188]), Integer.valueOf(C0004e.c(lllIlIIIl[187], lllIlIIIl[98])), Integer.valueOf(lllIlIIIl[189]), Integer.valueOf(C0004e.c(lllIlIIIl[187], lllIlIIIl[98])), Integer.valueOf(lllIlIIIl[190]), Integer.valueOf(C0004e.c(lllIlIIIl[187], lllIlIIIl[98])), Integer.valueOf(lllIlIIIl[191]), Integer.valueOf(C0004e.c(lllIlIIIl[187], lllIlIIIl[98])), Integer.valueOf(lllIlIIIl[192]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[146])), Integer.valueOf(lllIlIIIl[193]), Integer.valueOf(C0004e.c(lllIlIIIl[26], lllIlIIIl[27]))));
        by.putAll(Map.of(Integer.valueOf(lllIlIIIl[25]), Integer.valueOf(C0004e.c(lllIlIIIl[187], lllIlIIIl[98])), Integer.valueOf(lllIlIIIl[194]), Integer.valueOf(C0004e.c(lllIlIIIl[187], lllIlIIIl[98])), Integer.valueOf(lllIlIIIl[195]), Integer.valueOf(C0004e.c(lllIlIIIl[187], lllIlIIIl[98]))));
        bz.putAll(Map.of(Integer.valueOf(lllIlIIIl[97]), Integer.valueOf(C0004e.c(lllIlIIIl[98], lllIlIIIl[42])), Integer.valueOf(lllIlIIIl[99]), Integer.valueOf(C0004e.c(lllIlIIIl[98], lllIlIIIl[42])), Integer.valueOf(lllIlIIIl[196]), Integer.valueOf(C0004e.c(lllIlIIIl[98], lllIlIIIl[42]))));
        bA.putAll(Map.of(Integer.valueOf(lllIlIIIl[104]), Integer.valueOf(C0004e.c(lllIlIIIl[105], lllIlIIIl[106])), Integer.valueOf(lllIlIIIl[107]), Integer.valueOf(C0004e.c(lllIlIIIl[105], lllIlIIIl[106])), Integer.valueOf(lllIlIIIl[108]), Integer.valueOf(C0004e.c(lllIlIIIl[105], lllIlIIIl[106])), Integer.valueOf(lllIlIIIl[109]), Integer.valueOf(C0004e.c(lllIlIIIl[105], lllIlIIIl[106])), Integer.valueOf(lllIlIIIl[110]), Integer.valueOf(C0004e.c(lllIlIIIl[105], lllIlIIIl[106]))));
        bB.putAll(Map.of());
        bC.putAll(Map.of(Integer.valueOf(lllIlIIIl[197]), Integer.valueOf(C0004e.c(lllIlIIIl[34], lllIlIIIl[35]))));
        bE.putAll(Map.of(Integer.valueOf(lllIlIIIl[198]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38])), Integer.valueOf(lllIlIIIl[199]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38])), Integer.valueOf(lllIlIIIl[200]), Integer.valueOf(C0004e.c(lllIlIIIl[37], lllIlIIIl[38]))));
        bF.putAll(Map.of(Integer.valueOf(lllIlIIIl[201]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43])), Integer.valueOf(lllIlIIIl[202]), Integer.valueOf(C0004e.c(lllIlIIIl[42], lllIlIIIl[43]))));
        bG.putAll(Map.of(Integer.valueOf(lllIlIIIl[114]), Integer.valueOf(C0004e.c(lllIlIIIl[137], lllIlIIIl[68])), Integer.valueOf(lllIlIIIl[118]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116])), Integer.valueOf(lllIlIIIl[117]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116]))));
        bH.putAll(Map.of(Integer.valueOf(lllIlIIIl[119]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116])), Integer.valueOf(lllIlIIIl[121]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116])), Integer.valueOf(lllIlIIIl[122]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116])), Integer.valueOf(lllIlIIIl[120]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116]))));
        bI.putAll(Map.of(Integer.valueOf(lllIlIIIl[123]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116])), Integer.valueOf(lllIlIIIl[125]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116])), Integer.valueOf(lllIlIIIl[126]), Integer.valueOf(C0004e.c(lllIlIIIl[115], lllIlIIIl[116]))));
    }

    private static boolean llIIIlIllIlI(int i, int i2) {
        return i < i2;
    }
}
