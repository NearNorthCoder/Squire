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
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.F  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/F.class */
public class F implements InterfaceC0003ac {
    public static final /* synthetic */ WorldPoint fz;
    public static /* synthetic */ String da;
    public static final /* synthetic */ WorldPoint fy;
    public static final /* synthetic */ WorldPoint fw;
    private static /* synthetic */ int[] lllIIIIlll;
    public static final /* synthetic */ WorldPoint fx;
    public static final /* synthetic */ WorldPoint fB;
    public static /* synthetic */ String h;
    static /* synthetic */ int di;
    public static final /* synthetic */ WorldPoint fD;
    public static /* synthetic */ int fF;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ int fE;
    public static /* synthetic */ String[] fG;
    public static final /* synthetic */ WorldPoint fv;
    private static /* synthetic */ String[] lllIIIIlII;
    public static /* synthetic */ List<C0017d> bv;
    public static final /* synthetic */ WorldPoint fA;
    public static final /* synthetic */ WorldPoint fC;

    private static boolean lIlllllIIlIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlllllIIllIl(int i) {
        return i < 0;
    }

    private static boolean lIlllllIIlllI(int i, int i2) {
        return i > i2;
    }

    private static void lIlllllIIIlIl() {
        lllIIIIlll = new int[138];
        lllIIIIlll[0] = " ".length();
        lllIIIIlll[1] = ((((157 + 240) - 373) + 227) ^ (((156 + 160) - 155) + 20)) & (((231 ^ 180) ^ (86 ^ 75)) ^ (-" ".length()));
        lllIIIIlll[2] = 112 ^ 111;
        lllIIIIlll[3] = (235 ^ 159) ^ (69 ^ 21);
        lllIIIIlll[4] = "  ".length();
        lllIIIIlll[5] = 63 ^ 18;
        lllIIIIlll[6] = "   ".length();
        lllIIIIlll[7] = (113 ^ 92) ^ (74 ^ 99);
        lllIIIIlll[8] = (229 ^ 170) ^ (21 ^ 95);
        lllIIIIlll[9] = (-27667) & 32666;
        lllIIIIlll[10] = (((126 + 143) - 115) + 19) ^ (((97 + 57) - 131) + 148);
        lllIIIIlll[11] = 191 ^ 181;
        lllIIIIlll[12] = (-169) & 8175;
        lllIIIIlll[13] = (-((-7241) & 23775)) & (-8226) & 32767;
        lllIIIIlll[14] = (-((-4373) & 31133)) & (-1) & 28111;
        lllIIIIlll[15] = (-((-2050) & 15367)) & (-3) & 15871;
        lllIIIIlll[16] = (-((-2403) & 32115)) & (-78) & 32223;
        lllIIIIlll[17] = (-((-1327) & 15871)) & (-17665) & 32766;
        lllIIIIlll[18] = (-((-1633) & 14066)) & (-19781) & 32767;
        lllIIIIlll[19] = (248 ^ 154) ^ (95 ^ 58);
        lllIIIIlll[20] = (-2194) & 2749;
        lllIIIIlll[21] = (47 ^ 87) ^ (93 ^ 45);
        lllIIIIlll[22] = (-((-257) & 30551)) & (-41) & 30719;
        lllIIIIlll[23] = 25 ^ 16;
        lllIIIIlll[24] = (-15821) & 16382;
        lllIIIIlll[25] = (-((-101) & 30844)) & (-1025) & 32767;
        lllIIIIlll[26] = (-6293) & 6847;
        lllIIIIlll[27] = (-14531) & 15087;
        lllIIIIlll[28] = ((17 + 80) - (-100)) + 3;
        lllIIIIlll[29] = (57 ^ 84) ^ (50 ^ 83);
        lllIIIIlll[30] = (-((-10261) & 11967)) & (-2049) & 16379;
        lllIIIIlll[31] = 94 ^ 85;
        lllIIIIlll[32] = (-17437) & 18431;
        lllIIIIlll[33] = 100 ^ 86;
        lllIIIIlll[34] = (((120 + 163) - 177) + 59) ^ (((131 + 175) - 305) + 177);
        lllIIIIlll[35] = 101 ^ 104;
        lllIIIIlll[36] = (81 ^ 104) ^ (161 ^ 150);
        lllIIIIlll[37] = (((155 + 85) - 121) + 66) ^ (((0 + 53) - 41) + 170);
        lllIIIIlll[38] = (3 ^ 73) ^ (82 ^ 8);
        lllIIIIlll[39] = (-((-6213) & 31333)) & (-25) & 28283;
        lllIIIIlll[40] = (-((-8323) & 25491)) & (-12391) & 32767;
        lllIIIIlll[41] = 174 ^ 191;
        lllIIIIlll[42] = (((32 + 166) - 110) + 85) ^ (((77 + 189) - 263) + 188);
        lllIIIIlll[43] = (((129 + 2) - 14) + 13) ^ (((102 + 37) - 49) + 55);
        lllIIIIlll[44] = (-12933) & 15341;
        lllIIIIlll[45] = (49 ^ 106) ^ (10 ^ 69);
        lllIIIIlll[46] = (((18 + 128) - 108) + 127) ^ (((153 + 1) - 81) + 103);
        lllIIIIlll[47] = 72 ^ 94;
        lllIIIIlll[48] = 166 ^ 184;
        lllIIIIlll[49] = (((88 + 54) - 55) + 78) ^ (((5 + 120) - 33) + 97);
        lllIIIIlll[50] = (((99 + 78) - 174) + 131) ^ (((24 + 36) - (-49)) + 50);
        lllIIIIlll[51] = (172 ^ 147) ^ (24 ^ 61);
        lllIIIIlll[52] = (166 ^ 157) ^ (247 ^ 138);
        lllIIIIlll[53] = (86 ^ 122) ^ (184 ^ 143);
        lllIIIIlll[54] = (-((-1305) & 15741)) & (-17169) & 32767;
        lllIIIIlll[55] = (70 ^ 31) ^ (195 ^ 134);
        lllIIIIlll[56] = 145 ^ 140;
        lllIIIIlll[57] = (14 ^ 1) ^ (11 ^ 36);
        lllIIIIlll[58] = 146 ^ 177;
        lllIIIIlll[59] = (244 ^ 130) ^ (92 ^ 11);
        lllIIIIlll[60] = (((40 + 47) - (-36)) + 8) ^ (((127 + 16) - 15) + 33);
        lllIIIIlll[61] = (((30 + 9) - (-10)) + 93) ^ (((124 + 121) - 107) + 33);
        lllIIIIlll[62] = (121 ^ 83) ^ (129 ^ 141);
        lllIIIIlll[63] = 184 ^ 159;
        lllIIIIlll[64] = 98 ^ 74;
        lllIIIIlll[65] = (((18 + 64) - (-60)) + 26) ^ (((125 + 29) - 95) + 70);
        lllIIIIlll[66] = (103 ^ 96) ^ (190 ^ 147);
        lllIIIIlll[67] = (76 ^ 82) ^ (79 ^ 122);
        lllIIIIlll[68] = (33 ^ 28) ^ (161 ^ 176);
        lllIIIIlll[69] = (102 ^ 122) ^ (98 ^ 80);
        lllIIIIlll[70] = 16 ^ 63;
        lllIIIIlll[71] = 66 ^ 114;
        lllIIIIlll[72] = (((166 + 44) - 146) + 111) ^ (((77 + 130) - 114) + 65);
        lllIIIIlll[73] = (214 ^ 128) ^ (23 ^ 114);
        lllIIIIlll[74] = -" ".length();
        lllIIIIlll[75] = (((133 + 69) - 137) + 85) ^ (((97 + 140) - 217) + 142);
        lllIIIIlll[76] = (160 ^ 168) ^ (77 ^ 112);
        lllIIIIlll[77] = 125 ^ 75;
        lllIIIIlll[78] = 5 ^ 50;
        lllIIIIlll[79] = (127 ^ 89) ^ (181 ^ 171);
        lllIIIIlll[80] = 185 ^ 128;
        lllIIIIlll[81] = 113 ^ 75;
        lllIIIIlll[82] = 58 ^ 1;
        lllIIIIlll[83] = 90 ^ 102;
        lllIIIIlll[84] = (((58 + 167) - 36) + 60) ^ (((58 + 123) - 44) + 59);
        lllIIIIlll[85] = 52 ^ 10;
        lllIIIIlll[86] = 137 ^ 182;
        lllIIIIlll[87] = 219 ^ 155;
        lllIIIIlll[88] = (((210 + 23) - 28) + 9) ^ (((54 + 69) - 72) + 100);
        lllIIIIlll[89] = (180 ^ 150) ^ (163 ^ 195);
        lllIIIIlll[90] = 203 ^ 136;
        lllIIIIlll[91] = (((147 + 175) - 151) + 63) ^ (((44 + 138) - 135) + 127);
        lllIIIIlll[92] = (-(25 ^ 13)) & (-513) & 7031;
        lllIIIIlll[93] = (-((-417) & 31230)) & (-1) & 32733;
        lllIIIIlll[94] = (-258) & 12235;
        lllIIIIlll[95] = (-534) & 23453;
        lllIIIIlll[96] = (-((-5640) & 7951)) & (-1153) & 16383;
        lllIIIIlll[97] = ((138 + 34) - 162) + 170;
        lllIIIIlll[98] = (-4116) & 7035;
        lllIIIIlll[99] = (-((-497) & 15857)) & (-38) & 16317;
        lllIIIIlll[100] = (-20548) & 29567;
        lllIIIIlll[101] = (-((-7499) & 23931)) & (-4099) & 32510;
        lllIIIIlll[102] = (-((-26019) & 28662)) & (-5) & 27647;
        lllIIIIlll[103] = (-((-2113) & 23643)) & (-8290) & 30719;
        lllIIIIlll[104] = (((160 + 148) - 221) + 77) ^ (((52 + 189) - 129) + 80);
        lllIIIIlll[105] = (147 ^ 172) ^ (51 ^ 73);
        lllIIIIlll[106] = (((163 + 138) - 78) + 29) ^ (((63 + 91) - 145) + 178);
        lllIIIIlll[107] = (73 ^ 69) ^ (68 ^ 0);
        lllIIIIlll[108] = (((120 + 46) - (-26)) + 27) ^ (((11 + 113) - 50) + 72);
        lllIIIIlll[109] = 245 ^ 191;
        lllIIIIlll[110] = (-((-4133) & 21301)) & (-163) & 20479;
        lllIIIIlll[111] = (-4129) & 7333;
        lllIIIIlll[112] = (-((-15425) & 31954)) & (-12385) & 31735;
        lllIIIIlll[113] = (-4561) & 14334;
        lllIIIIlll[114] = (-21601) & 24443;
        lllIIIIlll[115] = (-(((34 + 140) - 90) + 134)) & (-2049) & 12031;
        lllIIIIlll[116] = (-((-356) & 13799)) & (-65) & 16367;
        lllIIIIlll[117] = (-22609) & 32344;
        lllIIIIlll[118] = (-((-5153) & 30387)) & (-4097) & 32703;
        lllIIIIlll[119] = (-((-3187) & 24187)) & (-8449) & 32670;
        lllIIIIlll[120] = (-((-26801) & 27643)) & (-33) & 4091;
        lllIIIIlll[121] = (-((-705) & 29649)) & (-65) & 32215;
        lllIIIIlll[122] = (-29010) & 32221;
        lllIIIIlll[123] = (-((-2027) & 14315)) & (-16385) & 31871;
        lllIIIIlll[124] = (-12805) & 15974;
        lllIIIIlll[125] = (-16938) & 19389;
        lllIIIIlll[126] = (-((-24641) & 28359)) & (-24577) & 32767;
        lllIIIIlll[127] = ((42 + 125) - 144) + 124;
        lllIIIIlll[128] = 68 ^ 15;
        lllIIIIlll[129] = 52 ^ 120;
        lllIIIIlll[130] = (((202 + 96) - 115) + 69) ^ (((166 + 81) - 111) + 41);
        lllIIIIlll[131] = (242 ^ 192) ^ (125 ^ 1);
        lllIIIIlll[132] = 26 ^ 85;
        lllIIIIlll[133] = 216 ^ 136;
        lllIIIIlll[134] = 203 ^ 154;
        lllIIIIlll[135] = (67 ^ 108) ^ (55 ^ 74);
        lllIIIIlll[136] = 210 ^ 129;
        lllIIIIlll[137] = 5 ^ 81;
    }

    private static boolean lIlllllIlIIII(int i, int i2) {
        return i == i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            bY();
            "".length();
            if ((163 ^ 167) < "  ".length()) {
                return (96 ^ 117) & ((116 ^ 97) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lllIIIIlll[104];
    }

    private static String lIlllllIIIIIl(String lllllllllllllllllIllllIIllIIlIII, String lllllllllllllllllIllllIIllIIIlll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIllllIIllIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIllllIIllIIIlll.toCharArray();
        int lllllllllllllllllIllllIIllIIIlII = lllIIIIlll[1];
        char[] charArray2 = str.toCharArray();
        int lllllllllllllllllIllllIIlIllllIl = charArray2.length;
        int i = lllIIIIlll[1];
        while (lIlllllIIlIII(i, lllllllllllllllllIllllIIlIllllIl)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllllIllllIIllIIIlII % charArray.length]));
            "".length();
            lllllllllllllllllIllllIIllIIIlII++;
            i++;
            "".length();
            if ((-(27 ^ 30)) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlllllIlIIII(C0018e.j(fE), lllIIIIlll[10])) {
            ?? r0 = lllIIIIlll[0];
            "".length();
            return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIIIIlll[1];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0586, code lost:
        if (lIlllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[11]) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0589, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlII[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[21]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x05a4, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0c03, code lost:
        if (lIlllllIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0fa6, code lost:
        if (lIlllllIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02e8, code lost:
        if (lIlllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[25]) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x032b, code lost:
        if (lIlllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[25]) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x036e, code lost:
        if (lIlllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[25]) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03b1, code lost:
        if (lIlllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[25]) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x03f4, code lost:
        if (lIlllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[28]) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0437, code lost:
        if (lIlllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[25]) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x047a, code lost:
        if (lIlllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[29]) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x04bd, code lost:
        if (lIlllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[6]) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0500, code lost:
        if (lIlllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[11]) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0543, code lost:
        if (lIlllllIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[7]) != false) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v717, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v726, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v763, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bY() {
        if (lIlllllIIIlll(bt ? 1 : 0)) {
            C0015b.a(bv);
            if (lIlllllIIlIII(bv.size(), lllIIIIlll[0])) {
                System.out.println(lllIIIIlII[lllIIIIlll[1]]);
                bt = lllIIIIlll[1];
            }
        }
        if (lIlllllIIlIIl(bt ? 1 : 0)) {
            if (lIlllllIIlIII(Skills.getLevel(Skill.CRAFTING), lllIIIIlll[2])) {
                da = lllIIIIlII[lllIIIIlll[0]];
                ay.fi();
            }
            if (lIlllllIIlIlI(Skills.getLevel(Skill.CRAFTING), lllIIIIlll[2]) && lIlllllIIlIII(Skills.getLevel(Skill.WOODCUTTING), lllIIIIlll[3])) {
                da = lllIIIIlII[lllIIIIlll[4]];
                aF.gs();
            }
            if (lIlllllIIlIlI(Skills.getLevel(Skill.CRAFTING), lllIIIIlll[2]) && lIlllllIIlIlI(Skills.getLevel(Skill.WOODCUTTING), lllIIIIlll[3]) && lIlllllIIlIII(Skills.getLevel(Skill.PRAYER), lllIIIIlll[5])) {
                da = lllIIIIlII[lllIIIIlll[6]];
                aD.fY();
            }
            if (lIlllllIIlIIl(an() ? 1 : 0) && lIlllllIIlIII(C0018e.j(fE), lllIIIIlll[0]) && lIlllllIIlIlI(Skills.getLevel(Skill.CRAFTING), lllIIIIlll[2]) && lIlllllIIlIlI(Skills.getLevel(Skill.WOODCUTTING), lllIIIIlll[3]) && lIlllllIIlIlI(Skills.getLevel(Skill.PRAYER), lllIIIIlll[5])) {
                da = lllIIIIlII[lllIIIIlll[7]];
                BankLocation nearest = BankLocation.getNearest();
                if (lIlllllIIlIll(nearest) && lIlllllIIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[8]];
                    C0000a.a(nearest);
                }
                if (lIlllllIIlIll(nearest) && lIlllllIIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlllllIIlIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIIIIlll[9]);
                        "".length();
                    }
                    if (lIlllllIIIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[10]];
                        if (lIlllllIIllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIIIIlll[7]);
                            "".length();
                        }
                        if (lIlllllIIllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIIIIlll[4]);
                            "".length();
                        }
                        int[] iArr = new int[lllIIIIlll[11]];
                        iArr[lllIIIIlll[1]] = lllIIIIlll[12];
                        iArr[lllIIIIlll[0]] = lllIIIIlll[13];
                        iArr[lllIIIIlll[4]] = lllIIIIlll[14];
                        iArr[lllIIIIlll[6]] = lllIIIIlll[15];
                        iArr[lllIIIIlll[7]] = lllIIIIlll[16];
                        iArr[lllIIIIlll[8]] = lllIIIIlll[17];
                        iArr[lllIIIIlll[10]] = lllIIIIlll[18];
                        iArr[lllIIIIlll[19]] = lllIIIIlll[20];
                        iArr[lllIIIIlll[21]] = lllIIIIlll[22];
                        iArr[lllIIIIlll[23]] = lllIIIIlll[24];
                        if (lIlllllIIlIIl(C0018e.c(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(lllIIIIlII[lllIIIIlll[19]]);
                            bt = lllIIIIlll[0];
                            return;
                        }
                        int[] iArr2 = new int[lllIIIIlll[0]];
                        iArr2[lllIIIIlll[1]] = lllIIIIlll[20];
                        if (lIlllllIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lllIIIIlll[0]];
                            iArr3[lllIIIIlll[1]] = lllIIIIlll[20];
                        }
                        int[] iArr4 = new int[lllIIIIlll[0]];
                        iArr4[lllIIIIlll[1]] = lllIIIIlll[17];
                        if (lIlllllIIIlll(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lllIIIIlll[0]];
                            iArr5[lllIIIIlll[1]] = lllIIIIlll[17];
                        }
                        int[] iArr6 = new int[lllIIIIlll[0]];
                        iArr6[lllIIIIlll[1]] = lllIIIIlll[26];
                        if (lIlllllIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
                            int[] iArr7 = new int[lllIIIIlll[0]];
                            iArr7[lllIIIIlll[1]] = lllIIIIlll[26];
                        }
                        int[] iArr8 = new int[lllIIIIlll[0]];
                        iArr8[lllIIIIlll[1]] = lllIIIIlll[27];
                        if (lIlllllIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
                            int[] iArr9 = new int[lllIIIIlll[0]];
                            iArr9[lllIIIIlll[1]] = lllIIIIlll[27];
                        }
                        int[] iArr10 = new int[lllIIIIlll[0]];
                        iArr10[lllIIIIlll[1]] = lllIIIIlll[24];
                        if (lIlllllIIIlll(Bank.contains(iArr10) ? 1 : 0)) {
                            int[] iArr11 = new int[lllIIIIlll[0]];
                            iArr11[lllIIIIlll[1]] = lllIIIIlll[24];
                        }
                        int[] iArr12 = new int[lllIIIIlll[0]];
                        iArr12[lllIIIIlll[1]] = lllIIIIlll[18];
                        if (lIlllllIIIlll(Bank.contains(iArr12) ? 1 : 0)) {
                            int[] iArr13 = new int[lllIIIIlll[0]];
                            iArr13[lllIIIIlll[1]] = lllIIIIlll[18];
                        }
                        int[] iArr14 = new int[lllIIIIlll[0]];
                        iArr14[lllIIIIlll[1]] = lllIIIIlll[22];
                        if (lIlllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                            int[] iArr15 = new int[lllIIIIlll[0]];
                            iArr15[lllIIIIlll[1]] = lllIIIIlll[22];
                        }
                        int[] iArr16 = new int[lllIIIIlll[0]];
                        iArr16[lllIIIIlll[1]] = lllIIIIlll[16];
                        if (lIlllllIIIlll(Bank.contains(iArr16) ? 1 : 0)) {
                            int[] iArr17 = new int[lllIIIIlll[0]];
                            iArr17[lllIIIIlll[1]] = lllIIIIlll[16];
                        }
                        int[] iArr18 = new int[lllIIIIlll[0]];
                        iArr18[lllIIIIlll[1]] = lllIIIIlll[13];
                        if (lIlllllIIIlll(Bank.contains(iArr18) ? 1 : 0)) {
                            int[] iArr19 = new int[lllIIIIlll[0]];
                            iArr19[lllIIIIlll[1]] = lllIIIIlll[13];
                        }
                        int[] iArr20 = new int[lllIIIIlll[0]];
                        iArr20[lllIIIIlll[1]] = lllIIIIlll[30];
                        if (lIlllllIIIlll(Bank.contains(iArr20) ? 1 : 0)) {
                            int[] iArr21 = new int[lllIIIIlll[0]];
                            iArr21[lllIIIIlll[1]] = lllIIIIlll[30];
                        }
                        int[] iArr22 = new int[lllIIIIlll[0]];
                        iArr22[lllIIIIlll[1]] = lllIIIIlll[12];
                        if (lIlllllIIIlll(Bank.contains(iArr22) ? 1 : 0)) {
                            int[] iArr23 = new int[lllIIIIlll[0]];
                            iArr23[lllIIIIlll[1]] = lllIIIIlll[12];
                        }
                        int[] iArr24 = new int[lllIIIIlll[29]];
                        iArr24[lllIIIIlll[1]] = lllIIIIlll[12];
                        iArr24[lllIIIIlll[0]] = lllIIIIlll[13];
                        iArr24[lllIIIIlll[4]] = lllIIIIlll[14];
                        iArr24[lllIIIIlll[6]] = lllIIIIlll[15];
                        iArr24[lllIIIIlll[7]] = lllIIIIlll[16];
                        iArr24[lllIIIIlll[8]] = lllIIIIlll[17];
                        iArr24[lllIIIIlll[10]] = lllIIIIlll[18];
                        iArr24[lllIIIIlll[19]] = lllIIIIlll[20];
                        iArr24[lllIIIIlll[21]] = lllIIIIlll[22];
                        iArr24[lllIIIIlll[23]] = lllIIIIlll[24];
                        iArr24[lllIIIIlll[11]] = lllIIIIlll[26];
                        iArr24[lllIIIIlll[31]] = lllIIIIlll[27];
                        if (lIlllllIIIlll(C0018e.c(iArr24) ? 1 : 0)) {
                            C0000a.a(lllIIIIlll[12], lllIIIIlll[11]);
                            C0000a.a(lllIIIIlll[13], lllIIIIlll[11]);
                            C0000a.a(lllIIIIlll[14], lllIIIIlll[0]);
                            C0000a.a(lllIIIIlll[15], lllIIIIlll[0]);
                            C0000a.a(lllIIIIlll[16], lllIIIIlll[6]);
                            C0000a.b(C0019f.aW, lllIIIIlll[0]);
                            C0000a.a(lllIIIIlll[22], lllIIIIlll[19]);
                            C0000a.a(lllIIIIlll[17], lllIIIIlll[25]);
                            C0000a.a(lllIIIIlll[18], lllIIIIlll[25]);
                            C0000a.a(lllIIIIlll[27], lllIIIIlll[25]);
                            C0000a.a(lllIIIIlll[26], lllIIIIlll[25]);
                            C0000a.a(lllIIIIlll[24], lllIIIIlll[25]);
                            C0000a.a(lllIIIIlll[20], lllIIIIlll[25]);
                            C0000a.a(lllIIIIlll[32], lllIIIIlll[25]);
                            C0000a.a(lllIIIIlll[30], lllIIIIlll[0]);
                        }
                    }
                }
            }
            if (lIlllllIIIlll(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlllllIIlIII(Movement.getRunEnergy(), lllIIIIlll[33])) {
                Inventory.getFirst(C0019f.ba).interact(lllIIIIlII[lllIIIIlll[23]]);
                Time.sleepTicks(lllIIIIlll[0]);
                "".length();
            }
            if (lIlllllIIllIl(lIlllllIIIllI(C0018e.w(), 50.0d))) {
                String[] strArr = new String[lllIIIIlll[0]];
                strArr[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[11]];
                if (lIlllllIIIlll(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lllIIIIlll[0]];
                    strArr2[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[31]];
                    Inventory.getFirst(strArr2).interact(lllIIIIlII[lllIIIIlll[29]]);
                    Time.sleepTicks(lllIIIIlll[4]);
                    "".length();
                }
            }
            if (lIlllllIIlIII(Prayers.getPoints(), lllIIIIlll[34]) && lIlllllIIIlll(Inventory.contains(C0019f.aX) ? 1 : 0)) {
                Inventory.getFirst(C0019f.aX).interact(lllIIIIlII[lllIIIIlll[35]]);
                Time.sleepTicks(lllIIIIlll[4]);
                "".length();
            }
            if (lIlllllIIIlll(an() ? 1 : 0) && lIlllllIIlIII(C0018e.j(fE), lllIIIIlll[0])) {
                if (lIlllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(fv), lllIIIIlll[19])) {
                    AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[36]];
                    if (lIlllllIIIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(fv);
                    "".length();
                    Time.sleepTicks(lllIIIIlll[0]);
                    "".length();
                }
                if (lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(fv), lllIIIIlll[19])) {
                    AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[37]];
                    C0020g.a(lllIIIIlII[lllIIIIlll[38]], fG);
                }
            }
            if (lIlllllIlIIII(C0018e.j(fE), lllIIIIlll[0])) {
                if (lIlllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIIIIlll[39], lllIIIIlll[40], lllIIIIlll[1])), lllIIIIlll[8])) {
                    AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[41]];
                    Movement.walkTo(new WorldPoint(lllIIIIlll[39], lllIIIIlll[40], lllIIIIlll[1]));
                    "".length();
                    Time.sleepTicks(lllIIIIlll[0]);
                    "".length();
                }
                if (lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIIIIlll[39], lllIIIIlll[40], lllIIIIlll[1])), lllIIIIlll[8])) {
                    AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[42]];
                    String[] strArr3 = new String[lllIIIIlll[0]];
                    strArr3[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[43]];
                    if (lIlllllIlIIIl(NPCs.getNearest(strArr3))) {
                        int[] iArr25 = new int[lllIIIIlll[0]];
                        iArr25[lllIIIIlll[1]] = lllIIIIlll[44];
                        TileObjects.getNearest(iArr25).interact(lllIIIIlII[lllIIIIlll[45]]);
                        Time.sleepTicks(lllIIIIlll[6]);
                        "".length();
                    }
                    String[] strArr4 = new String[lllIIIIlll[0]];
                    strArr4[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[46]];
                    if (lIlllllIIlIll(NPCs.getNearest(strArr4))) {
                        C0020g.a(lllIIIIlII[lllIIIIlll[47]], fG);
                    }
                }
            }
            if (lIlllllIlIIII(C0018e.j(fE), lllIIIIlll[4])) {
                String[] strArr5 = new String[lllIIIIlll[0]];
                strArr5[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[34]];
                if (lIlllllIIIlll(Inventory.contains(strArr5) ? 1 : 0)) {
                    if (lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIIIIlll[39], lllIIIIlll[40], lllIIIIlll[1])), lllIIIIlll[48])) {
                        AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[49]];
                        String[] strArr6 = new String[lllIIIIlll[0]];
                        strArr6[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[50]];
                        Inventory.getFirst(strArr6).interact(lllIIIIlII[lllIIIIlll[51]]);
                        Time.sleepTicks(lllIIIIlll[0]);
                        "".length();
                    }
                    if (lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(fw), lllIIIIlll[52]) && lIlllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(fy), lllIIIIlll[7])) {
                        AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[53]];
                        if (lIlllllIIIlll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                            Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                        }
                        Movement.walkTo(fy);
                        "".length();
                        Time.sleepTicks(lllIIIIlll[0]);
                        "".length();
                    }
                    if (lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(fy), lllIIIIlll[7])) {
                        int[] iArr26 = new int[lllIIIIlll[0]];
                        iArr26[lllIIIIlll[1]] = lllIIIIlll[54];
                        if (lIlllllIlIIIl(NPCs.getNearest(iArr26))) {
                            String[] strArr7 = new String[lllIIIIlll[0]];
                            strArr7[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[55]];
                            TileObjects.getNearest(strArr7).interact(lllIIIIlII[lllIIIIlll[56]]);
                            Time.sleepTicks(lllIIIIlll[4]);
                            "".length();
                        }
                        int[] iArr27 = new int[lllIIIIlll[0]];
                        iArr27[lllIIIIlll[1]] = lllIIIIlll[54];
                        if (lIlllllIIlIll(NPCs.getNearest(iArr27))) {
                            AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[48]];
                            if (lIlllllIIlIIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                            }
                            if (lIlllllIIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                                if (!lIlllllIIlIlI(Skills.getLevel(Skill.MAGIC), lllIIIIlll[35]) || lIlllllIIlIlI(Skills.getLevel(Skill.MAGIC), lllIIIIlll[41])) {
                                    String[] strArr8 = new String[lllIIIIlll[0]];
                                    strArr8[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[2]];
                                }
                                Magic.cast(SpellBook.Standard.FIRE_STRIKE, NPCs.getNearest(npc -> {
                                    if (lIlllllIlIIII(npc.getId(), lllIIIIlll[54]) && lIlllllIIlIIl(npc.isDead() ? 1 : 0)) {
                                        ?? r0 = lllIIIIlll[0];
                                        "".length();
                                        return ((((84 + 62) - 144) + 134) ^ (((105 + 79) - 144) + 101)) <= 0 ? ((243 ^ 138) ^ (92 ^ 21)) & (((40 ^ 88) ^ (51 ^ 115)) ^ (-" ".length())) : r0;
                                    }
                                    return lllIIIIlll[1];
                                }));
                                Time.sleepTicks(lllIIIIlll[4]);
                                "".length();
                                String[] strArr9 = new String[lllIIIIlll[0]];
                                strArr9[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[57]];
                                if (lIlllllIIIlll(Inventory.contains(strArr9) ? 1 : 0)) {
                                    if (lIlllllIIlIlI(Skills.getLevel(Skill.MAGIC), lllIIIIlll[41]) && lIlllllIIlIII(Skills.getLevel(Skill.MAGIC), lllIIIIlll[34])) {
                                        Magic.cast(SpellBook.Standard.WIND_BOLT, NPCs.getNearest(npc2 -> {
                                            if (lIlllllIlIIII(npc2.getId(), lllIIIIlll[54]) && lIlllllIIlIIl(npc2.isDead() ? 1 : 0)) {
                                                ?? r0 = lllIIIIlll[0];
                                                "".length();
                                                return " ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                            }
                                            return lllIIIIlll[1];
                                        }));
                                        Time.sleepTicks(lllIIIIlll[4]);
                                        "".length();
                                    }
                                    if (lIlllllIIlIlI(Skills.getLevel(Skill.MAGIC), lllIIIIlll[34]) && lIlllllIIlIII(Skills.getLevel(Skill.MAGIC), lllIIIIlll[56])) {
                                        Magic.cast(SpellBook.Standard.WATER_BOLT, NPCs.getNearest(npc3 -> {
                                            if (lIlllllIlIIII(npc3.getId(), lllIIIIlll[54]) && lIlllllIIlIIl(npc3.isDead() ? 1 : 0)) {
                                                ?? r0 = lllIIIIlll[0];
                                                "".length();
                                                return 0 != 0 ? ("   ".length() ^ (185 ^ 128)) & (((9 ^ 116) ^ (13 ^ 74)) ^ (-" ".length())) : r0;
                                            }
                                            return lllIIIIlll[1];
                                        }));
                                        Time.sleepTicks(lllIIIIlll[4]);
                                        "".length();
                                    }
                                    if (lIlllllIIlIlI(Skills.getLevel(Skill.MAGIC), lllIIIIlll[56]) && lIlllllIIlIII(Skills.getLevel(Skill.MAGIC), lllIIIIlll[58])) {
                                        Magic.cast(SpellBook.Standard.EARTH_BOLT, NPCs.getNearest(npc4 -> {
                                            if (lIlllllIlIIII(npc4.getId(), lllIIIIlll[54]) && lIlllllIIlIIl(npc4.isDead() ? 1 : 0)) {
                                                ?? r0 = lllIIIIlll[0];
                                                "".length();
                                                return (((((133 + 60) - 126) + 109) ^ (((20 + 49) - (-33)) + 51)) & (((37 ^ 34) ^ (118 ^ 88)) ^ (-" ".length()))) > "   ".length() ? ((12 ^ 47) ^ (238 ^ 155)) & (((88 ^ 58) ^ (117 ^ 65)) ^ (-" ".length())) : r0;
                                            }
                                            return lllIIIIlll[1];
                                        }));
                                        Time.sleepTicks(lllIIIIlll[4]);
                                        "".length();
                                    }
                                    if (lIlllllIIlIlI(Skills.getLevel(Skill.MAGIC), lllIIIIlll[58])) {
                                        Magic.cast(SpellBook.Standard.FIRE_BOLT, NPCs.getNearest(npc5 -> {
                                            if (lIlllllIlIIII(npc5.getId(), lllIIIIlll[54]) && lIlllllIIlIIl(npc5.isDead() ? 1 : 0)) {
                                                ?? r0 = lllIIIIlll[0];
                                                "".length();
                                                return " ".length() == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                            }
                                            return lllIIIIlll[1];
                                        }));
                                        Time.sleepTicks(lllIIIIlll[4]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                }
                String[] strArr10 = new String[lllIIIIlll[0]];
                strArr10[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[59]];
                if (lIlllllIIlIIl(Inventory.contains(strArr10) ? 1 : 0)) {
                    if (lIlllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(fz), lllIIIIlll[7]) && lIlllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(fw), lllIIIIlll[52])) {
                        if (lIlllllIIIlll(Inventory.contains(C0019f.aW) ? 1 : 0) && lIlllllIIlIIl(Equipment.contains(C0019f.aW) ? 1 : 0)) {
                            C0018e.b(C0019f.aW);
                        }
                        AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[60]];
                        if (lIlllllIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                            Movement.walkTo(fz);
                            "".length();
                            Time.sleepTicks(lllIIIIlll[0]);
                            "".length();
                        }
                        String[] strArr11 = new String[lllIIIIlll[6]];
                        strArr11[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[58]];
                        strArr11[lllIIIIlll[0]] = lllIIIIlII[lllIIIIlll[3]];
                        strArr11[lllIIIIlll[4]] = lllIIIIlII[lllIIIIlll[61]];
                        C0020g.a(strArr11);
                    }
                    if (lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(fz), lllIIIIlll[7])) {
                        AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[62]];
                        if (lIlllllIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr12 = new String[lllIIIIlll[0]];
                            strArr12[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[63]];
                            TileObjects.getNearest(strArr12).interact(lllIIIIlII[lllIIIIlll[64]]);
                            Time.sleepTicks(lllIIIIlll[6]);
                            "".length();
                        }
                        C0020g.a(fG);
                    }
                    if (lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(fw), lllIIIIlll[52])) {
                        if (lIlllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(fx), lllIIIIlll[21])) {
                            AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[65]];
                            Movement.walkTo(fx);
                            "".length();
                            Time.sleepTicks(lllIIIIlll[0]);
                            "".length();
                        }
                        if (lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(fx), lllIIIIlll[21])) {
                            AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[66]];
                            if (lIlllllIIlIlI(Skills.getLevel(Skill.PRAYER), lllIIIIlll[67]) && lIlllllIIllII(Prayers.getPoints()) && lIlllllIIlIIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                            }
                            if (lIlllllIIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                                String[] strArr13 = new String[lllIIIIlll[0]];
                                strArr13[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[67]];
                                if (lIlllllIlIIIl(TileItems.getNearest(strArr13))) {
                                    if (!lIlllllIIlIlI(Skills.getLevel(Skill.MAGIC), lllIIIIlll[35]) || lIlllllIIlIlI(Skills.getLevel(Skill.MAGIC), lllIIIIlll[41])) {
                                        String[] strArr14 = new String[lllIIIIlll[0]];
                                        strArr14[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[68]];
                                    }
                                    Magic.cast(SpellBook.Standard.FIRE_STRIKE, NPCs.getNearest(npc6 -> {
                                        if (lIlllllIIIlll(npc6.getName().equalsIgnoreCase(lllIIIIlII[lllIIIIlll[109]]) ? 1 : 0) && lIlllllIIlIIl(npc6.isDead() ? 1 : 0)) {
                                            ?? r0 = lllIIIIlll[0];
                                            "".length();
                                            return " ".length() <= 0 ? ("   ".length() ^ (110 ^ 101)) & (((((69 + 26) - 61) + 125) ^ (((130 + 61) - 137) + 97)) ^ (-" ".length())) : r0;
                                        }
                                        return lllIIIIlll[1];
                                    }));
                                    Time.sleepTicks(lllIIIIlll[4]);
                                    "".length();
                                    String[] strArr15 = new String[lllIIIIlll[0]];
                                    strArr15[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[5]];
                                    if (lIlllllIIIlll(Inventory.contains(strArr15) ? 1 : 0)) {
                                        if (lIlllllIIlIlI(Skills.getLevel(Skill.MAGIC), lllIIIIlll[41]) && lIlllllIIlIII(Skills.getLevel(Skill.MAGIC), lllIIIIlll[34])) {
                                            Magic.cast(SpellBook.Standard.WIND_BOLT, NPCs.getNearest(npc7 -> {
                                                if (lIlllllIIIlll(npc7.getName().equalsIgnoreCase(lllIIIIlII[lllIIIIlll[108]]) ? 1 : 0) && lIlllllIIlIIl(npc7.isDead() ? 1 : 0)) {
                                                    ?? r0 = lllIIIIlll[0];
                                                    "".length();
                                                    return "   ".length() < (-" ".length()) ? ((113 ^ 59) ^ (45 ^ 117)) & (((246 ^ 175) ^ (68 ^ 15)) ^ (-" ".length())) : r0;
                                                }
                                                return lllIIIIlll[1];
                                            }));
                                            Time.sleepTicks(lllIIIIlll[4]);
                                            "".length();
                                        }
                                        if (lIlllllIIlIlI(Skills.getLevel(Skill.MAGIC), lllIIIIlll[34]) && lIlllllIIlIII(Skills.getLevel(Skill.MAGIC), lllIIIIlll[56])) {
                                            Magic.cast(SpellBook.Standard.WATER_BOLT, NPCs.getNearest(npc8 -> {
                                                if (lIlllllIIIlll(npc8.getName().equalsIgnoreCase(lllIIIIlII[lllIIIIlll[107]]) ? 1 : 0) && lIlllllIIlIIl(npc8.isDead() ? 1 : 0)) {
                                                    ?? r0 = lllIIIIlll[0];
                                                    "".length();
                                                    return " ".length() >= ((223 ^ 139) ^ (221 ^ 141)) ? ((92 ^ 17) ^ " ".length()) & (((15 ^ 50) ^ (123 ^ 10)) ^ (-" ".length())) : r0;
                                                }
                                                return lllIIIIlll[1];
                                            }));
                                            Time.sleepTicks(lllIIIIlll[4]);
                                            "".length();
                                        }
                                        if (lIlllllIIlIlI(Skills.getLevel(Skill.MAGIC), lllIIIIlll[56]) && lIlllllIIlIII(Skills.getLevel(Skill.MAGIC), lllIIIIlll[58])) {
                                            Magic.cast(SpellBook.Standard.EARTH_BOLT, NPCs.getNearest(npc9 -> {
                                                if (lIlllllIIIlll(npc9.getName().equalsIgnoreCase(lllIIIIlII[lllIIIIlll[106]]) ? 1 : 0) && lIlllllIIlIIl(npc9.isDead() ? 1 : 0)) {
                                                    ?? r0 = lllIIIIlll[0];
                                                    "".length();
                                                    return (-"  ".length()) >= 0 ? ((((78 + 56) - 126) + 119) ^ (89 ^ 104)) & (((100 ^ 26) ^ (122 ^ 74)) ^ (-" ".length())) : r0;
                                                }
                                                return lllIIIIlll[1];
                                            }));
                                            Time.sleepTicks(lllIIIIlll[4]);
                                            "".length();
                                        }
                                        if (lIlllllIIlIlI(Skills.getLevel(Skill.MAGIC), lllIIIIlll[58])) {
                                            Magic.cast(SpellBook.Standard.FIRE_BOLT, NPCs.getNearest(npc10 -> {
                                                if (lIlllllIIIlll(npc10.getName().equalsIgnoreCase(lllIIIIlII[lllIIIIlll[52]]) ? 1 : 0) && lIlllllIIlIIl(npc10.isDead() ? 1 : 0)) {
                                                    ?? r0 = lllIIIIlll[0];
                                                    "".length();
                                                    return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                                }
                                                return lllIIIIlll[1];
                                            }));
                                            Time.sleepTicks(lllIIIIlll[4]);
                                            "".length();
                                        }
                                    }
                                }
                            }
                            String[] strArr16 = new String[lllIIIIlll[0]];
                            strArr16[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[69]];
                            if (lIlllllIIlIll(TileItems.getNearest(strArr16))) {
                                String[] strArr17 = new String[lllIIIIlll[0]];
                                strArr17[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[70]];
                                TileItems.getNearest(strArr17).interact(lllIIIIlII[lllIIIIlll[71]]);
                                Time.sleepTicks(lllIIIIlll[4]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIlllllIlIIII(C0018e.j(fE), lllIIIIlll[6])) {
                AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[72]];
                if (lIlllllIIIlll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                if (lIlllllIIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                    String[] strArr18 = new String[lllIIIIlll[0]];
                    strArr18[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[33]];
                    TileObjects.getNearest(strArr18).interact(lllIIIIlII[lllIIIIlll[73]]);
                    Time.sleepTicks(lllIIIIlll[0]);
                    "".length();
                }
            }
            if (lIlllllIlIIII(C0018e.j(fE), lllIIIIlll[7])) {
                if (lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(fy), lllIIIIlll[64]) && lIlllllIlIIII(Players.getLocal().getAnimation(), lllIIIIlll[74])) {
                    int[] iArr28 = new int[lllIIIIlll[0]];
                    iArr28[lllIIIIlll[1]] = lllIIIIlll[13];
                    Inventory.getFirst(iArr28).interact(lllIIIIlII[lllIIIIlll[75]]);
                    Time.sleepTicks(lllIIIIlll[10]);
                    "".length();
                }
                String[] strArr19 = new String[lllIIIIlll[0]];
                strArr19[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[76]];
                if (lIlllllIIlIIl(Inventory.contains(strArr19) ? 1 : 0)) {
                    if (lIlllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(fB), lllIIIIlll[7])) {
                        AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[77]];
                        Movement.walkTo(fB);
                        "".length();
                        Time.sleepTicks(lllIIIIlll[0]);
                        "".length();
                    }
                    if (lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(fB), lllIIIIlll[7])) {
                        String[] strArr20 = new String[lllIIIIlll[0]];
                        strArr20[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[78]];
                        if (lIlllllIIlIll(TileItems.getNearest(strArr20))) {
                            String[] strArr21 = new String[lllIIIIlll[0]];
                            strArr21[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[79]];
                            TileItems.getNearest(strArr21).interact(lllIIIIlII[lllIIIIlll[80]]);
                            Time.sleepTicks(lllIIIIlll[4]);
                            "".length();
                        }
                    }
                }
                String[] strArr22 = new String[lllIIIIlll[0]];
                strArr22[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[81]];
                if (lIlllllIIIlll(Inventory.contains(strArr22) ? 1 : 0)) {
                    String[] strArr23 = new String[lllIIIIlll[0]];
                    strArr23[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[82]];
                    Item first = Inventory.getFirst(strArr23);
                    String[] strArr24 = new String[lllIIIIlll[0]];
                    strArr24[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[83]];
                    first.useOn(Inventory.getFirst(strArr24));
                    Time.sleepTicks(lllIIIIlll[4]);
                    "".length();
                }
            }
            if (lIlllllIlIIII(C0018e.j(fE), lllIIIIlll[8])) {
                String[] strArr25 = new String[lllIIIIlll[0]];
                strArr25[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[84]];
                if (lIlllllIIlIIl(Equipment.contains(strArr25) ? 1 : 0)) {
                    String[] strArr26 = new String[lllIIIIlll[0]];
                    strArr26[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[85]];
                    if (lIlllllIIIlll(Inventory.contains(strArr26) ? 1 : 0)) {
                        String[] strArr27 = new String[lllIIIIlll[0]];
                        strArr27[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[86]];
                        Inventory.getFirst(strArr27).interact(lllIIIIlII[lllIIIIlll[87]]);
                    }
                }
                if (lIlllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(fC), lllIIIIlll[8])) {
                    AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[88]];
                    Movement.walkTo(fC);
                    "".length();
                    Time.sleepTicks(lllIIIIlll[0]);
                    "".length();
                }
                if (lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(fC), lllIIIIlll[8])) {
                    AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[89]];
                    if (lIlllllIIlIII(di, lllIIIIlll[0])) {
                        aN.pY += lllIIIIlll[0];
                        aN.u(AccBuilderSotf.m);
                        di += lllIIIIlll[0];
                        aN.pY = lllIIIIlll[1];
                    }
                    String[] strArr28 = new String[lllIIIIlll[0]];
                    strArr28[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[90]];
                    TileObjects.getNearest(strArr28).interact(lllIIIIlII[lllIIIIlll[91]]);
                    Time.sleepUntil(() -> {
                        if (lIlllllIlIIII(C0018e.j(fE), lllIIIIlll[10])) {
                            ?? r0 = lllIIIIlll[0];
                            "".length();
                            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllIIIIlll[1];
                    }, lllIIIIlll[92]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIlllllIlIIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlllllIIllll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x012b, code lost:
        if (lIlllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[6]) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01b4, code lost:
        if (lIlllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[25]) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x023d, code lost:
        if (lIlllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[25]) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02c6, code lost:
        if (lIlllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[25]) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x034f, code lost:
        if (lIlllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[25]) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x03d8, code lost:
        if (lIlllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[28]) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0461, code lost:
        if (lIlllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[25]) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x04ea, code lost:
        if (lIlllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[25]) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x05b8, code lost:
        if (lIlllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[11]) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (lIlllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[29]) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0704, code lost:
        if (lIlllllIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.F.lllIIIIlll[7]) != false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x074a  */
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
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11;
        int[] iArr12;
        int[] iArr13;
        int[] iArr14;
        int[] iArr15;
        int[] iArr16 = new int[lllIIIIlll[0]];
        iArr16[lllIIIIlll[1]] = lllIIIIlll[22];
        if (lIlllllIIIlll(Bank.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[lllIIIIlll[0]];
            iArr17[lllIIIIlll[1]] = lllIIIIlll[22];
            if (lIlllllIIIlll(Bank.contains(iArr17) ? 1 : 0)) {
                int[] iArr18 = new int[lllIIIIlll[0]];
                iArr18[lllIIIIlll[1]] = lllIIIIlll[22];
            }
            iArr = new int[lllIIIIlll[0]];
            iArr[lllIIIIlll[1]] = lllIIIIlll[94];
            if (lIlllllIIlIIl(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0017d(lllIIIIlll[94], lllIIIIlll[0], lllIIIIlll[95]));
                "".length();
            }
            iArr2 = new int[lllIIIIlll[0]];
            iArr2[lllIIIIlll[1]] = lllIIIIlll[16];
            if (lIlllllIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr19 = new int[lllIIIIlll[0]];
                iArr19[lllIIIIlll[1]] = lllIIIIlll[16];
                if (lIlllllIIIlll(Bank.contains(iArr19) ? 1 : 0)) {
                    int[] iArr20 = new int[lllIIIIlll[0]];
                    iArr20[lllIIIIlll[1]] = lllIIIIlll[16];
                }
                iArr3 = new int[lllIIIIlll[0]];
                iArr3[lllIIIIlll[1]] = lllIIIIlll[20];
                if (lIlllllIIIlll(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr21 = new int[lllIIIIlll[0]];
                    iArr21[lllIIIIlll[1]] = lllIIIIlll[20];
                    if (lIlllllIIIlll(Bank.contains(iArr21) ? 1 : 0)) {
                        int[] iArr22 = new int[lllIIIIlll[0]];
                        iArr22[lllIIIIlll[1]] = lllIIIIlll[20];
                    }
                    iArr4 = new int[lllIIIIlll[0]];
                    iArr4[lllIIIIlll[1]] = lllIIIIlll[18];
                    if (lIlllllIIIlll(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr23 = new int[lllIIIIlll[0]];
                        iArr23[lllIIIIlll[1]] = lllIIIIlll[18];
                        if (lIlllllIIIlll(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lllIIIIlll[0]];
                            iArr24[lllIIIIlll[1]] = lllIIIIlll[18];
                        }
                        iArr5 = new int[lllIIIIlll[0]];
                        iArr5[lllIIIIlll[1]] = lllIIIIlll[27];
                        if (lIlllllIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr25 = new int[lllIIIIlll[0]];
                            iArr25[lllIIIIlll[1]] = lllIIIIlll[27];
                            if (lIlllllIIIlll(Bank.contains(iArr25) ? 1 : 0)) {
                                int[] iArr26 = new int[lllIIIIlll[0]];
                                iArr26[lllIIIIlll[1]] = lllIIIIlll[27];
                            }
                            iArr6 = new int[lllIIIIlll[0]];
                            iArr6[lllIIIIlll[1]] = lllIIIIlll[26];
                            if (lIlllllIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
                                int[] iArr27 = new int[lllIIIIlll[0]];
                                iArr27[lllIIIIlll[1]] = lllIIIIlll[26];
                                if (lIlllllIIIlll(Bank.contains(iArr27) ? 1 : 0)) {
                                    int[] iArr28 = new int[lllIIIIlll[0]];
                                    iArr28[lllIIIIlll[1]] = lllIIIIlll[26];
                                }
                                iArr7 = new int[lllIIIIlll[0]];
                                iArr7[lllIIIIlll[1]] = lllIIIIlll[24];
                                if (lIlllllIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                                    int[] iArr29 = new int[lllIIIIlll[0]];
                                    iArr29[lllIIIIlll[1]] = lllIIIIlll[24];
                                    if (lIlllllIIIlll(Bank.contains(iArr29) ? 1 : 0)) {
                                        int[] iArr30 = new int[lllIIIIlll[0]];
                                        iArr30[lllIIIIlll[1]] = lllIIIIlll[24];
                                    }
                                    iArr8 = new int[lllIIIIlll[0]];
                                    iArr8[lllIIIIlll[1]] = lllIIIIlll[17];
                                    if (lIlllllIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
                                        int[] iArr31 = new int[lllIIIIlll[0]];
                                        iArr31[lllIIIIlll[1]] = lllIIIIlll[17];
                                        if (lIlllllIIIlll(Bank.contains(iArr31) ? 1 : 0)) {
                                            int[] iArr32 = new int[lllIIIIlll[0]];
                                            iArr32[lllIIIIlll[1]] = lllIIIIlll[17];
                                        }
                                        iArr9 = new int[lllIIIIlll[0]];
                                        iArr9[lllIIIIlll[1]] = lllIIIIlll[17];
                                        if (lIlllllIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                                            int[] iArr33 = new int[lllIIIIlll[0]];
                                            iArr33[lllIIIIlll[1]] = lllIIIIlll[17];
                                            if (lIlllllIIIlll(Bank.contains(iArr33) ? 1 : 0)) {
                                                int[] iArr34 = new int[lllIIIIlll[0]];
                                                iArr34[lllIIIIlll[1]] = lllIIIIlll[17];
                                            }
                                            iArr10 = new int[lllIIIIlll[0]];
                                            iArr10[lllIIIIlll[1]] = lllIIIIlll[15];
                                            if (lIlllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                                                bv.add(new C0017d(lllIIIIlll[15], lllIIIIlll[0], lllIIIIlll[98]));
                                                "".length();
                                            }
                                            iArr11 = new int[lllIIIIlll[0]];
                                            iArr11[lllIIIIlll[1]] = lllIIIIlll[13];
                                            if (lIlllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                                                int[] iArr35 = new int[lllIIIIlll[0]];
                                                iArr35[lllIIIIlll[1]] = lllIIIIlll[13];
                                                if (lIlllllIIIlll(Bank.contains(iArr35) ? 1 : 0)) {
                                                    int[] iArr36 = new int[lllIIIIlll[0]];
                                                    iArr36[lllIIIIlll[1]] = lllIIIIlll[13];
                                                }
                                                iArr12 = new int[lllIIIIlll[0]];
                                                iArr12[lllIIIIlll[1]] = lllIIIIlll[14];
                                                if (lIlllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                                                    bv.add(new C0017d(lllIIIIlll[14], lllIIIIlll[0], lllIIIIlll[100]));
                                                    "".length();
                                                }
                                                iArr13 = new int[lllIIIIlll[0]];
                                                iArr13[lllIIIIlll[1]] = lllIIIIlll[15];
                                                if (lIlllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                                                    bv.add(new C0017d(lllIIIIlll[15], lllIIIIlll[0], lllIIIIlll[98]));
                                                    "".length();
                                                }
                                                if (lIlllllIIlIIl(Bank.contains(item -> {
                                                    return item.getName().toLowerCase().contains(lllIIIIlII[lllIIIIlll[105]]);
                                                }) ? 1 : 0)) {
                                                    bv.add(new C0017d(lllIIIIlll[101], lllIIIIlll[8], lllIIIIlll[102]));
                                                    "".length();
                                                }
                                                iArr14 = new int[lllIIIIlll[0]];
                                                iArr14[lllIIIIlll[1]] = lllIIIIlll[30];
                                                if (lIlllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                                                    int[] iArr37 = new int[lllIIIIlll[0]];
                                                    iArr37[lllIIIIlll[1]] = lllIIIIlll[30];
                                                    if (lIlllllIIIlll(Bank.contains(iArr37) ? 1 : 0)) {
                                                        int[] iArr38 = new int[lllIIIIlll[0]];
                                                        iArr38[lllIIIIlll[1]] = lllIIIIlll[30];
                                                    }
                                                    iArr15 = new int[lllIIIIlll[0]];
                                                    iArr15[lllIIIIlll[1]] = lllIIIIlll[12];
                                                    if (lIlllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                                                        int[] iArr39 = new int[lllIIIIlll[0]];
                                                        iArr39[lllIIIIlll[1]] = lllIIIIlll[12];
                                                        if (!lIlllllIIIlll(Bank.contains(iArr39) ? 1 : 0)) {
                                                            return;
                                                        }
                                                        int[] iArr40 = new int[lllIIIIlll[0]];
                                                        iArr40[lllIIIIlll[1]] = lllIIIIlll[12];
                                                        if (!lIlllllIIlIII(Bank.getFirst(iArr40).getQuantity(), lllIIIIlll[11])) {
                                                            return;
                                                        }
                                                    }
                                                    bv.add(new C0017d(lllIIIIlll[12], lllIIIIlll[11], lllIIIIlll[103]));
                                                    "".length();
                                                }
                                                bv.add(new C0017d(lllIIIIlll[30], lllIIIIlll[7], C0023j.cf));
                                                "".length();
                                                iArr15 = new int[lllIIIIlll[0]];
                                                iArr15[lllIIIIlll[1]] = lllIIIIlll[12];
                                                if (lIlllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                                                }
                                                bv.add(new C0017d(lllIIIIlll[12], lllIIIIlll[11], lllIIIIlll[103]));
                                                "".length();
                                            }
                                            bv.add(new C0017d(lllIIIIlll[13], lllIIIIlll[11], lllIIIIlll[99]));
                                            "".length();
                                            iArr12 = new int[lllIIIIlll[0]];
                                            iArr12[lllIIIIlll[1]] = lllIIIIlll[14];
                                            if (lIlllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                                            }
                                            iArr13 = new int[lllIIIIlll[0]];
                                            iArr13[lllIIIIlll[1]] = lllIIIIlll[15];
                                            if (lIlllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                                            }
                                            if (lIlllllIIlIIl(Bank.contains(item2 -> {
                                                return item2.getName().toLowerCase().contains(lllIIIIlII[lllIIIIlll[105]]);
                                            }) ? 1 : 0)) {
                                            }
                                            iArr14 = new int[lllIIIIlll[0]];
                                            iArr14[lllIIIIlll[1]] = lllIIIIlll[30];
                                            if (lIlllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                                            }
                                            bv.add(new C0017d(lllIIIIlll[30], lllIIIIlll[7], C0023j.cf));
                                            "".length();
                                            iArr15 = new int[lllIIIIlll[0]];
                                            iArr15[lllIIIIlll[1]] = lllIIIIlll[12];
                                            if (lIlllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                                            }
                                            bv.add(new C0017d(lllIIIIlll[12], lllIIIIlll[11], lllIIIIlll[103]));
                                            "".length();
                                        }
                                        bv.add(new C0017d(lllIIIIlll[17], lllIIIIlll[25], lllIIIIlll[11]));
                                        "".length();
                                        iArr10 = new int[lllIIIIlll[0]];
                                        iArr10[lllIIIIlll[1]] = lllIIIIlll[15];
                                        if (lIlllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                                        }
                                        iArr11 = new int[lllIIIIlll[0]];
                                        iArr11[lllIIIIlll[1]] = lllIIIIlll[13];
                                        if (lIlllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                                        }
                                        bv.add(new C0017d(lllIIIIlll[13], lllIIIIlll[11], lllIIIIlll[99]));
                                        "".length();
                                        iArr12 = new int[lllIIIIlll[0]];
                                        iArr12[lllIIIIlll[1]] = lllIIIIlll[14];
                                        if (lIlllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                                        }
                                        iArr13 = new int[lllIIIIlll[0]];
                                        iArr13[lllIIIIlll[1]] = lllIIIIlll[15];
                                        if (lIlllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                                        }
                                        if (lIlllllIIlIIl(Bank.contains(item22 -> {
                                            return item22.getName().toLowerCase().contains(lllIIIIlII[lllIIIIlll[105]]);
                                        }) ? 1 : 0)) {
                                        }
                                        iArr14 = new int[lllIIIIlll[0]];
                                        iArr14[lllIIIIlll[1]] = lllIIIIlll[30];
                                        if (lIlllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                                        }
                                        bv.add(new C0017d(lllIIIIlll[30], lllIIIIlll[7], C0023j.cf));
                                        "".length();
                                        iArr15 = new int[lllIIIIlll[0]];
                                        iArr15[lllIIIIlll[1]] = lllIIIIlll[12];
                                        if (lIlllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                                        }
                                        bv.add(new C0017d(lllIIIIlll[12], lllIIIIlll[11], lllIIIIlll[103]));
                                        "".length();
                                    }
                                    bv.add(new C0017d(lllIIIIlll[17], lllIIIIlll[25], lllIIIIlll[11]));
                                    "".length();
                                    iArr9 = new int[lllIIIIlll[0]];
                                    iArr9[lllIIIIlll[1]] = lllIIIIlll[17];
                                    if (lIlllllIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                                    }
                                    bv.add(new C0017d(lllIIIIlll[17], lllIIIIlll[25], lllIIIIlll[11]));
                                    "".length();
                                    iArr10 = new int[lllIIIIlll[0]];
                                    iArr10[lllIIIIlll[1]] = lllIIIIlll[15];
                                    if (lIlllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                                    }
                                    iArr11 = new int[lllIIIIlll[0]];
                                    iArr11[lllIIIIlll[1]] = lllIIIIlll[13];
                                    if (lIlllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                                    }
                                    bv.add(new C0017d(lllIIIIlll[13], lllIIIIlll[11], lllIIIIlll[99]));
                                    "".length();
                                    iArr12 = new int[lllIIIIlll[0]];
                                    iArr12[lllIIIIlll[1]] = lllIIIIlll[14];
                                    if (lIlllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                                    }
                                    iArr13 = new int[lllIIIIlll[0]];
                                    iArr13[lllIIIIlll[1]] = lllIIIIlll[15];
                                    if (lIlllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                                    }
                                    if (lIlllllIIlIIl(Bank.contains(item222 -> {
                                        return item222.getName().toLowerCase().contains(lllIIIIlII[lllIIIIlll[105]]);
                                    }) ? 1 : 0)) {
                                    }
                                    iArr14 = new int[lllIIIIlll[0]];
                                    iArr14[lllIIIIlll[1]] = lllIIIIlll[30];
                                    if (lIlllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                                    }
                                    bv.add(new C0017d(lllIIIIlll[30], lllIIIIlll[7], C0023j.cf));
                                    "".length();
                                    iArr15 = new int[lllIIIIlll[0]];
                                    iArr15[lllIIIIlll[1]] = lllIIIIlll[12];
                                    if (lIlllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                                    }
                                    bv.add(new C0017d(lllIIIIlll[12], lllIIIIlll[11], lllIIIIlll[103]));
                                    "".length();
                                }
                                bv.add(new C0017d(lllIIIIlll[24], lllIIIIlll[28], lllIIIIlll[97]));
                                "".length();
                                iArr8 = new int[lllIIIIlll[0]];
                                iArr8[lllIIIIlll[1]] = lllIIIIlll[17];
                                if (lIlllllIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
                                }
                                bv.add(new C0017d(lllIIIIlll[17], lllIIIIlll[25], lllIIIIlll[11]));
                                "".length();
                                iArr9 = new int[lllIIIIlll[0]];
                                iArr9[lllIIIIlll[1]] = lllIIIIlll[17];
                                if (lIlllllIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                                }
                                bv.add(new C0017d(lllIIIIlll[17], lllIIIIlll[25], lllIIIIlll[11]));
                                "".length();
                                iArr10 = new int[lllIIIIlll[0]];
                                iArr10[lllIIIIlll[1]] = lllIIIIlll[15];
                                if (lIlllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                                }
                                iArr11 = new int[lllIIIIlll[0]];
                                iArr11[lllIIIIlll[1]] = lllIIIIlll[13];
                                if (lIlllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                                }
                                bv.add(new C0017d(lllIIIIlll[13], lllIIIIlll[11], lllIIIIlll[99]));
                                "".length();
                                iArr12 = new int[lllIIIIlll[0]];
                                iArr12[lllIIIIlll[1]] = lllIIIIlll[14];
                                if (lIlllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                                }
                                iArr13 = new int[lllIIIIlll[0]];
                                iArr13[lllIIIIlll[1]] = lllIIIIlll[15];
                                if (lIlllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                                }
                                if (lIlllllIIlIIl(Bank.contains(item2222 -> {
                                    return item2222.getName().toLowerCase().contains(lllIIIIlII[lllIIIIlll[105]]);
                                }) ? 1 : 0)) {
                                }
                                iArr14 = new int[lllIIIIlll[0]];
                                iArr14[lllIIIIlll[1]] = lllIIIIlll[30];
                                if (lIlllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                                }
                                bv.add(new C0017d(lllIIIIlll[30], lllIIIIlll[7], C0023j.cf));
                                "".length();
                                iArr15 = new int[lllIIIIlll[0]];
                                iArr15[lllIIIIlll[1]] = lllIIIIlll[12];
                                if (lIlllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                                }
                                bv.add(new C0017d(lllIIIIlll[12], lllIIIIlll[11], lllIIIIlll[103]));
                                "".length();
                            }
                            bv.add(new C0017d(lllIIIIlll[26], lllIIIIlll[25], lllIIIIlll[11]));
                            "".length();
                            iArr7 = new int[lllIIIIlll[0]];
                            iArr7[lllIIIIlll[1]] = lllIIIIlll[24];
                            if (lIlllllIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                            }
                            bv.add(new C0017d(lllIIIIlll[24], lllIIIIlll[28], lllIIIIlll[97]));
                            "".length();
                            iArr8 = new int[lllIIIIlll[0]];
                            iArr8[lllIIIIlll[1]] = lllIIIIlll[17];
                            if (lIlllllIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
                            }
                            bv.add(new C0017d(lllIIIIlll[17], lllIIIIlll[25], lllIIIIlll[11]));
                            "".length();
                            iArr9 = new int[lllIIIIlll[0]];
                            iArr9[lllIIIIlll[1]] = lllIIIIlll[17];
                            if (lIlllllIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                            }
                            bv.add(new C0017d(lllIIIIlll[17], lllIIIIlll[25], lllIIIIlll[11]));
                            "".length();
                            iArr10 = new int[lllIIIIlll[0]];
                            iArr10[lllIIIIlll[1]] = lllIIIIlll[15];
                            if (lIlllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                            }
                            iArr11 = new int[lllIIIIlll[0]];
                            iArr11[lllIIIIlll[1]] = lllIIIIlll[13];
                            if (lIlllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                            }
                            bv.add(new C0017d(lllIIIIlll[13], lllIIIIlll[11], lllIIIIlll[99]));
                            "".length();
                            iArr12 = new int[lllIIIIlll[0]];
                            iArr12[lllIIIIlll[1]] = lllIIIIlll[14];
                            if (lIlllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                            }
                            iArr13 = new int[lllIIIIlll[0]];
                            iArr13[lllIIIIlll[1]] = lllIIIIlll[15];
                            if (lIlllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                            }
                            if (lIlllllIIlIIl(Bank.contains(item22222 -> {
                                return item22222.getName().toLowerCase().contains(lllIIIIlII[lllIIIIlll[105]]);
                            }) ? 1 : 0)) {
                            }
                            iArr14 = new int[lllIIIIlll[0]];
                            iArr14[lllIIIIlll[1]] = lllIIIIlll[30];
                            if (lIlllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                            }
                            bv.add(new C0017d(lllIIIIlll[30], lllIIIIlll[7], C0023j.cf));
                            "".length();
                            iArr15 = new int[lllIIIIlll[0]];
                            iArr15[lllIIIIlll[1]] = lllIIIIlll[12];
                            if (lIlllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                            }
                            bv.add(new C0017d(lllIIIIlll[12], lllIIIIlll[11], lllIIIIlll[103]));
                            "".length();
                        }
                        bv.add(new C0017d(lllIIIIlll[27], lllIIIIlll[25], lllIIIIlll[11]));
                        "".length();
                        iArr6 = new int[lllIIIIlll[0]];
                        iArr6[lllIIIIlll[1]] = lllIIIIlll[26];
                        if (lIlllllIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
                        }
                        bv.add(new C0017d(lllIIIIlll[26], lllIIIIlll[25], lllIIIIlll[11]));
                        "".length();
                        iArr7 = new int[lllIIIIlll[0]];
                        iArr7[lllIIIIlll[1]] = lllIIIIlll[24];
                        if (lIlllllIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                        }
                        bv.add(new C0017d(lllIIIIlll[24], lllIIIIlll[28], lllIIIIlll[97]));
                        "".length();
                        iArr8 = new int[lllIIIIlll[0]];
                        iArr8[lllIIIIlll[1]] = lllIIIIlll[17];
                        if (lIlllllIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
                        }
                        bv.add(new C0017d(lllIIIIlll[17], lllIIIIlll[25], lllIIIIlll[11]));
                        "".length();
                        iArr9 = new int[lllIIIIlll[0]];
                        iArr9[lllIIIIlll[1]] = lllIIIIlll[17];
                        if (lIlllllIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                        }
                        bv.add(new C0017d(lllIIIIlll[17], lllIIIIlll[25], lllIIIIlll[11]));
                        "".length();
                        iArr10 = new int[lllIIIIlll[0]];
                        iArr10[lllIIIIlll[1]] = lllIIIIlll[15];
                        if (lIlllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                        }
                        iArr11 = new int[lllIIIIlll[0]];
                        iArr11[lllIIIIlll[1]] = lllIIIIlll[13];
                        if (lIlllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                        }
                        bv.add(new C0017d(lllIIIIlll[13], lllIIIIlll[11], lllIIIIlll[99]));
                        "".length();
                        iArr12 = new int[lllIIIIlll[0]];
                        iArr12[lllIIIIlll[1]] = lllIIIIlll[14];
                        if (lIlllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                        }
                        iArr13 = new int[lllIIIIlll[0]];
                        iArr13[lllIIIIlll[1]] = lllIIIIlll[15];
                        if (lIlllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                        }
                        if (lIlllllIIlIIl(Bank.contains(item222222 -> {
                            return item222222.getName().toLowerCase().contains(lllIIIIlII[lllIIIIlll[105]]);
                        }) ? 1 : 0)) {
                        }
                        iArr14 = new int[lllIIIIlll[0]];
                        iArr14[lllIIIIlll[1]] = lllIIIIlll[30];
                        if (lIlllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                        }
                        bv.add(new C0017d(lllIIIIlll[30], lllIIIIlll[7], C0023j.cf));
                        "".length();
                        iArr15 = new int[lllIIIIlll[0]];
                        iArr15[lllIIIIlll[1]] = lllIIIIlll[12];
                        if (lIlllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                        }
                        bv.add(new C0017d(lllIIIIlll[12], lllIIIIlll[11], lllIIIIlll[103]));
                        "".length();
                    }
                    bv.add(new C0017d(lllIIIIlll[18], lllIIIIlll[25], lllIIIIlll[11]));
                    "".length();
                    iArr5 = new int[lllIIIIlll[0]];
                    iArr5[lllIIIIlll[1]] = lllIIIIlll[27];
                    if (lIlllllIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(lllIIIIlll[27], lllIIIIlll[25], lllIIIIlll[11]));
                    "".length();
                    iArr6 = new int[lllIIIIlll[0]];
                    iArr6[lllIIIIlll[1]] = lllIIIIlll[26];
                    if (lIlllllIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(lllIIIIlll[26], lllIIIIlll[25], lllIIIIlll[11]));
                    "".length();
                    iArr7 = new int[lllIIIIlll[0]];
                    iArr7[lllIIIIlll[1]] = lllIIIIlll[24];
                    if (lIlllllIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(lllIIIIlll[24], lllIIIIlll[28], lllIIIIlll[97]));
                    "".length();
                    iArr8 = new int[lllIIIIlll[0]];
                    iArr8[lllIIIIlll[1]] = lllIIIIlll[17];
                    if (lIlllllIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(lllIIIIlll[17], lllIIIIlll[25], lllIIIIlll[11]));
                    "".length();
                    iArr9 = new int[lllIIIIlll[0]];
                    iArr9[lllIIIIlll[1]] = lllIIIIlll[17];
                    if (lIlllllIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(lllIIIIlll[17], lllIIIIlll[25], lllIIIIlll[11]));
                    "".length();
                    iArr10 = new int[lllIIIIlll[0]];
                    iArr10[lllIIIIlll[1]] = lllIIIIlll[15];
                    if (lIlllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                    }
                    iArr11 = new int[lllIIIIlll[0]];
                    iArr11[lllIIIIlll[1]] = lllIIIIlll[13];
                    if (lIlllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(lllIIIIlll[13], lllIIIIlll[11], lllIIIIlll[99]));
                    "".length();
                    iArr12 = new int[lllIIIIlll[0]];
                    iArr12[lllIIIIlll[1]] = lllIIIIlll[14];
                    if (lIlllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                    }
                    iArr13 = new int[lllIIIIlll[0]];
                    iArr13[lllIIIIlll[1]] = lllIIIIlll[15];
                    if (lIlllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                    }
                    if (lIlllllIIlIIl(Bank.contains(item2222222 -> {
                        return item2222222.getName().toLowerCase().contains(lllIIIIlII[lllIIIIlll[105]]);
                    }) ? 1 : 0)) {
                    }
                    iArr14 = new int[lllIIIIlll[0]];
                    iArr14[lllIIIIlll[1]] = lllIIIIlll[30];
                    if (lIlllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(lllIIIIlll[30], lllIIIIlll[7], C0023j.cf));
                    "".length();
                    iArr15 = new int[lllIIIIlll[0]];
                    iArr15[lllIIIIlll[1]] = lllIIIIlll[12];
                    if (lIlllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(lllIIIIlll[12], lllIIIIlll[11], lllIIIIlll[103]));
                    "".length();
                }
                bv.add(new C0017d(lllIIIIlll[20], lllIIIIlll[25], lllIIIIlll[11]));
                "".length();
                iArr4 = new int[lllIIIIlll[0]];
                iArr4[lllIIIIlll[1]] = lllIIIIlll[18];
                if (lIlllllIIIlll(Bank.contains(iArr4) ? 1 : 0)) {
                }
                bv.add(new C0017d(lllIIIIlll[18], lllIIIIlll[25], lllIIIIlll[11]));
                "".length();
                iArr5 = new int[lllIIIIlll[0]];
                iArr5[lllIIIIlll[1]] = lllIIIIlll[27];
                if (lIlllllIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                }
                bv.add(new C0017d(lllIIIIlll[27], lllIIIIlll[25], lllIIIIlll[11]));
                "".length();
                iArr6 = new int[lllIIIIlll[0]];
                iArr6[lllIIIIlll[1]] = lllIIIIlll[26];
                if (lIlllllIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
                }
                bv.add(new C0017d(lllIIIIlll[26], lllIIIIlll[25], lllIIIIlll[11]));
                "".length();
                iArr7 = new int[lllIIIIlll[0]];
                iArr7[lllIIIIlll[1]] = lllIIIIlll[24];
                if (lIlllllIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                }
                bv.add(new C0017d(lllIIIIlll[24], lllIIIIlll[28], lllIIIIlll[97]));
                "".length();
                iArr8 = new int[lllIIIIlll[0]];
                iArr8[lllIIIIlll[1]] = lllIIIIlll[17];
                if (lIlllllIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
                }
                bv.add(new C0017d(lllIIIIlll[17], lllIIIIlll[25], lllIIIIlll[11]));
                "".length();
                iArr9 = new int[lllIIIIlll[0]];
                iArr9[lllIIIIlll[1]] = lllIIIIlll[17];
                if (lIlllllIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                }
                bv.add(new C0017d(lllIIIIlll[17], lllIIIIlll[25], lllIIIIlll[11]));
                "".length();
                iArr10 = new int[lllIIIIlll[0]];
                iArr10[lllIIIIlll[1]] = lllIIIIlll[15];
                if (lIlllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[lllIIIIlll[0]];
                iArr11[lllIIIIlll[1]] = lllIIIIlll[13];
                if (lIlllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                }
                bv.add(new C0017d(lllIIIIlll[13], lllIIIIlll[11], lllIIIIlll[99]));
                "".length();
                iArr12 = new int[lllIIIIlll[0]];
                iArr12[lllIIIIlll[1]] = lllIIIIlll[14];
                if (lIlllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                }
                iArr13 = new int[lllIIIIlll[0]];
                iArr13[lllIIIIlll[1]] = lllIIIIlll[15];
                if (lIlllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                }
                if (lIlllllIIlIIl(Bank.contains(item22222222 -> {
                    return item22222222.getName().toLowerCase().contains(lllIIIIlII[lllIIIIlll[105]]);
                }) ? 1 : 0)) {
                }
                iArr14 = new int[lllIIIIlll[0]];
                iArr14[lllIIIIlll[1]] = lllIIIIlll[30];
                if (lIlllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                }
                bv.add(new C0017d(lllIIIIlll[30], lllIIIIlll[7], C0023j.cf));
                "".length();
                iArr15 = new int[lllIIIIlll[0]];
                iArr15[lllIIIIlll[1]] = lllIIIIlll[12];
                if (lIlllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                }
                bv.add(new C0017d(lllIIIIlll[12], lllIIIIlll[11], lllIIIIlll[103]));
                "".length();
            }
            bv.add(new C0017d(lllIIIIlll[16], lllIIIIlll[6], lllIIIIlll[96]));
            "".length();
            iArr3 = new int[lllIIIIlll[0]];
            iArr3[lllIIIIlll[1]] = lllIIIIlll[20];
            if (lIlllllIIIlll(Bank.contains(iArr3) ? 1 : 0)) {
            }
            bv.add(new C0017d(lllIIIIlll[20], lllIIIIlll[25], lllIIIIlll[11]));
            "".length();
            iArr4 = new int[lllIIIIlll[0]];
            iArr4[lllIIIIlll[1]] = lllIIIIlll[18];
            if (lIlllllIIIlll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bv.add(new C0017d(lllIIIIlll[18], lllIIIIlll[25], lllIIIIlll[11]));
            "".length();
            iArr5 = new int[lllIIIIlll[0]];
            iArr5[lllIIIIlll[1]] = lllIIIIlll[27];
            if (lIlllllIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
            }
            bv.add(new C0017d(lllIIIIlll[27], lllIIIIlll[25], lllIIIIlll[11]));
            "".length();
            iArr6 = new int[lllIIIIlll[0]];
            iArr6[lllIIIIlll[1]] = lllIIIIlll[26];
            if (lIlllllIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bv.add(new C0017d(lllIIIIlll[26], lllIIIIlll[25], lllIIIIlll[11]));
            "".length();
            iArr7 = new int[lllIIIIlll[0]];
            iArr7[lllIIIIlll[1]] = lllIIIIlll[24];
            if (lIlllllIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
            }
            bv.add(new C0017d(lllIIIIlll[24], lllIIIIlll[28], lllIIIIlll[97]));
            "".length();
            iArr8 = new int[lllIIIIlll[0]];
            iArr8[lllIIIIlll[1]] = lllIIIIlll[17];
            if (lIlllllIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
            }
            bv.add(new C0017d(lllIIIIlll[17], lllIIIIlll[25], lllIIIIlll[11]));
            "".length();
            iArr9 = new int[lllIIIIlll[0]];
            iArr9[lllIIIIlll[1]] = lllIIIIlll[17];
            if (lIlllllIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
            }
            bv.add(new C0017d(lllIIIIlll[17], lllIIIIlll[25], lllIIIIlll[11]));
            "".length();
            iArr10 = new int[lllIIIIlll[0]];
            iArr10[lllIIIIlll[1]] = lllIIIIlll[15];
            if (lIlllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[lllIIIIlll[0]];
            iArr11[lllIIIIlll[1]] = lllIIIIlll[13];
            if (lIlllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
            }
            bv.add(new C0017d(lllIIIIlll[13], lllIIIIlll[11], lllIIIIlll[99]));
            "".length();
            iArr12 = new int[lllIIIIlll[0]];
            iArr12[lllIIIIlll[1]] = lllIIIIlll[14];
            if (lIlllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
            }
            iArr13 = new int[lllIIIIlll[0]];
            iArr13[lllIIIIlll[1]] = lllIIIIlll[15];
            if (lIlllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
            }
            if (lIlllllIIlIIl(Bank.contains(item222222222 -> {
                return item222222222.getName().toLowerCase().contains(lllIIIIlII[lllIIIIlll[105]]);
            }) ? 1 : 0)) {
            }
            iArr14 = new int[lllIIIIlll[0]];
            iArr14[lllIIIIlll[1]] = lllIIIIlll[30];
            if (lIlllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
            }
            bv.add(new C0017d(lllIIIIlll[30], lllIIIIlll[7], C0023j.cf));
            "".length();
            iArr15 = new int[lllIIIIlll[0]];
            iArr15[lllIIIIlll[1]] = lllIIIIlll[12];
            if (lIlllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
            }
            bv.add(new C0017d(lllIIIIlll[12], lllIIIIlll[11], lllIIIIlll[103]));
            "".length();
        }
        bv.add(new C0017d(lllIIIIlll[22], lllIIIIlll[29], lllIIIIlll[93]));
        "".length();
        iArr = new int[lllIIIIlll[0]];
        iArr[lllIIIIlll[1]] = lllIIIIlll[94];
        if (lIlllllIIlIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lllIIIIlll[0]];
        iArr2[lllIIIIlll[1]] = lllIIIIlll[16];
        if (lIlllllIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIIIlll[16], lllIIIIlll[6], lllIIIIlll[96]));
        "".length();
        iArr3 = new int[lllIIIIlll[0]];
        iArr3[lllIIIIlll[1]] = lllIIIIlll[20];
        if (lIlllllIIIlll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIIIlll[20], lllIIIIlll[25], lllIIIIlll[11]));
        "".length();
        iArr4 = new int[lllIIIIlll[0]];
        iArr4[lllIIIIlll[1]] = lllIIIIlll[18];
        if (lIlllllIIIlll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIIIlll[18], lllIIIIlll[25], lllIIIIlll[11]));
        "".length();
        iArr5 = new int[lllIIIIlll[0]];
        iArr5[lllIIIIlll[1]] = lllIIIIlll[27];
        if (lIlllllIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIIIlll[27], lllIIIIlll[25], lllIIIIlll[11]));
        "".length();
        iArr6 = new int[lllIIIIlll[0]];
        iArr6[lllIIIIlll[1]] = lllIIIIlll[26];
        if (lIlllllIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIIIlll[26], lllIIIIlll[25], lllIIIIlll[11]));
        "".length();
        iArr7 = new int[lllIIIIlll[0]];
        iArr7[lllIIIIlll[1]] = lllIIIIlll[24];
        if (lIlllllIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIIIlll[24], lllIIIIlll[28], lllIIIIlll[97]));
        "".length();
        iArr8 = new int[lllIIIIlll[0]];
        iArr8[lllIIIIlll[1]] = lllIIIIlll[17];
        if (lIlllllIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIIIlll[17], lllIIIIlll[25], lllIIIIlll[11]));
        "".length();
        iArr9 = new int[lllIIIIlll[0]];
        iArr9[lllIIIIlll[1]] = lllIIIIlll[17];
        if (lIlllllIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIIIlll[17], lllIIIIlll[25], lllIIIIlll[11]));
        "".length();
        iArr10 = new int[lllIIIIlll[0]];
        iArr10[lllIIIIlll[1]] = lllIIIIlll[15];
        if (lIlllllIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[lllIIIIlll[0]];
        iArr11[lllIIIIlll[1]] = lllIIIIlll[13];
        if (lIlllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIIIlll[13], lllIIIIlll[11], lllIIIIlll[99]));
        "".length();
        iArr12 = new int[lllIIIIlll[0]];
        iArr12[lllIIIIlll[1]] = lllIIIIlll[14];
        if (lIlllllIIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
        }
        iArr13 = new int[lllIIIIlll[0]];
        iArr13[lllIIIIlll[1]] = lllIIIIlll[15];
        if (lIlllllIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
        }
        if (lIlllllIIlIIl(Bank.contains(item2222222222 -> {
            return item2222222222.getName().toLowerCase().contains(lllIIIIlII[lllIIIIlll[105]]);
        }) ? 1 : 0)) {
        }
        iArr14 = new int[lllIIIIlll[0]];
        iArr14[lllIIIIlll[1]] = lllIIIIlll[30];
        if (lIlllllIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIIIlll[30], lllIIIIlll[7], C0023j.cf));
        "".length();
        iArr15 = new int[lllIIIIlll[0]];
        iArr15[lllIIIIlll[1]] = lllIIIIlll[12];
        if (lIlllllIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIIIlll[12], lllIIIIlll[11], lllIIIIlll[103]));
        "".length();
    }

    static {
        lIlllllIIIlIl();
        lIlllllIIIIll();
        fv = new WorldPoint(lllIIIIlll[110], lllIIIIlll[111], lllIIIIlll[1]);
        fw = new WorldPoint(lllIIIIlll[112], lllIIIIlll[113], lllIIIIlll[1]);
        fx = new WorldPoint(lllIIIIlll[114], lllIIIIlll[115], lllIIIIlll[1]);
        fy = new WorldPoint(lllIIIIlll[116], lllIIIIlll[117], lllIIIIlll[1]);
        fz = new WorldPoint(lllIIIIlll[112], lllIIIIlll[118], lllIIIIlll[1]);
        fA = new WorldPoint(lllIIIIlll[119], lllIIIIlll[120], lllIIIIlll[1]);
        fB = new WorldPoint(lllIIIIlll[121], lllIIIIlll[122], lllIIIIlll[1]);
        fC = new WorldPoint(lllIIIIlll[123], lllIIIIlll[124], lllIIIIlll[1]);
        fD = new WorldPoint(lllIIIIlll[125], lllIIIIlll[126], lllIIIIlll[1]);
        bv = new ArrayList();
        fE = lllIIIIlll[127];
        fF = lllIIIIlll[1];
        String[] strArr = new String[lllIIIIlll[21]];
        strArr[lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[128]];
        strArr[lllIIIIlll[0]] = lllIIIIlII[lllIIIIlll[129]];
        strArr[lllIIIIlll[4]] = lllIIIIlII[lllIIIIlll[130]];
        strArr[lllIIIIlll[6]] = lllIIIIlII[lllIIIIlll[131]];
        strArr[lllIIIIlll[7]] = lllIIIIlII[lllIIIIlll[132]];
        strArr[lllIIIIlll[8]] = lllIIIIlII[lllIIIIlll[133]];
        strArr[lllIIIIlll[10]] = lllIIIIlII[lllIIIIlll[134]];
        strArr[lllIIIIlll[19]] = lllIIIIlII[lllIIIIlll[135]];
        fG = strArr;
        da = lllIIIIlII[lllIIIIlll[136]];
        h = "Lost city " + da;
    }

    private static String lIlllllIIIIII(String lllllllllllllllllIllllIIlIllIIll, String lllllllllllllllllIllllIIlIllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllllIIlIllIIlI.getBytes(StandardCharsets.UTF_8)), lllIIIIlll[21]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIIlll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllllIIlIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllllIIlIllIlII) {
            lllllllllllllllllIllllIIlIllIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[lllIIIIlll[23]];
        iArr[lllIIIIlll[1]] = lllIIIIlll[12];
        iArr[lllIIIIlll[0]] = lllIIIIlll[13];
        iArr[lllIIIIlll[4]] = lllIIIIlll[14];
        iArr[lllIIIIlll[6]] = lllIIIIlll[15];
        iArr[lllIIIIlll[7]] = lllIIIIlll[16];
        iArr[lllIIIIlll[8]] = lllIIIIlll[17];
        iArr[lllIIIIlll[10]] = lllIIIIlll[18];
        iArr[lllIIIIlll[19]] = lllIIIIlll[20];
        iArr[lllIIIIlll[21]] = lllIIIIlll[22];
        int i = lllIIIIlll[1];
        while (lIlllllIIlIII(i, iArr.length)) {
            int[] iArr2 = new int[lllIIIIlll[0]];
            iArr2[lllIIIIlll[1]] = iArr[i];
            if (lIlllllIIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                return lllIIIIlll[1];
            }
            i++;
            "".length();
            if (0 != 0) {
                return ((13 ^ 27) ^ (99 ^ 84)) & (((185 ^ 142) ^ (45 ^ 59)) ^ (-" ".length()));
            }
        }
        return lllIIIIlll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lllIIIIlll[1];
    }

    private static boolean lIlllllIIlIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlllllIIlIIl(int i) {
        return i == 0;
    }

    private static boolean lIlllllIIllII(int i) {
        return i > 0;
    }

    private static String lIllllIllllIl(String lllllllllllllllllIllllIIlllIlIII, String lllllllllllllllllIllllIIlllIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllllIIlllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIIlll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllllIIlllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllllIIlllIlIIl) {
            lllllllllllllllllIllllIIlllIlIIl.printStackTrace();
            return null;
        }
    }

    private static int lIlllllIIIllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIlllllIIIlll(int i) {
        return i != 0;
    }

    private static boolean lIlllllIIlIll(Object obj) {
        return obj != null;
    }

    private static void lIlllllIIIIll() {
        lllIIIIlII = new String[lllIIIIlll[137]];
        lllIIIIlII[lllIIIIlll[1]] = lIllllIllllIl("D8RTjuRcmuGkMtHJa2zfDGnR1ifC8YMvVtxoj589QDl0WXlePALUYX7Rl1j+bJm8", "Tayrl");
        lllIIIIlII[lllIIIIlll[0]] = lIlllllIIIIII("beUkrLvVqZZyfjNknYa8kQ==", "mgCKb");
        lllIIIIlII[lllIIIIlll[4]] = lIlllllIIIIII("tsQFazGjsZDWRWHZWDDlBg==", "kJvMK");
        lllIIIIlII[lllIIIIlll[6]] = lIlllllIIIIII("I8OrbUXzQDpQBvG/EeM8lA==", "uIwrQ");
        lllIIIIlII[lllIIIIlll[7]] = lIlllllIIIIII("BNGFW4CP3Ps=", "xTLaU");
        lllIIIIlII[lllIIIIlll[8]] = lIlllllIIIIIl("KyMydjsKYiY3IQ4=", "eBDVO");
        lllIIIIlII[lllIIIIlll[10]] = lIlllllIIIIIl("IzYLEgECOQJWDwo5Dh8DDA==", "kWevm");
        lllIIIIlII[lllIIIIlll[19]] = lIlllllIIIIIl("BhBoDAo0VSUECyIcJgpYIAAtHgxxBj0dCD0cLR5UcQY/BAwyHSEDH3EBJ006BCwBIz8=", "QuHmx");
        lllIIIIlII[lllIIIIlll[21]] = lIlllllIIIIII("a4wFO3IbfJkT3bqSiaP47uN61Lgt+4lcTAgFBSXJ+kpUuKAwqs210Gl3AMVOZa1QRVexSOr9tAU=", "hHOuF");
        lllIIIIlII[lllIIIIlll[23]] = lIlllllIIIIII("25aHVqLX4+0=", "SYLSu");
        lllIIIIlII[lllIIIIlll[11]] = lIlllllIIIIII("D2+NhVS+HAQ=", "qOueS");
        lllIIIIlII[lllIIIIlll[31]] = lIllllIllllIl("oEA4QhCxOOs=", "Trhpz");
        lllIIIIlII[lllIIIIlll[29]] = lIlllllIIIIIl("BhsV", "CzajC");
        lllIIIIlII[lllIIIIlll[35]] = lIllllIllllIl("ty8n49RvXeU=", "UHMcH");
        lllIIIIlII[lllIIIIlll[36]] = lIllllIllllIl("zadxeE+wR96SL2iiuW3enQ==", "SAbqq");
        lllIIIIlII[lllIIIIlll[37]] = lIllllIllllIl("9DGxn+UheTzHNy4TiDIzTQ==", "wsNbb");
        lllIIIIlII[lllIIIIlll[38]] = lIlllllIIIIIl("Jy4ZAw0fPQ==", "pOkqd");
        lllIIIIlII[lllIIIIlll[41]] = lIlllllIIIIII("s8btaYXqA4z1HH+nq/GP3Q==", "JTMqG");
        lllIIIIlII[lllIIIIlll[42]] = lIlllllIIIIII("a38ItuVKj6ajGBpCxzfv7w==", "EbwNR");
        lllIIIIlII[lllIIIIlll[43]] = lIllllIllllIl("VscL9RPPepw=", "QRqUs");
        lllIIIIlII[lllIIIIlll[45]] = lIllllIllllIl("tXWlYA9cRk8=", "Ftqng");
        lllIIIIlII[lllIIIIlll[46]] = lIllllIllllIl("tpdiQzVhW2w=", "xlAXB");
        lllIIIIlII[lllIIIIlll[47]] = lIlllllIIIIIl("Og8GOwQa", "iggVq");
        lllIIIIlII[lllIIIIlll[34]] = lIlllllIIIIIl("ET0JPys2bwcpNA==", "SOfQQ");
        lllIIIIlII[lllIIIIlll[49]] = lIlllllIIIIII("bPpsRdTI4lt4b35/4FmUIw==", "sOsHH");
        lllIIIIlII[lllIIIIlll[50]] = lIllllIllllIl("nJ2zI4SF5UCOD/BrrHspnw==", "oQskj");
        lllIIIIlII[lllIIIIlll[51]] = lIlllllIIIIII("/nEaEmFQ5Bw=", "rrqEH");
        lllIIIIlII[lllIIIIlll[53]] = lIlllllIIIIIl("GAATaD85QRE6LjM=", "VaeHK");
        lllIIIIlII[lllIIIIlll[55]] = lIlllllIIIIIl("HSEMGgg3cxkFCDw=", "YSmwm");
        lllIIIIlII[lllIIIIlll[56]] = lIlllllIIIIII("Eq3ZtJsDuezxUnM6JsV8Cg==", "FimlN");
        lllIIIIlII[lllIIIIlll[48]] = lIlllllIIIIIl("OyEODh4eL0IRBxk6CxY=", "pHbbw");
        lllIIIIlII[lllIIIIlll[2]] = lIlllllIIIIIl("EQAiJzxyGjYmKg==", "RhCHO");
        lllIIIIlII[lllIIIIlll[57]] = lIllllIllllIl("Tghp9ddNB6tkOaJTC3STRQ==", "EVDNA");
        lllIIIIlII[lllIIIIlll[59]] = lIlllllIIIIIl("OgAIFi0dUgYAMg==", "xrgxW");
        lllIIIIlII[lllIIIIlll[60]] = lIlllllIIIIIl("IycyZCQCZiglNAkjNg==", "mFDDP");
        lllIIIIlII[lllIIIIlll[58]] = lIlllllIIIIIl("CgUIci5pDgknFScBH3IIJ0QSOg46RBU6Djlb", "IdfRg");
        lllIIIIlII[lllIIIIlll[3]] = lIllllIllllIl("KJl7avSc+ZjRhfIAf7Nb7BFBNeYxjtTRjkpTS/RdE1gmYhS0lC/PCg==", "AGbSD");
        lllIIIIlII[lllIIIIlll[61]] = lIlllllIIIIII("22hCGbmynNg=", "Eivce");
        lllIIIIlII[lllIIIIlll[62]] = lIlllllIIIIIl("HjUvG0EnOy0b", "JTCpa");
        lllIIIIlII[lllIIIIlll[63]] = lIlllllIIIIII("TL1N9uqgYoM=", "mrcok");
        lllIIIIlII[lllIIIIlll[64]] = lIllllIllllIl("1di1tvN8KeYr4YWMHHeSWw==", "vtcQG");
        lllIIIIlII[lllIIIIlll[65]] = lIlllllIIIIII("LSP7IoUGsVRJW6ReMSVVOQ==", "ZFofz");
        lllIIIIlII[lllIIIIlll[66]] = lIlllllIIIIII("ryajPjQFfsX5ebjlVCwCBA==", "BwpNu");
        lllIIIIlII[lllIIIIlll[67]] = lIlllllIIIIIl("AwUOIxUkVwA1Cg==", "AwaMo");
        lllIIIIlII[lllIIIIlll[68]] = lIllllIllllIl("C7V01no+QBNu8Cg2TnWEDQ==", "qikyI");
        lllIIIIlII[lllIIIIlll[5]] = lIlllllIIIIIl("OQckJgZaHTAnEA==", "zoEIu");
        lllIIIIlII[lllIIIIlll[69]] = lIlllllIIIIII("IfGk+IcWiEG7zSK/TCkKOA==", "JuJwT");
        lllIIIIlII[lllIIIIlll[70]] = lIlllllIIIIIl("IxQ1AgsERjsUFA==", "afZlq");
        lllIIIIlII[lllIIIIlll[71]] = lIllllIllllIl("zIDaR+dDTHY=", "xXkOO");
        lllIIIIlII[lllIIIIlll[72]] = lIlllllIIIIIl("CAEsOS8lE3g5NC4R", "KtXMF");
        lllIIIIlII[lllIIIIlll[33]] = lIlllllIIIIIl("NB8jOxMeTTYkExU=", "pmBVv");
        lllIIIIlII[lllIIIIlll[73]] = lIllllIllllIl("TSEwU1W1/p0d182WE41IZw==", "ogisi");
        lllIIIIlII[lllIIIIlll[75]] = lIlllllIIIIII("aVd/wyaAwgs=", "hqNmx");
        lllIIIIlII[lllIIIIlll[76]] = lIllllIllllIl("NtqB/AH+qWw=", "vkwlp");
        lllIIIIlII[lllIIIIlll[77]] = lIlllllIIIIIl("PRcZchwcVgQ8ARUT", "svoRh");
        lllIIIIlII[lllIIIIlll[78]] = lIlllllIIIIII("APrP3OQbTuI=", "koppW");
        lllIIIIlII[lllIIIIlll[79]] = lIlllllIIIIIl("MhwYLCk=", "yrqJL");
        lllIIIIlII[lllIIIIlll[80]] = lIlllllIIIIII("7XyFEAwrNrg=", "OglNE");
        lllIIIIlII[lllIIIIlll[81]] = lIlllllIIIIII("J5komp2nErg=", "WWuKd");
        lllIIIIlII[lllIIIIlll[82]] = lIlllllIIIIIl("EjYYBx0=", "YXqax");
        lllIIIIlII[lllIIIIlll[83]] = lIlllllIIIIIl("IzEJAiQJYwodIAkgAA==", "gChoA");
        lllIIIIlII[lllIIIIlll[84]] = lIlllllIIIIIl("HQM1Oy43USciKj8X", "YqTVK");
        lllIIIIlII[lllIIIIlll[85]] = lIllllIllllIl("iMNW2R3lpdibXQvS5483OA==", "sZqsJ");
        lllIIIIlII[lllIIIIlll[86]] = lIlllllIIIIIl("PCAoJj0Wcjo/OR40", "xRIKX");
        lllIIIIlII[lllIIIIlll[87]] = lIlllllIIIIIl("BhEXORI=", "QxrUv");
        lllIIIIlII[lllIIIIlll[88]] = lIlllllIIIIII("1MTWAD0C1v4VsbkKpi+fTw==", "BLCRB");
        lllIIIIlII[lllIIIIlll[89]] = lIllllIllllIl("b7xoPwcXh8TViyg3qZ/B2A==", "mpRgk");
        lllIIIIlII[lllIIIIlll[90]] = lIlllllIIIIIl("ND4rGQ==", "pQDkd");
        lllIIIIlII[lllIIIIlll[91]] = lIllllIllllIl("/mTL8SnaldU=", "oQlur");
        lllIIIIlII[lllIIIIlll[105]] = lIlllllIIIIIl("NhkXKGcrFlk4IiUcDSdnbA==", "DpyOG");
        lllIIIIlII[lllIIIIlll[52]] = lIlllllIIIIII("dsStZpvxOes=", "vDBgj");
        lllIIIIlII[lllIIIIlll[106]] = lIlllllIIIIII("ZBsMWaEBcxI=", "AagGm");
        lllIIIIlII[lllIIIIlll[107]] = lIlllllIIIIII("oA62Zqlu3io=", "SMaBw");
        lllIIIIlII[lllIIIIlll[108]] = lIlllllIIIIII("e6mwCy0duQM=", "yRBYo");
        lllIIIIlII[lllIIIIlll[109]] = lIlllllIIIIIl("EQMqFQQu", "KlGwm");
        lllIIIIlII[lllIIIIlll[128]] = lIllllIllllIl("PPSu8wETV40EkNnUuNOWjofXVTIDhGGGuTQfitjktqMDLQV5sxJxHaQk2Jl9oobT", "ulXKJ");
        lllIIIIlII[lllIIIIlll[129]] = lIllllIllllIl("+oWej7ljPcOtonpF2awJJfyHkxU4aEeUnqOaHCXtm6xU2LAECVtvOS6xCb1M8lS+kKmMhlniRoI=", "XWxJV");
        lllIIIIlII[lllIIIIlll[130]] = lIllllIllllIl("hwJhTYGYHhliQ+fwSMhHo1GWFiDSj9cGiUSO0q0iUeeqzgIVa/X9pw==", "DYfRu");
        lllIIIIlII[lllIIIIlll[131]] = lIllllIllllIl("lsyTkmEx+uaOhnYNdr14q/SwTkVh944RfOqxLwg73+Me98gpaEKGDbYUjjkEYXGt", "longi");
        lllIIIIlII[lllIIIIlll[132]] = lIlllllIIIIIl("Lyo9Lh9DKTsuCUM8PTBMByo8YhhDLjwqG0MgOzEEBjd8", "cEREl");
        lllIIIIlII[lllIIIIlll[133]] = lIlllllIIIIIl("HTwQVzw6NhRXMSFzAR4sdToJVzl1IA8SPHUnDxI2ag==", "USgwX");
        lllIIIIlII[lllIIIIlll[134]] = lIlllllIIIIIl("Ij8LAE0BMgYYTRwpRw1NBzMUB008ehAFARl6Dw0bEHoTA00BOwwJQw==", "uZglm");
        lllIIIIlII[lllIIIIlll[135]] = lIlllllIIIIIl("ITcQYw==", "xRcMq");
        lllIIIIlII[lllIIIIlll[136]] = lIlllllIIIIIl("", "crpNQ");
    }
}
