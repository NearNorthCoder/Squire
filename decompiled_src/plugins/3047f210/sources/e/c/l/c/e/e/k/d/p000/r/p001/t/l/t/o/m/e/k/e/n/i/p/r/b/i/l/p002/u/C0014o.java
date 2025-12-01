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
import net.runelite.api.Prayer;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
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
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.o  reason: invalid package and case insensitive filesystem */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/o.class */
public class C0014o implements S {
    private static /* synthetic */ String[] bQ;
    public static final /* synthetic */ WorldPoint ct;
    public static final /* synthetic */ WorldPoint cu;
    static /* synthetic */ int cw;
    public static final /* synthetic */ WorldPoint cs;
    public static final /* synthetic */ WorldPoint cq;
    public static final /* synthetic */ WorldPoint cp;
    static /* synthetic */ WorldArea cx;
    private static /* synthetic */ String[] lIIIIIIIlIl;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ List<C0003d> bu;
    public static final /* synthetic */ WorldPoint cn;
    public static final /* synthetic */ WorldPoint co;
    public static final /* synthetic */ WorldPoint cv;
    static /* synthetic */ boolean cl;
    static /* synthetic */ int ck;
    private static /* synthetic */ int[] lIIIIIIIlll;
    public static final /* synthetic */ WorldPoint cr;

    private static boolean llIllIllIIIll(int i, int i2) {
        return i < i2;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lIIIIIIIlIl[lIIIIIIIlll[86]];
    }

    private static boolean llIllIllIlIIl(int i, int i2) {
        return i <= i2;
    }

    private static String llIllIlIlIIlI(String lllllllllllllllllIlIIIIIIIIlIIlI, String lllllllllllllllllIlIIIIIIIIlIIll) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIIIIIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIIIIIlIIll.getBytes(StandardCharsets.UTF_8)), lIIIIIIIlll[23]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIIlll[5], lllllllllllllllllIlIIIIIIIIlIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIIIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIIIIIIIlIIII) {
            lllllllllllllllllIlIIIIIIIIlIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIllIIllI(Object obj) {
        return obj != null;
    }

    private static String llIllIlIlIIII(String lllllllllllllllllIlIIIIIIIIIIlII, String lllllllllllllllllIlIIIIIIIIIIIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIIIIIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIIIIIIIIIIIlI = new StringBuilder();
        char[] charArray = lllllllllllllllllIlIIIIIIIIIIIll.toCharArray();
        int lllllllllllllllllIIllllllllllIll = lIIIIIIIlll[1];
        char[] charArray2 = str.toCharArray();
        int lllllllllllllllllIIllllllllllIIl = charArray2.length;
        int i = lIIIIIIIlll[1];
        while (llIllIllIIIll(i, lllllllllllllllllIIllllllllllIIl)) {
            lllllllllllllllllIlIIIIIIIIIIIlI.append((char) (charArray2[i] ^ charArray[lllllllllllllllllIIllllllllllIll % charArray.length]));
            "".length();
            lllllllllllllllllIIllllllllllIll++;
            i++;
            "".length();
            if ((-"   ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlIIIIIIIIIIIlI);
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            aD();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (208 ^ 149) & ((70 ^ 3) ^ (-1));
            }
        } catch (Exception e2) {
        }
        return lIIIIIIIlll[85];
    }

    private static boolean llIllIllIlIII(int i, int i2) {
        return i > i2;
    }

    private static boolean llIllIllIIlII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lIIIIIIIlll[1];
    }

    private static boolean llIllIllIIIlI(int i) {
        return i != 0;
    }

    private static boolean llIllIllIlIll(Object obj) {
        return obj == null;
    }

    private static boolean llIllIllIllII(int i, int i2) {
        return i != i2;
    }

    static {
        llIllIllIIIIl();
        llIllIllIIIII();
        cn = new WorldPoint(lIIIIIIIlll[91], lIIIIIIIlll[92], lIIIIIIIlll[1]);
        co = new WorldPoint(lIIIIIIIlll[93], lIIIIIIIlll[94], lIIIIIIIlll[1]);
        cp = new WorldPoint(lIIIIIIIlll[95], lIIIIIIIlll[96], lIIIIIIIlll[1]);
        cq = new WorldPoint(lIIIIIIIlll[97], lIIIIIIIlll[98], lIIIIIIIlll[1]);
        cr = new WorldPoint(lIIIIIIIlll[99], lIIIIIIIlll[100], lIIIIIIIlll[1]);
        cs = new WorldPoint(lIIIIIIIlll[101], lIIIIIIIlll[102], lIIIIIIIlll[1]);
        ct = new WorldPoint(lIIIIIIIlll[103], lIIIIIIIlll[104], lIIIIIIIlll[1]);
        cu = new WorldPoint(lIIIIIIIlll[91], lIIIIIIIlll[105], lIIIIIIIlll[1]);
        cv = new WorldPoint(lIIIIIIIlll[106], lIIIIIIIlll[107], lIIIIIIIlll[1]);
        bu = new ArrayList();
        cw = lIIIIIIIlll[30];
        cx = new WorldArea(lIIIIIIIlll[93], lIIIIIIIlll[108], lIIIIIIIlll[26], lIIIIIIIlll[47], lIIIIIIIlll[1]);
        String[] strArr = new String[lIIIIIIIlll[11]];
        strArr[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[109]];
        strArr[lIIIIIIIlll[0]] = lIIIIIIIlIl[lIIIIIIIlll[110]];
        strArr[lIIIIIIIlll[5]] = lIIIIIIIlIl[lIIIIIIIlll[111]];
        bQ = strArr;
    }

    private static boolean llIllIllIllIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llIllIllIlIlI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean aa() {
        int[] iArr = new int[lIIIIIIIlll[12]];
        iArr[lIIIIIIIlll[1]] = lIIIIIIIlll[13];
        iArr[lIIIIIIIlll[0]] = lIIIIIIIlll[7];
        iArr[lIIIIIIIlll[5]] = lIIIIIIIlll[10];
        iArr[lIIIIIIIlll[11]] = lIIIIIIIlll[14];
        iArr[lIIIIIIIlll[6]] = lIIIIIIIlll[15];
        iArr[lIIIIIIIlll[16]] = lIIIIIIIlll[17];
        int lllllllllllllllllIlIIIIIIIllIIIl = lIIIIIIIlll[1];
        while (llIllIllIIIll(lllllllllllllllllIlIIIIIIIllIIIl, iArr.length)) {
            int[] iArr2 = new int[lIIIIIIIlll[0]];
            iArr2[lIIIIIIIlll[1]] = iArr[lllllllllllllllllIlIIIIIIIllIIIl];
            if (llIllIllIIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIIIIIIlll[1];
            }
            lllllllllllllllllIlIIIIIIIllIIIl++;
            "".length();
            if ((-(53 ^ 48)) >= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIIIIIIIlll[0];
    }

    private static void llIllIllIIIIl() {
        lIIIIIIIlll = new int[113];
        lIIIIIIIlll[0] = " ".length();
        lIIIIIIIlll[1] = "   ".length() & ("   ".length() ^ (-" ".length()));
        lIIIIIIIlll[2] = (((57 + 120) - 25) + 35) ^ (((137 + 115) - 188) + 86);
        lIIIIIIIlll[3] = (((104 + 59) - 25) + 39) ^ (((124 + 12) - (-45)) + 7);
        lIIIIIIIlll[4] = (-((-21132) & 23199)) & (-1025) & 8091;
        lIIIIIIIlll[5] = "  ".length();
        lIIIIIIIlll[6] = 162 ^ 166;
        lIIIIIIIlll[7] = (-((-2062) & 14495)) & (-19457) & 32447;
        lIIIIIIIlll[8] = (-19474) & 20473;
        lIIIIIIIlll[9] = (-((-2025) & 28649)) & (-1361) & 28541;
        lIIIIIIIlll[10] = (-((-941) & 16365)) & (-406) & 16383;
        lIIIIIIIlll[11] = "   ".length();
        lIIIIIIIlll[12] = 33 ^ 39;
        lIIIIIIIlll[13] = (-24737) & 32743;
        lIIIIIIIlll[14] = (-((-381) & 4093)) & (-9) & 16345;
        lIIIIIIIlll[15] = (-((-9193) & 26605)) & (-14873) & 32669;
        lIIIIIIIlll[16] = 75 ^ 78;
        lIIIIIIIlll[17] = (-8806) & 11239;
        lIIIIIIIlll[18] = (98 ^ 36) ^ (142 ^ 194);
        lIIIIIIIlll[19] = (-((-583) & 24143)) & (-8209) & 32763;
        lIIIIIIIlll[20] = (((2 + 94) - 72) + 144) ^ (((22 + 19) - (-4)) + 109);
        lIIIIIIIlll[21] = 70 ^ 95;
        lIIIIIIIlll[22] = (129 ^ 156) ^ (77 ^ 87);
        lIIIIIIIlll[23] = (((19 + 36) - 37) + 122) ^ (((11 + 77) - 15) + 59);
        lIIIIIIIlll[24] = 44 ^ 37;
        lIIIIIIIlll[25] = 118 ^ 125;
        lIIIIIIIlll[26] = (141 ^ 129) ^ ((60 ^ 43) & ((187 ^ 172) ^ (-1)));
        lIIIIIIIlll[27] = (24 ^ 48) ^ (44 ^ 10);
        lIIIIIIIlll[28] = 58 ^ 53;
        lIIIIIIIlll[29] = (((106 + 91) - 30) + 0) ^ (((16 + 105) - 70) + 132);
        lIIIIIIIlll[30] = 87 ^ 70;
        lIIIIIIIlll[31] = 55 ^ 37;
        lIIIIIIIlll[32] = (29 ^ 11) ^ (72 ^ 77);
        lIIIIIIIlll[33] = 183 ^ 163;
        lIIIIIIIlll[34] = 50 ^ 39;
        lIIIIIIIlll[35] = (((98 + 113) - 184) + 145) ^ (((184 + 60) - 206) + 148);
        lIIIIIIIlll[36] = (164 ^ 132) ^ (25 ^ 46);
        lIIIIIIIlll[37] = (((61 + 99) - 83) + 54) ^ (((98 + 18) - 42) + 81);
        lIIIIIIIlll[38] = (84 ^ 74) ^ (0 ^ 85);
        lIIIIIIIlll[39] = (((130 + 86) - 211) + 131) ^ (((67 + 8) - (-112)) + 7);
        lIIIIIIIlll[40] = (139 ^ 143) ^ (144 ^ 142);
        lIIIIIIIlll[41] = 43 ^ 48;
        lIIIIIIIlll[42] = 31 ^ 3;
        lIIIIIIIlll[43] = (169 ^ 150) ^ (65 ^ 99);
        lIIIIIIIlll[44] = 154 ^ 132;
        lIIIIIIIlll[45] = 72 ^ 87;
        lIIIIIIIlll[46] = 88 ^ 120;
        lIIIIIIIlll[47] = 176 ^ 145;
        lIIIIIIIlll[48] = 188 ^ 158;
        lIIIIIIIlll[49] = (((42 + 142) - 127) + 129) ^ (((71 + 33) - 1) + 50);
        lIIIIIIIlll[50] = 0 ^ 36;
        lIIIIIIIlll[51] = (177 ^ 130) ^ (33 ^ 55);
        lIIIIIIIlll[52] = 191 ^ 153;
        lIIIIIIIlll[53] = 163 ^ 132;
        lIIIIIIIlll[54] = (65 ^ 95) ^ (119 ^ 65);
        lIIIIIIIlll[55] = 180 ^ 157;
        lIIIIIIIlll[56] = (25 ^ 34) ^ (50 ^ 35);
        lIIIIIIIlll[57] = 165 ^ 142;
        lIIIIIIIlll[58] = (((119 + 52) - 101) + 90) ^ (((37 + 98) - 89) + 94);
        lIIIIIIIlll[59] = 183 ^ 153;
        lIIIIIIIlll[60] = 48 ^ 31;
        lIIIIIIIlll[61] = 112 ^ 64;
        lIIIIIIIlll[62] = 7 ^ 54;
        lIIIIIIIlll[63] = (168 ^ 130) ^ (62 ^ 39);
        lIIIIIIIlll[64] = 29 ^ 41;
        lIIIIIIIlll[65] = (126 ^ 25) ^ (144 ^ 194);
        lIIIIIIIlll[66] = (((87 + 87) - 120) + 127) ^ (((7 + 34) - (-6)) + 84);
        lIIIIIIIlll[67] = (110 ^ 42) ^ (113 ^ 2);
        lIIIIIIIlll[68] = (-((-4097) & 28942)) & (-513) & 28541;
        lIIIIIIIlll[69] = (-8713) & 12219;
        lIIIIIIIlll[70] = (("  ".length() + (125 ^ 48)) - (-(1 ^ 69))) + "   ".length();
        lIIIIIIIlll[71] = (23 ^ 120) ^ (225 ^ 182);
        lIIIIIIIlll[72] = 157 ^ 164;
        lIIIIIIIlll[73] = (-30230) & 32661;
        lIIIIIIIlll[74] = (-((-2695) & 31671)) & (-513) & 32567;
        lIIIIIIIlll[75] = 94 ^ 49;
        lIIIIIIIlll[76] = 163 ^ 153;
        lIIIIIIIlll[77] = (-((-3841) & 32535)) & (-65) & 31223;
        lIIIIIIIlll[78] = (-21077) & 24149;
        lIIIIIIIlll[79] = 249 ^ 194;
        lIIIIIIIlll[80] = (-20484) & 21883;
        lIIIIIIIlll[81] = (-((-3481) & 7580)) & (-16417) & 32495;
        lIIIIIIIlll[82] = (-((-10306) & 10823)) & (-1) & 25517;
        lIIIIIIIlll[83] = (-((-12877) & 16255)) & (-6) & 16383;
        lIIIIIIIlll[84] = (-((-1441) & 5628)) & (-19457) & 24543;
        lIIIIIIIlll[85] = 240 ^ 148;
        lIIIIIIIlll[86] = 122 ^ 70;
        lIIIIIIIlll[87] = (240 ^ 194) ^ (3 ^ 12);
        lIIIIIIIlll[88] = 138 ^ 180;
        lIIIIIIIlll[89] = 97 ^ 94;
        lIIIIIIIlll[90] = (138 ^ 144) ^ (15 ^ 85);
        lIIIIIIIlll[91] = (-16569) & 19135;
        lIIIIIIIlll[92] = (-4482) & 7679;
        lIIIIIIIlll[93] = (-((-12101) & 16327)) & (-16717) & 23550;
        lIIIIIIIlll[94] = (-((-213) & 13269)) & (-9) & 16253;
        lIIIIIIIlll[95] = (-21891) & 24503;
        lIIIIIIIlll[96] = (-20489) & 23678;
        lIIIIIIIlll[97] = (-((-8753) & 10229)) & (-28673) & 32764;
        lIIIIIIIlll[98] = (-12931) & 16103;
        lIIIIIIIlll[99] = (-21953) & 24567;
        lIIIIIIIlll[100] = (-((-18502) & 31199)) & (-545) & 16383;
        lIIIIIIIlll[101] = (-21665) & 24250;
        lIIIIIIIlll[102] = (-28730) & 31869;
        lIIIIIIIlll[103] = (-13673) & 16250;
        lIIIIIIIlll[104] = (-((-71) & 20695)) & (-2) & 23769;
        lIIIIIIIlll[105] = (-((-3087) & 15807)) & (-16905) & 32767;
        lIIIIIIIlll[106] = (-29697) & 32314;
        lIIIIIIIlll[107] = (-((-19987) & 24499)) & (-8193) & 15871;
        lIIIIIIIlll[108] = (-13093) & 16231;
        lIIIIIIIlll[109] = (216 ^ 165) ^ (156 ^ 160);
        lIIIIIIIlll[110] = (((108 + 156) - 200) + 182) ^ (((75 + 174) - 134) + 65);
        lIIIIIIIlll[111] = (172 ^ 197) ^ (114 ^ 88);
        lIIIIIIIlll[112] = 248 ^ 188;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e6, code lost:
        if (llIllIllIIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0014o.lIIIIIIIlll[8]) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x016f, code lost:
        if (llIllIllIIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0014o.lIIIIIIIlll[8]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01f8, code lost:
        if (llIllIllIIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0014o.lIIIIIIIlll[28]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02ba, code lost:
        if (llIllIllIIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0014o.lIIIIIIIlll[6]) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x033f, code lost:
        if (llIllIllIIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0014o.lIIIIIIIlll[5]) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (llIllIllIIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0014o.lIIIIIIIlll[8]) != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0388  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ae() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7 = new int[lIIIIIIIlll[0]];
        iArr7[lIIIIIIIlll[1]] = lIIIIIIIlll[9];
        if (llIllIllIIIlI(Bank.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[lIIIIIIIlll[0]];
            iArr8[lIIIIIIIlll[1]] = lIIIIIIIlll[9];
            if (llIllIllIIIlI(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIIIIIIlll[0]];
                iArr9[lIIIIIIIlll[1]] = lIIIIIIIlll[9];
            }
            iArr = new int[lIIIIIIIlll[0]];
            iArr[lIIIIIIIlll[1]] = lIIIIIIIlll[7];
            if (llIllIllIIIlI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr10 = new int[lIIIIIIIlll[0]];
                iArr10[lIIIIIIIlll[1]] = lIIIIIIIlll[7];
                if (llIllIllIIIlI(Bank.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[lIIIIIIIlll[0]];
                    iArr11[lIIIIIIIlll[1]] = lIIIIIIIlll[7];
                }
                iArr2 = new int[lIIIIIIIlll[0]];
                iArr2[lIIIIIIIlll[1]] = lIIIIIIIlll[10];
                if (llIllIllIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr12 = new int[lIIIIIIIlll[0]];
                    iArr12[lIIIIIIIlll[1]] = lIIIIIIIlll[10];
                    if (llIllIllIIIlI(Bank.contains(iArr12) ? 1 : 0)) {
                        int[] iArr13 = new int[lIIIIIIIlll[0]];
                        iArr13[lIIIIIIIlll[1]] = lIIIIIIIlll[10];
                    }
                    iArr3 = new int[lIIIIIIIlll[0]];
                    iArr3[lIIIIIIIlll[1]] = lIIIIIIIlll[15];
                    if (llIllIllIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr14 = new int[lIIIIIIIlll[0]];
                        iArr14[lIIIIIIIlll[1]] = lIIIIIIIlll[15];
                        if (llIllIllIIIlI(Bank.contains(iArr14) ? 1 : 0)) {
                            int[] iArr15 = new int[lIIIIIIIlll[0]];
                            iArr15[lIIIIIIIlll[1]] = lIIIIIIIlll[15];
                        }
                        if (llIllIllIIlII(Bank.contains(item -> {
                            return item.getName().toLowerCase().contains(lIIIIIIIlIl[lIIIIIIIlll[87]]);
                        }) ? 1 : 0)) {
                            bu.add(new C0003d(lIIIIIIIlll[81], lIIIIIIIlll[16], lIIIIIIIlll[82]));
                            "".length();
                        }
                        iArr4 = new int[lIIIIIIIlll[0]];
                        iArr4[lIIIIIIIlll[1]] = lIIIIIIIlll[14];
                        if (llIllIllIIIlI(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr16 = new int[lIIIIIIIlll[0]];
                            iArr16[lIIIIIIIlll[1]] = lIIIIIIIlll[14];
                            if (llIllIllIIIlI(Bank.contains(iArr16) ? 1 : 0)) {
                                int[] iArr17 = new int[lIIIIIIIlll[0]];
                                iArr17[lIIIIIIIlll[1]] = lIIIIIIIlll[14];
                            }
                            iArr5 = new int[lIIIIIIIlll[0]];
                            iArr5[lIIIIIIIlll[1]] = lIIIIIIIlll[17];
                            if (llIllIllIIIlI(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr18 = new int[lIIIIIIIlll[0]];
                                iArr18[lIIIIIIIlll[1]] = lIIIIIIIlll[17];
                                if (llIllIllIIIlI(Bank.contains(iArr18) ? 1 : 0)) {
                                    int[] iArr19 = new int[lIIIIIIIlll[0]];
                                    iArr19[lIIIIIIIlll[1]] = lIIIIIIIlll[17];
                                }
                                iArr6 = new int[lIIIIIIIlll[0]];
                                iArr6[lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                                if (llIllIllIIIlI(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr20 = new int[lIIIIIIIlll[0]];
                                    iArr20[lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                                    if (!llIllIllIIIlI(Bank.contains(iArr20) ? 1 : 0)) {
                                        return;
                                    }
                                    int[] iArr21 = new int[lIIIIIIIlll[0]];
                                    iArr21[lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                                    if (!llIllIllIIIll(Bank.getFirst(iArr21).getQuantity(), lIIIIIIIlll[28])) {
                                        return;
                                    }
                                }
                                bu.add(new C0003d(lIIIIIIIlll[13], lIIIIIIIlll[54], lIIIIIIIlll[84]));
                                "".length();
                            }
                            bu.add(new C0003d(lIIIIIIIlll[17], lIIIIIIIlll[11], lIIIIIIIlll[83]));
                            "".length();
                            iArr6 = new int[lIIIIIIIlll[0]];
                            iArr6[lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                            if (llIllIllIIIlI(Bank.contains(iArr6) ? 1 : 0)) {
                            }
                            bu.add(new C0003d(lIIIIIIIlll[13], lIIIIIIIlll[54], lIIIIIIIlll[84]));
                            "".length();
                        }
                        bu.add(new C0003d(lIIIIIIIlll[14], lIIIIIIIlll[6], C0008i.bp));
                        "".length();
                        iArr5 = new int[lIIIIIIIlll[0]];
                        iArr5[lIIIIIIIlll[1]] = lIIIIIIIlll[17];
                        if (llIllIllIIIlI(Bank.contains(iArr5) ? 1 : 0)) {
                        }
                        bu.add(new C0003d(lIIIIIIIlll[17], lIIIIIIIlll[11], lIIIIIIIlll[83]));
                        "".length();
                        iArr6 = new int[lIIIIIIIlll[0]];
                        iArr6[lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                        if (llIllIllIIIlI(Bank.contains(iArr6) ? 1 : 0)) {
                        }
                        bu.add(new C0003d(lIIIIIIIlll[13], lIIIIIIIlll[54], lIIIIIIIlll[84]));
                        "".length();
                    }
                    bu.add(new C0003d(lIIIIIIIlll[15], lIIIIIIIlll[33], lIIIIIIIlll[80]));
                    "".length();
                    if (llIllIllIIlII(Bank.contains(item2 -> {
                        return item2.getName().toLowerCase().contains(lIIIIIIIlIl[lIIIIIIIlll[87]]);
                    }) ? 1 : 0)) {
                    }
                    iArr4 = new int[lIIIIIIIlll[0]];
                    iArr4[lIIIIIIIlll[1]] = lIIIIIIIlll[14];
                    if (llIllIllIIIlI(Bank.contains(iArr4) ? 1 : 0)) {
                    }
                    bu.add(new C0003d(lIIIIIIIlll[14], lIIIIIIIlll[6], C0008i.bp));
                    "".length();
                    iArr5 = new int[lIIIIIIIlll[0]];
                    iArr5[lIIIIIIIlll[1]] = lIIIIIIIlll[17];
                    if (llIllIllIIIlI(Bank.contains(iArr5) ? 1 : 0)) {
                    }
                    bu.add(new C0003d(lIIIIIIIlll[17], lIIIIIIIlll[11], lIIIIIIIlll[83]));
                    "".length();
                    iArr6 = new int[lIIIIIIIlll[0]];
                    iArr6[lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                    if (llIllIllIIIlI(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    bu.add(new C0003d(lIIIIIIIlll[13], lIIIIIIIlll[54], lIIIIIIIlll[84]));
                    "".length();
                }
                bu.add(new C0003d(lIIIIIIIlll[10], lIIIIIIIlll[8], lIIIIIIIlll[18]));
                "".length();
                iArr3 = new int[lIIIIIIIlll[0]];
                iArr3[lIIIIIIIlll[1]] = lIIIIIIIlll[15];
                if (llIllIllIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
                }
                bu.add(new C0003d(lIIIIIIIlll[15], lIIIIIIIlll[33], lIIIIIIIlll[80]));
                "".length();
                if (llIllIllIIlII(Bank.contains(item22 -> {
                    return item22.getName().toLowerCase().contains(lIIIIIIIlIl[lIIIIIIIlll[87]]);
                }) ? 1 : 0)) {
                }
                iArr4 = new int[lIIIIIIIlll[0]];
                iArr4[lIIIIIIIlll[1]] = lIIIIIIIlll[14];
                if (llIllIllIIIlI(Bank.contains(iArr4) ? 1 : 0)) {
                }
                bu.add(new C0003d(lIIIIIIIlll[14], lIIIIIIIlll[6], C0008i.bp));
                "".length();
                iArr5 = new int[lIIIIIIIlll[0]];
                iArr5[lIIIIIIIlll[1]] = lIIIIIIIlll[17];
                if (llIllIllIIIlI(Bank.contains(iArr5) ? 1 : 0)) {
                }
                bu.add(new C0003d(lIIIIIIIlll[17], lIIIIIIIlll[11], lIIIIIIIlll[83]));
                "".length();
                iArr6 = new int[lIIIIIIIlll[0]];
                iArr6[lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                if (llIllIllIIIlI(Bank.contains(iArr6) ? 1 : 0)) {
                }
                bu.add(new C0003d(lIIIIIIIlll[13], lIIIIIIIlll[54], lIIIIIIIlll[84]));
                "".length();
            }
            bu.add(new C0003d(lIIIIIIIlll[7], lIIIIIIIlll[8], lIIIIIIIlll[18]));
            "".length();
            iArr2 = new int[lIIIIIIIlll[0]];
            iArr2[lIIIIIIIlll[1]] = lIIIIIIIlll[10];
            if (llIllIllIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bu.add(new C0003d(lIIIIIIIlll[10], lIIIIIIIlll[8], lIIIIIIIlll[18]));
            "".length();
            iArr3 = new int[lIIIIIIIlll[0]];
            iArr3[lIIIIIIIlll[1]] = lIIIIIIIlll[15];
            if (llIllIllIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
            }
            bu.add(new C0003d(lIIIIIIIlll[15], lIIIIIIIlll[33], lIIIIIIIlll[80]));
            "".length();
            if (llIllIllIIlII(Bank.contains(item222 -> {
                return item222.getName().toLowerCase().contains(lIIIIIIIlIl[lIIIIIIIlll[87]]);
            }) ? 1 : 0)) {
            }
            iArr4 = new int[lIIIIIIIlll[0]];
            iArr4[lIIIIIIIlll[1]] = lIIIIIIIlll[14];
            if (llIllIllIIIlI(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bu.add(new C0003d(lIIIIIIIlll[14], lIIIIIIIlll[6], C0008i.bp));
            "".length();
            iArr5 = new int[lIIIIIIIlll[0]];
            iArr5[lIIIIIIIlll[1]] = lIIIIIIIlll[17];
            if (llIllIllIIIlI(Bank.contains(iArr5) ? 1 : 0)) {
            }
            bu.add(new C0003d(lIIIIIIIlll[17], lIIIIIIIlll[11], lIIIIIIIlll[83]));
            "".length();
            iArr6 = new int[lIIIIIIIlll[0]];
            iArr6[lIIIIIIIlll[1]] = lIIIIIIIlll[13];
            if (llIllIllIIIlI(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bu.add(new C0003d(lIIIIIIIlll[13], lIIIIIIIlll[54], lIIIIIIIlll[84]));
            "".length();
        }
        bu.add(new C0003d(lIIIIIIIlll[9], lIIIIIIIlll[8], lIIIIIIIlll[18]));
        "".length();
        iArr = new int[lIIIIIIIlll[0]];
        iArr[lIIIIIIIlll[1]] = lIIIIIIIlll[7];
        if (llIllIllIIIlI(Bank.contains(iArr) ? 1 : 0)) {
        }
        bu.add(new C0003d(lIIIIIIIlll[7], lIIIIIIIlll[8], lIIIIIIIlll[18]));
        "".length();
        iArr2 = new int[lIIIIIIIlll[0]];
        iArr2[lIIIIIIIlll[1]] = lIIIIIIIlll[10];
        if (llIllIllIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bu.add(new C0003d(lIIIIIIIlll[10], lIIIIIIIlll[8], lIIIIIIIlll[18]));
        "".length();
        iArr3 = new int[lIIIIIIIlll[0]];
        iArr3[lIIIIIIIlll[1]] = lIIIIIIIlll[15];
        if (llIllIllIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bu.add(new C0003d(lIIIIIIIlll[15], lIIIIIIIlll[33], lIIIIIIIlll[80]));
        "".length();
        if (llIllIllIIlII(Bank.contains(item2222 -> {
            return item2222.getName().toLowerCase().contains(lIIIIIIIlIl[lIIIIIIIlll[87]]);
        }) ? 1 : 0)) {
        }
        iArr4 = new int[lIIIIIIIlll[0]];
        iArr4[lIIIIIIIlll[1]] = lIIIIIIIlll[14];
        if (llIllIllIIIlI(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bu.add(new C0003d(lIIIIIIIlll[14], lIIIIIIIlll[6], C0008i.bp));
        "".length();
        iArr5 = new int[lIIIIIIIlll[0]];
        iArr5[lIIIIIIIlll[1]] = lIIIIIIIlll[17];
        if (llIllIllIIIlI(Bank.contains(iArr5) ? 1 : 0)) {
        }
        bu.add(new C0003d(lIIIIIIIlll[17], lIIIIIIIlll[11], lIIIIIIIlll[83]));
        "".length();
        iArr6 = new int[lIIIIIIIlll[0]];
        iArr6[lIIIIIIIlll[1]] = lIIIIIIIlll[13];
        if (llIllIllIIIlI(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bu.add(new C0003d(lIIIIIIIlll[13], lIIIIIIIlll[54], lIIIIIIIlll[84]));
        "".length();
    }

    private static boolean llIllIllIIlll(int i) {
        return i > 0;
    }

    private static String llIllIlIlIIIl(String lllllllllllllllllIlIIIIIIIlIIIIl, String lllllllllllllllllIlIIIIIIIlIIIII) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIIIIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIIIIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIIIIIIIlIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIIIIIIIlIIIll.init(lIIIIIIIlll[5], lllllllllllllllllIlIIIIIIIlIIlII);
            return new String(lllllllllllllllllIlIIIIIIIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIIIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIIIIIIlIIIlI) {
            lllllllllllllllllIlIIIIIIIlIIIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:249:0x0ec2, code lost:
        if (llIllIllIlIII(net.unethicalite.api.entities.Players.getLocal().getWorldLocation().distanceTo(r0), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0014o.lIIIIIIIlll[70]) != false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b6, code lost:
        if (llIllIllIIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0014o.lIIIIIIIlll[8]) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01f9, code lost:
        if (llIllIllIIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0014o.lIIIIIIIlll[8]) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x023c, code lost:
        if (llIllIllIIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0014o.lIIIIIIIlll[8]) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x023f, code lost:
        ae();
        java.lang.System.out.println(e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0014o.lIIIIIIIlIl[e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0014o.lIIIIIIIlll[11]]);
        e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0014o.bs = e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0014o.lIIIIIIIlll[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x025a, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0fba  */
    /* JADX WARN: Type inference failed for: r0v150, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v155, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v577, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v592, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v623, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aD() {
        if (llIllIllIIIlI(bs ? 1 : 0)) {
            C0001b.a(bu);
            if (llIllIllIIIll(bu.size(), lIIIIIIIlll[0])) {
                System.out.println(lIIIIIIIlIl[lIIIIIIIlll[1]]);
                bs = lIIIIIIIlll[1];
            }
        }
        if (llIllIllIIlII(bs ? 1 : 0)) {
            if (llIllIllIIIll(Skills.getLevel(Skill.PRAYER), lIIIIIIIlll[2])) {
                aa.eA();
            }
            if (llIllIllIIlIl(Skills.getLevel(Skill.PRAYER), lIIIIIIIlll[2]) && llIllIllIIIll(Skills.getLevel(Skill.MAGIC), lIIIIIIIlll[3])) {
                C0010k.X();
            }
            if (llIllIllIIlII(aa() ? 1 : 0) && llIllIllIIIll(C0004e.j(cw), lIIIIIIIlll[0]) && llIllIllIIlIl(Skills.getLevel(Skill.PRAYER), lIIIIIIIlll[2]) && llIllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIIIIIIlll[3])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIllIllIIllI(nearest) && llIllIllIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[0]];
                    C0000a.a(nearest);
                }
                if (llIllIllIIllI(nearest) && llIllIllIIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIllIllIIlII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIIIIlll[4]);
                        "".length();
                    }
                    if (llIllIllIIIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[5]];
                        if (llIllIllIIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIIIIIlll[6]);
                            "".length();
                        }
                        if (llIllIllIIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIIIIIlll[5]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIIIIIlll[0]];
                        iArr[lIIIIIIIlll[1]] = lIIIIIIIlll[7];
                        if (llIllIllIIIlI(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIIIIIIIlll[0]];
                            iArr2[lIIIIIIIlll[1]] = lIIIIIIIlll[7];
                        }
                        int[] iArr3 = new int[lIIIIIIIlll[0]];
                        iArr3[lIIIIIIIlll[1]] = lIIIIIIIlll[9];
                        if (llIllIllIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIIIIIIlll[0]];
                            iArr4[lIIIIIIIlll[1]] = lIIIIIIIlll[9];
                        }
                        int[] iArr5 = new int[lIIIIIIIlll[0]];
                        iArr5[lIIIIIIIlll[1]] = lIIIIIIIlll[10];
                        if (llIllIllIIIlI(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIIIIIIIlll[0]];
                            iArr6[lIIIIIIIlll[1]] = lIIIIIIIlll[10];
                        }
                        int[] iArr7 = new int[lIIIIIIIlll[12]];
                        iArr7[lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                        iArr7[lIIIIIIIlll[0]] = lIIIIIIIlll[7];
                        iArr7[lIIIIIIIlll[5]] = lIIIIIIIlll[10];
                        iArr7[lIIIIIIIlll[11]] = lIIIIIIIlll[14];
                        iArr7[lIIIIIIIlll[6]] = lIIIIIIIlll[15];
                        iArr7[lIIIIIIIlll[16]] = lIIIIIIIlll[17];
                        if (llIllIllIIlII(C0004e.b(iArr7) ? 1 : 0)) {
                            ae();
                            System.out.println(lIIIIIIIlIl[lIIIIIIIlll[6]]);
                            bs = lIIIIIIIlll[0];
                            return;
                        }
                        int[] iArr8 = new int[lIIIIIIIlll[12]];
                        iArr8[lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                        iArr8[lIIIIIIIlll[0]] = lIIIIIIIlll[7];
                        iArr8[lIIIIIIIlll[5]] = lIIIIIIIlll[10];
                        iArr8[lIIIIIIIlll[11]] = lIIIIIIIlll[14];
                        iArr8[lIIIIIIIlll[6]] = lIIIIIIIlll[15];
                        iArr8[lIIIIIIIlll[16]] = lIIIIIIIlll[17];
                        if (llIllIllIIIlI(C0004e.b(iArr8) ? 1 : 0)) {
                            while (llIllIllIIlII(C0019t.bl() ? 1 : 0)) {
                                C0019t.bj();
                                Time.sleepTicks(lIIIIIIIlll[0]);
                                "".length();
                                "".length();
                                if (0 != 0) {
                                    return;
                                }
                            }
                            if (llIllIllIIlII(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepTicks(lIIIIIIIlll[12]);
                                "".length();
                            }
                            C0000a.a(lIIIIIIIlll[13], lIIIIIIIlll[18]);
                            C0000a.a(lIIIIIIIlll[14], lIIIIIIIlll[11]);
                            C0000a.a(lIIIIIIIlll[7], lIIIIIIIlll[8]);
                            C0000a.a(lIIIIIIIlll[10], lIIIIIIIlll[8]);
                            C0000a.a(lIIIIIIIlll[17], lIIIIIIIlll[11]);
                            C0000a.a(lIIIIIIIlll[15], lIIIIIIIlll[18]);
                            C0000a.a(lIIIIIIIlll[19], lIIIIIIIlll[4]);
                        }
                    }
                }
            }
            if (llIllIllIIIlI(Inventory.contains(C0005f.aU) ? 1 : 0) && llIllIllIIIll(Movement.getRunEnergy(), lIIIIIIIlll[20])) {
                Inventory.getFirst(C0005f.aU).interact(lIIIIIIIlIl[lIIIIIIIlll[16]]);
                Time.sleepTicks(lIIIIIIIlll[0]);
                "".length();
            }
            if (llIllIllIIIll(Prayers.getPoints(), lIIIIIIIlll[21]) && llIllIllIIIlI(Inventory.contains(C0005f.aR) ? 1 : 0)) {
                Inventory.getFirst(C0005f.aR).interact(lIIIIIIIlIl[lIIIIIIIlll[12]]);
            }
            if (llIllIllIIIlI(aa() ? 1 : 0) && llIllIllIIlII(C0004e.j(cw))) {
                if (llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cn), lIIIIIIIlll[16])) {
                    AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[22]];
                    if (llIllIllIIIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(cn);
                    "".length();
                    Time.sleepTicks(lIIIIIIIlll[0]);
                    "".length();
                }
                if (llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cn), lIIIIIIIlll[16])) {
                    C0006g.a(lIIIIIIIlIl[lIIIIIIIlll[23]], bQ);
                }
            }
            if (llIllIllIlIlI(C0004e.j(cw), lIIIIIIIlll[0])) {
                if (llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(co), lIIIIIIIlll[6]) && llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cp), lIIIIIIIlll[6])) {
                    AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[24]];
                    Movement.walkTo(co);
                    "".length();
                    Time.sleepTicks(lIIIIIIIlll[0]);
                    "".length();
                }
                if (llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(co), lIIIIIIIlll[12])) {
                    AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[18]];
                    String[] strArr = new String[lIIIIIIIlll[0]];
                    strArr[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[25]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    String[] strArr2 = new String[lIIIIIIIlll[0]];
                    strArr2[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[26]];
                    if (llIllIllIIIlI(nearest2.hasAction(strArr2) ? 1 : 0)) {
                        String[] strArr3 = new String[lIIIIIIIlll[0]];
                        strArr3[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[3]];
                        if (llIllIllIIlII(Reachable.isInteractable(TileObjects.getNearest(strArr3)) ? 1 : 0)) {
                            String[] strArr4 = new String[lIIIIIIIlll[0]];
                            strArr4[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[27]];
                            TileObjects.getNearest(strArr4).interact(lIIIIIIIlIl[lIIIIIIIlll[28]]);
                            Time.sleepTicks(lIIIIIIIlll[6]);
                            "".length();
                        }
                    }
                    String[] strArr5 = new String[lIIIIIIIlll[0]];
                    strArr5[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[29]];
                    if (llIllIllIIIlI(Reachable.isInteractable(TileObjects.getNearest(strArr5)) ? 1 : 0)) {
                        String[] strArr6 = new String[lIIIIIIIlll[0]];
                        strArr6[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[30]];
                        TileObject nearest3 = TileObjects.getNearest(strArr6);
                        String[] strArr7 = new String[lIIIIIIIlll[0]];
                        strArr7[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[31]];
                        if (llIllIllIIIlI(nearest3.hasAction(strArr7) ? 1 : 0)) {
                            String[] strArr8 = new String[lIIIIIIIlll[0]];
                            strArr8[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[32]];
                            TileObjects.getNearest(strArr8).interact(lIIIIIIIlIl[lIIIIIIIlll[33]]);
                            Time.sleepTicks(lIIIIIIIlll[5]);
                            "".length();
                        }
                        String[] strArr9 = new String[lIIIIIIIlll[0]];
                        strArr9[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[34]];
                        TileObject nearest4 = TileObjects.getNearest(strArr9);
                        String[] strArr10 = new String[lIIIIIIIlll[0]];
                        strArr10[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[35]];
                        if (llIllIllIIIlI(nearest4.hasAction(strArr10) ? 1 : 0)) {
                            String[] strArr11 = new String[lIIIIIIIlll[0]];
                            strArr11[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[36]];
                            TileObjects.getNearest(strArr11).interact(lIIIIIIIlIl[lIIIIIIIlll[37]]);
                            Time.sleepTicks(lIIIIIIIlll[5]);
                            "".length();
                        }
                    }
                }
            }
            if (llIllIllIlIlI(C0004e.j(cw), lIIIIIIIlll[5])) {
                int[] iArr9 = new int[lIIIIIIIlll[0]];
                iArr9[lIIIIIIIlll[1]] = lIIIIIIIlll[38];
                if (llIllIllIIIlI(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIIIIIlll[0]];
                    iArr10[lIIIIIIIlll[1]] = lIIIIIIIlll[38];
                    Inventory.getFirst(iArr10).interact(lIIIIIIIlIl[lIIIIIIIlll[21]]);
                }
                int[] iArr11 = new int[lIIIIIIIlll[0]];
                iArr11[lIIIIIIIlll[1]] = lIIIIIIIlll[39];
                if (llIllIllIIIlI(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lIIIIIIIlll[0]];
                    iArr12[lIIIIIIIlll[1]] = lIIIIIIIlll[39];
                    Inventory.getFirst(iArr12).interact(lIIIIIIIlIl[lIIIIIIIlll[40]]);
                }
                if (llIllIllIIlII(cx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cq), lIIIIIIIlll[6])) {
                        AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[41]];
                        Movement.walkTo(cq);
                        "".length();
                        Time.sleepTicks(lIIIIIIIlll[0]);
                        "".length();
                    }
                    if (llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cq), lIIIIIIIlll[6]) && llIllIllIIlII(Players.getLocal().isMoving() ? 1 : 0) && llIllIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr12 = new String[lIIIIIIIlll[0]];
                        strArr12[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[42]];
                        TileObjects.getNearest(strArr12).interact(lIIIIIIIlIl[lIIIIIIIlll[43]]);
                        Time.sleepTicks(lIIIIIIIlll[5]);
                        "".length();
                    }
                }
                if (llIllIllIIIlI(cx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIIIIIlll[6])) {
                        AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[44]];
                        Movement.walkTo(cr);
                        "".length();
                        Time.sleepTicks(lIIIIIIIlll[0]);
                        "".length();
                    }
                    if (llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIIIIIlll[6]) && llIllIllIIlII(Players.getLocal().isMoving() ? 1 : 0)) {
                        C0006g.a(lIIIIIIIlIl[lIIIIIIIlll[45]], bQ);
                    }
                }
            }
            if (llIllIllIlIlI(C0004e.j(cw), lIIIIIIIlll[11])) {
                String[] strArr13 = new String[lIIIIIIIlll[0]];
                strArr13[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[46]];
                if (llIllIllIIlII(Inventory.contains(strArr13) ? 1 : 0)) {
                    if (llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cu), lIIIIIIIlll[16])) {
                        AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[47]];
                        Movement.walkTo(cu);
                        "".length();
                        Time.sleepTicks(lIIIIIIIlll[0]);
                        "".length();
                    }
                    if (llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cu), lIIIIIIIlll[16])) {
                        C0006g.a(lIIIIIIIlIl[lIIIIIIIlll[48]], bQ);
                    }
                }
                String[] strArr14 = new String[lIIIIIIIlll[0]];
                strArr14[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[49]];
                if (llIllIllIIIlI(Inventory.contains(strArr14) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[50]];
                    if (llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIIIIIlll[16])) {
                        AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[51]];
                        Movement.walkTo(cr);
                        "".length();
                        Time.sleepTicks(lIIIIIIIlll[0]);
                        "".length();
                    }
                    if (llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIIIIIlll[16])) {
                        C0006g.a(lIIIIIIIlIl[lIIIIIIIlll[52]], bQ);
                    }
                }
            }
            if (llIllIllIlIlI(C0004e.j(cw), lIIIIIIIlll[16])) {
                if (llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cv), lIIIIIIIlll[11])) {
                    AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[53]];
                    Movement.walkTo(cv);
                    "".length();
                    Time.sleepTicks(lIIIIIIIlll[0]);
                    "".length();
                }
                if (llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cv), lIIIIIIIlll[11]) && llIllIllIIlII(Players.getLocal().isMoving() ? 1 : 0) && llIllIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr15 = new String[lIIIIIIIlll[0]];
                    strArr15[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[54]];
                    Inventory.getFirst(strArr15).useOn(TileObjects.getNearest(tileObject -> {
                        if (llIllIllIIIlI(tileObject.getName().contains(lIIIIIIIlIl[lIIIIIIIlll[90]]) ? 1 : 0) && llIllIllIlIIl(tileObject.getWorldLocation().distanceTo(cv), lIIIIIIIlll[11])) {
                            ?? r0 = lIIIIIIIlll[0];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIIIIIlll[1];
                    }));
                    Time.sleepTicks(lIIIIIIIlll[5]);
                    "".length();
                }
            }
            if (llIllIllIlIlI(C0004e.j(cw), lIIIIIIIlll[12])) {
                if (llIllIllIIlII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                if (llIllIllIIlII(C0010k.ac() ? 1 : 0)) {
                    C0010k.ad();
                }
                if (llIllIllIlIll(Players.getLocal().getInteracting())) {
                    String[] strArr16 = new String[lIIIIIIIlll[0]];
                    strArr16[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[55]];
                    if (llIllIllIIllI(NPCs.getNearest(strArr16))) {
                        String[] strArr17 = new String[lIIIIIIIlll[0]];
                        strArr17[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[56]];
                        NPCs.getNearest(strArr17).interact(lIIIIIIIlIl[lIIIIIIIlll[57]]);
                        Time.sleepTicks(lIIIIIIIlll[5]);
                        "".length();
                    }
                }
            }
            if (llIllIllIlIlI(C0004e.j(cw), lIIIIIIIlll[23]) && llIllIllIlIll(Players.getLocal().getInteracting())) {
                C0006g.a(lIIIIIIIlIl[lIIIIIIIlll[58]], bQ);
            }
            if (llIllIllIlIlI(C0004e.j(cw), lIIIIIIIlll[24])) {
                if (llIllIllIIlII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                if (llIllIllIIlII(C0010k.ac() ? 1 : 0)) {
                    C0010k.ad();
                }
                String[] strArr18 = new String[lIIIIIIIlll[0]];
                strArr18[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[2]];
                if (llIllIllIIllI(NPCs.getNearest(strArr18))) {
                    String[] strArr19 = new String[lIIIIIIIlll[0]];
                    strArr19[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[59]];
                    if (llIllIllIlIIl(NPCs.getNearest(strArr19).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIIlll[16])) {
                        C0006g.a(lIIIIIIIlIl[lIIIIIIIlll[60]], bQ);
                    }
                }
                if (llIllIllIlIll(Players.getLocal().getInteracting())) {
                    String[] strArr20 = new String[lIIIIIIIlll[0]];
                    strArr20[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[61]];
                    if (llIllIllIIllI(NPCs.getNearest(strArr20))) {
                        String[] strArr21 = new String[lIIIIIIIlll[0]];
                        strArr21[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[62]];
                        NPCs.getNearest(strArr21).interact(lIIIIIIIlIl[lIIIIIIIlll[20]]);
                        Time.sleepTicks(lIIIIIIIlll[5]);
                        "".length();
                    }
                }
            }
            if (llIllIllIlIlI(C0004e.j(cw), lIIIIIIIlll[18])) {
                if (llIllIllIIlII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                if (llIllIllIIlII(C0010k.ac() ? 1 : 0)) {
                    C0010k.ad();
                }
                if (llIllIllIlIll(Players.getLocal().getInteracting())) {
                    String[] strArr22 = new String[lIIIIIIIlll[0]];
                    strArr22[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[63]];
                    if (llIllIllIIllI(NPCs.getNearest(strArr22))) {
                        String[] strArr23 = new String[lIIIIIIIlll[0]];
                        strArr23[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[64]];
                        NPCs.getNearest(strArr23).interact(lIIIIIIIlIl[lIIIIIIIlll[65]]);
                        Time.sleepTicks(lIIIIIIIlll[5]);
                        "".length();
                    }
                }
            }
            if (!llIllIllIllII(C0004e.j(cw), lIIIIIIIlll[25]) || llIllIllIlIlI(C0004e.j(cw), lIIIIIIIlll[26])) {
                String[] strArr24 = new String[lIIIIIIIlll[0]];
                strArr24[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[66]];
                if (llIllIllIIllI(NPCs.getNearest(strArr24))) {
                    int[] iArr13 = new int[lIIIIIIIlll[0]];
                    iArr13[lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                    Inventory.getFirst(iArr13).interact(lIIIIIIIlIl[lIIIIIIIlll[67]]);
                    Time.sleepTicks(lIIIIIIIlll[16]);
                    "".length();
                }
                WorldPoint worldPoint = new WorldPoint(lIIIIIIIlll[68], lIIIIIIIlll[69], lIIIIIIIlll[1]);
                if (llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(C0001b.I), lIIIIIIIlll[70]) && llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIIIIIlll[6])) {
                    AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[71]];
                    Movement.walkTo(worldPoint);
                    "".length();
                    Time.sleepTicks(lIIIIIIIlll[0]);
                    "".length();
                }
                if (!llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIIIIIlll[6]) || llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIIIIIlll[54])) {
                    if (llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cn), lIIIIIIIlll[16])) {
                        String[] strArr25 = new String[lIIIIIIIlll[0]];
                        strArr25[lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[72]];
                        if (llIllIllIlIll(NPCs.getNearest(strArr25))) {
                        }
                    }
                    if (llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cn), lIIIIIIIlll[16])) {
                        C0006g.a(lIIIIIIIlIl[lIIIIIIIlll[79]], bQ);
                    }
                }
                WorldArea worldArea = new WorldArea(lIIIIIIIlll[73], lIIIIIIIlll[74], lIIIIIIIlll[43], lIIIIIIIlll[37], lIIIIIIIlll[1]);
                if (llIllIllIIIll(C0004e.j(lIIIIIIIlll[75]), lIIIIIIIlll[24]) && llIllIllIIIlI(Equipment.contains(item -> {
                    return item.getName().contains(lIIIIIIIlIl[lIIIIIIIlll[89]]);
                }) ? 1 : 0)) {
                    Equipment.getFirst(item2 -> {
                        return item2.getName().contains(lIIIIIIIlIl[lIIIIIIIlll[88]]);
                    }).interact(lIIIIIIIlIl[lIIIIIIIlll[76]]);
                    Time.sleepTicks(lIIIIIIIlll[12]);
                    "".length();
                }
                if (llIllIllIIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(new WorldPoint(lIIIIIIIlll[77], lIIIIIIIlll[78], lIIIIIIIlll[1]));
                    "".length();
                    Time.sleepTicks(lIIIIIIIlll[0]);
                    "".length();
                }
                if (llIllIllIIlII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(cn);
                    "".length();
                    Time.sleepTicks(lIIIIIIIlll[0]);
                    "".length();
                }
                if (llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cn), lIIIIIIIlll[16])) {
                }
            }
            if (llIllIllIIlll(C0004e.j(cw)) && llIllIllIIIll(C0004e.j(cw), lIIIIIIIlll[27])) {
                cl = lIIIIIIIlll[0];
                ck = lIIIIIIIlll[1];
            }
            if (llIllIllIlIlI(C0004e.j(cw), lIIIIIIIlll[27]) && llIllIllIIIll(ck, lIIIIIIIlll[0]) && llIllIllIIIlI(cl ? 1 : 0)) {
                ac.kg += lIIIIIIIlll[0];
                ac.d(AccBuilderTempleTrek.m);
                ck += lIIIIIIIlll[0];
                ac.kg = lIIIIIIIlll[1];
                cl = lIIIIIIIlll[1];
            }
            C0006g.a(bQ);
        }
    }

    private static boolean llIllIllIIlIl(int i, int i2) {
        return i >= i2;
    }

    private static void llIllIllIIIII() {
        lIIIIIIIlIl = new String[lIIIIIIIlll[112]];
        lIIIIIIIlIl[lIIIIIIIlll[1]] = llIllIlIlIIII("IgMZEB0MDxNZDBETHhcJRAMDHAMXRlcKGQ0eFBEHCg1XGw8HAVcNAUQbAhwdEA==", "djwyn");
        lIIIIIIIlIl[lIIIIIIIlll[0]] = llIllIlIlIIIl("M59pXDOlPV06uWciD2G7bw==", "hBTjd");
        lIIIIIIIlIl[lIIIIIIIlll[5]] = llIllIlIlIIIl("ZRTIIbY/1/hJSLKwz32l67p0sU7PAsdC", "haJCV");
        lIIIIIIIlIl[lIIIIIIIlll[11]] = llIllIlIlIIIl("rPWSSM2DIlB1Oocoy/+pjbZiyJsMi1p0HeiNImeA8d8vyLOenaFVQrMzLDFnYofK", "YNlKb");
        lIIIIIIIlIl[lIIIIIIIlll[6]] = llIllIlIlIIlI("xWQK3hIMkcqGyCFnBq3E/XEW9bgPMNEMWfa+NQ2KivzkMLjIDMSTRijBCIeqIva+Vixs6CG6OEA=", "sKwSG");
        lIIIIIIIlIl[lIIIIIIIlll[16]] = llIllIlIlIIlI("MfWh/mI4X7s=", "EBvIh");
        lIIIIIIIlIl[lIIIIIIIlll[12]] = llIllIlIlIIlI("IfVTGCQS4pE=", "CSVXN");
        lIIIIIIIlIl[lIIIIIIIlll[22]] = llIllIlIlIIII("LTUMYyAMdAk3NREg", "cTzCT");
        lIIIIIIIlIl[lIIIIIIIlll[23]] = llIllIlIlIIIl("Czky6Pj0MyPEYpw3NlsBtg==", "EZgok");
        lIIIIIIIlIl[lIIIIIIIlll[24]] = llIllIlIlIIIl("Wcnf9oB03xH8q8Y4Bb0hSA==", "mnXQm");
        lIIIIIIIlIl[lIIIIIIIlll[18]] = llIllIlIlIIII("ASIRPhgoIEUrAysoEDg=", "FGeJq");
        lIIIIIIIlIl[lIIIIIIIlll[25]] = llIllIlIlIIIl("L2518/puTfk=", "dEVNy");
        lIIIIIIIlIl[lIIIIIIIlll[26]] = llIllIlIlIIII("AyAWLA==", "LPsBG");
        lIIIIIIIlIl[lIIIIIIIlll[3]] = llIllIlIlIIlI("xvVipQbjDEg=", "LnBTV");
        lIIIIIIIlIl[lIIIIIIIlll[27]] = llIllIlIlIIlI("en69KPRw1b0=", "maGEO");
        lIIIIIIIlIl[lIIIIIIIlll[28]] = llIllIlIlIIIl("T4EawHzPbaQ=", "CUryq");
        lIIIIIIIlIl[lIIIIIIIlll[29]] = llIllIlIlIIII("LRwDGjY=", "ntfiB");
        lIIIIIIIlIl[lIIIIIIIlll[30]] = llIllIlIlIIlI("suVRoLITQDA=", "ndFGs");
        lIIIIIIIlIl[lIIIIIIIlll[31]] = llIllIlIlIIlI("TVggTMf/Dxs=", "pYVsR");
        lIIIIIIIlIl[lIIIIIIIlll[32]] = llIllIlIlIIII("FDgJNCI=", "WPlGV");
        lIIIIIIIlIl[lIIIIIIIlll[33]] = llIllIlIlIIII("OhsyBQ==", "ukWkB");
        lIIIIIIIlIl[lIIIIIIIlll[34]] = llIllIlIlIIlI("UqGoCNlPB/g=", "pdIgV");
        lIIIIIIIlIl[lIIIIIIIlll[35]] = llIllIlIlIIII("HCI0Hggn", "OGUlk");
        lIIIIIIIlIl[lIIIIIIIlll[36]] = llIllIlIlIIlI("dx5qQyt3xFs=", "LZzqj");
        lIIIIIIIlIl[lIIIIIIIlll[37]] = llIllIlIlIIII("NAgRESIP", "gmpcA");
        lIIIIIIIlIl[lIIIIIIIlll[21]] = llIllIlIlIIIl("HnXMBXOPka8=", "EYuNc");
        lIIIIIIIlIl[lIIIIIIIlll[40]] = llIllIlIlIIII("BDwwNQ==", "SYQGZ");
        lIIIIIIIlIl[lIIIIIIIlll[41]] = llIllIlIlIIIl("c/DQqwiWf7An73W3VPJutg==", "eyKye");
        lIIIIIIIlIl[lIIIIIIIlll[42]] = llIllIlIlIIIl("x2xRjJtCkjY=", "gYGCo");
        lIIIIIIIlIl[lIIIIIIIlll[43]] = llIllIlIlIIII("ITUgOg==", "nEETZ");
        lIIIIIIIlIl[lIIIIIIIlll[44]] = llIllIlIlIIII("FyIfbDU2Yw45ICsn", "YCiLA");
        lIIIIIIIlIl[lIIIIIIIlll[45]] = llIllIlIlIIIl("/ktV2rd4f/BNBCUAxGnJ7A==", "NarqQ");
        lIIIIIIIlIl[lIIIIIIIlll[46]] = llIllIlIlIIlI("qQRt53CDxqJnHYP0ZLpwyg==", "bCThi");
        lIIIIIIIlIl[lIIIIIIIlll[47]] = llIllIlIlIIlI("7vH+shSjLXKBHMduJVW7vA==", "prDRz");
        lIIIIIIIlIl[lIIIIIIIlll[48]] = llIllIlIlIIlI("AmrlhS5/ux2I3T8W2ioIjQ==", "lIcoy");
        lIIIIIIIlIl[lIIIIIIIlll[49]] = llIllIlIlIIII("JS8QDRxOJQMEAg==", "nGqau");
        lIIIIIIIlIl[lIIIIIIIlll[50]] = llIllIlIlIIlI("JyIqzKWr8U4K+C2cbUhK+Q==", "hxAuL");
        lIIIIIIIlIl[lIIIIIIIlll[51]] = llIllIlIlIIIl("olBzUZVS5XaiJbG7JRwg6Q==", "CYIeJ");
        lIIIIIIIlIl[lIIIIIIIlll[52]] = llIllIlIlIIIl("2bUPABX1R48zlo5KPy1Uqw==", "yoXnN");
        lIIIIIIIlIl[lIIIIIIIlll[53]] = llIllIlIlIIIl("2ME3uGB5eAM7qpCtpnUptA==", "durBf");
        lIIIIIIIlIl[lIIIIIIIlll[54]] = llIllIlIlIIII("PgQMPBEHCE0lFRkATS0VDB8=", "ulmFp");
        lIIIIIIIlIl[lIIIIIIIlll[55]] = llIllIlIlIIlI("Yep2RH7T+fA3x3SDoLPbAg==", "xLvTH");
        lIIIIIIIlIl[lIIIIIIIlll[56]] = llIllIlIlIIlI("W+8e0x63rm1QaP6Vc9tsYQ==", "IpVHA");
        lIIIIIIIlIl[lIIIIIIIlll[57]] = llIllIlIlIIIl("Tl25rh2Eoc0=", "PAwDJ");
        lIIIIIIIlIl[lIIIIIIIlll[58]] = llIllIlIlIIlI("NXWrWXydvkXOVaEU0dCPDw==", "kmseD");
        lIIIIIIIlIl[lIIIIIIIlll[2]] = llIllIlIlIIII("DSEnJAokIA==", "EDICx");
        lIIIIIIIlIl[lIIIIIIIlll[59]] = llIllIlIlIIlI("6Q2Hhrain2I=", "WCYEx");
        lIIIIIIIlIl[lIIIIIIIlll[60]] = llIllIlIlIIIl("ec+IMqh5hVk=", "xfMFR");
        lIIIIIIIlIl[lIIIIIIIlll[61]] = llIllIlIlIIIl("gKpoPT8fxqD2nq7Nbyh4zCPChoa8MBTR", "aQfNZ");
        lIIIIIIIlIl[lIIIIIIIlll[62]] = llIllIlIlIIII("OD0KHAgBMUs1ChwnGw8GHQ==", "sUkfi");
        lIIIIIIIlIl[lIIIIIIIlll[20]] = llIllIlIlIIII("OR48BgUT", "xjHgf");
        lIIIIIIIlIl[lIIIIIIIlll[63]] = llIllIlIlIIII("Jz00KwwAIA==", "eRAEo");
        lIIIIIIIlIl[lIIIIIIIlll[64]] = llIllIlIlIIIl("gno5ARA66v8=", "KWsQS");
        lIIIIIIIlIl[lIIIIIIIlll[65]] = llIllIlIlIIIl("8zwsMOJC0Mk=", "yxogV");
        lIIIIIIIlIl[lIIIIIIIlll[66]] = llIllIlIlIIII("KyIkEiQNK2o8Pg09KwUy", "lGJwV");
        lIIIIIIIlIl[lIIIIIIIlll[67]] = llIllIlIlIIII("IxAhFjw=", "abDwW");
        lIIIIIIIlIl[lIIIIIIIlll[71]] = llIllIlIlIIlI("2x4LkVMtg8EH8O/sNVfezg==", "BkumU");
        lIIIIIIIlIl[lIIIIIIIlll[72]] = llIllIlIlIIII("Ig8kDgIEBmogGAQQKxkU", "ejJkp");
        lIIIIIIIlIl[lIIIIIIIlll[76]] = llIllIlIlIIIl("nV9l5Wwdp/4IjNMV32G8Ww==", "kssuj");
        lIIIIIIIlIl[lIIIIIIIlll[79]] = llIllIlIlIIlI("gNVpnuuFnbll2BBqeeSyag==", "uRAoY");
        lIIIIIIIlIl[lIIIIIIIlll[86]] = llIllIlIlIIIl("Zc+UbbhMCUwB5h1qiVvzxQ==", "uDZYC");
        lIIIIIIIlIl[lIIIIIIIlll[87]] = llIllIlIlIIlI("VkaaZwkK4/DUbSGIW78ba2e0Ng0DnxHH", "bYlDF");
        lIIIIIIIlIl[lIIIIIIIlll[88]] = llIllIlIlIIlI("RfTjw4b8leI=", "kmCiY");
        lIIIIIIIlIl[lIIIIIIIlll[89]] = llIllIlIlIIlI("3A/JypwGpAk=", "srxYW");
        lIIIIIIIlIl[lIIIIIIIlll[90]] = llIllIlIlIIII("GwUQPiQlVz4sPy4=", "KwyMK");
        lIIIIIIIlIl[lIIIIIIIlll[109]] = llIllIlIlIIIl("t5W43D/NeCtk/E9eKbTpCw==", "nSYUN");
        lIIIIIIIlIl[lIIIIIIIlll[110]] = llIllIlIlIIIl("bTzRZDST7nzWyq3UgEuiDHvrJKhosiKUEHFT/CPmVN8=", "jWczI");
        lIIIIIIIlIl[lIIIIIIIlll[111]] = llIllIlIlIIlI("W78sFSH9ryk=", "aPPfo");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (!llIllIllIllIl(Quests.getState(Quest.FIGHT_ARENA), QuestState.FINISHED) || llIllIllIIlIl(C0004e.j(cw), lIIIIIIIlll[27])) {
            ?? r0 = lIIIIIIIlll[0];
            "".length();
            return (-"  ".length()) > 0 ? ((55 ^ 106) ^ (72 ^ 65)) & (((40 ^ 92) ^ (185 ^ 153)) ^ (-" ".length())) : r0;
        }
        return lIIIIIIIlll[1];
    }
}
