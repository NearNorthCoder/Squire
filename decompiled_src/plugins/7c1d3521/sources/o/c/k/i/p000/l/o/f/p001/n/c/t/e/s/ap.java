package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.ap  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/ap.class */
public class ap implements InterfaceC0003ac {
    private static /* synthetic */ int[] llIIIIlIlI;
    public static /* synthetic */ List<C0017d> bv;
    private static /* synthetic */ String[] llIIIIlIIl;
    static final /* synthetic */ WorldPoint nD;
    private final /* synthetic */ int nG = llIIIIlIlI[0];
    static final /* synthetic */ WorldPoint nF;
    public static final /* synthetic */ WorldPoint nC;
    public static final /* synthetic */ WorldPoint nB;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldPoint nA;
    static final /* synthetic */ WorldPoint nE;
    public static final /* synthetic */ WorldPoint nz;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
        if (lIlIIlIIIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean an() {
        int[] iArr = new int[llIIIIlIlI[2]];
        iArr[llIIIIlIlI[1]] = llIIIIlIlI[10];
        if (lIlIIlIIIIIII(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llIIIIlIlI[2]];
            iArr2[llIIIIlIlI[1]] = llIIIIlIlI[10];
            if (lIlIIlIIIlIII(Inventory.getFirst(iArr2).getQuantity(), llIIIIlIlI[13])) {
                if (lIlIIlIIIIIlI(Inventory.contains(C0019f.bf) ? 1 : 0)) {
                    if (lIlIIlIIIIIII(Equipment.contains(C0019f.bf) ? 1 : 0)) {
                        int[] iArr3 = new int[llIIIIlIlI[2]];
                        iArr3[llIIIIlIlI[1]] = llIIIIlIlI[0];
                        if (lIlIIlIIIIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIIIIlIlI[2]];
                            iArr4[llIIIIlIlI[1]] = llIIIIlIlI[51];
                        }
                    }
                }
                ?? r0 = llIIIIlIlI[2];
                "".length();
                return "  ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return llIIIIlIlI[1];
    }

    private static void lIlIIIllllllI() {
        llIIIIlIIl = new String[llIIIIlIlI[86]];
        llIIIIlIIl[llIIIIlIlI[1]] = lIlIIIllllIll("JBEjOSABRDMkKwsX", "fdZPN");
        llIIIIlIIl[llIIIIlIlI[2]] = lIlIIIlllllII("rmDUCmoLCB3GVppbBnlJAWoIPZZFY7j8/a+YMa35ktjp7xa3lEeoFsxpkFhxBez2", "UAtOz");
        llIIIIlIIl[llIIIIlIlI[4]] = lIlIIIlllllIl("r2nw6czy6RF8jzFnyFcXnc04xSVDk6nJ", "NQgDr");
        llIIIIlIIl[llIIIIlIlI[5]] = lIlIIIlllllII("NoB3bYCAsn/UmG6fVleUBZawoVBAlYLa", "gATWb");
        llIIIIlIIl[llIIIIlIlI[7]] = lIlIIIlllllII("NoZMtKCrI7fzGS+298OfQiNvRLL+lscR/6c+vANK4lpQgXRbYR79YXuobEV4Tq9uc5aXpjzyQfw=", "eiOTw");
        llIIIIlIIl[llIIIIlIlI[14]] = lIlIIIlllllII("BFvCqkTuNQI=", "UuAes");
        llIIIIlIIl[llIIIIlIlI[16]] = lIlIIIlllllIl("5JnbT/dE0k6jupwUWm4Vdg==", "ztjes");
        llIIIIlIIl[llIIIIlIlI[18]] = lIlIIIlllllII("px/Q9lAgLlQ=", "ptxaW");
        llIIIIlIIl[llIIIIlIlI[19]] = lIlIIIlllllII("NnaG9T7TtO/aPRBBp5vX+w==", "WOwCH");
        llIIIIlIIl[llIIIIlIlI[20]] = lIlIIIllllIll("JwwuCkNIEyofChgIPQdPHAhvHwoeAiNTW1lHGBoDDAI9HQobFGE=", "hgOso");
        llIIIIlIIl[llIIIIlIlI[22]] = lIlIIIllllIll("BSwuSDgkbTkEOCo/", "KMXhL");
        llIIIIlIIl[llIIIIlIlI[42]] = lIlIIIlllllII("SOeyWOQzHQy2YaysRcHyow==", "cGYWD");
        llIIIIlIIl[llIIIIlIlI[45]] = lIlIIIllllIll("DB4lHyFvFygEMz0=", "OvDpR");
        llIIIIlIIl[llIIIIlIlI[21]] = lIlIIIllllIll("FBkWKjN4HAsiJA==", "XxdMV");
        llIIIIlIIl[llIIIIlIlI[47]] = lIlIIIlllllII("rfCJZCHS7sw=", "mTrpm");
        llIIIIlIIl[llIIIIlIlI[48]] = lIlIIIllllIll("PQYuBQ==", "rvKkB");
        llIIIIlIIl[llIIIIlIlI[49]] = lIlIIIlllllII("vHcnx0JztRA=", "FOJJd");
        llIIIIlIIl[llIIIIlIlI[50]] = lIlIIIlllllII("YHSt1li+rOlqwkdDcJ7XKw==", "unDCT");
        llIIIIlIIl[llIIIIlIlI[52]] = lIlIIIllllIll("HjkgaQc/eDclBzEq", "PXVIs");
        llIIIIlIIl[llIIIIlIlI[53]] = lIlIIIlllllIl("GicDQ+5aZ+NfkwhFX97w4A==", "wREXA");
        llIIIIlIIl[llIIIIlIlI[15]] = lIlIIIlllllIl("hQtMkVtOKY6th0iYe16U+wWvVgawSp57", "ivsyr");
        llIIIIlIIl[llIIIIlIlI[54]] = lIlIIIlllllII("VypfB1MlVNBqJVRl+3vVFw==", "BDjuP");
        llIIIIlIIl[llIIIIlIlI[55]] = lIlIIIlllllII("sMnX8zMrj8o=", "AJyCk");
        llIIIIlIIl[llIIIIlIlI[56]] = lIlIIIlllllII("mcjN7Z9PUf4=", "KkSwl");
        llIIIIlIIl[llIIIIlIlI[57]] = lIlIIIlllllIl("PmkrdetiKZo=", "rNNES");
        llIIIIlIIl[llIIIIlIlI[58]] = lIlIIIlllllIl("WGUxYJgHzSzOTrlsaeukwQ==", "hzfId");
        llIIIIlIIl[llIIIIlIlI[59]] = lIlIIIlllllII("IrerSTATcY/nljYMUwB3bQ==", "wQbrQ");
        llIIIIlIIl[llIIIIlIlI[60]] = lIlIIIlllllIl("hDEZoFu+yRSzjODGu2y84Q==", "FOBSe");
        llIIIIlIIl[llIIIIlIlI[61]] = lIlIIIlllllII("CgLufw17BbToYYRIO8RtKQ==", "NGirE");
        llIIIIlIIl[llIIIIlIlI[62]] = lIlIIIlllllIl("Opurv7FWxrBU95ImfSPQAQ==", "JDDwr");
        llIIIIlIIl[llIIIIlIlI[63]] = lIlIIIlllllII("Iyz1mlpsL/o=", "piBav");
        llIIIIlIIl[llIIIIlIlI[75]] = lIlIIIlllllIl("Q2W6RRaadV1y5dHRpXDVFg==", "WhwHZ");
        llIIIIlIIl[llIIIIlIlI[76]] = lIlIIIlllllIl("dkOE7Teyh450NOTtIde4jKebbXx9rDKC", "OVmLH");
    }

    private static boolean lIlIIlIIIlIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIIlIIIIlIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIIlIIIIllI(int i, int i2) {
        return i == i2;
    }

    private static String lIlIIIlllllII(String llllllllllllllllllIllIIllIllIlIl, String llllllllllllllllllIllIIllIllIlII) {
        try {
            SecretKeySpec llllllllllllllllllIllIIllIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllIIllIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIllIIllIllIlll = Cipher.getInstance("Blowfish");
            llllllllllllllllllIllIIllIllIlll.init(llIIIIlIlI[4], llllllllllllllllllIllIIllIlllIII);
            return new String(llllllllllllllllllIllIIllIllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllIIllIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllIIllIllIllI) {
            llllllllllllllllllIllIIllIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIIlll(int i, int i2) {
        return i <= i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIIIlIIl[llIIIIlIlI[75]];
    }

    private static void lIlIIIlllllll() {
        llIIIIlIlI = new int[87];
        llIIIIlIlI[0] = (-29159) & 29694;
        llIIIIlIlI[1] = ((210 ^ 194) ^ (159 ^ 181)) & (((((71 + 58) - (-48)) + 13) ^ (((90 + 49) - 45) + 38)) ^ (-" ".length()));
        llIIIIlIlI[2] = " ".length();
        llIIIIlIlI[3] = (187 ^ 160) ^ (111 ^ 89);
        llIIIIlIlI[4] = "  ".length();
        llIIIIlIlI[5] = "   ".length();
        llIIIIlIlI[6] = (-((-1539) & 28247)) & (-1025) & 32732;
        llIIIIlIlI[7] = 166 ^ 162;
        llIIIIlIlI[8] = (-9489) & 30654;
        llIIIIlIlI[9] = (-((-9569) & 12141)) & (-1155) & 16351;
        llIIIIlIlI[10] = (-5149) & 6143;
        llIIIIlIlI[11] = (-((-2353) & 24506)) & (-17) & 32669;
        llIIIIlIlI[12] = (((((64 + 55) - 10) + 68) + (160 ^ 175)) - (197 ^ 172)) + (123 ^ 10);
        llIIIIlIlI[13] = 4 ^ 54;
        llIIIIlIlI[14] = 165 ^ 160;
        llIIIIlIlI[15] = (116 ^ 2) ^ (77 ^ 47);
        llIIIIlIlI[16] = 180 ^ 178;
        llIIIIlIlI[17] = -" ".length();
        llIIIIlIlI[18] = 154 ^ 157;
        llIIIIlIlI[19] = 170 ^ 162;
        llIIIIlIlI[20] = 26 ^ 19;
        llIIIIlIlI[21] = (((79 + 91) - 69) + 83) ^ (((132 + 175) - 242) + 116);
        llIIIIlIlI[22] = (54 ^ 51) ^ (107 ^ 100);
        llIIIIlIlI[23] = (-((-6685) & 24127)) & (-12289) & 32758;
        llIIIIlIlI[24] = (-24806) & 28647;
        llIIIIlIlI[25] = (-((-541) & 21054)) & (-5) & 23543;
        llIIIIlIlI[26] = (-(89 ^ 92)) & (-257) & 4095;
        llIIIIlIlI[27] = (-8209) & 11227;
        llIIIIlIlI[28] = (-(76 ^ 73)) & (-20483) & 24318;
        llIIIIlIlI[29] = (-((-6885) & 24309)) & (-41) & 20479;
        llIIIIlIlI[30] = (-((-137) & 29067)) & (-9) & 32767;
        llIIIIlIlI[31] = (-21554) & 24563;
        llIIIIlIlI[32] = (-((-12273) & 16381)) & (-8449) & 16381;
        llIIIIlIlI[33] = (-4161) & 7165;
        llIIIIlIlI[34] = (-8465) & 12286;
        llIIIIlIlI[35] = (-5185) & 8183;
        llIIIIlIlI[36] = (-22) & 3839;
        llIIIIlIlI[37] = (-21521) & 24511;
        llIIIIlIlI[38] = (-((-2563) & 6679)) & (-8193) & 16127;
        llIIIIlIlI[39] = (-(75 ^ 66)) & (-20561) & 23551;
        llIIIIlIlI[40] = (-((-11162) & 12217)) & (-28673) & 32703;
        llIIIIlIlI[41] = (-8262) & 11231;
        llIIIIlIlI[42] = 106 ^ 97;
        llIIIIlIlI[43] = (-((-731) & 14075)) & (-16389) & 32695;
        llIIIIlIlI[44] = (-24596) & 28415;
        llIIIIlIlI[45] = 20 ^ 24;
        llIIIIlIlI[46] = (-24641) & 27599;
        llIIIIlIlI[47] = (((37 + 128) - 97) + 70) ^ (((131 + 93) - 150) + 58);
        llIIIIlIlI[48] = " ".length() ^ (161 ^ 175);
        llIIIIlIlI[49] = (171 ^ 185) ^ "  ".length();
        llIIIIlIlI[50] = (139 ^ 151) ^ (107 ^ 102);
        llIIIIlIlI[51] = (-((-8733) & 28349)) & (-12547) & 32699;
        llIIIIlIlI[52] = (((143 + 58) - 84) + 42) ^ (((75 + 38) - (-14)) + 14);
        llIIIIlIlI[53] = 18 ^ 1;
        llIIIIlIlI[54] = 162 ^ 183;
        llIIIIlIlI[55] = 180 ^ 162;
        llIIIIlIlI[56] = 95 ^ 72;
        llIIIIlIlI[57] = 24 ^ 0;
        llIIIIlIlI[58] = 9 ^ 16;
        llIIIIlIlI[59] = 181 ^ 175;
        llIIIIlIlI[60] = 123 ^ 96;
        llIIIIlIlI[61] = (70 ^ 65) ^ (20 ^ 15);
        llIIIIlIlI[62] = (((105 + 163) - 112) + 16) ^ (((139 + 100) - 65) + 3);
        llIIIIlIlI[63] = 181 ^ 171;
        llIIIIlIlI[64] = (-5391) & 8190;
        llIIIIlIlI[65] = (-20786) & 32765;
        llIIIIlIlI[66] = (-1107) & 26106;
        llIIIIlIlI[67] = (-41) & 8047;
        llIIIIlIlI[68] = 93 ^ 117;
        llIIIIlIlI[69] = (-((-4325) & 7415)) & (-4106) & 8095;
        llIIIIlIlI[70] = (-4641) & 278382;
        llIIIIlIlI[71] = 9 ^ 53;
        llIIIIlIlI[72] = (-((-27207) & 32383)) & (-25089) & 30714;
        llIIIIlIlI[73] = (-((-6689) & 7991)) & (-2561) & 65374;
        llIIIIlIlI[74] = 57 ^ 93;
        llIIIIlIlI[75] = (126 ^ 22) ^ (181 ^ 194);
        llIIIIlIlI[76] = 40 ^ 8;
        llIIIIlIlI[77] = (-((-11157) & 15285)) & (-16387) & 23543;
        llIIIIlIlI[78] = (-(113 ^ 16)) & (-12444) & 16383;
        llIIIIlIlI[79] = (-((-31225) & 32249)) & (-4097) & 8114;
        llIIIIlIlI[80] = (-((-11465) & 15565)) & (-16643) & 24559;
        llIIIIlIlI[81] = (-((-2371) & 22867)) & (-1089) & 24534;
        llIIIIlIlI[82] = (-(76 ^ 93)) & (-20737) & 24573;
        llIIIIlIlI[83] = (-25644) & 28591;
        llIIIIlIlI[84] = (-((-3157) & 24286)) & (-8193) & 32415;
        llIIIIlIlI[85] = (-8257) & 11747;
        llIIIIlIlI[86] = (15 ^ 66) ^ (112 ^ 28);
    }

    private static int fZ() {
        return (lIlIIlIIIIIIl(Skills.getLevel(Skill.PRAYER), llIIIIlIlI[71]) && lIlIIlIIIlIII(Skills.getLevel(Skill.PRAYER), llIIIIlIlI[3])) ? ((llIIIIlIlI[70] - Skills.getExperience(Skill.PRAYER)) / llIIIIlIlI[72]) + llIIIIlIlI[22] : ((llIIIIlIlI[73] - Skills.getExperience(Skill.PRAYER)) / llIIIIlIlI[72]) + llIIIIlIlI[63];
    }

    static {
        lIlIIIlllllll();
        lIlIIIllllllI();
        nz = new WorldPoint(llIIIIlIlI[77], llIIIIlIlI[78], llIIIIlIlI[1]);
        nA = new WorldPoint(llIIIIlIlI[79], llIIIIlIlI[80], llIIIIlIlI[1]);
        nB = new WorldPoint(llIIIIlIlI[81], llIIIIlIlI[82], llIIIIlIlI[1]);
        nC = new WorldPoint(llIIIIlIlI[83], llIIIIlIlI[44], llIIIIlIlI[1]);
        nD = new WorldPoint(llIIIIlIlI[1], llIIIIlIlI[1], llIIIIlIlI[1]);
        nE = new WorldPoint(llIIIIlIlI[1], llIIIIlIlI[1], llIIIIlIlI[1]);
        nF = new WorldPoint(llIIIIlIlI[84], llIIIIlIlI[85], llIIIIlIlI[1]);
        bv = new ArrayList();
    }

    private static boolean lIlIIlIIIIIll(Object obj) {
        return obj != null;
    }

    private static String lIlIIIllllIll(String llllllllllllllllllIllIIlllIIlIlI, String llllllllllllllllllIllIIlllIIlIIl) {
        String llllllllllllllllllIllIIlllIIlIlI2 = new String(Base64.getDecoder().decode(llllllllllllllllllIllIIlllIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIllIIlllIIlIII = new StringBuilder();
        char[] llllllllllllllllllIllIIlllIIIlll = llllllllllllllllllIllIIlllIIlIIl.toCharArray();
        int llllllllllllllllllIllIIlllIIIllI = llIIIIlIlI[1];
        char[] charArray = llllllllllllllllllIllIIlllIIlIlI2.toCharArray();
        int length = charArray.length;
        int i = llIIIIlIlI[1];
        while (lIlIIlIIIIIIl(i, length)) {
            char llllllllllllllllllIllIIlllIIlIll = charArray[i];
            llllllllllllllllllIllIIlllIIlIII.append((char) (llllllllllllllllllIllIIlllIIlIll ^ llllllllllllllllllIllIIlllIIIlll[llllllllllllllllllIllIIlllIIIllI % llllllllllllllllllIllIIlllIIIlll.length]));
            "".length();
            llllllllllllllllllIllIIlllIIIllI++;
            i++;
            "".length();
            if (((184 ^ 167) & ((125 ^ 98) ^ (-1))) >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIllIIlllIIlIII);
    }

    private static boolean lIlIIlIIIIIII(int i) {
        return i != 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            fY();
            "".length();
            if (("   ".length() & ("   ".length() ^ (-" ".length()))) != 0) {
                return ((152 ^ 170) ^ (173 ^ 189)) & (((((147 + 90) - 181) + 111) ^ (((23 + 68) - (-20)) + 22)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIIIIlIlI[74];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v309, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v333, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v53, types: [boolean] */
    public static void fY() {
        if (lIlIIlIIIIIII(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[1]];
            C0015b.a(bv);
            if (lIlIIlIIIIIIl(bv.size(), llIIIIlIlI[2])) {
                System.out.println(llIIIIlIIl[llIIIIlIlI[2]]);
                bt = llIIIIlIlI[1];
            }
        }
        if (lIlIIlIIIIIlI(bt ? 1 : 0) && lIlIIlIIIIIIl(Skills.getLevel(Skill.PRAYER), llIIIIlIlI[3])) {
            if (lIlIIlIIIIIlI(an() ? 1 : 0) && lIlIIlIIIIIIl(Game.getWildyLevel(), llIIIIlIlI[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIlIIIIIll(nearest) && lIlIIlIIIIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[4]];
                    C0000a.a(nearest);
                }
                if (lIlIIlIIIIIll(nearest) && lIlIIlIIIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[5]];
                    if (lIlIIlIIIIIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIIIlIlI[6]);
                        "".length();
                    }
                    if (lIlIIlIIIIIII(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIlIIIIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIIIlIlI[7]);
                            "".length();
                        }
                        if (lIlIIlIIIIlII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIIIlIlI[4]);
                            "".length();
                        }
                        int[] iArr = new int[llIIIIlIlI[5]];
                        iArr[llIIIIlIlI[1]] = llIIIIlIlI[8];
                        iArr[llIIIIlIlI[2]] = llIIIIlIlI[0];
                        iArr[llIIIIlIlI[4]] = llIIIIlIlI[9];
                        if (lIlIIlIIIIIlI(C0018e.c(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(llIIIIlIIl[llIIIIlIlI[7]]);
                            bt = llIIIIlIlI[2];
                            return;
                        }
                        int[] iArr2 = new int[llIIIIlIlI[5]];
                        iArr2[llIIIIlIlI[1]] = llIIIIlIlI[8];
                        iArr2[llIIIIlIlI[2]] = llIIIIlIlI[0];
                        iArr2[llIIIIlIlI[4]] = llIIIIlIlI[9];
                        if (lIlIIlIIIIIII(C0018e.c(iArr2) ? 1 : 0)) {
                            if (lIlIIlIIIIIlI(Equipment.contains(C0019f.bf) ? 1 : 0)) {
                                C0000a.b(C0019f.bf, llIIIIlIlI[2]);
                            }
                            C0000a.b(C0019f.ba, llIIIIlIlI[2]);
                            C0000a.a(llIIIIlIlI[10], llIIIIlIlI[11]);
                            C0000a.b(llIIIIlIlI[0], llIIIIlIlI[12]);
                        }
                    }
                }
            }
            if (lIlIIlIIIIIII(an() ? 1 : 0)) {
                if (lIlIIlIIIIIII(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlIIlIIIIIIl(Movement.getRunEnergy(), llIIIIlIlI[13])) {
                    Inventory.getFirst(C0019f.ba).interact(llIIIIlIIl[llIIIIlIlI[14]]);
                    Time.sleepTicks(llIIIIlIlI[2]);
                    "".length();
                }
                if (lIlIIlIIIIIlI(Movement.isRunEnabled() ? 1 : 0) && lIlIIlIIIIlIl(Movement.getRunEnergy(), llIIIIlIlI[15])) {
                    Movement.toggleRun();
                    Time.sleepTicks(llIIIIlIlI[14]);
                    "".length();
                }
                if (lIlIIlIIIIIIl(Game.getWildyLevel(), llIIIIlIlI[2])) {
                    AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[16]];
                    if (lIlIIlIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (lIlIIlIIIIIlI(Dialog.isOpen() ? 1 : 0) && lIlIIlIIIIIII(Inventory.contains(C0019f.bf) ? 1 : 0) && lIlIIlIIIIllI(Players.getLocal().getAnimation(), llIIIIlIlI[17])) {
                        Inventory.getFirst(C0019f.bf).interact(llIIIIlIIl[llIIIIlIlI[18]]);
                        Time.sleepTicks(llIIIIlIlI[4]);
                        "".length();
                    }
                    String[] strArr = new String[llIIIIlIlI[4]];
                    strArr[llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[19]];
                    strArr[llIIIIlIlI[2]] = llIIIIlIIl[llIIIIlIlI[20]];
                    C0020g.a(strArr);
                }
                if (lIlIIlIIIIlII(Game.getWildyLevel())) {
                    int[] iArr3 = new int[llIIIIlIlI[2]];
                    iArr3[llIIIIlIlI[1]] = llIIIIlIlI[0];
                    if (lIlIIlIIIIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (lIlIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                            AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[22]];
                            WorldPoint[] worldPointArr = new WorldPoint[llIIIIlIlI[21]];
                            worldPointArr[llIIIIlIlI[1]] = new WorldPoint(llIIIIlIlI[23], llIIIIlIlI[24], llIIIIlIlI[1]);
                            worldPointArr[llIIIIlIlI[2]] = new WorldPoint(llIIIIlIlI[25], llIIIIlIlI[26], llIIIIlIlI[1]);
                            worldPointArr[llIIIIlIlI[4]] = new WorldPoint(llIIIIlIlI[27], llIIIIlIlI[28], llIIIIlIlI[1]);
                            worldPointArr[llIIIIlIlI[5]] = new WorldPoint(llIIIIlIlI[29], llIIIIlIlI[30], llIIIIlIlI[1]);
                            worldPointArr[llIIIIlIlI[7]] = new WorldPoint(llIIIIlIlI[31], llIIIIlIlI[32], llIIIIlIlI[1]);
                            worldPointArr[llIIIIlIlI[14]] = new WorldPoint(llIIIIlIlI[33], llIIIIlIlI[34], llIIIIlIlI[1]);
                            worldPointArr[llIIIIlIlI[16]] = new WorldPoint(llIIIIlIlI[35], llIIIIlIlI[36], llIIIIlIlI[1]);
                            worldPointArr[llIIIIlIlI[18]] = new WorldPoint(llIIIIlIlI[37], llIIIIlIlI[38], llIIIIlIlI[1]);
                            worldPointArr[llIIIIlIlI[19]] = new WorldPoint(llIIIIlIlI[39], llIIIIlIlI[38], llIIIIlIlI[1]);
                            worldPointArr[llIIIIlIlI[20]] = new WorldPoint(llIIIIlIlI[40], llIIIIlIlI[38], llIIIIlIlI[1]);
                            worldPointArr[llIIIIlIlI[22]] = new WorldPoint(llIIIIlIlI[41], llIIIIlIlI[38], llIIIIlIlI[1]);
                            worldPointArr[llIIIIlIlI[42]] = new WorldPoint(llIIIIlIlI[43], llIIIIlIlI[44], llIIIIlIlI[1]);
                            worldPointArr[llIIIIlIlI[45]] = new WorldPoint(llIIIIlIlI[46], llIIIIlIlI[44], llIIIIlIlI[1]);
                            Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                            "".length();
                            Time.sleepTicks(llIIIIlIlI[2]);
                            "".length();
                        }
                        if (lIlIIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                            AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[42]];
                            String[] strArr2 = new String[llIIIIlIlI[2]];
                            strArr2[llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[45]];
                            TileObject nearest2 = TileObjects.getNearest(strArr2);
                            String[] strArr3 = new String[llIIIIlIlI[2]];
                            strArr3[llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[21]];
                            TileObject nearest3 = TileObjects.getNearest(strArr3);
                            String[] strArr4 = new String[llIIIIlIlI[2]];
                            strArr4[llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[47]];
                            if (lIlIIlIIIIIII(nearest3.hasAction(strArr4) ? 1 : 0)) {
                                nearest3.interact(llIIIIlIIl[llIIIIlIlI[48]]);
                            }
                            if (lIlIIlIIIIIll(nearest2)) {
                                String[] strArr5 = new String[llIIIIlIlI[2]];
                                strArr5[llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[49]];
                                if (lIlIIlIIIIIlI(nearest3.hasAction(strArr5) ? 1 : 0)) {
                                    Skills.getExperience(Skill.PRAYER);
                                    int[] iArr4 = new int[llIIIIlIlI[2]];
                                    iArr4[llIIIIlIlI[1]] = llIIIIlIlI[0];
                                    Item first = Inventory.getFirst(iArr4);
                                    String[] strArr6 = new String[llIIIIlIlI[2]];
                                    strArr6[llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[50]];
                                    first.useOn(TileObjects.getNearest(strArr6));
                                    Time.sleepTicks(llIIIIlIlI[2]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[llIIIIlIlI[2]];
                    iArr5[llIIIIlIlI[1]] = llIIIIlIlI[0];
                    if (lIlIIlIIIIIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[llIIIIlIlI[2]];
                        iArr6[llIIIIlIlI[1]] = llIIIIlIlI[51];
                        if (lIlIIlIIIIIII(Inventory.contains(iArr6) ? 1 : 0)) {
                            if (lIlIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                                AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[52]];
                                WorldPoint[] worldPointArr2 = new WorldPoint[llIIIIlIlI[21]];
                                worldPointArr2[llIIIIlIlI[1]] = new WorldPoint(llIIIIlIlI[23], llIIIIlIlI[24], llIIIIlIlI[1]);
                                worldPointArr2[llIIIIlIlI[2]] = new WorldPoint(llIIIIlIlI[25], llIIIIlIlI[26], llIIIIlIlI[1]);
                                worldPointArr2[llIIIIlIlI[4]] = new WorldPoint(llIIIIlIlI[27], llIIIIlIlI[28], llIIIIlIlI[1]);
                                worldPointArr2[llIIIIlIlI[5]] = new WorldPoint(llIIIIlIlI[29], llIIIIlIlI[30], llIIIIlIlI[1]);
                                worldPointArr2[llIIIIlIlI[7]] = new WorldPoint(llIIIIlIlI[31], llIIIIlIlI[32], llIIIIlIlI[1]);
                                worldPointArr2[llIIIIlIlI[14]] = new WorldPoint(llIIIIlIlI[33], llIIIIlIlI[34], llIIIIlIlI[1]);
                                worldPointArr2[llIIIIlIlI[16]] = new WorldPoint(llIIIIlIlI[35], llIIIIlIlI[36], llIIIIlIlI[1]);
                                worldPointArr2[llIIIIlIlI[18]] = new WorldPoint(llIIIIlIlI[37], llIIIIlIlI[38], llIIIIlIlI[1]);
                                worldPointArr2[llIIIIlIlI[19]] = new WorldPoint(llIIIIlIlI[39], llIIIIlIlI[38], llIIIIlIlI[1]);
                                worldPointArr2[llIIIIlIlI[20]] = new WorldPoint(llIIIIlIlI[40], llIIIIlIlI[38], llIIIIlIlI[1]);
                                worldPointArr2[llIIIIlIlI[22]] = new WorldPoint(llIIIIlIlI[41], llIIIIlIlI[38], llIIIIlIlI[1]);
                                worldPointArr2[llIIIIlIlI[42]] = new WorldPoint(llIIIIlIlI[43], llIIIIlIlI[44], llIIIIlIlI[1]);
                                worldPointArr2[llIIIIlIlI[45]] = new WorldPoint(llIIIIlIlI[46], llIIIIlIlI[44], llIIIIlIlI[1]);
                                Walker.walkAlong(Arrays.asList(worldPointArr2), new HashMap());
                                "".length();
                                Time.sleepTicks(llIIIIlIlI[2]);
                                "".length();
                            }
                            if (lIlIIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                                AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[53]];
                                if (!lIlIIlIIIIIlI(Dialog.canLevelUpContinue() ? 1 : 0) || lIlIIlIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] strArr7 = new String[llIIIIlIlI[2]];
                                strArr7[llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[15]];
                                NPC nearest4 = NPCs.getNearest(strArr7);
                                String[] strArr8 = new String[llIIIIlIlI[2]];
                                strArr8[llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[54]];
                                TileObject nearest5 = TileObjects.getNearest(strArr8);
                                String[] strArr9 = new String[llIIIIlIlI[2]];
                                strArr9[llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[55]];
                                if (lIlIIlIIIIIII(nearest5.hasAction(strArr9) ? 1 : 0)) {
                                    nearest5.interact(llIIIIlIIl[llIIIIlIlI[56]]);
                                }
                                if (lIlIIlIIIIIll(nearest4)) {
                                    String[] strArr10 = new String[llIIIIlIlI[2]];
                                    strArr10[llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[57]];
                                    if (lIlIIlIIIIIlI(nearest5.hasAction(strArr10) ? 1 : 0)) {
                                        if (lIlIIlIIIIIlI(Dialog.isOpen() ? 1 : 0)) {
                                            int[] iArr7 = new int[llIIIIlIlI[2]];
                                            iArr7[llIIIIlIlI[1]] = llIIIIlIlI[51];
                                            Inventory.getFirst(iArr7).useOn(nearest4);
                                            Time.sleepTicks(llIIIIlIlI[4]);
                                            "".length();
                                        }
                                        if (lIlIIlIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                                            List options = Dialog.getOptions();
                                            if (lIlIIlIIIIIlI(options.isEmpty() ? 1 : 0)) {
                                                int i = llIIIIlIlI[1];
                                                while (lIlIIlIIIIIIl(i, options.size())) {
                                                    int[] iArr8 = new int[llIIIIlIlI[2]];
                                                    iArr8[llIIIIlIlI[1]] = llIIIIlIlI[51];
                                                    if (lIlIIlIIIIllI(((Item) Inventory.getAll(iArr8).get(llIIIIlIlI[1])).getQuantity(), llIIIIlIlI[2]) && lIlIIlIIIIIII(((Widget) options.get(i)).getText().contains(llIIIIlIIl[llIIIIlIlI[58]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) llIIIIlIlI[2]);
                                                        Time.sleepTicks(llIIIIlIlI[4]);
                                                        "".length();
                                                    }
                                                    int[] iArr9 = new int[llIIIIlIlI[2]];
                                                    iArr9[llIIIIlIlI[1]] = llIIIIlIlI[51];
                                                    if (lIlIIlIIIIllI(((Item) Inventory.getAll(iArr9).get(llIIIIlIlI[1])).getQuantity(), llIIIIlIlI[14]) && lIlIIlIIIIIII(((Widget) options.get(i)).getText().contains(llIIIIlIIl[llIIIIlIlI[59]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) llIIIIlIlI[2]);
                                                        Time.sleepTicks(llIIIIlIlI[4]);
                                                        "".length();
                                                    }
                                                    if (lIlIIlIIIIIII(((Widget) options.get(i)).getText().contains(llIIIIlIIl[llIIIIlIlI[60]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) llIIIIlIlI[2]);
                                                        Time.sleepTicks(llIIIIlIlI[4]);
                                                        "".length();
                                                    }
                                                    i++;
                                                    "".length();
                                                    if ("   ".length() == 0) {
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C0018e.t();
                            }
                        }
                    }
                }
            }
            int[] iArr10 = new int[llIIIIlIlI[2]];
            iArr10[llIIIIlIlI[1]] = llIIIIlIlI[10];
            if (lIlIIlIIIIIII(Inventory.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[llIIIIlIlI[2]];
                iArr11[llIIIIlIlI[1]] = llIIIIlIlI[0];
                if (!lIlIIlIIIIIlI(Inventory.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[llIIIIlIlI[2]];
                iArr12[llIIIIlIlI[1]] = llIIIIlIlI[51];
                if (!lIlIIlIIIIIlI(Inventory.contains(iArr12) ? 1 : 0)) {
                    return;
                }
            }
            if (lIlIIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[61]];
                String[] strArr11 = new String[llIIIIlIlI[2]];
                strArr11[llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[62]];
                TileItem nearest6 = TileItems.getNearest(strArr11);
                if (lIlIIlIIIIIll(nearest6)) {
                    nearest6.interact(llIIIIlIIl[llIIIIlIlI[63]]);
                }
            }
        }
    }

    private static String lIlIIIlllllIl(String llllllllllllllllllIllIIllIlIlIII, String llllllllllllllllllIllIIllIlIIlll) {
        try {
            SecretKeySpec llllllllllllllllllIllIIllIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllIIllIlIIlll.getBytes(StandardCharsets.UTF_8)), llIIIIlIlI[19]), "DES");
            Cipher llllllllllllllllllIllIIllIlIlIlI = Cipher.getInstance("DES");
            llllllllllllllllllIllIIllIlIlIlI.init(llIIIIlIlI[4], llllllllllllllllllIllIIllIlIlIll);
            return new String(llllllllllllllllllIllIIllIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllIIllIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllIIllIlIlIIl) {
            llllllllllllllllllIllIIllIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIIIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIIlIIIlIII(Skills.getLevel(Skill.PRAYER), llIIIIlIlI[3])) {
            ?? r0 = llIIIIlIlI[2];
            "".length();
            return " ".length() == 0 ? ((187 ^ 168) ^ (180 ^ 152)) & (((((62 + 122) - 21) + 18) ^ (((97 + 111) - 164) + 94)) ^ (-" ".length())) : r0;
        }
        return llIIIIlIlI[1];
    }

    private static boolean lIlIIlIIIIlII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIIIlIlI[1];
    }

    private static boolean lIlIIlIIIIIIl(int i, int i2) {
        return i < i2;
    }

    private static void Q() {
        int[] iArr = new int[llIIIIlIlI[2]];
        iArr[llIIIIlIlI[1]] = llIIIIlIlI[9];
        if (lIlIIlIIIIIlI(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIlIlI[9], llIIIIlIlI[14], C0023j.cf));
            "".length();
        }
        int[] iArr2 = new int[llIIIIlIlI[2]];
        iArr2[llIIIIlIlI[1]] = llIIIIlIlI[0];
        if (lIlIIlIIIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIlIlI[0], fZ(), llIIIIlIlI[64]));
            "".length();
        }
        int[] iArr3 = new int[llIIIIlIlI[2]];
        iArr3[llIIIIlIlI[1]] = llIIIIlIlI[8];
        if (lIlIIlIIIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIlIlI[8], llIIIIlIlI[4], llIIIIlIlI[6]));
            "".length();
        }
        if (lIlIIlIIIIIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIIIIlIIl[llIIIIlIlI[76]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIlIlI[65], llIIIIlIlI[14], llIIIIlIlI[66]));
            "".length();
        }
        int[] iArr4 = new int[llIIIIlIlI[2]];
        iArr4[llIIIIlIlI[1]] = llIIIIlIlI[67];
        if (lIlIIlIIIIIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIlIlI[67], llIIIIlIlI[68], llIIIIlIlI[69]));
            "".length();
        }
    }
}
