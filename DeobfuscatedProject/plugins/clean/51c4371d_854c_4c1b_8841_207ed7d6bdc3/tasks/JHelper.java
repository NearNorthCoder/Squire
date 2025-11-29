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
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.AHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.EHelper;
import gg.squire.account.AccBuilderBarrows;
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
implements F {

    private static boolean llIIIIIIIIl(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean T() {
        return lllIlIIl[1];
    }

    private static boolean llIIIIIIllI(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(lIlIIIIIIIlllIl);
    }

    /*
     * WARNING - void declaration
     */
    public static void R() {
        int[] nArray = new int[lllIlIIl[0]];
        nArray[j.lllIlIIl[1]] = lllIlIIl[2];
        if (j.lIlllllllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void lIlIIIIIlIIlIII;
            BankLocation bankLocation = BankLocation.getNearest();
            if (j.llIIIIIIIII(bankLocation) && j.lIlllllllll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lllIlIII[lllIlIIl[1]];
                a.a(bankLocation);
            }
            if (j.llIIIIIIIII(lIlIIIIIlIIlIII) && j.llIIIIIIIIl(lIlIIIIIlIIlIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lllIlIII[lllIlIIl[0]];
                if (j.lIlllllllll(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIIl[3]);

                }
                if (j.llIIIIIIIIl(Bank.isOpen() ? 1 : 0)) {
                    if (j.llIIIIIIIlI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lllIlIIl[0]);

                    }
                    a.a(lllIlIIl[2], lllIlIIl[4]);
                    a.a(lllIlIIl[5], lllIlIIl[0]);
                    a.a(lllIlIIl[6], lllIlIIl[7]);
                }
            }
        }
        int[] nArray2 = new int[lllIlIIl[0]];
        nArray2[j.lllIlIIl[1]] = lllIlIIl[2];
        if (j.llIIIIIIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            j.S();
        }
    }

    private static boolean lIlllllllll(int n2) {
        return n2 == 0;
    }

    private static void lIlllllllIl() {
        lllIlIII = new String[lllIlIIl[45]];
        j.lllIlIII[j.lllIlIIl[1]] = "Navigating to bank";
        j.lllIlIII[j.lllIlIIl[0]] = "Handling banking";
        j.lllIlIII[j.lllIlIIl[10]] = "Eat";
        j.lllIlIII[j.lllIlIIl[20]] = "Nav to souls";
        j.lllIlIII[j.lllIlIIl[28]] = "Soul Wars Portal";
        j.lllIlIII[j.lllIlIIl[29]] = "Enter";
        j.lllIlIII[j.lllIlIIl[27]] = "Climb-up";
        j.lllIlIII[j.lllIlIIl[34]] = "Fighting souls";
        j.lllIlIII[j.lllIlIIl[35]] = "Attacking soul";
        j.lllIlIII[j.lllIlIIl[36]] = "Attack";
        j.lllIlIII[j.lllIlIIl[7]] = "Attacking soull";
        j.lllIlIII[j.lllIlIIl[13]] = "Attack";
        j.lllIlIII[j.lllIlIIl[37]] = "In combat";
        j.lllIlIII[j.lllIlIIl[14]] = "Forgotten Souls";
        j.lllIlIII[j.lllIlIIl[40]] = "Soul";
        j.lllIlIII[j.lllIlIIl[41]] = "Attack";
        j.lllIlIII[j.lllIlIIl[42]] = "Soul";
        j.lllIlIII[j.lllIlIIl[43]] = "Attack";
        j.lllIlIII[j.lllIlIIl[44]] = "Staircase";
    }

    private static boolean llIIIIIlIIl(Object object, Object object2) {
        return object == object2;
    }

    private static  boolean a(WorldArea worldArea, TileObject tileObject) {
        int n2;
        if (j.llIIIIIIIIl(tileObject.getName().contains(lllIlIII[lllIlIIl[44]]) ? 1 : 0) && j.llIIIIIIIIl(worldArea.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
            n2 = lllIlIIl[0];

            if ((1 ^ 0x25 ^ (0x1C ^ 0x3C)) != (0x52 ^ 0x1E ^ (0xE0 ^ 0xA8))) {
                return (2 & (2 ^ -1)) != 0;
            }
        } else {
            n2 = lllIlIIl[1];
        }
        return n2 != 0;
    }

    private static boolean llIIIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void S() {
        NPC lIlIIIIIIllIlIl;
        NPC lIlIIIIIIllIllI;
        void lIlIIIIIIlllIIl;
        WorldPoint worldPoint = new WorldPoint(lllIlIIl[8], lllIlIIl[9], lllIlIIl[10]);
        WorldPoint worldPoint2 = new WorldPoint(lllIlIIl[8], lllIlIIl[9], lllIlIIl[0]);
        WorldArea worldArea = new WorldArea(lllIlIIl[11], lllIlIIl[12], lllIlIIl[13], lllIlIIl[14], lllIlIIl[0]);
        WorldArea worldArea2 = new WorldArea(lllIlIIl[11], lllIlIIl[12], lllIlIIl[13], lllIlIIl[14], lllIlIIl[0]);
        WorldArea worldArea3 = worldArea;
        WorldArea worldArea4 = new WorldArea(lllIlIIl[15], lllIlIIl[16], lllIlIIl[17], lllIlIIl[18], lllIlIIl[1]);
        WorldPoint worldPoint3 = new WorldPoint(lllIlIIl[8], lllIlIIl[19], lllIlIIl[1]);
        if (j.llIIIIIIlII(j.llIIIIIIIll(e.v(), 45.0))) {
            int[] nArray = new int[lllIlIIl[0]];
            nArray[j.lllIlIIl[1]] = lllIlIIl[2];
            if (j.llIIIIIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIlIIl[0]];
                nArray2[j.lllIlIIl[1]] = lllIlIIl[2];
                Inventory.getFirst((int[])nArray2).interact(lllIlIII[lllIlIIl[10]]);
                Time.sleepTicks((int)lllIlIIl[0]);

            }
        }
        if (j.lIlllllllll(lIlIIIIIIlllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void lIlIIIIIIlllIII;
            AccBuilderBarrows.c = lllIlIII[lllIlIIl[20]];
            lIlIIIIIIllIllI = new WorldArea(lllIlIIl[21], lllIlIIl[22], lllIlIIl[23], lllIlIIl[24], lllIlIIl[1]);
            if (j.lIlllllllll(lIlIIIIIIllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                lIlIIIIIIllIlIl = new WorldPoint(lllIlIIl[25], lllIlIIl[26], lllIlIIl[1]);
                if (j.llIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIIIIIIllIlIl), lllIlIIl[27])) {
                    Movement.walkTo((WorldPoint)lIlIIIIIIllIlIl);

                    Time.sleepTicks((int)lllIlIIl[0]);

                }
                if (j.llIIIIIIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIIIIIIllIlIl), lllIlIIl[27])) {
                    String[] stringArray = new String[lllIlIIl[0]];
                    stringArray[j.lllIlIIl[1]] = lllIlIII[lllIlIIl[28]];
                    TileObjects.getNearest((String[])stringArray).interact(lllIlIII[lllIlIIl[29]]);
                    Time.sleepTicks((int)lllIlIIl[20]);

                }
            }
            if (j.llIIIIIIIIl(lIlIIIIIIllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && j.lIlllllllll(lIlIIIIIIlllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void lIlIIIIIIllIlll;
                Movement.walkTo((WorldPoint)lIlIIIIIIllIlll);

                Time.sleepTicks((int)lllIlIIl[0]);

            }
            if (j.llIIIIIIIIl(lIlIIIIIIlllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                lIlIIIIIIllIlIl = TileObjects.getNearest(arg_0 -> j.a((WorldArea)lIlIIIIIIlllIII, arg_0));
                if (j.llIIIIIIlll(lIlIIIIIIllIlIl)) {
                    WorldPoint[] worldPointArray = new WorldPoint[lllIlIIl[28]];
                    worldPointArray[j.lllIlIIl[1]] = new WorldPoint(lllIlIIl[8], lllIlIIl[19], lllIlIIl[1]);
                    worldPointArray[j.lllIlIIl[0]] = new WorldPoint(lllIlIIl[30], lllIlIIl[31], lllIlIIl[1]);
                    worldPointArray[j.lllIlIIl[10]] = new WorldPoint(lllIlIIl[30], lllIlIIl[32], lllIlIIl[1]);
                    worldPointArray[j.lllIlIIl[20]] = new WorldPoint(lllIlIIl[30], lllIlIIl[33], lllIlIIl[1]);
                    WorldPoint[] lIlIIIIIIllIlII = worldPointArray;
                    Walker.walkAlong(Arrays.asList(lIlIIIIIIllIlII), new HashMap());

                }
                if (j.llIIIIIIIII(lIlIIIIIIllIlIl)) {
                    lIlIIIIIIllIlIl.interact(lllIlIII[lllIlIIl[27]]);
                    Time.sleepTicks((int)lllIlIIl[20]);

                }
            }
        }
        if (j.llIIIIIIIIl(lIlIIIIIIlllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (j.llIIIIIIlll(Players.getLocal().getInteracting())) {
                AccBuilderBarrows.c = lllIlIII[lllIlIIl[34]];
                lIlIIIIIIllIllI = NPCs.getNearest(nPC -> {
                    int n2;
                    if (j.llIIIIIIIIl(nPC.getName().contains(lllIlIII[lllIlIIl[42]]) ? 1 : 0)) {
                        String[] stringArray = new String[lllIlIIl[0]];
                        stringArray[j.lllIlIIl[1]] = lllIlIII[lllIlIIl[43]];
                        if (j.llIIIIIIIIl(nPC.hasAction(stringArray) ? 1 : 0) && j.lIlllllllll(nPC.isDead() ? 1 : 0) && j.llIIIIIIlll(nPC.getInteracting())) {
                            n2 = lllIlIIl[0];

                            if (-1 < 2) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lllIlIIl[1];
                    return n2 != 0;
                });
                lIlIIIIIIllIlIl = NPCs.getNearest(nPC -> {
                    int n2;
                    if (j.llIIIIIIIIl(nPC.getName().contains(lllIlIII[lllIlIIl[40]]) ? 1 : 0) && j.lIlllllllll(nPC.isDead() ? 1 : 0)) {
                        String[] stringArray = new String[lllIlIIl[0]];
                        stringArray[j.lllIlIIl[1]] = lllIlIII[lllIlIIl[41]];
                        if (j.llIIIIIIIIl(nPC.hasAction(stringArray) ? 1 : 0) && j.llIIIIIlIIl(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lllIlIIl[0];

                            if (((0xD7 ^ 0xC2 ^ (0xA6 ^ 0xAF)) & (0x46 ^ 0xC ^ (0x78 ^ 0x2E) ^ -1)) != 3) return n2 != 0;
                            return ((0x7D ^ 0x54 ^ (0x3D ^ 0x5A)) & (0xE2 ^ 0xA0 ^ (0x7D ^ 0x71) ^ -1)) != 0;
                        }
                    }
                    n2 = lllIlIIl[1];
                    return n2 != 0;
                });
                if (j.llIIIIIIIII(lIlIIIIIIllIllI) && j.llIIIIIIlll(lIlIIIIIIllIlIl)) {
                    AccBuilderBarrows.c = lllIlIII[lllIlIIl[35]];
                    lIlIIIIIIllIllI.interact(lllIlIII[lllIlIIl[36]]);
                    Time.sleepTicks((int)lllIlIIl[10]);

                }
                if (j.llIIIIIIIII(lIlIIIIIIllIlIl)) {
                    AccBuilderBarrows.c = lllIlIII[lllIlIIl[7]];
                    lIlIIIIIIllIlIl.interact(lllIlIII[lllIlIIl[13]]);
                    Time.sleepTicks((int)lllIlIIl[20]);

                }
            }
            if (j.llIIIIIIIII(Players.getLocal().getInteracting())) {
                AccBuilderBarrows.c = lllIlIII[lllIlIIl[37]];
                Time.sleepTicks((int)lllIlIIl[0]);

            }
        }
    }

    private static boolean llIIIIIIIlI(int n2) {
        return n2 > 0;
    }

    @Override
    public int U() {
        try {
            j.R();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lllIlIIl[38];
    }

    @Override
    public boolean W() {
        boolean bl;
        if (j.llIIIIIlIII(Skills.getLevel((Skill)Skill.RANGED), lllIlIIl[39])) {
            bl = lllIlIIl[0];

            if ((0x2D ^ 0x4F ^ (0x18 ^ 0x7F)) == 0) {
                return ((93 + 73 - 42 + 127 ^ 94 + 116 - 24 + 1) & (0xD1 ^ 0x96 ^ (0xBB ^ 0xBC) ^ -1)) != 0;
            }
        } else {
            bl = lllIlIIl[1];
        }
        return bl;
    }

    @Override
    public String V() {
        return lllIlIII[lllIlIIl[14]];
    }

    private static boolean llIIIIIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    static {
        j.lIllllllllI();
        j.lIlllllllIl();
    }

    private static boolean llIIIIIIlII(int n2) {
        return n2 < 0;
    }

    private static boolean llIIIIIIlll(Object object) {
        return object == null;
    }

    private static boolean llIIIIIIIII(Object object) {
        return object != null;
    }

    private static int llIIIIIIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }
}

