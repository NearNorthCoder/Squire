package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.l  reason: invalid package and case insensitive filesystem */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/l.class */
public class C0011l implements S {
    public static /* synthetic */ WorldPoint bN;
    public static /* synthetic */ WorldPoint bK;
    public static /* synthetic */ WorldPoint bz;
    public static /* synthetic */ WorldPoint bC;
    public static /* synthetic */ WorldPoint bA;
    public static /* synthetic */ WorldPoint bL;
    public static /* synthetic */ WorldPoint bE;
    public static /* synthetic */ WorldPoint bJ;
    public static /* synthetic */ int bT;
    public static /* synthetic */ int bS;
    public static /* synthetic */ long bP;
    static /* synthetic */ int bU;
    public static /* synthetic */ WorldPoint bD;
    public static /* synthetic */ WorldPoint bH;
    private static /* synthetic */ String[] lIIIIIIIIll;
    public static /* synthetic */ WorldPoint bI;
    public static /* synthetic */ WorldArea bR;
    public static /* synthetic */ WorldPoint bO;
    private static /* synthetic */ int[] lIIIIIIIlII;
    public static /* synthetic */ WorldPoint bB;
    public static /* synthetic */ WorldPoint bG;
    public static /* synthetic */ WorldPoint by;
    public static /* synthetic */ String[] bQ;
    public static /* synthetic */ WorldPoint bF;
    public static /* synthetic */ WorldPoint bM;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean ar() {
        WorldArea worldArea = new WorldArea(bO, lIIIIIIIlII[10], lIIIIIIIlII[10]);
        List all = Players.getAll();
        if (llIllIlIIIIll(all.isEmpty() ? 1 : 0) && llIllIlIIlIlI(all.size(), lIIIIIIIlII[0])) {
            int i = lIIIIIIIlII[1];
            while (llIllIlIIIIlI(i, all.size())) {
                if (llIllIlIIIlIl(((Player) all.get(i)).equals(Players.getLocal()) ? 1 : 0)) {
                    "".length();
                    if ("   ".length() >= ((246 ^ 179) ^ (61 ^ 124))) {
                        return ((191 ^ 155) ^ (209 ^ 162)) & (((123 ^ 109) ^ (116 ^ 53)) ^ (-" ".length()));
                    }
                } else if (llIllIlIIIlIl(worldArea.contains(((Player) all.get(i)).getWorldLocation()) ? 1 : 0)) {
                    return lIIIIIIIlII[0];
                }
                i++;
                "".length();
                if (((127 ^ 97) & ((87 ^ 73) ^ (-1))) <= (-" ".length())) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return lIIIIIIIlII[1];
    }

    public static void ap() {
        if (llIllIlIIlIIl(llIllIlIIIlll(C0004e.a(bP), lIIIIIIIlII[9] + bU))) {
            if (llIllIlIIIIll(Players.getLocal().getWorldLocation().equals(bO) ? 1 : 0)) {
                AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[10]];
                if (llIllIlIIIIlI(Movement.getRunEnergy(), lIIIIIIIlII[11]) && llIllIlIIIlIl(Inventory.contains(C0005f.aU) ? 1 : 0)) {
                    Inventory.getFirst(C0005f.aU).interact(lIIIIIIIIll[lIIIIIIIlII[12]]);
                    Time.sleepTicks(lIIIIIIIlII[0]);
                    "".length();
                }
                if (llIllIlIIIIll(bR.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIllIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo(bN), lIIIIIIIlII[10])) {
                        AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[13]];
                        Movement.walkTo(bN);
                        "".length();
                        Time.sleepTicks(lIIIIIIIlII[0]);
                        "".length();
                    }
                    if (llIllIlIIlIll(Players.getLocal().getWorldLocation().distanceTo(bN), lIIIIIIIlII[10])) {
                        AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[14]];
                        if (llIllIlIIIIlI(bS, lIIIIIIIlII[0])) {
                            C0004e.v();
                            bS += lIIIIIIIlII[0];
                        }
                        String[] strArr = new String[lIIIIIIIlII[0]];
                        strArr[lIIIIIIIlII[1]] = lIIIIIIIIll[lIIIIIIIlII[15]];
                        NPC nearest = NPCs.getNearest(strArr);
                        if (llIllIlIIIlII(nearest)) {
                            String[] strArr2 = new String[lIIIIIIIlII[0]];
                            strArr2[lIIIIIIIlII[1]] = lIIIIIIIIll[lIIIIIIIlII[16]];
                            if (llIllIlIIIlIl(nearest.hasAction(strArr2) ? 1 : 0)) {
                                nearest.interact(lIIIIIIIIll[lIIIIIIIlII[17]]);
                                Time.sleepTicks(lIIIIIIIlII[10]);
                                "".length();
                            }
                            String[] strArr3 = new String[lIIIIIIIlII[0]];
                            strArr3[lIIIIIIIlII[1]] = lIIIIIIIIll[lIIIIIIIlII[8]];
                            if (llIllIlIIIIll(nearest.hasAction(strArr3) ? 1 : 0)) {
                                C0006g.b(lIIIIIIIIll[lIIIIIIIlII[18]], bQ);
                                Time.sleepTicks(lIIIIIIIlII[0]);
                                "".length();
                            }
                        }
                    }
                }
                if (llIllIlIIIlIl(bR.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(bO);
                    "".length();
                    Time.sleepTicks(lIIIIIIIlII[0]);
                    "".length();
                }
            }
            if (llIllIlIIIlIl(Players.getLocal().getWorldLocation().equals(bO) ? 1 : 0)) {
                if (llIllIlIIlIIl(llIllIlIIlIII(C0004e.u(), 45.0d))) {
                    int[] iArr = new int[lIIIIIIIlII[0]];
                    iArr[lIIIIIIIlII[1]] = lIIIIIIIlII[2];
                    if (llIllIlIIIlIl(Inventory.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lIIIIIIIlII[0]];
                        iArr2[lIIIIIIIlII[1]] = lIIIIIIIlII[2];
                        Inventory.getFirst(iArr2).interact(lIIIIIIIIll[lIIIIIIIlII[19]]);
                        Time.sleepTicks(lIIIIIIIlII[0]);
                        "".length();
                    }
                }
                if (llIllIlIIIIll(ar() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[20]];
                    Time.sleepTicks(lIIIIIIIlII[15]);
                    "".length();
                }
                if (llIllIlIIIlIl(ar() ? 1 : 0)) {
                    new WorldArea(bO, lIIIIIIIlII[3], lIIIIIIIlII[3]);
                    NPC aq = aq();
                    AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[21]];
                    if (llIllIlIIllII(Players.getLocal().getInteracting()) && llIllIlIIIlII(aq) && llIllIlIIIIll(aq.isDead() ? 1 : 0)) {
                        System.out.println(lIIIIIIIIll[lIIIIIIIlII[22]]);
                        aq.interact(lIIIIIIIIll[lIIIIIIIlII[23]]);
                        Time.sleepTicks(lIIIIIIIlII[3]);
                        "".length();
                    }
                    Time.sleepTicks(lIIIIIIIlII[12]);
                    "".length();
                }
            }
        }
        if (llIllIlIIllIl(llIllIlIIIlll(C0004e.a(bP), lIIIIIIIlII[9] + bU))) {
            WorldArea worldArea = new WorldArea(lIIIIIIIlII[24], lIIIIIIIlII[25], lIIIIIIIlII[26], lIIIIIIIlII[27], lIIIIIIIlII[1]);
            WorldPoint worldPoint = new WorldPoint(lIIIIIIIlII[28], lIIIIIIIlII[29], lIIIIIIIlII[1]);
            if (llIllIlIIIlIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIIIIIlII[13])) {
                Movement.walkTo(worldPoint);
                "".length();
            }
            AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[30]];
            Movement.walkTo(bE);
            "".length();
            Time.sleepTicks(lIIIIIIIlII[0]);
            "".length();
            if (llIllIlIIlIll(Players.getLocal().getWorldLocation().distanceTo(bE), lIIIIIIIlII[3])) {
                bP = System.currentTimeMillis();
                bU = C0004e.c(lIIIIIIIlII[31], lIIIIIIIlII[32]);
            }
        }
    }

    private static boolean llIllIlIIllII(Object obj) {
        return obj == null;
    }

    private static String llIllIIllllIl(String lllllllllllllllllIlIIIIIIllllIlI, String lllllllllllllllllIlIIIIIIllllIIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIIIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIIIllllIIl.getBytes(StandardCharsets.UTF_8)), lIIIIIIIlII[16]), "DES");
            Cipher lllllllllllllllllIlIIIIIIlllllII = Cipher.getInstance("DES");
            lllllllllllllllllIlIIIIIIlllllII.init(lIIIIIIIlII[3], lllllllllllllllllIlIIIIIIlllllIl);
            return new String(lllllllllllllllllIlIIIIIIlllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIIIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIIIIIllllIll) {
            lllllllllllllllllIlIIIIIIllllIll.printStackTrace();
            return null;
        }
    }

    private static String llIllIIllllll(String lllllllllllllllllIlIIIIIIllIlIlI, String lllllllllllllllllIlIIIIIIllIlIIl) {
        String lllllllllllllllllIlIIIIIIllIlIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIIIIIllIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIlIIIIIIllIlIIl.toCharArray();
        int lllllllllllllllllIlIIIIIIllIIllI = lIIIIIIIlII[1];
        char[] charArray2 = lllllllllllllllllIlIIIIIIllIlIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIIIIIIIlII[1];
        while (llIllIlIIIIlI(i, length)) {
            char lllllllllllllllllIlIIIIIIllIlIll = charArray2[i];
            sb.append((char) (lllllllllllllllllIlIIIIIIllIlIll ^ charArray[lllllllllllllllllIlIIIIIIllIIllI % charArray.length]));
            "".length();
            lllllllllllllllllIlIIIIIIllIIllI++;
            i++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llIllIlIIIIIl() {
        lIIIIIIIlII = new int[68];
        lIIIIIIIlII[0] = " ".length();
        lIIIIIIIlII[1] = (53 ^ 111) & ((221 ^ 135) ^ (-1));
        lIIIIIIIlII[2] = (-((-113) & 7413)) & (-16897) & 24575;
        lIIIIIIIlII[3] = "  ".length();
        lIIIIIIIlII[4] = (-10245) & 15244;
        lIIIIIIIlII[5] = 5 ^ 29;
        lIIIIIIIlII[6] = (-((-28673) & 29839)) & (-1) & 13791;
        lIIIIIIIlII[7] = (-24755) & 32763;
        lIIIIIIIlII[8] = 56 ^ 50;
        lIIIIIIIlII[9] = (-20503) & 620502;
        lIIIIIIIlII[10] = "   ".length();
        lIIIIIIIlII[11] = (41 ^ 32) ^ (251 ^ 180);
        lIIIIIIIlII[12] = 57 ^ 61;
        lIIIIIIIlII[13] = (222 ^ 160) ^ (65 ^ 58);
        lIIIIIIIlII[14] = 15 ^ 9;
        lIIIIIIIlII[15] = 55 ^ 48;
        lIIIIIIIlII[16] = (20 ^ 56) ^ (20 ^ 48);
        lIIIIIIIlII[17] = 73 ^ 64;
        lIIIIIIIlII[18] = 202 ^ 193;
        lIIIIIIIlII[19] = (72 ^ 49) ^ (229 ^ 144);
        lIIIIIIIlII[20] = (163 ^ 130) ^ (105 ^ 69);
        lIIIIIIIlII[21] = 145 ^ 159;
        lIIIIIIIlII[22] = 114 ^ 125;
        lIIIIIIIlII[23] = (107 ^ 110) ^ (100 ^ 113);
        lIIIIIIIlII[24] = (-((-2093) & 27759)) & (-2) & 28671;
        lIIIIIIIlII[25] = (-((-2597) & 11119)) & (-4626) & 16379;
        lIIIIIIIlII[26] = 113 ^ 48;
        lIIIIIIIlII[27] = 81 ^ 118;
        lIIIIIIIlII[28] = (-((-8777) & 29257)) & (-9235) & 32767;
        lIIIIIIIlII[29] = (-4865) & 8111;
        lIIIIIIIlII[30] = (((96 + 122) - 164) + 120) ^ (((127 + 167) - 109) + 6);
        lIIIIIIIlII[31] = (-((-21171) & 22519)) & (-16388) & 32735;
        lIIIIIIIlII[32] = (-645) & 30644;
        lIIIIIIIlII[33] = (80 ^ 104) ^ (192 ^ 156);
        lIIIIIIIlII[34] = (72 ^ 112) ^ (25 ^ 51);
        lIIIIIIIlII[35] = (((165 + 96) - 226) + 172) ^ (((147 + 38) - 146) + 133);
        lIIIIIIIlII[36] = (75 ^ 126) ^ (39 ^ 1);
        lIIIIIIIlII[37] = (-((-690) & 19383)) & (-12291) & 32759;
        lIIIIIIIlII[38] = (-((-13387) & 29806)) & (-8193) & 28079;
        lIIIIIIIlII[39] = (-((-1185) & 29950)) & (-33) & 30589;
        lIIIIIIIlII[40] = (-28683) & 32190;
        lIIIIIIIlII[41] = (-((-2563) & 23319)) & (-8195) & 30687;
        lIIIIIIIlII[42] = (-((-9233) & 30227)) & (-81) & 24543;
        lIIIIIIIlII[43] = (-((-577) & 12892)) & (-2337) & 16383;
        lIIIIIIIlII[44] = (-4614) & 8117;
        lIIIIIIIlII[45] = (-((-18503) & 31047)) & (-16386) & 30719;
        lIIIIIIIlII[46] = (-12294) & 14079;
        lIIIIIIIlII[47] = (-((-18795) & 31611)) & (-16449) & 32767;
        lIIIIIIIlII[48] = (-((-17657) & 32251)) & (-9) & 16367;
        lIIIIIIIlII[49] = (-4361) & 6126;
        lIIIIIIIlII[50] = (-21049) & 24571;
        lIIIIIIIlII[51] = (-((-1927) & 32687)) & (-1) & 32509;
        lIIIIIIIlII[52] = (-((-13959) & 32743)) & (-1) & 20459;
        lIIIIIIIlII[53] = (-((-241) & 25338)) & (-4129) & 32703;
        lIIIIIIIlII[54] = (-((-10001) & 32601)) & (-1) & 24317;
        lIIIIIIIlII[55] = (-529) & 3995;
        lIIIIIIIlII[56] = (-((-2561) & 31505)) & (-1) & 30717;
        lIIIIIIIlII[57] = (-((-3083) & 24187)) & (-9) & 24573;
        lIIIIIIIlII[58] = (-((-4033) & 32722)) & (-1025) & 32767;
        lIIIIIIIlII[59] = (-4945) & 8190;
        lIIIIIIIlII[60] = 61 ^ 41;
        lIIIIIIIlII[61] = (46 ^ 117) ^ (12 ^ 66);
        lIIIIIIIlII[62] = 184 ^ 174;
        lIIIIIIIlII[63] = (-((-9497) & 26490)) & (-4113) & 22271;
        lIIIIIIIlII[64] = (-12291) & 15674;
        lIIIIIIIlII[65] = (-18629) & 19415;
        lIIIIIIIlII[66] = (-21569) & 22263;
        lIIIIIIIlII[67] = 187 ^ 172;
    }

    private static int llIllIlIIlIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIllIlIIIIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIllIlIIllll(Skills.getLevel(Skill.RANGED), lIIIIIIIlII[35]) && llIllIlIIllll(Skills.getLevel(Skill.DEFENCE), lIIIIIIIlII[35])) {
            ?? r0 = lIIIIIIIlII[0];
            "".length();
            return (-" ".length()) >= 0 ? ((51 ^ 124) ^ (245 ^ 159)) & (((108 ^ 34) ^ (1 ^ 106)) ^ (-" ".length())) : r0;
        }
        return lIIIIIIIlII[1];
    }

    private static int llIllIlIIIlll(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean llIllIlIIIIll(int i) {
        return i == 0;
    }

    private static boolean llIllIlIIlIlI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lIIIIIIIlII[1];
    }

    private static boolean llIllIlIIllll(int i, int i2) {
        return i >= i2;
    }

    static NPC aq() {
        WorldPoint worldPoint = bO;
        WorldPoint worldPoint2 = new WorldPoint(bO.getX() - lIIIIIIIlII[0], bO.getWorldY() + lIIIIIIIlII[0], lIIIIIIIlII[1]);
        WorldPoint worldPoint3 = new WorldPoint(bO.getX(), bO.getWorldY() + lIIIIIIIlII[0], lIIIIIIIlII[1]);
        WorldPoint worldPoint4 = new WorldPoint(bO.getX() + lIIIIIIIlII[0], bO.getWorldY() + lIIIIIIIlII[0], lIIIIIIIlII[1]);
        WorldPoint worldPoint5 = new WorldPoint(bO.getX() + lIIIIIIIlII[0], bO.getWorldY(), lIIIIIIIlII[1]);
        WorldPoint worldPoint6 = new WorldPoint(bO.getX() + lIIIIIIIlII[0], bO.getWorldY() - lIIIIIIIlII[0], lIIIIIIIlII[1]);
        WorldPoint worldPoint7 = new WorldPoint(bO.getX(), bO.getWorldY() - lIIIIIIIlII[0], lIIIIIIIlII[1]);
        WorldPoint worldPoint8 = new WorldPoint(bO.getX() - lIIIIIIIlII[0], bO.getWorldY() - lIIIIIIIlII[0], lIIIIIIIlII[1]);
        WorldPoint worldPoint9 = new WorldPoint(bO.getX() - lIIIIIIIlII[0], bO.getWorldY(), lIIIIIIIlII[1]);
        List all = NPCs.getAll(npc -> {
            return npc.getName().equalsIgnoreCase(lIIIIIIIIll[lIIIIIIIlII[36]]);
        });
        if (llIllIlIIIlII(all)) {
            List of = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int i = lIIIIIIIlII[1];
            while (llIllIlIIIIlI(i, all.size())) {
                if (llIllIlIIIlIl(of.contains(((NPC) all.get(i)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC) all.get(i);
                }
                i++;
                "".length();
                if ("  ".length() != "  ".length()) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    private static boolean llIllIlIIIlII(Object obj) {
        return obj != null;
    }

    public static void as() {
        int c = C0004e.c(lIIIIIIIlII[0], lIIIIIIIlII[13]);
        if (llIllIlIIlllI(c, lIIIIIIIlII[0])) {
            bO = by;
            bE = bz;
        }
        if (llIllIlIIlllI(c, lIIIIIIIlII[3])) {
            bO = bF;
            bE = bG;
        }
        if (llIllIlIIlllI(c, lIIIIIIIlII[10])) {
            bO = bH;
            bE = bI;
        }
        if (llIllIlIIlllI(c, lIIIIIIIlII[12])) {
            bO = bJ;
            bE = bK;
        }
        if (llIllIlIIlllI(c, lIIIIIIIlII[13])) {
            bO = bL;
            bE = bM;
        }
    }

    private static void ao() {
        if (llIllIlIIIIlI(bT, lIIIIIIIlII[0])) {
            bP = System.currentTimeMillis();
            System.out.println(lIIIIIIIIll[lIIIIIIIlII[1]]);
            bT += lIIIIIIIlII[0];
        }
        int[] iArr = new int[lIIIIIIIlII[0]];
        iArr[lIIIIIIIlII[1]] = lIIIIIIIlII[2];
        if (llIllIlIIIIll(Inventory.contains(iArr) ? 1 : 0)) {
            BankLocation nearest = BankLocation.getNearest();
            if (llIllIlIIIlII(nearest) && llIllIlIIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[0]];
                C0000a.a(nearest);
            }
            if (llIllIlIIIlII(nearest) && llIllIlIIIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[3]];
                if (llIllIlIIIIll(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIIIIIIIlII[4]);
                    "".length();
                }
                if (llIllIlIIIlIl(Bank.isOpen() ? 1 : 0)) {
                    if (llIllIlIIIllI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIIIIIIIlII[0]);
                        "".length();
                    }
                    C0000a.a(lIIIIIIIlII[2], lIIIIIIIlII[5]);
                    C0000a.a(lIIIIIIIlII[6], lIIIIIIIlII[0]);
                    C0000a.a(lIIIIIIIlII[7], lIIIIIIIlII[8]);
                }
            }
        }
        int[] iArr2 = new int[lIIIIIIIlII[0]];
        iArr2[lIIIIIIIlII[1]] = lIIIIIIIlII[2];
        if (llIllIlIIIlIl(Inventory.contains(iArr2) ? 1 : 0)) {
            ap();
        }
    }

    private static boolean llIllIlIIlllI(int i, int i2) {
        return i == i2;
    }

    private static boolean llIllIlIIllIl(int i) {
        return i >= 0;
    }

    private static boolean llIllIlIIlIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIllIlIIIlIl(int i) {
        return i != 0;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            ao();
            "".length();
            if ("  ".length() <= ((47 ^ 28) & ((115 ^ 64) ^ (-1)))) {
                return (122 ^ 68) & ((95 ^ 97) ^ (-1));
            }
        } catch (Exception e2) {
        }
        return lIIIIIIIlII[33];
    }

    private static String llIllIIlllllI(String lllllllllllllllllIlIIIIIlIIIIlll, String lllllllllllllllllIlIIIIIlIIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIIlIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIIIlII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIIlIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIIIIlIIIlIII) {
            lllllllllllllllllIlIIIIIlIIIlIII.printStackTrace();
            return null;
        }
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lIIIIIIIIll[lIIIIIIIlII[34]];
    }

    private static boolean llIllIlIIIllI(int i) {
        return i > 0;
    }

    private static boolean llIllIlIIlIIl(int i) {
        return i < 0;
    }

    static {
        llIllIlIIIIIl();
        llIllIlIIIIII();
        by = new WorldPoint(lIIIIIIIlII[37], lIIIIIIIlII[38], lIIIIIIIlII[1]);
        bz = new WorldPoint(lIIIIIIIlII[39], lIIIIIIIlII[40], lIIIIIIIlII[1]);
        bA = new WorldPoint(lIIIIIIIlII[41], lIIIIIIIlII[42], lIIIIIIIlII[1]);
        bB = new WorldPoint(lIIIIIIIlII[43], lIIIIIIIlII[44], lIIIIIIIlII[1]);
        bC = new WorldPoint(lIIIIIIIlII[45], lIIIIIIIlII[38], lIIIIIIIlII[1]);
        bD = new WorldPoint(lIIIIIIIlII[46], lIIIIIIIlII[47], lIIIIIIIlII[1]);
        bE = new WorldPoint(lIIIIIIIlII[39], lIIIIIIIlII[40], lIIIIIIIlII[1]);
        bF = new WorldPoint(lIIIIIIIlII[48], lIIIIIIIlII[38], lIIIIIIIlII[1]);
        bG = new WorldPoint(lIIIIIIIlII[49], lIIIIIIIlII[50], lIIIIIIIlII[1]);
        bH = new WorldPoint(lIIIIIIIlII[51], lIIIIIIIlII[42], lIIIIIIIlII[1]);
        bI = new WorldPoint(lIIIIIIIlII[49], lIIIIIIIlII[50], lIIIIIIIlII[1]);
        bJ = new WorldPoint(lIIIIIIIlII[52], lIIIIIIIlII[53], lIIIIIIIlII[1]);
        bK = new WorldPoint(lIIIIIIIlII[54], lIIIIIIIlII[55], lIIIIIIIlII[1]);
        bL = new WorldPoint(lIIIIIIIlII[56], lIIIIIIIlII[57], lIIIIIIIlII[1]);
        bM = new WorldPoint(lIIIIIIIlII[39], lIIIIIIIlII[40], lIIIIIIIlII[1]);
        bN = new WorldPoint(lIIIIIIIlII[58], lIIIIIIIlII[59], lIIIIIIIlII[1]);
        bO = new WorldPoint(lIIIIIIIlII[37], lIIIIIIIlII[38], lIIIIIIIlII[1]);
        bP = System.currentTimeMillis();
        String[] strArr = new String[lIIIIIIIlII[10]];
        strArr[lIIIIIIIlII[1]] = lIIIIIIIIll[lIIIIIIIlII[60]];
        strArr[lIIIIIIIlII[0]] = lIIIIIIIIll[lIIIIIIIlII[61]];
        strArr[lIIIIIIIlII[3]] = lIIIIIIIIll[lIIIIIIIlII[62]];
        bQ = strArr;
        bR = new WorldArea(lIIIIIIIlII[63], lIIIIIIIlII[64], lIIIIIIIlII[65], lIIIIIIIlII[66], lIIIIIIIlII[1]);
        bS = lIIIIIIIlII[1];
        bU = C0004e.c(lIIIIIIIlII[31], lIIIIIIIlII[32]);
    }

    private static void llIllIlIIIIII() {
        lIIIIIIIIll = new String[lIIIIIIIlII[67]];
        lIIIIIIIIll[lIIIIIIIlII[1]] = llIllIIllllIl("vv5UuZF7+8f2WDYZ2ZHmXaZ5fEfs3Ln3", "ZwGpx");
        lIIIIIIIIll[lIIIIIIIlII[0]] = llIllIIlllllI("s3QcKi+1YmpAW4Wxd6Vun+6VPmIuYnH8", "bXonk");
        lIIIIIIIIll[lIIIIIIIlII[3]] = llIllIIlllllI("dVl5N//ZprOv2/aQ0QcMViI5urKDfWju", "RIvxo");
        lIIIIIIIIll[lIIIIIIIlII[10]] = llIllIIllllIl("M4M4qrf0izad06jueYnCfN4BH0tnXIog", "Mpyvv");
        lIIIIIIIIll[lIIIIIIIlII[12]] = llIllIIllllll("BQMFJzk=", "AqlIR");
        lIIIIIIIIll[lIIIIIIIlII[13]] = llIllIIlllllI("pS/vJDjbWb0yu7sYPXz9iQ==", "swkTQ");
        lIIIIIIIIll[lIIIIIIIlII[14]] = llIllIIllllll("BTgeJxQoeQYmFz55EysZOQ==", "MYpCx");
        lIIIIIIIIll[lIIIIIIIlII[15]] = llIllIIlllllI("TrYK0S3co58=", "IDhtZ");
        lIIIIIIIIll[lIIIIIIIlII[16]] = llIllIIllllIl("TPQlz8BmqVabbMfKIHMDF/trNn9eJu+b", "FldeE");
        lIIIIIIIIll[lIIIIIIIlII[17]] = llIllIIlllllI("tw6ZguSsaM+ew2JmbBL7LqdxJu/Pus20", "bWmPn");
        lIIIIIIIIll[lIIIIIIIlII[8]] = llIllIIlllllI("KDowinUmhnD9q7eGB0cR+kfQ1PtfynHw", "IOHkz");
        lIIIIIIIIll[lIIIIIIIlII[18]] = llIllIIllllIl("TfmlBN08D+A=", "CYsaT");
        lIIIIIIIIll[lIIIIIIIlII[19]] = llIllIIlllllI("OftE3aTDdXs=", "Yidnd");
        lIIIIIIIIll[lIIIIIIIlII[20]] = llIllIIlllllI("YVMx9L9o5/CrywBNUivX5Q==", "tWRoj");
        lIIIIIIIIll[lIIIIIIIlII[21]] = llIllIIllllIl("F25YaN2TjgsO9K3GoyNUWg==", "YcEcJ");
        lIIIIIIIIll[lIIIIIIIlII[22]] = llIllIIlllllI("2322gvxJSWp3yqPaRh0yI+6VF9xo6+9L", "PCmLc");
        lIIIIIIIIll[lIIIIIIIlII[23]] = llIllIIllllll("NzoNBREd", "vNydr");
        lIIIIIIIIll[lIIIIIIIlII[30]] = llIllIIllllIl("bNpZdrikfXYieNd65hO7xg==", "wccFG");
        lIIIIIIIIll[lIIIIIIIlII[34]] = llIllIIlllllI("XqOZKrv8dBzyZ6ciqzf/qw==", "CHPMe");
        lIIIIIIIIll[lIIIIIIIlII[36]] = llIllIIlllllI("VVxQcv4UkCwVHyt9x17DnQ==", "EqICj");
        lIIIIIIIIll[lIIIIIIIlII[60]] = llIllIIllllll("JhoJBUsBUg8DCRMGRFEPExxICAMHUhwQBxdSBRRMBhoNAwlSAgQUDQEXVw==", "rrhql");
        lIIIIIIIIll[lIIIIIIIlII[61]] = llIllIIllllIl("qc9ndSbkUrdpvSWH3hIiiP5lSUHb0pzgA7GJ/OMSEwDrqi5MUE3CBA==", "DNWLn");
        lIIIIIIIIll[lIIIIIIIlII[62]] = llIllIIlllllI("POrNYRzVUh4Cs84c9dJS+w==", "mIRCt");
    }
}
