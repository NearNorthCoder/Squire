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
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.E  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/E.class */
public class E implements G {
    private static /* synthetic */ int[] lIIIllllII;
    public static final /* synthetic */ String[] ik;
    static /* synthetic */ boolean cl;
    static /* synthetic */ int bT;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ WorldPoint il;
    private static final /* synthetic */ WorldPoint im;
    private static final /* synthetic */ WorldPoint io;
    private static /* synthetic */ String[] lIIIlllIlI;
    private static final /* synthetic */ WorldPoint in;
    static /* synthetic */ int ck;
    public static /* synthetic */ List<C0003d> bv;

    private static boolean llllIIlIIllI(int i, int i2) {
        return i < i2;
    }

    private static void llllIIIlllll() {
        lIIIlllIlI = new String[lIIIllllII[74]];
        lIIIlllIlI[lIIIllllII[0]] = llllIIIlllII("DTATEQIoZQMMCSI2", "OEjxl");
        lIIIlllIlI[lIIIllllII[1]] = llllIIIlllIl("F8PBwMXb6iQSGEGnBn42qKKuEHkCPc4Yr3/0jmg7yMJlwhkqgaZXFV8Vxgszi0jQ", "vAuaN");
        lIIIlllIlI[lIIIllllII[3]] = llllIIIlllIl("o4GKgSwmfU4=", "GKpbB");
        lIIIlllIlI[lIIIllllII[5]] = llllIIIllllI("4VIolVAB8/s=", "HROKo");
        lIIIlllIlI[lIIIllllII[7]] = llllIIIllllI("QT1PVfidcDaN9ExrzMx+sA==", "ArgQE");
        lIIIlllIlI[lIIIllllII[8]] = llllIIIlllII("BiQAJjgnKwliNi8rBSs6KQ==", "NEnBT");
        lIIIlllIlI[lIIIllllII[14]] = llllIIIllllI("LaBdePU0Ww8d0QlNnuFWuEhDr4xRnCTjU5E7qGw9Gzyi0chTcGIxGg7Fm5XN5RYpfNaOLo/Lp3k=", "yVRFz");
        lIIIlllIlI[lIIIllllII[20]] = llllIIIllllI("DPPoRdXLHSeemPbY7u/Yjw==", "VzhvG");
        lIIIlllIlI[lIIIllllII[18]] = llllIIIlllII("IgY/YwwDRzo3GR4T", "lgICx");
        lIIIlllIlI[lIIIllllII[21]] = llllIIIlllIl("JffAyzlVot6Upzih6R3MzA==", "HufCP");
        lIIIlllIlI[lIIIllllII[15]] = llllIIIllllI("Qqx/aUr4Yvxhq3aTL3opbg==", "DMglv");
        lIIIlllIlI[lIIIllllII[19]] = llllIIIlllII("FzYcaRE2dwQsBjI7CyoAeTAfMA==", "YWjIe");
        lIIIlllIlI[lIIIllllII[22]] = llllIIIllllI("sUPPkvTp/PbkcjKUriK5rw==", "pxjFZ");
        lIIIlllIlI[lIIIllllII[23]] = llllIIIlllIl("6V/ecHWl7pA=", "cHezF");
        lIIIlllIlI[lIIIllllII[24]] = llllIIIlllII("JSUQIA==", "jUuNw");
        lIIIlllIlI[lIIIllllII[25]] = llllIIIlllII("JDEOOA==", "kAkVr");
        lIIIlllIlI[lIIIllllII[26]] = llllIIIllllI("nlWbyUyA6dvXWLdnBteO8g==", "aEqWs");
        lIIIlllIlI[lIIIllllII[28]] = llllIIIlllIl("9+/6cdndJ30=", "mRpqB");
        lIIIlllIlI[lIIIllllII[29]] = llllIIIllllI("FLCnE3cq9PpnEPG/E2FysA==", "rTAnM");
        lIIIlllIlI[lIIIllllII[30]] = llllIIIllllI("AkBkzC3bcnvFNQqpJvF1vw==", "KJwyO");
        lIIIlllIlI[lIIIllllII[31]] = llllIIIlllIl("/wNzxvBd9YPDxiLmkU0HFg==", "QcYhQ");
        lIIIlllIlI[lIIIllllII[32]] = llllIIIlllIl("spcf5tgVoveBhbWHHfz6KA==", "VgfdL");
        lIIIlllIlI[lIIIllllII[33]] = llllIIIllllI("V+B87SaoA9A=", "BvEVz");
        lIIIlllIlI[lIIIllllII[34]] = llllIIIlllIl("tNxmoauIqJ8=", "KTSsa");
        lIIIlllIlI[lIIIllllII[35]] = llllIIIllllI("Os3C1KxE7JuvHQ+x9VV3NQ==", "noVoX");
        lIIIlllIlI[lIIIllllII[36]] = llllIIIlllIl("itlBqpIHywUL8YyXbNSXpA==", "sYVaT");
        lIIIlllIlI[lIIIllllII[37]] = llllIIIlllII("DyAdFgE=", "NLiws");
        lIIIlllIlI[lIIIllllII[38]] = llllIIIlllII("NCggJxUP", "gMAUv");
        lIIIlllIlI[lIIIllllII[39]] = llllIIIllllI("I7wbeBlwyeA=", "cYKWs");
        lIIIlllIlI[lIIIllllII[40]] = llllIIIlllII("Jwg/VBoGSSobCA8AJw==", "iiItn");
        lIIIlllIlI[lIIIllllII[41]] = llllIIIlllII("IjMqIQkDPCNlBgU0IiwL", "jRDEe");
        lIIIlllIlI[lIIIllllII[42]] = llllIIIlllII("MAE3MxEd", "snQUx");
        lIIIlllIlI[lIIIllllII[43]] = llllIIIlllIl("TBvUOuNoIFA=", "jDEgh");
        lIIIlllIlI[lIIIllllII[44]] = llllIIIlllIl("pLpKSlQJL58=", "hNeBi");
        lIIIlllIlI[lIIIllllII[45]] = llllIIIllllI("BiGmjmddzqgkEqPnInDpMw==", "KAVBd");
        lIIIlllIlI[lIIIllllII[52]] = llllIIIllllI("IKw/C7/t1y03P70tehBaMpc9GXlS4a/S", "lnDul");
        lIIIlllIlI[lIIIllllII[53]] = llllIIIlllIl("H7wMKTF6zd94PdAlWzTUx59AJos8sRUK", "mkzQC");
        lIIIlllIlI[lIIIllllII[54]] = llllIIIllllI("SQ23luaqij9ffuQLUMITTi2lSFrHPLTBP1Jqyxdjl4I=", "tVMKk");
        lIIIlllIlI[lIIIllllII[55]] = llllIIIlllIl("xVLS6xI24DRikWqpCDx8542ssmY50rbotTHPavCmZq4wbp83nHvW9Q==", "SLBVr");
        lIIIlllIlI[lIIIllllII[56]] = llllIIIlllIl("SzJl4l1Xi7Q4rHTFvsCxbjBVrRuMN7B3", "lFqyb");
        lIIIlllIlI[lIIIllllII[57]] = llllIIIlllII("Ky0XQw==", "rHdmT");
        lIIIlllIlI[lIIIllllII[58]] = llllIIIllllI("VPGsPbyzmqzrJ/VBBLuBx4aISWnTV2qyas7NNzl0N3k=", "MMzBg");
        lIIIlllIlI[lIIIllllII[59]] = llllIIIlllII("LCZvSScGOWMELkMlJgU7QzkrDCVN", "cMCiK");
        lIIIlllIlI[lIIIllllII[60]] = llllIIIlllIl("Xb20QBzjn4gGK0d+uIuXE6SpBCiMaqJSMqs4VWGV8YyAo/dhu3jKlA==", "vhzUy");
        lIIIlllIlI[lIIIllllII[61]] = llllIIIlllIl("F63fhaPvaV/TsC0En8eczTzmSZJJcPYbsemwT1JTc09FqO4dzQ0QH/Ag+ifCXaAP", "pgsbk");
        lIIIlllIlI[lIIIllllII[62]] = llllIIIlllII("DzIKSWQ4OA1FMDM7FkUpM3cNDSUidw4NIXYnCAomOjIXRS0leQ==", "VWzeD");
        lIIIlllIlI[lIIIllllII[63]] = llllIIIlllII("KTk/F00=", "zLMrc");
        lIIIlllIlI[lIIIllllII[64]] = llllIIIlllIl("fb+k6vdK6kSqwlKo/ZuIXL/nP9JPmF1C5TxINe2FEkLIcpJTqHTc7g==", "ZYheO");
        lIIIlllIlI[lIIIllllII[65]] = llllIIIlllII("NRImQ1AlUDhPAxkFMEE=", "lwUop");
        lIIIlllIlI[lIIIllllII[66]] = llllIIIlllII("EBUYSyk5FE8iajAfAxt1", "XzokJ");
    }

    private static boolean llllIIlIIlIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (llllIIlIllll(C0004e.j(lIIIllllII[6]), lIIIllllII[8])) {
            ?? r0 = lIIIllllII[1];
            "".length();
            return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIllllII[0];
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            ck();
            "".length();
            if (0 != 0) {
                return (246 ^ 190) & ((214 ^ 158) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIllllII[51];
    }

    private static int llllIIlIIlII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llllIIlIlIll(Object obj) {
        return obj == null;
    }

    private static String llllIIIlllIl(String llIIlllllll, String llIlIIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIIIIIll = Cipher.getInstance("Blowfish");
            llIlIIIIIll.init(lIIIllllII[3], secretKeySpec);
            return new String(llIlIIIIIll.doFinal(Base64.getDecoder().decode(llIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIIIIlI) {
            llIlIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static String llllIIIllllI(String llIIlllIlII, String llIIlllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlllIIll.getBytes(StandardCharsets.UTF_8)), lIIIllllII[18]), "DES");
            Cipher llIIlllIllI = Cipher.getInstance("DES");
            llIIlllIllI.init(lIIIllllII[3], secretKeySpec);
            return new String(llIIlllIllI.doFinal(Base64.getDecoder().decode(llIIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlllIlIl) {
            llIIlllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIlIlIII(int i) {
        return i < 0;
    }

    private static boolean llllIIlIlIlI(Object obj) {
        return obj != null;
    }

    private static boolean llllIIlIllII(int i, int i2) {
        return i > i2;
    }

    private static boolean llllIIlIllIl(int i, int i2) {
        return i == i2;
    }

    private static void af() {
        int[] iArr = new int[lIIIllllII[1]];
        iArr[lIIIllllII[0]] = lIIIllllII[10];
        if (llllIIlIIlll(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIIIllllII[10], lIIIllllII[1], lIIIllllII[46]));
            "".length();
        }
        int[] iArr2 = new int[lIIIllllII[1]];
        iArr2[lIIIllllII[0]] = lIIIllllII[4];
        if (llllIIlIIlll(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIIllllII[4], lIIIllllII[15], lIIIllllII[47]));
            "".length();
        }
        if (llllIIlIIlll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIlllIlI[lIIIllllII[53]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIIllllII[48], lIIIllllII[8], lIIIllllII[49]));
            "".length();
        }
        int[] iArr3 = new int[lIIIllllII[1]];
        iArr3[lIIIllllII[0]] = lIIIllllII[11];
        if (llllIIlIIlll(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIIllllII[11], lIIIllllII[15], lIIIllllII[50]));
            "".length();
        }
        int[] iArr4 = new int[lIIIllllII[1]];
        iArr4[lIIIllllII[0]] = lIIIllllII[13];
        if (llllIIlIIlll(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIIllllII[13], lIIIllllII[31], lIIIllllII[50]));
            "".length();
        }
        int[] iArr5 = new int[lIIIllllII[1]];
        iArr5[lIIIllllII[0]] = lIIIllllII[12];
        if (llllIIlIIlll(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIIllllII[12], lIIIllllII[8], C0008i.bq));
            "".length();
        }
    }

    private static boolean llllIIlIlllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean llllIIlIIlll(int i) {
        return i == 0;
    }

    private static boolean llllIIlIllll(int i, int i2) {
        return i >= i2;
    }

    private static void llllIIlIIIll() {
        lIIIllllII = new int[75];
        lIIIllllII[0] = (163 ^ 156) & ((150 ^ 169) ^ (-1));
        lIIIllllII[1] = " ".length();
        lIIIllllII[2] = (((192 + 90) - 194) + 163) ^ (((47 + 85) - 88) + 145);
        lIIIllllII[3] = "  ".length();
        lIIIllllII[4] = (-((-4149) & 22709)) & (-8705) & 27643;
        lIIIllllII[5] = "   ".length();
        lIIIllllII[6] = 82 ^ 57;
        lIIIllllII[7] = (((55 + 95) - 17) + 57) ^ (((142 + 170) - 173) + 47);
        lIIIllllII[8] = (((48 + 104) - 89) + 76) ^ (((47 + 44) - (-19)) + 32);
        lIIIllllII[9] = (-((-4356) & 31099)) & (-1025) & 32767;
        lIIIllllII[10] = (-((-12123) & 32603)) & (-1) & 32458;
        lIIIllllII[11] = (-((-13026) & 29415)) & (-17) & 24413;
        lIIIllllII[12] = (-2733) & 15357;
        lIIIllllII[13] = (-((-18451) & 26811)) & (-16401) & 32767;
        lIIIllllII[14] = (((45 + 86) - (-11)) + 45) ^ (((69 + 49) - 67) + 138);
        lIIIllllII[15] = 147 ^ 153;
        lIIIllllII[16] = (-((-8705) & 29511)) & (-8705) & 32750;
        lIIIllllII[17] = (-((-31753) & 32346)) & (-12323) & 16119;
        lIIIllllII[18] = 59 ^ 51;
        lIIIllllII[19] = 157 ^ 150;
        lIIIllllII[20] = (99 ^ 107) ^ (107 ^ 100);
        lIIIllllII[21] = (158 ^ 155) ^ (33 ^ 45);
        lIIIllllII[22] = (((8 + 109) - (-3)) + 8) ^ (((71 + 81) - 127) + 115);
        lIIIllllII[23] = (20 ^ 17) ^ (207 ^ 199);
        lIIIllllII[24] = 29 ^ 19;
        lIIIllllII[25] = (88 ^ 23) ^ (5 ^ 69);
        lIIIllllII[26] = 107 ^ 123;
        lIIIllllII[27] = (-((-21643) & 23707)) & (-8260) & 10875;
        lIIIllllII[28] = 67 ^ 82;
        lIIIllllII[29] = 115 ^ 97;
        lIIIllllII[30] = (116 ^ 126) ^ (105 ^ 112);
        lIIIllllII[31] = 209 ^ 197;
        lIIIllllII[32] = (((163 + 181) - 225) + 63) ^ (((62 + 37) - 12) + 76);
        lIIIllllII[33] = 167 ^ 177;
        lIIIllllII[34] = (((39 + 16) - (-18)) + 62) ^ (((94 + 28) - 50) + 72);
        lIIIllllII[35] = (150 ^ 192) ^ (50 ^ 124);
        lIIIllllII[36] = (47 ^ 106) ^ (225 ^ 189);
        lIIIllllII[37] = 6 ^ 28;
        lIIIllllII[38] = 39 ^ 60;
        lIIIllllII[39] = 222 ^ 194;
        lIIIllllII[40] = 60 ^ 33;
        lIIIllllII[41] = (89 ^ 40) ^ (93 ^ 50);
        lIIIllllII[42] = 102 ^ 121;
        lIIIllllII[43] = (((61 + 102) - 119) + 144) ^ (((64 + 43) - 20) + 69);
        lIIIllllII[44] = 50 ^ 19;
        lIIIllllII[45] = (((125 + 65) - 159) + 116) ^ (((166 + 124) - 129) + 16);
        lIIIllllII[46] = (-16834) & 32733;
        lIIIllllII[47] = (-((-4115) & 6390)) & (-1) & 8175;
        lIIIllllII[48] = (-((-3649) & 24146)) & (-35) & 32511;
        lIIIllllII[49] = (-2583) & 27582;
        lIIIllllII[50] = (-20484) & 22383;
        lIIIllllII[51] = 14 ^ 106;
        lIIIllllII[52] = "  ".length() ^ (49 ^ 16);
        lIIIllllII[53] = (222 ^ 199) ^ (142 ^ 179);
        lIIIllllII[54] = 231 ^ 194;
        lIIIllllII[55] = (((29 + 56) - 72) + 115) ^ (((14 + 59) - (-80)) + 13);
        lIIIllllII[56] = (((130 + 80) - 95) + 38) ^ (((44 + 159) - 59) + 46);
        lIIIllllII[57] = 119 ^ 95;
        lIIIllllII[58] = 98 ^ 75;
        lIIIllllII[59] = 81 ^ 123;
        lIIIllllII[60] = 70 ^ 109;
        lIIIllllII[61] = (((105 + 104) - 84) + 8) ^ (((6 + 91) - 69) + 141);
        lIIIllllII[62] = (((32 + 26) - (-154)) + 23) ^ (((17 + 134) - 105) + 152);
        lIIIllllII[63] = 149 ^ 187;
        lIIIllllII[64] = 159 ^ 176;
        lIIIllllII[65] = (124 ^ 36) ^ (211 ^ 187);
        lIIIllllII[66] = 117 ^ 68;
        lIIIllllII[67] = (-869) & 4078;
        lIIIllllII[68] = (-((-3561) & 8186)) & (-33) & 7803;
        lIIIllllII[69] = (-8984) & 12159;
        lIIIllllII[70] = (-8263) & 11511;
        lIIIllllII[71] = (-((-25889) & 30117)) & (-25346) & 32767;
        lIIIllllII[72] = (-8898) & 12015;
        lIIIllllII[73] = (-16898) & 26463;
        lIIIllllII[74] = 22 ^ 36;
    }

    private static boolean llllIIlIlIIl(int i) {
        return i > 0;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIIlllIlI[lIIIllllII[52]];
    }

    private static String llllIIIlllII(String llIIllIIlII, String llIIllIIIll) {
        String llIIllIIlII2 = new String(Base64.getDecoder().decode(llIIllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIllIIIlI = new StringBuilder();
        char[] llIIllIIIIl = llIIllIIIll.toCharArray();
        int llIIllIIIII = lIIIllllII[0];
        char[] charArray = llIIllIIlII2.toCharArray();
        int length = charArray.length;
        int i = lIIIllllII[0];
        while (llllIIlIIllI(i, length)) {
            char llIIlIlIlll = charArray[i];
            llIIllIIIlI.append((char) (llIIlIlIlll ^ llIIllIIIIl[llIIllIIIII % llIIllIIIIl.length]));
            "".length();
            llIIllIIIII++;
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(llIIllIIIlI);
    }

    static {
        llllIIlIIIll();
        llllIIIlllll();
        String[] strArr = new String[lIIIllllII[23]];
        strArr[lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[54]];
        strArr[lIIIllllII[1]] = lIIIlllIlI[lIIIllllII[55]];
        strArr[lIIIllllII[3]] = lIIIlllIlI[lIIIllllII[56]];
        strArr[lIIIllllII[5]] = lIIIlllIlI[lIIIllllII[57]];
        strArr[lIIIllllII[7]] = lIIIlllIlI[lIIIllllII[58]];
        strArr[lIIIllllII[8]] = lIIIlllIlI[lIIIllllII[59]];
        strArr[lIIIllllII[14]] = lIIIlllIlI[lIIIllllII[60]];
        strArr[lIIIllllII[20]] = lIIIlllIlI[lIIIllllII[61]];
        strArr[lIIIllllII[18]] = lIIIlllIlI[lIIIllllII[62]];
        strArr[lIIIllllII[21]] = lIIIlllIlI[lIIIllllII[63]];
        strArr[lIIIllllII[15]] = lIIIlllIlI[lIIIllllII[64]];
        strArr[lIIIllllII[19]] = lIIIlllIlI[lIIIllllII[65]];
        strArr[lIIIllllII[22]] = lIIIlllIlI[lIIIllllII[66]];
        ik = strArr;
        il = new WorldPoint(lIIIllllII[16], lIIIllllII[67], lIIIllllII[0]);
        im = new WorldPoint(lIIIllllII[68], lIIIllllII[69], lIIIllllII[0]);
        in = new WorldPoint(lIIIllllII[70], lIIIllllII[71], lIIIllllII[0]);
        io = new WorldPoint(lIIIllllII[72], lIIIllllII[73], lIIIllllII[0]);
        bv = new ArrayList();
        bT = lIIIllllII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v288, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v333, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v69, types: [boolean] */
    public static void ck() {
        if (llllIIlIIlIl(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[0]];
            C0001b.a(bv);
            if (llllIIlIIllI(bv.size(), lIIIllllII[1])) {
                System.out.println(lIIIlllIlI[lIIIllllII[1]]);
                bt = lIIIllllII[0];
            }
        }
        if (llllIIlIIlll(bt ? 1 : 0)) {
            if (llllIIlIIlIl(Inventory.contains(C0005f.aV) ? 1 : 0) && llllIIlIIllI(Movement.getRunEnergy(), lIIIllllII[2])) {
                Inventory.getFirst(C0005f.aV).interact(lIIIlllIlI[lIIIllllII[3]]);
                Time.sleepTicks(lIIIllllII[1]);
                "".length();
            }
            if (llllIIlIlIII(llllIIlIIlII(C0004e.u(), 70.0d))) {
                int[] iArr = new int[lIIIllllII[1]];
                iArr[lIIIllllII[0]] = lIIIllllII[4];
                if (llllIIlIIlIl(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIIllllII[1]];
                    iArr2[lIIIllllII[0]] = lIIIllllII[4];
                    Inventory.getFirst(iArr2).interact(lIIIlllIlI[lIIIllllII[5]]);
                }
            }
            if (llllIIlIIlll(Movement.isRunEnabled() ? 1 : 0) && llllIIlIlIIl(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (llllIIlIIlll(ab() ? 1 : 0) && llllIIlIIllI(C0004e.j(lIIIllllII[6]), lIIIllllII[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llllIIlIlIlI(nearest) && llllIIlIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[7]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lIIIllllII[3]);
                    "".length();
                }
                if (llllIIlIlIlI(nearest) && llllIIlIIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[8]];
                    if (llllIIlIIlll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIllllII[9]);
                        "".length();
                    }
                    if (llllIIlIIlIl(Bank.isOpen() ? 1 : 0)) {
                        if (llllIIlIlIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIllllII[7]);
                            "".length();
                        }
                        if (llllIIlIlIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIllllII[3]);
                            "".length();
                        }
                        int[] iArr3 = new int[lIIIllllII[8]];
                        iArr3[lIIIllllII[0]] = lIIIllllII[10];
                        iArr3[lIIIllllII[1]] = lIIIllllII[11];
                        iArr3[lIIIllllII[3]] = lIIIllllII[12];
                        iArr3[lIIIllllII[5]] = lIIIllllII[13];
                        iArr3[lIIIllllII[7]] = lIIIllllII[4];
                        if (llllIIlIIlll(C0004e.b(iArr3) ? 1 : 0)) {
                            af();
                            System.out.println(lIIIlllIlI[lIIIllllII[14]]);
                            bt = lIIIllllII[1];
                            return;
                        }
                        Bank.withdraw(lIIIllllII[11], lIIIllllII[15], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllII[1]);
                        "".length();
                        Bank.withdraw(lIIIllllII[13], lIIIllllII[8], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllII[1]);
                        "".length();
                        Bank.withdraw(lIIIllllII[10], lIIIllllII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllII[1]);
                        "".length();
                        C0000a.b(C0005f.aV, lIIIllllII[1]);
                        C0000a.a(lIIIllllII[4], lIIIllllII[15]);
                        C0000a.b(C0005f.bf, lIIIllllII[1]);
                    }
                }
            }
            if (llllIIlIIlIl(ab() ? 1 : 0) && llllIIlIIllI(C0004e.j(lIIIllllII[6]), lIIIllllII[1])) {
                new WorldArea(lIIIllllII[16], lIIIllllII[17], lIIIllllII[18], lIIIllllII[19], lIIIllllII[0]);
                String[] strArr = new String[lIIIllllII[1]];
                strArr[lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[20]];
                NPC nearest2 = NPCs.getNearest(strArr);
                if (llllIIlIlIll(nearest2) && llllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(il), lIIIllllII[5]) && llllIIlIIlll(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[18]];
                    if (llllIIlIIllI(bT, lIIIllllII[1])) {
                        C0004e.v();
                        bT += lIIIllllII[1];
                    }
                    Movement.walkTo(il);
                    "".length();
                    Time.sleepTicks(lIIIllllII[1]);
                    "".length();
                }
                if (llllIIlIlIlI(nearest2)) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[21]];
                    C0006g.a(lIIIlllIlI[lIIIllllII[15]], ik, lIIIllllII[1]);
                }
            }
            if (llllIIlIllIl(C0004e.j(lIIIllllII[6]), lIIIllllII[1])) {
                if (llllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(im), lIIIllllII[14])) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[19]];
                    Movement.walkTo(im);
                    "".length();
                    Time.sleepTicks(lIIIllllII[1]);
                    "".length();
                }
                if (llllIIlIlllI(Players.getLocal().getWorldLocation().distanceTo(im), lIIIllllII[14])) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[22]];
                    String[] strArr2 = new String[lIIIllllII[1]];
                    strArr2[lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[23]];
                    TileObject nearest3 = TileObjects.getNearest(strArr2);
                    if (llllIIlIlIlI(nearest3)) {
                        String[] strArr3 = new String[lIIIllllII[1]];
                        strArr3[lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[24]];
                        if (llllIIlIIlIl(nearest3.hasAction(strArr3) ? 1 : 0)) {
                            nearest3.interact(lIIIlllIlI[lIIIllllII[25]]);
                            Time.sleepTicks(lIIIllllII[8]);
                            "".length();
                        }
                    }
                    C0006g.a(lIIIlllIlI[lIIIllllII[26]], ik);
                }
            }
            if (llllIIlIllIl(C0004e.j(lIIIllllII[6]), lIIIllllII[3])) {
                if (llllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(in), lIIIllllII[3])) {
                    int[] iArr4 = new int[lIIIllllII[1]];
                    iArr4[lIIIllllII[0]] = lIIIllllII[27];
                    if (llllIIlIIlIl(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIIIllllII[1]];
                        iArr5[lIIIllllII[0]] = lIIIllllII[27];
                        Inventory.getFirst(iArr5).interact(lIIIlllIlI[lIIIllllII[28]]);
                        Time.sleepTicks(lIIIllllII[1]);
                        "".length();
                    }
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[29]];
                    Movement.walkTo(in);
                    "".length();
                    Time.sleepTicks(lIIIllllII[1]);
                    "".length();
                }
                if (llllIIlIlllI(Players.getLocal().getWorldLocation().distanceTo(in), lIIIllllII[3])) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[30]];
                    String[] strArr4 = new String[lIIIllllII[1]];
                    strArr4[lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[31]];
                    NPC nearest4 = NPCs.getNearest(strArr4);
                    if (llllIIlIlIlI(nearest4)) {
                        C0006g.a(lIIIlllIlI[lIIIllllII[32]], ik);
                    }
                    if (llllIIlIlIll(nearest4)) {
                        String[] strArr5 = new String[lIIIllllII[1]];
                        strArr5[lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[33]];
                        TileObjects.getNearest(strArr5).interact(lIIIlllIlI[lIIIllllII[34]]);
                        Time.sleepTicks(lIIIllllII[3]);
                        "".length();
                    }
                }
            }
            if (llllIIlIllIl(C0004e.j(lIIIllllII[6]), lIIIllllII[5])) {
                ck = lIIIllllII[0];
                if (llllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(io), lIIIllllII[5])) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[35]];
                    Movement.walkTo(io);
                    "".length();
                    Time.sleepTicks(lIIIllllII[1]);
                    "".length();
                }
                if (llllIIlIlllI(Players.getLocal().getWorldLocation().distanceTo(io), lIIIllllII[5])) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[36]];
                    String[] strArr6 = new String[lIIIllllII[1]];
                    strArr6[lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[37]];
                    TileObject nearest5 = TileObjects.getNearest(strArr6);
                    if (llllIIlIlIlI(nearest5)) {
                        nearest5.interact(lIIIlllIlI[lIIIllllII[38]]);
                    }
                }
            }
            if (llllIIlIllIl(C0004e.j(lIIIllllII[6]), lIIIllllII[7])) {
                if (llllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(in), lIIIllllII[3])) {
                    int[] iArr6 = new int[lIIIllllII[1]];
                    iArr6[lIIIllllII[0]] = lIIIllllII[27];
                    if (llllIIlIIlIl(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIIIllllII[1]];
                        iArr7[lIIIllllII[0]] = lIIIllllII[27];
                        Inventory.getFirst(iArr7).interact(lIIIlllIlI[lIIIllllII[39]]);
                        Time.sleepTicks(lIIIllllII[1]);
                        "".length();
                    }
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[40]];
                    Movement.walkTo(in);
                    "".length();
                    Time.sleepTicks(lIIIllllII[1]);
                    "".length();
                }
                if (llllIIlIlllI(Players.getLocal().getWorldLocation().distanceTo(in), lIIIllllII[3])) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[41]];
                    String[] strArr7 = new String[lIIIllllII[1]];
                    strArr7[lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[42]];
                    TileObject nearest6 = TileObjects.getNearest(strArr7);
                    if (llllIIlIlIlI(nearest6)) {
                        String[] strArr8 = new String[lIIIllllII[1]];
                        strArr8[lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[43]];
                        if (llllIIlIIlIl(nearest6.hasAction(strArr8) ? 1 : 0)) {
                            nearest6.interact(lIIIlllIlI[lIIIllllII[44]]);
                            Time.sleepTicks(lIIIllllII[3]);
                            "".length();
                        }
                        String[] strArr9 = new String[lIIIllllII[1]];
                        strArr9[lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[45]];
                        Item first = Inventory.getFirst(strArr9);
                        if (llllIIlIlIlI(first)) {
                            if (llllIIlIIllI(ck, lIIIllllII[1])) {
                                U.mJ += lIIIllllII[1];
                                U.o(AccBuilderRogues.m);
                                ck += lIIIllllII[1];
                                U.mJ = lIIIllllII[0];
                                cl = lIIIllllII[0];
                            }
                            first.useOn(nearest6);
                            Time.sleepTicks(lIIIllllII[5]);
                            "".length();
                        }
                    }
                }
                C0006g.a(ik);
            }
            C0006g.a(new String[lIIIllllII[0]]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIIllllII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIIIllllII[1]];
        iArr[lIIIllllII[0]] = lIIIllllII[11];
        if (llllIIlIIlIl(Inventory.contains(iArr) ? 1 : 0) && ((!llllIIlIIlll(Inventory.contains(C0005f.aR) ? 1 : 0) || llllIIlIIlIl(Equipment.contains(C0005f.aR) ? 1 : 0)) && llllIIlIIlIl(Inventory.contains(C0005f.aV) ? 1 : 0))) {
            int[] iArr2 = new int[lIIIllllII[1]];
            iArr2[lIIIllllII[0]] = lIIIllllII[13];
            if (llllIIlIIlIl(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIIIllllII[1]];
                iArr3[lIIIllllII[0]] = lIIIllllII[4];
                if (llllIIlIIlIl(Inventory.contains(iArr3) ? 1 : 0)) {
                    ?? r0 = lIIIllllII[1];
                    "".length();
                    return 0 != 0 ? ((106 ^ 113) ^ (204 ^ 145)) & (((185 ^ 158) ^ (232 ^ 137)) ^ (-" ".length())) : r0;
                }
            }
        }
        return lIIIllllII[0];
    }
}
