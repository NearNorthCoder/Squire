package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
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
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.A  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/A.class */
public class A implements M {
    private static /* synthetic */ String[] lIIIlllIllIIl;
    public static /* synthetic */ boolean by;
    static /* synthetic */ int gt;
    static /* synthetic */ int gu;
    static /* synthetic */ WorldArea gw;
    static /* synthetic */ boolean cp;
    static final /* synthetic */ int gn;
    public static /* synthetic */ WorldPoint gp;
    public static /* synthetic */ List<C0003d> bA;
    public static /* synthetic */ WorldPoint gq;
    public static /* synthetic */ WorldPoint go;
    public static /* synthetic */ WorldPoint gr;
    static /* synthetic */ int co;
    public static /* synthetic */ WorldPoint ct;
    static /* synthetic */ String[] bW;
    static /* synthetic */ int gs;
    static /* synthetic */ WorldPoint[] gv;
    private static /* synthetic */ int[] lIIIlllIlllII;

    private static boolean lIlIIlIIllllIlI(int i2, int i3) {
        return i2 == i3;
    }

    private static String lIlIIlIIllIIIll(String lllllllllllllllIIIIIlIIlIIlIIIIl, String lllllllllllllllIIIIIlIIlIIlIIIII) {
        String lllllllllllllllIIIIIlIIlIIlIIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIlIIlIIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIlIIlIIIlllll = new StringBuilder();
        char[] lllllllllllllllIIIIIlIIlIIIllllI = lllllllllllllllIIIIIlIIlIIlIIIII.toCharArray();
        int lllllllllllllllIIIIIlIIlIIIlllIl = lIIIlllIlllII[1];
        char[] charArray = lllllllllllllllIIIIIlIIlIIlIIIIl2.toCharArray();
        int length = charArray.length;
        int i2 = lIIIlllIlllII[1];
        while (lIlIIlIIllllIII(i2, length)) {
            lllllllllllllllIIIIIlIIlIIIlllll.append((char) (charArray[i2] ^ lllllllllllllllIIIIIlIIlIIIllllI[lllllllllllllllIIIIIlIIlIIIlllIl % lllllllllllllllIIIIIlIIlIIIllllI.length]));
            "".length();
            lllllllllllllllIIIIIlIIlIIIlllIl++;
            i2++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIIlIIlIIIlllll);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean S() {
        int[] iArr = new int[lIIIlllIlllII[0]];
        iArr[lIIIlllIlllII[1]] = lIIIlllIlllII[13];
        if (lIlIIlIIlllllII(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIIIlllIlllII[0]];
            iArr2[lIIIlllIlllII[1]] = lIIIlllIlllII[14];
            if (lIlIIlIIlllllII(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lIIIlllIlllII[0]];
                iArr3[lIIIlllIlllII[1]] = lIIIlllIlllII[8];
                if (lIlIIlIlIIIIIIl(Inventory.getCount(iArr3), lIIIlllIlllII[6])) {
                    int[] iArr4 = new int[lIIIlllIlllII[0]];
                    iArr4[lIIIlllIlllII[1]] = lIIIlllIlllII[11];
                    if (lIlIIlIIlllllII(Inventory.getCount(iArr4))) {
                        int[] iArr5 = new int[lIIIlllIlllII[0]];
                        iArr5[lIIIlllIlllII[1]] = lIIIlllIlllII[12];
                        if (lIlIIlIIlllllII(Inventory.getCount(iArr5))) {
                            int[] iArr6 = new int[lIIIlllIlllII[0]];
                            iArr6[lIIIlllIlllII[1]] = lIIIlllIlllII[16];
                            if (lIlIIlIIlllllII(Inventory.getCount(iArr6)) && lIlIIlIIlllllII(Inventory.getCount(C0005f.ba))) {
                                ?? r0 = lIIIlllIlllII[0];
                                "".length();
                                return ((141 ^ 159) & ((15 ^ 29) ^ (-1))) > ((68 ^ 80) & ((184 ^ 172) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
        }
        return lIIIlllIlllII[1];
    }

    private static int lIlIIlIIlllIllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static String lIlIIlIIllIIlIl(String lllllllllllllllIIIIIlIIlIIlllllI, String lllllllllllllllIIIIIlIIlIIllllIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlIIlIlIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIIlIIllllIl.getBytes(StandardCharsets.UTF_8)), lIIIlllIlllII[21]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlllIlllII[6], lllllllllllllllIIIIIlIIlIlIIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIIlIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlIIlIIllllll) {
            lllllllllllllllIIIIIlIIlIIllllll.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlIIlllIlIl() {
        lIIIlllIlllII = new int[118];
        lIIIlllIlllII[0] = " ".length();
        lIIIlllIlllII[1] = (43 ^ 53) & ((59 ^ 37) ^ (-1));
        lIIIlllIlllII[2] = 50 ^ 45;
        lIIIlllIlllII[3] = (148 ^ 154) ^ (36 ^ 78);
        lIIIlllIlllII[4] = 21 ^ 111;
        lIIIlllIlllII[5] = (-((-6548) & 32251)) & (-2049) & 32751;
        lIIIlllIlllII[6] = "  ".length();
        lIIIlllIlllII[7] = 76 ^ 72;
        lIIIlllIlllII[8] = (-20609) & 22959;
        lIIIlllIlllII[9] = "   ".length();
        lIIIlllIlllII[10] = 32 ^ 39;
        lIIIlllIlllII[11] = (-((-4067) & 12259)) & (-49) & 16247;
        lIIIlllIlllII[12] = (-24597) & 32605;
        lIIIlllIlllII[13] = (-((-5441) & 30155)) & (-65) & 27103;
        lIIIlllIlllII[14] = (-11021) & 12285;
        lIIIlllIlllII[15] = (84 ^ 31) ^ (88 ^ 22);
        lIIIlllIlllII[16] = (-29779) & 30163;
        lIIIlllIlllII[17] = 31 ^ 25;
        lIIIlllIlllII[18] = (-((-8503) & 27583)) & (-1057) & 32761;
        lIIIlllIlllII[19] = 112 ^ 122;
        lIIIlllIlllII[20] = (((36 + 77) - 23) + 55) ^ (((103 + 28) - 97) + 129);
        lIIIlllIlllII[21] = 91 ^ 83;
        lIIIlllIlllII[22] = (163 ^ 129) ^ (57 ^ 18);
        lIIIlllIlllII[23] = (((137 + 6) - 19) + 63) ^ (((62 + 167) - 99) + 46);
        lIIIlllIlllII[24] = (193 ^ 187) ^ (230 ^ 144);
        lIIIlllIlllII[25] = 88 ^ 85;
        lIIIlllIlllII[26] = (((33 + 47) - 27) + 81) ^ (((107 + 126) - 162) + 65);
        lIIIlllIlllII[27] = (157 ^ 178) ^ (129 ^ 161);
        lIIIlllIlllII[28] = (((58 + 64) - 94) + 122) ^ (((7 + 45) - (-41)) + 41);
        lIIIlllIlllII[29] = 66 ^ 83;
        lIIIlllIlllII[30] = (68 ^ 44) ^ (125 ^ 7);
        lIIIlllIlllII[31] = (223 ^ 131) ^ (30 ^ 81);
        lIIIlllIlllII[32] = 122 ^ 110;
        lIIIlllIlllII[33] = (197 ^ 193) ^ (32 ^ 49);
        lIIIlllIlllII[34] = 160 ^ 182;
        lIIIlllIlllII[35] = 107 ^ 124;
        lIIIlllIlllII[36] = (32 ^ 119) ^ (239 ^ 160);
        lIIIlllIlllII[37] = (49 ^ 92) ^ (179 ^ 199);
        lIIIlllIlllII[38] = (-((-1953) & 26593)) & (-25) & 27643;
        lIIIlllIlllII[39] = (-12963) & 16295;
        lIIIlllIlllII[40] = 15 ^ 21;
        lIIIlllIlllII[41] = (-((-27733) & 32629)) & (-24577) & 31743;
        lIIIlllIlllII[42] = (((97 + 83) - 94) + 55) ^ (((35 + 52) - 53) + 116);
        lIIIlllIlllII[43] = 74 ^ 86;
        lIIIlllIlllII[44] = (-17686) & 19957;
        lIIIlllIlllII[45] = (42 ^ 91) ^ (104 ^ 4);
        lIIIlllIlllII[46] = (201 ^ 165) ^ (112 ^ 2);
        lIIIlllIlllII[47] = (112 ^ 62) ^ (116 ^ 26);
        lIIIlllIlllII[48] = 84 ^ 117;
        lIIIlllIlllII[49] = (49 ^ 64) ^ (225 ^ 178);
        lIIIlllIlllII[50] = (((119 + 172) - 75) + 10) ^ (((21 + 136) - 15) + 51);
        lIIIlllIlllII[51] = (((33 + 123) - 146) + 117) ^ (90 ^ 1);
        lIIIlllIlllII[52] = 94 ^ 123;
        lIIIlllIlllII[53] = 13 ^ 43;
        lIIIlllIlllII[54] = (194 ^ 135) ^ (9 ^ 107);
        lIIIlllIlllII[55] = 188 ^ 148;
        lIIIlllIlllII[56] = 28 ^ 53;
        lIIIlllIlllII[57] = 79 ^ 101;
        lIIIlllIlllII[58] = (((103 + 150) - 174) + 91) ^ (((17 + 64) - (-24)) + 24);
        lIIIlllIlllII[59] = (((63 + 180) - 114) + 54) ^ (((118 + 92) - 68) + 13);
        lIIIlllIlllII[60] = (-((-1227) & 30414)) & (-2081) & 32767;
        lIIIlllIlllII[61] = (-((-2947) & 24531)) & (-10250) & 32733;
        lIIIlllIlllII[62] = (-20739) & 32718;
        lIIIlllIlllII[63] = (-((-1190) & 7351)) & (-1539) & 32699;
        lIIIlllIlllII[64] = (57 ^ 66) ^ (60 ^ 106);
        lIIIlllIlllII[65] = (212 ^ 149) ^ (76 ^ 35);
        lIIIlllIlllII[66] = (-28673) & 31647;
        lIIIlllIlllII[67] = (-24801) & 28141;
        lIIIlllIlllII[68] = (-((-345) & 29534)) & (-305) & 32703;
        lIIIlllIlllII[69] = (-24593) & 28087;
        lIIIlllIlllII[70] = (-((-2867) & 32635)) & (-2) & 32767;
        lIIIlllIlllII[71] = (-((-11363) & 32103)) & (-689) & 24573;
        lIIIlllIlllII[72] = (-((-1003) & 13295)) & (-17) & 15359;
        lIIIlllIlllII[73] = (-((-35) & 22590)) & (-129) & 32251;
        lIIIlllIlllII[74] = (-((-903) & 13271)) & (-1) & 15352;
        lIIIlllIlllII[75] = (-((-1525) & 26621)) & (-4177) & 32607;
        lIIIlllIlllII[76] = (-((-2897) & 19294)) & (-4865) & 32639;
        lIIIlllIlllII[77] = (-16739) & 17406;
        lIIIlllIlllII[78] = (((13 + 61) - (-56)) + 10) ^ (((114 + 10) - 88) + 127);
        lIIIlllIlllII[79] = (((3 + 117) - 105) + 143) ^ (((119 + 7) - 56) + 104);
        lIIIlllIlllII[80] = (109 ^ 84) ^ (85 ^ 93);
        lIIIlllIlllII[81] = 36 ^ 23;
        lIIIlllIlllII[82] = (((58 + 149) - 156) + 132) ^ (((85 + 0) - 63) + 109);
        lIIIlllIlllII[83] = 180 ^ 129;
        lIIIlllIlllII[84] = ((25 ^ 60) & ((9 ^ 44) ^ (-1))) ^ (157 ^ 171);
        lIIIlllIlllII[85] = (180 ^ 189) ^ (124 ^ 66);
        lIIIlllIlllII[86] = (((131 + 89) - 142) + 65) ^ (((4 + 33) - (-78)) + 68);
        lIIIlllIlllII[87] = (32 ^ 65) ^ (35 ^ 123);
        lIIIlllIlllII[88] = (-((-262) & 25871)) & (-33) & 28607;
        lIIIlllIlllII[89] = (-16582) & 19959;
        lIIIlllIlllII[90] = (-((-4785) & 30385)) & (-4129) & 32701;
        lIIIlllIlllII[91] = (-201) & 3579;
        lIIIlllIlllII[92] = (-25618) & 28597;
        lIIIlllIlllII[93] = (-17103) & 20479;
        lIIIlllIlllII[94] = (-(34 ^ 119)) & (-24577) & 27645;
        lIIIlllIlllII[95] = (-81) & 3454;
        lIIIlllIlllII[96] = (-16398) & 19389;
        lIIIlllIlllII[97] = (-28866) & 32235;
        lIIIlllIlllII[98] = (-"  ".length()) & (-5129) & 8125;
        lIIIlllIlllII[99] = (-593) & 3957;
        lIIIlllIlllII[100] = (-((-3004) & 32767)) & (-5) & 32767;
        lIIIlllIlllII[101] = (-24645) & 28005;
        lIIIlllIlllII[102] = (-((-15249) & 31635)) & (-5186) & 24575;
        lIIIlllIlllII[103] = (-((-15419) & 16059)) & (-24675) & 28671;
        lIIIlllIlllII[104] = (-((-27385) & 28409)) & (-66) & 4095;
        lIIIlllIlllII[105] = (-20678) & 24029;
        lIIIlllIlllII[106] = (-1089) & 4095;
        lIIIlllIlllII[107] = (-617) & 3960;
        lIIIlllIlllII[108] = (-17082) & 20413;
        lIIIlllIlllII[109] = (-((-1125) & 21861)) & (-8196) & 32255;
        lIIIlllIlllII[110] = (-29189) & 32502;
        lIIIlllIlllII[111] = (-((-17163) & 26379)) & (-4099) & 16319;
        lIIIlllIlllII[112] = (-21013) & 24317;
        lIIIlllIlllII[113] = (-((-377) & 21885)) & (-1) & 24444;
        lIIIlllIlllII[114] = (-29451) & 32763;
        lIIIlllIlllII[115] = 238 ^ 129;
        lIIIlllIlllII[116] = (42 ^ 31) ^ (195 ^ 164);
        lIIIlllIlllII[117] = 77 ^ 119;
    }

    private static boolean lIlIIlIIlllllll(int i2, int i3) {
        return i2 <= i3;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            cc();
            "".length();
            if (((201 ^ 156) & ((111 ^ 58) ^ (-1))) < 0) {
                return (176 ^ 156) & ((61 ^ 17) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIlllIlllII[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v122, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v463, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v472, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v494, types: [boolean] */
    public static void cc() {
        if (lIlIIlIIlllIlll(by ? 1 : 0)) {
            C0001b.a(bA);
            if (lIlIIlIIllllIII(bA.size(), lIIIlllIlllII[0])) {
                System.out.println(lIIIlllIllIIl[lIIIlllIlllII[1]]);
                by = lIIIlllIlllII[1];
            }
        }
        if (lIlIIlIIllllIIl(by ? 1 : 0)) {
            if (lIlIIlIIllllIII(C0004e.j(lIIIlllIlllII[2]), lIIIlllIlllII[3])) {
                v.bl();
            }
            if (lIlIIlIIllllIIl(S() ? 1 : 0) && lIlIIlIIllllIlI(C0004e.j(lIIIlllIlllII[2]), lIIIlllIlllII[3]) && lIlIIlIIllllIII(C0004e.j(lIIIlllIlllII[4]), lIIIlllIlllII[0])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIlIIllllIll(nearest) && lIlIIlIIllllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[0]];
                    C0000a.a(nearest);
                }
                if (lIlIIlIIllllIll(nearest) && lIlIIlIIlllIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIlIIllllIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIlllIlllII[5]);
                        "".length();
                    }
                    if (lIlIIlIIlllIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[6]];
                        if (lIlIIlIIlllllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIlllIlllII[7]);
                            "".length();
                        }
                        if (lIlIIlIIlllllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIlllIlllII[6]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIlllIlllII[0]];
                        iArr[lIIIlllIlllII[1]] = lIIIlllIlllII[8];
                        if (lIlIIlIIlllIlll(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIIIlllIlllII[0]];
                            iArr2[lIIIlllIlllII[1]] = lIIIlllIlllII[8];
                            if (lIlIIlIIllllIII(Bank.getFirst(iArr2).getQuantity(), lIIIlllIlllII[6])) {
                                W();
                                System.out.println(lIIIlllIllIIl[lIIIlllIlllII[9]]);
                                by = lIIIlllIlllII[0];
                                return;
                            }
                        }
                        int[] iArr3 = new int[lIIIlllIlllII[10]];
                        iArr3[lIIIlllIlllII[1]] = lIIIlllIlllII[11];
                        iArr3[lIIIlllIlllII[0]] = lIIIlllIlllII[12];
                        iArr3[lIIIlllIlllII[6]] = lIIIlllIlllII[13];
                        iArr3[lIIIlllIlllII[9]] = lIIIlllIlllII[14];
                        iArr3[lIIIlllIlllII[7]] = lIIIlllIlllII[8];
                        iArr3[lIIIlllIlllII[15]] = lIIIlllIlllII[16];
                        iArr3[lIIIlllIlllII[17]] = lIIIlllIlllII[18];
                        if (lIlIIlIIllllIIl(C0004e.b(iArr3) ? 1 : 0)) {
                            W();
                            System.out.println(lIIIlllIllIIl[lIIIlllIlllII[7]]);
                            by = lIIIlllIlllII[0];
                            return;
                        }
                        int[] iArr4 = new int[lIIIlllIlllII[10]];
                        iArr4[lIIIlllIlllII[1]] = lIIIlllIlllII[11];
                        iArr4[lIIIlllIlllII[0]] = lIIIlllIlllII[12];
                        iArr4[lIIIlllIlllII[6]] = lIIIlllIlllII[13];
                        iArr4[lIIIlllIlllII[9]] = lIIIlllIlllII[14];
                        iArr4[lIIIlllIlllII[7]] = lIIIlllIlllII[8];
                        iArr4[lIIIlllIlllII[15]] = lIIIlllIlllII[16];
                        iArr4[lIIIlllIlllII[17]] = lIIIlllIlllII[18];
                        if (lIlIIlIIlllIlll(C0004e.b(iArr4) ? 1 : 0)) {
                            C0000a.a(lIIIlllIlllII[11], lIIIlllIlllII[19]);
                            C0000a.a(lIIIlllIlllII[12], lIIIlllIlllII[19]);
                            C0000a.a(lIIIlllIlllII[13], lIIIlllIlllII[0]);
                            C0000a.a(lIIIlllIlllII[14], lIIIlllIlllII[0]);
                            C0000a.a(lIIIlllIlllII[8], lIIIlllIlllII[6]);
                            C0000a.a(lIIIlllIlllII[18], lIIIlllIlllII[7]);
                            C0000a.a(lIIIlllIlllII[16], lIIIlllIlllII[19]);
                        }
                    }
                }
            }
            if (lIlIIlIIlllIlll(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIIlIIllllIII(Movement.getRunEnergy(), lIIIlllIlllII[20])) {
                Inventory.getFirst(C0005f.ba).interact(lIIIlllIllIIl[lIIIlllIlllII[15]]);
                Time.sleepTicks(lIIIlllIlllII[0]);
                "".length();
            }
            if (lIlIIlIIlllllIl(lIlIIlIIlllIllI(C0004e.v(), 50.0d))) {
                int[] iArr5 = new int[lIIIlllIlllII[0]];
                iArr5[lIIIlllIlllII[1]] = lIIIlllIlllII[16];
                if (lIlIIlIIlllIlll(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lIIIlllIlllII[0]];
                    iArr6[lIIIlllIlllII[1]] = lIIIlllIlllII[16];
                    Inventory.getFirst(iArr6).interact(lIIIlllIllIIl[lIIIlllIlllII[17]]);
                    Time.sleepTicks(lIIIlllIlllII[6]);
                    "".length();
                }
            }
            if (lIlIIlIIlllIlll(S() ? 1 : 0) && lIlIIlIIllllIIl(C0004e.j(lIIIlllIlllII[4]))) {
                if (lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlllII[17])) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[10]];
                    if (lIlIIlIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(ct);
                    "".length();
                    Time.sleepTicks(lIIIlllIlllII[0]);
                    "".length();
                }
                if (lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlllII[17])) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[21]];
                    C0006g.a(lIIIlllIllIIl[lIIIlllIlllII[22]], bW);
                }
            }
            if (lIlIIlIIllllIlI(C0004e.j(lIIIlllIlllII[4]), lIIIlllIlllII[0])) {
                co = lIIIlllIlllII[1];
                if (lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(go), lIIIlllIlllII[15])) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[19]];
                    Movement.walkTo(go);
                    "".length();
                    Time.sleepTicks(lIIIlllIlllII[0]);
                    "".length();
                }
                if (lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(go), lIIIlllIlllII[15])) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[23]];
                    C0006g.a(lIIIlllIllIIl[lIIIlllIlllII[24]], bW);
                }
            }
            if (!lIlIIlIlIIIIIII(C0004e.j(lIIIlllIlllII[4]), lIIIlllIlllII[6]) || lIlIIlIIllllIlI(C0004e.j(lIIIlllIlllII[4]), lIIIlllIlllII[9])) {
                if (lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(gp), lIIIlllIlllII[17])) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[25]];
                    if (lIlIIlIIllllIII(Skills.getLevel(Skill.AGILITY), lIIIlllIlllII[15])) {
                        if (lIlIIlIIlllIlll(gw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Walker.walkAlong(Arrays.asList(gv), new HashMap());
                            "".length();
                            Time.sleepTicks(lIIIlllIlllII[0]);
                            "".length();
                        }
                        if (lIlIIlIIllllIIl(gw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo(gp);
                            "".length();
                            Time.sleepTicks(lIIIlllIlllII[0]);
                            "".length();
                        }
                    }
                    if (lIlIIlIlIIIIIIl(Skills.getLevel(Skill.AGILITY), lIIIlllIlllII[15])) {
                        Movement.walkTo(gp);
                        "".length();
                        Time.sleepTicks(lIIIlllIlllII[0]);
                        "".length();
                    }
                }
                if (lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(gp), lIIIlllIlllII[17])) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[26]];
                    C0006g.a(lIIIlllIllIIl[lIIIlllIlllII[27]], bW);
                }
            }
            if (lIlIIlIIllllIlI(C0004e.j(lIIIlllIlllII[4]), lIIIlllIlllII[7])) {
                int[] iArr7 = new int[lIIIlllIlllII[0]];
                iArr7[lIIIlllIlllII[1]] = gt;
                if (lIlIIlIIllllIIl(Inventory.contains(iArr7) ? 1 : 0)) {
                    if (lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(gq), lIIIlllIlllII[17])) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[28]];
                        Movement.walkTo(gq);
                        "".length();
                        Time.sleepTicks(lIIIlllIlllII[0]);
                        "".length();
                    }
                    if (lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(gq), lIIIlllIlllII[17])) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[29]];
                        int[] iArr8 = new int[lIIIlllIlllII[0]];
                        iArr8[lIIIlllIlllII[1]] = gs;
                        if (lIlIIlIIllllIll(TileObjects.getNearest(iArr8))) {
                            int[] iArr9 = new int[lIIIlllIlllII[0]];
                            iArr9[lIIIlllIlllII[1]] = gs;
                            TileObjects.getNearest(iArr9).interact(lIIIlllIllIIl[lIIIlllIlllII[30]]);
                            Time.sleepTicks(lIIIlllIlllII[6]);
                            "".length();
                        }
                    }
                }
            }
            if (lIlIIlIIllllIlI(C0004e.j(lIIIlllIlllII[4]), lIIIlllIlllII[7])) {
                int[] iArr10 = new int[lIIIlllIlllII[0]];
                iArr10[lIIIlllIlllII[1]] = gt;
                if (lIlIIlIIlllIlll(Inventory.contains(iArr10) ? 1 : 0)) {
                    if (lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlllII[17])) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[31]];
                        Movement.walkTo(ct);
                        "".length();
                        Time.sleepTicks(lIIIlllIlllII[0]);
                        "".length();
                    }
                    if (lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlllII[17])) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[32]];
                        C0006g.a(lIIIlllIllIIl[lIIIlllIlllII[33]], bW);
                    }
                }
            }
            if (lIlIIlIIllllIlI(C0004e.j(lIIIlllIlllII[4]), lIIIlllIlllII[15])) {
                String[] strArr = new String[lIIIlllIlllII[0]];
                strArr[lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[34]];
                if (lIlIIlIIlllIlll(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIIlllIlllII[0]];
                    strArr2[lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[35]];
                    if (lIlIIlIIllllIIl(Inventory.contains(strArr2) ? 1 : 0)) {
                        if (lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(gr), lIIIlllIlllII[9])) {
                            AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[36]];
                            Movement.walkTo(gr);
                            "".length();
                            Time.sleepTicks(lIIIlllIlllII[0]);
                            "".length();
                        }
                        if (lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(gr), lIIIlllIlllII[9])) {
                            AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[37]];
                            WorldArea worldArea = new WorldArea(lIIIlllIlllII[38], lIIIlllIlllII[39], lIIIlllIlllII[21], lIIIlllIlllII[7], lIIIlllIlllII[6]);
                            String[] strArr3 = new String[lIIIlllIlllII[0]];
                            strArr3[lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[40]];
                            NPC nearest2 = NPCs.getNearest(strArr3);
                            if (lIlIIlIIllllIll(nearest2) && lIlIIlIIlllIlll(worldArea.contains(nearest2.getWorldLocation()) ? 1 : 0)) {
                                C0004e.C();
                            }
                            int[] iArr11 = new int[lIIIlllIlllII[0]];
                            iArr11[lIIIlllIlllII[1]] = lIIIlllIlllII[41];
                            TileObject nearest3 = TileObjects.getNearest(iArr11);
                            if (lIlIIlIIllllIll(nearest3)) {
                                String[] strArr4 = new String[lIIIlllIlllII[0]];
                                strArr4[lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[42]];
                                if (lIlIIlIIlllIlll(nearest3.hasAction(strArr4) ? 1 : 0)) {
                                    nearest3.interact(lIIIlllIllIIl[lIIIlllIlllII[43]]);
                                    Time.sleepTicks(lIIIlllIlllII[6]);
                                    "".length();
                                }
                            }
                            int[] iArr12 = new int[lIIIlllIlllII[0]];
                            iArr12[lIIIlllIlllII[1]] = lIIIlllIlllII[44];
                            TileObject nearest4 = TileObjects.getNearest(iArr12);
                            if (lIlIIlIIllllIll(nearest4)) {
                                String[] strArr5 = new String[lIIIlllIlllII[0]];
                                strArr5[lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[45]];
                                if (lIlIIlIIlllIlll(nearest4.hasAction(strArr5) ? 1 : 0)) {
                                    nearest4.interact(lIIIlllIllIIl[lIIIlllIlllII[46]]);
                                    Time.sleepTicks(lIIIlllIlllII[6]);
                                    "".length();
                                    if (lIlIIlIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.continueSpace();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (lIlIIlIIllllIlI(C0004e.j(lIIIlllIlllII[4]), lIIIlllIlllII[15])) {
                String[] strArr6 = new String[lIIIlllIlllII[0]];
                strArr6[lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[2]];
                if (lIlIIlIIlllIlll(Inventory.contains(strArr6) ? 1 : 0)) {
                    String[] strArr7 = new String[lIIIlllIlllII[0]];
                    strArr7[lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[47]];
                    if (lIlIIlIIlllIlll(Inventory.contains(strArr7) ? 1 : 0)) {
                        if (lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(gp), lIIIlllIlllII[17])) {
                            AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[48]];
                            if (lIlIIlIIllllIII(Skills.getLevel(Skill.AGILITY), lIIIlllIlllII[15])) {
                                if (lIlIIlIIlllIlll(gw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Walker.walkAlong(Arrays.asList(gv), new HashMap());
                                    "".length();
                                    Time.sleepTicks(lIIIlllIlllII[0]);
                                    "".length();
                                }
                                if (lIlIIlIIllllIIl(gw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo(gp);
                                    "".length();
                                    Time.sleepTicks(lIIIlllIlllII[0]);
                                    "".length();
                                }
                            }
                            if (lIlIIlIlIIIIIIl(Skills.getLevel(Skill.AGILITY), lIIIlllIlllII[15])) {
                                Movement.walkTo(gp);
                                "".length();
                                Time.sleepTicks(lIIIlllIlllII[0]);
                                "".length();
                            }
                        }
                        if (lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(gp), lIIIlllIlllII[17])) {
                            AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[49]];
                            C0006g.a(lIIIlllIllIIl[lIIIlllIlllII[50]], bW);
                        }
                    }
                }
            }
            if (lIlIIlIIllllIlI(C0004e.j(lIIIlllIlllII[4]), lIIIlllIlllII[17])) {
                String[] strArr8 = new String[lIIIlllIlllII[0]];
                strArr8[lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[51]];
                if (lIlIIlIIlllllII(Inventory.getCount(strArr8))) {
                    String[] strArr9 = new String[lIIIlllIlllII[0]];
                    strArr9[lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[52]];
                    if (lIlIIlIIllllIII(Inventory.getCount(strArr9), lIIIlllIlllII[0])) {
                        if (lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(gp), lIIIlllIlllII[17])) {
                            AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[53]];
                            Movement.walkTo(gp);
                            "".length();
                            Time.sleepTicks(lIIIlllIlllII[0]);
                            "".length();
                        }
                        if (lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(gp), lIIIlllIlllII[17])) {
                            AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[54]];
                            C0006g.a(lIIIlllIllIIl[lIIIlllIlllII[55]], bW);
                        }
                    }
                }
            }
            if (lIlIIlIIllllIlI(C0004e.j(lIIIlllIlllII[4]), lIIIlllIlllII[17])) {
                String[] strArr10 = new String[lIIIlllIlllII[0]];
                strArr10[lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[56]];
                if (lIlIIlIIlllllII(Inventory.getCount(strArr10))) {
                    if (lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlllII[17])) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[57]];
                        Movement.walkTo(ct);
                        "".length();
                        Time.sleepTicks(lIIIlllIlllII[0]);
                        "".length();
                    }
                    if (lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlllII[17])) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[58]];
                        if (lIlIIlIIllllIII(co, lIIIlllIlllII[0])) {
                            P.lv += lIIIlllIlllII[0];
                            P.d(AccBuilderRat.m);
                            co += lIIIlllIlllII[0];
                            P.lv = lIIIlllIlllII[1];
                            cp = lIIIlllIlllII[1];
                        }
                        C0006g.a(lIIIlllIllIIl[lIIIlllIlllII[59]], bW);
                    }
                }
            }
            C0006g.a(new String[lIIIlllIlllII[1]]);
        }
    }

    private static boolean lIlIIlIIlllIlll(int i2) {
        return i2 != 0;
    }

    private static void lIlIIlIIlllIIIl() {
        lIIIlllIllIIl = new String[lIIIlllIlllII[117]];
        lIIIlllIllIIl[lIIIlllIlllII[1]] = lIlIIlIIllIIIll("MDAsBgYePCZPFwMgKwESVjA2ChgFdWIcAh8tIQccGD5iDRQVMmIbGlYoNwoGAg==", "vYBou");
        lIIIlllIllIIl[lIIIlllIlllII[0]] = lIlIIlIIllIIlII("aKJN4qDwnfFmFMGHd6Q5JA==", "UuFPv");
        lIIIlllIllIIl[lIIIlllIlllII[6]] = lIlIIlIIllIIIll("KzEDKDoKPgpsNAI+BiU4BA==", "cPmLV");
        lIIIlllIllIIl[lIIIlllIlllII[9]] = lIlIIlIIllIIIll("Gx1YDzUpWBUHND8RFglnPQ0dHTNsCw0eNyARHR1rbAsPBzMvEBEAIGwMF04FGSExIAA=", "LxxnG");
        lIIIlllIllIIl[lIIIlllIlllII[7]] = lIlIIlIIllIIlII("AeFzuyokRNP8R+INHSUZ+XUsfdR0eeP2KReiYzjPB72e2y7R7VQ/6ruFYIdIwuaxKpIq90V/68M=", "VrxZG");
        lIIIlllIllIIl[lIIIlllIlllII[15]] = lIlIIlIIllIIlII("y86bem+MYgU=", "ALyve");
        lIIIlllIllIIl[lIIIlllIlllII[17]] = lIlIIlIIllIIlIl("+nta1/Dsf4E=", "gVUVZ");
        lIIIlllIllIIl[lIIIlllIlllII[10]] = lIlIIlIIllIIlII("RFCHE75vYQneL8yNOENkhA==", "KJxiH");
        lIIIlllIllIIl[lIIIlllIlllII[21]] = lIlIIlIIllIIlII("1FxAtLdhTee3YhPsWkneew==", "iWbiN");
        lIIIlllIllIIl[lIIIlllIlllII[22]] = lIlIIlIIllIIlIl("RjzJHKta/zM=", "CSCnt");
        lIIIlllIllIIl[lIIIlllIlllII[19]] = lIlIIlIIllIIIll("HAMTSx89QgkCCSADFxJLNRcc", "Rbekk");
        lIIIlllIllIIl[lIIIlllIlllII[23]] = lIlIIlIIllIIIll("JAoCCGEEBE4PKBIZDxE4UAwbGg==", "pkncA");
        lIIIlllIllIIl[lIIIlllIlllII[24]] = lIlIIlIIllIIlIl("8ihvJWLQnjg=", "KZxOU");
        lIIIlllIllIIl[lIIIlllIlllII[25]] = lIlIIlIIllIIlII("UN9cQS4t2rjjvtP5U1VMlw==", "yGaZw");
        lIIIlllIllIIl[lIIIlllIlllII[26]] = lIlIIlIIllIIlIl("/xS7QTNYPJDXtOMR0IxWWQ==", "wKXLi");
        lIIIlllIllIIl[lIIIlllIlllII[27]] = lIlIIlIIllIIlII("/q/AjfpG+Mc=", "JhKwu");
        lIIIlllIllIIl[lIIIlllIlllII[28]] = lIlIIlIIllIIlII("n8xliqnM2eq0+4kFTNaP/Q==", "hcyFx");
        lIIIlllIllIIl[lIIIlllIlllII[29]] = lIlIIlIIllIIIll("DzMqCVowNScH", "BZDlz");
        lIIIlllIllIIl[lIIIlllIlllII[30]] = lIlIIlIIllIIIll("GwgnPA==", "VaIYC");
        lIIIlllIllIIl[lIIIlllIlllII[31]] = lIlIIlIIllIIlIl("9XfTKnfLuK2hfpf6DLgjYQ==", "GFMBL");
        lIIIlllIllIIl[lIIIlllIlllII[32]] = lIlIIlIIllIIIll("EiwEE2M1PB0RMSM=", "FMhxC");
        lIIIlllIllIIl[lIIIlllIlllII[33]] = lIlIIlIIllIIlIl("non0canFTp4=", "mwayl");
        lIIIlllIllIIl[lIIIlllIlllII[34]] = lIlIIlIIllIIlII("Ut+AEwepjEg7k8BQBO+YjQ==", "QQOtA");
        lIIIlllIllIIl[lIIIlllIlllII[35]] = lIlIIlIIllIIlIl("zx++swPVsWIlhkqA9TMDEw==", "ValcD");
        lIIIlllIllIIl[lIIIlllIlllII[36]] = lIlIIlIIllIIlIl("mxnhkrsxwKTfLA7+9OyiRw==", "sJAyh");
        lIIIlllIllIIl[lIIIlllIlllII[37]] = lIlIIlIIllIIlIl("ZVKZGcIlCUJi2p6LCIFO4yqsaOtX8iyv", "XeOra");
        lIIIlllIllIIl[lIIIlllIlllII[40]] = lIlIIlIIllIIIll("ABMech4qDAU8", "SzlRH");
        lIIIlllIllIIl[lIIIlllIlllII[42]] = lIlIIlIIllIIlII("/IY63v8cNBY=", "UMGkP");
        lIIIlllIllIIl[lIIIlllIlllII[43]] = lIlIIlIIllIIlII("BRAsf9iqtzk=", "QSZiX");
        lIIIlllIllIIl[lIIIlllIlllII[45]] = lIlIIlIIllIIlIl("uvxncasmEvc=", "hBfSs");
        lIIIlllIllIIl[lIIIlllIlllII[46]] = lIlIIlIIllIIlIl("9VEapMAFuDY=", "WSbwf");
        lIIIlllIllIIl[lIIIlllIlllII[2]] = lIlIIlIIllIIlIl("1ZV8+DPq7QimH7Dhb2YYLw==", "tBWVB");
        lIIIlllIllIIl[lIIIlllIlllII[47]] = lIlIIlIIllIIlII("Cnlm1etAsl1hxd2X7YcdTg==", "IlETh");
        lIIIlllIllIIl[lIIIlllIlllII[48]] = lIlIIlIIllIIlIl("eTv4RmiyRFzGp2T/XYozeg==", "TunFv");
        lIIIlllIllIIl[lIIIlllIlllII[49]] = lIlIIlIIllIIlII("nY2OdsbDjII62SDTelu5sA==", "EkwEI");
        lIIIlllIllIIl[lIIIlllIlllII[50]] = lIlIIlIIllIIlIl("t2BX86gbVq8=", "ukYuS");
        lIIIlllIllIIl[lIIIlllIlllII[51]] = lIlIIlIIllIIlIl("x0p4+FGCE6px31lHzTX0Gg==", "QiOXu");
        lIIIlllIllIIl[lIIIlllIlllII[52]] = lIlIIlIIllIIlIl("dFQ/kMKFGDKV+hu7TmDuxQ==", "Bgidp");
        lIIIlllIllIIl[lIIIlllIlllII[53]] = lIlIIlIIllIIlIl("joYiYzFD/J7vNt2DYA2Q/w==", "ojiMF");
        lIIIlllIllIIl[lIIIlllIlllII[54]] = lIlIIlIIllIIIll("GAUEG2Q4C0g0Ew02Lg==", "LdhpD");
        lIIIlllIllIIl[lIIIlllIlllII[55]] = lIlIIlIIllIIlII("/7dtOzuEvvQ=", "JyGHI");
        lIIIlllIllIIl[lIIIlllIlllII[56]] = lIlIIlIIllIIIll("Jh8WMy8QFkMyMQsBBw==", "dscAF");
        lIIIlllIllIIl[lIIIlllIlllII[57]] = lIlIIlIIllIIlII("wd7FvWDXzi5VvcMl9cIaaA==", "LfsGc");
        lIIIlllIllIIl[lIIIlllIlllII[58]] = lIlIIlIIllIIlIl("NXEHIsKtyToQxjnpRUTHlw==", "CvPxD");
        lIIIlllIllIIl[lIIIlllIlllII[59]] = lIlIIlIIllIIlII("RpzgsszEXWo=", "PlKZR");
        lIIIlllIllIIl[lIIIlllIlllII[64]] = lIlIIlIIllIIlII("Jqm0ufaZtqTxu3kpL8fssQ==", "AMPuN");
        lIIIlllIllIIl[lIIIlllIlllII[65]] = lIlIIlIIllIIlII("EngKIGvOwJCK6SJ5m0cjRPZTxsrmuGJ0", "wvjHv");
        lIIIlllIllIIl[lIIIlllIlllII[78]] = lIlIIlIIllIIlII("aBgF0JnkJ0zJzeN2nXAHMX0uDcLD8VUiEi3l9fa5IKo=", "KKEFy");
        lIIIlllIllIIl[lIIIlllIlllII[79]] = lIlIIlIIllIIlII("UlRj9TxkfuJlknfI3y1zPOwYqIj/aiYA/hN+ibNK24I44jDhRcbyNw==", "MhRfG");
        lIIIlllIllIIl[lIIIlllIlllII[80]] = lIlIIlIIllIIlIl("j2Ly14jVqZPRqNUEE836fYD63+KWJJfT4avlD+1cgX8thJmZX1EE5kxl4hbv4scP", "qJkgb");
        lIIIlllIllIIl[lIIIlllIlllII[20]] = lIlIIlIIllIIlIl("llyEdv4lPPOBdPp8Op2PLNrbURP6YUTs", "LuBoA");
        lIIIlllIllIIl[lIIIlllIlllII[81]] = lIlIIlIIllIIIll("GCMwPXQrJHEwOzprOic7OGswKzs6P3E9PCprGCQ3LiU1JnQrPDA7Iio4bg==", "OKQIT");
        lIIIlllIllIIl[lIIIlllIlllII[82]] = lIlIIlIIllIIIll("HAYoFxYnACsVQioFNhdM", "OiErb");
        lIIIlllIllIIl[lIIIlllIlllII[83]] = lIlIIlIIllIIlIl("O4i27uRLzL2aWVKglpsWkWLC7JfmdtPHWRooBAvBvls=", "BDugp");
        lIIIlllIllIIl[lIIIlllIlllII[84]] = lIlIIlIIllIIIll("ChgcdBUmDFI5DSIcUjVMOgkXNwUoFVInGyYLFnQKJgtSOQl2", "IyrTl");
        lIIIlllIllIIl[lIIIlllIlllII[85]] = lIlIIlIIllIIlII("mB3Vu1+lhf43mbpguZBhuKPtPhOyAyRS", "vSlBg");
        lIIIlllIllIIl[lIIIlllIlllII[86]] = lIlIIlIIllIIlIl("LjiH+6PKBHEIPBz0E2sCFSIEZp0EuN1fZfeTd2Ao/bTj3CQVpF1MqkSdq9cGFipD", "ZIOkS");
        lIIIlllIllIIl[lIIIlllIlllII[87]] = lIlIIlIIllIIlIl("L09zGAB6dxs=", "rtqBh");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIlIlIIIIIIl(C0004e.j(lIIIlllIlllII[4]), lIIIlllIlllII[10])) {
            ?? r0 = lIIIlllIlllII[0];
            "".length();
            return " ".length() <= ((119 ^ 101) & ((92 ^ 78) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIlllIlllII[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIIlllIlllII[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e2, code lost:
        if (lIlIIlIIllllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.A.lIIIlllIlllII[6]) != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void W() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[lIIIlllIlllII[0]];
        iArr5[lIIIlllIlllII[1]] = lIIIlllIlllII[18];
        if (lIlIIlIIllllIIl(Bank.contains(iArr5) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIlllII[18], lIIIlllIlllII[15], C0007h.bv));
            "".length();
        }
        int[] iArr6 = new int[lIIIlllIlllII[0]];
        iArr6[lIIIlllIlllII[1]] = lIIIlllIlllII[13];
        if (lIlIIlIIllllIIl(Bank.contains(iArr6) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIlllII[13], lIIIlllIlllII[0], C0007h.bv));
            "".length();
        }
        int[] iArr7 = new int[lIIIlllIlllII[0]];
        iArr7[lIIIlllIlllII[1]] = lIIIlllIlllII[8];
        if (lIlIIlIIlllIlll(Bank.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[lIIIlllIlllII[0]];
            iArr8[lIIIlllIlllII[1]] = lIIIlllIlllII[8];
            if (lIlIIlIIlllIlll(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIIlllIlllII[0]];
                iArr9[lIIIlllIlllII[1]] = lIIIlllIlllII[8];
            }
            iArr = new int[lIIIlllIlllII[0]];
            iArr[lIIIlllIlllII[1]] = lIIIlllIlllII[14];
            if (lIlIIlIIllllIIl(Bank.contains(iArr) ? 1 : 0)) {
                bA.add(new C0003d(lIIIlllIlllII[14], lIIIlllIlllII[0], C0007h.bv));
                "".length();
            }
            iArr2 = new int[lIIIlllIlllII[0]];
            iArr2[lIIIlllIlllII[1]] = lIIIlllIlllII[16];
            if (lIlIIlIIllllIIl(Bank.contains(iArr2) ? 1 : 0)) {
                bA.add(new C0003d(lIIIlllIlllII[16], lIIIlllIlllII[27], lIIIlllIlllII[60]));
                "".length();
            }
            iArr3 = new int[lIIIlllIlllII[0]];
            iArr3[lIIIlllIlllII[1]] = lIIIlllIlllII[12];
            if (lIlIIlIIllllIIl(Bank.contains(iArr3) ? 1 : 0)) {
                bA.add(new C0003d(lIIIlllIlllII[12], lIIIlllIlllII[19], lIIIlllIlllII[61]));
                "".length();
            }
            if (lIlIIlIIllllIIl(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIIIlllIllIIl[lIIIlllIlllII[65]]);
            }) ? 1 : 0)) {
                bA.add(new C0003d(lIIIlllIlllII[62], lIIIlllIlllII[15], lIIIlllIlllII[63]));
                "".length();
            }
            iArr4 = new int[lIIIlllIlllII[0]];
            iArr4[lIIIlllIlllII[1]] = lIIIlllIlllII[11];
            if (lIlIIlIIllllIIl(Bank.contains(iArr4) ? 1 : 0)) {
                return;
            }
            bA.add(new C0003d(lIIIlllIlllII[11], lIIIlllIlllII[55], lIIIlllIlllII[61]));
            "".length();
            return;
        }
        bA.add(new C0003d(lIIIlllIlllII[8], lIIIlllIlllII[6], C0007h.bv));
        "".length();
        iArr = new int[lIIIlllIlllII[0]];
        iArr[lIIIlllIlllII[1]] = lIIIlllIlllII[14];
        if (lIlIIlIIllllIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lIIIlllIlllII[0]];
        iArr2[lIIIlllIlllII[1]] = lIIIlllIlllII[16];
        if (lIlIIlIIllllIIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIIIlllIlllII[0]];
        iArr3[lIIIlllIlllII[1]] = lIIIlllIlllII[12];
        if (lIlIIlIIllllIIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
        if (lIlIIlIIllllIIl(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIIlllIllIIl[lIIIlllIlllII[65]]);
        }) ? 1 : 0)) {
        }
        iArr4 = new int[lIIIlllIlllII[0]];
        iArr4[lIIIlllIlllII[1]] = lIIIlllIlllII[11];
        if (lIlIIlIIllllIIl(Bank.contains(iArr4) ? 1 : 0)) {
        }
    }

    private static boolean lIlIIlIIlllllIl(int i2) {
        return i2 < 0;
    }

    static {
        lIlIIlIIlllIlIl();
        lIlIIlIIlllIIIl();
        gn = lIIIlllIlllII[4];
        bA = new ArrayList();
        ct = new WorldPoint(lIIIlllIlllII[66], lIIIlllIlllII[67], lIIIlllIlllII[1]);
        go = new WorldPoint(lIIIlllIlllII[68], lIIIlllIlllII[69], lIIIlllIlllII[1]);
        gp = new WorldPoint(lIIIlllIlllII[70], lIIIlllIlllII[71], lIIIlllIlllII[1]);
        gq = new WorldPoint(lIIIlllIlllII[72], lIIIlllIlllII[73], lIIIlllIlllII[1]);
        gr = new WorldPoint(lIIIlllIlllII[74], lIIIlllIlllII[75], lIIIlllIlllII[6]);
        gs = lIIIlllIlllII[76];
        gt = lIIIlllIlllII[77];
        gu = lIIIlllIlllII[41];
        String[] strArr = new String[lIIIlllIlllII[23]];
        strArr[lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[78]];
        strArr[lIIIlllIlllII[0]] = lIIIlllIllIIl[lIIIlllIlllII[79]];
        strArr[lIIIlllIlllII[6]] = lIIIlllIllIIl[lIIIlllIlllII[80]];
        strArr[lIIIlllIlllII[9]] = lIIIlllIllIIl[lIIIlllIlllII[20]];
        strArr[lIIIlllIlllII[7]] = lIIIlllIllIIl[lIIIlllIlllII[81]];
        strArr[lIIIlllIlllII[15]] = lIIIlllIllIIl[lIIIlllIlllII[82]];
        strArr[lIIIlllIlllII[17]] = lIIIlllIllIIl[lIIIlllIlllII[83]];
        strArr[lIIIlllIlllII[10]] = lIIIlllIllIIl[lIIIlllIlllII[84]];
        strArr[lIIIlllIlllII[21]] = lIIIlllIllIIl[lIIIlllIlllII[85]];
        strArr[lIIIlllIlllII[22]] = lIIIlllIllIIl[lIIIlllIlllII[86]];
        strArr[lIIIlllIlllII[19]] = lIIIlllIllIIl[lIIIlllIlllII[87]];
        bW = strArr;
        WorldPoint[] worldPointArr = new WorldPoint[lIIIlllIlllII[26]];
        worldPointArr[lIIIlllIlllII[1]] = new WorldPoint(lIIIlllIlllII[88], lIIIlllIlllII[89], lIIIlllIlllII[1]);
        worldPointArr[lIIIlllIlllII[0]] = new WorldPoint(lIIIlllIlllII[90], lIIIlllIlllII[91], lIIIlllIlllII[1]);
        worldPointArr[lIIIlllIlllII[6]] = new WorldPoint(lIIIlllIlllII[92], lIIIlllIlllII[93], lIIIlllIlllII[1]);
        worldPointArr[lIIIlllIlllII[9]] = new WorldPoint(lIIIlllIlllII[94], lIIIlllIlllII[95], lIIIlllIlllII[1]);
        worldPointArr[lIIIlllIlllII[7]] = new WorldPoint(lIIIlllIlllII[96], lIIIlllIlllII[97], lIIIlllIlllII[1]);
        worldPointArr[lIIIlllIlllII[15]] = new WorldPoint(lIIIlllIlllII[98], lIIIlllIlllII[99], lIIIlllIlllII[1]);
        worldPointArr[lIIIlllIlllII[17]] = new WorldPoint(lIIIlllIlllII[100], lIIIlllIlllII[101], lIIIlllIlllII[1]);
        worldPointArr[lIIIlllIlllII[10]] = new WorldPoint(lIIIlllIlllII[102], lIIIlllIlllII[103], lIIIlllIlllII[1]);
        worldPointArr[lIIIlllIlllII[21]] = new WorldPoint(lIIIlllIlllII[104], lIIIlllIlllII[105], lIIIlllIlllII[1]);
        worldPointArr[lIIIlllIlllII[22]] = new WorldPoint(lIIIlllIlllII[106], lIIIlllIlllII[107], lIIIlllIlllII[1]);
        worldPointArr[lIIIlllIlllII[19]] = new WorldPoint(lIIIlllIlllII[106], lIIIlllIlllII[108], lIIIlllIlllII[1]);
        worldPointArr[lIIIlllIlllII[23]] = new WorldPoint(lIIIlllIlllII[104], lIIIlllIlllII[109], lIIIlllIlllII[1]);
        worldPointArr[lIIIlllIlllII[24]] = new WorldPoint(lIIIlllIlllII[104], lIIIlllIlllII[110], lIIIlllIlllII[1]);
        worldPointArr[lIIIlllIlllII[25]] = new WorldPoint(lIIIlllIlllII[111], lIIIlllIlllII[112], lIIIlllIlllII[1]);
        gv = worldPointArr;
        gw = new WorldArea(lIIIlllIlllII[113], lIIIlllIlllII[114], lIIIlllIlllII[115], lIIIlllIlllII[116], lIIIlllIlllII[1]);
    }

    private static boolean lIlIIlIIlllllII(int i2) {
        return i2 > 0;
    }

    private static boolean lIlIIlIIllllIII(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlIIlIIllllIIl(int i2) {
        return i2 == 0;
    }

    private static boolean lIlIIlIlIIIIIIl(int i2, int i3) {
        return i2 >= i3;
    }

    private static String lIlIIlIIllIIlII(String lllllllllllllllIIIIIlIIlIIllIIIl, String lllllllllllllllIIIIIlIIlIIllIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIIlIIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIlIIlIIllIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIlIIlIIllIIll.init(lIIIlllIlllII[6], secretKeySpec);
            return new String(lllllllllllllllIIIIIlIIlIIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIIlIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlIIlIIllIIlI) {
            lllllllllllllllIIIIIlIIlIIllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIllllIll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIlIIllllllI(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean lIlIIlIlIIIIIII(int i2, int i3) {
        return i2 != i3;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIIlllIllIIl[lIIIlllIlllII[64]];
    }
}
