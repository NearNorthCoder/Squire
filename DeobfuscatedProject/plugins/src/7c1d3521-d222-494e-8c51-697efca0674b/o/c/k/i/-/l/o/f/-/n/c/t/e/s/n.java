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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.l;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.m;

public class n
implements ac {
    private static /* synthetic */ int[] llIIllllll;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ String[] llIIlllllI;
    public static /* synthetic */ boolean bt;

    private static boolean lIlIlllllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllllllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlllllIlIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIlllllIlll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIlllllIIll(int n2) {
        return n2 == 0;
    }

    public static void aA() {
        if (n.lIlIlllllIIIl(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllllI[llIIllllll[0]];
            b.a(bv);
            if (n.lIlIlllllIIlI(bv.size(), llIIllllll[1])) {
                System.out.println(llIIlllllI[llIIllllll[1]]);
                bt = llIIllllll[0];
            }
        }
        if (n.lIlIlllllIIll(bt ? 1 : 0)) {
            BankLocation llllllllllllllllllIIlIlIlIIlllll;
            if (n.lIlIlllllIIll(n.an() ? 1 : 0)) {
                llllllllllllllllllIIlIlIlIIlllll = BankLocation.getNearest();
                if (n.lIlIlllllIlII(llllllllllllllllllIIlIlIlIIlllll) && n.lIlIlllllIIll(llllllllllllllllllIIlIlIlIIlllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllllI[llIIllllll[2]];
                    a.a(llllllllllllllllllIIlIlIlIIlllll);
                }
                if (n.lIlIlllllIlII(llllllllllllllllllIIlIlIlIIlllll) && n.lIlIlllllIIIl(llllllllllllllllllIIlIlIlIIlllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllllI[llIIllllll[3]];
                    if (n.lIlIlllllIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIIllllll[4]);
                        "".length();
                        Time.sleepTicks((int)llIIllllll[3]);
                        "".length();
                    }
                    if (n.lIlIlllllIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (n.lIlIlllllIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIIllllll[5]);
                            "".length();
                        }
                        if (n.lIlIlllllIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIIllllll[2]);
                            "".length();
                        }
                        if (n.lIlIlllllIIll(n.ao() ? 1 : 0)) {
                            n.Q();
                            System.out.println(llIIlllllI[llIIllllll[6]]);
                            bt = llIIllllll[1];
                            return;
                        }
                        if (n.lIlIlllllIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[7])) {
                            a.a(llIIllllll[8], llIIllllll[1]);
                            a.a(llIIllllll[9], llIIllllll[1]);
                            a.a(llIIllllll[10], llIIllllll[1]);
                            Bank.withdrawAll((int)llIIllllll[11], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        }
                        if (n.lIlIlllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[7])) {
                            a.a(llIIllllll[12], llIIllllll[1]);
                            a.a(llIIllllll[13], llIIllllll[1]);
                            a.a(llIIllllll[14], llIIllllll[1]);
                            Bank.withdrawAll((int)llIIllllll[15], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)llIIllllll[1]);
                            "".length();
                            Bank.withdrawAll((int)llIIllllll[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)llIIllllll[1]);
                            "".length();
                            a.a(llIIllllll[17], llIIllllll[1]);
                        }
                        a.a(llIIllllll[18], llIIllllll[1]);
                        a.a(llIIllllll[19], llIIllllll[1]);
                        a.a(llIIllllll[20], llIIllllll[1]);
                        a.a(llIIllllll[21], llIIllllll[1]);
                        a.a(llIIllllll[22], llIIllllll[1]);
                        a.a(llIIllllll[23], llIIllllll[24]);
                        a.a(llIIllllll[25], llIIllllll[24]);
                        a.a(llIIllllll[26], Inventory.getFreeSlots());
                    }
                }
            }
            if (n.lIlIlllllIIIl(n.an() ? 1 : 0)) {
                n.aB();
                if (n.lIlIlllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[27])) {
                    m.al();
                }
                if (n.lIlIlllllIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[27])) {
                    llllllllllllllllllIIlIlIlIIlllll = TileItems.getNearest(tileItem -> {
                        int n2;
                        if (n.lIlIllllllIII(tileItem.getId(), llIIllllll[16]) && n.lIlIlllllIllI(tileItem.getQuantity(), llIIllllll[42])) {
                            n2 = llIIllllll[1];
                            "".length();
                            if (-(51 + 69 - 19 + 75 ^ 54 + 37 - 32 + 121) >= 0) {
                                return ((38 + 157 - 33 + 35 ^ 117 + 8 - -15 + 13) & (196 + 103 - 93 + 8 ^ 64 + 1 - -46 + 27 ^ -" ".length())) != 0;
                            }
                        } else {
                            n2 = llIIllllll[0];
                        }
                        return n2 != 0;
                    });
                    if (n.lIlIlllllIlII(llllllllllllllllllIIlIlIlIIlllll)) {
                        llllllllllllllllllIIlIlIlIIlllll.interact(llIIlllllI[llIIllllll[5]]);
                        Time.sleepTicks((int)llIIllllll[6]);
                        "".length();
                    }
                    l.aj();
                }
            }
        }
    }

    private static void aB() {
        block34: {
            block33: {
                int[] nArray = new int[llIIllllll[1]];
                nArray[n.llIIllllll[0]] = llIIllllll[28];
                if (!n.lIlIlllllIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block33;
                int[] nArray2 = new int[llIIllllll[1]];
                nArray2[n.llIIllllll[0]] = llIIllllll[29];
                if (!n.lIlIlllllIIll(Equipment.contains((int[])nArray2) ? 1 : 0)) break block33;
                int[] nArray3 = new int[llIIllllll[1]];
                nArray3[n.llIIllllll[0]] = llIIllllll[16];
                if (!n.lIlIlllllIIll(Equipment.contains((int[])nArray3) ? 1 : 0)) break block33;
                int[] nArray4 = new int[llIIllllll[1]];
                nArray4[n.llIIllllll[0]] = llIIllllll[11];
                if (n.lIlIlllllIIll(Equipment.contains((int[])nArray4) ? 1 : 0) && !n.lIlIlllllIIIl(Equipment.contains(item -> item.getName().contains(llIIlllllI[llIIllllll[61]])) ? 1 : 0)) break block34;
            }
            if (n.lIlIlllllIlll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
            }
        }
        if (n.lIlIlllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[27])) {
            int[] nArray = new int[llIIllllll[1]];
            nArray[n.llIIllllll[0]] = llIIllllll[28];
            if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray5 = new int[llIIllllll[1]];
                nArray5[n.llIIllllll[0]] = llIIllllll[28];
                Inventory.getFirst((int[])nArray5).interact(llIIlllllI[llIIllllll[30]]);
            }
            int[] nArray6 = new int[llIIllllll[1]];
            nArray6[n.llIIllllll[0]] = llIIllllll[12];
            if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray6) ? 1 : 0) && n.lIlIlllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[5])) {
                e.l(llIIllllll[12]);
            }
            int[] nArray7 = new int[llIIllllll[1]];
            nArray7[n.llIIllllll[0]] = llIIllllll[13];
            if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray7) ? 1 : 0) && n.lIlIlllllIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[5]) && n.lIlIlllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[31])) {
                e.l(llIIllllll[13]);
            }
            int[] nArray8 = new int[llIIllllll[1]];
            nArray8[n.llIIllllll[0]] = llIIllllll[14];
            if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray8) ? 1 : 0) && n.lIlIlllllIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[31])) {
                e.l(llIIllllll[14]);
            }
            int[] nArray9 = new int[llIIllllll[1]];
            nArray9[n.llIIllllll[0]] = llIIllllll[15];
            if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                e.l(llIIllllll[15]);
            }
        }
        if (n.lIlIlllllIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[31])) {
            int[] nArray = new int[llIIllllll[1]];
            nArray[n.llIIllllll[0]] = llIIllllll[18];
            if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray10 = new int[llIIllllll[1]];
                nArray10[n.llIIllllll[0]] = llIIllllll[18];
                Inventory.getFirst((int[])nArray10).interact(llIIlllllI[llIIllllll[32]]);
            }
        }
        if (n.lIlIlllllIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[27])) {
            int[] nArray = new int[llIIllllll[1]];
            nArray[n.llIIllllll[0]] = llIIllllll[29];
            if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray11 = new int[llIIllllll[1]];
                nArray11[n.llIIllllll[0]] = llIIllllll[29];
                Inventory.getFirst((int[])nArray11).interact(llIIlllllI[llIIllllll[33]]);
            }
            int[] nArray12 = new int[llIIllllll[1]];
            nArray12[n.llIIllllll[0]] = llIIllllll[34];
            if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                int[] nArray13 = new int[llIIllllll[1]];
                nArray13[n.llIIllllll[0]] = llIIllllll[34];
                Inventory.getFirst((int[])nArray13).interact(llIIlllllI[llIIllllll[35]]);
            }
            int[] nArray14 = new int[llIIllllll[1]];
            nArray14[n.llIIllllll[0]] = llIIllllll[16];
            if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[llIIllllll[1]];
                nArray15[n.llIIllllll[0]] = llIIllllll[16];
                Inventory.getFirst((int[])nArray15).interact(llIIlllllI[llIIllllll[24]]);
            }
        }
        if (n.lIlIlllllIIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllll[36])) {
            int[] nArray = new int[llIIllllll[1]];
            nArray[n.llIIllllll[0]] = llIIllllll[19];
            if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[llIIllllll[1]];
                nArray16[n.llIIllllll[0]] = llIIllllll[19];
                Inventory.getFirst((int[])nArray16).interact(llIIlllllI[llIIllllll[37]]);
            }
        }
        if (n.lIlIlllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[7])) {
            int[] nArray = new int[llIIllllll[1]];
            nArray[n.llIIllllll[0]] = llIIllllll[17];
            if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray17 = new int[llIIllllll[1]];
                nArray17[n.llIIllllll[0]] = llIIllllll[17];
                Inventory.getFirst((int[])nArray17).interact(llIIlllllI[llIIllllll[38]]);
            }
        }
        int[] nArray = new int[llIIllllll[1]];
        nArray[n.llIIllllll[0]] = llIIllllll[20];
        if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray18 = new int[llIIllllll[1]];
            nArray18[n.llIIllllll[0]] = llIIllllll[20];
            Inventory.getFirst((int[])nArray18).interact(llIIlllllI[llIIllllll[39]]);
        }
        int[] nArray19 = new int[llIIllllll[1]];
        nArray19[n.llIIllllll[0]] = llIIllllll[21];
        if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray19) ? 1 : 0)) {
            int[] nArray20 = new int[llIIllllll[1]];
            nArray20[n.llIIllllll[0]] = llIIllllll[21];
            Inventory.getFirst((int[])nArray20).interact(llIIlllllI[llIIllllll[40]]);
        }
        if (n.lIlIllllllIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIllllll[41])) {
            int[] nArray21 = new int[llIIllllll[1]];
            nArray21[n.llIIllllll[0]] = llIIllllll[8];
            if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                int[] nArray22 = new int[llIIllllll[1]];
                nArray22[n.llIIllllll[0]] = llIIllllll[8];
                if (n.lIlIlllllIIll(Equipment.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[llIIllllll[1]];
                    nArray23[n.llIIllllll[0]] = llIIllllll[8];
                    Inventory.getFirst((int[])nArray23).interact(llIIlllllI[llIIllllll[42]]);
                }
            }
            if (n.lIlIlllllIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[7])) {
                int[] nArray24 = new int[llIIllllll[1]];
                nArray24[n.llIIllllll[0]] = llIIllllll[9];
                if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray24) ? 1 : 0)) {
                    int[] nArray25 = new int[llIIllllll[1]];
                    nArray25[n.llIIllllll[0]] = llIIllllll[9];
                    if (n.lIlIlllllIIll(Equipment.contains((int[])nArray25) ? 1 : 0)) {
                        int[] nArray26 = new int[llIIllllll[1]];
                        nArray26[n.llIIllllll[0]] = llIIllllll[9];
                        Inventory.getFirst((int[])nArray26).interact(llIIlllllI[llIIllllll[43]]);
                    }
                }
            }
            if (n.lIlIlllllIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[7]) && n.lIlIlllllIllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllll[36])) {
                int[] nArray27 = new int[llIIllllll[1]];
                nArray27[n.llIIllllll[0]] = llIIllllll[10];
                if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                    int[] nArray28 = new int[llIIllllll[1]];
                    nArray28[n.llIIllllll[0]] = llIIllllll[10];
                    if (n.lIlIlllllIIll(Equipment.contains((int[])nArray28) ? 1 : 0)) {
                        int[] nArray29 = new int[llIIllllll[1]];
                        nArray29[n.llIIllllll[0]] = llIIllllll[10];
                        Inventory.getFirst((int[])nArray29).interact(llIIlllllI[llIIllllll[44]]);
                    }
                }
            }
            if (n.lIlIlllllIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[7])) {
                int[] nArray30 = new int[llIIllllll[1]];
                nArray30[n.llIIllllll[0]] = llIIllllll[11];
                if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray30) ? 1 : 0)) {
                    int[] nArray31 = new int[llIIllllll[1]];
                    nArray31[n.llIIllllll[0]] = llIIllllll[11];
                    Inventory.getFirst((int[])nArray31).interact(llIIlllllI[llIIllllll[45]]);
                }
            }
        }
    }

    private static void Q() {
        block30: {
            d llllllllllllllllllIIlIlIlIIllIll;
            block29: {
                block28: {
                    block27: {
                        Object llllllllllllllllllIIlIlIlIIlllII;
                        block25: {
                            block26: {
                                if (!n.lIlIlllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[27])) break block25;
                                int[] nArray = new int[llIIllllll[1]];
                                nArray[n.llIIllllll[0]] = llIIllllll[12];
                                if (n.lIlIlllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    d d2 = new d(llIIllllll[12], llIIllllll[1], llIIllllll[46]);
                                    bv.add(d2);
                                    "".length();
                                }
                                int[] nArray2 = new int[llIIllllll[1]];
                                nArray2[n.llIIllllll[0]] = llIIllllll[13];
                                if (n.lIlIlllllIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    llllllllllllllllllIIlIlIlIIlllII = new d(llIIllllll[13], llIIllllll[1], llIIllllll[46]);
                                    bv.add((d)llllllllllllllllllIIlIlIlIIlllII);
                                    "".length();
                                }
                                int[] nArray3 = new int[llIIllllll[1]];
                                nArray3[n.llIIllllll[0]] = llIIllllll[14];
                                if (n.lIlIlllllIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    llllllllllllllllllIIlIlIlIIlllII = new d(llIIllllll[14], llIIllllll[1], llIIllllll[46]);
                                    bv.add((d)llllllllllllllllllIIlIlIlIIlllII);
                                    "".length();
                                }
                                int[] nArray4 = new int[llIIllllll[1]];
                                nArray4[n.llIIllllll[0]] = llIIllllll[15];
                                if (!n.lIlIlllllIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block26;
                                int[] nArray5 = new int[llIIllllll[1]];
                                nArray5[n.llIIllllll[0]] = llIIllllll[15];
                                if (!n.lIlIlllllIIlI(Bank.getFirst((int[])nArray5).getQuantity(), llIIllllll[47])) break block25;
                            }
                            llllllllllllllllllIIlIlIlIIlllII = new d(llIIllllll[15], llIIllllll[48], llIIllllll[35]);
                            bv.add((d)llllllllllllllllllIIlIlIlIIlllII);
                            "".length();
                        }
                        int[] nArray = new int[llIIllllll[1]];
                        nArray[n.llIIllllll[0]] = llIIllllll[18];
                        if (n.lIlIlllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            llllllllllllllllllIIlIlIlIIlllII = new d(llIIllllll[18], llIIllllll[1], llIIllllll[49]);
                            bv.add((d)llllllllllllllllllIIlIlIlIIlllII);
                            "".length();
                        }
                        int[] nArray6 = new int[llIIllllll[1]];
                        nArray6[n.llIIllllll[0]] = llIIllllll[19];
                        if (n.lIlIlllllIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            llllllllllllllllllIIlIlIlIIlllII = new d(llIIllllll[19], llIIllllll[1], llIIllllll[49]);
                            bv.add((d)llllllllllllllllllIIlIlIlIIlllII);
                            "".length();
                        }
                        int[] nArray7 = new int[llIIllllll[1]];
                        nArray7[n.llIIllllll[0]] = llIIllllll[17];
                        if (n.lIlIlllllIIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            llllllllllllllllllIIlIlIlIIlllII = new d(llIIllllll[17], llIIllllll[1], llIIllllll[49]);
                            bv.add((d)llllllllllllllllllIIlIlIlIIlllII);
                            "".length();
                        }
                        int[] nArray8 = new int[llIIllllll[1]];
                        nArray8[n.llIIllllll[0]] = llIIllllll[20];
                        if (n.lIlIlllllIIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            llllllllllllllllllIIlIlIlIIlllII = new d(llIIllllll[20], llIIllllll[1], llIIllllll[50]);
                            bv.add((d)llllllllllllllllllIIlIlIlIIlllII);
                            "".length();
                        }
                        if (n.lIlIlllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[7])) {
                            int[] nArray9 = new int[llIIllllll[1]];
                            nArray9[n.llIIllllll[0]] = llIIllllll[16];
                            if (n.lIlIlllllIIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                llllllllllllllllllIIlIlIlIIlllII = new d(llIIllllll[16], llIIllllll[51], llIIllllll[42]);
                                bv.add((d)llllllllllllllllllIIlIlIlIIlllII);
                                "".length();
                            }
                        }
                        int[] nArray10 = new int[llIIllllll[1]];
                        nArray10[n.llIIllllll[0]] = llIIllllll[9];
                        if (n.lIlIlllllIIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            llllllllllllllllllIIlIlIlIIlllII = new d(llIIllllll[9], llIIllllll[1], llIIllllll[52]);
                            bv.add((d)llllllllllllllllllIIlIlIlIIlllII);
                            "".length();
                        }
                        int[] nArray11 = new int[llIIllllll[1]];
                        nArray11[n.llIIllllll[0]] = llIIllllll[10];
                        if (n.lIlIlllllIIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                            llllllllllllllllllIIlIlIlIIlllII = new d(llIIllllll[10], llIIllllll[1], llIIllllll[52]);
                            bv.add((d)llllllllllllllllllIIlIlIlIIlllII);
                            "".length();
                        }
                        if (n.lIlIlllllIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[7])) {
                            int[] nArray12 = new int[llIIllllll[1]];
                            nArray12[n.llIIllllll[0]] = llIIllllll[11];
                            if (n.lIlIlllllIIll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                llllllllllllllllllIIlIlIlIIlllII = new d(llIIllllll[11], llIIllllll[48], llIIllllll[53]);
                                bv.add((d)llllllllllllllllllIIlIlIlIIlllII);
                                "".length();
                            }
                        }
                        int[] nArray13 = new int[llIIllllll[1]];
                        nArray13[n.llIIllllll[0]] = llIIllllll[22];
                        if (n.lIlIlllllIIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                            llllllllllllllllllIIlIlIlIIlllII = new d(llIIllllll[22], llIIllllll[1], j.cf);
                            bv.add((d)llllllllllllllllllIIlIlIlIIlllII);
                            "".length();
                        }
                        int[] nArray14 = new int[llIIllllll[1]];
                        nArray14[n.llIIllllll[0]] = llIIllllll[26];
                        if (n.lIlIlllllIIll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                            llllllllllllllllllIIlIlIlIIlllII = new d(llIIllllll[26], llIIllllll[54], llIIllllll[55]);
                            bv.add((d)llllllllllllllllllIIlIlIlIIlllII);
                            "".length();
                        }
                        if (n.lIlIlllllIIll(Bank.contains((Predicate)(llllllllllllllllllIIlIlIlIIlllII = item -> item.getName().toLowerCase().contains(llIIlllllI[llIIllllll[31]]))) ? 1 : 0)) {
                            llllllllllllllllllIIlIlIlIIllIll = new d(llIIllllll[56], llIIllllll[5], llIIllllll[57]);
                            bv.add(llllllllllllllllllIIlIlIlIIllIll);
                            "".length();
                        }
                        int[] nArray15 = new int[llIIllllll[1]];
                        nArray15[n.llIIllllll[0]] = llIIllllll[58];
                        if (!n.lIlIlllllIIIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block27;
                        int[] nArray16 = new int[llIIllllll[1]];
                        nArray16[n.llIIllllll[0]] = llIIllllll[58];
                        if (!n.lIlIlllllIIIl(Bank.contains((int[])nArray16) ? 1 : 0)) break block28;
                        int[] nArray17 = new int[llIIllllll[1]];
                        nArray17[n.llIIllllll[0]] = llIIllllll[58];
                        if (!n.lIlIlllllIIlI(Bank.getFirst((int[])nArray17).getQuantity(), llIIllllll[24])) break block28;
                    }
                    llllllllllllllllllIIlIlIlIIllIll = new d(llIIllllll[58], llIIllllll[24], llIIllllll[59]);
                    bv.add(llllllllllllllllllIIlIlIlIIllIll);
                    "".length();
                }
                int[] nArray = new int[llIIllllll[1]];
                nArray[n.llIIllllll[0]] = llIIllllll[23];
                if (!n.lIlIlllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block29;
                int[] nArray18 = new int[llIIllllll[1]];
                nArray18[n.llIIllllll[0]] = llIIllllll[23];
                if (!n.lIlIlllllIIIl(Bank.contains((int[])nArray18) ? 1 : 0)) break block30;
                int[] nArray19 = new int[llIIllllll[1]];
                nArray19[n.llIIllllll[0]] = llIIllllll[23];
                if (!n.lIlIlllllIIlI(Bank.getFirst((int[])nArray19).getQuantity(), llIIllllll[24])) break block30;
            }
            llllllllllllllllllIIlIlIlIIllIll = new d(llIIllllll[23], llIIllllll[24], llIIllllll[59]);
            bv.add(llllllllllllllllllIIlIlIlIIllIll);
            "".length();
        }
    }

    private static String lIlIllllIllIl(String llllllllllllllllllIIlIlIIllIlIII, String llllllllllllllllllIIlIlIIllIIlll) {
        try {
            SecretKeySpec llllllllllllllllllIIlIlIIllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIlIIllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIlIlIIllIllII = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIlIlIIllIllII.init(llIIllllll[2], llllllllllllllllllIIlIlIIllIllIl);
            return new String(llllllllllllllllllIIlIlIIllIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIlIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIlIlIIllIlIll) {
            llllllllllllllllllIIlIlIIllIlIll.printStackTrace();
            return null;
        }
    }

    @Override
    public int af() {
        try {
            n.aA();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-" ".length() > 0) {
            return (0x85 ^ 0xC5 ^ "  ".length()) & (128 + 222 - 284 + 164 ^ 94 + 106 - 109 + 73 ^ -" ".length());
        }
        return llIIllllll[54];
    }

    private static String lIlIllllIlllI(String llllllllllllllllllIIlIlIIlllIlll, String llllllllllllllllllIIlIlIIlllIlII) {
        try {
            SecretKeySpec llllllllllllllllllIIlIlIIllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIlIIlllIlII.getBytes(StandardCharsets.UTF_8)), llIIllllll[33]), "DES");
            Cipher llllllllllllllllllIIlIlIIllllIIl = Cipher.getInstance("DES");
            llllllllllllllllllIIlIlIIllllIIl.init(llIIllllll[2], llllllllllllllllllIIlIlIIllllIlI);
            return new String(llllllllllllllllllIIlIlIIllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIlIIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIlIlIIllllIII) {
            llllllllllllllllllIIlIlIIllllIII.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ao() {
        int n2;
        block20: {
            block21: {
                if (n.lIlIlllllIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[7]) && n.lIlIllllllIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIllllll[41]) && n.lIlIlllllIllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllll[36])) {
                    int n3;
                    int[] nArray = new int[llIIllllll[1]];
                    nArray[n.llIIllllll[0]] = llIIllllll[9];
                    if (n.lIlIlllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[llIIllllll[1]];
                        nArray2[n.llIIllllll[0]] = llIIllllll[10];
                        if (n.lIlIlllllIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[llIIllllll[1]];
                            nArray3[n.llIIllllll[0]] = llIIllllll[18];
                            if (n.lIlIlllllIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[llIIllllll[1]];
                                nArray4[n.llIIllllll[0]] = llIIllllll[20];
                                if (n.lIlIlllllIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    int[] nArray5 = new int[llIIllllll[1]];
                                    nArray5[n.llIIllllll[0]] = llIIllllll[11];
                                    if (n.lIlIlllllIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                        int[] nArray6 = new int[llIIllllll[1]];
                                        nArray6[n.llIIllllll[0]] = llIIllllll[8];
                                        if (n.lIlIlllllIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                            int[] nArray7 = new int[llIIllllll[1]];
                                            nArray7[n.llIIllllll[0]] = llIIllllll[26];
                                            if (n.lIlIlllllIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                n3 = llIIllllll[1];
                                                "".length();
                                                if ("   ".length() != " ".length()) return n3 != 0;
                                                return ((0x23 ^ 0x4B ^ (0x66 ^ 0x40)) & (0x56 ^ 0x45 ^ (0x79 ^ 0x24) ^ -" ".length())) != 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n3 = llIIllllll[0];
                    return n3 != 0;
                }
                if (n.lIlIlllllIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[27]) && n.lIlIlllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[7])) {
                    int n4;
                    int[] nArray = new int[llIIllllll[1]];
                    nArray[n.llIIllllll[0]] = llIIllllll[17];
                    if (n.lIlIlllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[llIIllllll[1]];
                        nArray8[n.llIIllllll[0]] = llIIllllll[19];
                        if (n.lIlIlllllIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[llIIllllll[1]];
                            nArray9[n.llIIllllll[0]] = llIIllllll[18];
                            if (n.lIlIlllllIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[llIIllllll[1]];
                                nArray10[n.llIIllllll[0]] = llIIllllll[20];
                                if (n.lIlIlllllIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                    int[] nArray11 = new int[llIIllllll[1]];
                                    nArray11[n.llIIllllll[0]] = llIIllllll[16];
                                    if (n.lIlIlllllIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                        int[] nArray12 = new int[llIIllllll[1]];
                                        nArray12[n.llIIllllll[0]] = llIIllllll[26];
                                        if (n.lIlIlllllIIIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                            n4 = llIIllllll[1];
                                            "".length();
                                            if (null == null) return n4 != 0;
                                            return ((0xA3 ^ 0x9A) & ~(0x25 ^ 0x1C)) != 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n4 = llIIllllll[0];
                    return n4 != 0;
                }
                int[] nArray = new int[llIIllllll[1]];
                nArray[n.llIIllllll[0]] = llIIllllll[17];
                if (!n.lIlIlllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                int[] nArray13 = new int[llIIllllll[1]];
                nArray13[n.llIIllllll[0]] = llIIllllll[19];
                if (!n.lIlIlllllIIIl(Bank.contains((int[])nArray13) ? 1 : 0)) break block20;
                int[] nArray14 = new int[llIIllllll[1]];
                nArray14[n.llIIllllll[0]] = llIIllllll[18];
                if (!n.lIlIlllllIIIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block20;
                int[] nArray15 = new int[llIIllllll[1]];
                nArray15[n.llIIllllll[0]] = llIIllllll[20];
                if (!n.lIlIlllllIIIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block20;
                int[] nArray16 = new int[llIIllllll[1]];
                nArray16[n.llIIllllll[0]] = llIIllllll[12];
                if (!n.lIlIlllllIIIl(Bank.contains((int[])nArray16) ? 1 : 0)) break block20;
                int[] nArray17 = new int[llIIllllll[1]];
                nArray17[n.llIIllllll[0]] = llIIllllll[23];
                if (!n.lIlIlllllIIIl(Bank.contains((int[])nArray17) ? 1 : 0)) break block20;
                int[] nArray18 = new int[llIIllllll[1]];
                nArray18[n.llIIllllll[0]] = llIIllllll[13];
                if (!n.lIlIlllllIIIl(Bank.contains((int[])nArray18) ? 1 : 0)) break block20;
                int[] nArray19 = new int[llIIllllll[1]];
                nArray19[n.llIIllllll[0]] = llIIllllll[14];
                if (!n.lIlIlllllIIIl(Bank.contains((int[])nArray19) ? 1 : 0)) break block20;
                int[] nArray20 = new int[llIIllllll[1]];
                nArray20[n.llIIllllll[0]] = llIIllllll[15];
                if (!n.lIlIlllllIIll(Bank.contains((int[])nArray20) ? 1 : 0)) break block21;
                int[] nArray21 = new int[llIIllllll[1]];
                nArray21[n.llIIllllll[0]] = llIIllllll[15];
                if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray21) ? 1 : 0)) break block20;
            }
            int[] nArray = new int[llIIllllll[1]];
            nArray[n.llIIllllll[0]] = llIIllllll[16];
            if (n.lIlIlllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray22 = new int[llIIllllll[1]];
                nArray22[n.llIIllllll[0]] = llIIllllll[26];
                if (n.lIlIlllllIIIl(Bank.contains((int[])nArray22) ? 1 : 0)) {
                    n2 = llIIllllll[1];
                    "".length();
                    if ((" ".length() & ~" ".length()) <= (0x6C ^ 0x68)) return n2 != 0;
                    return ((0xA ^ 0x2B) & ~(0x30 ^ 0x11)) != 0;
                }
            }
        }
        n2 = llIIllllll[0];
        return n2 != 0;
    }

    private static boolean lIlIlllllIlII(Object object) {
        return object != null;
    }

    @Override
    public boolean ae() {
        return llIIllllll[0];
    }

    static {
        n.lIlIlllllIIII();
        n.lIlIllllIllll();
        bv = new ArrayList<d>();
    }

    private static void lIlIllllIllll() {
        llIIlllllI = new String[llIIllllll[62]];
        n.llIIlllllI[n.llIIllllll[0]] = n.lIlIllllIllII("DhkTAj4rTAMfNSEf", "LljkP");
        n.llIIlllllI[n.llIIllllll[1]] = n.lIlIllllIllIl("o92T9LHYY9PTgL/KS9h5rB1qP/fO+IAR1LA4LTHeenmtLqs6QYqdd1inQ0en3dkxTUR6sC4ZstU=", "JzfDh");
        n.llIIlllllI[n.llIIllllll[2]] = n.lIlIllllIlllI("oYfHnp21zuMFqA6uGj1MD/q/RWNwAXFJ", "NaZJB");
        n.llIIlllllI[n.llIIllllll[3]] = n.lIlIllllIllIl("DdZ1TNQO06dhe8LhOR7xVnvwKF0HDKQT", "vduak");
        n.llIIlllllI[n.llIIllllll[6]] = n.lIlIllllIllII("PCRJMR4OYQQ5HxgoBzdMGDQZIAACJBp8TBg2ACQPAygHN0wfLkkSOTIIJxc=", "kAiPl");
        n.llIIlllllI[n.llIIllllll[5]] = n.lIlIllllIlllI("FiC8ve0e2E8=", "QFRHT");
        n.llIIlllllI[n.llIIllllll[30]] = n.lIlIllllIllIl("Bv6eZZ9oEn0=", "XPEAm");
        n.llIIlllllI[n.llIIllllll[32]] = n.lIlIllllIllIl("rQNQ//WNt1k=", "JwfDM");
        n.llIIlllllI[n.llIIllllll[33]] = n.lIlIllllIlllI("4+tgkWydrUk=", "DWEwo");
        n.llIIlllllI[n.llIIllllll[35]] = n.lIlIllllIlllI("Vf+NGeAk25w=", "DLnRI");
        n.llIIlllllI[n.llIIllllll[24]] = n.lIlIllllIlllI("698wr83PjsE=", "ZewAl");
        n.llIIlllllI[n.llIIllllll[37]] = n.lIlIllllIllII("PhEDNQ==", "itbGt");
        n.llIIlllllI[n.llIIllllll[38]] = n.lIlIllllIllIl("pdtSL9ag3zk=", "LKcDJ");
        n.llIIlllllI[n.llIIllllll[39]] = n.lIlIllllIllIl("o/n5KKEB2lc=", "pAQFu");
        n.llIIlllllI[n.llIIllllll[40]] = n.lIlIllllIlllI("r/ubbdi3MS8=", "OJzrQ");
        n.llIIlllllI[n.llIIllllll[42]] = n.lIlIllllIllIl("LnviFMcK04I=", "gNoRs");
        n.llIIlllllI[n.llIIllllll[43]] = n.lIlIllllIlllI("VOA0thaB8FQ=", "cKnLr");
        n.llIIlllllI[n.llIIllllll[44]] = n.lIlIllllIllIl("8IPu/02qYKU=", "QOqzt");
        n.llIIlllllI[n.llIIllllll[45]] = n.lIlIllllIllII("JwsIIw8=", "pbmOk");
        n.llIIlllllI[n.llIIllllll[60]] = n.lIlIllllIllIl("DBI6Vc67RQAroBp0eb84Vg==", "aWSNM");
        n.llIIlllllI[n.llIIllllll[31]] = n.lIlIllllIlllI("KsPBLU53pUBp7ukgwoUQPFOvcrHWpF3c", "SEiHR");
        n.llIIlllllI[n.llIIllllll[61]] = n.lIlIllllIllIl("v9DyANUycv8=", "NTnrI");
    }

    private static String lIlIllllIllII(String llllllllllllllllllIIlIlIlIIIIlll, String llllllllllllllllllIIlIlIlIIIIllI) {
        llllllllllllllllllIIlIlIlIIIIlll = new String(Base64.getDecoder().decode(llllllllllllllllllIIlIlIlIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIlIlIlIIIlIlI = new StringBuilder();
        char[] llllllllllllllllllIIlIlIlIIIlIIl = llllllllllllllllllIIlIlIlIIIIllI.toCharArray();
        int llllllllllllllllllIIlIlIlIIIlIII = llIIllllll[0];
        char[] llllllllllllllllllIIlIlIlIIIIIlI = llllllllllllllllllIIlIlIlIIIIlll.toCharArray();
        int llllllllllllllllllIIlIlIlIIIIIIl = llllllllllllllllllIIlIlIlIIIIIlI.length;
        int llllllllllllllllllIIlIlIlIIIIIII = llIIllllll[0];
        while (n.lIlIlllllIIlI(llllllllllllllllllIIlIlIlIIIIIII, llllllllllllllllllIIlIlIlIIIIIIl)) {
            char llllllllllllllllllIIlIlIlIIIllIl = llllllllllllllllllIIlIlIlIIIIIlI[llllllllllllllllllIIlIlIlIIIIIII];
            llllllllllllllllllIIlIlIlIIIlIlI.append((char)(llllllllllllllllllIIlIlIlIIIllIl ^ llllllllllllllllllIIlIlIlIIIlIIl[llllllllllllllllllIIlIlIlIIIlIII % llllllllllllllllllIIlIlIlIIIlIIl.length]));
            "".length();
            ++llllllllllllllllllIIlIlIlIIIlIII;
            ++llllllllllllllllllIIlIlIlIIIIIII;
            "".length();
            if (((0x5E ^ 2 ^ (0xCF ^ 0x8B)) & (46 + 168 - 52 + 10 ^ 28 + 169 - 45 + 28 ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIIlIlIlIIIlIlI);
    }

    private static void lIlIlllllIIII() {
        llIIllllll = new int[63];
        n.llIIllllll[0] = (29 + 6 - 34 + 158 ^ 49 + 23 - 27 + 94) & (109 + 50 - 27 + 40 ^ 44 + 56 - -36 + 48 ^ -" ".length());
        n.llIIllllll[1] = " ".length();
        n.llIIllllll[2] = "  ".length();
        n.llIIllllll[3] = "   ".length();
        n.llIIllllll[4] = -(0xFFFFE55F & 0x7EF5) & (0xFFFFF7FD & 0x7FDE);
        n.llIIllllll[5] = 0x16 ^ 0xF ^ (0x1F ^ 3);
        n.llIIllllll[6] = 0xB8 ^ 0xBC;
        n.llIIllllll[7] = 0x2B ^ 0x19;
        n.llIIllllll[8] = 0xFFFFFB7F & 0x2D83;
        n.llIIllllll[9] = 0xFFFF9BFF & 0x6DBD;
        n.llIIllllll[10] = -(0xFFFFD7FF & 0x383D) & (0xFFFFFFFF & 0x19FF);
        n.llIIllllll[11] = -(0xFFFFDD97 & 0x2E6E) & (0xFFFFDF7F & 0x2FAF);
        n.llIIllllll[12] = -(0xFFFFEEF7 & 0x758B) & (0xFFFFF7DF & 0x6FEB);
        n.llIIllllll[13] = 0xFFFF8BCF & 0x777B;
        n.llIIllllll[14] = -(0xFFFFC6F3 & 0x7DAD) & (0xFFFFDFFB & 0x67F5);
        n.llIIllllll[15] = 0xFFFF9773 & 0x6BFE;
        n.llIIllllll[16] = -(0xFFFFFFFF & 0x74D5) & (0xFFFFFFFF & 0x77FD);
        n.llIIllllll[17] = 0xFFFFA7E7 & 0x5C5F;
        n.llIIllllll[18] = 0xFFFFEEBD & 0x15D3;
        n.llIIllllll[19] = 0xFFFFCDF9 & 0x366F;
        n.llIIllllll[20] = -(0xFFFFD87A & 0x378F) & (0xFFFFBB7F & Short.MAX_VALUE);
        n.llIIllllll[21] = -(0xFFFFFFFF & 0x3003) & (0xFFFFF6AE & 0x3FFB);
        n.llIIllllll[22] = -(0xFFFFEBAF & 0x54FD) & (0xFFFFF7FF & 0x79FD);
        n.llIIllllll[23] = 0xFFFF9FDD & 0x7F6B;
        n.llIIllllll[24] = 0x98 ^ 0x92;
        n.llIIllllll[25] = -(0xFFFFBE95 & 0x61EF) & (0xFFFFFFEE & 0x3FDF);
        n.llIIllllll[26] = -(0xFFFFFAE5 & 0x7D9B) & (0xFFFFFFFB & 0x79FF);
        n.llIIllllll[27] = 0x21 ^ 0x50 ^ (0x66 ^ 9);
        n.llIIllllll[28] = 0xFFFFBFAF & 0x4377;
        n.llIIllllll[29] = 0xFFFFF6F8 & 0x2BB7;
        n.llIIllllll[30] = 0x95 ^ 0x93;
        n.llIIllllll[31] = 0x53 ^ 0x47;
        n.llIIllllll[32] = 0x89 ^ 0x8E;
        n.llIIllllll[33] = 0x29 ^ 0x21;
        n.llIIllllll[34] = 0xFFFFAEFA & 0x73B7;
        n.llIIllllll[35] = 0xA5 ^ 0xAC;
        n.llIIllllll[36] = 0x48 ^ 0x10 ^ (0x4A ^ 0x3A);
        n.llIIllllll[37] = 106 + 10 - 84 + 117 ^ 61 + 116 - 64 + 45;
        n.llIIllllll[38] = 149 + 101 - 92 + 20 ^ 28 + 34 - -96 + 32;
        n.llIIllllll[39] = 0xCE ^ 0xC3;
        n.llIIllllll[40] = 5 + 12 - -107 + 29 ^ 18 + 16 - -29 + 88;
        n.llIIllllll[41] = (0xA8 ^ 0x94) + "  ".length() - -(0x13 ^ 0x4E) + (0x21 ^ 0x74);
        n.llIIllllll[42] = 0x2D ^ 0x22;
        n.llIIllllll[43] = 108 + 95 - 112 + 47 ^ 38 + 13 - -63 + 40;
        n.llIIllllll[44] = 75 + 135 - 125 + 53 ^ 133 + 81 - 73 + 14;
        n.llIIllllll[45] = 0x2D ^ 0x4C ^ (0xE6 ^ 0x95);
        n.llIIllllll[46] = 0xFFFFFFFA & 0x3A9D;
        n.llIIllllll[47] = 0xFFFFDFD6 & 0x27F9;
        n.llIIllllll[48] = -(0xFFFFBFBF & 0x5041) & (0xFFFFFFFC & 0x3AFB);
        n.llIIllllll[49] = -(96 + 25 - 12 + 25) & (0xFFFFBABF & 0x5FCF);
        n.llIIllllll[50] = -(0xFFFFF15D & 0x7FAB) & (0xFFFFFB7E & 0xFFFF);
        n.llIIllllll[51] = -(0xFFFFE6B3 & 0x1DED) & (0xFFFFBFFB & 0x5FFC);
        n.llIIllllll[52] = 0xFFFFEEEC & 0x53F3;
        n.llIIllllll[53] = 0x76 ^ 0x55;
        n.llIIllllll[54] = 72 + 171 - 92 + 89 ^ 23 + 142 - 111 + 94;
        n.llIIllllll[55] = -(0xFFFFFD3F & 0x4AEC) & (0xFFFFCD6F & 0x7BFB);
        n.llIIllllll[56] = -(0xFFFFE326 & 0x1DFD) & (0xFFFFBFEF & 0x6FFF);
        n.llIIllllll[57] = 0xFFFFFFB9 & 0x61EE;
        n.llIIllllll[58] = -(0xFFFFE375 & 0x3CBB) & (0xFFFFFFF7 & 0x3F7F);
        n.llIIllllll[59] = 0xFFFFBFAC & 0x43D7;
        n.llIIllllll[60] = 0x5B ^ 0x7C ^ (0x4C ^ 0x78);
        n.llIIllllll[61] = 0x86 ^ 0x93;
        n.llIIllllll[62] = 0x2A ^ 0x3C;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
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
                                                                                                                                            if (!n.lIlIlllllIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[7]) || !n.lIlIllllllIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIllllll[41]) || !n.lIlIlllllIllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllll[36])) break block16;
                                                                                                                                            int[] nArray = new int[llIIllllll[1]];
                                                                                                                                            nArray[n.llIIllllll[0]] = llIIllllll[9];
                                                                                                                                            if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block17;
                                                                                                                                            int[] nArray2 = new int[llIIllllll[1]];
                                                                                                                                            nArray2[n.llIIllllll[0]] = llIIllllll[9];
                                                                                                                                            if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) break block18;
                                                                                                                                        }
                                                                                                                                        int[] nArray = new int[llIIllllll[1]];
                                                                                                                                        nArray[n.llIIllllll[0]] = llIIllllll[10];
                                                                                                                                        if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block19;
                                                                                                                                        int[] nArray3 = new int[llIIllllll[1]];
                                                                                                                                        nArray3[n.llIIllllll[0]] = llIIllllll[10];
                                                                                                                                        if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray3) ? 1 : 0)) break block18;
                                                                                                                                    }
                                                                                                                                    int[] nArray = new int[llIIllllll[1]];
                                                                                                                                    nArray[n.llIIllllll[0]] = llIIllllll[18];
                                                                                                                                    if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                                                                                                    int[] nArray4 = new int[llIIllllll[1]];
                                                                                                                                    nArray4[n.llIIllllll[0]] = llIIllllll[18];
                                                                                                                                    if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray4) ? 1 : 0)) break block18;
                                                                                                                                }
                                                                                                                                int[] nArray = new int[llIIllllll[1]];
                                                                                                                                nArray[n.llIIllllll[0]] = llIIllllll[20];
                                                                                                                                if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                                                                                                                                int[] nArray5 = new int[llIIllllll[1]];
                                                                                                                                nArray5[n.llIIllllll[0]] = llIIllllll[20];
                                                                                                                                if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray5) ? 1 : 0)) break block18;
                                                                                                                            }
                                                                                                                            int[] nArray = new int[llIIllllll[1]];
                                                                                                                            nArray[n.llIIllllll[0]] = llIIllllll[11];
                                                                                                                            if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                                                                            int[] nArray6 = new int[llIIllllll[1]];
                                                                                                                            nArray6[n.llIIllllll[0]] = llIIllllll[11];
                                                                                                                            if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray6) ? 1 : 0)) break block18;
                                                                                                                        }
                                                                                                                        int[] nArray = new int[llIIllllll[1]];
                                                                                                                        nArray[n.llIIllllll[0]] = llIIllllll[8];
                                                                                                                        if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                                                                                                        int[] nArray7 = new int[llIIllllll[1]];
                                                                                                                        nArray7[n.llIIllllll[0]] = llIIllllll[8];
                                                                                                                        if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block18;
                                                                                                                    }
                                                                                                                    int[] nArray = new int[llIIllllll[1]];
                                                                                                                    nArray[n.llIIllllll[0]] = llIIllllll[26];
                                                                                                                    if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                                                        n5 = llIIllllll[1];
                                                                                                                        "".length();
                                                                                                                        if (-"  ".length() <= 0) return n5 != 0;
                                                                                                                        return ((0x45 ^ 2) & ~(0x56 ^ 0x11)) != 0;
                                                                                                                    }
                                                                                                                }
                                                                                                                n5 = llIIllllll[0];
                                                                                                                return n5 != 0;
                                                                                                            }
                                                                                                            if (!n.lIlIlllllIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[7]) || !n.lIlIllllllIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIllllll[41]) || !n.lIlIlllllIIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllll[36])) break block24;
                                                                                                            int[] nArray = new int[llIIllllll[1]];
                                                                                                            nArray[n.llIIllllll[0]] = llIIllllll[9];
                                                                                                            if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
                                                                                                            int[] nArray8 = new int[llIIllllll[1]];
                                                                                                            nArray8[n.llIIllllll[0]] = llIIllllll[9];
                                                                                                            if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray8) ? 1 : 0)) break block26;
                                                                                                        }
                                                                                                        int[] nArray = new int[llIIllllll[1]];
                                                                                                        nArray[n.llIIllllll[0]] = llIIllllll[19];
                                                                                                        if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block27;
                                                                                                        int[] nArray9 = new int[llIIllllll[1]];
                                                                                                        nArray9[n.llIIllllll[0]] = llIIllllll[19];
                                                                                                        if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray9) ? 1 : 0)) break block26;
                                                                                                    }
                                                                                                    int[] nArray = new int[llIIllllll[1]];
                                                                                                    nArray[n.llIIllllll[0]] = llIIllllll[18];
                                                                                                    if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                                                                                                    int[] nArray10 = new int[llIIllllll[1]];
                                                                                                    nArray10[n.llIIllllll[0]] = llIIllllll[18];
                                                                                                    if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray10) ? 1 : 0)) break block26;
                                                                                                }
                                                                                                int[] nArray = new int[llIIllllll[1]];
                                                                                                nArray[n.llIIllllll[0]] = llIIllllll[20];
                                                                                                if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block29;
                                                                                                int[] nArray11 = new int[llIIllllll[1]];
                                                                                                nArray11[n.llIIllllll[0]] = llIIllllll[20];
                                                                                                if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray11) ? 1 : 0)) break block26;
                                                                                            }
                                                                                            int[] nArray = new int[llIIllllll[1]];
                                                                                            nArray[n.llIIllllll[0]] = llIIllllll[11];
                                                                                            if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block30;
                                                                                            int[] nArray12 = new int[llIIllllll[1]];
                                                                                            nArray12[n.llIIllllll[0]] = llIIllllll[11];
                                                                                            if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block26;
                                                                                        }
                                                                                        int[] nArray = new int[llIIllllll[1]];
                                                                                        nArray[n.llIIllllll[0]] = llIIllllll[8];
                                                                                        if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                                        int[] nArray13 = new int[llIIllllll[1]];
                                                                                        nArray13[n.llIIllllll[0]] = llIIllllll[8];
                                                                                        if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray13) ? 1 : 0)) break block26;
                                                                                    }
                                                                                    int[] nArray = new int[llIIllllll[1]];
                                                                                    nArray[n.llIIllllll[0]] = llIIllllll[26];
                                                                                    if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                        n4 = llIIllllll[1];
                                                                                        "".length();
                                                                                        if (((0x32 ^ 0x38) & ~(0x43 ^ 0x49)) < " ".length()) return n4 != 0;
                                                                                        return ((0x67 ^ 0x72) & ~(0xB8 ^ 0xAD)) != 0;
                                                                                    }
                                                                                }
                                                                                n4 = llIIllllll[0];
                                                                                return n4 != 0;
                                                                            }
                                                                            if (!n.lIlIlllllIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[27]) || !n.lIlIlllllIIlI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[7])) break block32;
                                                                            int[] nArray = new int[llIIllllll[1]];
                                                                            nArray[n.llIIllllll[0]] = llIIllllll[17];
                                                                            if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                            int[] nArray14 = new int[llIIllllll[1]];
                                                                            nArray14[n.llIIllllll[0]] = llIIllllll[17];
                                                                            if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray14) ? 1 : 0)) break block34;
                                                                        }
                                                                        int[] nArray = new int[llIIllllll[1]];
                                                                        nArray[n.llIIllllll[0]] = llIIllllll[19];
                                                                        if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block35;
                                                                        int[] nArray15 = new int[llIIllllll[1]];
                                                                        nArray15[n.llIIllllll[0]] = llIIllllll[19];
                                                                        if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) break block34;
                                                                    }
                                                                    int[] nArray = new int[llIIllllll[1]];
                                                                    nArray[n.llIIllllll[0]] = llIIllllll[18];
                                                                    if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block36;
                                                                    int[] nArray16 = new int[llIIllllll[1]];
                                                                    nArray16[n.llIIllllll[0]] = llIIllllll[18];
                                                                    if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray16) ? 1 : 0)) break block34;
                                                                }
                                                                int[] nArray = new int[llIIllllll[1]];
                                                                nArray[n.llIIllllll[0]] = llIIllllll[20];
                                                                if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block37;
                                                                int[] nArray17 = new int[llIIllllll[1]];
                                                                nArray17[n.llIIllllll[0]] = llIIllllll[20];
                                                                if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray17) ? 1 : 0)) break block34;
                                                            }
                                                            int[] nArray = new int[llIIllllll[1]];
                                                            nArray[n.llIIllllll[0]] = llIIllllll[16];
                                                            if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block38;
                                                            int[] nArray18 = new int[llIIllllll[1]];
                                                            nArray18[n.llIIllllll[0]] = llIIllllll[16];
                                                            if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray18) ? 1 : 0)) break block34;
                                                        }
                                                        int[] nArray = new int[llIIllllll[1]];
                                                        nArray[n.llIIllllll[0]] = llIIllllll[26];
                                                        if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                            n3 = llIIllllll[1];
                                                            "".length();
                                                            if (-" ".length() < 0) return n3 != 0;
                                                            return ((0x8D ^ 0xA9) & ~(0x5D ^ 0x79)) != 0;
                                                        }
                                                    }
                                                    n3 = llIIllllll[0];
                                                    return n3 != 0;
                                                }
                                                int[] nArray = new int[llIIllllll[1]];
                                                nArray[n.llIIllllll[0]] = llIIllllll[17];
                                                if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block39;
                                                int[] nArray19 = new int[llIIllllll[1]];
                                                nArray19[n.llIIllllll[0]] = llIIllllll[17];
                                                if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray19) ? 1 : 0)) break block40;
                                            }
                                            int[] nArray = new int[llIIllllll[1]];
                                            nArray[n.llIIllllll[0]] = llIIllllll[19];
                                            if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block41;
                                            int[] nArray20 = new int[llIIllllll[1]];
                                            nArray20[n.llIIllllll[0]] = llIIllllll[19];
                                            if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray20) ? 1 : 0)) break block40;
                                        }
                                        int[] nArray = new int[llIIllllll[1]];
                                        nArray[n.llIIllllll[0]] = llIIllllll[18];
                                        if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block42;
                                        int[] nArray21 = new int[llIIllllll[1]];
                                        nArray21[n.llIIllllll[0]] = llIIllllll[18];
                                        if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray21) ? 1 : 0)) break block40;
                                    }
                                    int[] nArray = new int[llIIllllll[1]];
                                    nArray[n.llIIllllll[0]] = llIIllllll[20];
                                    if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block43;
                                    int[] nArray22 = new int[llIIllllll[1]];
                                    nArray22[n.llIIllllll[0]] = llIIllllll[20];
                                    if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray22) ? 1 : 0)) break block40;
                                }
                                int[] nArray = new int[llIIllllll[1]];
                                nArray[n.llIIllllll[0]] = llIIllllll[15];
                                if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block44;
                                int[] nArray23 = new int[llIIllllll[1]];
                                nArray23[n.llIIllllll[0]] = llIIllllll[15];
                                if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray23) ? 1 : 0)) break block40;
                            }
                            int[] nArray = new int[llIIllllll[1]];
                            nArray[n.llIIllllll[0]] = llIIllllll[12];
                            if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                            int[] nArray24 = new int[llIIllllll[1]];
                            nArray24[n.llIIllllll[0]] = llIIllllll[12];
                            if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray24) ? 1 : 0)) break block40;
                        }
                        int[] nArray = new int[llIIllllll[1]];
                        nArray[n.llIIllllll[0]] = llIIllllll[13];
                        if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block46;
                        int[] nArray25 = new int[llIIllllll[1]];
                        nArray25[n.llIIllllll[0]] = llIIllllll[13];
                        if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray25) ? 1 : 0)) break block40;
                    }
                    int[] nArray = new int[llIIllllll[1]];
                    nArray[n.llIIllllll[0]] = llIIllllll[14];
                    if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block47;
                    int[] nArray26 = new int[llIIllllll[1]];
                    nArray26[n.llIIllllll[0]] = llIIllllll[14];
                    if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray26) ? 1 : 0)) break block40;
                }
                int[] nArray = new int[llIIllllll[1]];
                nArray[n.llIIllllll[0]] = llIIllllll[16];
                if (!n.lIlIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block48;
                int[] nArray27 = new int[llIIllllll[1]];
                nArray27[n.llIIllllll[0]] = llIIllllll[16];
                if (!n.lIlIlllllIIIl(Equipment.contains((int[])nArray27) ? 1 : 0)) break block40;
            }
            int[] nArray = new int[llIIllllll[1]];
            nArray[n.llIIllllll[0]] = llIIllllll[26];
            if (n.lIlIlllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = llIIllllll[1];
                "".length();
                if (-" ".length() <= 0) return n2 != 0;
                return ((0xCA ^ 0x8F ^ (0x9A ^ 0x82)) & (0x35 ^ 0x20 ^ (0x3E ^ 0x76) ^ -" ".length())) != 0;
            }
        }
        n2 = llIIllllll[0];
        return n2 != 0;
    }

    @Override
    public String ag() {
        return llIIlllllI[llIIllllll[60]];
    }

    private static boolean lIlIlllllIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlllllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (n.lIlIlllllIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllll[7])) {
            bl = llIIllllll[1];
            "".length();
            if (((90 + 11 - 93 + 170 ^ 11 + 9 - -80 + 66) & (0xF2 ^ 0x81 ^ (0x17 ^ 0x70) ^ -" ".length())) > "   ".length()) {
                return ((0x2C ^ 0x1B ^ (0xDF ^ 0xAA)) & (117 + 175 - 195 + 158 ^ 15 + 82 - 2 + 94 ^ -" ".length())) != 0;
            }
        } else {
            bl = llIIllllll[0];
        }
        return bl;
    }
}

