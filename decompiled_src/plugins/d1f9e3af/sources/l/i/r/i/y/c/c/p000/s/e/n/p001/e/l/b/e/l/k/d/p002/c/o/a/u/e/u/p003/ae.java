package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.ae  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/ae.class */
public class ae implements W {
    public static final /* synthetic */ WorldPoint lD;
    private static /* synthetic */ int[] lIllIIIII;
    static final /* synthetic */ WorldPoint lI;
    private final /* synthetic */ int lJ = lIllIIIII[0];
    static final /* synthetic */ WorldPoint lG;
    public static /* synthetic */ List<C0003d> bv;
    public static final /* synthetic */ WorldPoint lE;
    public static final /* synthetic */ WorldPoint lF;
    public static final /* synthetic */ WorldPoint lC;
    public static /* synthetic */ boolean bt;
    static final /* synthetic */ WorldPoint lH;
    private static /* synthetic */ String[] lIlIlllII;

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            dD();
            "".length();
            if ((((((158 + 53) - 159) + 107) ^ (((61 + 44) - 53) + 137)) & (((98 ^ 64) ^ ((73 ^ 124) & ((40 ^ 29) ^ (-1)))) ^ (-" ".length()))) >= "  ".length()) {
                return ((((53 + 34) - 44) + 128) ^ (((2 + 95) - 69) + 139)) & (((((66 + 95) - 37) + 21) ^ (((69 + 20) - 30) + 98)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIllIIIII[74];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIllIIIII[1];
    }

    private static boolean lIIlIlIIIlIl(int i) {
        return i == 0;
    }

    private static void lIIlIlIIIIlI() {
        lIllIIIII = new int[87];
        lIllIIIII[0] = (-((-13377) & 32101)) & (-5188) & 24447;
        lIllIIIII[1] = ((((23 + 173) - 128) + 185) ^ (((158 + 84) - 149) + 75)) & (((54 ^ 70) ^ (230 ^ 195)) ^ (-" ".length()));
        lIllIIIII[2] = " ".length();
        lIllIIIII[3] = 8 ^ 37;
        lIllIIIII[4] = "  ".length();
        lIllIIIII[5] = "   ".length();
        lIllIIIII[6] = (-81) & 5080;
        lIllIIIII[7] = 106 ^ 110;
        lIllIIIII[8] = (-((-8933) & 12262)) & (-17) & 24511;
        lIllIIIII[9] = (-(((41 + 97) - 51) + 46)) & (-35) & 12791;
        lIllIIIII[10] = (-((-2789) & 28389)) & (-6157) & 32751;
        lIllIIIII[11] = (-((-25345) & 29545)) & (-514) & 15213;
        lIllIIIII[12] = (((227 ^ 144) + (((134 + 138) - 137) + 41)) - (((23 + 53) - (-41)) + 15)) + (87 ^ 126);
        lIllIIIII[13] = 129 ^ 179;
        lIllIIIII[14] = (((68 + 142) - 158) + 146) ^ (((182 + 21) - 48) + 40);
        lIllIIIII[15] = 42 ^ 62;
        lIllIIIII[16] = (254 ^ 163) ^ (152 ^ 195);
        lIllIIIII[17] = -" ".length();
        lIllIIIII[18] = (((123 + 89) - 127) + 90) ^ (((86 + 38) - (-40)) + 4);
        lIllIIIII[19] = 116 ^ 124;
        lIllIIIII[20] = (((125 + 76) - 124) + 88) ^ (((109 + 42) - 36) + 57);
        lIllIIIII[21] = (118 ^ 62) ^ (208 ^ 149);
        lIllIIIII[22] = 122 ^ 112;
        lIllIIIII[23] = (-4138) & 7165;
        lIllIIIII[24] = (-((-4613) & 29429)) & (-14) & 28671;
        lIllIIIII[25] = (-((-18699) & 32015)) & (-16385) & 32726;
        lIllIIIII[26] = (-((-257) & 24833)) & (-5) & 28415;
        lIllIIIII[27] = (-((-12387) & 13415)) & (-24609) & 28655;
        lIllIIIII[28] = (-((-19058) & 31605)) & (-1) & 16379;
        lIllIIIII[29] = (-((-20889) & 21945)) & (-20481) & 24551;
        lIllIIIII[30] = (-24585) & 28413;
        lIllIIIII[31] = (-13330) & 16339;
        lIllIIIII[32] = (-20483) & 24307;
        lIllIIIII[33] = (-24579) & 27583;
        lIllIIIII[34] = (-((-17521) & 29810)) & (-17) & 16127;
        lIllIIIII[35] = (-17481) & 20479;
        lIllIIIII[36] = (-16385) & 20202;
        lIllIIIII[37] = (-((-9359) & 29919)) & (-8193) & 31743;
        lIllIIIII[38] = (-((-171) & 12475)) & (-16641) & 32763;
        lIllIIIII[39] = (-28681) & 31663;
        lIllIIIII[40] = (-((-2977) & 31743)) & (-1026) & 32767;
        lIllIIIII[41] = (-((-26659) & 31847)) & (-16386) & 24543;
        lIllIIIII[42] = (249 ^ 174) ^ (68 ^ 24);
        lIllIIIII[43] = (-21581) & 24543;
        lIllIIIII[44] = (-((-19617) & 19890)) & (-16387) & 20479;
        lIllIIIII[45] = 115 ^ 127;
        lIllIIIII[46] = (-((-2399) & 10623)) & (-20481) & 31663;
        lIllIIIII[47] = 89 ^ 87;
        lIllIIIII[48] = 175 ^ 160;
        lIllIIIII[49] = (163 ^ 176) ^ "   ".length();
        lIllIIIII[50] = 91 ^ 74;
        lIllIIIII[51] = (-((-2075) & 27995)) & (-6309) & 32765;
        lIllIIIII[52] = 22 ^ 4;
        lIllIIIII[53] = (((94 + 44) - 135) + 147) ^ (((89 + 28) - 75) + 91);
        lIllIIIII[54] = 165 ^ 176;
        lIllIIIII[55] = (62 ^ 100) ^ (234 ^ 166);
        lIllIIIII[56] = 28 ^ 11;
        lIllIIIII[57] = 134 ^ 158;
        lIllIIIII[58] = 151 ^ 142;
        lIllIIIII[59] = 152 ^ 130;
        lIllIIIII[60] = (((112 + 135) - 219) + 155) ^ (((122 + 27) - 98) + 121);
        lIllIIIII[61] = 126 ^ 98;
        lIllIIIII[62] = (75 ^ 85) ^ "   ".length();
        lIllIIIII[63] = 49 ^ 47;
        lIllIIIII[64] = (-17666) & 20465;
        lIllIIIII[65] = (-4385) & 16364;
        lIllIIIII[66] = (-((-3) & 5719)) & (-2049) & 32764;
        lIllIIIII[67] = (-((-4815) & 13055)) & (-16385) & 32631;
        lIllIIIII[68] = 117 ^ 93;
        lIllIIIII[69] = (-27675) & 28574;
        lIllIIIII[70] = (-((-9793) & 30306)) & (-1) & 294255;
        lIllIIIII[71] = (73 ^ 115) ^ (167 ^ 161);
        lIllIIIII[72] = (-((-20651) & 31423)) & (-2) & 11223;
        lIllIIIII[73] = (-419) & 61930;
        lIllIIIII[74] = (59 ^ 2) ^ (47 ^ 114);
        lIllIIIII[75] = (65 ^ 107) ^ (14 ^ 59);
        lIllIIIII[76] = 43 ^ 11;
        lIllIIIII[77] = (-((-151) & 21663)) & (-8193) & 32733;
        lIllIIIII[78] = (-((-27921) & 32051)) & (-65) & 8038;
        lIllIIIII[79] = (-5133) & 8126;
        lIllIIIII[80] = (-((-101) & 29047)) & (-1) & 32763;
        lIllIIIII[81] = (-((-16451) & 17499)) & (-8225) & 12222;
        lIllIIIII[82] = (-12561) & 16381;
        lIllIIIII[83] = (-29732) & 32679;
        lIllIIIII[84] = (-29002) & 32095;
        lIllIIIII[85] = (-4681) & 8171;
        lIllIIIII[86] = 9 ^ 40;
    }

    private static void lIIlIlIIIIIl() {
        lIlIlllII = new String[lIllIIIII[86]];
        lIlIlllII[lIllIIIII[1]] = lIIlIIllIIII("/aT4NTlKvti0pGHgU50yZw==", "fCffq");
        lIlIlllII[lIllIIIII[2]] = lIIlIIllIIII("LnvjSxkSRVJiFSU/qxtk3xepTA3tzo4pf86y5u+dA0FszT8JQ6yY1InnRS/zUoMh", "LBZjv");
        lIlIlllII[lIllIIIII[4]] = lIIlIIllIIIl("LwgBKyUAHR4sJUEdGGIgAAcc", "aiwBB");
        lIlIlllII[lIllIIIII[5]] = lIIlIIllIIII("zpMGW/OG1w2E+ZyfV83yFeh/adFjsAUe", "EfknZ");
        lIlIlllII[lIllIIIII[7]] = lIIlIIllIIII("6Hd7675k4il3joh4tKJKPYZ+LoAbeU8A37wBFOc1ibb/mSrqaSOI87gv0/TXpw30y9g+uODQPVU=", "LCeGQ");
        lIlIlllII[lIllIIIII[14]] = lIIlIIllIIII("zmpColBnjNY=", "KwzlY");
        lIlIlllII[lIllIIIII[16]] = lIIlIIllIIII("pNZoVGhx5qHUhVwZRw+qhg==", "IqCkT");
        lIlIlllII[lIllIIIII[18]] = lIIlIIllIIIl("CycM", "YRnMD");
        lIlIlllII[lIllIIIII[19]] = lIIlIIllIIlI("V0CXtTXPk08Nrjoi2WD94w==", "ZsHOg");
        lIlIlllII[lIllIIIII[20]] = lIIlIIllIIlI("O0ESfQP1ES1Xo14nwWayx0qZBqCJw467kmvpDhxnkMuEWmqMFIWdoA==", "bIirZ");
        lIlIlllII[lIllIIIII[22]] = lIIlIIllIIIl("BxMRdDomUgY4OigA", "IrgTN");
        lIlIlllII[lIllIIIII[42]] = lIIlIIllIIII("Hac5Zy5/i/8WWoy6wc5awA==", "XskaX");
        lIlIlllII[lIllIIIII[45]] = lIIlIIllIIII("isLskLg7eX5OSGYZ+59Q5A==", "EdGtk");
        lIlIlllII[lIllIIIII[21]] = lIIlIIllIIIl("FTI4EC15NyUYOg==", "YSJwH");
        lIlIlllII[lIllIIIII[47]] = lIIlIIllIIII("gnOWiMsCom4=", "TgTrb");
        lIlIlllII[lIllIIIII[48]] = lIIlIIllIIlI("ktpxBC3K1x8=", "WKxTj");
        lIlIlllII[lIllIIIII[49]] = lIIlIIllIIlI("2YzSkI+oa8I=", "QkSTe");
        lIlIlllII[lIllIIIII[50]] = lIIlIIllIIII("DSpJfrXOYYnehTrJauGauw==", "VJofV");
        lIlIlllII[lIllIIIII[52]] = lIIlIIllIIIl("Kickcg4LZjM+DgU0", "dFRRz");
        lIlIlllII[lIllIIIII[53]] = lIIlIIllIIII("NA0HuGj8AldK8gdGVMdBSQ==", "oCgXI");
        lIlIlllII[lIllIIIII[15]] = lIIlIIllIIlI("zRPKfPJKRSeP/kfjeZyaXB0K6O/pccXe", "wSiQX");
        lIlIlllII[lIllIIIII[54]] = lIIlIIllIIIl("NCUxFi1YICweOg==", "xDCqH");
        lIlIlllII[lIllIIIII[55]] = lIIlIIllIIII("zhQcOi5GJug=", "drTBs");
        lIlIlllII[lIllIIIII[56]] = lIIlIIllIIII("SC8Fs6Q/E/o=", "oDFeT");
        lIlIlllII[lIllIIIII[57]] = lIIlIIllIIlI("MfJFO0CcMo4=", "dIfPi");
        lIlIlllII[lIllIIIII[58]] = lIIlIIllIIlI("PAV/jyPDqdJWSnQKmpz8KA==", "DWZIi");
        lIlIlllII[lIllIIIII[59]] = lIIlIIllIIIl("FDkrKQQ/Ji1hUA==", "QAHAe");
        lIlIlllII[lIllIIIII[60]] = lIIlIIllIIII("NuDJ+RG9/ufcDjMrIM084Q==", "WQPzn");
        lIlIlllII[lIllIIIII[61]] = lIIlIIllIIIl("JiEYMwcRPR83", "uTqPn");
        lIlIlllII[lIllIIIII[62]] = lIIlIIllIIII("FquH0Au29GBJZV8LeplMgw==", "WSsLf");
        lIlIlllII[lIllIIIII[63]] = lIIlIIllIIII("22lKxBGUqHY=", "bSZgp");
        lIlIlllII[lIllIIIII[75]] = lIIlIIllIIII("AkqaqWoLP2rQHJPbMNlxuw==", "QbfVM");
        lIlIlllII[lIllIIIII[76]] = lIIlIIllIIIl("AQcoP1QcCGYvERICMjBUWw==", "snFXt");
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIlIlllII[lIllIIIII[75]];
    }

    private static int dE() {
        return (lIIlIlIIIlII(Skills.getLevel(Skill.PRAYER), lIllIIIII[71]) && lIIlIlIIlIll(Skills.getLevel(Skill.PRAYER), lIllIIIII[3])) ? ((lIllIIIII[70] - Skills.getExperience(Skill.PRAYER)) / lIllIIIII[72]) + lIllIIIII[22] : ((lIllIIIII[73] - Skills.getExperience(Skill.PRAYER)) / lIllIIIII[72]) + lIllIIIII[63];
    }

    private static void af() {
        int[] iArr = new int[lIllIIIII[2]];
        iArr[lIllIIIII[1]] = lIllIIIII[9];
        if (lIIlIlIIIlIl(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIllIIIII[9], lIllIIIII[14], C0008i.bq));
            "".length();
        }
        int[] iArr2 = new int[lIllIIIII[2]];
        iArr2[lIllIIIII[1]] = lIllIIIII[0];
        if (lIIlIlIIIlIl(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIllIIIII[0], dE(), lIllIIIII[64]));
            "".length();
        }
        int[] iArr3 = new int[lIllIIIII[2]];
        iArr3[lIllIIIII[1]] = lIllIIIII[8];
        if (lIIlIlIIIlIl(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIllIIIII[8], lIllIIIII[4], lIllIIIII[6]));
            "".length();
        }
        if (lIIlIlIIIlIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIlllII[lIllIIIII[76]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIllIIIII[65], lIllIIIII[14], lIllIIIII[66]));
            "".length();
        }
        int[] iArr4 = new int[lIllIIIII[2]];
        iArr4[lIllIIIII[1]] = lIllIIIII[67];
        if (lIIlIlIIIlIl(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIllIIIII[67], lIllIIIII[68], lIllIIIII[69]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v309, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v333, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v53, types: [boolean] */
    public static void dD() {
        if (lIIlIlIIIIll(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[1]];
            C0001b.a(bv);
            if (lIIlIlIIIlII(bv.size(), lIllIIIII[2])) {
                System.out.println(lIlIlllII[lIllIIIII[2]]);
                bt = lIllIIIII[1];
            }
        }
        if (lIIlIlIIIlIl(bt ? 1 : 0) && lIIlIlIIIlII(Skills.getLevel(Skill.PRAYER), lIllIIIII[3])) {
            if (lIIlIlIIIlIl(ab() ? 1 : 0) && lIIlIlIIIlII(Game.getWildyLevel(), lIllIIIII[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIlIIIllI(nearest) && lIIlIlIIIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[4]];
                    C0000a.a(nearest);
                }
                if (lIIlIlIIIllI(nearest) && lIIlIlIIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[5]];
                    if (lIIlIlIIIlIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIllIIIII[6]);
                        "".length();
                    }
                    if (lIIlIlIIIIll(Bank.isOpen() ? 1 : 0)) {
                        if (lIIlIlIIIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIllIIIII[7]);
                            "".length();
                        }
                        if (lIIlIlIIIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIllIIIII[4]);
                            "".length();
                        }
                        int[] iArr = new int[lIllIIIII[5]];
                        iArr[lIllIIIII[1]] = lIllIIIII[8];
                        iArr[lIllIIIII[2]] = lIllIIIII[0];
                        iArr[lIllIIIII[4]] = lIllIIIII[9];
                        if (lIIlIlIIIlIl(C0004e.b(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIlIlllII[lIllIIIII[7]]);
                            bt = lIllIIIII[2];
                            return;
                        }
                        int[] iArr2 = new int[lIllIIIII[5]];
                        iArr2[lIllIIIII[1]] = lIllIIIII[8];
                        iArr2[lIllIIIII[2]] = lIllIIIII[0];
                        iArr2[lIllIIIII[4]] = lIllIIIII[9];
                        if (lIIlIlIIIIll(C0004e.b(iArr2) ? 1 : 0)) {
                            if (lIIlIlIIIlIl(Equipment.contains(C0005f.ba) ? 1 : 0)) {
                                C0000a.b(C0005f.ba, lIllIIIII[2]);
                            }
                            C0000a.b(C0005f.aV, lIllIIIII[2]);
                            C0000a.a(lIllIIIII[10], lIllIIIII[11]);
                            C0000a.b(lIllIIIII[0], lIllIIIII[12]);
                        }
                    }
                }
            }
            if (lIIlIlIIIIll(ab() ? 1 : 0)) {
                if (lIIlIlIIIIll(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIlIlIIIlII(Movement.getRunEnergy(), lIllIIIII[13])) {
                    Inventory.getFirst(C0005f.aV).interact(lIlIlllII[lIllIIIII[14]]);
                    Time.sleepTicks(lIllIIIII[2]);
                    "".length();
                }
                if (lIIlIlIIIlIl(Movement.isRunEnabled() ? 1 : 0) && lIIlIlIIlIII(Movement.getRunEnergy(), lIllIIIII[15])) {
                    Movement.toggleRun();
                    Time.sleepTicks(lIllIIIII[14]);
                    "".length();
                }
                if (lIIlIlIIIlII(Game.getWildyLevel(), lIllIIIII[2])) {
                    AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[16]];
                    if (lIIlIlIIIIll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (lIIlIlIIIlIl(Dialog.isOpen() ? 1 : 0) && lIIlIlIIIIll(Inventory.contains(C0005f.ba) ? 1 : 0) && lIIlIlIIlIIl(Players.getLocal().getAnimation(), lIllIIIII[17])) {
                        Inventory.getFirst(C0005f.ba).interact(lIlIlllII[lIllIIIII[18]]);
                        Time.sleepTicks(lIllIIIII[4]);
                        "".length();
                    }
                    String[] strArr = new String[lIllIIIII[4]];
                    strArr[lIllIIIII[1]] = lIlIlllII[lIllIIIII[19]];
                    strArr[lIllIIIII[2]] = lIlIlllII[lIllIIIII[20]];
                    C0006g.a(strArr);
                }
                if (lIIlIlIIIlll(Game.getWildyLevel())) {
                    int[] iArr3 = new int[lIllIIIII[2]];
                    iArr3[lIllIIIII[1]] = lIllIIIII[0];
                    if (lIIlIlIIIIll(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (lIIlIlIIlIII(Players.getLocal().getWorldLocation().distanceTo(lE), lIllIIIII[21])) {
                            AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[22]];
                            WorldPoint[] worldPointArr = new WorldPoint[lIllIIIII[21]];
                            worldPointArr[lIllIIIII[1]] = new WorldPoint(lIllIIIII[23], lIllIIIII[24], lIllIIIII[1]);
                            worldPointArr[lIllIIIII[2]] = new WorldPoint(lIllIIIII[25], lIllIIIII[26], lIllIIIII[1]);
                            worldPointArr[lIllIIIII[4]] = new WorldPoint(lIllIIIII[27], lIllIIIII[28], lIllIIIII[1]);
                            worldPointArr[lIllIIIII[5]] = new WorldPoint(lIllIIIII[29], lIllIIIII[30], lIllIIIII[1]);
                            worldPointArr[lIllIIIII[7]] = new WorldPoint(lIllIIIII[31], lIllIIIII[32], lIllIIIII[1]);
                            worldPointArr[lIllIIIII[14]] = new WorldPoint(lIllIIIII[33], lIllIIIII[34], lIllIIIII[1]);
                            worldPointArr[lIllIIIII[16]] = new WorldPoint(lIllIIIII[35], lIllIIIII[36], lIllIIIII[1]);
                            worldPointArr[lIllIIIII[18]] = new WorldPoint(lIllIIIII[37], lIllIIIII[38], lIllIIIII[1]);
                            worldPointArr[lIllIIIII[19]] = new WorldPoint(lIllIIIII[39], lIllIIIII[38], lIllIIIII[1]);
                            worldPointArr[lIllIIIII[20]] = new WorldPoint(lIllIIIII[40], lIllIIIII[38], lIllIIIII[1]);
                            worldPointArr[lIllIIIII[22]] = new WorldPoint(lIllIIIII[41], lIllIIIII[38], lIllIIIII[1]);
                            worldPointArr[lIllIIIII[42]] = new WorldPoint(lIllIIIII[43], lIllIIIII[44], lIllIIIII[1]);
                            worldPointArr[lIllIIIII[45]] = new WorldPoint(lIllIIIII[46], lIllIIIII[44], lIllIIIII[1]);
                            Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                            "".length();
                            Time.sleepTicks(lIllIIIII[2]);
                            "".length();
                        }
                        if (lIIlIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo(lE), lIllIIIII[21])) {
                            AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[42]];
                            String[] strArr2 = new String[lIllIIIII[2]];
                            strArr2[lIllIIIII[1]] = lIlIlllII[lIllIIIII[45]];
                            TileObject nearest2 = TileObjects.getNearest(strArr2);
                            String[] strArr3 = new String[lIllIIIII[2]];
                            strArr3[lIllIIIII[1]] = lIlIlllII[lIllIIIII[21]];
                            TileObject nearest3 = TileObjects.getNearest(strArr3);
                            String[] strArr4 = new String[lIllIIIII[2]];
                            strArr4[lIllIIIII[1]] = lIlIlllII[lIllIIIII[47]];
                            if (lIIlIlIIIIll(nearest3.hasAction(strArr4) ? 1 : 0)) {
                                nearest3.interact(lIlIlllII[lIllIIIII[48]]);
                            }
                            if (lIIlIlIIIllI(nearest2)) {
                                String[] strArr5 = new String[lIllIIIII[2]];
                                strArr5[lIllIIIII[1]] = lIlIlllII[lIllIIIII[49]];
                                if (lIIlIlIIIlIl(nearest3.hasAction(strArr5) ? 1 : 0)) {
                                    Skills.getExperience(Skill.PRAYER);
                                    int[] iArr4 = new int[lIllIIIII[2]];
                                    iArr4[lIllIIIII[1]] = lIllIIIII[0];
                                    Item first = Inventory.getFirst(iArr4);
                                    String[] strArr6 = new String[lIllIIIII[2]];
                                    strArr6[lIllIIIII[1]] = lIlIlllII[lIllIIIII[50]];
                                    first.useOn(TileObjects.getNearest(strArr6));
                                    Time.sleepTicks(lIllIIIII[2]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[lIllIIIII[2]];
                    iArr5[lIllIIIII[1]] = lIllIIIII[0];
                    if (lIIlIlIIIlIl(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIllIIIII[2]];
                        iArr6[lIllIIIII[1]] = lIllIIIII[51];
                        if (lIIlIlIIIIll(Inventory.contains(iArr6) ? 1 : 0)) {
                            if (lIIlIlIIlIII(Players.getLocal().getWorldLocation().distanceTo(lE), lIllIIIII[21])) {
                                AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[52]];
                                WorldPoint[] worldPointArr2 = new WorldPoint[lIllIIIII[21]];
                                worldPointArr2[lIllIIIII[1]] = new WorldPoint(lIllIIIII[23], lIllIIIII[24], lIllIIIII[1]);
                                worldPointArr2[lIllIIIII[2]] = new WorldPoint(lIllIIIII[25], lIllIIIII[26], lIllIIIII[1]);
                                worldPointArr2[lIllIIIII[4]] = new WorldPoint(lIllIIIII[27], lIllIIIII[28], lIllIIIII[1]);
                                worldPointArr2[lIllIIIII[5]] = new WorldPoint(lIllIIIII[29], lIllIIIII[30], lIllIIIII[1]);
                                worldPointArr2[lIllIIIII[7]] = new WorldPoint(lIllIIIII[31], lIllIIIII[32], lIllIIIII[1]);
                                worldPointArr2[lIllIIIII[14]] = new WorldPoint(lIllIIIII[33], lIllIIIII[34], lIllIIIII[1]);
                                worldPointArr2[lIllIIIII[16]] = new WorldPoint(lIllIIIII[35], lIllIIIII[36], lIllIIIII[1]);
                                worldPointArr2[lIllIIIII[18]] = new WorldPoint(lIllIIIII[37], lIllIIIII[38], lIllIIIII[1]);
                                worldPointArr2[lIllIIIII[19]] = new WorldPoint(lIllIIIII[39], lIllIIIII[38], lIllIIIII[1]);
                                worldPointArr2[lIllIIIII[20]] = new WorldPoint(lIllIIIII[40], lIllIIIII[38], lIllIIIII[1]);
                                worldPointArr2[lIllIIIII[22]] = new WorldPoint(lIllIIIII[41], lIllIIIII[38], lIllIIIII[1]);
                                worldPointArr2[lIllIIIII[42]] = new WorldPoint(lIllIIIII[43], lIllIIIII[44], lIllIIIII[1]);
                                worldPointArr2[lIllIIIII[45]] = new WorldPoint(lIllIIIII[46], lIllIIIII[44], lIllIIIII[1]);
                                Walker.walkAlong(Arrays.asList(worldPointArr2), new HashMap());
                                "".length();
                                Time.sleepTicks(lIllIIIII[2]);
                                "".length();
                            }
                            if (lIIlIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo(lE), lIllIIIII[21])) {
                                AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[53]];
                                if (!lIIlIlIIIlIl(Dialog.canLevelUpContinue() ? 1 : 0) || lIIlIlIIIIll(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] strArr7 = new String[lIllIIIII[2]];
                                strArr7[lIllIIIII[1]] = lIlIlllII[lIllIIIII[15]];
                                NPC nearest4 = NPCs.getNearest(strArr7);
                                String[] strArr8 = new String[lIllIIIII[2]];
                                strArr8[lIllIIIII[1]] = lIlIlllII[lIllIIIII[54]];
                                TileObject nearest5 = TileObjects.getNearest(strArr8);
                                String[] strArr9 = new String[lIllIIIII[2]];
                                strArr9[lIllIIIII[1]] = lIlIlllII[lIllIIIII[55]];
                                if (lIIlIlIIIIll(nearest5.hasAction(strArr9) ? 1 : 0)) {
                                    nearest5.interact(lIlIlllII[lIllIIIII[56]]);
                                }
                                if (lIIlIlIIIllI(nearest4)) {
                                    String[] strArr10 = new String[lIllIIIII[2]];
                                    strArr10[lIllIIIII[1]] = lIlIlllII[lIllIIIII[57]];
                                    if (lIIlIlIIIlIl(nearest5.hasAction(strArr10) ? 1 : 0)) {
                                        if (lIIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                            int[] iArr7 = new int[lIllIIIII[2]];
                                            iArr7[lIllIIIII[1]] = lIllIIIII[51];
                                            Inventory.getFirst(iArr7).useOn(nearest4);
                                            Time.sleepTicks(lIllIIIII[4]);
                                            "".length();
                                        }
                                        if (lIIlIlIIIIll(Dialog.isOpen() ? 1 : 0)) {
                                            List options = Dialog.getOptions();
                                            if (lIIlIlIIIlIl(options.isEmpty() ? 1 : 0)) {
                                                int i = lIllIIIII[1];
                                                while (lIIlIlIIIlII(i, options.size())) {
                                                    int[] iArr8 = new int[lIllIIIII[2]];
                                                    iArr8[lIllIIIII[1]] = lIllIIIII[51];
                                                    if (lIIlIlIIlIIl(((Item) Inventory.getAll(iArr8).get(lIllIIIII[1])).getQuantity(), lIllIIIII[2]) && lIIlIlIIIIll(((Widget) options.get(i)).getText().contains(lIlIlllII[lIllIIIII[58]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIllIIIII[2]);
                                                        Time.sleepTicks(lIllIIIII[4]);
                                                        "".length();
                                                    }
                                                    int[] iArr9 = new int[lIllIIIII[2]];
                                                    iArr9[lIllIIIII[1]] = lIllIIIII[51];
                                                    if (lIIlIlIIlIIl(((Item) Inventory.getAll(iArr9).get(lIllIIIII[1])).getQuantity(), lIllIIIII[14]) && lIIlIlIIIIll(((Widget) options.get(i)).getText().contains(lIlIlllII[lIllIIIII[59]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIllIIIII[2]);
                                                        Time.sleepTicks(lIllIIIII[4]);
                                                        "".length();
                                                    }
                                                    if (lIIlIlIIIIll(((Widget) options.get(i)).getText().contains(lIlIlllII[lIllIIIII[60]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIllIIIII[2]);
                                                        Time.sleepTicks(lIllIIIII[4]);
                                                        "".length();
                                                    }
                                                    i++;
                                                    "".length();
                                                    if (" ".length() < (-" ".length())) {
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
            int[] iArr10 = new int[lIllIIIII[2]];
            iArr10[lIllIIIII[1]] = lIllIIIII[10];
            if (lIIlIlIIIIll(Inventory.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lIllIIIII[2]];
                iArr11[lIllIIIII[1]] = lIllIIIII[0];
                if (!lIIlIlIIIlIl(Inventory.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[lIllIIIII[2]];
                iArr12[lIllIIIII[1]] = lIllIIIII[51];
                if (!lIIlIlIIIlIl(Inventory.contains(iArr12) ? 1 : 0)) {
                    return;
                }
            }
            if (lIIlIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo(lE), lIllIIIII[21])) {
                AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[61]];
                String[] strArr11 = new String[lIllIIIII[2]];
                strArr11[lIllIIIII[1]] = lIlIlllII[lIllIIIII[62]];
                TileItem nearest6 = TileItems.getNearest(strArr11);
                if (lIIlIlIIIllI(nearest6)) {
                    nearest6.interact(lIlIlllII[lIllIIIII[63]]);
                }
            }
        }
    }

    private static String lIIlIIllIIlI(String llIllllllllIlI, String llIllllllllIIl) {
        try {
            SecretKeySpec llIlllllllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllllllllIIl.getBytes(StandardCharsets.UTF_8)), lIllIIIII[19]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIIII[4], llIlllllllllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIllllllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllllllllIll) {
            llIllllllllIll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIllIIIl(String llIllllllIlIlI, String llIllllllIlIIl) {
        String llIllllllIlIlI2 = new String(Base64.getDecoder().decode(llIllllllIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llIllllllIIlll = llIllllllIlIIl.toCharArray();
        int llIllllllIIllI = lIllIIIII[1];
        char[] charArray = llIllllllIlIlI2.toCharArray();
        int length = charArray.length;
        int i = lIllIIIII[1];
        while (lIIlIlIIIlII(i, length)) {
            sb.append((char) (charArray[i] ^ llIllllllIIlll[llIllllllIIllI % llIllllllIIlll.length]));
            "".length();
            llIllllllIIllI++;
            i++;
            "".length();
            if ((((87 ^ 94) ^ (5 ^ 32)) & (((124 ^ 22) ^ (209 ^ 151)) ^ (-" ".length()))) < (((29 ^ 99) ^ (30 ^ 0)) & (((((93 + 127) - 123) + 144) ^ (((140 + 24) - 121) + 102)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIlIIIlll(int i) {
        return i > 0;
    }

    private static boolean lIIlIlIIIIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIlIlIIlIll(Skills.getLevel(Skill.PRAYER), lIllIIIII[3])) {
            ?? r0 = lIllIIIII[2];
            "".length();
            return ("  ".length() & ("  ".length() ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIIII[1];
    }

    static {
        lIIlIlIIIIlI();
        lIIlIlIIIIIl();
        lC = new WorldPoint(lIllIIIII[77], lIllIIIII[78], lIllIIIII[1]);
        lD = new WorldPoint(lIllIIIII[79], lIllIIIII[80], lIllIIIII[1]);
        lE = new WorldPoint(lIllIIIII[81], lIllIIIII[82], lIllIIIII[1]);
        lF = new WorldPoint(lIllIIIII[83], lIllIIIII[44], lIllIIIII[1]);
        lG = new WorldPoint(lIllIIIII[1], lIllIIIII[1], lIllIIIII[1]);
        lH = new WorldPoint(lIllIIIII[1], lIllIIIII[1], lIllIIIII[1]);
        lI = new WorldPoint(lIllIIIII[84], lIllIIIII[85], lIllIIIII[1]);
        bv = new ArrayList();
    }

    private static boolean lIIlIlIIIllI(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIlIIlIII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIlIIlIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIlIIlIlI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
        if (lIIlIlIIIIll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ab() {
        int[] iArr = new int[lIllIIIII[2]];
        iArr[lIllIIIII[1]] = lIllIIIII[10];
        if (lIIlIlIIIIll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIllIIIII[2]];
            iArr2[lIllIIIII[1]] = lIllIIIII[10];
            if (lIIlIlIIlIll(Inventory.getFirst(iArr2).getQuantity(), lIllIIIII[13])) {
                if (lIIlIlIIIlIl(Inventory.contains(C0005f.ba) ? 1 : 0)) {
                    if (lIIlIlIIIIll(Equipment.contains(C0005f.ba) ? 1 : 0)) {
                        int[] iArr3 = new int[lIllIIIII[2]];
                        iArr3[lIllIIIII[1]] = lIllIIIII[0];
                        if (lIIlIlIIIlIl(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIllIIIII[2]];
                            iArr4[lIllIIIII[1]] = lIllIIIII[51];
                        }
                    }
                }
                ?? r0 = lIllIIIII[2];
                "".length();
                return (((((148 + 180) - 273) + 153) ^ (((7 + 115) - 75) + 96)) & (((255 ^ 140) ^ (60 ^ 16)) ^ (-" ".length()))) != 0 ? ((1 ^ 90) ^ (14 ^ 73)) & (((9 ^ 5) ^ (0 ^ 16)) ^ (-" ".length())) : r0;
            }
        }
        return lIllIIIII[1];
    }

    private static boolean lIIlIlIIIlII(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIIllIIII(String llIlllllIlIlIl, String llIlllllIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlllllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlllllIlIlll = Cipher.getInstance("Blowfish");
            llIlllllIlIlll.init(lIllIIIII[4], secretKeySpec);
            return new String(llIlllllIlIlll.doFinal(Base64.getDecoder().decode(llIlllllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlllllIlIllI) {
            llIlllllIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlIll(int i, int i2) {
        return i >= i2;
    }
}
