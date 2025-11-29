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

public class AGHelper
implements ab {
    static  WorldArea cl;
    
    static  WorldPoint cn;
    public static  boolean bv;
    static  WorldPoint cm;
    public static  boolean ck;
    
    public static  List<d> bx;

    public static void al() {
        if (ag.llIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (ag.llIlIllIlIll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllllIlll[llllllIII[43]];
            Movement.walkTo((WorldPoint)cm);

            Time.sleepTicks((int)llllllIII[1]);

        }
        if (ag.llIlIllIlIIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllllIlll[llllllIII[44]];
            ag.am();
        }
    }

    private static boolean llIlIllIlIll(int n2) {
        return n2 == 0;
    }

    @Override
    public int af() {
        try {
            ag.ak();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x47 ^ 0x43) < 0) {
            return (0x73 ^ 0x55) & ~(0x22 ^ 4);
        }
        return llllllIII[69];
    }

    public static boolean ap() {
        if (ag.llIlIllIllll(Vars.getBit((int)llllllIII[50]), llllllIII[1]) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[19])) {
            return llllllIII[1];
        }
        if (ag.llIlIllIllll(Vars.getBit((int)llllllIII[50]), llllllIII[3]) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[32]) && ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[19])) {
            return llllllIII[1];
        }
        if (ag.llIlIllIllll(Vars.getBit((int)llllllIII[50]), llllllIII[4]) && ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[32]) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[39])) {
            return llllllIII[1];
        }
        if (ag.llIlIllIllll(Vars.getBit((int)llllllIII[50]), llllllIII[4]) && ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[32])) {
            int[] nArray = new int[llllllIII[1]];
            nArray[ag.llllllIII[0]] = llllllIII[14];
            if (ag.llIlIllIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return llllllIII[1];
            }
        }
        if (ag.llIlIllIllll(Vars.getBit((int)llllllIII[50]), llllllIII[7]) && ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[39])) {
            int[] nArray = new int[llllllIII[1]];
            nArray[ag.llllllIII[0]] = llllllIII[14];
            if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return llllllIII[1];
            }
        }
        return llllllIII[0];
    }

    private static boolean llIlIlllIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIllIllII(Object object) {
        return object != null;
    }

    private static boolean llIlIllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void Q() {
        d lIlIlIllllIlI;
        Object lIlIlIllllIll;
        if (ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8])) {
            int[] nArray = new int[llllllIII[1]];
            nArray[ag.llllllIII[0]] = llllllIII[16];
            if (ag.llIlIllIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new DHelper(llllllIII[16], llllllIII[59], llllllIII[60]);
                bx.add(d2);

            }
            int[] nArray2 = new int[llllllIII[1]];
            nArray2[ag.llllllIII[0]] = llllllIII[9];
            if (ag.llIlIllIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                lIlIlIllllIll = new DHelper(llllllIII[9], llllllIII[61], llllllIII[6]);
                bx.add((DHelper) IlIlIllllIll);

            }
            int[] nArray3 = new int[llllllIII[1]];
            nArray3[ag.llllllIII[0]] = llllllIII[11];
            if (ag.llIlIllIlIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                lIlIlIllllIll = new DHelper(llllllIII[11], llllllIII[62], llllllIII[6]);
                bx.add((DHelper) IlIlIllllIll);

            }
            int[] nArray4 = new int[llllllIII[1]];
            nArray4[ag.llllllIII[0]] = llllllIII[13];
            if (ag.llIlIllIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                lIlIlIllllIll = new DHelper(llllllIII[13], llllllIII[63], llllllIII[6]);
                bx.add((DHelper) IlIlIllllIll);

            }
            int[] nArray5 = new int[llllllIII[1]];
            nArray5[ag.llllllIII[0]] = llllllIII[14];
            if (ag.llIlIllIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                lIlIlIllllIll = new DHelper(llllllIII[14], llllllIII[5], llllllIII[6]);
                bx.add((DHelper) IlIlIllllIll);

            }
            int[] nArray6 = new int[llllllIII[1]];
            nArray6[ag.llllllIII[0]] = llllllIII[48];
            if (ag.llIlIllIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                lIlIlIllllIll = new DHelper(llllllIII[48], llllllIII[1], e.c(llllllIII[64], llllllIII[65]));
                bx.add((DHelper) IlIlIllllIll);

            }
        }
        if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8])) {
            int[] nArray = new int[llllllIII[1]];
            nArray[ag.llllllIII[0]] = llllllIII[24];
            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[llllllIII[1]];
                nArray7[ag.llllllIII[0]] = llllllIII[24];
                if (ag.llIlIllIlIlI(Bank.getFirst((int[])nArray7).getQuantity(), llllllIII[63])) {
                    int[] nArray8 = new int[llllllIII[1]];
                    nArray8[ag.llllllIII[0]] = llllllIII[24];
                    lIlIlIllllIll = new DHelper(llllllIII[24], llllllIII[63] - Bank.getFirst((int[])nArray8).getQuantity(), llllllIII[66]);
                    bx.add((DHelper) IlIlIllllIll);

                }
            }
            int[] nArray9 = new int[llllllIII[1]];
            nArray9[ag.llllllIII[0]] = llllllIII[24];
            if (ag.llIlIllIlIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                lIlIlIllllIll = new DHelper(llllllIII[24], llllllIII[63], llllllIII[66]);
                bx.add((DHelper) IlIlIllllIll);

            }
            int[] nArray10 = new int[llllllIII[1]];
            nArray10[ag.llllllIII[0]] = llllllIII[25];
            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[llllllIII[1]];
                nArray11[ag.llllllIII[0]] = llllllIII[25];
                if (ag.llIlIllIlIlI(Bank.getFirst((int[])nArray11).getQuantity(), llllllIII[63])) {
                    int[] nArray12 = new int[llllllIII[1]];
                    nArray12[ag.llllllIII[0]] = llllllIII[25];
                    lIlIlIllllIll = new DHelper(llllllIII[25], llllllIII[63] - Bank.getFirst((int[])nArray12).getQuantity(), llllllIII[67]);
                    bx.add((DHelper) IlIlIllllIll);

                }
            }
            int[] nArray13 = new int[llllllIII[1]];
            nArray13[ag.llllllIII[0]] = llllllIII[25];
            if (ag.llIlIllIlIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                lIlIlIllllIll = new DHelper(llllllIII[25], llllllIII[63], llllllIII[67]);
                bx.add((DHelper) IlIlIllllIll);

            }
            int[] nArray14 = new int[llllllIII[1]];
            nArray14[ag.llllllIII[0]] = llllllIII[22];
            if (ag.llIlIllIlIll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[llllllIII[1]];
                nArray15[ag.llllllIII[0]] = llllllIII[22];
                if (ag.llIlIllIlIll(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    lIlIlIllllIll = new DHelper(llllllIII[22], llllllIII[1], llllllIII[68]);
                    bx.add((DHelper) IlIlIllllIll);

                }
            }
            if (ag.llIlIllIlIIl(ck ? 1 : 0)) {
                int[] nArray16 = new int[llllllIII[1]];
                nArray16[ag.llllllIII[0]] = llllllIII[16];
                if (ag.llIlIllIlIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llllllIII[1]];
                    nArray17[ag.llllllIII[0]] = llllllIII[16];
                    if (ag.llIlIllIlIlI(Bank.getFirst((int[])nArray17).getQuantity(), llllllIII[63])) {
                        int[] nArray18 = new int[llllllIII[1]];
                        nArray18[ag.llllllIII[0]] = llllllIII[16];
                        lIlIlIllllIll = new DHelper(llllllIII[16], llllllIII[63] - Bank.getFirst((int[])nArray18).getQuantity(), llllllIII[60]);
                        bx.add((DHelper) IlIlIllllIll);

                    }
                }
                int[] nArray19 = new int[llllllIII[1]];
                nArray19[ag.llllllIII[0]] = llllllIII[16];
                if (ag.llIlIllIlIll(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    lIlIlIllllIll = new DHelper(llllllIII[16], llllllIII[63], llllllIII[60]);
                    bx.add((DHelper) IlIlIllllIll);

                }
                int[] nArray20 = new int[llllllIII[1]];
                nArray20[ag.llllllIII[0]] = llllllIII[23];
                if (ag.llIlIllIlIIl(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[llllllIII[1]];
                    nArray21[ag.llllllIII[0]] = llllllIII[23];
                    if (ag.llIlIllIlIlI(Bank.getFirst((int[])nArray21).getQuantity(), llllllIII[68])) {
                        int[] nArray22 = new int[llllllIII[1]];
                        nArray22[ag.llllllIII[0]] = llllllIII[23];
                        lIlIlIllllIll = new DHelper(llllllIII[23], llllllIII[68] - Bank.getFirst((int[])nArray22).getQuantity(), llllllIII[6]);
                        bx.add((DHelper) IlIlIllllIll);

                    }
                }
                int[] nArray23 = new int[llllllIII[1]];
                nArray23[ag.llllllIII[0]] = llllllIII[23];
                if (ag.llIlIllIlIll(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    lIlIlIllllIll = new DHelper(llllllIII[23], llllllIII[68], llllllIII[6]);
                    bx.add((DHelper) IlIlIllllIll);

                }
            }
        }
        int[] nArray = new int[llllllIII[1]];
        nArray[ag.llllllIII[0]] = llllllIII[20];
        if (ag.llIlIllIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIlIlIllllIll = new DHelper(llllllIII[20], llllllIII[69], llllllIII[40]);
            bx.add((DHelper) IlIlIllllIll);

        }
        if (ag.llIlIllIlIll(Bank.contains(lIlIlIllllIll = item -> item.getName().toLowerCase().contains(lllllIlll[llllllIII[75]])) ? 1 : 0)) {
            lIlIlIllllIlI = new DHelper(llllllIII[70], llllllIII[19], llllllIII[71]);
            bx.add(lIlIlIllllIlI);

        }
        int[] nArray24 = new int[llllllIII[1]];
        nArray24[ag.llllllIII[0]] = llllllIII[72];
        if (ag.llIlIllIlIll(Bank.contains((int[])nArray24) ? 1 : 0)) {
            lIlIlIllllIlI = new DHelper(llllllIII[72], llllllIII[33], llllllIII[73]);
            bx.add(lIlIlIllllIlI);

        }
        int[] nArray25 = new int[llllllIII[1]];
        nArray25[ag.llllllIII[0]] = llllllIII[18];
        if (ag.llIlIllIlIll(Bank.contains((int[])nArray25) ? 1 : 0)) {
            lIlIlIllllIlI = new DHelper(llllllIII[18], llllllIII[33], llllllIII[73]);
            bx.add(lIlIlIllllIlI);

        }
    }

    @Override
    public boolean ae() {
        return llllllIII[0];
    }

    private static boolean llIlIllIllIl(int n2) {
        return n2 > 0;
    }

    private static void llIlIllIIlll() {
        lllllIlll = new String[llllllIII[81]];
        ag.lllllIlll[ag.llllllIII[0]] = "Buying items";
        ag.lllllIlll[ag.llllllIII[1]] = "Finished buying items, switching back to magic training";
        ag.lllllIlll[ag.llllllIII[3]] = "Navigating to bank";
        ag.lllllIlll[ag.llllllIII[4]] = "Handling banking";
        ag.lllllIlll[ag.llllllIII[7]] = "We are missing supplies, switching to BUYING";
        ag.lllllIlll[ag.llllllIII[19]] = "Nav to cows";
        ag.lllllIlll[ag.llllllIII[6]] = "Attacking cows";
        ag.lllllIlll[ag.llllllIII[27]] = "Casting varrock tele";
        ag.lllllIlll[ag.llllllIII[30]] = "Casting lumby tele";
        ag.lllllIlll[ag.llllllIII[32]] = "Casting fally tele";
        ag.lllllIlll[ag.llllllIII[33]] = "Casting cammy tele";
        ag.lllllIlll[ag.llllllIII[34]] = "Alching";
        ag.lllllIlll[ag.llllllIII[37]] = "Wield";
        ag.lllllIlll[ag.llllllIII[39]] = "Move to alch spot";
        ag.lllllIlll[ag.llllllIII[43]] = "Nav to cows";
        ag.lllllIlll[ag.llllllIII[44]] = "Attacking cows";
        ag.lllllIlll[ag.llllllIII[45]] = "Eat";
        ag.lllllIlll[ag.llllllIII[46]] = "Cow";
        ag.lllllIlll[ag.llllllIII[47]] = "cow";
        ag.lllllIlll[ag.llllllIII[49]] = "Attack";
        ag.lllllIlll[ag.llllllIII[53]] = "Opening autocast";
        ag.lllllIlll[ag.llllllIII[54]] = "Choose spell";
        ag.lllllIlll[ag.llllllIII[56]] = "Wind Strike";
        ag.lllllIlll[ag.llllllIII[57]] = "Water Strike";
        ag.lllllIlll[ag.llllllIII[58]] = "Earth Strike";
        ag.lllllIlll[ag.llllllIII[21]] = "Earth Strike";
        ag.lllllIlll[ag.llllllIII[52]] = "Fire Strike";
        ag.lllllIlll[ag.llllllIII[74]] = "Magic training";
        ag.lllllIlll[ag.llllllIII[75]] = "ring of wealth (";
        ag.lllllIlll[ag.llllllIII[76]] = "Cow";
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
                                                    if (!ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[21])) break block19;
                                                    int[] nArray = new int[llllllIII[1]];
                                                    nArray[ag.llllllIII[0]] = llllllIII[9];
                                                    if (!ag.llIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[llllllIII[1]];
                                                    nArray2[ag.llllllIII[0]] = llllllIII[13];
                                                    if (!ag.llIlIllIlIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[llllllIII[1]];
                                                    nArray3[ag.llllllIII[0]] = llllllIII[11];
                                                    if (!ag.llIlIllIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[llllllIII[1]];
                                                    nArray4[ag.llllllIII[0]] = llllllIII[14];
                                                    if (!ag.llIlIllIlIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[llllllIII[1]];
                                                    nArray5[ag.llllllIII[0]] = llllllIII[20];
                                                    if (!ag.llIlIllIlIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[llllllIII[1]];
                                                    nArray6[ag.llllllIII[0]] = llllllIII[48];
                                                    if (!ag.llIlIllIlIll(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[llllllIII[1]];
                                                    nArray7[ag.llllllIII[0]] = llllllIII[48];
                                                    if (!ag.llIlIllIlIIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = llllllIII[1];

                                                if ((0x35 ^ 0x31) != 0) return n5 != 0;
                                                return false;
                                            }
                                            n5 = llllllIII[0];
                                            return n5 != 0;
                                        }
                                        if (!ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[21]) || !ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8])) break block22;
                                        int[] nArray = new int[llllllIII[1]];
                                        nArray[ag.llllllIII[0]] = llllllIII[13];
                                        if (!ag.llIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[llllllIII[1]];
                                        nArray8[ag.llllllIII[0]] = llllllIII[11];
                                        if (!ag.llIlIllIlIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[llllllIII[1]];
                                        nArray9[ag.llllllIII[0]] = llllllIII[14];
                                        if (!ag.llIlIllIlIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[llllllIII[1]];
                                        nArray10[ag.llllllIII[0]] = llllllIII[16];
                                        if (!ag.llIlIllIlIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[llllllIII[1]];
                                        nArray11[ag.llllllIII[0]] = llllllIII[48];
                                        if (!ag.llIlIllIlIll(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[llllllIII[1]];
                                        nArray12[ag.llllllIII[0]] = llllllIII[48];
                                        if (!ag.llIlIllIlIIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = llllllIII[1];

                                    if (-1 >= -1) return n4 != 0;
                                    return ((0x21 ^ 0x74 ^ (0xD1 ^ 0xB5)) & (11 + 14 - -109 + 40 ^ 11 + 57 - -20 + 71 ^ -1)) != 0;
                                }
                                n4 = llllllIII[0];
                                return n4 != 0;
                            }
                            if (!ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8]) || !ag.llIlIllIlIll(ck ? 1 : 0)) break block25;
                            int[] nArray = new int[llllllIII[1]];
                            nArray[ag.llllllIII[0]] = llllllIII[22];
                            if (!ag.llIlIllIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[llllllIII[1]];
                            nArray13[ag.llllllIII[0]] = llllllIII[22];
                            if (!ag.llIlIllIlIIl(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[llllllIII[1]];
                        nArray[ag.llllllIII[0]] = llllllIII[24];
                        if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[llllllIII[1]];
                            nArray14[ag.llllllIII[0]] = llllllIII[38];
                            if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = llllllIII[1];

                                if (-1 < 3) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = llllllIII[0];
                    return n3 != 0;
                }
                if (!ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8]) || !ag.llIlIllIlIIl(ck ? 1 : 0)) return llllllIII[0];
                int[] nArray = new int[llllllIII[1]];
                nArray[ag.llllllIII[0]] = llllllIII[22];
                if (!ag.llIlIllIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[llllllIII[1]];
                nArray15[ag.llllllIII[0]] = llllllIII[22];
                if (!ag.llIlIllIlIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[llllllIII[1]];
            nArray[ag.llllllIII[0]] = llllllIII[16];
            if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[llllllIII[1]];
                nArray16[ag.llllllIII[0]] = llllllIII[23];
                if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llllllIII[1]];
                    nArray17[ag.llllllIII[0]] = llllllIII[23];
                    if (ag.llIlIllIlllI(Inventory.getFirst((int[])nArray17).getQuantity(), llllllIII[19])) {
                        int[] nArray18 = new int[llllllIII[1]];
                        nArray18[ag.llllllIII[0]] = llllllIII[24];
                        if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[llllllIII[1]];
                            nArray19[ag.llllllIII[0]] = llllllIII[38];
                            if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = llllllIII[1];

                                if (1 <= 1) return n2 != 0;
                                return ((0x33 ^ 0x3B ^ (0x87 ^ 0x82)) & (147 + 149 - 242 + 117 ^ 78 + 78 - 96 + 106 ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = llllllIII[0];
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
                                                    if (!ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[21])) break block19;
                                                    int[] nArray = new int[llllllIII[1]];
                                                    nArray[ag.llllllIII[0]] = llllllIII[9];
                                                    if (!ag.llIlIllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[llllllIII[1]];
                                                    nArray2[ag.llllllIII[0]] = llllllIII[13];
                                                    if (!ag.llIlIllIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[llllllIII[1]];
                                                    nArray3[ag.llllllIII[0]] = llllllIII[11];
                                                    if (!ag.llIlIllIlIIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[llllllIII[1]];
                                                    nArray4[ag.llllllIII[0]] = llllllIII[14];
                                                    if (!ag.llIlIllIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[llllllIII[1]];
                                                    nArray5[ag.llllllIII[0]] = llllllIII[20];
                                                    if (!ag.llIlIllIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[llllllIII[1]];
                                                    nArray6[ag.llllllIII[0]] = llllllIII[48];
                                                    if (!ag.llIlIllIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[llllllIII[1]];
                                                    nArray7[ag.llllllIII[0]] = llllllIII[48];
                                                    if (!ag.llIlIllIlIIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = llllllIII[1];

                                                if (-(0x77 ^ 0x73) <= 0) return n5 != 0;
                                                return false;
                                            }
                                            n5 = llllllIII[0];
                                            return n5 != 0;
                                        }
                                        if (!ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[21]) || !ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8])) break block22;
                                        int[] nArray = new int[llllllIII[1]];
                                        nArray[ag.llllllIII[0]] = llllllIII[13];
                                        if (!ag.llIlIllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[llllllIII[1]];
                                        nArray8[ag.llllllIII[0]] = llllllIII[11];
                                        if (!ag.llIlIllIlIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[llllllIII[1]];
                                        nArray9[ag.llllllIII[0]] = llllllIII[14];
                                        if (!ag.llIlIllIlIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[llllllIII[1]];
                                        nArray10[ag.llllllIII[0]] = llllllIII[16];
                                        if (!ag.llIlIllIlIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[llllllIII[1]];
                                        nArray11[ag.llllllIII[0]] = llllllIII[48];
                                        if (!ag.llIlIllIlIll(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[llllllIII[1]];
                                        nArray12[ag.llllllIII[0]] = llllllIII[48];
                                        if (!ag.llIlIllIlIIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = llllllIII[1];

                                    if (2 != (0x23 ^ 0x2D ^ (0xB6 ^ 0xBC))) return n4 != 0;
                                    return false;
                                }
                                n4 = llllllIII[0];
                                return n4 != 0;
                            }
                            if (!ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8]) || !ag.llIlIllIlIll(ck ? 1 : 0)) break block25;
                            int[] nArray = new int[llllllIII[1]];
                            nArray[ag.llllllIII[0]] = llllllIII[22];
                            if (!ag.llIlIllIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[llllllIII[1]];
                            nArray13[ag.llllllIII[0]] = llllllIII[22];
                            if (!ag.llIlIllIlIIl(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[llllllIII[1]];
                        nArray[ag.llllllIII[0]] = llllllIII[24];
                        if (ag.llIlIllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[llllllIII[1]];
                            nArray14[ag.llllllIII[0]] = llllllIII[25];
                            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = llllllIII[1];

                                if (3 == 3) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = llllllIII[0];
                    return n3 != 0;
                }
                if (!ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8]) || !ag.llIlIllIlIIl(ck ? 1 : 0)) return llllllIII[0];
                int[] nArray = new int[llllllIII[1]];
                nArray[ag.llllllIII[0]] = llllllIII[22];
                if (!ag.llIlIllIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[llllllIII[1]];
                nArray15[ag.llllllIII[0]] = llllllIII[22];
                if (!ag.llIlIllIlIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[llllllIII[1]];
            nArray[ag.llllllIII[0]] = llllllIII[16];
            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[llllllIII[1]];
                nArray16[ag.llllllIII[0]] = llllllIII[23];
                if (ag.llIlIllIlIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llllllIII[1]];
                    nArray17[ag.llllllIII[0]] = llllllIII[23];
                    if (ag.llIlIllIlllI(Bank.getFirst((int[])nArray17).getQuantity(), llllllIII[19])) {
                        int[] nArray18 = new int[llllllIII[1]];
                        nArray18[ag.llllllIII[0]] = llllllIII[24];
                        if (ag.llIlIllIlIIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[llllllIII[1]];
                            nArray19[ag.llllllIII[0]] = llllllIII[25];
                            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = llllllIII[1];

                                if (((0x1B ^ 0x4C) & ~(0x50 ^ 7)) == 0) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = llllllIII[0];
        return n2 != 0;
    }

    static {
        ag.llIlIllIlIII();
        ag.llIlIllIIlll();
        ck = llllllIII[0];
        bx = new ArrayList<d>();
        cl = new WorldArea(llllllIII[77], llllllIII[78], llllllIII[53], llllllIII[43], llllllIII[0]);
        cm = new WorldPoint(llllllIII[79], llllllIII[80], llllllIII[0]);
        cn = null;
    }

    private static void am() {
        if (ag.llIlIlllIIlI(ag.llIlIlllIIIl(e.w(), 30.0))) {
            int[] nArray = new int[llllllIII[1]];
            nArray[ag.llllllIII[0]] = llllllIII[20];
            if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llllllIII[1]];
                nArray2[ag.llllllIII[0]] = llllllIII[20];
                Inventory.getFirst((int[])nArray2).interact(lllllIlll[llllllIII[45]]);
                Time.sleepTicks((int)llllllIII[1]);

            }
        }
        if (ag.llIlIlllIIII(Players.getLocal().getInteracting())) {
            NPC lIlIlIlllllll = NPCs.getNearest(nPC -> {
                int n2;
                if (ag.llIlIllIlIIl(nPC.getName().contains(lllllIlll[llllllIII[76]]) ? 1 : 0) && ag.llIlIllIlIll(nPC.isDead() ? 1 : 0)) {
                    n2 = llllllIII[1];

                    if (-1 != -1) {
                        return false;
                    }
                } else {
                    n2 = llllllIII[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[llllllIII[3]];
            stringArray[ag.llllllIII[0]] = lllllIlll[llllllIII[46]];
            stringArray[ag.llllllIII[1]] = lllllIlll[llllllIII[47]];
            List lIlIlIllllllI = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (ag.llIlIlllIIll(nPC.getInteracting(), Players.getLocal())) {
                    bl = llllllIII[1];

                    if (1 >= (0xA ^ 0xE)) {
                        return false;
                    }
                } else {
                    bl = llllllIII[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[llllllIII[1]];
            nArray[ag.llllllIII[0]] = llllllIII[48];
            if (ag.llIlIllIlIIl(Equipment.contains((int[])nArray) ? 1 : 0) && ag.llIlIllIlIll(ag.ap() ? 1 : 0)) {
                ag.aq();
            }
            if (ag.llIlIllIllII(lIlIlIlllllll) && ag.llIlIllIlIll(Players.getLocal().isMoving() ? 1 : 0)) {
                lIlIlIlllllll.interact(lllllIlll[llllllIII[49]]);
                Time.sleepTicks((int)llllllIII[4]);

            }
        }
    }

    private static boolean llIlIllIllll(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(lIlIlIlIlIllI);
    }

    private static boolean llIlIlllIIlI(int n2) {
        return n2 < 0;
    }

    private static int llIlIlllIIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public String AGHelper() {
        return lllllIlll[llllllIII[74]];
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[2])) {
            bl = llllllIII[1];

            if ((0x89 ^ 0xC5 ^ (0x49 ^ 0)) == 0) {
                return ((125 + 75 - 118 + 82 ^ 112 + 71 - 41 + 3) & (0xC6 ^ 0xB8 ^ (0x26 ^ 0x6D) ^ -1)) != 0;
            }
        } else {
            bl = llllllIII[0];
        }
        return bl;
    }

    private static boolean llIlIlllIIII(Object object) {
        return object == null;
    }

    public static void aq() {
        if (ag.llIlIllIllII(Widgets.get((int)llllllIII[51], (int)llllllIII[52]))) {
            AccBuilderGWD.c = lllllIlll[llllllIII[53]];
            Widgets.get((int)llllllIII[51], (int)llllllIII[52]).interact(lllllIlll[llllllIII[54]]);
            Time.sleepTicks((int)llllllIII[7]);

        }
        if (ag.llIlIlllIIII(Widgets.get((int)llllllIII[51], (int)llllllIII[52])) && ag.llIlIllIlIll(Widgets.get((int)llllllIII[55]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)llllllIII[1]);

            if (ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[19])) {
                Widgets.get((int)llllllIII[55], (int)llllllIII[1]).getChild(llllllIII[1]).interact(lllllIlll[llllllIII[56]]);
            }
            if (ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[32]) && ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[19])) {
                Widgets.get((int)llllllIII[55], (int)llllllIII[1]).getChild(llllllIII[3]).interact(lllllIlll[llllllIII[57]]);
            }
            if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[32]) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[39])) {
                Widgets.get((int)llllllIII[55], (int)llllllIII[1]).getChild(llllllIII[4]).interact(lllllIlll[llllllIII[58]]);
            }
            if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[32])) {
                int[] nArray = new int[llllllIII[1]];
                nArray[ag.llllllIII[0]] = llllllIII[14];
                if (ag.llIlIllIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)llllllIII[55], (int)llllllIII[1]).getChild(llllllIII[4]).interact(lllllIlll[llllllIII[21]]);
                }
            }
            if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[39])) {
                int[] nArray = new int[llllllIII[1]];
                nArray[ag.llllllIII[0]] = llllllIII[14];
                if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)llllllIII[55], (int)llllllIII[1]).getChild(llllllIII[7]).interact(lllllIlll[llllllIII[52]]);
                }
            }
            Time.sleepTicks((int)llllllIII[1]);

        }
    }

    private static boolean llIlIllIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIlllIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIlIllIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    public static void ak() {
        if (ag.llIlIllIlIIl(bv ? 1 : 0)) {
            AccBuilderGWD.c = lllllIlll[llllllIII[0]];
            b.a(bx);
            if (ag.llIlIllIlIlI(bx.size(), llllllIII[1])) {
                System.out.println(lllllIlll[llllllIII[1]]);
                bv = llllllIII[0];
            }
        }
        if (ag.llIlIllIlIll(bv ? 1 : 0) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[2])) {
            BankLocation lIlIllIIIIlII;
            if (ag.llIlIllIlIll(ag.an() ? 1 : 0)) {
                lIlIllIIIIlII = BankLocation.getNearest();
                if (ag.llIlIllIllII(lIlIllIIIIlII) && ag.llIlIllIlIll(lIlIllIIIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllllIlll[llllllIII[3]];
                    a.a(lIlIllIIIIlII);
                }
                if (ag.llIlIllIllII(lIlIllIIIIlII) && ag.llIlIllIlIIl(lIlIllIIIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllllIlll[llllllIII[4]];
                    if (ag.llIlIllIlIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllllIII[5]);

                        Time.sleepTicks((int)llllllIII[6]);

                    }
                    if (ag.llIlIllIlIIl(Bank.isOpen() ? 1 : 0)) {
                        if (ag.llIlIllIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllllIII[7]);

                        }
                        while (ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8]) && ag.llIlIllIlIll(H.bT() ? 1 : 0)) {
                            H.bR();
                            Time.sleepTicks((int)llllllIII[1]);

                            if (2 != 0) continue;
                            return;
                        }
                        if (ag.llIlIllIlIll(ag.ao() ? 1 : 0)) {
                            ag.Q();
                            System.out.println(lllllIlll[llllllIII[7]]);
                            bv = llllllIII[1];
                            return;
                        }
                        if (ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8])) {
                            int[] nArray = new int[llllllIII[1]];
                            nArray[ag.llllllIII[0]] = llllllIII[9];
                            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[llllllIII[1]];
                                nArray2[ag.llllllIII[0]] = llllllIII[9];
                                if (ag.llIlIllIlIlI(Inventory.getCount((int[])nArray2), llllllIII[1])) {
                                    Bank.withdraw((int)llllllIII[9], (int)llllllIII[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllllIII[1]];
                                        nArray[ag.llllllIII[0]] = llllllIII[9];
                                        if (ag.llIlIllIllIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllllIII[1];

                                            if (((106 + 55 - 60 + 52 ^ 102 + 36 - 83 + 77) & (0xBE ^ 0xAE ^ (0x27 ^ 0x2A) ^ -1)) != 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = llllllIII[0];
                                        }
                                        return bl;
                                    }, (int)llllllIII[5]);

                                }
                            }
                            int[] nArray3 = new int[llllllIII[1]];
                            nArray3[ag.llllllIII[0]] = llllllIII[11];
                            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[llllllIII[1]];
                                nArray4[ag.llllllIII[0]] = llllllIII[11];
                                if (ag.llIlIllIlIlI(Inventory.getCount((int[])nArray4), llllllIII[1])) {
                                    Bank.withdraw((int)llllllIII[11], (int)llllllIII[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllllIII[1]];
                                        nArray[ag.llllllIII[0]] = llllllIII[11];
                                        if (ag.llIlIllIllIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllllIII[1];

                                            if (2 <= -1) {
                                                return ((0x26 ^ 0x51 ^ (0xDA ^ 0x8E)) & (0xEF ^ 0xC1 ^ (0x17 ^ 0x1A) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llllllIII[0];
                                        }
                                        return bl;
                                    }, (int)llllllIII[5]);

                                }
                            }
                            int[] nArray5 = new int[llllllIII[1]];
                            nArray5[ag.llllllIII[0]] = llllllIII[13];
                            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[llllllIII[1]];
                                nArray6[ag.llllllIII[0]] = llllllIII[13];
                                if (ag.llIlIllIlIlI(Inventory.getCount((int[])nArray6), llllllIII[1])) {
                                    Bank.withdraw((int)llllllIII[13], (int)llllllIII[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllllIII[1]];
                                        nArray[ag.llllllIII[0]] = llllllIII[13];
                                        if (ag.llIlIllIllIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllllIII[1];

                                            }
                                        } else {
                                            bl = llllllIII[0];
                                        }
                                        return bl;
                                    }, (int)llllllIII[5]);

                                }
                            }
                            int[] nArray7 = new int[llllllIII[1]];
                            nArray7[ag.llllllIII[0]] = llllllIII[14];
                            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[llllllIII[1]];
                                nArray8[ag.llllllIII[0]] = llllllIII[14];
                                if (ag.llIlIllIlIlI(Inventory.getCount((int[])nArray8), llllllIII[1])) {
                                    Bank.withdraw((int)llllllIII[14], (int)llllllIII[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllllIII[1]];
                                        nArray[ag.llllllIII[0]] = llllllIII[14];
                                        if (ag.llIlIllIllIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllllIII[1];

                                            if ((0x7B ^ 0x7F) <= 3) {
                                                return false;
                                            }
                                        } else {
                                            bl = llllllIII[0];
                                        }
                                        return bl;
                                    }, (int)llllllIII[5]);

                                }
                            }
                            int[] nArray9 = new int[llllllIII[1]];
                            nArray9[ag.llllllIII[0]] = llllllIII[16];
                            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[llllllIII[1]];
                                nArray10[ag.llllllIII[0]] = llllllIII[16];
                                if (ag.llIlIllIlIlI(Inventory.getCount((int[])nArray10), llllllIII[1])) {
                                    Bank.withdraw((int)llllllIII[16], (int)llllllIII[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllllIII[1]];
                                        nArray[ag.llllllIII[0]] = llllllIII[16];
                                        if (ag.llIlIllIllIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllllIII[1];

                                            if (-1 == (0x7A ^ 0x7E)) {
                                                return false;
                                            }
                                        } else {
                                            bl = llllllIII[0];
                                        }
                                        return bl;
                                    }, (int)llllllIII[5]);

                                }
                            }
                            int[] nArray11 = new int[llllllIII[1]];
                            nArray11[ag.llllllIII[0]] = llllllIII[17];
                            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[llllllIII[1]];
                                nArray12[ag.llllllIII[0]] = llllllIII[17];
                                if (ag.llIlIllIlIll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)llllllIII[17], (int)llllllIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIII[1]);

                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[llllllIII[1]];
                                        nArray[ag.llllllIII[0]] = llllllIII[17];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)llllllIII[5]);

                                }
                            }
                            Bank.withdraw((int)llllllIII[18], (int)llllllIII[19], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[llllllIII[1]];
                            nArray13[ag.llllllIII[0]] = llllllIII[20];
                            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[llllllIII[1]];
                                nArray14[ag.llllllIII[0]] = llllllIII[20];
                                if (ag.llIlIllIlIlI(Inventory.getCount((int[])nArray14), llllllIII[1]) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[21])) {
                                    Bank.withdrawAll((int)llllllIII[20], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllllIII[1]];
                                        nArray[ag.llllllIII[0]] = llllllIII[20];
                                        if (ag.llIlIllIllIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllllIII[1];

                                            if (2 <= -1) {
                                                return false;
                                            }
                                        } else {
                                            bl = llllllIII[0];
                                        }
                                        return bl;
                                    }, (int)llllllIII[5]);

                                }
                            }
                        }
                        if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8])) {
                            int[] nArray = new int[llllllIII[1]];
                            nArray[ag.llllllIII[0]] = llllllIII[22];
                            if (ag.llIlIllIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)llllllIII[22], (int)llllllIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llllllIII[1]);

                            }
                            if (ag.llIlIllIlIIl(ck ? 1 : 0)) {
                                Bank.withdrawAll((int)llllllIII[23], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llllllIII[1]);

                                Bank.withdrawAll((int)llllllIII[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llllllIII[1]);

                            }
                            Time.sleepTicks((int)llllllIII[4]);

                            Bank.withdrawAll((int)llllllIII[24], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)llllllIII[1]);

                            Bank.withdrawAll((int)llllllIII[25], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)llllllIII[1]);

                        }
                    }
                }
            }
            if (ag.llIlIllIlIIl(ag.an() ? 1 : 0)) {
                if (ag.llIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[21])) {
                    if (ag.llIlIllIlIll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lllllIlll[llllllIII[19]];
                        Movement.walkTo((WorldPoint)cm);

                        Time.sleepTicks((int)llllllIII[1]);

                    }
                    if (ag.llIlIllIlIIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lllllIlll[llllllIII[6]];
                        ag.am();
                    }
                }
                if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[21]) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[26])) {
                    AccBuilderGWD.c = lllllIlll[llllllIII[27]];
                    if (ag.llIlIllIllll(Players.getLocal().getAnimation(), llllllIII[28])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)llllllIII[1]);

                    }
                }
                if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[26]) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[29])) {
                    AccBuilderGWD.c = lllllIlll[llllllIII[30]];
                    if (ag.llIlIllIllll(Players.getLocal().getAnimation(), llllllIII[28])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)llllllIII[1]);

                    }
                }
                if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[29]) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[31])) {
                    AccBuilderGWD.c = lllllIlll[llllllIII[32]];
                    if (ag.llIlIllIllll(Players.getLocal().getAnimation(), llllllIII[28])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)llllllIII[1]);

                    }
                }
                if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[31]) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8])) {
                    AccBuilderGWD.c = lllllIlll[llllllIII[33]];
                    if (ag.llIlIllIllll(Players.getLocal().getAnimation(), llllllIII[28])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)llllllIII[1]);

                    }
                }
                if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8])) {
                    int lIlIllIIIIIlI;
                    AccBuilderGWD.c = lllllIlll[llllllIII[34]];
                    if (ag.llIlIlllIIII(cn)) {
                        cn = new WorldPoint(llllllIII[35] + e.c(llllllIII[1], llllllIII[7]), llllllIII[36], llllllIII[0]);
                    }
                    int[] nArray = new int[llllllIII[1]];
                    nArray[ag.llllllIII[0]] = llllllIII[22];
                    if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[llllllIII[1]];
                        nArray15[ag.llllllIII[0]] = llllllIII[22];
                        if (ag.llIlIllIlIll(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[llllllIII[1]];
                            nArray16[ag.llllllIII[0]] = llllllIII[22];
                            Inventory.getFirst((int[])nArray16).interact(lllllIlll[llllllIII[37]]);
                            Time.sleepTicks((int)llllllIII[1]);

                        }
                    }
                    if (ag.llIlIllIlIIl(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[llllllIII[1]];
                    nArray17[ag.llllllIII[0]] = llllllIII[24];
                    lIlIllIIIIlII = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[llllllIII[1]];
                    nArray18[ag.llllllIII[0]] = llllllIII[38];
                    Item lIlIllIIIIIll = Inventory.getFirst((int[])nArray18);
                    if (ag.llIlIllIlIll(ck ? 1 : 0) && ag.llIlIllIllII(cn)) {
                        if (ag.llIlIllIlIll(Players.getLocal().getWorldLocation().equals((Object)cn) ? 1 : 0)) {
                            AccBuilderGWD.c = lllllIlll[llllllIII[39]];
                            Movement.walkTo((WorldPoint)cn);

                            Time.sleepTicks((int)llllllIII[1]);

                        }
                        if (ag.llIlIllIlIIl(Players.getLocal().getWorldLocation().equals((Object)cn) ? 1 : 0) && ag.llIlIllIllII(lIlIllIIIIlII) && ag.llIlIllIllII(lIlIllIIIIIll)) {
                            lIlIllIIIIIlI = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIlIllIIIIIll);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (ag.llIlIlllIlII(Skills.getExperience((Skill)Skill.MAGIC), lIlIllIIIIIlI)) {
                                    bl = llllllIII[1];

                                    if (2 != 2) {
                                        return ((0x11 ^ 0x45 ^ (0xD7 ^ 0x99)) & (158 + 107 - 84 + 36 ^ 186 + 80 - 162 + 91 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llllllIII[0];
                                }
                                return bl;
                            }, (int)llllllIII[10]);

                            Time.sleep((long)e.c(llllllIII[40], llllllIII[41]));

                        }
                    }
                    if (ag.llIlIllIlIIl(ck ? 1 : 0)) {
                        if (ag.llIlIllIllII(lIlIllIIIIlII) && ag.llIlIllIllII(lIlIllIIIIIll) && ag.llIlIllIllll(Players.getLocal().getAnimation(), llllllIII[28])) {
                            lIlIllIIIIIlI = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIlIllIIIIIll);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (ag.llIlIlllIlII(Skills.getExperience((Skill)Skill.MAGIC), lIlIllIIIIIlI)) {
                                    bl = llllllIII[1];

                                    if (-1 != -1) {
                                        return ((0x69 ^ 0x43 ^ (0x7E ^ 0x6F)) & (0xA ^ 0x37 ^ (0x8D ^ 0x8B) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llllllIII[0];
                                }
                                return bl;
                            }, (int)llllllIII[10]);

                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (ag.llIlIllIllll(Players.getLocal().getAnimation(), llllllIII[28])) {
                                bl = llllllIII[1];

                                if (1 < -1) {
                                    return false;
                                }
                            } else {
                                bl = llllllIII[0];
                            }
                            return bl;
                        }, (int)llllllIII[42]);

                    }
                }
            }
        }
    }
}

