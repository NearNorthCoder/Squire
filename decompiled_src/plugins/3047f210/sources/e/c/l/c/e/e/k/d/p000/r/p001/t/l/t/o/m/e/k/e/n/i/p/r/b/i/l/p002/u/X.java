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
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.X  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/X.class */
public class X implements S {
    public static final /* synthetic */ WorldPoint jf;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ List<C0003d> bu;
    public static final /* synthetic */ int jg;
    private static /* synthetic */ int[] lllIlIlIll;
    static /* synthetic */ String[] bQ;
    private static /* synthetic */ String[] lllIlIlIIl;

    private static String llIIIlIlllllI(String lllllllllllllllllIllIlIlllIlIIII, String lllllllllllllllllIllIlIlllIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIlIlllIIllll.getBytes(StandardCharsets.UTF_8)), lllIlIlIll[13]), "DES");
            Cipher lllllllllllllllllIllIlIlllIlIIlI = Cipher.getInstance("DES");
            lllllllllllllllllIllIlIlllIlIIlI.init(lllIlIlIll[2], secretKeySpec);
            return new String(lllllllllllllllllIllIlIlllIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIlIlllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIlIlllIlIIIl) {
            lllllllllllllllllIllIlIlllIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIllIlIlII(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIIllIlIIII(int i, int i2) {
        return i < i2;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lllIlIlIIl[lllIlIlIll[92]];
    }

    private static boolean llIIIllIIllll(int i) {
        return i != 0;
    }

    private static boolean llIIIllIlIllI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    static boolean dJ() {
        int[] iArr = new int[lllIlIlIll[1]];
        iArr[lllIlIlIll[0]] = lllIlIlIll[101];
        if (llIIIllIlIIlI(TileObjects.getNearest(iArr))) {
            ?? r0 = lllIlIlIll[1];
            "".length();
            return (99 ^ 103) == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIlIlIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lllIlIlIll[0];
    }

    static {
        llIIIllIIlllI();
        llIIIllIIllIl();
        jg = lllIlIlIll[31];
        jf = new WorldPoint(lllIlIlIll[138], lllIlIlIll[139], lllIlIlIll[0]);
        bu = new ArrayList();
        String[] strArr = new String[lllIlIlIll[2]];
        strArr[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[140]];
        strArr[lllIlIlIll[1]] = lllIlIlIIl[lllIlIlIll[141]];
        bQ = strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private static boolean dL() {
        if (llIIIllIllIII(Vars.getBit(lllIlIlIll[103]), lllIlIlIll[1])) {
            ?? r0 = lllIlIlIll[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIlIlIll[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0101, code lost:
        if (llIIIllIlIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.X.lllIlIlIll[121(0x79, float:1.7E-43)]) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x019c, code lost:
        if (llIIIllIlIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.X.lllIlIlIll[121(0x79, float:1.7E-43)]) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0225, code lost:
        if (llIIIllIlIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.X.lllIlIlIll[67]) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006f, code lost:
        if (llIIIllIlIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.X.lllIlIlIll[67]) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ae() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (llIIIllIlIIII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[16])) {
            int[] iArr5 = new int[lllIlIlIll[1]];
            iArr5[lllIlIlIll[0]] = lllIlIlIll[19];
            if (llIIIllIIllll(Bank.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lllIlIlIll[1]];
                iArr6[lllIlIlIll[0]] = lllIlIlIll[19];
                if (llIIIllIIllll(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr7 = new int[lllIlIlIll[1]];
                    iArr7[lllIlIlIll[0]] = lllIlIlIll[19];
                }
                iArr4 = new int[lllIlIlIll[1]];
                iArr4[lllIlIlIll[0]] = lllIlIlIll[17];
                if (llIIIllIIllll(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr8 = new int[lllIlIlIll[1]];
                    iArr8[lllIlIlIll[0]] = lllIlIlIll[17];
                    if (llIIIllIIllll(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[lllIlIlIll[1]];
                        iArr9[lllIlIlIll[0]] = lllIlIlIll[17];
                    }
                }
                bu.add(new C0003d(lllIlIlIll[17], lllIlIlIll[23], lllIlIlIll[67]));
                "".length();
            }
            bu.add(new C0003d(lllIlIlIll[19], lllIlIlIll[121], C0004e.c(lllIlIlIll[122], lllIlIlIll[123])));
            "".length();
            iArr4 = new int[lllIlIlIll[1]];
            iArr4[lllIlIlIll[0]] = lllIlIlIll[17];
            if (llIIIllIIllll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bu.add(new C0003d(lllIlIlIll[17], lllIlIlIll[23], lllIlIlIll[67]));
            "".length();
        }
        if (llIIIllIlIlII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[16])) {
            int[] iArr10 = new int[lllIlIlIll[1]];
            iArr10[lllIlIlIll[0]] = lllIlIlIll[21];
            if (llIIIllIIllll(Bank.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lllIlIlIll[1]];
                iArr11[lllIlIlIll[0]] = lllIlIlIll[21];
                if (llIIIllIIllll(Bank.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lllIlIlIll[1]];
                    iArr12[lllIlIlIll[0]] = lllIlIlIll[21];
                }
            }
            bu.add(new C0003d(lllIlIlIll[21], lllIlIlIll[124], lllIlIlIll[125]));
            "".length();
        }
        int[] iArr13 = new int[lllIlIlIll[1]];
        iArr13[lllIlIlIll[0]] = lllIlIlIll[14];
        if (llIIIllIIllll(Bank.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lllIlIlIll[1]];
            iArr14[lllIlIlIll[0]] = lllIlIlIll[14];
            if (llIIIllIIllll(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lllIlIlIll[1]];
                iArr15[lllIlIlIll[0]] = lllIlIlIll[14];
            }
            iArr = new int[lllIlIlIll[1]];
            iArr[lllIlIlIll[0]] = lllIlIlIll[12];
            if (llIIIllIlIIIl(Bank.contains(iArr) ? 1 : 0)) {
                bu.add(new C0003d(lllIlIlIll[12], lllIlIlIll[1], lllIlIlIll[128]));
                "".length();
            }
            iArr2 = new int[lllIlIlIll[1]];
            iArr2[lllIlIlIll[0]] = lllIlIlIll[10];
            if (llIIIllIlIIIl(Bank.contains(iArr2) ? 1 : 0)) {
                bu.add(new C0003d(lllIlIlIll[10], lllIlIlIll[1], lllIlIlIll[128]));
                "".length();
            }
            if (llIIIllIlIIIl(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lllIlIlIIl[lllIlIlIll[136]]);
            }) ? 1 : 0)) {
                bu.add(new C0003d(lllIlIlIll[28], lllIlIlIll[39], lllIlIlIll[129]));
                "".length();
            }
            if (llIIIllIlIIIl(Bank.contains(item2 -> {
                return item2.getName().toLowerCase().contains(lllIlIlIIl[lllIlIlIll[135]]);
            }) ? 1 : 0)) {
                bu.add(new C0003d(lllIlIlIll[130], lllIlIlIll[2], lllIlIlIll[26]));
                "".length();
            }
            iArr3 = new int[lllIlIlIll[1]];
            iArr3[lllIlIlIll[0]] = lllIlIlIll[131];
            if (llIIIllIlIIIl(Bank.contains(iArr3) ? 1 : 0)) {
                return;
            }
            bu.add(new C0003d(lllIlIlIll[131], lllIlIlIll[67], lllIlIlIll[132]));
            "".length();
            return;
        }
        bu.add(new C0003d(lllIlIlIll[14], lllIlIlIll[126], lllIlIlIll[127]));
        "".length();
        iArr = new int[lllIlIlIll[1]];
        iArr[lllIlIlIll[0]] = lllIlIlIll[12];
        if (llIIIllIlIIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lllIlIlIll[1]];
        iArr2[lllIlIlIll[0]] = lllIlIlIll[10];
        if (llIIIllIlIIIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
        if (llIIIllIlIIIl(Bank.contains(item3 -> {
            return item3.getName().toLowerCase().contains(lllIlIlIIl[lllIlIlIll[136]]);
        }) ? 1 : 0)) {
        }
        if (llIIIllIlIIIl(Bank.contains(item22 -> {
            return item22.getName().toLowerCase().contains(lllIlIlIIl[lllIlIlIll[135]]);
        }) ? 1 : 0)) {
        }
        iArr3 = new int[lllIlIlIll[1]];
        iArr3[lllIlIlIll[0]] = lllIlIlIll[131];
        if (llIIIllIlIIIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    private static boolean llIIIllIllIII(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIIllIlIIlI(Object obj) {
        return obj != null;
    }

    private static boolean llIIIllIlIlIl(int i, int i2) {
        return i > i2;
    }

    private static void llIIIllIIlllI() {
        lllIlIlIll = new int[143];
        lllIlIlIll[0] = (35 ^ 63) & ((179 ^ 175) ^ (-1));
        lllIlIlIll[1] = " ".length();
        lllIlIlIll[2] = "  ".length();
        lllIlIlIll[3] = "   ".length();
        lllIlIlIll[4] = (-((-3429) & 7663)) & (-2113) & 14846;
        lllIlIlIll[5] = 109 ^ 105;
        lllIlIlIll[6] = 67 ^ 70;
        lllIlIlIll[7] = (-24648) & 29647;
        lllIlIlIll[8] = (-((-26645) & 30812)) & (-9217) & 16383;
        lllIlIlIll[9] = 10 ^ 12;
        lllIlIlIll[10] = (-4129) & 12922;
        lllIlIlIll[11] = 10 ^ 13;
        lllIlIlIll[12] = (-16981) & 19327;
        lllIlIlIll[13] = 15 ^ 7;
        lllIlIlIll[14] = (-((-181) & 24757)) & (-33) & 32621;
        lllIlIlIll[15] = (32 ^ 64) ^ (209 ^ 184);
        lllIlIlIll[16] = (((118 + 130) - 196) + 115) ^ (((31 + 53) - (-58)) + 34);
        lllIlIlIll[17] = (-((-20867) & 32142)) & (-16641) & 32735;
        lllIlIlIll[18] = 56 ^ 50;
        lllIlIlIll[19] = (-((-8997) & 32557)) & (-8248) & 32767;
        lllIlIlIll[20] = (((104 + 37) - 16) + 20) ^ (((129 + 100) - 78) + 3);
        lllIlIlIll[21] = (-6178) & 14955;
        lllIlIlIll[22] = (143 ^ 170) ^ (105 ^ 64);
        lllIlIlIll[23] = (-7191) & 8190;
        lllIlIlIll[24] = (-((-301) & 20991)) & (-513) & 21502;
        lllIlIlIll[25] = (-(27 ^ 14)) & (-14337) & 15351;
        lllIlIlIll[26] = (-4674) & 29673;
        lllIlIlIll[27] = (51 ^ 125) ^ (87 ^ 5);
        lllIlIlIll[28] = (-5122) & 7673;
        lllIlIlIll[29] = 143 ^ 130;
        lllIlIlIll[30] = 36 ^ 42;
        lllIlIlIll[31] = (-16394) & 17131;
        lllIlIlIll[32] = (((124 + 34) - 44) + 87) ^ (((162 + 6) - 82) + 112);
        lllIlIlIll[33] = 212 ^ 196;
        lllIlIlIll[34] = 139 ^ 154;
        lllIlIlIll[35] = (-((-11278) & 27919)) & (-641) & 32759;
        lllIlIlIll[36] = (((108 + 2) - 70) + 92) ^ (((93 + 100) - 56) + 13);
        lllIlIlIll[37] = 129 ^ 146;
        lllIlIlIll[38] = (-24657) & 29181;
        lllIlIlIll[39] = (22 ^ 2) ^ ((108 ^ 125) & ((61 ^ 44) ^ (-1)));
        lllIlIlIll[40] = 96 ^ 117;
        lllIlIlIll[41] = (99 ^ 117) ^ ((22 ^ 64) & ((234 ^ 188) ^ (-1)));
        lllIlIlIll[42] = (-((-483) & 11251)) & (-3) & 15287;
        lllIlIlIll[43] = (((112 + 60) - 99) + 71) ^ (((14 + 39) - (-19)) + 64);
        lllIlIlIll[44] = (-((-4201) & 5757)) & (-4129) & 6142;
        lllIlIlIll[45] = (-19529) & 24028;
        lllIlIlIll[46] = 39 ^ 62;
        lllIlIlIll[47] = (-((-2691) & 28575)) & (-131) & 32766;
        lllIlIlIll[48] = (100 ^ 126) ^ ((209 ^ 192) & ((125 ^ 108) ^ (-1)));
        lllIlIlIll[49] = (172 ^ 192) ^ (6 ^ 113);
        lllIlIlIll[50] = (-16725) & 32127;
        lllIlIlIll[51] = (97 ^ 46) ^ (239 ^ 189);
        lllIlIlIll[52] = (-((-7313) & 24308)) & (-6145) & 32639;
        lllIlIlIll[53] = (((110 + 147) - 115) + 8) ^ (((79 + 111) - 95) + 41);
        lllIlIlIll[54] = (-2307) & 15871;
        lllIlIlIll[55] = (242 ^ 162) ^ (37 ^ 106);
        lllIlIlIll[56] = 142 ^ 174;
        lllIlIlIll[57] = 47 ^ 14;
        lllIlIlIll[58] = 226 ^ 192;
        lllIlIlIll[59] = (-((-10763) & 28203)) & (-29) & 32767;
        lllIlIlIll[60] = (-16908) & 23407;
        lllIlIlIll[61] = (78 ^ 120) ^ (153 ^ 140);
        lllIlIlIll[62] = (-((-21077) & 24151)) & (-16393) & 32767;
        lllIlIlIll[63] = (113 ^ 15) ^ (118 ^ 44);
        lllIlIlIll[64] = 65 ^ 100;
        lllIlIlIll[65] = 71 ^ 97;
        lllIlIlIll[66] = 3 ^ 36;
        lllIlIlIll[67] = 65 ^ 105;
        lllIlIlIll[68] = 164 ^ 141;
        lllIlIlIll[69] = (-((-23577) & 23834)) & (-513) & 14335;
        lllIlIlIll[70] = (34 ^ 100) ^ (92 ^ 48);
        lllIlIlIll[71] = 85 ^ 126;
        lllIlIlIll[72] = (((146 + 58) - 148) + 100) ^ (((158 + 98) - 160) + 80);
        lllIlIlIll[73] = (((111 + 89) - 176) + 106) ^ (((69 + 13) - 38) + 131);
        lllIlIlIll[74] = ((154 + 204) - 290) + 144;
        lllIlIlIll[75] = (-((-426) & 19387)) & (-8201) & 27583;
        lllIlIlIll[76] = 0 ^ 116;
        lllIlIlIll[77] = 156 ^ 178;
        lllIlIlIll[78] = (-((-121) & 25342)) & (-6145) & 31735;
        lllIlIlIll[79] = (174 ^ 139) ^ (161 ^ 171);
        lllIlIlIll[80] = (((30 + 185) - 188) + 219) ^ (((97 + 73) - 143) + 156);
        lllIlIlIll[81] = (((155 + 127) - 102) + 9) ^ (((102 + 140) - 135) + 34);
        lllIlIlIll[82] = 211 ^ 136;
        lllIlIlIll[83] = (((94 + 145) - 105) + 31) ^ (((57 + 121) - 39) + 9);
        lllIlIlIll[84] = (((0 + 77) - (-37)) + 16) ^ (((146 + 40) - 77) + 67);
        lllIlIlIll[85] = (126 ^ 33) ^ (2 ^ 110);
        lllIlIlIll[86] = 182 ^ 136;
        lllIlIlIll[87] = 22 ^ 34;
        lllIlIlIll[88] = 18 ^ 39;
        lllIlIlIll[89] = (184 ^ 159) ^ (214 ^ 199);
        lllIlIlIll[90] = (45 ^ 6) ^ (190 ^ 162);
        lllIlIlIll[91] = (66 ^ 90) ^ (10 ^ 42);
        lllIlIlIll[92] = 57 ^ 106;
        lllIlIlIll[93] = 185 ^ 128;
        lllIlIlIll[94] = (((8 + 117) - 105) + 157) ^ (((104 + 5) - (-26)) + 4);
        lllIlIlIll[95] = 91 ^ 96;
        lllIlIlIll[96] = 62 ^ 2;
        lllIlIlIll[97] = 250 ^ 199;
        lllIlIlIll[98] = (90 ^ 102) ^ "   ".length();
        lllIlIlIll[99] = (((23 + 58) - (-34)) + 96) ^ (((101 + 96) - 181) + 131);
        lllIlIlIll[100] = (-((-21669) & 22517)) & (-16519) & 32767;
        lllIlIlIll[101] = (-1059) & 16359;
        lllIlIlIll[102] = (-16418) & 31715;
        lllIlIlIll[103] = (-12607) & 14782;
        lllIlIlIll[104] = (70 ^ 55) ^ (92 ^ 111);
        lllIlIlIll[105] = 22 ^ 85;
        lllIlIlIll[106] = 246 ^ 178;
        lllIlIlIll[107] = (11 ^ 121) ^ (155 ^ 172);
        lllIlIlIll[108] = (16 ^ 0) ^ (85 ^ 3);
        lllIlIlIll[109] = (((146 + 75) - 32) + 58) ^ (((175 + 172) - 289) + 118);
        lllIlIlIll[110] = 119 ^ 63;
        lllIlIlIll[111] = 222 ^ 151;
        lllIlIlIll[112] = 36 ^ 110;
        lllIlIlIll[113] = (123 ^ 37) ^ (146 ^ 135);
        lllIlIlIll[114] = (200 ^ 166) ^ (224 ^ 194);
        lllIlIlIll[115] = 104 ^ 37;
        lllIlIlIll[116] = (14 ^ 116) ^ (166 ^ 146);
        lllIlIlIll[117] = 89 ^ 22;
        lllIlIlIll[118] = 20 ^ 68;
        lllIlIlIll[119] = (((138 + 108) - 98) + 105) ^ (((153 + 47) - 190) + 162);
        lllIlIlIll[120] = (116 ^ 124) ^ (220 ^ 134);
        lllIlIlIll[121] = (-((-16259) & 32758)) & (-11905) & 28663;
        lllIlIlIll[122] = (-11333) & 11772;
        lllIlIlIll[123] = (-11270) & 11735;
        lllIlIlIll[124] = (-23044) & 23543;
        lllIlIlIll[125] = (-28724) & 29303;
        lllIlIlIll[126] = ((86 + 221) - 73) + 16;
        lllIlIlIll[127] = (-((-16868) & 28155)) & (-16385) & 28351;
        lllIlIlIll[128] = (-((-9601) & 10173)) & (-131) & 6142;
        lllIlIlIll[129] = (-((-5954) & 16207)) & (-16417) & 28669;
        lllIlIlIll[130] = (-(61 ^ 46)) & (-4097) & 16094;
        lllIlIlIll[131] = (-8377) & 16383;
        lllIlIlIll[132] = (-((-2455) & 23959)) & (-8194) & 30597;
        lllIlIlIll[133] = (((133 + 61) - 132) + 134) ^ (((69 + 149) - 112) + 54);
        lllIlIlIll[134] = 104 ^ 11;
        lllIlIlIll[135] = (179 ^ 153) ^ (49 ^ 79);
        lllIlIlIll[136] = 89 ^ 12;
        lllIlIlIll[137] = 151 ^ 193;
        lllIlIlIll[138] = (-13063) & 16302;
        lllIlIlIll[139] = (-25157) & 28630;
        lllIlIlIll[140] = (((116 + 46) - (-61)) + 1) ^ (((25 + 121) - 17) + 54);
        lllIlIlIll[141] = 119 ^ 47;
        lllIlIlIll[142] = (50 ^ 9) ^ (246 ^ 148);
    }

    private static boolean llIIIllIlIIll(int i) {
        return i > 0;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            dE();
            "".length();
            if ((-((((145 + 54) - 194) + 155) ^ (((71 + 16) - 22) + 99))) >= 0) {
                return (((74 ^ 23) & ((23 ^ 74) ^ (-1))) ^ (82 ^ 76)) & (((((67 + 150) - 59) + 9) ^ (((137 + 70) - 186) + 164)) ^ (-" ".length()));
            }
        } catch (Exception e2) {
        }
        return lllIlIlIll[133];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIIIllIlIlII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[134])) {
            ?? r0 = lllIlIlIll[1];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIlIlIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    static boolean dI() {
        int[] iArr = new int[lllIlIlIll[1]];
        iArr[lllIlIlIll[0]] = lllIlIlIll[100];
        if (llIIIllIlIIlI(TileObjects.getNearest(iArr))) {
            ?? r0 = lllIlIlIll[1];
            "".length();
            return (33 ^ 36) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIlIlIll[0];
    }

    private static void dG() {
        AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[73]];
        if (llIIIllIlIIIl(dI() ? 1 : 0)) {
            if (llIIIllIIllll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (llIIIllIIllll(Widgets.get(lllIlIlIll[74]).isEmpty() ? 1 : 0) && llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                if (llIIIllIlIlll(Widgets.get(lllIlIlIll[75], lllIlIlIll[6]))) {
                    if (llIIIllIlIIlI(Widgets.get(lllIlIlIll[76], lllIlIlIll[55]))) {
                        Widgets.get(lllIlIlIll[76], lllIlIlIll[55]).interact(lllIlIlIIl[lllIlIlIll[77]]);
                        Time.sleepTicks(lllIlIlIll[2]);
                        "".length();
                    }
                    if (llIIIllIlIIlI(Widgets.get(lllIlIlIll[78], lllIlIlIll[1]))) {
                        Widgets.get(lllIlIlIll[78], lllIlIlIll[1]).interact(lllIlIlIIl[lllIlIlIll[79]]);
                        Time.sleepTicks(lllIlIlIll[5]);
                        "".length();
                    }
                }
                if (llIIIllIlIIlI(Widgets.get(lllIlIlIll[75], lllIlIlIll[6]))) {
                    Widget widget = Widgets.get(lllIlIlIll[75], lllIlIlIll[80]);
                    String[] strArr = new String[lllIlIlIll[1]];
                    strArr[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[81]];
                    if (llIIIllIlIIIl(widget.hasAction(strArr) ? 1 : 0)) {
                        Widgets.get(lllIlIlIll[75], lllIlIlIll[6]).getChild(lllIlIlIll[82]).interact(lllIlIlIIl[lllIlIlIll[83]]);
                        Time.sleepTicks(lllIlIlIll[3]);
                        "".length();
                    }
                }
            }
            if (llIIIllIlIIIl(Widgets.get(lllIlIlIll[74]).isEmpty() ? 1 : 0) && llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                Widgets.get(lllIlIlIll[74], lllIlIlIll[15]).interact(lllIlIlIIl[lllIlIlIll[84]]);
                Time.sleepTicks(lllIlIlIll[6]);
                "".length();
            }
            if (llIIIllIlIIlI(Widgets.get(lllIlIlIll[75], lllIlIlIll[6]))) {
                Widget widget2 = Widgets.get(lllIlIlIll[75], lllIlIlIll[80]);
                String[] strArr2 = new String[lllIlIlIll[1]];
                strArr2[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[85]];
                if (llIIIllIIllll(widget2.hasAction(strArr2) ? 1 : 0)) {
                    Widgets.get(lllIlIlIll[75], lllIlIlIll[86]).interact(lllIlIlIIl[lllIlIlIll[87]]);
                    Time.sleepTicks(lllIlIlIll[2]);
                    "".length();
                    Widgets.get(lllIlIlIll[75], lllIlIlIll[80]).interact(lllIlIlIIl[lllIlIlIll[88]]);
                    Time.sleepTicks(lllIlIlIll[3]);
                    "".length();
                }
            }
        }
        if (llIIIllIlIIIl(dJ() ? 1 : 0) && llIIIllIIllll(dI() ? 1 : 0)) {
            if (llIIIllIIllll(Widgets.get(lllIlIlIll[74]).isEmpty() ? 1 : 0) && llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                if (llIIIllIlIlll(Widgets.get(lllIlIlIll[75], lllIlIlIll[6]))) {
                    if (llIIIllIlIIlI(Widgets.get(lllIlIlIll[76], lllIlIlIll[55]))) {
                        Widgets.get(lllIlIlIll[76], lllIlIlIll[55]).interact(lllIlIlIIl[lllIlIlIll[89]]);
                        Time.sleepTicks(lllIlIlIll[2]);
                        "".length();
                    }
                    if (llIIIllIlIIlI(Widgets.get(lllIlIlIll[78], lllIlIlIll[1]))) {
                        Widgets.get(lllIlIlIll[78], lllIlIlIll[1]).interact(lllIlIlIIl[lllIlIlIll[90]]);
                        Time.sleepTicks(lllIlIlIll[5]);
                        "".length();
                    }
                }
                if (llIIIllIlIIlI(Widgets.get(lllIlIlIll[75], lllIlIlIll[6]))) {
                    Widget widget3 = Widgets.get(lllIlIlIll[75], lllIlIlIll[80]);
                    String[] strArr3 = new String[lllIlIlIll[1]];
                    strArr3[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[91]];
                    if (llIIIllIlIIIl(widget3.hasAction(strArr3) ? 1 : 0)) {
                        Widgets.get(lllIlIlIll[75], lllIlIlIll[6]).getChild(lllIlIlIll[92]).interact(lllIlIlIIl[lllIlIlIll[93]]);
                        Time.sleepTicks(lllIlIlIll[3]);
                        "".length();
                    }
                }
            }
            if (llIIIllIlIIIl(Widgets.get(lllIlIlIll[74]).isEmpty() ? 1 : 0) && llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                Widgets.get(lllIlIlIll[74], lllIlIlIll[20]).interact(lllIlIlIIl[lllIlIlIll[94]]);
                Time.sleepTicks(lllIlIlIll[6]);
                "".length();
            }
            if (llIIIllIlIIlI(Widgets.get(lllIlIlIll[75], lllIlIlIll[6]))) {
                Widget widget4 = Widgets.get(lllIlIlIll[75], lllIlIlIll[80]);
                String[] strArr4 = new String[lllIlIlIll[1]];
                strArr4[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[95]];
                if (llIIIllIIllll(widget4.hasAction(strArr4) ? 1 : 0)) {
                    Widgets.get(lllIlIlIll[75], lllIlIlIll[86]).interact(lllIlIlIIl[lllIlIlIll[96]]);
                    Time.sleepTicks(lllIlIlIll[2]);
                    "".length();
                    Widgets.get(lllIlIlIll[75], lllIlIlIll[80]).interact(lllIlIlIIl[lllIlIlIll[97]]);
                    Time.sleepTicks(lllIlIlIll[3]);
                    "".length();
                }
            }
        }
        String[] strArr5 = new String[lllIlIlIll[1]];
        strArr5[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[86]];
        C0006g.a(strArr5);
    }

    private static boolean llIIIllIlIIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0374, code lost:
        if (llIIIllIlIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.X.lllIlIlIll[13]) != false) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v204, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v228, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v231, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v239, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v242, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v245, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v248, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v298, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dE() {
        if (llIIIllIIllll(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[0]];
            C0001b.a(bu);
            if (llIIIllIlIIII(bu.size(), lllIlIlIll[1])) {
                System.out.println(lllIlIlIIl[lllIlIlIll[1]]);
                bs = lllIlIlIll[0];
            }
        }
        if (llIIIllIlIIIl(bs ? 1 : 0)) {
            if (llIIIllIlIIIl(aa() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIIllIlIIlI(nearest) && llIIIllIlIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[2]];
                    if (llIIIllIIllll(Equipment.contains(C0005f.aM) ? 1 : 0)) {
                        Equipment.getFirst(C0005f.aM).interact(lllIlIlIIl[lllIlIlIll[3]]);
                        Time.sleepUntil(() -> {
                            int[] iArr = new int[lllIlIlIll[1]];
                            iArr[lllIlIlIll[0]] = lllIlIlIll[38];
                            if (llIIIllIlIlll(TileObjects.getNearest(iArr))) {
                                ?? r0 = lllIlIlIll[1];
                                "".length();
                                return (-((225 ^ 187) ^ (40 ^ 118))) >= 0 ? ((69 ^ 24) ^ (23 ^ 6)) & (((72 ^ 64) ^ (98 ^ 38)) ^ (-" ".length())) : r0;
                            }
                            return lllIlIlIll[0];
                        }, lllIlIlIll[4]);
                        "".length();
                    }
                    if (llIIIllIlIIIl(Equipment.contains(C0005f.aM) ? 1 : 0) && llIIIllIIllll(Inventory.contains(C0005f.aM) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aM).interact(lllIlIlIIl[lllIlIlIll[5]]);
                    }
                    if (llIIIllIlIIIl(Equipment.contains(C0005f.aM) ? 1 : 0) && llIIIllIlIIIl(Inventory.contains(C0005f.aM) ? 1 : 0)) {
                        C0000a.a(nearest);
                        Time.sleepTicks(lllIlIlIll[1]);
                        "".length();
                    }
                }
                if (llIIIllIlIIlI(nearest) && llIIIllIIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[6]];
                    if (llIIIllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIlIlIll[7]);
                        "".length();
                    }
                    if (llIIIllIIllll(Bank.isOpen() ? 1 : 0) && llIIIllIlIIll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepUntil(() -> {
                            if (llIIIllIlIIIl(Inventory.getAll().size())) {
                                ?? r0 = lllIlIlIll[1];
                                "".length();
                                return " ".length() == 0 ? ((122 ^ 34) ^ (106 ^ 124)) & (((((98 + 69) - (-58)) + 27) ^ (((109 + 16) - 25) + 78)) ^ (-" ".length())) : r0;
                            }
                            return lllIlIlIll[0];
                        }, lllIlIlIll[8]);
                        "".length();
                        Time.sleepTicks(lllIlIlIll[1]);
                        "".length();
                    }
                    if (llIIIllIlIIIl(Bank.contains(item -> {
                        return item.getName().toLowerCase().contains(lllIlIlIIl[lllIlIlIll[137]]);
                    }) ? 1 : 0)) {
                        ae();
                        System.out.println(lllIlIlIIl[lllIlIlIll[9]]);
                        bs = lllIlIlIll[1];
                        return;
                    }
                    int[] iArr = new int[lllIlIlIll[1]];
                    iArr[lllIlIlIll[0]] = lllIlIlIll[10];
                    if (llIIIllIlIIIl(Bank.contains(iArr) ? 1 : 0)) {
                        ae();
                        System.out.println(lllIlIlIIl[lllIlIlIll[11]]);
                        bs = lllIlIlIll[1];
                        return;
                    }
                    int[] iArr2 = new int[lllIlIlIll[1]];
                    iArr2[lllIlIlIll[0]] = lllIlIlIll[12];
                    if (llIIIllIlIIIl(Bank.contains(iArr2) ? 1 : 0)) {
                        ae();
                        System.out.println(lllIlIlIIl[lllIlIlIll[13]]);
                        bs = lllIlIlIll[1];
                        return;
                    }
                    int[] iArr3 = new int[lllIlIlIll[1]];
                    iArr3[lllIlIlIll[0]] = lllIlIlIll[14];
                    if (llIIIllIlIIIl(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lllIlIlIll[1]];
                        iArr4[lllIlIlIll[0]] = lllIlIlIll[14];
                        if (llIIIllIlIIIl(Inventory.contains(iArr4) ? 1 : 0)) {
                            ae();
                            System.out.println(lllIlIlIIl[lllIlIlIll[15]]);
                            bs = lllIlIlIll[1];
                            return;
                        }
                    }
                    if (llIIIllIlIIII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[16])) {
                        int[] iArr5 = new int[lllIlIlIll[1]];
                        iArr5[lllIlIlIll[0]] = lllIlIlIll[17];
                        if (llIIIllIlIIIl(Bank.contains(iArr5) ? 1 : 0)) {
                            ae();
                            System.out.println(lllIlIlIIl[lllIlIlIll[18]]);
                            bs = lllIlIlIll[1];
                            return;
                        }
                        int[] iArr6 = new int[lllIlIlIll[1]];
                        iArr6[lllIlIlIll[0]] = lllIlIlIll[19];
                        if (llIIIllIlIIIl(Bank.contains(iArr6) ? 1 : 0)) {
                            ae();
                            System.out.println(lllIlIlIIl[lllIlIlIll[20]]);
                            bs = lllIlIlIll[1];
                            return;
                        }
                    }
                    if (llIIIllIlIlII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[16])) {
                        int[] iArr7 = new int[lllIlIlIll[1]];
                        iArr7[lllIlIlIll[0]] = lllIlIlIll[21];
                        if (llIIIllIIllll(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lllIlIlIll[1]];
                            iArr8[lllIlIlIll[0]] = lllIlIlIll[21];
                            if (llIIIllIIllll(Bank.contains(iArr8) ? 1 : 0)) {
                                int[] iArr9 = new int[lllIlIlIll[1]];
                                iArr9[lllIlIlIll[0]] = lllIlIlIll[21];
                            }
                        }
                        ae();
                        System.out.println(lllIlIlIIl[lllIlIlIll[22]]);
                        bs = lllIlIlIll[1];
                        return;
                    }
                    if (llIIIllIlIIIl(Equipment.contains(C0005f.aM) ? 1 : 0) && llIIIllIlIIIl(Inventory.contains(C0005f.aM) ? 1 : 0)) {
                        C0000a.b(C0005f.aM, lllIlIlIll[1]);
                        Time.sleepTicks(lllIlIlIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr10 = new int[lllIlIlIll[1]];
                            iArr10[lllIlIlIll[0]] = lllIlIlIll[28];
                            if (llIIIllIlIIll(Inventory.getCount(iArr10))) {
                                ?? r0 = lllIlIlIll[1];
                                "".length();
                                return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIlIlIll[0];
                        }, lllIlIlIll[7]);
                        "".length();
                    }
                    if (llIIIllIlIIII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[16])) {
                        C0000a.a(lllIlIlIll[17], lllIlIlIll[23]);
                        C0000a.a(lllIlIlIll[14], lllIlIlIll[24]);
                        C0000a.a(lllIlIlIll[10], lllIlIlIll[1]);
                        C0000a.a(lllIlIlIll[12], lllIlIlIll[1]);
                        C0000a.a(lllIlIlIll[25], lllIlIlIll[26]);
                        C0000a.a(lllIlIlIll[19], lllIlIlIll[27]);
                    }
                    if (llIIIllIlIlII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[16])) {
                        C0000a.a(lllIlIlIll[14], lllIlIlIll[24]);
                        C0000a.a(lllIlIlIll[10], lllIlIlIll[1]);
                        C0000a.a(lllIlIlIll[12], lllIlIlIll[1]);
                        C0000a.a(lllIlIlIll[21], lllIlIlIll[27]);
                    }
                }
            }
            if (llIIIllIIllll(aa() ? 1 : 0)) {
                int[] iArr10 = new int[lllIlIlIll[1]];
                iArr10[lllIlIlIll[0]] = lllIlIlIll[28];
                if (llIIIllIIllll(Inventory.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[lllIlIlIll[1]];
                    iArr11[lllIlIlIll[0]] = lllIlIlIll[28];
                    if (llIIIllIlIIIl(Equipment.contains(iArr11) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[29]];
                        Bank.close();
                        Time.sleepTicks(lllIlIlIll[1]);
                        "".length();
                        int[] iArr12 = new int[lllIlIlIll[1]];
                        iArr12[lllIlIlIll[0]] = lllIlIlIll[28];
                        Item first = Inventory.getFirst(iArr12);
                        if (llIIIllIlIIlI(first)) {
                            first.interact(lllIlIlIIl[lllIlIlIll[30]]);
                            Time.sleepTicks(lllIlIlIll[3]);
                            "".length();
                        }
                    }
                }
                if (llIIIllIlIIII(C0004e.j(lllIlIlIll[31]), lllIlIlIll[1])) {
                    if (llIIIllIIllll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (llIIIllIlIlIl(Players.getLocal().getWorldLocation().distanceTo(jf), lllIlIlIll[2]) && llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[32]];
                        Movement.walkTo(jf);
                        "".length();
                        Time.sleepTicks(lllIlIlIll[1]);
                        "".length();
                    }
                    if (llIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(jf), lllIlIlIll[3])) {
                        AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[33]];
                        C0006g.a(lllIlIlIIl[lllIlIlIll[34]], bQ);
                    }
                }
                if (llIIIllIlIIll(C0004e.j(lllIlIlIll[31]))) {
                    int[] iArr13 = new int[lllIlIlIll[1]];
                    iArr13[lllIlIlIll[0]] = lllIlIlIll[35];
                    if (llIIIllIlIIlI(TileObjects.getNearest(iArr13))) {
                        AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[36]];
                        int[] iArr14 = new int[lllIlIlIll[1]];
                        iArr14[lllIlIlIll[0]] = lllIlIlIll[35];
                        TileObjects.getNearest(iArr14).interact(lllIlIlIIl[lllIlIlIll[37]]);
                        Time.sleepUntil(() -> {
                            int[] iArr15 = new int[lllIlIlIll[1]];
                            iArr15[lllIlIlIll[0]] = lllIlIlIll[38];
                            if (llIIIllIlIIlI(TileObjects.getNearest(iArr15))) {
                                ?? r0 = lllIlIlIll[1];
                                "".length();
                                return (-"  ".length()) > 0 ? ((157 ^ 192) ^ (107 ^ 21)) & (((((155 + 147) - 270) + 125) ^ (((8 + 131) - 25) + 76)) ^ (-" ".length())) : r0;
                            }
                            return lllIlIlIll[0];
                        }, lllIlIlIll[4]);
                        "".length();
                    }
                    int[] iArr15 = new int[lllIlIlIll[1]];
                    iArr15[lllIlIlIll[0]] = lllIlIlIll[38];
                    if (llIIIllIlIlll(TileObjects.getNearest(iArr15))) {
                        int[] iArr16 = new int[lllIlIlIll[1]];
                        iArr16[lllIlIlIll[0]] = lllIlIlIll[35];
                        if (llIIIllIlIlll(TileObjects.getNearest(iArr16))) {
                            AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[39]];
                            Bank.close();
                            int[] iArr17 = new int[lllIlIlIll[1]];
                            iArr17[lllIlIlIll[0]] = lllIlIlIll[14];
                            Inventory.getFirst(iArr17).interact(lllIlIlIIl[lllIlIlIll[40]]);
                            Time.sleepUntil(() -> {
                                int[] iArr18 = new int[lllIlIlIll[1]];
                                iArr18[lllIlIlIll[0]] = lllIlIlIll[38];
                                if (llIIIllIlIIlI(TileObjects.getNearest(iArr18))) {
                                    ?? r0 = lllIlIlIll[1];
                                    "".length();
                                    return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lllIlIlIll[0];
                            }, lllIlIlIll[4]);
                            "".length();
                            Time.sleepTicks(lllIlIlIll[3]);
                            "".length();
                        }
                    }
                    int[] iArr18 = new int[lllIlIlIll[1]];
                    iArr18[lllIlIlIll[0]] = lllIlIlIll[38];
                    if (llIIIllIlIIlI(TileObjects.getNearest(iArr18))) {
                        if (llIIIllIlIIIl(dL() ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[41]];
                            dH();
                        }
                        if (llIIIllIIllll(dL() ? 1 : 0)) {
                            if (llIIIllIlIlII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[18]) && llIIIllIlIIIl(dK() ? 1 : 0)) {
                                dG();
                            }
                            if (llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                dF();
                            }
                            String[] strArr = new String[lllIlIlIll[1]];
                            strArr[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[16]];
                            C0006g.a(strArr);
                        }
                    }
                }
            }
        }
    }

    private static boolean llIIIllIlIlll(Object obj) {
        return obj == null;
    }

    private static String llIIIlIllllll(String lllllllllllllllllIllIlIlllIIIIII, String lllllllllllllllllIllIlIllIllllll) {
        String lllllllllllllllllIllIlIlllIIIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllllIllIlIlllIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIllIlIllIlllllI = new StringBuilder();
        char[] charArray = lllllllllllllllllIllIlIllIllllll.toCharArray();
        int lllllllllllllllllIllIlIllIllIlll = lllIlIlIll[0];
        char[] charArray2 = lllllllllllllllllIllIlIlllIIIIII2.toCharArray();
        int length = charArray2.length;
        int i = lllIlIlIll[0];
        while (llIIIllIlIIII(i, length)) {
            lllllllllllllllllIllIlIllIlllllI.append((char) (charArray2[i] ^ charArray[lllllllllllllllllIllIlIllIllIlll % charArray.length]));
            "".length();
            lllllllllllllllllIllIlIllIllIlll++;
            i++;
            "".length();
            if ((-" ".length()) > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIllIlIllIlllllI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v119, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v92, types: [boolean] */
    private static void dF() {
        if (llIIIllIlIIII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[18])) {
            int[] iArr = new int[lllIlIlIll[1]];
            iArr[lllIlIlIll[0]] = lllIlIlIll[42];
            if (llIIIllIlIIlI(TileObjects.getNearest(iArr))) {
                AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[43]];
                if (llIIIllIlIIIl(Widgets.get(lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                    Widget widget = Widgets.get(lllIlIlIll[44], lllIlIlIll[5]);
                    if (llIIIllIlIIlI(widget)) {
                        Mouse.click(widget.getChild(lllIlIlIll[9]).getClickPoint().getX(), widget.getChild(lllIlIlIll[9]).getClickPoint().getY(), (boolean) lllIlIlIll[1]);
                        Time.sleepUntil(() -> {
                            int[] iArr2 = new int[lllIlIlIll[1]];
                            iArr2[lllIlIlIll[0]] = lllIlIlIll[47];
                            if (llIIIllIlIIlI(TileObjects.getNearest(iArr2))) {
                                ?? r0 = lllIlIlIll[1];
                                "".length();
                                return (-" ".length()) >= ((9 ^ 13) & ((171 ^ 175) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIlIlIll[0];
                        }, lllIlIlIll[45]);
                        "".length();
                    }
                }
                if (llIIIllIIllll(Widgets.get(lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                    int[] iArr2 = new int[lllIlIlIll[1]];
                    iArr2[lllIlIlIll[0]] = lllIlIlIll[42];
                    if (llIIIllIlIIlI(TileObjects.getNearest(iArr2))) {
                        int[] iArr3 = new int[lllIlIlIll[1]];
                        iArr3[lllIlIlIll[0]] = lllIlIlIll[42];
                        TileObjects.getNearest(iArr3).interact(lllIlIlIIl[lllIlIlIll[46]]);
                        Time.sleepUntil(() -> {
                            if (llIIIllIlIIIl(Widgets.get(lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                                ?? r0 = lllIlIlIll[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIlIlIll[0];
                        }, lllIlIlIll[45]);
                        "".length();
                    }
                }
            }
            int[] iArr4 = new int[lllIlIlIll[1]];
            iArr4[lllIlIlIll[0]] = lllIlIlIll[47];
            if (llIIIllIlIIlI(TileObjects.getNearest(iArr4))) {
                AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[48]];
                if (llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(lllIlIlIll[1]);
                    "".length();
                    int[] iArr5 = new int[lllIlIlIll[1]];
                    iArr5[lllIlIlIll[0]] = lllIlIlIll[47];
                    TileObjects.getNearest(iArr5).interact(lllIlIlIIl[lllIlIlIll[49]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, lllIlIlIll[45]);
                    "".length();
                }
                String[] strArr = new String[lllIlIlIll[1]];
                strArr[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[27]];
                C0006g.a(strArr);
            }
        }
        if (llIIIllIlIlII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[18]) && llIIIllIlIIII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[16]) && llIIIllIIllll(dK() ? 1 : 0)) {
            int[] iArr6 = new int[lllIlIlIll[1]];
            iArr6[lllIlIlIll[0]] = lllIlIlIll[50];
            if (llIIIllIlIIlI(TileObjects.getNearest(iArr6))) {
                AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[51]];
                if (llIIIllIlIIIl(Widgets.get(lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                    Widget widget2 = Widgets.get(lllIlIlIll[44], lllIlIlIll[5]);
                    if (llIIIllIlIIlI(widget2)) {
                        Mouse.click(widget2.getChild(lllIlIlIll[9]).getClickPoint().getX(), widget2.getChild(lllIlIlIll[9]).getClickPoint().getY(), (boolean) lllIlIlIll[1]);
                        Time.sleepUntil(() -> {
                            int[] iArr7 = new int[lllIlIlIll[1]];
                            iArr7[lllIlIlIll[0]] = lllIlIlIll[50];
                            if (llIIIllIlIIlI(TileObjects.getNearest(iArr7))) {
                                ?? r0 = lllIlIlIll[1];
                                "".length();
                                return "   ".length() == 0 ? ((32 ^ 55) ^ (197 ^ 142)) & (((54 ^ 35) ^ (202 ^ 131)) ^ (-" ".length())) : r0;
                            }
                            return lllIlIlIll[0];
                        }, lllIlIlIll[52]);
                        "".length();
                    }
                }
                if (llIIIllIIllll(Widgets.get(lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                    int[] iArr7 = new int[lllIlIlIll[1]];
                    iArr7[lllIlIlIll[0]] = lllIlIlIll[50];
                    if (llIIIllIlIIlI(TileObjects.getNearest(iArr7))) {
                        int[] iArr8 = new int[lllIlIlIll[1]];
                        iArr8[lllIlIlIll[0]] = lllIlIlIll[50];
                        TileObjects.getNearest(iArr8).interact(lllIlIlIIl[lllIlIlIll[53]]);
                        Time.sleepUntil(() -> {
                            if (llIIIllIlIIIl(Widgets.get(lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                                ?? r0 = lllIlIlIll[1];
                                "".length();
                                return (((45 ^ 49) ^ (85 ^ 65)) & (((20 ^ 121) ^ (96 ^ 5)) ^ (-" ".length()))) > 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                            }
                            return lllIlIlIll[0];
                        }, lllIlIlIll[45]);
                        "".length();
                    }
                }
            }
            int[] iArr9 = new int[lllIlIlIll[1]];
            iArr9[lllIlIlIll[0]] = lllIlIlIll[54];
            if (llIIIllIlIIlI(TileObjects.getNearest(iArr9))) {
                AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[55]];
                if (llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(lllIlIlIll[1]);
                    "".length();
                    int[] iArr10 = new int[lllIlIlIll[1]];
                    iArr10[lllIlIlIll[0]] = lllIlIlIll[54];
                    TileObjects.getNearest(iArr10).interact(lllIlIlIIl[lllIlIlIll[56]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, lllIlIlIll[45]);
                    "".length();
                }
                String[] strArr2 = new String[lllIlIlIll[1]];
                strArr2[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[57]];
                C0006g.a(strArr2);
            }
        }
        if (llIIIllIlIlII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[16]) && llIIIllIlIIII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[57]) && llIIIllIIllll(dK() ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[58]];
            int[] iArr11 = new int[lllIlIlIll[1]];
            iArr11[lllIlIlIll[0]] = lllIlIlIll[59];
            if (llIIIllIlIIlI(TileObjects.getNearest(iArr11))) {
                if (llIIIllIlIIIl(Widgets.get(lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                    Widget widget3 = Widgets.get(lllIlIlIll[44], lllIlIlIll[6]);
                    if (llIIIllIlIIlI(widget3)) {
                        Mouse.click(widget3.getChild(lllIlIlIll[5]).getClickPoint().getX(), widget3.getChild(lllIlIlIll[5]).getClickPoint().getY(), (boolean) lllIlIlIll[1]);
                        Time.sleepUntil(() -> {
                            int[] iArr12 = new int[lllIlIlIll[1]];
                            iArr12[lllIlIlIll[0]] = lllIlIlIll[62];
                            if (llIIIllIlIIlI(TileObjects.getNearest(iArr12))) {
                                ?? r0 = lllIlIlIll[1];
                                "".length();
                                return (-"  ".length()) > 0 ? ((193 ^ 168) ^ (157 ^ 186)) & (((80 ^ 119) ^ (195 ^ 170)) ^ (-" ".length())) : r0;
                            }
                            return lllIlIlIll[0];
                        }, lllIlIlIll[60]);
                        "".length();
                    }
                }
                if (llIIIllIIllll(Widgets.get(lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                    int[] iArr12 = new int[lllIlIlIll[1]];
                    iArr12[lllIlIlIll[0]] = lllIlIlIll[59];
                    if (llIIIllIlIIlI(TileObjects.getNearest(iArr12))) {
                        int[] iArr13 = new int[lllIlIlIll[1]];
                        iArr13[lllIlIlIll[0]] = lllIlIlIll[59];
                        TileObjects.getNearest(iArr13).interact(lllIlIlIIl[lllIlIlIll[61]]);
                        Time.sleepUntil(() -> {
                            if (llIIIllIlIIIl(Widgets.get(lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                                ?? r0 = lllIlIlIll[1];
                                "".length();
                                return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIlIlIll[0];
                        }, lllIlIlIll[45]);
                        "".length();
                    }
                }
            }
            int[] iArr14 = new int[lllIlIlIll[1]];
            iArr14[lllIlIlIll[0]] = lllIlIlIll[62];
            if (llIIIllIlIIlI(TileObjects.getNearest(iArr14))) {
                AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[63]];
                if (llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(lllIlIlIll[1]);
                    "".length();
                    int[] iArr15 = new int[lllIlIlIll[1]];
                    iArr15[lllIlIlIll[0]] = lllIlIlIll[62];
                    TileObjects.getNearest(iArr15).interact(lllIlIlIIl[lllIlIlIll[64]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, lllIlIlIll[45]);
                    "".length();
                }
                String[] strArr3 = new String[lllIlIlIll[1]];
                strArr3[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[65]];
                C0006g.a(strArr3);
            }
        }
        if (llIIIllIlIlII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[57]) && llIIIllIIllll(dK() ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[66]];
            int[] iArr16 = new int[lllIlIlIll[1]];
            iArr16[lllIlIlIll[0]] = lllIlIlIll[54];
            if (llIIIllIlIIlI(TileObjects.getNearest(iArr16)) && llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                Time.sleepTicks(lllIlIlIll[1]);
                "".length();
                int[] iArr17 = new int[lllIlIlIll[1]];
                iArr17[lllIlIlIll[0]] = lllIlIlIll[54];
                TileObjects.getNearest(iArr17).interact(lllIlIlIIl[lllIlIlIll[67]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, lllIlIlIll[45]);
                "".length();
            }
            int[] iArr18 = new int[lllIlIlIll[1]];
            iArr18[lllIlIlIll[0]] = lllIlIlIll[50];
            if (llIIIllIlIIlI(TileObjects.getNearest(iArr18))) {
                if (llIIIllIlIIIl(Widgets.get(lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                    Widget widget4 = Widgets.get(lllIlIlIll[44], lllIlIlIll[6]);
                    if (llIIIllIlIIlI(widget4)) {
                        Mouse.click(widget4.getChild(lllIlIlIll[5]).getClickPoint().getX(), widget4.getChild(lllIlIlIll[5]).getClickPoint().getY(), (boolean) lllIlIlIll[1]);
                        Time.sleepUntil(() -> {
                            int[] iArr19 = new int[lllIlIlIll[1]];
                            iArr19[lllIlIlIll[0]] = lllIlIlIll[69];
                            if (llIIIllIlIIlI(TileObjects.getNearest(iArr19))) {
                                ?? r0 = lllIlIlIll[1];
                                "".length();
                                return ((24 ^ 32) & ((152 ^ 160) ^ (-1))) >= (150 ^ 146) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIlIlIll[0];
                        }, lllIlIlIll[60]);
                        "".length();
                    }
                }
                if (llIIIllIIllll(Widgets.get(lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                    int[] iArr19 = new int[lllIlIlIll[1]];
                    iArr19[lllIlIlIll[0]] = lllIlIlIll[50];
                    if (llIIIllIlIIlI(TileObjects.getNearest(iArr19))) {
                        int[] iArr20 = new int[lllIlIlIll[1]];
                        iArr20[lllIlIlIll[0]] = lllIlIlIll[50];
                        TileObjects.getNearest(iArr20).interact(lllIlIlIIl[lllIlIlIll[68]]);
                        Time.sleepUntil(() -> {
                            if (llIIIllIlIIIl(Widgets.get(lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                                ?? r0 = lllIlIlIll[1];
                                "".length();
                                return " ".length() < (((220 ^ 168) ^ (117 ^ 14)) & (((223 ^ 174) ^ (208 ^ 174)) ^ (-" ".length()))) ? ((159 ^ 177) ^ (123 ^ 82)) & (((((5 + 130) - 95) + 110) ^ (((28 + 64) - 45) + 98)) ^ (-" ".length())) : r0;
                            }
                            return lllIlIlIll[0];
                        }, lllIlIlIll[45]);
                        "".length();
                    }
                }
            }
            int[] iArr21 = new int[lllIlIlIll[1]];
            iArr21[lllIlIlIll[0]] = lllIlIlIll[69];
            if (llIIIllIlIIlI(TileObjects.getNearest(iArr21))) {
                AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[70]];
                if (llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(lllIlIlIll[1]);
                    "".length();
                    int[] iArr22 = new int[lllIlIlIll[1]];
                    iArr22[lllIlIlIll[0]] = lllIlIlIll[69];
                    TileObjects.getNearest(iArr22).interact(lllIlIlIIl[lllIlIlIll[71]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, lllIlIlIll[45]);
                    "".length();
                }
                String[] strArr4 = new String[lllIlIlIll[1]];
                strArr4[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[72]];
                C0006g.a(strArr4);
            }
        }
    }

    private static String llIIIllIIIIII(String lllllllllllllllllIllIlIllIlIlIll, String lllllllllllllllllIllIlIllIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllllIllIlIllIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIlIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIllIlIllIlIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIllIlIllIlIllIl.init(lllIlIlIll[2], lllllllllllllllllIllIlIllIlIlllI);
            return new String(lllllllllllllllllIllIlIllIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIlIllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIlIllIlIllII) {
            lllllllllllllllllIllIlIllIlIllII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v144, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v180, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    private static boolean aa() {
        if (llIIIllIlIIII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[18])) {
            String[] strArr = new String[lllIlIlIll[1]];
            strArr[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[80]];
            if (llIIIllIIllll(Inventory.contains(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[lllIlIlIll[1]];
                strArr2[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[104]];
                if (llIIIllIIllll(Inventory.contains(strArr2) ? 1 : 0)) {
                    String[] strArr3 = new String[lllIlIlIll[1]];
                    strArr3[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[105]];
                    if (llIIIllIIllll(Inventory.contains(strArr3) ? 1 : 0)) {
                        String[] strArr4 = new String[lllIlIlIll[1]];
                        strArr4[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[106]];
                        if (llIIIllIIllll(Inventory.contains(strArr4) ? 1 : 0)) {
                            int[] iArr = new int[lllIlIlIll[1]];
                            iArr[lllIlIlIll[0]] = lllIlIlIll[25];
                            if (llIIIllIIllll(Inventory.contains(iArr) ? 1 : 0)) {
                                String[] strArr5 = new String[lllIlIlIll[1]];
                                strArr5[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[107]];
                                if (llIIIllIIllll(Inventory.contains(strArr5) ? 1 : 0)) {
                                    String[] strArr6 = new String[lllIlIlIll[1]];
                                    strArr6[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[108]];
                                    if (llIIIllIlIlII(Inventory.getAll(strArr6).size(), lllIlIlIll[2]) && (!llIIIllIlIIIl(Inventory.contains(C0005f.aM) ? 1 : 0) || llIIIllIIllll(Equipment.contains(C0005f.aM) ? 1 : 0))) {
                                        ?? r0 = lllIlIlIll[1];
                                        "".length();
                                        return (-" ".length()) > (((((156 + 92) - 96) + 82) ^ (((4 + 170) - 73) + 79)) & (((55 ^ 22) ^ (((4 + 87) - (-17)) + 19)) ^ (-" ".length()))) ? ((((47 + 131) - 123) + 95) ^ (((88 + 42) - 74) + 121)) & (((((97 + 153) - 202) + 111) ^ (((47 + 148) - 44) + 33)) ^ (-" ".length())) : r0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return lllIlIlIll[0];
        } else if (llIIIllIlIlII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[18]) && llIIIllIlIIII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[16])) {
            String[] strArr7 = new String[lllIlIlIll[1]];
            strArr7[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[109]];
            if (llIIIllIIllll(Inventory.contains(strArr7) ? 1 : 0)) {
                String[] strArr8 = new String[lllIlIlIll[1]];
                strArr8[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[110]];
                if (llIIIllIIllll(Inventory.contains(strArr8) ? 1 : 0)) {
                    String[] strArr9 = new String[lllIlIlIll[1]];
                    strArr9[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[111]];
                    if (llIIIllIIllll(Inventory.contains(strArr9) ? 1 : 0)) {
                        String[] strArr10 = new String[lllIlIlIll[1]];
                        strArr10[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[112]];
                        if (llIIIllIIllll(Inventory.contains(strArr10) ? 1 : 0)) {
                            int[] iArr2 = new int[lllIlIlIll[1]];
                            iArr2[lllIlIlIll[0]] = lllIlIlIll[25];
                            if (llIIIllIIllll(Inventory.contains(iArr2) ? 1 : 0)) {
                                String[] strArr11 = new String[lllIlIlIll[1]];
                                strArr11[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[113]];
                                if (llIIIllIIllll(Inventory.contains(strArr11) ? 1 : 0)) {
                                    String[] strArr12 = new String[lllIlIlIll[1]];
                                    strArr12[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[114]];
                                    if (llIIIllIlIlII(Inventory.getAll(strArr12).size(), lllIlIlIll[13]) && (!llIIIllIlIIIl(Inventory.contains(C0005f.aM) ? 1 : 0) || llIIIllIIllll(Equipment.contains(C0005f.aM) ? 1 : 0))) {
                                        ?? r02 = lllIlIlIll[1];
                                        "".length();
                                        return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return lllIlIlIll[0];
        } else if (llIIIllIlIlII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[16]) && llIIIllIlIIII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[57])) {
            String[] strArr13 = new String[lllIlIlIll[1]];
            strArr13[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[115]];
            if (llIIIllIIllll(Inventory.contains(strArr13) ? 1 : 0)) {
                String[] strArr14 = new String[lllIlIlIll[1]];
                strArr14[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[116]];
                if (llIIIllIIllll(Inventory.contains(strArr14) ? 1 : 0)) {
                    String[] strArr15 = new String[lllIlIlIll[1]];
                    strArr15[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[117]];
                    if (llIIIllIIllll(Inventory.contains(strArr15) ? 1 : 0)) {
                        int[] iArr3 = new int[lllIlIlIll[1]];
                        iArr3[lllIlIlIll[0]] = lllIlIlIll[21];
                        if (llIIIllIIllll(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lllIlIlIll[1]];
                            iArr4[lllIlIlIll[0]] = lllIlIlIll[21];
                            if (llIIIllIlIlII(Inventory.getAll(iArr4).size(), lllIlIlIll[5]) && (!llIIIllIlIIIl(Inventory.contains(C0005f.aM) ? 1 : 0) || llIIIllIIllll(Equipment.contains(C0005f.aM) ? 1 : 0))) {
                                ?? r03 = lllIlIlIll[1];
                                "".length();
                                return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
                            }
                        }
                    }
                }
            }
            return lllIlIlIll[0];
        } else if (llIIIllIlIlII(Skills.getLevel(Skill.CONSTRUCTION), lllIlIlIll[57])) {
            String[] strArr16 = new String[lllIlIlIll[1]];
            strArr16[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[118]];
            if (llIIIllIIllll(Inventory.contains(strArr16) ? 1 : 0)) {
                String[] strArr17 = new String[lllIlIlIll[1]];
                strArr17[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[119]];
                if (llIIIllIIllll(Inventory.contains(strArr17) ? 1 : 0)) {
                    String[] strArr18 = new String[lllIlIlIll[1]];
                    strArr18[lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[120]];
                    if (llIIIllIIllll(Inventory.contains(strArr18) ? 1 : 0)) {
                        int[] iArr5 = new int[lllIlIlIll[1]];
                        iArr5[lllIlIlIll[0]] = lllIlIlIll[21];
                        if (llIIIllIIllll(Inventory.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lllIlIlIll[1]];
                            iArr6[lllIlIlIll[0]] = lllIlIlIll[21];
                            if (llIIIllIlIlII(Inventory.getAll(iArr6).size(), lllIlIlIll[13]) && (!llIIIllIlIIIl(Inventory.contains(C0005f.aM) ? 1 : 0) || llIIIllIIllll(Equipment.contains(C0005f.aM) ? 1 : 0))) {
                                ?? r04 = lllIlIlIll[1];
                                "".length();
                                return ((33 ^ 52) & ((119 ^ 98) ^ (-1))) > ((88 ^ 22) & ((78 ^ 0) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r04;
                            }
                        }
                    }
                }
            }
            return lllIlIlIll[0];
        } else {
            return lllIlIlIll[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    static boolean dK() {
        int[] iArr = new int[lllIlIlIll[1]];
        iArr[lllIlIlIll[0]] = lllIlIlIll[100];
        if (llIIIllIlIIlI(TileObjects.getNearest(iArr))) {
            int[] iArr2 = new int[lllIlIlIll[1]];
            iArr2[lllIlIlIll[0]] = lllIlIlIll[102];
            if (llIIIllIlIIlI(TileObjects.getNearest(iArr2))) {
                ?? r0 = lllIlIlIll[1];
                "".length();
                return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lllIlIlIll[0];
    }

    private static void llIIIllIIllIl() {
        lllIlIlIIl = new String[lllIlIlIll[142]];
        lllIlIlIIl[lllIlIlIll[0]] = llIIIlIlllllI("WVZHx55F/ho2Jwv7ULUxZQ==", "oaGik");
        lllIlIlIIl[lllIlIlIll[1]] = llIIIlIllllll("Ew8rLzQ9AyFmJSAfLCggdQ8xIyomSmU1MDwSJi4uOwFlJCY2DWUyKHUFKig0IRQwJTM8CSs=", "UfEFG");
        lllIlIlIIl[lllIlIlIll[2]] = llIIIlIlllllI("9Q8YPykzmt5+HC/7azI1kLPL3TDcwjAO", "hCWLw");
        lllIlIlIIl[lllIlIlIll[3]] = llIIIlIlllllI("ZP1KLkK+qnTY+ZFQh3sQwQ==", "swdcg");
        lllIlIlIIl[lllIlIlIll[5]] = llIIIlIllllll("FBA1KA==", "CuTZk");
        lllIlIlIIl[lllIlIlIll[6]] = llIIIllIIIIII("e5HkNt6l5tuE6AW1y/nWyQ9wFNqIH3cP", "Riqtn");
        lllIlIlIIl[lllIlIlIll[9]] = llIIIllIIIIII("5FA4oM0moQoY5XjleO+Nrw0eCuO7a9BfLm9orClyMZLO+AoP0pl+AaLl9hBxaUYq", "LjhjX");
        lllIlIlIIl[lllIlIlIll[11]] = llIIIllIIIIII("j5YIsS1sh4B8ZIxpuk41EA2Op2JFOT89r0Om2T9eNwHbL63RU6UsGg==", "HpuSx");
        lllIlIlIIl[lllIlIlIll[13]] = llIIIlIllllll("HChKJBkubQcsGDgkBCJLIywHKA45YUo2HCI5CS0CJSpKMQRrDz8cIgUK", "KMjEk");
        lllIlIlIIl[lllIlIlIll[15]] = llIIIllIIIIII("y4i5YXK2quIsmATPMDK3WeQ7i/16IOMIEc5/BjW0FfE2PKXoHnNrNsn2qo2t5rIe", "VMoby");
        lllIlIlIIl[lllIlIlIll[18]] = llIIIllIIIIII("VLwqEcJ+D3/ANtrH0gEj8TQqsH6GIekdV5yXPAHVRbwr/K+0WJ5DG5RhjJaZSp9e", "cnOxS");
        lllIlIlIIl[lllIlIlIll[20]] = llIIIlIllllll("GyBMAzMpZQELMj8sAgVhPCkNDCpgZR8VKDgmBAsvK2UYDWEOEDUrDws=", "LElbA");
        lllIlIlIIl[lllIlIlIll[22]] = llIIIlIllllll("JB11KyAWWDgjIQAROy1yHBk+aiIfGTshIV9YJj07Bxs9IzwUWCElcjEtDAMcNA==", "sxUJR");
        lllIlIlIIl[lllIlIlIll[29]] = llIIIllIIIIII("EGubGVPnTgv0tDzqIGxgSQ==", "OXKCM");
        lllIlIlIIl[lllIlIlIll[30]] = llIIIlIlllllI("CE7x4qxHkq0=", "wuolO");
        lllIlIlIIl[lllIlIlIll[32]] = llIIIllIIIIII("apH+1nysRt90rXRO/06G2dzOdpPxMpd1", "xaWjA");
        lllIlIlIIl[lllIlIlIll[33]] = llIIIllIIIIII("GAwoJc5ZooaQusRXcndOTQ==", "mHScJ");
        lllIlIlIIl[lllIlIlIll[34]] = llIIIlIllllll("Hyc6JAU/dC8iFDQg", "ZTNEq");
        lllIlIlIIl[lllIlIlIll[36]] = llIIIlIlllllI("5/BRBQl8f01+hZDg+7oIPw==", "rEieB");
        lllIlIlIIl[lllIlIlIll[37]] = llIIIlIllllll("DAQNNTxuHAs9PQ==", "NqdYX");
        lllIlIlIIl[lllIlIlIll[39]] = llIIIlIlllllI("+nYAYT/67uymapj/2XQsBQ==", "OXGUi");
        lllIlIlIIl[lllIlIlIll[40]] = llIIIlIllllll("DRUdORo=", "OgxXq");
        lllIlIlIIl[lllIlIlIll[41]] = llIIIllIIIIII("LvHgtH7T+LVZSI+Xdvyv4sbe3tMDsD2r", "mTTSX");
        lllIlIlIIl[lllIlIlIll[16]] = llIIIllIIIIII("UUfL5vPvziI=", "sJKWu");
        lllIlIlIIl[lllIlIlIll[43]] = llIIIllIIIIII("r77Nrakq7l/p0ueeN+kVBg==", "ocwiU");
        lllIlIlIIl[lllIlIlIll[46]] = llIIIlIllllll("BTsPBx4=", "GNfkz");
        lllIlIlIIl[lllIlIlIll[48]] = llIIIlIllllll("MS40BAMKJT4=", "cKYku");
        lllIlIlIIl[lllIlIlIll[49]] = llIIIlIllllll("CgQLBxA9", "Xafhf");
        lllIlIlIIl[lllIlIlIll[27]] = llIIIlIllllll("HQQY", "Dakmt");
        lllIlIlIIl[lllIlIlIll[51]] = llIIIllIIIIII("06+n1N+FRyLBny396r0q4VWr7wnqJ/Jc", "pkcSQ");
        lllIlIlIIl[lllIlIlIll[53]] = llIIIlIlllllI("F04O8e+oqnQ=", "gwTLZ");
        lllIlIlIIl[lllIlIlIll[55]] = llIIIlIllllll("Oh0XISwBFh0=", "hxzNZ");
        lllIlIlIIl[lllIlIlIll[56]] = llIIIlIlllllI("FQYTXBcqG2c=", "CXHQx");
        lllIlIlIIl[lllIlIlIll[57]] = llIIIlIlllllI("nkdsfNDbabQ=", "fIZDF");
        lllIlIlIIl[lllIlIlIll[58]] = llIIIlIllllll("Ejc+CyxwLTYMaCQjNQst", "PBWgH");
        lllIlIlIIl[lllIlIlIll[61]] = llIIIlIllllll("CjMRKDM=", "HFxDW");
        lllIlIlIIl[lllIlIlIll[63]] = llIIIlIlllllI("Xl4BSl+8P9Fyeve32K8TvA==", "xbVik");
        lllIlIlIIl[lllIlIlIll[64]] = llIIIllIIIIII("X7+y+rl/gDM=", "oWxaS");
        lllIlIlIIl[lllIlIlIll[65]] = llIIIllIIIIII("80ayQf9Z3ow=", "eXaUv");
        lllIlIlIIl[lllIlIlIll[66]] = llIIIlIllllll("Ozs4CC1ZITAPaRUvIwAsCw==", "yNQdI");
        lllIlIlIIl[lllIlIlIll[67]] = llIIIlIlllllI("yzWVRhGE9iQ=", "CHxLg");
        lllIlIlIIl[lllIlIlIll[68]] = llIIIlIllllll("OjotLjw=", "xODBX");
        lllIlIlIIl[lllIlIlIll[70]] = llIIIlIllllll("GRAeBA8iGxQ=", "Kusky");
        lllIlIlIIl[lllIlIlIll[71]] = llIIIllIIIIII("7TG/EQndeJM=", "MzHuO");
        lllIlIlIIl[lllIlIlIll[72]] = llIIIllIIIIII("9HNGwJG/3zg=", "rrwyk");
        lllIlIlIIl[lllIlIlIll[73]] = llIIIlIllllll("KSU+Ax0CPjBPCwQ/Ohw=", "kPWoy");
        lllIlIlIIl[lllIlIlIll[77]] = llIIIlIlllllI("zFyJxJkNgRjIO8FOx9fEIVVo7osrMhvO", "gKNdI");
        lllIlIlIIl[lllIlIlIll[79]] = llIIIlIlllllI("PCBA6NoytsY=", "vIApp");
        lllIlIlIIl[lllIlIlIll[81]] = llIIIlIllllll("LQwdJw==", "icsBN");
        lllIlIlIIl[lllIlIlIll[83]] = llIIIlIllllll("KgscTSgEABU=", "koxmZ");
        lllIlIlIIl[lllIlIlIll[84]] = llIIIlIllllll("AAsCFBsuDA==", "Kbvws");
        lllIlIlIIl[lllIlIlIll[85]] = llIIIlIllllll("IzYCNA==", "gYlQa");
        lllIlIlIIl[lllIlIlIll[87]] = llIIIlIllllll("Aj0zBQEkIGsIGS4xLRwcMjc=", "ARFku");
        lllIlIlIIl[lllIlIlIll[88]] = llIIIlIllllll("FQM9Nw==", "QlSRA");
        lllIlIlIIl[lllIlIlIll[89]] = llIIIllIIIIII("l8aG/7Ffqa3yzLEh7sh2LZLTW44e6nfq", "oBudo");
        lllIlIlIIl[lllIlIlIll[90]] = llIIIlIllllll("Az8iGgAn", "UVGme");
        lllIlIlIIl[lllIlIlIll[91]] = llIIIllIIIIII("GbT0ADDndXI=", "LSlge");
        lllIlIlIIl[lllIlIlIll[93]] = llIIIllIIIIII("lwdmB/xpiXck86Wk08739Q==", "wigSx");
        lllIlIlIIl[lllIlIlIll[94]] = llIIIllIIIIII("YXmj7Nnnq5mDQjc4ppRPYA==", "MEJvV");
        lllIlIlIIl[lllIlIlIll[95]] = llIIIlIllllll("MwUjHw==", "wjMzu");
        lllIlIlIIl[lllIlIlIll[96]] = llIIIlIlllllI("4xAXYk/Qgjl1BPtLD9+PEiZhTdQDhoGl", "olOdq");
        lllIlIlIIl[lllIlIlIll[97]] = llIIIlIllllll("BigoCw==", "BGFnW");
        lllIlIlIIl[lllIlIlIll[86]] = llIIIllIIIIII("U+xuFKQc808=", "VPQey");
        lllIlIlIIl[lllIlIlIll[98]] = llIIIlIlllllI("4jsZDfV5NBckrwnDdvoqGAOXogEUhgUV", "VlQdM");
        lllIlIlIIl[lllIlIlIll[99]] = llIIIlIlllllI("kDG2QQJuYzM=", "WBdKp");
        lllIlIlIIl[lllIlIlIll[80]] = llIIIllIIIIII("YD3lCWjkQQ17vCW/5VMpzw==", "KweOd");
        lllIlIlIIl[lllIlIlIll[104]] = llIIIlIlllllI("6AyH/lesP28va0ESXGLU7ZyRUH7Tcmx7", "CxEID");
        lllIlIlIIl[lllIlIlIll[105]] = llIIIlIllllll("BC4/", "WOHje");
        lllIlIlIIl[lllIlIlIll[106]] = llIIIllIIIIII("A0QOZbEZo50=", "bYdbS");
        lllIlIlIIl[lllIlIlIll[107]] = llIIIlIlllllI("ps1dlcrDgu4=", "ZraPK");
        lllIlIlIIl[lllIlIlIll[108]] = llIIIllIIIIII("Ihv3TEQblDo=", "qcLBe");
        lllIlIlIIl[lllIlIlIll[109]] = llIIIlIllllll("LAA9D1gLEzsNCw==", "erRax");
        lllIlIlIIl[lllIlIlIll[110]] = llIIIlIlllllI("U40sFeW6Fxf9U5WwfoXUvvv7f9T7V+fv", "UGudt");
        lllIlIlIIl[lllIlIlIll[111]] = llIIIlIlllllI("dBk8PZuV+hc=", "ktzqW");
        lllIlIlIIl[lllIlIlIll[112]] = llIIIlIllllll("BjIMKyI8", "NSaFG");
        lllIlIlIIl[lllIlIlIll[113]] = llIIIlIlllllI("2hrTF/dqX6s=", "OtyYH");
        lllIlIlIIl[lllIlIlIll[114]] = llIIIllIIIIII("HtAjVMEFI7U=", "NkBdv");
        lllIlIlIIl[lllIlIlIll[115]] = llIIIlIlllllI("/77HE7Tw8iP/smUGhbnj/DI+h52SbXPm", "NjqsV");
        lllIlIlIIl[lllIlIlIll[116]] = llIIIlIllllll("EBA1", "CqBcX");
        lllIlIlIIl[lllIlIlIll[117]] = llIIIlIllllll("PyAJBAkF", "wAdil");
        lllIlIlIIl[lllIlIlIll[118]] = llIIIllIIIIII("1b+ORL4mjjRqpa2/5LBcfSlCGEE6fg4/", "azqsT");
        lllIlIlIIl[lllIlIlIll[119]] = llIIIlIlllllI("nhkuJSrubpc=", "MzFpu");
        lllIlIlIIl[lllIlIlIll[120]] = llIIIlIllllll("MjgIFSMI", "zYexF");
        lllIlIlIIl[lllIlIlIll[92]] = llIIIlIllllll("Bxg0PiU2Ajk5OCsZ", "DwZMQ");
        lllIlIlIIl[lllIlIlIll[135]] = llIIIlIllllll("PTg8DGogN3IcLy49JgNqZw==", "OQRkJ");
        lllIlIlIIl[lllIlIlIll[136]] = llIIIllIIIIII("9bcUM+JUcacc273G/g6qTK63Yx9bJxCT", "LZoRj");
        lllIlIlIIl[lllIlIlIll[137]] = llIIIlIlllllI("vrCxIIcMUvQqotlGXpn8ZSTG4RwnmcZ2", "CXmad");
        lllIlIlIIl[lllIlIlIll[140]] = llIIIllIIIIII("X36iaKdLchxwYozN2bmOEH3hMV3vjD8d", "ufekI");
        lllIlIlIIl[lllIlIlIll[141]] = llIIIlIlllllI("EGAu9B+Jx41F/GA0V8o/Fg==", "aRRRO");
    }

    private static void dH() {
        if (llIIIllIIllll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIIIllIlIIlI(Widgets.get(lllIlIlIll[76], lllIlIlIll[55]))) {
            Widgets.get(lllIlIlIll[76], lllIlIlIll[55]).interact(lllIlIlIIl[lllIlIlIll[98]]);
            Time.sleepTicks(lllIlIlIll[2]);
            "".length();
        }
        if (llIIIllIlIIlI(Widgets.get(lllIlIlIll[78], lllIlIlIll[6]))) {
            Widgets.get(lllIlIlIll[78], lllIlIlIll[6]).interact(lllIlIlIIl[lllIlIlIll[99]]);
            Time.sleepTicks(lllIlIlIll[5]);
            "".length();
        }
    }
}
