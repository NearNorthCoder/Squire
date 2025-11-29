/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.client.Static
 */
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.LHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.PHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.RHelper;
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
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;

public class AIHelper
implements ab {
    public static  WorldPoint cQ;
    public static  WorldArea cP;
    public static  WorldArea cO;
    public static  boolean bv;
    public static  WorldPoint cR;
    
    public static  int[] cM;
    public static  int[] mf;
    public static  List<d> bx;
    
    public static  WorldArea cN;
    public static  WorldPoint cm;

    private static boolean lIlIlIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aN() {
        int n2;
        block28: {
            block35: {
                block34: {
                    block33: {
                        block32: {
                            block31: {
                                block30: {
                                    block29: {
                                        block27: {
                                            block17: {
                                                int n3;
                                                block19: {
                                                    block26: {
                                                        block25: {
                                                            block24: {
                                                                block23: {
                                                                    block22: {
                                                                        block21: {
                                                                            block20: {
                                                                                block18: {
                                                                                    block6: {
                                                                                        int n4;
                                                                                        block8: {
                                                                                            block16: {
                                                                                                block15: {
                                                                                                    block14: {
                                                                                                        block13: {
                                                                                                            block12: {
                                                                                                                block11: {
                                                                                                                    block10: {
                                                                                                                        block9: {
                                                                                                                            block7: {
                                                                                                                                if (!ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2]) || !ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[2]) || !ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[2])) break block6;
                                                                                                                                int[] nArray = new int[llIIlIIIl[1]];
                                                                                                                                nArray[ai.llIIlIIIl[0]] = llIIlIIIl[20];
                                                                                                                                if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                                                                                                                                int[] nArray2 = new int[llIIlIIIl[1]];
                                                                                                                                nArray2[ai.llIIlIIIl[0]] = llIIlIIIl[20];
                                                                                                                                if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block7;
                                                                                                                                int[] nArray3 = new int[llIIlIIIl[1]];
                                                                                                                                nArray3[ai.llIIlIIIl[0]] = llIIlIIIl[20];
                                                                                                                                if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) break block8;
                                                                                                                            }
                                                                                                                            int[] nArray = new int[llIIlIIIl[1]];
                                                                                                                            nArray[ai.llIIlIIIl[0]] = llIIlIIIl[37];
                                                                                                                            if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                                                                            int[] nArray4 = new int[llIIlIIIl[1]];
                                                                                                                            nArray4[ai.llIIlIIIl[0]] = llIIlIIIl[37];
                                                                                                                            if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block9;
                                                                                                                            int[] nArray5 = new int[llIIlIIIl[1]];
                                                                                                                            nArray5[ai.llIIlIIIl[0]] = llIIlIIIl[37];
                                                                                                                            if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) break block8;
                                                                                                                        }
                                                                                                                        int[] nArray = new int[llIIlIIIl[1]];
                                                                                                                        nArray[ai.llIIlIIIl[0]] = llIIlIIIl[38];
                                                                                                                        if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block10;
                                                                                                                        int[] nArray6 = new int[llIIlIIIl[1]];
                                                                                                                        nArray6[ai.llIIlIIIl[0]] = llIIlIIIl[38];
                                                                                                                        if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block10;
                                                                                                                        int[] nArray7 = new int[llIIlIIIl[1]];
                                                                                                                        nArray7[ai.llIIlIIIl[0]] = llIIlIIIl[38];
                                                                                                                        if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray7) ? 1 : 0)) break block8;
                                                                                                                    }
                                                                                                                    int[] nArray = new int[llIIlIIIl[1]];
                                                                                                                    nArray[ai.llIIlIIIl[0]] = llIIlIIIl[36];
                                                                                                                    if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                                                                    int[] nArray8 = new int[llIIlIIIl[1]];
                                                                                                                    nArray8[ai.llIIlIIIl[0]] = llIIlIIIl[36];
                                                                                                                    if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block11;
                                                                                                                    int[] nArray9 = new int[llIIlIIIl[1]];
                                                                                                                    nArray9[ai.llIIlIIIl[0]] = llIIlIIIl[36];
                                                                                                                    if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block8;
                                                                                                                }
                                                                                                                int[] nArray = new int[llIIlIIIl[1]];
                                                                                                                nArray[ai.llIIlIIIl[0]] = llIIlIIIl[40];
                                                                                                                if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block12;
                                                                                                                int[] nArray10 = new int[llIIlIIIl[1]];
                                                                                                                nArray10[ai.llIIlIIIl[0]] = llIIlIIIl[40];
                                                                                                                if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block12;
                                                                                                                int[] nArray11 = new int[llIIlIIIl[1]];
                                                                                                                nArray11[ai.llIIlIIIl[0]] = llIIlIIIl[40];
                                                                                                                if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray11) ? 1 : 0)) break block8;
                                                                                                            }
                                                                                                            int[] nArray = new int[llIIlIIIl[1]];
                                                                                                            nArray[ai.llIIlIIIl[0]] = llIIlIIIl[39];
                                                                                                            if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block13;
                                                                                                            int[] nArray12 = new int[llIIlIIIl[1]];
                                                                                                            nArray12[ai.llIIlIIIl[0]] = llIIlIIIl[39];
                                                                                                            if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray12) ? 1 : 0)) break block13;
                                                                                                            int[] nArray13 = new int[llIIlIIIl[1]];
                                                                                                            nArray13[ai.llIIlIIIl[0]] = llIIlIIIl[39];
                                                                                                            if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray13) ? 1 : 0)) break block8;
                                                                                                        }
                                                                                                        int[] nArray = new int[llIIlIIIl[1]];
                                                                                                        nArray[ai.llIIlIIIl[0]] = llIIlIIIl[35];
                                                                                                        if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block14;
                                                                                                        int[] nArray14 = new int[llIIlIIIl[1]];
                                                                                                        nArray14[ai.llIIlIIIl[0]] = llIIlIIIl[35];
                                                                                                        if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray14) ? 1 : 0)) break block14;
                                                                                                        int[] nArray15 = new int[llIIlIIIl[1]];
                                                                                                        nArray15[ai.llIIlIIIl[0]] = llIIlIIIl[35];
                                                                                                        if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray15) ? 1 : 0)) break block8;
                                                                                                    }
                                                                                                    int[] nArray = new int[llIIlIIIl[1]];
                                                                                                    nArray[ai.llIIlIIIl[0]] = llIIlIIIl[63];
                                                                                                    if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block15;
                                                                                                    int[] nArray16 = new int[llIIlIIIl[1]];
                                                                                                    nArray16[ai.llIIlIIIl[0]] = llIIlIIIl[63];
                                                                                                    if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray16) ? 1 : 0)) break block15;
                                                                                                    int[] nArray17 = new int[llIIlIIIl[1]];
                                                                                                    nArray17[ai.llIIlIIIl[0]] = llIIlIIIl[63];
                                                                                                    if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray17) ? 1 : 0)) break block8;
                                                                                                }
                                                                                                int[] nArray = new int[llIIlIIIl[1]];
                                                                                                nArray[ai.llIIlIIIl[0]] = llIIlIIIl[13];
                                                                                                if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block16;
                                                                                                int[] nArray18 = new int[llIIlIIIl[1]];
                                                                                                nArray18[ai.llIIlIIIl[0]] = llIIlIIIl[13];
                                                                                                if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray18) ? 1 : 0)) break block8;
                                                                                            }
                                                                                            n4 = llIIlIIIl[1];

                                                                                            if (-1 != 3) return n4 != 0;
                                                                                            return false;
                                                                                        }
                                                                                        n4 = llIIlIIIl[0];
                                                                                        return n4 != 0;
                                                                                    }
                                                                                    if (!ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[22]) || !ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2])) break block17;
                                                                                    int[] nArray = new int[llIIlIIIl[1]];
                                                                                    nArray[ai.llIIlIIIl[0]] = llIIlIIIl[19];
                                                                                    if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                                                                                    int[] nArray19 = new int[llIIlIIIl[1]];
                                                                                    nArray19[ai.llIIlIIIl[0]] = llIIlIIIl[19];
                                                                                    if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray19) ? 1 : 0)) break block18;
                                                                                    int[] nArray20 = new int[llIIlIIIl[1]];
                                                                                    nArray20[ai.llIIlIIIl[0]] = llIIlIIIl[19];
                                                                                    if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray20) ? 1 : 0)) break block19;
                                                                                }
                                                                                int[] nArray = new int[llIIlIIIl[1]];
                                                                                nArray[ai.llIIlIIIl[0]] = llIIlIIIl[55];
                                                                                if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block20;
                                                                                int[] nArray21 = new int[llIIlIIIl[1]];
                                                                                nArray21[ai.llIIlIIIl[0]] = llIIlIIIl[55];
                                                                                if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray21) ? 1 : 0)) break block20;
                                                                                int[] nArray22 = new int[llIIlIIIl[1]];
                                                                                nArray22[ai.llIIlIIIl[0]] = llIIlIIIl[55];
                                                                                if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray22) ? 1 : 0)) break block19;
                                                                            }
                                                                            int[] nArray = new int[llIIlIIIl[1]];
                                                                            nArray[ai.llIIlIIIl[0]] = llIIlIIIl[57];
                                                                            if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block21;
                                                                            int[] nArray23 = new int[llIIlIIIl[1]];
                                                                            nArray23[ai.llIIlIIIl[0]] = llIIlIIIl[57];
                                                                            if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray23) ? 1 : 0)) break block21;
                                                                            int[] nArray24 = new int[llIIlIIIl[1]];
                                                                            nArray24[ai.llIIlIIIl[0]] = llIIlIIIl[57];
                                                                            if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray24) ? 1 : 0)) break block19;
                                                                        }
                                                                        int[] nArray = new int[llIIlIIIl[1]];
                                                                        nArray[ai.llIIlIIIl[0]] = llIIlIIIl[53];
                                                                        if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                        int[] nArray25 = new int[llIIlIIIl[1]];
                                                                        nArray25[ai.llIIlIIIl[0]] = llIIlIIIl[53];
                                                                        if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray25) ? 1 : 0)) break block22;
                                                                        int[] nArray26 = new int[llIIlIIIl[1]];
                                                                        nArray26[ai.llIIlIIIl[0]] = llIIlIIIl[53];
                                                                        if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray26) ? 1 : 0)) break block19;
                                                                    }
                                                                    int[] nArray = new int[llIIlIIIl[1]];
                                                                    nArray[ai.llIIlIIIl[0]] = llIIlIIIl[59];
                                                                    if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                                                                    int[] nArray27 = new int[llIIlIIIl[1]];
                                                                    nArray27[ai.llIIlIIIl[0]] = llIIlIIIl[59];
                                                                    if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray27) ? 1 : 0)) break block23;
                                                                    int[] nArray28 = new int[llIIlIIIl[1]];
                                                                    nArray28[ai.llIIlIIIl[0]] = llIIlIIIl[59];
                                                                    if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray28) ? 1 : 0)) break block19;
                                                                }
                                                                int[] nArray = new int[llIIlIIIl[1]];
                                                                nArray[ai.llIIlIIIl[0]] = llIIlIIIl[61];
                                                                if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block24;
                                                                int[] nArray29 = new int[llIIlIIIl[1]];
                                                                nArray29[ai.llIIlIIIl[0]] = llIIlIIIl[61];
                                                                if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray29) ? 1 : 0)) break block24;
                                                                int[] nArray30 = new int[llIIlIIIl[1]];
                                                                nArray30[ai.llIIlIIIl[0]] = llIIlIIIl[61];
                                                                if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray30) ? 1 : 0)) break block19;
                                                            }
                                                            int[] nArray = new int[llIIlIIIl[1]];
                                                            nArray[ai.llIIlIIIl[0]] = llIIlIIIl[63];
                                                            if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
                                                            int[] nArray31 = new int[llIIlIIIl[1]];
                                                            nArray31[ai.llIIlIIIl[0]] = llIIlIIIl[63];
                                                            if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray31) ? 1 : 0)) break block25;
                                                            int[] nArray32 = new int[llIIlIIIl[1]];
                                                            nArray32[ai.llIIlIIIl[0]] = llIIlIIIl[63];
                                                            if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray32) ? 1 : 0)) break block19;
                                                        }
                                                        int[] nArray = new int[llIIlIIIl[1]];
                                                        nArray[ai.llIIlIIIl[0]] = llIIlIIIl[13];
                                                        if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                                                        int[] nArray33 = new int[llIIlIIIl[1]];
                                                        nArray33[ai.llIIlIIIl[0]] = llIIlIIIl[13];
                                                        if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray33) ? 1 : 0)) break block19;
                                                    }
                                                    n3 = llIIlIIIl[1];

                                                    if (1 != ((0x34 ^ 0x3B) & ~(0x39 ^ 0x36))) return n3 != 0;
                                                    return false;
                                                }
                                                n3 = llIIlIIIl[0];
                                                return n3 != 0;
                                            }
                                            int[] nArray = new int[llIIlIIIl[1]];
                                            nArray[ai.llIIlIIIl[0]] = llIIlIIIl[18];
                                            if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block27;
                                            int[] nArray34 = new int[llIIlIIIl[1]];
                                            nArray34[ai.llIIlIIIl[0]] = llIIlIIIl[18];
                                            if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray34) ? 1 : 0)) break block27;
                                            int[] nArray35 = new int[llIIlIIIl[1]];
                                            nArray35[ai.llIIlIIIl[0]] = llIIlIIIl[18];
                                            if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray35) ? 1 : 0)) break block28;
                                        }
                                        int[] nArray = new int[llIIlIIIl[1]];
                                        nArray[ai.llIIlIIIl[0]] = llIIlIIIl[55];
                                        if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block29;
                                        int[] nArray36 = new int[llIIlIIIl[1]];
                                        nArray36[ai.llIIlIIIl[0]] = llIIlIIIl[55];
                                        if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray36) ? 1 : 0)) break block29;
                                        int[] nArray37 = new int[llIIlIIIl[1]];
                                        nArray37[ai.llIIlIIIl[0]] = llIIlIIIl[55];
                                        if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray37) ? 1 : 0)) break block28;
                                    }
                                    int[] nArray = new int[llIIlIIIl[1]];
                                    nArray[ai.llIIlIIIl[0]] = llIIlIIIl[57];
                                    if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray38 = new int[llIIlIIIl[1]];
                                    nArray38[ai.llIIlIIIl[0]] = llIIlIIIl[57];
                                    if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray38) ? 1 : 0)) break block30;
                                    int[] nArray39 = new int[llIIlIIIl[1]];
                                    nArray39[ai.llIIlIIIl[0]] = llIIlIIIl[57];
                                    if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray39) ? 1 : 0)) break block28;
                                }
                                int[] nArray = new int[llIIlIIIl[1]];
                                nArray[ai.llIIlIIIl[0]] = llIIlIIIl[53];
                                if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block31;
                                int[] nArray40 = new int[llIIlIIIl[1]];
                                nArray40[ai.llIIlIIIl[0]] = llIIlIIIl[53];
                                if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray40) ? 1 : 0)) break block31;
                                int[] nArray41 = new int[llIIlIIIl[1]];
                                nArray41[ai.llIIlIIIl[0]] = llIIlIIIl[53];
                                if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray41) ? 1 : 0)) break block28;
                            }
                            int[] nArray = new int[llIIlIIIl[1]];
                            nArray[ai.llIIlIIIl[0]] = llIIlIIIl[59];
                            if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray42 = new int[llIIlIIIl[1]];
                            nArray42[ai.llIIlIIIl[0]] = llIIlIIIl[59];
                            if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray42) ? 1 : 0)) break block32;
                            int[] nArray43 = new int[llIIlIIIl[1]];
                            nArray43[ai.llIIlIIIl[0]] = llIIlIIIl[59];
                            if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray43) ? 1 : 0)) break block28;
                        }
                        int[] nArray = new int[llIIlIIIl[1]];
                        nArray[ai.llIIlIIIl[0]] = llIIlIIIl[61];
                        if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray44 = new int[llIIlIIIl[1]];
                        nArray44[ai.llIIlIIIl[0]] = llIIlIIIl[61];
                        if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray44) ? 1 : 0)) break block33;
                        int[] nArray45 = new int[llIIlIIIl[1]];
                        nArray45[ai.llIIlIIIl[0]] = llIIlIIIl[61];
                        if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray45) ? 1 : 0)) break block28;
                    }
                    int[] nArray = new int[llIIlIIIl[1]];
                    nArray[ai.llIIlIIIl[0]] = llIIlIIIl[63];
                    if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block34;
                    int[] nArray46 = new int[llIIlIIIl[1]];
                    nArray46[ai.llIIlIIIl[0]] = llIIlIIIl[63];
                    if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray46) ? 1 : 0)) break block34;
                    int[] nArray47 = new int[llIIlIIIl[1]];
                    nArray47[ai.llIIlIIIl[0]] = llIIlIIIl[63];
                    if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray47) ? 1 : 0)) break block28;
                }
                int[] nArray = new int[llIIlIIIl[1]];
                nArray[ai.llIIlIIIl[0]] = llIIlIIIl[13];
                if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block35;
                int[] nArray48 = new int[llIIlIIIl[1]];
                nArray48[ai.llIIlIIIl[0]] = llIIlIIIl[13];
                if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray48) ? 1 : 0)) break block28;
            }
            n2 = llIIlIIIl[1];

            if (1 > 0) return n2 != 0;
            return ((0x9B ^ 0x86 ^ (0xD2 ^ 0x9A)) & (84 + 214 - 151 + 71 ^ 65 + 4 - 40 + 114 ^ -1)) != 0;
        }
        n2 = llIIlIIIl[0];
        return n2 != 0;
    }

    private static boolean lIlIlIIlllIl(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public boolean ah() {
        int n2;
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[4]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[3])) {
            n2 = llIIlIIIl[1];

            if ((0xCB ^ 0xB7 ^ (0xF6 ^ 0x8E)) != (0x2C ^ 0x45 ^ (0xE ^ 0x63))) {
                return ((98 + 86 - 108 + 53 ^ 186 + 53 - 108 + 68) & (0x33 ^ 0x3B ^ (0xF4 ^ 0xBA) ^ -1)) != 0;
            }
        } else {
            n2 = llIIlIIIl[0];
        }
        return n2 != 0;
    }

    private static boolean lIlIlIIllIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIlIIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    public static void aJ() {
        block26: {
            block28: {
                block27: {
                    block23: {
                        block25: {
                            block24: {
                                if (ai.lIlIlIIlIIlI(bv ? 1 : 0)) {
                                    AccBuilderGWD.c = llIIIllll[llIIlIIIl[0]];
                                    b.a(bx);
                                    if (ai.lIlIlIIlIIll(bx.size(), llIIlIIIl[1])) {
                                        System.out.println(llIIIllll[llIIlIIIl[1]]);
                                        bv = llIIlIIIl[0];
                                    }
                                }
                                if (!ai.lIlIlIIlIlII(bv ? 1 : 0) || ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[2]) && !ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[2])) break block23;
                                if (ai.lIlIlIIlIlII(ai.aM() ? 1 : 0) && (!ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[3]) || !ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2]) || ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[4]))) {
                                    BankLocation lIllIIllIIlIlI = BankLocation.getNearest();
                                    if (ai.lIlIlIIlIllI(lIllIIllIIlIlI) && ai.lIlIlIIlIlII(lIllIIllIIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderGWD.c = llIIIllll[llIIlIIIl[5]];
                                        a.a(lIllIIllIIlIlI);
                                    }
                                    if (ai.lIlIlIIlIllI(lIllIIllIIlIlI) && ai.lIlIlIIlIIlI(lIllIIllIIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderGWD.c = llIIIllll[llIIlIIIl[6]];
                                        if (ai.lIlIlIIlIlII(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIIIl[7]);

                                        }
                                        if (ai.lIlIlIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                                            if (ai.lIlIlIIlIlll(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)llIIlIIIl[1]);

                                            }
                                            if (ai.lIlIlIIlIlll(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)llIIlIIIl[5]);

                                            }
                                            if (ai.lIlIlIIlIlII(ai.aN() ? 1 : 0)) {
                                                ai.Q();
                                                System.out.println(llIIIllll[llIIlIIIl[8]]);
                                                bv = llIIlIIIl[1];
                                                return;
                                            }
                                            if (!ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2]) || ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[2]) && ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[2])) {
                                                a.a(cM, llIIlIIIl[1]);
                                            }
                                            if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[2]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[2])) {
                                                a.a(mf, llIIlIIIl[1]);
                                            }
                                            a.a(llIIlIIIl[9], llIIlIIIl[10]);
                                            a.b(f.bc, llIIlIIIl[1]);
                                            a.a(llIIlIIIl[11], llIIlIIIl[12]);
                                            a.a(llIIlIIIl[13], llIIlIIIl[14]);
                                        }
                                    }
                                }
                                if (!ai.lIlIlIIlIIlI(ai.aM() ? 1 : 0)) break block23;
                                ai.aL();
                                if (ai.lIlIlIIlIlIl(Movement.getRunEnergy(), llIIlIIIl[15]) && ai.lIlIlIIlIlII(Movement.isRunEnabled() ? 1 : 0)) {
                                    Movement.toggleRun();
                                }
                                String[] stringArray = new String[llIIlIIIl[1]];
                                stringArray[ai.llIIlIIIl[0]] = llIIIllll[llIIlIIIl[12]];
                                if (!ai.lIlIlIIlIlII(Equipment.contains((String[])stringArray) ? 1 : 0)) break block24;
                                String[] stringArray2 = new String[llIIlIIIl[1]];
                                stringArray2[ai.llIIlIIIl[0]] = llIIIllll[llIIlIIIl[16]];
                                if (!ai.lIlIlIIlIlII(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block24;
                                String[] stringArray3 = new String[llIIlIIIl[1]];
                                stringArray3[ai.llIIlIIIl[0]] = llIIIllll[llIIlIIIl[17]];
                                if (!ai.lIlIlIIlIlII(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block24;
                                int[] nArray = new int[llIIlIIIl[1]];
                                nArray[ai.llIIlIIIl[0]] = llIIlIIIl[18];
                                if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block24;
                                int[] nArray2 = new int[llIIlIIIl[1]];
                                nArray2[ai.llIIlIIIl[0]] = llIIlIIIl[19];
                                if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray2) ? 1 : 0)) break block24;
                                int[] nArray3 = new int[llIIlIIIl[1]];
                                nArray3[ai.llIIlIIIl[0]] = llIIlIIIl[20];
                                if (!ai.lIlIlIIlIIlI(Equipment.contains((int[])nArray3) ? 1 : 0)) break block25;
                            }
                            ai.aO();
                        }
                        if (ai.lIlIlIIllIII(ai.lIlIlIIIllll(e.w(), 45.0))) {
                            int[] nArray = new int[llIIlIIIl[1]];
                            nArray[ai.llIIlIIIl[0]] = llIIlIIIl[13];
                            if (ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray4 = new int[llIIlIIIl[1]];
                                nArray4[ai.llIIlIIIl[0]] = llIIlIIIl[13];
                                Inventory.getFirst((int[])nArray4).interact(llIIIllll[llIIlIIIl[21]]);
                                Time.sleepTicks((int)llIIlIIIl[1]);

                            }
                        }
                        if (ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[22]) && !ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[23]) || ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[22]) && !ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[23]) || ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[22]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[23])) {
                            p.al();
                        }
                        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[22]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[22]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[22]) && (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[22]) && !ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2]) || ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[22]) && !ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[2]) || ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[22]) && ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[2]))) {
                            l.aj();
                        }
                    }
                    if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[4]) && !ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[3]) || !ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[2]) || !ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[2]) || !ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2])) break block26;
                    String[] stringArray = new String[llIIlIIIl[1]];
                    stringArray[ai.llIIlIIIl[0]] = llIIIllll[llIIlIIIl[24]];
                    if (!ai.lIlIlIIlIlII(Equipment.contains((String[])stringArray) ? 1 : 0)) break block27;
                    String[] stringArray4 = new String[llIIlIIIl[1]];
                    stringArray4[ai.llIIlIIIl[0]] = llIIIllll[llIIlIIIl[23]];
                    if (!ai.lIlIlIIlIlII(Equipment.contains((String[])stringArray4) ? 1 : 0)) break block27;
                    String[] stringArray5 = new String[llIIlIIIl[1]];
                    stringArray5[ai.llIIlIIIl[0]] = llIIIllll[llIIlIIIl[25]];
                    if (!ai.lIlIlIIlIlII(Equipment.contains((String[])stringArray5) ? 1 : 0)) break block27;
                    int[] nArray = new int[llIIlIIIl[1]];
                    nArray[ai.llIIlIIIl[0]] = llIIlIIIl[18];
                    if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block27;
                    int[] nArray5 = new int[llIIlIIIl[1]];
                    nArray5[ai.llIIlIIIl[0]] = llIIlIIIl[19];
                    if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray5) ? 1 : 0)) break block27;
                    int[] nArray6 = new int[llIIlIIIl[1]];
                    nArray6[ai.llIIlIIIl[0]] = llIIlIIIl[20];
                    if (!ai.lIlIlIIlIIlI(Equipment.contains((int[])nArray6) ? 1 : 0)) break block28;
                }
                ai.aO();
            }
            r.aV();
        }
    }

    @Override
    public boolean ae() {
        return llIIlIIIl[0];
    }

    private static boolean lIlIlIIlIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIIllIll(Object object, Object object2) {
        return object != object2;
    }

    public static void aL() {
        if (ai.lIlIlIIllIlI(Static.getClient().getVar(llIIlIIIl[25]), llIIlIIIl[1])) {
            Static.getClient().invokeMenuAction(llIIIllll[llIIlIIIl[31]], llIIIllll[llIIlIIIl[32]], llIIlIIIl[1], MenuAction.CC_OP.getId(), llIIlIIIl[33], llIIlIIIl[34]);
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[2]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[2])) {
            e.l(llIIlIIIl[20]);
            e.l(llIIlIIIl[35]);
            e.l(llIIlIIIl[36]);
            e.l(llIIlIIIl[37]);
            e.l(llIIlIIIl[38]);
            e.l(llIIlIIIl[39]);
            e.l(llIIlIIIl[40]);
            e.l(llIIlIIIl[41]);
        }
        if (ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[12])) {
            String[] stringArray = new String[llIIlIIIl[1]];
            stringArray[ai.llIIlIIIl[0]] = llIIIllll[llIIlIIIl[42]];
            if (ai.lIlIlIIlIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[llIIlIIIl[1]];
                stringArray2[ai.llIIlIIIl[0]] = llIIIllll[llIIlIIIl[43]];
                Inventory.getFirst((String[])stringArray2).interact(llIIIllll[llIIlIIIl[44]]);
            }
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[12]) && ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[42])) {
            String[] stringArray = new String[llIIlIIIl[1]];
            stringArray[ai.llIIlIIIl[0]] = llIIIllll[llIIlIIIl[45]];
            if (ai.lIlIlIIlIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray3 = new String[llIIlIIIl[1]];
                stringArray3[ai.llIIlIIIl[0]] = llIIIllll[llIIlIIIl[46]];
                Inventory.getFirst((String[])stringArray3).interact(llIIIllll[llIIlIIIl[47]]);
            }
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[42]) && ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[48])) {
            String[] stringArray = new String[llIIlIIIl[1]];
            stringArray[ai.llIIlIIIl[0]] = llIIIllll[llIIlIIIl[49]];
            if (ai.lIlIlIIlIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray4 = new String[llIIlIIIl[1]];
                stringArray4[ai.llIIlIIIl[0]] = llIIIllll[llIIlIIIl[50]];
                Inventory.getFirst((String[])stringArray4).interact(llIIIllll[llIIlIIIl[51]]);
            }
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[48]) && ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[22])) {
            int[] nArray = new int[llIIlIIIl[1]];
            nArray[ai.llIIlIIIl[0]] = llIIlIIIl[18];
            if (ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIlIIIl[1]];
                nArray2[ai.llIIlIIIl[0]] = llIIlIIIl[18];
                Inventory.getFirst((int[])nArray2).interact(llIIIllll[llIIlIIIl[52]]);
            }
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[22])) {
            int[] nArray = new int[llIIlIIIl[1]];
            nArray[ai.llIIlIIIl[0]] = llIIlIIIl[19];
            if (ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[llIIlIIIl[1]];
                nArray3[ai.llIIlIIIl[0]] = llIIlIIIl[19];
                Inventory.getFirst((int[])nArray3).interact(llIIIllll[llIIlIIIl[48]]);
            }
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[48])) {
            int[] nArray = new int[llIIlIIIl[1]];
            nArray[ai.llIIlIIIl[0]] = llIIlIIIl[53];
            if (ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray4 = new int[llIIlIIIl[1]];
                nArray4[ai.llIIlIIIl[0]] = llIIlIIIl[53];
                Inventory.getFirst((int[])nArray4).interact(llIIIllll[llIIlIIIl[54]]);
            }
            int[] nArray5 = new int[llIIlIIIl[1]];
            nArray5[ai.llIIlIIIl[0]] = llIIlIIIl[55];
            if (ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[llIIlIIIl[1]];
                nArray6[ai.llIIlIIIl[0]] = llIIlIIIl[55];
                Inventory.getFirst((int[])nArray6).interact(llIIIllll[llIIlIIIl[56]]);
            }
            int[] nArray7 = new int[llIIlIIIl[1]];
            nArray7[ai.llIIlIIIl[0]] = llIIlIIIl[57];
            if (ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                int[] nArray8 = new int[llIIlIIIl[1]];
                nArray8[ai.llIIlIIIl[0]] = llIIlIIIl[57];
                Inventory.getFirst((int[])nArray8).interact(llIIIllll[llIIlIIIl[58]]);
            }
            int[] nArray9 = new int[llIIlIIIl[1]];
            nArray9[ai.llIIlIIIl[0]] = llIIlIIIl[59];
            if (ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[llIIlIIIl[1]];
                nArray10[ai.llIIlIIIl[0]] = llIIlIIIl[59];
                Inventory.getFirst((int[])nArray10).interact(llIIIllll[llIIlIIIl[60]]);
            }
        }
        int[] nArray = new int[llIIlIIIl[1]];
        nArray[ai.llIIlIIIl[0]] = llIIlIIIl[61];
        if (ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray11 = new int[llIIlIIIl[1]];
            nArray11[ai.llIIlIIIl[0]] = llIIlIIIl[61];
            Inventory.getFirst((int[])nArray11).interact(llIIIllll[llIIlIIIl[62]]);
        }
        int[] nArray12 = new int[llIIlIIIl[1]];
        nArray12[ai.llIIlIIIl[0]] = llIIlIIIl[63];
        if (ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[llIIlIIIl[1]];
            nArray13[ai.llIIlIIIl[0]] = llIIlIIIl[63];
            Inventory.getFirst((int[])nArray13).interact(llIIIllll[llIIlIIIl[64]]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aM() {
        int n2;
        block32: {
            block38: {
                block37: {
                    block36: {
                        block35: {
                            block34: {
                                block33: {
                                    block31: {
                                        block22: {
                                            int n3;
                                            block24: {
                                                block30: {
                                                    block29: {
                                                        block28: {
                                                            block27: {
                                                                block26: {
                                                                    block25: {
                                                                        block23: {
                                                                            block11: {
                                                                                int n4;
                                                                                block13: {
                                                                                    block21: {
                                                                                        block20: {
                                                                                            block19: {
                                                                                                block18: {
                                                                                                    block17: {
                                                                                                        block16: {
                                                                                                            block15: {
                                                                                                                block14: {
                                                                                                                    block12: {
                                                                                                                        if (!ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2]) || !ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[2]) || !ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[2])) break block11;
                                                                                                                        int[] nArray = new int[llIIlIIIl[1]];
                                                                                                                        nArray[ai.llIIlIIIl[0]] = llIIlIIIl[20];
                                                                                                                        if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block12;
                                                                                                                        int[] nArray2 = new int[llIIlIIIl[1]];
                                                                                                                        nArray2[ai.llIIlIIIl[0]] = llIIlIIIl[20];
                                                                                                                        if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block13;
                                                                                                                    }
                                                                                                                    int[] nArray = new int[llIIlIIIl[1]];
                                                                                                                    nArray[ai.llIIlIIIl[0]] = llIIlIIIl[37];
                                                                                                                    if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                                                                                                    int[] nArray3 = new int[llIIlIIIl[1]];
                                                                                                                    nArray3[ai.llIIlIIIl[0]] = llIIlIIIl[37];
                                                                                                                    if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block13;
                                                                                                                }
                                                                                                                int[] nArray = new int[llIIlIIIl[1]];
                                                                                                                nArray[ai.llIIlIIIl[0]] = llIIlIIIl[38];
                                                                                                                if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block15;
                                                                                                                int[] nArray4 = new int[llIIlIIIl[1]];
                                                                                                                nArray4[ai.llIIlIIIl[0]] = llIIlIIIl[38];
                                                                                                                if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block13;
                                                                                                            }
                                                                                                            int[] nArray = new int[llIIlIIIl[1]];
                                                                                                            nArray[ai.llIIlIIIl[0]] = llIIlIIIl[36];
                                                                                                            if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                                                                                            int[] nArray5 = new int[llIIlIIIl[1]];
                                                                                                            nArray5[ai.llIIlIIIl[0]] = llIIlIIIl[36];
                                                                                                            if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) break block13;
                                                                                                        }
                                                                                                        int[] nArray = new int[llIIlIIIl[1]];
                                                                                                        nArray[ai.llIIlIIIl[0]] = llIIlIIIl[40];
                                                                                                        if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                                                                                        int[] nArray6 = new int[llIIlIIIl[1]];
                                                                                                        nArray6[ai.llIIlIIIl[0]] = llIIlIIIl[40];
                                                                                                        if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block13;
                                                                                                    }
                                                                                                    int[] nArray = new int[llIIlIIIl[1]];
                                                                                                    nArray[ai.llIIlIIIl[0]] = llIIlIIIl[39];
                                                                                                    if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                                                                                                    int[] nArray7 = new int[llIIlIIIl[1]];
                                                                                                    nArray7[ai.llIIlIIIl[0]] = llIIlIIIl[39];
                                                                                                    if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray7) ? 1 : 0)) break block13;
                                                                                                }
                                                                                                int[] nArray = new int[llIIlIIIl[1]];
                                                                                                nArray[ai.llIIlIIIl[0]] = llIIlIIIl[35];
                                                                                                if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block19;
                                                                                                int[] nArray8 = new int[llIIlIIIl[1]];
                                                                                                nArray8[ai.llIIlIIIl[0]] = llIIlIIIl[35];
                                                                                                if (!ai.lIlIlIIlIIlI(Equipment.contains((int[])nArray8) ? 1 : 0)) break block13;
                                                                                            }
                                                                                            int[] nArray = new int[llIIlIIIl[1]];
                                                                                            nArray[ai.llIIlIIIl[0]] = llIIlIIIl[63];
                                                                                            if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                                                            int[] nArray9 = new int[llIIlIIIl[1]];
                                                                                            nArray9[ai.llIIlIIIl[0]] = llIIlIIIl[63];
                                                                                            if (!ai.lIlIlIIlIIlI(Equipment.contains((int[])nArray9) ? 1 : 0)) break block13;
                                                                                        }
                                                                                        int[] nArray = new int[llIIlIIIl[1]];
                                                                                        nArray[ai.llIIlIIIl[0]] = llIIlIIIl[13];
                                                                                        if (!ai.lIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                                                                                        int[] nArray10 = new int[llIIlIIIl[1]];
                                                                                        nArray10[ai.llIIlIIIl[0]] = llIIlIIIl[13];
                                                                                        if (!ai.lIlIlIIlIIlI(Bank.contains((int[])nArray10) ? 1 : 0)) break block13;
                                                                                    }
                                                                                    n4 = llIIlIIIl[1];

                                                                                    if (((0xB7 ^ 0xAD) & ~(0x30 ^ 0x2A)) >= 0) return n4 != 0;
                                                                                    return false;
                                                                                }
                                                                                n4 = llIIlIIIl[0];
                                                                                return n4 != 0;
                                                                            }
                                                                            if ((!ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[22]) || ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2])) && (!ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2]) || !ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[2]) || !ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[2]))) break block22;
                                                                            int[] nArray = new int[llIIlIIIl[1]];
                                                                            nArray[ai.llIIlIIIl[0]] = llIIlIIIl[19];
                                                                            if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                                                                            int[] nArray11 = new int[llIIlIIIl[1]];
                                                                            nArray11[ai.llIIlIIIl[0]] = llIIlIIIl[19];
                                                                            if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                                                        }
                                                                        int[] nArray = new int[llIIlIIIl[1]];
                                                                        nArray[ai.llIIlIIIl[0]] = llIIlIIIl[55];
                                                                        if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block25;
                                                                        int[] nArray12 = new int[llIIlIIIl[1]];
                                                                        nArray12[ai.llIIlIIIl[0]] = llIIlIIIl[55];
                                                                        if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray12) ? 1 : 0)) break block24;
                                                                    }
                                                                    int[] nArray = new int[llIIlIIIl[1]];
                                                                    nArray[ai.llIIlIIIl[0]] = llIIlIIIl[57];
                                                                    if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block26;
                                                                    int[] nArray13 = new int[llIIlIIIl[1]];
                                                                    nArray13[ai.llIIlIIIl[0]] = llIIlIIIl[57];
                                                                    if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray13) ? 1 : 0)) break block24;
                                                                }
                                                                int[] nArray = new int[llIIlIIIl[1]];
                                                                nArray[ai.llIIlIIIl[0]] = llIIlIIIl[53];
                                                                if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block27;
                                                                int[] nArray14 = new int[llIIlIIIl[1]];
                                                                nArray14[ai.llIIlIIIl[0]] = llIIlIIIl[53];
                                                                if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray14) ? 1 : 0)) break block24;
                                                            }
                                                            int[] nArray = new int[llIIlIIIl[1]];
                                                            nArray[ai.llIIlIIIl[0]] = llIIlIIIl[59];
                                                            if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block28;
                                                            int[] nArray15 = new int[llIIlIIIl[1]];
                                                            nArray15[ai.llIIlIIIl[0]] = llIIlIIIl[59];
                                                            if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray15) ? 1 : 0)) break block24;
                                                        }
                                                        int[] nArray = new int[llIIlIIIl[1]];
                                                        nArray[ai.llIIlIIIl[0]] = llIIlIIIl[61];
                                                        if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block29;
                                                        int[] nArray16 = new int[llIIlIIIl[1]];
                                                        nArray16[ai.llIIlIIIl[0]] = llIIlIIIl[61];
                                                        if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray16) ? 1 : 0)) break block24;
                                                    }
                                                    int[] nArray = new int[llIIlIIIl[1]];
                                                    nArray[ai.llIIlIIIl[0]] = llIIlIIIl[63];
                                                    if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block30;
                                                    int[] nArray17 = new int[llIIlIIIl[1]];
                                                    nArray17[ai.llIIlIIIl[0]] = llIIlIIIl[63];
                                                    if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray17) ? 1 : 0)) break block24;
                                                }
                                                int[] nArray = new int[llIIlIIIl[1]];
                                                nArray[ai.llIIlIIIl[0]] = llIIlIIIl[13];
                                                if (ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    n3 = llIIlIIIl[1];

                                                    if (-1 < (57 + 23 - 30 + 144 ^ 56 + 60 - 42 + 124)) return n3 != 0;
                                                    return ((2 ^ (0x6B ^ 0x2B)) & (123 + 21 - -60 + 50 ^ 127 + 151 - 114 + 24 ^ -1)) != 0;
                                                }
                                            }
                                            n3 = llIIlIIIl[0];
                                            return n3 != 0;
                                        }
                                        int[] nArray = new int[llIIlIIIl[1]];
                                        nArray[ai.llIIlIIIl[0]] = llIIlIIIl[18];
                                        if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block31;
                                        int[] nArray18 = new int[llIIlIIIl[1]];
                                        nArray18[ai.llIIlIIIl[0]] = llIIlIIIl[18];
                                        if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray18) ? 1 : 0)) break block32;
                                    }
                                    int[] nArray = new int[llIIlIIIl[1]];
                                    nArray[ai.llIIlIIIl[0]] = llIIlIIIl[55];
                                    if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block33;
                                    int[] nArray19 = new int[llIIlIIIl[1]];
                                    nArray19[ai.llIIlIIIl[0]] = llIIlIIIl[55];
                                    if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray19) ? 1 : 0)) break block32;
                                }
                                int[] nArray = new int[llIIlIIIl[1]];
                                nArray[ai.llIIlIIIl[0]] = llIIlIIIl[57];
                                if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block34;
                                int[] nArray20 = new int[llIIlIIIl[1]];
                                nArray20[ai.llIIlIIIl[0]] = llIIlIIIl[57];
                                if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray20) ? 1 : 0)) break block32;
                            }
                            int[] nArray = new int[llIIlIIIl[1]];
                            nArray[ai.llIIlIIIl[0]] = llIIlIIIl[53];
                            if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block35;
                            int[] nArray21 = new int[llIIlIIIl[1]];
                            nArray21[ai.llIIlIIIl[0]] = llIIlIIIl[53];
                            if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray21) ? 1 : 0)) break block32;
                        }
                        int[] nArray = new int[llIIlIIIl[1]];
                        nArray[ai.llIIlIIIl[0]] = llIIlIIIl[59];
                        if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block36;
                        int[] nArray22 = new int[llIIlIIIl[1]];
                        nArray22[ai.llIIlIIIl[0]] = llIIlIIIl[59];
                        if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray22) ? 1 : 0)) break block32;
                    }
                    int[] nArray = new int[llIIlIIIl[1]];
                    nArray[ai.llIIlIIIl[0]] = llIIlIIIl[61];
                    if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block37;
                    int[] nArray23 = new int[llIIlIIIl[1]];
                    nArray23[ai.llIIlIIIl[0]] = llIIlIIIl[61];
                    if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray23) ? 1 : 0)) break block32;
                }
                int[] nArray = new int[llIIlIIIl[1]];
                nArray[ai.llIIlIIIl[0]] = llIIlIIIl[63];
                if (!ai.lIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block38;
                int[] nArray24 = new int[llIIlIIIl[1]];
                nArray24[ai.llIIlIIIl[0]] = llIIlIIIl[63];
                if (!ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray24) ? 1 : 0)) break block32;
            }
            int[] nArray = new int[llIIlIIIl[1]];
            nArray[ai.llIIlIIIl[0]] = llIIlIIIl[13];
            if (ai.lIlIlIIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = llIIlIIIl[1];

                if (((0x8D ^ 0xBB) & ~(0x7E ^ 0x48)) != 2) return n2 != 0;
                return false;
            }
        }
        n2 = llIIlIIIl[0];
        return n2 != 0;
    }

    private static boolean lIlIlIIllIlI(int n2, int n3) {
        return n2 == n3;
    }

    public static void am() {
        if (ai.lIlIlIIlIlII(cO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIIllll[llIIlIIIl[26]];
            Movement.walkTo((WorldPoint)cm);

            Time.sleepTicks((int)llIIlIIIl[1]);

        }
        if (ai.lIlIlIIlIIlI(cO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIIllll[llIIlIIIl[27]];
            if (ai.lIlIlIIllIIl(Players.getLocal().getInteracting())) {
                NPC lIllIIllIIIlll = NPCs.getNearest(nPC -> {
                    int n2;
                    if (ai.lIlIlIIlIIlI(nPC.getName().contains(llIIIllll[llIIlIIIl[87]]) ? 1 : 0) && ai.lIlIlIIllIIl(nPC.getInteracting()) && ai.lIlIlIIlIlII(nPC.isDead() ? 1 : 0)) {
                        n2 = llIIlIIIl[1];

                        }
                    } else {
                        n2 = llIIlIIIl[0];
                    }
                    return n2 != 0;
                });
                String[] stringArray = new String[llIIlIIIl[5]];
                stringArray[ai.llIIlIIIl[0]] = llIIIllll[llIIlIIIl[28]];
                stringArray[ai.llIIlIIIl[1]] = llIIIllll[llIIlIIIl[15]];
                List lIllIIllIIIllI = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                    boolean bl;
                    if (ai.lIlIlIIlllIl(nPC.getInteracting(), Players.getLocal())) {
                        bl = llIIlIIIl[1];

                        if (2 == 0) {
                            return false;
                        }
                    } else {
                        bl = llIIlIIIl[0];
                    }
                    return bl;
                }).collect(Collectors.toList());
                if (ai.lIlIlIIlIlII(lIllIIllIIIllI.isEmpty() ? 1 : 0)) {
                    ((NPC)lIllIIllIIIllI.get(llIIlIIIl[0])).interact(llIIIllll[llIIlIIIl[29]]);
                    Time.sleepTicks((int)llIIlIIIl[5]);

                }
                if (ai.lIlIlIIlIllI(lIllIIllIIIlll) && ai.lIlIlIIlIlII(Players.getLocal().isMoving() ? 1 : 0) && ai.lIlIlIIlIIlI(lIllIIllIIIllI.isEmpty() ? 1 : 0)) {
                    lIllIIllIIIlll.interact(llIIIllll[llIIlIIIl[30]]);
                    Time.sleepTicks((int)llIIlIIIl[5]);

                }
            }
            if (ai.lIlIlIIlIllI(Players.getLocal().getInteracting())) {
                Time.sleepTicks((int)llIIlIIIl[8]);

            }
        }
    }

    @Override
    public String ag() {
        return llIIIllll[llIIlIIIl[86]];
    }

    private static boolean lIlIlIIlIlll(int n2) {
        return n2 > 0;
    }

    private static void lIlIlIIIllIl() {
        llIIIllll = new String[llIIlIIIl[100]];
        ai.llIIIllll[ai.llIIlIIIl[0]] = "Buying items";
        ai.llIIIllll[ai.llIIlIIIl[1]] = "Finished buying items, switching back to melee training";
        ai.llIIIllll[ai.llIIlIIIl[5]] = "Navigating to bank";
        ai.llIIIllll[ai.llIIlIIIl[6]] = "Handling banking";
        ai.llIIIllll[ai.llIIlIIIl[8]] = "We are missing supplies, switching to BUYING";
        ai.llIIIllll[ai.llIIlIIIl[12]] = "Iron scimitar";
        ai.llIIIllll[ai.llIIlIIIl[16]] = "Steel scimitar";
        ai.llIIIllll[ai.llIIlIIIl[17]] = "Mithril scimitar";
        ai.llIIIllll[ai.llIIlIIIl[21]] = "Eat";
        ai.llIIIllll[ai.llIIlIIIl[24]] = "Iron scimitar";
        ai.llIIIllll[ai.llIIlIIIl[23]] = "Steel scimitar";
        ai.llIIIllll[ai.llIIlIIIl[25]] = "Mithril scimitar";
        ai.llIIIllll[ai.llIIlIIIl[26]] = "Walking to cow area";
        ai.llIIIllll[ai.llIIlIIIl[27]] = "Killing cows";
        ai.llIIIllll[ai.llIIlIIIl[28]] = "Cow";
        ai.llIIIllll[ai.llIIlIIIl[15]] = "cow";
        ai.llIIIllll[ai.llIIlIIIl[29]] = "Attack";
        ai.llIIIllll[ai.llIIlIIIl[30]] = "Attack";
        ai.llIIIllll[ai.llIIlIIIl[31]] = "Auto retaliate";
        ai.llIIIllll[ai.llIIlIIIl[32]] = ai.lIlIlIIIIIlI("5E0gOgno11A=", "AaMTp");
        ai.llIIIllll[ai.llIIlIIIl[42]] = "Iron scimitar";
        ai.llIIIllll[ai.llIIlIIIl[43]] = "Iron scimitar";
        ai.llIIIllll[ai.llIIlIIIl[44]] = "Wield";
        ai.llIIIllll[ai.llIIlIIIl[45]] = "Steel scimitar";
        ai.llIIIllll[ai.llIIlIIIl[46]] = "Steel scimitar";
        ai.llIIIllll[ai.llIIlIIIl[47]] = "Wield";
        ai.llIIIllll[ai.llIIlIIIl[49]] = "Mithril scimitar";
        ai.llIIIllll[ai.llIIlIIIl[50]] = "Mithril scimitar";
        ai.llIIIllll[ai.llIIlIIIl[51]] = "Wield";
        ai.llIIIllll[ai.llIIlIIIl[52]] = "Wield";
        ai.llIIIllll[ai.llIIlIIIl[48]] = "Wield";
        ai.llIIIllll[ai.llIIlIIIl[54]] = "Wear";
        ai.llIIIllll[ai.llIIlIIIl[56]] = "Wear";
        ai.llIIIllll[ai.llIIlIIIl[58]] = "Wear";
        ai.llIIIllll[ai.llIIlIIIl[60]] = "Wear";
        ai.llIIIllll[ai.llIIlIIIl[62]] = "Wear";
        ai.llIIIllll[ai.llIIlIIIl[64]] = "Wear";
        ai.llIIIllll[ai.llIIlIIIl[86]] = "60/70/75 Melee";
        ai.llIIIllll[ai.llIIlIIIl[87]] = "Cow";
    }

    private static int lIlIlIIIllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public static void Q() {
        d lIllIIllIIIlII;
        int[] nArray = new int[llIIlIIIl[1]];
        nArray[ai.llIIlIIIl[0]] = llIIlIIIl[11];
        if (ai.lIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llIIlIIIl[11], llIIlIIIl[22], llIIlIIIl[66]);
            bx.add(d2);

        }
        int[] nArray2 = new int[llIIlIIIl[1]];
        nArray2[ai.llIIlIIIl[0]] = llIIlIIIl[67];
        if (ai.lIlIlIIlIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIllIIllIIIlII = new DHelper(llIIlIIIl[67], llIIlIIIl[12], llIIlIIIl[66]);
            bx.add(lIllIIllIIIlII);

        }
        int[] nArray3 = new int[llIIlIIIl[1]];
        nArray3[ai.llIIlIIIl[0]] = llIIlIIIl[63];
        if (ai.lIlIlIIlIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIllIIllIIIlII = new DHelper(llIIlIIIl[63], llIIlIIIl[1], llIIlIIIl[68]);
            bx.add(lIllIIllIIIlII);

        }
        int[] nArray4 = new int[llIIlIIIl[1]];
        nArray4[ai.llIIlIIIl[0]] = llIIlIIIl[61];
        if (ai.lIlIlIIlIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIllIIllIIIlII = new DHelper(llIIlIIIl[61], llIIlIIIl[1], llIIlIIIl[69]);
            bx.add(lIllIIllIIIlII);

        }
        int[] nArray5 = new int[llIIlIIIl[1]];
        nArray5[ai.llIIlIIIl[0]] = llIIlIIIl[13];
        if (ai.lIlIlIIlIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIllIIllIIIlII = new DHelper(llIIlIIIl[13], llIIlIIIl[14], llIIlIIIl[70]);
            bx.add(lIllIIllIIIlII);

        }
        if (ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2])) {
            int[] nArray6 = new int[llIIlIIIl[1]];
            nArray6[ai.llIIlIIIl[0]] = llIIlIIIl[53];
            if (ai.lIlIlIIlIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                lIllIIllIIIlII = new DHelper(llIIlIIIl[53], llIIlIIIl[1], llIIlIIIl[71]);
                bx.add(lIllIIllIIIlII);

            }
            int[] nArray7 = new int[llIIlIIIl[1]];
            nArray7[ai.llIIlIIIl[0]] = llIIlIIIl[57];
            if (ai.lIlIlIIlIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                lIllIIllIIIlII = new DHelper(llIIlIIIl[57], llIIlIIIl[1], llIIlIIIl[71]);
                bx.add(lIllIIllIIIlII);

            }
            int[] nArray8 = new int[llIIlIIIl[1]];
            nArray8[ai.llIIlIIIl[0]] = llIIlIIIl[59];
            if (ai.lIlIlIIlIlII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                lIllIIllIIIlII = new DHelper(llIIlIIIl[59], llIIlIIIl[1], llIIlIIIl[71]);
                bx.add(lIllIIllIIIlII);

            }
            int[] nArray9 = new int[llIIlIIIl[1]];
            nArray9[ai.llIIlIIIl[0]] = llIIlIIIl[55];
            if (ai.lIlIlIIlIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                lIllIIllIIIlII = new DHelper(llIIlIIIl[55], llIIlIIIl[1], llIIlIIIl[71]);
                bx.add(lIllIIllIIIlII);

            }
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[2]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[2])) {
            int[] nArray10 = new int[llIIlIIIl[1]];
            nArray10[ai.llIIlIIIl[0]] = llIIlIIIl[20];
            if (ai.lIlIlIIlIlII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                lIllIIllIIIlII = new DHelper(llIIlIIIl[20], llIIlIIIl[1], e.c(llIIlIIIl[72], llIIlIIIl[73]));
                bx.add(lIllIIllIIIlII);

            }
            int[] nArray11 = new int[llIIlIIIl[1]];
            nArray11[ai.llIIlIIIl[0]] = llIIlIIIl[41];
            if (ai.lIlIlIIlIlII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                lIllIIllIIIlII = new DHelper(llIIlIIIl[41], llIIlIIIl[1], e.c(llIIlIIIl[74], llIIlIIIl[75]));
                bx.add(lIllIIllIIIlII);

            }
            int[] nArray12 = new int[llIIlIIIl[1]];
            nArray12[ai.llIIlIIIl[0]] = llIIlIIIl[39];
            if (ai.lIlIlIIlIlII(Bank.contains((int[])nArray12) ? 1 : 0)) {
                lIllIIllIIIlII = new DHelper(llIIlIIIl[39], llIIlIIIl[1], e.c(llIIlIIIl[76], llIIlIIIl[77]));
                bx.add(lIllIIllIIIlII);

            }
            int[] nArray13 = new int[llIIlIIIl[1]];
            nArray13[ai.llIIlIIIl[0]] = llIIlIIIl[36];
            if (ai.lIlIlIIlIlII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                lIllIIllIIIlII = new DHelper(llIIlIIIl[36], llIIlIIIl[1], e.c(llIIlIIIl[76], llIIlIIIl[77]));
                bx.add(lIllIIllIIIlII);

            }
            int[] nArray14 = new int[llIIlIIIl[1]];
            nArray14[ai.llIIlIIIl[0]] = llIIlIIIl[37];
            if (ai.lIlIlIIlIlII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                lIllIIllIIIlII = new DHelper(llIIlIIIl[37], llIIlIIIl[1], e.c(llIIlIIIl[78], llIIlIIIl[79]));
                bx.add(lIllIIllIIIlII);

            }
            int[] nArray15 = new int[llIIlIIIl[1]];
            nArray15[ai.llIIlIIIl[0]] = llIIlIIIl[38];
            if (ai.lIlIlIIlIlII(Bank.contains((int[])nArray15) ? 1 : 0)) {
                lIllIIllIIIlII = new DHelper(llIIlIIIl[38], llIIlIIIl[1], e.c(llIIlIIIl[80], llIIlIIIl[81]));
                bx.add(lIllIIllIIIlII);

            }
            int[] nArray16 = new int[llIIlIIIl[1]];
            nArray16[ai.llIIlIIIl[0]] = llIIlIIIl[40];
            if (ai.lIlIlIIlIlII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                lIllIIllIIIlII = new DHelper(llIIlIIIl[40], llIIlIIIl[1], e.c(llIIlIIIl[82], llIIlIIIl[83]));
                bx.add(lIllIIllIIIlII);

            }
            int[] nArray17 = new int[llIIlIIIl[1]];
            nArray17[ai.llIIlIIIl[0]] = llIIlIIIl[35];
            if (ai.lIlIlIIlIlII(Bank.contains((int[])nArray17) ? 1 : 0)) {
                lIllIIllIIIlII = new DHelper(llIIlIIIl[35], llIIlIIIl[1], e.c(llIIlIIIl[84], llIIlIIIl[85]));
                bx.add(lIllIIllIIIlII);

            }
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[22])) {
            int[] nArray18 = new int[llIIlIIIl[1]];
            nArray18[ai.llIIlIIIl[0]] = llIIlIIIl[19];
            if (ai.lIlIlIIlIlII(Bank.contains((int[])nArray18) ? 1 : 0)) {
                lIllIIllIIIlII = new DHelper(llIIlIIIl[19], llIIlIIIl[1], llIIlIIIl[69]);
                bx.add(lIllIIllIIIlII);

            }
        }
        int[] nArray19 = new int[llIIlIIIl[1]];
        nArray19[ai.llIIlIIIl[0]] = llIIlIIIl[18];
        if (ai.lIlIlIIlIlII(Bank.contains((int[])nArray19) ? 1 : 0) && ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[22]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[48])) {
            lIllIIllIIIlII = new DHelper(llIIlIIIl[18], llIIlIIIl[1], llIIlIIIl[71]);
            bx.add(lIllIIllIIIlII);

        }
    }

    public static void aO() {
        if (ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[23]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[23]) && ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[23]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[23]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[23]) && ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[23]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[42]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[23]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[23]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[42]) && ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[42]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[23]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[42]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[42]) && ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[42]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[48]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[42]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[42]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[48]) && ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[48]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[42]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[48]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[48]) && ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[48]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[22]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[48]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[48]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[22]) && ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[22]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[48]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[22]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[22]) && ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[22]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[65]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[22]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[22]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[65]) && ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[65]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[22]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[65]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[65]) && ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[65]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[2]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[65]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[65]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[2]) && ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[65]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[2]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2]) && ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[2]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[4]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[2]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.STRENGTH), llIIlIIIl[4]) && ai.lIlIlIIlIlIl(Skills.getLevel((Skill)Skill.ATTACK), llIIlIIIl[2]) && ai.lIlIlIIlIIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIlIIIl[3]) && ai.lIlIlIIllIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
    }

    private static boolean lIlIlIIlIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIIllIII(int n2) {
        return n2 < 0;
    }

        return String.valueOf(lIllIIlIllIIIl);
    }

    static {
        ai.lIlIlIIIlllI();
        ai.lIlIlIIIllIl();
        bx = new ArrayList<d>();
        int[] nArray = new int[llIIlIIIl[21]];
        nArray[ai.llIIlIIIl[0]] = llIIlIIIl[18];
        nArray[ai.llIIlIIIl[1]] = llIIlIIIl[19];
        nArray[ai.llIIlIIIl[5]] = llIIlIIIl[55];
        nArray[ai.llIIlIIIl[6]] = llIIlIIIl[57];
        nArray[ai.llIIlIIIl[8]] = llIIlIIIl[53];
        nArray[ai.llIIlIIIl[12]] = llIIlIIIl[59];
        nArray[ai.llIIlIIIl[16]] = llIIlIIIl[61];
        nArray[ai.llIIlIIIl[17]] = llIIlIIIl[63];
        cM = nArray;
        int[] nArray2 = new int[llIIlIIIl[24]];
        nArray2[ai.llIIlIIIl[0]] = llIIlIIIl[20];
        nArray2[ai.llIIlIIIl[1]] = llIIlIIIl[35];
        nArray2[ai.llIIlIIIl[5]] = llIIlIIIl[36];
        nArray2[ai.llIIlIIIl[6]] = llIIlIIIl[37];
        nArray2[ai.llIIlIIIl[8]] = llIIlIIIl[38];
        nArray2[ai.llIIlIIIl[12]] = llIIlIIIl[39];
        nArray2[ai.llIIlIIIl[16]] = llIIlIIIl[40];
        nArray2[ai.llIIlIIIl[17]] = llIIlIIIl[63];
        nArray2[ai.llIIlIIIl[21]] = llIIlIIIl[41];
        mf = nArray2;
        cN = new WorldArea(llIIlIIIl[88], llIIlIIIl[89], llIIlIIIl[25], llIIlIIIl[25], llIIlIIIl[0]);
        cO = new WorldArea(llIIlIIIl[90], llIIlIIIl[91], llIIlIIIl[43], llIIlIIIl[29], llIIlIIIl[0]);
        cP = new WorldArea(llIIlIIIl[92], llIIlIIIl[93], llIIlIIIl[94], llIIlIIIl[48], llIIlIIIl[0]);
        cQ = new WorldPoint(llIIlIIIl[95], llIIlIIIl[96], llIIlIIIl[0]);
        cm = new WorldPoint(llIIlIIIl[97], llIIlIIIl[89], llIIlIIIl[0]);
        cR = new WorldPoint(llIIlIIIl[98], llIIlIIIl[99], llIIlIIIl[0]);
    }

    private static boolean lIlIlIIlIllI(Object object) {
        return object != null;
    }

    @Override
    public int af() {
        try {
            ai.aJ();

        }
        catch (Exception lIllIIllIIIIlI) {
            lIllIIllIIIIlI.printStackTrace();
        }
        
        }
        return llIIlIIIl[0];
    }
}

