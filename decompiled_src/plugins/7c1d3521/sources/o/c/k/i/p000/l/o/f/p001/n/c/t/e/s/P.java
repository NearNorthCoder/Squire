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
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.P  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/P.class */
public class P implements InterfaceC0003ac {
    public static /* synthetic */ int lw;
    private static final /* synthetic */ WorldPoint kY;
    public static final /* synthetic */ WorldArea kE;
    public static /* synthetic */ List<C0017d> bv;
    public static final /* synthetic */ WorldPoint kx;
    private static /* synthetic */ int[] lz;
    private static final /* synthetic */ int kL;
    private static final /* synthetic */ WorldArea lk;
    private static final /* synthetic */ int lm;
    private static final /* synthetic */ int lr;
    public static final /* synthetic */ WorldArea kB;
    private static final /* synthetic */ WorldArea lj;
    private static final /* synthetic */ int kQ;
    private static final /* synthetic */ int lp;
    private static final /* synthetic */ int kN;
    static /* synthetic */ int di;
    private static final /* synthetic */ int lt;
    public static final /* synthetic */ WorldArea kz;
    private static final /* synthetic */ int kI;
    private static final /* synthetic */ WorldPoint lh;
    public static final /* synthetic */ WorldArea kF;
    private static final /* synthetic */ int lv;
    public static final /* synthetic */ WorldPoint kv;
    private static final /* synthetic */ int kO;
    private static final /* synthetic */ WorldPoint kZ;
    private static /* synthetic */ String[] llIllIlIlI;
    static /* synthetic */ String ly;
    public static final /* synthetic */ WorldArea ky;
    public static final /* synthetic */ WorldArea kC;
    private static final /* synthetic */ int kP;
    public static /* synthetic */ int lx;
    private static final /* synthetic */ WorldPoint kW;
    static /* synthetic */ boolean dj;
    private static final /* synthetic */ int kJ;
    private static final /* synthetic */ int lu;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ int kS;
    private static final /* synthetic */ WorldPoint ld;
    private static final /* synthetic */ WorldPoint le;
    private static final /* synthetic */ WorldPoint kV;
    private static final /* synthetic */ WorldPoint li;
    private static final /* synthetic */ WorldPoint kX;
    public static final /* synthetic */ WorldPoint kw;
    private static final /* synthetic */ WorldPoint kU;
    public static final /* synthetic */ WorldArea kD;
    private static final /* synthetic */ int kK;
    private static final /* synthetic */ int lq;
    private static final /* synthetic */ int kM;
    private static /* synthetic */ int[] llIllIlllI;
    private static final /* synthetic */ int kH;
    private static final /* synthetic */ WorldPoint kT;
    public static final /* synthetic */ WorldArea kA;
    private static final /* synthetic */ WorldPoint lb;
    static /* synthetic */ String[] fG;
    private static final /* synthetic */ int ln;
    private static final /* synthetic */ int lo;
    private static final /* synthetic */ WorldArea ll;
    private static final /* synthetic */ int ls;
    private static final /* synthetic */ WorldPoint lg;
    private static final /* synthetic */ int kR;
    private static final /* synthetic */ int kG;
    private static final /* synthetic */ WorldPoint lc;
    private static final /* synthetic */ WorldPoint lf;
    private static final /* synthetic */ WorldPoint la;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x010f, code lost:
        if (lIlllIIIIIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.P.llIllIlllI[13]) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0217, code lost:
        if (lIlllIIIIIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.P.llIllIlllI[22]) != false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7 = new int[llIllIlllI[3]];
        iArr7[llIllIlllI[4]] = llIllIlllI[8];
        if (lIlllIIIIlIII(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0017d(llIllIlllI[8], llIllIlllI[109], llIllIlllI[110]));
            "".length();
        }
        int[] iArr8 = new int[llIllIlllI[3]];
        iArr8[llIllIlllI[4]] = llIllIlllI[8];
        if (lIlllIIIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[llIllIlllI[3]];
            iArr9[llIllIlllI[4]] = llIllIlllI[8];
            if (lIlllIIIIIlIl(Bank.getFirst(iArr9).getQuantity(), llIllIlllI[33])) {
                bv.add(new C0017d(llIllIlllI[8], llIllIlllI[54], llIllIlllI[110]));
                "".length();
            }
        }
        int[] iArr10 = new int[llIllIlllI[3]];
        iArr10[llIllIlllI[4]] = llIllIlllI[9];
        if (lIlllIIIIIlll(Bank.contains(iArr10) ? 1 : 0)) {
            int[] iArr11 = new int[llIllIlllI[3]];
            iArr11[llIllIlllI[4]] = llIllIlllI[9];
            if (lIlllIIIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIllIlllI[3]];
                iArr12[llIllIlllI[4]] = llIllIlllI[9];
            }
            if (lIlllIIIIlIII(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(llIllIlIlI[llIllIlllI[117]]);
            }) ? 1 : 0)) {
                bv.add(new C0017d(llIllIlllI[112], llIllIlllI[31], llIllIlllI[113]));
                "".length();
            }
            iArr = new int[llIllIlllI[3]];
            iArr[llIllIlllI[4]] = llIllIlllI[105];
            if (lIlllIIIIlIII(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0017d(llIllIlllI[105], llIllIlllI[54], llIllIlllI[114]));
                "".length();
            }
            iArr2 = new int[llIllIlllI[3]];
            iArr2[llIllIlllI[4]] = llIllIlllI[10];
            if (lIlllIIIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr13 = new int[llIllIlllI[3]];
                iArr13[llIllIlllI[4]] = llIllIlllI[10];
                if (lIlllIIIIIlll(Bank.contains(iArr13) ? 1 : 0)) {
                    int[] iArr14 = new int[llIllIlllI[3]];
                    iArr14[llIllIlllI[4]] = llIllIlllI[10];
                }
                iArr3 = new int[llIllIlllI[3]];
                iArr3[llIllIlllI[4]] = llIllIlllI[108];
                if (lIlllIIIIlIII(Bank.contains(iArr3) ? 1 : 0)) {
                    bv.add(new C0017d(llIllIlllI[108], llIllIlllI[13], C0023j.cf));
                    "".length();
                }
                iArr4 = new int[llIllIlllI[3]];
                iArr4[llIllIlllI[4]] = llIllIlllI[7];
                if (lIlllIIIIIlll(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr15 = new int[llIllIlllI[3]];
                    iArr15[llIllIlllI[4]] = llIllIlllI[7];
                    if (lIlllIIIIIlIl(Bank.getFirst(iArr15).getQuantity(), llIllIlllI[101])) {
                        bv.add(new C0017d(llIllIlllI[7], llIllIlllI[115], llIllIlllI[18]));
                        "".length();
                    }
                }
                iArr5 = new int[llIllIlllI[3]];
                iArr5[llIllIlllI[4]] = llIllIlllI[5];
                if (lIlllIIIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                    int[] iArr16 = new int[llIllIlllI[3]];
                    iArr16[llIllIlllI[4]] = llIllIlllI[5];
                    if (lIlllIIIIIlIl(Bank.getFirst(iArr16).getQuantity(), llIllIlllI[101])) {
                        bv.add(new C0017d(llIllIlllI[5], llIllIlllI[115], llIllIlllI[18]));
                        "".length();
                    }
                }
                iArr6 = new int[llIllIlllI[3]];
                iArr6[llIllIlllI[4]] = llIllIlllI[6];
                if (lIlllIIIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr17 = new int[llIllIlllI[3]];
                    iArr17[llIllIlllI[4]] = llIllIlllI[6];
                    if (lIlllIIIIIlIl(Bank.getFirst(iArr17).getQuantity(), llIllIlllI[101])) {
                        bv.add(new C0017d(llIllIlllI[6], llIllIlllI[115], llIllIlllI[18]));
                        "".length();
                        return;
                    }
                    return;
                }
                return;
            }
            bv.add(new C0017d(llIllIlllI[10], llIllIlllI[33], llIllIlllI[114]));
            "".length();
            iArr3 = new int[llIllIlllI[3]];
            iArr3[llIllIlllI[4]] = llIllIlllI[108];
            if (lIlllIIIIlIII(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[llIllIlllI[3]];
            iArr4[llIllIlllI[4]] = llIllIlllI[7];
            if (lIlllIIIIIlll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[llIllIlllI[3]];
            iArr5[llIllIlllI[4]] = llIllIlllI[5];
            if (lIlllIIIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[llIllIlllI[3]];
            iArr6[llIllIlllI[4]] = llIllIlllI[6];
            if (lIlllIIIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
            }
        }
        bv.add(new C0017d(llIllIlllI[9], llIllIlllI[13], llIllIlllI[111]));
        "".length();
        if (lIlllIIIIlIII(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(llIllIlIlI[llIllIlllI[117]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[llIllIlllI[3]];
        iArr[llIllIlllI[4]] = llIllIlllI[105];
        if (lIlllIIIIlIII(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[llIllIlllI[3]];
        iArr2[llIllIlllI[4]] = llIllIlllI[10];
        if (lIlllIIIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIllIlllI[10], llIllIlllI[33], llIllIlllI[114]));
        "".length();
        iArr3 = new int[llIllIlllI[3]];
        iArr3[llIllIlllI[4]] = llIllIlllI[108];
        if (lIlllIIIIlIII(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[llIllIlllI[3]];
        iArr4[llIllIlllI[4]] = llIllIlllI[7];
        if (lIlllIIIIIlll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[llIllIlllI[3]];
        iArr5[llIllIlllI[4]] = llIllIlllI[5];
        if (lIlllIIIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[llIllIlllI[3]];
        iArr6[llIllIlllI[4]] = llIllIlllI[6];
        if (lIlllIIIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
        }
    }

    private static String lIllIlllIllll(String llllllllllllllllllIIIIlllIIlIlll, String llllllllllllllllllIIIIlllIIlIllI) {
        try {
            SecretKeySpec llllllllllllllllllIIIIlllIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIlllIIlIllI.getBytes(StandardCharsets.UTF_8)), llIllIlllI[20]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIllIlllI[1], llllllllllllllllllIIIIlllIIllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIlllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIIlllIIllIII) {
            llllllllllllllllllIIIIlllIIllIII.printStackTrace();
            return null;
        }
    }

    private static void lIlllIIIIIlII() {
        llIllIlllI = new int[175];
        llIllIlllI[0] = (((147 ^ 134) + (116 ^ 2)) - (243 ^ 172)) + (106 ^ 30);
        llIllIlllI[1] = "  ".length();
        llIllIlllI[2] = (((((158 + 52) - 106) + 89) + (228 ^ 151)) - ((-9313) & 9599)) + ((133 + 183) - 307) + 196;
        llIllIlllI[3] = " ".length();
        llIllIlllI[4] = (93 ^ 2) & ((79 ^ 16) ^ (-1));
        llIllIlllI[5] = (-23953) & 24507;
        llIllIlllI[6] = (-6531) & 7087;
        llIllIlllI[7] = (-((-553) & 24313)) & (-1) & 24318;
        llIllIlllI[8] = (-((-16837) & 23493)) & (-17541) & 24575;
        llIllIlllI[9] = (-2093) & 4077;
        llIllIlllI[10] = (-165) & 8173;
        llIllIlllI[11] = (((79 ^ 68) + (209 ^ 186)) - (117 ^ 5)) + ((143 + 29) - 49) + 21;
        llIllIlllI[12] = "   ".length();
        llIllIlllI[13] = (125 ^ 93) ^ (144 ^ 181);
        llIllIlllI[14] = 191 ^ 185;
        llIllIlllI[15] = 24 ^ 28;
        llIllIlllI[16] = 10 ^ 90;
        llIllIlllI[17] = (-((-8561) & 14327)) & (-24577) & 32751;
        llIllIlllI[18] = 13 ^ 10;
        llIllIlllI[19] = (-16577) & 19443;
        llIllIlllI[20] = (107 ^ 42) ^ (122 ^ 51);
        llIllIlllI[21] = (179 ^ 191) ^ (100 ^ 97);
        llIllIlllI[22] = 58 ^ 48;
        llIllIlllI[23] = ((122 + 52) - (-10)) + 45;
        llIllIlllI[24] = 124 ^ 119;
        llIllIlllI[25] = (((128 + 85) - 41) + 10) ^ (((152 + 40) - 125) + 119);
        llIllIlllI[26] = 4 ^ 9;
        llIllIlllI[27] = 188 ^ 178;
        llIllIlllI[28] = 85 ^ 90;
        llIllIlllI[29] = (((41 + 67) - 11) + 64) ^ (((174 + 98) - 95) + 0);
        llIllIlllI[30] = 71 ^ 86;
        llIllIlllI[31] = " ".length() ^ (136 ^ 155);
        llIllIlllI[32] = (((54 + 96) - 97) + 105) ^ (((137 + 48) - 141) + 97);
        llIllIlllI[33] = (20 ^ 125) ^ (61 ^ 64);
        llIllIlllI[34] = (141 ^ 176) ^ (110 ^ 70);
        llIllIlllI[35] = (231 ^ 162) ^ (66 ^ 17);
        llIllIlllI[36] = 48 ^ 39;
        llIllIlllI[37] = (39 ^ 28) ^ (102 ^ 69);
        llIllIlllI[38] = 135 ^ 158;
        llIllIlllI[39] = (-8338) & 10747;
        llIllIlllI[40] = (((91 + 144) - 94) + 32) ^ (((160 + 180) - 278) + 121);
        llIllIlllI[41] = (233 ^ 167) ^ (193 ^ 148);
        llIllIlllI[42] = 169 ^ 181;
        llIllIlllI[43] = 74 ^ 87;
        llIllIlllI[44] = 46 ^ 48;
        llIllIlllI[45] = (((11 + 13) - (-9)) + 136) ^ (((33 + 134) - 49) + 64);
        llIllIlllI[46] = (((109 + 4) - 4) + 36) ^ (((146 + 85) - 116) + 62);
        llIllIlllI[47] = (((130 + 2) - (-64)) + 30) ^ (((172 + 11) - 5) + 17);
        llIllIlllI[48] = 148 ^ 182;
        llIllIlllI[49] = 152 ^ 187;
        llIllIlllI[50] = (184 ^ 133) ^ (17 ^ 8);
        llIllIlllI[51] = (((171 + 181) - 221) + 94) ^ (((135 + 70) - 178) + 169);
        llIllIlllI[52] = 76 ^ 106;
        llIllIlllI[53] = 228 ^ 195;
        llIllIlllI[54] = (((79 + 125) - 98) + 58) ^ (((121 + 78) - 156) + 97);
        llIllIlllI[55] = 74 ^ 99;
        llIllIlllI[56] = (100 ^ 125) ^ (244 ^ 199);
        llIllIlllI[57] = (((16 + 50) - 1) + 75) ^ (((38 + 13) - (-83)) + 33);
        llIllIlllI[58] = (-1163) & 4063;
        llIllIlllI[59] = (-((-1922) & 30693)) & (-529) & 32759;
        llIllIlllI[60] = (-((-6219) & 23771)) & (-5) & 19967;
        llIllIlllI[61] = (121 ^ 115) ^ (32 ^ 6);
        llIllIlllI[62] = (-((-4949) & 30687)) & (-4097) & 32767;
        llIllIlllI[63] = 156 ^ 177;
        llIllIlllI[64] = 82 ^ 124;
        llIllIlllI[65] = 237 ^ 194;
        llIllIlllI[66] = 109 ^ 93;
        llIllIlllI[67] = 151 ^ 166;
        llIllIlllI[68] = (((6 + 143) - 132) + 173) ^ (((16 + 111) - 23) + 36);
        llIllIlllI[69] = (((89 + 124) - 95) + 25) ^ (((156 + 157) - 286) + 161);
        llIllIlllI[70] = (77 ^ 53) ^ (29 ^ 81);
        llIllIlllI[71] = 174 ^ 155;
        llIllIlllI[72] = (86 ^ 61) ^ (211 ^ 142);
        llIllIlllI[73] = 187 ^ 140;
        llIllIlllI[74] = 17 ^ 41;
        llIllIlllI[75] = ((5 ^ 39) & ((46 ^ 12) ^ (-1))) ^ (181 ^ 140);
        llIllIlllI[76] = 7 ^ 61;
        llIllIlllI[77] = (175 ^ 184) ^ (32 ^ 12);
        llIllIlllI[78] = (((64 + 132) - 137) + 80) ^ (((159 + 17) - 143) + 150);
        llIllIlllI[79] = (137 ^ 159) ^ (33 ^ 10);
        llIllIlllI[80] = (((77 + 95) - 110) + 79) ^ (((12 + 36) - 47) + 178);
        llIllIlllI[81] = (155 ^ 179) ^ (63 ^ 40);
        llIllIlllI[82] = (-((-3491) & 32163)) & (-5) & 32671;
        llIllIlllI[83] = 205 ^ 141;
        llIllIlllI[84] = 21 ^ 84;
        llIllIlllI[85] = 216 ^ 154;
        llIllIlllI[86] = (138 ^ 149) ^ (78 ^ 18);
        llIllIlllI[87] = 52 ^ 112;
        llIllIlllI[88] = 38 ^ 99;
        llIllIlllI[89] = (146 ^ 129) ^ (114 ^ 39);
        llIllIlllI[90] = 232 ^ 175;
        llIllIlllI[91] = (125 ^ 54) ^ "   ".length();
        llIllIlllI[92] = (243 ^ 180) ^ (5 ^ 11);
        llIllIlllI[93] = (-((-15221) & 32765)) & (-12305) & 32761;
        llIllIlllI[94] = (-((-23051) & 31323)) & (-514) & 12251;
        llIllIlllI[95] = (32 ^ 14) ^ (2 ^ 102);
        llIllIlllI[96] = ((10 ^ 50) & ((30 ^ 38) ^ (-1))) ^ (89 ^ 18);
        llIllIlllI[97] = (87 ^ 18) ^ (88 ^ 81);
        llIllIlllI[98] = (9 ^ 61) ^ (1 ^ 120);
        llIllIlllI[99] = (-((-20737) & 21846)) & (-2049) & 8157;
        llIllIlllI[100] = 219 ^ 149;
        llIllIlllI[101] = (-((-8681) & 15851)) & (-18) & 8187;
        llIllIlllI[102] = (111 ^ 122) ^ (11 ^ 81);
        llIllIlllI[103] = (197 ^ 174) ^ (112 ^ 74);
        llIllIlllI[104] = (103 ^ 59) ^ (115 ^ 125);
        llIllIlllI[105] = (-((-14599) & 31135)) & (-8193) & 32735;
        llIllIlllI[106] = (33 ^ 121) ^ (43 ^ 32);
        llIllIlllI[107] = (-((-6790) & 14991)) & (-23043) & 31743;
        llIllIlllI[108] = (-2561) & 15185;
        llIllIlllI[109] = 9 ^ 109;
        llIllIlllI[110] = (-25133) & 25532;
        llIllIlllI[111] = (-16386) & 21495;
        llIllIlllI[112] = (-16674) & 28653;
        llIllIlllI[113] = (-((-5) & 5269)) & (-7) & 22270;
        llIllIlllI[114] = (-((-3693) & 24317)) & (-2051) & 24574;
        llIllIlllI[115] = (-22534) & 24533;
        llIllIlllI[116] = 55 ^ 99;
        llIllIlllI[117] = 202 ^ 159;
        llIllIlllI[118] = (-28673) & 29226;
        llIllIlllI[119] = (-30721) & 32190;
        llIllIlllI[120] = (-((-465) & 23006)) & (-17) & 24031;
        llIllIlllI[121] = (-((-5449) & 15692)) & (-9) & 11727;
        llIllIlllI[122] = (-((-1302) & 20287)) & (-4117) & 24573;
        llIllIlllI[123] = (-((-21281) & 22330)) & (-20609) & 24573;
        llIllIlllI[124] = (-((-3462) & 24455)) & (-8307) & 32763;
        llIllIlllI[125] = (-21649) & 24567;
        llIllIlllI[126] = (-1154) & 4053;
        llIllIlllI[127] = (-((-16801) & 21429)) & (-97) & 8183;
        llIllIlllI[128] = (-((-23393) & 24561)) & (-8197) & 12279;
        llIllIlllI[129] = (-((-11325) & 31934)) & (-1) & 23539;
        llIllIlllI[130] = (-((-6289) & 31421)) & (-66) & 28655;
        llIllIlllI[131] = (-((-343) & 29183)) & (-2) & 31743;
        llIllIlllI[132] = (-((-4353) & 21321)) & (-4099) & 24527;
        llIllIlllI[133] = (-9217) & 12133;
        llIllIlllI[134] = (-21506) & 24417;
        llIllIlllI[135] = (-20529) & 23991;
        llIllIlllI[136] = (-((-12899) & 29419)) & (-12289) & 31711;
        llIllIlllI[137] = (-((-1665) & 30341)) & (-129) & 31733;
        llIllIlllI[138] = (-654) & 3757;
        llIllIlllI[139] = (-((-8267) & 13291)) & (-8197) & 16383;
        llIllIlllI[140] = (-((-4103) & 13335)) & (-129) & 12287;
        llIllIlllI[141] = (-24577) & 28031;
        llIllIlllI[142] = (-((-8449) & 29955)) & (-133) & 24574;
        llIllIlllI[143] = (-((-115) & 16507)) & (-9282) & 28639;
        llIllIlllI[144] = (-((-16561) & 29369)) & (-16579) & 32767;
        llIllIlllI[145] = (-(55 ^ 58)) & (-13345) & 16255;
        llIllIlllI[146] = (-((-29075) & 29659)) & (-28709) & 32765;
        llIllIlllI[147] = (-((-2329) & 28063)) & (-33) & 28671;
        llIllIlllI[148] = (-21065) & 24539;
        llIllIlllI[149] = (-21638) & 24543;
        llIllIlllI[150] = (-((-8201) & 31019)) & (-74) & 32767;
        llIllIlllI[151] = (-20842) & 30715;
        llIllIlllI[152] = (-18793) & 28665;
        llIllIlllI[153] = (-625) & 4089;
        llIllIlllI[154] = (-1185) & 4095;
        llIllIlllI[155] = (-29251) & 32719;
        llIllIlllI[156] = (-((-2719) & 24255)) & (-5) & 24447;
        llIllIlllI[157] = (-28747) & 32222;
        llIllIlllI[158] = (-2097) & 11966;
        llIllIlllI[159] = (-13473) & 16381;
        llIllIlllI[160] = (-6177) & 16053;
        llIllIlllI[161] = (-16921) & 32283;
        llIllIlllI[162] = (-((-4177) & 15057)) & (-333) & 16335;
        llIllIlllI[163] = (11 ^ 102) ^ (72 ^ 115);
        llIllIlllI[164] = (((15 + 163) - (-6)) + 47) ^ (((3 + 119) - 118) + 172);
        llIllIlllI[165] = (19 ^ 3) ^ (67 ^ 11);
        llIllIlllI[166] = (107 ^ 83) ^ (14 ^ 111);
        llIllIlllI[167] = (235 ^ 173) ^ (81 ^ 77);
        llIllIlllI[168] = (167 ^ 131) ^ (((90 + 28) - 18) + 27);
        llIllIlllI[169] = 93 ^ 1;
        llIllIlllI[170] = (-28707) & 32702;
        llIllIlllI[171] = (-12321) & 16317;
        llIllIlllI[172] = (-((-11422) & 31903)) & (-8193) & 32671;
        llIllIlllI[173] = (-((-4025) & 24505)) & (-8193) & 32671;
        llIllIlllI[174] = 65 ^ 28;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIllIlllI[4];
    }

    private static boolean lIlllIIIIlIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlllIIIIllIl(C0018e.j(llIllIlllI[2]), llIllIlllI[18])) {
            ?? r0 = llIllIlllI[3];
            "".length();
            return (((241 ^ 199) ^ (241 ^ 129)) & (((56 ^ 105) ^ (59 ^ 44)) ^ (-" ".length()))) != 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
        }
        return llIllIlllI[4];
    }

    private static boolean lIlllIIIIlIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlllIIIIlIll(Object obj) {
        return obj != null;
    }

    static {
        lIlllIIIIIlII();
        lIlllIIIIIIII();
        lq = llIllIlllI[7];
        lt = llIllIlllI[118];
        ls = llIllIlllI[6];
        kQ = llIllIlllI[60];
        lm = llIllIlllI[119];
        kJ = llIllIlllI[3];
        lo = llIllIlllI[120];
        kI = llIllIlllI[2];
        kO = llIllIlllI[82];
        kG = llIllIlllI[0];
        lp = llIllIlllI[121];
        ln = llIllIlllI[122];
        kH = llIllIlllI[1];
        kM = llIllIlllI[14];
        kP = llIllIlllI[17];
        kR = llIllIlllI[39];
        lr = llIllIlllI[5];
        kK = llIllIlllI[1];
        kS = llIllIlllI[19];
        lv = llIllIlllI[9];
        kN = llIllIlllI[18];
        lu = llIllIlllI[8];
        kL = llIllIlllI[12];
        kv = new WorldPoint(llIllIlllI[123], llIllIlllI[59], llIllIlllI[4]);
        kw = new WorldPoint(llIllIlllI[62], llIllIlllI[124], llIllIlllI[4]);
        kx = new WorldPoint(llIllIlllI[125], llIllIlllI[94], llIllIlllI[4]);
        ky = new WorldArea(llIllIlllI[126], llIllIlllI[127], llIllIlllI[31], llIllIlllI[14], llIllIlllI[4]);
        kz = new WorldArea(llIllIlllI[128], llIllIlllI[127], llIllIlllI[30], llIllIlllI[14], llIllIlllI[4]);
        kA = new WorldArea(llIllIlllI[129], llIllIlllI[130], llIllIlllI[15], llIllIlllI[22], llIllIlllI[4]);
        kB = new WorldArea(llIllIlllI[131], llIllIlllI[132], llIllIlllI[24], llIllIlllI[15], llIllIlllI[4]);
        kC = new WorldArea(llIllIlllI[133], llIllIlllI[132], llIllIlllI[18], llIllIlllI[13], llIllIlllI[4]);
        kD = new WorldArea(llIllIlllI[134], llIllIlllI[135], llIllIlllI[21], llIllIlllI[18], llIllIlllI[4]);
        kE = new WorldArea(llIllIlllI[136], llIllIlllI[132], llIllIlllI[15], llIllIlllI[15], llIllIlllI[4]);
        kF = new WorldArea(llIllIlllI[137], llIllIlllI[132], llIllIlllI[15], llIllIlllI[13], llIllIlllI[4]);
        kT = new WorldPoint(llIllIlllI[138], llIllIlllI[139], llIllIlllI[1]);
        kU = new WorldPoint(llIllIlllI[140], llIllIlllI[141], llIllIlllI[4]);
        kV = new WorldPoint(llIllIlllI[142], llIllIlllI[127], llIllIlllI[4]);
        kW = new WorldPoint(llIllIlllI[143], llIllIlllI[144], llIllIlllI[4]);
        kX = new WorldPoint(llIllIlllI[145], llIllIlllI[146], llIllIlllI[4]);
        kY = new WorldPoint(llIllIlllI[131], llIllIlllI[94], llIllIlllI[4]);
        kZ = new WorldPoint(llIllIlllI[147], llIllIlllI[148], llIllIlllI[4]);
        la = new WorldPoint(llIllIlllI[149], llIllIlllI[150], llIllIlllI[4]);
        lb = new WorldPoint(llIllIlllI[145], llIllIlllI[151], llIllIlllI[4]);
        lc = new WorldPoint(llIllIlllI[131], llIllIlllI[151], llIllIlllI[4]);
        ld = new WorldPoint(llIllIlllI[131], llIllIlllI[152], llIllIlllI[4]);
        le = new WorldPoint(llIllIlllI[136], llIllIlllI[151], llIllIlllI[4]);
        lf = new WorldPoint(llIllIlllI[136], llIllIlllI[152], llIllIlllI[4]);
        lg = new WorldPoint(llIllIlllI[58], llIllIlllI[153], llIllIlllI[4]);
        lh = new WorldPoint(llIllIlllI[62], llIllIlllI[135], llIllIlllI[4]);
        li = new WorldPoint(llIllIlllI[154], llIllIlllI[155], llIllIlllI[4]);
        lj = new WorldArea(new WorldPoint(llIllIlllI[156], llIllIlllI[157], llIllIlllI[4]), new WorldPoint(llIllIlllI[58], llIllIlllI[94], llIllIlllI[4]));
        lk = new WorldArea(new WorldPoint(llIllIlllI[145], llIllIlllI[158], llIllIlllI[4]), new WorldPoint(llIllIlllI[159], llIllIlllI[160], llIllIlllI[4]));
        ll = new WorldArea(llIllIlllI[62], llIllIlllI[130], llIllIlllI[14], llIllIlllI[22], llIllIlllI[4]);
        bv = new ArrayList();
        lw = llIllIlllI[161];
        lx = llIllIlllI[162];
        ly = llIllIlIlI[llIllIlllI[163]];
        String[] strArr = new String[llIllIlllI[14]];
        strArr[llIllIlllI[4]] = llIllIlIlI[llIllIlllI[164]];
        strArr[llIllIlllI[3]] = llIllIlIlI[llIllIlllI[165]];
        strArr[llIllIlllI[1]] = llIllIlIlI[llIllIlllI[166]];
        strArr[llIllIlllI[12]] = llIllIlIlI[llIllIlllI[167]];
        strArr[llIllIlllI[15]] = llIllIlIlI[llIllIlllI[168]];
        strArr[llIllIlllI[13]] = llIllIlIlI[llIllIlllI[169]];
        fG = strArr;
        int[] iArr = new int[llIllIlllI[15]];
        iArr[llIllIlllI[4]] = llIllIlllI[170];
        iArr[llIllIlllI[3]] = llIllIlllI[171];
        iArr[llIllIlllI[1]] = llIllIlllI[172];
        iArr[llIllIlllI[12]] = llIllIlllI[173];
        lz = iArr;
    }

    private static void lIlllIIIIIIII() {
        llIllIlIlI = new String[llIllIlllI[174]];
        llIllIlIlI[llIllIlllI[4]] = lIllIlllIllll("dsvBX5G2qmd+K5/q4ac7rg==", "RkTdK");
        llIllIlIlI[llIllIlllI[3]] = lIllIllllIIII("Fi8MJBs4IwZtCiU/CyMPcC8WKAUjakI+HzkyASUBPiFCLwkzLUI5B3A3FygbJC8MKg==", "PFbMh");
        llIllIlIlI[llIllIlllI[1]] = lIllIllllIIIl("NgXcn1pAxpBWfiXyXAGQTQ==", "RGmJw");
        llIllIlIlI[llIllIlllI[12]] = lIllIllllIIIl("nt7Wn69HNo0=", "emMmW");
        llIllIlIlI[llIllIlllI[15]] = lIllIllllIIII("KiIEcycLYwEnMhY3", "dCrSS");
        llIllIlIlI[llIllIlllI[13]] = lIllIllllIIII("KTsiDQY=", "mIKcm");
        llIllIlIlI[llIllIlllI[14]] = lIllIllllIIII("DCwQ", "NCirJ");
        llIllIlIlI[llIllIlllI[18]] = lIllIllllIIII("Lwg3EREAHSgWEUEdLlgZFB0yERIESSUXGRM=", "aiAxv");
        llIllIlIlI[llIllIlllI[20]] = lIllIlllIllll("8I2gcyN4rbQ=", "qWhNw");
        llIllIlIlI[llIllIlllI[21]] = lIllIlllIllll("rsnj6i1O7SGpjG2gS8fg+g==", "nsoRs");
        llIllIlIlI[llIllIlllI[22]] = lIllIllllIIII("PighH3cHKSoRKA==", "rGNtZ");
        llIllIlIlI[llIllIlllI[24]] = lIllIllllIIIl("UtY9REEKl8izEU3wopnXWg==", "jtduA");
        llIllIlIlI[llIllIlllI[25]] = lIllIlllIllll("SMFgh4T/24Q=", "Ryuat");
        llIllIlIlI[llIllIlllI[26]] = lIllIllllIIIl("HSo6qvMFUyc=", "iiazt");
        llIllIlIlI[llIllIlllI[27]] = lIllIlllIllll("5t/kGII5sTuykY7KfQiQIR9sOK/1tBBV", "Cqgfe");
        llIllIlIlI[llIllIlllI[28]] = lIllIllllIIII("KA0PViMJTBQXMAgJDVY1CRQ=", "flyvW");
        llIllIlIlI[llIllIlllI[29]] = lIllIlllIllll("Qw7DELHuVQMh7vHIMdftYw==", "YlMSg");
        llIllIlIlI[llIllIlllI[30]] = lIllIllllIIII("EikHADQhaAEIPSgtGA==", "FHliZ");
        llIllIlIlI[llIllIlllI[31]] = lIllIllllIIIl("fTelrXwuEq8=", "WrSFj");
        llIllIlIlI[llIllIlllI[32]] = lIllIllllIIIl("rlocs7gAJjg=", "buXJE");
        llIllIlIlI[llIllIlllI[33]] = lIllIllllIIIl("SRyR1nK/JrU=", "BpUDY");
        llIllIlIlI[llIllIlllI[34]] = lIllIllllIIII("OScCOgoC", "jBcHi");
        llIllIlIlI[llIllIlllI[35]] = lIllIllllIIIl("FhiWASREbco=", "DEQDu");
        llIllIlIlI[llIllIlllI[36]] = lIllIllllIIII("JSQDAiUIPgg=", "fKmvL");
        llIllIlIlI[llIllIlllI[37]] = lIllIlllIllll("hkISwjo7Y5g=", "bbPjO");
        llIllIlIlI[llIllIlllI[38]] = lIllIllllIIIl("ks1ximmI4k8=", "WgOVr");
        llIllIlIlI[llIllIlllI[40]] = lIllIllllIIII("BTARRBIkcQoFASU0E0QEJCk=", "KQgdf");
        llIllIlIlI[llIllIlllI[41]] = lIllIllllIIII("FgIXMwA0BQM=", "UwgQo");
        llIllIlIlI[llIllIlllI[42]] = lIllIlllIllll("dpFFxKEqE8u8tazVnAvvFQ==", "reVWn");
        llIllIlIlI[llIllIlllI[43]] = lIllIllllIIIl("+aEZlB7prIo=", "bAQWh");
        llIllIlIlI[llIllIlllI[44]] = lIllIlllIllll("ZCi+Z2VOQSE=", "RPqJz");
        llIllIlIlI[llIllIlllI[45]] = lIllIlllIllll("g5lTSS+/8RU=", "CrKrL");
        llIllIlIlI[llIllIlllI[46]] = lIllIllllIIII("Bg8PEBM9", "Ujnbp");
        llIllIlIlI[llIllIlllI[47]] = lIllIlllIllll("4mpJr51Ea8Nesg1XOq+3aA==", "vowvW");
        llIllIlIlI[llIllIlllI[48]] = lIllIllllIIII("Njk0Jw==", "XLXKx");
        llIllIlIlI[llIllIlllI[49]] = lIllIllllIIIl("5z7fHL0clQM=", "hCzeW");
        llIllIlIlI[llIllIlllI[50]] = lIllIllllIIII("NDUEdQQVdBE9FR8nF3UDCjsG", "zTrUp");
        llIllIlIlI[llIllIlllI[51]] = lIllIlllIllll("ocXk2fSHXbftc3qgiCr+/g==", "pWoHz");
        llIllIlIlI[llIllIlllI[52]] = lIllIllllIIII("Ji4vFSM=", "kAZfF");
        llIllIlIlI[llIllIlllI[53]] = lIllIllllIIIl("U7Wyoi1EDiwuC8vMEYS17g==", "JiDEA");
        llIllIlIlI[llIllIlllI[54]] = lIllIllllIIIl("oMtdfqeoV+w=", "ydWqG");
        llIllIlIlI[llIllIlllI[55]] = lIllIllllIIIl("1Aek4mvJxd4=", "xIScG");
        llIllIlIlI[llIllIlllI[56]] = lIllIllllIIIl("lu4ntwpozWmi4MeLwC5kMw==", "Ljsoj");
        llIllIlIlI[llIllIlllI[57]] = lIllIllllIIII("Kz86HQUHPylYGg8rKw==", "nQNxw");
        llIllIlIlI[llIllIlllI[61]] = lIllIlllIllll("MzyKA7FLB7eIs7tSigEVeFOfPkVWI44/", "gtRxz");
        llIllIlIlI[llIllIlllI[63]] = lIllIllllIIIl("HFE/5laHXYU=", "VTvLA");
        llIllIlIlI[llIllIlllI[64]] = lIllIlllIllll("zNfTPgPasU7PPu4el+DMow==", "YvwFX");
        llIllIlIlI[llIllIlllI[65]] = lIllIlllIllll("6yEUDI6P8rc8Fg0u1n+1eX2oWoW9fy25", "bWjfE");
        llIllIlIlI[llIllIlllI[66]] = lIllIllllIIIl("B1jWeBNCwto=", "WSYKI");
        llIllIlIlI[llIllIlllI[67]] = lIllIllllIIII("KiY6GQcHIGkeHgwrJQ==", "iGImn");
        llIllIlIlI[llIllIlllI[68]] = lIllIlllIllll("xekBVM7EHKTZ7jQiwNCoJw==", "hQsYk");
        llIllIlIlI[llIllIlllI[69]] = lIllIllllIIII("HzECIGMrLR4g", "YXpEC");
        llIllIlIlI[llIllIlllI[70]] = lIllIllllIIIl("ZGZDMEts7SA=", "EEyoA");
        llIllIlIlI[llIllIlllI[71]] = lIllIllllIIIl("uS8L9Hvl++U=", "LKcaQ");
        llIllIlIlI[llIllIlllI[72]] = lIllIllllIIII("AA8GDw0zTg8HDzg=", "Tnmfc");
        llIllIlIlI[llIllIlllI[73]] = lIllIllllIIIl("i18sC11WfUM=", "XItMD");
        llIllIlIlI[llIllIlllI[74]] = lIllIllllIIII("ITI+JA==", "cSRHR");
        llIllIlIlI[llIllIlllI[75]] = lIllIllllIIII("MSEoCx0aPSpKAhIx", "sSMjv");
        llIllIlIlI[llIllIlllI[76]] = lIllIlllIllll("oDBws0Xvdl4=", "MFQOx");
        llIllIlIlI[llIllIlllI[77]] = lIllIllllIIIl("FPt8TdwGx1nY40XtclMZ9R6NZkR9TmsU", "VwUNJ");
        llIllIlIlI[llIllIlllI[78]] = lIllIlllIllll("gdfLUAmRyyzTYN12ibKv5cryaZeQn7mZ", "KQkTb");
        llIllIlIlI[llIllIlllI[79]] = lIllIlllIllll("LunO3cmPHwQ=", "HRUUf");
        llIllIlIlI[llIllIlllI[80]] = lIllIllllIIIl("eMrViHnMlmo=", "kToaP");
        llIllIlIlI[llIllIlllI[81]] = lIllIllllIIII("DSoEBhQhKhdDCyk+FQ==", "HDpcf");
        llIllIlIlI[llIllIlllI[83]] = lIllIllllIIIl("DrxmzSFvAZ21gjJ831hw1FYzFMcngvAx", "cTfei");
        llIllIlIlI[llIllIlllI[84]] = lIllIllllIIII("Pw4TayEeTxYuNh4BAWsmAQAR", "qoeKU");
        llIllIlIlI[llIllIlllI[85]] = lIllIlllIllll("X40+6hhuzBLfc+8ZnkztORH5c+cFVfip", "bWkzM");
        llIllIlIlI[llIllIlllI[86]] = lIllIllllIIII("PAcYSDwdRggHPRwSDwEm", "rfnhH");
        llIllIlIlI[llIllIlllI[87]] = lIllIlllIllll("Wk1JpTRhi1LQdGj3l7zP0A==", "Fevpz");
        llIllIlIlI[llIllIlllI[88]] = lIllIlllIllll("v9e5Q3wJMGBUV+E5+uz5ZA==", "LeRnU");
        llIllIlIlI[llIllIlllI[89]] = lIllIllllIIII("Jj4oOQk=", "eVMZb");
        llIllIlIlI[llIllIlllI[90]] = lIllIllllIIII("Fz8dGhA6JRY=", "TPsny");
        llIllIlIlI[llIllIlllI[91]] = lIllIlllIllll("jgFdNlPJ3cA=", "AGITL");
        llIllIlIlI[llIllIlllI[92]] = lIllIllllIIII("TQ==", "mJrVX");
        llIllIlIlI[llIllIlllI[95]] = lIllIllllIIII("BRs1RCMqGShENSQNIhYlaxciHiQ=", "KzCdA");
        llIllIlIlI[llIllIlllI[96]] = lIllIlllIllll("WOSVt6sCd4KK+eJ41mwFxN7PewcTx+oC", "gFIqO");
        llIllIlIlI[llIllIlllI[97]] = lIllIllllIIII("DBccGTIjAgMeMmICBVA3IxgB", "BvjpU");
        llIllIlIlI[llIllIlllI[98]] = lIllIllllIIII("BhgcNDMnD1k4OycD", "IhyZZ");
        llIllIlIlI[llIllIlllI[100]] = lIllIlllIllll("tpeWowpDKG7pQA0eSr54xGAbcbNFDRpO", "cBLEY");
        llIllIlIlI[llIllIlllI[102]] = lIllIllllIIIl("0ZcHxSRdJdZsGaA1l3xRHkHMKXY8tcUfNqegQH8vNJTsh4r+wqD1etcZUaghWM9e", "Ucsfk");
        llIllIlIlI[llIllIlllI[16]] = lIllIllllIIIl("LtgvixBcMUBbpbP64OL4x6cQJiVnPF8VJ/g2RDmEtqvzHXeepKBoIuYf5sGPjEvq", "cTbfk");
        llIllIlIlI[llIllIlllI[103]] = lIllIllllIIIl("fH4y2vt5cWPm+22zlLG+u2CWDUY/PMZfM0mbPki+4krVzfsyqakdJ00r16mlzWHa", "JxVqy");
        llIllIlIlI[llIllIlllI[104]] = lIllIlllIllll("wuAH4TsBbHdLsjpaf54dXB/kiYkBjxwTd0xSjX2EWiGfNdaeVMbHEqfLkDY+1MYa", "jUshU");
        llIllIlIlI[llIllIlllI[106]] = lIllIllllIIIl("Xyig9HK5xnS1GtkelTa1UxlQws2QC0rom5eZupuMkYhXcdjmBH5uHSXJPbA+rsIZ", "UsNGR");
        llIllIlIlI[llIllIlllI[116]] = lIllIllllIIIl("AP9kpjh/vAhJp9bZShL+wSTi5j/Osicm", "XQFID");
        llIllIlIlI[llIllIlllI[117]] = lIllIllllIIIl("ifVUBYVmuRO0Grbxyuoo+SO/ZxaxY1sN", "YnFdd");
        llIllIlIlI[llIllIlllI[163]] = lIllIllllIIIl("sbYB0frn4Vrv1eNRB4O4rw==", "omNuA");
        llIllIlIlI[llIllIlllI[164]] = lIllIllllIIIl("2bSxKfvzgNzgyRuA90fQC0ocXwrgUB06", "huwjX");
        llIllIlIlI[llIllIlllI[165]] = lIllIllllIIIl("b4yaNmwDGa5vhhBx4SIXzQ==", "mROVI");
        llIllIlIlI[llIllIlllI[166]] = lIllIllllIIIl("YVj0MxBu5sfowdAi/3LosIXnkJUunsJ3HHbglZXrYLt2itZXXi5ZfCkY4iPcw1kP", "LVdXY");
        llIllIlIlI[llIllIlllI[167]] = lIllIllllIIIl("wZXByQjG8E8=", "pPjJn");
        llIllIlIlI[llIllIlllI[168]] = lIllIllllIIIl("dDgNC2tLydewp7gAD6h5rG601GPI7pdk", "vEXKK");
        llIllIlIlI[llIllIlllI[169]] = lIllIllllIIII("ACxFUyFoKwVTGyoiSQQALjNJOkgsJgdTDCBp", "OGish");
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0b37, code lost:
        if (lIlllIIIIlIIl(net.unethicalite.api.entities.Players.getLocal().getWorldLocation().distanceTo(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.P.lh), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.P.llIllIlllI[12]) != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0da3, code lost:
        if (lIlllIIIIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L223;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0dcd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ba  */
    /* JADX WARN: Type inference failed for: r0v652, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dh() {
        if (lIlllIIIIIlIl(C0018e.j(llIllIlllI[0]), llIllIlllI[1])) {
            try {
                X.dR();
                "".length();
                if (" ".length() <= ((102 ^ 43) & ((227 ^ 174) ^ (-1)))) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (lIlllIIIIIllI(C0018e.j(llIllIlllI[0]), llIllIlllI[1]) && lIlllIIIIIlIl(C0018e.j(llIllIlllI[2]), llIllIlllI[3])) {
            if (lIlllIIIIIlll(bt ? 1 : 0)) {
                AccBuilderSotf.c = llIllIlIlI[llIllIlllI[4]];
                C0015b.a(bv);
                if (lIlllIIIIIlIl(bv.size(), llIllIlllI[3])) {
                    System.out.println(llIllIlIlI[llIllIlllI[3]]);
                    bt = llIllIlllI[4];
                }
            }
            do {
                if (lIlllIIIIIlll(I.co() ? 1 : 0)) {
                    int[] iArr = new int[llIllIlllI[3]];
                    iArr[llIllIlllI[4]] = llIllIlllI[5];
                    if (lIlllIIIIIlll(Inventory.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[llIllIlllI[3]];
                        iArr2[llIllIlllI[4]] = llIllIlllI[6];
                        if (lIlllIIIIIlll(Inventory.contains(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[llIllIlllI[3]];
                            iArr3[llIllIlllI[4]] = llIllIlllI[7];
                            if (lIlllIIIIIlll(Inventory.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[llIllIlllI[3]];
                                iArr4[llIllIlllI[4]] = llIllIlllI[8];
                                if (lIlllIIIIIlll(Inventory.contains(iArr4) ? 1 : 0)) {
                                    int[] iArr5 = new int[llIllIlllI[3]];
                                    iArr5[llIllIlllI[4]] = llIllIlllI[9];
                                    if (lIlllIIIIIlll(Inventory.contains(iArr5) ? 1 : 0)) {
                                        int[] iArr6 = new int[llIllIlllI[3]];
                                        iArr6[llIllIlllI[4]] = llIllIlllI[10];
                                        if (!lIlllIIIIlIII(Inventory.contains(iArr6) ? 1 : 0)) {
                                            if (lIlllIIIIlIII(bt ? 1 : 0)) {
                                                if (lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kU), llIllIlllI[11])) {
                                                    int[] iArr7 = new int[llIllIlllI[3]];
                                                    iArr7[llIllIlllI[4]] = llIllIlllI[10];
                                                    if (lIlllIIIIIlll(Inventory.contains(iArr7) ? 1 : 0)) {
                                                        AccBuilderSotf.c = llIllIlIlI[llIllIlllI[1]];
                                                        int[] iArr8 = new int[llIllIlllI[3]];
                                                        iArr8[llIllIlllI[4]] = llIllIlllI[10];
                                                        Inventory.getFirst(iArr8).interact(llIllIlIlI[llIllIlllI[12]]);
                                                        Time.sleepTicks(llIllIlllI[13]);
                                                        "".length();
                                                    }
                                                }
                                                if (lIlllIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(kU), llIllIlllI[11]) && lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kU), llIllIlllI[14])) {
                                                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[15]];
                                                    if (lIlllIIIIIlll(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlllIIIIIlIl(Movement.getRunEnergy(), llIllIlllI[16])) {
                                                        Inventory.getFirst(C0019f.ba).interact(llIllIlIlI[llIllIlllI[13]]);
                                                        Time.sleepTicks(llIllIlllI[3]);
                                                        "".length();
                                                    }
                                                    Movement.walkTo(kU);
                                                    "".length();
                                                    Time.sleepTicks(llIllIlllI[3]);
                                                    "".length();
                                                }
                                                if (lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(kU), llIllIlllI[14])) {
                                                    C0020g.a(llIllIlIlI[llIllIlllI[14]], fG);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (lIlllIIIIlIII(AccBuilderSotf.d ? 1 : 0)) {
                    dj();
                    Time.sleepTicks(llIllIlllI[3]);
                    "".length();
                    "".length();
                } else if (lIlllIIIIlIII(bt ? 1 : 0)) {
                }
            } while ((((((204 + 208) - 235) + 47) ^ (((54 + 5) - 16) + 88)) & (((93 ^ 19) ^ (187 ^ 150)) ^ (-" ".length()))) <= "  ".length());
            return;
        }
        if (lIlllIIIIIllI(C0018e.j(llIllIlllI[0]), llIllIlllI[1]) && lIlllIIIIIllI(C0018e.j(llIllIlllI[2]), llIllIlllI[3])) {
            if (lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kX), llIllIlllI[15]) && lIlllIIIIlIII(lk.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] iArr9 = new int[llIllIlllI[3]];
                iArr9[llIllIlllI[4]] = llIllIlllI[17];
                if (lIlllIIIIlIII(Inventory.contains(iArr9) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[18]];
                    Movement.walkTo(kX);
                    "".length();
                    Time.sleepTicks(llIllIlllI[3]);
                    "".length();
                }
            }
            if (lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(kX), llIllIlllI[15]) && lIlllIIIIlIII(Players.getLocal().isMoving() ? 1 : 0)) {
                int[] iArr10 = new int[llIllIlllI[3]];
                iArr10[llIllIlllI[4]] = llIllIlllI[17];
                if (lIlllIIIIlIII(Inventory.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[llIllIlllI[3]];
                    iArr11[llIllIlllI[4]] = llIllIlllI[19];
                    TileObject nearest = TileObjects.getNearest(iArr11);
                    if (lIlllIIIIIlll(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr12 = new int[llIllIlllI[3]];
                        iArr12[llIllIlllI[4]] = llIllIlllI[8];
                        Inventory.getFirst(iArr12).interact(llIllIlIlI[llIllIlllI[20]]);
                        Time.sleepTicks(llIllIlllI[3]);
                        "".length();
                    }
                    if (lIlllIIIIlIII(Inventory.isFull() ? 1 : 0)) {
                        if (lIlllIIIIlIll(nearest) && lIlllIIIIlIII(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = llIllIlIlI[llIllIlllI[21]];
                            nearest.interact(llIllIlIlI[llIllIlllI[22]]);
                            Dialog.continueSpace();
                        }
                        Widget widget = Widgets.get(llIllIlllI[23], llIllIlllI[3]);
                        if (lIlllIIIIlIll(widget)) {
                            widget.interact(llIllIlIlI[llIllIlllI[24]]);
                            widget.interact(llIllIlllI[4]);
                            widget.interact(llIllIlIlI[llIllIlllI[25]]);
                            Keyboard.type(llIllIlIlI[llIllIlllI[26]]);
                        }
                    }
                }
            }
            if (lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(kX), llIllIlllI[15])) {
                int[] iArr13 = new int[llIllIlllI[3]];
                iArr13[llIllIlllI[4]] = llIllIlllI[17];
                if (lIlllIIIIIlll(Inventory.contains(iArr13) ? 1 : 0) && lIlllIIIIlIII(lj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[27]];
                    Movement.walkTo(lb);
                    "".length();
                    Time.sleepTicks(llIllIlllI[3]);
                    "".length();
                }
            }
            if (lIlllIIIIIlll(lk.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllIlIlI[llIllIlllI[28]];
                if (lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(lb), llIllIlllI[3])) {
                    Movement.walkTo(lb);
                    "".length();
                    Time.sleepTicks(llIllIlllI[3]);
                    "".length();
                }
                if (lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(lb), llIllIlllI[3])) {
                    String[] strArr = new String[llIllIlllI[3]];
                    strArr[llIllIlllI[4]] = llIllIlIlI[llIllIlllI[29]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[30]];
                    if (lIlllIIIIIlll(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr14 = new int[llIllIlllI[3]];
                        iArr14[llIllIlllI[4]] = llIllIlllI[8];
                        Inventory.getFirst(iArr14).interact(llIllIlIlI[llIllIlllI[31]]);
                        Time.sleepTicks(llIllIlllI[3]);
                        "".length();
                    }
                    if (lIlllIIIIlIll(nearest2)) {
                        String[] strArr2 = new String[llIllIlllI[3]];
                        strArr2[llIllIlllI[4]] = llIllIlIlI[llIllIlllI[32]];
                        if (lIlllIIIIIlll(nearest2.hasAction(strArr2) ? 1 : 0)) {
                            nearest2.interact(llIllIlIlI[llIllIlllI[33]]);
                            Time.sleepTicks(llIllIlllI[1]);
                            "".length();
                        }
                        String[] strArr3 = new String[llIllIlllI[3]];
                        strArr3[llIllIlllI[4]] = llIllIlIlI[llIllIlllI[34]];
                        if (lIlllIIIIIlll(nearest2.hasAction(strArr3) ? 1 : 0)) {
                            nearest2.interact(llIllIlIlI[llIllIlllI[35]]);
                            Time.sleepTicks(llIllIlllI[1]);
                            "".length();
                            Widget widget2 = Widgets.get(llIllIlllI[23], llIllIlllI[3]);
                            if (lIlllIIIIlIll(widget2)) {
                                widget2.interact(llIllIlIlI[llIllIlllI[36]]);
                                widget2.interact(llIllIlllI[4]);
                                widget2.interact(llIllIlIlI[llIllIlllI[37]]);
                                Keyboard.type(llIllIlIlI[llIllIlllI[38]]);
                            }
                        }
                    }
                }
            }
        }
        if (lIlllIIIIIllI(C0018e.j(llIllIlllI[0]), llIllIlllI[1]) && lIlllIIIIIllI(C0018e.j(llIllIlllI[2]), llIllIlllI[1])) {
            di = llIllIlllI[4];
            if (lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(kU), llIllIlllI[22])) {
                while (lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kX), llIllIlllI[1]) && lIlllIIIIlIII(AccBuilderSotf.d ? 1 : 0)) {
                    Movement.walkTo(kX);
                    "".length();
                    Time.sleepTicks(llIllIlllI[3]);
                    "".length();
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                }
            }
            int[] iArr15 = new int[llIllIlllI[3]];
            iArr15[llIllIlllI[4]] = llIllIlllI[39];
            if (lIlllIIIIlIII(Inventory.contains(iArr15) ? 1 : 0) && lIlllIIIIIlll(lk.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllIlIlI[llIllIlllI[40]];
                if (lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(lb), llIllIlllI[3])) {
                    Movement.walkTo(lb);
                    "".length();
                    Time.sleepTicks(llIllIlllI[3]);
                    "".length();
                }
                if (lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(lb), llIllIlllI[3])) {
                    String[] strArr4 = new String[llIllIlllI[3]];
                    strArr4[llIllIlllI[4]] = llIllIlIlI[llIllIlllI[41]];
                    TileObject nearest3 = TileObjects.getNearest(strArr4);
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[42]];
                    if (lIlllIIIIlIll(nearest3)) {
                        String[] strArr5 = new String[llIllIlllI[3]];
                        strArr5[llIllIlllI[4]] = llIllIlIlI[llIllIlllI[43]];
                        if (lIlllIIIIIlll(nearest3.hasAction(strArr5) ? 1 : 0)) {
                            nearest3.interact(llIllIlIlI[llIllIlllI[44]]);
                            Time.sleepTicks(llIllIlllI[1]);
                            "".length();
                        }
                        String[] strArr6 = new String[llIllIlllI[3]];
                        strArr6[llIllIlllI[4]] = llIllIlIlI[llIllIlllI[45]];
                        if (lIlllIIIIIlll(nearest3.hasAction(strArr6) ? 1 : 0)) {
                            nearest3.interact(llIllIlIlI[llIllIlllI[46]]);
                            Time.sleepTicks(llIllIlllI[1]);
                            "".length();
                            Widget widget3 = Widgets.get(llIllIlllI[23], llIllIlllI[3]);
                            if (lIlllIIIIlIll(widget3)) {
                                widget3.interact(llIllIlIlI[llIllIlllI[47]]);
                                widget3.interact(llIllIlllI[4]);
                                widget3.interact(llIllIlIlI[llIllIlllI[48]]);
                                Keyboard.type(llIllIlIlI[llIllIlllI[49]]);
                            }
                        }
                    }
                }
            }
            int[] iArr16 = new int[llIllIlllI[3]];
            iArr16[llIllIlllI[4]] = llIllIlllI[39];
            if (lIlllIIIIIlll(Inventory.contains(iArr16) ? 1 : 0) && lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kY), llIllIlllI[3])) {
                AccBuilderSotf.c = llIllIlIlI[llIllIlllI[50]];
                Movement.walkTo(kY);
                "".length();
                Time.sleepTicks(llIllIlllI[3]);
                "".length();
            }
            if (lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(kY), llIllIlllI[1])) {
                String[] strArr7 = new String[llIllIlllI[3]];
                strArr7[llIllIlllI[4]] = llIllIlIlI[llIllIlllI[51]];
                TileObject nearest4 = TileObjects.getNearest(strArr7);
                String[] strArr8 = new String[llIllIlllI[3]];
                strArr8[llIllIlllI[4]] = llIllIlIlI[llIllIlllI[52]];
                NPC nearest5 = NPCs.getNearest(strArr8);
                if (lIlllIIIIlIll(nearest4) && lIlllIIIIllII(nearest5)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[53]];
                    String[] strArr9 = new String[llIllIlllI[3]];
                    strArr9[llIllIlllI[4]] = llIllIlIlI[llIllIlllI[54]];
                    if (lIlllIIIIIlll(Inventory.contains(strArr9) ? 1 : 0)) {
                        String[] strArr10 = new String[llIllIlllI[3]];
                        strArr10[llIllIlllI[4]] = llIllIlIlI[llIllIlllI[55]];
                        Inventory.getFirst(strArr10).useOn(nearest4);
                    }
                    Time.sleepTicks(llIllIlllI[3]);
                    "".length();
                }
                if (lIlllIIIIlIll(nearest5)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[56]];
                    int[] iArr17 = new int[llIllIlllI[3]];
                    iArr17[llIllIlllI[4]] = llIllIlllI[39];
                    if (lIlllIIIIIlll(Inventory.contains(iArr17) ? 1 : 0)) {
                        int[] iArr18 = new int[llIllIlllI[3]];
                        iArr18[llIllIlllI[4]] = llIllIlllI[39];
                        Inventory.getFirst(iArr18).useOn(nearest5);
                    }
                    Time.sleepTicks(llIllIlllI[3]);
                    "".length();
                }
            }
        }
        if (lIlllIIIIIlll(lj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIIIIllI(C0018e.j(llIllIlllI[2]), llIllIlllI[12])) {
            AccBuilderSotf.c = llIllIlIlI[llIllIlllI[57]];
            Movement.walkTo(new WorldPoint(llIllIlllI[58], llIllIlllI[59], llIllIlllI[4]));
            "".length();
            Time.sleepTicks(llIllIlllI[3]);
            "".length();
        }
        if (lIlllIIIIlIII(lj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIIIIllI(C0018e.j(llIllIlllI[2]), llIllIlllI[12])) {
            int[] iArr19 = new int[llIllIlllI[3]];
            iArr19[llIllIlllI[4]] = llIllIlllI[60];
            if (lIlllIIIIIlll(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[llIllIlllI[3]];
                iArr20[llIllIlllI[4]] = llIllIlllI[60];
                if (lIlllIIIIIlll(Inventory.contains(iArr20) ? 1 : 0)) {
                }
            }
            AccBuilderSotf.c = llIllIlIlI[llIllIlllI[61]];
            if (lIlllIIIIllIl(Movement.getRunEnergy(), llIllIlllI[33])) {
                di();
            }
        }
        if (lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(lh), llIllIlllI[12])) {
            int[] iArr21 = new int[llIllIlllI[3]];
            iArr21[llIllIlllI[4]] = llIllIlllI[60];
            if (lIlllIIIIIlll(Inventory.contains(iArr21) ? 1 : 0) && lIlllIIIIIllI(Players.getLocal().getWorldLocation().getX(), llIllIlllI[62])) {
                String[] strArr11 = new String[llIllIlllI[3]];
                strArr11[llIllIlllI[4]] = llIllIlIlI[llIllIlllI[63]];
                TileObject nearest6 = TileObjects.getNearest(strArr11);
                if (lIlllIIIIlIll(nearest6)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[64]];
                    int[] iArr22 = new int[llIllIlllI[3]];
                    iArr22[llIllIlllI[4]] = llIllIlllI[60];
                    if (lIlllIIIIIlll(Inventory.contains(iArr22) ? 1 : 0)) {
                        int[] iArr23 = new int[llIllIlllI[3]];
                        iArr23[llIllIlllI[4]] = llIllIlllI[60];
                        Inventory.getFirst(iArr23).useOn(nearest6);
                        Time.sleepTicks(llIllIlllI[1]);
                        "".length();
                    }
                }
            }
        }
        if (lIlllIIIIIlll(ll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            int[] iArr24 = new int[llIllIlllI[3]];
            iArr24[llIllIlllI[4]] = llIllIlllI[60];
            if (lIlllIIIIIlll(Inventory.contains(iArr24) ? 1 : 0)) {
                if (lIlllIIIIlIII(Players.getLocal().getWorldLocation().equals(kV) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[65]];
                    Movement.walkTo(kV);
                    "".length();
                }
                if (lIlllIIIIlIlI(Skills.getBoostedLevel(Skill.HITPOINTS), llIllIlllI[13])) {
                    int[] iArr25 = new int[llIllIlllI[3]];
                    iArr25[llIllIlllI[4]] = llIllIlllI[8];
                    if (lIlllIIIIIlll(Inventory.contains(iArr25) ? 1 : 0)) {
                        int[] iArr26 = new int[llIllIlllI[3]];
                        iArr26[llIllIlllI[4]] = llIllIlllI[8];
                        Inventory.getFirst(iArr26).interact(llIllIlIlI[llIllIlllI[66]]);
                    }
                }
                if (lIlllIIIIIlll(Players.getLocal().getWorldLocation().equals(kV) ? 1 : 0)) {
                    NPC nearest7 = NPCs.getNearest(lz);
                    if (lIlllIIIIlIll(nearest7) && lIlllIIIIlIII(nearest7.isDead() ? 1 : 0)) {
                        AccBuilderSotf.c = llIllIlIlI[llIllIlllI[67]];
                        if (lIlllIIIIIlIl(Skills.getLevel(Skill.MAGIC), llIllIlllI[21])) {
                            Magic.cast(SpellBook.Standard.WATER_STRIKE, nearest7);
                            Time.sleepTicks(llIllIlllI[3]);
                            "".length();
                        }
                        if (!lIlllIIIIIlIl(Skills.getLevel(Skill.MAGIC), llIllIlllI[26]) || lIlllIIIIIlIl(Skills.getLevel(Skill.MAGIC), llIllIlllI[21])) {
                            if (lIlllIIIIllIl(Skills.getLevel(Skill.MAGIC), llIllIlllI[21])) {
                                int[] iArr27 = new int[llIllIlllI[3]];
                                iArr27[llIllIlllI[4]] = llIllIlllI[6];
                                if (lIlllIIIIIlll(Inventory.contains(iArr27) ? 1 : 0)) {
                                    String[] strArr12 = new String[llIllIlllI[3]];
                                    strArr12[llIllIlllI[4]] = llIllIlIlI[llIllIlllI[68]];
                                }
                            }
                            if (lIlllIIIIllIl(Skills.getLevel(Skill.MAGIC), llIllIlllI[26])) {
                                String[] strArr13 = new String[llIllIlllI[3]];
                                strArr13[llIllIlllI[4]] = llIllIlIlI[llIllIlllI[69]];
                                if (lIlllIIIIIlll(Inventory.contains(strArr13) ? 1 : 0)) {
                                    Magic.cast(SpellBook.Standard.FIRE_STRIKE, nearest7);
                                    Time.sleepTicks(llIllIlllI[3]);
                                    "".length();
                                }
                            }
                        }
                        Magic.cast(SpellBook.Standard.EARTH_STRIKE, nearest7);
                        Time.sleepTicks(llIllIlllI[3]);
                        "".length();
                        if (lIlllIIIIllIl(Skills.getLevel(Skill.MAGIC), llIllIlllI[26])) {
                        }
                    }
                }
            }
        }
        if (lIlllIIIIIllI(C0018e.j(llIllIlllI[2]), llIllIlllI[14])) {
            String[] strArr14 = new String[llIllIlllI[3]];
            strArr14[llIllIlllI[4]] = llIllIlIlI[llIllIlllI[70]];
            if (lIlllIIIIlIII(Inventory.contains(strArr14) ? 1 : 0)) {
                String[] strArr15 = new String[llIllIlllI[3]];
                strArr15[llIllIlllI[4]] = llIllIlIlI[llIllIlllI[71]];
                TileItem nearest8 = TileItems.getNearest(strArr15);
                if (lIlllIIIIlIll(nearest8)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[72]];
                    nearest8.interact(llIllIlIlI[llIllIlllI[73]]);
                    Time.sleepTicks(llIllIlllI[1]);
                    "".length();
                }
            }
        }
        if (lIlllIIIIIllI(C0018e.j(llIllIlllI[2]), llIllIlllI[14])) {
            String[] strArr16 = new String[llIllIlllI[3]];
            strArr16[llIllIlllI[4]] = llIllIlIlI[llIllIlllI[74]];
            if (lIlllIIIIIlll(Inventory.contains(strArr16) ? 1 : 0)) {
                if (lIlllIIIIIlll(ll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] iArr28 = new int[llIllIlllI[3]];
                    iArr28[llIllIlllI[4]] = llIllIlllI[10];
                    if (lIlllIIIIIlll(Inventory.contains(iArr28) ? 1 : 0)) {
                        AccBuilderSotf.c = llIllIlIlI[llIllIlllI[75]];
                        int[] iArr29 = new int[llIllIlllI[3]];
                        iArr29[llIllIlllI[4]] = llIllIlllI[10];
                        Inventory.getFirst(iArr29).interact(llIllIlIlI[llIllIlllI[76]]);
                        Time.sleepTicks(llIllIlllI[13]);
                        "".length();
                    }
                }
                if (lIlllIIIIlIII(ll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kU), llIllIlllI[15])) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[77]];
                    Movement.walkTo(kU);
                    "".length();
                    Time.sleepTicks(llIllIlllI[3]);
                    "".length();
                }
                if (lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(kU), llIllIlllI[13])) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[78]];
                    if (lIlllIIIIIlIl(di, llIllIlllI[3])) {
                        aN.pZ += llIllIlllI[3];
                        aN.u(AccBuilderSotf.m);
                        di += llIllIlllI[3];
                        aN.pZ = llIllIlllI[4];
                        dj = llIllIlllI[4];
                    }
                    C0020g.a(llIllIlIlI[llIllIlllI[79]], fG);
                }
            }
        }
    }

    private static String lIllIllllIIII(String llllllllllllllllllIIIIlllIIIIlll, String llllllllllllllllllIIIIlllIIIIllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIIIIlllIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllIIIIlllIIIIllI.toCharArray();
        int llllllllllllllllllIIIIlllIIIIIll = llIllIlllI[4];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIllIlllI[4];
        while (lIlllIIIIIlIl(i, length)) {
            char llllllllllllllllllIIIIlllIIIlIII = charArray2[i];
            sb.append((char) (llllllllllllllllllIIIIlllIIIlIII ^ charArray[llllllllllllllllllIIIIlllIIIIIll % charArray.length]));
            "".length();
            llllllllllllllllllIIIIlllIIIIIll++;
            i++;
            "".length();
            if ((-" ".length()) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIllIlIlI[llIllIlllI[116]];
    }

    private static boolean lIlllIIIIllIl(int i, int i2) {
        return i >= i2;
    }

    public static void di() {
        if (lIlllIIIIIlll(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlllIIIIIlIl(Movement.getRunEnergy(), llIllIlllI[68])) {
            Inventory.getFirst(C0019f.ba).interact(llIllIlIlI[llIllIlllI[80]]);
            Time.sleepTicks(llIllIlllI[3]);
            "".length();
        }
        if (lIlllIIIIlIII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!lIlllIIIIlIII(lj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(kY), llIllIlllI[1])) {
            AccBuilderSotf.c = llIllIlIlI[llIllIlllI[81]];
            Movement.walkTo(new WorldPoint(llIllIlllI[58], llIllIlllI[59], llIllIlllI[4]));
            "".length();
            Time.sleepTicks(llIllIlllI[3]);
            "".length();
        }
        int[] iArr = new int[llIllIlllI[3]];
        iArr[llIllIlllI[4]] = llIllIlllI[82];
        NPC nearest = NPCs.getNearest(iArr);
        int[] iArr2 = new int[llIllIlllI[3]];
        iArr2[llIllIlllI[4]] = llIllIlllI[60];
        if (lIlllIIIIlIII(Inventory.contains(iArr2) ? 1 : 0)) {
            if (lIlllIIIIIlll(ky.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIIIlIll(nearest) && lIlllIIIIIlll(kE.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks(llIllIlllI[24]);
                "".length();
                while (lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kv), llIllIlllI[3]) && lIlllIIIIlIII(AccBuilderSotf.d ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[83]];
                    Movement.walkTo(kv);
                    "".length();
                    Time.sleepTicks(llIllIlllI[3]);
                    "".length();
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                }
            }
            if (lIlllIIIIIlll(kz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIIIlIll(nearest) && lIlllIIIIIlll(kB.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kw), llIllIlllI[3]) && lIlllIIIIlIII(AccBuilderSotf.d ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[84]];
                    Movement.walkTo(kw);
                    "".length();
                    Time.sleepTicks(llIllIlllI[3]);
                    "".length();
                    "".length();
                    if (((((39 + 85) - 111) + 172) ^ (((15 + 1) - 3) + 176)) < 0) {
                        return;
                    }
                }
            }
            if (lIlllIIIIIlll(kA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIIIlIll(nearest) && lIlllIIIIIlll(kF.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks(llIllIlllI[18]);
                "".length();
                while (lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kx), llIllIlllI[3]) && lIlllIIIIlIII(AccBuilderSotf.d ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[85]];
                    Movement.walkTo(kx);
                    "".length();
                    Time.sleepTicks(llIllIlllI[3]);
                    "".length();
                    "".length();
                    if ((151 ^ 147) < (-" ".length())) {
                        return;
                    }
                }
            }
            if (lIlllIIIIIlll(kD.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIIIlIll(nearest) && lIlllIIIIIlll(kF.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(li), llIllIlllI[1]) && lIlllIIIIlIII(AccBuilderSotf.d ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[86]];
                    Movement.walkTo(li);
                    "".length();
                    Time.sleepTicks(llIllIlllI[3]);
                    "".length();
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                }
            }
            if (lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(li), llIllIlllI[12])) {
                AccBuilderSotf.c = llIllIlIlI[llIllIlllI[87]];
                String[] strArr = new String[llIllIlllI[3]];
                strArr[llIllIlllI[4]] = llIllIlIlI[llIllIlllI[88]];
                TileObject nearest2 = TileObjects.getNearest(strArr);
                if (lIlllIIIIlIll(nearest2)) {
                    nearest2.interact(llIllIlIlI[llIllIlllI[89]]);
                    Time.sleepTicks(llIllIlllI[1]);
                    "".length();
                    Widget widget = Widgets.get(llIllIlllI[23], llIllIlllI[3]);
                    if (lIlllIIIIlIll(widget)) {
                        widget.interact(llIllIlIlI[llIllIlllI[90]]);
                        widget.interact(llIllIlllI[4]);
                        widget.interact(llIllIlIlI[llIllIlllI[91]]);
                        Keyboard.type(llIllIlIlI[llIllIlllI[92]]);
                    }
                }
            }
        }
        int[] iArr3 = new int[llIllIlllI[3]];
        iArr3[llIllIlllI[4]] = llIllIlllI[60];
        if (lIlllIIIIIlll(Inventory.contains(iArr3) ? 1 : 0)) {
            if (lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(li), llIllIlllI[12])) {
                while (lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIllIlllI[93], llIllIlllI[94], llIllIlllI[4])), llIllIlllI[3]) && lIlllIIIIlIII(AccBuilderSotf.d ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[95]];
                    Movement.walkTo(new WorldPoint(llIllIlllI[93], llIllIlllI[94], llIllIlllI[4]));
                    "".length();
                    Time.sleepTicks(llIllIlllI[3]);
                    "".length();
                    "".length();
                    if ((-" ".length()) > "   ".length()) {
                        return;
                    }
                }
            }
            if (lIlllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIllIlllI[93], llIllIlllI[94], llIllIlllI[4])), llIllIlllI[1]) && lIlllIIIIlIll(nearest) && lIlllIIIIIlll(kE.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (lIlllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(kw), llIllIlllI[3]) && lIlllIIIIlIII(AccBuilderSotf.d ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIlIlI[llIllIlllI[96]];
                    Movement.walkTo(kw);
                    "".length();
                    Time.sleepTicks(llIllIlllI[3]);
                    "".length();
                    "".length();
                    if (((((11 + 94) - (-16)) + 9) ^ (((115 + 47) - 40) + 13)) <= 0) {
                        return;
                    }
                }
            }
        }
    }

    private static String lIllIllllIIIl(String llllllllllllllllllIIIIllIlllIIlI, String llllllllllllllllllIIIIllIlllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIllIlllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIllIlllI[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIllIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIIllIlllIIll) {
            llllllllllllllllllIIIIllIlllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIIIIlllI(int i) {
        return i > 0;
    }

    private static boolean lIlllIIIIlIlI(int i, int i2) {
        return i <= i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        dh();
        return llIllIlllI[109];
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x025c, code lost:
        if (lIlllIIIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.P.llIllIlllI[22]) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x029f, code lost:
        if (lIlllIIIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.P.llIllIlllI[13]) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02e2, code lost:
        if (lIlllIIIIIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.P.llIllIlllI[33]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02e5, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.P.llIllIlIlI[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.P.llIllIlllI[104(0x68, float:1.46E-43)]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.P.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.P.llIllIlllI[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0300, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v184, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v199, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v214, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v223, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v232, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void dj() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlllIIIIlIll(nearest) && lIlllIIIIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllIlIlI[llIllIlllI[97]];
            C0000a.a(nearest);
        }
        if (lIlllIIIIlIll(nearest) && lIlllIIIIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlllIIIIlIII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderSotf.c = llIllIlIlI[llIllIlllI[98]];
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llIllIlllI[99]);
                "".length();
            }
            if (lIlllIIIIIlll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderSotf.c = llIllIlIlI[llIllIlllI[100]];
                if (lIlllIIIIlllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llIllIlllI[12]);
                    "".length();
                }
                if (lIlllIIIIlllI(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(llIllIlllI[1]);
                    "".length();
                }
                while (lIlllIIIIlIII(I.co() ? 1 : 0) && lIlllIIIIlIII(AccBuilderSotf.d ? 1 : 0)) {
                    I.cm();
                    Time.sleepTicks(llIllIlllI[3]);
                    "".length();
                    "".length();
                    if ("  ".length() == 0) {
                        return;
                    }
                }
                int[] iArr = new int[llIllIlllI[3]];
                iArr[llIllIlllI[4]] = llIllIlllI[7];
                if (lIlllIIIIIlll(Bank.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llIllIlllI[3]];
                    iArr2[llIllIlllI[4]] = llIllIlllI[7];
                    if (lIlllIIIIIlIl(Bank.getFirst(iArr2).getQuantity(), llIllIlllI[101])) {
                        Q();
                        System.out.println(llIllIlIlI[llIllIlllI[102]]);
                        bt = llIllIlllI[3];
                        return;
                    }
                }
                int[] iArr3 = new int[llIllIlllI[3]];
                iArr3[llIllIlllI[4]] = llIllIlllI[6];
                if (lIlllIIIIIlll(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[llIllIlllI[3]];
                    iArr4[llIllIlllI[4]] = llIllIlllI[6];
                    if (lIlllIIIIIlIl(Bank.getFirst(iArr4).getQuantity(), llIllIlllI[101])) {
                        Q();
                        System.out.println(llIllIlIlI[llIllIlllI[16]]);
                        bt = llIllIlllI[3];
                        return;
                    }
                }
                int[] iArr5 = new int[llIllIlllI[3]];
                iArr5[llIllIlllI[4]] = llIllIlllI[5];
                if (lIlllIIIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[llIllIlllI[3]];
                    iArr6[llIllIlllI[4]] = llIllIlllI[5];
                    if (lIlllIIIIIlIl(Bank.getFirst(iArr6).getQuantity(), llIllIlllI[101])) {
                        Q();
                        System.out.println(llIllIlIlI[llIllIlllI[103]]);
                        bt = llIllIlllI[3];
                        return;
                    }
                }
                int[] iArr7 = new int[llIllIlllI[3]];
                iArr7[llIllIlllI[4]] = llIllIlllI[10];
                if (lIlllIIIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                    int[] iArr8 = new int[llIllIlllI[3]];
                    iArr8[llIllIlllI[4]] = llIllIlllI[10];
                }
                int[] iArr9 = new int[llIllIlllI[3]];
                iArr9[llIllIlllI[4]] = llIllIlllI[9];
                if (lIlllIIIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llIllIlllI[3]];
                    iArr10[llIllIlllI[4]] = llIllIlllI[9];
                }
                int[] iArr11 = new int[llIllIlllI[3]];
                iArr11[llIllIlllI[4]] = llIllIlllI[8];
                if (lIlllIIIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[llIllIlllI[3]];
                    iArr12[llIllIlllI[4]] = llIllIlllI[8];
                }
                int[] iArr13 = new int[llIllIlllI[18]];
                iArr13[llIllIlllI[4]] = llIllIlllI[105];
                iArr13[llIllIlllI[3]] = llIllIlllI[10];
                iArr13[llIllIlllI[1]] = llIllIlllI[9];
                iArr13[llIllIlllI[12]] = llIllIlllI[8];
                iArr13[llIllIlllI[15]] = llIllIlllI[7];
                iArr13[llIllIlllI[13]] = llIllIlllI[5];
                iArr13[llIllIlllI[14]] = llIllIlllI[6];
                if (lIlllIIIIlIII(C0018e.c(iArr13) ? 1 : 0)) {
                    Q();
                    System.out.println(llIllIlIlI[llIllIlllI[106]]);
                    bt = llIllIlllI[3];
                    return;
                }
                if (lIlllIIIIlIII(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepTicks(llIllIlllI[15]);
                    "".length();
                }
                int[] iArr14 = new int[llIllIlllI[3]];
                iArr14[llIllIlllI[4]] = llIllIlllI[10];
                if (lIlllIIIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[llIllIlllI[3]];
                    iArr15[llIllIlllI[4]] = llIllIlllI[10];
                    if (lIlllIIIIIlIl(Inventory.getCount(iArr15), llIllIlllI[3])) {
                        Bank.withdraw(llIllIlllI[10], llIllIlllI[13], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIllIlllI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[llIllIlllI[3]];
                            iArr16[llIllIlllI[4]] = llIllIlllI[10];
                            if (lIlllIIIIlllI(Inventory.getCount(iArr16))) {
                                ?? r0 = llIllIlllI[3];
                                "".length();
                                return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIllIlllI[4];
                        }, llIllIlllI[99]);
                        "".length();
                    }
                }
                int[] iArr16 = new int[llIllIlllI[3]];
                iArr16[llIllIlllI[4]] = llIllIlllI[9];
                if (lIlllIIIIIlll(Bank.contains(iArr16) ? 1 : 0)) {
                    int[] iArr17 = new int[llIllIlllI[3]];
                    iArr17[llIllIlllI[4]] = llIllIlllI[9];
                    if (lIlllIIIIIlIl(Inventory.getCount(iArr17), llIllIlllI[3])) {
                        Bank.withdraw(llIllIlllI[9], llIllIlllI[15], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIllIlllI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr18 = new int[llIllIlllI[3]];
                            iArr18[llIllIlllI[4]] = llIllIlllI[9];
                            if (lIlllIIIIlllI(Inventory.getCount(iArr18))) {
                                ?? r0 = llIllIlllI[3];
                                "".length();
                                return (-"   ".length()) >= 0 ? ((110 ^ 113) ^ (53 ^ 48)) & (((25 ^ 100) ^ (98 ^ 5)) ^ (-" ".length())) : r0;
                            }
                            return llIllIlllI[4];
                        }, llIllIlllI[99]);
                        "".length();
                    }
                }
                int[] iArr18 = new int[llIllIlllI[3]];
                iArr18[llIllIlllI[4]] = llIllIlllI[7];
                if (lIlllIIIIIlll(Bank.contains(iArr18) ? 1 : 0)) {
                    int[] iArr19 = new int[llIllIlllI[3]];
                    iArr19[llIllIlllI[4]] = llIllIlllI[7];
                    if (lIlllIIIIIlIl(Inventory.getCount(iArr19), llIllIlllI[3])) {
                        Bank.withdraw(llIllIlllI[7], llIllIlllI[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIllIlllI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr20 = new int[llIllIlllI[3]];
                            iArr20[llIllIlllI[4]] = llIllIlllI[7];
                            if (lIlllIIIIlllI(Inventory.getCount(iArr20))) {
                                ?? r0 = llIllIlllI[3];
                                "".length();
                                return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIllIlllI[4];
                        }, llIllIlllI[99]);
                        "".length();
                    }
                }
                int[] iArr20 = new int[llIllIlllI[3]];
                iArr20[llIllIlllI[4]] = llIllIlllI[5];
                if (lIlllIIIIIlll(Bank.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[llIllIlllI[3]];
                    iArr21[llIllIlllI[4]] = llIllIlllI[5];
                    if (lIlllIIIIIlIl(Inventory.getCount(iArr21), llIllIlllI[3])) {
                        Bank.withdraw(llIllIlllI[5], llIllIlllI[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIllIlllI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr22 = new int[llIllIlllI[3]];
                            iArr22[llIllIlllI[4]] = llIllIlllI[5];
                            if (lIlllIIIIlllI(Inventory.getCount(iArr22))) {
                                ?? r0 = llIllIlllI[3];
                                "".length();
                                return ((((131 + 9) - 42) + 37) ^ (((30 + 62) - 65) + 103)) <= 0 ? " ".length() & (" ".length() ^ (-" ".length())) : r0;
                            }
                            return llIllIlllI[4];
                        }, llIllIlllI[99]);
                        "".length();
                    }
                }
                int[] iArr22 = new int[llIllIlllI[3]];
                iArr22[llIllIlllI[4]] = llIllIlllI[6];
                if (lIlllIIIIIlll(Bank.contains(iArr22) ? 1 : 0)) {
                    int[] iArr23 = new int[llIllIlllI[3]];
                    iArr23[llIllIlllI[4]] = llIllIlllI[6];
                    if (lIlllIIIIIlIl(Inventory.getCount(iArr23), llIllIlllI[3])) {
                        Bank.withdraw(llIllIlllI[6], llIllIlllI[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIllIlllI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr24 = new int[llIllIlllI[3]];
                            iArr24[llIllIlllI[4]] = llIllIlllI[6];
                            if (lIlllIIIIlllI(Inventory.getCount(iArr24))) {
                                ?? r0 = llIllIlllI[3];
                                "".length();
                                return "  ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIllIlllI[4];
                        }, llIllIlllI[99]);
                        "".length();
                    }
                }
                int[] iArr24 = new int[llIllIlllI[3]];
                iArr24[llIllIlllI[4]] = llIllIlllI[108];
                if (lIlllIIIIIlll(Bank.contains(iArr24) ? 1 : 0)) {
                    int[] iArr25 = new int[llIllIlllI[3]];
                    iArr25[llIllIlllI[4]] = llIllIlllI[108];
                    if (lIlllIIIIlIII(Inventory.contains(iArr25) ? 1 : 0)) {
                        Bank.withdraw(llIllIlllI[108], llIllIlllI[3], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIllIlllI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr26 = new int[llIllIlllI[3]];
                            iArr26[llIllIlllI[4]] = llIllIlllI[108];
                            return Inventory.contains(iArr26);
                        }, llIllIlllI[99]);
                        "".length();
                    }
                }
                int[] iArr26 = new int[llIllIlllI[3]];
                iArr26[llIllIlllI[4]] = llIllIlllI[8];
                if (lIlllIIIIIlll(Bank.contains(iArr26) ? 1 : 0)) {
                    int[] iArr27 = new int[llIllIlllI[3]];
                    iArr27[llIllIlllI[4]] = llIllIlllI[8];
                    if (lIlllIIIIIlIl(Inventory.getCount(iArr27), llIllIlllI[3])) {
                        Bank.withdrawAll(llIllIlllI[8], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIllIlllI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr28 = new int[llIllIlllI[3]];
                            iArr28[llIllIlllI[4]] = llIllIlllI[8];
                            if (lIlllIIIIlllI(Inventory.getCount(iArr28))) {
                                ?? r0 = llIllIlllI[3];
                                "".length();
                                return (-((76 ^ 65) ^ (168 ^ 161))) > 0 ? ((((66 + 77) - 33) + 58) ^ (((49 + 171) - 120) + 75)) & (((28 ^ 61) ^ (135 ^ 161)) ^ (-" ".length())) : r0;
                            }
                            return llIllIlllI[4];
                        }, llIllIlllI[99]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean lIlllIIIIIllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlllIIIIIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlllIIIIllII(Object obj) {
        return obj == null;
    }

    private static boolean lIlllIIIIIlll(int i) {
        return i != 0;
    }
}
