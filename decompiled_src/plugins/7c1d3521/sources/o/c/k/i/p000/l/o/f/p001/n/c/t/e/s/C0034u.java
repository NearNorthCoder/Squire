package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.u  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/u.class */
public class C0034u implements InterfaceC0003ac {
    public static /* synthetic */ WorldPoint dh;
    static /* synthetic */ int di;
    private static /* synthetic */ String[] llIlIIIIIl;
    public static /* synthetic */ WorldPoint de;
    private static /* synthetic */ String[] cE;
    static /* synthetic */ boolean dj;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] llIlIIIIll;
    public static /* synthetic */ WorldPoint dg;
    public static /* synthetic */ WorldPoint df;
    private static /* synthetic */ WorldPoint dk;
    public static /* synthetic */ List<C0017d> bv;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIllIIIIlIllI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[57])) {
            ?? r0 = llIlIIIIll[0];
            "".length();
            return ((((17 + 52) - (-58)) + 18) ^ (((98 + 137) - 130) + 44)) <= (-" ".length()) ? ((93 ^ 122) ^ (4 ^ 15)) & (((16 ^ 106) ^ (81 ^ 7)) ^ (-" ".length())) : r0;
        }
        return llIlIIIIll[1];
    }

    private static boolean lIllIIIIIlIll(int i) {
        return i != 0;
    }

    private static boolean lIllIIIIlIIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIIIIlIIII(int i, int i2) {
        return i > i2;
    }

    static {
        lIllIIIIIlIIl();
        lIllIIIIIlIII();
        bv = new ArrayList();
        de = new WorldPoint(llIlIIIIll[88], llIlIIIIll[89], llIlIIIIll[1]);
        df = new WorldPoint(llIlIIIIll[90], llIlIIIIll[91], llIlIIIIll[1]);
        dg = new WorldPoint(llIlIIIIll[92], llIlIIIIll[93], llIlIIIIll[1]);
        dh = new WorldPoint(llIlIIIIll[94], llIlIIIIll[95], llIlIIIIll[1]);
        dk = null;
        String[] strArr = new String[llIlIIIIll[4]];
        strArr[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[96]];
        strArr[llIlIIIIll[0]] = llIlIIIIIl[llIlIIIIll[97]];
        strArr[llIlIIIIll[3]] = llIlIIIIIl[llIlIIIIll[98]];
        strArr[llIlIIIIll[9]] = llIlIIIIIl[llIlIIIIll[99]];
        cE = strArr;
    }

    private static boolean lIllIIIIIllII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIlIIIIll[1];
    }

    private static void lIllIIIIIlIIl() {
        llIlIIIIll = new int[101];
        llIlIIIIll[0] = " ".length();
        llIlIIIIll[1] = (139 ^ 157) & ((142 ^ 152) ^ (-1));
        llIlIIIIll[2] = (-18470) & 23469;
        llIlIIIIll[3] = "  ".length();
        llIlIIIIll[4] = 114 ^ 118;
        llIlIIIIll[5] = ((156 ^ 161) & ((0 ^ 61) ^ (-1))) ^ (119 ^ 113);
        llIlIIIIll[6] = (-((-8087) & 24471)) & (-145) & 24535;
        llIlIIIIll[7] = (-16530) & 24537;
        llIlIIIIll[8] = (-((-2898) & 12119)) & (-1) & 10175;
        llIlIIIIll[9] = "   ".length();
        llIlIIIIll[10] = (-((-161) & 31461)) & (-1) & 32631;
        llIlIIIIll[11] = (-2603) & 15227;
        llIlIIIIll[12] = (((85 + 117) - 128) + 54) ^ (((87 + 8) - 51) + 89);
        llIlIIIIll[13] = (-17925) & 18303;
        llIlIIIIll[14] = 28 ^ 22;
        llIlIIIIll[15] = (-16551) & 24559;
        llIlIIIIll[16] = (((101 + 1) - 18) + 60) ^ (((131 + 56) - 97) + 62);
        llIlIIIIll[17] = 231 ^ 166;
        llIlIIIIll[18] = (150 ^ 181) ^ (103 ^ 67);
        llIlIIIIll[19] = (((19 + 81) - (-13)) + 88) ^ (((28 + 1) - (-31)) + 132);
        llIlIIIIll[20] = (-29726) & 32767;
        llIlIIIIll[21] = (-20501) & 23805;
        llIlIIIIll[22] = (((134 + 1) - 113) + 143) ^ (((109 + 160) - 167) + 72);
        llIlIIIIll[23] = (-33) & 3071;
        llIlIIIIll[24] = (-12553) & 15849;
        llIlIIIIll[25] = 106 ^ 102;
        llIlIIIIll[26] = (87 ^ 75) ^ (152 ^ 137);
        llIlIIIIll[27] = (227 ^ 161) ^ (193 ^ 141);
        llIlIIIIll[28] = (101 ^ 21) ^ (((5 + 27) - (-88)) + 7);
        llIlIIIIll[29] = 177 ^ 161;
        llIlIIIIll[30] = 73 ^ 88;
        llIlIIIIll[31] = 11 ^ 25;
        llIlIIIIll[32] = (-((-1805) & 26559)) & (-10) & 31739;
        llIlIIIIll[33] = (-((-10307) & 11602)) & (-8225) & 15855;
        llIlIIIIll[34] = (154 ^ 170) ^ "  ".length();
        llIlIIIIll[35] = 180 ^ 167;
        llIlIIIIll[36] = (((84 + 3) - (-34)) + 87) ^ (((112 + 134) - 134) + 84);
        llIlIIIIll[37] = (-1069) & 6124;
        llIlIIIIll[38] = 135 ^ 146;
        llIlIIIIll[39] = 86 ^ 64;
        llIlIIIIll[40] = 14 ^ 25;
        llIlIIIIll[41] = 106 ^ 114;
        llIlIIIIll[42] = (((115 + 24) - 54) + 87) ^ (((90 + 146) - 123) + 68);
        llIlIIIIll[43] = (((14 + 72) - (-31)) + 12) ^ (((105 + 17) - 89) + 122);
        llIlIIIIll[44] = (((209 + 85) - 184) + 110) ^ (((186 + 31) - 59) + 41);
        llIlIIIIll[45] = 56 ^ 36;
        llIlIIIIll[46] = 23 ^ 10;
        llIlIIIIll[47] = 27 ^ 5;
        llIlIIIIll[48] = 101 ^ 122;
        llIlIIIIll[49] = (((35 + 44) - (-9)) + 98) ^ (((66 + 126) - 167) + 129);
        llIlIIIIll[50] = (((82 + 48) - 103) + 126) ^ (((3 + 165) - 24) + 40);
        llIlIIIIll[51] = (46 ^ 117) ^ (11 ^ 114);
        llIlIIIIll[52] = (((182 + 168) - 206) + 82) ^ (((19 + 83) - 12) + 103);
        llIlIIIIll[53] = (189 ^ 139) ^ (163 ^ 177);
        llIlIIIIll[54] = (218 ^ 136) ^ (224 ^ 151);
        llIlIIIIll[55] = 87 ^ 113;
        llIlIIIIll[56] = (198 ^ 176) ^ (202 ^ 155);
        llIlIIIIll[57] = (((47 + 88) - 62) + 83) ^ (((0 + 177) - 131) + 134);
        llIlIIIIll[58] = (198 ^ 140) ^ (81 ^ 50);
        llIlIIIIll[59] = (187 ^ 171) ^ (188 ^ 134);
        llIlIIIIll[60] = (((3 + 34) - (-92)) + 8) ^ (((25 + 108) - 54) + 83);
        llIlIIIIll[61] = (120 ^ 74) ^ (121 ^ 103);
        llIlIIIIll[62] = (81 ^ 14) ^ (28 ^ 110);
        llIlIIIIll[63] = (((141 + 102) - 187) + 103) ^ (((54 + 116) - 110) + 117);
        llIlIIIIll[64] = 81 ^ 126;
        llIlIIIIll[65] = 161 ^ 145;
        llIlIIIIll[66] = 126 ^ 79;
        llIlIIIIll[67] = 245 ^ 198;
        llIlIIIIll[68] = 157 ^ 169;
        llIlIIIIll[69] = (((78 + 65) - 92) + 76) ^ (241 ^ 187);
        llIlIIIIll[70] = 70 ^ 112;
        llIlIIIIll[71] = 180 ^ 131;
        llIlIIIIll[72] = 80 ^ 104;
        llIlIIIIll[73] = (54 ^ 111) ^ (94 ^ 62);
        llIlIIIIll[74] = (((110 + 117) - 161) + 87) ^ (((25 + 82) - (-22)) + 34);
        llIlIIIIll[75] = (93 ^ 110) ^ (91 ^ 83);
        llIlIIIIll[76] = 154 ^ 166;
        llIlIIIIll[77] = (57 ^ 29) ^ (21 ^ 12);
        llIlIIIIll[78] = (((175 + 90) - 154) + 144) ^ (((22 + 108) - 120) + 183);
        llIlIIIIll[79] = (230 ^ 182) ^ (221 ^ 178);
        llIlIIIIll[80] = (((204 + 99) - 212) + 156) ^ (((103 + 11) - 103) + 172);
        llIlIIIIll[81] = (-(61 ^ 43)) & (-7363) & 16383;
        llIlIIIIll[82] = (-21618) & 22517;
        llIlIIIIll[83] = (-16690) & 28669;
        llIlIIIIll[84] = (-((-24578) & 29785)) & (-1) & 30207;
        llIlIIIIll[85] = (((220 + 220) - 413) + 195) ^ (((25 + 140) - 18) + 39);
        llIlIIIIll[86] = (33 ^ 111) ^ (126 ^ 114);
        llIlIIIIll[87] = (12 ^ 120) ^ (54 ^ 1);
        llIlIIIIll[88] = (-9139) & 12223;
        llIlIIIIll[89] = (-4365) & 7615;
        llIlIIIIll[90] = (-28706) & 31741;
        llIlIIIIll[91] = (-((-1193) & 18089)) & (-8482) & 28671;
        llIlIIIIll[92] = (-((-18241) & 26449)) & (-20644) & 31999;
        llIlIIIIll[93] = (-4805) & 8151;
        llIlIIIIll[94] = (-581) & 3671;
        llIlIIIIll[95] = (-4887) & 8151;
        llIlIIIIll[96] = (((41 + 224) - 188) + 150) ^ (((10 + 89) - (-54)) + 14);
        llIlIIIIll[97] = (((161 + 60) - 150) + 167) ^ (((169 + 141) - 235) + 96);
        llIlIIIIll[98] = 64 ^ 6;
        llIlIIIIll[99] = 107 ^ 44;
        llIlIIIIll[100] = (((159 + 117) - 125) + 100) ^ (((139 + 72) - 39) + 7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x065c, code lost:
        if (lIllIIIIIlllI(net.unethicalite.api.entities.TileObjects.getNearest(r0)) != false) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v473, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v495, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v141, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aX() {
        if (lIllIIIIIlIll(bt ? 1 : 0)) {
            C0015b.a(bv);
            if (lIllIIIIIllII(bv.size(), llIlIIIIll[0])) {
                System.out.println(llIlIIIIIl[llIlIIIIll[1]]);
                bt = llIlIIIIll[1];
            }
        }
        if (lIllIIIIIllIl(bt ? 1 : 0)) {
            if (lIllIIIIIllIl(an() ? 1 : 0) && lIllIIIIIllIl(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIllIIIIIlllI(nearest) && lIllIIIIIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[0]];
                    C0000a.a(nearest);
                }
                if (lIllIIIIIlllI(nearest) && lIllIIIIIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIllIIIIIllIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIlIIIIll[2]);
                        "".length();
                    }
                    if (lIllIIIIIlIll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[3]];
                        if (lIllIIIIIllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIlIIIIll[4]);
                            "".length();
                        }
                        if (lIllIIIIIllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIlIIIIll[3]);
                            "".length();
                        }
                        int[] iArr = new int[llIlIIIIll[5]];
                        iArr[llIlIIIIll[1]] = llIlIIIIll[6];
                        iArr[llIlIIIIll[0]] = llIlIIIIll[7];
                        iArr[llIlIIIIll[3]] = llIlIIIIll[8];
                        iArr[llIlIIIIll[9]] = llIlIIIIll[10];
                        iArr[llIlIIIIll[4]] = llIlIIIIll[11];
                        iArr[llIlIIIIll[12]] = llIlIIIIll[13];
                        if (lIllIIIIIllIl(C0018e.c(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(llIlIIIIIl[llIlIIIIll[9]]);
                            bt = llIlIIIIll[0];
                            return;
                        }
                        int[] iArr2 = new int[llIlIIIIll[5]];
                        iArr2[llIlIIIIll[1]] = llIlIIIIll[6];
                        iArr2[llIlIIIIll[0]] = llIlIIIIll[7];
                        iArr2[llIlIIIIll[3]] = llIlIIIIll[8];
                        iArr2[llIlIIIIll[9]] = llIlIIIIll[10];
                        iArr2[llIlIIIIll[4]] = llIlIIIIll[11];
                        iArr2[llIlIIIIll[12]] = llIlIIIIll[13];
                        if (lIllIIIIIlIll(C0018e.c(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[llIlIIIIll[3]];
                            iArr3[llIlIIIIll[1]] = llIlIIIIll[8];
                            iArr3[llIlIIIIll[0]] = llIlIIIIll[10];
                            C0000a.a(iArr3);
                            C0000a.a(llIlIIIIll[6], llIlIIIIll[14]);
                            C0000a.a(llIlIIIIll[7], llIlIIIIll[14]);
                            C0000a.a(llIlIIIIll[15], llIlIIIIll[14]);
                            C0000a.b(C0019f.aW, llIlIIIIll[0]);
                            C0000a.a(llIlIIIIll[11], llIlIIIIll[4]);
                            C0000a.a(llIlIIIIll[13], llIlIIIIll[16]);
                        }
                    }
                }
            }
            if (lIllIIIIIlIll(Inventory.contains(C0019f.ba) ? 1 : 0) && lIllIIIIIllII(Movement.getRunEnergy(), llIlIIIIll[17])) {
                Inventory.getFirst(C0019f.ba).interact(llIlIIIIIl[llIlIIIIll[4]]);
                Time.sleepTicks(llIlIIIIll[0]);
                "".length();
            }
            if (lIllIIIIIlIll(an() ? 1 : 0) && lIllIIIIIllIl(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                if (lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(de), llIlIIIIll[4])) {
                    if (lIllIIIIIlIll(Inventory.contains(C0019f.aW) ? 1 : 0) && lIllIIIIIllIl(Equipment.contains(C0019f.aW) ? 1 : 0)) {
                        Inventory.getFirst(C0019f.aW).interact(llIlIIIIIl[llIlIIIIll[12]]);
                    }
                    if (lIllIIIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[5]];
                    Movement.walkTo(de);
                    "".length();
                    Time.sleepTicks(llIlIIIIll[0]);
                    "".length();
                }
                if (lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(de), llIlIIIIll[4])) {
                    AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[18]];
                    di = llIlIIIIll[1];
                    if (lIllIIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr = new String[llIlIIIIll[0]];
                        strArr[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[16]];
                        TileObjects.getNearest(strArr).interact(llIlIIIIIl[llIlIIIIll[19]]);
                        Time.sleepTicks(llIlIIIIll[3]);
                        "".length();
                    }
                    C0020g.a(cE);
                }
            }
            if (lIllIIIIlIIlI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[12])) {
                if (lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(df), llIlIIIIll[4])) {
                    AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[14]];
                    Movement.walkTo(df);
                    "".length();
                    Time.sleepTicks(llIlIIIIll[0]);
                    "".length();
                    if (lIllIIIIIlIll(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIlIIIIll[20], llIlIIIIll[21], llIlIIIIll[1])) ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[22]];
                        C0018e.c(new WorldPoint(llIlIIIIll[23], llIlIIIIll[24], llIlIIIIll[1]));
                        Time.sleepTicks(llIlIIIIll[5]);
                        "".length();
                    }
                }
                if (lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(df), llIlIIIIll[4])) {
                    AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[25]];
                    C0020g.a(llIlIIIIIl[llIlIIIIll[26]], cE, llIlIIIIll[0]);
                }
            }
            if (lIllIIIIlIIlI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[14])) {
                if (lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIIIIll[4])) {
                    AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[27]];
                    Movement.walkTo(dg);
                    "".length();
                    Time.sleepTicks(llIlIIIIll[0]);
                    "".length();
                }
                if (lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIIIIll[4])) {
                    int[] iArr4 = new int[llIlIIIIll[0]];
                    iArr4[llIlIIIIll[1]] = llIlIIIIll[8];
                    if (lIllIIIIIlIll(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[llIlIIIIll[0]];
                        iArr5[llIlIIIIll[1]] = llIlIIIIll[8];
                        Item first = Inventory.getFirst(iArr5);
                        String[] strArr2 = new String[llIlIIIIll[0]];
                        strArr2[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[28]];
                        first.useOn(TileObjects.getNearest(strArr2));
                        Time.sleepTicks(llIlIIIIll[3]);
                        "".length();
                    }
                }
            }
            if (lIllIIIIlIIlI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[28])) {
                int[] iArr6 = new int[llIlIIIIll[0]];
                iArr6[llIlIIIIll[1]] = llIlIIIIll[10];
                if (lIllIIIIIlIll(Inventory.contains(iArr6) ? 1 : 0)) {
                    int[] iArr7 = new int[llIlIIIIll[0]];
                    iArr7[llIlIIIIll[1]] = llIlIIIIll[10];
                    Inventory.getFirst(iArr7).interact(llIlIIIIIl[llIlIIIIll[29]]);
                }
                if (lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIIIIll[4])) {
                    String[] strArr3 = new String[llIlIIIIll[0]];
                    strArr3[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[30]];
                    TileObjects.getNearest(strArr3).interact(llIlIIIIIl[llIlIIIIll[31]]);
                    Time.sleepTicks(llIlIIIIll[9]);
                    "".length();
                }
                if (lIllIIIIlIIII(Players.getLocal().getLocalLocation().distanceTo(new LocalPoint(llIlIIIIll[32], llIlIIIIll[33])), llIlIIIIll[34])) {
                    String[] strArr4 = new String[llIlIIIIll[0]];
                    strArr4[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[35]];
                }
                String[] strArr5 = new String[llIlIIIIll[0]];
                strArr5[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[36]];
                if (lIllIIIIIlllI(TileObjects.getNearest(strArr5))) {
                    if (lIllIIIIlIIII(Players.getLocal().getLocalLocation().getY(), llIlIIIIll[37])) {
                        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                        String[] strArr6 = new String[llIlIIIIll[0]];
                        strArr6[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[38]];
                        if (lIllIIIIlIIIl(worldLocation.distanceTo(TileObjects.getNearest(strArr6).getWorldLocation()), llIlIIIIll[14])) {
                            String[] strArr7 = new String[llIlIIIIll[0]];
                            strArr7[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[39]];
                            if (lIllIIIIlIIll(NPCs.getNearest(strArr7))) {
                                AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[40]];
                                String[] strArr8 = new String[llIlIIIIll[0]];
                                strArr8[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[41]];
                                TileObjects.getNearest(strArr8).interact(llIlIIIIIl[llIlIIIIll[42]]);
                                Time.sleepTicks(llIlIIIIll[14]);
                                "".length();
                            }
                        }
                    }
                    String[] strArr9 = new String[llIlIIIIll[0]];
                    strArr9[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[43]];
                    if (lIllIIIIlIIll(NPCs.getNearest(strArr9)) && lIllIIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[44]];
                        String[] strArr10 = new String[llIlIIIIll[0]];
                        strArr10[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[45]];
                        TileObjects.getNearest(strArr10).interact(llIlIIIIIl[llIlIIIIll[46]]);
                        Time.sleepTicks(llIlIIIIll[12]);
                        "".length();
                        C0020g.a(cE);
                    }
                    C0020g.a(cE);
                }
            }
            if (lIllIIIIlIIlI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[36])) {
                AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[47]];
                C0020g.a(llIlIIIIIl[llIlIIIIll[48]], cE);
            }
            if (lIllIIIIlIIlI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[42])) {
                if (lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIIIIll[4])) {
                    String[] strArr11 = new String[llIlIIIIll[0]];
                    strArr11[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[49]];
                    if (lIllIIIIlIIll(NPCs.getNearest(strArr11))) {
                        String[] strArr12 = new String[llIlIIIIll[0]];
                        strArr12[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[50]];
                        if (lIllIIIIIllIl(Equipment.contains(strArr12) ? 1 : 0)) {
                            String[] strArr13 = new String[llIlIIIIll[0]];
                            strArr13[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[51]];
                            if (lIllIIIIIlIll(Inventory.contains(strArr13) ? 1 : 0)) {
                                String[] strArr14 = new String[llIlIIIIll[0]];
                                strArr14[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[52]];
                                Inventory.getFirst(strArr14).interact(llIlIIIIIl[llIlIIIIll[53]]);
                            }
                        }
                        AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[54]];
                        Movement.walkTo(dg);
                        "".length();
                        Time.sleepTicks(llIlIIIIll[0]);
                        "".length();
                    }
                }
                if (lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIIIIll[4])) {
                    AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[55]];
                    String[] strArr15 = new String[llIlIIIIll[0]];
                    strArr15[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[56]];
                    if (lIllIIIIIlllI(TileObjects.getNearest(strArr15))) {
                        String[] strArr16 = new String[llIlIIIIll[0]];
                        strArr16[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[57]];
                        TileObjects.getNearest(strArr16).interact(llIlIIIIIl[llIlIIIIll[58]]);
                        Time.sleepTicks(llIlIIIIll[9]);
                        "".length();
                    }
                }
                if (lIllIIIIlIIII(Players.getLocal().getLocalLocation().getY(), llIlIIIIll[37])) {
                    WorldPoint worldLocation2 = Players.getLocal().getWorldLocation();
                    String[] strArr17 = new String[llIlIIIIll[0]];
                    strArr17[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[59]];
                    if (lIllIIIIlIIII(worldLocation2.distanceTo(TileObjects.getNearest(strArr17).getWorldLocation()), llIlIIIIll[18])) {
                        AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[60]];
                        String[] strArr18 = new String[llIlIIIIll[0]];
                        strArr18[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[61]];
                        TileObjects.getNearest(strArr18).interact(llIlIIIIIl[llIlIIIIll[62]]);
                        Time.sleepTicks(llIlIIIIll[14]);
                        "".length();
                    }
                }
                if (lIllIIIIlIIll(Players.getLocal().getInteracting()) && lIllIIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr19 = new String[llIlIIIIll[0]];
                    strArr19[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[63]];
                    if (lIllIIIIIllIl(Equipment.contains(strArr19) ? 1 : 0)) {
                        String[] strArr20 = new String[llIlIIIIll[0]];
                        strArr20[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[64]];
                        if (lIllIIIIIlIll(Inventory.contains(strArr20) ? 1 : 0)) {
                            String[] strArr21 = new String[llIlIIIIll[0]];
                            strArr21[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[65]];
                            Inventory.getFirst(strArr21).interact(llIlIIIIIl[llIlIIIIll[66]]);
                        }
                    }
                    int[] iArr8 = new int[llIlIIIIll[0]];
                    iArr8[llIlIIIIll[1]] = llIlIIIIll[10];
                    if (lIllIIIIIlIll(Inventory.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[llIlIIIIll[0]];
                        iArr9[llIlIIIIll[1]] = llIlIIIIll[10];
                        if (lIllIIIIIllIl(Equipment.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[llIlIIIIll[0]];
                            iArr10[llIlIIIIll[1]] = llIlIIIIll[10];
                            Inventory.getFirst(iArr10).interact(llIlIIIIIl[llIlIIIIll[34]]);
                        }
                    }
                    String[] strArr22 = new String[llIlIIIIll[0]];
                    strArr22[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[67]];
                    NPCs.getNearest(strArr22).interact(llIlIIIIIl[llIlIIIIll[68]]);
                    Time.sleepTicks(llIlIIIIll[0]);
                    "".length();
                }
                if (lIllIIIIlIlII(lIllIIIIIlIlI(C0018e.w(), 60.0d))) {
                    int[] iArr11 = new int[llIlIIIIll[0]];
                    iArr11[llIlIIIIll[1]] = llIlIIIIll[13];
                    if (lIllIIIIIlIll(Inventory.contains(iArr11) ? 1 : 0)) {
                        int[] iArr12 = new int[llIlIIIIll[0]];
                        iArr12[llIlIIIIll[1]] = llIlIIIIll[13];
                        Inventory.getFirst(iArr12).interact(llIlIIIIIl[llIlIIIIll[69]]);
                        Time.sleepTicks(llIlIIIIll[0]);
                        "".length();
                    }
                }
                C0020g.a(cE);
            }
            if (lIllIIIIlIIlI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[47])) {
                String[] strArr23 = new String[llIlIIIIll[0]];
                strArr23[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[70]];
                if (lIllIIIIIllIl(Inventory.contains(strArr23) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[71]];
                    String[] strArr24 = new String[llIlIIIIll[0]];
                    strArr24[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[72]];
                    TileObjects.getNearest(strArr24).interact(llIlIIIIIl[llIlIIIIll[73]]);
                    Time.sleepTicks(llIlIIIIll[4]);
                    "".length();
                }
                String[] strArr25 = new String[llIlIIIIll[0]];
                strArr25[llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[74]];
                if (lIllIIIIIlIll(Inventory.contains(strArr25) ? 1 : 0)) {
                    if (lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(df), llIlIIIIll[4])) {
                        AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[75]];
                        Movement.walkTo(df);
                        "".length();
                        Time.sleepTicks(llIlIIIIll[0]);
                        "".length();
                        if (lIllIIIIIlIll(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIlIIIIll[20], llIlIIIIll[21], llIlIIIIll[1])) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[76]];
                            C0018e.c(new WorldPoint(llIlIIIIll[23], llIlIIIIll[24], llIlIIIIll[1]));
                            Time.sleepTicks(llIlIIIIll[5]);
                            "".length();
                        }
                    }
                    if (lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(df), llIlIIIIll[4])) {
                        AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[77]];
                        C0020g.a(llIlIIIIIl[llIlIIIIll[78]], cE, llIlIIIIll[0]);
                    }
                }
            }
            if (lIllIIIIlIIlI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[52])) {
                if (lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(dh), llIlIIIIll[9])) {
                    AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[79]];
                    Movement.walkTo(dh);
                    "".length();
                    Time.sleepTicks(llIlIIIIll[0]);
                    "".length();
                }
                if (lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(dh), llIlIIIIll[9])) {
                    AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[80]];
                    if (lIllIIIIIllII(di, llIlIIIIll[0])) {
                        aN.sB += llIlIIIIll[0];
                        aN.u(AccBuilderSotf.m);
                        di += llIlIIIIll[0];
                        aN.sB = llIlIIIIll[1];
                        dj = llIlIIIIll[1];
                    }
                    C0020g.a(llIlIIIIIl[llIlIIIIll[17]], cE);
                }
            }
        }
    }

    private static boolean lIllIIIIlIlII(int i) {
        return i < 0;
    }

    private static String lIlIllllllllI(String llllllllllllllllllIIlIIllIlIlIlI, String llllllllllllllllllIIlIIllIlIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIIllIlIlIIl.getBytes(StandardCharsets.UTF_8)), llIlIIIIll[16]), "DES");
            Cipher llllllllllllllllllIIlIIllIlIllII = Cipher.getInstance("DES");
            llllllllllllllllllIIlIIllIlIllII.init(llIlIIIIll[3], secretKeySpec);
            return new String(llllllllllllllllllIIlIIllIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIIllIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIlIIllIlIlIll) {
            llllllllllllllllllIIlIIllIlIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIIlllI(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIIIIllll(int i) {
        return i > 0;
    }

    private static boolean lIllIIIIlIIll(Object obj) {
        return obj == null;
    }

    private static String lIlIlllllllII(String llllllllllllllllllIIlIIlllIIllII, String llllllllllllllllllIIlIIlllIIlIll) {
        String llllllllllllllllllIIlIIlllIIllII2 = new String(Base64.getDecoder().decode(llllllllllllllllllIIlIIlllIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIlIIlllIIlIlI = new StringBuilder();
        char[] charArray = llllllllllllllllllIIlIIlllIIlIll.toCharArray();
        int llllllllllllllllllIIlIIlllIIlIII = llIlIIIIll[1];
        char[] charArray2 = llllllllllllllllllIIlIIlllIIllII2.toCharArray();
        int length = charArray2.length;
        int i = llIlIIIIll[1];
        while (lIllIIIIIllII(i, length)) {
            char llllllllllllllllllIIlIIlllIIllIl = charArray2[i];
            llllllllllllllllllIIlIIlllIIlIlI.append((char) (llllllllllllllllllIIlIIlllIIllIl ^ charArray[llllllllllllllllllIIlIIlllIIlIII % charArray.length]));
            "".length();
            llllllllllllllllllIIlIIlllIIlIII++;
            i++;
            "".length();
            if ((129 ^ 132) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIIlIIlllIIlIlI);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
        if (lIllIIIIIlIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean an() {
        int[] iArr = new int[llIlIIIIll[0]];
        iArr[llIlIIIIll[1]] = llIlIIIIll[6];
        if (lIllIIIIIllll(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[llIlIIIIll[0]];
            iArr2[llIlIIIIll[1]] = llIlIIIIll[8];
            if (lIllIIIIIllll(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[llIlIIIIll[0]];
                iArr3[llIlIIIIll[1]] = llIlIIIIll[10];
                if (lIllIIIIlIlIl(Inventory.getCount(iArr3))) {
                    int[] iArr4 = new int[llIlIIIIll[0]];
                    iArr4[llIlIIIIll[1]] = llIlIIIIll[10];
                }
                int[] iArr5 = new int[llIlIIIIll[0]];
                iArr5[llIlIIIIll[1]] = llIlIIIIll[13];
                if (lIllIIIIIllll(Inventory.getCount(iArr5))) {
                    ?? r0 = llIlIIIIll[0];
                    "".length();
                    return ((123 ^ 68) ^ (66 ^ 121)) < ((((23 + 129) - 1) + 0) ^ (((102 + 105) - 156) + 96)) ? ((169 ^ 135) ^ (118 ^ 121)) & (((((7 + 18) - (-3)) + 140) ^ (((52 + 44) - 21) + 62)) ^ (-" ".length())) : r0;
                }
            }
        }
        return llIlIIIIll[1];
    }

    private static boolean lIllIIIIIllIl(int i) {
        return i == 0;
    }

    private static boolean lIllIIIIlIIIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIllIIIIlIllI(int i, int i2) {
        return i >= i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIlIIIIIl[llIlIIIIll[86]];
    }

    private static int lIllIIIIIlIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01a9, code lost:
        if (lIllIIIIIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0034u.llIlIIIIll[12]) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2 = new int[llIlIIIIll[0]];
        iArr2[llIlIIIIll[1]] = llIlIIIIll[8];
        if (lIllIIIIIllIl(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIIIll[8], llIlIIIIll[0], llIlIIIIll[81]));
            "".length();
        }
        int[] iArr3 = new int[llIlIIIIll[0]];
        iArr3[llIlIIIIll[1]] = llIlIIIIll[10];
        if (lIllIIIIIllIl(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIIIll[10], llIlIIIIll[0], llIlIIIIll[81]));
            "".length();
        }
        int[] iArr4 = new int[llIlIIIIll[0]];
        iArr4[llIlIIIIll[1]] = llIlIIIIll[13];
        if (lIllIIIIIllIl(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIIIll[13], llIlIIIIll[50], llIlIIIIll[82]));
            "".length();
        }
        int[] iArr5 = new int[llIlIIIIll[0]];
        iArr5[llIlIIIIll[1]] = llIlIIIIll[11];
        if (lIllIIIIIllIl(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIIIll[11], llIlIIIIll[12], C0023j.cf));
            "".length();
        }
        if (lIllIIIIIllIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIlIIIIIl[llIlIIIIll[87]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIIIll[83], llIlIIIIll[12], llIlIIIIll[84]));
            "".length();
        }
        int[] iArr6 = new int[llIlIIIIll[0]];
        iArr6[llIlIIIIll[1]] = llIlIIIIll[7];
        if (lIllIIIIIlIll(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[llIlIIIIll[0]];
            iArr7[llIlIIIIll[1]] = llIlIIIIll[7];
            if (lIllIIIIIlIll(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIlIIIIll[0]];
                iArr8[llIlIIIIll[1]] = llIlIIIIll[7];
            }
            iArr = new int[llIlIIIIll[0]];
            iArr[llIlIIIIll[1]] = llIlIIIIll[6];
            if (lIllIIIIIllIl(Bank.contains(iArr) ? 1 : 0)) {
                return;
            }
            bv.add(new C0017d(llIlIIIIll[6], llIlIIIIll[57], llIlIIIIll[82]));
            "".length();
            return;
        }
        bv.add(new C0017d(llIlIIIIll[7], llIlIIIIll[28], llIlIIIIll[82]));
        "".length();
        iArr = new int[llIlIIIIll[0]];
        iArr[llIlIIIIll[1]] = llIlIIIIll[6];
        if (lIllIIIIIllIl(Bank.contains(iArr) ? 1 : 0)) {
        }
    }

    private static void lIllIIIIIlIII() {
        llIlIIIIIl = new String[llIlIIIIll[100]];
        llIlIIIIIl[llIlIIIIll[1]] = lIlIlllllllII("JyYGOQcJKgxwFhQ2AT4TQSYcNRkSY0gjAwg7CzgdDyhIMhUCJEgkG0E+HTUHFQ==", "aOhPt");
        llIlIIIIIl[llIlIIIIll[0]] = lIlIlllllllIl("mmPJCvWrTFsSUkEFdjCSoA==", "ckgfZ");
        llIlIIIIIl[llIlIIIIll[3]] = lIlIllllllllI("4P2NuSu/rUSGE7w8nY/5k+087kjw2ZMB", "fXpZa");
        llIlIIIIIl[llIlIIIIll[9]] = lIlIlllllllIl("oyHBKj9iIp3Vg+CTMgloqXVOETMWglQDNUpn8BtjS7Douegq1n1h0wc6fVrbWpOpDA+K5Bttbog=", "ECaGv");
        llIlIIIIIl[llIlIIIIll[4]] = lIlIllllllllI("nxUgOOtTow8=", "cJoMg");
        llIlIIIIIl[llIlIIIIll[12]] = lIlIllllllllI("BlgOABNBVZI=", "LPjig");
        llIlIIIIIl[llIlIIIIll[5]] = lIlIllllllllI("IHedzW4xWN9BO03wKnkrXQ==", "WDoBt");
        llIlIIIIIl[llIlIIIIll[18]] = lIlIlllllllII("BxcMAT09DQpTOCEGHgc=", "TcmsI");
        llIlIIIIIl[llIlIIIIll[16]] = lIlIlllllllIl("psAh7Wj8kSl2SiJkTlV8NA==", "SrFqh");
        llIlIIIIIl[llIlIIIIll[19]] = lIlIlllllllIl("r8WyNSkdILw=", "YeIQj");
        llIlIIIIIl[llIlIIIIll[14]] = lIlIlllllllIl("JBhAWLCC357K/C8sdp52fw==", "InrXU");
        llIlIIIIIl[llIlIIIIll[22]] = lIlIlllllllII("FR8NOi5qSxs1LCUAETciZgQNLQ==", "FkxYE");
        llIlIIIIIl[llIlIIIIll[25]] = lIlIlllllllII("JjYGHSUcMEoFLQA2Ag==", "rWjvL");
        llIlIIIIIl[llIlIIIIll[26]] = lIlIlllllllIl("NsrVwmljLd4=", "eKiGP");
        llIlIIIIIl[llIlIIIIll[27]] = lIlIllllllllI("HgvijA/4A6noJ5NSTRBefg==", "PkJlQ");
        llIlIIIIIl[llIlIIIIll[28]] = lIlIlllllllIl("dI0InljJra9ek7dJNjQNVQ==", "eJSuP");
        llIlIIIIIl[llIlIIIIll[29]] = lIlIlllllllIl("1xCH0cnIyCM=", "hwclk");
        llIlIIIIIl[llIlIIIIll[30]] = lIlIllllllllI("xgwfrMtiRvILoS2Y0eDIYg==", "JAqHI");
        llIlIIIIIl[llIlIIIIll[31]] = lIlIllllllllI("5KupUaPCLXlc3s5kfdt09Q==", "xJqFu");
        llIlIIIIIl[llIlIIIIll[35]] = lIlIlllllllIl("CvF/jP9UJul7ikqf02ZIWg==", "KuwlZ");
        llIlIIIIIl[llIlIIIIll[36]] = lIlIllllllllI("RGFDk3WNYX3XeRnSTixppw==", "gLLhS");
        llIlIIIIIl[llIlIIIIll[38]] = lIlIlllllllIl("U1VUpe63WWxn/SQhHnMAFA==", "YCcfm");
        llIlIIIIIl[llIlIIIIll[39]] = lIlIlllllllII("JSMscjMdIyU1", "uJKRg");
        llIlIIIIIl[llIlIIIIll[40]] = lIlIlllllllII("IS0LNwBCLhQ/EEIjDjUBCSAFPw==", "bAbZb");
        llIlIIIIIl[llIlIIIIll[41]] = lIlIlllllllII("DD8GIRkvNAw=", "NSiBr");
        llIlIIIIIl[llIlIIIIll[42]] = lIlIlllllllIl("iUy9B0BcFUbkGQAJvhbZKA==", "gJMmf");
        llIlIIIIIl[llIlIIIIll[43]] = lIlIlllllllIl("1q18Dj2OvpZ/+fu1gWwxVQ==", "UYflZ");
        llIlIIIIIl[llIlIIIIll[44]] = lIlIllllllllI("3xbEUcc64acln+mbsXWMDg==", "GsblT");
        llIlIIIIIl[llIlIIIIll[45]] = lIlIlllllllIl("gqqg3S8fpXHlXj8lCXbJSg==", "iyXle");
        llIlIIIIIl[llIlIIIIll[46]] = lIlIllllllllI("SZa97lTJDWHziYWme4V4hQ==", "beDSS");
        llIlIIIIIl[llIlIIIIll[47]] = lIlIllllllllI("NZvt0ZtOERXMoGDWwzwScbUXMKadxCMZ", "vcfuZ");
        llIlIIIIIl[llIlIIIIll[48]] = lIlIllllllllI("wuYiC91FjQo=", "MsEdv");
        llIlIIIIIl[llIlIIIIll[49]] = lIlIllllllllI("thgMrbb6Z2s=", "aFqHc");
        llIlIIIIIl[llIlIIIIll[50]] = lIlIllllllllI("pYqgnTbCcs/8F6NBokuI92F29D2TKZag", "FfFre");
        llIlIIIIIl[llIlIIIIll[51]] = lIlIlllllllIl("gyHkmV3Lj5xkpHYVcnPkV1yMnUC60Fmr", "wnXGw");
        llIlIIIIIl[llIlIIIIll[52]] = lIlIllllllllI("MlnQ1UgC7aovGGTwDhe4LilQnduHk0PF", "RsGwC");
        llIlIIIIIl[llIlIIIIll[53]] = lIlIlllllllIl("0DrIqRZICQw=", "ThyCl");
        llIlIIIIIl[llIlIIIIll[54]] = lIlIllllllllI("cjmPS4diPf183e+Am3iQBQ==", "ZFCKg");
        llIlIIIIIl[llIlIIIIll[55]] = lIlIlllllllII("Fi0aIgd1JRw4C3UpHCMA", "UAsOe");
        llIlIIIIIl[llIlIIIIll[56]] = lIlIlllllllII("Kg42Bh8eH2QPHhUf", "yzDgq");
        llIlIIIIIl[llIlIIIIll[57]] = lIlIlllllllII("OxglODoPCXcxOwQJ", "hlWYT");
        llIlIIIIIl[llIlIIIIll[58]] = lIlIllllllllI("FHJQ4Z158H3Ud+qgiL27Eg==", "NqkeH");
        llIlIIIIIl[llIlIIIIll[59]] = lIlIllllllllI("lCkOWzcPLxh4FHyul053Pw==", "bSMXW");
        llIlIIIIIl[llIlIIIIll[60]] = lIlIllllllllI("383CqH+pQvYOcaiIb6QsmBe33oWYfBzG", "oAeKz");
        llIlIIIIIl[llIlIIIIll[61]] = lIlIlllllllIl("aPmFGO+rI01oFT3NFZnevg==", "piFDD");
        llIlIIIIIl[llIlIIIIll[62]] = lIlIlllllllII("Fy0nNDt5Ljg8Kw==", "TANYY");
        llIlIIIIIl[llIlIIIIll[63]] = lIlIllllllllI("qhjK+Mw91J9c3QcIAQ8AmGJ7BfmE37Ab", "IadeY");
        llIlIIIIIl[llIlIIIIll[64]] = lIlIlllllllII("HSsDGBMgPAkTEW8pBRESIysZ", "ONjvu");
        llIlIIIIIl[llIlIIIIll[65]] = lIlIlllllllIl("J47osPkd+0A82LmDYhKfKZZ/9/avAgUo", "cyStN");
        llIlIIIIIl[llIlIIIIll[66]] = lIlIlllllllII("Lj0yEA==", "yXSbC");
        llIlIIIIIl[llIlIIIIll[34]] = lIlIllllllllI("QbsBuYWQ30M=", "VvZdM");
        llIlIIIIIl[llIlIIIIll[67]] = lIlIlllllllII("Kj4sFyUWNg==", "yQYeM");
        llIlIIIIIl[llIlIIIIll[68]] = lIlIllllllllI("tkKRmGa7MVg=", "OeTUI");
        llIlIIIIIl[llIlIIIIll[69]] = lIlIlllllllIl("T9PQCVIwcNw=", "LOxXs");
        llIlIIIIIl[llIlIIIIll[70]] = lIlIllllllllI("FYhO9vyHkOS94JdiegYmEg==", "AkYim");
        llIlIIIIIl[llIlIIIIll[71]] = lIlIllllllllI("Mr26HOJ6ZKJWzea3W4FxKg==", "VqJZt");
        llIlIIIIIl[llIlIIIIll[72]] = lIlIlllllllIl("H53UfDDUz8/LJijvy9Utbw==", "aFmKZ");
        llIlIIIIIl[llIlIIIIll[73]] = lIlIllllllllI("Z7ag7Oi5n2HCrHTQd+vxWg==", "eFHCB");
        llIlIIIIIl[llIlIIIIll[74]] = lIlIlllllllIl("HLQxlL85oGaO5fj1RKgO4A==", "hWKXN");
        llIlIIIIIl[llIlIIIIll[75]] = lIlIllllllllI("/9tut2+PyW/up+Hh/HOgBg==", "ZBgrR");
        llIlIIIIIl[llIlIIIIll[76]] = lIlIlllllllIl("edpaYniW4eHkt2dL+dmwTdsix/Rzxgcs", "XcOuc");
        llIlIIIIIl[llIlIIIIll[77]] = lIlIllllllllI("if7YNN4aeC4npsIJZ8k3HQ==", "UPnvN");
        llIlIIIIIl[llIlIIIIll[78]] = lIlIllllllllI("q/sFkp8d9LI=", "YxVCM");
        llIlIIIIIl[llIlIIIIll[79]] = lIlIllllllllI("H29dRY1XbmeO92xA+oIahA==", "kaDIe");
        llIlIIIIIl[llIlIIIIll[80]] = lIlIlllllllIl("tYfPcnCeo3x1yxcExndxSw==", "RtYVY");
        llIlIIIIIl[llIlIIIIll[17]] = lIlIllllllllI("yUrkLAmoNlA=", "KKMQe");
        llIlIIIIIl[llIlIIIIll[86]] = lIlIlllllllIl("4QaByQntSHgk4AHpouTCrKUSKHI9t100", "PiGoP");
        llIlIIIIIl[llIlIIIIll[87]] = lIlIllllllllI("ZcaZJY2Qnd8p3LfHBb3lzihEpwtNQjdj", "KInAr");
        llIlIIIIIl[llIlIIIIll[96]] = lIlIlllllllIl("jY0cdp7wJLg=", "TYcsJ");
        llIlIIIIIl[llIlIIIIll[97]] = lIlIlllllllIl("jTy96NqSZ5mpWMrdXk7i8HaJVWsE4fml", "fANMm");
        llIlIIIIIl[llIlIIIIll[98]] = lIlIllllllllI("lhFXAkjDaRnHR6RMWDmx0jgzyo/drXRtPAdv28HIK6Y=", "BqJpc");
        llIlIIIIIl[llIlIIIIll[99]] = lIlIllllllllI("NM4JsqWnwLs=", "kUnap");
    }

    private static String lIlIlllllllIl(String llllllllllllllllllIIlIIllIllIlll, String llllllllllllllllllIIlIIllIllIllI) {
        try {
            SecretKeySpec llllllllllllllllllIIlIIllIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIIllIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIlIIllIlllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIlIIllIlllIIl.init(llIlIIIIll[3], llllllllllllllllllIIlIIllIlllIlI);
            return new String(llllllllllllllllllIIlIIllIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIIllIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIlIIllIlllIII) {
            llllllllllllllllllIIlIIllIlllIII.printStackTrace();
            return null;
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            aX();
            "".length();
            if (0 != 0) {
                return (113 ^ 106) & ((108 ^ 119) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIlIIIIll[85];
    }

    private static boolean lIllIIIIlIlIl(int i) {
        return i <= 0;
    }
}
