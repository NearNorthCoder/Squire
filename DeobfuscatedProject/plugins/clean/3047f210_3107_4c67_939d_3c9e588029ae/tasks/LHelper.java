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
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.FHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.GHelper;
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

public class LHelper
implements S {
    public static  WorldPoint bN;
    public static  WorldPoint bK;
    public static  WorldPoint bz;
    public static  WorldPoint bC;
    public static  WorldPoint bA;
    public static  WorldPoint bL;
    public static  WorldPoint bE;
    public static  WorldPoint bJ;
    public static  int bT;
    public static  int bS;
    public static  long bP;
    static  int bU;
    public static  WorldPoint bD;
    public static  WorldPoint bH;
    
    public static  WorldPoint bI;
    public static  WorldArea bR;
    public static  WorldPoint bO;
    
    public static  WorldPoint bB;
    public static  WorldPoint bG;
    public static  WorldPoint by;
    public static  String[] bQ;
    public static  WorldPoint bF;
    public static  WorldPoint bM;

    /*
     * WARNING - void declaration
     */
    public static boolean ar() {
        WorldArea worldArea = new WorldArea(bO, lIIIIIIIlII[10], lIIIIIIIlII[10]);
        List list = Players.getAll();
        if (l.llIllIlIIIIll(list.isEmpty() ? 1 : 0) && l.llIllIlIIlIlI(list.size(), lIIIIIIIlII[0])) {
            void var1;
            int var2 = lIIIIIIIlII[1];
            while (l.llIllIlIIIIlI(var2, var1.size())) {
                void var3;
                if (l.llIllIlIIIlIl(((Player)var1.get(var2)).equals(Players.getLocal()) ? 1 : 0)) {

                    if (3 >= (0xF6 ^ 0xB3 ^ (0x3D ^ 0x7C))) {
                        return ((0xBF ^ 0x9B ^ (0xD1 ^ 0xA2)) & (0x7B ^ 0x6D ^ (0x74 ^ 0x35) ^ -1)) != 0;
                    }
                } else if (l.llIllIlIIIlIl(var3.contains(((Player)var1.get(var2)).getWorldLocation()) ? 1 : 0)) {
                    return lIIIIIIIlII[0];
                }
                ++var2;

                if (((0x7F ^ 0x61) & ~(0x57 ^ 0x49)) > -1) continue;
                return false;
            }
        }
        return lIIIIIIIlII[1];
    }

    public static void ap() {
        NPC var4;
        WorldArea var5;
        if (l.llIllIlIIlIIl(l.llIllIlIIIlll(e.a(bP), lIIIIIIIlII[9] + bU))) {
            if (l.llIllIlIIIIll(Players.getLocal().getWorldLocation().equals((Object)bO) ? 1 : 0)) {
                AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[10]];
                if (l.llIllIlIIIIlI(Movement.getRunEnergy(), lIIIIIIIlII[11]) && l.llIllIlIIIlIl(Inventory.contains((int[])f.aU) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.aU).interact(lIIIIIIIIll[lIIIIIIIlII[12]]);
                    Time.sleepTicks((int)lIIIIIIIlII[0]);

                }
                if (l.llIllIlIIIIll(bR.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (l.llIllIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo(bN), lIIIIIIIlII[10])) {
                        AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[13]];
                        Movement.walkTo((WorldPoint)bN);

                        Time.sleepTicks((int)lIIIIIIIlII[0]);

                    }
                    if (l.llIllIlIIlIll(Players.getLocal().getWorldLocation().distanceTo(bN), lIIIIIIIlII[10])) {
                        AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[14]];
                        if (l.llIllIlIIIIlI(bS, lIIIIIIIlII[0])) {
                            e.v();
                            bS += lIIIIIIIlII[0];
                        }
                        String[] stringArray = new String[lIIIIIIIlII[0]];
                        stringArray[l.lIIIIIIIlII[1]] = lIIIIIIIIll[lIIIIIIIlII[15]];
                        var5 = NPCs.getNearest((String[])stringArray);
                        if (l.llIllIlIIIlII(var5)) {
                            String[] stringArray2 = new String[lIIIIIIIlII[0]];
                            stringArray2[l.lIIIIIIIlII[1]] = lIIIIIIIIll[lIIIIIIIlII[16]];
                            if (l.llIllIlIIIlIl(var5.hasAction(stringArray2) ? 1 : 0)) {
                                var5.interact(lIIIIIIIIll[lIIIIIIIlII[17]]);
                                Time.sleepTicks((int)lIIIIIIIlII[10]);

                            }
                            String[] stringArray3 = new String[lIIIIIIIlII[0]];
                            stringArray3[l.lIIIIIIIlII[1]] = lIIIIIIIIll[lIIIIIIIlII[8]];
                            if (l.llIllIlIIIIll(var5.hasAction(stringArray3) ? 1 : 0)) {
                                g.b(lIIIIIIIIll[lIIIIIIIlII[18]], bQ);
                                Time.sleepTicks((int)lIIIIIIIlII[0]);

                            }
                        }
                    }
                }
                if (l.llIllIlIIIlIl(bR.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)bO);

                    Time.sleepTicks((int)lIIIIIIIlII[0]);

                }
            }
            if (l.llIllIlIIIlIl(Players.getLocal().getWorldLocation().equals((Object)bO) ? 1 : 0)) {
                if (l.llIllIlIIlIIl(l.llIllIlIIlIII(e.u(), 45.0))) {
                    int[] nArray = new int[lIIIIIIIlII[0]];
                    nArray[l.lIIIIIIIlII[1]] = lIIIIIIIlII[2];
                    if (l.llIllIlIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIIIIIIlII[0]];
                        nArray2[l.lIIIIIIIlII[1]] = lIIIIIIIlII[2];
                        Inventory.getFirst((int[])nArray2).interact(lIIIIIIIIll[lIIIIIIIlII[19]]);
                        Time.sleepTicks((int)lIIIIIIIlII[0]);

                    }
                }
                if (l.llIllIlIIIIll(l.ar() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[20]];
                    Time.sleepTicks((int)lIIIIIIIlII[15]);

                }
                if (l.llIllIlIIIlIl(l.ar() ? 1 : 0)) {
                    var5 = new WorldArea(bO, lIIIIIIIlII[3], lIIIIIIIlII[3]);
                    var4 = l.aq();
                    AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[21]];
                    if (l.llIllIlIIllII(Players.getLocal().getInteracting()) && l.llIllIlIIIlII(var4) && l.llIllIlIIIIll(var4.isDead() ? 1 : 0)) {
                        System.out.println(lIIIIIIIIll[lIIIIIIIlII[22]]);
                        var4.interact(lIIIIIIIIll[lIIIIIIIlII[23]]);
                        Time.sleepTicks((int)lIIIIIIIlII[3]);

                    }
                    Time.sleepTicks((int)lIIIIIIIlII[12]);

                }
            }
        }
        if (l.llIllIlIIllIl(l.llIllIlIIIlll(e.a(bP), lIIIIIIIlII[9] + bU))) {
            var5 = new WorldArea(lIIIIIIIlII[24], lIIIIIIIlII[25], lIIIIIIIlII[26], lIIIIIIIlII[27], lIIIIIIIlII[1]);
            var4 = new WorldPoint(lIIIIIIIlII[28], lIIIIIIIlII[29], lIIIIIIIlII[1]);
            if (l.llIllIlIIIlIl(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && l.llIllIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var4), lIIIIIIIlII[13])) {
                Movement.walkTo((WorldPoint)var4);

            }
            AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[30]];
            Movement.walkTo((WorldPoint)bE);

            Time.sleepTicks((int)lIIIIIIIlII[0]);

            if (l.llIllIlIIlIll(Players.getLocal().getWorldLocation().distanceTo(bE), lIIIIIIIlII[3])) {
                bP = System.currentTimeMillis();
                bU = e.c(lIIIIIIIlII[31], lIIIIIIIlII[32]);
            }
        }
    }

    private static boolean llIllIlIIllII(Object object) {
        return object == null;
    }

        return String.valueOf(var6);
    }

    private static int llIllIlIIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIllIlIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean V() {
        int n2;
        if (l.llIllIlIIllll(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIIlII[35]) && l.llIllIlIIllll(Skills.getLevel((Skill)Skill.DEFENCE), lIIIIIIIlII[35])) {
            n2 = lIIIIIIIlII[0];

        } else {
            n2 = lIIIIIIIlII[1];
        }
        return n2 != 0;
    }

    private static int llIllIlIIIlll(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean llIllIlIIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIlIIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean S() {
        return lIIIIIIIlII[1];
    }

    private static boolean llIllIlIIllll(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
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
        List list = NPCs.getAll(nPC -> nPC.getName().equalsIgnoreCase(lIIIIIIIIll[lIIIIIIIlII[36]]));
        if (l.llIllIlIIIlII(list)) {
            void var7;
            List<WorldPoint> list2 = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int var8 = lIIIIIIIlII[1];
            while (l.llIllIlIIIIlI(var8, var7.size())) {
                void var9;
                if (l.llIllIlIIIlIl(var9.contains(((NPC)var7.get(var8)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC)var7.get(var8);
                }
                ++var8;

                if (2 == 2) continue;
                return null;
            }
        }
        return null;
    }

    private static boolean llIllIlIIIlII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public static void as() {
        void var10;
        int n2 = e.c(lIIIIIIIlII[0], lIIIIIIIlII[13]);
        if (l.llIllIlIIlllI(n2, lIIIIIIIlII[0])) {
            bO = by;
            bE = bz;
        }
        if (l.llIllIlIIlllI((int)var10, lIIIIIIIlII[3])) {
            bO = bF;
            bE = bG;
        }
        if (l.llIllIlIIlllI((int)var10, lIIIIIIIlII[10])) {
            bO = bH;
            bE = bI;
        }
        if (l.llIllIlIIlllI((int)var10, lIIIIIIIlII[12])) {
            bO = bJ;
            bE = bK;
        }
        if (l.llIllIlIIlllI((int)var10, lIIIIIIIlII[13])) {
            bO = bL;
            bE = bM;
        }
    }

    private static void ao() {
        if (l.llIllIlIIIIlI(bT, lIIIIIIIlII[0])) {
            bP = System.currentTimeMillis();
            System.out.println(lIIIIIIIIll[lIIIIIIIlII[1]]);
            bT += lIIIIIIIlII[0];
        }
        int[] nArray = new int[lIIIIIIIlII[0]];
        nArray[l.lIIIIIIIlII[1]] = lIIIIIIIlII[2];
        if (l.llIllIlIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            BankLocation var11 = BankLocation.getNearest();
            if (l.llIllIlIIIlII(var11) && l.llIllIlIIIIll(var11.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[0]];
                a.a(var11);
            }
            if (l.llIllIlIIIlII(var11) && l.llIllIlIIIlIl(var11.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = lIIIIIIIIll[lIIIIIIIlII[3]];
                if (l.llIllIlIIIIll(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIIlII[4]);

                }
                if (l.llIllIlIIIlIl(Bank.isOpen() ? 1 : 0)) {
                    if (l.llIllIlIIIllI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lIIIIIIIlII[0]);

                    }
                    a.a(lIIIIIIIlII[2], lIIIIIIIlII[5]);
                    a.a(lIIIIIIIlII[6], lIIIIIIIlII[0]);
                    a.a(lIIIIIIIlII[7], lIIIIIIIlII[8]);
                }
            }
        }
        int[] nArray2 = new int[lIIIIIIIlII[0]];
        nArray2[l.lIIIIIIIlII[1]] = lIIIIIIIlII[2];
        if (l.llIllIlIIIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            l.ap();
        }
    }

    private static boolean llIllIlIIlllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIllIlIIllIl(int n2) {
        return n2 >= 0;
    }

    private static boolean llIllIlIIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIllIlIIIlIl(int n2) {
        return n2 != 0;
    }

    @Override
    public int T() {
        try {
            l.ao();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 <= ((0x2F ^ 0x1C) & ~(0x73 ^ 0x40))) {
            return (0x7A ^ 0x44) & ~(0x5F ^ 0x61);
        }
        return lIIIIIIIlII[33];
    }

    @Override
    public String U() {
        return lIIIIIIIIll[lIIIIIIIlII[34]];
    }

    private static boolean llIllIlIIIllI(int n2) {
        return n2 > 0;
    }

    private static boolean llIllIlIIlIIl(int n2) {
        return n2 < 0;
    }

    static {
        l.llIllIlIIIIIl();
        l.llIllIlIIIIII();
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
        String[] stringArray = new String[lIIIIIIIlII[10]];
        stringArray[l.lIIIIIIIlII[1]] = lIIIIIIIIll[lIIIIIIIlII[60]];
        stringArray[l.lIIIIIIIlII[0]] = lIIIIIIIIll[lIIIIIIIlII[61]];
        stringArray[l.lIIIIIIIlII[3]] = lIIIIIIIIll[lIIIIIIIlII[62]];
        bQ = stringArray;
        bR = new WorldArea(lIIIIIIIlII[63], lIIIIIIIlII[64], lIIIIIIIlII[65], lIIIIIIIlII[66], lIIIIIIIlII[1]);
        bS = lIIIIIIIlII[1];
        bU = e.c(lIIIIIIIlII[31], lIIIIIIIlII[32]);
    }

    private static void llIllIlIIIIII() {
        lIIIIIIIIll = new String[lIIIIIIIlII[67]];
        l.lIIIIIIIIll[l.lIIIIIIIlII[1]] = "reset aggro timer";
        l.lIIIIIIIIll[l.lIIIIIIIlII[0]] = "Navigating to bank";
        l.lIIIIIIIIll[l.lIIIIIIIlII[3]] = "Handling banking";
        l.lIIIIIIIIll[l.lIIIIIIIlII[10]] = "Nav to sand crabs";
        l.lIIIIIIIIll[l.lIIIIIIIlII[12]] = "Drink";
        l.lIIIIIIIIll[l.lIIIIIIIlII[13]] = "Nav to veos";
        l.lIIIIIIIIll[l.lIIIIIIIlII[14]] = "Handle veos chat";
        l.lIIIIIIIIll[l.lIIIIIIIlII[15]] = "Veos";
        l.lIIIIIIIIll[l.lIIIIIIIlII[16]] = "Port Piscarilius";
        l.lIIIIIIIIll[l.lIIIIIIIlII[17]] = "Port Piscarilius";
        l.lIIIIIIIIll[l.lIIIIIIIlII[8]] = "Port Piscarilius";
        l.lIIIIIIIIll[l.lIIIIIIIlII[18]] = "Veos";
        l.lIIIIIIIIll[l.lIIIIIIIlII[19]] = "Eat";
        l.lIIIIIIIIll[l.lIIIIIIIlII[20]] = "Afking in spot";
        l.lIIIIIIIIll[l.lIIIIIIIlII[21]] = "Being crashed";
        l.lIIIIIIIIll[l.lIIIIIIIlII[22]] = "Attacking crashed";
        l.lIIIIIIIIll[l.lIIIIIIIlII[23]] = "Attack";
        l.lIIIIIIIIll[l.lIIIIIIIlII[30]] = "Resetting";
        l.lIIIIIIIIll[l.lIIIIIIIlII[34]] = "Sand Crabs";
        l.lIIIIIIIIll[l.lIIIIIIIlII[36]] = "sand crab";
        l.lIIIIIIIIll[l.lIIIIIIIlII[60]] = "That's great, can you take me there please?";
        l.lIIIIIIIIll[l.lIIIIIIIlII[61]] = "Can you take me to Great Kourend?";
        l.lIIIIIIIIll[l.lIIIIIIIlII[62]] = "Goodbye.";
    }
}

