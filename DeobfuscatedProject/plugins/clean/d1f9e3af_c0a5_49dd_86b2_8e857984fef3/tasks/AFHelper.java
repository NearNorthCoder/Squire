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
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.KHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.LHelper;
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

public class AFHelper
implements W {
    public static  boolean bt;
    public static  List<d> bv;

    static {
        af.lIIIIlIIIIIl();
        af.lIIIIlIIIIII();
        bv = new ArrayList<d>();
    }

    private static void AFHelper() {
        block30: {
            d llllllIIlIlIlI;
            block29: {
                block28: {
                    block27: {
                        Object llllllIIlIlIll;
                        block25: {
                            block26: {
                                if (!af.lIIIIlIIIIll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[28])) break block25;
                                int[] nArray = new int[lIIllllIl[1]];
                                nArray[af.lIIllllIl[0]] = lIIllllIl[13];
                                if (af.lIIIIlIIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    d d2 = new DHelper(lIIllllIl[13], lIIllllIl[1], lIIllllIl[46]);
                                    bv.add(d2);

                                }
                                int[] nArray2 = new int[lIIllllIl[1]];
                                nArray2[af.lIIllllIl[0]] = lIIllllIl[14];
                                if (af.lIIIIlIIIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    llllllIIlIlIll = new DHelper(lIIllllIl[14], lIIllllIl[1], lIIllllIl[46]);
                                    bv.add((DHelper) lllllIIlIlIll);

                                }
                                int[] nArray3 = new int[lIIllllIl[1]];
                                nArray3[af.lIIllllIl[0]] = lIIllllIl[15];
                                if (af.lIIIIlIIIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    llllllIIlIlIll = new DHelper(lIIllllIl[15], lIIllllIl[1], lIIllllIl[46]);
                                    bv.add((DHelper) lllllIIlIlIll);

                                }
                                int[] nArray4 = new int[lIIllllIl[1]];
                                nArray4[af.lIIllllIl[0]] = lIIllllIl[16];
                                if (!af.lIIIIlIIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) break block26;
                                int[] nArray5 = new int[lIIllllIl[1]];
                                nArray5[af.lIIllllIl[0]] = lIIllllIl[16];
                                if (!af.lIIIIlIIIIll(Bank.getFirst((int[])nArray5).getQuantity(), lIIllllIl[47])) break block25;
                            }
                            llllllIIlIlIll = new DHelper(lIIllllIl[16], lIIllllIl[48], lIIllllIl[35]);
                            bv.add((DHelper) lllllIIlIlIll);

                        }
                        int[] nArray = new int[lIIllllIl[1]];
                        nArray[af.lIIllllIl[0]] = lIIllllIl[19];
                        if (af.lIIIIlIIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            llllllIIlIlIll = new DHelper(lIIllllIl[19], lIIllllIl[1], lIIllllIl[49]);
                            bv.add((DHelper) lllllIIlIlIll);

                        }
                        int[] nArray6 = new int[lIIllllIl[1]];
                        nArray6[af.lIIllllIl[0]] = lIIllllIl[20];
                        if (af.lIIIIlIIIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            llllllIIlIlIll = new DHelper(lIIllllIl[20], lIIllllIl[1], lIIllllIl[49]);
                            bv.add((DHelper) lllllIIlIlIll);

                        }
                        int[] nArray7 = new int[lIIllllIl[1]];
                        nArray7[af.lIIllllIl[0]] = lIIllllIl[18];
                        if (af.lIIIIlIIIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            llllllIIlIlIll = new DHelper(lIIllllIl[18], lIIllllIl[1], lIIllllIl[49]);
                            bv.add((DHelper) lllllIIlIlIll);

                        }
                        int[] nArray8 = new int[lIIllllIl[1]];
                        nArray8[af.lIIllllIl[0]] = lIIllllIl[21];
                        if (af.lIIIIlIIIlII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            llllllIIlIlIll = new DHelper(lIIllllIl[21], lIIllllIl[1], lIIllllIl[50]);
                            bv.add((DHelper) lllllIIlIlIll);

                        }
                        if (af.lIIIIlIIIIll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[8])) {
                            int[] nArray9 = new int[lIIllllIl[1]];
                            nArray9[af.lIIllllIl[0]] = lIIllllIl[17];
                            if (af.lIIIIlIIIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                llllllIIlIlIll = new DHelper(lIIllllIl[17], lIIllllIl[51], lIIllllIl[42]);
                                bv.add((DHelper) lllllIIlIlIll);

                            }
                        }
                        int[] nArray10 = new int[lIIllllIl[1]];
                        nArray10[af.lIIllllIl[0]] = lIIllllIl[10];
                        if (af.lIIIIlIIIlII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            llllllIIlIlIll = new DHelper(lIIllllIl[10], lIIllllIl[1], lIIllllIl[52]);
                            bv.add((DHelper) lllllIIlIlIll);

                        }
                        int[] nArray11 = new int[lIIllllIl[1]];
                        nArray11[af.lIIllllIl[0]] = lIIllllIl[11];
                        if (af.lIIIIlIIIlII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                            llllllIIlIlIll = new DHelper(lIIllllIl[11], lIIllllIl[1], lIIllllIl[52]);
                            bv.add((DHelper) lllllIIlIlIll);

                        }
                        if (af.lIIIIlIIIlll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[8])) {
                            int[] nArray12 = new int[lIIllllIl[1]];
                            nArray12[af.lIIllllIl[0]] = lIIllllIl[12];
                            if (af.lIIIIlIIIlII(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                llllllIIlIlIll = new DHelper(lIIllllIl[12], lIIllllIl[48], lIIllllIl[53]);
                                bv.add((DHelper) lllllIIlIlIll);

                            }
                        }
                        int[] nArray13 = new int[lIIllllIl[1]];
                        nArray13[af.lIIllllIl[0]] = lIIllllIl[23];
                        if (af.lIIIIlIIIlII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                            llllllIIlIlIll = new DHelper(lIIllllIl[23], lIIllllIl[1], i.bq);
                            bv.add((DHelper) lllllIIlIlIll);

                        }
                        int[] nArray14 = new int[lIIllllIl[1]];
                        nArray14[af.lIIllllIl[0]] = lIIllllIl[27];
                        if (af.lIIIIlIIIlII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                            llllllIIlIlIll = new DHelper(lIIllllIl[27], lIIllllIl[54], lIIllllIl[55]);
                            bv.add((DHelper) lllllIIlIlIll);

                        }
                        if (af.lIIIIlIIIlII(Bank.contains((Predicate)(llllllIIlIlIll = item -> item.getName().toLowerCase().contains(lIIllllII[lIIllllIl[2]]))) ? 1 : 0)) {
                            llllllIIlIlIlI = new DHelper(lIIllllIl[56], lIIllllIl[6], lIIllllIl[57]);
                            bv.add(llllllIIlIlIlI);

                        }
                        int[] nArray15 = new int[lIIllllIl[1]];
                        nArray15[af.lIIllllIl[0]] = lIIllllIl[58];
                        if (!af.lIIIIlIIIIlI(Bank.contains((int[])nArray15) ? 1 : 0)) break block27;
                        int[] nArray16 = new int[lIIllllIl[1]];
                        nArray16[af.lIIllllIl[0]] = lIIllllIl[58];
                        if (!af.lIIIIlIIIIlI(Bank.contains((int[])nArray16) ? 1 : 0)) break block28;
                        int[] nArray17 = new int[lIIllllIl[1]];
                        nArray17[af.lIIllllIl[0]] = lIIllllIl[58];
                        if (!af.lIIIIlIIIIll(Bank.getFirst((int[])nArray17).getQuantity(), lIIllllIl[25])) break block28;
                    }
                    llllllIIlIlIlI = new DHelper(lIIllllIl[58], lIIllllIl[25], lIIllllIl[59]);
                    bv.add(llllllIIlIlIlI);

                }
                int[] nArray = new int[lIIllllIl[1]];
                nArray[af.lIIllllIl[0]] = lIIllllIl[24];
                if (!af.lIIIIlIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block29;
                int[] nArray18 = new int[lIIllllIl[1]];
                nArray18[af.lIIllllIl[0]] = lIIllllIl[24];
                if (!af.lIIIIlIIIIlI(Bank.contains((int[])nArray18) ? 1 : 0)) break block30;
                int[] nArray19 = new int[lIIllllIl[1]];
                nArray19[af.lIIllllIl[0]] = lIIllllIl[24];
                if (!af.lIIIIlIIIIll(Bank.getFirst((int[])nArray19).getQuantity(), lIIllllIl[25])) break block30;
            }
            llllllIIlIlIlI = new DHelper(lIIllllIl[24], lIIllllIl[25], lIIllllIl[59]);
            bv.add(llllllIIlIlIlI);

        }
    }

    private static boolean lIIIIlIIIlIl(Object object) {
        return object != null;
    }

    private static boolean lIIIIlIIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIIlIIIlII(int n2) {
        return n2 == 0;
    }

    private static void lIIIIlIIIIII() {
        lIIllllII = new String[lIIllllIl[62]];
        af.lIIllllII[af.lIIllllIl[0]] = "Buying items";
        af.lIIllllII[af.lIIllllIl[1]] = "Finished buying items, switching back to magic training";
        af.lIIllllII[af.lIIllllIl[3]] = "Navigating to bank";
        af.lIIllllII[af.lIIllllIl[4]] = "Handling banking";
        af.lIIllllII[af.lIIllllIl[7]] = "We are missing supplies, switching to BUYING";
        af.lIIllllII[af.lIIllllIl[6]] = "Take";
        af.lIIllllII[af.lIIllllIl[31]] = "Wield";
        af.lIIllllII[af.lIIllllIl[32]] = "Wear";
        af.lIIllllII[af.lIIllllIl[33]] = "Wield";
        af.lIIllllII[af.lIIllllIl[35]] = "Wield";
        af.lIIllllII[af.lIIllllIl[25]] = "Wield";
        af.lIIllllII[af.lIIllllIl[37]] = "Wear";
        af.lIIllllII[af.lIIllllIl[38]] = "Wear";
        af.lIIllllII[af.lIIllllIl[39]] = "Wear";
        af.lIIllllII[af.lIIllllIl[40]] = "Wear";
        af.lIIllllII[af.lIIllllIl[42]] = "Wear";
        af.lIIllllII[af.lIIllllIl[43]] = "Wear";
        af.lIIllllII[af.lIIllllIl[44]] = "Wear";
        af.lIIllllII[af.lIIllllIl[45]] = "Wield";
        af.lIIllllII[af.lIIllllIl[60]] = "Range training";
        af.lIIllllII[af.lIIllllIl[2]] = "ring of wealth (";
        af.lIIllllII[af.lIIllllIl[61]] = "bow";
    }

    private static boolean lIIIIlIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String U() {
        return lIIllllII[lIIllllIl[60]];
    }

    private static boolean lIIIIlIIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIlIIlIII(Object object, Object object2) {
        return object != object2;
    }

    private static void aq() {
        block34: {
            block33: {
                int[] nArray = new int[lIIllllIl[1]];
                nArray[af.lIIllllIl[0]] = lIIllllIl[29];
                if (!af.lIIIIlIIIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block33;
                int[] nArray2 = new int[lIIllllIl[1]];
                nArray2[af.lIIllllIl[0]] = lIIllllIl[30];
                if (!af.lIIIIlIIIlII(Equipment.contains((int[])nArray2) ? 1 : 0)) break block33;
                int[] nArray3 = new int[lIIllllIl[1]];
                nArray3[af.lIIllllIl[0]] = lIIllllIl[17];
                if (!af.lIIIIlIIIlII(Equipment.contains((int[])nArray3) ? 1 : 0)) break block33;
                int[] nArray4 = new int[lIIllllIl[1]];
                nArray4[af.lIIllllIl[0]] = lIIllllIl[12];
                if (af.lIIIIlIIIlII(Equipment.contains((int[])nArray4) ? 1 : 0) && !af.lIIIIlIIIIlI(Equipment.contains(item -> item.getName().contains(lIIllllII[lIIllllIl[61]])) ? 1 : 0)) break block34;
            }
            if (af.lIIIIlIIlIII(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
            }
        }
        if (af.lIIIIlIIIIll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[28])) {
            int[] nArray = new int[lIIllllIl[1]];
            nArray[af.lIIllllIl[0]] = lIIllllIl[29];
            if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray5 = new int[lIIllllIl[1]];
                nArray5[af.lIIllllIl[0]] = lIIllllIl[29];
                Inventory.getFirst((int[])nArray5).interact(lIIllllII[lIIllllIl[31]]);
            }
            int[] nArray6 = new int[lIIllllIl[1]];
            nArray6[af.lIIllllIl[0]] = lIIllllIl[13];
            if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray6) ? 1 : 0) && af.lIIIIlIIIIll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[6])) {
                e.l(lIIllllIl[13]);
            }
            int[] nArray7 = new int[lIIllllIl[1]];
            nArray7[af.lIIllllIl[0]] = lIIllllIl[14];
            if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray7) ? 1 : 0) && af.lIIIIlIIIlll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[6]) && af.lIIIIlIIIIll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[2])) {
                e.l(lIIllllIl[14]);
            }
            int[] nArray8 = new int[lIIllllIl[1]];
            nArray8[af.lIIllllIl[0]] = lIIllllIl[15];
            if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray8) ? 1 : 0) && af.lIIIIlIIIlll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[2])) {
                e.l(lIIllllIl[15]);
            }
            int[] nArray9 = new int[lIIllllIl[1]];
            nArray9[af.lIIllllIl[0]] = lIIllllIl[16];
            if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                e.l(lIIllllIl[16]);
            }
        }
        if (af.lIIIIlIIIlll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[2])) {
            int[] nArray = new int[lIIllllIl[1]];
            nArray[af.lIIllllIl[0]] = lIIllllIl[19];
            if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray10 = new int[lIIllllIl[1]];
                nArray10[af.lIIllllIl[0]] = lIIllllIl[19];
                Inventory.getFirst((int[])nArray10).interact(lIIllllII[lIIllllIl[32]]);
            }
        }
        if (af.lIIIIlIIIlll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[28])) {
            int[] nArray = new int[lIIllllIl[1]];
            nArray[af.lIIllllIl[0]] = lIIllllIl[30];
            if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray11 = new int[lIIllllIl[1]];
                nArray11[af.lIIllllIl[0]] = lIIllllIl[30];
                Inventory.getFirst((int[])nArray11).interact(lIIllllII[lIIllllIl[33]]);
            }
            int[] nArray12 = new int[lIIllllIl[1]];
            nArray12[af.lIIllllIl[0]] = lIIllllIl[34];
            if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                int[] nArray13 = new int[lIIllllIl[1]];
                nArray13[af.lIIllllIl[0]] = lIIllllIl[34];
                Inventory.getFirst((int[])nArray13).interact(lIIllllII[lIIllllIl[35]]);
            }
            int[] nArray14 = new int[lIIllllIl[1]];
            nArray14[af.lIIllllIl[0]] = lIIllllIl[17];
            if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIIllllIl[1]];
                nArray15[af.lIIllllIl[0]] = lIIllllIl[17];
                Inventory.getFirst((int[])nArray15).interact(lIIllllII[lIIllllIl[25]]);
            }
        }
        if (af.lIIIIlIIIIll(Skills.getLevel((Skill)Skill.DEFENCE), lIIllllIl[36])) {
            int[] nArray = new int[lIIllllIl[1]];
            nArray[af.lIIllllIl[0]] = lIIllllIl[20];
            if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIllllIl[1]];
                nArray16[af.lIIllllIl[0]] = lIIllllIl[20];
                Inventory.getFirst((int[])nArray16).interact(lIIllllII[lIIllllIl[37]]);
            }
        }
        if (af.lIIIIlIIIIll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[8])) {
            int[] nArray = new int[lIIllllIl[1]];
            nArray[af.lIIllllIl[0]] = lIIllllIl[18];
            if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray17 = new int[lIIllllIl[1]];
                nArray17[af.lIIllllIl[0]] = lIIllllIl[18];
                Inventory.getFirst((int[])nArray17).interact(lIIllllII[lIIllllIl[38]]);
            }
        }
        int[] nArray = new int[lIIllllIl[1]];
        nArray[af.lIIllllIl[0]] = lIIllllIl[21];
        if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray18 = new int[lIIllllIl[1]];
            nArray18[af.lIIllllIl[0]] = lIIllllIl[21];
            Inventory.getFirst((int[])nArray18).interact(lIIllllII[lIIllllIl[39]]);
        }
        int[] nArray19 = new int[lIIllllIl[1]];
        nArray19[af.lIIllllIl[0]] = lIIllllIl[22];
        if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray19) ? 1 : 0)) {
            int[] nArray20 = new int[lIIllllIl[1]];
            nArray20[af.lIIllllIl[0]] = lIIllllIl[22];
            Inventory.getFirst((int[])nArray20).interact(lIIllllII[lIIllllIl[40]]);
        }
        if (af.lIIIIlIIlIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIllllIl[41])) {
            int[] nArray21 = new int[lIIllllIl[1]];
            nArray21[af.lIIllllIl[0]] = lIIllllIl[9];
            if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                int[] nArray22 = new int[lIIllllIl[1]];
                nArray22[af.lIIllllIl[0]] = lIIllllIl[9];
                if (af.lIIIIlIIIlII(Equipment.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[lIIllllIl[1]];
                    nArray23[af.lIIllllIl[0]] = lIIllllIl[9];
                    Inventory.getFirst((int[])nArray23).interact(lIIllllII[lIIllllIl[42]]);
                }
            }
            if (af.lIIIIlIIIlll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[8])) {
                int[] nArray24 = new int[lIIllllIl[1]];
                nArray24[af.lIIllllIl[0]] = lIIllllIl[10];
                if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray24) ? 1 : 0)) {
                    int[] nArray25 = new int[lIIllllIl[1]];
                    nArray25[af.lIIllllIl[0]] = lIIllllIl[10];
                    if (af.lIIIIlIIIlII(Equipment.contains((int[])nArray25) ? 1 : 0)) {
                        int[] nArray26 = new int[lIIllllIl[1]];
                        nArray26[af.lIIllllIl[0]] = lIIllllIl[10];
                        Inventory.getFirst((int[])nArray26).interact(lIIllllII[lIIllllIl[43]]);
                    }
                }
            }
            if (af.lIIIIlIIIlll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[8]) && af.lIIIIlIIIlll(Skills.getLevel((Skill)Skill.DEFENCE), lIIllllIl[36])) {
                int[] nArray27 = new int[lIIllllIl[1]];
                nArray27[af.lIIllllIl[0]] = lIIllllIl[11];
                if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                    int[] nArray28 = new int[lIIllllIl[1]];
                    nArray28[af.lIIllllIl[0]] = lIIllllIl[11];
                    if (af.lIIIIlIIIlII(Equipment.contains((int[])nArray28) ? 1 : 0)) {
                        int[] nArray29 = new int[lIIllllIl[1]];
                        nArray29[af.lIIllllIl[0]] = lIIllllIl[11];
                        Inventory.getFirst((int[])nArray29).interact(lIIllllII[lIIllllIl[44]]);
                    }
                }
            }
            if (af.lIIIIlIIIlll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[8])) {
                int[] nArray30 = new int[lIIllllIl[1]];
                nArray30[af.lIIllllIl[0]] = lIIllllIl[12];
                if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray30) ? 1 : 0)) {
                    int[] nArray31 = new int[lIIllllIl[1]];
                    nArray31[af.lIIllllIl[0]] = lIIllllIl[12];
                    Inventory.getFirst((int[])nArray31).interact(lIIllllII[lIIllllIl[45]]);
                }
            }
        }
    }

    public static void ap() {
        if (af.lIIIIlIIIIlI(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIllllII[lIIllllIl[0]];
            b.a(bv);
            if (af.lIIIIlIIIIll(bv.size(), lIIllllIl[1])) {
                System.out.println(lIIllllII[lIIllllIl[1]]);
                bt = lIIllllIl[0];
            }
        }
        if (af.lIIIIlIIIlII(bt ? 1 : 0) && af.lIIIIlIIIIll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[2])) {
            BankLocation llllllIIlIlllI;
            if (af.lIIIIlIIIlII(af.ab() ? 1 : 0)) {
                llllllIIlIlllI = BankLocation.getNearest();
                if (af.lIIIIlIIIlIl(llllllIIlIlllI) && af.lIIIIlIIIlII(llllllIIlIlllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIllllII[lIIllllIl[3]];
                    a.a(llllllIIlIlllI);
                }
                if (af.lIIIIlIIIlIl(llllllIIlIlllI) && af.lIIIIlIIIIlI(llllllIIlIlllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIllllII[lIIllllIl[4]];
                    if (af.lIIIIlIIIlII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllllIl[5]);

                        Time.sleepTicks((int)lIIllllIl[4]);

                    }
                    if (af.lIIIIlIIIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (af.lIIIIlIIIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIllllIl[6]);

                        }
                        if (af.lIIIIlIIIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIllllIl[3]);

                        }
                        if (af.lIIIIlIIIlII(af.ac() ? 1 : 0)) {
                            af.AFHelper();
                            System.out.println(lIIllllII[lIIllllIl[7]]);
                            bt = lIIllllIl[1];
                            return;
                        }
                        if (af.lIIIIlIIIlll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[8])) {
                            a.a(lIIllllIl[9], lIIllllIl[1]);
                            a.a(lIIllllIl[10], lIIllllIl[1]);
                            a.a(lIIllllIl[11], lIIllllIl[1]);
                            Bank.withdrawAll((int)lIIllllIl[12], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        }
                        if (af.lIIIIlIIIIll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[8])) {
                            a.a(lIIllllIl[13], lIIllllIl[1]);
                            a.a(lIIllllIl[14], lIIllllIl[1]);
                            a.a(lIIllllIl[15], lIIllllIl[1]);
                            Bank.withdrawAll((int)lIIllllIl[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIllllIl[1]);

                            Bank.withdrawAll((int)lIIllllIl[17], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIllllIl[1]);

                            a.a(lIIllllIl[18], lIIllllIl[1]);
                        }
                        a.a(lIIllllIl[19], lIIllllIl[1]);
                        a.a(lIIllllIl[20], lIIllllIl[1]);
                        a.a(lIIllllIl[21], lIIllllIl[1]);
                        a.a(lIIllllIl[22], lIIllllIl[1]);
                        a.a(lIIllllIl[23], lIIllllIl[1]);
                        a.a(lIIllllIl[24], lIIllllIl[25]);
                        a.a(lIIllllIl[26], lIIllllIl[25]);
                        a.a(lIIllllIl[27], Inventory.getFreeSlots());
                    }
                }
            }
            if (af.lIIIIlIIIIlI(af.ab() ? 1 : 0)) {
                af.aq();
                if (af.lIIIIlIIIIll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[28])) {
                    l.Z();
                }
                if (af.lIIIIlIIIlll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[28]) && af.lIIIIlIIIIll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[8])) {
                    llllllIIlIlllI = TileItems.getNearest(tileItem -> {
                        int n2;
                        if (af.lIIIIlIIlIIl(tileItem.getId(), lIIllllIl[17]) && af.lIIIIlIIIlll(tileItem.getQuantity(), lIIllllIl[42])) {
                            n2 = lIIllllIl[1];

                            if (((0x26 ^ 0x3B) & ~(0x7C ^ 0x61)) != 0) {
                                return false;
                            }
                        } else {
                            n2 = lIIllllIl[0];
                        }
                        return n2 != 0;
                    });
                    if (af.lIIIIlIIIlIl(llllllIIlIlllI)) {
                        llllllIIlIlllI.interact(lIIllllII[lIIllllIl[6]]);
                        Time.sleepTicks((int)lIIllllIl[7]);

                    }
                    k.X();
                }
            }
        }
    }

    @Override
    public boolean S() {
        return lIIllllIl[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
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
                                                                                                                                            if (!af.lIIIIlIIIlll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[8]) || !af.lIIIIlIIlIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIllllIl[41]) || !af.lIIIIlIIIlll(Skills.getLevel((Skill)Skill.DEFENCE), lIIllllIl[36])) break block16;
                                                                                                                                            int[] nArray = new int[lIIllllIl[1]];
                                                                                                                                            nArray[af.lIIllllIl[0]] = lIIllllIl[10];
                                                                                                                                            if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block17;
                                                                                                                                            int[] nArray2 = new int[lIIllllIl[1]];
                                                                                                                                            nArray2[af.lIIllllIl[0]] = lIIllllIl[10];
                                                                                                                                            if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray2) ? 1 : 0)) break block18;
                                                                                                                                        }
                                                                                                                                        int[] nArray = new int[lIIllllIl[1]];
                                                                                                                                        nArray[af.lIIllllIl[0]] = lIIllllIl[11];
                                                                                                                                        if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block19;
                                                                                                                                        int[] nArray3 = new int[lIIllllIl[1]];
                                                                                                                                        nArray3[af.lIIllllIl[0]] = lIIllllIl[11];
                                                                                                                                        if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray3) ? 1 : 0)) break block18;
                                                                                                                                    }
                                                                                                                                    int[] nArray = new int[lIIllllIl[1]];
                                                                                                                                    nArray[af.lIIllllIl[0]] = lIIllllIl[19];
                                                                                                                                    if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                                                                                                    int[] nArray4 = new int[lIIllllIl[1]];
                                                                                                                                    nArray4[af.lIIllllIl[0]] = lIIllllIl[19];
                                                                                                                                    if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray4) ? 1 : 0)) break block18;
                                                                                                                                }
                                                                                                                                int[] nArray = new int[lIIllllIl[1]];
                                                                                                                                nArray[af.lIIllllIl[0]] = lIIllllIl[21];
                                                                                                                                if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                                                                                                                                int[] nArray5 = new int[lIIllllIl[1]];
                                                                                                                                nArray5[af.lIIllllIl[0]] = lIIllllIl[21];
                                                                                                                                if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray5) ? 1 : 0)) break block18;
                                                                                                                            }
                                                                                                                            int[] nArray = new int[lIIllllIl[1]];
                                                                                                                            nArray[af.lIIllllIl[0]] = lIIllllIl[12];
                                                                                                                            if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                                                                            int[] nArray6 = new int[lIIllllIl[1]];
                                                                                                                            nArray6[af.lIIllllIl[0]] = lIIllllIl[12];
                                                                                                                            if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray6) ? 1 : 0)) break block18;
                                                                                                                        }
                                                                                                                        int[] nArray = new int[lIIllllIl[1]];
                                                                                                                        nArray[af.lIIllllIl[0]] = lIIllllIl[9];
                                                                                                                        if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                                                                                                        int[] nArray7 = new int[lIIllllIl[1]];
                                                                                                                        nArray7[af.lIIllllIl[0]] = lIIllllIl[9];
                                                                                                                        if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray7) ? 1 : 0)) break block18;
                                                                                                                    }
                                                                                                                    int[] nArray = new int[lIIllllIl[1]];
                                                                                                                    nArray[af.lIIllllIl[0]] = lIIllllIl[27];
                                                                                                                    if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                                                        n5 = lIIllllIl[1];

                                                                                                                        if (-3 <= 0) return n5 != 0;
                                                                                                                        return false;
                                                                                                                    }
                                                                                                                }
                                                                                                                n5 = lIIllllIl[0];
                                                                                                                return n5 != 0;
                                                                                                            }
                                                                                                            if (!af.lIIIIlIIIlll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[8]) || !af.lIIIIlIIlIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIllllIl[41]) || !af.lIIIIlIIIIll(Skills.getLevel((Skill)Skill.DEFENCE), lIIllllIl[36])) break block24;
                                                                                                            int[] nArray = new int[lIIllllIl[1]];
                                                                                                            nArray[af.lIIllllIl[0]] = lIIllllIl[10];
                                                                                                            if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
                                                                                                            int[] nArray8 = new int[lIIllllIl[1]];
                                                                                                            nArray8[af.lIIllllIl[0]] = lIIllllIl[10];
                                                                                                            if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray8) ? 1 : 0)) break block26;
                                                                                                        }
                                                                                                        int[] nArray = new int[lIIllllIl[1]];
                                                                                                        nArray[af.lIIllllIl[0]] = lIIllllIl[20];
                                                                                                        if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block27;
                                                                                                        int[] nArray9 = new int[lIIllllIl[1]];
                                                                                                        nArray9[af.lIIllllIl[0]] = lIIllllIl[20];
                                                                                                        if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray9) ? 1 : 0)) break block26;
                                                                                                    }
                                                                                                    int[] nArray = new int[lIIllllIl[1]];
                                                                                                    nArray[af.lIIllllIl[0]] = lIIllllIl[19];
                                                                                                    if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                                                                                                    int[] nArray10 = new int[lIIllllIl[1]];
                                                                                                    nArray10[af.lIIllllIl[0]] = lIIllllIl[19];
                                                                                                    if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray10) ? 1 : 0)) break block26;
                                                                                                }
                                                                                                int[] nArray = new int[lIIllllIl[1]];
                                                                                                nArray[af.lIIllllIl[0]] = lIIllllIl[21];
                                                                                                if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block29;
                                                                                                int[] nArray11 = new int[lIIllllIl[1]];
                                                                                                nArray11[af.lIIllllIl[0]] = lIIllllIl[21];
                                                                                                if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray11) ? 1 : 0)) break block26;
                                                                                            }
                                                                                            int[] nArray = new int[lIIllllIl[1]];
                                                                                            nArray[af.lIIllllIl[0]] = lIIllllIl[12];
                                                                                            if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block30;
                                                                                            int[] nArray12 = new int[lIIllllIl[1]];
                                                                                            nArray12[af.lIIllllIl[0]] = lIIllllIl[12];
                                                                                            if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray12) ? 1 : 0)) break block26;
                                                                                        }
                                                                                        int[] nArray = new int[lIIllllIl[1]];
                                                                                        nArray[af.lIIllllIl[0]] = lIIllllIl[9];
                                                                                        if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                                        int[] nArray13 = new int[lIIllllIl[1]];
                                                                                        nArray13[af.lIIllllIl[0]] = lIIllllIl[9];
                                                                                        if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray13) ? 1 : 0)) break block26;
                                                                                    }
                                                                                    int[] nArray = new int[lIIllllIl[1]];
                                                                                    nArray[af.lIIllllIl[0]] = lIIllllIl[27];
                                                                                    if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                        n4 = lIIllllIl[1];

                                                                                        if (((0x17 ^ 0x74) & ~(0xF7 ^ 0x94)) >= -1) return n4 != 0;
                                                                                        return false;
                                                                                    }
                                                                                }
                                                                                n4 = lIIllllIl[0];
                                                                                return n4 != 0;
                                                                            }
                                                                            if (!af.lIIIIlIIIlll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[28]) || !af.lIIIIlIIIIll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[8])) break block32;
                                                                            int[] nArray = new int[lIIllllIl[1]];
                                                                            nArray[af.lIIllllIl[0]] = lIIllllIl[18];
                                                                            if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                            int[] nArray14 = new int[lIIllllIl[1]];
                                                                            nArray14[af.lIIllllIl[0]] = lIIllllIl[18];
                                                                            if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray14) ? 1 : 0)) break block34;
                                                                        }
                                                                        int[] nArray = new int[lIIllllIl[1]];
                                                                        nArray[af.lIIllllIl[0]] = lIIllllIl[20];
                                                                        if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block35;
                                                                        int[] nArray15 = new int[lIIllllIl[1]];
                                                                        nArray15[af.lIIllllIl[0]] = lIIllllIl[20];
                                                                        if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray15) ? 1 : 0)) break block34;
                                                                    }
                                                                    int[] nArray = new int[lIIllllIl[1]];
                                                                    nArray[af.lIIllllIl[0]] = lIIllllIl[19];
                                                                    if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block36;
                                                                    int[] nArray16 = new int[lIIllllIl[1]];
                                                                    nArray16[af.lIIllllIl[0]] = lIIllllIl[19];
                                                                    if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray16) ? 1 : 0)) break block34;
                                                                }
                                                                int[] nArray = new int[lIIllllIl[1]];
                                                                nArray[af.lIIllllIl[0]] = lIIllllIl[21];
                                                                if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block37;
                                                                int[] nArray17 = new int[lIIllllIl[1]];
                                                                nArray17[af.lIIllllIl[0]] = lIIllllIl[21];
                                                                if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray17) ? 1 : 0)) break block34;
                                                            }
                                                            int[] nArray = new int[lIIllllIl[1]];
                                                            nArray[af.lIIllllIl[0]] = lIIllllIl[17];
                                                            if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block38;
                                                            int[] nArray18 = new int[lIIllllIl[1]];
                                                            nArray18[af.lIIllllIl[0]] = lIIllllIl[17];
                                                            if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray18) ? 1 : 0)) break block34;
                                                        }
                                                        int[] nArray = new int[lIIllllIl[1]];
                                                        nArray[af.lIIllllIl[0]] = lIIllllIl[27];
                                                        if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                            n3 = lIIllllIl[1];

                                                            if (null == null) return n3 != 0;
                                                            return ((0x4D ^ 0x49 ^ (0x6C ^ 0x4A)) & (0xDC ^ 0x93 ^ (0x77 ^ 0x1A) ^ -1)) != 0;
                                                        }
                                                    }
                                                    n3 = lIIllllIl[0];
                                                    return n3 != 0;
                                                }
                                                int[] nArray = new int[lIIllllIl[1]];
                                                nArray[af.lIIllllIl[0]] = lIIllllIl[18];
                                                if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block39;
                                                int[] nArray19 = new int[lIIllllIl[1]];
                                                nArray19[af.lIIllllIl[0]] = lIIllllIl[18];
                                                if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray19) ? 1 : 0)) break block40;
                                            }
                                            int[] nArray = new int[lIIllllIl[1]];
                                            nArray[af.lIIllllIl[0]] = lIIllllIl[20];
                                            if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block41;
                                            int[] nArray20 = new int[lIIllllIl[1]];
                                            nArray20[af.lIIllllIl[0]] = lIIllllIl[20];
                                            if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray20) ? 1 : 0)) break block40;
                                        }
                                        int[] nArray = new int[lIIllllIl[1]];
                                        nArray[af.lIIllllIl[0]] = lIIllllIl[19];
                                        if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block42;
                                        int[] nArray21 = new int[lIIllllIl[1]];
                                        nArray21[af.lIIllllIl[0]] = lIIllllIl[19];
                                        if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray21) ? 1 : 0)) break block40;
                                    }
                                    int[] nArray = new int[lIIllllIl[1]];
                                    nArray[af.lIIllllIl[0]] = lIIllllIl[21];
                                    if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block43;
                                    int[] nArray22 = new int[lIIllllIl[1]];
                                    nArray22[af.lIIllllIl[0]] = lIIllllIl[21];
                                    if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray22) ? 1 : 0)) break block40;
                                }
                                int[] nArray = new int[lIIllllIl[1]];
                                nArray[af.lIIllllIl[0]] = lIIllllIl[16];
                                if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block44;
                                int[] nArray23 = new int[lIIllllIl[1]];
                                nArray23[af.lIIllllIl[0]] = lIIllllIl[16];
                                if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray23) ? 1 : 0)) break block40;
                            }
                            int[] nArray = new int[lIIllllIl[1]];
                            nArray[af.lIIllllIl[0]] = lIIllllIl[13];
                            if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                            int[] nArray24 = new int[lIIllllIl[1]];
                            nArray24[af.lIIllllIl[0]] = lIIllllIl[13];
                            if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray24) ? 1 : 0)) break block40;
                        }
                        int[] nArray = new int[lIIllllIl[1]];
                        nArray[af.lIIllllIl[0]] = lIIllllIl[14];
                        if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block46;
                        int[] nArray25 = new int[lIIllllIl[1]];
                        nArray25[af.lIIllllIl[0]] = lIIllllIl[14];
                        if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray25) ? 1 : 0)) break block40;
                    }
                    int[] nArray = new int[lIIllllIl[1]];
                    nArray[af.lIIllllIl[0]] = lIIllllIl[15];
                    if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block47;
                    int[] nArray26 = new int[lIIllllIl[1]];
                    nArray26[af.lIIllllIl[0]] = lIIllllIl[15];
                    if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray26) ? 1 : 0)) break block40;
                }
                int[] nArray = new int[lIIllllIl[1]];
                nArray[af.lIIllllIl[0]] = lIIllllIl[17];
                if (!af.lIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block48;
                int[] nArray27 = new int[lIIllllIl[1]];
                nArray27[af.lIIllllIl[0]] = lIIllllIl[17];
                if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray27) ? 1 : 0)) break block40;
            }
            int[] nArray = new int[lIIllllIl[1]];
            nArray[af.lIIllllIl[0]] = lIIllllIl[27];
            if (af.lIIIIlIIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIIllllIl[1];

                if (((0x52 ^ 0x4A) & ~(0x32 ^ 0x2A)) <= (0x74 ^ 0x70)) return n2 != 0;
                return false;
            }
        }
        n2 = lIIllllIl[0];
        return n2 != 0;
    }

    private static boolean lIIIIlIIIllI(int n2) {
        return n2 > 0;
    }

        return String.valueOf(llllllIIIIllII);
    }

    private static boolean lIIIIlIIIIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public int T() {
        try {
            af.ap();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 < 1) {
            return (0xDB ^ 0x87) & ~(0x5C ^ 0);
        }
        return lIIllllIl[54];
    }

    @Override
    public boolean V() {
        boolean bl;
        if (af.lIIIIlIIIlll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[2])) {
            bl = lIIllllIl[1];

            }
        } else {
            bl = lIIllllIl[0];
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        block20: {
            block21: {
                if (af.lIIIIlIIIlll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[8]) && af.lIIIIlIIlIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIllllIl[41]) && af.lIIIIlIIIlll(Skills.getLevel((Skill)Skill.DEFENCE), lIIllllIl[36])) {
                    int n3;
                    int[] nArray = new int[lIIllllIl[1]];
                    nArray[af.lIIllllIl[0]] = lIIllllIl[10];
                    if (af.lIIIIlIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIllllIl[1]];
                        nArray2[af.lIIllllIl[0]] = lIIllllIl[11];
                        if (af.lIIIIlIIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIIllllIl[1]];
                            nArray3[af.lIIllllIl[0]] = lIIllllIl[19];
                            if (af.lIIIIlIIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIllllIl[1]];
                                nArray4[af.lIIllllIl[0]] = lIIllllIl[21];
                                if (af.lIIIIlIIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    int[] nArray5 = new int[lIIllllIl[1]];
                                    nArray5[af.lIIllllIl[0]] = lIIllllIl[12];
                                    if (af.lIIIIlIIIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                        int[] nArray6 = new int[lIIllllIl[1]];
                                        nArray6[af.lIIllllIl[0]] = lIIllllIl[9];
                                        if (af.lIIIIlIIIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                            int[] nArray7 = new int[lIIllllIl[1]];
                                            nArray7[af.lIIllllIl[0]] = lIIllllIl[27];
                                            if (af.lIIIIlIIIIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                n3 = lIIllllIl[1];

                                                if (null == null) return n3 != 0;
                                                return ((0xC7 ^ 0x8B ^ (0xD1 ^ 0xB4)) & (0xEA ^ 0x88 ^ (0x48 ^ 3) ^ -1)) != 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n3 = lIIllllIl[0];
                    return n3 != 0;
                }
                if (af.lIIIIlIIIlll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[28]) && af.lIIIIlIIIIll(Skills.getLevel((Skill)Skill.RANGED), lIIllllIl[8])) {
                    int n4;
                    int[] nArray = new int[lIIllllIl[1]];
                    nArray[af.lIIllllIl[0]] = lIIllllIl[18];
                    if (af.lIIIIlIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[lIIllllIl[1]];
                        nArray8[af.lIIllllIl[0]] = lIIllllIl[20];
                        if (af.lIIIIlIIIIlI(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[lIIllllIl[1]];
                            nArray9[af.lIIllllIl[0]] = lIIllllIl[19];
                            if (af.lIIIIlIIIIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIllllIl[1]];
                                nArray10[af.lIIllllIl[0]] = lIIllllIl[21];
                                if (af.lIIIIlIIIIlI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                    int[] nArray11 = new int[lIIllllIl[1]];
                                    nArray11[af.lIIllllIl[0]] = lIIllllIl[17];
                                    if (af.lIIIIlIIIIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                        int[] nArray12 = new int[lIIllllIl[1]];
                                        nArray12[af.lIIllllIl[0]] = lIIllllIl[27];
                                        if (af.lIIIIlIIIIlI(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                            n4 = lIIllllIl[1];

                                            if (3 >= 0) return n4 != 0;
                                            return ((0x60 ^ 0x33 ^ (0xA5 ^ 0xC0)) & (0xB3 ^ 0x81 ^ (0x91 ^ 0x95) ^ -1)) != 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n4 = lIIllllIl[0];
                    return n4 != 0;
                }
                int[] nArray = new int[lIIllllIl[1]];
                nArray[af.lIIllllIl[0]] = lIIllllIl[18];
                if (!af.lIIIIlIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                int[] nArray13 = new int[lIIllllIl[1]];
                nArray13[af.lIIllllIl[0]] = lIIllllIl[20];
                if (!af.lIIIIlIIIIlI(Bank.contains((int[])nArray13) ? 1 : 0)) break block20;
                int[] nArray14 = new int[lIIllllIl[1]];
                nArray14[af.lIIllllIl[0]] = lIIllllIl[19];
                if (!af.lIIIIlIIIIlI(Bank.contains((int[])nArray14) ? 1 : 0)) break block20;
                int[] nArray15 = new int[lIIllllIl[1]];
                nArray15[af.lIIllllIl[0]] = lIIllllIl[21];
                if (!af.lIIIIlIIIIlI(Bank.contains((int[])nArray15) ? 1 : 0)) break block20;
                int[] nArray16 = new int[lIIllllIl[1]];
                nArray16[af.lIIllllIl[0]] = lIIllllIl[13];
                if (!af.lIIIIlIIIIlI(Bank.contains((int[])nArray16) ? 1 : 0)) break block20;
                int[] nArray17 = new int[lIIllllIl[1]];
                nArray17[af.lIIllllIl[0]] = lIIllllIl[24];
                if (!af.lIIIIlIIIIlI(Bank.contains((int[])nArray17) ? 1 : 0)) break block20;
                int[] nArray18 = new int[lIIllllIl[1]];
                nArray18[af.lIIllllIl[0]] = lIIllllIl[14];
                if (!af.lIIIIlIIIIlI(Bank.contains((int[])nArray18) ? 1 : 0)) break block20;
                int[] nArray19 = new int[lIIllllIl[1]];
                nArray19[af.lIIllllIl[0]] = lIIllllIl[15];
                if (!af.lIIIIlIIIIlI(Bank.contains((int[])nArray19) ? 1 : 0)) break block20;
                int[] nArray20 = new int[lIIllllIl[1]];
                nArray20[af.lIIllllIl[0]] = lIIllllIl[16];
                if (!af.lIIIIlIIIlII(Bank.contains((int[])nArray20) ? 1 : 0)) break block21;
                int[] nArray21 = new int[lIIllllIl[1]];
                nArray21[af.lIIllllIl[0]] = lIIllllIl[16];
                if (!af.lIIIIlIIIIlI(Equipment.contains((int[])nArray21) ? 1 : 0)) break block20;
            }
            int[] nArray = new int[lIIllllIl[1]];
            nArray[af.lIIllllIl[0]] = lIIllllIl[17];
            if (af.lIIIIlIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray22 = new int[lIIllllIl[1]];
                nArray22[af.lIIllllIl[0]] = lIIllllIl[27];
                if (af.lIIIIlIIIIlI(Bank.contains((int[])nArray22) ? 1 : 0)) {
                    n2 = lIIllllIl[1];

                    if (null == null) return n2 != 0;
                    return ((0x49 ^ 0x3F ^ (0x7F ^ 0x4B)) & (0xE7 ^ 0x84 ^ (0x21 ^ 0) ^ -1)) != 0;
                }
            }
        }
        n2 = lIIllllIl[0];
        return n2 != 0;
    }
}

