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
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import gg.squire.account.AccBuilderSotf;
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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;

public class APHelper
implements ac {
    
    public static  List<d> bv;
    
    static final  WorldPoint nD;
    private final  int nG = 536;
    static final  WorldPoint nF;
    public static final  WorldPoint nC;
    public static final  WorldPoint nB;
    public static  boolean bt;
    public static final  WorldPoint nA;
    static final  WorldPoint nE;
    public static final  WorldPoint nz;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[llIIIIlIlI[2]];
                nArray[ap.llIIIIlIlI[1]] = llIIIIlIlI[10];
                if (!ap.lIlIIlIIIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[llIIIIlIlI[2]];
                nArray2[ap.llIIIIlIlI[1]] = llIIIIlIlI[10];
                if (!ap.lIlIIlIIIlIII(Inventory.getFirst((int[])nArray2).getQuantity(), llIIIIlIlI[13])) break block2;
                if (!ap.lIlIIlIIIIIlI(Inventory.contains((int[])f.bf) ? 1 : 0)) break block3;
                if (!ap.lIlIIlIIIIIII(Equipment.contains((int[])f.bf) ? 1 : 0)) break block2;
                int[] nArray3 = new int[llIIIIlIlI[2]];
                nArray3[ap.llIIIIlIlI[1]] = llIIIIlIlI[0];
                if (!ap.lIlIIlIIIIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[llIIIIlIlI[2]];
                nArray4[ap.llIIIIlIlI[1]] = llIIIIlIlI[51];
                if (!ap.lIlIIlIIIIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = llIIIIlIlI[2];

            if (2 > 1) return n2 != 0;
            return false;
        }
        n2 = llIIIIlIlI[1];
        return n2 != 0;
    }

    private static void lIlIIIllllllI() {
        llIIIIlIIl = new String[llIIIIlIlI[86]];
        ap.llIIIIlIIl[ap.llIIIIlIlI[1]] = "Buying items";
        ap.llIIIIlIIl[ap.llIIIIlIlI[2]] = "Finished buying items, switching back to prayer";
        ap.llIIIIlIIl[ap.llIIIIlIlI[4]] = "Navigating to bank";
        ap.llIIIIlIIl[ap.llIIIIlIlI[5]] = "Handling banking";
        ap.llIIIIlIIl[ap.llIIIIlIlI[7]] = "We are missing prayer supplies, switching to BUYING";
        ap.llIIIIlIIl[ap.llIIIIlIlI[14]] = "Drink";
        ap.llIIIIlIIl[ap.llIIIIlIlI[16]] = "Tele to wildy";
        ap.llIIIIlIIl[ap.llIIIIlIlI[18]] = "Rub";
        ap.llIIIIlIIl[ap.llIIIIlIlI[19]] = "Lava Maze";
        ap.llIIIIlIIl[ap.llIIIIlIlI[20]] = "Okay, teleport to level 41 Wilderness.";
        ap.llIIIIlIIl[ap.llIIIIlIlI[22]] = "Nav to altar";
        ap.llIIIIlIIl[ap.llIIIIlIlI[42]] = "1 tick pray";
        ap.llIIIIlIIl[ap.llIIIIlIlI[45]] = "Chaos altar";
        ap.llIIIIlIIl[ap.llIIIIlIlI[21]] = "Large door";
        ap.llIIIIlIIl[ap.llIIIIlIlI[47]] = "Open";
        ap.llIIIIlIIl[ap.llIIIIlIlI[48]] = "Open";
        ap.llIIIIlIIl[ap.llIIIIlIlI[49]] = "Open";
        ap.llIIIIlIIl[ap.llIIIIlIlI[50]] = "Chaos altar";
        ap.llIIIIlIIl[ap.llIIIIlIlI[52]] = "Nav to altar";
        ap.llIIIIlIIl[ap.llIIIIlIlI[53]] = "Unnoting bones";
        ap.llIIIIlIIl[ap.llIIIIlIlI[15]] = "Elder Chaos druid";
        ap.llIIIIlIIl[ap.llIIIIlIlI[54]] = "Large door";
        ap.llIIIIlIIl[ap.llIIIIlIlI[55]] = "Open";
        ap.llIIIIlIIl[ap.llIIIIlIlI[56]] = "Open";
        ap.llIIIIlIIl[ap.llIIIIlIlI[57]] = "Open";
        ap.llIIIIlIIl[ap.llIIIIlIlI[58]] = "Exchange";
        ap.llIIIIlIIl[ap.llIIIIlIlI[59]] = "Exchange 5";
        ap.llIIIIlIIl[ap.llIIIIlIlI[60]] = "Exchange All";
        ap.llIIIIlIIl[ap.llIIIIlIlI[61]] = "Suiciding";
        ap.llIIIIlIIl[ap.llIIIIlIlI[62]] = "Wine of zamorak";
        ap.llIIIIlIIl[ap.llIIIIlIlI[63]] = "Take";
        ap.llIIIIlIIl[ap.llIIIIlIlI[75]] = "Prayer training";
        ap.llIIIIlIIl[ap.llIIIIlIlI[76]] = "ring of wealth (";
    }

    private static boolean lIlIIlIIIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIIIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlIIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIlIIIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String ag() {
        return llIIIIlIIl[llIIIIlIlI[75]];
    }

    private static int fZ() {
        int n2 = llIIIIlIlI[70];
        if (ap.lIlIIlIIIIIIl(Skills.getLevel((Skill)Skill.PRAYER), llIIIIlIlI[71]) && ap.lIlIIlIIIlIII(Skills.getLevel((Skill)Skill.PRAYER), llIIIIlIlI[3])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / llIIIIlIlI[72] + llIIIIlIlI[22];
        }
        int n3 = llIIIIlIlI[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / llIIIIlIlI[72] + llIIIIlIlI[63];
    }

    static {
        ap.lIlIIIlllllll();
        ap.lIlIIIllllllI();
        nz = new WorldPoint(llIIIIlIlI[77], llIIIIlIlI[78], llIIIIlIlI[1]);
        nA = new WorldPoint(llIIIIlIlI[79], llIIIIlIlI[80], llIIIIlIlI[1]);
        nB = new WorldPoint(llIIIIlIlI[81], llIIIIlIlI[82], llIIIIlIlI[1]);
        nC = new WorldPoint(llIIIIlIlI[83], llIIIIlIlI[44], llIIIIlIlI[1]);
        nD = new WorldPoint(llIIIIlIlI[1], llIIIIlIlI[1], llIIIIlIlI[1]);
        nE = new WorldPoint(llIIIIlIlI[1], llIIIIlIlI[1], llIIIIlIlI[1]);
        nF = new WorldPoint(llIIIIlIlI[84], llIIIIlIlI[85], llIIIIlIlI[1]);
        bv = new ArrayList<d>();
    }

    private static boolean lIlIIlIIIIIll(Object object) {
        return object != null;
    }

        return String.valueOf(var1);
    }

    public APHelper() {
        this.nG = llIIIIlIlI[0];
    }

    private static boolean lIlIIlIIIIIII(int n2) {
        return n2 != 0;
    }

    @Override
    public int af() {
        try {
            ap.fY();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((3 & (3 ^ -1)) != 0) {
            return (0x98 ^ 0xAA ^ (0xAD ^ 0xBD)) & (147 + 90 - 181 + 111 ^ 23 + 68 - -20 + 22 ^ -1);
        }
        return llIIIIlIlI[74];
    }

    public static void fY() {
        block44: {
            TileItem var2;
            block45: {
                if (ap.lIlIIlIIIIIII(bt ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[1]];
                    b.a(bv);
                    if (ap.lIlIIlIIIIIIl(bv.size(), llIIIIlIlI[2])) {
                        System.out.println(llIIIIlIIl[llIIIIlIlI[2]]);
                        bt = llIIIIlIlI[1];
                    }
                }
                if (!ap.lIlIIlIIIIIlI(bt ? 1 : 0) || !ap.lIlIIlIIIIIIl(Skills.getLevel((Skill)Skill.PRAYER), llIIIIlIlI[3])) break block44;
                if (ap.lIlIIlIIIIIlI(ap.an() ? 1 : 0) && ap.lIlIIlIIIIIIl(Game.getWildyLevel(), llIIIIlIlI[2])) {
                    var2 = BankLocation.getNearest();
                    if (ap.lIlIIlIIIIIll(var2) && ap.lIlIIlIIIIIlI(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[4]];
                        a.a((BankLocation)var2);
                    }
                    if (ap.lIlIIlIIIIIll(var2) && ap.lIlIIlIIIIIII(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[5]];
                        if (ap.lIlIIlIIIIIlI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIIlIlI[6]);

                        }
                        if (ap.lIlIIlIIIIIII(Bank.isOpen() ? 1 : 0)) {
                            if (ap.lIlIIlIIIIlII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIIIlIlI[7]);

                            }
                            if (ap.lIlIIlIIIIlII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIIIIlIlI[4]);

                            }
                            int[] nArray = new int[llIIIIlIlI[5]];
                            nArray[ap.llIIIIlIlI[1]] = llIIIIlIlI[8];
                            nArray[ap.llIIIIlIlI[2]] = llIIIIlIlI[0];
                            nArray[ap.llIIIIlIlI[4]] = llIIIIlIlI[9];
                            if (ap.lIlIIlIIIIIlI(e.c(nArray) ? 1 : 0)) {
                                ap.Q();
                                System.out.println(llIIIIlIIl[llIIIIlIlI[7]]);
                                bt = llIIIIlIlI[2];
                                return;
                            }
                            int[] nArray2 = new int[llIIIIlIlI[5]];
                            nArray2[ap.llIIIIlIlI[1]] = llIIIIlIlI[8];
                            nArray2[ap.llIIIIlIlI[2]] = llIIIIlIlI[0];
                            nArray2[ap.llIIIIlIlI[4]] = llIIIIlIlI[9];
                            if (ap.lIlIIlIIIIIII(e.c(nArray2) ? 1 : 0)) {
                                if (ap.lIlIIlIIIIIlI(Equipment.contains((int[])f.bf) ? 1 : 0)) {
                                    a.b(f.bf, llIIIIlIlI[2]);
                                }
                                a.b(f.ba, llIIIIlIlI[2]);
                                a.a(llIIIIlIlI[10], llIIIIlIlI[11]);
                                a.b(llIIIIlIlI[0], llIIIIlIlI[12]);
                            }
                        }
                    }
                }
                if (ap.lIlIIlIIIIIII(ap.an() ? 1 : 0)) {
                    if (ap.lIlIIlIIIIIII(Inventory.contains((int[])f.ba) ? 1 : 0) && ap.lIlIIlIIIIIIl(Movement.getRunEnergy(), llIIIIlIlI[13])) {
                        Inventory.getFirst((int[])f.ba).interact(llIIIIlIIl[llIIIIlIlI[14]]);
                        Time.sleepTicks((int)llIIIIlIlI[2]);

                    }
                    if (ap.lIlIIlIIIIIlI(Movement.isRunEnabled() ? 1 : 0) && ap.lIlIIlIIIIlIl(Movement.getRunEnergy(), llIIIIlIlI[15])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)llIIIIlIlI[14]);

                    }
                    if (ap.lIlIIlIIIIIIl(Game.getWildyLevel(), llIIIIlIlI[2])) {
                        AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[16]];
                        if (ap.lIlIIlIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (ap.lIlIIlIIIIIlI(Dialog.isOpen() ? 1 : 0) && ap.lIlIIlIIIIIII(Inventory.contains((int[])f.bf) ? 1 : 0) && ap.lIlIIlIIIIllI(Players.getLocal().getAnimation(), llIIIIlIlI[17])) {
                            Inventory.getFirst((int[])f.bf).interact(llIIIIlIIl[llIIIIlIlI[18]]);
                            Time.sleepTicks((int)llIIIIlIlI[4]);

                        }
                        String[] stringArray = new String[llIIIIlIlI[4]];
                        stringArray[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[19]];
                        stringArray[ap.llIIIIlIlI[2]] = llIIIIlIIl[llIIIIlIlI[20]];
                        g.a(stringArray);
                    }
                    if (ap.lIlIIlIIIIlII(Game.getWildyLevel())) {
                        TileObject var3;
                        int[] nArray = new int[llIIIIlIlI[2]];
                        nArray[ap.llIIIIlIlI[1]] = llIIIIlIlI[0];
                        if (ap.lIlIIlIIIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (ap.lIlIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                                AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[22]];
                                TileItem tileItem = new WorldPoint[llIIIIlIlI[21]];
                                tileItem[ap.llIIIIlIlI[1]] = new WorldPoint(llIIIIlIlI[23], llIIIIlIlI[24], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[2]] = new WorldPoint(llIIIIlIlI[25], llIIIIlIlI[26], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[4]] = new WorldPoint(llIIIIlIlI[27], llIIIIlIlI[28], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[5]] = new WorldPoint(llIIIIlIlI[29], llIIIIlIlI[30], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[7]] = new WorldPoint(llIIIIlIlI[31], llIIIIlIlI[32], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[14]] = new WorldPoint(llIIIIlIlI[33], llIIIIlIlI[34], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[16]] = new WorldPoint(llIIIIlIlI[35], llIIIIlIlI[36], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[18]] = new WorldPoint(llIIIIlIlI[37], llIIIIlIlI[38], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[19]] = new WorldPoint(llIIIIlIlI[39], llIIIIlIlI[38], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[20]] = new WorldPoint(llIIIIlIlI[40], llIIIIlIlI[38], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[22]] = new WorldPoint(llIIIIlIlI[41], llIIIIlIlI[38], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[42]] = new WorldPoint(llIIIIlIlI[43], llIIIIlIlI[44], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[45]] = new WorldPoint(llIIIIlIlI[46], llIIIIlIlI[44], llIIIIlIlI[1]);
                                var2 = tileItem;
                                Walker.walkAlong(Arrays.asList(var2), new HashMap());

                                Time.sleepTicks((int)llIIIIlIlI[2]);

                            }
                            if (ap.lIlIIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                                AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[42]];
                                String[] stringArray = new String[llIIIIlIlI[2]];
                                stringArray[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[45]];
                                var2 = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[llIIIIlIlI[2]];
                                stringArray2[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[21]];
                                var3 = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[llIIIIlIlI[2]];
                                stringArray3[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[47]];
                                if (ap.lIlIIlIIIIIII(var3.hasAction(stringArray3) ? 1 : 0)) {
                                    var3.interact(llIIIIlIIl[llIIIIlIlI[48]]);
                                }
                                if (ap.lIlIIlIIIIIll(var2)) {
                                    String[] stringArray4 = new String[llIIIIlIlI[2]];
                                    stringArray4[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[49]];
                                    if (ap.lIlIIlIIIIIlI(var3.hasAction(stringArray4) ? 1 : 0)) {
                                        int var4 = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[llIIIIlIlI[2]];
                                        nArray3[ap.llIIIIlIlI[1]] = llIIIIlIlI[0];
                                        String[] stringArray5 = new String[llIIIIlIlI[2]];
                                        stringArray5[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[50]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)llIIIIlIlI[2]);

                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[llIIIIlIlI[2]];
                        nArray4[ap.llIIIIlIlI[1]] = llIIIIlIlI[0];
                        if (ap.lIlIIlIIIIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[llIIIIlIlI[2]];
                            nArray5[ap.llIIIIlIlI[1]] = llIIIIlIlI[51];
                            if (ap.lIlIIlIIIIIII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (ap.lIlIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                                    AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[52]];
                                    WorldPoint[] worldPointArray = new WorldPoint[llIIIIlIlI[21]];
                                    worldPointArray[ap.llIIIIlIlI[1]] = new WorldPoint(llIIIIlIlI[23], llIIIIlIlI[24], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[2]] = new WorldPoint(llIIIIlIlI[25], llIIIIlIlI[26], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[4]] = new WorldPoint(llIIIIlIlI[27], llIIIIlIlI[28], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[5]] = new WorldPoint(llIIIIlIlI[29], llIIIIlIlI[30], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[7]] = new WorldPoint(llIIIIlIlI[31], llIIIIlIlI[32], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[14]] = new WorldPoint(llIIIIlIlI[33], llIIIIlIlI[34], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[16]] = new WorldPoint(llIIIIlIlI[35], llIIIIlIlI[36], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[18]] = new WorldPoint(llIIIIlIlI[37], llIIIIlIlI[38], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[19]] = new WorldPoint(llIIIIlIlI[39], llIIIIlIlI[38], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[20]] = new WorldPoint(llIIIIlIlI[40], llIIIIlIlI[38], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[22]] = new WorldPoint(llIIIIlIlI[41], llIIIIlIlI[38], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[42]] = new WorldPoint(llIIIIlIlI[43], llIIIIlIlI[44], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[45]] = new WorldPoint(llIIIIlIlI[46], llIIIIlIlI[44], llIIIIlIlI[1]);
                                    var2 = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(var2), new HashMap());

                                    Time.sleepTicks((int)llIIIIlIlI[2]);

                                }
                                if (ap.lIlIIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                                    AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[53]];
                                    if (!ap.lIlIIlIIIIIlI(Dialog.canLevelUpContinue() ? 1 : 0) || ap.lIlIIlIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[llIIIIlIlI[2]];
                                    stringArray[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[15]];
                                    var2 = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[llIIIIlIlI[2]];
                                    stringArray6[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[54]];
                                    var3 = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[llIIIIlIlI[2]];
                                    stringArray7[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[55]];
                                    if (ap.lIlIIlIIIIIII(var3.hasAction(stringArray7) ? 1 : 0)) {
                                        var3.interact(llIIIIlIIl[llIIIIlIlI[56]]);
                                    }
                                    if (ap.lIlIIlIIIIIll(var2)) {
                                        String[] stringArray8 = new String[llIIIIlIlI[2]];
                                        stringArray8[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[57]];
                                        if (ap.lIlIIlIIIIIlI(var3.hasAction(stringArray8) ? 1 : 0)) {
                                            List var4;
                                            if (ap.lIlIIlIIIIIlI(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[llIIIIlIlI[2]];
                                                nArray6[ap.llIIIIlIlI[1]] = llIIIIlIlI[51];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)var2);
                                                Time.sleepTicks((int)llIIIIlIlI[4]);

                                            }
                                            if (ap.lIlIIlIIIIIII(Dialog.isOpen() ? 1 : 0) && ap.lIlIIlIIIIIlI((var4 = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int var5 = llIIIIlIlI[1];
                                                while (ap.lIlIIlIIIIIIl(var5, var4.size())) {
                                                    int[] nArray7 = new int[llIIIIlIlI[2]];
                                                    nArray7[ap.llIIIIlIlI[1]] = llIIIIlIlI[51];
                                                    if (ap.lIlIIlIIIIllI(((Item)Inventory.getAll((int[])nArray7).get(llIIIIlIlI[1])).getQuantity(), llIIIIlIlI[2]) && ap.lIlIIlIIIIIII(((Widget)var4.get(var5)).getText().contains(llIIIIlIIl[llIIIIlIlI[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var4.get(var5)).getClickPoint().getX(), (int)((Widget)var4.get(var5)).getClickPoint().getY(), (boolean)llIIIIlIlI[2]);
                                                        Time.sleepTicks((int)llIIIIlIlI[4]);

                                                    }
                                                    int[] nArray8 = new int[llIIIIlIlI[2]];
                                                    nArray8[ap.llIIIIlIlI[1]] = llIIIIlIlI[51];
                                                    if (ap.lIlIIlIIIIllI(((Item)Inventory.getAll((int[])nArray8).get(llIIIIlIlI[1])).getQuantity(), llIIIIlIlI[14]) && ap.lIlIIlIIIIIII(((Widget)var4.get(var5)).getText().contains(llIIIIlIIl[llIIIIlIlI[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var4.get(var5)).getClickPoint().getX(), (int)((Widget)var4.get(var5)).getClickPoint().getY(), (boolean)llIIIIlIlI[2]);
                                                        Time.sleepTicks((int)llIIIIlIlI[4]);

                                                    }
                                                    if (ap.lIlIIlIIIIIII(((Widget)var4.get(var5)).getText().contains(llIIIIlIIl[llIIIIlIlI[60]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var4.get(var5)).getClickPoint().getX(), (int)((Widget)var4.get(var5)).getClickPoint().getY(), (boolean)llIIIIlIlI[2]);
                                                        Time.sleepTicks((int)llIIIIlIlI[4]);

                                                    }
                                                    ++var5;

                                                    if (3 != 0) continue;
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    e.t();
                                }
                            }
                        }
                    }
                }
                int[] nArray = new int[llIIIIlIlI[2]];
                nArray[ap.llIIIIlIlI[1]] = llIIIIlIlI[10];
                if (!ap.lIlIIlIIIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[llIIIIlIlI[2]];
                nArray9[ap.llIIIIlIlI[1]] = llIIIIlIlI[0];
                if (!ap.lIlIIlIIIIIlI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[llIIIIlIlI[2]];
                nArray10[ap.llIIIIlIlI[1]] = llIIIIlIlI[51];
                if (!ap.lIlIIlIIIIIlI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (ap.lIlIIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[61]];
                String[] stringArray = new String[llIIIIlIlI[2]];
                stringArray[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[62]];
                var2 = TileItems.getNearest((String[])stringArray);
                if (ap.lIlIIlIIIIIll(var2)) {
                    var2.interact(llIIIIlIIl[llIIIIlIlI[63]]);
                }
            }
        }
    }

    private static boolean lIlIIlIIIIIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ap.lIlIIlIIIlIII(Skills.getLevel((Skill)Skill.PRAYER), llIIIIlIlI[3])) {
            bl = llIIIIlIlI[2];

            if (1 == 0) {
                return ((0xBB ^ 0xA8 ^ (0xB4 ^ 0x98)) & (62 + 122 - 21 + 18 ^ 97 + 111 - 164 + 94 ^ -1)) != 0;
            }
        } else {
            bl = llIIIIlIlI[1];
        }
        return bl;
    }

    private static boolean lIlIIlIIIIlII(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean ae() {
        return llIIIIlIlI[1];
    }

    private static boolean lIlIIlIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void Q() {
        d var6;
        Object var7;
        int[] nArray = new int[llIIIIlIlI[2]];
        nArray[ap.llIIIIlIlI[1]] = llIIIIlIlI[9];
        if (ap.lIlIIlIIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llIIIIlIlI[9], llIIIIlIlI[14], j.cf);
            bv.add(d2);

        }
        int[] nArray2 = new int[llIIIIlIlI[2]];
        nArray2[ap.llIIIIlIlI[1]] = llIIIIlIlI[0];
        if (ap.lIlIIlIIIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var7 = new DHelper(llIIIIlIlI[0], ap.fZ(), llIIIIlIlI[64]);
            bv.add((DHelper) ar7);

        }
        int[] nArray3 = new int[llIIIIlIlI[2]];
        nArray3[ap.llIIIIlIlI[1]] = llIIIIlIlI[8];
        if (ap.lIlIIlIIIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var7 = new DHelper(llIIIIlIlI[8], llIIIIlIlI[4], llIIIIlIlI[6]);
            bv.add((DHelper) ar7);

        }
        if (ap.lIlIIlIIIIIlI(Bank.contains((Predicate)(var7 = item -> item.getName().toLowerCase().contains(llIIIIlIIl[llIIIIlIlI[76]]))) ? 1 : 0)) {
            var6 = new DHelper(llIIIIlIlI[65], llIIIIlIlI[14], llIIIIlIlI[66]);
            bv.add(var6);

        }
        int[] nArray4 = new int[llIIIIlIlI[2]];
        nArray4[ap.llIIIIlIlI[1]] = llIIIIlIlI[67];
        if (ap.lIlIIlIIIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var6 = new DHelper(llIIIIlIlI[67], llIIIIlIlI[68], llIIIIlIlI[69]);
            bv.add(var6);

        }
    }
}

