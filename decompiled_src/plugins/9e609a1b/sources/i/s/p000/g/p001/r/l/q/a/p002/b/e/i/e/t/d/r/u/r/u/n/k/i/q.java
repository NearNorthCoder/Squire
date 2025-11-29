package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.q  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/q.class */
public class q implements M {
    public static /* synthetic */ WorldPoint fi;
    static /* synthetic */ int co;
    private static /* synthetic */ int[] lIIIlllIlIIII;
    public static /* synthetic */ WorldPoint ff;
    public static /* synthetic */ WorldPoint fj;
    public static /* synthetic */ boolean by;
    private static /* synthetic */ String[] lIIIlllIIllll;
    public static /* synthetic */ List<C0003d> bA;
    public static /* synthetic */ WorldPoint fg;
    static /* synthetic */ String[] bW;
    public static /* synthetic */ WorldPoint fh;
    public static /* synthetic */ WorldArea fc;
    public static /* synthetic */ WorldPoint fe;
    static /* synthetic */ boolean cp;
    public static /* synthetic */ WorldPoint fd;
    /* synthetic */ WorldArea fk = new WorldArea(lIIIlllIlIIII[0], lIIIlllIlIIII[1], lIIIlllIlIIII[2], lIIIlllIlIIII[3], lIIIlllIlIIII[4]);
    /* synthetic */ WorldArea fl = new WorldArea(lIIIlllIlIIII[0], lIIIlllIlIIII[1], lIIIlllIlIIII[2], lIIIlllIlIIII[3], lIIIlllIlIIII[5]);
    /* synthetic */ WorldArea fm = new WorldArea(lIIIlllIlIIII[0], lIIIlllIlIIII[1], lIIIlllIlIIII[2], lIIIlllIlIIII[3], lIIIlllIlIIII[6]);

    private static boolean lIlIIlIIIIlllIl(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIIlIIIlIIIIl(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean lIlIIlIIIIllllI(int i2, int i3) {
        return i2 >= i3;
    }

    private static void lIlIIlIIIIllIII() {
        lIIIlllIlIIII = new int[119];
        lIIIlllIlIIII[0] = (-((-8261) & 27357)) & (-8193) & 28351;
        lIIIlllIlIIII[1] = (-((-13267) & 29695)) & (-4609) & 23551;
        lIIIlllIlIIII[2] = (-((-6701) & 24173)) & (-8327) & 28663;
        lIIIlllIlIIII[3] = (-65) & 1647;
        lIIIlllIlIIII[4] = (51 ^ 102) & ((246 ^ 163) ^ (-1));
        lIIIlllIlIIII[5] = " ".length();
        lIIIlllIlIIII[6] = "  ".length();
        lIIIlllIlIIII[7] = 0 ^ 31;
        lIIIlllIlIIII[8] = (((38 + 252) - 159) + 122) ^ (((47 + 28) - 13) + 91);
        lIIIlllIlIIII[9] = 211 ^ 195;
        lIIIlllIlIIII[10] = (-19479) & 24478;
        lIIIlllIlIIII[11] = "   ".length();
        lIIIlllIlIIII[12] = 91 ^ 95;
        lIIIlllIlIIII[13] = (7 ^ 22) ^ (65 ^ 88);
        lIIIlllIlIIII[14] = (-((-14085) & 30613)) & (-8201) & 32735;
        lIIIlllIlIIII[15] = (-((-8331) & 27819)) & (-519) & 32631;
        lIIIlllIlIIII[16] = (-((-17042) & 24223)) & (-16449) & 24575;
        lIIIlllIlIIII[17] = (-17595) & 19903;
        lIIIlllIlIIII[18] = (-((-9953) & 26339)) & (-129) & 18431;
        lIIIlllIlIIII[19] = (167 ^ 198) ^ (202 ^ 174);
        lIIIlllIlIIII[20] = (-((-14405) & 31941)) & (-12578) & 32255;
        lIIIlllIlIIII[21] = (((26 + 103) - (-5)) + 37) ^ (((127 + 77) - 76) + 45);
        lIIIlllIlIIII[22] = (-(((79 + 23) - (-29)) + 18)) & (-24579) & 32735;
        lIIIlllIlIIII[23] = 195 ^ 196;
        lIIIlllIlIIII[24] = (-((-105) & 14953)) & (-16397) & 32509;
        lIIIlllIlIIII[25] = (((81 + 22) - 17) + 63) ^ (((18 + 69) - 48) + 120);
        lIIIlllIlIIII[26] = (-25113) & 27546;
        lIIIlllIlIIII[27] = (-((-1085) & 32511)) & (-9) & 32767;
        lIIIlllIlIIII[28] = (-1029) & 1407;
        lIIIlllIlIIII[29] = (-16525) & 29151;
        lIIIlllIlIIII[30] = 75 ^ 121;
        lIIIlllIlIIII[31] = 69 ^ 82;
        lIIIlllIlIIII[32] = (93 ^ 71) ^ (150 ^ 133);
        lIIIlllIlIIII[33] = (-16467) & 28531;
        lIIIlllIlIIII[34] = (((112 + 126) - 132) + 60) ^ (((105 + 1) - 5) + 68);
        lIIIlllIlIIII[35] = (180 ^ 199) ^ (193 ^ 185);
        lIIIlllIlIIII[36] = (93 ^ 0) ^ (116 ^ 37);
        lIIIlllIlIIII[37] = 23 ^ 26;
        lIIIlllIlIIII[38] = (149 ^ 170) ^ (20 ^ 37);
        lIIIlllIlIIII[39] = (-17129) & 20205;
        lIIIlllIlIIII[40] = (-21123) & 24558;
        lIIIlllIlIIII[41] = (-((-19977) & 28586)) & (-16385) & 28071;
        lIIIlllIlIIII[42] = (-16913) & 20345;
        lIIIlllIlIIII[43] = (-((-9397) & 26365)) & (-273) & 20319;
        lIIIlllIlIIII[44] = (-((-10307) & 27359)) & (-8193) & 28671;
        lIIIlllIlIIII[45] = (-5073) & 8155;
        lIIIlllIlIIII[46] = (-8354) & 11775;
        lIIIlllIlIIII[47] = (-20595) & 23679;
        lIIIlllIlIIII[48] = (-((-6417) & 14614)) & (-4131) & 15743;
        lIIIlllIlIIII[49] = ((36 + 134) - 17) + 63;
        lIIIlllIlIIII[50] = 59 ^ 19;
        lIIIlllIlIIII[51] = (138 ^ 132) ^ (86 ^ 73);
        lIIIlllIlIIII[52] = 150 ^ 132;
        lIIIlllIlIIII[53] = 17 ^ 2;
        lIIIlllIlIIII[54] = (-4833) & 7906;
        lIIIlllIlIIII[55] = 53 ^ 33;
        lIIIlllIlIIII[56] = (-((-8457) & 29598)) & (-8193) & 32767;
        lIIIlllIlIIII[57] = 86 ^ 67;
        lIIIlllIlIIII[58] = 76 ^ 90;
        lIIIlllIlIIII[59] = 33 ^ 57;
        lIIIlllIlIIII[60] = (51 ^ 106) ^ (20 ^ 84);
        lIIIlllIlIIII[61] = 105 ^ 115;
        lIIIlllIlIIII[62] = 88 ^ 67;
        lIIIlllIlIIII[63] = 75 ^ 87;
        lIIIlllIlIIII[64] = (((1 + 76) - 36) + 122) ^ (((50 + 153) - 28) + 15);
        lIIIlllIlIIII[65] = (-20631) & 32694;
        lIIIlllIlIIII[66] = 62 ^ 32;
        lIIIlllIlIIII[67] = 65 ^ 97;
        lIIIlllIlIIII[68] = 87 ^ 118;
        lIIIlllIlIIII[69] = (181 ^ 154) ^ (122 ^ 119);
        lIIIlllIlIIII[70] = 78 ^ 109;
        lIIIlllIlIIII[71] = 5 ^ 33;
        lIIIlllIlIIII[72] = (59 ^ 109) ^ (233 ^ 154);
        lIIIlllIlIIII[73] = 106 ^ 76;
        lIIIlllIlIIII[74] = (113 ^ 70) ^ (12 ^ 28);
        lIIIlllIlIIII[75] = 132 ^ 173;
        lIIIlllIlIIII[76] = 20 ^ 62;
        lIIIlllIlIIII[77] = 133 ^ 174;
        lIIIlllIlIIII[78] = (95 ^ 2) ^ (115 ^ 2);
        lIIIlllIlIIII[79] = 82 ^ 127;
        lIIIlllIlIIII[80] = 113 ^ 95;
        lIIIlllIlIIII[81] = 176 ^ 159;
        lIIIlllIlIIII[82] = (56 ^ 79) ^ (77 ^ 10);
        lIIIlllIlIIII[83] = 162 ^ 147;
        lIIIlllIlIIII[84] = 105 ^ 90;
        lIIIlllIlIIII[85] = 6 ^ 126;
        lIIIlllIlIIII[86] = 91 ^ 111;
        lIIIlllIlIIII[87] = (((122 + 98) - 126) + 73) ^ (((106 + 72) - 155) + 123);
        lIIIlllIlIIII[88] = (-((-17436) & 29855)) & (-5) & 15343;
        lIIIlllIlIIII[89] = (-16405) & 26324;
        lIIIlllIlIIII[90] = (-((-18074) & 32415)) & (-1) & 16061;
        lIIIlllIlIIII[91] = (-4355) & 16334;
        lIIIlllIlIIII[92] = (-((-13463) & 15582)) & (-1537) & 28655;
        lIIIlllIlIIII[93] = (-29316) & 30715;
        lIIIlllIlIIII[94] = (((97 + 134) - 170) + 92) ^ (((64 + 91) - 20) + 40);
        lIIIlllIlIIII[95] = (83 ^ 77) ^ (132 ^ 173);
        lIIIlllIlIIII[96] = 106 ^ 82;
        lIIIlllIlIIII[97] = (145 ^ 137) ^ (186 ^ 155);
        lIIIlllIlIIII[98] = (-((-2241) & 23525)) & (-131) & 24575;
        lIIIlllIlIIII[99] = (-((-2061) & 31325)) & (-5) & 32630;
        lIIIlllIlIIII[100] = ((109 + 52) - 66) + 33;
        lIIIlllIlIIII[101] = 75 ^ 44;
        lIIIlllIlIIII[102] = (-28673) & 31675;
        lIIIlllIlIIII[103] = (-21041) & 24126;
        lIIIlllIlIIII[104] = (-12801) & 16215;
        lIIIlllIlIIII[105] = (-9026) & 12101;
        lIIIlllIlIIII[106] = (-((-3210) & 7835)) & (-8193) & 16255;
        lIIIlllIlIIII[107] = (-((-10757) & 31621)) & (-516) & 24467;
        lIIIlllIlIIII[108] = (-8814) & 12285;
        lIIIlllIlIIII[109] = (-8961) & 12190;
        lIIIlllIlIIII[110] = (-((-289) & 25377)) & (-185) & 28671;
        lIIIlllIlIIII[111] = (-9235) & 12191;
        lIIIlllIlIIII[112] = (-29249) & 32617;
        lIIIlllIlIIII[113] = (-((-27075) & 31183)) & (-8193) & 15295;
        lIIIlllIlIIII[114] = (-((-3182) & 15487)) & (-521) & 16319;
        lIIIlllIlIIII[115] = 146 ^ 168;
        lIIIlllIlIIII[116] = (((86 + 173) - 223) + 219) ^ (((159 + 106) - 117) + 48);
        lIIIlllIlIIII[117] = 14 ^ 50;
        lIIIlllIlIIII[118] = 159 ^ 162;
    }

    private static boolean lIlIIlIIIIlllII(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean S() {
        int[] iArr = new int[lIIIlllIlIIII[13]];
        iArr[lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
        iArr[lIIIlllIlIIII[5]] = lIIIlllIlIIII[15];
        iArr[lIIIlllIlIIII[6]] = lIIIlllIlIIII[16];
        iArr[lIIIlllIlIIII[11]] = lIIIlllIlIIII[17];
        iArr[lIIIlllIlIIII[12]] = lIIIlllIlIIII[18];
        iArr[lIIIlllIlIIII[19]] = lIIIlllIlIIII[20];
        iArr[lIIIlllIlIIII[21]] = lIIIlllIlIIII[22];
        iArr[lIIIlllIlIIII[23]] = lIIIlllIlIIII[24];
        int lllllllllllllllIIIIIlIlllllIlIlI = lIIIlllIlIIII[4];
        while (lIlIIlIIIIllIll(lllllllllllllllIIIIIlIlllllIlIlI, iArr.length)) {
            int[] iArr2 = new int[lIIIlllIlIIII[5]];
            iArr2[lIIIlllIlIIII[4]] = iArr[lllllllllllllllIIIIIlIlllllIlIlI];
            if (lIlIIlIIIIlllII(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIIlllIlIIII[4];
            }
            lllllllllllllllIIIIIlIlllllIlIlI++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIIIlllIlIIII[5];
    }

    private static String lIlIIlIIIIlIllI(String lllllllllllllllIIIIIlIlllIlllIll, String lllllllllllllllIIIIIlIlllIlllIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIlIlllIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIIlIlllIlllIlI.toCharArray();
        int lllllllllllllllIIIIIlIlllIllIlll = lIIIlllIlIIII[4];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = lIIIlllIlIIII[4];
        while (lIlIIlIIIIllIll(i2, length)) {
            char lllllllllllllllIIIIIlIlllIllllII = charArray2[i2];
            sb.append((char) (lllllllllllllllIIIIIlIlllIllllII ^ charArray[lllllllllllllllIIIIIlIlllIllIlll % charArray.length]));
            "".length();
            lllllllllllllllIIIIIlIlllIllIlll++;
            i2++;
            "".length();
            if (((206 ^ 147) & ((202 ^ 151) ^ (-1))) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIlIIlIIIIllIII();
        lIlIIlIIIIlIlll();
        fc = new WorldArea(lIIIlllIlIIII[98], lIIIlllIlIIII[99], lIIIlllIlIIII[100], lIIIlllIlIIII[101], lIIIlllIlIIII[4]);
        bA = new ArrayList();
        fd = new WorldPoint(lIIIlllIlIIII[102], lIIIlllIlIIII[56], lIIIlllIlIIII[4]);
        fe = new WorldPoint(lIIIlllIlIIII[103], lIIIlllIlIIII[104], lIIIlllIlIIII[4]);
        ff = new WorldPoint(lIIIlllIlIIII[105], lIIIlllIlIIII[106], lIIIlllIlIIII[4]);
        fg = new WorldPoint(lIIIlllIlIIII[107], lIIIlllIlIIII[108], lIIIlllIlIIII[4]);
        fh = new WorldPoint(lIIIlllIlIIII[109], lIIIlllIlIIII[110], lIIIlllIlIIII[4]);
        fi = new WorldPoint(lIIIlllIlIIII[111], lIIIlllIlIIII[112], lIIIlllIlIIII[4]);
        fj = new WorldPoint(lIIIlllIlIIII[113], lIIIlllIlIIII[114], lIIIlllIlIIII[4]);
        String[] strArr = new String[lIIIlllIlIIII[11]];
        strArr[lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[115]];
        strArr[lIIIlllIlIIII[5]] = lIIIlllIIllll[lIIIlllIlIIII[116]];
        strArr[lIIIlllIlIIII[6]] = lIIIlllIIllll[lIIIlllIlIIII[117]];
        bW = strArr;
    }

    private static String lIlIIlIIIIlIlII(String lllllllllllllllIIIIIlIllllIllIII, String lllllllllllllllIIIIIlIllllIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIllllIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlllIlIIII[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIllllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlIllllIllIIl) {
            lllllllllllllllIIIIIlIllllIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIlIIIll(int i2, int i3) {
        return i2 != i3;
    }

    private static void lIlIIlIIIIlIlll() {
        lIIIlllIIllll = new String[lIIIlllIlIIII[118]];
        lIIIlllIIllll[lIIIlllIlIIII[4]] = lIlIIlIIIIlIlII("2yB82wMTr52T2k3lWXbOWd5lSYx3rxhDt8qVWEhEpgxTlYlBDdV0vEYlRcHI2x4E", "nAJym");
        lIIIlllIIllll[lIIIlllIlIIII[5]] = lIlIIlIIIIlIlIl("jMVbViPiF1997qBdMTdRTw==", "HKlQW");
        lIIIlllIIllll[lIIIlllIlIIII[6]] = lIlIIlIIIIlIlIl("FAmxMGnpWkg2B5NkIP3qoQ==", "iVKET");
        lIIIlllIIllll[lIIIlllIlIIII[11]] = lIlIIlIIIIlIllI("ORU6KwsYGjNvBRAaPyYJFg==", "qtTOg");
        lIIIlllIIllll[lIIIlllIlIIII[12]] = lIlIIlIIIIlIlIl("83qllTn2o5gF0H6vpp3c+uPrK29VDJCncwxVPy7gZmv0kZR3Lfq22IqLoeuFlIsGpFgezSjvQdA=", "CLfLX");
        lIIIlllIIllll[lIIIlllIlIIII[19]] = lIlIIlIIIIlIlII("g5PmN4j4sPg=", "rKYFP");
        lIIIlllIIllll[lIIIlllIlIIII[21]] = lIlIIlIIIIlIlII("Icer5mZ4bBA=", "LLtkj");
        lIIIlllIIllll[lIIIlllIlIIII[23]] = lIlIIlIIIIlIlII("AWvKGGPVru+yG5DoXtvrxg==", "jHxfg");
        lIIIlllIIllll[lIIIlllIlIIII[13]] = lIlIIlIIIIlIlIl("GEHXf3iTGWVWeXsgc7ibhA==", "ZSyYL");
        lIIIlllIIllll[lIIIlllIlIIII[32]] = lIlIIlIIIIlIllI("JBAvGyEE", "syCwN");
        lIIIlllIIllll[lIIIlllIlIIII[25]] = lIlIIlIIIIlIllI("DRUhJCogFiNjJi4VPQ==", "AzOCB");
        lIIIlllIIllll[lIIIlllIlIIII[35]] = lIlIIlIIIIlIlIl("k0TaP58koGQ=", "eqraD");
        lIIIlllIIllll[lIIIlllIlIIII[36]] = lIlIIlIIIIlIlII("iYCKUxcTjMySwr4dJTJZKQ==", "ZNkJK");
        lIIIlllIIllll[lIIIlllIlIIII[37]] = lIlIIlIIIIlIlIl("dCqVG/I0+vI=", "staKB");
        lIIIlllIIllll[lIIIlllIlIIII[38]] = lIlIIlIIIIlIlII("BBL2REtZt3O0zGPtbyUplA==", "rQInG");
        lIIIlllIIllll[lIIIlllIlIIII[34]] = lIlIIlIIIIlIlIl("aBW3h+pVxSw=", "puKWH");
        lIIIlllIIllll[lIIIlllIlIIII[9]] = lIlIIlIIIIlIlII("8JWYdGHzVFiY+R3xM8358w==", "JffCf");
        lIIIlllIIllll[lIIIlllIlIIII[51]] = lIlIIlIIIIlIllI("AQYZATkjDg==", "QckgV");
        lIIIlllIIllll[lIIIlllIlIIII[52]] = lIlIIlIIIIlIlIl("Y6Pp+PQtRj0=", "PEodP");
        lIIIlllIIllll[lIIIlllIlIIII[53]] = lIlIIlIIIIlIlIl("MdPN5EYUK3A=", "uAzGy");
        lIIIlllIIllll[lIIIlllIlIIII[55]] = lIlIIlIIIIlIlII("hggfFb0mcSkWfOMrYNurYw==", "EiKAD");
        lIIIlllIIllll[lIIIlllIlIIII[57]] = lIlIIlIIIIlIllI("CQY4FR8kBTpSEyoGJA==", "EiVrw");
        lIIIlllIIllll[lIIIlllIlIIII[58]] = lIlIIlIIIIlIllI("KjY8CQ==", "eFYgP");
        lIIIlllIIllll[lIIIlllIlIIII[31]] = lIlIIlIIIIlIlIl("tNH9qsX+GMg/PtO+QTVGXQ==", "xkydr");
        lIIIlllIIllll[lIIIlllIlIIII[59]] = lIlIIlIIIIlIllI("CRwWOA==", "FlsVj");
        lIIIlllIIllll[lIIIlllIlIIII[60]] = lIlIIlIIIIlIlIl("J4RaPrVwZrR+menFJd8fZw==", "JuqJJ");
        lIIIlllIIllll[lIIIlllIlIIII[61]] = lIlIIlIIIIlIlII("ICZ8eaasCmU=", "uJvqS");
        lIIIlllIIllll[lIIIlllIlIIII[62]] = lIlIIlIIIIlIlII("clh9Pj6S+3k=", "wHZjc");
        lIIIlllIIllll[lIIIlllIlIIII[63]] = lIlIIlIIIIlIllI("PRIGCA==", "IsjcF");
        lIIIlllIIllll[lIIIlllIlIIII[64]] = lIlIIlIIIIlIllI("BzUfKQQ=", "FAsHw");
        lIIIlllIIllll[lIIIlllIlIIII[66]] = lIlIIlIIIIlIlIl("Bj5UJsLILJCOJesvn0Q5CA==", "EJlYm");
        lIIIlllIIllll[lIIIlllIlIIII[7]] = lIlIIlIIIIlIllI("By8dHQ==", "SNqvB");
        lIIIlllIIllll[lIIIlllIlIIII[67]] = lIlIIlIIIIlIllI("CSk1IRc9", "DHGMr");
        lIIIlllIIllll[lIIIlllIlIIII[68]] = lIlIIlIIIIlIlII("dO0rbmwElaSQtlPcZQRrFQ==", "sZEID");
        lIIIlllIIllll[lIIIlllIlIIII[69]] = lIlIIlIIIIlIllI("FxEDHQ==", "cpovd");
        lIIIlllIIllll[lIIIlllIlIIII[70]] = lIlIIlIIIIlIlII("vReEiZphSJg=", "sAUzS");
        lIIIlllIIllll[lIIIlllIlIIII[71]] = lIlIIlIIIIlIlII("6QtgMweV8p4do+wkGHd8pQ==", "MudgA");
        lIIIlllIIllll[lIIIlllIlIIII[72]] = lIlIIlIIIIlIlIl("BNkNJ2eX/NA=", "yzcyN");
        lIIIlllIIllll[lIIIlllIlIIII[73]] = lIlIIlIIIIlIlIl("caRvpNZn/bA=", "ashAJ");
        lIIIlllIIllll[lIIIlllIlIIII[74]] = lIlIIlIIIIlIlII("gvCbnAuRMzGKs7vPlFCtTg==", "inXwE");
        lIIIlllIIllll[lIIIlllIlIIII[50]] = lIlIIlIIIIlIlII("JcyGh4Tx5J5njWWfmaPH1g==", "CVOdl");
        lIIIlllIIllll[lIIIlllIlIIII[75]] = lIlIIlIIIIlIlIl("DfhGfnlSISU=", "tQClp");
        lIIIlllIIllll[lIIIlllIlIIII[76]] = lIlIIlIIIIlIlIl("xzD6tPPctOA=", "TckIb");
        lIIIlllIIllll[lIIIlllIlIIII[77]] = lIlIIlIIIIlIlIl("Bse3q3HSsfqWV9W1QGAHYA==", "SHqWj");
        lIIIlllIIllll[lIIIlllIlIIII[78]] = lIlIIlIIIIlIllI("CzEKAR8mIg==", "IDxok");
        lIIIlllIIllll[lIIIlllIlIIII[79]] = lIlIIlIIIIlIlIl("/8udYHIqk9EGQdGA+Q8VcQ==", "PxWrr");
        lIIIlllIIllll[lIIIlllIlIIII[80]] = lIlIIlIIIIlIlII("ymdV18HEZl0rxoxnUrZnjg==", "IGFhq");
        lIIIlllIIllll[lIIIlllIlIIII[81]] = lIlIIlIIIIlIlII("3JuEKDjquck=", "zTMcm");
        lIIIlllIIllll[lIIIlllIlIIII[82]] = lIlIIlIIIIlIlII("NO8LnVOl/W0=", "VsWay");
        lIIIlllIIllll[lIIIlllIlIIII[83]] = lIlIIlIIIIlIlIl("k9bJu/Tj1ZROoOqFkZ38IQ==", "CLUql");
        lIIIlllIIllll[lIIIlllIlIIII[30]] = lIlIIlIIIIlIllI("IgALHA==", "oieyI");
        lIIIlllIIllll[lIIIlllIlIIII[84]] = lIlIIlIIIIlIllI("DxIS", "Jsfhw");
        lIIIlllIIllll[lIIIlllIlIIII[86]] = lIlIIlIIIIlIllI("EykZD3YzI1UcNzU+Ggk9", "GLujV");
        lIIIlllIIllll[lIIIlllIlIIII[87]] = lIlIIlIIIIlIlIl("LdIVd3KijxE=", "BdElp");
        lIIIlllIIllll[lIIIlllIlIIII[94]] = lIlIIlIIIIlIlII("Q/t+srzTSa1Uj6oTuBup6LP+AJfKcO4x", "GpQEM");
        lIIIlllIIllll[lIIIlllIlIIII[95]] = lIlIIlIIIIlIllI("Ny4jEFYqIW0AEyQrOR9WbQ==", "EGMwv");
        lIIIlllIIllll[lIIIlllIlIIII[96]] = lIlIIlIIIIlIlIl("BxyesAcsZGs=", "dnjAW");
        lIIIlllIIllll[lIIIlllIlIIII[97]] = lIlIIlIIIIlIlII("pBx3NslI2X0=", "JYlQd");
        lIIIlllIIllll[lIIIlllIlIIII[115]] = lIlIIlIIIIlIlIl("cZ+ZbZiGgl0=", "Ruxls");
        lIIIlllIIllll[lIIIlllIlIIII[116]] = lIlIIlIIIIlIllI("L2gwOzRGPyg0IwM6LjQgRiEhej4JPWA+ZwQtZzslCi1nLihGJSYxIkYlInomRhszPyYNaDQ7KQI/LjkvWQ==", "fHGZG");
        lIIIlllIIllll[lIIIlllIlIIII[117]] = lIlIIlIIIIlIllI("JS41L3Y=", "wAVDX");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (!lIlIIlIIIIllllI(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[85]) || (lIlIIlIIIIlllII(fc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIIIlllII(this.fk.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIIIlllII(this.fl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIlIIlIIIIllIlI(this.fm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0))) {
            return lIIIlllIlIIII[4];
        }
        ?? r0 = lIIIlllIlIIII[5];
        "".length();
        return (95 ^ 90) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static void W() {
        int[] iArr = new int[lIIIlllIlIIII[5]];
        iArr[lIIIlllIlIIII[4]] = lIIIlllIlIIII[18];
        if (lIlIIlIIIIlllII(Bank.contains(iArr) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIlIIII[18], lIIIlllIlIIII[5], lIIIlllIlIIII[88]));
            "".length();
        }
        int[] iArr2 = new int[lIIIlllIlIIII[5]];
        iArr2[lIIIlllIlIIII[4]] = lIIIlllIlIIII[24];
        if (lIlIIlIIIIlllII(Bank.contains(iArr2) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIlIIII[24], lIIIlllIlIIII[5], lIIIlllIlIIII[88]));
            "".length();
        }
        int[] iArr3 = new int[lIIIlllIlIIII[5]];
        iArr3[lIIIlllIlIIII[4]] = lIIIlllIlIIII[16];
        if (lIlIIlIIIIlllII(Bank.contains(iArr3) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIlIIII[16], lIIIlllIlIIII[5], lIIIlllIlIIII[88]));
            "".length();
        }
        int[] iArr4 = new int[lIIIlllIlIIII[5]];
        iArr4[lIIIlllIlIIII[4]] = lIIIlllIlIIII[20];
        if (lIlIIlIIIIlllII(Bank.contains(iArr4) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIlIIII[20], lIIIlllIlIIII[5], lIIIlllIlIIII[89]));
            "".length();
        }
        int[] iArr5 = new int[lIIIlllIlIIII[5]];
        iArr5[lIIIlllIlIIII[4]] = lIIIlllIlIIII[17];
        if (lIlIIlIIIIlllII(Bank.contains(iArr5) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIlIIII[17], lIIIlllIlIIII[5], lIIIlllIlIIII[89]));
            "".length();
        }
        int[] iArr6 = new int[lIIIlllIlIIII[5]];
        iArr6[lIIIlllIlIIII[4]] = lIIIlllIlIIII[22];
        if (lIlIIlIIIIlllII(Bank.contains(iArr6) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIlIIII[22], lIIIlllIlIIII[25], lIIIlllIlIIII[90]));
            "".length();
        }
        if (lIlIIlIIIIlllII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIlllIIllll[lIIIlllIlIIII[95]]);
        }) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIlIIII[91], lIIIlllIlIIII[19], lIIIlllIlIIII[92]));
            "".length();
        }
        int[] iArr7 = new int[lIIIlllIlIIII[5]];
        iArr7[lIIIlllIlIIII[4]] = lIIIlllIlIIII[15];
        if (lIlIIlIIIIlllII(Bank.contains(iArr7) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIlIIII[15], lIIIlllIlIIII[12], C0007h.bv));
            "".length();
        }
        int[] iArr8 = new int[lIIIlllIlIIII[5]];
        iArr8[lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
        if (lIlIIlIIIIllIlI(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[lIIIlllIlIIII[5]];
            iArr9[lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
            if (!lIlIIlIIIIllIlI(Bank.contains(iArr9) ? 1 : 0)) {
                return;
            }
            int[] iArr10 = new int[lIIIlllIlIIII[5]];
            iArr10[lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
            if (!lIlIIlIIIIllIll(Bank.getFirst(iArr10).getQuantity(), lIIIlllIlIIII[34])) {
                return;
            }
        }
        bA.add(new C0003d(lIIIlllIlIIII[14], lIIIlllIlIIII[50], lIIIlllIlIIII[93]));
        "".length();
    }

    private static String lIlIIlIIIIlIlIl(String lllllllllllllllIIIIIlIllllIIlIll, String lllllllllllllllIIIIIlIllllIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlIllllIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIllllIIlIlI.getBytes(StandardCharsets.UTF_8)), lIIIlllIlIIII[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlllIlIIII[6], lllllllllllllllIIIIIlIllllIIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIllllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlIllllIIllII) {
            lllllllllllllllIIIIIlIllllIIllII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v539, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v559, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v566, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    public static void ba() {
        if (lIlIIlIIIIllIlI(by ? 1 : 0)) {
            C0001b.a(bA);
            if (lIlIIlIIIIllIll(bA.size(), lIIIlllIlIIII[5])) {
                System.out.println(lIIIlllIIllll[lIIIlllIlIIII[4]]);
                by = lIIIlllIlIIII[4];
            }
        }
        if (lIlIIlIIIIlllII(by ? 1 : 0)) {
            if (lIlIIlIIIIllIll(C0004e.j(lIIIlllIlIIII[7]), lIIIlllIlIIII[8])) {
                v.bl();
            }
            if (lIlIIlIIIIlllIl(C0004e.j(lIIIlllIlIIII[7]), lIIIlllIlIIII[8]) && lIlIIlIIIIllIll(C0004e.I(), lIIIlllIlIIII[9])) {
                System.out.println(lIIIlllIIllll[lIIIlllIlIIII[5]]);
                AccBuilderRat.d = lIIIlllIlIIII[5];
                return;
            }
            if (lIlIIlIIIIlllII(S() ? 1 : 0) && lIlIIlIIIIlllII(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId())) && lIlIIlIIIIlllIl(C0004e.j(lIIIlllIlIIII[7]), lIIIlllIlIIII[8]) && lIlIIlIIIIllllI(C0004e.I(), lIIIlllIlIIII[9])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIlIIIIlllll(nearest) && lIlIIlIIIIlllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[6]];
                    C0000a.a(nearest);
                }
                if (lIlIIlIIIIlllll(nearest) && lIlIIlIIIIllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIlIIIIlllII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIlllIlIIII[10]);
                        "".length();
                    }
                    if (lIlIIlIIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[11]];
                        if (lIlIIlIIIlIIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIlllIlIIII[12]);
                            "".length();
                        }
                        if (lIlIIlIIIlIIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIlllIlIIII[6]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIlllIlIIII[13]];
                        iArr[lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
                        iArr[lIIIlllIlIIII[5]] = lIIIlllIlIIII[15];
                        iArr[lIIIlllIlIIII[6]] = lIIIlllIlIIII[16];
                        iArr[lIIIlllIlIIII[11]] = lIIIlllIlIIII[17];
                        iArr[lIIIlllIlIIII[12]] = lIIIlllIlIIII[18];
                        iArr[lIIIlllIlIIII[19]] = lIIIlllIlIIII[20];
                        iArr[lIIIlllIlIIII[21]] = lIIIlllIlIIII[22];
                        iArr[lIIIlllIlIIII[23]] = lIIIlllIlIIII[24];
                        if (lIlIIlIIIIlllII(C0004e.b(iArr) ? 1 : 0)) {
                            W();
                            System.out.println(lIIIlllIIllll[lIIIlllIlIIII[12]]);
                            by = lIIIlllIlIIII[5];
                            return;
                        }
                        int[] iArr2 = new int[lIIIlllIlIIII[13]];
                        iArr2[lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
                        iArr2[lIIIlllIlIIII[5]] = lIIIlllIlIIII[15];
                        iArr2[lIIIlllIlIIII[6]] = lIIIlllIlIIII[16];
                        iArr2[lIIIlllIlIIII[11]] = lIIIlllIlIIII[17];
                        iArr2[lIIIlllIlIIII[12]] = lIIIlllIlIIII[18];
                        iArr2[lIIIlllIlIIII[19]] = lIIIlllIlIIII[20];
                        iArr2[lIIIlllIlIIII[21]] = lIIIlllIlIIII[22];
                        iArr2[lIIIlllIlIIII[23]] = lIIIlllIlIIII[24];
                        if (lIlIIlIIIIllIlI(C0004e.b(iArr2) ? 1 : 0)) {
                            C0000a.a(lIIIlllIlIIII[14], lIIIlllIlIIII[25]);
                            C0000a.a(lIIIlllIlIIII[22], lIIIlllIlIIII[25]);
                            C0000a.a(lIIIlllIlIIII[15], lIIIlllIlIIII[6]);
                            C0000a.a(lIIIlllIlIIII[16], lIIIlllIlIIII[5]);
                            C0000a.a(lIIIlllIlIIII[17], lIIIlllIlIIII[5]);
                            C0000a.a(lIIIlllIlIIII[18], lIIIlllIlIIII[5]);
                            C0000a.a(lIIIlllIlIIII[24], lIIIlllIlIIII[5]);
                            C0000a.a(lIIIlllIlIIII[20], lIIIlllIlIIII[5]);
                            C0000a.a(lIIIlllIlIIII[26], lIIIlllIlIIII[6]);
                            C0000a.a(lIIIlllIlIIII[27], lIIIlllIlIIII[5]);
                            C0000a.a(lIIIlllIlIIII[28], lIIIlllIlIIII[19]);
                            int[] iArr3 = new int[lIIIlllIlIIII[5]];
                            iArr3[lIIIlllIlIIII[4]] = lIIIlllIlIIII[15];
                            if (lIlIIlIIIIlllIl(Inventory.getAll(iArr3).size(), lIIIlllIlIIII[5])) {
                                C0000a.a(lIIIlllIlIIII[29], lIIIlllIlIIII[6]);
                            }
                        }
                    }
                }
            }
            if (lIlIIlIIIIllIlI(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIIlIIIIllIll(Movement.getRunEnergy(), lIIIlllIlIIII[30])) {
                Inventory.getFirst(C0005f.ba).interact(lIIIlllIIllll[lIIIlllIlIIII[19]]);
                Time.sleepTicks(lIIIlllIlIIII[5]);
                "".length();
            }
            if (lIlIIlIIIIllIll(Prayers.getPoints(), lIIIlllIlIIII[31]) && lIlIIlIIIIllIlI(Inventory.contains(C0005f.aX) ? 1 : 0)) {
                Inventory.getFirst(C0005f.aX).interact(lIIIlllIIllll[lIIIlllIlIIII[21]]);
                Time.sleepTicks(lIIIlllIlIIII[6]);
                "".length();
            }
            if (lIlIIlIIIIllIlI(S() ? 1 : 0) && lIlIIlIIIIlllII(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()))) {
                if (lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fd), lIIIlllIlIIII[19])) {
                    AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[23]];
                    if (lIlIIlIIIIllIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(fd);
                    "".length();
                    Time.sleepTicks(lIIIlllIlIIII[5]);
                    "".length();
                }
                if (lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fd), lIIIlllIlIIII[19])) {
                    AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[13]];
                    C0006g.a(lIIIlllIIllll[lIIIlllIlIIII[32]], bW);
                }
            }
            if (!lIlIIlIIIlIIIll(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[19]) || lIlIIlIIIIlllIl(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[23])) {
                C0006g.a(bW);
            }
            if (lIlIIlIIIIlllIl(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[25])) {
                if (!lIlIIlIIIIllllI(Vars.getBit(lIIIlllIlIIII[33]), lIIIlllIlIIII[19]) || lIlIIlIIIIlllIl(Vars.getBit(lIIIlllIlIIII[33]), lIIIlllIlIIII[34])) {
                    if (lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fe), lIIIlllIlIIII[5])) {
                        if (lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(ff), lIIIlllIlIIII[21])) {
                            String[] strArr = new String[lIIIlllIlIIII[5]];
                            strArr[lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[25]];
                            TileObject nearest2 = TileObjects.getNearest(strArr);
                            String[] strArr2 = new String[lIIIlllIlIIII[5]];
                            strArr2[lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[35]];
                            if (lIlIIlIIIIllIlI(nearest2.hasAction(strArr2) ? 1 : 0)) {
                                String[] strArr3 = new String[lIIIlllIlIIII[5]];
                                strArr3[lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[36]];
                                TileObjects.getNearest(strArr3).interact(lIIIlllIIllll[lIIIlllIlIIII[37]]);
                                Time.sleepTicks(lIIIlllIlIIII[6]);
                                "".length();
                            }
                            String[] strArr4 = new String[lIIIlllIlIIII[5]];
                            strArr4[lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[38]];
                            TileObject nearest3 = TileObjects.getNearest(strArr4);
                            String[] strArr5 = new String[lIIIlllIlIIII[5]];
                            strArr5[lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[34]];
                            if (lIlIIlIIIIlllII(nearest3.hasAction(strArr5) ? 1 : 0)) {
                                WorldPoint[] worldPointArr = new WorldPoint[lIIIlllIlIIII[19]];
                                worldPointArr[lIIIlllIlIIII[4]] = new WorldPoint(lIIIlllIlIIII[39], lIIIlllIlIIII[40], lIIIlllIlIIII[4]);
                                worldPointArr[lIIIlllIlIIII[5]] = new WorldPoint(lIIIlllIlIIII[41], lIIIlllIlIIII[42], lIIIlllIlIIII[4]);
                                worldPointArr[lIIIlllIlIIII[6]] = new WorldPoint(lIIIlllIlIIII[43], lIIIlllIlIIII[44], lIIIlllIlIIII[4]);
                                worldPointArr[lIIIlllIlIIII[11]] = new WorldPoint(lIIIlllIlIIII[45], lIIIlllIlIIII[46], lIIIlllIlIIII[4]);
                                worldPointArr[lIIIlllIlIIII[12]] = new WorldPoint(lIIIlllIlIIII[47], lIIIlllIlIIII[48], lIIIlllIlIIII[4]);
                                Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                                "".length();
                                Time.sleepTicks(lIIIlllIlIIII[5]);
                                "".length();
                            }
                        }
                        if (lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ff), lIIIlllIlIIII[21])) {
                            AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[9]];
                            Movement.walkTo(fe);
                            "".length();
                            Time.sleepTicks(lIIIlllIlIIII[5]);
                            "".length();
                        }
                    }
                    if (lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fe), lIIIlllIlIIII[5])) {
                        if (lIlIIlIIIIlllIl(Vars.getBit(lIIIlllIlIIII[33]), lIIIlllIlIIII[34]) && lIlIIlIIIIlllll(Widgets.get(lIIIlllIlIIII[49], lIIIlllIlIIII[6])) && lIlIIlIIIIlllII(Players.getLocal().isAnimating() ? 1 : 0)) {
                            Widgets.get(lIIIlllIlIIII[49], lIIIlllIlIIII[6]).getChild(lIIIlllIlIIII[50]).interact(lIIIlllIIllll[lIIIlllIlIIII[51]]);
                            Time.sleepTicks(lIIIlllIlIIII[6]);
                            "".length();
                        }
                        if (lIlIIlIIIIllIll(Vars.getBit(lIIIlllIlIIII[33]), lIIIlllIlIIII[19])) {
                            AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[52]];
                            C0006g.a(lIIIlllIIllll[lIIIlllIlIIII[53]], bW);
                        }
                    }
                }
                if (lIlIIlIIIIlllIl(Vars.getBit(lIIIlllIlIIII[33]), lIIIlllIlIIII[19])) {
                    WorldArea worldArea = new WorldArea(lIIIlllIlIIII[54], lIIIlllIlIIII[40], lIIIlllIlIIII[32], lIIIlllIlIIII[25], lIIIlllIlIIII[4]);
                    if (lIlIIlIIIIlllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[55]];
                        if (lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ff), lIIIlllIlIIII[21])) {
                            Movement.walkTo(new WorldPoint(lIIIlllIlIIII[41], lIIIlllIlIIII[56], lIIIlllIlIIII[4]));
                            "".length();
                            Time.sleepTicks(lIIIlllIlIIII[5]);
                            "".length();
                        }
                        if (lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(ff), lIIIlllIlIIII[21])) {
                            String[] strArr6 = new String[lIIIlllIlIIII[5]];
                            strArr6[lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[57]];
                            TileObject nearest4 = TileObjects.getNearest(strArr6);
                            String[] strArr7 = new String[lIIIlllIlIIII[5]];
                            strArr7[lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[58]];
                            if (lIlIIlIIIIllIlI(nearest4.hasAction(strArr7) ? 1 : 0)) {
                                String[] strArr8 = new String[lIIIlllIlIIII[5]];
                                strArr8[lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[31]];
                                TileObjects.getNearest(strArr8).interact(lIIIlllIIllll[lIIIlllIlIIII[59]]);
                                Time.sleepTicks(lIIIlllIlIIII[6]);
                                "".length();
                            }
                            String[] strArr9 = new String[lIIIlllIlIIII[5]];
                            strArr9[lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[60]];
                            TileObject nearest5 = TileObjects.getNearest(strArr9);
                            String[] strArr10 = new String[lIIIlllIlIIII[5]];
                            strArr10[lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[61]];
                            if (lIlIIlIIIIlllII(nearest5.hasAction(strArr10) ? 1 : 0)) {
                                C0006g.a(lIIIlllIIllll[lIIIlllIlIIII[62]], bW);
                            }
                        }
                    }
                    if (lIlIIlIIIIllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[63]];
                        C0006g.a(lIIIlllIIllll[lIIIlllIlIIII[64]], bW);
                    }
                }
                if (lIlIIlIIIIlllIl(Vars.getBit(lIIIlllIlIIII[33]), lIIIlllIlIIII[25])) {
                    C0006g.a(bW);
                }
            }
            if (lIlIIlIIIIlllIl(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[34])) {
                co = lIIIlllIlIIII[4];
                if (lIlIIlIIIIlllII(Vars.getBit(lIIIlllIlIIII[65]))) {
                    if (lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fg), lIIIlllIlIIII[19])) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[66]];
                        Movement.walkTo(fg);
                        "".length();
                        Time.sleepTicks(lIIIlllIlIIII[5]);
                        "".length();
                    }
                    if (lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fg), lIIIlllIlIIII[19])) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[7]];
                        C0006g.a(lIIIlllIIllll[lIIIlllIlIIII[67]], bW);
                    }
                }
                if (lIlIIlIIIIlllIl(Vars.getBit(lIIIlllIlIIII[65]), lIIIlllIlIIII[19])) {
                    if (lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fh), lIIIlllIlIIII[21])) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[68]];
                        Movement.walkTo(fh);
                        "".length();
                        Time.sleepTicks(lIIIlllIlIIII[5]);
                        "".length();
                    }
                    if (lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fh), lIIIlllIlIIII[21])) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[69]];
                        C0006g.a(lIIIlllIIllll[lIIIlllIlIIII[70]], bW);
                    }
                }
                if (lIlIIlIIIIlllIl(Vars.getBit(lIIIlllIlIIII[65]), lIIIlllIlIIII[25])) {
                    String[] strArr11 = new String[lIIIlllIlIIII[5]];
                    strArr11[lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[71]];
                    if (lIlIIlIIIIlllII(Inventory.contains(strArr11) ? 1 : 0)) {
                        String[] strArr12 = new String[lIIIlllIlIIII[5]];
                        strArr12[lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[72]];
                        Item first = Inventory.getFirst(strArr12);
                        String[] strArr13 = new String[lIIIlllIlIIII[5]];
                        strArr13[lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[73]];
                        first.useOn(Inventory.getFirst(strArr13));
                        Time.sleepTicks(lIIIlllIlIIII[5]);
                        "".length();
                    }
                    String[] strArr14 = new String[lIIIlllIlIIII[5]];
                    strArr14[lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[74]];
                    if (lIlIIlIIIIllIlI(Inventory.contains(strArr14) ? 1 : 0)) {
                        if (lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fg), lIIIlllIlIIII[19])) {
                            AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[50]];
                            Movement.walkTo(fg);
                            "".length();
                            Time.sleepTicks(lIIIlllIlIIII[5]);
                            "".length();
                        }
                        if (lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fg), lIIIlllIlIIII[19])) {
                            AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[75]];
                            C0006g.a(lIIIlllIIllll[lIIIlllIlIIII[76]], bW);
                        }
                    }
                }
                if (lIlIIlIIIIlllIl(Vars.getBit(lIIIlllIlIIII[65]), lIIIlllIlIIII[70])) {
                    C0006g.a(bW);
                }
                if (lIlIIlIIIIlllIl(Vars.getBit(lIIIlllIlIIII[65]), lIIIlllIlIIII[50])) {
                    if (lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fi), lIIIlllIlIIII[13])) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[77]];
                        Movement.walkTo(fi);
                        "".length();
                        Time.sleepTicks(lIIIlllIlIIII[5]);
                        "".length();
                    }
                    if (lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fi), lIIIlllIlIIII[13])) {
                        C0006g.a(lIIIlllIIllll[lIIIlllIlIIII[78]], bW);
                    }
                }
                C0006g.a(bW);
            }
            if (lIlIIlIIIIlllIl(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[55])) {
                if (lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fj), lIIIlllIlIIII[19])) {
                    AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[79]];
                    if (lIlIIlIIIIllIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(fj);
                    "".length();
                    Time.sleepTicks(lIIIlllIlIIII[5]);
                    "".length();
                }
                if (lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fj), lIIIlllIlIIII[19])) {
                    AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[80]];
                    C0006g.a(lIIIlllIIllll[lIIIlllIlIIII[81]], bW);
                }
            }
            if (!lIlIIlIIIlIIIll(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[60]) || !lIlIIlIIIlIIIll(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[66]) || lIlIIlIIIIlllIl(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[50])) {
                C0006g.a(bW);
            }
            if (lIlIIlIIIIlllIl(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[70])) {
                C0006g.a(bW);
                int[] iArr4 = new int[lIIIlllIlIIII[5]];
                iArr4[lIIIlllIlIIII[4]] = lIIIlllIlIIII[27];
                if (lIlIIlIIIIlllII(Equipment.contains(iArr4) ? 1 : 0)) {
                    int[] iArr5 = new int[lIIIlllIlIIII[5]];
                    iArr5[lIIIlllIlIIII[4]] = lIIIlllIlIIII[27];
                    if (lIlIIlIIIIllIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIIIlllIlIIII[5]];
                        iArr6[lIIIlllIlIIII[4]] = lIIIlllIlIIII[27];
                        Inventory.getFirst(iArr6).interact(lIIIlllIIllll[lIIIlllIlIIII[82]]);
                        Time.sleepTicks(lIIIlllIlIIII[5]);
                        "".length();
                    }
                }
                if (lIlIIlIIIIlllII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0) && lIlIIlIIIIllllI(Skills.getLevel(Skill.PRAYER), lIIIlllIlIIII[77]) && lIlIIlIIIlIIIII(Prayers.getPoints())) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                TileObject nearest6 = TileObjects.getNearest(tileObject -> {
                    if (lIlIIlIIIIllIlI(tileObject.getName().contains(lIIIlllIIllll[lIIIlllIlIIII[96]]) ? 1 : 0)) {
                        String[] strArr15 = new String[lIIIlllIlIIII[5]];
                        strArr15[lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[97]];
                        if (lIlIIlIIIIllIlI(tileObject.hasAction(strArr15) ? 1 : 0)) {
                            ?? r0 = lIIIlllIlIIII[5];
                            "".length();
                            return "  ".length() > "  ".length() ? ((((175 + 77) - 61) + 40) ^ (((33 + 21) - (-83)) + 45)) & (((3 ^ 89) ^ (94 ^ 85)) ^ (-" ".length())) : r0;
                        }
                    }
                    return lIIIlllIlIIII[4];
                });
                if (lIlIIlIIIIlllll(nearest6)) {
                    AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[83]];
                    nearest6.interact(lIIIlllIIllll[lIIIlllIlIIII[30]]);
                    Time.sleepTicks(lIIIlllIlIIII[12]);
                    "".length();
                }
                if (lIlIIlIIIlIIlII(lIlIIlIIIIllIIl(C0004e.v(), 50.0d))) {
                    int[] iArr7 = new int[lIIIlllIlIIII[5]];
                    iArr7[lIIIlllIlIIII[4]] = lIIIlllIlIIII[28];
                    if (lIlIIlIIIIllIlI(Inventory.contains(iArr7) ? 1 : 0)) {
                        int[] iArr8 = new int[lIIIlllIlIIII[5]];
                        iArr8[lIIIlllIlIIII[4]] = lIIIlllIlIIII[28];
                        Inventory.getFirst(iArr8).interact(lIIIlllIIllll[lIIIlllIlIIII[84]]);
                        Time.sleepTicks(lIIIlllIlIIII[5]);
                        "".length();
                    }
                }
            }
            if (lIlIIlIIIIlllIl(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[85]) && lIlIIlIIIIlllII(fc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[86]];
                if (lIlIIlIIIIllIll(co, lIIIlllIlIIII[5])) {
                    P.lF += lIIIlllIlIIII[5];
                    P.d(AccBuilderRat.m);
                    co += lIIIlllIlIIII[5];
                    P.lF = lIIIlllIlIIII[4];
                    cp = lIIIlllIlIIII[4];
                }
                int[] iArr9 = new int[lIIIlllIlIIII[5]];
                iArr9[lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
                if (lIlIIlIIIIllIlI(Inventory.contains(iArr9) ? 1 : 0) && lIlIIlIIIIlllII(Players.getLocal().isAnimating() ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIlllIlIIII[5]];
                    iArr10[lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
                    Inventory.getFirst(iArr10).interact(lIIIlllIIllll[lIIIlllIlIIII[87]]);
                    Time.sleepTicks(lIIIlllIlIIII[12]);
                    "".length();
                }
            }
            C0006g.a(new String[lIIIlllIlIIII[4]]);
        }
    }

    private static boolean lIlIIlIIIIllIll(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlIIlIIIlIIIII(int i2) {
        return i2 > 0;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIIlllIIllll[lIIIlllIlIIII[94]];
    }

    private static boolean lIlIIlIIIlIIIlI(int i2, int i3) {
        return i2 <= i3;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            ba();
            "".length();
            if (0 != 0) {
                return (72 ^ 31) & ((116 ^ 35) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIlllIlIIII[8];
    }

    private static boolean lIlIIlIIIIlllll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIlIIIIllIlI(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIIlllIlIIII[4];
    }

    private static boolean lIlIIlIIIlIIlII(int i2) {
        return i2 < 0;
    }

    private static int lIlIIlIIIIllIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }
}
