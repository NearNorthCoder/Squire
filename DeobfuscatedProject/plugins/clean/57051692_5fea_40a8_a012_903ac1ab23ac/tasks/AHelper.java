/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.EHelper;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.UHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.ZHelper;
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
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class AHelper
implements K {

    static  int dc;
    public static final  WorldPoint dY;
    public static  boolean bn;
    
    public static  List<d> bp;
    public static final  WorldPoint dX;
    static  boolean dd;

    private static boolean lIIlIllIlllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlllIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIlllIIIIl(Object object) {
        return object != null;
    }

    private static boolean lIIlIllIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    public static void bG() {
        String[] stringArray = new String[lIllIIIlll[3]];
        stringArray[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[46]];
        if (A.lIIlIlllIIlIl(NPCs.getNearest((String[])stringArray))) {
            if (A.lIIlIlllIIIll(Players.getLocal().getWorldLocation().distanceTo(dX), lIllIIIlll[12])) {
                if (A.lIIlIllIlllll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                Movement.walkTo((WorldPoint)dX);

                Time.sleepTicks((int)lIllIIIlll[3]);

            }
            if (A.lIIlIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(dX), lIllIIIlll[12])) {
                AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[47]];
                String[] stringArray2 = new String[lIllIIIlll[3]];
                stringArray2[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[48]];
                TileObjects.getNearest((String[])stringArray2).interact(lIllIIIlIl[lIllIIIlll[0]]);
                Time.sleepTicks((int)lIllIIIlll[1]);

            }
        }
    }

    @Override
    public boolean af() {
        boolean bl;
        if (A.lIIlIlllIIllI(Quests.getState((Quest)Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST), QuestState.FINISHED)) {
            bl = lIllIIIlll[3];

        } else {
            bl = lIllIIIlll[4];
        }
        return bl;
    }

    private static boolean lIIlIlllIIIlI(int n2) {
        return n2 > 0;
    }

    @Override
    public int ad() {
        try {
            System.out.println("678: " + e.j(lIllIIIlll[5]));
            A.bF();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x34 ^ 0x1F) & ~(0xEF ^ 0xC4)) < 0) {
            return (0x70 ^ 0x53) & ~(3 ^ 0x20);
        }
        return lIllIIIlll[57];
    }

    @Override
    public boolean ac() {
        return lIllIIIlll[4];
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIlllIIllI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        String[] stringArray = new String[lIllIIIlll[3]];
        stringArray[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[49]];
        if (A.lIIlIlllIIIlI(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIllIIIlll[3]];
            nArray[A.lIllIIIlll[4]] = lIllIIIlll[14];
            if (A.lIIlIlllIIIlI(Inventory.getCount((int[])nArray))) {
                String[] stringArray2 = new String[lIllIIIlll[3]];
                stringArray2[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[50]];
                if (A.lIIlIllIlllll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    int[] nArray2 = new int[lIllIIIlll[3]];
                    nArray2[A.lIllIIIlll[4]] = lIllIIIlll[18];
                    if (A.lIIlIllIlllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[lIllIIIlll[3]];
                        nArray3[A.lIllIIIlll[4]] = lIllIIIlll[11];
                        if (A.lIIlIllIlllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            n2 = lIllIIIlll[3];

                            if (null == null) return n2 != 0;
                            return ((0xF ^ 0x58 ^ 2) & (0xFB ^ 0x8B ^ (0x99 ^ 0xBC) ^ -1)) != 0;
                        }
                    }
                }
            }
        }
        n2 = lIllIIIlll[4];
        return n2 != 0;
    }

    private static boolean lIIlIllIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIlllIIIII(int n2) {
        return n2 == 0;
    }

    @Override
    public String ae() {
        return lIllIIIlIl[lIllIIIlll[58]];
    }

    static {
        A.lIIlIllIllIll();
        A.lIIlIllIllIlI();
        dX = new WorldPoint(lIllIIIlll[67], lIllIIIlll[68], lIllIIIlll[4]);
        dY = new WorldPoint(lIllIIIlll[69], lIllIIIlll[70], lIllIIIlll[4]);
        bp = new ArrayList<d>();
        String[] stringArray = new String[lIllIIIlll[23]];
        stringArray[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[71]];
        stringArray[A.lIllIIIlll[3]] = lIllIIIlIl[lIllIIIlll[72]];
        stringArray[A.lIllIIIlll[1]] = lIllIIIlIl[lIllIIIlll[73]];
        stringArray[A.lIllIIIlll[12]] = lIllIIIlIl[lIllIIIlll[74]];
        stringArray[A.lIllIIIlll[7]] = lIllIIIlIl[lIllIIIlll[75]];
        stringArray[A.lIllIIIlll[15]] = lIllIIIlIl[lIllIIIlll[76]];
        stringArray[A.lIllIIIlll[17]] = lIllIIIlIl[lIllIIIlll[77]];
        stringArray[A.lIllIIIlll[8]] = lIllIIIlIl[lIllIIIlll[78]];
        cy = stringArray;
    }

    private static boolean lIIlIlllIIlIl(Object object) {
        return object == null;
    }

    private static void O() {
        block16: {
            d var2;
            block15: {
                Object var3;
                block14: {
                    block13: {
                        int[] nArray = new int[lIllIIIlll[3]];
                        nArray[A.lIllIIIlll[4]] = lIllIIIlll[19];
                        if (A.lIIlIlllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(lIllIIIlll[19], lIllIIIlll[2], j.bZ);
                            bp.add(d2);

                        }
                        int[] nArray2 = new int[lIllIIIlll[3]];
                        nArray2[A.lIllIIIlll[4]] = lIllIIIlll[11];
                        if (A.lIIlIlllIIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var3 = new DHelper(lIllIIIlll[11], lIllIIIlll[3], lIllIIIlll[51]);
                            bp.add((DHelper) ar3);

                        }
                        int[] nArray3 = new int[lIllIIIlll[3]];
                        nArray3[A.lIllIIIlll[4]] = lIllIIIlll[14];
                        if (A.lIIlIlllIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var3 = new DHelper(lIllIIIlll[14], lIllIIIlll[3], lIllIIIlll[51]);
                            bp.add((DHelper) ar3);

                        }
                        int[] nArray4 = new int[lIllIIIlll[3]];
                        nArray4[A.lIllIIIlll[4]] = lIllIIIlll[18];
                        if (A.lIIlIlllIIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var3 = new DHelper(lIllIIIlll[18], lIllIIIlll[3], lIllIIIlll[51]);
                            bp.add((DHelper) ar3);

                        }
                        int[] nArray5 = new int[lIllIIIlll[3]];
                        nArray5[A.lIllIIIlll[4]] = lIllIIIlll[16];
                        if (A.lIIlIlllIIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            var3 = new DHelper(lIllIIIlll[16], lIllIIIlll[3], lIllIIIlll[51]);
                            bp.add((DHelper) ar3);

                        }
                        int[] nArray6 = new int[lIllIIIlll[3]];
                        nArray6[A.lIllIIIlll[4]] = lIllIIIlll[13];
                        if (A.lIIlIlllIIIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            var3 = new DHelper(lIllIIIlll[13], lIllIIIlll[3], lIllIIIlll[52]);
                            bp.add((DHelper) ar3);

                        }
                        int[] nArray7 = new int[lIllIIIlll[3]];
                        nArray7[A.lIllIIIlll[4]] = lIllIIIlll[10];
                        if (!A.lIIlIllIlllll(Bank.contains((int[])nArray7) ? 1 : 0)) break block13;
                        int[] nArray8 = new int[lIllIIIlll[3]];
                        nArray8[A.lIllIIIlll[4]] = lIllIIIlll[10];
                        if (!A.lIIlIllIlllll(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                        int[] nArray9 = new int[lIllIIIlll[3]];
                        nArray9[A.lIllIIIlll[4]] = lIllIIIlll[10];
                        if (!A.lIIlIllIlllII(Bank.getFirst((int[])nArray9).getQuantity(), lIllIIIlll[2])) break block14;
                    }
                    var3 = new DHelper(lIllIIIlll[10], lIllIIIlll[2], lIllIIIlll[53]);
                    bp.add((DHelper) ar3);

                }
                if (A.lIIlIlllIIIII(Bank.contains((Predicate)(var3 = item -> item.getName().toLowerCase().contains(lIllIIIlIl[lIllIIIlll[59]]))) ? 1 : 0)) {
                    var2 = new DHelper(lIllIIIlll[54], lIllIIIlll[15], lIllIIIlll[55]);
                    bp.add(var2);

                }
                int[] nArray = new int[lIllIIIlll[3]];
                nArray[A.lIllIIIlll[4]] = lIllIIIlll[9];
                if (!A.lIIlIllIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block15;
                int[] nArray10 = new int[lIllIIIlll[3]];
                nArray10[A.lIllIIIlll[4]] = lIllIIIlll[9];
                if (!A.lIIlIllIlllll(Bank.contains((int[])nArray10) ? 1 : 0)) break block16;
                int[] nArray11 = new int[lIllIIIlll[3]];
                nArray11[A.lIllIIIlll[4]] = lIllIIIlll[9];
                if (!A.lIIlIllIlllII(Bank.getFirst((int[])nArray11).getQuantity(), lIllIIIlll[2])) break block16;
            }
            var2 = new DHelper(lIllIIIlll[9], lIllIIIlll[56], lIllIIIlll[52]);
            bp.add(var2);

        }
    }

    private static boolean lIIlIlllIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIlIllIllIlI() {
        lIllIIIlIl = new String[lIllIIIlll[21]];
        A.lIllIIIlIl[A.lIllIIIlll[4]] = "Finished buying items, switching back to quest";
        A.lIllIIIlIl[A.lIllIIIlll[3]] = "Nav to bank";
        A.lIllIIIlIl[A.lIllIIIlll[1]] = "Handling banking";
        A.lIllIIIlIl[A.lIllIIIlll[12]] = "We are missing quest supplies, switching to BUYING";
        A.lIllIIIlIl[A.lIllIIIlll[7]] = "Drink";
        A.lIllIIIlIl[A.lIllIIIlll[15]] = "Nav to start";
        A.lIllIIIlIl[A.lIllIIIlll[17]] = "Handling dialog";
        A.lIllIIIlIl[A.lIllIIIlll[8]] = "Cook";
        A.lIllIIIlIl[A.lIllIIIlll[23]] = "Dirty blast";
        A.lIllIIIlIl[A.lIllIIIlll[24]] = "Nav to rotten tomato";
        A.lIllIIIlIl[A.lIllIIIlll[2]] = "Wear";
        A.lIllIIIlIl[A.lIllIIIlll[30]] = "PvP Arena";
        A.lIllIIIlIl[A.lIllIIIlll[31]] = "Getting tomato";
        A.lIllIIIlIl[A.lIllIIIlll[33]] = "Fadli";
        A.lIllIIIlIl[A.lIllIIIlll[34]] = "Buy";
        A.lIllIIIlIl[A.lIllIIIlll[36]] = "Buy 1";
        A.lIllIIIlIl[A.lIllIIIlll[35]] = "Close";
        A.lIllIIIlIl[A.lIllIIIlll[37]] = "Dirty blast";
        A.lIllIIIlIl[A.lIllIIIlll[38]] = "Close";
        A.lIllIIIlIl[A.lIllIIIlll[39]] = "Fruit blast";
        A.lIllIIIlIl[A.lIllIIIlll[40]] = "Dirty blast";
        A.lIllIIIlIl[A.lIllIIIlll[41]] = "Wear";
        A.lIllIIIlIl[A.lIllIIIlll[42]] = "Handling dialog";
        A.lIllIIIlIl[A.lIllIIIlll[43]] = "Cook";
        A.lIllIIIlIl[A.lIllIIIlll[44]] = "Door";
        A.lIllIIIlIl[A.lIllIIIlll[45]] = "Open";
        A.lIllIIIlIl[A.lIllIIIlll[46]] = "Aris";
        A.lIllIIIlIl[A.lIllIIIlll[47]] = "Entering room";
        A.lIllIIIlIl[A.lIllIIIlll[48]] = "Door";
        A.lIllIIIlIl[A.lIllIIIlll[0]] = "Open";
        A.lIllIIIlIl[A.lIllIIIlll[49]] = "Eye of newt";
        A.lIllIIIlIl[A.lIllIIIlll[50]] = "Fruit blast";
        A.lIllIIIlIl[A.lIllIIIlll[58]] = "RFD start quest";
        A.lIllIIIlIl[A.lIllIIIlll[59]] = "ring of wealth (";
        A.lIllIIIlIl[A.lIllIIIlll[60]] = "dueling";
        A.lIllIIIlIl[A.lIllIIIlll[61]] = "dueling";
        A.lIllIIIlIl[A.lIllIIIlll[62]] = "dueling";
        A.lIllIIIlIl[A.lIllIIIlll[63]] = "dueling";
        A.lIllIIIlIl[A.lIllIIIlll[64]] = "dueling";
        A.lIllIIIlIl[A.lIllIIIlll[65]] = "dueling";
        A.lIllIIIlIl[A.lIllIIIlll[56]] = "dueling";
        A.lIllIIIlIl[A.lIllIIIlll[66]] = "dueling";
        A.lIllIIIlIl[A.lIllIIIlll[71]] = "Can you make me a cake?";
        A.lIllIIIlIl[A.lIllIIIlll[72]] = "I'm always happy to help a cook in distress.";
        A.lIllIIIlIl[A.lIllIIIlll[73]] = "Actually, I know where to find this stuff.";
        A.lIllIIIlIl[A.lIllIIIlll[74]] = "Yes.";
        A.lIllIIIlIl[A.lIllIIIlll[75]] = "What's wrong?";
        A.lIllIIIlIl[A.lIllIIIlll[76]] = "Do you have any other quests for me?";
        A.lIllIIIlIl[A.lIllIIIlll[77]] = "Angry! It makes me angry!";
        A.lIllIIIlIl[A.lIllIIIlll[78]] = "What seems to be the problem?";
    }

    public static void bF() {
        if (A.lIIlIllIlllII(e.j(lIllIIIlll[0]), lIllIIIlll[1])) {
            E.cc();
        }
        if (A.lIIlIllIlllII(Skills.getLevel((Skill)Skill.COOKING), lIllIIIlll[2]) && A.lIIlIllIlllIl(e.j(lIllIIIlll[0]), lIllIIIlll[1])) {
            U.dj();
        }
        if (A.lIIlIllIllllI(Skills.getLevel((Skill)Skill.COOKING), lIllIIIlll[2]) && A.lIIlIllIlllIl(e.j(lIllIIIlll[0]), lIllIIIlll[1])) {
            if (A.lIIlIllIlllll(bn ? 1 : 0)) {
                b.a(bp);
                if (A.lIIlIllIlllII(bp.size(), lIllIIIlll[3])) {
                    System.out.println(lIllIIIlIl[lIllIIIlll[4]]);
                    bn = lIllIIIlll[4];
                }
            }
            if (A.lIIlIlllIIIII(bn ? 1 : 0)) {
                BankLocation var4;
                if (A.lIIlIlllIIIII(A.al() ? 1 : 0) && A.lIIlIlllIIIII(e.j(lIllIIIlll[5]))) {
                    var4 = BankLocation.getNearest();
                    if (A.lIIlIlllIIIIl(var4) && A.lIIlIlllIIIII(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[3]];
                        a.a(var4);
                    }
                    if (A.lIIlIlllIIIIl(var4) && A.lIIlIllIlllll(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (A.lIIlIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIIlll[6]);

                        }
                        if (A.lIIlIllIlllll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[1]];
                            if (A.lIIlIlllIIIlI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIllIIIlll[7]);

                            }
                            if (A.lIIlIlllIIIlI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIllIIIlll[1]);

                            }
                            int[] nArray = new int[lIllIIIlll[8]];
                            nArray[A.lIllIIIlll[4]] = lIllIIIlll[9];
                            nArray[A.lIllIIIlll[3]] = lIllIIIlll[10];
                            nArray[A.lIllIIIlll[1]] = lIllIIIlll[11];
                            nArray[A.lIllIIIlll[12]] = lIllIIIlll[13];
                            nArray[A.lIllIIIlll[7]] = lIllIIIlll[14];
                            nArray[A.lIllIIIlll[15]] = lIllIIIlll[16];
                            nArray[A.lIllIIIlll[17]] = lIllIIIlll[18];
                            if (A.lIIlIlllIIIII(e.b(nArray) ? 1 : 0)) {
                                A.O();
                                System.out.println(lIllIIIlIl[lIllIIIlll[12]]);
                                bn = lIllIIIlll[3];
                                return;
                            }
                            int[] nArray2 = new int[lIllIIIlll[8]];
                            nArray2[A.lIllIIIlll[4]] = lIllIIIlll[9];
                            nArray2[A.lIllIIIlll[3]] = lIllIIIlll[10];
                            nArray2[A.lIllIIIlll[1]] = lIllIIIlll[11];
                            nArray2[A.lIllIIIlll[12]] = lIllIIIlll[13];
                            nArray2[A.lIllIIIlll[7]] = lIllIIIlll[14];
                            nArray2[A.lIllIIIlll[15]] = lIllIIIlll[16];
                            nArray2[A.lIllIIIlll[17]] = lIllIIIlll[18];
                            if (A.lIIlIllIlllll(e.b(nArray2) ? 1 : 0)) {
                                a.a(lIllIIIlll[9], lIllIIIlll[2]);
                                a.a(lIllIIIlll[10], lIllIIIlll[2]);
                                a.a(lIllIIIlll[11], lIllIIIlll[3]);
                                a.a(lIllIIIlll[13], lIllIIIlll[3]);
                                a.a(lIllIIIlll[14], lIllIIIlll[3]);
                                a.a(lIllIIIlll[16], lIllIIIlll[3]);
                                a.a(lIllIIIlll[18], lIllIIIlll[3]);
                                a.a(lIllIIIlll[19], lIllIIIlll[1]);
                                a.a(lIllIIIlll[20], lIllIIIlll[6]);
                            }
                        }
                    }
                }
                if (A.lIIlIllIlllll(Inventory.contains((int[])f.aU) ? 1 : 0) && A.lIIlIllIlllII(Movement.getRunEnergy(), lIllIIIlll[21])) {
                    Inventory.getFirst((int[])f.aU).interact(lIllIIIlIl[lIllIIIlll[7]]);
                    Time.sleepTicks((int)lIllIIIlll[3]);

                }
                if (A.lIIlIlllIIIII(e.j(lIllIIIlll[5])) && A.lIIlIllIlllll(A.al() ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[15]];
                    if (A.lIIlIlllIIIll(Players.getLocal().getWorldLocation().distanceTo(dX), lIllIIIlll[12])) {
                        if (A.lIIlIllIlllll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)dX);

                        Time.sleepTicks((int)lIllIIIlll[3]);

                    }
                    if (A.lIIlIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(dX), lIllIIIlll[12])) {
                        AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[17]];
                        g.a(lIllIIIlIl[lIllIIIlll[8]], cy);
                    }
                }
                if (A.lIIlIllIlllIl(e.j(lIllIIIlll[5]), lIllIIIlll[3])) {
                    int[] nArray = new int[lIllIIIlll[3]];
                    nArray[A.lIllIIIlll[4]] = lIllIIIlll[22];
                    if (A.lIIlIlllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[lIllIIIlll[3]];
                        stringArray[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[23]];
                        if (A.lIIlIlllIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            dc = lIllIIIlll[4];
                            if (A.lIIlIlllIIIll(Players.getLocal().getWorldLocation().distanceTo(dY), lIllIIIlll[7])) {
                                AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[24]];
                                var4 = new WorldArea(lIllIIIlll[25], lIllIIIlll[26], lIllIIIlll[27], lIllIIIlll[28], lIllIIIlll[4]);
                                if (A.lIIlIlllIIIII(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (A.lIIlIllIlllll(Inventory.contains(item -> item.getName().contains(lIllIIIlIl[lIllIIIlll[66]])) ? 1 : 0) && A.lIIlIlllIIIII(Equipment.contains(item -> item.getName().contains(lIllIIIlIl[lIllIIIlll[56]])) ? 1 : 0)) {
                                        Inventory.getFirst(item -> item.getName().contains(lIllIIIlIl[lIllIIIlll[65]])).interact(lIllIIIlIl[lIllIIIlll[2]]);
                                    }
                                    if (A.lIIlIllIlllll(Equipment.contains(item -> item.getName().contains(lIllIIIlIl[lIllIIIlll[64]])) ? 1 : 0) && A.lIIlIllIlllIl(Players.getLocal().getAnimation(), lIllIIIlll[29])) {
                                        Equipment.getFirst(item -> item.getName().contains(lIllIIIlIl[lIllIIIlll[63]])).interact(lIllIIIlIl[lIllIIIlll[30]]);
                                        Time.sleepTicks((int)lIllIIIlll[7]);

                                    }
                                }
                                if (A.lIIlIllIlllll(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)dY);

                                    Time.sleepTicks((int)lIllIIIlll[3]);

                                }
                            }
                            if (A.lIIlIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(dY), lIllIIIlll[7])) {
                                AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[31]];
                                if (A.lIIlIllIlllll(Widgets.get((int)lIllIIIlll[32]).isEmpty() ? 1 : 0)) {
                                    String[] stringArray2 = new String[lIllIIIlll[3]];
                                    stringArray2[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[33]];
                                    NPCs.getNearest((String[])stringArray2).interact(lIllIIIlIl[lIllIIIlll[34]]);
                                    Time.sleepTicks((int)lIllIIIlll[12]);

                                }
                                if (A.lIIlIlllIIIII(Widgets.get((int)lIllIIIlll[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)lIllIIIlll[32], (int)lIllIIIlll[35], (int)lIllIIIlll[3]).interact(lIllIIIlIl[lIllIIIlll[36]]);
                                    Time.sleepTicks((int)lIllIIIlll[1]);

                                }
                                int[] nArray3 = new int[lIllIIIlll[3]];
                                nArray3[A.lIllIIIlll[4]] = lIllIIIlll[22];
                                if (A.lIIlIllIlllll(Inventory.contains((int[])nArray3) ? 1 : 0) && A.lIIlIlllIIIII(Widgets.get((int)lIllIIIlll[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)lIllIIIlll[32], (int)lIllIIIlll[3], (int)lIllIIIlll[30]).interact(lIllIIIlIl[lIllIIIlll[35]]);
                                    Time.sleepTicks((int)lIllIIIlll[3]);

                                }
                            }
                        }
                    }
                    int[] nArray4 = new int[lIllIIIlll[3]];
                    nArray4[A.lIllIIIlll[4]] = lIllIIIlll[22];
                    if (A.lIIlIllIlllll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        String[] stringArray = new String[lIllIIIlll[3]];
                        stringArray[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[37]];
                        if (A.lIIlIlllIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            int[] nArray5 = new int[lIllIIIlll[3]];
                            nArray5[A.lIllIIIlll[4]] = lIllIIIlll[22];
                            if (A.lIIlIllIlllll(Inventory.contains((int[])nArray5) ? 1 : 0) && A.lIIlIlllIIIII(Widgets.get((int)lIllIIIlll[32]).isEmpty() ? 1 : 0)) {
                                Widgets.get((int)lIllIIIlll[32], (int)lIllIIIlll[3], (int)lIllIIIlll[30]).interact(lIllIIIlIl[lIllIIIlll[38]]);
                                Time.sleepTicks((int)lIllIIIlll[3]);

                            }
                            int[] nArray6 = new int[lIllIIIlll[3]];
                            nArray6[A.lIllIIIlll[4]] = lIllIIIlll[18];
                            String[] stringArray3 = new String[lIllIIIlll[3]];
                            stringArray3[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[39]];
                            Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((String[])stringArray3));
                            Time.sleepTicks((int)lIllIIIlll[1]);

                        }
                    }
                    String[] stringArray = new String[lIllIIIlll[3]];
                    stringArray[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[40]];
                    if (A.lIIlIllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        if (A.lIIlIlllIIIll(Players.getLocal().getWorldLocation().distanceTo(dX), lIllIIIlll[12])) {
                            if (A.lIIlIllIlllll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            if (A.lIIlIllIlllll(Inventory.contains(item -> item.getName().contains(lIllIIIlIl[lIllIIIlll[62]])) ? 1 : 0) && A.lIIlIlllIIIII(Equipment.contains(item -> item.getName().contains(lIllIIIlIl[lIllIIIlll[61]])) ? 1 : 0)) {
                                Inventory.getFirst(item -> item.getName().contains(lIllIIIlIl[lIllIIIlll[60]])).interact(lIllIIIlIl[lIllIIIlll[41]]);
                                Time.sleepTicks((int)lIllIIIlll[1]);

                            }
                            Movement.walkTo((WorldPoint)dX);

                            Time.sleepTicks((int)lIllIIIlll[3]);

                        }
                        if (A.lIIlIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(dX), lIllIIIlll[12])) {
                            AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[42]];
                            if (A.lIIlIllIlllII(dc, lIllIIIlll[3])) {
                                Z.mI += lIllIIIlll[3];
                                Z.p(AccBuilderShamans.m);
                                dc += lIllIIIlll[3];
                                Z.mI = lIllIIIlll[4];
                                dd = lIllIIIlll[4];
                            }
                            g.a(lIllIIIlIl[lIllIIIlll[43]], cy);
                        }
                    }
                }
                if (A.lIIlIllIlllIl(e.j(lIllIIIlll[5]), lIllIIIlll[1])) {
                    String[] stringArray = new String[lIllIIIlll[3]];
                    stringArray[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[44]];
                    TileObjects.getNearest((String[])stringArray).interact(lIllIIIlIl[lIllIIIlll[45]]);
                    Time.sleepTicks((int)lIllIIIlll[1]);

                }
            }
        }
    }

    private static boolean lIIlIllIlllll(int n2) {
        return n2 != 0;
    }
}

