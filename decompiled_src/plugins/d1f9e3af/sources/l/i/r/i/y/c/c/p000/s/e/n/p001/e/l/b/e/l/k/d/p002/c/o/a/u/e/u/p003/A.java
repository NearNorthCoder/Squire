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
import net.runelite.api.Item;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.A  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/A.class */
public class A implements W {
    static /* synthetic */ int cl;
    static /* synthetic */ WorldPoint dC;
    private static /* synthetic */ int[] lIlIIlllI;
    static /* synthetic */ WorldPoint dA;
    static /* synthetic */ String[] bR;
    static /* synthetic */ WorldPoint dB;
    static /* synthetic */ boolean cm;
    private static /* synthetic */ String[] lIlIIllII;
    public static /* synthetic */ List<C0003d> bv;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldPoint dD;
    static /* synthetic */ int dE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIIllIllIlI(Quests.getState(Quest.RECIPE_FOR_DISASTER__MOUNTAIN_DWARF), QuestState.FINISHED)) {
            ?? r0 = lIlIIlllI[5];
            "".length();
            return (-(78 ^ 74)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIlllI[6];
    }

    private static boolean lIIIllIlIIII(int i, int i2) {
        return i >= i2;
    }

    private static String lIIIlIllllII(String lllIlIllIlIlIl, String lllIlIllIlIlII) {
        try {
            SecretKeySpec lllIlIllIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIllIlIlII.getBytes(StandardCharsets.UTF_8)), lIlIIlllI[21]), "DES");
            Cipher lllIlIllIlIlll = Cipher.getInstance("DES");
            lllIlIllIlIlll.init(lIlIIlllI[8], lllIlIllIllIII);
            return new String(lllIlIllIlIlll.doFinal(Base64.getDecoder().decode(lllIlIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIllIlIllI) {
            lllIlIllIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIlIlll(Object obj) {
        return obj == null;
    }

    private static boolean lIIIllIlIIll(int i) {
        return i == 0;
    }

    private static boolean lIIIllIlIlII(Object obj) {
        return obj != null;
    }

    private static boolean lIIIllIlIllI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIlIIlllI[5]];
        iArr[lIlIIlllI[6]] = lIlIIlllI[25];
        if (lIIIllIlIlIl(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIlIIlllI[5]];
            iArr2[lIlIIlllI[6]] = lIlIIlllI[16];
            if (lIIIllIlIlIl(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lIlIIlllI[5]];
                iArr3[lIlIIlllI[6]] = lIlIIlllI[17];
                if (lIIIllIlIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIlIIlllI[5]];
                    iArr4[lIlIIlllI[6]] = lIlIIlllI[19];
                    if (lIIIllIlIIlI(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIlIIlllI[5]];
                        iArr5[lIlIIlllI[6]] = lIlIIlllI[10];
                        if (lIIIllIlIIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIlIIlllI[5]];
                            iArr6[lIlIIlllI[6]] = lIlIIlllI[22];
                            if (lIIIllIlIIlI(Inventory.contains(iArr6) ? 1 : 0)) {
                                int[] iArr7 = new int[lIlIIlllI[5]];
                                iArr7[lIlIIlllI[6]] = lIlIIlllI[26];
                                if (lIIIllIlIIlI(Inventory.contains(iArr7) ? 1 : 0)) {
                                    ?? r0 = lIlIIlllI[5];
                                    "".length();
                                    return (110 ^ 106) < ((63 ^ 26) & ((121 ^ 92) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                            }
                        }
                    }
                }
            }
        }
        return lIlIIlllI[6];
    }

    private static void lIIIllIIllIl() {
        lIlIIllII = new String[lIlIIlllI[79]];
        lIlIIllII[lIlIIlllI[6]] = lIIIlIlllIll("WfaToZQqoNL7MTO3bpgGtuIYt0EOKIJMKlNoq2cSvyMl0/EMd0QCyQIs4cJe2hfz", "shkgZ");
        lIlIIllII[lIlIIlllI[5]] = lIIIlIlllIll("j63zTWLHDxP96fOvj+sogw==", "uKMJI");
        lIlIIllII[lIlIIlllI[8]] = lIIIlIllllII("MB7dssVk9mU5D5hPH6d6qTUhFTmAaU+d", "ypDFI");
        lIlIIllII[lIlIIlllI[1]] = lIIIlIllllII("iWqFvKHmYYafP7K3gKMj8DRYAHXAQx6Qk+bz18eWOYFHPN6YpdCcdZDMDllRstzPuS3DfvHbTsQ=", "qIOuC");
        lIlIIllII[lIlIIlllI[9]] = lIIIlIllllII("6Uu4HmZTCmW5fBGFzoTFLnQ2b0NLxhHS630ZHEeQabnx1f7QotVueygr1MNZn2Y03dx5xeXJ71M=", "qHNcR");
        lIlIIllII[lIlIIlllI[3]] = lIIIlIlllIll("i5oc5dl5QOs=", "IdDGP");
        lIlIIllII[lIlIIlllI[18]] = lIIIlIllllII("puzvrK73UqE=", "xwDXJ");
        lIlIIllII[lIlIIlllI[20]] = lIIIlIlllIll("C7liuP9OdWIzBTfQRy5LVw==", "jGiOs");
        lIlIIllII[lIlIIlllI[21]] = lIIIlIllllIl("GwMoHg==", "ZqAmT");
        lIlIIllII[lIlIIlllI[23]] = lIIIlIllllIl("AzAzOAQ=", "GGRJb");
        lIlIIllII[lIlIIlllI[4]] = lIIIlIlllIll("H7NqOxv5Fds=", "CmUzj");
        lIlIIllII[lIlIIlllI[2]] = lIIIlIllllIl("Bgs+WCcnSi4ZPyQTaAgmKg==", "HjHxS");
        lIlIIllII[lIlIIlllI[29]] = lIIIlIllllIl("BjAnIyErcSovLDo=", "NQIGM");
        lIlIIllII[lIlIIlllI[30]] = lIIIlIllllII("iyPWYNBhxV0=", "Aytte");
        lIlIIllII[lIlIIlllI[31]] = lIIIlIlllIll("k4Fjsedua3vUP1p8KBQEHMmhFdWSnaVY", "Lqqmv");
        lIlIIllII[lIlIIlllI[32]] = lIIIlIllllII("dRMRdyxitjgHEnAsEWcH8w==", "MqQTg");
        lIlIIllII[lIlIIlllI[33]] = lIIIlIllllII("q++vicICC36164lvFSjikw==", "QCsnh");
        lIlIIllII[lIlIIlllI[36]] = lIIIlIlllIll("BopYIOUPvxuzDW5z0Hosk0QKV9ZY/k0C", "lhTrE");
        lIlIIllII[lIlIIlllI[37]] = lIIIlIllllIl("EDkkPgs9eCkyBiw=", "XXJZg");
        lIlIIllII[lIlIIlllI[38]] = lIIIlIlllIll("7RkgtdvEqJw8X+WIa3k6Qg==", "gNuqn");
        lIlIIllII[lIlIIlllI[34]] = lIIIlIlllIll("pesvulPsdlA=", "CIatL");
        lIlIIllII[lIlIIlllI[39]] = lIIIlIlllIll("F944vDMdEPJ5wdrWcvIDYw==", "WaZvI");
        lIlIIllII[lIlIIlllI[40]] = lIIIlIllllII("n3TmSMA8lug=", "fgfHf");
        lIlIIllII[lIlIIlllI[43]] = lIIIlIlllIll("PtfhLBAHVHbCxm66XW/pOQ==", "diiWB");
        lIlIIllII[lIlIIlllI[44]] = lIIIlIllllIl("GQQxAxs=", "KkYbp");
        lIlIIllII[lIlIIlllI[45]] = lIIIlIlllIll("+Py0fI0OFIU=", "RNQxQ");
        lIlIIllII[lIlIIlllI[47]] = lIIIlIllllII("L4W6NSQ9YFM=", "BzwRc");
        lIlIIllII[lIlIIlllI[48]] = lIIIlIlllIll("PTYDIgq1P9s=", "gzxFI");
        lIlIIllII[lIlIIlllI[49]] = lIIIlIlllIll("sp1gxSoDLzgDxvXJerYBNQ==", "cEQhK");
        lIlIIllII[lIlIIlllI[50]] = lIIIlIllllII("f7N3ikyHmh2AG5d++HyVIA==", "bIXou");
        lIlIIllII[lIlIIlllI[41]] = lIIIlIllllIl("GAoJCig0Bwg=", "QillA");
        lIlIIllII[lIlIIlllI[51]] = lIIIlIlllIll("wUEEG4lBIgc=", "JsBle");
        lIlIIllII[lIlIIlllI[55]] = lIIIlIllllIl("ExMsJw==", "RaETC");
        lIlIIllII[lIlIIlllI[56]] = lIIIlIllllII("3wP90VGai7s3bFyEbL+RQg==", "PfiMa");
        lIlIIllII[lIlIIlllI[57]] = lIIIlIllllIl("CTMHCw==", "HAnxR");
        lIlIIllII[lIlIIlllI[58]] = lIIIlIllllIl("IjMjHiUMMyMQdhUvKAQi", "dZMwV");
        lIlIIllII[lIlIIlllI[59]] = lIIIlIlllIll("C+bxmxfIQpY=", "yaZdS");
        lIlIIllII[lIlIIlllI[66]] = lIIIlIlllIll("d8b/AeZqH6a4zqOAAWdRfQ==", "zfXIr");
        lIlIIllII[lIlIIlllI[67]] = lIIIlIlllIll("gzsOR+6bLUjHOYqyfd9dcSpAc+14ppUq", "iLYnX");
        lIlIIllII[lIlIIlllI[76]] = lIIIlIllllIl("FQMDdA==", "LfpZW");
        lIlIIllII[lIlIIlllI[42]] = lIIIlIlllIll("Zdzx78KlVsQflLpe65Bi24qD1SyV6uGzblwHCw9cf4YYmRRNAbkPv2K+426PU3V8", "uCvmJ");
        lIlIIllII[lIlIIlllI[77]] = lIIIlIllllIl("JWcvDRoAI2wNCQoiPkIWAzJsEQABImwLAUw1KRYaHilgQgcDMGwDDQMyOEJdXHdsBQAAI3M=", "lGLbo");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIlIIlllI[6];
    }

    static {
        lIIIllIIlllI();
        lIIIllIIllIl();
        bv = new ArrayList();
        dA = new WorldPoint(lIlIIlllI[68], lIlIIlllI[69], lIlIIlllI[6]);
        dB = new WorldPoint(lIlIIlllI[70], lIlIIlllI[71], lIlIIlllI[6]);
        dC = new WorldPoint(lIlIIlllI[72], lIlIIlllI[73], lIlIIlllI[6]);
        dD = new WorldPoint(lIlIIlllI[74], lIlIIlllI[75], lIlIIlllI[6]);
        String[] strArr = new String[lIlIIlllI[1]];
        strArr[lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[76]];
        strArr[lIlIIlllI[5]] = lIlIIllII[lIlIIlllI[42]];
        strArr[lIlIIlllI[8]] = lIlIIllII[lIlIIlllI[77]];
        bR = strArr;
        dE = lIlIIlllI[78];
    }

    private static void lIIIllIIlllI() {
        lIlIIlllI = new int[80];
        lIlIIlllI[0] = (-10322) & 10999;
        lIlIIlllI[1] = "   ".length();
        lIlIIlllI[2] = (87 ^ 107) ^ (85 ^ 98);
        lIlIIlllI[3] = "   ".length() ^ (0 ^ 6);
        lIlIIlllI[4] = (((125 + 15) - (-7)) + 32) ^ (((77 + 102) - 7) + 13);
        lIlIIlllI[5] = " ".length();
        lIlIIlllI[6] = ((122 ^ 56) ^ (44 ^ 122)) & (((((120 + 129) - 118) + 21) ^ (((41 + 127) - 124) + 96)) ^ (-" ".length()));
        lIlIIlllI[7] = (-((-6811) & 32411)) & (-69) & 30668;
        lIlIIlllI[8] = "  ".length();
        lIlIIlllI[9] = 10 ^ 14;
        lIlIIlllI[10] = (-24709) & 26613;
        lIlIIlllI[11] = (-((-3101) & 20157)) & (-1037) & 30717;
        lIlIIlllI[12] = (-16385) & 24393;
        lIlIIlllI[13] = (-(((117 + 1) - 37) + 56)) & (-1) & 8143;
        lIlIIlllI[14] = (-163) & 8170;
        lIlIIlllI[15] = (-((-17093) & 31485)) & (-16385) & 32703;
        lIlIIlllI[16] = (-((-17421) & 31839)) & (-33) & 16383;
        lIlIIlllI[17] = (-((-5458) & 23929)) & (-65) & 20479;
        lIlIIlllI[18] = (((198 + 34) - 213) + 180) ^ (((52 + 99) - 37) + 79);
        lIlIIlllI[19] = (-((-17733) & 21885)) & (-18435) & 24507;
        lIlIIlllI[20] = (112 ^ 101) ^ (43 ^ 57);
        lIlIIlllI[21] = (105 ^ 10) ^ (230 ^ 141);
        lIlIIlllI[22] = (-((-17409) & 30221)) & (-81) & 13951;
        lIlIIlllI[23] = (((83 + 117) - 159) + 112) ^ (((43 + 35) - (-17)) + 49);
        lIlIIlllI[24] = (-16001) & 16379;
        lIlIIlllI[25] = (-((-31089) & 31741)) & (-14401) & 16383;
        lIlIIlllI[26] = (-30745) & 31739;
        lIlIIlllI[27] = (((231 + 4) - 95) + 107) ^ (((187 + 183) - 206) + 33);
        lIlIIlllI[28] = (-((-4965) & 29685)) & (-4105) & 30715;
        lIlIIlllI[29] = 153 ^ 149;
        lIlIIlllI[30] = 150 ^ 155;
        lIlIIlllI[31] = (41 ^ 11) ^ (188 ^ 144);
        lIlIIlllI[32] = (73 ^ 6) ^ (219 ^ 155);
        lIlIIlllI[33] = 92 ^ 76;
        lIlIIlllI[34] = (168 ^ 151) ^ (238 ^ 197);
        lIlIIlllI[35] = (-8193) & 10175;
        lIlIIlllI[36] = (80 ^ 87) ^ (153 ^ 143);
        lIlIIlllI[37] = (47 ^ 60) ^ " ".length();
        lIlIIlllI[38] = 60 ^ 47;
        lIlIIlllI[39] = (149 ^ 172) ^ (101 ^ 73);
        lIlIIlllI[40] = 5 ^ 19;
        lIlIIlllI[41] = (((44 + 89) - 120) + 128) ^ (((72 + 8) - (-19)) + 48);
        lIlIIlllI[42] = 183 ^ 159;
        lIlIIlllI[43] = (((58 + 134) - 164) + 122) ^ (((77 + 40) - 8) + 20);
        lIlIIlllI[44] = 48 ^ 40;
        lIlIIlllI[45] = 172 ^ 181;
        lIlIIlllI[46] = (-16555) & 24063;
        lIlIIlllI[47] = 75 ^ 81;
        lIlIIlllI[48] = (166 ^ 128) ^ (13 ^ 48);
        lIlIIlllI[49] = (((17 + 30) - (-37)) + 86) ^ (((138 + 46) - 31) + 29);
        lIlIIlllI[50] = 181 ^ 168;
        lIlIIlllI[51] = 135 ^ 152;
        lIlIIlllI[52] = (-((-22801) & 31162)) & (-16897) & 32767;
        lIlIIlllI[53] = (-29258) & 32463;
        lIlIIlllI[54] = (-16919) & 20342;
        lIlIIlllI[55] = 88 ^ 120;
        lIlIIlllI[56] = 129 ^ 160;
        lIlIIlllI[57] = (((137 + 107) - 115) + 41) ^ (((133 + 28) - 122) + 97);
        lIlIIlllI[58] = 158 ^ 189;
        lIlIIlllI[59] = (((23 + 141) - 83) + 77) ^ (((23 + 111) - (-41)) + 11);
        lIlIIlllI[60] = (-((-3099) & 23646)) & (-129) & 29675;
        lIlIIlllI[61] = (-16390) & 20389;
        lIlIIlllI[62] = (-30851) & 32750;
        lIlIIlllI[63] = (-4130) & 16109;
        lIlIIlllI[64] = (-5714) & 30713;
        lIlIIlllI[65] = (57 ^ 61) ^ (251 ^ 155);
        lIlIIlllI[66] = (((100 + 121) - 198) + 120) ^ (((43 + 141) - 158) + 144);
        lIlIIlllI[67] = (177 ^ 160) ^ (18 ^ 37);
        lIlIIlllI[68] = (-105) & 3311;
        lIlIIlllI[69] = (-((-26014) & 30719)) & (-24577) & 32503;
        lIlIIlllI[70] = (-((-12709) & 13815)) & (-20481) & 24543;
        lIlIIlllI[71] = (-4803) & 8174;
        lIlIIlllI[72] = (-4235) & 7099;
        lIlIIlllI[73] = (-((-121) & 18811)) & (-4161) & 32727;
        lIlIIlllI[74] = (-28729) & 31737;
        lIlIIlllI[75] = (-24619) & 28091;
        lIlIIlllI[76] = 90 ^ 125;
        lIlIIlllI[77] = 79 ^ 102;
        lIlIIlllI[78] = (-14657) & 15337;
        lIlIIlllI[79] = (219 ^ 135) ^ (237 ^ 155);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0173, code lost:
        if (lIIIllIIllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[9]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0316, code lost:
        if (lIIIllIIllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[3]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x03a0, code lost:
        if (lIIIllIIllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[4]) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005f, code lost:
        if (lIIIllIIllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[3]) != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
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
        int[] iArr11 = new int[lIlIIlllI[5]];
        iArr11[lIlIIlllI[6]] = lIlIIlllI[11];
        if (lIIIllIlIIlI(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lIlIIlllI[5]];
            iArr12[lIlIIlllI[6]] = lIlIIlllI[11];
            if (lIIIllIlIIlI(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[lIlIIlllI[5]];
                iArr13[lIlIIlllI[6]] = lIlIIlllI[11];
            }
            iArr = new int[lIlIIlllI[5]];
            iArr[lIlIIlllI[6]] = lIlIIlllI[25];
            if (lIIIllIlIIll(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0003d(lIlIIlllI[25], lIlIIlllI[5], lIlIIlllI[60]));
                "".length();
            }
            iArr2 = new int[lIlIIlllI[5]];
            iArr2[lIlIIlllI[6]] = lIlIIlllI[22];
            if (lIIIllIlIIll(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0003d(lIlIIlllI[22], lIlIIlllI[5], lIlIIlllI[60]));
                "".length();
            }
            iArr3 = new int[lIlIIlllI[5]];
            iArr3[lIlIIlllI[6]] = lIlIIlllI[10];
            if (lIIIllIlIIlI(Bank.contains(iArr3) ? 1 : 0)) {
                int[] iArr14 = new int[lIlIIlllI[5]];
                iArr14[lIlIIlllI[6]] = lIlIIlllI[10];
                if (lIIIllIlIIlI(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIlIIlllI[5]];
                    iArr15[lIlIIlllI[6]] = lIlIIlllI[10];
                }
                iArr4 = new int[lIlIIlllI[5]];
                iArr4[lIlIIlllI[6]] = lIlIIlllI[19];
                if (lIIIllIlIIll(Bank.contains(iArr4) ? 1 : 0)) {
                    bv.add(new C0003d(lIlIIlllI[19], lIlIIlllI[5], lIlIIlllI[60]));
                    "".length();
                }
                iArr5 = new int[lIlIIlllI[5]];
                iArr5[lIlIIlllI[6]] = lIlIIlllI[17];
                if (lIIIllIlIIll(Bank.contains(iArr5) ? 1 : 0)) {
                    bv.add(new C0003d(lIlIIlllI[17], lIlIIlllI[5], lIlIIlllI[60]));
                    "".length();
                }
                iArr6 = new int[lIlIIlllI[5]];
                iArr6[lIlIIlllI[6]] = lIlIIlllI[15];
                if (lIIIllIlIIll(Bank.contains(iArr6) ? 1 : 0)) {
                    bv.add(new C0003d(lIlIIlllI[15], lIlIIlllI[5], lIlIIlllI[60]));
                    "".length();
                }
                iArr7 = new int[lIlIIlllI[5]];
                iArr7[lIlIIlllI[6]] = lIlIIlllI[16];
                if (lIIIllIlIIll(Bank.contains(iArr7) ? 1 : 0)) {
                    bv.add(new C0003d(lIlIIlllI[16], lIlIIlllI[5], lIlIIlllI[60]));
                    "".length();
                }
                iArr8 = new int[lIlIIlllI[5]];
                iArr8[lIlIIlllI[6]] = lIlIIlllI[14];
                if (lIIIllIlIIlI(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr16 = new int[lIlIIlllI[5]];
                    iArr16[lIlIIlllI[6]] = lIlIIlllI[14];
                    if (lIIIllIlIIlI(Bank.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIlIIlllI[5]];
                        iArr17[lIlIIlllI[6]] = lIlIIlllI[14];
                    }
                    iArr9 = new int[lIlIIlllI[5]];
                    iArr9[lIlIIlllI[6]] = lIlIIlllI[12];
                    if (lIIIllIlIIlI(Bank.contains(iArr9) ? 1 : 0)) {
                        int[] iArr18 = new int[lIlIIlllI[5]];
                        iArr18[lIlIIlllI[6]] = lIlIIlllI[12];
                        if (lIIIllIlIIlI(Bank.contains(iArr18) ? 1 : 0)) {
                            int[] iArr19 = new int[lIlIIlllI[5]];
                            iArr19[lIlIIlllI[6]] = lIlIIlllI[12];
                        }
                        if (lIIIllIlIIll(Bank.contains(item -> {
                            return item.getName().toLowerCase().contains(lIlIIllII[lIlIIlllI[67]]);
                        }) ? 1 : 0)) {
                            bv.add(new C0003d(lIlIIlllI[63], lIlIIlllI[3], lIlIIlllI[64]));
                            "".length();
                        }
                        iArr10 = new int[lIlIIlllI[5]];
                        iArr10[lIlIIlllI[6]] = lIlIIlllI[13];
                        if (lIIIllIlIIll(Bank.contains(iArr10) ? 1 : 0)) {
                            bv.add(new C0003d(lIlIIlllI[13], lIlIIlllI[42], lIlIIlllI[62]));
                            "".length();
                            return;
                        }
                        return;
                    }
                    bv.add(new C0003d(lIlIIlllI[12], lIlIIlllI[4], lIlIIlllI[62]));
                    "".length();
                    if (lIIIllIlIIll(Bank.contains(item2 -> {
                        return item2.getName().toLowerCase().contains(lIlIIllII[lIlIIlllI[67]]);
                    }) ? 1 : 0)) {
                    }
                    iArr10 = new int[lIlIIlllI[5]];
                    iArr10[lIlIIlllI[6]] = lIlIIlllI[13];
                    if (lIIIllIlIIll(Bank.contains(iArr10) ? 1 : 0)) {
                    }
                }
                bv.add(new C0003d(lIlIIlllI[14], lIlIIlllI[4], lIlIIlllI[62]));
                "".length();
                iArr9 = new int[lIlIIlllI[5]];
                iArr9[lIlIIlllI[6]] = lIlIIlllI[12];
                if (lIIIllIlIIlI(Bank.contains(iArr9) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIlIIlllI[12], lIlIIlllI[4], lIlIIlllI[62]));
                "".length();
                if (lIIIllIlIIll(Bank.contains(item22 -> {
                    return item22.getName().toLowerCase().contains(lIlIIllII[lIlIIlllI[67]]);
                }) ? 1 : 0)) {
                }
                iArr10 = new int[lIlIIlllI[5]];
                iArr10[lIlIIlllI[6]] = lIlIIlllI[13];
                if (lIIIllIlIIll(Bank.contains(iArr10) ? 1 : 0)) {
                }
            }
            bv.add(new C0003d(lIlIIlllI[10], lIlIIlllI[9], lIlIIlllI[61]));
            "".length();
            iArr4 = new int[lIlIIlllI[5]];
            iArr4[lIlIIlllI[6]] = lIlIIlllI[19];
            if (lIIIllIlIIll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIlIIlllI[5]];
            iArr5[lIlIIlllI[6]] = lIlIIlllI[17];
            if (lIIIllIlIIll(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lIlIIlllI[5]];
            iArr6[lIlIIlllI[6]] = lIlIIlllI[15];
            if (lIIIllIlIIll(Bank.contains(iArr6) ? 1 : 0)) {
            }
            iArr7 = new int[lIlIIlllI[5]];
            iArr7[lIlIIlllI[6]] = lIlIIlllI[16];
            if (lIIIllIlIIll(Bank.contains(iArr7) ? 1 : 0)) {
            }
            iArr8 = new int[lIlIIlllI[5]];
            iArr8[lIlIIlllI[6]] = lIlIIlllI[14];
            if (lIIIllIlIIlI(Bank.contains(iArr8) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIlIIlllI[14], lIlIIlllI[4], lIlIIlllI[62]));
            "".length();
            iArr9 = new int[lIlIIlllI[5]];
            iArr9[lIlIIlllI[6]] = lIlIIlllI[12];
            if (lIIIllIlIIlI(Bank.contains(iArr9) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIlIIlllI[12], lIlIIlllI[4], lIlIIlllI[62]));
            "".length();
            if (lIIIllIlIIll(Bank.contains(item222 -> {
                return item222.getName().toLowerCase().contains(lIlIIllII[lIlIIlllI[67]]);
            }) ? 1 : 0)) {
            }
            iArr10 = new int[lIlIIlllI[5]];
            iArr10[lIlIIlllI[6]] = lIlIIlllI[13];
            if (lIIIllIlIIll(Bank.contains(iArr10) ? 1 : 0)) {
            }
        }
        bv.add(new C0003d(lIlIIlllI[11], lIlIIlllI[3], C0008i.bq));
        "".length();
        iArr = new int[lIlIIlllI[5]];
        iArr[lIlIIlllI[6]] = lIlIIlllI[25];
        if (lIIIllIlIIll(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lIlIIlllI[5]];
        iArr2[lIlIIlllI[6]] = lIlIIlllI[22];
        if (lIIIllIlIIll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIlIIlllI[5]];
        iArr3[lIlIIlllI[6]] = lIlIIlllI[10];
        if (lIIIllIlIIlI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIlIIlllI[10], lIlIIlllI[9], lIlIIlllI[61]));
        "".length();
        iArr4 = new int[lIlIIlllI[5]];
        iArr4[lIlIIlllI[6]] = lIlIIlllI[19];
        if (lIIIllIlIIll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIlIIlllI[5]];
        iArr5[lIlIIlllI[6]] = lIlIIlllI[17];
        if (lIIIllIlIIll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIlIIlllI[5]];
        iArr6[lIlIIlllI[6]] = lIlIIlllI[15];
        if (lIIIllIlIIll(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[lIlIIlllI[5]];
        iArr7[lIlIIlllI[6]] = lIlIIlllI[16];
        if (lIIIllIlIIll(Bank.contains(iArr7) ? 1 : 0)) {
        }
        iArr8 = new int[lIlIIlllI[5]];
        iArr8[lIlIIlllI[6]] = lIlIIlllI[14];
        if (lIIIllIlIIlI(Bank.contains(iArr8) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIlIIlllI[14], lIlIIlllI[4], lIlIIlllI[62]));
        "".length();
        iArr9 = new int[lIlIIlllI[5]];
        iArr9[lIlIIlllI[6]] = lIlIIlllI[12];
        if (lIIIllIlIIlI(Bank.contains(iArr9) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIlIIlllI[12], lIlIIlllI[4], lIlIIlllI[62]));
        "".length();
        if (lIIIllIlIIll(Bank.contains(item2222 -> {
            return item2222.getName().toLowerCase().contains(lIlIIllII[lIlIIlllI[67]]);
        }) ? 1 : 0)) {
        }
        iArr10 = new int[lIlIIlllI[5]];
        iArr10[lIlIIlllI[6]] = lIlIIlllI[13];
        if (lIIIllIlIIll(Bank.contains(iArr10) ? 1 : 0)) {
        }
    }

    private static boolean lIIIllIlIIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIllIllIII(int i, int i2) {
        return i != i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIlIIllII[lIlIIlllI[66]];
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            bq();
            "".length();
            if ("  ".length() > (103 ^ 99)) {
                return (52 ^ 121) & ((195 ^ 142) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlIIlllI[65];
    }

    private static boolean lIIIllIllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0b28, code lost:
        if (lIIIllIlIlII(net.unethicalite.api.entities.NPCs.getNearest(r0)) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0b40, code lost:
        if (lIIIllIllIIl(net.unethicalite.api.entities.Players.getLocal().getWorldLocation().distanceTo(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[41]) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0b43, code lost:
        gg.squire.account.AccBuilderEasyClues.c = l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIllII[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[56]];
        l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.B.bt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0b53, code lost:
        r0 = new java.lang.String[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[5]];
        r0[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[6]] = l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIllII[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[57]];
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0b73, code lost:
        if (lIIIllIlIlII(net.unethicalite.api.entities.NPCs.getNearest(r0)) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0b7c, code lost:
        if (lIIIllIlIIll(net.unethicalite.api.widgets.Dialog.isOpen() ? 1 : 0) == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0b7f, code lost:
        gg.squire.account.AccBuilderEasyClues.c = l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIllII[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[58]];
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0b97, code lost:
        if (lIIIllIIllll(l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.cl, l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[5]) == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0b9a, code lost:
        l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.an.oo += l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[5];
        l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.an.o(gg.squire.account.AccBuilderEasyClues.m);
        l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.cl += l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[5];
        l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.an.oo = l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[6];
        l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.cm = l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0bca, code lost:
        r0 = new int[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[5]];
        r0[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[6]] = l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[52];
        r0 = net.unethicalite.api.items.Inventory.getFirst(r0);
        r1 = new java.lang.String[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[5]];
        r1[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[6]] = l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIllII[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[59]];
        r0.useOn(net.unethicalite.api.entities.TileObjects.getNearest(r1));
        net.unethicalite.api.commons.Time.sleepTicks(l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[5]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0c10, code lost:
        l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0006g.a(l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.bR);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0c16, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d6, code lost:
        if (lIIIllIlIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[9]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x021a, code lost:
        if (lIIIllIlIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[3]) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x025e, code lost:
        if (lIIIllIIllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[4]) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0261, code lost:
        af();
        java.lang.System.out.println(l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIllII[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[1]]);
        l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.bt = l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.A.lIlIIlllI[5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027b, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v399, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v414, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v442, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bq() {
        if (lIIIllIIllll(C0004e.j(lIlIIlllI[0]), lIlIIlllI[1])) {
            B.bs();
        }
        if (lIIIllIlIIII(C0004e.j(lIlIIlllI[0]), lIlIIlllI[1]) && lIIIllIIllll(C0004e.j(lIlIIlllI[2]), lIlIIlllI[3])) {
            C0022w.aT();
        }
        if (!lIIIllIlIIII(Skills.getLevel(Skill.COOKING), lIlIIlllI[4]) || !lIIIllIlIIII(C0004e.j(lIlIIlllI[0]), lIlIIlllI[1]) || !lIIIllIlIIIl(C0004e.j(lIlIIlllI[2]), lIlIIlllI[3])) {
            return;
        }
        if (lIIIllIlIIlI(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lIIIllIIllll(bv.size(), lIlIIlllI[5])) {
                System.out.println(lIlIIllII[lIlIIlllI[6]]);
                bt = lIlIIlllI[6];
            }
        }
        if (!lIIIllIlIIll(bt ? 1 : 0)) {
            return;
        }
        if (lIIIllIlIIll(ab() ? 1 : 0) && lIIIllIlIIll(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
            BankLocation nearest = BankLocation.getNearest();
            if (lIIIllIlIlII(nearest) && lIIIllIlIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[5]];
                C0000a.a(nearest);
            }
            if (lIIIllIlIlII(nearest) && lIIIllIlIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lIIIllIlIIll(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIlIIlllI[7]);
                    "".length();
                }
                if (lIIIllIlIIlI(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[8]];
                    if (lIIIllIlIlIl(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIlIIlllI[9]);
                        "".length();
                    }
                    if (lIIIllIlIlIl(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(lIlIIlllI[8]);
                        "".length();
                    }
                    int[] iArr = new int[lIlIIlllI[5]];
                    iArr[lIlIIlllI[6]] = lIlIIlllI[10];
                    if (lIIIllIlIIlI(Bank.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lIlIIlllI[5]];
                        iArr2[lIlIIlllI[6]] = lIlIIlllI[10];
                    }
                    int[] iArr3 = new int[lIlIIlllI[5]];
                    iArr3[lIlIIlllI[6]] = lIlIIlllI[11];
                    if (lIIIllIlIIlI(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIlIIlllI[5]];
                        iArr4[lIlIIlllI[6]] = lIlIIlllI[11];
                    }
                    int[] iArr5 = new int[lIlIIlllI[5]];
                    iArr5[lIlIIlllI[6]] = lIlIIlllI[12];
                    if (lIIIllIlIIlI(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIlIIlllI[5]];
                        iArr6[lIlIIlllI[6]] = lIlIIlllI[12];
                    }
                    int[] iArr7 = new int[lIlIIlllI[2]];
                    iArr7[lIlIIlllI[6]] = lIlIIlllI[13];
                    iArr7[lIlIIlllI[5]] = lIlIIlllI[14];
                    iArr7[lIlIIlllI[8]] = lIlIIlllI[12];
                    iArr7[lIlIIlllI[1]] = lIlIIlllI[15];
                    iArr7[lIlIIlllI[9]] = lIlIIlllI[16];
                    iArr7[lIlIIlllI[3]] = lIlIIlllI[17];
                    iArr7[lIlIIlllI[18]] = lIlIIlllI[19];
                    iArr7[lIlIIlllI[20]] = lIlIIlllI[10];
                    iArr7[lIlIIlllI[21]] = lIlIIlllI[22];
                    iArr7[lIlIIlllI[23]] = lIlIIlllI[24];
                    iArr7[lIlIIlllI[4]] = lIlIIlllI[25];
                    if (lIIIllIlIIll(C0004e.b(iArr7) ? 1 : 0)) {
                        af();
                        System.out.println(lIlIIllII[lIlIIlllI[9]]);
                        bt = lIlIIlllI[5];
                        return;
                    }
                    int[] iArr8 = new int[lIlIIlllI[2]];
                    iArr8[lIlIIlllI[6]] = lIlIIlllI[13];
                    iArr8[lIlIIlllI[5]] = lIlIIlllI[14];
                    iArr8[lIlIIlllI[8]] = lIlIIlllI[12];
                    iArr8[lIlIIlllI[1]] = lIlIIlllI[15];
                    iArr8[lIlIIlllI[9]] = lIlIIlllI[16];
                    iArr8[lIlIIlllI[3]] = lIlIIlllI[17];
                    iArr8[lIlIIlllI[18]] = lIlIIlllI[19];
                    iArr8[lIlIIlllI[20]] = lIlIIlllI[10];
                    iArr8[lIlIIlllI[21]] = lIlIIlllI[22];
                    iArr8[lIlIIlllI[23]] = lIlIIlllI[24];
                    iArr8[lIlIIlllI[4]] = lIlIIlllI[25];
                    if (lIIIllIlIIlI(C0004e.b(iArr8) ? 1 : 0)) {
                        C0000a.a(lIlIIlllI[13], lIlIIlllI[4]);
                        C0000a.a(lIlIIlllI[14], lIlIIlllI[4]);
                        C0000a.a(lIlIIlllI[12], lIlIIlllI[4]);
                        C0000a.a(lIlIIlllI[15], lIlIIlllI[5]);
                        C0000a.a(lIlIIlllI[16], lIlIIlllI[5]);
                        C0000a.a(lIlIIlllI[17], lIlIIlllI[5]);
                        C0000a.a(lIlIIlllI[19], lIlIIlllI[5]);
                        C0000a.a(lIlIIlllI[10], lIlIIlllI[9]);
                        C0000a.a(lIlIIlllI[22], lIlIIlllI[5]);
                        C0000a.a(lIlIIlllI[25], lIlIIlllI[5]);
                        C0000a.a(lIlIIlllI[24], lIlIIlllI[3]);
                        C0000a.a(lIlIIlllI[11], lIlIIlllI[8]);
                        C0000a.a(lIlIIlllI[26], lIlIIlllI[7]);
                    }
                }
            }
        }
        if (lIIIllIlIIlI(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIIllIIllll(Movement.getRunEnergy(), lIlIIlllI[27])) {
            Inventory.getFirst(C0005f.aV).interact(lIlIIllII[lIlIIlllI[3]]);
            Time.sleepTicks(lIlIIlllI[5]);
            "".length();
        }
        if (lIIIllIlIIlI(ab() ? 1 : 0) && lIIIllIlIIll(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
            if (lIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dA), lIlIIlllI[9])) {
                String[] strArr = new String[lIlIIlllI[5]];
                strArr[lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[18]];
                if (lIIIllIlIlll(NPCs.getNearest(strArr))) {
                    AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[20]];
                    B.bt();
                }
            }
            String[] strArr2 = new String[lIlIIlllI[5]];
            strArr2[lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[21]];
            if (lIIIllIlIlII(NPCs.getNearest(strArr2))) {
                if (lIIIllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr3 = new String[lIlIIlllI[5]];
                    strArr3[lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[23]];
                    TileObjects.getNearest(strArr3).interact(lIlIIllII[lIlIIlllI[4]]);
                    Time.sleepTicks(lIlIIlllI[5]);
                    "".length();
                }
                C0006g.a(bR);
            }
        }
        if (lIIIllIlIIIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIlllI[4])) {
            if (lIIIllIllIII(Vars.getBit(lIlIIlllI[28]), lIlIIlllI[5])) {
                if (lIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dB), lIlIIlllI[20])) {
                    AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[2]];
                    Movement.walkTo(dB);
                    "".length();
                    Time.sleepTicks(lIlIIlllI[5]);
                    "".length();
                }
                if (lIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(dB), lIlIIlllI[20])) {
                    AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[29]];
                    C0006g.a(lIlIIllII[lIlIIlllI[30]], bR);
                }
            }
            if (lIIIllIlIIIl(Vars.getBit(lIlIIlllI[28]), lIlIIlllI[5])) {
                int[] iArr9 = new int[lIlIIlllI[5]];
                iArr9[lIlIIlllI[6]] = lIlIIlllI[10];
                if (lIIIllIlIIlI(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlIIlllI[5]];
                    iArr10[lIlIIlllI[6]] = lIlIIlllI[26];
                    Item first = Inventory.getFirst(iArr10);
                    int[] iArr11 = new int[lIlIIlllI[5]];
                    iArr11[lIlIIlllI[6]] = lIlIIlllI[10];
                    first.useOn(Inventory.getFirst(iArr11));
                    Time.sleepTicks(lIlIIlllI[5]);
                    "".length();
                }
                int[] iArr12 = new int[lIlIIlllI[5]];
                iArr12[lIlIIlllI[6]] = lIlIIlllI[10];
                if (lIIIllIlIIll(Inventory.contains(iArr12) ? 1 : 0)) {
                    if (lIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dC), lIlIIlllI[20])) {
                        AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[31]];
                        Movement.walkTo(dC);
                        "".length();
                        Time.sleepTicks(lIlIIlllI[5]);
                        "".length();
                    }
                    if (lIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(dC), lIlIIlllI[20])) {
                        AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[32]];
                        C0006g.a(lIlIIllII[lIlIIlllI[33]], bR);
                    }
                }
            }
        }
        if (lIIIllIlIIIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIlllI[34])) {
            if (lIIIllIllIII(Vars.getBit(lIlIIlllI[35]), lIlIIlllI[9])) {
                cl = lIlIIlllI[6];
                if (lIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dC), lIlIIlllI[20])) {
                    AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[36]];
                    Movement.walkTo(dC);
                    "".length();
                    Time.sleepTicks(lIlIIlllI[5]);
                    "".length();
                }
                if (lIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(dC), lIlIIlllI[20])) {
                    AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[37]];
                    C0006g.a(lIlIIllII[lIlIIlllI[38]], bR);
                    C0006g.a(lIlIIllII[lIlIIlllI[34]], bR);
                }
            }
            if (lIIIllIlIIIl(Vars.getBit(lIlIIlllI[35]), lIlIIlllI[9])) {
                AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[39]];
                C0006g.a(lIlIIllII[lIlIIlllI[40]], bR);
            }
        }
        if (!lIIIllIllIII(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIlllI[41]) || lIIIllIlIIIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIlllI[42])) {
            AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[43]];
            C0006g.a(lIlIIllII[lIlIIlllI[44]], bR);
        }
        if (!lIIIllIlIIIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIlllI[27])) {
            return;
        }
        int[] iArr13 = new int[lIlIIlllI[5]];
        iArr13[lIlIIlllI[6]] = lIlIIlllI[22];
        if (lIIIllIlIIll(Equipment.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lIlIIlllI[5]];
            iArr14[lIlIIlllI[6]] = lIlIIlllI[22];
            if (lIIIllIlIIlI(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIlIIlllI[5]];
                iArr15[lIlIIlllI[6]] = lIlIIlllI[22];
                Inventory.getFirst(iArr15).interact(lIlIIllII[lIlIIlllI[45]]);
                Time.sleepTicks(lIlIIlllI[5]);
                "".length();
            }
        }
        int[] iArr16 = new int[lIlIIlllI[5]];
        iArr16[lIlIIlllI[6]] = lIlIIlllI[22];
        if (lIIIllIlIIlI(Equipment.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[lIlIIlllI[5]];
            iArr17[lIlIIlllI[6]] = lIlIIlllI[46];
            if (lIIIllIlIlII(TileItems.getNearest(iArr17))) {
                int[] iArr18 = new int[lIlIIlllI[5]];
                iArr18[lIlIIlllI[6]] = lIlIIlllI[46];
                TileItems.getNearest(iArr18).interact(lIlIIllII[lIlIIlllI[47]]);
                Time.sleepTicks(lIlIIlllI[5]);
                "".length();
            }
        }
        int[] iArr19 = new int[lIlIIlllI[5]];
        iArr19[lIlIIlllI[6]] = lIlIIlllI[46];
        if (lIIIllIlIIlI(Inventory.contains(iArr19) ? 1 : 0)) {
            int[] iArr20 = new int[lIlIIlllI[5]];
            iArr20[lIlIIlllI[6]] = lIlIIlllI[25];
            if (lIIIllIlIIlI(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIlIIlllI[5]];
                iArr21[lIlIIlllI[6]] = lIlIIlllI[25];
                if (lIIIllIlIIll(Equipment.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIlIIlllI[5]];
                    iArr22[lIlIIlllI[6]] = lIlIIlllI[25];
                    Inventory.getFirst(iArr22).interact(lIlIIllII[lIlIIlllI[48]]);
                    Time.sleepTicks(lIlIIlllI[5]);
                    "".length();
                }
            }
            if (lIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dD), lIlIIlllI[18])) {
                AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[49]];
                Movement.walkTo(dD);
                "".length();
                Time.sleepTicks(lIlIIlllI[5]);
                "".length();
            }
            if (lIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(dD), lIlIIlllI[18])) {
                AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[50]];
                if (lIIIllIlIlll(Players.getLocal().getInteracting())) {
                    String[] strArr4 = new String[lIlIIlllI[5]];
                    strArr4[lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[41]];
                    NPCs.getNearest(strArr4).interact(lIlIIllII[lIlIIlllI[51]]);
                    Time.sleepTicks(lIlIIlllI[1]);
                    "".length();
                }
            }
        }
        int[] iArr23 = new int[lIlIIlllI[5]];
        iArr23[lIlIIlllI[6]] = lIlIIlllI[52];
        if (!lIIIllIlIIlI(Inventory.contains(iArr23) ? 1 : 0)) {
            return;
        }
        WorldPoint worldPoint = new WorldPoint(lIlIIlllI[53], lIlIIlllI[54], lIlIIlllI[6]);
        if (lIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dA), lIlIIlllI[9])) {
            String[] strArr5 = new String[lIlIIlllI[5]];
            strArr5[lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[55]];
        }
    }

    private static boolean lIIIllIllIIl(int i, int i2) {
        return i <= i2;
    }

    private static String lIIIlIlllIll(String lllIlIlllIIIlI, String lllIlIlllIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIlllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlllI[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIlIlllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIlllIIIll) {
            lllIlIlllIIIll.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIllllIl(String lllIlIllIIIlIl, String lllIlIllIIIlII) {
        String lllIlIllIIIlIl2 = new String(Base64.getDecoder().decode(lllIlIllIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlIllIIIIll = new StringBuilder();
        char[] charArray = lllIlIllIIIlII.toCharArray();
        int lllIlIllIIIIIl = lIlIIlllI[6];
        char[] charArray2 = lllIlIllIIIlIl2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIlllI[6];
        while (lIIIllIIllll(i, length)) {
            lllIlIllIIIIll.append((char) (charArray2[i] ^ charArray[lllIlIllIIIIIl % charArray.length]));
            "".length();
            lllIlIllIIIIIl++;
            i++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllIlIllIIIIll);
    }

    private static boolean lIIIllIlIIlI(int i) {
        return i != 0;
    }

    private static boolean lIIIllIIllll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIllIlIlIl(int i) {
        return i > 0;
    }
}
