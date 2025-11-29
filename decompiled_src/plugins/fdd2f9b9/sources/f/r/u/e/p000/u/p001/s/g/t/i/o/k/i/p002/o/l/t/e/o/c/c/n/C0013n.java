package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.n  reason: invalid package and case insensitive filesystem */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/n.class */
public class C0013n implements G {
    public static /* synthetic */ WorldPoint bz;
    public static /* synthetic */ WorldArea bS;
    public static /* synthetic */ WorldPoint bB;
    public static /* synthetic */ WorldPoint bJ;
    public static /* synthetic */ WorldPoint bM;
    public static /* synthetic */ WorldPoint bC;
    public static /* synthetic */ String[] bR;
    public static /* synthetic */ long bQ;
    public static /* synthetic */ WorldPoint bH;
    public static /* synthetic */ int bT;
    public static /* synthetic */ WorldPoint bE;
    public static /* synthetic */ WorldPoint bN;
    public static /* synthetic */ WorldPoint bF;
    private static /* synthetic */ String[] lIIlllIIII;
    public static /* synthetic */ WorldPoint bO;
    public static /* synthetic */ WorldPoint bL;
    private static /* synthetic */ int[] lIIlllIIIl;
    public static /* synthetic */ WorldPoint bI;
    public static /* synthetic */ WorldPoint bD;
    static /* synthetic */ int bV;
    public static /* synthetic */ WorldPoint bP;
    public static /* synthetic */ WorldPoint bA;
    public static /* synthetic */ WorldPoint bK;
    public static /* synthetic */ WorldPoint bG;
    public static /* synthetic */ int bU;

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIlllIIII[lIIlllIIIl[34]];
    }

    public static void aw() {
        int c = C0004e.c(lIIlllIIIl[0], lIIlllIIIl[13]);
        if (lIIIIIllllIlI(c, lIIlllIIIl[0])) {
            bP = bz;
            bF = bA;
        }
        if (lIIIIIllllIlI(c, lIIlllIIIl[3])) {
            bP = bG;
            bF = bH;
        }
        if (lIIIIIllllIlI(c, lIIlllIIIl[10])) {
            bP = bI;
            bF = bJ;
        }
        if (lIIIIIllllIlI(c, lIIlllIIIl[12])) {
            bP = bK;
            bF = bL;
        }
        if (lIIIIIllllIlI(c, lIIlllIIIl[13])) {
            bP = bM;
            bF = bN;
        }
    }

    private static boolean lIIIIIllllIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIIIlllIlll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIIIlllIlIl(int i) {
        return i < 0;
    }

    private static void lIIIIIllIllIl() {
        lIIlllIIIl = new int[68];
        lIIlllIIIl[0] = " ".length();
        lIIlllIIIl[1] = ((121 ^ 111) ^ (254 ^ 167)) & (((0 ^ 29) ^ (239 ^ 189)) ^ (-" ".length()));
        lIIlllIIIl[2] = (-((-3231) & 32415)) & (-1153) & 30715;
        lIIlllIIIl[3] = "  ".length();
        lIIlllIIIl[4] = (-((-921) & 9183)) & (-3122) & 16383;
        lIIlllIIIl[5] = 123 ^ 99;
        lIIlllIIIl[6] = (-19495) & 32119;
        lIIlllIIIl[7] = (-((-7173) & 31751)) & (-49) & 32635;
        lIIlllIIIl[8] = (224 ^ 148) ^ (194 ^ 188);
        lIIlllIIIl[9] = (-((-3353) & 23839)) & (-42) & 620527;
        lIIlllIIIl[10] = "   ".length();
        lIIlllIIIl[11] = 135 ^ 193;
        lIIlllIIIl[12] = 84 ^ 80;
        lIIlllIIIl[13] = (((105 + 6) - (-18)) + 24) ^ (((151 + 97) - 206) + 114);
        lIIlllIIIl[14] = 1 ^ 7;
        lIIlllIIIl[15] = 119 ^ 112;
        lIIlllIIIl[16] = 178 ^ 186;
        lIIlllIIIl[17] = 113 ^ 120;
        lIIlllIIIl[18] = 117 ^ 126;
        lIIlllIIIl[19] = 43 ^ 39;
        lIIlllIIIl[20] = (115 ^ 6) ^ (193 ^ 185);
        lIIlllIIIl[21] = 136 ^ 134;
        lIIlllIIIl[22] = (((38 + 158) - 155) + 146) ^ (((8 + 105) - (-20)) + 47);
        lIIlllIIIl[23] = 28 ^ 12;
        lIIlllIIIl[24] = (-21508) & 24511;
        lIIlllIIIl[25] = (-20552) & 23783;
        lIIlllIIIl[26] = 108 ^ 45;
        lIIlllIIIl[27] = 48 ^ 23;
        lIIlllIIIl[28] = (-8209) & 11261;
        lIIlllIIIl[29] = (-4945) & 8191;
        lIIlllIIIl[30] = 132 ^ 149;
        lIIlllIIIl[31] = (-((-8349) & 26111)) & (-1) & 32762;
        lIIlllIIIl[32] = (-705) & 30704;
        lIIlllIIIl[33] = (((203 + 234) - 263) + 68) ^ (((5 + 130) - 131) + 146);
        lIIlllIIIl[34] = (147 ^ 175) ^ (30 ^ 48);
        lIIlllIIIl[35] = (173 ^ 147) ^ (51 ^ 110);
        lIIlllIIIl[36] = (109 ^ 34) ^ (2 ^ 94);
        lIIlllIIIl[37] = (-16392) & 18167;
        lIIlllIIIl[38] = (-12898) & 16365;
        lIIlllIIIl[39] = (-16492) & 18283;
        lIIlllIIIl[40] = (-16460) & 19967;
        lIIlllIIIl[41] = (-((-10329) & 30809)) & (-8481) & 30697;
        lIIlllIIIl[42] = (-((-4965) & 29559)) & (-4641) & 32703;
        lIIlllIIIl[43] = (-22794) & 24525;
        lIIlllIIIl[44] = (-((-135) & 20615)) & (-8711) & 32694;
        lIIlllIIIl[45] = (-10242) & 12031;
        lIIlllIIIl[46] = (-((-13498) & 31935)) & (-4353) & 24575;
        lIIlllIIIl[47] = (-8193) & 11695;
        lIIlllIIIl[48] = (-((-10209) & 32763)) & (-8193) & 32511;
        lIIlllIIIl[49] = (-20754) & 22519;
        lIIlllIIIl[50] = (-((-1651) & 22135)) & (-8713) & 32719;
        lIIlllIIIl[51] = (-((-15509) & 32151)) & (-2049) & 20439;
        lIIlllIIIl[52] = (-16721) & 18395;
        lIIlllIIIl[53] = (-((-15635) & 32091)) & (-1) & 19934;
        lIIlllIIIl[54] = (-28995) & 30711;
        lIIlllIIIl[55] = (-((-18611) & 23283)) & (-8197) & 16335;
        lIIlllIIIl[56] = (-28673) & 30445;
        lIIlllIIIl[57] = (-29217) & 32677;
        lIIlllIIIl[58] = (-2) & 3055;
        lIIlllIIIl[59] = (-((-24781) & 25054)) & (-16961) & 20479;
        lIIlllIIIl[60] = (((37 + 99) - (-23)) + 30) ^ (((12 + 17) - (-137)) + 3);
        lIIlllIIIl[61] = "   ".length() ^ (29 ^ 11);
        lIIlllIIIl[62] = 43 ^ 61;
        lIIlllIIIl[63] = (-((-9770) & 32635)) & (-8705) & 32735;
        lIIlllIIIl[64] = (-4678) & 8061;
        lIIlllIIIl[65] = (-((-529) & 32377)) & (-129) & 32763;
        lIIlllIIIl[66] = (-265) & 959;
        lIIlllIIIl[67] = 31 ^ 8;
    }

    private static boolean lIIIIIllIllll(int i) {
        return i == 0;
    }

    private static String lIIIIIllIlIIl(String lllllllllllllllllllllIlIlIIllIII, String lllllllllllllllllllllIlIlIIlIlll) {
        String lllllllllllllllllllllIlIlIIllIII2 = new String(Base64.getDecoder().decode(lllllllllllllllllllllIlIlIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllllllIlIlIIlIlll.toCharArray();
        int lllllllllllllllllllllIlIlIIlIlII = lIIlllIIIl[1];
        char[] charArray2 = lllllllllllllllllllllIlIlIIllIII2.toCharArray();
        int length = charArray2.length;
        int i = lIIlllIIIl[1];
        while (lIIIIIllIlllI(i, length)) {
            char lllllllllllllllllllllIlIlIIllIIl = charArray2[i];
            sb.append((char) (lllllllllllllllllllllIlIlIIllIIl ^ charArray[lllllllllllllllllllllIlIlIIlIlII % charArray.length]));
            "".length();
            lllllllllllllllllllllIlIlIIlIlII++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static int lIIIIIlllIIll(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            as();
            "".length();
            if (!(true ^ true)) {
                return (8 ^ 77) & ((249 ^ 188) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIlllIIIl[33];
    }

    private static String lIIIIIllIlIll(String lllllllllllllllllllllIlIlIIIIIll, String lllllllllllllllllllllIlIlIIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllllllllIlIlIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIlIlIIIIIlI.getBytes(StandardCharsets.UTF_8)), lIIlllIIIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllIIIl[3], lllllllllllllllllllllIlIlIIIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIlIlIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllIlIlIIIIlII) {
            lllllllllllllllllllllIlIlIIIIlII.printStackTrace();
            return null;
        }
    }

    private static void as() {
        if (lIIIIIllIlllI(bU, lIIlllIIIl[0])) {
            bQ = System.currentTimeMillis();
            System.out.println(lIIlllIIII[lIIlllIIIl[1]]);
            bU += lIIlllIIIl[0];
        }
        int[] iArr = new int[lIIlllIIIl[0]];
        iArr[lIIlllIIIl[1]] = lIIlllIIIl[2];
        if (lIIIIIllIllll(Inventory.contains(iArr) ? 1 : 0)) {
            BankLocation nearest = BankLocation.getNearest();
            if (lIIIIIlllIIII(nearest) && lIIIIIllIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlllIIII[lIIlllIIIl[0]];
                C0000a.a(nearest);
            }
            if (lIIIIIlllIIII(nearest) && lIIIIIlllIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlllIIII[lIIlllIIIl[3]];
                if (lIIIIIllIllll(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIIlllIIIl[4]);
                    "".length();
                }
                if (lIIIIIlllIIIl(Bank.isOpen() ? 1 : 0)) {
                    if (lIIIIIlllIIlI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIIlllIIIl[0]);
                        "".length();
                    }
                    C0000a.a(lIIlllIIIl[2], lIIlllIIIl[5]);
                    C0000a.a(lIIlllIIIl[6], lIIlllIIIl[0]);
                    C0000a.a(lIIlllIIIl[7], lIIlllIIIl[8]);
                }
            }
        }
        int[] iArr2 = new int[lIIlllIIIl[0]];
        iArr2[lIIlllIIIl[1]] = lIIlllIIIl[2];
        if (lIIIIIlllIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
            at();
        }
    }

    private static boolean lIIIIIllllIII(Object obj) {
        return obj == null;
    }

    private static boolean lIIIIIlllIIIl(int i) {
        return i != 0;
    }

    private static void lIIIIIllIllII() {
        lIIlllIIII = new String[lIIlllIIIl[67]];
        lIIlllIIII[lIIlllIIIl[1]] = lIIIIIllIlIIl("ERYLFBBDEh8WFgxTDBgJBgE=", "csxqd");
        lIIlllIIII[lIIlllIIIl[0]] = lIIIIIllIlIlI("kNWD823X+FbXOfj2Bfkg48xxtpxO81vQ", "azxaW");
        lIIlllIIII[lIIlllIIIl[3]] = lIIIIIllIlIlI("oA7FBpvOtlA2cQMpAxpq9/27YUtYBOxg", "YrECF");
        lIIlllIIII[lIIlllIIIl[10]] = lIIIIIllIlIll("9q6axcc7NGyUDBIDcBONR8C1DM8b3Vts", "jwDaR");
        lIIlllIIII[lIIlllIIIl[12]] = lIIIIIllIlIIl("IxkqBSI=", "gkCkI");
        lIIlllIIII[lIIlllIIIl[13]] = lIIIIIllIlIIl("DxIjUQ4uUyMUFTI=", "AsUqz");
        lIIlllIIII[lIIlllIIIl[14]] = lIIIIIllIlIIl("OTYpFw4UdzEWDQJ3JBsDBQ==", "qWGsb");
        lIIlllIIII[lIIlllIIIl[15]] = lIIIIIllIlIIl("OTI6HQ==", "oWUnA");
        lIIlllIIII[lIIlllIIIl[16]] = lIIIIIllIlIll("zz+dNYTYX6HNM79ieaHo6MUJ5a+NiFJH", "JLDOS");
        lIIlllIIII[lIIlllIIIl[17]] = lIIIIIllIlIlI("FSXKBbOjx1Qdo5OJfvOYQOkqwC++Za+g", "EyaPb");
        lIIlllIIII[lIIlllIIIl[8]] = lIIIIIllIlIll("LqjLPFTI7J9Bnug+G/nWgCFZSzwva6qh", "QIFnA");
        lIIlllIIII[lIIlllIIIl[18]] = lIIIIIllIlIll("vxeGx5dWrZs=", "SinlE");
        lIIlllIIII[lIIlllIIIl[19]] = lIIIIIllIlIll("KOgbI+EY3VY=", "lOHDH");
        lIIlllIIII[lIIlllIIIl[20]] = lIIIIIllIlIIl("DigECy0obgYMYzw+ABY=", "ONobC");
        lIIlllIIII[lIIlllIIIl[21]] = lIIIIIllIlIIl("BDYRCQ1mMAoGGS42HA==", "FSxgj");
        lIIlllIIII[lIIlllIIIl[22]] = lIIIIIllIlIIl("NycFECcdOh8WZBUhEAIsEzc=", "vSqqD");
        lIIlllIIII[lIIlllIIIl[23]] = lIIIIIllIlIIl("IjoCEAYI", "cNvqe");
        lIIlllIIII[lIIlllIIIl[30]] = lIIIIIllIlIIl("CyE+PAItLSM+", "YDMYv");
        lIIlllIIII[lIIlllIIIl[34]] = lIIIIIllIlIIl("KyQkLE47NysqHQ==", "xEJHn");
        lIIlllIIII[lIIlllIIIl[36]] = lIIIIIllIlIIl("OAYqNGcoFSUy", "KgDPG");
        lIIlllIIII[lIIlllIIIl[60]] = lIIIIIllIlIlI("aLyvqpj5xEHeXNxlmmCnDevjrEhoEaf9tcbjcneLk0shhB1m8KMryGvG8HSOZj7I", "BCqRh");
        lIIlllIIII[lIIlllIIIl[61]] = lIIIIIllIlIIl("ICQ6RQsMMHQREwggdAgXQzE7RTURIDURUigqIRcXDSFr", "cETer");
        lIIlllIIII[lIIlllIIIl[62]] = lIIIIIllIlIll("U2J94P8TfYjTJxgWorHLFQ==", "NkiuI");
    }

    private static boolean lIIIIIllIlllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIIIlllIIlI(int i) {
        return i > 0;
    }

    public static void at() {
        if (lIIIIIlllIlIl(lIIIIIlllIIll(C0004e.a(bQ), lIIlllIIIl[9] + bV))) {
            if (lIIIIIllIllll(Players.getLocal().getWorldLocation().equals(bP) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlllIIII[lIIlllIIIl[10]];
                if (lIIIIIllIlllI(Movement.getRunEnergy(), lIIlllIIIl[11]) && lIIIIIlllIIIl(Inventory.contains(C0005f.aV) ? 1 : 0)) {
                    Inventory.getFirst(C0005f.aV).interact(lIIlllIIII[lIIlllIIIl[12]]);
                    Time.sleepTicks(lIIlllIIIl[0]);
                    "".length();
                }
                if (lIIIIIllIllll(bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIIIIlllIllI(Players.getLocal().getWorldLocation().distanceTo(bO), lIIlllIIIl[10])) {
                        AccBuilderRogues.c = lIIlllIIII[lIIlllIIIl[13]];
                        Movement.walkTo(bO);
                        "".length();
                        Time.sleepTicks(lIIlllIIIl[0]);
                        "".length();
                    }
                    if (lIIIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(bO), lIIlllIIIl[10])) {
                        AccBuilderRogues.c = lIIlllIIII[lIIlllIIIl[14]];
                        if (lIIIIIllIlllI(bT, lIIlllIIIl[0])) {
                            C0004e.v();
                            bT += lIIlllIIIl[0];
                        }
                        String[] strArr = new String[lIIlllIIIl[0]];
                        strArr[lIIlllIIIl[1]] = lIIlllIIII[lIIlllIIIl[15]];
                        NPC nearest = NPCs.getNearest(strArr);
                        if (lIIIIIlllIIII(nearest)) {
                            String[] strArr2 = new String[lIIlllIIIl[0]];
                            strArr2[lIIlllIIIl[1]] = lIIlllIIII[lIIlllIIIl[16]];
                            if (lIIIIIlllIIIl(nearest.hasAction(strArr2) ? 1 : 0)) {
                                nearest.interact(lIIlllIIII[lIIlllIIIl[17]]);
                                Time.sleepTicks(lIIlllIIIl[10]);
                                "".length();
                            }
                            String[] strArr3 = new String[lIIlllIIIl[0]];
                            strArr3[lIIlllIIIl[1]] = lIIlllIIII[lIIlllIIIl[8]];
                            if (lIIIIIllIllll(nearest.hasAction(strArr3) ? 1 : 0)) {
                                C0006g.b(lIIlllIIII[lIIlllIIIl[18]], bR);
                                Time.sleepTicks(lIIlllIIIl[0]);
                                "".length();
                            }
                        }
                    }
                }
                if (lIIIIIlllIIIl(bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(bP);
                    "".length();
                    Time.sleepTicks(lIIlllIIIl[0]);
                    "".length();
                }
            }
            if (lIIIIIlllIIIl(Players.getLocal().getWorldLocation().equals(bP) ? 1 : 0)) {
                if (lIIIIIlllIlIl(lIIIIIlllIlII(C0004e.u(), 45.0d))) {
                    int[] iArr = new int[lIIlllIIIl[0]];
                    iArr[lIIlllIIIl[1]] = lIIlllIIIl[2];
                    if (lIIIIIlllIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lIIlllIIIl[0]];
                        iArr2[lIIlllIIIl[1]] = lIIlllIIIl[2];
                        Inventory.getFirst(iArr2).interact(lIIlllIIII[lIIlllIIIl[19]]);
                        Time.sleepTicks(lIIlllIIIl[0]);
                        "".length();
                    }
                }
                if (lIIIIIllIllll(av() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlllIIII[lIIlllIIIl[20]];
                    Time.sleepTicks(lIIlllIIIl[15]);
                    "".length();
                }
                if (lIIIIIlllIIIl(av() ? 1 : 0)) {
                    new WorldArea(bP, lIIlllIIIl[3], lIIlllIIIl[3]);
                    NPC au = au();
                    AccBuilderRogues.c = lIIlllIIII[lIIlllIIIl[21]];
                    if (lIIIIIllllIII(Players.getLocal().getInteracting()) && lIIIIIlllIIII(au) && lIIIIIllIllll(au.isDead() ? 1 : 0)) {
                        System.out.println(lIIlllIIII[lIIlllIIIl[22]]);
                        au.interact(lIIlllIIII[lIIlllIIIl[23]]);
                        Time.sleepTicks(lIIlllIIIl[3]);
                        "".length();
                    }
                    Time.sleepTicks(lIIlllIIIl[12]);
                    "".length();
                }
            }
        }
        if (lIIIIIllllIIl(lIIIIIlllIIll(C0004e.a(bQ), lIIlllIIIl[9] + bV))) {
            WorldArea worldArea = new WorldArea(lIIlllIIIl[24], lIIlllIIIl[25], lIIlllIIIl[26], lIIlllIIIl[27], lIIlllIIIl[1]);
            WorldPoint worldPoint = new WorldPoint(lIIlllIIIl[28], lIIlllIIIl[29], lIIlllIIIl[1]);
            if (lIIIIIlllIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlllIIIl[13])) {
                Movement.walkTo(worldPoint);
                "".length();
            }
            AccBuilderRogues.c = lIIlllIIII[lIIlllIIIl[30]];
            Movement.walkTo(bF);
            "".length();
            Time.sleepTicks(lIIlllIIIl[0]);
            "".length();
            if (lIIIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(bF), lIIlllIIIl[3])) {
                bQ = System.currentTimeMillis();
                bV = C0004e.c(lIIlllIIIl[31], lIIlllIIIl[32]);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIlllIIIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lIIIIIllllIll(Skills.getLevel(Skill.RANGED), lIIlllIIIl[35]) && lIIIIIllllIll(Skills.getLevel(Skill.DEFENCE), lIIlllIIIl[35])) {
            ?? r0 = lIIlllIIIl[0];
            "".length();
            return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlllIIIl[1];
    }

    private static boolean lIIIIIllllIll(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean av() {
        WorldArea worldArea = new WorldArea(bP, lIIlllIIIl[10], lIIlllIIIl[10]);
        List all = Players.getAll();
        if (lIIIIIllIllll(all.isEmpty() ? 1 : 0) && lIIIIIlllIllI(all.size(), lIIlllIIIl[0])) {
            int i = lIIlllIIIl[1];
            while (lIIIIIllIlllI(i, all.size())) {
                if (lIIIIIlllIIIl(((Player) all.get(i)).equals(Players.getLocal()) ? 1 : 0)) {
                    "".length();
                    if (!((true ^ true) ^ (true ^ true))) {
                        return ((76 ^ 98) ^ (252 ^ 177)) & (((196 ^ 181) ^ (121 ^ 107)) ^ (-" ".length()));
                    }
                } else if (lIIIIIlllIIIl(worldArea.contains(((Player) all.get(i)).getWorldLocation()) ? 1 : 0)) {
                    return lIIlllIIIl[0];
                }
                i++;
                "".length();
                if (((33 ^ 24) & ((88 ^ 97) ^ (-1))) >= (135 ^ 131)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return lIIlllIIIl[1];
    }

    private static boolean lIIIIIlllIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIIllllIIl(int i) {
        return i >= 0;
    }

    private static int lIIIIIlllIlII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static String lIIIIIllIlIlI(String lllllllllllllllllllllIlIIlllIllI, String lllllllllllllllllllllIlIIlllIlIl) {
        try {
            SecretKeySpec lllllllllllllllllllllIlIIllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIlIIlllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllIIIl[3], lllllllllllllllllllllIlIIllllIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIlIIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllIlIIlllIlll) {
            lllllllllllllllllllllIlIIlllIlll.printStackTrace();
            return null;
        }
    }

    static NPC au() {
        WorldPoint worldPoint = bP;
        WorldPoint worldPoint2 = new WorldPoint(bP.getX() - lIIlllIIIl[0], bP.getWorldY() + lIIlllIIIl[0], lIIlllIIIl[1]);
        WorldPoint worldPoint3 = new WorldPoint(bP.getX(), bP.getWorldY() + lIIlllIIIl[0], lIIlllIIIl[1]);
        WorldPoint worldPoint4 = new WorldPoint(bP.getX() + lIIlllIIIl[0], bP.getWorldY() + lIIlllIIIl[0], lIIlllIIIl[1]);
        WorldPoint worldPoint5 = new WorldPoint(bP.getX() + lIIlllIIIl[0], bP.getWorldY(), lIIlllIIIl[1]);
        WorldPoint worldPoint6 = new WorldPoint(bP.getX() + lIIlllIIIl[0], bP.getWorldY() - lIIlllIIIl[0], lIIlllIIIl[1]);
        WorldPoint worldPoint7 = new WorldPoint(bP.getX(), bP.getWorldY() - lIIlllIIIl[0], lIIlllIIIl[1]);
        WorldPoint worldPoint8 = new WorldPoint(bP.getX() - lIIlllIIIl[0], bP.getWorldY() - lIIlllIIIl[0], lIIlllIIIl[1]);
        WorldPoint worldPoint9 = new WorldPoint(bP.getX() - lIIlllIIIl[0], bP.getWorldY(), lIIlllIIIl[1]);
        List all = NPCs.getAll(npc -> {
            return npc.getName().equalsIgnoreCase(lIIlllIIII[lIIlllIIIl[36]]);
        });
        if (lIIIIIlllIIII(all)) {
            List of = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int i = lIIlllIIIl[1];
            while (lIIIIIllIlllI(i, all.size())) {
                if (lIIIIIlllIIIl(of.contains(((NPC) all.get(i)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC) all.get(i);
                }
                i++;
                "".length();
                if (((78 ^ 92) & ((105 ^ 123) ^ (-1))) > "  ".length()) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    private static boolean lIIIIIlllIllI(int i, int i2) {
        return i > i2;
    }

    static {
        lIIIIIllIllIl();
        lIIIIIllIllII();
        bz = new WorldPoint(lIIlllIIIl[37], lIIlllIIIl[38], lIIlllIIIl[1]);
        bA = new WorldPoint(lIIlllIIIl[39], lIIlllIIIl[40], lIIlllIIIl[1]);
        bB = new WorldPoint(lIIlllIIIl[41], lIIlllIIIl[42], lIIlllIIIl[1]);
        bC = new WorldPoint(lIIlllIIIl[43], lIIlllIIIl[44], lIIlllIIIl[1]);
        bD = new WorldPoint(lIIlllIIIl[45], lIIlllIIIl[38], lIIlllIIIl[1]);
        bE = new WorldPoint(lIIlllIIIl[46], lIIlllIIIl[47], lIIlllIIIl[1]);
        bF = new WorldPoint(lIIlllIIIl[39], lIIlllIIIl[40], lIIlllIIIl[1]);
        bG = new WorldPoint(lIIlllIIIl[48], lIIlllIIIl[38], lIIlllIIIl[1]);
        bH = new WorldPoint(lIIlllIIIl[49], lIIlllIIIl[50], lIIlllIIIl[1]);
        bI = new WorldPoint(lIIlllIIIl[51], lIIlllIIIl[42], lIIlllIIIl[1]);
        bJ = new WorldPoint(lIIlllIIIl[49], lIIlllIIIl[50], lIIlllIIIl[1]);
        bK = new WorldPoint(lIIlllIIIl[52], lIIlllIIIl[53], lIIlllIIIl[1]);
        bL = new WorldPoint(lIIlllIIIl[54], lIIlllIIIl[55], lIIlllIIIl[1]);
        bM = new WorldPoint(lIIlllIIIl[56], lIIlllIIIl[57], lIIlllIIIl[1]);
        bN = new WorldPoint(lIIlllIIIl[39], lIIlllIIIl[40], lIIlllIIIl[1]);
        bO = new WorldPoint(lIIlllIIIl[58], lIIlllIIIl[59], lIIlllIIIl[1]);
        bP = new WorldPoint(lIIlllIIIl[37], lIIlllIIIl[38], lIIlllIIIl[1]);
        bQ = System.currentTimeMillis();
        String[] strArr = new String[lIIlllIIIl[10]];
        strArr[lIIlllIIIl[1]] = lIIlllIIII[lIIlllIIIl[60]];
        strArr[lIIlllIIIl[0]] = lIIlllIIII[lIIlllIIIl[61]];
        strArr[lIIlllIIIl[3]] = lIIlllIIII[lIIlllIIIl[62]];
        bR = strArr;
        bS = new WorldArea(lIIlllIIIl[63], lIIlllIIIl[64], lIIlllIIIl[65], lIIlllIIIl[66], lIIlllIIIl[1]);
        bT = lIIlllIIIl[1];
        bV = C0004e.c(lIIlllIIIl[31], lIIlllIIIl[32]);
    }
}
