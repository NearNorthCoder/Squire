/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.HHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class AHHelper
implements ab {
    public static  List<d> bx;
    public static  boolean ck;
    static  WorldArea cl;
    
    static  WorldPoint cm;
    static  WorldPoint cn;
    public static  boolean bv;

    private static boolean llIIIlllIIII(Object object) {
        return object != null;
    }

    private static boolean llIIIllIllll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIllllIII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ao() {
        int n2;
        block29: {
            block28: {
                block25: {
                    int n3;
                    block27: {
                        block26: {
                            block22: {
                                int n4;
                                block23: {
                                    block24: {
                                        block19: {
                                            int n5;
                                            block20: {
                                                block21: {
                                                    if (!ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[20])) break block19;
                                                    int[] nArray = new int[lllIlIlIl[1]];
                                                    nArray[ah.lllIlIlIl[0]] = lllIlIlIl[8];
                                                    if (!ah.llIIIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lllIlIlIl[1]];
                                                    nArray2[ah.lllIlIlIl[0]] = lllIlIlIl[12];
                                                    if (!ah.llIIIllIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lllIlIlIl[1]];
                                                    nArray3[ah.lllIlIlIl[0]] = lllIlIlIl[10];
                                                    if (!ah.llIIIllIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lllIlIlIl[1]];
                                                    nArray4[ah.lllIlIlIl[0]] = lllIlIlIl[13];
                                                    if (!ah.llIIIllIllIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lllIlIlIl[1]];
                                                    nArray5[ah.lllIlIlIl[0]] = lllIlIlIl[19];
                                                    if (!ah.llIIIllIllIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lllIlIlIl[1]];
                                                    nArray6[ah.lllIlIlIl[0]] = lllIlIlIl[47];
                                                    if (!ah.llIIIllIllll(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lllIlIlIl[1]];
                                                    nArray7[ah.lllIlIlIl[0]] = lllIlIlIl[47];
                                                    if (!ah.llIIIllIllIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lllIlIlIl[1];

                                                if (-2 < 0) return n5 != 0;
                                                return ((0x13 ^ 0x6E ^ (0xE2 ^ 0xAC)) & (0x1D ^ 0x33 ^ (0x94 ^ 0x89) ^ -1)) != 0;
                                            }
                                            n5 = lllIlIlIl[0];
                                            return n5 != 0;
                                        }
                                        if (!ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[20]) || !ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7])) break block22;
                                        int[] nArray = new int[lllIlIlIl[1]];
                                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[12];
                                        if (!ah.llIIIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lllIlIlIl[1]];
                                        nArray8[ah.lllIlIlIl[0]] = lllIlIlIl[10];
                                        if (!ah.llIIIllIllIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lllIlIlIl[1]];
                                        nArray9[ah.lllIlIlIl[0]] = lllIlIlIl[13];
                                        if (!ah.llIIIllIllIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lllIlIlIl[1]];
                                        nArray10[ah.lllIlIlIl[0]] = lllIlIlIl[15];
                                        if (!ah.llIIIllIllIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lllIlIlIl[1]];
                                        nArray11[ah.lllIlIlIl[0]] = lllIlIlIl[47];
                                        if (!ah.llIIIllIllll(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lllIlIlIl[1]];
                                        nArray12[ah.lllIlIlIl[0]] = lllIlIlIl[47];
                                        if (!ah.llIIIllIllIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lllIlIlIl[1];

                                    if ((0x86 ^ 0xB9 ^ (0x6E ^ 0x54)) != 0) return n4 != 0;
                                    return false;
                                }
                                n4 = lllIlIlIl[0];
                                return n4 != 0;
                            }
                            if (!ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7]) || !ah.llIIIllIllll(ck ? 1 : 0)) break block25;
                            int[] nArray = new int[lllIlIlIl[1]];
                            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                            if (!ah.llIIIllIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lllIlIlIl[1]];
                            nArray13[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                            if (!ah.llIIIllIllIl(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lllIlIlIl[1]];
                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[23];
                        if (ah.llIIIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lllIlIlIl[1]];
                            nArray14[ah.lllIlIlIl[0]] = lllIlIlIl[24];
                            if (ah.llIIIllIllIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lllIlIlIl[1];

                                if (((0xFF ^ 0x9E) & ~(0xDF ^ 0xBE)) == ((0x86 ^ 0xBF) & ~(0x4D ^ 0x74))) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = lllIlIlIl[0];
                    return n3 != 0;
                }
                if (!ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7]) || !ah.llIIIllIllIl(ck ? 1 : 0)) return lllIlIlIl[0];
                int[] nArray = new int[lllIlIlIl[1]];
                nArray[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                if (!ah.llIIIllIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lllIlIlIl[1]];
                nArray15[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                if (!ah.llIIIllIllIl(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lllIlIlIl[1]];
            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[15];
            if (ah.llIIIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lllIlIlIl[1]];
                nArray16[ah.lllIlIlIl[0]] = lllIlIlIl[22];
                if (ah.llIIIllIllIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lllIlIlIl[1]];
                    nArray17[ah.lllIlIlIl[0]] = lllIlIlIl[22];
                    if (ah.llIIIlllIIlI(Bank.getFirst((int[])nArray17).getQuantity(), lllIlIlIl[18])) {
                        int[] nArray18 = new int[lllIlIlIl[1]];
                        nArray18[ah.lllIlIlIl[0]] = lllIlIlIl[23];
                        if (ah.llIIIllIllIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lllIlIlIl[1]];
                            nArray19[ah.lllIlIlIl[0]] = lllIlIlIl[24];
                            if (ah.llIIIllIllIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lllIlIlIl[1];

                                if (3 <= 3) return n2 != 0;
                                return ((0x71 ^ 0x3F ^ (0x28 ^ 0x58)) & (6 + 63 - 34 + 214 ^ 96 + 85 - -18 + 0 ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lllIlIlIl[0];
        return n2 != 0;
    }

    @Override
    public boolean ae() {
        return lllIlIlIl[0];
    }

        return String.valueOf(llIlllIlIIlll);
    }

    @Override
    public String ag() {
        return lllIlIlII[lllIlIlIl[73]];
    }

    private static int llIIIlllIlIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIIIlllIlII(Object object) {
        return object == null;
    }

    private static boolean llIIIllIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void Q() {
        d llIllllIllIII;
        Object llIllllIllIIl;
        if (ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7])) {
            int[] nArray = new int[lllIlIlIl[1]];
            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[15];
            if (ah.llIIIllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new DHelper(lllIlIlIl[15], lllIlIlIl[58], lllIlIlIl[59]);
                bx.add(d2);

            }
            int[] nArray2 = new int[lllIlIlIl[1]];
            nArray2[ah.lllIlIlIl[0]] = lllIlIlIl[8];
            if (ah.llIIIllIllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                llIllllIllIIl = new DHelper(lllIlIlIl[8], lllIlIlIl[60], lllIlIlIl[5]);
                bx.add((DHelper) lIllllIllIIl);

            }
            int[] nArray3 = new int[lllIlIlIl[1]];
            nArray3[ah.lllIlIlIl[0]] = lllIlIlIl[10];
            if (ah.llIIIllIllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                llIllllIllIIl = new DHelper(lllIlIlIl[10], lllIlIlIl[61], lllIlIlIl[5]);
                bx.add((DHelper) lIllllIllIIl);

            }
            int[] nArray4 = new int[lllIlIlIl[1]];
            nArray4[ah.lllIlIlIl[0]] = lllIlIlIl[12];
            if (ah.llIIIllIllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                llIllllIllIIl = new DHelper(lllIlIlIl[12], lllIlIlIl[62], lllIlIlIl[5]);
                bx.add((DHelper) lIllllIllIIl);

            }
            int[] nArray5 = new int[lllIlIlIl[1]];
            nArray5[ah.lllIlIlIl[0]] = lllIlIlIl[13];
            if (ah.llIIIllIllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                llIllllIllIIl = new DHelper(lllIlIlIl[13], lllIlIlIl[4], lllIlIlIl[5]);
                bx.add((DHelper) lIllllIllIIl);

            }
            int[] nArray6 = new int[lllIlIlIl[1]];
            nArray6[ah.lllIlIlIl[0]] = lllIlIlIl[47];
            if (ah.llIIIllIllll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                llIllllIllIIl = new DHelper(lllIlIlIl[47], lllIlIlIl[1], e.c(lllIlIlIl[63], lllIlIlIl[64]));
                bx.add((DHelper) lIllllIllIIl);

            }
        }
        if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7])) {
            int[] nArray = new int[lllIlIlIl[1]];
            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[23];
            if (ah.llIIIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lllIlIlIl[1]];
                nArray7[ah.lllIlIlIl[0]] = lllIlIlIl[23];
                if (ah.llIIIllIlllI(Bank.getFirst((int[])nArray7).getQuantity(), lllIlIlIl[62])) {
                    int[] nArray8 = new int[lllIlIlIl[1]];
                    nArray8[ah.lllIlIlIl[0]] = lllIlIlIl[23];
                    llIllllIllIIl = new DHelper(lllIlIlIl[23], lllIlIlIl[62] - Bank.getFirst((int[])nArray8).getQuantity(), lllIlIlIl[65]);
                    bx.add((DHelper) lIllllIllIIl);

                }
            }
            int[] nArray9 = new int[lllIlIlIl[1]];
            nArray9[ah.lllIlIlIl[0]] = lllIlIlIl[23];
            if (ah.llIIIllIllll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                llIllllIllIIl = new DHelper(lllIlIlIl[23], lllIlIlIl[62], lllIlIlIl[65]);
                bx.add((DHelper) lIllllIllIIl);

            }
            int[] nArray10 = new int[lllIlIlIl[1]];
            nArray10[ah.lllIlIlIl[0]] = lllIlIlIl[24];
            if (ah.llIIIllIllIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lllIlIlIl[1]];
                nArray11[ah.lllIlIlIl[0]] = lllIlIlIl[24];
                if (ah.llIIIllIlllI(Bank.getFirst((int[])nArray11).getQuantity(), lllIlIlIl[62])) {
                    int[] nArray12 = new int[lllIlIlIl[1]];
                    nArray12[ah.lllIlIlIl[0]] = lllIlIlIl[24];
                    llIllllIllIIl = new DHelper(lllIlIlIl[24], lllIlIlIl[62] - Bank.getFirst((int[])nArray12).getQuantity(), lllIlIlIl[66]);
                    bx.add((DHelper) lIllllIllIIl);

                }
            }
            int[] nArray13 = new int[lllIlIlIl[1]];
            nArray13[ah.lllIlIlIl[0]] = lllIlIlIl[24];
            if (ah.llIIIllIllll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                llIllllIllIIl = new DHelper(lllIlIlIl[24], lllIlIlIl[62], lllIlIlIl[66]);
                bx.add((DHelper) lIllllIllIIl);

            }
            int[] nArray14 = new int[lllIlIlIl[1]];
            nArray14[ah.lllIlIlIl[0]] = lllIlIlIl[21];
            if (ah.llIIIllIllll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lllIlIlIl[1]];
                nArray15[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                if (ah.llIIIllIllll(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    llIllllIllIIl = new DHelper(lllIlIlIl[21], lllIlIlIl[1], lllIlIlIl[67]);
                    bx.add((DHelper) lIllllIllIIl);

                }
            }
            if (ah.llIIIllIllIl(ck ? 1 : 0)) {
                int[] nArray16 = new int[lllIlIlIl[1]];
                nArray16[ah.lllIlIlIl[0]] = lllIlIlIl[15];
                if (ah.llIIIllIllIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lllIlIlIl[1]];
                    nArray17[ah.lllIlIlIl[0]] = lllIlIlIl[15];
                    if (ah.llIIIllIlllI(Bank.getFirst((int[])nArray17).getQuantity(), lllIlIlIl[62])) {
                        int[] nArray18 = new int[lllIlIlIl[1]];
                        nArray18[ah.lllIlIlIl[0]] = lllIlIlIl[15];
                        llIllllIllIIl = new DHelper(lllIlIlIl[15], lllIlIlIl[62] - Bank.getFirst((int[])nArray18).getQuantity(), lllIlIlIl[59]);
                        bx.add((DHelper) lIllllIllIIl);

                    }
                }
                int[] nArray19 = new int[lllIlIlIl[1]];
                nArray19[ah.lllIlIlIl[0]] = lllIlIlIl[15];
                if (ah.llIIIllIllll(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    llIllllIllIIl = new DHelper(lllIlIlIl[15], lllIlIlIl[62], lllIlIlIl[59]);
                    bx.add((DHelper) lIllllIllIIl);

                }
                int[] nArray20 = new int[lllIlIlIl[1]];
                nArray20[ah.lllIlIlIl[0]] = lllIlIlIl[22];
                if (ah.llIIIllIllIl(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lllIlIlIl[1]];
                    nArray21[ah.lllIlIlIl[0]] = lllIlIlIl[22];
                    if (ah.llIIIllIlllI(Bank.getFirst((int[])nArray21).getQuantity(), lllIlIlIl[67])) {
                        int[] nArray22 = new int[lllIlIlIl[1]];
                        nArray22[ah.lllIlIlIl[0]] = lllIlIlIl[22];
                        llIllllIllIIl = new DHelper(lllIlIlIl[22], lllIlIlIl[67] - Bank.getFirst((int[])nArray22).getQuantity(), lllIlIlIl[5]);
                        bx.add((DHelper) lIllllIllIIl);

                    }
                }
                int[] nArray23 = new int[lllIlIlIl[1]];
                nArray23[ah.lllIlIlIl[0]] = lllIlIlIl[22];
                if (ah.llIIIllIllll(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    llIllllIllIIl = new DHelper(lllIlIlIl[22], lllIlIlIl[67], lllIlIlIl[5]);
                    bx.add((DHelper) lIllllIllIIl);

                }
            }
        }
        int[] nArray = new int[lllIlIlIl[1]];
        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[19];
        if (ah.llIIIllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            llIllllIllIIl = new DHelper(lllIlIlIl[19], lllIlIlIl[68], lllIlIlIl[39]);
            bx.add((DHelper) lIllllIllIIl);

        }
        if (ah.llIIIllIllll(Bank.contains(llIllllIllIIl = item -> item.getName().toLowerCase().contains(lllIlIlII[lllIlIlIl[75]])) ? 1 : 0)) {
            llIllllIllIII = new DHelper(lllIlIlIl[69], lllIlIlIl[18], lllIlIlIl[70]);
            bx.add(llIllllIllIII);

        }
        int[] nArray24 = new int[lllIlIlIl[1]];
        nArray24[ah.lllIlIlIl[0]] = lllIlIlIl[71];
        if (ah.llIIIllIllll(Bank.contains((int[])nArray24) ? 1 : 0)) {
            llIllllIllIII = new DHelper(lllIlIlIl[71], lllIlIlIl[32], lllIlIlIl[72]);
            bx.add(llIllllIllIII);

        }
        int[] nArray25 = new int[lllIlIlIl[1]];
        nArray25[ah.lllIlIlIl[0]] = lllIlIlIl[17];
        if (ah.llIIIllIllll(Bank.contains((int[])nArray25) ? 1 : 0)) {
            llIllllIllIII = new DHelper(lllIlIlIl[17], lllIlIlIl[32], lllIlIlIl[72]);
            bx.add(llIllllIllIII);

        }
    }

    @Override
    public int af() {
        try {
            ah.ak();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lllIlIlIl[68];
    }

    private static boolean llIIIlllIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIlllIllI(int n2) {
        return n2 < 0;
    }

    public static void al() {
        if (ah.llIIIllIllIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (ah.llIIIllIllll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIlIlII[lllIlIlIl[42]];
            Movement.walkTo((WorldPoint)cm);

            Time.sleepTicks((int)lllIlIlIl[1]);

        }
        if (ah.llIIIllIllIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIlIlII[lllIlIlIl[43]];
            ah.am();
        }
    }

    @Override
    public boolean AHHelper() {
        boolean bl;
        if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[74])) {
            bl = lllIlIlIl[1];

            if ((0x6E ^ 0x6B) <= 0) {
                return false;
            }
        } else {
            bl = lllIlIlIl[0];
        }
        return bl;
    }

    public static void ak() {
        if (ah.llIIIllIllIl(bv ? 1 : 0)) {
            AccBuilderGWD.c = lllIlIlII[lllIlIlIl[0]];
            b.a(bx);
            if (ah.llIIIllIlllI(bx.size(), lllIlIlIl[1])) {
                System.out.println(lllIlIlII[lllIlIlIl[1]]);
                bv = lllIlIlIl[0];
            }
        }
        if (ah.llIIIllIllll(bv ? 1 : 0)) {
            BankLocation llIlllllIIIlI;
            if (ah.llIIIllIllll(ah.an() ? 1 : 0)) {
                llIlllllIIIlI = BankLocation.getNearest();
                if (ah.llIIIlllIIII(llIlllllIIIlI) && ah.llIIIllIllll(llIlllllIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[2]];
                    a.a(llIlllllIIIlI);
                }
                if (ah.llIIIlllIIII(llIlllllIIIlI) && ah.llIIIllIllIl(llIlllllIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[3]];
                    if (ah.llIIIllIllll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIlIl[4]);

                        Time.sleepTicks((int)lllIlIlIl[5]);

                    }
                    if (ah.llIIIllIllIl(Bank.isOpen() ? 1 : 0)) {
                        if (ah.llIIIlllIIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lllIlIlIl[6]);

                        }
                        while (ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7]) && ah.llIIIllIllll(H.bT() ? 1 : 0)) {
                            H.bR();
                            Time.sleepTicks((int)lllIlIlIl[1]);

                            if (((0x23 ^ 0x30) & ~(0x4B ^ 0x58)) < 1) continue;
                            return;
                        }
                        if (ah.llIIIllIllll(ah.ao() ? 1 : 0)) {
                            ah.Q();
                            System.out.println(lllIlIlII[lllIlIlIl[6]]);
                            bv = lllIlIlIl[1];
                            return;
                        }
                        if (ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7])) {
                            int[] nArray = new int[lllIlIlIl[1]];
                            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[8];
                            if (ah.llIIIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lllIlIlIl[1]];
                                nArray2[ah.lllIlIlIl[0]] = lllIlIlIl[8];
                                if (ah.llIIIllIlllI(Inventory.getCount((int[])nArray2), lllIlIlIl[1])) {
                                    Bank.withdraw((int)lllIlIlIl[8], (int)lllIlIlIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIlIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIlIl[1]];
                                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[8];
                                        if (ah.llIIIlllIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIlIl[1];

                                            if (-(9 ^ 0x7C ^ (0xDA ^ 0xAB)) > 0) {
                                                return ((63 + 27 - -27 + 89 ^ 95 + 152 - 200 + 109) & ((0xA6 ^ 0xB6) & ~(0x5F ^ 0x4F) ^ (0xD1 ^ 0x83) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lllIlIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIlIl[4]);

                                }
                            }
                            int[] nArray3 = new int[lllIlIlIl[1]];
                            nArray3[ah.lllIlIlIl[0]] = lllIlIlIl[10];
                            if (ah.llIIIllIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lllIlIlIl[1]];
                                nArray4[ah.lllIlIlIl[0]] = lllIlIlIl[10];
                                if (ah.llIIIllIlllI(Inventory.getCount((int[])nArray4), lllIlIlIl[1])) {
                                    Bank.withdraw((int)lllIlIlIl[10], (int)lllIlIlIl[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIlIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIlIl[1]];
                                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[10];
                                        if (ah.llIIIlllIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIlIl[1];

                                            }
                                        } else {
                                            bl = lllIlIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIlIl[4]);

                                }
                            }
                            int[] nArray5 = new int[lllIlIlIl[1]];
                            nArray5[ah.lllIlIlIl[0]] = lllIlIlIl[12];
                            if (ah.llIIIllIllIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lllIlIlIl[1]];
                                nArray6[ah.lllIlIlIl[0]] = lllIlIlIl[12];
                                if (ah.llIIIllIlllI(Inventory.getCount((int[])nArray6), lllIlIlIl[1])) {
                                    Bank.withdraw((int)lllIlIlIl[12], (int)lllIlIlIl[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIlIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIlIl[1]];
                                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[12];
                                        if (ah.llIIIlllIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIlIl[1];

                                            if (1 <= -1) {
                                                return ((0xBB ^ 0xAF ^ (0xD1 ^ 0x89)) & (0x48 ^ 0x54 ^ (0x91 ^ 0xC1) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lllIlIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIlIl[4]);

                                }
                            }
                            int[] nArray7 = new int[lllIlIlIl[1]];
                            nArray7[ah.lllIlIlIl[0]] = lllIlIlIl[13];
                            if (ah.llIIIllIllIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lllIlIlIl[1]];
                                nArray8[ah.lllIlIlIl[0]] = lllIlIlIl[13];
                                if (ah.llIIIllIlllI(Inventory.getCount((int[])nArray8), lllIlIlIl[1])) {
                                    Bank.withdraw((int)lllIlIlIl[13], (int)lllIlIlIl[14], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIlIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIlIl[1]];
                                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[13];
                                        if (ah.llIIIlllIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIlIl[1];

                                            }
                                        } else {
                                            bl = lllIlIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIlIl[4]);

                                }
                            }
                            int[] nArray9 = new int[lllIlIlIl[1]];
                            nArray9[ah.lllIlIlIl[0]] = lllIlIlIl[15];
                            if (ah.llIIIllIllIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lllIlIlIl[1]];
                                nArray10[ah.lllIlIlIl[0]] = lllIlIlIl[15];
                                if (ah.llIIIllIlllI(Inventory.getCount((int[])nArray10), lllIlIlIl[1])) {
                                    Bank.withdraw((int)lllIlIlIl[15], (int)lllIlIlIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIlIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIlIl[1]];
                                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[15];
                                        if (ah.llIIIlllIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIlIl[1];

                                        } else {
                                            bl = lllIlIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIlIl[4]);

                                }
                            }
                            int[] nArray11 = new int[lllIlIlIl[1]];
                            nArray11[ah.lllIlIlIl[0]] = lllIlIlIl[16];
                            if (ah.llIIIllIllIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lllIlIlIl[1]];
                                nArray12[ah.lllIlIlIl[0]] = lllIlIlIl[16];
                                if (ah.llIIIllIllll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lllIlIlIl[16], (int)lllIlIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIlIl[1]);

                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lllIlIlIl[1]];
                                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[16];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lllIlIlIl[4]);

                                }
                            }
                            Bank.withdraw((int)lllIlIlIl[17], (int)lllIlIlIl[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lllIlIlIl[1]];
                            nArray13[ah.lllIlIlIl[0]] = lllIlIlIl[19];
                            if (ah.llIIIllIllIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lllIlIlIl[1]];
                                nArray14[ah.lllIlIlIl[0]] = lllIlIlIl[19];
                                if (ah.llIIIllIlllI(Inventory.getCount((int[])nArray14), lllIlIlIl[1]) && ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[20])) {
                                    Bank.withdrawAll((int)lllIlIlIl[19], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIlIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIlIl[1]];
                                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[19];
                                        if (ah.llIIIlllIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIlIl[1];

                                            if (-(0x36 ^ 0x32 ^ (0x3F ^ 0x28) & ~(0xAA ^ 0xBD)) >= 0) {
                                                return ((97 + 243 - 215 + 119 ^ 62 + 145 - 86 + 40) & (0x6E ^ 0x22 ^ (0x19 ^ 0) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lllIlIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIlIl[4]);

                                }
                            }
                        }
                        if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7])) {
                            int[] nArray = new int[lllIlIlIl[1]];
                            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                            if (ah.llIIIllIllll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lllIlIlIl[21], (int)lllIlIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lllIlIlIl[1]);

                            }
                            if (ah.llIIIllIllIl(ck ? 1 : 0)) {
                                Bank.withdrawAll((int)lllIlIlIl[22], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lllIlIlIl[1]);

                                Bank.withdrawAll((int)lllIlIlIl[15], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lllIlIlIl[1]);

                            }
                            Time.sleepTicks((int)lllIlIlIl[3]);

                            Bank.withdrawAll((int)lllIlIlIl[23], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lllIlIlIl[1]);

                            Bank.withdrawAll((int)lllIlIlIl[24], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lllIlIlIl[1]);

                        }
                    }
                }
            }
            if (ah.llIIIllIllIl(ah.an() ? 1 : 0)) {
                if (ah.llIIIllIllIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[20])) {
                    if (ah.llIIIllIllll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lllIlIlII[lllIlIlIl[18]];
                        Movement.walkTo((WorldPoint)cm);

                        Time.sleepTicks((int)lllIlIlIl[1]);

                    }
                    if (ah.llIIIllIllIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lllIlIlII[lllIlIlIl[5]];
                        ah.am();
                    }
                }
                if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[20]) && ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[25])) {
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[26]];
                    if (ah.llIIIlllIIll(Players.getLocal().getAnimation(), lllIlIlIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lllIlIlIl[1]);

                    }
                }
                if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[25]) && ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[28])) {
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[29]];
                    if (ah.llIIIlllIIll(Players.getLocal().getAnimation(), lllIlIlIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lllIlIlIl[1]);

                    }
                }
                if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[28]) && ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[30])) {
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[31]];
                    if (ah.llIIIlllIIll(Players.getLocal().getAnimation(), lllIlIlIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lllIlIlIl[1]);

                    }
                }
                if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[30]) && ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7])) {
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[32]];
                    if (ah.llIIIlllIIll(Players.getLocal().getAnimation(), lllIlIlIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lllIlIlIl[1]);

                    }
                }
                if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7])) {
                    int llIlllllIIIII;
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[33]];
                    if (ah.llIIIlllIlII(cn)) {
                        cn = new WorldPoint(lllIlIlIl[34] + e.c(lllIlIlIl[1], lllIlIlIl[6]), lllIlIlIl[35], lllIlIlIl[0]);
                    }
                    int[] nArray = new int[lllIlIlIl[1]];
                    nArray[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                    if (ah.llIIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lllIlIlIl[1]];
                        nArray15[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                        if (ah.llIIIllIllll(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lllIlIlIl[1]];
                            nArray16[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                            Inventory.getFirst((int[])nArray16).interact(lllIlIlII[lllIlIlIl[36]]);
                            Time.sleepTicks((int)lllIlIlIl[1]);

                        }
                    }
                    if (ah.llIIIllIllIl(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lllIlIlIl[1]];
                    nArray17[ah.lllIlIlIl[0]] = lllIlIlIl[23];
                    llIlllllIIIlI = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lllIlIlIl[1]];
                    nArray18[ah.lllIlIlIl[0]] = lllIlIlIl[37];
                    Item llIlllllIIIIl = Inventory.getFirst((int[])nArray18);
                    if (ah.llIIIllIllll(ck ? 1 : 0) && ah.llIIIlllIIII(cn)) {
                        if (ah.llIIIllIllll(Players.getLocal().getWorldLocation().equals((Object)cn) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIlIlII[lllIlIlIl[38]];
                            Movement.walkTo((WorldPoint)cn);

                            Time.sleepTicks((int)lllIlIlIl[1]);

                        }
                        if (ah.llIIIllIllIl(Players.getLocal().getWorldLocation().equals((Object)cn) ? 1 : 0) && ah.llIIIlllIIII(llIlllllIIIlI) && ah.llIIIlllIIII(llIlllllIIIIl)) {
                            llIlllllIIIII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)llIlllllIIIIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (ah.llIIIllllIII(Skills.getExperience((Skill)Skill.MAGIC), llIlllllIIIII)) {
                                    bl = lllIlIlIl[1];

                                    if (2 == 0) {
                                        return false;
                                    }
                                } else {
                                    bl = lllIlIlIl[0];
                                }
                                return bl;
                            }, (int)lllIlIlIl[9]);

                            Time.sleep((long)e.c(lllIlIlIl[39], lllIlIlIl[40]));

                        }
                    }
                    if (ah.llIIIllIllIl(ck ? 1 : 0)) {
                        if (ah.llIIIlllIIII(llIlllllIIIlI) && ah.llIIIlllIIII(llIlllllIIIIl) && ah.llIIIlllIIll(Players.getLocal().getAnimation(), lllIlIlIl[27])) {
                            llIlllllIIIII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)llIlllllIIIIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (ah.llIIIllllIII(Skills.getExperience((Skill)Skill.MAGIC), llIlllllIIIII)) {
                                    bl = lllIlIlIl[1];

                                    }
                                } else {
                                    bl = lllIlIlIl[0];
                                }
                                return bl;
                            }, (int)lllIlIlIl[9]);

                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (ah.llIIIlllIIll(Players.getLocal().getAnimation(), lllIlIlIl[27])) {
                                bl = lllIlIlIl[1];

                                }
                            } else {
                                bl = lllIlIlIl[0];
                            }
                            return bl;
                        }, (int)lllIlIlIl[41]);

                    }
                }
            }
        }
    }

    public static void aq() {
        if (ah.llIIIlllIIII(Widgets.get((int)lllIlIlIl[50], (int)lllIlIlIl[51]))) {
            AccBuilderGWD.c = lllIlIlII[lllIlIlIl[52]];
            Widgets.get((int)lllIlIlIl[50], (int)lllIlIlIl[51]).interact(lllIlIlII[lllIlIlIl[53]]);
            Time.sleepTicks((int)lllIlIlIl[6]);

        }
        if (ah.llIIIlllIlII(Widgets.get((int)lllIlIlIl[50], (int)lllIlIlIl[51])) && ah.llIIIllIllll(Widgets.get((int)lllIlIlIl[54]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lllIlIlIl[1]);

            if (ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[18])) {
                Widgets.get((int)lllIlIlIl[54], (int)lllIlIlIl[1]).getChild(lllIlIlIl[1]).interact(lllIlIlII[lllIlIlIl[55]]);
            }
            if (ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[31]) && ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[18])) {
                Widgets.get((int)lllIlIlIl[54], (int)lllIlIlIl[1]).getChild(lllIlIlIl[2]).interact(lllIlIlII[lllIlIlIl[56]]);
            }
            if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[31]) && ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[38])) {
                Widgets.get((int)lllIlIlIl[54], (int)lllIlIlIl[1]).getChild(lllIlIlIl[3]).interact(lllIlIlII[lllIlIlIl[57]]);
            }
            if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[31])) {
                int[] nArray = new int[lllIlIlIl[1]];
                nArray[ah.lllIlIlIl[0]] = lllIlIlIl[13];
                if (ah.llIIIllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lllIlIlIl[54], (int)lllIlIlIl[1]).getChild(lllIlIlIl[3]).interact(lllIlIlII[lllIlIlIl[20]]);
                }
            }
            if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[38])) {
                int[] nArray = new int[lllIlIlIl[1]];
                nArray[ah.lllIlIlIl[0]] = lllIlIlIl[13];
                if (ah.llIIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lllIlIlIl[54], (int)lllIlIlIl[1]).getChild(lllIlIlIl[6]).interact(lllIlIlII[lllIlIlIl[51]]);
                }
            }
            Time.sleepTicks((int)lllIlIlIl[1]);

        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block29: {
            block28: {
                block25: {
                    int n3;
                    block27: {
                        block26: {
                            block22: {
                                int n4;
                                block23: {
                                    block24: {
                                        block19: {
                                            int n5;
                                            block20: {
                                                block21: {
                                                    if (!ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[20])) break block19;
                                                    int[] nArray = new int[lllIlIlIl[1]];
                                                    nArray[ah.lllIlIlIl[0]] = lllIlIlIl[8];
                                                    if (!ah.llIIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lllIlIlIl[1]];
                                                    nArray2[ah.lllIlIlIl[0]] = lllIlIlIl[12];
                                                    if (!ah.llIIIllIllIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lllIlIlIl[1]];
                                                    nArray3[ah.lllIlIlIl[0]] = lllIlIlIl[10];
                                                    if (!ah.llIIIllIllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lllIlIlIl[1]];
                                                    nArray4[ah.lllIlIlIl[0]] = lllIlIlIl[13];
                                                    if (!ah.llIIIllIllIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lllIlIlIl[1]];
                                                    nArray5[ah.lllIlIlIl[0]] = lllIlIlIl[19];
                                                    if (!ah.llIIIllIllIl(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lllIlIlIl[1]];
                                                    nArray6[ah.lllIlIlIl[0]] = lllIlIlIl[47];
                                                    if (!ah.llIIIllIllll(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lllIlIlIl[1]];
                                                    nArray7[ah.lllIlIlIl[0]] = lllIlIlIl[47];
                                                    if (!ah.llIIIllIllIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lllIlIlIl[1];

                                                if (1 < 3) return n5 != 0;
                                                return false;
                                            }
                                            n5 = lllIlIlIl[0];
                                            return n5 != 0;
                                        }
                                        if (!ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[20]) || !ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7])) break block22;
                                        int[] nArray = new int[lllIlIlIl[1]];
                                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[12];
                                        if (!ah.llIIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lllIlIlIl[1]];
                                        nArray8[ah.lllIlIlIl[0]] = lllIlIlIl[10];
                                        if (!ah.llIIIllIllIl(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lllIlIlIl[1]];
                                        nArray9[ah.lllIlIlIl[0]] = lllIlIlIl[13];
                                        if (!ah.llIIIllIllIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lllIlIlIl[1]];
                                        nArray10[ah.lllIlIlIl[0]] = lllIlIlIl[15];
                                        if (!ah.llIIIllIllIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lllIlIlIl[1]];
                                        nArray11[ah.lllIlIlIl[0]] = lllIlIlIl[47];
                                        if (!ah.llIIIllIllll(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lllIlIlIl[1]];
                                        nArray12[ah.lllIlIlIl[0]] = lllIlIlIl[47];
                                        if (!ah.llIIIllIllIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lllIlIlIl[1];

                                    if (null == null) return n4 != 0;
                                    return ((0x12 ^ 0x67 ^ (0xC4 ^ 0x97)) & (0xAF ^ 0x99 ^ (0xD2 ^ 0xC2) ^ -1)) != 0;
                                }
                                n4 = lllIlIlIl[0];
                                return n4 != 0;
                            }
                            if (!ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7]) || !ah.llIIIllIllll(ck ? 1 : 0)) break block25;
                            int[] nArray = new int[lllIlIlIl[1]];
                            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                            if (!ah.llIIIllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lllIlIlIl[1]];
                            nArray13[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                            if (!ah.llIIIllIllIl(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lllIlIlIl[1]];
                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[23];
                        if (ah.llIIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lllIlIlIl[1]];
                            nArray14[ah.lllIlIlIl[0]] = lllIlIlIl[37];
                            if (ah.llIIIllIllIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lllIlIlIl[1];

                                if (null == null) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = lllIlIlIl[0];
                    return n3 != 0;
                }
                if (!ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7]) || !ah.llIIIllIllIl(ck ? 1 : 0)) return lllIlIlIl[0];
                int[] nArray = new int[lllIlIlIl[1]];
                nArray[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                if (!ah.llIIIllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lllIlIlIl[1]];
                nArray15[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                if (!ah.llIIIllIllIl(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lllIlIlIl[1]];
            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[15];
            if (ah.llIIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lllIlIlIl[1]];
                nArray16[ah.lllIlIlIl[0]] = lllIlIlIl[22];
                if (ah.llIIIllIllIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lllIlIlIl[1]];
                    nArray17[ah.lllIlIlIl[0]] = lllIlIlIl[22];
                    if (ah.llIIIlllIIlI(Inventory.getFirst((int[])nArray17).getQuantity(), lllIlIlIl[18])) {
                        int[] nArray18 = new int[lllIlIlIl[1]];
                        nArray18[ah.lllIlIlIl[0]] = lllIlIlIl[23];
                        if (ah.llIIIllIllIl(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lllIlIlIl[1]];
                            nArray19[ah.lllIlIlIl[0]] = lllIlIlIl[37];
                            if (ah.llIIIllIllIl(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lllIlIlIl[1];

                                if (-3 < 0) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = lllIlIlIl[0];
        return n2 != 0;
    }

    private static void llIIIllIlIll() {
        lllIlIlII = new String[lllIlIlIl[81]];
        ah.lllIlIlII[ah.lllIlIlIl[0]] = "Buying items";
        ah.lllIlIlII[ah.lllIlIlIl[1]] = "Finished buying items, switching back to magic training";
        ah.lllIlIlII[ah.lllIlIlIl[2]] = "Navigating to bank";
        ah.lllIlIlII[ah.lllIlIlIl[3]] = "Handling banking";
        ah.lllIlIlII[ah.lllIlIlIl[6]] = "We are missing supplies, switching to BUYING";
        ah.lllIlIlII[ah.lllIlIlIl[18]] = "Nav to cows";
        ah.lllIlIlII[ah.lllIlIlIl[5]] = "Attacking cows";
        ah.lllIlIlII[ah.lllIlIlIl[26]] = "Casting varrock tele";
        ah.lllIlIlII[ah.lllIlIlIl[29]] = "Casting lumby tele";
        ah.lllIlIlII[ah.lllIlIlIl[31]] = "Casting fally tele";
        ah.lllIlIlII[ah.lllIlIlIl[32]] = "Casting cammy tele";
        ah.lllIlIlII[ah.lllIlIlIl[33]] = "Alching";
        ah.lllIlIlII[ah.lllIlIlIl[36]] = "Wield";
        ah.lllIlIlII[ah.lllIlIlIl[38]] = "Move to alch spot";
        ah.lllIlIlII[ah.lllIlIlIl[42]] = "Nav to cows";
        ah.lllIlIlII[ah.lllIlIlIl[43]] = "Attacking cows";
        ah.lllIlIlII[ah.lllIlIlIl[44]] = "Eat";
        ah.lllIlIlII[ah.lllIlIlIl[45]] = "Cow";
        ah.lllIlIlII[ah.lllIlIlIl[46]] = "cow";
        ah.lllIlIlII[ah.lllIlIlIl[48]] = "Attack";
        ah.lllIlIlII[ah.lllIlIlIl[52]] = "Opening autocast";
        ah.lllIlIlII[ah.lllIlIlIl[53]] = "Choose spell";
        ah.lllIlIlII[ah.lllIlIlIl[55]] = "Wind Strike";
        ah.lllIlIlII[ah.lllIlIlIl[56]] = "Water Strike";
        ah.lllIlIlII[ah.lllIlIlIl[57]] = "Earth Strike";
        ah.lllIlIlII[ah.lllIlIlIl[20]] = "Earth Strike";
        ah.lllIlIlII[ah.lllIlIlIl[51]] = "Fire Strike";
        ah.lllIlIlII[ah.lllIlIlIl[73]] = "Magic training";
        ah.lllIlIlII[ah.lllIlIlIl[75]] = "ring of wealth (";
        ah.lllIlIlII[ah.lllIlIlIl[76]] = "Cow";
    }

    private static void am() {
        if (ah.llIIIlllIllI(ah.llIIIlllIlIl(e.w(), 30.0))) {
            int[] nArray = new int[lllIlIlIl[1]];
            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[19];
            if (ah.llIIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIlIlIl[1]];
                nArray2[ah.lllIlIlIl[0]] = lllIlIlIl[19];
                Inventory.getFirst((int[])nArray2).interact(lllIlIlII[lllIlIlIl[44]]);
                Time.sleepTicks((int)lllIlIlIl[1]);

            }
        }
        if (ah.llIIIlllIlII(Players.getLocal().getInteracting())) {
            NPC llIllllIlllIl = NPCs.getNearest(nPC -> {
                int n2;
                if (ah.llIIIllIllIl(nPC.getName().contains(lllIlIlII[lllIlIlIl[76]]) ? 1 : 0) && ah.llIIIllIllll(nPC.isDead() ? 1 : 0)) {
                    n2 = lllIlIlIl[1];

                    if (1 < 1) {
                        return false;
                    }
                } else {
                    n2 = lllIlIlIl[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lllIlIlIl[2]];
            stringArray[ah.lllIlIlIl[0]] = lllIlIlII[lllIlIlIl[45]];
            stringArray[ah.lllIlIlIl[1]] = lllIlIlII[lllIlIlIl[46]];
            List llIllllIlllII = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (ah.llIIIlllIlll(nPC.getInteracting(), Players.getLocal())) {
                    bl = lllIlIlIl[1];

                    if ((0x4E ^ 0x30 ^ (0x15 ^ 0x6F)) == 2) {
                        return ((3 ^ (0x48 ^ 0x2B)) & (0x2A ^ 0x53 ^ (0x97 ^ 0x8E) ^ -1)) != 0;
                    }
                } else {
                    bl = lllIlIlIl[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lllIlIlIl[1]];
            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[47];
            if (ah.llIIIllIllIl(Equipment.contains((int[])nArray) ? 1 : 0) && ah.llIIIllIllll(ah.ap() ? 1 : 0)) {
                ah.aq();
            }
            if (ah.llIIIlllIIII(llIllllIlllIl) && ah.llIIIllIllll(Players.getLocal().isMoving() ? 1 : 0)) {
                llIllllIlllIl.interact(lllIlIlII[lllIlIlIl[48]]);
                Time.sleepTicks((int)lllIlIlIl[3]);

            }
        }
    }

    private static boolean llIIIlllIlll(Object object, Object object2) {
        return object == object2;
    }

    static {
        ah.llIIIllIllII();
        ah.llIIIllIlIll();
        ck = lllIlIlIl[0];
        bx = new ArrayList<d>();
        cl = new WorldArea(lllIlIlIl[77], lllIlIlIl[78], lllIlIlIl[52], lllIlIlIl[42], lllIlIlIl[0]);
        cm = new WorldPoint(lllIlIlIl[79], lllIlIlIl[80], lllIlIlIl[0]);
        cn = null;
    }

    private static boolean llIIIlllIIIl(int n2) {
        return n2 > 0;
    }

    public static boolean ap() {
        if (ah.llIIIlllIIll(Vars.getBit((int)lllIlIlIl[49]), lllIlIlIl[1]) && ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[18])) {
            return lllIlIlIl[1];
        }
        if (ah.llIIIlllIIll(Vars.getBit((int)lllIlIlIl[49]), lllIlIlIl[2]) && ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[31]) && ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[18])) {
            return lllIlIlIl[1];
        }
        if (ah.llIIIlllIIll(Vars.getBit((int)lllIlIlIl[49]), lllIlIlIl[3]) && ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[31]) && ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[38])) {
            return lllIlIlIl[1];
        }
        if (ah.llIIIlllIIll(Vars.getBit((int)lllIlIlIl[49]), lllIlIlIl[3]) && ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[31])) {
            int[] nArray = new int[lllIlIlIl[1]];
            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[13];
            if (ah.llIIIllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lllIlIlIl[1];
            }
        }
        if (ah.llIIIlllIIll(Vars.getBit((int)lllIlIlIl[49]), lllIlIlIl[6]) && ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[38])) {
            int[] nArray = new int[lllIlIlIl[1]];
            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[13];
            if (ah.llIIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lllIlIlIl[1];
            }
        }
        return lllIlIlIl[0];
    }
}

