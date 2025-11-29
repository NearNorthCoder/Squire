/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AIHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AKHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.ANHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

public class CHelper
implements W {
    static  int cl;
    static  int bY;
    static  WorldArea dJ;
    static  WorldArea dH;
    static  WorldArea dI;
    
    static  WorldPoint bX;
    
    public static  boolean bW;
    
    public static  boolean bt;
    public static  List<d> bv;

    private static boolean bw() {
        int n2;
        if (!C.lIlIIIIIIIll(dH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !C.lIlIIIIIIIll(dJ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || C.lIlIIIIIIIIl(dI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            n2 = lIllllllI[0];

            if (3 == 1) {
                return false;
            }
        } else {
            n2 = lIllllllI[1];
        }
        return n2 != 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (C.lIlIIIIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_TEARS_OF_GUTHIX.getId()), lIllllllI[5])) {
            bl = lIllllllI[0];

            if (-(7 ^ 3) > 0) {
                return false;
            }
        } else {
            bl = lIllllllI[1];
        }
        return bl;
    }

    @Override
    public int T() {
        try {
            C.bv();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-(0xAB ^ 0xAF) >= 0) {
            return (0x7B ^ 0x3B) & ~(0xEA ^ 0xAA);
        }
        return lIllllllI[80];
    }

    private static boolean lIlIIIIIlIlI(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(llIIIIIllIllll);
    }

    static {
        C.lIIlllllllll();
        C.lIIllllllllI();
        bv = new ArrayList<d>();
        bX = new WorldPoint(lIllllllI[83], lIllllllI[84], lIllllllI[5]);
        bY = lIllllllI[1];
        dH = new WorldArea(lIllllllI[85], lIllllllI[86], lIllllllI[87], lIllllllI[88], lIllllllI[5]);
        dI = new WorldArea(lIllllllI[85], lIllllllI[86], lIllllllI[87], lIllllllI[88], lIllllllI[0]);
        dJ = new WorldArea(lIllllllI[85], lIllllllI[86], lIllllllI[87], lIllllllI[88], lIllllllI[1]);
        String[] stringArray = new String[lIllllllI[5]];
        stringArray[C.lIllllllI[1]] = lIlllllIl[lIllllllI[89]];
        stringArray[C.lIllllllI[0]] = lIlllllIl[lIllllllI[90]];
        bR = stringArray;
    }

    private static boolean lIlIIIIIIIll(int n2) {
        return n2 == 0;
    }

    private static int lIlIIIIIIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void af() {
        block26: {
            d llIIIIIllllllI;
            block25: {
                block24: {
                    block23: {
                        Object llIIIIIlllllll;
                        block22: {
                            block21: {
                                block20: {
                                    block19: {
                                        int[] nArray = new int[lIllllllI[0]];
                                        nArray[C.lIllllllI[1]] = lIllllllI[10];
                                        if (!C.lIlIIIIIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block19;
                                        int[] nArray2 = new int[lIllllllI[0]];
                                        nArray2[C.lIllllllI[1]] = lIllllllI[10];
                                        if (!C.lIlIIIIIIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                        int[] nArray3 = new int[lIllllllI[0]];
                                        nArray3[C.lIllllllI[1]] = lIllllllI[10];
                                        if (!C.lIlIIIIIIIlI(Bank.getFirst((int[])nArray3).getQuantity(), lIllllllI[11])) break block20;
                                    }
                                    llIIIIIlllllll = new DHelper(lIllllllI[10], lIllllllI[11], lIllllllI[73]);
                                    bv.add((DHelper) lIIIIIlllllll);

                                }
                                int[] nArray = new int[lIllllllI[0]];
                                nArray[C.lIllllllI[1]] = lIllllllI[22];
                                if (!C.lIlIIIIIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block21;
                                int[] nArray4 = new int[lIllllllI[0]];
                                nArray4[C.lIllllllI[1]] = lIllllllI[22];
                                if (!C.lIlIIIIIIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block22;
                                int[] nArray5 = new int[lIllllllI[0]];
                                nArray5[C.lIllllllI[1]] = lIllllllI[22];
                                if (!C.lIlIIIIIIIlI(Bank.getFirst((int[])nArray5).getQuantity(), lIllllllI[11])) break block22;
                            }
                            llIIIIIlllllll = new DHelper(lIllllllI[22], lIllllllI[11], e.c(lIllllllI[74], lIllllllI[75]));
                            bv.add((DHelper) lIIIIIlllllll);

                        }
                        int[] nArray = new int[lIllllllI[0]];
                        nArray[C.lIllllllI[1]] = lIllllllI[18];
                        if (C.lIlIIIIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            llIIIIIlllllll = new DHelper(lIllllllI[18], lIllllllI[0], lIllllllI[76]);
                            bv.add((DHelper) lIIIIIlllllll);

                        }
                        int[] nArray6 = new int[lIllllllI[0]];
                        nArray6[C.lIllllllI[1]] = lIllllllI[7];
                        if (C.lIlIIIIIIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            llIIIIIlllllll = new DHelper(lIllllllI[7], lIllllllI[0], lIllllllI[76]);
                            bv.add((DHelper) lIIIIIlllllll);

                        }
                        int[] nArray7 = new int[lIllllllI[0]];
                        nArray7[C.lIllllllI[1]] = lIllllllI[8];
                        if (C.lIlIIIIIIIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            llIIIIIlllllll = new DHelper(lIllllllI[8], lIllllllI[0], lIllllllI[76]);
                            bv.add((DHelper) lIIIIIlllllll);

                        }
                        int[] nArray8 = new int[lIllllllI[0]];
                        nArray8[C.lIllllllI[1]] = lIllllllI[15];
                        if (C.lIlIIIIIIIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            llIIIIIlllllll = new DHelper(lIllllllI[15], lIllllllI[0], lIllllllI[76]);
                            bv.add((DHelper) lIIIIIlllllll);

                        }
                        int[] nArray9 = new int[lIllllllI[0]];
                        nArray9[C.lIllllllI[1]] = lIllllllI[16];
                        if (C.lIlIIIIIIIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                            llIIIIIlllllll = new DHelper(lIllllllI[16], lIllllllI[0], lIllllllI[76]);
                            bv.add((DHelper) lIIIIIlllllll);

                        }
                        int[] nArray10 = new int[lIllllllI[0]];
                        nArray10[C.lIllllllI[1]] = lIllllllI[14];
                        if (C.lIlIIIIIIIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            llIIIIIlllllll = new DHelper(lIllllllI[14], lIllllllI[0], lIllllllI[76]);
                            bv.add((DHelper) lIIIIIlllllll);

                        }
                        if (C.lIlIIIIIIIll(Bank.contains((Predicate)(llIIIIIlllllll = item -> item.getName().toLowerCase().contains(lIlllllIl[lIllllllI[82]]))) ? 1 : 0)) {
                            llIIIIIllllllI = new DHelper(lIllllllI[77], lIllllllI[17], lIllllllI[78]);
                            bv.add(llIIIIIllllllI);

                        }
                        int[] nArray11 = new int[lIllllllI[0]];
                        nArray11[C.lIllllllI[1]] = lIllllllI[20];
                        if (!C.lIlIIIIIIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block23;
                        int[] nArray12 = new int[lIllllllI[0]];
                        nArray12[C.lIllllllI[1]] = lIllllllI[20];
                        if (!C.lIlIIIIIIIIl(Bank.contains((int[])nArray12) ? 1 : 0)) break block24;
                        int[] nArray13 = new int[lIllllllI[0]];
                        nArray13[C.lIllllllI[1]] = lIllllllI[20];
                        if (!C.lIlIIIIIIIlI(Bank.getFirst((int[])nArray13).getQuantity(), lIllllllI[6])) break block24;
                    }
                    llIIIIIllllllI = new DHelper(lIllllllI[20], lIllllllI[6], i.bq);
                    bv.add(llIIIIIllllllI);

                }
                int[] nArray = new int[lIllllllI[0]];
                nArray[C.lIllllllI[1]] = lIllllllI[13];
                if (!C.lIlIIIIIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block25;
                int[] nArray14 = new int[lIllllllI[0]];
                nArray14[C.lIllllllI[1]] = lIllllllI[13];
                if (!C.lIlIIIIIIIIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block26;
                int[] nArray15 = new int[lIllllllI[0]];
                nArray15[C.lIllllllI[1]] = lIllllllI[13];
                if (!C.lIlIIIIIIIlI(Bank.getFirst((int[])nArray15).getQuantity(), lIllllllI[36])) break block26;
            }
            llIIIIIllllllI = new DHelper(lIllllllI[13], lIllllllI[62], lIllllllI[79]);
            bv.add(llIIIIIllllllI);

        }
    }

    @Override
    public boolean S() {
        return lIllllllI[1];
    }

    private static boolean lIlIIIIIIlll(int n2) {
        return n2 < 0;
    }

    private static boolean lIlIIIIIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIIIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIIIllI(int n2) {
        return n2 > 0;
    }

    public static void bv() {
        block54: {
            BankLocation llIIIIlIIIIlll;
            block55: {
                block57: {
                    block56: {
                        if (C.lIlIIIIIIIIl(bt ? 1 : 0)) {
                            b.a(bv);
                            if (C.lIlIIIIIIIlI(bv.size(), lIllllllI[0])) {
                                System.out.println(lIlllllIl[lIllllllI[1]]);
                                bt = lIllllllI[1];
                            }
                        }
                        if (!C.lIlIIIIIIIll(bt ? 1 : 0)) break block54;
                        if (C.lIlIIIIIIIlI(Skills.getLevel((Skill)Skill.FIREMAKING), lIllllllI[2])) {
                            ai.eb();
                        }
                        if (C.lIlIIIIIIlII(Skills.getLevel((Skill)Skill.FIREMAKING), lIllllllI[2]) && C.lIlIIIIIIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lIllllllI[3])) {
                            ah.dO();
                        }
                        if (C.lIlIIIIIIlII(Skills.getLevel((Skill)Skill.FIREMAKING), lIllllllI[2]) && C.lIlIIIIIIlII(Skills.getLevel((Skill)Skill.CRAFTING), lIllllllI[3]) && C.lIlIIIIIIIlI(Skills.getLevel((Skill)Skill.MINING), lIllllllI[3])) {
                            ak.er();
                        }
                        if (!C.lIlIIIIIIIll(C.ab() ? 1 : 0) || !C.lIlIIIIIIIll(Vars.getBit((int)QuestVarbits.QUEST_TEARS_OF_GUTHIX.getId())) || !C.lIlIIIIIIlII(Skills.getLevel((Skill)Skill.FIREMAKING), lIllllllI[2]) || !C.lIlIIIIIIlII(Skills.getLevel((Skill)Skill.CRAFTING), lIllllllI[3]) || !C.lIlIIIIIIlII(Skills.getLevel((Skill)Skill.MINING), lIllllllI[3])) break block55;
                        llIIIIlIIIIlll = BankLocation.getNearest();
                        if (C.lIlIIIIIIlIl(llIIIIlIIIIlll) && C.lIlIIIIIIIll(llIIIIlIIIIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIlllllIl[lIllllllI[0]];
                            a.a(llIIIIlIIIIlll);
                        }
                        if (!C.lIlIIIIIIlIl(llIIIIlIIIIlll) || !C.lIlIIIIIIIIl(llIIIIlIIIIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block55;
                        if (C.lIlIIIIIIIll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIllllllI[4]);

                        }
                        if (!C.lIlIIIIIIIIl(Bank.isOpen() ? 1 : 0)) break block55;
                        AccBuilderEasyClues.c = lIlllllIl[lIllllllI[5]];
                        if (C.lIlIIIIIIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIllllllI[6]);

                        }
                        if (C.lIlIIIIIIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIllllllI[5]);

                        }
                        int[] nArray = new int[lIllllllI[0]];
                        nArray[C.lIllllllI[1]] = lIllllllI[7];
                        if (!C.lIlIIIIIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block56;
                        int[] nArray2 = new int[lIllllllI[0]];
                        nArray2[C.lIllllllI[1]] = lIllllllI[8];
                        if (!C.lIlIIIIIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) break block57;
                    }
                    C.af();
                    System.out.println(lIlllllIl[lIllllllI[9]]);
                    bt = lIllllllI[0];
                    return;
                }
                int[] nArray = new int[lIllllllI[0]];
                nArray[C.lIllllllI[1]] = lIllllllI[10];
                if (C.lIlIIIIIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[lIllllllI[0]];
                    nArray3[C.lIllllllI[1]] = lIllllllI[10];
                    if (C.lIlIIIIIIIlI(Bank.getFirst((int[])nArray3).getQuantity(), lIllllllI[11])) {
                        C.af();
                        System.out.println(lIlllllIl[lIllllllI[6]]);
                        bt = lIllllllI[0];
                        return;
                    }
                }
                int[] nArray4 = new int[lIllllllI[12]];
                nArray4[C.lIllllllI[1]] = lIllllllI[13];
                nArray4[C.lIllllllI[0]] = lIllllllI[10];
                nArray4[C.lIllllllI[5]] = lIllllllI[14];
                nArray4[C.lIllllllI[9]] = lIllllllI[15];
                nArray4[C.lIllllllI[6]] = lIllllllI[16];
                nArray4[C.lIllllllI[17]] = lIllllllI[18];
                nArray4[C.lIllllllI[19]] = lIllllllI[20];
                nArray4[C.lIllllllI[21]] = lIllllllI[22];
                if (C.lIlIIIIIIIll(e.b(nArray4) ? 1 : 0)) {
                    C.af();
                    System.out.println(lIlllllIl[lIllllllI[17]]);
                    bt = lIllllllI[0];
                    return;
                }
                int[] nArray5 = new int[lIllllllI[12]];
                nArray5[C.lIllllllI[1]] = lIllllllI[13];
                nArray5[C.lIllllllI[0]] = lIllllllI[10];
                nArray5[C.lIllllllI[5]] = lIllllllI[14];
                nArray5[C.lIllllllI[9]] = lIllllllI[15];
                nArray5[C.lIllllllI[6]] = lIllllllI[16];
                nArray5[C.lIllllllI[17]] = lIllllllI[18];
                nArray5[C.lIllllllI[19]] = lIllllllI[20];
                nArray5[C.lIllllllI[21]] = lIllllllI[22];
                if (C.lIlIIIIIIIIl(e.b(nArray5) ? 1 : 0)) {
                    a.a(lIllllllI[20], lIllllllI[9]);
                    a.a(lIllllllI[13], lIllllllI[11]);
                    a.a(lIllllllI[10], lIllllllI[11]);
                    a.a(lIllllllI[14], lIllllllI[0]);
                    a.a(lIllllllI[7], lIllllllI[0]);
                    a.a(lIllllllI[8], lIllllllI[0]);
                    a.a(lIllllllI[15], lIllllllI[0]);
                    a.a(lIllllllI[16], lIllllllI[0]);
                    a.a(lIllllllI[18], lIllllllI[0]);
                    a.a(lIllllllI[22], lIllllllI[17]);
                }
            }
            if (C.lIlIIIIIIIIl(Inventory.contains((int[])f.aV) ? 1 : 0) && C.lIlIIIIIIIlI(Movement.getRunEnergy(), lIllllllI[23])) {
                Inventory.getFirst((int[])f.aV).interact(lIlllllIl[lIllllllI[19]]);
                Time.sleepTicks((int)lIllllllI[0]);

            }
            if (C.lIlIIIIIIIIl(Inventory.contains((int[])f.aS) ? 1 : 0) && C.lIlIIIIIIIlI(Prayers.getPoints(), lIllllllI[24])) {
                Inventory.getFirst((int[])f.aS).interact(lIlllllIl[lIllllllI[21]]);
            }
            if (C.lIlIIIIIIlll(C.lIlIIIIIIIII(e.u(), 60.0))) {
                String[] stringArray = new String[lIllllllI[0]];
                stringArray[C.lIllllllI[1]] = lIlllllIl[lIllllllI[12]];
                if (C.lIlIIIIIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIllllllI[0]];
                    stringArray2[C.lIllllllI[1]] = lIlllllIl[lIllllllI[25]];
                    Inventory.getFirst((String[])stringArray2).interact(lIlllllIl[lIllllllI[11]]);
                    Time.sleepTicks((int)lIllllllI[5]);

                }
            }
            if (C.lIlIIIIIIIIl(C.ab() ? 1 : 0) && C.lIlIIIIIIIll(Vars.getBit((int)QuestVarbits.QUEST_TEARS_OF_GUTHIX.getId()))) {
                int[] nArray = new int[lIllllllI[0]];
                nArray[C.lIllllllI[1]] = lIllllllI[7];
                if (C.lIlIIIIIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[lIllllllI[0]];
                    nArray6[C.lIllllllI[1]] = lIllllllI[8];
                    if (C.lIlIIIIIIIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                        int[] nArray7 = new int[lIllllllI[0]];
                        nArray7[C.lIllllllI[1]] = lIllllllI[7];
                        int[] nArray8 = new int[lIllllllI[0]];
                        nArray8[C.lIllllllI[1]] = lIllllllI[8];
                        Inventory.getFirst((int[])nArray7).useOn(Inventory.getFirst((int[])nArray8));
                        Time.sleepTicks((int)lIllllllI[5]);

                    }
                }
                int[] nArray9 = new int[lIllllllI[0]];
                nArray9[C.lIllllllI[1]] = lIllllllI[26];
                if (C.lIlIIIIIIIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                    int[] nArray10 = new int[lIllllllI[0]];
                    nArray10[C.lIllllllI[1]] = lIllllllI[26];
                    String[] stringArray = new String[lIllllllI[0]];
                    stringArray[C.lIllllllI[1]] = lIlllllIl[lIllllllI[27]];
                    Inventory.getFirst((int[])nArray10).useOn(Inventory.getFirst((String[])stringArray));
                }
                if (C.lIlIIIIIIIll(Vars.getBit((int)lIllllllI[28]))) {
                    llIIIIlIIIIlll = new WorldPoint(lIllllllI[29], lIllllllI[30], lIllllllI[1]);
                    if (C.lIlIIIIIlIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIIIIlIIIIlll), lIllllllI[9])) {
                        AccBuilderEasyClues.c = lIlllllIl[lIllllllI[31]];
                        Movement.walkTo((WorldPoint)llIIIIlIIIIlll);

                        Time.sleepTicks((int)lIllllllI[0]);

                    }
                    if (C.lIlIIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIIIIlIIIIlll), lIllllllI[9])) {
                        String[] stringArray = new String[lIllllllI[0]];
                        stringArray[C.lIllllllI[1]] = lIlllllIl[lIllllllI[32]];
                        String[] stringArray3 = new String[lIllllllI[0]];
                        stringArray3[C.lIllllllI[1]] = lIlllllIl[lIllllllI[33]];
                        Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest((String[])stringArray3));
                        Time.sleepTicks((int)lIllllllI[5]);

                    }
                }
                if (C.lIlIIIIIlIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllllllI[34], lIllllllI[35], lIllllllI[1])), lIllllllI[12]) && C.lIlIIIIIlIlI(Vars.getBit((int)lIllllllI[28]), lIllllllI[0]) && C.lIlIIIIIIIll(C.bw() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllllIl[lIllllllI[36]];
                    if (C.lIlIIIIIIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (C.lIlIIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllllllI[34], lIllllllI[35], lIllllllI[1])), lIllllllI[17]) && C.lIlIIIIIIIll(Players.getLocal().getWorldLocation().getPlane())) {
                        AccBuilderEasyClues.c = lIlllllIl[lIllllllI[37]];
                        String[] stringArray = new String[lIllllllI[0]];
                        stringArray[C.lIllllllI[1]] = lIlllllIl[lIllllllI[38]];
                        TileObjects.getNearest((String[])stringArray).interact(lIlllllIl[lIllllllI[39]]);
                        Time.sleepTicks((int)lIllllllI[19]);

                    }
                    Movement.walkTo((WorldPoint)new WorldPoint(lIllllllI[34], lIllllllI[35], lIllllllI[1]));

                    Time.sleepTicks((int)lIllllllI[0]);

                }
                if (C.lIlIIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllllllI[34], lIllllllI[35], lIllllllI[1])), lIllllllI[12]) && C.lIlIIIIIIIll(C.bw() ? 1 : 0) && C.lIlIIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllllllI[34], lIllllllI[35], lIllllllI[1])), lIllllllI[17]) && C.lIlIIIIIIIll(Players.getLocal().getWorldLocation().getPlane())) {
                    AccBuilderEasyClues.c = lIlllllIl[lIllllllI[40]];
                    String[] stringArray = new String[lIllllllI[0]];
                    stringArray[C.lIllllllI[1]] = lIlllllIl[lIllllllI[3]];
                    TileObjects.getNearest((String[])stringArray).interact(lIlllllIl[lIllllllI[41]]);
                    Time.sleepTicks((int)lIllllllI[19]);

                }
                if (C.lIlIIIIIIIIl(C.bw() ? 1 : 0)) {
                    if (C.lIlIIIIIlIIl(Players.getLocal().getWorldLocation().getX(), lIllllllI[42])) {
                        AccBuilderEasyClues.c = lIlllllIl[lIllllllI[43]];
                        String[] stringArray = new String[lIllllllI[0]];
                        stringArray[C.lIllllllI[1]] = lIlllllIl[lIllllllI[44]];
                        TileObjects.getNearest((String[])stringArray).interact(lIlllllIl[lIllllllI[24]]);
                        Time.sleepTicks((int)lIllllllI[9]);

                    }
                    if (C.lIlIIIIIlIII(Players.getLocal().getWorldLocation().getX(), lIllllllI[42]) && C.lIlIIIIIlIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIllllllI[12])) {
                        AccBuilderEasyClues.c = lIlllllIl[lIllllllI[45]];
                        e.c(bX);
                        Time.sleepTicks((int)lIllllllI[17]);

                    }
                }
                if (C.lIlIIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(bX), lIllllllI[12])) {
                    if (C.lIlIIIIIIIll(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlllllIl[lIllllllI[46]];
                        String[] stringArray = new String[lIllllllI[0]];
                        stringArray[C.lIllllllI[1]] = lIlllllIl[lIllllllI[47]];
                        TileObjects.getNearest((String[])stringArray).interact(lIlllllIl[lIllllllI[48]]);
                        Time.sleepTicks((int)lIllllllI[5]);

                    }
                    g.a(bR);
                }
            }
            if (C.lIlIIIIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_TEARS_OF_GUTHIX.getId()), lIllllllI[0]) && C.lIlIIIIIIIll(Players.getLocal().isAnimating() ? 1 : 0)) {
                NPC llIIIIlIIIIllI;
                llIIIIlIIIIlll = new WorldArea(lIllllllI[49], lIllllllI[50], lIllllllI[47], lIllllllI[43], lIllllllI[5]);
                if (C.lIlIIIIIIIll(llIIIIlIIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIllllllI[0]];
                    stringArray[C.lIllllllI[1]] = lIlllllIl[lIllllllI[51]];
                    if (C.lIlIIIIIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        if (C.lIlIIIIIlIIl(Players.getLocal().getWorldLocation().getX(), lIllllllI[42])) {
                            AccBuilderEasyClues.c = lIlllllIl[lIllllllI[52]];
                            String[] stringArray4 = new String[lIllllllI[0]];
                            stringArray4[C.lIllllllI[1]] = lIlllllIl[lIllllllI[53]];
                            TileObjects.getNearest((String[])stringArray4).interact(lIlllllIl[lIllllllI[54]]);
                            Time.sleepTicks((int)lIllllllI[9]);

                        }
                        if (C.lIlIIIIIlIII(Players.getLocal().getWorldLocation().getX(), lIllllllI[42]) && C.lIlIIIIIlIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIllllllI[12])) {
                            AccBuilderEasyClues.c = lIlllllIl[lIllllllI[55]];
                            e.c(bX);
                            Time.sleepTicks((int)lIllllllI[17]);

                        }
                        if (C.lIlIIIIIIIll(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIlllllIl[lIllllllI[56]];
                            String[] stringArray5 = new String[lIllllllI[0]];
                            stringArray5[C.lIllllllI[1]] = lIlllllIl[lIllllllI[57]];
                            TileObjects.getNearest((String[])stringArray5).interact(lIlllllIl[lIllllllI[58]]);
                            Time.sleepTicks((int)lIllllllI[5]);

                        }
                        g.a(bR);
                    }
                    String[] stringArray6 = new String[lIllllllI[0]];
                    stringArray6[C.lIllllllI[1]] = lIlllllIl[lIllllllI[59]];
                    if (C.lIlIIIIIIIll(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        if (C.lIlIIIIIlIII(Players.getLocal().getWorldLocation().getX(), lIllllllI[42])) {
                            AccBuilderEasyClues.c = lIlllllIl[lIllllllI[60]];
                            String[] stringArray7 = new String[lIllllllI[0]];
                            stringArray7[C.lIllllllI[1]] = lIlllllIl[lIllllllI[61]];
                            TileObjects.getNearest((String[])stringArray7).interact(lIlllllIl[lIllllllI[62]]);
                            Time.sleepTicks((int)lIllllllI[9]);

                        }
                        if (C.lIlIIIIIlIIl(Players.getLocal().getWorldLocation().getX(), lIllllllI[42])) {
                            String[] stringArray8 = new String[lIllllllI[0]];
                            stringArray8[C.lIllllllI[1]] = lIlllllIl[lIllllllI[63]];
                            llIIIIlIIIIllI = NPCs.getNearest((String[])stringArray8);
                            if (C.lIlIIIIIIlIl(llIIIIlIIIIllI)) {
                                int[] nArray = new int[lIllllllI[0]];
                                nArray[C.lIllllllI[1]] = lIllllllI[64];
                                Inventory.getFirst((int[])nArray).useOn((Actor)llIIIIlIIIIllI);
                                Time.sleepTicks((int)lIllllllI[9]);

                            }
                        }
                    }
                }
                if (C.lIlIIIIIIIIl(llIIIIlIIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIllllllI[0]];
                    stringArray[C.lIllllllI[1]] = lIlllllIl[lIllllllI[65]];
                    if (C.lIlIIIIIIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray9 = new String[lIllllllI[0]];
                        stringArray9[C.lIllllllI[1]] = lIlllllIl[lIllllllI[66]];
                        if (C.lIlIIIIIIIll(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                            String[] stringArray10 = new String[lIllllllI[0]];
                            stringArray10[C.lIllllllI[1]] = lIlllllIl[lIllllllI[67]];
                            TileObjects.getNearest((String[])stringArray10).interact(lIlllllIl[lIllllllI[68]]);
                            Time.sleepTicks((int)lIllllllI[6]);

                        }
                        String[] stringArray11 = new String[lIllllllI[0]];
                        stringArray11[C.lIllllllI[1]] = lIlllllIl[lIllllllI[69]];
                        if (C.lIlIIIIIIIIl(Inventory.contains((String[])stringArray11) ? 1 : 0)) {
                            String[] stringArray12 = new String[lIllllllI[0]];
                            stringArray12[C.lIllllllI[1]] = lIlllllIl[lIllllllI[70]];
                            String[] stringArray13 = new String[lIllllllI[0]];
                            stringArray13[C.lIllllllI[1]] = lIlllllIl[lIllllllI[71]];
                            Inventory.getFirst((String[])stringArray12).useOn(Inventory.getFirst((String[])stringArray13));
                            Time.sleepTicks((int)lIllllllI[5]);

                        }
                    }
                    String[] stringArray14 = new String[lIllllllI[0]];
                    stringArray14[C.lIllllllI[1]] = lIlllllIl[lIllllllI[2]];
                    if (C.lIlIIIIIIIIl(Inventory.contains((String[])stringArray14) ? 1 : 0)) {
                        if (C.lIlIIIIIIIlI(cl, lIllllllI[0])) {
                            an.nQ += lIllllllI[0];
                            an.o(AccBuilderEasyClues.m);
                            cl += lIllllllI[0];
                            an.nQ = lIllllllI[1];
                        }
                        String[] stringArray15 = new String[lIllllllI[0]];
                        stringArray15[C.lIllllllI[1]] = lIlllllIl[lIllllllI[23]];
                        llIIIIlIIIIllI = NPCs.getNearest((String[])stringArray15);
                        if (C.lIlIIIIIIlIl(llIIIIlIIIIllI)) {
                            int[] nArray = new int[lIllllllI[0]];
                            nArray[C.lIllllllI[1]] = lIllllllI[64];
                            Inventory.getFirst((int[])nArray).useOn((Actor)llIIIIlIIIIllI);
                            Time.sleepTicks((int)lIllllllI[9]);

                        }
                    }
                }
            }
            int[] nArray = new int[lIllllllI[0]];
            nArray[C.lIllllllI[1]] = lIllllllI[26];
            if (C.lIlIIIIIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray11 = new int[lIllllllI[0]];
                nArray11[C.lIllllllI[1]] = lIllllllI[26];
                String[] stringArray = new String[lIllllllI[0]];
                stringArray[C.lIllllllI[1]] = lIlllllIl[lIllllllI[72]];
                Inventory.getFirst((int[])nArray11).useOn(Inventory.getFirst((String[])stringArray));
            }
        }
    }

    private static boolean lIlIIIIIIlIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIIIIlIII(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIllllllllI() {
        lIlllllIl = new String[lIllllllI[88]];
        C.lIlllllIl[C.lIllllllI[1]] = "Finished buying items, switching back to quest";
        C.lIlllllIl[C.lIllllllI[0]] = "Nav to bank";
        C.lIlllllIl[C.lIllllllI[5]] = "Handling banking";
        C.lIlllllIl[C.lIllllllI[9]] = "We are missing quest supplies, switching to BUYING";
        C.lIlllllIl[C.lIllllllI[6]] = "We are missing quest supplies, switching to BUYING";
        C.lIlllllIl[C.lIllllllI[17]] = "We are missing quest supplies, switching to BUYING";
        C.lIlllllIl[C.lIllllllI[19]] = "Drink";
        C.lIlllllIl[C.lIllllllI[21]] = "Drink";
        C.lIlllllIl[C.lIllllllI[12]] = "Shark";
        C.lIlllllIl[C.lIllllllI[25]] = "Shark";
        C.lIlllllIl[C.lIllllllI[11]] = "Eat";
        C.lIlllllIl[C.lIllllllI[27]] = "Tinderbox";
        C.lIlllllIl[C.lIllllllI[31]] = "Nav to hole";
        C.lIlllllIl[C.lIllllllI[32]] = "Rope";
        C.lIlllllIl[C.lIllllllI[33]] = "Dark hole";
        C.lIlllllIl[C.lIllllllI[36]] = "Nav to start";
        C.lIlllllIl[C.lIllllllI[37]] = "Enter tunnel";
        C.lIlllllIl[C.lIllllllI[38]] = "Tunnel";
        C.lIlllllIl[C.lIllllllI[39]] = "Enter";
        C.lIlllllIl[C.lIllllllI[40]] = "Enter tunnel";
        C.lIlllllIl[C.lIllllllI[3]] = "Tunnel";
        C.lIlllllIl[C.lIllllllI[41]] = "Enter";
        C.lIlllllIl[C.lIllllllI[43]] = "Climb rock";
        C.lIlllllIl[C.lIllllllI[44]] = "Rocks";
        C.lIlllllIl[C.lIllllllI[24]] = "Climb";
        C.lIlllllIl[C.lIllllllI[45]] = "Click start tile";
        C.lIlllllIl[C.lIllllllI[46]] = "Talk";
        C.lIlllllIl[C.lIllllllI[47]] = "Juna";
        C.lIlllllIl[C.lIllllllI[48]] = "Talk-to";
        C.lIlllllIl[C.lIllllllI[51]] = "Stone bowl";
        C.lIlllllIl[C.lIllllllI[52]] = "Climb rock";
        C.lIlllllIl[C.lIllllllI[53]] = "Rocks";
        C.lIlllllIl[C.lIllllllI[54]] = "Climb";
        C.lIlllllIl[C.lIllllllI[55]] = "Click start tile";
        C.lIlllllIl[C.lIllllllI[56]] = "Talk";
        C.lIlllllIl[C.lIllllllI[57]] = "Juna";
        C.lIlllllIl[C.lIllllllI[58]] = "Talk-to";
        C.lIlllllIl[C.lIllllllI[59]] = "Stone bowl";
        C.lIlllllIl[C.lIllllllI[60]] = "Climb rock";
        C.lIlllllIl[C.lIllllllI[61]] = "Rocks";
        C.lIlllllIl[C.lIllllllI[62]] = "Climb";
        C.lIlllllIl[C.lIllllllI[63]] = "Light creature";
        C.lIlllllIl[C.lIllllllI[65]] = "Stone bowl";
        C.lIlllllIl[C.lIllllllI[66]] = "Magic stone";
        C.lIlllllIl[C.lIllllllI[67]] = "Magical rocks";
        C.lIlllllIl[C.lIllllllI[68]] = "Mine";
        C.lIlllllIl[C.lIllllllI[69]] = "Magic stone";
        C.lIlllllIl[C.lIllllllI[70]] = "Magic stone";
        C.lIlllllIl[C.lIllllllI[71]] = "Chisel";
        C.lIlllllIl[C.lIllllllI[2]] = "Stone bowl";
        C.lIlllllIl[C.lIllllllI[23]] = "Light creature";
        C.lIlllllIl[C.lIllllllI[72]] = "Tinderbox";
        C.lIlllllIl[C.lIllllllI[81]] = "Tears of Guthix";
        C.lIlllllIl[C.lIllllllI[82]] = "ring of wealth (";
        C.lIlllllIl[C.lIllllllI[89]] = "Yes.";
        C.lIlllllIl[C.lIllllllI[90]] = "Okay...";
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void llIIIIlIIIIIll;
        int[] nArray = new int[lIllllllI[21]];
        nArray[C.lIllllllI[1]] = lIllllllI[13];
        nArray[C.lIllllllI[0]] = lIllllllI[10];
        nArray[C.lIllllllI[5]] = lIllllllI[14];
        nArray[C.lIllllllI[9]] = lIllllllI[15];
        nArray[C.lIllllllI[6]] = lIllllllI[18];
        nArray[C.lIllllllI[17]] = lIllllllI[20];
        nArray[C.lIllllllI[19]] = lIllllllI[22];
        int[] nArray2 = nArray;
        int llIIIIlIIIIIlI = lIllllllI[1];
        while (C.lIlIIIIIIIlI(llIIIIlIIIIIlI, ((void)llIIIIlIIIIIll).length)) {
            int[] nArray3 = new int[lIllllllI[0]];
            nArray3[C.lIllllllI[1]] = llIIIIlIIIIIll[llIIIIlIIIIIlI];
            if (C.lIlIIIIIIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIllllllI[1];
            }
            ++llIIIIlIIIIIlI;

            return ((28 + 92 - -76 + 9 ^ 42 + 184 - 144 + 117) & (0x8A ^ 0x84 ^ (0x9F ^ 0x9B) ^ -1)) != 0;
        }
        return lIllllllI[0];
    }

    private static boolean lIlIIIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIIIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String U() {
        return lIlllllIl[lIllllllI[81]];
    }
}

