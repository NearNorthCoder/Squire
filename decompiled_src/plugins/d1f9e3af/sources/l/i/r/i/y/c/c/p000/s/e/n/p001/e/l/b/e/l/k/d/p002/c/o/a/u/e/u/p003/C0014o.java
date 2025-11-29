package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.o  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/o.class */
public class C0014o implements W {
    static /* synthetic */ WorldPoint bX;
    static /* synthetic */ int bY;
    private static /* synthetic */ String[] lIIlllIII;
    public static /* synthetic */ boolean bW;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] bR;
    private static /* synthetic */ int[] lIIlllIlI;
    public static /* synthetic */ List<C0003d> bv;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIIIIllIIll(Skills.getLevel(Skill.FARMING), lIIlllIlI[91])) {
            ?? r0 = lIIlllIlI[0];
            "".length();
            return ((((120 + 112) - 63) + 10) ^ (((70 + 108) - 170) + 175)) <= "   ".length() ? ((86 ^ 56) ^ (117 ^ 39)) & (((((29 + 157) - 151) + 124) ^ (((17 + 31) - (-77)) + 38)) ^ (-" ".length())) : r0;
        }
        return lIIlllIlI[1];
    }

    private static String lIIIIIIlllIl(String llllllIlIllIll, String llllllIlIllIlI) {
        String str = new String(Base64.getDecoder().decode(llllllIlIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllIlIllIlI.toCharArray();
        int llllllIlIlIlll = lIIlllIlI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlllIlI[1];
        while (lIIIIIllIIIl(i, length)) {
            char llllllIlIlllII = charArray2[i];
            sb.append((char) (llllllIlIlllII ^ charArray[llllllIlIlIlll % charArray.length]));
            "".length();
            llllllIlIlIlll++;
            i++;
            "".length();
            if ("   ".length() <= ("  ".length() & ("  ".length() ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIIIIIlllll(String llllllIllIlIll, String llllllIllIlIlI) {
        try {
            SecretKeySpec llllllIllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIllIlIlI.getBytes(StandardCharsets.UTF_8)), lIIlllIlI[20]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllIlI[5], llllllIllIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllIllIllII) {
            llllllIllIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIllIIll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIIIlllIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIlllIlI[1];
    }

    private static boolean lIIIIIllIllI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIIlllIlI[0]];
        iArr[lIIlllIlI[1]] = lIIlllIlI[10];
        if (lIIIIIllIIII(Inventory.contains(iArr) ? 1 : 0) && lIIIIIllIIII(Inventory.contains(item -> {
            return item.getName().contains(lIIlllIII[lIIlllIlI[94]]);
        }) ? 1 : 0) && (!lIIIIIllIIlI(Equipment.contains(item2 -> {
            return item2.getName().contains(lIIlllIII[lIIlllIlI[93]]);
        }) ? 1 : 0) || lIIIIIllIIII(Inventory.contains(item3 -> {
            return item3.getName().contains(lIIlllIII[lIIlllIlI[92]]);
        }) ? 1 : 0))) {
            ?? r0 = lIIlllIlI[0];
            "".length();
            return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlllIlI[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean az() {
        if (lIIIIIllIIII(new WorldArea(lIIlllIlI[40], lIIlllIlI[41], lIIlllIlI[36], lIIlllIlI[42], lIIlllIlI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIllIlll(Players.getLocal().getWorldLocation().getX(), lIIlllIlI[43])) {
            ?? r0 = lIIlllIlI[0];
            "".length();
            return " ".length() < 0 ? ((24 ^ 105) ^ (24 ^ 39)) & (((58 ^ 44) ^ (1 ^ 89)) ^ (-" ".length())) : r0;
        }
        return lIIlllIlI[1];
    }

    private static boolean lIIIIIllIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIIIllIIII(int i) {
        return i != 0;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIIlllIII[lIIlllIlI[90]];
    }

    static {
        lIIIIIlIllll();
        lIIIIIlIlllI();
        bv = new ArrayList();
        bX = new WorldPoint(lIIlllIlI[1], lIIlllIlI[1], lIIlllIlI[1]);
        bY = lIIlllIlI[1];
        String[] strArr = new String[lIIlllIlI[0]];
        strArr[lIIlllIlI[1]] = lIIlllIII[lIIlllIlI[102]];
        bR = strArr;
    }

    private static boolean lIIIIIllIlll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIIIllIlIl(int i) {
        return i > 0;
    }

    private static boolean lIIIIIllIIlI(int i) {
        return i == 0;
    }

    private static String lIIIIIIllllI(String llllllIllllIII, String llllllIlllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIlllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllIllllIlI = Cipher.getInstance("Blowfish");
            llllllIllllIlI.init(lIIlllIlI[5], secretKeySpec);
            return new String(llllllIllllIlI.doFinal(Base64.getDecoder().decode(llllllIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllIllllIIl) {
            llllllIllllIIl.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIlIllll() {
        lIIlllIlI = new int[104];
        lIIlllIlI[0] = " ".length();
        lIIlllIlI[1] = (146 ^ 153) & ((127 ^ 116) ^ (-1));
        lIIlllIlI[2] = (-((-257) & 28623)) & (-33) & 28671;
        lIIlllIlI[3] = (((155 + 116) - 110) + 54) ^ (((73 + 105) - 60) + 67);
        lIIlllIlI[4] = (-((-4867) & 15194)) & (-1) & 15327;
        lIIlllIlI[5] = "  ".length();
        lIIlllIlI[6] = (((10 + 119) - 45) + 70) ^ (((52 + 33) - 41) + 114);
        lIIlllIlI[7] = (-(((78 + 131) - 207) + 161)) & (-1033) & 13819;
        lIIlllIlI[8] = 95 ^ 85;
        lIIlllIlI[9] = "   ".length();
        lIIlllIlI[10] = (-((-7231) & 31935)) & (-33) & 32743;
        lIIlllIlI[11] = (-((-1626) & 30303)) & (-1027) & 32255;
        lIIlllIlI[12] = (((70 + 76) - 141) + 141) ^ (((17 + 89) - (-10)) + 17);
        lIIlllIlI[13] = 78 ^ 124;
        lIIlllIlI[14] = 79 ^ 74;
        lIIlllIlI[15] = (-((-5185) & 29923)) & (-517) & 28583;
        lIIlllIlI[16] = (-12837) & 16125;
        lIIlllIlI[17] = (-((-3097) & 28569)) & (-2) & 28655;
        lIIlllIlI[18] = 96 ^ 102;
        lIIlllIlI[19] = 44 ^ 43;
        lIIlllIlI[20] = (((66 + 173) - 235) + 199) ^ (((187 + 2) - 72) + 78);
        lIIlllIlI[21] = (-8283) & 11610;
        lIIlllIlI[22] = (-29448) & 32767;
        lIIlllIlI[23] = (-((-9743) & 10159)) & (-4097) & 7651;
        lIIlllIlI[24] = 17 ^ 24;
        lIIlllIlI[25] = 9 ^ 2;
        lIIlllIlI[26] = 20 ^ 24;
        lIIlllIlI[27] = (101 ^ 23) ^ (((46 + 115) - 37) + 3);
        lIIlllIlI[28] = 68 ^ 74;
        lIIlllIlI[29] = (39 ^ 94) ^ (2 ^ 116);
        lIIlllIlI[30] = (111 ^ 1) ^ (123 ^ 5);
        lIIlllIlI[31] = (-((-545) & 26291)) & (-4106) & 32735;
        lIIlllIlI[32] = (-16901) & 22342;
        lIIlllIlI[33] = (126 ^ 73) ^ (169 ^ 167);
        lIIlllIlI[34] = 99 ^ 88;
        lIIlllIlI[35] = 54 ^ 39;
        lIIlllIlI[36] = 63 ^ 45;
        lIIlllIlI[37] = 179 ^ 160;
        lIIlllIlI[38] = (115 ^ 110) ^ (30 ^ 23);
        lIIlllIlI[39] = (242 ^ 169) ^ (252 ^ 178);
        lIIlllIlI[40] = (-((-1093) & 21581)) & (-9250) & 32623;
        lIIlllIlI[41] = (-17062) & 22525;
        lIIlllIlI[42] = (112 ^ 18) ^ (24 ^ 98);
        lIIlllIlI[43] = (-21537) & 24438;
        lIIlllIlI[44] = 90 ^ 76;
        lIIlllIlI[45] = (((72 ^ 112) + (76 ^ 10)) - (249 ^ 149)) + ((88 + 223) - 253) + 173;
        lIIlllIlI[46] = (((167 ^ 189) + (163 ^ 147)) - (-(213 ^ 181))) + (99 ^ 50);
        lIIlllIlI[47] = ((205 + 72) - 120) + 96;
        lIIlllIlI[48] = ((233 + 90) - 310) + 242;
        lIIlllIlI[49] = (-((-11065) & 31677)) & (-8193) & 30204;
        lIIlllIlI[50] = (-6278) & 7927;
        lIIlllIlI[51] = (-" ".length()) & (-26633) & 32430;
        lIIlllIlI[52] = (-((-1665) & 28361)) & (-17) & 32511;
        lIIlllIlI[53] = (-24593) & 30392;
        lIIlllIlI[54] = (-8449) & 14249;
        lIIlllIlI[55] = (-20490) & 23387;
        lIIlllIlI[56] = (-2085) & 7551;
        lIIlllIlI[57] = (-((-609) & 29421)) & (-2) & 31709;
        lIIlllIlI[58] = (-2717) & 8191;
        lIIlllIlI[59] = (-((-17265) & 30716)) & (-16417) & 32767;
        lIIlllIlI[60] = (-2689) & 8158;
        lIIlllIlI[61] = (-((-4979) & 7030)) & (-8849) & 16375;
        lIIlllIlI[62] = 66 ^ 91;
        lIIlllIlI[63] = (-((-597) & 30453)) & (-1) & 32747;
        lIIlllIlI[64] = (-((-5245) & 32381)) & (-147) & 32762;
        lIIlllIlI[65] = (-4235) & 7131;
        lIIlllIlI[66] = (-((-1567) & 20159)) & (-513) & 24575;
        lIIlllIlI[67] = (((85 + 102) - 56) + 7) ^ (((95 + 111) - 114) + 52);
        lIIlllIlI[68] = (-((-13893) & 32327)) & (-145) & 24059;
        lIIlllIlI[69] = 134 ^ 157;
        lIIlllIlI[70] = (-(((56 + 8) - 43) + 141)) & (-12305) & 15357;
        lIIlllIlI[71] = (-131) & 5614;
        lIIlllIlI[72] = (((117 + 52) - 33) + 42) ^ (((125 + 113) - 93) + 29);
        lIIlllIlI[73] = (-28809) & 31695;
        lIIlllIlI[74] = (-2695) & 8159;
        lIIlllIlI[75] = (-((-5187) & 31955)) & (-521) & 32767;
        lIIlllIlI[76] = (-6154) & 7689;
        lIIlllIlI[77] = (-28689) & 31581;
        lIIlllIlI[78] = (-((-5161) & 15674)) & (-173) & 11197;
        lIIlllIlI[79] = 49 ^ 44;
        lIIlllIlI[80] = 55 ^ 41;
        lIIlllIlI[81] = (25 ^ 83) ^ (49 ^ 100);
        lIIlllIlI[82] = 35 ^ 3;
        lIIlllIlI[83] = (-12353) & 13792;
        lIIlllIlI[84] = (-((-1738) & 22525)) & (-1) & 32767;
        lIIlllIlI[85] = (-2632) & 27631;
        lIIlllIlI[86] = 48 ^ 12;
        lIIlllIlI[87] = (((83 + 61) - 9) + 48) ^ (((60 + 116) - 98) + 81);
        lIIlllIlI[88] = (-7273) & 8172;
        lIIlllIlI[89] = 216 ^ 188;
        lIIlllIlI[90] = (193 ^ 164) ^ (235 ^ 175);
        lIIlllIlI[91] = (((84 + 116) - 168) + 131) ^ (((9 + 87) - 17) + 50);
        lIIlllIlI[92] = (127 ^ 109) ^ (84 ^ 101);
        lIIlllIlI[93] = 1 ^ 37;
        lIIlllIlI[94] = 174 ^ 139;
        lIIlllIlI[95] = 41 ^ 15;
        lIIlllIlI[96] = (((49 + 51) - (-81)) + 49) ^ (((153 + 99) - 199) + 140);
        lIIlllIlI[97] = (-((-20293) & 24517)) & (-1033) & 8159;
        lIIlllIlI[98] = (52 ^ 44) ^ (110 ^ 95);
        lIIlllIlI[99] = 125 ^ 87;
        lIIlllIlI[100] = 129 ^ 170;
        lIIlllIlI[101] = 37 ^ 9;
        lIIlllIlI[102] = 115 ^ 94;
        lIIlllIlI[103] = 93 ^ 115;
    }

    private static boolean lIIIIIllIlII(Object obj) {
        return obj != null;
    }

    private static void aA() {
        if (lIIIIIllIIlI(az() ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[44]];
            int[] iArr = new int[lIIlllIlI[6]];
            iArr[lIIlllIlI[1]] = lIIlllIlI[45];
            iArr[lIIlllIlI[0]] = lIIlllIlI[46];
            iArr[lIIlllIlI[5]] = lIIlllIlI[47];
            iArr[lIIlllIlI[9]] = lIIlllIlI[48];
            if (lIIIIIllIIII(Inventory.contains(iArr) ? 1 : 0)) {
                Inventory.getAll(iArr).stream().forEach((v0) -> {
                    v0.drop();
                });
                Time.sleepTicks(lIIlllIlI[0]);
                "".length();
            }
            TileObjects.getNearest(tileObject -> {
                if (lIIIIIllIIII(tileObject.getName().contains(lIIlllIII[lIIlllIlI[87]]) ? 1 : 0) && lIIIIIllIlll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlllIlI[97], lIIlllIlI[60], lIIlllIlI[1])), lIIlllIlI[5])) {
                    ?? r0 = lIIlllIlI[0];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIlllIlI[1];
            }).interact(lIIlllIII[lIIlllIlI[12]]);
            Time.sleepUntil(() -> {
                return az();
            }, C0004e.c(lIIlllIlI[49], lIIlllIlI[50]));
            "".length();
        }
        if (lIIIIIllIIII(az() ? 1 : 0)) {
            int[] iArr2 = new int[lIIlllIlI[0]];
            iArr2[lIIlllIlI[1]] = lIIlllIlI[51];
            NPC nearest = NPCs.getNearest(iArr2);
            int[] iArr3 = new int[lIIlllIlI[0]];
            iArr3[lIIlllIlI[1]] = lIIlllIlI[52];
            NPC nearest2 = NPCs.getNearest(iArr3);
            int[] iArr4 = new int[lIIlllIlI[0]];
            iArr4[lIIlllIlI[1]] = lIIlllIlI[53];
            NPC nearest3 = NPCs.getNearest(iArr4);
            int[] iArr5 = new int[lIIlllIlI[0]];
            iArr5[lIIlllIlI[1]] = lIIlllIlI[54];
            NPC nearest4 = NPCs.getNearest(iArr5);
            if (lIIIIIllIIII(new WorldArea(lIIlllIlI[55], lIIlllIlI[56], lIIlllIlI[14], lIIlllIlI[14], lIIlllIlI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIllIlII(nearest)) {
                WorldArea worldArea = new WorldArea(lIIlllIlI[57], lIIlllIlI[58], lIIlllIlI[14], lIIlllIlI[6], lIIlllIlI[1]);
                if (lIIIIIllIIlI(worldArea.contains(nearest) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[42]];
                    WorldPoint worldPoint = new WorldPoint(lIIlllIlI[59], lIIlllIlI[60], lIIlllIlI[1]);
                    if (lIIIIIllIIlI(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                        C0004e.c(worldPoint);
                        Time.sleepTicks(lIIlllIlI[0]);
                        "".length();
                    }
                }
                if (lIIIIIllIIII(worldArea.contains(nearest) ? 1 : 0)) {
                    WorldPoint worldPoint2 = new WorldPoint(lIIlllIlI[59], lIIlllIlI[61], lIIlllIlI[1]);
                    if (lIIIIIllIIlI(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[62]];
                        C0004e.c(worldPoint2);
                        Time.sleepTicks(lIIlllIlI[0]);
                        "".length();
                    }
                }
            }
            WorldArea worldArea2 = new WorldArea(lIIlllIlI[63], lIIlllIlI[64], lIIlllIlI[25], lIIlllIlI[6], lIIlllIlI[1]);
            WorldArea worldArea3 = new WorldArea(lIIlllIlI[65], lIIlllIlI[58], lIIlllIlI[18], lIIlllIlI[19], lIIlllIlI[1]);
            WorldArea worldArea4 = new WorldArea(lIIlllIlI[57], lIIlllIlI[66], lIIlllIlI[9], lIIlllIlI[20], lIIlllIlI[1]);
            WorldArea worldArea5 = new WorldArea(lIIlllIlI[65], lIIlllIlI[60], lIIlllIlI[6], lIIlllIlI[6], lIIlllIlI[1]);
            if (!lIIIIIllIIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIIIIIllIIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldArea worldArea6 = new WorldArea(lIIlllIlI[63], lIIlllIlI[64], lIIlllIlI[24], lIIlllIlI[9], lIIlllIlI[1]);
                if (lIIIIIllIlII(nearest2) && lIIIIIllIlII(nearest3) && lIIIIIllIlII(nearest)) {
                    if (!lIIIIIllIIII(worldArea6.contains(nearest2) ? 1 : 0) || lIIIIIllIIlI(worldArea6.contains(nearest3) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[67]];
                    }
                    if (lIIIIIllIIII(worldArea6.contains(nearest2) ? 1 : 0) && lIIIIIllIIII(worldArea6.contains(nearest3) ? 1 : 0) && (!lIIIIIllIIlI(worldArea4.contains(nearest) ? 1 : 0) || lIIIIIllIIII(worldArea5.contains(nearest) ? 1 : 0))) {
                        WorldPoint worldPoint3 = new WorldPoint(lIIlllIlI[63], lIIlllIlI[68], lIIlllIlI[1]);
                        if (lIIIIIllIIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIllIIlI(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[69]];
                            C0004e.c(worldPoint3);
                            Time.sleepTicks(lIIlllIlI[0]);
                            "".length();
                        }
                    }
                }
                if (lIIIIIllIIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIllIIII(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIlllIlI[63], lIIlllIlI[68], lIIlllIlI[1])) ? 1 : 0)) {
                    WorldPoint worldPoint4 = new WorldPoint(lIIlllIlI[70], lIIlllIlI[71], lIIlllIlI[1]);
                    if (lIIIIIllIIlI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[72]];
                        C0004e.c(worldPoint4);
                        Time.sleepTicks(lIIlllIlI[0]);
                        "".length();
                    }
                }
            }
            WorldArea worldArea7 = new WorldArea(lIIlllIlI[73], lIIlllIlI[74], lIIlllIlI[8], lIIlllIlI[29], lIIlllIlI[1]);
            WorldArea worldArea8 = new WorldArea(lIIlllIlI[73], lIIlllIlI[75], lIIlllIlI[6], lIIlllIlI[19], lIIlllIlI[1]);
            if (lIIIIIllIIII(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIlllIlI[70], lIIlllIlI[71], lIIlllIlI[1])) ? 1 : 0) && lIIIIIllIlII(nearest4) && ((lIIIIIlllIII(nearest4.getOrientation(), lIIlllIlI[76]) && !lIIIIIllIIIl(nearest4.getWorldLocation().getX(), lIIlllIlI[77])) || (lIIIIIlllIII(nearest4.getOrientation(), lIIlllIlI[78]) && lIIIIIllIIll(nearest4.getWorldLocation().getX(), lIIlllIlI[57])))) {
                WorldPoint worldPoint5 = new WorldPoint(lIIlllIlI[63], lIIlllIlI[56], lIIlllIlI[1]);
                TileObject nearest5 = TileObjects.getNearest(tileObject2 -> {
                    if (lIIIIIllIIII(tileObject2.getName().contains(lIIlllIII[lIIlllIlI[96]]) ? 1 : 0) && lIIIIIllIlll(tileObject2.getWorldLocation().distanceTo(worldPoint5), lIIlllIlI[18])) {
                        ?? r0 = lIIlllIlI[0];
                        "".length();
                        return "   ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlllIlI[1];
                });
                if (lIIIIIllIlII(nearest5)) {
                    AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[79]];
                    nearest5.interact(lIIlllIII[lIIlllIlI[80]]);
                    Time.sleepTicks(lIIlllIlI[5]);
                    "".length();
                }
            }
            if (!lIIIIIllIIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIIIIIllIIII(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldPoint worldPoint6 = new WorldPoint(lIIlllIlI[63], lIIlllIlI[56], lIIlllIlI[1]);
                TileObject nearest6 = TileObjects.getNearest(tileObject3 -> {
                    if (lIIIIIllIIII(tileObject3.getName().contains(lIIlllIII[lIIlllIlI[95]]) ? 1 : 0) && lIIIIIllIlll(tileObject3.getWorldLocation().distanceTo(worldPoint6), lIIlllIlI[18])) {
                        ?? r0 = lIIlllIlI[0];
                        "".length();
                        return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlllIlI[1];
                });
                if (lIIIIIllIlII(nearest6)) {
                    AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[81]];
                    nearest6.interact(lIIlllIII[lIIlllIlI[82]]);
                    Time.sleepTicks(lIIlllIlI[5]);
                    "".length();
                }
            }
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            ay();
            "".length();
            if (0 != 0) {
                return ((175 ^ 187) ^ "  ".length()) & (((((58 + 131) - 180) + 134) ^ (((137 + 90) - 159) + 85)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIlllIlI[89];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v180, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v189, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v211, types: [boolean] */
    public static void ay() {
        if (lIIIIIllIIII(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lIIIIIllIIIl(bv.size(), lIIlllIlI[0])) {
                System.out.println(lIIlllIII[lIIlllIlI[1]]);
                bt = lIIlllIlI[1];
            }
        }
        if (lIIIIIllIIlI(bt ? 1 : 0)) {
            if (lIIIIIllIIIl(C0004e.j(lIIlllIlI[2]), lIIlllIlI[3])) {
                Q.cS();
            }
            if (lIIIIIllIIll(C0004e.j(lIIlllIlI[2]), lIIlllIlI[3])) {
                if (lIIIIIllIIlI(ab() ? 1 : 0)) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (lIIIIIllIlII(nearest) && lIIIIIllIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[0]];
                        C0000a.a(nearest);
                    }
                    if (lIIIIIllIlII(nearest) && lIIIIIllIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIIIIIllIIlI(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIIlllIlI[4]);
                            "".length();
                        }
                        if (lIIIIIllIIII(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[5]];
                            if (lIIIIIllIlIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIIlllIlI[6]);
                                "".length();
                            }
                            if (lIIIIIllIlIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIIlllIlI[5]);
                                "".length();
                            }
                            int[] iArr = new int[lIIlllIlI[0]];
                            iArr[lIIlllIlI[1]] = lIIlllIlI[7];
                            if (lIIIIIllIIII(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIIlllIlI[0]];
                                iArr2[lIIlllIlI[1]] = lIIlllIlI[7];
                                if (lIIIIIllIIIl(Bank.getFirst(iArr2).getQuantity(), lIIlllIlI[8])) {
                                    af();
                                    System.out.println(lIIlllIII[lIIlllIlI[9]]);
                                    bt = lIIlllIlI[0];
                                    return;
                                }
                            }
                            int[] iArr3 = new int[lIIlllIlI[9]];
                            iArr3[lIIlllIlI[1]] = lIIlllIlI[10];
                            iArr3[lIIlllIlI[0]] = lIIlllIlI[7];
                            iArr3[lIIlllIlI[5]] = lIIlllIlI[11];
                            if (lIIIIIllIIlI(C0004e.b(iArr3) ? 1 : 0)) {
                                af();
                                System.out.println(lIIlllIII[lIIlllIlI[6]]);
                                bt = lIIlllIlI[0];
                                return;
                            }
                            int[] iArr4 = new int[lIIlllIlI[9]];
                            iArr4[lIIlllIlI[1]] = lIIlllIlI[10];
                            iArr4[lIIlllIlI[0]] = lIIlllIlI[7];
                            iArr4[lIIlllIlI[5]] = lIIlllIlI[11];
                            if (lIIIIIllIIII(C0004e.b(iArr4) ? 1 : 0)) {
                                C0000a.a(lIIlllIlI[10], lIIlllIlI[8]);
                                C0000a.a(lIIlllIlI[7], lIIlllIlI[12]);
                                C0000a.a(lIIlllIlI[11], lIIlllIlI[0]);
                            }
                        }
                    }
                }
                if (lIIIIIllIIII(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIIIIllIIIl(Movement.getRunEnergy(), lIIlllIlI[13])) {
                    Inventory.getFirst(C0005f.aV).interact(lIIlllIII[lIIlllIlI[14]]);
                    Time.sleepTicks(lIIlllIlI[0]);
                    "".length();
                }
                if (lIIIIIllIIII(ab() ? 1 : 0)) {
                    C0004e.l(lIIlllIlI[11]);
                    if (lIIIIIllIIIl(Vars.getBit(lIIlllIlI[15]), lIIlllIlI[0])) {
                        WorldPoint worldPoint = new WorldPoint(lIIlllIlI[16], lIIlllIlI[17], lIIlllIlI[1]);
                        if (lIIIIIllIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlllIlI[8])) {
                            AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[18]];
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lIIlllIlI[0]);
                            "".length();
                        }
                        if (lIIIIIllIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlllIlI[8])) {
                            String str = lIIlllIII[lIIlllIlI[19]];
                            String[] strArr = new String[lIIlllIlI[0]];
                            strArr[lIIlllIlI[1]] = lIIlllIII[lIIlllIlI[20]];
                            C0006g.a(str, strArr);
                        }
                    }
                    if (lIIIIIlllIII(Vars.getBit(lIIlllIlI[15]), lIIlllIlI[0]) && lIIIIIllIIlI(Vars.getBit(lIIlllIlI[21]))) {
                        WorldPoint worldPoint2 = new WorldPoint(lIIlllIlI[22], lIIlllIlI[23], lIIlllIlI[1]);
                        if (lIIIIIllIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIlllIlI[19])) {
                            AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[24]];
                            Movement.walkTo(worldPoint2);
                            "".length();
                            Time.sleepTicks(lIIlllIlI[0]);
                            "".length();
                        }
                        if (lIIIIIllIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIlllIlI[19])) {
                            TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                                if (lIIIIIllIIII(tileObject.getName().contains(lIIlllIII[lIIlllIlI[100]]) ? 1 : 0)) {
                                    String[] strArr2 = new String[lIIlllIlI[0]];
                                    strArr2[lIIlllIlI[1]] = lIIlllIII[lIIlllIlI[101]];
                                    if (lIIIIIllIIII(tileObject.hasAction(strArr2) ? 1 : 0)) {
                                        ?? r0 = lIIlllIlI[0];
                                        "".length();
                                        return 0 != 0 ? ((53 ^ 68) ^ (150 ^ 183)) & (((71 ^ 122) ^ (99 ^ 14)) ^ (-" ".length())) : r0;
                                    }
                                }
                                return lIIlllIlI[1];
                            });
                            if (lIIIIIllIlII(nearest2)) {
                                nearest2.interact(lIIlllIII[lIIlllIlI[8]]);
                                Time.sleepTicks(lIIlllIlI[6]);
                                "".length();
                            }
                            if (lIIIIIlllIIl(nearest2)) {
                                String str2 = lIIlllIII[lIIlllIlI[25]];
                                String[] strArr2 = new String[lIIlllIlI[14]];
                                strArr2[lIIlllIlI[1]] = lIIlllIII[lIIlllIlI[26]];
                                strArr2[lIIlllIlI[0]] = lIIlllIII[lIIlllIlI[27]];
                                strArr2[lIIlllIlI[5]] = lIIlllIII[lIIlllIlI[28]];
                                strArr2[lIIlllIlI[9]] = lIIlllIII[lIIlllIlI[29]];
                                strArr2[lIIlllIlI[6]] = lIIlllIII[lIIlllIlI[30]];
                                C0006g.a(str2, strArr2);
                            }
                        }
                    }
                    if (lIIIIIlllIII(Vars.getBit(lIIlllIlI[15]), lIIlllIlI[0]) && lIIIIIlllIII(Vars.getBit(lIIlllIlI[21]), lIIlllIlI[0])) {
                        WorldArea worldArea = new WorldArea(lIIlllIlI[31], lIIlllIlI[32], lIIlllIlI[33], lIIlllIlI[34], lIIlllIlI[1]);
                        if (lIIIIIllIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint worldPoint3 = new WorldPoint(lIIlllIlI[22], lIIlllIlI[23], lIIlllIlI[1]);
                            if (lIIIIIllIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIIlllIlI[19])) {
                                AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[35]];
                                Movement.walkTo(worldPoint3);
                                "".length();
                                Time.sleepTicks(lIIlllIlI[0]);
                                "".length();
                            }
                            if (lIIIIIllIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIIlllIlI[19])) {
                                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                                    if (lIIIIIllIIII(tileObject2.getName().contains(lIIlllIII[lIIlllIlI[98]]) ? 1 : 0)) {
                                        String[] strArr3 = new String[lIIlllIlI[0]];
                                        strArr3[lIIlllIlI[1]] = lIIlllIII[lIIlllIlI[99]];
                                        if (lIIIIIllIIII(tileObject2.hasAction(strArr3) ? 1 : 0)) {
                                            ?? r0 = lIIlllIlI[0];
                                            "".length();
                                            return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                    }
                                    return lIIlllIlI[1];
                                });
                                if (lIIIIIllIlII(nearest3)) {
                                    nearest3.interact(lIIlllIII[lIIlllIlI[36]]);
                                    Time.sleepTicks(lIIlllIlI[6]);
                                    "".length();
                                }
                                if (lIIIIIlllIIl(nearest3)) {
                                    AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[37]];
                                    String[] strArr3 = new String[lIIlllIlI[0]];
                                    strArr3[lIIlllIlI[1]] = lIIlllIII[lIIlllIlI[38]];
                                    NPCs.getNearest(strArr3).interact(lIIlllIII[lIIlllIlI[39]]);
                                    Time.sleepTicks(lIIlllIlI[6]);
                                    "".length();
                                }
                            }
                        }
                        if (lIIIIIllIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            aA();
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIIIIlllIII(int i, int i2) {
        return i == i2;
    }

    private static void lIIIIIlIlllI() {
        lIIlllIII = new String[lIIlllIlI[103]];
        lIIlllIII[lIIlllIlI[1]] = lIIIIIIlllIl("EjkJLCk8NQNlOCEpDis9dDkTIDcnfEc2LT0kBC0zOjdHJzs3O0cxNXQhEiApIA==", "TPgEZ");
        lIIlllIII[lIIlllIlI[0]] = lIIIIIIllllI("m7b+vE6NOHBmAKwBBqDTqA==", "pmCsS");
        lIIlllIII[lIIlllIlI[5]] = lIIIIIIlllll("2ZUm8YnFQUGNGm16t00eTr8wRBhy076V", "SSurx");
        lIIlllIII[lIIlllIlI[9]] = lIIIIIIllllI("x1mxSQedcmqFPjTxge4KRoRF1sVvM3maSjfhgGzB3/DBOYs0oGxPqOTazHXzCzzp6F0ZpHucV+Q=", "Drbed");
        lIIlllIII[lIIlllIlI[6]] = lIIIIIIlllll("Qi0k+pCHXiM2G0nNRucPMmfKhqlUNy1MHjoWlAhCvo3RdBRWJxiZgb06AwM6M/qhLWyJ7VURHO8=", "cBbnZ");
        lIIlllIII[lIIlllIlI[14]] = lIIIIIIlllIl("EAg/AwI=", "TzVmi");
        lIIlllIII[lIIlllIlI[18]] = lIIIIIIlllll("/8A39rYU/T64dDePb8dQsQ==", "OKbGF");
        lIIlllIII[lIIlllIlI[19]] = lIIIIIIlllll("DsNd0XKMpYo=", "nFucc");
        lIIlllIII[lIIlllIlI[20]] = lIIIIIIlllll("7RH8FkV/6dRtqf0Riru2nwu3eETKRl1otBZl7KZ0mslA6RADcAXWUg==", "oiaBz");
        lIIlllIII[lIIlllIlI[24]] = lIIIIIIlllll("4U5zc9D2aiI/1TqfP5PxB4noM3pqmys3", "JZVDa");
        lIIlllIII[lIIlllIlI[8]] = lIIIIIIlllIl("LQIVIg==", "brpLd");
        lIIlllIII[lIIlllIlI[25]] = lIIIIIIllllI("tlSb5zuRdlA3nMnkmw1NDg==", "pYfii");
        lIIlllIII[lIIlllIlI[26]] = lIIIIIIlllIl("NQA6FSgfVTwYIRQQaB0xFQFoEiFGADgDLQIQO1AwCVU8GCFGASkDL1k=", "fuHpD");
        lIIlllIII[lIIlllIlI[27]] = lIIIIIIlllll("cmph/TBycADqglkhfTLfvietw6MSliSPJwkj+mIP00We0CtpnHBLe60qk/YrIjUAOMSr1HhQ3iEnERbVyM1eLQ==", "KbQIa");
        lIIlllIII[lIIlllIlI[28]] = lIIIIIIlllll("LhaFn+pHOk0VOMBzTF0dZt1C97EmiotQUKX9QcvPG87QrAFpAORU9w==", "Crjwh");
        lIIlllIII[lIIlllIlI[29]] = lIIIIIIlllIl("FwMtSAgrAiwBCiAJPEgWIQE9HA0nAj9IBCwDLRxFOgQ9SAIvHjwNC2A=", "NlXhe");
        lIIlllIII[lIIlllIlI[30]] = lIIIIIIlllll("ocAxXK/kt5YpXOBDPQDLAvsgk4h+TMsYpWlHPlyDKbzefE/ciR8hecrPUIuPH0bGhRFr2LfF/HT18rLtv2Ck5l8FpBXTc3cX", "uAfzk");
        lIIlllIII[lIIlllIlI[35]] = lIIIIIIlllIl("CAYMQgQpRxsSADQCFBYZJQI=", "Fgzbp");
        lIIlllIII[lIIlllIlI[36]] = lIIIIIIlllll("0j7X+lpl7+k=", "ljeLQ");
        lIIlllIII[lIIlllIlI[37]] = lIIIIIIllllI("uLXUB9kuZnLSLVzbyRuJXI5XG9c2F3n1", "UBdeS");
        lIIlllIII[lIIlllIlI[38]] = lIIIIIIllllI("CXEzev1xYSbu5A1tqeNlgg==", "kIsBL");
        lIIlllIII[lIIlllIlI[39]] = lIIIIIIllllI("3l6wbuTi8nvBmxGLRh0KEA==", "OpcPN");
        lIIlllIII[lIIlllIlI[44]] = lIIIIIIlllIl("AyMiNzwvIzFyKSc/Mjcg", "FMVRN");
        lIIlllIII[lIIlllIlI[12]] = lIIIIIIlllIl("BjEgKg==", "IAEDi");
        lIIlllIII[lIIlllIlI[42]] = lIIIIIIlllll("1MQZYpB5IQlT16fDlf0dkoys+a0jq7mjoqKjkpXS7TsMMqbVKgGXyA==", "SMKeL");
        lIIlllIII[lIIlllIlI[62]] = lIIIIIIllllI("61G+lUMbAoZkJirxHKZHtLSoN2DhHwvP", "QeRQh");
        lIIlllIII[lIIlllIlI[67]] = lIIIIIIllllI("gt0TEHm3/eWrjJT4Te2Z/epKvlrELZ7hCdsfOlPOanGOAYade4pKpg==", "zgerV");
        lIIlllIII[lIIlllIlI[69]] = lIIIIIIllllI("cPZTMH95aqjAo9mkxtmYNA==", "gpQxQ");
        lIIlllIII[lIIlllIlI[72]] = lIIIIIIlllIl("FQ82ZTooWiwtJzUeeDEnKx8=", "GzXEN");
        lIIlllIII[lIIlllIlI[79]] = lIIIIIIllllI("efhMgXctot6kcPImy/QfIA==", "rEyuH");
        lIIlllIII[lIIlllIlI[80]] = lIIIIIIlllIl("NS8NPA==", "eFnWC");
        lIIlllIII[lIIlllIlI[81]] = lIIIIIIlllIl("KTkIHj8XN0sdMwsyGA==", "yPkuV");
        lIIlllIII[lIIlllIlI[82]] = lIIIIIIllllI("iXbnaK//dEM=", "WjNEq");
        lIIlllIII[lIIlllIlI[90]] = lIIIIIIllllI("JrcI5Ssf9cRZCw3n8wYbdpvG7Y0nln+/", "wYNyi");
        lIIlllIII[lIIlllIlI[91]] = lIIIIIIlllll("J+1CxzfxNvpc5TQMdhNEljAirMOv5/Ar", "jbVeZ");
        lIIlllIII[lIIlllIlI[92]] = lIIIIIIlllIl("DgQiOyEEFg==", "jqGWH");
        lIIlllIII[lIIlllIlI[93]] = lIIIIIIllllI("JGEYqcaJwVw=", "QHPSB");
        lIIlllIII[lIIlllIlI[94]] = lIIIIIIllllI("4ZCCazqk4Gk=", "qPOwG");
        lIIlllIII[lIIlllIlI[95]] = lIIIIIIlllIl("KywABSY=", "cIrgU");
        lIIlllIII[lIIlllIlI[96]] = lIIIIIIlllll("ovILSZ4C3lI=", "Ovtgg");
        lIIlllIII[lIIlllIlI[87]] = lIIIIIIlllIl("CwU5Ag==", "LdMgA");
        lIIlllIII[lIIlllIlI[98]] = lIIIIIIlllll("6RrSliMoQRI=", "NVrdS");
        lIIlllIII[lIIlllIlI[99]] = lIIIIIIlllll("VS3USsDgUj8=", "niNCe");
        lIIlllIII[lIIlllIlI[100]] = lIIIIIIllllI("IgK05fE1YBQ=", "Hmwdd");
        lIIlllIII[lIIlllIlI[101]] = lIIIIIIlllIl("HQoMDA==", "Rzibk");
        lIIlllIII[lIIlllIlI[102]] = lIIIIIIlllIl("KRUFfQ==", "ppvSG");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e4, code lost:
        if (lIIIIIllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0014o.lIIlllIlI[86]) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2 = new int[lIIlllIlI[0]];
        iArr2[lIIlllIlI[1]] = lIIlllIlI[11];
        if (lIIIIIllIIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIlllIlI[11], lIIlllIlI[0], C0004e.c(lIIlllIlI[83], lIIlllIlI[50])));
            "".length();
        }
        if (lIIIIIllIIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIlllIII[lIIlllIlI[91]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIlllIlI[84], lIIlllIlI[14], lIIlllIlI[85]));
            "".length();
        }
        int[] iArr3 = new int[lIIlllIlI[0]];
        iArr3[lIIlllIlI[1]] = lIIlllIlI[7];
        if (lIIIIIllIIII(Bank.contains(iArr3) ? 1 : 0)) {
            int[] iArr4 = new int[lIIlllIlI[0]];
            iArr4[lIIlllIlI[1]] = lIIlllIlI[7];
            if (lIIIIIllIIII(Bank.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[lIIlllIlI[0]];
                iArr5[lIIlllIlI[1]] = lIIlllIlI[7];
            }
            iArr = new int[lIIlllIlI[0]];
            iArr[lIIlllIlI[1]] = lIIlllIlI[10];
            if (lIIIIIllIIII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr6 = new int[lIIlllIlI[0]];
                iArr6[lIIlllIlI[1]] = lIIlllIlI[10];
                if (!lIIIIIllIIII(Bank.contains(iArr6) ? 1 : 0)) {
                    return;
                }
                int[] iArr7 = new int[lIIlllIlI[0]];
                iArr7[lIIlllIlI[1]] = lIIlllIlI[10];
                if (!lIIIIIllIIIl(Bank.getFirst(iArr7).getQuantity(), lIIlllIlI[29])) {
                    return;
                }
            }
            bv.add(new C0003d(lIIlllIlI[10], lIIlllIlI[87], lIIlllIlI[88]));
            "".length();
        }
        bv.add(new C0003d(lIIlllIlI[7], lIIlllIlI[86], C0008i.bq));
        "".length();
        iArr = new int[lIIlllIlI[0]];
        iArr[lIIlllIlI[1]] = lIIlllIlI[10];
        if (lIIIIIllIIII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlllIlI[10], lIIlllIlI[87], lIIlllIlI[88]));
        "".length();
    }
}
