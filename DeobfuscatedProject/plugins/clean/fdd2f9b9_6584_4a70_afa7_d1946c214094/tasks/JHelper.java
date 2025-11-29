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
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import gg.squire.account.AccBuilderRogues;
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

public class JHelper
implements G {

    private static boolean lllllIlIllll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (j.lllllIlIllIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIIlllI[39])) {
            bl = lIIlIIlllI[0];

            if (1 <= 0) {
                return ((0xA6 ^ 0xB9 ^ (0xDD ^ 0x94)) & (0xFB ^ 0xB6 ^ (0x3C ^ 0x27) ^ -1)) != 0;
            }
        } else {
            bl = lIIlIIlllI[1];
        }
        return bl;
    }

    private static boolean lllllIlIIlll(int n2) {
        return n2 > 0;
    }

    private static boolean lllllIlIlllI(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public String U() {
        return lIIlIIllIl[lIIlIIlllI[14]];
    }

        return String.valueOf(var1);
    }

    private static void lllllIlIIIlI() {
        lIIlIIllIl = new String[lIIlIIlllI[45]];
        j.lIIlIIllIl[j.lIIlIIlllI[1]] = "Navigating to bank";
        j.lIIlIIllIl[j.lIIlIIlllI[0]] = "Handling banking";
        j.lIIlIIllIl[j.lIIlIIlllI[10]] = "Eat";
        j.lIIlIIllIl[j.lIIlIIlllI[20]] = "Nav to souls";
        j.lIIlIIllIl[j.lIIlIIlllI[28]] = "Soul Wars Portal";
        j.lIIlIIllIl[j.lIIlIIlllI[29]] = "Enter";
        j.lIIlIIllIl[j.lIIlIIlllI[27]] = "Climb-up";
        j.lIIlIIllIl[j.lIIlIIlllI[34]] = "Fighting souls";
        j.lIIlIIllIl[j.lIIlIIlllI[35]] = "Attacking soul";
        j.lIIlIIllIl[j.lIIlIIlllI[36]] = "Attack";
        j.lIIlIIllIl[j.lIIlIIlllI[7]] = "Attacking soull";
        j.lIIlIIllIl[j.lIIlIIlllI[13]] = "Attack";
        j.lIIlIIllIl[j.lIIlIIlllI[37]] = "In combat";
        j.lIIlIIllIl[j.lIIlIIlllI[14]] = "Forgotten Souls";
        j.lIIlIIllIl[j.lIIlIIlllI[40]] = "Soul";
        j.lIIlIIllIl[j.lIIlIIlllI[41]] = "Attack";
        j.lIIlIIllIl[j.lIIlIIlllI[42]] = "Soul";
        j.lIIlIIllIl[j.lIIlIIlllI[43]] = "Attack";
        j.lIIlIIllIl[j.lIIlIIlllI[44]] = "Staircase";
    }

    private static boolean lllllIlIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean S() {
        return lIIlIIlllI[1];
    }

    private static  boolean a(WorldArea worldArea, TileObject tileObject) {
        int n2;
        if (j.lllllIlIIllI(tileObject.getName().contains(lIIlIIllIl[lIIlIIlllI[44]]) ? 1 : 0) && j.lllllIlIIllI(worldArea.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
            n2 = lIIlIIlllI[0];

            if ((0x62 ^ 0x66) <= 0) {
                return false;
            }
        } else {
            n2 = lIIlIIlllI[1];
        }
        return n2 != 0;
    }

    private static boolean lllllIlIlIIl(int n2) {
        return n2 < 0;
    }

    private static boolean lllllIlIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllllIlIIlIl(Object object) {
        return object != null;
    }

    private static boolean lllllIlIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIlIllII(Object object) {
        return object == null;
    }

    private static int lllllIlIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lllllIlIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void R() {
        NPC var2;
        NPC var3;
        void var4;
        WorldPoint worldPoint = new WorldPoint(lIIlIIlllI[8], lIIlIIlllI[9], lIIlIIlllI[10]);
        WorldPoint worldPoint2 = new WorldPoint(lIIlIIlllI[8], lIIlIIlllI[9], lIIlIIlllI[0]);
        WorldArea worldArea = new WorldArea(lIIlIIlllI[11], lIIlIIlllI[12], lIIlIIlllI[13], lIIlIIlllI[14], lIIlIIlllI[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIIlllI[11], lIIlIIlllI[12], lIIlIIlllI[13], lIIlIIlllI[14], lIIlIIlllI[0]);
        WorldArea worldArea3 = worldArea;
        WorldArea worldArea4 = new WorldArea(lIIlIIlllI[15], lIIlIIlllI[16], lIIlIIlllI[17], lIIlIIlllI[18], lIIlIIlllI[1]);
        WorldPoint worldPoint3 = new WorldPoint(lIIlIIlllI[8], lIIlIIlllI[19], lIIlIIlllI[1]);
        if (j.lllllIlIlIIl(j.lllllIlIlIII(e.u(), 45.0))) {
            int[] nArray = new int[lIIlIIlllI[0]];
            nArray[j.lIIlIIlllI[1]] = lIIlIIlllI[2];
            if (j.lllllIlIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIlIIlllI[0]];
                nArray2[j.lIIlIIlllI[1]] = lIIlIIlllI[2];
                Inventory.getFirst((int[])nArray2).interact(lIIlIIllIl[lIIlIIlllI[10]]);
                Time.sleepTicks((int)lIIlIIlllI[0]);

            }
        }
        if (j.lllllIlIIlII(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var5;
            AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[20]];
            var3 = new WorldArea(lIIlIIlllI[21], lIIlIIlllI[22], lIIlIIlllI[23], lIIlIIlllI[24], lIIlIIlllI[1]);
            if (j.lllllIlIIlII(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var2 = new WorldPoint(lIIlIIlllI[25], lIIlIIlllI[26], lIIlIIlllI[1]);
                if (j.lllllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var2), lIIlIIlllI[27])) {
                    Movement.walkTo((WorldPoint)var2);

                    Time.sleepTicks((int)lIIlIIlllI[0]);

                }
                if (j.lllllIlIlIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var2), lIIlIIlllI[27])) {
                    String[] stringArray = new String[lIIlIIlllI[0]];
                    stringArray[j.lIIlIIlllI[1]] = lIIlIIllIl[lIIlIIlllI[28]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIllIl[lIIlIIlllI[29]]);
                    Time.sleepTicks((int)lIIlIIlllI[20]);

                }
            }
            if (j.lllllIlIIllI(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && j.lllllIlIIlII(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void var6;
                Movement.walkTo((WorldPoint)var6);

                Time.sleepTicks((int)lIIlIIlllI[0]);

            }
            if (j.lllllIlIIllI(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var2 = TileObjects.getNearest(arg_0 -> j.a((WorldArea)var5, arg_0));
                if (j.lllllIlIllII(var2)) {
                    WorldPoint[] worldPointArray = new WorldPoint[lIIlIIlllI[28]];
                    worldPointArray[j.lIIlIIlllI[1]] = new WorldPoint(lIIlIIlllI[8], lIIlIIlllI[19], lIIlIIlllI[1]);
                    worldPointArray[j.lIIlIIlllI[0]] = new WorldPoint(lIIlIIlllI[30], lIIlIIlllI[31], lIIlIIlllI[1]);
                    worldPointArray[j.lIIlIIlllI[10]] = new WorldPoint(lIIlIIlllI[30], lIIlIIlllI[32], lIIlIIlllI[1]);
                    worldPointArray[j.lIIlIIlllI[20]] = new WorldPoint(lIIlIIlllI[30], lIIlIIlllI[33], lIIlIIlllI[1]);
                    WorldPoint[] var7 = worldPointArray;
                    Walker.walkAlong(Arrays.asList(var7), new HashMap());

                }
                if (j.lllllIlIIlIl(var2)) {
                    var2.interact(lIIlIIllIl[lIIlIIlllI[27]]);
                    Time.sleepTicks((int)lIIlIIlllI[20]);

                }
            }
        }
        if (j.lllllIlIIllI(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (j.lllllIlIllII(Players.getLocal().getInteracting())) {
                AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[34]];
                var3 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (j.lllllIlIIllI(nPC.getName().contains(lIIlIIllIl[lIIlIIlllI[42]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIIlIIlllI[0]];
                        stringArray[j.lIIlIIlllI[1]] = lIIlIIllIl[lIIlIIlllI[43]];
                        if (j.lllllIlIIllI(nPC.hasAction(stringArray) ? 1 : 0) && j.lllllIlIIlII(nPC.isDead() ? 1 : 0) && j.lllllIlIllII(nPC.getInteracting())) {
                            n2 = lIIlIIlllI[0];

                            if (2 == 2) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lIIlIIlllI[1];
                    return n2 != 0;
                });
                var2 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (j.lllllIlIIllI(nPC.getName().contains(lIIlIIllIl[lIIlIIlllI[40]]) ? 1 : 0) && j.lllllIlIIlII(nPC.isDead() ? 1 : 0)) {
                        String[] stringArray = new String[lIIlIIlllI[0]];
                        stringArray[j.lIIlIIlllI[1]] = lIIlIIllIl[lIIlIIlllI[41]];
                        if (j.lllllIlIIllI(nPC.hasAction(stringArray) ? 1 : 0) && j.lllllIlIlllI(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lIIlIIlllI[0];

                            if (2 > 0) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lIIlIIlllI[1];
                    return n2 != 0;
                });
                if (j.lllllIlIIlIl(var3) && j.lllllIlIllII(var2)) {
                    AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[35]];
                    var3.interact(lIIlIIllIl[lIIlIIlllI[36]]);
                    Time.sleepTicks((int)lIIlIIlllI[10]);

                }
                if (j.lllllIlIIlIl(var2)) {
                    AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[7]];
                    var2.interact(lIIlIIllIl[lIIlIIlllI[13]]);
                    Time.sleepTicks((int)lIIlIIlllI[20]);

                }
            }
            if (j.lllllIlIIlIl(Players.getLocal().getInteracting())) {
                AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[37]];
                Time.sleepTicks((int)lIIlIIlllI[0]);

            }
        }
    }

    static {
        j.lllllIlIIIll();
        j.lllllIlIIIlI();
    }

    @Override
    public int T() {
        try {
            j.Q();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 >= ((0x26 ^ 1) & ~(0xBE ^ 0x99))) {
            return (0x79 ^ 0x59) & ~(2 ^ 0x22);
        }
        return lIIlIIlllI[38];
    }

    private static boolean lllllIlIIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void Q() {
        int[] nArray = new int[lIIlIIlllI[0]];
        nArray[j.lIIlIIlllI[1]] = lIIlIIlllI[2];
        if (j.lllllIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void var8;
            BankLocation bankLocation = BankLocation.getNearest();
            if (j.lllllIlIIlIl(bankLocation) && j.lllllIlIIlII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[1]];
                a.a(bankLocation);
            }
            if (j.lllllIlIIlIl(var8) && j.lllllIlIIllI(var8.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[0]];
                if (j.lllllIlIIlII(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIlllI[3]);

                }
                if (j.lllllIlIIllI(Bank.isOpen() ? 1 : 0)) {
                    if (j.lllllIlIIlll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lIIlIIlllI[0]);

                    }
                    a.a(lIIlIIlllI[2], lIIlIIlllI[4]);
                    a.a(lIIlIIlllI[5], lIIlIIlllI[0]);
                    a.a(lIIlIIlllI[6], lIIlIIlllI[7]);
                }
            }
        }
        int[] nArray2 = new int[lIIlIIlllI[0]];
        nArray2[j.lIIlIIlllI[1]] = lIIlIIlllI[2];
        if (j.lllllIlIIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            j.R();
        }
    }
}

