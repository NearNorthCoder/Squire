package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.aa  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/aa.class */
public class aa implements S {
    private final /* synthetic */ int jz = lIIIIIIllII[0];
    static final /* synthetic */ WorldPoint jx;
    public static final /* synthetic */ WorldPoint jv;
    static final /* synthetic */ WorldPoint jw;
    public static final /* synthetic */ WorldPoint ju;
    public static final /* synthetic */ WorldPoint js;
    public static final /* synthetic */ WorldPoint jt;
    private static /* synthetic */ String[] lIIIIIIlIll;
    public static /* synthetic */ List<C0003d> bu;
    static final /* synthetic */ WorldPoint jy;
    public static /* synthetic */ boolean bs;
    private static /* synthetic */ int[] lIIIIIIllII;

    private static boolean llIlllIIIIIll(int i) {
        return i > 0;
    }

    private static String llIllIlllllII(String lllllllllllllllllIIllllIlllIIIll, String lllllllllllllllllIIllllIlllIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIllllIlllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIIllllIlllIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIIllllIlllIIlIl.init(lIIIIIIllII[3], secretKeySpec);
            return new String(lllllllllllllllllIIllllIlllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIllllIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIIllllIlllIIlII) {
            lllllllllllllllllIIllllIlllIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIlllllll(int i) {
        return i != 0;
    }

    private static boolean llIlllIIIIllI(int i, int i2) {
        return i <= i2;
    }

    static {
        llIllIllllllI();
        llIllIlllllIl();
        js = new WorldPoint(lIIIIIIllII[78], lIIIIIIllII[79], lIIIIIIllII[1]);
        jt = new WorldPoint(lIIIIIIllII[80], lIIIIIIllII[81], lIIIIIIllII[1]);
        ju = new WorldPoint(lIIIIIIllII[82], lIIIIIIllII[83], lIIIIIIllII[1]);
        jv = new WorldPoint(lIIIIIIllII[84], lIIIIIIllII[43], lIIIIIIllII[1]);
        jw = new WorldPoint(lIIIIIIllII[1], lIIIIIIllII[1], lIIIIIIllII[1]);
        jx = new WorldPoint(lIIIIIIllII[1], lIIIIIIllII[1], lIIIIIIllII[1]);
        jy = new WorldPoint(lIIIIIIllII[85], lIIIIIIllII[86], lIIIIIIllII[1]);
        bu = new ArrayList();
    }

    private static void llIllIllllllI() {
        lIIIIIIllII = new int[88];
        lIIIIIIllII[0] = (-((-16387) & 31175)) & (-17441) & 32764;
        lIIIIIIllII[1] = ((179 ^ 174) ^ (25 ^ 60)) & (((((40 + 28) - 44) + 139) ^ (((127 + 123) - 169) + 74)) ^ (-" ".length()));
        lIIIIIIllII[2] = " ".length();
        lIIIIIIllII[3] = "  ".length();
        lIIIIIIllII[4] = "   ".length();
        lIIIIIIllII[5] = (-3105) & 8104;
        lIIIIIIllII[6] = 65 ^ 69;
        lIIIIIIllII[7] = (-((-19459) & 27987)) & (-2049) & 31742;
        lIIIIIIllII[8] = (-2213) & 14837;
        lIIIIIIllII[9] = (-5125) & 6119;
        lIIIIIIllII[10] = (-16475) & 26974;
        lIIIIIIllII[11] = ((56 + 42) - (-55)) + 47;
        lIIIIIIllII[12] = 14 ^ 60;
        lIIIIIIllII[13] = (209 ^ 160) ^ (254 ^ 138);
        lIIIIIIllII[14] = 20 ^ 0;
        lIIIIIIllII[15] = (((65 + 94) - 154) + 127) ^ (((94 + 23) - 85) + 98);
        lIIIIIIllII[16] = -" ".length();
        lIIIIIIllII[17] = (120 ^ 63) ^ (121 ^ 57);
        lIIIIIIllII[18] = 157 ^ 149;
        lIIIIIIllII[19] = 172 ^ 165;
        lIIIIIIllII[20] = 151 ^ 154;
        lIIIIIIllII[21] = (111 ^ 32) ^ (216 ^ 157);
        lIIIIIIllII[22] = (-16386) & 19413;
        lIIIIIIllII[23] = (-24825) & 28666;
        lIIIIIIllII[24] = (-4098) & 7123;
        lIIIIIIllII[25] = (-(90 ^ 95)) & (-20481) & 24319;
        lIIIIIIllII[26] = (-28693) & 31711;
        lIIIIIIllII[27] = (-((-4724) & 29559)) & (-4097) & 32763;
        lIIIIIIllII[28] = (-((-3171) & 7291)) & (-24609) & 31743;
        lIIIIIIllII[29] = (-((-19473) & 32025)) & (-16385) & 32765;
        lIIIIIIllII[30] = (-25641) & 28650;
        lIIIIIIllII[31] = (-20737) & 24561;
        lIIIIIIllII[32] = (-17411) & 20415;
        lIIIIIIllII[33] = (-16386) & 20207;
        lIIIIIIllII[34] = (-28737) & 31735;
        lIIIIIIllII[35] = (-28945) & 32762;
        lIIIIIIllII[36] = (-((-25699) & 29811)) & (-1) & 7103;
        lIIIIIIllII[37] = (-261) & 4079;
        lIIIIIIllII[38] = (-((-1127) & 29823)) & (-1089) & 32767;
        lIIIIIIllII[39] = (-((-642) & 22219)) & (-17) & 24569;
        lIIIIIIllII[40] = (-((-18954) & 28271)) & (-1) & 12287;
        lIIIIIIllII[41] = (((25 + 148) - 149) + 163) ^ (((47 + 34) - 30) + 125);
        lIIIIIIllII[42] = (-29769) & 32731;
        lIIIIIIllII[43] = (-4116) & 7935;
        lIIIIIIllII[44] = 89 ^ 85;
        lIIIIIIllII[45] = (-((-17865) & 26105)) & (-65) & 11263;
        lIIIIIIllII[46] = 154 ^ 148;
        lIIIIIIllII[47] = 110 ^ 97;
        lIIIIIIllII[48] = (88 ^ 67) ^ (63 ^ 52);
        lIIIIIIllII[49] = (55 ^ 17) ^ (142 ^ 185);
        lIIIIIIllII[50] = (-19591) & 20127;
        lIIIIIIllII[51] = (15 ^ 82) ^ (211 ^ 156);
        lIIIIIIllII[52] = 179 ^ 160;
        lIIIIIIllII[53] = 92 ^ 73;
        lIIIIIIllII[54] = " ".length() ^ (41 ^ 62);
        lIIIIIIllII[55] = (((100 + 126) - 129) + 44) ^ (((58 + 7) - (-21)) + 68);
        lIIIIIIllII[56] = 77 ^ 85;
        lIIIIIIllII[57] = 152 ^ 129;
        lIIIIIIllII[58] = (45 ^ 25) ^ (183 ^ 153);
        lIIIIIIllII[59] = 0 ^ 27;
        lIIIIIIllII[60] = 152 ^ 132;
        lIIIIIIllII[61] = 22 ^ 11;
        lIIIIIIllII[62] = 37 ^ 59;
        lIIIIIIllII[63] = (-1292) & 4091;
        lIIIIIIllII[64] = (-20755) & 32734;
        lIIIIIIllII[65] = (-5206) & 30205;
        lIIIIIIllII[66] = (-((-6119) & 30703)) & (-145) & 32735;
        lIIIIIIllII[67] = (((8 + 38) - (-11)) + 78) ^ (((40 + 167) - 137) + 105);
        lIIIIIIllII[68] = (-9290) & 10189;
        lIIIIIIllII[69] = (-((-8209) & 12977)) & (-1) & 278510;
        lIIIIIIllII[70] = 52 ^ 8;
        lIIIIIIllII[71] = 13 ^ 32;
        lIIIIIIllII[72] = (-((-19367) & 32703)) & (-16389) & 30174;
        lIIIIIIllII[73] = (-3720) & 65231;
        lIIIIIIllII[74] = (((40 + 178) - 172) + 177) ^ (((79 + 90) - 37) + 55);
        lIIIIIIllII[75] = 169 ^ 182;
        lIIIIIIllII[76] = 255 ^ 156;
        lIIIIIIllII[77] = 149 ^ 181;
        lIIIIIIllII[78] = (-17409) & 20437;
        lIIIIIIllII[79] = (-((-19713) & 24043)) & (-8193) & 16366;
        lIIIIIIllII[80] = (-12362) & 15355;
        lIIIIIIllII[81] = (-((-5421) & 30015)) & (-4101) & 32511;
        lIIIIIIllII[82] = (-5234) & 8183;
        lIIIIIIllII[83] = (-((-17093) & 29639)) & (-16385) & 32751;
        lIIIIIIllII[84] = (-((-71) & 17519)) & (-12305) & 32700;
        lIIIIIIllII[85] = (-((-3093) & 3669)) & (-4490) & 8159;
        lIIIIIIllII[86] = (-24589) & 28079;
        lIIIIIIllII[87] = 81 ^ 112;
    }

    private static boolean llIlllIIIIIlI(Object obj) {
        return obj != null;
    }

    private static boolean llIlllIIIIlII(int i, int i2) {
        return i > i2;
    }

    private static boolean llIlllIIIIlll(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIlllIIIIIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIlllIIIIlll(Skills.getLevel(Skill.PRAYER), lIIIIIIllII[76])) {
            ?? r0 = lIIIIIIllII[2];
            "".length();
            return ((114 ^ 12) ^ (122 ^ 0)) <= "  ".length() ? ((92 ^ 81) ^ (92 ^ 86)) & (((((11 + 13) - 13) + 121) ^ (((35 + 4) - (-35)) + 57)) ^ (-" ".length())) : r0;
        }
        return lIIIIIIllII[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lIIIIIIllII[1];
    }

    private static boolean llIlllIIIIIII(int i, int i2) {
        return i < i2;
    }

    private static void llIllIlllllIl() {
        lIIIIIIlIll = new String[lIIIIIIllII[87]];
        lIIIIIIlIll[lIIIIIIllII[1]] = llIllIllllIlI("FRgYPyowTQgiIToe", "WmaVD");
        lIIIIIIlIll[lIIIIIIllII[2]] = llIllIllllIll("4PE7xi0knfRehYDUV51B5xPC29bzN+qfkRhUUBoI9XB3W/7oAFjDxbkLaoDW4sHT", "McDjU");
        lIIIIIIlIll[lIIIIIIllII[3]] = llIllIllllIlI("ACkuIB8vPDEnH248N2kaLyYz", "NHXIx");
        lIIIIIIlIll[lIIIIIIllII[4]] = llIllIllllIlI("Bio6CQAnJTNNDi8lPwQCKQ==", "NKTml");
        lIIIIIIlIll[lIIIIIIllII[6]] = llIllIlllllII("qfWagQmReq7fv3aoAAnc+c10UiV1QVHOeSUDPjRLjz6qz3VqGUvAUT19C8wZGvvXZlPTTvQJEys=", "iIpkD");
        lIIIIIIlIll[lIIIIIIllII[13]] = llIllIllllIll("uESEDamzZQI=", "hMiVa");
        lIIIIIIlIll[lIIIIIIllII[15]] = llIllIllllIlI("IwgEBG0DAkgWJBsJEQ==", "wmhaM");
        lIIIIIIlIll[lIIIIIIllII[17]] = llIllIllllIll("TR2H7Ik9bQM=", "LzYbG");
        lIIIIIIlIll[lIIIIIIllII[18]] = llIllIlllllII("VMZ6H1RZytes4QRt6oBUmQ==", "rMABL");
        lIIIIIIlIll[lIIIIIIllII[19]] = llIllIllllIlI("KjIHEWlFLQMEIBU2FBxlETZGBCATPApIcVR5MQEpATwUBiAWKkg=", "eYfhE");
        lIIIIIIlIll[lIIIIIIllII[21]] = llIllIlllllII("ei+lCBmVU13Q0d6RVAnidA==", "WrObr");
        lIIIIIIlIll[lIIIIIIllII[41]] = llIllIllllIlI("R2wGPQgdbAImCg8=", "vLrTk");
        lIIIIIIlIll[lIIIIIIllII[44]] = llIllIllllIll("aMmEnz0OxWSIVhIahuq9Yg==", "Lzdoq");
        lIIIIIIlIll[lIIIIIIllII[20]] = llIllIlllllII("f33WNTl/M7nr5WW4MUBD/Q==", "BWNIA");
        lIIIIIIlIll[lIIIIIIllII[46]] = llIllIllllIlI("CD4tLw==", "GNHAA");
        lIIIIIIlIll[lIIIIIIllII[47]] = llIllIlllllII("VXbF2djNXvA=", "MwvXp");
        lIIIIIIlIll[lIIIIIIllII[48]] = llIllIllllIll("Dx3b/ALQY9Y=", "BFQtV");
        lIIIIIIlIll[lIIIIIIllII[49]] = llIllIllllIll("6yi7JfXX7aTcWD7IXc6ehg==", "TafPm");
        lIIIIIIlIll[lIIIIIIllII[51]] = llIllIlllllII("GpzCzN1ElPX8prI+EXNcBw==", "yZBCH");
        lIIIIIIlIll[lIIIIIIllII[52]] = llIllIllllIll("nWM67pNyELHpV7kl8uwIFg==", "sBWJm");
        lIIIIIIlIll[lIIIIIIllII[14]] = llIllIlllllII("7Jm155quZvqXVKd2yprPeVBP/w59222l", "qGHYy");
        lIIIIIIlIll[lIIIIIIllII[53]] = llIllIllllIll("QN+OXmRZWczT7j/C/LrT/w==", "MLMbx");
        lIIIIIIlIll[lIIIIIIllII[54]] = llIllIllllIlI("CwQ/Pg==", "DtZPt");
        lIIIIIIlIll[lIIIIIIllII[55]] = llIllIlllllII("0HvlXqdvumk=", "ivMOy");
        lIIIIIIlIll[lIIIIIIllII[56]] = llIllIllllIlI("GBEJLw==", "WalAT");
        lIIIIIIlIll[lIIIIIIllII[57]] = llIllIllllIll("L2+yD+KjzTl6R2fExiJaSA==", "rcMrJ");
        lIIIIIIlIll[lIIIIIIllII[58]] = llIllIlllllII("pLDf0J+phbEUegO0SgIMsg==", "xCZvP");
        lIIIIIIlIll[lIIIIIIllII[59]] = llIllIllllIlI("Nz4sGiQcISpSBB4q", "rFOrE");
        lIIIIIIlIll[lIIIIIIllII[60]] = llIllIlllllII("VHkk9BQRtjbgY7kvYp1qqQ==", "piqSV");
        lIIIIIIlIll[lIIIIIIllII[61]] = llIllIllllIll("j6//AHFBxUYMnJIlQuEEPg==", "pIIkS");
        lIIIIIIlIll[lIIIIIIllII[62]] = llIllIlllllII("8wCsQe8bWUE=", "MCtwH");
        lIIIIIIlIll[lIIIIIIllII[75]] = llIllIllllIll("nBtpShlrp3Akl1YzzI7zwg==", "qoiLX");
        lIIIIIIlIll[lIIIIIIllII[77]] = llIllIllllIlI("GC0LAmoFIkUSLwsoEQ1qQg==", "jDeeJ");
    }

    private static String llIllIllllIll(String lllllllllllllllllIIllllIllIlIllI, String lllllllllllllllllIIllllIllIlIlIl) {
        try {
            SecretKeySpec lllllllllllllllllIIllllIllIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIllllIllIlIlIl.getBytes(StandardCharsets.UTF_8)), lIIIIIIllII[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIllII[3], lllllllllllllllllIIllllIllIllIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIllllIllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIIllllIllIlIIlI) {
            lllllllllllllllllIIllllIllIlIIlI.printStackTrace();
            return null;
        }
    }

    private static void ae() {
        int[] iArr = new int[lIIIIIIllII[2]];
        iArr[lIIIIIIllII[1]] = lIIIIIIllII[8];
        if (llIlllIIIIIIl(Bank.contains(iArr) ? 1 : 0)) {
            bu.add(new C0003d(lIIIIIIllII[8], lIIIIIIllII[13], C0008i.bp));
            "".length();
        }
        int[] iArr2 = new int[lIIIIIIllII[2]];
        iArr2[lIIIIIIllII[1]] = lIIIIIIllII[0];
        if (llIlllIIIIIIl(Bank.contains(iArr2) ? 1 : 0)) {
            bu.add(new C0003d(lIIIIIIllII[0], eB(), lIIIIIIllII[63]));
            "".length();
        }
        int[] iArr3 = new int[lIIIIIIllII[2]];
        iArr3[lIIIIIIllII[1]] = lIIIIIIllII[7];
        if (llIlllIIIIIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bu.add(new C0003d(lIIIIIIllII[7], lIIIIIIllII[3], lIIIIIIllII[5]));
            "".length();
        }
        if (llIlllIIIIIIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIIIIlIll[lIIIIIIllII[77]]);
        }) ? 1 : 0)) {
            bu.add(new C0003d(lIIIIIIllII[64], lIIIIIIllII[13], lIIIIIIllII[65]));
            "".length();
        }
        int[] iArr4 = new int[lIIIIIIllII[2]];
        iArr4[lIIIIIIllII[1]] = lIIIIIIllII[66];
        if (llIlllIIIIIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(lIIIIIIllII[66], lIIIIIIllII[67], lIIIIIIllII[68]));
            "".length();
        }
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            eA();
            "".length();
            if ((-"   ".length()) >= 0) {
                return (18 ^ 88) & ((239 ^ 165) ^ (-1));
            }
        } catch (Exception e2) {
        }
        return lIIIIIIllII[74];
    }

    private static int eB() {
        return (llIlllIIIIIII(Skills.getLevel(Skill.PRAYER), lIIIIIIllII[70]) && llIlllIIIIlll(Skills.getLevel(Skill.PRAYER), lIIIIIIllII[71])) ? ((lIIIIIIllII[69] - Skills.getExperience(Skill.PRAYER)) / lIIIIIIllII[72]) + lIIIIIIllII[21] : ((lIIIIIIllII[73] - Skills.getExperience(Skill.PRAYER)) / lIIIIIIllII[72]) + lIIIIIIllII[62];
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lIIIIIIlIll[lIIIIIIllII[75]];
    }

    private static boolean llIlllIIIIlIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v310, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v334, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v65, types: [boolean] */
    public static void eA() {
        if (llIllIlllllll(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[1]];
            C0001b.a(bu);
            if (llIlllIIIIIII(bu.size(), lIIIIIIllII[2])) {
                System.out.println(lIIIIIIlIll[lIIIIIIllII[2]]);
                bs = lIIIIIIllII[1];
            }
        }
        if (llIlllIIIIIIl(bs ? 1 : 0)) {
            if (llIlllIIIIIIl(aa() ? 1 : 0) && llIlllIIIIIII(Game.getWildyLevel(), lIIIIIIllII[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlllIIIIIlI(nearest) && llIlllIIIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[3]];
                    C0000a.a(nearest);
                }
                if (llIlllIIIIIlI(nearest) && llIllIlllllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[4]];
                    if (llIlllIIIIIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIIIllII[5]);
                        "".length();
                    }
                    if (llIllIlllllll(Bank.isOpen() ? 1 : 0)) {
                        if (llIlllIIIIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIIIIllII[6]);
                            "".length();
                        }
                        if (llIlllIIIIIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIIIIllII[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIIIIllII[4]];
                        iArr[lIIIIIIllII[1]] = lIIIIIIllII[7];
                        iArr[lIIIIIIllII[2]] = lIIIIIIllII[0];
                        iArr[lIIIIIIllII[3]] = lIIIIIIllII[8];
                        if (llIlllIIIIIIl(C0004e.b(iArr) ? 1 : 0)) {
                            ae();
                            System.out.println(lIIIIIIlIll[lIIIIIIllII[6]]);
                            bs = lIIIIIIllII[2];
                            return;
                        }
                        int[] iArr2 = new int[lIIIIIIllII[4]];
                        iArr2[lIIIIIIllII[1]] = lIIIIIIllII[7];
                        iArr2[lIIIIIIllII[2]] = lIIIIIIllII[0];
                        iArr2[lIIIIIIllII[3]] = lIIIIIIllII[8];
                        if (llIllIlllllll(C0004e.b(iArr2) ? 1 : 0)) {
                            if (llIlllIIIIIIl(Equipment.contains(C0005f.aZ) ? 1 : 0)) {
                                C0000a.b(C0005f.aZ, lIIIIIIllII[2]);
                            }
                            C0000a.b(C0005f.aU, lIIIIIIllII[2]);
                            C0000a.a(lIIIIIIllII[9], lIIIIIIllII[10]);
                            C0000a.b(lIIIIIIllII[0], lIIIIIIllII[11]);
                        }
                    }
                }
            }
            if (llIllIlllllll(aa() ? 1 : 0)) {
                if (llIllIlllllll(Inventory.contains(C0005f.aU) ? 1 : 0) && llIlllIIIIIII(Movement.getRunEnergy(), lIIIIIIllII[12])) {
                    Inventory.getFirst(C0005f.aU).interact(lIIIIIIlIll[lIIIIIIllII[13]]);
                    Time.sleepTicks(lIIIIIIllII[2]);
                    "".length();
                }
                if (llIlllIIIIIIl(Movement.isRunEnabled() ? 1 : 0) && llIlllIIIIlII(Movement.getRunEnergy(), lIIIIIIllII[14])) {
                    Movement.toggleRun();
                    Time.sleepTicks(lIIIIIIllII[13]);
                    "".length();
                }
                if (llIlllIIIIIII(Game.getWildyLevel(), lIIIIIIllII[2])) {
                    AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[15]];
                    if (llIllIlllllll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (llIlllIIIIIIl(Dialog.isOpen() ? 1 : 0) && llIllIlllllll(Inventory.contains(C0005f.aZ) ? 1 : 0) && llIlllIIIIlIl(Players.getLocal().getAnimation(), lIIIIIIllII[16])) {
                        Inventory.getFirst(C0005f.aZ).interact(lIIIIIIlIll[lIIIIIIllII[17]]);
                        Time.sleepTicks(lIIIIIIllII[3]);
                        "".length();
                    }
                    String[] strArr = new String[lIIIIIIllII[3]];
                    strArr[lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[18]];
                    strArr[lIIIIIIllII[2]] = lIIIIIIlIll[lIIIIIIllII[19]];
                    C0006g.a(strArr);
                }
                if (llIlllIIIIIll(Game.getWildyLevel())) {
                    int[] iArr3 = new int[lIIIIIIllII[2]];
                    iArr3[lIIIIIIllII[1]] = lIIIIIIllII[0];
                    if (llIllIlllllll(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (llIlllIIIIlII(Players.getLocal().getWorldLocation().distanceTo(ju), lIIIIIIllII[20])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[21]];
                            WorldPoint[] worldPointArr = new WorldPoint[lIIIIIIllII[20]];
                            worldPointArr[lIIIIIIllII[1]] = new WorldPoint(lIIIIIIllII[22], lIIIIIIllII[23], lIIIIIIllII[1]);
                            worldPointArr[lIIIIIIllII[2]] = new WorldPoint(lIIIIIIllII[24], lIIIIIIllII[25], lIIIIIIllII[1]);
                            worldPointArr[lIIIIIIllII[3]] = new WorldPoint(lIIIIIIllII[26], lIIIIIIllII[27], lIIIIIIllII[1]);
                            worldPointArr[lIIIIIIllII[4]] = new WorldPoint(lIIIIIIllII[28], lIIIIIIllII[29], lIIIIIIllII[1]);
                            worldPointArr[lIIIIIIllII[6]] = new WorldPoint(lIIIIIIllII[30], lIIIIIIllII[31], lIIIIIIllII[1]);
                            worldPointArr[lIIIIIIllII[13]] = new WorldPoint(lIIIIIIllII[32], lIIIIIIllII[33], lIIIIIIllII[1]);
                            worldPointArr[lIIIIIIllII[15]] = new WorldPoint(lIIIIIIllII[34], lIIIIIIllII[35], lIIIIIIllII[1]);
                            worldPointArr[lIIIIIIllII[17]] = new WorldPoint(lIIIIIIllII[36], lIIIIIIllII[37], lIIIIIIllII[1]);
                            worldPointArr[lIIIIIIllII[18]] = new WorldPoint(lIIIIIIllII[38], lIIIIIIllII[37], lIIIIIIllII[1]);
                            worldPointArr[lIIIIIIllII[19]] = new WorldPoint(lIIIIIIllII[39], lIIIIIIllII[37], lIIIIIIllII[1]);
                            worldPointArr[lIIIIIIllII[21]] = new WorldPoint(lIIIIIIllII[40], lIIIIIIllII[37], lIIIIIIllII[1]);
                            worldPointArr[lIIIIIIllII[41]] = new WorldPoint(lIIIIIIllII[42], lIIIIIIllII[43], lIIIIIIllII[1]);
                            worldPointArr[lIIIIIIllII[44]] = new WorldPoint(lIIIIIIllII[45], lIIIIIIllII[43], lIIIIIIllII[1]);
                            Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                            "".length();
                            Time.sleepTicks(lIIIIIIllII[2]);
                            "".length();
                        }
                        if (llIlllIIIIllI(Players.getLocal().getWorldLocation().distanceTo(ju), lIIIIIIllII[20])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[41]];
                            String[] strArr2 = new String[lIIIIIIllII[2]];
                            strArr2[lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[44]];
                            TileObject nearest2 = TileObjects.getNearest(strArr2);
                            String[] strArr3 = new String[lIIIIIIllII[2]];
                            strArr3[lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[20]];
                            TileObject nearest3 = TileObjects.getNearest(strArr3);
                            String[] strArr4 = new String[lIIIIIIllII[2]];
                            strArr4[lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[46]];
                            if (llIllIlllllll(nearest3.hasAction(strArr4) ? 1 : 0)) {
                                nearest3.interact(lIIIIIIlIll[lIIIIIIllII[47]]);
                            }
                            if (llIlllIIIIIlI(nearest2)) {
                                String[] strArr5 = new String[lIIIIIIllII[2]];
                                strArr5[lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[48]];
                                if (llIlllIIIIIIl(nearest3.hasAction(strArr5) ? 1 : 0)) {
                                    Skills.getExperience(Skill.PRAYER);
                                    int[] iArr4 = new int[lIIIIIIllII[2]];
                                    iArr4[lIIIIIIllII[1]] = lIIIIIIllII[0];
                                    Item first = Inventory.getFirst(iArr4);
                                    String[] strArr6 = new String[lIIIIIIllII[2]];
                                    strArr6[lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[49]];
                                    first.useOn(TileObjects.getNearest(strArr6));
                                    Time.sleepTicks(lIIIIIIllII[2]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[lIIIIIIllII[2]];
                    iArr5[lIIIIIIllII[1]] = lIIIIIIllII[0];
                    if (llIlllIIIIIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIIIIIIllII[2]];
                        iArr6[lIIIIIIllII[1]] = lIIIIIIllII[50];
                        if (llIllIlllllll(Inventory.contains(iArr6) ? 1 : 0)) {
                            if (llIlllIIIIlII(Players.getLocal().getWorldLocation().distanceTo(ju), lIIIIIIllII[20])) {
                                AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[51]];
                                WorldPoint[] worldPointArr2 = new WorldPoint[lIIIIIIllII[20]];
                                worldPointArr2[lIIIIIIllII[1]] = new WorldPoint(lIIIIIIllII[22], lIIIIIIllII[23], lIIIIIIllII[1]);
                                worldPointArr2[lIIIIIIllII[2]] = new WorldPoint(lIIIIIIllII[24], lIIIIIIllII[25], lIIIIIIllII[1]);
                                worldPointArr2[lIIIIIIllII[3]] = new WorldPoint(lIIIIIIllII[26], lIIIIIIllII[27], lIIIIIIllII[1]);
                                worldPointArr2[lIIIIIIllII[4]] = new WorldPoint(lIIIIIIllII[28], lIIIIIIllII[29], lIIIIIIllII[1]);
                                worldPointArr2[lIIIIIIllII[6]] = new WorldPoint(lIIIIIIllII[30], lIIIIIIllII[31], lIIIIIIllII[1]);
                                worldPointArr2[lIIIIIIllII[13]] = new WorldPoint(lIIIIIIllII[32], lIIIIIIllII[33], lIIIIIIllII[1]);
                                worldPointArr2[lIIIIIIllII[15]] = new WorldPoint(lIIIIIIllII[34], lIIIIIIllII[35], lIIIIIIllII[1]);
                                worldPointArr2[lIIIIIIllII[17]] = new WorldPoint(lIIIIIIllII[36], lIIIIIIllII[37], lIIIIIIllII[1]);
                                worldPointArr2[lIIIIIIllII[18]] = new WorldPoint(lIIIIIIllII[38], lIIIIIIllII[37], lIIIIIIllII[1]);
                                worldPointArr2[lIIIIIIllII[19]] = new WorldPoint(lIIIIIIllII[39], lIIIIIIllII[37], lIIIIIIllII[1]);
                                worldPointArr2[lIIIIIIllII[21]] = new WorldPoint(lIIIIIIllII[40], lIIIIIIllII[37], lIIIIIIllII[1]);
                                worldPointArr2[lIIIIIIllII[41]] = new WorldPoint(lIIIIIIllII[42], lIIIIIIllII[43], lIIIIIIllII[1]);
                                worldPointArr2[lIIIIIIllII[44]] = new WorldPoint(lIIIIIIllII[45], lIIIIIIllII[43], lIIIIIIllII[1]);
                                Walker.walkAlong(Arrays.asList(worldPointArr2), new HashMap());
                                "".length();
                                Time.sleepTicks(lIIIIIIllII[2]);
                                "".length();
                            }
                            if (llIlllIIIIllI(Players.getLocal().getWorldLocation().distanceTo(ju), lIIIIIIllII[20])) {
                                AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[52]];
                                if (!llIlllIIIIIIl(Dialog.canLevelUpContinue() ? 1 : 0) || llIllIlllllll(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] strArr7 = new String[lIIIIIIllII[2]];
                                strArr7[lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[14]];
                                NPC nearest4 = NPCs.getNearest(strArr7);
                                String[] strArr8 = new String[lIIIIIIllII[2]];
                                strArr8[lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[53]];
                                TileObject nearest5 = TileObjects.getNearest(strArr8);
                                String[] strArr9 = new String[lIIIIIIllII[2]];
                                strArr9[lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[54]];
                                if (llIllIlllllll(nearest5.hasAction(strArr9) ? 1 : 0)) {
                                    nearest5.interact(lIIIIIIlIll[lIIIIIIllII[55]]);
                                }
                                if (llIlllIIIIIlI(nearest4)) {
                                    String[] strArr10 = new String[lIIIIIIllII[2]];
                                    strArr10[lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[56]];
                                    if (llIlllIIIIIIl(nearest5.hasAction(strArr10) ? 1 : 0)) {
                                        if (llIlllIIIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                            int[] iArr7 = new int[lIIIIIIllII[2]];
                                            iArr7[lIIIIIIllII[1]] = lIIIIIIllII[50];
                                            Inventory.getFirst(iArr7).useOn(nearest4);
                                            Time.sleepTicks(lIIIIIIllII[3]);
                                            "".length();
                                        }
                                        if (llIllIlllllll(Dialog.isOpen() ? 1 : 0)) {
                                            List options = Dialog.getOptions();
                                            if (llIlllIIIIIIl(options.isEmpty() ? 1 : 0)) {
                                                int lllllllllllllllllIIlllllIIIIllIl = lIIIIIIllII[1];
                                                while (llIlllIIIIIII(lllllllllllllllllIIlllllIIIIllIl, options.size())) {
                                                    int[] iArr8 = new int[lIIIIIIllII[2]];
                                                    iArr8[lIIIIIIllII[1]] = lIIIIIIllII[50];
                                                    if (llIlllIIIIlIl(((Item) Inventory.getAll(iArr8).get(lIIIIIIllII[1])).getQuantity(), lIIIIIIllII[2]) && llIllIlllllll(((Widget) options.get(lllllllllllllllllIIlllllIIIIllIl)).getText().contains(lIIIIIIlIll[lIIIIIIllII[57]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(lllllllllllllllllIIlllllIIIIllIl)).getClickPoint().getX(), ((Widget) options.get(lllllllllllllllllIIlllllIIIIllIl)).getClickPoint().getY(), (boolean) lIIIIIIllII[2]);
                                                        Time.sleepTicks(lIIIIIIllII[3]);
                                                        "".length();
                                                    }
                                                    int[] iArr9 = new int[lIIIIIIllII[2]];
                                                    iArr9[lIIIIIIllII[1]] = lIIIIIIllII[50];
                                                    if (llIlllIIIIlIl(((Item) Inventory.getAll(iArr9).get(lIIIIIIllII[1])).getQuantity(), lIIIIIIllII[13]) && llIllIlllllll(((Widget) options.get(lllllllllllllllllIIlllllIIIIllIl)).getText().contains(lIIIIIIlIll[lIIIIIIllII[58]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(lllllllllllllllllIIlllllIIIIllIl)).getClickPoint().getX(), ((Widget) options.get(lllllllllllllllllIIlllllIIIIllIl)).getClickPoint().getY(), (boolean) lIIIIIIllII[2]);
                                                        Time.sleepTicks(lIIIIIIllII[3]);
                                                        "".length();
                                                    }
                                                    if (llIllIlllllll(((Widget) options.get(lllllllllllllllllIIlllllIIIIllIl)).getText().contains(lIIIIIIlIll[lIIIIIIllII[59]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(lllllllllllllllllIIlllllIIIIllIl)).getClickPoint().getX(), ((Widget) options.get(lllllllllllllllllIIlllllIIIIllIl)).getClickPoint().getY(), (boolean) lIIIIIIllII[2]);
                                                        Time.sleepTicks(lIIIIIIllII[3]);
                                                        "".length();
                                                    }
                                                    lllllllllllllllllIIlllllIIIIllIl++;
                                                    "".length();
                                                    if ((((((94 + 119) - 92) + 23) ^ (((39 + 122) - 146) + 145)) & (((((140 + 118) - 152) + 70) ^ (((81 + 57) - 93) + 83)) ^ (-" ".length()))) != 0) {
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int[] iArr10 = new int[lIIIIIIllII[2]];
            iArr10[lIIIIIIllII[1]] = lIIIIIIllII[9];
            if (llIllIlllllll(Inventory.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lIIIIIIllII[2]];
                iArr11[lIIIIIIllII[1]] = lIIIIIIllII[0];
                if (!llIlllIIIIIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[lIIIIIIllII[2]];
                iArr12[lIIIIIIllII[1]] = lIIIIIIllII[50];
                if (!llIlllIIIIIIl(Inventory.contains(iArr12) ? 1 : 0)) {
                    return;
                }
            }
            if (llIlllIIIIllI(Players.getLocal().getWorldLocation().distanceTo(ju), lIIIIIIllII[20])) {
                AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[60]];
                String[] strArr11 = new String[lIIIIIIllII[2]];
                strArr11[lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[61]];
                TileItem nearest6 = TileItems.getNearest(strArr11);
                if (llIlllIIIIIlI(nearest6)) {
                    nearest6.interact(lIIIIIIlIll[lIIIIIIllII[62]]);
                }
            }
        }
    }

    private static String llIllIllllIlI(String lllllllllllllllllIIllllIlllllIII, String lllllllllllllllllIIllllIllllIlll) {
        String lllllllllllllllllIIllllIlllllIII2 = new String(Base64.getDecoder().decode(lllllllllllllllllIIllllIlllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIIllllIllllIlll.toCharArray();
        int lllllllllllllllllIIllllIllllIlII = lIIIIIIllII[1];
        char[] charArray2 = lllllllllllllllllIIllllIlllllIII2.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllllIIllllIlllIllII = lIIIIIIllII[1];
        while (llIlllIIIIIII(lllllllllllllllllIIllllIlllIllII, length)) {
            sb.append((char) (charArray2[lllllllllllllllllIIllllIlllIllII] ^ charArray[lllllllllllllllllIIllllIllllIlII % charArray.length]));
            "".length();
            lllllllllllllllllIIllllIllllIlII++;
            lllllllllllllllllIIllllIlllIllII++;
            "".length();
            if (" ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
        if (llIllIlllllll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean aa() {
        int[] iArr = new int[lIIIIIIllII[2]];
        iArr[lIIIIIIllII[1]] = lIIIIIIllII[9];
        if (llIllIlllllll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIIIIllII[2]];
            iArr2[lIIIIIIllII[1]] = lIIIIIIllII[9];
            if (llIlllIIIIlll(Inventory.getFirst(iArr2).getQuantity(), lIIIIIIllII[12])) {
                if (llIlllIIIIIIl(Inventory.contains(C0005f.aZ) ? 1 : 0)) {
                    if (llIllIlllllll(Equipment.contains(C0005f.aZ) ? 1 : 0)) {
                        int[] iArr3 = new int[lIIIIIIllII[2]];
                        iArr3[lIIIIIIllII[1]] = lIIIIIIllII[0];
                        if (llIlllIIIIIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIIIIIllII[2]];
                            iArr4[lIIIIIIllII[1]] = lIIIIIIllII[50];
                        }
                    }
                }
                ?? r0 = lIIIIIIllII[2];
                "".length();
                return " ".length() <= 0 ? ((((129 + 157) - 190) + 98) ^ (((121 + 123) - 200) + 153)) & (((253 ^ 131) ^ (248 ^ 129)) ^ (-" ".length())) : r0;
            }
        }
        return lIIIIIIllII[1];
    }
}
