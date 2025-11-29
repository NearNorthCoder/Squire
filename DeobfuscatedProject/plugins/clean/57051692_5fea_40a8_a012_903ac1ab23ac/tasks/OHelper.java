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
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.AHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.EHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.FHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.GHelper;
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
implements K {
    public static  String[] cy;
    public static  int cA;
    public static  WorldPoint ct;
    public static  long cx;
    public static  WorldPoint ch;
    public static  WorldPoint cl;
    
    public static  WorldPoint cs;
    public static  WorldPoint cv;
    public static  WorldPoint cj;
    public static  int cB;
    public static  WorldPoint ck;
    public static  WorldPoint cq;
    public static  WorldArea cz;
    public static  WorldPoint cm;
    public static  WorldPoint cw;
    public static  WorldPoint cg;
    public static  WorldPoint cn;
    public static  WorldPoint cp;
    static  int cC;
    
    public static  WorldPoint cu;
    public static  WorldPoint co;
    public static  WorldPoint cr;
    public static  WorldPoint ci;

    static {
        o.lIIllIlIlIIIl();
        o.lIIllIlIlIIII();
        cg = new WorldPoint(lIllIlllIl[37], lIllIlllIl[38], lIllIlllIl[1]);
        ch = new WorldPoint(lIllIlllIl[39], lIllIlllIl[40], lIllIlllIl[1]);
        ci = new WorldPoint(lIllIlllIl[41], lIllIlllIl[42], lIllIlllIl[1]);
        cj = new WorldPoint(lIllIlllIl[43], lIllIlllIl[44], lIllIlllIl[1]);
        ck = new WorldPoint(lIllIlllIl[45], lIllIlllIl[38], lIllIlllIl[1]);
        cl = new WorldPoint(lIllIlllIl[46], lIllIlllIl[47], lIllIlllIl[1]);
        cm = new WorldPoint(lIllIlllIl[39], lIllIlllIl[40], lIllIlllIl[1]);
        cn = new WorldPoint(lIllIlllIl[48], lIllIlllIl[38], lIllIlllIl[1]);
        co = new WorldPoint(lIllIlllIl[49], lIllIlllIl[50], lIllIlllIl[1]);
        cp = new WorldPoint(lIllIlllIl[51], lIllIlllIl[42], lIllIlllIl[1]);
        cq = new WorldPoint(lIllIlllIl[49], lIllIlllIl[50], lIllIlllIl[1]);
        cr = new WorldPoint(lIllIlllIl[52], lIllIlllIl[53], lIllIlllIl[1]);
        cs = new WorldPoint(lIllIlllIl[54], lIllIlllIl[55], lIllIlllIl[1]);
        ct = new WorldPoint(lIllIlllIl[56], lIllIlllIl[57], lIllIlllIl[1]);
        cu = new WorldPoint(lIllIlllIl[39], lIllIlllIl[40], lIllIlllIl[1]);
        cv = new WorldPoint(lIllIlllIl[58], lIllIlllIl[59], lIllIlllIl[1]);
        cw = new WorldPoint(lIllIlllIl[37], lIllIlllIl[38], lIllIlllIl[1]);
        cx = System.currentTimeMillis();
        String[] stringArray = new String[lIllIlllIl[10]];
        stringArray[o.lIllIlllIl[1]] = lIllIlllII[lIllIlllIl[60]];
        stringArray[o.lIllIlllIl[0]] = lIllIlllII[lIllIlllIl[61]];
        stringArray[o.lIllIlllIl[3]] = lIllIlllII[lIllIlllIl[62]];
        cy = stringArray;
        cz = new WorldArea(lIllIlllIl[63], lIllIlllIl[64], lIllIlllIl[65], lIllIlllIl[66], lIllIlllIl[1]);
        cA = lIllIlllIl[1];
        cC = e.c(lIllIlllIl[31], lIllIlllIl[32]);
    }

    private static boolean lIIllIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllIlIlIlIl(int n2) {
        return n2 != 0;
    }

    private static int lIIllIlIlIlll(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    /*
     * WARNING - void declaration
     */
    static NPC aD() {
        WorldPoint worldPoint = cw;
        WorldPoint worldPoint2 = new WorldPoint(cw.getX() - lIllIlllIl[0], cw.getWorldY() + lIllIlllIl[0], lIllIlllIl[1]);
        WorldPoint worldPoint3 = new WorldPoint(cw.getX(), cw.getWorldY() + lIllIlllIl[0], lIllIlllIl[1]);
        WorldPoint worldPoint4 = new WorldPoint(cw.getX() + lIllIlllIl[0], cw.getWorldY() + lIllIlllIl[0], lIllIlllIl[1]);
        WorldPoint worldPoint5 = new WorldPoint(cw.getX() + lIllIlllIl[0], cw.getWorldY(), lIllIlllIl[1]);
        WorldPoint worldPoint6 = new WorldPoint(cw.getX() + lIllIlllIl[0], cw.getWorldY() - lIllIlllIl[0], lIllIlllIl[1]);
        WorldPoint worldPoint7 = new WorldPoint(cw.getX(), cw.getWorldY() - lIllIlllIl[0], lIllIlllIl[1]);
        WorldPoint worldPoint8 = new WorldPoint(cw.getX() - lIllIlllIl[0], cw.getWorldY() - lIllIlllIl[0], lIllIlllIl[1]);
        WorldPoint worldPoint9 = new WorldPoint(cw.getX() - lIllIlllIl[0], cw.getWorldY(), lIllIlllIl[1]);
        List list = NPCs.getAll(nPC -> nPC.getName().equalsIgnoreCase(lIllIlllII[lIllIlllIl[36]]));
        if (o.lIIllIlIlIlII(list)) {
            void var1;
            List<WorldPoint> list2 = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int var2 = lIllIlllIl[1];
            while (o.lIIllIlIlIIlI(var2, var1.size())) {
                void var3;
                if (o.lIIllIlIlIlIl(var3.contains(((NPC)var1.get(var2)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC)var1.get(var2);
                }
                ++var2;

                if (2 > ((0x26 ^ 0x13) & ~(0x43 ^ 0x76))) continue;
                return null;
            }
        }
        return null;
    }

    @Override
    public boolean ac() {
        return lIllIlllIl[1];
    }

        return String.valueOf(var4);
    }

    public static void aC() {
        NPC var5;
        WorldArea var6;
        if (o.lIIllIlIllIIl(o.lIIllIlIlIlll(e.a(cx), lIllIlllIl[9] + cC))) {
            if (o.lIIllIlIlIIll(Players.getLocal().getWorldLocation().equals((Object)cw) ? 1 : 0)) {
                AccBuilderShamans.c = lIllIlllII[lIllIlllIl[10]];
                if (o.lIIllIlIlIIlI(Movement.getRunEnergy(), lIllIlllIl[11]) && o.lIIllIlIlIlIl(Inventory.contains((int[])f.aU) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.aU).interact(lIllIlllII[lIllIlllIl[12]]);
                    Time.sleepTicks((int)lIllIlllIl[0]);

                }
                if (o.lIIllIlIlIIll(cz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (o.lIIllIlIllIlI(Players.getLocal().getWorldLocation().distanceTo(cv), lIllIlllIl[10])) {
                        AccBuilderShamans.c = lIllIlllII[lIllIlllIl[13]];
                        Movement.walkTo((WorldPoint)cv);

                        Time.sleepTicks((int)lIllIlllIl[0]);

                    }
                    if (o.lIIllIlIllIll(Players.getLocal().getWorldLocation().distanceTo(cv), lIllIlllIl[10])) {
                        AccBuilderShamans.c = lIllIlllII[lIllIlllIl[14]];
                        if (o.lIIllIlIlIIlI(cA, lIllIlllIl[0])) {
                            e.v();
                            cA += lIllIlllIl[0];
                        }
                        String[] stringArray = new String[lIllIlllIl[0]];
                        stringArray[o.lIllIlllIl[1]] = lIllIlllII[lIllIlllIl[15]];
                        var6 = NPCs.getNearest((String[])stringArray);
                        if (o.lIIllIlIlIlII(var6)) {
                            String[] stringArray2 = new String[lIllIlllIl[0]];
                            stringArray2[o.lIllIlllIl[1]] = lIllIlllII[lIllIlllIl[16]];
                            if (o.lIIllIlIlIlIl(var6.hasAction(stringArray2) ? 1 : 0)) {
                                var6.interact(lIllIlllII[lIllIlllIl[17]]);
                                Time.sleepTicks((int)lIllIlllIl[10]);

                            }
                            String[] stringArray3 = new String[lIllIlllIl[0]];
                            stringArray3[o.lIllIlllIl[1]] = lIllIlllII[lIllIlllIl[8]];
                            if (o.lIIllIlIlIIll(var6.hasAction(stringArray3) ? 1 : 0)) {
                                g.b(lIllIlllII[lIllIlllIl[18]], cy);
                                Time.sleepTicks((int)lIllIlllIl[0]);

                            }
                        }
                    }
                }
                if (o.lIIllIlIlIlIl(cz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)cw);

                    Time.sleepTicks((int)lIllIlllIl[0]);

                }
            }
            if (o.lIIllIlIlIlIl(Players.getLocal().getWorldLocation().equals((Object)cw) ? 1 : 0)) {
                if (o.lIIllIlIllIIl(o.lIIllIlIllIII(e.u(), 45.0))) {
                    int[] nArray = new int[lIllIlllIl[0]];
                    nArray[o.lIllIlllIl[1]] = lIllIlllIl[2];
                    if (o.lIIllIlIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIllIlllIl[0]];
                        nArray2[o.lIllIlllIl[1]] = lIllIlllIl[2];
                        Inventory.getFirst((int[])nArray2).interact(lIllIlllII[lIllIlllIl[19]]);
                        Time.sleepTicks((int)lIllIlllIl[0]);

                    }
                }
                if (o.lIIllIlIlIIll(o.aE() ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIlllII[lIllIlllIl[20]];
                    Time.sleepTicks((int)lIllIlllIl[15]);

                }
                if (o.lIIllIlIlIlIl(o.aE() ? 1 : 0)) {
                    var6 = new WorldArea(cw, lIllIlllIl[3], lIllIlllIl[3]);
                    var5 = o.aD();
                    AccBuilderShamans.c = lIllIlllII[lIllIlllIl[21]];
                    if (o.lIIllIlIlllII(Players.getLocal().getInteracting()) && o.lIIllIlIlIlII(var5) && o.lIIllIlIlIIll(var5.isDead() ? 1 : 0)) {
                        System.out.println(lIllIlllII[lIllIlllIl[22]]);
                        var5.interact(lIllIlllII[lIllIlllIl[23]]);
                        Time.sleepTicks((int)lIllIlllIl[3]);

                    }
                    Time.sleepTicks((int)lIllIlllIl[12]);

                }
            }
        }
        if (o.lIIllIlIlllIl(o.lIIllIlIlIlll(e.a(cx), lIllIlllIl[9] + cC))) {
            var6 = new WorldArea(lIllIlllIl[24], lIllIlllIl[25], lIllIlllIl[26], lIllIlllIl[27], lIllIlllIl[1]);
            var5 = new WorldPoint(lIllIlllIl[28], lIllIlllIl[29], lIllIlllIl[1]);
            if (o.lIIllIlIlIlIl(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lIIllIlIllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var5), lIllIlllIl[13])) {
                Movement.walkTo((WorldPoint)var5);

            }
            AccBuilderShamans.c = lIllIlllII[lIllIlllIl[30]];
            Movement.walkTo((WorldPoint)cm);

            Time.sleepTicks((int)lIllIlllIl[0]);

            if (o.lIIllIlIllIll(Players.getLocal().getWorldLocation().distanceTo(cm), lIllIlllIl[3])) {
                cx = System.currentTimeMillis();
                cC = e.c(lIllIlllIl[31], lIllIlllIl[32]);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static boolean aE() {
        WorldArea worldArea = new WorldArea(cw, lIllIlllIl[10], lIllIlllIl[10]);
        List list = Players.getAll();
        if (o.lIIllIlIlIIll(list.isEmpty() ? 1 : 0) && o.lIIllIlIllIlI(list.size(), lIllIlllIl[0])) {
            void var7;
            int var8 = lIllIlllIl[1];
            while (o.lIIllIlIlIIlI(var8, var7.size())) {
                void var9;
                if (o.lIIllIlIlIlIl(((Player)var7.get(var8)).equals(Players.getLocal()) ? 1 : 0)) {

                    if ((23 + 98 - 109 + 137 ^ 51 + 76 - 67 + 84) == 0) {
                        return ((0xFA ^ 0xB6 ^ (0xA3 ^ 0xC5)) & (26 + 62 - -14 + 69 ^ 119 + 88 - 98 + 20 ^ -1)) != 0;
                    }
                } else if (o.lIIllIlIlIlIl(var9.contains(((Player)var7.get(var8)).getWorldLocation()) ? 1 : 0)) {
                    return lIllIlllIl[0];
                }
                ++var8;

                if (3 >= ((164 + 194 - 294 + 161 ^ 134 + 155 - 154 + 32) & (212 + 217 - 297 + 97 ^ 72 + 107 - 76 + 60 ^ -1))) continue;
                return ((11 + 56 - -15 + 76 ^ 96 + 138 - 83 + 10) & (7 ^ 9 ^ (0x78 ^ 0x49) ^ -1)) != 0;
            }
        }
        return lIllIlllIl[1];
    }

    private static boolean lIIllIlIlllII(Object object) {
        return object == null;
    }

    @Override
    public int ad() {
        try {
            o.aB();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 <= 0) {
            return (0x55 ^ 0x50) & ~(0xBE ^ 0xBB);
        }
        return lIllIlllIl[33];
    }

    private static boolean lIIllIlIllIlI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public String ae() {
        return lIllIlllII[lIllIlllIl[34]];
    }

    private static void aB() {
        if (o.lIIllIlIlIIlI(cB, lIllIlllIl[0])) {
            cx = System.currentTimeMillis();
            System.out.println(lIllIlllII[lIllIlllIl[1]]);
            cB += lIllIlllIl[0];
        }
        int[] nArray = new int[lIllIlllIl[0]];
        nArray[o.lIllIlllIl[1]] = lIllIlllIl[2];
        if (o.lIIllIlIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            BankLocation var10 = BankLocation.getNearest();
            if (o.lIIllIlIlIlII(var10) && o.lIIllIlIlIIll(var10.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIllIlllII[lIllIlllIl[0]];
                a.a(var10);
            }
            if (o.lIIllIlIlIlII(var10) && o.lIIllIlIlIlIl(var10.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIllIlllII[lIllIlllIl[3]];
                if (o.lIIllIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIlllIl[4]);

                }
                if (o.lIIllIlIlIlIl(Bank.isOpen() ? 1 : 0)) {
                    if (o.lIIllIlIlIllI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lIllIlllIl[0]);

                    }
                    a.a(lIllIlllIl[2], lIllIlllIl[5]);
                    a.a(lIllIlllIl[6], lIllIlllIl[0]);
                    a.a(lIllIlllIl[7], lIllIlllIl[8]);
                }
            }
        }
        int[] nArray2 = new int[lIllIlllIl[0]];
        nArray2[o.lIllIlllIl[1]] = lIllIlllIl[2];
        if (o.lIIllIlIlIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            o.aC();
        }
    }

    private static boolean lIIllIlIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIlIllIIl(int n2) {
        return n2 < 0;
    }

    private static boolean lIIllIlIlllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIllIlIllIll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean af() {
        int n2;
        if (o.lIIllIlIlllll(Skills.getLevel((Skill)Skill.RANGED), lIllIlllIl[35]) && o.lIIllIlIlllll(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlllIl[35])) {
            n2 = lIllIlllIl[0];

            if (3 < -1) {
                return false;
            }
        } else {
            n2 = lIllIlllIl[1];
        }
        return n2 != 0;
    }

    private static int lIIllIlIllIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIllIlIlllIl(int n2) {
        return n2 >= 0;
    }

    private static void lIIllIlIlIIII() {
        lIllIlllII = new String[lIllIlllIl[67]];
        o.lIllIlllII[o.lIllIlllIl[1]] = "reset aggro timer";
        o.lIllIlllII[o.lIllIlllIl[0]] = "Navigating to bank";
        o.lIllIlllII[o.lIllIlllIl[3]] = "Handling banking";
        o.lIllIlllII[o.lIllIlllIl[10]] = "Nav to sand crabs";
        o.lIllIlllII[o.lIllIlllIl[12]] = "Drink";
        o.lIllIlllII[o.lIllIlllIl[13]] = "Nav to veos";
        o.lIllIlllII[o.lIllIlllIl[14]] = "Handle veos chat";
        o.lIllIlllII[o.lIllIlllIl[15]] = "Veos";
        o.lIllIlllII[o.lIllIlllIl[16]] = "Port Piscarilius";
        o.lIllIlllII[o.lIllIlllIl[17]] = "Port Piscarilius";
        o.lIllIlllII[o.lIllIlllIl[8]] = "Port Piscarilius";
        o.lIllIlllII[o.lIllIlllIl[18]] = "Veos";
        o.lIllIlllII[o.lIllIlllIl[19]] = "Eat";
        o.lIllIlllII[o.lIllIlllIl[20]] = "Afking in spot";
        o.lIllIlllII[o.lIllIlllIl[21]] = "Being crashed";
        o.lIllIlllII[o.lIllIlllIl[22]] = "Attacking crashed";
        o.lIllIlllII[o.lIllIlllIl[23]] = "Attack";
        o.lIllIlllII[o.lIllIlllIl[30]] = "Resetting";
        o.lIllIlllII[o.lIllIlllIl[34]] = "Sand Crabs";
        o.lIllIlllII[o.lIllIlllIl[36]] = "sand crab";
        o.lIllIlllII[o.lIllIlllIl[60]] = "That's great, can you take me there please?";
        o.lIllIlllII[o.lIllIlllIl[61]] = "Can you take me to Great Kourend?";
        o.lIllIlllII[o.lIllIlllIl[62]] = "Goodbye.";
    }

    private static boolean lIIllIlIllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIllIlIlIlII(Object object) {
        return object != null;
    }

    private static boolean lIIllIlIlIllI(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void aF() {
        void var11;
        int n2 = e.c(lIllIlllIl[0], lIllIlllIl[13]);
        if (o.lIIllIlIllllI(n2, lIllIlllIl[0])) {
            cw = cg;
            cm = ch;
        }
        if (o.lIIllIlIllllI((int)var11, lIllIlllIl[3])) {
            cw = cn;
            cm = co;
        }
        if (o.lIIllIlIllllI((int)var11, lIllIlllIl[10])) {
            cw = cp;
            cm = cq;
        }
        if (o.lIIllIlIllllI((int)var11, lIllIlllIl[12])) {
            cw = cr;
            cm = cs;
        }
        if (o.lIIllIlIllllI((int)var11, lIllIlllIl[13])) {
            cw = ct;
            cm = cu;
        }
    }
}

