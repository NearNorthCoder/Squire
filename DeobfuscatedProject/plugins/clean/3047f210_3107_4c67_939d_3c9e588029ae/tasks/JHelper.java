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
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.account.AccBuilderTempleTrek;
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
implements S {

    private static boolean llIIllIIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIllIIIIlll(int n2) {
        return n2 > 0;
    }

    static {
        j.llIIllIIIIIll();
        j.llIIllIIIIIlI();
    }

    private static boolean llIIllIIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static int llIIllIIIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * WARNING - void declaration
     */
    public static void Q() {
        int[] nArray = new int[llllIIIllI[0]];
        nArray[j.llllIIIllI[1]] = llllIIIllI[2];
        if (j.llIIllIIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void var1;
            BankLocation bankLocation = BankLocation.getNearest();
            if (j.llIIllIIIIlIl(bankLocation) && j.llIIllIIIIlII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[1]];
                a.a(bankLocation);
            }
            if (j.llIIllIIIIlIl(var1) && j.llIIllIIIIllI(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[0]];
                if (j.llIIllIIIIlII(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)llllIIIllI[3]);

                }
                if (j.llIIllIIIIllI(Bank.isOpen() ? 1 : 0)) {
                    if (j.llIIllIIIIlll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)llllIIIllI[0]);

                    }
                    a.a(llllIIIllI[2], llllIIIllI[4]);
                    a.a(llllIIIllI[5], llllIIIllI[0]);
                    a.a(llllIIIllI[6], llllIIIllI[7]);
                }
            }
        }
        int[] nArray2 = new int[llllIIIllI[0]];
        nArray2[j.llllIIIllI[1]] = llllIIIllI[2];
        if (j.llIIllIIIIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            j.R();
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (j.llIIllIIIllIl(Skills.getLevel((Skill)Skill.RANGED), llllIIIllI[39])) {
            bl = llllIIIllI[0];

            if (3 <= -1) {
                return false;
            }
        } else {
            bl = llllIIIllI[1];
        }
        return bl;
    }

    private static boolean llIIllIIIlllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIIllIIIIlIl(Object object) {
        return object != null;
    }

    @Override
    public int T() {
        try {
            j.Q();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((9 + 6 - -32 + 117 ^ 110 + 126 - 184 + 108) == 2) {
            return (179 + 153 - 277 + 136 ^ 85 + 91 - 48 + 30) & (0x8F ^ 0xBA ^ (0x8D ^ 0x99) ^ -1);
        }
        return llllIIIllI[38];
    }

    private static  boolean a(WorldArea worldArea, TileObject tileObject) {
        int n2;
        if (j.llIIllIIIIllI(tileObject.getName().contains(llllIIIlIl[llllIIIllI[44]]) ? 1 : 0) && j.llIIllIIIIllI(worldArea.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
            n2 = llllIIIllI[0];

            if ((0x4F ^ 0x61 ^ (0xA5 ^ 0x8F)) != (133 + 134 - 179 + 107 ^ 100 + 61 - 9 + 47)) {
                return ((0x7B ^ 0x51 ^ (0x37 ^ 0x13)) & (166 + 63 - 187 + 146 ^ 142 + 177 - 281 + 140 ^ -1)) != 0;
            }
        } else {
            n2 = llllIIIllI[1];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void R() {
        NPC var2;
        NPC var3;
        void var4;
        WorldPoint worldPoint = new WorldPoint(llllIIIllI[8], llllIIIllI[9], llllIIIllI[10]);
        WorldPoint worldPoint2 = new WorldPoint(llllIIIllI[8], llllIIIllI[9], llllIIIllI[0]);
        WorldArea worldArea = new WorldArea(llllIIIllI[11], llllIIIllI[12], llllIIIllI[13], llllIIIllI[14], llllIIIllI[0]);
        WorldArea worldArea2 = new WorldArea(llllIIIllI[11], llllIIIllI[12], llllIIIllI[13], llllIIIllI[14], llllIIIllI[0]);
        WorldArea worldArea3 = worldArea;
        WorldArea worldArea4 = new WorldArea(llllIIIllI[15], llllIIIllI[16], llllIIIllI[17], llllIIIllI[18], llllIIIllI[1]);
        WorldPoint worldPoint3 = new WorldPoint(llllIIIllI[8], llllIIIllI[19], llllIIIllI[1]);
        if (j.llIIllIIIlIIl(j.llIIllIIIlIII(e.u(), 45.0))) {
            int[] nArray = new int[llllIIIllI[0]];
            nArray[j.llllIIIllI[1]] = llllIIIllI[2];
            if (j.llIIllIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llllIIIllI[0]];
                nArray2[j.llllIIIllI[1]] = llllIIIllI[2];
                Inventory.getFirst((int[])nArray2).interact(llllIIIlIl[llllIIIllI[10]]);
                Time.sleepTicks((int)llllIIIllI[0]);

            }
        }
        if (j.llIIllIIIIlII(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var5;
            AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[20]];
            var3 = new WorldArea(llllIIIllI[21], llllIIIllI[22], llllIIIllI[23], llllIIIllI[24], llllIIIllI[1]);
            if (j.llIIllIIIIlII(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var2 = new WorldPoint(llllIIIllI[25], llllIIIllI[26], llllIIIllI[1]);
                if (j.llIIllIIIlIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var2), llllIIIllI[27])) {
                    Movement.walkTo((WorldPoint)var2);

                    Time.sleepTicks((int)llllIIIllI[0]);

                }
                if (j.llIIllIIIlIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var2), llllIIIllI[27])) {
                    String[] stringArray = new String[llllIIIllI[0]];
                    stringArray[j.llllIIIllI[1]] = llllIIIlIl[llllIIIllI[28]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIIIlIl[llllIIIllI[29]]);
                    Time.sleepTicks((int)llllIIIllI[20]);

                }
            }
            if (j.llIIllIIIIllI(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && j.llIIllIIIIlII(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void var6;
                Movement.walkTo((WorldPoint)var6);

                Time.sleepTicks((int)llllIIIllI[0]);

            }
            if (j.llIIllIIIIllI(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var2 = TileObjects.getNearest(arg_0 -> j.a((WorldArea)var5, arg_0));
                if (j.llIIllIIIllII(var2)) {
                    WorldPoint[] worldPointArray = new WorldPoint[llllIIIllI[28]];
                    worldPointArray[j.llllIIIllI[1]] = new WorldPoint(llllIIIllI[8], llllIIIllI[19], llllIIIllI[1]);
                    worldPointArray[j.llllIIIllI[0]] = new WorldPoint(llllIIIllI[30], llllIIIllI[31], llllIIIllI[1]);
                    worldPointArray[j.llllIIIllI[10]] = new WorldPoint(llllIIIllI[30], llllIIIllI[32], llllIIIllI[1]);
                    worldPointArray[j.llllIIIllI[20]] = new WorldPoint(llllIIIllI[30], llllIIIllI[33], llllIIIllI[1]);
                    WorldPoint[] var7 = worldPointArray;
                    Walker.walkAlong(Arrays.asList(var7), new HashMap());

                }
                if (j.llIIllIIIIlIl(var2)) {
                    var2.interact(llllIIIlIl[llllIIIllI[27]]);
                    Time.sleepTicks((int)llllIIIllI[20]);

                }
            }
        }
        if (j.llIIllIIIIllI(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (j.llIIllIIIllII(Players.getLocal().getInteracting())) {
                AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[34]];
                var3 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (j.llIIllIIIIllI(nPC.getName().contains(llllIIIlIl[llllIIIllI[42]]) ? 1 : 0)) {
                        String[] stringArray = new String[llllIIIllI[0]];
                        stringArray[j.llllIIIllI[1]] = llllIIIlIl[llllIIIllI[43]];
                        if (j.llIIllIIIIllI(nPC.hasAction(stringArray) ? 1 : 0) && j.llIIllIIIIlII(nPC.isDead() ? 1 : 0) && j.llIIllIIIllII(nPC.getInteracting())) {
                            n2 = llllIIIllI[0];

                            if ((0x84 ^ 0x80) <= (0x6C ^ 0x68)) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = llllIIIllI[1];
                    return n2 != 0;
                });
                var2 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (j.llIIllIIIIllI(nPC.getName().contains(llllIIIlIl[llllIIIllI[40]]) ? 1 : 0) && j.llIIllIIIIlII(nPC.isDead() ? 1 : 0)) {
                        String[] stringArray = new String[llllIIIllI[0]];
                        stringArray[j.llllIIIllI[1]] = llllIIIlIl[llllIIIllI[41]];
                        if (j.llIIllIIIIllI(nPC.hasAction(stringArray) ? 1 : 0) && j.llIIllIIIlllI(nPC.getInteracting(), Players.getLocal())) {
                            n2 = llllIIIllI[0];

                            if (((0xA1 ^ 0x86 ^ (0x74 ^ 0x10)) & (200 + 135 - 88 + 8 ^ 181 + 25 - 139 + 121 ^ -1)) < 2) return n2 != 0;
                            return ((0x12 ^ 0x69 ^ (0x70 ^ 0x5F)) & (58 + 67 - -28 + 67 ^ 67 + 22 - 51 + 98 ^ -1)) != 0;
                        }
                    }
                    n2 = llllIIIllI[1];
                    return n2 != 0;
                });
                if (j.llIIllIIIIlIl(var3) && j.llIIllIIIllII(var2)) {
                    AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[35]];
                    var3.interact(llllIIIlIl[llllIIIllI[36]]);
                    Time.sleepTicks((int)llllIIIllI[10]);

                }
                if (j.llIIllIIIIlIl(var2)) {
                    AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[7]];
                    var2.interact(llllIIIlIl[llllIIIllI[13]]);
                    Time.sleepTicks((int)llllIIIllI[20]);

                }
            }
            if (j.llIIllIIIIlIl(Players.getLocal().getInteracting())) {
                AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[37]];
                Time.sleepTicks((int)llllIIIllI[0]);

            }
        }
    }

    private static void llIIllIIIIIlI() {
        llllIIIlIl = new String[llllIIIllI[45]];
        j.llllIIIlIl[j.llllIIIllI[1]] = "Navigating to bank";
        j.llllIIIlIl[j.llllIIIllI[0]] = "Handling banking";
        j.llllIIIlIl[j.llllIIIllI[10]] = "Eat";
        j.llllIIIlIl[j.llllIIIllI[20]] = "Nav to souls";
        j.llllIIIlIl[j.llllIIIllI[28]] = "Soul Wars Portal";
        j.llllIIIlIl[j.llllIIIllI[29]] = "Enter";
        j.llllIIIlIl[j.llllIIIllI[27]] = "Climb-up";
        j.llllIIIlIl[j.llllIIIllI[34]] = "Fighting souls";
        j.llllIIIlIl[j.llllIIIllI[35]] = "Attacking soul";
        j.llllIIIlIl[j.llllIIIllI[36]] = "Attack";
        j.llllIIIlIl[j.llllIIIllI[7]] = "Attacking soull";
        j.llllIIIlIl[j.llllIIIllI[13]] = "Attack";
        j.llllIIIlIl[j.llllIIIllI[37]] = "In combat";
        j.llllIIIlIl[j.llllIIIllI[14]] = "Forgotten Souls";
        j.llllIIIlIl[j.llllIIIllI[40]] = "Soul";
        j.llllIIIlIl[j.llllIIIllI[41]] = "Attack";
        j.llllIIIlIl[j.llllIIIllI[42]] = "Soul";
        j.llllIIIlIl[j.llllIIIllI[43]] = "Attack";
        j.llllIIIlIl[j.llllIIIllI[44]] = "Staircase";
    }

        return String.valueOf(var8);
    }

    private static boolean llIIllIIIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIllIIIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIllIIIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIllIIIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIllIIIllII(Object object) {
        return object == null;
    }

    private static boolean llIIllIIIlIIl(int n2) {
        return n2 < 0;
    }

    @Override
    public boolean S() {
        return llllIIIllI[1];
    }

    @Override
    public String U() {
        return llllIIIlIl[llllIIIllI[14]];
    }
}

