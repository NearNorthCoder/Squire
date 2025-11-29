package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ag  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/ag.class */
public class ag implements ab {
    static /* synthetic */ WorldArea cl;
    private static /* synthetic */ String[] lllllIlll;
    static /* synthetic */ WorldPoint cn;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ WorldPoint cm;
    public static /* synthetic */ boolean ck;
    private static /* synthetic */ int[] llllllIII;
    public static /* synthetic */ List<C0003d> bx;

    public static void al() {
        if (llIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIlIllIlIll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllllIlll[llllllIII[43]];
            Movement.walkTo(cm);
            "".length();
            Time.sleepTicks(llllllIII[1]);
            "".length();
        }
        if (llIlIllIlIIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllllIlll[llllllIII[44]];
            am();
        }
    }

    private static boolean llIlIllIlIll(int i) {
        return i == 0;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            ak();
            "".length();
            if ((71 ^ 67) < 0) {
                return (115 ^ 85) & ((34 ^ 4) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llllllIII[69];
    }

    private static void llIlIllIlIII() {
        llllllIII = new int[82];
        llllllIII[0] = (51 ^ 100) & ((40 ^ 127) ^ (-1));
        llllllIII[1] = " ".length();
        llllllIII[2] = 6 ^ 59;
        llllllIII[3] = "  ".length();
        llllllIII[4] = "   ".length();
        llllllIII[5] = (-16503) & 21502;
        llllllIII[6] = 1 ^ 7;
        llllllIII[7] = ((119 ^ 123) & ((65 ^ 77) ^ (-1))) ^ (104 ^ 108);
        llllllIII[8] = 33 ^ 22;
        llllllIII[9] = (-((-1578) & 10235)) & (-1025) & 10239;
        llllllIII[10] = (-546) & 2045;
        llllllIII[11] = (-12677) & 13231;
        llllllIII[12] = (-13825) & 16324;
        llllllIII[13] = (-((-19397) & 31687)) & (-16593) & 29439;
        llllllIII[14] = (-((-26801) & 32181)) & (-18513) & 24446;
        llllllIII[15] = (-16460) & 20959;
        llllllIII[16] = (-2305) & 2867;
        llllllIII[17] = (-((-14851) & 16035)) & (-2569) & 16377;
        llllllIII[18] = (-167) & 8175;
        llllllIII[19] = 49 ^ 52;
        llllllIII[20] = (-23681) & 24059;
        llllllIII[21] = 58 ^ 35;
        llllllIII[22] = (-20997) & 22383;
        llllllIII[23] = (-((-8761) & 26172)) & (-8337) & 26303;
        llllllIII[24] = (-30733) & 31293;
        llllllIII[25] = 122 ^ 68;
        llllllIII[26] = (55 ^ 74) ^ (39 ^ 69);
        llllllIII[27] = 169 ^ 174;
        llllllIII[28] = -" ".length();
        llllllIII[29] = 129 ^ 164;
        llllllIII[30] = (241 ^ 135) ^ (35 ^ 93);
        llllllIII[31] = 22 ^ 59;
        llllllIII[32] = 43 ^ 34;
        llllllIII[33] = (219 ^ 192) ^ (120 ^ 105);
        llllllIII[34] = (216 ^ 128) ^ (24 ^ 75);
        llllllIII[35] = (-((-1133) & 5613)) & (-16417) & 24058;
        llllllIII[36] = (-((-12581) & 29029)) & (-8737) & 28671;
        llllllIII[37] = 183 ^ 187;
        llllllIII[38] = (((3 + 119) - 44) + 76) ^ (((123 + 68) - 60) + 34);
        llllllIII[39] = (116 ^ 59) ^ (251 ^ 185);
        llllllIII[40] = (-662) & 981;
        llllllIII[41] = (-2309) & 2838;
        llllllIII[42] = (-12307) & 15806;
        llllllIII[43] = (44 ^ 95) ^ (2 ^ 127);
        llllllIII[44] = 73 ^ 70;
        llllllIII[45] = 11 ^ 27;
        llllllIII[46] = 98 ^ 115;
        llllllIII[47] = (23 ^ 28) ^ (92 ^ 69);
        llllllIII[48] = (-((-1555) & 30363)) & (-2049) & 32237;
        llllllIII[49] = (116 ^ 83) ^ (136 ^ 188);
        llllllIII[50] = (-((-8307) & 28923)) & (-9732) & 30623;
        llllllIII[51] = (-19855) & 20447;
        llllllIII[52] = 13 ^ 23;
        llllllIII[53] = (((45 + 133) - 29) + 8) ^ (((81 + 0) - 68) + 124);
        llllllIII[54] = (((34 + 35) - (-48)) + 49) ^ (((105 + 15) - 70) + 129);
        llllllIII[55] = ((32 + 106) - (-52)) + 11;
        llllllIII[56] = 16 ^ 6;
        llllllIII[57] = 11 ^ 28;
        llllllIII[58] = 100 ^ 124;
        llllllIII[59] = (-4103) & 5102;
        llllllIII[60] = ((137 + 12) - 121) + 142;
        llllllIII[61] = (-28750) & 32749;
        llllllIII[62] = (-((-20617) & 22702)) & (-12289) & 16373;
        llllllIII[63] = (-8258) & 11257;
        llllllIII[64] = (-((-12293) & 14381)) & (-17156) & 31743;
        llllllIII[65] = (-((-13389) & 30590)) & (-1) & 32701;
        llllllIII[66] = 199 ^ 191;
        llllllIII[67] = (((((131 + 9) - 22) + 16) + (133 ^ 168)) - (((81 + 130) - 153) + 77)) + (92 ^ 54);
        llllllIII[68] = (-((-2191) & 19887)) & (-71) & 32766;
        llllllIII[69] = 35 ^ 71;
        llllllIII[70] = (-35) & 12014;
        llllllIII[71] = (-((-18823) & 24455)) & (-2131) & 32762;
        llllllIII[72] = (-((-4355) & 12547)) & (-16409) & 32607;
        llllllIII[73] = (-113) & 1012;
        llllllIII[74] = (150 ^ 182) ^ (124 ^ 71);
        llllllIII[75] = (((55 + 49) - 33) + 81) ^ (((130 + 41) - 170) + 131);
        llllllIII[76] = 69 ^ 88;
        llllllIII[77] = (-20513) & 23534;
        llllllIII[78] = (-16665) & 19963;
        llllllIII[79] = (-((-24599) & 29759)) & (-16385) & 24575;
        llllllIII[80] = (-28951) & 32255;
        llllllIII[81] = 216 ^ 198;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean ap() {
        if (llIlIllIllll(Vars.getBit(llllllIII[50]), llllllIII[1]) && llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[19])) {
            return llllllIII[1];
        }
        if (llIlIllIllll(Vars.getBit(llllllIII[50]), llllllIII[3]) && llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[32]) && llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[19])) {
            return llllllIII[1];
        }
        if (llIlIllIllll(Vars.getBit(llllllIII[50]), llllllIII[4]) && llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[32]) && llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[39])) {
            return llllllIII[1];
        }
        if (llIlIllIllll(Vars.getBit(llllllIII[50]), llllllIII[4]) && llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[32])) {
            int[] iArr = new int[llllllIII[1]];
            iArr[llllllIII[0]] = llllllIII[14];
            if (llIlIllIlIll(Inventory.contains(iArr) ? 1 : 0)) {
                return llllllIII[1];
            }
        }
        if (llIlIllIllll(Vars.getBit(llllllIII[50]), llllllIII[7]) && llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[39])) {
            int[] iArr2 = new int[llllllIII[1]];
            iArr2[llllllIII[0]] = llllllIII[14];
            if (llIlIllIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                return llllllIII[1];
            }
        }
        return llllllIII[0];
    }

    private static boolean llIlIlllIlII(int i, int i2) {
        return i > i2;
    }

    private static boolean llIlIllIllII(Object obj) {
        return obj != null;
    }

    private static boolean llIlIllIlIlI(int i, int i2) {
        return i < i2;
    }

    private static void Q() {
        if (llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[8])) {
            int[] iArr = new int[llllllIII[1]];
            iArr[llllllIII[0]] = llllllIII[16];
            if (llIlIllIlIll(Bank.contains(iArr) ? 1 : 0)) {
                bx.add(new C0003d(llllllIII[16], llllllIII[59], llllllIII[60]));
                "".length();
            }
            int[] iArr2 = new int[llllllIII[1]];
            iArr2[llllllIII[0]] = llllllIII[9];
            if (llIlIllIlIll(Bank.contains(iArr2) ? 1 : 0)) {
                bx.add(new C0003d(llllllIII[9], llllllIII[61], llllllIII[6]));
                "".length();
            }
            int[] iArr3 = new int[llllllIII[1]];
            iArr3[llllllIII[0]] = llllllIII[11];
            if (llIlIllIlIll(Bank.contains(iArr3) ? 1 : 0)) {
                bx.add(new C0003d(llllllIII[11], llllllIII[62], llllllIII[6]));
                "".length();
            }
            int[] iArr4 = new int[llllllIII[1]];
            iArr4[llllllIII[0]] = llllllIII[13];
            if (llIlIllIlIll(Bank.contains(iArr4) ? 1 : 0)) {
                bx.add(new C0003d(llllllIII[13], llllllIII[63], llllllIII[6]));
                "".length();
            }
            int[] iArr5 = new int[llllllIII[1]];
            iArr5[llllllIII[0]] = llllllIII[14];
            if (llIlIllIlIll(Bank.contains(iArr5) ? 1 : 0)) {
                bx.add(new C0003d(llllllIII[14], llllllIII[5], llllllIII[6]));
                "".length();
            }
            int[] iArr6 = new int[llllllIII[1]];
            iArr6[llllllIII[0]] = llllllIII[48];
            if (llIlIllIlIll(Bank.contains(iArr6) ? 1 : 0)) {
                bx.add(new C0003d(llllllIII[48], llllllIII[1], C0004e.c(llllllIII[64], llllllIII[65])));
                "".length();
            }
        }
        if (llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[8])) {
            int[] iArr7 = new int[llllllIII[1]];
            iArr7[llllllIII[0]] = llllllIII[24];
            if (llIlIllIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llllllIII[1]];
                iArr8[llllllIII[0]] = llllllIII[24];
                if (llIlIllIlIlI(Bank.getFirst(iArr8).getQuantity(), llllllIII[63])) {
                    int i = llllllIII[24];
                    int i2 = llllllIII[63];
                    int[] iArr9 = new int[llllllIII[1]];
                    iArr9[llllllIII[0]] = llllllIII[24];
                    bx.add(new C0003d(i, i2 - Bank.getFirst(iArr9).getQuantity(), llllllIII[66]));
                    "".length();
                }
            }
            int[] iArr10 = new int[llllllIII[1]];
            iArr10[llllllIII[0]] = llllllIII[24];
            if (llIlIllIlIll(Bank.contains(iArr10) ? 1 : 0)) {
                bx.add(new C0003d(llllllIII[24], llllllIII[63], llllllIII[66]));
                "".length();
            }
            int[] iArr11 = new int[llllllIII[1]];
            iArr11[llllllIII[0]] = llllllIII[25];
            if (llIlIllIlIIl(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llllllIII[1]];
                iArr12[llllllIII[0]] = llllllIII[25];
                if (llIlIllIlIlI(Bank.getFirst(iArr12).getQuantity(), llllllIII[63])) {
                    int i3 = llllllIII[25];
                    int i4 = llllllIII[63];
                    int[] iArr13 = new int[llllllIII[1]];
                    iArr13[llllllIII[0]] = llllllIII[25];
                    bx.add(new C0003d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), llllllIII[67]));
                    "".length();
                }
            }
            int[] iArr14 = new int[llllllIII[1]];
            iArr14[llllllIII[0]] = llllllIII[25];
            if (llIlIllIlIll(Bank.contains(iArr14) ? 1 : 0)) {
                bx.add(new C0003d(llllllIII[25], llllllIII[63], llllllIII[67]));
                "".length();
            }
            int[] iArr15 = new int[llllllIII[1]];
            iArr15[llllllIII[0]] = llllllIII[22];
            if (llIlIllIlIll(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[llllllIII[1]];
                iArr16[llllllIII[0]] = llllllIII[22];
                if (llIlIllIlIll(Equipment.contains(iArr16) ? 1 : 0)) {
                    bx.add(new C0003d(llllllIII[22], llllllIII[1], llllllIII[68]));
                    "".length();
                }
            }
            if (llIlIllIlIIl(ck ? 1 : 0)) {
                int[] iArr17 = new int[llllllIII[1]];
                iArr17[llllllIII[0]] = llllllIII[16];
                if (llIlIllIlIIl(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[llllllIII[1]];
                    iArr18[llllllIII[0]] = llllllIII[16];
                    if (llIlIllIlIlI(Bank.getFirst(iArr18).getQuantity(), llllllIII[63])) {
                        int i5 = llllllIII[16];
                        int i6 = llllllIII[63];
                        int[] iArr19 = new int[llllllIII[1]];
                        iArr19[llllllIII[0]] = llllllIII[16];
                        bx.add(new C0003d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), llllllIII[60]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[llllllIII[1]];
                iArr20[llllllIII[0]] = llllllIII[16];
                if (llIlIllIlIll(Bank.contains(iArr20) ? 1 : 0)) {
                    bx.add(new C0003d(llllllIII[16], llllllIII[63], llllllIII[60]));
                    "".length();
                }
                int[] iArr21 = new int[llllllIII[1]];
                iArr21[llllllIII[0]] = llllllIII[23];
                if (llIlIllIlIIl(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llllllIII[1]];
                    iArr22[llllllIII[0]] = llllllIII[23];
                    if (llIlIllIlIlI(Bank.getFirst(iArr22).getQuantity(), llllllIII[68])) {
                        int i7 = llllllIII[23];
                        int i8 = llllllIII[68];
                        int[] iArr23 = new int[llllllIII[1]];
                        iArr23[llllllIII[0]] = llllllIII[23];
                        bx.add(new C0003d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), llllllIII[6]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[llllllIII[1]];
                iArr24[llllllIII[0]] = llllllIII[23];
                if (llIlIllIlIll(Bank.contains(iArr24) ? 1 : 0)) {
                    bx.add(new C0003d(llllllIII[23], llllllIII[68], llllllIII[6]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[llllllIII[1]];
        iArr25[llllllIII[0]] = llllllIII[20];
        if (llIlIllIlIll(Bank.contains(iArr25) ? 1 : 0)) {
            bx.add(new C0003d(llllllIII[20], llllllIII[69], llllllIII[40]));
            "".length();
        }
        if (llIlIllIlIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllllIlll[llllllIII[75]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(llllllIII[70], llllllIII[19], llllllIII[71]));
            "".length();
        }
        int[] iArr26 = new int[llllllIII[1]];
        iArr26[llllllIII[0]] = llllllIII[72];
        if (llIlIllIlIll(Bank.contains(iArr26) ? 1 : 0)) {
            bx.add(new C0003d(llllllIII[72], llllllIII[33], llllllIII[73]));
            "".length();
        }
        int[] iArr27 = new int[llllllIII[1]];
        iArr27[llllllIII[0]] = llllllIII[18];
        if (llIlIllIlIll(Bank.contains(iArr27) ? 1 : 0)) {
            bx.add(new C0003d(llllllIII[18], llllllIII[33], llllllIII[73]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return llllllIII[0];
    }

    private static boolean llIlIllIllIl(int i) {
        return i > 0;
    }

    private static void llIlIllIIlll() {
        lllllIlll = new String[llllllIII[81]];
        lllllIlll[llllllIII[0]] = llIlIlIlIlIl("RAwgEnzswAetdwinaiCqXw==", "woElw");
        lllllIlll[llllllIII[1]] = llIlIlIlIllI("6liUZvpyibU7EOwlIuW8XtDuAfVpCeauphF+pf/nk8oGNW3CQPzuk9bXIhdHfZLekjk/r5wlbjw=", "ctpCj");
        lllllIlll[llllllIII[3]] = llIlIlIlIllI("ppi3z8VvkwNoOTtbWOmFmFYU+rCE71fD", "MyXST");
        lllllIlll[llllllIII[4]] = llIlIlIlIllI("4+G216NDtigftiXV8jjO/R0dup3ykL1r", "NVafk");
        lllllIlll[llllllIII[7]] = llIlIlIlIlIl("8NfXV2GnqIB6g/xsC/8QqUeeepgCCcvvJO870jisJ7L/jlIB7oo/b46Ns2vWjxkg", "eAKLG");
        lllllIlll[llllllIII[19]] = llIlIlIlIllI("QinfqwetnNtpXt8HN+vUcA==", "dtZXM");
        lllllIlll[llllllIII[6]] = llIlIlIlIlIl("rDgVXpiMyIfEL2b+FfQq+w==", "DGvXR");
        lllllIlll[llllllIII[27]] = llIlIlIlIlIl("rpWYH4WByxYiIecBA0TpiyfKifXx8C2S", "dcVjP");
        lllllIlll[llllllIII[30]] = llIlIlIlIlll("Gww9Eio2Cm4KNjUPN0Y3PQEr", "XmNfC");
        lllllIlll[llllllIII[32]] = llIlIlIlIlll("BRcHACgoEVQSICoaDVQ1IxoR", "FvttA");
        lllllIlll[llllllIII[33]] = llIlIlIlIlll("ABEyNw0tF2EgBS4dOGMQJhwk", "CpACd");
        lllllIlll[llllllIII[34]] = llIlIlIlIlll("Gy0pAgI0Jg==", "ZAJjk");
        lllllIlll[llllllIII[37]] = llIlIlIlIllI("QMRYyquzP2g=", "PgbSK");
        lllllIlll[llllllIII[39]] = llIlIlIlIlIl("mL2k/q5k6lKWDtTgjCpHD1BGJFGqfTMk", "uyRGt");
        lllllIlll[llllllIII[43]] = llIlIlIlIllI("yIwqdtmaUmVAh9B3O6xhDA==", "AOGbI");
        lllllIlll[llllllIII[44]] = llIlIlIlIllI("EOgxbnsELvU1D9pS4C8FqQ==", "JhTWD");
        lllllIlll[llllllIII[45]] = llIlIlIlIllI("k9mSGR6iKWQ=", "cVzRn");
        lllllIlll[llllllIII[46]] = llIlIlIlIlIl("1yovjkIlZXg=", "AoeJR");
        lllllIlll[llllllIII[47]] = llIlIlIlIlll("AA4D", "catsU");
        lllllIlll[llllllIII[49]] = llIlIlIlIlll("ETo3FjQ7", "PNCwW");
        lllllIlll[llllllIII[53]] = llIlIlIlIlll("DAEkITEtFmEuLTceIi4rNw==", "CqAOX");
        lllllIlll[llllllIII[54]] = llIlIlIlIlIl("/o82a2jpvKLE6tLzWkT8mA==", "qoEnP");
        lllllIlll[llllllIII[56]] = llIlIlIlIlIl("bppbjh3txRxxbXRxJeDxtA==", "GSEaP");
        lllllIlll[llllllIII[57]] = llIlIlIlIlIl("2Kl+S+gZcxFL65YVk+AEvw==", "DORxO");
        lllllIlll[llllllIII[58]] = llIlIlIlIlIl("6pY+MLb98hd2kC5v5tYcWA==", "VUQHl");
        lllllIlll[llllllIII[21]] = llIlIlIlIlll("Hyk2OSF6GzA/IDEt", "ZHDMI");
        lllllIlll[llllllIII[52]] = llIlIlIlIllI("PwdaOe02l2waewRATWDxoA==", "GTShu");
        lllllIlll[llllllIII[74]] = llIlIlIlIllI("0rOcaqNxRENPZoyjZv7sgg==", "usoBI");
        lllllIlll[llllllIII[75]] = llIlIlIlIlIl("LjSaKa39zBDUV8u4SXkYWPo3tScWxpcs", "Nxtwf");
        lllllIlll[llllllIII[76]] = llIlIlIlIlll("Oy46", "xAMXa");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (llIlIllIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d2, code lost:
        if (llIlIllIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0274, code lost:
        if (llIlIllIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0332, code lost:
        if (llIlIllIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
        if (llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[21])) {
            int[] iArr = new int[llllllIII[1]];
            iArr[llllllIII[0]] = llllllIII[9];
            if (llIlIllIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llllllIII[1]];
                iArr2[llllllIII[0]] = llllllIII[13];
                if (llIlIllIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llllllIII[1]];
                    iArr3[llllllIII[0]] = llllllIII[11];
                    if (llIlIllIlIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llllllIII[1]];
                        iArr4[llllllIII[0]] = llllllIII[14];
                        if (llIlIllIlIIl(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[llllllIII[1]];
                            iArr5[llllllIII[0]] = llllllIII[20];
                            if (llIlIllIlIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llllllIII[1]];
                                iArr6[llllllIII[0]] = llllllIII[48];
                                if (llIlIllIlIll(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[llllllIII[1]];
                                    iArr7[llllllIII[0]] = llllllIII[48];
                                }
                                ?? r0 = llllllIII[1];
                                "".length();
                                return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return llllllIII[0];
        } else if (llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[21]) && llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[8])) {
            int[] iArr8 = new int[llllllIII[1]];
            iArr8[llllllIII[0]] = llllllIII[13];
            if (llIlIllIlIIl(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[llllllIII[1]];
                iArr9[llllllIII[0]] = llllllIII[11];
                if (llIlIllIlIIl(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llllllIII[1]];
                    iArr10[llllllIII[0]] = llllllIII[14];
                    if (llIlIllIlIIl(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[llllllIII[1]];
                        iArr11[llllllIII[0]] = llllllIII[16];
                        if (llIlIllIlIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llllllIII[1]];
                            iArr12[llllllIII[0]] = llllllIII[48];
                            if (llIlIllIlIll(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[llllllIII[1]];
                                iArr13[llllllIII[0]] = llllllIII[48];
                            }
                            ?? r02 = llllllIII[1];
                            "".length();
                            return (-" ".length()) < (-" ".length()) ? ((33 ^ 116) ^ (209 ^ 181)) & (((((11 + 14) - (-109)) + 40) ^ (((11 + 57) - (-20)) + 71)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return llllllIII[0];
        } else if (llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[8]) && llIlIllIlIll(ck ? 1 : 0)) {
            int[] iArr14 = new int[llllllIII[1]];
            iArr14[llllllIII[0]] = llllllIII[22];
            if (llIlIllIlIll(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[llllllIII[1]];
                iArr15[llllllIII[0]] = llllllIII[22];
            }
            int[] iArr16 = new int[llllllIII[1]];
            iArr16[llllllIII[0]] = llllllIII[24];
            if (llIlIllIlIIl(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llllllIII[1]];
                iArr17[llllllIII[0]] = llllllIII[38];
                if (llIlIllIlIIl(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = llllllIII[1];
                    "".length();
                    return (-" ".length()) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return llllllIII[0];
        } else if (llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[8]) && llIlIllIlIIl(ck ? 1 : 0)) {
            int[] iArr18 = new int[llllllIII[1]];
            iArr18[llllllIII[0]] = llllllIII[22];
            if (llIlIllIlIll(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[llllllIII[1]];
                iArr19[llllllIII[0]] = llllllIII[22];
            }
            int[] iArr20 = new int[llllllIII[1]];
            iArr20[llllllIII[0]] = llllllIII[16];
            if (llIlIllIlIIl(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[llllllIII[1]];
                iArr21[llllllIII[0]] = llllllIII[23];
                if (llIlIllIlIIl(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llllllIII[1]];
                    iArr22[llllllIII[0]] = llllllIII[23];
                    if (llIlIllIlllI(Inventory.getFirst(iArr22).getQuantity(), llllllIII[19])) {
                        int[] iArr23 = new int[llllllIII[1]];
                        iArr23[llllllIII[0]] = llllllIII[24];
                        if (llIlIllIlIIl(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[llllllIII[1]];
                            iArr24[llllllIII[0]] = llllllIII[38];
                            if (llIlIllIlIIl(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = llllllIII[1];
                                "".length();
                                return " ".length() > " ".length() ? ((51 ^ 59) ^ (135 ^ 130)) & (((((147 + 149) - 242) + 117) ^ (((78 + 78) - 96) + 106)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return llllllIII[0];
        } else {
            return llllllIII[0];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (llIlIllIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d8, code lost:
        if (llIlIllIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0283, code lost:
        if (llIlIllIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0340, code lost:
        if (llIlIllIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
        if (llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[21])) {
            int[] iArr = new int[llllllIII[1]];
            iArr[llllllIII[0]] = llllllIII[9];
            if (llIlIllIlIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llllllIII[1]];
                iArr2[llllllIII[0]] = llllllIII[13];
                if (llIlIllIlIIl(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llllllIII[1]];
                    iArr3[llllllIII[0]] = llllllIII[11];
                    if (llIlIllIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llllllIII[1]];
                        iArr4[llllllIII[0]] = llllllIII[14];
                        if (llIlIllIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[llllllIII[1]];
                            iArr5[llllllIII[0]] = llllllIII[20];
                            if (llIlIllIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llllllIII[1]];
                                iArr6[llllllIII[0]] = llllllIII[48];
                                if (llIlIllIlIll(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[llllllIII[1]];
                                    iArr7[llllllIII[0]] = llllllIII[48];
                                }
                                ?? r0 = llllllIII[1];
                                "".length();
                                return (-(119 ^ 115)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return llllllIII[0];
        } else if (llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[21]) && llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[8])) {
            int[] iArr8 = new int[llllllIII[1]];
            iArr8[llllllIII[0]] = llllllIII[13];
            if (llIlIllIlIIl(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[llllllIII[1]];
                iArr9[llllllIII[0]] = llllllIII[11];
                if (llIlIllIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llllllIII[1]];
                    iArr10[llllllIII[0]] = llllllIII[14];
                    if (llIlIllIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[llllllIII[1]];
                        iArr11[llllllIII[0]] = llllllIII[16];
                        if (llIlIllIlIIl(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llllllIII[1]];
                            iArr12[llllllIII[0]] = llllllIII[48];
                            if (llIlIllIlIll(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[llllllIII[1]];
                                iArr13[llllllIII[0]] = llllllIII[48];
                            }
                            ?? r02 = llllllIII[1];
                            "".length();
                            return "  ".length() == ((35 ^ 45) ^ (182 ^ 188)) ? ((((178 + 75) - 127) + 99) ^ (((5 + 1) - (-90)) + 72)) & (((87 ^ 97) ^ (((46 + 83) - 114) + 112)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return llllllIII[0];
        } else if (llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[8]) && llIlIllIlIll(ck ? 1 : 0)) {
            int[] iArr14 = new int[llllllIII[1]];
            iArr14[llllllIII[0]] = llllllIII[22];
            if (llIlIllIlIll(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[llllllIII[1]];
                iArr15[llllllIII[0]] = llllllIII[22];
            }
            int[] iArr16 = new int[llllllIII[1]];
            iArr16[llllllIII[0]] = llllllIII[24];
            if (llIlIllIlIIl(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llllllIII[1]];
                iArr17[llllllIII[0]] = llllllIII[25];
                if (llIlIllIlIIl(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = llllllIII[1];
                    "".length();
                    return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return llllllIII[0];
        } else if (llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[8]) && llIlIllIlIIl(ck ? 1 : 0)) {
            int[] iArr18 = new int[llllllIII[1]];
            iArr18[llllllIII[0]] = llllllIII[22];
            if (llIlIllIlIll(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[llllllIII[1]];
                iArr19[llllllIII[0]] = llllllIII[22];
            }
            int[] iArr20 = new int[llllllIII[1]];
            iArr20[llllllIII[0]] = llllllIII[16];
            if (llIlIllIlIIl(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[llllllIII[1]];
                iArr21[llllllIII[0]] = llllllIII[23];
                if (llIlIllIlIIl(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llllllIII[1]];
                    iArr22[llllllIII[0]] = llllllIII[23];
                    if (llIlIllIlllI(Bank.getFirst(iArr22).getQuantity(), llllllIII[19])) {
                        int[] iArr23 = new int[llllllIII[1]];
                        iArr23[llllllIII[0]] = llllllIII[24];
                        if (llIlIllIlIIl(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[llllllIII[1]];
                            iArr24[llllllIII[0]] = llllllIII[25];
                            if (llIlIllIlIIl(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = llllllIII[1];
                                "".length();
                                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r04;
                            }
                        }
                    }
                }
            }
            return llllllIII[0];
        } else {
            return llllllIII[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    static {
        llIlIllIlIII();
        llIlIllIIlll();
        ck = llllllIII[0];
        bx = new ArrayList();
        cl = new WorldArea(llllllIII[77], llllllIII[78], llllllIII[53], llllllIII[43], llllllIII[0]);
        cm = new WorldPoint(llllllIII[79], llllllIII[80], llllllIII[0]);
        cn = null;
    }

    private static void am() {
        if (llIlIlllIIlI(llIlIlllIIIl(C0004e.w(), 30.0d))) {
            int[] iArr = new int[llllllIII[1]];
            iArr[llllllIII[0]] = llllllIII[20];
            if (llIlIllIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llllllIII[1]];
                iArr2[llllllIII[0]] = llllllIII[20];
                Inventory.getFirst(iArr2).interact(lllllIlll[llllllIII[45]]);
                Time.sleepTicks(llllllIII[1]);
                "".length();
            }
        }
        if (llIlIlllIIII(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (llIlIllIlIIl(npc.getName().contains(lllllIlll[llllllIII[76]]) ? 1 : 0) && llIlIllIlIll(npc.isDead() ? 1 : 0)) {
                    ?? r0 = llllllIII[1];
                    "".length();
                    return (-" ".length()) != (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llllllIII[0];
            });
            String[] strArr = new String[llllllIII[3]];
            strArr[llllllIII[0]] = lllllIlll[llllllIII[46]];
            strArr[llllllIII[1]] = lllllIlll[llllllIII[47]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (llIlIlllIIll(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = llllllIII[1];
                    "".length();
                    return " ".length() >= (10 ^ 14) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llllllIII[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[llllllIII[1]];
            iArr3[llllllIII[0]] = llllllIII[48];
            if (llIlIllIlIIl(Equipment.contains(iArr3) ? 1 : 0) && llIlIllIlIll(ap() ? 1 : 0)) {
                aq();
            }
            if (llIlIllIllII(nearest) && llIlIllIlIll(Players.getLocal().isMoving() ? 1 : 0)) {
                nearest.interact(lllllIlll[llllllIII[49]]);
                Time.sleepTicks(llllllIII[4]);
                "".length();
            }
        }
    }

    private static boolean llIlIllIllll(int i, int i2) {
        return i == i2;
    }

    private static String llIlIlIlIlll(String lIlIlIlIllIII, String lIlIlIlIlIlll) {
        String str = new String(Base64.getDecoder().decode(lIlIlIlIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlIlIlIlIlll.toCharArray();
        int lIlIlIlIlIlII = llllllIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllllIII[0];
        while (llIlIllIlIlI(i, length)) {
            char lIlIlIlIllIIl = charArray2[i];
            sb.append((char) (lIlIlIlIllIIl ^ charArray[lIlIlIlIlIlII % charArray.length]));
            "".length();
            lIlIlIlIlIlII++;
            i++;
            "".length();
            if (" ".length() < ((80 ^ 110) & ((138 ^ 180) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlIlllIIlI(int i) {
        return i < 0;
    }

    private static String llIlIlIlIllI(String lIlIlIlIIIIll, String lIlIlIlIIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIlIIIIlI.getBytes(StandardCharsets.UTF_8)), llllllIII[30]), "DES");
            Cipher lIlIlIlIIIlIl = Cipher.getInstance("DES");
            lIlIlIlIIIlIl.init(llllllIII[3], secretKeySpec);
            return new String(lIlIlIlIIIlIl.doFinal(Base64.getDecoder().decode(lIlIlIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIlIIIlII) {
            lIlIlIlIIIlII.printStackTrace();
            return null;
        }
    }

    private static int llIlIlllIIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static String llIlIlIlIlIl(String lIlIlIllIlIII, String lIlIlIllIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIllIlIlI = Cipher.getInstance("Blowfish");
            lIlIlIllIlIlI.init(llllllIII[3], secretKeySpec);
            return new String(lIlIlIllIlIlI.doFinal(Base64.getDecoder().decode(lIlIlIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIllIlIIl) {
            lIlIlIllIlIIl.printStackTrace();
            return null;
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lllllIlll[llllllIII[74]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[2])) {
            ?? r0 = llllllIII[1];
            "".length();
            return !((true ^ true) ^ (true ^ false)) ? ((((125 + 75) - 118) + 82) ^ (((112 + 71) - 41) + 3)) & (((198 ^ 184) ^ (38 ^ 109)) ^ (-" ".length())) : r0;
        }
        return llllllIII[0];
    }

    private static boolean llIlIlllIIII(Object obj) {
        return obj == null;
    }

    public static void aq() {
        if (llIlIllIllII(Widgets.get(llllllIII[51], llllllIII[52]))) {
            AccBuilderGWD.c = lllllIlll[llllllIII[53]];
            Widgets.get(llllllIII[51], llllllIII[52]).interact(lllllIlll[llllllIII[54]]);
            Time.sleepTicks(llllllIII[7]);
            "".length();
        }
        if (llIlIlllIIII(Widgets.get(llllllIII[51], llllllIII[52])) && llIlIllIlIll(Widgets.get(llllllIII[55]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(llllllIII[1]);
            "".length();
            if (llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[19])) {
                Widgets.get(llllllIII[55], llllllIII[1]).getChild(llllllIII[1]).interact(lllllIlll[llllllIII[56]]);
            }
            if (llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[32]) && llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[19])) {
                Widgets.get(llllllIII[55], llllllIII[1]).getChild(llllllIII[3]).interact(lllllIlll[llllllIII[57]]);
            }
            if (llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[32]) && llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[39])) {
                Widgets.get(llllllIII[55], llllllIII[1]).getChild(llllllIII[4]).interact(lllllIlll[llllllIII[58]]);
            }
            if (llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[32])) {
                int[] iArr = new int[llllllIII[1]];
                iArr[llllllIII[0]] = llllllIII[14];
                if (llIlIllIlIll(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(llllllIII[55], llllllIII[1]).getChild(llllllIII[4]).interact(lllllIlll[llllllIII[21]]);
                }
            }
            if (llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[39])) {
                int[] iArr2 = new int[llllllIII[1]];
                iArr2[llllllIII[0]] = llllllIII[14];
                if (llIlIllIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(llllllIII[55], llllllIII[1]).getChild(llllllIII[7]).interact(lllllIlll[llllllIII[52]]);
                }
            }
            Time.sleepTicks(llllllIII[1]);
            "".length();
        }
    }

    private static boolean llIlIllIlIIl(int i) {
        return i != 0;
    }

    private static boolean llIlIlllIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIlIllIlllI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v368, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v401, types: [boolean] */
    public static void ak() {
        if (llIlIllIlIIl(bv ? 1 : 0)) {
            AccBuilderGWD.c = lllllIlll[llllllIII[0]];
            C0001b.a(bx);
            if (llIlIllIlIlI(bx.size(), llllllIII[1])) {
                System.out.println(lllllIlll[llllllIII[1]]);
                bv = llllllIII[0];
            }
        }
        if (llIlIllIlIll(bv ? 1 : 0) && llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[2])) {
            if (llIlIllIlIll(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlIllIllII(nearest) && llIlIllIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllllIlll[llllllIII[3]];
                    C0000a.a(nearest);
                }
                if (llIlIllIllII(nearest) && llIlIllIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllllIlll[llllllIII[4]];
                    if (llIlIllIlIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllllIII[5]);
                        "".length();
                        Time.sleepTicks(llllllIII[6]);
                        "".length();
                    }
                    if (llIlIllIlIIl(Bank.isOpen() ? 1 : 0)) {
                        if (llIlIllIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllllIII[7]);
                            "".length();
                        }
                        while (llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[8]) && llIlIllIlIll(H.bT() ? 1 : 0)) {
                            H.bR();
                            Time.sleepTicks(llllllIII[1]);
                            "".length();
                            "".length();
                            if ("  ".length() == 0) {
                                return;
                            }
                        }
                        if (llIlIllIlIll(ao() ? 1 : 0)) {
                            Q();
                            System.out.println(lllllIlll[llllllIII[7]]);
                            bv = llllllIII[1];
                            return;
                        }
                        if (llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[8])) {
                            int[] iArr = new int[llllllIII[1]];
                            iArr[llllllIII[0]] = llllllIII[9];
                            if (llIlIllIlIIl(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[llllllIII[1]];
                                iArr2[llllllIII[0]] = llllllIII[9];
                                if (llIlIllIlIlI(Inventory.getCount(iArr2), llllllIII[1])) {
                                    Bank.withdraw(llllllIII[9], llllllIII[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllllIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[llllllIII[1]];
                                        iArr3[llllllIII[0]] = llllllIII[9];
                                        if (llIlIllIllIl(Inventory.getCount(iArr3))) {
                                            ?? r0 = llllllIII[1];
                                            "".length();
                                            return (((((106 + 55) - 60) + 52) ^ (((102 + 36) - 83) + 77)) & (((190 ^ 174) ^ (39 ^ 42)) ^ (-" ".length()))) != 0 ? ((((124 + 35) - 17) + 31) ^ (((49 + 42) - 86) + 140)) & (((((107 + 130) - 155) + 68) ^ (((6 + 106) - 44) + 102)) ^ (-" ".length())) : r0;
                                        }
                                        return llllllIII[0];
                                    }, llllllIII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[llllllIII[1]];
                            iArr3[llllllIII[0]] = llllllIII[11];
                            if (llIlIllIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[llllllIII[1]];
                                iArr4[llllllIII[0]] = llllllIII[11];
                                if (llIlIllIlIlI(Inventory.getCount(iArr4), llllllIII[1])) {
                                    Bank.withdraw(llllllIII[11], llllllIII[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllllIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[llllllIII[1]];
                                        iArr5[llllllIII[0]] = llllllIII[11];
                                        if (llIlIllIllIl(Inventory.getCount(iArr5))) {
                                            ?? r0 = llllllIII[1];
                                            "".length();
                                            return "  ".length() <= (-" ".length()) ? ((38 ^ 81) ^ (218 ^ 142)) & (((239 ^ 193) ^ (23 ^ 26)) ^ (-" ".length())) : r0;
                                        }
                                        return llllllIII[0];
                                    }, llllllIII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[llllllIII[1]];
                            iArr5[llllllIII[0]] = llllllIII[13];
                            if (llIlIllIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llllllIII[1]];
                                iArr6[llllllIII[0]] = llllllIII[13];
                                if (llIlIllIlIlI(Inventory.getCount(iArr6), llllllIII[1])) {
                                    Bank.withdraw(llllllIII[13], llllllIII[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllllIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[llllllIII[1]];
                                        iArr7[llllllIII[0]] = llllllIII[13];
                                        if (llIlIllIllIl(Inventory.getCount(iArr7))) {
                                            ?? r0 = llllllIII[1];
                                            "".length();
                                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llllllIII[0];
                                    }, llllllIII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[llllllIII[1]];
                            iArr7[llllllIII[0]] = llllllIII[14];
                            if (llIlIllIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[llllllIII[1]];
                                iArr8[llllllIII[0]] = llllllIII[14];
                                if (llIlIllIlIlI(Inventory.getCount(iArr8), llllllIII[1])) {
                                    Bank.withdraw(llllllIII[14], llllllIII[15], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllllIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[llllllIII[1]];
                                        iArr9[llllllIII[0]] = llllllIII[14];
                                        if (llIlIllIllIl(Inventory.getCount(iArr9))) {
                                            ?? r0 = llllllIII[1];
                                            "".length();
                                            return (123 ^ 127) <= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llllllIII[0];
                                    }, llllllIII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[llllllIII[1]];
                            iArr9[llllllIII[0]] = llllllIII[16];
                            if (llIlIllIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[llllllIII[1]];
                                iArr10[llllllIII[0]] = llllllIII[16];
                                if (llIlIllIlIlI(Inventory.getCount(iArr10), llllllIII[1])) {
                                    Bank.withdraw(llllllIII[16], llllllIII[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllllIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[llllllIII[1]];
                                        iArr11[llllllIII[0]] = llllllIII[16];
                                        if (llIlIllIllIl(Inventory.getCount(iArr11))) {
                                            ?? r0 = llllllIII[1];
                                            "".length();
                                            return (-" ".length()) == (122 ^ 126) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llllllIII[0];
                                    }, llllllIII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[llllllIII[1]];
                            iArr11[llllllIII[0]] = llllllIII[17];
                            if (llIlIllIlIIl(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[llllllIII[1]];
                                iArr12[llllllIII[0]] = llllllIII[17];
                                if (llIlIllIlIll(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(llllllIII[17], llllllIII[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllllIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[llllllIII[1]];
                                        iArr13[llllllIII[0]] = llllllIII[17];
                                        return Inventory.contains(iArr13);
                                    }, llllllIII[5]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(llllllIII[18], llllllIII[19], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[llllllIII[1]];
                            iArr13[llllllIII[0]] = llllllIII[20];
                            if (llIlIllIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[llllllIII[1]];
                                iArr14[llllllIII[0]] = llllllIII[20];
                                if (llIlIllIlIlI(Inventory.getCount(iArr14), llllllIII[1]) && llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[21])) {
                                    Bank.withdrawAll(llllllIII[20], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llllllIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[llllllIII[1]];
                                        iArr15[llllllIII[0]] = llllllIII[20];
                                        if (llIlIllIllIl(Inventory.getCount(iArr15))) {
                                            ?? r0 = llllllIII[1];
                                            "".length();
                                            return "  ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llllllIII[0];
                                    }, llllllIII[5]);
                                    "".length();
                                }
                            }
                        }
                        if (llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[8])) {
                            int[] iArr15 = new int[llllllIII[1]];
                            iArr15[llllllIII[0]] = llllllIII[22];
                            if (llIlIllIlIll(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(llllllIII[22], llllllIII[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llllllIII[1]);
                                "".length();
                            }
                            if (llIlIllIlIIl(ck ? 1 : 0)) {
                                Bank.withdrawAll(llllllIII[23], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llllllIII[1]);
                                "".length();
                                Bank.withdrawAll(llllllIII[16], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llllllIII[1]);
                                "".length();
                            }
                            Time.sleepTicks(llllllIII[4]);
                            "".length();
                            Bank.withdrawAll(llllllIII[24], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(llllllIII[1]);
                            "".length();
                            Bank.withdrawAll(llllllIII[25], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(llllllIII[1]);
                            "".length();
                        }
                    }
                }
            }
            if (llIlIllIlIIl(an() ? 1 : 0)) {
                if (llIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[21])) {
                    if (llIlIllIlIll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lllllIlll[llllllIII[19]];
                        Movement.walkTo(cm);
                        "".length();
                        Time.sleepTicks(llllllIII[1]);
                        "".length();
                    }
                    if (llIlIllIlIIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lllllIlll[llllllIII[6]];
                        am();
                    }
                }
                if (llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[21]) && llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[26])) {
                    AccBuilderGWD.c = lllllIlll[llllllIII[27]];
                    if (llIlIllIllll(Players.getLocal().getAnimation(), llllllIII[28])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(llllllIII[1]);
                        "".length();
                    }
                }
                if (llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[26]) && llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[29])) {
                    AccBuilderGWD.c = lllllIlll[llllllIII[30]];
                    if (llIlIllIllll(Players.getLocal().getAnimation(), llllllIII[28])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(llllllIII[1]);
                        "".length();
                    }
                }
                if (llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[29]) && llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[31])) {
                    AccBuilderGWD.c = lllllIlll[llllllIII[32]];
                    if (llIlIllIllll(Players.getLocal().getAnimation(), llllllIII[28])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(llllllIII[1]);
                        "".length();
                    }
                }
                if (llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[31]) && llIlIllIlIlI(Skills.getLevel(Skill.MAGIC), llllllIII[8])) {
                    AccBuilderGWD.c = lllllIlll[llllllIII[33]];
                    if (llIlIllIllll(Players.getLocal().getAnimation(), llllllIII[28])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(llllllIII[1]);
                        "".length();
                    }
                }
                if (llIlIllIlllI(Skills.getLevel(Skill.MAGIC), llllllIII[8])) {
                    AccBuilderGWD.c = lllllIlll[llllllIII[34]];
                    if (llIlIlllIIII(cn)) {
                        cn = new WorldPoint(llllllIII[35] + C0004e.c(llllllIII[1], llllllIII[7]), llllllIII[36], llllllIII[0]);
                    }
                    int[] iArr16 = new int[llllllIII[1]];
                    iArr16[llllllIII[0]] = llllllIII[22];
                    if (llIlIllIlIIl(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[llllllIII[1]];
                        iArr17[llllllIII[0]] = llllllIII[22];
                        if (llIlIllIlIll(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[llllllIII[1]];
                            iArr18[llllllIII[0]] = llllllIII[22];
                            Inventory.getFirst(iArr18).interact(lllllIlll[llllllIII[37]]);
                            Time.sleepTicks(llllllIII[1]);
                            "".length();
                        }
                    }
                    if (llIlIllIlIIl(GrandExchange.isOpen() ? 1 : 0)) {
                        C0001b.g();
                    }
                    int[] iArr19 = new int[llllllIII[1]];
                    iArr19[llllllIII[0]] = llllllIII[24];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[llllllIII[1]];
                    iArr20[llllllIII[0]] = llllllIII[38];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (llIlIllIlIll(ck ? 1 : 0) && llIlIllIllII(cn)) {
                        if (llIlIllIlIll(Players.getLocal().getWorldLocation().equals(cn) ? 1 : 0)) {
                            AccBuilderGWD.c = lllllIlll[llllllIII[39]];
                            Movement.walkTo(cn);
                            "".length();
                            Time.sleepTicks(llllllIII[1]);
                            "".length();
                        }
                        if (llIlIllIlIIl(Players.getLocal().getWorldLocation().equals(cn) ? 1 : 0) && llIlIllIllII(first) && llIlIllIllII(first2)) {
                            int experience = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (llIlIlllIlII(Skills.getExperience(Skill.MAGIC), experience)) {
                                    ?? r0 = llllllIII[1];
                                    "".length();
                                    return "  ".length() != "  ".length() ? ((17 ^ 69) ^ (215 ^ 153)) & (((((158 + 107) - 84) + 36) ^ (((186 + 80) - 162) + 91)) ^ (-" ".length())) : r0;
                                }
                                return llllllIII[0];
                            }, llllllIII[10]);
                            "".length();
                            Time.sleep(C0004e.c(llllllIII[40], llllllIII[41]));
                            "".length();
                        }
                    }
                    if (llIlIllIlIIl(ck ? 1 : 0)) {
                        if (llIlIllIllII(first) && llIlIllIllII(first2) && llIlIllIllll(Players.getLocal().getAnimation(), llllllIII[28])) {
                            int experience2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (llIlIlllIlII(Skills.getExperience(Skill.MAGIC), experience2)) {
                                    ?? r0 = llllllIII[1];
                                    "".length();
                                    return (-" ".length()) != (-" ".length()) ? ((105 ^ 67) ^ (126 ^ 111)) & (((10 ^ 55) ^ (141 ^ 139)) ^ (-" ".length())) : r0;
                                }
                                return llllllIII[0];
                            }, llllllIII[10]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (llIlIllIllll(Players.getLocal().getAnimation(), llllllIII[28])) {
                                ?? r0 = llllllIII[1];
                                "".length();
                                return " ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llllllIII[0];
                        }, llllllIII[42]);
                        "".length();
                    }
                }
            }
        }
    }
}
