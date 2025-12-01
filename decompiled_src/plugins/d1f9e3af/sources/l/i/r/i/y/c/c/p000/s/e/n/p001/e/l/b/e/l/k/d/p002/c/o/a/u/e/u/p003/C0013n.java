package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.n  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/n.class */
public class C0013n implements W {
    public static /* synthetic */ WorldPoint bH;
    public static /* synthetic */ WorldArea bS;
    public static /* synthetic */ String[] bR;
    public static /* synthetic */ WorldPoint bE;
    public static /* synthetic */ WorldPoint bO;
    public static /* synthetic */ WorldPoint bJ;
    public static /* synthetic */ int bU;
    public static /* synthetic */ WorldPoint bM;
    private static /* synthetic */ String[] lIlIlIIll;
    public static /* synthetic */ WorldPoint bB;
    public static /* synthetic */ WorldPoint bI;
    public static /* synthetic */ int bT;
    public static /* synthetic */ WorldPoint bK;
    public static /* synthetic */ WorldPoint bL;
    public static /* synthetic */ WorldPoint bC;
    public static /* synthetic */ WorldPoint bF;
    public static /* synthetic */ WorldPoint bz;
    private static /* synthetic */ int[] lIlIlIlIl;
    public static /* synthetic */ WorldPoint bN;
    public static /* synthetic */ WorldPoint bG;
    public static /* synthetic */ WorldPoint bA;
    public static /* synthetic */ WorldPoint bP;
    public static /* synthetic */ WorldPoint bD;
    static /* synthetic */ int bV;
    public static /* synthetic */ long bQ;

    private static boolean lIIIllllllIl(int i, int i2) {
        return i <= i2;
    }

    public static void at() {
        if (lIIIlllllIll(lIIIlllllIIl(C0004e.a(bQ), lIlIlIlIl[9] + bV))) {
            if (lIIIllllIlIl(Players.getLocal().getWorldLocation().equals(bP) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIlIIll[lIlIlIlIl[10]];
                if (lIIIllllIlII(Movement.getRunEnergy(), lIlIlIlIl[11]) && lIIIllllIlll(Inventory.contains(C0005f.aV) ? 1 : 0)) {
                    Inventory.getFirst(C0005f.aV).interact(lIlIlIIll[lIlIlIlIl[12]]);
                    Time.sleepTicks(lIlIlIlIl[0]);
                    "".length();
                }
                if (lIIIllllIlIl(bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIIllllllII(Players.getLocal().getWorldLocation().distanceTo(bO), lIlIlIlIl[10])) {
                        AccBuilderEasyClues.c = lIlIlIIll[lIlIlIlIl[13]];
                        Movement.walkTo(bO);
                        "".length();
                        Time.sleepTicks(lIlIlIlIl[0]);
                        "".length();
                    }
                    if (lIIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(bO), lIlIlIlIl[10])) {
                        AccBuilderEasyClues.c = lIlIlIIll[lIlIlIlIl[14]];
                        if (lIIIllllIlII(bT, lIlIlIlIl[0])) {
                            C0004e.v();
                            bT += lIlIlIlIl[0];
                        }
                        String[] strArr = new String[lIlIlIlIl[0]];
                        strArr[lIlIlIlIl[1]] = lIlIlIIll[lIlIlIlIl[15]];
                        NPC nearest = NPCs.getNearest(strArr);
                        if (lIIIllllIllI(nearest)) {
                            String[] strArr2 = new String[lIlIlIlIl[0]];
                            strArr2[lIlIlIlIl[1]] = lIlIlIIll[lIlIlIlIl[16]];
                            if (lIIIllllIlll(nearest.hasAction(strArr2) ? 1 : 0)) {
                                nearest.interact(lIlIlIIll[lIlIlIlIl[17]]);
                                Time.sleepTicks(lIlIlIlIl[10]);
                                "".length();
                            }
                            String[] strArr3 = new String[lIlIlIlIl[0]];
                            strArr3[lIlIlIlIl[1]] = lIlIlIIll[lIlIlIlIl[8]];
                            if (lIIIllllIlIl(nearest.hasAction(strArr3) ? 1 : 0)) {
                                C0006g.b(lIlIlIIll[lIlIlIlIl[18]], bR);
                                Time.sleepTicks(lIlIlIlIl[0]);
                                "".length();
                            }
                        }
                    }
                }
                if (lIIIllllIlll(bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(bP);
                    "".length();
                    Time.sleepTicks(lIlIlIlIl[0]);
                    "".length();
                }
            }
            if (lIIIllllIlll(Players.getLocal().getWorldLocation().equals(bP) ? 1 : 0)) {
                if (lIIIlllllIll(lIIIlllllIlI(C0004e.u(), 45.0d))) {
                    int[] iArr = new int[lIlIlIlIl[0]];
                    iArr[lIlIlIlIl[1]] = lIlIlIlIl[2];
                    if (lIIIllllIlll(Inventory.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lIlIlIlIl[0]];
                        iArr2[lIlIlIlIl[1]] = lIlIlIlIl[2];
                        Inventory.getFirst(iArr2).interact(lIlIlIIll[lIlIlIlIl[19]]);
                        Time.sleepTicks(lIlIlIlIl[0]);
                        "".length();
                    }
                }
                if (lIIIllllIlIl(av() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIlIIll[lIlIlIlIl[20]];
                    Time.sleepTicks(lIlIlIlIl[15]);
                    "".length();
                }
                if (lIIIllllIlll(av() ? 1 : 0)) {
                    new WorldArea(bP, lIlIlIlIl[3], lIlIlIlIl[3]);
                    NPC au = au();
                    AccBuilderEasyClues.c = lIlIlIIll[lIlIlIlIl[21]];
                    if (lIIIlllllllI(Players.getLocal().getInteracting()) && lIIIllllIllI(au) && lIIIllllIlIl(au.isDead() ? 1 : 0)) {
                        System.out.println(lIlIlIIll[lIlIlIlIl[22]]);
                        au.interact(lIlIlIIll[lIlIlIlIl[23]]);
                        Time.sleepTicks(lIlIlIlIl[3]);
                        "".length();
                    }
                    Time.sleepTicks(lIlIlIlIl[12]);
                    "".length();
                }
            }
        }
        if (lIIIllllllll(lIIIlllllIIl(C0004e.a(bQ), lIlIlIlIl[9] + bV))) {
            WorldArea worldArea = new WorldArea(lIlIlIlIl[24], lIlIlIlIl[25], lIlIlIlIl[26], lIlIlIlIl[27], lIlIlIlIl[1]);
            WorldPoint worldPoint = new WorldPoint(lIlIlIlIl[28], lIlIlIlIl[29], lIlIlIlIl[1]);
            if (lIIIllllIlll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllllllII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlIlIlIl[13])) {
                Movement.walkTo(worldPoint);
                "".length();
            }
            AccBuilderEasyClues.c = lIlIlIIll[lIlIlIlIl[30]];
            Movement.walkTo(bF);
            "".length();
            Time.sleepTicks(lIlIlIlIl[0]);
            "".length();
            if (lIIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(bF), lIlIlIlIl[3])) {
                bQ = System.currentTimeMillis();
                bV = C0004e.c(lIlIlIlIl[31], lIlIlIlIl[32]);
            }
        }
    }

    private static void lIIIllllIIlI() {
        lIlIlIIll = new String[lIlIlIlIl[67]];
        lIlIlIIll[lIlIlIlIl[1]] = lIIIlllIllII("EmElW6Xo6Mt1cj/dDqN4s851hGof1RD3", "qUEAo");
        lIlIlIIll[lIlIlIlIl[0]] = lIIIlllIllIl("HBsmKgozDjktCnIOP2MPMxQ7", "RzPCm");
        lIlIlIIll[lIlIlIlIl[3]] = lIIIlllIllIl("MAwGDQYRAw9JCBkDAwAEHw==", "xmhij");
        lIlIlIIll[lIlIlIlIl[10]] = lIIIlllIlllI("kmnxvx4tTd9OMkhq/jtiZnMfw9h3kArh", "rvEWU");
        lIlIlIIll[lIlIlIlIl[12]] = lIIIlllIllII("bGt1kgUdUTo=", "CVYFg");
        lIlIlIIll[lIlIlIlIl[13]] = lIIIlllIlllI("bsZAZxPdXWHuz/a1CaqWvw==", "WSxWZ");
        lIlIlIIll[lIlIlIlIl[14]] = lIIIlllIlllI("dmUMXw3O2GjSMQtQhpNBF5LR0zc1mVzW", "yNLeK");
        lIlIlIIll[lIlIlIlIl[15]] = lIIIlllIllII("uVdLoFCAGPI=", "RrLut");
        lIlIlIIll[lIlIlIlIl[16]] = lIIIlllIlllI("MbQcDXVJdGkc4zalhk7E94pgk+6unbNE", "ZcMcT");
        lIlIlIIll[lIlIlIlIl[17]] = lIIIlllIllIl("MTwqF28xOisALhM6NAo6Eg==", "aSXcO");
        lIlIlIIll[lIlIlIlIl[8]] = lIIIlllIlllI("dhvgdel62mjQ0kg4auhuDiA4eWbii/I2", "uwtiC");
        lIlIlIIll[lIlIlIlIl[18]] = lIIIlllIllIl("OCchMQ==", "nBNBW");
        lIlIlIIll[lIlIlIlIl[19]] = lIIIlllIllIl("NBIO", "qszaO");
        lIlIlIIll[lIlIlIlIl[20]] = lIIIlllIllII("WeqW15bM669f0+OjL2+BiQ==", "WRmCQ");
        lIlIlIIll[lIlIlIlIl[21]] = lIIIlllIllIl("Kh8TLDVIGQgjIQAfHg==", "hzzBR");
        lIlIlIIll[lIlIlIlIl[22]] = lIIIlllIlllI("oblP5qpt084lPJIG6KayrthR8fi2hY8z", "SGBOx");
        lIlIlIIll[lIlIlIlIl[23]] = lIIIlllIllIl("AhA6GBoo", "CdNyy");
        lIlIlIIll[lIlIlIlIl[30]] = lIIIlllIlllI("RtL85l0QQM+OIAiTSvNIVA==", "wVXYm");
        lIlIlIIll[lIlIlIlIl[34]] = lIIIlllIllIl("ARgfJUkRCxAjGg==", "RyqAi");
        lIlIlIIll[lIlIlIlIl[36]] = lIIIlllIllII("EECKmhg7BNjiYUWvaCA2KQ==", "GHoMy");
        lIlIlIIll[lIlIlIlIl[60]] = lIIIlllIllII("/onTFGX94I0Hvt4QDyEfVxCAl00qv1s4qsHK8Pwx7L10DfS+3NomWJQWawU81AhT", "CLSyk");
        lIlIlIIll[lIlIlIlIl[61]] = lIIIlllIllII("fCiZSUzBTeS48UKCdpazW8hRMraaRJ0AoXCOyrTImH1uud48OwxvXA==", "yXlAH");
        lIlIlIIll[lIlIlIlIl[62]] = lIIIlllIllII("TO4S5rnyQlD/9naoKvyH7Q==", "lSuFC");
    }

    private static boolean lIIIlllllIII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIlIlIlIl[1];
    }

    private static boolean lIIIllllIllI(Object obj) {
        return obj != null;
    }

    private static int lIIIlllllIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIlIIIIIIII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIlIIIIIIIl(Skills.getLevel(Skill.RANGED), lIlIlIlIl[35]) && lIIlIIIIIIIl(Skills.getLevel(Skill.DEFENCE), lIlIlIlIl[35])) {
            ?? r0 = lIlIlIlIl[0];
            "".length();
            return " ".length() <= ((33 ^ 116) & ((232 ^ 189) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIlIlIl[1];
    }

    private static boolean lIIlIIIIIIIl(int i, int i2) {
        return i >= i2;
    }

    private static int lIIIlllllIIl(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean lIIIllllIlII(int i, int i2) {
        return i < i2;
    }

    private static String lIIIlllIllII(String lllIIlllIIlIlI, String lllIIlllIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIlllIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIlllIIllII = Cipher.getInstance("Blowfish");
            lllIIlllIIllII.init(lIlIlIlIl[3], secretKeySpec);
            return new String(lllIIlllIIllII.doFinal(Base64.getDecoder().decode(lllIIlllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIlllIIlIll) {
            lllIIlllIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllllIll(int i) {
        return i < 0;
    }

    static {
        lIIIllllIIll();
        lIIIllllIIlI();
        bz = new WorldPoint(lIlIlIlIl[37], lIlIlIlIl[38], lIlIlIlIl[1]);
        bA = new WorldPoint(lIlIlIlIl[39], lIlIlIlIl[40], lIlIlIlIl[1]);
        bB = new WorldPoint(lIlIlIlIl[41], lIlIlIlIl[42], lIlIlIlIl[1]);
        bC = new WorldPoint(lIlIlIlIl[43], lIlIlIlIl[44], lIlIlIlIl[1]);
        bD = new WorldPoint(lIlIlIlIl[45], lIlIlIlIl[38], lIlIlIlIl[1]);
        bE = new WorldPoint(lIlIlIlIl[46], lIlIlIlIl[47], lIlIlIlIl[1]);
        bF = new WorldPoint(lIlIlIlIl[39], lIlIlIlIl[40], lIlIlIlIl[1]);
        bG = new WorldPoint(lIlIlIlIl[48], lIlIlIlIl[38], lIlIlIlIl[1]);
        bH = new WorldPoint(lIlIlIlIl[49], lIlIlIlIl[50], lIlIlIlIl[1]);
        bI = new WorldPoint(lIlIlIlIl[51], lIlIlIlIl[42], lIlIlIlIl[1]);
        bJ = new WorldPoint(lIlIlIlIl[49], lIlIlIlIl[50], lIlIlIlIl[1]);
        bK = new WorldPoint(lIlIlIlIl[52], lIlIlIlIl[53], lIlIlIlIl[1]);
        bL = new WorldPoint(lIlIlIlIl[54], lIlIlIlIl[55], lIlIlIlIl[1]);
        bM = new WorldPoint(lIlIlIlIl[56], lIlIlIlIl[57], lIlIlIlIl[1]);
        bN = new WorldPoint(lIlIlIlIl[39], lIlIlIlIl[40], lIlIlIlIl[1]);
        bO = new WorldPoint(lIlIlIlIl[58], lIlIlIlIl[59], lIlIlIlIl[1]);
        bP = new WorldPoint(lIlIlIlIl[37], lIlIlIlIl[38], lIlIlIlIl[1]);
        bQ = System.currentTimeMillis();
        String[] strArr = new String[lIlIlIlIl[10]];
        strArr[lIlIlIlIl[1]] = lIlIlIIll[lIlIlIlIl[60]];
        strArr[lIlIlIlIl[0]] = lIlIlIIll[lIlIlIlIl[61]];
        strArr[lIlIlIlIl[3]] = lIlIlIIll[lIlIlIlIl[62]];
        bR = strArr;
        bS = new WorldArea(lIlIlIlIl[63], lIlIlIlIl[64], lIlIlIlIl[65], lIlIlIlIl[66], lIlIlIlIl[1]);
        bT = lIlIlIlIl[1];
        bV = C0004e.c(lIlIlIlIl[31], lIlIlIlIl[32]);
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIlIlIIll[lIlIlIlIl[34]];
    }

    private static boolean lIIIlllllllI(Object obj) {
        return obj == null;
    }

    public static void aw() {
        int c = C0004e.c(lIlIlIlIl[0], lIlIlIlIl[13]);
        if (lIIlIIIIIIII(c, lIlIlIlIl[0])) {
            bP = bz;
            bF = bA;
        }
        if (lIIlIIIIIIII(c, lIlIlIlIl[3])) {
            bP = bG;
            bF = bH;
        }
        if (lIIlIIIIIIII(c, lIlIlIlIl[10])) {
            bP = bI;
            bF = bJ;
        }
        if (lIIlIIIIIIII(c, lIlIlIlIl[12])) {
            bP = bK;
            bF = bL;
        }
        if (lIIlIIIIIIII(c, lIlIlIlIl[13])) {
            bP = bM;
            bF = bN;
        }
    }

    static NPC au() {
        WorldPoint worldPoint = bP;
        WorldPoint worldPoint2 = new WorldPoint(bP.getX() - lIlIlIlIl[0], bP.getWorldY() + lIlIlIlIl[0], lIlIlIlIl[1]);
        WorldPoint worldPoint3 = new WorldPoint(bP.getX(), bP.getWorldY() + lIlIlIlIl[0], lIlIlIlIl[1]);
        WorldPoint worldPoint4 = new WorldPoint(bP.getX() + lIlIlIlIl[0], bP.getWorldY() + lIlIlIlIl[0], lIlIlIlIl[1]);
        WorldPoint worldPoint5 = new WorldPoint(bP.getX() + lIlIlIlIl[0], bP.getWorldY(), lIlIlIlIl[1]);
        WorldPoint worldPoint6 = new WorldPoint(bP.getX() + lIlIlIlIl[0], bP.getWorldY() - lIlIlIlIl[0], lIlIlIlIl[1]);
        WorldPoint worldPoint7 = new WorldPoint(bP.getX(), bP.getWorldY() - lIlIlIlIl[0], lIlIlIlIl[1]);
        WorldPoint worldPoint8 = new WorldPoint(bP.getX() - lIlIlIlIl[0], bP.getWorldY() - lIlIlIlIl[0], lIlIlIlIl[1]);
        WorldPoint worldPoint9 = new WorldPoint(bP.getX() - lIlIlIlIl[0], bP.getWorldY(), lIlIlIlIl[1]);
        List all = NPCs.getAll(npc -> {
            return npc.getName().equalsIgnoreCase(lIlIlIIll[lIlIlIlIl[36]]);
        });
        if (lIIIllllIllI(all)) {
            List of = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int i = lIlIlIlIl[1];
            while (lIIIllllIlII(i, all.size())) {
                if (lIIIllllIlll(of.contains(((NPC) all.get(i)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC) all.get(i);
                }
                i++;
                "".length();
                if ((-"   ".length()) >= 0) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    private static String lIIIlllIllIl(String lllIIlllIlllll, String lllIIlllIllllI) {
        String str = new String(Base64.getDecoder().decode(lllIIlllIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIlllIlllIl = new StringBuilder();
        char[] lllIIlllIlllII = lllIIlllIllllI.toCharArray();
        int lllIIlllIllIll = lIlIlIlIl[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlIlIl[1];
        while (lIIIllllIlII(i, length)) {
            lllIIlllIlllIl.append((char) (charArray[i] ^ lllIIlllIlllII[lllIIlllIllIll % lllIIlllIlllII.length]));
            "".length();
            lllIIlllIllIll++;
            i++;
            "".length();
            if (((47 ^ 32) ^ (76 ^ 71)) < " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllIIlllIlllIl);
    }

    private static void as() {
        if (lIIIllllIlII(bU, lIlIlIlIl[0])) {
            bQ = System.currentTimeMillis();
            System.out.println(lIlIlIIll[lIlIlIlIl[1]]);
            bU += lIlIlIlIl[0];
        }
        int[] iArr = new int[lIlIlIlIl[0]];
        iArr[lIlIlIlIl[1]] = lIlIlIlIl[2];
        if (lIIIllllIlIl(Inventory.contains(iArr) ? 1 : 0)) {
            BankLocation nearest = BankLocation.getNearest();
            if (lIIIllllIllI(nearest) && lIIIllllIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIlIIll[lIlIlIlIl[0]];
                C0000a.a(nearest);
            }
            if (lIIIllllIllI(nearest) && lIIIllllIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIlIIll[lIlIlIlIl[3]];
                if (lIIIllllIlIl(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIlIlIlIl[4]);
                    "".length();
                }
                if (lIIIllllIlll(Bank.isOpen() ? 1 : 0)) {
                    if (lIIIlllllIII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIlIlIlIl[0]);
                        "".length();
                    }
                    C0000a.a(lIlIlIlIl[2], lIlIlIlIl[5]);
                    C0000a.a(lIlIlIlIl[6], lIlIlIlIl[0]);
                    C0000a.a(lIlIlIlIl[7], lIlIlIlIl[8]);
                }
            }
        }
        int[] iArr2 = new int[lIlIlIlIl[0]];
        iArr2[lIlIlIlIl[1]] = lIlIlIlIl[2];
        if (lIIIllllIlll(Inventory.contains(iArr2) ? 1 : 0)) {
            at();
        }
    }

    private static boolean lIIIllllIlll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean av() {
        WorldArea worldArea = new WorldArea(bP, lIlIlIlIl[10], lIlIlIlIl[10]);
        List all = Players.getAll();
        if (lIIIllllIlIl(all.isEmpty() ? 1 : 0) && lIIIllllllII(all.size(), lIlIlIlIl[0])) {
            int i = lIlIlIlIl[1];
            while (lIIIllllIlII(i, all.size())) {
                if (lIIIllllIlll(((Player) all.get(i)).equals(Players.getLocal()) ? 1 : 0)) {
                    "".length();
                    if ((((((103 + 45) - 93) + 72) ^ (54 ^ 86)) & (((192 ^ 190) ^ (244 ^ 149)) ^ (-" ".length()))) > " ".length()) {
                        return ((226 ^ 154) ^ (59 ^ 93)) & (((((7 + 24) - (-87)) + 103) ^ (((154 + 183) - 152) + 10)) ^ (-" ".length()));
                    }
                } else if (lIIIllllIlll(worldArea.contains(((Player) all.get(i)).getWorldLocation()) ? 1 : 0)) {
                    return lIlIlIlIl[0];
                }
                i++;
                "".length();
                if ("  ".length() < "  ".length()) {
                    return ((99 ^ 2) ^ (55 ^ 119)) & (((161 ^ 172) ^ (23 ^ 59)) ^ (-" ".length()));
                }
            }
        }
        return lIlIlIlIl[1];
    }

    private static void lIIIllllIIll() {
        lIlIlIlIl = new int[68];
        lIlIlIlIl[0] = " ".length();
        lIlIlIlIl[1] = (47 ^ 8) & ((43 ^ 12) ^ (-1));
        lIlIlIlIl[2] = (-((-3373) & 32045)) & (-1153) & 30203;
        lIlIlIlIl[3] = "  ".length();
        lIlIlIlIl[4] = (-((-23490) & 32759)) & (-16385) & 30653;
        lIlIlIlIl[5] = (((218 + 154) - 191) + 39) ^ (((12 + 129) - 24) + 79);
        lIlIlIlIl[6] = (-3759) & 16383;
        lIlIlIlIl[7] = (-33) & 8041;
        lIlIlIlIl[8] = (101 ^ 90) ^ (246 ^ 195);
        lIlIlIlIl[9] = (-18484) & 618483;
        lIlIlIlIl[10] = "   ".length();
        lIlIlIlIl[11] = 22 ^ 80;
        lIlIlIlIl[12] = 196 ^ 192;
        lIlIlIlIl[13] = (((2 + 124) - (-8)) + 11) ^ (((90 + 51) - 138) + 145);
        lIlIlIlIl[14] = 46 ^ 40;
        lIlIlIlIl[15] = (195 ^ 161) ^ (237 ^ 136);
        lIlIlIlIl[16] = 4 ^ 12;
        lIlIlIlIl[17] = (208 ^ 137) ^ (24 ^ 72);
        lIlIlIlIl[18] = 151 ^ 156;
        lIlIlIlIl[19] = 114 ^ 126;
        lIlIlIlIl[20] = (125 ^ 10) ^ (215 ^ 173);
        lIlIlIlIl[21] = (((108 + 77) - 133) + 80) ^ (((22 + 112) - 50) + 54);
        lIlIlIlIl[22] = (((127 + 58) - 120) + 126) ^ (((20 + 151) - 80) + 85);
        lIlIlIlIl[23] = 189 ^ 173;
        lIlIlIlIl[24] = (-((-9123) & 30694)) & (-8193) & 32767;
        lIlIlIlIl[25] = (-16672) & 19903;
        lIlIlIlIl[26] = 26 ^ 91;
        lIlIlIlIl[27] = (88 ^ 33) ^ (114 ^ 44);
        lIlIlIlIl[28] = (-17) & 3069;
        lIlIlIlIl[29] = (-((-8713) & 29273)) & (-769) & 24575;
        lIlIlIlIl[30] = 129 ^ 144;
        lIlIlIlIl[31] = (-((-27300) & 28651)) & (-1) & 16351;
        lIlIlIlIl[32] = (-((-26266) & 28383)) & (-139) & 32255;
        lIlIlIlIl[33] = 31 ^ 123;
        lIlIlIlIl[34] = (33 ^ 55) ^ (18 ^ 22);
        lIlIlIlIl[35] = (88 ^ 70) ^ (48 ^ 77);
        lIlIlIlIl[36] = (80 ^ 50) ^ (207 ^ 190);
        lIlIlIlIl[37] = (-20744) & 22519;
        lIlIlIlIl[38] = (-4161) & 7628;
        lIlIlIlIl[39] = (-((-1794) & 16325)) & (-13) & 16335;
        lIlIlIlIl[40] = (-((-21681) & 22201)) & (-4161) & 8188;
        lIlIlIlIl[41] = (-((-9393) & 26039)) & (-33) & 18415;
        lIlIlIlIl[42] = (-29233) & 32701;
        lIlIlIlIl[43] = (-((-5221) & 15717)) & (-16395) & 28622;
        lIlIlIlIl[44] = (-((-17717) & 22391)) & (-8198) & 16375;
        lIlIlIlIl[45] = (-((-805) & 13094)) & (-2049) & 16127;
        lIlIlIlIl[46] = (-((-16385) & 28933)) & (-18433) & 32766;
        lIlIlIlIl[47] = (-8273) & 11775;
        lIlIlIlIl[48] = (-275) & 2039;
        lIlIlIlIl[49] = (-((-13513) & 32218)) & (-8201) & 28671;
        lIlIlIlIl[50] = (-((-4357) & 13085)) & (-33) & 12283;
        lIlIlIlIl[51] = (-((-14937) & 31611)) & (-8201) & 26623;
        lIlIlIlIl[52] = (-((-16897) & 31317)) & (-1) & 16095;
        lIlIlIlIl[53] = (-((-2017) & 30697)) & (-513) & 32670;
        lIlIlIlIl[54] = (-((-8757) & 31549)) & (-1) & 24509;
        lIlIlIlIl[55] = (-20497) & 23963;
        lIlIlIlIl[56] = (-((-9665) & 13777)) & (-259) & 6143;
        lIlIlIlIl[57] = (-20505) & 23965;
        lIlIlIlIl[58] = (-17) & 3070;
        lIlIlIlIl[59] = (-4882) & 8127;
        lIlIlIlIl[60] = (((120 + 208) - 223) + 108) ^ (((103 + 94) - 105) + 101);
        lIlIlIlIl[61] = (144 ^ 162) ^ (33 ^ 6);
        lIlIlIlIl[62] = (77 ^ 69) ^ (36 ^ 58);
        lIlIlIlIl[63] = (-16641) & 17806;
        lIlIlIlIl[64] = (-((-14404) & 30923)) & (-4161) & 24063;
        lIlIlIlIl[65] = (-(((126 + 103) - 194) + 106)) & (-2081) & 3007;
        lIlIlIlIl[66] = (-((-17073) & 30649)) & (-1) & 14271;
        lIlIlIlIl[67] = (((8 + 55) - (-27)) + 100) ^ (((35 + 146) - 63) + 51);
    }

    private static String lIIIlllIlllI(String lllIIllIllllIl, String lllIIllIllllII) {
        try {
            SecretKeySpec lllIIlllIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIllIllllII.getBytes(StandardCharsets.UTF_8)), lIlIlIlIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIlIl[3], lllIIlllIIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIllIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIllIlllllI) {
            lllIIllIlllllI.printStackTrace();
            return null;
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            as();
            "".length();
            if (0 != 0) {
                return ((51 ^ 16) ^ (144 ^ 135)) & (("   ".length() ^ (111 ^ 88)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIlIlIlIl[33];
    }

    private static boolean lIIIllllIlIl(int i) {
        return i == 0;
    }

    private static boolean lIIIllllllII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIllllllll(int i) {
        return i >= 0;
    }
}
