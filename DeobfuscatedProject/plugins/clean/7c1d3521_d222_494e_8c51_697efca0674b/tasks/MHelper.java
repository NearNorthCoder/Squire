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
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import gg.squire.account.AccBuilderSotf;
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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.IHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;

public class MHelper
implements ac {
    public static  boolean ci;
    
    static  WorldPoint cl;
    
    public static  List<d> bv;
    static  WorldArea cj;
    static  WorldPoint ck;
    public static  boolean bt;

    private static boolean lIlIIIIIlIlII(int n2) {
        return n2 < 0;
    }

    public static boolean ap() {
        if (m.lIlIIIIIlIIlI(Vars.getBit((int)lIllllIlll[48]), lIllllIlll[1]) && m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[17])) {
            return lIllllIlll[1];
        }
        if (m.lIlIIIIIlIIlI(Vars.getBit((int)lIllllIlll[48]), lIllllIlll[2]) && m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[31]) && m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[17])) {
            return lIllllIlll[1];
        }
        if (m.lIlIIIIIlIIlI(Vars.getBit((int)lIllllIlll[48]), lIllllIlll[3]) && m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[31]) && m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[36])) {
            return lIllllIlll[1];
        }
        if (m.lIlIIIIIlIIlI(Vars.getBit((int)lIllllIlll[48]), lIllllIlll[3]) && m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[31])) {
            int[] nArray = new int[lIllllIlll[1]];
            nArray[m.lIllllIlll[0]] = lIllllIlll[12];
            if (m.lIlIIIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIllllIlll[1];
            }
        }
        if (m.lIlIIIIIlIIlI(Vars.getBit((int)lIllllIlll[48]), lIllllIlll[5]) && m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[36])) {
            int[] nArray = new int[lIllllIlll[1]];
            nArray[m.lIllllIlll[0]] = lIllllIlll[12];
            if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIllllIlll[1];
            }
        }
        return lIllllIlll[0];
    }

    public static void aq() {
        if (m.lIlIIIIIIllll(Widgets.get((int)lIllllIlll[49], (int)lIllllIlll[50]))) {
            AccBuilderSotf.c = lIllllIllI[lIllllIlll[51]];
            Widgets.get((int)lIllllIlll[49], (int)lIllllIlll[50]).interact(lIllllIllI[lIllllIlll[52]]);
            Time.sleepTicks((int)lIllllIlll[5]);

        }
        if (m.lIlIIIIIlIlIl(Widgets.get((int)lIllllIlll[49], (int)lIllllIlll[50])) && m.lIlIIIIIIlllI(Widgets.get((int)lIllllIlll[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIllllIlll[1]);

            if (m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[17])) {
                Widgets.get((int)lIllllIlll[53], (int)lIllllIlll[1]).getChild(lIllllIlll[1]).interact(lIllllIllI[lIllllIlll[54]]);
            }
            if (m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[31]) && m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[17])) {
                Widgets.get((int)lIllllIlll[53], (int)lIllllIlll[1]).getChild(lIllllIlll[2]).interact(lIllllIllI[lIllllIlll[55]]);
            }
            if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[31]) && m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[36])) {
                Widgets.get((int)lIllllIlll[53], (int)lIllllIlll[1]).getChild(lIllllIlll[3]).interact(lIllllIllI[lIllllIlll[19]]);
            }
            if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[31])) {
                int[] nArray = new int[lIllllIlll[1]];
                nArray[m.lIllllIlll[0]] = lIllllIlll[12];
                if (m.lIlIIIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIllllIlll[53], (int)lIllllIlll[1]).getChild(lIllllIlll[3]).interact(lIllllIllI[lIllllIlll[50]]);
                }
            }
            if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[36])) {
                int[] nArray = new int[lIllllIlll[1]];
                nArray[m.lIllllIlll[0]] = lIllllIlll[12];
                if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIllllIlll[53], (int)lIllllIlll[1]).getChild(lIllllIlll[5]).interact(lIllllIllI[lIllllIlll[56]]);
                }
            }
            Time.sleepTicks((int)lIllllIlll[1]);

        }
    }

    private static boolean lIlIIIIIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIIIIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIIIIIIlIlI() {
        lIllllIllI = new String[lIllllIlll[25]];
        m.lIllllIllI[m.lIllllIlll[0]] = "Buying items";
        m.lIllllIllI[m.lIllllIlll[1]] = "Finished buying items, switching back to magic training";
        m.lIllllIllI[m.lIllllIlll[2]] = "Navigating to bank";
        m.lIllllIllI[m.lIllllIlll[3]] = "Handling banking";
        m.lIllllIllI[m.lIllllIlll[5]] = "We are missing supplies, switching to BUYING";
        m.lIllllIllI[m.lIllllIlll[17]] = "Nav to cows";
        m.lIllllIllI[m.lIllllIlll[24]] = "Attacking cows";
        m.lIllllIllI[m.lIllllIlll[26]] = "Casting varrock tele";
        m.lIllllIllI[m.lIllllIlll[29]] = "Casting lumby tele";
        m.lIllllIllI[m.lIllllIlll[31]] = "Casting fally tele";
        m.lIllllIllI[m.lIllllIlll[32]] = "Casting cammy tele";
        m.lIllllIllI[m.lIllllIlll[33]] = "Alching";
        m.lIllllIllI[m.lIllllIlll[34]] = "Wield";
        m.lIllllIllI[m.lIllllIlll[36]] = "Move to alch spot";
        m.lIllllIllI[m.lIllllIlll[40]] = "Nav to cows";
        m.lIllllIllI[m.lIllllIlll[41]] = "Eat";
        m.lIllllIllI[m.lIllllIlll[42]] = "Cow";
        m.lIllllIllI[m.lIllllIlll[43]] = "cow";
        m.lIllllIllI[m.lIllllIlll[45]] = "Attacking cows";
        m.lIllllIllI[m.lIllllIlll[46]] = "Attack";
        m.lIllllIllI[m.lIllllIlll[47]] = "In combat";
        m.lIllllIllI[m.lIllllIlll[51]] = "Opening autocast";
        m.lIllllIllI[m.lIllllIlll[52]] = "Choose spell";
        m.lIllllIllI[m.lIllllIlll[54]] = "Wind Strike";
        m.lIllllIllI[m.lIllllIlll[55]] = "Water Strike";
        m.lIllllIllI[m.lIllllIlll[19]] = "Earth Strike";
        m.lIllllIllI[m.lIllllIlll[50]] = "Earth Strike";
        m.lIllllIllI[m.lIllllIlll[56]] = "Fire Strike";
        m.lIllllIllI[m.lIllllIlll[72]] = "Magic training";
        m.lIllllIllI[m.lIllllIlll[74]] = "ring of wealth (";
        m.lIllllIllI[m.lIllllIlll[75]] = "Cow";
    }

    private static void Q() {
        d var1;
        Object var2;
        if (m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6])) {
            int[] nArray = new int[lIllllIlll[1]];
            nArray[m.lIllllIlll[0]] = lIllllIlll[14];
            if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new DHelper(lIllllIlll[14], lIllllIlll[57], lIllllIlll[58]);
                bv.add(d2);

            }
            int[] nArray2 = new int[lIllllIlll[1]];
            nArray2[m.lIllllIlll[0]] = lIllllIlll[7];
            if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                var2 = new DHelper(lIllllIlll[7], lIllllIlll[59], lIllllIlll[24]);
                bv.add((DHelper) ar2);

            }
            int[] nArray3 = new int[lIllllIlll[1]];
            nArray3[m.lIllllIlll[0]] = lIllllIlll[9];
            if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                var2 = new DHelper(lIllllIlll[9], lIllllIlll[60], lIllllIlll[24]);
                bv.add((DHelper) ar2);

            }
            int[] nArray4 = new int[lIllllIlll[1]];
            nArray4[m.lIllllIlll[0]] = lIllllIlll[11];
            if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                var2 = new DHelper(lIllllIlll[11], lIllllIlll[61], lIllllIlll[24]);
                bv.add((DHelper) ar2);

            }
            int[] nArray5 = new int[lIllllIlll[1]];
            nArray5[m.lIllllIlll[0]] = lIllllIlll[12];
            if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                var2 = new DHelper(lIllllIlll[12], lIllllIlll[4], lIllllIlll[24]);
                bv.add((DHelper) ar2);

            }
            int[] nArray6 = new int[lIllllIlll[1]];
            nArray6[m.lIllllIlll[0]] = lIllllIlll[44];
            if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                var2 = new DHelper(lIllllIlll[44], lIllllIlll[1], e.c(lIllllIlll[62], lIllllIlll[63]));
                bv.add((DHelper) ar2);

            }
        }
        if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6])) {
            int[] nArray = new int[lIllllIlll[1]];
            nArray[m.lIllllIlll[0]] = lIllllIlll[22];
            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lIllllIlll[1]];
                nArray7[m.lIllllIlll[0]] = lIllllIlll[22];
                if (m.lIlIIIIIIllIl(Bank.getFirst((int[])nArray7).getQuantity(), lIllllIlll[61])) {
                    int[] nArray8 = new int[lIllllIlll[1]];
                    nArray8[m.lIllllIlll[0]] = lIllllIlll[22];
                    var2 = new DHelper(lIllllIlll[22], lIllllIlll[61] - Bank.getFirst((int[])nArray8).getQuantity(), lIllllIlll[64]);
                    bv.add((DHelper) ar2);

                }
            }
            int[] nArray9 = new int[lIllllIlll[1]];
            nArray9[m.lIllllIlll[0]] = lIllllIlll[22];
            if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                var2 = new DHelper(lIllllIlll[22], lIllllIlll[61], lIllllIlll[64]);
                bv.add((DHelper) ar2);

            }
            int[] nArray10 = new int[lIllllIlll[1]];
            nArray10[m.lIllllIlll[0]] = lIllllIlll[23];
            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIllllIlll[1]];
                nArray11[m.lIllllIlll[0]] = lIllllIlll[23];
                if (m.lIlIIIIIIllIl(Bank.getFirst((int[])nArray11).getQuantity(), lIllllIlll[61])) {
                    int[] nArray12 = new int[lIllllIlll[1]];
                    nArray12[m.lIllllIlll[0]] = lIllllIlll[23];
                    var2 = new DHelper(lIllllIlll[23], lIllllIlll[61] - Bank.getFirst((int[])nArray12).getQuantity(), lIllllIlll[65]);
                    bv.add((DHelper) ar2);

                }
            }
            int[] nArray13 = new int[lIllllIlll[1]];
            nArray13[m.lIllllIlll[0]] = lIllllIlll[23];
            if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                var2 = new DHelper(lIllllIlll[23], lIllllIlll[61], lIllllIlll[65]);
                bv.add((DHelper) ar2);

            }
            int[] nArray14 = new int[lIllllIlll[1]];
            nArray14[m.lIllllIlll[0]] = lIllllIlll[20];
            if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIllllIlll[1]];
                nArray15[m.lIllllIlll[0]] = lIllllIlll[20];
                if (m.lIlIIIIIIlllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    var2 = new DHelper(lIllllIlll[20], lIllllIlll[1], lIllllIlll[66]);
                    bv.add((DHelper) ar2);

                }
            }
            if (m.lIlIIIIIIllII(ci ? 1 : 0)) {
                int[] nArray16 = new int[lIllllIlll[1]];
                nArray16[m.lIllllIlll[0]] = lIllllIlll[14];
                if (m.lIlIIIIIIllII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIllllIlll[1]];
                    nArray17[m.lIllllIlll[0]] = lIllllIlll[14];
                    if (m.lIlIIIIIIllIl(Bank.getFirst((int[])nArray17).getQuantity(), lIllllIlll[61])) {
                        int[] nArray18 = new int[lIllllIlll[1]];
                        nArray18[m.lIllllIlll[0]] = lIllllIlll[14];
                        var2 = new DHelper(lIllllIlll[14], lIllllIlll[61] - Bank.getFirst((int[])nArray18).getQuantity(), lIllllIlll[58]);
                        bv.add((DHelper) ar2);

                    }
                }
                int[] nArray19 = new int[lIllllIlll[1]];
                nArray19[m.lIllllIlll[0]] = lIllllIlll[14];
                if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    var2 = new DHelper(lIllllIlll[14], lIllllIlll[61], lIllllIlll[58]);
                    bv.add((DHelper) ar2);

                }
                int[] nArray20 = new int[lIllllIlll[1]];
                nArray20[m.lIllllIlll[0]] = lIllllIlll[21];
                if (m.lIlIIIIIIllII(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIllllIlll[1]];
                    nArray21[m.lIllllIlll[0]] = lIllllIlll[21];
                    if (m.lIlIIIIIIllIl(Bank.getFirst((int[])nArray21).getQuantity(), lIllllIlll[66])) {
                        int[] nArray22 = new int[lIllllIlll[1]];
                        nArray22[m.lIllllIlll[0]] = lIllllIlll[21];
                        var2 = new DHelper(lIllllIlll[21], lIllllIlll[66] - Bank.getFirst((int[])nArray22).getQuantity(), lIllllIlll[24]);
                        bv.add((DHelper) ar2);

                    }
                }
                int[] nArray23 = new int[lIllllIlll[1]];
                nArray23[m.lIllllIlll[0]] = lIllllIlll[21];
                if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    var2 = new DHelper(lIllllIlll[21], lIllllIlll[66], lIllllIlll[24]);
                    bv.add((DHelper) ar2);

                }
            }
        }
        int[] nArray = new int[lIllllIlll[1]];
        nArray[m.lIllllIlll[0]] = lIllllIlll[18];
        if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            var2 = new DHelper(lIllllIlll[18], lIllllIlll[67], lIllllIlll[37]);
            bv.add((DHelper) ar2);

        }
        if (m.lIlIIIIIIlllI(Bank.contains(var2 = item -> item.getName().toLowerCase().contains(lIllllIllI[lIllllIlll[74]])) ? 1 : 0)) {
            var1 = new DHelper(lIllllIlll[68], lIllllIlll[17], lIllllIlll[69]);
            bv.add(var1);

        }
        int[] nArray24 = new int[lIllllIlll[1]];
        nArray24[m.lIllllIlll[0]] = lIllllIlll[70];
        if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray24) ? 1 : 0)) {
            var1 = new DHelper(lIllllIlll[70], lIllllIlll[32], lIllllIlll[71]);
            bv.add(var1);

        }
        int[] nArray25 = new int[lIllllIlll[1]];
        nArray25[m.lIllllIlll[0]] = lIllllIlll[16];
        if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray25) ? 1 : 0)) {
            var1 = new DHelper(lIllllIlll[16], lIllllIlll[32], lIllllIlll[71]);
            bv.add(var1);

        }
    }

    private static boolean lIlIIIIIIllII(int n2) {
        return n2 != 0;
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
                                                    if (!m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[19])) break block19;
                                                    int[] nArray = new int[lIllllIlll[1]];
                                                    nArray[m.lIllllIlll[0]] = lIllllIlll[7];
                                                    if (!m.lIlIIIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIllllIlll[1]];
                                                    nArray2[m.lIllllIlll[0]] = lIllllIlll[11];
                                                    if (!m.lIlIIIIIIllII(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIllllIlll[1]];
                                                    nArray3[m.lIllllIlll[0]] = lIllllIlll[9];
                                                    if (!m.lIlIIIIIIllII(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIllllIlll[1]];
                                                    nArray4[m.lIllllIlll[0]] = lIllllIlll[12];
                                                    if (!m.lIlIIIIIIllII(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIllllIlll[1]];
                                                    nArray5[m.lIllllIlll[0]] = lIllllIlll[18];
                                                    if (!m.lIlIIIIIIllII(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIllllIlll[1]];
                                                    nArray6[m.lIllllIlll[0]] = lIllllIlll[44];
                                                    if (!m.lIlIIIIIIlllI(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIllllIlll[1]];
                                                    nArray7[m.lIllllIlll[0]] = lIllllIlll[44];
                                                    if (!m.lIlIIIIIIllII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIllllIlll[1];

                                                if (1 <= 3) return n5 != 0;
                                                return (3 & (3 ^ -1)) != 0;
                                            }
                                            n5 = lIllllIlll[0];
                                            return n5 != 0;
                                        }
                                        if (!m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[19]) || !m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6])) break block22;
                                        int[] nArray = new int[lIllllIlll[1]];
                                        nArray[m.lIllllIlll[0]] = lIllllIlll[11];
                                        if (!m.lIlIIIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIllllIlll[1]];
                                        nArray8[m.lIllllIlll[0]] = lIllllIlll[9];
                                        if (!m.lIlIIIIIIllII(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIllllIlll[1]];
                                        nArray9[m.lIllllIlll[0]] = lIllllIlll[12];
                                        if (!m.lIlIIIIIIllII(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIllllIlll[1]];
                                        nArray10[m.lIllllIlll[0]] = lIllllIlll[14];
                                        if (!m.lIlIIIIIIllII(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIllllIlll[1]];
                                        nArray11[m.lIllllIlll[0]] = lIllllIlll[44];
                                        if (!m.lIlIIIIIIlllI(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIllllIlll[1]];
                                        nArray12[m.lIllllIlll[0]] = lIllllIlll[44];
                                        if (!m.lIlIIIIIIllII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIllllIlll[1];

                                    if (1 != 0) return n4 != 0;
                                    return ((0x6B ^ 0x52 ^ (0x1C ^ 0x31)) & (99 + 111 - 121 + 45 ^ 64 + 53 - 78 + 107 ^ -1)) != 0;
                                }
                                n4 = lIllllIlll[0];
                                return n4 != 0;
                            }
                            if (!m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6]) || !m.lIlIIIIIIlllI(ci ? 1 : 0)) break block25;
                            int[] nArray = new int[lIllllIlll[1]];
                            nArray[m.lIllllIlll[0]] = lIllllIlll[20];
                            if (!m.lIlIIIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIllllIlll[1]];
                            nArray13[m.lIllllIlll[0]] = lIllllIlll[20];
                            if (!m.lIlIIIIIIllII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIllllIlll[1]];
                        nArray[m.lIllllIlll[0]] = lIllllIlll[22];
                        if (m.lIlIIIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIllllIlll[1]];
                            nArray14[m.lIllllIlll[0]] = lIllllIlll[23];
                            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIllllIlll[1];

                                if (((0x79 ^ 0x5C) & ~(0x2D ^ 8)) >= ((0xC9 ^ 0xC3) & ~(0x78 ^ 0x72))) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = lIllllIlll[0];
                    return n3 != 0;
                }
                if (!m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6]) || !m.lIlIIIIIIllII(ci ? 1 : 0)) return lIllllIlll[0];
                int[] nArray = new int[lIllllIlll[1]];
                nArray[m.lIllllIlll[0]] = lIllllIlll[20];
                if (!m.lIlIIIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIllllIlll[1]];
                nArray15[m.lIllllIlll[0]] = lIllllIlll[20];
                if (!m.lIlIIIIIIllII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIllllIlll[1]];
            nArray[m.lIllllIlll[0]] = lIllllIlll[14];
            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIllllIlll[1]];
                nArray16[m.lIllllIlll[0]] = lIllllIlll[21];
                if (m.lIlIIIIIIllII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIllllIlll[1]];
                    nArray17[m.lIllllIlll[0]] = lIllllIlll[21];
                    if (m.lIlIIIIIlIIIl(Bank.getFirst((int[])nArray17).getQuantity(), lIllllIlll[17])) {
                        int[] nArray18 = new int[lIllllIlll[1]];
                        nArray18[m.lIllllIlll[0]] = lIllllIlll[22];
                        if (m.lIlIIIIIIllII(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIllllIlll[1]];
                            nArray19[m.lIllllIlll[0]] = lIllllIlll[23];
                            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIllllIlll[1];

                                if (-3 <= 0) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIllllIlll[0];
        return n2 != 0;
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
                                                    if (!m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[19])) break block19;
                                                    int[] nArray = new int[lIllllIlll[1]];
                                                    nArray[m.lIllllIlll[0]] = lIllllIlll[7];
                                                    if (!m.lIlIIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIllllIlll[1]];
                                                    nArray2[m.lIllllIlll[0]] = lIllllIlll[11];
                                                    if (!m.lIlIIIIIIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIllllIlll[1]];
                                                    nArray3[m.lIllllIlll[0]] = lIllllIlll[9];
                                                    if (!m.lIlIIIIIIllII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIllllIlll[1]];
                                                    nArray4[m.lIllllIlll[0]] = lIllllIlll[12];
                                                    if (!m.lIlIIIIIIllII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIllllIlll[1]];
                                                    nArray5[m.lIllllIlll[0]] = lIllllIlll[18];
                                                    if (!m.lIlIIIIIIllII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIllllIlll[1]];
                                                    nArray6[m.lIllllIlll[0]] = lIllllIlll[44];
                                                    if (!m.lIlIIIIIIlllI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIllllIlll[1]];
                                                    nArray7[m.lIllllIlll[0]] = lIllllIlll[44];
                                                    if (!m.lIlIIIIIIllII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIllllIlll[1];

                                                if (((0x11 ^ 0x42 ^ (0xC ^ 0x6A)) & (122 + 53 - 125 + 94 ^ 63 + 148 - 200 + 154 ^ -1)) == 0) return n5 != 0;
                                                return false;
                                            }
                                            n5 = lIllllIlll[0];
                                            return n5 != 0;
                                        }
                                        if (!m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[19]) || !m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6])) break block22;
                                        int[] nArray = new int[lIllllIlll[1]];
                                        nArray[m.lIllllIlll[0]] = lIllllIlll[11];
                                        if (!m.lIlIIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIllllIlll[1]];
                                        nArray8[m.lIllllIlll[0]] = lIllllIlll[9];
                                        if (!m.lIlIIIIIIllII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIllllIlll[1]];
                                        nArray9[m.lIllllIlll[0]] = lIllllIlll[12];
                                        if (!m.lIlIIIIIIllII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIllllIlll[1]];
                                        nArray10[m.lIllllIlll[0]] = lIllllIlll[14];
                                        if (!m.lIlIIIIIIllII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIllllIlll[1]];
                                        nArray11[m.lIllllIlll[0]] = lIllllIlll[44];
                                        if (!m.lIlIIIIIIlllI(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIllllIlll[1]];
                                        nArray12[m.lIllllIlll[0]] = lIllllIlll[44];
                                        if (!m.lIlIIIIIIllII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIllllIlll[1];

                                    if (3 == 3) return n4 != 0;
                                    return ((77 + 129 - 120 + 58 ^ 69 + 136 - 95 + 69) & (0xC2 ^ 0x95 ^ (0xEB ^ 0x9F) ^ -1)) != 0;
                                }
                                n4 = lIllllIlll[0];
                                return n4 != 0;
                            }
                            if (!m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6]) || !m.lIlIIIIIIlllI(ci ? 1 : 0)) break block25;
                            int[] nArray = new int[lIllllIlll[1]];
                            nArray[m.lIllllIlll[0]] = lIllllIlll[20];
                            if (!m.lIlIIIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIllllIlll[1]];
                            nArray13[m.lIllllIlll[0]] = lIllllIlll[20];
                            if (!m.lIlIIIIIIllII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIllllIlll[1]];
                        nArray[m.lIllllIlll[0]] = lIllllIlll[22];
                        if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIllllIlll[1]];
                            nArray14[m.lIllllIlll[0]] = lIllllIlll[35];
                            if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIllllIlll[1];

                                if (2 > 0) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = lIllllIlll[0];
                    return n3 != 0;
                }
                if (!m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6]) || !m.lIlIIIIIIllII(ci ? 1 : 0)) return lIllllIlll[0];
                int[] nArray = new int[lIllllIlll[1]];
                nArray[m.lIllllIlll[0]] = lIllllIlll[20];
                if (!m.lIlIIIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIllllIlll[1]];
                nArray15[m.lIllllIlll[0]] = lIllllIlll[20];
                if (!m.lIlIIIIIIllII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIllllIlll[1]];
            nArray[m.lIllllIlll[0]] = lIllllIlll[14];
            if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIllllIlll[1]];
                nArray16[m.lIllllIlll[0]] = lIllllIlll[21];
                if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIllllIlll[1]];
                    nArray17[m.lIllllIlll[0]] = lIllllIlll[21];
                    if (m.lIlIIIIIlIIIl(Inventory.getFirst((int[])nArray17).getQuantity(), lIllllIlll[17])) {
                        int[] nArray18 = new int[lIllllIlll[1]];
                        nArray18[m.lIllllIlll[0]] = lIllllIlll[22];
                        if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIllllIlll[1]];
                            nArray19[m.lIllllIlll[0]] = lIllllIlll[35];
                            if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIllllIlll[1];

                                if (2 >= 0) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIllllIlll[0];
        return n2 != 0;
    }

    private static boolean lIlIIIIIlIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIIIlIllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIIIIlIIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIIIIlIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int af() {
        try {
            m.ak();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 != 3) {
            return (0xFB ^ 0x98) & ~(0x19 ^ 0x7A);
        }
        return lIllllIlll[67];
    }

    @Override
    public String ag() {
        return lIllllIllI[lIllllIlll[72]];
    }

    private static boolean lIlIIIIIIlllI(int n2) {
        return n2 == 0;
    }

    private static int lIlIIIIIlIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

        return String.valueOf(var3);
    }

    private static boolean lIlIIIIIIllll(Object object) {
        return object != null;
    }

    @Override
    public boolean ae() {
        return lIllllIlll[0];
    }

    public static void ak() {
        if (m.lIlIIIIIIllII(bt ? 1 : 0)) {
            AccBuilderSotf.c = lIllllIllI[lIllllIlll[0]];
            b.a(bv);
            if (m.lIlIIIIIIllIl(bv.size(), lIllllIlll[1])) {
                System.out.println(lIllllIllI[lIllllIlll[1]]);
                bt = lIllllIlll[0];
            }
        }
        if (m.lIlIIIIIIlllI(bt ? 1 : 0)) {
            BankLocation var4;
            if (m.lIlIIIIIIlllI(m.an() ? 1 : 0)) {
                var4 = BankLocation.getNearest();
                if (m.lIlIIIIIIllll(var4) && m.lIlIIIIIIlllI(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[2]];
                    a.a(var4);
                }
                if (m.lIlIIIIIIllll(var4) && m.lIlIIIIIIllII(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[3]];
                    if (m.lIlIIIIIIlllI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllllIlll[4]);

                    }
                    if (m.lIlIIIIIIllII(Bank.isOpen() ? 1 : 0)) {
                        if (m.lIlIIIIIlIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIllllIlll[5]);

                        }
                        while (m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6]) && m.lIlIIIIIIlllI(I.co() ? 1 : 0)) {
                            I.cm();
                            Time.sleepTicks((int)lIllllIlll[1]);

                            if (((0x1B ^ 7) & ~(0xA3 ^ 0xBF)) == 0) continue;
                            return;
                        }
                        if (m.lIlIIIIIIlllI(m.ao() ? 1 : 0)) {
                            m.Q();
                            System.out.println(lIllllIllI[lIllllIlll[5]]);
                            bt = lIllllIlll[1];
                            return;
                        }
                        if (m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6])) {
                            int[] nArray = new int[lIllllIlll[1]];
                            nArray[m.lIllllIlll[0]] = lIllllIlll[7];
                            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIllllIlll[1]];
                                nArray2[m.lIllllIlll[0]] = lIllllIlll[7];
                                if (m.lIlIIIIIIllIl(Inventory.getCount((int[])nArray2), lIllllIlll[1])) {
                                    Bank.withdraw((int)lIllllIlll[7], (int)lIllllIlll[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllIlll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIllllIlll[1]];
                                        nArray[m.lIllllIlll[0]] = lIllllIlll[7];
                                        if (m.lIlIIIIIlIIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIllllIlll[1];

                                            if (-(0x8D ^ 0x9B ^ (0xA0 ^ 0xB2)) >= 0) {
                                                return ((0x35 ^ 0x58 ^ (0x37 ^ 0x1D)) & (45 + 76 - 85 + 162 ^ 21 + 76 - 70 + 102 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIllllIlll[0];
                                        }
                                        return bl;
                                    }, (int)lIllllIlll[4]);

                                }
                            }
                            int[] nArray3 = new int[lIllllIlll[1]];
                            nArray3[m.lIllllIlll[0]] = lIllllIlll[9];
                            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIllllIlll[1]];
                                nArray4[m.lIllllIlll[0]] = lIllllIlll[9];
                                if (m.lIlIIIIIIllIl(Inventory.getCount((int[])nArray4), lIllllIlll[1])) {
                                    Bank.withdraw((int)lIllllIlll[9], (int)lIllllIlll[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllIlll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIllllIlll[1]];
                                        nArray[m.lIllllIlll[0]] = lIllllIlll[9];
                                        if (m.lIlIIIIIlIIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIllllIlll[1];

                                            if (((0x65 ^ 0x7C) & ~(0x69 ^ 0x70)) > 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIllllIlll[0];
                                        }
                                        return bl;
                                    }, (int)lIllllIlll[4]);

                                }
                            }
                            int[] nArray5 = new int[lIllllIlll[1]];
                            nArray5[m.lIllllIlll[0]] = lIllllIlll[11];
                            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIllllIlll[1]];
                                nArray6[m.lIllllIlll[0]] = lIllllIlll[11];
                                if (m.lIlIIIIIIllIl(Inventory.getCount((int[])nArray6), lIllllIlll[1])) {
                                    Bank.withdraw((int)lIllllIlll[11], (int)lIllllIlll[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllIlll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIllllIlll[1]];
                                        nArray[m.lIllllIlll[0]] = lIllllIlll[11];
                                        if (m.lIlIIIIIlIIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIllllIlll[1];

                                            if (3 < ((0xC ^ 0x51) & ~(0xE9 ^ 0xB4))) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIllllIlll[0];
                                        }
                                        return bl;
                                    }, (int)lIllllIlll[4]);

                                }
                            }
                            int[] nArray7 = new int[lIllllIlll[1]];
                            nArray7[m.lIllllIlll[0]] = lIllllIlll[12];
                            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIllllIlll[1]];
                                nArray8[m.lIllllIlll[0]] = lIllllIlll[12];
                                if (m.lIlIIIIIIllIl(Inventory.getCount((int[])nArray8), lIllllIlll[1])) {
                                    Bank.withdraw((int)lIllllIlll[12], (int)lIllllIlll[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllIlll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIllllIlll[1]];
                                        nArray[m.lIllllIlll[0]] = lIllllIlll[12];
                                        if (m.lIlIIIIIlIIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIllllIlll[1];

                                            if (3 >= (0xA5 ^ 0xA1)) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIllllIlll[0];
                                        }
                                        return bl;
                                    }, (int)lIllllIlll[4]);

                                }
                            }
                            int[] nArray9 = new int[lIllllIlll[1]];
                            nArray9[m.lIllllIlll[0]] = lIllllIlll[14];
                            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIllllIlll[1]];
                                nArray10[m.lIllllIlll[0]] = lIllllIlll[14];
                                if (m.lIlIIIIIIllIl(Inventory.getCount((int[])nArray10), lIllllIlll[1])) {
                                    Bank.withdraw((int)lIllllIlll[14], (int)lIllllIlll[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllIlll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIllllIlll[1]];
                                        nArray[m.lIllllIlll[0]] = lIllllIlll[14];
                                        if (m.lIlIIIIIlIIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIllllIlll[1];

                                            if ((0xA5 ^ 0xA1) == 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIllllIlll[0];
                                        }
                                        return bl;
                                    }, (int)lIllllIlll[4]);

                                }
                            }
                            int[] nArray11 = new int[lIllllIlll[1]];
                            nArray11[m.lIllllIlll[0]] = lIllllIlll[15];
                            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIllllIlll[1]];
                                nArray12[m.lIllllIlll[0]] = lIllllIlll[15];
                                if (m.lIlIIIIIIlllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lIllllIlll[15], (int)lIllllIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllIlll[1]);

                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIllllIlll[1]];
                                        nArray[m.lIllllIlll[0]] = lIllllIlll[15];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIllllIlll[4]);

                                }
                            }
                            Bank.withdraw((int)lIllllIlll[16], (int)lIllllIlll[17], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lIllllIlll[1]];
                            nArray13[m.lIllllIlll[0]] = lIllllIlll[18];
                            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lIllllIlll[1]];
                                nArray14[m.lIllllIlll[0]] = lIllllIlll[18];
                                if (m.lIlIIIIIIllIl(Inventory.getCount((int[])nArray14), lIllllIlll[1]) && m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[19])) {
                                    Bank.withdrawAll((int)lIllllIlll[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllIlll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIllllIlll[1]];
                                        nArray[m.lIllllIlll[0]] = lIllllIlll[18];
                                        if (m.lIlIIIIIlIIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIllllIlll[1];

                                            }
                                        } else {
                                            bl = lIllllIlll[0];
                                        }
                                        return bl;
                                    }, (int)lIllllIlll[4]);

                                }
                            }
                        }
                        if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6])) {
                            int[] nArray = new int[lIllllIlll[1]];
                            nArray[m.lIllllIlll[0]] = lIllllIlll[20];
                            if (m.lIlIIIIIIlllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIllllIlll[20], (int)lIllllIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIllllIlll[1]);

                            }
                            if (m.lIlIIIIIIllII(ci ? 1 : 0)) {
                                Bank.withdrawAll((int)lIllllIlll[21], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIllllIlll[1]);

                                Bank.withdrawAll((int)lIllllIlll[14], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIllllIlll[1]);

                            }
                            Bank.withdrawAll((int)lIllllIlll[22], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIllllIlll[1]);

                            Bank.withdrawAll((int)lIllllIlll[23], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIllllIlll[1]);

                        }
                    }
                }
            }
            if (m.lIlIIIIIIllII(m.an() ? 1 : 0)) {
                if (m.lIlIIIIIIllII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[19])) {
                    if (m.lIlIIIIIIlllI(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lIllllIllI[lIllllIlll[17]];
                        Movement.walkTo((WorldPoint)ck);

                        Time.sleepTicks((int)lIllllIlll[1]);

                    }
                    if (m.lIlIIIIIIllII(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lIllllIllI[lIllllIlll[24]];
                        m.am();
                    }
                }
                if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[19]) && m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[25])) {
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[26]];
                    if (m.lIlIIIIIlIIlI(Players.getLocal().getAnimation(), lIllllIlll[27])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lIllllIlll[1]);

                    }
                }
                if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[25]) && m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[28])) {
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[29]];
                    if (m.lIlIIIIIlIIlI(Players.getLocal().getAnimation(), lIllllIlll[27])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIllllIlll[1]);

                    }
                }
                if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[28]) && m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[30])) {
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[31]];
                    if (m.lIlIIIIIlIIlI(Players.getLocal().getAnimation(), lIllllIlll[27])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIllllIlll[1]);

                    }
                }
                if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[30]) && m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6])) {
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[32]];
                    if (m.lIlIIIIIlIIlI(Players.getLocal().getAnimation(), lIllllIlll[27])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIllllIlll[1]);

                    }
                }
                if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6])) {
                    int var5;
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[33]];
                    int[] nArray = new int[lIllllIlll[1]];
                    nArray[m.lIllllIlll[0]] = lIllllIlll[20];
                    if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lIllllIlll[1]];
                        nArray15[m.lIllllIlll[0]] = lIllllIlll[20];
                        if (m.lIlIIIIIIlllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lIllllIlll[1]];
                            nArray16[m.lIllllIlll[0]] = lIllllIlll[20];
                            Inventory.getFirst((int[])nArray16).interact(lIllllIllI[lIllllIlll[34]]);
                            Time.sleepTicks((int)lIllllIlll[1]);

                        }
                    }
                    if (m.lIlIIIIIIllII(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lIllllIlll[1]];
                    nArray17[m.lIllllIlll[0]] = lIllllIlll[22];
                    var4 = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lIllllIlll[1]];
                    nArray18[m.lIllllIlll[0]] = lIllllIlll[35];
                    Item var6 = Inventory.getFirst((int[])nArray18);
                    if (m.lIlIIIIIIlllI(ci ? 1 : 0)) {
                        if (m.lIlIIIIIIlllI(Players.getLocal().getWorldLocation().equals((Object)cl) ? 1 : 0)) {
                            AccBuilderSotf.c = lIllllIllI[lIllllIlll[36]];
                            Movement.walkTo((WorldPoint)cl);

                            Time.sleepTicks((int)lIllllIlll[1]);

                        }
                        if (m.lIlIIIIIIllII(Players.getLocal().getWorldLocation().equals((Object)cl) ? 1 : 0) && m.lIlIIIIIIllll(var4) && m.lIlIIIIIIllll(var6)) {
                            var5 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var6);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (m.lIlIIIIIlIlll(Skills.getExperience((Skill)Skill.MAGIC), var5)) {
                                    bl = lIllllIlll[1];

                                    if ((8 + 125 - 128 + 173 ^ 172 + 52 - 96 + 54) < 0) {
                                        return false;
                                    }
                                } else {
                                    bl = lIllllIlll[0];
                                }
                                return bl;
                            }, (int)lIllllIlll[8]);

                            Time.sleep((long)e.c(lIllllIlll[37], lIllllIlll[38]));

                        }
                    }
                    if (m.lIlIIIIIIllII(ci ? 1 : 0)) {
                        if (m.lIlIIIIIIllll(var4) && m.lIlIIIIIIllll(var6) && m.lIlIIIIIlIIlI(Players.getLocal().getAnimation(), lIllllIlll[27])) {
                            var5 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var6);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (m.lIlIIIIIlIlll(Skills.getExperience((Skill)Skill.MAGIC), var5)) {
                                    bl = lIllllIlll[1];

                                    if (-1 >= ((141 + 121 - 217 + 101 ^ 54 + 169 - 104 + 67) & (0xAA ^ 0xC4 ^ (0xCA ^ 0x8C) ^ -1))) {
                                        return ((2 ^ (0x1A ^ 0)) & (138 + 173 - 233 + 110 ^ 69 + 108 - 168 + 155 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIllllIlll[0];
                                }
                                return bl;
                            }, (int)lIllllIlll[8]);

                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (m.lIlIIIIIlIIlI(Players.getLocal().getAnimation(), lIllllIlll[27])) {
                                bl = lIllllIlll[1];

                            } else {
                                bl = lIllllIlll[0];
                            }
                            return bl;
                        }, (int)lIllllIlll[39]);

                    }
                }
            }
        }
    }

    private static boolean lIlIIIIIlIlIl(Object object) {
        return object == null;
    }

    public static void al() {
        if (m.lIlIIIIIIllII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (m.lIlIIIIIIlllI(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lIllllIllI[lIllllIlll[40]];
            Movement.walkTo((WorldPoint)ck);

            Time.sleepTicks((int)lIllllIlll[1]);

        }
        if (m.lIlIIIIIIllII(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            m.am();
        }
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[73])) {
            bl = lIllllIlll[1];

            if (-(0x73 ^ 0x42 ^ (0xA4 ^ 0x91)) >= 0) {
                return ((0x1F ^ 0x14 ^ (0x26 ^ 0x6D)) & (0x3E ^ 0x49 ^ (0x83 ^ 0xB4) ^ -1)) != 0;
            }
        } else {
            bl = lIllllIlll[0];
        }
        return bl;
    }

    static {
        m.lIlIIIIIIlIll();
        m.lIlIIIIIIlIlI();
        bv = new ArrayList<d>();
        cj = new WorldArea(lIllllIlll[76], lIllllIlll[77], lIllllIlll[47], lIllllIlll[40], lIllllIlll[0]);
        ck = new WorldPoint(lIllllIlll[78], lIllllIlll[79], lIllllIlll[0]);
        cl = new WorldPoint(lIllllIlll[80] + e.c(lIllllIlll[1], lIllllIlll[5]), lIllllIlll[81], lIllllIlll[0]);
    }

    private static void am() {
        if (m.lIlIIIIIlIlII(m.lIlIIIIIlIIll(e.w(), 30.0))) {
            int[] nArray = new int[lIllllIlll[1]];
            nArray[m.lIllllIlll[0]] = lIllllIlll[18];
            if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIllllIlll[1]];
                nArray2[m.lIllllIlll[0]] = lIllllIlll[18];
                Inventory.getFirst((int[])nArray2).interact(lIllllIllI[lIllllIlll[41]]);
                Time.sleepTicks((int)lIllllIlll[1]);

            }
        }
        if (m.lIlIIIIIlIlIl(Players.getLocal().getInteracting())) {
            NPC var7 = NPCs.getNearest(nPC -> {
                int n2;
                if (m.lIlIIIIIIllII(nPC.getName().contains(lIllllIllI[lIllllIlll[75]]) ? 1 : 0) && m.lIlIIIIIIlllI(nPC.isDead() ? 1 : 0)) {
                    n2 = lIllllIlll[1];

                    if (((0x26 ^ 0x5D ^ (0x22 ^ 0x1D)) & (0x17 ^ 0xE ^ (0x27 ^ 0x7A) ^ -1)) >= 1) {
                        return false;
                    }
                } else {
                    n2 = lIllllIlll[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lIllllIlll[2]];
            stringArray[m.lIllllIlll[0]] = lIllllIllI[lIllllIlll[42]];
            stringArray[m.lIllllIlll[1]] = lIllllIllI[lIllllIlll[43]];
            List var8 = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (m.lIlIIIIIlIllI(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIllllIlll[1];

                    if (((0xA9 ^ 0xA3 ^ (0xD0 ^ 0x9A)) & (0x36 ^ 0x59 ^ (0x89 ^ 0xA6) ^ -1)) != 0) {
                        return ((0x3C ^ 0x7E ^ (0x2D ^ 0x27)) & (0x45 ^ 0x5C ^ (0x11 ^ 0x40) ^ -1)) != 0;
                    }
                } else {
                    bl = lIllllIlll[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lIllllIlll[1]];
            nArray[m.lIllllIlll[0]] = lIllllIlll[44];
            if (m.lIlIIIIIIllII(Equipment.contains((int[])nArray) ? 1 : 0) && m.lIlIIIIIIlllI(m.ap() ? 1 : 0)) {
                m.aq();
            }
            if (m.lIlIIIIIIllll(var7) && m.lIlIIIIIIlllI(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderSotf.c = lIllllIllI[lIllllIlll[45]];
                var7.interact(lIllllIllI[lIllllIlll[46]]);
                Time.sleepTicks((int)lIllllIlll[3]);

            }
        }
        if (m.lIlIIIIIIllll(Players.getLocal().getInteracting())) {
            AccBuilderSotf.c = lIllllIllI[lIllllIlll[47]];
            Time.sleepTicks((int)lIllllIlll[1]);

        }
    }
}

