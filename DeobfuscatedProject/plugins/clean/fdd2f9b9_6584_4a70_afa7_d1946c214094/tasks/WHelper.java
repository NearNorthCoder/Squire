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
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.UHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.BHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.FHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.GHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.IHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.THelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.XHelper;
import gg.squire.account.AccBuilderRogues;
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

public class WHelper
implements G {
    
    static  WorldPoint de;
    static  WorldPoint dh;
    static  int ck;
    static  boolean cl;
    
    static  WorldPoint dg;
    static  WorldPoint df;
    public static  List<d> bv;
    static  String[] bR;
    public static  boolean bt;
    static  int di;

    static {
        w.lIIIIlIIIlIlI();
        w.lIIIIlIIIlIIl();
        bv = new ArrayList<d>();
        de = new WorldPoint(lIIlllIIll[68], lIIlllIIll[69], lIIlllIIll[6]);
        df = new WorldPoint(lIIlllIIll[70], lIIlllIIll[71], lIIlllIIll[6]);
        dg = new WorldPoint(lIIlllIIll[72], lIIlllIIll[73], lIIlllIIll[6]);
        dh = new WorldPoint(lIIlllIIll[74], lIIlllIIll[75], lIIlllIIll[6]);
        String[] stringArray = new String[lIIlllIIll[1]];
        stringArray[w.lIIlllIIll[6]] = lIIlllIIlI[lIIlllIIll[76]];
        stringArray[w.lIIlllIIll[5]] = lIIlllIIlI[lIIlllIIll[42]];
        stringArray[w.lIIlllIIll[8]] = lIIlllIIlI[lIIlllIIll[77]];
        bR = stringArray;
        di = lIIlllIIll[78];
    }

    private static boolean lIIIIlIIIllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIlIIIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIlIIlIIIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIlIIlIlII(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        int[] nArray = new int[lIIlllIIll[5]];
        nArray[w.lIIlllIIll[6]] = lIIlllIIll[25];
        if (w.lIIIIlIIlIIIl(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIIlllIIll[5]];
            nArray2[w.lIIlllIIll[6]] = lIIlllIIll[16];
            if (w.lIIIIlIIlIIIl(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIIlllIIll[5]];
                nArray3[w.lIIlllIIll[6]] = lIIlllIIll[17];
                if (w.lIIIIlIIIlllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lIIlllIIll[5]];
                    nArray4[w.lIIlllIIll[6]] = lIIlllIIll[19];
                    if (w.lIIIIlIIIlllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lIIlllIIll[5]];
                        nArray5[w.lIIlllIIll[6]] = lIIlllIIll[10];
                        if (w.lIIIIlIIIlllI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[lIIlllIIll[5]];
                            nArray6[w.lIIlllIIll[6]] = lIIlllIIll[22];
                            if (w.lIIIIlIIIlllI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                int[] nArray7 = new int[lIIlllIIll[5]];
                                nArray7[w.lIIlllIIll[6]] = lIIlllIIll[26];
                                if (w.lIIIIlIIIlllI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                    n2 = lIIlllIIll[5];

                                    if (1 > 0) return n2 != 0;
                                    return ((0x1D ^ 0x64 ^ (0x3E ^ 8)) & (178 + 112 - 196 + 138 ^ 81 + 77 - 91 + 100 ^ -1)) != 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIlllIIll[6];
        return n2 != 0;
    }

    private static boolean lIIIIlIIIllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIIlIIlIIII(Object object) {
        return object != null;
    }

    private static boolean lIIIIlIIlIllI(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public int T() {
        try {
            w.bf();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 == 0) {
            return (0x57 ^ 0x50 ^ (0xAC ^ 0xA5)) & (75 + 97 - 135 + 141 ^ 140 + 13 - 105 + 140 ^ -1);
        }
        return lIIlllIIll[65];
    }

    @Override
    public boolean V() {
        boolean bl;
        if (w.lIIIIlIIlIllI(Quests.getState((Quest)Quest.RECIPE_FOR_DISASTER__MOUNTAIN_DWARF), QuestState.FINISHED)) {
            bl = lIIlllIIll[5];

            if ((0x35 ^ 0x7C ^ (0xF3 ^ 0xBF)) == 0) {
                return ((117 + 150 - 152 + 59 ^ 72 + 15 - 38 + 118) & (4 ^ 0x5F ^ (0x17 ^ 0x45) ^ -1)) != 0;
            }
        } else {
            bl = lIIlllIIll[6];
        }
        return bl;
    }

    private static void lIIIIlIIIlIIl() {
        lIIlllIIlI = new String[lIIlllIIll[79]];
        w.lIIlllIIlI[w.lIIlllIIll[6]] = "Finished buying items, switching back to quest";
        w.lIIlllIIlI[w.lIIlllIIll[5]] = "Nav to bank";
        w.lIIlllIIlI[w.lIIlllIIll[8]] = "Handling banking";
        w.lIIlllIIlI[w.lIIlllIIll[1]] = "We are missing quest supplies, switching to BUYING";
        w.lIIlllIIlI[w.lIIlllIIll[9]] = "We are missing quest supplies, switching to BUYING";
        w.lIIlllIIlI[w.lIIlllIIll[3]] = "Drink";
        w.lIIlllIIlI[w.lIIlllIIll[18]] = "Aris";
        w.lIIlllIIlI[w.lIIlllIIll[20]] = "Nav to rfd room";
        w.lIIlllIIlI[w.lIIlllIIll[21]] = "Aris";
        w.lIIlllIIlI[w.lIIlllIIll[23]] = "Dwarf";
        w.lIIlllIIlI[w.lIIlllIIll[4]] = "Inspect";
        w.lIIlllIIlI[w.lIIlllIIll[2]] = "Nav to fally pub";
        w.lIIlllIIlI[w.lIIlllIIll[29]] = "Handle chat";
        w.lIIlllIIlI[w.lIIlllIIll[30]] = "Kaylee";
        w.lIIlllIIlI[w.lIIlllIIll[31]] = "Nav to rock cake guy";
        w.lIIlllIIlI[w.lIIlllIIll[32]] = "Handle chat";
        w.lIIlllIIlI[w.lIIlllIIll[33]] = "An old Dwarf";
        w.lIIlllIIlI[w.lIIlllIIll[36]] = "Nav to rock cake guy";
        w.lIIlllIIlI[w.lIIlllIIll[37]] = "Handle chat";
        w.lIIlllIIlI[w.lIIlllIIll[38]] = "An old Dwarf";
        w.lIIlllIIlI[w.lIIlllIIll[34]] = "Rohak";
        w.lIIlllIIlI[w.lIIlllIIll[39]] = "Handle chat";
        w.lIIlllIIlI[w.lIIlllIIll[40]] = "Rohak";
        w.lIIlllIIlI[w.lIIlllIIll[43]] = "Handle chat";
        w.lIIlllIIlI[w.lIIlllIIll[44]] = "Rohak";
        w.lIIlllIIlI[w.lIIlllIIll[45]] = "Wear";
        w.lIIlllIIlI[w.lIIlllIIll[47]] = "Take";
        w.lIIlllIIlI[w.lIIlllIIll[48]] = "Wield";
        w.lIIlllIIlI[w.lIIlllIIll[49]] = "Nav to icefiend";
        w.lIIlllIIlI[w.lIIlllIIll[50]] = "Attack icefiend";
        w.lIIlllIIlI[w.lIIlllIIll[41]] = "Icefiend";
        w.lIIlllIIlI[w.lIIlllIIll[51]] = "Attack";
        w.lIIlllIIlI[w.lIIlllIIll[55]] = "Aris";
        w.lIIlllIIlI[w.lIIlllIIll[56]] = "Nav to rfd room";
        w.lIIlllIIlI[w.lIIlllIIll[57]] = "Aris";
        w.lIIlllIIlI[w.lIIlllIIll[58]] = "Finishing quest";
        w.lIIlllIIlI[w.lIIlllIIll[59]] = "Dwarf";
        w.lIIlllIIlI[w.lIIlllIIll[66]] = "RFD Dwarf quest";
        w.lIIlllIIlI[w.lIIlllIIll[67]] = "ring of wealth (";
        w.lIIlllIIlI[w.lIIlllIIll[76]] = "Q\r";
        w.lIIlllIIlI[w.lIIlllIIll[42]] = "What can you tell me about dwarves and ale?";
        w.lIIlllIIlI[w.lIIlllIIll[77]] = "I could offer you some in return, how about 200 gold?";
    }

        return String.valueOf(var1);
    }

    public static void bf() {
        block50: {
            block58: {
                block57: {
                    BankLocation var2;
                    block56: {
                        block51: {
                            block55: {
                                block53: {
                                    block54: {
                                        block52: {
                                            if (w.lIIIIlIIIlIll(e.j(lIIlllIIll[0]), lIIlllIIll[1])) {
                                                x.bh();
                                            }
                                            if (w.lIIIIlIIIllII(e.j(lIIlllIIll[0]), lIIlllIIll[1]) && w.lIIIIlIIIlIll(e.j(lIIlllIIll[2]), lIIlllIIll[3])) {
                                                t.aK();
                                            }
                                            if (!w.lIIIIlIIIllII(Skills.getLevel((Skill)Skill.COOKING), lIIlllIIll[4]) || !w.lIIIIlIIIllII(e.j(lIIlllIIll[0]), lIIlllIIll[1]) || !w.lIIIIlIIIllIl(e.j(lIIlllIIll[2]), lIIlllIIll[3])) break block50;
                                            if (w.lIIIIlIIIlllI(bt ? 1 : 0)) {
                                                b.a(bv);
                                                if (w.lIIIIlIIIlIll(bv.size(), lIIlllIIll[5])) {
                                                    System.out.println(lIIlllIIlI[lIIlllIIll[6]]);
                                                    bt = lIIlllIIll[6];
                                                }
                                            }
                                            if (!w.lIIIIlIIIllll(bt ? 1 : 0)) break block50;
                                            if (!w.lIIIIlIIIllll(w.ab() ? 1 : 0) || !w.lIIIIlIIIllll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) break block51;
                                            var2 = BankLocation.getNearest();
                                            if (w.lIIIIlIIlIIII(var2) && w.lIIIIlIIIllll(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[5]];
                                                a.a(var2);
                                            }
                                            if (!w.lIIIIlIIlIIII(var2) || !w.lIIIIlIIIlllI(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block51;
                                            if (w.lIIIIlIIIllll(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlllIIll[7]);

                                            }
                                            if (!w.lIIIIlIIIlllI(Bank.isOpen() ? 1 : 0)) break block51;
                                            AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[8]];
                                            if (w.lIIIIlIIlIIIl(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIlllIIll[9]);

                                            }
                                            if (w.lIIIIlIIlIIIl(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIlllIIll[8]);

                                            }
                                            int[] nArray = new int[lIIlllIIll[5]];
                                            nArray[w.lIIlllIIll[6]] = lIIlllIIll[10];
                                            if (!w.lIIIIlIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block52;
                                            int[] nArray2 = new int[lIIlllIIll[5]];
                                            nArray2[w.lIIlllIIll[6]] = lIIlllIIll[10];
                                            if (!w.lIIIIlIIIllII(Bank.getFirst((int[])nArray2).getQuantity(), lIIlllIIll[9])) break block53;
                                        }
                                        int[] nArray = new int[lIIlllIIll[5]];
                                        nArray[w.lIIlllIIll[6]] = lIIlllIIll[11];
                                        if (!w.lIIIIlIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block54;
                                        int[] nArray3 = new int[lIIlllIIll[5]];
                                        nArray3[w.lIIlllIIll[6]] = lIIlllIIll[11];
                                        if (!w.lIIIIlIIIllII(Bank.getFirst((int[])nArray3).getQuantity(), lIIlllIIll[3])) break block53;
                                    }
                                    int[] nArray = new int[lIIlllIIll[5]];
                                    nArray[w.lIIlllIIll[6]] = lIIlllIIll[12];
                                    if (!w.lIIIIlIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block55;
                                    int[] nArray4 = new int[lIIlllIIll[5]];
                                    nArray4[w.lIIlllIIll[6]] = lIIlllIIll[12];
                                    if (!w.lIIIIlIIIlIll(Bank.getFirst((int[])nArray4).getQuantity(), lIIlllIIll[4])) break block55;
                                }
                                w.af();
                                System.out.println(lIIlllIIlI[lIIlllIIll[1]]);
                                bt = lIIlllIIll[5];
                                return;
                            }
                            int[] nArray = new int[lIIlllIIll[2]];
                            nArray[w.lIIlllIIll[6]] = lIIlllIIll[13];
                            nArray[w.lIIlllIIll[5]] = lIIlllIIll[14];
                            nArray[w.lIIlllIIll[8]] = lIIlllIIll[12];
                            nArray[w.lIIlllIIll[1]] = lIIlllIIll[15];
                            nArray[w.lIIlllIIll[9]] = lIIlllIIll[16];
                            nArray[w.lIIlllIIll[3]] = lIIlllIIll[17];
                            nArray[w.lIIlllIIll[18]] = lIIlllIIll[19];
                            nArray[w.lIIlllIIll[20]] = lIIlllIIll[10];
                            nArray[w.lIIlllIIll[21]] = lIIlllIIll[22];
                            nArray[w.lIIlllIIll[23]] = lIIlllIIll[24];
                            nArray[w.lIIlllIIll[4]] = lIIlllIIll[25];
                            if (w.lIIIIlIIIllll(e.b(nArray) ? 1 : 0)) {
                                w.af();
                                System.out.println(lIIlllIIlI[lIIlllIIll[9]]);
                                bt = lIIlllIIll[5];
                                return;
                            }
                            int[] nArray5 = new int[lIIlllIIll[2]];
                            nArray5[w.lIIlllIIll[6]] = lIIlllIIll[13];
                            nArray5[w.lIIlllIIll[5]] = lIIlllIIll[14];
                            nArray5[w.lIIlllIIll[8]] = lIIlllIIll[12];
                            nArray5[w.lIIlllIIll[1]] = lIIlllIIll[15];
                            nArray5[w.lIIlllIIll[9]] = lIIlllIIll[16];
                            nArray5[w.lIIlllIIll[3]] = lIIlllIIll[17];
                            nArray5[w.lIIlllIIll[18]] = lIIlllIIll[19];
                            nArray5[w.lIIlllIIll[20]] = lIIlllIIll[10];
                            nArray5[w.lIIlllIIll[21]] = lIIlllIIll[22];
                            nArray5[w.lIIlllIIll[23]] = lIIlllIIll[24];
                            nArray5[w.lIIlllIIll[4]] = lIIlllIIll[25];
                            if (w.lIIIIlIIIlllI(e.b(nArray5) ? 1 : 0)) {
                                a.a(lIIlllIIll[13], lIIlllIIll[4]);
                                a.a(lIIlllIIll[14], lIIlllIIll[4]);
                                a.a(lIIlllIIll[12], lIIlllIIll[4]);
                                a.a(lIIlllIIll[15], lIIlllIIll[5]);
                                a.a(lIIlllIIll[16], lIIlllIIll[5]);
                                a.a(lIIlllIIll[17], lIIlllIIll[5]);
                                a.a(lIIlllIIll[19], lIIlllIIll[5]);
                                a.a(lIIlllIIll[10], lIIlllIIll[9]);
                                a.a(lIIlllIIll[22], lIIlllIIll[5]);
                                a.a(lIIlllIIll[25], lIIlllIIll[5]);
                                a.a(lIIlllIIll[24], lIIlllIIll[3]);
                                a.a(lIIlllIIll[11], lIIlllIIll[8]);
                                a.a(lIIlllIIll[26], lIIlllIIll[7]);
                            }
                        }
                        if (w.lIIIIlIIIlllI(Inventory.contains((int[])f.aV) ? 1 : 0) && w.lIIIIlIIIlIll(Movement.getRunEnergy(), lIIlllIIll[27])) {
                            Inventory.getFirst((int[])f.aV).interact(lIIlllIIlI[lIIlllIIll[3]]);
                            Time.sleepTicks((int)lIIlllIIll[5]);

                        }
                        if (w.lIIIIlIIIlllI(w.ab() ? 1 : 0) && w.lIIIIlIIIllll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
                            if (w.lIIIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(de), lIIlllIIll[9])) {
                                String[] stringArray = new String[lIIlllIIll[5]];
                                stringArray[w.lIIlllIIll[6]] = lIIlllIIlI[lIIlllIIll[18]];
                                if (w.lIIIIlIIlIIll(NPCs.getNearest((String[])stringArray))) {
                                    AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[20]];
                                    x.bi();
                                }
                            }
                            String[] stringArray = new String[lIIlllIIll[5]];
                            stringArray[w.lIIlllIIll[6]] = lIIlllIIlI[lIIlllIIll[21]];
                            if (w.lIIIIlIIlIIII(NPCs.getNearest((String[])stringArray))) {
                                if (w.lIIIIlIIIllll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray2 = new String[lIIlllIIll[5]];
                                    stringArray2[w.lIIlllIIll[6]] = lIIlllIIlI[lIIlllIIll[23]];
                                    TileObjects.getNearest((String[])stringArray2).interact(lIIlllIIlI[lIIlllIIll[4]]);
                                    Time.sleepTicks((int)lIIlllIIll[5]);

                                }
                                g.a(bR);
                            }
                        }
                        if (w.lIIIIlIIIllIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlllIIll[4])) {
                            if (w.lIIIIlIIlIlII(Vars.getBit((int)lIIlllIIll[28]), lIIlllIIll[5])) {
                                if (w.lIIIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(df), lIIlllIIll[20])) {
                                    AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[2]];
                                    Movement.walkTo((WorldPoint)df);

                                    Time.sleepTicks((int)lIIlllIIll[5]);

                                }
                                if (w.lIIIIlIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(df), lIIlllIIll[20])) {
                                    AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[29]];
                                    g.a(lIIlllIIlI[lIIlllIIll[30]], bR);
                                }
                            }
                            if (w.lIIIIlIIIllIl(Vars.getBit((int)lIIlllIIll[28]), lIIlllIIll[5])) {
                                int[] nArray = new int[lIIlllIIll[5]];
                                nArray[w.lIIlllIIll[6]] = lIIlllIIll[10];
                                if (w.lIIIIlIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray6 = new int[lIIlllIIll[5]];
                                    nArray6[w.lIIlllIIll[6]] = lIIlllIIll[26];
                                    int[] nArray7 = new int[lIIlllIIll[5]];
                                    nArray7[w.lIIlllIIll[6]] = lIIlllIIll[10];
                                    Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((int[])nArray7));
                                    Time.sleepTicks((int)lIIlllIIll[5]);

                                }
                                int[] nArray8 = new int[lIIlllIIll[5]];
                                nArray8[w.lIIlllIIll[6]] = lIIlllIIll[10];
                                if (w.lIIIIlIIIllll(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    if (w.lIIIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(dg), lIIlllIIll[20])) {
                                        AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[31]];
                                        Movement.walkTo((WorldPoint)dg);

                                        Time.sleepTicks((int)lIIlllIIll[5]);

                                    }
                                    if (w.lIIIIlIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(dg), lIIlllIIll[20])) {
                                        AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[32]];
                                        g.a(lIIlllIIlI[lIIlllIIll[33]], bR);
                                    }
                                }
                            }
                        }
                        if (w.lIIIIlIIIllIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlllIIll[34])) {
                            if (w.lIIIIlIIlIlII(Vars.getBit((int)lIIlllIIll[35]), lIIlllIIll[9])) {
                                ck = lIIlllIIll[6];
                                if (w.lIIIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(dg), lIIlllIIll[20])) {
                                    AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[36]];
                                    Movement.walkTo((WorldPoint)dg);

                                    Time.sleepTicks((int)lIIlllIIll[5]);

                                }
                                if (w.lIIIIlIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(dg), lIIlllIIll[20])) {
                                    AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[37]];
                                    g.a(lIIlllIIlI[lIIlllIIll[38]], bR);
                                    g.a(lIIlllIIlI[lIIlllIIll[34]], bR);
                                }
                            }
                            if (w.lIIIIlIIIllIl(Vars.getBit((int)lIIlllIIll[35]), lIIlllIIll[9])) {
                                AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[39]];
                                g.a(lIIlllIIlI[lIIlllIIll[40]], bR);
                            }
                        }
                        if (!w.lIIIIlIIlIlII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlllIIll[41]) || w.lIIIIlIIIllIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlllIIll[42])) {
                            AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[43]];
                            g.a(lIIlllIIlI[lIIlllIIll[44]], bR);
                        }
                        if (!w.lIIIIlIIIllIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlllIIll[27])) break block50;
                        int[] nArray = new int[lIIlllIIll[5]];
                        nArray[w.lIIlllIIll[6]] = lIIlllIIll[22];
                        if (w.lIIIIlIIIllll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray9 = new int[lIIlllIIll[5]];
                            nArray9[w.lIIlllIIll[6]] = lIIlllIIll[22];
                            if (w.lIIIIlIIIlllI(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIlllIIll[5]];
                                nArray10[w.lIIlllIIll[6]] = lIIlllIIll[22];
                                Inventory.getFirst((int[])nArray10).interact(lIIlllIIlI[lIIlllIIll[45]]);
                                Time.sleepTicks((int)lIIlllIIll[5]);

                            }
                        }
                        int[] nArray11 = new int[lIIlllIIll[5]];
                        nArray11[w.lIIlllIIll[6]] = lIIlllIIll[22];
                        if (w.lIIIIlIIIlllI(Equipment.contains((int[])nArray11) ? 1 : 0)) {
                            int[] nArray12 = new int[lIIlllIIll[5]];
                            nArray12[w.lIIlllIIll[6]] = lIIlllIIll[46];
                            if (w.lIIIIlIIlIIII(TileItems.getNearest((int[])nArray12))) {
                                int[] nArray13 = new int[lIIlllIIll[5]];
                                nArray13[w.lIIlllIIll[6]] = lIIlllIIll[46];
                                TileItems.getNearest((int[])nArray13).interact(lIIlllIIlI[lIIlllIIll[47]]);
                                Time.sleepTicks((int)lIIlllIIll[5]);

                            }
                        }
                        int[] nArray14 = new int[lIIlllIIll[5]];
                        nArray14[w.lIIlllIIll[6]] = lIIlllIIll[46];
                        if (w.lIIIIlIIIlllI(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                            int[] nArray15 = new int[lIIlllIIll[5]];
                            nArray15[w.lIIlllIIll[6]] = lIIlllIIll[25];
                            if (w.lIIIIlIIIlllI(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                                int[] nArray16 = new int[lIIlllIIll[5]];
                                nArray16[w.lIIlllIIll[6]] = lIIlllIIll[25];
                                if (w.lIIIIlIIIllll(Equipment.contains((int[])nArray16) ? 1 : 0)) {
                                    int[] nArray17 = new int[lIIlllIIll[5]];
                                    nArray17[w.lIIlllIIll[6]] = lIIlllIIll[25];
                                    Inventory.getFirst((int[])nArray17).interact(lIIlllIIlI[lIIlllIIll[48]]);
                                    Time.sleepTicks((int)lIIlllIIll[5]);

                                }
                            }
                            if (w.lIIIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(dh), lIIlllIIll[18])) {
                                AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[49]];
                                Movement.walkTo((WorldPoint)dh);

                                Time.sleepTicks((int)lIIlllIIll[5]);

                            }
                            if (w.lIIIIlIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(dh), lIIlllIIll[18])) {
                                AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[50]];
                                if (w.lIIIIlIIlIIll(Players.getLocal().getInteracting())) {
                                    String[] stringArray = new String[lIIlllIIll[5]];
                                    stringArray[w.lIIlllIIll[6]] = lIIlllIIlI[lIIlllIIll[41]];
                                    NPCs.getNearest((String[])stringArray).interact(lIIlllIIlI[lIIlllIIll[51]]);
                                    Time.sleepTicks((int)lIIlllIIll[1]);

                                }
                            }
                        }
                        int[] nArray18 = new int[lIIlllIIll[5]];
                        nArray18[w.lIIlllIIll[6]] = lIIlllIIll[52];
                        if (!w.lIIIIlIIIlllI(Inventory.contains((int[])nArray18) ? 1 : 0)) break block50;
                        var2 = new WorldPoint(lIIlllIIll[53], lIIlllIIll[54], lIIlllIIll[6]);
                        if (!w.lIIIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(de), lIIlllIIll[9])) break block56;
                        String[] stringArray = new String[lIIlllIIll[5]];
                        stringArray[w.lIIlllIIll[6]] = lIIlllIIlI[lIIlllIIll[55]];
                        if (!w.lIIIIlIIlIIII(NPCs.getNearest((String[])stringArray))) break block57;
                    }
                    if (!w.lIIIIlIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var2), lIIlllIIll[41])) break block58;
                }
                AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[56]];
                x.bi();
            }
            String[] stringArray = new String[lIIlllIIll[5]];
            stringArray[w.lIIlllIIll[6]] = lIIlllIIlI[lIIlllIIll[57]];
            if (w.lIIIIlIIlIIII(NPCs.getNearest((String[])stringArray))) {
                if (w.lIIIIlIIIllll(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[58]];
                    if (w.lIIIIlIIIlIll(ck, lIIlllIIll[5])) {
                        U.ls += lIIlllIIll[5];
                        U.o(AccBuilderRogues.m);
                        ck += lIIlllIIll[5];
                        U.ls = lIIlllIIll[6];
                        cl = lIIlllIIll[6];
                    }
                    int[] nArray = new int[lIIlllIIll[5]];
                    nArray[w.lIIlllIIll[6]] = lIIlllIIll[52];
                    String[] stringArray3 = new String[lIIlllIIll[5]];
                    stringArray3[w.lIIlllIIll[6]] = lIIlllIIlI[lIIlllIIll[59]];
                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray3));
                    Time.sleepTicks((int)lIIlllIIll[5]);

                }
                g.a(bR);
            }
        }
    }

    private static boolean lIIIIlIIlIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIIlIIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void af() {
        d var3;
        Object var4;
        block27: {
            block26: {
                block25: {
                    block24: {
                        block23: {
                            block22: {
                                block21: {
                                    block20: {
                                        int[] nArray = new int[lIIlllIIll[5]];
                                        nArray[w.lIIlllIIll[6]] = lIIlllIIll[11];
                                        if (!w.lIIIIlIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                        int[] nArray2 = new int[lIIlllIIll[5]];
                                        nArray2[w.lIIlllIIll[6]] = lIIlllIIll[11];
                                        if (!w.lIIIIlIIIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) break block21;
                                        int[] nArray3 = new int[lIIlllIIll[5]];
                                        nArray3[w.lIIlllIIll[6]] = lIIlllIIll[11];
                                        if (!w.lIIIIlIIIlIll(Bank.getFirst((int[])nArray3).getQuantity(), lIIlllIIll[3])) break block21;
                                    }
                                    var4 = new DHelper(lIIlllIIll[11], lIIlllIIll[3], i.bq);
                                    bv.add((DHelper) ar4);

                                }
                                int[] nArray = new int[lIIlllIIll[5]];
                                nArray[w.lIIlllIIll[6]] = lIIlllIIll[25];
                                if (w.lIIIIlIIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    var4 = new DHelper(lIIlllIIll[25], lIIlllIIll[5], lIIlllIIll[60]);
                                    bv.add((DHelper) ar4);

                                }
                                int[] nArray4 = new int[lIIlllIIll[5]];
                                nArray4[w.lIIlllIIll[6]] = lIIlllIIll[22];
                                if (w.lIIIIlIIIllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    var4 = new DHelper(lIIlllIIll[22], lIIlllIIll[5], lIIlllIIll[60]);
                                    bv.add((DHelper) ar4);

                                }
                                int[] nArray5 = new int[lIIlllIIll[5]];
                                nArray5[w.lIIlllIIll[6]] = lIIlllIIll[10];
                                if (!w.lIIIIlIIIlllI(Bank.contains((int[])nArray5) ? 1 : 0)) break block22;
                                int[] nArray6 = new int[lIIlllIIll[5]];
                                nArray6[w.lIIlllIIll[6]] = lIIlllIIll[10];
                                if (!w.lIIIIlIIIlllI(Bank.contains((int[])nArray6) ? 1 : 0)) break block23;
                                int[] nArray7 = new int[lIIlllIIll[5]];
                                nArray7[w.lIIlllIIll[6]] = lIIlllIIll[10];
                                if (!w.lIIIIlIIIlIll(Bank.getFirst((int[])nArray7).getQuantity(), lIIlllIIll[9])) break block23;
                            }
                            var4 = new DHelper(lIIlllIIll[10], lIIlllIIll[9], lIIlllIIll[61]);
                            bv.add((DHelper) ar4);

                        }
                        int[] nArray = new int[lIIlllIIll[5]];
                        nArray[w.lIIlllIIll[6]] = lIIlllIIll[19];
                        if (w.lIIIIlIIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            var4 = new DHelper(lIIlllIIll[19], lIIlllIIll[5], lIIlllIIll[60]);
                            bv.add((DHelper) ar4);

                        }
                        int[] nArray8 = new int[lIIlllIIll[5]];
                        nArray8[w.lIIlllIIll[6]] = lIIlllIIll[17];
                        if (w.lIIIIlIIIllll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            var4 = new DHelper(lIIlllIIll[17], lIIlllIIll[5], lIIlllIIll[60]);
                            bv.add((DHelper) ar4);

                        }
                        int[] nArray9 = new int[lIIlllIIll[5]];
                        nArray9[w.lIIlllIIll[6]] = lIIlllIIll[15];
                        if (w.lIIIIlIIIllll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                            var4 = new DHelper(lIIlllIIll[15], lIIlllIIll[5], lIIlllIIll[60]);
                            bv.add((DHelper) ar4);

                        }
                        int[] nArray10 = new int[lIIlllIIll[5]];
                        nArray10[w.lIIlllIIll[6]] = lIIlllIIll[16];
                        if (w.lIIIIlIIIllll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            var4 = new DHelper(lIIlllIIll[16], lIIlllIIll[5], lIIlllIIll[60]);
                            bv.add((DHelper) ar4);

                        }
                        int[] nArray11 = new int[lIIlllIIll[5]];
                        nArray11[w.lIIlllIIll[6]] = lIIlllIIll[14];
                        if (!w.lIIIIlIIIlllI(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                        int[] nArray12 = new int[lIIlllIIll[5]];
                        nArray12[w.lIIlllIIll[6]] = lIIlllIIll[14];
                        if (!w.lIIIIlIIIlllI(Bank.contains((int[])nArray12) ? 1 : 0)) break block25;
                        int[] nArray13 = new int[lIIlllIIll[5]];
                        nArray13[w.lIIlllIIll[6]] = lIIlllIIll[14];
                        if (!w.lIIIIlIIIlIll(Bank.getFirst((int[])nArray13).getQuantity(), lIIlllIIll[3])) break block25;
                    }
                    var4 = new DHelper(lIIlllIIll[14], lIIlllIIll[4], lIIlllIIll[62]);
                    bv.add((DHelper) ar4);

                }
                int[] nArray = new int[lIIlllIIll[5]];
                nArray[w.lIIlllIIll[6]] = lIIlllIIll[12];
                if (!w.lIIIIlIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                int[] nArray14 = new int[lIIlllIIll[5]];
                nArray14[w.lIIlllIIll[6]] = lIIlllIIll[12];
                if (!w.lIIIIlIIIlllI(Bank.contains((int[])nArray14) ? 1 : 0)) break block27;
                int[] nArray15 = new int[lIIlllIIll[5]];
                nArray15[w.lIIlllIIll[6]] = lIIlllIIll[12];
                if (!w.lIIIIlIIIlIll(Bank.getFirst((int[])nArray15).getQuantity(), lIIlllIIll[4])) break block27;
            }
            var4 = new DHelper(lIIlllIIll[12], lIIlllIIll[4], lIIlllIIll[62]);
            bv.add((DHelper) ar4);

        }
        if (w.lIIIIlIIIllll(Bank.contains((Predicate)(var4 = item -> item.getName().toLowerCase().contains(lIIlllIIlI[lIIlllIIll[67]]))) ? 1 : 0)) {
            var3 = new DHelper(lIIlllIIll[63], lIIlllIIll[3], lIIlllIIll[64]);
            bv.add(var3);

        }
        int[] nArray = new int[lIIlllIIll[5]];
        nArray[w.lIIlllIIll[6]] = lIIlllIIll[13];
        if (w.lIIIIlIIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            var3 = new DHelper(lIIlllIIll[13], lIIlllIIll[42], lIIlllIIll[62]);
            bv.add(var3);

        }
    }

    private static boolean lIIIIlIIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIlIIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean S() {
        return lIIlllIIll[6];
    }

    @Override
    public String U() {
        return lIIlllIIlI[lIIlllIIll[66]];
    }

    private static boolean lIIIIlIIlIIll(Object object) {
        return object == null;
    }

}

