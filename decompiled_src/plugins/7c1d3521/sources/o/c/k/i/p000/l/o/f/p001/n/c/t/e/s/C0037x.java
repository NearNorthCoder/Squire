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
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.x  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/x.class */
public class C0037x implements InterfaceC0003ac {
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ boolean dB;
    private static /* synthetic */ WorldPoint dI;
    private static /* synthetic */ WorldPoint dL;
    static /* synthetic */ boolean dj;
    private static /* synthetic */ WorldPoint dM;
    private static /* synthetic */ WorldPoint dG;
    private static /* synthetic */ String[] cE;
    public static /* synthetic */ boolean dA;
    public static /* synthetic */ boolean dE;
    private static /* synthetic */ WorldPoint dK;
    public static /* synthetic */ List<C0017d> bv;
    static /* synthetic */ int di;
    private static /* synthetic */ String[] llIIIlllIl;
    public static /* synthetic */ boolean dC;
    public static /* synthetic */ boolean dD;
    static /* synthetic */ int dF;
    private static /* synthetic */ int[] llIIlIIIIl;
    private static /* synthetic */ WorldPoint dH;
    private static /* synthetic */ WorldPoint dJ;

    private static boolean lIlIlIIlIIIll(int i, int i2) {
        return i > i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIIlllIl[llIIlIIIIl[78]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        String[] strArr = new String[llIIlIIIIl[0]];
        strArr[llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[73]];
        if (lIlIlIIlIIIlI(Inventory.getCount(strArr))) {
            int[] iArr = new int[llIIlIIIIl[0]];
            iArr[llIIlIIIIl[1]] = llIIlIIIIl[7];
            if (lIlIlIIlIIIlI(Inventory.getCount(iArr)) && lIlIlIIlIIIlI(Inventory.getCount(C0019f.ba))) {
                int[] iArr2 = new int[llIIlIIIIl[0]];
                iArr2[llIIlIIIIl[1]] = llIIlIIIIl[8];
                if (lIlIlIIlIIIlI(Inventory.getCount(iArr2))) {
                    ?? r0 = llIIlIIIIl[0];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return llIIlIIIIl[1];
    }

    private static void Q() {
        int[] iArr = new int[llIIlIIIIl[0]];
        iArr[llIIlIIIIl[1]] = llIIlIIIIl[9];
        if (lIlIlIIIlllIl(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(llIIlIIIIl[9], llIIlIIIIl[12], llIIlIIIIl[74]));
            "".length();
        }
        int[] iArr2 = new int[llIIlIIIIl[0]];
        iArr2[llIIlIIIIl[1]] = llIIlIIIIl[11];
        if (lIlIlIIIlllIl(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(llIIlIIIIl[11], llIIlIIIIl[13], C0023j.cf));
            "".length();
        }
        if (lIlIlIIIlllIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIIIlllIl[llIIlIIIIl[80]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIIlIIIIl[75], llIIlIIIIl[13], llIIlIIIIl[76]));
            "".length();
        }
        int[] iArr3 = new int[llIIlIIIIl[0]];
        iArr3[llIIlIIIIl[1]] = llIIlIIIIl[7];
        if (lIlIlIIIlllIl(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(llIIlIIIIl[7], llIIlIIIIl[53], llIIlIIIIl[74]));
            "".length();
        }
        int[] iArr4 = new int[llIIlIIIIl[0]];
        iArr4[llIIlIIIIl[1]] = llIIlIIIIl[8];
        if (lIlIlIIIlllIl(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIIlIIIIl[8], llIIlIIIIl[12], llIIlIIIIl[74]));
            "".length();
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            bi();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (82 ^ 27) & ((17 ^ 88) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIIlIIIIl[77];
    }

    private static String lIlIIlllIllll(String llllllllllllllllllIlIlIIIIIllllI, String llllllllllllllllllIlIlIIIIIlllIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIlIlIIIIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllIlIlIIIIIlllIl.toCharArray();
        int llllllllllllllllllIlIlIIIIIllIlI = llIIlIIIIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIlIIIIl[1];
        while (lIlIlIIIllIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllllIlIlIIIIIllIlI % charArray.length]));
            "".length();
            llllllllllllllllllIlIlIIIIIllIlI++;
            i++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIlIIllllIIII(String llllllllllllllllllIlIlIIIIIIlIIl, String llllllllllllllllllIlIlIIIIIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIlIIIIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIIIIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIlIIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIlIIIIIIlIlI) {
            llllllllllllllllllIlIlIIIIIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIllIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIlIIlIlIlI(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlIlIIIlllIl(int i) {
        return i == 0;
    }

    private static boolean lIlIlIIlIIIIl(Object obj) {
        return obj != null;
    }

    public static void bj() {
        String[] strArr = new String[llIIlIIIIl[0]];
        strArr[llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[66]];
        if (lIlIlIIIllIII(Inventory.contains(strArr) ? 1 : 0)) {
            if (lIlIlIIlIIIIl(Widgets.get(llIIlIIIIl[59]))) {
                AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[67]];
                String[] strArr2 = new String[llIIlIIIIl[0]];
                strArr2[llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[68]];
                Inventory.getFirst(strArr2).interact(llIIIlllIl[llIIlIIIIl[69]]);
                Time.sleepTicks(llIIlIIIIl[6]);
                "".length();
                AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[70]];
                Widget widget = Widgets.get(llIIlIIIIl[59], llIIlIIIIl[27]);
                if (lIlIlIIlIIIIl(widget)) {
                    widget.interact(llIIIlllIl[llIIlIIIIl[71]]);
                    Time.sleepTicks(llIIlIIIIl[0]);
                    "".length();
                }
                Widget widget2 = Widgets.get(llIIlIIIIl[59], llIIlIIIIl[39]);
                if (lIlIlIIlIIIIl(widget2)) {
                    widget2.interact(llIIIlllIl[llIIlIIIIl[72]]);
                    Time.sleepTicks(llIIlIIIIl[5]);
                    "".length();
                }
            }
            Time.sleepTicks(llIIlIIIIl[0]);
            "".length();
        }
    }

    private static void lIlIlIIIlIllI() {
        llIIlIIIIl = new int[126];
        llIIlIIIIl[0] = " ".length();
        llIIlIIIIl[1] = (74 ^ 87) & ((50 ^ 47) ^ (-1));
        llIIlIIIIl[2] = (92 ^ 98) ^ (69 ^ 115);
        llIIlIIIIl[3] = (-((-17713) & 26106)) & (-1047) & 32511;
        llIIlIIIIl[4] = (-((-4746) & 32463)) & (-17) & 32733;
        llIIlIIIIl[5] = "  ".length();
        llIIlIIIIl[6] = 151 ^ 147;
        llIIlIIIIl[7] = (-((-6979) & 23507)) & (-33) & 24567;
        llIIlIIIIl[8] = (-((-4433) & 12755)) & (-33) & 16363;
        llIIlIIIIl[9] = (-((-9) & 30413)) & (-2049) & 32766;
        llIIlIIIIl[10] = "   ".length();
        llIIlIIIIl[11] = (-((-8193) & 27819)) & (-517) & 32767;
        llIIlIIIIl[12] = (100 ^ 65) ^ (82 ^ 125);
        llIIlIIIIl[13] = 65 ^ 68;
        llIIlIIIIl[14] = (-10373) & 10751;
        llIIlIIIIl[15] = 14 ^ 2;
        llIIlIIIIl[16] = 232 ^ 169;
        llIIlIIIIl[17] = 95 ^ 89;
        llIIlIIIIl[18] = (158 ^ 135) ^ (28 ^ 2);
        llIIlIIIIl[19] = (-2562) & 8181;
        llIIlIIIIl[20] = (-((-851) & 11091)) & (-16395) & 32255;
        llIIlIIIIl[21] = (-(178 ^ 187)) & (-16898) & 22527;
        llIIlIIIIl[22] = (-((-1301) & 26397)) & (-2049) & 32767;
        llIIlIIIIl[23] = (-((-9387) & 28335)) & (-8195) & 32766;
        llIIlIIIIl[24] = (112 ^ 48) ^ (84 ^ 29);
        llIIlIIIIl[25] = 55 ^ 60;
        llIIlIIIIl[26] = 137 ^ 132;
        llIIlIIIIl[27] = (21 ^ 54) ^ (25 ^ 52);
        llIIlIIIIl[28] = (116 ^ 109) ^ (1 ^ 23);
        llIIlIIIIl[29] = (78 ^ 90) ^ (118 ^ 114);
        llIIlIIIIl[30] = 10 ^ 27;
        llIIlIIIIl[31] = (201 ^ 168) ^ (212 ^ 167);
        llIIlIIIIl[32] = (172 ^ 152) ^ (127 ^ 88);
        llIIlIIIIl[33] = 136 ^ 156;
        llIIlIIIIl[34] = (((53 + 172) - 149) + 104) ^ (((136 + 90) - 71) + 6);
        llIIlIIIIl[35] = 50 ^ 36;
        llIIlIIIIl[36] = (27 ^ 94) ^ (241 ^ 163);
        llIIlIIIIl[37] = (((155 + 37) - 80) + 60) ^ (((163 + 122) - 183) + 78);
        llIIlIIIIl[38] = 35 ^ 58;
        llIIlIIIIl[39] = (33 ^ 85) ^ (253 ^ 147);
        llIIlIIIIl[40] = (((48 + 120) - 47) + 40) ^ (((80 + 169) - 247) + 184);
        llIIlIIIIl[41] = (((55 + 192) - 49) + 20) ^ (((51 + 101) - 55) + 101);
        llIIlIIIIl[42] = (161 ^ 143) ^ (38 ^ 21);
        llIIlIIIIl[43] = 140 ^ 146;
        llIIlIIIIl[44] = 103 ^ 120;
        llIIlIIIIl[45] = (114 ^ 29) ^ (112 ^ 63);
        llIIlIIIIl[46] = 38 ^ 7;
        llIIlIIIIl[47] = (127 ^ 55) ^ (170 ^ 192);
        llIIlIIIIl[48] = (((122 + 59) - 93) + 72) ^ (((26 + 82) - (-12)) + 11);
        llIIlIIIIl[49] = 47 ^ 11;
        llIIlIIIIl[50] = 8 ^ 45;
        llIIlIIIIl[51] = 153 ^ 191;
        llIIlIIIIl[52] = (((18 + 82) - 63) + 115) ^ (((68 + 81) - 47) + 89);
        llIIlIIIIl[53] = (23 ^ 96) ^ (16 ^ 79);
        llIIlIIIIl[54] = 104 ^ 65;
        llIIlIIIIl[55] = 83 ^ 121;
        llIIlIIIIl[56] = 33 ^ 10;
        llIIlIIIIl[57] = 87 ^ 123;
        llIIlIIIIl[58] = (((77 + 54) - (-9)) + 9) ^ (((75 + 47) - 61) + 123);
        llIIlIIIIl[59] = ((178 + 165) - 265) + 162;
        llIIlIIIIl[60] = (32 ^ 3) ^ (85 ^ 88);
        llIIlIIIIl[61] = 17 ^ 62;
        llIIlIIIIl[62] = (73 ^ 10) ^ (100 ^ 23);
        llIIlIIIIl[63] = 62 ^ 15;
        llIIlIIIIl[64] = (14 ^ 25) ^ (36 ^ 1);
        llIIlIIIIl[65] = 55 ^ 4;
        llIIlIIIIl[66] = 60 ^ 8;
        llIIlIIIIl[67] = 0 ^ 53;
        llIIlIIIIl[68] = (225 ^ 183) ^ (126 ^ 30);
        llIIlIIIIl[69] = (238 ^ 139) ^ (125 ^ 47);
        llIIlIIIIl[70] = 179 ^ 139;
        llIIlIIIIl[71] = 185 ^ 128;
        llIIlIIIIl[72] = 111 ^ 85;
        llIIlIIIIl[73] = 137 ^ 178;
        llIIlIIIIl[74] = (-((-4997) & 32726)) & (-4097) & 32725;
        llIIlIIIIl[75] = (-4370) & 16349;
        llIIlIIIIl[76] = (-((-13985) & 16101)) & (-1042) & 28157;
        llIIlIIIIl[77] = (((25 + 4) - 0) + 136) ^ (((189 + 37) - 101) + 68);
        llIIlIIIIl[78] = 35 ^ 31;
        llIIlIIIIl[79] = 70 ^ 123;
        llIIlIIIIl[80] = (155 ^ 170) ^ (42 ^ 37);
        llIIlIIIIl[81] = (11 ^ 50) ^ (22 ^ 16);
        llIIlIIIIl[82] = (((166 + 90) - 214) + 195) ^ (((27 + 105) - 93) + 134);
        llIIlIIIIl[83] = 92 ^ 30;
        llIIlIIIIl[84] = (((188 + 30) - 8) + 36) ^ (((147 + 173) - 232) + 93);
        llIIlIIIIl[85] = (((61 + 128) - 39) + 87) ^ (((113 + 36) - 23) + 43);
        llIIlIIIIl[86] = 227 ^ 166;
        llIIlIIIIl[87] = (177 ^ 132) ^ (60 ^ 79);
        llIIlIIIIl[88] = (((84 + 113) - 172) + 192) ^ (((139 + 70) - 52) + 1);
        llIIlIIIIl[89] = (((29 + 19) - 18) + 112) ^ (((155 + 88) - 172) + 127);
        llIIlIIIIl[90] = 127 ^ 54;
        llIIlIIIIl[91] = (-((-8259) & 30927)) & (-8195) & 32687;
        llIIlIIIIl[92] = (-((-16697) & 28986)) & (-277) & 16255;
        llIIlIIIIl[93] = (-((-803) & 31603)) & (-33) & 32639;
        llIIlIIIIl[94] = (-24865) & 28590;
        llIIlIIIIl[95] = (-30721) & 32439;
        llIIlIIIIl[96] = (-12627) & 16351;
        llIIlIIIIl[97] = (-((-16399) & 20991)) & (-1) & 6143;
        llIIlIIIIl[98] = (-((-7323) & 32219)) & (-4107) & 32751;
        llIIlIIIIl[99] = (-((-5554) & 16317)) & (-4101) & 16383;
        llIIlIIIIl[100] = (-20721) & 24311;
        llIIlIIIIl[101] = (-((-1218) & 30147)) & (-17) & 30719;
        llIIlIIIIl[102] = (-4129) & 7716;
        llIIlIIIIl[103] = (-((-1689) & 24543)) & (-2) & 24567;
        llIIlIIIIl[104] = (-((-19375) & 31743)) & (-16389) & 32639;
        llIIlIIIIl[105] = 3 ^ 73;
        llIIlIIIIl[106] = 2 ^ 73;
        llIIlIIIIl[107] = 254 ^ 178;
        llIIlIIIIl[108] = (50 ^ 4) ^ (218 ^ 161);
        llIIlIIIIl[109] = (((61 + 231) - 271) + 230) ^ (((171 + 16) - 144) + 138);
        llIIlIIIIl[110] = 23 ^ 88;
        llIIlIIIIl[111] = (73 ^ 61) ^ (62 ^ 26);
        llIIlIIIIl[112] = (107 ^ 109) ^ (229 ^ 178);
        llIIlIIIIl[113] = (((138 + 39) - 52) + 25) ^ (((109 + 166) - 213) + 134);
        llIIlIIIIl[114] = (((160 + 31) - 58) + 65) ^ (((130 + 109) - 139) + 49);
        llIIlIIIIl[115] = 215 ^ 131;
        llIIlIIIIl[116] = 243 ^ 166;
        llIIlIIIIl[117] = 210 ^ 132;
        llIIlIIIIl[118] = 230 ^ 177;
        llIIlIIIIl[119] = (1 ^ 66) ^ (158 ^ 133);
        llIIlIIIIl[120] = 240 ^ 169;
        llIIlIIIIl[121] = 217 ^ 131;
        llIIlIIIIl[122] = 75 ^ 16;
        llIIlIIIIl[123] = 208 ^ 140;
        llIIlIIIIl[124] = (176 ^ 161) ^ (203 ^ 135);
        llIIlIIIIl[125] = 225 ^ 191;
    }

    private static String lIlIIlllIlllI(String llllllllllllllllllIlIIllllllllII, String llllllllllllllllllIlIIlllllllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIlllllllIIl.getBytes(StandardCharsets.UTF_8)), llIIlIIIIl[2]), "DES");
            Cipher llllllllllllllllllIlIIlllllllllI = Cipher.getInstance("DES");
            llllllllllllllllllIlIIlllllllllI.init(llIIlIIIIl[5], secretKeySpec);
            return new String(llllllllllllllllllIlIIlllllllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIllllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIIlllllllIII) {
            llllllllllllllllllIlIIlllllllIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIlIIIIl[1];
    }

    private static boolean lIlIlIIlIIIII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIlIIIlllll(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[24])) {
            String[] strArr = new String[llIIlIIIIl[0]];
            strArr[llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[79]];
            if (lIlIlIIIlllIl(Inventory.contains(strArr) ? 1 : 0)) {
                ?? r0 = llIIlIIIIl[0];
                "".length();
                return (((((106 + 94) - 174) + 202) ^ (((136 + 50) - 181) + 165)) & (((((200 + 75) - 121) + 100) ^ (((154 + 167) - 249) + 104)) ^ (-" ".length()))) != 0 ? ((((46 + 145) - 110) + 97) ^ (((20 + 138) - 22) + 10)) & (((34 ^ 65) ^ (123 ^ 56)) ^ (-" ".length())) : r0;
            }
        }
        return llIIlIIIIl[1];
    }

    private static void lIlIlIIIlIIIl() {
        llIIIlllIl = new String[llIIlIIIIl[125]];
        llIIIlllIl[llIIlIIIIl[1]] = lIlIIlllIlllI("jrjnmADUiYO1tTt+Urt1puePhspfHJvNrCWiaIuCOH0Vy2e6AsaXXc9BEIHUZh83", "tIDwr");
        llIIIlllIl[llIIlIIIIl[0]] = lIlIIlllIllll("HBUXYQQ9VAMgHjk=", "RtaAp");
        llIIIlllIl[llIIlIIIIl[5]] = lIlIIlllIlllI("0fhiaadNh0wIvzvntvbn6+Gka7FyLRb6", "QqLhR");
        llIIIlllIl[llIIlIIIIl[10]] = lIlIIlllIlllI("55up0J3IZOc4BCRgliniZhQN36ROp29WBhErWnhwo2V+naHAbxEALNaS87bA0DFy7mlbo9g5SGQ=", "SUpAz");
        llIIIlllIl[llIIlIIIIl[6]] = lIlIIlllIllll("JhUt", "ctYzz");
        llIIIlllIl[llIIlIIIIl[13]] = lIlIIllllIIII("UzLDApYDyY8=", "OLgXV");
        llIIIlllIl[llIIlIIIIl[17]] = lIlIIlllIlllI("aoaeKfUd4nBKz696TSAogg==", "NQRmj");
        llIIIlllIl[llIIlIIIIl[18]] = lIlIIlllIllll("MDoYOgQKIB5oARYrCjw=", "cNyHp");
        llIIIlllIl[llIIlIIIIl[2]] = lIlIIlllIllll("NBUcOw==", "bpsHC");
        llIIIlllIl[llIIlIIIIl[24]] = lIlIIllllIIII("EtKVVzEzzgupH/2sqzqP90enyxZY73Qc", "IUaQc");
        llIIIlllIl[llIIlIIIIl[12]] = lIlIIlllIllll("Pgg0ATwdHw==", "xmUuT");
        llIIIlllIl[llIIlIIIIl[25]] = lIlIIllllIIII("NEQ6PkGt4zI2Hv4MC2CXVg==", "JGOMP");
        llIIIlllIl[llIIlIIIIl[15]] = lIlIIlllIlllI("pCOradIfdfJ0IqCX2f4A4yMc8oMSXU+4", "sYiZI");
        llIIIlllIl[llIIlIIIIl[26]] = lIlIIlllIlllI("jhXl5vpdK30=", "rsbOn");
        llIIIlllIl[llIIlIIIIl[27]] = lIlIIlllIlllI("GJSM8ELMRj/Q0Vq0Ki+A6w==", "TLGoZ");
        llIIIlllIl[llIIlIIIIl[28]] = lIlIIlllIllll("BQgyVwEkSTQeBihJMB4ZLg==", "KiDwu");
        llIIIlllIl[llIIlIIIIl[29]] = lIlIIllllIIII("KYxKW/qpxjANAYR301XCQw==", "HCvcy");
        llIIIlllIl[llIIlIIIIl[30]] = lIlIIllllIIII("cu2PeKGgphY=", "NingM");
        llIIIlllIl[llIIlIIIIl[31]] = lIlIIllllIIII("CIC1ZHUYjpO8tiufTqM8cQ==", "Dxqkw");
        llIIIlllIl[llIIlIIIIl[32]] = lIlIIlllIlllI("sPky7omDSxAMl8XDAxJMQw==", "pEuSd");
        llIIIlllIl[llIIlIIIIl[33]] = lIlIIllllIIII("tJ+BU+d5oQRjJHutCDFRCA==", "uaXWW");
        llIIIlllIl[llIIlIIIIl[34]] = lIlIIlllIlllI("llVyMCCZFfI=", "ghbNk");
        llIIIlllIl[llIIlIIIIl[35]] = lIlIIlllIlllI("HQaIQNnp6wD/t4T2PouQOg==", "SdIOa");
        llIIIlllIl[llIIlIIIIl[36]] = lIlIIllllIIII("9wk94qW8ITExwUjOSKtq8cvUpkQUYJm4", "kVMoH");
        llIIIlllIl[llIIlIIIIl[37]] = lIlIIlllIllll("MC8/IQoKKXMmDBIv", "dNSJc");
        llIIIlllIl[llIIlIIIIl[38]] = lIlIIlllIllll("LyIaPxw=", "bWtKe");
        llIIIlllIl[llIIlIIIIl[39]] = lIlIIlllIlllI("/zwE+h8W/4/xZOS7vn+jUw==", "ZBbfN");
        llIIIlllIl[llIIlIIIIl[40]] = lIlIIlllIlllI("lJl6GeZz0JXSkN9GLc8pICzaLmYQL+Pp", "xEbPO");
        llIIIlllIl[llIIlIIIIl[41]] = lIlIIlllIllll("IDEgPgcaN2wmBg0qJTAA", "tPLUn");
        llIIIlllIl[llIIlIIIIl[42]] = lIlIIllllIIII("osPd0J8GS5MD3auIwvNoCg==", "moOFj");
        llIIIlllIl[llIIlIIIIl[43]] = lIlIIlllIllll("ESo3EB4/Jj1ZHj86IxAIOQ==", "WCYym");
        llIIIlllIl[llIIlIIIIl[44]] = lIlIIlllIlllI("nHhi7iB9RtMI8CAFT5HjNsxPicVOiOyk", "ojBqZ");
        llIIIlllIl[llIIlIIIIl[45]] = lIlIIllllIIII("+xTVyoLTLWE7vMlkDqYgtKmWtv4kv9US", "HPiBs");
        llIIIlllIl[llIIlIIIIl[46]] = lIlIIlllIllll("PCAKJjAR", "tOxGS");
        llIIIlllIl[llIIlIIIIl[47]] = lIlIIlllIlllI("U403SFEPQ+jnGtwYeN94UugMFv7EZayF", "FUgPj");
        llIIIlllIl[llIIlIIIIl[48]] = lIlIIllllIIII("xpJ3RrblZyPFSpRfMfwexQ==", "lGenM");
        llIIIlllIl[llIIlIIIIl[49]] = lIlIIllllIIII("HD4I+xBuozLWFPZ5/h+s2Q==", "VYycl");
        llIIIlllIl[llIIlIIIIl[50]] = lIlIIllllIIII("CfoLIPlKVuI=", "bIHsI");
        llIIIlllIl[llIIlIIIIl[51]] = lIlIIlllIlllI("mGPwv7vt4AScJjqKT2ztM+7PcnozvteY", "GRvih");
        llIIIlllIl[llIIlIIIIl[52]] = lIlIIlllIllll("IxIlNz0cAjk2K04EJCE=", "nkVCX");
        llIIIlllIl[llIIlIIIIl[53]] = lIlIIllllIIII("6joPEegO8mij7xEG5uz/Ng==", "jSLSs");
        llIIIlllIl[llIIlIIIIl[54]] = lIlIIlllIlllI("lj29vEVkA9tLjjdbD1o7Mg==", "YDfvQ");
        llIIIlllIl[llIIlIIIIl[55]] = lIlIIlllIllll("LywzazUObTY/IBM5", "aMEKA");
        llIIIlllIl[llIIlIIIIl[56]] = lIlIIllllIIII("ybjFV+ZiyP59+AvMAT1pNA==", "rirNG");
        llIIIlllIl[llIIlIIIIl[57]] = lIlIIlllIllll("EhIbMg==", "DwtAN");
        llIIIlllIl[llIIlIIIIl[58]] = lIlIIllllIIII("DF9P6W0k/8d1BXbX9L1yEg==", "xCQIr");
        llIIIlllIl[llIIlIIIIl[60]] = lIlIIllllIIII("Ni2UJm7eGEUqOcIih/03Bw==", "qcJTn");
        llIIIlllIl[llIIlIIIIl[61]] = lIlIIlllIllll("OwwkPSgPB3A4OBcS", "zbPTY");
        llIIIlllIl[llIIlIIIIl[62]] = lIlIIllllIIII("baAKwhzoWsE=", "EMJPO");
        llIIIlllIl[llIIlIIIIl[63]] = lIlIIllllIIII("bSneCLJ990e6nJAp8shlX+9eulCZyeJ9", "YIjtP");
        llIIIlllIl[llIIlIIIIl[64]] = lIlIIlllIlllI("OGy8uRFJpqk=", "heesL");
        llIIIlllIl[llIIlIIIIl[65]] = lIlIIlllIllll("KB4rHCIZHA==", "kqEzK");
        llIIIlllIl[llIIlIIIIl[66]] = lIlIIllllIIII("DrNltarOQphzIAtIEZWw1A==", "uVeka");
        llIIIlllIl[llIIlIIIIl[67]] = lIlIIlllIlllI("HIhmkKvEcDk/0fs0UlwArg==", "qhTTJ");
        llIIIlllIl[llIIlIIIIl[68]] = lIlIIlllIllll("DCwdAjU4J0kHJSAy", "MBikD");
        llIIIlllIl[llIIlIIIIl[69]] = lIlIIllllIIII("ddFK7ITWVoY=", "KgUhT");
        llIIIlllIl[llIIlIIIIl[70]] = lIlIIlllIllll("CQgNHBIuBA8eUSkBAAAUKA==", "Zmayq");
        llIIIlllIl[llIIlIIIIl[71]] = lIlIIlllIllll("ND0AFAYV", "gQamc");
        llIIIlllIl[llIIlIIIIl[72]] = lIlIIllllIIII("g1ukO6CwE6c=", "ODopy");
        llIIIlllIl[llIIlIIIIl[73]] = lIlIIlllIlllI("r5jQLX81R4I=", "OPrVq");
        llIIIlllIl[llIIlIIIIl[78]] = lIlIIllllIIII("h16HEKjPLG5BLFk6sBIEMptP2GHVvOKR", "jBGVB");
        llIIIlllIl[llIIlIIIIl[79]] = lIlIIllllIIII("WI9qC8Jop4f8J7n86XHhpQ==", "JEqVI");
        llIIIlllIl[llIIlIIIIl[80]] = lIlIIlllIlllI("YCRdYffj3i/h5w8Mm0bankAFB6Ny9E/l", "EMoiG");
        llIIIlllIl[llIIlIIIIl[81]] = lIlIIlllIllll("DgwNVxptDBAcczQCFlcyLwIWA3MFAhAeNyQYEEg=", "MmcwS");
        llIIIlllIl[llIIlIIIIl[82]] = lIlIIlllIlllI("ZvBlFmyBvY/FhPW3qtiegg==", "Jtyux");
        llIIIlllIl[llIIlIIIIl[16]] = lIlIIlllIlllI("rw3Ky4GhLJwz09SgZQv8aA==", "iJjDy");
        llIIIlllIl[llIIlIIIIl[83]] = lIlIIllllIIII("wDV4VIK6frjXa2tGHxLv4qYTfFI36Xr5t33LaQplAUc=", "IUVTQ");
        llIIIlllIl[llIIlIIIIl[84]] = lIlIIlllIlllI("WTzdCMk8WGlw+qGOlpgSTg==", "RNiUN");
        llIIIlllIl[llIIlIIIIl[85]] = lIlIIlllIlllI("CTPE1BF82ucqjzWoEQYU71+vu3o6Wq5Ujtaskm/oLBw=", "CABKU");
        llIIIlllIl[llIIlIIIIl[86]] = lIlIIllllIIII("A3H1Jd1PaA7wS73hIwLyRg==", "FfLKN");
        llIIIlllIl[llIIlIIIIl[87]] = lIlIIlllIlllI("ykm/Sl4YB8mGZisXDJ7Eo/NlDjxsWgaY7NQOFWVJGcA=", "yPDyH");
        llIIIlllIl[llIIlIIIIl[88]] = lIlIIlllIllll("AU0+CA9vGXoJBC0JegYPMRkyDg8vQw==", "HmZga");
        llIIIlllIl[llIIlIIIIl[89]] = lIlIIlllIlllI("3DLnkh0oO/Q+jRF0UgGbMv167sXMWPWeX6l8AawbYyZWBDUWNlAcBg==", "EuYZx");
        llIIIlllIl[llIIlIIIIl[90]] = lIlIIlllIlllI("WZrxn/tR912ol4wepz7MEQqpm+/Z6gIEFtYvinaEqzVYmkqcHPWZmw==", "bXQuG");
        llIIIlllIl[llIIlIIIIl[105]] = lIlIIlllIlllI("ijKrwUWElt21fHavJe1Qp4uJbBvY1znjroPN3MQhF4Y=", "bQqiH");
        llIIIlllIl[llIIlIIIIl[106]] = lIlIIlllIllll("HRwrQg==", "DyXlT");
        llIIIlllIl[llIIlIIIIl[107]] = lIlIIlllIlllI("C2eFddsqfJU=", "HSeyE");
        llIIIlllIl[llIIlIIIIl[108]] = lIlIIlllIllll("GQkPYxt6CRIociMHFGMzOAcUN3IKBxM3cgoBEiAzKAENKicpVw==", "ZhaCR");
        llIIIlllIl[llIIlIIIIl[109]] = lIlIIllllIIII("J80QGGIYln8XnL7WX4YSh9/ziXfHOQXr6Gy/iDG1wtpH9RQPxwIRfhO8Ds0GPXyt", "bLJFP");
        llIIIlllIl[llIIlIIIIl[110]] = lIlIIlllIllll("Jw8tUi9EDzAZRh0BNlIHBgE2BkY0ATEGRiUcIBcTER18", "dnCrf");
        llIIIlllIl[llIIlIIIIl[111]] = lIlIIlllIlllI("R12TFdXbjBmKE4HQLmdMedbFCstHAPp8rkrAHpcuyRA=", "EAFwN");
        llIIIlllIl[llIIlIIIIl[112]] = lIlIIllllIIII("Bpi99PHYO5aBVIWd4qD59N77YY3ZIwD70jrTZwWruVYVaqeDMx8HIw==", "gHiXS");
        llIIIlllIl[llIIlIIIIl[113]] = lIlIIllllIIII("hq9/IhhnOcPZgulmibamlBn2K2Yw0zJreT4OzltOFdE=", "OsUQq");
        llIIIlllIl[llIIlIIIIl[114]] = lIlIIlllIlllI("K0r8Dn3yMQySD3aYkaPzeWPFM96YytkufKi2X2EAxOpOFsMR0OxF7hO4Ceg7Af+h", "KkwJX");
        llIIIlllIl[llIIlIIIIl[115]] = lIlIIlllIlllI("zhAOoFVxLNP+m/DW77qmjTPEDopLxI+99dCBqSLBSC0=", "WaFIy");
        llIIIlllIl[llIIlIIIIl[116]] = lIlIIlllIlllI("Snwn6eJtUEdPHnfHfzMyLm5PaT1YwEZj685EGO95krgbXGFhK041ug==", "lUUcL");
        llIIIlllIl[llIIlIIIIl[117]] = lIlIIlllIlllI("wmhIR7GPaIF60G7RIpwhRh8FyWW5TxJQdfPaU/sfDs8=", "fazNX");
        llIIIlllIl[llIIlIIIIl[118]] = lIlIIllllIIII("Tr/4uMwu5IMosfhFUufUcdbyb+rFaINBt8iPJvWYL4CStfx6xhZB7g==", "zEuUV");
        llIIIlllIl[llIIlIIIIl[119]] = lIlIIllllIIII("4tL7xkak8t/HO3bBHimkjStnLWXd+g+eOL74G6jo8n+rF8ypskgZAw0J5FFPOEKo", "dkvDm");
        llIIIlllIl[llIIlIIIIl[120]] = lIlIIlllIlllI("77zSuGjYYp6fMsMczdi3VrPNMW6Hlbf0+aRsdyQ2K/s=", "dcQXE");
        llIIIlllIl[llIIlIIIIl[121]] = lIlIIlllIlllI("bVxkqI0idfomZU2N0oLG9p0CK4LTw8vU7r7vdzVh+bodzjx/NMPbRA==", "Nmwgf");
        llIIIlllIl[llIIlIIIIl[122]] = lIlIIllllIIII("WiCcwb5ssb7tSyYIxQ1Ip+cCJTSZxHKqRqijhFr9LLhIgQOpXxf//Q==", "yquna");
        llIIIlllIl[llIIlIIIIl[123]] = lIlIIllllIIII("e0reHsgaRjZY3xBeMyiaWxNauysiRNSKNc/6yIQ4g/mm3JWyx/IMfQ==", "QWQUa");
        llIIIlllIl[llIIlIIIIl[124]] = lIlIIlllIlllI("P0JyIU9q+FrXnvgs/AZ1FgSKFk92ABGKjmUtutnxIcM=", "JXjem");
    }

    private static boolean lIlIlIIIllIII(int i) {
        return i != 0;
    }

    private static boolean lIlIlIIlIIIlI(int i) {
        return i > 0;
    }

    static {
        lIlIlIIIlIllI();
        lIlIlIIIlIIIl();
        bv = new ArrayList();
        dF = llIIlIIIIl[1];
        dG = new WorldPoint(llIIlIIIIl[91], llIIlIIIIl[92], llIIlIIIIl[1]);
        dH = new WorldPoint(llIIlIIIIl[93], llIIlIIIIl[94], llIIlIIIIl[1]);
        dI = new WorldPoint(llIIlIIIIl[95], llIIlIIIIl[96], llIIlIIIIl[1]);
        dJ = new WorldPoint(llIIlIIIIl[97], llIIlIIIIl[98], llIIlIIIIl[1]);
        dK = new WorldPoint(llIIlIIIIl[99], llIIlIIIIl[100], llIIlIIIIl[1]);
        dL = new WorldPoint(llIIlIIIIl[101], llIIlIIIIl[102], llIIlIIIIl[1]);
        dM = new WorldPoint(llIIlIIIIl[103], llIIlIIIIl[104], llIIlIIIIl[1]);
        String[] strArr = new String[llIIlIIIIl[33]];
        strArr[llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[105]];
        strArr[llIIlIIIIl[0]] = llIIIlllIl[llIIlIIIIl[106]];
        strArr[llIIlIIIIl[5]] = llIIIlllIl[llIIlIIIIl[107]];
        strArr[llIIlIIIIl[10]] = llIIIlllIl[llIIlIIIIl[108]];
        strArr[llIIlIIIIl[6]] = llIIIlllIl[llIIlIIIIl[109]];
        strArr[llIIlIIIIl[13]] = llIIIlllIl[llIIlIIIIl[110]];
        strArr[llIIlIIIIl[17]] = llIIIlllIl[llIIlIIIIl[111]];
        strArr[llIIlIIIIl[18]] = llIIIlllIl[llIIlIIIIl[112]];
        strArr[llIIlIIIIl[2]] = llIIIlllIl[llIIlIIIIl[113]];
        strArr[llIIlIIIIl[24]] = llIIIlllIl[llIIlIIIIl[114]];
        strArr[llIIlIIIIl[12]] = llIIIlllIl[llIIlIIIIl[115]];
        strArr[llIIlIIIIl[25]] = llIIIlllIl[llIIlIIIIl[116]];
        strArr[llIIlIIIIl[15]] = llIIIlllIl[llIIlIIIIl[117]];
        strArr[llIIlIIIIl[26]] = llIIIlllIl[llIIlIIIIl[118]];
        strArr[llIIlIIIIl[27]] = llIIIlllIl[llIIlIIIIl[119]];
        strArr[llIIlIIIIl[28]] = llIIIlllIl[llIIlIIIIl[120]];
        strArr[llIIlIIIIl[29]] = llIIIlllIl[llIIlIIIIl[121]];
        strArr[llIIlIIIIl[30]] = llIIIlllIl[llIIlIIIIl[122]];
        strArr[llIIlIIIIl[31]] = llIIIlllIl[llIIlIIIIl[123]];
        strArr[llIIlIIIIl[32]] = llIIIlllIl[llIIlIIIIl[124]];
        cE = strArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
        if (lIlIlIIIllIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L290;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v496, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v498, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v500, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v502, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v504, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v609, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v636, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v96, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bi() {
        if (lIlIlIIIllIII(bt ? 1 : 0)) {
            C0015b.a(bv);
            if (lIlIlIIIllIll(bv.size(), llIIlIIIIl[0])) {
                System.out.println(llIIIlllIl[llIIlIIIIl[1]]);
                bt = llIIlIIIIl[1];
            }
        }
        if (lIlIlIIIlllIl(bt ? 1 : 0)) {
            if (lIlIlIIIlllll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIIlIIIIl[2])) {
                int[] iArr = new int[llIIlIIIIl[0]];
                iArr[llIIlIIIIl[1]] = llIIlIIIIl[3];
            }
            C0002ab.ex();
            if (lIlIlIIIlllIl(an() ? 1 : 0) && lIlIlIIIllIll(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[0]) && lIlIlIIlIIIII(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIIlIIIIl[2])) {
                int[] iArr2 = new int[llIIlIIIIl[0]];
                iArr2[llIIlIIIIl[1]] = llIIlIIIIl[3];
                if (lIlIlIIIlllIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (lIlIlIIlIIIIl(nearest) && lIlIlIIIlllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[0]];
                        C0000a.a(nearest);
                    }
                    if (lIlIlIIlIIIIl(nearest) && lIlIlIIIllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIlIlIIIlllIl(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, llIIlIIIIl[4]);
                            "".length();
                        }
                        if (lIlIlIIIllIII(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[5]];
                            if (lIlIlIIlIIIlI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(llIIlIIIIl[6]);
                                "".length();
                            }
                            if (lIlIlIIlIIIlI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(llIIlIIIIl[5]);
                                "".length();
                            }
                            int[] iArr3 = new int[llIIlIIIIl[6]];
                            iArr3[llIIlIIIIl[1]] = llIIlIIIIl[7];
                            iArr3[llIIlIIIIl[0]] = llIIlIIIIl[8];
                            iArr3[llIIlIIIIl[5]] = llIIlIIIIl[9];
                            iArr3[llIIlIIIIl[10]] = llIIlIIIIl[11];
                            if (lIlIlIIIlllIl(C0018e.c(iArr3) ? 1 : 0)) {
                                Q();
                                System.out.println(llIIIlllIl[llIIlIIIIl[10]]);
                                bt = llIIlIIIIl[0];
                                return;
                            }
                            int[] iArr4 = new int[llIIlIIIIl[6]];
                            iArr4[llIIlIIIIl[1]] = llIIlIIIIl[7];
                            iArr4[llIIlIIIIl[0]] = llIIlIIIIl[8];
                            iArr4[llIIlIIIIl[5]] = llIIlIIIIl[9];
                            iArr4[llIIlIIIIl[10]] = llIIlIIIIl[11];
                            if (lIlIlIIIllIII(C0018e.c(iArr4) ? 1 : 0)) {
                                C0000a.a(llIIlIIIIl[7], llIIlIIIIl[12]);
                                C0000a.a(llIIlIIIIl[8], llIIlIIIIl[12]);
                                C0000a.a(llIIlIIIIl[9], llIIlIIIIl[0]);
                                C0000a.a(llIIlIIIIl[11], llIIlIIIIl[13]);
                                C0000a.a(llIIlIIIIl[14], llIIlIIIIl[13]);
                            }
                        }
                    }
                }
            }
            int[] iArr5 = new int[llIIlIIIIl[0]];
            iArr5[llIIlIIIIl[1]] = llIIlIIIIl[14];
            if (lIlIlIIIllIII(Inventory.contains(iArr5) ? 1 : 0) && lIlIlIIIlllll(Combat.getMissingHealth(), llIIlIIIIl[15])) {
                int[] iArr6 = new int[llIIlIIIIl[0]];
                iArr6[llIIlIIIIl[1]] = llIIlIIIIl[14];
                Inventory.getFirst(iArr6).interact(llIIIlllIl[llIIlIIIIl[6]]);
                Time.sleepTicks(llIIlIIIIl[5]);
                "".length();
            }
            if (lIlIlIIIllIII(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlIlIIIllIll(Movement.getRunEnergy(), llIIlIIIIl[16])) {
                Inventory.getFirst(C0019f.ba).interact(llIIIlllIl[llIIlIIIIl[13]]);
                Time.sleepTicks(llIIlIIIIl[0]);
                "".length();
            }
            if (lIlIlIIIllIll(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[0]) && lIlIlIIIllIII(an() ? 1 : 0) && lIlIlIIlIIIII(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIIlIIIIl[2])) {
                int[] iArr7 = new int[llIIlIIIIl[0]];
                iArr7[llIIlIIIIl[1]] = llIIlIIIIl[3];
                if (lIlIlIIIlllIl(Inventory.contains(iArr7) ? 1 : 0)) {
                    if (lIlIlIIIlllIl(Players.getLocal().getWorldLocation().equals(dG) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[17]];
                        if (lIlIlIIIllIII(Dialog.isOpen() ? 1 : 0) && lIlIlIIIllIll(dF, llIIlIIIIl[5])) {
                            Dialog.close();
                            dF += llIIlIIIIl[0];
                        }
                        C0018e.a(dG);
                    }
                    if (lIlIlIIIllIII(Players.getLocal().getWorldLocation().equals(dG) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[18]];
                        C0020g.a(llIIIlllIl[llIIlIIIIl[2]], cE);
                    }
                }
            }
            System.out.println("5620: " + Vars.getBit(llIIlIIIIl[19]));
            System.out.println("5621: " + Vars.getBit(llIIlIIIIl[20]));
            System.out.println("5622: " + Vars.getBit(llIIlIIIIl[21]));
            System.out.println("5623: " + Vars.getBit(llIIlIIIIl[22]));
            System.out.println("5624: " + Vars.getBit(llIIlIIIIl[23]));
            if (lIlIlIIlIIIII(Vars.getBit(llIIlIIIIl[19]), llIIlIIIIl[0])) {
                dA = llIIlIIIIl[0];
            }
            if (lIlIlIIlIIIII(Vars.getBit(llIIlIIIIl[20]), llIIlIIIIl[0])) {
                dB = llIIlIIIIl[0];
            }
            if (lIlIlIIlIIIII(Vars.getBit(llIIlIIIIl[21]), llIIlIIIIl[0])) {
                dC = llIIlIIIIl[0];
            }
            if (lIlIlIIlIIIII(Vars.getBit(llIIlIIIIl[22]), llIIlIIIIl[0])) {
                dD = llIIlIIIIl[0];
            }
            if (lIlIlIIlIIIII(Vars.getBit(llIIlIIIIl[23]), llIIlIIIIl[0])) {
                dE = llIIlIIIIl[0];
            }
            if (lIlIlIIlIIIII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[0])) {
                di = llIIlIIIIl[1];
                if (lIlIlIIIlllIl(dA ? 1 : 0)) {
                    String[] strArr = new String[llIIlIIIIl[0]];
                    strArr[llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[24]];
                    if (lIlIlIIIllIII(Inventory.contains(strArr) ? 1 : 0)) {
                        String[] strArr2 = new String[llIIlIIIIl[0]];
                        strArr2[llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[12]];
                        if (lIlIlIIIllIII(Inventory.contains(strArr2) ? 1 : 0)) {
                            String[] strArr3 = new String[llIIlIIIIl[0]];
                            strArr3[llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[25]];
                            if (lIlIlIIIlllIl(Inventory.contains(strArr3) ? 1 : 0)) {
                                String[] strArr4 = new String[llIIlIIIIl[0]];
                                strArr4[llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[15]];
                                Item first = Inventory.getFirst(strArr4);
                                String[] strArr5 = new String[llIIlIIIIl[0]];
                                strArr5[llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[26]];
                                first.useOn(Inventory.getFirst(strArr5));
                                Time.sleepTicks(llIIlIIIIl[5]);
                                "".length();
                            }
                        }
                    }
                    String[] strArr6 = new String[llIIlIIIIl[0]];
                    strArr6[llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[27]];
                    if (lIlIlIIIllIII(Inventory.contains(strArr6) ? 1 : 0)) {
                        if (lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dH), llIIlIIIIl[2])) {
                            AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[28]];
                            Movement.walkTo(dH);
                            "".length();
                            Time.sleepTicks(llIIlIIIIl[0]);
                            "".length();
                        }
                        if (lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dH), llIIlIIIIl[2])) {
                            AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[29]];
                            C0020g.a(llIIIlllIl[llIIlIIIIl[30]], cE, llIIlIIIIl[0]);
                            Time.sleepTicks(llIIlIIIIl[0]);
                            "".length();
                            List options = Dialog.getOptions();
                            ArrayList arrayList = new ArrayList();
                            if (lIlIlIIIlllIl(options.isEmpty() ? 1 : 0)) {
                                int i = llIIlIIIIl[1];
                                while (lIlIlIIIllIll(i, options.size())) {
                                    arrayList.add(((Widget) options.get(i)).getText());
                                    "".length();
                                    i++;
                                    "".length();
                                    if ("  ".length() != "  ".length()) {
                                        return;
                                    }
                                }
                                boolean anyMatch = arrayList.stream().anyMatch(str -> {
                                    return str.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[90]]);
                                });
                                boolean noneMatch = arrayList.stream().noneMatch(str2 -> {
                                    return str2.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[89]]);
                                });
                                if (lIlIlIIIllIII(anyMatch ? 1 : 0) && lIlIlIIIllIII(noneMatch ? 1 : 0)) {
                                    System.out.println(llIIIlllIl[llIIlIIIIl[31]]);
                                }
                            }
                        }
                    }
                }
                if (lIlIlIIIlllIl(dB ? 1 : 0) && lIlIlIIIllIII(dA ? 1 : 0)) {
                    if (lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dI), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[32]];
                        Movement.walkTo(dI);
                        "".length();
                        Time.sleepTicks(llIIlIIIIl[0]);
                        "".length();
                    }
                    if (lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dI), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[33]];
                        C0020g.a(llIIIlllIl[llIIlIIIIl[34]], cE, llIIlIIIIl[0]);
                        Time.sleepTicks(llIIlIIIIl[0]);
                        "".length();
                        List options2 = Dialog.getOptions();
                        ArrayList arrayList2 = new ArrayList();
                        if (lIlIlIIIlllIl(options2.isEmpty() ? 1 : 0)) {
                            int i2 = llIIlIIIIl[1];
                            while (lIlIlIIIllIll(i2, options2.size())) {
                                arrayList2.add(((Widget) options2.get(i2)).getText());
                                "".length();
                                i2++;
                                "".length();
                                if ("  ".length() >= (145 ^ 149)) {
                                    return;
                                }
                            }
                            boolean anyMatch2 = arrayList2.stream().anyMatch(str3 -> {
                                return str3.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[88]]);
                            });
                            boolean noneMatch2 = arrayList2.stream().noneMatch(str4 -> {
                                return str4.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[87]]);
                            });
                            if (lIlIlIIIllIII(anyMatch2 ? 1 : 0) && lIlIlIIIllIII(noneMatch2 ? 1 : 0)) {
                                System.out.println(llIIIlllIl[llIIlIIIIl[35]]);
                            }
                        }
                    }
                }
                if (lIlIlIIIlllIl(dC ? 1 : 0) && lIlIlIIIllIII(dB ? 1 : 0) && lIlIlIIIllIII(dA ? 1 : 0)) {
                    if (lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dJ), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[36]];
                        Movement.walkTo(dJ);
                        "".length();
                        Time.sleepTicks(llIIlIIIIl[0]);
                        "".length();
                    }
                    if (lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dJ), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[37]];
                        C0020g.a(llIIIlllIl[llIIlIIIIl[38]], cE, llIIlIIIIl[0]);
                        Time.sleepTicks(llIIlIIIIl[0]);
                        "".length();
                        List options3 = Dialog.getOptions();
                        ArrayList arrayList3 = new ArrayList();
                        if (lIlIlIIIlllIl(options3.isEmpty() ? 1 : 0)) {
                            int i3 = llIIlIIIIl[1];
                            while (lIlIlIIIllIll(i3, options3.size())) {
                                arrayList3.add(((Widget) options3.get(i3)).getText());
                                "".length();
                                i3++;
                                "".length();
                                if ("   ".length() != "   ".length()) {
                                    return;
                                }
                            }
                            boolean anyMatch3 = arrayList3.stream().anyMatch(str5 -> {
                                return str5.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[86]]);
                            });
                            boolean noneMatch3 = arrayList3.stream().noneMatch(str6 -> {
                                return str6.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[85]]);
                            });
                            if (lIlIlIIIllIII(anyMatch3 ? 1 : 0) && lIlIlIIIllIII(noneMatch3 ? 1 : 0)) {
                                System.out.println(llIIIlllIl[llIIlIIIIl[39]]);
                            }
                        }
                    }
                }
                if (lIlIlIIIlllIl(dD ? 1 : 0) && lIlIlIIIllIII(dC ? 1 : 0) && lIlIlIIIllIII(dB ? 1 : 0) && lIlIlIIIllIII(dA ? 1 : 0)) {
                    if (lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dK), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[40]];
                        Movement.walkTo(dK);
                        "".length();
                        Time.sleepTicks(llIIlIIIIl[0]);
                        "".length();
                    }
                    if (lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dK), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[41]];
                        C0020g.a(llIIIlllIl[llIIlIIIIl[42]], cE, llIIlIIIIl[0]);
                        Time.sleepTicks(llIIlIIIIl[0]);
                        "".length();
                        List options4 = Dialog.getOptions();
                        ArrayList arrayList4 = new ArrayList();
                        if (lIlIlIIIlllIl(options4.isEmpty() ? 1 : 0)) {
                            int i4 = llIIlIIIIl[1];
                            while (lIlIlIIIllIll(i4, options4.size())) {
                                arrayList4.add(((Widget) options4.get(i4)).getText());
                                "".length();
                                i4++;
                                "".length();
                                if ("  ".length() == " ".length()) {
                                    return;
                                }
                            }
                            boolean anyMatch4 = arrayList4.stream().anyMatch(str7 -> {
                                return str7.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[84]]);
                            });
                            boolean noneMatch4 = arrayList4.stream().noneMatch(str8 -> {
                                return str8.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[83]]);
                            });
                            if (lIlIlIIIllIII(anyMatch4 ? 1 : 0) && lIlIlIIIllIII(noneMatch4 ? 1 : 0)) {
                                System.out.println(llIIIlllIl[llIIlIIIIl[43]]);
                            }
                        }
                    }
                }
                if (lIlIlIIIlllIl(dE ? 1 : 0) && lIlIlIIIllIII(dD ? 1 : 0) && lIlIlIIIllIII(dC ? 1 : 0) && lIlIlIIIllIII(dB ? 1 : 0) && lIlIlIIIllIII(dA ? 1 : 0)) {
                    if (lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dL), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[44]];
                        Movement.walkTo(dL);
                        "".length();
                        Time.sleepTicks(llIIlIIIIl[0]);
                        "".length();
                    }
                    if (lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dL), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[45]];
                        C0020g.a(llIIIlllIl[llIIlIIIIl[46]], cE, llIIlIIIIl[0]);
                        Time.sleepTicks(llIIlIIIIl[0]);
                        "".length();
                        List options5 = Dialog.getOptions();
                        ArrayList arrayList5 = new ArrayList();
                        if (lIlIlIIIlllIl(options5.isEmpty() ? 1 : 0)) {
                            int i5 = llIIlIIIIl[1];
                            while (lIlIlIIIllIll(i5, options5.size())) {
                                arrayList5.add(((Widget) options5.get(i5)).getText());
                                "".length();
                                i5++;
                                "".length();
                                if ("  ".length() == ((187 ^ 135) ^ (98 ^ 90))) {
                                    return;
                                }
                            }
                            boolean anyMatch5 = arrayList5.stream().anyMatch(str9 -> {
                                return str9.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[16]]);
                            });
                            boolean anyMatch6 = arrayList5.stream().anyMatch(str10 -> {
                                return str10.contains(llIIIlllIl[llIIlIIIIl[82]]);
                            });
                            boolean noneMatch5 = arrayList5.stream().noneMatch(str11 -> {
                                return str11.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[81]]);
                            });
                            if ((!lIlIlIIIlllIl(anyMatch5 ? 1 : 0) || lIlIlIIIllIII(anyMatch6 ? 1 : 0)) && lIlIlIIIllIII(noneMatch5 ? 1 : 0)) {
                                System.out.println(llIIIlllIl[llIIlIIIIl[47]]);
                            }
                        }
                    }
                }
            }
            if (lIlIlIIlIIIII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[5])) {
                if (lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dG), llIIlIIIIl[5])) {
                    AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[48]];
                    if (lIlIlIIIllIII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    C0018e.a(dG);
                }
                if (lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dG), llIIlIIIIl[5])) {
                    AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[49]];
                    C0020g.a(llIIIlllIl[llIIlIIIIl[50]], cE);
                }
            }
            if (!lIlIlIIlIlIlI(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[10]) || lIlIlIIlIIIII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[17])) {
                C0020g.a(cE);
            }
            if (lIlIlIIlIIIII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[6])) {
                if (lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dM), llIIlIIIIl[6])) {
                    AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[51]];
                    Movement.walkTo(dM);
                    "".length();
                    Time.sleepTicks(llIIlIIIIl[0]);
                    "".length();
                }
                if (lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dM), llIIlIIIIl[6])) {
                    String[] strArr7 = new String[llIIlIIIIl[0]];
                    strArr7[llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[52]];
                    if (lIlIlIIIllIII(Inventory.contains(strArr7) ? 1 : 0)) {
                        String[] strArr8 = new String[llIIlIIIIl[0]];
                        strArr8[llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[53]];
                        Inventory.getFirst(strArr8).interact(llIIIlllIl[llIIlIIIIl[54]]);
                        Time.sleepTicks(llIIlIIIIl[10]);
                        "".length();
                    }
                }
            }
            if (lIlIlIIlIIIII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[13])) {
                if (lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dG), llIIlIIIIl[5])) {
                    AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[55]];
                    C0018e.a(dG);
                }
                if (lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dG), llIIlIIIIl[5])) {
                    AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[56]];
                    C0020g.a(llIIIlllIl[llIIlIIIIl[57]], cE);
                }
            }
            if (!lIlIlIIlIlIlI(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[18]) || lIlIlIIlIIIII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[2])) {
                if (lIlIlIIIllIll(di, llIIlIIIIl[0])) {
                    aN.sn += llIIlIIIIl[0];
                    aN.u(AccBuilderSotf.m);
                    di += llIIlIIIIl[0];
                    aN.sn = llIIlIIIIl[1];
                    dj = llIIlIIIIl[1];
                }
                String[] strArr9 = new String[llIIlIIIIl[0]];
                strArr9[llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[58]];
                if (lIlIlIIIllIII(Inventory.contains(strArr9) ? 1 : 0)) {
                    if (lIlIlIIlIIIIl(Widgets.get(llIIlIIIIl[59]))) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[60]];
                        String[] strArr10 = new String[llIIlIIIIl[0]];
                        strArr10[llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[61]];
                        Inventory.getFirst(strArr10).interact(llIIIlllIl[llIIlIIIIl[62]]);
                        Time.sleepTicks(llIIlIIIIl[6]);
                        "".length();
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[63]];
                        Widget widget = Widgets.get(llIIlIIIIl[59], llIIlIIIIl[27]);
                        if (lIlIlIIlIIIIl(widget)) {
                            widget.interact(llIIIlllIl[llIIlIIIIl[64]]);
                            Time.sleepTicks(llIIlIIIIl[0]);
                            "".length();
                        }
                        Widget widget2 = Widgets.get(llIIlIIIIl[59], llIIlIIIIl[39]);
                        if (lIlIlIIlIIIIl(widget2)) {
                            widget2.interact(llIIIlllIl[llIIlIIIIl[65]]);
                            Time.sleepTicks(llIIlIIIIl[5]);
                            "".length();
                        }
                    }
                    Time.sleepTicks(llIIlIIIIl[0]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIlIlIIIlllll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIlIIlIIlII(int i, int i2) {
        return i <= i2;
    }
}
