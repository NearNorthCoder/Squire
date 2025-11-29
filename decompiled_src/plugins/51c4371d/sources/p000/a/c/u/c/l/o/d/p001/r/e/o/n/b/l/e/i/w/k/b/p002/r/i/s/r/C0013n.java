package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
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
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.n  reason: invalid package and case insensitive filesystem */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/n.class */
public class C0013n implements F {
    public static /* synthetic */ int bZ;
    public static /* synthetic */ WorldPoint bT;
    public static /* synthetic */ WorldPoint bM;
    public static /* synthetic */ WorldPoint bJ;
    public static /* synthetic */ long bW;
    public static /* synthetic */ WorldPoint bF;
    public static /* synthetic */ WorldPoint bR;
    public static /* synthetic */ int ca;
    private static /* synthetic */ int[] llIlIllI;
    public static /* synthetic */ WorldArea bY;
    public static /* synthetic */ WorldPoint bO;
    public static /* synthetic */ WorldPoint bV;
    public static /* synthetic */ WorldPoint bK;
    public static /* synthetic */ WorldPoint bN;
    public static /* synthetic */ String[] bX;
    public static /* synthetic */ WorldPoint bP;
    public static /* synthetic */ WorldPoint bQ;
    private static /* synthetic */ String[] llIlIlIl;
    static /* synthetic */ int cb;
    public static /* synthetic */ WorldPoint bG;
    public static /* synthetic */ WorldPoint bI;
    public static /* synthetic */ WorldPoint bL;
    public static /* synthetic */ WorldPoint bU;
    public static /* synthetic */ WorldPoint bH;
    public static /* synthetic */ WorldPoint bS;

    private static void lIllIIIllII() {
        llIlIllI = new int[68];
        llIlIllI[0] = " ".length();
        llIlIllI[1] = (91 ^ 118) & ((152 ^ 181) ^ (-1));
        llIlIllI[2] = (-((-1861) & 30661)) & (-3073) & 32251;
        llIlIllI[3] = "  ".length();
        llIlIllI[4] = (-18468) & 23467;
        llIlIllI[5] = 4 ^ 28;
        llIlIllI[6] = (-(121 ^ 114)) & (-18081) & 30715;
        llIlIllI[7] = (-8209) & 16217;
        llIlIllI[8] = 172 ^ 166;
        llIlIllI[9] = (-16389) & 616388;
        llIlIllI[10] = "   ".length();
        llIlIllI[11] = (20 ^ 92) ^ (157 ^ 147);
        llIlIllI[12] = 48 ^ 52;
        llIlIllI[13] = 133 ^ 128;
        llIlIllI[14] = 29 ^ 27;
        llIlIllI[15] = (6 ^ 52) ^ (32 ^ 21);
        llIlIllI[16] = 16 ^ 24;
        llIlIllI[17] = 100 ^ 109;
        llIlIllI[18] = (140 ^ 194) ^ (209 ^ 148);
        llIlIllI[19] = (((75 + 96) - 170) + 177) ^ (((168 + 182) - 230) + 70);
        llIlIllI[20] = 157 ^ 144;
        llIlIllI[21] = (((107 + 11) - 98) + 169) ^ (((18 + 11) - (-40)) + 110);
        llIlIllI[22] = (((9 + 39) - (-39)) + 43) ^ (((120 + 90) - 158) + 89);
        llIlIllI[23] = (104 ^ 17) ^ (28 ^ 117);
        llIlIllI[24] = (-12289) & 15292;
        llIlIllI[25] = (-16466) & 19697;
        llIlIllI[26] = (((112 + 187) - 275) + 195) ^ (((113 + 101) - 196) + 136);
        llIlIllI[27] = 64 ^ 103;
        llIlIllI[28] = (-((-201) & 17611)) & (-4113) & 24575;
        llIlIllI[29] = (-((-1059) & 17507)) & (-8465) & 28159;
        llIlIllI[30] = 111 ^ 126;
        llIlIllI[31] = (-((-14530) & 15845)) & (-16449) & 32763;
        llIlIllI[32] = (-14) & 30013;
        llIlIllI[33] = (186 ^ 189) ^ (66 ^ 33);
        llIlIllI[34] = (213 ^ 131) ^ (242 ^ 182);
        llIlIllI[35] = (((51 + 221) - 168) + 141) ^ (((85 + 1) - 72) + 136);
        llIlIllI[36] = (230 ^ 167) ^ (48 ^ 98);
        llIlIllI[37] = (-12303) & 14078;
        llIlIllI[38] = (-((-4293) & 20679)) & (-4130) & 23983;
        llIlIllI[39] = (-14352) & 16143;
        llIlIllI[40] = (-((-2065) & 10834)) & (-1) & 12277;
        llIlIllI[41] = (-((-13515) & 32255)) & (-12291) & 32767;
        llIlIllI[42] = (-((-1509) & 6117)) & (-24657) & 32733;
        llIlIllI[43] = (-((-113) & 20849)) & (-2098) & 24565;
        llIlIllI[44] = (-((-273) & 29533)) & (-2) & 32765;
        llIlIllI[45] = (-24834) & 26623;
        llIlIllI[46] = (-16641) & 18426;
        llIlIllI[47] = (-21073) & 24575;
        llIlIllI[48] = (-28945) & 30709;
        llIlIllI[49] = (-16657) & 18422;
        llIlIllI[50] = (-((-7425) & 24345)) & (-5) & 20447;
        llIlIllI[51] = (-((-141) & 30861)) & (-289) & 32757;
        llIlIllI[52] = (-28993) & 30667;
        llIlIllI[53] = (-8201) & 11678;
        llIlIllI[54] = (-18691) & 20407;
        llIlIllI[55] = (-5) & 3471;
        llIlIllI[56] = (-28947) & 30719;
        llIlIllI[57] = (-4617) & 8077;
        llIlIllI[58] = (-12290) & 15343;
        llIlIllI[59] = (-16386) & 19631;
        llIlIllI[60] = 66 ^ 86;
        llIlIllI[61] = 28 ^ 9;
        llIlIllI[62] = (113 ^ 110) ^ (37 ^ 44);
        llIlIllI[63] = (-31506) & 32671;
        llIlIllI[64] = (-28675) & 32058;
        llIlIllI[65] = (-5189) & 5975;
        llIlIllI[66] = (-((-16503) & 30079)) & (-18433) & 32703;
        llIlIllI[67] = (167 ^ 178) ^ "  ".length();
    }

    static {
        lIllIIIllII();
        lIllIIIlIll();
        bF = new WorldPoint(llIlIllI[37], llIlIllI[38], llIlIllI[1]);
        bG = new WorldPoint(llIlIllI[39], llIlIllI[40], llIlIllI[1]);
        bH = new WorldPoint(llIlIllI[41], llIlIllI[42], llIlIllI[1]);
        bI = new WorldPoint(llIlIllI[43], llIlIllI[44], llIlIllI[1]);
        bJ = new WorldPoint(llIlIllI[45], llIlIllI[38], llIlIllI[1]);
        bK = new WorldPoint(llIlIllI[46], llIlIllI[47], llIlIllI[1]);
        bL = new WorldPoint(llIlIllI[39], llIlIllI[40], llIlIllI[1]);
        bM = new WorldPoint(llIlIllI[48], llIlIllI[38], llIlIllI[1]);
        bN = new WorldPoint(llIlIllI[49], llIlIllI[50], llIlIllI[1]);
        bO = new WorldPoint(llIlIllI[51], llIlIllI[42], llIlIllI[1]);
        bP = new WorldPoint(llIlIllI[49], llIlIllI[50], llIlIllI[1]);
        bQ = new WorldPoint(llIlIllI[52], llIlIllI[53], llIlIllI[1]);
        bR = new WorldPoint(llIlIllI[54], llIlIllI[55], llIlIllI[1]);
        bS = new WorldPoint(llIlIllI[56], llIlIllI[57], llIlIllI[1]);
        bT = new WorldPoint(llIlIllI[39], llIlIllI[40], llIlIllI[1]);
        bU = new WorldPoint(llIlIllI[58], llIlIllI[59], llIlIllI[1]);
        bV = new WorldPoint(llIlIllI[37], llIlIllI[38], llIlIllI[1]);
        bW = System.currentTimeMillis();
        String[] strArr = new String[llIlIllI[10]];
        strArr[llIlIllI[1]] = llIlIlIl[llIlIllI[60]];
        strArr[llIlIllI[0]] = llIlIlIl[llIlIllI[61]];
        strArr[llIlIllI[3]] = llIlIlIl[llIlIllI[62]];
        bX = strArr;
        bY = new WorldArea(llIlIllI[63], llIlIllI[64], llIlIllI[65], llIlIllI[66], llIlIllI[1]);
        bZ = llIlIllI[1];
        cb = C0004e.c(llIlIllI[31], llIlIllI[32]);
    }

    private static boolean lIllIIllIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIIIllll(Object obj) {
        return obj != null;
    }

    private static String lIllIIIlIlI(String lIlIIlIlllIIIIl, String lIlIIlIlllIIIII) {
        try {
            SecretKeySpec lIlIIlIlllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIlIlllIIIII.getBytes(StandardCharsets.UTF_8)), llIlIllI[16]), "DES");
            Cipher lIlIIlIlllIIIll = Cipher.getInstance("DES");
            lIlIIlIlllIIIll.init(llIlIllI[3], lIlIIlIlllIIlII);
            return new String(lIlIIlIlllIIIll.doFinal(Base64.getDecoder().decode(lIlIIlIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIlIlllIIIlI) {
            lIlIIlIlllIIIlI.printStackTrace();
            return null;
        }
    }

    private static int lIllIIlIIlI(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean aw() {
        WorldArea worldArea = new WorldArea(bV, llIlIllI[10], llIlIllI[10]);
        List all = Players.getAll();
        if (lIllIIIlllI(all.isEmpty() ? 1 : 0) && lIllIIlIlIl(all.size(), llIlIllI[0])) {
            int i = llIlIllI[1];
            while (lIllIIIllIl(i, all.size())) {
                if (lIllIIlIIII(((Player) all.get(i)).equals(Players.getLocal()) ? 1 : 0)) {
                    "".length();
                    if (" ".length() == (-" ".length())) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else if (lIllIIlIIII(worldArea.contains(((Player) all.get(i)).getWorldLocation()) ? 1 : 0)) {
                    return llIlIllI[0];
                }
                i++;
                "".length();
                if ("   ".length() <= (-" ".length())) {
                    return ((((44 + 81) - 20) + 42) ^ (((96 + 33) - 57) + 127)) & (((220 ^ 139) ^ "   ".length()) ^ (-" ".length()));
                }
            }
        }
        return llIlIllI[1];
    }

    private static boolean lIllIIIllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIllIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIIlIIIl(int i) {
        return i > 0;
    }

    private static int lIllIIlIIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    static NPC av() {
        WorldPoint worldPoint = bV;
        WorldPoint worldPoint2 = new WorldPoint(bV.getX() - llIlIllI[0], bV.getWorldY() + llIlIllI[0], llIlIllI[1]);
        WorldPoint worldPoint3 = new WorldPoint(bV.getX(), bV.getWorldY() + llIlIllI[0], llIlIllI[1]);
        WorldPoint worldPoint4 = new WorldPoint(bV.getX() + llIlIllI[0], bV.getWorldY() + llIlIllI[0], llIlIllI[1]);
        WorldPoint worldPoint5 = new WorldPoint(bV.getX() + llIlIllI[0], bV.getWorldY(), llIlIllI[1]);
        WorldPoint worldPoint6 = new WorldPoint(bV.getX() + llIlIllI[0], bV.getWorldY() - llIlIllI[0], llIlIllI[1]);
        WorldPoint worldPoint7 = new WorldPoint(bV.getX(), bV.getWorldY() - llIlIllI[0], llIlIllI[1]);
        WorldPoint worldPoint8 = new WorldPoint(bV.getX() - llIlIllI[0], bV.getWorldY() - llIlIllI[0], llIlIllI[1]);
        WorldPoint worldPoint9 = new WorldPoint(bV.getX() - llIlIllI[0], bV.getWorldY(), llIlIllI[1]);
        List all = NPCs.getAll(npc -> {
            return npc.getName().equalsIgnoreCase(llIlIlIl[llIlIllI[36]]);
        });
        if (lIllIIIllll(all)) {
            List of = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int i = llIlIllI[1];
            while (lIllIIIllIl(i, all.size())) {
                if (lIllIIlIIII(of.contains(((NPC) all.get(i)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC) all.get(i);
                }
                i++;
                "".length();
                if (" ".length() < (-" ".length())) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    private static boolean lIllIIlIlII(int i) {
        return i < 0;
    }

    private static boolean lIllIIllIII(int i) {
        return i >= 0;
    }

    private static void at() {
        if (lIllIIIllIl(ca, llIlIllI[0])) {
            bW = System.currentTimeMillis();
            System.out.println(llIlIlIl[llIlIllI[1]]);
            ca += llIlIllI[0];
        }
        int[] iArr = new int[llIlIllI[0]];
        iArr[llIlIllI[1]] = llIlIllI[2];
        if (lIllIIIlllI(Inventory.contains(iArr) ? 1 : 0)) {
            BankLocation nearest = BankLocation.getNearest();
            if (lIllIIIllll(nearest) && lIllIIIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = llIlIlIl[llIlIllI[0]];
                C0000a.a(nearest);
            }
            if (lIllIIIllll(nearest) && lIllIIlIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = llIlIlIl[llIlIllI[3]];
                if (lIllIIIlllI(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIlIllI[4]);
                    "".length();
                }
                if (lIllIIlIIII(Bank.isOpen() ? 1 : 0)) {
                    if (lIllIIlIIIl(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(llIlIllI[0]);
                        "".length();
                    }
                    C0000a.a(llIlIllI[2], llIlIllI[5]);
                    C0000a.a(llIlIllI[6], llIlIllI[0]);
                    C0000a.a(llIlIllI[7], llIlIllI[8]);
                }
            }
        }
        int[] iArr2 = new int[llIlIllI[0]];
        iArr2[llIlIllI[1]] = llIlIllI[2];
        if (lIllIIlIIII(Inventory.contains(iArr2) ? 1 : 0)) {
            au();
        }
    }

    public static void au() {
        if (lIllIIlIlII(lIllIIlIIlI(C0004e.a(bW), llIlIllI[9] + cb))) {
            if (lIllIIIlllI(Players.getLocal().getWorldLocation().equals(bV) ? 1 : 0)) {
                AccBuilderBarrows.c = llIlIlIl[llIlIllI[10]];
                if (lIllIIIllIl(Movement.getRunEnergy(), llIlIllI[11]) && lIllIIlIIII(Inventory.contains(C0005f.bb) ? 1 : 0)) {
                    Inventory.getFirst(C0005f.bb).interact(llIlIlIl[llIlIllI[12]]);
                    Time.sleepTicks(llIlIllI[0]);
                    "".length();
                }
                if (lIllIIIlllI(bY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIllIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(bU), llIlIllI[10])) {
                        AccBuilderBarrows.c = llIlIlIl[llIlIllI[13]];
                        Movement.walkTo(bU);
                        "".length();
                        Time.sleepTicks(llIlIllI[0]);
                        "".length();
                    }
                    if (lIllIIlIllI(Players.getLocal().getWorldLocation().distanceTo(bU), llIlIllI[10])) {
                        AccBuilderBarrows.c = llIlIlIl[llIlIllI[14]];
                        if (lIllIIIllIl(bZ, llIlIllI[0])) {
                            C0004e.w();
                            bZ += llIlIllI[0];
                        }
                        String[] strArr = new String[llIlIllI[0]];
                        strArr[llIlIllI[1]] = llIlIlIl[llIlIllI[15]];
                        NPC nearest = NPCs.getNearest(strArr);
                        if (lIllIIIllll(nearest)) {
                            String[] strArr2 = new String[llIlIllI[0]];
                            strArr2[llIlIllI[1]] = llIlIlIl[llIlIllI[16]];
                            if (lIllIIlIIII(nearest.hasAction(strArr2) ? 1 : 0)) {
                                nearest.interact(llIlIlIl[llIlIllI[17]]);
                                Time.sleepTicks(llIlIllI[10]);
                                "".length();
                            }
                            String[] strArr3 = new String[llIlIllI[0]];
                            strArr3[llIlIllI[1]] = llIlIlIl[llIlIllI[8]];
                            if (lIllIIIlllI(nearest.hasAction(strArr3) ? 1 : 0)) {
                                C0006g.b(llIlIlIl[llIlIllI[18]], bX);
                                Time.sleepTicks(llIlIllI[0]);
                                "".length();
                            }
                        }
                    }
                }
                if (lIllIIlIIII(bY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(bV);
                    "".length();
                    Time.sleepTicks(llIlIllI[0]);
                    "".length();
                }
            }
            if (lIllIIlIIII(Players.getLocal().getWorldLocation().equals(bV) ? 1 : 0)) {
                if (lIllIIlIlII(lIllIIlIIll(C0004e.v(), 45.0d))) {
                    int[] iArr = new int[llIlIllI[0]];
                    iArr[llIlIllI[1]] = llIlIllI[2];
                    if (lIllIIlIIII(Inventory.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[llIlIllI[0]];
                        iArr2[llIlIllI[1]] = llIlIllI[2];
                        Inventory.getFirst(iArr2).interact(llIlIlIl[llIlIllI[19]]);
                        Time.sleepTicks(llIlIllI[0]);
                        "".length();
                    }
                }
                if (lIllIIIlllI(aw() ? 1 : 0)) {
                    AccBuilderBarrows.c = llIlIlIl[llIlIllI[20]];
                    Time.sleepTicks(llIlIllI[15]);
                    "".length();
                }
                if (lIllIIlIIII(aw() ? 1 : 0)) {
                    new WorldArea(bV, llIlIllI[3], llIlIllI[3]);
                    NPC av = av();
                    AccBuilderBarrows.c = llIlIlIl[llIlIllI[21]];
                    if (lIllIIlIlll(Players.getLocal().getInteracting()) && lIllIIIllll(av) && lIllIIIlllI(av.isDead() ? 1 : 0)) {
                        System.out.println(llIlIlIl[llIlIllI[22]]);
                        av.interact(llIlIlIl[llIlIllI[23]]);
                        Time.sleepTicks(llIlIllI[3]);
                        "".length();
                    }
                    Time.sleepTicks(llIlIllI[12]);
                    "".length();
                }
            }
        }
        if (lIllIIllIII(lIllIIlIIlI(C0004e.a(bW), llIlIllI[9] + cb))) {
            WorldArea worldArea = new WorldArea(llIlIllI[24], llIlIllI[25], llIlIllI[26], llIlIllI[27], llIlIllI[1]);
            WorldPoint worldPoint = new WorldPoint(llIlIllI[28], llIlIllI[29], llIlIllI[1]);
            if (lIllIIlIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlIllI[13])) {
                Movement.walkTo(worldPoint);
                "".length();
            }
            AccBuilderBarrows.c = llIlIlIl[llIlIllI[30]];
            Movement.walkTo(bL);
            "".length();
            Time.sleepTicks(llIlIllI[0]);
            "".length();
            if (lIllIIlIllI(Players.getLocal().getWorldLocation().distanceTo(bL), llIlIllI[3])) {
                bW = System.currentTimeMillis();
                cb = C0004e.c(llIlIllI[31], llIlIllI[32]);
            }
        }
    }

    private static boolean lIllIIlIIII(int i) {
        return i != 0;
    }

    private static String lIllIIIlIIl(String lIlIIllIIIIIIll, String lIlIIllIIIIIIlI) {
        String lIlIIllIIIIIIll2 = new String(Base64.getDecoder().decode(lIlIIllIIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIllIIIIIIIl = new StringBuilder();
        char[] charArray = lIlIIllIIIIIIlI.toCharArray();
        int lIlIIlIllllllll = llIlIllI[1];
        char[] charArray2 = lIlIIllIIIIIIll2.toCharArray();
        int length = charArray2.length;
        int i = llIlIllI[1];
        while (lIllIIIllIl(i, length)) {
            lIlIIllIIIIIIIl.append((char) (charArray2[i] ^ charArray[lIlIIlIllllllll % charArray.length]));
            "".length();
            lIlIIlIllllllll++;
            i++;
            "".length();
            if ((-(91 ^ 95)) > 0) {
                return null;
            }
        }
        return String.valueOf(lIlIIllIIIIIIIl);
    }

    private static String lIllIIIlIII(String lIlIIlIlllIlllI, String lIlIIlIlllIllIl) {
        try {
            SecretKeySpec lIlIIlIllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIlIlllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIlIllllIIII = Cipher.getInstance("Blowfish");
            lIlIIlIllllIIII.init(llIlIllI[3], lIlIIlIllllIIIl);
            return new String(lIlIIlIllllIIII.doFinal(Base64.getDecoder().decode(lIlIIlIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIlIlllIllll) {
            lIlIIlIlllIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIlIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return llIlIllI[1];
    }

    private static boolean lIllIIlIlll(Object obj) {
        return obj == null;
    }

    public static void ax() {
        int c = C0004e.c(llIlIllI[0], llIlIllI[13]);
        if (lIllIIllIIl(c, llIlIllI[0])) {
            bV = bF;
            bL = bG;
        }
        if (lIllIIllIIl(c, llIlIllI[3])) {
            bV = bM;
            bL = bN;
        }
        if (lIllIIllIIl(c, llIlIllI[10])) {
            bV = bO;
            bL = bP;
        }
        if (lIllIIllIIl(c, llIlIllI[12])) {
            bV = bQ;
            bL = bR;
        }
        if (lIllIIllIIl(c, llIlIllI[13])) {
            bV = bS;
            bL = bT;
        }
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            at();
            "".length();
            if (" ".length() == 0) {
                return ((163 ^ 140) ^ (83 ^ 47)) & (((((193 + 129) - 124) + 35) ^ (((182 + 168) - 340) + 176)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIlIllI[33];
    }

    private static boolean lIllIIIlllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (lIllIIllIlI(Skills.getLevel(Skill.RANGED), llIlIllI[35]) && lIllIIllIlI(Skills.getLevel(Skill.DEFENCE), llIlIllI[35])) {
            ?? r0 = llIlIllI[0];
            "".length();
            return (-"  ".length()) >= 0 ? ((143 ^ 155) ^ (249 ^ 177)) & (((((35 + 107) - (-29)) + 78) ^ (((100 + 84) - 60) + 41)) ^ (-" ".length())) : r0;
        }
        return llIlIllI[1];
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return llIlIlIl[llIlIllI[34]];
    }

    private static boolean lIllIIlIllI(int i, int i2) {
        return i <= i2;
    }

    private static void lIllIIIlIll() {
        llIlIlIl = new String[llIlIllI[67]];
        llIlIlIl[llIlIllI[1]] = lIllIIIlIII("czPlHF446kxkPh7e3A4lPb6oAQKVecRq", "fiOfr");
        llIlIlIl[llIlIllI[0]] = lIllIIIlIII("WvRgq/qGvxwh03XTQXPVDKwZn5E1fK2a", "VfYBh");
        llIlIlIl[llIlIllI[3]] = lIllIIIlIIl("JhQMFyMHGwVTLQ8bCRohCQ==", "nubsO");
        llIlIlIl[llIlIllI[10]] = lIllIIIlIII("Gdb8Xo+8s5BwfDxlfKdMOhlO780TfgYa", "LAPCI");
        llIlIlIl[llIlIllI[12]] = lIllIIIlIlI("piHSN3l88x4=", "VUrwl");
        llIlIlIl[llIlIllI[13]] = lIllIIIlIlI("62RUXGtO+ITiwtM4ztuQBA==", "sLHFG");
        llIlIlIl[llIlIllI[14]] = lIllIIIlIIl("JxAWNx4KUQ42HRxRGzsTGw==", "oqxSr");
        llIlIlIl[llIlIllI[15]] = lIllIIIlIII("8D4yaxVPEJg=", "gjQoK");
        llIlIlIl[llIlIllI[16]] = lIllIIIlIlI("psvzIGTlNGp3TfKk3Qyus4iVgRhCRbJ7", "XBMEV");
        llIlIlIl[llIlIllI[17]] = lIllIIIlIII("X3bKVgSCAXhr2ZRxX/TtXVPfN6h/aPYI", "oarQa");
        llIlIlIl[llIlIllI[8]] = lIllIIIlIlI("LBNz018rgdCU/sF770k3SmtLX7RQizn0", "nBEkR");
        llIlIlIl[llIlIllI[18]] = lIllIIIlIIl("PRc7Jw==", "krTTD");
        llIlIlIl[llIlIllI[19]] = lIllIIIlIII("AkvPC+D3H6M=", "PLbGI");
        llIlIlIl[llIlIllI[20]] = lIllIIIlIII("6vVXbqeIz0W0Xy7je242Gw==", "RRJMK");
        llIlIlIl[llIlIllI[21]] = lIllIIIlIII("ohfdkF14wZRqK9vNOVwLKw==", "oBCFT");
        llIlIlIl[llIlIllI[22]] = lIllIIIlIIl("Fj0EMi88IB40bDQ7ESAkMi0=", "WIpSL");
        llIlIlIl[llIlIllI[23]] = lIllIIIlIII("hZF0EcBoNNE=", "FKnrC");
        llIlIlIl[llIlIllI[30]] = lIllIIIlIlI("TDB4weyUvQDOm4OXgd1yfQ==", "MhTwX");
        llIlIlIl[llIlIllI[34]] = lIllIIIlIIl("JCU7Nlk0NjQwCg==", "wDURy");
        llIlIlIl[llIlIllI[36]] = lIllIIIlIIl("IjcFDGgyJAoK", "QVkhH");
        llIlIlIl[llIlIllI[60]] = lIllIIIlIlI("6khtLCoislOfPUtlLt7b7f7gyhwRlMgNN0IkF22G0/dixtJeLNPy02rPwIRKu7/H", "FbIsE");
        llIlIlIl[llIlIllI[61]] = lIllIIIlIII("aYQmVM23w1biSfQmIUojMyrKo4kXdSB2fS1I5Amu+E95j+K8Aut/Ew==", "njshJ");
        llIlIlIl[llIlIllI[62]] = lIllIIIlIlI("r+S088nRYc+0uMQC+phbdQ==", "atePZ");
    }
}
