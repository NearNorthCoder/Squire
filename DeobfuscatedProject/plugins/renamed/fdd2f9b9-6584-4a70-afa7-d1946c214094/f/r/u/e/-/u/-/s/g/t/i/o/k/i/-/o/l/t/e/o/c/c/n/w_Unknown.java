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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.U_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.i;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.t_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.x_Unknown;
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

public class w_Unknown
implements G {
    private static /* synthetic */ int[] lIIlllIIll;
    static /* synthetic */ WorldPoint de;
    static /* synthetic */ WorldPoint dh;
    static /* synthetic */ int ck;
    static /* synthetic */ boolean cl;
    private static /* synthetic */ String[] lIIlllIIlI;
    static /* synthetic */ WorldPoint dg;
    static /* synthetic */ WorldPoint df;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ String[] bR;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int di;

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
                                    0;
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
            0;
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
            0;
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
        w.lIIlllIIlI[w.lIIlllIIll[6]] = w."Finished buying items, switching back to quest";
        w.lIIlllIIlI[w.lIIlllIIll[5]] = w."Nav to bank";
        w.lIIlllIIlI[w.lIIlllIIll[8]] = w."Handling banking";
        w.lIIlllIIlI[w.lIIlllIIll[1]] = w."We are missing quest supplies, switching to BUYING";
        w.lIIlllIIlI[w.lIIlllIIll[9]] = w."We are missing quest supplies, switching to BUYING";
        w.lIIlllIIlI[w.lIIlllIIll[3]] = w."Drink";
        w.lIIlllIIlI[w.lIIlllIIll[18]] = w."Aris";
        w.lIIlllIIlI[w.lIIlllIIll[20]] = w."Nav to rfd room";
        w.lIIlllIIlI[w.lIIlllIIll[21]] = w."Aris";
        w.lIIlllIIlI[w.lIIlllIIll[23]] = w."Dwarf";
        w.lIIlllIIlI[w.lIIlllIIll[4]] = w."Inspect";
        w.lIIlllIIlI[w.lIIlllIIll[2]] = w."Nav to fally pub";
        w.lIIlllIIlI[w.lIIlllIIll[29]] = w."Handle chat";
        w.lIIlllIIlI[w.lIIlllIIll[30]] = w."Kaylee";
        w.lIIlllIIlI[w.lIIlllIIll[31]] = w."Nav to rock cake guy";
        w.lIIlllIIlI[w.lIIlllIIll[32]] = w."Handle chat";
        w.lIIlllIIlI[w.lIIlllIIll[33]] = w."An old Dwarf";
        w.lIIlllIIlI[w.lIIlllIIll[36]] = w."Nav to rock cake guy";
        w.lIIlllIIlI[w.lIIlllIIll[37]] = w."Handle chat";
        w.lIIlllIIlI[w.lIIlllIIll[38]] = w."An old Dwarf";
        w.lIIlllIIlI[w.lIIlllIIll[34]] = w."Rohak";
        w.lIIlllIIlI[w.lIIlllIIll[39]] = w."Handle chat";
        w.lIIlllIIlI[w.lIIlllIIll[40]] = w."Rohak";
        w.lIIlllIIlI[w.lIIlllIIll[43]] = w."Handle chat";
        w.lIIlllIIlI[w.lIIlllIIll[44]] = w."Rohak";
        w.lIIlllIIlI[w.lIIlllIIll[45]] = w."Wear";
        w.lIIlllIIlI[w.lIIlllIIll[47]] = w."Take";
        w.lIIlllIIlI[w.lIIlllIIll[48]] = w."Wield";
        w.lIIlllIIlI[w.lIIlllIIll[49]] = w."Nav to icefiend";
        w.lIIlllIIlI[w.lIIlllIIll[50]] = w."Attack icefiend";
        w.lIIlllIIlI[w.lIIlllIIll[41]] = w."Icefiend";
        w.lIIlllIIlI[w.lIIlllIIll[51]] = w."Attack";
        w.lIIlllIIlI[w.lIIlllIIll[55]] = w."Aris";
        w.lIIlllIIlI[w.lIIlllIIll[56]] = w."Nav to rfd room";
        w.lIIlllIIlI[w.lIIlllIIll[57]] = w."Aris";
        w.lIIlllIIlI[w.lIIlllIIll[58]] = w."Finishing quest";
        w.lIIlllIIlI[w.lIIlllIIll[59]] = w."Dwarf";
        w.lIIlllIIlI[w.lIIlllIIll[66]] = w."RFD Dwarf quest";
        w.lIIlllIIlI[w.lIIlllIIll[67]] = w."ring of wealth (";
        w.lIIlllIIlI[w.lIIlllIIll[76]] = w."Yes.";
        w.lIIlllIIlI[w.lIIlllIIll[42]] = w."What can you tell me about dwarves and ale?";
        w.lIIlllIIlI[w.lIIlllIIll[77]] = w."I could offer you some in return, how about 200 gold?";
    }

    private static String lIIIIlIIIIlll(String var18, String var17) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var2 = var17.toCharArray();
        int var7 = lIIlllIIll[6];
        char[] var1 = var18.toCharArray();
        int var8 = var1.length;
        int var22 = lIIlllIIll[6];
        while (w.lIIIIlIIIlIll(var22, var8)) {
            char var12 = var1[var22];
            var15.append((char)(var12 ^ var2[var7 % var2.length]));
            0;
            ++var7;
            ++var22;
            0;
            if (((0x5B ^ 0x19) & ~(0x5B ^ 0x19)) != 1) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    public static void bf() {
        block50: {
            block58: {
                block57: {
                    BankLocation var20;
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
                                            var20 = BankLocation.getNearest();
                                            if (w.lIIIIlIIlIIII(var20) && w.lIIIIlIIIllll(var20.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[5]];
                                                a.a(var20);
                                            }
                                            if (!w.lIIIIlIIlIIII(var20) || !w.lIIIIlIIIlllI(var20.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block51;
                                            if (w.lIIIIlIIIllll(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlllIIll[7]);
                                                0;
                                            }
                                            if (!w.lIIIIlIIIlllI(Bank.isOpen() ? 1 : 0)) break block51;
                                            AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[8]];
                                            if (w.lIIIIlIIlIIIl(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIlllIIll[9]);
                                                0;
                                            }
                                            if (w.lIIIIlIIlIIIl(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIlllIIll[8]);
                                                0;
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
                            0;
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
                                    0;
                                }
                                g.a(bR);
                            }
                        }
                        if (w.lIIIIlIIIllIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlllIIll[4])) {
                            if (w.lIIIIlIIlIlII(Vars.getBit((int)lIIlllIIll[28]), lIIlllIIll[5])) {
                                if (w.lIIIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(df), lIIlllIIll[20])) {
                                    AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[2]];
                                    Movement.walkTo((WorldPoint)df);
                                    0;
                                    Time.sleepTicks((int)lIIlllIIll[5]);
                                    0;
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
                                    0;
                                }
                                int[] nArray8 = new int[lIIlllIIll[5]];
                                nArray8[w.lIIlllIIll[6]] = lIIlllIIll[10];
                                if (w.lIIIIlIIIllll(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    if (w.lIIIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(dg), lIIlllIIll[20])) {
                                        AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[31]];
                                        Movement.walkTo((WorldPoint)dg);
                                        0;
                                        Time.sleepTicks((int)lIIlllIIll[5]);
                                        0;
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
                                    0;
                                    Time.sleepTicks((int)lIIlllIIll[5]);
                                    0;
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
                                0;
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
                                0;
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
                                    0;
                                }
                            }
                            if (w.lIIIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(dh), lIIlllIIll[18])) {
                                AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[49]];
                                Movement.walkTo((WorldPoint)dh);
                                0;
                                Time.sleepTicks((int)lIIlllIIll[5]);
                                0;
                            }
                            if (w.lIIIIlIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(dh), lIIlllIIll[18])) {
                                AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[50]];
                                if (w.lIIIIlIIlIIll(Players.getLocal().getInteracting())) {
                                    String[] stringArray = new String[lIIlllIIll[5]];
                                    stringArray[w.lIIlllIIll[6]] = lIIlllIIlI[lIIlllIIll[41]];
                                    NPCs.getNearest((String[])stringArray).interact(lIIlllIIlI[lIIlllIIll[51]]);
                                    Time.sleepTicks((int)lIIlllIIll[1]);
                                    0;
                                }
                            }
                        }
                        int[] nArray18 = new int[lIIlllIIll[5]];
                        nArray18[w.lIIlllIIll[6]] = lIIlllIIll[52];
                        if (!w.lIIIIlIIIlllI(Inventory.contains((int[])nArray18) ? 1 : 0)) break block50;
                        var20 = new WorldPoint(lIIlllIIll[53], lIIlllIIll[54], lIIlllIIll[6]);
                        if (!w.lIIIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(de), lIIlllIIll[9])) break block56;
                        String[] stringArray = new String[lIIlllIIll[5]];
                        stringArray[w.lIIlllIIll[6]] = lIIlllIIlI[lIIlllIIll[55]];
                        if (!w.lIIIIlIIlIIII(NPCs.getNearest((String[])stringArray))) break block57;
                    }
                    if (!w.lIIIIlIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var20), lIIlllIIll[41])) break block58;
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
                    0;
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
        d var9;
        Object var6;
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
                                    var6 = new d(lIIlllIIll[11], lIIlllIIll[3], i.bq);
                                    bv.add((d)var6);
                                    0;
                                }
                                int[] nArray = new int[lIIlllIIll[5]];
                                nArray[w.lIIlllIIll[6]] = lIIlllIIll[25];
                                if (w.lIIIIlIIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    var6 = new d(lIIlllIIll[25], lIIlllIIll[5], lIIlllIIll[60]);
                                    bv.add((d)var6);
                                    0;
                                }
                                int[] nArray4 = new int[lIIlllIIll[5]];
                                nArray4[w.lIIlllIIll[6]] = lIIlllIIll[22];
                                if (w.lIIIIlIIIllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    var6 = new d(lIIlllIIll[22], lIIlllIIll[5], lIIlllIIll[60]);
                                    bv.add((d)var6);
                                    0;
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
                            var6 = new d(lIIlllIIll[10], lIIlllIIll[9], lIIlllIIll[61]);
                            bv.add((d)var6);
                            0;
                        }
                        int[] nArray = new int[lIIlllIIll[5]];
                        nArray[w.lIIlllIIll[6]] = lIIlllIIll[19];
                        if (w.lIIIIlIIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            var6 = new d(lIIlllIIll[19], lIIlllIIll[5], lIIlllIIll[60]);
                            bv.add((d)var6);
                            0;
                        }
                        int[] nArray8 = new int[lIIlllIIll[5]];
                        nArray8[w.lIIlllIIll[6]] = lIIlllIIll[17];
                        if (w.lIIIIlIIIllll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            var6 = new d(lIIlllIIll[17], lIIlllIIll[5], lIIlllIIll[60]);
                            bv.add((d)var6);
                            0;
                        }
                        int[] nArray9 = new int[lIIlllIIll[5]];
                        nArray9[w.lIIlllIIll[6]] = lIIlllIIll[15];
                        if (w.lIIIIlIIIllll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                            var6 = new d(lIIlllIIll[15], lIIlllIIll[5], lIIlllIIll[60]);
                            bv.add((d)var6);
                            0;
                        }
                        int[] nArray10 = new int[lIIlllIIll[5]];
                        nArray10[w.lIIlllIIll[6]] = lIIlllIIll[16];
                        if (w.lIIIIlIIIllll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            var6 = new d(lIIlllIIll[16], lIIlllIIll[5], lIIlllIIll[60]);
                            bv.add((d)var6);
                            0;
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
                    var6 = new d(lIIlllIIll[14], lIIlllIIll[4], lIIlllIIll[62]);
                    bv.add((d)var6);
                    0;
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
            var6 = new d(lIIlllIIll[12], lIIlllIIll[4], lIIlllIIll[62]);
            bv.add((d)var6);
            0;
        }
        if (w.lIIIIlIIIllll(Bank.contains((Predicate)(var6 = item -> item.getName().toLowerCase().contains(lIIlllIIlI[lIIlllIIll[67]]))) ? 1 : 0)) {
            var9 = new d(lIIlllIIll[63], lIIlllIIll[3], lIIlllIIll[64]);
            bv.add(var9);
            0;
        }
        int[] nArray = new int[lIIlllIIll[5]];
        nArray[w.lIIlllIIll[6]] = lIIlllIIll[13];
        if (w.lIIIIlIIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            var9 = new d(lIIlllIIll[13], lIIlllIIll[42], lIIlllIIll[62]);
            bv.add(var9);
            0;
        }
    }

    private static boolean lIIIIlIIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIlIIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIIIlIIIlIII(String var3, String var13) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIIlllIIll[8], var19);
            return new String(var14.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean S() {
        return lIIlllIIll[6];
    }

    private static String lIIIIlIIIIllI(String var4, String var5) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIIlllIIll[21]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIIlllIIll[8], var11);
            return new String(var10.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    @Override
    public String U() {
        return lIIlllIIlI[lIIlllIIll[66]];
    }

    private static boolean lIIIIlIIlIIll(Object object) {
        return object == null;
    }

    private static void lIIIIlIIIlIlI() {
        lIIlllIIll = new int[80];
        w.lIIlllIIll[0] = 0xFFFFD7F7 & 0x2AAE;
        w.lIIlllIIll[1] = 3;
        w.lIIlllIIll[2] = 9 ^ 2;
        w.lIIlllIIll[3] = 183 + 174 - 179 + 12 ^ 184 + 23 - 185 + 165;
        w.lIIlllIIll[4] = 0x69 ^ 0x24 ^ (0x36 ^ 0x71);
        w.lIIlllIIll[5] = 1;
        w.lIIlllIIll[6] = (0x97 ^ 0xC5 ^ (0x7E ^ 0x6C)) & (172 + 16 - -5 + 54 ^ 2 + 159 - -13 + 9 ^ -1);
        w.lIIlllIIll[7] = 0xFFFFB3EA & 0x5F9D;
        w.lIIlllIIll[8] = 2;
        w.lIIlllIIll[9] = 0x4D ^ 0x49;
        w.lIIlllIIll[10] = 0xFFFFEFF1 & 0x177F;
        w.lIIlllIIll[11] = 0xFFFFF753 & 0x39FD;
        w.lIIlllIIll[12] = 0xFFFFDFFD & 0x3F4B;
        w.lIIlllIIll[13] = -(0xFFFFE2B9 & 0x7DFF) & (0xFFFFFFFF & Short.MAX_VALUE);
        w.lIIlllIIll[14] = -(0xFFFFEB9E & 0x74F7) & (0xFFFFFFDD & Short.MAX_VALUE);
        w.lIIlllIIll[15] = 0xFFFFB7E7 & 0x4F9F;
        w.lIIlllIIll[16] = 0xFFFF9FBD & 0x67CF;
        w.lIIlllIIll[17] = -(0xFFFFE077 & 0x5F8F) & (0xFFFFD7BF & 0x6FDE);
        w.lIIlllIIll[18] = 67 + 29 - -22 + 67 ^ 149 + 34 - 7 + 15;
        w.lIIlllIIll[19] = -(0xFFFFCBA3 & 0x3C7F) & (0xFFFFCFBB & 0x3FE7);
        w.lIIlllIIll[20] = 0x61 ^ 0x66;
        w.lIIlllIIll[21] = 19 + 1 - -65 + 89 ^ 86 + 157 - 147 + 70;
        w.lIIlllIIll[22] = -(0xFFFFBBDF & 0x5EA9) & (0xFFFFBFAB & 0x5EFF);
        w.lIIlllIIll[23] = 0x51 ^ 0x58;
        w.lIIlllIIll[24] = 0xFFFFD1FF & 0x2F7B;
        w.lIIlllIIll[25] = 0xFFFFA7BB & 0x5D77;
        w.lIIlllIIll[26] = 0xFFFF97E7 & 0x6BFB;
        w.lIIlllIIll[27] = 0x44 ^ 0x76;
        w.lIIlllIIll[28] = -(0xFFFFFAFD & 0x6D1F) & (0xFFFFFFFF & 0x6F7F);
        w.lIIlllIIll[29] = 0x2B ^ 0x7C ^ (0x7E ^ 0x25);
        w.lIIlllIIll[30] = 0x65 ^ 0x68;
        w.lIIlllIIll[31] = 3 ^ 0xD;
        w.lIIlllIIll[32] = 0x1D ^ 0x12;
        w.lIIlllIIll[33] = 28 + 30 - 7 + 137 ^ 91 + 68 - -13 + 0;
        w.lIIlllIIll[34] = 0x31 ^ 0x25;
        w.lIIlllIIll[35] = -(0xFFFFBEC3 & 0x617D) & (0xFFFFAFFF & 0x77FF);
        w.lIIlllIIll[36] = 0xE9 ^ 0x81 ^ (0xDA ^ 0xA3);
        w.lIIlllIIll[37] = 0x75 ^ 0x65 ^ 2;
        w.lIIlllIIll[38] = 0x70 ^ 0x63;
        w.lIIlllIIll[39] = 0x51 ^ 0x44;
        w.lIIlllIIll[40] = 0x3C ^ 0x2A;
        w.lIIlllIIll[41] = 2 ^ (0xB4 ^ 0xA8);
        w.lIIlllIIll[42] = 0xB5 ^ 0x9D;
        w.lIIlllIIll[43] = 0x95 ^ 0xAD ^ (0x46 ^ 0x69);
        w.lIIlllIIll[44] = 3 ^ 0x1B;
        w.lIIlllIIll[45] = 0xD7 ^ 0x98 ^ (0xD8 ^ 0x8E);
        w.lIIlllIIll[46] = -(0x41 ^ 0x4A) & (0xFFFF9F7F & 0x7DDF);
        w.lIIlllIIll[47] = 0xC ^ 0x16;
        w.lIIlllIIll[48] = 0x63 ^ 0x78;
        w.lIIlllIIll[49] = 0x60 ^ 0x52 ^ (0x3A ^ 0x14);
        w.lIIlllIIll[50] = 0x37 ^ 0x2A;
        w.lIIlllIIll[51] = 0x5C ^ 0x43;
        w.lIIlllIIll[52] = 0xFFFF9FFF & 0x7D56;
        w.lIIlllIIll[53] = 0xFFFFFFFF & 0xC86;
        w.lIIlllIIll[54] = 0xFFFF8F7A & 0x7DE5;
        w.lIIlllIIll[55] = 135 + 139 - 185 + 51 ^ 101 + 24 - 73 + 120;
        w.lIIlllIIll[56] = 133 + 61 - 73 + 30 ^ 18 + 145 - -4 + 15;
        w.lIIlllIIll[57] = 0x50 ^ 0x72;
        w.lIIlllIIll[58] = 0x31 ^ 0x12;
        w.lIIlllIIll[59] = 120 + 121 - 114 + 44 ^ 63 + 105 - 131 + 106;
        w.lIIlllIIll[60] = 0xFFFFA7AA & 0x7B7D;
        w.lIIlllIIll[61] = -(0xFFFFD577 & 0x6A9B) & (0xFFFFEFF3 & 0x5FBE);
        w.lIIlllIIll[62] = -(0xFFFFEC94 & 0x537F) & (0xFFFFC7FF & 0x7F7F);
        w.lIIlllIIll[63] = -(0xFFFFF774 & 0x489F) & (0xFFFFEEFF & 0x7FDF);
        w.lIIlllIIll[64] = 0xFFFFE3AA & 0x7DFD;
        w.lIIlllIIll[65] = 0x6F ^ 0xB;
        w.lIIlllIIll[66] = 0x7F ^ 0x5A;
        w.lIIlllIIll[67] = 0xB3 ^ 0x95;
        w.lIIlllIIll[68] = -(0xFFFFFB7B & 0x47B5) & (0xFFFFEFF7 & 0x5FBF);
        w.lIIlllIIll[69] = 0xFFFF9EDF & 0x6DB6;
        w.lIIlllIIll[70] = 0xFFFFDB9F & 0x2FED;
        w.lIIlllIIll[71] = 0xFFFF8FAE & 0x7D7D;
        w.lIIlllIIll[72] = -(0xFFFFDCFB & 0x37C7) & (0xFFFF9FFF & 0x7FF3);
        w.lIIlllIIll[73] = 0xFFFFF6F7 & 0x2F9D;
        w.lIIlllIIll[74] = 0xFFFF9FC7 & 0x6BF9;
        w.lIIlllIIll[75] = -(0xFFFFF727 & 0x4AFF) & (0xFFFFEFB7 & 0x5FFF);
        w.lIIlllIIll[76] = 0xE2 ^ 0xC5;
        w.lIIlllIIll[77] = 0xD ^ 0x24;
        w.lIIlllIIll[78] = 0xFFFF9EAB & 0x63FD;
        w.lIIlllIIll[79] = 0x51 ^ 0x71 ^ (0x77 ^ 0x7D);
    }
}

