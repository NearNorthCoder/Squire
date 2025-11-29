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
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.JHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.ASHelper;
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

public class IHelper
implements ab {
    
    static  WorldPoint fH;
    public static  List<d> bx;
    static  boolean dl;
    static  int dk;
    static  String[] cG;
    static  WorldPoint fI;
    static  WorldPoint fG;
    public static  boolean bv;
    static  int fK;
    static  WorldPoint fJ;

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

                                    if (((0x3B ^ 0x14) & ~(0x5C ^ 0x73)) == 0) return n2 != 0;
                                    return false;
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

                                            }
                                            if (!I.lllIIIIlIIII(Bank.isOpen() ? 1 : 0)) break block51;
                                            AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[8]];
                                            if (I.lllIIIIlIIll(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIIIlIIll[9]);

                                            }
                                            if (I.lllIIIIlIIll(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIIIlIIll[8]);

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

                                }
                                g.a(cG);
                            }
                        }
                        if (I.lllIIIIIllll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIlIIll[4])) {
                            if (I.lllIIIIlIllI(Vars.getBit((int)lIIIIlIIll[28]), lIIIIlIIll[5])) {
                                if (I.lllIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fH), lIIIIlIIll[20])) {
                                    AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[2]];
                                    Movement.walkTo((WorldPoint)fH);

                                    Time.sleepTicks((int)lIIIIlIIll[5]);

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

                                }
                                int[] nArray8 = new int[lIIIIlIIll[5]];
                                nArray8[I.lIIIIlIIll[6]] = lIIIIlIIll[10];
                                if (I.lllIIIIlIIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    if (I.lllIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fI), lIIIIlIIll[20])) {
                                        AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[31]];
                                        Movement.walkTo((WorldPoint)fI);

                                        Time.sleepTicks((int)lIIIIlIIll[5]);

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

                                    Time.sleepTicks((int)lIIIIlIIll[5]);

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

                                }
                            }
                            if (I.lllIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fJ), lIIIIlIIll[18])) {
                                AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[49]];
                                Movement.walkTo((WorldPoint)fJ);

                                Time.sleepTicks((int)lIIIIlIIll[5]);

                            }
                            if (I.lllIIIIlIlll(Players.getLocal().getWorldLocation().distanceTo(fJ), lIIIIlIIll[18])) {
                                AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[50]];
                                if (I.lllIIIIlIlIl(Players.getLocal().getInteracting())) {
                                    String[] stringArray = new String[lIIIIlIIll[5]];
                                    stringArray[I.lIIIIlIIll[6]] = lIIIIlIIlI[lIIIIlIIll[41]];
                                    NPCs.getNearest((String[])stringArray).interact(lIIIIlIIlI[lIIIIlIIll[51]]);
                                    Time.sleepTicks((int)lIIIIlIIll[1]);

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
        I.lIIIIlIIlI[I.lIIIIlIIll[6]] = "Finished buying items, switching back to quest";
        I.lIIIIlIIlI[I.lIIIIlIIll[5]] = "Nav to bank";
        I.lIIIIlIIlI[I.lIIIIlIIll[8]] = "Handling banking";
        I.lIIIIlIIlI[I.lIIIIlIIll[1]] = "We are missing quest supplies, switching to BUYING";
        I.lIIIIlIIlI[I.lIIIIlIIll[9]] = "We are missing quest supplies, switching to BUYING";
        I.lIIIIlIIlI[I.lIIIIlIIll[3]] = "Drink";
        I.lIIIIlIIlI[I.lIIIIlIIll[18]] = "Aris";
        I.lIIIIlIIlI[I.lIIIIlIIll[20]] = "Nav to rfd room";
        I.lIIIIlIIlI[I.lIIIIlIIll[21]] = "Aris";
        I.lIIIIlIIlI[I.lIIIIlIIll[23]] = "Dwarf";
        I.lIIIIlIIlI[I.lIIIIlIIll[4]] = "Inspect";
        I.lIIIIlIIlI[I.lIIIIlIIll[2]] = "Nav to fally pub";
        I.lIIIIlIIlI[I.lIIIIlIIll[29]] = "Handle chat";
        I.lIIIIlIIlI[I.lIIIIlIIll[30]] = "Kaylee";
        I.lIIIIlIIlI[I.lIIIIlIIll[31]] = "Nav to rock cake guy";
        I.lIIIIlIIlI[I.lIIIIlIIll[32]] = "Handle chat";
        I.lIIIIlIIlI[I.lIIIIlIIll[33]] = "An old Dwarf";
        I.lIIIIlIIlI[I.lIIIIlIIll[36]] = "Nav to rock cake guy";
        I.lIIIIlIIlI[I.lIIIIlIIll[37]] = "Handle chat";
        I.lIIIIlIIlI[I.lIIIIlIIll[38]] = "An old Dwarf";
        I.lIIIIlIIlI[I.lIIIIlIIll[34]] = "Rohak";
        I.lIIIIlIIlI[I.lIIIIlIIll[39]] = "Handle chat";
        I.lIIIIlIIlI[I.lIIIIlIIll[40]] = "Rohak";
        I.lIIIIlIIlI[I.lIIIIlIIll[43]] = "Handle chat";
        I.lIIIIlIIlI[I.lIIIIlIIll[44]] = "Rohak";
        I.lIIIIlIIlI[I.lIIIIlIIll[45]] = "Wear";
        I.lIIIIlIIlI[I.lIIIIlIIll[47]] = "Take";
        I.lIIIIlIIlI[I.lIIIIlIIll[48]] = "Wield";
        I.lIIIIlIIlI[I.lIIIIlIIll[49]] = "Nav to icefiend";
        I.lIIIIlIIlI[I.lIIIIlIIll[50]] = "Attack icefiend";
        I.lIIIIlIIlI[I.lIIIIlIIll[41]] = "Icefiend";
        I.lIIIIlIIlI[I.lIIIIlIIll[51]] = "Attack";
        I.lIIIIlIIlI[I.lIIIIlIIll[55]] = "Aris";
        I.lIIIIlIIlI[I.lIIIIlIIll[56]] = "Nav to rfd room";
        I.lIIIIlIIlI[I.lIIIIlIIll[57]] = "Aris";
        I.lIIIIlIIlI[I.lIIIIlIIll[58]] = "Finishing quest";
        I.lIIIIlIIlI[I.lIIIIlIIll[59]] = "Dwarf";
        I.lIIIIlIIlI[I.lIIIIlIIll[66]] = "RFD Dwarf quest";
        I.lIIIIlIIlI[I.lIIIIlIIll[67]] = "ring of wealth (";
        I.lIIIIlIIlI[I.lIIIIlIIll[76]] = "Yes.";
        I.lIIIIlIIlI[I.lIIIIlIIll[42]] = "What can you tell me about dwarves and ale?";
        I.lIIIIlIIlI[I.lIIIIlIIll[77]] = "I could offer you some in return, how about 200 gold?";
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
                                    llllIlIlllIl = new DHelper(lIIIIlIIll[11], lIIIIlIIll[3], j.ch);
                                    bx.add((DHelper) lllIlIlllIl);

                                }
                                int[] nArray = new int[lIIIIlIIll[5]];
                                nArray[I.lIIIIlIIll[6]] = lIIIIlIIll[25];
                                if (I.lllIIIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    llllIlIlllIl = new DHelper(lIIIIlIIll[25], lIIIIlIIll[5], lIIIIlIIll[60]);
                                    bx.add((DHelper) lllIlIlllIl);

                                }
                                int[] nArray4 = new int[lIIIIlIIll[5]];
                                nArray4[I.lIIIIlIIll[6]] = lIIIIlIIll[22];
                                if (I.lllIIIIlIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    llllIlIlllIl = new DHelper(lIIIIlIIll[22], lIIIIlIIll[5], lIIIIlIIll[60]);
                                    bx.add((DHelper) lllIlIlllIl);

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
                            llllIlIlllIl = new DHelper(lIIIIlIIll[10], lIIIIlIIll[9], lIIIIlIIll[61]);
                            bx.add((DHelper) lllIlIlllIl);

                        }
                        int[] nArray = new int[lIIIIlIIll[5]];
                        nArray[I.lIIIIlIIll[6]] = lIIIIlIIll[19];
                        if (I.lllIIIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            llllIlIlllIl = new DHelper(lIIIIlIIll[19], lIIIIlIIll[5], lIIIIlIIll[60]);
                            bx.add((DHelper) lllIlIlllIl);

                        }
                        int[] nArray8 = new int[lIIIIlIIll[5]];
                        nArray8[I.lIIIIlIIll[6]] = lIIIIlIIll[17];
                        if (I.lllIIIIlIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            llllIlIlllIl = new DHelper(lIIIIlIIll[17], lIIIIlIIll[5], lIIIIlIIll[60]);
                            bx.add((DHelper) lllIlIlllIl);

                        }
                        int[] nArray9 = new int[lIIIIlIIll[5]];
                        nArray9[I.lIIIIlIIll[6]] = lIIIIlIIll[15];
                        if (I.lllIIIIlIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                            llllIlIlllIl = new DHelper(lIIIIlIIll[15], lIIIIlIIll[5], lIIIIlIIll[60]);
                            bx.add((DHelper) lllIlIlllIl);

                        }
                        int[] nArray10 = new int[lIIIIlIIll[5]];
                        nArray10[I.lIIIIlIIll[6]] = lIIIIlIIll[16];
                        if (I.lllIIIIlIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            llllIlIlllIl = new DHelper(lIIIIlIIll[16], lIIIIlIIll[5], lIIIIlIIll[60]);
                            bx.add((DHelper) lllIlIlllIl);

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
                    llllIlIlllIl = new DHelper(lIIIIlIIll[14], lIIIIlIIll[4], lIIIIlIIll[62]);
                    bx.add((DHelper) lllIlIlllIl);

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
            llllIlIlllIl = new DHelper(lIIIIlIIll[12], lIIIIlIIll[4], lIIIIlIIll[62]);
            bx.add((DHelper) lllIlIlllIl);

        }
        if (I.lllIIIIlIIIl(Bank.contains((Predicate)(llllIlIlllIl = item -> item.getName().toLowerCase().contains(lIIIIlIIlI[lIIIIlIIll[67]]))) ? 1 : 0)) {
            llllIlIlllII = new DHelper(lIIIIlIIll[63], lIIIIlIIll[3], lIIIIlIIll[64]);
            bx.add(llllIlIlllII);

        }
        int[] nArray = new int[lIIIIlIIll[5]];
        nArray[I.lIIIIlIIll[6]] = lIIIIlIIll[13];
        if (I.lllIIIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            llllIlIlllII = new DHelper(lIIIIlIIll[13], lIIIIlIIll[42], lIIIIlIIll[62]);
            bx.add(llllIlIlllII);

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

        return String.valueOf(llllIlIIllIl);
    }

    private static boolean lllIIIIlIIll(int n2) {
        return n2 > 0;
    }
}

