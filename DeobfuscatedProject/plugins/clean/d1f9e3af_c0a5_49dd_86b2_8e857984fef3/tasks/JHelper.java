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
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
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
implements W {

    private static  boolean a(WorldArea worldArea, TileObject tileObject) {
        int n2;
        if (j.lIIIlIIlIIIl(tileObject.getName().contains(lIlIIIllI[lIlIIIlll[44]]) ? 1 : 0) && j.lIIIlIIlIIIl(worldArea.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
            n2 = lIlIIIlll[0];

            if ((0x18 ^ 6 ^ (0x61 ^ 0x7B)) <= 1) {
                return ((0x64 ^ 0xF ^ (0xED ^ 0xBD)) & (0x36 ^ 1 ^ (0x22 ^ 0x2E) ^ -1)) != 0;
            }
        } else {
            n2 = lIlIIIlll[1];
        }
        return n2 != 0;
    }

    private static boolean lIIIlIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIIIllIl() {
        lIlIIIllI = new String[lIlIIIlll[45]];
        j.lIlIIIllI[j.lIlIIIlll[1]] = "Navigating to bank";
        j.lIlIIIllI[j.lIlIIIlll[0]] = "Handling banking";
        j.lIlIIIllI[j.lIlIIIlll[10]] = "Eat";
        j.lIlIIIllI[j.lIlIIIlll[20]] = "Nav to souls";
        j.lIlIIIllI[j.lIlIIIlll[28]] = "Soul Wars Portal";
        j.lIlIIIllI[j.lIlIIIlll[29]] = "Enter";
        j.lIlIIIllI[j.lIlIIIlll[27]] = "Climb-up";
        j.lIlIIIllI[j.lIlIIIlll[34]] = "Fighting souls";
        j.lIlIIIllI[j.lIlIIIlll[35]] = "Attacking soul";
        j.lIlIIIllI[j.lIlIIIlll[36]] = "Attack";
        j.lIlIIIllI[j.lIlIIIlll[7]] = "Attacking soull";
        j.lIlIIIllI[j.lIlIIIlll[13]] = "Attack";
        j.lIlIIIllI[j.lIlIIIlll[37]] = "In combat";
        j.lIlIIIllI[j.lIlIIIlll[14]] = "Forgotten Souls";
        j.lIlIIIllI[j.lIlIIIlll[40]] = "Soul";
        j.lIlIIIllI[j.lIlIIIlll[41]] = "Attack";
        j.lIlIIIllI[j.lIlIIIlll[42]] = "Soul";
        j.lIlIIIllI[j.lIlIIIlll[43]] = "Attack";
        j.lIlIIIllI[j.lIlIIIlll[44]] = "Staircase";
    }

    private static boolean lIIIlIIlIIII(Object object) {
        return object != null;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (j.lIIIlIIllIIl(Skills.getLevel((Skill)Skill.RANGED), lIlIIIlll[39])) {
            bl = lIlIIIlll[0];

        } else {
            bl = lIlIIIlll[1];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public static void Q() {
        int[] nArray = new int[lIlIIIlll[0]];
        nArray[j.lIlIIIlll[1]] = lIlIIIlll[2];
        if (j.lIIIlIIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void llllIlIllIIIII;
            BankLocation bankLocation = BankLocation.getNearest();
            if (j.lIIIlIIlIIII(bankLocation) && j.lIIIlIIIllll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[1]];
                a.a(bankLocation);
            }
            if (j.lIIIlIIlIIII(llllIlIllIIIII) && j.lIIIlIIlIIIl(llllIlIllIIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[0]];
                if (j.lIIIlIIIllll(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIIlll[3]);

                }
                if (j.lIIIlIIlIIIl(Bank.isOpen() ? 1 : 0)) {
                    if (j.lIIIlIIlIIlI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lIlIIIlll[0]);

                    }
                    a.a(lIlIIIlll[2], lIlIIIlll[4]);
                    a.a(lIlIIIlll[5], lIlIIIlll[0]);
                    a.a(lIlIIIlll[6], lIlIIIlll[7]);
                }
            }
        }
        int[] nArray2 = new int[lIlIIIlll[0]];
        nArray2[j.lIlIIIlll[1]] = lIlIIIlll[2];
        if (j.lIIIlIIlIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            j.R();
        }
    }

    private static boolean lIIIlIIIllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlIIllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIlIIllIII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private static void R() {
        NPC llllIlIlIIllIl;
        NPC llllIlIlIIlllI;
        void llllIlIlIlIIIl;
        WorldPoint worldPoint = new WorldPoint(lIlIIIlll[8], lIlIIIlll[9], lIlIIIlll[10]);
        WorldPoint worldPoint2 = new WorldPoint(lIlIIIlll[8], lIlIIIlll[9], lIlIIIlll[0]);
        WorldArea worldArea = new WorldArea(lIlIIIlll[11], lIlIIIlll[12], lIlIIIlll[13], lIlIIIlll[14], lIlIIIlll[0]);
        WorldArea worldArea2 = new WorldArea(lIlIIIlll[11], lIlIIIlll[12], lIlIIIlll[13], lIlIIIlll[14], lIlIIIlll[0]);
        WorldArea worldArea3 = worldArea;
        WorldArea worldArea4 = new WorldArea(lIlIIIlll[15], lIlIIIlll[16], lIlIIIlll[17], lIlIIIlll[18], lIlIIIlll[1]);
        WorldPoint worldPoint3 = new WorldPoint(lIlIIIlll[8], lIlIIIlll[19], lIlIIIlll[1]);
        if (j.lIIIlIIlIlIl(j.lIIIlIIlIIll(e.u(), 45.0))) {
            int[] nArray = new int[lIlIIIlll[0]];
            nArray[j.lIlIIIlll[1]] = lIlIIIlll[2];
            if (j.lIIIlIIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlIIIlll[0]];
                nArray2[j.lIlIIIlll[1]] = lIlIIIlll[2];
                Inventory.getFirst((int[])nArray2).interact(lIlIIIllI[lIlIIIlll[10]]);
                Time.sleepTicks((int)lIlIIIlll[0]);

            }
        }
        if (j.lIIIlIIIllll(llllIlIlIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void llllIlIlIlIIII;
            AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[20]];
            llllIlIlIIlllI = new WorldArea(lIlIIIlll[21], lIlIIIlll[22], lIlIIIlll[23], lIlIIIlll[24], lIlIIIlll[1]);
            if (j.lIIIlIIIllll(llllIlIlIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                llllIlIlIIllIl = new WorldPoint(lIlIIIlll[25], lIlIIIlll[26], lIlIIIlll[1]);
                if (j.lIIIlIIlIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIlIlIIllIl), lIlIIIlll[27])) {
                    Movement.walkTo((WorldPoint)llllIlIlIIllIl);

                    Time.sleepTicks((int)lIlIIIlll[0]);

                }
                if (j.lIIIlIIlIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIlIlIIllIl), lIlIIIlll[27])) {
                    String[] stringArray = new String[lIlIIIlll[0]];
                    stringArray[j.lIlIIIlll[1]] = lIlIIIllI[lIlIIIlll[28]];
                    TileObjects.getNearest((String[])stringArray).interact(lIlIIIllI[lIlIIIlll[29]]);
                    Time.sleepTicks((int)lIlIIIlll[20]);

                }
            }
            if (j.lIIIlIIlIIIl(llllIlIlIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && j.lIIIlIIIllll(llllIlIlIlIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void llllIlIlIIllll;
                Movement.walkTo((WorldPoint)llllIlIlIIllll);

                Time.sleepTicks((int)lIlIIIlll[0]);

            }
            if (j.lIIIlIIlIIIl(llllIlIlIlIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                llllIlIlIIllIl = TileObjects.getNearest(arg_0 -> j.a((WorldArea)llllIlIlIlIIII, arg_0));
                if (j.lIIIlIIllIII(llllIlIlIIllIl)) {
                    WorldPoint[] worldPointArray = new WorldPoint[lIlIIIlll[28]];
                    worldPointArray[j.lIlIIIlll[1]] = new WorldPoint(lIlIIIlll[8], lIlIIIlll[19], lIlIIIlll[1]);
                    worldPointArray[j.lIlIIIlll[0]] = new WorldPoint(lIlIIIlll[30], lIlIIIlll[31], lIlIIIlll[1]);
                    worldPointArray[j.lIlIIIlll[10]] = new WorldPoint(lIlIIIlll[30], lIlIIIlll[32], lIlIIIlll[1]);
                    worldPointArray[j.lIlIIIlll[20]] = new WorldPoint(lIlIIIlll[30], lIlIIIlll[33], lIlIIIlll[1]);
                    WorldPoint[] llllIlIlIIllII = worldPointArray;
                    Walker.walkAlong(Arrays.asList(llllIlIlIIllII), new HashMap());

                }
                if (j.lIIIlIIlIIII(llllIlIlIIllIl)) {
                    llllIlIlIIllIl.interact(lIlIIIllI[lIlIIIlll[27]]);
                    Time.sleepTicks((int)lIlIIIlll[20]);

                }
            }
        }
        if (j.lIIIlIIlIIIl(llllIlIlIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (j.lIIIlIIllIII(Players.getLocal().getInteracting())) {
                AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[34]];
                llllIlIlIIlllI = NPCs.getNearest(nPC -> {
                    int n2;
                    if (j.lIIIlIIlIIIl(nPC.getName().contains(lIlIIIllI[lIlIIIlll[42]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIIIlll[0]];
                        stringArray[j.lIlIIIlll[1]] = lIlIIIllI[lIlIIIlll[43]];
                        if (j.lIIIlIIlIIIl(nPC.hasAction(stringArray) ? 1 : 0) && j.lIIIlIIIllll(nPC.isDead() ? 1 : 0) && j.lIIIlIIllIII(nPC.getInteracting())) {
                            n2 = lIlIIIlll[0];

                            if (-3 <= 0) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lIlIIIlll[1];
                    return n2 != 0;
                });
                llllIlIlIIllIl = NPCs.getNearest(nPC -> {
                    int n2;
                    if (j.lIIIlIIlIIIl(nPC.getName().contains(lIlIIIllI[lIlIIIlll[40]]) ? 1 : 0) && j.lIIIlIIIllll(nPC.isDead() ? 1 : 0)) {
                        String[] stringArray = new String[lIlIIIlll[0]];
                        stringArray[j.lIlIIIlll[1]] = lIlIIIllI[lIlIIIlll[41]];
                        if (j.lIIIlIIlIIIl(nPC.hasAction(stringArray) ? 1 : 0) && j.lIIIlIIllIlI(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lIlIIIlll[0];

                            if (null == null) return n2 != 0;
                            return ((0xC5 ^ 0x93 ^ (0x6C ^ 0x68)) & (0xF3 ^ 0x97 ^ (0x37 ^ 1) ^ -1)) != 0;
                        }
                    }
                    n2 = lIlIIIlll[1];
                    return n2 != 0;
                });
                if (j.lIIIlIIlIIII(llllIlIlIIlllI) && j.lIIIlIIllIII(llllIlIlIIllIl)) {
                    AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[35]];
                    llllIlIlIIlllI.interact(lIlIIIllI[lIlIIIlll[36]]);
                    Time.sleepTicks((int)lIlIIIlll[10]);

                }
                if (j.lIIIlIIlIIII(llllIlIlIIllIl)) {
                    AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[7]];
                    llllIlIlIIllIl.interact(lIlIIIllI[lIlIIIlll[13]]);
                    Time.sleepTicks((int)lIlIIIlll[20]);

                }
            }
            if (j.lIIIlIIlIIII(Players.getLocal().getInteracting())) {
                AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[37]];
                Time.sleepTicks((int)lIlIIIlll[0]);

            }
        }
    }

        return String.valueOf(llllIlIIlIlIII);
    }

    private static int lIIIlIIlIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIIlIIlIIlI(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean S() {
        return lIlIIIlll[1];
    }

    @Override
    public String U() {
        return lIlIIIllI[lIlIIIlll[14]];
    }

    private static boolean lIIIlIIlIIIl(int n2) {
        return n2 != 0;
    }

    static {
        j.lIIIlIIIlllI();
        j.lIIIlIIIllIl();
    }

    private static boolean lIIIlIIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIlIIlIlll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int T() {
        try {
            j.Q();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 >= 1) {
            return (0xB9 ^ 0x96) & ~(0xE8 ^ 0xC7);
        }
        return lIlIIIlll[38];
    }

    private static boolean lIIIlIIllIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIlIIlIlIl(int n2) {
        return n2 < 0;
    }
}

