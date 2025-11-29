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
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import gg.squire.account.AccBuilderSotf;
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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;

public class OHelper
implements ac {
    public static  WorldPoint cx;
    public static  WorldPoint cw;
    public static  WorldPoint cC;
    public static  WorldPoint cm;
    public static  WorldPoint cp;
    public static  WorldPoint cv;
    public static  WorldPoint cq;
    public static  WorldPoint cn;
    
    public static  WorldPoint cs;
    public static  String[] cE;
    public static  WorldPoint cr;
    public static  int cH;
    
    public static  WorldPoint cB;
    public static  int cG;
    public static  WorldPoint co;
    public static  WorldPoint cA;
    public static  WorldPoint cu;
    static  int cI;
    public static  long cD;
    public static  WorldPoint ct;
    public static  WorldPoint cy;
    public static  WorldPoint cz;
    public static  WorldArea cF;

    private static boolean lIlllIIlIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlllIIIlIlll(Object object) {
        return object != null;
    }

    private static boolean lIlllIIIlllll(Object object) {
        return object == null;
    }

    private static boolean lIlllIIlIIIII(int n2) {
        return n2 >= 0;
    }

    @Override
    public boolean ah() {
        int n2;
        if (o.lIlllIIlIIIlI(Skills.getLevel((Skill)Skill.RANGED), llIlllIIIl[35]) && o.lIlllIIlIIIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlllIIIl[35])) {
            n2 = llIlllIIIl[0];

        } else {
            n2 = llIlllIIIl[1];
        }
        return n2 != 0;
    }

    @Override
    public String ag() {
        return llIllIllll[llIlllIIIl[34]];
    }

    private static int lIlllIIIllIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static void aD() {
        if (o.lIlllIIIlIlIl(cH, llIlllIIIl[0])) {
            cD = System.currentTimeMillis();
            System.out.println(llIllIllll[llIlllIIIl[1]]);
            cH += llIlllIIIl[0];
        }
        int[] nArray = new int[llIlllIIIl[0]];
        nArray[o.llIlllIIIl[1]] = llIlllIIIl[2];
        if (o.lIlllIIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            BankLocation var1 = BankLocation.getNearest();
            if (o.lIlllIIIlIlll(var1) && o.lIlllIIIlIllI(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllIllll[llIlllIIIl[0]];
                a.a(var1);
            }
            if (o.lIlllIIIlIlll(var1) && o.lIlllIIIllIII(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllIllll[llIlllIIIl[3]];
                if (o.lIlllIIIlIllI(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)llIlllIIIl[4]);

                }
                if (o.lIlllIIIllIII(Bank.isOpen() ? 1 : 0)) {
                    if (o.lIlllIIIllIIl(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)llIlllIIIl[0]);

                    }
                    a.a(llIlllIIIl[2], llIlllIIIl[5]);
                    a.a(llIlllIIIl[6], llIlllIIIl[0]);
                    a.a(llIlllIIIl[7], llIlllIIIl[8]);
                }
            }
        }
        int[] nArray2 = new int[llIlllIIIl[0]];
        nArray2[o.llIlllIIIl[1]] = llIlllIIIl[2];
        if (o.lIlllIIIllIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            o.aE();
        }
    }

    @Override
    public int af() {
        try {
            o.aD();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0xBF ^ 0x9E ^ (0xF ^ 0x2A)) < 0) {
            return (0xC ^ 0x56 ^ (0x6E ^ 0x1E)) & (17 + 44 - -65 + 25 ^ 72 + 79 - 112 + 150 ^ -1);
        }
        return llIlllIIIl[33];
    }

    /*
     * WARNING - void declaration
     */
    public static void aH() {
        void var2;
        int n2 = e.c(llIlllIIIl[0], llIlllIIIl[13]);
        if (o.lIlllIIlIIIIl(n2, llIlllIIIl[0])) {
            cC = cm;
            cs = cn;
        }
        if (o.lIlllIIlIIIIl((int)var2, llIlllIIIl[3])) {
            cC = ct;
            cs = cu;
        }
        if (o.lIlllIIlIIIIl((int)var2, llIlllIIIl[10])) {
            cC = cv;
            cs = cw;
        }
        if (o.lIlllIIlIIIIl((int)var2, llIlllIIIl[12])) {
            cC = cx;
            cs = cy;
        }
        if (o.lIlllIIlIIIIl((int)var2, llIlllIIIl[13])) {
            cC = cz;
            cs = cA;
        }
    }

    private static boolean lIlllIIlIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ae() {
        return llIlllIIIl[1];
    }

    private static boolean lIlllIIIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIlllIIIlIIll() {
        llIllIllll = new String[llIlllIIIl[67]];
        o.llIllIllll[o.llIlllIIIl[1]] = "reset aggro timer";
        o.llIllIllll[o.llIlllIIIl[0]] = "Navigating to bank";
        o.llIllIllll[o.llIlllIIIl[3]] = "Handling banking";
        o.llIllIllll[o.llIlllIIIl[10]] = "Nav to sand crabs";
        o.llIllIllll[o.llIlllIIIl[12]] = "Drink";
        o.llIllIllll[o.llIlllIIIl[13]] = "Nav to veos";
        o.llIllIllll[o.llIlllIIIl[14]] = "Handle veos chat";
        o.llIllIllll[o.llIlllIIIl[15]] = "Veos";
        o.llIllIllll[o.llIlllIIIl[16]] = "Port Piscarilius";
        o.llIllIllll[o.llIlllIIIl[17]] = "Port Piscarilius";
        o.llIllIllll[o.llIlllIIIl[8]] = "Port Piscarilius";
        o.llIllIllll[o.llIlllIIIl[18]] = "Veos";
        o.llIllIllll[o.llIlllIIIl[19]] = "Eat";
        o.llIllIllll[o.llIlllIIIl[20]] = "Afking in spot";
        o.llIllIllll[o.llIlllIIIl[21]] = "Being crashed";
        o.llIllIllll[o.llIlllIIIl[22]] = "Attacking crashed";
        o.llIllIllll[o.llIlllIIIl[23]] = "Attack";
        o.llIllIllll[o.llIlllIIIl[30]] = "Resetting";
        o.llIllIllll[o.llIlllIIIl[34]] = "Sand Crabs";
        o.llIllIllll[o.llIlllIIIl[36]] = "sand crab";
        o.llIllIllll[o.llIlllIIIl[60]] = "That's great, can you take me there please?";
        o.llIllIllll[o.llIlllIIIl[61]] = "Can you take me to Great Kourend?";
        o.llIllIllll[o.llIlllIIIl[62]] = "Goodbye.";
    }

    /*
     * WARNING - void declaration
     */
    public static boolean aG() {
        WorldArea worldArea = new WorldArea(cC, llIlllIIIl[10], llIlllIIIl[10]);
        List list = Players.getAll();
        if (o.lIlllIIIlIllI(list.isEmpty() ? 1 : 0) && o.lIlllIIIlllIl(list.size(), llIlllIIIl[0])) {
            void var3;
            int var4 = llIlllIIIl[1];
            while (o.lIlllIIIlIlIl(var4, var3.size())) {
                void var5;
                if (o.lIlllIIIllIII(((Player)var3.get(var4)).equals(Players.getLocal()) ? 1 : 0)) {

                    if (((0xB ^ 0x4F ^ (0x42 ^ 0x56)) & (1 ^ (0x72 ^ 0x23) ^ -1)) >= (0xBE ^ 0x99 ^ (0x85 ^ 0xA6))) {
                        return ((138 + 83 - 161 + 95 ^ 81 + 143 - 73 + 36) & (0x7E ^ 0x3C ^ (0x42 ^ 0x20) ^ -1)) != 0;
                    }
                } else if (o.lIlllIIIllIII(var5.contains(((Player)var3.get(var4)).getWorldLocation()) ? 1 : 0)) {
                    return llIlllIIIl[0];
                }
                ++var4;

                return false;
            }
        }
        return llIlllIIIl[1];
    }

    private static boolean lIlllIIIllIIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIlllIIIlllIl(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(var6);
    }

    private static int lIlllIIIllIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlllIIIlllII(int n2) {
        return n2 < 0;
    }

    public static void aE() {
        NPC var7;
        WorldArea var8;
        if (o.lIlllIIIlllII(o.lIlllIIIllIlI(e.a(cD), llIlllIIIl[9] + cI))) {
            if (o.lIlllIIIlIllI(Players.getLocal().getWorldLocation().equals((Object)cC) ? 1 : 0)) {
                AccBuilderSotf.c = llIllIllll[llIlllIIIl[10]];
                if (o.lIlllIIIlIlIl(Movement.getRunEnergy(), llIlllIIIl[11]) && o.lIlllIIIllIII(Inventory.contains((int[])f.ba) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.ba).interact(llIllIllll[llIlllIIIl[12]]);
                    Time.sleepTicks((int)llIlllIIIl[0]);

                }
                if (o.lIlllIIIlIllI(cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (o.lIlllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cB), llIlllIIIl[10])) {
                        AccBuilderSotf.c = llIllIllll[llIlllIIIl[13]];
                        Movement.walkTo((WorldPoint)cB);

                        Time.sleepTicks((int)llIlllIIIl[0]);

                    }
                    if (o.lIlllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(cB), llIlllIIIl[10])) {
                        AccBuilderSotf.c = llIllIllll[llIlllIIIl[14]];
                        if (o.lIlllIIIlIlIl(cG, llIlllIIIl[0])) {
                            e.x();
                            cG += llIlllIIIl[0];
                        }
                        String[] stringArray = new String[llIlllIIIl[0]];
                        stringArray[o.llIlllIIIl[1]] = llIllIllll[llIlllIIIl[15]];
                        var8 = NPCs.getNearest((String[])stringArray);
                        if (o.lIlllIIIlIlll(var8)) {
                            String[] stringArray2 = new String[llIlllIIIl[0]];
                            stringArray2[o.llIlllIIIl[1]] = llIllIllll[llIlllIIIl[16]];
                            if (o.lIlllIIIllIII(var8.hasAction(stringArray2) ? 1 : 0)) {
                                var8.interact(llIllIllll[llIlllIIIl[17]]);
                                Time.sleepTicks((int)llIlllIIIl[10]);

                            }
                            String[] stringArray3 = new String[llIlllIIIl[0]];
                            stringArray3[o.llIlllIIIl[1]] = llIllIllll[llIlllIIIl[8]];
                            if (o.lIlllIIIlIllI(var8.hasAction(stringArray3) ? 1 : 0)) {
                                g.b(llIllIllll[llIlllIIIl[18]], cE);
                                Time.sleepTicks((int)llIlllIIIl[0]);

                            }
                        }
                    }
                }
                if (o.lIlllIIIllIII(cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)cC);

                    Time.sleepTicks((int)llIlllIIIl[0]);

                }
            }
            if (o.lIlllIIIllIII(Players.getLocal().getWorldLocation().equals((Object)cC) ? 1 : 0)) {
                if (o.lIlllIIIlllII(o.lIlllIIIllIll(e.w(), 45.0))) {
                    int[] nArray = new int[llIlllIIIl[0]];
                    nArray[o.llIlllIIIl[1]] = llIlllIIIl[2];
                    if (o.lIlllIIIllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[llIlllIIIl[0]];
                        nArray2[o.llIlllIIIl[1]] = llIlllIIIl[2];
                        Inventory.getFirst((int[])nArray2).interact(llIllIllll[llIlllIIIl[19]]);
                        Time.sleepTicks((int)llIlllIIIl[0]);

                    }
                }
                if (o.lIlllIIIlIllI(o.aG() ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIllll[llIlllIIIl[20]];
                    Time.sleepTicks((int)llIlllIIIl[15]);

                }
                if (o.lIlllIIIllIII(o.aG() ? 1 : 0)) {
                    var8 = new WorldArea(cC, llIlllIIIl[3], llIlllIIIl[3]);
                    var7 = o.aF();
                    AccBuilderSotf.c = llIllIllll[llIlllIIIl[21]];
                    if (o.lIlllIIIlllll(Players.getLocal().getInteracting()) && o.lIlllIIIlIlll(var7) && o.lIlllIIIlIllI(var7.isDead() ? 1 : 0)) {
                        System.out.println(llIllIllll[llIlllIIIl[22]]);
                        var7.interact(llIllIllll[llIlllIIIl[23]]);
                        Time.sleepTicks((int)llIlllIIIl[3]);

                    }
                    Time.sleepTicks((int)llIlllIIIl[12]);

                }
            }
        }
        if (o.lIlllIIlIIIII(o.lIlllIIIllIlI(e.a(cD), llIlllIIIl[9] + cI))) {
            var8 = new WorldArea(llIlllIIIl[24], llIlllIIIl[25], llIlllIIIl[26], llIlllIIIl[27], llIlllIIIl[1]);
            var7 = new WorldPoint(llIlllIIIl[28], llIlllIIIl[29], llIlllIIIl[1]);
            if (o.lIlllIIIllIII(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lIlllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var7), llIlllIIIl[13])) {
                Movement.walkTo((WorldPoint)var7);

            }
            AccBuilderSotf.c = llIllIllll[llIlllIIIl[30]];
            Movement.walkTo((WorldPoint)cs);

            Time.sleepTicks((int)llIlllIIIl[0]);

            if (o.lIlllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(cs), llIlllIIIl[3])) {
                cD = System.currentTimeMillis();
                cI = e.c(llIlllIIIl[31], llIlllIIIl[32]);
            }
        }
    }

    private static boolean lIlllIIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllIIIllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIIIlIllI(int n2) {
        return n2 == 0;
    }

    static {
        o.lIlllIIIlIlII();
        o.lIlllIIIlIIll();
        cm = new WorldPoint(llIlllIIIl[37], llIlllIIIl[38], llIlllIIIl[1]);
        cn = new WorldPoint(llIlllIIIl[39], llIlllIIIl[40], llIlllIIIl[1]);
        co = new WorldPoint(llIlllIIIl[41], llIlllIIIl[42], llIlllIIIl[1]);
        cp = new WorldPoint(llIlllIIIl[43], llIlllIIIl[44], llIlllIIIl[1]);
        cq = new WorldPoint(llIlllIIIl[45], llIlllIIIl[38], llIlllIIIl[1]);
        cr = new WorldPoint(llIlllIIIl[46], llIlllIIIl[47], llIlllIIIl[1]);
        cs = new WorldPoint(llIlllIIIl[39], llIlllIIIl[40], llIlllIIIl[1]);
        ct = new WorldPoint(llIlllIIIl[48], llIlllIIIl[38], llIlllIIIl[1]);
        cu = new WorldPoint(llIlllIIIl[49], llIlllIIIl[50], llIlllIIIl[1]);
        cv = new WorldPoint(llIlllIIIl[51], llIlllIIIl[42], llIlllIIIl[1]);
        cw = new WorldPoint(llIlllIIIl[49], llIlllIIIl[50], llIlllIIIl[1]);
        cx = new WorldPoint(llIlllIIIl[52], llIlllIIIl[53], llIlllIIIl[1]);
        cy = new WorldPoint(llIlllIIIl[54], llIlllIIIl[55], llIlllIIIl[1]);
        cz = new WorldPoint(llIlllIIIl[56], llIlllIIIl[57], llIlllIIIl[1]);
        cA = new WorldPoint(llIlllIIIl[39], llIlllIIIl[40], llIlllIIIl[1]);
        cB = new WorldPoint(llIlllIIIl[58], llIlllIIIl[59], llIlllIIIl[1]);
        cC = new WorldPoint(llIlllIIIl[37], llIlllIIIl[38], llIlllIIIl[1]);
        cD = System.currentTimeMillis();
        String[] stringArray = new String[llIlllIIIl[10]];
        stringArray[o.llIlllIIIl[1]] = llIllIllll[llIlllIIIl[60]];
        stringArray[o.llIlllIIIl[0]] = llIllIllll[llIlllIIIl[61]];
        stringArray[o.llIlllIIIl[3]] = llIllIllll[llIlllIIIl[62]];
        cE = stringArray;
        cF = new WorldArea(llIlllIIIl[63], llIlllIIIl[64], llIlllIIIl[65], llIlllIIIl[66], llIlllIIIl[1]);
        cG = llIlllIIIl[1];
        cI = e.c(llIlllIIIl[31], llIlllIIIl[32]);
    }

    /*
     * WARNING - void declaration
     */
    static NPC aF() {
        WorldPoint worldPoint = cC;
        WorldPoint worldPoint2 = new WorldPoint(cC.getX() - llIlllIIIl[0], cC.getWorldY() + llIlllIIIl[0], llIlllIIIl[1]);
        WorldPoint worldPoint3 = new WorldPoint(cC.getX(), cC.getWorldY() + llIlllIIIl[0], llIlllIIIl[1]);
        WorldPoint worldPoint4 = new WorldPoint(cC.getX() + llIlllIIIl[0], cC.getWorldY() + llIlllIIIl[0], llIlllIIIl[1]);
        WorldPoint worldPoint5 = new WorldPoint(cC.getX() + llIlllIIIl[0], cC.getWorldY(), llIlllIIIl[1]);
        WorldPoint worldPoint6 = new WorldPoint(cC.getX() + llIlllIIIl[0], cC.getWorldY() - llIlllIIIl[0], llIlllIIIl[1]);
        WorldPoint worldPoint7 = new WorldPoint(cC.getX(), cC.getWorldY() - llIlllIIIl[0], llIlllIIIl[1]);
        WorldPoint worldPoint8 = new WorldPoint(cC.getX() - llIlllIIIl[0], cC.getWorldY() - llIlllIIIl[0], llIlllIIIl[1]);
        WorldPoint worldPoint9 = new WorldPoint(cC.getX() - llIlllIIIl[0], cC.getWorldY(), llIlllIIIl[1]);
        List list = NPCs.getAll(nPC -> nPC.getName().equalsIgnoreCase(llIllIllll[llIlllIIIl[36]]));
        if (o.lIlllIIIlIlll(list)) {
            void var9;
            List<WorldPoint> list2 = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int var10 = llIlllIIIl[1];
            while (o.lIlllIIIlIlIl(var10, var9.size())) {
                void var11;
                if (o.lIlllIIIllIII(var11.contains(((NPC)var9.get(var10)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC)var9.get(var10);
                }
                ++var10;

                if (-(0xE9 ^ 0x92 ^ (0xF5 ^ 0x8B)) < 0) continue;
                return null;
            }
        }
        return null;
    }
}

