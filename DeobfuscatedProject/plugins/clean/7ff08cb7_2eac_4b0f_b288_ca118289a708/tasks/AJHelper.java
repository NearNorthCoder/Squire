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

public class AJHelper
implements ab {
    
    private final  int mn = 536;
    public static final  WorldPoint mh;
    static final  WorldPoint mk;
    static final  WorldPoint ml;
    public static  boolean bv;
    public static final  WorldPoint mi;
    
    public static  List<d> bx;
    public static final  WorldPoint mj;
    public static final  WorldPoint mg;
    static final  WorldPoint mm;

    private static boolean llIllllllIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlllllIlII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String ag() {
        return lIIIIIlllI[lIIIIIllll[75]];
    }

    private static boolean llIlllllIlIl(int n2) {
        return n2 == 0;
    }

    public AJHelper() {
        this.mn = lIIIIIllll[0];
    }

    @Override
    public int af() {
        try {
            aj.ea();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIIIIllll[74];
    }

    @Override
    public boolean ae() {
        return lIIIIIllll[1];
    }

    private static boolean llIlllllIIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIllllllIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIlllllIIIl() {
        lIIIIIlllI = new String[lIIIIIllll[86]];
        aj.lIIIIIlllI[aj.lIIIIIllll[1]] = "Buying items";
        aj.lIIIIIlllI[aj.lIIIIIllll[2]] = "Finished buying items, switching back to prayer";
        aj.lIIIIIlllI[aj.lIIIIIllll[4]] = "Navigating to bank";
        aj.lIIIIIlllI[aj.lIIIIIllll[5]] = "Handling banking";
        aj.lIIIIIlllI[aj.lIIIIIllll[7]] = "We are missing prayer supplies, switching to BUYING";
        aj.lIIIIIlllI[aj.lIIIIIllll[14]] = "Drink";
        aj.lIIIIIlllI[aj.lIIIIIllll[16]] = "Tele to wildy";
        aj.lIIIIIlllI[aj.lIIIIIllll[18]] = "Rub";
        aj.lIIIIIlllI[aj.lIIIIIllll[19]] = "Lava Maze";
        aj.lIIIIIlllI[aj.lIIIIIllll[20]] = "Okay, teleport to level 41 Wilderness.";
        aj.lIIIIIlllI[aj.lIIIIIllll[22]] = "Nav to altar";
        aj.lIIIIIlllI[aj.lIIIIIllll[42]] = "1 tick pray";
        aj.lIIIIIlllI[aj.lIIIIIllll[45]] = "Chaos altar";
        aj.lIIIIIlllI[aj.lIIIIIllll[21]] = "Large door";
        aj.lIIIIIlllI[aj.lIIIIIllll[47]] = "Open";
        aj.lIIIIIlllI[aj.lIIIIIllll[48]] = "Open";
        aj.lIIIIIlllI[aj.lIIIIIllll[49]] = "Open";
        aj.lIIIIIlllI[aj.lIIIIIllll[50]] = "Chaos altar";
        aj.lIIIIIlllI[aj.lIIIIIllll[52]] = "Nav to altar";
        aj.lIIIIIlllI[aj.lIIIIIllll[53]] = "Unnoting bones";
        aj.lIIIIIlllI[aj.lIIIIIllll[15]] = "Elder Chaos druid";
        aj.lIIIIIlllI[aj.lIIIIIllll[54]] = "Large door";
        aj.lIIIIIlllI[aj.lIIIIIllll[55]] = "Open";
        aj.lIIIIIlllI[aj.lIIIIIllll[56]] = "Open";
        aj.lIIIIIlllI[aj.lIIIIIllll[57]] = "Open";
        aj.lIIIIIlllI[aj.lIIIIIllll[58]] = "Exchange";
        aj.lIIIIIlllI[aj.lIIIIIllll[59]] = "Exchange 5";
        aj.lIIIIIlllI[aj.lIIIIIllll[60]] = "Exchange All";
        aj.lIIIIIlllI[aj.lIIIIIllll[61]] = "Suiciding";
        aj.lIIIIIlllI[aj.lIIIIIllll[62]] = "Wine of zamorak";
        aj.lIIIIIlllI[aj.lIIIIIllll[63]] = "Take";
        aj.lIIIIIlllI[aj.lIIIIIllll[75]] = "Prayer training";
        aj.lIIIIIlllI[aj.lIIIIIllll[76]] = "ring of wealth (";
    }

    private static int eb() {
        int n2 = lIIIIIllll[70];
        if (aj.llIlllllIlII(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIllll[71]) && aj.llIllllllIll(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIllll[3])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIIIIllll[72] + lIIIIIllll[22];
        }
        int n3 = lIIIIIllll[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIIIIllll[72] + lIIIIIllll[63];
    }

    private static boolean llIllllllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIllllllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIIIIIllll[2]];
                nArray[aj.lIIIIIllll[1]] = lIIIIIllll[10];
                if (!aj.llIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIIIIIllll[2]];
                nArray2[aj.lIIIIIllll[1]] = lIIIIIllll[10];
                if (!aj.llIllllllIll(Inventory.getFirst((int[])nArray2).getQuantity(), lIIIIIllll[13])) break block2;
                if (!aj.llIlllllIlIl(Inventory.contains((int[])f.bh) ? 1 : 0)) break block3;
                if (!aj.llIlllllIIll(Equipment.contains((int[])f.bh) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIIIIIllll[2]];
                nArray3[aj.lIIIIIllll[1]] = lIIIIIllll[0];
                if (!aj.llIlllllIlIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lIIIIIllll[2]];
                nArray4[aj.lIIIIIllll[1]] = lIIIIIllll[51];
                if (!aj.llIlllllIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = lIIIIIllll[2];

            if (2 > -1) return n2 != 0;
            return (1 & ~1) != 0;
        }
        n2 = lIIIIIllll[1];
        return n2 != 0;
    }

    static {
        aj.llIlllllIIlI();
        aj.llIlllllIIIl();
        mg = new WorldPoint(lIIIIIllll[77], lIIIIIllll[78], lIIIIIllll[1]);
        mh = new WorldPoint(lIIIIIllll[79], lIIIIIllll[80], lIIIIIllll[1]);
        mi = new WorldPoint(lIIIIIllll[81], lIIIIIllll[82], lIIIIIllll[1]);
        mj = new WorldPoint(lIIIIIllll[83], lIIIIIllll[44], lIIIIIllll[1]);
        mk = new WorldPoint(lIIIIIllll[1], lIIIIIllll[1], lIIIIIllll[1]);
        ml = new WorldPoint(lIIIIIllll[1], lIIIIIllll[1], lIIIIIllll[1]);
        mm = new WorldPoint(lIIIIIllll[84], lIIIIIllll[85], lIIIIIllll[1]);
        bx = new ArrayList<d>();
    }

    public static void ea() {
        block44: {
            TileItem lllllIllllIl;
            block45: {
                if (aj.llIlllllIIll(bv ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[1]];
                    b.a(bx);
                    if (aj.llIlllllIlII(bx.size(), lIIIIIllll[2])) {
                        System.out.println(lIIIIIlllI[lIIIIIllll[2]]);
                        bv = lIIIIIllll[1];
                    }
                }
                if (!aj.llIlllllIlIl(bv ? 1 : 0) || !aj.llIlllllIlII(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIllll[3])) break block44;
                if (aj.llIlllllIlIl(aj.an() ? 1 : 0) && aj.llIlllllIlII(Game.getWildyLevel(), lIIIIIllll[2])) {
                    lllllIllllIl = BankLocation.getNearest();
                    if (aj.llIlllllIllI(lllllIllllIl) && aj.llIlllllIlIl(lllllIllllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[4]];
                        a.a((BankLocation)lllllIllllIl);
                    }
                    if (aj.llIlllllIllI(lllllIllllIl) && aj.llIlllllIIll(lllllIllllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[5]];
                        if (aj.llIlllllIlIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIllll[6]);

                        }
                        if (aj.llIlllllIIll(Bank.isOpen() ? 1 : 0)) {
                            if (aj.llIlllllIlll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIIIllll[7]);

                            }
                            if (aj.llIlllllIlll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIIIllll[4]);

                            }
                            int[] nArray = new int[lIIIIIllll[5]];
                            nArray[aj.lIIIIIllll[1]] = lIIIIIllll[8];
                            nArray[aj.lIIIIIllll[2]] = lIIIIIllll[0];
                            nArray[aj.lIIIIIllll[4]] = lIIIIIllll[9];
                            if (aj.llIlllllIlIl(e.d(nArray) ? 1 : 0)) {
                                aj.Q();
                                System.out.println(lIIIIIlllI[lIIIIIllll[7]]);
                                bv = lIIIIIllll[2];
                                return;
                            }
                            int[] nArray2 = new int[lIIIIIllll[5]];
                            nArray2[aj.lIIIIIllll[1]] = lIIIIIllll[8];
                            nArray2[aj.lIIIIIllll[2]] = lIIIIIllll[0];
                            nArray2[aj.lIIIIIllll[4]] = lIIIIIllll[9];
                            if (aj.llIlllllIIll(e.d(nArray2) ? 1 : 0)) {
                                if (aj.llIlllllIlIl(Equipment.contains((int[])f.bh) ? 1 : 0)) {
                                    a.b(f.bh, lIIIIIllll[2]);
                                }
                                a.b(f.bc, lIIIIIllll[2]);
                                a.a(lIIIIIllll[10], lIIIIIllll[11]);
                                a.b(lIIIIIllll[0], lIIIIIllll[12]);
                            }
                        }
                    }
                }
                if (aj.llIlllllIIll(aj.an() ? 1 : 0)) {
                    if (aj.llIlllllIIll(Inventory.contains((int[])f.bc) ? 1 : 0) && aj.llIlllllIlII(Movement.getRunEnergy(), lIIIIIllll[13])) {
                        Inventory.getFirst((int[])f.bc).interact(lIIIIIlllI[lIIIIIllll[14]]);
                        Time.sleepTicks((int)lIIIIIllll[2]);

                    }
                    if (aj.llIlllllIlIl(Movement.isRunEnabled() ? 1 : 0) && aj.llIllllllIII(Movement.getRunEnergy(), lIIIIIllll[15])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)lIIIIIllll[14]);

                    }
                    if (aj.llIlllllIlII(Game.getWildyLevel(), lIIIIIllll[2])) {
                        AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[16]];
                        if (aj.llIlllllIIll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (aj.llIlllllIlIl(Dialog.isOpen() ? 1 : 0) && aj.llIlllllIIll(Inventory.contains((int[])f.bh) ? 1 : 0) && aj.llIllllllIIl(Players.getLocal().getAnimation(), lIIIIIllll[17])) {
                            Inventory.getFirst((int[])f.bh).interact(lIIIIIlllI[lIIIIIllll[18]]);
                            Time.sleepTicks((int)lIIIIIllll[4]);

                        }
                        String[] stringArray = new String[lIIIIIllll[4]];
                        stringArray[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[19]];
                        stringArray[aj.lIIIIIllll[2]] = lIIIIIlllI[lIIIIIllll[20]];
                        g.a(stringArray);
                    }
                    if (aj.llIlllllIlll(Game.getWildyLevel())) {
                        TileObject lllllIllllII;
                        int[] nArray = new int[lIIIIIllll[2]];
                        nArray[aj.lIIIIIllll[1]] = lIIIIIllll[0];
                        if (aj.llIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (aj.llIllllllIII(Players.getLocal().getWorldLocation().distanceTo(mi), lIIIIIllll[21])) {
                                AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[22]];
                                TileItem tileItem = new WorldPoint[lIIIIIllll[21]];
                                tileItem[aj.lIIIIIllll[1]] = new WorldPoint(lIIIIIllll[23], lIIIIIllll[24], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[2]] = new WorldPoint(lIIIIIllll[25], lIIIIIllll[26], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[4]] = new WorldPoint(lIIIIIllll[27], lIIIIIllll[28], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[5]] = new WorldPoint(lIIIIIllll[29], lIIIIIllll[30], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[7]] = new WorldPoint(lIIIIIllll[31], lIIIIIllll[32], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[14]] = new WorldPoint(lIIIIIllll[33], lIIIIIllll[34], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[16]] = new WorldPoint(lIIIIIllll[35], lIIIIIllll[36], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[18]] = new WorldPoint(lIIIIIllll[37], lIIIIIllll[38], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[19]] = new WorldPoint(lIIIIIllll[39], lIIIIIllll[38], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[20]] = new WorldPoint(lIIIIIllll[40], lIIIIIllll[38], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[22]] = new WorldPoint(lIIIIIllll[41], lIIIIIllll[38], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[42]] = new WorldPoint(lIIIIIllll[43], lIIIIIllll[44], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[45]] = new WorldPoint(lIIIIIllll[46], lIIIIIllll[44], lIIIIIllll[1]);
                                lllllIllllIl = tileItem;
                                Walker.walkAlong(Arrays.asList(lllllIllllIl), new HashMap());

                                Time.sleepTicks((int)lIIIIIllll[2]);

                            }
                            if (aj.llIllllllIlI(Players.getLocal().getWorldLocation().distanceTo(mi), lIIIIIllll[21])) {
                                AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[42]];
                                String[] stringArray = new String[lIIIIIllll[2]];
                                stringArray[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[45]];
                                lllllIllllIl = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[lIIIIIllll[2]];
                                stringArray2[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[21]];
                                lllllIllllII = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[lIIIIIllll[2]];
                                stringArray3[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[47]];
                                if (aj.llIlllllIIll(lllllIllllII.hasAction(stringArray3) ? 1 : 0)) {
                                    lllllIllllII.interact(lIIIIIlllI[lIIIIIllll[48]]);
                                }
                                if (aj.llIlllllIllI(lllllIllllIl)) {
                                    String[] stringArray4 = new String[lIIIIIllll[2]];
                                    stringArray4[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[49]];
                                    if (aj.llIlllllIlIl(lllllIllllII.hasAction(stringArray4) ? 1 : 0)) {
                                        int lllllIlllIll = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[lIIIIIllll[2]];
                                        nArray3[aj.lIIIIIllll[1]] = lIIIIIllll[0];
                                        String[] stringArray5 = new String[lIIIIIllll[2]];
                                        stringArray5[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[50]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)lIIIIIllll[2]);

                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[lIIIIIllll[2]];
                        nArray4[aj.lIIIIIllll[1]] = lIIIIIllll[0];
                        if (aj.llIlllllIlIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIIIIllll[2]];
                            nArray5[aj.lIIIIIllll[1]] = lIIIIIllll[51];
                            if (aj.llIlllllIIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (aj.llIllllllIII(Players.getLocal().getWorldLocation().distanceTo(mi), lIIIIIllll[21])) {
                                    AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[52]];
                                    WorldPoint[] worldPointArray = new WorldPoint[lIIIIIllll[21]];
                                    worldPointArray[aj.lIIIIIllll[1]] = new WorldPoint(lIIIIIllll[23], lIIIIIllll[24], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[2]] = new WorldPoint(lIIIIIllll[25], lIIIIIllll[26], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[4]] = new WorldPoint(lIIIIIllll[27], lIIIIIllll[28], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[5]] = new WorldPoint(lIIIIIllll[29], lIIIIIllll[30], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[7]] = new WorldPoint(lIIIIIllll[31], lIIIIIllll[32], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[14]] = new WorldPoint(lIIIIIllll[33], lIIIIIllll[34], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[16]] = new WorldPoint(lIIIIIllll[35], lIIIIIllll[36], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[18]] = new WorldPoint(lIIIIIllll[37], lIIIIIllll[38], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[19]] = new WorldPoint(lIIIIIllll[39], lIIIIIllll[38], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[20]] = new WorldPoint(lIIIIIllll[40], lIIIIIllll[38], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[22]] = new WorldPoint(lIIIIIllll[41], lIIIIIllll[38], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[42]] = new WorldPoint(lIIIIIllll[43], lIIIIIllll[44], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[45]] = new WorldPoint(lIIIIIllll[46], lIIIIIllll[44], lIIIIIllll[1]);
                                    lllllIllllIl = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(lllllIllllIl), new HashMap());

                                    Time.sleepTicks((int)lIIIIIllll[2]);

                                }
                                if (aj.llIllllllIlI(Players.getLocal().getWorldLocation().distanceTo(mi), lIIIIIllll[21])) {
                                    AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[53]];
                                    if (!aj.llIlllllIlIl(Dialog.canLevelUpContinue() ? 1 : 0) || aj.llIlllllIIll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[lIIIIIllll[2]];
                                    stringArray[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[15]];
                                    lllllIllllIl = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIIIIIllll[2]];
                                    stringArray6[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[54]];
                                    lllllIllllII = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[lIIIIIllll[2]];
                                    stringArray7[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[55]];
                                    if (aj.llIlllllIIll(lllllIllllII.hasAction(stringArray7) ? 1 : 0)) {
                                        lllllIllllII.interact(lIIIIIlllI[lIIIIIllll[56]]);
                                    }
                                    if (aj.llIlllllIllI(lllllIllllIl)) {
                                        String[] stringArray8 = new String[lIIIIIllll[2]];
                                        stringArray8[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[57]];
                                        if (aj.llIlllllIlIl(lllllIllllII.hasAction(stringArray8) ? 1 : 0)) {
                                            List lllllIlllIll;
                                            if (aj.llIlllllIlIl(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[lIIIIIllll[2]];
                                                nArray6[aj.lIIIIIllll[1]] = lIIIIIllll[51];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)lllllIllllIl);
                                                Time.sleepTicks((int)lIIIIIllll[4]);

                                            }
                                            if (aj.llIlllllIIll(Dialog.isOpen() ? 1 : 0) && aj.llIlllllIlIl((lllllIlllIll = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int lllllIlllIlI = lIIIIIllll[1];
                                                while (aj.llIlllllIlII(lllllIlllIlI, lllllIlllIll.size())) {
                                                    int[] nArray7 = new int[lIIIIIllll[2]];
                                                    nArray7[aj.lIIIIIllll[1]] = lIIIIIllll[51];
                                                    if (aj.llIllllllIIl(((Item)Inventory.getAll((int[])nArray7).get(lIIIIIllll[1])).getQuantity(), lIIIIIllll[2]) && aj.llIlllllIIll(((Widget)lllllIlllIll.get(lllllIlllIlI)).getText().contains(lIIIIIlllI[lIIIIIllll[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lllllIlllIll.get(lllllIlllIlI)).getClickPoint().getX(), (int)((Widget)lllllIlllIll.get(lllllIlllIlI)).getClickPoint().getY(), (boolean)lIIIIIllll[2]);
                                                        Time.sleepTicks((int)lIIIIIllll[4]);

                                                    }
                                                    int[] nArray8 = new int[lIIIIIllll[2]];
                                                    nArray8[aj.lIIIIIllll[1]] = lIIIIIllll[51];
                                                    if (aj.llIllllllIIl(((Item)Inventory.getAll((int[])nArray8).get(lIIIIIllll[1])).getQuantity(), lIIIIIllll[14]) && aj.llIlllllIIll(((Widget)lllllIlllIll.get(lllllIlllIlI)).getText().contains(lIIIIIlllI[lIIIIIllll[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lllllIlllIll.get(lllllIlllIlI)).getClickPoint().getX(), (int)((Widget)lllllIlllIll.get(lllllIlllIlI)).getClickPoint().getY(), (boolean)lIIIIIllll[2]);
                                                        Time.sleepTicks((int)lIIIIIllll[4]);

                                                    }
                                                    if (aj.llIlllllIIll(((Widget)lllllIlllIll.get(lllllIlllIlI)).getText().contains(lIIIIIlllI[lIIIIIllll[60]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lllllIlllIll.get(lllllIlllIlI)).getClickPoint().getX(), (int)((Widget)lllllIlllIll.get(lllllIlllIlI)).getClickPoint().getY(), (boolean)lIIIIIllll[2]);
                                                        Time.sleepTicks((int)lIIIIIllll[4]);

                                                    }
                                                    ++lllllIlllIlI;

                                                    if (1 >= 0) continue;
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
                int[] nArray = new int[lIIIIIllll[2]];
                nArray[aj.lIIIIIllll[1]] = lIIIIIllll[10];
                if (!aj.llIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[lIIIIIllll[2]];
                nArray9[aj.lIIIIIllll[1]] = lIIIIIllll[0];
                if (!aj.llIlllllIlIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[lIIIIIllll[2]];
                nArray10[aj.lIIIIIllll[1]] = lIIIIIllll[51];
                if (!aj.llIlllllIlIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (aj.llIllllllIlI(Players.getLocal().getWorldLocation().distanceTo(mi), lIIIIIllll[21])) {
                AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[61]];
                String[] stringArray = new String[lIIIIIllll[2]];
                stringArray[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[62]];
                lllllIllllIl = TileItems.getNearest((String[])stringArray);
                if (aj.llIlllllIllI(lllllIllllIl)) {
                    lllllIllllIl.interact(lIIIIIlllI[lIIIIIllll[63]]);
                }
            }
        }
    }

    private static boolean llIlllllIllI(Object object) {
        return object != null;
    }

    private static boolean llIlllllIlll(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aj.llIllllllIll(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIllll[3])) {
            bl = lIIIIIllll[2];

            if (3 <= 0) {
                return false;
            }
        } else {
            bl = lIIIIIllll[1];
        }
        return bl;
    }

        return String.valueOf(lllllIIIlIIl);
    }

    private static void Q() {
        d lllllIllIllI;
        Object lllllIllIlll;
        int[] nArray = new int[lIIIIIllll[2]];
        nArray[aj.lIIIIIllll[1]] = lIIIIIllll[9];
        if (aj.llIlllllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIIIIIllll[9], lIIIIIllll[14], j.ch);
            bx.add(d2);

        }
        int[] nArray2 = new int[lIIIIIllll[2]];
        nArray2[aj.lIIIIIllll[1]] = lIIIIIllll[0];
        if (aj.llIlllllIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllllIllIlll = new DHelper(lIIIIIllll[0], aj.eb(), lIIIIIllll[64]);
            bx.add((DHelper) llllIllIlll);

        }
        int[] nArray3 = new int[lIIIIIllll[2]];
        nArray3[aj.lIIIIIllll[1]] = lIIIIIllll[8];
        if (aj.llIlllllIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllIllIlll = new DHelper(lIIIIIllll[8], lIIIIIllll[4], lIIIIIllll[6]);
            bx.add((DHelper) llllIllIlll);

        }
        if (aj.llIlllllIlIl(Bank.contains((Predicate)(lllllIllIlll = item -> item.getName().toLowerCase().contains(lIIIIIlllI[lIIIIIllll[76]]))) ? 1 : 0)) {
            lllllIllIllI = new DHelper(lIIIIIllll[65], lIIIIIllll[14], lIIIIIllll[66]);
            bx.add(lllllIllIllI);

        }
        int[] nArray4 = new int[lIIIIIllll[2]];
        nArray4[aj.lIIIIIllll[1]] = lIIIIIllll[67];
        if (aj.llIlllllIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllllIllIllI = new DHelper(lIIIIIllll[67], lIIIIIllll[68], lIIIIIllll[69]);
            bx.add(lllllIllIllI);

        }
    }
}

