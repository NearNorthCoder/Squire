package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.o  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/o.class */
public class C0014o implements ab {
    private static /* synthetic */ String[] lllIIIIIl;
    public static /* synthetic */ WorldPoint cv;
    public static /* synthetic */ WorldPoint cD;
    public static /* synthetic */ WorldPoint cC;
    public static /* synthetic */ WorldArea cH;
    public static /* synthetic */ WorldPoint cr;
    public static /* synthetic */ WorldPoint ct;
    static /* synthetic */ int cK;
    public static /* synthetic */ WorldPoint cu;
    public static /* synthetic */ WorldPoint cw;
    public static /* synthetic */ WorldPoint cs;
    public static /* synthetic */ WorldPoint cq;
    public static /* synthetic */ long cF;
    public static /* synthetic */ int cI;
    public static /* synthetic */ WorldPoint cE;
    public static /* synthetic */ WorldPoint cy;
    public static /* synthetic */ String[] cG;
    public static /* synthetic */ WorldPoint cx;
    public static /* synthetic */ WorldPoint co;
    public static /* synthetic */ WorldPoint cB;
    private static /* synthetic */ int[] lllIIIIlI;
    public static /* synthetic */ int cJ;
    public static /* synthetic */ WorldPoint cz;
    public static /* synthetic */ WorldPoint cp;
    public static /* synthetic */ WorldPoint cA;

    private static int lIllllIlllIl(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lIlllllIIlll(Skills.getLevel(Skill.RANGED), lllIIIIlI[35]) && lIlllllIIlll(Skills.getLevel(Skill.DEFENCE), lllIIIIlI[35])) {
            ?? r0 = lllIIIIlI[0];
            "".length();
            return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIIIIlI[1];
    }

    private static void lIllllIlIlll() {
        lllIIIIlI = new int[68];
        lllIIIIlI[0] = " ".length();
        lllIIIIlI[1] = (128 ^ 189) & ((27 ^ 38) ^ (-1));
        lllIIIIlI[2] = (-19461) & 19839;
        lllIIIIlI[3] = "  ".length();
        lllIIIIlI[4] = (-25623) & 30622;
        lllIIIIlI[5] = 147 ^ 139;
        lllIIIIlI[6] = (-((-9033) & 26605)) & (-3) & 30199;
        lllIIIIlI[7] = (-((-21577) & 29951)) & (-1) & 16383;
        lllIIIIlI[8] = 49 ^ 59;
        lllIIIIlI[9] = (-6182) & 606181;
        lllIIIIlI[10] = "   ".length();
        lllIIIIlI[11] = (7 ^ 66) ^ "   ".length();
        lllIIIIlI[12] = 131 ^ 135;
        lllIIIIlI[13] = (((42 + 62) - 36) + 93) ^ (((163 + 163) - 234) + 72);
        lllIIIIlI[14] = (((76 + 124) - 130) + 92) ^ (((91 + 152) - 233) + 154);
        lllIIIIlI[15] = (((29 + 125) - 117) + 118) ^ (((74 + 59) - 123) + 146);
        lllIIIIlI[16] = (163 ^ 177) ^ (50 ^ 40);
        lllIIIIlI[17] = (127 ^ 53) ^ (3 ^ 64);
        lllIIIIlI[18] = (43 ^ 70) ^ (111 ^ 9);
        lllIIIIlI[19] = (114 ^ 35) ^ (154 ^ 199);
        lllIIIIlI[20] = (((110 + 2) - 22) + 100) ^ (((122 + 57) - 111) + 111);
        lllIIIIlI[21] = (47 ^ 108) ^ (238 ^ 163);
        lllIIIIlI[22] = 82 ^ 93;
        lllIIIIlI[23] = 93 ^ 77;
        lllIIIIlI[24] = (-((-17045) & 30359)) & (-16449) & 32766;
        lllIIIIlI[25] = (-8732) & 11963;
        lllIIIIlI[26] = 19 ^ 82;
        lllIIIIlI[27] = 165 ^ 130;
        lllIIIIlI[28] = (-5123) & 8175;
        lllIIIIlI[29] = (-12545) & 15791;
        lllIIIIlI[30] = 2 ^ 19;
        lllIIIIlI[31] = (-258) & 15257;
        lllIIIIlI[32] = (-710) & 30709;
        lllIIIIlI[33] = (236 ^ 140) ^ (123 ^ 127);
        lllIIIIlI[34] = 106 ^ 120;
        lllIIIIlI[35] = (66 ^ 14) ^ (8 ^ 39);
        lllIIIIlI[36] = (((89 + 137) - 138) + 59) ^ (((89 + 6) - 67) + 100);
        lllIIIIlI[37] = (-24841) & 26616;
        lllIIIIlI[38] = (-12388) & 15855;
        lllIIIIlI[39] = (-((-321) & 29145)) & (-67) & 30682;
        lllIIIIlI[40] = (-((-253) & 25342)) & (-4099) & 32695;
        lllIIIIlI[41] = (-24629) & 26365;
        lllIIIIlI[42] = (-16401) & 19869;
        lllIIIIlI[43] = (-26905) & 28636;
        lllIIIIlI[44] = (-((-24977) & 29149)) & (-16385) & 24060;
        lllIIIIlI[45] = (-((-701) & 19133)) & (-8193) & 28414;
        lllIIIIlI[46] = (-((-1947) & 24479)) & (-2) & 24319;
        lllIIIIlI[47] = (-((-16809) & 25577)) & (-20481) & 32751;
        lllIIIIlI[48] = (-18697) & 20461;
        lllIIIIlI[49] = (-16641) & 18406;
        lllIIIIlI[50] = (-((-2269) & 30973)) & (-13) & 32239;
        lllIIIIlI[51] = (-8227) & 9975;
        lllIIIIlI[52] = (-((-29) & 6493)) & (-33) & 8171;
        lllIIIIlI[53] = (-21001) & 24478;
        lllIIIIlI[54] = (-((-9825) & 30563)) & (-2121) & 24575;
        lllIIIIlI[55] = (-101) & 3567;
        lllIIIIlI[56] = (-((-20053) & 32343)) & (-16401) & 30463;
        lllIIIIlI[57] = (-16977) & 20437;
        lllIIIIlI[58] = (-((-19817) & 23929)) & (-9217) & 16382;
        lllIIIIlI[59] = (-9025) & 12270;
        lllIIIIlI[60] = 72 ^ 92;
        lllIIIIlI[61] = (((35 + 13) - (-110)) + 2) ^ (((62 + 11) - (-56)) + 52);
        lllIIIIlI[62] = 27 ^ 13;
        lllIIIIlI[63] = (-23122) & 24287;
        lllIIIIlI[64] = (-((-16641) & 25413)) & (-20611) & 32766;
        lllIIIIlI[65] = (-((-337) & 31185)) & (-1101) & 32735;
        lllIIIIlI[66] = (-((-2459) & 14747)) & (-18497) & 31479;
        lllIIIIlI[67] = (204 ^ 198) ^ (35 ^ 62);
    }

    private static boolean lIllllIllIlI(Object obj) {
        return obj != null;
    }

    static {
        lIllllIlIlll();
        lIllllIlIllI();
        co = new WorldPoint(lllIIIIlI[37], lllIIIIlI[38], lllIIIIlI[1]);
        cp = new WorldPoint(lllIIIIlI[39], lllIIIIlI[40], lllIIIIlI[1]);
        cq = new WorldPoint(lllIIIIlI[41], lllIIIIlI[42], lllIIIIlI[1]);
        cr = new WorldPoint(lllIIIIlI[43], lllIIIIlI[44], lllIIIIlI[1]);
        cs = new WorldPoint(lllIIIIlI[45], lllIIIIlI[38], lllIIIIlI[1]);
        ct = new WorldPoint(lllIIIIlI[46], lllIIIIlI[47], lllIIIIlI[1]);
        cu = new WorldPoint(lllIIIIlI[39], lllIIIIlI[40], lllIIIIlI[1]);
        cv = new WorldPoint(lllIIIIlI[48], lllIIIIlI[38], lllIIIIlI[1]);
        cw = new WorldPoint(lllIIIIlI[49], lllIIIIlI[50], lllIIIIlI[1]);
        cx = new WorldPoint(lllIIIIlI[51], lllIIIIlI[42], lllIIIIlI[1]);
        cy = new WorldPoint(lllIIIIlI[49], lllIIIIlI[50], lllIIIIlI[1]);
        cz = new WorldPoint(lllIIIIlI[52], lllIIIIlI[53], lllIIIIlI[1]);
        cA = new WorldPoint(lllIIIIlI[54], lllIIIIlI[55], lllIIIIlI[1]);
        cB = new WorldPoint(lllIIIIlI[56], lllIIIIlI[57], lllIIIIlI[1]);
        cC = new WorldPoint(lllIIIIlI[39], lllIIIIlI[40], lllIIIIlI[1]);
        cD = new WorldPoint(lllIIIIlI[58], lllIIIIlI[59], lllIIIIlI[1]);
        cE = new WorldPoint(lllIIIIlI[37], lllIIIIlI[38], lllIIIIlI[1]);
        cF = System.currentTimeMillis();
        String[] strArr = new String[lllIIIIlI[10]];
        strArr[lllIIIIlI[1]] = lllIIIIIl[lllIIIIlI[60]];
        strArr[lllIIIIlI[0]] = lllIIIIIl[lllIIIIlI[61]];
        strArr[lllIIIIlI[3]] = lllIIIIIl[lllIIIIlI[62]];
        cG = strArr;
        cH = new WorldArea(lllIIIIlI[63], lllIIIIlI[64], lllIIIIlI[65], lllIIIIlI[66], lllIIIIlI[1]);
        cI = lllIIIIlI[1];
        cK = C0004e.c(lllIIIIlI[31], lllIIIIlI[32]);
    }

    private static boolean lIllllIllIIl(int i) {
        return i == 0;
    }

    private static int lIllllIllllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean aG() {
        WorldArea worldArea = new WorldArea(cE, lllIIIIlI[10], lllIIIIlI[10]);
        List all = Players.getAll();
        if (lIllllIllIIl(all.isEmpty() ? 1 : 0) && lIlllllIIIII(all.size(), lllIIIIlI[0])) {
            int i = lllIIIIlI[1];
            while (lIllllIllIII(i, all.size())) {
                if (lIllllIllIll(((Player) all.get(i)).equals(Players.getLocal()) ? 1 : 0)) {
                    "".length();
                    if ((((29 ^ 4) ^ "   ".length()) & (((((54 + 151) - 137) + 87) ^ (((26 + 114) - 117) + 106)) ^ (-" ".length()))) != 0) {
                        return ((160 ^ 154) ^ (39 ^ 71)) & (((((49 + 138) - 54) + 22) ^ (((116 + 160) - 168) + 85)) ^ (-" ".length()));
                    }
                } else if (lIllllIllIll(worldArea.contains(((Player) all.get(i)).getWorldLocation()) ? 1 : 0)) {
                    return lllIIIIlI[0];
                }
                i++;
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return lllIIIIlI[1];
    }

    private static boolean lIllllIlllII(int i) {
        return i > 0;
    }

    private static String lIllllIlIIll(String llllllllllIlI, String llllllllllIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllIII = new StringBuilder();
        char[] charArray = llllllllllIIl.toCharArray();
        int lllllllllIllI = lllIIIIlI[1];
        char[] charArray2 = str.toCharArray();
        int llllllllIllll = charArray2.length;
        int i = lllIIIIlI[1];
        while (lIllllIllIII(i, llllllllIllll)) {
            llllllllllIII.append((char) (charArray2[i] ^ charArray[lllllllllIllI % charArray.length]));
            "".length();
            lllllllllIllI++;
            i++;
            "".length();
            if ((((((38 + 144) - 129) + 168) ^ (((137 + 100) - 220) + 124)) & (((59 ^ 74) ^ (119 ^ 86)) ^ (-" ".length()))) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllIII);
    }

    private static void aD() {
        if (lIllllIllIII(cJ, lllIIIIlI[0])) {
            cF = System.currentTimeMillis();
            System.out.println(lllIIIIIl[lllIIIIlI[1]]);
            cJ += lllIIIIlI[0];
        }
        int[] iArr = new int[lllIIIIlI[0]];
        iArr[lllIIIIlI[1]] = lllIIIIlI[2];
        if (lIllllIllIIl(Inventory.contains(iArr) ? 1 : 0)) {
            BankLocation nearest = BankLocation.getNearest();
            if (lIllllIllIlI(nearest) && lIllllIllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[0]];
                C0000a.a(nearest);
            }
            if (lIllllIllIlI(nearest) && lIllllIllIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[3]];
                if (lIllllIllIIl(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lllIIIIlI[4]);
                    "".length();
                }
                if (lIllllIllIll(Bank.isOpen() ? 1 : 0)) {
                    if (lIllllIlllII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lllIIIIlI[0]);
                        "".length();
                    }
                    C0000a.a(lllIIIIlI[2], lllIIIIlI[5]);
                    C0000a.a(lllIIIIlI[6], lllIIIIlI[0]);
                    C0000a.a(lllIIIIlI[7], lllIIIIlI[8]);
                }
            }
        }
        int[] iArr2 = new int[lllIIIIlI[0]];
        iArr2[lllIIIIlI[1]] = lllIIIIlI[2];
        if (lIllllIllIll(Inventory.contains(iArr2) ? 1 : 0)) {
            aE();
        }
    }

    static NPC aF() {
        WorldPoint worldPoint = cE;
        WorldPoint worldPoint2 = new WorldPoint(cE.getX() - lllIIIIlI[0], cE.getWorldY() + lllIIIIlI[0], lllIIIIlI[1]);
        WorldPoint worldPoint3 = new WorldPoint(cE.getX(), cE.getWorldY() + lllIIIIlI[0], lllIIIIlI[1]);
        WorldPoint worldPoint4 = new WorldPoint(cE.getX() + lllIIIIlI[0], cE.getWorldY() + lllIIIIlI[0], lllIIIIlI[1]);
        WorldPoint worldPoint5 = new WorldPoint(cE.getX() + lllIIIIlI[0], cE.getWorldY(), lllIIIIlI[1]);
        WorldPoint worldPoint6 = new WorldPoint(cE.getX() + lllIIIIlI[0], cE.getWorldY() - lllIIIIlI[0], lllIIIIlI[1]);
        WorldPoint worldPoint7 = new WorldPoint(cE.getX(), cE.getWorldY() - lllIIIIlI[0], lllIIIIlI[1]);
        WorldPoint worldPoint8 = new WorldPoint(cE.getX() - lllIIIIlI[0], cE.getWorldY() - lllIIIIlI[0], lllIIIIlI[1]);
        WorldPoint worldPoint9 = new WorldPoint(cE.getX() - lllIIIIlI[0], cE.getWorldY(), lllIIIIlI[1]);
        List all = NPCs.getAll(npc -> {
            return npc.getName().equalsIgnoreCase(lllIIIIIl[lllIIIIlI[36]]);
        });
        if (lIllllIllIlI(all)) {
            List of = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int i = lllIIIIlI[1];
            while (lIllllIllIII(i, all.size())) {
                if (lIllllIllIll(of.contains(((NPC) all.get(i)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC) all.get(i);
                }
                i++;
                "".length();
                if (0 != 0) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    private static String lIllllIlIlII(String lIIIIIIIIIlIlI, String lIIIIIIIIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), lllIIIIlI[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIIIIIIlIll) {
            lIIIIIIIIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIllIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllllIlllll(int i) {
        return i < 0;
    }

    private static boolean lIlllllIIIIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlllllIIlll(int i, int i2) {
        return i >= i2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            aD();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (240 ^ 189) & ((111 ^ 34) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lllIIIIlI[33];
    }

    private static boolean lIlllllIIIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIllllIllIll(int i) {
        return i != 0;
    }

    private static void lIllllIlIllI() {
        lllIIIIIl = new String[lllIIIIlI[67]];
        lllIIIIIl[lllIIIIlI[1]] = lIllllIlIIll("ORAhJxJrFDUlFCRVJisLLgc=", "KuRBf");
        lllIIIIIl[lllIIIIlI[0]] = lIllllIlIlII("fcWbeIklTZb1El8p2cUgCKKgPxUSKmxH", "aqhvt");
        lllIIIIIl[lllIIIIlI[3]] = lIllllIlIlIl("yXpJRAL94hxbQo+Kp6s9V7JugD3pNQVN", "Xailt");
        lllIIIIIl[lllIIIIlI[10]] = lIllllIlIlIl("1aMdH//ZefB3/VuPwyfRvFoNeJcRC6dL", "EkspQ");
        lllIIIIIl[lllIIIIlI[12]] = lIllllIlIlIl("+4Kjf5YfOpU=", "DbRCr");
        lllIIIIIl[lllIIIIlI[13]] = lIllllIlIlIl("75gZfXkaTdMfhuzSl74bPg==", "DoDmg");
        lllIIIIIl[lllIIIIlI[14]] = lIllllIlIIll("JTQ4MRsIdSAwGB51NT0WGQ==", "mUVUw");
        lllIIIIIl[lllIIIIlI[15]] = lIllllIlIlIl("ZibUJkLIQmI=", "WISQj");
        lllIIIIIl[lllIIIIlI[16]] = lIllllIlIlIl("5nU/A+VxPvHGsoeiAaKdMHRPqxCvPpof", "ekmPG");
        lllIIIIIl[lllIIIIlI[17]] = lIllllIlIlII("1DGF1JquW07QfEDSAWJ2597jWssZssvg", "sDgWh");
        lllIIIIIl[lllIIIIlI[8]] = lIllllIlIIll("Eio8AnESLD0VMDAsIh8kMQ==", "BENvQ");
        lllIIIIIl[lllIIIIlI[18]] = lIllllIlIIll("HzQIBQ==", "IQgvT");
        lllIIIIIl[lllIIIIlI[19]] = lIllllIlIIll("DCUT", "IDgts");
        lllIIIIIl[lllIIIIlI[20]] = lIllllIlIIll("Cz4gMTQteCI2ejkoJCw=", "JXKXZ");
        lllIIIIIl[lllIIIIlI[21]] = lIllllIlIlII("v/s32ZPTOkeGi0Npqop1uQ==", "pzuai");
        lllIIIIIl[lllIIIIlI[22]] = lIllllIlIIll("Oxs7JBURBiEiVhkdLjYeHws=", "zoOEv");
        lllIIIIIl[lllIIIIlI[23]] = lIllllIlIlIl("mkBn0JDh8FQ=", "Crzce");
        lllIIIIIl[lllIIIIlI[30]] = lIllllIlIlII("zDBzIOZqSOfszn/jGtkkVw==", "jjvnA");
        lllIIIIIl[lllIIIIlI[34]] = lIllllIlIlIl("vrOa/ocDnDjMcA0R5QVafw==", "BvMfv");
        lllIIIIIl[lllIIIIlI[36]] = lIllllIlIIll("ASkJDVYROgYL", "rHgiv");
        lllIIIIIl[lllIIIIlI[60]] = lIllllIlIlII("TJIX3r7NDIp44iG7jw//2BXvoPGwsAjstvWsP7oLKQTUdaeSQJKzy8p6jNINd7a/", "UIJVT");
        lllIIIIIl[lllIIIIlI[61]] = lIllllIlIlII("x1TBhtOGSC6M6irOMWzFOJtdYrEL21HK3gvUiZtXOhDXp8dXR6LUrQ==", "PDFuF");
        lllIIIIIl[lllIIIIlI[62]] = lIllllIlIlII("fD7r9R8WiiBFazYRSgOeug==", "ZGEZg");
    }

    private static boolean lIlllllIIlIl(int i, int i2) {
        return i == i2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lllIIIIIl[lllIIIIlI[34]];
    }

    public static void aE() {
        if (lIllllIlllll(lIllllIlllIl(C0004e.a(cF), lllIIIIlI[9] + cK))) {
            if (lIllllIllIIl(Players.getLocal().getWorldLocation().equals(cE) ? 1 : 0)) {
                AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[10]];
                if (lIllllIllIII(Movement.getRunEnergy(), lllIIIIlI[11]) && lIllllIllIll(Inventory.contains(C0005f.bc) ? 1 : 0)) {
                    Inventory.getFirst(C0005f.bc).interact(lllIIIIIl[lllIIIIlI[12]]);
                    Time.sleepTicks(lllIIIIlI[0]);
                    "".length();
                }
                if (lIllllIllIIl(cH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlllllIIIII(Players.getLocal().getWorldLocation().distanceTo(cD), lllIIIIlI[10])) {
                        AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[13]];
                        Movement.walkTo(cD);
                        "".length();
                        Time.sleepTicks(lllIIIIlI[0]);
                        "".length();
                    }
                    if (lIlllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(cD), lllIIIIlI[10])) {
                        AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[14]];
                        if (lIllllIllIII(cI, lllIIIIlI[0])) {
                            C0004e.x();
                            cI += lllIIIIlI[0];
                        }
                        String[] strArr = new String[lllIIIIlI[0]];
                        strArr[lllIIIIlI[1]] = lllIIIIIl[lllIIIIlI[15]];
                        NPC nearest = NPCs.getNearest(strArr);
                        if (lIllllIllIlI(nearest)) {
                            String[] strArr2 = new String[lllIIIIlI[0]];
                            strArr2[lllIIIIlI[1]] = lllIIIIIl[lllIIIIlI[16]];
                            if (lIllllIllIll(nearest.hasAction(strArr2) ? 1 : 0)) {
                                nearest.interact(lllIIIIIl[lllIIIIlI[17]]);
                                Time.sleepTicks(lllIIIIlI[10]);
                                "".length();
                            }
                            String[] strArr3 = new String[lllIIIIlI[0]];
                            strArr3[lllIIIIlI[1]] = lllIIIIIl[lllIIIIlI[8]];
                            if (lIllllIllIIl(nearest.hasAction(strArr3) ? 1 : 0)) {
                                C0006g.b(lllIIIIIl[lllIIIIlI[18]], cG);
                                Time.sleepTicks(lllIIIIlI[0]);
                                "".length();
                            }
                        }
                    }
                }
                if (lIllllIllIll(cH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(cE);
                    "".length();
                    Time.sleepTicks(lllIIIIlI[0]);
                    "".length();
                }
            }
            if (lIllllIllIll(Players.getLocal().getWorldLocation().equals(cE) ? 1 : 0)) {
                if (lIllllIlllll(lIllllIllllI(C0004e.w(), 45.0d))) {
                    int[] iArr = new int[lllIIIIlI[0]];
                    iArr[lllIIIIlI[1]] = lllIIIIlI[2];
                    if (lIllllIllIll(Inventory.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lllIIIIlI[0]];
                        iArr2[lllIIIIlI[1]] = lllIIIIlI[2];
                        Inventory.getFirst(iArr2).interact(lllIIIIIl[lllIIIIlI[19]]);
                        Time.sleepTicks(lllIIIIlI[0]);
                        "".length();
                    }
                }
                if (lIllllIllIIl(aG() ? 1 : 0)) {
                    AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[20]];
                    Time.sleepTicks(lllIIIIlI[15]);
                    "".length();
                }
                if (lIllllIllIll(aG() ? 1 : 0)) {
                    new WorldArea(cE, lllIIIIlI[3], lllIIIIlI[3]);
                    NPC aF = aF();
                    AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[21]];
                    if (lIlllllIIIlI(Players.getLocal().getInteracting()) && lIllllIllIlI(aF) && lIllllIllIIl(aF.isDead() ? 1 : 0)) {
                        System.out.println(lllIIIIIl[lllIIIIlI[22]]);
                        aF.interact(lllIIIIIl[lllIIIIlI[23]]);
                        Time.sleepTicks(lllIIIIlI[3]);
                        "".length();
                    }
                    Time.sleepTicks(lllIIIIlI[12]);
                    "".length();
                }
            }
        }
        if (lIlllllIIIll(lIllllIlllIl(C0004e.a(cF), lllIIIIlI[9] + cK))) {
            WorldArea worldArea = new WorldArea(lllIIIIlI[24], lllIIIIlI[25], lllIIIIlI[26], lllIIIIlI[27], lllIIIIlI[1]);
            WorldPoint worldPoint = new WorldPoint(lllIIIIlI[28], lllIIIIlI[29], lllIIIIlI[1]);
            if (lIllllIllIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllllIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllIIIIlI[13])) {
                Movement.walkTo(worldPoint);
                "".length();
            }
            AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[30]];
            Movement.walkTo(cu);
            "".length();
            Time.sleepTicks(lllIIIIlI[0]);
            "".length();
            if (lIlllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(cu), lllIIIIlI[3])) {
                cF = System.currentTimeMillis();
                cK = C0004e.c(lllIIIIlI[31], lllIIIIlI[32]);
            }
        }
    }

    private static String lIllllIlIlIl(String llllllllIIlIl, String llllllllIIlII) {
        try {
            SecretKeySpec llllllllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIIlI[3], llllllllIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllIIllI) {
            llllllllIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIIIII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlllllIIIll(int i) {
        return i >= 0;
    }

    public static void aH() {
        int c = C0004e.c(lllIIIIlI[0], lllIIIIlI[13]);
        if (lIlllllIIlIl(c, lllIIIIlI[0])) {
            cE = co;
            cu = cp;
        }
        if (lIlllllIIlIl(c, lllIIIIlI[3])) {
            cE = cv;
            cu = cw;
        }
        if (lIlllllIIlIl(c, lllIIIIlI[10])) {
            cE = cx;
            cu = cy;
        }
        if (lIlllllIIlIl(c, lllIIIIlI[12])) {
            cE = cz;
            cu = cA;
        }
        if (lIlllllIIlIl(c, lllIIIIlI[13])) {
            cE = cB;
            cu = cC;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lllIIIIlI[1];
    }
}
