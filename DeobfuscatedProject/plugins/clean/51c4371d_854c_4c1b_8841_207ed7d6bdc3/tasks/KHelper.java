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
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.AHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.BHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.DHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.EHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.FHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.GHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.IHelper;
import gg.squire.account.AccBuilderBarrows;
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

public class KHelper
implements F {
    public static  boolean bz;
    public static final  WorldPoint iH;
    
    public static final  WorldPoint iK;
    public static  List<d> bB;
    private final  int iO = 536;
    public static final  WorldPoint iJ;
    static final  WorldPoint iL;
    public static final  WorldPoint iI;
    
    static final  WorldPoint iN;
    static final  WorldPoint iM;

    private static void lIllllIIIlI() {
        lllIIIlI = new String[lllIIIll[86]];
        K.lllIIIlI[K.lllIIIll[1]] = "Buying items";
        K.lllIIIlI[K.lllIIIll[2]] = "Finished buying items, switching back to prayer";
        K.lllIIIlI[K.lllIIIll[4]] = "Navigating to bank";
        K.lllIIIlI[K.lllIIIll[5]] = "Handling banking";
        K.lllIIIlI[K.lllIIIll[7]] = "We are missing prayer supplies, switching to BUYING";
        K.lllIIIlI[K.lllIIIll[14]] = "Drink";
        K.lllIIIlI[K.lllIIIll[16]] = "Tele to wildy";
        K.lllIIIlI[K.lllIIIll[18]] = "Rub";
        K.lllIIIlI[K.lllIIIll[19]] = "Lava Maze";
        K.lllIIIlI[K.lllIIIll[20]] = "Okay, teleport to level 41 Wilderness.";
        K.lllIIIlI[K.lllIIIll[22]] = "Nav to altar";
        K.lllIIIlI[K.lllIIIll[42]] = "1 tick pray";
        K.lllIIIlI[K.lllIIIll[45]] = "Chaos altar";
        K.lllIIIlI[K.lllIIIll[21]] = "Large door";
        K.lllIIIlI[K.lllIIIll[47]] = "Open";
        K.lllIIIlI[K.lllIIIll[48]] = "Open";
        K.lllIIIlI[K.lllIIIll[49]] = "Open";
        K.lllIIIlI[K.lllIIIll[50]] = "Chaos altar";
        K.lllIIIlI[K.lllIIIll[52]] = "Nav to altar";
        K.lllIIIlI[K.lllIIIll[53]] = "Unnoting bones";
        K.lllIIIlI[K.lllIIIll[15]] = "Elder Chaos druid";
        K.lllIIIlI[K.lllIIIll[54]] = "Large door";
        K.lllIIIlI[K.lllIIIll[55]] = "Open";
        K.lllIIIlI[K.lllIIIll[56]] = "Open";
        K.lllIIIlI[K.lllIIIll[57]] = "Open";
        K.lllIIIlI[K.lllIIIll[58]] = "Exchange";
        K.lllIIIlI[K.lllIIIll[59]] = "Exchange 5";
        K.lllIIIlI[K.lllIIIll[60]] = "Exchange All";
        K.lllIIIlI[K.lllIIIll[61]] = "Suiciding";
        K.lllIIIlI[K.lllIIIll[62]] = "Wine of zamorak";
        K.lllIIIlI[K.lllIIIll[63]] = "Take";
        K.lllIIIlI[K.lllIIIll[75]] = "Prayer training";
        K.lllIIIlI[K.lllIIIll[76]] = "ring of wealth (";
    }

    private static void ag() {
        d lIlIIIIllllllII;
        Object lIlIIIIllllllIl;
        int[] nArray = new int[lllIIIll[2]];
        nArray[K.lllIIIll[1]] = lllIIIll[9];
        if (K.lIllllIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lllIIIll[9], lllIIIll[14], i.bw);
            bB.add(d2);

        }
        int[] nArray2 = new int[lllIIIll[2]];
        nArray2[K.lllIIIll[1]] = lllIIIll[0];
        if (K.lIllllIIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIlIIIIllllllIl = new DHelper(lllIIIll[0], K.cA(), lllIIIll[64]);
            bB.add((DHelper) IlIIIIllllllIl);

        }
        int[] nArray3 = new int[lllIIIll[2]];
        nArray3[K.lllIIIll[1]] = lllIIIll[8];
        if (K.lIllllIIllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIlIIIIllllllIl = new DHelper(lllIIIll[8], lllIIIll[4], lllIIIll[6]);
            bB.add((DHelper) IlIIIIllllllIl);

        }
        if (K.lIllllIIllI(Bank.contains((Predicate)(lIlIIIIllllllIl = item -> item.getName().toLowerCase().contains(lllIIIlI[lllIIIll[76]]))) ? 1 : 0)) {
            lIlIIIIllllllII = new DHelper(lllIIIll[65], lllIIIll[14], lllIIIll[66]);
            bB.add(lIlIIIIllllllII);

        }
        int[] nArray4 = new int[lllIIIll[2]];
        nArray4[K.lllIIIll[1]] = lllIIIll[67];
        if (K.lIllllIIllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIlIIIIllllllII = new DHelper(lllIIIll[67], lllIIIll[68], lllIIIll[69]);
            bB.add(lIlIIIIllllllII);

        }
    }

    private static boolean lIllllIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        K.lIllllIIIll();
        K.lIllllIIIlI();
        iH = new WorldPoint(lllIIIll[77], lllIIIll[78], lllIIIll[1]);
        iI = new WorldPoint(lllIIIll[79], lllIIIll[80], lllIIIll[1]);
        iJ = new WorldPoint(lllIIIll[81], lllIIIll[82], lllIIIll[1]);
        iK = new WorldPoint(lllIIIll[83], lllIIIll[44], lllIIIll[1]);
        iL = new WorldPoint(lllIIIll[1], lllIIIll[1], lllIIIll[1]);
        iM = new WorldPoint(lllIIIll[1], lllIIIll[1], lllIIIll[1]);
        iN = new WorldPoint(lllIIIll[84], lllIIIll[85], lllIIIll[1]);
        bB = new ArrayList<d>();
    }

        return String.valueOf(lIlIIIIlllIlIIl);
    }

    private static boolean lIllllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllllIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllllIIlII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean W() {
        boolean bl;
        if (K.lIllllIllII(Skills.getLevel((Skill)Skill.PRAYER), lllIIIll[3])) {
            bl = lllIIIll[2];

            if (((0x29 ^ 0x13) & ~(0x23 ^ 0x19)) != 0) {
                return false;
            }
        } else {
            bl = lllIIIll[1];
        }
        return bl;
    }

    @Override
    public int U() {
        try {
            K.cz();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 > 3) {
            return (174 + 76 - 94 + 49 ^ 40 + 37 - -1 + 77) & (26 + 13 - -129 + 71 ^ 107 + 132 - 213 + 159 ^ -1);
        }
        return lllIIIll[74];
    }

    private static int cA() {
        int n2 = lllIIIll[70];
        if (K.lIllllIIlIl(Skills.getLevel((Skill)Skill.PRAYER), lllIIIll[71]) && K.lIllllIllII(Skills.getLevel((Skill)Skill.PRAYER), lllIIIll[3])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / lllIIIll[72] + lllIIIll[22];
        }
        int n3 = lllIIIll[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / lllIIIll[72] + lllIIIll[63];
    }

    private static boolean lIllllIlIII(int n2) {
        return n2 > 0;
    }

    public static void cz() {
        block44: {
            TileItem lIlIIIlIIIIIIll;
            block45: {
                if (K.lIllllIIlII(bz ? 1 : 0)) {
                    AccBuilderBarrows.c = lllIIIlI[lllIIIll[1]];
                    b.a(bB);
                    if (K.lIllllIIlIl(bB.size(), lllIIIll[2])) {
                        System.out.println(lllIIIlI[lllIIIll[2]]);
                        bz = lllIIIll[1];
                    }
                }
                if (!K.lIllllIIllI(bz ? 1 : 0) || !K.lIllllIIlIl(Skills.getLevel((Skill)Skill.PRAYER), lllIIIll[3])) break block44;
                if (K.lIllllIIllI(K.ac() ? 1 : 0) && K.lIllllIIlIl(Game.getWildyLevel(), lllIIIll[2])) {
                    lIlIIIlIIIIIIll = BankLocation.getNearest();
                    if (K.lIllllIIlll(lIlIIIlIIIIIIll) && K.lIllllIIllI(lIlIIIlIIIIIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = lllIIIlI[lllIIIll[4]];
                        a.a((BankLocation)lIlIIIlIIIIIIll);
                    }
                    if (K.lIllllIIlll(lIlIIIlIIIIIIll) && K.lIllllIIlII(lIlIIIlIIIIIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = lllIIIlI[lllIIIll[5]];
                        if (K.lIllllIIllI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIIll[6]);

                        }
                        if (K.lIllllIIlII(Bank.isOpen() ? 1 : 0)) {
                            if (K.lIllllIlIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lllIIIll[7]);

                            }
                            if (K.lIllllIlIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lllIIIll[4]);

                            }
                            int[] nArray = new int[lllIIIll[5]];
                            nArray[K.lllIIIll[1]] = lllIIIll[8];
                            nArray[K.lllIIIll[2]] = lllIIIll[0];
                            nArray[K.lllIIIll[4]] = lllIIIll[9];
                            if (K.lIllllIIllI(e.b(nArray) ? 1 : 0)) {
                                K.ag();
                                System.out.println(lllIIIlI[lllIIIll[7]]);
                                bz = lllIIIll[2];
                                return;
                            }
                            int[] nArray2 = new int[lllIIIll[5]];
                            nArray2[K.lllIIIll[1]] = lllIIIll[8];
                            nArray2[K.lllIIIll[2]] = lllIIIll[0];
                            nArray2[K.lllIIIll[4]] = lllIIIll[9];
                            if (K.lIllllIIlII(e.b(nArray2) ? 1 : 0)) {
                                if (K.lIllllIIllI(Equipment.contains((int[])f.bg) ? 1 : 0)) {
                                    a.b(f.bg, lllIIIll[2]);
                                }
                                a.b(f.bb, lllIIIll[2]);
                                a.a(lllIIIll[10], lllIIIll[11]);
                                a.b(lllIIIll[0], lllIIIll[12]);
                            }
                        }
                    }
                }
                if (K.lIllllIIlII(K.ac() ? 1 : 0)) {
                    if (K.lIllllIIlII(Inventory.contains((int[])f.bb) ? 1 : 0) && K.lIllllIIlIl(Movement.getRunEnergy(), lllIIIll[13])) {
                        Inventory.getFirst((int[])f.bb).interact(lllIIIlI[lllIIIll[14]]);
                        Time.sleepTicks((int)lllIIIll[2]);

                    }
                    if (K.lIllllIIllI(Movement.isRunEnabled() ? 1 : 0) && K.lIllllIlIIl(Movement.getRunEnergy(), lllIIIll[15])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)lllIIIll[14]);

                    }
                    if (K.lIllllIIlIl(Game.getWildyLevel(), lllIIIll[2])) {
                        AccBuilderBarrows.c = lllIIIlI[lllIIIll[16]];
                        if (K.lIllllIIlII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (K.lIllllIIllI(Dialog.isOpen() ? 1 : 0) && K.lIllllIIlII(Inventory.contains((int[])f.bg) ? 1 : 0) && K.lIllllIlIlI(Players.getLocal().getAnimation(), lllIIIll[17])) {
                            Inventory.getFirst((int[])f.bg).interact(lllIIIlI[lllIIIll[18]]);
                            Time.sleepTicks((int)lllIIIll[4]);

                        }
                        String[] stringArray = new String[lllIIIll[4]];
                        stringArray[K.lllIIIll[1]] = lllIIIlI[lllIIIll[19]];
                        stringArray[K.lllIIIll[2]] = lllIIIlI[lllIIIll[20]];
                        g.a(stringArray);
                    }
                    if (K.lIllllIlIII(Game.getWildyLevel())) {
                        TileObject lIlIIIlIIIIIIlI;
                        int[] nArray = new int[lllIIIll[2]];
                        nArray[K.lllIIIll[1]] = lllIIIll[0];
                        if (K.lIllllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (K.lIllllIlIIl(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIIIll[21])) {
                                AccBuilderBarrows.c = lllIIIlI[lllIIIll[22]];
                                TileItem tileItem = new WorldPoint[lllIIIll[21]];
                                tileItem[K.lllIIIll[1]] = new WorldPoint(lllIIIll[23], lllIIIll[24], lllIIIll[1]);
                                tileItem[K.lllIIIll[2]] = new WorldPoint(lllIIIll[25], lllIIIll[26], lllIIIll[1]);
                                tileItem[K.lllIIIll[4]] = new WorldPoint(lllIIIll[27], lllIIIll[28], lllIIIll[1]);
                                tileItem[K.lllIIIll[5]] = new WorldPoint(lllIIIll[29], lllIIIll[30], lllIIIll[1]);
                                tileItem[K.lllIIIll[7]] = new WorldPoint(lllIIIll[31], lllIIIll[32], lllIIIll[1]);
                                tileItem[K.lllIIIll[14]] = new WorldPoint(lllIIIll[33], lllIIIll[34], lllIIIll[1]);
                                tileItem[K.lllIIIll[16]] = new WorldPoint(lllIIIll[35], lllIIIll[36], lllIIIll[1]);
                                tileItem[K.lllIIIll[18]] = new WorldPoint(lllIIIll[37], lllIIIll[38], lllIIIll[1]);
                                tileItem[K.lllIIIll[19]] = new WorldPoint(lllIIIll[39], lllIIIll[38], lllIIIll[1]);
                                tileItem[K.lllIIIll[20]] = new WorldPoint(lllIIIll[40], lllIIIll[38], lllIIIll[1]);
                                tileItem[K.lllIIIll[22]] = new WorldPoint(lllIIIll[41], lllIIIll[38], lllIIIll[1]);
                                tileItem[K.lllIIIll[42]] = new WorldPoint(lllIIIll[43], lllIIIll[44], lllIIIll[1]);
                                tileItem[K.lllIIIll[45]] = new WorldPoint(lllIIIll[46], lllIIIll[44], lllIIIll[1]);
                                lIlIIIlIIIIIIll = tileItem;
                                Walker.walkAlong(Arrays.asList(lIlIIIlIIIIIIll), new HashMap());

                                Time.sleepTicks((int)lllIIIll[2]);

                            }
                            if (K.lIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIIIll[21])) {
                                AccBuilderBarrows.c = lllIIIlI[lllIIIll[42]];
                                String[] stringArray = new String[lllIIIll[2]];
                                stringArray[K.lllIIIll[1]] = lllIIIlI[lllIIIll[45]];
                                lIlIIIlIIIIIIll = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[lllIIIll[2]];
                                stringArray2[K.lllIIIll[1]] = lllIIIlI[lllIIIll[21]];
                                lIlIIIlIIIIIIlI = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[lllIIIll[2]];
                                stringArray3[K.lllIIIll[1]] = lllIIIlI[lllIIIll[47]];
                                if (K.lIllllIIlII(lIlIIIlIIIIIIlI.hasAction(stringArray3) ? 1 : 0)) {
                                    lIlIIIlIIIIIIlI.interact(lllIIIlI[lllIIIll[48]]);
                                }
                                if (K.lIllllIIlll(lIlIIIlIIIIIIll)) {
                                    String[] stringArray4 = new String[lllIIIll[2]];
                                    stringArray4[K.lllIIIll[1]] = lllIIIlI[lllIIIll[49]];
                                    if (K.lIllllIIllI(lIlIIIlIIIIIIlI.hasAction(stringArray4) ? 1 : 0)) {
                                        int lIlIIIlIIIIIIIl = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[lllIIIll[2]];
                                        nArray3[K.lllIIIll[1]] = lllIIIll[0];
                                        String[] stringArray5 = new String[lllIIIll[2]];
                                        stringArray5[K.lllIIIll[1]] = lllIIIlI[lllIIIll[50]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)lllIIIll[2]);

                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[lllIIIll[2]];
                        nArray4[K.lllIIIll[1]] = lllIIIll[0];
                        if (K.lIllllIIllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lllIIIll[2]];
                            nArray5[K.lllIIIll[1]] = lllIIIll[51];
                            if (K.lIllllIIlII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (K.lIllllIlIIl(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIIIll[21])) {
                                    AccBuilderBarrows.c = lllIIIlI[lllIIIll[52]];
                                    WorldPoint[] worldPointArray = new WorldPoint[lllIIIll[21]];
                                    worldPointArray[K.lllIIIll[1]] = new WorldPoint(lllIIIll[23], lllIIIll[24], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[2]] = new WorldPoint(lllIIIll[25], lllIIIll[26], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[4]] = new WorldPoint(lllIIIll[27], lllIIIll[28], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[5]] = new WorldPoint(lllIIIll[29], lllIIIll[30], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[7]] = new WorldPoint(lllIIIll[31], lllIIIll[32], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[14]] = new WorldPoint(lllIIIll[33], lllIIIll[34], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[16]] = new WorldPoint(lllIIIll[35], lllIIIll[36], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[18]] = new WorldPoint(lllIIIll[37], lllIIIll[38], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[19]] = new WorldPoint(lllIIIll[39], lllIIIll[38], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[20]] = new WorldPoint(lllIIIll[40], lllIIIll[38], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[22]] = new WorldPoint(lllIIIll[41], lllIIIll[38], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[42]] = new WorldPoint(lllIIIll[43], lllIIIll[44], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[45]] = new WorldPoint(lllIIIll[46], lllIIIll[44], lllIIIll[1]);
                                    lIlIIIlIIIIIIll = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(lIlIIIlIIIIIIll), new HashMap());

                                    Time.sleepTicks((int)lllIIIll[2]);

                                }
                                if (K.lIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIIIll[21])) {
                                    AccBuilderBarrows.c = lllIIIlI[lllIIIll[53]];
                                    if (!K.lIllllIIllI(Dialog.canLevelUpContinue() ? 1 : 0) || K.lIllllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[lllIIIll[2]];
                                    stringArray[K.lllIIIll[1]] = lllIIIlI[lllIIIll[15]];
                                    lIlIIIlIIIIIIll = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lllIIIll[2]];
                                    stringArray6[K.lllIIIll[1]] = lllIIIlI[lllIIIll[54]];
                                    lIlIIIlIIIIIIlI = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[lllIIIll[2]];
                                    stringArray7[K.lllIIIll[1]] = lllIIIlI[lllIIIll[55]];
                                    if (K.lIllllIIlII(lIlIIIlIIIIIIlI.hasAction(stringArray7) ? 1 : 0)) {
                                        lIlIIIlIIIIIIlI.interact(lllIIIlI[lllIIIll[56]]);
                                    }
                                    if (K.lIllllIIlll(lIlIIIlIIIIIIll)) {
                                        String[] stringArray8 = new String[lllIIIll[2]];
                                        stringArray8[K.lllIIIll[1]] = lllIIIlI[lllIIIll[57]];
                                        if (K.lIllllIIllI(lIlIIIlIIIIIIlI.hasAction(stringArray8) ? 1 : 0)) {
                                            List lIlIIIlIIIIIIIl;
                                            if (K.lIllllIIllI(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[lllIIIll[2]];
                                                nArray6[K.lllIIIll[1]] = lllIIIll[51];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)lIlIIIlIIIIIIll);
                                                Time.sleepTicks((int)lllIIIll[4]);

                                            }
                                            if (K.lIllllIIlII(Dialog.isOpen() ? 1 : 0) && K.lIllllIIllI((lIlIIIlIIIIIIIl = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int lIlIIIlIIIIIIII = lllIIIll[1];
                                                while (K.lIllllIIlIl(lIlIIIlIIIIIIII, lIlIIIlIIIIIIIl.size())) {
                                                    int[] nArray7 = new int[lllIIIll[2]];
                                                    nArray7[K.lllIIIll[1]] = lllIIIll[51];
                                                    if (K.lIllllIlIlI(((Item)Inventory.getAll((int[])nArray7).get(lllIIIll[1])).getQuantity(), lllIIIll[2]) && K.lIllllIIlII(((Widget)lIlIIIlIIIIIIIl.get(lIlIIIlIIIIIIII)).getText().contains(lllIIIlI[lllIIIll[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lIlIIIlIIIIIIIl.get(lIlIIIlIIIIIIII)).getClickPoint().getX(), (int)((Widget)lIlIIIlIIIIIIIl.get(lIlIIIlIIIIIIII)).getClickPoint().getY(), (boolean)lllIIIll[2]);
                                                        Time.sleepTicks((int)lllIIIll[4]);

                                                    }
                                                    int[] nArray8 = new int[lllIIIll[2]];
                                                    nArray8[K.lllIIIll[1]] = lllIIIll[51];
                                                    if (K.lIllllIlIlI(((Item)Inventory.getAll((int[])nArray8).get(lllIIIll[1])).getQuantity(), lllIIIll[14]) && K.lIllllIIlII(((Widget)lIlIIIlIIIIIIIl.get(lIlIIIlIIIIIIII)).getText().contains(lllIIIlI[lllIIIll[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lIlIIIlIIIIIIIl.get(lIlIIIlIIIIIIII)).getClickPoint().getX(), (int)((Widget)lIlIIIlIIIIIIIl.get(lIlIIIlIIIIIIII)).getClickPoint().getY(), (boolean)lllIIIll[2]);
                                                        Time.sleepTicks((int)lllIIIll[4]);

                                                    }
                                                    if (K.lIllllIIlII(((Widget)lIlIIIlIIIIIIIl.get(lIlIIIlIIIIIIII)).getText().contains(lllIIIlI[lllIIIll[60]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lIlIIIlIIIIIIIl.get(lIlIIIlIIIIIIII)).getClickPoint().getX(), (int)((Widget)lIlIIIlIIIIIIIl.get(lIlIIIlIIIIIIII)).getClickPoint().getY(), (boolean)lllIIIll[2]);
                                                        Time.sleepTicks((int)lllIIIll[4]);

                                                    }
                                                    ++lIlIIIlIIIIIIII;

                                                    if (-(0x45 ^ 0x41) < 0) continue;
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    e.s();
                                }
                            }
                        }
                    }
                }
                int[] nArray = new int[lllIIIll[2]];
                nArray[K.lllIIIll[1]] = lllIIIll[10];
                if (!K.lIllllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[lllIIIll[2]];
                nArray9[K.lllIIIll[1]] = lllIIIll[0];
                if (!K.lIllllIIllI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[lllIIIll[2]];
                nArray10[K.lllIIIll[1]] = lllIIIll[51];
                if (!K.lIllllIIllI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (K.lIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIIIll[21])) {
                AccBuilderBarrows.c = lllIIIlI[lllIIIll[61]];
                String[] stringArray = new String[lllIIIll[2]];
                stringArray[K.lllIIIll[1]] = lllIIIlI[lllIIIll[62]];
                lIlIIIlIIIIIIll = TileItems.getNearest((String[])stringArray);
                if (K.lIllllIIlll(lIlIIIlIIIIIIll)) {
                    lIlIIIlIIIIIIll.interact(lllIIIlI[lllIIIll[63]]);
                }
            }
        }
    }

    @Override
    public boolean T() {
        return lllIIIll[1];
    }

    private static boolean lIllllIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    public KHelper() {
        this.iO = lllIIIll[0];
    }

    @Override
    public String V() {
        return lllIIIlI[lllIIIll[75]];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lllIIIll[2]];
                nArray[K.lllIIIll[1]] = lllIIIll[10];
                if (!K.lIllllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lllIIIll[2]];
                nArray2[K.lllIIIll[1]] = lllIIIll[10];
                if (!K.lIllllIllII(Inventory.getFirst((int[])nArray2).getQuantity(), lllIIIll[13])) break block2;
                if (!K.lIllllIIllI(Inventory.contains((int[])f.bg) ? 1 : 0)) break block3;
                if (!K.lIllllIIlII(Equipment.contains((int[])f.bg) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lllIIIll[2]];
                nArray3[K.lllIIIll[1]] = lllIIIll[0];
                if (!K.lIllllIIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lllIIIll[2]];
                nArray4[K.lllIIIll[1]] = lllIIIll[51];
                if (!K.lIllllIIlII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = lllIIIll[2];

            if (((70 + 46 - 63 + 135 ^ 94 + 21 - 90 + 122) & (125 + 118 - 174 + 102 ^ 130 + 97 - 166 + 71 ^ -1)) < (0xDC ^ 0xA4 ^ (0x77 ^ 0xB))) return n2 != 0;
            return ((121 + 28 - 90 + 128 ^ 107 + 136 - 150 + 84) & (0x71 ^ 0xB ^ (0x2F ^ 0x5F) ^ -1)) != 0;
        }
        n2 = lllIIIll[1];
        return n2 != 0;
    }

    private static boolean lIllllIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllllIIlll(Object object) {
        return object != null;
    }

    private static boolean lIllllIIllI(int n2) {
        return n2 == 0;
    }
}

