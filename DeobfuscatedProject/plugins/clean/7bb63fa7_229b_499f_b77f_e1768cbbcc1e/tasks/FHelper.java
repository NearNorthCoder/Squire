/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks;

import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.CHelper;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.EHelper;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.KHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.plugins.logout.Clues;

public class FHelper {

    public static  WorldArea I;
    static  WorldPoint J;

    private static boolean lllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean s() {
        int n2;
        int[] nArray = new int[lIll[0]];
        nArray[f.lIll[1]] = Clues.k;
        if (f.llIllI(Inventory.contains((int[])nArray) ? 1 : 0) && f.llIllI(e.A() ? 1 : 0) && f.llIlIl(Inventory.contains(item -> item.getName().contains(lIIl[lIll[61]])) ? 1 : 0) && f.llIlIl(Clues.g ? 1 : 0)) {
            n2 = lIll[0];

            if (2 < 1) {
                return false;
            }
        } else {
            n2 = lIll[1];
        }
        return n2 != 0;
    }

    private static int llIlII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    static {
        f.llIIll();
        f.llIIlI();
        I = new WorldArea(lIll[67], lIll[68], lIll[38], lIll[33], lIll[1]);
        J = new WorldPoint(lIll[69], lIll[70], lIll[1]);
    }

    private static boolean llllIl(int n2, int n3) {
        return n2 >= n3;
    }

        return String.valueOf(llllllIIIlIIIll);
    }

    private static void llIIlI() {
        lIIl = new String[lIll[71]];
        f.lIIl[f.lIll[1]] = "Eat";
        f.lIIl[f.lIll[0]] = "Nav to ham hide out";
        f.lIIl[f.lIll[2]] = "Trapdoor";
        f.lIIl[f.lIll[13]] = "Open";
        f.lIIl[f.lIll[12]] = "Pick-Lock";
        f.lIIl[f.lIll[16]] = "Climb-down";
        f.lIIl[f.lIll[17]] = "Climb-down";
        f.lIIl[f.lIll[5]] = "Picking lock";
        f.lIIl[f.lIll[20]] = "Door";
        f.lIIl[f.lIll[21]] = "Pick-lock";
        f.lIIl[f.lIll[23]] = "Pickpocketing";
        f.lIIl[f.lIll[6]] = "Pickpocket";
        f.lIIl[f.lIll[24]] = "Stunned";
        f.lIIl[f.lIll[26]] = "Dropping junk";
        f.lIIl[f.lIll[28]] = "Bronze axe";
        f.lIIl[f.lIll[29]] = "Bronze dagger";
        f.lIIl[f.lIll[30]] = "Bronze pickaxe";
        f.lIIl[f.lIll[31]] = "Iron axe";
        f.lIIl[f.lIll[32]] = "Iron dagger";
        f.lIIl[f.lIll[33]] = "Iron pickaxe";
        f.lIIl[f.lIll[34]] = "Leather body";
        f.lIIl[f.lIll[35]] = "Steel axe";
        f.lIIl[f.lIll[36]] = "Steel dagger";
        f.lIIl[f.lIll[37]] = "Steel pickaxe";
        f.lIIl[f.lIll[38]] = "Ham cloak";
        f.lIIl[f.lIll[39]] = "Ham hood";
        f.lIIl[f.lIll[25]] = "Ham gloves";
        f.lIIl[f.lIll[40]] = "Ham robe";
        f.lIIl[f.lIll[41]] = "Ham shirt";
        f.lIIl[f.lIll[42]] = "Buttons";
        f.lIIl[f.lIll[43]] = "Damaged armour";
        f.lIIl[f.lIll[44]] = "Rusty sword";
        f.lIIl[f.lIll[45]] = "Feather";
        f.lIIl[f.lIll[46]] = "Logs";
        f.lIIl[f.lIll[27]] = "Thread";
        f.lIIl[f.lIll[47]] = "Cowhide";
        f.lIIl[f.lIll[48]] = "Knife";
        f.lIIl[f.lIll[49]] = "Needle";
        f.lIIl[f.lIll[50]] = "Raw anchovies";
        f.lIIl[f.lIll[51]] = "Raw chicken";
        f.lIIl[f.lIll[52]] = "Tinderbox";
        f.lIIl[f.lIll[53]] = "Uncut opal";
        f.lIIl[f.lIll[54]] = "Coal";
        f.lIIl[f.lIll[55]] = "Iron ore";
        f.lIIl[f.lIll[56]] = "Uncut jade";
        f.lIIl[f.lIll[57]] = "Grimy guam leaf";
        f.lIIl[f.lIll[58]] = "Grimy marrentill";
        f.lIIl[f.lIll[59]] = "Grimy tarromin";
        f.lIIl[f.lIll[60]] = "Got a clue";
        f.lIIl[f.lIll[61]] = "Reward casket";
        f.lIIl[f.lIll[62]] = "Clue";
        f.lIIl[f.lIll[63]] = "master";
        f.lIIl[f.lIll[64]] = "H.A.M.";
        f.lIIl[f.lIll[65]] = "Pickpocket";
        f.lIIl[f.lIll[66]] = "Trapdoor";
        f.lIIl[f.lIll[9]] = "Climb-down";
    }

    private static boolean llIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllIlI(Object object) {
        return object != null;
    }

    public static void E() {
        if (f.llIlIl(f.s() ? 1 : 0)) {
            e.w();
        }
        if (f.llIllI(f.s() ? 1 : 0)) {
            WorldArea llllllIIIllIllI;
            if (f.llIlll(f.llIlII(k.ae(), 70.0))) {
                int[] nArray = new int[lIll[0]];
                nArray[f.lIll[1]] = Clues.k;
                if (f.llIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIll[0]];
                    nArray2[f.lIll[1]] = Clues.k;
                    Inventory.getFirst((int[])nArray2).interact(lIIl[lIll[1]]);
                    Time.sleepTicks((int)lIll[2]);

                }
            }
            WorldArea llllllIIIllIlll = new WorldArea(lIll[3], lIll[4], lIll[5], lIll[6], lIll[1]);
            if (f.llIlIl(I.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Clues.c = lIIl[lIll[0]];
                llllllIIIllIllI = new WorldArea(lIll[7], lIll[4], lIll[8], lIll[9], lIll[1]);
                if (f.llIlIl(llllllIIIllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint llllllIIIllIlIl = new WorldPoint(lIll[10], lIll[11], lIll[1]);
                    if (f.lllIII(Players.getLocal().getWorldLocation().distanceTo(llllllIIIllIlIl), lIll[12])) {
                        Movement.walkTo((WorldPoint)llllllIIIllIlIl);

                        Time.sleepTicks((int)lIll[0]);

                    }
                    if (f.lllIIl(Players.getLocal().getWorldLocation().distanceTo(llllllIIIllIlIl), lIll[12])) {
                        String[] stringArray = new String[lIll[0]];
                        stringArray[f.lIll[1]] = lIIl[lIll[2]];
                        TileObject llllllIIIllIlII = TileObjects.getNearest((String[])stringArray);
                        if (f.lllIlI(llllllIIIllIlII)) {
                            String[] stringArray2 = new String[lIll[0]];
                            stringArray2[f.lIll[1]] = lIIl[lIll[13]];
                            if (f.llIllI(llllllIIIllIlII.hasAction(stringArray2) ? 1 : 0)) {
                                llllllIIIllIlII.interact(lIIl[lIll[12]]);
                                Time.sleepUntil(() -> {
                                    String[] stringArray = new String[lIll[0]];
                                    stringArray[f.lIll[1]] = lIIl[lIll[66]];
                                    String[] stringArray2 = new String[lIll[0]];
                                    stringArray2[f.lIll[1]] = lIIl[lIll[9]];
                                    return TileObjects.getNearest((String[])stringArray).hasAction(stringArray2);
                                }, (int)k.c(lIll[14], lIll[15]));

                            }
                            String[] stringArray3 = new String[lIll[0]];
                            stringArray3[f.lIll[1]] = lIIl[lIll[16]];
                            if (f.llIllI(llllllIIIllIlII.hasAction(stringArray3) ? 1 : 0)) {
                                llllllIIIllIlII.interact(lIIl[lIll[17]]);
                                Time.sleepUntil(() -> llllllIIIllIllI.contains(Players.getLocal().getWorldLocation()), (int)k.c(lIll[18], lIll[19]));

                            }
                        }
                    }
                }
                if (f.llIllI(llllllIIIllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (f.llIllI(llllllIIIllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Clues.c = lIIl[lIll[5]];
                        String[] stringArray = new String[lIll[0]];
                        stringArray[f.lIll[1]] = lIIl[lIll[20]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIl[lIll[21]]);
                        Time.sleepTicks((int)lIll[12]);

                    }
                    if (f.llIlIl(llllllIIIllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)J);

                        Time.sleepTicks((int)lIll[0]);

                    }
                }
            }
            if (f.llIllI(I.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && f.lllIlI(llllllIIIllIllI = NPCs.getNearest(nPC -> {
                int n2;
                if (f.llIllI(nPC.getName().contains(lIIl[lIll[64]]) ? 1 : 0) && f.llIllI(I.contains((Locatable)nPC) ? 1 : 0)) {
                    String[] stringArray = new String[lIll[0]];
                    stringArray[f.lIll[1]] = lIIl[lIll[65]];
                    if (f.llIllI(nPC.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIll[0];

                        if (2 != 0) return n2 != 0;
                        return ((0x29 ^ 0x11 ^ (0x37 ^ 0x12)) & (0xC5 ^ 0xA8 ^ (0xEE ^ 0x9E) ^ -1)) != 0;
                    }
                }
                n2 = lIll[1];
                return n2 != 0;
            }))) {
                if (f.llIlIl(Reachable.isInteractable((Locatable)llllllIIIllIllI) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)llllllIIIllIllI.getWorldLocation());

                    Time.sleepTicks((int)lIll[0]);

                }
                if (f.llIllI(Reachable.isInteractable((Locatable)llllllIIIllIllI) ? 1 : 0)) {
                    if (f.lllIll(Players.getLocal().getGraphic(), lIll[22])) {
                        Clues.c = lIIl[lIll[23]];
                        llllllIIIllIllI.interact(lIIl[lIll[6]]);
                        Time.sleepTicks((int)k.c(lIll[0], lIll[2]));

                    }
                    if (f.llllII(Players.getLocal().getGraphic(), lIll[22])) {
                        Clues.c = lIIl[lIll[24]];
                    }
                }
            }
            if (f.llllIl(Inventory.getAll().size(), lIll[25])) {
                Clues.c = lIIl[lIll[26]];
                WorldArea worldArea = new String[lIll[27]];
                worldArea[f.lIll[1]] = lIIl[lIll[28]];
                worldArea[f.lIll[0]] = lIIl[lIll[29]];
                worldArea[f.lIll[2]] = lIIl[lIll[30]];
                worldArea[f.lIll[13]] = lIIl[lIll[31]];
                worldArea[f.lIll[12]] = lIIl[lIll[32]];
                worldArea[f.lIll[16]] = lIIl[lIll[33]];
                worldArea[f.lIll[17]] = lIIl[lIll[34]];
                worldArea[f.lIll[5]] = lIIl[lIll[35]];
                worldArea[f.lIll[20]] = lIIl[lIll[36]];
                worldArea[f.lIll[21]] = lIIl[lIll[37]];
                worldArea[f.lIll[23]] = lIIl[lIll[38]];
                worldArea[f.lIll[6]] = lIIl[lIll[39]];
                worldArea[f.lIll[24]] = lIIl[lIll[25]];
                worldArea[f.lIll[26]] = lIIl[lIll[40]];
                worldArea[f.lIll[28]] = lIIl[lIll[41]];
                worldArea[f.lIll[29]] = lIIl[lIll[42]];
                worldArea[f.lIll[30]] = lIIl[lIll[43]];
                worldArea[f.lIll[31]] = lIIl[lIll[44]];
                worldArea[f.lIll[32]] = lIIl[lIll[45]];
                worldArea[f.lIll[33]] = lIIl[lIll[46]];
                worldArea[f.lIll[34]] = lIIl[lIll[27]];
                worldArea[f.lIll[35]] = lIIl[lIll[47]];
                worldArea[f.lIll[36]] = lIIl[lIll[48]];
                worldArea[f.lIll[37]] = lIIl[lIll[49]];
                worldArea[f.lIll[38]] = lIIl[lIll[50]];
                worldArea[f.lIll[39]] = lIIl[lIll[51]];
                worldArea[f.lIll[25]] = lIIl[lIll[52]];
                worldArea[f.lIll[40]] = lIIl[lIll[53]];
                worldArea[f.lIll[41]] = lIIl[lIll[54]];
                worldArea[f.lIll[42]] = lIIl[lIll[55]];
                worldArea[f.lIll[43]] = lIIl[lIll[56]];
                worldArea[f.lIll[44]] = lIIl[lIll[57]];
                worldArea[f.lIll[45]] = lIIl[lIll[58]];
                worldArea[f.lIll[46]] = lIIl[lIll[59]];
                llllllIIIllIllI = worldArea;
                Inventory.getAll((String[])llllllIIIllIllI).stream().forEach(Item::drop);
            }
            if (f.llIllI(Inventory.contains(item -> {
                int n2;
                if (f.llIllI(item.getName().contains(lIIl[lIll[62]]) ? 1 : 0) && f.llIlIl(item.getName().contains(lIIl[lIll[63]]) ? 1 : 0)) {
                    n2 = lIll[0];

                    if (2 < 0) {
                        return false;
                    }
                } else {
                    n2 = lIll[1];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                System.out.println(lIIl[lIll[60]]);
                c.E = lIll[0];
                Time.sleepTicks((int)k.c(lIll[2], lIll[13]));

                return;
            }
        }
    }

    private static boolean llllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIlll(int n2) {
        return n2 < 0;
    }

    private static boolean lllllI(int n2, int n3) {
        return n2 < n3;
    }

}

