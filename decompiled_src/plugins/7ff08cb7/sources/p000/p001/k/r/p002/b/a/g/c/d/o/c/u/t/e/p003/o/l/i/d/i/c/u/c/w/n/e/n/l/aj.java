package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.aj  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/aj.class */
public class aj implements ab {
    private static /* synthetic */ int[] lIIIIIllll;
    private final /* synthetic */ int mn = lIIIIIllll[0];
    public static final /* synthetic */ WorldPoint mh;
    static final /* synthetic */ WorldPoint mk;
    static final /* synthetic */ WorldPoint ml;
    public static /* synthetic */ boolean bv;
    public static final /* synthetic */ WorldPoint mi;
    private static /* synthetic */ String[] lIIIIIlllI;
    public static /* synthetic */ List<C0003d> bx;
    public static final /* synthetic */ WorldPoint mj;
    public static final /* synthetic */ WorldPoint mg;
    static final /* synthetic */ WorldPoint mm;

    private static boolean llIllllllIll(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIlllllIlII(int i, int i2) {
        return i < i2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lIIIIIlllI[lIIIIIllll[75]];
    }

    private static boolean llIlllllIlIl(int i) {
        return i == 0;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            ea();
            "".length();
            if (0 != 0) {
                return ((17 ^ 12) ^ (211 ^ 192)) & (((56 ^ 96) ^ (212 ^ 130)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIIIIllll[74];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lIIIIIllll[1];
    }

    private static String llIllllIllll(String lllllIlIlIII, String lllllIlIIlll) {
        try {
            SecretKeySpec lllllIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIllll[4], lllllIlIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllIlIlIIl) {
            lllllIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static void llIlllllIIlI() {
        lIIIIIllll = new int[87];
        lIIIIIllll[0] = (-((-2821) & 32710)) & (-1) & 30425;
        lIIIIIllll[1] = ((((75 + 49) - 61) + 77) ^ (((48 + 81) - 7) + 7)) & (((18 ^ 11) ^ (99 ^ 119)) ^ (-" ".length()));
        lIIIIIllll[2] = " ".length();
        lIIIIIllll[3] = (131 ^ 182) ^ (82 ^ 74);
        lIIIIIllll[4] = "  ".length();
        lIIIIIllll[5] = "   ".length();
        lIIIIIllll[6] = (-16467) & 21466;
        lIIIIIllll[7] = 61 ^ 57;
        lIIIIIllll[8] = (-1282) & 22447;
        lIIIIIllll[9] = (-((-13873) & 32443)) & (-33) & 31227;
        lIIIIIllll[10] = (-7193) & 8187;
        lIIIIIllll[11] = (-((-26373) & 30679)) & (-10) & 14815;
        lIIIIIllll[12] = ((81 + 153) - 212) + 178;
        lIIIIIllll[13] = 76 ^ 126;
        lIIIIIllll[14] = 88 ^ 93;
        lIIIIIllll[15] = (((5 + 56) - (-43)) + 42) ^ (((37 + 45) - 45) + 97);
        lIIIIIllll[16] = (250 ^ 178) ^ (100 ^ 42);
        lIIIIIllll[17] = -" ".length();
        lIIIIIllll[18] = 124 ^ 123;
        lIIIIIllll[19] = (((64 + 3) - 51) + 132) ^ (((137 + 121) - 243) + 141);
        lIIIIIllll[20] = (((103 + 114) - 188) + 122) ^ (((30 + 27) - (-16)) + 85);
        lIIIIIllll[21] = (193 ^ 159) ^ (214 ^ 133);
        lIIIIIllll[22] = (115 ^ 127) ^ (43 ^ 45);
        lIIIIIllll[23] = (-((-501) & 20981)) & (-1036) & 24543;
        lIIIIIllll[24] = (-((-13590) & 30199)) & (-12289) & 32739;
        lIIIIIllll[25] = (-4109) & 7134;
        lIIIIIllll[26] = (-24577) & 28411;
        lIIIIIllll[27] = (-21557) & 24575;
        lIIIIIllll[28] = (-((-3577) & 24059)) & (-258) & 24571;
        lIIIIIllll[29] = (-28681) & 31695;
        lIIIIIllll[30] = (-((-3601) & 16153)) & (-3) & 16383;
        lIIIIIllll[31] = (-((-10913) & 27317)) & (-1034) & 20447;
        lIIIIIllll[32] = (-((-1335) & 25919)) & (-4357) & 32765;
        lIIIIIllll[33] = (-((-6405) & 15687)) & (-16385) & 28671;
        lIIIIIllll[34] = (-20738) & 24559;
        lIIIIIllll[35] = (-((-19721) & 23881)) & (-9217) & 16375;
        lIIIIIllll[36] = (-24854) & 28671;
        lIIIIIllll[37] = (-((-4741) & 22149)) & (-12305) & 32703;
        lIIIIIllll[38] = (-((-6353) & 6613)) & (-4113) & 8191;
        lIIIIIllll[39] = (-24601) & 27583;
        lIIIIIllll[40] = (-13377) & 16352;
        lIIIIIllll[41] = (-9218) & 12187;
        lIIIIIllll[42] = 207 ^ 196;
        lIIIIIllll[43] = (-12365) & 15327;
        lIIIIIllll[44] = (-8465) & 12284;
        lIIIIIllll[45] = (88 ^ 72) ^ (92 ^ 64);
        lIIIIIllll[46] = (-((-4459) & 29035)) & (-5233) & 32767;
        lIIIIIllll[47] = 39 ^ 41;
        lIIIIIllll[48] = (111 ^ 76) ^ (115 ^ 95);
        lIIIIIllll[49] = (67 ^ 2) ^ (24 ^ 73);
        lIIIIIllll[50] = 12 ^ 29;
        lIIIIIllll[51] = (-24963) & 25499;
        lIIIIIllll[52] = (27 ^ 73) ^ (53 ^ 117);
        lIIIIIllll[53] = 103 ^ 116;
        lIIIIIllll[54] = 189 ^ 168;
        lIIIIIllll[55] = 158 ^ 136;
        lIIIIIllll[56] = (234 ^ 146) ^ (253 ^ 146);
        lIIIIIllll[57] = (((63 + 136) - 71) + 57) ^ (((135 + 94) - 138) + 70);
        lIIIIIllll[58] = " ".length() ^ (168 ^ 176);
        lIIIIIllll[59] = 31 ^ 5;
        lIIIIIllll[60] = " ".length() ^ (41 ^ 51);
        lIIIIIllll[61] = 23 ^ 11;
        lIIIIIllll[62] = (((89 + 28) - 58) + 113) ^ (((141 + 164) - 240) + 112);
        lIIIIIllll[63] = 81 ^ 79;
        lIIIIIllll[64] = (-((-8355) & 26023)) & (-4100) & 24567;
        lIIIIIllll[65] = (-((-11429) & 27814)) & (-4353) & 32717;
        lIIIIIllll[66] = (-6230) & 31229;
        lIIIIIllll[67] = (-(((0 + 109) - 49) + 69)) & (-24625) & 32759;
        lIIIIIllll[68] = (((51 + 28) - 53) + 131) ^ (((109 + 79) - 180) + 173);
        lIIIIIllll[69] = (-((-18438) & 30839)) & (-19459) & 32759;
        lIIIIIllll[70] = (-((-1347) & 22387)) & (-129) & 294910;
        lIIIIIllll[71] = 40 ^ 20;
        lIIIIIllll[72] = (-25661) & 26110;
        lIIIIIllll[73] = (-1201) & 62712;
        lIIIIIllll[74] = 96 ^ 4;
        lIIIIIllll[75] = 32 ^ 63;
        lIIIIIllll[76] = 181 ^ 149;
        lIIIIIllll[77] = (-((-3337) & 32041)) & (-1) & 31733;
        lIIIIIllll[78] = (-24700) & 28543;
        lIIIIIllll[79] = (-((-16521) & 29901)) & (-2) & 16375;
        lIIIIIllll[80] = (-((-449) & 20951)) & (-1) & 24319;
        lIIIIIllll[81] = (-20545) & 23494;
        lIIIIIllll[82] = (-((-1745) & 9937)) & (-16401) & 28413;
        lIIIIIllll[83] = (-29761) & 32708;
        lIIIIIllll[84] = (-4970) & 8063;
        lIIIIIllll[85] = (-((-17511) & 22143)) & (-16385) & 24507;
        lIIIIIllll[86] = (192 ^ 181) ^ (36 ^ 112);
    }

    private static boolean llIlllllIIll(int i) {
        return i != 0;
    }

    private static boolean llIllllllIIl(int i, int i2) {
        return i == i2;
    }

    private static void llIlllllIIIl() {
        lIIIIIlllI = new String[lIIIIIllll[86]];
        lIIIIIlllI[lIIIIIllll[1]] = llIllllIlllI("5rcFaBLrUuFweSzxavNfOw==", "GCByH");
        lIIIIIlllI[lIIIIIllll[2]] = llIllllIllll("n+JSgkVzaw5Z/bIfwwlnszVzOz0YFY98tleoE+T6/DVHQiTbdD8n4eASX9Mtbaod", "ypbgU");
        lIIIIIlllI[lIIIIIllll[4]] = llIllllIlllI("kdyanjM7e7oKlojln4gsuamnpG3Qyyg6", "asnVo");
        lIIIIIlllI[lIIIIIllll[5]] = llIllllIlllI("InbOeaq2mIgSwlXlqmVkglMl7c360JBP", "lVwbH");
        lIIIIIlllI[lIIIIIllll[7]] = llIllllIllll("PhZqXSk0nX+Z6S3V+p9l5bLNOH/NrNPwfaTVqiUdVWjPCMxTsIDLrJUmxo3s/txfnfRevksbk3k=", "nMBvn");
        lIIIIIlllI[lIIIIIllll[14]] = llIllllIllll("bRtB4gkkm6Y=", "jqQRk");
        lIIIIIlllI[lIIIIIllll[16]] = llIllllIllll("n3peAjPGbTFVPW/szUFDyw==", "ozHHB");
        lIIIIIlllI[lIIIIIllll[18]] = llIllllIllll("w0QlOOQrq5g=", "FflLE");
        lIIIIIlllI[lIIIIIllll[19]] = llIllllIllll("aSpHdDDAqgqM0WHgAwwhkQ==", "nHCMv");
        lIIIIIlllI[lIIIIIllll[20]] = llIlllllIIII("ByE3GkRoPjMPDTglJBdIPCV2Dw0+LzpDXHlqAQoELC8kDQ07OXg=", "HJVch");
        lIIIIIlllI[lIIIIIllll[22]] = llIlllllIIII("BSMVaj0kYgImPSow", "KBcJI");
        lIIIIIlllI[lIIIIIllll[42]] = llIllllIllll("i0hP7hRyXSniyhBURCU4wA==", "DLXkT");
        lIIIIIlllI[lIIIIIllll[45]] = llIllllIlllI("vG7c7yPJcolRg/JaGS7+4g==", "NBoOW");
        lIIIIIlllI[lIIIIIllll[21]] = llIlllllIIII("Bg0mCRFqCDsBBg==", "JlTnt");
        lIIIIIlllI[lIIIIIllll[47]] = llIllllIllll("H9mZ7ZfgE7Q=", "rcpAT");
        lIIIIIlllI[lIIIIIllll[48]] = llIllllIlllI("qHmVp8/Ww0E=", "fsfAA");
        lIIIIIlllI[lIIIIIllll[49]] = llIllllIlllI("HbW4Cn2Di54=", "fyPws");
        lIIIIIlllI[lIIIIIllll[50]] = llIlllllIIII("BDsoOh5nMiUhDDU=", "GSIUm");
        lIIIIIlllI[lIIIIIllll[52]] = llIllllIlllI("yrQ4PyqAO+tdxJj3OGqZ4A==", "VkESZ");
        lIIIIIlllI[lIIIIIllll[53]] = llIllllIlllI("oqD6d+tqjiaO/g9MVKSvNg==", "zhMkM");
        lIIIIIlllI[lIIIIIllll[15]] = llIllllIllll("HTpF8e2c1lpb4rg3cqKV+gCN1eLvJ0Hv", "SDVLW");
        lIIIIIlllI[lIIIIIllll[54]] = llIlllllIIII("OjgLKDJWPRYgJQ==", "vYyOW");
        lIIIIIlllI[lIIIIIllll[55]] = llIllllIllll("XXuZioQQa6Y=", "bAxBe");
        lIIIIIlllI[lIIIIIllll[56]] = llIllllIllll("ZjVwtnqjw1M=", "zlWJi");
        lIIIIIlllI[lIIIIIllll[57]] = llIllllIllll("M5HLe7mP8hw=", "Rigae");
        lIIIIIlllI[lIIIIIllll[58]] = llIllllIlllI("jdEUgiDfF+8Gv6BssYrQ9w==", "QGLrV");
        lIIIIIlllI[lIIIIIllll[59]] = llIllllIlllI("mPIlD061WDY0UDnKXrAnxQ==", "fvaPV");
        lIIIIIlllI[lIIIIIllll[60]] = llIllllIlllI("lmBvZ74I0BdlYY7ldNYi0g==", "SQMrI");
        lIIIIIlllI[lIIIIIllll[61]] = llIlllllIIII("BTMnDBAyLyAI", "VFNoy");
        lIIIIIlllI[lIIIIIllll[62]] = llIllllIllll("Pn8Ubvni1ZHWaqz+2OSSJg==", "kDfEn");
        lIIIIIlllI[lIIIIIllll[63]] = llIllllIllll("kdPkDFsiKWM=", "UiyuC");
        lIIIIIlllI[lIIIIIllll[75]] = llIllllIlllI("pCAde7U4Xbd+P6NcchuN7A==", "JnvFM");
        lIIIIIlllI[lIIIIIllll[76]] = llIlllllIIII("CgcfPm8XCFEuKhkCBTFvUA==", "xnqYO");
    }

    private static String llIllllIlllI(String lllllIIllIll, String lllllIIllIlI) {
        try {
            SecretKeySpec lllllIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIIllIlI.getBytes(StandardCharsets.UTF_8)), lIIIIIllll[19]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIllll[4], lllllIIllllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllIIlllII) {
            lllllIIlllII.printStackTrace();
            return null;
        }
    }

    private static int eb() {
        return (llIlllllIlII(Skills.getLevel(Skill.PRAYER), lIIIIIllll[71]) && llIllllllIll(Skills.getLevel(Skill.PRAYER), lIIIIIllll[3])) ? ((lIIIIIllll[70] - Skills.getExperience(Skill.PRAYER)) / lIIIIIllll[72]) + lIIIIIllll[22] : ((lIIIIIllll[73] - Skills.getExperience(Skill.PRAYER)) / lIIIIIllll[72]) + lIIIIIllll[63];
    }

    private static boolean llIllllllIII(int i, int i2) {
        return i > i2;
    }

    private static boolean llIllllllIlI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
        if (llIlllllIIll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean an() {
        int[] iArr = new int[lIIIIIllll[2]];
        iArr[lIIIIIllll[1]] = lIIIIIllll[10];
        if (llIlllllIIll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIIIllll[2]];
            iArr2[lIIIIIllll[1]] = lIIIIIllll[10];
            if (llIllllllIll(Inventory.getFirst(iArr2).getQuantity(), lIIIIIllll[13])) {
                if (llIlllllIlIl(Inventory.contains(C0005f.bh) ? 1 : 0)) {
                    if (llIlllllIIll(Equipment.contains(C0005f.bh) ? 1 : 0)) {
                        int[] iArr3 = new int[lIIIIIllll[2]];
                        iArr3[lIIIIIllll[1]] = lIIIIIllll[0];
                        if (llIlllllIlIl(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIIIIllll[2]];
                            iArr4[lIIIIIllll[1]] = lIIIIIllll[51];
                        }
                    }
                }
                ?? r0 = lIIIIIllll[2];
                "".length();
                return "  ".length() <= (-" ".length()) ? " ".length() & (" ".length() ^ (-1)) : r0;
            }
        }
        return lIIIIIllll[1];
    }

    static {
        llIlllllIIlI();
        llIlllllIIIl();
        mg = new WorldPoint(lIIIIIllll[77], lIIIIIllll[78], lIIIIIllll[1]);
        mh = new WorldPoint(lIIIIIllll[79], lIIIIIllll[80], lIIIIIllll[1]);
        mi = new WorldPoint(lIIIIIllll[81], lIIIIIllll[82], lIIIIIllll[1]);
        mj = new WorldPoint(lIIIIIllll[83], lIIIIIllll[44], lIIIIIllll[1]);
        mk = new WorldPoint(lIIIIIllll[1], lIIIIIllll[1], lIIIIIllll[1]);
        ml = new WorldPoint(lIIIIIllll[1], lIIIIIllll[1], lIIIIIllll[1]);
        mm = new WorldPoint(lIIIIIllll[84], lIIIIIllll[85], lIIIIIllll[1]);
        bx = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v309, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v333, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v53, types: [boolean] */
    public static void ea() {
        if (llIlllllIIll(bv ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[1]];
            C0001b.a(bx);
            if (llIlllllIlII(bx.size(), lIIIIIllll[2])) {
                System.out.println(lIIIIIlllI[lIIIIIllll[2]]);
                bv = lIIIIIllll[1];
            }
        }
        if (llIlllllIlIl(bv ? 1 : 0) && llIlllllIlII(Skills.getLevel(Skill.PRAYER), lIIIIIllll[3])) {
            if (llIlllllIlIl(an() ? 1 : 0) && llIlllllIlII(Game.getWildyLevel(), lIIIIIllll[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlllllIllI(nearest) && llIlllllIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[4]];
                    C0000a.a(nearest);
                }
                if (llIlllllIllI(nearest) && llIlllllIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[5]];
                    if (llIlllllIlIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIIllll[6]);
                        "".length();
                    }
                    if (llIlllllIIll(Bank.isOpen() ? 1 : 0)) {
                        if (llIlllllIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIIIllll[7]);
                            "".length();
                        }
                        if (llIlllllIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIIIllll[4]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIIIllll[5]];
                        iArr[lIIIIIllll[1]] = lIIIIIllll[8];
                        iArr[lIIIIIllll[2]] = lIIIIIllll[0];
                        iArr[lIIIIIllll[4]] = lIIIIIllll[9];
                        if (llIlllllIlIl(C0004e.d(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(lIIIIIlllI[lIIIIIllll[7]]);
                            bv = lIIIIIllll[2];
                            return;
                        }
                        int[] iArr2 = new int[lIIIIIllll[5]];
                        iArr2[lIIIIIllll[1]] = lIIIIIllll[8];
                        iArr2[lIIIIIllll[2]] = lIIIIIllll[0];
                        iArr2[lIIIIIllll[4]] = lIIIIIllll[9];
                        if (llIlllllIIll(C0004e.d(iArr2) ? 1 : 0)) {
                            if (llIlllllIlIl(Equipment.contains(C0005f.bh) ? 1 : 0)) {
                                C0000a.b(C0005f.bh, lIIIIIllll[2]);
                            }
                            C0000a.b(C0005f.bc, lIIIIIllll[2]);
                            C0000a.a(lIIIIIllll[10], lIIIIIllll[11]);
                            C0000a.b(lIIIIIllll[0], lIIIIIllll[12]);
                        }
                    }
                }
            }
            if (llIlllllIIll(an() ? 1 : 0)) {
                if (llIlllllIIll(Inventory.contains(C0005f.bc) ? 1 : 0) && llIlllllIlII(Movement.getRunEnergy(), lIIIIIllll[13])) {
                    Inventory.getFirst(C0005f.bc).interact(lIIIIIlllI[lIIIIIllll[14]]);
                    Time.sleepTicks(lIIIIIllll[2]);
                    "".length();
                }
                if (llIlllllIlIl(Movement.isRunEnabled() ? 1 : 0) && llIllllllIII(Movement.getRunEnergy(), lIIIIIllll[15])) {
                    Movement.toggleRun();
                    Time.sleepTicks(lIIIIIllll[14]);
                    "".length();
                }
                if (llIlllllIlII(Game.getWildyLevel(), lIIIIIllll[2])) {
                    AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[16]];
                    if (llIlllllIIll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (llIlllllIlIl(Dialog.isOpen() ? 1 : 0) && llIlllllIIll(Inventory.contains(C0005f.bh) ? 1 : 0) && llIllllllIIl(Players.getLocal().getAnimation(), lIIIIIllll[17])) {
                        Inventory.getFirst(C0005f.bh).interact(lIIIIIlllI[lIIIIIllll[18]]);
                        Time.sleepTicks(lIIIIIllll[4]);
                        "".length();
                    }
                    String[] strArr = new String[lIIIIIllll[4]];
                    strArr[lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[19]];
                    strArr[lIIIIIllll[2]] = lIIIIIlllI[lIIIIIllll[20]];
                    C0006g.a(strArr);
                }
                if (llIlllllIlll(Game.getWildyLevel())) {
                    int[] iArr3 = new int[lIIIIIllll[2]];
                    iArr3[lIIIIIllll[1]] = lIIIIIllll[0];
                    if (llIlllllIIll(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (llIllllllIII(Players.getLocal().getWorldLocation().distanceTo(mi), lIIIIIllll[21])) {
                            AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[22]];
                            WorldPoint[] worldPointArr = new WorldPoint[lIIIIIllll[21]];
                            worldPointArr[lIIIIIllll[1]] = new WorldPoint(lIIIIIllll[23], lIIIIIllll[24], lIIIIIllll[1]);
                            worldPointArr[lIIIIIllll[2]] = new WorldPoint(lIIIIIllll[25], lIIIIIllll[26], lIIIIIllll[1]);
                            worldPointArr[lIIIIIllll[4]] = new WorldPoint(lIIIIIllll[27], lIIIIIllll[28], lIIIIIllll[1]);
                            worldPointArr[lIIIIIllll[5]] = new WorldPoint(lIIIIIllll[29], lIIIIIllll[30], lIIIIIllll[1]);
                            worldPointArr[lIIIIIllll[7]] = new WorldPoint(lIIIIIllll[31], lIIIIIllll[32], lIIIIIllll[1]);
                            worldPointArr[lIIIIIllll[14]] = new WorldPoint(lIIIIIllll[33], lIIIIIllll[34], lIIIIIllll[1]);
                            worldPointArr[lIIIIIllll[16]] = new WorldPoint(lIIIIIllll[35], lIIIIIllll[36], lIIIIIllll[1]);
                            worldPointArr[lIIIIIllll[18]] = new WorldPoint(lIIIIIllll[37], lIIIIIllll[38], lIIIIIllll[1]);
                            worldPointArr[lIIIIIllll[19]] = new WorldPoint(lIIIIIllll[39], lIIIIIllll[38], lIIIIIllll[1]);
                            worldPointArr[lIIIIIllll[20]] = new WorldPoint(lIIIIIllll[40], lIIIIIllll[38], lIIIIIllll[1]);
                            worldPointArr[lIIIIIllll[22]] = new WorldPoint(lIIIIIllll[41], lIIIIIllll[38], lIIIIIllll[1]);
                            worldPointArr[lIIIIIllll[42]] = new WorldPoint(lIIIIIllll[43], lIIIIIllll[44], lIIIIIllll[1]);
                            worldPointArr[lIIIIIllll[45]] = new WorldPoint(lIIIIIllll[46], lIIIIIllll[44], lIIIIIllll[1]);
                            Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                            "".length();
                            Time.sleepTicks(lIIIIIllll[2]);
                            "".length();
                        }
                        if (llIllllllIlI(Players.getLocal().getWorldLocation().distanceTo(mi), lIIIIIllll[21])) {
                            AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[42]];
                            String[] strArr2 = new String[lIIIIIllll[2]];
                            strArr2[lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[45]];
                            TileObject nearest2 = TileObjects.getNearest(strArr2);
                            String[] strArr3 = new String[lIIIIIllll[2]];
                            strArr3[lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[21]];
                            TileObject nearest3 = TileObjects.getNearest(strArr3);
                            String[] strArr4 = new String[lIIIIIllll[2]];
                            strArr4[lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[47]];
                            if (llIlllllIIll(nearest3.hasAction(strArr4) ? 1 : 0)) {
                                nearest3.interact(lIIIIIlllI[lIIIIIllll[48]]);
                            }
                            if (llIlllllIllI(nearest2)) {
                                String[] strArr5 = new String[lIIIIIllll[2]];
                                strArr5[lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[49]];
                                if (llIlllllIlIl(nearest3.hasAction(strArr5) ? 1 : 0)) {
                                    Skills.getExperience(Skill.PRAYER);
                                    int[] iArr4 = new int[lIIIIIllll[2]];
                                    iArr4[lIIIIIllll[1]] = lIIIIIllll[0];
                                    Item first = Inventory.getFirst(iArr4);
                                    String[] strArr6 = new String[lIIIIIllll[2]];
                                    strArr6[lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[50]];
                                    first.useOn(TileObjects.getNearest(strArr6));
                                    Time.sleepTicks(lIIIIIllll[2]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[lIIIIIllll[2]];
                    iArr5[lIIIIIllll[1]] = lIIIIIllll[0];
                    if (llIlllllIlIl(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIIIIIllll[2]];
                        iArr6[lIIIIIllll[1]] = lIIIIIllll[51];
                        if (llIlllllIIll(Inventory.contains(iArr6) ? 1 : 0)) {
                            if (llIllllllIII(Players.getLocal().getWorldLocation().distanceTo(mi), lIIIIIllll[21])) {
                                AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[52]];
                                WorldPoint[] worldPointArr2 = new WorldPoint[lIIIIIllll[21]];
                                worldPointArr2[lIIIIIllll[1]] = new WorldPoint(lIIIIIllll[23], lIIIIIllll[24], lIIIIIllll[1]);
                                worldPointArr2[lIIIIIllll[2]] = new WorldPoint(lIIIIIllll[25], lIIIIIllll[26], lIIIIIllll[1]);
                                worldPointArr2[lIIIIIllll[4]] = new WorldPoint(lIIIIIllll[27], lIIIIIllll[28], lIIIIIllll[1]);
                                worldPointArr2[lIIIIIllll[5]] = new WorldPoint(lIIIIIllll[29], lIIIIIllll[30], lIIIIIllll[1]);
                                worldPointArr2[lIIIIIllll[7]] = new WorldPoint(lIIIIIllll[31], lIIIIIllll[32], lIIIIIllll[1]);
                                worldPointArr2[lIIIIIllll[14]] = new WorldPoint(lIIIIIllll[33], lIIIIIllll[34], lIIIIIllll[1]);
                                worldPointArr2[lIIIIIllll[16]] = new WorldPoint(lIIIIIllll[35], lIIIIIllll[36], lIIIIIllll[1]);
                                worldPointArr2[lIIIIIllll[18]] = new WorldPoint(lIIIIIllll[37], lIIIIIllll[38], lIIIIIllll[1]);
                                worldPointArr2[lIIIIIllll[19]] = new WorldPoint(lIIIIIllll[39], lIIIIIllll[38], lIIIIIllll[1]);
                                worldPointArr2[lIIIIIllll[20]] = new WorldPoint(lIIIIIllll[40], lIIIIIllll[38], lIIIIIllll[1]);
                                worldPointArr2[lIIIIIllll[22]] = new WorldPoint(lIIIIIllll[41], lIIIIIllll[38], lIIIIIllll[1]);
                                worldPointArr2[lIIIIIllll[42]] = new WorldPoint(lIIIIIllll[43], lIIIIIllll[44], lIIIIIllll[1]);
                                worldPointArr2[lIIIIIllll[45]] = new WorldPoint(lIIIIIllll[46], lIIIIIllll[44], lIIIIIllll[1]);
                                Walker.walkAlong(Arrays.asList(worldPointArr2), new HashMap());
                                "".length();
                                Time.sleepTicks(lIIIIIllll[2]);
                                "".length();
                            }
                            if (llIllllllIlI(Players.getLocal().getWorldLocation().distanceTo(mi), lIIIIIllll[21])) {
                                AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[53]];
                                if (!llIlllllIlIl(Dialog.canLevelUpContinue() ? 1 : 0) || llIlllllIIll(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] strArr7 = new String[lIIIIIllll[2]];
                                strArr7[lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[15]];
                                NPC nearest4 = NPCs.getNearest(strArr7);
                                String[] strArr8 = new String[lIIIIIllll[2]];
                                strArr8[lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[54]];
                                TileObject nearest5 = TileObjects.getNearest(strArr8);
                                String[] strArr9 = new String[lIIIIIllll[2]];
                                strArr9[lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[55]];
                                if (llIlllllIIll(nearest5.hasAction(strArr9) ? 1 : 0)) {
                                    nearest5.interact(lIIIIIlllI[lIIIIIllll[56]]);
                                }
                                if (llIlllllIllI(nearest4)) {
                                    String[] strArr10 = new String[lIIIIIllll[2]];
                                    strArr10[lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[57]];
                                    if (llIlllllIlIl(nearest5.hasAction(strArr10) ? 1 : 0)) {
                                        if (llIlllllIlIl(Dialog.isOpen() ? 1 : 0)) {
                                            int[] iArr7 = new int[lIIIIIllll[2]];
                                            iArr7[lIIIIIllll[1]] = lIIIIIllll[51];
                                            Inventory.getFirst(iArr7).useOn(nearest4);
                                            Time.sleepTicks(lIIIIIllll[4]);
                                            "".length();
                                        }
                                        if (llIlllllIIll(Dialog.isOpen() ? 1 : 0)) {
                                            List options = Dialog.getOptions();
                                            if (llIlllllIlIl(options.isEmpty() ? 1 : 0)) {
                                                int i = lIIIIIllll[1];
                                                while (llIlllllIlII(i, options.size())) {
                                                    int[] iArr8 = new int[lIIIIIllll[2]];
                                                    iArr8[lIIIIIllll[1]] = lIIIIIllll[51];
                                                    if (llIllllllIIl(((Item) Inventory.getAll(iArr8).get(lIIIIIllll[1])).getQuantity(), lIIIIIllll[2]) && llIlllllIIll(((Widget) options.get(i)).getText().contains(lIIIIIlllI[lIIIIIllll[58]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIIIIIllll[2]);
                                                        Time.sleepTicks(lIIIIIllll[4]);
                                                        "".length();
                                                    }
                                                    int[] iArr9 = new int[lIIIIIllll[2]];
                                                    iArr9[lIIIIIllll[1]] = lIIIIIllll[51];
                                                    if (llIllllllIIl(((Item) Inventory.getAll(iArr9).get(lIIIIIllll[1])).getQuantity(), lIIIIIllll[14]) && llIlllllIIll(((Widget) options.get(i)).getText().contains(lIIIIIlllI[lIIIIIllll[59]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIIIIIllll[2]);
                                                        Time.sleepTicks(lIIIIIllll[4]);
                                                        "".length();
                                                    }
                                                    if (llIlllllIIll(((Widget) options.get(i)).getText().contains(lIIIIIlllI[lIIIIIllll[60]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIIIIIllll[2]);
                                                        Time.sleepTicks(lIIIIIllll[4]);
                                                        "".length();
                                                    }
                                                    i++;
                                                    "".length();
                                                    if (" ".length() < 0) {
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
            int[] iArr10 = new int[lIIIIIllll[2]];
            iArr10[lIIIIIllll[1]] = lIIIIIllll[10];
            if (llIlllllIIll(Inventory.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lIIIIIllll[2]];
                iArr11[lIIIIIllll[1]] = lIIIIIllll[0];
                if (!llIlllllIlIl(Inventory.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[lIIIIIllll[2]];
                iArr12[lIIIIIllll[1]] = lIIIIIllll[51];
                if (!llIlllllIlIl(Inventory.contains(iArr12) ? 1 : 0)) {
                    return;
                }
            }
            if (llIllllllIlI(Players.getLocal().getWorldLocation().distanceTo(mi), lIIIIIllll[21])) {
                AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[61]];
                String[] strArr11 = new String[lIIIIIllll[2]];
                strArr11[lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[62]];
                TileItem nearest6 = TileItems.getNearest(strArr11);
                if (llIlllllIllI(nearest6)) {
                    nearest6.interact(lIIIIIlllI[lIIIIIllll[63]]);
                }
            }
        }
    }

    private static boolean llIlllllIllI(Object obj) {
        return obj != null;
    }

    private static boolean llIlllllIlll(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIllllllIll(Skills.getLevel(Skill.PRAYER), lIIIIIllll[3])) {
            ?? r0 = lIIIIIllll[2];
            "".length();
            return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIIIllll[1];
    }

    private static String llIlllllIIII(String lllllIIIlIll, String lllllIIIlIlI) {
        String str = new String(Base64.getDecoder().decode(lllllIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllIIIlIIl = new StringBuilder();
        char[] charArray = lllllIIIlIlI.toCharArray();
        int lllllIIIIlll = lIIIIIllll[1];
        char[] charArray2 = str.toCharArray();
        int lllllIIIIIII = charArray2.length;
        int i = lIIIIIllll[1];
        while (llIlllllIlII(i, lllllIIIIIII)) {
            lllllIIIlIIl.append((char) (charArray2[i] ^ charArray[lllllIIIIlll % charArray.length]));
            "".length();
            lllllIIIIlll++;
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllIIIlIIl);
    }

    private static void Q() {
        int[] iArr = new int[lIIIIIllll[2]];
        iArr[lIIIIIllll[1]] = lIIIIIllll[9];
        if (llIlllllIlIl(Bank.contains(iArr) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIllll[9], lIIIIIllll[14], C0009j.ch));
            "".length();
        }
        int[] iArr2 = new int[lIIIIIllll[2]];
        iArr2[lIIIIIllll[1]] = lIIIIIllll[0];
        if (llIlllllIlIl(Bank.contains(iArr2) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIllll[0], eb(), lIIIIIllll[64]));
            "".length();
        }
        int[] iArr3 = new int[lIIIIIllll[2]];
        iArr3[lIIIIIllll[1]] = lIIIIIllll[8];
        if (llIlllllIlIl(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIllll[8], lIIIIIllll[4], lIIIIIllll[6]));
            "".length();
        }
        if (llIlllllIlIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIIIlllI[lIIIIIllll[76]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIllll[65], lIIIIIllll[14], lIIIIIllll[66]));
            "".length();
        }
        int[] iArr4 = new int[lIIIIIllll[2]];
        iArr4[lIIIIIllll[1]] = lIIIIIllll[67];
        if (llIlllllIlIl(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIllll[67], lIIIIIllll[68], lIIIIIllll[69]));
            "".length();
        }
    }
}
