package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.L  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/L.class */
public class L implements G {
    static /* synthetic */ WorldArea bw;
    static /* synthetic */ WorldPoint bx;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldPoint by;
    private static /* synthetic */ String[] lIIIllIlll;
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ int[] lIIIlllIIl;
    public static /* synthetic */ boolean bu;

    private static String llllIIIIIIII(String llIllllllII, String llIlllllIll) {
        String str = new String(Base64.getDecoder().decode(llIllllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlllllIlI = new StringBuilder();
        char[] llIlllllIIl = llIlllllIll.toCharArray();
        int llIlllllIII = lIIIlllIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIlllIIl[0];
        while (llllIIIlIIIl(i, length)) {
            char llIllllllIl = charArray[i];
            llIlllllIlI.append((char) (llIllllllIl ^ llIlllllIIl[llIlllllIII % llIlllllIIl.length]));
            "".length();
            llIlllllIII++;
            i++;
            "".length();
            if ((((124 ^ 52) ^ (120 ^ 12)) & (((164 ^ 139) ^ (188 ^ 175)) ^ (-" ".length()))) < ("  ".length() & ("  ".length() ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(llIlllllIlI);
    }

    private static String lllIllllllll(String llIllIllIlI, String llIllIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlllIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllIllIll) {
            llIllIllIll.printStackTrace();
            return null;
        }
    }

    private static void llllIIIIllll() {
        lIIIlllIIl = new int[81];
        lIIIlllIIl[0] = ((51 ^ 64) ^ (228 ^ 193)) & (((((8 + 48) - 37) + 131) ^ (((96 + 71) - 86) + 111)) ^ (-" ".length()));
        lIIIlllIIl[1] = " ".length();
        lIIIlllIIl[2] = (93 ^ 11) ^ (14 ^ 106);
        lIIIlllIIl[3] = "  ".length();
        lIIIlllIIl[4] = "   ".length();
        lIIIlllIIl[5] = (-24609) & 29608;
        lIIIlllIIl[6] = (208 ^ 184) ^ (3 ^ 109);
        lIIIlllIIl[7] = (108 ^ 21) ^ (104 ^ 21);
        lIIIlllIIl[8] = (132 ^ 128) ^ (98 ^ 81);
        lIIIlllIIl[9] = (-((-4114) & 7315)) & (-8529) & 12287;
        lIIIlllIIl[10] = (-((-5449) & 7497)) & (-16898) & 20445;
        lIIIlllIIl[11] = (-((-4617) & 32477)) & (-257) & 28671;
        lIIIlllIIl[12] = (-25130) & 27629;
        lIIIlllIIl[13] = (-((-10629) & 11655)) & (-16849) & 18431;
        lIIIlllIIl[14] = (-21713) & 22266;
        lIIIlllIIl[15] = (-((-1218) & 27883)) & (-1603) & 32767;
        lIIIlllIIl[16] = (-((-389) & 14733)) & (-17857) & 32763;
        lIIIlllIIl[17] = (-20009) & 32633;
        lIIIlllIIl[18] = (-24711) & 32719;
        lIIIlllIIl[19] = (((5 + 56) - 53) + 129) ^ (((138 + 18) - 40) + 24);
        lIIIlllIIl[20] = (-((-9757) & 11933)) & (-16897) & 19451;
        lIIIlllIIl[21] = 48 ^ 41;
        lIIIlllIIl[22] = (-22677) & 24063;
        lIIIlllIIl[23] = (-((-167) & 19703)) & (-8450) & 28541;
        lIIIlllIIl[24] = (-((-2081) & 18861)) & (-7169) & 24509;
        lIIIlllIIl[25] = 124 ^ 66;
        lIIIlllIIl[26] = 130 ^ 157;
        lIIIlllIIl[27] = 75 ^ 76;
        lIIIlllIIl[28] = -" ".length();
        lIIIlllIIl[29] = 80 ^ 117;
        lIIIlllIIl[30] = (((109 + 10) - 100) + 108) ^ (123 ^ 12);
        lIIIlllIIl[31] = 3 ^ 46;
        lIIIlllIIl[32] = (((86 + 153) - 234) + 198) ^ (((67 + 60) - 13) + 80);
        lIIIlllIIl[33] = (((49 + 176) - 54) + 35) ^ (((149 + 178) - 134) + 3);
        lIIIlllIIl[34] = 14 ^ 5;
        lIIIlllIIl[35] = (-((-1538) & 30499)) & (-645) & 32767;
        lIIIlllIIl[36] = (-97) & 3583;
        lIIIlllIIl[37] = (225 ^ 172) ^ (69 ^ 4);
        lIIIlllIIl[38] = 71 ^ 120;
        lIIIlllIIl[39] = (103 ^ 125) ^ (169 ^ 190);
        lIIIlllIIl[40] = (-4692) & 8191;
        lIIIlllIIl[41] = 203 ^ 197;
        lIIIlllIIl[42] = 129 ^ 142;
        lIIIlllIIl[43] = 106 ^ 122;
        lIIIlllIIl[44] = 174 ^ 191;
        lIIIlllIIl[45] = (227 ^ 162) ^ (239 ^ 188);
        lIIIlllIIl[46] = (-((-4257) & 31417)) & (-4227) & 32767;
        lIIIlllIIl[47] = 19 ^ 0;
        lIIIlllIIl[48] = (-((-1373) & 32639)) & (-1225) & 32766;
        lIIIlllIIl[49] = (-((-5657) & 24511)) & (-8193) & 27639;
        lIIIlllIIl[50] = (48 ^ 22) ^ (133 ^ 185);
        lIIIlllIIl[51] = (89 ^ 48) ^ (6 ^ 123);
        lIIIlllIIl[52] = 15 ^ 26;
        lIIIlllIIl[53] = ((126 + 39) - 51) + 87;
        lIIIlllIIl[54] = 142 ^ 152;
        lIIIlllIIl[55] = 129 ^ 150;
        lIIIlllIIl[56] = (120 ^ 1) ^ (16 ^ 113);
        lIIIlllIIl[57] = (-((-81) & 23635)) & (-22) & 24575;
        lIIIlllIIl[58] = ((150 + 91) - 113) + 42;
        lIIIlllIIl[59] = (-((-16009) & 32479)) & (-8202) & 28671;
        lIIIlllIIl[60] = (-16391) & 18390;
        lIIIlllIIl[61] = (-((-10683) & 31167)) & (-8259) & 31742;
        lIIIlllIIl[62] = (-((-14353) & 31771)) & (-2082) & 31999;
        lIIIlllIIl[63] = (-16402) & 31901;
        lIIIlllIIl[64] = 101 ^ 29;
        lIIIlllIIl[65] = ((64 + 59) - 97) + 124;
        lIIIlllIIl[66] = (-(84 ^ 82)) & (-257) & 15261;
        lIIIlllIIl[67] = 194 ^ 166;
        lIIIlllIIl[68] = (-((-9) & 30889)) & (-1047) & 32246;
        lIIIlllIIl[69] = (-((-3469) & 7599)) & (-1) & 16110;
        lIIIlllIIl[70] = (-7701) & 32700;
        lIIIlllIIl[71] = (-8225) & 16231;
        lIIIlllIIl[72] = (-((-3077) & 7231)) & (-16385) & 21438;
        lIIIlllIIl[73] = 83 ^ 72;
        lIIIlllIIl[74] = 43 ^ 55;
        lIIIlllIIl[75] = (((31 + 99) - 17) + 39) ^ (((21 + 102) - 84) + 94);
        lIIIlllIIl[76] = (-((-18847) & 28063)) & (-2) & 12239;
        lIIIlllIIl[77] = (-((-8901) & 25565)) & (-4613) & 24575;
        lIIIlllIIl[78] = (-((-20147) & 24251)) & (-8193) & 15327;
        lIIIlllIIl[79] = (-16405) & 19709;
        lIIIlllIIl[80] = (223 ^ 145) ^ (253 ^ 173);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (llllIIIlIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01fb, code lost:
        if (llllIIIlIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0293, code lost:
        if (llllIIIlIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x034e, code lost:
        if (llllIIIlIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
    private static boolean ac() {
        if (llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[21])) {
            int[] iArr = new int[lIIIlllIIl[1]];
            iArr[lIIIlllIIl[0]] = lIIIlllIIl[9];
            if (llllIIIlIIII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIlllIIl[1]];
                iArr2[lIIIlllIIl[0]] = lIIIlllIIl[13];
                if (llllIIIlIIII(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIIlllIIl[1]];
                    iArr3[lIIIlllIIl[0]] = lIIIlllIIl[11];
                    if (llllIIIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIIlllIIl[1]];
                        iArr4[lIIIlllIIl[0]] = lIIIlllIIl[14];
                        if (llllIIIlIIII(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIIIlllIIl[1]];
                            iArr5[lIIIlllIIl[0]] = lIIIlllIIl[20];
                            if (llllIIIlIIII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIIlllIIl[1]];
                                iArr6[lIIIlllIIl[0]] = lIIIlllIIl[46];
                                if (llllIIIlIIlI(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIIIlllIIl[1]];
                                    iArr7[lIIIlllIIl[0]] = lIIIlllIIl[46];
                                }
                                ?? r0 = lIIIlllIIl[1];
                                "".length();
                                return " ".length() < (-" ".length()) ? ((((2 + 217) - 136) + 138) ^ (((98 + 59) - 135) + 109)) & (((241 ^ 181) ^ (70 ^ 92)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lIIIlllIIl[0];
        } else if (llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[21]) && llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[8])) {
            int[] iArr8 = new int[lIIIlllIIl[1]];
            iArr8[lIIIlllIIl[0]] = lIIIlllIIl[13];
            if (llllIIIlIIII(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIIlllIIl[1]];
                iArr9[lIIIlllIIl[0]] = lIIIlllIIl[11];
                if (llllIIIlIIII(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIlllIIl[1]];
                    iArr10[lIIIlllIIl[0]] = lIIIlllIIl[14];
                    if (llllIIIlIIII(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIIlllIIl[1]];
                        iArr11[lIIIlllIIl[0]] = lIIIlllIIl[16];
                        if (llllIIIlIIII(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIIlllIIl[1]];
                            iArr12[lIIIlllIIl[0]] = lIIIlllIIl[46];
                            if (llllIIIlIIlI(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIIIlllIIl[1]];
                                iArr13[lIIIlllIIl[0]] = lIIIlllIIl[46];
                            }
                            ?? r02 = lIIIlllIIl[1];
                            "".length();
                            return 0 != 0 ? ((101 ^ 71) ^ (69 ^ 80)) & (((((124 + 45) - 79) + 54) ^ (((133 + 109) - 216) + 141)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return lIIIlllIIl[0];
        } else if (llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[8]) && llllIIIlIIlI(bu ? 1 : 0)) {
            int[] iArr14 = new int[lIIIlllIIl[1]];
            iArr14[lIIIlllIIl[0]] = lIIIlllIIl[22];
            if (llllIIIlIIlI(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIIlllIIl[1]];
                iArr15[lIIIlllIIl[0]] = lIIIlllIIl[22];
            }
            int[] iArr16 = new int[lIIIlllIIl[1]];
            iArr16[lIIIlllIIl[0]] = lIIIlllIIl[24];
            if (llllIIIlIIII(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIIIlllIIl[1]];
                iArr17[lIIIlllIIl[0]] = lIIIlllIIl[25];
                if (llllIIIlIIII(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIIIlllIIl[1];
                    "".length();
                    return "  ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return lIIIlllIIl[0];
        } else if (llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[8]) && llllIIIlIIII(bu ? 1 : 0)) {
            int[] iArr18 = new int[lIIIlllIIl[1]];
            iArr18[lIIIlllIIl[0]] = lIIIlllIIl[22];
            if (llllIIIlIIlI(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIIlllIIl[1]];
                iArr19[lIIIlllIIl[0]] = lIIIlllIIl[22];
            }
            int[] iArr20 = new int[lIIIlllIIl[1]];
            iArr20[lIIIlllIIl[0]] = lIIIlllIIl[16];
            if (llllIIIlIIII(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIIIlllIIl[1]];
                iArr21[lIIIlllIIl[0]] = lIIIlllIIl[23];
                if (llllIIIlIIII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIIlllIIl[1]];
                    iArr22[lIIIlllIIl[0]] = lIIIlllIIl[23];
                    if (llllIIIlIlIl(Bank.getFirst(iArr22).getQuantity(), lIIIlllIIl[19])) {
                        int[] iArr23 = new int[lIIIlllIIl[1]];
                        iArr23[lIIIlllIIl[0]] = lIIIlllIIl[24];
                        if (llllIIIlIIII(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIIIlllIIl[1]];
                            iArr24[lIIIlllIIl[0]] = lIIIlllIIl[25];
                            if (llllIIIlIIII(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIIIlllIIl[1];
                                "".length();
                                return " ".length() < " ".length() ? ((46 ^ 62) ^ (73 ^ 71)) & (((124 ^ 93) ^ (170 ^ 149)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIIIlllIIl[0];
        } else {
            return lIIIlllIIl[0];
        }
    }

    private static String llllIIIIllIl(String llIlllIIlll, String llIlllIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllIIllI.getBytes(StandardCharsets.UTF_8)), lIIIlllIIl[30]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlllIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlllIlIII) {
            llIlllIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIIlIIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean ad() {
        if (llllIIIlIllI(Vars.getBit(lIIIlllIIl[48]), lIIIlllIIl[1]) && llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[19])) {
            return lIIIlllIIl[1];
        }
        if (llllIIIlIllI(Vars.getBit(lIIIlllIIl[48]), lIIIlllIIl[3]) && llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[32]) && llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[19])) {
            return lIIIlllIIl[1];
        }
        if (llllIIIlIllI(Vars.getBit(lIIIlllIIl[48]), lIIIlllIIl[4]) && llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[32]) && llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[39])) {
            return lIIIlllIIl[1];
        }
        if (llllIIIlIllI(Vars.getBit(lIIIlllIIl[48]), lIIIlllIIl[4]) && llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[32])) {
            int[] iArr = new int[lIIIlllIIl[1]];
            iArr[lIIIlllIIl[0]] = lIIIlllIIl[14];
            if (llllIIIlIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                return lIIIlllIIl[1];
            }
        }
        if (llllIIIlIllI(Vars.getBit(lIIIlllIIl[48]), lIIIlllIIl[7]) && llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[39])) {
            int[] iArr2 = new int[lIIIlllIIl[1]];
            iArr2[lIIIlllIIl[0]] = lIIIlllIIl[14];
            if (llllIIIlIIII(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIIlllIIl[1];
            }
        }
        return lIIIlllIIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    static {
        llllIIIIllll();
        llllIIIIlllI();
        bu = lIIIlllIIl[0];
        bv = new ArrayList();
        bw = new WorldArea(lIIIlllIIl[76], lIIIlllIIl[77], lIIIlllIIl[51], lIIIlllIIl[41], lIIIlllIIl[0]);
        bx = new WorldPoint(lIIIlllIIl[78], lIIIlllIIl[79], lIIIlllIIl[0]);
        by = null;
    }

    private static boolean llllIIIllIIl(int i) {
        return i < 0;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIIllIlll[lIIIlllIIl[73]];
    }

    private static void llllIIIIlllI() {
        lIIIllIlll = new String[lIIIlllIIl[80]];
        lIIIllIlll[lIIIlllIIl[0]] = lllIllllllll("blPQTiVMZnJIriTVrWSuLQ==", "tVLrx");
        lIIIllIlll[lIIIlllIIl[1]] = llllIIIIIIII("DxA+PiUhHDR3NDwAOTkxaRAkMjs6VXAkISANMz8/Jx5wNTcqEnAjOWkUMTA/KlkkJTcgFzk5MQ==", "IyPWV");
        lIIIllIlll[lIIIlllIIl[3]] = lllIllllllll("zUQq6p0689p5m3BvrVkKhEZvATDVKRL/", "dOxcr");
        lIIIllIlll[lIIIlllIIl[4]] = llllIIIIllIl("T8aO/Wdf6hUZgUqxIn/qu5SAF/3usbji", "VLCOa");
        lIIIllIlll[lIIIlllIIl[7]] = llllIIIIIIII("BzxnJCg1eSosKSMwKSJ6Iyw3NTY5PDRpeiMuLjE5ODApInokNmcHDwkQCQI=", "PYGEZ");
        lIIIllIlll[lIIIlllIIl[19]] = lllIllllllll("EKH9d1W9QbEpbQnDx3lG+A==", "FHLoD");
        lIIIllIlll[lIIIlllIIl[6]] = lllIllllllll("kuLJ28GtyaArYIB0pNa+rg==", "KhMPW");
        lIIIllIlll[lIIIlllIIl[27]] = llllIIIIIIII("GjgKFQI3PlkXCisrFgIAeS0cDQ4=", "YYyak");
        lIIIllIlll[lIIIlllIIl[30]] = llllIIIIllIl("0yy2+jrDNjHfncGBdtK3vo5diBDpTtUN", "iaKJJ");
        lIIIllIlll[lIIIlllIIl[32]] = llllIIIIllIl("FI0wJGPwbsQOjnSTryQki1awSCEHPly0", "pTlOp");
        lIIIllIlll[lIIIlllIIl[33]] = lllIllllllll("FN9BiUdfOyPmY9yweToyxCOZ8iN8rQ75", "BYRzT");
        lIIIllIlll[lIIIlllIIl[34]] = llllIIIIIIII("Fi8LDR45JA==", "WChew");
        lIIIllIlll[lIIIlllIIl[37]] = lllIllllllll("6sQlGOgbaQc=", "qsasP");
        lIIIllIlll[lIIIlllIIl[39]] = llllIIIIIIII("BTsmP208O3A7ISs8cCk9JyA=", "HTPZM");
        lIIIllIlll[lIIIlllIIl[41]] = lllIllllllll("hD2QjWxJHLr+1GoUaKjdKg==", "VSwlv");
        lIIIllIlll[lIIIlllIIl[42]] = lllIllllllll("R3Y3BNel0CcrsZ6Tnvafow==", "VXrmH");
        lIIIllIlll[lIIIlllIIl[43]] = lllIllllllll("e6V0RVKKAIg=", "zisgp");
        lIIIllIlll[lIIIlllIIl[44]] = llllIIIIIIII("GjU1", "YZBup");
        lIIIllIlll[lIIIlllIIl[45]] = llllIIIIllIl("wPFr/9/xEEM=", "mOdbh");
        lIIIllIlll[lIIIlllIIl[47]] = llllIIIIIIII("EhYhKzM4", "SbUJP");
        lIIIllIlll[lIIIlllIIl[51]] = llllIIIIIIII("Igg9BA4DH3gLEhkXOwsUGQ==", "mxXjg");
        lIIIllIlll[lIIIlllIIl[52]] = lllIllllllll("ml8eWm+tJhNfVguS7HQqqA==", "zbVoF");
        lIIIllIlll[lIIIlllIIl[54]] = llllIIIIllIl("alnrmaWI0sKCie3S9Now8A==", "gifkD");
        lIIIllIlll[lIIIlllIIl[55]] = llllIIIIIIII("AicwHxZ1FTAIDT4j", "UFDzd");
        lIIIllIlll[lIIIlllIIl[56]] = llllIIIIllIl("BotYtiMo1VMEPaRpajAAaw==", "zBfMw");
        lIIIllIlll[lIIIlllIIl[21]] = llllIIIIllIl("z7dTHH5c4y8yusNshGruig==", "udOsH");
        lIIIllIlll[lIIIlllIIl[50]] = lllIllllllll("TsIsPdIo6sAyMQzL6gZ0Ew==", "yQFCf");
        lIIIllIlll[lIIIlllIIl[73]] = llllIIIIIIII("PSICOhFQNxcyGx4qCzQ=", "pCeSr");
        lIIIllIlll[lIIIlllIIl[74]] = llllIIIIllIl("Ste3bEI/mH9++QLkrNf1vEhRYyigIXEh", "TMLxa");
        lIIIllIlll[lIIIlllIIl[75]] = lllIllllllll("aav4WE0k0O4=", "MeYwf");
    }

    private static boolean llllIIIllIll(int i, int i2) {
        return i > i2;
    }

    private static boolean llllIIIlIIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIIlllIIl[0];
    }

    private static void af() {
        if (llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[8])) {
            int[] iArr = new int[lIIIlllIIl[1]];
            iArr[lIIIlllIIl[0]] = lIIIlllIIl[16];
            if (llllIIIlIIlI(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0003d(lIIIlllIIl[16], lIIIlllIIl[57], lIIIlllIIl[58]));
                "".length();
            }
            int[] iArr2 = new int[lIIIlllIIl[1]];
            iArr2[lIIIlllIIl[0]] = lIIIlllIIl[9];
            if (llllIIIlIIlI(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0003d(lIIIlllIIl[9], lIIIlllIIl[59], lIIIlllIIl[6]));
                "".length();
            }
            int[] iArr3 = new int[lIIIlllIIl[1]];
            iArr3[lIIIlllIIl[0]] = lIIIlllIIl[11];
            if (llllIIIlIIlI(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0003d(lIIIlllIIl[11], lIIIlllIIl[60], lIIIlllIIl[6]));
                "".length();
            }
            int[] iArr4 = new int[lIIIlllIIl[1]];
            iArr4[lIIIlllIIl[0]] = lIIIlllIIl[13];
            if (llllIIIlIIlI(Bank.contains(iArr4) ? 1 : 0)) {
                bv.add(new C0003d(lIIIlllIIl[13], lIIIlllIIl[61], lIIIlllIIl[6]));
                "".length();
            }
            int[] iArr5 = new int[lIIIlllIIl[1]];
            iArr5[lIIIlllIIl[0]] = lIIIlllIIl[14];
            if (llllIIIlIIlI(Bank.contains(iArr5) ? 1 : 0)) {
                bv.add(new C0003d(lIIIlllIIl[14], lIIIlllIIl[5], lIIIlllIIl[6]));
                "".length();
            }
            int[] iArr6 = new int[lIIIlllIIl[1]];
            iArr6[lIIIlllIIl[0]] = lIIIlllIIl[46];
            if (llllIIIlIIlI(Bank.contains(iArr6) ? 1 : 0)) {
                bv.add(new C0003d(lIIIlllIIl[46], lIIIlllIIl[1], C0004e.c(lIIIlllIIl[62], lIIIlllIIl[63])));
                "".length();
            }
        }
        if (llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[8])) {
            int[] iArr7 = new int[lIIIlllIIl[1]];
            iArr7[lIIIlllIIl[0]] = lIIIlllIIl[24];
            if (llllIIIlIIII(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIIlllIIl[1]];
                iArr8[lIIIlllIIl[0]] = lIIIlllIIl[24];
                if (llllIIIlIIIl(Bank.getFirst(iArr8).getQuantity(), lIIIlllIIl[61])) {
                    int i = lIIIlllIIl[24];
                    int i2 = lIIIlllIIl[61];
                    int[] iArr9 = new int[lIIIlllIIl[1]];
                    iArr9[lIIIlllIIl[0]] = lIIIlllIIl[24];
                    bv.add(new C0003d(i, i2 - Bank.getFirst(iArr9).getQuantity(), lIIIlllIIl[64]));
                    "".length();
                }
            }
            int[] iArr10 = new int[lIIIlllIIl[1]];
            iArr10[lIIIlllIIl[0]] = lIIIlllIIl[24];
            if (llllIIIlIIlI(Bank.contains(iArr10) ? 1 : 0)) {
                bv.add(new C0003d(lIIIlllIIl[24], lIIIlllIIl[61], lIIIlllIIl[64]));
                "".length();
            }
            int[] iArr11 = new int[lIIIlllIIl[1]];
            iArr11[lIIIlllIIl[0]] = lIIIlllIIl[25];
            if (llllIIIlIIII(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIIIlllIIl[1]];
                iArr12[lIIIlllIIl[0]] = lIIIlllIIl[25];
                if (llllIIIlIIIl(Bank.getFirst(iArr12).getQuantity(), lIIIlllIIl[61])) {
                    int i3 = lIIIlllIIl[25];
                    int i4 = lIIIlllIIl[61];
                    int[] iArr13 = new int[lIIIlllIIl[1]];
                    iArr13[lIIIlllIIl[0]] = lIIIlllIIl[25];
                    bv.add(new C0003d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), lIIIlllIIl[65]));
                    "".length();
                }
            }
            int[] iArr14 = new int[lIIIlllIIl[1]];
            iArr14[lIIIlllIIl[0]] = lIIIlllIIl[25];
            if (llllIIIlIIlI(Bank.contains(iArr14) ? 1 : 0)) {
                bv.add(new C0003d(lIIIlllIIl[25], lIIIlllIIl[61], lIIIlllIIl[65]));
                "".length();
            }
            int[] iArr15 = new int[lIIIlllIIl[1]];
            iArr15[lIIIlllIIl[0]] = lIIIlllIIl[22];
            if (llllIIIlIIlI(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIIIlllIIl[1]];
                iArr16[lIIIlllIIl[0]] = lIIIlllIIl[22];
                if (llllIIIlIIlI(Equipment.contains(iArr16) ? 1 : 0)) {
                    bv.add(new C0003d(lIIIlllIIl[22], lIIIlllIIl[1], lIIIlllIIl[66]));
                    "".length();
                }
            }
            if (llllIIIlIIII(bu ? 1 : 0)) {
                int[] iArr17 = new int[lIIIlllIIl[1]];
                iArr17[lIIIlllIIl[0]] = lIIIlllIIl[16];
                if (llllIIIlIIII(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIIIlllIIl[1]];
                    iArr18[lIIIlllIIl[0]] = lIIIlllIIl[16];
                    if (llllIIIlIIIl(Bank.getFirst(iArr18).getQuantity(), lIIIlllIIl[61])) {
                        int i5 = lIIIlllIIl[16];
                        int i6 = lIIIlllIIl[61];
                        int[] iArr19 = new int[lIIIlllIIl[1]];
                        iArr19[lIIIlllIIl[0]] = lIIIlllIIl[16];
                        bv.add(new C0003d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), lIIIlllIIl[58]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIIIlllIIl[1]];
                iArr20[lIIIlllIIl[0]] = lIIIlllIIl[16];
                if (llllIIIlIIlI(Bank.contains(iArr20) ? 1 : 0)) {
                    bv.add(new C0003d(lIIIlllIIl[16], lIIIlllIIl[61], lIIIlllIIl[58]));
                    "".length();
                }
                int[] iArr21 = new int[lIIIlllIIl[1]];
                iArr21[lIIIlllIIl[0]] = lIIIlllIIl[23];
                if (llllIIIlIIII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIIlllIIl[1]];
                    iArr22[lIIIlllIIl[0]] = lIIIlllIIl[23];
                    if (llllIIIlIIIl(Bank.getFirst(iArr22).getQuantity(), lIIIlllIIl[66])) {
                        int i7 = lIIIlllIIl[23];
                        int i8 = lIIIlllIIl[66];
                        int[] iArr23 = new int[lIIIlllIIl[1]];
                        iArr23[lIIIlllIIl[0]] = lIIIlllIIl[23];
                        bv.add(new C0003d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), lIIIlllIIl[6]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[lIIIlllIIl[1]];
                iArr24[lIIIlllIIl[0]] = lIIIlllIIl[23];
                if (llllIIIlIIlI(Bank.contains(iArr24) ? 1 : 0)) {
                    bv.add(new C0003d(lIIIlllIIl[23], lIIIlllIIl[66], lIIIlllIIl[6]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[lIIIlllIIl[1]];
        iArr25[lIIIlllIIl[0]] = lIIIlllIIl[20];
        if (llllIIIlIIlI(Bank.contains(iArr25) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlllIIl[20], lIIIlllIIl[67], lIIIlllIIl[68]));
            "".length();
        }
        if (llllIIIlIIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIllIlll[lIIIlllIIl[74]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlllIIl[69], lIIIlllIIl[19], lIIIlllIIl[70]));
            "".length();
        }
        int[] iArr26 = new int[lIIIlllIIl[1]];
        iArr26[lIIIlllIIl[0]] = lIIIlllIIl[71];
        if (llllIIIlIIlI(Bank.contains(iArr26) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlllIIl[71], lIIIlllIIl[33], lIIIlllIIl[72]));
            "".length();
        }
        int[] iArr27 = new int[lIIIlllIIl[1]];
        iArr27[lIIIlllIIl[0]] = lIIIlllIIl[18];
        if (llllIIIlIIlI(Bank.contains(iArr27) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlllIIl[18], lIIIlllIIl[33], lIIIlllIIl[72]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[2])) {
            ?? r0 = lIIIlllIIl[1];
            "".length();
            return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIlllIIl[0];
    }

    private static void aa() {
        if (llllIIIllIIl(llllIIIllIII(C0004e.u(), 30.0d))) {
            int[] iArr = new int[lIIIlllIIl[1]];
            iArr[lIIIlllIIl[0]] = lIIIlllIIl[20];
            if (llllIIIlIIII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIlllIIl[1]];
                iArr2[lIIIlllIIl[0]] = lIIIlllIIl[20];
                Inventory.getFirst(iArr2).interact(lIIIllIlll[lIIIlllIIl[43]]);
                Time.sleepTicks(lIIIlllIIl[1]);
                "".length();
            }
        }
        if (llllIIIlIlll(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (llllIIIlIIII(npc.getName().contains(lIIIllIlll[lIIIlllIIl[75]]) ? 1 : 0) && llllIIIlIIlI(npc.isDead() ? 1 : 0)) {
                    ?? r0 = lIIIlllIIl[1];
                    "".length();
                    return ((10 ^ 90) & ((92 ^ 12) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIIlllIIl[0];
            });
            String[] strArr = new String[lIIIlllIIl[3]];
            strArr[lIIIlllIIl[0]] = lIIIllIlll[lIIIlllIIl[44]];
            strArr[lIIIlllIIl[1]] = lIIIllIlll[lIIIlllIIl[45]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (llllIIIllIlI(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = lIIIlllIIl[1];
                    "".length();
                    return "   ".length() <= ((108 ^ 87) & ((163 ^ 152) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIIlllIIl[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[lIIIlllIIl[1]];
            iArr3[lIIIlllIIl[0]] = lIIIlllIIl[46];
            if (llllIIIlIIII(Equipment.contains(iArr3) ? 1 : 0) && llllIIIlIIlI(ad() ? 1 : 0)) {
                ae();
            }
            if (llllIIIlIIll(nearest) && llllIIIlIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                nearest.interact(lIIIllIlll[lIIIlllIIl[47]]);
                Time.sleepTicks(lIIIlllIIl[4]);
                "".length();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (llllIIIlIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01cf, code lost:
        if (llllIIIlIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0266, code lost:
        if (llllIIIlIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x033e, code lost:
        if (llllIIIlIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
        if (llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[21])) {
            int[] iArr = new int[lIIIlllIIl[1]];
            iArr[lIIIlllIIl[0]] = lIIIlllIIl[9];
            if (llllIIIlIIII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIlllIIl[1]];
                iArr2[lIIIlllIIl[0]] = lIIIlllIIl[13];
                if (llllIIIlIIII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIIlllIIl[1]];
                    iArr3[lIIIlllIIl[0]] = lIIIlllIIl[11];
                    if (llllIIIlIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIIlllIIl[1]];
                        iArr4[lIIIlllIIl[0]] = lIIIlllIIl[14];
                        if (llllIIIlIIII(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIIIlllIIl[1]];
                            iArr5[lIIIlllIIl[0]] = lIIIlllIIl[20];
                            if (llllIIIlIIII(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIIlllIIl[1]];
                                iArr6[lIIIlllIIl[0]] = lIIIlllIIl[46];
                                if (llllIIIlIIlI(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIIIlllIIl[1]];
                                    iArr7[lIIIlllIIl[0]] = lIIIlllIIl[46];
                                }
                                ?? r0 = lIIIlllIIl[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return lIIIlllIIl[0];
        } else if (llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[21]) && llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[8])) {
            int[] iArr8 = new int[lIIIlllIIl[1]];
            iArr8[lIIIlllIIl[0]] = lIIIlllIIl[13];
            if (llllIIIlIIII(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIIlllIIl[1]];
                iArr9[lIIIlllIIl[0]] = lIIIlllIIl[11];
                if (llllIIIlIIII(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIlllIIl[1]];
                    iArr10[lIIIlllIIl[0]] = lIIIlllIIl[14];
                    if (llllIIIlIIII(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIIlllIIl[1]];
                        iArr11[lIIIlllIIl[0]] = lIIIlllIIl[16];
                        if (llllIIIlIIII(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIIlllIIl[1]];
                            iArr12[lIIIlllIIl[0]] = lIIIlllIIl[46];
                            if (llllIIIlIIlI(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIIIlllIIl[1]];
                                iArr13[lIIIlllIIl[0]] = lIIIlllIIl[46];
                            }
                            ?? r02 = lIIIlllIIl[1];
                            "".length();
                            return 0 != 0 ? ((((82 + 100) - 58) + 36) ^ (((108 + 37) - 87) + 111)) & (((73 ^ 120) ^ (187 ^ 131)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return lIIIlllIIl[0];
        } else if (llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[8]) && llllIIIlIIlI(bu ? 1 : 0)) {
            int[] iArr14 = new int[lIIIlllIIl[1]];
            iArr14[lIIIlllIIl[0]] = lIIIlllIIl[22];
            if (llllIIIlIIlI(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIIlllIIl[1]];
                iArr15[lIIIlllIIl[0]] = lIIIlllIIl[22];
            }
            int[] iArr16 = new int[lIIIlllIIl[1]];
            iArr16[lIIIlllIIl[0]] = lIIIlllIIl[24];
            if (llllIIIlIIII(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIIIlllIIl[1]];
                iArr17[lIIIlllIIl[0]] = lIIIlllIIl[38];
                if (llllIIIlIIII(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIIIlllIIl[1];
                    "".length();
                    return (-"   ".length()) >= 0 ? ((148 ^ 183) ^ (55 ^ 32)) & (((((43 + 92) - 101) + 97) ^ (((175 + 122) - 189) + 75)) ^ (-" ".length())) : r03;
                }
            }
            return lIIIlllIIl[0];
        } else if (llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[8]) && llllIIIlIIII(bu ? 1 : 0)) {
            int[] iArr18 = new int[lIIIlllIIl[1]];
            iArr18[lIIIlllIIl[0]] = lIIIlllIIl[22];
            if (llllIIIlIIlI(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIIlllIIl[1]];
                iArr19[lIIIlllIIl[0]] = lIIIlllIIl[22];
            }
            int[] iArr20 = new int[lIIIlllIIl[1]];
            iArr20[lIIIlllIIl[0]] = lIIIlllIIl[16];
            if (llllIIIlIIII(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIIIlllIIl[1]];
                iArr21[lIIIlllIIl[0]] = lIIIlllIIl[23];
                if (llllIIIlIIII(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIIlllIIl[1]];
                    iArr22[lIIIlllIIl[0]] = lIIIlllIIl[23];
                    if (llllIIIlIlIl(Inventory.getFirst(iArr22).getQuantity(), lIIIlllIIl[19])) {
                        int[] iArr23 = new int[lIIIlllIIl[1]];
                        iArr23[lIIIlllIIl[0]] = lIIIlllIIl[24];
                        if (llllIIIlIIII(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIIIlllIIl[1]];
                            iArr24[lIIIlllIIl[0]] = lIIIlllIIl[38];
                            if (llllIIIlIIII(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIIIlllIIl[1];
                                "".length();
                                return "   ".length() == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r04;
                            }
                        }
                    }
                }
            }
            return lIIIlllIIl[0];
        } else {
            return lIIIlllIIl[0];
        }
    }

    private static boolean llllIIIllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llllIIIlIlII(int i) {
        return i > 0;
    }

    private static boolean llllIIIlIllI(int i, int i2) {
        return i == i2;
    }

    private static boolean llllIIIlIlIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean llllIIIlIIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v366, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v398, types: [boolean] */
    public static void Y() {
        if (llllIIIlIIII(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[0]];
            C0001b.a(bv);
            if (llllIIIlIIIl(bv.size(), lIIIlllIIl[1])) {
                System.out.println(lIIIllIlll[lIIIlllIIl[1]]);
                bt = lIIIlllIIl[0];
            }
        }
        if (llllIIIlIIlI(bt ? 1 : 0) && llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[2])) {
            if (llllIIIlIIlI(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llllIIIlIIll(nearest) && llllIIIlIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[3]];
                    C0000a.a(nearest);
                }
                if (llllIIIlIIll(nearest) && llllIIIlIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[4]];
                    if (llllIIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIlllIIl[5]);
                        "".length();
                        Time.sleepTicks(lIIIlllIIl[6]);
                        "".length();
                    }
                    if (llllIIIlIIII(Bank.isOpen() ? 1 : 0)) {
                        if (llllIIIlIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIlllIIl[7]);
                            "".length();
                        }
                        while (llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[8]) && llllIIIlIIlI(v.aX() ? 1 : 0)) {
                            v.aV();
                            Time.sleepTicks(lIIIlllIIl[1]);
                            "".length();
                            "".length();
                            if (0 != 0) {
                                return;
                            }
                        }
                        if (llllIIIlIIlI(ac() ? 1 : 0)) {
                            af();
                            System.out.println(lIIIllIlll[lIIIlllIIl[7]]);
                            bt = lIIIlllIIl[1];
                            return;
                        }
                        if (llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[8])) {
                            int[] iArr = new int[lIIIlllIIl[1]];
                            iArr[lIIIlllIIl[0]] = lIIIlllIIl[9];
                            if (llllIIIlIIII(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIIIlllIIl[1]];
                                iArr2[lIIIlllIIl[0]] = lIIIlllIIl[9];
                                if (llllIIIlIIIl(Inventory.getCount(iArr2), lIIIlllIIl[1])) {
                                    Bank.withdraw(lIIIlllIIl[9], lIIIlllIIl[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[lIIIlllIIl[1]];
                                        iArr3[lIIIlllIIl[0]] = lIIIlllIIl[9];
                                        if (llllIIIlIlII(Inventory.getCount(iArr3))) {
                                            ?? r0 = lIIIlllIIl[1];
                                            "".length();
                                            return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIIlllIIl[0];
                                    }, lIIIlllIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[lIIIlllIIl[1]];
                            iArr3[lIIIlllIIl[0]] = lIIIlllIIl[11];
                            if (llllIIIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIIIlllIIl[1]];
                                iArr4[lIIIlllIIl[0]] = lIIIlllIIl[11];
                                if (llllIIIlIIIl(Inventory.getCount(iArr4), lIIIlllIIl[1])) {
                                    Bank.withdraw(lIIIlllIIl[11], lIIIlllIIl[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[lIIIlllIIl[1]];
                                        iArr5[lIIIlllIIl[0]] = lIIIlllIIl[11];
                                        if (llllIIIlIlII(Inventory.getCount(iArr5))) {
                                            ?? r0 = lIIIlllIIl[1];
                                            "".length();
                                            return (-" ".length()) > 0 ? ((192 ^ 177) ^ (241 ^ 135)) & (((((136 + 186) - 190) + 63) ^ (((72 + 134) - 17) + 7)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIIlllIIl[0];
                                    }, lIIIlllIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[lIIIlllIIl[1]];
                            iArr5[lIIIlllIIl[0]] = lIIIlllIIl[13];
                            if (llllIIIlIIII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIIlllIIl[1]];
                                iArr6[lIIIlllIIl[0]] = lIIIlllIIl[13];
                                if (llllIIIlIIIl(Inventory.getCount(iArr6), lIIIlllIIl[1])) {
                                    Bank.withdraw(lIIIlllIIl[13], lIIIlllIIl[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[lIIIlllIIl[1]];
                                        iArr7[lIIIlllIIl[0]] = lIIIlllIIl[13];
                                        if (llllIIIlIlII(Inventory.getCount(iArr7))) {
                                            ?? r0 = lIIIlllIIl[1];
                                            "".length();
                                            return " ".length() < 0 ? ((191 ^ 144) ^ (117 ^ 106)) & (((((73 + 66) - 28) + 46) ^ (((9 + 50) - 5) + 119)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIIlllIIl[0];
                                    }, lIIIlllIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[lIIIlllIIl[1]];
                            iArr7[lIIIlllIIl[0]] = lIIIlllIIl[14];
                            if (llllIIIlIIII(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIIIlllIIl[1]];
                                iArr8[lIIIlllIIl[0]] = lIIIlllIIl[14];
                                if (llllIIIlIIIl(Inventory.getCount(iArr8), lIIIlllIIl[1])) {
                                    Bank.withdraw(lIIIlllIIl[14], lIIIlllIIl[15], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[lIIIlllIIl[1]];
                                        iArr9[lIIIlllIIl[0]] = lIIIlllIIl[14];
                                        if (llllIIIlIlII(Inventory.getCount(iArr9))) {
                                            ?? r0 = lIIIlllIIl[1];
                                            "".length();
                                            return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIIlllIIl[0];
                                    }, lIIIlllIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[lIIIlllIIl[1]];
                            iArr9[lIIIlllIIl[0]] = lIIIlllIIl[16];
                            if (llllIIIlIIII(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIIIlllIIl[1]];
                                iArr10[lIIIlllIIl[0]] = lIIIlllIIl[16];
                                if (llllIIIlIIIl(Inventory.getCount(iArr10), lIIIlllIIl[1])) {
                                    Bank.withdraw(lIIIlllIIl[16], lIIIlllIIl[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[lIIIlllIIl[1]];
                                        iArr11[lIIIlllIIl[0]] = lIIIlllIIl[16];
                                        if (llllIIIlIlII(Inventory.getCount(iArr11))) {
                                            ?? r0 = lIIIlllIIl[1];
                                            "".length();
                                            return "  ".length() >= "   ".length() ? ((50 ^ 127) ^ (49 ^ 58)) & (((247 ^ 150) ^ (231 ^ 192)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIIlllIIl[0];
                                    }, lIIIlllIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[lIIIlllIIl[1]];
                            iArr11[lIIIlllIIl[0]] = lIIIlllIIl[17];
                            if (llllIIIlIIII(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIIIlllIIl[1]];
                                iArr12[lIIIlllIIl[0]] = lIIIlllIIl[17];
                                if (llllIIIlIIlI(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(lIIIlllIIl[17], lIIIlllIIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[lIIIlllIIl[1]];
                                        iArr13[lIIIlllIIl[0]] = lIIIlllIIl[17];
                                        return Inventory.contains(iArr13);
                                    }, lIIIlllIIl[5]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(lIIIlllIIl[18], lIIIlllIIl[19], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[lIIIlllIIl[1]];
                            iArr13[lIIIlllIIl[0]] = lIIIlllIIl[20];
                            if (llllIIIlIIII(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lIIIlllIIl[1]];
                                iArr14[lIIIlllIIl[0]] = lIIIlllIIl[20];
                                if (llllIIIlIIIl(Inventory.getCount(iArr14), lIIIlllIIl[1]) && llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[21])) {
                                    Bank.withdrawAll(lIIIlllIIl[20], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[lIIIlllIIl[1]];
                                        iArr15[lIIIlllIIl[0]] = lIIIlllIIl[20];
                                        if (llllIIIlIlII(Inventory.getCount(iArr15))) {
                                            ?? r0 = lIIIlllIIl[1];
                                            "".length();
                                            return 0 != 0 ? ((62 ^ 16) ^ "  ".length()) & (((26 ^ 28) ^ (53 ^ 31)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIIlllIIl[0];
                                    }, lIIIlllIIl[5]);
                                    "".length();
                                }
                            }
                        }
                        if (llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[8])) {
                            int[] iArr15 = new int[lIIIlllIIl[1]];
                            iArr15[lIIIlllIIl[0]] = lIIIlllIIl[22];
                            if (llllIIIlIIlI(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(lIIIlllIIl[22], lIIIlllIIl[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIlllIIl[1]);
                                "".length();
                            }
                            if (llllIIIlIIII(bu ? 1 : 0)) {
                                Bank.withdrawAll(lIIIlllIIl[23], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIlllIIl[1]);
                                "".length();
                                Bank.withdrawAll(lIIIlllIIl[16], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIlllIIl[1]);
                                "".length();
                            }
                            Time.sleepTicks(lIIIlllIIl[4]);
                            "".length();
                            Bank.withdrawAll(lIIIlllIIl[24], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIIIlllIIl[1]);
                            "".length();
                            Bank.withdrawAll(lIIIlllIIl[25], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(lIIIlllIIl[1]);
                            "".length();
                        }
                    }
                }
            }
            if (llllIIIlIIII(ab() ? 1 : 0)) {
                if (llllIIIlIIII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[21])) {
                    if (llllIIIlIIlI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[19]];
                        Movement.walkTo(bx);
                        "".length();
                        Time.sleepTicks(lIIIlllIIl[1]);
                        "".length();
                    }
                    if (llllIIIlIIII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[6]];
                        aa();
                    }
                }
                if (llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[21]) && llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[26])) {
                    AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[27]];
                    if (llllIIIlIllI(Players.getLocal().getAnimation(), lIIIlllIIl[28])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(lIIIlllIIl[1]);
                        "".length();
                    }
                }
                if (llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[26]) && llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[29])) {
                    AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[30]];
                    if (llllIIIlIllI(Players.getLocal().getAnimation(), lIIIlllIIl[28])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(lIIIlllIIl[1]);
                        "".length();
                    }
                }
                if (llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[29]) && llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[31])) {
                    AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[32]];
                    if (llllIIIlIllI(Players.getLocal().getAnimation(), lIIIlllIIl[28])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(lIIIlllIIl[1]);
                        "".length();
                    }
                }
                if (llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[31]) && llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[8])) {
                    AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[33]];
                    if (llllIIIlIllI(Players.getLocal().getAnimation(), lIIIlllIIl[28])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(lIIIlllIIl[1]);
                        "".length();
                    }
                }
                if (llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[8])) {
                    AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[34]];
                    if (llllIIIlIlll(by)) {
                        by = new WorldPoint(lIIIlllIIl[35] + C0004e.c(lIIIlllIIl[1], lIIIlllIIl[7]), lIIIlllIIl[36], lIIIlllIIl[0]);
                    }
                    int[] iArr16 = new int[lIIIlllIIl[1]];
                    iArr16[lIIIlllIIl[0]] = lIIIlllIIl[22];
                    if (llllIIIlIIII(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIIIlllIIl[1]];
                        iArr17[lIIIlllIIl[0]] = lIIIlllIIl[22];
                        if (llllIIIlIIlI(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIIIlllIIl[1]];
                            iArr18[lIIIlllIIl[0]] = lIIIlllIIl[22];
                            Inventory.getFirst(iArr18).interact(lIIIllIlll[lIIIlllIIl[37]]);
                            Time.sleepTicks(lIIIlllIIl[1]);
                            "".length();
                        }
                    }
                    if (llllIIIlIIII(GrandExchange.isOpen() ? 1 : 0)) {
                        C0001b.g();
                    }
                    int[] iArr19 = new int[lIIIlllIIl[1]];
                    iArr19[lIIIlllIIl[0]] = lIIIlllIIl[24];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[lIIIlllIIl[1]];
                    iArr20[lIIIlllIIl[0]] = lIIIlllIIl[38];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (llllIIIlIIlI(bu ? 1 : 0) && llllIIIlIIll(by)) {
                        if (llllIIIlIIlI(Players.getLocal().getWorldLocation().equals(by) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[39]];
                            Movement.walkTo(by);
                            "".length();
                            Time.sleepTicks(lIIIlllIIl[1]);
                            "".length();
                        }
                        if (llllIIIlIIII(Players.getLocal().getWorldLocation().equals(by) ? 1 : 0) && llllIIIlIIll(first) && llllIIIlIIll(first2) && llllIIIlIllI(Players.getLocal().getAnimation(), lIIIlllIIl[28])) {
                            int experience = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (llllIIIllIll(Skills.getExperience(Skill.MAGIC), experience)) {
                                    ?? r0 = lIIIlllIIl[1];
                                    "".length();
                                    return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIIlllIIl[0];
                            }, lIIIlllIIl[10]);
                            "".length();
                        }
                    }
                    if (llllIIIlIIII(bu ? 1 : 0)) {
                        if (llllIIIlIIll(first) && llllIIIlIIll(first2) && llllIIIlIllI(Players.getLocal().getAnimation(), lIIIlllIIl[28])) {
                            int experience2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (llllIIIllIll(Skills.getExperience(Skill.MAGIC), experience2)) {
                                    ?? r0 = lIIIlllIIl[1];
                                    "".length();
                                    return "   ".length() < 0 ? ((13 ^ 65) ^ (62 ^ 48)) & (((232 ^ 144) ^ (117 ^ 79)) ^ (-" ".length())) : r0;
                                }
                                return lIIIlllIIl[0];
                            }, lIIIlllIIl[10]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (llllIIIlIllI(Players.getLocal().getAnimation(), lIIIlllIIl[28])) {
                                ?? r0 = lIIIlllIIl[1];
                                "".length();
                                return (-(77 ^ 73)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIIlllIIl[0];
                        }, lIIIlllIIl[40]);
                        "".length();
                    }
                }
            }
        }
    }

    public static void Z() {
        if (llllIIIlIIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llllIIIlIIlI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[41]];
            Movement.walkTo(bx);
            "".length();
            Time.sleepTicks(lIIIlllIIl[1]);
            "".length();
        }
        if (llllIIIlIIII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[42]];
            aa();
        }
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            Y();
            "".length();
            if (" ".length() <= 0) {
                return (0 ^ 16) & ((119 ^ 103) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIlllIIl[67];
    }

    private static boolean llllIIIlIIIl(int i, int i2) {
        return i < i2;
    }

    public static void ae() {
        if (llllIIIlIIll(Widgets.get(lIIIlllIIl[49], lIIIlllIIl[50]))) {
            AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[51]];
            Widgets.get(lIIIlllIIl[49], lIIIlllIIl[50]).interact(lIIIllIlll[lIIIlllIIl[52]]);
            Time.sleepTicks(lIIIlllIIl[7]);
            "".length();
        }
        if (llllIIIlIlll(Widgets.get(lIIIlllIIl[49], lIIIlllIIl[50])) && llllIIIlIIlI(Widgets.get(lIIIlllIIl[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(lIIIlllIIl[1]);
            "".length();
            if (llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[19])) {
                Widgets.get(lIIIlllIIl[53], lIIIlllIIl[1]).getChild(lIIIlllIIl[1]).interact(lIIIllIlll[lIIIlllIIl[54]]);
            }
            if (llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[32]) && llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[19])) {
                Widgets.get(lIIIlllIIl[53], lIIIlllIIl[1]).getChild(lIIIlllIIl[3]).interact(lIIIllIlll[lIIIlllIIl[55]]);
            }
            if (llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[32]) && llllIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[39])) {
                Widgets.get(lIIIlllIIl[53], lIIIlllIIl[1]).getChild(lIIIlllIIl[4]).interact(lIIIllIlll[lIIIlllIIl[56]]);
            }
            if (llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[32])) {
                int[] iArr = new int[lIIIlllIIl[1]];
                iArr[lIIIlllIIl[0]] = lIIIlllIIl[14];
                if (llllIIIlIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(lIIIlllIIl[53], lIIIlllIIl[1]).getChild(lIIIlllIIl[4]).interact(lIIIllIlll[lIIIlllIIl[21]]);
                }
            }
            if (llllIIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIlllIIl[39])) {
                int[] iArr2 = new int[lIIIlllIIl[1]];
                iArr2[lIIIlllIIl[0]] = lIIIlllIIl[14];
                if (llllIIIlIIII(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(lIIIlllIIl[53], lIIIlllIIl[1]).getChild(lIIIlllIIl[7]).interact(lIIIllIlll[lIIIlllIIl[50]]);
                }
            }
            Time.sleepTicks(lIIIlllIIl[1]);
            "".length();
        }
    }

    private static int llllIIIllIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llllIIIlIlll(Object obj) {
        return obj == null;
    }
}
