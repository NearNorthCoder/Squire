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
package gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.AHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.BHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.DHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.EHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.MHelper;
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

public class IHelper
implements M {
    public static  boolean bz;
    
    static  WorldPoint bC;
    static  WorldArea bB;
    static  WorldPoint bD;
    public static  List<d> bA;
    
    public static  boolean by;

    private static boolean lIlIIlIlIIllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIlIlIIlllIl(Object object) {
        return object == null;
    }

    public static void V() {
        if (i.lIlIIlIlIIlIlll(Widgets.get((int)lIIIllllIIIII[49], (int)lIIIllllIIIII[50]))) {
            AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[51]];
            Widgets.get((int)lIIIllllIIIII[49], (int)lIIIllllIIIII[50]).interact(lIIIlllIllIll[lIIIllllIIIII[52]]);
            Time.sleepTicks((int)lIIIllllIIIII[5]);

        }
        if (i.lIlIIlIlIIlllIl(Widgets.get((int)lIIIllllIIIII[49], (int)lIIIllllIIIII[50])) && i.lIlIIlIlIIlIllI(Widgets.get((int)lIIIllllIIIII[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIIIllllIIIII[1]);

            if (i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[17])) {
                Widgets.get((int)lIIIllllIIIII[53], (int)lIIIllllIIIII[1]).getChild(lIIIllllIIIII[1]).interact(lIIIlllIllIll[lIIIllllIIIII[54]]);
            }
            if (i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[31]) && i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[17])) {
                Widgets.get((int)lIIIllllIIIII[53], (int)lIIIllllIIIII[1]).getChild(lIIIllllIIIII[2]).interact(lIIIlllIllIll[lIIIllllIIIII[55]]);
            }
            if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[31]) && i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[36])) {
                Widgets.get((int)lIIIllllIIIII[53], (int)lIIIllllIIIII[1]).getChild(lIIIllllIIIII[3]).interact(lIIIlllIllIll[lIIIllllIIIII[19]]);
            }
            if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[31])) {
                int[] nArray = new int[lIIIllllIIIII[1]];
                nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                if (i.lIlIIlIlIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIIllllIIIII[53], (int)lIIIllllIIIII[1]).getChild(lIIIllllIIIII[3]).interact(lIIIlllIllIll[lIIIllllIIIII[50]]);
                }
            }
            if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[36])) {
                int[] nArray = new int[lIIIllllIIIII[1]];
                nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIIllllIIIII[53], (int)lIIIllllIIIII[1]).getChild(lIIIllllIIIII[5]).interact(lIIIlllIllIll[lIIIllllIIIII[56]]);
                }
            }
            Time.sleepTicks((int)lIIIllllIIIII[1]);

        }
    }

    private static boolean lIlIIlIlIIlIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlIlIIlllll(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(var1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean T() {
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
                                                    if (!i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[19])) break block19;
                                                    int[] nArray = new int[lIIIllllIIIII[1]];
                                                    nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[7];
                                                    if (!i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIIllllIIIII[1]];
                                                    nArray2[i.lIIIllllIIIII[0]] = lIIIllllIIIII[11];
                                                    if (!i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIIllllIIIII[1]];
                                                    nArray3[i.lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                                                    if (!i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIIllllIIIII[1]];
                                                    nArray4[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                                                    if (!i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIIllllIIIII[1]];
                                                    nArray5[i.lIIIllllIIIII[0]] = lIIIllllIIIII[18];
                                                    if (!i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIIllllIIIII[1]];
                                                    nArray6[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                                    if (!i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIIllllIIIII[1]];
                                                    nArray7[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                                    if (!i.lIlIIlIlIIlIlII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIIllllIIIII[1];

                                                if (2 <= (0xED ^ 0x9B ^ (0x7D ^ 0xF))) return n5 != 0;
                                                return ((0xA4 ^ 0xC5 ^ (0xDD ^ 0xA8)) & (0xB7 ^ 0xAD ^ (0xCD ^ 0xC3) ^ -1)) != 0;
                                            }
                                            n5 = lIIIllllIIIII[0];
                                            return n5 != 0;
                                        }
                                        if (!i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[19]) || !i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6])) break block22;
                                        int[] nArray = new int[lIIIllllIIIII[1]];
                                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[11];
                                        if (!i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIIllllIIIII[1]];
                                        nArray8[i.lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                                        if (!i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIIllllIIIII[1]];
                                        nArray9[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                                        if (!i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIIllllIIIII[1]];
                                        nArray10[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                                        if (!i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIIllllIIIII[1]];
                                        nArray11[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                        if (!i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIIllllIIIII[1]];
                                        nArray12[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                        if (!i.lIlIIlIlIIlIlII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIIllllIIIII[1];

                                    if ((0x87 ^ 0x83) != 0) return n4 != 0;
                                    return false;
                                }
                                n4 = lIIIllllIIIII[0];
                                return n4 != 0;
                            }
                            if (!i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6]) || !i.lIlIIlIlIIlIllI(bz ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIIllllIIIII[1]];
                            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                            if (!i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIIllllIIIII[1]];
                            nArray13[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                            if (!i.lIlIIlIlIIlIlII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIIllllIIIII[1]];
                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[22];
                        if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIIllllIIIII[1]];
                            nArray14[i.lIIIllllIIIII[0]] = lIIIllllIIIII[23];
                            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIIllllIIIII[1];

                                if (-1 != (91 + 43 - 2 + 8 ^ 23 + 60 - 61 + 114)) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = lIIIllllIIIII[0];
                    return n3 != 0;
                }
                if (!i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6]) || !i.lIlIIlIlIIlIlII(bz ? 1 : 0)) return lIIIllllIIIII[0];
                int[] nArray = new int[lIIIllllIIIII[1]];
                nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                if (!i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIIllllIIIII[1]];
                nArray15[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                if (!i.lIlIIlIlIIlIlII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIIllllIIIII[1]];
            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIIllllIIIII[1]];
                nArray16[i.lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIllllIIIII[1]];
                    nArray17[i.lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                    if (i.lIlIIlIlIIllIIl(Bank.getFirst((int[])nArray17).getQuantity(), lIIIllllIIIII[17])) {
                        int[] nArray18 = new int[lIIIllllIIIII[1]];
                        nArray18[i.lIIIllllIIIII[0]] = lIIIllllIIIII[22];
                        if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIIllllIIIII[1]];
                            nArray19[i.lIIIllllIIIII[0]] = lIIIllllIIIII[23];
                            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIIllllIIIII[1];

                                if (-1 < 0) return n2 != 0;
                                return (3 & (3 ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIllllIIIII[0];
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
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
                                                    if (!i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[19])) break block19;
                                                    int[] nArray = new int[lIIIllllIIIII[1]];
                                                    nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[7];
                                                    if (!i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIIllllIIIII[1]];
                                                    nArray2[i.lIIIllllIIIII[0]] = lIIIllllIIIII[11];
                                                    if (!i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIIllllIIIII[1]];
                                                    nArray3[i.lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                                                    if (!i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIIllllIIIII[1]];
                                                    nArray4[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                                                    if (!i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIIllllIIIII[1]];
                                                    nArray5[i.lIIIllllIIIII[0]] = lIIIllllIIIII[18];
                                                    if (!i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIIllllIIIII[1]];
                                                    nArray6[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                                    if (!i.lIlIIlIlIIlIllI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIIllllIIIII[1]];
                                                    nArray7[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                                    if (!i.lIlIIlIlIIlIlII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIIllllIIIII[1];

                                                if (-1 <= 0) return n5 != 0;
                                                return ((102 + 149 - 143 + 123 ^ 112 + 158 - 260 + 185) & (0x32 ^ 0x4C ^ (0x11 ^ 0x4B) ^ -1)) != 0;
                                            }
                                            n5 = lIIIllllIIIII[0];
                                            return n5 != 0;
                                        }
                                        if (!i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[19]) || !i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6])) break block22;
                                        int[] nArray = new int[lIIIllllIIIII[1]];
                                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[11];
                                        if (!i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIIllllIIIII[1]];
                                        nArray8[i.lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                                        if (!i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIIllllIIIII[1]];
                                        nArray9[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                                        if (!i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIIllllIIIII[1]];
                                        nArray10[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                                        if (!i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIIllllIIIII[1]];
                                        nArray11[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                        if (!i.lIlIIlIlIIlIllI(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIIllllIIIII[1]];
                                        nArray12[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                        if (!i.lIlIIlIlIIlIlII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIIllllIIIII[1];

                                    if (-(0x66 ^ 0x62) < 0) return n4 != 0;
                                    return false;
                                }
                                n4 = lIIIllllIIIII[0];
                                return n4 != 0;
                            }
                            if (!i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6]) || !i.lIlIIlIlIIlIllI(bz ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIIllllIIIII[1]];
                            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                            if (!i.lIlIIlIlIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIIllllIIIII[1]];
                            nArray13[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                            if (!i.lIlIIlIlIIlIlII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIIllllIIIII[1]];
                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[22];
                        if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIIllllIIIII[1]];
                            nArray14[i.lIIIllllIIIII[0]] = lIIIllllIIIII[35];
                            if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIIllllIIIII[1];

                                if ((9 + 167 - 158 + 153 ^ 45 + 174 - 142 + 98) != -1) return n3 != 0;
                                return ((0x74 ^ 0x54 ^ (0xC4 ^ 0xB4)) & (0x3A ^ 0x56 ^ (0x79 ^ 0x45) ^ -1)) != 0;
                            }
                        }
                    }
                    n3 = lIIIllllIIIII[0];
                    return n3 != 0;
                }
                if (!i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6]) || !i.lIlIIlIlIIlIlII(bz ? 1 : 0)) return lIIIllllIIIII[0];
                int[] nArray = new int[lIIIllllIIIII[1]];
                nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                if (!i.lIlIIlIlIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIIllllIIIII[1]];
                nArray15[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                if (!i.lIlIIlIlIIlIlII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIIllllIIIII[1]];
            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
            if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIIllllIIIII[1]];
                nArray16[i.lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIllllIIIII[1]];
                    nArray17[i.lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                    if (i.lIlIIlIlIIllIIl(Inventory.getFirst((int[])nArray17).getQuantity(), lIIIllllIIIII[17])) {
                        int[] nArray18 = new int[lIIIllllIIIII[1]];
                        nArray18[i.lIIIllllIIIII[0]] = lIIIllllIIIII[22];
                        if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIIllllIIIII[1]];
                            nArray19[i.lIIIllllIIIII[0]] = lIIIllllIIIII[35];
                            if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIIllllIIIII[1];

                                if (-1 < 1) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIllllIIIII[0];
        return n2 != 0;
    }

    private static void R() {
        if (i.lIlIIlIlIIlllII(i.lIlIIlIlIIllIll(e.v(), 30.0))) {
            int[] nArray = new int[lIIIllllIIIII[1]];
            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[18];
            if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIllllIIIII[1]];
                nArray2[i.lIIIllllIIIII[0]] = lIIIllllIIIII[18];
                Inventory.getFirst((int[])nArray2).interact(lIIIlllIllIll[lIIIllllIIIII[41]]);
                Time.sleepTicks((int)lIIIllllIIIII[1]);

            }
        }
        if (i.lIlIIlIlIIlllIl(Players.getLocal().getInteracting())) {
            NPC var2 = NPCs.getNearest(nPC -> {
                int n2;
                if (i.lIlIIlIlIIlIlII(nPC.getName().contains(lIIIlllIllIll[lIIIllllIIIII[75]]) ? 1 : 0) && i.lIlIIlIlIIlIllI(nPC.isDead() ? 1 : 0)) {
                    n2 = lIIIllllIIIII[1];

                    if ((1 & ~1) == (0x8E ^ 0x8A)) {
                        return false;
                    }
                } else {
                    n2 = lIIIllllIIIII[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lIIIllllIIIII[2]];
            stringArray[i.lIIIllllIIIII[0]] = lIIIlllIllIll[lIIIllllIIIII[42]];
            stringArray[i.lIIIllllIIIII[1]] = lIIIlllIllIll[lIIIllllIIIII[43]];
            List var3 = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (i.lIlIIlIlIIllllI(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIIIllllIIIII[1];

                } else {
                    bl = lIIIllllIIIII[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lIIIllllIIIII[1]];
            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
            if (i.lIlIIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0) && i.lIlIIlIlIIlIllI(i.U() ? 1 : 0)) {
                i.V();
            }
            if (i.lIlIIlIlIIlIlll(var2) && i.lIlIIlIlIIlIllI(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[45]];
                var2.interact(lIIIlllIllIll[lIIIllllIIIII[46]]);
                Time.sleepTicks((int)lIIIllllIIIII[3]);

            }
        }
        if (i.lIlIIlIlIIlIlll(Players.getLocal().getInteracting())) {
            AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[47]];
            Time.sleepTicks((int)lIIIllllIIIII[1]);

        }
    }

    private static boolean lIlIIlIlIIllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    public static boolean U() {
        if (i.lIlIIlIlIIllIlI(Vars.getBit((int)lIIIllllIIIII[48]), lIIIllllIIIII[1]) && i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[17])) {
            return lIIIllllIIIII[1];
        }
        if (i.lIlIIlIlIIllIlI(Vars.getBit((int)lIIIllllIIIII[48]), lIIIllllIIIII[2]) && i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[31]) && i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[17])) {
            return lIIIllllIIIII[1];
        }
        if (i.lIlIIlIlIIllIlI(Vars.getBit((int)lIIIllllIIIII[48]), lIIIllllIIIII[3]) && i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[31]) && i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[36])) {
            return lIIIllllIIIII[1];
        }
        if (i.lIlIIlIlIIllIlI(Vars.getBit((int)lIIIllllIIIII[48]), lIIIllllIIIII[3]) && i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[31])) {
            int[] nArray = new int[lIIIllllIIIII[1]];
            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
            if (i.lIlIIlIlIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIIllllIIIII[1];
            }
        }
        if (i.lIlIIlIlIIllIlI(Vars.getBit((int)lIIIllllIIIII[48]), lIIIllllIIIII[5]) && i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[36])) {
            int[] nArray = new int[lIIIllllIIIII[1]];
            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
            if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIIllllIIIII[1];
            }
        }
        return lIIIllllIIIII[0];
    }

    private static boolean lIlIIlIlIIlllII(int n2) {
        return n2 < 0;
    }

    public static void P() {
        if (i.lIlIIlIlIIlIlII(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[0]];
            b.a(bA);
            if (i.lIlIIlIlIIlIlIl(bA.size(), lIIIllllIIIII[1])) {
                System.out.println(lIIIlllIllIll[lIIIllllIIIII[1]]);
                by = lIIIllllIIIII[0];
            }
        }
        if (i.lIlIIlIlIIlIllI(by ? 1 : 0)) {
            BankLocation var4;
            if (i.lIlIIlIlIIlIllI(i.S() ? 1 : 0)) {
                var4 = BankLocation.getNearest();
                if (i.lIlIIlIlIIlIlll(var4) && i.lIlIIlIlIIlIllI(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[2]];
                    a.a(var4);
                }
                if (i.lIlIIlIlIIlIlll(var4) && i.lIlIIlIlIIlIlII(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[3]];
                    if (i.lIlIIlIlIIlIllI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllIIIII[4]);

                    }
                    if (i.lIlIIlIlIIlIlII(Bank.isOpen() ? 1 : 0)) {
                        if (i.lIlIIlIlIIllIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIllllIIIII[5]);

                        }
                        while (i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6]) && i.lIlIIlIlIIlIllI(m.av() ? 1 : 0)) {
                            m.at();
                            Time.sleepTicks((int)lIIIllllIIIII[1]);

                            if (((0x11 ^ 0x3B) & ~(0x29 ^ 3)) == 0) continue;
                            return;
                        }
                        if (i.lIlIIlIlIIlIllI(i.T() ? 1 : 0)) {
                            i.W();
                            System.out.println(lIIIlllIllIll[lIIIllllIIIII[5]]);
                            by = lIIIllllIIIII[1];
                            return;
                        }
                        if (i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6])) {
                            int[] nArray = new int[lIIIllllIIIII[1]];
                            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[7];
                            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIIllllIIIII[1]];
                                nArray2[i.lIIIllllIIIII[0]] = lIIIllllIIIII[7];
                                if (i.lIlIIlIlIIlIlIl(Inventory.getCount((int[])nArray2), lIIIllllIIIII[1])) {
                                    Bank.withdraw((int)lIIIllllIIIII[7], (int)lIIIllllIIIII[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIllllIIIII[1]];
                                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[7];
                                        if (i.lIlIIlIlIIllIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIllllIIIII[1];

                                            if (((0xF5 ^ 0xAB ^ (7 ^ 0x51)) & (0xD6 ^ 0xB3 ^ (0x67 ^ 0xA) ^ -1)) >= 1) {
                                                return ((0x61 ^ 0x3D ^ (0xCC ^ 0xBD)) & (133 + 140 - 199 + 79 ^ 159 + 122 - 140 + 39 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIIllllIIIII[0];
                                        }
                                        return bl;
                                    }, (int)lIIIllllIIIII[4]);

                                }
                            }
                            int[] nArray3 = new int[lIIIllllIIIII[1]];
                            nArray3[i.lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIIllllIIIII[1]];
                                nArray4[i.lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                                if (i.lIlIIlIlIIlIlIl(Inventory.getCount((int[])nArray4), lIIIllllIIIII[1])) {
                                    Bank.withdraw((int)lIIIllllIIIII[9], (int)lIIIllllIIIII[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIllllIIIII[1]];
                                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                                        if (i.lIlIIlIlIIllIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIllllIIIII[1];

                                            if (2 < 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIllllIIIII[0];
                                        }
                                        return bl;
                                    }, (int)lIIIllllIIIII[4]);

                                }
                            }
                            int[] nArray5 = new int[lIIIllllIIIII[1]];
                            nArray5[i.lIIIllllIIIII[0]] = lIIIllllIIIII[11];
                            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIIllllIIIII[1]];
                                nArray6[i.lIIIllllIIIII[0]] = lIIIllllIIIII[11];
                                if (i.lIlIIlIlIIlIlIl(Inventory.getCount((int[])nArray6), lIIIllllIIIII[1])) {
                                    Bank.withdraw((int)lIIIllllIIIII[11], (int)lIIIllllIIIII[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIllllIIIII[1]];
                                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[11];
                                        if (i.lIlIIlIlIIllIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIllllIIIII[1];

                                            if ((0x4E ^ 0x54 ^ (0x5E ^ 0x40)) == 0) {
                                                return ((4 ^ 0x77 ^ (0x65 ^ 0x45)) & (142 + 170 - 294 + 235 ^ 101 + 83 - 104 + 94 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIIllllIIIII[0];
                                        }
                                        return bl;
                                    }, (int)lIIIllllIIIII[4]);

                                }
                            }
                            int[] nArray7 = new int[lIIIllllIIIII[1]];
                            nArray7[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIIllllIIIII[1]];
                                nArray8[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                                if (i.lIlIIlIlIIlIlIl(Inventory.getCount((int[])nArray8), lIIIllllIIIII[1])) {
                                    Bank.withdraw((int)lIIIllllIIIII[12], (int)lIIIllllIIIII[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIllllIIIII[1]];
                                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                                        if (i.lIlIIlIlIIllIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIllllIIIII[1];

                                            }
                                        } else {
                                            bl = lIIIllllIIIII[0];
                                        }
                                        return bl;
                                    }, (int)lIIIllllIIIII[4]);

                                }
                            }
                            int[] nArray9 = new int[lIIIllllIIIII[1]];
                            nArray9[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIIllllIIIII[1]];
                                nArray10[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                                if (i.lIlIIlIlIIlIlIl(Inventory.getCount((int[])nArray10), lIIIllllIIIII[1])) {
                                    Bank.withdraw((int)lIIIllllIIIII[14], (int)lIIIllllIIIII[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIllllIIIII[1]];
                                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                                        if (i.lIlIIlIlIIllIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIllllIIIII[1];

                                            if (2 < ((0x18 ^ 0x49) & ~(0x54 ^ 5))) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIllllIIIII[0];
                                        }
                                        return bl;
                                    }, (int)lIIIllllIIIII[4]);

                                }
                            }
                            int[] nArray11 = new int[lIIIllllIIIII[1]];
                            nArray11[i.lIIIllllIIIII[0]] = lIIIllllIIIII[15];
                            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIIIllllIIIII[1]];
                                nArray12[i.lIIIllllIIIII[0]] = lIIIllllIIIII[15];
                                if (i.lIlIIlIlIIlIllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lIIIllllIIIII[15], (int)lIIIllllIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIII[1]);

                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIIIllllIIIII[1]];
                                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[15];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIIIllllIIIII[4]);

                                }
                            }
                            Bank.withdraw((int)lIIIllllIIIII[16], (int)lIIIllllIIIII[17], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lIIIllllIIIII[1]];
                            nArray13[i.lIIIllllIIIII[0]] = lIIIllllIIIII[18];
                            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lIIIllllIIIII[1]];
                                nArray14[i.lIIIllllIIIII[0]] = lIIIllllIIIII[18];
                                if (i.lIlIIlIlIIlIlIl(Inventory.getCount((int[])nArray14), lIIIllllIIIII[1]) && i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[19])) {
                                    Bank.withdrawAll((int)lIIIllllIIIII[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIllllIIIII[1]];
                                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[18];
                                        if (i.lIlIIlIlIIllIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIllllIIIII[1];

                                            if (1 > 3) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIllllIIIII[0];
                                        }
                                        return bl;
                                    }, (int)lIIIllllIIIII[4]);

                                }
                            }
                        }
                        if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6])) {
                            int[] nArray = new int[lIIIllllIIIII[1]];
                            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                            if (i.lIlIIlIlIIlIllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIIIllllIIIII[20], (int)lIIIllllIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIllllIIIII[1]);

                            }
                            if (i.lIlIIlIlIIlIlII(bz ? 1 : 0)) {
                                Bank.withdrawAll((int)lIIIllllIIIII[21], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIllllIIIII[1]);

                                Bank.withdrawAll((int)lIIIllllIIIII[14], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIllllIIIII[1]);

                            }
                            Bank.withdrawAll((int)lIIIllllIIIII[22], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIIllllIIIII[1]);

                            Bank.withdrawAll((int)lIIIllllIIIII[23], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIIIllllIIIII[1]);

                        }
                    }
                }
            }
            if (i.lIlIIlIlIIlIlII(i.S() ? 1 : 0)) {
                if (i.lIlIIlIlIIlIlII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[19])) {
                    if (i.lIlIIlIlIIlIllI(bB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[17]];
                        Movement.walkTo((WorldPoint)bC);

                        Time.sleepTicks((int)lIIIllllIIIII[1]);

                    }
                    if (i.lIlIIlIlIIlIlII(bB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[24]];
                        i.R();
                    }
                }
                if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[19]) && i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[25])) {
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[26]];
                    if (i.lIlIIlIlIIllIlI(Players.getLocal().getAnimation(), lIIIllllIIIII[27])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lIIIllllIIIII[1]);

                    }
                }
                if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[25]) && i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[28])) {
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[29]];
                    if (i.lIlIIlIlIIllIlI(Players.getLocal().getAnimation(), lIIIllllIIIII[27])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIIIllllIIIII[1]);

                    }
                }
                if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[28]) && i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[30])) {
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[31]];
                    if (i.lIlIIlIlIIllIlI(Players.getLocal().getAnimation(), lIIIllllIIIII[27])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIIIllllIIIII[1]);

                    }
                }
                if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[30]) && i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6])) {
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[32]];
                    if (i.lIlIIlIlIIllIlI(Players.getLocal().getAnimation(), lIIIllllIIIII[27])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIIIllllIIIII[1]);

                    }
                }
                if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6])) {
                    int var5;
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[33]];
                    int[] nArray = new int[lIIIllllIIIII[1]];
                    nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                    if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lIIIllllIIIII[1]];
                        nArray15[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                        if (i.lIlIIlIlIIlIllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lIIIllllIIIII[1]];
                            nArray16[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                            Inventory.getFirst((int[])nArray16).interact(lIIIlllIllIll[lIIIllllIIIII[34]]);
                            Time.sleepTicks((int)lIIIllllIIIII[1]);

                        }
                    }
                    if (i.lIlIIlIlIIlIlII(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lIIIllllIIIII[1]];
                    nArray17[i.lIIIllllIIIII[0]] = lIIIllllIIIII[22];
                    var4 = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lIIIllllIIIII[1]];
                    nArray18[i.lIIIllllIIIII[0]] = lIIIllllIIIII[35];
                    Item var6 = Inventory.getFirst((int[])nArray18);
                    if (i.lIlIIlIlIIlIllI(bz ? 1 : 0)) {
                        if (i.lIlIIlIlIIlIllI(Players.getLocal().getWorldLocation().equals((Object)bD) ? 1 : 0)) {
                            AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[36]];
                            Movement.walkTo((WorldPoint)bD);

                            Time.sleepTicks((int)lIIIllllIIIII[1]);

                        }
                        if (i.lIlIIlIlIIlIlII(Players.getLocal().getWorldLocation().equals((Object)bD) ? 1 : 0) && i.lIlIIlIlIIlIlll(var4) && i.lIlIIlIlIIlIlll(var6)) {
                            var5 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var6);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (i.lIlIIlIlIIlllll(Skills.getExperience((Skill)Skill.MAGIC), var5)) {
                                    bl = lIIIllllIIIII[1];

                                    if ((91 + 136 - 215 + 154 ^ 80 + 5 - -6 + 71) == 0) {
                                        return ((120 + 6 - 69 + 113 ^ 130 + 72 - 175 + 119) & (0x1D ^ 0x43 ^ (0x27 ^ 0x41) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIllllIIIII[0];
                                }
                                return bl;
                            }, (int)lIIIllllIIIII[8]);

                            Time.sleep((long)e.c(lIIIllllIIIII[37], lIIIllllIIIII[38]));

                        }
                    }
                    if (i.lIlIIlIlIIlIlII(bz ? 1 : 0)) {
                        if (i.lIlIIlIlIIlIlll(var4) && i.lIlIIlIlIIlIlll(var6) && i.lIlIIlIlIIllIlI(Players.getLocal().getAnimation(), lIIIllllIIIII[27])) {
                            var5 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var6);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (i.lIlIIlIlIIlllll(Skills.getExperience((Skill)Skill.MAGIC), var5)) {
                                    bl = lIIIllllIIIII[1];

                                    if (((131 + 8 - 47 + 137 ^ 101 + 67 - 26 + 26) & (0x46 ^ 0x20 ^ (0x9A ^ 0xB1) ^ -1)) != 0) {
                                        return ((55 + 200 - 170 + 129 ^ 28 + 7 - -39 + 67) & (0x61 ^ 0x21 ^ (0x30 ^ 0x2B) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIllllIIIII[0];
                                }
                                return bl;
                            }, (int)lIIIllllIIIII[8]);

                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (i.lIlIIlIlIIllIlI(Players.getLocal().getAnimation(), lIIIllllIIIII[27])) {
                                bl = lIIIllllIIIII[1];

                                if (1 <= 0) {
                                    return false;
                                }
                            } else {
                                bl = lIIIllllIIIII[0];
                            }
                            return bl;
                        }, (int)lIIIllllIIIII[39]);

                    }
                }
            }
        }
    }

    @Override
    public String Z() {
        return lIIIlllIllIll[lIIIllllIIIII[72]];
    }

    private static boolean lIlIIlIlIIlIlll(Object object) {
        return object != null;
    }

    private static void W() {
        d var7;
        Object var8;
        if (i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6])) {
            int[] nArray = new int[lIIIllllIIIII[1]];
            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
            if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new DHelper(lIIIllllIIIII[14], lIIIllllIIIII[57], lIIIllllIIIII[58]);
                bA.add(d2);

            }
            int[] nArray2 = new int[lIIIllllIIIII[1]];
            nArray2[i.lIIIllllIIIII[0]] = lIIIllllIIIII[7];
            if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                var8 = new DHelper(lIIIllllIIIII[7], lIIIllllIIIII[59], lIIIllllIIIII[24]);
                bA.add((DHelper) ar8);

            }
            int[] nArray3 = new int[lIIIllllIIIII[1]];
            nArray3[i.lIIIllllIIIII[0]] = lIIIllllIIIII[9];
            if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                var8 = new DHelper(lIIIllllIIIII[9], lIIIllllIIIII[60], lIIIllllIIIII[24]);
                bA.add((DHelper) ar8);

            }
            int[] nArray4 = new int[lIIIllllIIIII[1]];
            nArray4[i.lIIIllllIIIII[0]] = lIIIllllIIIII[11];
            if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                var8 = new DHelper(lIIIllllIIIII[11], lIIIllllIIIII[61], lIIIllllIIIII[24]);
                bA.add((DHelper) ar8);

            }
            int[] nArray5 = new int[lIIIllllIIIII[1]];
            nArray5[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
            if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                var8 = new DHelper(lIIIllllIIIII[12], lIIIllllIIIII[4], lIIIllllIIIII[24]);
                bA.add((DHelper) ar8);

            }
            int[] nArray6 = new int[lIIIllllIIIII[1]];
            nArray6[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
            if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                var8 = new DHelper(lIIIllllIIIII[44], lIIIllllIIIII[1], e.c(lIIIllllIIIII[62], lIIIllllIIIII[63]));
                bA.add((DHelper) ar8);

            }
        }
        if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6])) {
            int[] nArray = new int[lIIIllllIIIII[1]];
            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[22];
            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lIIIllllIIIII[1]];
                nArray7[i.lIIIllllIIIII[0]] = lIIIllllIIIII[22];
                if (i.lIlIIlIlIIlIlIl(Bank.getFirst((int[])nArray7).getQuantity(), lIIIllllIIIII[61])) {
                    int[] nArray8 = new int[lIIIllllIIIII[1]];
                    nArray8[i.lIIIllllIIIII[0]] = lIIIllllIIIII[22];
                    var8 = new DHelper(lIIIllllIIIII[22], lIIIllllIIIII[61] - Bank.getFirst((int[])nArray8).getQuantity(), lIIIllllIIIII[64]);
                    bA.add((DHelper) ar8);

                }
            }
            int[] nArray9 = new int[lIIIllllIIIII[1]];
            nArray9[i.lIIIllllIIIII[0]] = lIIIllllIIIII[22];
            if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                var8 = new DHelper(lIIIllllIIIII[22], lIIIllllIIIII[61], lIIIllllIIIII[64]);
                bA.add((DHelper) ar8);

            }
            int[] nArray10 = new int[lIIIllllIIIII[1]];
            nArray10[i.lIIIllllIIIII[0]] = lIIIllllIIIII[23];
            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIIIllllIIIII[1]];
                nArray11[i.lIIIllllIIIII[0]] = lIIIllllIIIII[23];
                if (i.lIlIIlIlIIlIlIl(Bank.getFirst((int[])nArray11).getQuantity(), lIIIllllIIIII[61])) {
                    int[] nArray12 = new int[lIIIllllIIIII[1]];
                    nArray12[i.lIIIllllIIIII[0]] = lIIIllllIIIII[23];
                    var8 = new DHelper(lIIIllllIIIII[23], lIIIllllIIIII[61] - Bank.getFirst((int[])nArray12).getQuantity(), lIIIllllIIIII[65]);
                    bA.add((DHelper) ar8);

                }
            }
            int[] nArray13 = new int[lIIIllllIIIII[1]];
            nArray13[i.lIIIllllIIIII[0]] = lIIIllllIIIII[23];
            if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                var8 = new DHelper(lIIIllllIIIII[23], lIIIllllIIIII[61], lIIIllllIIIII[65]);
                bA.add((DHelper) ar8);

            }
            int[] nArray14 = new int[lIIIllllIIIII[1]];
            nArray14[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
            if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIIIllllIIIII[1]];
                nArray15[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                if (i.lIlIIlIlIIlIllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    var8 = new DHelper(lIIIllllIIIII[20], lIIIllllIIIII[1], lIIIllllIIIII[66]);
                    bA.add((DHelper) ar8);

                }
            }
            if (i.lIlIIlIlIIlIlII(bz ? 1 : 0)) {
                int[] nArray16 = new int[lIIIllllIIIII[1]];
                nArray16[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIllllIIIII[1]];
                    nArray17[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                    if (i.lIlIIlIlIIlIlIl(Bank.getFirst((int[])nArray17).getQuantity(), lIIIllllIIIII[61])) {
                        int[] nArray18 = new int[lIIIllllIIIII[1]];
                        nArray18[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                        var8 = new DHelper(lIIIllllIIIII[14], lIIIllllIIIII[61] - Bank.getFirst((int[])nArray18).getQuantity(), lIIIllllIIIII[58]);
                        bA.add((DHelper) ar8);

                    }
                }
                int[] nArray19 = new int[lIIIllllIIIII[1]];
                nArray19[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    var8 = new DHelper(lIIIllllIIIII[14], lIIIllllIIIII[61], lIIIllllIIIII[58]);
                    bA.add((DHelper) ar8);

                }
                int[] nArray20 = new int[lIIIllllIIIII[1]];
                nArray20[i.lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIIIllllIIIII[1]];
                    nArray21[i.lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                    if (i.lIlIIlIlIIlIlIl(Bank.getFirst((int[])nArray21).getQuantity(), lIIIllllIIIII[66])) {
                        int[] nArray22 = new int[lIIIllllIIIII[1]];
                        nArray22[i.lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                        var8 = new DHelper(lIIIllllIIIII[21], lIIIllllIIIII[66] - Bank.getFirst((int[])nArray22).getQuantity(), lIIIllllIIIII[24]);
                        bA.add((DHelper) ar8);

                    }
                }
                int[] nArray23 = new int[lIIIllllIIIII[1]];
                nArray23[i.lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    var8 = new DHelper(lIIIllllIIIII[21], lIIIllllIIIII[66], lIIIllllIIIII[24]);
                    bA.add((DHelper) ar8);

                }
            }
        }
        int[] nArray = new int[lIIIllllIIIII[1]];
        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[18];
        if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            var8 = new DHelper(lIIIllllIIIII[18], lIIIllllIIIII[67], lIIIllllIIIII[37]);
            bA.add((DHelper) ar8);

        }
        if (i.lIlIIlIlIIlIllI(Bank.contains(var8 = item -> item.getName().toLowerCase().contains(lIIIlllIllIll[lIIIllllIIIII[74]])) ? 1 : 0)) {
            var7 = new DHelper(lIIIllllIIIII[68], lIIIllllIIIII[17], lIIIllllIIIII[69]);
            bA.add(var7);

        }
        int[] nArray24 = new int[lIIIllllIIIII[1]];
        nArray24[i.lIIIllllIIIII[0]] = lIIIllllIIIII[70];
        if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray24) ? 1 : 0)) {
            var7 = new DHelper(lIIIllllIIIII[70], lIIIllllIIIII[32], lIIIllllIIIII[71]);
            bA.add(var7);

        }
        int[] nArray25 = new int[lIIIllllIIIII[1]];
        nArray25[i.lIIIllllIIIII[0]] = lIIIllllIIIII[16];
        if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray25) ? 1 : 0)) {
            var7 = new DHelper(lIIIllllIIIII[16], lIIIllllIIIII[32], lIIIllllIIIII[71]);
            bA.add(var7);

        }
    }

    @Override
    public boolean X() {
        return lIIIllllIIIII[0];
    }

    private static boolean lIlIIlIlIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIlIIllIII(int n2) {
        return n2 > 0;
    }

    private static void lIlIIlIlIIlIIlI() {
        lIIIlllIllIll = new String[lIIIllllIIIII[25]];
        i.lIIIlllIllIll[i.lIIIllllIIIII[0]] = "Buying items";
        i.lIIIlllIllIll[i.lIIIllllIIIII[1]] = "Finished buying items, switching back to magic training";
        i.lIIIlllIllIll[i.lIIIllllIIIII[2]] = "Navigating to bank";
        i.lIIIlllIllIll[i.lIIIllllIIIII[3]] = "Handling banking";
        i.lIIIlllIllIll[i.lIIIllllIIIII[5]] = "We are missing supplies, switching to BUYING";
        i.lIIIlllIllIll[i.lIIIllllIIIII[17]] = "Nav to cows";
        i.lIIIlllIllIll[i.lIIIllllIIIII[24]] = "Attacking cows";
        i.lIIIlllIllIll[i.lIIIllllIIIII[26]] = "Casting varrock tele";
        i.lIIIlllIllIll[i.lIIIllllIIIII[29]] = "Casting lumby tele";
        i.lIIIlllIllIll[i.lIIIllllIIIII[31]] = "Casting fally tele";
        i.lIIIlllIllIll[i.lIIIllllIIIII[32]] = "Casting cammy tele";
        i.lIIIlllIllIll[i.lIIIllllIIIII[33]] = "Alching";
        i.lIIIlllIllIll[i.lIIIllllIIIII[34]] = "Wield";
        i.lIIIlllIllIll[i.lIIIllllIIIII[36]] = "Move to alch spot";
        i.lIIIlllIllIll[i.lIIIllllIIIII[40]] = "Nav to cows";
        i.lIIIlllIllIll[i.lIIIllllIIIII[41]] = "Eat";
        i.lIIIlllIllIll[i.lIIIllllIIIII[42]] = "Cow";
        i.lIIIlllIllIll[i.lIIIllllIIIII[43]] = "cow";
        i.lIIIlllIllIll[i.lIIIllllIIIII[45]] = "Attacking cows";
        i.lIIIlllIllIll[i.lIIIllllIIIII[46]] = "Attack";
        i.lIIIlllIllIll[i.lIIIllllIIIII[47]] = "In combat";
        i.lIIIlllIllIll[i.lIIIllllIIIII[51]] = "Opening autocast";
        i.lIIIlllIllIll[i.lIIIllllIIIII[52]] = "Choose spell";
        i.lIIIlllIllIll[i.lIIIllllIIIII[54]] = "Wind Strike";
        i.lIIIlllIllIll[i.lIIIllllIIIII[55]] = "Water Strike";
        i.lIIIlllIllIll[i.lIIIllllIIIII[19]] = "Earth Strike";
        i.lIIIlllIllIll[i.lIIIllllIIIII[50]] = "Earth Strike";
        i.lIIIlllIllIll[i.lIIIllllIIIII[56]] = "Fire Strike";
        i.lIIIlllIllIll[i.lIIIllllIIIII[72]] = "Magic training";
        i.lIIIlllIllIll[i.lIIIllllIIIII[74]] = "ring of wealth (";
        i.lIIIlllIllIll[i.lIIIllllIIIII[75]] = "Cow";
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[73])) {
            bl = lIIIllllIIIII[1];

            if ((0x79 ^ 0x7C) == 0) {
                return false;
            }
        } else {
            bl = lIIIllllIIIII[0];
        }
        return bl;
    }

    public static void Q() {
        if (i.lIlIIlIlIIlIlII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (i.lIlIIlIlIIlIllI(bB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[40]];
            Movement.walkTo((WorldPoint)bC);

            Time.sleepTicks((int)lIIIllllIIIII[1]);

        }
        if (i.lIlIIlIlIIlIlII(bB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            i.R();
        }
    }

    @Override
    public int Y() {
        try {
            i.P();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 == (0xC2 ^ 0xC6)) {
            return (0xB9 ^ 0x85) & ~(0x61 ^ 0x5D);
        }
        return lIIIllllIIIII[67];
    }

    static {
        i.lIlIIlIlIIlIIll();
        i.lIlIIlIlIIlIIlI();
        bA = new ArrayList<d>();
        bB = new WorldArea(lIIIllllIIIII[76], lIIIllllIIIII[77], lIIIllllIIIII[47], lIIIllllIIIII[40], lIIIllllIIIII[0]);
        bC = new WorldPoint(lIIIllllIIIII[78], lIIIllllIIIII[79], lIIIllllIIIII[0]);
        bD = new WorldPoint(lIIIllllIIIII[80] + e.c(lIIIllllIIIII[1], lIIIllllIIIII[5]), lIIIllllIIIII[81], lIIIllllIIIII[0]);
    }

    private static boolean lIlIIlIlIIllllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIlIlIIlIlII(int n2) {
        return n2 != 0;
    }

    private static int lIlIIlIlIIllIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }
}

