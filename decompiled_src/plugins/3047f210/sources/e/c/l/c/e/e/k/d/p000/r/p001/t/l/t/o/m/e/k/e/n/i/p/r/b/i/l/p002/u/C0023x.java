package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
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
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.x  reason: invalid package and case insensitive filesystem */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/x.class */
public class C0023x implements S {
    static /* synthetic */ String[] bQ;
    public static /* synthetic */ WorldPoint gh;
    public static /* synthetic */ WorldArea ge;
    public static /* synthetic */ WorldPoint gi;

    /* renamed from: gg  reason: collision with root package name */
    public static /* synthetic */ WorldPoint f2gg;
    private static /* synthetic */ String[] llllIIlIIl;
    static /* synthetic */ boolean cl;
    public static /* synthetic */ WorldPoint gj;
    public static /* synthetic */ List<C0003d> bu;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ WorldPoint gk;
    private static /* synthetic */ int[] llllIIlIlI;
    static /* synthetic */ int ck;
    public static /* synthetic */ WorldPoint gf;
    public static /* synthetic */ WorldPoint gl;
    /* synthetic */ WorldArea gm = new WorldArea(llllIIlIlI[0], llllIIlIlI[1], llllIIlIlI[2], llllIIlIlI[3], llllIIlIlI[4]);
    /* synthetic */ WorldArea gn = new WorldArea(llllIIlIlI[0], llllIIlIlI[1], llllIIlIlI[2], llllIIlIlI[3], llllIIlIlI[5]);
    /* synthetic */ WorldArea go = new WorldArea(llllIIlIlI[0], llllIIlIlI[1], llllIIlIlI[2], llllIIlIlI[3], llllIIlIlI[6]);

    private static boolean llIIllIllIIII(int i, int i2) {
        return i != i2;
    }

    private static boolean llIIllIlIlIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean aa() {
        int[] iArr = new int[llllIIlIlI[13]];
        iArr[llllIIlIlI[4]] = llllIIlIlI[14];
        iArr[llllIIlIlI[5]] = llllIIlIlI[15];
        iArr[llllIIlIlI[6]] = llllIIlIlI[16];
        iArr[llllIIlIlI[11]] = llllIIlIlI[17];
        iArr[llllIIlIlI[12]] = llllIIlIlI[18];
        iArr[llllIIlIlI[19]] = llllIIlIlI[20];
        iArr[llllIIlIlI[21]] = llllIIlIlI[22];
        iArr[llllIIlIlI[23]] = llllIIlIlI[24];
        int lllllllllllllllllIlIllIlIlllIIlI = llllIIlIlI[4];
        while (llIIllIlIlIII(lllllllllllllllllIlIllIlIlllIIlI, iArr.length)) {
            int[] iArr2 = new int[llllIIlIlI[5]];
            iArr2[llllIIlIlI[4]] = iArr[lllllllllllllllllIlIllIlIlllIIlI];
            if (llIIllIlIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                return llllIIlIlI[4];
            }
            lllllllllllllllllIlIllIlIlllIIlI++;
            "".length();
            if ((-"  ".length()) > 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llllIIlIlI[5];
    }

    private static boolean llIIllIlIllll(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIllIlIllII(Object obj) {
        return obj != null;
    }

    private static boolean llIIllIlIlIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIllIlIIlll(int i) {
        return i != 0;
    }

    private static void llIIllIlIIlIl() {
        llllIIlIlI = new int[119];
        llllIIlIlI[0] = (-31505) & 32567;
        llllIIlIlI[1] = (-((-1159) & 17583)) & (-5637) & 24575;
        llllIIlIlI[2] = (-((-7227) & 15611)) & (-4103) & 15351;
        llllIIlIlI[3] = (-6529) & 8111;
        llllIIlIlI[4] = (2 ^ 21) & ((134 ^ 145) ^ (-1));
        llllIIlIlI[5] = " ".length();
        llllIIlIlI[6] = "  ".length();
        llllIIlIlI[7] = 127 ^ 96;
        llllIIlIlI[8] = (58 ^ 55) ^ (255 ^ 150);
        llllIIlIlI[9] = 0 ^ 16;
        llllIIlIlI[10] = (-11362) & 16361;
        llllIIlIlI[11] = "   ".length();
        llllIIlIlI[12] = " ".length() ^ (128 ^ 133);
        llllIIlIlI[13] = (((104 + 73) - 63) + 52) ^ (((111 + 131) - 134) + 66);
        llllIIlIlI[14] = (-((-1825) & 18217)) & (-8369) & 32767;
        llllIIlIlI[15] = (-((-12657) & 30717)) & (-2083) & 32767;
        llllIIlIlI[16] = (-((-8737) & 32365)) & (-2) & 24575;
        llllIIlIlI[17] = (-26145) & 28453;
        llllIIlIlI[18] = (-18433) & 20349;
        llllIIlIlI[19] = 140 ^ 137;
        llllIIlIlI[20] = (-((-3978) & 32683)) & (-1409) & 32255;
        llllIIlIlI[21] = 161 ^ 167;
        llllIIlIlI[22] = (-51) & 8059;
        llllIIlIlI[23] = 134 ^ 129;
        llllIIlIlI[24] = (-((-645) & 31621)) & (-11) & 32251;
        llllIIlIlI[25] = (24 ^ 56) ^ (119 ^ 93);
        llllIIlIlI[26] = (-((-2433) & 28662)) & (-1) & 28663;
        llllIIlIlI[27] = (-((-2333) & 31135)) & (-2569) & 32703;
        llllIIlIlI[28] = (-9861) & 10239;
        llllIIlIlI[29] = (-18605) & 31231;
        llllIIlIlI[30] = 81 ^ 99;
        llllIIlIlI[31] = (131 ^ 144) ^ (79 ^ 75);
        llllIIlIlI[32] = 40 ^ 33;
        llllIIlIlI[33] = (-((-24613) & 28927)) & (-1) & 16379;
        llllIIlIlI[34] = 88 ^ 87;
        llllIIlIlI[35] = (30 ^ 25) ^ (35 ^ 47);
        llllIIlIlI[36] = 141 ^ 129;
        llllIIlIlI[37] = 81 ^ 92;
        llllIIlIlI[38] = 178 ^ 188;
        llllIIlIlI[39] = (-((-24865) & 29673)) & (-305) & 8189;
        llllIIlIlI[40] = (-((-3421) & 32095)) & (-2) & 32111;
        llllIIlIlI[41] = (-4130) & 7207;
        llllIIlIlI[42] = (-515) & 3947;
        llllIIlIlI[43] = (-((-6147) & 22971)) & (-12801) & 32703;
        llllIIlIlI[44] = (-16917) & 20343;
        llllIIlIlI[45] = (-29137) & 32219;
        llllIIlIlI[46] = (-12929) & 16350;
        llllIIlIlI[47] = (-((-18961) & 31251)) & (-609) & 15983;
        llllIIlIlI[48] = (-29189) & 32604;
        llllIIlIlI[49] = (((((157 + 34) - 95) + 82) + (119 ^ 94)) - (212 ^ 180)) + (241 ^ 172);
        llllIIlIlI[50] = 34 ^ 10;
        llllIIlIlI[51] = (121 ^ 5) ^ (255 ^ 146);
        llllIIlIlI[52] = 159 ^ 141;
        llllIIlIlI[53] = (22 ^ 37) ^ (162 ^ 130);
        llllIIlIlI[54] = (-((-2053) & 31293)) & (-385) & 32698;
        llllIIlIlI[55] = 110 ^ 122;
        llllIIlIlI[56] = (-25237) & 28670;
        llllIIlIlI[57] = 20 ^ 1;
        llllIIlIlI[58] = (74 ^ 85) ^ (169 ^ 160);
        llllIIlIlI[59] = (37 ^ 3) ^ (149 ^ 171);
        llllIIlIlI[60] = 149 ^ 140;
        llllIIlIlI[61] = 112 ^ 106;
        llllIIlIlI[62] = 132 ^ 159;
        llllIIlIlI[63] = 17 ^ 13;
        llllIIlIlI[64] = 6 ^ 27;
        llllIIlIlI[65] = (-4127) & 16190;
        llllIIlIlI[66] = (233 ^ 176) ^ (231 ^ 160);
        llllIIlIlI[67] = (76 ^ 40) ^ (126 ^ 58);
        llllIIlIlI[68] = (16 ^ 120) ^ (140 ^ 197);
        llllIIlIlI[69] = 47 ^ 13;
        llllIIlIlI[70] = (132 ^ 189) ^ (173 ^ 183);
        llllIIlIlI[71] = (97 ^ 92) ^ (124 ^ 101);
        llllIIlIlI[72] = (69 ^ 6) ^ (230 ^ 128);
        llllIIlIlI[73] = (123 ^ 13) ^ (144 ^ 192);
        llllIIlIlI[74] = (38 ^ 72) ^ (112 ^ 57);
        llllIIlIlI[75] = (66 ^ 9) ^ (48 ^ 82);
        llllIIlIlI[76] = (26 ^ 63) ^ (178 ^ 189);
        llllIIlIlI[77] = 65 ^ 106;
        llllIIlIlI[78] = (((53 + 35) - (-1)) + 51) ^ (((32 + 74) - 77) + 131);
        llllIIlIlI[79] = (((122 + 7) - 6) + 54) ^ (((85 + 38) - 103) + 136);
        llllIIlIlI[80] = (86 ^ 32) ^ (251 ^ 163);
        llllIIlIlI[81] = (((137 + 48) - 143) + 105) ^ (((139 + 33) - 142) + 158);
        llllIIlIlI[82] = (19 ^ 35) ^ ((134 ^ 137) & ((207 ^ 192) ^ (-1)));
        llllIIlIlI[83] = 115 ^ 66;
        llllIIlIlI[84] = (155 ^ 171) ^ "   ".length();
        llllIIlIlI[85] = 195 ^ 187;
        llllIIlIlI[86] = (248 ^ 137) ^ (93 ^ 24);
        llllIIlIlI[87] = 96 ^ 85;
        llllIIlIlI[88] = (-((-8839) & 29342)) & (-9345) & 32767;
        llllIIlIlI[89] = (-((-8915) & 25599)) & (-4098) & 30701;
        llllIIlIlI[90] = (-((-65) & 26689)) & (-68) & 28411;
        llllIIlIlI[91] = (-20481) & 32460;
        llllIIlIlI[92] = (-((-24738) & 31913)) & (-1) & 32175;
        llllIIlIlI[93] = (-26754) & 28153;
        llllIIlIlI[94] = (((112 + 166) - 134) + 26) ^ (((68 + 106) - 149) + 131);
        llllIIlIlI[95] = 40 ^ 31;
        llllIIlIlI[96] = (38 ^ 115) ^ (254 ^ 147);
        llllIIlIlI[97] = (((120 + 9) - 14) + 39) ^ (((28 + 71) - (-21)) + 43);
        llllIIlIlI[98] = (-((-4371) & 28983)) & (-1) & 27773;
        llllIIlIlI[99] = (-((-18178) & 30487)) & (-16385) & 32055;
        llllIIlIlI[100] = ((60 + 98) - 126) + 96;
        llllIIlIlI[101] = (63 ^ 3) ^ (16 ^ 75);
        llllIIlIlI[102] = (-9217) & 12219;
        llllIIlIlI[103] = (-12994) & 16079;
        llllIIlIlI[104] = (-((-18503) & 23247)) & (-8193) & 16351;
        llllIIlIlI[105] = (-21459) & 24534;
        llllIIlIlI[106] = (-12929) & 16366;
        llllIIlIlI[107] = (-((-3137) & 32237)) & (-65) & 32252;
        llllIIlIlI[108] = (-8205) & 11676;
        llllIIlIlI[109] = (-2) & 3231;
        llllIIlIlI[110] = (-16521) & 19919;
        llllIIlIlI[111] = (-((-8433) & 12529)) & (-1025) & 8077;
        llllIIlIlI[112] = (-20499) & 23867;
        llllIIlIlI[113] = (-((-17923) & 30283)) & (-1029) & 16383;
        llllIIlIlI[114] = (-((-4529) & 29178)) & (-513) & 28655;
        llllIIlIlI[115] = 174 ^ 148;
        llllIIlIlI[116] = (32 ^ 21) ^ (137 ^ 135);
        llllIIlIlI[117] = 77 ^ 113;
        llllIIlIlI[118] = 120 ^ 69;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v539, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v559, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v566, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    public static void bQ() {
        if (llIIllIlIIlll(bs ? 1 : 0)) {
            C0001b.a(bu);
            if (llIIllIlIlIII(bu.size(), llllIIlIlI[5])) {
                System.out.println(llllIIlIIl[llllIIlIlI[4]]);
                bs = llllIIlIlI[4];
            }
        }
        if (llIIllIlIlIIl(bs ? 1 : 0)) {
            if (llIIllIlIlIII(C0004e.j(llllIIlIlI[7]), llllIIlIlI[8])) {
                C.cb();
            }
            if (llIIllIlIlIlI(C0004e.j(llllIIlIlI[7]), llllIIlIlI[8]) && llIIllIlIlIII(C0004e.H(), llllIIlIlI[9])) {
                System.out.println(llllIIlIIl[llllIIlIlI[5]]);
                AccBuilderTempleTrek.d = llllIIlIlI[5];
                return;
            }
            if (llIIllIlIlIIl(aa() ? 1 : 0) && llIIllIlIlIIl(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId())) && llIIllIlIlIlI(C0004e.j(llllIIlIlI[7]), llllIIlIlI[8]) && llIIllIlIlIll(C0004e.H(), llllIIlIlI[9])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIllIlIllII(nearest) && llIIllIlIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[6]];
                    C0000a.a(nearest);
                }
                if (llIIllIlIllII(nearest) && llIIllIlIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIllIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllIIlIlI[10]);
                        "".length();
                    }
                    if (llIIllIlIIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[11]];
                        if (llIIllIlIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllIIlIlI[12]);
                            "".length();
                        }
                        if (llIIllIlIllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llllIIlIlI[6]);
                            "".length();
                        }
                        int[] iArr = new int[llllIIlIlI[13]];
                        iArr[llllIIlIlI[4]] = llllIIlIlI[14];
                        iArr[llllIIlIlI[5]] = llllIIlIlI[15];
                        iArr[llllIIlIlI[6]] = llllIIlIlI[16];
                        iArr[llllIIlIlI[11]] = llllIIlIlI[17];
                        iArr[llllIIlIlI[12]] = llllIIlIlI[18];
                        iArr[llllIIlIlI[19]] = llllIIlIlI[20];
                        iArr[llllIIlIlI[21]] = llllIIlIlI[22];
                        iArr[llllIIlIlI[23]] = llllIIlIlI[24];
                        if (llIIllIlIlIIl(C0004e.b(iArr) ? 1 : 0)) {
                            ae();
                            System.out.println(llllIIlIIl[llllIIlIlI[12]]);
                            bs = llllIIlIlI[5];
                            return;
                        }
                        int[] iArr2 = new int[llllIIlIlI[13]];
                        iArr2[llllIIlIlI[4]] = llllIIlIlI[14];
                        iArr2[llllIIlIlI[5]] = llllIIlIlI[15];
                        iArr2[llllIIlIlI[6]] = llllIIlIlI[16];
                        iArr2[llllIIlIlI[11]] = llllIIlIlI[17];
                        iArr2[llllIIlIlI[12]] = llllIIlIlI[18];
                        iArr2[llllIIlIlI[19]] = llllIIlIlI[20];
                        iArr2[llllIIlIlI[21]] = llllIIlIlI[22];
                        iArr2[llllIIlIlI[23]] = llllIIlIlI[24];
                        if (llIIllIlIIlll(C0004e.b(iArr2) ? 1 : 0)) {
                            C0000a.a(llllIIlIlI[14], llllIIlIlI[25]);
                            C0000a.a(llllIIlIlI[22], llllIIlIlI[25]);
                            C0000a.a(llllIIlIlI[15], llllIIlIlI[6]);
                            C0000a.a(llllIIlIlI[16], llllIIlIlI[5]);
                            C0000a.a(llllIIlIlI[17], llllIIlIlI[5]);
                            C0000a.a(llllIIlIlI[18], llllIIlIlI[5]);
                            C0000a.a(llllIIlIlI[24], llllIIlIlI[5]);
                            C0000a.a(llllIIlIlI[20], llllIIlIlI[5]);
                            C0000a.a(llllIIlIlI[26], llllIIlIlI[6]);
                            C0000a.a(llllIIlIlI[27], llllIIlIlI[5]);
                            C0000a.a(llllIIlIlI[28], llllIIlIlI[19]);
                            int[] iArr3 = new int[llllIIlIlI[5]];
                            iArr3[llllIIlIlI[4]] = llllIIlIlI[15];
                            if (llIIllIlIlIlI(Inventory.getAll(iArr3).size(), llllIIlIlI[5])) {
                                C0000a.a(llllIIlIlI[29], llllIIlIlI[6]);
                            }
                        }
                    }
                }
            }
            if (llIIllIlIIlll(Inventory.contains(C0005f.aU) ? 1 : 0) && llIIllIlIlIII(Movement.getRunEnergy(), llllIIlIlI[30])) {
                Inventory.getFirst(C0005f.aU).interact(llllIIlIIl[llllIIlIlI[19]]);
                Time.sleepTicks(llllIIlIlI[5]);
                "".length();
            }
            if (llIIllIlIlIII(Prayers.getPoints(), llllIIlIlI[31]) && llIIllIlIIlll(Inventory.contains(C0005f.aR) ? 1 : 0)) {
                Inventory.getFirst(C0005f.aR).interact(llllIIlIIl[llllIIlIlI[21]]);
                Time.sleepTicks(llllIIlIlI[6]);
                "".length();
            }
            if (llIIllIlIIlll(aa() ? 1 : 0) && llIIllIlIlIIl(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()))) {
                if (llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gf), llllIIlIlI[19])) {
                    AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[23]];
                    if (llIIllIlIIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(gf);
                    "".length();
                    Time.sleepTicks(llllIIlIlI[5]);
                    "".length();
                }
                if (llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gf), llllIIlIlI[19])) {
                    AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[13]];
                    C0006g.a(llllIIlIIl[llllIIlIlI[32]], bQ);
                }
            }
            if (!llIIllIllIIII(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[19]) || llIIllIlIlIlI(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[23])) {
                C0006g.a(bQ);
            }
            if (llIIllIlIlIlI(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[25])) {
                if (!llIIllIlIlIll(Vars.getBit(llllIIlIlI[33]), llllIIlIlI[19]) || llIIllIlIlIlI(Vars.getBit(llllIIlIlI[33]), llllIIlIlI[34])) {
                    if (llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(f2gg), llllIIlIlI[5])) {
                        if (llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gh), llllIIlIlI[21])) {
                            String[] strArr = new String[llllIIlIlI[5]];
                            strArr[llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[25]];
                            TileObject nearest2 = TileObjects.getNearest(strArr);
                            String[] strArr2 = new String[llllIIlIlI[5]];
                            strArr2[llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[35]];
                            if (llIIllIlIIlll(nearest2.hasAction(strArr2) ? 1 : 0)) {
                                String[] strArr3 = new String[llllIIlIlI[5]];
                                strArr3[llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[36]];
                                TileObjects.getNearest(strArr3).interact(llllIIlIIl[llllIIlIlI[37]]);
                                Time.sleepTicks(llllIIlIlI[6]);
                                "".length();
                            }
                            String[] strArr4 = new String[llllIIlIlI[5]];
                            strArr4[llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[38]];
                            TileObject nearest3 = TileObjects.getNearest(strArr4);
                            String[] strArr5 = new String[llllIIlIlI[5]];
                            strArr5[llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[34]];
                            if (llIIllIlIlIIl(nearest3.hasAction(strArr5) ? 1 : 0)) {
                                WorldPoint[] worldPointArr = new WorldPoint[llllIIlIlI[19]];
                                worldPointArr[llllIIlIlI[4]] = new WorldPoint(llllIIlIlI[39], llllIIlIlI[40], llllIIlIlI[4]);
                                worldPointArr[llllIIlIlI[5]] = new WorldPoint(llllIIlIlI[41], llllIIlIlI[42], llllIIlIlI[4]);
                                worldPointArr[llllIIlIlI[6]] = new WorldPoint(llllIIlIlI[43], llllIIlIlI[44], llllIIlIlI[4]);
                                worldPointArr[llllIIlIlI[11]] = new WorldPoint(llllIIlIlI[45], llllIIlIlI[46], llllIIlIlI[4]);
                                worldPointArr[llllIIlIlI[12]] = new WorldPoint(llllIIlIlI[47], llllIIlIlI[48], llllIIlIlI[4]);
                                Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                                "".length();
                                Time.sleepTicks(llllIIlIlI[5]);
                                "".length();
                            }
                        }
                        if (llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gh), llllIIlIlI[21])) {
                            AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[9]];
                            Movement.walkTo(f2gg);
                            "".length();
                            Time.sleepTicks(llllIIlIlI[5]);
                            "".length();
                        }
                    }
                    if (llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(f2gg), llllIIlIlI[5])) {
                        if (llIIllIlIlIlI(Vars.getBit(llllIIlIlI[33]), llllIIlIlI[34]) && llIIllIlIllII(Widgets.get(llllIIlIlI[49], llllIIlIlI[6])) && llIIllIlIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                            Widgets.get(llllIIlIlI[49], llllIIlIlI[6]).getChild(llllIIlIlI[50]).interact(llllIIlIIl[llllIIlIlI[51]]);
                            Time.sleepTicks(llllIIlIlI[6]);
                            "".length();
                        }
                        if (llIIllIlIlIII(Vars.getBit(llllIIlIlI[33]), llllIIlIlI[19])) {
                            AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[52]];
                            C0006g.a(llllIIlIIl[llllIIlIlI[53]], bQ);
                        }
                    }
                }
                if (llIIllIlIlIlI(Vars.getBit(llllIIlIlI[33]), llllIIlIlI[19])) {
                    WorldArea worldArea = new WorldArea(llllIIlIlI[54], llllIIlIlI[40], llllIIlIlI[32], llllIIlIlI[25], llllIIlIlI[4]);
                    if (llIIllIlIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[55]];
                        if (llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gh), llllIIlIlI[21])) {
                            Movement.walkTo(new WorldPoint(llllIIlIlI[41], llllIIlIlI[56], llllIIlIlI[4]));
                            "".length();
                            Time.sleepTicks(llllIIlIlI[5]);
                            "".length();
                        }
                        if (llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gh), llllIIlIlI[21])) {
                            String[] strArr6 = new String[llllIIlIlI[5]];
                            strArr6[llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[57]];
                            TileObject nearest4 = TileObjects.getNearest(strArr6);
                            String[] strArr7 = new String[llllIIlIlI[5]];
                            strArr7[llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[58]];
                            if (llIIllIlIIlll(nearest4.hasAction(strArr7) ? 1 : 0)) {
                                String[] strArr8 = new String[llllIIlIlI[5]];
                                strArr8[llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[31]];
                                TileObjects.getNearest(strArr8).interact(llllIIlIIl[llllIIlIlI[59]]);
                                Time.sleepTicks(llllIIlIlI[6]);
                                "".length();
                            }
                            String[] strArr9 = new String[llllIIlIlI[5]];
                            strArr9[llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[60]];
                            TileObject nearest5 = TileObjects.getNearest(strArr9);
                            String[] strArr10 = new String[llllIIlIlI[5]];
                            strArr10[llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[61]];
                            if (llIIllIlIlIIl(nearest5.hasAction(strArr10) ? 1 : 0)) {
                                C0006g.a(llllIIlIIl[llllIIlIlI[62]], bQ);
                            }
                        }
                    }
                    if (llIIllIlIIlll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[63]];
                        C0006g.a(llllIIlIIl[llllIIlIlI[64]], bQ);
                    }
                }
                if (llIIllIlIlIlI(Vars.getBit(llllIIlIlI[33]), llllIIlIlI[25])) {
                    C0006g.a(bQ);
                }
            }
            if (llIIllIlIlIlI(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[34])) {
                ck = llllIIlIlI[4];
                if (llIIllIlIlIIl(Vars.getBit(llllIIlIlI[65]))) {
                    if (llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gi), llllIIlIlI[19])) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[66]];
                        Movement.walkTo(gi);
                        "".length();
                        Time.sleepTicks(llllIIlIlI[5]);
                        "".length();
                    }
                    if (llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gi), llllIIlIlI[19])) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[7]];
                        C0006g.a(llllIIlIIl[llllIIlIlI[67]], bQ);
                    }
                }
                if (llIIllIlIlIlI(Vars.getBit(llllIIlIlI[65]), llllIIlIlI[19])) {
                    if (llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gj), llllIIlIlI[21])) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[68]];
                        Movement.walkTo(gj);
                        "".length();
                        Time.sleepTicks(llllIIlIlI[5]);
                        "".length();
                    }
                    if (llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gj), llllIIlIlI[21])) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[69]];
                        C0006g.a(llllIIlIIl[llllIIlIlI[70]], bQ);
                    }
                }
                if (llIIllIlIlIlI(Vars.getBit(llllIIlIlI[65]), llllIIlIlI[25])) {
                    String[] strArr11 = new String[llllIIlIlI[5]];
                    strArr11[llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[71]];
                    if (llIIllIlIlIIl(Inventory.contains(strArr11) ? 1 : 0)) {
                        String[] strArr12 = new String[llllIIlIlI[5]];
                        strArr12[llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[72]];
                        Item first = Inventory.getFirst(strArr12);
                        String[] strArr13 = new String[llllIIlIlI[5]];
                        strArr13[llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[73]];
                        first.useOn(Inventory.getFirst(strArr13));
                        Time.sleepTicks(llllIIlIlI[5]);
                        "".length();
                    }
                    String[] strArr14 = new String[llllIIlIlI[5]];
                    strArr14[llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[74]];
                    if (llIIllIlIIlll(Inventory.contains(strArr14) ? 1 : 0)) {
                        if (llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gi), llllIIlIlI[19])) {
                            AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[50]];
                            Movement.walkTo(gi);
                            "".length();
                            Time.sleepTicks(llllIIlIlI[5]);
                            "".length();
                        }
                        if (llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gi), llllIIlIlI[19])) {
                            AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[75]];
                            C0006g.a(llllIIlIIl[llllIIlIlI[76]], bQ);
                        }
                    }
                }
                if (llIIllIlIlIlI(Vars.getBit(llllIIlIlI[65]), llllIIlIlI[70])) {
                    C0006g.a(bQ);
                }
                if (llIIllIlIlIlI(Vars.getBit(llllIIlIlI[65]), llllIIlIlI[50])) {
                    if (llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gk), llllIIlIlI[13])) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[77]];
                        Movement.walkTo(gk);
                        "".length();
                        Time.sleepTicks(llllIIlIlI[5]);
                        "".length();
                    }
                    if (llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gk), llllIIlIlI[13])) {
                        C0006g.a(llllIIlIIl[llllIIlIlI[78]], bQ);
                    }
                }
                C0006g.a(bQ);
            }
            if (llIIllIlIlIlI(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[55])) {
                if (llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gl), llllIIlIlI[19])) {
                    AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[79]];
                    if (llIIllIlIIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(gl);
                    "".length();
                    Time.sleepTicks(llllIIlIlI[5]);
                    "".length();
                }
                if (llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gl), llllIIlIlI[19])) {
                    AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[80]];
                    C0006g.a(llllIIlIIl[llllIIlIlI[81]], bQ);
                }
            }
            if (!llIIllIllIIII(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[60]) || !llIIllIllIIII(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[66]) || llIIllIlIlIlI(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[50])) {
                C0006g.a(bQ);
            }
            if (llIIllIlIlIlI(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[70])) {
                C0006g.a(bQ);
                int[] iArr4 = new int[llllIIlIlI[5]];
                iArr4[llllIIlIlI[4]] = llllIIlIlI[27];
                if (llIIllIlIlIIl(Equipment.contains(iArr4) ? 1 : 0)) {
                    int[] iArr5 = new int[llllIIlIlI[5]];
                    iArr5[llllIIlIlI[4]] = llllIIlIlI[27];
                    if (llIIllIlIIlll(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[llllIIlIlI[5]];
                        iArr6[llllIIlIlI[4]] = llllIIlIlI[27];
                        Inventory.getFirst(iArr6).interact(llllIIlIIl[llllIIlIlI[82]]);
                        Time.sleepTicks(llllIIlIlI[5]);
                        "".length();
                    }
                }
                if (llIIllIlIlIIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0) && llIIllIlIlIll(Skills.getLevel(Skill.PRAYER), llllIIlIlI[77]) && llIIllIlIllIl(Prayers.getPoints())) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                TileObject nearest6 = TileObjects.getNearest(tileObject -> {
                    if (llIIllIlIIlll(tileObject.getName().contains(llllIIlIIl[llllIIlIlI[96]]) ? 1 : 0)) {
                        String[] strArr15 = new String[llllIIlIlI[5]];
                        strArr15[llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[97]];
                        if (llIIllIlIIlll(tileObject.hasAction(strArr15) ? 1 : 0)) {
                            ?? r0 = llllIIlIlI[5];
                            "".length();
                            return "  ".length() > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return llllIIlIlI[4];
                });
                if (llIIllIlIllII(nearest6)) {
                    AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[83]];
                    nearest6.interact(llllIIlIIl[llllIIlIlI[30]]);
                    Time.sleepTicks(llllIIlIlI[12]);
                    "".length();
                }
                if (llIIllIllIIIl(llIIllIlIIllI(C0004e.u(), 50.0d))) {
                    int[] iArr7 = new int[llllIIlIlI[5]];
                    iArr7[llllIIlIlI[4]] = llllIIlIlI[28];
                    if (llIIllIlIIlll(Inventory.contains(iArr7) ? 1 : 0)) {
                        int[] iArr8 = new int[llllIIlIlI[5]];
                        iArr8[llllIIlIlI[4]] = llllIIlIlI[28];
                        Inventory.getFirst(iArr8).interact(llllIIlIIl[llllIIlIlI[84]]);
                        Time.sleepTicks(llllIIlIlI[5]);
                        "".length();
                    }
                }
            }
            if (llIIllIlIlIlI(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[85]) && llIIllIlIlIIl(ge.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[86]];
                if (llIIllIlIlIII(ck, llllIIlIlI[5])) {
                    ac.nd += llllIIlIlI[5];
                    ac.d(AccBuilderTempleTrek.m);
                    ck += llllIIlIlI[5];
                    ac.nd = llllIIlIlI[4];
                    cl = llllIIlIlI[4];
                }
                int[] iArr9 = new int[llllIIlIlI[5]];
                iArr9[llllIIlIlI[4]] = llllIIlIlI[14];
                if (llIIllIlIIlll(Inventory.contains(iArr9) ? 1 : 0) && llIIllIlIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                    int[] iArr10 = new int[llllIIlIlI[5]];
                    iArr10[llllIIlIlI[4]] = llllIIlIlI[14];
                    Inventory.getFirst(iArr10).interact(llllIIlIIl[llllIIlIlI[87]]);
                    Time.sleepTicks(llllIIlIlI[12]);
                    "".length();
                }
            }
            C0006g.a(new String[llllIIlIlI[4]]);
        }
    }

    static {
        llIIllIlIIlIl();
        llIIllIlIIIll();
        ge = new WorldArea(llllIIlIlI[98], llllIIlIlI[99], llllIIlIlI[100], llllIIlIlI[101], llllIIlIlI[4]);
        bu = new ArrayList();
        gf = new WorldPoint(llllIIlIlI[102], llllIIlIlI[56], llllIIlIlI[4]);
        f2gg = new WorldPoint(llllIIlIlI[103], llllIIlIlI[104], llllIIlIlI[4]);
        gh = new WorldPoint(llllIIlIlI[105], llllIIlIlI[106], llllIIlIlI[4]);
        gi = new WorldPoint(llllIIlIlI[107], llllIIlIlI[108], llllIIlIlI[4]);
        gj = new WorldPoint(llllIIlIlI[109], llllIIlIlI[110], llllIIlIlI[4]);
        gk = new WorldPoint(llllIIlIlI[111], llllIIlIlI[112], llllIIlIlI[4]);
        gl = new WorldPoint(llllIIlIlI[113], llllIIlIlI[114], llllIIlIlI[4]);
        String[] strArr = new String[llllIIlIlI[11]];
        strArr[llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[115]];
        strArr[llllIIlIlI[5]] = llllIIlIIl[llllIIlIlI[116]];
        strArr[llllIIlIlI[6]] = llllIIlIIl[llllIIlIlI[117]];
        bQ = strArr;
    }

    private static boolean llIIllIlIlllI(int i, int i2) {
        return i > i2;
    }

    private static String llIIllIlIIIII(String lllllllllllllllllIlIllIlIlIlIIll, String lllllllllllllllllIlIllIlIlIlIIlI) {
        try {
            SecretKeySpec lllllllllllllllllIlIllIlIlIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIllIlIlIlIIlI.getBytes(StandardCharsets.UTF_8)), llllIIlIlI[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIlIlI[6], lllllllllllllllllIlIllIlIlIlIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIllIlIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIllIlIlIlIlII) {
            lllllllllllllllllIlIllIlIlIlIlII.printStackTrace();
            return null;
        }
    }

    private static String llIIllIlIIIIl(String lllllllllllllllllIlIllIlIllIIIII, String lllllllllllllllllIlIllIlIlIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIllIlIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIllIlIllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIllIlIllIIIlI.init(llllIIlIlI[6], secretKeySpec);
            return new String(lllllllllllllllllIlIllIlIllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIllIlIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIllIlIllIIIIl) {
            lllllllllllllllllIlIllIlIllIIIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return llllIIlIlI[4];
    }

    private static boolean llIIllIlIlIll(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIllIlIllIl(int i) {
        return i > 0;
    }

    private static int llIIllIlIIllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void llIIllIlIIIll() {
        llllIIlIIl = new String[llllIIlIlI[118]];
        llllIIlIIl[llllIIlIlI[4]] = llIIllIlIIIII("B4GbxjC7Kw+6pswTsKA59NBesleV2YM4HL1etu4mTryAp9VvLDqDcBRSAXsUuOAt", "SJrNR");
        llllIIlIIl[llllIIlIlI[5]] = llIIllIlIIIII("nmApaucNPZ3l7lBLnvkIKw==", "kHVca");
        llllIIlIIl[llllIIlIlI[6]] = llIIllIlIIIII("0fPDjjnNZ7nAV/Ji2VngZw==", "CuVmb");
        llllIIlIIl[llllIIlIlI[11]] = llIIllIlIIIII("54WQBzYYWiWLFZlQMb0IhyxB2X8pRZrJ", "BHBNZ");
        llllIIlIIl[llllIIlIlI[12]] = llIIllIlIIIIl("2uLo/xdl10OOVkCQ7tz46A7a72kLwtAjoZSPPvGsuPOcZDi6F9iJulAeHF7aYlrnSakucAzJ5DE=", "qWGsg");
        llllIIlIIl[llllIIlIlI[19]] = llIIllIlIIIIl("tbArMIHven4=", "xPwDO");
        llllIIlIIl[llllIIlIlI[21]] = llIIllIlIIIlI("Hj0dPwc=", "ZOtQl");
        llllIIlIIl[llllIIlIlI[23]] = llIIllIlIIIII("7F4wl0Oz1K3kMM2DhdZMQg==", "nNUVg");
        llllIIlIIl[llllIIlIlI[13]] = llIIllIlIIIIl("sJvD4WdyOZMeDhW7mLBGpg==", "UBNwk");
        llllIIlIIl[llllIIlIlI[32]] = llIIllIlIIIlI("EgQ5FQsy", "EmUyd");
        llllIIlIIl[llllIIlIlI[25]] = llIIllIlIIIlI("Bw49IjsqDT9lNyQOIQ==", "KaSES");
        llllIIlIIl[llllIIlIlI[35]] = llIIllIlIIIII("d+e9S4cfERk=", "LcbaU");
        llllIIlIIl[llllIIlIlI[36]] = llIIllIlIIIlI("OTw4PgcUPzp5Cxo8JA==", "uSVYo");
        llllIIlIIl[llllIIlIlI[37]] = llIIllIlIIIII("2Hho+NUoj7A=", "VeVer");
        llllIIlIIl[llllIIlIlI[38]] = llIIllIlIIIIl("RNVl8ET/Jk5xQFgwyuQBLQ==", "iIEqt");
        llllIIlIIl[llllIIlIlI[34]] = llIIllIlIIIlI("FxMTPA==", "XcvRW");
        llllIIlIIl[llllIIlIlI[9]] = llIIllIlIIIIl("gWes6mytiCrVGCJjex/LVw==", "GTcxQ");
        llllIIlIIl[llllIIlIlI[51]] = llIIllIlIIIII("gdr0RCZY8HU=", "BqWmE");
        llllIIlIIl[llllIIlIlI[52]] = llIIllIlIIIlI("FTYHEw==", "aWkxY");
        llllIIlIIl[llllIIlIlI[53]] = llIIllIlIIIII("W5RqWww2G8Q=", "zrzRm");
        llllIIlIIl[llllIIlIlI[55]] = llIIllIlIIIlI("OwUUYxAaRAM3CBQX", "udbCd");
        llllIIlIIl[llllIIlIlI[57]] = llIIllIlIIIII("dt5hyVXIGnIVfx/Fy1jNuw==", "gPFVP");
        llllIIlIIl[llllIIlIlI[58]] = llIIllIlIIIlI("GhkGNA==", "UicZC");
        llllIIlIIl[llllIIlIlI[31]] = llIIllIlIIIIl("bcYJwDPunAB0e7DaU4LjIQ==", "xgHQw");
        llllIIlIIl[llllIIlIlI[59]] = llIIllIlIIIlI("KQgJLQ==", "fxlCh");
        llllIIlIIl[llllIIlIlI[60]] = llIIllIlIIIlI("GAcbDy41BBlIIjsHBw==", "ThuhF");
        llllIIlIIl[llllIIlIlI[61]] = llIIllIlIIIII("hNeupk1Bi0A=", "wSDvn");
        llllIIlIIl[llllIIlIlI[62]] = llIIllIlIIIlI("AyAUFDI=", "BTxuA");
        llllIIlIIl[llllIIlIlI[63]] = llIIllIlIIIIl("YVGNmeOQT/k=", "zjvhD");
        llllIIlIIl[llllIIlIlI[64]] = llIIllIlIIIII("47tsnzKxe9o=", "xWiKG");
        llllIIlIIl[llllIIlIlI[66]] = llIIllIlIIIIl("5u+YuVmhk0JG+BKV1O0VWA==", "geift");
        llllIIlIIl[llllIIlIlI[7]] = llIIllIlIIIIl("HNS1BJd7VHA=", "JZmYu");
        llllIIlIIl[llllIIlIlI[67]] = llIIllIlIIIIl("Np5OXfImhNk=", "vAZpb");
        llllIIlIIl[llllIIlIlI[68]] = llIIllIlIIIlI("IggUajEDSQElKgc=", "libJE");
        llllIIlIIl[llllIIlIlI[69]] = llIIllIlIIIlI("BAceOw==", "pfrPb");
        llllIIlIIl[llllIIlIlI[70]] = llIIllIlIIIIl("IxiweVwWMpE=", "vkJKs");
        llllIIlIIl[llllIIlIlI[71]] = llIIllIlIIIlI("JhEOFxhVFgoYFwIMCB4=", "uekvs");
        llllIIlIIl[llllIIlIlI[72]] = llIIllIlIIIII("AjQlw5n0wvQ=", "oXRAU");
        llllIIlIIl[llllIIlIlI[73]] = llIIllIlIIIII("BR9Fm4tTdHg=", "taMhZ");
        llllIIlIIl[llllIIlIlI[74]] = llIIllIlIIIIl("ZAuyhimFkf8L4D0XwH3cYw==", "LMFlR");
        llllIIlIIl[llllIIlIlI[50]] = llIIllIlIIIIl("1ZluCOnB2w2x83t1clnidA==", "AIjCH");
        llllIIlIIl[llllIIlIlI[75]] = llIIllIlIIIIl("i/yKKDUrFXs=", "gfXyT");
        llllIIlIIl[llllIIlIlI[76]] = llIIllIlIIIII("euVdb4af4LU=", "rsVcm");
        llllIIlIIl[llllIIlIlI[77]] = llIIllIlIIIIl("qrV28lqDdqsiUq0fvVFV2g==", "gMVSQ");
        llllIIlIIl[llllIIlIlI[78]] = llIIllIlIIIIl("qRGONvTNHXQ=", "XxtgM");
        llllIIlIIl[llllIIlIlI[79]] = llIIllIlIIIlI("PzQnSDIedTUdKBYwPgY=", "qUQhF");
        llllIIlIIl[llllIIlIlI[80]] = llIIllIlIIIIl("q4gQFh2X8h1x5/gf9xiYIQ==", "HebnJ");
        llllIIlIIl[llllIIlIlI[81]] = llIIllIlIIIIl("Kal57WcrVt8=", "mcZfq");
        llllIIlIIl[llllIIlIlI[82]] = llIIllIlIIIIl("4IbIu0fjBRk=", "mYswV");
        llllIIlIIl[llllIIlIlI[83]] = llIIllIlIIIlI("FCs8JSk+YiIlKzUjID8=", "YBRLG");
        llllIIlIIl[llllIIlIlI[30]] = llIIllIlIIIII("eTaXdkd8cAc=", "ElAvf");
        llllIIlIIl[llllIIlIlI[84]] = llIIllIlIIIII("XVIZGV1w97k=", "hYghF");
        llllIIlIIl[llllIIlIlI[86]] = llIIllIlIIIIl("Tq6B/+CS2BGdkXeK71OeVg==", "pVMkS");
        llllIIlIIl[llllIIlIlI[87]] = llIIllIlIIIIl("ZAiVqYvvm6s=", "LbZWr");
        llllIIlIIl[llllIIlIlI[94]] = llIIllIlIIIIl("dTZCIKNyvN1Suo/nwe0QyjGBMPYVpap/", "gQEsX");
        llllIIlIIl[llllIIlIlI[95]] = llIIllIlIIIII("dzwLyYbHhu3+VokJ3zwxn11k8TOLQWR9", "GzkBd");
        llllIIlIIl[llllIIlIlI[96]] = llIIllIlIIIIl("//n29crpm6o=", "hffgo");
        llllIIlIIl[llllIIlIlI[97]] = llIIllIlIIIII("c4QfPCTkck4=", "tXkoj");
        llllIIlIIl[llllIIlIlI[115]] = llIIllIlIIIIl("d7jK1q/V7QI=", "JtaAR");
        llllIIlIIl[llllIIlIlI[116]] = llIIllIlIIIlI("CHgkIwdhLzwsECQqOiwTYTE1Yg0uLXQmVCM9cyMWLT1zNhthNTIpEWE1NmIVYQsnJxUqeCAjGiUvOiEcfg==", "AXSBt");
        llllIIlIIl[llllIIlIlI[117]] = llIIllIlIIIlI("IxgHIn4=", "qwdIP");
    }

    private static boolean llIIllIllIIIl(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (!llIIllIlIlIlI(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[85]) || (llIIllIlIlIIl(ge.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIllIlIlIIl(this.gm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIllIlIlIIl(this.gn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !llIIllIlIIlll(this.go.contains(Players.getLocal().getWorldLocation()) ? 1 : 0))) {
            return llllIIlIlI[4];
        }
        ?? r0 = llllIIlIlI[5];
        "".length();
        return ((22 ^ 88) & ((69 ^ 11) ^ (-1))) >= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return llllIIlIIl[llllIIlIlI[94]];
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            bQ();
            "".length();
            if ((62 ^ 58) <= "  ".length()) {
                return (171 ^ 177) & ((79 ^ 85) ^ (-1));
            }
        } catch (Exception e2) {
        }
        return llllIIlIlI[8];
    }

    private static void ae() {
        int[] iArr = new int[llllIIlIlI[5]];
        iArr[llllIIlIlI[4]] = llllIIlIlI[18];
        if (llIIllIlIlIIl(Bank.contains(iArr) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlIlI[18], llllIIlIlI[5], llllIIlIlI[88]));
            "".length();
        }
        int[] iArr2 = new int[llllIIlIlI[5]];
        iArr2[llllIIlIlI[4]] = llllIIlIlI[24];
        if (llIIllIlIlIIl(Bank.contains(iArr2) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlIlI[24], llllIIlIlI[5], llllIIlIlI[88]));
            "".length();
        }
        int[] iArr3 = new int[llllIIlIlI[5]];
        iArr3[llllIIlIlI[4]] = llllIIlIlI[16];
        if (llIIllIlIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlIlI[16], llllIIlIlI[5], llllIIlIlI[88]));
            "".length();
        }
        int[] iArr4 = new int[llllIIlIlI[5]];
        iArr4[llllIIlIlI[4]] = llllIIlIlI[20];
        if (llIIllIlIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlIlI[20], llllIIlIlI[5], llllIIlIlI[89]));
            "".length();
        }
        int[] iArr5 = new int[llllIIlIlI[5]];
        iArr5[llllIIlIlI[4]] = llllIIlIlI[17];
        if (llIIllIlIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlIlI[17], llllIIlIlI[5], llllIIlIlI[89]));
            "".length();
        }
        int[] iArr6 = new int[llllIIlIlI[5]];
        iArr6[llllIIlIlI[4]] = llllIIlIlI[22];
        if (llIIllIlIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlIlI[22], llllIIlIlI[25], llllIIlIlI[90]));
            "".length();
        }
        if (llIIllIlIlIIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llllIIlIIl[llllIIlIlI[95]]);
        }) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlIlI[91], llllIIlIlI[19], llllIIlIlI[92]));
            "".length();
        }
        int[] iArr7 = new int[llllIIlIlI[5]];
        iArr7[llllIIlIlI[4]] = llllIIlIlI[15];
        if (llIIllIlIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlIlI[15], llllIIlIlI[12], C0008i.bp));
            "".length();
        }
        int[] iArr8 = new int[llllIIlIlI[5]];
        iArr8[llllIIlIlI[4]] = llllIIlIlI[14];
        if (llIIllIlIIlll(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[llllIIlIlI[5]];
            iArr9[llllIIlIlI[4]] = llllIIlIlI[14];
            if (!llIIllIlIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                return;
            }
            int[] iArr10 = new int[llllIIlIlI[5]];
            iArr10[llllIIlIlI[4]] = llllIIlIlI[14];
            if (!llIIllIlIlIII(Bank.getFirst(iArr10).getQuantity(), llllIIlIlI[34])) {
                return;
            }
        }
        bu.add(new C0003d(llllIIlIlI[14], llllIIlIlI[50], llllIIlIlI[93]));
        "".length();
    }

    private static String llIIllIlIIIlI(String lllllllllllllllllIlIllIlIlIIIIll, String lllllllllllllllllIlIllIlIlIIIIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIlIllIlIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIlIllIlIlIIIIlI.toCharArray();
        int lllllllllllllllllIlIllIlIIllllll = llllIIlIlI[4];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllIIlIlI[4];
        while (llIIllIlIlIII(i, length)) {
            char lllllllllllllllllIlIllIlIlIIIlII = charArray2[i];
            sb.append((char) (lllllllllllllllllIlIllIlIlIIIlII ^ charArray[lllllllllllllllllIlIllIlIIllllll % charArray.length]));
            "".length();
            lllllllllllllllllIlIllIlIIllllll++;
            i++;
            "".length();
            if ((15 ^ 11) <= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIllIlIlIIl(int i) {
        return i == 0;
    }
}
