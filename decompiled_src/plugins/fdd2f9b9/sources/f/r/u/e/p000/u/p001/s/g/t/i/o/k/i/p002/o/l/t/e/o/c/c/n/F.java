package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.F  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/F.class */
public class F implements G {
    private static /* synthetic */ String[] lIIIlIIlII;
    private static final /* synthetic */ WorldPoint it;
    static /* synthetic */ int ck;
    static /* synthetic */ boolean cl;
    public static /* synthetic */ List<C0003d> bv;
    private static final /* synthetic */ WorldPoint iv;
    private static /* synthetic */ int[] lIIIlIIlll;
    public static final /* synthetic */ String[] ip;
    private static final /* synthetic */ WorldPoint iu;
    public static /* synthetic */ long g;
    static /* synthetic */ int bT;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ WorldPoint is;
    private static final /* synthetic */ WorldPoint iq;
    private static final /* synthetic */ WorldPoint ir;

    private static String lllIlIIIllll(String lIlIIllIllIl, String lIlIIllIllII) {
        try {
            SecretKeySpec lIlIIlllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlIIlll[3], lIlIIlllIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIllIlllI) {
            lIlIIllIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIlIIlIl(int i) {
        return i > 0;
    }

    private static void lllIlIIllllI() {
        lIIIlIIlll = new int[89];
        lIIIlIIlll[0] = ((231 ^ 191) ^ (200 ^ 184)) & (((((8 + 235) - 54) + 50) ^ (((124 + 154) - 191) + 112)) ^ (-" ".length()));
        lIIIlIIlll[1] = " ".length();
        lIIIlIIlll[2] = (102 ^ 56) ^ (67 ^ 91);
        lIIIlIIlll[3] = "  ".length();
        lIIIlIIlll[4] = (-19969) & 20347;
        lIIIlIIlll[5] = "   ".length();
        lIIIlIIlll[6] = 32 ^ 36;
        lIIIlIIlll[7] = 33 ^ 36;
        lIIIlIIlll[8] = (-(18 ^ 69)) & (-11266) & 16351;
        lIIIlIIlll[9] = 173 ^ 171;
        lIIIlIIlll[10] = (-((-25218) & 29623)) & (-1) & 16383;
        lIIIlIIlll[11] = (-((-10001) & 26390)) & (-8339) & 32735;
        lIIIlIIlll[12] = (-3205) & 15829;
        lIIIlIIlll[13] = (-(29 ^ 4)) & (-8225) & 16255;
        lIIIlIIlll[14] = (-1030) & 1981;
        lIIIlIIlll[15] = 50 ^ 56;
        lIIIlIIlll[16] = (-((-16857) & 25083)) & (-16517) & 32751;
        lIIIlIIlll[17] = (165 ^ 185) ^ (116 ^ 111);
        lIIIlIIlll[18] = (((31 + 70) - 4) + 81) ^ (((147 + 174) - 138) + 3);
        lIIIlIIlll[19] = 19 ^ 26;
        lIIIlIIlll[20] = (((29 + 106) - 1) + 4) ^ (((67 + 85) - 46) + 23);
        lIIIlIIlll[21] = 152 ^ 148;
        lIIIlIIlll[22] = 179 ^ 190;
        lIIIlIIlll[23] = 74 ^ 68;
        lIIIlIIlll[24] = (50 ^ 59) ^ (93 ^ 91);
        lIIIlIIlll[25] = 126 ^ 110;
        lIIIlIIlll[26] = 27 ^ 10;
        lIIIlIIlll[27] = 20 ^ 6;
        lIIIlIIlll[28] = 215 ^ 196;
        lIIIlIIlll[29] = (((35 + 103) - 19) + 65) ^ (((78 + 117) - 58) + 35);
        lIIIlIIlll[30] = 61 ^ 40;
        lIIIlIIlll[31] = (((53 + 101) - 31) + 20) ^ (((48 + 140) - 147) + 112);
        lIIIlIIlll[32] = (63 ^ 83) ^ (111 ^ 20);
        lIIIlIIlll[33] = 160 ^ 184;
        lIIIlIIlll[34] = 145 ^ 136;
        lIIIlIIlll[35] = (((79 + 21) - 41) + 69) ^ (((153 + 62) - 109) + 48);
        lIIIlIIlll[36] = (((107 + 9) - (-15)) + 51) ^ (((124 + 161) - 112) + 0);
        lIIIlIIlll[37] = 136 ^ 148;
        lIIIlIIlll[38] = (-((-29325) & 30670)) & (-8349) & 32765;
        lIIIlIIlll[39] = ((44 + 228) - 122) + 90;
        lIIIlIIlll[40] = (87 ^ 19) ^ (109 ^ 52);
        lIIIlIIlll[41] = 56 ^ 38;
        lIIIlIIlll[42] = (61 ^ 113) ^ (70 ^ 21);
        lIIIlIIlll[43] = (((111 + 111) - 191) + 124) ^ (((125 + 63) - 50) + 49);
        lIIIlIIlll[44] = 184 ^ 153;
        lIIIlIIlll[45] = (106 ^ 100) ^ (79 ^ 99);
        lIIIlIIlll[46] = (-16611) & 32510;
        lIIIlIIlll[47] = (-(((85 + 125) - 18) + 3)) & (-26626) & 32719;
        lIIIlIIlll[48] = 15 ^ 56;
        lIIIlIIlll[49] = (-((-2194) & 11421)) & (-4609) & 14335;
        lIIIlIIlll[50] = (-16402) & 28381;
        lIIIlIIlll[51] = (-((-1211) & 5374)) & (-1) & 29163;
        lIIIlIIlll[52] = (-((-6921) & 31643)) & (-6145) & 32766;
        lIIIlIIlll[53] = 191 ^ 151;
        lIIIlIIlll[54] = 89 ^ 61;
        lIIIlIIlll[55] = (78 ^ 111) ^ "  ".length();
        lIIIlIIlll[56] = 22 ^ 50;
        lIIIlIIlll[57] = 105 ^ 76;
        lIIIlIIlll[58] = 116 ^ 82;
        lIIIlIIlll[59] = (((115 + 53) - 63) + 84) ^ (((68 + 143) - 115) + 58);
        lIIIlIIlll[60] = 147 ^ 186;
        lIIIlIIlll[61] = 162 ^ 136;
        lIIIlIIlll[62] = 175 ^ 132;
        lIIIlIIlll[63] = 32 ^ 12;
        lIIIlIIlll[64] = 42 ^ 7;
        lIIIlIIlll[65] = (((189 + 139) - 232) + 95) ^ (((24 + 120) - 94) + 95);
        lIIIlIIlll[66] = (40 ^ 119) ^ (34 ^ 82);
        lIIIlIIlll[67] = (40 ^ 70) ^ (204 ^ 146);
        lIIIlIIlll[68] = (11 ^ 48) ^ (41 ^ 35);
        lIIIlIIlll[69] = (161 ^ 194) ^ (38 ^ 119);
        lIIIlIIlll[70] = 48 ^ 3;
        lIIIlIIlll[71] = (53 ^ 126) ^ (((111 + 45) - 107) + 78);
        lIIIlIIlll[72] = 240 ^ 197;
        lIIIlIIlll[73] = 143 ^ 185;
        lIIIlIIlll[74] = (111 ^ 98) ^ (51 ^ 6);
        lIIIlIIlll[75] = 60 ^ 5;
        lIIIlIIlll[76] = (-((-19357) & 31743)) & (-16641) & 32255;
        lIIIlIIlll[77] = (-4168) & 7407;
        lIIIlIIlll[78] = (-((-3741) & 32733)) & (-546) & 32767;
        lIIIlIIlll[79] = (-8981) & 12189;
        lIIIlIIlll[80] = (-12569) & 15771;
        lIIIlIIlll[81] = (-17170) & 20381;
        lIIIlIIlll[82] = (-12881) & 15989;
        lIIIlIIlll[83] = (-((-8202) & 28735)) & (-777) & 24573;
        lIIIlIIlll[84] = (-((-3090) & 28379)) & (-49) & 28415;
        lIIIlIIlll[85] = (-20481) & 23739;
        lIIIlIIlll[86] = (-24577) & 27630;
        lIIIlIIlll[87] = (-((-19586) & 27843)) & (-4609) & 16111;
        lIIIlIIlll[88] = 118 ^ 76;
    }

    private static String lllIlIIlIIIl(String lIlIIllllIlI, String lIlIIllllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIllllIIl.getBytes(StandardCharsets.UTF_8)), lIIIlIIlll[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlIIlll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIllllIll) {
            lIlIIllllIll.printStackTrace();
            return null;
        }
    }

    private static int lllIlIIlllll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void af() {
        int[] iArr = new int[lIIIlIIlll[1]];
        iArr[lIIIlIIlll[0]] = lIIIlIIlll[10];
        if (lllIlIlIIIll(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIIlll[10], lIIIlIIlll[1], lIIIlIIlll[46]));
            "".length();
        }
        int[] iArr2 = new int[lIIIlIIlll[1]];
        iArr2[lIIIlIIlll[0]] = lIIIlIIlll[14];
        if (lllIlIlIIIll(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIIlll[14], lIIIlIIlll[1], lIIIlIIlll[47]));
            "".length();
        }
        int[] iArr3 = new int[lIIIlIIlll[1]];
        iArr3[lIIIlIIlll[0]] = lIIIlIIlll[4];
        if (lllIlIlIIIll(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIIlll[4], lIIIlIIlll[48], lIIIlIIlll[49]));
            "".length();
        }
        if (lllIlIlIIIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIlIIlII[lIIIlIIlll[56]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIIlll[50], lIIIlIIlll[7], lIIIlIIlll[51]));
            "".length();
        }
        int[] iArr4 = new int[lIIIlIIlll[1]];
        iArr4[lIIIlIIlll[0]] = lIIIlIIlll[11];
        if (lllIlIlIIIll(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIIlll[11], lIIIlIIlll[15], lIIIlIIlll[52]));
            "".length();
        }
        int[] iArr5 = new int[lIIIlIIlll[1]];
        iArr5[lIIIlIIlll[0]] = lIIIlIIlll[16];
        if (lllIlIlIIIll(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIIlll[16], lIIIlIIlll[15], lIIIlIIlll[52]));
            "".length();
        }
        int[] iArr6 = new int[lIIIlIIlll[1]];
        iArr6[lIIIlIIlll[0]] = lIIIlIIlll[13];
        if (lllIlIlIIIll(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIIlll[13], lIIIlIIlll[53], lIIIlIIlll[52]));
            "".length();
        }
        int[] iArr7 = new int[lIIIlIIlll[1]];
        iArr7[lIIIlIIlll[0]] = lIIIlIIlll[12];
        if (lllIlIlIIIll(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIIlll[12], lIIIlIIlll[7], C0008i.bq));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIIlIIlll[0];
    }

    private static boolean lllIlIlIIlII(int i) {
        return i < 0;
    }

    private static boolean lllIlIlIIlll(int i, int i2) {
        return i > i2;
    }

    private static boolean lllIlIlIlIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lllIlIlIIllI(Object obj) {
        return obj != null;
    }

    private static boolean lllIlIlIlIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lllIlIlIIIlI(int i, int i2) {
        return i < i2;
    }

    private static int lllIlIlIIIII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static void lllIlIIlllIl() {
        lIIIlIIlII = new String[lIIIlIIlll[88]];
        lIIIlIIlII[lIIIlIIlll[0]] = lllIlIIIlllI("Ej8IIAw3ahg9Bz05", "PJqIb");
        lIIIlIIlII[lIIIlIIlll[1]] = lllIlIIIllll("pYHql/OywHORQsGqezMrqQxYSAJQ3WJD9xPD68WUSQxWZwmMsuDKwRRT/9WPWOGS", "obtih");
        lIIIlIIlII[lIIIlIIlll[3]] = lllIlIIlIIIl("Q7IcFNC4Veo=", "JlNBX");
        lIIIlIIlII[lIIIlIIlll[5]] = lllIlIIlIIIl("9naQ+XW1IbM=", "HwUrM");
        lIIIlIIlII[lIIIlIIlll[6]] = lllIlIIIlllI("IzADbRsCcRcsAQY=", "mQuMo");
        lIIIlIIlII[lIIIlIIlll[7]] = lllIlIIIllll("tEBwyT32WtLGvDA/aXrHn0RstUVZ26M5", "Jquxo");
        lIIIlIIlII[lIIIlIIlll[9]] = lllIlIIlIIIl("NkKF1kJBn5j0ri06uLeisiF/JCit0evOgrC2SfvtTsiAFL8KQQ9ZV6mFYEXyDXuzyHOVzfhSn78=", "LIfNJ");
        lIIIlIIlII[lIIIlIIlll[17]] = lllIlIIIlllI("HxUedQM+VBshFiMA", "QthUw");
        lIIIlIIlII[lIIIlIIlll[18]] = lllIlIIIllll("YFNNHLw2ZXKiuEQ4UktxPQ==", "UCimW");
        lIIIlIIlII[lIIIlIIlll[19]] = lllIlIIlIIIl("wIreZSKPhMM=", "Ubona");
        lIIIlIIlII[lIIIlIIlll[15]] = lllIlIIIlllI("EComOg==", "FOIIv");
        lIIIlIIlII[lIIIlIIlll[20]] = lllIlIIIlllI("NjECCRsXMQJIGwExCAQE", "bCghh");
        lIIIlIIlII[lIIIlIIlll[21]] = lllIlIIIlllI("EQ0jNQ==", "FhBGA");
        lIIIlIIlII[lIIIlIIlll[22]] = lllIlIIlIIIl("rfgvEncPyhA=", "tohdJ");
        lIIIlIIlII[lIIIlIIlll[23]] = lllIlIIIlllI("PA4CaRsdTxAgCFJe", "rotIo");
        lIIIlIIlII[lIIIlIIlll[24]] = lllIlIIlIIIl("dtvFgfEEA18=", "omBsE");
        lIIIlIIlII[lIIIlIIlll[25]] = lllIlIIIllll("KknCWSs98NQ=", "zNXDP");
        lIIIlIIlII[lIIIlIIlll[26]] = lllIlIIIllll("063pSAs9Z/0E8UydVVjWww==", "ZlVsR");
        lIIIlIIlII[lIIIlIIlll[27]] = lllIlIIlIIIl("SIescxqx0D0=", "ooROu");
        lIIIlIIlII[lIIIlIIlll[28]] = lllIlIIlIIIl("3W0aoue70Ao=", "TeLWM");
        lIIIlIIlII[lIIIlIIlll[29]] = lllIlIIlIIIl("uFwX6uBs/qoj39ZE6HnU/A==", "hpNob");
        lIIIlIIlII[lIIIlIIlll[30]] = lllIlIIIllll("SHknEEc+2GY=", "PdlKQ");
        lIIIlIIlII[lIIIlIIlll[31]] = lllIlIIIlllI("LCc/", "hNXrg");
        lIIIlIIlII[lIIIlIIlll[32]] = lllIlIIIllll("sv3KF+aiRsxg4V84MOI3+Q==", "wPkZp");
        lIIIlIIlII[lIIIlIIlll[33]] = lllIlIIlIIIl("Ai+6JnzV4gI=", "pnKEv");
        lIIIlIIlII[lIIIlIIlll[34]] = lllIlIIlIIIl("h9Mk0Lpg4To=", "kYnJS");
        lIIIlIIlII[lIIIlIIlll[35]] = lllIlIIIllll("WP4KmgP7vO+XwgQv9hJEN57FT7Iv+BTP", "rFxaG");
        lIIIlIIlII[lIIIlIIlll[36]] = lllIlIIIllll("lxxuKUczTPp6V+8nlAcpMw==", "EtzZm");
        lIIIlIIlII[lIIIlIIlll[37]] = lllIlIIIlllI("FxIGHg==", "AwimO");
        lIIIlIIlII[lIIIlIIlll[40]] = lllIlIIIlllI("KB8TIw0UDVEtBRca", "zjqAd");
        lIIIlIIlII[lIIIlIIlll[41]] = lllIlIIIlllI("HSMt", "OVOBn");
        lIIIlIIlII[lIIIlIIlll[42]] = lllIlIIIlllI("OisfABodJx0CWRoiEhwcGw==", "iNsey");
        lIIIlIIlII[lIIIlIIlll[43]] = lllIlIIIlllI("IyU4PAsC", "pIYEn");
        lIIIlIIlII[lIIIlIIlll[44]] = lllIlIIlIIIl("s7CzWCiqSAI=", "qkkTj");
        lIIIlIIlII[lIIIlIIlll[45]] = lllIlIIlIIIl("Eq8cqvpBPwg=", "JxfHu");
        lIIIlIIlII[lIIIlIIlll[55]] = lllIlIIlIIIl("gOFS1tKSsekcHHJq/P/cbadVxlxH3yv1", "xXqHX");
        lIIIlIIlII[lIIIlIIlll[56]] = lllIlIIIlllI("MwskLUMuBGo9BiAOPiJDaQ==", "AbJJc");
        lIIIlIIlII[lIIIlIIlll[57]] = lllIlIIlIIIl("r5JXSp0/0as=", "xlMPq");
        lIIIlIIlII[lIIIlIIlll[58]] = lllIlIIlIIIl("nfIe7LI7gC4=", "SECgM");
        lIIIlIIlII[lIIIlIIlll[59]] = lllIlIIIllll("lJOz5pw8S34=", "hKkYY");
        lIIIlIIlII[lIIIlIIlll[53]] = lllIlIIIlllI("IzoKAAg=", "DVerq");
        lIIIlIIlII[lIIIlIIlll[60]] = lllIlIIIlllI("MRk2Oyk=", "VuYIP");
        lIIIlIIlII[lIIIlIIlll[61]] = lllIlIIlIIIl("fmhtbRQzOiE=", "dxydn");
        lIIIlIIlII[lIIIlIIlll[62]] = lllIlIIIllll("kn5ItDVIG+vxRw76WDQkbH303lomYFZ5jqMeVQLerP8=", "FXGSs");
        lIIIlIIlII[lIIIlIIlll[63]] = lllIlIIlIIIl("GD8B1hHWGRsRmxU1qEXSBonIFYkFGGotIkn2LntA/GjnPE9iHsgq/w==", "hRbMI");
        lIIIlIIlII[lIIIlIIlll[64]] = lllIlIIIlllI("CCoFMgMrZRkwByE2VywNMDdXPQcpNVY=", "EEwUb");
        lIIIlIIlII[lIIIlIIlll[65]] = lllIlIIlIIIl("45mUwLhvxgA=", "SiuZI");
        lIIIlIIlII[lIIIlIIlll[66]] = lllIlIIIllll("w5XYz8KN+ud7Q7dGrt8EL+tSpxlpgQ8BCgMlfCUUSIY=", "ZyOpb");
        lIIIlIIlII[lIIIlIIlll[67]] = lllIlIIIlllI("CjphUiIgJW0fK2U5KB4+ZSUlFyBr", "EQMrN");
        lIIIlIIlII[lIIIlIIlll[68]] = lllIlIIIlllI("CgwkOwM+TRE2FCkOO3MVKQMkcwspTSQ8RjgMPDhGOAJwKgk5Qw==", "LmPSf");
        lIIIlIIlII[lIIIlIIlll[69]] = lllIlIIIlllI("HzNxBG4wOSJXL3cxPhg9I3Y+Fjs5Ij8ZKXc+PwRuMCQ3ASsuNyQTYA==", "WVVwN");
        lIIIlIIlII[lIIIlIIlll[70]] = lllIlIIIllll("dXfPyr4M96eTURkd57JpJFBQNrQzxEaayWcjniqammGeiFFWXWJ4jA==", "fYaPr");
        lIIIlIIlII[lIIIlIIlll[71]] = lllIlIIIlllI("ABkmMHY=", "SlTUX");
        lIIIlIIlII[lIIIlIIlll[72]] = lllIlIIlIIIl("512fEI3tqzP3q6ZtgC2Wko2tBhdv8T6MM0z3ukC9MyojDcwF9K3QZQ==", "wibrZ");
        lIIIlIIlII[lIIIlIIlll[73]] = lllIlIIlIIIl("GhbkcNKOcyrAJ+hSCsaWBA==", "nSEEQ");
        lIIIlIIlII[lIIIlIIlll[48]] = lllIlIIIlllI("BwUtdjQuBHofdycPNiZo", "OjZVW");
        lIIIlIIlII[lIIIlIIlll[74]] = lllIlIIIllll("sE9rNf4hdAVrEdNssAWYGjyJxj0yyveFsqp6jisG3/8=", "GxYYk");
        lIIIlIIlII[lIIIlIIlll[75]] = lllIlIIIlllI("LxIqbSFMGyEhGFM=", "lsDMh");
    }

    static {
        lllIlIIllllI();
        lllIlIIlllIl();
        String[] strArr = new String[lIIIlIIlll[24]];
        strArr[lIIIlIIlll[0]] = lIIIlIIlII[lIIIlIIlll[62]];
        strArr[lIIIlIIlll[1]] = lIIIlIIlII[lIIIlIIlll[63]];
        strArr[lIIIlIIlll[3]] = lIIIlIIlII[lIIIlIIlll[64]];
        strArr[lIIIlIIlll[5]] = lIIIlIIlII[lIIIlIIlll[65]];
        strArr[lIIIlIIlll[6]] = lIIIlIIlII[lIIIlIIlll[66]];
        strArr[lIIIlIIlll[7]] = lIIIlIIlII[lIIIlIIlll[67]];
        strArr[lIIIlIIlll[9]] = lIIIlIIlII[lIIIlIIlll[68]];
        strArr[lIIIlIIlll[17]] = lIIIlIIlII[lIIIlIIlll[69]];
        strArr[lIIIlIIlll[18]] = lIIIlIIlII[lIIIlIIlll[70]];
        strArr[lIIIlIIlll[19]] = lIIIlIIlII[lIIIlIIlll[71]];
        strArr[lIIIlIIlll[15]] = lIIIlIIlII[lIIIlIIlll[72]];
        strArr[lIIIlIIlll[20]] = lIIIlIIlII[lIIIlIIlll[73]];
        strArr[lIIIlIIlll[21]] = lIIIlIIlII[lIIIlIIlll[48]];
        strArr[lIIIlIIlll[22]] = lIIIlIIlII[lIIIlIIlll[74]];
        strArr[lIIIlIIlll[23]] = lIIIlIIlII[lIIIlIIlll[75]];
        ip = strArr;
        iq = new WorldPoint(lIIIlIIlll[76], lIIIlIIlll[77], lIIIlIIlll[0]);
        ir = new WorldPoint(lIIIlIIlll[78], lIIIlIIlll[79], lIIIlIIlll[0]);
        is = new WorldPoint(lIIIlIIlll[80], lIIIlIIlll[81], lIIIlIIlll[0]);
        it = new WorldPoint(lIIIlIIlll[82], lIIIlIIlll[83], lIIIlIIlll[0]);
        iu = new WorldPoint(lIIIlIIlll[84], lIIIlIIlll[85], lIIIlIIlll[0]);
        iv = new WorldPoint(lIIIlIIlll[86], lIIIlIIlll[87], lIIIlIIlll[0]);
        bv = new ArrayList();
        bT = lIIIlIIlll[0];
    }

    private static boolean lllIlIlIIIll(int i) {
        return i == 0;
    }

    private static boolean lllIlIlIlIlI(int i, int i2) {
        return i >= i2;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            cm();
            "".length();
            if (0 != 0) {
                return ((58 ^ 90) ^ (145 ^ 174)) & (((((183 + 10) - 115) + 154) ^ (((30 + 96) - 96) + 153)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIIlIIlll[54];
    }

    private static String lllIlIIIlllI(String lIlIlIIIllll, String lIlIlIIIlllI) {
        String str = new String(Base64.getDecoder().decode(lIlIlIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlIlIIIlllI.toCharArray();
        int lIlIlIIIlIll = lIIIlIIlll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIlIIlll[0];
        while (lllIlIlIIIlI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lIlIlIIIlIll % charArray.length]));
            "".length();
            lIlIlIIIlIll++;
            i++;
            "".length();
            if ((172 ^ 169) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIIlIIlII[lIIIlIIlll[55]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lllIlIlIlIlI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIIlll[18])) {
            int[] iArr = new int[lIIIlIIlll[1]];
            iArr[lIIIlIIlll[0]] = lIIIlIIlll[38];
            if (lllIlIlIIIll(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = lIIIlIIlll[1];
                "".length();
                return 0 != 0 ? ((((35 + 33) - (-74)) + 49) ^ (((136 + 33) - 51) + 34)) & (((((126 + 25) - 10) + 42) ^ (((103 + 14) - 40) + 67)) ^ (-" ".length())) : r0;
            }
        }
        return lIIIlIIlll[0];
    }

    private static boolean lllIlIlIIIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        String[] strArr = new String[lIIIlIIlll[1]];
        strArr[lIIIlIIlll[0]] = lIIIlIIlII[lIIIlIIlll[45]];
        if (lllIlIlIIIIl(Inventory.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lIIIlIIlll[1]];
            iArr[lIIIlIIlll[0]] = lIIIlIIlll[4];
            if (lllIlIlIIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = lIIIlIIlll[1];
                "".length();
                return (-(172 ^ 168)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIIIlIIlll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v117, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v355, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v400, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v61, types: [boolean] */
    public static void cm() {
        if (lllIlIlIIIIl(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[0]];
            C0001b.a(bv);
            if (lllIlIlIIIlI(bv.size(), lIIIlIIlll[1])) {
                System.out.println(lIIIlIIlII[lIIIlIIlll[1]]);
                bt = lIIIlIIlll[0];
            }
        }
        if (lllIlIlIIIll(bt ? 1 : 0)) {
            if (lllIlIlIIIIl(Inventory.contains(C0005f.aV) ? 1 : 0) && lllIlIlIIIlI(Movement.getRunEnergy(), lIIIlIIlll[2])) {
                Inventory.getFirst(C0005f.aV).interact(lIIIlIIlII[lIIIlIIlll[3]]);
                Time.sleepTicks(lIIIlIIlll[1]);
                "".length();
            }
            if (lllIlIlIIlII(lllIlIIlllll(C0004e.u(), 70.0d))) {
                int[] iArr = new int[lIIIlIIlll[1]];
                iArr[lIIIlIIlll[0]] = lIIIlIIlll[4];
                if (lllIlIlIIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIIlIIlll[1]];
                    iArr2[lIIIlIIlll[0]] = lIIIlIIlll[4];
                    Inventory.getFirst(iArr2).interact(lIIIlIIlII[lIIIlIIlll[5]]);
                }
            }
            if (lllIlIlIIIll(Movement.isRunEnabled() ? 1 : 0) && lllIlIlIIlIl(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lllIlIlIIIll(ab() ? 1 : 0) && lllIlIlIIIll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lllIlIlIIllI(nearest) && lllIlIlIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[6]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lIIIlIIlll[3]);
                    "".length();
                }
                if (lllIlIlIIllI(nearest) && lllIlIlIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[7]];
                    if (lllIlIlIIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIlIIlll[8]);
                        "".length();
                    }
                    if (lllIlIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (lllIlIlIIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIlIIlll[6]);
                            "".length();
                        }
                        if (lllIlIlIIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIlIIlll[3]);
                            "".length();
                        }
                        int[] iArr3 = new int[lIIIlIIlll[9]];
                        iArr3[lIIIlIIlll[0]] = lIIIlIIlll[10];
                        iArr3[lIIIlIIlll[1]] = lIIIlIIlll[11];
                        iArr3[lIIIlIIlll[3]] = lIIIlIIlll[12];
                        iArr3[lIIIlIIlll[5]] = lIIIlIIlll[13];
                        iArr3[lIIIlIIlll[6]] = lIIIlIIlll[4];
                        iArr3[lIIIlIIlll[7]] = lIIIlIIlll[14];
                        if (lllIlIlIIIll(C0004e.b(iArr3) ? 1 : 0)) {
                            af();
                            System.out.println(lIIIlIIlII[lIIIlIIlll[9]]);
                            bt = lIIIlIIlll[1];
                            return;
                        }
                        int[] iArr4 = new int[lIIIlIIlll[9]];
                        iArr4[lIIIlIIlll[0]] = lIIIlIIlll[10];
                        iArr4[lIIIlIIlll[1]] = lIIIlIIlll[11];
                        iArr4[lIIIlIIlll[3]] = lIIIlIIlll[12];
                        iArr4[lIIIlIIlll[5]] = lIIIlIIlll[13];
                        iArr4[lIIIlIIlll[6]] = lIIIlIIlll[4];
                        iArr4[lIIIlIIlll[7]] = lIIIlIIlll[14];
                        if (lllIlIlIIIIl(C0004e.b(iArr4) ? 1 : 0)) {
                            Bank.withdraw(lIIIlIIlll[11], lIIIlIIlll[15], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIIIlIIlll[1]);
                            "".length();
                            Bank.withdraw(lIIIlIIlll[14], lIIIlIIlll[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIIIlIIlll[1]);
                            "".length();
                            Bank.withdraw(lIIIlIIlll[16], lIIIlIIlll[15], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIIIlIIlll[1]);
                            "".length();
                            Bank.withdraw(lIIIlIIlll[13], lIIIlIIlll[7], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIIIlIIlll[1]);
                            "".length();
                            Bank.withdraw(lIIIlIIlll[10], lIIIlIIlll[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIIIlIIlll[1]);
                            "".length();
                            C0000a.b(C0005f.aV, lIIIlIIlll[6]);
                            C0000a.a(lIIIlIIlll[4], lIIIlIIlll[15]);
                            C0000a.b(C0005f.bf, lIIIlIIlll[1]);
                        }
                    }
                }
            }
            if (lllIlIlIIIll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId())) && lllIlIlIIIIl(ab() ? 1 : 0)) {
                if (lllIlIlIIlll(Players.getLocal().getWorldLocation().distanceTo(iq), lIIIlIIlll[3])) {
                    AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[17]];
                    if (lllIlIlIIIlI(bT, lIIIlIIlll[1])) {
                        C0004e.v();
                        bT += lIIIlIIlll[1];
                    }
                    Movement.walkTo(iq);
                    "".length();
                    Time.sleepTicks(lIIIlIIlll[1]);
                    "".length();
                }
                if (lllIlIlIlIII(Players.getLocal().getWorldLocation().distanceTo(iq), lIIIlIIlll[3])) {
                    AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[18]];
                    if (lllIlIlIIIll(lllIlIlIIIII(g, 0L))) {
                        g = System.currentTimeMillis();
                    }
                    if (lllIlIlIIIIl(lllIlIlIIIII(g, 0L)) && lllIlIlIIlIl(lllIlIlIIIII(C0004e.a(g), 30000L))) {
                        bT = lIIIlIIlll[0];
                        g = System.currentTimeMillis();
                    }
                    if (lllIlIlIIIlI(bT, lIIIlIIlll[1])) {
                        C0004e.v();
                        bT += lIIIlIIlll[1];
                    }
                    if (lllIlIlIIIIl(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr5 = new int[lIIIlIIlll[1]];
                        iArr5[lIIIlIIlll[0]] = lIIIlIIlll[4];
                        Inventory.getFirst(iArr5).interact(lIIIlIIlII[lIIIlIIlll[19]]);
                        Time.sleepTicks(lIIIlIIlll[3]);
                        "".length();
                    }
                    C0006g.a(lIIIlIIlII[lIIIlIIlll[15]], ip, lIIIlIIlll[1]);
                }
            }
            if (lllIlIlIlIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIIlll[1])) {
                ck = lIIIlIIlll[0];
                String[] strArr = new String[lIIIlIIlll[1]];
                strArr[lIIIlIIlll[0]] = lIIIlIIlII[lIIIlIIlll[20]];
                if (lllIlIlIIIll(Inventory.contains(strArr) ? 1 : 0)) {
                    C0006g.a(ip);
                }
            }
            if (lllIlIlIlIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIIlll[3])) {
                if (lllIlIlIIIIl(Inventory.contains(item -> {
                    return item.getName().contains(lIIIlIIlII[lIIIlIIlll[61]]);
                }) ? 1 : 0) && lllIlIlIIIll(Equipment.contains(item2 -> {
                    return item2.getName().contains(lIIIlIIlII[lIIIlIIlll[60]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item3 -> {
                        return item3.getName().contains(lIIIlIIlII[lIIIlIIlll[53]]);
                    }).interact(lIIIlIIlII[lIIIlIIlll[21]]);
                }
                if (lllIlIlIIIIl(Inventory.contains(item4 -> {
                    return item4.getName().contains(lIIIlIIlII[lIIIlIIlll[59]]);
                }) ? 1 : 0) && lllIlIlIIIll(Equipment.contains(item5 -> {
                    return item5.getName().contains(lIIIlIIlII[lIIIlIIlll[58]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item6 -> {
                        return item6.getName().contains(lIIIlIIlII[lIIIlIIlll[57]]);
                    }).interact(lIIIlIIlII[lIIIlIIlll[22]]);
                }
                if (lllIlIlIIIll(Players.getLocal().getWorldLocation().equals(ir) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[23]];
                    Movement.walkTo(ir);
                    "".length();
                    Time.sleepTicks(lIIIlIIlll[1]);
                    "".length();
                }
                if (lllIlIlIIIIl(Players.getLocal().getWorldLocation().equals(ir) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIIlIIlll[1]];
                    strArr2[lIIIlIIlll[0]] = lIIIlIIlII[lIIIlIIlll[24]];
                    Inventory.getFirst(strArr2).interact(lIIIlIIlII[lIIIlIIlll[25]]);
                    Time.sleepTicks(lIIIlIIlll[3]);
                    "".length();
                }
            }
            if (lllIlIlIlIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIIlll[5])) {
                if (lllIlIlIIIll(Players.getLocal().getWorldLocation().equals(is) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[26]];
                    Movement.walkTo(is);
                    "".length();
                    Time.sleepTicks(lIIIlIIlll[1]);
                    "".length();
                }
                if (lllIlIlIIIIl(Players.getLocal().getWorldLocation().equals(is) ? 1 : 0)) {
                    String[] strArr3 = new String[lIIIlIIlll[1]];
                    strArr3[lIIIlIIlll[0]] = lIIIlIIlII[lIIIlIIlll[27]];
                    Inventory.getFirst(strArr3).interact(lIIIlIIlII[lIIIlIIlll[28]]);
                    Time.sleepTicks(lIIIlIIlll[3]);
                    "".length();
                }
            }
            if (lllIlIlIlIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIIlll[6])) {
                if (lllIlIlIIIll(Players.getLocal().getWorldLocation().equals(it) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[29]];
                    Movement.walkTo(it);
                    "".length();
                    Time.sleepTicks(lIIIlIIlll[1]);
                    "".length();
                }
                if (lllIlIlIIIIl(Players.getLocal().getWorldLocation().equals(it) ? 1 : 0)) {
                    String[] strArr4 = new String[lIIIlIIlll[1]];
                    strArr4[lIIIlIIlll[0]] = lIIIlIIlII[lIIIlIIlll[30]];
                    Inventory.getFirst(strArr4).interact(lIIIlIIlII[lIIIlIIlll[31]]);
                    Time.sleepTicks(lIIIlIIlll[3]);
                    "".length();
                }
            }
            if (lllIlIlIlIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIIlll[7])) {
                if (lllIlIlIIIll(Players.getLocal().getWorldLocation().equals(iu) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[32]];
                    Movement.walkTo(iu);
                    "".length();
                    Time.sleepTicks(lIIIlIIlll[1]);
                    "".length();
                }
                if (lllIlIlIIIIl(Players.getLocal().getWorldLocation().equals(iu) ? 1 : 0)) {
                    String[] strArr5 = new String[lIIIlIIlll[1]];
                    strArr5[lIIIlIIlll[0]] = lIIIlIIlII[lIIIlIIlll[33]];
                    Inventory.getFirst(strArr5).interact(lIIIlIIlII[lIIIlIIlll[34]]);
                    Time.sleepTicks(lIIIlIIlll[3]);
                    "".length();
                }
            }
            if (lllIlIlIlIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIIlll[9])) {
                if (lllIlIlIIlll(Players.getLocal().getWorldLocation().distanceTo(iv), lIIIlIIlll[5])) {
                    AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[35]];
                    Movement.walkTo(iv);
                    "".length();
                    Time.sleepTicks(lIIIlIIlll[1]);
                    "".length();
                }
                if (lllIlIlIlIII(Players.getLocal().getWorldLocation().distanceTo(iv), lIIIlIIlll[5])) {
                    AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[36]];
                    if (lllIlIlIIIlI(ck, lIIIlIIlll[1])) {
                        U.mC += lIIIlIIlll[1];
                        U.o(AccBuilderRogues.m);
                        ck += lIIIlIIlll[1];
                        U.mC = lIIIlIIlll[0];
                        cl = lIIIlIIlll[0];
                    }
                    C0006g.a(lIIIlIIlII[lIIIlIIlll[37]], ip);
                }
            }
            if (lllIlIlIlIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIIlll[17])) {
                C0006g.a(ip);
            }
            do {
                int[] iArr6 = new int[lIIIlIIlll[1]];
                iArr6[lIIIlIIlll[0]] = lIIIlIIlll[38];
                if (!lllIlIlIIIIl(Inventory.contains(iArr6) ? 1 : 0)) {
                    C0006g.a(new String[lIIIlIIlll[0]]);
                    return;
                }
                if (lllIlIlIIllI(Widgets.get(lIIIlIIlll[39]))) {
                    AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[40]];
                    int[] iArr7 = new int[lIIIlIIlll[1]];
                    iArr7[lIIIlIIlll[0]] = lIIIlIIlll[38];
                    Inventory.getFirst(iArr7).interact(lIIIlIIlII[lIIIlIIlll[41]]);
                    Time.sleepTicks(lIIIlIIlll[6]);
                    "".length();
                    AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[42]];
                    Widget widget = Widgets.get(lIIIlIIlll[39], lIIIlIIlll[23]);
                    if (lllIlIlIIllI(widget)) {
                        widget.interact(lIIIlIIlII[lIIIlIIlll[43]]);
                        Time.sleepTicks(lIIIlIIlll[1]);
                        "".length();
                    }
                    Widget widget2 = Widgets.get(lIIIlIIlll[39], lIIIlIIlll[35]);
                    if (lllIlIlIIllI(widget2)) {
                        widget2.interact(lIIIlIIlII[lIIIlIIlll[44]]);
                        Time.sleepTicks(lIIIlIIlll[3]);
                        "".length();
                    }
                }
                Time.sleepTicks(lIIIlIIlll[1]);
                "".length();
                "".length();
            } while (" ".length() > (-" ".length()));
        }
    }
}
