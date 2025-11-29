/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
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
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.Quests
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
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.ALHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.ANHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.LHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.ZHelper;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
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
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

public class VHelper
implements W {
    public static final  WorldPoint cL;
    public static final  WorldPoint cM;
    static  boolean cm;
    public static final  WorldPoint cQ;
    public static final  WorldPoint cN;
    public static final  WorldPoint cP;
    public static final  WorldPoint cR;
    
    public static final  WorldPoint cO;
    public static final  WorldPoint cT;
    
    static  int cl;
    public static  List<d> bv;
    public static final  WorldPoint cS;
    static  WorldArea cV;
    static  int cU;
    public static  boolean bt;

    private static boolean lllIIIllIll(int n2) {
        return n2 > 0;
    }

    private static boolean lllIIlIIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static void af() {
        block35: {
            d lIIlIIIIlIllIII;
            block34: {
                block33: {
                    block32: {
                        block31: {
                            block30: {
                                Object lIIlIIIIlIllIIl;
                                block29: {
                                    block28: {
                                        block27: {
                                            block26: {
                                                block25: {
                                                    block24: {
                                                        block23: {
                                                            block22: {
                                                                int[] nArray = new int[lIIIlIIlI[0]];
                                                                nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[9];
                                                                if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                int[] nArray2 = new int[lIIIlIIlI[0]];
                                                                nArray2[v.lIIIlIIlI[1]] = lIIIlIIlI[9];
                                                                if (!v.lllIIIlIllI(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                                                int[] nArray3 = new int[lIIIlIIlI[0]];
                                                                nArray3[v.lIIIlIIlI[1]] = lIIIlIIlI[9];
                                                                if (!v.lllIIIlIlll(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlIIlI[8])) break block23;
                                                            }
                                                            lIIlIIIIlIllIIl = new DHelper(lIIIlIIlI[9], lIIIlIIlI[8], lIIIlIIlI[18]);
                                                            bv.add((DHelper) IIlIIIIlIllIIl);

                                                        }
                                                        int[] nArray = new int[lIIIlIIlI[0]];
                                                        nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[7];
                                                        if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                                        int[] nArray4 = new int[lIIIlIIlI[0]];
                                                        nArray4[v.lIIIlIIlI[1]] = lIIIlIIlI[7];
                                                        if (!v.lllIIIlIllI(Bank.contains((int[])nArray4) ? 1 : 0)) break block25;
                                                        int[] nArray5 = new int[lIIIlIIlI[0]];
                                                        nArray5[v.lIIIlIIlI[1]] = lIIIlIIlI[7];
                                                        if (!v.lllIIIlIlll(Bank.getFirst((int[])nArray5).getQuantity(), lIIIlIIlI[8])) break block25;
                                                    }
                                                    lIIlIIIIlIllIIl = new DHelper(lIIIlIIlI[7], lIIIlIIlI[8], lIIIlIIlI[18]);
                                                    bv.add((DHelper) IIlIIIIlIllIIl);

                                                }
                                                int[] nArray = new int[lIIIlIIlI[0]];
                                                nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[10];
                                                if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                                int[] nArray6 = new int[lIIIlIIlI[0]];
                                                nArray6[v.lIIIlIIlI[1]] = lIIIlIIlI[10];
                                                if (!v.lllIIIlIllI(Bank.contains((int[])nArray6) ? 1 : 0)) break block27;
                                                int[] nArray7 = new int[lIIIlIIlI[0]];
                                                nArray7[v.lIIIlIIlI[1]] = lIIIlIIlI[10];
                                                if (!v.lllIIIlIlll(Bank.getFirst((int[])nArray7).getQuantity(), lIIIlIIlI[8])) break block27;
                                            }
                                            lIIlIIIIlIllIIl = new DHelper(lIIIlIIlI[10], lIIIlIIlI[8], lIIIlIIlI[18]);
                                            bv.add((DHelper) IIlIIIIlIllIIl);

                                        }
                                        int[] nArray = new int[lIIIlIIlI[0]];
                                        nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[15];
                                        if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray8 = new int[lIIIlIIlI[0]];
                                        nArray8[v.lIIIlIIlI[1]] = lIIIlIIlI[15];
                                        if (!v.lllIIIlIllI(Bank.contains((int[])nArray8) ? 1 : 0)) break block29;
                                        int[] nArray9 = new int[lIIIlIIlI[0]];
                                        nArray9[v.lIIIlIIlI[1]] = lIIIlIIlI[15];
                                        if (!v.lllIIIlIlll(Bank.getFirst((int[])nArray9).getQuantity(), lIIIlIIlI[28])) break block29;
                                    }
                                    lIIlIIIIlIllIIl = new DHelper(lIIIlIIlI[15], lIIIlIIlI[33], lIIIlIIlI[80]);
                                    bv.add((DHelper) IIlIIIIlIllIIl);

                                }
                                if (v.lllIIIllIII(Bank.contains((Predicate)(lIIlIIIIlIllIIl = item -> item.getName().toLowerCase().contains(lIIIIllll[lIIIlIIlI[87]]))) ? 1 : 0)) {
                                    lIIlIIIIlIllIII = new DHelper(lIIIlIIlI[81], lIIIlIIlI[16], lIIIlIIlI[82]);
                                    bv.add(lIIlIIIIlIllIII);

                                }
                                int[] nArray = new int[lIIIlIIlI[0]];
                                nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[14];
                                if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                int[] nArray10 = new int[lIIIlIIlI[0]];
                                nArray10[v.lIIIlIIlI[1]] = lIIIlIIlI[14];
                                if (!v.lllIIIlIllI(Bank.contains((int[])nArray10) ? 1 : 0)) break block31;
                                int[] nArray11 = new int[lIIIlIIlI[0]];
                                nArray11[v.lIIIlIIlI[1]] = lIIIlIIlI[14];
                                if (!v.lllIIIlIlll(Bank.getFirst((int[])nArray11).getQuantity(), lIIIlIIlI[6])) break block31;
                            }
                            lIIlIIIIlIllIII = new DHelper(lIIIlIIlI[14], lIIIlIIlI[6], i.bq);
                            bv.add(lIIlIIIIlIllIII);

                        }
                        int[] nArray = new int[lIIIlIIlI[0]];
                        nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[17];
                        if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                        int[] nArray12 = new int[lIIIlIIlI[0]];
                        nArray12[v.lIIIlIIlI[1]] = lIIIlIIlI[17];
                        if (!v.lllIIIlIllI(Bank.contains((int[])nArray12) ? 1 : 0)) break block33;
                        int[] nArray13 = new int[lIIIlIIlI[0]];
                        nArray13[v.lIIIlIIlI[1]] = lIIIlIIlI[17];
                        if (!v.lllIIIlIlll(Bank.getFirst((int[])nArray13).getQuantity(), lIIIlIIlI[5])) break block33;
                    }
                    lIIlIIIIlIllIII = new DHelper(lIIIlIIlI[17], lIIIlIIlI[11], lIIIlIIlI[83]);
                    bv.add(lIIlIIIIlIllIII);

                }
                int[] nArray = new int[lIIIlIIlI[0]];
                nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[13];
                if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                int[] nArray14 = new int[lIIIlIIlI[0]];
                nArray14[v.lIIIlIIlI[1]] = lIIIlIIlI[13];
                if (!v.lllIIIlIllI(Bank.contains((int[])nArray14) ? 1 : 0)) break block35;
                int[] nArray15 = new int[lIIIlIIlI[0]];
                nArray15[v.lIIIlIIlI[1]] = lIIIlIIlI[13];
                if (!v.lllIIIlIlll(Bank.getFirst((int[])nArray15).getQuantity(), lIIIlIIlI[28])) break block35;
            }
            lIIlIIIIlIllIII = new DHelper(lIIIlIIlI[13], lIIIlIIlI[54], lIIIlIIlI[84]);
            bv.add(lIIlIIIIlIllIII);

        }
    }

    @Override
    public String U() {
        return lIIIIllll[lIIIlIIlI[86]];
    }

    private static boolean lllIIIlllll(Object object) {
        return object == null;
    }

    public static void aR() {
        block76: {
            block82: {
                block84: {
                    block83: {
                        BankLocation lIIlIIIIllIIIlI;
                        block77: {
                            block81: {
                                block79: {
                                    block80: {
                                        block78: {
                                            if (v.lllIIIlIllI(bt ? 1 : 0)) {
                                                b.a(bv);
                                                if (v.lllIIIlIlll(bv.size(), lIIIlIIlI[0])) {
                                                    System.out.println(lIIIIllll[lIIIlIIlI[1]]);
                                                    bt = lIIIlIIlI[1];
                                                }
                                            }
                                            if (!v.lllIIIllIII(bt ? 1 : 0)) break block76;
                                            if (v.lllIIIlIlll(Skills.getLevel((Skill)Skill.PRAYER), lIIIlIIlI[2])) {
                                                al.dD();
                                            }
                                            if (v.lllIIIllIIl(Skills.getLevel((Skill)Skill.PRAYER), lIIIlIIlI[2]) && v.lllIIIlIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIIlIIlI[3])) {
                                                l.Y();
                                            }
                                            if (!v.lllIIIllIII(v.ab() ? 1 : 0) || !v.lllIIIlIlll(e.j(cU), lIIIlIIlI[0]) || !v.lllIIIllIIl(Skills.getLevel((Skill)Skill.PRAYER), lIIIlIIlI[2]) || !v.lllIIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlIIlI[3])) break block77;
                                            lIIlIIIIllIIIlI = BankLocation.getNearest();
                                            if (v.lllIIIllIlI(lIIlIIIIllIIIlI) && v.lllIIIllIII(lIIlIIIIllIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[0]];
                                                a.a(lIIlIIIIllIIIlI);
                                            }
                                            if (!v.lllIIIllIlI(lIIlIIIIllIIIlI) || !v.lllIIIlIllI(lIIlIIIIllIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block77;
                                            if (v.lllIIIllIII(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIIlI[4]);

                                            }
                                            if (!v.lllIIIlIllI(Bank.isOpen() ? 1 : 0)) break block77;
                                            AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[5]];
                                            if (v.lllIIIllIll(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIIlIIlI[6]);

                                            }
                                            if (v.lllIIIllIll(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIIlIIlI[5]);

                                            }
                                            int[] nArray = new int[lIIIlIIlI[0]];
                                            nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[7];
                                            if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block78;
                                            int[] nArray2 = new int[lIIIlIIlI[0]];
                                            nArray2[v.lIIIlIIlI[1]] = lIIIlIIlI[7];
                                            if (!v.lllIIIllIIl(Bank.getFirst((int[])nArray2).getQuantity(), lIIIlIIlI[8])) break block79;
                                        }
                                        int[] nArray = new int[lIIIlIIlI[0]];
                                        nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[9];
                                        if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block80;
                                        int[] nArray3 = new int[lIIIlIIlI[0]];
                                        nArray3[v.lIIIlIIlI[1]] = lIIIlIIlI[9];
                                        if (!v.lllIIIllIIl(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlIIlI[8])) break block79;
                                    }
                                    int[] nArray = new int[lIIIlIIlI[0]];
                                    nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[10];
                                    if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block81;
                                    int[] nArray4 = new int[lIIIlIIlI[0]];
                                    nArray4[v.lIIIlIIlI[1]] = lIIIlIIlI[10];
                                    if (!v.lllIIIlIlll(Bank.getFirst((int[])nArray4).getQuantity(), lIIIlIIlI[8])) break block81;
                                }
                                v.af();
                                System.out.println(lIIIIllll[lIIIlIIlI[11]]);
                                bt = lIIIlIIlI[0];
                                return;
                            }
                            int[] nArray = new int[lIIIlIIlI[12]];
                            nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[13];
                            nArray[v.lIIIlIIlI[0]] = lIIIlIIlI[7];
                            nArray[v.lIIIlIIlI[5]] = lIIIlIIlI[10];
                            nArray[v.lIIIlIIlI[11]] = lIIIlIIlI[14];
                            nArray[v.lIIIlIIlI[6]] = lIIIlIIlI[15];
                            nArray[v.lIIIlIIlI[16]] = lIIIlIIlI[17];
                            if (v.lllIIIllIII(e.b(nArray) ? 1 : 0)) {
                                v.af();
                                System.out.println(lIIIIllll[lIIIlIIlI[6]]);
                                bt = lIIIlIIlI[0];
                                return;
                            }
                            int[] nArray5 = new int[lIIIlIIlI[12]];
                            nArray5[v.lIIIlIIlI[1]] = lIIIlIIlI[13];
                            nArray5[v.lIIIlIIlI[0]] = lIIIlIIlI[7];
                            nArray5[v.lIIIlIIlI[5]] = lIIIlIIlI[10];
                            nArray5[v.lIIIlIIlI[11]] = lIIIlIIlI[14];
                            nArray5[v.lIIIlIIlI[6]] = lIIIlIIlI[15];
                            nArray5[v.lIIIlIIlI[16]] = lIIIlIIlI[17];
                            if (v.lllIIIlIllI(e.b(nArray5) ? 1 : 0)) {
                                while (v.lllIIIllIII(z.bi() ? 1 : 0)) {
                                    z.bg();
                                    Time.sleepTicks((int)lIIIlIIlI[0]);

                                    if ((0x38 ^ 0x3D) > 0) continue;
                                    return;
                                }
                                if (v.lllIIIllIII(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepTicks((int)lIIIlIIlI[12]);

                                }
                                a.a(lIIIlIIlI[13], lIIIlIIlI[18]);
                                a.a(lIIIlIIlI[14], lIIIlIIlI[11]);
                                a.a(lIIIlIIlI[7], lIIIlIIlI[8]);
                                a.a(lIIIlIIlI[10], lIIIlIIlI[8]);
                                a.a(lIIIlIIlI[17], lIIIlIIlI[11]);
                                a.a(lIIIlIIlI[15], lIIIlIIlI[18]);
                                a.a(lIIIlIIlI[19], lIIIlIIlI[4]);
                            }
                        }
                        if (v.lllIIIlIllI(Inventory.contains((int[])f.aV) ? 1 : 0) && v.lllIIIlIlll(Movement.getRunEnergy(), lIIIlIIlI[20])) {
                            Inventory.getFirst((int[])f.aV).interact(lIIIIllll[lIIIlIIlI[16]]);
                            Time.sleepTicks((int)lIIIlIIlI[0]);

                        }
                        if (v.lllIIIlIlll(Prayers.getPoints(), lIIIlIIlI[21]) && v.lllIIIlIllI(Inventory.contains((int[])f.aS) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aS).interact(lIIIIllll[lIIIlIIlI[12]]);
                        }
                        if (v.lllIIIlIllI(v.ab() ? 1 : 0) && v.lllIIIllIII(e.j(cU))) {
                            if (v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo(cL), lIIIlIIlI[16])) {
                                AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[22]];
                                if (v.lllIIIlIllI(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)cL);

                                Time.sleepTicks((int)lIIIlIIlI[0]);

                            }
                            if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cL), lIIIlIIlI[16])) {
                                g.a(lIIIIllll[lIIIlIIlI[23]], bR);
                            }
                        }
                        if (v.lllIIIllllI(e.j(cU), lIIIlIIlI[0])) {
                            if (v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo(cM), lIIIlIIlI[6]) && v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo(cN), lIIIlIIlI[6])) {
                                AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[24]];
                                Movement.walkTo((WorldPoint)cM);

                                Time.sleepTicks((int)lIIIlIIlI[0]);

                            }
                            if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cM), lIIIlIIlI[12])) {
                                AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[18]];
                                String[] stringArray = new String[lIIIlIIlI[0]];
                                stringArray[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[25]];
                                String[] stringArray2 = new String[lIIIlIIlI[0]];
                                stringArray2[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[26]];
                                if (v.lllIIIlIllI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                                    String[] stringArray3 = new String[lIIIlIIlI[0]];
                                    stringArray3[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[3]];
                                    if (v.lllIIIllIII(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray3)) ? 1 : 0)) {
                                        String[] stringArray4 = new String[lIIIlIIlI[0]];
                                        stringArray4[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[27]];
                                        TileObjects.getNearest((String[])stringArray4).interact(lIIIIllll[lIIIlIIlI[28]]);
                                        Time.sleepTicks((int)lIIIlIIlI[6]);

                                    }
                                }
                                String[] stringArray5 = new String[lIIIlIIlI[0]];
                                stringArray5[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[29]];
                                if (v.lllIIIlIllI(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray5)) ? 1 : 0)) {
                                    String[] stringArray6 = new String[lIIIlIIlI[0]];
                                    stringArray6[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[30]];
                                    String[] stringArray7 = new String[lIIIlIIlI[0]];
                                    stringArray7[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[31]];
                                    if (v.lllIIIlIllI(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                                        String[] stringArray8 = new String[lIIIlIIlI[0]];
                                        stringArray8[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[32]];
                                        TileObjects.getNearest((String[])stringArray8).interact(lIIIIllll[lIIIlIIlI[33]]);
                                        Time.sleepTicks((int)lIIIlIIlI[5]);

                                    }
                                    String[] stringArray9 = new String[lIIIlIIlI[0]];
                                    stringArray9[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[34]];
                                    String[] stringArray10 = new String[lIIIlIIlI[0]];
                                    stringArray10[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[35]];
                                    if (v.lllIIIlIllI(TileObjects.getNearest((String[])stringArray9).hasAction(stringArray10) ? 1 : 0)) {
                                        String[] stringArray11 = new String[lIIIlIIlI[0]];
                                        stringArray11[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[36]];
                                        TileObjects.getNearest((String[])stringArray11).interact(lIIIIllll[lIIIlIIlI[37]]);
                                        Time.sleepTicks((int)lIIIlIIlI[5]);

                                    }
                                }
                            }
                        }
                        if (v.lllIIIllllI(e.j(cU), lIIIlIIlI[5])) {
                            int[] nArray = new int[lIIIlIIlI[0]];
                            nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[38];
                            if (v.lllIIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIIlIIlI[0]];
                                nArray6[v.lIIIlIIlI[1]] = lIIIlIIlI[38];
                                Inventory.getFirst((int[])nArray6).interact(lIIIIllll[lIIIlIIlI[21]]);
                            }
                            int[] nArray7 = new int[lIIIlIIlI[0]];
                            nArray7[v.lIIIlIIlI[1]] = lIIIlIIlI[39];
                            if (v.lllIIIlIllI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIIlIIlI[0]];
                                nArray8[v.lIIIlIIlI[1]] = lIIIlIIlI[39];
                                Inventory.getFirst((int[])nArray8).interact(lIIIIllll[lIIIlIIlI[40]]);
                            }
                            if (v.lllIIIllIII(cV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo(cO), lIIIlIIlI[6])) {
                                    AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[41]];
                                    Movement.walkTo((WorldPoint)cO);

                                    Time.sleepTicks((int)lIIIlIIlI[0]);

                                }
                                if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cO), lIIIlIIlI[6]) && v.lllIIIllIII(Players.getLocal().isMoving() ? 1 : 0) && v.lllIIIllIII(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIlIIlI[0]];
                                    stringArray[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[42]];
                                    TileObjects.getNearest((String[])stringArray).interact(lIIIIllll[lIIIlIIlI[43]]);
                                    Time.sleepTicks((int)lIIIlIIlI[5]);

                                }
                            }
                            if (v.lllIIIlIllI(cV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo(cP), lIIIlIIlI[6])) {
                                    AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[44]];
                                    Movement.walkTo((WorldPoint)cP);

                                    Time.sleepTicks((int)lIIIlIIlI[0]);

                                }
                                if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cP), lIIIlIIlI[6]) && v.lllIIIllIII(Players.getLocal().isMoving() ? 1 : 0)) {
                                    g.a(lIIIIllll[lIIIlIIlI[45]], bR);
                                }
                            }
                        }
                        if (v.lllIIIllllI(e.j(cU), lIIIlIIlI[11])) {
                            String[] stringArray = new String[lIIIlIIlI[0]];
                            stringArray[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[46]];
                            if (v.lllIIIllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                if (v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo(cS), lIIIlIIlI[16])) {
                                    AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[47]];
                                    Movement.walkTo((WorldPoint)cS);

                                    Time.sleepTicks((int)lIIIlIIlI[0]);

                                }
                                if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cS), lIIIlIIlI[16])) {
                                    g.a(lIIIIllll[lIIIlIIlI[48]], bR);
                                }
                            }
                            String[] stringArray12 = new String[lIIIlIIlI[0]];
                            stringArray12[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[49]];
                            if (v.lllIIIlIllI(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[50]];
                                if (v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo(cP), lIIIlIIlI[16])) {
                                    AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[51]];
                                    Movement.walkTo((WorldPoint)cP);

                                    Time.sleepTicks((int)lIIIlIIlI[0]);

                                }
                                if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cP), lIIIlIIlI[16])) {
                                    g.a(lIIIIllll[lIIIlIIlI[52]], bR);
                                }
                            }
                        }
                        if (v.lllIIIllllI(e.j(cU), lIIIlIIlI[16])) {
                            if (v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo(cT), lIIIlIIlI[11])) {
                                AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[53]];
                                Movement.walkTo((WorldPoint)cT);

                                Time.sleepTicks((int)lIIIlIIlI[0]);

                            }
                            if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cT), lIIIlIIlI[11]) && v.lllIIIllIII(Players.getLocal().isMoving() ? 1 : 0) && v.lllIIIllIII(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lIIIlIIlI[0]];
                                stringArray[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[54]];
                                Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (v.lllIIIlIllI(tileObject.getName().contains(lIIIIllll[lIIIlIIlI[90]]) ? 1 : 0) && v.lllIIIlllIl(tileObject.getWorldLocation().distanceTo(cT), lIIIlIIlI[11])) {
                                        n2 = lIIIlIIlI[0];

                                        }
                                    } else {
                                        n2 = lIIIlIIlI[1];
                                    }
                                    return n2 != 0;
                                }));
                                Time.sleepTicks((int)lIIIlIIlI[5]);

                            }
                        }
                        if (v.lllIIIllllI(e.j(cU), lIIIlIIlI[12])) {
                            if (v.lllIIIllIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (v.lllIIIllIII(l.ad() ? 1 : 0)) {
                                l.ae();
                            }
                            if (v.lllIIIlllll(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[lIIIlIIlI[0]];
                                stringArray[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[55]];
                                if (v.lllIIIllIlI(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray13 = new String[lIIIlIIlI[0]];
                                    stringArray13[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[56]];
                                    NPCs.getNearest((String[])stringArray13).interact(lIIIIllll[lIIIlIIlI[57]]);
                                    Time.sleepTicks((int)lIIIlIIlI[5]);

                                }
                            }
                        }
                        if (v.lllIIIllllI(e.j(cU), lIIIlIIlI[23]) && v.lllIIIlllll(Players.getLocal().getInteracting())) {
                            g.a(lIIIIllll[lIIIlIIlI[58]], bR);
                        }
                        if (v.lllIIIllllI(e.j(cU), lIIIlIIlI[24])) {
                            if (v.lllIIIllIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (v.lllIIIllIII(l.ad() ? 1 : 0)) {
                                l.ae();
                            }
                            String[] stringArray = new String[lIIIlIIlI[0]];
                            stringArray[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[2]];
                            if (v.lllIIIllIlI(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray14 = new String[lIIIlIIlI[0]];
                                stringArray14[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[59]];
                                if (v.lllIIIlllIl(NPCs.getNearest((String[])stringArray14).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIlIIlI[16])) {
                                    g.a(lIIIIllll[lIIIlIIlI[60]], bR);
                                }
                            }
                            if (v.lllIIIlllll(Players.getLocal().getInteracting())) {
                                String[] stringArray15 = new String[lIIIlIIlI[0]];
                                stringArray15[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[61]];
                                if (v.lllIIIllIlI(NPCs.getNearest((String[])stringArray15))) {
                                    String[] stringArray16 = new String[lIIIlIIlI[0]];
                                    stringArray16[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[62]];
                                    NPCs.getNearest((String[])stringArray16).interact(lIIIIllll[lIIIlIIlI[20]]);
                                    Time.sleepTicks((int)lIIIlIIlI[5]);

                                }
                            }
                        }
                        if (v.lllIIIllllI(e.j(cU), lIIIlIIlI[18])) {
                            if (v.lllIIIllIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (v.lllIIIllIII(l.ad() ? 1 : 0)) {
                                l.ae();
                            }
                            if (v.lllIIIlllll(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[lIIIlIIlI[0]];
                                stringArray[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[63]];
                                if (v.lllIIIllIlI(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray17 = new String[lIIIlIIlI[0]];
                                    stringArray17[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[64]];
                                    NPCs.getNearest((String[])stringArray17).interact(lIIIIllll[lIIIlIIlI[65]]);
                                    Time.sleepTicks((int)lIIIlIIlI[5]);

                                }
                            }
                        }
                        if (v.lllIIlIIIII(e.j(cU), lIIIlIIlI[25]) && !v.lllIIIllllI(e.j(cU), lIIIlIIlI[26])) break block82;
                        String[] stringArray = new String[lIIIlIIlI[0]];
                        stringArray[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[66]];
                        if (v.lllIIIllIlI(NPCs.getNearest((String[])stringArray))) {
                            int[] nArray = new int[lIIIlIIlI[0]];
                            nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[13];
                            Inventory.getFirst((int[])nArray).interact(lIIIIllll[lIIIlIIlI[67]]);
                            Time.sleepTicks((int)lIIIlIIlI[16]);

                        }
                        lIIlIIIIllIIIlI = new WorldPoint(lIIIlIIlI[68], lIIIlIIlI[69], lIIIlIIlI[1]);
                        if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(b.J), lIIIlIIlI[70]) && v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIIIIllIIIlI), lIIIlIIlI[6])) {
                            AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[71]];
                            Movement.walkTo((WorldPoint)lIIlIIIIllIIIlI);

                            Time.sleepTicks((int)lIIIlIIlI[0]);

                        }
                        if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIIIIllIIIlI), lIIIlIIlI[6]) && !v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cP), lIIIlIIlI[54])) break block83;
                        if (!v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo(cL), lIIIlIIlI[16])) break block84;
                        String[] stringArray18 = new String[lIIIlIIlI[0]];
                        stringArray18[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[72]];
                        if (!v.lllIIIlllll(NPCs.getNearest((String[])stringArray18)) || !v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIIIIllIIIlI), lIIIlIIlI[70])) break block84;
                    }
                    WorldArea lIIlIIIIllIIIIl = new WorldArea(lIIIlIIlI[73], lIIIlIIlI[74], lIIIlIIlI[43], lIIIlIIlI[37], lIIIlIIlI[1]);
                    if (v.lllIIIlIlll(e.j(lIIIlIIlI[75]), lIIIlIIlI[24]) && v.lllIIIlIllI(Equipment.contains(item -> item.getName().contains(lIIIIllll[lIIIlIIlI[89]])) ? 1 : 0)) {
                        Equipment.getFirst(item -> item.getName().contains(lIIIIllll[lIIIlIIlI[88]])).interact(lIIIIllll[lIIIlIIlI[76]]);
                        Time.sleepTicks((int)lIIIlIIlI[12]);

                    }
                    if (v.lllIIIlIllI(lIIlIIIIllIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint lIIlIIIIllIIIII = new WorldPoint(lIIIlIIlI[77], lIIIlIIlI[78], lIIIlIIlI[1]);
                        Movement.walkTo((WorldPoint)lIIlIIIIllIIIII);

                        Time.sleepTicks((int)lIIIlIIlI[0]);

                    }
                    if (v.lllIIIllIII(lIIlIIIIllIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)cL);

                        Time.sleepTicks((int)lIIIlIIlI[0]);

                    }
                }
                if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cL), lIIIlIIlI[16])) {
                    if (v.lllIIIlIlll(cl, lIIIlIIlI[0])) {
                        an.mW += lIIIlIIlI[0];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIIIlIIlI[0];
                        an.mW = lIIIlIIlI[1];
                        cm = lIIIlIIlI[1];
                    }
                    g.a(lIIIIllll[lIIIlIIlI[79]], bR);
                }
            }
            g.a(bR);
        }
    }

    private static boolean lllIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIIllIlI(Object object) {
        return object != null;
    }

    @Override
    public int T() {
        try {
            v.aR();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x27 ^ 8 ^ (0x2A ^ 1)) < ((0x3C ^ 0x1C ^ (0x77 ^ 0)) & (0x5A ^ 0x6A ^ (0xD8 ^ 0xBF) ^ -1))) {
            return (0x53 ^ 0xC ^ (0x7C ^ 0x1B)) & (52 + 136 - 125 + 80 ^ 24 + 49 - 53 + 163 ^ -1);
        }
        return lIIIlIIlI[85];
    }

    @Override
    public boolean S() {
        return lIIIlIIlI[1];
    }

    private static boolean lllIIIlllII(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(lIIlIIIIlIIIlll);
    }

    private static boolean lllIIIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIlIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void lIIlIIIIlIlllIl;
        int[] nArray = new int[lIIIlIIlI[12]];
        nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[13];
        nArray[v.lIIIlIIlI[0]] = lIIIlIIlI[7];
        nArray[v.lIIIlIIlI[5]] = lIIIlIIlI[10];
        nArray[v.lIIIlIIlI[11]] = lIIIlIIlI[14];
        nArray[v.lIIIlIIlI[6]] = lIIIlIIlI[15];
        nArray[v.lIIIlIIlI[16]] = lIIIlIIlI[17];
        int[] nArray2 = nArray;
        int lIIlIIIIlIlllII = lIIIlIIlI[1];
        while (v.lllIIIlIlll(lIIlIIIIlIlllII, ((void)lIIlIIIIlIlllIl).length)) {
            int[] nArray3 = new int[lIIIlIIlI[0]];
            nArray3[v.lIIIlIIlI[1]] = lIIlIIIIlIlllIl[lIIlIIIIlIlllII];
            if (v.lllIIIllIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIlIIlI[1];
            }
            ++lIIlIIIIlIlllII;

            if (((0x7B ^ 0x2C) & ~(0x43 ^ 0x14)) >= ((0xF2 ^ 0xB2) & ~(0xD8 ^ 0x98))) continue;
            return false;
        }
        return lIIIlIIlI[0];
    }

    static {
        v.lllIIIlIlIl();
        v.lllIIIlIlII();
        cL = new WorldPoint(lIIIlIIlI[91], lIIIlIIlI[92], lIIIlIIlI[1]);
        cM = new WorldPoint(lIIIlIIlI[93], lIIIlIIlI[94], lIIIlIIlI[1]);
        cN = new WorldPoint(lIIIlIIlI[95], lIIIlIIlI[96], lIIIlIIlI[1]);
        cO = new WorldPoint(lIIIlIIlI[97], lIIIlIIlI[98], lIIIlIIlI[1]);
        cP = new WorldPoint(lIIIlIIlI[99], lIIIlIIlI[100], lIIIlIIlI[1]);
        cQ = new WorldPoint(lIIIlIIlI[101], lIIIlIIlI[102], lIIIlIIlI[1]);
        cR = new WorldPoint(lIIIlIIlI[103], lIIIlIIlI[104], lIIIlIIlI[1]);
        cS = new WorldPoint(lIIIlIIlI[91], lIIIlIIlI[105], lIIIlIIlI[1]);
        cT = new WorldPoint(lIIIlIIlI[106], lIIIlIIlI[107], lIIIlIIlI[1]);
        bv = new ArrayList<d>();
        cU = lIIIlIIlI[30];
        cV = new WorldArea(lIIIlIIlI[93], lIIIlIIlI[108], lIIIlIIlI[26], lIIIlIIlI[47], lIIIlIIlI[1]);
        String[] stringArray = new String[lIIIlIIlI[11]];
        stringArray[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[109]];
        stringArray[v.lIIIlIIlI[0]] = lIIIIllll[lIIIlIIlI[110]];
        stringArray[v.lIIIlIIlI[5]] = lIIIIllll[lIIIlIIlI[111]];
        bR = stringArray;
    }

    private static boolean lllIIIlllIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean V() {
        int n2;
        if (!v.lllIIlIIIIl(Quests.getState((Quest)Quest.FIGHT_ARENA), QuestState.FINISHED) || v.lllIIIllIIl(e.j(cU), lIIIlIIlI[27])) {
            n2 = lIIIlIIlI[0];

            }
        } else {
            n2 = lIIIlIIlI[1];
        }
        return n2 != 0;
    }

    private static boolean lllIIIllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIIlIIIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllIIIllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lllIIIlIlII() {
        lIIIIllll = new String[lIIIlIIlI[112]];
        v.lIIIIllll[v.lIIIlIIlI[1]] = "Finished buying items, switching back to quest";
        v.lIIIIllll[v.lIIIlIIlI[0]] = "Nav to bank";
        v.lIIIIllll[v.lIIIlIIlI[5]] = "Handling banking";
        v.lIIIIllll[v.lIIIlIIlI[11]] = "We are missing runes, switching to BUYING";
        v.lIIIIllll[v.lIIIlIIlI[6]] = "We are missing quest supplies, switching to BUYING";
        v.lIIIIllll[v.lIIIlIIlI[16]] = "Drink";
        v.lIIIIllll[v.lIIIlIIlI[12]] = "Drink";
        v.lIIIIllll[v.lIIIlIIlI[22]] = "Nav to start";
        v.lIIIIllll[v.lIIIlIIlI[23]] = "Lady Servil";
        v.lIIIIllll[v.lIIIlIIlI[24]] = "Nav to armour";
        v.lIIIIllll[v.lIIIlIIlI[18]] = "Getting armour";
        v.lIIIIllll[v.lIIIlIIlI[25]] = "Door";
        v.lIIIIllll[v.lIIIlIIlI[26]] = "Open";
        v.lIIIIllll[v.lIIIlIIlI[3]] = "Chest";
        v.lIIIIllll[v.lIIIlIIlI[27]] = "Door";
        v.lIIIIllll[v.lIIIlIIlI[28]] = "Open";
        v.lIIIIllll[v.lIIIlIIlI[29]] = "Chest";
        v.lIIIIllll[v.lIIIlIIlI[30]] = "Chest";
        v.lIIIIllll[v.lIIIlIIlI[31]] = "Open";
        v.lIIIIllll[v.lIIIlIIlI[32]] = "Chest";
        v.lIIIIllll[v.lIIIlIIlI[33]] = "Open";
        v.lIIIIllll[v.lIIIlIIlI[34]] = "Chest";
        v.lIIIIllll[v.lIIIlIIlI[35]] = "Search";
        v.lIIIIllll[v.lIIIlIIlI[36]] = "Chest";
        v.lIIIIllll[v.lIIIlIIlI[37]] = "Search";
        v.lIIIIllll[v.lIIIlIIlI[21]] = "Wear";
        v.lIIIIllll[v.lIIIlIIlI[40]] = "Wear";
        v.lIIIIllll[v.lIIIlIIlI[41]] = "Nav to jail";
        v.lIIIIllll[v.lIIIlIIlI[42]] = "Door";
        v.lIIIIllll[v.lIIIlIIlI[43]] = "Open";
        v.lIIIIllll[v.lIIIlIIlI[44]] = "Nav to guard";
        v.lIIIIllll[v.lIIIlIIlI[45]] = "Head Guard";
        v.lIIIIllll[v.lIIIlIIlI[46]] = "Khali brew";
        v.lIIIIllll[v.lIIIlIIlI[47]] = "Nav to brew";
        v.lIIIIllll[v.lIIIlIIlI[48]] = "Khazard Barman";
        v.lIIIIllll[v.lIIIlIIlI[49]] = "Khali brew";
        v.lIIIIllll[v.lIIIlIIlI[50]] = "Nav to guard";
        v.lIIIIllll[v.lIIIlIIlI[51]] = "Nav to guard";
        v.lIIIIllll[v.lIIIlIIlI[52]] = "Head Guard";
        v.lIIIIllll[v.lIIIlIIlI[53]] = "Nav to  sammy";
        v.lIIIIllll[v.lIIIlIIlI[54]] = "Khazard cell keys";
        v.lIIIIllll[v.lIIIlIIlI[55]] = "Khazard Ogre";
        v.lIIIIllll[v.lIIIlIIlI[56]] = "Khazard Ogre";
        v.lIIIIllll[v.lIIIlIIlI[57]] = "Attack";
        v.lIIIIllll[v.lIIIlIIlI[58]] = "Sammy Servil";
        v.lIIIIllll[v.lIIIlIIlI[2]] = "Hengrad";
        v.lIIIIllll[v.lIIIlIIlI[59]] = "Hengrad";
        v.lIIIIllll[v.lIIIlIIlI[60]] = "Hengrad";
        v.lIIIIllll[v.lIIIlIIlI[61]] = "Khazard Scorpion";
        v.lIIIIllll[v.lIIIlIIlI[62]] = "Khazard Scorpion";
        v.lIIIIllll[v.lIIIlIIlI[20]] = "Attack";
        v.lIIIIllll[v.lIIIlIIlI[63]] = "Bouncer";
        v.lIIIIllll[v.lIIIlIIlI[64]] = "Bouncer";
        v.lIIIIllll[v.lIIIlIIlI[65]] = "Attack";
        v.lIIIIllll[v.lIIIlIIlI[66]] = "General Khazard";
        v.lIIIIllll[v.lIIIlIIlI[67]] = "Break";
        v.lIIIIllll[v.lIIIlIIlI[71]] = "Nav to start";
        v.lIIIIllll[v.lIIIlIIlI[72]] = "General Khazard";
        v.lIIIIllll[v.lIIIlIIlI[76]] = "Castle Wars";
        v.lIIIIllll[v.lIIIlIIlI[79]] = "Lady Servil";
        v.lIIIIllll[v.lIIIlIIlI[86]] = "Fight Arena";
        v.lIIIIllll[v.lIIIlIIlI[87]] = "ring of wealth (";
        v.lIIIIllll[v.lIIIlIIlI[88]] = "dueling";
        v.lIIIIllll[v.lIIIlIIlI[89]] = "dueling";
        v.lIIIIllll[v.lIIIlIIlI[90]] = "Prison Gate";
        v.lIIIIllll[v.lIIIlIIlI[109]] = "Can I help you?";
        v.lIIIIllll[v.lIIIlIIlI[110]] = "I'd like a Khali Brew please.";
        v.lIIIIllll[v.lIIIlIIlI[111]] = "Yes.";
    }
}

