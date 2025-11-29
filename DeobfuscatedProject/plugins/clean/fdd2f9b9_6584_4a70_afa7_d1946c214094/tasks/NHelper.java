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
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.BHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.FHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.GHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.IHelper;
import gg.squire.account.AccBuilderRogues;
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

public class NHelper
implements G {
    static final  WorldPoint iN;
    public static  List<d> bv;
    
    public static final  WorldPoint iM;
    public static final  WorldPoint iJ;
    public static final  WorldPoint iK;
    
    static final  WorldPoint iP;
    static final  WorldPoint iO;
    public static  boolean bt;
    private final  int iQ = 536;
    public static final  WorldPoint iL;

    @Override
    public boolean S() {
        return lIIlIllIll[1];
    }

    private static boolean lIIIIIIIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIIIIIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIIlIllIll[2]];
                nArray[N.lIIlIllIll[1]] = lIIlIllIll[10];
                if (!N.lIIIIIIIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIIlIllIll[2]];
                nArray2[N.lIIlIllIll[1]] = lIIlIllIll[10];
                if (!N.lIIIIIIIIllII(Inventory.getFirst((int[])nArray2).getQuantity(), lIIlIllIll[13])) break block2;
                if (!N.lIIIIIIIIIllI(Inventory.contains((int[])f.ba) ? 1 : 0)) break block3;
                if (!N.lIIIIIIIIIlII(Equipment.contains((int[])f.ba) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIIlIllIll[2]];
                nArray3[N.lIIlIllIll[1]] = lIIlIllIll[0];
                if (!N.lIIIIIIIIIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lIIlIllIll[2]];
                nArray4[N.lIIlIllIll[1]] = lIIlIllIll[51];
                if (!N.lIIIIIIIIIlII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = lIIlIllIll[2];

            if (-2 <= 0) return n2 != 0;
            return false;
        }
        n2 = lIIlIllIll[1];
        return n2 != 0;
    }

    private static boolean lIIIIIIIIlIII(int n2) {
        return n2 > 0;
    }

    private static int cC() {
        int n2 = lIIlIllIll[70];
        if (N.lIIIIIIIIIlIl(Skills.getLevel((Skill)Skill.PRAYER), lIIlIllIll[71]) && N.lIIIIIIIIllII(Skills.getLevel((Skill)Skill.PRAYER), lIIlIllIll[3])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIlIllIll[72] + lIIlIllIll[22];
        }
        int n3 = lIIlIllIll[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIlIllIll[72] + lIIlIllIll[63];
    }

    private static void llllllllIlll() {
        lIIlIllIlI = new String[lIIlIllIll[86]];
        N.lIIlIllIlI[N.lIIlIllIll[1]] = "Buying items";
        N.lIIlIllIlI[N.lIIlIllIll[2]] = "Finished buying items, switching back to prayer";
        N.lIIlIllIlI[N.lIIlIllIll[4]] = "Navigating to bank";
        N.lIIlIllIlI[N.lIIlIllIll[5]] = "Handling banking";
        N.lIIlIllIlI[N.lIIlIllIll[7]] = "We are missing prayer supplies, switching to BUYING";
        N.lIIlIllIlI[N.lIIlIllIll[14]] = "Drink";
        N.lIIlIllIlI[N.lIIlIllIll[16]] = "Tele to wildy";
        N.lIIlIllIlI[N.lIIlIllIll[18]] = "Rub";
        N.lIIlIllIlI[N.lIIlIllIll[19]] = "Lava Maze";
        N.lIIlIllIlI[N.lIIlIllIll[20]] = "Okay, teleport to level 41 Wilderness.";
        N.lIIlIllIlI[N.lIIlIllIll[22]] = "Nav to altar";
        N.lIIlIllIlI[N.lIIlIllIll[42]] = "1 tick pray";
        N.lIIlIllIlI[N.lIIlIllIll[45]] = "Chaos altar";
        N.lIIlIllIlI[N.lIIlIllIll[21]] = "Large door";
        N.lIIlIllIlI[N.lIIlIllIll[47]] = "Open";
        N.lIIlIllIlI[N.lIIlIllIll[48]] = "Open";
        N.lIIlIllIlI[N.lIIlIllIll[49]] = "Open";
        N.lIIlIllIlI[N.lIIlIllIll[50]] = "Chaos altar";
        N.lIIlIllIlI[N.lIIlIllIll[52]] = "Nav to altar";
        N.lIIlIllIlI[N.lIIlIllIll[53]] = "Unnoting bones";
        N.lIIlIllIlI[N.lIIlIllIll[15]] = "Elder Chaos druid";
        N.lIIlIllIlI[N.lIIlIllIll[54]] = "Large door";
        N.lIIlIllIlI[N.lIIlIllIll[55]] = "Open";
        N.lIIlIllIlI[N.lIIlIllIll[56]] = "Open";
        N.lIIlIllIlI[N.lIIlIllIll[57]] = "Open";
        N.lIIlIllIlI[N.lIIlIllIll[58]] = "Exchange";
        N.lIIlIllIlI[N.lIIlIllIll[59]] = "Exchange 5";
        N.lIIlIllIlI[N.lIIlIllIll[60]] = "Exchange All";
        N.lIIlIllIlI[N.lIIlIllIll[61]] = "Suiciding";
        N.lIIlIllIlI[N.lIIlIllIll[62]] = "Wine of zamorak";
        N.lIIlIllIlI[N.lIIlIllIll[63]] = "Take";
        N.lIIlIllIlI[N.lIIlIllIll[75]] = "Prayer training";
        N.lIIlIllIlI[N.lIIlIllIll[76]] = "ring of wealth (";
    }

    private static void af() {
        d var1;
        Object var2;
        int[] nArray = new int[lIIlIllIll[2]];
        nArray[N.lIIlIllIll[1]] = lIIlIllIll[9];
        if (N.lIIIIIIIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIIlIllIll[9], lIIlIllIll[14], i.bq);
            bv.add(d2);

        }
        int[] nArray2 = new int[lIIlIllIll[2]];
        nArray2[N.lIIlIllIll[1]] = lIIlIllIll[0];
        if (N.lIIIIIIIIIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var2 = new DHelper(lIIlIllIll[0], N.cC(), lIIlIllIll[64]);
            bv.add((DHelper) ar2);

        }
        int[] nArray3 = new int[lIIlIllIll[2]];
        nArray3[N.lIIlIllIll[1]] = lIIlIllIll[8];
        if (N.lIIIIIIIIIllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var2 = new DHelper(lIIlIllIll[8], lIIlIllIll[4], lIIlIllIll[6]);
            bv.add((DHelper) ar2);

        }
        if (N.lIIIIIIIIIllI(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(lIIlIllIlI[lIIlIllIll[76]]))) ? 1 : 0)) {
            var1 = new DHelper(lIIlIllIll[65], lIIlIllIll[14], lIIlIllIll[66]);
            bv.add(var1);

        }
        int[] nArray4 = new int[lIIlIllIll[2]];
        nArray4[N.lIIlIllIll[1]] = lIIlIllIll[67];
        if (N.lIIIIIIIIIllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var1 = new DHelper(lIIlIllIll[67], lIIlIllIll[68], lIIlIllIll[69]);
            bv.add(var1);

        }
    }

    private static boolean lIIIIIIIIIllI(int n2) {
        return n2 == 0;
    }

    @Override
    public String U() {
        return lIIlIllIlI[lIIlIllIll[75]];
    }

    private static boolean lIIIIIIIIIlll(Object object) {
        return object != null;
    }

    public NHelper() {
        this.iQ = lIIlIllIll[0];
    }

    @Override
    public boolean V() {
        boolean bl;
        if (N.lIIIIIIIIllII(Skills.getLevel((Skill)Skill.PRAYER), lIIlIllIll[3])) {
            bl = lIIlIllIll[2];

            }
        } else {
            bl = lIIlIllIll[1];
        }
        return bl;
    }

    private static boolean lIIIIIIIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIIIIIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIIIIIIlII(int n2) {
        return n2 != 0;
    }

    static {
        N.lIIIIIIIIIIll();
        N.llllllllIlll();
        iJ = new WorldPoint(lIIlIllIll[77], lIIlIllIll[78], lIIlIllIll[1]);
        iK = new WorldPoint(lIIlIllIll[79], lIIlIllIll[80], lIIlIllIll[1]);
        iL = new WorldPoint(lIIlIllIll[81], lIIlIllIll[82], lIIlIllIll[1]);
        iM = new WorldPoint(lIIlIllIll[83], lIIlIllIll[44], lIIlIllIll[1]);
        iN = new WorldPoint(lIIlIllIll[1], lIIlIllIll[1], lIIlIllIll[1]);
        iO = new WorldPoint(lIIlIllIll[1], lIIlIllIll[1], lIIlIllIll[1]);
        iP = new WorldPoint(lIIlIllIll[84], lIIlIllIll[85], lIIlIllIll[1]);
        bv = new ArrayList<d>();
    }

    public static void cB() {
        block44: {
            TileItem var3;
            block45: {
                if (N.lIIIIIIIIIlII(bt ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[1]];
                    b.a(bv);
                    if (N.lIIIIIIIIIlIl(bv.size(), lIIlIllIll[2])) {
                        System.out.println(lIIlIllIlI[lIIlIllIll[2]]);
                        bt = lIIlIllIll[1];
                    }
                }
                if (!N.lIIIIIIIIIllI(bt ? 1 : 0) || !N.lIIIIIIIIIlIl(Skills.getLevel((Skill)Skill.PRAYER), lIIlIllIll[3])) break block44;
                if (N.lIIIIIIIIIllI(N.ab() ? 1 : 0) && N.lIIIIIIIIIlIl(Game.getWildyLevel(), lIIlIllIll[2])) {
                    var3 = BankLocation.getNearest();
                    if (N.lIIIIIIIIIlll(var3) && N.lIIIIIIIIIllI(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[4]];
                        a.a((BankLocation)var3);
                    }
                    if (N.lIIIIIIIIIlll(var3) && N.lIIIIIIIIIlII(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[5]];
                        if (N.lIIIIIIIIIllI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIllIll[6]);

                        }
                        if (N.lIIIIIIIIIlII(Bank.isOpen() ? 1 : 0)) {
                            if (N.lIIIIIIIIlIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIlIllIll[7]);

                            }
                            if (N.lIIIIIIIIlIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIlIllIll[4]);

                            }
                            int[] nArray = new int[lIIlIllIll[5]];
                            nArray[N.lIIlIllIll[1]] = lIIlIllIll[8];
                            nArray[N.lIIlIllIll[2]] = lIIlIllIll[0];
                            nArray[N.lIIlIllIll[4]] = lIIlIllIll[9];
                            if (N.lIIIIIIIIIllI(e.b(nArray) ? 1 : 0)) {
                                N.af();
                                System.out.println(lIIlIllIlI[lIIlIllIll[7]]);
                                bt = lIIlIllIll[2];
                                return;
                            }
                            int[] nArray2 = new int[lIIlIllIll[5]];
                            nArray2[N.lIIlIllIll[1]] = lIIlIllIll[8];
                            nArray2[N.lIIlIllIll[2]] = lIIlIllIll[0];
                            nArray2[N.lIIlIllIll[4]] = lIIlIllIll[9];
                            if (N.lIIIIIIIIIlII(e.b(nArray2) ? 1 : 0)) {
                                if (N.lIIIIIIIIIllI(Equipment.contains((int[])f.ba) ? 1 : 0)) {
                                    a.b(f.ba, lIIlIllIll[2]);
                                }
                                a.b(f.aV, lIIlIllIll[2]);
                                a.a(lIIlIllIll[10], lIIlIllIll[11]);
                                a.b(lIIlIllIll[0], lIIlIllIll[12]);
                            }
                        }
                    }
                }
                if (N.lIIIIIIIIIlII(N.ab() ? 1 : 0)) {
                    if (N.lIIIIIIIIIlII(Inventory.contains((int[])f.aV) ? 1 : 0) && N.lIIIIIIIIIlIl(Movement.getRunEnergy(), lIIlIllIll[13])) {
                        Inventory.getFirst((int[])f.aV).interact(lIIlIllIlI[lIIlIllIll[14]]);
                        Time.sleepTicks((int)lIIlIllIll[2]);

                    }
                    if (N.lIIIIIIIIIllI(Movement.isRunEnabled() ? 1 : 0) && N.lIIIIIIIIlIIl(Movement.getRunEnergy(), lIIlIllIll[15])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)lIIlIllIll[14]);

                    }
                    if (N.lIIIIIIIIIlIl(Game.getWildyLevel(), lIIlIllIll[2])) {
                        AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[16]];
                        if (N.lIIIIIIIIIlII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (N.lIIIIIIIIIllI(Dialog.isOpen() ? 1 : 0) && N.lIIIIIIIIIlII(Inventory.contains((int[])f.ba) ? 1 : 0) && N.lIIIIIIIIlIlI(Players.getLocal().getAnimation(), lIIlIllIll[17])) {
                            Inventory.getFirst((int[])f.ba).interact(lIIlIllIlI[lIIlIllIll[18]]);
                            Time.sleepTicks((int)lIIlIllIll[4]);

                        }
                        String[] stringArray = new String[lIIlIllIll[4]];
                        stringArray[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[19]];
                        stringArray[N.lIIlIllIll[2]] = lIIlIllIlI[lIIlIllIll[20]];
                        g.a(stringArray);
                    }
                    if (N.lIIIIIIIIlIII(Game.getWildyLevel())) {
                        TileObject var4;
                        int[] nArray = new int[lIIlIllIll[2]];
                        nArray[N.lIIlIllIll[1]] = lIIlIllIll[0];
                        if (N.lIIIIIIIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (N.lIIIIIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(iL), lIIlIllIll[21])) {
                                AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[22]];
                                TileItem tileItem = new WorldPoint[lIIlIllIll[21]];
                                tileItem[N.lIIlIllIll[1]] = new WorldPoint(lIIlIllIll[23], lIIlIllIll[24], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[2]] = new WorldPoint(lIIlIllIll[25], lIIlIllIll[26], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[4]] = new WorldPoint(lIIlIllIll[27], lIIlIllIll[28], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[5]] = new WorldPoint(lIIlIllIll[29], lIIlIllIll[30], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[7]] = new WorldPoint(lIIlIllIll[31], lIIlIllIll[32], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[14]] = new WorldPoint(lIIlIllIll[33], lIIlIllIll[34], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[16]] = new WorldPoint(lIIlIllIll[35], lIIlIllIll[36], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[18]] = new WorldPoint(lIIlIllIll[37], lIIlIllIll[38], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[19]] = new WorldPoint(lIIlIllIll[39], lIIlIllIll[38], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[20]] = new WorldPoint(lIIlIllIll[40], lIIlIllIll[38], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[22]] = new WorldPoint(lIIlIllIll[41], lIIlIllIll[38], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[42]] = new WorldPoint(lIIlIllIll[43], lIIlIllIll[44], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[45]] = new WorldPoint(lIIlIllIll[46], lIIlIllIll[44], lIIlIllIll[1]);
                                var3 = tileItem;
                                Walker.walkAlong(Arrays.asList(var3), new HashMap());

                                Time.sleepTicks((int)lIIlIllIll[2]);

                            }
                            if (N.lIIIIIIIIlIll(Players.getLocal().getWorldLocation().distanceTo(iL), lIIlIllIll[21])) {
                                AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[42]];
                                String[] stringArray = new String[lIIlIllIll[2]];
                                stringArray[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[45]];
                                var3 = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[lIIlIllIll[2]];
                                stringArray2[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[21]];
                                var4 = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[lIIlIllIll[2]];
                                stringArray3[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[47]];
                                if (N.lIIIIIIIIIlII(var4.hasAction(stringArray3) ? 1 : 0)) {
                                    var4.interact(lIIlIllIlI[lIIlIllIll[48]]);
                                }
                                if (N.lIIIIIIIIIlll(var3)) {
                                    String[] stringArray4 = new String[lIIlIllIll[2]];
                                    stringArray4[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[49]];
                                    if (N.lIIIIIIIIIllI(var4.hasAction(stringArray4) ? 1 : 0)) {
                                        int var5 = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[lIIlIllIll[2]];
                                        nArray3[N.lIIlIllIll[1]] = lIIlIllIll[0];
                                        String[] stringArray5 = new String[lIIlIllIll[2]];
                                        stringArray5[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[50]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)lIIlIllIll[2]);

                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[lIIlIllIll[2]];
                        nArray4[N.lIIlIllIll[1]] = lIIlIllIll[0];
                        if (N.lIIIIIIIIIllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIlIllIll[2]];
                            nArray5[N.lIIlIllIll[1]] = lIIlIllIll[51];
                            if (N.lIIIIIIIIIlII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (N.lIIIIIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(iL), lIIlIllIll[21])) {
                                    AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[52]];
                                    WorldPoint[] worldPointArray = new WorldPoint[lIIlIllIll[21]];
                                    worldPointArray[N.lIIlIllIll[1]] = new WorldPoint(lIIlIllIll[23], lIIlIllIll[24], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[2]] = new WorldPoint(lIIlIllIll[25], lIIlIllIll[26], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[4]] = new WorldPoint(lIIlIllIll[27], lIIlIllIll[28], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[5]] = new WorldPoint(lIIlIllIll[29], lIIlIllIll[30], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[7]] = new WorldPoint(lIIlIllIll[31], lIIlIllIll[32], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[14]] = new WorldPoint(lIIlIllIll[33], lIIlIllIll[34], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[16]] = new WorldPoint(lIIlIllIll[35], lIIlIllIll[36], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[18]] = new WorldPoint(lIIlIllIll[37], lIIlIllIll[38], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[19]] = new WorldPoint(lIIlIllIll[39], lIIlIllIll[38], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[20]] = new WorldPoint(lIIlIllIll[40], lIIlIllIll[38], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[22]] = new WorldPoint(lIIlIllIll[41], lIIlIllIll[38], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[42]] = new WorldPoint(lIIlIllIll[43], lIIlIllIll[44], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[45]] = new WorldPoint(lIIlIllIll[46], lIIlIllIll[44], lIIlIllIll[1]);
                                    var3 = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(var3), new HashMap());

                                    Time.sleepTicks((int)lIIlIllIll[2]);

                                }
                                if (N.lIIIIIIIIlIll(Players.getLocal().getWorldLocation().distanceTo(iL), lIIlIllIll[21])) {
                                    AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[53]];
                                    if (!N.lIIIIIIIIIllI(Dialog.canLevelUpContinue() ? 1 : 0) || N.lIIIIIIIIIlII(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[lIIlIllIll[2]];
                                    stringArray[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[15]];
                                    var3 = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIIlIllIll[2]];
                                    stringArray6[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[54]];
                                    var4 = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[lIIlIllIll[2]];
                                    stringArray7[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[55]];
                                    if (N.lIIIIIIIIIlII(var4.hasAction(stringArray7) ? 1 : 0)) {
                                        var4.interact(lIIlIllIlI[lIIlIllIll[56]]);
                                    }
                                    if (N.lIIIIIIIIIlll(var3)) {
                                        String[] stringArray8 = new String[lIIlIllIll[2]];
                                        stringArray8[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[57]];
                                        if (N.lIIIIIIIIIllI(var4.hasAction(stringArray8) ? 1 : 0)) {
                                            List var5;
                                            if (N.lIIIIIIIIIllI(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[lIIlIllIll[2]];
                                                nArray6[N.lIIlIllIll[1]] = lIIlIllIll[51];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)var3);
                                                Time.sleepTicks((int)lIIlIllIll[4]);

                                            }
                                            if (N.lIIIIIIIIIlII(Dialog.isOpen() ? 1 : 0) && N.lIIIIIIIIIllI((var5 = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int var6 = lIIlIllIll[1];
                                                while (N.lIIIIIIIIIlIl(var6, var5.size())) {
                                                    int[] nArray7 = new int[lIIlIllIll[2]];
                                                    nArray7[N.lIIlIllIll[1]] = lIIlIllIll[51];
                                                    if (N.lIIIIIIIIlIlI(((Item)Inventory.getAll((int[])nArray7).get(lIIlIllIll[1])).getQuantity(), lIIlIllIll[2]) && N.lIIIIIIIIIlII(((Widget)var5.get(var6)).getText().contains(lIIlIllIlI[lIIlIllIll[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var5.get(var6)).getClickPoint().getX(), (int)((Widget)var5.get(var6)).getClickPoint().getY(), (boolean)lIIlIllIll[2]);
                                                        Time.sleepTicks((int)lIIlIllIll[4]);

                                                    }
                                                    int[] nArray8 = new int[lIIlIllIll[2]];
                                                    nArray8[N.lIIlIllIll[1]] = lIIlIllIll[51];
                                                    if (N.lIIIIIIIIlIlI(((Item)Inventory.getAll((int[])nArray8).get(lIIlIllIll[1])).getQuantity(), lIIlIllIll[14]) && N.lIIIIIIIIIlII(((Widget)var5.get(var6)).getText().contains(lIIlIllIlI[lIIlIllIll[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var5.get(var6)).getClickPoint().getX(), (int)((Widget)var5.get(var6)).getClickPoint().getY(), (boolean)lIIlIllIll[2]);
                                                        Time.sleepTicks((int)lIIlIllIll[4]);

                                                    }
                                                    if (N.lIIIIIIIIIlII(((Widget)var5.get(var6)).getText().contains(lIIlIllIlI[lIIlIllIll[60]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var5.get(var6)).getClickPoint().getX(), (int)((Widget)var5.get(var6)).getClickPoint().getY(), (boolean)lIIlIllIll[2]);
                                                        Time.sleepTicks((int)lIIlIllIll[4]);

                                                    }
                                                    ++var6;

                                                    if (-1 < 0) continue;
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
                int[] nArray = new int[lIIlIllIll[2]];
                nArray[N.lIIlIllIll[1]] = lIIlIllIll[10];
                if (!N.lIIIIIIIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[lIIlIllIll[2]];
                nArray9[N.lIIlIllIll[1]] = lIIlIllIll[0];
                if (!N.lIIIIIIIIIllI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[lIIlIllIll[2]];
                nArray10[N.lIIlIllIll[1]] = lIIlIllIll[51];
                if (!N.lIIIIIIIIIllI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (N.lIIIIIIIIlIll(Players.getLocal().getWorldLocation().distanceTo(iL), lIIlIllIll[21])) {
                AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[61]];
                String[] stringArray = new String[lIIlIllIll[2]];
                stringArray[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[62]];
                var3 = TileItems.getNearest((String[])stringArray);
                if (N.lIIIIIIIIIlll(var3)) {
                    var3.interact(lIIlIllIlI[lIIlIllIll[63]]);
                }
            }
        }
    }

    @Override
    public int T() {
        try {
            N.cB();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 < 1) {
            return (0x45 ^ 0x73 ^ (0x6D ^ 0x62)) & (0x22 ^ 1 ^ (0x3A ^ 0x20) ^ -1);
        }
        return lIIlIllIll[74];
    }

        return String.valueOf(var7);
    }

    private static boolean lIIIIIIIIlIlI(int n2, int n3) {
        return n2 == n3;
    }
}

