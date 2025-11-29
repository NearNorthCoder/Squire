/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.AHelper;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.ZHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.AHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.BHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.DHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.EHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.FHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.GHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.JHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.WHelper;
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
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;

public class ZHelper
implements K {
    static  WorldPoint cS;
    static  int dc;
    static  String[] cy;
    static  WorldPoint cU;
    public static  boolean bn;
    static  boolean dd;
    
    static  WorldPoint cR;
    static  WorldPoint cT;
    static  int dW;
    
    public static  List<d> bp;

    private static boolean lIIIlllIlIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIlllIlIIII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ac() {
        return lIlIIllllI[6];
    }

    private static boolean lIIIlllIlIlIl(Object object) {
        return object == null;
    }

    private static boolean lIIIlllIlIIll(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean af() {
        boolean bl;
        if (z.lIIIlllIllIII(Quests.getState((Quest)Quest.RECIPE_FOR_DISASTER__MOUNTAIN_DWARF), QuestState.FINISHED)) {
            bl = lIlIIllllI[5];

            if ((139 + 45 - 159 + 166 ^ 19 + 54 - -60 + 54) <= 3) {
                return ((121 + 63 - 59 + 66 ^ 81 + 17 - 65 + 102) & (0xE ^ 0x75 ^ (3 ^ 0x40) ^ -1)) != 0;
            }
        } else {
            bl = lIlIIllllI[6];
        }
        return bl;
    }

    static {
        z.lIIIlllIIllII();
        z.lIIIlllIIlIll();
        bp = new ArrayList<d>();
        cR = new WorldPoint(lIlIIllllI[68], lIlIIllllI[69], lIlIIllllI[6]);
        cS = new WorldPoint(lIlIIllllI[70], lIlIIllllI[71], lIlIIllllI[6]);
        cT = new WorldPoint(lIlIIllllI[72], lIlIIllllI[73], lIlIIllllI[6]);
        cU = new WorldPoint(lIlIIllllI[74], lIlIIllllI[75], lIlIIllllI[6]);
        String[] stringArray = new String[lIlIIllllI[1]];
        stringArray[z.lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[76]];
        stringArray[z.lIlIIllllI[5]] = lIlIIlllII[lIlIIllllI[42]];
        stringArray[z.lIlIIllllI[8]] = lIlIIlllII[lIlIIllllI[77]];
        cy = stringArray;
        dW = lIlIIllllI[78];
    }

    @Override
    public String ae() {
        return lIlIIlllII[lIlIIllllI[66]];
    }

    private static void lIIIlllIIlIll() {
        lIlIIlllII = new String[lIlIIllllI[79]];
        z.lIlIIlllII[z.lIlIIllllI[6]] = "Finished buying items, switching back to quest";
        z.lIlIIlllII[z.lIlIIllllI[5]] = "Nav to bank";
        z.lIlIIlllII[z.lIlIIllllI[8]] = "Handling banking";
        z.lIlIIlllII[z.lIlIIllllI[1]] = "We are missing quest supplies, switching to BUYING";
        z.lIlIIlllII[z.lIlIIllllI[9]] = "We are missing quest supplies, switching to BUYING";
        z.lIlIIlllII[z.lIlIIllllI[3]] = "Drink";
        z.lIlIIlllII[z.lIlIIllllI[18]] = "Aris";
        z.lIlIIlllII[z.lIlIIllllI[20]] = "Nav to rfd room";
        z.lIlIIlllII[z.lIlIIllllI[21]] = "Aris";
        z.lIlIIlllII[z.lIlIIllllI[23]] = "Dwarf";
        z.lIlIIlllII[z.lIlIIllllI[4]] = "Inspect";
        z.lIlIIlllII[z.lIlIIllllI[2]] = "Nav to fally pub";
        z.lIlIIlllII[z.lIlIIllllI[29]] = "Handle chat";
        z.lIlIIlllII[z.lIlIIllllI[30]] = "Kaylee";
        z.lIlIIlllII[z.lIlIIllllI[31]] = "Nav to rock cake guy";
        z.lIlIIlllII[z.lIlIIllllI[32]] = "Handle chat";
        z.lIlIIlllII[z.lIlIIllllI[33]] = "An old Dwarf";
        z.lIlIIlllII[z.lIlIIllllI[36]] = "Nav to rock cake guy";
        z.lIlIIlllII[z.lIlIIllllI[37]] = "Handle chat";
        z.lIlIIlllII[z.lIlIIllllI[38]] = "An old Dwarf";
        z.lIlIIlllII[z.lIlIIllllI[34]] = "Rohak";
        z.lIlIIlllII[z.lIlIIllllI[39]] = "Handle chat";
        z.lIlIIlllII[z.lIlIIllllI[40]] = "Rohak";
        z.lIlIIlllII[z.lIlIIllllI[43]] = "Handle chat";
        z.lIlIIlllII[z.lIlIIllllI[44]] = "Rohak";
        z.lIlIIlllII[z.lIlIIllllI[45]] = "Wear";
        z.lIlIIlllII[z.lIlIIllllI[47]] = "Take";
        z.lIlIIlllII[z.lIlIIllllI[48]] = "Wield";
        z.lIlIIlllII[z.lIlIIllllI[49]] = "Nav to icefiend";
        z.lIlIIlllII[z.lIlIIllllI[50]] = "Attack icefiend";
        z.lIlIIlllII[z.lIlIIllllI[41]] = "Icefiend";
        z.lIlIIlllII[z.lIlIIllllI[51]] = "Attack";
        z.lIlIIlllII[z.lIlIIllllI[55]] = "Aris";
        z.lIlIIlllII[z.lIlIIllllI[56]] = "Nav to rfd room";
        z.lIlIIlllII[z.lIlIIllllI[57]] = "Aris";
        z.lIlIIlllII[z.lIlIIllllI[58]] = "Finishing quest";
        z.lIlIIlllII[z.lIlIIllllI[59]] = "Dwarf";
        z.lIlIIlllII[z.lIlIIllllI[66]] = "RFD Dwarf quest";
        z.lIlIIlllII[z.lIlIIllllI[67]] = "ring of wealth (";
        z.lIlIIlllII[z.lIlIIllllI[76]] = "Yes.";
        z.lIlIIlllII[z.lIlIIllllI[42]] = "What can you tell me about dwarves and ale?";
        z.lIlIIlllII[z.lIlIIllllI[77]] = "I could offer you some in return, how about 200 gold?";
    }

        return String.valueOf(var1);
    }

    private static boolean lIIIlllIlIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIlllIllIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIlllIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlllIlIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIlllIlIIlI(Object object) {
        return object != null;
    }

    @Override
    public int ad() {
        try {
            z.bD();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        return lIlIIllllI[65];
    }

    private static boolean lIIIlllIIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static void O() {
        d var2;
        Object var3;
        block27: {
            block26: {
                block25: {
                    block24: {
                        block23: {
                            block22: {
                                block21: {
                                    block20: {
                                        int[] nArray = new int[lIlIIllllI[5]];
                                        nArray[z.lIlIIllllI[6]] = lIlIIllllI[11];
                                        if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                        int[] nArray2 = new int[lIlIIllllI[5]];
                                        nArray2[z.lIlIIllllI[6]] = lIlIIllllI[11];
                                        if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray2) ? 1 : 0)) break block21;
                                        int[] nArray3 = new int[lIlIIllllI[5]];
                                        nArray3[z.lIlIIllllI[6]] = lIlIIllllI[11];
                                        if (!z.lIIIlllIIllIl(Bank.getFirst((int[])nArray3).getQuantity(), lIlIIllllI[3])) break block21;
                                    }
                                    var3 = new DHelper(lIlIIllllI[11], lIlIIllllI[3], j.bZ);
                                    bp.add((DHelper) ar3);

                                }
                                int[] nArray = new int[lIlIIllllI[5]];
                                nArray[z.lIlIIllllI[6]] = lIlIIllllI[25];
                                if (z.lIIIlllIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    var3 = new DHelper(lIlIIllllI[25], lIlIIllllI[5], lIlIIllllI[60]);
                                    bp.add((DHelper) ar3);

                                }
                                int[] nArray4 = new int[lIlIIllllI[5]];
                                nArray4[z.lIlIIllllI[6]] = lIlIIllllI[22];
                                if (z.lIIIlllIlIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    var3 = new DHelper(lIlIIllllI[22], lIlIIllllI[5], lIlIIllllI[60]);
                                    bp.add((DHelper) ar3);

                                }
                                int[] nArray5 = new int[lIlIIllllI[5]];
                                nArray5[z.lIlIIllllI[6]] = lIlIIllllI[10];
                                if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray5) ? 1 : 0)) break block22;
                                int[] nArray6 = new int[lIlIIllllI[5]];
                                nArray6[z.lIlIIllllI[6]] = lIlIIllllI[10];
                                if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray6) ? 1 : 0)) break block23;
                                int[] nArray7 = new int[lIlIIllllI[5]];
                                nArray7[z.lIlIIllllI[6]] = lIlIIllllI[10];
                                if (!z.lIIIlllIIllIl(Bank.getFirst((int[])nArray7).getQuantity(), lIlIIllllI[9])) break block23;
                            }
                            var3 = new DHelper(lIlIIllllI[10], lIlIIllllI[9], lIlIIllllI[61]);
                            bp.add((DHelper) ar3);

                        }
                        int[] nArray = new int[lIlIIllllI[5]];
                        nArray[z.lIlIIllllI[6]] = lIlIIllllI[19];
                        if (z.lIIIlllIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            var3 = new DHelper(lIlIIllllI[19], lIlIIllllI[5], lIlIIllllI[60]);
                            bp.add((DHelper) ar3);

                        }
                        int[] nArray8 = new int[lIlIIllllI[5]];
                        nArray8[z.lIlIIllllI[6]] = lIlIIllllI[17];
                        if (z.lIIIlllIlIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            var3 = new DHelper(lIlIIllllI[17], lIlIIllllI[5], lIlIIllllI[60]);
                            bp.add((DHelper) ar3);

                        }
                        int[] nArray9 = new int[lIlIIllllI[5]];
                        nArray9[z.lIlIIllllI[6]] = lIlIIllllI[15];
                        if (z.lIIIlllIlIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                            var3 = new DHelper(lIlIIllllI[15], lIlIIllllI[5], lIlIIllllI[60]);
                            bp.add((DHelper) ar3);

                        }
                        int[] nArray10 = new int[lIlIIllllI[5]];
                        nArray10[z.lIlIIllllI[6]] = lIlIIllllI[16];
                        if (z.lIIIlllIlIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            var3 = new DHelper(lIlIIllllI[16], lIlIIllllI[5], lIlIIllllI[60]);
                            bp.add((DHelper) ar3);

                        }
                        int[] nArray11 = new int[lIlIIllllI[5]];
                        nArray11[z.lIlIIllllI[6]] = lIlIIllllI[14];
                        if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                        int[] nArray12 = new int[lIlIIllllI[5]];
                        nArray12[z.lIlIIllllI[6]] = lIlIIllllI[14];
                        if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray12) ? 1 : 0)) break block25;
                        int[] nArray13 = new int[lIlIIllllI[5]];
                        nArray13[z.lIlIIllllI[6]] = lIlIIllllI[14];
                        if (!z.lIIIlllIIllIl(Bank.getFirst((int[])nArray13).getQuantity(), lIlIIllllI[3])) break block25;
                    }
                    var3 = new DHelper(lIlIIllllI[14], lIlIIllllI[4], lIlIIllllI[62]);
                    bp.add((DHelper) ar3);

                }
                int[] nArray = new int[lIlIIllllI[5]];
                nArray[z.lIlIIllllI[6]] = lIlIIllllI[12];
                if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                int[] nArray14 = new int[lIlIIllllI[5]];
                nArray14[z.lIlIIllllI[6]] = lIlIIllllI[12];
                if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray14) ? 1 : 0)) break block27;
                int[] nArray15 = new int[lIlIIllllI[5]];
                nArray15[z.lIlIIllllI[6]] = lIlIIllllI[12];
                if (!z.lIIIlllIIllIl(Bank.getFirst((int[])nArray15).getQuantity(), lIlIIllllI[4])) break block27;
            }
            var3 = new DHelper(lIlIIllllI[12], lIlIIllllI[4], lIlIIllllI[62]);
            bp.add((DHelper) ar3);

        }
        if (z.lIIIlllIlIIIl(Bank.contains((Predicate)(var3 = item -> item.getName().toLowerCase().contains(lIlIIlllII[lIlIIllllI[67]]))) ? 1 : 0)) {
            var2 = new DHelper(lIlIIllllI[63], lIlIIllllI[3], lIlIIllllI[64]);
            bp.add(var2);

        }
        int[] nArray = new int[lIlIIllllI[5]];
        nArray[z.lIlIIllllI[6]] = lIlIIllllI[13];
        if (z.lIIIlllIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var2 = new DHelper(lIlIIllllI[13], lIlIIllllI[42], lIlIIllllI[62]);
            bp.add(var2);

        }
    }

    private static boolean lIIIlllIIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    public static void bD() {
        block50: {
            block58: {
                block57: {
                    BankLocation var4;
                    block56: {
                        block51: {
                            block55: {
                                block53: {
                                    block54: {
                                        block52: {
                                            if (z.lIIIlllIIllIl(e.j(lIlIIllllI[0]), lIlIIllllI[1])) {
                                                A.bF();
                                            }
                                            if (z.lIIIlllIIlllI(e.j(lIlIIllllI[0]), lIlIIllllI[1]) && z.lIIIlllIIllIl(e.j(lIlIIllllI[2]), lIlIIllllI[3])) {
                                                w.bi();
                                            }
                                            if (!z.lIIIlllIIlllI(Skills.getLevel((Skill)Skill.COOKING), lIlIIllllI[4]) || !z.lIIIlllIIlllI(e.j(lIlIIllllI[0]), lIlIIllllI[1]) || !z.lIIIlllIIllll(e.j(lIlIIllllI[2]), lIlIIllllI[3])) break block50;
                                            if (z.lIIIlllIlIIII(bn ? 1 : 0)) {
                                                b.a(bp);
                                                if (z.lIIIlllIIllIl(bp.size(), lIlIIllllI[5])) {
                                                    System.out.println(lIlIIlllII[lIlIIllllI[6]]);
                                                    bn = lIlIIllllI[6];
                                                }
                                            }
                                            if (!z.lIIIlllIlIIIl(bn ? 1 : 0)) break block50;
                                            if (!z.lIIIlllIlIIIl(z.al() ? 1 : 0) || !z.lIIIlllIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) break block51;
                                            var4 = BankLocation.getNearest();
                                            if (z.lIIIlllIlIIlI(var4) && z.lIIIlllIlIIIl(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[5]];
                                                a.a(var4);
                                            }
                                            if (!z.lIIIlllIlIIlI(var4) || !z.lIIIlllIlIIII(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block51;
                                            if (z.lIIIlllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIllllI[7]);

                                            }
                                            if (!z.lIIIlllIlIIII(Bank.isOpen() ? 1 : 0)) break block51;
                                            AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[8]];
                                            if (z.lIIIlllIlIIll(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIlIIllllI[9]);

                                            }
                                            if (z.lIIIlllIlIIll(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIlIIllllI[8]);

                                            }
                                            int[] nArray = new int[lIlIIllllI[5]];
                                            nArray[z.lIlIIllllI[6]] = lIlIIllllI[10];
                                            if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block52;
                                            int[] nArray2 = new int[lIlIIllllI[5]];
                                            nArray2[z.lIlIIllllI[6]] = lIlIIllllI[10];
                                            if (!z.lIIIlllIIlllI(Bank.getFirst((int[])nArray2).getQuantity(), lIlIIllllI[9])) break block53;
                                        }
                                        int[] nArray = new int[lIlIIllllI[5]];
                                        nArray[z.lIlIIllllI[6]] = lIlIIllllI[11];
                                        if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block54;
                                        int[] nArray3 = new int[lIlIIllllI[5]];
                                        nArray3[z.lIlIIllllI[6]] = lIlIIllllI[11];
                                        if (!z.lIIIlllIIlllI(Bank.getFirst((int[])nArray3).getQuantity(), lIlIIllllI[3])) break block53;
                                    }
                                    int[] nArray = new int[lIlIIllllI[5]];
                                    nArray[z.lIlIIllllI[6]] = lIlIIllllI[12];
                                    if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block55;
                                    int[] nArray4 = new int[lIlIIllllI[5]];
                                    nArray4[z.lIlIIllllI[6]] = lIlIIllllI[12];
                                    if (!z.lIIIlllIIllIl(Bank.getFirst((int[])nArray4).getQuantity(), lIlIIllllI[4])) break block55;
                                }
                                z.O();
                                System.out.println(lIlIIlllII[lIlIIllllI[1]]);
                                bn = lIlIIllllI[5];
                                return;
                            }
                            int[] nArray = new int[lIlIIllllI[2]];
                            nArray[z.lIlIIllllI[6]] = lIlIIllllI[13];
                            nArray[z.lIlIIllllI[5]] = lIlIIllllI[14];
                            nArray[z.lIlIIllllI[8]] = lIlIIllllI[12];
                            nArray[z.lIlIIllllI[1]] = lIlIIllllI[15];
                            nArray[z.lIlIIllllI[9]] = lIlIIllllI[16];
                            nArray[z.lIlIIllllI[3]] = lIlIIllllI[17];
                            nArray[z.lIlIIllllI[18]] = lIlIIllllI[19];
                            nArray[z.lIlIIllllI[20]] = lIlIIllllI[10];
                            nArray[z.lIlIIllllI[21]] = lIlIIllllI[22];
                            nArray[z.lIlIIllllI[23]] = lIlIIllllI[24];
                            nArray[z.lIlIIllllI[4]] = lIlIIllllI[25];
                            if (z.lIIIlllIlIIIl(e.b(nArray) ? 1 : 0)) {
                                z.O();
                                System.out.println(lIlIIlllII[lIlIIllllI[9]]);
                                bn = lIlIIllllI[5];
                                return;
                            }
                            int[] nArray5 = new int[lIlIIllllI[2]];
                            nArray5[z.lIlIIllllI[6]] = lIlIIllllI[13];
                            nArray5[z.lIlIIllllI[5]] = lIlIIllllI[14];
                            nArray5[z.lIlIIllllI[8]] = lIlIIllllI[12];
                            nArray5[z.lIlIIllllI[1]] = lIlIIllllI[15];
                            nArray5[z.lIlIIllllI[9]] = lIlIIllllI[16];
                            nArray5[z.lIlIIllllI[3]] = lIlIIllllI[17];
                            nArray5[z.lIlIIllllI[18]] = lIlIIllllI[19];
                            nArray5[z.lIlIIllllI[20]] = lIlIIllllI[10];
                            nArray5[z.lIlIIllllI[21]] = lIlIIllllI[22];
                            nArray5[z.lIlIIllllI[23]] = lIlIIllllI[24];
                            nArray5[z.lIlIIllllI[4]] = lIlIIllllI[25];
                            if (z.lIIIlllIlIIII(e.b(nArray5) ? 1 : 0)) {
                                a.a(lIlIIllllI[13], lIlIIllllI[4]);
                                a.a(lIlIIllllI[14], lIlIIllllI[4]);
                                a.a(lIlIIllllI[12], lIlIIllllI[4]);
                                a.a(lIlIIllllI[15], lIlIIllllI[5]);
                                a.a(lIlIIllllI[16], lIlIIllllI[5]);
                                a.a(lIlIIllllI[17], lIlIIllllI[5]);
                                a.a(lIlIIllllI[19], lIlIIllllI[5]);
                                a.a(lIlIIllllI[10], lIlIIllllI[9]);
                                a.a(lIlIIllllI[22], lIlIIllllI[5]);
                                a.a(lIlIIllllI[25], lIlIIllllI[5]);
                                a.a(lIlIIllllI[24], lIlIIllllI[3]);
                                a.a(lIlIIllllI[11], lIlIIllllI[8]);
                                a.a(lIlIIllllI[26], lIlIIllllI[7]);
                            }
                        }
                        if (z.lIIIlllIlIIII(Inventory.contains((int[])f.aU) ? 1 : 0) && z.lIIIlllIIllIl(Movement.getRunEnergy(), lIlIIllllI[27])) {
                            Inventory.getFirst((int[])f.aU).interact(lIlIIlllII[lIlIIllllI[3]]);
                            Time.sleepTicks((int)lIlIIllllI[5]);

                        }
                        if (z.lIIIlllIlIIII(z.al() ? 1 : 0) && z.lIIIlllIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
                            if (z.lIIIlllIlIlII(Players.getLocal().getWorldLocation().distanceTo(cR), lIlIIllllI[9])) {
                                String[] stringArray = new String[lIlIIllllI[5]];
                                stringArray[z.lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[18]];
                                if (z.lIIIlllIlIlIl(NPCs.getNearest((String[])stringArray))) {
                                    AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[20]];
                                    A.bG();
                                }
                            }
                            String[] stringArray = new String[lIlIIllllI[5]];
                            stringArray[z.lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[21]];
                            if (z.lIIIlllIlIIlI(NPCs.getNearest((String[])stringArray))) {
                                if (z.lIIIlllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray2 = new String[lIlIIllllI[5]];
                                    stringArray2[z.lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[23]];
                                    TileObjects.getNearest((String[])stringArray2).interact(lIlIIlllII[lIlIIllllI[4]]);
                                    Time.sleepTicks((int)lIlIIllllI[5]);

                                }
                                g.a(cy);
                            }
                        }
                        if (z.lIIIlllIIllll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIllllI[4])) {
                            if (z.lIIIlllIlIllI(Vars.getBit((int)lIlIIllllI[28]), lIlIIllllI[5])) {
                                if (z.lIIIlllIlIlII(Players.getLocal().getWorldLocation().distanceTo(cS), lIlIIllllI[20])) {
                                    AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[2]];
                                    Movement.walkTo((WorldPoint)cS);

                                    Time.sleepTicks((int)lIlIIllllI[5]);

                                }
                                if (z.lIIIlllIlIlll(Players.getLocal().getWorldLocation().distanceTo(cS), lIlIIllllI[20])) {
                                    AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[29]];
                                    g.a(lIlIIlllII[lIlIIllllI[30]], cy);
                                }
                            }
                            if (z.lIIIlllIIllll(Vars.getBit((int)lIlIIllllI[28]), lIlIIllllI[5])) {
                                int[] nArray = new int[lIlIIllllI[5]];
                                nArray[z.lIlIIllllI[6]] = lIlIIllllI[10];
                                if (z.lIIIlllIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray6 = new int[lIlIIllllI[5]];
                                    nArray6[z.lIlIIllllI[6]] = lIlIIllllI[26];
                                    int[] nArray7 = new int[lIlIIllllI[5]];
                                    nArray7[z.lIlIIllllI[6]] = lIlIIllllI[10];
                                    Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((int[])nArray7));
                                    Time.sleepTicks((int)lIlIIllllI[5]);

                                }
                                int[] nArray8 = new int[lIlIIllllI[5]];
                                nArray8[z.lIlIIllllI[6]] = lIlIIllllI[10];
                                if (z.lIIIlllIlIIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    if (z.lIIIlllIlIlII(Players.getLocal().getWorldLocation().distanceTo(cT), lIlIIllllI[20])) {
                                        AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[31]];
                                        Movement.walkTo((WorldPoint)cT);

                                        Time.sleepTicks((int)lIlIIllllI[5]);

                                    }
                                    if (z.lIIIlllIlIlll(Players.getLocal().getWorldLocation().distanceTo(cT), lIlIIllllI[20])) {
                                        AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[32]];
                                        g.a(lIlIIlllII[lIlIIllllI[33]], cy);
                                    }
                                }
                            }
                        }
                        if (z.lIIIlllIIllll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIllllI[34])) {
                            if (z.lIIIlllIlIllI(Vars.getBit((int)lIlIIllllI[35]), lIlIIllllI[9])) {
                                dc = lIlIIllllI[6];
                                if (z.lIIIlllIlIlII(Players.getLocal().getWorldLocation().distanceTo(cT), lIlIIllllI[20])) {
                                    AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[36]];
                                    Movement.walkTo((WorldPoint)cT);

                                    Time.sleepTicks((int)lIlIIllllI[5]);

                                }
                                if (z.lIIIlllIlIlll(Players.getLocal().getWorldLocation().distanceTo(cT), lIlIIllllI[20])) {
                                    AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[37]];
                                    g.a(lIlIIlllII[lIlIIllllI[38]], cy);
                                    g.a(lIlIIlllII[lIlIIllllI[34]], cy);
                                }
                            }
                            if (z.lIIIlllIIllll(Vars.getBit((int)lIlIIllllI[35]), lIlIIllllI[9])) {
                                AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[39]];
                                g.a(lIlIIlllII[lIlIIllllI[40]], cy);
                            }
                        }
                        if (!z.lIIIlllIlIllI(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIllllI[41]) || z.lIIIlllIIllll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIllllI[42])) {
                            AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[43]];
                            g.a(lIlIIlllII[lIlIIllllI[44]], cy);
                        }
                        if (!z.lIIIlllIIllll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIllllI[27])) break block50;
                        int[] nArray = new int[lIlIIllllI[5]];
                        nArray[z.lIlIIllllI[6]] = lIlIIllllI[22];
                        if (z.lIIIlllIlIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray9 = new int[lIlIIllllI[5]];
                            nArray9[z.lIlIIllllI[6]] = lIlIIllllI[22];
                            if (z.lIIIlllIlIIII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIlIIllllI[5]];
                                nArray10[z.lIlIIllllI[6]] = lIlIIllllI[22];
                                Inventory.getFirst((int[])nArray10).interact(lIlIIlllII[lIlIIllllI[45]]);
                                Time.sleepTicks((int)lIlIIllllI[5]);

                            }
                        }
                        int[] nArray11 = new int[lIlIIllllI[5]];
                        nArray11[z.lIlIIllllI[6]] = lIlIIllllI[22];
                        if (z.lIIIlllIlIIII(Equipment.contains((int[])nArray11) ? 1 : 0)) {
                            int[] nArray12 = new int[lIlIIllllI[5]];
                            nArray12[z.lIlIIllllI[6]] = lIlIIllllI[46];
                            if (z.lIIIlllIlIIlI(TileItems.getNearest((int[])nArray12))) {
                                int[] nArray13 = new int[lIlIIllllI[5]];
                                nArray13[z.lIlIIllllI[6]] = lIlIIllllI[46];
                                TileItems.getNearest((int[])nArray13).interact(lIlIIlllII[lIlIIllllI[47]]);
                                Time.sleepTicks((int)lIlIIllllI[5]);

                            }
                        }
                        int[] nArray14 = new int[lIlIIllllI[5]];
                        nArray14[z.lIlIIllllI[6]] = lIlIIllllI[46];
                        if (z.lIIIlllIlIIII(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                            int[] nArray15 = new int[lIlIIllllI[5]];
                            nArray15[z.lIlIIllllI[6]] = lIlIIllllI[25];
                            if (z.lIIIlllIlIIII(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                                int[] nArray16 = new int[lIlIIllllI[5]];
                                nArray16[z.lIlIIllllI[6]] = lIlIIllllI[25];
                                if (z.lIIIlllIlIIIl(Equipment.contains((int[])nArray16) ? 1 : 0)) {
                                    int[] nArray17 = new int[lIlIIllllI[5]];
                                    nArray17[z.lIlIIllllI[6]] = lIlIIllllI[25];
                                    Inventory.getFirst((int[])nArray17).interact(lIlIIlllII[lIlIIllllI[48]]);
                                    Time.sleepTicks((int)lIlIIllllI[5]);

                                }
                            }
                            if (z.lIIIlllIlIlII(Players.getLocal().getWorldLocation().distanceTo(cU), lIlIIllllI[18])) {
                                AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[49]];
                                Movement.walkTo((WorldPoint)cU);

                                Time.sleepTicks((int)lIlIIllllI[5]);

                            }
                            if (z.lIIIlllIlIlll(Players.getLocal().getWorldLocation().distanceTo(cU), lIlIIllllI[18])) {
                                AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[50]];
                                if (z.lIIIlllIlIlIl(Players.getLocal().getInteracting())) {
                                    String[] stringArray = new String[lIlIIllllI[5]];
                                    stringArray[z.lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[41]];
                                    NPCs.getNearest((String[])stringArray).interact(lIlIIlllII[lIlIIllllI[51]]);
                                    Time.sleepTicks((int)lIlIIllllI[1]);

                                }
                            }
                        }
                        int[] nArray18 = new int[lIlIIllllI[5]];
                        nArray18[z.lIlIIllllI[6]] = lIlIIllllI[52];
                        if (!z.lIIIlllIlIIII(Inventory.contains((int[])nArray18) ? 1 : 0)) break block50;
                        var4 = new WorldPoint(lIlIIllllI[53], lIlIIllllI[54], lIlIIllllI[6]);
                        if (!z.lIIIlllIlIlII(Players.getLocal().getWorldLocation().distanceTo(cR), lIlIIllllI[9])) break block56;
                        String[] stringArray = new String[lIlIIllllI[5]];
                        stringArray[z.lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[55]];
                        if (!z.lIIIlllIlIIlI(NPCs.getNearest((String[])stringArray))) break block57;
                    }
                    if (!z.lIIIlllIlIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var4), lIlIIllllI[41])) break block58;
                }
                AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[56]];
                A.bG();
            }
            String[] stringArray = new String[lIlIIllllI[5]];
            stringArray[z.lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[57]];
            if (z.lIIIlllIlIIlI(NPCs.getNearest((String[])stringArray))) {
                if (z.lIIIlllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[58]];
                    if (z.lIIIlllIIllIl(dc, lIlIIllllI[5])) {
                        Z.mK += lIlIIllllI[5];
                        Z.p(AccBuilderShamans.m);
                        dc += lIlIIllllI[5];
                        Z.mK = lIlIIllllI[6];
                        dd = lIlIIllllI[6];
                    }
                    int[] nArray = new int[lIlIIllllI[5]];
                    nArray[z.lIlIIllllI[6]] = lIlIIllllI[52];
                    String[] stringArray3 = new String[lIlIIllllI[5]];
                    stringArray3[z.lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[59]];
                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray3));
                    Time.sleepTicks((int)lIlIIllllI[5]);

                }
                g.a(cy);
            }
        }
    }

    private static boolean lIIIlllIlIIIl(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        int[] nArray = new int[lIlIIllllI[5]];
        nArray[z.lIlIIllllI[6]] = lIlIIllllI[25];
        if (z.lIIIlllIlIIll(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIlIIllllI[5]];
            nArray2[z.lIlIIllllI[6]] = lIlIIllllI[16];
            if (z.lIIIlllIlIIll(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIlIIllllI[5]];
                nArray3[z.lIlIIllllI[6]] = lIlIIllllI[17];
                if (z.lIIIlllIlIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lIlIIllllI[5]];
                    nArray4[z.lIlIIllllI[6]] = lIlIIllllI[19];
                    if (z.lIIIlllIlIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lIlIIllllI[5]];
                        nArray5[z.lIlIIllllI[6]] = lIlIIllllI[10];
                        if (z.lIIIlllIlIIII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[lIlIIllllI[5]];
                            nArray6[z.lIlIIllllI[6]] = lIlIIllllI[22];
                            if (z.lIIIlllIlIIII(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                int[] nArray7 = new int[lIlIIllllI[5]];
                                nArray7[z.lIlIIllllI[6]] = lIlIIllllI[26];
                                if (z.lIIIlllIlIIII(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                    n2 = lIlIIllllI[5];

                                    if ((0x33 ^ 0x60 ^ (0x11 ^ 0x46)) >= 0) return n2 != 0;
                                    return ((0x39 ^ 0x53 ^ (0x74 ^ 0x4E)) & (0x7D ^ 0xE ^ (9 ^ 0x2A) ^ -1)) != 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = lIlIIllllI[6];
        return n2 != 0;
    }
}

