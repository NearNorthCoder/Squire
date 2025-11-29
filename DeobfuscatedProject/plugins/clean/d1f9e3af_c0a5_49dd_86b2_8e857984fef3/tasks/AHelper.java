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
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.ANHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.WHelper;
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

public class AHelper
implements W {
    static  int cl;
    static  WorldPoint dC;
    
    static  WorldPoint dA;
    static  String[] bR;
    static  WorldPoint dB;
    static  boolean cm;
    
    public static  List<d> bv;
    public static  boolean bt;
    static  WorldPoint dD;
    static  int dE;

    @Override
    public boolean V() {
        boolean bl;
        if (A.lIIIllIllIlI(Quests.getState((Quest)Quest.RECIPE_FOR_DISASTER__MOUNTAIN_DWARF), QuestState.FINISHED)) {
            bl = lIlIIlllI[5];

            if (-(0x4E ^ 0x4A) > 0) {
                return false;
            }
        } else {
            bl = lIlIIlllI[6];
        }
        return bl;
    }

    private static boolean lIIIllIlIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIllIlIlll(Object object) {
        return object == null;
    }

    private static boolean lIIIllIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllIlIlII(Object object) {
        return object != null;
    }

    private static boolean lIIIllIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        int[] nArray = new int[lIlIIlllI[5]];
        nArray[A.lIlIIlllI[6]] = lIlIIlllI[25];
        if (A.lIIIllIlIlIl(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIlIIlllI[5]];
            nArray2[A.lIlIIlllI[6]] = lIlIIlllI[16];
            if (A.lIIIllIlIlIl(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIlIIlllI[5]];
                nArray3[A.lIlIIlllI[6]] = lIlIIlllI[17];
                if (A.lIIIllIlIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lIlIIlllI[5]];
                    nArray4[A.lIlIIlllI[6]] = lIlIIlllI[19];
                    if (A.lIIIllIlIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lIlIIlllI[5]];
                        nArray5[A.lIlIIlllI[6]] = lIlIIlllI[10];
                        if (A.lIIIllIlIIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[lIlIIlllI[5]];
                            nArray6[A.lIlIIlllI[6]] = lIlIIlllI[22];
                            if (A.lIIIllIlIIlI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                int[] nArray7 = new int[lIlIIlllI[5]];
                                nArray7[A.lIlIIlllI[6]] = lIlIIlllI[26];
                                if (A.lIIIllIlIIlI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                    n2 = lIlIIlllI[5];

                                    if ((0x6E ^ 0x6A) >= ((0x3F ^ 0x1A) & ~(0x79 ^ 0x5C))) return n2 != 0;
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = lIlIIlllI[6];
        return n2 != 0;
    }

    private static void lIIIllIIllIl() {
        lIlIIllII = new String[lIlIIlllI[79]];
        A.lIlIIllII[A.lIlIIlllI[6]] = "Finished buying items, switching back to quest";
        A.lIlIIllII[A.lIlIIlllI[5]] = "Nav to bank";
        A.lIlIIllII[A.lIlIIlllI[8]] = "Handling banking";
        A.lIlIIllII[A.lIlIIlllI[1]] = "We are missing quest supplies, switching to BUYING";
        A.lIlIIllII[A.lIlIIlllI[9]] = "We are missing quest supplies, switching to BUYING";
        A.lIlIIllII[A.lIlIIlllI[3]] = "Drink";
        A.lIlIIllII[A.lIlIIlllI[18]] = "Aris";
        A.lIlIIllII[A.lIlIIlllI[20]] = "Nav to rfd room";
        A.lIlIIllII[A.lIlIIlllI[21]] = "Aris";
        A.lIlIIllII[A.lIlIIlllI[23]] = "Dwarf";
        A.lIlIIllII[A.lIlIIlllI[4]] = "Inspect";
        A.lIlIIllII[A.lIlIIlllI[2]] = "Nav to fally pub";
        A.lIlIIllII[A.lIlIIlllI[29]] = "Handle chat";
        A.lIlIIllII[A.lIlIIlllI[30]] = "Kaylee";
        A.lIlIIllII[A.lIlIIlllI[31]] = "Nav to rock cake guy";
        A.lIlIIllII[A.lIlIIlllI[32]] = "Handle chat";
        A.lIlIIllII[A.lIlIIlllI[33]] = "An old Dwarf";
        A.lIlIIllII[A.lIlIIlllI[36]] = "Nav to rock cake guy";
        A.lIlIIllII[A.lIlIIlllI[37]] = "Handle chat";
        A.lIlIIllII[A.lIlIIlllI[38]] = "An old Dwarf";
        A.lIlIIllII[A.lIlIIlllI[34]] = "Rohak";
        A.lIlIIllII[A.lIlIIlllI[39]] = "Handle chat";
        A.lIlIIllII[A.lIlIIlllI[40]] = "Rohak";
        A.lIlIIllII[A.lIlIIlllI[43]] = "Handle chat";
        A.lIlIIllII[A.lIlIIlllI[44]] = "Rohak";
        A.lIlIIllII[A.lIlIIlllI[45]] = "Wear";
        A.lIlIIllII[A.lIlIIlllI[47]] = "Take";
        A.lIlIIllII[A.lIlIIlllI[48]] = "Wield";
        A.lIlIIllII[A.lIlIIlllI[49]] = "Nav to icefiend";
        A.lIlIIllII[A.lIlIIlllI[50]] = "Attack icefiend";
        A.lIlIIllII[A.lIlIIlllI[41]] = "Icefiend";
        A.lIlIIllII[A.lIlIIlllI[51]] = "Attack";
        A.lIlIIllII[A.lIlIIlllI[55]] = "Aris";
        A.lIlIIllII[A.lIlIIlllI[56]] = "Nav to rfd room";
        A.lIlIIllII[A.lIlIIlllI[57]] = "Aris";
        A.lIlIIllII[A.lIlIIlllI[58]] = "Finishing quest";
        A.lIlIIllII[A.lIlIIlllI[59]] = "Dwarf";
        A.lIlIIllII[A.lIlIIlllI[66]] = "RFD Dwarf quest";
        A.lIlIIllII[A.lIlIIlllI[67]] = "ring of wealth (";
        A.lIlIIllII[A.lIlIIlllI[76]] = "Yes.";
        A.lIlIIllII[A.lIlIIlllI[42]] = "What can you tell me about dwarves and ale?";
        A.lIlIIllII[A.lIlIIlllI[77]] = "I could offer you some in return, how about 200 gold?";
    }

    @Override
    public boolean S() {
        return lIlIIlllI[6];
    }

    static {
        A.lIIIllIIlllI();
        A.lIIIllIIllIl();
        bv = new ArrayList<d>();
        dA = new WorldPoint(lIlIIlllI[68], lIlIIlllI[69], lIlIIlllI[6]);
        dB = new WorldPoint(lIlIIlllI[70], lIlIIlllI[71], lIlIIlllI[6]);
        dC = new WorldPoint(lIlIIlllI[72], lIlIIlllI[73], lIlIIlllI[6]);
        dD = new WorldPoint(lIlIIlllI[74], lIlIIlllI[75], lIlIIlllI[6]);
        String[] stringArray = new String[lIlIIlllI[1]];
        stringArray[A.lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[76]];
        stringArray[A.lIlIIlllI[5]] = lIlIIllII[lIlIIlllI[42]];
        stringArray[A.lIlIIlllI[8]] = lIlIIllII[lIlIIlllI[77]];
        bR = stringArray;
        dE = lIlIIlllI[78];
    }

    private static void af() {
        d lllIlIlllIllII;
        Object lllIlIlllIllIl;
        block27: {
            block26: {
                block25: {
                    block24: {
                        block23: {
                            block22: {
                                block21: {
                                    block20: {
                                        int[] nArray = new int[lIlIIlllI[5]];
                                        nArray[A.lIlIIlllI[6]] = lIlIIlllI[11];
                                        if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                        int[] nArray2 = new int[lIlIIlllI[5]];
                                        nArray2[A.lIlIIlllI[6]] = lIlIIlllI[11];
                                        if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) break block21;
                                        int[] nArray3 = new int[lIlIIlllI[5]];
                                        nArray3[A.lIlIIlllI[6]] = lIlIIlllI[11];
                                        if (!A.lIIIllIIllll(Bank.getFirst((int[])nArray3).getQuantity(), lIlIIlllI[3])) break block21;
                                    }
                                    lllIlIlllIllIl = new DHelper(lIlIIlllI[11], lIlIIlllI[3], i.bq);
                                    bv.add((DHelper) llIlIlllIllIl);

                                }
                                int[] nArray = new int[lIlIIlllI[5]];
                                nArray[A.lIlIIlllI[6]] = lIlIIlllI[25];
                                if (A.lIIIllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    lllIlIlllIllIl = new DHelper(lIlIIlllI[25], lIlIIlllI[5], lIlIIlllI[60]);
                                    bv.add((DHelper) llIlIlllIllIl);

                                }
                                int[] nArray4 = new int[lIlIIlllI[5]];
                                nArray4[A.lIlIIlllI[6]] = lIlIIlllI[22];
                                if (A.lIIIllIlIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    lllIlIlllIllIl = new DHelper(lIlIIlllI[22], lIlIIlllI[5], lIlIIlllI[60]);
                                    bv.add((DHelper) llIlIlllIllIl);

                                }
                                int[] nArray5 = new int[lIlIIlllI[5]];
                                nArray5[A.lIlIIlllI[6]] = lIlIIlllI[10];
                                if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) break block22;
                                int[] nArray6 = new int[lIlIIlllI[5]];
                                nArray6[A.lIlIIlllI[6]] = lIlIIlllI[10];
                                if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) break block23;
                                int[] nArray7 = new int[lIlIIlllI[5]];
                                nArray7[A.lIlIIlllI[6]] = lIlIIlllI[10];
                                if (!A.lIIIllIIllll(Bank.getFirst((int[])nArray7).getQuantity(), lIlIIlllI[9])) break block23;
                            }
                            lllIlIlllIllIl = new DHelper(lIlIIlllI[10], lIlIIlllI[9], lIlIIlllI[61]);
                            bv.add((DHelper) llIlIlllIllIl);

                        }
                        int[] nArray = new int[lIlIIlllI[5]];
                        nArray[A.lIlIIlllI[6]] = lIlIIlllI[19];
                        if (A.lIIIllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            lllIlIlllIllIl = new DHelper(lIlIIlllI[19], lIlIIlllI[5], lIlIIlllI[60]);
                            bv.add((DHelper) llIlIlllIllIl);

                        }
                        int[] nArray8 = new int[lIlIIlllI[5]];
                        nArray8[A.lIlIIlllI[6]] = lIlIIlllI[17];
                        if (A.lIIIllIlIIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            lllIlIlllIllIl = new DHelper(lIlIIlllI[17], lIlIIlllI[5], lIlIIlllI[60]);
                            bv.add((DHelper) llIlIlllIllIl);

                        }
                        int[] nArray9 = new int[lIlIIlllI[5]];
                        nArray9[A.lIlIIlllI[6]] = lIlIIlllI[15];
                        if (A.lIIIllIlIIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                            lllIlIlllIllIl = new DHelper(lIlIIlllI[15], lIlIIlllI[5], lIlIIlllI[60]);
                            bv.add((DHelper) llIlIlllIllIl);

                        }
                        int[] nArray10 = new int[lIlIIlllI[5]];
                        nArray10[A.lIlIIlllI[6]] = lIlIIlllI[16];
                        if (A.lIIIllIlIIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            lllIlIlllIllIl = new DHelper(lIlIIlllI[16], lIlIIlllI[5], lIlIIlllI[60]);
                            bv.add((DHelper) llIlIlllIllIl);

                        }
                        int[] nArray11 = new int[lIlIIlllI[5]];
                        nArray11[A.lIlIIlllI[6]] = lIlIIlllI[14];
                        if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                        int[] nArray12 = new int[lIlIIlllI[5]];
                        nArray12[A.lIlIIlllI[6]] = lIlIIlllI[14];
                        if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray12) ? 1 : 0)) break block25;
                        int[] nArray13 = new int[lIlIIlllI[5]];
                        nArray13[A.lIlIIlllI[6]] = lIlIIlllI[14];
                        if (!A.lIIIllIIllll(Bank.getFirst((int[])nArray13).getQuantity(), lIlIIlllI[3])) break block25;
                    }
                    lllIlIlllIllIl = new DHelper(lIlIIlllI[14], lIlIIlllI[4], lIlIIlllI[62]);
                    bv.add((DHelper) llIlIlllIllIl);

                }
                int[] nArray = new int[lIlIIlllI[5]];
                nArray[A.lIlIIlllI[6]] = lIlIIlllI[12];
                if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                int[] nArray14 = new int[lIlIIlllI[5]];
                nArray14[A.lIlIIlllI[6]] = lIlIIlllI[12];
                if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray14) ? 1 : 0)) break block27;
                int[] nArray15 = new int[lIlIIlllI[5]];
                nArray15[A.lIlIIlllI[6]] = lIlIIlllI[12];
                if (!A.lIIIllIIllll(Bank.getFirst((int[])nArray15).getQuantity(), lIlIIlllI[4])) break block27;
            }
            lllIlIlllIllIl = new DHelper(lIlIIlllI[12], lIlIIlllI[4], lIlIIlllI[62]);
            bv.add((DHelper) llIlIlllIllIl);

        }
        if (A.lIIIllIlIIll(Bank.contains((Predicate)(lllIlIlllIllIl = item -> item.getName().toLowerCase().contains(lIlIIllII[lIlIIlllI[67]]))) ? 1 : 0)) {
            lllIlIlllIllII = new DHelper(lIlIIlllI[63], lIlIIlllI[3], lIlIIlllI[64]);
            bv.add(lllIlIlllIllII);

        }
        int[] nArray = new int[lIlIIlllI[5]];
        nArray[A.lIlIIlllI[6]] = lIlIIlllI[13];
        if (A.lIIIllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllIlIlllIllII = new DHelper(lIlIIlllI[13], lIlIIlllI[42], lIlIIlllI[62]);
            bv.add(lllIlIlllIllII);

        }
    }

    private static boolean lIIIllIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIllIllIII(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public String U() {
        return lIlIIllII[lIlIIlllI[66]];
    }

    @Override
    public int T() {
        try {
            A.bq();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 > (0x67 ^ 0x63)) {
            return (0x34 ^ 0x79) & ~(0xC3 ^ 0x8E);
        }
        return lIlIIlllI[65];
    }

    private static boolean lIIIllIllIlI(Object object, Object object2) {
        return object == object2;
    }

    public static void bq() {
        block50: {
            block58: {
                block57: {
                    BankLocation lllIlIllllIIII;
                    block56: {
                        block51: {
                            block55: {
                                block53: {
                                    block54: {
                                        block52: {
                                            if (A.lIIIllIIllll(e.j(lIlIIlllI[0]), lIlIIlllI[1])) {
                                                B.bs();
                                            }
                                            if (A.lIIIllIlIIII(e.j(lIlIIlllI[0]), lIlIIlllI[1]) && A.lIIIllIIllll(e.j(lIlIIlllI[2]), lIlIIlllI[3])) {
                                                w.aT();
                                            }
                                            if (!A.lIIIllIlIIII(Skills.getLevel((Skill)Skill.COOKING), lIlIIlllI[4]) || !A.lIIIllIlIIII(e.j(lIlIIlllI[0]), lIlIIlllI[1]) || !A.lIIIllIlIIIl(e.j(lIlIIlllI[2]), lIlIIlllI[3])) break block50;
                                            if (A.lIIIllIlIIlI(bt ? 1 : 0)) {
                                                b.a(bv);
                                                if (A.lIIIllIIllll(bv.size(), lIlIIlllI[5])) {
                                                    System.out.println(lIlIIllII[lIlIIlllI[6]]);
                                                    bt = lIlIIlllI[6];
                                                }
                                            }
                                            if (!A.lIIIllIlIIll(bt ? 1 : 0)) break block50;
                                            if (!A.lIIIllIlIIll(A.ab() ? 1 : 0) || !A.lIIIllIlIIll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) break block51;
                                            lllIlIllllIIII = BankLocation.getNearest();
                                            if (A.lIIIllIlIlII(lllIlIllllIIII) && A.lIIIllIlIIll(lllIlIllllIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[5]];
                                                a.a(lllIlIllllIIII);
                                            }
                                            if (!A.lIIIllIlIlII(lllIlIllllIIII) || !A.lIIIllIlIIlI(lllIlIllllIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block51;
                                            if (A.lIIIllIlIIll(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIlllI[7]);

                                            }
                                            if (!A.lIIIllIlIIlI(Bank.isOpen() ? 1 : 0)) break block51;
                                            AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[8]];
                                            if (A.lIIIllIlIlIl(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIlIIlllI[9]);

                                            }
                                            if (A.lIIIllIlIlIl(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIlIIlllI[8]);

                                            }
                                            int[] nArray = new int[lIlIIlllI[5]];
                                            nArray[A.lIlIIlllI[6]] = lIlIIlllI[10];
                                            if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block52;
                                            int[] nArray2 = new int[lIlIIlllI[5]];
                                            nArray2[A.lIlIIlllI[6]] = lIlIIlllI[10];
                                            if (!A.lIIIllIlIIII(Bank.getFirst((int[])nArray2).getQuantity(), lIlIIlllI[9])) break block53;
                                        }
                                        int[] nArray = new int[lIlIIlllI[5]];
                                        nArray[A.lIlIIlllI[6]] = lIlIIlllI[11];
                                        if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block54;
                                        int[] nArray3 = new int[lIlIIlllI[5]];
                                        nArray3[A.lIlIIlllI[6]] = lIlIIlllI[11];
                                        if (!A.lIIIllIlIIII(Bank.getFirst((int[])nArray3).getQuantity(), lIlIIlllI[3])) break block53;
                                    }
                                    int[] nArray = new int[lIlIIlllI[5]];
                                    nArray[A.lIlIIlllI[6]] = lIlIIlllI[12];
                                    if (!A.lIIIllIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block55;
                                    int[] nArray4 = new int[lIlIIlllI[5]];
                                    nArray4[A.lIlIIlllI[6]] = lIlIIlllI[12];
                                    if (!A.lIIIllIIllll(Bank.getFirst((int[])nArray4).getQuantity(), lIlIIlllI[4])) break block55;
                                }
                                A.af();
                                System.out.println(lIlIIllII[lIlIIlllI[1]]);
                                bt = lIlIIlllI[5];
                                return;
                            }
                            int[] nArray = new int[lIlIIlllI[2]];
                            nArray[A.lIlIIlllI[6]] = lIlIIlllI[13];
                            nArray[A.lIlIIlllI[5]] = lIlIIlllI[14];
                            nArray[A.lIlIIlllI[8]] = lIlIIlllI[12];
                            nArray[A.lIlIIlllI[1]] = lIlIIlllI[15];
                            nArray[A.lIlIIlllI[9]] = lIlIIlllI[16];
                            nArray[A.lIlIIlllI[3]] = lIlIIlllI[17];
                            nArray[A.lIlIIlllI[18]] = lIlIIlllI[19];
                            nArray[A.lIlIIlllI[20]] = lIlIIlllI[10];
                            nArray[A.lIlIIlllI[21]] = lIlIIlllI[22];
                            nArray[A.lIlIIlllI[23]] = lIlIIlllI[24];
                            nArray[A.lIlIIlllI[4]] = lIlIIlllI[25];
                            if (A.lIIIllIlIIll(e.b(nArray) ? 1 : 0)) {
                                A.af();
                                System.out.println(lIlIIllII[lIlIIlllI[9]]);
                                bt = lIlIIlllI[5];
                                return;
                            }
                            int[] nArray5 = new int[lIlIIlllI[2]];
                            nArray5[A.lIlIIlllI[6]] = lIlIIlllI[13];
                            nArray5[A.lIlIIlllI[5]] = lIlIIlllI[14];
                            nArray5[A.lIlIIlllI[8]] = lIlIIlllI[12];
                            nArray5[A.lIlIIlllI[1]] = lIlIIlllI[15];
                            nArray5[A.lIlIIlllI[9]] = lIlIIlllI[16];
                            nArray5[A.lIlIIlllI[3]] = lIlIIlllI[17];
                            nArray5[A.lIlIIlllI[18]] = lIlIIlllI[19];
                            nArray5[A.lIlIIlllI[20]] = lIlIIlllI[10];
                            nArray5[A.lIlIIlllI[21]] = lIlIIlllI[22];
                            nArray5[A.lIlIIlllI[23]] = lIlIIlllI[24];
                            nArray5[A.lIlIIlllI[4]] = lIlIIlllI[25];
                            if (A.lIIIllIlIIlI(e.b(nArray5) ? 1 : 0)) {
                                a.a(lIlIIlllI[13], lIlIIlllI[4]);
                                a.a(lIlIIlllI[14], lIlIIlllI[4]);
                                a.a(lIlIIlllI[12], lIlIIlllI[4]);
                                a.a(lIlIIlllI[15], lIlIIlllI[5]);
                                a.a(lIlIIlllI[16], lIlIIlllI[5]);
                                a.a(lIlIIlllI[17], lIlIIlllI[5]);
                                a.a(lIlIIlllI[19], lIlIIlllI[5]);
                                a.a(lIlIIlllI[10], lIlIIlllI[9]);
                                a.a(lIlIIlllI[22], lIlIIlllI[5]);
                                a.a(lIlIIlllI[25], lIlIIlllI[5]);
                                a.a(lIlIIlllI[24], lIlIIlllI[3]);
                                a.a(lIlIIlllI[11], lIlIIlllI[8]);
                                a.a(lIlIIlllI[26], lIlIIlllI[7]);
                            }
                        }
                        if (A.lIIIllIlIIlI(Inventory.contains((int[])f.aV) ? 1 : 0) && A.lIIIllIIllll(Movement.getRunEnergy(), lIlIIlllI[27])) {
                            Inventory.getFirst((int[])f.aV).interact(lIlIIllII[lIlIIlllI[3]]);
                            Time.sleepTicks((int)lIlIIlllI[5]);

                        }
                        if (A.lIIIllIlIIlI(A.ab() ? 1 : 0) && A.lIIIllIlIIll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
                            if (A.lIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dA), lIlIIlllI[9])) {
                                String[] stringArray = new String[lIlIIlllI[5]];
                                stringArray[A.lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[18]];
                                if (A.lIIIllIlIlll(NPCs.getNearest((String[])stringArray))) {
                                    AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[20]];
                                    B.bt();
                                }
                            }
                            String[] stringArray = new String[lIlIIlllI[5]];
                            stringArray[A.lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[21]];
                            if (A.lIIIllIlIlII(NPCs.getNearest((String[])stringArray))) {
                                if (A.lIIIllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray2 = new String[lIlIIlllI[5]];
                                    stringArray2[A.lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[23]];
                                    TileObjects.getNearest((String[])stringArray2).interact(lIlIIllII[lIlIIlllI[4]]);
                                    Time.sleepTicks((int)lIlIIlllI[5]);

                                }
                                g.a(bR);
                            }
                        }
                        if (A.lIIIllIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIlllI[4])) {
                            if (A.lIIIllIllIII(Vars.getBit((int)lIlIIlllI[28]), lIlIIlllI[5])) {
                                if (A.lIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dB), lIlIIlllI[20])) {
                                    AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[2]];
                                    Movement.walkTo((WorldPoint)dB);

                                    Time.sleepTicks((int)lIlIIlllI[5]);

                                }
                                if (A.lIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(dB), lIlIIlllI[20])) {
                                    AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[29]];
                                    g.a(lIlIIllII[lIlIIlllI[30]], bR);
                                }
                            }
                            if (A.lIIIllIlIIIl(Vars.getBit((int)lIlIIlllI[28]), lIlIIlllI[5])) {
                                int[] nArray = new int[lIlIIlllI[5]];
                                nArray[A.lIlIIlllI[6]] = lIlIIlllI[10];
                                if (A.lIIIllIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray6 = new int[lIlIIlllI[5]];
                                    nArray6[A.lIlIIlllI[6]] = lIlIIlllI[26];
                                    int[] nArray7 = new int[lIlIIlllI[5]];
                                    nArray7[A.lIlIIlllI[6]] = lIlIIlllI[10];
                                    Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((int[])nArray7));
                                    Time.sleepTicks((int)lIlIIlllI[5]);

                                }
                                int[] nArray8 = new int[lIlIIlllI[5]];
                                nArray8[A.lIlIIlllI[6]] = lIlIIlllI[10];
                                if (A.lIIIllIlIIll(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    if (A.lIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dC), lIlIIlllI[20])) {
                                        AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[31]];
                                        Movement.walkTo((WorldPoint)dC);

                                        Time.sleepTicks((int)lIlIIlllI[5]);

                                    }
                                    if (A.lIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(dC), lIlIIlllI[20])) {
                                        AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[32]];
                                        g.a(lIlIIllII[lIlIIlllI[33]], bR);
                                    }
                                }
                            }
                        }
                        if (A.lIIIllIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIlllI[34])) {
                            if (A.lIIIllIllIII(Vars.getBit((int)lIlIIlllI[35]), lIlIIlllI[9])) {
                                cl = lIlIIlllI[6];
                                if (A.lIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dC), lIlIIlllI[20])) {
                                    AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[36]];
                                    Movement.walkTo((WorldPoint)dC);

                                    Time.sleepTicks((int)lIlIIlllI[5]);

                                }
                                if (A.lIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(dC), lIlIIlllI[20])) {
                                    AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[37]];
                                    g.a(lIlIIllII[lIlIIlllI[38]], bR);
                                    g.a(lIlIIllII[lIlIIlllI[34]], bR);
                                }
                            }
                            if (A.lIIIllIlIIIl(Vars.getBit((int)lIlIIlllI[35]), lIlIIlllI[9])) {
                                AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[39]];
                                g.a(lIlIIllII[lIlIIlllI[40]], bR);
                            }
                        }
                        if (!A.lIIIllIllIII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIlllI[41]) || A.lIIIllIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIlllI[42])) {
                            AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[43]];
                            g.a(lIlIIllII[lIlIIlllI[44]], bR);
                        }
                        if (!A.lIIIllIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIlllI[27])) break block50;
                        int[] nArray = new int[lIlIIlllI[5]];
                        nArray[A.lIlIIlllI[6]] = lIlIIlllI[22];
                        if (A.lIIIllIlIIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray9 = new int[lIlIIlllI[5]];
                            nArray9[A.lIlIIlllI[6]] = lIlIIlllI[22];
                            if (A.lIIIllIlIIlI(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIlIIlllI[5]];
                                nArray10[A.lIlIIlllI[6]] = lIlIIlllI[22];
                                Inventory.getFirst((int[])nArray10).interact(lIlIIllII[lIlIIlllI[45]]);
                                Time.sleepTicks((int)lIlIIlllI[5]);

                            }
                        }
                        int[] nArray11 = new int[lIlIIlllI[5]];
                        nArray11[A.lIlIIlllI[6]] = lIlIIlllI[22];
                        if (A.lIIIllIlIIlI(Equipment.contains((int[])nArray11) ? 1 : 0)) {
                            int[] nArray12 = new int[lIlIIlllI[5]];
                            nArray12[A.lIlIIlllI[6]] = lIlIIlllI[46];
                            if (A.lIIIllIlIlII(TileItems.getNearest((int[])nArray12))) {
                                int[] nArray13 = new int[lIlIIlllI[5]];
                                nArray13[A.lIlIIlllI[6]] = lIlIIlllI[46];
                                TileItems.getNearest((int[])nArray13).interact(lIlIIllII[lIlIIlllI[47]]);
                                Time.sleepTicks((int)lIlIIlllI[5]);

                            }
                        }
                        int[] nArray14 = new int[lIlIIlllI[5]];
                        nArray14[A.lIlIIlllI[6]] = lIlIIlllI[46];
                        if (A.lIIIllIlIIlI(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                            int[] nArray15 = new int[lIlIIlllI[5]];
                            nArray15[A.lIlIIlllI[6]] = lIlIIlllI[25];
                            if (A.lIIIllIlIIlI(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                                int[] nArray16 = new int[lIlIIlllI[5]];
                                nArray16[A.lIlIIlllI[6]] = lIlIIlllI[25];
                                if (A.lIIIllIlIIll(Equipment.contains((int[])nArray16) ? 1 : 0)) {
                                    int[] nArray17 = new int[lIlIIlllI[5]];
                                    nArray17[A.lIlIIlllI[6]] = lIlIIlllI[25];
                                    Inventory.getFirst((int[])nArray17).interact(lIlIIllII[lIlIIlllI[48]]);
                                    Time.sleepTicks((int)lIlIIlllI[5]);

                                }
                            }
                            if (A.lIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dD), lIlIIlllI[18])) {
                                AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[49]];
                                Movement.walkTo((WorldPoint)dD);

                                Time.sleepTicks((int)lIlIIlllI[5]);

                            }
                            if (A.lIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(dD), lIlIIlllI[18])) {
                                AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[50]];
                                if (A.lIIIllIlIlll(Players.getLocal().getInteracting())) {
                                    String[] stringArray = new String[lIlIIlllI[5]];
                                    stringArray[A.lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[41]];
                                    NPCs.getNearest((String[])stringArray).interact(lIlIIllII[lIlIIlllI[51]]);
                                    Time.sleepTicks((int)lIlIIlllI[1]);

                                }
                            }
                        }
                        int[] nArray18 = new int[lIlIIlllI[5]];
                        nArray18[A.lIlIIlllI[6]] = lIlIIlllI[52];
                        if (!A.lIIIllIlIIlI(Inventory.contains((int[])nArray18) ? 1 : 0)) break block50;
                        lllIlIllllIIII = new WorldPoint(lIlIIlllI[53], lIlIIlllI[54], lIlIIlllI[6]);
                        if (!A.lIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dA), lIlIIlllI[9])) break block56;
                        String[] stringArray = new String[lIlIIlllI[5]];
                        stringArray[A.lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[55]];
                        if (!A.lIIIllIlIlII(NPCs.getNearest((String[])stringArray))) break block57;
                    }
                    if (!A.lIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllIlIllllIIII), lIlIIlllI[41])) break block58;
                }
                AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[56]];
                B.bt();
            }
            String[] stringArray = new String[lIlIIlllI[5]];
            stringArray[A.lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[57]];
            if (A.lIIIllIlIlII(NPCs.getNearest((String[])stringArray))) {
                if (A.lIIIllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIllII[lIlIIlllI[58]];
                    if (A.lIIIllIIllll(cl, lIlIIlllI[5])) {
                        an.oo += lIlIIlllI[5];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIlIIlllI[5];
                        an.oo = lIlIIlllI[6];
                        cm = lIlIIlllI[6];
                    }
                    int[] nArray = new int[lIlIIlllI[5]];
                    nArray[A.lIlIIlllI[6]] = lIlIIlllI[52];
                    String[] stringArray3 = new String[lIlIIlllI[5]];
                    stringArray3[A.lIlIIlllI[6]] = lIlIIllII[lIlIIlllI[59]];
                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray3));
                    Time.sleepTicks((int)lIlIIlllI[5]);

                }
                g.a(bR);
            }
        }
    }

    private static boolean lIIIllIllIIl(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(lllIlIllIIIIll);
    }

    private static boolean lIIIllIlIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllIIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllIlIlIl(int n2) {
        return n2 > 0;
    }
}

