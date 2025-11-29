package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
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
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.z  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/z.class */
public class z implements M {
    private static final /* synthetic */ int gh;
    static /* synthetic */ String[] dP;
    private static final /* synthetic */ int gm;
    private static final /* synthetic */ int gk;
    private static final /* synthetic */ int gl;
    private static final /* synthetic */ int gf;
    public static /* synthetic */ boolean by;
    static /* synthetic */ String fa;
    private static final /* synthetic */ int gd;
    private static final /* synthetic */ int gi;
    private static final /* synthetic */ int ge;
    static /* synthetic */ boolean cp;
    private static /* synthetic */ int[] lIIIlllIlIIll;
    private static final /* synthetic */ int gc;
    private static final /* synthetic */ WorldPoint gb;
    public static /* synthetic */ List<C0003d> bA;

    /* renamed from: gg  reason: collision with root package name */
    private static final /* synthetic */ int f3gg;
    private static final /* synthetic */ int gj;
    static /* synthetic */ int co;
    static /* synthetic */ int bY;
    private static /* synthetic */ String[] lIIIlllIlIIIl;

    private static String lIlIIlIIIlIIlll(String lllllllllllllllIIIIIlIllIlllIlll, String lllllllllllllllIIIIIlIllIlllIIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIlIllIlllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIlIllIlllIlIl = new StringBuilder();
        char[] lllllllllllllllIIIIIlIllIlllIlII = lllllllllllllllIIIIIlIllIlllIIIl.toCharArray();
        int lllllllllllllllIIIIIlIllIlllIIll = lIIIlllIlIIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIIIlllIlIIll[0];
        while (lIlIIlIIIlllIlI(i2, length)) {
            lllllllllllllllIIIIIlIllIlllIlIl.append((char) (charArray[i2] ^ lllllllllllllllIIIIIlIllIlllIlII[lllllllllllllllIIIIIlIllIlllIIll % lllllllllllllllIIIIIlIllIlllIlII.length]));
            "".length();
            lllllllllllllllIIIIIlIllIlllIIll++;
            i2++;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIIlIllIlllIlIl);
    }

    private static boolean lIlIIlIIIlllIlI(int i2, int i3) {
        return i2 < i3;
    }

    private static void lIlIIlIIIlllIII() {
        lIIIlllIlIIll = new int[97];
        lIIIlllIlIIll[0] = ((((80 + 111) - 165) + 218) ^ (((25 + 130) - 55) + 50)) & (((100 ^ 79) ^ (56 ^ 113)) ^ (-" ".length()));
        lIIIlllIlIIll[1] = " ".length();
        lIIIlllIlIIll[2] = ((95 + 79) - 68) + 54;
        lIIIlllIlIIll[3] = "  ".length();
        lIIIlllIlIIll[4] = "   ".length();
        lIIIlllIlIIll[5] = (-8209) & 13208;
        lIIIlllIlIIll[6] = 190 ^ 186;
        lIIIlllIlIIll[7] = (-16387) & 24395;
        lIIIlllIlIIll[8] = 203 ^ 193;
        lIIIlllIlIIll[9] = 174 ^ 171;
        lIIIlllIlIIll[10] = (-((-8266) & 30155)) & (-2129) & 24575;
        lIIIlllIlIIll[11] = (-((-18409) & 24574)) & (-9217) & 16381;
        lIIIlllIlIIll[12] = 14 ^ 8;
        lIIIlllIlIIll[13] = (-((-559) & 24367)) & (-8339) & 32703;
        lIIIlllIlIIll[14] = 163 ^ 164;
        lIIIlllIlIIll[15] = (-((-4281) & 30137)) & (-65) & 26475;
        lIIIlllIlIIll[16] = 200 ^ 192;
        lIIIlllIlIIll[17] = (-(16 ^ 53)) & (-4097) & 6117;
        lIIIlllIlIIll[18] = 158 ^ 151;
        lIIIlllIlIIll[19] = (214 ^ 160) ^ (233 ^ 148);
        lIIIlllIlIIll[20] = (-((-10503) & 26935)) & (-8321) & 32759;
        lIIIlllIlIIll[21] = (-4609) & 6078;
        lIIIlllIlIIll[22] = (-10255) & 11726;
        lIIIlllIlIIll[23] = (-((-17547) & 31899)) & (-521) & 16346;
        lIIIlllIlIIll[24] = (-6161) & 7636;
        lIIIlllIlIIll[25] = (-30341) & 30719;
        lIIIlllIlIIll[26] = (-((-8693) & 14325)) & (-10) & 6141;
        lIIIlllIlIIll[27] = (-((-22753) & 23277)) & (-163) & 13311;
        lIIIlllIlIIll[28] = (-24897) & 27476;
        lIIIlllIlIIll[29] = (-17093) & 20172;
        lIIIlllIlIIll[30] = (158 ^ 165) ^ (31 ^ 48);
        lIIIlllIlIIll[31] = 50 ^ 61;
        lIIIlllIlIIll[32] = (((92 + 81) - 149) + 129) ^ (((147 + 106) - 110) + 6);
        lIIIlllIlIIll[33] = (((21 + 77) - 76) + 139) ^ (((150 + 127) - 116) + 11);
        lIIIlllIlIIll[34] = (186 ^ 191) ^ (94 ^ 85);
        lIIIlllIlIIll[35] = 68 ^ 84;
        lIIIlllIlIIll[36] = 167 ^ 182;
        lIIIlllIlIIll[37] = (-6362) & 15871;
        lIIIlllIlIIll[38] = "  ".length() ^ (211 ^ 195);
        lIIIlllIlIIll[39] = (-((-28929) & 32106)) & (-16385) & 28671;
        lIIIlllIlIIll[40] = 46 ^ 61;
        lIIIlllIlIIll[41] = 114 ^ 103;
        lIIIlllIlIIll[42] = (61 ^ 55) ^ (207 ^ 161);
        lIIIlllIlIIll[43] = (-7236) & 7635;
        lIIIlllIlIIll[44] = (((92 + 146) - 174) + 91) ^ (((132 + 62) - 109) + 56);
        lIIIlllIlIIll[45] = 101 ^ 77;
        lIIIlllIlIIll[46] = (50 ^ 125) ^ (108 ^ 52);
        lIIIlllIlIIll[47] = (-11274) & 16383;
        lIIIlllIlIIll[48] = 160 ^ 184;
        lIIIlllIlIIll[49] = (247 ^ 130) ^ (48 ^ 92);
        lIIIlllIlIIll[50] = (-34) & 12013;
        lIIIlllIlIIll[51] = (-6163) & 23162;
        lIIIlllIlIIll[52] = 121 ^ 99;
        lIIIlllIlIIll[53] = (-((-25085) & 27135)) & (-1) & 3950;
        lIIIlllIlIIll[54] = (1 ^ 6) ^ (112 ^ 108);
        lIIIlllIlIIll[55] = (((91 + 98) - 126) + 80) ^ (((88 + 66) - 90) + 83);
        lIIIlllIlIIll[56] = 181 ^ 168;
        lIIIlllIlIIll[57] = (((73 + 50) - 68) + 86) ^ (((76 + 26) - 3) + 48);
        lIIIlllIlIIll[58] = (-26671) & 28670;
        lIIIlllIlIIll[59] = (-30994) & 31549;
        lIIIlllIlIIll[60] = 178 ^ 173;
        lIIIlllIlIIll[61] = 119 ^ 87;
        lIIIlllIlIIll[62] = 71 ^ 102;
        lIIIlllIlIIll[63] = 149 ^ 183;
        lIIIlllIlIIll[64] = 6 ^ 37;
        lIIIlllIlIIll[65] = (118 ^ 49) ^ (80 ^ 51);
        lIIIlllIlIIll[66] = 95 ^ 122;
        lIIIlllIlIIll[67] = (((131 + 90) - 209) + 131) ^ (((69 + 165) - 113) + 48);
        lIIIlllIlIIll[68] = (((79 + 0) - 56) + 132) ^ (((88 + 86) - 149) + 163);
        lIIIlllIlIIll[69] = (205 ^ 164) ^ (202 ^ 138);
        lIIIlllIlIIll[70] = 77 ^ 103;
        lIIIlllIlIIll[71] = (((121 + 27) - 11) + 33) ^ (((91 + 89) - 103) + 52);
        lIIIlllIlIIll[72] = (231 ^ 134) ^ (44 ^ 97);
        lIIIlllIlIIll[73] = 150 ^ 187;
        lIIIlllIlIIll[74] = 69 ^ 107;
        lIIIlllIlIIll[75] = 159 ^ 176;
        lIIIlllIlIIll[76] = (((70 + 164) - 219) + 167) ^ (((48 + 0) - 28) + 114);
        lIIIlllIlIIll[77] = 64 ^ 113;
        lIIIlllIlIIll[78] = 169 ^ 155;
        lIIIlllIlIIll[79] = (((7 + 133) - 25) + 56) ^ (((150 + 109) - 237) + 130);
        lIIIlllIlIIll[80] = 8 ^ 60;
        lIIIlllIlIIll[81] = (((111 + 147) - 199) + 100) ^ (((88 + 15) - 92) + 159);
        lIIIlllIlIIll[82] = (18 ^ 0) ^ (168 ^ 140);
        lIIIlllIlIIll[83] = 63 ^ 8;
        lIIIlllIlIIll[84] = 255 ^ 199;
        lIIIlllIlIIll[85] = 40 ^ 17;
        lIIIlllIlIIll[86] = (-((-1029) & 11477)) & (-5125) & 16126;
        lIIIlllIlIIll[87] = (-((-9767) & 30719)) & (-4) & 24059;
        lIIIlllIlIIll[88] = (-((-17203) & 25527)) & (-4641) & 16127;
        lIIIlllIlIIll[89] = 126 ^ 68;
        lIIIlllIlIIll[90] = 176 ^ 139;
        lIIIlllIlIIll[91] = 156 ^ 160;
        lIIIlllIlIIll[92] = (((28 + 79) - 56) + 78) ^ (((150 + 98) - 203) + 143);
        lIIIlllIlIIll[93] = 84 ^ 106;
        lIIIlllIlIIll[94] = (228 ^ 168) ^ (247 ^ 132);
        lIIIlllIlIIll[95] = 121 ^ 57;
        lIIIlllIlIIll[96] = (46 ^ 59) ^ (70 ^ 18);
    }

    private static boolean lIlIIlIIIllllII(Object obj) {
        return obj != null;
    }

    private static void lIlIIlIIIllIlll() {
        lIIIlllIlIIIl = new String[lIIIlllIlIIll[96]];
        lIIIlllIlIIIl[lIIIlllIlIIll[0]] = lIlIIlIIIlIIllI("VRVTFaBGNh6wZK75+KMRUw==", "QcaiN");
        lIIIlllIlIIIl[lIIIlllIlIIll[1]] = lIlIIlIIIlIIllI("PAqTEaoypx2lcpyRiTCkIwINJwyMxO+TBoQpJLaL/vy3IuxE5AU8Uvwc47V6jlszK+017ulrayM=", "ilmwX");
        lIIIlllIlIIIl[lIIIlllIlIIll[3]] = lIlIIlIIIlIIlll("OSkCIiEWPB0lIVc8G2skFiYf", "wHtKF");
        lIIIlllIlIIIl[lIIIlllIlIIll[4]] = lIlIIlIIIlIlIII("Mzcy1Efmfw6sCKxIFg2bvQ==", "xWNQV");
        lIIIlllIlIIIl[lIIIlllIlIIll[6]] = lIlIIlIIIlIIlll("PwsnLC4eBC5oIBYEIiEsEA==", "wjIHB");
        lIIIlllIlIIIl[lIIIlllIlIIll[9]] = lIlIIlIIIlIlIII("e6IUJa5KtGFccdsn+PzQVWQXX3nBYg1qFuHuRUIu+sbqjIuhCCprqYen38CBktiz", "VbRuy");
        lIIIlllIlIIIl[lIIIlllIlIIll[12]] = lIlIIlIIIlIlIII("o1Da6mtIDxE4AcDGe1FNsFEk/SyQT5Qv7oNmBkzU4OG84zuSo17dWpQLdrWE25M0", "nJkwA");
        lIIIlllIlIIIl[lIIIlllIlIIll[14]] = lIlIIlIIIlIIlll("FgRoOBckQSUwFjIIJj5FMhQ4KQkoBDt1RTIWIS0GKQgmPkU1DmgbMBgoBh4=", "AaHYe");
        lIIIlllIlIIIl[lIIIlllIlIIll[16]] = lIlIIlIIIlIlIII("F0dPoR91g/NLjCf/Ento/YdxjwKujEz+GTPb5aEocg74YZZBv1gcvwq9sHw7O2/3", "NRvSn");
        lIIIlllIlIIIl[lIIIlllIlIIll[18]] = lIlIIlIIIlIIllI("1xtC0cp1WtNnbFlAJ/yoVy9Aqf1s8bqkKc/I5rtgFkClQrAHtJuGowaOUgu1fUfE", "tVvam");
        lIIIlllIlIIIl[lIIIlllIlIIll[8]] = lIlIIlIIIlIIllI("IlFT1zTPvUWkBTfRudUSERiFBhQmsHgxfhMj6kL1I7UDc9AXRm639JzfbuSXsQRf", "OVIgJ");
        lIIIlllIlIIIl[lIIIlllIlIIll[19]] = lIlIIlIIIlIIlll("IxAEABsaFkgfHVQYBRtSBwUJGQY=", "tqhkr");
        lIIIlllIlIIIl[lIIIlllIlIIll[32]] = lIlIIlIIIlIIllI("7x3eh8cKI5bPZNJDAh3kRQ==", "atLii");
        lIIIlllIlIIIl[lIIIlllIlIIll[33]] = lIlIIlIIIlIIllI("ircL6sg6i4A=", "gvPeJ");
        lIIIlllIlIIIl[lIIIlllIlIIll[34]] = lIlIIlIIIlIlIII("oa7N41i/GtDgnhmAN9KV7w==", "bMmAf");
        lIIIlllIlIIIl[lIIIlllIlIIll[31]] = lIlIIlIIIlIIlll("LRQlRRIMVSARBxEB", "cuSef");
        lIIIlllIlIIIl[lIIIlllIlIIll[35]] = lIlIIlIIIlIIllI("X97up1b4ZnFxekWdcPZkVg==", "fhmjK");
        lIIIlllIlIIIl[lIIIlllIlIIll[36]] = lIlIIlIIIlIIllI("iTF7v7N1HEEzFfZoxC37fIzHC4U4AKl/HGzgQoyPLGc=", "IiHQk");
        lIIIlllIlIIIl[lIIIlllIlIIll[38]] = lIlIIlIIIlIlIII("CWtLqRQY8Mubj/S58sHbmlZZQqJr9JXen8FACRk9NjU=", "YhFII");
        lIIIlllIlIIIl[lIIIlllIlIIll[40]] = lIlIIlIIIlIIlll("DScwOhQrYzY/Gy8odDEfLSd0JxVsISEqWiAqJyc=", "LCTSz");
        lIIIlllIlIIIl[lIIIlllIlIIll[30]] = lIlIIlIIIlIIlll("CRIpIT0vVjogOjwTbSo2KRJtPDxoFDgxcyQfPjw=", "HvMHS");
        lIIIlllIlIIIl[lIIIlllIlIIll[41]] = lIlIIlIIIlIlIII("s+FUBi0sXkpo1aU3Ll31lwb1uHPZgMdcr+QcgAIqlTw=", "ssgag");
        lIIIlllIlIIIl[lIIIlllIlIIll[44]] = lIlIIlIIIlIIllI("qAKzFkf315dny4dN/iZga8HXQHO2YcQTaHFMdBS7B8k=", "COfuN");
        lIIIlllIlIIIl[lIIIlllIlIIll[46]] = lIlIIlIIIlIlIII("tRG7H2Wf/fZeeKaP4pqTy76XXj7J3NdwCHBAkR6MFr4=", "lPVQo");
        lIIIlllIlIIIl[lIIIlllIlIIll[48]] = lIlIIlIIIlIIlll("Bh0OPQwgWQk8ByIKD3QWKFkIIRtnFQMnFg==", "GyjTb");
        lIIIlllIlIIIl[lIIIlllIlIIll[49]] = lIlIIlIIIlIIllI("Q5xu3ygMWnHJvYD0n4Ov7vTrmGhrUU8MENzLUZQCS1E=", "iUJUG");
        lIIIlllIlIIIl[lIIIlllIlIIll[52]] = lIlIIlIIIlIlIII("smHzxUMxd5+f254bMiainV3LJ6gjVjX6NFrOVBSLtZU=", "VoFWI");
        lIIIlllIlIIIl[lIIIlllIlIIll[54]] = lIlIIlIIIlIIlll("NzE+MTgRdTw5Ohoseiw3FCZ6LDlWNy8hdho8KSw=", "vUZXV");
        lIIIlllIlIIIl[lIIIlllIlIIll[55]] = lIlIIlIIIlIIllI("9ork7O2DwvZ34t89pdThzz0s8CQEdQJmdx9pP5Bmd3g=", "cvRgH");
        lIIIlllIlIIIl[lIIIlllIlIIll[56]] = lIlIIlIIIlIlIII("EZS9LbtOFrRi3PVYW0LS8c9NhgASuksnqEyD9wSfuL4=", "teaap");
        lIIIlllIlIIIl[lIIIlllIlIIll[57]] = lIlIIlIIIlIlIII("ZHlJ57GoGw/caRMkBp9PILGB31Go/XYU6R+5KUuxWaM=", "vdWqW");
        lIIIlllIlIIIl[lIIIlllIlIIll[60]] = lIlIIlIIIlIIllI("oWBdX8fPPD75QYLsvErQLuvZ/shMeiIywRcpYQjM+FY=", "WBbRL");
        lIIIlllIlIIIl[lIIIlllIlIIll[61]] = lIlIIlIIIlIIlll("LhA+HT4IVC0VJAoGegYlAREpVCQAVDgBKU8YMwck", "otZtP");
        lIIIlllIlIIIl[lIIIlllIlIIll[62]] = lIlIIlIIIlIlIII("fp5WPL0Y/oDR6kYkyyk0E59ZoiBfSP1aUxGGmm1UtSI=", "wOpdK");
        lIIIlllIlIIIl[lIIIlllIlIIll[63]] = lIlIIlIIIlIIlll("JDYKLSgCcg8tNEUgGyojFnIaK2YHJxdkKgwhGg==", "eRnDF");
        lIIIlllIlIIIl[lIIIlllIlIIll[64]] = lIlIIlIIIlIlIII("gpOYk8DO4LU0PCFzd+2A20il9Fbj5K9OZ5aeq82ZzKw=", "IAdJO");
        lIIIlllIlIIIl[lIIIlllIlIIll[65]] = lIlIIlIIIlIIllI("LbmIkPMXtNI4HuMZOow43beYDBsUZ0vZfweAYcg5VTI=", "wUSpO");
        lIIIlllIlIIIl[lIIIlllIlIIll[66]] = lIlIIlIIIlIlIII("NEWfyezWwmQcJbLatEb6HFqaaG1XQqPMQuuIL+oVcFI=", "WfQHU");
        lIIIlllIlIIIl[lIIIlllIlIIll[67]] = lIlIIlIIIlIIlll("GhQcdSMtEBw=", "HqxUA");
        lIIIlllIlIIIl[lIIIlllIlIIll[68]] = lIlIIlIIIlIIlll("Ogk8Gy0UTDISIwc=", "clPwB");
        lIIIlllIlIIIl[lIIIlllIlIIll[45]] = lIlIIlIIIlIIlll("Nio1ATtUJDEDNA==", "tFTbP");
        lIIIlllIlIIIl[lIIIlllIlIIll[69]] = lIlIIlIIIlIIlll("Oy06LQtMJzY4Cg==", "lESYn");
        lIIIlllIlIIIl[lIIIlllIlIIll[70]] = lIlIIlIIIlIIlll("DAAWDjAq", "OhskC");
        lIIIlllIlIIIl[lIIIlllIlIIll[71]] = lIlIIlIIIlIIllI("6vcPLcWKiBHPDXSNIqOU0HrfWjA8SmJ5", "pTQIy");
        lIIIlllIlIIIl[lIIIlllIlIIll[72]] = lIlIIlIIIlIlIII("ukmXoVi0oQnV6+LgrOPtLQ==", "zLAdx");
        lIIIlllIlIIIl[lIIIlllIlIIll[73]] = lIlIIlIIIlIIlll("KRYNCwoIGQRPBAAZCAYIBg==", "awcof");
        lIIIlllIlIIIl[lIIIlllIlIIll[74]] = lIlIIlIIIlIlIII("hBJ2683WZhWtmCr36ojVVA==", "bypEd");
        lIIIlllIlIIIl[lIIIlllIlIIll[75]] = lIlIIlIIIlIIllI("emKvOj5g5Qy/YGHFFYWAXA==", "HdsGX");
        lIIIlllIlIIIl[lIIIlllIlIIll[76]] = lIlIIlIIIlIIllI("HoZMuTJXdGY3e1/RNXA+QC3PiCSgQrkdn0sVQ+hXKHNJ15XhHfckAEp3e/oBhp8Y", "wHlHC");
        lIIIlllIlIIIl[lIIIlllIlIIll[77]] = lIlIIlIIIlIIlll("FS0rJgBwPiw8DQ==", "PLYRh");
        lIIIlllIlIIIl[lIIIlllIlIIll[78]] = lIlIIlIIIlIlIII("ViPFLNQHZ4kDCt4W5XwHKg==", "QBvny");
        lIIIlllIlIIIl[lIIIlllIlIIll[79]] = lIlIIlIIIlIIlll("HQxyLTwvST8lPTkAPCtuORwiPCIjDCFgbjkeOzgtIgA8K24+BnIOGxMgHAs=", "JiRLN");
        lIIIlllIlIIIl[lIIIlllIlIIll[80]] = lIlIIlIIIlIIllI("zxtDd8ciuUnd/lT6W3plEA==", "PmKcT");
        lIIIlllIlIIIl[lIIIlllIlIIll[81]] = lIlIIlIIIlIlIII("K3gw8e76kFCff4WRQ8o0QA==", "gsIck");
        lIIIlllIlIIIl[lIIIlllIlIIll[82]] = lIlIIlIIIlIIllI("hGdRkp7Pc+gXA7aEr8EgZM0Vo10y+9qAQjxx/SeG1hi0jv64/thGIXdZJ6eR37FL", "ErrQG");
        lIIIlllIlIIIl[lIIIlllIlIIll[83]] = lIlIIlIIIlIlIII("hiac9El8ZccmkdSzXy7vYGC4+Tup9Ga3z90IFVM0IQcf2mMjJQfqgtei5NX9q0YE", "YfEQb");
        lIIIlllIlIIIl[lIIIlllIlIIll[84]] = lIlIIlIIIlIIllI("UjbPc7rumz1X04AkmHAxIbGvNEIk+9Br", "MQnTj");
        lIIIlllIlIIIl[lIIIlllIlIIll[85]] = lIlIIlIIIlIIlll("CgUWCngXClgaPRkADAV4UA==", "xlxmX");
        lIIIlllIlIIIl[lIIIlllIlIIll[89]] = lIlIIlIIIlIlIII("Lfef7LYx6XrHzO9teB/1Bg==", "bHyyn");
        lIIIlllIlIIIl[lIIIlllIlIIll[90]] = lIlIIlIIIlIIllI("RYhYxFVwwP4JbRM2PcjO89Ep8xABpF3y", "BEsgA");
        lIIIlllIlIIIl[lIIIlllIlIIll[91]] = lIlIIlIIIlIIllI("RiRon/5J7V8V/HT/IDRT7Q==", "lmGJn");
        lIIIlllIlIIIl[lIIIlllIlIIll[92]] = lIlIIlIIIlIlIII("vGYp4TgEaYjoO19//uNJONpqrW5oZlakv/uXkVZAmQQKkZ7UO2cExWPEgp6z4u+J", "siMSY");
        lIIIlllIlIIIl[lIIIlllIlIIll[93]] = lIlIIlIIIlIIllI("KwL2gEIQHNQ=", "utgXd");
        lIIIlllIlIIIl[lIIIlllIlIIll[94]] = lIlIIlIIIlIlIII("DY5sD6Lq/j2m/F4wnh0gm9KNegSfzcJr", "pKDeq");
        lIIIlllIlIIIl[lIIIlllIlIIll[95]] = lIlIIlIIIlIIllI("2x94P4dE+HQr8fpUq5UomhUiC9VqYSzs3SJoJKqW+e0=", "vlDmC");
    }

    private static boolean lIlIIlIIIlllIll(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIlIIlIIIIIl(C0004e.j(lIIIlllIlIIll[2]), lIIIlllIlIIll[3])) {
            ?? r0 = lIIIlllIlIIll[1];
            "".length();
            return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIlllIlIIll[0];
    }

    private static String lIlIIlIIIlIlIII(String lllllllllllllllIIIIIlIllIlIlIlIl, String lllllllllllllllIIIIIlIllIlIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIllIlIlIlII.getBytes(StandardCharsets.UTF_8)), lIIIlllIlIIll[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlllIlIIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIllIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlIllIlIlIllI) {
            lllllllllllllllIIIIIlIllIlIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIllllll(int i2, int i3) {
        return i2 != i3;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            bD();
            "".length();
            if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                return (222 ^ 192) & ((35 ^ 61) ^ (-1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lIIIlllIlIIll[42];
    }

    private static boolean lIlIIlIIIlllllI(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean lIlIIlIIIlllIIl(int i2) {
        return i2 != 0;
    }

    private static String lIlIIlIIIlIIllI(String lllllllllllllllIIIIIlIllIllIIIlI, String lllllllllllllllIIIIIlIllIllIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIllIllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIlIllIllIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIlIllIllIIlII.init(lIIIlllIlIIll[3], secretKeySpec);
            return new String(lllllllllllllllIIIIIlIllIllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIllIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlIllIllIIIll) {
            lllllllllllllllIIIIIlIllIllIIIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIIlllIlIIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean aJ() {
        String[] strArr = new String[lIIIlllIlIIll[1]];
        strArr[lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[67]];
        if (lIlIIlIIIlllIIl(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lIIIlllIlIIll[1]];
            strArr2[lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[68]];
            if (lIlIIlIIIlllIIl(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[lIIIlllIlIIll[1]];
                strArr3[lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[45]];
                if (lIlIIlIIIlllIIl(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIIIlllIlIIll[1]];
                    strArr4[lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[69]];
                    if (lIlIIlIIIlllIIl(Inventory.contains(strArr4) ? 1 : 0)) {
                        int[] iArr = new int[lIIIlllIlIIll[1]];
                        iArr[lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                        if (lIlIIlIIIlllIIl(Inventory.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIIIlllIlIIll[1]];
                            iArr2[lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                            if (lIlIIlIIIlllIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                                int[] iArr3 = new int[lIIIlllIlIIll[1]];
                                iArr3[lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                                if (lIlIIlIIIlllIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                                    int[] iArr4 = new int[lIIIlllIlIIll[1]];
                                    iArr4[lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                                    if (lIlIIlIIIlllIIl(Inventory.contains(iArr4) ? 1 : 0)) {
                                        int[] iArr5 = new int[lIIIlllIlIIll[1]];
                                        iArr5[lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                                        if (lIlIIlIIIlllIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                                            String[] strArr5 = new String[lIIIlllIlIIll[1]];
                                            strArr5[lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[70]];
                                            if (lIlIIlIIIlllIIl(Inventory.contains(strArr5) ? 1 : 0)) {
                                                ?? r0 = lIIIlllIlIIll[1];
                                                "".length();
                                                return (101 ^ 96) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
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
        return lIIIlllIlIIll[0];
    }

    private static boolean lIlIIlIIIllllIl(int i2) {
        return i2 > 0;
    }

    private static boolean lIlIIlIIlIIIIII(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean lIlIIlIIlIIIIIl(int i2, int i3) {
        return i2 >= i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x02d9, code lost:
        if (lIlIIlIIIlllIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.z.lIIIlllIlIIll[9]) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x03bb, code lost:
        if (lIlIIlIIIlllIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.z.lIIIlllIlIIll[30]) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04aa, code lost:
        if (lIlIIlIIIlllIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.z.lIIIlllIlIIll[30]) != false) goto L86;
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
    private static void W() {
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
        int[] iArr13 = new int[lIIIlllIlIIll[1]];
        iArr13[lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
        if (lIlIIlIIIlllIll(Bank.contains(iArr13) ? 1 : 0)) {
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[36]]);
            bA.add(new C0003d(lIIIlllIlIIll[21], lIIIlllIlIIll[1], lIIIlllIlIIll[37]));
            "".length();
        }
        int[] iArr14 = new int[lIIIlllIlIIll[1]];
        iArr14[lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
        if (lIlIIlIIIlllIll(Bank.contains(iArr14) ? 1 : 0)) {
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[38]]);
            bA.add(new C0003d(lIIIlllIlIIll[22], lIIIlllIlIIll[1], lIIIlllIlIIll[39]));
            "".length();
        }
        int[] iArr15 = new int[lIIIlllIlIIll[1]];
        iArr15[lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
        if (lIlIIlIIIlllIll(Bank.contains(iArr15) ? 1 : 0)) {
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[40]]);
            bA.add(new C0003d(lIIIlllIlIIll[23], lIIIlllIlIIll[1], lIIIlllIlIIll[39]));
            "".length();
        }
        int[] iArr16 = new int[lIIIlllIlIIll[1]];
        iArr16[lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
        if (lIlIIlIIIlllIll(Bank.contains(iArr16) ? 1 : 0)) {
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[30]]);
            bA.add(new C0003d(lIIIlllIlIIll[24], lIIIlllIlIIll[1], lIIIlllIlIIll[39]));
            "".length();
        }
        int[] iArr17 = new int[lIIIlllIlIIll[1]];
        iArr17[lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
        if (lIlIIlIIIlllIll(Bank.contains(iArr17) ? 1 : 0)) {
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[41]]);
            bA.add(new C0003d(lIIIlllIlIIll[25], lIIIlllIlIIll[42], lIIIlllIlIIll[43]));
            "".length();
        }
        int[] iArr18 = new int[lIIIlllIlIIll[1]];
        iArr18[lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
        if (lIlIIlIIIlllIIl(Bank.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[lIIIlllIlIIll[1]];
            iArr19[lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
            if (lIlIIlIIIlllIlI(Bank.getFirst(iArr19).getQuantity(), lIIIlllIlIIll[30])) {
                System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[44]]);
                bA.add(new C0003d(lIIIlllIlIIll[25], lIIIlllIlIIll[45], lIIIlllIlIIll[43]));
                "".length();
            }
        }
        int[] iArr20 = new int[lIIIlllIlIIll[1]];
        iArr20[lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
        if (lIlIIlIIIlllIll(Bank.contains(iArr20) ? 1 : 0)) {
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[46]]);
            bA.add(new C0003d(lIIIlllIlIIll[17], lIIIlllIlIIll[9], lIIIlllIlIIll[47]));
            "".length();
        }
        int[] iArr21 = new int[lIIIlllIlIIll[1]];
        iArr21[lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
        if (lIlIIlIIIlllIIl(Bank.contains(iArr21) ? 1 : 0)) {
            int[] iArr22 = new int[lIIIlllIlIIll[1]];
            iArr22[lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
            if (lIlIIlIIIlllIIl(Bank.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[lIIIlllIlIIll[1]];
                iArr23[lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
            }
            if (lIlIIlIIIlllIll(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIIIlllIlIIIl[lIIIlllIlIIll[85]]);
            }) ? 1 : 0)) {
                System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[49]]);
                bA.add(new C0003d(lIIIlllIlIIll[50], lIIIlllIlIIll[38], lIIIlllIlIIll[51]));
                "".length();
            }
            iArr = new int[lIIIlllIlIIll[1]];
            iArr[lIIIlllIlIIll[0]] = lIIIlllIlIIll[20];
            if (lIlIIlIIIlllIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr24 = new int[lIIIlllIlIIll[1]];
                iArr24[lIIIlllIlIIll[0]] = lIIIlllIlIIll[20];
                if (lIlIIlIIIlllIIl(Bank.contains(iArr24) ? 1 : 0)) {
                    int[] iArr25 = new int[lIIIlllIlIIll[1]];
                    iArr25[lIIIlllIlIIll[0]] = lIIIlllIlIIll[20];
                }
                iArr2 = new int[lIIIlllIlIIll[1]];
                iArr2[lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                if (lIlIIlIIIlllIll(Bank.contains(iArr2) ? 1 : 0)) {
                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[54]]);
                    bA.add(new C0003d(lIIIlllIlIIll[7], lIIIlllIlIIll[30], lIIIlllIlIIll[53]));
                    "".length();
                }
                iArr3 = new int[lIIIlllIlIIll[1]];
                iArr3[lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                if (lIlIIlIIIlllIIl(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr26 = new int[lIIIlllIlIIll[1]];
                    iArr26[lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                    if (lIlIIlIIIlllIIl(Bank.contains(iArr26) ? 1 : 0)) {
                        int[] iArr27 = new int[lIIIlllIlIIll[1]];
                        iArr27[lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                    }
                    iArr4 = new int[lIIIlllIlIIll[1]];
                    iArr4[lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                    if (lIlIIlIIIlllIll(Bank.contains(iArr4) ? 1 : 0)) {
                        System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[56]]);
                        bA.add(new C0003d(lIIIlllIlIIll[27], lIIIlllIlIIll[9], C0007h.bv));
                        "".length();
                    }
                    iArr5 = new int[lIIIlllIlIIll[1]];
                    iArr5[lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                    if (lIlIIlIIIlllIIl(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr28 = new int[lIIIlllIlIIll[1]];
                        iArr28[lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                        if (lIlIIlIIIlllIlI(Bank.getFirst(iArr28).getQuantity(), lIIIlllIlIIll[11])) {
                            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[57]]);
                            bA.add(new C0003d(lIIIlllIlIIll[10], lIIIlllIlIIll[58], lIIIlllIlIIll[14]));
                            "".length();
                        }
                    }
                    iArr6 = new int[lIIIlllIlIIll[1]];
                    iArr6[lIIIlllIlIIll[0]] = lIIIlllIlIIll[59];
                    if (lIlIIlIIIlllIIl(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr29 = new int[lIIIlllIlIIll[1]];
                        iArr29[lIIIlllIlIIll[0]] = lIIIlllIlIIll[59];
                        if (lIlIIlIIIlllIlI(Bank.getFirst(iArr29).getQuantity(), lIIIlllIlIIll[11])) {
                            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[60]]);
                            bA.add(new C0003d(lIIIlllIlIIll[59], lIIIlllIlIIll[58], lIIIlllIlIIll[14]));
                            "".length();
                        }
                    }
                    iArr7 = new int[lIIIlllIlIIll[1]];
                    iArr7[lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                    if (lIlIIlIIIlllIIl(Bank.contains(iArr7) ? 1 : 0)) {
                        int[] iArr30 = new int[lIIIlllIlIIll[1]];
                        iArr30[lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                        if (lIlIIlIIIlllIlI(Bank.getFirst(iArr30).getQuantity(), lIIIlllIlIIll[11])) {
                            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[61]]);
                            bA.add(new C0003d(lIIIlllIlIIll[15], lIIIlllIlIIll[58], lIIIlllIlIIll[14]));
                            "".length();
                        }
                    }
                    iArr8 = new int[lIIIlllIlIIll[1]];
                    iArr8[lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                    if (lIlIIlIIIlllIIl(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr31 = new int[lIIIlllIlIIll[1]];
                        iArr31[lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                        if (lIlIIlIIIlllIlI(Bank.getFirst(iArr31).getQuantity(), lIIIlllIlIIll[11])) {
                            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[62]]);
                            bA.add(new C0003d(lIIIlllIlIIll[13], lIIIlllIlIIll[58], lIIIlllIlIIll[14]));
                            "".length();
                        }
                    }
                    iArr9 = new int[lIIIlllIlIIll[1]];
                    iArr9[lIIIlllIlIIll[0]] = lIIIlllIlIIll[59];
                    if (lIlIIlIIIlllIll(Bank.contains(iArr9) ? 1 : 0)) {
                        System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[63]]);
                        bA.add(new C0003d(lIIIlllIlIIll[59], lIIIlllIlIIll[58], lIIIlllIlIIll[14]));
                        "".length();
                    }
                    iArr10 = new int[lIIIlllIlIIll[1]];
                    iArr10[lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                    if (lIlIIlIIIlllIll(Bank.contains(iArr10) ? 1 : 0)) {
                        System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[64]]);
                        bA.add(new C0003d(lIIIlllIlIIll[15], lIIIlllIlIIll[58], lIIIlllIlIIll[14]));
                        "".length();
                    }
                    iArr11 = new int[lIIIlllIlIIll[1]];
                    iArr11[lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                    if (lIlIIlIIIlllIll(Bank.contains(iArr11) ? 1 : 0)) {
                        System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[65]]);
                        bA.add(new C0003d(lIIIlllIlIIll[13], lIIIlllIlIIll[58], lIIIlllIlIIll[14]));
                        "".length();
                    }
                    iArr12 = new int[lIIIlllIlIIll[1]];
                    iArr12[lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                    if (lIlIIlIIIlllIll(Bank.contains(iArr12) ? 1 : 0)) {
                        return;
                    }
                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[66]]);
                    bA.add(new C0003d(lIIIlllIlIIll[10], lIIIlllIlIIll[58], lIIIlllIlIIll[14]));
                    "".length();
                    return;
                }
                System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[55]]);
                bA.add(new C0003d(lIIIlllIlIIll[7], lIIIlllIlIIll[30], lIIIlllIlIIll[53]));
                "".length();
                iArr4 = new int[lIIIlllIlIIll[1]];
                iArr4[lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                if (lIlIIlIIIlllIll(Bank.contains(iArr4) ? 1 : 0)) {
                }
                iArr5 = new int[lIIIlllIlIIll[1]];
                iArr5[lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                if (lIlIIlIIIlllIIl(Bank.contains(iArr5) ? 1 : 0)) {
                }
                iArr6 = new int[lIIIlllIlIIll[1]];
                iArr6[lIIIlllIlIIll[0]] = lIIIlllIlIIll[59];
                if (lIlIIlIIIlllIIl(Bank.contains(iArr6) ? 1 : 0)) {
                }
                iArr7 = new int[lIIIlllIlIIll[1]];
                iArr7[lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                if (lIlIIlIIIlllIIl(Bank.contains(iArr7) ? 1 : 0)) {
                }
                iArr8 = new int[lIIIlllIlIIll[1]];
                iArr8[lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                if (lIlIIlIIIlllIIl(Bank.contains(iArr8) ? 1 : 0)) {
                }
                iArr9 = new int[lIIIlllIlIIll[1]];
                iArr9[lIIIlllIlIIll[0]] = lIIIlllIlIIll[59];
                if (lIlIIlIIIlllIll(Bank.contains(iArr9) ? 1 : 0)) {
                }
                iArr10 = new int[lIIIlllIlIIll[1]];
                iArr10[lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                if (lIlIIlIIIlllIll(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[lIIIlllIlIIll[1]];
                iArr11[lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                if (lIlIIlIIIlllIll(Bank.contains(iArr11) ? 1 : 0)) {
                }
                iArr12 = new int[lIIIlllIlIIll[1]];
                iArr12[lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                if (lIlIIlIIIlllIll(Bank.contains(iArr12) ? 1 : 0)) {
                }
            }
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[52]]);
            bA.add(new C0003d(lIIIlllIlIIll[20], lIIIlllIlIIll[45], lIIIlllIlIIll[53]));
            "".length();
            iArr2 = new int[lIIIlllIlIIll[1]];
            iArr2[lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
            if (lIlIIlIIIlllIll(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lIIIlllIlIIll[1]];
            iArr3[lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
            if (lIlIIlIIIlllIIl(Bank.contains(iArr3) ? 1 : 0)) {
            }
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[55]]);
            bA.add(new C0003d(lIIIlllIlIIll[7], lIIIlllIlIIll[30], lIIIlllIlIIll[53]));
            "".length();
            iArr4 = new int[lIIIlllIlIIll[1]];
            iArr4[lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
            if (lIlIIlIIIlllIll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIIIlllIlIIll[1]];
            iArr5[lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
            if (lIlIIlIIIlllIIl(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lIIIlllIlIIll[1]];
            iArr6[lIIIlllIlIIll[0]] = lIIIlllIlIIll[59];
            if (lIlIIlIIIlllIIl(Bank.contains(iArr6) ? 1 : 0)) {
            }
            iArr7 = new int[lIIIlllIlIIll[1]];
            iArr7[lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
            if (lIlIIlIIIlllIIl(Bank.contains(iArr7) ? 1 : 0)) {
            }
            iArr8 = new int[lIIIlllIlIIll[1]];
            iArr8[lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
            if (lIlIIlIIIlllIIl(Bank.contains(iArr8) ? 1 : 0)) {
            }
            iArr9 = new int[lIIIlllIlIIll[1]];
            iArr9[lIIIlllIlIIll[0]] = lIIIlllIlIIll[59];
            if (lIlIIlIIIlllIll(Bank.contains(iArr9) ? 1 : 0)) {
            }
            iArr10 = new int[lIIIlllIlIIll[1]];
            iArr10[lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
            if (lIlIIlIIIlllIll(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[lIIIlllIlIIll[1]];
            iArr11[lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
            if (lIlIIlIIIlllIll(Bank.contains(iArr11) ? 1 : 0)) {
            }
            iArr12 = new int[lIIIlllIlIIll[1]];
            iArr12[lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
            if (lIlIIlIIIlllIll(Bank.contains(iArr12) ? 1 : 0)) {
            }
        }
        System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[48]]);
        bA.add(new C0003d(lIIIlllIlIIll[17], lIIIlllIlIIll[9], lIIIlllIlIIll[47]));
        "".length();
        if (lIlIIlIIIlllIll(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIIlllIlIIIl[lIIIlllIlIIll[85]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lIIIlllIlIIll[1]];
        iArr[lIIIlllIlIIll[0]] = lIIIlllIlIIll[20];
        if (lIlIIlIIIlllIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[52]]);
        bA.add(new C0003d(lIIIlllIlIIll[20], lIIIlllIlIIll[45], lIIIlllIlIIll[53]));
        "".length();
        iArr2 = new int[lIIIlllIlIIll[1]];
        iArr2[lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
        if (lIlIIlIIIlllIll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIIIlllIlIIll[1]];
        iArr3[lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
        if (lIlIIlIIIlllIIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
        System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[55]]);
        bA.add(new C0003d(lIIIlllIlIIll[7], lIIIlllIlIIll[30], lIIIlllIlIIll[53]));
        "".length();
        iArr4 = new int[lIIIlllIlIIll[1]];
        iArr4[lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
        if (lIlIIlIIIlllIll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIIIlllIlIIll[1]];
        iArr5[lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
        if (lIlIIlIIIlllIIl(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIIIlllIlIIll[1]];
        iArr6[lIIIlllIlIIll[0]] = lIIIlllIlIIll[59];
        if (lIlIIlIIIlllIIl(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[lIIIlllIlIIll[1]];
        iArr7[lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
        if (lIlIIlIIIlllIIl(Bank.contains(iArr7) ? 1 : 0)) {
        }
        iArr8 = new int[lIIIlllIlIIll[1]];
        iArr8[lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
        if (lIlIIlIIIlllIIl(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[lIIIlllIlIIll[1]];
        iArr9[lIIIlllIlIIll[0]] = lIIIlllIlIIll[59];
        if (lIlIIlIIIlllIll(Bank.contains(iArr9) ? 1 : 0)) {
        }
        iArr10 = new int[lIIIlllIlIIll[1]];
        iArr10[lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
        if (lIlIIlIIIlllIll(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[lIIIlllIlIIll[1]];
        iArr11[lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
        if (lIlIIlIIIlllIll(Bank.contains(iArr11) ? 1 : 0)) {
        }
        iArr12 = new int[lIIIlllIlIIll[1]];
        iArr12[lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
        if (lIlIIlIIIlllIll(Bank.contains(iArr12) ? 1 : 0)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v366, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v375, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v384, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v393, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v402, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v411, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v437, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    public static void bD() {
        if (lIlIIlIIIlllIIl(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[0]];
            C0001b.a(bA);
            if (lIlIIlIIIlllIlI(bA.size(), lIIIlllIlIIll[1])) {
                System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[1]]);
                by = lIIIlllIlIIll[0];
            }
        }
        if (lIlIIlIIIlllIll(by ? 1 : 0)) {
            if (lIlIIlIIIlllIll(C0004e.j(lIIIlllIlIIll[2]))) {
                if (lIlIIlIIIlllIll(aJ() ? 1 : 0)) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (lIlIIlIIIllllII(nearest) && lIlIIlIIIlllIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[3]];
                        C0000a.a(nearest);
                    }
                    if (lIlIIlIIIllllII(nearest) && lIlIIlIIIlllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIlIIlIIIlllIll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[4]];
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIIIlllIlIIll[5]);
                            "".length();
                        }
                        if (lIlIIlIIIlllIIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[6]];
                            if (lIlIIlIIIllllIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIIIlllIlIIll[4]);
                                "".length();
                            }
                            if (lIlIIlIIIllllIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIIIlllIlIIll[3]);
                                "".length();
                            }
                            int[] iArr = new int[lIIIlllIlIIll[1]];
                            iArr[lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                            if (lIlIIlIIIlllIIl(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIIIlllIlIIll[1]];
                                iArr2[lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                                if (lIlIIlIIIlllIlI(Bank.getFirst(iArr2).getQuantity(), lIIIlllIlIIll[8])) {
                                    W();
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[9]]);
                                    by = lIIIlllIlIIll[1];
                                    return;
                                }
                            }
                            int[] iArr3 = new int[lIIIlllIlIIll[1]];
                            iArr3[lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                            if (lIlIIlIIIlllIIl(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIIIlllIlIIll[1]];
                                iArr4[lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                                if (lIlIIlIIIlllIlI(Bank.getFirst(iArr4).getQuantity(), lIIIlllIlIIll[11])) {
                                    W();
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[12]]);
                                    by = lIIIlllIlIIll[1];
                                    return;
                                }
                            }
                            int[] iArr5 = new int[lIIIlllIlIIll[1]];
                            iArr5[lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                            if (lIlIIlIIIlllIIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIIlllIlIIll[1]];
                                iArr6[lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                                if (lIlIIlIIIlllIlI(Bank.getFirst(iArr6).getQuantity(), lIIIlllIlIIll[11])) {
                                    W();
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[14]]);
                                    by = lIIIlllIlIIll[1];
                                    return;
                                }
                            }
                            int[] iArr7 = new int[lIIIlllIlIIll[1]];
                            iArr7[lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                            if (lIlIIlIIIlllIIl(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIIIlllIlIIll[1]];
                                iArr8[lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                                if (lIlIIlIIIlllIlI(Bank.getFirst(iArr8).getQuantity(), lIIIlllIlIIll[11])) {
                                    W();
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[16]]);
                                    by = lIIIlllIlIIll[1];
                                    return;
                                }
                            }
                            int[] iArr9 = new int[lIIIlllIlIIll[1]];
                            iArr9[lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                            if (lIlIIlIIIlllIIl(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIIIlllIlIIll[1]];
                                iArr10[lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                                if (lIlIIlIIIlllIlI(Bank.getFirst(iArr10).getQuantity(), lIIIlllIlIIll[9])) {
                                    W();
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[18]]);
                                    by = lIIIlllIlIIll[1];
                                    return;
                                }
                            }
                            int[] iArr11 = new int[lIIIlllIlIIll[19]];
                            iArr11[lIIIlllIlIIll[0]] = lIIIlllIlIIll[20];
                            iArr11[lIIIlllIlIIll[1]] = lIIIlllIlIIll[21];
                            iArr11[lIIIlllIlIIll[3]] = lIIIlllIlIIll[22];
                            iArr11[lIIIlllIlIIll[4]] = lIIIlllIlIIll[23];
                            iArr11[lIIIlllIlIIll[6]] = lIIIlllIlIIll[24];
                            iArr11[lIIIlllIlIIll[9]] = lIIIlllIlIIll[7];
                            iArr11[lIIIlllIlIIll[12]] = lIIIlllIlIIll[17];
                            iArr11[lIIIlllIlIIll[14]] = lIIIlllIlIIll[25];
                            iArr11[lIIIlllIlIIll[16]] = lIIIlllIlIIll[10];
                            iArr11[lIIIlllIlIIll[18]] = lIIIlllIlIIll[15];
                            iArr11[lIIIlllIlIIll[8]] = lIIIlllIlIIll[13];
                            if (lIlIIlIIIlllIll(C0004e.b(iArr11) ? 1 : 0)) {
                                W();
                                System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[8]]);
                                by = lIIIlllIlIIll[1];
                                return;
                            }
                            while (lIlIIlIIIlllIll(C0012m.av() ? 1 : 0)) {
                                C0012m.at();
                                Time.sleepTicks(lIIIlllIlIIll[1]);
                                "".length();
                                "".length();
                                if (" ".length() >= ((194 ^ 153) ^ (247 ^ 168))) {
                                    return;
                                }
                            }
                            if (lIlIIlIIIlllIll(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepTicks(lIIIlllIlIIll[6]);
                                "".length();
                            }
                            int[] iArr12 = new int[lIIIlllIlIIll[1]];
                            iArr12[lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                            if (lIlIIlIIIlllIIl(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIIIlllIlIIll[1]];
                                iArr13[lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                                if (lIlIIlIIIlllIlI(Inventory.getCount(iArr13), lIIIlllIlIIll[1])) {
                                    Bank.withdraw(lIIIlllIlIIll[22], lIIIlllIlIIll[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIlllIlIIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr14 = new int[lIIIlllIlIIll[1]];
                                        iArr14[lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                                        if (lIlIIlIIIllllIl(Inventory.getCount(iArr14))) {
                                            ?? r0 = lIIIlllIlIIll[1];
                                            "".length();
                                            return 0 != 0 ? ((124 ^ 78) ^ (2 ^ 101)) & (((88 ^ 61) ^ (32 ^ 16)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIIlllIlIIll[0];
                                    }, lIIIlllIlIIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr14 = new int[lIIIlllIlIIll[1]];
                            iArr14[lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                            if (lIlIIlIIIlllIIl(Bank.contains(iArr14) ? 1 : 0)) {
                                int[] iArr15 = new int[lIIIlllIlIIll[1]];
                                iArr15[lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                                if (lIlIIlIIIlllIlI(Inventory.getCount(iArr15), lIIIlllIlIIll[1])) {
                                    Bank.withdraw(lIIIlllIlIIll[23], lIIIlllIlIIll[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIlllIlIIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr16 = new int[lIIIlllIlIIll[1]];
                                        iArr16[lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                                        if (lIlIIlIIIllllIl(Inventory.getCount(iArr16))) {
                                            ?? r0 = lIIIlllIlIIll[1];
                                            "".length();
                                            return "   ".length() <= ((243 ^ 173) & ((70 ^ 24) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIIlllIlIIll[0];
                                    }, lIIIlllIlIIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr16 = new int[lIIIlllIlIIll[1]];
                            iArr16[lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                            if (lIlIIlIIIlllIIl(Bank.contains(iArr16) ? 1 : 0)) {
                                int[] iArr17 = new int[lIIIlllIlIIll[1]];
                                iArr17[lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                                if (lIlIIlIIIlllIlI(Inventory.getCount(iArr17), lIIIlllIlIIll[1])) {
                                    Bank.withdraw(lIIIlllIlIIll[21], lIIIlllIlIIll[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIlllIlIIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr18 = new int[lIIIlllIlIIll[1]];
                                        iArr18[lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                                        if (lIlIIlIIIllllIl(Inventory.getCount(iArr18))) {
                                            ?? r0 = lIIIlllIlIIll[1];
                                            "".length();
                                            return (((143 ^ 171) ^ (31 ^ 8)) & (((((131 + 27) - 73) + 66) ^ (((64 + 76) - 30) + 54)) ^ (-" ".length()))) != 0 ? ((1 ^ 85) ^ (56 ^ 113)) & (((82 ^ 61) ^ (59 ^ 73)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIIlllIlIIll[0];
                                    }, lIIIlllIlIIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr18 = new int[lIIIlllIlIIll[1]];
                            iArr18[lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                            if (lIlIIlIIIlllIIl(Bank.contains(iArr18) ? 1 : 0)) {
                                int[] iArr19 = new int[lIIIlllIlIIll[1]];
                                iArr19[lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                                if (lIlIIlIIIlllIlI(Inventory.getCount(iArr19), lIIIlllIlIIll[1])) {
                                    Bank.withdraw(lIIIlllIlIIll[24], lIIIlllIlIIll[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIlllIlIIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr20 = new int[lIIIlllIlIIll[1]];
                                        iArr20[lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                                        if (lIlIIlIIIllllIl(Inventory.getCount(iArr20))) {
                                            ?? r0 = lIIIlllIlIIll[1];
                                            "".length();
                                            return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIIlllIlIIll[0];
                                    }, lIIIlllIlIIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr20 = new int[lIIIlllIlIIll[1]];
                            iArr20[lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                            if (lIlIIlIIIlllIIl(Bank.contains(iArr20) ? 1 : 0)) {
                                int[] iArr21 = new int[lIIIlllIlIIll[1]];
                                iArr21[lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                                if (lIlIIlIIIlllIlI(Inventory.getCount(iArr21), lIIIlllIlIIll[1])) {
                                    Bank.withdraw(lIIIlllIlIIll[7], lIIIlllIlIIll[9], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIlllIlIIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr22 = new int[lIIIlllIlIIll[1]];
                                        iArr22[lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                                        if (lIlIIlIIIllllIl(Inventory.getCount(iArr22))) {
                                            ?? r0 = lIIIlllIlIIll[1];
                                            "".length();
                                            return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIIlllIlIIll[0];
                                    }, lIIIlllIlIIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr22 = new int[lIIIlllIlIIll[1]];
                            iArr22[lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                            if (lIlIIlIIIlllIIl(Bank.contains(iArr22) ? 1 : 0)) {
                                int[] iArr23 = new int[lIIIlllIlIIll[1]];
                                iArr23[lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                                if (lIlIIlIIIlllIlI(Inventory.getCount(iArr23), lIIIlllIlIIll[1])) {
                                    Bank.withdraw(lIIIlllIlIIll[17], lIIIlllIlIIll[6], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIlllIlIIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr24 = new int[lIIIlllIlIIll[1]];
                                        iArr24[lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                                        if (lIlIIlIIIllllIl(Inventory.getCount(iArr24))) {
                                            ?? r0 = lIIIlllIlIIll[1];
                                            "".length();
                                            return " ".length() < (((160 ^ 198) ^ (145 ^ 191)) & (((158 ^ 129) ^ (5 ^ 82)) ^ (-" ".length()))) ? ((240 ^ 129) ^ (8 ^ 97)) & (((127 ^ 83) ^ (123 ^ 79)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIIlllIlIIll[0];
                                    }, lIIIlllIlIIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr24 = new int[lIIIlllIlIIll[1]];
                            iArr24[lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                            if (lIlIIlIIIlllIIl(Bank.contains(iArr24) ? 1 : 0)) {
                                int[] iArr25 = new int[lIIIlllIlIIll[1]];
                                iArr25[lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                                if (lIlIIlIIIlllIlI(Inventory.getCount(iArr25), lIIIlllIlIIll[1])) {
                                    Bank.withdraw(lIIIlllIlIIll[10], lIIIlllIlIIll[26], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIlllIlIIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr26 = new int[lIIIlllIlIIll[1]];
                                        iArr26[lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                                        if (lIlIIlIIIllllIl(Inventory.getCount(iArr26))) {
                                            ?? r0 = lIIIlllIlIIll[1];
                                            "".length();
                                            return (((19 ^ 127) ^ (182 ^ 152)) & (((((210 + 111) - 131) + 53) ^ (((156 + 91) - 245) + 175)) ^ (-" ".length()))) != (((189 ^ 142) ^ (249 ^ 132)) & (((32 ^ 98) ^ (166 ^ 170)) ^ (-" ".length()))) ? ((188 ^ 193) ^ (9 ^ 110)) & (((((46 + 3) - 46) + 139) ^ (((90 + 125) - 104) + 37)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIIlllIlIIll[0];
                                    }, lIIIlllIlIIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr26 = new int[lIIIlllIlIIll[1]];
                            iArr26[lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                            if (lIlIIlIIIlllIIl(Bank.contains(iArr26) ? 1 : 0)) {
                                int[] iArr27 = new int[lIIIlllIlIIll[1]];
                                iArr27[lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                                if (lIlIIlIIIlllIlI(Inventory.getCount(iArr27), lIIIlllIlIIll[1])) {
                                    Bank.withdraw(lIIIlllIlIIll[15], lIIIlllIlIIll[26], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIlllIlIIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr28 = new int[lIIIlllIlIIll[1]];
                                        iArr28[lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                                        if (lIlIIlIIIllllIl(Inventory.getCount(iArr28))) {
                                            ?? r0 = lIIIlllIlIIll[1];
                                            "".length();
                                            return "  ".length() == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIIlllIlIIll[0];
                                    }, lIIIlllIlIIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr28 = new int[lIIIlllIlIIll[1]];
                            iArr28[lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                            if (lIlIIlIIIlllIIl(Bank.contains(iArr28) ? 1 : 0)) {
                                int[] iArr29 = new int[lIIIlllIlIIll[1]];
                                iArr29[lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                                if (lIlIIlIIIlllIlI(Inventory.getCount(iArr29), lIIIlllIlIIll[1])) {
                                    Bank.withdraw(lIIIlllIlIIll[13], lIIIlllIlIIll[26], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIlllIlIIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr30 = new int[lIIIlllIlIIll[1]];
                                        iArr30[lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                                        if (lIlIIlIIIllllIl(Inventory.getCount(iArr30))) {
                                            ?? r0 = lIIIlllIlIIll[1];
                                            "".length();
                                            return "   ".length() == ((43 ^ 53) & ((0 ^ 30) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIIlllIlIIll[0];
                                    }, lIIIlllIlIIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr30 = new int[lIIIlllIlIIll[1]];
                            iArr30[lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                            if (lIlIIlIIIlllIIl(Bank.contains(iArr30) ? 1 : 0)) {
                                int[] iArr31 = new int[lIIIlllIlIIll[1]];
                                iArr31[lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                                if (lIlIIlIIIlllIll(Inventory.contains(iArr31) ? 1 : 0)) {
                                    Bank.withdraw(lIIIlllIlIIll[27], lIIIlllIlIIll[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIlllIlIIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr32 = new int[lIIIlllIlIIll[1]];
                                        iArr32[lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                                        return Inventory.contains(iArr32);
                                    }, lIIIlllIlIIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr32 = new int[lIIIlllIlIIll[1]];
                            iArr32[lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                            if (lIlIIlIIIlllIIl(Bank.contains(iArr32) ? 1 : 0)) {
                                int[] iArr33 = new int[lIIIlllIlIIll[1]];
                                iArr33[lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                                if (lIlIIlIIIlllIlI(Inventory.getCount(iArr33), lIIIlllIlIIll[1])) {
                                    Bank.withdrawAll(lIIIlllIlIIll[25], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIlllIlIIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr34 = new int[lIIIlllIlIIll[1]];
                                        iArr34[lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                                        if (lIlIIlIIIllllIl(Inventory.getCount(iArr34))) {
                                            ?? r0 = lIIIlllIlIIll[1];
                                            "".length();
                                            return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIIlllIlIIll[0];
                                    }, lIIIlllIlIIll[5]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
                if (lIlIIlIIIlllllI(Players.getLocal().getWorldLocation().distanceTo(gb), lIIIlllIlIIll[6]) && lIlIIlIIIllllll(Players.getLocal().getWorldLocation().getPlane(), lIIIlllIlIIll[3]) && lIlIIlIIIlllIIl(aJ() ? 1 : 0)) {
                    if (lIlIIlIIIlllIIl(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks(lIIIlllIlIIll[6]);
                        "".length();
                    }
                    AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[19]];
                    if (lIlIIlIIIlllIll(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIlIIIlllIlI(bY, lIIIlllIlIIll[1])) {
                            C0004e.w();
                            bY += lIIIlllIlIIll[1];
                        }
                        if (lIlIIlIIIlllIIl(new WorldArea(lIIIlllIlIIll[28], lIIIlllIlIIll[29], lIIIlllIlIIll[30], lIIIlllIlIIll[31], lIIIlllIlIIll[3]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr = new String[lIIIlllIlIIll[1]];
                            strArr[lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[32]];
                            TileObjects.getNearest(strArr).interact(lIIIlllIlIIIl[lIIIlllIlIIll[33]]);
                            Time.sleepTicks(C0004e.c(lIIIlllIlIIll[12], lIIIlllIlIIll[16]));
                            "".length();
                        }
                        Movement.walkTo(gb);
                        "".length();
                        Time.sleepTicks(lIIIlllIlIIll[3]);
                        "".length();
                    }
                }
                if (lIlIIlIIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(gb), lIIIlllIlIIll[12])) {
                    AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[34]];
                    co = lIIIlllIlIIll[0];
                    C0006g.a(fa, dP);
                    if (lIlIIlIIIlllIIl(C0006g.L() ? 1 : 0)) {
                        C0006g.a(dP);
                    }
                }
            }
            if (lIlIIlIIIllllIl(C0004e.j(lIIIlllIlIIll[2])) && lIlIIlIIIlllIlI(C0004e.j(lIIIlllIlIIll[2]), lIIIlllIlIIll[3])) {
                if (lIlIIlIIIlllIll(aJ() ? 1 : 0)) {
                    bm();
                }
                if (lIlIIlIIIlllIIl(aJ() ? 1 : 0)) {
                    if (lIlIIlIIIlllllI(Players.getLocal().getWorldLocation().distanceTo(gb), lIIIlllIlIIll[12])) {
                        AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[31]];
                        if (lIlIIlIIIlllIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(gb);
                        "".length();
                        Time.sleepTicks(lIIIlllIlIIll[1]);
                        "".length();
                    }
                    if (lIlIIlIIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(gb), lIIIlllIlIIll[12])) {
                        AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[35]];
                        if (lIlIIlIIIlllIlI(co, lIIIlllIlIIll[1])) {
                            P.lw += lIIIlllIlIIll[1];
                            P.d(AccBuilderRat.m);
                            co += lIIIlllIlIIll[1];
                            P.lw = lIIIlllIlIIll[0];
                            cp = lIIIlllIlIIll[0];
                        }
                        C0006g.a(fa, dP);
                        if (lIlIIlIIIlllIIl(C0006g.L() ? 1 : 0)) {
                            C0006g.a(dP);
                        }
                    }
                }
            }
            System.out.println("Setting: " + C0004e.j(lIIIlllIlIIll[2]));
            C0006g.a(new String[lIIIlllIlIIll[0]]);
        }
    }

    static {
        lIlIIlIIIlllIII();
        lIlIIlIIIllIlll();
        gf = lIIIlllIlIIll[23];
        gj = lIIIlllIlIIll[13];
        gi = lIIIlllIlIIll[15];
        f3gg = lIIIlllIlIIll[24];
        ge = lIIIlllIlIIll[22];
        gk = lIIIlllIlIIll[86];
        gh = lIIIlllIlIIll[10];
        gc = lIIIlllIlIIll[2];
        gd = lIIIlllIlIIll[21];
        gm = lIIIlllIlIIll[17];
        gl = lIIIlllIlIIll[25];
        gb = new WorldPoint(lIIIlllIlIIll[87], lIIIlllIlIIll[88], lIIIlllIlIIll[3]);
        bA = new ArrayList();
        fa = lIIIlllIlIIIl[lIIIlllIlIIll[89]];
        String[] strArr = new String[lIIIlllIlIIll[12]];
        strArr[lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[90]];
        strArr[lIIIlllIlIIll[1]] = lIIIlllIlIIIl[lIIIlllIlIIll[91]];
        strArr[lIIIlllIlIIll[3]] = lIIIlllIlIIIl[lIIIlllIlIIll[92]];
        strArr[lIIIlllIlIIll[4]] = lIIIlllIlIIIl[lIIIlllIlIIll[93]];
        strArr[lIIIlllIlIIll[6]] = lIIIlllIlIIIl[lIIIlllIlIIll[94]];
        strArr[lIIIlllIlIIll[9]] = lIIIlllIlIIIl[lIIIlllIlIIll[95]];
        dP = strArr;
        bY = lIIIlllIlIIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v244, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v253, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v262, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v271, types: [boolean] */
    private static void bm() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlIIlIIIllllII(nearest) && lIlIIlIIIlllIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[71]];
            C0000a.a(nearest);
        }
        if (lIlIIlIIIllllII(nearest) && lIlIIlIIIlllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlIIlIIIlllIll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[72]];
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIIlllIlIIll[5]);
                "".length();
            }
            if (lIlIIlIIIlllIIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[73]];
                if (lIlIIlIIIllllIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIIIlllIlIIll[4]);
                    "".length();
                }
                if (lIlIIlIIIllllIl(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lIIIlllIlIIll[3]);
                    "".length();
                }
                String[] strArr = new String[lIIIlllIlIIll[1]];
                strArr[lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[74]];
                if (lIlIIlIIIlllIIl(Bank.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIIlllIlIIll[1]];
                    strArr2[lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[75]];
                    if (lIlIIlIIIlllIlI(Bank.getFirst(strArr2).getQuantity(), lIIIlllIlIIll[11])) {
                        W();
                        System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[76]]);
                        by = lIIIlllIlIIll[1];
                        return;
                    }
                }
                String[] strArr3 = new String[lIIIlllIlIIll[1]];
                strArr3[lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[77]];
                if (lIlIIlIIIlllIIl(Bank.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIIIlllIlIIll[1]];
                    strArr4[lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[78]];
                    if (lIlIIlIIIlllIlI(Bank.getFirst(strArr4).getQuantity(), lIIIlllIlIIll[11])) {
                        W();
                        System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[79]]);
                        by = lIIIlllIlIIll[1];
                        return;
                    }
                }
                String[] strArr5 = new String[lIIIlllIlIIll[1]];
                strArr5[lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[80]];
                if (lIlIIlIIIlllIIl(Bank.contains(strArr5) ? 1 : 0)) {
                    String[] strArr6 = new String[lIIIlllIlIIll[1]];
                    strArr6[lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[81]];
                    if (lIlIIlIIIlllIlI(Bank.getFirst(strArr6).getQuantity(), lIIIlllIlIIll[11])) {
                        W();
                        System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[82]]);
                        by = lIIIlllIlIIll[1];
                        return;
                    }
                }
                int[] iArr = new int[lIIIlllIlIIll[19]];
                iArr[lIIIlllIlIIll[0]] = lIIIlllIlIIll[20];
                iArr[lIIIlllIlIIll[1]] = lIIIlllIlIIll[21];
                iArr[lIIIlllIlIIll[3]] = lIIIlllIlIIll[22];
                iArr[lIIIlllIlIIll[4]] = lIIIlllIlIIll[23];
                iArr[lIIIlllIlIIll[6]] = lIIIlllIlIIll[24];
                iArr[lIIIlllIlIIll[9]] = lIIIlllIlIIll[7];
                iArr[lIIIlllIlIIll[12]] = lIIIlllIlIIll[17];
                iArr[lIIIlllIlIIll[14]] = lIIIlllIlIIll[25];
                iArr[lIIIlllIlIIll[16]] = lIIIlllIlIIll[10];
                iArr[lIIIlllIlIIll[18]] = lIIIlllIlIIll[15];
                iArr[lIIIlllIlIIll[8]] = lIIIlllIlIIll[13];
                if (lIlIIlIIIlllIll(C0004e.b(iArr) ? 1 : 0)) {
                    W();
                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[83]]);
                    by = lIIIlllIlIIll[1];
                    return;
                }
                while (lIlIIlIIIlllIll(C0012m.av() ? 1 : 0)) {
                    C0012m.at();
                    Time.sleepTicks(lIIIlllIlIIll[1]);
                    "".length();
                    "".length();
                    if (" ".length() < 0) {
                        return;
                    }
                }
                if (lIlIIlIIIlllIll(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepTicks(lIIIlllIlIIll[6]);
                    "".length();
                }
                int[] iArr2 = new int[lIIIlllIlIIll[1]];
                iArr2[lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                if (lIlIIlIIIlllIIl(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIIlllIlIIll[1]];
                    iArr3[lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                    if (lIlIIlIIIlllIlI(Inventory.getCount(iArr3), lIIIlllIlIIll[1])) {
                        Bank.withdraw(lIIIlllIlIIll[22], lIIIlllIlIIll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIlllIlIIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr4 = new int[lIIIlllIlIIll[1]];
                            iArr4[lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                            if (lIlIIlIIIllllIl(Inventory.getCount(iArr4))) {
                                ?? r0 = lIIIlllIlIIll[1];
                                "".length();
                                return ((((127 + 162) - 125) + 7) ^ (((157 + 155) - 291) + 154)) <= (((67 ^ 36) ^ (226 ^ 131)) & (((85 ^ 88) ^ (113 ^ 122)) ^ (-" ".length()))) ? ((31 ^ 5) ^ (100 ^ 109)) & (((((63 + 67) - 80) + 114) ^ (((43 + 106) - 1) + 35)) ^ (-" ".length())) : r0;
                            }
                            return lIIIlllIlIIll[0];
                        }, lIIIlllIlIIll[5]);
                        "".length();
                    }
                }
                int[] iArr4 = new int[lIIIlllIlIIll[1]];
                iArr4[lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                if (lIlIIlIIIlllIIl(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr5 = new int[lIIIlllIlIIll[1]];
                    iArr5[lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                    if (lIlIIlIIIlllIlI(Inventory.getCount(iArr5), lIIIlllIlIIll[1])) {
                        Bank.withdraw(lIIIlllIlIIll[23], lIIIlllIlIIll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIlllIlIIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr6 = new int[lIIIlllIlIIll[1]];
                            iArr6[lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                            if (lIlIIlIIIllllIl(Inventory.getCount(iArr6))) {
                                ?? r0 = lIIIlllIlIIll[1];
                                "".length();
                                return "  ".length() > "  ".length() ? ((((24 + 44) - 60) + 138) ^ (((129 + 9) - 133) + 166)) & (((20 ^ 56) ^ (65 ^ 84)) ^ (-" ".length())) : r0;
                            }
                            return lIIIlllIlIIll[0];
                        }, lIIIlllIlIIll[5]);
                        "".length();
                    }
                }
                int[] iArr6 = new int[lIIIlllIlIIll[1]];
                iArr6[lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                if (lIlIIlIIIlllIIl(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr7 = new int[lIIIlllIlIIll[1]];
                    iArr7[lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                    if (lIlIIlIIIlllIlI(Inventory.getCount(iArr7), lIIIlllIlIIll[1])) {
                        Bank.withdraw(lIIIlllIlIIll[21], lIIIlllIlIIll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIlllIlIIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr8 = new int[lIIIlllIlIIll[1]];
                            iArr8[lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                            if (lIlIIlIIIllllIl(Inventory.getCount(iArr8))) {
                                ?? r0 = lIIIlllIlIIll[1];
                                "".length();
                                return (-("   ".length() ^ (95 ^ 88))) > 0 ? ((((146 + 207) - 221) + 117) ^ (((160 + 31) - 118) + 113)) & (((57 ^ 124) ^ (39 ^ 33)) ^ (-" ".length())) : r0;
                            }
                            return lIIIlllIlIIll[0];
                        }, lIIIlllIlIIll[5]);
                        "".length();
                    }
                }
                int[] iArr8 = new int[lIIIlllIlIIll[1]];
                iArr8[lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                if (lIlIIlIIIlllIIl(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lIIIlllIlIIll[1]];
                    iArr9[lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                    if (lIlIIlIIIlllIlI(Inventory.getCount(iArr9), lIIIlllIlIIll[1])) {
                        Bank.withdraw(lIIIlllIlIIll[24], lIIIlllIlIIll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIlllIlIIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr10 = new int[lIIIlllIlIIll[1]];
                            iArr10[lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                            if (lIlIIlIIIllllIl(Inventory.getCount(iArr10))) {
                                ?? r0 = lIIIlllIlIIll[1];
                                "".length();
                                return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIIlllIlIIll[0];
                        }, lIIIlllIlIIll[5]);
                        "".length();
                    }
                }
                int[] iArr10 = new int[lIIIlllIlIIll[1]];
                iArr10[lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                if (lIlIIlIIIlllIIl(Bank.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[lIIIlllIlIIll[1]];
                    iArr11[lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                    if (lIlIIlIIIlllIlI(Inventory.getCount(iArr11), lIIIlllIlIIll[1])) {
                        Bank.withdraw(lIIIlllIlIIll[7], lIIIlllIlIIll[9], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIlllIlIIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr12 = new int[lIIIlllIlIIll[1]];
                            iArr12[lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                            if (lIlIIlIIIllllIl(Inventory.getCount(iArr12))) {
                                ?? r0 = lIIIlllIlIIll[1];
                                "".length();
                                return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIIlllIlIIll[0];
                        }, lIIIlllIlIIll[5]);
                        "".length();
                    }
                }
                int[] iArr12 = new int[lIIIlllIlIIll[1]];
                iArr12[lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                if (lIlIIlIIIlllIIl(Bank.contains(iArr12) ? 1 : 0)) {
                    int[] iArr13 = new int[lIIIlllIlIIll[1]];
                    iArr13[lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                    if (lIlIIlIIIlllIlI(Inventory.getCount(iArr13), lIIIlllIlIIll[1])) {
                        Bank.withdraw(lIIIlllIlIIll[17], lIIIlllIlIIll[6], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIlllIlIIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr14 = new int[lIIIlllIlIIll[1]];
                            iArr14[lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                            if (lIlIIlIIIllllIl(Inventory.getCount(iArr14))) {
                                ?? r0 = lIIIlllIlIIll[1];
                                "".length();
                                return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIIlllIlIIll[0];
                        }, lIIIlllIlIIll[5]);
                        "".length();
                    }
                }
                int[] iArr14 = new int[lIIIlllIlIIll[1]];
                iArr14[lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                if (lIlIIlIIIlllIIl(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIIIlllIlIIll[1]];
                    iArr15[lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                    if (lIlIIlIIIlllIlI(Inventory.getCount(iArr15), lIIIlllIlIIll[1])) {
                        Bank.withdraw(lIIIlllIlIIll[10], lIIIlllIlIIll[26], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIlllIlIIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[lIIIlllIlIIll[1]];
                            iArr16[lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                            if (lIlIIlIIIllllIl(Inventory.getCount(iArr16))) {
                                ?? r0 = lIIIlllIlIIll[1];
                                "".length();
                                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIIlllIlIIll[0];
                        }, lIIIlllIlIIll[5]);
                        "".length();
                    }
                }
                int[] iArr16 = new int[lIIIlllIlIIll[1]];
                iArr16[lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                if (lIlIIlIIIlllIIl(Bank.contains(iArr16) ? 1 : 0)) {
                    int[] iArr17 = new int[lIIIlllIlIIll[1]];
                    iArr17[lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                    if (lIlIIlIIIlllIlI(Inventory.getCount(iArr17), lIIIlllIlIIll[1])) {
                        Bank.withdraw(lIIIlllIlIIll[15], lIIIlllIlIIll[26], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIlllIlIIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr18 = new int[lIIIlllIlIIll[1]];
                            iArr18[lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                            if (lIlIIlIIIllllIl(Inventory.getCount(iArr18))) {
                                ?? r0 = lIIIlllIlIIll[1];
                                "".length();
                                return (-"  ".length()) > 0 ? (true ^ true) & (true ^ true) : r0;
                            }
                            return lIIIlllIlIIll[0];
                        }, lIIIlllIlIIll[5]);
                        "".length();
                    }
                }
                int[] iArr18 = new int[lIIIlllIlIIll[1]];
                iArr18[lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                if (lIlIIlIIIlllIIl(Bank.contains(iArr18) ? 1 : 0)) {
                    int[] iArr19 = new int[lIIIlllIlIIll[1]];
                    iArr19[lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                    if (lIlIIlIIIlllIlI(Inventory.getCount(iArr19), lIIIlllIlIIll[1])) {
                        Bank.withdraw(lIIIlllIlIIll[13], lIIIlllIlIIll[26], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIlllIlIIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr20 = new int[lIIIlllIlIIll[1]];
                            iArr20[lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                            if (lIlIIlIIIllllIl(Inventory.getCount(iArr20))) {
                                ?? r0 = lIIIlllIlIIll[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIIlllIlIIll[0];
                        }, lIIIlllIlIIll[5]);
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIIIlllIlIIll[1]];
                iArr20[lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                if (lIlIIlIIIlllIIl(Bank.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[lIIIlllIlIIll[1]];
                    iArr21[lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                    if (lIlIIlIIIlllIll(Inventory.contains(iArr21) ? 1 : 0)) {
                        Bank.withdraw(lIIIlllIlIIll[27], lIIIlllIlIIll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIlllIlIIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr22 = new int[lIIIlllIlIIll[1]];
                            iArr22[lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                            return Inventory.contains(iArr22);
                        }, lIIIlllIlIIll[5]);
                        "".length();
                    }
                }
                int[] iArr22 = new int[lIIIlllIlIIll[1]];
                iArr22[lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                if (lIlIIlIIIlllIIl(Bank.contains(iArr22) ? 1 : 0)) {
                    int[] iArr23 = new int[lIIIlllIlIIll[1]];
                    iArr23[lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                    if (lIlIIlIIIlllIlI(Inventory.getCount(iArr23), lIIIlllIlIIll[1])) {
                        Bank.withdrawAll(lIIIlllIlIIll[25], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIlllIlIIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr24 = new int[lIIIlllIlIIll[1]];
                            iArr24[lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                            if (lIlIIlIIIllllIl(Inventory.getCount(iArr24))) {
                                ?? r0 = lIIIlllIlIIll[1];
                                "".length();
                                return "   ".length() <= 0 ? ((((124 + 80) - 142) + 95) ^ (((131 + 170) - 281) + 160)) & (((16 ^ 97) ^ (12 ^ 84)) ^ (-" ".length())) : r0;
                            }
                            return lIIIlllIlIIll[0];
                        }, lIIIlllIlIIll[5]);
                        "".length();
                    }
                }
            }
        }
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIIlllIlIIIl[lIIIlllIlIIll[84]];
    }
}
