package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
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
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.i  reason: invalid package and case insensitive filesystem */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/i.class */
public class C0008i implements M {
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ int[] lIIIllllIIIII;
    static /* synthetic */ WorldPoint bC;
    static /* synthetic */ WorldArea bB;
    static /* synthetic */ WorldPoint bD;
    public static /* synthetic */ List<C0003d> bA;
    private static /* synthetic */ String[] lIIIlllIllIll;
    public static /* synthetic */ boolean by;

    private static boolean lIlIIlIlIIllIlI(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIIlIlIIlllIl(Object obj) {
        return obj == null;
    }

    public static void V() {
        if (lIlIIlIlIIlIlll(Widgets.get(lIIIllllIIIII[49], lIIIllllIIIII[50]))) {
            AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[51]];
            Widgets.get(lIIIllllIIIII[49], lIIIllllIIIII[50]).interact(lIIIlllIllIll[lIIIllllIIIII[52]]);
            Time.sleepTicks(lIIIllllIIIII[5]);
            "".length();
        }
        if (lIlIIlIlIIlllIl(Widgets.get(lIIIllllIIIII[49], lIIIllllIIIII[50])) && lIlIIlIlIIlIllI(Widgets.get(lIIIllllIIIII[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(lIIIllllIIIII[1]);
            "".length();
            if (lIlIIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[17])) {
                Widgets.get(lIIIllllIIIII[53], lIIIllllIIIII[1]).getChild(lIIIllllIIIII[1]).interact(lIIIlllIllIll[lIIIllllIIIII[54]]);
            }
            if (lIlIIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[31]) && lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[17])) {
                Widgets.get(lIIIllllIIIII[53], lIIIllllIIIII[1]).getChild(lIIIllllIIIII[2]).interact(lIIIlllIllIll[lIIIllllIIIII[55]]);
            }
            if (lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[31]) && lIlIIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[36])) {
                Widgets.get(lIIIllllIIIII[53], lIIIllllIIIII[1]).getChild(lIIIllllIIIII[3]).interact(lIIIlllIllIll[lIIIllllIIIII[19]]);
            }
            if (lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[31])) {
                int[] iArr = new int[lIIIllllIIIII[1]];
                iArr[lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                if (lIlIIlIlIIlIllI(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(lIIIllllIIIII[53], lIIIllllIIIII[1]).getChild(lIIIllllIIIII[3]).interact(lIIIlllIllIll[lIIIllllIIIII[50]]);
                }
            }
            if (lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[36])) {
                int[] iArr2 = new int[lIIIllllIIIII[1]];
                iArr2[lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                if (lIlIIlIlIIlIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(lIIIllllIIIII[53], lIIIllllIIIII[1]).getChild(lIIIllllIIIII[5]).interact(lIIIlllIllIll[lIIIllllIIIII[56]]);
                }
            }
            Time.sleepTicks(lIIIllllIIIII[1]);
            "".length();
        }
    }

    private static boolean lIlIIlIlIIlIllI(int i2) {
        return i2 == 0;
    }

    private static boolean lIlIIlIlIIlllll(int i2, int i3) {
        return i2 > i3;
    }

    private static String lIlIIlIIlllIlII(String lllllllllllllllIIIIIlIIIIlIllIIl, String lllllllllllllllIIIIIlIIIIlIllIII) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlIIIIlIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIIIIlIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIllllIIIII[2], lllllllllllllllIIIIIlIIIIlIlllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIIIIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlIIIIlIllIlI) {
            lllllllllllllllIIIIIlIIIIlIllIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlIIlIIlllIIlI(String lllllllllllllllIIIIIlIIIIllllIll, String lllllllllllllllIIIIIlIIIIllllIlI) {
        String lllllllllllllllIIIIIlIIIIllllIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIlIIIIllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIIIIlIIIIllllIII = lllllllllllllllIIIIIlIIIIllllIlI.toCharArray();
        int lllllllllllllllIIIIIlIIIIlllIlll = lIIIllllIIIII[0];
        char[] charArray = lllllllllllllllIIIIIlIIIIllllIll2.toCharArray();
        int length = charArray.length;
        int i2 = lIIIllllIIIII[0];
        while (lIlIIlIlIIlIlIl(i2, length)) {
            char lllllllllllllllIIIIIlIIIIlllllII = charArray[i2];
            sb.append((char) (lllllllllllllllIIIIIlIIIIlllllII ^ lllllllllllllllIIIIIlIIIIllllIII[lllllllllllllllIIIIIlIIIIlllIlll % lllllllllllllllIIIIIlIIIIllllIII.length]));
            "".length();
            lllllllllllllllIIIIIlIIIIlllIlll++;
            i2++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIIlIlIIlIIll() {
        lIIIllllIIIII = new int[82];
        lIIIllllIIIII[0] = (175 ^ 188) & ((6 ^ 21) ^ (-1));
        lIIIllllIIIII[1] = " ".length();
        lIIIllllIIIII[2] = "  ".length();
        lIIIllllIIIII[3] = "   ".length();
        lIIIllllIIIII[4] = (-((-7177) & 31850)) & (-2049) & 31721;
        lIIIllllIIIII[5] = 156 ^ 152;
        lIIIllllIIIII[6] = (90 ^ 7) ^ (65 ^ 43);
        lIIIllllIIIII[7] = (-((-65) & 32209)) & (-2) & 32703;
        lIIIllllIIIII[8] = (-14339) & 15838;
        lIIIllllIIIII[9] = (-((-1035) & 24027)) & (-1025) & 24571;
        lIIIllllIIIII[10] = (-((-8799) & 9823)) & (-16946) & 20469;
        lIIIllllIIIII[11] = (-14417) & 14973;
        lIIIllllIIIII[12] = (-17622) & 18175;
        lIIIllllIIIII[13] = (-3145) & 7644;
        lIIIllllIIIII[14] = (-((-1591) & 26623)) & (-2053) & 27647;
        lIIIllllIIIII[15] = (-((-11) & 18991)) & (-1027) & 32631;
        lIIIllllIIIII[16] = (-((-11073) & 27511)) & (-1) & 24447;
        lIIIllllIIIII[17] = 37 ^ 32;
        lIIIllllIIIII[18] = (-((-41) & 21033)) & (-8325) & 29695;
        lIIIllllIIIII[19] = (250 ^ 180) ^ (149 ^ 194);
        lIIIllllIIIII[20] = (-((-1619) & 32471)) & (-529) & 32767;
        lIIIllllIIIII[21] = (-((-6161) & 7249)) & (-18707) & 20350;
        lIIIllllIIIII[22] = (-((-24723) & 31967)) & (-257) & 8061;
        lIIIllllIIIII[23] = (45 ^ 11) ^ (165 ^ 189);
        lIIIllllIIIII[24] = 30 ^ 24;
        lIIIllllIIIII[25] = (((7 + 127) - 77) + 134) ^ (((8 + 112) - 109) + 149);
        lIIIllllIIIII[26] = (220 ^ 179) ^ (212 ^ 188);
        lIIIllllIIIII[27] = -" ".length();
        lIIIllllIIIII[28] = 28 ^ 57;
        lIIIllllIIIII[29] = 140 ^ 132;
        lIIIllllIIIII[30] = 169 ^ 132;
        lIIIllllIIIII[31] = (80 ^ 118) ^ (49 ^ 30);
        lIIIllllIIIII[32] = 16 ^ 26;
        lIIIllllIIIII[33] = 73 ^ 66;
        lIIIllllIIIII[34] = 12 ^ 0;
        lIIIllllIIIII[35] = (19 ^ 56) ^ (139 ^ 159);
        lIIIllllIIIII[36] = 191 ^ 178;
        lIIIllllIIIII[37] = (-5281) & 5600;
        lIIIllllIIIII[38] = (-((-4097) & 32238)) & (-4097) & 32767;
        lIIIllllIIIII[39] = (-((-7281) & 31859)) & (-594) & 28671;
        lIIIllllIIIII[40] = 115 ^ 125;
        lIIIllllIIIII[41] = (((155 + 57) - 175) + 137) ^ (((35 + 40) - 8) + 94);
        lIIIllllIIIII[42] = 111 ^ 127;
        lIIIllllIIIII[43] = 12 ^ 29;
        lIIIllllIIIII[44] = (-14851) & 16231;
        lIIIllllIIIII[45] = (101 ^ 69) ^ (94 ^ 108);
        lIIIllllIIIII[46] = (153 ^ 194) ^ (17 ^ 89);
        lIIIllllIIIII[47] = 131 ^ 151;
        lIIIllllIIIII[48] = (-((-1053) & 7935)) & (-25610) & 32767;
        lIIIllllIIIII[49] = (-((-141) & 5261)) & (-25001) & 30713;
        lIIIllllIIIII[50] = 33 ^ 59;
        lIIIllllIIIII[51] = 184 ^ 173;
        lIIIllllIIIII[52] = 135 ^ 145;
        lIIIllllIIIII[53] = ((23 + 97) - 94) + 175;
        lIIIllllIIIII[54] = (((6 + 120) - 103) + 128) ^ (((45 + 53) - 22) + 52);
        lIIIllllIIIII[55] = (126 ^ 85) ^ (186 ^ 137);
        lIIIllllIIIII[56] = (86 ^ 61) ^ (120 ^ 8);
        lIIIllllIIIII[57] = (-4117) & 5116;
        lIIIllllIIIII[58] = ((101 + 104) - 125) + 90;
        lIIIllllIIIII[59] = (-4177) & 8176;
        lIIIllllIIIII[60] = (-((-25) & 2106)) & (-24577) & 28657;
        lIIIllllIIIII[61] = (-(16 ^ 22)) & (-16449) & 19453;
        lIIIllllIIIII[62] = (-(171 ^ 130)) & (-19457) & 31996;
        lIIIllllIIIII[63] = (-16931) & 32430;
        lIIIllllIIIII[64] = (10 ^ 77) ^ (112 ^ 79);
        lIIIllllIIIII[65] = (((182 ^ 156) + (33 ^ 19)) - (104 ^ 102)) + (16 ^ 88);
        lIIIllllIIIII[66] = (-65) & 15064;
        lIIIllllIIIII[67] = 240 ^ 148;
        lIIIllllIIIII[68] = (-49) & 12028;
        lIIIllllIIIII[69] = (-2130) & 27129;
        lIIIllllIIIII[70] = (-((-2311) & 18839)) & (-9) & 24543;
        lIIIllllIIIII[71] = (-1075) & 1974;
        lIIIllllIIIII[72] = (247 ^ 165) ^ (45 ^ 99);
        lIIIllllIIIII[73] = (182 ^ 175) ^ (7 ^ 125);
        lIIIllllIIIII[74] = 60 ^ 33;
        lIIIllllIIIII[75] = 54 ^ 40;
        lIIIllllIIIII[76] = (-25634) & 28655;
        lIIIllllIIIII[77] = (-12301) & 15599;
        lIIIllllIIIII[78] = (-25601) & 28631;
        lIIIllllIIIII[79] = (-16919) & 20223;
        lIIIllllIIIII[80] = (-((-9346) & 30599)) & (-161) & 24575;
        lIIIllllIIIII[81] = (-((-2971) & 31739)) & (-1) & 32255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIlIIlIlIIlIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01f9, code lost:
        if (lIlIIlIlIIlIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0279, code lost:
        if (lIlIIlIlIIlIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0368, code lost:
        if (lIlIIlIlIIlIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
    private static boolean T() {
        if (lIlIIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[19])) {
            int[] iArr = new int[lIIIllllIIIII[1]];
            iArr[lIIIllllIIIII[0]] = lIIIllllIIIII[7];
            if (lIlIIlIlIIlIlII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIllllIIIII[1]];
                iArr2[lIIIllllIIIII[0]] = lIIIllllIIIII[11];
                if (lIlIIlIlIIlIlII(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIIllllIIIII[1]];
                    iArr3[lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                    if (lIlIIlIlIIlIlII(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIIllllIIIII[1]];
                        iArr4[lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                        if (lIlIIlIlIIlIlII(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIIIllllIIIII[1]];
                            iArr5[lIIIllllIIIII[0]] = lIIIllllIIIII[18];
                            if (lIlIIlIlIIlIlII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIIllllIIIII[1]];
                                iArr6[lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                if (lIlIIlIlIIlIllI(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIIIllllIIIII[1]];
                                    iArr7[lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                }
                                ?? r0 = lIIIllllIIIII[1];
                                "".length();
                                return "  ".length() > ((237 ^ 155) ^ (125 ^ 15)) ? ((164 ^ 197) ^ (221 ^ 168)) & (((183 ^ 173) ^ (205 ^ 195)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lIIIllllIIIII[0];
        } else if (lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[19]) && lIlIIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[6])) {
            int[] iArr8 = new int[lIIIllllIIIII[1]];
            iArr8[lIIIllllIIIII[0]] = lIIIllllIIIII[11];
            if (lIlIIlIlIIlIlII(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIIllllIIIII[1]];
                iArr9[lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                if (lIlIIlIlIIlIlII(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIllllIIIII[1]];
                    iArr10[lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                    if (lIlIIlIlIIlIlII(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIIllllIIIII[1]];
                        iArr11[lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                        if (lIlIIlIlIIlIlII(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIIllllIIIII[1]];
                            iArr12[lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                            if (lIlIIlIlIIlIllI(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIIIllllIIIII[1]];
                                iArr13[lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                            }
                            ?? r02 = lIIIllllIIIII[1];
                            "".length();
                            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r02;
                        }
                    }
                }
            }
            return lIIIllllIIIII[0];
        } else if (lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[6]) && lIlIIlIlIIlIllI(bz ? 1 : 0)) {
            int[] iArr14 = new int[lIIIllllIIIII[1]];
            iArr14[lIIIllllIIIII[0]] = lIIIllllIIIII[20];
            if (lIlIIlIlIIlIllI(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIIllllIIIII[1]];
                iArr15[lIIIllllIIIII[0]] = lIIIllllIIIII[20];
            }
            int[] iArr16 = new int[lIIIllllIIIII[1]];
            iArr16[lIIIllllIIIII[0]] = lIIIllllIIIII[22];
            if (lIlIIlIlIIlIlII(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIIIllllIIIII[1]];
                iArr17[lIIIllllIIIII[0]] = lIIIllllIIIII[23];
                if (lIlIIlIlIIlIlII(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIIIllllIIIII[1];
                    "".length();
                    return (-" ".length()) == ((((91 + 43) - 2) + 8) ^ (((23 + 60) - 61) + 114)) ? ((114 ^ 34) ^ "   ".length()) & (((((239 + 60) - 284) + 226) ^ (((35 + 128) - 38) + 37)) ^ (-" ".length())) : r03;
                }
            }
            return lIIIllllIIIII[0];
        } else if (lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[6]) && lIlIIlIlIIlIlII(bz ? 1 : 0)) {
            int[] iArr18 = new int[lIIIllllIIIII[1]];
            iArr18[lIIIllllIIIII[0]] = lIIIllllIIIII[20];
            if (lIlIIlIlIIlIllI(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIIllllIIIII[1]];
                iArr19[lIIIllllIIIII[0]] = lIIIllllIIIII[20];
            }
            int[] iArr20 = new int[lIIIllllIIIII[1]];
            iArr20[lIIIllllIIIII[0]] = lIIIllllIIIII[14];
            if (lIlIIlIlIIlIlII(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIIIllllIIIII[1]];
                iArr21[lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                if (lIlIIlIlIIlIlII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIIllllIIIII[1]];
                    iArr22[lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                    if (lIlIIlIlIIllIIl(Bank.getFirst(iArr22).getQuantity(), lIIIllllIIIII[17])) {
                        int[] iArr23 = new int[lIIIllllIIIII[1]];
                        iArr23[lIIIllllIIIII[0]] = lIIIllllIIIII[22];
                        if (lIlIIlIlIIlIlII(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIIIllllIIIII[1]];
                            iArr24[lIIIllllIIIII[0]] = lIIIllllIIIII[23];
                            if (lIlIIlIlIIlIlII(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIIIllllIIIII[1];
                                "".length();
                                return (-" ".length()) >= 0 ? "   ".length() & ("   ".length() ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIIIllllIIIII[0];
        } else {
            return lIIIllllIIIII[0];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIlIIlIlIIlIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01f6, code lost:
        if (lIlIIlIlIIlIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0275, code lost:
        if (lIlIIlIlIIlIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x035b, code lost:
        if (lIlIIlIlIIlIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
    private static boolean S() {
        if (lIlIIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[19])) {
            int[] iArr = new int[lIIIllllIIIII[1]];
            iArr[lIIIllllIIIII[0]] = lIIIllllIIIII[7];
            if (lIlIIlIlIIlIlII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIllllIIIII[1]];
                iArr2[lIIIllllIIIII[0]] = lIIIllllIIIII[11];
                if (lIlIIlIlIIlIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIIllllIIIII[1]];
                    iArr3[lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                    if (lIlIIlIlIIlIlII(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIIllllIIIII[1]];
                        iArr4[lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                        if (lIlIIlIlIIlIlII(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIIIllllIIIII[1]];
                            iArr5[lIIIllllIIIII[0]] = lIIIllllIIIII[18];
                            if (lIlIIlIlIIlIlII(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIIllllIIIII[1]];
                                iArr6[lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                if (lIlIIlIlIIlIllI(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIIIllllIIIII[1]];
                                    iArr7[lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                }
                                ?? r0 = lIIIllllIIIII[1];
                                "".length();
                                return (-" ".length()) > 0 ? ((((102 + 149) - 143) + 123) ^ (((112 + 158) - 260) + 185)) & (((50 ^ 76) ^ (17 ^ 75)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lIIIllllIIIII[0];
        } else if (lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[19]) && lIlIIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[6])) {
            int[] iArr8 = new int[lIIIllllIIIII[1]];
            iArr8[lIIIllllIIIII[0]] = lIIIllllIIIII[11];
            if (lIlIIlIlIIlIlII(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIIllllIIIII[1]];
                iArr9[lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                if (lIlIIlIlIIlIlII(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIllllIIIII[1]];
                    iArr10[lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                    if (lIlIIlIlIIlIlII(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIIllllIIIII[1]];
                        iArr11[lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                        if (lIlIIlIlIIlIlII(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIIllllIIIII[1]];
                            iArr12[lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                            if (lIlIIlIlIIlIllI(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIIIllllIIIII[1]];
                                iArr13[lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                            }
                            ?? r02 = lIIIllllIIIII[1];
                            "".length();
                            return (-(102 ^ 98)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                        }
                    }
                }
            }
            return lIIIllllIIIII[0];
        } else if (lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[6]) && lIlIIlIlIIlIllI(bz ? 1 : 0)) {
            int[] iArr14 = new int[lIIIllllIIIII[1]];
            iArr14[lIIIllllIIIII[0]] = lIIIllllIIIII[20];
            if (lIlIIlIlIIlIllI(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIIllllIIIII[1]];
                iArr15[lIIIllllIIIII[0]] = lIIIllllIIIII[20];
            }
            int[] iArr16 = new int[lIIIllllIIIII[1]];
            iArr16[lIIIllllIIIII[0]] = lIIIllllIIIII[22];
            if (lIlIIlIlIIlIlII(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIIIllllIIIII[1]];
                iArr17[lIIIllllIIIII[0]] = lIIIllllIIIII[35];
                if (lIlIIlIlIIlIlII(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIIIllllIIIII[1];
                    "".length();
                    return ((((9 + 167) - 158) + 153) ^ (((45 + 174) - 142) + 98)) == (-" ".length()) ? ((116 ^ 84) ^ (196 ^ 180)) & (((58 ^ 86) ^ (121 ^ 69)) ^ (-" ".length())) : r03;
                }
            }
            return lIIIllllIIIII[0];
        } else if (lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[6]) && lIlIIlIlIIlIlII(bz ? 1 : 0)) {
            int[] iArr18 = new int[lIIIllllIIIII[1]];
            iArr18[lIIIllllIIIII[0]] = lIIIllllIIIII[20];
            if (lIlIIlIlIIlIllI(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIIllllIIIII[1]];
                iArr19[lIIIllllIIIII[0]] = lIIIllllIIIII[20];
            }
            int[] iArr20 = new int[lIIIllllIIIII[1]];
            iArr20[lIIIllllIIIII[0]] = lIIIllllIIIII[14];
            if (lIlIIlIlIIlIlII(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIIIllllIIIII[1]];
                iArr21[lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                if (lIlIIlIlIIlIlII(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIIllllIIIII[1]];
                    iArr22[lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                    if (lIlIIlIlIIllIIl(Inventory.getFirst(iArr22).getQuantity(), lIIIllllIIIII[17])) {
                        int[] iArr23 = new int[lIIIllllIIIII[1]];
                        iArr23[lIIIllllIIIII[0]] = lIIIllllIIIII[22];
                        if (lIlIIlIlIIlIlII(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIIIllllIIIII[1]];
                            iArr24[lIIIllllIIIII[0]] = lIIIllllIIIII[35];
                            if (lIlIIlIlIIlIlII(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIIIllllIIIII[1];
                                "".length();
                                return (-" ".length()) >= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r04;
                            }
                        }
                    }
                }
            }
            return lIIIllllIIIII[0];
        } else {
            return lIIIllllIIIII[0];
        }
    }

    private static void R() {
        if (lIlIIlIlIIlllII(lIlIIlIlIIllIll(C0004e.v(), 30.0d))) {
            int[] iArr = new int[lIIIllllIIIII[1]];
            iArr[lIIIllllIIIII[0]] = lIIIllllIIIII[18];
            if (lIlIIlIlIIlIlII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIllllIIIII[1]];
                iArr2[lIIIllllIIIII[0]] = lIIIllllIIIII[18];
                Inventory.getFirst(iArr2).interact(lIIIlllIllIll[lIIIllllIIIII[41]]);
                Time.sleepTicks(lIIIllllIIIII[1]);
                "".length();
            }
        }
        if (lIlIIlIlIIlllIl(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIlIIlIlIIlIlII(npc.getName().contains(lIIIlllIllIll[lIIIllllIIIII[75]]) ? 1 : 0) && lIlIIlIlIIlIllI(npc.isDead() ? 1 : 0)) {
                    ?? r0 = lIIIllllIIIII[1];
                    "".length();
                    return (" ".length() & (" ".length() ^ (-1))) == (142 ^ 138) ? (!true) & ((true ^ true) ^ true) : r0;
                }
                return lIIIllllIIIII[0];
            });
            String[] strArr = new String[lIIIllllIIIII[2]];
            strArr[lIIIllllIIIII[0]] = lIIIlllIllIll[lIIIllllIIIII[42]];
            strArr[lIIIllllIIIII[1]] = lIIIlllIllIll[lIIIllllIIIII[43]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (lIlIIlIlIIllllI(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = lIIIllllIIIII[1];
                    "".length();
                    return (-"   ".length()) >= 0 ? ((138 ^ 198) ^ (179 ^ 156)) & (((((38 + 78) - (-38)) + 13) ^ (((61 + 49) - (-73)) + 13)) ^ (-" ".length())) : r0;
                }
                return lIIIllllIIIII[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[lIIIllllIIIII[1]];
            iArr3[lIIIllllIIIII[0]] = lIIIllllIIIII[44];
            if (lIlIIlIlIIlIlII(Equipment.contains(iArr3) ? 1 : 0) && lIlIIlIlIIlIllI(U() ? 1 : 0)) {
                V();
            }
            if (lIlIIlIlIIlIlll(nearest) && lIlIIlIlIIlIllI(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[45]];
                nearest.interact(lIIIlllIllIll[lIIIllllIIIII[46]]);
                Time.sleepTicks(lIIIllllIIIII[3]);
                "".length();
            }
        }
        if (lIlIIlIlIIlIlll(Players.getLocal().getInteracting())) {
            AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[47]];
            Time.sleepTicks(lIIIllllIIIII[1]);
            "".length();
        }
    }

    private static boolean lIlIIlIlIIllIIl(int i2, int i3) {
        return i2 >= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean U() {
        if (lIlIIlIlIIllIlI(Vars.getBit(lIIIllllIIIII[48]), lIIIllllIIIII[1]) && lIlIIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[17])) {
            return lIIIllllIIIII[1];
        }
        if (lIlIIlIlIIllIlI(Vars.getBit(lIIIllllIIIII[48]), lIIIllllIIIII[2]) && lIlIIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[31]) && lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[17])) {
            return lIIIllllIIIII[1];
        }
        if (lIlIIlIlIIllIlI(Vars.getBit(lIIIllllIIIII[48]), lIIIllllIIIII[3]) && lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[31]) && lIlIIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[36])) {
            return lIIIllllIIIII[1];
        }
        if (lIlIIlIlIIllIlI(Vars.getBit(lIIIllllIIIII[48]), lIIIllllIIIII[3]) && lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[31])) {
            int[] iArr = new int[lIIIllllIIIII[1]];
            iArr[lIIIllllIIIII[0]] = lIIIllllIIIII[12];
            if (lIlIIlIlIIlIllI(Inventory.contains(iArr) ? 1 : 0)) {
                return lIIIllllIIIII[1];
            }
        }
        if (lIlIIlIlIIllIlI(Vars.getBit(lIIIllllIIIII[48]), lIIIllllIIIII[5]) && lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[36])) {
            int[] iArr2 = new int[lIIIllllIIIII[1]];
            iArr2[lIIIllllIIIII[0]] = lIIIllllIIIII[12];
            if (lIlIIlIlIIlIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIIllllIIIII[1];
            }
        }
        return lIIIllllIIIII[0];
    }

    private static boolean lIlIIlIlIIlllII(int i2) {
        return i2 < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v357, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v388, types: [boolean] */
    public static void P() {
        if (lIlIIlIlIIlIlII(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[0]];
            C0001b.a(bA);
            if (lIlIIlIlIIlIlIl(bA.size(), lIIIllllIIIII[1])) {
                System.out.println(lIIIlllIllIll[lIIIllllIIIII[1]]);
                by = lIIIllllIIIII[0];
            }
        }
        if (lIlIIlIlIIlIllI(by ? 1 : 0)) {
            if (lIlIIlIlIIlIllI(S() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIlIlIIlIlll(nearest) && lIlIIlIlIIlIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[2]];
                    C0000a.a(nearest);
                }
                if (lIlIIlIlIIlIlll(nearest) && lIlIIlIlIIlIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[3]];
                    if (lIlIIlIlIIlIllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIllllIIIII[4]);
                        "".length();
                    }
                    if (lIlIIlIlIIlIlII(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIlIlIIllIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIllllIIIII[5]);
                            "".length();
                        }
                        while (lIlIIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[6]) && lIlIIlIlIIlIllI(C0012m.av() ? 1 : 0)) {
                            C0012m.at();
                            Time.sleepTicks(lIIIllllIIIII[1]);
                            "".length();
                            "".length();
                            if ((true ^ true) & ((true ^ true) ^ true)) {
                                return;
                            }
                        }
                        if (lIlIIlIlIIlIllI(T() ? 1 : 0)) {
                            W();
                            System.out.println(lIIIlllIllIll[lIIIllllIIIII[5]]);
                            by = lIIIllllIIIII[1];
                            return;
                        }
                        if (lIlIIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[6])) {
                            int[] iArr = new int[lIIIllllIIIII[1]];
                            iArr[lIIIllllIIIII[0]] = lIIIllllIIIII[7];
                            if (lIlIIlIlIIlIlII(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIIIllllIIIII[1]];
                                iArr2[lIIIllllIIIII[0]] = lIIIllllIIIII[7];
                                if (lIlIIlIlIIlIlIl(Inventory.getCount(iArr2), lIIIllllIIIII[1])) {
                                    Bank.withdraw(lIIIllllIIIII[7], lIIIllllIIIII[8], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIllllIIIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[lIIIllllIIIII[1]];
                                        iArr3[lIIIllllIIIII[0]] = lIIIllllIIIII[7];
                                        if (lIlIIlIlIIllIII(Inventory.getCount(iArr3))) {
                                            ?? r0 = lIIIllllIIIII[1];
                                            "".length();
                                            return (((245 ^ 171) ^ (7 ^ 81)) & (((214 ^ 179) ^ (103 ^ 10)) ^ (-" ".length()))) >= " ".length() ? ((97 ^ 61) ^ (204 ^ 189)) & (((((133 + 140) - 199) + 79) ^ (((159 + 122) - 140) + 39)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIIllllIIIII[0];
                                    }, lIIIllllIIIII[4]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[lIIIllllIIIII[1]];
                            iArr3[lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                            if (lIlIIlIlIIlIlII(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIIIllllIIIII[1]];
                                iArr4[lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                                if (lIlIIlIlIIlIlIl(Inventory.getCount(iArr4), lIIIllllIIIII[1])) {
                                    Bank.withdraw(lIIIllllIIIII[9], lIIIllllIIIII[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIllllIIIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[lIIIllllIIIII[1]];
                                        iArr5[lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                                        if (lIlIIlIlIIllIII(Inventory.getCount(iArr5))) {
                                            ?? r0 = lIIIllllIIIII[1];
                                            "".length();
                                            return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIIllllIIIII[0];
                                    }, lIIIllllIIIII[4]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[lIIIllllIIIII[1]];
                            iArr5[lIIIllllIIIII[0]] = lIIIllllIIIII[11];
                            if (lIlIIlIlIIlIlII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIIllllIIIII[1]];
                                iArr6[lIIIllllIIIII[0]] = lIIIllllIIIII[11];
                                if (lIlIIlIlIIlIlIl(Inventory.getCount(iArr6), lIIIllllIIIII[1])) {
                                    Bank.withdraw(lIIIllllIIIII[11], lIIIllllIIIII[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIllllIIIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[lIIIllllIIIII[1]];
                                        iArr7[lIIIllllIIIII[0]] = lIIIllllIIIII[11];
                                        if (lIlIIlIlIIllIII(Inventory.getCount(iArr7))) {
                                            ?? r0 = lIIIllllIIIII[1];
                                            "".length();
                                            return !((true ^ true) ^ (true ^ true)) ? ((4 ^ 119) ^ (101 ^ 69)) & (((((142 + 170) - 294) + 235) ^ (((101 + 83) - 104) + 94)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIIllllIIIII[0];
                                    }, lIIIllllIIIII[4]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[lIIIllllIIIII[1]];
                            iArr7[lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                            if (lIlIIlIlIIlIlII(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIIIllllIIIII[1]];
                                iArr8[lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                                if (lIlIIlIlIIlIlIl(Inventory.getCount(iArr8), lIIIllllIIIII[1])) {
                                    Bank.withdraw(lIIIllllIIIII[12], lIIIllllIIIII[13], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIllllIIIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[lIIIllllIIIII[1]];
                                        iArr9[lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                                        if (lIlIIlIlIIllIII(Inventory.getCount(iArr9))) {
                                            ?? r0 = lIIIllllIIIII[1];
                                            "".length();
                                            return 0 != 0 ? ((123 ^ 116) ^ (20 ^ 81)) & (((((77 + 158) - 85) + 65) ^ (((34 + 135) - 24) + 12)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIIllllIIIII[0];
                                    }, lIIIllllIIIII[4]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[lIIIllllIIIII[1]];
                            iArr9[lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                            if (lIlIIlIlIIlIlII(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIIIllllIIIII[1]];
                                iArr10[lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                                if (lIlIIlIlIIlIlIl(Inventory.getCount(iArr10), lIIIllllIIIII[1])) {
                                    Bank.withdraw(lIIIllllIIIII[14], lIIIllllIIIII[8], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIllllIIIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[lIIIllllIIIII[1]];
                                        iArr11[lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                                        if (lIlIIlIlIIllIII(Inventory.getCount(iArr11))) {
                                            ?? r0 = lIIIllllIIIII[1];
                                            "".length();
                                            return "  ".length() < ((24 ^ 73) & ((84 ^ 5) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIIllllIIIII[0];
                                    }, lIIIllllIIIII[4]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[lIIIllllIIIII[1]];
                            iArr11[lIIIllllIIIII[0]] = lIIIllllIIIII[15];
                            if (lIlIIlIlIIlIlII(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIIIllllIIIII[1]];
                                iArr12[lIIIllllIIIII[0]] = lIIIllllIIIII[15];
                                if (lIlIIlIlIIlIllI(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(lIIIllllIIIII[15], lIIIllllIIIII[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIllllIIIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[lIIIllllIIIII[1]];
                                        iArr13[lIIIllllIIIII[0]] = lIIIllllIIIII[15];
                                        return Inventory.contains(iArr13);
                                    }, lIIIllllIIIII[4]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(lIIIllllIIIII[16], lIIIllllIIIII[17], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[lIIIllllIIIII[1]];
                            iArr13[lIIIllllIIIII[0]] = lIIIllllIIIII[18];
                            if (lIlIIlIlIIlIlII(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lIIIllllIIIII[1]];
                                iArr14[lIIIllllIIIII[0]] = lIIIllllIIIII[18];
                                if (lIlIIlIlIIlIlIl(Inventory.getCount(iArr14), lIIIllllIIIII[1]) && lIlIIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[19])) {
                                    Bank.withdrawAll(lIIIllllIIIII[18], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIllllIIIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[lIIIllllIIIII[1]];
                                        iArr15[lIIIllllIIIII[0]] = lIIIllllIIIII[18];
                                        if (lIlIIlIlIIllIII(Inventory.getCount(iArr15))) {
                                            ?? r0 = lIIIllllIIIII[1];
                                            "".length();
                                            return " ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIIllllIIIII[0];
                                    }, lIIIllllIIIII[4]);
                                    "".length();
                                }
                            }
                        }
                        if (lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[6])) {
                            int[] iArr15 = new int[lIIIllllIIIII[1]];
                            iArr15[lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                            if (lIlIIlIlIIlIllI(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(lIIIllllIIIII[20], lIIIllllIIIII[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIllllIIIII[1]);
                                "".length();
                            }
                            if (lIlIIlIlIIlIlII(bz ? 1 : 0)) {
                                Bank.withdrawAll(lIIIllllIIIII[21], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIllllIIIII[1]);
                                "".length();
                                Bank.withdrawAll(lIIIllllIIIII[14], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIllllIIIII[1]);
                                "".length();
                            }
                            Bank.withdrawAll(lIIIllllIIIII[22], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIIIllllIIIII[1]);
                            "".length();
                            Bank.withdrawAll(lIIIllllIIIII[23], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(lIIIllllIIIII[1]);
                            "".length();
                        }
                    }
                }
            }
            if (lIlIIlIlIIlIlII(S() ? 1 : 0)) {
                if (lIlIIlIlIIlIlII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIlIIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[19])) {
                    if (lIlIIlIlIIlIllI(bB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[17]];
                        Movement.walkTo(bC);
                        "".length();
                        Time.sleepTicks(lIIIllllIIIII[1]);
                        "".length();
                    }
                    if (lIlIIlIlIIlIlII(bB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[24]];
                        R();
                    }
                }
                if (lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[19]) && lIlIIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[25])) {
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[26]];
                    if (lIlIIlIlIIllIlI(Players.getLocal().getAnimation(), lIIIllllIIIII[27])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(lIIIllllIIIII[1]);
                        "".length();
                    }
                }
                if (lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[25]) && lIlIIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[28])) {
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[29]];
                    if (lIlIIlIlIIllIlI(Players.getLocal().getAnimation(), lIIIllllIIIII[27])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(lIIIllllIIIII[1]);
                        "".length();
                    }
                }
                if (lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[28]) && lIlIIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[30])) {
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[31]];
                    if (lIlIIlIlIIllIlI(Players.getLocal().getAnimation(), lIIIllllIIIII[27])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(lIIIllllIIIII[1]);
                        "".length();
                    }
                }
                if (lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[30]) && lIlIIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[6])) {
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[32]];
                    if (lIlIIlIlIIllIlI(Players.getLocal().getAnimation(), lIIIllllIIIII[27])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(lIIIllllIIIII[1]);
                        "".length();
                    }
                }
                if (lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[6])) {
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[33]];
                    int[] iArr16 = new int[lIIIllllIIIII[1]];
                    iArr16[lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                    if (lIlIIlIlIIlIlII(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIIIllllIIIII[1]];
                        iArr17[lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                        if (lIlIIlIlIIlIllI(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIIIllllIIIII[1]];
                            iArr18[lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                            Inventory.getFirst(iArr18).interact(lIIIlllIllIll[lIIIllllIIIII[34]]);
                            Time.sleepTicks(lIIIllllIIIII[1]);
                            "".length();
                        }
                    }
                    if (lIlIIlIlIIlIlII(GrandExchange.isOpen() ? 1 : 0)) {
                        C0001b.g();
                    }
                    int[] iArr19 = new int[lIIIllllIIIII[1]];
                    iArr19[lIIIllllIIIII[0]] = lIIIllllIIIII[22];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[lIIIllllIIIII[1]];
                    iArr20[lIIIllllIIIII[0]] = lIIIllllIIIII[35];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (lIlIIlIlIIlIllI(bz ? 1 : 0)) {
                        if (lIlIIlIlIIlIllI(Players.getLocal().getWorldLocation().equals(bD) ? 1 : 0)) {
                            AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[36]];
                            Movement.walkTo(bD);
                            "".length();
                            Time.sleepTicks(lIIIllllIIIII[1]);
                            "".length();
                        }
                        if (lIlIIlIlIIlIlII(Players.getLocal().getWorldLocation().equals(bD) ? 1 : 0) && lIlIIlIlIIlIlll(first) && lIlIIlIlIIlIlll(first2)) {
                            int experience = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIlIIlIlIIlllll(Skills.getExperience(Skill.MAGIC), experience)) {
                                    ?? r0 = lIIIllllIIIII[1];
                                    "".length();
                                    return ((((91 + 136) - 215) + 154) ^ (((80 + 5) - (-6)) + 71)) == 0 ? ((((120 + 6) - 69) + 113) ^ (((130 + 72) - 175) + 119)) & (((29 ^ 67) ^ (39 ^ 65)) ^ (-" ".length())) : r0;
                                }
                                return lIIIllllIIIII[0];
                            }, lIIIllllIIIII[8]);
                            "".length();
                            Time.sleep(C0004e.c(lIIIllllIIIII[37], lIIIllllIIIII[38]));
                            "".length();
                        }
                    }
                    if (lIlIIlIlIIlIlII(bz ? 1 : 0)) {
                        if (lIlIIlIlIIlIlll(first) && lIlIIlIlIIlIlll(first2) && lIlIIlIlIIllIlI(Players.getLocal().getAnimation(), lIIIllllIIIII[27])) {
                            int experience2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIlIIlIlIIlllll(Skills.getExperience(Skill.MAGIC), experience2)) {
                                    ?? r0 = lIIIllllIIIII[1];
                                    "".length();
                                    return (((((131 + 8) - 47) + 137) ^ (((101 + 67) - 26) + 26)) & (((70 ^ 32) ^ (154 ^ 177)) ^ (-" ".length()))) != 0 ? ((((55 + 200) - 170) + 129) ^ (((28 + 7) - (-39)) + 67)) & (((97 ^ 33) ^ (48 ^ 43)) ^ (-" ".length())) : r0;
                                }
                                return lIIIllllIIIII[0];
                            }, lIIIllllIIIII[8]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (lIlIIlIlIIllIlI(Players.getLocal().getAnimation(), lIIIllllIIIII[27])) {
                                ?? r0 = lIIIllllIIIII[1];
                                "".length();
                                return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIIllllIIIII[0];
                        }, lIIIllllIIIII[39]);
                        "".length();
                    }
                }
            }
        }
    }

    private static String lIlIIlIIlllIIll(String lllllllllllllllIIIIIlIIIIllIIllI, String lllllllllllllllIIIIIlIIIIllIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlIIIIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIIIIllIIlIl.getBytes(StandardCharsets.UTF_8)), lIIIllllIIIII[29]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIllllIIIII[2], lllllllllllllllIIIIIlIIIIllIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIIIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlIIIIllIIlll) {
            lllllllllllllllIIIIIlIIIIllIIlll.printStackTrace();
            return null;
        }
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIIlllIllIll[lIIIllllIIIII[72]];
    }

    private static boolean lIlIIlIlIIlIlll(Object obj) {
        return obj != null;
    }

    private static void W() {
        if (lIlIIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[6])) {
            int[] iArr = new int[lIIIllllIIIII[1]];
            iArr[lIIIllllIIIII[0]] = lIIIllllIIIII[14];
            if (lIlIIlIlIIlIllI(Bank.contains(iArr) ? 1 : 0)) {
                bA.add(new C0003d(lIIIllllIIIII[14], lIIIllllIIIII[57], lIIIllllIIIII[58]));
                "".length();
            }
            int[] iArr2 = new int[lIIIllllIIIII[1]];
            iArr2[lIIIllllIIIII[0]] = lIIIllllIIIII[7];
            if (lIlIIlIlIIlIllI(Bank.contains(iArr2) ? 1 : 0)) {
                bA.add(new C0003d(lIIIllllIIIII[7], lIIIllllIIIII[59], lIIIllllIIIII[24]));
                "".length();
            }
            int[] iArr3 = new int[lIIIllllIIIII[1]];
            iArr3[lIIIllllIIIII[0]] = lIIIllllIIIII[9];
            if (lIlIIlIlIIlIllI(Bank.contains(iArr3) ? 1 : 0)) {
                bA.add(new C0003d(lIIIllllIIIII[9], lIIIllllIIIII[60], lIIIllllIIIII[24]));
                "".length();
            }
            int[] iArr4 = new int[lIIIllllIIIII[1]];
            iArr4[lIIIllllIIIII[0]] = lIIIllllIIIII[11];
            if (lIlIIlIlIIlIllI(Bank.contains(iArr4) ? 1 : 0)) {
                bA.add(new C0003d(lIIIllllIIIII[11], lIIIllllIIIII[61], lIIIllllIIIII[24]));
                "".length();
            }
            int[] iArr5 = new int[lIIIllllIIIII[1]];
            iArr5[lIIIllllIIIII[0]] = lIIIllllIIIII[12];
            if (lIlIIlIlIIlIllI(Bank.contains(iArr5) ? 1 : 0)) {
                bA.add(new C0003d(lIIIllllIIIII[12], lIIIllllIIIII[4], lIIIllllIIIII[24]));
                "".length();
            }
            int[] iArr6 = new int[lIIIllllIIIII[1]];
            iArr6[lIIIllllIIIII[0]] = lIIIllllIIIII[44];
            if (lIlIIlIlIIlIllI(Bank.contains(iArr6) ? 1 : 0)) {
                bA.add(new C0003d(lIIIllllIIIII[44], lIIIllllIIIII[1], C0004e.c(lIIIllllIIIII[62], lIIIllllIIIII[63])));
                "".length();
            }
        }
        if (lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[6])) {
            int[] iArr7 = new int[lIIIllllIIIII[1]];
            iArr7[lIIIllllIIIII[0]] = lIIIllllIIIII[22];
            if (lIlIIlIlIIlIlII(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIIllllIIIII[1]];
                iArr8[lIIIllllIIIII[0]] = lIIIllllIIIII[22];
                if (lIlIIlIlIIlIlIl(Bank.getFirst(iArr8).getQuantity(), lIIIllllIIIII[61])) {
                    int i2 = lIIIllllIIIII[22];
                    int i3 = lIIIllllIIIII[61];
                    int[] iArr9 = new int[lIIIllllIIIII[1]];
                    iArr9[lIIIllllIIIII[0]] = lIIIllllIIIII[22];
                    bA.add(new C0003d(i2, i3 - Bank.getFirst(iArr9).getQuantity(), lIIIllllIIIII[64]));
                    "".length();
                }
            }
            int[] iArr10 = new int[lIIIllllIIIII[1]];
            iArr10[lIIIllllIIIII[0]] = lIIIllllIIIII[22];
            if (lIlIIlIlIIlIllI(Bank.contains(iArr10) ? 1 : 0)) {
                bA.add(new C0003d(lIIIllllIIIII[22], lIIIllllIIIII[61], lIIIllllIIIII[64]));
                "".length();
            }
            int[] iArr11 = new int[lIIIllllIIIII[1]];
            iArr11[lIIIllllIIIII[0]] = lIIIllllIIIII[23];
            if (lIlIIlIlIIlIlII(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIIIllllIIIII[1]];
                iArr12[lIIIllllIIIII[0]] = lIIIllllIIIII[23];
                if (lIlIIlIlIIlIlIl(Bank.getFirst(iArr12).getQuantity(), lIIIllllIIIII[61])) {
                    int i4 = lIIIllllIIIII[23];
                    int i5 = lIIIllllIIIII[61];
                    int[] iArr13 = new int[lIIIllllIIIII[1]];
                    iArr13[lIIIllllIIIII[0]] = lIIIllllIIIII[23];
                    bA.add(new C0003d(i4, i5 - Bank.getFirst(iArr13).getQuantity(), lIIIllllIIIII[65]));
                    "".length();
                }
            }
            int[] iArr14 = new int[lIIIllllIIIII[1]];
            iArr14[lIIIllllIIIII[0]] = lIIIllllIIIII[23];
            if (lIlIIlIlIIlIllI(Bank.contains(iArr14) ? 1 : 0)) {
                bA.add(new C0003d(lIIIllllIIIII[23], lIIIllllIIIII[61], lIIIllllIIIII[65]));
                "".length();
            }
            int[] iArr15 = new int[lIIIllllIIIII[1]];
            iArr15[lIIIllllIIIII[0]] = lIIIllllIIIII[20];
            if (lIlIIlIlIIlIllI(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIIIllllIIIII[1]];
                iArr16[lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                if (lIlIIlIlIIlIllI(Equipment.contains(iArr16) ? 1 : 0)) {
                    bA.add(new C0003d(lIIIllllIIIII[20], lIIIllllIIIII[1], lIIIllllIIIII[66]));
                    "".length();
                }
            }
            if (lIlIIlIlIIlIlII(bz ? 1 : 0)) {
                int[] iArr17 = new int[lIIIllllIIIII[1]];
                iArr17[lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                if (lIlIIlIlIIlIlII(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIIIllllIIIII[1]];
                    iArr18[lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                    if (lIlIIlIlIIlIlIl(Bank.getFirst(iArr18).getQuantity(), lIIIllllIIIII[61])) {
                        int i6 = lIIIllllIIIII[14];
                        int i7 = lIIIllllIIIII[61];
                        int[] iArr19 = new int[lIIIllllIIIII[1]];
                        iArr19[lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                        bA.add(new C0003d(i6, i7 - Bank.getFirst(iArr19).getQuantity(), lIIIllllIIIII[58]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIIIllllIIIII[1]];
                iArr20[lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                if (lIlIIlIlIIlIllI(Bank.contains(iArr20) ? 1 : 0)) {
                    bA.add(new C0003d(lIIIllllIIIII[14], lIIIllllIIIII[61], lIIIllllIIIII[58]));
                    "".length();
                }
                int[] iArr21 = new int[lIIIllllIIIII[1]];
                iArr21[lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                if (lIlIIlIlIIlIlII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIIllllIIIII[1]];
                    iArr22[lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                    if (lIlIIlIlIIlIlIl(Bank.getFirst(iArr22).getQuantity(), lIIIllllIIIII[66])) {
                        int i8 = lIIIllllIIIII[21];
                        int i9 = lIIIllllIIIII[66];
                        int[] iArr23 = new int[lIIIllllIIIII[1]];
                        iArr23[lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                        bA.add(new C0003d(i8, i9 - Bank.getFirst(iArr23).getQuantity(), lIIIllllIIIII[24]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[lIIIllllIIIII[1]];
                iArr24[lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                if (lIlIIlIlIIlIllI(Bank.contains(iArr24) ? 1 : 0)) {
                    bA.add(new C0003d(lIIIllllIIIII[21], lIIIllllIIIII[66], lIIIllllIIIII[24]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[lIIIllllIIIII[1]];
        iArr25[lIIIllllIIIII[0]] = lIIIllllIIIII[18];
        if (lIlIIlIlIIlIllI(Bank.contains(iArr25) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIIIII[18], lIIIllllIIIII[67], lIIIllllIIIII[37]));
            "".length();
        }
        if (lIlIIlIlIIlIllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIlllIllIll[lIIIllllIIIII[74]]);
        }) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIIIII[68], lIIIllllIIIII[17], lIIIllllIIIII[69]));
            "".length();
        }
        int[] iArr26 = new int[lIIIllllIIIII[1]];
        iArr26[lIIIllllIIIII[0]] = lIIIllllIIIII[70];
        if (lIlIIlIlIIlIllI(Bank.contains(iArr26) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIIIII[70], lIIIllllIIIII[32], lIIIllllIIIII[71]));
            "".length();
        }
        int[] iArr27 = new int[lIIIllllIIIII[1]];
        iArr27[lIIIllllIIIII[0]] = lIIIllllIIIII[16];
        if (lIlIIlIlIIlIllI(Bank.contains(iArr27) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIIIII[16], lIIIllllIIIII[32], lIIIllllIIIII[71]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIIllllIIIII[0];
    }

    private static boolean lIlIIlIlIIlIlIl(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlIIlIlIIllIII(int i2) {
        return i2 > 0;
    }

    private static void lIlIIlIlIIlIIlI() {
        lIIIlllIllIll = new String[lIIIllllIIIII[25]];
        lIIIlllIllIll[lIIIllllIIIII[0]] = lIlIIlIIlllIIlI("LAQLDj8JURsTNAMC", "nqrgQ");
        lIIIlllIllIll[lIIIllllIIIII[1]] = lIlIIlIIlllIIll("SxSQolnAqiUpqma0mN32NYOLxYMJ+/YMGDi+uINxdxjtji5TtCthwOi+3OuZ0M+825miKxGkY08=", "nvdKn");
        lIIIlllIllIll[lIIIllllIIIII[2]] = lIlIIlIIlllIIll("FKeSYn3Wld8vSmjQ7aG0lgxlQvDZLg3d", "kApIf");
        lIIIlllIllIll[lIIIllllIIIII[3]] = lIlIIlIIlllIIlI("Oi4DNTQbIQpxOhMhBjg2FQ==", "rOmQX");
        lIIIlllIllIll[lIIIllllIIIII[5]] = lIlIIlIIlllIIll("Dp9wcfJ+XeTCoTECeWm8DU56sacu2s+6vhRSo5AmDyCRF3fV3sUi4qLRECW01PdK", "nuLUK");
        lIIIlllIllIll[lIIIllllIIIII[17]] = lIlIIlIIlllIlII("ADttcLNGBuvbxpr19AHJUA==", "IOjeB");
        lIIIlllIllIll[lIIIllllIIIII[24]] = lIlIIlIIlllIIlI("Ch0GBSogABwDaSgGBRc=", "KirdI");
        lIIIlllIllIll[lIIIllllIIIII[26]] = lIlIIlIIlllIIlI("BwoEBAAqDFcGCDYZGBMCZB8SHAw=", "Dkwpi");
        lIIIlllIllIll[lIIIllllIIIII[29]] = lIlIIlIIlllIIll("fMgMvmchaFPyvhH7noGD7Q79cuux2q1L", "YVhwS");
        lIIIlllIllIll[lIIIllllIIIII[31]] = lIlIIlIIlllIlII("WjyZk4Q8L8O5/f2B1lCI0kUnxMNuPaaN", "mSuvL");
        lIIIlllIllIll[lIIIllllIIIII[32]] = lIlIIlIIlllIlII("RIf3SfA5K0OOr9ffbzgOfDVvWyM+fSgb", "RknnS");
        lIIIlllIllIll[lIIIllllIIIII[33]] = lIlIIlIIlllIIlI("OxoQHCYUEQ==", "zvstO");
        lIIIlllIllIll[lIIIllllIIIII[34]] = lIlIIlIIlllIIll("X3hl84U9NPE=", "uQQwN");
        lIIIlllIllIll[lIIIllllIIIII[36]] = lIlIIlIIlllIIlI("AB8mFXY5H3AROi4YcAMmIgQ=", "MpPpV");
        lIIIlllIllIll[lIIIllllIIIII[40]] = lIlIIlIIlllIIlI("DTQseD0sdTk3PjA=", "CUZXI");
        lIIIlllIllIll[lIIIllllIIIII[41]] = lIlIIlIIlllIlII("xnUKWfA89Dg=", "XGmco");
        lIIIlllIllIll[lIIIllllIIIII[42]] = lIlIIlIIlllIIlI("EBgE", "SwsjY");
        lIIIlllIllIll[lIIIllllIIIII[43]] = lIlIIlIIlllIIll("+bMs3rdRkPE=", "aLMGr");
        lIIIlllIllIll[lIIIllllIIIII[45]] = lIlIIlIIlllIIlI("DCAlFzsmPT8ReC47JgU=", "MTQvX");
        lIIIlllIllIll[lIIIllllIIIII[46]] = lIlIIlIIlllIIlI("MQAOEhUb", "ptzsv");
        lIIIlllIllIll[lIIIllllIIIII[47]] = lIlIIlIIlllIIlI("LzxkKhULMCU9", "fRDIz");
        lIIIlllIllIll[lIIIllllIIIII[51]] = lIlIIlIIlllIlII("mvWQxH5a1pLk7ySjgqNpm8Y3dYB/bY+X", "mNRTA");
        lIIIlllIllIll[lIIIllllIIIII[52]] = lIlIIlIIlllIIlI("EBIXCiA2WgsVNj8W", "SzxeS");
        lIIIlllIllIll[lIIIllllIIIII[54]] = lIlIIlIIlllIlII("Fc/qhEWQnNdLhY9KzbPV7Q==", "xCWbv");
        lIIIlllIllIll[lIIIllllIIIII[55]] = lIlIIlIIlllIIll("qI66J32Dj5R3lcm9Ozb7iQ==", "SiDmj");
        lIIIlllIllIll[lIIIllllIIIII[19]] = lIlIIlIIlllIlII("qXumnKFOA+4tY4W9lW0YtQ==", "wfysh");
        lIIIlllIllIll[lIIIllllIIIII[50]] = lIlIIlIIlllIIll("bylYs0bO5rrpkif9W09+oA==", "rQwvW");
        lIIIlllIllIll[lIIIllllIIIII[56]] = lIlIIlIIlllIIll("jIEAARI9LLExDAZTyir82g==", "ayVXs");
        lIIIlllIllIll[lIIIllllIIIII[72]] = lIlIIlIIlllIIlI("Gi8jHjp3OjYWMDknKhA=", "WNDwY");
        lIIIlllIllIll[lIIIllllIIIII[74]] = lIlIIlIIlllIIlI("JyoEJmg6JUo2LTQvHilofQ==", "UCjAH");
        lIIIlllIllIll[lIIIllllIIIII[75]] = lIlIIlIIlllIlII("+9Na7cqk2cU=", "YElVq");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIlIlIIllIIl(Skills.getLevel(Skill.MAGIC), lIIIllllIIIII[73])) {
            ?? r0 = lIIIllllIIIII[1];
            "".length();
            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIllllIIIII[0];
    }

    public static void Q() {
        if (lIlIIlIlIIlIlII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIIlIlIIlIllI(bB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[40]];
            Movement.walkTo(bC);
            "".length();
            Time.sleepTicks(lIIIllllIIIII[1]);
            "".length();
        }
        if (lIlIIlIlIIlIlII(bB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            R();
        }
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            P();
            "".length();
            if ((-" ".length()) == (194 ^ 198)) {
                return (185 ^ 133) & ((97 ^ 93) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIllllIIIII[67];
    }

    static {
        lIlIIlIlIIlIIll();
        lIlIIlIlIIlIIlI();
        bA = new ArrayList();
        bB = new WorldArea(lIIIllllIIIII[76], lIIIllllIIIII[77], lIIIllllIIIII[47], lIIIllllIIIII[40], lIIIllllIIIII[0]);
        bC = new WorldPoint(lIIIllllIIIII[78], lIIIllllIIIII[79], lIIIllllIIIII[0]);
        bD = new WorldPoint(lIIIllllIIIII[80] + C0004e.c(lIIIllllIIIII[1], lIIIllllIIIII[5]), lIIIllllIIIII[81], lIIIllllIIIII[0]);
    }

    private static boolean lIlIIlIlIIllllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIIlIlIIlIlII(int i2) {
        return i2 != 0;
    }

    private static int lIlIIlIlIIllIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }
}
