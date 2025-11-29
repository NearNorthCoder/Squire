/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class AEHelper
implements W {
    public static final  WorldPoint lD;
    
    static final  WorldPoint lI;
    private final  int lJ = 536;
    static final  WorldPoint lG;
    public static  List<d> bv;
    public static final  WorldPoint lE;
    public static final  WorldPoint lF;
    public static final  WorldPoint lC;
    public static  boolean bt;
    static final  WorldPoint lH;

    @Override
    public int T() {
        try {
            ae.dD();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((158 + 53 - 159 + 107 ^ 61 + 44 - 53 + 137) & (0x62 ^ 0x40 ^ (0x49 ^ 0x7C) & ~(0x28 ^ 0x1D) ^ -1)) >= 2) {
            return (53 + 34 - 44 + 128 ^ 2 + 95 - 69 + 139) & (66 + 95 - 37 + 21 ^ 69 + 20 - 30 + 98 ^ -1);
        }
        return lIllIIIII[74];
    }

    @Override
    public boolean S() {
        return lIllIIIII[1];
    }

    private static boolean lIIlIlIIIlIl(int n2) {
        return n2 == 0;
    }

    private static void lIIlIlIIIIIl() {
        lIlIlllII = new String[lIllIIIII[86]];
        ae.lIlIlllII[ae.lIllIIIII[1]] = "Buying items";
        ae.lIlIlllII[ae.lIllIIIII[2]] = "Finished buying items, switching back to prayer";
        ae.lIlIlllII[ae.lIllIIIII[4]] = "Navigating to bank";
        ae.lIlIlllII[ae.lIllIIIII[5]] = "Handling banking";
        ae.lIlIlllII[ae.lIllIIIII[7]] = "We are missing prayer supplies, switching to BUYING";
        ae.lIlIlllII[ae.lIllIIIII[14]] = "Drink";
        ae.lIlIlllII[ae.lIllIIIII[16]] = "Tele to wildy";
        ae.lIlIlllII[ae.lIllIIIII[18]] = "Rub";
        ae.lIlIlllII[ae.lIllIIIII[19]] = "Lava Maze";
        ae.lIlIlllII[ae.lIllIIIII[20]] = "Okay, teleport to level 41 Wilderness.";
        ae.lIlIlllII[ae.lIllIIIII[22]] = "Nav to altar";
        ae.lIlIlllII[ae.lIllIIIII[42]] = "1 tick pray";
        ae.lIlIlllII[ae.lIllIIIII[45]] = "Chaos altar";
        ae.lIlIlllII[ae.lIllIIIII[21]] = "Large door";
        ae.lIlIlllII[ae.lIllIIIII[47]] = "Open";
        ae.lIlIlllII[ae.lIllIIIII[48]] = "Open";
        ae.lIlIlllII[ae.lIllIIIII[49]] = "Open";
        ae.lIlIlllII[ae.lIllIIIII[50]] = "Chaos altar";
        ae.lIlIlllII[ae.lIllIIIII[52]] = "Nav to altar";
        ae.lIlIlllII[ae.lIllIIIII[53]] = "Unnoting bones";
        ae.lIlIlllII[ae.lIllIIIII[15]] = "Elder Chaos druid";
        ae.lIlIlllII[ae.lIllIIIII[54]] = "Large door";
        ae.lIlIlllII[ae.lIllIIIII[55]] = "Open";
        ae.lIlIlllII[ae.lIllIIIII[56]] = "Open";
        ae.lIlIlllII[ae.lIllIIIII[57]] = "Open";
        ae.lIlIlllII[ae.lIllIIIII[58]] = "Exchange";
        ae.lIlIlllII[ae.lIllIIIII[59]] = "Exchange 5";
        ae.lIlIlllII[ae.lIllIIIII[60]] = "Exchange All";
        ae.lIlIlllII[ae.lIllIIIII[61]] = "Suiciding";
        ae.lIlIlllII[ae.lIllIIIII[62]] = "Wine of zamorak";
        ae.lIlIlllII[ae.lIllIIIII[63]] = "Take";
        ae.lIlIlllII[ae.lIllIIIII[75]] = "Prayer training";
        ae.lIlIlllII[ae.lIllIIIII[76]] = "ring of wealth (";
    }

    @Override
    public String U() {
        return lIlIlllII[lIllIIIII[75]];
    }

    private static int dE() {
        int n2 = lIllIIIII[70];
        if (ae.lIIlIlIIIlII(Skills.getLevel((Skill)Skill.PRAYER), lIllIIIII[71]) && ae.lIIlIlIIlIll(Skills.getLevel((Skill)Skill.PRAYER), lIllIIIII[3])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / lIllIIIII[72] + lIllIIIII[22];
        }
        int n3 = lIllIIIII[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / lIllIIIII[72] + lIllIIIII[63];
    }

    private static void af() {
        d lllIIIIIIIlIII;
        Object lllIIIIIIIlIIl;
        int[] nArray = new int[lIllIIIII[2]];
        nArray[ae.lIllIIIII[1]] = lIllIIIII[9];
        if (ae.lIIlIlIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIllIIIII[9], lIllIIIII[14], i.bq);
            bv.add(d2);

        }
        int[] nArray2 = new int[lIllIIIII[2]];
        nArray2[ae.lIllIIIII[1]] = lIllIIIII[0];
        if (ae.lIIlIlIIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllIIIIIIIlIIl = new DHelper(lIllIIIII[0], ae.dE(), lIllIIIII[64]);
            bv.add((DHelper) llIIIIIIIlIIl);

        }
        int[] nArray3 = new int[lIllIIIII[2]];
        nArray3[ae.lIllIIIII[1]] = lIllIIIII[8];
        if (ae.lIIlIlIIIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllIIIIIIIlIIl = new DHelper(lIllIIIII[8], lIllIIIII[4], lIllIIIII[6]);
            bv.add((DHelper) llIIIIIIIlIIl);

        }
        if (ae.lIIlIlIIIlIl(Bank.contains((Predicate)(lllIIIIIIIlIIl = item -> item.getName().toLowerCase().contains(lIlIlllII[lIllIIIII[76]]))) ? 1 : 0)) {
            lllIIIIIIIlIII = new DHelper(lIllIIIII[65], lIllIIIII[14], lIllIIIII[66]);
            bv.add(lllIIIIIIIlIII);

        }
        int[] nArray4 = new int[lIllIIIII[2]];
        nArray4[ae.lIllIIIII[1]] = lIllIIIII[67];
        if (ae.lIIlIlIIIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllIIIIIIIlIII = new DHelper(lIllIIIII[67], lIllIIIII[68], lIllIIIII[69]);
            bv.add(lllIIIIIIIlIII);

        }
    }

    public static void dD() {
        block44: {
            TileItem lllIIIIIIIllll;
            block45: {
                if (ae.lIIlIlIIIIll(bt ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[1]];
                    b.a(bv);
                    if (ae.lIIlIlIIIlII(bv.size(), lIllIIIII[2])) {
                        System.out.println(lIlIlllII[lIllIIIII[2]]);
                        bt = lIllIIIII[1];
                    }
                }
                if (!ae.lIIlIlIIIlIl(bt ? 1 : 0) || !ae.lIIlIlIIIlII(Skills.getLevel((Skill)Skill.PRAYER), lIllIIIII[3])) break block44;
                if (ae.lIIlIlIIIlIl(ae.ab() ? 1 : 0) && ae.lIIlIlIIIlII(Game.getWildyLevel(), lIllIIIII[2])) {
                    lllIIIIIIIllll = BankLocation.getNearest();
                    if (ae.lIIlIlIIIllI(lllIIIIIIIllll) && ae.lIIlIlIIIlIl(lllIIIIIIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[4]];
                        a.a((BankLocation)lllIIIIIIIllll);
                    }
                    if (ae.lIIlIlIIIllI(lllIIIIIIIllll) && ae.lIIlIlIIIIll(lllIIIIIIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[5]];
                        if (ae.lIIlIlIIIlIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIIII[6]);

                        }
                        if (ae.lIIlIlIIIIll(Bank.isOpen() ? 1 : 0)) {
                            if (ae.lIIlIlIIIlll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIllIIIII[7]);

                            }
                            if (ae.lIIlIlIIIlll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIllIIIII[4]);

                            }
                            int[] nArray = new int[lIllIIIII[5]];
                            nArray[ae.lIllIIIII[1]] = lIllIIIII[8];
                            nArray[ae.lIllIIIII[2]] = lIllIIIII[0];
                            nArray[ae.lIllIIIII[4]] = lIllIIIII[9];
                            if (ae.lIIlIlIIIlIl(e.b(nArray) ? 1 : 0)) {
                                ae.af();
                                System.out.println(lIlIlllII[lIllIIIII[7]]);
                                bt = lIllIIIII[2];
                                return;
                            }
                            int[] nArray2 = new int[lIllIIIII[5]];
                            nArray2[ae.lIllIIIII[1]] = lIllIIIII[8];
                            nArray2[ae.lIllIIIII[2]] = lIllIIIII[0];
                            nArray2[ae.lIllIIIII[4]] = lIllIIIII[9];
                            if (ae.lIIlIlIIIIll(e.b(nArray2) ? 1 : 0)) {
                                if (ae.lIIlIlIIIlIl(Equipment.contains((int[])f.ba) ? 1 : 0)) {
                                    a.b(f.ba, lIllIIIII[2]);
                                }
                                a.b(f.aV, lIllIIIII[2]);
                                a.a(lIllIIIII[10], lIllIIIII[11]);
                                a.b(lIllIIIII[0], lIllIIIII[12]);
                            }
                        }
                    }
                }
                if (ae.lIIlIlIIIIll(ae.ab() ? 1 : 0)) {
                    if (ae.lIIlIlIIIIll(Inventory.contains((int[])f.aV) ? 1 : 0) && ae.lIIlIlIIIlII(Movement.getRunEnergy(), lIllIIIII[13])) {
                        Inventory.getFirst((int[])f.aV).interact(lIlIlllII[lIllIIIII[14]]);
                        Time.sleepTicks((int)lIllIIIII[2]);

                    }
                    if (ae.lIIlIlIIIlIl(Movement.isRunEnabled() ? 1 : 0) && ae.lIIlIlIIlIII(Movement.getRunEnergy(), lIllIIIII[15])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)lIllIIIII[14]);

                    }
                    if (ae.lIIlIlIIIlII(Game.getWildyLevel(), lIllIIIII[2])) {
                        AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[16]];
                        if (ae.lIIlIlIIIIll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (ae.lIIlIlIIIlIl(Dialog.isOpen() ? 1 : 0) && ae.lIIlIlIIIIll(Inventory.contains((int[])f.ba) ? 1 : 0) && ae.lIIlIlIIlIIl(Players.getLocal().getAnimation(), lIllIIIII[17])) {
                            Inventory.getFirst((int[])f.ba).interact(lIlIlllII[lIllIIIII[18]]);
                            Time.sleepTicks((int)lIllIIIII[4]);

                        }
                        String[] stringArray = new String[lIllIIIII[4]];
                        stringArray[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[19]];
                        stringArray[ae.lIllIIIII[2]] = lIlIlllII[lIllIIIII[20]];
                        g.a(stringArray);
                    }
                    if (ae.lIIlIlIIIlll(Game.getWildyLevel())) {
                        TileObject lllIIIIIIIlllI;
                        int[] nArray = new int[lIllIIIII[2]];
                        nArray[ae.lIllIIIII[1]] = lIllIIIII[0];
                        if (ae.lIIlIlIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (ae.lIIlIlIIlIII(Players.getLocal().getWorldLocation().distanceTo(lE), lIllIIIII[21])) {
                                AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[22]];
                                TileItem tileItem = new WorldPoint[lIllIIIII[21]];
                                tileItem[ae.lIllIIIII[1]] = new WorldPoint(lIllIIIII[23], lIllIIIII[24], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[2]] = new WorldPoint(lIllIIIII[25], lIllIIIII[26], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[4]] = new WorldPoint(lIllIIIII[27], lIllIIIII[28], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[5]] = new WorldPoint(lIllIIIII[29], lIllIIIII[30], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[7]] = new WorldPoint(lIllIIIII[31], lIllIIIII[32], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[14]] = new WorldPoint(lIllIIIII[33], lIllIIIII[34], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[16]] = new WorldPoint(lIllIIIII[35], lIllIIIII[36], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[18]] = new WorldPoint(lIllIIIII[37], lIllIIIII[38], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[19]] = new WorldPoint(lIllIIIII[39], lIllIIIII[38], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[20]] = new WorldPoint(lIllIIIII[40], lIllIIIII[38], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[22]] = new WorldPoint(lIllIIIII[41], lIllIIIII[38], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[42]] = new WorldPoint(lIllIIIII[43], lIllIIIII[44], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[45]] = new WorldPoint(lIllIIIII[46], lIllIIIII[44], lIllIIIII[1]);
                                lllIIIIIIIllll = tileItem;
                                Walker.walkAlong(Arrays.asList(lllIIIIIIIllll), new HashMap());

                                Time.sleepTicks((int)lIllIIIII[2]);

                            }
                            if (ae.lIIlIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo(lE), lIllIIIII[21])) {
                                AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[42]];
                                String[] stringArray = new String[lIllIIIII[2]];
                                stringArray[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[45]];
                                lllIIIIIIIllll = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[lIllIIIII[2]];
                                stringArray2[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[21]];
                                lllIIIIIIIlllI = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[lIllIIIII[2]];
                                stringArray3[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[47]];
                                if (ae.lIIlIlIIIIll(lllIIIIIIIlllI.hasAction(stringArray3) ? 1 : 0)) {
                                    lllIIIIIIIlllI.interact(lIlIlllII[lIllIIIII[48]]);
                                }
                                if (ae.lIIlIlIIIllI(lllIIIIIIIllll)) {
                                    String[] stringArray4 = new String[lIllIIIII[2]];
                                    stringArray4[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[49]];
                                    if (ae.lIIlIlIIIlIl(lllIIIIIIIlllI.hasAction(stringArray4) ? 1 : 0)) {
                                        int lllIIIIIIIllIl = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[lIllIIIII[2]];
                                        nArray3[ae.lIllIIIII[1]] = lIllIIIII[0];
                                        String[] stringArray5 = new String[lIllIIIII[2]];
                                        stringArray5[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[50]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)lIllIIIII[2]);

                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[lIllIIIII[2]];
                        nArray4[ae.lIllIIIII[1]] = lIllIIIII[0];
                        if (ae.lIIlIlIIIlIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIllIIIII[2]];
                            nArray5[ae.lIllIIIII[1]] = lIllIIIII[51];
                            if (ae.lIIlIlIIIIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (ae.lIIlIlIIlIII(Players.getLocal().getWorldLocation().distanceTo(lE), lIllIIIII[21])) {
                                    AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[52]];
                                    WorldPoint[] worldPointArray = new WorldPoint[lIllIIIII[21]];
                                    worldPointArray[ae.lIllIIIII[1]] = new WorldPoint(lIllIIIII[23], lIllIIIII[24], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[2]] = new WorldPoint(lIllIIIII[25], lIllIIIII[26], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[4]] = new WorldPoint(lIllIIIII[27], lIllIIIII[28], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[5]] = new WorldPoint(lIllIIIII[29], lIllIIIII[30], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[7]] = new WorldPoint(lIllIIIII[31], lIllIIIII[32], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[14]] = new WorldPoint(lIllIIIII[33], lIllIIIII[34], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[16]] = new WorldPoint(lIllIIIII[35], lIllIIIII[36], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[18]] = new WorldPoint(lIllIIIII[37], lIllIIIII[38], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[19]] = new WorldPoint(lIllIIIII[39], lIllIIIII[38], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[20]] = new WorldPoint(lIllIIIII[40], lIllIIIII[38], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[22]] = new WorldPoint(lIllIIIII[41], lIllIIIII[38], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[42]] = new WorldPoint(lIllIIIII[43], lIllIIIII[44], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[45]] = new WorldPoint(lIllIIIII[46], lIllIIIII[44], lIllIIIII[1]);
                                    lllIIIIIIIllll = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(lllIIIIIIIllll), new HashMap());

                                    Time.sleepTicks((int)lIllIIIII[2]);

                                }
                                if (ae.lIIlIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo(lE), lIllIIIII[21])) {
                                    AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[53]];
                                    if (!ae.lIIlIlIIIlIl(Dialog.canLevelUpContinue() ? 1 : 0) || ae.lIIlIlIIIIll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[lIllIIIII[2]];
                                    stringArray[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[15]];
                                    lllIIIIIIIllll = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIllIIIII[2]];
                                    stringArray6[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[54]];
                                    lllIIIIIIIlllI = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[lIllIIIII[2]];
                                    stringArray7[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[55]];
                                    if (ae.lIIlIlIIIIll(lllIIIIIIIlllI.hasAction(stringArray7) ? 1 : 0)) {
                                        lllIIIIIIIlllI.interact(lIlIlllII[lIllIIIII[56]]);
                                    }
                                    if (ae.lIIlIlIIIllI(lllIIIIIIIllll)) {
                                        String[] stringArray8 = new String[lIllIIIII[2]];
                                        stringArray8[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[57]];
                                        if (ae.lIIlIlIIIlIl(lllIIIIIIIlllI.hasAction(stringArray8) ? 1 : 0)) {
                                            List lllIIIIIIIllIl;
                                            if (ae.lIIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[lIllIIIII[2]];
                                                nArray6[ae.lIllIIIII[1]] = lIllIIIII[51];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)lllIIIIIIIllll);
                                                Time.sleepTicks((int)lIllIIIII[4]);

                                            }
                                            if (ae.lIIlIlIIIIll(Dialog.isOpen() ? 1 : 0) && ae.lIIlIlIIIlIl((lllIIIIIIIllIl = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int lllIIIIIIIllII = lIllIIIII[1];
                                                while (ae.lIIlIlIIIlII(lllIIIIIIIllII, lllIIIIIIIllIl.size())) {
                                                    int[] nArray7 = new int[lIllIIIII[2]];
                                                    nArray7[ae.lIllIIIII[1]] = lIllIIIII[51];
                                                    if (ae.lIIlIlIIlIIl(((Item)Inventory.getAll((int[])nArray7).get(lIllIIIII[1])).getQuantity(), lIllIIIII[2]) && ae.lIIlIlIIIIll(((Widget)lllIIIIIIIllIl.get(lllIIIIIIIllII)).getText().contains(lIlIlllII[lIllIIIII[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lllIIIIIIIllIl.get(lllIIIIIIIllII)).getClickPoint().getX(), (int)((Widget)lllIIIIIIIllIl.get(lllIIIIIIIllII)).getClickPoint().getY(), (boolean)lIllIIIII[2]);
                                                        Time.sleepTicks((int)lIllIIIII[4]);

                                                    }
                                                    int[] nArray8 = new int[lIllIIIII[2]];
                                                    nArray8[ae.lIllIIIII[1]] = lIllIIIII[51];
                                                    if (ae.lIIlIlIIlIIl(((Item)Inventory.getAll((int[])nArray8).get(lIllIIIII[1])).getQuantity(), lIllIIIII[14]) && ae.lIIlIlIIIIll(((Widget)lllIIIIIIIllIl.get(lllIIIIIIIllII)).getText().contains(lIlIlllII[lIllIIIII[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lllIIIIIIIllIl.get(lllIIIIIIIllII)).getClickPoint().getX(), (int)((Widget)lllIIIIIIIllIl.get(lllIIIIIIIllII)).getClickPoint().getY(), (boolean)lIllIIIII[2]);
                                                        Time.sleepTicks((int)lIllIIIII[4]);

                                                    }
                                                    if (ae.lIIlIlIIIIll(((Widget)lllIIIIIIIllIl.get(lllIIIIIIIllII)).getText().contains(lIlIlllII[lIllIIIII[60]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lllIIIIIIIllIl.get(lllIIIIIIIllII)).getClickPoint().getX(), (int)((Widget)lllIIIIIIIllIl.get(lllIIIIIIIllII)).getClickPoint().getY(), (boolean)lIllIIIII[2]);
                                                        Time.sleepTicks((int)lIllIIIII[4]);

                                                    }
                                                    ++lllIIIIIIIllII;

                                                    if (1 >= -1) continue;
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] nArray = new int[lIllIIIII[2]];
                nArray[ae.lIllIIIII[1]] = lIllIIIII[10];
                if (!ae.lIIlIlIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[lIllIIIII[2]];
                nArray9[ae.lIllIIIII[1]] = lIllIIIII[0];
                if (!ae.lIIlIlIIIlIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[lIllIIIII[2]];
                nArray10[ae.lIllIIIII[1]] = lIllIIIII[51];
                if (!ae.lIIlIlIIIlIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (ae.lIIlIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo(lE), lIllIIIII[21])) {
                AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[61]];
                String[] stringArray = new String[lIllIIIII[2]];
                stringArray[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[62]];
                lllIIIIIIIllll = TileItems.getNearest((String[])stringArray);
                if (ae.lIIlIlIIIllI(lllIIIIIIIllll)) {
                    lllIIIIIIIllll.interact(lIlIlllII[lIllIIIII[63]]);
                }
            }
        }
    }

        return String.valueOf(llIllllllIlIII);
    }

    private static boolean lIIlIlIIIlll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIlIIIIll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (ae.lIIlIlIIlIll(Skills.getLevel((Skill)Skill.PRAYER), lIllIIIII[3])) {
            bl = lIllIIIII[2];

            if ((2 & ~2) > 0) {
                return false;
            }
        } else {
            bl = lIllIIIII[1];
        }
        return bl;
    }

    public AEHelper() {
        this.lJ = lIllIIIII[0];
    }

    static {
        ae.lIIlIlIIIIlI();
        ae.lIIlIlIIIIIl();
        lC = new WorldPoint(lIllIIIII[77], lIllIIIII[78], lIllIIIII[1]);
        lD = new WorldPoint(lIllIIIII[79], lIllIIIII[80], lIllIIIII[1]);
        lE = new WorldPoint(lIllIIIII[81], lIllIIIII[82], lIllIIIII[1]);
        lF = new WorldPoint(lIllIIIII[83], lIllIIIII[44], lIllIIIII[1]);
        lG = new WorldPoint(lIllIIIII[1], lIllIIIII[1], lIllIIIII[1]);
        lH = new WorldPoint(lIllIIIII[1], lIllIIIII[1], lIllIIIII[1]);
        lI = new WorldPoint(lIllIIIII[84], lIllIIIII[85], lIllIIIII[1]);
        bv = new ArrayList<d>();
    }

    private static boolean lIIlIlIIIllI(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIIlIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIlIIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIlIIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIllIIIII[2]];
                nArray[ae.lIllIIIII[1]] = lIllIIIII[10];
                if (!ae.lIIlIlIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIllIIIII[2]];
                nArray2[ae.lIllIIIII[1]] = lIllIIIII[10];
                if (!ae.lIIlIlIIlIll(Inventory.getFirst((int[])nArray2).getQuantity(), lIllIIIII[13])) break block2;
                if (!ae.lIIlIlIIIlIl(Inventory.contains((int[])f.ba) ? 1 : 0)) break block3;
                if (!ae.lIIlIlIIIIll(Equipment.contains((int[])f.ba) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIllIIIII[2]];
                nArray3[ae.lIllIIIII[1]] = lIllIIIII[0];
                if (!ae.lIIlIlIIIlIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lIllIIIII[2]];
                nArray4[ae.lIllIIIII[1]] = lIllIIIII[51];
                if (!ae.lIIlIlIIIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = lIllIIIII[2];

            if (((148 + 180 - 273 + 153 ^ 7 + 115 - 75 + 96) & (0xFF ^ 0x8C ^ (0x3C ^ 0x10) ^ -1)) == 0) return n2 != 0;
            return ((1 ^ 0x5A ^ (0xE ^ 0x49)) & (9 ^ 5 ^ (0 ^ 0x10) ^ -1)) != 0;
        }
        n2 = lIllIIIII[1];
        return n2 != 0;
    }

    private static boolean lIIlIlIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIIlIll(int n2, int n3) {
        return n2 >= n3;
    }
}

