/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
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

public class n
implements W {
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

    private static boolean lIIIllllllIl(int n2, int n3) {
        return n2 <= n3;
    }

    public static void at() {
        NPC lllIlIIIIIllII;
        WorldArea lllIlIIIIIllIl;
        if (n.lIIIlllllIll(n.lIIIlllllIIl(e.a(bQ), lIlIlIlIl[9] + bV))) {
            if (n.lIIIllllIlIl(Players.getLocal().getWorldLocation().equals((Object)bP) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIlIIll[lIlIlIlIl[10]];
                if (n.lIIIllllIlII(Movement.getRunEnergy(), lIlIlIlIl[11]) && n.lIIIllllIlll(Inventory.contains((int[])f.aV) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.aV).interact(lIlIlIIll[lIlIlIlIl[12]]);
                    Time.sleepTicks((int)lIlIlIlIl[0]);
                    "".length();
                }
                if (n.lIIIllllIlIl(bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (n.lIIIllllllII(Players.getLocal().getWorldLocation().distanceTo(bO), lIlIlIlIl[10])) {
                        AccBuilderEasyClues.c = lIlIlIIll[lIlIlIlIl[13]];
                        Movement.walkTo((WorldPoint)bO);
                        "".length();
                        Time.sleepTicks((int)lIlIlIlIl[0]);
                        "".length();
                    }
                    if (n.lIIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(bO), lIlIlIlIl[10])) {
                        AccBuilderEasyClues.c = lIlIlIIll[lIlIlIlIl[14]];
                        if (n.lIIIllllIlII(bT, lIlIlIlIl[0])) {
                            e.v();
                            bT += lIlIlIlIl[0];
                        }
                        String[] stringArray = new String[lIlIlIlIl[0]];
                        stringArray[n.lIlIlIlIl[1]] = lIlIlIIll[lIlIlIlIl[15]];
                        lllIlIIIIIllIl = NPCs.getNearest((String[])stringArray);
                        if (n.lIIIllllIllI(lllIlIIIIIllIl)) {
                            String[] stringArray2 = new String[lIlIlIlIl[0]];
                            stringArray2[n.lIlIlIlIl[1]] = lIlIlIIll[lIlIlIlIl[16]];
                            if (n.lIIIllllIlll(lllIlIIIIIllIl.hasAction(stringArray2) ? 1 : 0)) {
                                lllIlIIIIIllIl.interact(lIlIlIIll[lIlIlIlIl[17]]);
                                Time.sleepTicks((int)lIlIlIlIl[10]);
                                "".length();
                            }
                            String[] stringArray3 = new String[lIlIlIlIl[0]];
                            stringArray3[n.lIlIlIlIl[1]] = lIlIlIIll[lIlIlIlIl[8]];
                            if (n.lIIIllllIlIl(lllIlIIIIIllIl.hasAction(stringArray3) ? 1 : 0)) {
                                g.b(lIlIlIIll[lIlIlIlIl[18]], bR);
                                Time.sleepTicks((int)lIlIlIlIl[0]);
                                "".length();
                            }
                        }
                    }
                }
                if (n.lIIIllllIlll(bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)bP);
                    "".length();
                    Time.sleepTicks((int)lIlIlIlIl[0]);
                    "".length();
                }
            }
            if (n.lIIIllllIlll(Players.getLocal().getWorldLocation().equals((Object)bP) ? 1 : 0)) {
                if (n.lIIIlllllIll(n.lIIIlllllIlI(e.u(), 45.0))) {
                    int[] nArray = new int[lIlIlIlIl[0]];
                    nArray[n.lIlIlIlIl[1]] = lIlIlIlIl[2];
                    if (n.lIIIllllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIlIlIlIl[0]];
                        nArray2[n.lIlIlIlIl[1]] = lIlIlIlIl[2];
                        Inventory.getFirst((int[])nArray2).interact(lIlIlIIll[lIlIlIlIl[19]]);
                        Time.sleepTicks((int)lIlIlIlIl[0]);
                        "".length();
                    }
                }
                if (n.lIIIllllIlIl(n.av() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIlIIll[lIlIlIlIl[20]];
                    Time.sleepTicks((int)lIlIlIlIl[15]);
                    "".length();
                }
                if (n.lIIIllllIlll(n.av() ? 1 : 0)) {
                    lllIlIIIIIllIl = new WorldArea(bP, lIlIlIlIl[3], lIlIlIlIl[3]);
                    lllIlIIIIIllII = n.au();
                    AccBuilderEasyClues.c = lIlIlIIll[lIlIlIlIl[21]];
                    if (n.lIIIlllllllI(Players.getLocal().getInteracting()) && n.lIIIllllIllI(lllIlIIIIIllII) && n.lIIIllllIlIl(lllIlIIIIIllII.isDead() ? 1 : 0)) {
                        System.out.println(lIlIlIIll[lIlIlIlIl[22]]);
                        lllIlIIIIIllII.interact(lIlIlIIll[lIlIlIlIl[23]]);
                        Time.sleepTicks((int)lIlIlIlIl[3]);
                        "".length();
                    }
                    Time.sleepTicks((int)lIlIlIlIl[12]);
                    "".length();
                }
            }
        }
        if (n.lIIIllllllll(n.lIIIlllllIIl(e.a(bQ), lIlIlIlIl[9] + bV))) {
            lllIlIIIIIllIl = new WorldArea(lIlIlIlIl[24], lIlIlIlIl[25], lIlIlIlIl[26], lIlIlIlIl[27], lIlIlIlIl[1]);
            lllIlIIIIIllII = new WorldPoint(lIlIlIlIl[28], lIlIlIlIl[29], lIlIlIlIl[1]);
            if (n.lIIIllllIlll(lllIlIIIIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && n.lIIIllllllII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllIlIIIIIllII), lIlIlIlIl[13])) {
                Movement.walkTo((WorldPoint)lllIlIIIIIllII);
                "".length();
            }
            AccBuilderEasyClues.c = lIlIlIIll[lIlIlIlIl[30]];
            Movement.walkTo((WorldPoint)bF);
            "".length();
            Time.sleepTicks((int)lIlIlIlIl[0]);
            "".length();
            if (n.lIIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(bF), lIlIlIlIl[3])) {
                bQ = System.currentTimeMillis();
                bV = e.c(lIlIlIlIl[31], lIlIlIlIl[32]);
            }
        }
    }

    private static void lIIIllllIIlI() {
        lIlIlIIll = new String[lIlIlIlIl[67]];
        n.lIlIlIIll[n.lIlIlIlIl[1]] = n.lIIIlllIllII("EmElW6Xo6Mt1cj/dDqN4s851hGof1RD3", "qUEAo");
        n.lIlIlIIll[n.lIlIlIlIl[0]] = n.lIIIlllIllIl("HBsmKgozDjktCnIOP2MPMxQ7", "RzPCm");
        n.lIlIlIIll[n.lIlIlIlIl[3]] = n.lIIIlllIllIl("MAwGDQYRAw9JCBkDAwAEHw==", "xmhij");
        n.lIlIlIIll[n.lIlIlIlIl[10]] = n.lIIIlllIlllI("kmnxvx4tTd9OMkhq/jtiZnMfw9h3kArh", "rvEWU");
        n.lIlIlIIll[n.lIlIlIlIl[12]] = n.lIIIlllIllII("bGt1kgUdUTo=", "CVYFg");
        n.lIlIlIIll[n.lIlIlIlIl[13]] = n.lIIIlllIlllI("bsZAZxPdXWHuz/a1CaqWvw==", "WSxWZ");
        n.lIlIlIIll[n.lIlIlIlIl[14]] = n.lIIIlllIlllI("dmUMXw3O2GjSMQtQhpNBF5LR0zc1mVzW", "yNLeK");
        n.lIlIlIIll[n.lIlIlIlIl[15]] = n.lIIIlllIllII("uVdLoFCAGPI=", "RrLut");
        n.lIlIlIIll[n.lIlIlIlIl[16]] = n.lIIIlllIlllI("MbQcDXVJdGkc4zalhk7E94pgk+6unbNE", "ZcMcT");
        n.lIlIlIIll[n.lIlIlIlIl[17]] = n.lIIIlllIllIl("MTwqF28xOisALhM6NAo6Eg==", "aSXcO");
        n.lIlIlIIll[n.lIlIlIlIl[8]] = n.lIIIlllIlllI("dhvgdel62mjQ0kg4auhuDiA4eWbii/I2", "uwtiC");
        n.lIlIlIIll[n.lIlIlIlIl[18]] = n.lIIIlllIllIl("OCchMQ==", "nBNBW");
        n.lIlIlIIll[n.lIlIlIlIl[19]] = n.lIIIlllIllIl("NBIO", "qszaO");
        n.lIlIlIIll[n.lIlIlIlIl[20]] = n.lIIIlllIllII("WeqW15bM669f0+OjL2+BiQ==", "WRmCQ");
        n.lIlIlIIll[n.lIlIlIlIl[21]] = n.lIIIlllIllIl("Kh8TLDVIGQgjIQAfHg==", "hzzBR");
        n.lIlIlIIll[n.lIlIlIlIl[22]] = n.lIIIlllIlllI("oblP5qpt084lPJIG6KayrthR8fi2hY8z", "SGBOx");
        n.lIlIlIIll[n.lIlIlIlIl[23]] = n.lIIIlllIllIl("AhA6GBoo", "CdNyy");
        n.lIlIlIIll[n.lIlIlIlIl[30]] = n.lIIIlllIlllI("RtL85l0QQM+OIAiTSvNIVA==", "wVXYm");
        n.lIlIlIIll[n.lIlIlIlIl[34]] = n.lIIIlllIllIl("ARgfJUkRCxAjGg==", "RyqAi");
        n.lIlIlIIll[n.lIlIlIlIl[36]] = n.lIIIlllIllII("EECKmhg7BNjiYUWvaCA2KQ==", "GHoMy");
        n.lIlIlIIll[n.lIlIlIlIl[60]] = n.lIIIlllIllII("/onTFGX94I0Hvt4QDyEfVxCAl00qv1s4qsHK8Pwx7L10DfS+3NomWJQWawU81AhT", "CLSyk");
        n.lIlIlIIll[n.lIlIlIlIl[61]] = n.lIIIlllIllII("fCiZSUzBTeS48UKCdpazW8hRMraaRJ0AoXCOyrTImH1uud48OwxvXA==", "yXlAH");
        n.lIlIlIIll[n.lIlIlIlIl[62]] = n.lIIIlllIllII("TO4S5rnyQlD/9naoKvyH7Q==", "lSuFC");
    }

    private static boolean lIIIlllllIII(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean S() {
        return lIlIlIlIl[1];
    }

    private static boolean lIIIllllIllI(Object object) {
        return object != null;
    }

    private static int lIIIlllllIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIlIIIIIIII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean V() {
        int n2;
        if (n.lIIlIIIIIIIl(Skills.getLevel((Skill)Skill.RANGED), lIlIlIlIl[35]) && n.lIIlIIIIIIIl(Skills.getLevel((Skill)Skill.DEFENCE), lIlIlIlIl[35])) {
            n2 = lIlIlIlIl[0];
            "".length();
            if (" ".length() <= ((0x21 ^ 0x74) & ~(0xE8 ^ 0xBD))) {
                return ((0xA0 ^ 0xAE) & ~(0x61 ^ 0x6F)) != 0;
            }
        } else {
            n2 = lIlIlIlIl[1];
        }
        return n2 != 0;
    }

    private static boolean lIIlIIIIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static int lIIIlllllIIl(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean lIIIllllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIlllIllII(String lllIIlllIIlIlI, String lllIIlllIIlIIl) {
        try {
            SecretKeySpec lllIIlllIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIlllIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIlllIIllII = Cipher.getInstance("Blowfish");
            lllIIlllIIllII.init(lIlIlIlIl[3], lllIIlllIIllIl);
            return new String(lllIIlllIIllII.doFinal(Base64.getDecoder().decode(lllIIlllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIlllIIlIll) {
            lllIIlllIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllllIll(int n2) {
        return n2 < 0;
    }

    static {
        n.lIIIllllIIll();
        n.lIIIllllIIlI();
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
        String[] stringArray = new String[lIlIlIlIl[10]];
        stringArray[n.lIlIlIlIl[1]] = lIlIlIIll[lIlIlIlIl[60]];
        stringArray[n.lIlIlIlIl[0]] = lIlIlIIll[lIlIlIlIl[61]];
        stringArray[n.lIlIlIlIl[3]] = lIlIlIIll[lIlIlIlIl[62]];
        bR = stringArray;
        bS = new WorldArea(lIlIlIlIl[63], lIlIlIlIl[64], lIlIlIlIl[65], lIlIlIlIl[66], lIlIlIlIl[1]);
        bT = lIlIlIlIl[1];
        bV = e.c(lIlIlIlIl[31], lIlIlIlIl[32]);
    }

    @Override
    public String U() {
        return lIlIlIIll[lIlIlIlIl[34]];
    }

    private static boolean lIIIlllllllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public static void aw() {
        void lllIIllllIllII;
        int n2 = e.c(lIlIlIlIl[0], lIlIlIlIl[13]);
        if (n.lIIlIIIIIIII(n2, lIlIlIlIl[0])) {
            bP = bz;
            bF = bA;
        }
        if (n.lIIlIIIIIIII((int)lllIIllllIllII, lIlIlIlIl[3])) {
            bP = bG;
            bF = bH;
        }
        if (n.lIIlIIIIIIII((int)lllIIllllIllII, lIlIlIlIl[10])) {
            bP = bI;
            bF = bJ;
        }
        if (n.lIIlIIIIIIII((int)lllIIllllIllII, lIlIlIlIl[12])) {
            bP = bK;
            bF = bL;
        }
        if (n.lIIlIIIIIIII((int)lllIIllllIllII, lIlIlIlIl[13])) {
            bP = bM;
            bF = bN;
        }
    }

    /*
     * WARNING - void declaration
     */
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
        List list = NPCs.getAll(nPC -> nPC.getName().equalsIgnoreCase(lIlIlIIll[lIlIlIlIl[36]]));
        if (n.lIIIllllIllI(list)) {
            void lllIIlllllIllI;
            List<WorldPoint> list2 = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int lllIIlllllIlII = lIlIlIlIl[1];
            while (n.lIIIllllIlII(lllIIlllllIlII, lllIIlllllIllI.size())) {
                void lllIIlllllIlIl;
                if (n.lIIIllllIlll(lllIIlllllIlIl.contains(((NPC)lllIIlllllIllI.get(lllIIlllllIlII)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC)lllIIlllllIllI.get(lllIIlllllIlII);
                }
                ++lllIIlllllIlII;
                "".length();
                if (-"   ".length() < 0) continue;
                return null;
            }
        }
        return null;
    }

    private static String lIIIlllIllIl(String lllIIlllIlllll, String lllIIlllIllllI) {
        lllIIlllIlllll = new String(Base64.getDecoder().decode(lllIIlllIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIlllIlllIl = new StringBuilder();
        char[] lllIIlllIlllII = lllIIlllIllllI.toCharArray();
        int lllIIlllIllIll = lIlIlIlIl[1];
        char[] lllIIlllIlIlIl = lllIIlllIlllll.toCharArray();
        int lllIIlllIlIlII = lllIIlllIlIlIl.length;
        int lllIIlllIlIIll = lIlIlIlIl[1];
        while (n.lIIIllllIlII(lllIIlllIlIIll, lllIIlllIlIlII)) {
            char lllIIllllIIIII = lllIIlllIlIlIl[lllIIlllIlIIll];
            lllIIlllIlllIl.append((char)(lllIIllllIIIII ^ lllIIlllIlllII[lllIIlllIllIll % lllIIlllIlllII.length]));
            "".length();
            ++lllIIlllIllIll;
            ++lllIIlllIlIIll;
            "".length();
            if ((0x2F ^ 0x20 ^ (0x4C ^ 0x47)) >= " ".length()) continue;
            return null;
        }
        return String.valueOf(lllIIlllIlllIl);
    }

    private static void as() {
        if (n.lIIIllllIlII(bU, lIlIlIlIl[0])) {
            bQ = System.currentTimeMillis();
            System.out.println(lIlIlIIll[lIlIlIlIl[1]]);
            bU += lIlIlIlIl[0];
        }
        int[] nArray = new int[lIlIlIlIl[0]];
        nArray[n.lIlIlIlIl[1]] = lIlIlIlIl[2];
        if (n.lIIIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            BankLocation lllIlIIIIlIIII = BankLocation.getNearest();
            if (n.lIIIllllIllI(lllIlIIIIlIIII) && n.lIIIllllIlIl(lllIlIIIIlIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIlIIll[lIlIlIlIl[0]];
                a.a(lllIlIIIIlIIII);
            }
            if (n.lIIIllllIllI(lllIlIIIIlIIII) && n.lIIIllllIlll(lllIlIIIIlIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIlIIll[lIlIlIlIl[3]];
                if (n.lIIIllllIlIl(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlIlIl[4]);
                    "".length();
                }
                if (n.lIIIllllIlll(Bank.isOpen() ? 1 : 0)) {
                    if (n.lIIIlllllIII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lIlIlIlIl[0]);
                        "".length();
                    }
                    a.a(lIlIlIlIl[2], lIlIlIlIl[5]);
                    a.a(lIlIlIlIl[6], lIlIlIlIl[0]);
                    a.a(lIlIlIlIl[7], lIlIlIlIl[8]);
                }
            }
        }
        int[] nArray2 = new int[lIlIlIlIl[0]];
        nArray2[n.lIlIlIlIl[1]] = lIlIlIlIl[2];
        if (n.lIIIllllIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            n.at();
        }
    }

    private static boolean lIIIllllIlll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean av() {
        WorldArea worldArea = new WorldArea(bP, lIlIlIlIl[10], lIlIlIlIl[10]);
        List list = Players.getAll();
        if (n.lIIIllllIlIl(list.isEmpty() ? 1 : 0) && n.lIIIllllllII(list.size(), lIlIlIlIl[0])) {
            void lllIIllllIllll;
            int lllIIllllIlllI = lIlIlIlIl[1];
            while (n.lIIIllllIlII(lllIIllllIlllI, lllIIllllIllll.size())) {
                void lllIIlllllIIII;
                if (n.lIIIllllIlll(((Player)lllIIllllIllll.get(lllIIllllIlllI)).equals(Players.getLocal()) ? 1 : 0)) {
                    "".length();
                    if (((103 + 45 - 93 + 72 ^ (0x36 ^ 0x56)) & (0xC0 ^ 0xBE ^ (0xF4 ^ 0x95) ^ -" ".length())) > " ".length()) {
                        return ((0xE2 ^ 0x9A ^ (0x3B ^ 0x5D)) & (7 + 24 - -87 + 103 ^ 154 + 183 - 152 + 10 ^ -" ".length())) != 0;
                    }
                } else if (n.lIIIllllIlll(lllIIlllllIIII.contains(((Player)lllIIllllIllll.get(lllIIllllIlllI)).getWorldLocation()) ? 1 : 0)) {
                    return lIlIlIlIl[0];
                }
                ++lllIIllllIlllI;
                "".length();
                if ("  ".length() >= "  ".length()) continue;
                return ((0x63 ^ 2 ^ (0x37 ^ 0x77)) & (0xA1 ^ 0xAC ^ (0x17 ^ 0x3B) ^ -" ".length())) != 0;
            }
        }
        return lIlIlIlIl[1];
    }

    private static void lIIIllllIIll() {
        lIlIlIlIl = new int[68];
        n.lIlIlIlIl[0] = " ".length();
        n.lIlIlIlIl[1] = (0x2F ^ 8) & ~(0x2B ^ 0xC);
        n.lIlIlIlIl[2] = -(0xFFFFF2D3 & 0x7D2D) & (0xFFFFFB7F & 0x75FB);
        n.lIlIlIlIl[3] = "  ".length();
        n.lIlIlIlIl[4] = -(0xFFFFA43E & 0x7FF7) & (0xFFFFBFFF & 0x77BD);
        n.lIlIlIlIl[5] = 218 + 154 - 191 + 39 ^ 12 + 129 - 24 + 79;
        n.lIlIlIlIl[6] = 0xFFFFF151 & 0x3FFF;
        n.lIlIlIlIl[7] = 0xFFFFFFDF & 0x1F69;
        n.lIlIlIlIl[8] = 0x65 ^ 0x5A ^ (0xF6 ^ 0xC3);
        n.lIlIlIlIl[9] = 0xFFFFB7CC & 0x96FF3;
        n.lIlIlIlIl[10] = "   ".length();
        n.lIlIlIlIl[11] = 0x16 ^ 0x50;
        n.lIlIlIlIl[12] = 0xC4 ^ 0xC0;
        n.lIlIlIlIl[13] = 2 + 124 - -8 + 11 ^ 90 + 51 - 138 + 145;
        n.lIlIlIlIl[14] = 0x2E ^ 0x28;
        n.lIlIlIlIl[15] = 0xC3 ^ 0xA1 ^ (0xED ^ 0x88);
        n.lIlIlIlIl[16] = 4 ^ 0xC;
        n.lIlIlIlIl[17] = 0xD0 ^ 0x89 ^ (0x18 ^ 0x48);
        n.lIlIlIlIl[18] = 0x97 ^ 0x9C;
        n.lIlIlIlIl[19] = 0x72 ^ 0x7E;
        n.lIlIlIlIl[20] = 0x7D ^ 0xA ^ (0xD7 ^ 0xAD);
        n.lIlIlIlIl[21] = 108 + 77 - 133 + 80 ^ 22 + 112 - 50 + 54;
        n.lIlIlIlIl[22] = 127 + 58 - 120 + 126 ^ 20 + 151 - 80 + 85;
        n.lIlIlIlIl[23] = 0xBD ^ 0xAD;
        n.lIlIlIlIl[24] = -(0xFFFFDC5D & 0x77E6) & (0xFFFFDFFF & Short.MAX_VALUE);
        n.lIlIlIlIl[25] = 0xFFFFBEE0 & 0x4DBF;
        n.lIlIlIlIl[26] = 0x1A ^ 0x5B;
        n.lIlIlIlIl[27] = 0x58 ^ 0x21 ^ (0x72 ^ 0x2C);
        n.lIlIlIlIl[28] = 0xFFFFFFEF & 0xBFD;
        n.lIlIlIlIl[29] = -(0xFFFFDDF7 & 0x7259) & (0xFFFFFCFF & 0x5FFF);
        n.lIlIlIlIl[30] = 0x81 ^ 0x90;
        n.lIlIlIlIl[31] = -(0xFFFF955C & 0x6FEB) & (0xFFFFFFFF & 0x3FDF);
        n.lIlIlIlIl[32] = -(0xFFFF9966 & 0x6EDF) & (0xFFFFFF75 & 0x7DFF);
        n.lIlIlIlIl[33] = 0x1F ^ 0x7B;
        n.lIlIlIlIl[34] = 0x21 ^ 0x37 ^ (0x12 ^ 0x16);
        n.lIlIlIlIl[35] = 0x58 ^ 0x46 ^ (0x30 ^ 0x4D);
        n.lIlIlIlIl[36] = 0x50 ^ 0x32 ^ (0xCF ^ 0xBE);
        n.lIlIlIlIl[37] = 0xFFFFAEF8 & 0x57F7;
        n.lIlIlIlIl[38] = 0xFFFFEFBF & 0x1DCC;
        n.lIlIlIlIl[39] = -(0xFFFFF8FE & 0x3FC5) & (0xFFFFFFF3 & 0x3FCF);
        n.lIlIlIlIl[40] = -(0xFFFFAB4F & 0x56B9) & (0xFFFFEFBF & 0x1FFC);
        n.lIlIlIlIl[41] = -(0xFFFFDB4F & 0x65B7) & (0xFFFFFFDF & 0x47EF);
        n.lIlIlIlIl[42] = 0xFFFF8DCF & 0x7FBD;
        n.lIlIlIlIl[43] = -(0xFFFFEB9B & 0x3D65) & (0xFFFFBFF5 & 0x6FCE);
        n.lIlIlIlIl[44] = -(0xFFFFBACB & 0x5777) & (0xFFFFDFFA & 0x3FF7);
        n.lIlIlIlIl[45] = -(0xFFFFFCDB & 0x3326) & (0xFFFFF7FF & 0x3EFF);
        n.lIlIlIlIl[46] = -(0xFFFFBFFF & 0x7105) & (0xFFFFB7FF & 0x7FFE);
        n.lIlIlIlIl[47] = 0xFFFFDFAF & 0x2DFF;
        n.lIlIlIlIl[48] = 0xFFFFFEED & 0x7F7;
        n.lIlIlIlIl[49] = -(0xFFFFCB37 & 0x7DDA) & (0xFFFFDFF7 & 0x6FFF);
        n.lIlIlIlIl[50] = -(0xFFFFEEFB & 0x331D) & (0xFFFFFFDF & 0x2FFB);
        n.lIlIlIlIl[51] = -(0xFFFFC5A7 & 0x7B7B) & (0xFFFFDFF7 & 0x67FF);
        n.lIlIlIlIl[52] = -(0xFFFFBDFF & 0x7A55) & (0xFFFFFFFF & 0x3EDF);
        n.lIlIlIlIl[53] = -(0xFFFFF81F & 0x77E9) & (0xFFFFFDFF & 0x7F9E);
        n.lIlIlIlIl[54] = -(0xFFFFDDCB & 0x7B3D) & (0xFFFFFFFF & 0x5FBD);
        n.lIlIlIlIl[55] = 0xFFFFAFEF & 0x5D9B;
        n.lIlIlIlIl[56] = -(0xFFFFDA3F & 0x35D1) & (0xFFFFFEFD & 0x17FF);
        n.lIlIlIlIl[57] = 0xFFFFAFE7 & 0x5D9D;
        n.lIlIlIlIl[58] = 0xFFFFFFEF & 0xBFE;
        n.lIlIlIlIl[59] = 0xFFFFECEE & 0x1FBF;
        n.lIlIlIlIl[60] = 120 + 208 - 223 + 108 ^ 103 + 94 - 105 + 101;
        n.lIlIlIlIl[61] = 0x90 ^ 0xA2 ^ (0x21 ^ 6);
        n.lIlIlIlIl[62] = 0x4D ^ 0x45 ^ (0x24 ^ 0x3A);
        n.lIlIlIlIl[63] = 0xFFFFBEFF & 0x458E;
        n.lIlIlIlIl[64] = -(0xFFFFC7BC & 0x78CB) & (0xFFFFEFBF & 0x5DFF);
        n.lIlIlIlIl[65] = -(126 + 103 - 194 + 106) & (0xFFFFF7DF & 0xBBF);
        n.lIlIlIlIl[66] = -(0xFFFFBD4F & 0x77B9) & (0xFFFFFFFF & 0x37BF);
        n.lIlIlIlIl[67] = 8 + 55 - -27 + 100 ^ 35 + 146 - 63 + 51;
    }

    private static String lIIIlllIlllI(String lllIIllIlllIll, String lllIIllIllllII) {
        try {
            SecretKeySpec lllIIlllIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIllIllllII.getBytes(StandardCharsets.UTF_8)), lIlIlIlIl[16]), "DES");
            Cipher lllIIllIllllll = Cipher.getInstance("DES");
            lllIIllIllllll.init(lIlIlIlIl[3], lllIIlllIIIIII);
            return new String(lllIIllIllllll.doFinal(Base64.getDecoder().decode(lllIIllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIllIlllllI) {
            lllIIllIlllllI.printStackTrace();
            return null;
        }
    }

    @Override
    public int T() {
        try {
            n.as();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (null != null) {
            return (0x33 ^ 0x10 ^ (0x90 ^ 0x87)) & ("   ".length() ^ (0x6F ^ 0x58) ^ -" ".length());
        }
        return lIlIlIlIl[33];
    }

    private static boolean lIIIllllIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllllllII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIllllllll(int n2) {
        return n2 >= 0;
    }
}

