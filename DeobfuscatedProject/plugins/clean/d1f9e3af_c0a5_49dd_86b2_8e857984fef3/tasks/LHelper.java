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
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.ZHelper;
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

public class LHelper
implements W {
    static  WorldPoint by;
    static  WorldArea bw;
    
    public static  boolean bt;
    public static  List<d> bv;
    
    public static  boolean bu;
    static  WorldPoint bx;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
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
                                                    if (!l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[19])) break block19;
                                                    int[] nArray = new int[lIIlllIIl[1]];
                                                    nArray[l.lIIlllIIl[0]] = lIIlllIIl[7];
                                                    if (!l.lIIIIIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIlllIIl[1]];
                                                    nArray2[l.lIIlllIIl[0]] = lIIlllIIl[11];
                                                    if (!l.lIIIIIlIIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIlllIIl[1]];
                                                    nArray3[l.lIIlllIIl[0]] = lIIlllIIl[9];
                                                    if (!l.lIIIIIlIIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIlllIIl[1]];
                                                    nArray4[l.lIIlllIIl[0]] = lIIlllIIl[12];
                                                    if (!l.lIIIIIlIIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIlllIIl[1]];
                                                    nArray5[l.lIIlllIIl[0]] = lIIlllIIl[18];
                                                    if (!l.lIIIIIlIIIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIlllIIl[1]];
                                                    nArray6[l.lIIlllIIl[0]] = lIIlllIIl[44];
                                                    if (!l.lIIIIIlIIlII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIlllIIl[1]];
                                                    nArray7[l.lIIlllIIl[0]] = lIIlllIIl[44];
                                                    if (!l.lIIIIIlIIIlI(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIlllIIl[1];

                                                if (-1 <= 1) return n5 != 0;
                                                return false;
                                            }
                                            n5 = lIIlllIIl[0];
                                            return n5 != 0;
                                        }
                                        if (!l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[19]) || !l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6])) break block22;
                                        int[] nArray = new int[lIIlllIIl[1]];
                                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[11];
                                        if (!l.lIIIIIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIlllIIl[1]];
                                        nArray8[l.lIIlllIIl[0]] = lIIlllIIl[9];
                                        if (!l.lIIIIIlIIIlI(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIlllIIl[1]];
                                        nArray9[l.lIIlllIIl[0]] = lIIlllIIl[12];
                                        if (!l.lIIIIIlIIIlI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIlllIIl[1]];
                                        nArray10[l.lIIlllIIl[0]] = lIIlllIIl[14];
                                        if (!l.lIIIIIlIIIlI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIlllIIl[1]];
                                        nArray11[l.lIIlllIIl[0]] = lIIlllIIl[44];
                                        if (!l.lIIIIIlIIlII(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIlllIIl[1]];
                                        nArray12[l.lIIlllIIl[0]] = lIIlllIIl[44];
                                        if (!l.lIIIIIlIIIlI(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIlllIIl[1];

                                    if ((1 ^ (0xA4 ^ 0xA0)) != 0) return n4 != 0;
                                    return ((0x2E ^ 0x4F ^ (0x7C ^ 0x11)) & (0x15 ^ 0x20 ^ (0xAE ^ 0x97) ^ -1)) != 0;
                                }
                                n4 = lIIlllIIl[0];
                                return n4 != 0;
                            }
                            if (!l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6]) || !l.lIIIIIlIIlII(bu ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIlllIIl[1]];
                            nArray[l.lIIlllIIl[0]] = lIIlllIIl[20];
                            if (!l.lIIIIIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIlllIIl[1]];
                            nArray13[l.lIIlllIIl[0]] = lIIlllIIl[20];
                            if (!l.lIIIIIlIIIlI(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIlllIIl[1]];
                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[22];
                        if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIlllIIl[1]];
                            nArray14[l.lIIlllIIl[0]] = lIIlllIIl[35];
                            if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIlllIIl[1];

                                if (1 <= (0xD5 ^ 0xC0 ^ (0xA5 ^ 0xB4))) return n3 != 0;
                                return ((0xBD ^ 0xC3 ^ (0x6A ^ 0)) & (0xE0 ^ 0xBC ^ (0x27 ^ 0x6F) ^ -1)) != 0;
                            }
                        }
                    }
                    n3 = lIIlllIIl[0];
                    return n3 != 0;
                }
                if (!l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6]) || !l.lIIIIIlIIIlI(bu ? 1 : 0)) return lIIlllIIl[0];
                int[] nArray = new int[lIIlllIIl[1]];
                nArray[l.lIIlllIIl[0]] = lIIlllIIl[20];
                if (!l.lIIIIIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIlllIIl[1]];
                nArray15[l.lIIlllIIl[0]] = lIIlllIIl[20];
                if (!l.lIIIIIlIIIlI(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIlllIIl[1]];
            nArray[l.lIIlllIIl[0]] = lIIlllIIl[14];
            if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIlllIIl[1]];
                nArray16[l.lIIlllIIl[0]] = lIIlllIIl[21];
                if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIlllIIl[1]];
                    nArray17[l.lIIlllIIl[0]] = lIIlllIIl[21];
                    if (l.lIIIIIlIIlll(Inventory.getFirst((int[])nArray17).getQuantity(), lIIlllIIl[17])) {
                        int[] nArray18 = new int[lIIlllIIl[1]];
                        nArray18[l.lIIlllIIl[0]] = lIIlllIIl[22];
                        if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIlllIIl[1]];
                            nArray19[l.lIIlllIIl[0]] = lIIlllIIl[35];
                            if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIlllIIl[1];

                                if (-1 <= 1) return n2 != 0;
                                return (1 & (1 ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIlllIIl[0];
        return n2 != 0;
    }

    public static void ae() {
        if (l.lIIIIIlIIlIl(Widgets.get((int)lIIlllIIl[49], (int)lIIlllIIl[50]))) {
            AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[51]];
            Widgets.get((int)lIIlllIIl[49], (int)lIIlllIIl[50]).interact(lIIllIlll[lIIlllIIl[52]]);
            Time.sleepTicks((int)lIIlllIIl[5]);

        }
        if (l.lIIIIIlIlIll(Widgets.get((int)lIIlllIIl[49], (int)lIIlllIIl[50])) && l.lIIIIIlIIlII(Widgets.get((int)lIIlllIIl[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIIlllIIl[1]);

            if (l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[17])) {
                Widgets.get((int)lIIlllIIl[53], (int)lIIlllIIl[1]).getChild(lIIlllIIl[1]).interact(lIIllIlll[lIIlllIIl[54]]);
            }
            if (l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[31]) && l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[17])) {
                Widgets.get((int)lIIlllIIl[53], (int)lIIlllIIl[1]).getChild(lIIlllIIl[2]).interact(lIIllIlll[lIIlllIIl[55]]);
            }
            if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[31]) && l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[36])) {
                Widgets.get((int)lIIlllIIl[53], (int)lIIlllIIl[1]).getChild(lIIlllIIl[3]).interact(lIIllIlll[lIIlllIIl[19]]);
            }
            if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[31])) {
                int[] nArray = new int[lIIlllIIl[1]];
                nArray[l.lIIlllIIl[0]] = lIIlllIIl[12];
                if (l.lIIIIIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIlllIIl[53], (int)lIIlllIIl[1]).getChild(lIIlllIIl[3]).interact(lIIllIlll[lIIlllIIl[50]]);
                }
            }
            if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[36])) {
                int[] nArray = new int[lIIlllIIl[1]];
                nArray[l.lIIlllIIl[0]] = lIIlllIIl[12];
                if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIlllIIl[53], (int)lIIlllIIl[1]).getChild(lIIlllIIl[5]).interact(lIIllIlll[lIIlllIIl[56]]);
                }
            }
            Time.sleepTicks((int)lIIlllIIl[1]);

        }
    }

    private static void lIIIIIlIIIII() {
        lIIllIlll = new String[lIIlllIIl[25]];
        l.lIIllIlll[l.lIIlllIIl[0]] = "Buying items";
        l.lIIllIlll[l.lIIlllIIl[1]] = "Finished buying items, switching back to magic training";
        l.lIIllIlll[l.lIIlllIIl[2]] = "Navigating to bank";
        l.lIIllIlll[l.lIIlllIIl[3]] = "Handling banking";
        l.lIIllIlll[l.lIIlllIIl[5]] = "We are missing supplies, switching to BUYING";
        l.lIIllIlll[l.lIIlllIIl[17]] = "Nav to cows";
        l.lIIllIlll[l.lIIlllIIl[24]] = "Attacking cows";
        l.lIIllIlll[l.lIIlllIIl[26]] = "Casting varrock tele";
        l.lIIllIlll[l.lIIlllIIl[29]] = "Casting lumby tele";
        l.lIIllIlll[l.lIIlllIIl[31]] = "Casting fally tele";
        l.lIIllIlll[l.lIIlllIIl[32]] = "Casting cammy tele";
        l.lIIllIlll[l.lIIlllIIl[33]] = "Alching";
        l.lIIllIlll[l.lIIlllIIl[34]] = "Wield";
        l.lIIllIlll[l.lIIlllIIl[36]] = "Move to alch spot";
        l.lIIllIlll[l.lIIlllIIl[40]] = "Nav to cows";
        l.lIIllIlll[l.lIIlllIIl[41]] = "Eat";
        l.lIIllIlll[l.lIIlllIIl[42]] = "Cow";
        l.lIIllIlll[l.lIIlllIIl[43]] = "cow";
        l.lIIllIlll[l.lIIlllIIl[45]] = "Attacking cows";
        l.lIIllIlll[l.lIIlllIIl[46]] = "Attack";
        l.lIIllIlll[l.lIIlllIIl[47]] = "In combat";
        l.lIIllIlll[l.lIIlllIIl[51]] = "Opening autocast";
        l.lIIllIlll[l.lIIlllIIl[52]] = "Choose spell";
        l.lIIllIlll[l.lIIlllIIl[54]] = "Wind Strike";
        l.lIIllIlll[l.lIIlllIIl[55]] = "Water Strike";
        l.lIIllIlll[l.lIIlllIIl[19]] = "Earth Strike";
        l.lIIllIlll[l.lIIlllIIl[50]] = "Earth Strike";
        l.lIIllIlll[l.lIIlllIIl[56]] = "Fire Strike";
        l.lIIllIlll[l.lIIlllIIl[72]] = "Magic training";
        l.lIIllIlll[l.lIIlllIIl[74]] = "ring of wealth (";
        l.lIIllIlll[l.lIIlllIIl[75]] = "Cow";
    }

    private static boolean lIIIIIlIlIll(Object object) {
        return object == null;
    }

    private static boolean lIIIIIlIllIl(int n2, int n3) {
        return n2 > n3;
    }

    static {
        l.lIIIIIlIIIIl();
        l.lIIIIIlIIIII();
        bv = new ArrayList<d>();
        bw = new WorldArea(lIIlllIIl[76], lIIlllIIl[77], lIIlllIIl[47], lIIlllIIl[40], lIIlllIIl[0]);
        bx = new WorldPoint(lIIlllIIl[78], lIIlllIIl[79], lIIlllIIl[0]);
        by = new WorldPoint(lIIlllIIl[80] + e.c(lIIlllIIl[1], lIIlllIIl[5]), lIIlllIIl[81], lIIlllIIl[0]);
    }

    public static boolean ad() {
        if (l.lIIIIIlIlIII(Vars.getBit((int)lIIlllIIl[48]), lIIlllIIl[1]) && l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[17])) {
            return lIIlllIIl[1];
        }
        if (l.lIIIIIlIlIII(Vars.getBit((int)lIIlllIIl[48]), lIIlllIIl[2]) && l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[31]) && l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[17])) {
            return lIIlllIIl[1];
        }
        if (l.lIIIIIlIlIII(Vars.getBit((int)lIIlllIIl[48]), lIIlllIIl[3]) && l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[31]) && l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[36])) {
            return lIIlllIIl[1];
        }
        if (l.lIIIIIlIlIII(Vars.getBit((int)lIIlllIIl[48]), lIIlllIIl[3]) && l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[31])) {
            int[] nArray = new int[lIIlllIIl[1]];
            nArray[l.lIIlllIIl[0]] = lIIlllIIl[12];
            if (l.lIIIIIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIlllIIl[1];
            }
        }
        if (l.lIIIIIlIlIII(Vars.getBit((int)lIIlllIIl[48]), lIIlllIIl[5]) && l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[36])) {
            int[] nArray = new int[lIIlllIIl[1]];
            nArray[l.lIIlllIIl[0]] = lIIlllIIl[12];
            if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIlllIIl[1];
            }
        }
        return lIIlllIIl[0];
    }

    private static boolean lIIIIIlIIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIlIlIlI(int n2) {
        return n2 < 0;
    }

    private static boolean lIIIIIlIIlIl(Object object) {
        return object != null;
    }

    private static boolean lIIIIIlIIIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
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
                                                    if (!l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[19])) break block19;
                                                    int[] nArray = new int[lIIlllIIl[1]];
                                                    nArray[l.lIIlllIIl[0]] = lIIlllIIl[7];
                                                    if (!l.lIIIIIlIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIlllIIl[1]];
                                                    nArray2[l.lIIlllIIl[0]] = lIIlllIIl[11];
                                                    if (!l.lIIIIIlIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIlllIIl[1]];
                                                    nArray3[l.lIIlllIIl[0]] = lIIlllIIl[9];
                                                    if (!l.lIIIIIlIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIlllIIl[1]];
                                                    nArray4[l.lIIlllIIl[0]] = lIIlllIIl[12];
                                                    if (!l.lIIIIIlIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIlllIIl[1]];
                                                    nArray5[l.lIIlllIIl[0]] = lIIlllIIl[18];
                                                    if (!l.lIIIIIlIIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIlllIIl[1]];
                                                    nArray6[l.lIIlllIIl[0]] = lIIlllIIl[44];
                                                    if (!l.lIIIIIlIIlII(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIlllIIl[1]];
                                                    nArray7[l.lIIlllIIl[0]] = lIIlllIIl[44];
                                                    if (!l.lIIIIIlIIIlI(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIlllIIl[1];

                                                if (((2 ^ 0x50) & ~(0x1B ^ 0x49)) == ((0x3E ^ 0x2D) & ~(0x12 ^ 1))) return n5 != 0;
                                                return false;
                                            }
                                            n5 = lIIlllIIl[0];
                                            return n5 != 0;
                                        }
                                        if (!l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[19]) || !l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6])) break block22;
                                        int[] nArray = new int[lIIlllIIl[1]];
                                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[11];
                                        if (!l.lIIIIIlIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIlllIIl[1]];
                                        nArray8[l.lIIlllIIl[0]] = lIIlllIIl[9];
                                        if (!l.lIIIIIlIIIlI(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIlllIIl[1]];
                                        nArray9[l.lIIlllIIl[0]] = lIIlllIIl[12];
                                        if (!l.lIIIIIlIIIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIlllIIl[1]];
                                        nArray10[l.lIIlllIIl[0]] = lIIlllIIl[14];
                                        if (!l.lIIIIIlIIIlI(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIlllIIl[1]];
                                        nArray11[l.lIIlllIIl[0]] = lIIlllIIl[44];
                                        if (!l.lIIIIIlIIlII(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIlllIIl[1]];
                                        nArray12[l.lIIlllIIl[0]] = lIIlllIIl[44];
                                        if (!l.lIIIIIlIIIlI(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIlllIIl[1];

                                    if (-1 < 3) return n4 != 0;
                                    return false;
                                }
                                n4 = lIIlllIIl[0];
                                return n4 != 0;
                            }
                            if (!l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6]) || !l.lIIIIIlIIlII(bu ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIlllIIl[1]];
                            nArray[l.lIIlllIIl[0]] = lIIlllIIl[20];
                            if (!l.lIIIIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIlllIIl[1]];
                            nArray13[l.lIIlllIIl[0]] = lIIlllIIl[20];
                            if (!l.lIIIIIlIIIlI(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIlllIIl[1]];
                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[22];
                        if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIlllIIl[1]];
                            nArray14[l.lIIlllIIl[0]] = lIIlllIIl[23];
                            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIlllIIl[1];

                                if ((3 ^ 6) != 0) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = lIIlllIIl[0];
                    return n3 != 0;
                }
                if (!l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6]) || !l.lIIIIIlIIIlI(bu ? 1 : 0)) return lIIlllIIl[0];
                int[] nArray = new int[lIIlllIIl[1]];
                nArray[l.lIIlllIIl[0]] = lIIlllIIl[20];
                if (!l.lIIIIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIlllIIl[1]];
                nArray15[l.lIIlllIIl[0]] = lIIlllIIl[20];
                if (!l.lIIIIIlIIIlI(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIlllIIl[1]];
            nArray[l.lIIlllIIl[0]] = lIIlllIIl[14];
            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIlllIIl[1]];
                nArray16[l.lIIlllIIl[0]] = lIIlllIIl[21];
                if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIlllIIl[1]];
                    nArray17[l.lIIlllIIl[0]] = lIIlllIIl[21];
                    if (l.lIIIIIlIIlll(Bank.getFirst((int[])nArray17).getQuantity(), lIIlllIIl[17])) {
                        int[] nArray18 = new int[lIIlllIIl[1]];
                        nArray18[l.lIIlllIIl[0]] = lIIlllIIl[22];
                        if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIlllIIl[1]];
                            nArray19[l.lIIlllIIl[0]] = lIIlllIIl[23];
                            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIlllIIl[1];

                                if (null == null) return n2 != 0;
                                return ((0xE5 ^ 0x89 ^ (0x60 ^ 0x17)) & (6 + 13 - -10 + 154 ^ 7 + 74 - 53 + 144 ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIlllIIl[0];
        return n2 != 0;
    }

    @Override
    public String U() {
        return lIIllIlll[lIIlllIIl[72]];
    }

    @Override
    public boolean S() {
        return lIIlllIIl[0];
    }

    private static int lIIIIIlIlIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void af() {
        d lIIIIIIIIIlIlII;
        Object lIIIIIIIIIlIlIl;
        if (l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6])) {
            int[] nArray = new int[lIIlllIIl[1]];
            nArray[l.lIIlllIIl[0]] = lIIlllIIl[14];
            if (l.lIIIIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new DHelper(lIIlllIIl[14], lIIlllIIl[57], lIIlllIIl[58]);
                bv.add(d2);

            }
            int[] nArray2 = new int[lIIlllIIl[1]];
            nArray2[l.lIIlllIIl[0]] = lIIlllIIl[7];
            if (l.lIIIIIlIIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                lIIIIIIIIIlIlIl = new DHelper(lIIlllIIl[7], lIIlllIIl[59], lIIlllIIl[24]);
                bv.add((DHelper) IIIIIIIIIlIlIl);

            }
            int[] nArray3 = new int[lIIlllIIl[1]];
            nArray3[l.lIIlllIIl[0]] = lIIlllIIl[9];
            if (l.lIIIIIlIIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                lIIIIIIIIIlIlIl = new DHelper(lIIlllIIl[9], lIIlllIIl[60], lIIlllIIl[24]);
                bv.add((DHelper) IIIIIIIIIlIlIl);

            }
            int[] nArray4 = new int[lIIlllIIl[1]];
            nArray4[l.lIIlllIIl[0]] = lIIlllIIl[11];
            if (l.lIIIIIlIIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                lIIIIIIIIIlIlIl = new DHelper(lIIlllIIl[11], lIIlllIIl[61], lIIlllIIl[24]);
                bv.add((DHelper) IIIIIIIIIlIlIl);

            }
            int[] nArray5 = new int[lIIlllIIl[1]];
            nArray5[l.lIIlllIIl[0]] = lIIlllIIl[12];
            if (l.lIIIIIlIIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                lIIIIIIIIIlIlIl = new DHelper(lIIlllIIl[12], lIIlllIIl[4], lIIlllIIl[24]);
                bv.add((DHelper) IIIIIIIIIlIlIl);

            }
            int[] nArray6 = new int[lIIlllIIl[1]];
            nArray6[l.lIIlllIIl[0]] = lIIlllIIl[44];
            if (l.lIIIIIlIIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                lIIIIIIIIIlIlIl = new DHelper(lIIlllIIl[44], lIIlllIIl[1], e.c(lIIlllIIl[62], lIIlllIIl[63]));
                bv.add((DHelper) IIIIIIIIIlIlIl);

            }
        }
        if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6])) {
            int[] nArray = new int[lIIlllIIl[1]];
            nArray[l.lIIlllIIl[0]] = lIIlllIIl[22];
            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lIIlllIIl[1]];
                nArray7[l.lIIlllIIl[0]] = lIIlllIIl[22];
                if (l.lIIIIIlIIIll(Bank.getFirst((int[])nArray7).getQuantity(), lIIlllIIl[61])) {
                    int[] nArray8 = new int[lIIlllIIl[1]];
                    nArray8[l.lIIlllIIl[0]] = lIIlllIIl[22];
                    lIIIIIIIIIlIlIl = new DHelper(lIIlllIIl[22], lIIlllIIl[61] - Bank.getFirst((int[])nArray8).getQuantity(), lIIlllIIl[64]);
                    bv.add((DHelper) IIIIIIIIIlIlIl);

                }
            }
            int[] nArray9 = new int[lIIlllIIl[1]];
            nArray9[l.lIIlllIIl[0]] = lIIlllIIl[22];
            if (l.lIIIIIlIIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                lIIIIIIIIIlIlIl = new DHelper(lIIlllIIl[22], lIIlllIIl[61], lIIlllIIl[64]);
                bv.add((DHelper) IIIIIIIIIlIlIl);

            }
            int[] nArray10 = new int[lIIlllIIl[1]];
            nArray10[l.lIIlllIIl[0]] = lIIlllIIl[23];
            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIIlllIIl[1]];
                nArray11[l.lIIlllIIl[0]] = lIIlllIIl[23];
                if (l.lIIIIIlIIIll(Bank.getFirst((int[])nArray11).getQuantity(), lIIlllIIl[61])) {
                    int[] nArray12 = new int[lIIlllIIl[1]];
                    nArray12[l.lIIlllIIl[0]] = lIIlllIIl[23];
                    lIIIIIIIIIlIlIl = new DHelper(lIIlllIIl[23], lIIlllIIl[61] - Bank.getFirst((int[])nArray12).getQuantity(), lIIlllIIl[65]);
                    bv.add((DHelper) IIIIIIIIIlIlIl);

                }
            }
            int[] nArray13 = new int[lIIlllIIl[1]];
            nArray13[l.lIIlllIIl[0]] = lIIlllIIl[23];
            if (l.lIIIIIlIIlII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                lIIIIIIIIIlIlIl = new DHelper(lIIlllIIl[23], lIIlllIIl[61], lIIlllIIl[65]);
                bv.add((DHelper) IIIIIIIIIlIlIl);

            }
            int[] nArray14 = new int[lIIlllIIl[1]];
            nArray14[l.lIIlllIIl[0]] = lIIlllIIl[20];
            if (l.lIIIIIlIIlII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIIlllIIl[1]];
                nArray15[l.lIIlllIIl[0]] = lIIlllIIl[20];
                if (l.lIIIIIlIIlII(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    lIIIIIIIIIlIlIl = new DHelper(lIIlllIIl[20], lIIlllIIl[1], lIIlllIIl[66]);
                    bv.add((DHelper) IIIIIIIIIlIlIl);

                }
            }
            if (l.lIIIIIlIIIlI(bu ? 1 : 0)) {
                int[] nArray16 = new int[lIIlllIIl[1]];
                nArray16[l.lIIlllIIl[0]] = lIIlllIIl[14];
                if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIlllIIl[1]];
                    nArray17[l.lIIlllIIl[0]] = lIIlllIIl[14];
                    if (l.lIIIIIlIIIll(Bank.getFirst((int[])nArray17).getQuantity(), lIIlllIIl[61])) {
                        int[] nArray18 = new int[lIIlllIIl[1]];
                        nArray18[l.lIIlllIIl[0]] = lIIlllIIl[14];
                        lIIIIIIIIIlIlIl = new DHelper(lIIlllIIl[14], lIIlllIIl[61] - Bank.getFirst((int[])nArray18).getQuantity(), lIIlllIIl[58]);
                        bv.add((DHelper) IIIIIIIIIlIlIl);

                    }
                }
                int[] nArray19 = new int[lIIlllIIl[1]];
                nArray19[l.lIIlllIIl[0]] = lIIlllIIl[14];
                if (l.lIIIIIlIIlII(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    lIIIIIIIIIlIlIl = new DHelper(lIIlllIIl[14], lIIlllIIl[61], lIIlllIIl[58]);
                    bv.add((DHelper) IIIIIIIIIlIlIl);

                }
                int[] nArray20 = new int[lIIlllIIl[1]];
                nArray20[l.lIIlllIIl[0]] = lIIlllIIl[21];
                if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIIlllIIl[1]];
                    nArray21[l.lIIlllIIl[0]] = lIIlllIIl[21];
                    if (l.lIIIIIlIIIll(Bank.getFirst((int[])nArray21).getQuantity(), lIIlllIIl[66])) {
                        int[] nArray22 = new int[lIIlllIIl[1]];
                        nArray22[l.lIIlllIIl[0]] = lIIlllIIl[21];
                        lIIIIIIIIIlIlIl = new DHelper(lIIlllIIl[21], lIIlllIIl[66] - Bank.getFirst((int[])nArray22).getQuantity(), lIIlllIIl[24]);
                        bv.add((DHelper) IIIIIIIIIlIlIl);

                    }
                }
                int[] nArray23 = new int[lIIlllIIl[1]];
                nArray23[l.lIIlllIIl[0]] = lIIlllIIl[21];
                if (l.lIIIIIlIIlII(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    lIIIIIIIIIlIlIl = new DHelper(lIIlllIIl[21], lIIlllIIl[66], lIIlllIIl[24]);
                    bv.add((DHelper) IIIIIIIIIlIlIl);

                }
            }
        }
        int[] nArray = new int[lIIlllIIl[1]];
        nArray[l.lIIlllIIl[0]] = lIIlllIIl[18];
        if (l.lIIIIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIIIIIIIIlIlIl = new DHelper(lIIlllIIl[18], lIIlllIIl[67], lIIlllIIl[37]);
            bv.add((DHelper) IIIIIIIIIlIlIl);

        }
        if (l.lIIIIIlIIlII(Bank.contains(lIIIIIIIIIlIlIl = item -> item.getName().toLowerCase().contains(lIIllIlll[lIIlllIIl[74]])) ? 1 : 0)) {
            lIIIIIIIIIlIlII = new DHelper(lIIlllIIl[68], lIIlllIIl[17], lIIlllIIl[69]);
            bv.add(lIIIIIIIIIlIlII);

        }
        int[] nArray24 = new int[lIIlllIIl[1]];
        nArray24[l.lIIlllIIl[0]] = lIIlllIIl[70];
        if (l.lIIIIIlIIlII(Bank.contains((int[])nArray24) ? 1 : 0)) {
            lIIIIIIIIIlIlII = new DHelper(lIIlllIIl[70], lIIlllIIl[32], lIIlllIIl[71]);
            bv.add(lIIIIIIIIIlIlII);

        }
        int[] nArray25 = new int[lIIlllIIl[1]];
        nArray25[l.lIIlllIIl[0]] = lIIlllIIl[16];
        if (l.lIIIIIlIIlII(Bank.contains((int[])nArray25) ? 1 : 0)) {
            lIIIIIIIIIlIlII = new DHelper(lIIlllIIl[16], lIIlllIIl[32], lIIlllIIl[71]);
            bv.add(lIIIIIIIIIlIlII);

        }
    }

    private static boolean lIIIIIlIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    public static void Z() {
        if (l.lIIIIIlIIIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (l.lIIIIIlIIlII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[40]];
            Movement.walkTo((WorldPoint)bx);

            Time.sleepTicks((int)lIIlllIIl[1]);

        }
        if (l.lIIIIIlIIIlI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            l.aa();
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[73])) {
            bl = lIIlllIIl[1];

        } else {
            bl = lIIlllIIl[0];
        }
        return bl;
    }

        return String.valueOf(llllllllllIIII);
    }

    public static void Y() {
        if (l.lIIIIIlIIIlI(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[0]];
            b.a(bv);
            if (l.lIIIIIlIIIll(bv.size(), lIIlllIIl[1])) {
                System.out.println(lIIllIlll[lIIlllIIl[1]]);
                bt = lIIlllIIl[0];
            }
        }
        if (l.lIIIIIlIIlII(bt ? 1 : 0)) {
            BankLocation lIIIIIIIIIllllI;
            if (l.lIIIIIlIIlII(l.ab() ? 1 : 0)) {
                lIIIIIIIIIllllI = BankLocation.getNearest();
                if (l.lIIIIIlIIlIl(lIIIIIIIIIllllI) && l.lIIIIIlIIlII(lIIIIIIIIIllllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[2]];
                    a.a(lIIIIIIIIIllllI);
                }
                if (l.lIIIIIlIIlIl(lIIIIIIIIIllllI) && l.lIIIIIlIIIlI(lIIIIIIIIIllllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[3]];
                    if (l.lIIIIIlIIlII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlllIIl[4]);

                    }
                    if (l.lIIIIIlIIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (l.lIIIIIlIIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlllIIl[5]);

                        }
                        while (l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6]) && l.lIIIIIlIIlII(z.bi() ? 1 : 0)) {
                            z.bg();
                            Time.sleepTicks((int)lIIlllIIl[1]);

                            return;
                        }
                        if (l.lIIIIIlIIlII(l.ac() ? 1 : 0)) {
                            l.af();
                            System.out.println(lIIllIlll[lIIlllIIl[5]]);
                            bt = lIIlllIIl[1];
                            return;
                        }
                        if (l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6])) {
                            int[] nArray = new int[lIIlllIIl[1]];
                            nArray[l.lIIlllIIl[0]] = lIIlllIIl[7];
                            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIlllIIl[1]];
                                nArray2[l.lIIlllIIl[0]] = lIIlllIIl[7];
                                if (l.lIIIIIlIIIll(Inventory.getCount((int[])nArray2), lIIlllIIl[1])) {
                                    Bank.withdraw((int)lIIlllIIl[7], (int)lIIlllIIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllIIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlllIIl[1]];
                                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[7];
                                        if (l.lIIIIIlIIllI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlllIIl[1];

                                        } else {
                                            bl = lIIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlllIIl[4]);

                                }
                            }
                            int[] nArray3 = new int[lIIlllIIl[1]];
                            nArray3[l.lIIlllIIl[0]] = lIIlllIIl[9];
                            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIlllIIl[1]];
                                nArray4[l.lIIlllIIl[0]] = lIIlllIIl[9];
                                if (l.lIIIIIlIIIll(Inventory.getCount((int[])nArray4), lIIlllIIl[1])) {
                                    Bank.withdraw((int)lIIlllIIl[9], (int)lIIlllIIl[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllIIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlllIIl[1]];
                                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[9];
                                        if (l.lIIIIIlIIllI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlllIIl[1];

                                            if ((0x17 ^ 0x12) <= 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlllIIl[4]);

                                }
                            }
                            int[] nArray5 = new int[lIIlllIIl[1]];
                            nArray5[l.lIIlllIIl[0]] = lIIlllIIl[11];
                            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIlllIIl[1]];
                                nArray6[l.lIIlllIIl[0]] = lIIlllIIl[11];
                                if (l.lIIIIIlIIIll(Inventory.getCount((int[])nArray6), lIIlllIIl[1])) {
                                    Bank.withdraw((int)lIIlllIIl[11], (int)lIIlllIIl[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllIIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlllIIl[1]];
                                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[11];
                                        if (l.lIIIIIlIIllI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlllIIl[1];

                                            if (1 > 1) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlllIIl[4]);

                                }
                            }
                            int[] nArray7 = new int[lIIlllIIl[1]];
                            nArray7[l.lIIlllIIl[0]] = lIIlllIIl[12];
                            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIlllIIl[1]];
                                nArray8[l.lIIlllIIl[0]] = lIIlllIIl[12];
                                if (l.lIIIIIlIIIll(Inventory.getCount((int[])nArray8), lIIlllIIl[1])) {
                                    Bank.withdraw((int)lIIlllIIl[12], (int)lIIlllIIl[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllIIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlllIIl[1]];
                                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[12];
                                        if (l.lIIIIIlIIllI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlllIIl[1];

                                            if (-1 > 2) {
                                                return ((31 + 192 - -3 + 4 ^ 85 + 91 - 92 + 50) & (0xE7 ^ 0x9C ^ (0x4D ^ 0x56) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlllIIl[4]);

                                }
                            }
                            int[] nArray9 = new int[lIIlllIIl[1]];
                            nArray9[l.lIIlllIIl[0]] = lIIlllIIl[14];
                            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIlllIIl[1]];
                                nArray10[l.lIIlllIIl[0]] = lIIlllIIl[14];
                                if (l.lIIIIIlIIIll(Inventory.getCount((int[])nArray10), lIIlllIIl[1])) {
                                    Bank.withdraw((int)lIIlllIIl[14], (int)lIIlllIIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllIIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlllIIl[1]];
                                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[14];
                                        if (l.lIIIIIlIIllI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlllIIl[1];

                                        } else {
                                            bl = lIIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlllIIl[4]);

                                }
                            }
                            int[] nArray11 = new int[lIIlllIIl[1]];
                            nArray11[l.lIIlllIIl[0]] = lIIlllIIl[15];
                            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIIlllIIl[1]];
                                nArray12[l.lIIlllIIl[0]] = lIIlllIIl[15];
                                if (l.lIIIIIlIIlII(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lIIlllIIl[15], (int)lIIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllIIl[1]);

                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIIlllIIl[1]];
                                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[15];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIIlllIIl[4]);

                                }
                            }
                            Bank.withdraw((int)lIIlllIIl[16], (int)lIIlllIIl[17], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lIIlllIIl[1]];
                            nArray13[l.lIIlllIIl[0]] = lIIlllIIl[18];
                            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lIIlllIIl[1]];
                                nArray14[l.lIIlllIIl[0]] = lIIlllIIl[18];
                                if (l.lIIIIIlIIIll(Inventory.getCount((int[])nArray14), lIIlllIIl[1]) && l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[19])) {
                                    Bank.withdrawAll((int)lIIlllIIl[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllIIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlllIIl[1]];
                                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[18];
                                        if (l.lIIIIIlIIllI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlllIIl[1];

                                            if ((0x33 ^ 0x6C ^ (0xDE ^ 0x84)) <= 0) {
                                                return ((176 + 192 - 132 + 9 ^ 106 + 173 - 155 + 62) & (0 ^ 0x5B ^ (0x61 ^ 0x75) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlllIIl[4]);

                                }
                            }
                        }
                        if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6])) {
                            int[] nArray = new int[lIIlllIIl[1]];
                            nArray[l.lIIlllIIl[0]] = lIIlllIIl[20];
                            if (l.lIIIIIlIIlII(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIIlllIIl[20], (int)lIIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIlllIIl[1]);

                            }
                            if (l.lIIIIIlIIIlI(bu ? 1 : 0)) {
                                Bank.withdrawAll((int)lIIlllIIl[21], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIlllIIl[1]);

                                Bank.withdrawAll((int)lIIlllIIl[14], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIlllIIl[1]);

                            }
                            Bank.withdrawAll((int)lIIlllIIl[22], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIlllIIl[1]);

                            Bank.withdrawAll((int)lIIlllIIl[23], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIIlllIIl[1]);

                        }
                    }
                }
            }
            if (l.lIIIIIlIIIlI(l.ab() ? 1 : 0)) {
                if (l.lIIIIIlIIIlI(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[19])) {
                    if (l.lIIIIIlIIlII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[17]];
                        Movement.walkTo((WorldPoint)bx);

                        Time.sleepTicks((int)lIIlllIIl[1]);

                    }
                    if (l.lIIIIIlIIIlI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[24]];
                        l.aa();
                    }
                }
                if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[19]) && l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[25])) {
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[26]];
                    if (l.lIIIIIlIlIII(Players.getLocal().getAnimation(), lIIlllIIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lIIlllIIl[1]);

                    }
                }
                if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[25]) && l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[28])) {
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[29]];
                    if (l.lIIIIIlIlIII(Players.getLocal().getAnimation(), lIIlllIIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIIlllIIl[1]);

                    }
                }
                if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[28]) && l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[30])) {
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[31]];
                    if (l.lIIIIIlIlIII(Players.getLocal().getAnimation(), lIIlllIIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIIlllIIl[1]);

                    }
                }
                if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[30]) && l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6])) {
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[32]];
                    if (l.lIIIIIlIlIII(Players.getLocal().getAnimation(), lIIlllIIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIIlllIIl[1]);

                    }
                }
                if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6])) {
                    int lIIIIIIIIIlllII;
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[33]];
                    int[] nArray = new int[lIIlllIIl[1]];
                    nArray[l.lIIlllIIl[0]] = lIIlllIIl[20];
                    if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lIIlllIIl[1]];
                        nArray15[l.lIIlllIIl[0]] = lIIlllIIl[20];
                        if (l.lIIIIIlIIlII(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lIIlllIIl[1]];
                            nArray16[l.lIIlllIIl[0]] = lIIlllIIl[20];
                            Inventory.getFirst((int[])nArray16).interact(lIIllIlll[lIIlllIIl[34]]);
                            Time.sleepTicks((int)lIIlllIIl[1]);

                        }
                    }
                    if (l.lIIIIIlIIIlI(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lIIlllIIl[1]];
                    nArray17[l.lIIlllIIl[0]] = lIIlllIIl[22];
                    lIIIIIIIIIllllI = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lIIlllIIl[1]];
                    nArray18[l.lIIlllIIl[0]] = lIIlllIIl[35];
                    Item lIIIIIIIIIlllIl = Inventory.getFirst((int[])nArray18);
                    if (l.lIIIIIlIIlII(bu ? 1 : 0)) {
                        if (l.lIIIIIlIIlII(Players.getLocal().getWorldLocation().equals((Object)by) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[36]];
                            Movement.walkTo((WorldPoint)by);

                            Time.sleepTicks((int)lIIlllIIl[1]);

                        }
                        if (l.lIIIIIlIIIlI(Players.getLocal().getWorldLocation().equals((Object)by) ? 1 : 0) && l.lIIIIIlIIlIl(lIIIIIIIIIllllI) && l.lIIIIIlIIlIl(lIIIIIIIIIlllIl)) {
                            lIIIIIIIIIlllII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIIIIIIIIIlllIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (l.lIIIIIlIllIl(Skills.getExperience((Skill)Skill.MAGIC), lIIIIIIIIIlllII)) {
                                    bl = lIIlllIIl[1];

                                    if (2 <= 0) {
                                        return false;
                                    }
                                } else {
                                    bl = lIIlllIIl[0];
                                }
                                return bl;
                            }, (int)lIIlllIIl[8]);

                            Time.sleep((long)e.c(lIIlllIIl[37], lIIlllIIl[38]));

                        }
                    }
                    if (l.lIIIIIlIIIlI(bu ? 1 : 0)) {
                        if (l.lIIIIIlIIlIl(lIIIIIIIIIllllI) && l.lIIIIIlIIlIl(lIIIIIIIIIlllIl) && l.lIIIIIlIlIII(Players.getLocal().getAnimation(), lIIlllIIl[27])) {
                            lIIIIIIIIIlllII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIIIIIIIIIlllIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (l.lIIIIIlIllIl(Skills.getExperience((Skill)Skill.MAGIC), lIIIIIIIIIlllII)) {
                                    bl = lIIlllIIl[1];

                                    if (((0x73 ^ 0x54 ^ (0x3F ^ 0x78)) & (41 + 138 - -73 + 1 ^ 33 + 77 - -6 + 41 ^ -1)) != 0) {
                                        return ((85 + 67 - 33 + 24 ^ 92 + 68 - 61 + 63) & (0x76 ^ 0x62 ^ (0x9B ^ 0xA2) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIlllIIl[0];
                                }
                                return bl;
                            }, (int)lIIlllIIl[8]);

                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (l.lIIIIIlIlIII(Players.getLocal().getAnimation(), lIIlllIIl[27])) {
                                bl = lIIlllIIl[1];

                                if (-1 > 1) {
                                    return false;
                                }
                            } else {
                                bl = lIIlllIIl[0];
                            }
                            return bl;
                        }, (int)lIIlllIIl[39]);

                    }
                }
            }
        }
    }

    private static void aa() {
        if (l.lIIIIIlIlIlI(l.lIIIIIlIlIIl(e.u(), 30.0))) {
            int[] nArray = new int[lIIlllIIl[1]];
            nArray[l.lIIlllIIl[0]] = lIIlllIIl[18];
            if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIlllIIl[1]];
                nArray2[l.lIIlllIIl[0]] = lIIlllIIl[18];
                Inventory.getFirst((int[])nArray2).interact(lIIllIlll[lIIlllIIl[41]]);
                Time.sleepTicks((int)lIIlllIIl[1]);

            }
        }
        if (l.lIIIIIlIlIll(Players.getLocal().getInteracting())) {
            NPC lIIIIIIIIIllIIl = NPCs.getNearest(nPC -> {
                int n2;
                if (l.lIIIIIlIIIlI(nPC.getName().contains(lIIllIlll[lIIlllIIl[75]]) ? 1 : 0) && l.lIIIIIlIIlII(nPC.isDead() ? 1 : 0)) {
                    n2 = lIIlllIIl[1];

                    if (((0x69 ^ 0x6E ^ 1) & (0xF3 ^ 0x8B ^ (0x2A ^ 0x54) ^ -1)) != 0) {
                        return ((0xC4 ^ 0xBD ^ (0x60 ^ 0x2C)) & (0x59 ^ 0x72 ^ (0x48 ^ 0x56) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIlllIIl[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lIIlllIIl[2]];
            stringArray[l.lIIlllIIl[0]] = lIIllIlll[lIIlllIIl[42]];
            stringArray[l.lIIlllIIl[1]] = lIIllIlll[lIIlllIIl[43]];
            List lIIIIIIIIIllIII = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (l.lIIIIIlIllII(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIIlllIIl[1];

                    if (1 >= 2) {
                        return false;
                    }
                } else {
                    bl = lIIlllIIl[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lIIlllIIl[1]];
            nArray[l.lIIlllIIl[0]] = lIIlllIIl[44];
            if (l.lIIIIIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0) && l.lIIIIIlIIlII(l.ad() ? 1 : 0)) {
                l.ae();
            }
            if (l.lIIIIIlIIlIl(lIIIIIIIIIllIIl) && l.lIIIIIlIIlII(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[45]];
                lIIIIIIIIIllIIl.interact(lIIllIlll[lIIlllIIl[46]]);
                Time.sleepTicks((int)lIIlllIIl[3]);

            }
        }
        if (l.lIIIIIlIIlIl(Players.getLocal().getInteracting())) {
            AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[47]];
            Time.sleepTicks((int)lIIlllIIl[1]);

        }
    }

    private static boolean lIIIIIlIllII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIIIlIIllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIIlIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIlIlIII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int T() {
        try {
            l.Y();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0xE7 ^ 0xBC ^ (0x68 ^ 0x1A)) & (125 + 185 - 284 + 163 ^ 12 + 61 - 71 + 146 ^ -1)) == 2) {
            return (0xE1 ^ 0xC4 ^ (0x6F ^ 0x66)) & (0xCE ^ 0xBB ^ (0xD7 ^ 0x8E) ^ -1);
        }
        return lIIlllIIl[67];
    }
}

