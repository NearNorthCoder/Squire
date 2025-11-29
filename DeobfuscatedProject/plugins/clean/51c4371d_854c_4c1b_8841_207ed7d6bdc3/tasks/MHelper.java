/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 */
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.AHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.BHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.DHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.EHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.IHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.KHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.LHelper;
import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;

public class MHelper
implements F {
    
    public static  boolean bz;
    
    public static  List<d> bB;

    private static boolean llIlIlllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIlllIIl(int n2) {
        return n2 > 0;
    }

    private static void llIlIllIIll() {
        lIIIIIIlI = new String[lIIIIIIll[62]];
        m.lIIIIIIlI[m.lIIIIIIll[0]] = "Buying items";
        m.lIIIIIIlI[m.lIIIIIIll[1]] = "Finished buying items, switching back to magic training";
        m.lIIIIIIlI[m.lIIIIIIll[2]] = "Navigating to bank";
        m.lIIIIIIlI[m.lIIIIIIll[3]] = "Handling banking";
        m.lIIIIIIlI[m.lIIIIIIll[6]] = "We are missing supplies, switching to BUYING";
        m.lIIIIIIlI[m.lIIIIIIll[5]] = "Take";
        m.lIIIIIIlI[m.lIIIIIIll[30]] = "Wield";
        m.lIIIIIIlI[m.lIIIIIIll[32]] = "Wear";
        m.lIIIIIIlI[m.lIIIIIIll[33]] = "Wield";
        m.lIIIIIIlI[m.lIIIIIIll[35]] = "Wield";
        m.lIIIIIIlI[m.lIIIIIIll[24]] = "Wield";
        m.lIIIIIIlI[m.lIIIIIIll[37]] = "Wear";
        m.lIIIIIIlI[m.lIIIIIIll[38]] = "Wear";
        m.lIIIIIIlI[m.lIIIIIIll[39]] = "Wear";
        m.lIIIIIIlI[m.lIIIIIIll[40]] = "Wear";
        m.lIIIIIIlI[m.lIIIIIIll[42]] = "Wear";
        m.lIIIIIIlI[m.lIIIIIIll[43]] = "Wear";
        m.lIIIIIIlI[m.lIIIIIIll[44]] = "Wear";
        m.lIIIIIIlI[m.lIIIIIIll[45]] = "Wield";
        m.lIIIIIIlI[m.lIIIIIIll[60]] = "Range training";
        m.lIIIIIIlI[m.lIIIIIIll[31]] = "ring of wealth (";
        m.lIIIIIIlI[m.lIIIIIIll[61]] = "bow";
    }

    private static boolean llIlIlllIII(Object object) {
        return object != null;
    }

    private static void ar() {
        block34: {
            block33: {
                int[] nArray = new int[lIIIIIIll[1]];
                nArray[m.lIIIIIIll[0]] = lIIIIIIll[28];
                if (!m.llIlIllIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block33;
                int[] nArray2 = new int[lIIIIIIll[1]];
                nArray2[m.lIIIIIIll[0]] = lIIIIIIll[29];
                if (!m.llIlIllIlll(Equipment.contains((int[])nArray2) ? 1 : 0)) break block33;
                int[] nArray3 = new int[lIIIIIIll[1]];
                nArray3[m.lIIIIIIll[0]] = lIIIIIIll[16];
                if (!m.llIlIllIlll(Equipment.contains((int[])nArray3) ? 1 : 0)) break block33;
                int[] nArray4 = new int[lIIIIIIll[1]];
                nArray4[m.lIIIIIIll[0]] = lIIIIIIll[11];
                if (m.llIlIllIlll(Equipment.contains((int[])nArray4) ? 1 : 0) && !m.llIlIllIlIl(Equipment.contains(item -> item.getName().contains(lIIIIIIlI[lIIIIIIll[61]])) ? 1 : 0)) break block34;
            }
            if (m.llIlIlllIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
            }
        }
        if (m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[27])) {
            int[] nArray = new int[lIIIIIIll[1]];
            nArray[m.lIIIIIIll[0]] = lIIIIIIll[28];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray5 = new int[lIIIIIIll[1]];
                nArray5[m.lIIIIIIll[0]] = lIIIIIIll[28];
                Inventory.getFirst((int[])nArray5).interact(lIIIIIIlI[lIIIIIIll[30]]);
            }
            int[] nArray6 = new int[lIIIIIIll[1]];
            nArray6[m.lIIIIIIll[0]] = lIIIIIIll[12];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray6) ? 1 : 0) && m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[5])) {
                e.l(lIIIIIIll[12]);
            }
            int[] nArray7 = new int[lIIIIIIll[1]];
            nArray7[m.lIIIIIIll[0]] = lIIIIIIll[13];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray7) ? 1 : 0) && m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[5]) && m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[31])) {
                e.l(lIIIIIIll[13]);
            }
            int[] nArray8 = new int[lIIIIIIll[1]];
            nArray8[m.lIIIIIIll[0]] = lIIIIIIll[14];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray8) ? 1 : 0) && m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[31])) {
                e.l(lIIIIIIll[14]);
            }
            int[] nArray9 = new int[lIIIIIIll[1]];
            nArray9[m.lIIIIIIll[0]] = lIIIIIIll[15];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                e.l(lIIIIIIll[15]);
            }
        }
        if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[31])) {
            int[] nArray = new int[lIIIIIIll[1]];
            nArray[m.lIIIIIIll[0]] = lIIIIIIll[18];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray10 = new int[lIIIIIIll[1]];
                nArray10[m.lIIIIIIll[0]] = lIIIIIIll[18];
                Inventory.getFirst((int[])nArray10).interact(lIIIIIIlI[lIIIIIIll[32]]);
            }
        }
        if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[27])) {
            int[] nArray = new int[lIIIIIIll[1]];
            nArray[m.lIIIIIIll[0]] = lIIIIIIll[29];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray11 = new int[lIIIIIIll[1]];
                nArray11[m.lIIIIIIll[0]] = lIIIIIIll[29];
                Inventory.getFirst((int[])nArray11).interact(lIIIIIIlI[lIIIIIIll[33]]);
            }
            int[] nArray12 = new int[lIIIIIIll[1]];
            nArray12[m.lIIIIIIll[0]] = lIIIIIIll[34];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                int[] nArray13 = new int[lIIIIIIll[1]];
                nArray13[m.lIIIIIIll[0]] = lIIIIIIll[34];
                Inventory.getFirst((int[])nArray13).interact(lIIIIIIlI[lIIIIIIll[35]]);
            }
            int[] nArray14 = new int[lIIIIIIll[1]];
            nArray14[m.lIIIIIIll[0]] = lIIIIIIll[16];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIIIIIIll[1]];
                nArray15[m.lIIIIIIll[0]] = lIIIIIIll[16];
                Inventory.getFirst((int[])nArray15).interact(lIIIIIIlI[lIIIIIIll[24]]);
            }
        }
        if (m.llIlIllIllI(Skills.getLevel((Skill)Skill.DEFENCE), lIIIIIIll[36])) {
            int[] nArray = new int[lIIIIIIll[1]];
            nArray[m.lIIIIIIll[0]] = lIIIIIIll[19];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIIIIIll[1]];
                nArray16[m.lIIIIIIll[0]] = lIIIIIIll[19];
                Inventory.getFirst((int[])nArray16).interact(lIIIIIIlI[lIIIIIIll[37]]);
            }
        }
        if (m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) {
            int[] nArray = new int[lIIIIIIll[1]];
            nArray[m.lIIIIIIll[0]] = lIIIIIIll[17];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray17 = new int[lIIIIIIll[1]];
                nArray17[m.lIIIIIIll[0]] = lIIIIIIll[17];
                Inventory.getFirst((int[])nArray17).interact(lIIIIIIlI[lIIIIIIll[38]]);
            }
        }
        int[] nArray = new int[lIIIIIIll[1]];
        nArray[m.lIIIIIIll[0]] = lIIIIIIll[20];
        if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray18 = new int[lIIIIIIll[1]];
            nArray18[m.lIIIIIIll[0]] = lIIIIIIll[20];
            Inventory.getFirst((int[])nArray18).interact(lIIIIIIlI[lIIIIIIll[39]]);
        }
        int[] nArray19 = new int[lIIIIIIll[1]];
        nArray19[m.lIIIIIIll[0]] = lIIIIIIll[21];
        if (m.llIlIllIlIl(Inventory.contains((int[])nArray19) ? 1 : 0)) {
            int[] nArray20 = new int[lIIIIIIll[1]];
            nArray20[m.lIIIIIIll[0]] = lIIIIIIll[21];
            Inventory.getFirst((int[])nArray20).interact(lIIIIIIlI[lIIIIIIll[40]]);
        }
        if (m.llIlIllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIll[41])) {
            int[] nArray21 = new int[lIIIIIIll[1]];
            nArray21[m.lIIIIIIll[0]] = lIIIIIIll[8];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                int[] nArray22 = new int[lIIIIIIll[1]];
                nArray22[m.lIIIIIIll[0]] = lIIIIIIll[8];
                if (m.llIlIllIlll(Equipment.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[lIIIIIIll[1]];
                    nArray23[m.lIIIIIIll[0]] = lIIIIIIll[8];
                    Inventory.getFirst((int[])nArray23).interact(lIIIIIIlI[lIIIIIIll[42]]);
                }
            }
            if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) {
                int[] nArray24 = new int[lIIIIIIll[1]];
                nArray24[m.lIIIIIIll[0]] = lIIIIIIll[9];
                if (m.llIlIllIlIl(Inventory.contains((int[])nArray24) ? 1 : 0)) {
                    int[] nArray25 = new int[lIIIIIIll[1]];
                    nArray25[m.lIIIIIIll[0]] = lIIIIIIll[9];
                    if (m.llIlIllIlll(Equipment.contains((int[])nArray25) ? 1 : 0)) {
                        int[] nArray26 = new int[lIIIIIIll[1]];
                        nArray26[m.lIIIIIIll[0]] = lIIIIIIll[9];
                        Inventory.getFirst((int[])nArray26).interact(lIIIIIIlI[lIIIIIIll[43]]);
                    }
                }
            }
            if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7]) && m.llIlIlllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIIIIIIll[36])) {
                int[] nArray27 = new int[lIIIIIIll[1]];
                nArray27[m.lIIIIIIll[0]] = lIIIIIIll[10];
                if (m.llIlIllIlIl(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                    int[] nArray28 = new int[lIIIIIIll[1]];
                    nArray28[m.lIIIIIIll[0]] = lIIIIIIll[10];
                    if (m.llIlIllIlll(Equipment.contains((int[])nArray28) ? 1 : 0)) {
                        int[] nArray29 = new int[lIIIIIIll[1]];
                        nArray29[m.lIIIIIIll[0]] = lIIIIIIll[10];
                        Inventory.getFirst((int[])nArray29).interact(lIIIIIIlI[lIIIIIIll[44]]);
                    }
                }
            }
            if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) {
                int[] nArray30 = new int[lIIIIIIll[1]];
                nArray30[m.lIIIIIIll[0]] = lIIIIIIll[11];
                if (m.llIlIllIlIl(Inventory.contains((int[])nArray30) ? 1 : 0)) {
                    int[] nArray31 = new int[lIIIIIIll[1]];
                    nArray31[m.lIIIIIIll[0]] = lIIIIIIll[11];
                    Inventory.getFirst((int[])nArray31).interact(lIIIIIIlI[lIIIIIIll[45]]);
                }
            }
        }
    }

    public static void aq() {
        if (m.llIlIllIlIl(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lIIIIIIlI[lIIIIIIll[0]];
            b.a(bB);
            if (m.llIlIllIllI(bB.size(), lIIIIIIll[1])) {
                System.out.println(lIIIIIIlI[lIIIIIIll[1]]);
                bz = lIIIIIIll[0];
            }
        }
        if (m.llIlIllIlll(bz ? 1 : 0)) {
            BankLocation lIIlIllIIlIIlII;
            if (m.llIlIllIlll(m.ac() ? 1 : 0)) {
                lIIlIllIIlIIlII = BankLocation.getNearest();
                if (m.llIlIlllIII(lIIlIllIIlIIlII) && m.llIlIllIlll(lIIlIllIIlIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIIIIIIlI[lIIIIIIll[2]];
                    a.a(lIIlIllIIlIIlII);
                }
                if (m.llIlIlllIII(lIIlIllIIlIIlII) && m.llIlIllIlIl(lIIlIllIIlIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIIIIIIlI[lIIIIIIll[3]];
                    if (m.llIlIllIlll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIll[4]);

                        Time.sleepTicks((int)lIIIIIIll[3]);

                    }
                    if (m.llIlIllIlIl(Bank.isOpen() ? 1 : 0)) {
                        if (m.llIlIlllIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIIIIll[5]);

                        }
                        if (m.llIlIlllIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIIIIll[2]);

                        }
                        if (m.llIlIllIlll(m.ad() ? 1 : 0)) {
                            m.ag();
                            System.out.println(lIIIIIIlI[lIIIIIIll[6]]);
                            bz = lIIIIIIll[1];
                            return;
                        }
                        if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) {
                            a.a(lIIIIIIll[8], lIIIIIIll[1]);
                            a.a(lIIIIIIll[9], lIIIIIIll[1]);
                            a.a(lIIIIIIll[10], lIIIIIIll[1]);
                            Bank.withdrawAll((int)lIIIIIIll[11], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        }
                        if (m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) {
                            a.a(lIIIIIIll[12], lIIIIIIll[1]);
                            a.a(lIIIIIIll[13], lIIIIIIll[1]);
                            a.a(lIIIIIIll[14], lIIIIIIll[1]);
                            Bank.withdrawAll((int)lIIIIIIll[15], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIIIIIll[1]);

                            Bank.withdrawAll((int)lIIIIIIll[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIIIIIll[1]);

                            a.a(lIIIIIIll[17], lIIIIIIll[1]);
                        }
                        a.a(lIIIIIIll[18], lIIIIIIll[1]);
                        a.a(lIIIIIIll[19], lIIIIIIll[1]);
                        a.a(lIIIIIIll[20], lIIIIIIll[1]);
                        a.a(lIIIIIIll[21], lIIIIIIll[1]);
                        a.a(lIIIIIIll[22], lIIIIIIll[1]);
                        a.a(lIIIIIIll[23], lIIIIIIll[24]);
                        a.a(lIIIIIIll[25], lIIIIIIll[24]);
                        a.a(lIIIIIIll[26], Inventory.getFreeSlots());
                    }
                }
            }
            if (m.llIlIllIlIl(m.ac() ? 1 : 0)) {
                m.ar();
                if (m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[27])) {
                    l.aa();
                }
                if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[27])) {
                    lIIlIllIIlIIlII = TileItems.getNearest(tileItem -> {
                        int n2;
                        if (m.llIlIllllII(tileItem.getId(), lIIIIIIll[16]) && m.llIlIlllIlI(tileItem.getQuantity(), lIIIIIIll[42])) {
                            n2 = lIIIIIIll[1];

                            if (((0x17 ^ 4) & ~(0x5D ^ 0x4E)) != 0) {
                                return (3 & ~3) != 0;
                            }
                        } else {
                            n2 = lIIIIIIll[0];
                        }
                        return n2 != 0;
                    });
                    if (m.llIlIlllIII(lIIlIllIIlIIlII)) {
                        lIIlIllIIlIIlII.interact(lIIIIIIlI[lIIIIIIll[5]]);
                        Time.sleepTicks((int)lIIIIIIll[6]);

                    }
                    k.Y();
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ad() {
        int n2;
        block20: {
            block21: {
                if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7]) && m.llIlIllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIll[41]) && m.llIlIlllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIIIIIIll[36])) {
                    int n3;
                    int[] nArray = new int[lIIIIIIll[1]];
                    nArray[m.lIIIIIIll[0]] = lIIIIIIll[9];
                    if (m.llIlIllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIIIIIll[1]];
                        nArray2[m.lIIIIIIll[0]] = lIIIIIIll[10];
                        if (m.llIlIllIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIIIIIIll[1]];
                            nArray3[m.lIIIIIIll[0]] = lIIIIIIll[18];
                            if (m.llIlIllIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIIIIIll[1]];
                                nArray4[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                if (m.llIlIllIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    int[] nArray5 = new int[lIIIIIIll[1]];
                                    nArray5[m.lIIIIIIll[0]] = lIIIIIIll[11];
                                    if (m.llIlIllIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                        int[] nArray6 = new int[lIIIIIIll[1]];
                                        nArray6[m.lIIIIIIll[0]] = lIIIIIIll[8];
                                        if (m.llIlIllIlIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                            int[] nArray7 = new int[lIIIIIIll[1]];
                                            nArray7[m.lIIIIIIll[0]] = lIIIIIIll[26];
                                            if (m.llIlIllIlIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                n3 = lIIIIIIll[1];

                                                if (3 > 0) return n3 != 0;
                                                return ((4 ^ 0x4C ^ (0x27 ^ 0x65)) & (0x46 ^ 3 ^ (0x5C ^ 0x13) ^ -1)) != 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n3 = lIIIIIIll[0];
                    return n3 != 0;
                }
                if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[27]) && m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) {
                    int n4;
                    int[] nArray = new int[lIIIIIIll[1]];
                    nArray[m.lIIIIIIll[0]] = lIIIIIIll[17];
                    if (m.llIlIllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[lIIIIIIll[1]];
                        nArray8[m.lIIIIIIll[0]] = lIIIIIIll[19];
                        if (m.llIlIllIlIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[lIIIIIIll[1]];
                            nArray9[m.lIIIIIIll[0]] = lIIIIIIll[18];
                            if (m.llIlIllIlIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIIIIIll[1]];
                                nArray10[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                if (m.llIlIllIlIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                    int[] nArray11 = new int[lIIIIIIll[1]];
                                    nArray11[m.lIIIIIIll[0]] = lIIIIIIll[16];
                                    if (m.llIlIllIlIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                        int[] nArray12 = new int[lIIIIIIll[1]];
                                        nArray12[m.lIIIIIIll[0]] = lIIIIIIll[26];
                                        if (m.llIlIllIlIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                            n4 = lIIIIIIll[1];

                                            if (null == null) return n4 != 0;
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n4 = lIIIIIIll[0];
                    return n4 != 0;
                }
                int[] nArray = new int[lIIIIIIll[1]];
                nArray[m.lIIIIIIll[0]] = lIIIIIIll[17];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                int[] nArray13 = new int[lIIIIIIll[1]];
                nArray13[m.lIIIIIIll[0]] = lIIIIIIll[19];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray13) ? 1 : 0)) break block20;
                int[] nArray14 = new int[lIIIIIIll[1]];
                nArray14[m.lIIIIIIll[0]] = lIIIIIIll[18];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block20;
                int[] nArray15 = new int[lIIIIIIll[1]];
                nArray15[m.lIIIIIIll[0]] = lIIIIIIll[20];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block20;
                int[] nArray16 = new int[lIIIIIIll[1]];
                nArray16[m.lIIIIIIll[0]] = lIIIIIIll[12];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray16) ? 1 : 0)) break block20;
                int[] nArray17 = new int[lIIIIIIll[1]];
                nArray17[m.lIIIIIIll[0]] = lIIIIIIll[23];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray17) ? 1 : 0)) break block20;
                int[] nArray18 = new int[lIIIIIIll[1]];
                nArray18[m.lIIIIIIll[0]] = lIIIIIIll[13];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray18) ? 1 : 0)) break block20;
                int[] nArray19 = new int[lIIIIIIll[1]];
                nArray19[m.lIIIIIIll[0]] = lIIIIIIll[14];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray19) ? 1 : 0)) break block20;
                int[] nArray20 = new int[lIIIIIIll[1]];
                nArray20[m.lIIIIIIll[0]] = lIIIIIIll[15];
                if (!m.llIlIllIlll(Bank.contains((int[])nArray20) ? 1 : 0)) break block21;
                int[] nArray21 = new int[lIIIIIIll[1]];
                nArray21[m.lIIIIIIll[0]] = lIIIIIIll[15];
                if (!m.llIlIllIlIl(Equipment.contains((int[])nArray21) ? 1 : 0)) break block20;
            }
            int[] nArray = new int[lIIIIIIll[1]];
            nArray[m.lIIIIIIll[0]] = lIIIIIIll[16];
            if (m.llIlIllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray22 = new int[lIIIIIIll[1]];
                nArray22[m.lIIIIIIll[0]] = lIIIIIIll[26];
                if (m.llIlIllIlIl(Bank.contains((int[])nArray22) ? 1 : 0)) {
                    n2 = lIIIIIIll[1];

                    if (-3 <= 0) return n2 != 0;
                    return ((0x6B ^ 0x17 ^ (0x6D ^ 0x44)) & (38 + 52 - -53 + 94 ^ 175 + 131 - 283 + 161 ^ -1)) != 0;
                }
            }
        }
        n2 = lIIIIIIll[0];
        return n2 != 0;
    }

        return String.valueOf(lIIlIllIIIIIIlI);
    }

    private static boolean llIlIlllIll(Object object, Object object2) {
        return object != object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        block40: {
            block48: {
                block47: {
                    block46: {
                        block45: {
                            block44: {
                                block43: {
                                    block42: {
                                        block41: {
                                            block39: {
                                                block32: {
                                                    int n3;
                                                    block34: {
                                                        block38: {
                                                            block37: {
                                                                block36: {
                                                                    block35: {
                                                                        block33: {
                                                                            block24: {
                                                                                int n4;
                                                                                block26: {
                                                                                    block31: {
                                                                                        block30: {
                                                                                            block29: {
                                                                                                block28: {
                                                                                                    block27: {
                                                                                                        block25: {
                                                                                                            block16: {
                                                                                                                int n5;
                                                                                                                block18: {
                                                                                                                    block23: {
                                                                                                                        block22: {
                                                                                                                            block21: {
                                                                                                                                block20: {
                                                                                                                                    block19: {
                                                                                                                                        block17: {
                                                                                                                                            if (!m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7]) || !m.llIlIllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIll[41]) || !m.llIlIlllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIIIIIIll[36])) break block16;
                                                                                                                                            int[] nArray = new int[lIIIIIIll[1]];
                                                                                                                                            nArray[m.lIIIIIIll[0]] = lIIIIIIll[9];
                                                                                                                                            if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block17;
                                                                                                                                            int[] nArray2 = new int[lIIIIIIll[1]];
                                                                                                                                            nArray2[m.lIIIIIIll[0]] = lIIIIIIll[9];
                                                                                                                                            if (!m.llIlIllIlIl(Equipment.contains((int[])nArray2) ? 1 : 0)) break block18;
                                                                                                                                        }
                                                                                                                                        int[] nArray = new int[lIIIIIIll[1]];
                                                                                                                                        nArray[m.lIIIIIIll[0]] = lIIIIIIll[10];
                                                                                                                                        if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block19;
                                                                                                                                        int[] nArray3 = new int[lIIIIIIll[1]];
                                                                                                                                        nArray3[m.lIIIIIIll[0]] = lIIIIIIll[10];
                                                                                                                                        if (!m.llIlIllIlIl(Equipment.contains((int[])nArray3) ? 1 : 0)) break block18;
                                                                                                                                    }
                                                                                                                                    int[] nArray = new int[lIIIIIIll[1]];
                                                                                                                                    nArray[m.lIIIIIIll[0]] = lIIIIIIll[18];
                                                                                                                                    if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                                                                                                    int[] nArray4 = new int[lIIIIIIll[1]];
                                                                                                                                    nArray4[m.lIIIIIIll[0]] = lIIIIIIll[18];
                                                                                                                                    if (!m.llIlIllIlIl(Equipment.contains((int[])nArray4) ? 1 : 0)) break block18;
                                                                                                                                }
                                                                                                                                int[] nArray = new int[lIIIIIIll[1]];
                                                                                                                                nArray[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                                                                                                                if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                                                                                                                                int[] nArray5 = new int[lIIIIIIll[1]];
                                                                                                                                nArray5[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                                                                                                                if (!m.llIlIllIlIl(Equipment.contains((int[])nArray5) ? 1 : 0)) break block18;
                                                                                                                            }
                                                                                                                            int[] nArray = new int[lIIIIIIll[1]];
                                                                                                                            nArray[m.lIIIIIIll[0]] = lIIIIIIll[11];
                                                                                                                            if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                                                                            int[] nArray6 = new int[lIIIIIIll[1]];
                                                                                                                            nArray6[m.lIIIIIIll[0]] = lIIIIIIll[11];
                                                                                                                            if (!m.llIlIllIlIl(Equipment.contains((int[])nArray6) ? 1 : 0)) break block18;
                                                                                                                        }
                                                                                                                        int[] nArray = new int[lIIIIIIll[1]];
                                                                                                                        nArray[m.lIIIIIIll[0]] = lIIIIIIll[8];
                                                                                                                        if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                                                                                                        int[] nArray7 = new int[lIIIIIIll[1]];
                                                                                                                        nArray7[m.lIIIIIIll[0]] = lIIIIIIll[8];
                                                                                                                        if (!m.llIlIllIlIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block18;
                                                                                                                    }
                                                                                                                    int[] nArray = new int[lIIIIIIll[1]];
                                                                                                                    nArray[m.lIIIIIIll[0]] = lIIIIIIll[26];
                                                                                                                    if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                                                        n5 = lIIIIIIll[1];

                                                                                                                        if (null == null) return n5 != 0;
                                                                                                                        return false;
                                                                                                                    }
                                                                                                                }
                                                                                                                n5 = lIIIIIIll[0];
                                                                                                                return n5 != 0;
                                                                                                            }
                                                                                                            if (!m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7]) || !m.llIlIllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIll[41]) || !m.llIlIllIllI(Skills.getLevel((Skill)Skill.DEFENCE), lIIIIIIll[36])) break block24;
                                                                                                            int[] nArray = new int[lIIIIIIll[1]];
                                                                                                            nArray[m.lIIIIIIll[0]] = lIIIIIIll[9];
                                                                                                            if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
                                                                                                            int[] nArray8 = new int[lIIIIIIll[1]];
                                                                                                            nArray8[m.lIIIIIIll[0]] = lIIIIIIll[9];
                                                                                                            if (!m.llIlIllIlIl(Equipment.contains((int[])nArray8) ? 1 : 0)) break block26;
                                                                                                        }
                                                                                                        int[] nArray = new int[lIIIIIIll[1]];
                                                                                                        nArray[m.lIIIIIIll[0]] = lIIIIIIll[19];
                                                                                                        if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block27;
                                                                                                        int[] nArray9 = new int[lIIIIIIll[1]];
                                                                                                        nArray9[m.lIIIIIIll[0]] = lIIIIIIll[19];
                                                                                                        if (!m.llIlIllIlIl(Equipment.contains((int[])nArray9) ? 1 : 0)) break block26;
                                                                                                    }
                                                                                                    int[] nArray = new int[lIIIIIIll[1]];
                                                                                                    nArray[m.lIIIIIIll[0]] = lIIIIIIll[18];
                                                                                                    if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                                                                                                    int[] nArray10 = new int[lIIIIIIll[1]];
                                                                                                    nArray10[m.lIIIIIIll[0]] = lIIIIIIll[18];
                                                                                                    if (!m.llIlIllIlIl(Equipment.contains((int[])nArray10) ? 1 : 0)) break block26;
                                                                                                }
                                                                                                int[] nArray = new int[lIIIIIIll[1]];
                                                                                                nArray[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                                                                                if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block29;
                                                                                                int[] nArray11 = new int[lIIIIIIll[1]];
                                                                                                nArray11[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                                                                                if (!m.llIlIllIlIl(Equipment.contains((int[])nArray11) ? 1 : 0)) break block26;
                                                                                            }
                                                                                            int[] nArray = new int[lIIIIIIll[1]];
                                                                                            nArray[m.lIIIIIIll[0]] = lIIIIIIll[11];
                                                                                            if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block30;
                                                                                            int[] nArray12 = new int[lIIIIIIll[1]];
                                                                                            nArray12[m.lIIIIIIll[0]] = lIIIIIIll[11];
                                                                                            if (!m.llIlIllIlIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block26;
                                                                                        }
                                                                                        int[] nArray = new int[lIIIIIIll[1]];
                                                                                        nArray[m.lIIIIIIll[0]] = lIIIIIIll[8];
                                                                                        if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                                        int[] nArray13 = new int[lIIIIIIll[1]];
                                                                                        nArray13[m.lIIIIIIll[0]] = lIIIIIIll[8];
                                                                                        if (!m.llIlIllIlIl(Equipment.contains((int[])nArray13) ? 1 : 0)) break block26;
                                                                                    }
                                                                                    int[] nArray = new int[lIIIIIIll[1]];
                                                                                    nArray[m.lIIIIIIll[0]] = lIIIIIIll[26];
                                                                                    if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                        n4 = lIIIIIIll[1];

                                                                                        if (-1 <= -1) return n4 != 0;
                                                                                        return ((0x91 ^ 0x8C ^ (0xBE ^ 0xBB)) & (0x5F ^ 0x6B ^ (1 ^ 0x2D) ^ -1)) != 0;
                                                                                    }
                                                                                }
                                                                                n4 = lIIIIIIll[0];
                                                                                return n4 != 0;
                                                                            }
                                                                            if (!m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[27]) || !m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) break block32;
                                                                            int[] nArray = new int[lIIIIIIll[1]];
                                                                            nArray[m.lIIIIIIll[0]] = lIIIIIIll[17];
                                                                            if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                            int[] nArray14 = new int[lIIIIIIll[1]];
                                                                            nArray14[m.lIIIIIIll[0]] = lIIIIIIll[17];
                                                                            if (!m.llIlIllIlIl(Equipment.contains((int[])nArray14) ? 1 : 0)) break block34;
                                                                        }
                                                                        int[] nArray = new int[lIIIIIIll[1]];
                                                                        nArray[m.lIIIIIIll[0]] = lIIIIIIll[19];
                                                                        if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block35;
                                                                        int[] nArray15 = new int[lIIIIIIll[1]];
                                                                        nArray15[m.lIIIIIIll[0]] = lIIIIIIll[19];
                                                                        if (!m.llIlIllIlIl(Equipment.contains((int[])nArray15) ? 1 : 0)) break block34;
                                                                    }
                                                                    int[] nArray = new int[lIIIIIIll[1]];
                                                                    nArray[m.lIIIIIIll[0]] = lIIIIIIll[18];
                                                                    if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block36;
                                                                    int[] nArray16 = new int[lIIIIIIll[1]];
                                                                    nArray16[m.lIIIIIIll[0]] = lIIIIIIll[18];
                                                                    if (!m.llIlIllIlIl(Equipment.contains((int[])nArray16) ? 1 : 0)) break block34;
                                                                }
                                                                int[] nArray = new int[lIIIIIIll[1]];
                                                                nArray[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                                                if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block37;
                                                                int[] nArray17 = new int[lIIIIIIll[1]];
                                                                nArray17[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                                                if (!m.llIlIllIlIl(Equipment.contains((int[])nArray17) ? 1 : 0)) break block34;
                                                            }
                                                            int[] nArray = new int[lIIIIIIll[1]];
                                                            nArray[m.lIIIIIIll[0]] = lIIIIIIll[16];
                                                            if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block38;
                                                            int[] nArray18 = new int[lIIIIIIll[1]];
                                                            nArray18[m.lIIIIIIll[0]] = lIIIIIIll[16];
                                                            if (!m.llIlIllIlIl(Equipment.contains((int[])nArray18) ? 1 : 0)) break block34;
                                                        }
                                                        int[] nArray = new int[lIIIIIIll[1]];
                                                        nArray[m.lIIIIIIll[0]] = lIIIIIIll[26];
                                                        if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                            n3 = lIIIIIIll[1];

                                                            if (1 > 0) return n3 != 0;
                                                            return ((2 ^ (0x4D ^ 0xC)) & (36 + 189 - 6 + 14 ^ 121 + 85 - 67 + 31 ^ -1)) != 0;
                                                        }
                                                    }
                                                    n3 = lIIIIIIll[0];
                                                    return n3 != 0;
                                                }
                                                int[] nArray = new int[lIIIIIIll[1]];
                                                nArray[m.lIIIIIIll[0]] = lIIIIIIll[17];
                                                if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block39;
                                                int[] nArray19 = new int[lIIIIIIll[1]];
                                                nArray19[m.lIIIIIIll[0]] = lIIIIIIll[17];
                                                if (!m.llIlIllIlIl(Equipment.contains((int[])nArray19) ? 1 : 0)) break block40;
                                            }
                                            int[] nArray = new int[lIIIIIIll[1]];
                                            nArray[m.lIIIIIIll[0]] = lIIIIIIll[19];
                                            if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block41;
                                            int[] nArray20 = new int[lIIIIIIll[1]];
                                            nArray20[m.lIIIIIIll[0]] = lIIIIIIll[19];
                                            if (!m.llIlIllIlIl(Equipment.contains((int[])nArray20) ? 1 : 0)) break block40;
                                        }
                                        int[] nArray = new int[lIIIIIIll[1]];
                                        nArray[m.lIIIIIIll[0]] = lIIIIIIll[18];
                                        if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block42;
                                        int[] nArray21 = new int[lIIIIIIll[1]];
                                        nArray21[m.lIIIIIIll[0]] = lIIIIIIll[18];
                                        if (!m.llIlIllIlIl(Equipment.contains((int[])nArray21) ? 1 : 0)) break block40;
                                    }
                                    int[] nArray = new int[lIIIIIIll[1]];
                                    nArray[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                    if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block43;
                                    int[] nArray22 = new int[lIIIIIIll[1]];
                                    nArray22[m.lIIIIIIll[0]] = lIIIIIIll[20];
                                    if (!m.llIlIllIlIl(Equipment.contains((int[])nArray22) ? 1 : 0)) break block40;
                                }
                                int[] nArray = new int[lIIIIIIll[1]];
                                nArray[m.lIIIIIIll[0]] = lIIIIIIll[15];
                                if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block44;
                                int[] nArray23 = new int[lIIIIIIll[1]];
                                nArray23[m.lIIIIIIll[0]] = lIIIIIIll[15];
                                if (!m.llIlIllIlIl(Equipment.contains((int[])nArray23) ? 1 : 0)) break block40;
                            }
                            int[] nArray = new int[lIIIIIIll[1]];
                            nArray[m.lIIIIIIll[0]] = lIIIIIIll[12];
                            if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                            int[] nArray24 = new int[lIIIIIIll[1]];
                            nArray24[m.lIIIIIIll[0]] = lIIIIIIll[12];
                            if (!m.llIlIllIlIl(Equipment.contains((int[])nArray24) ? 1 : 0)) break block40;
                        }
                        int[] nArray = new int[lIIIIIIll[1]];
                        nArray[m.lIIIIIIll[0]] = lIIIIIIll[13];
                        if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block46;
                        int[] nArray25 = new int[lIIIIIIll[1]];
                        nArray25[m.lIIIIIIll[0]] = lIIIIIIll[13];
                        if (!m.llIlIllIlIl(Equipment.contains((int[])nArray25) ? 1 : 0)) break block40;
                    }
                    int[] nArray = new int[lIIIIIIll[1]];
                    nArray[m.lIIIIIIll[0]] = lIIIIIIll[14];
                    if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block47;
                    int[] nArray26 = new int[lIIIIIIll[1]];
                    nArray26[m.lIIIIIIll[0]] = lIIIIIIll[14];
                    if (!m.llIlIllIlIl(Equipment.contains((int[])nArray26) ? 1 : 0)) break block40;
                }
                int[] nArray = new int[lIIIIIIll[1]];
                nArray[m.lIIIIIIll[0]] = lIIIIIIll[16];
                if (!m.llIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block48;
                int[] nArray27 = new int[lIIIIIIll[1]];
                nArray27[m.lIIIIIIll[0]] = lIIIIIIll[16];
                if (!m.llIlIllIlIl(Equipment.contains((int[])nArray27) ? 1 : 0)) break block40;
            }
            int[] nArray = new int[lIIIIIIll[1]];
            nArray[m.lIIIIIIll[0]] = lIIIIIIll[26];
            if (m.llIlIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIIIIIIll[1];

                if (-(0x64 ^ 0x61) < 0) return n2 != 0;
                return false;
            }
        }
        n2 = lIIIIIIll[0];
        return n2 != 0;
    }

    private static boolean llIlIllIlll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean W() {
        boolean bl;
        if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) {
            bl = lIIIIIIll[1];

            if ((0x4D ^ 0x49) <= 0) {
                return false;
            }
        } else {
            bl = lIIIIIIll[0];
        }
        return bl;
    }

    @Override
    public boolean T() {
        return lIIIIIIll[0];
    }

    @Override
    public int U() {
        try {
            m.aq();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 != 3) {
            return (0x64 ^ 0x52 ^ (0xAA ^ 0xB0)) & (15 + 111 - 57 + 66 ^ 2 + 163 - 25 + 31 ^ -1);
        }
        return lIIIIIIll[54];
    }

    @Override
    public String V() {
        return lIIIIIIlI[lIIIIIIll[60]];
    }

    private static boolean llIlIllIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void ag() {
        block30: {
            d lIIlIllIIlIIIII;
            block29: {
                block28: {
                    block27: {
                        Object lIIlIllIIlIIIIl;
                        block25: {
                            block26: {
                                if (!m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[27])) break block25;
                                int[] nArray = new int[lIIIIIIll[1]];
                                nArray[m.lIIIIIIll[0]] = lIIIIIIll[12];
                                if (m.llIlIllIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    d d2 = new DHelper(lIIIIIIll[12], lIIIIIIll[1], lIIIIIIll[46]);
                                    bB.add(d2);

                                }
                                int[] nArray2 = new int[lIIIIIIll[1]];
                                nArray2[m.lIIIIIIll[0]] = lIIIIIIll[13];
                                if (m.llIlIllIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    lIIlIllIIlIIIIl = new DHelper(lIIIIIIll[13], lIIIIIIll[1], lIIIIIIll[46]);
                                    bB.add((DHelper) IIlIllIIlIIIIl);

                                }
                                int[] nArray3 = new int[lIIIIIIll[1]];
                                nArray3[m.lIIIIIIll[0]] = lIIIIIIll[14];
                                if (m.llIlIllIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    lIIlIllIIlIIIIl = new DHelper(lIIIIIIll[14], lIIIIIIll[1], lIIIIIIll[46]);
                                    bB.add((DHelper) IIlIllIIlIIIIl);

                                }
                                int[] nArray4 = new int[lIIIIIIll[1]];
                                nArray4[m.lIIIIIIll[0]] = lIIIIIIll[15];
                                if (!m.llIlIllIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block26;
                                int[] nArray5 = new int[lIIIIIIll[1]];
                                nArray5[m.lIIIIIIll[0]] = lIIIIIIll[15];
                                if (!m.llIlIllIllI(Bank.getFirst((int[])nArray5).getQuantity(), lIIIIIIll[47])) break block25;
                            }
                            lIIlIllIIlIIIIl = new DHelper(lIIIIIIll[15], lIIIIIIll[48], lIIIIIIll[35]);
                            bB.add((DHelper) IIlIllIIlIIIIl);

                        }
                        int[] nArray = new int[lIIIIIIll[1]];
                        nArray[m.lIIIIIIll[0]] = lIIIIIIll[18];
                        if (m.llIlIllIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            lIIlIllIIlIIIIl = new DHelper(lIIIIIIll[18], lIIIIIIll[1], lIIIIIIll[49]);
                            bB.add((DHelper) IIlIllIIlIIIIl);

                        }
                        int[] nArray6 = new int[lIIIIIIll[1]];
                        nArray6[m.lIIIIIIll[0]] = lIIIIIIll[19];
                        if (m.llIlIllIlll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            lIIlIllIIlIIIIl = new DHelper(lIIIIIIll[19], lIIIIIIll[1], lIIIIIIll[49]);
                            bB.add((DHelper) IIlIllIIlIIIIl);

                        }
                        int[] nArray7 = new int[lIIIIIIll[1]];
                        nArray7[m.lIIIIIIll[0]] = lIIIIIIll[17];
                        if (m.llIlIllIlll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            lIIlIllIIlIIIIl = new DHelper(lIIIIIIll[17], lIIIIIIll[1], lIIIIIIll[49]);
                            bB.add((DHelper) IIlIllIIlIIIIl);

                        }
                        int[] nArray8 = new int[lIIIIIIll[1]];
                        nArray8[m.lIIIIIIll[0]] = lIIIIIIll[20];
                        if (m.llIlIllIlll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            lIIlIllIIlIIIIl = new DHelper(lIIIIIIll[20], lIIIIIIll[1], lIIIIIIll[50]);
                            bB.add((DHelper) IIlIllIIlIIIIl);

                        }
                        if (m.llIlIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) {
                            int[] nArray9 = new int[lIIIIIIll[1]];
                            nArray9[m.lIIIIIIll[0]] = lIIIIIIll[16];
                            if (m.llIlIllIlll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                lIIlIllIIlIIIIl = new DHelper(lIIIIIIll[16], lIIIIIIll[51], lIIIIIIll[42]);
                                bB.add((DHelper) IIlIllIIlIIIIl);

                            }
                        }
                        int[] nArray10 = new int[lIIIIIIll[1]];
                        nArray10[m.lIIIIIIll[0]] = lIIIIIIll[9];
                        if (m.llIlIllIlll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            lIIlIllIIlIIIIl = new DHelper(lIIIIIIll[9], lIIIIIIll[1], lIIIIIIll[52]);
                            bB.add((DHelper) IIlIllIIlIIIIl);

                        }
                        int[] nArray11 = new int[lIIIIIIll[1]];
                        nArray11[m.lIIIIIIll[0]] = lIIIIIIll[10];
                        if (m.llIlIllIlll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                            lIIlIllIIlIIIIl = new DHelper(lIIIIIIll[10], lIIIIIIll[1], lIIIIIIll[52]);
                            bB.add((DHelper) IIlIllIIlIIIIl);

                        }
                        if (m.llIlIlllIlI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIll[7])) {
                            int[] nArray12 = new int[lIIIIIIll[1]];
                            nArray12[m.lIIIIIIll[0]] = lIIIIIIll[11];
                            if (m.llIlIllIlll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                lIIlIllIIlIIIIl = new DHelper(lIIIIIIll[11], lIIIIIIll[48], lIIIIIIll[53]);
                                bB.add((DHelper) IIlIllIIlIIIIl);

                            }
                        }
                        int[] nArray13 = new int[lIIIIIIll[1]];
                        nArray13[m.lIIIIIIll[0]] = lIIIIIIll[22];
                        if (m.llIlIllIlll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                            lIIlIllIIlIIIIl = new DHelper(lIIIIIIll[22], lIIIIIIll[1], i.bw);
                            bB.add((DHelper) IIlIllIIlIIIIl);

                        }
                        int[] nArray14 = new int[lIIIIIIll[1]];
                        nArray14[m.lIIIIIIll[0]] = lIIIIIIll[26];
                        if (m.llIlIllIlll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                            lIIlIllIIlIIIIl = new DHelper(lIIIIIIll[26], lIIIIIIll[54], lIIIIIIll[55]);
                            bB.add((DHelper) IIlIllIIlIIIIl);

                        }
                        if (m.llIlIllIlll(Bank.contains((Predicate)(lIIlIllIIlIIIIl = item -> item.getName().toLowerCase().contains(lIIIIIIlI[lIIIIIIll[31]]))) ? 1 : 0)) {
                            lIIlIllIIlIIIII = new DHelper(lIIIIIIll[56], lIIIIIIll[5], lIIIIIIll[57]);
                            bB.add(lIIlIllIIlIIIII);

                        }
                        int[] nArray15 = new int[lIIIIIIll[1]];
                        nArray15[m.lIIIIIIll[0]] = lIIIIIIll[58];
                        if (!m.llIlIllIlIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block27;
                        int[] nArray16 = new int[lIIIIIIll[1]];
                        nArray16[m.lIIIIIIll[0]] = lIIIIIIll[58];
                        if (!m.llIlIllIlIl(Bank.contains((int[])nArray16) ? 1 : 0)) break block28;
                        int[] nArray17 = new int[lIIIIIIll[1]];
                        nArray17[m.lIIIIIIll[0]] = lIIIIIIll[58];
                        if (!m.llIlIllIllI(Bank.getFirst((int[])nArray17).getQuantity(), lIIIIIIll[24])) break block28;
                    }
                    lIIlIllIIlIIIII = new DHelper(lIIIIIIll[58], lIIIIIIll[24], lIIIIIIll[59]);
                    bB.add(lIIlIllIIlIIIII);

                }
                int[] nArray = new int[lIIIIIIll[1]];
                nArray[m.lIIIIIIll[0]] = lIIIIIIll[23];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block29;
                int[] nArray18 = new int[lIIIIIIll[1]];
                nArray18[m.lIIIIIIll[0]] = lIIIIIIll[23];
                if (!m.llIlIllIlIl(Bank.contains((int[])nArray18) ? 1 : 0)) break block30;
                int[] nArray19 = new int[lIIIIIIll[1]];
                nArray19[m.lIIIIIIll[0]] = lIIIIIIll[23];
                if (!m.llIlIllIllI(Bank.getFirst((int[])nArray19).getQuantity(), lIIIIIIll[24])) break block30;
            }
            lIIlIllIIlIIIII = new DHelper(lIIIIIIll[23], lIIIIIIll[24], lIIIIIIll[59]);
            bB.add(lIIlIllIIlIIIII);

        }
    }

    private static boolean llIlIllllII(int n2, int n3) {
        return n2 == n3;
    }

    static {
        m.llIlIllIlII();
        m.llIlIllIIll();
        bB = new ArrayList<d>();
    }
}

