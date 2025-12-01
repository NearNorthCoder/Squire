package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
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
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.k  reason: invalid package and case insensitive filesystem */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/k.class */
public class C0010k implements S {
    static /* synthetic */ WorldArea bv;
    private static /* synthetic */ String[] llllIlllIl;
    public static /* synthetic */ boolean bs;
    static /* synthetic */ WorldPoint bw;
    private static /* synthetic */ int[] llllIllllI;
    public static /* synthetic */ List<C0003d> bu;
    static /* synthetic */ WorldPoint bx;
    public static /* synthetic */ boolean bt;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean ac() {
        if (llIlIIIlIllll(Vars.getBit(llllIllllI[48]), llllIllllI[1]) && llIlIIIlIlIlI(Skills.getLevel(Skill.MAGIC), llllIllllI[17])) {
            return llllIllllI[1];
        }
        if (llIlIIIlIllll(Vars.getBit(llllIllllI[48]), llllIllllI[2]) && llIlIIIlIlIlI(Skills.getLevel(Skill.MAGIC), llllIllllI[31]) && llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[17])) {
            return llllIllllI[1];
        }
        if (llIlIIIlIllll(Vars.getBit(llllIllllI[48]), llllIllllI[3]) && llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[31]) && llIlIIIlIlIlI(Skills.getLevel(Skill.MAGIC), llllIllllI[36])) {
            return llllIllllI[1];
        }
        if (llIlIIIlIllll(Vars.getBit(llllIllllI[48]), llllIllllI[3]) && llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[31])) {
            int[] iArr = new int[llllIllllI[1]];
            iArr[llllIllllI[0]] = llllIllllI[12];
            if (llIlIIIlIlIll(Inventory.contains(iArr) ? 1 : 0)) {
                return llllIllllI[1];
            }
        }
        if (llIlIIIlIllll(Vars.getBit(llllIllllI[48]), llllIllllI[5]) && llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[36])) {
            int[] iArr2 = new int[llllIllllI[1]];
            iArr2[llllIllllI[0]] = llllIllllI[12];
            if (llIlIIIlIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                return llllIllllI[1];
            }
        }
        return llllIllllI[0];
    }

    private static boolean llIlIIIlIlIll(int i) {
        return i == 0;
    }

    private static boolean llIlIIIllIIlI(Object obj) {
        return obj == null;
    }

    private static boolean llIlIIIlIlIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (llIlIIIlIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d6, code lost:
        if (llIlIIIlIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x025c, code lost:
        if (llIlIIIlIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0338, code lost:
        if (llIlIIIlIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
    private static boolean ab() {
        if (llIlIIIlIlIlI(Skills.getLevel(Skill.MAGIC), llllIllllI[19])) {
            int[] iArr = new int[llllIllllI[1]];
            iArr[llllIllllI[0]] = llllIllllI[7];
            if (llIlIIIlIlIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llllIllllI[1]];
                iArr2[llllIllllI[0]] = llllIllllI[11];
                if (llIlIIIlIlIIl(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llllIllllI[1]];
                    iArr3[llllIllllI[0]] = llllIllllI[9];
                    if (llIlIIIlIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llllIllllI[1]];
                        iArr4[llllIllllI[0]] = llllIllllI[12];
                        if (llIlIIIlIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[llllIllllI[1]];
                            iArr5[llllIllllI[0]] = llllIllllI[18];
                            if (llIlIIIlIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llllIllllI[1]];
                                iArr6[llllIllllI[0]] = llllIllllI[44];
                                if (llIlIIIlIlIll(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[llllIllllI[1]];
                                    iArr7[llllIllllI[0]] = llllIllllI[44];
                                }
                                ?? r0 = llllIllllI[1];
                                "".length();
                                return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return llllIllllI[0];
        } else if (llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[19]) && llIlIIIlIlIlI(Skills.getLevel(Skill.MAGIC), llllIllllI[6])) {
            int[] iArr8 = new int[llllIllllI[1]];
            iArr8[llllIllllI[0]] = llllIllllI[11];
            if (llIlIIIlIlIIl(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[llllIllllI[1]];
                iArr9[llllIllllI[0]] = llllIllllI[9];
                if (llIlIIIlIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llllIllllI[1]];
                    iArr10[llllIllllI[0]] = llllIllllI[12];
                    if (llIlIIIlIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[llllIllllI[1]];
                        iArr11[llllIllllI[0]] = llllIllllI[14];
                        if (llIlIIIlIlIIl(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llllIllllI[1]];
                            iArr12[llllIllllI[0]] = llllIllllI[44];
                            if (llIlIIIlIlIll(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[llllIllllI[1]];
                                iArr13[llllIllllI[0]] = llllIllllI[44];
                            }
                            ?? r02 = llllIllllI[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r02;
                        }
                    }
                }
            }
            return llllIllllI[0];
        } else if (llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[6]) && llIlIIIlIlIll(bt ? 1 : 0)) {
            int[] iArr14 = new int[llllIllllI[1]];
            iArr14[llllIllllI[0]] = llllIllllI[20];
            if (llIlIIIlIlIll(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[llllIllllI[1]];
                iArr15[llllIllllI[0]] = llllIllllI[20];
            }
            int[] iArr16 = new int[llllIllllI[1]];
            iArr16[llllIllllI[0]] = llllIllllI[22];
            if (llIlIIIlIlIIl(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llllIllllI[1]];
                iArr17[llllIllllI[0]] = llllIllllI[23];
                if (llIlIIIlIlIIl(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = llllIllllI[1];
                    "".length();
                    return " ".length() <= (-" ".length()) ? ((((201 + 36) - 173) + 173) ^ (((115 + 1) - (-22)) + 58)) & (((158 ^ 154) ^ (41 ^ 4)) ^ (-" ".length())) : r03;
                }
            }
            return llllIllllI[0];
        } else if (llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[6]) && llIlIIIlIlIIl(bt ? 1 : 0)) {
            int[] iArr18 = new int[llllIllllI[1]];
            iArr18[llllIllllI[0]] = llllIllllI[20];
            if (llIlIIIlIlIll(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[llllIllllI[1]];
                iArr19[llllIllllI[0]] = llllIllllI[20];
            }
            int[] iArr20 = new int[llllIllllI[1]];
            iArr20[llllIllllI[0]] = llllIllllI[14];
            if (llIlIIIlIlIIl(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[llllIllllI[1]];
                iArr21[llllIllllI[0]] = llllIllllI[21];
                if (llIlIIIlIlIIl(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llllIllllI[1]];
                    iArr22[llllIllllI[0]] = llllIllllI[21];
                    if (llIlIIIlIlllI(Bank.getFirst(iArr22).getQuantity(), llllIllllI[17])) {
                        int[] iArr23 = new int[llllIllllI[1]];
                        iArr23[llllIllllI[0]] = llllIllllI[22];
                        if (llIlIIIlIlIIl(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[llllIllllI[1]];
                            iArr24[llllIllllI[0]] = llllIllllI[23];
                            if (llIlIIIlIlIIl(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = llllIllllI[1];
                                "".length();
                                return (139 ^ 143) < (190 ^ 186) ? (true ^ true) & ((true ^ true) ^ true) : r04;
                            }
                        }
                    }
                }
            }
            return llllIllllI[0];
        } else {
            return llllIllllI[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return llllIllllI[0];
    }

    private static void llIlIIIlIlIII() {
        llllIllllI = new int[82];
        llllIllllI[0] = (60 ^ 48) & ((43 ^ 39) ^ (-1));
        llllIllllI[1] = " ".length();
        llllIllllI[2] = "  ".length();
        llllIllllI[3] = "   ".length();
        llllIllllI[4] = (-87) & 5086;
        llllIllllI[5] = (19 ^ 80) ^ (81 ^ 22);
        llllIllllI[6] = 152 ^ 175;
        llllIllllI[7] = (-((-20729) & 29178)) & (-1025) & 10031;
        llllIllllI[8] = (-((-16921) & 31291)) & (-513) & 16382;
        llllIllllI[9] = (-17473) & 18027;
        llllIllllI[10] = (-21523) & 24022;
        llllIllllI[11] = (-((-8741) & 28533)) & (-3) & 20351;
        llllIllllI[12] = (-((-14378) & 15551)) & (-14657) & 16383;
        llllIllllI[13] = (-((-258) & 10091)) & (-18433) & 32765;
        llllIllllI[14] = (-4425) & 4987;
        llllIllllI[15] = (-651) & 13275;
        llllIllllI[16] = (-((-22809) & 31163)) & (-1) & 16363;
        llllIllllI[17] = 153 ^ 156;
        llllIllllI[18] = (-((-24593) & 31381)) & (-24577) & 31743;
        llllIllllI[19] = 85 ^ 76;
        llllIllllI[20] = (-((-8369) & 28849)) & (-513) & 22379;
        llllIllllI[21] = (-((-29837) & 32143)) & (-17426) & 20287;
        llllIllllI[22] = (-((-27465) & 28621)) & (-20491) & 22207;
        llllIllllI[23] = 254 ^ 192;
        llllIllllI[24] = 70 ^ 64;
        llllIllllI[25] = 178 ^ 173;
        llllIllllI[26] = (135 ^ 182) ^ (162 ^ 148);
        llllIllllI[27] = -" ".length();
        llllIllllI[28] = 229 ^ 192;
        llllIllllI[29] = (187 ^ 198) ^ (121 ^ 12);
        llllIllllI[30] = 57 ^ 20;
        llllIllllI[31] = 71 ^ 78;
        llllIllllI[32] = 67 ^ 73;
        llllIllllI[33] = 102 ^ 109;
        llllIllllI[34] = 139 ^ 135;
        llllIllllI[35] = 119 ^ 72;
        llllIllllI[36] = 113 ^ 124;
        llllIllllI[37] = (-5130) & 5449;
        llllIllllI[38] = (-((-5121) & 32230)) & (-1025) & 28663;
        llllIllllI[39] = (-16449) & 19948;
        llllIllllI[40] = 74 ^ 68;
        llllIllllI[41] = (96 ^ 42) ^ (198 ^ 131);
        llllIllllI[42] = 47 ^ 63;
        llllIllllI[43] = (((87 + 16) - 47) + 125) ^ (((156 + 41) - 195) + 162);
        llllIllllI[44] = (-((-5643) & 22171)) & (-8705) & 26613;
        llllIllllI[45] = (((33 + 84) - 38) + 87) ^ (((152 + 95) - 199) + 132);
        llllIllllI[46] = (((26 + 100) - 110) + 126) ^ (((79 + 151) - 145) + 72);
        llllIllllI[47] = (((195 + 206) - 386) + 193) ^ (((117 + 169) - 161) + 71);
        llllIllllI[48] = (-((-4359) & 21999)) & (-12292) & 30207;
        llllIllllI[49] = (-7201) & 7793;
        llllIllllI[50] = 18 ^ 8;
        llllIllllI[51] = (117 ^ 111) ^ (90 ^ 85);
        llllIllllI[52] = (((126 + 121) - 160) + 69) ^ (((47 + 125) - 119) + 85);
        llllIllllI[53] = ((78 + 160) - 98) + 61;
        llllIllllI[54] = 168 ^ 191;
        llllIllllI[55] = (((130 + 106) - 135) + 31) ^ (((133 + 11) - 58) + 70);
        llllIllllI[56] = 190 ^ 165;
        llllIllllI[57] = (-17431) & 18430;
        llllIllllI[58] = (((((64 + 33) - (-28)) + 6) + (50 ^ 46)) - (232 ^ 175)) + (34 ^ 112);
        llllIllllI[59] = (-28693) & 32692;
        llllIllllI[60] = (-28719) & 30718;
        llllIllllI[61] = (-((-538) & 30301)) & (-5) & 32767;
        llllIllllI[62] = (-((-8925) & 26621)) & (-2050) & 32245;
        llllIllllI[63] = (-((-8611) & 25587)) & (-289) & 32764;
        llllIllllI[64] = 113 ^ 9;
        llllIllllI[65] = ((47 + 61) - (-17)) + 25;
        llllIllllI[66] = (-((-2041) & 18431)) & (-1345) & 32734;
        llllIllllI[67] = 219 ^ 191;
        llllIllllI[68] = (-"  ".length()) & (-257) & 12237;
        llllIllllI[69] = (-((-20926) & 21503)) & (-2051) & 27627;
        llllIllllI[70] = (-((-12857) & 29369)) & (-1) & 24519;
        llllIllllI[71] = (-((-8965) & 27445)) & (-12353) & 31732;
        llllIllllI[72] = (95 ^ 57) ^ (25 ^ 99);
        llllIllllI[73] = (17 ^ 119) ^ (165 ^ 160);
        llllIllllI[74] = (((54 + 173) - 147) + 95) ^ (((116 + 82) - 194) + 174);
        llllIllllI[75] = 221 ^ 195;
        llllIllllI[76] = (-34) & 3055;
        llllIllllI[77] = (-537) & 3835;
        llllIllllI[78] = (-13321) & 16351;
        llllIllllI[79] = (-20743) & 24047;
        llllIllllI[80] = (-((-8065) & 16293)) & (-129) & 11518;
        llllIllllI[81] = (-29185) & 32671;
    }

    public static void Y() {
        if (llIlIIIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIlIIIlIlIll(bv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[40]];
            Movement.walkTo(bw);
            "".length();
            Time.sleepTicks(llllIllllI[1]);
            "".length();
        }
        if (llIlIIIlIlIIl(bv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Z();
        }
    }

    public static void ad() {
        if (llIlIIIlIllII(Widgets.get(llllIllllI[49], llllIllllI[50]))) {
            AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[51]];
            Widgets.get(llllIllllI[49], llllIllllI[50]).interact(llllIlllIl[llllIllllI[52]]);
            Time.sleepTicks(llllIllllI[5]);
            "".length();
        }
        if (llIlIIIllIIlI(Widgets.get(llllIllllI[49], llllIllllI[50])) && llIlIIIlIlIll(Widgets.get(llllIllllI[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(llllIllllI[1]);
            "".length();
            if (llIlIIIlIlIlI(Skills.getLevel(Skill.MAGIC), llllIllllI[17])) {
                Widgets.get(llllIllllI[53], llllIllllI[1]).getChild(llllIllllI[1]).interact(llllIlllIl[llllIllllI[54]]);
            }
            if (llIlIIIlIlIlI(Skills.getLevel(Skill.MAGIC), llllIllllI[31]) && llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[17])) {
                Widgets.get(llllIllllI[53], llllIllllI[1]).getChild(llllIllllI[2]).interact(llllIlllIl[llllIllllI[55]]);
            }
            if (llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[31]) && llIlIIIlIlIlI(Skills.getLevel(Skill.MAGIC), llllIllllI[36])) {
                Widgets.get(llllIllllI[53], llllIllllI[1]).getChild(llllIllllI[3]).interact(llllIlllIl[llllIllllI[19]]);
            }
            if (llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[31])) {
                int[] iArr = new int[llllIllllI[1]];
                iArr[llllIllllI[0]] = llllIllllI[12];
                if (llIlIIIlIlIll(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(llllIllllI[53], llllIllllI[1]).getChild(llllIllllI[3]).interact(llllIlllIl[llllIllllI[50]]);
                }
            }
            if (llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[36])) {
                int[] iArr2 = new int[llllIllllI[1]];
                iArr2[llllIllllI[0]] = llllIllllI[12];
                if (llIlIIIlIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(llllIllllI[53], llllIllllI[1]).getChild(llllIllllI[5]).interact(llllIlllIl[llllIllllI[56]]);
                }
            }
            Time.sleepTicks(llllIllllI[1]);
            "".length();
        }
    }

    private static boolean llIlIIIlIlllI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (llIlIIIlIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01f8, code lost:
        if (llIlIIIlIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x027b, code lost:
        if (llIlIIIlIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0338, code lost:
        if (llIlIIIlIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
    private static boolean aa() {
        if (llIlIIIlIlIlI(Skills.getLevel(Skill.MAGIC), llllIllllI[19])) {
            int[] iArr = new int[llllIllllI[1]];
            iArr[llllIllllI[0]] = llllIllllI[7];
            if (llIlIIIlIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llllIllllI[1]];
                iArr2[llllIllllI[0]] = llllIllllI[11];
                if (llIlIIIlIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llllIllllI[1]];
                    iArr3[llllIllllI[0]] = llllIllllI[9];
                    if (llIlIIIlIlIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llllIllllI[1]];
                        iArr4[llllIllllI[0]] = llllIllllI[12];
                        if (llIlIIIlIlIIl(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[llllIllllI[1]];
                            iArr5[llllIllllI[0]] = llllIllllI[18];
                            if (llIlIIIlIlIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llllIllllI[1]];
                                iArr6[llllIllllI[0]] = llllIllllI[44];
                                if (llIlIIIlIlIll(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[llllIllllI[1]];
                                    iArr7[llllIllllI[0]] = llllIllllI[44];
                                }
                                ?? r0 = llllIllllI[1];
                                "".length();
                                return "   ".length() < 0 ? ((((25 + 93) - 19) + 79) ^ (((27 + 183) - 184) + 160)) & (((((95 + 69) - 104) + 67) ^ (0 ^ 119)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return llllIllllI[0];
        } else if (llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[19]) && llIlIIIlIlIlI(Skills.getLevel(Skill.MAGIC), llllIllllI[6])) {
            int[] iArr8 = new int[llllIllllI[1]];
            iArr8[llllIllllI[0]] = llllIllllI[11];
            if (llIlIIIlIlIIl(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[llllIllllI[1]];
                iArr9[llllIllllI[0]] = llllIllllI[9];
                if (llIlIIIlIlIIl(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llllIllllI[1]];
                    iArr10[llllIllllI[0]] = llllIllllI[12];
                    if (llIlIIIlIlIIl(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[llllIllllI[1]];
                        iArr11[llllIllllI[0]] = llllIllllI[14];
                        if (llIlIIIlIlIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llllIllllI[1]];
                            iArr12[llllIllllI[0]] = llllIllllI[44];
                            if (llIlIIIlIlIll(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[llllIllllI[1]];
                                iArr13[llllIllllI[0]] = llllIllllI[44];
                            }
                            ?? r02 = llllIllllI[1];
                            "".length();
                            return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r02;
                        }
                    }
                }
            }
            return llllIllllI[0];
        } else if (llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[6]) && llIlIIIlIlIll(bt ? 1 : 0)) {
            int[] iArr14 = new int[llllIllllI[1]];
            iArr14[llllIllllI[0]] = llllIllllI[20];
            if (llIlIIIlIlIll(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[llllIllllI[1]];
                iArr15[llllIllllI[0]] = llllIllllI[20];
            }
            int[] iArr16 = new int[llllIllllI[1]];
            iArr16[llllIllllI[0]] = llllIllllI[22];
            if (llIlIIIlIlIIl(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llllIllllI[1]];
                iArr17[llllIllllI[0]] = llllIllllI[35];
                if (llIlIIIlIlIIl(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = llllIllllI[1];
                    "".length();
                    return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return llllIllllI[0];
        } else if (llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[6]) && llIlIIIlIlIIl(bt ? 1 : 0)) {
            int[] iArr18 = new int[llllIllllI[1]];
            iArr18[llllIllllI[0]] = llllIllllI[20];
            if (llIlIIIlIlIll(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[llllIllllI[1]];
                iArr19[llllIllllI[0]] = llllIllllI[20];
            }
            int[] iArr20 = new int[llllIllllI[1]];
            iArr20[llllIllllI[0]] = llllIllllI[14];
            if (llIlIIIlIlIIl(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[llllIllllI[1]];
                iArr21[llllIllllI[0]] = llllIllllI[21];
                if (llIlIIIlIlIIl(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llllIllllI[1]];
                    iArr22[llllIllllI[0]] = llllIllllI[21];
                    if (llIlIIIlIlllI(Inventory.getFirst(iArr22).getQuantity(), llllIllllI[17])) {
                        int[] iArr23 = new int[llllIllllI[1]];
                        iArr23[llllIllllI[0]] = llllIllllI[22];
                        if (llIlIIIlIlIIl(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[llllIllllI[1]];
                            iArr24[llllIllllI[0]] = llllIllllI[35];
                            if (llIlIIIlIlIIl(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = llllIllllI[1];
                                "".length();
                                return ((51 ^ 114) & ((26 ^ 91) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r04;
                            }
                        }
                    }
                }
            }
            return llllIllllI[0];
        } else {
            return llllIllllI[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v357, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v387, types: [boolean] */
    public static void X() {
        if (llIlIIIlIlIIl(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[0]];
            C0001b.a(bu);
            if (llIlIIIlIlIlI(bu.size(), llllIllllI[1])) {
                System.out.println(llllIlllIl[llllIllllI[1]]);
                bs = llllIllllI[0];
            }
        }
        if (llIlIIIlIlIll(bs ? 1 : 0)) {
            if (llIlIIIlIlIll(aa() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlIIIlIllII(nearest) && llIlIIIlIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[2]];
                    C0000a.a(nearest);
                }
                if (llIlIIIlIllII(nearest) && llIlIIIlIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[3]];
                    if (llIlIIIlIlIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllIllllI[4]);
                        "".length();
                    }
                    if (llIlIIIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                        if (llIlIIIlIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllIllllI[5]);
                            "".length();
                        }
                        while (llIlIIIlIlIlI(Skills.getLevel(Skill.MAGIC), llllIllllI[6]) && llIlIIIlIlIll(C0019t.bl() ? 1 : 0)) {
                            C0019t.bj();
                            Time.sleepTicks(llllIllllI[1]);
                            "".length();
                            "".length();
                            if ("  ".length() != "  ".length()) {
                                return;
                            }
                        }
                        if (llIlIIIlIlIll(ab() ? 1 : 0)) {
                            ae();
                            System.out.println(llllIlllIl[llllIllllI[5]]);
                            bs = llllIllllI[1];
                            return;
                        }
                        if (llIlIIIlIlIlI(Skills.getLevel(Skill.MAGIC), llllIllllI[6])) {
                            int[] iArr = new int[llllIllllI[1]];
                            iArr[llllIllllI[0]] = llllIllllI[7];
                            if (llIlIIIlIlIIl(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[llllIllllI[1]];
                                iArr2[llllIllllI[0]] = llllIllllI[7];
                                if (llIlIIIlIlIlI(Inventory.getCount(iArr2), llllIllllI[1])) {
                                    Bank.withdraw(llllIllllI[7], llllIllllI[8], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllIllllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[llllIllllI[1]];
                                        iArr3[llllIllllI[0]] = llllIllllI[7];
                                        if (llIlIIIlIllIl(Inventory.getCount(iArr3))) {
                                            ?? r0 = llllIllllI[1];
                                            "".length();
                                            return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llllIllllI[0];
                                    }, llllIllllI[4]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[llllIllllI[1]];
                            iArr3[llllIllllI[0]] = llllIllllI[9];
                            if (llIlIIIlIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[llllIllllI[1]];
                                iArr4[llllIllllI[0]] = llllIllllI[9];
                                if (llIlIIIlIlIlI(Inventory.getCount(iArr4), llllIllllI[1])) {
                                    Bank.withdraw(llllIllllI[9], llllIllllI[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllIllllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[llllIllllI[1]];
                                        iArr5[llllIllllI[0]] = llllIllllI[9];
                                        if (llIlIIIlIllIl(Inventory.getCount(iArr5))) {
                                            ?? r0 = llllIllllI[1];
                                            "".length();
                                            return " ".length() <= 0 ? " ".length() & (" ".length() ^ (-" ".length())) : r0;
                                        }
                                        return llllIllllI[0];
                                    }, llllIllllI[4]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[llllIllllI[1]];
                            iArr5[llllIllllI[0]] = llllIllllI[11];
                            if (llIlIIIlIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llllIllllI[1]];
                                iArr6[llllIllllI[0]] = llllIllllI[11];
                                if (llIlIIIlIlIlI(Inventory.getCount(iArr6), llllIllllI[1])) {
                                    Bank.withdraw(llllIllllI[11], llllIllllI[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllIllllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[llllIllllI[1]];
                                        iArr7[llllIllllI[0]] = llllIllllI[11];
                                        if (llIlIIIlIllIl(Inventory.getCount(iArr7))) {
                                            ?? r0 = llllIllllI[1];
                                            "".length();
                                            return "   ".length() > ((((69 + 32) - (-44)) + 10) ^ (((86 + 49) - 85) + 109)) ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                                        }
                                        return llllIllllI[0];
                                    }, llllIllllI[4]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[llllIllllI[1]];
                            iArr7[llllIllllI[0]] = llllIllllI[12];
                            if (llIlIIIlIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[llllIllllI[1]];
                                iArr8[llllIllllI[0]] = llllIllllI[12];
                                if (llIlIIIlIlIlI(Inventory.getCount(iArr8), llllIllllI[1])) {
                                    Bank.withdraw(llllIllllI[12], llllIllllI[13], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllIllllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[llllIllllI[1]];
                                        iArr9[llllIllllI[0]] = llllIllllI[12];
                                        if (llIlIIIlIllIl(Inventory.getCount(iArr9))) {
                                            ?? r0 = llllIllllI[1];
                                            "".length();
                                            return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llllIllllI[0];
                                    }, llllIllllI[4]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[llllIllllI[1]];
                            iArr9[llllIllllI[0]] = llllIllllI[14];
                            if (llIlIIIlIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[llllIllllI[1]];
                                iArr10[llllIllllI[0]] = llllIllllI[14];
                                if (llIlIIIlIlIlI(Inventory.getCount(iArr10), llllIllllI[1])) {
                                    Bank.withdraw(llllIllllI[14], llllIllllI[8], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllIllllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[llllIllllI[1]];
                                        iArr11[llllIllllI[0]] = llllIllllI[14];
                                        if (llIlIIIlIllIl(Inventory.getCount(iArr11))) {
                                            ?? r0 = llllIllllI[1];
                                            "".length();
                                            return (-"   ".length()) > 0 ? ((((59 + 44) - 85) + 153) ^ (((126 + 47) - 79) + 61)) & (((((125 + 14) - 55) + 43) ^ (0 ^ 79)) ^ (-" ".length())) : r0;
                                        }
                                        return llllIllllI[0];
                                    }, llllIllllI[4]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[llllIllllI[1]];
                            iArr11[llllIllllI[0]] = llllIllllI[15];
                            if (llIlIIIlIlIIl(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[llllIllllI[1]];
                                iArr12[llllIllllI[0]] = llllIllllI[15];
                                if (llIlIIIlIlIll(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(llllIllllI[15], llllIllllI[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllIllllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[llllIllllI[1]];
                                        iArr13[llllIllllI[0]] = llllIllllI[15];
                                        return Inventory.contains(iArr13);
                                    }, llllIllllI[4]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(llllIllllI[16], llllIllllI[17], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[llllIllllI[1]];
                            iArr13[llllIllllI[0]] = llllIllllI[18];
                            if (llIlIIIlIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[llllIllllI[1]];
                                iArr14[llllIllllI[0]] = llllIllllI[18];
                                if (llIlIIIlIlIlI(Inventory.getCount(iArr14), llllIllllI[1]) && llIlIIIlIlIlI(Skills.getLevel(Skill.MAGIC), llllIllllI[19])) {
                                    Bank.withdrawAll(llllIllllI[18], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllIllllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[llllIllllI[1]];
                                        iArr15[llllIllllI[0]] = llllIllllI[18];
                                        if (llIlIIIlIllIl(Inventory.getCount(iArr15))) {
                                            ?? r0 = llllIllllI[1];
                                            "".length();
                                            return (-"  ".length()) > 0 ? ((69 ^ 115) ^ (66 ^ 79)) & (((90 ^ 0) ^ (212 ^ 181)) ^ (-" ".length())) : r0;
                                        }
                                        return llllIllllI[0];
                                    }, llllIllllI[4]);
                                    "".length();
                                }
                            }
                        }
                        if (llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[6])) {
                            int[] iArr15 = new int[llllIllllI[1]];
                            iArr15[llllIllllI[0]] = llllIllllI[20];
                            if (llIlIIIlIlIll(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(llllIllllI[20], llllIllllI[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llllIllllI[1]);
                                "".length();
                            }
                            if (llIlIIIlIlIIl(bt ? 1 : 0)) {
                                Bank.withdrawAll(llllIllllI[21], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llllIllllI[1]);
                                "".length();
                                Bank.withdrawAll(llllIllllI[14], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llllIllllI[1]);
                                "".length();
                            }
                            Bank.withdrawAll(llllIllllI[22], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(llllIllllI[1]);
                            "".length();
                            Bank.withdrawAll(llllIllllI[23], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(llllIllllI[1]);
                            "".length();
                        }
                    }
                }
            }
            if (llIlIIIlIlIIl(aa() ? 1 : 0)) {
                if (llIlIIIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (llIlIIIlIlIlI(Skills.getLevel(Skill.MAGIC), llllIllllI[19])) {
                    if (llIlIIIlIlIll(bv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[17]];
                        Movement.walkTo(bw);
                        "".length();
                        Time.sleepTicks(llllIllllI[1]);
                        "".length();
                    }
                    if (llIlIIIlIlIIl(bv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[24]];
                        Z();
                    }
                }
                if (llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[19]) && llIlIIIlIlIlI(Skills.getLevel(Skill.MAGIC), llllIllllI[25])) {
                    AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[26]];
                    if (llIlIIIlIllll(Players.getLocal().getAnimation(), llllIllllI[27])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(llllIllllI[1]);
                        "".length();
                    }
                }
                if (llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[25]) && llIlIIIlIlIlI(Skills.getLevel(Skill.MAGIC), llllIllllI[28])) {
                    AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[29]];
                    if (llIlIIIlIllll(Players.getLocal().getAnimation(), llllIllllI[27])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(llllIllllI[1]);
                        "".length();
                    }
                }
                if (llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[28]) && llIlIIIlIlIlI(Skills.getLevel(Skill.MAGIC), llllIllllI[30])) {
                    AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[31]];
                    if (llIlIIIlIllll(Players.getLocal().getAnimation(), llllIllllI[27])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(llllIllllI[1]);
                        "".length();
                    }
                }
                if (llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[30]) && llIlIIIlIlIlI(Skills.getLevel(Skill.MAGIC), llllIllllI[6])) {
                    AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[32]];
                    if (llIlIIIlIllll(Players.getLocal().getAnimation(), llllIllllI[27])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(llllIllllI[1]);
                        "".length();
                    }
                }
                if (llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[6])) {
                    AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[33]];
                    int[] iArr16 = new int[llllIllllI[1]];
                    iArr16[llllIllllI[0]] = llllIllllI[20];
                    if (llIlIIIlIlIIl(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[llllIllllI[1]];
                        iArr17[llllIllllI[0]] = llllIllllI[20];
                        if (llIlIIIlIlIll(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[llllIllllI[1]];
                            iArr18[llllIllllI[0]] = llllIllllI[20];
                            Inventory.getFirst(iArr18).interact(llllIlllIl[llllIllllI[34]]);
                            Time.sleepTicks(llllIllllI[1]);
                            "".length();
                        }
                    }
                    if (llIlIIIlIlIIl(GrandExchange.isOpen() ? 1 : 0)) {
                        C0001b.g();
                    }
                    int[] iArr19 = new int[llllIllllI[1]];
                    iArr19[llllIllllI[0]] = llllIllllI[22];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[llllIllllI[1]];
                    iArr20[llllIllllI[0]] = llllIllllI[35];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (llIlIIIlIlIll(bt ? 1 : 0)) {
                        if (llIlIIIlIlIll(Players.getLocal().getWorldLocation().equals(bx) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[36]];
                            Movement.walkTo(bx);
                            "".length();
                            Time.sleepTicks(llllIllllI[1]);
                            "".length();
                        }
                        if (llIlIIIlIlIIl(Players.getLocal().getWorldLocation().equals(bx) ? 1 : 0) && llIlIIIlIllII(first) && llIlIIIlIllII(first2)) {
                            int experience = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (llIlIIIllIlII(Skills.getExperience(Skill.MAGIC), experience)) {
                                    ?? r0 = llllIllllI[1];
                                    "".length();
                                    return (-" ".length()) >= "  ".length() ? ((96 ^ 32) ^ (117 ^ 104)) & (((17 ^ 33) ^ (87 ^ 58)) ^ (-" ".length())) : r0;
                                }
                                return llllIllllI[0];
                            }, llllIllllI[8]);
                            "".length();
                            Time.sleep(C0004e.c(llllIllllI[37], llllIllllI[38]));
                            "".length();
                        }
                    }
                    if (llIlIIIlIlIIl(bt ? 1 : 0)) {
                        if (llIlIIIlIllII(first) && llIlIIIlIllII(first2) && llIlIIIlIllll(Players.getLocal().getAnimation(), llllIllllI[27])) {
                            int experience2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (llIlIIIllIlII(Skills.getExperience(Skill.MAGIC), experience2)) {
                                    ?? r0 = llllIllllI[1];
                                    "".length();
                                    return 0 != 0 ? ((((202 + 223) - 364) + 185) ^ (((131 + 1) - (-43)) + 8)) & (((3 ^ 99) ^ (110 ^ 79)) ^ (-" ".length())) : r0;
                                }
                                return llllIllllI[0];
                            }, llllIllllI[8]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (llIlIIIlIllll(Players.getLocal().getAnimation(), llllIllllI[27])) {
                                ?? r0 = llllIllllI[1];
                                "".length();
                                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llllIllllI[0];
                        }, llllIllllI[39]);
                        "".length();
                    }
                }
            }
        }
    }

    private static void ae() {
        if (llIlIIIlIlIlI(Skills.getLevel(Skill.MAGIC), llllIllllI[6])) {
            int[] iArr = new int[llllIllllI[1]];
            iArr[llllIllllI[0]] = llllIllllI[14];
            if (llIlIIIlIlIll(Bank.contains(iArr) ? 1 : 0)) {
                bu.add(new C0003d(llllIllllI[14], llllIllllI[57], llllIllllI[58]));
                "".length();
            }
            int[] iArr2 = new int[llllIllllI[1]];
            iArr2[llllIllllI[0]] = llllIllllI[7];
            if (llIlIIIlIlIll(Bank.contains(iArr2) ? 1 : 0)) {
                bu.add(new C0003d(llllIllllI[7], llllIllllI[59], llllIllllI[24]));
                "".length();
            }
            int[] iArr3 = new int[llllIllllI[1]];
            iArr3[llllIllllI[0]] = llllIllllI[9];
            if (llIlIIIlIlIll(Bank.contains(iArr3) ? 1 : 0)) {
                bu.add(new C0003d(llllIllllI[9], llllIllllI[60], llllIllllI[24]));
                "".length();
            }
            int[] iArr4 = new int[llllIllllI[1]];
            iArr4[llllIllllI[0]] = llllIllllI[11];
            if (llIlIIIlIlIll(Bank.contains(iArr4) ? 1 : 0)) {
                bu.add(new C0003d(llllIllllI[11], llllIllllI[61], llllIllllI[24]));
                "".length();
            }
            int[] iArr5 = new int[llllIllllI[1]];
            iArr5[llllIllllI[0]] = llllIllllI[12];
            if (llIlIIIlIlIll(Bank.contains(iArr5) ? 1 : 0)) {
                bu.add(new C0003d(llllIllllI[12], llllIllllI[4], llllIllllI[24]));
                "".length();
            }
            int[] iArr6 = new int[llllIllllI[1]];
            iArr6[llllIllllI[0]] = llllIllllI[44];
            if (llIlIIIlIlIll(Bank.contains(iArr6) ? 1 : 0)) {
                bu.add(new C0003d(llllIllllI[44], llllIllllI[1], C0004e.c(llllIllllI[62], llllIllllI[63])));
                "".length();
            }
        }
        if (llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[6])) {
            int[] iArr7 = new int[llllIllllI[1]];
            iArr7[llllIllllI[0]] = llllIllllI[22];
            if (llIlIIIlIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llllIllllI[1]];
                iArr8[llllIllllI[0]] = llllIllllI[22];
                if (llIlIIIlIlIlI(Bank.getFirst(iArr8).getQuantity(), llllIllllI[61])) {
                    int i = llllIllllI[22];
                    int i2 = llllIllllI[61];
                    int[] iArr9 = new int[llllIllllI[1]];
                    iArr9[llllIllllI[0]] = llllIllllI[22];
                    bu.add(new C0003d(i, i2 - Bank.getFirst(iArr9).getQuantity(), llllIllllI[64]));
                    "".length();
                }
            }
            int[] iArr10 = new int[llllIllllI[1]];
            iArr10[llllIllllI[0]] = llllIllllI[22];
            if (llIlIIIlIlIll(Bank.contains(iArr10) ? 1 : 0)) {
                bu.add(new C0003d(llllIllllI[22], llllIllllI[61], llllIllllI[64]));
                "".length();
            }
            int[] iArr11 = new int[llllIllllI[1]];
            iArr11[llllIllllI[0]] = llllIllllI[23];
            if (llIlIIIlIlIIl(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llllIllllI[1]];
                iArr12[llllIllllI[0]] = llllIllllI[23];
                if (llIlIIIlIlIlI(Bank.getFirst(iArr12).getQuantity(), llllIllllI[61])) {
                    int i3 = llllIllllI[23];
                    int i4 = llllIllllI[61];
                    int[] iArr13 = new int[llllIllllI[1]];
                    iArr13[llllIllllI[0]] = llllIllllI[23];
                    bu.add(new C0003d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), llllIllllI[65]));
                    "".length();
                }
            }
            int[] iArr14 = new int[llllIllllI[1]];
            iArr14[llllIllllI[0]] = llllIllllI[23];
            if (llIlIIIlIlIll(Bank.contains(iArr14) ? 1 : 0)) {
                bu.add(new C0003d(llllIllllI[23], llllIllllI[61], llllIllllI[65]));
                "".length();
            }
            int[] iArr15 = new int[llllIllllI[1]];
            iArr15[llllIllllI[0]] = llllIllllI[20];
            if (llIlIIIlIlIll(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[llllIllllI[1]];
                iArr16[llllIllllI[0]] = llllIllllI[20];
                if (llIlIIIlIlIll(Equipment.contains(iArr16) ? 1 : 0)) {
                    bu.add(new C0003d(llllIllllI[20], llllIllllI[1], llllIllllI[66]));
                    "".length();
                }
            }
            if (llIlIIIlIlIIl(bt ? 1 : 0)) {
                int[] iArr17 = new int[llllIllllI[1]];
                iArr17[llllIllllI[0]] = llllIllllI[14];
                if (llIlIIIlIlIIl(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[llllIllllI[1]];
                    iArr18[llllIllllI[0]] = llllIllllI[14];
                    if (llIlIIIlIlIlI(Bank.getFirst(iArr18).getQuantity(), llllIllllI[61])) {
                        int i5 = llllIllllI[14];
                        int i6 = llllIllllI[61];
                        int[] iArr19 = new int[llllIllllI[1]];
                        iArr19[llllIllllI[0]] = llllIllllI[14];
                        bu.add(new C0003d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), llllIllllI[58]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[llllIllllI[1]];
                iArr20[llllIllllI[0]] = llllIllllI[14];
                if (llIlIIIlIlIll(Bank.contains(iArr20) ? 1 : 0)) {
                    bu.add(new C0003d(llllIllllI[14], llllIllllI[61], llllIllllI[58]));
                    "".length();
                }
                int[] iArr21 = new int[llllIllllI[1]];
                iArr21[llllIllllI[0]] = llllIllllI[21];
                if (llIlIIIlIlIIl(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llllIllllI[1]];
                    iArr22[llllIllllI[0]] = llllIllllI[21];
                    if (llIlIIIlIlIlI(Bank.getFirst(iArr22).getQuantity(), llllIllllI[66])) {
                        int i7 = llllIllllI[21];
                        int i8 = llllIllllI[66];
                        int[] iArr23 = new int[llllIllllI[1]];
                        iArr23[llllIllllI[0]] = llllIllllI[21];
                        bu.add(new C0003d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), llllIllllI[24]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[llllIllllI[1]];
                iArr24[llllIllllI[0]] = llllIllllI[21];
                if (llIlIIIlIlIll(Bank.contains(iArr24) ? 1 : 0)) {
                    bu.add(new C0003d(llllIllllI[21], llllIllllI[66], llllIllllI[24]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[llllIllllI[1]];
        iArr25[llllIllllI[0]] = llllIllllI[18];
        if (llIlIIIlIlIll(Bank.contains(iArr25) ? 1 : 0)) {
            bu.add(new C0003d(llllIllllI[18], llllIllllI[67], llllIllllI[37]));
            "".length();
        }
        if (llIlIIIlIlIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llllIlllIl[llllIllllI[74]]);
        }) ? 1 : 0)) {
            bu.add(new C0003d(llllIllllI[68], llllIllllI[17], llllIllllI[69]));
            "".length();
        }
        int[] iArr26 = new int[llllIllllI[1]];
        iArr26[llllIllllI[0]] = llllIllllI[70];
        if (llIlIIIlIlIll(Bank.contains(iArr26) ? 1 : 0)) {
            bu.add(new C0003d(llllIllllI[70], llllIllllI[32], llllIllllI[71]));
            "".length();
        }
        int[] iArr27 = new int[llllIllllI[1]];
        iArr27[llllIllllI[0]] = llllIllllI[16];
        if (llIlIIIlIlIll(Bank.contains(iArr27) ? 1 : 0)) {
            bu.add(new C0003d(llllIllllI[16], llllIllllI[32], llllIllllI[71]));
            "".length();
        }
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return llllIlllIl[llllIllllI[72]];
    }

    private static void llIlIIIlIIlll() {
        llllIlllIl = new String[llllIllllI[25]];
        llllIlllIl[llllIllllI[0]] = llIlIIIlIIlII("AB4dKjslSw03MC8Y", "BkdCU");
        llllIlllIl[llllIllllI[1]] = llIlIIIlIIlIl("OkfT0jLXMBr+7Q/AnVZTVu56Fhh8yG0Aynhg0Q6jVWdGzRwbZszUzB3bawaNZseSzEMGzloO2e0=", "voAuj");
        llllIlllIl[llllIllllI[2]] = llIlIIIlIIllI("RgKwVKW9n9BJER2APDTaKfxBUfxuS1ed", "uIwGm");
        llllIlllIl[llllIllllI[3]] = llIlIIIlIIlIl("T93WyAobl4HCwPtntXFzv4cafzf36/Wn", "lMkwh");
        llllIlllIl[llllIllllI[5]] = llIlIIIlIIlII("BBB5KRs2VTQhGiAcNy9JIAApOAU6ECpkSSACMDwKOxw3L0knGnkKPAo8Fw8=", "SuYHi");
        llllIlllIl[llllIllllI[17]] = llIlIIIlIIlII("AyQBRgwiZRQJDz4=", "MEwfx");
        llllIlllIl[llllIllllI[24]] = llIlIIIlIIlIl("dtiSDjQI4SOhdNS163yt/g==", "dvZrI");
        llllIlllIl[llllIllllI[26]] = llIlIIIlIIlII("IBMnLiANFXQsKBEAOzkiQwYxNiw=", "crTZI");
        llllIlllIl[llllIllllI[29]] = llIlIIIlIIlIl("l1CsbgQFxfXeiC18jv94m6m6XcdCX676", "riRcf");
        llllIlllIl[llllIllllI[31]] = llIlIIIlIIlII("ATI+GR8sNG0LFy4/NE0CJz8o", "BSMmv");
        llllIlllIl[llllIllllI[32]] = llIlIIIlIIlIl("IinnMHACSoolDuVdXj/uyqBf9Uuuaj3m", "YLHqJ");
        llllIlllIl[llllIllllI[33]] = llIlIIIlIIlII("BD80HxsrNA==", "ESWwr");
        llllIlllIl[llllIllllI[34]] = llIlIIIlIIllI("N4DPlJHPX6Q=", "YCmhS");
        llllIlllIl[llllIllllI[36]] = llIlIIIlIIlII("PiQELWwHJFIpIBAjUjs8HD8=", "sKrHL");
        llllIlllIl[llllIllllI[40]] = llIlIIIlIIllI("tXgY6n/kHOVA3waiDReuhg==", "jjDXF");
        llllIlllIl[llllIllllI[41]] = llIlIIIlIIlII("KDU7", "mTOgG");
        llllIlllIl[llllIllllI[42]] = llIlIIIlIIlII("EA4P", "Saxen");
        llllIlllIl[llllIllllI[43]] = llIlIIIlIIllI("ERI/0+BnQ+E=", "wYVSU");
        llllIlllIl[llllIllllI[45]] = llIlIIIlIIlIl("CnA+tNDonz3M9TQzsqrAbg==", "EUVLW");
        llllIlllIl[llllIllllI[46]] = llIlIIIlIIllI("nQ0YBH7Zlk4=", "VjmoZ");
        llllIlllIl[llllIllllI[47]] = llIlIIIlIIllI("MZVpUxBX+dZKzM3z15QeAw==", "UQoNs");
        llllIlllIl[llllIllllI[51]] = llIlIIIlIIlIl("KF9RZ57qh4ecE2T7G+Gmz3hjNKZXOLd9", "QCYis");
        llllIlllIl[llllIllllI[52]] = llIlIIIlIIlIl("B6ro5IuaSDhDKd7CDYZe9Q==", "UcRit");
        llllIlllIl[llllIllllI[54]] = llIlIIIlIIlII("MAQeHEs0GQIRAAI=", "gmpxk");
        llllIlllIl[llllIllllI[55]] = llIlIIIlIIlIl("WGHYggyzZOUcT3Ssue65lw==", "JMyRX");
        llllIlllIl[llllIllllI[19]] = llIlIIIlIIlIl("jTpRwOtCanNmGi8QVaThwg==", "vWfZD");
        llllIlllIl[llllIllllI[50]] = llIlIIIlIIlII("MRMxGDtUITceOh8X", "trClS");
        llllIlllIl[llllIllllI[56]] = llIlIIIlIIlIl("CExKEd/GGgugb9v4ryGz2Q==", "tjjTM");
        llllIlllIl[llllIllllI[72]] = llIlIIIlIIlIl("ZoV9ywGzOmNM4dy3z/KRTg==", "jXVKj");
        llllIlllIl[llllIllllI[74]] = llIlIIIlIIlIl("8F2s2JfiZ0SSmeY23RE7x4T0WrJjtI4K", "hGkMo");
        llllIlllIl[llllIllllI[75]] = llIlIIIlIIllI("G77S7yiXO4Q=", "pnsQE");
    }

    private static void Z() {
        if (llIlIIIllIIIl(llIlIIIllIIII(C0004e.u(), 30.0d))) {
            int[] iArr = new int[llllIllllI[1]];
            iArr[llllIllllI[0]] = llllIllllI[18];
            if (llIlIIIlIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llllIllllI[1]];
                iArr2[llllIllllI[0]] = llllIllllI[18];
                Inventory.getFirst(iArr2).interact(llllIlllIl[llllIllllI[41]]);
                Time.sleepTicks(llllIllllI[1]);
                "".length();
            }
        }
        if (llIlIIIllIIlI(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (llIlIIIlIlIIl(npc.getName().contains(llllIlllIl[llllIllllI[75]]) ? 1 : 0) && llIlIIIlIlIll(npc.isDead() ? 1 : 0)) {
                    ?? r0 = llllIllllI[1];
                    "".length();
                    return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llllIllllI[0];
            });
            String[] strArr = new String[llllIllllI[2]];
            strArr[llllIllllI[0]] = llllIlllIl[llllIllllI[42]];
            strArr[llllIllllI[1]] = llllIlllIl[llllIllllI[43]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (llIlIIIllIIll(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = llllIllllI[1];
                    "".length();
                    return (-((((10 + 125) - 50) + 97) ^ (((83 + 139) - 70) + 26))) > 0 ? ((126 ^ 119) ^ (148 ^ 140)) & (((19 ^ 125) ^ (((82 + 81) - 63) + 27)) ^ (-" ".length())) : r0;
                }
                return llllIllllI[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[llllIllllI[1]];
            iArr3[llllIllllI[0]] = llllIllllI[44];
            if (llIlIIIlIlIIl(Equipment.contains(iArr3) ? 1 : 0) && llIlIIIlIlIll(ac() ? 1 : 0)) {
                ad();
            }
            if (llIlIIIlIllII(nearest) && llIlIIIlIlIll(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[45]];
                nearest.interact(llllIlllIl[llllIllllI[46]]);
                Time.sleepTicks(llllIllllI[3]);
                "".length();
            }
        }
        if (llIlIIIlIllII(Players.getLocal().getInteracting())) {
            AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[47]];
            Time.sleepTicks(llllIllllI[1]);
            "".length();
        }
    }

    private static boolean llIlIIIlIllll(int i, int i2) {
        return i == i2;
    }

    private static boolean llIlIIIllIlII(int i, int i2) {
        return i > i2;
    }

    private static String llIlIIIlIIlII(String lllllllllllllllllIlIlIIIIIlIlIII, String lllllllllllllllllIlIlIIIIIlIIlll) {
        String lllllllllllllllllIlIlIIIIIlIlIII2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlIlIIIIIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllIlIlIIIIIlIIlIl = lllllllllllllllllIlIlIIIIIlIIlll.toCharArray();
        int lllllllllllllllllIlIlIIIIIlIIlII = llllIllllI[0];
        char[] charArray = lllllllllllllllllIlIlIIIIIlIlIII2.toCharArray();
        int length = charArray.length;
        int i = llllIllllI[0];
        while (llIlIIIlIlIlI(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllllIlIlIIIIIlIIlIl[lllllllllllllllllIlIlIIIIIlIIlII % lllllllllllllllllIlIlIIIIIlIIlIl.length]));
            "".length();
            lllllllllllllllllIlIlIIIIIlIIlII++;
            i++;
            "".length();
            if ("  ".length() < ((191 ^ 131) & ((22 ^ 42) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlIIIlIlIlI(int i, int i2) {
        return i < i2;
    }

    static {
        llIlIIIlIlIII();
        llIlIIIlIIlll();
        bu = new ArrayList();
        bv = new WorldArea(llllIllllI[76], llllIllllI[77], llllIllllI[47], llllIllllI[40], llllIllllI[0]);
        bw = new WorldPoint(llllIllllI[78], llllIllllI[79], llllIllllI[0]);
        bx = new WorldPoint(llllIllllI[80] + C0004e.c(llllIllllI[1], llllIllllI[5]), llllIllllI[81], llllIllllI[0]);
    }

    private static String llIlIIIlIIlIl(String lllllllllllllllllIlIlIIIIIIlIIll, String lllllllllllllllllIlIlIIIIIIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIlIIIIIIlIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIlIIIIIIlIlIl.init(llllIllllI[2], secretKeySpec);
            return new String(lllllllllllllllllIlIlIIIIIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIIIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIlIIIIIIlIlII) {
            lllllllllllllllllIlIlIIIIIIlIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIlIIIlIlllI(Skills.getLevel(Skill.MAGIC), llllIllllI[73])) {
            ?? r0 = llllIllllI[1];
            "".length();
            return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllIllllI[0];
    }

    private static boolean llIlIIIllIIIl(int i) {
        return i < 0;
    }

    private static boolean llIlIIIlIllII(Object obj) {
        return obj != null;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            X();
            "".length();
            if (0 != 0) {
                return ((3 ^ 105) ^ (51 ^ 8)) & (((((215 + 58) - 245) + 202) ^ (((38 + 4) - 41) + 182)) ^ (-" ".length()));
            }
        } catch (Exception e2) {
        }
        return llllIllllI[67];
    }

    private static boolean llIlIIIlIllIl(int i) {
        return i > 0;
    }

    private static int llIlIIIllIIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIlIIIllIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String llIlIIIlIIllI(String lllllllllllllllllIlIlIIIIIIIIllI, String lllllllllllllllllIlIlIIIIIIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIlIIIIIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIIIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), llllIllllI[29]), "DES");
            Cipher lllllllllllllllllIlIlIIIIIIIlIII = Cipher.getInstance("DES");
            lllllllllllllllllIlIlIIIIIIIlIII.init(llllIllllI[2], lllllllllllllllllIlIlIIIIIIIlIIl);
            return new String(lllllllllllllllllIlIlIIIIIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIIIIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIlIIIIIIIIIlI) {
            lllllllllllllllllIlIlIIIIIIIIIlI.printStackTrace();
            return null;
        }
    }
}
