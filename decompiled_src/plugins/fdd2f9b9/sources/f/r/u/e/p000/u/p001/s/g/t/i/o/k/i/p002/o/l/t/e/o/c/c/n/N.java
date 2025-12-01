package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.N  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/N.class */
public class N implements G {
    static final /* synthetic */ WorldPoint iN;
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ int[] lIIlIllIll;
    public static final /* synthetic */ WorldPoint iM;
    public static final /* synthetic */ WorldPoint iJ;
    public static final /* synthetic */ WorldPoint iK;
    private static /* synthetic */ String[] lIIlIllIlI;
    static final /* synthetic */ WorldPoint iP;
    static final /* synthetic */ WorldPoint iO;
    public static /* synthetic */ boolean bt;
    private final /* synthetic */ int iQ = lIIlIllIll[0];
    public static final /* synthetic */ WorldPoint iL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIlIllIll[1];
    }

    private static boolean lIIIIIIIIllII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIIIIIIlIIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
        if (lIIIIIIIIIlII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ab() {
        int[] iArr = new int[lIIlIllIll[2]];
        iArr[lIIlIllIll[1]] = lIIlIllIll[10];
        if (lIIIIIIIIIlII(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIlIllIll[2]];
            iArr2[lIIlIllIll[1]] = lIIlIllIll[10];
            if (lIIIIIIIIllII(Inventory.getFirst(iArr2).getQuantity(), lIIlIllIll[13])) {
                if (lIIIIIIIIIllI(Inventory.contains(C0005f.ba) ? 1 : 0)) {
                    if (lIIIIIIIIIlII(Equipment.contains(C0005f.ba) ? 1 : 0)) {
                        int[] iArr3 = new int[lIIlIllIll[2]];
                        iArr3[lIIlIllIll[1]] = lIIlIllIll[0];
                        if (lIIIIIIIIIllI(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIlIllIll[2]];
                            iArr4[lIIlIllIll[1]] = lIIlIllIll[51];
                        }
                    }
                }
                ?? r0 = lIIlIllIll[2];
                "".length();
                return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIIlIllIll[1];
    }

    private static boolean lIIIIIIIIlIII(int i) {
        return i > 0;
    }

    private static int cC() {
        return (lIIIIIIIIIlIl(Skills.getLevel(Skill.PRAYER), lIIlIllIll[71]) && lIIIIIIIIllII(Skills.getLevel(Skill.PRAYER), lIIlIllIll[3])) ? ((lIIlIllIll[70] - Skills.getExperience(Skill.PRAYER)) / lIIlIllIll[72]) + lIIlIllIll[22] : ((lIIlIllIll[73] - Skills.getExperience(Skill.PRAYER)) / lIIlIllIll[72]) + lIIlIllIll[63];
    }

    private static void llllllllIlll() {
        lIIlIllIlI = new String[lIIlIllIll[86]];
        lIIlIllIlI[lIIlIllIll[1]] = llllllllIlII("z0DiVwsgX6Ht0yndzHOQEg==", "WLQDu");
        lIIlIllIlI[lIIlIllIll[2]] = llllllllIlII("ZYdqtFtihoIBWC7wma7D5ua1c4IHkwQ4v8M637kSlySfiek3gClFqAoP7XgAo+DT", "ItkqT");
        lIIlIllIlI[lIIlIllIll[4]] = llllllllIlIl("HwoeEQ8wHwEWD3EfB1gKMAUD", "Qkhxh");
        lIIlIllIlI[lIIlIllIll[5]] = llllllllIlII("JfrqitXtqJwgjSuAwH465463NwMPgkCO", "QMpOy");
        lIIlIllIlI[lIIlIllIll[7]] = llllllllIlII("JXMg3eF0b++IIwrfkLabdpGpNo+RluqhJH633Vp8EmozZzRcK16vpO+Yy1TtISkiqBDeMl0KEvQ=", "EbUdF");
        lIIlIllIlI[lIIlIllIll[14]] = llllllllIlII("nCiJy23a6Ag=", "OiVEY");
        lIIlIllIlI[lIIlIllIll[16]] = llllllllIlIl("IB06J3YAF3Y1PxgcLw==", "txVBV");
        lIIlIllIlI[lIIlIllIll[18]] = llllllllIlII("KeIAhiHPyCw=", "WPEwJ");
        lIIlIllIlI[lIIlIllIll[19]] = llllllllIlIl("Oy4CDGY6Lg4I", "wOtmF");
        lIIlIllIlI[lIIlIllIll[20]] = llllllllIlIl("IzkCD0FMJgYaCBw9EQJNGD1DGggaNw9WWV1yNB8BCDcRGAgfIU0=", "lRcvm");
        lIIlIllIlI[lIIlIllIll[22]] = llllllllIlIl("OxY8TwIaVysDAhQF", "uwJov");
        lIIlIllIlI[lIIlIllIll[42]] = llllllllIlII("YshyETb+H/KUtbzfKRyZ1A==", "WGsgT");
        lIIlIllIlI[lIIlIllIll[45]] = llllllllIlII("jkHtPV30GUWZTkuawFK19w==", "yCzRx");
        lIIlIllIlI[lIIlIllIll[21]] = llllllllIlII("qdvBJATLXWjKHtcoPqP2ww==", "Bxxgs");
        lIIlIllIlI[lIIlIllIll[47]] = llllllllIlII("BQH1lSvtIW4=", "dHVpm");
        lIIlIllIlI[lIIlIllIll[48]] = llllllllIlIl("CSoQNg==", "FZuXl");
        lIIlIllIlI[lIIlIllIll[49]] = llllllllIlII("ET93jo4jTTA=", "FMflq");
        lIIlIllIlI[lIIlIllIll[50]] = llllllllIllI("Tk5ADcunmKY4m4qLmuvdPw==", "reNPd");
        lIIlIllIlI[lIIlIllIll[52]] = llllllllIlIl("FAITTQU1QwQBBTsR", "Zcemq");
        lIIlIllIlI[lIIlIllIll[53]] = llllllllIlIl("Nh8kPgAKHy1xFgwfLyI=", "cqJQt");
        lIIlIllIlI[lIIlIllIll[15]] = llllllllIlII("n9+l85Cc4XVlrD2DvMotIVtzQtzGxDaO", "kqrlr");
        lIIlIllIlI[lIIlIllIll[54]] = llllllllIllI("cgcFTmy+vjJiNwnbCuOz1w==", "ErROz");
        lIIlIllIlI[lIIlIllIll[55]] = llllllllIlIl("KCUuDw==", "gUKax");
        lIIlIllIlI[lIIlIllIll[56]] = llllllllIlII("4hyW4Vd6x+c=", "YSyVC");
        lIIlIllIlI[lIIlIllIll[57]] = llllllllIllI("VhvS0OCRltQ=", "LXkME");
        lIIlIllIlI[lIIlIllIll[58]] = llllllllIlII("l1tuKhYVVyN1Bx3MNH78wQ==", "VyLLz");
        lIIlIllIlI[lIIlIllIll[59]] = llllllllIlII("8VlxyS+mZ0Frj/6akd066g==", "LsnkT");
        lIIlIllIlI[lIIlIllIll[60]] = llllllllIlII("p/YYgT9+d0MCpY2Tc2SvBg==", "rPeYi");
        lIIlIllIlI[lIIlIllIll[61]] = llllllllIlII("bILCknG5fNh3+EG2Yo/lOA==", "vIzgV");
        lIIlIllIlI[lIIlIllIll[62]] = llllllllIllI("lFCTinyG1GPNUdGSg6YTaQ==", "hIdmA");
        lIIlIllIlI[lIIlIllIll[63]] = llllllllIlII("3w1P3lOoL94=", "LPYfw");
        lIIlIllIlI[lIIlIllIll[75]] = llllllllIlIl("KgIEHAAIUBEXBBMeDAsC", "zpeee");
        lIIlIllIlI[lIIlIllIll[76]] = llllllllIlIl("PSg3FHcgJ3kEMi4tLRt3Zw==", "OAYsW");
    }

    private static void af() {
        int[] iArr = new int[lIIlIllIll[2]];
        iArr[lIIlIllIll[1]] = lIIlIllIll[9];
        if (lIIIIIIIIIllI(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIllIll[9], lIIlIllIll[14], C0008i.bq));
            "".length();
        }
        int[] iArr2 = new int[lIIlIllIll[2]];
        iArr2[lIIlIllIll[1]] = lIIlIllIll[0];
        if (lIIIIIIIIIllI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIllIll[0], cC(), lIIlIllIll[64]));
            "".length();
        }
        int[] iArr3 = new int[lIIlIllIll[2]];
        iArr3[lIIlIllIll[1]] = lIIlIllIll[8];
        if (lIIIIIIIIIllI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIllIll[8], lIIlIllIll[4], lIIlIllIll[6]));
            "".length();
        }
        if (lIIIIIIIIIllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIlIllIlI[lIIlIllIll[76]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIllIll[65], lIIlIllIll[14], lIIlIllIll[66]));
            "".length();
        }
        int[] iArr4 = new int[lIIlIllIll[2]];
        iArr4[lIIlIllIll[1]] = lIIlIllIll[67];
        if (lIIIIIIIIIllI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIllIll[67], lIIlIllIll[68], lIIlIllIll[69]));
            "".length();
        }
    }

    private static boolean lIIIIIIIIIllI(int i) {
        return i == 0;
    }

    private static void lIIIIIIIIIIll() {
        lIIlIllIll = new int[87];
        lIIlIllIll[0] = (-6375) & 6910;
        lIIlIllIll[1] = ((41 ^ 57) ^ (110 ^ 81)) & (((40 ^ 49) ^ (127 ^ 73)) ^ (-" ".length()));
        lIIlIllIll[2] = " ".length();
        lIIlIllIll[3] = 172 ^ 129;
        lIIlIllIll[4] = "  ".length();
        lIIlIllIll[5] = "   ".length();
        lIIlIllIll[6] = (-10259) & 15258;
        lIIlIllIll[7] = 178 ^ 182;
        lIIlIllIll[8] = (-((-23070) & 32607)) & (-17) & 30719;
        lIIlIllIll[9] = (-2051) & 14675;
        lIIlIllIll[10] = (-12313) & 13307;
        lIIlIllIll[11] = (-21220) & 31719;
        lIIlIllIll[12] = (((121 ^ 97) + "  ".length()) - (161 ^ 185)) + ((42 + 125) - 0) + 31;
        lIIlIllIll[13] = (((58 + 100) - 140) + 121) ^ (((78 + 50) - 16) + 73);
        lIIlIllIll[14] = 41 ^ 44;
        lIIlIllIll[15] = 152 ^ 140;
        lIIlIllIll[16] = (((135 + 99) - 133) + 48) ^ (((55 + 40) - (-36)) + 16);
        lIIlIllIll[17] = -" ".length();
        lIIlIllIll[18] = (229 ^ 159) ^ (57 ^ 68);
        lIIlIllIll[19] = (((137 + 72) - 194) + 171) ^ (((134 + 159) - 165) + 50);
        lIIlIllIll[20] = (52 ^ 47) ^ (19 ^ 1);
        lIIlIllIll[21] = (4 ^ 27) ^ (106 ^ 120);
        lIIlIllIll[22] = 129 ^ 139;
        lIIlIllIll[23] = (-((-3812) & 32487)) & (-1057) & 32759;
        lIIlIllIll[24] = (-((-6849) & 31466)) & (-4177) & 32635;
        lIIlIllIll[25] = (-24589) & 27614;
        lIIlIllIll[26] = (-5) & 3839;
        lIIlIllIll[27] = (-9253) & 12271;
        lIIlIllIll[28] = (-((-17201) & 29492)) & (-16645) & 32767;
        lIIlIllIll[29] = (-((-8257) & 13433)) & (-1) & 8191;
        lIIlIllIll[30] = (-((-16649) & 28937)) & (-16387) & 32503;
        lIIlIllIll[31] = (-((-4947) & 21371)) & (-5125) & 24558;
        lIIlIllIll[32] = (-4353) & 8177;
        lIIlIllIll[33] = (-16449) & 19453;
        lIIlIllIll[34] = (-((-231) & 4583)) & (-16402) & 24575;
        lIIlIllIll[35] = (-16393) & 19391;
        lIIlIllIll[36] = (-16401) & 20218;
        lIIlIllIll[37] = (-4161) & 7151;
        lIIlIllIll[38] = (-((-7867) & 32703)) & (-4113) & 32767;
        lIIlIllIll[39] = (-((-147) & 13531)) & (-16385) & 32751;
        lIIlIllIll[40] = (-((-642) & 26315)) & (-19) & 28667;
        lIIlIllIll[41] = (-((-9209) & 30713)) & (-8198) & 32671;
        lIIlIllIll[42] = 160 ^ 171;
        lIIlIllIll[43] = (-1033) & 3995;
        lIIlIllIll[44] = (-((-8233) & 28986)) & (-8193) & 32765;
        lIIlIllIll[45] = (250 ^ 192) ^ (137 ^ 191);
        lIIlIllIll[46] = (-((-17543) & 21735)) & (-24593) & 31743;
        lIIlIllIll[47] = 34 ^ 44;
        lIIlIllIll[48] = 24 ^ 23;
        lIIlIllIll[49] = " ".length() ^ (28 ^ 13);
        lIIlIllIll[50] = 187 ^ 170;
        lIIlIllIll[51] = (-4549) & 5085;
        lIIlIllIll[52] = 54 ^ 36;
        lIIlIllIll[53] = 2 ^ 17;
        lIIlIllIll[54] = 100 ^ 113;
        lIIlIllIll[55] = 62 ^ 40;
        lIIlIllIll[56] = 210 ^ 197;
        lIIlIllIll[57] = (((132 + 106) - 95) + 80) ^ (((180 + 104) - 258) + 173);
        lIIlIllIll[58] = 19 ^ 10;
        lIIlIllIll[59] = 6 ^ 28;
        lIIlIllIll[60] = 97 ^ 122;
        lIIlIllIll[61] = (53 ^ 126) ^ (4 ^ 83);
        lIIlIllIll[62] = (62 ^ 121) ^ (215 ^ 141);
        lIIlIllIll[63] = 37 ^ 59;
        lIIlIllIll[64] = (-((-67) & 30019)) & (-12) & 32763;
        lIIlIllIll[65] = (-(148 ^ 160)) & (-4097) & 16127;
        lIIlIllIll[66] = (-((-8229) & 12924)) & (-2049) & 31743;
        lIIlIllIll[67] = (-8345) & 16351;
        lIIlIllIll[68] = (108 ^ 96) ^ (2 ^ 38);
        lIIlIllIll[69] = (-31828) & 32727;
        lIIlIllIll[70] = (-((-4449) & 20833)) & (-130) & 290255;
        lIIlIllIll[71] = (109 ^ 0) ^ (34 ^ 115);
        lIIlIllIll[72] = (-((-83) & 32383)) & (-18) & 32767;
        lIIlIllIll[73] = (-2979) & 64490;
        lIIlIllIll[74] = 96 ^ 4;
        lIIlIllIll[75] = 46 ^ 49;
        lIIlIllIll[76] = (223 ^ 198) ^ (133 ^ 188);
        lIIlIllIll[77] = (-5161) & 8189;
        lIIlIllIll[78] = (-((-813) & 29695)) & (-2) & 32727;
        lIIlIllIll[79] = (-((-2141) & 31838)) & (-13) & 32703;
        lIIlIllIll[80] = (-((-17577) & 26047)) & (-20481) & 32767;
        lIIlIllIll[81] = (-17409) & 20358;
        lIIlIllIll[82] = (-((-3721) & 28555)) & (-4097) & 32751;
        lIIlIllIll[83] = (-((-4385) & 30074)) & (-4131) & 32767;
        lIIlIllIll[84] = (-((-2225) & 23290)) & (-1) & 24159;
        lIIlIllIll[85] = (-8709) & 12199;
        lIIlIllIll[86] = 116 ^ 85;
    }

    private static String llllllllIlII(String llllllllllllllllllllllIlIIllllIl, String llllllllllllllllllllllIlIIllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllllIlIIllllII.getBytes(StandardCharsets.UTF_8)), lIIlIllIll[19]), "DES");
            Cipher llllllllllllllllllllllIlIIllllll = Cipher.getInstance("DES");
            llllllllllllllllllllllIlIIllllll.init(lIIlIllIll[4], secretKeySpec);
            return new String(llllllllllllllllllllllIlIIllllll.doFinal(Base64.getDecoder().decode(llllllllllllllllllllllIlIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllllIlIIlllllI) {
            llllllllllllllllllllllIlIIlllllI.printStackTrace();
            return null;
        }
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIlIllIlI[lIIlIllIll[75]];
    }

    private static boolean lIIIIIIIIIlll(Object obj) {
        return obj != null;
    }

    private static String llllllllIllI(String llllllllllllllllllllllIlIIllIIII, String llllllllllllllllllllllIlIIlIllll) {
        try {
            SecretKeySpec llllllllllllllllllllllIlIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllllIlIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllllIlIIllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllllllllIlIIllIIlI.init(lIIlIllIll[4], llllllllllllllllllllllIlIIllIIll);
            return new String(llllllllllllllllllllllIlIIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllllllIlIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllllIlIIllIIIl) {
            llllllllllllllllllllllIlIIllIIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lIIIIIIIIllII(Skills.getLevel(Skill.PRAYER), lIIlIllIll[3])) {
            ?? r0 = lIIlIllIll[2];
            "".length();
            return 0 != 0 ? ((((135 + 98) - 231) + 136) ^ (((9 + 159) - 73) + 93)) & (((((227 + 106) - 176) + 87) ^ (((152 + 91) - 214) + 165)) ^ (-" ".length())) : r0;
        }
        return lIIlIllIll[1];
    }

    private static boolean lIIIIIIIIIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIIIIIIlIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIIIIIIIlII(int i) {
        return i != 0;
    }

    static {
        lIIIIIIIIIIll();
        llllllllIlll();
        iJ = new WorldPoint(lIIlIllIll[77], lIIlIllIll[78], lIIlIllIll[1]);
        iK = new WorldPoint(lIIlIllIll[79], lIIlIllIll[80], lIIlIllIll[1]);
        iL = new WorldPoint(lIIlIllIll[81], lIIlIllIll[82], lIIlIllIll[1]);
        iM = new WorldPoint(lIIlIllIll[83], lIIlIllIll[44], lIIlIllIll[1]);
        iN = new WorldPoint(lIIlIllIll[1], lIIlIllIll[1], lIIlIllIll[1]);
        iO = new WorldPoint(lIIlIllIll[1], lIIlIllIll[1], lIIlIllIll[1]);
        iP = new WorldPoint(lIIlIllIll[84], lIIlIllIll[85], lIIlIllIll[1]);
        bv = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v310, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v334, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v53, types: [boolean] */
    public static void cB() {
        if (lIIIIIIIIIlII(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[1]];
            C0001b.a(bv);
            if (lIIIIIIIIIlIl(bv.size(), lIIlIllIll[2])) {
                System.out.println(lIIlIllIlI[lIIlIllIll[2]]);
                bt = lIIlIllIll[1];
            }
        }
        if (lIIIIIIIIIllI(bt ? 1 : 0) && lIIIIIIIIIlIl(Skills.getLevel(Skill.PRAYER), lIIlIllIll[3])) {
            if (lIIIIIIIIIllI(ab() ? 1 : 0) && lIIIIIIIIIlIl(Game.getWildyLevel(), lIIlIllIll[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIIIIIIIlll(nearest) && lIIIIIIIIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[4]];
                    C0000a.a(nearest);
                }
                if (lIIIIIIIIIlll(nearest) && lIIIIIIIIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[5]];
                    if (lIIIIIIIIIllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIllIll[6]);
                        "".length();
                    }
                    if (lIIIIIIIIIlII(Bank.isOpen() ? 1 : 0)) {
                        if (lIIIIIIIIlIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIllIll[7]);
                            "".length();
                        }
                        if (lIIIIIIIIlIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlIllIll[4]);
                            "".length();
                        }
                        int[] iArr = new int[lIIlIllIll[5]];
                        iArr[lIIlIllIll[1]] = lIIlIllIll[8];
                        iArr[lIIlIllIll[2]] = lIIlIllIll[0];
                        iArr[lIIlIllIll[4]] = lIIlIllIll[9];
                        if (lIIIIIIIIIllI(C0004e.b(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIIlIllIlI[lIIlIllIll[7]]);
                            bt = lIIlIllIll[2];
                            return;
                        }
                        int[] iArr2 = new int[lIIlIllIll[5]];
                        iArr2[lIIlIllIll[1]] = lIIlIllIll[8];
                        iArr2[lIIlIllIll[2]] = lIIlIllIll[0];
                        iArr2[lIIlIllIll[4]] = lIIlIllIll[9];
                        if (lIIIIIIIIIlII(C0004e.b(iArr2) ? 1 : 0)) {
                            if (lIIIIIIIIIllI(Equipment.contains(C0005f.ba) ? 1 : 0)) {
                                C0000a.b(C0005f.ba, lIIlIllIll[2]);
                            }
                            C0000a.b(C0005f.aV, lIIlIllIll[2]);
                            C0000a.a(lIIlIllIll[10], lIIlIllIll[11]);
                            C0000a.b(lIIlIllIll[0], lIIlIllIll[12]);
                        }
                    }
                }
            }
            if (lIIIIIIIIIlII(ab() ? 1 : 0)) {
                if (lIIIIIIIIIlII(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIIIIIIIIlIl(Movement.getRunEnergy(), lIIlIllIll[13])) {
                    Inventory.getFirst(C0005f.aV).interact(lIIlIllIlI[lIIlIllIll[14]]);
                    Time.sleepTicks(lIIlIllIll[2]);
                    "".length();
                }
                if (lIIIIIIIIIllI(Movement.isRunEnabled() ? 1 : 0) && lIIIIIIIIlIIl(Movement.getRunEnergy(), lIIlIllIll[15])) {
                    Movement.toggleRun();
                    Time.sleepTicks(lIIlIllIll[14]);
                    "".length();
                }
                if (lIIIIIIIIIlIl(Game.getWildyLevel(), lIIlIllIll[2])) {
                    AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[16]];
                    if (lIIIIIIIIIlII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (lIIIIIIIIIllI(Dialog.isOpen() ? 1 : 0) && lIIIIIIIIIlII(Inventory.contains(C0005f.ba) ? 1 : 0) && lIIIIIIIIlIlI(Players.getLocal().getAnimation(), lIIlIllIll[17])) {
                        Inventory.getFirst(C0005f.ba).interact(lIIlIllIlI[lIIlIllIll[18]]);
                        Time.sleepTicks(lIIlIllIll[4]);
                        "".length();
                    }
                    String[] strArr = new String[lIIlIllIll[4]];
                    strArr[lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[19]];
                    strArr[lIIlIllIll[2]] = lIIlIllIlI[lIIlIllIll[20]];
                    C0006g.a(strArr);
                }
                if (lIIIIIIIIlIII(Game.getWildyLevel())) {
                    int[] iArr3 = new int[lIIlIllIll[2]];
                    iArr3[lIIlIllIll[1]] = lIIlIllIll[0];
                    if (lIIIIIIIIIlII(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (lIIIIIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(iL), lIIlIllIll[21])) {
                            AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[22]];
                            WorldPoint[] worldPointArr = new WorldPoint[lIIlIllIll[21]];
                            worldPointArr[lIIlIllIll[1]] = new WorldPoint(lIIlIllIll[23], lIIlIllIll[24], lIIlIllIll[1]);
                            worldPointArr[lIIlIllIll[2]] = new WorldPoint(lIIlIllIll[25], lIIlIllIll[26], lIIlIllIll[1]);
                            worldPointArr[lIIlIllIll[4]] = new WorldPoint(lIIlIllIll[27], lIIlIllIll[28], lIIlIllIll[1]);
                            worldPointArr[lIIlIllIll[5]] = new WorldPoint(lIIlIllIll[29], lIIlIllIll[30], lIIlIllIll[1]);
                            worldPointArr[lIIlIllIll[7]] = new WorldPoint(lIIlIllIll[31], lIIlIllIll[32], lIIlIllIll[1]);
                            worldPointArr[lIIlIllIll[14]] = new WorldPoint(lIIlIllIll[33], lIIlIllIll[34], lIIlIllIll[1]);
                            worldPointArr[lIIlIllIll[16]] = new WorldPoint(lIIlIllIll[35], lIIlIllIll[36], lIIlIllIll[1]);
                            worldPointArr[lIIlIllIll[18]] = new WorldPoint(lIIlIllIll[37], lIIlIllIll[38], lIIlIllIll[1]);
                            worldPointArr[lIIlIllIll[19]] = new WorldPoint(lIIlIllIll[39], lIIlIllIll[38], lIIlIllIll[1]);
                            worldPointArr[lIIlIllIll[20]] = new WorldPoint(lIIlIllIll[40], lIIlIllIll[38], lIIlIllIll[1]);
                            worldPointArr[lIIlIllIll[22]] = new WorldPoint(lIIlIllIll[41], lIIlIllIll[38], lIIlIllIll[1]);
                            worldPointArr[lIIlIllIll[42]] = new WorldPoint(lIIlIllIll[43], lIIlIllIll[44], lIIlIllIll[1]);
                            worldPointArr[lIIlIllIll[45]] = new WorldPoint(lIIlIllIll[46], lIIlIllIll[44], lIIlIllIll[1]);
                            Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                            "".length();
                            Time.sleepTicks(lIIlIllIll[2]);
                            "".length();
                        }
                        if (lIIIIIIIIlIll(Players.getLocal().getWorldLocation().distanceTo(iL), lIIlIllIll[21])) {
                            AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[42]];
                            String[] strArr2 = new String[lIIlIllIll[2]];
                            strArr2[lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[45]];
                            TileObject nearest2 = TileObjects.getNearest(strArr2);
                            String[] strArr3 = new String[lIIlIllIll[2]];
                            strArr3[lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[21]];
                            TileObject nearest3 = TileObjects.getNearest(strArr3);
                            String[] strArr4 = new String[lIIlIllIll[2]];
                            strArr4[lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[47]];
                            if (lIIIIIIIIIlII(nearest3.hasAction(strArr4) ? 1 : 0)) {
                                nearest3.interact(lIIlIllIlI[lIIlIllIll[48]]);
                            }
                            if (lIIIIIIIIIlll(nearest2)) {
                                String[] strArr5 = new String[lIIlIllIll[2]];
                                strArr5[lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[49]];
                                if (lIIIIIIIIIllI(nearest3.hasAction(strArr5) ? 1 : 0)) {
                                    Skills.getExperience(Skill.PRAYER);
                                    int[] iArr4 = new int[lIIlIllIll[2]];
                                    iArr4[lIIlIllIll[1]] = lIIlIllIll[0];
                                    Item first = Inventory.getFirst(iArr4);
                                    String[] strArr6 = new String[lIIlIllIll[2]];
                                    strArr6[lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[50]];
                                    first.useOn(TileObjects.getNearest(strArr6));
                                    Time.sleepTicks(lIIlIllIll[2]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[lIIlIllIll[2]];
                    iArr5[lIIlIllIll[1]] = lIIlIllIll[0];
                    if (lIIIIIIIIIllI(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIIlIllIll[2]];
                        iArr6[lIIlIllIll[1]] = lIIlIllIll[51];
                        if (lIIIIIIIIIlII(Inventory.contains(iArr6) ? 1 : 0)) {
                            if (lIIIIIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(iL), lIIlIllIll[21])) {
                                AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[52]];
                                WorldPoint[] worldPointArr2 = new WorldPoint[lIIlIllIll[21]];
                                worldPointArr2[lIIlIllIll[1]] = new WorldPoint(lIIlIllIll[23], lIIlIllIll[24], lIIlIllIll[1]);
                                worldPointArr2[lIIlIllIll[2]] = new WorldPoint(lIIlIllIll[25], lIIlIllIll[26], lIIlIllIll[1]);
                                worldPointArr2[lIIlIllIll[4]] = new WorldPoint(lIIlIllIll[27], lIIlIllIll[28], lIIlIllIll[1]);
                                worldPointArr2[lIIlIllIll[5]] = new WorldPoint(lIIlIllIll[29], lIIlIllIll[30], lIIlIllIll[1]);
                                worldPointArr2[lIIlIllIll[7]] = new WorldPoint(lIIlIllIll[31], lIIlIllIll[32], lIIlIllIll[1]);
                                worldPointArr2[lIIlIllIll[14]] = new WorldPoint(lIIlIllIll[33], lIIlIllIll[34], lIIlIllIll[1]);
                                worldPointArr2[lIIlIllIll[16]] = new WorldPoint(lIIlIllIll[35], lIIlIllIll[36], lIIlIllIll[1]);
                                worldPointArr2[lIIlIllIll[18]] = new WorldPoint(lIIlIllIll[37], lIIlIllIll[38], lIIlIllIll[1]);
                                worldPointArr2[lIIlIllIll[19]] = new WorldPoint(lIIlIllIll[39], lIIlIllIll[38], lIIlIllIll[1]);
                                worldPointArr2[lIIlIllIll[20]] = new WorldPoint(lIIlIllIll[40], lIIlIllIll[38], lIIlIllIll[1]);
                                worldPointArr2[lIIlIllIll[22]] = new WorldPoint(lIIlIllIll[41], lIIlIllIll[38], lIIlIllIll[1]);
                                worldPointArr2[lIIlIllIll[42]] = new WorldPoint(lIIlIllIll[43], lIIlIllIll[44], lIIlIllIll[1]);
                                worldPointArr2[lIIlIllIll[45]] = new WorldPoint(lIIlIllIll[46], lIIlIllIll[44], lIIlIllIll[1]);
                                Walker.walkAlong(Arrays.asList(worldPointArr2), new HashMap());
                                "".length();
                                Time.sleepTicks(lIIlIllIll[2]);
                                "".length();
                            }
                            if (lIIIIIIIIlIll(Players.getLocal().getWorldLocation().distanceTo(iL), lIIlIllIll[21])) {
                                AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[53]];
                                if (!lIIIIIIIIIllI(Dialog.canLevelUpContinue() ? 1 : 0) || lIIIIIIIIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] strArr7 = new String[lIIlIllIll[2]];
                                strArr7[lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[15]];
                                NPC nearest4 = NPCs.getNearest(strArr7);
                                String[] strArr8 = new String[lIIlIllIll[2]];
                                strArr8[lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[54]];
                                TileObject nearest5 = TileObjects.getNearest(strArr8);
                                String[] strArr9 = new String[lIIlIllIll[2]];
                                strArr9[lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[55]];
                                if (lIIIIIIIIIlII(nearest5.hasAction(strArr9) ? 1 : 0)) {
                                    nearest5.interact(lIIlIllIlI[lIIlIllIll[56]]);
                                }
                                if (lIIIIIIIIIlll(nearest4)) {
                                    String[] strArr10 = new String[lIIlIllIll[2]];
                                    strArr10[lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[57]];
                                    if (lIIIIIIIIIllI(nearest5.hasAction(strArr10) ? 1 : 0)) {
                                        if (lIIIIIIIIIllI(Dialog.isOpen() ? 1 : 0)) {
                                            int[] iArr7 = new int[lIIlIllIll[2]];
                                            iArr7[lIIlIllIll[1]] = lIIlIllIll[51];
                                            Inventory.getFirst(iArr7).useOn(nearest4);
                                            Time.sleepTicks(lIIlIllIll[4]);
                                            "".length();
                                        }
                                        if (lIIIIIIIIIlII(Dialog.isOpen() ? 1 : 0)) {
                                            List options = Dialog.getOptions();
                                            if (lIIIIIIIIIllI(options.isEmpty() ? 1 : 0)) {
                                                int i = lIIlIllIll[1];
                                                while (lIIIIIIIIIlIl(i, options.size())) {
                                                    int[] iArr8 = new int[lIIlIllIll[2]];
                                                    iArr8[lIIlIllIll[1]] = lIIlIllIll[51];
                                                    if (lIIIIIIIIlIlI(((Item) Inventory.getAll(iArr8).get(lIIlIllIll[1])).getQuantity(), lIIlIllIll[2]) && lIIIIIIIIIlII(((Widget) options.get(i)).getText().contains(lIIlIllIlI[lIIlIllIll[58]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIIlIllIll[2]);
                                                        Time.sleepTicks(lIIlIllIll[4]);
                                                        "".length();
                                                    }
                                                    int[] iArr9 = new int[lIIlIllIll[2]];
                                                    iArr9[lIIlIllIll[1]] = lIIlIllIll[51];
                                                    if (lIIIIIIIIlIlI(((Item) Inventory.getAll(iArr9).get(lIIlIllIll[1])).getQuantity(), lIIlIllIll[14]) && lIIIIIIIIIlII(((Widget) options.get(i)).getText().contains(lIIlIllIlI[lIIlIllIll[59]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIIlIllIll[2]);
                                                        Time.sleepTicks(lIIlIllIll[4]);
                                                        "".length();
                                                    }
                                                    if (lIIIIIIIIIlII(((Widget) options.get(i)).getText().contains(lIIlIllIlI[lIIlIllIll[60]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIIlIllIll[2]);
                                                        Time.sleepTicks(lIIlIllIll[4]);
                                                        "".length();
                                                    }
                                                    i++;
                                                    "".length();
                                                    if ((-" ".length()) >= 0) {
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
            int[] iArr10 = new int[lIIlIllIll[2]];
            iArr10[lIIlIllIll[1]] = lIIlIllIll[10];
            if (lIIIIIIIIIlII(Inventory.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lIIlIllIll[2]];
                iArr11[lIIlIllIll[1]] = lIIlIllIll[0];
                if (!lIIIIIIIIIllI(Inventory.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[lIIlIllIll[2]];
                iArr12[lIIlIllIll[1]] = lIIlIllIll[51];
                if (!lIIIIIIIIIllI(Inventory.contains(iArr12) ? 1 : 0)) {
                    return;
                }
            }
            if (lIIIIIIIIlIll(Players.getLocal().getWorldLocation().distanceTo(iL), lIIlIllIll[21])) {
                AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[61]];
                String[] strArr11 = new String[lIIlIllIll[2]];
                strArr11[lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[62]];
                TileItem nearest6 = TileItems.getNearest(strArr11);
                if (lIIIIIIIIIlll(nearest6)) {
                    nearest6.interact(lIIlIllIlI[lIIlIllIll[63]]);
                }
            }
        }
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            cB();
            "".length();
            if (" ".length() < " ".length()) {
                return ((69 ^ 115) ^ (109 ^ 98)) & (((34 ^ 1) ^ (58 ^ 32)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIlIllIll[74];
    }

    private static String llllllllIlIl(String llllllllllllllllllllllIlIlIlIIlI, String llllllllllllllllllllllIlIlIlIIIl) {
        String llllllllllllllllllllllIlIlIlIIlI2 = new String(Base64.getDecoder().decode(llllllllllllllllllllllIlIlIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllllllllIlIlIIllll = llllllllllllllllllllllIlIlIlIIIl.toCharArray();
        int llllllllllllllllllllllIlIlIIlllI = lIIlIllIll[1];
        char[] charArray = llllllllllllllllllllllIlIlIlIIlI2.toCharArray();
        int length = charArray.length;
        int i = lIIlIllIll[1];
        while (lIIIIIIIIIlIl(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllllllllllIlIlIIllll[llllllllllllllllllllllIlIlIIlllI % llllllllllllllllllllllIlIlIIllll.length]));
            "".length();
            llllllllllllllllllllllIlIlIIlllI++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIIIIIIlIlI(int i, int i2) {
        return i == i2;
    }
}
