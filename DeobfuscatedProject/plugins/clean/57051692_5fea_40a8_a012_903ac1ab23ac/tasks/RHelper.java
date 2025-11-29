/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
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
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.HHelper;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.AHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.BHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.DHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.EHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.FHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.GHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.JHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
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
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class RHelper
implements K {
    public static  List<d> bp;
    public static  boolean bn;
    static  int cW;

    public static  boolean cD;
    static  WorldPoint cV;

    private static boolean lIIllIIIIIlIl(int n2) {
        return n2 == 0;
    }

    static {
        r.lIIllIIIIIIlI();
        r.lIIlIlllIllIl();
        bp = new ArrayList<d>();
        cV = new WorldPoint(lIllIIlIlI[1], lIllIIlIlI[1], lIllIIlIlI[1]);
        cW = lIllIIlIlI[1];
        String[] stringArray = new String[lIllIIlIlI[0]];
        stringArray[r.lIllIIlIlI[1]] = lIllIIlIIl[lIllIIlIlI[102]];
        cy = stringArray;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIllIIIIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean al() {
        int n2;
        int[] nArray = new int[lIllIIlIlI[0]];
        nArray[r.lIllIIlIlI[1]] = lIllIIlIlI[10];
        if (r.lIIllIIIIIIll(Inventory.contains((int[])nArray) ? 1 : 0) && r.lIIllIIIIIIll(Inventory.contains(item -> item.getName().contains(lIllIIlIIl[lIllIIlIlI[94]])) ? 1 : 0) && (!r.lIIllIIIIIlIl(Equipment.contains(item -> item.getName().contains(lIllIIlIIl[lIllIIlIlI[93]])) ? 1 : 0) || r.lIIllIIIIIIll(Inventory.contains(item -> item.getName().contains(lIllIIlIIl[lIllIIlIlI[92]])) ? 1 : 0))) {
            n2 = lIllIIlIlI[0];

            if (((0xF0 ^ 0xB7 ^ (0x57 ^ 0x32)) & (0xD0 ^ 0x99 ^ (0xDD ^ 0xB6) ^ -1)) < -1) {
                return ((0 ^ 0x6F ^ (0xD4 ^ 0x9D)) & (0x33 ^ 0x57 ^ (0xF4 ^ 0xB6) ^ -1)) != 0;
            }
        } else {
            n2 = lIllIIlIlI[1];
        }
        return n2 != 0;
    }

    @Override
    public String ae() {
        return lIllIIlIIl[lIllIIlIlI[90]];
    }

    private static  boolean b(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (r.lIIllIIIIIIll(tileObject.getName().contains(lIllIIlIIl[lIllIIlIlI[96]]) ? 1 : 0) && r.lIIllIIIIlIlI(tileObject.getWorldLocation().distanceTo(worldPoint), lIllIIlIlI[18])) {
            n2 = lIllIIlIlI[0];

            if (((0x19 ^ 0x1E ^ (0x88 ^ 0xBB)) & (71 + 65 - 27 + 28 ^ 141 + 3 - -45 + 0 ^ -1)) != 0) {
                return ((0xDA ^ 0x89 ^ (0x11 ^ 0x7C)) & (80 + 140 - 110 + 79 ^ 101 + 48 - 104 + 86 ^ -1)) != 0;
            }
        } else {
            n2 = lIllIIlIlI[1];
        }
        return n2 != 0;
    }

    private static void lIIlIlllIllIl() {
        lIllIIlIIl = new String[lIllIIlIlI[103]];
        r.lIllIIlIIl[r.lIllIIlIlI[1]] = "Finished buying items, switching back to quest";
        r.lIllIIlIIl[r.lIllIIlIlI[0]] = "Nav to bank";
        r.lIllIIlIIl[r.lIllIIlIlI[5]] = "Handling banking";
        r.lIllIIlIIl[r.lIllIIlIlI[9]] = "We are missing quest supplies, switching to BUYING";
        r.lIllIIlIIl[r.lIllIIlIlI[6]] = "We are missing quest supplies, switching to BUYING";
        r.lIllIIlIIl[r.lIllIIlIlI[14]] = "Drink";
        r.lIllIIlIIl[r.lIllIIlIlI[18]] = "Nav to osman";
        r.lIllIIlIIl[r.lIllIIlIlI[19]] = "Osman";
        r.lIllIIlIIl[r.lIllIIlIlI[20]] = "Is there anything I can help you with?";
        r.lIllIIlIIl[r.lIllIIlIlI[24]] = "Nav to apprentice";
        r.lIllIIlIIl[r.lIllIIlIlI[8]] = "Open";
        r.lIllIIlIIl[r.lIllIIlIlI[25]] = "Apprentice";
        r.lIllIIlIIl[r.lIllIIlIlI[26]] = "Surely there must be upsides to the task?";
        r.lIllIIlIIl[r.lIllIIlIlI[27]] = "Oh, you can talk to me. I can see you're having a bad day.";
        r.lIllIIlIIl[r.lIllIIlIlI[28]] = "A sympathetic ear can do wonders.";
        r.lIllIIlIIl[r.lIllIIlIlI[29]] = "You mentioned something about the garden.";
        r.lIllIIlIIl[r.lIllIIlIlI[30]] = "Wow, cast the spell on me. It will be good Magic training for you.";
        r.lIllIIlIIl[r.lIllIIlIlI[35]] = "Nav to apprentice";
        r.lIllIIlIIl[r.lIllIIlIlI[36]] = "Open";
        r.lIllIIlIIl[r.lIllIIlIlI[37]] = "Clicking teleport";
        r.lIllIIlIIl[r.lIllIIlIlI[38]] = "Apprentice";
        r.lIllIIlIIl[r.lIllIIlIlI[39]] = "Teleport";
        r.lIllIIlIIl[r.lIllIIlIlI[44]] = "Entering garden";
        r.lIllIIlIIl[r.lIllIIlIlI[12]] = "Open";
        r.lIllIIlIIl[r.lIllIIlIlI[42]] = "Waiting for npc to turn its back";
        r.lIllIIlIIl[r.lIllIIlIlI[62]] = "Run to first tile";
        r.lIllIIlIIl[r.lIllIIlIlI[67]] = "Waiting for npcs to be positioned";
        r.lIllIIlIIl[r.lIllIIlIlI[69]] = "Run to 2nd tile";
        r.lIllIIlIIl[r.lIllIIlIlI[72]] = "Run to third tile";
        r.lIllIIlIIl[r.lIllIIlIlI[79]] = "Picking herbs";
        r.lIllIIlIIl[r.lIllIIlIlI[80]] = "Pick";
        r.lIllIIlIIl[r.lIllIIlIlI[81]] = "Picking herbs";
        r.lIllIIlIIl[r.lIllIIlIlI[82]] = "Pick";
        r.lIllIIlIIl[r.lIllIIlIlI[90]] = "Sorceress's Garden";
        r.lIllIIlIIl[r.lIllIIlIlI[91]] = "ring of wealth (";
        r.lIllIIlIIl[r.lIllIIlIlI[92]] = "dueling";
        r.lIllIIlIIl[r.lIllIIlIlI[93]] = "dueling";
        r.lIllIIlIIl[r.lIllIIlIlI[94]] = "Stamina";
        r.lIllIIlIIl[r.lIllIIlIlI[95]] = "Herbs";
        r.lIllIIlIIl[r.lIllIIlIlI[96]] = "Herbs";
        r.lIllIIlIIl[r.lIllIIlIlI[87]] = "Gate";
        r.lIllIIlIIl[r.lIllIIlIlI[98]] = "Door";
        r.lIllIIlIIl[r.lIllIIlIlI[99]] = "Open";
        r.lIllIIlIIl[r.lIllIIlIlI[100]] = "Door";
        r.lIllIIlIIl[r.lIllIIlIlI[101]] = "Open";
        r.lIllIIlIIl[r.lIllIIlIlI[102]] = "Yes.";
    }

    private static boolean lIIllIIIIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIllIIIIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIllIIIIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void O() {
        block11: {
            d var2;
            block10: {
                block9: {
                    block8: {
                        Predicate<Item> var3;
                        int[] nArray = new int[lIllIIlIlI[0]];
                        nArray[r.lIllIIlIlI[1]] = lIllIIlIlI[11];
                        if (r.lIIllIIIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(lIllIIlIlI[11], lIllIIlIlI[0], e.c(lIllIIlIlI[83], lIllIIlIlI[50]));
                            bp.add(d2);

                        }
                        if (r.lIIllIIIIIlIl(Bank.contains(var3 = item -> item.getName().toLowerCase().contains(lIllIIlIIl[lIllIIlIlI[91]])) ? 1 : 0)) {
                            var2 = new DHelper(lIllIIlIlI[84], lIllIIlIlI[14], lIllIIlIlI[85]);
                            bp.add(var2);

                        }
                        int[] nArray2 = new int[lIllIIlIlI[0]];
                        nArray2[r.lIllIIlIlI[1]] = lIllIIlIlI[7];
                        if (!r.lIIllIIIIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) break block8;
                        int[] nArray3 = new int[lIllIIlIlI[0]];
                        nArray3[r.lIllIIlIlI[1]] = lIllIIlIlI[7];
                        if (!r.lIIllIIIIIIll(Bank.contains((int[])nArray3) ? 1 : 0)) break block9;
                        int[] nArray4 = new int[lIllIIlIlI[0]];
                        nArray4[r.lIllIIlIlI[1]] = lIllIIlIlI[7];
                        if (!r.lIIllIIIIIlII(Bank.getFirst((int[])nArray4).getQuantity(), lIllIIlIlI[86])) break block9;
                    }
                    var2 = new DHelper(lIllIIlIlI[7], lIllIIlIlI[86], j.bZ);
                    bp.add(var2);

                }
                int[] nArray = new int[lIllIIlIlI[0]];
                nArray[r.lIllIIlIlI[1]] = lIllIIlIlI[10];
                if (!r.lIIllIIIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block10;
                int[] nArray5 = new int[lIllIIlIlI[0]];
                nArray5[r.lIllIIlIlI[1]] = lIllIIlIlI[10];
                if (!r.lIIllIIIIIIll(Bank.contains((int[])nArray5) ? 1 : 0)) break block11;
                int[] nArray6 = new int[lIllIIlIlI[0]];
                nArray6[r.lIllIIlIlI[1]] = lIllIIlIlI[10];
                if (!r.lIIllIIIIIlII(Bank.getFirst((int[])nArray6).getQuantity(), lIllIIlIlI[29])) break block11;
            }
            var2 = new DHelper(lIllIIlIlI[10], lIllIIlIlI[87], lIllIIlIlI[88]);
            bp.add(var2);

        }
    }

    private static boolean aV() {
        int n2;
        WorldArea worldArea = new WorldArea(lIllIIlIlI[40], lIllIIlIlI[41], lIllIIlIlI[36], lIllIIlIlI[42], lIllIIlIlI[1]);
        if (r.lIIllIIIIIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.lIIllIIIIlIlI(Players.getLocal().getWorldLocation().getX(), lIllIIlIlI[43])) {
            n2 = lIllIIlIlI[0];

            if (3 <= 0) {
                return false;
            }
        } else {
            n2 = lIllIIlIlI[1];
        }
        return n2 != 0;
    }

    private static boolean lIIllIIIIIlll(Object object) {
        return object != null;
    }

    private static void aW() {
        if (r.lIIllIIIIIlIl(r.aV() ? 1 : 0)) {
            AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[44]];
            int[] nArray = new int[lIllIIlIlI[6]];
            nArray[r.lIllIIlIlI[1]] = lIllIIlIlI[45];
            nArray[r.lIllIIlIlI[0]] = lIllIIlIlI[46];
            nArray[r.lIllIIlIlI[5]] = lIllIIlIlI[47];
            nArray[r.lIllIIlIlI[9]] = lIllIIlIlI[48];
            int[] nArray2 = nArray;
            if (r.lIIllIIIIIIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                Inventory.getAll((int[])nArray2).stream().forEach(Item::drop);
                Time.sleepTicks((int)lIllIIlIlI[0]);

            }
            TileObjects.getNearest(tileObject -> {
                int n2;
                if (r.lIIllIIIIIIll(tileObject.getName().contains(lIllIIlIIl[lIllIIlIlI[87]]) ? 1 : 0) && r.lIIllIIIIlIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIllIIlIlI[97], lIllIIlIlI[60], lIllIIlIlI[1])), lIllIIlIlI[5])) {
                    n2 = lIllIIlIlI[0];

                    if (-1 != -1) {
                        return false;
                    }
                } else {
                    n2 = lIllIIlIlI[1];
                }
                return n2 != 0;
            }).interact(lIllIIlIIl[lIllIIlIlI[12]]);
            Time.sleepUntil(() -> r.aV(), (int)e.c(lIllIIlIlI[49], lIllIIlIlI[50]));

        }
        if (r.lIIllIIIIIIll(r.aV() ? 1 : 0)) {
            WorldPoint var4;
            TileObject var5;
            WorldArea var6;
            WorldArea var7;
            WorldArea var8;
            WorldArea var9;
            int[] nArray = new int[lIllIIlIlI[0]];
            nArray[r.lIllIIlIlI[1]] = lIllIIlIlI[51];
            NPC var10 = NPCs.getNearest((int[])nArray);
            int[] nArray3 = new int[lIllIIlIlI[0]];
            nArray3[r.lIllIIlIlI[1]] = lIllIIlIlI[52];
            NPC var11 = NPCs.getNearest((int[])nArray3);
            int[] nArray4 = new int[lIllIIlIlI[0]];
            nArray4[r.lIllIIlIlI[1]] = lIllIIlIlI[53];
            NPC var12 = NPCs.getNearest((int[])nArray4);
            int[] nArray5 = new int[lIllIIlIlI[0]];
            nArray5[r.lIllIIlIlI[1]] = lIllIIlIlI[54];
            NPC var13 = NPCs.getNearest((int[])nArray5);
            WorldArea var14 = new WorldArea(lIllIIlIlI[55], lIllIIlIlI[56], lIllIIlIlI[14], lIllIIlIlI[14], lIllIIlIlI[1]);
            if (r.lIIllIIIIIIll(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.lIIllIIIIIlll(var10)) {
                var9 = new WorldArea(lIllIIlIlI[57], lIllIIlIlI[58], lIllIIlIlI[14], lIllIIlIlI[6], lIllIIlIlI[1]);
                if (r.lIIllIIIIIlIl(var9.contains((Locatable)var10) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[42]];
                    var8 = new WorldPoint(lIllIIlIlI[59], lIllIIlIlI[60], lIllIIlIlI[1]);
                    if (r.lIIllIIIIIlIl(Players.getLocal().getWorldLocation().equals((Object)var8) ? 1 : 0)) {
                        e.c((WorldPoint)var8);
                        Time.sleepTicks((int)lIllIIlIlI[0]);

                    }
                }
                if (r.lIIllIIIIIIll(var9.contains((Locatable)var10) ? 1 : 0)) {
                    var8 = new WorldPoint(lIllIIlIlI[59], lIllIIlIlI[61], lIllIIlIlI[1]);
                    if (r.lIIllIIIIIlIl(Players.getLocal().getWorldLocation().equals((Object)var8) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[62]];
                        e.c((WorldPoint)var8);
                        Time.sleepTicks((int)lIllIIlIlI[0]);

                    }
                }
            }
            var9 = new WorldArea(lIllIIlIlI[63], lIllIIlIlI[64], lIllIIlIlI[25], lIllIIlIlI[6], lIllIIlIlI[1]);
            var8 = new WorldArea(lIllIIlIlI[65], lIllIIlIlI[58], lIllIIlIlI[18], lIllIIlIlI[19], lIllIIlIlI[1]);
            WorldArea var15 = new WorldArea(lIllIIlIlI[57], lIllIIlIlI[66], lIllIIlIlI[9], lIllIIlIlI[20], lIllIIlIlI[1]);
            WorldArea var16 = new WorldArea(lIllIIlIlI[65], lIllIIlIlI[60], lIllIIlIlI[6], lIllIIlIlI[6], lIllIIlIlI[1]);
            if (!r.lIIllIIIIIlIl(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || r.lIIllIIIIIIll(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var7 = new WorldArea(lIllIIlIlI[63], lIllIIlIlI[64], lIllIIlIlI[24], lIllIIlIlI[9], lIllIIlIlI[1]);
                if (r.lIIllIIIIIlll(var11) && r.lIIllIIIIIlll(var12) && r.lIIllIIIIIlll(var10)) {
                    if (!r.lIIllIIIIIIll(var7.contains((Locatable)var11) ? 1 : 0) || r.lIIllIIIIIlIl(var7.contains((Locatable)var12) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[67]];
                    }
                    if (r.lIIllIIIIIIll(var7.contains((Locatable)var11) ? 1 : 0) && r.lIIllIIIIIIll(var7.contains((Locatable)var12) ? 1 : 0) && (!r.lIIllIIIIIlIl(var15.contains((Locatable)var10) ? 1 : 0) || r.lIIllIIIIIIll(var16.contains((Locatable)var10) ? 1 : 0))) {
                        var6 = new WorldPoint(lIllIIlIlI[63], lIllIIlIlI[68], lIllIIlIlI[1]);
                        if (r.lIIllIIIIIIll(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.lIIllIIIIIlIl(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[69]];
                            e.c((WorldPoint)var6);
                            Time.sleepTicks((int)lIllIIlIlI[0]);

                        }
                    }
                }
                if (r.lIIllIIIIIIll(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.lIIllIIIIIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIllIIlIlI[63], lIllIIlIlI[68], lIllIIlIlI[1])) ? 1 : 0)) {
                    var6 = new WorldPoint(lIllIIlIlI[70], lIllIIlIlI[71], lIllIIlIlI[1]);
                    if (r.lIIllIIIIIlIl(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[72]];
                        e.c((WorldPoint)var6);
                        Time.sleepTicks((int)lIllIIlIlI[0]);

                    }
                }
            }
            var7 = new WorldArea(lIllIIlIlI[73], lIllIIlIlI[74], lIllIIlIlI[8], lIllIIlIlI[29], lIllIIlIlI[1]);
            var6 = new WorldArea(lIllIIlIlI[73], lIllIIlIlI[75], lIllIIlIlI[6], lIllIIlIlI[19], lIllIIlIlI[1]);
            WorldPoint var17 = new WorldPoint(lIllIIlIlI[70], lIllIIlIlI[71], lIllIIlIlI[1]);
            if (r.lIIllIIIIIIll(Players.getLocal().getWorldLocation().equals((Object)var17) ? 1 : 0) && r.lIIllIIIIIlll(var13) && (r.lIIllIIIIlIll(var13.getOrientation(), lIllIIlIlI[76]) && !r.lIIllIIIIIlII(var13.getWorldLocation().getX(), lIllIIlIlI[77]) || r.lIIllIIIIlIll(var13.getOrientation(), lIllIIlIlI[78]) && r.lIIllIIIIIllI(var13.getWorldLocation().getX(), lIllIIlIlI[57])) && r.lIIllIIIIIlll(var5 = TileObjects.getNearest(arg_0 -> r.b(var4 = new WorldPoint(lIllIIlIlI[63], lIllIIlIlI[56], lIllIIlIlI[1]), arg_0)))) {
                AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[79]];
                var5.interact(lIllIIlIIl[lIllIIlIlI[80]]);
                Time.sleepTicks((int)lIllIIlIlI[5]);

            }
            if ((!r.lIIllIIIIIlIl(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || r.lIIllIIIIIIll(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && r.lIIllIIIIIlll(var5 = TileObjects.getNearest(arg_0 -> r.a(var4 = new WorldPoint(lIllIIlIlI[63], lIllIIlIlI[56], lIllIIlIlI[1]), arg_0)))) {
                AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[81]];
                var5.interact(lIllIIlIIl[lIllIIlIlI[82]]);
                Time.sleepTicks((int)lIllIIlIlI[5]);

            }
        }
    }

    @Override
    public int ad() {
        try {
            r.aU();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 > 2) {
            return (77 + 125 - 158 + 174 ^ 146 + 140 - 185 + 98) & (0x2C ^ 0x57 ^ (0xD0 ^ 0xB6) ^ -1);
        }
        return lIllIIlIlI[89];
    }

    private static boolean lIIllIIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static  boolean a(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (r.lIIllIIIIIIll(tileObject.getName().contains(lIllIIlIIl[lIllIIlIlI[95]]) ? 1 : 0) && r.lIIllIIIIlIlI(tileObject.getWorldLocation().distanceTo(worldPoint), lIllIIlIlI[18])) {
            n2 = lIllIIlIlI[0];

            if (2 == (0x50 ^ 0x57 ^ 3)) {
                return ((198 + 174 - 235 + 87 ^ 71 + 66 - 132 + 172) & (0xF1 ^ 0xBF ^ (0x8C ^ 0x93) ^ -1)) != 0;
            }
        } else {
            n2 = lIllIIlIlI[1];
        }
        return n2 != 0;
    }

    private static boolean lIIllIIIIIIll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean af() {
        boolean bl;
        if (r.lIIllIIIIIllI(Skills.getLevel((Skill)Skill.FARMING), lIllIIlIlI[91])) {
            bl = lIllIIlIlI[0];

            if (-(48 + 58 - 57 + 107 ^ 20 + 68 - 16 + 81) >= 0) {
                return ((0x18 ^ 0x48 ^ 1) & (0x52 ^ 0x6F ^ (0x7C ^ 0x10) ^ -1)) != 0;
            }
        } else {
            bl = lIllIIlIlI[1];
        }
        return bl;
    }

    private static boolean lIIllIIIIllII(Object object) {
        return object == null;
    }

    @Override
    public boolean ac() {
        return lIllIIlIlI[1];
    }

    private static boolean lIIllIIIIlIII(int n2) {
        return n2 > 0;
    }

    public static void aU() {
        if (r.lIIllIIIIIIll(bn ? 1 : 0)) {
            b.a(bp);
            if (r.lIIllIIIIIlII(bp.size(), lIllIIlIlI[0])) {
                System.out.println(lIllIIlIIl[lIllIIlIlI[1]]);
                bn = lIllIIlIlI[1];
            }
        }
        if (r.lIIllIIIIIlIl(bn ? 1 : 0)) {
            if (r.lIIllIIIIIlII(e.j(lIllIIlIlI[2]), lIllIIlIlI[3])) {
                H.cH();
            }
            if (r.lIIllIIIIIllI(e.j(lIllIIlIlI[2]), lIllIIlIlI[3])) {
                BankLocation var18;
                if (r.lIIllIIIIIlIl(r.al() ? 1 : 0)) {
                    var18 = BankLocation.getNearest();
                    if (r.lIIllIIIIIlll(var18) && r.lIIllIIIIIlIl(var18.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[0]];
                        a.a(var18);
                    }
                    if (r.lIIllIIIIIlll(var18) && r.lIIllIIIIIIll(var18.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (r.lIIllIIIIIlIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIlIlI[4]);

                        }
                        if (r.lIIllIIIIIIll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[5]];
                            if (r.lIIllIIIIlIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIllIIlIlI[6]);

                            }
                            if (r.lIIllIIIIlIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIllIIlIlI[5]);

                            }
                            int[] nArray = new int[lIllIIlIlI[0]];
                            nArray[r.lIllIIlIlI[1]] = lIllIIlIlI[7];
                            if (r.lIIllIIIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIllIIlIlI[0]];
                                nArray2[r.lIllIIlIlI[1]] = lIllIIlIlI[7];
                                if (r.lIIllIIIIIlII(Bank.getFirst((int[])nArray2).getQuantity(), lIllIIlIlI[8])) {
                                    r.O();
                                    System.out.println(lIllIIlIIl[lIllIIlIlI[9]]);
                                    bn = lIllIIlIlI[0];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lIllIIlIlI[9]];
                            nArray3[r.lIllIIlIlI[1]] = lIllIIlIlI[10];
                            nArray3[r.lIllIIlIlI[0]] = lIllIIlIlI[7];
                            nArray3[r.lIllIIlIlI[5]] = lIllIIlIlI[11];
                            if (r.lIIllIIIIIlIl(e.b(nArray3) ? 1 : 0)) {
                                r.O();
                                System.out.println(lIllIIlIIl[lIllIIlIlI[6]]);
                                bn = lIllIIlIlI[0];
                                return;
                            }
                            int[] nArray4 = new int[lIllIIlIlI[9]];
                            nArray4[r.lIllIIlIlI[1]] = lIllIIlIlI[10];
                            nArray4[r.lIllIIlIlI[0]] = lIllIIlIlI[7];
                            nArray4[r.lIllIIlIlI[5]] = lIllIIlIlI[11];
                            if (r.lIIllIIIIIIll(e.b(nArray4) ? 1 : 0)) {
                                a.a(lIllIIlIlI[10], lIllIIlIlI[8]);
                                a.a(lIllIIlIlI[7], lIllIIlIlI[12]);
                                a.a(lIllIIlIlI[11], lIllIIlIlI[0]);
                            }
                        }
                    }
                }
                if (r.lIIllIIIIIIll(Inventory.contains((int[])f.aU) ? 1 : 0) && r.lIIllIIIIIlII(Movement.getRunEnergy(), lIllIIlIlI[13])) {
                    Inventory.getFirst((int[])f.aU).interact(lIllIIlIIl[lIllIIlIlI[14]]);
                    Time.sleepTicks((int)lIllIIlIlI[0]);

                }
                if (r.lIIllIIIIIIll(r.al() ? 1 : 0)) {
                    TileObject var19;
                    e.l(lIllIIlIlI[11]);
                    if (r.lIIllIIIIIlII(Vars.getBit((int)lIllIIlIlI[15]), lIllIIlIlI[0])) {
                        var18 = new WorldPoint(lIllIIlIlI[16], lIllIIlIlI[17], lIllIIlIlI[1]);
                        if (r.lIIllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var18), lIllIIlIlI[8])) {
                            AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[18]];
                            Movement.walkTo((WorldPoint)var18);

                            Time.sleepTicks((int)lIllIIlIlI[0]);

                        }
                        if (r.lIIllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var18), lIllIIlIlI[8])) {
                            String[] stringArray = new String[lIllIIlIlI[0]];
                            stringArray[r.lIllIIlIlI[1]] = lIllIIlIIl[lIllIIlIlI[20]];
                            g.a(lIllIIlIIl[lIllIIlIlI[19]], stringArray);
                        }
                    }
                    if (r.lIIllIIIIlIll(Vars.getBit((int)lIllIIlIlI[15]), lIllIIlIlI[0]) && r.lIIllIIIIIlIl(Vars.getBit((int)lIllIIlIlI[21]))) {
                        var18 = new WorldPoint(lIllIIlIlI[22], lIllIIlIlI[23], lIllIIlIlI[1]);
                        if (r.lIIllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var18), lIllIIlIlI[19])) {
                            AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[24]];
                            Movement.walkTo((WorldPoint)var18);

                            Time.sleepTicks((int)lIllIIlIlI[0]);

                        }
                        if (r.lIIllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var18), lIllIIlIlI[19])) {
                            var19 = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (r.lIIllIIIIIIll(tileObject.getName().contains(lIllIIlIIl[lIllIIlIlI[100]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIlI[0]];
                                    stringArray[r.lIllIIlIlI[1]] = lIllIIlIIl[lIllIIlIlI[101]];
                                    if (r.lIIllIIIIIIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                        n2 = lIllIIlIlI[0];

                                        if (null == null) return n2 != 0;
                                        return false;
                                    }
                                }
                                n2 = lIllIIlIlI[1];
                                return n2 != 0;
                            });
                            if (r.lIIllIIIIIlll(var19)) {
                                var19.interact(lIllIIlIIl[lIllIIlIlI[8]]);
                                Time.sleepTicks((int)lIllIIlIlI[6]);

                            }
                            if (r.lIIllIIIIllII(var19)) {
                                String[] stringArray = new String[lIllIIlIlI[14]];
                                stringArray[r.lIllIIlIlI[1]] = lIllIIlIIl[lIllIIlIlI[26]];
                                stringArray[r.lIllIIlIlI[0]] = lIllIIlIIl[lIllIIlIlI[27]];
                                stringArray[r.lIllIIlIlI[5]] = lIllIIlIIl[lIllIIlIlI[28]];
                                stringArray[r.lIllIIlIlI[9]] = lIllIIlIIl[lIllIIlIlI[29]];
                                stringArray[r.lIllIIlIlI[6]] = lIllIIlIIl[lIllIIlIlI[30]];
                                g.a(lIllIIlIIl[lIllIIlIlI[25]], stringArray);
                            }
                        }
                    }
                    if (r.lIIllIIIIlIll(Vars.getBit((int)lIllIIlIlI[15]), lIllIIlIlI[0]) && r.lIIllIIIIlIll(Vars.getBit((int)lIllIIlIlI[21]), lIllIIlIlI[0])) {
                        var18 = new WorldArea(lIllIIlIlI[31], lIllIIlIlI[32], lIllIIlIlI[33], lIllIIlIlI[34], lIllIIlIlI[1]);
                        if (r.lIIllIIIIIlIl(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            var19 = new WorldPoint(lIllIIlIlI[22], lIllIIlIlI[23], lIllIIlIlI[1]);
                            if (r.lIIllIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var19), lIllIIlIlI[19])) {
                                AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[35]];
                                Movement.walkTo((WorldPoint)var19);

                                Time.sleepTicks((int)lIllIIlIlI[0]);

                            }
                            if (r.lIIllIIIIlIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var19), lIllIIlIlI[19])) {
                                TileObject var20 = TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (r.lIIllIIIIIIll(tileObject.getName().contains(lIllIIlIIl[lIllIIlIlI[98]]) ? 1 : 0)) {
                                        String[] stringArray = new String[lIllIIlIlI[0]];
                                        stringArray[r.lIllIIlIlI[1]] = lIllIIlIIl[lIllIIlIlI[99]];
                                        if (r.lIIllIIIIIIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                            n2 = lIllIIlIlI[0];

                                            if ((30 + 68 - 7 + 44 ^ 61 + 44 - 47 + 72) > 0) return n2 != 0;
                                            return ((0x7E ^ 0x7B ^ (0x19 ^ 0x39)) & (67 + 141 - 151 + 106 ^ 35 + 64 - -17 + 18 ^ -1)) != 0;
                                        }
                                    }
                                    n2 = lIllIIlIlI[1];
                                    return n2 != 0;
                                });
                                if (r.lIIllIIIIIlll(var20)) {
                                    var20.interact(lIllIIlIIl[lIllIIlIlI[36]]);
                                    Time.sleepTicks((int)lIllIIlIlI[6]);

                                }
                                if (r.lIIllIIIIllII(var20)) {
                                    AccBuilderShamans.c = lIllIIlIIl[lIllIIlIlI[37]];
                                    String[] stringArray = new String[lIllIIlIlI[0]];
                                    stringArray[r.lIllIIlIlI[1]] = lIllIIlIIl[lIllIIlIlI[38]];
                                    NPCs.getNearest((String[])stringArray).interact(lIllIIlIIl[lIllIIlIlI[39]]);
                                    Time.sleepTicks((int)lIllIIlIlI[6]);

                                }
                            }
                        }
                        if (r.lIIllIIIIIIll(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            r.aW();
                        }
                    }
                }
            }
        }
    }
}

