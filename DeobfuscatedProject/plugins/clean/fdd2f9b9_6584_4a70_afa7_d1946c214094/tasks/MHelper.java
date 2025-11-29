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
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.BHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.IHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.KHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.LHelper;
import gg.squire.account.AccBuilderRogues;
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
implements G {
    public static  List<d> bv;

    public static  boolean bt;

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
                                                                                                                                            if (!m.llllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[7]) || !m.llllllllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIllIIl[41]) || !m.llllllllIIIl(Skills.getLevel((Skill)Skill.DEFENCE), lIIlIllIIl[36])) break block16;
                                                                                                                                            int[] nArray = new int[lIIlIllIIl[1]];
                                                                                                                                            nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[9];
                                                                                                                                            if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block17;
                                                                                                                                            int[] nArray2 = new int[lIIlIllIIl[1]];
                                                                                                                                            nArray2[m.lIIlIllIIl[0]] = lIIlIllIIl[9];
                                                                                                                                            if (!m.lllllllIllII(Equipment.contains((int[])nArray2) ? 1 : 0)) break block18;
                                                                                                                                        }
                                                                                                                                        int[] nArray = new int[lIIlIllIIl[1]];
                                                                                                                                        nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[10];
                                                                                                                                        if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block19;
                                                                                                                                        int[] nArray3 = new int[lIIlIllIIl[1]];
                                                                                                                                        nArray3[m.lIIlIllIIl[0]] = lIIlIllIIl[10];
                                                                                                                                        if (!m.lllllllIllII(Equipment.contains((int[])nArray3) ? 1 : 0)) break block18;
                                                                                                                                    }
                                                                                                                                    int[] nArray = new int[lIIlIllIIl[1]];
                                                                                                                                    nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[18];
                                                                                                                                    if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                                                                                                    int[] nArray4 = new int[lIIlIllIIl[1]];
                                                                                                                                    nArray4[m.lIIlIllIIl[0]] = lIIlIllIIl[18];
                                                                                                                                    if (!m.lllllllIllII(Equipment.contains((int[])nArray4) ? 1 : 0)) break block18;
                                                                                                                                }
                                                                                                                                int[] nArray = new int[lIIlIllIIl[1]];
                                                                                                                                nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[20];
                                                                                                                                if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                                                                                                                                int[] nArray5 = new int[lIIlIllIIl[1]];
                                                                                                                                nArray5[m.lIIlIllIIl[0]] = lIIlIllIIl[20];
                                                                                                                                if (!m.lllllllIllII(Equipment.contains((int[])nArray5) ? 1 : 0)) break block18;
                                                                                                                            }
                                                                                                                            int[] nArray = new int[lIIlIllIIl[1]];
                                                                                                                            nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[11];
                                                                                                                            if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                                                                            int[] nArray6 = new int[lIIlIllIIl[1]];
                                                                                                                            nArray6[m.lIIlIllIIl[0]] = lIIlIllIIl[11];
                                                                                                                            if (!m.lllllllIllII(Equipment.contains((int[])nArray6) ? 1 : 0)) break block18;
                                                                                                                        }
                                                                                                                        int[] nArray = new int[lIIlIllIIl[1]];
                                                                                                                        nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[8];
                                                                                                                        if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                                                                                                        int[] nArray7 = new int[lIIlIllIIl[1]];
                                                                                                                        nArray7[m.lIIlIllIIl[0]] = lIIlIllIIl[8];
                                                                                                                        if (!m.lllllllIllII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block18;
                                                                                                                    }
                                                                                                                    int[] nArray = new int[lIIlIllIIl[1]];
                                                                                                                    nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[26];
                                                                                                                    if (m.lllllllIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                                                        n5 = lIIlIllIIl[1];

                                                                                                                        if (-1 < ((0x65 ^ 0x46) & ~(3 ^ 0x20))) return n5 != 0;
                                                                                                                        return false;
                                                                                                                    }
                                                                                                                }
                                                                                                                n5 = lIIlIllIIl[0];
                                                                                                                return n5 != 0;
                                                                                                            }
                                                                                                            if (!m.llllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[7]) || !m.llllllllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIllIIl[41]) || !m.lllllllIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIIlIllIIl[36])) break block24;
                                                                                                            int[] nArray = new int[lIIlIllIIl[1]];
                                                                                                            nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[9];
                                                                                                            if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
                                                                                                            int[] nArray8 = new int[lIIlIllIIl[1]];
                                                                                                            nArray8[m.lIIlIllIIl[0]] = lIIlIllIIl[9];
                                                                                                            if (!m.lllllllIllII(Equipment.contains((int[])nArray8) ? 1 : 0)) break block26;
                                                                                                        }
                                                                                                        int[] nArray = new int[lIIlIllIIl[1]];
                                                                                                        nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[19];
                                                                                                        if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block27;
                                                                                                        int[] nArray9 = new int[lIIlIllIIl[1]];
                                                                                                        nArray9[m.lIIlIllIIl[0]] = lIIlIllIIl[19];
                                                                                                        if (!m.lllllllIllII(Equipment.contains((int[])nArray9) ? 1 : 0)) break block26;
                                                                                                    }
                                                                                                    int[] nArray = new int[lIIlIllIIl[1]];
                                                                                                    nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[18];
                                                                                                    if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                                                                                                    int[] nArray10 = new int[lIIlIllIIl[1]];
                                                                                                    nArray10[m.lIIlIllIIl[0]] = lIIlIllIIl[18];
                                                                                                    if (!m.lllllllIllII(Equipment.contains((int[])nArray10) ? 1 : 0)) break block26;
                                                                                                }
                                                                                                int[] nArray = new int[lIIlIllIIl[1]];
                                                                                                nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[20];
                                                                                                if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block29;
                                                                                                int[] nArray11 = new int[lIIlIllIIl[1]];
                                                                                                nArray11[m.lIIlIllIIl[0]] = lIIlIllIIl[20];
                                                                                                if (!m.lllllllIllII(Equipment.contains((int[])nArray11) ? 1 : 0)) break block26;
                                                                                            }
                                                                                            int[] nArray = new int[lIIlIllIIl[1]];
                                                                                            nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[11];
                                                                                            if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block30;
                                                                                            int[] nArray12 = new int[lIIlIllIIl[1]];
                                                                                            nArray12[m.lIIlIllIIl[0]] = lIIlIllIIl[11];
                                                                                            if (!m.lllllllIllII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block26;
                                                                                        }
                                                                                        int[] nArray = new int[lIIlIllIIl[1]];
                                                                                        nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[8];
                                                                                        if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                                        int[] nArray13 = new int[lIIlIllIIl[1]];
                                                                                        nArray13[m.lIIlIllIIl[0]] = lIIlIllIIl[8];
                                                                                        if (!m.lllllllIllII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block26;
                                                                                    }
                                                                                    int[] nArray = new int[lIIlIllIIl[1]];
                                                                                    nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[26];
                                                                                    if (m.lllllllIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                        n4 = lIIlIllIIl[1];

                                                                                        if ((39 + 119 - 107 + 133 ^ 83 + 174 - 119 + 50) > 0) return n4 != 0;
                                                                                        return ((0x5B ^ 0x66 ^ (0x1E ^ 0x77)) & (0x3D ^ 0x2C ^ (0xD1 ^ 0x94) ^ -1)) != 0;
                                                                                    }
                                                                                }
                                                                                n4 = lIIlIllIIl[0];
                                                                                return n4 != 0;
                                                                            }
                                                                            if (!m.llllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[27]) || !m.lllllllIllIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[7])) break block32;
                                                                            int[] nArray = new int[lIIlIllIIl[1]];
                                                                            nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[17];
                                                                            if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                            int[] nArray14 = new int[lIIlIllIIl[1]];
                                                                            nArray14[m.lIIlIllIIl[0]] = lIIlIllIIl[17];
                                                                            if (!m.lllllllIllII(Equipment.contains((int[])nArray14) ? 1 : 0)) break block34;
                                                                        }
                                                                        int[] nArray = new int[lIIlIllIIl[1]];
                                                                        nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[19];
                                                                        if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block35;
                                                                        int[] nArray15 = new int[lIIlIllIIl[1]];
                                                                        nArray15[m.lIIlIllIIl[0]] = lIIlIllIIl[19];
                                                                        if (!m.lllllllIllII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block34;
                                                                    }
                                                                    int[] nArray = new int[lIIlIllIIl[1]];
                                                                    nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[18];
                                                                    if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block36;
                                                                    int[] nArray16 = new int[lIIlIllIIl[1]];
                                                                    nArray16[m.lIIlIllIIl[0]] = lIIlIllIIl[18];
                                                                    if (!m.lllllllIllII(Equipment.contains((int[])nArray16) ? 1 : 0)) break block34;
                                                                }
                                                                int[] nArray = new int[lIIlIllIIl[1]];
                                                                nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[20];
                                                                if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block37;
                                                                int[] nArray17 = new int[lIIlIllIIl[1]];
                                                                nArray17[m.lIIlIllIIl[0]] = lIIlIllIIl[20];
                                                                if (!m.lllllllIllII(Equipment.contains((int[])nArray17) ? 1 : 0)) break block34;
                                                            }
                                                            int[] nArray = new int[lIIlIllIIl[1]];
                                                            nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[16];
                                                            if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block38;
                                                            int[] nArray18 = new int[lIIlIllIIl[1]];
                                                            nArray18[m.lIIlIllIIl[0]] = lIIlIllIIl[16];
                                                            if (!m.lllllllIllII(Equipment.contains((int[])nArray18) ? 1 : 0)) break block34;
                                                        }
                                                        int[] nArray = new int[lIIlIllIIl[1]];
                                                        nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[26];
                                                        if (m.lllllllIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                            n3 = lIIlIllIIl[1];

                                                            if (((0xAC ^ 0x96 ^ (0x70 ^ 0x7B)) & (146 + 41 - 151 + 116 ^ 128 + 56 - 110 + 95 ^ -1)) == 0) return n3 != 0;
                                                            return ((0xB4 ^ 0x81 ^ (0x2C ^ 0xF)) & (0xF6 ^ 0x82 ^ (0x26 ^ 0x44) ^ -1)) != 0;
                                                        }
                                                    }
                                                    n3 = lIIlIllIIl[0];
                                                    return n3 != 0;
                                                }
                                                int[] nArray = new int[lIIlIllIIl[1]];
                                                nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[17];
                                                if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block39;
                                                int[] nArray19 = new int[lIIlIllIIl[1]];
                                                nArray19[m.lIIlIllIIl[0]] = lIIlIllIIl[17];
                                                if (!m.lllllllIllII(Equipment.contains((int[])nArray19) ? 1 : 0)) break block40;
                                            }
                                            int[] nArray = new int[lIIlIllIIl[1]];
                                            nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[19];
                                            if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block41;
                                            int[] nArray20 = new int[lIIlIllIIl[1]];
                                            nArray20[m.lIIlIllIIl[0]] = lIIlIllIIl[19];
                                            if (!m.lllllllIllII(Equipment.contains((int[])nArray20) ? 1 : 0)) break block40;
                                        }
                                        int[] nArray = new int[lIIlIllIIl[1]];
                                        nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[18];
                                        if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block42;
                                        int[] nArray21 = new int[lIIlIllIIl[1]];
                                        nArray21[m.lIIlIllIIl[0]] = lIIlIllIIl[18];
                                        if (!m.lllllllIllII(Equipment.contains((int[])nArray21) ? 1 : 0)) break block40;
                                    }
                                    int[] nArray = new int[lIIlIllIIl[1]];
                                    nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[20];
                                    if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block43;
                                    int[] nArray22 = new int[lIIlIllIIl[1]];
                                    nArray22[m.lIIlIllIIl[0]] = lIIlIllIIl[20];
                                    if (!m.lllllllIllII(Equipment.contains((int[])nArray22) ? 1 : 0)) break block40;
                                }
                                int[] nArray = new int[lIIlIllIIl[1]];
                                nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[15];
                                if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block44;
                                int[] nArray23 = new int[lIIlIllIIl[1]];
                                nArray23[m.lIIlIllIIl[0]] = lIIlIllIIl[15];
                                if (!m.lllllllIllII(Equipment.contains((int[])nArray23) ? 1 : 0)) break block40;
                            }
                            int[] nArray = new int[lIIlIllIIl[1]];
                            nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[12];
                            if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                            int[] nArray24 = new int[lIIlIllIIl[1]];
                            nArray24[m.lIIlIllIIl[0]] = lIIlIllIIl[12];
                            if (!m.lllllllIllII(Equipment.contains((int[])nArray24) ? 1 : 0)) break block40;
                        }
                        int[] nArray = new int[lIIlIllIIl[1]];
                        nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[13];
                        if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block46;
                        int[] nArray25 = new int[lIIlIllIIl[1]];
                        nArray25[m.lIIlIllIIl[0]] = lIIlIllIIl[13];
                        if (!m.lllllllIllII(Equipment.contains((int[])nArray25) ? 1 : 0)) break block40;
                    }
                    int[] nArray = new int[lIIlIllIIl[1]];
                    nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[14];
                    if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block47;
                    int[] nArray26 = new int[lIIlIllIIl[1]];
                    nArray26[m.lIIlIllIIl[0]] = lIIlIllIIl[14];
                    if (!m.lllllllIllII(Equipment.contains((int[])nArray26) ? 1 : 0)) break block40;
                }
                int[] nArray = new int[lIIlIllIIl[1]];
                nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[16];
                if (!m.lllllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block48;
                int[] nArray27 = new int[lIIlIllIIl[1]];
                nArray27[m.lIIlIllIIl[0]] = lIIlIllIIl[16];
                if (!m.lllllllIllII(Equipment.contains((int[])nArray27) ? 1 : 0)) break block40;
            }
            int[] nArray = new int[lIIlIllIIl[1]];
            nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[26];
            if (m.lllllllIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIIlIllIIl[1];

                if (null == null) return n2 != 0;
                return (2 & (2 ^ -1)) != 0;
            }
        }
        n2 = lIIlIllIIl[0];
        return n2 != 0;
    }

    private static boolean lllllllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (m.llllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[7])) {
            bl = lIIlIllIIl[1];

            }
        } else {
            bl = lIIlIllIIl[0];
        }
        return bl;
    }

    private static void af() {
        block30: {
            d var1;
            block29: {
                block28: {
                    block27: {
                        Object var2;
                        block25: {
                            block26: {
                                if (!m.lllllllIllIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[27])) break block25;
                                int[] nArray = new int[lIIlIllIIl[1]];
                                nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[12];
                                if (m.lllllllIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    d d2 = new DHelper(lIIlIllIIl[12], lIIlIllIIl[1], lIIlIllIIl[46]);
                                    bv.add(d2);

                                }
                                int[] nArray2 = new int[lIIlIllIIl[1]];
                                nArray2[m.lIIlIllIIl[0]] = lIIlIllIIl[13];
                                if (m.lllllllIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    var2 = new DHelper(lIIlIllIIl[13], lIIlIllIIl[1], lIIlIllIIl[46]);
                                    bv.add((DHelper) ar2);

                                }
                                int[] nArray3 = new int[lIIlIllIIl[1]];
                                nArray3[m.lIIlIllIIl[0]] = lIIlIllIIl[14];
                                if (m.lllllllIlllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    var2 = new DHelper(lIIlIllIIl[14], lIIlIllIIl[1], lIIlIllIIl[46]);
                                    bv.add((DHelper) ar2);

                                }
                                int[] nArray4 = new int[lIIlIllIIl[1]];
                                nArray4[m.lIIlIllIIl[0]] = lIIlIllIIl[15];
                                if (!m.lllllllIllII(Bank.contains((int[])nArray4) ? 1 : 0)) break block26;
                                int[] nArray5 = new int[lIIlIllIIl[1]];
                                nArray5[m.lIIlIllIIl[0]] = lIIlIllIIl[15];
                                if (!m.lllllllIllIl(Bank.getFirst((int[])nArray5).getQuantity(), lIIlIllIIl[47])) break block25;
                            }
                            var2 = new DHelper(lIIlIllIIl[15], lIIlIllIIl[48], lIIlIllIIl[35]);
                            bv.add((DHelper) ar2);

                        }
                        int[] nArray = new int[lIIlIllIIl[1]];
                        nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[18];
                        if (m.lllllllIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            var2 = new DHelper(lIIlIllIIl[18], lIIlIllIIl[1], lIIlIllIIl[49]);
                            bv.add((DHelper) ar2);

                        }
                        int[] nArray6 = new int[lIIlIllIIl[1]];
                        nArray6[m.lIIlIllIIl[0]] = lIIlIllIIl[19];
                        if (m.lllllllIlllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            var2 = new DHelper(lIIlIllIIl[19], lIIlIllIIl[1], lIIlIllIIl[49]);
                            bv.add((DHelper) ar2);

                        }
                        int[] nArray7 = new int[lIIlIllIIl[1]];
                        nArray7[m.lIIlIllIIl[0]] = lIIlIllIIl[17];
                        if (m.lllllllIlllI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            var2 = new DHelper(lIIlIllIIl[17], lIIlIllIIl[1], lIIlIllIIl[49]);
                            bv.add((DHelper) ar2);

                        }
                        int[] nArray8 = new int[lIIlIllIIl[1]];
                        nArray8[m.lIIlIllIIl[0]] = lIIlIllIIl[20];
                        if (m.lllllllIlllI(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            var2 = new DHelper(lIIlIllIIl[20], lIIlIllIIl[1], lIIlIllIIl[50]);
                            bv.add((DHelper) ar2);

                        }
                        if (m.lllllllIllIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[7])) {
                            int[] nArray9 = new int[lIIlIllIIl[1]];
                            nArray9[m.lIIlIllIIl[0]] = lIIlIllIIl[16];
                            if (m.lllllllIlllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                var2 = new DHelper(lIIlIllIIl[16], lIIlIllIIl[51], lIIlIllIIl[42]);
                                bv.add((DHelper) ar2);

                            }
                        }
                        int[] nArray10 = new int[lIIlIllIIl[1]];
                        nArray10[m.lIIlIllIIl[0]] = lIIlIllIIl[9];
                        if (m.lllllllIlllI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            var2 = new DHelper(lIIlIllIIl[9], lIIlIllIIl[1], lIIlIllIIl[52]);
                            bv.add((DHelper) ar2);

                        }
                        int[] nArray11 = new int[lIIlIllIIl[1]];
                        nArray11[m.lIIlIllIIl[0]] = lIIlIllIIl[10];
                        if (m.lllllllIlllI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                            var2 = new DHelper(lIIlIllIIl[10], lIIlIllIIl[1], lIIlIllIIl[52]);
                            bv.add((DHelper) ar2);

                        }
                        if (m.llllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[7])) {
                            int[] nArray12 = new int[lIIlIllIIl[1]];
                            nArray12[m.lIIlIllIIl[0]] = lIIlIllIIl[11];
                            if (m.lllllllIlllI(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                var2 = new DHelper(lIIlIllIIl[11], lIIlIllIIl[48], lIIlIllIIl[53]);
                                bv.add((DHelper) ar2);

                            }
                        }
                        int[] nArray13 = new int[lIIlIllIIl[1]];
                        nArray13[m.lIIlIllIIl[0]] = lIIlIllIIl[22];
                        if (m.lllllllIlllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                            var2 = new DHelper(lIIlIllIIl[22], lIIlIllIIl[1], i.bq);
                            bv.add((DHelper) ar2);

                        }
                        int[] nArray14 = new int[lIIlIllIIl[1]];
                        nArray14[m.lIIlIllIIl[0]] = lIIlIllIIl[26];
                        if (m.lllllllIlllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                            var2 = new DHelper(lIIlIllIIl[26], lIIlIllIIl[54], lIIlIllIIl[55]);
                            bv.add((DHelper) ar2);

                        }
                        if (m.lllllllIlllI(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(lIIlIlIlll[lIIlIllIIl[31]]))) ? 1 : 0)) {
                            var1 = new DHelper(lIIlIllIIl[56], lIIlIllIIl[5], lIIlIllIIl[57]);
                            bv.add(var1);

                        }
                        int[] nArray15 = new int[lIIlIllIIl[1]];
                        nArray15[m.lIIlIllIIl[0]] = lIIlIllIIl[58];
                        if (!m.lllllllIllII(Bank.contains((int[])nArray15) ? 1 : 0)) break block27;
                        int[] nArray16 = new int[lIIlIllIIl[1]];
                        nArray16[m.lIIlIllIIl[0]] = lIIlIllIIl[58];
                        if (!m.lllllllIllII(Bank.contains((int[])nArray16) ? 1 : 0)) break block28;
                        int[] nArray17 = new int[lIIlIllIIl[1]];
                        nArray17[m.lIIlIllIIl[0]] = lIIlIllIIl[58];
                        if (!m.lllllllIllIl(Bank.getFirst((int[])nArray17).getQuantity(), lIIlIllIIl[24])) break block28;
                    }
                    var1 = new DHelper(lIIlIllIIl[58], lIIlIllIIl[24], lIIlIllIIl[59]);
                    bv.add(var1);

                }
                int[] nArray = new int[lIIlIllIIl[1]];
                nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[23];
                if (!m.lllllllIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block29;
                int[] nArray18 = new int[lIIlIllIIl[1]];
                nArray18[m.lIIlIllIIl[0]] = lIIlIllIIl[23];
                if (!m.lllllllIllII(Bank.contains((int[])nArray18) ? 1 : 0)) break block30;
                int[] nArray19 = new int[lIIlIllIIl[1]];
                nArray19[m.lIIlIllIIl[0]] = lIIlIllIIl[23];
                if (!m.lllllllIllIl(Bank.getFirst((int[])nArray19).getQuantity(), lIIlIllIIl[24])) break block30;
            }
            var1 = new DHelper(lIIlIllIIl[23], lIIlIllIIl[24], lIIlIllIIl[59]);
            bv.add(var1);

        }
    }

    private static boolean lllllllIllll(Object object) {
        return object != null;
    }

    static {
        m.lllllllIlIll();
        m.lllllllIlIIl();
        bv = new ArrayList<d>();
    }

    private static boolean llllllllIIlI(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public boolean S() {
        return lIIlIllIIl[0];
    }

    private static boolean llllllllIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int T() {
        try {
            m.ap();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIlIllIIl[54];
    }

    private static boolean llllllllIIII(int n2) {
        return n2 > 0;
    }

    private static boolean lllllllIllII(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var3);
    }

    private static boolean lllllllIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean llllllllIIll(int n2, int n3) {
        return n2 == n3;
    }

    public static void ap() {
        if (m.lllllllIllII(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIlIlll[lIIlIllIIl[0]];
            b.a(bv);
            if (m.lllllllIllIl(bv.size(), lIIlIllIIl[1])) {
                System.out.println(lIIlIlIlll[lIIlIllIIl[1]]);
                bt = lIIlIllIIl[0];
            }
        }
        if (m.lllllllIlllI(bt ? 1 : 0)) {
            BankLocation var4;
            if (m.lllllllIlllI(m.ab() ? 1 : 0)) {
                var4 = BankLocation.getNearest();
                if (m.lllllllIllll(var4) && m.lllllllIlllI(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlll[lIIlIllIIl[2]];
                    a.a(var4);
                }
                if (m.lllllllIllll(var4) && m.lllllllIllII(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlll[lIIlIllIIl[3]];
                    if (m.lllllllIlllI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIllIIl[4]);

                        Time.sleepTicks((int)lIIlIllIIl[3]);

                    }
                    if (m.lllllllIllII(Bank.isOpen() ? 1 : 0)) {
                        if (m.llllllllIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlIllIIl[5]);

                        }
                        if (m.llllllllIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIlIllIIl[2]);

                        }
                        if (m.lllllllIlllI(m.ac() ? 1 : 0)) {
                            m.af();
                            System.out.println(lIIlIlIlll[lIIlIllIIl[6]]);
                            bt = lIIlIllIIl[1];
                            return;
                        }
                        if (m.llllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[7])) {
                            a.a(lIIlIllIIl[8], lIIlIllIIl[1]);
                            a.a(lIIlIllIIl[9], lIIlIllIIl[1]);
                            a.a(lIIlIllIIl[10], lIIlIllIIl[1]);
                            Bank.withdrawAll((int)lIIlIllIIl[11], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        }
                        if (m.lllllllIllIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[7])) {
                            a.a(lIIlIllIIl[12], lIIlIllIIl[1]);
                            a.a(lIIlIllIIl[13], lIIlIllIIl[1]);
                            a.a(lIIlIllIIl[14], lIIlIllIIl[1]);
                            Bank.withdrawAll((int)lIIlIllIIl[15], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIlIllIIl[1]);

                            Bank.withdrawAll((int)lIIlIllIIl[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIlIllIIl[1]);

                            a.a(lIIlIllIIl[17], lIIlIllIIl[1]);
                        }
                        a.a(lIIlIllIIl[18], lIIlIllIIl[1]);
                        a.a(lIIlIllIIl[19], lIIlIllIIl[1]);
                        a.a(lIIlIllIIl[20], lIIlIllIIl[1]);
                        a.a(lIIlIllIIl[21], lIIlIllIIl[1]);
                        a.a(lIIlIllIIl[22], lIIlIllIIl[1]);
                        a.a(lIIlIllIIl[23], lIIlIllIIl[24]);
                        a.a(lIIlIllIIl[25], lIIlIllIIl[24]);
                        a.a(lIIlIllIIl[26], Inventory.getFreeSlots());
                    }
                }
            }
            if (m.lllllllIllII(m.ab() ? 1 : 0)) {
                m.aq();
                if (m.lllllllIllIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[27])) {
                    l.Z();
                }
                if (m.llllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[27])) {
                    var4 = TileItems.getNearest(tileItem -> {
                        int n2;
                        if (m.llllllllIIll(tileItem.getId(), lIIlIllIIl[16]) && m.llllllllIIIl(tileItem.getQuantity(), lIIlIllIIl[42])) {
                            n2 = lIIlIllIIl[1];

                            if (-1 != -1) {
                                return ((0x76 ^ 2 ^ (0xDA ^ 0x96)) & (68 + 2 - 54 + 129 ^ 25 + 53 - -47 + 44 ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIIlIllIIl[0];
                        }
                        return n2 != 0;
                    });
                    if (m.lllllllIllll(var4)) {
                        var4.interact(lIIlIlIlll[lIIlIllIIl[5]]);
                        Time.sleepTicks((int)lIIlIllIIl[6]);

                    }
                    k.X();
                }
            }
        }
    }

    private static void lllllllIlIIl() {
        lIIlIlIlll = new String[lIIlIllIIl[62]];
        m.lIIlIlIlll[m.lIIlIllIIl[0]] = "Buying items";
        m.lIIlIlIlll[m.lIIlIllIIl[1]] = "Finished buying items, switching back to magic training";
        m.lIIlIlIlll[m.lIIlIllIIl[2]] = "Navigating to bank";
        m.lIIlIlIlll[m.lIIlIllIIl[3]] = "Handling banking";
        m.lIIlIlIlll[m.lIIlIllIIl[6]] = "We are missing supplies, switching to BUYING";
        m.lIIlIlIlll[m.lIIlIllIIl[5]] = "Take";
        m.lIIlIlIlll[m.lIIlIllIIl[30]] = "Wield";
        m.lIIlIlIlll[m.lIIlIllIIl[32]] = "Wear";
        m.lIIlIlIlll[m.lIIlIllIIl[33]] = "Wield";
        m.lIIlIlIlll[m.lIIlIllIIl[35]] = "Wield";
        m.lIIlIlIlll[m.lIIlIllIIl[24]] = "Wield";
        m.lIIlIlIlll[m.lIIlIllIIl[37]] = "Wear";
        m.lIIlIlIlll[m.lIIlIllIIl[38]] = "Wear";
        m.lIIlIlIlll[m.lIIlIllIIl[39]] = "Wear";
        m.lIIlIlIlll[m.lIIlIllIIl[40]] = "Wear";
        m.lIIlIlIlll[m.lIIlIllIIl[42]] = "Wear";
        m.lIIlIlIlll[m.lIIlIllIIl[43]] = "Wear";
        m.lIIlIlIlll[m.lIIlIllIIl[44]] = "Wear";
        m.lIIlIlIlll[m.lIIlIllIIl[45]] = "Wield";
        m.lIIlIlIlll[m.lIIlIllIIl[60]] = "Range training";
        m.lIIlIlIlll[m.lIIlIllIIl[31]] = "ring of wealth (";
        m.lIIlIlIlll[m.lIIlIllIIl[61]] = "bow";
    }

    private static void aq() {
        block34: {
            block33: {
                int[] nArray = new int[lIIlIllIIl[1]];
                nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[28];
                if (!m.lllllllIlllI(Equipment.contains((int[])nArray) ? 1 : 0)) break block33;
                int[] nArray2 = new int[lIIlIllIIl[1]];
                nArray2[m.lIIlIllIIl[0]] = lIIlIllIIl[29];
                if (!m.lllllllIlllI(Equipment.contains((int[])nArray2) ? 1 : 0)) break block33;
                int[] nArray3 = new int[lIIlIllIIl[1]];
                nArray3[m.lIIlIllIIl[0]] = lIIlIllIIl[16];
                if (!m.lllllllIlllI(Equipment.contains((int[])nArray3) ? 1 : 0)) break block33;
                int[] nArray4 = new int[lIIlIllIIl[1]];
                nArray4[m.lIIlIllIIl[0]] = lIIlIllIIl[11];
                if (m.lllllllIlllI(Equipment.contains((int[])nArray4) ? 1 : 0) && !m.lllllllIllII(Equipment.contains(item -> item.getName().contains(lIIlIlIlll[lIIlIllIIl[61]])) ? 1 : 0)) break block34;
            }
            if (m.llllllllIIlI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
            }
        }
        if (m.lllllllIllIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[27])) {
            int[] nArray = new int[lIIlIllIIl[1]];
            nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[28];
            if (m.lllllllIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray5 = new int[lIIlIllIIl[1]];
                nArray5[m.lIIlIllIIl[0]] = lIIlIllIIl[28];
                Inventory.getFirst((int[])nArray5).interact(lIIlIlIlll[lIIlIllIIl[30]]);
            }
            int[] nArray6 = new int[lIIlIllIIl[1]];
            nArray6[m.lIIlIllIIl[0]] = lIIlIllIIl[12];
            if (m.lllllllIllII(Inventory.contains((int[])nArray6) ? 1 : 0) && m.lllllllIllIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[5])) {
                e.l(lIIlIllIIl[12]);
            }
            int[] nArray7 = new int[lIIlIllIIl[1]];
            nArray7[m.lIIlIllIIl[0]] = lIIlIllIIl[13];
            if (m.lllllllIllII(Inventory.contains((int[])nArray7) ? 1 : 0) && m.llllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[5]) && m.lllllllIllIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[31])) {
                e.l(lIIlIllIIl[13]);
            }
            int[] nArray8 = new int[lIIlIllIIl[1]];
            nArray8[m.lIIlIllIIl[0]] = lIIlIllIIl[14];
            if (m.lllllllIllII(Inventory.contains((int[])nArray8) ? 1 : 0) && m.llllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[31])) {
                e.l(lIIlIllIIl[14]);
            }
            int[] nArray9 = new int[lIIlIllIIl[1]];
            nArray9[m.lIIlIllIIl[0]] = lIIlIllIIl[15];
            if (m.lllllllIllII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                e.l(lIIlIllIIl[15]);
            }
        }
        if (m.llllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[31])) {
            int[] nArray = new int[lIIlIllIIl[1]];
            nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[18];
            if (m.lllllllIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray10 = new int[lIIlIllIIl[1]];
                nArray10[m.lIIlIllIIl[0]] = lIIlIllIIl[18];
                Inventory.getFirst((int[])nArray10).interact(lIIlIlIlll[lIIlIllIIl[32]]);
            }
        }
        if (m.llllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[27])) {
            int[] nArray = new int[lIIlIllIIl[1]];
            nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[29];
            if (m.lllllllIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray11 = new int[lIIlIllIIl[1]];
                nArray11[m.lIIlIllIIl[0]] = lIIlIllIIl[29];
                Inventory.getFirst((int[])nArray11).interact(lIIlIlIlll[lIIlIllIIl[33]]);
            }
            int[] nArray12 = new int[lIIlIllIIl[1]];
            nArray12[m.lIIlIllIIl[0]] = lIIlIllIIl[34];
            if (m.lllllllIllII(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                int[] nArray13 = new int[lIIlIllIIl[1]];
                nArray13[m.lIIlIllIIl[0]] = lIIlIllIIl[34];
                Inventory.getFirst((int[])nArray13).interact(lIIlIlIlll[lIIlIllIIl[35]]);
            }
            int[] nArray14 = new int[lIIlIllIIl[1]];
            nArray14[m.lIIlIllIIl[0]] = lIIlIllIIl[16];
            if (m.lllllllIllII(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIIlIllIIl[1]];
                nArray15[m.lIIlIllIIl[0]] = lIIlIllIIl[16];
                Inventory.getFirst((int[])nArray15).interact(lIIlIlIlll[lIIlIllIIl[24]]);
            }
        }
        if (m.lllllllIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIIlIllIIl[36])) {
            int[] nArray = new int[lIIlIllIIl[1]];
            nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[19];
            if (m.lllllllIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIlIllIIl[1]];
                nArray16[m.lIIlIllIIl[0]] = lIIlIllIIl[19];
                Inventory.getFirst((int[])nArray16).interact(lIIlIlIlll[lIIlIllIIl[37]]);
            }
        }
        if (m.lllllllIllIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[7])) {
            int[] nArray = new int[lIIlIllIIl[1]];
            nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[17];
            if (m.lllllllIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray17 = new int[lIIlIllIIl[1]];
                nArray17[m.lIIlIllIIl[0]] = lIIlIllIIl[17];
                Inventory.getFirst((int[])nArray17).interact(lIIlIlIlll[lIIlIllIIl[38]]);
            }
        }
        int[] nArray = new int[lIIlIllIIl[1]];
        nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[20];
        if (m.lllllllIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray18 = new int[lIIlIllIIl[1]];
            nArray18[m.lIIlIllIIl[0]] = lIIlIllIIl[20];
            Inventory.getFirst((int[])nArray18).interact(lIIlIlIlll[lIIlIllIIl[39]]);
        }
        int[] nArray19 = new int[lIIlIllIIl[1]];
        nArray19[m.lIIlIllIIl[0]] = lIIlIllIIl[21];
        if (m.lllllllIllII(Inventory.contains((int[])nArray19) ? 1 : 0)) {
            int[] nArray20 = new int[lIIlIllIIl[1]];
            nArray20[m.lIIlIllIIl[0]] = lIIlIllIIl[21];
            Inventory.getFirst((int[])nArray20).interact(lIIlIlIlll[lIIlIllIIl[40]]);
        }
        if (m.llllllllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIllIIl[41])) {
            int[] nArray21 = new int[lIIlIllIIl[1]];
            nArray21[m.lIIlIllIIl[0]] = lIIlIllIIl[8];
            if (m.lllllllIllII(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                int[] nArray22 = new int[lIIlIllIIl[1]];
                nArray22[m.lIIlIllIIl[0]] = lIIlIllIIl[8];
                if (m.lllllllIlllI(Equipment.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[lIIlIllIIl[1]];
                    nArray23[m.lIIlIllIIl[0]] = lIIlIllIIl[8];
                    Inventory.getFirst((int[])nArray23).interact(lIIlIlIlll[lIIlIllIIl[42]]);
                }
            }
            if (m.llllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[7])) {
                int[] nArray24 = new int[lIIlIllIIl[1]];
                nArray24[m.lIIlIllIIl[0]] = lIIlIllIIl[9];
                if (m.lllllllIllII(Inventory.contains((int[])nArray24) ? 1 : 0)) {
                    int[] nArray25 = new int[lIIlIllIIl[1]];
                    nArray25[m.lIIlIllIIl[0]] = lIIlIllIIl[9];
                    if (m.lllllllIlllI(Equipment.contains((int[])nArray25) ? 1 : 0)) {
                        int[] nArray26 = new int[lIIlIllIIl[1]];
                        nArray26[m.lIIlIllIIl[0]] = lIIlIllIIl[9];
                        Inventory.getFirst((int[])nArray26).interact(lIIlIlIlll[lIIlIllIIl[43]]);
                    }
                }
            }
            if (m.llllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[7]) && m.llllllllIIIl(Skills.getLevel((Skill)Skill.DEFENCE), lIIlIllIIl[36])) {
                int[] nArray27 = new int[lIIlIllIIl[1]];
                nArray27[m.lIIlIllIIl[0]] = lIIlIllIIl[10];
                if (m.lllllllIllII(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                    int[] nArray28 = new int[lIIlIllIIl[1]];
                    nArray28[m.lIIlIllIIl[0]] = lIIlIllIIl[10];
                    if (m.lllllllIlllI(Equipment.contains((int[])nArray28) ? 1 : 0)) {
                        int[] nArray29 = new int[lIIlIllIIl[1]];
                        nArray29[m.lIIlIllIIl[0]] = lIIlIllIIl[10];
                        Inventory.getFirst((int[])nArray29).interact(lIIlIlIlll[lIIlIllIIl[44]]);
                    }
                }
            }
            if (m.llllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[7])) {
                int[] nArray30 = new int[lIIlIllIIl[1]];
                nArray30[m.lIIlIllIIl[0]] = lIIlIllIIl[11];
                if (m.lllllllIllII(Inventory.contains((int[])nArray30) ? 1 : 0)) {
                    int[] nArray31 = new int[lIIlIllIIl[1]];
                    nArray31[m.lIIlIllIIl[0]] = lIIlIllIIl[11];
                    Inventory.getFirst((int[])nArray31).interact(lIIlIlIlll[lIIlIllIIl[45]]);
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        block20: {
            block21: {
                if (m.llllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[7]) && m.llllllllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIllIIl[41]) && m.llllllllIIIl(Skills.getLevel((Skill)Skill.DEFENCE), lIIlIllIIl[36])) {
                    int n3;
                    int[] nArray = new int[lIIlIllIIl[1]];
                    nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[9];
                    if (m.lllllllIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIlIllIIl[1]];
                        nArray2[m.lIIlIllIIl[0]] = lIIlIllIIl[10];
                        if (m.lllllllIllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIIlIllIIl[1]];
                            nArray3[m.lIIlIllIIl[0]] = lIIlIllIIl[18];
                            if (m.lllllllIllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIlIllIIl[1]];
                                nArray4[m.lIIlIllIIl[0]] = lIIlIllIIl[20];
                                if (m.lllllllIllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    int[] nArray5 = new int[lIIlIllIIl[1]];
                                    nArray5[m.lIIlIllIIl[0]] = lIIlIllIIl[11];
                                    if (m.lllllllIllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                        int[] nArray6 = new int[lIIlIllIIl[1]];
                                        nArray6[m.lIIlIllIIl[0]] = lIIlIllIIl[8];
                                        if (m.lllllllIllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                            int[] nArray7 = new int[lIIlIllIIl[1]];
                                            nArray7[m.lIIlIllIIl[0]] = lIIlIllIIl[26];
                                            if (m.lllllllIllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                n3 = lIIlIllIIl[1];

                                                if (-(0x54 ^ 0x46 ^ (0xA6 ^ 0xB0)) < 0) return n3 != 0;
                                                return ((0xF8 ^ 0x90 ^ (0xE2 ^ 0x8F)) & (117 + 160 - 204 + 89 ^ 42 + 74 - 80 + 131 ^ -1)) != 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n3 = lIIlIllIIl[0];
                    return n3 != 0;
                }
                if (m.llllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[27]) && m.lllllllIllIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIllIIl[7])) {
                    int n4;
                    int[] nArray = new int[lIIlIllIIl[1]];
                    nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[17];
                    if (m.lllllllIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[lIIlIllIIl[1]];
                        nArray8[m.lIIlIllIIl[0]] = lIIlIllIIl[19];
                        if (m.lllllllIllII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[lIIlIllIIl[1]];
                            nArray9[m.lIIlIllIIl[0]] = lIIlIllIIl[18];
                            if (m.lllllllIllII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIlIllIIl[1]];
                                nArray10[m.lIIlIllIIl[0]] = lIIlIllIIl[20];
                                if (m.lllllllIllII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                    int[] nArray11 = new int[lIIlIllIIl[1]];
                                    nArray11[m.lIIlIllIIl[0]] = lIIlIllIIl[16];
                                    if (m.lllllllIllII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                        int[] nArray12 = new int[lIIlIllIIl[1]];
                                        nArray12[m.lIIlIllIIl[0]] = lIIlIllIIl[26];
                                        if (m.lllllllIllII(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                            n4 = lIIlIllIIl[1];

                                            if (3 > 0) return n4 != 0;
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n4 = lIIlIllIIl[0];
                    return n4 != 0;
                }
                int[] nArray = new int[lIIlIllIIl[1]];
                nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[17];
                if (!m.lllllllIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                int[] nArray13 = new int[lIIlIllIIl[1]];
                nArray13[m.lIIlIllIIl[0]] = lIIlIllIIl[19];
                if (!m.lllllllIllII(Bank.contains((int[])nArray13) ? 1 : 0)) break block20;
                int[] nArray14 = new int[lIIlIllIIl[1]];
                nArray14[m.lIIlIllIIl[0]] = lIIlIllIIl[18];
                if (!m.lllllllIllII(Bank.contains((int[])nArray14) ? 1 : 0)) break block20;
                int[] nArray15 = new int[lIIlIllIIl[1]];
                nArray15[m.lIIlIllIIl[0]] = lIIlIllIIl[20];
                if (!m.lllllllIllII(Bank.contains((int[])nArray15) ? 1 : 0)) break block20;
                int[] nArray16 = new int[lIIlIllIIl[1]];
                nArray16[m.lIIlIllIIl[0]] = lIIlIllIIl[12];
                if (!m.lllllllIllII(Bank.contains((int[])nArray16) ? 1 : 0)) break block20;
                int[] nArray17 = new int[lIIlIllIIl[1]];
                nArray17[m.lIIlIllIIl[0]] = lIIlIllIIl[23];
                if (!m.lllllllIllII(Bank.contains((int[])nArray17) ? 1 : 0)) break block20;
                int[] nArray18 = new int[lIIlIllIIl[1]];
                nArray18[m.lIIlIllIIl[0]] = lIIlIllIIl[13];
                if (!m.lllllllIllII(Bank.contains((int[])nArray18) ? 1 : 0)) break block20;
                int[] nArray19 = new int[lIIlIllIIl[1]];
                nArray19[m.lIIlIllIIl[0]] = lIIlIllIIl[14];
                if (!m.lllllllIllII(Bank.contains((int[])nArray19) ? 1 : 0)) break block20;
                int[] nArray20 = new int[lIIlIllIIl[1]];
                nArray20[m.lIIlIllIIl[0]] = lIIlIllIIl[15];
                if (!m.lllllllIlllI(Bank.contains((int[])nArray20) ? 1 : 0)) break block21;
                int[] nArray21 = new int[lIIlIllIIl[1]];
                nArray21[m.lIIlIllIIl[0]] = lIIlIllIIl[15];
                if (!m.lllllllIllII(Equipment.contains((int[])nArray21) ? 1 : 0)) break block20;
            }
            int[] nArray = new int[lIIlIllIIl[1]];
            nArray[m.lIIlIllIIl[0]] = lIIlIllIIl[16];
            if (m.lllllllIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray22 = new int[lIIlIllIIl[1]];
                nArray22[m.lIIlIllIIl[0]] = lIIlIllIIl[26];
                if (m.lllllllIllII(Bank.contains((int[])nArray22) ? 1 : 0)) {
                    n2 = lIIlIllIIl[1];

                    if (-1 < 0) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIIlIllIIl[0];
        return n2 != 0;
    }

    @Override
    public String U() {
        return lIIlIlIlll[lIIlIllIIl[60]];
    }
}

