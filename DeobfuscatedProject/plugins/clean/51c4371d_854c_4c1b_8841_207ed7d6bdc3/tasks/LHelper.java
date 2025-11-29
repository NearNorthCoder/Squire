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
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.AHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.BHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.DHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.EHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.UHelper;
import gg.squire.account.AccBuilderBarrows;
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

public class LHelper
implements F {

    public static  List<d> bB;
    static  WorldPoint bE;
    static  WorldPoint bD;
    static  WorldArea bC;
    public static  boolean bz;
    public static  boolean bA;

    @Override
    public String V() {
        return llIlIIIl[llIlIlII[72]];
    }

    private static boolean lIllIIIIlII(int n2) {
        return n2 < 0;
    }

    public static void aa() {
        if (l.lIlIlllllII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (l.lIlIllllllI(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = llIlIIIl[llIlIlII[40]];
            Movement.walkTo((WorldPoint)bD);

            Time.sleepTicks((int)llIlIlII[1]);

        }
        if (l.lIlIlllllII(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            l.ab();
        }
    }

    @Override
    public int U() {
        try {
            l.Z();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x35 ^ 0x79 ^ (0x68 ^ 0x20)) & (0x5B ^ 0 ^ (0x25 ^ 0x7A) ^ -1)) > 0) {
            return (73 + 150 - 166 + 114 ^ 10 + 118 - 106 + 158) & (137 + 182 - 214 + 83 ^ 143 + 67 - 188 + 141 ^ -1);
        }
        return llIlIlII[67];
    }

    private static boolean lIllIIIIlIl(Object object) {
        return object == null;
    }

    private static boolean lIlIllllllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIllI(Object object, Object object2) {
        return object == object2;
    }

        return String.valueOf(lIlIIllIllIlllI);
    }

    private static boolean lIlIlllllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlllllll(Object object) {
        return object != null;
    }

    @Override
    public boolean T() {
        return llIlIlII[0];
    }

    private static void ag() {
        d lIlIIlllIIlIIlI;
        Object lIlIIlllIIlIIll;
        if (l.lIlIlllllIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[6])) {
            int[] nArray = new int[llIlIlII[1]];
            nArray[l.llIlIlII[0]] = llIlIlII[14];
            if (l.lIlIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new DHelper(llIlIlII[14], llIlIlII[57], llIlIlII[58]);
                bB.add(d2);

            }
            int[] nArray2 = new int[llIlIlII[1]];
            nArray2[l.llIlIlII[0]] = llIlIlII[7];
            if (l.lIlIllllllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                lIlIIlllIIlIIll = new DHelper(llIlIlII[7], llIlIlII[59], llIlIlII[24]);
                bB.add((DHelper) IlIIlllIIlIIll);

            }
            int[] nArray3 = new int[llIlIlII[1]];
            nArray3[l.llIlIlII[0]] = llIlIlII[9];
            if (l.lIlIllllllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                lIlIIlllIIlIIll = new DHelper(llIlIlII[9], llIlIlII[60], llIlIlII[24]);
                bB.add((DHelper) IlIIlllIIlIIll);

            }
            int[] nArray4 = new int[llIlIlII[1]];
            nArray4[l.llIlIlII[0]] = llIlIlII[11];
            if (l.lIlIllllllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                lIlIIlllIIlIIll = new DHelper(llIlIlII[11], llIlIlII[61], llIlIlII[24]);
                bB.add((DHelper) IlIIlllIIlIIll);

            }
            int[] nArray5 = new int[llIlIlII[1]];
            nArray5[l.llIlIlII[0]] = llIlIlII[12];
            if (l.lIlIllllllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                lIlIIlllIIlIIll = new DHelper(llIlIlII[12], llIlIlII[4], llIlIlII[24]);
                bB.add((DHelper) IlIIlllIIlIIll);

            }
            int[] nArray6 = new int[llIlIlII[1]];
            nArray6[l.llIlIlII[0]] = llIlIlII[44];
            if (l.lIlIllllllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                lIlIIlllIIlIIll = new DHelper(llIlIlII[44], llIlIlII[1], e.c(llIlIlII[62], llIlIlII[63]));
                bB.add((DHelper) IlIIlllIIlIIll);

            }
        }
        if (l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[6])) {
            int[] nArray = new int[llIlIlII[1]];
            nArray[l.llIlIlII[0]] = llIlIlII[22];
            if (l.lIlIlllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[llIlIlII[1]];
                nArray7[l.llIlIlII[0]] = llIlIlII[22];
                if (l.lIlIlllllIl(Bank.getFirst((int[])nArray7).getQuantity(), llIlIlII[61])) {
                    int[] nArray8 = new int[llIlIlII[1]];
                    nArray8[l.llIlIlII[0]] = llIlIlII[22];
                    lIlIIlllIIlIIll = new DHelper(llIlIlII[22], llIlIlII[61] - Bank.getFirst((int[])nArray8).getQuantity(), llIlIlII[64]);
                    bB.add((DHelper) IlIIlllIIlIIll);

                }
            }
            int[] nArray9 = new int[llIlIlII[1]];
            nArray9[l.llIlIlII[0]] = llIlIlII[22];
            if (l.lIlIllllllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                lIlIIlllIIlIIll = new DHelper(llIlIlII[22], llIlIlII[61], llIlIlII[64]);
                bB.add((DHelper) IlIIlllIIlIIll);

            }
            int[] nArray10 = new int[llIlIlII[1]];
            nArray10[l.llIlIlII[0]] = llIlIlII[23];
            if (l.lIlIlllllII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[llIlIlII[1]];
                nArray11[l.llIlIlII[0]] = llIlIlII[23];
                if (l.lIlIlllllIl(Bank.getFirst((int[])nArray11).getQuantity(), llIlIlII[61])) {
                    int[] nArray12 = new int[llIlIlII[1]];
                    nArray12[l.llIlIlII[0]] = llIlIlII[23];
                    lIlIIlllIIlIIll = new DHelper(llIlIlII[23], llIlIlII[61] - Bank.getFirst((int[])nArray12).getQuantity(), llIlIlII[65]);
                    bB.add((DHelper) IlIIlllIIlIIll);

                }
            }
            int[] nArray13 = new int[llIlIlII[1]];
            nArray13[l.llIlIlII[0]] = llIlIlII[23];
            if (l.lIlIllllllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                lIlIIlllIIlIIll = new DHelper(llIlIlII[23], llIlIlII[61], llIlIlII[65]);
                bB.add((DHelper) IlIIlllIIlIIll);

            }
            int[] nArray14 = new int[llIlIlII[1]];
            nArray14[l.llIlIlII[0]] = llIlIlII[20];
            if (l.lIlIllllllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[llIlIlII[1]];
                nArray15[l.llIlIlII[0]] = llIlIlII[20];
                if (l.lIlIllllllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    lIlIIlllIIlIIll = new DHelper(llIlIlII[20], llIlIlII[1], llIlIlII[66]);
                    bB.add((DHelper) IlIIlllIIlIIll);

                }
            }
            if (l.lIlIlllllII(bA ? 1 : 0)) {
                int[] nArray16 = new int[llIlIlII[1]];
                nArray16[l.llIlIlII[0]] = llIlIlII[14];
                if (l.lIlIlllllII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llIlIlII[1]];
                    nArray17[l.llIlIlII[0]] = llIlIlII[14];
                    if (l.lIlIlllllIl(Bank.getFirst((int[])nArray17).getQuantity(), llIlIlII[61])) {
                        int[] nArray18 = new int[llIlIlII[1]];
                        nArray18[l.llIlIlII[0]] = llIlIlII[14];
                        lIlIIlllIIlIIll = new DHelper(llIlIlII[14], llIlIlII[61] - Bank.getFirst((int[])nArray18).getQuantity(), llIlIlII[58]);
                        bB.add((DHelper) IlIIlllIIlIIll);

                    }
                }
                int[] nArray19 = new int[llIlIlII[1]];
                nArray19[l.llIlIlII[0]] = llIlIlII[14];
                if (l.lIlIllllllI(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    lIlIIlllIIlIIll = new DHelper(llIlIlII[14], llIlIlII[61], llIlIlII[58]);
                    bB.add((DHelper) IlIIlllIIlIIll);

                }
                int[] nArray20 = new int[llIlIlII[1]];
                nArray20[l.llIlIlII[0]] = llIlIlII[21];
                if (l.lIlIlllllII(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[llIlIlII[1]];
                    nArray21[l.llIlIlII[0]] = llIlIlII[21];
                    if (l.lIlIlllllIl(Bank.getFirst((int[])nArray21).getQuantity(), llIlIlII[66])) {
                        int[] nArray22 = new int[llIlIlII[1]];
                        nArray22[l.llIlIlII[0]] = llIlIlII[21];
                        lIlIIlllIIlIIll = new DHelper(llIlIlII[21], llIlIlII[66] - Bank.getFirst((int[])nArray22).getQuantity(), llIlIlII[24]);
                        bB.add((DHelper) IlIIlllIIlIIll);

                    }
                }
                int[] nArray23 = new int[llIlIlII[1]];
                nArray23[l.llIlIlII[0]] = llIlIlII[21];
                if (l.lIlIllllllI(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    lIlIIlllIIlIIll = new DHelper(llIlIlII[21], llIlIlII[66], llIlIlII[24]);
                    bB.add((DHelper) IlIIlllIIlIIll);

                }
            }
        }
        int[] nArray = new int[llIlIlII[1]];
        nArray[l.llIlIlII[0]] = llIlIlII[18];
        if (l.lIlIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIlIIlllIIlIIll = new DHelper(llIlIlII[18], llIlIlII[67], llIlIlII[37]);
            bB.add((DHelper) IlIIlllIIlIIll);

        }
        if (l.lIlIllllllI(Bank.contains(lIlIIlllIIlIIll = item -> item.getName().toLowerCase().contains(llIlIIIl[llIlIlII[74]])) ? 1 : 0)) {
            lIlIIlllIIlIIlI = new DHelper(llIlIlII[68], llIlIlII[17], llIlIlII[69]);
            bB.add(lIlIIlllIIlIIlI);

        }
        int[] nArray24 = new int[llIlIlII[1]];
        nArray24[l.llIlIlII[0]] = llIlIlII[70];
        if (l.lIlIllllllI(Bank.contains((int[])nArray24) ? 1 : 0)) {
            lIlIIlllIIlIIlI = new DHelper(llIlIlII[70], llIlIlII[32], llIlIlII[71]);
            bB.add(lIlIIlllIIlIIlI);

        }
        int[] nArray25 = new int[llIlIlII[1]];
        nArray25[l.llIlIlII[0]] = llIlIlII[16];
        if (l.lIlIllllllI(Bank.contains((int[])nArray25) ? 1 : 0)) {
            lIlIIlllIIlIIlI = new DHelper(llIlIlII[16], llIlIlII[32], llIlIlII[71]);
            bB.add(lIlIIlllIIlIIlI);

        }
    }

    private static boolean lIllIIIIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIlIlllIlll() {
        llIlIIIl = new String[llIlIlII[25]];
        l.llIlIIIl[l.llIlIlII[0]] = "Buying items";
        l.llIlIIIl[l.llIlIlII[1]] = "Finished buying items, switching back to magic training";
        l.llIlIIIl[l.llIlIlII[2]] = "Navigating to bank";
        l.llIlIIIl[l.llIlIlII[3]] = "Handling banking";
        l.llIlIIIl[l.llIlIlII[5]] = "We are missing supplies, switching to BUYING";
        l.llIlIIIl[l.llIlIlII[17]] = "Nav to cows";
        l.llIlIIIl[l.llIlIlII[24]] = "Attacking cows";
        l.llIlIIIl[l.llIlIlII[26]] = "Casting varrock tele";
        l.llIlIIIl[l.llIlIlII[29]] = "Casting lumby tele";
        l.llIlIIIl[l.llIlIlII[31]] = "Casting fally tele";
        l.llIlIIIl[l.llIlIlII[32]] = "Casting cammy tele";
        l.llIlIIIl[l.llIlIlII[33]] = "Alching";
        l.llIlIIIl[l.llIlIlII[34]] = "Wield";
        l.llIlIIIl[l.llIlIlII[36]] = "Move to alch spot";
        l.llIlIIIl[l.llIlIlII[40]] = "Nav to cows";
        l.llIlIIIl[l.llIlIlII[41]] = "Eat";
        l.llIlIIIl[l.llIlIlII[42]] = "Cow";
        l.llIlIIIl[l.llIlIlII[43]] = "cow";
        l.llIlIIIl[l.llIlIlII[45]] = "Attacking cows";
        l.llIlIIIl[l.llIlIlII[46]] = "Attack";
        l.llIlIIIl[l.llIlIlII[47]] = "In combat";
        l.llIlIIIl[l.llIlIlII[51]] = "Opening autocast";
        l.llIlIIIl[l.llIlIlII[52]] = "Choose spell";
        l.llIlIIIl[l.llIlIlII[54]] = "Wind Strike";
        l.llIlIIIl[l.llIlIlII[55]] = "Water Strike";
        l.llIlIIIl[l.llIlIlII[19]] = "Earth Strike";
        l.llIlIIIl[l.llIlIlII[50]] = "Earth Strike";
        l.llIlIIIl[l.llIlIlII[56]] = "Fire Strike";
        l.llIlIIIl[l.llIlIlII[72]] = "Magic training";
        l.llIlIIIl[l.llIlIlII[74]] = "ring of wealth (";
        l.llIlIIIl[l.llIlIlII[75]] = "Cow";
    }

    private static boolean lIllIIIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        l.lIlIllllIll();
        l.lIlIlllIlll();
        bB = new ArrayList<d>();
        bC = new WorldArea(llIlIlII[76], llIlIlII[77], llIlIlII[47], llIlIlII[40], llIlIlII[0]);
        bD = new WorldPoint(llIlIlII[78], llIlIlII[79], llIlIlII[0]);
        bE = new WorldPoint(llIlIlII[80] + e.c(llIlIlII[1], llIlIlII[5]), llIlIlII[81], llIlIlII[0]);
    }

    private static boolean lIlIlllllIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ad() {
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
                                                    if (!l.lIlIlllllIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[19])) break block19;
                                                    int[] nArray = new int[llIlIlII[1]];
                                                    nArray[l.llIlIlII[0]] = llIlIlII[7];
                                                    if (!l.lIlIlllllII(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[llIlIlII[1]];
                                                    nArray2[l.llIlIlII[0]] = llIlIlII[11];
                                                    if (!l.lIlIlllllII(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[llIlIlII[1]];
                                                    nArray3[l.llIlIlII[0]] = llIlIlII[9];
                                                    if (!l.lIlIlllllII(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[llIlIlII[1]];
                                                    nArray4[l.llIlIlII[0]] = llIlIlII[12];
                                                    if (!l.lIlIlllllII(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[llIlIlII[1]];
                                                    nArray5[l.llIlIlII[0]] = llIlIlII[18];
                                                    if (!l.lIlIlllllII(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[llIlIlII[1]];
                                                    nArray6[l.llIlIlII[0]] = llIlIlII[44];
                                                    if (!l.lIlIllllllI(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[llIlIlII[1]];
                                                    nArray7[l.llIlIlII[0]] = llIlIlII[44];
                                                    if (!l.lIlIlllllII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = llIlIlII[1];

                                                if (1 < 2) return n5 != 0;
                                                return false;
                                            }
                                            n5 = llIlIlII[0];
                                            return n5 != 0;
                                        }
                                        if (!l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[19]) || !l.lIlIlllllIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[6])) break block22;
                                        int[] nArray = new int[llIlIlII[1]];
                                        nArray[l.llIlIlII[0]] = llIlIlII[11];
                                        if (!l.lIlIlllllII(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[llIlIlII[1]];
                                        nArray8[l.llIlIlII[0]] = llIlIlII[9];
                                        if (!l.lIlIlllllII(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[llIlIlII[1]];
                                        nArray9[l.llIlIlII[0]] = llIlIlII[12];
                                        if (!l.lIlIlllllII(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[llIlIlII[1]];
                                        nArray10[l.llIlIlII[0]] = llIlIlII[14];
                                        if (!l.lIlIlllllII(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[llIlIlII[1]];
                                        nArray11[l.llIlIlII[0]] = llIlIlII[44];
                                        if (!l.lIlIllllllI(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[llIlIlII[1]];
                                        nArray12[l.llIlIlII[0]] = llIlIlII[44];
                                        if (!l.lIlIlllllII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = llIlIlII[1];

                                    if (-1 <= 0) return n4 != 0;
                                    return ((0xE0 ^ 0xB3 ^ (0xBB ^ 0xBD)) & (0x57 ^ 0x52 ^ (0xD8 ^ 0x88) ^ -1)) != 0;
                                }
                                n4 = llIlIlII[0];
                                return n4 != 0;
                            }
                            if (!l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[6]) || !l.lIlIllllllI(bA ? 1 : 0)) break block25;
                            int[] nArray = new int[llIlIlII[1]];
                            nArray[l.llIlIlII[0]] = llIlIlII[20];
                            if (!l.lIlIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[llIlIlII[1]];
                            nArray13[l.llIlIlII[0]] = llIlIlII[20];
                            if (!l.lIlIlllllII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[llIlIlII[1]];
                        nArray[l.llIlIlII[0]] = llIlIlII[22];
                        if (l.lIlIlllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[llIlIlII[1]];
                            nArray14[l.llIlIlII[0]] = llIlIlII[23];
                            if (l.lIlIlllllII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = llIlIlII[1];

                                if (2 <= 2) return n3 != 0;
                                return ((176 + 68 - 163 + 100 ^ 6 + 115 - 76 + 105) & (0x6E ^ 0x7F ^ (0x65 ^ 0x57) ^ -1)) != 0;
                            }
                        }
                    }
                    n3 = llIlIlII[0];
                    return n3 != 0;
                }
                if (!l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[6]) || !l.lIlIlllllII(bA ? 1 : 0)) return llIlIlII[0];
                int[] nArray = new int[llIlIlII[1]];
                nArray[l.llIlIlII[0]] = llIlIlII[20];
                if (!l.lIlIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[llIlIlII[1]];
                nArray15[l.llIlIlII[0]] = llIlIlII[20];
                if (!l.lIlIlllllII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[llIlIlII[1]];
            nArray[l.llIlIlII[0]] = llIlIlII[14];
            if (l.lIlIlllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[llIlIlII[1]];
                nArray16[l.llIlIlII[0]] = llIlIlII[21];
                if (l.lIlIlllllII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llIlIlII[1]];
                    nArray17[l.llIlIlII[0]] = llIlIlII[21];
                    if (l.lIllIIIIIIl(Bank.getFirst((int[])nArray17).getQuantity(), llIlIlII[17])) {
                        int[] nArray18 = new int[llIlIlII[1]];
                        nArray18[l.llIlIlII[0]] = llIlIlII[22];
                        if (l.lIlIlllllII(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[llIlIlII[1]];
                            nArray19[l.llIlIlII[0]] = llIlIlII[23];
                            if (l.lIlIlllllII(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = llIlIlII[1];

                                if ((0xA ^ 0xE) != 1) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = llIlIlII[0];
        return n2 != 0;
    }

    private static void ab() {
        if (l.lIllIIIIlII(l.lIllIIIIIll(e.v(), 30.0))) {
            int[] nArray = new int[llIlIlII[1]];
            nArray[l.llIlIlII[0]] = llIlIlII[18];
            if (l.lIlIlllllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIlIlII[1]];
                nArray2[l.llIlIlII[0]] = llIlIlII[18];
                Inventory.getFirst((int[])nArray2).interact(llIlIIIl[llIlIlII[41]]);
                Time.sleepTicks((int)llIlIlII[1]);

            }
        }
        if (l.lIllIIIIlIl(Players.getLocal().getInteracting())) {
            NPC lIlIIlllIIlIlll = NPCs.getNearest(nPC -> {
                int n2;
                if (l.lIlIlllllII(nPC.getName().contains(llIlIIIl[llIlIlII[75]]) ? 1 : 0) && l.lIlIllllllI(nPC.isDead() ? 1 : 0)) {
                    n2 = llIlIlII[1];

                    if (((0x43 ^ 0x19 ^ (0xA1 ^ 0xC6)) & (0x9F ^ 0x8B ^ (7 ^ 0x2E) ^ -1)) != 0) {
                        return ((0x63 ^ 0x32 ^ (0x15 ^ 0x61)) & (0x65 ^ 6 ^ (0x4D ^ 0xB) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIlIlII[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[llIlIlII[2]];
            stringArray[l.llIlIlII[0]] = llIlIIIl[llIlIlII[42]];
            stringArray[l.llIlIlII[1]] = llIlIIIl[llIlIlII[43]];
            List lIlIIlllIIlIllI = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (l.lIllIIIIllI(nPC.getInteracting(), Players.getLocal())) {
                    bl = llIlIlII[1];

                } else {
                    bl = llIlIlII[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[llIlIlII[1]];
            nArray[l.llIlIlII[0]] = llIlIlII[44];
            if (l.lIlIlllllII(Equipment.contains((int[])nArray) ? 1 : 0) && l.lIlIllllllI(l.ae() ? 1 : 0)) {
                l.af();
            }
            if (l.lIlIlllllll(lIlIIlllIIlIlll) && l.lIlIllllllI(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderBarrows.c = llIlIIIl[llIlIlII[45]];
                lIlIIlllIIlIlll.interact(llIlIIIl[llIlIlII[46]]);
                Time.sleepTicks((int)llIlIlII[3]);

            }
        }
        if (l.lIlIlllllll(Players.getLocal().getInteracting())) {
            AccBuilderBarrows.c = llIlIIIl[llIlIlII[47]];
            Time.sleepTicks((int)llIlIlII[1]);

        }
    }

    @Override
    public boolean W() {
        boolean bl;
        if (l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[73])) {
            bl = llIlIlII[1];

            }
        } else {
            bl = llIlIlII[0];
        }
        return bl;
    }

    private static int lIllIIIIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public static boolean ae() {
        if (l.lIllIIIIIlI(Vars.getBit((int)llIlIlII[48]), llIlIlII[1]) && l.lIlIlllllIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[17])) {
            return llIlIlII[1];
        }
        if (l.lIllIIIIIlI(Vars.getBit((int)llIlIlII[48]), llIlIlII[2]) && l.lIlIlllllIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[31]) && l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[17])) {
            return llIlIlII[1];
        }
        if (l.lIllIIIIIlI(Vars.getBit((int)llIlIlII[48]), llIlIlII[3]) && l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[31]) && l.lIlIlllllIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[36])) {
            return llIlIlII[1];
        }
        if (l.lIllIIIIIlI(Vars.getBit((int)llIlIlII[48]), llIlIlII[3]) && l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[31])) {
            int[] nArray = new int[llIlIlII[1]];
            nArray[l.llIlIlII[0]] = llIlIlII[12];
            if (l.lIlIllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return llIlIlII[1];
            }
        }
        if (l.lIllIIIIIlI(Vars.getBit((int)llIlIlII[48]), llIlIlII[5]) && l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[36])) {
            int[] nArray = new int[llIlIlII[1]];
            nArray[l.llIlIlII[0]] = llIlIlII[12];
            if (l.lIlIlllllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return llIlIlII[1];
            }
        }
        return llIlIlII[0];
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
                                                    if (!l.lIlIlllllIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[19])) break block19;
                                                    int[] nArray = new int[llIlIlII[1]];
                                                    nArray[l.llIlIlII[0]] = llIlIlII[7];
                                                    if (!l.lIlIlllllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[llIlIlII[1]];
                                                    nArray2[l.llIlIlII[0]] = llIlIlII[11];
                                                    if (!l.lIlIlllllII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[llIlIlII[1]];
                                                    nArray3[l.llIlIlII[0]] = llIlIlII[9];
                                                    if (!l.lIlIlllllII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[llIlIlII[1]];
                                                    nArray4[l.llIlIlII[0]] = llIlIlII[12];
                                                    if (!l.lIlIlllllII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[llIlIlII[1]];
                                                    nArray5[l.llIlIlII[0]] = llIlIlII[18];
                                                    if (!l.lIlIlllllII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[llIlIlII[1]];
                                                    nArray6[l.llIlIlII[0]] = llIlIlII[44];
                                                    if (!l.lIlIllllllI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[llIlIlII[1]];
                                                    nArray7[l.llIlIlII[0]] = llIlIlII[44];
                                                    if (!l.lIlIlllllII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = llIlIlII[1];

                                                if (-(0x74 ^ 0x71) < 0) return n5 != 0;
                                                return false;
                                            }
                                            n5 = llIlIlII[0];
                                            return n5 != 0;
                                        }
                                        if (!l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[19]) || !l.lIlIlllllIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[6])) break block22;
                                        int[] nArray = new int[llIlIlII[1]];
                                        nArray[l.llIlIlII[0]] = llIlIlII[11];
                                        if (!l.lIlIlllllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[llIlIlII[1]];
                                        nArray8[l.llIlIlII[0]] = llIlIlII[9];
                                        if (!l.lIlIlllllII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[llIlIlII[1]];
                                        nArray9[l.llIlIlII[0]] = llIlIlII[12];
                                        if (!l.lIlIlllllII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[llIlIlII[1]];
                                        nArray10[l.llIlIlII[0]] = llIlIlII[14];
                                        if (!l.lIlIlllllII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[llIlIlII[1]];
                                        nArray11[l.llIlIlII[0]] = llIlIlII[44];
                                        if (!l.lIlIllllllI(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[llIlIlII[1]];
                                        nArray12[l.llIlIlII[0]] = llIlIlII[44];
                                        if (!l.lIlIlllllII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = llIlIlII[1];

                                    if ((34 + 83 - -5 + 53 ^ 120 + 8 - -19 + 24) > -1) return n4 != 0;
                                    return false;
                                }
                                n4 = llIlIlII[0];
                                return n4 != 0;
                            }
                            if (!l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[6]) || !l.lIlIllllllI(bA ? 1 : 0)) break block25;
                            int[] nArray = new int[llIlIlII[1]];
                            nArray[l.llIlIlII[0]] = llIlIlII[20];
                            if (!l.lIlIllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[llIlIlII[1]];
                            nArray13[l.llIlIlII[0]] = llIlIlII[20];
                            if (!l.lIlIlllllII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[llIlIlII[1]];
                        nArray[l.llIlIlII[0]] = llIlIlII[22];
                        if (l.lIlIlllllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[llIlIlII[1]];
                            nArray14[l.llIlIlII[0]] = llIlIlII[35];
                            if (l.lIlIlllllII(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = llIlIlII[1];

                                if (-2 < 0) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = llIlIlII[0];
                    return n3 != 0;
                }
                if (!l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[6]) || !l.lIlIlllllII(bA ? 1 : 0)) return llIlIlII[0];
                int[] nArray = new int[llIlIlII[1]];
                nArray[l.llIlIlII[0]] = llIlIlII[20];
                if (!l.lIlIllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[llIlIlII[1]];
                nArray15[l.llIlIlII[0]] = llIlIlII[20];
                if (!l.lIlIlllllII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[llIlIlII[1]];
            nArray[l.llIlIlII[0]] = llIlIlII[14];
            if (l.lIlIlllllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[llIlIlII[1]];
                nArray16[l.llIlIlII[0]] = llIlIlII[21];
                if (l.lIlIlllllII(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llIlIlII[1]];
                    nArray17[l.llIlIlII[0]] = llIlIlII[21];
                    if (l.lIllIIIIIIl(Inventory.getFirst((int[])nArray17).getQuantity(), llIlIlII[17])) {
                        int[] nArray18 = new int[llIlIlII[1]];
                        nArray18[l.llIlIlII[0]] = llIlIlII[22];
                        if (l.lIlIlllllII(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[llIlIlII[1]];
                            nArray19[l.llIlIlII[0]] = llIlIlII[35];
                            if (l.lIlIlllllII(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = llIlIlII[1];

                                if (-1 < 2) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = llIlIlII[0];
        return n2 != 0;
    }

    private static boolean lIllIIIIIII(int n2) {
        return n2 > 0;
    }

    public static void Z() {
        if (l.lIlIlllllII(bz ? 1 : 0)) {
            AccBuilderBarrows.c = llIlIIIl[llIlIlII[0]];
            b.a(bB);
            if (l.lIlIlllllIl(bB.size(), llIlIlII[1])) {
                System.out.println(llIlIIIl[llIlIlII[1]]);
                bz = llIlIlII[0];
            }
        }
        if (l.lIlIllllllI(bz ? 1 : 0)) {
            BankLocation lIlIIlllIIlllII;
            if (l.lIlIllllllI(l.ac() ? 1 : 0)) {
                lIlIIlllIIlllII = BankLocation.getNearest();
                if (l.lIlIlllllll(lIlIIlllIIlllII) && l.lIlIllllllI(lIlIIlllIIlllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = llIlIIIl[llIlIlII[2]];
                    a.a(lIlIIlllIIlllII);
                }
                if (l.lIlIlllllll(lIlIIlllIIlllII) && l.lIlIlllllII(lIlIIlllIIlllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = llIlIIIl[llIlIlII[3]];
                    if (l.lIlIllllllI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIlII[4]);

                    }
                    if (l.lIlIlllllII(Bank.isOpen() ? 1 : 0)) {
                        if (l.lIllIIIIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIlIlII[5]);

                        }
                        while (l.lIlIlllllIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[6]) && l.lIlIllllllI(u.aV() ? 1 : 0)) {
                            u.aT();
                            Time.sleepTicks((int)llIlIlII[1]);

                            return;
                        }
                        if (l.lIlIllllllI(l.ad() ? 1 : 0)) {
                            l.ag();
                            System.out.println(llIlIIIl[llIlIlII[5]]);
                            bz = llIlIlII[1];
                            return;
                        }
                        if (l.lIlIlllllIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[6])) {
                            int[] nArray = new int[llIlIlII[1]];
                            nArray[l.llIlIlII[0]] = llIlIlII[7];
                            if (l.lIlIlllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[llIlIlII[1]];
                                nArray2[l.llIlIlII[0]] = llIlIlII[7];
                                if (l.lIlIlllllIl(Inventory.getCount((int[])nArray2), llIlIlII[1])) {
                                    Bank.withdraw((int)llIlIlII[7], (int)llIlIlII[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlIlII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlIlII[1]];
                                        nArray[l.llIlIlII[0]] = llIlIlII[7];
                                        if (l.lIllIIIIIII(Inventory.getCount((int[])nArray))) {
                                            bl = llIlIlII[1];

                                            if ((83 + 87 - 94 + 108 ^ 174 + 33 - 198 + 179) < 1) {
                                                return ((0x1A ^ 0xA ^ (0x4B ^ 0x56)) & (2 ^ 9 ^ (0x79 ^ 0x7F) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llIlIlII[0];
                                        }
                                        return bl;
                                    }, (int)llIlIlII[4]);

                                }
                            }
                            int[] nArray3 = new int[llIlIlII[1]];
                            nArray3[l.llIlIlII[0]] = llIlIlII[9];
                            if (l.lIlIlllllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[llIlIlII[1]];
                                nArray4[l.llIlIlII[0]] = llIlIlII[9];
                                if (l.lIlIlllllIl(Inventory.getCount((int[])nArray4), llIlIlII[1])) {
                                    Bank.withdraw((int)llIlIlII[9], (int)llIlIlII[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlIlII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlIlII[1]];
                                        nArray[l.llIlIlII[0]] = llIlIlII[9];
                                        if (l.lIllIIIIIII(Inventory.getCount((int[])nArray))) {
                                            bl = llIlIlII[1];

                                            if ((0x1C ^ 0x12 ^ (0x25 ^ 0x2E)) == 0) {
                                                return ((0xFB ^ 0xC5 ^ (0x2D ^ 0xC)) & (0x64 ^ 0x7D ^ (0x5A ^ 0x5C) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llIlIlII[0];
                                        }
                                        return bl;
                                    }, (int)llIlIlII[4]);

                                }
                            }
                            int[] nArray5 = new int[llIlIlII[1]];
                            nArray5[l.llIlIlII[0]] = llIlIlII[11];
                            if (l.lIlIlllllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[llIlIlII[1]];
                                nArray6[l.llIlIlII[0]] = llIlIlII[11];
                                if (l.lIlIlllllIl(Inventory.getCount((int[])nArray6), llIlIlII[1])) {
                                    Bank.withdraw((int)llIlIlII[11], (int)llIlIlII[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlIlII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlIlII[1]];
                                        nArray[l.llIlIlII[0]] = llIlIlII[11];
                                        if (l.lIllIIIIIII(Inventory.getCount((int[])nArray))) {
                                            bl = llIlIlII[1];

                                            if ((3 & ~3) != 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = llIlIlII[0];
                                        }
                                        return bl;
                                    }, (int)llIlIlII[4]);

                                }
                            }
                            int[] nArray7 = new int[llIlIlII[1]];
                            nArray7[l.llIlIlII[0]] = llIlIlII[12];
                            if (l.lIlIlllllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[llIlIlII[1]];
                                nArray8[l.llIlIlII[0]] = llIlIlII[12];
                                if (l.lIlIlllllIl(Inventory.getCount((int[])nArray8), llIlIlII[1])) {
                                    Bank.withdraw((int)llIlIlII[12], (int)llIlIlII[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlIlII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlIlII[1]];
                                        nArray[l.llIlIlII[0]] = llIlIlII[12];
                                        if (l.lIllIIIIIII(Inventory.getCount((int[])nArray))) {
                                            bl = llIlIlII[1];

                                            if (1 <= 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = llIlIlII[0];
                                        }
                                        return bl;
                                    }, (int)llIlIlII[4]);

                                }
                            }
                            int[] nArray9 = new int[llIlIlII[1]];
                            nArray9[l.llIlIlII[0]] = llIlIlII[14];
                            if (l.lIlIlllllII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[llIlIlII[1]];
                                nArray10[l.llIlIlII[0]] = llIlIlII[14];
                                if (l.lIlIlllllIl(Inventory.getCount((int[])nArray10), llIlIlII[1])) {
                                    Bank.withdraw((int)llIlIlII[14], (int)llIlIlII[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlIlII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlIlII[1]];
                                        nArray[l.llIlIlII[0]] = llIlIlII[14];
                                        if (l.lIllIIIIIII(Inventory.getCount((int[])nArray))) {
                                            bl = llIlIlII[1];

                                            if (-(0x4D ^ 0x49) >= 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = llIlIlII[0];
                                        }
                                        return bl;
                                    }, (int)llIlIlII[4]);

                                }
                            }
                            int[] nArray11 = new int[llIlIlII[1]];
                            nArray11[l.llIlIlII[0]] = llIlIlII[15];
                            if (l.lIlIlllllII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[llIlIlII[1]];
                                nArray12[l.llIlIlII[0]] = llIlIlII[15];
                                if (l.lIlIllllllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)llIlIlII[15], (int)llIlIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlIlII[1]);

                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[llIlIlII[1]];
                                        nArray[l.llIlIlII[0]] = llIlIlII[15];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)llIlIlII[4]);

                                }
                            }
                            Bank.withdraw((int)llIlIlII[16], (int)llIlIlII[17], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[llIlIlII[1]];
                            nArray13[l.llIlIlII[0]] = llIlIlII[18];
                            if (l.lIlIlllllII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[llIlIlII[1]];
                                nArray14[l.llIlIlII[0]] = llIlIlII[18];
                                if (l.lIlIlllllIl(Inventory.getCount((int[])nArray14), llIlIlII[1]) && l.lIlIlllllIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[19])) {
                                    Bank.withdrawAll((int)llIlIlII[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlIlII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlIlII[1]];
                                        nArray[l.llIlIlII[0]] = llIlIlII[18];
                                        if (l.lIllIIIIIII(Inventory.getCount((int[])nArray))) {
                                            bl = llIlIlII[1];

                                            if ((0x42 ^ 0x46) == 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = llIlIlII[0];
                                        }
                                        return bl;
                                    }, (int)llIlIlII[4]);

                                }
                            }
                        }
                        if (l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[6])) {
                            int[] nArray = new int[llIlIlII[1]];
                            nArray[l.llIlIlII[0]] = llIlIlII[20];
                            if (l.lIlIllllllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)llIlIlII[20], (int)llIlIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llIlIlII[1]);

                            }
                            if (l.lIlIlllllII(bA ? 1 : 0)) {
                                Bank.withdrawAll((int)llIlIlII[21], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llIlIlII[1]);

                                Bank.withdrawAll((int)llIlIlII[14], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llIlIlII[1]);

                            }
                            Bank.withdrawAll((int)llIlIlII[22], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)llIlIlII[1]);

                            Bank.withdrawAll((int)llIlIlII[23], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)llIlIlII[1]);

                        }
                    }
                }
            }
            if (l.lIlIlllllII(l.ac() ? 1 : 0)) {
                if (l.lIlIlllllII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (l.lIlIlllllIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[19])) {
                    if (l.lIlIllllllI(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llIlIIIl[llIlIlII[17]];
                        Movement.walkTo((WorldPoint)bD);

                        Time.sleepTicks((int)llIlIlII[1]);

                    }
                    if (l.lIlIlllllII(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llIlIIIl[llIlIlII[24]];
                        l.ab();
                    }
                }
                if (l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[19]) && l.lIlIlllllIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[25])) {
                    AccBuilderBarrows.c = llIlIIIl[llIlIlII[26]];
                    if (l.lIllIIIIIlI(Players.getLocal().getAnimation(), llIlIlII[27])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)llIlIlII[1]);

                    }
                }
                if (l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[25]) && l.lIlIlllllIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[28])) {
                    AccBuilderBarrows.c = llIlIIIl[llIlIlII[29]];
                    if (l.lIllIIIIIlI(Players.getLocal().getAnimation(), llIlIlII[27])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)llIlIlII[1]);

                    }
                }
                if (l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[28]) && l.lIlIlllllIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[30])) {
                    AccBuilderBarrows.c = llIlIIIl[llIlIlII[31]];
                    if (l.lIllIIIIIlI(Players.getLocal().getAnimation(), llIlIlII[27])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)llIlIlII[1]);

                    }
                }
                if (l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[30]) && l.lIlIlllllIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[6])) {
                    AccBuilderBarrows.c = llIlIIIl[llIlIlII[32]];
                    if (l.lIllIIIIIlI(Players.getLocal().getAnimation(), llIlIlII[27])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)llIlIlII[1]);

                    }
                }
                if (l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[6])) {
                    int lIlIIlllIIllIlI;
                    AccBuilderBarrows.c = llIlIIIl[llIlIlII[33]];
                    int[] nArray = new int[llIlIlII[1]];
                    nArray[l.llIlIlII[0]] = llIlIlII[20];
                    if (l.lIlIlllllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[llIlIlII[1]];
                        nArray15[l.llIlIlII[0]] = llIlIlII[20];
                        if (l.lIlIllllllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[llIlIlII[1]];
                            nArray16[l.llIlIlII[0]] = llIlIlII[20];
                            Inventory.getFirst((int[])nArray16).interact(llIlIIIl[llIlIlII[34]]);
                            Time.sleepTicks((int)llIlIlII[1]);

                        }
                    }
                    if (l.lIlIlllllII(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[llIlIlII[1]];
                    nArray17[l.llIlIlII[0]] = llIlIlII[22];
                    lIlIIlllIIlllII = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[llIlIlII[1]];
                    nArray18[l.llIlIlII[0]] = llIlIlII[35];
                    Item lIlIIlllIIllIll = Inventory.getFirst((int[])nArray18);
                    if (l.lIlIllllllI(bA ? 1 : 0)) {
                        if (l.lIlIllllllI(Players.getLocal().getWorldLocation().equals((Object)bE) ? 1 : 0)) {
                            AccBuilderBarrows.c = llIlIIIl[llIlIlII[36]];
                            Movement.walkTo((WorldPoint)bE);

                            Time.sleepTicks((int)llIlIlII[1]);

                        }
                        if (l.lIlIlllllII(Players.getLocal().getWorldLocation().equals((Object)bE) ? 1 : 0) && l.lIlIlllllll(lIlIIlllIIlllII) && l.lIlIlllllll(lIlIIlllIIllIll)) {
                            lIlIIlllIIllIlI = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIlIIlllIIllIll);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (l.lIllIIIIlll(Skills.getExperience((Skill)Skill.MAGIC), lIlIIlllIIllIlI)) {
                                    bl = llIlIlII[1];

                                    }
                                } else {
                                    bl = llIlIlII[0];
                                }
                                return bl;
                            }, (int)llIlIlII[8]);

                            Time.sleep((long)e.c(llIlIlII[37], llIlIlII[38]));

                        }
                    }
                    if (l.lIlIlllllII(bA ? 1 : 0)) {
                        if (l.lIlIlllllll(lIlIIlllIIlllII) && l.lIlIlllllll(lIlIIlllIIllIll) && l.lIllIIIIIlI(Players.getLocal().getAnimation(), llIlIlII[27])) {
                            lIlIIlllIIllIlI = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIlIIlllIIllIll);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (l.lIllIIIIlll(Skills.getExperience((Skill)Skill.MAGIC), lIlIIlllIIllIlI)) {
                                    bl = llIlIlII[1];

                                    if (3 <= 1) {
                                        return false;
                                    }
                                } else {
                                    bl = llIlIlII[0];
                                }
                                return bl;
                            }, (int)llIlIlII[8]);

                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (l.lIllIIIIIlI(Players.getLocal().getAnimation(), llIlIlII[27])) {
                                bl = llIlIlII[1];

                            } else {
                                bl = llIlIlII[0];
                            }
                            return bl;
                        }, (int)llIlIlII[39]);

                    }
                }
            }
        }
    }

    public static void af() {
        if (l.lIlIlllllll(Widgets.get((int)llIlIlII[49], (int)llIlIlII[50]))) {
            AccBuilderBarrows.c = llIlIIIl[llIlIlII[51]];
            Widgets.get((int)llIlIlII[49], (int)llIlIlII[50]).interact(llIlIIIl[llIlIlII[52]]);
            Time.sleepTicks((int)llIlIlII[5]);

        }
        if (l.lIllIIIIlIl(Widgets.get((int)llIlIlII[49], (int)llIlIlII[50])) && l.lIlIllllllI(Widgets.get((int)llIlIlII[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)llIlIlII[1]);

            if (l.lIlIlllllIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[17])) {
                Widgets.get((int)llIlIlII[53], (int)llIlIlII[1]).getChild(llIlIlII[1]).interact(llIlIIIl[llIlIlII[54]]);
            }
            if (l.lIlIlllllIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[31]) && l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[17])) {
                Widgets.get((int)llIlIlII[53], (int)llIlIlII[1]).getChild(llIlIlII[2]).interact(llIlIIIl[llIlIlII[55]]);
            }
            if (l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[31]) && l.lIlIlllllIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[36])) {
                Widgets.get((int)llIlIlII[53], (int)llIlIlII[1]).getChild(llIlIlII[3]).interact(llIlIIIl[llIlIlII[19]]);
            }
            if (l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[31])) {
                int[] nArray = new int[llIlIlII[1]];
                nArray[l.llIlIlII[0]] = llIlIlII[12];
                if (l.lIlIllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)llIlIlII[53], (int)llIlIlII[1]).getChild(llIlIlII[3]).interact(llIlIIIl[llIlIlII[50]]);
                }
            }
            if (l.lIllIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIlIlII[36])) {
                int[] nArray = new int[llIlIlII[1]];
                nArray[l.llIlIlII[0]] = llIlIlII[12];
                if (l.lIlIlllllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)llIlIlII[53], (int)llIlIlII[1]).getChild(llIlIlII[5]).interact(llIlIIIl[llIlIlII[56]]);
                }
            }
            Time.sleepTicks((int)llIlIlII[1]);

        }
    }
}

