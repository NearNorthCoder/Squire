/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.AHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.EHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class KHelper
implements K {

    private static boolean lIIlIlIllIlIl(int n2) {
        return n2 < 0;
    }

    @Override
    public boolean ac() {
        return lIllIIIIll[1];
    }

    private static boolean lIIlIlIlllIII(Object object) {
        return object == null;
    }

    private static  boolean a(WorldArea worldArea, TileObject tileObject) {
        int n2;
        if (k.lIIlIlIllIIlI(tileObject.getName().contains(lIllIIIIlI[lIllIIIIll[44]]) ? 1 : 0) && k.lIIlIlIllIIlI(worldArea.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
            n2 = lIllIIIIll[0];

            if (-(0xC5 ^ 0xC1) > 0) {
                return false;
            }
        } else {
            n2 = lIllIIIIll[1];
        }
        return n2 != 0;
    }

    private static boolean lIIlIlIlllIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void ab() {
        NPC var1;
        NPC var2;
        void var3;
        WorldPoint worldPoint = new WorldPoint(lIllIIIIll[8], lIllIIIIll[9], lIllIIIIll[10]);
        WorldPoint worldPoint2 = new WorldPoint(lIllIIIIll[8], lIllIIIIll[9], lIllIIIIll[0]);
        WorldArea worldArea = new WorldArea(lIllIIIIll[11], lIllIIIIll[12], lIllIIIIll[13], lIllIIIIll[14], lIllIIIIll[0]);
        WorldArea worldArea2 = new WorldArea(lIllIIIIll[11], lIllIIIIll[12], lIllIIIIll[13], lIllIIIIll[14], lIllIIIIll[0]);
        WorldArea worldArea3 = worldArea;
        WorldArea worldArea4 = new WorldArea(lIllIIIIll[15], lIllIIIIll[16], lIllIIIIll[17], lIllIIIIll[18], lIllIIIIll[1]);
        WorldPoint worldPoint3 = new WorldPoint(lIllIIIIll[8], lIllIIIIll[19], lIllIIIIll[1]);
        if (k.lIIlIlIllIlIl(k.lIIlIlIllIlII(e.u(), 45.0))) {
            int[] nArray = new int[lIllIIIIll[0]];
            nArray[k.lIllIIIIll[1]] = lIllIIIIll[2];
            if (k.lIIlIlIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIllIIIIll[0]];
                nArray2[k.lIllIIIIll[1]] = lIllIIIIll[2];
                Inventory.getFirst((int[])nArray2).interact(lIllIIIIlI[lIllIIIIll[10]]);
                Time.sleepTicks((int)lIllIIIIll[0]);

            }
        }
        if (k.lIIlIlIllIIII(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var4;
            AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[20]];
            var2 = new WorldArea(lIllIIIIll[21], lIllIIIIll[22], lIllIIIIll[23], lIllIIIIll[24], lIllIIIIll[1]);
            if (k.lIIlIlIllIIII(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var1 = new WorldPoint(lIllIIIIll[25], lIllIIIIll[26], lIllIIIIll[1]);
                if (k.lIIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var1), lIllIIIIll[27])) {
                    Movement.walkTo((WorldPoint)var1);

                    Time.sleepTicks((int)lIllIIIIll[0]);

                }
                if (k.lIIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var1), lIllIIIIll[27])) {
                    String[] stringArray = new String[lIllIIIIll[0]];
                    stringArray[k.lIllIIIIll[1]] = lIllIIIIlI[lIllIIIIll[28]];
                    TileObjects.getNearest((String[])stringArray).interact(lIllIIIIlI[lIllIIIIll[29]]);
                    Time.sleepTicks((int)lIllIIIIll[20]);

                }
            }
            if (k.lIIlIlIllIIlI(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && k.lIIlIlIllIIII(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void var5;
                Movement.walkTo((WorldPoint)var5);

                Time.sleepTicks((int)lIllIIIIll[0]);

            }
            if (k.lIIlIlIllIIlI(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var1 = TileObjects.getNearest(arg_0 -> k.a((WorldArea)var4, arg_0));
                if (k.lIIlIlIlllIII(var1)) {
                    WorldPoint[] worldPointArray = new WorldPoint[lIllIIIIll[28]];
                    worldPointArray[k.lIllIIIIll[1]] = new WorldPoint(lIllIIIIll[8], lIllIIIIll[19], lIllIIIIll[1]);
                    worldPointArray[k.lIllIIIIll[0]] = new WorldPoint(lIllIIIIll[30], lIllIIIIll[31], lIllIIIIll[1]);
                    worldPointArray[k.lIllIIIIll[10]] = new WorldPoint(lIllIIIIll[30], lIllIIIIll[32], lIllIIIIll[1]);
                    worldPointArray[k.lIllIIIIll[20]] = new WorldPoint(lIllIIIIll[30], lIllIIIIll[33], lIllIIIIll[1]);
                    WorldPoint[] var6 = worldPointArray;
                    Walker.walkAlong(Arrays.asList(var6), new HashMap());

                }
                if (k.lIIlIlIllIIIl(var1)) {
                    var1.interact(lIllIIIIlI[lIllIIIIll[27]]);
                    Time.sleepTicks((int)lIllIIIIll[20]);

                }
            }
        }
        if (k.lIIlIlIllIIlI(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (k.lIIlIlIlllIII(Players.getLocal().getInteracting())) {
                AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[34]];
                var2 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIIlIlIllIIlI(nPC.getName().contains(lIllIIIIlI[lIllIIIIll[42]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIllIIIIll[0]];
                        stringArray[k.lIllIIIIll[1]] = lIllIIIIlI[lIllIIIIll[43]];
                        if (k.lIIlIlIllIIlI(nPC.hasAction(stringArray) ? 1 : 0) && k.lIIlIlIllIIII(nPC.isDead() ? 1 : 0) && k.lIIlIlIlllIII(nPC.getInteracting())) {
                            n2 = lIllIIIIll[0];

                            if (((0xF0 ^ 0x92) & ~(0x18 ^ 0x7A)) == (1 & ~1)) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lIllIIIIll[1];
                    return n2 != 0;
                });
                var1 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIIlIlIllIIlI(nPC.getName().contains(lIllIIIIlI[lIllIIIIll[40]]) ? 1 : 0) && k.lIIlIlIllIIII(nPC.isDead() ? 1 : 0)) {
                        String[] stringArray = new String[lIllIIIIll[0]];
                        stringArray[k.lIllIIIIll[1]] = lIllIIIIlI[lIllIIIIll[41]];
                        if (k.lIIlIlIllIIlI(nPC.hasAction(stringArray) ? 1 : 0) && k.lIIlIlIlllIlI(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lIllIIIIll[0];

                            if (((66 + 9 - 54 + 142 ^ 118 + 102 - 107 + 28) & (113 + 70 - 168 + 113 ^ 157 + 67 - 157 + 107 ^ -1)) == 0) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lIllIIIIll[1];
                    return n2 != 0;
                });
                if (k.lIIlIlIllIIIl(var2) && k.lIIlIlIlllIII(var1)) {
                    AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[35]];
                    var2.interact(lIllIIIIlI[lIllIIIIll[36]]);
                    Time.sleepTicks((int)lIllIIIIll[10]);

                }
                if (k.lIIlIlIllIIIl(var1)) {
                    AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[7]];
                    var1.interact(lIllIIIIlI[lIllIIIIll[13]]);
                    Time.sleepTicks((int)lIllIIIIll[20]);

                }
            }
            if (k.lIIlIlIllIIIl(Players.getLocal().getInteracting())) {
                AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[37]];
                Time.sleepTicks((int)lIllIIIIll[0]);

            }
        }
    }

    @Override
    public String ae() {
        return lIllIIIIlI[lIllIIIIll[14]];
    }

    private static boolean lIIlIlIllIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void aa() {
        int[] nArray = new int[lIllIIIIll[0]];
        nArray[k.lIllIIIIll[1]] = lIllIIIIll[2];
        if (k.lIIlIlIllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void var7;
            BankLocation bankLocation = BankLocation.getNearest();
            if (k.lIIlIlIllIIIl(bankLocation) && k.lIIlIlIllIIII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[1]];
                a.a(bankLocation);
            }
            if (k.lIIlIlIllIIIl(var7) && k.lIIlIlIllIIlI(var7.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[0]];
                if (k.lIIlIlIllIIII(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIIIll[3]);

                }
                if (k.lIIlIlIllIIlI(Bank.isOpen() ? 1 : 0)) {
                    if (k.lIIlIlIllIIll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lIllIIIIll[0]);

                    }
                    a.a(lIllIIIIll[2], lIllIIIIll[4]);
                    a.a(lIllIIIIll[5], lIllIIIIll[0]);
                    a.a(lIllIIIIll[6], lIllIIIIll[7]);
                }
            }
        }
        int[] nArray2 = new int[lIllIIIIll[0]];
        nArray2[k.lIllIIIIll[1]] = lIllIIIIll[2];
        if (k.lIIlIlIllIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            k.ab();
        }
    }

    private static boolean lIIlIlIllIIIl(Object object) {
        return object != null;
    }

    private static int lIIlIlIllIlII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public int ad() {
        try {
            k.aa();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0xBF ^ 0xBB) <= ((0x6F ^ 0x48) & ~(0xAB ^ 0x8C))) {
            return (0x66 ^ 0x53) & ~(0x50 ^ 0x65);
        }
        return lIllIIIIll[38];
    }

    private static boolean lIIlIlIlllIlI(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public boolean af() {
        boolean bl;
        if (k.lIIlIlIlllIIl(Skills.getLevel((Skill)Skill.RANGED), lIllIIIIll[39])) {
            bl = lIllIIIIll[0];

            }
        } else {
            bl = lIllIIIIll[1];
        }
        return bl;
    }

    private static boolean lIIlIlIlllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIlIllIlll(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        k.lIIlIlIlIllll();
        k.lIIlIlIlIlllI();
    }

    private static boolean lIIlIlIllIIll(int n2) {
        return n2 > 0;
    }

    private static void lIIlIlIlIlllI() {
        lIllIIIIlI = new String[lIllIIIIll[45]];
        k.lIllIIIIlI[k.lIllIIIIll[1]] = "Navigating to bank";
        k.lIllIIIIlI[k.lIllIIIIll[0]] = "Handling banking";
        k.lIllIIIIlI[k.lIllIIIIll[10]] = "Eat";
        k.lIllIIIIlI[k.lIllIIIIll[20]] = "Nav to souls";
        k.lIllIIIIlI[k.lIllIIIIll[28]] = "Soul Wars Portal";
        k.lIllIIIIlI[k.lIllIIIIll[29]] = "Enter";
        k.lIllIIIIlI[k.lIllIIIIll[27]] = "Climb-up";
        k.lIllIIIIlI[k.lIllIIIIll[34]] = "Fighting souls";
        k.lIllIIIIlI[k.lIllIIIIll[35]] = "Attacking soul";
        k.lIllIIIIlI[k.lIllIIIIll[36]] = "Attack";
        k.lIllIIIIlI[k.lIllIIIIll[7]] = "Attacking soull";
        k.lIllIIIIlI[k.lIllIIIIll[13]] = "Attack";
        k.lIllIIIIlI[k.lIllIIIIll[37]] = "In combat";
        k.lIllIIIIlI[k.lIllIIIIll[14]] = "Forgotten Souls";
        k.lIllIIIIlI[k.lIllIIIIll[40]] = "Soul";
        k.lIllIIIIlI[k.lIllIIIIll[41]] = "Attack";
        k.lIllIIIIlI[k.lIllIIIIll[42]] = "Soul";
        k.lIllIIIIlI[k.lIllIIIIll[43]] = "Attack";
        k.lIllIIIIlI[k.lIllIIIIll[44]] = "Staircase";
    }

        return String.valueOf(var8);
    }

    private static boolean lIIlIlIllIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIlIllIIlI(int n2) {
        return n2 != 0;
    }
}

