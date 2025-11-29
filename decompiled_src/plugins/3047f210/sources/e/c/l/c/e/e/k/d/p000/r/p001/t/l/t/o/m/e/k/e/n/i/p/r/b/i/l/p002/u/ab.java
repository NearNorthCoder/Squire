package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ab  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/ab.class */
public class ab implements S {
    public static final /* synthetic */ WorldPoint jI;
    public static /* synthetic */ WorldPoint jC;
    private static /* synthetic */ int[] lllllIIlll;
    static /* synthetic */ int dg;
    public static final /* synthetic */ WorldPoint jL;
    public static final /* synthetic */ WorldPoint jM;
    public static /* synthetic */ long jD;
    public static final /* synthetic */ WorldPoint jN;
    private static /* synthetic */ String[] lllllIIllI;
    public static final /* synthetic */ WorldPoint jK;
    public static final /* synthetic */ WorldPoint jQ;
    static /* synthetic */ int bS;
    public static /* synthetic */ List<C0003d> bu;
    static /* synthetic */ int bU;
    static /* synthetic */ WorldArea jH;
    public static /* synthetic */ WorldPoint jA;
    public static /* synthetic */ WorldPoint jB;
    public static final /* synthetic */ WorldPoint jJ;
    public static /* synthetic */ boolean bs;
    public static final /* synthetic */ WorldPoint jP;
    static /* synthetic */ int jG;
    static /* synthetic */ int jF;
    public static /* synthetic */ String[] jE;
    public static final /* synthetic */ WorldPoint jO;

    public static void eE() {
        if (llIlIIllIllIl(Inventory.isFull() ? 1 : 0)) {
            Inventory.getAll(jE).forEach(item -> {
                item.interact(lllllIIllI[lllllIIlll[56]]);
            });
        }
        if (llIlIIllIllll(Inventory.isFull() ? 1 : 0)) {
            int[] iArr = new int[lllllIIlll[1]];
            iArr[lllllIIlll[0]] = lllllIIlll[7];
            if (llIlIIllIllIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllllIIlll[1]];
                iArr2[lllllIIlll[0]] = lllllIIlll[6];
                if (llIlIIllIllll(Equipment.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lllllIIlll[1]];
                    iArr3[lllllIIlll[0]] = lllllIIlll[6];
                    if (llIlIIllIllIl(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lllllIIlll[1]];
                        iArr4[lllllIIlll[0]] = lllllIIlll[6];
                        Inventory.getFirst(iArr4).interact(lllllIIllI[lllllIIlll[17]]);
                        Time.sleepTicks(lllllIIlll[1]);
                        "".length();
                    }
                }
            }
        }
        if (llIlIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(jO), lllllIIlll[16])) {
            AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[18]];
            Movement.walkTo(jO);
            "".length();
            Time.sleepTicks(lllllIIlll[1]);
            "".length();
        }
        if (llIlIIlllIlIl(Players.getLocal().getWorldLocation().distanceTo(jO), lllllIIlll[16])) {
            if (llIlIIllIllll(jH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(jO);
                "".length();
                Time.sleepTicks(lllllIIlll[1]);
                "".length();
            }
            if (llIlIIllIllIl(Dialog.canLevelUpContinue() ? 1 : 0)) {
                Dialog.close();
            }
            if (llIlIIlllIllI(Players.getLocal().getGraphic(), lllllIIlll[19])) {
                AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[20]];
                String[] strArr = new String[lllllIIlll[1]];
                strArr[lllllIIlll[0]] = lllllIIllI[lllllIIlll[21]];
                if (llIlIIlllIIII(NPCs.getNearest(strArr)) && llIlIIlllIlll(Players.getLocal().getInteracting())) {
                    String[] strArr2 = new String[lllllIIlll[1]];
                    strArr2[lllllIIlll[0]] = lllllIIllI[lllllIIlll[13]];
                    NPCs.getNearest(strArr2).interact(lllllIIllI[lllllIIlll[22]]);
                    Time.sleepTicks(lllllIIlll[1]);
                    "".length();
                }
            }
            if (llIlIIllllIII(Players.getLocal().getGraphic(), lllllIIlll[19])) {
                AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[23]];
                if (!llIlIIllllIIl(llIlIIlllIlII(C0004e.u(), 70.0d)) || llIlIIlllIlIl(Skills.getBoostedLevel(Skill.HITPOINTS), lllllIIlll[8])) {
                    int[] iArr5 = new int[lllllIIlll[1]];
                    iArr5[lllllIIlll[0]] = lllllIIlll[7];
                    if (llIlIIllIllIl(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lllllIIlll[1]];
                        iArr6[lllllIIlll[0]] = lllllIIlll[7];
                        Inventory.getFirst(iArr6).interact(lllllIIllI[lllllIIlll[24]]);
                        Time.sleepTicks(lllllIIlll[1]);
                        "".length();
                    }
                }
                String[] strArr3 = new String[lllllIIlll[1]];
                strArr3[lllllIIlll[0]] = lllllIIllI[lllllIIlll[25]];
                if (llIlIIllIllIl(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lllllIIlll[1]];
                    strArr4[lllllIIlll[0]] = lllllIIllI[lllllIIlll[16]];
                    Inventory.getAll(strArr4).stream().forEach(item2 -> {
                        item2.interact(lllllIIllI[lllllIIlll[55]]);
                    });
                }
                Inventory.getAll(jE).forEach(item3 -> {
                    item3.interact(lllllIIllI[lllllIIlll[54]]);
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x013e, code lost:
        if (llIlIIllIllll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v128, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void eD() {
        if (llIlIIllIllIl(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[0]];
            C0001b.a(bu);
            if (llIlIIllIlllI(bu.size(), lllllIIlll[1])) {
                System.out.println(lllllIIllI[lllllIIlll[1]]);
                bs = lllllIIlll[0];
            }
        }
        if (llIlIIllIllll(bs ? 1 : 0)) {
            if (llIlIIllIllll(aa() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlIIlllIIII(nearest) && llIlIIllIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[2]];
                    C0000a.a(nearest);
                }
                if (llIlIIlllIIII(nearest) && llIlIIllIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[3]];
                    if (llIlIIllIllll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllllIIlll[4]);
                        "".length();
                    }
                    if (llIlIIllIllIl(Bank.isOpen() ? 1 : 0)) {
                        if (llIlIIlllIIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllllIIlll[3]);
                            "".length();
                        }
                        if (llIlIIlllIIlI(Skills.getLevel(Skill.THIEVING), lllllIIlll[5])) {
                            int[] iArr = new int[lllllIIlll[1]];
                            iArr[lllllIIlll[0]] = lllllIIlll[6];
                            if (llIlIIllIllIl(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lllllIIlll[1]];
                                iArr2[lllllIIlll[0]] = lllllIIlll[7];
                            }
                            ae();
                            System.out.println(lllllIIllI[lllllIIlll[8]]);
                            bs = lllllIIlll[1];
                            return;
                        }
                        int[] iArr3 = new int[lllllIIlll[1]];
                        iArr3[lllllIIlll[0]] = lllllIIlll[9];
                        if (llIlIIllIllIl(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lllllIIlll[1]];
                            iArr4[lllllIIlll[0]] = lllllIIlll[10];
                            if (llIlIIllIllIl(Bank.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[lllllIIlll[1]];
                                iArr5[lllllIIlll[0]] = lllllIIlll[11];
                                if (!llIlIIllIllll(Bank.contains(iArr5) ? 1 : 0)) {
                                    if (llIlIIllIlllI(Skills.getLevel(Skill.THIEVING), lllllIIlll[12])) {
                                        C0000a.a(lllllIIlll[10], lllllIIlll[12]);
                                        C0000a.a(lllllIIlll[9], lllllIIlll[12]);
                                        C0000a.a(lllllIIlll[11], lllllIIlll[13]);
                                    }
                                    if (llIlIIlllIIlI(Skills.getLevel(Skill.THIEVING), lllllIIlll[12]) && llIlIIllIlllI(Skills.getLevel(Skill.THIEVING), lllllIIlll[5])) {
                                        C0000a.a(lllllIIlll[9], lllllIIlll[12]);
                                    }
                                    if (llIlIIlllIIlI(Skills.getLevel(Skill.THIEVING), lllllIIlll[5])) {
                                        C0000a.a(lllllIIlll[6], lllllIIlll[12]);
                                        C0000a.a(lllllIIlll[7], lllllIIlll[14]);
                                        C0000a.a(lllllIIlll[15], lllllIIlll[14]);
                                    }
                                    bS += lllllIIlll[1];
                                }
                            }
                        }
                        ae();
                        System.out.println(lllllIIllI[lllllIIlll[12]]);
                        bs = lllllIIlll[1];
                        return;
                    }
                }
                if (llIlIIlllIIll(Inventory.getFreeSlots(), lllllIIlll[16])) {
                    bS += lllllIIlll[1];
                }
            }
            if (llIlIIllIllIl(aa() ? 1 : 0) && llIlIIlllIIIl(bS)) {
                if (llIlIIllIllIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (llIlIIllIlllI(Skills.getLevel(Skill.THIEVING), lllllIIlll[12])) {
                    eF();
                }
                if (llIlIIlllIIlI(Skills.getLevel(Skill.THIEVING), lllllIIlll[12]) && llIlIIllIlllI(Skills.getLevel(Skill.THIEVING), lllllIIlll[5])) {
                    eG();
                }
                if (llIlIIlllIIlI(Skills.getLevel(Skill.THIEVING), lllllIIlll[5])) {
                    eE();
                }
            }
        }
    }

    private static boolean llIlIIllllIIl(int i) {
        return i >= 0;
    }

    private static boolean llIlIIllIlllI(int i, int i2) {
        return i < i2;
    }

    private static int llIlIIllllIlI(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static void llIlIIllIllII() {
        lllllIIlll = new int[113];
        lllllIIlll[0] = (26 ^ 93) & ((203 ^ 140) ^ (-1));
        lllllIIlll[1] = " ".length();
        lllllIIlll[2] = "  ".length();
        lllllIIlll[3] = "   ".length();
        lllllIIlll[4] = (-((-8329) & 25803)) & (-8226) & 30699;
        lllllIIlll[5] = 9 ^ 47;
        lllllIIlll[6] = (-((-1575) & 11815)) & (-1025) & 32407;
        lllllIIlll[7] = (-((-145) & 30901)) & (-3) & 32751;
        lllllIIlll[8] = 145 ^ 149;
        lllllIIlll[9] = (-((-109) & 24813)) & (-25) & 32735;
        lllllIIlll[10] = (-((-22923) & 31163)) & (-16513) & 32760;
        lllllIIlll[11] = (-14341) & 14719;
        lllllIIlll[12] = (((13 + 122) - (-36)) + 26) ^ (((130 + 97) - 185) + 150);
        lllllIIlll[13] = 182 ^ 188;
        lllllIIlll[14] = 39 ^ 51;
        lllllIIlll[15] = (-((-2827) & 15263)) & (-2049) & 16375;
        lllllIIlll[16] = (((14 + 156) - 123) + 112) ^ (((137 + 26) - 66) + 47);
        lllllIIlll[17] = (76 ^ 0) ^ (41 ^ 99);
        lllllIIlll[18] = 174 ^ 169;
        lllllIIlll[19] = ((218 + 220) - 390) + 197;
        lllllIIlll[20] = (176 ^ 144) ^ (182 ^ 158);
        lllllIIlll[21] = 57 ^ 48;
        lllllIIlll[22] = 61 ^ 54;
        lllllIIlll[23] = 85 ^ 89;
        lllllIIlll[24] = (6 ^ 104) ^ (225 ^ 130);
        lllllIIlll[25] = 203 ^ 197;
        lllllIIlll[26] = 85 ^ 69;
        lllllIIlll[27] = (((17 + 57) - (-45)) + 29) ^ (((44 + 72) - 24) + 41);
        lllllIIlll[28] = (249 ^ 163) ^ (237 ^ 174);
        lllllIIlll[29] = (59 ^ 122) ^ (250 ^ 169);
        lllllIIlll[30] = (((40 + 98) - (-75)) + 2) ^ (((131 + 58) - 47) + 54);
        lllllIIlll[31] = (71 ^ 9) ^ (76 ^ 23);
        lllllIIlll[32] = (216 ^ 177) ^ (((94 + 68) - 46) + 11);
        lllllIIlll[33] = (4 ^ 27) ^ (101 ^ 109);
        lllllIIlll[34] = 182 ^ 174;
        lllllIIlll[35] = (((23 + 0) - (-14)) + 91) ^ (((20 + 131) - 70) + 73);
        lllllIIlll[36] = 147 ^ 136;
        lllllIIlll[37] = (76 ^ 85) ^ (154 ^ 159);
        lllllIIlll[38] = ((31 ^ 59) & ((68 ^ 96) ^ (-1))) ^ (70 ^ 91);
        lllllIIlll[39] = (-(77 ^ 6)) & (-24577) & 28650;
        lllllIIlll[40] = (61 ^ 68) ^ (122 ^ 29);
        lllllIIlll[41] = (-20546) & 22523;
        lllllIIlll[42] = (-((-1073) & 20083)) & (-1030) & 20479;
        lllllIIlll[43] = (-((-834) & 29563)) & (-3075) & 32703;
        lllllIIlll[44] = (-((-4101) & 6806)) & (-20483) & 23487;
        lllllIIlll[45] = (-((-1681) & 20157)) & (-1155) & 32255;
        lllllIIlll[46] = (-1031) & 16030;
        lllllIIlll[47] = (-30722) & 32671;
        lllllIIlll[48] = (22 ^ 115) ^ " ".length();
        lllllIIlll[49] = (31 ^ 74) ^ (214 ^ 156);
        lllllIIlll[50] = 106 ^ 9;
        lllllIIlll[51] = 108 ^ 76;
        lllllIIlll[52] = 50 ^ 19;
        lllllIIlll[53] = 19 ^ 49;
        lllllIIlll[54] = (7 ^ 116) ^ (68 ^ 20);
        lllllIIlll[55] = 160 ^ 132;
        lllllIIlll[56] = 127 ^ 90;
        lllllIIlll[57] = (-((-3317) & 32511)) & (-289) & 32702;
        lllllIIlll[58] = (-((-11401) & 28141)) & (-521) & 20479;
        lllllIIlll[59] = (-((-6413) & 31535)) & (-4370) & 32759;
        lllllIIlll[60] = (-((-9353) & 13966)) & (-8201) & 16223;
        lllllIIlll[61] = 15 ^ 40;
        lllllIIlll[62] = (((77 + 1) - 42) + 111) ^ (((131 + 49) - 160) + 167);
        lllllIIlll[63] = (162 ^ 186) ^ (244 ^ 197);
        lllllIIlll[64] = 29 ^ 55;
        lllllIIlll[65] = (((23 + 153) - 127) + 122) ^ (((85 + 56) - 54) + 41);
        lllllIIlll[66] = 12 ^ 32;
        lllllIIlll[67] = (24 ^ 52) ^ " ".length();
        lllllIIlll[68] = 97 ^ 79;
        lllllIIlll[69] = 33 ^ 14;
        lllllIIlll[70] = 30 ^ 46;
        lllllIIlll[71] = 47 ^ 30;
        lllllIIlll[72] = (65 ^ 85) ^ (169 ^ 143);
        lllllIIlll[73] = (9 ^ 47) ^ (118 ^ 99);
        lllllIIlll[74] = (((97 + 52) - (-24)) + 7) ^ (((74 + 116) - 136) + 74);
        lllllIIlll[75] = 117 ^ 64;
        lllllIIlll[76] = (185 ^ 170) ^ (0 ^ 37);
        lllllIIlll[77] = (121 ^ 51) ^ (105 ^ 20);
        lllllIIlll[78] = (((72 + 25) - 40) + 121) ^ (((57 + 89) - 97) + 89);
        lllllIIlll[79] = 103 ^ 94;
        lllllIIlll[80] = 50 ^ 8;
        lllllIIlll[81] = (((37 + 140) - 32) + 36) ^ (((141 + 64) - 177) + 114);
        lllllIIlll[82] = (24 ^ 91) ^ (((64 + 49) - 63) + 77);
        lllllIIlll[83] = 34 ^ 31;
        lllllIIlll[84] = 4 ^ 58;
        lllllIIlll[85] = 158 ^ 161;
        lllllIIlll[86] = (70 ^ 39) ^ (141 ^ 172);
        lllllIIlll[87] = (((64 + 40) - 8) + 108) ^ (((139 + 11) - 22) + 13);
        lllllIIlll[88] = (133 ^ 176) ^ (181 ^ 194);
        lllllIIlll[89] = (((155 + 132) - 102) + 14) ^ (((117 + 83) - 195) + 127);
        lllllIIlll[90] = (49 ^ 93) ^ (55 ^ 31);
        lllllIIlll[91] = 229 ^ 160;
        lllllIIlll[92] = 31 ^ 89;
        lllllIIlll[93] = (96 ^ 13) ^ (78 ^ 100);
        lllllIIlll[94] = 216 ^ 144;
        lllllIIlll[95] = (247 ^ 158) ^ (121 ^ 89);
        lllllIIlll[96] = 224 ^ 170;
        lllllIIlll[97] = (-2053) & 24573;
        lllllIIlll[98] = (-29698) & 32765;
        lllllIIlll[99] = (-16705) & 19943;
        lllllIIlll[100] = (-13191) & 16271;
        lllllIIlll[101] = (-((-23619) & 32591)) & (-20481) & 32703;
        lllllIIlll[102] = (-4675) & 7766;
        lllllIIlll[103] = (-4625) & 7867;
        lllllIIlll[104] = (-((-11795) & 12279)) & (-29185) & 32767;
        lllllIIlll[105] = (-((-545) & 25378)) & (-69) & 28151;
        lllllIIlll[106] = (-((-643) & 29339)) & (-260) & 30715;
        lllllIIlll[107] = (-24961) & 28589;
        lllllIIlll[108] = (-26883) & 28631;
        lllllIIlll[109] = (-145) & 3743;
        lllllIIlll[110] = (-6437) & 8175;
        lllllIIlll[111] = (-((-19506) & 28147)) & (-20481) & 32755;
        lllllIIlll[112] = (249 ^ 144) ^ (109 ^ 79);
    }

    public static void ae() {
        int[] iArr = new int[lllllIIlll[1]];
        iArr[lllllIIlll[0]] = lllllIIlll[9];
        if (llIlIIllIllll(Bank.contains(iArr) ? 1 : 0)) {
            bu.add(new C0003d(lllllIIlll[9], lllllIIlll[13], lllllIIlll[43]));
            "".length();
        }
        int[] iArr2 = new int[lllllIIlll[1]];
        iArr2[lllllIIlll[0]] = lllllIIlll[10];
        if (llIlIIllIllll(Bank.contains(iArr2) ? 1 : 0)) {
            bu.add(new C0003d(lllllIIlll[10], lllllIIlll[13], lllllIIlll[43]));
            "".length();
        }
        int[] iArr3 = new int[lllllIIlll[1]];
        iArr3[lllllIIlll[0]] = lllllIIlll[11];
        if (llIlIIllIllll(Bank.contains(iArr3) ? 1 : 0)) {
            bu.add(new C0003d(lllllIIlll[11], lllllIIlll[40], lllllIIlll[44]));
            "".length();
        }
        int[] iArr4 = new int[lllllIIlll[1]];
        iArr4[lllllIIlll[0]] = lllllIIlll[45];
        if (llIlIIllIllll(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(lllllIIlll[45], lllllIIlll[12], C0008i.bp));
            "".length();
        }
        if (llIlIIlllIIlI(Skills.getLevel(Skill.THIEVING), lllllIIlll[5])) {
            int[] iArr5 = new int[lllllIIlll[1]];
            iArr5[lllllIIlll[0]] = lllllIIlll[7];
            if (llIlIIllIllll(Bank.contains(iArr5) ? 1 : 0)) {
                bu.add(new C0003d(lllllIIlll[7], lllllIIlll[46], lllllIIlll[20]));
                "".length();
            }
            int[] iArr6 = new int[lllllIIlll[1]];
            iArr6[lllllIIlll[0]] = lllllIIlll[6];
            if (llIlIIllIllll(Bank.contains(iArr6) ? 1 : 0)) {
                bu.add(new C0003d(lllllIIlll[6], lllllIIlll[44], lllllIIlll[47]));
                "".length();
            }
        }
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lllllIIllI[lllllIIlll[49]];
    }

    private static void eG() {
        if (llIlIIllIllll(Players.getLocal().getWorldLocation().equals(jB) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[34]];
            if (llIlIIllIllIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(jB);
            "".length();
            Time.sleepTicks(lllllIIlll[1]);
            "".length();
        }
        if (llIlIIllIllIl(Players.getLocal().getWorldLocation().equals(jB) ? 1 : 0)) {
            int[] iArr = new int[lllllIIlll[1]];
            iArr[lllllIIlll[0]] = jF;
            if (llIlIIllIllIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllllIIlll[1]];
                iArr2[lllllIIlll[0]] = jF;
                Inventory.getFirst(iArr2).interact(lllllIIllI[lllllIIlll[28]]);
                Time.sleepTicks(lllllIIlll[1]);
                "".length();
            }
            if (llIlIIllIllll(Inventory.isFull() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[35]];
                String[] strArr = new String[lllllIIlll[1]];
                strArr[lllllIIlll[0]] = lllllIIllI[lllllIIlll[36]];
                if (llIlIIlllIIII(TileObjects.getNearest(strArr))) {
                    String[] strArr2 = new String[lllllIIlll[1]];
                    strArr2[lllllIIlll[0]] = lllllIIllI[lllllIIlll[37]];
                    TileObjects.getNearest(strArr2).interact(lllllIIllI[lllllIIlll[38]]);
                    Time.sleepUntil(() -> {
                        String[] strArr3 = new String[lllllIIlll[1]];
                        strArr3[lllllIIlll[0]] = lllllIIllI[lllllIIlll[53]];
                        if (llIlIIlllIlll(TileObjects.getNearest(strArr3))) {
                            ?? r0 = lllllIIlll[1];
                            "".length();
                            return 0 != 0 ? "   ".length() & ("   ".length() ^ (-1)) : r0;
                        }
                        return lllllIIlll[0];
                    }, lllllIIlll[39]);
                    "".length();
                }
            }
            if (llIlIIllIllIl(Inventory.isFull() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[40]];
                int[] iArr3 = new int[lllllIIlll[2]];
                iArr3[lllllIIlll[0]] = lllllIIlll[41];
                iArr3[lllllIIlll[1]] = lllllIIlll[42];
                Inventory.getAll(iArr3).forEach(item -> {
                    item.interact(lllllIIllI[lllllIIlll[52]]);
                });
                int[] iArr4 = new int[lllllIIlll[1]];
                iArr4[lllllIIlll[0]] = lllllIIlll[11];
                if (llIlIIllIllIl(Inventory.contains(iArr4) ? 1 : 0)) {
                    int[] iArr5 = new int[lllllIIlll[1]];
                    iArr5[lllllIIlll[0]] = lllllIIlll[11];
                    Inventory.getAll(iArr5).forEach(item2 -> {
                        item2.interact(lllllIIllI[lllllIIlll[51]]);
                    });
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIlIIlllIIlI(Skills.getLevel(Skill.THIEVING), lllllIIlll[50])) {
            ?? r0 = lllllIIlll[1];
            "".length();
            return (124 ^ 120) <= ((101 ^ 50) & ((241 ^ 166) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllllIIlll[0];
    }

    private static boolean llIlIIlllIlll(Object obj) {
        return obj == null;
    }

    static {
        llIlIIllIllII();
        llIlIIllIlIll();
        bu = new ArrayList();
        jA = new WorldPoint(lllllIIlll[57], lllllIIlll[58], lllllIIlll[0]);
        jB = new WorldPoint(lllllIIlll[59], lllllIIlll[60], lllllIIlll[0]);
        jC = new WorldPoint(lllllIIlll[0], lllllIIlll[0], lllllIIlll[0]);
        jD = System.currentTimeMillis();
        String[] strArr = new String[lllllIIlll[56]];
        strArr[lllllIIlll[0]] = lllllIIllI[lllllIIlll[5]];
        strArr[lllllIIlll[1]] = lllllIIllI[lllllIIlll[61]];
        strArr[lllllIIlll[2]] = lllllIIllI[lllllIIlll[62]];
        strArr[lllllIIlll[3]] = lllllIIllI[lllllIIlll[63]];
        strArr[lllllIIlll[8]] = lllllIIllI[lllllIIlll[64]];
        strArr[lllllIIlll[12]] = lllllIIllI[lllllIIlll[65]];
        strArr[lllllIIlll[17]] = lllllIIllI[lllllIIlll[66]];
        strArr[lllllIIlll[18]] = lllllIIllI[lllllIIlll[67]];
        strArr[lllllIIlll[20]] = lllllIIllI[lllllIIlll[68]];
        strArr[lllllIIlll[21]] = lllllIIllI[lllllIIlll[69]];
        strArr[lllllIIlll[13]] = lllllIIllI[lllllIIlll[70]];
        strArr[lllllIIlll[22]] = lllllIIllI[lllllIIlll[71]];
        strArr[lllllIIlll[23]] = lllllIIllI[lllllIIlll[72]];
        strArr[lllllIIlll[24]] = lllllIIllI[lllllIIlll[73]];
        strArr[lllllIIlll[25]] = lllllIIllI[lllllIIlll[74]];
        strArr[lllllIIlll[16]] = lllllIIllI[lllllIIlll[75]];
        strArr[lllllIIlll[26]] = lllllIIllI[lllllIIlll[76]];
        strArr[lllllIIlll[27]] = lllllIIllI[lllllIIlll[77]];
        strArr[lllllIIlll[29]] = lllllIIllI[lllllIIlll[78]];
        strArr[lllllIIlll[30]] = lllllIIllI[lllllIIlll[79]];
        strArr[lllllIIlll[14]] = lllllIIllI[lllllIIlll[80]];
        strArr[lllllIIlll[31]] = lllllIIllI[lllllIIlll[81]];
        strArr[lllllIIlll[32]] = lllllIIllI[lllllIIlll[82]];
        strArr[lllllIIlll[33]] = lllllIIllI[lllllIIlll[83]];
        strArr[lllllIIlll[34]] = lllllIIllI[lllllIIlll[84]];
        strArr[lllllIIlll[28]] = lllllIIllI[lllllIIlll[85]];
        strArr[lllllIIlll[35]] = lllllIIllI[lllllIIlll[86]];
        strArr[lllllIIlll[36]] = lllllIIllI[lllllIIlll[87]];
        strArr[lllllIIlll[37]] = lllllIIllI[lllllIIlll[88]];
        strArr[lllllIIlll[38]] = lllllIIllI[lllllIIlll[89]];
        strArr[lllllIIlll[40]] = lllllIIllI[lllllIIlll[90]];
        strArr[lllllIIlll[49]] = lllllIIllI[lllllIIlll[91]];
        strArr[lllllIIlll[51]] = lllllIIllI[lllllIIlll[92]];
        strArr[lllllIIlll[52]] = lllllIIllI[lllllIIlll[93]];
        strArr[lllllIIlll[53]] = lllllIIllI[lllllIIlll[94]];
        strArr[lllllIIlll[54]] = lllllIIllI[lllllIIlll[95]];
        strArr[lllllIIlll[55]] = lllllIIllI[lllllIIlll[96]];
        jE = strArr;
        jF = lllllIIlll[97];
        dg = lllllIIlll[0];
        bU = C0004e.c(lllllIIlll[20], lllllIIlll[32]);
        jG = C0004e.c(lllllIIlll[5], lllllIIlll[76]);
        bS = lllllIIlll[1];
        jH = new WorldArea(lllllIIlll[98], lllllIIlll[99], lllllIIlll[32], lllllIIlll[28], lllllIIlll[0]);
        jI = new WorldPoint(lllllIIlll[100], lllllIIlll[101], lllllIIlll[0]);
        jJ = new WorldPoint(lllllIIlll[102], lllllIIlll[103], lllllIIlll[0]);
        jK = new WorldPoint(lllllIIlll[104], lllllIIlll[105], lllllIIlll[0]);
        jL = new WorldPoint(lllllIIlll[106], lllllIIlll[107], lllllIIlll[0]);
        jM = new WorldPoint(lllllIIlll[108], lllllIIlll[109], lllllIIlll[0]);
        jN = new WorldPoint(lllllIIlll[110], lllllIIlll[111], lllllIIlll[0]);
        jO = jI;
        jP = jJ;
        jQ = jP;
    }

    private static int llIlIIlllIlII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIlIIlllIIIl(int i) {
        return i > 0;
    }

    private static String llIlIIllIlIII(String lllllllllllllllllIlIIlIllIlIIIII, String lllllllllllllllllIlIIlIllIIlllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIlIllIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIlIIlIllIIlllll.toCharArray();
        int lllllllllllllllllIlIIlIllIIlllII = lllllIIlll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllllIIlll[0];
        while (llIlIIllIlllI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllllIlIIlIllIIlllII % charArray.length]));
            "".length();
            lllllllllllllllllIlIIlIllIIlllII++;
            i++;
            "".length();
            if ((-((((149 + 148) - 195) + 51) ^ (((76 + 63) - 11) + 28))) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        eD();
        return lllllIIlll[48];
    }

    private static int llIlIIllllIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static String llIlIIllIlIlI(String lllllllllllllllllIlIIlIlIllllllI, String lllllllllllllllllIlIIlIlIlllllIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIIlIllIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIlIlIlllllIl.getBytes(StandardCharsets.UTF_8)), lllllIIlll[20]), "DES");
            Cipher lllllllllllllllllIlIIlIllIIIIIII = Cipher.getInstance("DES");
            lllllllllllllllllIlIIlIllIIIIIII.init(lllllIIlll[2], lllllllllllllllllIlIIlIllIIIIIIl);
            return new String(lllllllllllllllllIlIIlIllIIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIlIlIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIlIlIlllllll) {
            lllllllllllllllllIlIIlIlIlllllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lllllIIlll[0];
    }

    private static boolean llIlIIlllllII(int i) {
        return i <= 0;
    }

    private static boolean llIlIIlllIllI(int i, int i2) {
        return i != i2;
    }

    private static void llIlIIllIlIll() {
        lllllIIllI = new String[lllllIIlll[112]];
        lllllIIllI[lllllIIlll[0]] = llIlIIllIlIII("GyM/HCM+di8BKDQl", "YVFuM");
        lllllIIllI[lllllIIlll[1]] = llIlIIllIlIIl("woNK9kjtHSW+1CkUmzyP/pwqWHLC19XF2Qd6VfKP04VXMDGtnDZKavQXk4fcOqXA", "Qkzwq");
        lllllIIllI[lllllIIlll[2]] = llIlIIllIlIII("HSMzHAUyNiwbBXM2KlUAMiwu", "SBEub");
        lllllIIllI[lllllIIlll[3]] = llIlIIllIlIIl("YubtgW+UCUiVizZGui0YsAxUb27XxM4z", "DkrEj");
        lllllIIllI[lllllIIlll[8]] = llIlIIllIlIIl("Rf2U7qDd+1K5TyynLQTc9agEbaZooAgOwG1t5NX7jXJWTsX+VM1yQxgbwKybSzGv", "KWElo");
        lllllIIllI[lllllIIlll[12]] = llIlIIllIlIIl("yrm89cvY7S/YeFlOSWpJKqolQ1fKuVycu4DpHTNK1G9Y78pqes3jd0JpvUPweaJC", "SDpgr");
        lllllIIllI[lllllIIlll[17]] = llIlIIllIlIIl("3MFizy8pkEA=", "XXwhZ");
        lllllIIllI[lllllIIlll[18]] = llIlIIllIlIIl("VjHxKpKEbXTD10GKdGlVbA==", "iCZxy");
        lllllIIllI[lllllIIlll[20]] = llIlIIllIlIII("ICISGyQfKBoVIBklFg==", "pKqpT");
        lllllIIllI[lllllIIlll[21]] = llIlIIllIlIIl("xDkEpZY/0iCchWrJvVtMpw==", "eUKbs");
        lllllIIllI[lllllIIlll[13]] = llIlIIllIlIlI("/VvzTtVgPZ2EEKPdo2dSTA==", "bkzeQ");
        lllllIIllI[lllllIIlll[22]] = llIlIIllIlIlI("eB2PlskepCJFA+VViEstPw==", "BjrYu");
        lllllIIllI[lllllIIlll[23]] = llIlIIllIlIIl("Ac+O8IbSJSg=", "fnvwg");
        lllllIIllI[lllllIIlll[24]] = llIlIIllIlIII("DSodHzE=", "IXtqZ");
        lllllIIllI[lllllIIlll[25]] = llIlIIllIlIII("Pw0R", "uxvCU");
        lllllIIllI[lllllIIlll[16]] = llIlIIllIlIII("Oh0s", "phKLd");
        lllllIIllI[lllllIIlll[26]] = llIlIIllIlIII("FDcOTR81dhUIBQ==", "ZVxmk");
        lllllIIllI[lllllIIlll[27]] = llIlIIllIlIIl("+Qncr0rbaTqa9PnT8BUbvQ==", "iArQu");
        lllllIIllI[lllllIIlll[29]] = llIlIIllIlIIl("OC4UdFaZp8IzQER35yX1Ig==", "uVBXm");
        lllllIIllI[lllllIIlll[30]] = llIlIIllIlIIl("WfwdRixxclk=", "nIobs");
        lllllIIllI[lllllIIlll[14]] = llIlIIllIlIIl("mYyTnE+qRuA=", "dGMfu");
        lllllIIllI[lllllIIlll[31]] = llIlIIllIlIII("HQwPKBMiBgcmFw==", "MelCc");
        lllllIIllI[lllllIIlll[32]] = llIlIIllIlIII("JSYSKCcTNg==", "vRgFI");
        lllllIIllI[lllllIIlll[33]] = llIlIIllIlIlI("BVw+Nf6Vb10=", "ClKiP");
        lllllIIllI[lllllIIlll[34]] = llIlIIllIlIII("ABE4bBIhUDopB24EJyAD", "NpNLf");
        lllllIIllI[lllllIIlll[28]] = llIlIIllIlIlI("BDA18/ykvD0714yn/TFc0w==", "hpEbh");
        lllllIIllI[lllllIIlll[35]] = llIlIIllIlIII("Jj42GCQcJDQ=", "uJSyH");
        lllllIIllI[lllllIIlll[36]] = llIlIIllIlIIl("ESZ+gtpAkmS+bFmhkQ78mg==", "pRVnM");
        lllllIIllI[lllllIIlll[37]] = llIlIIllIlIlI("tincwnNYTpMwNd0eDJdDOg==", "zmVtF");
        lllllIIllI[lllllIIlll[38]] = llIlIIllIlIlI("HHZ2Fd2M1YJlQ4fJYEqNqw==", "preja");
        lllllIIllI[lllllIIlll[40]] = llIlIIllIlIlI("rdbPCPeb25hLts6hk7ioXg==", "uQxoN");
        lllllIIllI[lllllIIlll[49]] = llIlIIllIlIII("HywwEzQiKj4=", "KDYvB");
        lllllIIllI[lllllIIlll[51]] = llIlIIllIlIIl("YjhkZSlaZEc=", "HNiJm");
        lllllIIllI[lllllIIlll[52]] = llIlIIllIlIIl("5zDexO2JIXI=", "MPDGE");
        lllllIIllI[lllllIIlll[53]] = llIlIIllIlIII("HDQxdR88MDw5", "HQPUl");
        lllllIIllI[lllllIIlll[54]] = llIlIIllIlIlI("Em7eVbQow9M=", "OQlCr");
        lllllIIllI[lllllIIlll[55]] = llIlIIllIlIII("PBwoAQ==", "xnGqM");
        lllllIIllI[lllllIIlll[56]] = llIlIIllIlIIl("5M5Sr24e0tc=", "lSzxl");
        lllllIIllI[lllllIIlll[5]] = llIlIIllIlIIl("QnC7fFi2eVfBrX0V3xfTkQ==", "FfiWZ");
        lllllIIllI[lllllIIlll[61]] = llIlIIllIlIIl("zD/N/u3lHzqvk4BV7zFs7Q==", "FQkrD");
        lllllIIllI[lllllIIlll[62]] = llIlIIllIlIII("GjUqNzI+MWgmNjww", "YTHUS");
        lllllIIllI[lllllIIlll[63]] = llIlIIllIlIlI("GJvuKMBqWiOiiK8h7BL4cw==", "Enoxx");
        lllllIIllI[lllllIIlll[64]] = llIlIIllIlIII("EjglOBstdyI8CiY=", "BWQYo");
        lllllIIllI[lllllIIlll[65]] = llIlIIllIlIIl("gx43zGX81o9dGrxfoMH9gA==", "WlaEn");
        lllllIIllI[lllllIIlll[66]] = llIlIIllIlIII("BgQrFwA6ETEWGGgWPQYR", "HeXcu");
        lllllIIllI[lllllIIlll[67]] = llIlIIllIlIlI("0gsTy72F763fgl7Lt+Zp3Q==", "uibwD");
        lllllIIllI[lllllIIlll[68]] = llIlIIllIlIlI("g6/qa2xRXOLoI2qKEG+qYMy2UF1YE0sG", "HgWsZ");
        lllllIIllI[lllllIIlll[69]] = llIlIIllIlIlI("17VVGmL/uh5KrwUGO0HAYw==", "Ytsum");
        lllllIIllI[lllllIIlll[70]] = llIlIIllIlIlI("slXEHq0W2qkJb4DcbvW8wQ==", "ktlBX");
        lllllIIllI[lllllIIlll[71]] = llIlIIllIlIIl("/+tNRvv/4o9xkQFTs9/2Zw==", "FEwqY");
        lllllIIllI[lllllIIlll[72]] = llIlIIllIlIlI("2lymnZghIsdxfdFl5x3y6Q==", "cYcJQ");
        lllllIIllI[lllllIIlll[73]] = llIlIIllIlIIl("evxjF5TAtva3DEJXfdNqAyOLptDaUCi1", "slyRZ");
        lllllIIllI[lllllIIlll[74]] = llIlIIllIlIII("OjgeKwoDMAJ5Fgs8CA==", "nYlYe");
        lllllIIllI[lllllIIlll[75]] = llIlIIllIlIII("Azc+KCUwKjRtOzQ9KQ==", "QXMMH");
        lllllIIllI[lllllIIlll[76]] = llIlIIllIlIIl("gtbrU9G+tHDCz5kpoNcvMA==", "mwYYQ");
        lllllIIllI[lllllIIlll[77]] = llIlIIllIlIlI("CslBSb/y1GcmNX1uzX6rVYyWX84iFXKY", "OePUz");
        lllllIIllI[lllllIIlll[78]] = llIlIIllIlIlI("1YTEMfIun2NwBDGSMWeTOA==", "dbRfl");
        lllllIIllI[lllllIIlll[79]] = llIlIIllIlIlI("PjRAOoh6i2Brvonf/8o4rw==", "SWmUh");
        lllllIIllI[lllllIIlll[80]] = llIlIIllIlIlI("3z6HB1wwy5kgGfG4kZlNyg==", "GVwXT");
        lllllIIllI[lllllIIlll[81]] = llIlIIllIlIlI("4zhk9owAb4aAEj0wzALb4w==", "zKDEs");
        lllllIIllI[lllllIIlll[82]] = llIlIIllIlIII("ChgGDz8oFRBGKyIcEA==", "GytfX");
        lllllIIllI[lllllIIlll[83]] = llIlIIllIlIIl("wZbqjMs5BwNH8dI+hFYwhA==", "DEDaJ");
        lllllIIllI[lllllIIlll[84]] = llIlIIllIlIlI("tfgNfsilBr3hMeNiUgMIs4+rT5aV5lQr", "KcXbX");
        lllllIIllI[lllllIIlll[85]] = llIlIIllIlIlI("nA9aEICD7C9OZJRF4voBUQ==", "BQDyj");
        lllllIIllI[lllllIIlll[86]] = llIlIIllIlIlI("8IghEpRfQE+JSEOJZKAm1lU/0bQba+zD", "HKFdH");
        lllllIIllI[lllllIIlll[87]] = llIlIIllIlIII("KBY6GSYWWTocMFgKNg8t", "xySjI");
        lllllIIllI[lllllIIlll[88]] = llIlIIllIlIlI("fd7AzV9xgFBXgnGlqg4x2Q==", "oPbLt");
        lllllIIllI[lllllIIlll[89]] = llIlIIllIlIIl("eM6luRB3iEFIjfn0px5dKg==", "mgyIi");
        lllllIIllI[lllllIIlll[90]] = llIlIIllIlIlI("T56hxj4RmPeoO8rstQdf2Q==", "ajOuw");
        lllllIIllI[lllllIIlll[91]] = llIlIIllIlIII("ECIFGi40IhkMKipjBA0qPA==", "XCwhO");
        lllllIIllI[lllllIIlll[92]] = llIlIIllIlIIl("7xVebBXdSuyuqqdcsoo9Qw==", "ziykb");
        lllllIIllI[lllllIIlll[93]] = llIlIIllIlIII("OAEiABEeCyACEVoXKwkU", "zdNlp");
        lllllIIllI[lllllIIlll[94]] = llIlIIllIlIIl("V0DJ9vILMNfQcNrR1aHq8g==", "ZZrjk");
        lllllIIllI[lllllIIlll[95]] = llIlIIllIlIII("Mw4nIhwMQTAiCxcUIGMbBgQ3", "caSCh");
        lllllIIllI[lllllIIlll[96]] = llIlIIllIlIII("CwQN", "AqjuF");
    }

    private static String llIlIIllIlIIl(String lllllllllllllllllIlIIlIllIIIlIll, String lllllllllllllllllIlIIlIllIIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllllIlIIlIllIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIlIllIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIIlIllIIIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIIlIllIIIllIl.init(lllllIIlll[2], lllllllllllllllllIlIIlIllIIIlllI);
            return new String(lllllllllllllllllIlIIlIllIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIlIllIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIlIllIIIllII) {
            lllllllllllllllllIlIIlIllIIIllII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0151, code lost:
        if (llIlIIllIllIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean aa() {
        if (llIlIIllIlllI(Skills.getLevel(Skill.THIEVING), lllllIIlll[12])) {
            int[] iArr = new int[lllllIIlll[1]];
            iArr[lllllIIlll[0]] = lllllIIlll[11];
            if (llIlIIllIllIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllllIIlll[1]];
                iArr2[lllllIIlll[0]] = lllllIIlll[10];
                boolean contains = Inventory.contains(iArr2);
                int[] iArr3 = new int[lllllIIlll[1]];
                iArr3[lllllIIlll[0]] = lllllIIlll[9];
                if (llIlIIllIllIl((contains ? 1 : 0) & (Inventory.contains(iArr3) ? 1 : 0)) && llIlIIlllIIIl(bS)) {
                    ?? r0 = lllllIIlll[1];
                    "".length();
                    return "  ".length() <= 0 ? ((((27 + 40) - 54) + 152) ^ (((23 + 147) - 32) + 14)) & (((((218 + 77) - 144) + 103) ^ (((77 + 48) - (-38)) + 32)) ^ (-" ".length())) : r0;
                }
            }
            return lllllIIlll[0];
        } else if (llIlIIlllIIlI(Skills.getLevel(Skill.THIEVING), lllllIIlll[12]) && llIlIIllIlllI(Skills.getLevel(Skill.THIEVING), lllllIIlll[5])) {
            return lllllIIlll[1];
        } else {
            if (llIlIIlllIIlI(Skills.getLevel(Skill.THIEVING), lllllIIlll[5])) {
                int[] iArr4 = new int[lllllIIlll[1]];
                iArr4[lllllIIlll[0]] = lllllIIlll[7];
                if (llIlIIllIllIl(Inventory.contains(iArr4) ? 1 : 0)) {
                    int[] iArr5 = new int[lllllIIlll[1]];
                    iArr5[lllllIIlll[0]] = lllllIIlll[6];
                    if (llIlIIllIllll(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lllllIIlll[1]];
                        iArr6[lllllIIlll[0]] = lllllIIlll[6];
                    }
                    ?? r02 = lllllIIlll[1];
                    "".length();
                    return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
                return lllllIIlll[0];
            }
            return lllllIIlll[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    private static boolean eH() {
        return lllllIIlll[0];
    }

    private static boolean llIlIIlllIIll(int i, int i2) {
        return i > i2;
    }

    private static boolean llIlIIlllIIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIlIIllIllll(int i) {
        return i == 0;
    }

    private static void eF() {
        if (llIlIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(jA), lllllIIlll[16])) {
            AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[26]];
            Movement.walkTo(jA);
            "".length();
            Time.sleepTicks(lllllIIlll[1]);
            "".length();
        }
        if (llIlIIlllIlIl(Players.getLocal().getWorldLocation().distanceTo(jA), lllllIIlll[16])) {
            if (llIlIIllIllIl(Dialog.canLevelUpContinue() ? 1 : 0)) {
                Dialog.close();
            }
            if (llIlIIllllIIl(llIlIIllllIlI(System.currentTimeMillis(), jD))) {
                AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[27]];
                int[] iArr = new int[lllllIIlll[1]];
                iArr[lllllIIlll[0]] = jF;
                if (llIlIIllIllIl(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lllllIIlll[1]];
                    iArr2[lllllIIlll[0]] = jF;
                    if (llIlIIlllIIlI(Inventory.getFirst(iArr2).getQuantity(), lllllIIlll[28])) {
                        int[] iArr3 = new int[lllllIIlll[1]];
                        iArr3[lllllIIlll[0]] = jF;
                        Inventory.getFirst(iArr3).interact(lllllIIllI[lllllIIlll[29]]);
                        Time.sleepTicks(lllllIIlll[1]);
                        "".length();
                    }
                }
                String[] strArr = new String[lllllIIlll[1]];
                strArr[lllllIIlll[0]] = lllllIIllI[lllllIIlll[30]];
                if (llIlIIlllIIII(NPCs.getNearest(strArr)) && llIlIIlllIlll(Players.getLocal().getInteracting()) && llIlIIllIllll(Players.getLocal().isMoving() ? 1 : 0)) {
                    String[] strArr2 = new String[lllllIIlll[1]];
                    strArr2[lllllIIlll[0]] = lllllIIllI[lllllIIlll[14]];
                    NPCs.getNearest(strArr2).interact(lllllIIllI[lllllIIlll[31]]);
                    Time.sleepTicks(lllllIIlll[1]);
                    "".length();
                }
            }
            if (llIlIIlllllII(llIlIIllllIlI(System.currentTimeMillis(), jD))) {
                AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[32]];
                if (!llIlIIllllIIl(llIlIIllllIll(C0004e.u(), 30.0d)) || llIlIIlllIlIl(Skills.getBoostedLevel(Skill.HITPOINTS), lllllIIlll[8])) {
                    int[] iArr4 = new int[lllllIIlll[1]];
                    iArr4[lllllIIlll[0]] = lllllIIlll[11];
                    if (llIlIIllIllIl(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lllllIIlll[1]];
                        iArr5[lllllIIlll[0]] = lllllIIlll[11];
                        Inventory.getFirst(iArr5).interact(lllllIIllI[lllllIIlll[33]]);
                        Time.sleepTicks(lllllIIlll[1]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean llIlIIlllIlIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIlIIllllIII(int i, int i2) {
        return i == i2;
    }

    private static boolean llIlIIllIllIl(int i) {
        return i != 0;
    }

    private static boolean llIlIIlllIIII(Object obj) {
        return obj != null;
    }
}
