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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ah  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/ah.class */
public class ah implements ab {
    public static /* synthetic */ List<C0003d> bx;
    public static /* synthetic */ boolean ck;
    static /* synthetic */ WorldArea cl;
    private static /* synthetic */ String[] lllIlIlII;
    static /* synthetic */ WorldPoint cm;
    static /* synthetic */ WorldPoint cn;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ int[] lllIlIlIl;

    private static boolean llIIIlllIIII(Object obj) {
        return obj != null;
    }

    private static boolean llIIIllIllll(int i) {
        return i == 0;
    }

    private static boolean llIIIllIlllI(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIllllIII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (llIIIllIllIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01e9, code lost:
        if (llIIIllIllIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x029b, code lost:
        if (llIIIllIllIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0370, code lost:
        if (llIIIllIllIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
        if (llIIIllIlllI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[20])) {
            int[] iArr = new int[lllIlIlIl[1]];
            iArr[lllIlIlIl[0]] = lllIlIlIl[8];
            if (llIIIllIllIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIlIlIl[1]];
                iArr2[lllIlIlIl[0]] = lllIlIlIl[12];
                if (llIIIllIllIl(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lllIlIlIl[1]];
                    iArr3[lllIlIlIl[0]] = lllIlIlIl[10];
                    if (llIIIllIllIl(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lllIlIlIl[1]];
                        iArr4[lllIlIlIl[0]] = lllIlIlIl[13];
                        if (llIIIllIllIl(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lllIlIlIl[1]];
                            iArr5[lllIlIlIl[0]] = lllIlIlIl[19];
                            if (llIIIllIllIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lllIlIlIl[1]];
                                iArr6[lllIlIlIl[0]] = lllIlIlIl[47];
                                if (llIIIllIllll(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lllIlIlIl[1]];
                                    iArr7[lllIlIlIl[0]] = lllIlIlIl[47];
                                }
                                ?? r0 = lllIlIlIl[1];
                                "".length();
                                return (-"  ".length()) >= 0 ? ((19 ^ 110) ^ (226 ^ 172)) & (((29 ^ 51) ^ (148 ^ 137)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lllIlIlIl[0];
        } else if (llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[20]) && llIIIllIlllI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[7])) {
            int[] iArr8 = new int[lllIlIlIl[1]];
            iArr8[lllIlIlIl[0]] = lllIlIlIl[12];
            if (llIIIllIllIl(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lllIlIlIl[1]];
                iArr9[lllIlIlIl[0]] = lllIlIlIl[10];
                if (llIIIllIllIl(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lllIlIlIl[1]];
                    iArr10[lllIlIlIl[0]] = lllIlIlIl[13];
                    if (llIIIllIllIl(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lllIlIlIl[1]];
                        iArr11[lllIlIlIl[0]] = lllIlIlIl[15];
                        if (llIIIllIllIl(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lllIlIlIl[1]];
                            iArr12[lllIlIlIl[0]] = lllIlIlIl[47];
                            if (llIIIllIllll(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lllIlIlIl[1]];
                                iArr13[lllIlIlIl[0]] = lllIlIlIl[47];
                            }
                            ?? r02 = lllIlIlIl[1];
                            "".length();
                            return !((true ^ true) ^ (true ^ true)) ? ((((73 + 152) - 88) + 101) ^ (((118 + 36) - 136) + 154)) & (((((123 + 175) - 168) + 64) ^ (((35 + 16) - (-58)) + 19)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return lllIlIlIl[0];
        } else if (llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[7]) && llIIIllIllll(ck ? 1 : 0)) {
            int[] iArr14 = new int[lllIlIlIl[1]];
            iArr14[lllIlIlIl[0]] = lllIlIlIl[21];
            if (llIIIllIllll(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lllIlIlIl[1]];
                iArr15[lllIlIlIl[0]] = lllIlIlIl[21];
            }
            int[] iArr16 = new int[lllIlIlIl[1]];
            iArr16[lllIlIlIl[0]] = lllIlIlIl[23];
            if (llIIIllIllIl(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lllIlIlIl[1]];
                iArr17[lllIlIlIl[0]] = lllIlIlIl[24];
                if (llIIIllIllIl(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lllIlIlIl[1];
                    "".length();
                    return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return lllIlIlIl[0];
        } else if (llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[7]) && llIIIllIllIl(ck ? 1 : 0)) {
            int[] iArr18 = new int[lllIlIlIl[1]];
            iArr18[lllIlIlIl[0]] = lllIlIlIl[21];
            if (llIIIllIllll(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lllIlIlIl[1]];
                iArr19[lllIlIlIl[0]] = lllIlIlIl[21];
            }
            int[] iArr20 = new int[lllIlIlIl[1]];
            iArr20[lllIlIlIl[0]] = lllIlIlIl[15];
            if (llIIIllIllIl(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lllIlIlIl[1]];
                iArr21[lllIlIlIl[0]] = lllIlIlIl[22];
                if (llIIIllIllIl(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lllIlIlIl[1]];
                    iArr22[lllIlIlIl[0]] = lllIlIlIl[22];
                    if (llIIIlllIIlI(Bank.getFirst(iArr22).getQuantity(), lllIlIlIl[18])) {
                        int[] iArr23 = new int[lllIlIlIl[1]];
                        iArr23[lllIlIlIl[0]] = lllIlIlIl[23];
                        if (llIIIllIllIl(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lllIlIlIl[1]];
                            iArr24[lllIlIlIl[0]] = lllIlIlIl[24];
                            if (llIIIllIllIl(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lllIlIlIl[1];
                                "".length();
                                return "   ".length() > "   ".length() ? ((113 ^ 63) ^ (40 ^ 88)) & (((((6 + 63) - 34) + 214) ^ (((96 + 85) - (-18)) + 0)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lllIlIlIl[0];
        } else {
            return lllIlIlIl[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lllIlIlIl[0];
    }

    private static String llIIIllIlIIl(String llIlllIlIlIIl, String llIlllIlIlIII) {
        String llIlllIlIlIIl2 = new String(Base64.getDecoder().decode(llIlllIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlllIlIIlll = new StringBuilder();
        char[] charArray = llIlllIlIlIII.toCharArray();
        int llIlllIlIIlIl = lllIlIlIl[0];
        char[] charArray2 = llIlllIlIlIIl2.toCharArray();
        int length = charArray2.length;
        int i = lllIlIlIl[0];
        while (llIIIllIlllI(i, length)) {
            llIlllIlIIlll.append((char) (charArray2[i] ^ charArray[llIlllIlIIlIl % charArray.length]));
            "".length();
            llIlllIlIIlIl++;
            i++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llIlllIlIIlll);
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lllIlIlII[lllIlIlIl[73]];
    }

    private static int llIIIlllIlIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void llIIIllIllII() {
        lllIlIlIl = new int[82];
        lllIlIlIl[0] = (184 ^ 181) & ((97 ^ 108) ^ (-1));
        lllIlIlIl[1] = " ".length();
        lllIlIlIl[2] = "  ".length();
        lllIlIlIl[3] = "   ".length();
        lllIlIlIl[4] = (-56) & 5055;
        lllIlIlIl[5] = (45 ^ 40) ^ "   ".length();
        lllIlIlIl[6] = 8 ^ 12;
        lllIlIlIl[7] = 14 ^ 57;
        lllIlIlIl[8] = (-6594) & 7151;
        lllIlIlIl[9] = (-(38 ^ 34)) & (-12289) & 13791;
        lllIlIlIl[10] = (-3525) & 4079;
        lllIlIlIl[11] = (-((-1033) & 21561)) & (-515) & 23542;
        lllIlIlIl[12] = (-((-4647) & 32759)) & (-4099) & 32767;
        lllIlIlIl[13] = (-12678) & 13231;
        lllIlIlIl[14] = (-((-5137) & 32313)) & (-1026) & 32701;
        lllIlIlIl[15] = (-((-11075) & 16327)) & (-16649) & 22463;
        lllIlIlIl[16] = (-19457) & 32081;
        lllIlIlIl[17] = (-8371) & 16379;
        lllIlIlIl[18] = (255 ^ 160) ^ (125 ^ 39);
        lllIlIlIl[19] = (-32257) & 32635;
        lllIlIlIl[20] = (((108 + 77) - 60) + 11) ^ (((57 + 57) - 71) + 102);
        lllIlIlIl[21] = (-((-9581) & 28653)) & (-12305) & 32763;
        lllIlIlIl[22] = (-22659) & 23214;
        lllIlIlIl[23] = (-4549) & 5109;
        lllIlIlIl[24] = 141 ^ 179;
        lllIlIlIl[25] = (((90 + 121) - 76) + 28) ^ (((105 + 34) - (-48)) + 1);
        lllIlIlIl[26] = (((83 + 62) - 82) + 97) ^ (((106 + 158) - 240) + 143);
        lllIlIlIl[27] = -" ".length();
        lllIlIlIl[28] = (137 ^ 132) ^ (123 ^ 83);
        lllIlIlIl[29] = (91 ^ 39) ^ (68 ^ 48);
        lllIlIlIl[30] = 131 ^ 174;
        lllIlIlIl[31] = 20 ^ 29;
        lllIlIlIl[32] = (47 ^ 48) ^ (31 ^ 10);
        lllIlIlIl[33] = (111 ^ 25) ^ (59 ^ 70);
        lllIlIlIl[34] = (-((-1622) & 30455)) & (-5) & 31999;
        lllIlIlIl[35] = (-25153) & 28639;
        lllIlIlIl[36] = (158 ^ 133) ^ (119 ^ 96);
        lllIlIlIl[37] = 138 ^ 181;
        lllIlIlIl[38] = 82 ^ 95;
        lllIlIlIl[39] = (-1047) & 1366;
        lllIlIlIl[40] = (-14502) & 15031;
        lllIlIlIl[41] = (-((-1161) & 26252)) & (-65) & 28655;
        lllIlIlIl[42] = 149 ^ 155;
        lllIlIlIl[43] = 124 ^ 115;
        lllIlIlIl[44] = 75 ^ 91;
        lllIlIlIl[45] = (254 ^ 193) ^ (108 ^ 66);
        lllIlIlIl[46] = (253 ^ 195) ^ (24 ^ 52);
        lllIlIlIl[47] = (-29187) & 30567;
        lllIlIlIl[48] = 172 ^ 191;
        lllIlIlIl[49] = (-15052) & 15327;
        lllIlIlIl[50] = (-16417) & 17009;
        lllIlIlIl[51] = (17 ^ 7) ^ (32 ^ 44);
        lllIlIlIl[52] = 191 ^ 171;
        lllIlIlIl[53] = (((139 + 81) - 174) + 104) ^ (((56 + 83) - 116) + 108);
        lllIlIlIl[54] = ((69 + 150) - 130) + 112;
        lllIlIlIl[55] = (((92 + 26) - 101) + 113) ^ (((95 + 97) - 94) + 50);
        lllIlIlIl[56] = (190 ^ 135) ^ (147 ^ 189);
        lllIlIlIl[57] = (((26 + 40) - (-1)) + 64) ^ (((62 + 141) - 96) + 48);
        lllIlIlIl[58] = (-((-16385) & 21528)) & (-26625) & 32767;
        lllIlIlIl[59] = ((38 + 55) - 77) + 154;
        lllIlIlIl[60] = (-4) & 4003;
        lllIlIlIl[61] = (-((-2210) & 30895)) & (-3) & 30687;
        lllIlIlIl[62] = (-8258) & 11257;
        lllIlIlIl[63] = (-((-965) & 2021)) & (-2819) & 16374;
        lllIlIlIl[64] = (-((-8225) & 8546)) & (-16929) & 32749;
        lllIlIlIl[65] = 232 ^ 144;
        lllIlIlIl[66] = (((71 ^ 30) + (((30 + 35) - 47) + 126)) - (((147 + 123) - 161) + 46)) + (34 ^ 106);
        lllIlIlIl[67] = (-327) & 15326;
        lllIlIlIl[68] = 1 ^ 101;
        lllIlIlIl[69] = (-((-7895) & 24311)) & (-17) & 28412;
        lllIlIlIl[70] = (-6145) & 31144;
        lllIlIlIl[71] = (-((-4421) & 29181)) & (-1) & 32767;
        lllIlIlIl[72] = (-25673) & 26572;
        lllIlIlIl[73] = (41 ^ 80) ^ (30 ^ 124);
        lllIlIlIl[74] = 51 ^ 120;
        lllIlIlIl[75] = (157 ^ 184) ^ (38 ^ 31);
        lllIlIlIl[76] = (71 ^ 11) ^ (5 ^ 84);
        lllIlIlIl[77] = (-1073) & 4094;
        lllIlIlIl[78] = (-((-4163) & 29511)) & (-1) & 28647;
        lllIlIlIl[79] = (-((-595) & 26203)) & (-4097) & 32735;
        lllIlIlIl[80] = (-29189) & 32493;
        lllIlIlIl[81] = 162 ^ 188;
    }

    private static boolean llIIIlllIlII(Object obj) {
        return obj == null;
    }

    private static boolean llIIIllIllIl(int i) {
        return i != 0;
    }

    private static boolean llIIIlllIIlI(int i, int i2) {
        return i >= i2;
    }

    private static void Q() {
        if (llIIIllIlllI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[7])) {
            int[] iArr = new int[lllIlIlIl[1]];
            iArr[lllIlIlIl[0]] = lllIlIlIl[15];
            if (llIIIllIllll(Bank.contains(iArr) ? 1 : 0)) {
                bx.add(new C0003d(lllIlIlIl[15], lllIlIlIl[58], lllIlIlIl[59]));
                "".length();
            }
            int[] iArr2 = new int[lllIlIlIl[1]];
            iArr2[lllIlIlIl[0]] = lllIlIlIl[8];
            if (llIIIllIllll(Bank.contains(iArr2) ? 1 : 0)) {
                bx.add(new C0003d(lllIlIlIl[8], lllIlIlIl[60], lllIlIlIl[5]));
                "".length();
            }
            int[] iArr3 = new int[lllIlIlIl[1]];
            iArr3[lllIlIlIl[0]] = lllIlIlIl[10];
            if (llIIIllIllll(Bank.contains(iArr3) ? 1 : 0)) {
                bx.add(new C0003d(lllIlIlIl[10], lllIlIlIl[61], lllIlIlIl[5]));
                "".length();
            }
            int[] iArr4 = new int[lllIlIlIl[1]];
            iArr4[lllIlIlIl[0]] = lllIlIlIl[12];
            if (llIIIllIllll(Bank.contains(iArr4) ? 1 : 0)) {
                bx.add(new C0003d(lllIlIlIl[12], lllIlIlIl[62], lllIlIlIl[5]));
                "".length();
            }
            int[] iArr5 = new int[lllIlIlIl[1]];
            iArr5[lllIlIlIl[0]] = lllIlIlIl[13];
            if (llIIIllIllll(Bank.contains(iArr5) ? 1 : 0)) {
                bx.add(new C0003d(lllIlIlIl[13], lllIlIlIl[4], lllIlIlIl[5]));
                "".length();
            }
            int[] iArr6 = new int[lllIlIlIl[1]];
            iArr6[lllIlIlIl[0]] = lllIlIlIl[47];
            if (llIIIllIllll(Bank.contains(iArr6) ? 1 : 0)) {
                bx.add(new C0003d(lllIlIlIl[47], lllIlIlIl[1], C0004e.c(lllIlIlIl[63], lllIlIlIl[64])));
                "".length();
            }
        }
        if (llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[7])) {
            int[] iArr7 = new int[lllIlIlIl[1]];
            iArr7[lllIlIlIl[0]] = lllIlIlIl[23];
            if (llIIIllIllIl(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lllIlIlIl[1]];
                iArr8[lllIlIlIl[0]] = lllIlIlIl[23];
                if (llIIIllIlllI(Bank.getFirst(iArr8).getQuantity(), lllIlIlIl[62])) {
                    int i = lllIlIlIl[23];
                    int i2 = lllIlIlIl[62];
                    int[] iArr9 = new int[lllIlIlIl[1]];
                    iArr9[lllIlIlIl[0]] = lllIlIlIl[23];
                    bx.add(new C0003d(i, i2 - Bank.getFirst(iArr9).getQuantity(), lllIlIlIl[65]));
                    "".length();
                }
            }
            int[] iArr10 = new int[lllIlIlIl[1]];
            iArr10[lllIlIlIl[0]] = lllIlIlIl[23];
            if (llIIIllIllll(Bank.contains(iArr10) ? 1 : 0)) {
                bx.add(new C0003d(lllIlIlIl[23], lllIlIlIl[62], lllIlIlIl[65]));
                "".length();
            }
            int[] iArr11 = new int[lllIlIlIl[1]];
            iArr11[lllIlIlIl[0]] = lllIlIlIl[24];
            if (llIIIllIllIl(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lllIlIlIl[1]];
                iArr12[lllIlIlIl[0]] = lllIlIlIl[24];
                if (llIIIllIlllI(Bank.getFirst(iArr12).getQuantity(), lllIlIlIl[62])) {
                    int i3 = lllIlIlIl[24];
                    int i4 = lllIlIlIl[62];
                    int[] iArr13 = new int[lllIlIlIl[1]];
                    iArr13[lllIlIlIl[0]] = lllIlIlIl[24];
                    bx.add(new C0003d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), lllIlIlIl[66]));
                    "".length();
                }
            }
            int[] iArr14 = new int[lllIlIlIl[1]];
            iArr14[lllIlIlIl[0]] = lllIlIlIl[24];
            if (llIIIllIllll(Bank.contains(iArr14) ? 1 : 0)) {
                bx.add(new C0003d(lllIlIlIl[24], lllIlIlIl[62], lllIlIlIl[66]));
                "".length();
            }
            int[] iArr15 = new int[lllIlIlIl[1]];
            iArr15[lllIlIlIl[0]] = lllIlIlIl[21];
            if (llIIIllIllll(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lllIlIlIl[1]];
                iArr16[lllIlIlIl[0]] = lllIlIlIl[21];
                if (llIIIllIllll(Equipment.contains(iArr16) ? 1 : 0)) {
                    bx.add(new C0003d(lllIlIlIl[21], lllIlIlIl[1], lllIlIlIl[67]));
                    "".length();
                }
            }
            if (llIIIllIllIl(ck ? 1 : 0)) {
                int[] iArr17 = new int[lllIlIlIl[1]];
                iArr17[lllIlIlIl[0]] = lllIlIlIl[15];
                if (llIIIllIllIl(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lllIlIlIl[1]];
                    iArr18[lllIlIlIl[0]] = lllIlIlIl[15];
                    if (llIIIllIlllI(Bank.getFirst(iArr18).getQuantity(), lllIlIlIl[62])) {
                        int i5 = lllIlIlIl[15];
                        int i6 = lllIlIlIl[62];
                        int[] iArr19 = new int[lllIlIlIl[1]];
                        iArr19[lllIlIlIl[0]] = lllIlIlIl[15];
                        bx.add(new C0003d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), lllIlIlIl[59]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[lllIlIlIl[1]];
                iArr20[lllIlIlIl[0]] = lllIlIlIl[15];
                if (llIIIllIllll(Bank.contains(iArr20) ? 1 : 0)) {
                    bx.add(new C0003d(lllIlIlIl[15], lllIlIlIl[62], lllIlIlIl[59]));
                    "".length();
                }
                int[] iArr21 = new int[lllIlIlIl[1]];
                iArr21[lllIlIlIl[0]] = lllIlIlIl[22];
                if (llIIIllIllIl(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lllIlIlIl[1]];
                    iArr22[lllIlIlIl[0]] = lllIlIlIl[22];
                    if (llIIIllIlllI(Bank.getFirst(iArr22).getQuantity(), lllIlIlIl[67])) {
                        int i7 = lllIlIlIl[22];
                        int i8 = lllIlIlIl[67];
                        int[] iArr23 = new int[lllIlIlIl[1]];
                        iArr23[lllIlIlIl[0]] = lllIlIlIl[22];
                        bx.add(new C0003d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), lllIlIlIl[5]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[lllIlIlIl[1]];
                iArr24[lllIlIlIl[0]] = lllIlIlIl[22];
                if (llIIIllIllll(Bank.contains(iArr24) ? 1 : 0)) {
                    bx.add(new C0003d(lllIlIlIl[22], lllIlIlIl[67], lllIlIlIl[5]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[lllIlIlIl[1]];
        iArr25[lllIlIlIl[0]] = lllIlIlIl[19];
        if (llIIIllIllll(Bank.contains(iArr25) ? 1 : 0)) {
            bx.add(new C0003d(lllIlIlIl[19], lllIlIlIl[68], lllIlIlIl[39]));
            "".length();
        }
        if (llIIIllIllll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllIlIlII[lllIlIlIl[75]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(lllIlIlIl[69], lllIlIlIl[18], lllIlIlIl[70]));
            "".length();
        }
        int[] iArr26 = new int[lllIlIlIl[1]];
        iArr26[lllIlIlIl[0]] = lllIlIlIl[71];
        if (llIIIllIllll(Bank.contains(iArr26) ? 1 : 0)) {
            bx.add(new C0003d(lllIlIlIl[71], lllIlIlIl[32], lllIlIlIl[72]));
            "".length();
        }
        int[] iArr27 = new int[lllIlIlIl[1]];
        iArr27[lllIlIlIl[0]] = lllIlIlIl[17];
        if (llIIIllIllll(Bank.contains(iArr27) ? 1 : 0)) {
            bx.add(new C0003d(lllIlIlIl[17], lllIlIlIl[32], lllIlIlIl[72]));
            "".length();
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            ak();
            "".length();
            if (0 != 0) {
                return (" ".length() ^ (24 ^ 61)) & (((((19 + 83) - 73) + 112) ^ (((63 + 153) - 151) + 104)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lllIlIlIl[68];
    }

    private static boolean llIIIlllIIll(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIIlllIllI(int i) {
        return i < 0;
    }

    public static void al() {
        if (llIIIllIllIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIIIllIllll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIlIlII[lllIlIlIl[42]];
            Movement.walkTo(cm);
            "".length();
            Time.sleepTicks(lllIlIlIl[1]);
            "".length();
        }
        if (llIIIllIllIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIlIlII[lllIlIlIl[43]];
            am();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[74])) {
            ?? r0 = lllIlIlIl[1];
            "".length();
            return (110 ^ 107) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIlIlIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v365, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v399, types: [boolean] */
    public static void ak() {
        if (llIIIllIllIl(bv ? 1 : 0)) {
            AccBuilderGWD.c = lllIlIlII[lllIlIlIl[0]];
            C0001b.a(bx);
            if (llIIIllIlllI(bx.size(), lllIlIlIl[1])) {
                System.out.println(lllIlIlII[lllIlIlIl[1]]);
                bv = lllIlIlIl[0];
            }
        }
        if (llIIIllIllll(bv ? 1 : 0)) {
            if (llIIIllIllll(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIIlllIIII(nearest) && llIIIllIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[2]];
                    C0000a.a(nearest);
                }
                if (llIIIlllIIII(nearest) && llIIIllIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[3]];
                    if (llIIIllIllll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIlIlIl[4]);
                        "".length();
                        Time.sleepTicks(lllIlIlIl[5]);
                        "".length();
                    }
                    if (llIIIllIllIl(Bank.isOpen() ? 1 : 0)) {
                        if (llIIIlllIIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIlIlIl[6]);
                            "".length();
                        }
                        while (llIIIllIlllI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[7]) && llIIIllIllll(H.bT() ? 1 : 0)) {
                            H.bR();
                            Time.sleepTicks(lllIlIlIl[1]);
                            "".length();
                            "".length();
                            if (((35 ^ 48) & ((75 ^ 88) ^ (-1))) >= " ".length()) {
                                return;
                            }
                        }
                        if (llIIIllIllll(ao() ? 1 : 0)) {
                            Q();
                            System.out.println(lllIlIlII[lllIlIlIl[6]]);
                            bv = lllIlIlIl[1];
                            return;
                        }
                        if (llIIIllIlllI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[7])) {
                            int[] iArr = new int[lllIlIlIl[1]];
                            iArr[lllIlIlIl[0]] = lllIlIlIl[8];
                            if (llIIIllIllIl(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lllIlIlIl[1]];
                                iArr2[lllIlIlIl[0]] = lllIlIlIl[8];
                                if (llIIIllIlllI(Inventory.getCount(iArr2), lllIlIlIl[1])) {
                                    Bank.withdraw(lllIlIlIl[8], lllIlIlIl[9], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIlIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[lllIlIlIl[1]];
                                        iArr3[lllIlIlIl[0]] = lllIlIlIl[8];
                                        if (llIIIlllIIIl(Inventory.getCount(iArr3))) {
                                            ?? r0 = lllIlIlIl[1];
                                            "".length();
                                            return (-((9 ^ 124) ^ (218 ^ 171))) > 0 ? ((((63 + 27) - (-27)) + 89) ^ (((95 + 152) - 200) + 109)) & ((((166 ^ 182) & ((95 ^ 79) ^ (-1))) ^ (209 ^ 131)) ^ (-" ".length())) : r0;
                                        }
                                        return lllIlIlIl[0];
                                    }, lllIlIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[lllIlIlIl[1]];
                            iArr3[lllIlIlIl[0]] = lllIlIlIl[10];
                            if (llIIIllIllIl(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lllIlIlIl[1]];
                                iArr4[lllIlIlIl[0]] = lllIlIlIl[10];
                                if (llIIIllIlllI(Inventory.getCount(iArr4), lllIlIlIl[1])) {
                                    Bank.withdraw(lllIlIlIl[10], lllIlIlIl[11], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIlIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[lllIlIlIl[1]];
                                        iArr5[lllIlIlIl[0]] = lllIlIlIl[10];
                                        if (llIIIlllIIIl(Inventory.getCount(iArr5))) {
                                            ?? r0 = lllIlIlIl[1];
                                            "".length();
                                            return 0 != 0 ? ((22 ^ 39) ^ (5 ^ 84)) & (((88 ^ 127) ^ (56 ^ 127)) ^ (-" ".length())) : r0;
                                        }
                                        return lllIlIlIl[0];
                                    }, lllIlIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[lllIlIlIl[1]];
                            iArr5[lllIlIlIl[0]] = lllIlIlIl[12];
                            if (llIIIllIllIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lllIlIlIl[1]];
                                iArr6[lllIlIlIl[0]] = lllIlIlIl[12];
                                if (llIIIllIlllI(Inventory.getCount(iArr6), lllIlIlIl[1])) {
                                    Bank.withdraw(lllIlIlIl[12], lllIlIlIl[11], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIlIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[lllIlIlIl[1]];
                                        iArr7[lllIlIlIl[0]] = lllIlIlIl[12];
                                        if (llIIIlllIIIl(Inventory.getCount(iArr7))) {
                                            ?? r0 = lllIlIlIl[1];
                                            "".length();
                                            return " ".length() <= (-" ".length()) ? ((187 ^ 175) ^ (209 ^ 137)) & (((72 ^ 84) ^ (145 ^ 193)) ^ (-" ".length())) : r0;
                                        }
                                        return lllIlIlIl[0];
                                    }, lllIlIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[lllIlIlIl[1]];
                            iArr7[lllIlIlIl[0]] = lllIlIlIl[13];
                            if (llIIIllIllIl(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lllIlIlIl[1]];
                                iArr8[lllIlIlIl[0]] = lllIlIlIl[13];
                                if (llIIIllIlllI(Inventory.getCount(iArr8), lllIlIlIl[1])) {
                                    Bank.withdraw(lllIlIlIl[13], lllIlIlIl[14], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIlIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[lllIlIlIl[1]];
                                        iArr9[lllIlIlIl[0]] = lllIlIlIl[13];
                                        if (llIIIlllIIIl(Inventory.getCount(iArr9))) {
                                            ?? r0 = lllIlIlIl[1];
                                            "".length();
                                            return 0 != 0 ? ((189 ^ 182) ^ (47 ^ 121)) & (((41 ^ 87) ^ (47 ^ 12)) ^ (-" ".length())) : r0;
                                        }
                                        return lllIlIlIl[0];
                                    }, lllIlIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[lllIlIlIl[1]];
                            iArr9[lllIlIlIl[0]] = lllIlIlIl[15];
                            if (llIIIllIllIl(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lllIlIlIl[1]];
                                iArr10[lllIlIlIl[0]] = lllIlIlIl[15];
                                if (llIIIllIlllI(Inventory.getCount(iArr10), lllIlIlIl[1])) {
                                    Bank.withdraw(lllIlIlIl[15], lllIlIlIl[9], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIlIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[lllIlIlIl[1]];
                                        iArr11[lllIlIlIl[0]] = lllIlIlIl[15];
                                        if (llIIIlllIIIl(Inventory.getCount(iArr11))) {
                                            ?? r0 = lllIlIlIl[1];
                                            "".length();
                                            return (-"   ".length()) >= 0 ? ((239 ^ 176) ^ (38 ^ 44)) & (((88 ^ 115) ^ (22 ^ 104)) ^ (-" ".length())) : r0;
                                        }
                                        return lllIlIlIl[0];
                                    }, lllIlIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[lllIlIlIl[1]];
                            iArr11[lllIlIlIl[0]] = lllIlIlIl[16];
                            if (llIIIllIllIl(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lllIlIlIl[1]];
                                iArr12[lllIlIlIl[0]] = lllIlIlIl[16];
                                if (llIIIllIllll(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(lllIlIlIl[16], lllIlIlIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIlIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[lllIlIlIl[1]];
                                        iArr13[lllIlIlIl[0]] = lllIlIlIl[16];
                                        return Inventory.contains(iArr13);
                                    }, lllIlIlIl[4]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(lllIlIlIl[17], lllIlIlIl[18], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[lllIlIlIl[1]];
                            iArr13[lllIlIlIl[0]] = lllIlIlIl[19];
                            if (llIIIllIllIl(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lllIlIlIl[1]];
                                iArr14[lllIlIlIl[0]] = lllIlIlIl[19];
                                if (llIIIllIlllI(Inventory.getCount(iArr14), lllIlIlIl[1]) && llIIIllIlllI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[20])) {
                                    Bank.withdrawAll(lllIlIlIl[19], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIlIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[lllIlIlIl[1]];
                                        iArr15[lllIlIlIl[0]] = lllIlIlIl[19];
                                        if (llIIIlllIIIl(Inventory.getCount(iArr15))) {
                                            ?? r0 = lllIlIlIl[1];
                                            "".length();
                                            return (-((54 ^ 50) ^ ((63 ^ 40) & ((170 ^ 189) ^ (-1))))) >= 0 ? ((((97 + 243) - 215) + 119) ^ (((62 + 145) - 86) + 40)) & (((110 ^ 34) ^ (25 ^ 0)) ^ (-" ".length())) : r0;
                                        }
                                        return lllIlIlIl[0];
                                    }, lllIlIlIl[4]);
                                    "".length();
                                }
                            }
                        }
                        if (llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[7])) {
                            int[] iArr15 = new int[lllIlIlIl[1]];
                            iArr15[lllIlIlIl[0]] = lllIlIlIl[21];
                            if (llIIIllIllll(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(lllIlIlIl[21], lllIlIlIl[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lllIlIlIl[1]);
                                "".length();
                            }
                            if (llIIIllIllIl(ck ? 1 : 0)) {
                                Bank.withdrawAll(lllIlIlIl[22], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lllIlIlIl[1]);
                                "".length();
                                Bank.withdrawAll(lllIlIlIl[15], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lllIlIlIl[1]);
                                "".length();
                            }
                            Time.sleepTicks(lllIlIlIl[3]);
                            "".length();
                            Bank.withdrawAll(lllIlIlIl[23], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lllIlIlIl[1]);
                            "".length();
                            Bank.withdrawAll(lllIlIlIl[24], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(lllIlIlIl[1]);
                            "".length();
                        }
                    }
                }
            }
            if (llIIIllIllIl(an() ? 1 : 0)) {
                if (llIIIllIllIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (llIIIllIlllI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[20])) {
                    if (llIIIllIllll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lllIlIlII[lllIlIlIl[18]];
                        Movement.walkTo(cm);
                        "".length();
                        Time.sleepTicks(lllIlIlIl[1]);
                        "".length();
                    }
                    if (llIIIllIllIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lllIlIlII[lllIlIlIl[5]];
                        am();
                    }
                }
                if (llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[20]) && llIIIllIlllI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[25])) {
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[26]];
                    if (llIIIlllIIll(Players.getLocal().getAnimation(), lllIlIlIl[27])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(lllIlIlIl[1]);
                        "".length();
                    }
                }
                if (llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[25]) && llIIIllIlllI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[28])) {
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[29]];
                    if (llIIIlllIIll(Players.getLocal().getAnimation(), lllIlIlIl[27])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(lllIlIlIl[1]);
                        "".length();
                    }
                }
                if (llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[28]) && llIIIllIlllI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[30])) {
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[31]];
                    if (llIIIlllIIll(Players.getLocal().getAnimation(), lllIlIlIl[27])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(lllIlIlIl[1]);
                        "".length();
                    }
                }
                if (llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[30]) && llIIIllIlllI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[7])) {
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[32]];
                    if (llIIIlllIIll(Players.getLocal().getAnimation(), lllIlIlIl[27])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(lllIlIlIl[1]);
                        "".length();
                    }
                }
                if (llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[7])) {
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[33]];
                    if (llIIIlllIlII(cn)) {
                        cn = new WorldPoint(lllIlIlIl[34] + C0004e.c(lllIlIlIl[1], lllIlIlIl[6]), lllIlIlIl[35], lllIlIlIl[0]);
                    }
                    int[] iArr16 = new int[lllIlIlIl[1]];
                    iArr16[lllIlIlIl[0]] = lllIlIlIl[21];
                    if (llIIIllIllIl(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lllIlIlIl[1]];
                        iArr17[lllIlIlIl[0]] = lllIlIlIl[21];
                        if (llIIIllIllll(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lllIlIlIl[1]];
                            iArr18[lllIlIlIl[0]] = lllIlIlIl[21];
                            Inventory.getFirst(iArr18).interact(lllIlIlII[lllIlIlIl[36]]);
                            Time.sleepTicks(lllIlIlIl[1]);
                            "".length();
                        }
                    }
                    if (llIIIllIllIl(GrandExchange.isOpen() ? 1 : 0)) {
                        C0001b.g();
                    }
                    int[] iArr19 = new int[lllIlIlIl[1]];
                    iArr19[lllIlIlIl[0]] = lllIlIlIl[23];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[lllIlIlIl[1]];
                    iArr20[lllIlIlIl[0]] = lllIlIlIl[37];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (llIIIllIllll(ck ? 1 : 0) && llIIIlllIIII(cn)) {
                        if (llIIIllIllll(Players.getLocal().getWorldLocation().equals(cn) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIlIlII[lllIlIlIl[38]];
                            Movement.walkTo(cn);
                            "".length();
                            Time.sleepTicks(lllIlIlIl[1]);
                            "".length();
                        }
                        if (llIIIllIllIl(Players.getLocal().getWorldLocation().equals(cn) ? 1 : 0) && llIIIlllIIII(first) && llIIIlllIIII(first2)) {
                            int experience = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (llIIIllllIII(Skills.getExperience(Skill.MAGIC), experience)) {
                                    ?? r0 = lllIlIlIl[1];
                                    "".length();
                                    return "  ".length() == 0 ? ((((86 + 149) - 222) + 156) ^ (((41 + 103) - 139) + 142)) & (((((149 + 82) - 122) + 46) ^ (((149 + 28) - 130) + 114)) ^ (-" ".length())) : r0;
                                }
                                return lllIlIlIl[0];
                            }, lllIlIlIl[9]);
                            "".length();
                            Time.sleep(C0004e.c(lllIlIlIl[39], lllIlIlIl[40]));
                            "".length();
                        }
                    }
                    if (llIIIllIllIl(ck ? 1 : 0)) {
                        if (llIIIlllIIII(first) && llIIIlllIIII(first2) && llIIIlllIIll(Players.getLocal().getAnimation(), lllIlIlIl[27])) {
                            int experience2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (llIIIllllIII(Skills.getExperience(Skill.MAGIC), experience2)) {
                                    ?? r0 = lllIlIlIl[1];
                                    "".length();
                                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lllIlIlIl[0];
                            }, lllIlIlIl[9]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (llIIIlllIIll(Players.getLocal().getAnimation(), lllIlIlIl[27])) {
                                ?? r0 = lllIlIlIl[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIlIlIl[0];
                        }, lllIlIlIl[41]);
                        "".length();
                    }
                }
            }
        }
    }

    public static void aq() {
        if (llIIIlllIIII(Widgets.get(lllIlIlIl[50], lllIlIlIl[51]))) {
            AccBuilderGWD.c = lllIlIlII[lllIlIlIl[52]];
            Widgets.get(lllIlIlIl[50], lllIlIlIl[51]).interact(lllIlIlII[lllIlIlIl[53]]);
            Time.sleepTicks(lllIlIlIl[6]);
            "".length();
        }
        if (llIIIlllIlII(Widgets.get(lllIlIlIl[50], lllIlIlIl[51])) && llIIIllIllll(Widgets.get(lllIlIlIl[54]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(lllIlIlIl[1]);
            "".length();
            if (llIIIllIlllI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[18])) {
                Widgets.get(lllIlIlIl[54], lllIlIlIl[1]).getChild(lllIlIlIl[1]).interact(lllIlIlII[lllIlIlIl[55]]);
            }
            if (llIIIllIlllI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[31]) && llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[18])) {
                Widgets.get(lllIlIlIl[54], lllIlIlIl[1]).getChild(lllIlIlIl[2]).interact(lllIlIlII[lllIlIlIl[56]]);
            }
            if (llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[31]) && llIIIllIlllI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[38])) {
                Widgets.get(lllIlIlIl[54], lllIlIlIl[1]).getChild(lllIlIlIl[3]).interact(lllIlIlII[lllIlIlIl[57]]);
            }
            if (llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[31])) {
                int[] iArr = new int[lllIlIlIl[1]];
                iArr[lllIlIlIl[0]] = lllIlIlIl[13];
                if (llIIIllIllll(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(lllIlIlIl[54], lllIlIlIl[1]).getChild(lllIlIlIl[3]).interact(lllIlIlII[lllIlIlIl[20]]);
                }
            }
            if (llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[38])) {
                int[] iArr2 = new int[lllIlIlIl[1]];
                iArr2[lllIlIlIl[0]] = lllIlIlIl[13];
                if (llIIIllIllIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(lllIlIlIl[54], lllIlIlIl[1]).getChild(lllIlIlIl[6]).interact(lllIlIlII[lllIlIlIl[51]]);
                }
            }
            Time.sleepTicks(lllIlIlIl[1]);
            "".length();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (llIIIllIllIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d8, code lost:
        if (llIIIllIllIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0267, code lost:
        if (llIIIllIllIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x031b, code lost:
        if (llIIIllIllIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
        if (llIIIllIlllI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[20])) {
            int[] iArr = new int[lllIlIlIl[1]];
            iArr[lllIlIlIl[0]] = lllIlIlIl[8];
            if (llIIIllIllIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIlIlIl[1]];
                iArr2[lllIlIlIl[0]] = lllIlIlIl[12];
                if (llIIIllIllIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lllIlIlIl[1]];
                    iArr3[lllIlIlIl[0]] = lllIlIlIl[10];
                    if (llIIIllIllIl(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lllIlIlIl[1]];
                        iArr4[lllIlIlIl[0]] = lllIlIlIl[13];
                        if (llIIIllIllIl(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lllIlIlIl[1]];
                            iArr5[lllIlIlIl[0]] = lllIlIlIl[19];
                            if (llIIIllIllIl(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lllIlIlIl[1]];
                                iArr6[lllIlIlIl[0]] = lllIlIlIl[47];
                                if (llIIIllIllll(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lllIlIlIl[1]];
                                    iArr7[lllIlIlIl[0]] = lllIlIlIl[47];
                                }
                                ?? r0 = lllIlIlIl[1];
                                "".length();
                                return " ".length() >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return lllIlIlIl[0];
        } else if (llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[20]) && llIIIllIlllI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[7])) {
            int[] iArr8 = new int[lllIlIlIl[1]];
            iArr8[lllIlIlIl[0]] = lllIlIlIl[12];
            if (llIIIllIllIl(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lllIlIlIl[1]];
                iArr9[lllIlIlIl[0]] = lllIlIlIl[10];
                if (llIIIllIllIl(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lllIlIlIl[1]];
                    iArr10[lllIlIlIl[0]] = lllIlIlIl[13];
                    if (llIIIllIllIl(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lllIlIlIl[1]];
                        iArr11[lllIlIlIl[0]] = lllIlIlIl[15];
                        if (llIIIllIllIl(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lllIlIlIl[1]];
                            iArr12[lllIlIlIl[0]] = lllIlIlIl[47];
                            if (llIIIllIllll(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lllIlIlIl[1]];
                                iArr13[lllIlIlIl[0]] = lllIlIlIl[47];
                            }
                            ?? r02 = lllIlIlIl[1];
                            "".length();
                            return 0 != 0 ? ((18 ^ 103) ^ (196 ^ 151)) & (((175 ^ 153) ^ (210 ^ 194)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return lllIlIlIl[0];
        } else if (llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[7]) && llIIIllIllll(ck ? 1 : 0)) {
            int[] iArr14 = new int[lllIlIlIl[1]];
            iArr14[lllIlIlIl[0]] = lllIlIlIl[21];
            if (llIIIllIllll(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lllIlIlIl[1]];
                iArr15[lllIlIlIl[0]] = lllIlIlIl[21];
            }
            int[] iArr16 = new int[lllIlIlIl[1]];
            iArr16[lllIlIlIl[0]] = lllIlIlIl[23];
            if (llIIIllIllIl(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lllIlIlIl[1]];
                iArr17[lllIlIlIl[0]] = lllIlIlIl[37];
                if (llIIIllIllIl(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lllIlIlIl[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return lllIlIlIl[0];
        } else if (llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[7]) && llIIIllIllIl(ck ? 1 : 0)) {
            int[] iArr18 = new int[lllIlIlIl[1]];
            iArr18[lllIlIlIl[0]] = lllIlIlIl[21];
            if (llIIIllIllll(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lllIlIlIl[1]];
                iArr19[lllIlIlIl[0]] = lllIlIlIl[21];
            }
            int[] iArr20 = new int[lllIlIlIl[1]];
            iArr20[lllIlIlIl[0]] = lllIlIlIl[15];
            if (llIIIllIllIl(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lllIlIlIl[1]];
                iArr21[lllIlIlIl[0]] = lllIlIlIl[22];
                if (llIIIllIllIl(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lllIlIlIl[1]];
                    iArr22[lllIlIlIl[0]] = lllIlIlIl[22];
                    if (llIIIlllIIlI(Inventory.getFirst(iArr22).getQuantity(), lllIlIlIl[18])) {
                        int[] iArr23 = new int[lllIlIlIl[1]];
                        iArr23[lllIlIlIl[0]] = lllIlIlIl[23];
                        if (llIIIllIllIl(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lllIlIlIl[1]];
                            iArr24[lllIlIlIl[0]] = lllIlIlIl[37];
                            if (llIIIllIllIl(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lllIlIlIl[1];
                                "".length();
                                return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r04;
                            }
                        }
                    }
                }
            }
            return lllIlIlIl[0];
        } else {
            return lllIlIlIl[0];
        }
    }

    private static void llIIIllIlIll() {
        lllIlIlII = new String[lllIlIlIl[81]];
        lllIlIlII[lllIlIlIl[0]] = llIIIllIlIII("sw03b7OQ1KleKh6+CDgqAg==", "dfRkP");
        lllIlIlII[lllIlIlIl[1]] = llIIIllIlIII("ZiP15vg4Ve9hvvSxpmtqylFJzdw8/QB7pVR2+ETor53Z48qDV1TzX55NKabHY7+nWJuePed152M=", "tGzgm");
        lllIlIlII[lllIlIlIl[2]] = llIIIllIlIII("jpCDzRGfxtpEymkNjGzvvxNKq9BCNBpZ", "xKFKW");
        lllIlIlII[lllIlIlIl[3]] = llIIIllIlIIl("ETsbKj4wNBJuMDg0Hic8Pg==", "YZuNR");
        lllIlIlII[lllIlIlIl[6]] = llIIIllIlIII("n/x8Y/kUFXZpDmX7XMd9ZqyWknAF4O81s+DDUv5MM2hoB6mdlo/L062M0a35ULWD", "MoOHB");
        lllIlIlII[lllIlIlIl[18]] = llIIIllIlIII("9H2JgfSPej91OCTx/WEf8Q==", "BexxK");
        lllIlIlII[lllIlIlIl[5]] = llIIIllIlIlI("hOzpQhQtuW0vc5ZROy0hWQ==", "dabFF");
        lllIlIlII[lllIlIlIl[26]] = llIIIllIlIlI("m0v7Cx5X14WPiGOQObPEruTuYrWsASlX", "fRYnn");
        lllIlIlII[lllIlIlIl[29]] = llIIIllIlIlI("5kl9PhK2/tTkoptxEsmXXoNcwpbh/j12", "ZcmoR");
        lllIlIlII[lllIlIlIl[31]] = llIIIllIlIIl("DxkePigiH00sICAUFGo1KRQI", "LxmJA");
        lllIlIlII[lllIlIlIl[32]] = llIIIllIlIlI("hU5DaKpWzq/+vkOjkcWhVPR+q8NTOZZw", "CIwZi");
        lllIlIlII[lllIlIlIl[33]] = llIIIllIlIlI("1tG7sZSf9xM=", "LKTnD");
        lllIlIlII[lllIlIlIl[36]] = llIIIllIlIII("daue/GPYBRs=", "xGNtu");
        lllIlIlII[lllIlIlIl[38]] = llIIIllIlIlI("e4/SXO7whsYaqd5m1LkjMbKlMu+h1Mfc", "cILET");
        lllIlIlII[lllIlIlIl[42]] = llIIIllIlIII("YItnflSRTf5xeQrypbIjXA==", "TQYPL");
        lllIlIlII[lllIlIlIl[43]] = llIIIllIlIII("2ozEdhFX5xdGj+8+6zE1HA==", "YbKgz");
        lllIlIlII[lllIlIlIl[44]] = llIIIllIlIII("NXIeXO6YmKs=", "pstaS");
        lllIlIlII[lllIlIlIl[45]] = llIIIllIlIIl("Egoe", "QeiIg");
        lllIlIlII[lllIlIlIl[46]] = llIIIllIlIIl("DjUW", "mZatH");
        lllIlIlII[lllIlIlIl[48]] = llIIIllIlIlI("mH6R/f2b4vk=", "JfuEs");
        lllIlIlII[lllIlIlIl[52]] = llIIIllIlIII("aZSkldZHA037qq+Xk4AjQLaHf8CFZypQ", "rXeyC");
        lllIlIlII[lllIlIlIl[53]] = llIIIllIlIlI("uIowcvcjHR5zcGZPMkUDpw==", "PqdzH");
        lllIlIlII[lllIlIlIl[55]] = llIIIllIlIII("nTkgbdaZU/EtHDWYEBUw3g==", "OTFan");
        lllIlIlII[lllIlIlIl[56]] = llIIIllIlIIl("NTUYCjRCBxgdLwkx", "bTloF");
        lllIlIlII[lllIlIlIl[57]] = llIIIllIlIII("fEou99Zy123NFuvBGI2koQ==", "DkdIp");
        lllIlIlII[lllIlIlIl[20]] = llIIIllIlIII("ZlCvtBYuWI1MKUJDjOsTMA==", "DLtzA");
        lllIlIlII[lllIlIlIl[51]] = llIIIllIlIIl("FwQDKlICGQMmGTQ=", "QmqOr");
        lllIlIlII[lllIlIlIl[73]] = llIIIllIlIII("BHws4mzjMT0/X7qgP6HKCQ==", "bbwKx");
        lllIlIlII[lllIlIlIl[75]] = llIIIllIlIII("yeQvEKA/yn4PXvOizk9nfng8q197q2wK", "rIgdE");
        lllIlIlII[lllIlIlIl[76]] = llIIIllIlIII("E7BoNr5LO0A=", "pyDaQ");
    }

    private static void am() {
        if (llIIIlllIllI(llIIIlllIlIl(C0004e.w(), 30.0d))) {
            int[] iArr = new int[lllIlIlIl[1]];
            iArr[lllIlIlIl[0]] = lllIlIlIl[19];
            if (llIIIllIllIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIlIlIl[1]];
                iArr2[lllIlIlIl[0]] = lllIlIlIl[19];
                Inventory.getFirst(iArr2).interact(lllIlIlII[lllIlIlIl[44]]);
                Time.sleepTicks(lllIlIlIl[1]);
                "".length();
            }
        }
        if (llIIIlllIlII(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (llIIIllIllIl(npc.getName().contains(lllIlIlII[lllIlIlIl[76]]) ? 1 : 0) && llIIIllIllll(npc.isDead() ? 1 : 0)) {
                    ?? r0 = lllIlIlIl[1];
                    "".length();
                    return " ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllIlIlIl[0];
            });
            String[] strArr = new String[lllIlIlIl[2]];
            strArr[lllIlIlIl[0]] = lllIlIlII[lllIlIlIl[45]];
            strArr[lllIlIlIl[1]] = lllIlIlII[lllIlIlIl[46]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (llIIIlllIlll(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = lllIlIlIl[1];
                    "".length();
                    return ((78 ^ 48) ^ (21 ^ 111)) == "  ".length() ? ("   ".length() ^ (72 ^ 43)) & (((42 ^ 83) ^ (151 ^ 142)) ^ (-" ".length())) : r0;
                }
                return lllIlIlIl[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[lllIlIlIl[1]];
            iArr3[lllIlIlIl[0]] = lllIlIlIl[47];
            if (llIIIllIllIl(Equipment.contains(iArr3) ? 1 : 0) && llIIIllIllll(ap() ? 1 : 0)) {
                aq();
            }
            if (llIIIlllIIII(nearest) && llIIIllIllll(Players.getLocal().isMoving() ? 1 : 0)) {
                nearest.interact(lllIlIlII[lllIlIlIl[48]]);
                Time.sleepTicks(lllIlIlIl[3]);
                "".length();
            }
        }
    }

    private static String llIIIllIlIlI(String llIllllIIIlII, String llIllllIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllllIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlIlIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIllllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllllIIIlll) {
            llIllllIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlllIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String llIIIllIlIII(String llIlllIlllIIl, String llIlllIlllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllIlllIII.getBytes(StandardCharsets.UTF_8)), lllIlIlIl[29]), "DES");
            Cipher llIlllIlllIll = Cipher.getInstance("DES");
            llIlllIlllIll.init(lllIlIlIl[2], secretKeySpec);
            return new String(llIlllIlllIll.doFinal(Base64.getDecoder().decode(llIlllIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlllIlllIlI) {
            llIlllIlllIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    static {
        llIIIllIllII();
        llIIIllIlIll();
        ck = lllIlIlIl[0];
        bx = new ArrayList();
        cl = new WorldArea(lllIlIlIl[77], lllIlIlIl[78], lllIlIlIl[52], lllIlIlIl[42], lllIlIlIl[0]);
        cm = new WorldPoint(lllIlIlIl[79], lllIlIlIl[80], lllIlIlIl[0]);
        cn = null;
    }

    private static boolean llIIIlllIIIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean ap() {
        if (llIIIlllIIll(Vars.getBit(lllIlIlIl[49]), lllIlIlIl[1]) && llIIIllIlllI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[18])) {
            return lllIlIlIl[1];
        }
        if (llIIIlllIIll(Vars.getBit(lllIlIlIl[49]), lllIlIlIl[2]) && llIIIllIlllI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[31]) && llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[18])) {
            return lllIlIlIl[1];
        }
        if (llIIIlllIIll(Vars.getBit(lllIlIlIl[49]), lllIlIlIl[3]) && llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[31]) && llIIIllIlllI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[38])) {
            return lllIlIlIl[1];
        }
        if (llIIIlllIIll(Vars.getBit(lllIlIlIl[49]), lllIlIlIl[3]) && llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[31])) {
            int[] iArr = new int[lllIlIlIl[1]];
            iArr[lllIlIlIl[0]] = lllIlIlIl[13];
            if (llIIIllIllll(Inventory.contains(iArr) ? 1 : 0)) {
                return lllIlIlIl[1];
            }
        }
        if (llIIIlllIIll(Vars.getBit(lllIlIlIl[49]), lllIlIlIl[6]) && llIIIlllIIlI(Skills.getLevel(Skill.MAGIC), lllIlIlIl[38])) {
            int[] iArr2 = new int[lllIlIlIl[1]];
            iArr2[lllIlIlIl[0]] = lllIlIlIl[13];
            if (llIIIllIllIl(Inventory.contains(iArr2) ? 1 : 0)) {
                return lllIlIlIl[1];
            }
        }
        return lllIlIlIl[0];
    }
}
