package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.S  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/S.class */
public class S implements W {
    static /* synthetic */ boolean cm;
    private static /* synthetic */ String[] lIllllIlI;
    private static /* synthetic */ int[] lIlllllII;
    public static final /* synthetic */ WorldPoint jO;
    public static /* synthetic */ List<C0003d> bv;
    static /* synthetic */ int cl;
    public static /* synthetic */ String[] bR;
    static /* synthetic */ int bT;
    public static final /* synthetic */ WorldPoint jM;
    public static final /* synthetic */ WorldPoint jP;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldPoint jN;

    static {
        lIIllllIllll();
        lIIllllIlllI();
        jM = new WorldPoint(lIlllllII[61], lIlllllII[62], lIlllllII[0]);
        jN = new WorldPoint(lIlllllII[63], lIlllllII[64], lIlllllII[1]);
        jO = new WorldPoint(lIlllllII[65], lIlllllII[66], lIlllllII[0]);
        jP = new WorldPoint(lIlllllII[67], lIlllllII[68], lIlllllII[0]);
        String[] strArr = new String[lIlllllII[15]];
        strArr[lIlllllII[0]] = lIllllIlI[lIlllllII[69]];
        strArr[lIlllllII[1]] = lIllllIlI[lIlllllII[70]];
        strArr[lIlllllII[3]] = lIllllIlI[lIlllllII[71]];
        strArr[lIlllllII[6]] = lIllllIlI[lIlllllII[72]];
        strArr[lIlllllII[7]] = lIllllIlI[lIlllllII[2]];
        strArr[lIlllllII[10]] = lIllllIlI[lIlllllII[73]];
        strArr[lIlllllII[14]] = lIllllIlI[lIlllllII[74]];
        bR = strArr;
        bv = new ArrayList();
        bT = lIlllllII[0];
    }

    private static void lIIllllIlllI() {
        lIllllIlI = new String[lIlllllII[75]];
        lIllllIlI[lIlllllII[0]] = lIIllllIlIlI("S/NEacwPhgBXJCVG2TqDWw==", "csQNM");
        lIllllIlI[lIlllllII[1]] = lIIllllIlIll("ByQ3GwMpKD1SEjQ0MBwXYSQtFx0yYXkBByg5OhoZLyp5EBEiJnkGH2E8LBcDNQ==", "AMYrp");
        lIllllIlI[lIlllllII[3]] = lIIllllIlIll("KD0fLT0=", "lOvCV");
        lIllllIlI[lIlllllII[6]] = lIIllllIlIll("OykaazwaaA4qJh4=", "uHlKH");
        lIllllIlI[lIlllllII[7]] = lIIllllIllII("OukHgUyLynbmWAu2OsvO2vOwzTnd6Ryw", "ucvFg");
        lIllllIlI[lIlllllII[10]] = lIIllllIllII("yqaUF5Uc7p4mqAbavbpSn+tS5MmKmpEokJykSs3bsU+bjZQh+2RWDdejUkiUO6IHWOfF2X0BzCs=", "ifEBq");
        lIllllIlI[lIlllllII[14]] = lIIllllIlIll("Gyk+Uh86aDodBjAn", "UHHrk");
        lIllllIlI[lIlllllII[15]] = lIIllllIlIll("GTEsIj4jKypwOz8gPiQ=", "JEMPJ");
        lIllllIlI[lIlllllII[13]] = lIIllllIlIlI("X0H7PEOcZiI=", "tTEHF");
        lIllllIlI[lIlllllII[16]] = lIIllllIllII("AOEFv3GG2z0=", "cRuzH");
        lIllllIlI[lIlllllII[12]] = lIIllllIllII("iJJqqIbr0+E0L6bt6BdX8Q==", "CPETR");
        lIllllIlI[lIlllllII[17]] = lIIllllIlIll("GSsGIHQ5JUohISEjDz8=", "MJjKT");
        lIllllIlI[lIlllllII[18]] = lIIllllIlIll("FiEEPQ==", "YQaSV");
        lIllllIlI[lIlllllII[19]] = lIIllllIllII("npzit2kuhYo=", "RKnEX");
        lIllllIlI[lIlllllII[21]] = lIIllllIllII("/zQZ/q2E7skH656aqituTA==", "WEatL");
        lIllllIlI[lIlllllII[22]] = lIIllllIlIlI("t1BCo2HT7xymEwMCLKPxig==", "Mqynu");
        lIllllIlI[lIlllllII[23]] = lIIllllIllII("wvQ53nhBJkc=", "XeDkY");
        lIllllIlI[lIlllllII[25]] = lIIllllIlIll("Cws0Tg4qSiQPDi0PMA==", "EjBnz");
        lIllllIlI[lIlllllII[26]] = lIIllllIlIll("FS04InUHLSAhMBM=", "aLTIU");
        lIllllIlI[lIlllllII[27]] = lIIllllIlIlI("OLNZGhnAc+/Hane60hMkcg==", "DcDXb");
        lIllllIlI[lIlllllII[20]] = lIIllllIlIlI("hMXs3RN7GQrv+LKDHmeJ4rInIA+pe+bZ", "ZSmqS");
        lIllllIlI[lIlllllII[29]] = lIIllllIlIll("GSomIlAdJD4gHwM4", "mKJIp");
        lIllllIlI[lIlllllII[30]] = lIIllllIlIll("KBk3PCYMCjk6Nw==", "iiXHN");
        lIllllIlI[lIlllllII[31]] = lIIllllIllII("ElG4eVweGZ46Lp89GB53hw==", "JqlPe");
        lIllllIlI[lIlllllII[32]] = lIIllllIlIlI("2TPJ7piUXJ3lZ728FNy7lWMfjI7D1hiB", "moExp");
        lIllllIlI[lIlllllII[33]] = lIIllllIllII("cb3PdDVJP2PFsczvOPkhoA==", "zPGiH");
        lIllllIlI[lIlllllII[34]] = lIIllllIlIll("AQUCLkcFCxosCBsX", "udnEg");
        lIllllIlI[lIlllllII[35]] = lIIllllIlIll("NzYmGiUTJSgcNA==", "vFInM");
        lIllllIlI[lIlllllII[36]] = lIIllllIllII("sAmpwAcxXgcMvPwyR4HyiQ==", "AhsRj");
        lIllllIlI[lIlllllII[37]] = lIIllllIllII("ZCoaPsGaQws=", "eAOfr");
        lIllllIlI[lIlllllII[24]] = lIIllllIllII("7UJyE+30TVxpyE4Nfskcqg==", "UvItT");
        lIllllIlI[lIlllllII[38]] = lIIllllIlIll("MDIhAnYQPG0DIwg6KB0=", "dSMiV");
        lIllllIlI[lIlllllII[39]] = lIIllllIlIlI("U8E8z+tK+Jo=", "VePEV");
        lIllllIlI[lIlllllII[40]] = lIIllllIlIll("HC02EQci", "VXZxb");
        lIllllIlI[lIlllllII[42]] = lIIllllIlIlI("GLGFvn41uSrJ5SeSn4niaQ==", "EbOQD");
        lIllllIlI[lIlllllII[43]] = lIIllllIllII("Bu4xzQGaoro6O286U+hXXw==", "wagyo");
        lIllllIlI[lIlllllII[44]] = lIIllllIllII("XIdXJixkBX0=", "YngVM");
        lIllllIlI[lIlllllII[45]] = lIIllllIllII("zXEIefV+/3kYi5bGbizP2w==", "yJPAT");
        lIllllIlI[lIlllllII[46]] = lIIllllIllII("VWhhAi8vX5lx3SPzAfuIbceRU9B9LyW+", "ZwjFC");
        lIllllIlI[lIlllllII[47]] = lIIllllIlIll("PzVYFSQNcBUdJRs5FhN2GSUdByJIIw0EJgQ5HQd6SCMPHSILOBEaMUgkF1QUPQkxOhE=", "hPxtV");
        lIllllIlI[lIlllllII[28]] = lIIllllIllII("dejn7K41V4Cr2jHg3qp7VMYGH9c5/31A", "alPgx");
        lIllllIlI[lIlllllII[54]] = lIIllllIlIll("IgUUNkw/ClomCTEADjlMeA==", "PlzQl");
        lIllllIlI[lIlllllII[55]] = lIIllllIlIlI("gfR6C91/d0A=", "WfTBx");
        lIllllIlI[lIlllllII[58]] = lIIllllIlIll("PgoSBg==", "qzwhX");
        lIllllIlI[lIlllllII[59]] = lIIllllIlIll("IRo8Ng==", "euSDD");
        lIllllIlI[lIlllllII[60]] = lIIllllIllII("QFvfpj5VQVk=", "JjGZl");
        lIllllIlI[lIlllllII[69]] = lIIllllIllII("oaAIFFwoMt2KhvtCwPIicnunVlNC3dNotFSxCs3ToLg=", "bZbMa");
        lIllllIlI[lIlllllII[70]] = lIIllllIlIll("FDICRm0iPF1KBGo7HUohKCNRAig/dxoEIjp5", "MWqjM");
        lIllllIlI[lIlllllII[71]] = lIIllllIlIlI("E1ib8S19yfoJK4uT+ND9aA==", "kBSeA");
        lIllllIlI[lIlllllII[72]] = lIIllllIlIlI("L/ag83nGTtDI5LgIE5kYp0Ynen7I8PAMGban0DWStz4=", "wjEQC");
        lIllllIlI[lIlllllII[2]] = lIIllllIlIlI("yWNpjzi/uZC4l63/fcW2YIA5Hm8ri980JcfH71nSXiA=", "MiGCK");
        lIllllIlI[lIlllllII[73]] = lIIllllIllII("XAiff9tbyFtQPOD4GRyw8g==", "jgCzy");
        lIllllIlI[lIlllllII[74]] = lIIllllIllII("nwPwXN7yjI0=", "ehYAR");
    }

    private static void af() {
        int[] iArr = new int[lIlllllII[1]];
        iArr[lIlllllII[0]] = lIlllllII[48];
        if (lIIlllllIIlI(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIlllllII[48], lIlllllII[10], C0008i.bq));
            "".length();
        }
        int[] iArr2 = new int[lIlllllII[1]];
        iArr2[lIlllllII[0]] = lIlllllII[9];
        if (lIIlllllIIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIlllllII[9], lIlllllII[1], lIlllllII[49]));
            "".length();
        }
        if (lIIlllllIIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIllllIlI[lIlllllII[54]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIlllllII[50], lIlllllII[10], lIlllllII[51]));
            "".length();
        }
        int[] iArr3 = new int[lIlllllII[1]];
        iArr3[lIlllllII[0]] = lIlllllII[11];
        if (lIIlllllIIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIlllllII[11], lIlllllII[20], lIlllllII[52]));
            "".length();
        }
    }

    private static boolean lIIlllllIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIllllllIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlllllIlII(Object obj) {
        return obj != null;
    }

    private static void lIIllllIllll() {
        lIlllllII = new int[76];
        lIlllllII[0] = (80 ^ 12) & ((82 ^ 14) ^ (-1));
        lIlllllII[1] = " ".length();
        lIlllllII[2] = 54 ^ 4;
        lIlllllII[3] = "  ".length();
        lIlllllII[4] = (-((-20931) & 29147)) & (-5125) & 14335;
        lIlllllII[5] = ((119 + 92) - 136) + 69;
        lIlllllII[6] = "   ".length();
        lIlllllII[7] = 149 ^ 145;
        lIlllllII[8] = (-18450) & 23449;
        lIlllllII[9] = (-21769) & 22521;
        lIlllllII[10] = (139 ^ 144) ^ (64 ^ 94);
        lIlllllII[11] = (-((-2529) & 27105)) & (-25) & 32607;
        lIlllllII[12] = (((58 + 103) - 53) + 28) ^ (((40 + 35) - 62) + 117);
        lIlllllII[13] = 116 ^ 124;
        lIlllllII[14] = (((17 + 118) - (-22)) + 15) ^ (((3 + 3) - (-122)) + 42);
        lIlllllII[15] = 74 ^ 77;
        lIlllllII[16] = 185 ^ 176;
        lIlllllII[17] = 19 ^ 24;
        lIlllllII[18] = 59 ^ 55;
        lIlllllII[19] = (76 ^ 70) ^ (128 ^ 135);
        lIlllllII[20] = 187 ^ 175;
        lIlllllII[21] = " ".length() ^ (62 ^ 49);
        lIlllllII[22] = (((116 + 40) - 55) + 100) ^ (((117 + 193) - 252) + 140);
        lIlllllII[23] = (49 ^ 53) ^ (7 ^ 19);
        lIlllllII[24] = (79 ^ 8) ^ (12 ^ 85);
        lIlllllII[25] = 52 ^ 37;
        lIlllllII[26] = 20 ^ 6;
        lIlllllII[27] = 127 ^ 108;
        lIlllllII[28] = (85 ^ 30) ^ (90 ^ 57);
        lIlllllII[29] = (((86 + 130) - 100) + 49) ^ (((126 + 110) - 147) + 87);
        lIlllllII[30] = (140 ^ 183) ^ (32 ^ 13);
        lIlllllII[31] = 214 ^ 193;
        lIlllllII[32] = (((123 + 140) - 215) + 108) ^ (((128 + 109) - 189) + 84);
        lIlllllII[33] = 67 ^ 90;
        lIlllllII[34] = (51 ^ 110) ^ (84 ^ 19);
        lIlllllII[35] = 98 ^ 121;
        lIlllllII[36] = (83 ^ 53) ^ (27 ^ 97);
        lIlllllII[37] = 38 ^ 59;
        lIlllllII[38] = 10 ^ 21;
        lIlllllII[39] = 53 ^ 21;
        lIlllllII[40] = 134 ^ 167;
        lIlllllII[41] = 17 ^ 45;
        lIlllllII[42] = 87 ^ 117;
        lIlllllII[43] = (150 ^ 185) ^ (110 ^ 98);
        lIlllllII[44] = (108 ^ 18) ^ (92 ^ 6);
        lIlllllII[45] = (112 ^ 40) ^ (76 ^ 49);
        lIlllllII[46] = 20 ^ 50;
        lIlllllII[47] = 144 ^ 183;
        lIlllllII[48] = (-16423) & 29047;
        lIlllllII[49] = (-16419) & 22318;
        lIlllllII[50] = (-((-17481) & 21625)) & (-1) & 16124;
        lIlllllII[51] = (-((-8489) & 13690)) & (-519) & 30719;
        lIlllllII[52] = (-((-9669) & 32215)) & (-1) & 24446;
        lIlllllII[53] = 101 ^ 1;
        lIlllllII[54] = (84 ^ 36) ^ (74 ^ 19);
        lIlllllII[55] = (98 ^ 116) ^ (149 ^ 169);
        lIlllllII[56] = (-12330) & 15487;
        lIlllllII[57] = (-((-7681) & 24213)) & (-4098) & 24055;
        lIlllllII[58] = 106 ^ 65;
        lIlllllII[59] = (20 ^ 36) ^ (54 ^ 42);
        lIlllllII[60] = (((27 + 130) - 66) + 61) ^ (((76 + 36) - 20) + 89);
        lIlllllII[61] = (-20577) & 23788;
        lIlllllII[62] = (-136) & 3559;
        lIlllllII[63] = (-21003) & 24159;
        lIlllllII[64] = (-((-209) & 8407)) & (-4609) & 16231;
        lIlllllII[65] = (-((-6193) & 31089)) & (-9) & 28159;
        lIlllllII[66] = (-((-322) & 12613)) & (-33) & 15807;
        lIlllllII[67] = (-17285) & 20479;
        lIlllllII[68] = (-17057) & 20460;
        lIlllllII[69] = 62 ^ 16;
        lIlllllII[70] = (((19 + 108) - (-16)) + 8) ^ (((80 + 180) - 151) + 75);
        lIlllllII[71] = (((129 + 40) - (-17)) + 5) ^ (((94 + 83) - 57) + 23);
        lIlllllII[72] = (156 ^ 163) ^ (201 ^ 199);
        lIlllllII[73] = 23 ^ 36;
        lIlllllII[74] = 52 ^ 0;
        lIlllllII[75] = 88 ^ 109;
    }

    private static String lIIllllIllII(String llIIIIlIlIlIll, String llIIIIlIlIlIlI) {
        try {
            SecretKeySpec llIIIIlIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIIlIlIllIl = Cipher.getInstance("Blowfish");
            llIIIIlIlIllIl.init(lIlllllII[3], llIIIIlIlIlllI);
            return new String(llIIIIlIlIllIl.doFinal(Base64.getDecoder().decode(llIIIIlIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIlIlIllII) {
            llIIIIlIlIllII.printStackTrace();
            return null;
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            cW();
            "".length();
            if ("  ".length() >= "   ".length()) {
                return ((192 ^ 162) ^ (120 ^ 35)) & (((44 ^ 62) ^ (49 ^ 26)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIlllllII[53];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    private static void ck() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIIlllllIlII(nearest) && lIIlllllIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIllllIlI[lIlllllII[45]];
            C0000a.a(nearest);
            Time.sleepTicks(lIlllllII[3]);
            "".length();
        }
        if (lIIlllllIlII(nearest) && lIIlllllIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIllllIlI[lIlllllII[46]];
            if (lIIlllllIIlI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIlllllII[8]);
                "".length();
            }
            if (lIIlllllIIII(Bank.isOpen() ? 1 : 0)) {
                if (lIIlllllIIll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIlllllII[7]);
                    "".length();
                }
                if (lIIlllllIIll(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lIlllllII[3]);
                    "".length();
                }
                int[] iArr = new int[lIlllllII[1]];
                iArr[lIlllllII[0]] = lIlllllII[9];
                if (lIIlllllIIlI(C0004e.b(iArr) ? 1 : 0)) {
                    af();
                    System.out.println(lIllllIlI[lIlllllII[47]]);
                    bt = lIlllllII[1];
                    return;
                }
                int[] iArr2 = new int[lIlllllII[1]];
                iArr2[lIlllllII[0]] = lIlllllII[9];
                if (lIIlllllIIII(C0004e.b(iArr2) ? 1 : 0)) {
                    C0000a.a(lIlllllII[9], lIlllllII[1]);
                    C0000a.b(C0005f.aV, lIlllllII[3]);
                    C0000a.a(lIlllllII[11], lIlllllII[12]);
                    C0000a.b(C0005f.bf, lIlllllII[1]);
                }
            }
        }
    }

    private static String lIIllllIlIll(String llIIIIllIIllIl, String llIIIIllIIllII) {
        String str = new String(Base64.getDecoder().decode(llIIIIllIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIIllIIlIll = new StringBuilder();
        char[] llIIIIllIIlIlI = llIIIIllIIllII.toCharArray();
        int llIIIIllIIlIIl = lIlllllII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlllllII[0];
        while (lIIlllllIIIl(i, length)) {
            llIIIIllIIlIll.append((char) (charArray[i] ^ llIIIIllIIlIlI[llIIIIllIIlIIl % llIIIIllIIlIlI.length]));
            "".length();
            llIIIIllIIlIIl++;
            i++;
            "".length();
            if ((109 ^ 105) < "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llIIIIllIIlIll);
    }

    private static boolean lIIlllllIIll(int i) {
        return i > 0;
    }

    private static boolean ab() {
        int[] iArr = new int[lIlllllII[1]];
        iArr[lIlllllII[0]] = lIlllllII[9];
        return Inventory.contains(iArr);
    }

    private static String lIIllllIlIlI(String llIIIIlIlllIII, String llIIIIlIllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIlIllIlll.getBytes(StandardCharsets.UTF_8)), lIlllllII[13]), "DES");
            Cipher llIIIIlIlllIlI = Cipher.getInstance("DES");
            llIIIIlIlllIlI.init(lIlllllII[3], secretKeySpec);
            return new String(llIIIIlIlllIlI.doFinal(Base64.getDecoder().decode(llIIIIlIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIlIlllIIl) {
            llIIIIlIlllIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIllllllIII(C0004e.j(lIlllllII[5]), lIlllllII[53])) {
            ?? r0 = lIlllllII[1];
            "".length();
            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlllllII[0];
    }

    private static boolean lIIlllllIllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlllllIIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIlllllII[0];
    }

    private static boolean lIIlllllIlIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c0, code lost:
        if (lIIlllllIIll(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L137;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v376, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cW() {
        if (lIIlllllIIII(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIllllIlI[lIlllllII[0]];
            C0001b.a(bv);
            if (lIIlllllIIIl(bv.size(), lIlllllII[1])) {
                System.out.println(lIllllIlI[lIlllllII[1]]);
                bt = lIlllllII[0];
            }
        }
        if (lIIlllllIIlI(bt ? 1 : 0)) {
            if (lIIlllllIIII(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIlllllIIIl(Movement.getRunEnergy(), lIlllllII[2])) {
                Inventory.getFirst(C0005f.aV).interact(lIllllIlI[lIlllllII[3]]);
                Time.sleepTicks(lIlllllII[1]);
                "".length();
            }
            if (lIIlllllIIlI(Movement.isRunEnabled() ? 1 : 0) && lIIlllllIIll(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIIlllllIIII(ab() ? 1 : 0)) {
                int[] iArr = new int[lIlllllII[1]];
                iArr[lIlllllII[0]] = lIlllllII[4];
            }
            if (lIIlllllIIIl(C0004e.j(lIlllllII[5]), lIlllllII[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlllllIlII(nearest) && lIIlllllIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[6]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lIlllllII[3]);
                    "".length();
                }
                if (lIIlllllIlII(nearest) && lIIlllllIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[7]];
                    if (lIIlllllIIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlllllII[8]);
                        "".length();
                    }
                    if (lIIlllllIIII(Bank.isOpen() ? 1 : 0)) {
                        if (lIIlllllIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlllllII[7]);
                            "".length();
                        }
                        if (lIIlllllIIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlllllII[3]);
                            "".length();
                        }
                        int[] iArr2 = new int[lIlllllII[1]];
                        iArr2[lIlllllII[0]] = lIlllllII[9];
                        if (lIIlllllIIlI(C0004e.b(iArr2) ? 1 : 0)) {
                            af();
                            System.out.println(lIllllIlI[lIlllllII[10]]);
                            bt = lIlllllII[1];
                            return;
                        }
                        int[] iArr3 = new int[lIlllllII[1]];
                        iArr3[lIlllllII[0]] = lIlllllII[9];
                        if (lIIlllllIIII(C0004e.b(iArr3) ? 1 : 0)) {
                            C0000a.a(lIlllllII[9], lIlllllII[1]);
                            C0000a.b(C0005f.aV, lIlllllII[3]);
                            C0000a.a(lIlllllII[11], lIlllllII[12]);
                            C0000a.b(C0005f.bf, lIlllllII[1]);
                        }
                    }
                }
            }
            if (lIIlllllIIII(ab() ? 1 : 0) && lIIlllllIIIl(C0004e.j(lIlllllII[5]), lIlllllII[1])) {
                if (lIIlllllIlIl(Players.getLocal().getWorldLocation().distanceTo(jM), lIlllllII[13])) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[14]];
                    if (lIIlllllIIIl(bT, lIlllllII[1])) {
                        C0004e.v();
                        bT += lIlllllII[1];
                    }
                    Movement.walkTo(jM);
                    "".length();
                    Time.sleepTicks(lIlllllII[1]);
                    "".length();
                }
                if (lIIlllllIllI(Players.getLocal().getWorldLocation().distanceTo(jM), lIlllllII[13])) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[15]];
                    C0006g.a(lIllllIlI[lIlllllII[13]], bR);
                }
            }
            if (lIIlllllIlll(C0004e.j(lIlllllII[5]), lIlllllII[12])) {
                if (lIIlllllIlIl(Players.getLocal().getWorldLocation().distanceTo(jN), lIlllllII[3])) {
                    if (lIIlllllIIII(Inventory.contains(C0005f.bf) ? 1 : 0) && lIIlllllIIlI(Equipment.contains(C0005f.bf) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.bf).interact(lIllllIlI[lIlllllII[16]]);
                        Time.sleepTicks(lIlllllII[1]);
                        "".length();
                    }
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[12]];
                    Movement.walkTo(jN);
                    "".length();
                    Time.sleepTicks(lIlllllII[1]);
                    "".length();
                }
                if (lIIlllllIllI(Players.getLocal().getWorldLocation().distanceTo(jN), lIlllllII[3])) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[17]];
                    TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                        if (lIIlllllIIII(tileObject.getName().contains(lIllllIlI[lIlllllII[59]]) ? 1 : 0) && lIIlllllIllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlllllII[56], lIlllllII[57], lIlllllII[1])), lIlllllII[3])) {
                            String[] strArr = new String[lIlllllII[1]];
                            strArr[lIlllllII[0]] = lIllllIlI[lIlllllII[60]];
                            if (lIIlllllIIII(tileObject.hasAction(strArr) ? 1 : 0)) {
                                ?? r0 = lIlllllII[1];
                                "".length();
                                return 0 != 0 ? ((((173 + 57) - 6) + 8) ^ (((175 + 145) - 268) + 144)) & (((116 ^ 75) ^ (61 ^ 46)) ^ (-" ".length())) : r0;
                            }
                        }
                        return lIlllllII[0];
                    });
                    if (lIIlllllIlII(nearest2)) {
                        nearest2.interact(lIllllIlI[lIlllllII[18]]);
                        Time.sleepTicks(lIlllllII[6]);
                        "".length();
                    }
                    C0006g.a(lIllllIlI[lIlllllII[19]], bR);
                }
            }
            if (lIIlllllIlll(C0004e.j(lIlllllII[5]), lIlllllII[20])) {
                if (lIIlllllIlIl(Players.getLocal().getWorldLocation().distanceTo(jM), lIlllllII[13])) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[21]];
                    Movement.walkTo(jM);
                    "".length();
                    Time.sleepTicks(lIlllllII[1]);
                    "".length();
                }
                if (lIIlllllIllI(Players.getLocal().getWorldLocation().distanceTo(jM), lIlllllII[13])) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[22]];
                    C0006g.a(lIllllIlI[lIlllllII[23]], bR);
                }
            }
            if (lIIlllllIlll(C0004e.j(lIlllllII[5]), lIlllllII[24])) {
                if (lIIlllllIlIl(Players.getLocal().getWorldLocation().distanceTo(jO), lIlllllII[10])) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[25]];
                    Movement.walkTo(jO);
                    "".length();
                    Time.sleepTicks(lIlllllII[1]);
                    "".length();
                }
                if (lIIlllllIllI(Players.getLocal().getWorldLocation().distanceTo(jO), lIlllllII[10])) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[26]];
                    C0006g.a(lIllllIlI[lIlllllII[27]], bR);
                }
                C0006g.a(bR);
            }
            if (lIIlllllIlll(C0004e.j(lIlllllII[5]), lIlllllII[28])) {
                if (lIIlllllIIlI(ab() ? 1 : 0)) {
                    ck();
                }
                if (lIIlllllIIII(ab() ? 1 : 0)) {
                    if (lIIlllllIlIl(Players.getLocal().getWorldLocation().distanceTo(jP), lIlllllII[10])) {
                        AccBuilderEasyClues.c = lIllllIlI[lIlllllII[20]];
                        Movement.walkTo(jP);
                        "".length();
                        Time.sleepTicks(lIlllllII[1]);
                        "".length();
                    }
                    if (lIIlllllIllI(Players.getLocal().getWorldLocation().distanceTo(jP), lIlllllII[10])) {
                        AccBuilderEasyClues.c = lIllllIlI[lIlllllII[29]];
                        C0006g.a(lIllllIlI[lIlllllII[30]], bR);
                    }
                }
            }
            if (lIIlllllIlll(C0004e.j(lIlllllII[5]), lIlllllII[2])) {
                String[] strArr = new String[lIlllllII[1]];
                strArr[lIlllllII[0]] = lIllllIlI[lIlllllII[31]];
                if (lIIlllllIIlI(Inventory.contains(strArr) ? 1 : 0) && lIIlllllIlIl(Players.getLocal().getWorldLocation().distanceTo(jP), lIlllllII[10])) {
                    if (lIIlllllIIlI(ab() ? 1 : 0)) {
                        ck();
                    }
                    if (lIIlllllIIII(ab() ? 1 : 0) && lIIlllllIlIl(Players.getLocal().getWorldLocation().distanceTo(jP), lIlllllII[10])) {
                        AccBuilderEasyClues.c = lIllllIlI[lIlllllII[32]];
                        Movement.walkTo(jP);
                        "".length();
                        Time.sleepTicks(lIlllllII[1]);
                        "".length();
                    }
                }
            }
            if (lIIlllllIlll(C0004e.j(lIlllllII[5]), lIlllllII[2])) {
                String[] strArr2 = new String[lIlllllII[1]];
                strArr2[lIlllllII[0]] = lIllllIlI[lIlllllII[33]];
                if (lIIlllllIIlI(Inventory.contains(strArr2) ? 1 : 0) && lIIlllllIllI(Players.getLocal().getWorldLocation().distanceTo(jP), lIlllllII[10])) {
                    cl = lIlllllII[0];
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[34]];
                    C0006g.a(lIllllIlI[lIlllllII[35]], bR);
                }
            }
            if (lIIlllllIlll(C0004e.j(lIlllllII[5]), lIlllllII[2])) {
                String[] strArr3 = new String[lIlllllII[1]];
                strArr3[lIlllllII[0]] = lIllllIlI[lIlllllII[36]];
                if (lIIlllllIIII(Inventory.contains(strArr3) ? 1 : 0)) {
                    if (lIIlllllIlIl(Players.getLocal().getWorldLocation().distanceTo(jN), lIlllllII[3])) {
                        if (lIIlllllIIII(Inventory.contains(C0005f.bf) ? 1 : 0) && lIIlllllIIlI(Equipment.contains(C0005f.bf) ? 1 : 0)) {
                            Inventory.getFirst(C0005f.bf).interact(lIllllIlI[lIlllllII[37]]);
                            Time.sleepTicks(lIlllllII[1]);
                            "".length();
                        }
                        AccBuilderEasyClues.c = lIllllIlI[lIlllllII[24]];
                        Movement.walkTo(jN);
                        "".length();
                        Time.sleepTicks(lIlllllII[1]);
                        "".length();
                    }
                    if (lIIlllllIllI(Players.getLocal().getWorldLocation().distanceTo(jN), lIlllllII[3])) {
                        AccBuilderEasyClues.c = lIllllIlI[lIlllllII[38]];
                        TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                            if (lIIlllllIIII(tileObject2.getName().contains(lIllllIlI[lIlllllII[55]]) ? 1 : 0) && lIIlllllIllI(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIlllllII[56], lIlllllII[57], lIlllllII[1])), lIlllllII[3])) {
                                String[] strArr4 = new String[lIlllllII[1]];
                                strArr4[lIlllllII[0]] = lIllllIlI[lIlllllII[58]];
                                if (lIIlllllIIII(tileObject2.hasAction(strArr4) ? 1 : 0)) {
                                    ?? r0 = lIlllllII[1];
                                    "".length();
                                    return "  ".length() < ((18 ^ 88) & ((126 ^ 52) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                            }
                            return lIlllllII[0];
                        });
                        if (lIIlllllIlII(nearest3)) {
                            nearest3.interact(lIllllIlI[lIlllllII[39]]);
                            Time.sleepTicks(lIlllllII[6]);
                            "".length();
                        }
                        C0006g.a(lIllllIlI[lIlllllII[40]], bR);
                    }
                    C0006g.a(bR);
                }
            }
            if (lIIlllllIlll(C0004e.j(lIlllllII[5]), lIlllllII[41])) {
                if (lIIlllllIlIl(Players.getLocal().getWorldLocation().distanceTo(jM), lIlllllII[13]) && lIIlllllIIlI(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[42]];
                    Movement.walkTo(jM);
                    "".length();
                    Time.sleepTicks(lIlllllII[1]);
                    "".length();
                }
                if (lIIlllllIllI(Players.getLocal().getWorldLocation().distanceTo(jM), lIlllllII[13])) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[43]];
                    if (lIIlllllIIIl(cl, lIlllllII[1])) {
                        an.pE += lIlllllII[1];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIlllllII[1];
                        an.pE = lIlllllII[0];
                        cm = lIlllllII[0];
                    }
                    C0006g.a(lIllllIlI[lIlllllII[44]], bR);
                    Time.sleepTicks(lIlllllII[10]);
                    "".length();
                }
            }
            C0006g.a(bR);
            System.out.println("Setting: " + C0004e.j(lIlllllII[5]));
        }
    }

    private static boolean lIIlllllIlll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlllllIIlI(int i) {
        return i == 0;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIllllIlI[lIlllllII[28]];
    }
}
