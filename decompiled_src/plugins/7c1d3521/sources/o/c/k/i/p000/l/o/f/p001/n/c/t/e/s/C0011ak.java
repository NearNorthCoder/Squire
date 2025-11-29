package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.ak  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/ak.class */
public class C0011ak implements InterfaceC0003ac {
    static /* synthetic */ WorldPoint ck;
    static /* synthetic */ WorldPoint cl;
    private static /* synthetic */ int[] llIlllIIll;
    public static /* synthetic */ List<C0017d> bv;
    private static /* synthetic */ String[] llIlllIIlI;
    public static /* synthetic */ boolean ci;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldArea cj;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean ap() {
        if (lIlllIIlllIII(Vars.getBit(llIlllIIll[48]), llIlllIIll[1]) && lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[19])) {
            return llIlllIIll[1];
        }
        if (lIlllIIlllIII(Vars.getBit(llIlllIIll[48]), llIlllIIll[3]) && lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[32]) && lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[19])) {
            return llIlllIIll[1];
        }
        if (lIlllIIlllIII(Vars.getBit(llIlllIIll[48]), llIlllIIll[4]) && lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[32]) && lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[39])) {
            return llIlllIIll[1];
        }
        if (lIlllIIlllIII(Vars.getBit(llIlllIIll[48]), llIlllIIll[4]) && lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[32])) {
            int[] iArr = new int[llIlllIIll[1]];
            iArr[llIlllIIll[0]] = llIlllIIll[14];
            if (lIlllIIllIlII(Inventory.contains(iArr) ? 1 : 0)) {
                return llIlllIIll[1];
            }
        }
        if (lIlllIIlllIII(Vars.getBit(llIlllIIll[48]), llIlllIIll[7]) && lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[39])) {
            int[] iArr2 = new int[llIlllIIll[1]];
            iArr2[llIlllIIll[0]] = llIlllIIll[14];
            if (lIlllIIllIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                return llIlllIIll[1];
            }
        }
        return llIlllIIll[0];
    }

    private static boolean lIlllIIllIlII(int i) {
        return i == 0;
    }

    private static void lIlllIIllIIIl() {
        llIlllIIll = new int[81];
        llIlllIIll[0] = ((((146 + 4) - 146) + 147) ^ (((23 + 109) - (-21)) + 35)) & (((35 ^ 82) ^ (214 ^ 140)) ^ (-" ".length()));
        llIlllIIll[1] = " ".length();
        llIlllIIll[2] = 91 ^ 105;
        llIlllIIll[3] = "  ".length();
        llIlllIIll[4] = "   ".length();
        llIlllIIll[5] = (-8306) & 13305;
        llIlllIIll[6] = (101 ^ 91) ^ (3 ^ 59);
        llIlllIIll[7] = 21 ^ 17;
        llIlllIIll[8] = 241 ^ 198;
        llIlllIIll[9] = (-7249) & 7806;
        llIlllIIll[10] = (-((-1205) & 28343)) & (-34) & 28671;
        llIlllIIll[11] = (-((-107) & 4479)) & (-11265) & 16191;
        llIlllIIll[12] = (-((-9239) & 30271)) & (-1025) & 24556;
        llIlllIIll[13] = (-((-21033) & 31355)) & (-4225) & 15103;
        llIlllIIll[14] = (-((-5729) & 24434)) & (-1025) & 20283;
        llIlllIIll[15] = (-3147) & 7646;
        llIlllIIll[16] = (-15809) & 16371;
        llIlllIIll[17] = (-17027) & 29651;
        llIlllIIll[18] = (-16435) & 24443;
        llIlllIIll[19] = (205 ^ 146) ^ (68 ^ 30);
        llIlllIIll[20] = (-4613) & 4991;
        llIlllIIll[21] = (239 ^ 177) ^ (29 ^ 90);
        llIlllIIll[22] = (-((-1035) & 19995)) & (-5) & 20351;
        llIlllIIll[23] = (-((-8642) & 32211)) & (-8387) & 32511;
        llIlllIIll[24] = (-26689) & 27249;
        llIlllIIll[25] = (45 ^ 41) ^ (157 ^ 167);
        llIlllIIll[26] = (((22 + 77) - (-39)) + 5) ^ (((0 + 141) - 43) + 46);
        llIlllIIll[27] = (((122 + 13) - 62) + 77) ^ (((56 + 44) - (-22)) + 23);
        llIlllIIll[28] = -" ".length();
        llIlllIIll[29] = 127 ^ 90;
        llIlllIIll[30] = 117 ^ 125;
        llIlllIIll[31] = 147 ^ 190;
        llIlllIIll[32] = 97 ^ 104;
        llIlllIIll[33] = (59 ^ 49) ^ ((129 ^ 173) & ((33 ^ 13) ^ (-1)));
        llIlllIIll[34] = (((56 + 31) - 76) + 140) ^ (((101 + 63) - 17) + 9);
        llIlllIIll[35] = (-16674) & 19835;
        llIlllIIll[36] = (-((-1683) & 30451)) & (-513) & 32767;
        llIlllIIll[37] = (21 ^ 51) ^ (87 ^ 125);
        llIlllIIll[38] = 19 ^ 44;
        llIlllIIll[39] = 207 ^ 194;
        llIlllIIll[40] = (-((-3222) & 7383)) & (-8211) & 15871;
        llIlllIIll[41] = 69 ^ 75;
        llIlllIIll[42] = (((138 + 85) - 96) + 26) ^ (((93 + 4) - 83) + 136);
        llIlllIIll[43] = (159 ^ 162) ^ (40 ^ 5);
        llIlllIIll[44] = 149 ^ 132;
        llIlllIIll[45] = 82 ^ 64;
        llIlllIIll[46] = (-10889) & 12269;
        llIlllIIll[47] = 48 ^ 35;
        llIlllIIll[48] = (-9281) & 9556;
        llIlllIIll[49] = (-((-1619) & 20447)) & (-12321) & 31741;
        llIlllIIll[50] = (((73 + 62) - 74) + 79) ^ (((15 + 49) - 17) + 103);
        llIlllIIll[51] = 161 ^ 181;
        llIlllIIll[52] = 211 ^ 198;
        llIlllIIll[53] = ((154 + 189) - 142) + 0;
        llIlllIIll[54] = (99 ^ 24) ^ (114 ^ 31);
        llIlllIIll[55] = 173 ^ 186;
        llIlllIIll[56] = 77 ^ 85;
        llIlllIIll[57] = (-19477) & 20476;
        llIlllIIll[58] = ((49 + 122) - 105) + 104;
        llIlllIIll[59] = (-((-19457) & 23645)) & (-2) & 8189;
        llIlllIIll[60] = (-26636) & 28635;
        llIlllIIll[61] = (-16450) & 19449;
        llIlllIIll[62] = (-((-714) & 20461)) & (-513) & 32759;
        llIlllIIll[63] = (-16996) & 32495;
        llIlllIIll[64] = (1 ^ 22) ^ (226 ^ 141);
        llIlllIIll[65] = ((68 + 109) - 67) + 40;
        llIlllIIll[66] = (-294) & 15293;
        llIlllIIll[67] = (((15 + 118) - (-40)) + 48) ^ (((163 + 67) - 150) + 105);
        llIlllIIll[68] = (-3085) & 3404;
        llIlllIIll[69] = (-((-31946) & 32221)) & (-33) & 12287;
        llIlllIIll[70] = (-5720) & 30719;
        llIlllIIll[71] = (-(57 ^ 8)) & (-8193) & 16247;
        llIlllIIll[72] = (-22588) & 23487;
        llIlllIIll[73] = 169 ^ 178;
        llIlllIIll[74] = (((106 + 56) - 104) + 104) ^ (((111 + 83) - 79) + 75);
        llIlllIIll[75] = (240 ^ 165) ^ (58 ^ 114);
        llIlllIIll[76] = (-28721) & 31742;
        llIlllIIll[77] = (-((-2101) & 19005)) & (-4113) & 24315;
        llIlllIIll[78] = (-25609) & 28639;
        llIlllIIll[79] = (-((-3265) & 24531)) & (-1) & 24571;
        llIlllIIll[80] = 222 ^ 192;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIlllIIllIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d6, code lost:
        if (lIlllIIllIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0277, code lost:
        if (lIlllIIllIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x032d, code lost:
        if (lIlllIIllIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean an() {
        if (lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[21])) {
            int[] iArr = new int[llIlllIIll[1]];
            iArr[llIlllIIll[0]] = llIlllIIll[9];
            if (lIlllIIllIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIlllIIll[1]];
                iArr2[llIlllIIll[0]] = llIlllIIll[13];
                if (lIlllIIllIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIlllIIll[1]];
                    iArr3[llIlllIIll[0]] = llIlllIIll[11];
                    if (lIlllIIllIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llIlllIIll[1]];
                        iArr4[llIlllIIll[0]] = llIlllIIll[14];
                        if (lIlllIIllIIlI(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[llIlllIIll[1]];
                            iArr5[llIlllIIll[0]] = llIlllIIll[20];
                            if (lIlllIIllIIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llIlllIIll[1]];
                                iArr6[llIlllIIll[0]] = llIlllIIll[46];
                                if (lIlllIIllIlII(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[llIlllIIll[1]];
                                    iArr7[llIlllIIll[0]] = llIlllIIll[46];
                                }
                                ?? r0 = llIlllIIll[1];
                                "".length();
                                return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return llIlllIIll[0];
        } else if (lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[21]) && lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[8])) {
            int[] iArr8 = new int[llIlllIIll[1]];
            iArr8[llIlllIIll[0]] = llIlllIIll[13];
            if (lIlllIIllIIlI(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[llIlllIIll[1]];
                iArr9[llIlllIIll[0]] = llIlllIIll[11];
                if (lIlllIIllIIlI(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llIlllIIll[1]];
                    iArr10[llIlllIIll[0]] = llIlllIIll[14];
                    if (lIlllIIllIIlI(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[llIlllIIll[1]];
                        iArr11[llIlllIIll[0]] = llIlllIIll[16];
                        if (lIlllIIllIIlI(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llIlllIIll[1]];
                            iArr12[llIlllIIll[0]] = llIlllIIll[46];
                            if (lIlllIIllIlII(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[llIlllIIll[1]];
                                iArr13[llIlllIIll[0]] = llIlllIIll[46];
                            }
                            ?? r02 = llIlllIIll[1];
                            "".length();
                            return "   ".length() <= "  ".length() ? ((((159 + 115) - 87) + 34) ^ (((13 + 122) - 45) + 42)) & (((233 ^ 166) ^ (96 ^ 118)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return llIlllIIll[0];
        } else if (lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[8]) && lIlllIIllIlII(ci ? 1 : 0)) {
            int[] iArr14 = new int[llIlllIIll[1]];
            iArr14[llIlllIIll[0]] = llIlllIIll[22];
            if (lIlllIIllIlII(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[llIlllIIll[1]];
                iArr15[llIlllIIll[0]] = llIlllIIll[22];
            }
            int[] iArr16 = new int[llIlllIIll[1]];
            iArr16[llIlllIIll[0]] = llIlllIIll[24];
            if (lIlllIIllIIlI(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llIlllIIll[1]];
                iArr17[llIlllIIll[0]] = llIlllIIll[38];
                if (lIlllIIllIIlI(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = llIlllIIll[1];
                    "".length();
                    return "  ".length() <= 0 ? "  ".length() & ("  ".length() ^ (-1)) : r03;
                }
            }
            return llIlllIIll[0];
        } else if (lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[8]) && lIlllIIllIIlI(ci ? 1 : 0)) {
            int[] iArr18 = new int[llIlllIIll[1]];
            iArr18[llIlllIIll[0]] = llIlllIIll[22];
            if (lIlllIIllIlII(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[llIlllIIll[1]];
                iArr19[llIlllIIll[0]] = llIlllIIll[22];
            }
            int[] iArr20 = new int[llIlllIIll[1]];
            iArr20[llIlllIIll[0]] = llIlllIIll[16];
            if (lIlllIIllIIlI(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[llIlllIIll[1]];
                iArr21[llIlllIIll[0]] = llIlllIIll[23];
                if (lIlllIIllIIlI(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llIlllIIll[1]];
                    iArr22[llIlllIIll[0]] = llIlllIIll[23];
                    if (lIlllIIllIlll(Inventory.getFirst(iArr22).getQuantity(), llIlllIIll[19])) {
                        int[] iArr23 = new int[llIlllIIll[1]];
                        iArr23[llIlllIIll[0]] = llIlllIIll[24];
                        if (lIlllIIllIIlI(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[llIlllIIll[1]];
                            iArr24[llIlllIIll[0]] = llIlllIIll[38];
                            if (lIlllIIllIIlI(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = llIlllIIll[1];
                                "".length();
                                return (true ^ true) != (true ^ true) ? (true ^ true) & (true ^ true) : r04;
                            }
                        }
                    }
                }
            }
            return llIlllIIll[0];
        } else {
            return llIlllIIll[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v366, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v400, types: [boolean] */
    public static void ak() {
        if (lIlllIIllIIlI(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlllIIlI[llIlllIIll[0]];
            C0015b.a(bv);
            if (lIlllIIllIIll(bv.size(), llIlllIIll[1])) {
                System.out.println(llIlllIIlI[llIlllIIll[1]]);
                bt = llIlllIIll[0];
            }
        }
        if (lIlllIIllIlII(bt ? 1 : 0) && lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[2])) {
            if (lIlllIIllIlII(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlllIIllIlIl(nearest) && lIlllIIllIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllIIlI[llIlllIIll[3]];
                    C0000a.a(nearest);
                }
                if (lIlllIIllIlIl(nearest) && lIlllIIllIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllIIlI[llIlllIIll[4]];
                    if (lIlllIIllIlII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIlllIIll[5]);
                        "".length();
                        Time.sleepTicks(llIlllIIll[6]);
                        "".length();
                    }
                    if (lIlllIIllIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (lIlllIIllIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIlllIIll[7]);
                            "".length();
                        }
                        while (lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[8]) && lIlllIIllIlII(I.co() ? 1 : 0)) {
                            I.cm();
                            Time.sleepTicks(llIlllIIll[1]);
                            "".length();
                            "".length();
                            if ((-"   ".length()) >= 0) {
                                return;
                            }
                        }
                        if (lIlllIIllIlII(ao() ? 1 : 0)) {
                            Q();
                            System.out.println(llIlllIIlI[llIlllIIll[7]]);
                            bt = llIlllIIll[1];
                            return;
                        }
                        if (lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[8])) {
                            int[] iArr = new int[llIlllIIll[1]];
                            iArr[llIlllIIll[0]] = llIlllIIll[9];
                            if (lIlllIIllIIlI(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[llIlllIIll[1]];
                                iArr2[llIlllIIll[0]] = llIlllIIll[9];
                                if (lIlllIIllIIll(Inventory.getCount(iArr2), llIlllIIll[1])) {
                                    Bank.withdraw(llIlllIIll[9], llIlllIIll[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIlllIIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[llIlllIIll[1]];
                                        iArr3[llIlllIIll[0]] = llIlllIIll[9];
                                        if (lIlllIIllIllI(Inventory.getCount(iArr3))) {
                                            ?? r0 = llIlllIIll[1];
                                            "".length();
                                            return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIlllIIll[0];
                                    }, llIlllIIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[llIlllIIll[1]];
                            iArr3[llIlllIIll[0]] = llIlllIIll[11];
                            if (lIlllIIllIIlI(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[llIlllIIll[1]];
                                iArr4[llIlllIIll[0]] = llIlllIIll[11];
                                if (lIlllIIllIIll(Inventory.getCount(iArr4), llIlllIIll[1])) {
                                    Bank.withdraw(llIlllIIll[11], llIlllIIll[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIlllIIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[llIlllIIll[1]];
                                        iArr5[llIlllIIll[0]] = llIlllIIll[11];
                                        if (lIlllIIllIllI(Inventory.getCount(iArr5))) {
                                            ?? r0 = llIlllIIll[1];
                                            "".length();
                                            return " ".length() > "  ".length() ? ((5 ^ 117) ^ (125 ^ 33)) & (((94 ^ 85) ^ (58 ^ 29)) ^ (-" ".length())) : r0;
                                        }
                                        return llIlllIIll[0];
                                    }, llIlllIIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[llIlllIIll[1]];
                            iArr5[llIlllIIll[0]] = llIlllIIll[13];
                            if (lIlllIIllIIlI(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llIlllIIll[1]];
                                iArr6[llIlllIIll[0]] = llIlllIIll[13];
                                if (lIlllIIllIIll(Inventory.getCount(iArr6), llIlllIIll[1])) {
                                    Bank.withdraw(llIlllIIll[13], llIlllIIll[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIlllIIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[llIlllIIll[1]];
                                        iArr7[llIlllIIll[0]] = llIlllIIll[13];
                                        if (lIlllIIllIllI(Inventory.getCount(iArr7))) {
                                            ?? r0 = llIlllIIll[1];
                                            "".length();
                                            return 0 != 0 ? ((59 ^ 9) ^ (122 ^ 98)) & (((43 ^ 89) ^ (63 ^ 103)) ^ (-" ".length())) : r0;
                                        }
                                        return llIlllIIll[0];
                                    }, llIlllIIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[llIlllIIll[1]];
                            iArr7[llIlllIIll[0]] = llIlllIIll[14];
                            if (lIlllIIllIIlI(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[llIlllIIll[1]];
                                iArr8[llIlllIIll[0]] = llIlllIIll[14];
                                if (lIlllIIllIIll(Inventory.getCount(iArr8), llIlllIIll[1])) {
                                    Bank.withdraw(llIlllIIll[14], llIlllIIll[15], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIlllIIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[llIlllIIll[1]];
                                        iArr9[llIlllIIll[0]] = llIlllIIll[14];
                                        if (lIlllIIllIllI(Inventory.getCount(iArr9))) {
                                            ?? r0 = llIlllIIll[1];
                                            "".length();
                                            return ((((90 + 139) - 198) + 131) ^ (((32 + 81) - 0) + 54)) <= 0 ? ((((99 + 11) - 43) + 116) ^ (((164 + 14) - 55) + 48)) & (((253 ^ 197) ^ (74 ^ 110)) ^ (-" ".length())) : r0;
                                        }
                                        return llIlllIIll[0];
                                    }, llIlllIIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[llIlllIIll[1]];
                            iArr9[llIlllIIll[0]] = llIlllIIll[16];
                            if (lIlllIIllIIlI(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[llIlllIIll[1]];
                                iArr10[llIlllIIll[0]] = llIlllIIll[16];
                                if (lIlllIIllIIll(Inventory.getCount(iArr10), llIlllIIll[1])) {
                                    Bank.withdraw(llIlllIIll[16], llIlllIIll[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIlllIIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[llIlllIIll[1]];
                                        iArr11[llIlllIIll[0]] = llIlllIIll[16];
                                        if (lIlllIIllIllI(Inventory.getCount(iArr11))) {
                                            ?? r0 = llIlllIIll[1];
                                            "".length();
                                            return (((19 ^ 114) ^ (110 ^ 81)) & (("   ".length() ^ (152 ^ 197)) ^ (-" ".length()))) != 0 ? ((176 ^ 153) ^ (53 ^ 95)) & (((((53 + 133) - 67) + 15) ^ (((162 + 22) - 99) + 112)) ^ (-" ".length())) : r0;
                                        }
                                        return llIlllIIll[0];
                                    }, llIlllIIll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[llIlllIIll[1]];
                            iArr11[llIlllIIll[0]] = llIlllIIll[17];
                            if (lIlllIIllIIlI(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[llIlllIIll[1]];
                                iArr12[llIlllIIll[0]] = llIlllIIll[17];
                                if (lIlllIIllIlII(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(llIlllIIll[17], llIlllIIll[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIlllIIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[llIlllIIll[1]];
                                        iArr13[llIlllIIll[0]] = llIlllIIll[17];
                                        return Inventory.contains(iArr13);
                                    }, llIlllIIll[5]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(llIlllIIll[18], llIlllIIll[19], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[llIlllIIll[1]];
                            iArr13[llIlllIIll[0]] = llIlllIIll[20];
                            if (lIlllIIllIIlI(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[llIlllIIll[1]];
                                iArr14[llIlllIIll[0]] = llIlllIIll[20];
                                if (lIlllIIllIIll(Inventory.getCount(iArr14), llIlllIIll[1]) && lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[21])) {
                                    Bank.withdrawAll(llIlllIIll[20], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIlllIIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[llIlllIIll[1]];
                                        iArr15[llIlllIIll[0]] = llIlllIIll[20];
                                        if (lIlllIIllIllI(Inventory.getCount(iArr15))) {
                                            ?? r0 = llIlllIIll[1];
                                            "".length();
                                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIlllIIll[0];
                                    }, llIlllIIll[5]);
                                    "".length();
                                }
                            }
                        }
                        if (lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[8])) {
                            int[] iArr15 = new int[llIlllIIll[1]];
                            iArr15[llIlllIIll[0]] = llIlllIIll[22];
                            if (lIlllIIllIlII(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(llIlllIIll[22], llIlllIIll[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llIlllIIll[1]);
                                "".length();
                            }
                            if (lIlllIIllIIlI(ci ? 1 : 0)) {
                                Bank.withdrawAll(llIlllIIll[23], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llIlllIIll[1]);
                                "".length();
                                Bank.withdrawAll(llIlllIIll[16], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llIlllIIll[1]);
                                "".length();
                            }
                            Time.sleepTicks(llIlllIIll[4]);
                            "".length();
                            Bank.withdrawAll(llIlllIIll[24], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(llIlllIIll[1]);
                            "".length();
                            Bank.withdrawAll(llIlllIIll[25], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(llIlllIIll[1]);
                            "".length();
                        }
                    }
                }
            }
            if (lIlllIIllIIlI(an() ? 1 : 0)) {
                if (lIlllIIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[21])) {
                    if (lIlllIIllIlII(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIlllIIlI[llIlllIIll[19]];
                        Movement.walkTo(ck);
                        "".length();
                        Time.sleepTicks(llIlllIIll[1]);
                        "".length();
                    }
                    if (lIlllIIllIIlI(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIlllIIlI[llIlllIIll[6]];
                        am();
                    }
                }
                if (lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[21]) && lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[26])) {
                    AccBuilderSotf.c = llIlllIIlI[llIlllIIll[27]];
                    if (lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(llIlllIIll[1]);
                        "".length();
                    }
                }
                if (lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[26]) && lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[29])) {
                    AccBuilderSotf.c = llIlllIIlI[llIlllIIll[30]];
                    if (lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(llIlllIIll[1]);
                        "".length();
                    }
                }
                if (lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[29]) && lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[31])) {
                    AccBuilderSotf.c = llIlllIIlI[llIlllIIll[32]];
                    if (lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(llIlllIIll[1]);
                        "".length();
                    }
                }
                if (lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[31]) && lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[8])) {
                    AccBuilderSotf.c = llIlllIIlI[llIlllIIll[33]];
                    if (lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(llIlllIIll[1]);
                        "".length();
                    }
                }
                if (lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[8])) {
                    AccBuilderSotf.c = llIlllIIlI[llIlllIIll[34]];
                    if (lIlllIIlllIIl(cl)) {
                        cl = new WorldPoint(llIlllIIll[35] + C0018e.c(llIlllIIll[1], llIlllIIll[7]), llIlllIIll[36], llIlllIIll[0]);
                    }
                    int[] iArr16 = new int[llIlllIIll[1]];
                    iArr16[llIlllIIll[0]] = llIlllIIll[22];
                    if (lIlllIIllIIlI(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[llIlllIIll[1]];
                        iArr17[llIlllIIll[0]] = llIlllIIll[22];
                        if (lIlllIIllIlII(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[llIlllIIll[1]];
                            iArr18[llIlllIIll[0]] = llIlllIIll[22];
                            Inventory.getFirst(iArr18).interact(llIlllIIlI[llIlllIIll[37]]);
                            Time.sleepTicks(llIlllIIll[1]);
                            "".length();
                        }
                    }
                    if (lIlllIIllIIlI(GrandExchange.isOpen() ? 1 : 0)) {
                        C0015b.g();
                    }
                    int[] iArr19 = new int[llIlllIIll[1]];
                    iArr19[llIlllIIll[0]] = llIlllIIll[24];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[llIlllIIll[1]];
                    iArr20[llIlllIIll[0]] = llIlllIIll[38];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (lIlllIIllIlII(ci ? 1 : 0) && lIlllIIllIlIl(cl)) {
                        if (lIlllIIllIlII(Players.getLocal().getWorldLocation().equals(cl) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlllIIlI[llIlllIIll[39]];
                            Movement.walkTo(cl);
                            "".length();
                            Time.sleepTicks(llIlllIIll[1]);
                            "".length();
                        }
                        if (lIlllIIllIIlI(Players.getLocal().getWorldLocation().equals(cl) ? 1 : 0) && lIlllIIllIlIl(first) && lIlllIIllIlIl(first2) && lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                            int experience = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIlllIIllllIl(Skills.getExperience(Skill.MAGIC), experience)) {
                                    ?? r0 = llIlllIIll[1];
                                    "".length();
                                    return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIlllIIll[0];
                            }, llIlllIIll[10]);
                            "".length();
                        }
                    }
                    if (lIlllIIllIIlI(ci ? 1 : 0)) {
                        if (lIlllIIllIlIl(first) && lIlllIIllIlIl(first2) && lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                            int experience2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIlllIIllllIl(Skills.getExperience(Skill.MAGIC), experience2)) {
                                    ?? r0 = llIlllIIll[1];
                                    "".length();
                                    return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIlllIIll[0];
                            }, llIlllIIll[10]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                                ?? r0 = llIlllIIll[1];
                                "".length();
                                return (162 ^ 166) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIlllIIll[0];
                        }, llIlllIIll[40]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean lIlllIIllIIll(int i, int i2) {
        return i < i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIlllIIlI[llIlllIIll[73]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    static {
        lIlllIIllIIIl();
        lIlllIIlIIllI();
        ci = llIlllIIll[0];
        bv = new ArrayList();
        cj = new WorldArea(llIlllIIll[76], llIlllIIll[77], llIlllIIll[51], llIlllIIll[41], llIlllIIll[0]);
        ck = new WorldPoint(llIlllIIll[78], llIlllIIll[79], llIlllIIll[0]);
        cl = null;
    }

    private static void Q() {
        if (lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[8])) {
            int[] iArr = new int[llIlllIIll[1]];
            iArr[llIlllIIll[0]] = llIlllIIll[16];
            if (lIlllIIllIlII(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0017d(llIlllIIll[16], llIlllIIll[57], llIlllIIll[58]));
                "".length();
            }
            int[] iArr2 = new int[llIlllIIll[1]];
            iArr2[llIlllIIll[0]] = llIlllIIll[9];
            if (lIlllIIllIlII(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0017d(llIlllIIll[9], llIlllIIll[59], llIlllIIll[6]));
                "".length();
            }
            int[] iArr3 = new int[llIlllIIll[1]];
            iArr3[llIlllIIll[0]] = llIlllIIll[11];
            if (lIlllIIllIlII(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0017d(llIlllIIll[11], llIlllIIll[60], llIlllIIll[6]));
                "".length();
            }
            int[] iArr4 = new int[llIlllIIll[1]];
            iArr4[llIlllIIll[0]] = llIlllIIll[13];
            if (lIlllIIllIlII(Bank.contains(iArr4) ? 1 : 0)) {
                bv.add(new C0017d(llIlllIIll[13], llIlllIIll[61], llIlllIIll[6]));
                "".length();
            }
            int[] iArr5 = new int[llIlllIIll[1]];
            iArr5[llIlllIIll[0]] = llIlllIIll[14];
            if (lIlllIIllIlII(Bank.contains(iArr5) ? 1 : 0)) {
                bv.add(new C0017d(llIlllIIll[14], llIlllIIll[5], llIlllIIll[6]));
                "".length();
            }
            int[] iArr6 = new int[llIlllIIll[1]];
            iArr6[llIlllIIll[0]] = llIlllIIll[46];
            if (lIlllIIllIlII(Bank.contains(iArr6) ? 1 : 0)) {
                bv.add(new C0017d(llIlllIIll[46], llIlllIIll[1], C0018e.c(llIlllIIll[62], llIlllIIll[63])));
                "".length();
            }
        }
        if (lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[8])) {
            int[] iArr7 = new int[llIlllIIll[1]];
            iArr7[llIlllIIll[0]] = llIlllIIll[24];
            if (lIlllIIllIIlI(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIlllIIll[1]];
                iArr8[llIlllIIll[0]] = llIlllIIll[24];
                if (lIlllIIllIIll(Bank.getFirst(iArr8).getQuantity(), llIlllIIll[61])) {
                    int i = llIlllIIll[24];
                    int i2 = llIlllIIll[61];
                    int[] iArr9 = new int[llIlllIIll[1]];
                    iArr9[llIlllIIll[0]] = llIlllIIll[24];
                    bv.add(new C0017d(i, i2 - Bank.getFirst(iArr9).getQuantity(), llIlllIIll[64]));
                    "".length();
                }
            }
            int[] iArr10 = new int[llIlllIIll[1]];
            iArr10[llIlllIIll[0]] = llIlllIIll[24];
            if (lIlllIIllIlII(Bank.contains(iArr10) ? 1 : 0)) {
                bv.add(new C0017d(llIlllIIll[24], llIlllIIll[61], llIlllIIll[64]));
                "".length();
            }
            int[] iArr11 = new int[llIlllIIll[1]];
            iArr11[llIlllIIll[0]] = llIlllIIll[25];
            if (lIlllIIllIIlI(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIlllIIll[1]];
                iArr12[llIlllIIll[0]] = llIlllIIll[25];
                if (lIlllIIllIIll(Bank.getFirst(iArr12).getQuantity(), llIlllIIll[61])) {
                    int i3 = llIlllIIll[25];
                    int i4 = llIlllIIll[61];
                    int[] iArr13 = new int[llIlllIIll[1]];
                    iArr13[llIlllIIll[0]] = llIlllIIll[25];
                    bv.add(new C0017d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), llIlllIIll[65]));
                    "".length();
                }
            }
            int[] iArr14 = new int[llIlllIIll[1]];
            iArr14[llIlllIIll[0]] = llIlllIIll[25];
            if (lIlllIIllIlII(Bank.contains(iArr14) ? 1 : 0)) {
                bv.add(new C0017d(llIlllIIll[25], llIlllIIll[61], llIlllIIll[65]));
                "".length();
            }
            int[] iArr15 = new int[llIlllIIll[1]];
            iArr15[llIlllIIll[0]] = llIlllIIll[22];
            if (lIlllIIllIlII(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[llIlllIIll[1]];
                iArr16[llIlllIIll[0]] = llIlllIIll[22];
                if (lIlllIIllIlII(Equipment.contains(iArr16) ? 1 : 0)) {
                    bv.add(new C0017d(llIlllIIll[22], llIlllIIll[1], llIlllIIll[66]));
                    "".length();
                }
            }
            if (lIlllIIllIIlI(ci ? 1 : 0)) {
                int[] iArr17 = new int[llIlllIIll[1]];
                iArr17[llIlllIIll[0]] = llIlllIIll[16];
                if (lIlllIIllIIlI(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[llIlllIIll[1]];
                    iArr18[llIlllIIll[0]] = llIlllIIll[16];
                    if (lIlllIIllIIll(Bank.getFirst(iArr18).getQuantity(), llIlllIIll[61])) {
                        int i5 = llIlllIIll[16];
                        int i6 = llIlllIIll[61];
                        int[] iArr19 = new int[llIlllIIll[1]];
                        iArr19[llIlllIIll[0]] = llIlllIIll[16];
                        bv.add(new C0017d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), llIlllIIll[58]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[llIlllIIll[1]];
                iArr20[llIlllIIll[0]] = llIlllIIll[16];
                if (lIlllIIllIlII(Bank.contains(iArr20) ? 1 : 0)) {
                    bv.add(new C0017d(llIlllIIll[16], llIlllIIll[61], llIlllIIll[58]));
                    "".length();
                }
                int[] iArr21 = new int[llIlllIIll[1]];
                iArr21[llIlllIIll[0]] = llIlllIIll[23];
                if (lIlllIIllIIlI(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llIlllIIll[1]];
                    iArr22[llIlllIIll[0]] = llIlllIIll[23];
                    if (lIlllIIllIIll(Bank.getFirst(iArr22).getQuantity(), llIlllIIll[66])) {
                        int i7 = llIlllIIll[23];
                        int i8 = llIlllIIll[66];
                        int[] iArr23 = new int[llIlllIIll[1]];
                        iArr23[llIlllIIll[0]] = llIlllIIll[23];
                        bv.add(new C0017d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), llIlllIIll[6]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[llIlllIIll[1]];
                iArr24[llIlllIIll[0]] = llIlllIIll[23];
                if (lIlllIIllIlII(Bank.contains(iArr24) ? 1 : 0)) {
                    bv.add(new C0017d(llIlllIIll[23], llIlllIIll[66], llIlllIIll[6]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[llIlllIIll[1]];
        iArr25[llIlllIIll[0]] = llIlllIIll[20];
        if (lIlllIIllIlII(Bank.contains(iArr25) ? 1 : 0)) {
            bv.add(new C0017d(llIlllIIll[20], llIlllIIll[67], llIlllIIll[68]));
            "".length();
        }
        if (lIlllIIllIlII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIlllIIlI[llIlllIIll[74]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIlllIIll[69], llIlllIIll[19], llIlllIIll[70]));
            "".length();
        }
        int[] iArr26 = new int[llIlllIIll[1]];
        iArr26[llIlllIIll[0]] = llIlllIIll[71];
        if (lIlllIIllIlII(Bank.contains(iArr26) ? 1 : 0)) {
            bv.add(new C0017d(llIlllIIll[71], llIlllIIll[33], llIlllIIll[72]));
            "".length();
        }
        int[] iArr27 = new int[llIlllIIll[1]];
        iArr27[llIlllIIll[0]] = llIlllIIll[18];
        if (lIlllIIllIlII(Bank.contains(iArr27) ? 1 : 0)) {
            bv.add(new C0017d(llIlllIIll[18], llIlllIIll[33], llIlllIIll[72]));
            "".length();
        }
    }

    private static boolean lIlllIIllIIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIlllIIllIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01df, code lost:
        if (lIlllIIllIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0275, code lost:
        if (lIlllIIllIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0336, code lost:
        if (lIlllIIllIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ao() {
        if (lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[21])) {
            int[] iArr = new int[llIlllIIll[1]];
            iArr[llIlllIIll[0]] = llIlllIIll[9];
            if (lIlllIIllIIlI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIlllIIll[1]];
                iArr2[llIlllIIll[0]] = llIlllIIll[13];
                if (lIlllIIllIIlI(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIlllIIll[1]];
                    iArr3[llIlllIIll[0]] = llIlllIIll[11];
                    if (lIlllIIllIIlI(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llIlllIIll[1]];
                        iArr4[llIlllIIll[0]] = llIlllIIll[14];
                        if (lIlllIIllIIlI(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[llIlllIIll[1]];
                            iArr5[llIlllIIll[0]] = llIlllIIll[20];
                            if (lIlllIIllIIlI(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llIlllIIll[1]];
                                iArr6[llIlllIIll[0]] = llIlllIIll[46];
                                if (lIlllIIllIlII(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[llIlllIIll[1]];
                                    iArr7[llIlllIIll[0]] = llIlllIIll[46];
                                }
                                ?? r0 = llIlllIIll[1];
                                "".length();
                                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return llIlllIIll[0];
        } else if (lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[21]) && lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[8])) {
            int[] iArr8 = new int[llIlllIIll[1]];
            iArr8[llIlllIIll[0]] = llIlllIIll[13];
            if (lIlllIIllIIlI(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[llIlllIIll[1]];
                iArr9[llIlllIIll[0]] = llIlllIIll[11];
                if (lIlllIIllIIlI(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llIlllIIll[1]];
                    iArr10[llIlllIIll[0]] = llIlllIIll[14];
                    if (lIlllIIllIIlI(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[llIlllIIll[1]];
                        iArr11[llIlllIIll[0]] = llIlllIIll[16];
                        if (lIlllIIllIIlI(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llIlllIIll[1]];
                            iArr12[llIlllIIll[0]] = llIlllIIll[46];
                            if (lIlllIIllIlII(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[llIlllIIll[1]];
                                iArr13[llIlllIIll[0]] = llIlllIIll[46];
                            }
                            ?? r02 = llIlllIIll[1];
                            "".length();
                            return "   ".length() < "  ".length() ? ((116 ^ 96) ^ (103 ^ 89)) & (((251 ^ 190) ^ (192 ^ 175)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return llIlllIIll[0];
        } else if (lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[8]) && lIlllIIllIlII(ci ? 1 : 0)) {
            int[] iArr14 = new int[llIlllIIll[1]];
            iArr14[llIlllIIll[0]] = llIlllIIll[22];
            if (lIlllIIllIlII(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[llIlllIIll[1]];
                iArr15[llIlllIIll[0]] = llIlllIIll[22];
            }
            int[] iArr16 = new int[llIlllIIll[1]];
            iArr16[llIlllIIll[0]] = llIlllIIll[24];
            if (lIlllIIllIIlI(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llIlllIIll[1]];
                iArr17[llIlllIIll[0]] = llIlllIIll[25];
                if (lIlllIIllIIlI(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = llIlllIIll[1];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return llIlllIIll[0];
        } else if (lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[8]) && lIlllIIllIIlI(ci ? 1 : 0)) {
            int[] iArr18 = new int[llIlllIIll[1]];
            iArr18[llIlllIIll[0]] = llIlllIIll[22];
            if (lIlllIIllIlII(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[llIlllIIll[1]];
                iArr19[llIlllIIll[0]] = llIlllIIll[22];
            }
            int[] iArr20 = new int[llIlllIIll[1]];
            iArr20[llIlllIIll[0]] = llIlllIIll[16];
            if (lIlllIIllIIlI(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[llIlllIIll[1]];
                iArr21[llIlllIIll[0]] = llIlllIIll[23];
                if (lIlllIIllIIlI(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llIlllIIll[1]];
                    iArr22[llIlllIIll[0]] = llIlllIIll[23];
                    if (lIlllIIllIlll(Bank.getFirst(iArr22).getQuantity(), llIlllIIll[19])) {
                        int[] iArr23 = new int[llIlllIIll[1]];
                        iArr23[llIlllIIll[0]] = llIlllIIll[24];
                        if (lIlllIIllIIlI(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[llIlllIIll[1]];
                            iArr24[llIlllIIll[0]] = llIlllIIll[25];
                            if (lIlllIIllIIlI(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = llIlllIIll[1];
                                "".length();
                                return (123 ^ 126) <= 0 ? " ".length() & (" ".length() ^ (-1)) : r04;
                            }
                        }
                    }
                }
            }
            return llIlllIIll[0];
        } else {
            return llIlllIIll[0];
        }
    }

    private static void lIlllIIlIIllI() {
        llIlllIIlI = new String[llIlllIIll[80]];
        llIlllIIlI[llIlllIIll[0]] = lIlllIIlIIIll("ADYHsIf55SbRw2UVgPX3hQ==", "Fwhse");
        llIlllIIlI[llIlllIIll[1]] = lIlllIIlIIIll("7s2xTDnUIsVQCg0BX7HCx1fggHaAbPZOx0Z8m/hxywbVN8D0bYA2+Dz6P01rGyu+nHl1TSVBaNM=", "TYPyR");
        llIlllIIlI[llIlllIIll[3]] = lIlllIIlIIlII("CSQZJywmMQYgLGcxAG4pJisE", "GEoNK");
        llIlllIIlI[llIlllIIll[4]] = lIlllIIlIIlIl("/s18cky3K0B/ccgLtvZbEAtkSioviN9l", "mwttE");
        llIlllIIlI[llIlllIIll[7]] = lIlllIIlIIlIl("FiXaXCFpAmoRPSEv4HfCQ03qGHq28u4TF0VhOGPvWb+hHfJU3OcxqgVLh0N0hrH0", "Ciiek");
        llIlllIIlI[llIlllIIll[19]] = lIlllIIlIIIll("13EBe8IcV48cK9Ny2PPMoQ==", "uDQJm");
        llIlllIIlI[llIlllIIll[6]] = lIlllIIlIIIll("dKxU4XoTYP5z/c6kby6V4Q==", "kfvTA");
        llIlllIIlI[llIlllIIll[27]] = lIlllIIlIIIll("l5hk41rAMdIufP2EOJuVEKavOkA0x05E", "mipUm");
        llIlllIIlI[llIlllIIll[30]] = lIlllIIlIIlII("KRIQGRMEFEMBDwcRGk0ODx8G", "jscmz");
        llIlllIIlI[llIlllIIll[32]] = lIlllIIlIIIll("VDy/FWcLXnw8apnmvuQ+SmVFudv1f1w/", "PZbOi");
        llIlllIIlI[llIlllIIll[33]] = lIlllIIlIIIll("snwxZh/1qOO14ZBPFzNM9G3Moj5Tismi", "FkozS");
        llIlllIIlI[llIlllIIll[34]] = lIlllIIlIIlII("BiQ1PxMpLw==", "GHVWz");
        llIlllIIlI[llIlllIIll[37]] = lIlllIIlIIlII("OAA3HB0=", "oiRpy");
        llIlllIIlI[llIlllIIll[39]] = lIlllIIlIIlII("LiEhM2wXIXc3IAAmdyU8DDo=", "cNWVL");
        llIlllIIlI[llIlllIIll[41]] = lIlllIIlIIIll("nzzWbhBsaxDP+x2n2TadrQ==", "XlAlW");
        llIlllIIlI[llIlllIIll[42]] = lIlllIIlIIlIl("WA+bTxPyckPiXBuqHMv4vw==", "AGiUK");
        llIlllIIlI[llIlllIIll[43]] = lIlllIIlIIlIl("dCUueDr3OIM=", "zvhBf");
        llIlllIIlI[llIlllIIll[44]] = lIlllIIlIIlII("BwM4", "DlOqa");
        llIlllIIlI[llIlllIIll[45]] = lIlllIIlIIlIl("5EY2E1hqYLo=", "HUjOM");
        llIlllIIlI[llIlllIIll[47]] = lIlllIIlIIIll("uODslvYArew=", "inuKg");
        llIlllIIlI[llIlllIIll[51]] = lIlllIIlIIlII("JyMvBxMGNGoIDxw8KQgJHA==", "hSJiz");
        llIlllIIlI[llIlllIIll[52]] = lIlllIIlIIlIl("W+XFRVXQG+0vHPxo2ijiUg==", "JYVoT");
        llIlllIIlI[llIlllIIll[54]] = lIlllIIlIIlIl("lK5EsCSUkrW1Kilca5yeRg==", "UrNMv");
        llIlllIIlI[llIlllIIll[55]] = lIlllIIlIIIll("G+qw3I4Q0dRqjrwlL+mgMg==", "Szecg");
        llIlllIIlI[llIlllIIll[56]] = lIlllIIlIIIll("ES0fj4+I25blQ3jVf96pvA==", "urnWk");
        llIlllIIlI[llIlllIIll[21]] = lIlllIIlIIIll("XguMPWg8rMWabJZBXuQabQ==", "dGTeb");
        llIlllIIlI[llIlllIIll[50]] = lIlllIIlIIlII("Ph07I04rADsvBR0=", "xtIFn");
        llIlllIIlI[llIlllIIll[73]] = lIlllIIlIIlII("BSsfBBdoPgoMHSYjFgo=", "HJxmt");
        llIlllIIlI[llIlllIIll[74]] = lIlllIIlIIlIl("QPtLO8710Hgh7frVZyc5oORrAGRijDV0", "pOZCq");
        llIlllIIlI[llIlllIIll[75]] = lIlllIIlIIIll("TdAYg6DLwiU=", "WpziX");
    }

    private static boolean lIlllIIllllIl(int i, int i2) {
        return i > i2;
    }

    private static void am() {
        if (lIlllIIlllIll(lIlllIIlllIlI(C0018e.w(), 30.0d))) {
            int[] iArr = new int[llIlllIIll[1]];
            iArr[llIlllIIll[0]] = llIlllIIll[20];
            if (lIlllIIllIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIlllIIll[1]];
                iArr2[llIlllIIll[0]] = llIlllIIll[20];
                Inventory.getFirst(iArr2).interact(llIlllIIlI[llIlllIIll[43]]);
                Time.sleepTicks(llIlllIIll[1]);
                "".length();
            }
        }
        if (lIlllIIlllIIl(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIlllIIllIIlI(npc.getName().contains(llIlllIIlI[llIlllIIll[75]]) ? 1 : 0) && lIlllIIllIlII(npc.isDead() ? 1 : 0)) {
                    ?? r0 = llIlllIIll[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIlllIIll[0];
            });
            String[] strArr = new String[llIlllIIll[3]];
            strArr[llIlllIIll[0]] = llIlllIIlI[llIlllIIll[44]];
            strArr[llIlllIIll[1]] = llIlllIIlI[llIlllIIll[45]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (lIlllIIllllII(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = llIlllIIll[1];
                    "".length();
                    return "  ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIlllIIll[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[llIlllIIll[1]];
            iArr3[llIlllIIll[0]] = llIlllIIll[46];
            if (lIlllIIllIIlI(Equipment.contains(iArr3) ? 1 : 0) && lIlllIIllIlII(ap() ? 1 : 0)) {
                aq();
            }
            if (lIlllIIllIlIl(nearest) && lIlllIIllIlII(Players.getLocal().isMoving() ? 1 : 0)) {
                nearest.interact(llIlllIIlI[llIlllIIll[47]]);
                Time.sleepTicks(llIlllIIll[4]);
                "".length();
            }
        }
    }

    private static String lIlllIIlIIlIl(String llllllllllllllllllIIIIIlIllIlIll, String llllllllllllllllllIIIIIlIllIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIIlIllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlllIIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIIlIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIIIlIllIllII) {
            llllllllllllllllllIIIIIlIllIllII.printStackTrace();
            return null;
        }
    }

    private static String lIlllIIlIIIll(String llllllllllllllllllIIIIIlIlIllllI, String llllllllllllllllllIIIIIlIlIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIIlIlIlllIl.getBytes(StandardCharsets.UTF_8)), llIlllIIll[30]), "DES");
            Cipher llllllllllllllllllIIIIIlIllIIIII = Cipher.getInstance("DES");
            llllllllllllllllllIIIIIlIllIIIII.init(llIlllIIll[3], secretKeySpec);
            return new String(llllllllllllllllllIIIIIlIllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIIlIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIIIlIlIlllll) {
            llllllllllllllllllIIIIIlIlIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIIlllIII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlllIIllIlll(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[2])) {
            ?? r0 = llIlllIIll[1];
            "".length();
            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlllIIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIlllIIll[0];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            ak();
            "".length();
            if ("   ".length() <= 0) {
                return (60 ^ 115) & ((238 ^ 161) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIlllIIll[67];
    }

    private static int lIlllIIlllIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    public static void al() {
        if (lIlllIIllIIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlllIIllIlII(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIlllIIlI[llIlllIIll[41]];
            Movement.walkTo(ck);
            "".length();
            Time.sleepTicks(llIlllIIll[1]);
            "".length();
        }
        if (lIlllIIllIIlI(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIlllIIlI[llIlllIIll[42]];
            am();
        }
    }

    private static boolean lIlllIIlllIll(int i) {
        return i < 0;
    }

    public static void aq() {
        if (lIlllIIllIlIl(Widgets.get(llIlllIIll[49], llIlllIIll[50]))) {
            AccBuilderSotf.c = llIlllIIlI[llIlllIIll[51]];
            Widgets.get(llIlllIIll[49], llIlllIIll[50]).interact(llIlllIIlI[llIlllIIll[52]]);
            Time.sleepTicks(llIlllIIll[7]);
            "".length();
        }
        if (lIlllIIlllIIl(Widgets.get(llIlllIIll[49], llIlllIIll[50])) && lIlllIIllIlII(Widgets.get(llIlllIIll[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(llIlllIIll[1]);
            "".length();
            if (lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[19])) {
                Widgets.get(llIlllIIll[53], llIlllIIll[1]).getChild(llIlllIIll[1]).interact(llIlllIIlI[llIlllIIll[54]]);
            }
            if (lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[32]) && lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[19])) {
                Widgets.get(llIlllIIll[53], llIlllIIll[1]).getChild(llIlllIIll[3]).interact(llIlllIIlI[llIlllIIll[55]]);
            }
            if (lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[32]) && lIlllIIllIIll(Skills.getLevel(Skill.MAGIC), llIlllIIll[39])) {
                Widgets.get(llIlllIIll[53], llIlllIIll[1]).getChild(llIlllIIll[4]).interact(llIlllIIlI[llIlllIIll[56]]);
            }
            if (lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[32])) {
                int[] iArr = new int[llIlllIIll[1]];
                iArr[llIlllIIll[0]] = llIlllIIll[14];
                if (lIlllIIllIlII(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(llIlllIIll[53], llIlllIIll[1]).getChild(llIlllIIll[4]).interact(llIlllIIlI[llIlllIIll[21]]);
                }
            }
            if (lIlllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlllIIll[39])) {
                int[] iArr2 = new int[llIlllIIll[1]];
                iArr2[llIlllIIll[0]] = llIlllIIll[14];
                if (lIlllIIllIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(llIlllIIll[53], llIlllIIll[1]).getChild(llIlllIIll[7]).interact(llIlllIIlI[llIlllIIll[50]]);
                }
            }
            Time.sleepTicks(llIlllIIll[1]);
            "".length();
        }
    }

    private static boolean lIlllIIllllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlllIIllIllI(int i) {
        return i > 0;
    }

    private static boolean lIlllIIlllIIl(Object obj) {
        return obj == null;
    }

    private static String lIlllIIlIIlII(String llllllllllllllllllIIIIIllIIIIIII, String llllllllllllllllllIIIIIlIllllIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIIIIIllIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllllIIIIIlIlllllIl = llllllllllllllllllIIIIIlIllllIlI.toCharArray();
        int llllllllllllllllllIIIIIlIlllllII = llIlllIIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIlllIIll[0];
        while (lIlllIIllIIll(i, length)) {
            char llllllllllllllllllIIIIIllIIIIIIl = charArray[i];
            sb.append((char) (llllllllllllllllllIIIIIllIIIIIIl ^ llllllllllllllllllIIIIIlIlllllIl[llllllllllllllllllIIIIIlIlllllII % llllllllllllllllllIIIIIlIlllllIl.length]));
            "".length();
            llllllllllllllllllIIIIIlIlllllII++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlllIIllIlIl(Object obj) {
        return obj != null;
    }
}
