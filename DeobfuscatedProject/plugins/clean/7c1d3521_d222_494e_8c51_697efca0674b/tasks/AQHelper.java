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
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.LHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.MHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.SHelper;

public class AQHelper
implements ac {
    public static  boolean bt;
    public static  List<d> bv;

    private static boolean lIllIlllllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIllllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIllllIllI(Object object) {
        return object != null;
    }

    @Override
    public String ag() {
        return llIllIIlll[llIllIlIIl[34]];
    }

        return String.valueOf(var1);
    }

    static {
        aq.lIllIllllIIlI();
        aq.lIllIlllIlllI();
        bv = new ArrayList<d>();
    }

    private static void aB() {
        block34: {
            block33: {
                int[] nArray = new int[llIllIlIIl[1]];
                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[31];
                if (!aq.lIllIllllIlIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block33;
                int[] nArray2 = new int[llIllIlIIl[1]];
                nArray2[aq.llIllIlIIl[0]] = llIllIlIIl[32];
                if (!aq.lIllIllllIlIl(Equipment.contains((int[])nArray2) ? 1 : 0)) break block33;
                int[] nArray3 = new int[llIllIlIIl[1]];
                nArray3[aq.llIllIlIIl[0]] = llIllIlIIl[16];
                if (!aq.lIllIllllIlIl(Equipment.contains((int[])nArray3) ? 1 : 0)) break block33;
                int[] nArray4 = new int[llIllIlIIl[1]];
                nArray4[aq.llIllIlIIl[0]] = llIllIlIIl[11];
                if (aq.lIllIllllIlIl(Equipment.contains((int[])nArray4) ? 1 : 0) && !aq.lIllIllllIIll(Equipment.contains(item -> item.getName().contains(llIllIIlll[llIllIlIIl[64]])) ? 1 : 0)) break block34;
            }
            if (aq.lIllIlllllIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
            }
        }
        if (aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[27])) {
            int[] nArray = new int[llIllIlIIl[1]];
            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[31];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray5 = new int[llIllIlIIl[1]];
                nArray5[aq.llIllIlIIl[0]] = llIllIlIIl[31];
                Inventory.getFirst((int[])nArray5).interact(llIllIIlll[llIllIlIIl[33]]);
            }
            int[] nArray6 = new int[llIllIlIIl[1]];
            nArray6[aq.llIllIlIIl[0]] = llIllIlIIl[12];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray6) ? 1 : 0) && aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[6])) {
                e.l(llIllIlIIl[12]);
            }
            int[] nArray7 = new int[llIllIlIIl[1]];
            nArray7[aq.llIllIlIIl[0]] = llIllIlIIl[13];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray7) ? 1 : 0) && aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[6]) && aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[34])) {
                e.l(llIllIlIIl[13]);
            }
            int[] nArray8 = new int[llIllIlIIl[1]];
            nArray8[aq.llIllIlIIl[0]] = llIllIlIIl[14];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray8) ? 1 : 0) && aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[34])) {
                e.l(llIllIlIIl[14]);
            }
            int[] nArray9 = new int[llIllIlIIl[1]];
            nArray9[aq.llIllIlIIl[0]] = llIllIlIIl[15];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                e.l(llIllIlIIl[15]);
            }
        }
        if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[34])) {
            int[] nArray = new int[llIllIlIIl[1]];
            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[18];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray10 = new int[llIllIlIIl[1]];
                nArray10[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                Inventory.getFirst((int[])nArray10).interact(llIllIIlll[llIllIlIIl[35]]);
            }
        }
        if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[27])) {
            int[] nArray = new int[llIllIlIIl[1]];
            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[32];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray11 = new int[llIllIlIIl[1]];
                nArray11[aq.llIllIlIIl[0]] = llIllIlIIl[32];
                Inventory.getFirst((int[])nArray11).interact(llIllIIlll[llIllIlIIl[36]]);
            }
            int[] nArray12 = new int[llIllIlIIl[1]];
            nArray12[aq.llIllIlIIl[0]] = llIllIlIIl[37];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                int[] nArray13 = new int[llIllIlIIl[1]];
                nArray13[aq.llIllIlIIl[0]] = llIllIlIIl[37];
                Inventory.getFirst((int[])nArray13).interact(llIllIIlll[llIllIlIIl[24]]);
            }
            int[] nArray14 = new int[llIllIlIIl[1]];
            nArray14[aq.llIllIlIIl[0]] = llIllIlIIl[16];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[llIllIlIIl[1]];
                nArray15[aq.llIllIlIIl[0]] = llIllIlIIl[16];
                Inventory.getFirst((int[])nArray15).interact(llIllIIlll[llIllIlIIl[38]]);
            }
        }
        if (aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.DEFENCE), llIllIlIIl[39])) {
            int[] nArray = new int[llIllIlIIl[1]];
            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[19];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[llIllIlIIl[1]];
                nArray16[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                Inventory.getFirst((int[])nArray16).interact(llIllIIlll[llIllIlIIl[40]]);
            }
        }
        if (aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
            int[] nArray = new int[llIllIlIIl[1]];
            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[17];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray17 = new int[llIllIlIIl[1]];
                nArray17[aq.llIllIlIIl[0]] = llIllIlIIl[17];
                Inventory.getFirst((int[])nArray17).interact(llIllIIlll[llIllIlIIl[41]]);
            }
        }
        int[] nArray = new int[llIllIlIIl[1]];
        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[20];
        if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray18 = new int[llIllIlIIl[1]];
            nArray18[aq.llIllIlIIl[0]] = llIllIlIIl[20];
            Inventory.getFirst((int[])nArray18).interact(llIllIIlll[llIllIlIIl[42]]);
        }
        int[] nArray19 = new int[llIllIlIIl[1]];
        nArray19[aq.llIllIlIIl[0]] = llIllIlIIl[21];
        if (aq.lIllIllllIIll(Inventory.contains((int[])nArray19) ? 1 : 0)) {
            int[] nArray20 = new int[llIllIlIIl[1]];
            nArray20[aq.llIllIlIIl[0]] = llIllIlIIl[21];
            Inventory.getFirst((int[])nArray20).interact(llIllIIlll[llIllIlIIl[43]]);
        }
        if (aq.lIllIlllllIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIlIIl[44])) {
            int[] nArray21 = new int[llIllIlIIl[1]];
            nArray21[aq.llIllIlIIl[0]] = llIllIlIIl[8];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                int[] nArray22 = new int[llIllIlIIl[1]];
                nArray22[aq.llIllIlIIl[0]] = llIllIlIIl[8];
                if (aq.lIllIllllIlIl(Equipment.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[llIllIlIIl[1]];
                    nArray23[aq.llIllIlIIl[0]] = llIllIlIIl[8];
                    Inventory.getFirst((int[])nArray23).interact(llIllIIlll[llIllIlIIl[45]]);
                }
            }
            if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
                int[] nArray24 = new int[llIllIlIIl[1]];
                nArray24[aq.llIllIlIIl[0]] = llIllIlIIl[9];
                if (aq.lIllIllllIIll(Inventory.contains((int[])nArray24) ? 1 : 0)) {
                    int[] nArray25 = new int[llIllIlIIl[1]];
                    nArray25[aq.llIllIlIIl[0]] = llIllIlIIl[9];
                    if (aq.lIllIllllIlIl(Equipment.contains((int[])nArray25) ? 1 : 0)) {
                        int[] nArray26 = new int[llIllIlIIl[1]];
                        nArray26[aq.llIllIlIIl[0]] = llIllIlIIl[9];
                        Inventory.getFirst((int[])nArray26).interact(llIllIIlll[llIllIlIIl[46]]);
                    }
                }
            }
            if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2]) && aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIllIlIIl[39])) {
                int[] nArray27 = new int[llIllIlIIl[1]];
                nArray27[aq.llIllIlIIl[0]] = llIllIlIIl[10];
                if (aq.lIllIllllIIll(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                    int[] nArray28 = new int[llIllIlIIl[1]];
                    nArray28[aq.llIllIlIIl[0]] = llIllIlIIl[10];
                    if (aq.lIllIllllIlIl(Equipment.contains((int[])nArray28) ? 1 : 0)) {
                        int[] nArray29 = new int[llIllIlIIl[1]];
                        nArray29[aq.llIllIlIIl[0]] = llIllIlIIl[10];
                        Inventory.getFirst((int[])nArray29).interact(llIllIIlll[llIllIlIIl[47]]);
                    }
                }
            }
            if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
                int[] nArray30 = new int[llIllIlIIl[1]];
                nArray30[aq.llIllIlIIl[0]] = llIllIlIIl[11];
                if (aq.lIllIllllIIll(Inventory.contains((int[])nArray30) ? 1 : 0)) {
                    int[] nArray31 = new int[llIllIlIIl[1]];
                    nArray31[aq.llIllIlIIl[0]] = llIllIlIIl[11];
                    Inventory.getFirst((int[])nArray31).interact(llIllIIlll[llIllIlIIl[48]]);
                }
            }
        }
    }

    @Override
    public int af() {
        try {
            aq.aA();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return llIllIlIIl[57];
    }

    private static boolean lIllIlllllIIl(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public boolean ae() {
        return llIllIlIIl[0];
    }

    private static boolean lIllIlllllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void Q() {
        block30: {
            d var2;
            block29: {
                block28: {
                    block27: {
                        Object var3;
                        block25: {
                            block26: {
                                if (!aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[27])) break block25;
                                int[] nArray = new int[llIllIlIIl[1]];
                                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[12];
                                if (aq.lIllIllllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    d d2 = new DHelper(llIllIlIIl[12], llIllIlIIl[1], llIllIlIIl[49]);
                                    bv.add(d2);

                                }
                                int[] nArray2 = new int[llIllIlIIl[1]];
                                nArray2[aq.llIllIlIIl[0]] = llIllIlIIl[13];
                                if (aq.lIllIllllIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    var3 = new DHelper(llIllIlIIl[13], llIllIlIIl[1], llIllIlIIl[49]);
                                    bv.add((DHelper) ar3);

                                }
                                int[] nArray3 = new int[llIllIlIIl[1]];
                                nArray3[aq.llIllIlIIl[0]] = llIllIlIIl[14];
                                if (aq.lIllIllllIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    var3 = new DHelper(llIllIlIIl[14], llIllIlIIl[1], llIllIlIIl[49]);
                                    bv.add((DHelper) ar3);

                                }
                                int[] nArray4 = new int[llIllIlIIl[1]];
                                nArray4[aq.llIllIlIIl[0]] = llIllIlIIl[15];
                                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray4) ? 1 : 0)) break block26;
                                int[] nArray5 = new int[llIllIlIIl[1]];
                                nArray5[aq.llIllIlIIl[0]] = llIllIlIIl[15];
                                if (!aq.lIllIllllIlII(Bank.getFirst((int[])nArray5).getQuantity(), llIllIlIIl[50])) break block25;
                            }
                            var3 = new DHelper(llIllIlIIl[15], llIllIlIIl[51], llIllIlIIl[36]);
                            bv.add((DHelper) ar3);

                        }
                        int[] nArray = new int[llIllIlIIl[1]];
                        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                        if (aq.lIllIllllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            var3 = new DHelper(llIllIlIIl[18], llIllIlIIl[1], llIllIlIIl[52]);
                            bv.add((DHelper) ar3);

                        }
                        int[] nArray6 = new int[llIllIlIIl[1]];
                        nArray6[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                        if (aq.lIllIllllIlIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            var3 = new DHelper(llIllIlIIl[19], llIllIlIIl[1], llIllIlIIl[52]);
                            bv.add((DHelper) ar3);

                        }
                        int[] nArray7 = new int[llIllIlIIl[1]];
                        nArray7[aq.llIllIlIIl[0]] = llIllIlIIl[17];
                        if (aq.lIllIllllIlIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            var3 = new DHelper(llIllIlIIl[17], llIllIlIIl[1], llIllIlIIl[52]);
                            bv.add((DHelper) ar3);

                        }
                        int[] nArray8 = new int[llIllIlIIl[1]];
                        nArray8[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                        if (aq.lIllIllllIlIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            var3 = new DHelper(llIllIlIIl[20], llIllIlIIl[1], llIllIlIIl[53]);
                            bv.add((DHelper) ar3);

                        }
                        if (aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
                            int[] nArray9 = new int[llIllIlIIl[1]];
                            nArray9[aq.llIllIlIIl[0]] = llIllIlIIl[16];
                            if (aq.lIllIllllIlIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                var3 = new DHelper(llIllIlIIl[16], llIllIlIIl[54], llIllIlIIl[43]);
                                bv.add((DHelper) ar3);

                            }
                        }
                        int[] nArray10 = new int[llIllIlIIl[1]];
                        nArray10[aq.llIllIlIIl[0]] = llIllIlIIl[9];
                        if (aq.lIllIllllIlIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            var3 = new DHelper(llIllIlIIl[9], llIllIlIIl[1], llIllIlIIl[55]);
                            bv.add((DHelper) ar3);

                        }
                        int[] nArray11 = new int[llIllIlIIl[1]];
                        nArray11[aq.llIllIlIIl[0]] = llIllIlIIl[10];
                        if (aq.lIllIllllIlIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                            var3 = new DHelper(llIllIlIIl[10], llIllIlIIl[1], llIllIlIIl[55]);
                            bv.add((DHelper) ar3);

                        }
                        if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
                            int[] nArray12 = new int[llIllIlIIl[1]];
                            nArray12[aq.llIllIlIIl[0]] = llIllIlIIl[11];
                            if (aq.lIllIllllIlIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                var3 = new DHelper(llIllIlIIl[11], llIllIlIIl[51], llIllIlIIl[56]);
                                bv.add((DHelper) ar3);

                            }
                        }
                        int[] nArray13 = new int[llIllIlIIl[1]];
                        nArray13[aq.llIllIlIIl[0]] = llIllIlIIl[22];
                        if (aq.lIllIllllIlIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                            var3 = new DHelper(llIllIlIIl[22], llIllIlIIl[1], j.cf);
                            bv.add((DHelper) ar3);

                        }
                        int[] nArray14 = new int[llIllIlIIl[1]];
                        nArray14[aq.llIllIlIIl[0]] = llIllIlIIl[26];
                        if (aq.lIllIllllIlIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                            var3 = new DHelper(llIllIlIIl[26], llIllIlIIl[57], llIllIlIIl[58]);
                            bv.add((DHelper) ar3);

                        }
                        if (aq.lIllIllllIlIl(Bank.contains((Predicate)(var3 = item -> item.getName().toLowerCase().contains(llIllIIlll[llIllIlIIl[63]]))) ? 1 : 0)) {
                            var2 = new DHelper(llIllIlIIl[59], llIllIlIIl[6], llIllIlIIl[60]);
                            bv.add(var2);

                        }
                        int[] nArray15 = new int[llIllIlIIl[1]];
                        nArray15[aq.llIllIlIIl[0]] = llIllIlIIl[61];
                        if (!aq.lIllIllllIIll(Bank.contains((int[])nArray15) ? 1 : 0)) break block27;
                        int[] nArray16 = new int[llIllIlIIl[1]];
                        nArray16[aq.llIllIlIIl[0]] = llIllIlIIl[61];
                        if (!aq.lIllIllllIIll(Bank.contains((int[])nArray16) ? 1 : 0)) break block28;
                        int[] nArray17 = new int[llIllIlIIl[1]];
                        nArray17[aq.llIllIlIIl[0]] = llIllIlIIl[61];
                        if (!aq.lIllIllllIlII(Bank.getFirst((int[])nArray17).getQuantity(), llIllIlIIl[24])) break block28;
                    }
                    var2 = new DHelper(llIllIlIIl[61], llIllIlIIl[24], llIllIlIIl[62]);
                    bv.add(var2);

                }
                int[] nArray = new int[llIllIlIIl[1]];
                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[23];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block29;
                int[] nArray18 = new int[llIllIlIIl[1]];
                nArray18[aq.llIllIlIIl[0]] = llIllIlIIl[23];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray18) ? 1 : 0)) break block30;
                int[] nArray19 = new int[llIllIlIIl[1]];
                nArray19[aq.llIllIlIIl[0]] = llIllIlIIl[23];
                if (!aq.lIllIllllIlII(Bank.getFirst((int[])nArray19).getQuantity(), llIllIlIIl[24])) break block30;
            }
            var2 = new DHelper(llIllIlIIl[23], llIllIlIIl[24], llIllIlIIl[62]);
            bv.add(var2);

        }
    }

    public static void aA() {
        if (aq.lIllIllllIIll(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIllIIlll[llIllIlIIl[0]];
            b.a(bv);
            if (aq.lIllIllllIlII(bv.size(), llIllIlIIl[1])) {
                System.out.println(llIllIIlll[llIllIlIIl[1]]);
                bt = llIllIlIIl[0];
            }
        }
        if (aq.lIllIllllIlIl(bt ? 1 : 0) && aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
            BankLocation var4;
            if (aq.lIllIllllIlIl(aq.an() ? 1 : 0)) {
                var4 = BankLocation.getNearest();
                if (aq.lIllIllllIllI(var4) && aq.lIllIllllIlIl(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIIlll[llIllIlIIl[3]];
                    a.a(var4);
                }
                if (aq.lIllIllllIllI(var4) && aq.lIllIllllIIll(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIIlll[llIllIlIIl[4]];
                    if (aq.lIllIllllIlIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIllIlIIl[5]);

                        Time.sleepTicks((int)llIllIlIIl[4]);

                    }
                    if (aq.lIllIllllIIll(Bank.isOpen() ? 1 : 0)) {
                        if (aq.lIllIllllIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIllIlIIl[6]);

                        }
                        if (aq.lIllIllllIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIllIlIIl[3]);

                        }
                        if (aq.lIllIllllIlIl(aq.ao() ? 1 : 0)) {
                            aq.Q();
                            System.out.println(llIllIIlll[llIllIlIIl[7]]);
                            bt = llIllIlIIl[1];
                            return;
                        }
                        if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
                            a.a(llIllIlIIl[8], llIllIlIIl[1]);
                            a.a(llIllIlIIl[9], llIllIlIIl[1]);
                            a.a(llIllIlIIl[10], llIllIlIIl[1]);
                            Bank.withdrawAll((int)llIllIlIIl[11], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        }
                        if (aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
                            a.a(llIllIlIIl[12], llIllIlIIl[1]);
                            a.a(llIllIlIIl[13], llIllIlIIl[1]);
                            a.a(llIllIlIIl[14], llIllIlIIl[1]);
                            Bank.withdrawAll((int)llIllIlIIl[15], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)llIllIlIIl[1]);

                            Bank.withdrawAll((int)llIllIlIIl[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)llIllIlIIl[1]);

                            a.a(llIllIlIIl[17], llIllIlIIl[1]);
                        }
                        a.a(llIllIlIIl[18], llIllIlIIl[1]);
                        a.a(llIllIlIIl[19], llIllIlIIl[1]);
                        a.a(llIllIlIIl[20], llIllIlIIl[1]);
                        a.a(llIllIlIIl[21], llIllIlIIl[1]);
                        a.a(llIllIlIIl[22], llIllIlIIl[1]);
                        a.a(llIllIlIIl[23], llIllIlIIl[24]);
                        a.a(llIllIlIIl[25], llIllIlIIl[24]);
                        a.a(llIllIlIIl[26], Inventory.getFreeSlots());
                    }
                }
            }
            if (aq.lIllIllllIIll(aq.an() ? 1 : 0)) {
                aq.aB();
                if (aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[27])) {
                    m.al();
                }
                if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[27]) && aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
                    var4 = TileItems.getNearest(tileItem -> {
                        int n2;
                        if (aq.lIllIlllllIlI(tileItem.getId(), llIllIlIIl[16]) && aq.lIllIlllllIII(tileItem.getQuantity(), llIllIlIIl[43])) {
                            n2 = llIllIlIIl[1];

                            if (-1 == (0x64 ^ 0x50 ^ (0xA1 ^ 0x91))) {
                                return false;
                            }
                        } else {
                            n2 = llIllIlIIl[0];
                        }
                        return n2 != 0;
                    });
                    if (aq.lIllIllllIllI(var4)) {
                        var4.interact(llIllIIlll[llIllIlIIl[6]]);
                        Time.sleepTicks((int)llIllIlIIl[7]);

                    }
                    l.aj();
                }
            }
        }
        if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2]) && aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[28])) {
            s.aV();
            int[] nArray = new int[llIllIlIIl[1]];
            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[29];
            if (aq.lIllIllllIIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIllIlIIl[1]];
                nArray2[aq.llIllIlIIl[0]] = llIllIlIIl[29];
                Equipment.getFirst((int[])nArray2).interact(llIllIIlll[llIllIlIIl[30]]);
            }
        }
    }

    private static boolean lIllIllllIlll(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIllllIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIllllIlIl(int n2) {
        return n2 == 0;
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
                                                                                                                                            if (!aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2]) || !aq.lIllIlllllIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIlIIl[44]) || !aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIllIlIIl[39])) break block16;
                                                                                                                                            int[] nArray = new int[llIllIlIIl[1]];
                                                                                                                                            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[9];
                                                                                                                                            if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block17;
                                                                                                                                            int[] nArray2 = new int[llIllIlIIl[1]];
                                                                                                                                            nArray2[aq.llIllIlIIl[0]] = llIllIlIIl[9];
                                                                                                                                            if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray2) ? 1 : 0)) break block18;
                                                                                                                                        }
                                                                                                                                        int[] nArray = new int[llIllIlIIl[1]];
                                                                                                                                        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[10];
                                                                                                                                        if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block19;
                                                                                                                                        int[] nArray3 = new int[llIllIlIIl[1]];
                                                                                                                                        nArray3[aq.llIllIlIIl[0]] = llIllIlIIl[10];
                                                                                                                                        if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray3) ? 1 : 0)) break block18;
                                                                                                                                    }
                                                                                                                                    int[] nArray = new int[llIllIlIIl[1]];
                                                                                                                                    nArray[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                                                                                                                                    if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                                                                                                    int[] nArray4 = new int[llIllIlIIl[1]];
                                                                                                                                    nArray4[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                                                                                                                                    if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray4) ? 1 : 0)) break block18;
                                                                                                                                }
                                                                                                                                int[] nArray = new int[llIllIlIIl[1]];
                                                                                                                                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                                                                                                                if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                                                                                                                                int[] nArray5 = new int[llIllIlIIl[1]];
                                                                                                                                nArray5[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                                                                                                                if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray5) ? 1 : 0)) break block18;
                                                                                                                            }
                                                                                                                            int[] nArray = new int[llIllIlIIl[1]];
                                                                                                                            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[11];
                                                                                                                            if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                                                                            int[] nArray6 = new int[llIllIlIIl[1]];
                                                                                                                            nArray6[aq.llIllIlIIl[0]] = llIllIlIIl[11];
                                                                                                                            if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray6) ? 1 : 0)) break block18;
                                                                                                                        }
                                                                                                                        int[] nArray = new int[llIllIlIIl[1]];
                                                                                                                        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[8];
                                                                                                                        if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                                                                                                        int[] nArray7 = new int[llIllIlIIl[1]];
                                                                                                                        nArray7[aq.llIllIlIIl[0]] = llIllIlIIl[8];
                                                                                                                        if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray7) ? 1 : 0)) break block18;
                                                                                                                    }
                                                                                                                    int[] nArray = new int[llIllIlIIl[1]];
                                                                                                                    nArray[aq.llIllIlIIl[0]] = llIllIlIIl[26];
                                                                                                                    if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                                                        n5 = llIllIlIIl[1];

                                                                                                                        if (-1 == -1) return n5 != 0;
                                                                                                                        return ((0x16 ^ 0x51 ^ (0xE0 ^ 0x8F)) & (157 + 152 - 213 + 92 ^ 116 + 20 - 120 + 132 ^ -1)) != 0;
                                                                                                                    }
                                                                                                                }
                                                                                                                n5 = llIllIlIIl[0];
                                                                                                                return n5 != 0;
                                                                                                            }
                                                                                                            if (!aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2]) || !aq.lIllIlllllIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIlIIl[44]) || !aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.DEFENCE), llIllIlIIl[39])) break block24;
                                                                                                            int[] nArray = new int[llIllIlIIl[1]];
                                                                                                            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[9];
                                                                                                            if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
                                                                                                            int[] nArray8 = new int[llIllIlIIl[1]];
                                                                                                            nArray8[aq.llIllIlIIl[0]] = llIllIlIIl[9];
                                                                                                            if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray8) ? 1 : 0)) break block26;
                                                                                                        }
                                                                                                        int[] nArray = new int[llIllIlIIl[1]];
                                                                                                        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                                                                                                        if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block27;
                                                                                                        int[] nArray9 = new int[llIllIlIIl[1]];
                                                                                                        nArray9[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                                                                                                        if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray9) ? 1 : 0)) break block26;
                                                                                                    }
                                                                                                    int[] nArray = new int[llIllIlIIl[1]];
                                                                                                    nArray[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                                                                                                    if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                                                                                                    int[] nArray10 = new int[llIllIlIIl[1]];
                                                                                                    nArray10[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                                                                                                    if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray10) ? 1 : 0)) break block26;
                                                                                                }
                                                                                                int[] nArray = new int[llIllIlIIl[1]];
                                                                                                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                                                                                if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block29;
                                                                                                int[] nArray11 = new int[llIllIlIIl[1]];
                                                                                                nArray11[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                                                                                if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray11) ? 1 : 0)) break block26;
                                                                                            }
                                                                                            int[] nArray = new int[llIllIlIIl[1]];
                                                                                            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[11];
                                                                                            if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block30;
                                                                                            int[] nArray12 = new int[llIllIlIIl[1]];
                                                                                            nArray12[aq.llIllIlIIl[0]] = llIllIlIIl[11];
                                                                                            if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block26;
                                                                                        }
                                                                                        int[] nArray = new int[llIllIlIIl[1]];
                                                                                        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[8];
                                                                                        if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                                        int[] nArray13 = new int[llIllIlIIl[1]];
                                                                                        nArray13[aq.llIllIlIIl[0]] = llIllIlIIl[8];
                                                                                        if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray13) ? 1 : 0)) break block26;
                                                                                    }
                                                                                    int[] nArray = new int[llIllIlIIl[1]];
                                                                                    nArray[aq.llIllIlIIl[0]] = llIllIlIIl[26];
                                                                                    if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                        n4 = llIllIlIIl[1];

                                                                                        if (1 >= ((0xE ^ 0x4D ^ (0x40 ^ 0x3E)) & (0x51 ^ 0x72 ^ (0x90 ^ 0x8E) ^ -1))) return n4 != 0;
                                                                                        return false;
                                                                                    }
                                                                                }
                                                                                n4 = llIllIlIIl[0];
                                                                                return n4 != 0;
                                                                            }
                                                                            if (!aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[27]) || !aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) break block32;
                                                                            int[] nArray = new int[llIllIlIIl[1]];
                                                                            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[17];
                                                                            if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                            int[] nArray14 = new int[llIllIlIIl[1]];
                                                                            nArray14[aq.llIllIlIIl[0]] = llIllIlIIl[17];
                                                                            if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray14) ? 1 : 0)) break block34;
                                                                        }
                                                                        int[] nArray = new int[llIllIlIIl[1]];
                                                                        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                                                                        if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block35;
                                                                        int[] nArray15 = new int[llIllIlIIl[1]];
                                                                        nArray15[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                                                                        if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray15) ? 1 : 0)) break block34;
                                                                    }
                                                                    int[] nArray = new int[llIllIlIIl[1]];
                                                                    nArray[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                                                                    if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block36;
                                                                    int[] nArray16 = new int[llIllIlIIl[1]];
                                                                    nArray16[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                                                                    if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray16) ? 1 : 0)) break block34;
                                                                }
                                                                int[] nArray = new int[llIllIlIIl[1]];
                                                                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                                                if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block37;
                                                                int[] nArray17 = new int[llIllIlIIl[1]];
                                                                nArray17[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                                                if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray17) ? 1 : 0)) break block34;
                                                            }
                                                            int[] nArray = new int[llIllIlIIl[1]];
                                                            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[16];
                                                            if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block38;
                                                            int[] nArray18 = new int[llIllIlIIl[1]];
                                                            nArray18[aq.llIllIlIIl[0]] = llIllIlIIl[16];
                                                            if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray18) ? 1 : 0)) break block34;
                                                        }
                                                        int[] nArray = new int[llIllIlIIl[1]];
                                                        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[26];
                                                        if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                            n3 = llIllIlIIl[1];

                                                            if (-3 < 0) return n3 != 0;
                                                            return false;
                                                        }
                                                    }
                                                    n3 = llIllIlIIl[0];
                                                    return n3 != 0;
                                                }
                                                int[] nArray = new int[llIllIlIIl[1]];
                                                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[17];
                                                if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block39;
                                                int[] nArray19 = new int[llIllIlIIl[1]];
                                                nArray19[aq.llIllIlIIl[0]] = llIllIlIIl[17];
                                                if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray19) ? 1 : 0)) break block40;
                                            }
                                            int[] nArray = new int[llIllIlIIl[1]];
                                            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                                            if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block41;
                                            int[] nArray20 = new int[llIllIlIIl[1]];
                                            nArray20[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                                            if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray20) ? 1 : 0)) break block40;
                                        }
                                        int[] nArray = new int[llIllIlIIl[1]];
                                        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                                        if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block42;
                                        int[] nArray21 = new int[llIllIlIIl[1]];
                                        nArray21[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                                        if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray21) ? 1 : 0)) break block40;
                                    }
                                    int[] nArray = new int[llIllIlIIl[1]];
                                    nArray[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                    if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block43;
                                    int[] nArray22 = new int[llIllIlIIl[1]];
                                    nArray22[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                    if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray22) ? 1 : 0)) break block40;
                                }
                                int[] nArray = new int[llIllIlIIl[1]];
                                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[15];
                                if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block44;
                                int[] nArray23 = new int[llIllIlIIl[1]];
                                nArray23[aq.llIllIlIIl[0]] = llIllIlIIl[15];
                                if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray23) ? 1 : 0)) break block40;
                            }
                            int[] nArray = new int[llIllIlIIl[1]];
                            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[12];
                            if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                            int[] nArray24 = new int[llIllIlIIl[1]];
                            nArray24[aq.llIllIlIIl[0]] = llIllIlIIl[12];
                            if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray24) ? 1 : 0)) break block40;
                        }
                        int[] nArray = new int[llIllIlIIl[1]];
                        nArray[aq.llIllIlIIl[0]] = llIllIlIIl[13];
                        if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block46;
                        int[] nArray25 = new int[llIllIlIIl[1]];
                        nArray25[aq.llIllIlIIl[0]] = llIllIlIIl[13];
                        if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray25) ? 1 : 0)) break block40;
                    }
                    int[] nArray = new int[llIllIlIIl[1]];
                    nArray[aq.llIllIlIIl[0]] = llIllIlIIl[14];
                    if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block47;
                    int[] nArray26 = new int[llIllIlIIl[1]];
                    nArray26[aq.llIllIlIIl[0]] = llIllIlIIl[14];
                    if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray26) ? 1 : 0)) break block40;
                }
                int[] nArray = new int[llIllIlIIl[1]];
                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[16];
                if (!aq.lIllIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block48;
                int[] nArray27 = new int[llIllIlIIl[1]];
                nArray27[aq.llIllIlIIl[0]] = llIllIlIIl[16];
                if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray27) ? 1 : 0)) break block40;
            }
            int[] nArray = new int[llIllIlIIl[1]];
            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[26];
            if (aq.lIllIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = llIllIlIIl[1];

                if (null == null) return n2 != 0;
                return false;
            }
        }
        n2 = llIllIlIIl[0];
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ao() {
        int n2;
        block20: {
            block21: {
                if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2]) && aq.lIllIlllllIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIlIIl[44]) && aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIllIlIIl[39])) {
                    int n3;
                    int[] nArray = new int[llIllIlIIl[1]];
                    nArray[aq.llIllIlIIl[0]] = llIllIlIIl[9];
                    if (aq.lIllIllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[llIllIlIIl[1]];
                        nArray2[aq.llIllIlIIl[0]] = llIllIlIIl[10];
                        if (aq.lIllIllllIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[llIllIlIIl[1]];
                            nArray3[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                            if (aq.lIllIllllIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[llIllIlIIl[1]];
                                nArray4[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                if (aq.lIllIllllIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    int[] nArray5 = new int[llIllIlIIl[1]];
                                    nArray5[aq.llIllIlIIl[0]] = llIllIlIIl[11];
                                    if (aq.lIllIllllIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                        int[] nArray6 = new int[llIllIlIIl[1]];
                                        nArray6[aq.llIllIlIIl[0]] = llIllIlIIl[8];
                                        if (aq.lIllIllllIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                            int[] nArray7 = new int[llIllIlIIl[1]];
                                            nArray7[aq.llIllIlIIl[0]] = llIllIlIIl[26];
                                            if (aq.lIllIllllIIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                n3 = llIllIlIIl[1];

                                                if (-1 <= 0) return n3 != 0;
                                                return ((0x2B ^ 0x40 ^ (0x1F ^ 0x6C)) & (0xC ^ 0x52 ^ (0x29 ^ 0x6F) ^ -1)) != 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n3 = llIllIlIIl[0];
                    return n3 != 0;
                }
                if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[27]) && aq.lIllIllllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[2])) {
                    int n4;
                    int[] nArray = new int[llIllIlIIl[1]];
                    nArray[aq.llIllIlIIl[0]] = llIllIlIIl[17];
                    if (aq.lIllIllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[llIllIlIIl[1]];
                        nArray8[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                        if (aq.lIllIllllIIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[llIllIlIIl[1]];
                            nArray9[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                            if (aq.lIllIllllIIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[llIllIlIIl[1]];
                                nArray10[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                                if (aq.lIllIllllIIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                    int[] nArray11 = new int[llIllIlIIl[1]];
                                    nArray11[aq.llIllIlIIl[0]] = llIllIlIIl[16];
                                    if (aq.lIllIllllIIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                        int[] nArray12 = new int[llIllIlIIl[1]];
                                        nArray12[aq.llIllIlIIl[0]] = llIllIlIIl[26];
                                        if (aq.lIllIllllIIll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                            n4 = llIllIlIIl[1];

                                            if (2 <= 3) return n4 != 0;
                                            return ((0x46 ^ 0x54 ^ (0x2B ^ 9)) & (0x2C ^ 0x62 ^ (0x4F ^ 0x31) ^ -1)) != 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n4 = llIllIlIIl[0];
                    return n4 != 0;
                }
                int[] nArray = new int[llIllIlIIl[1]];
                nArray[aq.llIllIlIIl[0]] = llIllIlIIl[17];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                int[] nArray13 = new int[llIllIlIIl[1]];
                nArray13[aq.llIllIlIIl[0]] = llIllIlIIl[19];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray13) ? 1 : 0)) break block20;
                int[] nArray14 = new int[llIllIlIIl[1]];
                nArray14[aq.llIllIlIIl[0]] = llIllIlIIl[18];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray14) ? 1 : 0)) break block20;
                int[] nArray15 = new int[llIllIlIIl[1]];
                nArray15[aq.llIllIlIIl[0]] = llIllIlIIl[20];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray15) ? 1 : 0)) break block20;
                int[] nArray16 = new int[llIllIlIIl[1]];
                nArray16[aq.llIllIlIIl[0]] = llIllIlIIl[12];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray16) ? 1 : 0)) break block20;
                int[] nArray17 = new int[llIllIlIIl[1]];
                nArray17[aq.llIllIlIIl[0]] = llIllIlIIl[23];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray17) ? 1 : 0)) break block20;
                int[] nArray18 = new int[llIllIlIIl[1]];
                nArray18[aq.llIllIlIIl[0]] = llIllIlIIl[13];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray18) ? 1 : 0)) break block20;
                int[] nArray19 = new int[llIllIlIIl[1]];
                nArray19[aq.llIllIlIIl[0]] = llIllIlIIl[14];
                if (!aq.lIllIllllIIll(Bank.contains((int[])nArray19) ? 1 : 0)) break block20;
                int[] nArray20 = new int[llIllIlIIl[1]];
                nArray20[aq.llIllIlIIl[0]] = llIllIlIIl[15];
                if (!aq.lIllIllllIlIl(Bank.contains((int[])nArray20) ? 1 : 0)) break block21;
                int[] nArray21 = new int[llIllIlIIl[1]];
                nArray21[aq.llIllIlIIl[0]] = llIllIlIIl[15];
                if (!aq.lIllIllllIIll(Equipment.contains((int[])nArray21) ? 1 : 0)) break block20;
            }
            int[] nArray = new int[llIllIlIIl[1]];
            nArray[aq.llIllIlIIl[0]] = llIllIlIIl[16];
            if (aq.lIllIllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray22 = new int[llIllIlIIl[1]];
                nArray22[aq.llIllIlIIl[0]] = llIllIlIIl[26];
                if (aq.lIllIllllIIll(Bank.contains((int[])nArray22) ? 1 : 0)) {
                    n2 = llIllIlIIl[1];

                    if (-1 < (44 + 78 - 10 + 19 ^ 81 + 64 - 84 + 74)) return n2 != 0;
                    return ((0x49 ^ 0xC ^ (0x53 ^ 0x1D)) & (0xE4 ^ 0x91 ^ (0x15 ^ 0x6B) ^ -1)) != 0;
                }
            }
        }
        n2 = llIllIlIIl[0];
        return n2 != 0;
    }

    private static void lIllIlllIlllI() {
        llIllIIlll = new String[llIllIlIIl[65]];
        aq.llIllIIlll[aq.llIllIlIIl[0]] = "Buying items";
        aq.llIllIIlll[aq.llIllIlIIl[1]] = "Finished buying items, switching back to magic training";
        aq.llIllIIlll[aq.llIllIlIIl[3]] = "Navigating to bank";
        aq.llIllIIlll[aq.llIllIlIIl[4]] = "Handling banking";
        aq.llIllIIlll[aq.llIllIlIIl[7]] = "We are missing supplies, switching to BUYING";
        aq.llIllIIlll[aq.llIllIlIIl[6]] = "Take";
        aq.llIllIIlll[aq.llIllIlIIl[30]] = "Remove";
        aq.llIllIIlll[aq.llIllIlIIl[33]] = "Wield";
        aq.llIllIIlll[aq.llIllIlIIl[35]] = "Wear";
        aq.llIllIIlll[aq.llIllIlIIl[36]] = "Wield";
        aq.llIllIIlll[aq.llIllIlIIl[24]] = "Wield";
        aq.llIllIIlll[aq.llIllIlIIl[38]] = "Wield";
        aq.llIllIIlll[aq.llIllIlIIl[40]] = "Wear";
        aq.llIllIIlll[aq.llIllIlIIl[41]] = "Wear";
        aq.llIllIIlll[aq.llIllIlIIl[42]] = "Wear";
        aq.llIllIIlll[aq.llIllIlIIl[43]] = "Wear";
        aq.llIllIIlll[aq.llIllIlIIl[45]] = "Wear";
        aq.llIllIIlll[aq.llIllIlIIl[46]] = "Wear";
        aq.llIllIIlll[aq.llIllIlIIl[47]] = "Wear";
        aq.llIllIIlll[aq.llIllIlIIl[48]] = "Wield";
        aq.llIllIIlll[aq.llIllIlIIl[34]] = "Range training";
        aq.llIllIIlll[aq.llIllIlIIl[63]] = "ring of wealth (";
        aq.llIllIIlll[aq.llIllIlIIl[64]] = "bow";
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aq.lIllIlllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlIIl[28])) {
            bl = llIllIlIIl[1];

            if (-1 >= 3) {
                return ((47 + 125 - 72 + 58 ^ 138 + 55 - 186 + 161) & (0x7E ^ 0x45 ^ (0x4F ^ 0x42) ^ -1)) != 0;
            }
        } else {
            bl = llIllIlIIl[0];
        }
        return bl;
    }
}

