package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
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
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.X  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/X.class */
public class X implements K {
    public static /* synthetic */ List<C0003d> bp;
    static final /* synthetic */ WorldPoint kR;
    private static /* synthetic */ String[] lIlIIIlIII;
    public static final /* synthetic */ WorldPoint kO;
    static final /* synthetic */ WorldPoint kQ;
    private final /* synthetic */ int kS = lIlIIIlIll[0];
    static final /* synthetic */ WorldPoint kP;
    public static final /* synthetic */ WorldPoint kN;
    public static final /* synthetic */ WorldPoint kM;
    public static final /* synthetic */ WorldPoint kL;
    public static /* synthetic */ boolean bn;
    private static /* synthetic */ int[] lIlIIIlIll;

    private static boolean lIIIlIlIIIllI(int i, int i2) {
        return i >= i2;
    }

    private static void O() {
        int[] iArr = new int[lIlIIIlIll[2]];
        iArr[lIlIIIlIll[1]] = lIlIIIlIll[8];
        if (lIIIlIlIIIIII(Bank.contains(iArr) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIlIll[8], lIlIIIlIll[13], C0009j.bZ));
            "".length();
        }
        int[] iArr2 = new int[lIlIIIlIll[2]];
        iArr2[lIlIIIlIll[1]] = lIlIIIlIll[0];
        if (lIIIlIlIIIIII(Bank.contains(iArr2) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIlIll[0], dh(), lIlIIIlIll[63]));
            "".length();
        }
        int[] iArr3 = new int[lIlIIIlIll[2]];
        iArr3[lIlIIIlIll[1]] = lIlIIIlIll[7];
        if (lIIIlIlIIIIII(Bank.contains(iArr3) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIlIll[7], lIlIIIlIll[3], lIlIIIlIll[5]));
            "".length();
        }
        if (lIIIlIlIIIIII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIIIlIII[lIlIIIlIll[77]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIlIll[64], lIlIIIlIll[13], lIlIIIlIll[65]));
            "".length();
        }
        int[] iArr4 = new int[lIlIIIlIll[2]];
        iArr4[lIlIIIlIll[1]] = lIlIIIlIll[66];
        if (lIIIlIlIIIIII(Bank.contains(iArr4) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIlIll[66], lIlIIIlIll[67], lIlIIIlIll[68]));
            "".length();
        }
    }

    private static boolean lIIIlIlIIIlIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIlIlIIIIlI(int i) {
        return i > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
        if (lIIIlIIlllllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean al() {
        int[] iArr = new int[lIlIIIlIll[2]];
        iArr[lIlIIIlIll[1]] = lIlIIIlIll[9];
        if (lIIIlIIlllllI(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIIIlIll[2]];
            iArr2[lIlIIIlIll[1]] = lIlIIIlIll[9];
            if (lIIIlIlIIIllI(Inventory.getFirst(iArr2).getQuantity(), lIlIIIlIll[12])) {
                if (lIIIlIlIIIIII(Inventory.contains(C0005f.aZ) ? 1 : 0)) {
                    if (lIIIlIIlllllI(Equipment.contains(C0005f.aZ) ? 1 : 0)) {
                        int[] iArr3 = new int[lIlIIIlIll[2]];
                        iArr3[lIlIIIlIll[1]] = lIlIIIlIll[0];
                        if (lIIIlIlIIIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIlIIIlIll[2]];
                            iArr4[lIlIIIlIll[1]] = lIlIIIlIll[50];
                        }
                    }
                }
                ?? r0 = lIlIIIlIll[2];
                "".length();
                return (((156 ^ 166) ^ (48 ^ 32)) & (((((68 + 40) - 3) + 45) ^ (((73 + 168) - 214) + 161)) ^ (-" ".length()))) <= (-" ".length()) ? ((81 ^ 95) ^ (81 ^ 23)) & (((((114 + 27) - 99) + 165) ^ (((21 + 86) - 54) + 82)) ^ (-" ".length())) : r0;
            }
        }
        return lIlIIIlIll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIIIlIll[1];
    }

    private static void lIIIlIIllIlII() {
        lIlIIIlIII = new String[lIlIIIlIll[87]];
        lIlIIIlIII[lIlIIIlIll[1]] = lIIIlIIlIlllI("Jt+aod2m6567+dnCEO8tfQ==", "ylkRZ");
        lIlIIIlIII[lIlIIIlIll[2]] = lIIIlIIlIllll("BRsXAiorFx1LOzYLEAU+YxsNDjQwXlkYLioGGgMwLRVZCTggGVkfNmMCCwogJgA=", "CrykY");
        lIlIIIlIII[lIlIIIlIll[3]] = lIIIlIIlIlllI("fYBd2Qr9TV7+b1Mfne6zlNKtC+o8zTlL", "QxXrE");
        lIlIIIlIII[lIlIIIlIll[4]] = lIIIlIIllIIII("TeMfkGgUirNy6HVN07VQYudgypZS8Ykx", "YWuNT");
        lIlIIIlIII[lIlIIIlIll[6]] = lIIIlIIllIIII("E8M2BSRMsww82hw7KhoU0NIjM2m86G4+EklisFOXU2wt2zpVRvy3xVuzLHTQb00Zf1zML2IFKrs=", "HwhcA");
        lIlIIIlIII[lIlIIIlIll[13]] = lIIIlIIlIlllI("uy0zI1NoXns=", "MpKAE");
        lIlIIIlIII[lIlIIIlIll[15]] = lIIIlIIlIlllI("A+MLdDTugGTMpv6E/dQAnQ==", "IYsWU");
        lIlIIIlIII[lIlIIIlIll[17]] = lIIIlIIlIllll("JzoP", "uOmdD");
        lIlIIIlIII[lIlIIIlIll[18]] = lIIIlIIlIlllI("MCol8ejhiTHf2SpRP64w9g==", "uZGiN");
        lIlIIIlIII[lIlIIIlIll[19]] = lIIIlIIlIlllI("IAixMQSlJseE47S27tmE4t6zJZPcLQMH1kPOZvsCCuOCGOtUQbGnhw==", "gAKka");
        lIlIIIlIII[lIlIIIlIll[21]] = lIIIlIIllIIII("iAuwx3SvmtwrODn++BXphQ==", "xQlLm");
        lIlIIIlIII[lIlIIIlIll[41]] = lIIIlIIllIIII("TZEWau3dhV0nHMGncTbR4g==", "YRMek");
        lIlIIIlIII[lIlIIIlIll[44]] = lIIIlIIlIllll("OjE1BiZZODgdNAs=", "yYTiU");
        lIlIIIlIII[lIlIIIlIll[20]] = lIIIlIIllIIII("JajX2kpawdKEESo9vhRGiQ==", "SqNIO");
        lIlIIIlIII[lIlIIIlIll[46]] = lIIIlIIlIllll("AwIDJQ==", "LrfKr");
        lIlIIIlIII[lIlIIIlIll[47]] = lIIIlIIlIlllI("otyIANnBtqs=", "ShtbQ");
        lIlIIIlIII[lIlIIIlIll[48]] = lIIIlIIlIllll("KhImDw==", "ebCaX");
        lIlIIIlIII[lIlIIIlIll[49]] = lIIIlIIlIllll("GhkwHBV5ED0HBys=", "YqQsf");
        lIlIIIlIII[lIlIIIlIll[51]] = lIIIlIIlIlllI("3fH1Ut1JgjnA+fzFaL1Y0A==", "wvtbq");
        lIlIIIlIII[lIlIIIlIll[52]] = lIIIlIIlIlllI("uf+EiEHNzDIWBpXuWGbXXw==", "daxTX");
        lIlIIIlIII[lIlIIIlIll[14]] = lIIIlIIlIlllI("CSuxo45Jnl46Yclh6Ckyb7V0Nl7VsFBi", "WZixo");
        lIlIIIlIII[lIlIIIlIll[53]] = lIIIlIIlIlllI("ydpfLpmLEvalwxnne8rqFg==", "QbJvX");
        lIlIIIlIII[lIlIIIlIll[54]] = lIIIlIIlIllll("JAUnKA==", "kuBFT");
        lIlIIIlIII[lIlIIIlIll[55]] = lIIIlIIllIIII("cm+feTyfMLE=", "QrnCp");
        lIlIIIlIII[lIlIIIlIll[56]] = lIIIlIIlIlllI("Dap+a+PPRkg=", "HMvEv");
        lIlIIIlIII[lIlIIIlIll[57]] = lIIIlIIlIllll("NS4SHTEeMRQ=", "pVquP");
        lIlIIIlIII[lIlIIIlIll[58]] = lIIIlIIllIIII("PNreP0sQOAWoNZMquI6r1A==", "qehkb");
        lIlIIIlIII[lIlIIIlIll[59]] = lIIIlIIllIIII("Ae7PIIXkdoTKJoVMzOoOKQ==", "uwhzQ");
        lIlIIIlIII[lIlIIIlIll[60]] = lIIIlIIlIlllI("SKnO8qHqUJaBCJmPCq6wuw==", "aFSrn");
        lIlIIIlIII[lIlIIIlIll[61]] = lIIIlIIlIlllI("CwTOmrBXIc8AIda24g5T7w==", "olKab");
        lIlIIIlIII[lIlIIIlIll[62]] = lIIIlIIllIIII("QWoY7Q8J+GY=", "kLAXE");
        lIlIIIlIII[lIlIIIlIll[75]] = lIIIlIIlIllll("NT05ND0Xbyw/OQwhMSM/", "eOXMX");
        lIlIIIlIII[lIlIIIlIll[77]] = lIIIlIIllIIII("xo2ybnbeLBLzCBcmd+zFMpY4xZhFu5Hx", "legnN");
    }

    static {
        lIIIlIIllllIl();
        lIIIlIIllIlII();
        kL = new WorldPoint(lIlIIIlIll[78], lIlIIIlIll[79], lIlIIIlIll[1]);
        kM = new WorldPoint(lIlIIIlIll[80], lIlIIIlIll[81], lIlIIIlIll[1]);
        kN = new WorldPoint(lIlIIIlIll[82], lIlIIIlIll[83], lIlIIIlIll[1]);
        kO = new WorldPoint(lIlIIIlIll[84], lIlIIIlIll[43], lIlIIIlIll[1]);
        kP = new WorldPoint(lIlIIIlIll[1], lIlIIIlIll[1], lIlIIIlIll[1]);
        kQ = new WorldPoint(lIlIIIlIll[1], lIlIIIlIll[1], lIlIIIlIll[1]);
        kR = new WorldPoint(lIlIIIlIll[85], lIlIIIlIll[86], lIlIIIlIll[1]);
        bp = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIIlIlIIIllI(Skills.getLevel(Skill.PRAYER), lIlIIIlIll[76])) {
            ?? r0 = lIlIIIlIll[2];
            "".length();
            return "   ".length() >= (75 ^ 79) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIIlIll[1];
    }

    private static int dh() {
        return (lIIIlIIllllll(Skills.getLevel(Skill.PRAYER), lIlIIIlIll[70]) && lIIIlIlIIIllI(Skills.getLevel(Skill.PRAYER), lIlIIIlIll[71])) ? ((lIlIIIlIll[69] - Skills.getExperience(Skill.PRAYER)) / lIlIIIlIll[72]) + lIlIIIlIll[21] : ((lIlIIIlIll[73] - Skills.getExperience(Skill.PRAYER)) / lIlIIIlIll[72]) + lIlIIIlIll[62];
    }

    private static boolean lIIIlIlIIIIll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIlIlIIIIII(int i) {
        return i == 0;
    }

    private static void lIIIlIIllllIl() {
        lIlIIIlIll = new int[88];
        lIlIIIlIll[0] = (-((-8981) & 10231)) & (-24577) & 26362;
        lIlIIIlIll[1] = " ".length() & (" ".length() ^ (-1));
        lIlIIIlIll[2] = " ".length();
        lIlIIIlIll[3] = "  ".length();
        lIlIIIlIll[4] = "   ".length();
        lIlIIIlIll[5] = (-24647) & 29646;
        lIlIIIlIll[6] = 176 ^ 180;
        lIlIIIlIll[7] = (-9474) & 30639;
        lIlIIIlIll[8] = (-((-5467) & 7551)) & (-17923) & 32631;
        lIlIIIlIll[9] = (-((-931) & 30639)) & (-17) & 30719;
        lIlIIIlIll[10] = (-((-9989) & 30558)) & (-1539) & 32607;
        lIlIIIlIll[11] = (((201 ^ 189) + (20 ^ 31)) - (7 ^ 65)) + ((17 + 93) - 84) + 117;
        lIlIIIlIll[12] = 156 ^ 174;
        lIlIIIlIll[13] = 65 ^ 68;
        lIlIIIlIll[14] = (230 ^ 192) ^ (91 ^ 105);
        lIlIIIlIll[15] = 130 ^ 132;
        lIlIIIlIll[16] = -" ".length();
        lIlIIIlIll[17] = 128 ^ 135;
        lIlIIIlIll[18] = (12 ^ 56) ^ (138 ^ 182);
        lIlIIIlIll[19] = (243 ^ 129) ^ (125 ^ 6);
        lIlIIIlIll[20] = (105 ^ 63) ^ (44 ^ 119);
        lIlIIIlIll[21] = (34 ^ 104) ^ (227 ^ 163);
        lIlIIIlIll[22] = (-((-3412) & 28023)) & (-4105) & 31743;
        lIlIIIlIll[23] = (-28794) & 32635;
        lIlIIIlIll[24] = (-((-11161) & 15289)) & (-8205) & 15358;
        lIlIIIlIll[25] = (-16645) & 20479;
        lIlIIIlIll[26] = (-((-6311) & 22695)) & (-4145) & 23547;
        lIlIIIlIll[27] = (-20481) & 24312;
        lIlIIIlIll[28] = (-((-1027) & 29747)) & (-1) & 31735;
        lIlIIIlIll[29] = (-((-3701) & 32629)) & (-11) & 32767;
        lIlIIIlIll[30] = (-5169) & 8178;
        lIlIIIlIll[31] = (-((-593) & 13145)) & (-3) & 16379;
        lIlIIIlIll[32] = (-9281) & 12285;
        lIlIIIlIll[33] = (-20738) & 24559;
        lIlIIIlIll[34] = (-((-14951) & 31343)) & (-9281) & 28671;
        lIlIIIlIll[35] = (-((-2537) & 31230)) & (-1) & 32511;
        lIlIIIlIll[36] = (-24657) & 27647;
        lIlIIIlIll[37] = (-((-6315) & 14511)) & (-4353) & 16367;
        lIlIIIlIll[38] = (-25601) & 28583;
        lIlIIIlIll[39] = (-((-49) & 29819)) & (-18) & 32763;
        lIlIIIlIll[40] = (-5218) & 8187;
        lIlIIIlIll[41] = (156 ^ 166) ^ (63 ^ 14);
        lIlIIIlIll[42] = (-((-645) & 30381)) & (-1) & 32699;
        lIlIIIlIll[43] = (-((-7681) & 32532)) & (-4097) & 32767;
        lIlIIIlIll[44] = 186 ^ 182;
        lIlIIIlIll[45] = (-16401) & 19359;
        lIlIIIlIll[46] = (153 ^ 195) ^ (77 ^ 25);
        lIlIIIlIll[47] = 169 ^ 166;
        lIlIIIlIll[48] = (((21 + 112) - 11) + 5) ^ (170 ^ 197);
        lIlIIIlIll[49] = (((141 + 34) - 84) + 68) ^ (((43 + 135) - 78) + 42);
        lIlIIIlIll[50] = (-((-641) & 14055)) & (-16385) & 30335;
        lIlIIIlIll[51] = 120 ^ 106;
        lIlIIIlIll[52] = (63 ^ 78) ^ (13 ^ 111);
        lIlIIIlIll[53] = (238 ^ 193) ^ (145 ^ 171);
        lIlIIIlIll[54] = (((43 + 3) - (-23)) + 92) ^ (((123 + 76) - 35) + 19);
        lIlIIIlIll[55] = (107 ^ 65) ^ (132 ^ 185);
        lIlIIIlIll[56] = (((51 + 178) - 183) + 177) ^ (((128 + 49) - 131) + 153);
        lIlIIIlIll[57] = 149 ^ 140;
        lIlIIIlIll[58] = (181 ^ 193) ^ (50 ^ 92);
        lIlIIIlIll[59] = 125 ^ 102;
        lIlIIIlIll[60] = 61 ^ 33;
        lIlIIIlIll[61] = " ".length() ^ (160 ^ 188);
        lIlIIIlIll[62] = 59 ^ 37;
        lIlIIIlIll[63] = (-((-5137) & 21777)) & (-5133) & 24572;
        lIlIIIlIll[64] = (-305) & 12284;
        lIlIIIlIll[65] = (-7752) & 32751;
        lIlIIIlIll[66] = (-((-6033) & 30641)) & (-25) & 32639;
        lIlIIIlIll[67] = 7 ^ 47;
        lIlIIIlIll[68] = (-24617) & 25516;
        lIlIIIlIll[69] = (-513) & 274254;
        lIlIIIlIll[70] = 125 ^ 65;
        lIlIIIlIll[71] = (114 ^ 125) ^ (187 ^ 153);
        lIlIIIlIll[72] = (-((-174) & 24255)) & (-8237) & 32767;
        lIlIIIlIll[73] = (-((-1281) & 4023)) & (-1026) & 65279;
        lIlIIIlIll[74] = (15 ^ 110) ^ (122 ^ 127);
        lIlIIIlIll[75] = 120 ^ 103;
        lIlIIIlIll[76] = (254 ^ 197) ^ (195 ^ 155);
        lIlIIIlIll[77] = (98 ^ 111) ^ (98 ^ 79);
        lIlIIIlIll[78] = (-((-19397) & 28655)) & (-16385) & 28671;
        lIlIIIlIll[79] = (-12322) & 16165;
        lIlIIIlIll[80] = (-((-11670) & 28119)) & (-12289) & 31731;
        lIlIIIlIll[81] = (-((-8205) & 8479)) & (-1) & 4091;
        lIlIIIlIll[82] = (-89) & 3038;
        lIlIIIlIll[83] = (-(66 ^ 81)) & (-16385) & 20223;
        lIlIIIlIll[84] = (-((-2309) & 27967)) & (-4162) & 32767;
        lIlIIIlIll[85] = (-((-1065) & 9578)) & (-16393) & 27999;
        lIlIIIlIll[86] = (-21005) & 24495;
        lIlIIIlIll[87] = (((123 + 105) - 199) + 139) ^ (((86 + 51) - 122) + 122);
    }

    private static boolean lIIIlIlIIIlII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v307, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v331, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v53, types: [boolean] */
    public static void dg() {
        if (lIIIlIIlllllI(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIIlIII[lIlIIIlIll[1]];
            C0001b.a(bp);
            if (lIIIlIIllllll(bp.size(), lIlIIIlIll[2])) {
                System.out.println(lIlIIIlIII[lIlIIIlIll[2]]);
                bn = lIlIIIlIll[1];
            }
        }
        if (lIIIlIlIIIIII(bn ? 1 : 0)) {
            if (lIIIlIlIIIIII(al() ? 1 : 0) && lIIIlIIllllll(Game.getWildyLevel(), lIlIIIlIll[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIlIlIIIIIl(nearest) && lIIIlIlIIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIlIII[lIlIIIlIll[3]];
                    C0000a.a(nearest);
                }
                if (lIIIlIlIIIIIl(nearest) && lIIIlIIlllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIlIII[lIlIIIlIll[4]];
                    if (lIIIlIlIIIIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIIIlIll[5]);
                        "".length();
                    }
                    if (lIIIlIIlllllI(Bank.isOpen() ? 1 : 0)) {
                        if (lIIIlIlIIIIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIIIlIll[6]);
                            "".length();
                        }
                        if (lIIIlIlIIIIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIIIlIll[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIlIIIlIll[4]];
                        iArr[lIlIIIlIll[1]] = lIlIIIlIll[7];
                        iArr[lIlIIIlIll[2]] = lIlIIIlIll[0];
                        iArr[lIlIIIlIll[3]] = lIlIIIlIll[8];
                        if (lIIIlIlIIIIII(C0004e.b(iArr) ? 1 : 0)) {
                            O();
                            System.out.println(lIlIIIlIII[lIlIIIlIll[6]]);
                            bn = lIlIIIlIll[2];
                            return;
                        }
                        int[] iArr2 = new int[lIlIIIlIll[4]];
                        iArr2[lIlIIIlIll[1]] = lIlIIIlIll[7];
                        iArr2[lIlIIIlIll[2]] = lIlIIIlIll[0];
                        iArr2[lIlIIIlIll[3]] = lIlIIIlIll[8];
                        if (lIIIlIIlllllI(C0004e.b(iArr2) ? 1 : 0)) {
                            if (lIIIlIlIIIIII(Equipment.contains(C0005f.aZ) ? 1 : 0)) {
                                C0000a.b(C0005f.aZ, lIlIIIlIll[2]);
                            }
                            C0000a.b(C0005f.aU, lIlIIIlIll[2]);
                            C0000a.a(lIlIIIlIll[9], lIlIIIlIll[10]);
                            C0000a.b(lIlIIIlIll[0], lIlIIIlIll[11]);
                        }
                    }
                }
            }
            if (lIIIlIIlllllI(al() ? 1 : 0)) {
                if (lIIIlIIlllllI(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIIlIIllllll(Movement.getRunEnergy(), lIlIIIlIll[12])) {
                    Inventory.getFirst(C0005f.aU).interact(lIlIIIlIII[lIlIIIlIll[13]]);
                    Time.sleepTicks(lIlIIIlIll[2]);
                    "".length();
                }
                if (lIIIlIlIIIIII(Movement.isRunEnabled() ? 1 : 0) && lIIIlIlIIIIll(Movement.getRunEnergy(), lIlIIIlIll[14])) {
                    Movement.toggleRun();
                    Time.sleepTicks(lIlIIIlIll[13]);
                    "".length();
                }
                if (lIIIlIIllllll(Game.getWildyLevel(), lIlIIIlIll[2])) {
                    AccBuilderShamans.c = lIlIIIlIII[lIlIIIlIll[15]];
                    if (lIIIlIIlllllI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (lIIIlIlIIIIII(Dialog.isOpen() ? 1 : 0) && lIIIlIIlllllI(Inventory.contains(C0005f.aZ) ? 1 : 0) && lIIIlIlIIIlII(Players.getLocal().getAnimation(), lIlIIIlIll[16])) {
                        Inventory.getFirst(C0005f.aZ).interact(lIlIIIlIII[lIlIIIlIll[17]]);
                        Time.sleepTicks(lIlIIIlIll[3]);
                        "".length();
                    }
                    String[] strArr = new String[lIlIIIlIll[3]];
                    strArr[lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[18]];
                    strArr[lIlIIIlIll[2]] = lIlIIIlIII[lIlIIIlIll[19]];
                    C0006g.a(strArr);
                }
                if (lIIIlIlIIIIlI(Game.getWildyLevel())) {
                    int[] iArr3 = new int[lIlIIIlIll[2]];
                    iArr3[lIlIIIlIll[1]] = lIlIIIlIll[0];
                    if (lIIIlIIlllllI(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (lIIIlIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(kN), lIlIIIlIll[20])) {
                            AccBuilderShamans.c = lIlIIIlIII[lIlIIIlIll[21]];
                            WorldPoint[] worldPointArr = new WorldPoint[lIlIIIlIll[20]];
                            worldPointArr[lIlIIIlIll[1]] = new WorldPoint(lIlIIIlIll[22], lIlIIIlIll[23], lIlIIIlIll[1]);
                            worldPointArr[lIlIIIlIll[2]] = new WorldPoint(lIlIIIlIll[24], lIlIIIlIll[25], lIlIIIlIll[1]);
                            worldPointArr[lIlIIIlIll[3]] = new WorldPoint(lIlIIIlIll[26], lIlIIIlIll[27], lIlIIIlIll[1]);
                            worldPointArr[lIlIIIlIll[4]] = new WorldPoint(lIlIIIlIll[28], lIlIIIlIll[29], lIlIIIlIll[1]);
                            worldPointArr[lIlIIIlIll[6]] = new WorldPoint(lIlIIIlIll[30], lIlIIIlIll[31], lIlIIIlIll[1]);
                            worldPointArr[lIlIIIlIll[13]] = new WorldPoint(lIlIIIlIll[32], lIlIIIlIll[33], lIlIIIlIll[1]);
                            worldPointArr[lIlIIIlIll[15]] = new WorldPoint(lIlIIIlIll[34], lIlIIIlIll[35], lIlIIIlIll[1]);
                            worldPointArr[lIlIIIlIll[17]] = new WorldPoint(lIlIIIlIll[36], lIlIIIlIll[37], lIlIIIlIll[1]);
                            worldPointArr[lIlIIIlIll[18]] = new WorldPoint(lIlIIIlIll[38], lIlIIIlIll[37], lIlIIIlIll[1]);
                            worldPointArr[lIlIIIlIll[19]] = new WorldPoint(lIlIIIlIll[39], lIlIIIlIll[37], lIlIIIlIll[1]);
                            worldPointArr[lIlIIIlIll[21]] = new WorldPoint(lIlIIIlIll[40], lIlIIIlIll[37], lIlIIIlIll[1]);
                            worldPointArr[lIlIIIlIll[41]] = new WorldPoint(lIlIIIlIll[42], lIlIIIlIll[43], lIlIIIlIll[1]);
                            worldPointArr[lIlIIIlIll[44]] = new WorldPoint(lIlIIIlIll[45], lIlIIIlIll[43], lIlIIIlIll[1]);
                            Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                            "".length();
                            Time.sleepTicks(lIlIIIlIll[2]);
                            "".length();
                        }
                        if (lIIIlIlIIIlIl(Players.getLocal().getWorldLocation().distanceTo(kN), lIlIIIlIll[20])) {
                            AccBuilderShamans.c = lIlIIIlIII[lIlIIIlIll[41]];
                            String[] strArr2 = new String[lIlIIIlIll[2]];
                            strArr2[lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[44]];
                            TileObject nearest2 = TileObjects.getNearest(strArr2);
                            String[] strArr3 = new String[lIlIIIlIll[2]];
                            strArr3[lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[20]];
                            TileObject nearest3 = TileObjects.getNearest(strArr3);
                            String[] strArr4 = new String[lIlIIIlIll[2]];
                            strArr4[lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[46]];
                            if (lIIIlIIlllllI(nearest3.hasAction(strArr4) ? 1 : 0)) {
                                nearest3.interact(lIlIIIlIII[lIlIIIlIll[47]]);
                            }
                            if (lIIIlIlIIIIIl(nearest2)) {
                                String[] strArr5 = new String[lIlIIIlIll[2]];
                                strArr5[lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[48]];
                                if (lIIIlIlIIIIII(nearest3.hasAction(strArr5) ? 1 : 0)) {
                                    Skills.getExperience(Skill.PRAYER);
                                    int[] iArr4 = new int[lIlIIIlIll[2]];
                                    iArr4[lIlIIIlIll[1]] = lIlIIIlIll[0];
                                    Item first = Inventory.getFirst(iArr4);
                                    String[] strArr6 = new String[lIlIIIlIll[2]];
                                    strArr6[lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[49]];
                                    first.useOn(TileObjects.getNearest(strArr6));
                                    Time.sleepTicks(lIlIIIlIll[2]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[lIlIIIlIll[2]];
                    iArr5[lIlIIIlIll[1]] = lIlIIIlIll[0];
                    if (lIIIlIlIIIIII(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIlIIIlIll[2]];
                        iArr6[lIlIIIlIll[1]] = lIlIIIlIll[50];
                        if (lIIIlIIlllllI(Inventory.contains(iArr6) ? 1 : 0)) {
                            if (lIIIlIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(kN), lIlIIIlIll[20])) {
                                AccBuilderShamans.c = lIlIIIlIII[lIlIIIlIll[51]];
                                WorldPoint[] worldPointArr2 = new WorldPoint[lIlIIIlIll[20]];
                                worldPointArr2[lIlIIIlIll[1]] = new WorldPoint(lIlIIIlIll[22], lIlIIIlIll[23], lIlIIIlIll[1]);
                                worldPointArr2[lIlIIIlIll[2]] = new WorldPoint(lIlIIIlIll[24], lIlIIIlIll[25], lIlIIIlIll[1]);
                                worldPointArr2[lIlIIIlIll[3]] = new WorldPoint(lIlIIIlIll[26], lIlIIIlIll[27], lIlIIIlIll[1]);
                                worldPointArr2[lIlIIIlIll[4]] = new WorldPoint(lIlIIIlIll[28], lIlIIIlIll[29], lIlIIIlIll[1]);
                                worldPointArr2[lIlIIIlIll[6]] = new WorldPoint(lIlIIIlIll[30], lIlIIIlIll[31], lIlIIIlIll[1]);
                                worldPointArr2[lIlIIIlIll[13]] = new WorldPoint(lIlIIIlIll[32], lIlIIIlIll[33], lIlIIIlIll[1]);
                                worldPointArr2[lIlIIIlIll[15]] = new WorldPoint(lIlIIIlIll[34], lIlIIIlIll[35], lIlIIIlIll[1]);
                                worldPointArr2[lIlIIIlIll[17]] = new WorldPoint(lIlIIIlIll[36], lIlIIIlIll[37], lIlIIIlIll[1]);
                                worldPointArr2[lIlIIIlIll[18]] = new WorldPoint(lIlIIIlIll[38], lIlIIIlIll[37], lIlIIIlIll[1]);
                                worldPointArr2[lIlIIIlIll[19]] = new WorldPoint(lIlIIIlIll[39], lIlIIIlIll[37], lIlIIIlIll[1]);
                                worldPointArr2[lIlIIIlIll[21]] = new WorldPoint(lIlIIIlIll[40], lIlIIIlIll[37], lIlIIIlIll[1]);
                                worldPointArr2[lIlIIIlIll[41]] = new WorldPoint(lIlIIIlIll[42], lIlIIIlIll[43], lIlIIIlIll[1]);
                                worldPointArr2[lIlIIIlIll[44]] = new WorldPoint(lIlIIIlIll[45], lIlIIIlIll[43], lIlIIIlIll[1]);
                                Walker.walkAlong(Arrays.asList(worldPointArr2), new HashMap());
                                "".length();
                                Time.sleepTicks(lIlIIIlIll[2]);
                                "".length();
                            }
                            if (lIIIlIlIIIlIl(Players.getLocal().getWorldLocation().distanceTo(kN), lIlIIIlIll[20])) {
                                AccBuilderShamans.c = lIlIIIlIII[lIlIIIlIll[52]];
                                if (!lIIIlIlIIIIII(Dialog.canLevelUpContinue() ? 1 : 0) || lIIIlIIlllllI(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] strArr7 = new String[lIlIIIlIll[2]];
                                strArr7[lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[14]];
                                NPC nearest4 = NPCs.getNearest(strArr7);
                                String[] strArr8 = new String[lIlIIIlIll[2]];
                                strArr8[lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[53]];
                                TileObject nearest5 = TileObjects.getNearest(strArr8);
                                String[] strArr9 = new String[lIlIIIlIll[2]];
                                strArr9[lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[54]];
                                if (lIIIlIIlllllI(nearest5.hasAction(strArr9) ? 1 : 0)) {
                                    nearest5.interact(lIlIIIlIII[lIlIIIlIll[55]]);
                                }
                                if (lIIIlIlIIIIIl(nearest4)) {
                                    String[] strArr10 = new String[lIlIIIlIll[2]];
                                    strArr10[lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[56]];
                                    if (lIIIlIlIIIIII(nearest5.hasAction(strArr10) ? 1 : 0)) {
                                        if (lIIIlIlIIIIII(Dialog.isOpen() ? 1 : 0)) {
                                            int[] iArr7 = new int[lIlIIIlIll[2]];
                                            iArr7[lIlIIIlIll[1]] = lIlIIIlIll[50];
                                            Inventory.getFirst(iArr7).useOn(nearest4);
                                            Time.sleepTicks(lIlIIIlIll[3]);
                                            "".length();
                                        }
                                        if (lIIIlIIlllllI(Dialog.isOpen() ? 1 : 0)) {
                                            List options = Dialog.getOptions();
                                            if (lIIIlIlIIIIII(options.isEmpty() ? 1 : 0)) {
                                                int i = lIlIIIlIll[1];
                                                while (lIIIlIIllllll(i, options.size())) {
                                                    int[] iArr8 = new int[lIlIIIlIll[2]];
                                                    iArr8[lIlIIIlIll[1]] = lIlIIIlIll[50];
                                                    if (lIIIlIlIIIlII(((Item) Inventory.getAll(iArr8).get(lIlIIIlIll[1])).getQuantity(), lIlIIIlIll[2]) && lIIIlIIlllllI(((Widget) options.get(i)).getText().contains(lIlIIIlIII[lIlIIIlIll[57]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIlIIIlIll[2]);
                                                        Time.sleepTicks(lIlIIIlIll[3]);
                                                        "".length();
                                                    }
                                                    int[] iArr9 = new int[lIlIIIlIll[2]];
                                                    iArr9[lIlIIIlIll[1]] = lIlIIIlIll[50];
                                                    if (lIIIlIlIIIlII(((Item) Inventory.getAll(iArr9).get(lIlIIIlIll[1])).getQuantity(), lIlIIIlIll[13]) && lIIIlIIlllllI(((Widget) options.get(i)).getText().contains(lIlIIIlIII[lIlIIIlIll[58]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIlIIIlIll[2]);
                                                        Time.sleepTicks(lIlIIIlIll[3]);
                                                        "".length();
                                                    }
                                                    if (lIIIlIIlllllI(((Widget) options.get(i)).getText().contains(lIlIIIlIII[lIlIIIlIll[59]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIlIIIlIll[2]);
                                                        Time.sleepTicks(lIlIIIlIll[3]);
                                                        "".length();
                                                    }
                                                    i++;
                                                    "".length();
                                                    if (((191 ^ 167) ^ (32 ^ 60)) <= "  ".length()) {
                                                        return;
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
            }
            int[] iArr10 = new int[lIlIIIlIll[2]];
            iArr10[lIlIIIlIll[1]] = lIlIIIlIll[9];
            if (lIIIlIIlllllI(Inventory.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lIlIIIlIll[2]];
                iArr11[lIlIIIlIll[1]] = lIlIIIlIll[0];
                if (!lIIIlIlIIIIII(Inventory.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[lIlIIIlIll[2]];
                iArr12[lIlIIIlIll[1]] = lIlIIIlIll[50];
                if (!lIIIlIlIIIIII(Inventory.contains(iArr12) ? 1 : 0)) {
                    return;
                }
            }
            if (lIIIlIlIIIlIl(Players.getLocal().getWorldLocation().distanceTo(kN), lIlIIIlIll[20])) {
                AccBuilderShamans.c = lIlIIIlIII[lIlIIIlIll[60]];
                String[] strArr11 = new String[lIlIIIlIll[2]];
                strArr11[lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[61]];
                TileItem nearest6 = TileItems.getNearest(strArr11);
                if (lIIIlIlIIIIIl(nearest6)) {
                    nearest6.interact(lIlIIIlIII[lIlIIIlIll[62]]);
                }
            }
        }
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlIIIlIII[lIlIIIlIll[75]];
    }

    private static boolean lIIIlIIllllll(int i, int i2) {
        return i < i2;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            dg();
            "".length();
            if ("   ".length() <= 0) {
                return ((119 ^ 15) ^ (170 ^ 141)) & (((224 ^ 138) ^ (57 ^ 12)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIlIIIlIll[74];
    }

    private static String lIIIlIIlIllll(String llllllllllllllllllllIlIIlIIIIlII, String llllllllllllllllllllIlIIlIIIIIll) {
        String llllllllllllllllllllIlIIlIIIIlII2 = new String(Base64.getDecoder().decode(llllllllllllllllllllIlIIlIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllllIlIIlIIIIIlI = new StringBuilder();
        char[] charArray = llllllllllllllllllllIlIIlIIIIIll.toCharArray();
        int llllllllllllllllllllIlIIlIIIIIII = lIlIIIlIll[1];
        char[] charArray2 = llllllllllllllllllllIlIIlIIIIlII2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIlIll[1];
        while (lIIIlIIllllll(i, length)) {
            char llllllllllllllllllllIlIIlIIIIlIl = charArray2[i];
            llllllllllllllllllllIlIIlIIIIIlI.append((char) (llllllllllllllllllllIlIIlIIIIlIl ^ charArray[llllllllllllllllllllIlIIlIIIIIII % charArray.length]));
            "".length();
            llllllllllllllllllllIlIIlIIIIIII++;
            i++;
            "".length();
            if ((((212 ^ 159) ^ (74 ^ 77)) & (((168 ^ 182) ^ (226 ^ 176)) ^ (-" ".length()))) < (((216 ^ 160) ^ (58 ^ 73)) & (((238 ^ 198) ^ (129 ^ 162)) ^ (-" ".length())) & ((((((229 + 20) - 38) + 19) ^ (((111 + 141) - 241) + 151)) & (((((24 + 133) - 141) + 197) ^ (((35 + 136) - 124) + 98)) ^ (-" ".length()))) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllllIlIIlIIIIIlI);
    }

    private static String lIIIlIIllIIII(String llllllllllllllllllllIlIIlIIlIlII, String llllllllllllllllllllIlIIlIIlIIll) {
        try {
            SecretKeySpec llllllllllllllllllllIlIIlIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIlIIlIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIlIll[3], llllllllllllllllllllIlIIlIIlIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIlIIlIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIlIIlIIlIlIl) {
            llllllllllllllllllllIlIIlIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIlllllI(int i) {
        return i != 0;
    }

    private static boolean lIIIlIlIIIIIl(Object obj) {
        return obj != null;
    }

    private static String lIIIlIIlIlllI(String llllllllllllllllllllIlIIlIlIIIIl, String llllllllllllllllllllIlIIlIlIIIII) {
        try {
            SecretKeySpec llllllllllllllllllllIlIIlIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIlIIlIlIIIII.getBytes(StandardCharsets.UTF_8)), lIlIIIlIll[18]), "DES");
            Cipher llllllllllllllllllllIlIIlIlIIIll = Cipher.getInstance("DES");
            llllllllllllllllllllIlIIlIlIIIll.init(lIlIIIlIll[3], llllllllllllllllllllIlIIlIlIIlII);
            return new String(llllllllllllllllllllIlIIlIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIlIIlIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIlIIlIlIIIlI) {
            llllllllllllllllllllIlIIlIlIIIlI.printStackTrace();
            return null;
        }
    }
}
