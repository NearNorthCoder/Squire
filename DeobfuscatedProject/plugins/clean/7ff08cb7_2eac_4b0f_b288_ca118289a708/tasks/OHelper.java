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
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.GHelper;
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

public class OHelper
implements ab {
    
    public static  WorldPoint cv;
    public static  WorldPoint cD;
    public static  WorldPoint cC;
    public static  WorldArea cH;
    public static  WorldPoint cr;
    public static  WorldPoint ct;
    static  int cK;
    public static  WorldPoint cu;
    public static  WorldPoint cw;
    public static  WorldPoint cs;
    public static  WorldPoint cq;
    public static  long cF;
    public static  int cI;
    public static  WorldPoint cE;
    public static  WorldPoint cy;
    public static  String[] cG;
    public static  WorldPoint cx;
    public static  WorldPoint co;
    public static  WorldPoint cB;
    
    public static  int cJ;
    public static  WorldPoint cz;
    public static  WorldPoint cp;
    public static  WorldPoint cA;

    private static int lIllllIlllIl(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    @Override
    public boolean ah() {
        int n2;
        if (o.lIlllllIIlll(Skills.getLevel((Skill)Skill.RANGED), lllIIIIlI[35]) && o.lIlllllIIlll(Skills.getLevel((Skill)Skill.DEFENCE), lllIIIIlI[35])) {
            n2 = lllIIIIlI[0];

            if (1 != 1) {
                return false;
            }
        } else {
            n2 = lllIIIIlI[1];
        }
        return n2 != 0;
    }

    private static boolean lIllllIllIlI(Object object) {
        return object != null;
    }

    static {
        o.lIllllIlIlll();
        o.lIllllIlIllI();
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
        String[] stringArray = new String[lllIIIIlI[10]];
        stringArray[o.lllIIIIlI[1]] = lllIIIIIl[lllIIIIlI[60]];
        stringArray[o.lllIIIIlI[0]] = lllIIIIIl[lllIIIIlI[61]];
        stringArray[o.lllIIIIlI[3]] = lllIIIIIl[lllIIIIlI[62]];
        cG = stringArray;
        cH = new WorldArea(lllIIIIlI[63], lllIIIIlI[64], lllIIIIlI[65], lllIIIIlI[66], lllIIIIlI[1]);
        cI = lllIIIIlI[1];
        cK = e.c(lllIIIIlI[31], lllIIIIlI[32]);
    }

    private static boolean lIllllIllIIl(int n2) {
        return n2 == 0;
    }

    private static int lIllllIllllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean aG() {
        WorldArea worldArea = new WorldArea(cE, lllIIIIlI[10], lllIIIIlI[10]);
        List list = Players.getAll();
        if (o.lIllllIllIIl(list.isEmpty() ? 1 : 0) && o.lIlllllIIIII(list.size(), lllIIIIlI[0])) {
            void lIIIIIIIIlIlll;
            int lIIIIIIIIlIllI = lllIIIIlI[1];
            while (o.lIllllIllIII(lIIIIIIIIlIllI, lIIIIIIIIlIlll.size())) {
                void lIIIIIIIIllIII;
                if (o.lIllllIllIll(((Player)lIIIIIIIIlIlll.get(lIIIIIIIIlIllI)).equals(Players.getLocal()) ? 1 : 0)) {

                    if (((0x1D ^ 4 ^ 3) & (54 + 151 - 137 + 87 ^ 26 + 114 - 117 + 106 ^ -1)) != 0) {
                        return ((0xA0 ^ 0x9A ^ (0x27 ^ 0x47)) & (49 + 138 - 54 + 22 ^ 116 + 160 - 168 + 85 ^ -1)) != 0;
                    }
                } else if (o.lIllllIllIll(lIIIIIIIIllIII.contains(((Player)lIIIIIIIIlIlll.get(lIIIIIIIIlIllI)).getWorldLocation()) ? 1 : 0)) {
                    return lllIIIIlI[0];
                }
                ++lIIIIIIIIlIllI;

                return false;
            }
        }
        return lllIIIIlI[1];
    }

    private static boolean lIllllIlllII(int n2) {
        return n2 > 0;
    }

        return String.valueOf(llllllllllIII);
    }

    private static void aD() {
        if (o.lIllllIllIII(cJ, lllIIIIlI[0])) {
            cF = System.currentTimeMillis();
            System.out.println(lllIIIIIl[lllIIIIlI[1]]);
            cJ += lllIIIIlI[0];
        }
        int[] nArray = new int[lllIIIIlI[0]];
        nArray[o.lllIIIIlI[1]] = lllIIIIlI[2];
        if (o.lIllllIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            BankLocation lIIIIIIIlllIII = BankLocation.getNearest();
            if (o.lIllllIllIlI(lIIIIIIIlllIII) && o.lIllllIllIIl(lIIIIIIIlllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[0]];
                a.a(lIIIIIIIlllIII);
            }
            if (o.lIllllIllIlI(lIIIIIIIlllIII) && o.lIllllIllIll(lIIIIIIIlllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[3]];
                if (o.lIllllIllIIl(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIIIlI[4]);

                }
                if (o.lIllllIllIll(Bank.isOpen() ? 1 : 0)) {
                    if (o.lIllllIlllII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lllIIIIlI[0]);

                    }
                    a.a(lllIIIIlI[2], lllIIIIlI[5]);
                    a.a(lllIIIIlI[6], lllIIIIlI[0]);
                    a.a(lllIIIIlI[7], lllIIIIlI[8]);
                }
            }
        }
        int[] nArray2 = new int[lllIIIIlI[0]];
        nArray2[o.lllIIIIlI[1]] = lllIIIIlI[2];
        if (o.lIllllIllIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            o.aE();
        }
    }

    /*
     * WARNING - void declaration
     */
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
        List list = NPCs.getAll(nPC -> nPC.getName().equalsIgnoreCase(lllIIIIIl[lllIIIIlI[36]]));
        if (o.lIllllIllIlI(list)) {
            void lIIIIIIIIllllI;
            List<WorldPoint> list2 = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int lIIIIIIIIlllII = lllIIIIlI[1];
            while (o.lIllllIllIII(lIIIIIIIIlllII, lIIIIIIIIllllI.size())) {
                void lIIIIIIIIlllIl;
                if (o.lIllllIllIll(lIIIIIIIIlllIl.contains(((NPC)lIIIIIIIIllllI.get(lIIIIIIIIlllII)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC)lIIIIIIIIllllI.get(lIIIIIIIIlllII);
                }
                ++lIIIIIIIIlllII;

                return null;
            }
        }
        return null;
    }

    private static boolean lIllllIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllllIlllll(int n2) {
        return n2 < 0;
    }

    private static boolean lIlllllIIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlllllIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int af() {
        try {
            o.aD();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0xF ^ 0x5A) & ~(0x7F ^ 0x2A)) != 0) {
            return (0xF0 ^ 0xBD) & ~(0x6F ^ 0x22);
        }
        return lllIIIIlI[33];
    }

    private static boolean lIlllllIIIlI(Object object) {
        return object == null;
    }

    private static boolean lIllllIllIll(int n2) {
        return n2 != 0;
    }

    private static void lIllllIlIllI() {
        lllIIIIIl = new String[lllIIIIlI[67]];
        o.lllIIIIIl[o.lllIIIIlI[1]] = "reset aggro timer";
        o.lllIIIIIl[o.lllIIIIlI[0]] = "Navigating to bank";
        o.lllIIIIIl[o.lllIIIIlI[3]] = "Handling banking";
        o.lllIIIIIl[o.lllIIIIlI[10]] = "Nav to sand crabs";
        o.lllIIIIIl[o.lllIIIIlI[12]] = "Drink";
        o.lllIIIIIl[o.lllIIIIlI[13]] = "Nav to veos";
        o.lllIIIIIl[o.lllIIIIlI[14]] = "Handle veos chat";
        o.lllIIIIIl[o.lllIIIIlI[15]] = "Veos";
        o.lllIIIIIl[o.lllIIIIlI[16]] = "Port Piscarilius";
        o.lllIIIIIl[o.lllIIIIlI[17]] = "Port Piscarilius";
        o.lllIIIIIl[o.lllIIIIlI[8]] = "Port Piscarilius";
        o.lllIIIIIl[o.lllIIIIlI[18]] = "Veos";
        o.lllIIIIIl[o.lllIIIIlI[19]] = "Eat";
        o.lllIIIIIl[o.lllIIIIlI[20]] = "Afking in spot";
        o.lllIIIIIl[o.lllIIIIlI[21]] = "Being crashed";
        o.lllIIIIIl[o.lllIIIIlI[22]] = "Attacking crashed";
        o.lllIIIIIl[o.lllIIIIlI[23]] = "Attack";
        o.lllIIIIIl[o.lllIIIIlI[30]] = "Resetting";
        o.lllIIIIIl[o.lllIIIIlI[34]] = "Sand Crabs";
        o.lllIIIIIl[o.lllIIIIlI[36]] = "sand crab";
        o.lllIIIIIl[o.lllIIIIlI[60]] = "That's great, can you take me there please?";
        o.lllIIIIIl[o.lllIIIIlI[61]] = "Can you take me to Great Kourend?";
        o.lllIIIIIl[o.lllIIIIlI[62]] = "Goodbye.";
    }

    private static boolean lIlllllIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public String ag() {
        return lllIIIIIl[lllIIIIlI[34]];
    }

    public static void aE() {
        NPC lIIIIIIIllIlII;
        WorldArea lIIIIIIIllIlIl;
        if (o.lIllllIlllll(o.lIllllIlllIl(e.a(cF), lllIIIIlI[9] + cK))) {
            if (o.lIllllIllIIl(Players.getLocal().getWorldLocation().equals((Object)cE) ? 1 : 0)) {
                AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[10]];
                if (o.lIllllIllIII(Movement.getRunEnergy(), lllIIIIlI[11]) && o.lIllllIllIll(Inventory.contains((int[])f.bc) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.bc).interact(lllIIIIIl[lllIIIIlI[12]]);
                    Time.sleepTicks((int)lllIIIIlI[0]);

                }
                if (o.lIllllIllIIl(cH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (o.lIlllllIIIII(Players.getLocal().getWorldLocation().distanceTo(cD), lllIIIIlI[10])) {
                        AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[13]];
                        Movement.walkTo((WorldPoint)cD);

                        Time.sleepTicks((int)lllIIIIlI[0]);

                    }
                    if (o.lIlllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(cD), lllIIIIlI[10])) {
                        AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[14]];
                        if (o.lIllllIllIII(cI, lllIIIIlI[0])) {
                            e.x();
                            cI += lllIIIIlI[0];
                        }
                        String[] stringArray = new String[lllIIIIlI[0]];
                        stringArray[o.lllIIIIlI[1]] = lllIIIIIl[lllIIIIlI[15]];
                        lIIIIIIIllIlIl = NPCs.getNearest((String[])stringArray);
                        if (o.lIllllIllIlI(lIIIIIIIllIlIl)) {
                            String[] stringArray2 = new String[lllIIIIlI[0]];
                            stringArray2[o.lllIIIIlI[1]] = lllIIIIIl[lllIIIIlI[16]];
                            if (o.lIllllIllIll(lIIIIIIIllIlIl.hasAction(stringArray2) ? 1 : 0)) {
                                lIIIIIIIllIlIl.interact(lllIIIIIl[lllIIIIlI[17]]);
                                Time.sleepTicks((int)lllIIIIlI[10]);

                            }
                            String[] stringArray3 = new String[lllIIIIlI[0]];
                            stringArray3[o.lllIIIIlI[1]] = lllIIIIIl[lllIIIIlI[8]];
                            if (o.lIllllIllIIl(lIIIIIIIllIlIl.hasAction(stringArray3) ? 1 : 0)) {
                                g.b(lllIIIIIl[lllIIIIlI[18]], cG);
                                Time.sleepTicks((int)lllIIIIlI[0]);

                            }
                        }
                    }
                }
                if (o.lIllllIllIll(cH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)cE);

                    Time.sleepTicks((int)lllIIIIlI[0]);

                }
            }
            if (o.lIllllIllIll(Players.getLocal().getWorldLocation().equals((Object)cE) ? 1 : 0)) {
                if (o.lIllllIlllll(o.lIllllIllllI(e.w(), 45.0))) {
                    int[] nArray = new int[lllIIIIlI[0]];
                    nArray[o.lllIIIIlI[1]] = lllIIIIlI[2];
                    if (o.lIllllIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lllIIIIlI[0]];
                        nArray2[o.lllIIIIlI[1]] = lllIIIIlI[2];
                        Inventory.getFirst((int[])nArray2).interact(lllIIIIIl[lllIIIIlI[19]]);
                        Time.sleepTicks((int)lllIIIIlI[0]);

                    }
                }
                if (o.lIllllIllIIl(o.aG() ? 1 : 0)) {
                    AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[20]];
                    Time.sleepTicks((int)lllIIIIlI[15]);

                }
                if (o.lIllllIllIll(o.aG() ? 1 : 0)) {
                    lIIIIIIIllIlIl = new WorldArea(cE, lllIIIIlI[3], lllIIIIlI[3]);
                    lIIIIIIIllIlII = o.aF();
                    AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[21]];
                    if (o.lIlllllIIIlI(Players.getLocal().getInteracting()) && o.lIllllIllIlI(lIIIIIIIllIlII) && o.lIllllIllIIl(lIIIIIIIllIlII.isDead() ? 1 : 0)) {
                        System.out.println(lllIIIIIl[lllIIIIlI[22]]);
                        lIIIIIIIllIlII.interact(lllIIIIIl[lllIIIIlI[23]]);
                        Time.sleepTicks((int)lllIIIIlI[3]);

                    }
                    Time.sleepTicks((int)lllIIIIlI[12]);

                }
            }
        }
        if (o.lIlllllIIIll(o.lIllllIlllIl(e.a(cF), lllIIIIlI[9] + cK))) {
            lIIIIIIIllIlIl = new WorldArea(lllIIIIlI[24], lllIIIIlI[25], lllIIIIlI[26], lllIIIIlI[27], lllIIIIlI[1]);
            lIIIIIIIllIlII = new WorldPoint(lllIIIIlI[28], lllIIIIlI[29], lllIIIIlI[1]);
            if (o.lIllllIllIll(lIIIIIIIllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lIlllllIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIIIIIllIlII), lllIIIIlI[13])) {
                Movement.walkTo((WorldPoint)lIIIIIIIllIlII);

            }
            AccBuilderGWD.c = lllIIIIIl[lllIIIIlI[30]];
            Movement.walkTo((WorldPoint)cu);

            Time.sleepTicks((int)lllIIIIlI[0]);

            if (o.lIlllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(cu), lllIIIIlI[3])) {
                cF = System.currentTimeMillis();
                cK = e.c(lllIIIIlI[31], lllIIIIlI[32]);
            }
        }
    }

    private static boolean lIlllllIIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlllllIIIll(int n2) {
        return n2 >= 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void aH() {
        void lIIIIIIIIlIlII;
        int n2 = e.c(lllIIIIlI[0], lllIIIIlI[13]);
        if (o.lIlllllIIlIl(n2, lllIIIIlI[0])) {
            cE = co;
            cu = cp;
        }
        if (o.lIlllllIIlIl((int)lIIIIIIIIlIlII, lllIIIIlI[3])) {
            cE = cv;
            cu = cw;
        }
        if (o.lIlllllIIlIl((int)lIIIIIIIIlIlII, lllIIIIlI[10])) {
            cE = cx;
            cu = cy;
        }
        if (o.lIlllllIIlIl((int)lIIIIIIIIlIlII, lllIIIIlI[12])) {
            cE = cz;
            cu = cA;
        }
        if (o.lIlllllIIlIl((int)lIIIIIIIIlIlII, lllIIIIlI[13])) {
            cE = cB;
            cu = cC;
        }
    }

    @Override
    public boolean ae() {
        return lllIIIIlI[1];
    }
}

