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
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.H  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/H.class */
public class H implements S {
    static /* synthetic */ int hw;
    public static /* synthetic */ WorldPoint dv;
    public static /* synthetic */ boolean bs;
    static final /* synthetic */ int hp;
    static /* synthetic */ boolean cl;
    public static /* synthetic */ WorldPoint hq;
    static /* synthetic */ String[] bQ;
    private static /* synthetic */ int[] lIIIIIIllIl;
    private static /* synthetic */ String[] lIIIIIIlIlI;
    public static /* synthetic */ WorldPoint hs;
    public static /* synthetic */ WorldPoint hr;
    static /* synthetic */ int hu;
    public static /* synthetic */ List<C0003d> bu;
    public static /* synthetic */ WorldPoint ht;
    static /* synthetic */ WorldArea hy;
    static /* synthetic */ WorldPoint[] hx;
    static /* synthetic */ int ck;
    static /* synthetic */ int hv;

    private static boolean llIlllIIIllll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lIIIIIIllIl[1];
    }

    private static boolean llIlllIIIllIl(int i) {
        return i == 0;
    }

    private static boolean llIlllIIlIlII(int i, int i2) {
        return i != i2;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lIIIIIIlIlI[lIIIIIIllIl[64]];
    }

    private static boolean llIlllIIIlIll(int i) {
        return i != 0;
    }

    private static boolean llIlllIIIlllI(int i, int i2) {
        return i == i2;
    }

    private static String llIllIllllIII(String lllllllllllllllllIIllllIlIIIIlll, String lllllllllllllllllIIllllIlIIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIllllIlIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIIllllIlIIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIIllllIlIIIlIIl.init(lIIIIIIllIl[6], secretKeySpec);
            return new String(lllllllllllllllllIIllllIlIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIllllIlIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIIllllIlIIIlIII) {
            lllllllllllllllllIIllllIlIIIlIII.printStackTrace();
            return null;
        }
    }

    private static String llIllIllllIIl(String lllllllllllllllllIIllllIlIIlllII, String lllllllllllllllllIIllllIlIIllIll) {
        String lllllllllllllllllIIllllIlIIlllII2 = new String(Base64.getDecoder().decode(lllllllllllllllllIIllllIlIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllIIllllIlIIllIIl = lllllllllllllllllIIllllIlIIllIll.toCharArray();
        int lllllllllllllllllIIllllIlIIllIII = lIIIIIIllIl[1];
        char[] charArray = lllllllllllllllllIIllllIlIIlllII2.toCharArray();
        int length = charArray.length;
        int i = lIIIIIIllIl[1];
        while (llIlllIIIllII(i, length)) {
            char lllllllllllllllllIIllllIlIIlllIl = charArray[i];
            sb.append((char) (lllllllllllllllllIIllllIlIIlllIl ^ lllllllllllllllllIIllllIlIIllIIl[lllllllllllllllllIIllllIlIIllIII % lllllllllllllllllIIllllIlIIllIIl.length]));
            "".length();
            lllllllllllllllllIIllllIlIIllIII++;
            i++;
            "".length();
            if ((!true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static int llIlllIIIlIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean aa() {
        int[] iArr = new int[lIIIIIIllIl[0]];
        iArr[lIIIIIIllIl[1]] = lIIIIIIllIl[13];
        if (llIlllIIlIIII(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIIIIIIllIl[0]];
            iArr2[lIIIIIIllIl[1]] = lIIIIIIllIl[14];
            if (llIlllIIlIIII(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lIIIIIIllIl[0]];
                iArr3[lIIIIIIllIl[1]] = lIIIIIIllIl[8];
                if (llIlllIIlIlIl(Inventory.getCount(iArr3), lIIIIIIllIl[6])) {
                    int[] iArr4 = new int[lIIIIIIllIl[0]];
                    iArr4[lIIIIIIllIl[1]] = lIIIIIIllIl[11];
                    if (llIlllIIlIIII(Inventory.getCount(iArr4))) {
                        int[] iArr5 = new int[lIIIIIIllIl[0]];
                        iArr5[lIIIIIIllIl[1]] = lIIIIIIllIl[12];
                        if (llIlllIIlIIII(Inventory.getCount(iArr5))) {
                            int[] iArr6 = new int[lIIIIIIllIl[0]];
                            iArr6[lIIIIIIllIl[1]] = lIIIIIIllIl[16];
                            if (llIlllIIlIIII(Inventory.getCount(iArr6)) && llIlllIIlIIII(Inventory.getCount(C0005f.aU))) {
                                ?? r0 = lIIIIIIllIl[0];
                                "".length();
                                return (((((180 + 35) - 27) + 16) ^ (((161 + 63) - 60) + 34)) & (((98 ^ 23) ^ (((71 + 26) - 39) + 69)) ^ (-" ".length()))) != 0 ? ((88 ^ 126) ^ (5 ^ 3)) & (((((73 + 87) - 69) + 60) ^ (((99 + 71) - 160) + 173)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
        }
        return lIIIIIIllIl[1];
    }

    static {
        llIlllIIIlIIl();
        llIlllIIIlIII();
        hp = lIIIIIIllIl[4];
        bu = new ArrayList();
        dv = new WorldPoint(lIIIIIIllIl[66], lIIIIIIllIl[67], lIIIIIIllIl[1]);
        hq = new WorldPoint(lIIIIIIllIl[68], lIIIIIIllIl[69], lIIIIIIllIl[1]);
        hr = new WorldPoint(lIIIIIIllIl[70], lIIIIIIllIl[71], lIIIIIIllIl[1]);
        hs = new WorldPoint(lIIIIIIllIl[72], lIIIIIIllIl[73], lIIIIIIllIl[1]);
        ht = new WorldPoint(lIIIIIIllIl[74], lIIIIIIllIl[75], lIIIIIIllIl[6]);
        hu = lIIIIIIllIl[76];
        hv = lIIIIIIllIl[77];
        hw = lIIIIIIllIl[41];
        String[] strArr = new String[lIIIIIIllIl[23]];
        strArr[lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[78]];
        strArr[lIIIIIIllIl[0]] = lIIIIIIlIlI[lIIIIIIllIl[79]];
        strArr[lIIIIIIllIl[6]] = lIIIIIIlIlI[lIIIIIIllIl[80]];
        strArr[lIIIIIIllIl[9]] = lIIIIIIlIlI[lIIIIIIllIl[20]];
        strArr[lIIIIIIllIl[7]] = lIIIIIIlIlI[lIIIIIIllIl[81]];
        strArr[lIIIIIIllIl[15]] = lIIIIIIlIlI[lIIIIIIllIl[82]];
        strArr[lIIIIIIllIl[17]] = lIIIIIIlIlI[lIIIIIIllIl[83]];
        strArr[lIIIIIIllIl[10]] = lIIIIIIlIlI[lIIIIIIllIl[84]];
        strArr[lIIIIIIllIl[21]] = lIIIIIIlIlI[lIIIIIIllIl[85]];
        strArr[lIIIIIIllIl[22]] = lIIIIIIlIlI[lIIIIIIllIl[86]];
        strArr[lIIIIIIllIl[19]] = lIIIIIIlIlI[lIIIIIIllIl[87]];
        bQ = strArr;
        WorldPoint[] worldPointArr = new WorldPoint[lIIIIIIllIl[26]];
        worldPointArr[lIIIIIIllIl[1]] = new WorldPoint(lIIIIIIllIl[88], lIIIIIIllIl[89], lIIIIIIllIl[1]);
        worldPointArr[lIIIIIIllIl[0]] = new WorldPoint(lIIIIIIllIl[90], lIIIIIIllIl[91], lIIIIIIllIl[1]);
        worldPointArr[lIIIIIIllIl[6]] = new WorldPoint(lIIIIIIllIl[92], lIIIIIIllIl[93], lIIIIIIllIl[1]);
        worldPointArr[lIIIIIIllIl[9]] = new WorldPoint(lIIIIIIllIl[94], lIIIIIIllIl[95], lIIIIIIllIl[1]);
        worldPointArr[lIIIIIIllIl[7]] = new WorldPoint(lIIIIIIllIl[96], lIIIIIIllIl[97], lIIIIIIllIl[1]);
        worldPointArr[lIIIIIIllIl[15]] = new WorldPoint(lIIIIIIllIl[98], lIIIIIIllIl[99], lIIIIIIllIl[1]);
        worldPointArr[lIIIIIIllIl[17]] = new WorldPoint(lIIIIIIllIl[100], lIIIIIIllIl[101], lIIIIIIllIl[1]);
        worldPointArr[lIIIIIIllIl[10]] = new WorldPoint(lIIIIIIllIl[102], lIIIIIIllIl[103], lIIIIIIllIl[1]);
        worldPointArr[lIIIIIIllIl[21]] = new WorldPoint(lIIIIIIllIl[104], lIIIIIIllIl[105], lIIIIIIllIl[1]);
        worldPointArr[lIIIIIIllIl[22]] = new WorldPoint(lIIIIIIllIl[106], lIIIIIIllIl[107], lIIIIIIllIl[1]);
        worldPointArr[lIIIIIIllIl[19]] = new WorldPoint(lIIIIIIllIl[106], lIIIIIIllIl[108], lIIIIIIllIl[1]);
        worldPointArr[lIIIIIIllIl[23]] = new WorldPoint(lIIIIIIllIl[104], lIIIIIIllIl[109], lIIIIIIllIl[1]);
        worldPointArr[lIIIIIIllIl[24]] = new WorldPoint(lIIIIIIllIl[104], lIIIIIIllIl[110], lIIIIIIllIl[1]);
        worldPointArr[lIIIIIIllIl[25]] = new WorldPoint(lIIIIIIllIl[111], lIIIIIIllIl[112], lIIIIIIllIl[1]);
        hx = worldPointArr;
        hy = new WorldArea(lIIIIIIllIl[113], lIIIIIIllIl[114], lIIIIIIllIl[115], lIIIIIIllIl[116], lIIIIIIllIl[1]);
    }

    private static boolean llIlllIIlIIlI(int i, int i2) {
        return i > i2;
    }

    private static void llIlllIIIlIIl() {
        lIIIIIIllIl = new int[118];
        lIIIIIIllIl[0] = " ".length();
        lIIIIIIllIl[1] = (120 ^ 113) & ((188 ^ 181) ^ (-1));
        lIIIIIIllIl[2] = 191 ^ 160;
        lIIIIIIllIl[3] = 254 ^ 154;
        lIIIIIIllIl[4] = (((80 + 68) - (-35)) + 57) ^ (((36 + 61) - (-36)) + 5);
        lIIIIIIllIl[5] = (-25714) & 30713;
        lIIIIIIllIl[6] = "  ".length();
        lIIIIIIllIl[7] = 32 ^ 36;
        lIIIIIIllIl[8] = (-((-16955) & 22203)) & (-24641) & 32239;
        lIIIIIIllIl[9] = "   ".length();
        lIIIIIIllIl[10] = (5 ^ 33) ^ (51 ^ 16);
        lIIIIIIllIl[11] = (-((-4627) & 12851)) & (-9) & 16239;
        lIIIIIIllIl[12] = (-((-1905) & 18423)) & (-49) & 24575;
        lIIIIIIllIl[13] = (-29315) & 31639;
        lIIIIIIllIl[14] = (-((-1223) & 15567)) & (-16901) & 32509;
        lIIIIIIllIl[15] = 1 ^ 4;
        lIIIIIIllIl[16] = (-1) & 385;
        lIIIIIIllIl[17] = 100 ^ 98;
        lIIIIIIllIl[18] = (-(((112 + 1) - 100) + 122)) & (-1577) & 14335;
        lIIIIIIllIl[19] = 51 ^ 57;
        lIIIIIIllIl[20] = (((101 + 117) - 217) + 141) ^ (((105 + 22) - (-35)) + 26);
        lIIIIIIllIl[21] = (69 ^ 79) ^ "  ".length();
        lIIIIIIllIl[22] = 6 ^ 15;
        lIIIIIIllIl[23] = (((32 + 106) - (-1)) + 66) ^ (((184 + 130) - 255) + 139);
        lIIIIIIllIl[24] = 177 ^ 189;
        lIIIIIIllIl[25] = 109 ^ 96;
        lIIIIIIllIl[26] = 57 ^ 55;
        lIIIIIIllIl[27] = (225 ^ 193) ^ (171 ^ 132);
        lIIIIIIllIl[28] = 181 ^ 165;
        lIIIIIIllIl[29] = 53 ^ 36;
        lIIIIIIllIl[30] = (((155 + 41) - 195) + 171) ^ (((152 + 33) - 64) + 69);
        lIIIIIIllIl[31] = 26 ^ 9;
        lIIIIIIllIl[32] = 3 ^ 23;
        lIIIIIIllIl[33] = 18 ^ 7;
        lIIIIIIllIl[34] = 211 ^ 197;
        lIIIIIIllIl[35] = (((163 + 85) - 134) + 71) ^ (((138 + 138) - 122) + 20);
        lIIIIIIllIl[36] = (235 ^ 190) ^ (126 ^ 51);
        lIIIIIIllIl[37] = (149 ^ 188) ^ (149 ^ 165);
        lIIIIIIllIl[38] = (-((-2851) & 11055)) & (-5185) & 16367;
        lIIIIIIllIl[39] = (-24681) & 28013;
        lIIIIIIllIl[40] = (132 ^ 193) ^ (214 ^ 137);
        lIIIIIIllIl[41] = (-((-9223) & 14119)) & (-1025) & 8191;
        lIIIIIIllIl[42] = 190 ^ 165;
        lIIIIIIllIl[43] = (((102 + 94) - 121) + 99) ^ (((76 + 80) - 151) + 173);
        lIIIIIIllIl[44] = (-9499) & 11770;
        lIIIIIIllIl[45] = (143 ^ 132) ^ (43 ^ 61);
        lIIIIIIllIl[46] = 22 ^ 8;
        lIIIIIIllIl[47] = (192 ^ 139) ^ (49 ^ 90);
        lIIIIIIllIl[48] = 231 ^ 198;
        lIIIIIIllIl[49] = 174 ^ 140;
        lIIIIIIllIl[50] = 136 ^ 171;
        lIIIIIIllIl[51] = 38 ^ 2;
        lIIIIIIllIl[52] = (42 ^ 121) ^ (87 ^ 33);
        lIIIIIIllIl[53] = (((83 + 85) - 130) + 92) ^ (((27 + 32) - (-18)) + 87);
        lIIIIIIllIl[54] = 49 ^ 22;
        lIIIIIIllIl[55] = (((115 + 96) - 114) + 63) ^ (((2 + 112) - 54) + 76);
        lIIIIIIllIl[56] = (123 ^ 62) ^ (115 ^ 31);
        lIIIIIIllIl[57] = 38 ^ 12;
        lIIIIIIllIl[58] = 16 ^ 59;
        lIIIIIIllIl[59] = 136 ^ 164;
        lIIIIIIllIl[60] = (-((-17419) & 24075)) & (-16417) & 24572;
        lIIIIIIllIl[61] = (-3186) & 4085;
        lIIIIIIllIl[62] = (-((-12437) & 29111)) & (-4098) & 32751;
        lIIIIIIllIl[63] = (-3095) & 28094;
        lIIIIIIllIl[64] = (((176 + 116) - 145) + 42) ^ (((38 + 120) - 44) + 30);
        lIIIIIIllIl[65] = 132 ^ 170;
        lIIIIIIllIl[66] = (-((-2819) & 15171)) & (-17441) & 32767;
        lIIIIIIllIl[67] = (-((-15877) & 32503)) & (-12801) & 32767;
        lIIIIIIllIl[68] = (-13077) & 16286;
        lIIIIIIllIl[69] = (-20569) & 24063;
        lIIIIIIllIl[70] = (-((-19302) & 32623)) & (-65) & 16383;
        lIIIIIIllIl[71] = (-24883) & 28027;
        lIIIIIIllIl[72] = (-((-321) & 24901)) & (-5137) & 32767;
        lIIIIIIllIl[73] = (-((-21601) & 24303)) & (-16401) & 28670;
        lIIIIIIllIl[74] = (-((-2605) & 28205)) & (-88) & 28671;
        lIIIIIIllIl[75] = (-((-5281) & 29921)) & (-4793) & 32767;
        lIIIIIIllIl[76] = (-138) & 11515;
        lIIIIIIllIl[77] = (-((-12961) & 32481)) & (-8228) & 28415;
        lIIIIIIllIl[78] = (89 ^ 48) ^ (226 ^ 164);
        lIIIIIIllIl[79] = 127 ^ 79;
        lIIIIIIllIl[80] = 18 ^ 35;
        lIIIIIIllIl[81] = (((78 + 8) - 17) + 71) ^ (((10 + 153) - 65) + 93);
        lIIIIIIllIl[82] = 60 ^ 8;
        lIIIIIIllIl[83] = (128 ^ 178) ^ (74 ^ 77);
        lIIIIIIllIl[84] = 181 ^ 131;
        lIIIIIIllIl[85] = (58 ^ 34) ^ (179 ^ 156);
        lIIIIIIllIl[86] = 178 ^ 138;
        lIIIIIIllIl[87] = (252 ^ 166) ^ (197 ^ 166);
        lIIIIIIllIl[88] = (-1057) & 4022;
        lIIIIIIllIl[89] = (-((-10371) & 31427)) & (-8205) & 32638;
        lIIIIIIllIl[90] = (-((-9631) & 26111)) & (-13313) & 32765;
        lIIIIIIllIl[91] = (-20609) & 23987;
        lIIIIIIllIl[92] = (-25691) & 28670;
        lIIIIIIllIl[93] = (-21193) & 24569;
        lIIIIIIllIl[94] = (-9217) & 12201;
        lIIIIIIllIl[95] = (-((-19522) & 31827)) & (-17089) & 32767;
        lIIIIIIllIl[96] = (-((-101) & 16495)) & (-9222) & 28607;
        lIIIIIIllIl[97] = (-133) & 3502;
        lIIIIIIllIl[98] = (-((-16703) & 28991)) & (-17420) & 32703;
        lIIIIIIllIl[99] = (-667) & 4031;
        lIIIIIIllIl[100] = (-(93 ^ 89)) & (-12357) & 15359;
        lIIIIIIllIl[101] = (-((-18789) & 31221)) & (-16963) & 32755;
        lIIIIIIllIl[102] = (-25604) & 28607;
        lIIIIIIllIl[103] = (-((-1173) & 26293)) & (-195) & 28671;
        lIIIIIIllIl[104] = (-((-1810) & 5907)) & (-17409) & 24511;
        lIIIIIIllIl[105] = (-102) & 3453;
        lIIIIIIllIl[106] = (-24577) & 27583;
        lIIIIIIllIl[107] = (-654) & 3997;
        lIIIIIIllIl[108] = (-(((136 + 115) - 62) + 14)) & (-12306) & 15839;
        lIIIIIIllIl[109] = (-28675) & 31998;
        lIIIIIIllIl[110] = (-21005) & 24318;
        lIIIIIIllIl[111] = (-((-17461) & 29815)) & (-16385) & 31743;
        lIIIIIIllIl[112] = (-16919) & 20223;
        lIIIIIIllIl[113] = (-((-3493) & 32166)) & (-1031) & 32639;
        lIIIIIIllIl[114] = (-((-11417) & 32155)) & (-8197) & 32247;
        lIIIIIIllIl[115] = (((108 + 203) - 258) + 168) ^ (((136 + 9) - 79) + 112);
        lIIIIIIllIl[116] = 84 ^ 6;
        lIIIIIIllIl[117] = (251 ^ 143) ^ (119 ^ 57);
    }

    private static boolean llIlllIIlIIll(int i, int i2) {
        return i <= i2;
    }

    private static void llIlllIIIlIII() {
        lIIIIIIlIlI = new String[lIIIIIIllIl[117]];
        lIIIIIIlIlI[lIIIIIIllIl[1]] = llIllIlllIlll("/DplS0S3bkILsmBBkGsJKETGGd2zWSCN6z1f7Nq6+BhkwSUMKkMMSlFgicXFixWi", "zoyPK");
        lIIIIIIlIlI[lIIIIIIllIl[0]] = llIllIllllIII("p3Ka9j3FJhZZ89I9B//Iqw==", "YjYWd");
        lIIIIIIlIlI[lIIIIIIllIl[6]] = llIllIllllIII("MStJOXlVSWZS+yyQmzztA+g51I5I8uRB", "ixMsT");
        lIIIIIIlIlI[lIIIIIIllIl[9]] = llIllIllllIII("BRgDja670mmRcwoasACkixIawFPTqtau/mKHC1Z8vifb8dnURXV07pxhWBHb2cAvAroT4Ia15as=", "mLvdJ");
        lIIIIIIlIlI[lIIIIIIllIl[7]] = llIllIlllIlll("gpWTZkYqYyesvu03OfEPyhVrQYqVN3Xs6wAiquHMjMo4cd15ckMPFRpJ6rEV8LsXqRxG9Mvtvg8=", "Kstyz");
        lIIIIIIlIlI[lIIIIIIllIl[15]] = llIllIllllIIl("NjwlHC8=", "rNLrD");
        lIIIIIIlIlI[lIIIIIIllIl[17]] = llIllIllllIII("63Y0RF/J588=", "qyBNf");
        lIIIIIIlIlI[lIIIIIIllIl[10]] = llIllIllllIII("FiMOJgovFdec+8ljL24Z8A==", "seClY");
        lIIIIIIlIlI[lIIIIIIllIl[21]] = llIllIllllIIl("JSIlJCUfOCN2IAMzNyI=", "vVDVQ");
        lIIIIIIlIlI[lIIIIIIllIl[22]] = llIllIllllIII("VnuEzB+ahKs=", "NnoCN");
        lIIIIIIlIlI[lIIIIIIllIl[19]] = llIllIllllIII("So3SXFFjlJJozK3DwS7ZagxwwXMtI0DA", "UAfKn");
        lIIIIIIlIlI[lIIIIIIllIl[23]] = llIllIllllIIl("HREUH2Q9H1gYLSsCGQY9aRcNDQ==", "IpxtD");
        lIIIIIIlIlI[lIIIIIIllIl[24]] = llIllIllllIII("WRjFhv0dNkg=", "karkt");
        lIIIIIIlIlI[lIIIIIIllIl[25]] = llIllIllllIIl("KhEVZgwLUCcROTY2", "dpcFx");
        lIIIIIIlIlI[lIIIIIIllIl[26]] = llIllIlllIlll("lK6zyNfoTaAqkg9Tl0KMig==", "hygWT");
        lIIIIIIlIlI[lIIIIIIllIl[27]] = llIllIlllIlll("81tWzK8d0+Y=", "RrUCR");
        lIIIIIIlIlI[lIIIIIIllIl[28]] = llIllIllllIIl("GyYfcDY6ZwYiJ3UzADwn", "UGiPB");
        lIIIIIIlIlI[lIIIIIIllIl[29]] = llIllIllllIIl("Czo6CWw0PDcH", "FSTlL");
        lIIIIIIlIlI[lIIIIIIllIl[30]] = llIllIllllIIl("GicLAQ==", "WNedV");
        lIIIIIIlIlI[lIIIIIIllIl[31]] = llIllIlllIlll("JNmS64Rg5gM47LYkGMydHg==", "sINkI");
        lIIIIIIlIlI[lIIIIIIllIl[32]] = llIllIllllIII("S1mvJmq2I+BPPDU2Ri7rsg==", "WzHyf");
        lIIIIIIlIlI[lIIIIIIllIl[33]] = llIllIllllIII("cH4iDhzCR/g=", "LXuGs");
        lIIIIIIlIlI[lIIIIIIllIl[34]] = llIllIllllIIl("DyUePjo5LEsjISg=", "MIkLS");
        lIIIIIIlIlI[lIIIIIIllIl[35]] = llIllIllllIII("EuNVY/r/nkoY0vXL8oVehA==", "fKHTj");
        lIIIIIIlIlI[lIIIIIIllIl[36]] = llIllIlllIlll("nP7RtkSgLe45pesng/SePA==", "UJnJq");
        lIIIIIIlIlI[lIIIIIIllIl[37]] = llIllIllllIII("+61VlOerapm0e8w4Emzk3UX6QftDYvA3", "bJnqi");
        lIIIIIIlIlI[lIIIIIIllIl[40]] = llIllIllllIIl("PCQadDQWOwE6", "oMhTb");
        lIIIIIIlIlI[lIIIIIIllIl[42]] = llIllIllllIII("pArG1zQVFuE=", "KKBqi");
        lIIIIIIlIlI[lIIIIIIllIl[43]] = llIllIllllIIl("LDICHg==", "cBgpB");
        lIIIIIIlIlI[lIIIIIIllIl[45]] = llIllIlllIlll("Q6mgYd+WYhQ=", "oJijy");
        lIIIIIIlIlI[lIIIIIIllIl[46]] = llIllIllllIIl("PDwQBRkH", "oYqwz");
        lIIIIIIlIlI[lIIIIIIllIl[2]] = llIllIllllIIl("AAQ5GA02DWwFFic=", "BhLjd");
        lIIIIIIlIlI[lIIIIIIllIl[47]] = llIllIllllIII("EfIIx+Bqi6PconB4NTlREw==", "fVLBe");
        lIIIIIIlIlI[lIIIIIIllIl[48]] = llIllIlllIlll("dv3lL/5L0fMdv2SNLuly7w==", "xctsW");
        lIIIIIIlIlI[lIIIIIIllIl[49]] = llIllIllllIII("ks9MY65AWHKYVtKyFAztvQ==", "AdgdJ");
        lIIIIIIlIlI[lIIIIIIllIl[50]] = llIllIllllIII("nt3RDOSlTlI=", "LERJO");
        lIIIIIIlIlI[lIIIIIIllIl[51]] = llIllIllllIII("ewP/O+A24DKrSYTb/+7yGg==", "RxDSQ");
        lIIIIIIlIlI[lIIIIIIllIl[52]] = llIllIlllIlll("q4AZS4FxGbBjrdIRf1rZZw==", "kMIlV");
        lIIIIIIlIlI[lIIIIIIllIl[53]] = llIllIllllIIl("CwMSbj4qQiAZCxck", "EbdNJ");
        lIIIIIIlIlI[lIIIIIIllIl[54]] = llIllIllllIII("wKL8xU9iJhlKszNyXgaRKQ==", "teprY");
        lIIIIIIlIlI[lIIIIIIllIl[55]] = llIllIllllIIl("FwkzGTIs", "CaFkU");
        lIIIIIIlIlI[lIIIIIIllIl[56]] = llIllIllllIIl("JgYZBj8QD0wHIQsYCA==", "djltV");
        lIIIIIIlIlI[lIIIIIIllIl[57]] = llIllIllllIII("pyFD26ngAjY8iZVmVC8fGA==", "JzvMh");
        lIIIIIIlIlI[lIIIIIIllIl[58]] = llIllIllllIII("BrIyA8V1K/9taSzs8tEllQ==", "KoNeN");
        lIIIIIIlIlI[lIIIIIIllIl[59]] = llIllIllllIII("5Sj7p/obCNg=", "mfJDe");
        lIIIIIIlIlI[lIIIIIIllIl[64]] = llIllIllllIII("WWiKGjcosQHJ0U8pNnFi5A==", "SgcwE");
        lIIIIIIlIlI[lIIIIIIllIl[65]] = llIllIllllIIl("ORghNUwkF28lCSodOzpMYw==", "KqORl");
        lIIIIIIlIlI[lIIIIIIllIl[78]] = llIllIllllIII("iaoulWj3bGUFEe5MeLVbC2C10CXU41uBGrBdDR5kVOM=", "PowsI");
        lIIIIIIlIlI[lIIIIIIllIl[79]] = llIllIlllIlll("TWHaFcPkbzWY5s1sUWXWiCdjynY9WIvqXKD5Cp/LoEQFteeTjFIR/A==", "oJxEq");
        lIIIIIIlIlI[lIIIIIIllIl[80]] = llIllIlllIlll("RE5CzjiaLLNdyAo5SglkbheY2qquWASEsZTuhgqBXNKhC+gQVkJhBVxiKp+YwFRW", "LGYwH");
        lIIIIIIlIlI[lIIIIIIllIl[20]] = llIllIllllIII("DWoYOBG41WO0rIhjc2wQqoXxxxZmkrKz", "BntUe");
        lIIIIIIlIlI[lIIIIIIllIl[81]] = llIllIllllIIl("ETEqBXYiNmsIOTN5IB85MXkqEzkzLWsFPiN5Ahw1JzcvHnYiLioDICMqdA==", "FYKqV");
        lIIIIIIlIlI[lIIIIIIllIl[82]] = llIllIllllIIl("AikZKD85LxoqazQqByhl", "QFtMK");
        lIIIIIIlIlI[lIIIIIIllIl[83]] = llIllIllllIIl("DwwyICt4Gig5bzQKLClvOUM1KSs6BjU+NngTLilw", "XcGLO");
        lIIIIIIlIlI[lIIIIIIllIl[84]] = llIllIllllIIl("NgsJZggaH0crEB4PRydRBhoCJRgUBkc1BhoYA2YXGhhHKxRK", "ujgFq");
        lIIIIIIlIlI[lIIIIIIllIl[85]] = llIllIllllIIl("NzcdABJWIRoUElYmBRoUEntcWw==", "vUruf");
        lIIIIIIlIlI[lIIIIIIllIl[86]] = llIllIlllIlll("CZoaSUhgHwgz21rGHn7VHYXoRPGBVd2e+2FSYmWxEn6FYkClmUxyXEHxUGtmafTu", "iFaMN");
        lIIIIIIlIlI[lIIIIIIllIl[87]] = llIllIllllIII("p65xvYIZIwk=", "ViiZH");
    }

    private static boolean llIlllIIlIIII(int i) {
        return i > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e2, code lost:
        if (llIlllIIIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.H.lIIIIIIllIl[6]) != false) goto L31;
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
    private static void ae() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[lIIIIIIllIl[0]];
        iArr5[lIIIIIIllIl[1]] = lIIIIIIllIl[18];
        if (llIlllIIIllIl(Bank.contains(iArr5) ? 1 : 0)) {
            bu.add(new C0003d(lIIIIIIllIl[18], lIIIIIIllIl[15], C0008i.bp));
            "".length();
        }
        int[] iArr6 = new int[lIIIIIIllIl[0]];
        iArr6[lIIIIIIllIl[1]] = lIIIIIIllIl[13];
        if (llIlllIIIllIl(Bank.contains(iArr6) ? 1 : 0)) {
            bu.add(new C0003d(lIIIIIIllIl[13], lIIIIIIllIl[0], C0008i.bp));
            "".length();
        }
        int[] iArr7 = new int[lIIIIIIllIl[0]];
        iArr7[lIIIIIIllIl[1]] = lIIIIIIllIl[8];
        if (llIlllIIIlIll(Bank.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[lIIIIIIllIl[0]];
            iArr8[lIIIIIIllIl[1]] = lIIIIIIllIl[8];
            if (llIlllIIIlIll(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIIIIIllIl[0]];
                iArr9[lIIIIIIllIl[1]] = lIIIIIIllIl[8];
            }
            iArr = new int[lIIIIIIllIl[0]];
            iArr[lIIIIIIllIl[1]] = lIIIIIIllIl[14];
            if (llIlllIIIllIl(Bank.contains(iArr) ? 1 : 0)) {
                bu.add(new C0003d(lIIIIIIllIl[14], lIIIIIIllIl[0], C0008i.bp));
                "".length();
            }
            iArr2 = new int[lIIIIIIllIl[0]];
            iArr2[lIIIIIIllIl[1]] = lIIIIIIllIl[16];
            if (llIlllIIIllIl(Bank.contains(iArr2) ? 1 : 0)) {
                bu.add(new C0003d(lIIIIIIllIl[16], lIIIIIIllIl[27], lIIIIIIllIl[60]));
                "".length();
            }
            iArr3 = new int[lIIIIIIllIl[0]];
            iArr3[lIIIIIIllIl[1]] = lIIIIIIllIl[12];
            if (llIlllIIIllIl(Bank.contains(iArr3) ? 1 : 0)) {
                bu.add(new C0003d(lIIIIIIllIl[12], lIIIIIIllIl[19], lIIIIIIllIl[61]));
                "".length();
            }
            if (llIlllIIIllIl(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIIIIIIlIlI[lIIIIIIllIl[65]]);
            }) ? 1 : 0)) {
                bu.add(new C0003d(lIIIIIIllIl[62], lIIIIIIllIl[15], lIIIIIIllIl[63]));
                "".length();
            }
            iArr4 = new int[lIIIIIIllIl[0]];
            iArr4[lIIIIIIllIl[1]] = lIIIIIIllIl[11];
            if (llIlllIIIllIl(Bank.contains(iArr4) ? 1 : 0)) {
                return;
            }
            bu.add(new C0003d(lIIIIIIllIl[11], lIIIIIIllIl[55], lIIIIIIllIl[61]));
            "".length();
            return;
        }
        bu.add(new C0003d(lIIIIIIllIl[8], lIIIIIIllIl[6], C0008i.bp));
        "".length();
        iArr = new int[lIIIIIIllIl[0]];
        iArr[lIIIIIIllIl[1]] = lIIIIIIllIl[14];
        if (llIlllIIIllIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lIIIIIIllIl[0]];
        iArr2[lIIIIIIllIl[1]] = lIIIIIIllIl[16];
        if (llIlllIIIllIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIIIIIIllIl[0]];
        iArr3[lIIIIIIllIl[1]] = lIIIIIIllIl[12];
        if (llIlllIIIllIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
        if (llIlllIIIllIl(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIIIIIlIlI[lIIIIIIllIl[65]]);
        }) ? 1 : 0)) {
        }
        iArr4 = new int[lIIIIIIllIl[0]];
        iArr4[lIIIIIIllIl[1]] = lIIIIIIllIl[11];
        if (llIlllIIIllIl(Bank.contains(iArr4) ? 1 : 0)) {
        }
    }

    private static String llIllIlllIlll(String lllllllllllllllllIIllllIIllllIlI, String lllllllllllllllllIIllllIIllllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIllllIIllllIIl.getBytes(StandardCharsets.UTF_8)), lIIIIIIllIl[21]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIllIl[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIllllIIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIIllllIIllllIll) {
            lllllllllllllllllIIllllIIllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllIIlIlIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIlllIIIllII(int i, int i2) {
        return i < i2;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            cS();
            "".length();
            if ((-"   ".length()) > 0) {
                return (18 ^ 29) & ((110 ^ 97) ^ (-1));
            }
        } catch (Exception e2) {
        }
        return lIIIIIIllIl[3];
    }

    private static boolean llIlllIIlIIIl(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIlllIIIlllI(C0004e.j(lIIIIIIllIl[4]), lIIIIIIllIl[10])) {
            ?? r0 = lIIIIIIllIl[0];
            "".length();
            return ((((72 + 9) - (-19)) + 63) ^ (((58 + 121) - 76) + 63)) == 0 ? ((174 ^ 198) ^ (247 ^ 162)) & ((((139 ^ 128) & ((80 ^ 91) ^ (-1))) ^ (10 ^ 55)) ^ (-" ".length())) : r0;
        }
        return lIIIIIIllIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v122, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v463, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v472, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v494, types: [boolean] */
    public static void cS() {
        if (llIlllIIIlIll(bs ? 1 : 0)) {
            C0001b.a(bu);
            if (llIlllIIIllII(bu.size(), lIIIIIIllIl[0])) {
                System.out.println(lIIIIIIlIlI[lIIIIIIllIl[1]]);
                bs = lIIIIIIllIl[1];
            }
        }
        if (llIlllIIIllIl(bs ? 1 : 0)) {
            if (llIlllIIIllII(C0004e.j(lIIIIIIllIl[2]), lIIIIIIllIl[3])) {
                C.cb();
            }
            if (llIlllIIIllIl(aa() ? 1 : 0) && llIlllIIIlllI(C0004e.j(lIIIIIIllIl[2]), lIIIIIIllIl[3]) && llIlllIIIllII(C0004e.j(lIIIIIIllIl[4]), lIIIIIIllIl[0])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlllIIIllll(nearest) && llIlllIIIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[0]];
                    C0000a.a(nearest);
                }
                if (llIlllIIIllll(nearest) && llIlllIIIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIlllIIIllIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIIIllIl[5]);
                        "".length();
                    }
                    if (llIlllIIIlIll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[6]];
                        if (llIlllIIlIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIIIIllIl[7]);
                            "".length();
                        }
                        if (llIlllIIlIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIIIIllIl[6]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIIIIllIl[0]];
                        iArr[lIIIIIIllIl[1]] = lIIIIIIllIl[8];
                        if (llIlllIIIlIll(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIIIIIIllIl[0]];
                            iArr2[lIIIIIIllIl[1]] = lIIIIIIllIl[8];
                            if (llIlllIIIllII(Bank.getFirst(iArr2).getQuantity(), lIIIIIIllIl[6])) {
                                ae();
                                System.out.println(lIIIIIIlIlI[lIIIIIIllIl[9]]);
                                bs = lIIIIIIllIl[0];
                                return;
                            }
                        }
                        int[] iArr3 = new int[lIIIIIIllIl[10]];
                        iArr3[lIIIIIIllIl[1]] = lIIIIIIllIl[11];
                        iArr3[lIIIIIIllIl[0]] = lIIIIIIllIl[12];
                        iArr3[lIIIIIIllIl[6]] = lIIIIIIllIl[13];
                        iArr3[lIIIIIIllIl[9]] = lIIIIIIllIl[14];
                        iArr3[lIIIIIIllIl[7]] = lIIIIIIllIl[8];
                        iArr3[lIIIIIIllIl[15]] = lIIIIIIllIl[16];
                        iArr3[lIIIIIIllIl[17]] = lIIIIIIllIl[18];
                        if (llIlllIIIllIl(C0004e.b(iArr3) ? 1 : 0)) {
                            ae();
                            System.out.println(lIIIIIIlIlI[lIIIIIIllIl[7]]);
                            bs = lIIIIIIllIl[0];
                            return;
                        }
                        int[] iArr4 = new int[lIIIIIIllIl[10]];
                        iArr4[lIIIIIIllIl[1]] = lIIIIIIllIl[11];
                        iArr4[lIIIIIIllIl[0]] = lIIIIIIllIl[12];
                        iArr4[lIIIIIIllIl[6]] = lIIIIIIllIl[13];
                        iArr4[lIIIIIIllIl[9]] = lIIIIIIllIl[14];
                        iArr4[lIIIIIIllIl[7]] = lIIIIIIllIl[8];
                        iArr4[lIIIIIIllIl[15]] = lIIIIIIllIl[16];
                        iArr4[lIIIIIIllIl[17]] = lIIIIIIllIl[18];
                        if (llIlllIIIlIll(C0004e.b(iArr4) ? 1 : 0)) {
                            C0000a.a(lIIIIIIllIl[11], lIIIIIIllIl[19]);
                            C0000a.a(lIIIIIIllIl[12], lIIIIIIllIl[19]);
                            C0000a.a(lIIIIIIllIl[13], lIIIIIIllIl[0]);
                            C0000a.a(lIIIIIIllIl[14], lIIIIIIllIl[0]);
                            C0000a.a(lIIIIIIllIl[8], lIIIIIIllIl[6]);
                            C0000a.a(lIIIIIIllIl[18], lIIIIIIllIl[7]);
                            C0000a.a(lIIIIIIllIl[16], lIIIIIIllIl[19]);
                        }
                    }
                }
            }
            if (llIlllIIIlIll(Inventory.contains(C0005f.aU) ? 1 : 0) && llIlllIIIllII(Movement.getRunEnergy(), lIIIIIIllIl[20])) {
                Inventory.getFirst(C0005f.aU).interact(lIIIIIIlIlI[lIIIIIIllIl[15]]);
                Time.sleepTicks(lIIIIIIllIl[0]);
                "".length();
            }
            if (llIlllIIlIIIl(llIlllIIIlIlI(C0004e.u(), 50.0d))) {
                int[] iArr5 = new int[lIIIIIIllIl[0]];
                iArr5[lIIIIIIllIl[1]] = lIIIIIIllIl[16];
                if (llIlllIIIlIll(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lIIIIIIllIl[0]];
                    iArr6[lIIIIIIllIl[1]] = lIIIIIIllIl[16];
                    Inventory.getFirst(iArr6).interact(lIIIIIIlIlI[lIIIIIIllIl[17]]);
                    Time.sleepTicks(lIIIIIIllIl[6]);
                    "".length();
                }
            }
            if (llIlllIIIlIll(aa() ? 1 : 0) && llIlllIIIllIl(C0004e.j(lIIIIIIllIl[4]))) {
                if (llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(dv), lIIIIIIllIl[17])) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[10]];
                    if (llIlllIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(dv);
                    "".length();
                    Time.sleepTicks(lIIIIIIllIl[0]);
                    "".length();
                }
                if (llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(dv), lIIIIIIllIl[17])) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[21]];
                    C0006g.a(lIIIIIIlIlI[lIIIIIIllIl[22]], bQ);
                }
            }
            if (llIlllIIIlllI(C0004e.j(lIIIIIIllIl[4]), lIIIIIIllIl[0])) {
                ck = lIIIIIIllIl[1];
                if (llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hq), lIIIIIIllIl[15])) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[19]];
                    Movement.walkTo(hq);
                    "".length();
                    Time.sleepTicks(lIIIIIIllIl[0]);
                    "".length();
                }
                if (llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hq), lIIIIIIllIl[15])) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[23]];
                    C0006g.a(lIIIIIIlIlI[lIIIIIIllIl[24]], bQ);
                }
            }
            if (!llIlllIIlIlII(C0004e.j(lIIIIIIllIl[4]), lIIIIIIllIl[6]) || llIlllIIIlllI(C0004e.j(lIIIIIIllIl[4]), lIIIIIIllIl[9])) {
                if (llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hr), lIIIIIIllIl[17])) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[25]];
                    if (llIlllIIIllII(Skills.getLevel(Skill.AGILITY), lIIIIIIllIl[15])) {
                        if (llIlllIIIlIll(hy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Walker.walkAlong(Arrays.asList(hx), new HashMap());
                            "".length();
                            Time.sleepTicks(lIIIIIIllIl[0]);
                            "".length();
                        }
                        if (llIlllIIIllIl(hy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo(hr);
                            "".length();
                            Time.sleepTicks(lIIIIIIllIl[0]);
                            "".length();
                        }
                    }
                    if (llIlllIIlIlIl(Skills.getLevel(Skill.AGILITY), lIIIIIIllIl[15])) {
                        Movement.walkTo(hr);
                        "".length();
                        Time.sleepTicks(lIIIIIIllIl[0]);
                        "".length();
                    }
                }
                if (llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hr), lIIIIIIllIl[17])) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[26]];
                    C0006g.a(lIIIIIIlIlI[lIIIIIIllIl[27]], bQ);
                }
            }
            if (llIlllIIIlllI(C0004e.j(lIIIIIIllIl[4]), lIIIIIIllIl[7])) {
                int[] iArr7 = new int[lIIIIIIllIl[0]];
                iArr7[lIIIIIIllIl[1]] = hv;
                if (llIlllIIIllIl(Inventory.contains(iArr7) ? 1 : 0)) {
                    if (llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hs), lIIIIIIllIl[17])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[28]];
                        Movement.walkTo(hs);
                        "".length();
                        Time.sleepTicks(lIIIIIIllIl[0]);
                        "".length();
                    }
                    if (llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hs), lIIIIIIllIl[17])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[29]];
                        int[] iArr8 = new int[lIIIIIIllIl[0]];
                        iArr8[lIIIIIIllIl[1]] = hu;
                        if (llIlllIIIllll(TileObjects.getNearest(iArr8))) {
                            int[] iArr9 = new int[lIIIIIIllIl[0]];
                            iArr9[lIIIIIIllIl[1]] = hu;
                            TileObjects.getNearest(iArr9).interact(lIIIIIIlIlI[lIIIIIIllIl[30]]);
                            Time.sleepTicks(lIIIIIIllIl[6]);
                            "".length();
                        }
                    }
                }
            }
            if (llIlllIIIlllI(C0004e.j(lIIIIIIllIl[4]), lIIIIIIllIl[7])) {
                int[] iArr10 = new int[lIIIIIIllIl[0]];
                iArr10[lIIIIIIllIl[1]] = hv;
                if (llIlllIIIlIll(Inventory.contains(iArr10) ? 1 : 0)) {
                    if (llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(dv), lIIIIIIllIl[17])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[31]];
                        Movement.walkTo(dv);
                        "".length();
                        Time.sleepTicks(lIIIIIIllIl[0]);
                        "".length();
                    }
                    if (llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(dv), lIIIIIIllIl[17])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[32]];
                        C0006g.a(lIIIIIIlIlI[lIIIIIIllIl[33]], bQ);
                    }
                }
            }
            if (llIlllIIIlllI(C0004e.j(lIIIIIIllIl[4]), lIIIIIIllIl[15])) {
                String[] strArr = new String[lIIIIIIllIl[0]];
                strArr[lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[34]];
                if (llIlllIIIlIll(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIIIIIllIl[0]];
                    strArr2[lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[35]];
                    if (llIlllIIIllIl(Inventory.contains(strArr2) ? 1 : 0)) {
                        if (llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(ht), lIIIIIIllIl[9])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[36]];
                            Movement.walkTo(ht);
                            "".length();
                            Time.sleepTicks(lIIIIIIllIl[0]);
                            "".length();
                        }
                        if (llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(ht), lIIIIIIllIl[9])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[37]];
                            WorldArea worldArea = new WorldArea(lIIIIIIllIl[38], lIIIIIIllIl[39], lIIIIIIllIl[21], lIIIIIIllIl[7], lIIIIIIllIl[6]);
                            String[] strArr3 = new String[lIIIIIIllIl[0]];
                            strArr3[lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[40]];
                            NPC nearest2 = NPCs.getNearest(strArr3);
                            if (llIlllIIIllll(nearest2) && llIlllIIIlIll(worldArea.contains(nearest2.getWorldLocation()) ? 1 : 0)) {
                                C0004e.B();
                            }
                            int[] iArr11 = new int[lIIIIIIllIl[0]];
                            iArr11[lIIIIIIllIl[1]] = lIIIIIIllIl[41];
                            TileObject nearest3 = TileObjects.getNearest(iArr11);
                            if (llIlllIIIllll(nearest3)) {
                                String[] strArr4 = new String[lIIIIIIllIl[0]];
                                strArr4[lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[42]];
                                if (llIlllIIIlIll(nearest3.hasAction(strArr4) ? 1 : 0)) {
                                    nearest3.interact(lIIIIIIlIlI[lIIIIIIllIl[43]]);
                                    Time.sleepTicks(lIIIIIIllIl[6]);
                                    "".length();
                                }
                            }
                            int[] iArr12 = new int[lIIIIIIllIl[0]];
                            iArr12[lIIIIIIllIl[1]] = lIIIIIIllIl[44];
                            TileObject nearest4 = TileObjects.getNearest(iArr12);
                            if (llIlllIIIllll(nearest4)) {
                                String[] strArr5 = new String[lIIIIIIllIl[0]];
                                strArr5[lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[45]];
                                if (llIlllIIIlIll(nearest4.hasAction(strArr5) ? 1 : 0)) {
                                    nearest4.interact(lIIIIIIlIlI[lIIIIIIllIl[46]]);
                                    Time.sleepTicks(lIIIIIIllIl[6]);
                                    "".length();
                                    if (llIlllIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.continueSpace();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (llIlllIIIlllI(C0004e.j(lIIIIIIllIl[4]), lIIIIIIllIl[15])) {
                String[] strArr6 = new String[lIIIIIIllIl[0]];
                strArr6[lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[2]];
                if (llIlllIIIlIll(Inventory.contains(strArr6) ? 1 : 0)) {
                    String[] strArr7 = new String[lIIIIIIllIl[0]];
                    strArr7[lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[47]];
                    if (llIlllIIIlIll(Inventory.contains(strArr7) ? 1 : 0)) {
                        if (llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hr), lIIIIIIllIl[17])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[48]];
                            if (llIlllIIIllII(Skills.getLevel(Skill.AGILITY), lIIIIIIllIl[15])) {
                                if (llIlllIIIlIll(hy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Walker.walkAlong(Arrays.asList(hx), new HashMap());
                                    "".length();
                                    Time.sleepTicks(lIIIIIIllIl[0]);
                                    "".length();
                                }
                                if (llIlllIIIllIl(hy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo(hr);
                                    "".length();
                                    Time.sleepTicks(lIIIIIIllIl[0]);
                                    "".length();
                                }
                            }
                            if (llIlllIIlIlIl(Skills.getLevel(Skill.AGILITY), lIIIIIIllIl[15])) {
                                Movement.walkTo(hr);
                                "".length();
                                Time.sleepTicks(lIIIIIIllIl[0]);
                                "".length();
                            }
                        }
                        if (llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hr), lIIIIIIllIl[17])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[49]];
                            C0006g.a(lIIIIIIlIlI[lIIIIIIllIl[50]], bQ);
                        }
                    }
                }
            }
            if (llIlllIIIlllI(C0004e.j(lIIIIIIllIl[4]), lIIIIIIllIl[17])) {
                String[] strArr8 = new String[lIIIIIIllIl[0]];
                strArr8[lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[51]];
                if (llIlllIIlIIII(Inventory.getCount(strArr8))) {
                    String[] strArr9 = new String[lIIIIIIllIl[0]];
                    strArr9[lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[52]];
                    if (llIlllIIIllII(Inventory.getCount(strArr9), lIIIIIIllIl[0])) {
                        if (llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hr), lIIIIIIllIl[17])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[53]];
                            Movement.walkTo(hr);
                            "".length();
                            Time.sleepTicks(lIIIIIIllIl[0]);
                            "".length();
                        }
                        if (llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hr), lIIIIIIllIl[17])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[54]];
                            C0006g.a(lIIIIIIlIlI[lIIIIIIllIl[55]], bQ);
                        }
                    }
                }
            }
            if (llIlllIIIlllI(C0004e.j(lIIIIIIllIl[4]), lIIIIIIllIl[17])) {
                String[] strArr10 = new String[lIIIIIIllIl[0]];
                strArr10[lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[56]];
                if (llIlllIIlIIII(Inventory.getCount(strArr10))) {
                    if (llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(dv), lIIIIIIllIl[17])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[57]];
                        Movement.walkTo(dv);
                        "".length();
                        Time.sleepTicks(lIIIIIIllIl[0]);
                        "".length();
                    }
                    if (llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(dv), lIIIIIIllIl[17])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[58]];
                        if (llIlllIIIllII(ck, lIIIIIIllIl[0])) {
                            ac.mT += lIIIIIIllIl[0];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += lIIIIIIllIl[0];
                            ac.mT = lIIIIIIllIl[1];
                            cl = lIIIIIIllIl[1];
                        }
                        C0006g.a(lIIIIIIlIlI[lIIIIIIllIl[59]], bQ);
                    }
                }
            }
            C0006g.a(new String[lIIIIIIllIl[1]]);
        }
    }
}
