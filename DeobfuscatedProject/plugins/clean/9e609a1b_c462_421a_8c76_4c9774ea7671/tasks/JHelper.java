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
package gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.AHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.EHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.FHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.GHelper;
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

public class JHelper
implements M {
    public static  WorldPoint bR;
    static  int ca;
    public static  WorldPoint bM;
    public static  int bY;
    public static  WorldPoint bN;
    public static  WorldPoint bS;
    public static  WorldPoint bO;
    public static  WorldPoint bH;
    public static  WorldPoint bF;
    public static  long bV;
    public static  WorldPoint bJ;
    public static  WorldPoint bG;
    public static  WorldPoint bU;
    public static  WorldPoint bP;
    public static  int bZ;
    public static  String[] bW;
    
    public static  WorldPoint bE;
    public static  WorldPoint bQ;
    public static  WorldPoint bI;
    public static  WorldPoint bT;
    public static  WorldPoint bK;
    public static  WorldArea bX;
    public static  WorldPoint bL;

    private static boolean lIlIIlIlllIIIII(int n2) {
        return n2 >= 0;
    }

    private static boolean lIlIIlIllIlllll(Object object) {
        return object == null;
    }

    private static boolean lIlIIlIllIllIIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIlIllIlllII(int n2) {
        return n2 < 0;
    }

    private static boolean lIlIIlIlllIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        j.lIlIIlIllIlIlII();
        j.lIlIIlIllIlIIll();
        bE = new WorldPoint(lIIIllllIlIIl[37], lIIIllllIlIIl[38], lIIIllllIlIIl[1]);
        bF = new WorldPoint(lIIIllllIlIIl[39], lIIIllllIlIIl[40], lIIIllllIlIIl[1]);
        bG = new WorldPoint(lIIIllllIlIIl[41], lIIIllllIlIIl[42], lIIIllllIlIIl[1]);
        bH = new WorldPoint(lIIIllllIlIIl[43], lIIIllllIlIIl[44], lIIIllllIlIIl[1]);
        bI = new WorldPoint(lIIIllllIlIIl[45], lIIIllllIlIIl[38], lIIIllllIlIIl[1]);
        bJ = new WorldPoint(lIIIllllIlIIl[46], lIIIllllIlIIl[47], lIIIllllIlIIl[1]);
        bK = new WorldPoint(lIIIllllIlIIl[39], lIIIllllIlIIl[40], lIIIllllIlIIl[1]);
        bL = new WorldPoint(lIIIllllIlIIl[48], lIIIllllIlIIl[38], lIIIllllIlIIl[1]);
        bM = new WorldPoint(lIIIllllIlIIl[49], lIIIllllIlIIl[50], lIIIllllIlIIl[1]);
        bN = new WorldPoint(lIIIllllIlIIl[51], lIIIllllIlIIl[42], lIIIllllIlIIl[1]);
        bO = new WorldPoint(lIIIllllIlIIl[49], lIIIllllIlIIl[50], lIIIllllIlIIl[1]);
        bP = new WorldPoint(lIIIllllIlIIl[52], lIIIllllIlIIl[53], lIIIllllIlIIl[1]);
        bQ = new WorldPoint(lIIIllllIlIIl[54], lIIIllllIlIIl[55], lIIIllllIlIIl[1]);
        bR = new WorldPoint(lIIIllllIlIIl[56], lIIIllllIlIIl[57], lIIIllllIlIIl[1]);
        bS = new WorldPoint(lIIIllllIlIIl[39], lIIIllllIlIIl[40], lIIIllllIlIIl[1]);
        bT = new WorldPoint(lIIIllllIlIIl[58], lIIIllllIlIIl[59], lIIIllllIlIIl[1]);
        bU = new WorldPoint(lIIIllllIlIIl[37], lIIIllllIlIIl[38], lIIIllllIlIIl[1]);
        bV = System.currentTimeMillis();
        String[] stringArray = new String[lIIIllllIlIIl[10]];
        stringArray[j.lIIIllllIlIIl[1]] = lIIIllllIlIII[lIIIllllIlIIl[60]];
        stringArray[j.lIIIllllIlIIl[0]] = lIIIllllIlIII[lIIIllllIlIIl[61]];
        stringArray[j.lIIIllllIlIIl[3]] = lIIIllllIlIII[lIIIllllIlIIl[62]];
        bW = stringArray;
        bX = new WorldArea(lIIIllllIlIIl[63], lIIIllllIlIIl[64], lIIIllllIlIIl[65], lIIIllllIlIIl[66], lIIIllllIlIIl[1]);
        bY = lIIIllllIlIIl[1];
        ca = e.c(lIIIllllIlIIl[31], lIIIllllIlIIl[32]);
    }

    private static boolean lIlIIlIllIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIllIlIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlIllIlllIl(int n2, int n3) {
        return n2 > n3;
    }

    public static void al() {
        NPC var1;
        WorldArea var2;
        if (j.lIlIIlIllIlllII(j.lIlIIlIllIllIlI(e.a(bV), lIIIllllIlIIl[9] + ca))) {
            if (j.lIlIIlIllIlIllI(Players.getLocal().getWorldLocation().equals((Object)bU) ? 1 : 0)) {
                AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[10]];
                if (j.lIlIIlIllIlIlIl(Movement.getRunEnergy(), lIIIllllIlIIl[11]) && j.lIlIIlIllIllIII(Inventory.contains((int[])f.ba) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.ba).interact(lIIIllllIlIII[lIIIllllIlIIl[12]]);
                    Time.sleepTicks((int)lIIIllllIlIIl[0]);

                }
                if (j.lIlIIlIllIlIllI(bX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (j.lIlIIlIllIlllIl(Players.getLocal().getWorldLocation().distanceTo(bT), lIIIllllIlIIl[10])) {
                        AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[13]];
                        Movement.walkTo((WorldPoint)bT);

                        Time.sleepTicks((int)lIIIllllIlIIl[0]);

                    }
                    if (j.lIlIIlIllIllllI(Players.getLocal().getWorldLocation().distanceTo(bT), lIIIllllIlIIl[10])) {
                        AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[14]];
                        if (j.lIlIIlIllIlIlIl(bY, lIIIllllIlIIl[0])) {
                            e.w();
                            bY += lIIIllllIlIIl[0];
                        }
                        String[] stringArray = new String[lIIIllllIlIIl[0]];
                        stringArray[j.lIIIllllIlIIl[1]] = lIIIllllIlIII[lIIIllllIlIIl[15]];
                        var2 = NPCs.getNearest((String[])stringArray);
                        if (j.lIlIIlIllIlIlll(var2)) {
                            String[] stringArray2 = new String[lIIIllllIlIIl[0]];
                            stringArray2[j.lIIIllllIlIIl[1]] = lIIIllllIlIII[lIIIllllIlIIl[16]];
                            if (j.lIlIIlIllIllIII(var2.hasAction(stringArray2) ? 1 : 0)) {
                                var2.interact(lIIIllllIlIII[lIIIllllIlIIl[17]]);
                                Time.sleepTicks((int)lIIIllllIlIIl[10]);

                            }
                            String[] stringArray3 = new String[lIIIllllIlIIl[0]];
                            stringArray3[j.lIIIllllIlIIl[1]] = lIIIllllIlIII[lIIIllllIlIIl[8]];
                            if (j.lIlIIlIllIlIllI(var2.hasAction(stringArray3) ? 1 : 0)) {
                                g.b(lIIIllllIlIII[lIIIllllIlIIl[18]], bW);
                                Time.sleepTicks((int)lIIIllllIlIIl[0]);

                            }
                        }
                    }
                }
                if (j.lIlIIlIllIllIII(bX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)bU);

                    Time.sleepTicks((int)lIIIllllIlIIl[0]);

                }
            }
            if (j.lIlIIlIllIllIII(Players.getLocal().getWorldLocation().equals((Object)bU) ? 1 : 0)) {
                if (j.lIlIIlIllIlllII(j.lIlIIlIllIllIll(e.v(), 45.0))) {
                    int[] nArray = new int[lIIIllllIlIIl[0]];
                    nArray[j.lIIIllllIlIIl[1]] = lIIIllllIlIIl[2];
                    if (j.lIlIIlIllIllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIIllllIlIIl[0]];
                        nArray2[j.lIIIllllIlIIl[1]] = lIIIllllIlIIl[2];
                        Inventory.getFirst((int[])nArray2).interact(lIIIllllIlIII[lIIIllllIlIIl[19]]);
                        Time.sleepTicks((int)lIIIllllIlIIl[0]);

                    }
                }
                if (j.lIlIIlIllIlIllI(j.an() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[20]];
                    Time.sleepTicks((int)lIIIllllIlIIl[15]);

                }
                if (j.lIlIIlIllIllIII(j.an() ? 1 : 0)) {
                    var2 = new WorldArea(bU, lIIIllllIlIIl[3], lIIIllllIlIIl[3]);
                    var1 = j.am();
                    AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[21]];
                    if (j.lIlIIlIllIlllll(Players.getLocal().getInteracting()) && j.lIlIIlIllIlIlll(var1) && j.lIlIIlIllIlIllI(var1.isDead() ? 1 : 0)) {
                        System.out.println(lIIIllllIlIII[lIIIllllIlIIl[22]]);
                        var1.interact(lIIIllllIlIII[lIIIllllIlIIl[23]]);
                        Time.sleepTicks((int)lIIIllllIlIIl[3]);

                    }
                    Time.sleepTicks((int)lIIIllllIlIIl[12]);

                }
            }
        }
        if (j.lIlIIlIlllIIIII(j.lIlIIlIllIllIlI(e.a(bV), lIIIllllIlIIl[9] + ca))) {
            var2 = new WorldArea(lIIIllllIlIIl[24], lIIIllllIlIIl[25], lIIIllllIlIIl[26], lIIIllllIlIIl[27], lIIIllllIlIIl[1]);
            var1 = new WorldPoint(lIIIllllIlIIl[28], lIIIllllIlIIl[29], lIIIllllIlIIl[1]);
            if (j.lIlIIlIllIllIII(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && j.lIlIIlIllIlllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var1), lIIIllllIlIIl[13])) {
                Movement.walkTo((WorldPoint)var1);

            }
            AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[30]];
            Movement.walkTo((WorldPoint)bK);

            Time.sleepTicks((int)lIIIllllIlIIl[0]);

            if (j.lIlIIlIllIllllI(Players.getLocal().getWorldLocation().distanceTo(bK), lIIIllllIlIIl[3])) {
                bV = System.currentTimeMillis();
                ca = e.c(lIIIllllIlIIl[31], lIIIllllIlIIl[32]);
            }
        }
    }

    private static boolean lIlIIlIllIlIlll(Object object) {
        return object != null;
    }

    private static void ak() {
        if (j.lIlIIlIllIlIlIl(bZ, lIIIllllIlIIl[0])) {
            bV = System.currentTimeMillis();
            System.out.println(lIIIllllIlIII[lIIIllllIlIIl[1]]);
            bZ += lIIIllllIlIIl[0];
        }
        int[] nArray = new int[lIIIllllIlIIl[0]];
        nArray[j.lIIIllllIlIIl[1]] = lIIIllllIlIIl[2];
        if (j.lIlIIlIllIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            BankLocation var3 = BankLocation.getNearest();
            if (j.lIlIIlIllIlIlll(var3) && j.lIlIIlIllIlIllI(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[0]];
                a.a(var3);
            }
            if (j.lIlIIlIllIlIlll(var3) && j.lIlIIlIllIllIII(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[3]];
                if (j.lIlIIlIllIlIllI(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllIlIIl[4]);

                }
                if (j.lIlIIlIllIllIII(Bank.isOpen() ? 1 : 0)) {
                    if (j.lIlIIlIllIllIIl(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lIIIllllIlIIl[0]);

                    }
                    a.a(lIIIllllIlIIl[2], lIIIllllIlIIl[5]);
                    a.a(lIIIllllIlIIl[6], lIIIllllIlIIl[0]);
                    a.a(lIIIllllIlIIl[7], lIIIllllIlIIl[8]);
                }
            }
        }
        int[] nArray2 = new int[lIIIllllIlIIl[0]];
        nArray2[j.lIIIllllIlIIl[1]] = lIIIllllIlIIl[2];
        if (j.lIlIIlIllIllIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            j.al();
        }
    }

    private static boolean lIlIIlIlllIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIIlIllIlIIll() {
        lIIIllllIlIII = new String[lIIIllllIlIIl[67]];
        j.lIIIllllIlIII[j.lIIIllllIlIIl[1]] = "reset aggro timer";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[0]] = "Navigating to bank";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[3]] = "Handling banking";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[10]] = "Nav to sand crabs";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[12]] = "Drink";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[13]] = "Nav to veos";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[14]] = "Handle veos chat";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[15]] = "Veos";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[16]] = "Port Piscarilius";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[17]] = "Port Piscarilius";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[8]] = "Port Piscarilius";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[18]] = "Veos";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[19]] = "Eat";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[20]] = "Afking in spot";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[21]] = "Being crashed";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[22]] = "Attacking crashed";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[23]] = "Attack";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[30]] = "Resetting";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[34]] = "Sand Crabs";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[36]] = "sand crab";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[60]] = "That's great, can you take me there please?";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[61]] = "Can you take me to Great Kourend?";
        j.lIIIllllIlIII[j.lIIIllllIlIIl[62]] = "Goodbye.";
    }

    private static int lIlIIlIllIllIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean aa() {
        int n2;
        if (j.lIlIIlIlllIIIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIllllIlIIl[35]) && j.lIlIIlIlllIIIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIIIllllIlIIl[35])) {
            n2 = lIIIllllIlIIl[0];

            if (-1 > ((132 + 181 - 205 + 135 ^ 121 + 40 - 20 + 45) & (0x75 ^ 0x37 ^ (0xBF ^ 0xB4) ^ -1))) {
                return ((85 + 4 - -115 + 1 ^ 49 + 123 - 55 + 13) & (0xED ^ 0x8E ^ (0xF ^ 0x23) ^ -1)) != 0;
            }
        } else {
            n2 = lIIIllllIlIIl[1];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean an() {
        WorldArea worldArea = new WorldArea(bU, lIIIllllIlIIl[10], lIIIllllIlIIl[10]);
        List list = Players.getAll();
        if (j.lIlIIlIllIlIllI(list.isEmpty() ? 1 : 0) && j.lIlIIlIllIlllIl(list.size(), lIIIllllIlIIl[0])) {
            void var4;
            int var5 = lIIIllllIlIIl[1];
            while (j.lIlIIlIllIlIlIl(var5, var4.size())) {
                void var6;
                if (j.lIlIIlIllIllIII(((Player)var4.get(var5)).equals(Players.getLocal()) ? 1 : 0)) {

                    if (3 != 3) {
                        return ((102 + 14 - -66 + 72 ^ 35 + 149 - 66 + 60) & (0x43 ^ 0x1E ^ (0x4F ^ 0x5E) ^ -1)) != 0;
                    }
                } else if (j.lIlIIlIllIllIII(var6.contains(((Player)var4.get(var5)).getWorldLocation()) ? 1 : 0)) {
                    return lIIIllllIlIIl[0];
                }
                ++var5;

                if (-3 <= 0) continue;
                return false;
            }
        }
        return lIIIllllIlIIl[1];
    }

        return String.valueOf(var7);
    }

    private static boolean lIlIIlIllIllIII(int n2) {
        return n2 != 0;
    }

    @Override
    public String Z() {
        return lIIIllllIlIII[lIIIllllIlIIl[34]];
    }

    private static int lIlIIlIllIllIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    @Override
    public boolean X() {
        return lIIIllllIlIIl[1];
    }

    /*
     * WARNING - void declaration
     */
    static NPC am() {
        WorldPoint worldPoint = bU;
        WorldPoint worldPoint2 = new WorldPoint(bU.getX() - lIIIllllIlIIl[0], bU.getWorldY() + lIIIllllIlIIl[0], lIIIllllIlIIl[1]);
        WorldPoint worldPoint3 = new WorldPoint(bU.getX(), bU.getWorldY() + lIIIllllIlIIl[0], lIIIllllIlIIl[1]);
        WorldPoint worldPoint4 = new WorldPoint(bU.getX() + lIIIllllIlIIl[0], bU.getWorldY() + lIIIllllIlIIl[0], lIIIllllIlIIl[1]);
        WorldPoint worldPoint5 = new WorldPoint(bU.getX() + lIIIllllIlIIl[0], bU.getWorldY(), lIIIllllIlIIl[1]);
        WorldPoint worldPoint6 = new WorldPoint(bU.getX() + lIIIllllIlIIl[0], bU.getWorldY() - lIIIllllIlIIl[0], lIIIllllIlIIl[1]);
        WorldPoint worldPoint7 = new WorldPoint(bU.getX(), bU.getWorldY() - lIIIllllIlIIl[0], lIIIllllIlIIl[1]);
        WorldPoint worldPoint8 = new WorldPoint(bU.getX() - lIIIllllIlIIl[0], bU.getWorldY() - lIIIllllIlIIl[0], lIIIllllIlIIl[1]);
        WorldPoint worldPoint9 = new WorldPoint(bU.getX() - lIIIllllIlIIl[0], bU.getWorldY(), lIIIllllIlIIl[1]);
        List list = NPCs.getAll(nPC -> nPC.getName().equalsIgnoreCase(lIIIllllIlIII[lIIIllllIlIIl[36]]));
        if (j.lIlIIlIllIlIlll(list)) {
            void var8;
            List<WorldPoint> list2 = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int var9 = lIIIllllIlIIl[1];
            while (j.lIlIIlIllIlIlIl(var9, var8.size())) {
                void var10;
                if (j.lIlIIlIllIllIII(var10.contains(((NPC)var8.get(var9)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC)var8.get(var9);
                }
                ++var9;

                if (((0x29 ^ 0x6C) & ~(0x7C ^ 0x39)) >= 0) continue;
                return null;
            }
        }
        return null;
    }

    private static boolean lIlIIlIllIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void ao() {
        void var11;
        int n2 = e.c(lIIIllllIlIIl[0], lIIIllllIlIIl[13]);
        if (j.lIlIIlIlllIIIIl(n2, lIIIllllIlIIl[0])) {
            bU = bE;
            bK = bF;
        }
        if (j.lIlIIlIlllIIIIl((int)var11, lIIIllllIlIIl[3])) {
            bU = bL;
            bK = bM;
        }
        if (j.lIlIIlIlllIIIIl((int)var11, lIIIllllIlIIl[10])) {
            bU = bN;
            bK = bO;
        }
        if (j.lIlIIlIlllIIIIl((int)var11, lIIIllllIlIIl[12])) {
            bU = bP;
            bK = bQ;
        }
        if (j.lIlIIlIlllIIIIl((int)var11, lIIIllllIlIIl[13])) {
            bU = bR;
            bK = bS;
        }
    }

    @Override
    public int Y() {
        try {
            j.ak();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x33 ^ 0x37) < 3) {
            return (0x76 ^ 0x16) & ~(0xC2 ^ 0xA2);
        }
        return lIIIllllIlIIl[33];
    }

}

