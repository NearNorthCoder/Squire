/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;

public class AMHelper
implements ab {
    public static final  int mp;

    public static final  WorldPoint ms;
    public static  boolean bv;
    public static final  int mo;
    public static final  int mq;
    public static  List<d> bx;
    public static final  WorldPoint mr;

    private static boolean lllIIlIIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        am.lllIIIllllII();
        am.lllIIIlllIll();
        mp = lIIIIllIlI[9];
        mo = lIIIIllIlI[6];
        mq = lIIIIllIlI[11];
        mr = new WorldPoint(lIIIIllIlI[37], lIIIIllIlI[38], lIIIIllIlI[0]);
        ms = new WorldPoint(lIIIIllIlI[39], lIIIIllIlI[40], lIIIIllIlI[0]);
        bx = new ArrayList<d>();
    }

    private static boolean lllIIlIIIIIl(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean ae() {
        return lIIIIllIlI[0];
    }

    private static boolean lllIIIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    public static void ed() {
        if (am.lllIIIllllIl(bv ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIllIIl[lIIIIllIlI[0]];
            b.a(bx);
            if (am.lllIIIlllllI(bx.size(), lIIIIllIlI[1])) {
                System.out.println(lIIIIllIIl[lIIIIllIlI[1]]);
                bv = lIIIIllIlI[0];
            }
        }
        if (am.lllIIIllllll(bv ? 1 : 0)) {
            BankLocation lllIIlIIlllI;
            if (am.lllIIIllllll(am.an() ? 1 : 0)) {
                lllIIlIIlllI = BankLocation.getNearest();
                if (am.lllIIlIIIIII(lllIIlIIlllI) && am.lllIIIllllll(lllIIlIIlllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIllIIl[lIIIIllIlI[2]];
                    a.a(lllIIlIIlllI);
                }
                if (am.lllIIlIIIIII(lllIIlIIlllI) && am.lllIIIllllIl(lllIIlIIlllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIllIIl[lIIIIllIlI[3]];
                    if (am.lllIIIllllll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIllIlI[4]);

                    }
                    if (am.lllIIIllllIl(Bank.isOpen() ? 1 : 0)) {
                        if (am.lllIIlIIIIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIIllIlI[1]);

                        }
                        if (am.lllIIlIIIIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIIllIlI[2]);

                        }
                    }
                    if (am.lllIIIlllllI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[5])) {
                        int[] nArray = new int[lIIIIllIlI[1]];
                        nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[6];
                        if (am.lllIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            am.Q();
                            System.out.println(lIIIIllIIl[lIIIIllIlI[7]]);
                            bv = lIIIIllIlI[1];
                            return;
                        }
                    }
                    if (am.lllIIlIIIIlI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[5]) && am.lllIIIlllllI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[8])) {
                        int[] nArray = new int[lIIIIllIlI[1]];
                        nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[9];
                        if (am.lllIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            am.Q();
                            System.out.println(lIIIIllIIl[lIIIIllIlI[10]]);
                            bv = lIIIIllIlI[1];
                            return;
                        }
                    }
                    if (am.lllIIlIIIIlI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[8])) {
                        int[] nArray = new int[lIIIIllIlI[1]];
                        nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[11];
                        if (am.lllIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            am.Q();
                            System.out.println(lIIIIllIIl[lIIIIllIlI[12]]);
                            bv = lIIIIllIlI[1];
                            return;
                        }
                    }
                    int[] nArray = new int[lIIIIllIlI[1]];
                    nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[13];
                    if (am.lllIIIllllll(Equipment.contains((int[])nArray) ? 1 : 0) && am.lllIIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(ms), lIIIIllIlI[14])) {
                        a.b(f.aU, lIIIIllIlI[1]);
                        Time.sleepTicks((int)lIIIIllIlI[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIIllIlI[1]];
                            nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[13];
                            if (am.lllIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIIllIlI[1];

                                if ((74 + 153 - 70 + 12 ^ 68 + 145 - 200 + 160) == -1) {
                                    return ((0x3A ^ 0x7D ^ (0x27 ^ 0x4D)) & (113 + 108 - 102 + 55 ^ 49 + 8 - -58 + 16 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIIllIlI[0];
                            }
                            return bl;
                        }, (int)lIIIIllIlI[4]);

                    }
                    if (am.lllIIIlllllI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[5])) {
                        Bank.withdrawAll((int)lIIIIllIlI[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIIllIlI[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIIllIlI[1]];
                            nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[6];
                            if (am.lllIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIIllIlI[1];

                                if (-1 >= ((0x2B ^ 0x15 ^ (0x6E ^ 0x33)) & (35 + 179 - 158 + 139 ^ 95 + 100 - 181 + 146 ^ -1))) {
                                    return ((0x28 ^ 0x12 ^ (0x81 ^ 0xAB)) & (0x1D ^ 0xC ^ 1 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIIllIlI[0];
                            }
                            return bl;
                        }, (int)lIIIIllIlI[4]);

                    }
                    if (am.lllIIlIIIIlI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[5]) && am.lllIIIlllllI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[8])) {
                        Bank.withdrawAll((int)lIIIIllIlI[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIIllIlI[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIIllIlI[1]];
                            nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[9];
                            if (am.lllIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIIllIlI[1];

                                if ((0x23 ^ 0x7A ^ (0x59 ^ 4)) == 3) {
                                    return false;
                                }
                            } else {
                                bl = lIIIIllIlI[0];
                            }
                            return bl;
                        }, (int)lIIIIllIlI[4]);

                    }
                    if (am.lllIIlIIIIlI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[8])) {
                        Bank.withdrawAll((int)lIIIIllIlI[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIIllIlI[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIIllIlI[1]];
                            nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[11];
                            if (am.lllIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIIllIlI[1];

                                if ((0x1E ^ 0x1B) <= 0) {
                                    return false;
                                }
                            } else {
                                bl = lIIIIllIlI[0];
                            }
                            return bl;
                        }, (int)lIIIIllIlI[4]);

                    }
                }
            }
            if (am.lllIIIllllIl(am.an() ? 1 : 0)) {
                int[] nArray = new int[lIIIIllIlI[1]];
                nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[13];
                if (am.lllIIIllllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIIIIllIlI[1]];
                    nArray2[am.lIIIIllIlI[0]] = lIIIIllIlI[13];
                    if (am.lllIIIllllll(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIllIIl[lIIIIllIlI[15]];
                        int[] nArray3 = new int[lIIIIllIlI[1]];
                        nArray3[am.lIIIIllIlI[0]] = lIIIIllIlI[13];
                        lllIIlIIlllI = Inventory.getFirst((int[])nArray3);
                        if (am.lllIIlIIIIII(lllIIlIIlllI)) {
                            lllIIlIIlllI.interact(lIIIIllIIl[lIIIIllIlI[16]]);
                            Time.sleepTicks((int)lIIIIllIlI[3]);

                        }
                    }
                }
                if (am.lllIIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(ms), lIIIIllIlI[10])) {
                    AccBuilderGWD.c = lIIIIllIIl[lIIIIllIlI[17]];
                    Movement.walkTo((WorldPoint)ms);

                    Time.sleepTicks((int)lIIIIllIlI[7]);

                }
                if (am.lllIIlIIIlII(Players.getLocal().getWorldLocation().distanceTo(ms), lIIIIllIlI[10])) {
                    AccBuilderGWD.c = lIIIIllIIl[lIIIIllIlI[18]];
                    String[] stringArray = new String[lIIIIllIlI[1]];
                    stringArray[am.lIIIIllIlI[0]] = lIIIIllIIl[lIIIIllIlI[19]];
                    lllIIlIIlllI = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
                    if (am.lllIIlIIIIII(lllIIlIIlllI)) {
                        if (am.lllIIIllllll(Production.isOpen() ? 1 : 0)) {
                            lllIIlIIlllI.interact(lIIIIllIIl[lIIIIllIlI[20]]);
                            Time.sleepTicks((int)lIIIIllIlI[2]);

                            Time.sleepUntil(() -> Production.isOpen(), (int)lIIIIllIlI[4]);

                        }
                        if (am.lllIIIllllIl(Production.isOpen() ? 1 : 0)) {
                            Production.chooseOption((int)lIIIIllIlI[1]);
                            Time.sleepTicks((int)lIIIIllIlI[7]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (!am.lllIIIllllIl(am.an() ? 1 : 0) || am.lllIIIllllIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIIllIlI[1];

                                    }
                                } else {
                                    bl = lIIIIllIlI[0];
                                }
                                return bl;
                            }, (int)lIIIIllIlI[21]);

                        }
                    }
                }
            }
        }
    }

    private static boolean lllIIlIIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static void Q() {
        d lllIIlIIlIII;
        Object lllIIlIIlIIl;
        Object lllIIlIIlIlI;
        if (am.lllIIIlllllI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[5])) {
            d d2 = new DHelper(lIIIIllIlI[6], lIIIIllIlI[22], lIIIIllIlI[23]);
            bx.add(d2);

        }
        if (am.lllIIlIIIIlI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[5]) && am.lllIIIlllllI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[8])) {
            lllIIlIIlIlI = new DHelper(lIIIIllIlI[9], lIIIIllIlI[24], lIIIIllIlI[25]);
            bx.add((DHelper) llIIlIIlIlI);

        }
        if (am.lllIIlIIIIlI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[8])) {
            lllIIlIIlIlI = new DHelper(lIIIIllIlI[11], lIIIIllIlI[24], lIIIIllIlI[25]);
            bx.add((DHelper) llIIlIIlIlI);

        }
        if (am.lllIIIllllll(Bank.contains(lllIIlIIlIlI = item -> item.getName().toLowerCase().contains(lIIIIllIIl[lIIIIllIlI[5]])) ? 1 : 0)) {
            lllIIlIIlIIl = new DHelper(lIIIIllIlI[13], lIIIIllIlI[26], lIIIIllIlI[27]);
            bx.add((DHelper) llIIlIIlIIl);

        }
        if (am.lllIIIllllll(Bank.contains(lllIIlIIlIIl = item -> item.getName().toLowerCase().contains(lIIIIllIIl[lIIIIllIlI[36]])) ? 1 : 0)) {
            lllIIlIIlIII = new DHelper(lIIIIllIlI[28], lIIIIllIlI[10], lIIIIllIlI[29]);
            bx.add(lllIIlIIlIII);

        }
        int[] nArray = new int[lIIIIllIlI[1]];
        nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[30];
        if (am.lllIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllIIlIIlIII = new DHelper(lIIIIllIlI[30], lIIIIllIlI[31], lIIIIllIlI[32]);
            bx.add(lllIIlIIlIII);

        }
    }

    @Override
    public int af() {
        am.ed();
        return lIIIIllIlI[33];
    }

    private static boolean an() {
        boolean bl;
        if (am.lllIIlIIIIlI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[8])) {
            boolean bl2;
            int[] nArray = new int[lIIIIllIlI[1]];
            nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[11];
            if (am.lllIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                bl2 = lIIIIllIlI[1];

                if (3 == (65 + 46 - -37 + 1 ^ 132 + 106 - 191 + 98)) {
                    return ((0xE1 ^ 0xA9 ^ (0x4F ^ 0x24)) & (0x17 ^ 0x4C ^ (0x18 ^ 0x60) ^ -1)) != 0;
                }
            } else {
                bl2 = lIIIIllIlI[0];
            }
            return bl2;
        }
        if (am.lllIIlIIIIlI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[5]) && am.lllIIIlllllI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[8])) {
            boolean bl3;
            int[] nArray = new int[lIIIIllIlI[1]];
            nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[9];
            if (am.lllIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                bl3 = lIIIIllIlI[1];

                if (1 >= 3) {
                    return false;
                }
            } else {
                bl3 = lIIIIllIlI[0];
            }
            return bl3;
        }
        int[] nArray = new int[lIIIIllIlI[1]];
        nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[6];
        if (am.lllIIlIIIIIl(Inventory.getCount((int[])nArray))) {
            bl = lIIIIllIlI[1];

            if (((0x69 ^ 9 ^ (0x53 ^ 0x79)) & (132 + 141 - 73 + 5 ^ 57 + 14 - 47 + 111 ^ -1)) != 0) {
                return ((0x4F ^ 0x37 ^ (0xDB ^ 0xAA)) & (0x23 ^ 0x7D ^ (0xF2 ^ 0xA5) ^ -1)) != 0;
            }
        } else {
            bl = lIIIIllIlI[0];
        }
        return bl;
    }

    @Override
    public String ag() {
        return lIIIIllIIl[lIIIIllIlI[34]];
    }

    private static boolean lllIIlIIIIII(Object object) {
        return object != null;
    }

    private static boolean lllIIlIIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (am.lllIIlIIIIlI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[35])) {
            bl = lIIIIllIlI[1];

        } else {
            bl = lIIIIllIlI[0];
        }
        return bl;
    }

        return String.valueOf(lllIIIlIlllI);
    }

    private static void lllIIIlllIll() {
        lIIIIllIIl = new String[lIIIIllIlI[41]];
        am.lIIIIllIIl[am.lIIIIllIlI[0]] = "Buying items";
        am.lIIIIllIIl[am.lIIIIllIlI[1]] = "Finished buying items, switching back to cooking";
        am.lIIIIllIIl[am.lIIIIllIlI[2]] = "Navigating to bank";
        am.lIIIIllIIl[am.lIIIIllIlI[3]] = "Handling banking";
        am.lIIIIllIIl[am.lIIIIllIlI[7]] = "We are missing supplies, switching to BUYING";
        am.lIIIIllIIl[am.lIIIIllIlI[10]] = "We are missing supplies, switching to BUYING";
        am.lIIIIllIIl[am.lIIIIllIlI[12]] = "We are missing supplies, switching to BUYING";
        am.lIIIIllIIl[am.lIIIIllIlI[15]] = "Equiping duel";
        am.lIIIIllIIl[am.lIIIIllIlI[16]] = "Wear";
        am.lIIIIllIIl[am.lIIIIllIlI[17]] = "Navigate to range";
        am.lIIIIllIIl[am.lIIIIllIlI[18]] = "Cooking";
        am.lIIIIllIIl[am.lIIIIllIlI[19]] = "Range";
        am.lIIIIllIIl[am.lIIIIllIlI[20]] = "Cook";
        am.lIIIIllIIl[am.lIIIIllIlI[34]] = "Cooking";
        am.lIIIIllIIl[am.lIIIIllIlI[36]] = "ring of wealth (";
        am.lIIIIllIIl[am.lIIIIllIlI[5]] = "ring of dueling(";
    }

    private static boolean lllIIIllllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIIllllll(int n2) {
        return n2 == 0;
    }
}

