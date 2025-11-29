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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.B;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.J;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
import gg.squire.account.AccBuilderGWD;
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

public class I
implements ab {
    private static /* synthetic */ int[] lIIIIlIIll;
    static /* synthetic */ WorldPoint fH;
    public static /* synthetic */ List<d> bx;
    static /* synthetic */ boolean dl;
    static /* synthetic */ int dk;
    static /* synthetic */ String[] cG;
    static /* synthetic */ WorldPoint fI;
    static /* synthetic */ WorldPoint fG;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ int fK;
    static /* synthetic */ WorldPoint fJ;
    private static /* synthetic */ String[] lIIIIlIIlI;

    private static String lllIIIIIlIII(String llllIIlIlIll, String llllIIlIllII) {
        try {
            SecretKeySpec llllIIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIIlIllll = Cipher.getInstance("Blowfish");
            llllIIlIllll.init(lIIIIlIIll[8], llllIIllIIII);
            return new String(llllIIlIllll.doFinal(Base64.getDecoder().decode(llllIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIlIlllI) {
            llllIIlIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIlIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIIIIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIIIIlIllI(int n2, int n3) {
        return n2 != n3;
    }

    static {
        I.lllIIIIIllII();
        I.lllIIIIIlIll();
        bx = new ArrayList<d>();
        fG = new WorldPoint(lIIIIlIIll[68], lIIIIlIIll[69], lIIIIlIIll[6]);
        fH = new WorldPoint(lIIIIlIIll[70], lIIIIlIIll[71], lIIIIlIIll[6]);
        fI = new WorldPoint(lIIIIlIIll[72], lIIIIlIIll[73], lIIIIlIIll[6]);
        fJ = new WorldPoint(lIIIIlIIll[74], lIIIIlIIll[75], lIIIIlIIll[6]);
        String[] stringArray = new String[lIIIIlIIll[1]];
        stringArray[I.lIIIIlIIll[6]] = lIIIIlIIlI[lIIIIlIIll[76]];
        stringArray[I.lIIIIlIIll[5]] = lIIIIlIIlI[lIIIIlIIll[42]];
        stringArray[I.lIIIIlIIll[8]] = lIIIIlIIlI[lIIIIlIIll[77]];
        cG = stringArray;
        fK = lIIIIlIIll[78];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        int[] nArray = new int[lIIIIlIIll[5]];
        nArray[I.lIIIIlIIll[6]] = lIIIIlIIll[25];
        if (I.lllIIIIlIIll(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIIIIlIIll[5]];
            nArray2[I.lIIIIlIIll[6]] = lIIIIlIIll[16];
            if (I.lllIIIIlIIll(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIIIIlIIll[5]];
                nArray3[I.lIIIIlIIll[6]] = lIIIIlIIll[17];
                if (I.lllIIIIlIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lIIIIlIIll[5]];
                    nArray4[I.lIIIIlIIll[6]] = lIIIIlIIll[19];
                    if (I.lllIIIIlIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lIIIIlIIll[5]];
                        nArray5[I.lIIIIlIIll[6]] = lIIIIlIIll[10];
                        if (I.lllIIIIlIIII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[lIIIIlIIll[5]];
                            nArray6[I.lIIIIlIIll[6]] = lIIIIlIIll[22];
                            if (I.lllIIIIlIIII(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                int[] nArray7 = new int[lIIIIlIIll[5]];
                                nArray7[I.lIIIIlIIll[6]] = lIIIIlIIll[26];
                                if (I.lllIIIIlIIII(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                    n2 = lIIIIlIIll[5];
                                    0;
                                    if (((0x3B ^ 0x14) & ~(0x5C ^ 0x73)) == 0) return n2 != 0;
                                    return ((0x94 ^ 0xB7) & ~(8 ^ 0x2B)) != 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIIlIIll[6];
        return n2 != 0;
    }

    private static boolean lllIIIIlIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIIlIlIl(Object object) {
        return object == null;
    }

    private static boolean lllIIIIlIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllIIIIlIIlI(Object object) {
        return object != null;
    }

    private static boolean lllIIIIlIlII(int n2, int n3) {
        return n2 > n3;
    }

    public static void cb() {
        block50: {
            block58: {
                block57: {
                    BankLocation llllIllIIIII;
                    block56: {
                        block51: {
                            block55: {
                                block53: {
                                    block54: {
                                        block52: {
                                            if (I.lllIIIIIllIl(e.j(lIIIIlIIll[0]), lIIIIlIIll[1])) {
                                                J.cd();
                                            }
                                            if (I.lllIIIIIlllI(e.j(lIIIIlIIll[0]), lIIIIlIIll[1]) && I.lllIIIIIllIl(e.j(lIIIIlIIll[2]), lIIIIlIIll[3])) {
                                                B.bs();
                                            }
                                            if (!I.lllIIIIIlllI(Skills.getLevel((Skill)Skill.COOKING), lIIIIlIIll[4]) || !I.lllIIIIIlllI(e.j(lIIIIlIIll[0]), lIIIIlIIll[1]) || !I.lllIIIIIllll(e.j(lIIIIlIIll[2]), lIIIIlIIll[3])) break block50;
                                            if (I.lllIIIIlIIII(bv ? 1 : 0)) {
                                                b.a(bx);
                                                if (I.lllIIIIIllIl(bx.size(), lIIIIlIIll[5])) {
                                                    System.out.println(lIIIIlIIlI[lIIIIlIIll[6]]);
                                                    bv = lIIIIlIIll[6];
                                                }
                                            }
                                            if (!I.lllIIIIlIIIl(bv ? 1 : 0)) break block50;
                                            if (!I.lllIIIIlIIIl(I.an() ? 1 : 0) || !I.lllIIIIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) break block51;
                                            llllIllIIIII = BankLocation.getNearest();
                                            if (I.lllIIIIlIIlI(llllIllIIIII) && I.lllIIIIlIIIl(llllIllIIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[5]];
                                                a.a(llllIllIIIII);
                                            }
                                            if (!I.lllIIIIlIIlI(llllIllIIIII) || !I.lllIIIIlIIII(llllIllIIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block51;
                                            if (I.lllIIIIlIIIl(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIlIIll[7]);
                                                0;
                                            }
                                            if (!I.lllIIIIlIIII(Bank.isOpen() ? 1 : 0)) break block51;
                                            AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[8]];
                                            if (I.lllIIIIlIIll(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIIIlIIll[9]);
                                                0;
                                            }
                                            if (I.lllIIIIlIIll(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIIIlIIll[8]);
                                                0;
                                            }
                                            int[] nArray = new int[lIIIIlIIll[5]];
                                            nArray[I.lIIIIlIIll[6]] = lIIIIlIIll[10];
                                            if (!I.lllIIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block52;
                                            int[] nArray2 = new int[lIIIIlIIll[5]];
                                            nArray2[I.lIIIIlIIll[6]] = lIIIIlIIll[10];
                                            if (!I.lllIIIIIlllI(Bank.getFirst((int[])nArray2).getQuantity(), lIIIIlIIll[9])) break block53;
                                        }
                                        int[] nArray = new int[lIIIIlIIll[5]];
                                        nArray[I.lIIIIlIIll[6]] = lIIIIlIIll[11];
                                        if (!I.lllIIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block54;
                                        int[] nArray3 = new int[lIIIIlIIll[5]];
                                        nArray3[I.lIIIIlIIll[6]] = lIIIIlIIll[11];
                                        if (!I.lllIIIIIlllI(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIlIIll[3])) break block53;
                                    }
                                    int[] nArray = new int[lIIIIlIIll[5]];
                                    nArray[I.lIIIIlIIll[6]] = lIIIIlIIll[12];
                                    if (!I.lllIIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block55;
                                    int[] nArray4 = new int[lIIIIlIIll[5]];
                                    nArray4[I.lIIIIlIIll[6]] = lIIIIlIIll[12];
                                    if (!I.lllIIIIIllIl(Bank.getFirst((int[])nArray4).getQuantity(), lIIIIlIIll[4])) break block55;
                                }
                                I.Q();
                                System.out.println(lIIIIlIIlI[lIIIIlIIll[1]]);
                                bv = lIIIIlIIll[5];
                                return;
                            }
                            int[] nArray = new int[lIIIIlIIll[2]];
                            nArray[I.lIIIIlIIll[6]] = lIIIIlIIll[13];
                            nArray[I.lIIIIlIIll[5]] = lIIIIlIIll[14];
                            nArray[I.lIIIIlIIll[8]] = lIIIIlIIll[12];
                            nArray[I.lIIIIlIIll[1]] = lIIIIlIIll[15];
                            nArray[I.lIIIIlIIll[9]] = lIIIIlIIll[16];
                            nArray[I.lIIIIlIIll[3]] = lIIIIlIIll[17];
                            nArray[I.lIIIIlIIll[18]] = lIIIIlIIll[19];
                            nArray[I.lIIIIlIIll[20]] = lIIIIlIIll[10];
                            nArray[I.lIIIIlIIll[21]] = lIIIIlIIll[22];
                            nArray[I.lIIIIlIIll[23]] = lIIIIlIIll[24];
                            nArray[I.lIIIIlIIll[4]] = lIIIIlIIll[25];
                            if (I.lllIIIIlIIIl(e.d(nArray) ? 1 : 0)) {
                                I.Q();
                                System.out.println(lIIIIlIIlI[lIIIIlIIll[9]]);
                                bv = lIIIIlIIll[5];
                                return;
                            }
                            int[] nArray5 = new int[lIIIIlIIll[2]];
                            nArray5[I.lIIIIlIIll[6]] = lIIIIlIIll[13];
                            nArray5[I.lIIIIlIIll[5]] = lIIIIlIIll[14];
                            nArray5[I.lIIIIlIIll[8]] = lIIIIlIIll[12];
                            nArray5[I.lIIIIlIIll[1]] = lIIIIlIIll[15];
                            nArray5[I.lIIIIlIIll[9]] = lIIIIlIIll[16];
                            nArray5[I.lIIIIlIIll[3]] = lIIIIlIIll[17];
                            nArray5[I.lIIIIlIIll[18]] = lIIIIlIIll[19];
                            nArray5[I.lIIIIlIIll[20]] = lIIIIlIIll[10];
                            nArray5[I.lIIIIlIIll[21]] = lIIIIlIIll[22];
                            nArray5[I.lIIIIlIIll[23]] = lIIIIlIIll[24];
                            nArray5[I.lIIIIlIIll[4]] = lIIIIlIIll[25];
                            if (I.lllIIIIlIIII(e.d(nArray5) ? 1 : 0)) {
                                a.a(lIIIIlIIll[13], lIIIIlIIll[4]);
                                a.a(lIIIIlIIll[14], lIIIIlIIll[4]);
                                a.a(lIIIIlIIll[12], lIIIIlIIll[4]);
                                a.a(lIIIIlIIll[15], lIIIIlIIll[5]);
                                a.a(lIIIIlIIll[16], lIIIIlIIll[5]);
                                a.a(lIIIIlIIll[17], lIIIIlIIll[5]);
                                a.a(lIIIIlIIll[19], lIIIIlIIll[5]);
                                a.a(lIIIIlIIll[10], lIIIIlIIll[9]);
                                a.a(lIIIIlIIll[22], lIIIIlIIll[5]);
                                a.a(lIIIIlIIll[25], lIIIIlIIll[5]);
                                a.a(lIIIIlIIll[24], lIIIIlIIll[3]);
                                a.a(lIIIIlIIll[11], lIIIIlIIll[8]);
                                a.a(lIIIIlIIll[26], lIIIIlIIll[7]);
                            }
                        }
                        if (I.lllIIIIlIIII(Inventory.contains((int[])f.bc) ? 1 : 0) && I.lllIIIIIllIl(Movement.getRunEnergy(), lIIIIlIIll[27])) {
                            Inventory.getFirst((int[])f.bc).interact(lIIIIlIIlI[lIIIIlIIll[3]]);
                            Time.sleepTicks((int)lIIIIlIIll[5]);
                            0;
                        }
                        if (I.lllIIIIlIIII(I.an() ? 1 : 0) && I.lllIIIIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
                            if (I.lllIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fG), lIIIIlIIll[9])) {
                                String[] stringArray = new String[lIIIIlIIll[5]];
                                stringArray[I.lIIIIlIIll[6]] = lIIIIlIIlI[lIIIIlIIll[18]];
                                if (I.lllIIIIlIlIl(NPCs.getNearest((String[])stringArray))) {
                                    AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[20]];
                                    J.ce();
                                }
                            }
                            String[] stringArray = new String[lIIIIlIIll[5]];
                            stringArray[I.lIIIIlIIll[6]] = lIIIIlIIlI[lIIIIlIIll[21]];
                            if (I.lllIIIIlIIlI(NPCs.getNearest((String[])stringArray))) {
                                if (I.lllIIIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray2 = new String[lIIIIlIIll[5]];
                                    stringArray2[I.lIIIIlIIll[6]] = lIIIIlIIlI[lIIIIlIIll[23]];
                                    TileObjects.getNearest((String[])stringArray2).interact(lIIIIlIIlI[lIIIIlIIll[4]]);
                                    Time.sleepTicks((int)lIIIIlIIll[5]);
                                    0;
                                }
                                g.a(cG);
                            }
                        }
                        if (I.lllIIIIIllll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIlIIll[4])) {
                            if (I.lllIIIIlIllI(Vars.getBit((int)lIIIIlIIll[28]), lIIIIlIIll[5])) {
                                if (I.lllIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fH), lIIIIlIIll[20])) {
                                    AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[2]];
                                    Movement.walkTo((WorldPoint)fH);
                                    0;
                                    Time.sleepTicks((int)lIIIIlIIll[5]);
                                    0;
                                }
                                if (I.lllIIIIlIlll(Players.getLocal().getWorldLocation().distanceTo(fH), lIIIIlIIll[20])) {
                                    AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[29]];
                                    g.a(lIIIIlIIlI[lIIIIlIIll[30]], cG);
                                }
                            }
                            if (I.lllIIIIIllll(Vars.getBit((int)lIIIIlIIll[28]), lIIIIlIIll[5])) {
                                int[] nArray = new int[lIIIIlIIll[5]];
                                nArray[I.lIIIIlIIll[6]] = lIIIIlIIll[10];
                                if (I.lllIIIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray6 = new int[lIIIIlIIll[5]];
                                    nArray6[I.lIIIIlIIll[6]] = lIIIIlIIll[26];
                                    int[] nArray7 = new int[lIIIIlIIll[5]];
                                    nArray7[I.lIIIIlIIll[6]] = lIIIIlIIll[10];
                                    Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((int[])nArray7));
                                    Time.sleepTicks((int)lIIIIlIIll[5]);
                                    0;
                                }
                                int[] nArray8 = new int[lIIIIlIIll[5]];
                                nArray8[I.lIIIIlIIll[6]] = lIIIIlIIll[10];
                                if (I.lllIIIIlIIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    if (I.lllIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fI), lIIIIlIIll[20])) {
                                        AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[31]];
                                        Movement.walkTo((WorldPoint)fI);
                                        0;
                                        Time.sleepTicks((int)lIIIIlIIll[5]);
                                        0;
                                    }
                                    if (I.lllIIIIlIlll(Players.getLocal().getWorldLocation().distanceTo(fI), lIIIIlIIll[20])) {
                                        AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[32]];
                                        g.a(lIIIIlIIlI[lIIIIlIIll[33]], cG);
                                    }
                                }
                            }
                        }
                        if (I.lllIIIIIllll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIlIIll[34])) {
                            if (I.lllIIIIlIllI(Vars.getBit((int)lIIIIlIIll[35]), lIIIIlIIll[9])) {
                                dk = lIIIIlIIll[6];
                                if (I.lllIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fI), lIIIIlIIll[20])) {
                                    AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[36]];
                                    Movement.walkTo((WorldPoint)fI);
                                    0;
                                    Time.sleepTicks((int)lIIIIlIIll[5]);
                                    0;
                                }
                                if (I.lllIIIIlIlll(Players.getLocal().getWorldLocation().distanceTo(fI), lIIIIlIIll[20])) {
                                    AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[37]];
                                    g.a(lIIIIlIIlI[lIIIIlIIll[38]], cG);
                                    g.a(lIIIIlIIlI[lIIIIlIIll[34]], cG);
                                }
                            }
                            if (I.lllIIIIIllll(Vars.getBit((int)lIIIIlIIll[35]), lIIIIlIIll[9])) {
                                AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[39]];
                                g.a(lIIIIlIIlI[lIIIIlIIll[40]], cG);
                            }
                        }
                        if (!I.lllIIIIlIllI(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIlIIll[41]) || I.lllIIIIIllll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIlIIll[42])) {
                            AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[43]];
                            g.a(lIIIIlIIlI[lIIIIlIIll[44]], cG);
                        }
                        if (!I.lllIIIIIllll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIlIIll[27])) break block50;
                        int[] nArray = new int[lIIIIlIIll[5]];
                        nArray[I.lIIIIlIIll[6]] = lIIIIlIIll[22];
                        if (I.lllIIIIlIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray9 = new int[lIIIIlIIll[5]];
                            nArray9[I.lIIIIlIIll[6]] = lIIIIlIIll[22];
                            if (I.lllIIIIlIIII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIIIlIIll[5]];
                                nArray10[I.lIIIIlIIll[6]] = lIIIIlIIll[22];
                                Inventory.getFirst((int[])nArray10).interact(lIIIIlIIlI[lIIIIlIIll[45]]);
                                Time.sleepTicks((int)lIIIIlIIll[5]);
                                0;
                            }
                        }
                        int[] nArray11 = new int[lIIIIlIIll[5]];
                        nArray11[I.lIIIIlIIll[6]] = lIIIIlIIll[22];
                        if (I.lllIIIIlIIII(Equipment.contains((int[])nArray11) ? 1 : 0)) {
                            int[] nArray12 = new int[lIIIIlIIll[5]];
                            nArray12[I.lIIIIlIIll[6]] = lIIIIlIIll[46];
                            if (I.lllIIIIlIIlI(TileItems.getNearest((int[])nArray12))) {
                                int[] nArray13 = new int[lIIIIlIIll[5]];
                                nArray13[I.lIIIIlIIll[6]] = lIIIIlIIll[46];
                                TileItems.getNearest((int[])nArray13).interact(lIIIIlIIlI[lIIIIlIIll[47]]);
                                Time.sleepTicks((int)lIIIIlIIll[5]);
                                0;
                            }
                        }
                        int[] nArray14 = new int[lIIIIlIIll[5]];
                        nArray14[I.lIIIIlIIll[6]] = lIIIIlIIll[46];
                        if (I.lllIIIIlIIII(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                            int[] nArray15 = new int[lIIIIlIIll[5]];
                            nArray15[I.lIIIIlIIll[6]] = lIIIIlIIll[25];
                            if (I.lllIIIIlIIII(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                                int[] nArray16 = new int[lIIIIlIIll[5]];
                                nArray16[I.lIIIIlIIll[6]] = lIIIIlIIll[25];
                                if (I.lllIIIIlIIIl(Equipment.contains((int[])nArray16) ? 1 : 0)) {
                                    int[] nArray17 = new int[lIIIIlIIll[5]];
                                    nArray17[I.lIIIIlIIll[6]] = lIIIIlIIll[25];
                                    Inventory.getFirst((int[])nArray17).interact(lIIIIlIIlI[lIIIIlIIll[48]]);
                                    Time.sleepTicks((int)lIIIIlIIll[5]);
                                    0;
                                }
                            }
                            if (I.lllIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fJ), lIIIIlIIll[18])) {
                                AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[49]];
                                Movement.walkTo((WorldPoint)fJ);
                                0;
                                Time.sleepTicks((int)lIIIIlIIll[5]);
                                0;
                            }
                            if (I.lllIIIIlIlll(Players.getLocal().getWorldLocation().distanceTo(fJ), lIIIIlIIll[18])) {
                                AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[50]];
                                if (I.lllIIIIlIlIl(Players.getLocal().getInteracting())) {
                                    String[] stringArray = new String[lIIIIlIIll[5]];
                                    stringArray[I.lIIIIlIIll[6]] = lIIIIlIIlI[lIIIIlIIll[41]];
                                    NPCs.getNearest((String[])stringArray).interact(lIIIIlIIlI[lIIIIlIIll[51]]);
                                    Time.sleepTicks((int)lIIIIlIIll[1]);
                                    0;
                                }
                            }
                        }
                        int[] nArray18 = new int[lIIIIlIIll[5]];
                        nArray18[I.lIIIIlIIll[6]] = lIIIIlIIll[52];
                        if (!I.lllIIIIlIIII(Inventory.contains((int[])nArray18) ? 1 : 0)) break block50;
                        llllIllIIIII = new WorldPoint(lIIIIlIIll[53], lIIIIlIIll[54], lIIIIlIIll[6]);
                        if (!I.lllIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fG), lIIIIlIIll[9])) break block56;
                        String[] stringArray = new String[lIIIIlIIll[5]];
                        stringArray[I.lIIIIlIIll[6]] = lIIIIlIIlI[lIIIIlIIll[55]];
                        if (!I.lllIIIIlIIlI(NPCs.getNearest((String[])stringArray))) break block57;
                    }
                    if (!I.lllIIIIlIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIII), lIIIIlIIll[41])) break block58;
                }
                AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[56]];
                J.ce();
            }
            String[] stringArray = new String[lIIIIlIIll[5]];
            stringArray[I.lIIIIlIIll[6]] = lIIIIlIIlI[lIIIIlIIll[57]];
            if (I.lllIIIIlIIlI(NPCs.getNearest((String[])stringArray))) {
                if (I.lllIIIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[58]];
                    if (I.lllIIIIIllIl(dk, lIIIIlIIll[5])) {
                        as.oy += lIIIIlIIll[5];
                        as.u(AccBuilderGWD.m);
                        dk += lIIIIlIIll[5];
                        as.oy = lIIIIlIIll[6];
                        dl = lIIIIlIIll[6];
                    }
                    int[] nArray = new int[lIIIIlIIll[5]];
                    nArray[I.lIIIIlIIll[6]] = lIIIIlIIll[52];
                    String[] stringArray3 = new String[lIIIIlIIll[5]];
                    stringArray3[I.lIIIIlIIll[6]] = lIIIIlIIlI[lIIIIlIIll[59]];
                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray3));
                    Time.sleepTicks((int)lIIIIlIIll[5]);
                    0;
                }
                g.a(cG);
            }
        }
    }

    @Override
    public boolean ae() {
        return lIIIIlIIll[6];
    }

    private static boolean lllIIIIllIII(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public int af() {
        try {
            I.cb();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 >= (0xD0 ^ 0xA2 ^ (0x56 ^ 0x20))) {
            return (0x73 ^ 0x75 ^ (0x58 ^ 4)) & (0xD5 ^ 0x8B ^ (0x91 ^ 0x95) ^ -1);
        }
        return lIIIIlIIll[65];
    }

    private static boolean lllIIIIIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static void lllIIIIIlIll() {
        lIIIIlIIlI = new String[lIIIIlIIll[79]];
        I.lIIIIlIIlI[I.lIIIIlIIll[6]] = I."Finished buying items, switching back to quest";
        I.lIIIIlIIlI[I.lIIIIlIIll[5]] = I."Nav to bank";
        I.lIIIIlIIlI[I.lIIIIlIIll[8]] = I."Handling banking";
        I.lIIIIlIIlI[I.lIIIIlIIll[1]] = I."We are missing quest supplies, switching to BUYING";
        I.lIIIIlIIlI[I.lIIIIlIIll[9]] = I."We are missing quest supplies, switching to BUYING";
        I.lIIIIlIIlI[I.lIIIIlIIll[3]] = I."Drink";
        I.lIIIIlIIlI[I.lIIIIlIIll[18]] = I."Aris";
        I.lIIIIlIIlI[I.lIIIIlIIll[20]] = I."Nav to rfd room";
        I.lIIIIlIIlI[I.lIIIIlIIll[21]] = I."Aris";
        I.lIIIIlIIlI[I.lIIIIlIIll[23]] = I."Dwarf";
        I.lIIIIlIIlI[I.lIIIIlIIll[4]] = I."Inspect";
        I.lIIIIlIIlI[I.lIIIIlIIll[2]] = I."Nav to fally pub";
        I.lIIIIlIIlI[I.lIIIIlIIll[29]] = I."Handle chat";
        I.lIIIIlIIlI[I.lIIIIlIIll[30]] = I."Kaylee";
        I.lIIIIlIIlI[I.lIIIIlIIll[31]] = I."Nav to rock cake guy";
        I.lIIIIlIIlI[I.lIIIIlIIll[32]] = I."Handle chat";
        I.lIIIIlIIlI[I.lIIIIlIIll[33]] = I."An old Dwarf";
        I.lIIIIlIIlI[I.lIIIIlIIll[36]] = I."Nav to rock cake guy";
        I.lIIIIlIIlI[I.lIIIIlIIll[37]] = I."Handle chat";
        I.lIIIIlIIlI[I.lIIIIlIIll[38]] = I."An old Dwarf";
        I.lIIIIlIIlI[I.lIIIIlIIll[34]] = I."Rohak";
        I.lIIIIlIIlI[I.lIIIIlIIll[39]] = I."Handle chat";
        I.lIIIIlIIlI[I.lIIIIlIIll[40]] = I."Rohak";
        I.lIIIIlIIlI[I.lIIIIlIIll[43]] = I."Handle chat";
        I.lIIIIlIIlI[I.lIIIIlIIll[44]] = I."Rohak";
        I.lIIIIlIIlI[I.lIIIIlIIll[45]] = I."Wear";
        I.lIIIIlIIlI[I.lIIIIlIIll[47]] = I."Take";
        I.lIIIIlIIlI[I.lIIIIlIIll[48]] = I."Wield";
        I.lIIIIlIIlI[I.lIIIIlIIll[49]] = I."Nav to icefiend";
        I.lIIIIlIIlI[I.lIIIIlIIll[50]] = I."Attack icefiend";
        I.lIIIIlIIlI[I.lIIIIlIIll[41]] = I."Icefiend";
        I.lIIIIlIIlI[I.lIIIIlIIll[51]] = I."Attack";
        I.lIIIIlIIlI[I.lIIIIlIIll[55]] = I."Aris";
        I.lIIIIlIIlI[I.lIIIIlIIll[56]] = I."Nav to rfd room";
        I.lIIIIlIIlI[I.lIIIIlIIll[57]] = I."Aris";
        I.lIIIIlIIlI[I.lIIIIlIIll[58]] = I."Finishing quest";
        I.lIIIIlIIlI[I.lIIIIlIIll[59]] = I."Dwarf";
        I.lIIIIlIIlI[I.lIIIIlIIll[66]] = I."RFD Dwarf quest";
        I.lIIIIlIIlI[I.lIIIIlIIll[67]] = I."ring of wealth (";
        I.lIIIIlIIlI[I.lIIIIlIIll[76]] = I."Yes.";
        I.lIIIIlIIlI[I.lIIIIlIIll[42]] = I."What can you tell me about dwarves and ale?";
        I.lIIIIlIIlI[I.lIIIIlIIll[77]] = I."I could offer you some in return, how about 200 gold?";
    }

    private static void Q() {
        d llllIlIlllII;
        Object llllIlIlllIl;
        block27: {
            block26: {
                block25: {
                    block24: {
                        block23: {
                            block22: {
                                block21: {
                                    block20: {
                                        int[] nArray = new int[lIIIIlIIll[5]];
                                        nArray[I.lIIIIlIIll[6]] = lIIIIlIIll[11];
                                        if (!I.lllIIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                        int[] nArray2 = new int[lIIIIlIIll[5]];
                                        nArray2[I.lIIIIlIIll[6]] = lIIIIlIIll[11];
                                        if (!I.lllIIIIlIIII(Bank.contains((int[])nArray2) ? 1 : 0)) break block21;
                                        int[] nArray3 = new int[lIIIIlIIll[5]];
                                        nArray3[I.lIIIIlIIll[6]] = lIIIIlIIll[11];
                                        if (!I.lllIIIIIllIl(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIlIIll[3])) break block21;
                                    }
                                    llllIlIlllIl = new d(lIIIIlIIll[11], lIIIIlIIll[3], j.ch);
                                    bx.add((d)llllIlIlllIl);
                                    0;
                                }
                                int[] nArray = new int[lIIIIlIIll[5]];
                                nArray[I.lIIIIlIIll[6]] = lIIIIlIIll[25];
                                if (I.lllIIIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    llllIlIlllIl = new d(lIIIIlIIll[25], lIIIIlIIll[5], lIIIIlIIll[60]);
                                    bx.add((d)llllIlIlllIl);
                                    0;
                                }
                                int[] nArray4 = new int[lIIIIlIIll[5]];
                                nArray4[I.lIIIIlIIll[6]] = lIIIIlIIll[22];
                                if (I.lllIIIIlIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    llllIlIlllIl = new d(lIIIIlIIll[22], lIIIIlIIll[5], lIIIIlIIll[60]);
                                    bx.add((d)llllIlIlllIl);
                                    0;
                                }
                                int[] nArray5 = new int[lIIIIlIIll[5]];
                                nArray5[I.lIIIIlIIll[6]] = lIIIIlIIll[10];
                                if (!I.lllIIIIlIIII(Bank.contains((int[])nArray5) ? 1 : 0)) break block22;
                                int[] nArray6 = new int[lIIIIlIIll[5]];
                                nArray6[I.lIIIIlIIll[6]] = lIIIIlIIll[10];
                                if (!I.lllIIIIlIIII(Bank.contains((int[])nArray6) ? 1 : 0)) break block23;
                                int[] nArray7 = new int[lIIIIlIIll[5]];
                                nArray7[I.lIIIIlIIll[6]] = lIIIIlIIll[10];
                                if (!I.lllIIIIIllIl(Bank.getFirst((int[])nArray7).getQuantity(), lIIIIlIIll[9])) break block23;
                            }
                            llllIlIlllIl = new d(lIIIIlIIll[10], lIIIIlIIll[9], lIIIIlIIll[61]);
                            bx.add((d)llllIlIlllIl);
                            0;
                        }
                        int[] nArray = new int[lIIIIlIIll[5]];
                        nArray[I.lIIIIlIIll[6]] = lIIIIlIIll[19];
                        if (I.lllIIIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            llllIlIlllIl = new d(lIIIIlIIll[19], lIIIIlIIll[5], lIIIIlIIll[60]);
                            bx.add((d)llllIlIlllIl);
                            0;
                        }
                        int[] nArray8 = new int[lIIIIlIIll[5]];
                        nArray8[I.lIIIIlIIll[6]] = lIIIIlIIll[17];
                        if (I.lllIIIIlIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            llllIlIlllIl = new d(lIIIIlIIll[17], lIIIIlIIll[5], lIIIIlIIll[60]);
                            bx.add((d)llllIlIlllIl);
                            0;
                        }
                        int[] nArray9 = new int[lIIIIlIIll[5]];
                        nArray9[I.lIIIIlIIll[6]] = lIIIIlIIll[15];
                        if (I.lllIIIIlIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                            llllIlIlllIl = new d(lIIIIlIIll[15], lIIIIlIIll[5], lIIIIlIIll[60]);
                            bx.add((d)llllIlIlllIl);
                            0;
                        }
                        int[] nArray10 = new int[lIIIIlIIll[5]];
                        nArray10[I.lIIIIlIIll[6]] = lIIIIlIIll[16];
                        if (I.lllIIIIlIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            llllIlIlllIl = new d(lIIIIlIIll[16], lIIIIlIIll[5], lIIIIlIIll[60]);
                            bx.add((d)llllIlIlllIl);
                            0;
                        }
                        int[] nArray11 = new int[lIIIIlIIll[5]];
                        nArray11[I.lIIIIlIIll[6]] = lIIIIlIIll[14];
                        if (!I.lllIIIIlIIII(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                        int[] nArray12 = new int[lIIIIlIIll[5]];
                        nArray12[I.lIIIIlIIll[6]] = lIIIIlIIll[14];
                        if (!I.lllIIIIlIIII(Bank.contains((int[])nArray12) ? 1 : 0)) break block25;
                        int[] nArray13 = new int[lIIIIlIIll[5]];
                        nArray13[I.lIIIIlIIll[6]] = lIIIIlIIll[14];
                        if (!I.lllIIIIIllIl(Bank.getFirst((int[])nArray13).getQuantity(), lIIIIlIIll[3])) break block25;
                    }
                    llllIlIlllIl = new d(lIIIIlIIll[14], lIIIIlIIll[4], lIIIIlIIll[62]);
                    bx.add((d)llllIlIlllIl);
                    0;
                }
                int[] nArray = new int[lIIIIlIIll[5]];
                nArray[I.lIIIIlIIll[6]] = lIIIIlIIll[12];
                if (!I.lllIIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                int[] nArray14 = new int[lIIIIlIIll[5]];
                nArray14[I.lIIIIlIIll[6]] = lIIIIlIIll[12];
                if (!I.lllIIIIlIIII(Bank.contains((int[])nArray14) ? 1 : 0)) break block27;
                int[] nArray15 = new int[lIIIIlIIll[5]];
                nArray15[I.lIIIIlIIll[6]] = lIIIIlIIll[12];
                if (!I.lllIIIIIllIl(Bank.getFirst((int[])nArray15).getQuantity(), lIIIIlIIll[4])) break block27;
            }
            llllIlIlllIl = new d(lIIIIlIIll[12], lIIIIlIIll[4], lIIIIlIIll[62]);
            bx.add((d)llllIlIlllIl);
            0;
        }
        if (I.lllIIIIlIIIl(Bank.contains((Predicate)(llllIlIlllIl = item -> item.getName().toLowerCase().contains(lIIIIlIIlI[lIIIIlIIll[67]]))) ? 1 : 0)) {
            llllIlIlllII = new d(lIIIIlIIll[63], lIIIIlIIll[3], lIIIIlIIll[64]);
            bx.add(llllIlIlllII);
            0;
        }
        int[] nArray = new int[lIIIIlIIll[5]];
        nArray[I.lIIIIlIIll[6]] = lIIIIlIIll[13];
        if (I.lllIIIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            llllIlIlllII = new d(lIIIIlIIll[13], lIIIIlIIll[42], lIIIIlIIll[62]);
            bx.add(llllIlIlllII);
            0;
        }
    }

    @Override
    public String ag() {
        return lIIIIlIIlI[lIIIIlIIll[66]];
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (I.lllIIIIllIII(Quests.getState((Quest)Quest.RECIPE_FOR_DISASTER__MOUNTAIN_DWARF), QuestState.FINISHED)) {
            bl = lIIIIlIIll[5];
            0;
            if (-1 == 2) {
                return ((0x10 ^ 0x21 ^ (0x1D ^ 0x4F)) & (0x42 ^ 0x19 ^ (0x74 ^ 0x4C) ^ -1)) != 0;
            }
        } else {
            bl = lIIIIlIIll[6];
        }
        return bl;
    }

    private static boolean lllIIIIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllIIIIIllII() {
        lIIIIlIIll = new int[80];
        I.lIIIIlIIll[0] = -(0xFFFFDF5F & 0x7CF9) & (0xFFFFFFFE & 0x5EFF);
        I.lIIIIlIIll[1] = 3;
        I.lIIIIlIIll[2] = 118 + 126 - 180 + 88 ^ 58 + 98 - 35 + 26;
        I.lIIIIlIIll[3] = 0x38 ^ 0x3D;
        I.lIIIIlIIll[4] = 0x78 ^ 0x72;
        I.lIIIIlIIll[5] = 1;
        I.lIIIIlIIll[6] = (0x42 ^ 0x47 ^ (0x15 ^ 0x21)) & (0x88 ^ 0xAB ^ (0x67 ^ 0x75) ^ -1);
        I.lIIIIlIIll[7] = -(0xFFFFAAE7 & 0x7D3F) & (0xFFFFBBAF & 0x7FFE);
        I.lIIIIlIIll[8] = 2;
        I.lIIIIlIIll[9] = 0x69 ^ 0x6D;
        I.lIIIIlIIll[10] = 0xFFFFCF7F & 0x37F1;
        I.lIIIIlIIll[11] = 0xFFFFF7F5 & 0x395B;
        I.lIIIIlIIll[12] = 0xFFFF9FDF & 0x7F69;
        I.lIIIIlIIll[13] = -(0xFFFFE2FF & 0x3DA9) & (0xFFFFFFFF & 0x3FEF);
        I.lIIIIlIIll[14] = 0xFFFF9FD9 & 0x7F6E;
        I.lIIIIlIIll[15] = 0xFFFF879F & 0x7FE7;
        I.lIIIIlIIll[16] = -(0xE8 ^ 0x8B) & (0xFFFFFFFF & 0x7EF);
        I.lIIIIlIIll[17] = -(0xFFFFF045 & 0x3FFF) & (0xFFFFB7FD & 0x7FDE);
        I.lIIIIlIIll[18] = 0xE ^ 8;
        I.lIIIIlIIll[19] = -(0xD1 ^ 0xAC) & (0xFFFF8FFD & 0x77FF);
        I.lIIIIlIIll[20] = 0x4C ^ 0x4B;
        I.lIIIIlIIll[21] = 6 ^ 0x1B ^ (0x41 ^ 0x54);
        I.lIIIIlIIll[22] = -(0xFFFFF265 & 0x5DDF) & (0xFFFFD5F7 & 0x7E6F);
        I.lIIIIlIIll[23] = 0xC8 ^ 0xBF ^ (0x3C ^ 0x42);
        I.lIIIIlIIll[24] = 0xFFFFEFFF & 0x117B;
        I.lIIIIlIIll[25] = -(0xFFFFEDE1 & 0x5A5F) & (0xFFFFEDF3 & 0x5F7F);
        I.lIIIIlIIll[26] = 0xFFFFEFFB & 0x13E7;
        I.lIIIIlIIll[27] = 0xB7 ^ 0x83 ^ (0xB2 ^ 0xB4);
        I.lIIIIlIIll[28] = 0xFFFFAFF7 & 0x576B;
        I.lIIIIlIIll[29] = 0x37 ^ 0x12 ^ (0x30 ^ 0x19);
        I.lIIIIlIIll[30] = 0x6F ^ 0x62;
        I.lIIIIlIIll[31] = 0x96 ^ 0x98;
        I.lIIIIlIIll[32] = 0x86 ^ 0x89;
        I.lIIIIlIIll[33] = 0xAB ^ 0xBB;
        I.lIIIIlIIll[34] = 0x3B ^ 0x2F;
        I.lIIIIlIIll[35] = 0xFFFFBFFF & 0x47BF;
        I.lIIIIlIIll[36] = 93 + 69 - 49 + 27 ^ 8 + 37 - -34 + 78;
        I.lIIIIlIIll[37] = 0x25 ^ 0x79 ^ (0x2E ^ 0x60);
        I.lIIIIlIIll[38] = 0x68 ^ 0x7B ^ (0x67 ^ 0x60) & ~(2 ^ 5);
        I.lIIIIlIIll[39] = 66 + 111 - 82 + 68 ^ 52 + 5 - -40 + 85;
        I.lIIIIlIIll[40] = 0x3A ^ 0x2A ^ (0x82 ^ 0x84);
        I.lIIIIlIIll[41] = 0x47 ^ 0x59;
        I.lIIIIlIIll[42] = 0xB0 ^ 0x98;
        I.lIIIIlIIll[43] = 0x8D ^ 0x9A;
        I.lIIIIlIIll[44] = 0x15 ^ 0xD;
        I.lIIIIlIIll[45] = 173 + 148 - 165 + 26 ^ 60 + 125 - 54 + 44;
        I.lIIIIlIIll[46] = 0xFFFFDF57 & 0x3DFD;
        I.lIIIIlIIll[47] = 0x2C ^ 0x64 ^ (0x6A ^ 0x38);
        I.lIIIIlIIll[48] = 0x79 ^ 0x69 ^ (0x43 ^ 0x48);
        I.lIIIIlIIll[49] = 0x40 ^ 0x12 ^ (0xF4 ^ 0xBA);
        I.lIIIIlIIll[50] = 8 ^ 0x4C ^ (0xE5 ^ 0xBC);
        I.lIIIIlIIll[51] = 0xB ^ 0x14;
        I.lIIIIlIIll[52] = 0xFFFF9FF7 & 0x7D5E;
        I.lIIIIlIIll[53] = 0xFFFFFEDF & 0xDA6;
        I.lIIIIlIIll[54] = -(0xFFFFB3B4 & 0x6EDF) & (0xFFFFFFFB & 0x2FF7);
        I.lIIIIlIIll[55] = 0xFA ^ 0x94 ^ (0x60 ^ 0x2E);
        I.lIIIIlIIll[56] = 0x5E ^ 0x7F;
        I.lIIIIlIIll[57] = 7 ^ 0x69 ^ (0x2F ^ 0x63);
        I.lIIIIlIIll[58] = 0x70 ^ 0x53;
        I.lIIIIlIIll[59] = 2 + 19 - -83 + 49 ^ 95 + 93 - 161 + 162;
        I.lIIIIlIIll[60] = -(98 + 55 - 99 + 81) & (0xFFFFB3BE & 0x6FEF);
        I.lIIIIlIIll[61] = 0xFFFFFFE6 & 0xFB9;
        I.lIIIIlIIll[62] = -(0xFFFFF96A & 0x7E97) & (0xFFFFFF6D & Short.MAX_VALUE);
        I.lIIIIlIIll[63] = 0xFFFFAEFF & 0x7FCC;
        I.lIIIIlIIll[64] = -(0xFFFF8D1E & 0x7AF5) & (0xFFFFE9FB & 0x7FBF);
        I.lIIIIlIIll[65] = 0x3A ^ 0x5E;
        I.lIIIIlIIll[66] = 50 + 109 - 117 + 108 ^ 112 + 124 - 134 + 77;
        I.lIIIIlIIll[67] = 0x1F ^ 0x48 ^ (0x53 ^ 0x22);
        I.lIIIIlIIll[68] = 0xFFFF8ED7 & 0x7DAF;
        I.lIIIIlIIll[69] = 0xFFFFDFDF & 0x2CB6;
        I.lIIIIlIIll[70] = -(0xFFFFD99B & 0x7677) & (0xFFFFDBFF & 0x7F9F);
        I.lIIIIlIIll[71] = 0xFFFF8DEE & 0x7F3D;
        I.lIIIIlIIll[72] = 0xFFFFCFF5 & 0x3B3B;
        I.lIIIIlIIll[73] = 0xFFFFFEBF & 0x27D5;
        I.lIIIIlIIll[74] = 0xFFFFFBE7 & 0xFD9;
        I.lIIIIlIIll[75] = -(0xFFFFF77F & 0x3AEF) & (0xFFFFFFFF & 0x3FFF);
        I.lIIIIlIIll[76] = 0xBB ^ 0x9C;
        I.lIIIIlIIll[77] = 0x7A ^ 0x53;
        I.lIIIIlIIll[78] = -(0xFFFFF83D & 0x77D7) & (0xFFFFFAFD & 0x77BF);
        I.lIIIIlIIll[79] = 99 + 130 - 13 + 17 ^ 133 + 58 - 16 + 20;
    }

    private static String lllIIIIIlIlI(String llllIlIIlIlI, String llllIlIIlIIl) {
        llllIlIIlIlI = new String(Base64.getDecoder().decode(llllIlIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIlIIllIl = new StringBuilder();
        char[] llllIlIIllII = llllIlIIlIIl.toCharArray();
        int llllIlIIlIll = lIIIIlIIll[6];
        char[] llllIlIIIlIl = llllIlIIlIlI.toCharArray();
        int llllIlIIIlII = llllIlIIIlIl.length;
        int llllIlIIIIll = lIIIIlIIll[6];
        while (I.lllIIIIIllIl(llllIlIIIIll, llllIlIIIlII)) {
            char llllIlIlIIII = llllIlIIIlIl[llllIlIIIIll];
            llllIlIIllIl.append((char)(llllIlIlIIII ^ llllIlIIllII[llllIlIIlIll % llllIlIIllII.length]));
            0;
            ++llllIlIIlIll;
            ++llllIlIIIIll;
            0;
            if ((8 ^ 0xC) > ((0x14 ^ 0x18) & ~(0xB9 ^ 0xB5))) continue;
            return null;
        }
        return String.valueOf(llllIlIIllIl);
    }

    private static String lllIIIIIlIIl(String llllIIlllIII, String llllIIllIlll) {
        try {
            SecretKeySpec llllIIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIllIlll.getBytes(StandardCharsets.UTF_8)), lIIIIlIIll[21]), "DES");
            Cipher llllIIllllII = Cipher.getInstance("DES");
            llllIIllllII.init(lIIIIlIIll[8], llllIIllllIl);
            return new String(llllIIllllII.doFinal(Base64.getDecoder().decode(llllIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIlllIll) {
            llllIIlllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIlIIll(int n2) {
        return n2 > 0;
    }
}

