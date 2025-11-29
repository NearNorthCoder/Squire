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
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.GHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.JHelper;
import gg.squire.account.AccBuilderGWD;
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

public class AQHelper
implements ab {
    public static final  WorldPoint mB;
    public static  List<d> bx;
    public static final  WorldPoint mz;
    public static final  WorldPoint mC;
    static final  WorldPoint mD;
    public static  boolean bv;
    private final  int mG = 536;
    public static final  WorldPoint mA;
    
    static final  WorldPoint mF;
    
    static final  WorldPoint mE;

    private static boolean llIllIlIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIlIIllI(Object object) {
        return object != null;
    }

    private static int eb() {
        int n2 = lIIIIIIIIl[69];
        if (aq.llIllIlIIlII(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIIIIl[70]) && aq.llIllIlIlIll(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIIIIl[71])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIIIIIIIl[72] + lIIIIIIIIl[21];
        }
        int n3 = lIIIIIIIIl[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIIIIIIIl[72] + lIIIIIIIIl[62];
    }

    private static void Q() {
        d lIIllIIIIlIlI;
        Object lIIllIIIIlIll;
        int[] nArray = new int[lIIIIIIIIl[2]];
        nArray[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[8];
        if (aq.llIllIlIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIIIIIIIIl[8], lIIIIIIIIl[13], j.ch);
            bx.add(d2);

        }
        int[] nArray2 = new int[lIIIIIIIIl[2]];
        nArray2[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[0];
        if (aq.llIllIlIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIllIIIIlIll = new DHelper(lIIIIIIIIl[0], aq.eb(), lIIIIIIIIl[63]);
            bx.add((DHelper) IIllIIIIlIll);

        }
        int[] nArray3 = new int[lIIIIIIIIl[2]];
        nArray3[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[7];
        if (aq.llIllIlIIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIllIIIIlIll = new DHelper(lIIIIIIIIl[7], lIIIIIIIIl[3], lIIIIIIIIl[5]);
            bx.add((DHelper) IIllIIIIlIll);

        }
        if (aq.llIllIlIIlIl(Bank.contains((Predicate)(lIIllIIIIlIll = item -> item.getName().toLowerCase().contains(lIIIIIIIII[lIIIIIIIIl[77]]))) ? 1 : 0)) {
            lIIllIIIIlIlI = new DHelper(lIIIIIIIIl[64], lIIIIIIIIl[13], lIIIIIIIIl[65]);
            bx.add(lIIllIIIIlIlI);

        }
        int[] nArray4 = new int[lIIIIIIIIl[2]];
        nArray4[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[66];
        if (aq.llIllIlIIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIllIIIIlIlI = new DHelper(lIIIIIIIIl[66], lIIIIIIIIl[67], lIIIIIIIIl[68]);
            bx.add(lIIllIIIIlIlI);

        }
    }

    public AQHelper() {
        this.mG = lIIIIIIIIl[0];
    }

    private static boolean llIllIlIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int af() {
        try {
            aq.ea();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 != 1) {
            return (0x68 ^ 0x59) & ~(0xF1 ^ 0xC0);
        }
        return lIIIIIIIIl[74];
    }

    private static void llIllIlIIIIl() {
        lIIIIIIIII = new String[lIIIIIIIIl[87]];
        aq.lIIIIIIIII[aq.lIIIIIIIIl[1]] = "Buying items";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[2]] = "Finished buying items, switching back to prayer";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[3]] = "Navigating to bank";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[4]] = "Handling banking";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[6]] = "We are missing prayer supplies, switching to BUYING";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[13]] = "Drink";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[15]] = "Tele to wildy";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[17]] = "Rub";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[18]] = "Lava Maze";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[19]] = "Okay, teleport to level 41 Wilderness.";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[21]] = "Nav to altar";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[41]] = "1 tick pray";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[44]] = "Chaos altar";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[20]] = "Large door";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[46]] = "Open";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[47]] = "Open";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[48]] = "Open";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[49]] = "Chaos altar";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[51]] = "Nav to altar";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[52]] = "Unnoting bones";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[14]] = "Elder Chaos druid";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[53]] = "Large door";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[54]] = "Open";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[55]] = "Open";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[56]] = "Open";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[57]] = "Exchange";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[58]] = "Exchange 5";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[59]] = "Exchange All";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[60]] = "Suiciding";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[61]] = "Wine of zamorak";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[62]] = "Take";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[75]] = "Prayer training";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[77]] = "ring of wealth (";
    }

    private static boolean llIllIlIIlII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(lIIlIlllIlIlI);
    }

    private static boolean llIllIlIlIII(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public String ag() {
        return lIIIIIIIII[lIIIIIIIIl[75]];
    }

    public static void ea() {
        block44: {
            TileItem lIIllIIIlIIIl;
            block45: {
                if (aq.llIllIlIIIll(bv ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[1]];
                    b.a(bx);
                    if (aq.llIllIlIIlII(bx.size(), lIIIIIIIIl[2])) {
                        System.out.println(lIIIIIIIII[lIIIIIIIIl[2]]);
                        bv = lIIIIIIIIl[1];
                    }
                }
                if (!aq.llIllIlIIlIl(bv ? 1 : 0)) break block44;
                if (aq.llIllIlIIlIl(aq.an() ? 1 : 0) && aq.llIllIlIIlII(Game.getWildyLevel(), lIIIIIIIIl[2])) {
                    lIIllIIIlIIIl = BankLocation.getNearest();
                    if (aq.llIllIlIIllI(lIIllIIIlIIIl) && aq.llIllIlIIlIl(lIIllIIIlIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[3]];
                        a.a((BankLocation)lIIllIIIlIIIl);
                    }
                    if (aq.llIllIlIIllI(lIIllIIIlIIIl) && aq.llIllIlIIIll(lIIllIIIlIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[4]];
                        if (aq.llIllIlIIlIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIIIl[5]);

                        }
                        if (aq.llIllIlIIIll(Bank.isOpen() ? 1 : 0)) {
                            if (aq.llIllIlIIlll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIIIIIIl[6]);

                            }
                            if (aq.llIllIlIIlll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIIIIIIl[3]);

                            }
                            int[] nArray = new int[lIIIIIIIIl[4]];
                            nArray[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[7];
                            nArray[aq.lIIIIIIIIl[2]] = lIIIIIIIIl[0];
                            nArray[aq.lIIIIIIIIl[3]] = lIIIIIIIIl[8];
                            if (aq.llIllIlIIlIl(e.d(nArray) ? 1 : 0)) {
                                aq.Q();
                                System.out.println(lIIIIIIIII[lIIIIIIIIl[6]]);
                                bv = lIIIIIIIIl[2];
                                return;
                            }
                            int[] nArray2 = new int[lIIIIIIIIl[4]];
                            nArray2[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[7];
                            nArray2[aq.lIIIIIIIIl[2]] = lIIIIIIIIl[0];
                            nArray2[aq.lIIIIIIIIl[3]] = lIIIIIIIIl[8];
                            if (aq.llIllIlIIIll(e.d(nArray2) ? 1 : 0)) {
                                if (aq.llIllIlIIlIl(Equipment.contains((int[])f.bh) ? 1 : 0)) {
                                    a.b(f.bh, lIIIIIIIIl[2]);
                                }
                                a.b(f.bc, lIIIIIIIIl[2]);
                                a.a(lIIIIIIIIl[9], lIIIIIIIIl[10]);
                                a.b(lIIIIIIIIl[0], lIIIIIIIIl[11]);
                            }
                        }
                    }
                }
                if (aq.llIllIlIIIll(aq.an() ? 1 : 0)) {
                    if (aq.llIllIlIIIll(Inventory.contains((int[])f.bc) ? 1 : 0) && aq.llIllIlIIlII(Movement.getRunEnergy(), lIIIIIIIIl[12])) {
                        Inventory.getFirst((int[])f.bc).interact(lIIIIIIIII[lIIIIIIIIl[13]]);
                        Time.sleepTicks((int)lIIIIIIIIl[2]);

                    }
                    if (aq.llIllIlIIlIl(Movement.isRunEnabled() ? 1 : 0) && aq.llIllIlIlIII(Movement.getRunEnergy(), lIIIIIIIIl[14])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)lIIIIIIIIl[13]);

                    }
                    if (aq.llIllIlIIlII(Game.getWildyLevel(), lIIIIIIIIl[2])) {
                        AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[15]];
                        if (aq.llIllIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (aq.llIllIlIIlIl(Dialog.isOpen() ? 1 : 0) && aq.llIllIlIIIll(Inventory.contains((int[])f.bh) ? 1 : 0) && aq.llIllIlIlIIl(Players.getLocal().getAnimation(), lIIIIIIIIl[16])) {
                            Inventory.getFirst((int[])f.bh).interact(lIIIIIIIII[lIIIIIIIIl[17]]);
                            Time.sleepTicks((int)lIIIIIIIIl[3]);

                        }
                        String[] stringArray = new String[lIIIIIIIIl[3]];
                        stringArray[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[18]];
                        stringArray[aq.lIIIIIIIIl[2]] = lIIIIIIIII[lIIIIIIIIl[19]];
                        g.a(stringArray);
                    }
                    if (aq.llIllIlIIlll(Game.getWildyLevel())) {
                        TileObject lIIllIIIlIIII;
                        int[] nArray = new int[lIIIIIIIIl[2]];
                        nArray[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[0];
                        if (aq.llIllIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (aq.llIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(mB), lIIIIIIIIl[20])) {
                                AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[21]];
                                TileItem tileItem = new WorldPoint[lIIIIIIIIl[20]];
                                tileItem[aq.lIIIIIIIIl[1]] = new WorldPoint(lIIIIIIIIl[22], lIIIIIIIIl[23], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[2]] = new WorldPoint(lIIIIIIIIl[24], lIIIIIIIIl[25], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[3]] = new WorldPoint(lIIIIIIIIl[26], lIIIIIIIIl[27], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[4]] = new WorldPoint(lIIIIIIIIl[28], lIIIIIIIIl[29], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[6]] = new WorldPoint(lIIIIIIIIl[30], lIIIIIIIIl[31], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[13]] = new WorldPoint(lIIIIIIIIl[32], lIIIIIIIIl[33], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[15]] = new WorldPoint(lIIIIIIIIl[34], lIIIIIIIIl[35], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[17]] = new WorldPoint(lIIIIIIIIl[36], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[18]] = new WorldPoint(lIIIIIIIIl[38], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[19]] = new WorldPoint(lIIIIIIIIl[39], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[21]] = new WorldPoint(lIIIIIIIIl[40], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[41]] = new WorldPoint(lIIIIIIIIl[42], lIIIIIIIIl[43], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[44]] = new WorldPoint(lIIIIIIIIl[45], lIIIIIIIIl[43], lIIIIIIIIl[1]);
                                lIIllIIIlIIIl = tileItem;
                                Walker.walkAlong(Arrays.asList(lIIllIIIlIIIl), new HashMap());

                                Time.sleepTicks((int)lIIIIIIIIl[2]);

                            }
                            if (aq.llIllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(mB), lIIIIIIIIl[20])) {
                                AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[41]];
                                String[] stringArray = new String[lIIIIIIIIl[2]];
                                stringArray[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[44]];
                                lIIllIIIlIIIl = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[lIIIIIIIIl[2]];
                                stringArray2[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[20]];
                                lIIllIIIlIIII = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[lIIIIIIIIl[2]];
                                stringArray3[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[46]];
                                if (aq.llIllIlIIIll(lIIllIIIlIIII.hasAction(stringArray3) ? 1 : 0)) {
                                    lIIllIIIlIIII.interact(lIIIIIIIII[lIIIIIIIIl[47]]);
                                }
                                if (aq.llIllIlIIllI(lIIllIIIlIIIl)) {
                                    String[] stringArray4 = new String[lIIIIIIIIl[2]];
                                    stringArray4[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[48]];
                                    if (aq.llIllIlIIlIl(lIIllIIIlIIII.hasAction(stringArray4) ? 1 : 0)) {
                                        int lIIllIIIIllll = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[lIIIIIIIIl[2]];
                                        nArray3[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[0];
                                        String[] stringArray5 = new String[lIIIIIIIIl[2]];
                                        stringArray5[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[49]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)lIIIIIIIIl[2]);

                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[lIIIIIIIIl[2]];
                        nArray4[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[0];
                        if (aq.llIllIlIIlIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIIIIIIIl[2]];
                            nArray5[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[50];
                            if (aq.llIllIlIIIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (aq.llIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(mB), lIIIIIIIIl[20])) {
                                    AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[51]];
                                    WorldPoint[] worldPointArray = new WorldPoint[lIIIIIIIIl[20]];
                                    worldPointArray[aq.lIIIIIIIIl[1]] = new WorldPoint(lIIIIIIIIl[22], lIIIIIIIIl[23], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[2]] = new WorldPoint(lIIIIIIIIl[24], lIIIIIIIIl[25], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[3]] = new WorldPoint(lIIIIIIIIl[26], lIIIIIIIIl[27], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[4]] = new WorldPoint(lIIIIIIIIl[28], lIIIIIIIIl[29], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[6]] = new WorldPoint(lIIIIIIIIl[30], lIIIIIIIIl[31], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[13]] = new WorldPoint(lIIIIIIIIl[32], lIIIIIIIIl[33], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[15]] = new WorldPoint(lIIIIIIIIl[34], lIIIIIIIIl[35], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[17]] = new WorldPoint(lIIIIIIIIl[36], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[18]] = new WorldPoint(lIIIIIIIIl[38], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[19]] = new WorldPoint(lIIIIIIIIl[39], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[21]] = new WorldPoint(lIIIIIIIIl[40], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[41]] = new WorldPoint(lIIIIIIIIl[42], lIIIIIIIIl[43], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[44]] = new WorldPoint(lIIIIIIIIl[45], lIIIIIIIIl[43], lIIIIIIIIl[1]);
                                    lIIllIIIlIIIl = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(lIIllIIIlIIIl), new HashMap());

                                    Time.sleepTicks((int)lIIIIIIIIl[2]);

                                }
                                if (aq.llIllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(mB), lIIIIIIIIl[20])) {
                                    AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[52]];
                                    if (!aq.llIllIlIIlIl(Dialog.canLevelUpContinue() ? 1 : 0) || aq.llIllIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[lIIIIIIIIl[2]];
                                    stringArray[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[14]];
                                    lIIllIIIlIIIl = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIIIIIIIIl[2]];
                                    stringArray6[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[53]];
                                    lIIllIIIlIIII = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[lIIIIIIIIl[2]];
                                    stringArray7[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[54]];
                                    if (aq.llIllIlIIIll(lIIllIIIlIIII.hasAction(stringArray7) ? 1 : 0)) {
                                        lIIllIIIlIIII.interact(lIIIIIIIII[lIIIIIIIIl[55]]);
                                    }
                                    if (aq.llIllIlIIllI(lIIllIIIlIIIl)) {
                                        String[] stringArray8 = new String[lIIIIIIIIl[2]];
                                        stringArray8[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[56]];
                                        if (aq.llIllIlIIlIl(lIIllIIIlIIII.hasAction(stringArray8) ? 1 : 0)) {
                                            List lIIllIIIIllll;
                                            if (aq.llIllIlIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[lIIIIIIIIl[2]];
                                                nArray6[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[50];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)lIIllIIIlIIIl);
                                                Time.sleepTicks((int)lIIIIIIIIl[3]);

                                            }
                                            if (aq.llIllIlIIIll(Dialog.isOpen() ? 1 : 0) && aq.llIllIlIIlIl((lIIllIIIIllll = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int lIIllIIIIlllI = lIIIIIIIIl[1];
                                                while (aq.llIllIlIIlII(lIIllIIIIlllI, lIIllIIIIllll.size())) {
                                                    int[] nArray7 = new int[lIIIIIIIIl[2]];
                                                    nArray7[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[50];
                                                    if (aq.llIllIlIlIIl(((Item)Inventory.getAll((int[])nArray7).get(lIIIIIIIIl[1])).getQuantity(), lIIIIIIIIl[2]) && aq.llIllIlIIIll(((Widget)lIIllIIIIllll.get(lIIllIIIIlllI)).getText().contains(lIIIIIIIII[lIIIIIIIIl[57]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lIIllIIIIllll.get(lIIllIIIIlllI)).getClickPoint().getX(), (int)((Widget)lIIllIIIIllll.get(lIIllIIIIlllI)).getClickPoint().getY(), (boolean)lIIIIIIIIl[2]);
                                                        Time.sleepTicks((int)lIIIIIIIIl[3]);

                                                    }
                                                    int[] nArray8 = new int[lIIIIIIIIl[2]];
                                                    nArray8[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[50];
                                                    if (aq.llIllIlIlIIl(((Item)Inventory.getAll((int[])nArray8).get(lIIIIIIIIl[1])).getQuantity(), lIIIIIIIIl[13]) && aq.llIllIlIIIll(((Widget)lIIllIIIIllll.get(lIIllIIIIlllI)).getText().contains(lIIIIIIIII[lIIIIIIIIl[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lIIllIIIIllll.get(lIIllIIIIlllI)).getClickPoint().getX(), (int)((Widget)lIIllIIIIllll.get(lIIllIIIIlllI)).getClickPoint().getY(), (boolean)lIIIIIIIIl[2]);
                                                        Time.sleepTicks((int)lIIIIIIIIl[3]);

                                                    }
                                                    if (aq.llIllIlIIIll(((Widget)lIIllIIIIllll.get(lIIllIIIIlllI)).getText().contains(lIIIIIIIII[lIIIIIIIIl[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lIIllIIIIllll.get(lIIllIIIIlllI)).getClickPoint().getX(), (int)((Widget)lIIllIIIIllll.get(lIIllIIIIlllI)).getClickPoint().getY(), (boolean)lIIIIIIIIl[2]);
                                                        Time.sleepTicks((int)lIIIIIIIIl[3]);

                                                    }
                                                    ++lIIllIIIIlllI;

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
                int[] nArray = new int[lIIIIIIIIl[2]];
                nArray[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[9];
                if (!aq.llIllIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[lIIIIIIIIl[2]];
                nArray9[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[0];
                if (!aq.llIllIlIIlIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[lIIIIIIIIl[2]];
                nArray10[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[50];
                if (!aq.llIllIlIIlIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (aq.llIllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(mB), lIIIIIIIIl[20])) {
                AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[60]];
                String[] stringArray = new String[lIIIIIIIIl[2]];
                stringArray[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[61]];
                lIIllIIIlIIIl = TileItems.getNearest((String[])stringArray);
                if (aq.llIllIlIIllI(lIIllIIIlIIIl)) {
                    lIIllIIIlIIIl.interact(lIIIIIIIII[lIIIIIIIIl[62]]);
                }
            }
        }
    }

    private static boolean llIllIlIIIll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aq.llIllIlIlIll(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIIIIl[76])) {
            bl = lIIIIIIIIl[2];

            if (((0x1B ^ 0x17 ^ (0x6E ^ 0x65)) & (0x12 ^ 0x63 ^ (0x30 ^ 0x46) ^ -1)) != ((16 + 105 - 86 + 160 ^ 141 + 142 - 273 + 134) & (0x7C ^ 0x4A ^ (0x3F ^ 0x5A) ^ -1))) {
                return ((72 + 3 - -52 + 54 ^ 109 + 96 - 179 + 120) & (0x39 ^ 0x27 ^ (0x10 ^ 0x29) ^ -1)) != 0;
            }
        } else {
            bl = lIIIIIIIIl[1];
        }
        return bl;
    }

    @Override
    public boolean ae() {
        return lIIIIIIIIl[1];
    }

    private static boolean llIllIlIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIllIlIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIllIlIIlll(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIIIIIIIIl[2]];
                nArray[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[9];
                if (!aq.llIllIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIIIIIIIIl[2]];
                nArray2[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[9];
                if (!aq.llIllIlIlIll(Inventory.getFirst((int[])nArray2).getQuantity(), lIIIIIIIIl[12])) break block2;
                if (!aq.llIllIlIIlIl(Inventory.contains((int[])f.bh) ? 1 : 0)) break block3;
                if (!aq.llIllIlIIIll(Equipment.contains((int[])f.bh) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIIIIIIIIl[2]];
                nArray3[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[0];
                if (!aq.llIllIlIIlIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lIIIIIIIIl[2]];
                nArray4[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[50];
                if (!aq.llIllIlIIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = lIIIIIIIIl[2];

            if (((0x83 ^ 0x9B ^ (0xA7 ^ 0x85)) & (0x2D ^ 0x38 ^ (0x53 ^ 0x7C) ^ -1)) >= 0) return n2 != 0;
            return ((0x5F ^ 0x5B ^ (0x32 ^ 0x63)) & (116 + 5 - -10 + 62 ^ 20 + 58 - 6 + 76 ^ -1)) != 0;
        }
        n2 = lIIIIIIIIl[1];
        return n2 != 0;
    }

    static {
        aq.llIllIlIIIlI();
        aq.llIllIlIIIIl();
        mz = new WorldPoint(lIIIIIIIIl[78], lIIIIIIIIl[79], lIIIIIIIIl[1]);
        mA = new WorldPoint(lIIIIIIIIl[80], lIIIIIIIIl[81], lIIIIIIIIl[1]);
        mB = new WorldPoint(lIIIIIIIIl[82], lIIIIIIIIl[83], lIIIIIIIIl[1]);
        mC = new WorldPoint(lIIIIIIIIl[84], lIIIIIIIIl[43], lIIIIIIIIl[1]);
        mD = new WorldPoint(lIIIIIIIIl[1], lIIIIIIIIl[1], lIIIIIIIIl[1]);
        mE = new WorldPoint(lIIIIIIIIl[1], lIIIIIIIIl[1], lIIIIIIIIl[1]);
        mF = new WorldPoint(lIIIIIIIIl[85], lIIIIIIIIl[86], lIIIIIIIIl[1]);
        bx = new ArrayList<d>();
    }
}

