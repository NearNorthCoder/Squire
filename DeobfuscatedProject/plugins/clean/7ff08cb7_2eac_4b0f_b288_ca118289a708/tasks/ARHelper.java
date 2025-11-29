/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
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
 */
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
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

public class ARHelper
implements ab {
    public static final  int mJ;
    public static final  WorldArea mM;
    public static final  WorldArea mN;
    public static  List<d> bx;
    
    public static  int[] mP;
    public static final  WorldPoint mO;
    public static final  int mK;
    public static final  int mI;
    public static final  int mH;
    public static  int[] mQ;
    
    public static  boolean bv;
    public static  int[] my;
    public static final  int mL;

    @Override
    public int af() {
        ar.eP();
        return lllIIllIl[33];
    }

    private static boolean llIIIIllllIl(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ar.llIIIlIIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[35])) {
            bl = lllIIllIl[1];

            if (1 >= 2) {
                return ((0x95 ^ 0x8D ^ (0x2C ^ 0x20)) & (0x15 ^ 0x4D ^ (0x7F ^ 0x33) ^ -1)) != 0;
            }
        } else {
            bl = lllIIllIl[0];
        }
        return bl;
    }

    static {
        ar.llIIIIllllII();
        ar.llIIIIlllIll();
        mL = lllIIllIl[11];
        mK = lllIIllIl[10];
        mJ = lllIIllIl[9];
        mH = lllIIllIl[7];
        mI = lllIIllIl[8];
        mM = new WorldArea(lllIIllIl[37], lllIIllIl[38], lllIIllIl[34], lllIIllIl[39], lllIIllIl[0]);
        mN = new WorldArea(lllIIllIl[40], lllIIllIl[41], lllIIllIl[22], lllIIllIl[34], lllIIllIl[0]);
        mO = new WorldPoint(lllIIllIl[42], lllIIllIl[43], lllIIllIl[0]);
        int[] nArray = new int[lllIIllIl[6]];
        nArray[ar.lllIIllIl[0]] = lllIIllIl[44];
        nArray[ar.lllIIllIl[1]] = lllIIllIl[45];
        nArray[ar.lllIIllIl[3]] = lllIIllIl[46];
        nArray[ar.lllIIllIl[4]] = lllIIllIl[47];
        mP = nArray;
        int[] nArray2 = new int[lllIIllIl[1]];
        nArray2[ar.lllIIllIl[0]] = lllIIllIl[48];
        mQ = nArray2;
        int[] nArray3 = new int[lllIIllIl[4]];
        nArray3[ar.lllIIllIl[0]] = lllIIllIl[49];
        nArray3[ar.lllIIllIl[1]] = lllIIllIl[50];
        nArray3[ar.lllIIllIl[3]] = lllIIllIl[51];
        my = nArray3;
        bx = new ArrayList<d>();
    }

    private static boolean llIIIlIIIIII(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean an() {
        int n2;
        if (ar.llIIIlIIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[23])) {
            boolean bl;
            int[] nArray = new int[lllIIllIl[1]];
            nArray[ar.lllIIllIl[0]] = lllIIllIl[11];
            if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
                bl = lllIIllIl[1];

                if (1 == 1) return bl;
                return ((0x93 ^ 0xAB ^ (0x3E ^ 0x65)) & (121 + 124 - 36 + 39 ^ 142 + 45 - 143 + 111 ^ -1)) != 0;
            }
            bl = lllIIllIl[0];
            return bl;
        }
        if (ar.llIIIlIIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[24]) && ar.llIIIIlllllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[23])) {
            int n3;
            int[] nArray = new int[lllIIllIl[1]];
            nArray[ar.lllIIllIl[0]] = lllIIllIl[11];
            if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lllIIllIl[1]];
                nArray2[ar.lllIIllIl[0]] = lllIIllIl[10];
                if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray2))) {
                    n3 = lllIIllIl[1];

                    if (1 != (64 + 74 - 124 + 131 ^ 17 + 37 - -30 + 65)) return n3 != 0;
                    return ((0x99 ^ 0x8D ^ (0xCB ^ 0x8C)) & (0xE ^ 0x6F ^ (0x81 ^ 0xB3) ^ -1)) != 0;
                }
            }
            n3 = lllIIllIl[0];
            return n3 != 0;
        }
        if (ar.llIIIlIIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[25]) && ar.llIIIIlllllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[24])) {
            int n4;
            int[] nArray = new int[lllIIllIl[1]];
            nArray[ar.lllIIllIl[0]] = lllIIllIl[11];
            if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[lllIIllIl[1]];
                nArray3[ar.lllIIllIl[0]] = lllIIllIl[10];
                if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray3))) {
                    int[] nArray4 = new int[lllIIllIl[1]];
                    nArray4[ar.lllIIllIl[0]] = lllIIllIl[9];
                    if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray4))) {
                        n4 = lllIIllIl[1];

                        if (((0x96 ^ 0xB6) & ~(0xA2 ^ 0x82)) == 0) return n4 != 0;
                        return false;
                    }
                }
            }
            n4 = lllIIllIl[0];
            return n4 != 0;
        }
        if (ar.llIIIlIIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[13]) && ar.llIIIIlllllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[25])) {
            int n5;
            int[] nArray = new int[lllIIllIl[1]];
            nArray[ar.lllIIllIl[0]] = lllIIllIl[11];
            if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
                int[] nArray5 = new int[lllIIllIl[1]];
                nArray5[ar.lllIIllIl[0]] = lllIIllIl[10];
                if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray5))) {
                    int[] nArray6 = new int[lllIIllIl[1]];
                    nArray6[ar.lllIIllIl[0]] = lllIIllIl[9];
                    if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray6))) {
                        int[] nArray7 = new int[lllIIllIl[1]];
                        nArray7[ar.lllIIllIl[0]] = lllIIllIl[8];
                        if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray7))) {
                            n5 = lllIIllIl[1];

                            if (1 <= 2) return n5 != 0;
                            return false;
                        }
                    }
                }
            }
            n5 = lllIIllIl[0];
            return n5 != 0;
        }
        int[] nArray = new int[lllIIllIl[1]];
        nArray[ar.lllIIllIl[0]] = lllIIllIl[11];
        if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
            int[] nArray8 = new int[lllIIllIl[1]];
            nArray8[ar.lllIIllIl[0]] = lllIIllIl[10];
            if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray8))) {
                int[] nArray9 = new int[lllIIllIl[1]];
                nArray9[ar.lllIIllIl[0]] = lllIIllIl[9];
                if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray9))) {
                    int[] nArray10 = new int[lllIIllIl[1]];
                    nArray10[ar.lllIIllIl[0]] = lllIIllIl[8];
                    if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray10))) {
                        int[] nArray11 = new int[lllIIllIl[1]];
                        nArray11[ar.lllIIllIl[0]] = lllIIllIl[7];
                        if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray11))) {
                            n2 = lllIIllIl[1];

                            if ((0xC3 ^ 0xC6) > 0) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = lllIIllIl[0];
        return n2 != 0;
    }

    private static boolean llIIIIllllll(int n2) {
        return n2 == 0;
    }

        return String.valueOf(lllIllIIlIlll);
    }

    public static void Q() {
        d lllIllIlIIlII;
        Object lllIllIlIIlIl;
        int[] nArray = new int[lllIIllIl[1]];
        nArray[ar.lllIIllIl[0]] = lllIIllIl[7];
        if (ar.llIIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lllIIllIl[7], lllIIllIl[1], lllIIllIl[5]);
            bx.add(d2);

        }
        int[] nArray2 = new int[lllIIllIl[1]];
        nArray2[ar.lllIIllIl[0]] = lllIIllIl[8];
        if (ar.llIIIIllllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllIllIlIIlIl = new DHelper(lllIIllIl[8], lllIIllIl[1], lllIIllIl[5]);
            bx.add((DHelper) llIllIlIIlIl);

        }
        int[] nArray3 = new int[lllIIllIl[1]];
        nArray3[ar.lllIIllIl[0]] = lllIIllIl[9];
        if (ar.llIIIIllllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllIllIlIIlIl = new DHelper(lllIIllIl[9], lllIIllIl[1], lllIIllIl[26]);
            bx.add((DHelper) llIllIlIIlIl);

        }
        int[] nArray4 = new int[lllIIllIl[1]];
        nArray4[ar.lllIIllIl[0]] = lllIIllIl[10];
        if (ar.llIIIIllllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllIllIlIIlIl = new DHelper(lllIIllIl[10], lllIIllIl[1], lllIIllIl[27]);
            bx.add((DHelper) llIllIlIIlIl);

        }
        int[] nArray5 = new int[lllIIllIl[1]];
        nArray5[ar.lllIIllIl[0]] = lllIIllIl[11];
        if (ar.llIIIIllllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllIllIlIIlIl = new DHelper(lllIIllIl[11], lllIIllIl[1], lllIIllIl[28]);
            bx.add((DHelper) llIllIlIIlIl);

        }
        if (ar.llIIIIllllll(Bank.contains((Predicate)(lllIllIlIIlIl = item -> item.getName().toLowerCase().contains(lllIIllII[lllIIllIl[36]]))) ? 1 : 0)) {
            lllIllIlIIlII = new DHelper(lllIIllIl[29], lllIIllIl[12], lllIIllIl[28]);
            bx.add(lllIllIlIIlII);

        }
        int[] nArray6 = new int[lllIIllIl[1]];
        nArray6[ar.lllIIllIl[0]] = lllIIllIl[30];
        if (ar.llIIIIllllll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lllIllIlIIlII = new DHelper(lllIIllIl[30], lllIIllIl[31], lllIIllIl[32]);
            bx.add(lllIllIlIIlII);

        }
    }

    private static void llIIIIlllIll() {
        lllIIllII = new String[lllIIllIl[52]];
        ar.lllIIllII[ar.lllIIllIl[0]] = "Buying items";
        ar.lllIIllII[ar.lllIIllIl[1]] = "Finished buying items, switching back to woodcutting";
        ar.lllIIllII[ar.lllIIllIl[3]] = "Navigating to bank";
        ar.lllIIllII[ar.lllIIllIl[4]] = "Opening bank";
        ar.lllIIllII[ar.lllIIllIl[6]] = "Handling banking";
        ar.lllIIllII[ar.lllIIllIl[12]] = "We are missing pickaxes, switching to BUYING";
        ar.lllIIllII[ar.lllIIllIl[13]] = "Dropping logs";
        ar.lllIIllII[ar.lllIIllIl[14]] = "Dropping logs";
        ar.lllIIllII[ar.lllIIllIl[16]] = "Walking to trees";
        ar.lllIIllII[ar.lllIIllIl[17]] = "Chopping";
        ar.lllIIllII[ar.lllIIllIl[18]] = "Chopping logs";
        ar.lllIIllII[ar.lllIIllIl[19]] = "Chop down";
        ar.lllIIllII[ar.lllIIllIl[20]] = "Walking to oak trees";
        ar.lllIIllII[ar.lllIIllIl[21]] = "Chopping oaks";
        ar.lllIIllII[ar.lllIIllIl[22]] = "Chopping oak logs";
        ar.lllIIllII[ar.lllIIllIl[15]] = "Chop down";
        ar.lllIIllII[ar.lllIIllIl[34]] = "Woodcutting";
        ar.lllIIllII[ar.lllIIllIl[36]] = "ring of wealth (";
    }

    private static boolean llIIIlIIIIIl(Object object) {
        return object != null;
    }

    @Override
    public boolean ae() {
        return lllIIllIl[0];
    }

    private static boolean llIIIIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String ag() {
        return lllIIllII[lllIIllIl[34]];
    }

    private static boolean llIIIlIIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    public static void eP() {
        block25: {
            BankLocation lllIllIlIlIII;
            block27: {
                block33: {
                    block29: {
                        block32: {
                            block31: {
                                block30: {
                                    block28: {
                                        block26: {
                                            if (ar.llIIIIllllIl(bv ? 1 : 0)) {
                                                AccBuilderGWD.c = lllIIllII[lllIIllIl[0]];
                                                b.a(bx);
                                                if (ar.llIIIIlllllI(bx.size(), lllIIllIl[1])) {
                                                    System.out.println(lllIIllII[lllIIllIl[1]]);
                                                    bv = lllIIllIl[0];
                                                }
                                            }
                                            if (!ar.llIIIIllllll(bv ? 1 : 0)) break block25;
                                            if (!ar.llIIIIllllIl(ar.an() ? 1 : 0)) break block26;
                                            int[] nArray = new int[lllIIllIl[1]];
                                            nArray[ar.lllIIllIl[0]] = lllIIllIl[2];
                                            if (!ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) break block27;
                                        }
                                        if (ar.llIIIlIIIIIl(lllIllIlIlIII = BankLocation.getNearest()) && ar.llIIIIllllll(lllIllIlIlIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderGWD.c = lllIIllII[lllIIllIl[3]];
                                            a.a(lllIllIlIlIII);
                                        }
                                        if (!ar.llIIIlIIIIIl(lllIllIlIlIII) || !ar.llIIIIllllIl(lllIllIlIlIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block27;
                                        if (ar.llIIIIllllll(Bank.isOpen() ? 1 : 0)) {
                                            AccBuilderGWD.c = lllIIllII[lllIIllIl[4]];
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIllIl[5]);

                                        }
                                        if (!ar.llIIIIllllIl(Bank.isOpen() ? 1 : 0)) break block27;
                                        AccBuilderGWD.c = lllIIllII[lllIIllIl[6]];
                                        if (ar.llIIIlIIIIII(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lllIIllIl[6]);

                                        }
                                        if (ar.llIIIlIIIIII(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lllIIllIl[3]);

                                        }
                                        int[] nArray = new int[lllIIllIl[1]];
                                        nArray[ar.lllIIllIl[0]] = lllIIllIl[7];
                                        if (!ar.llIIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray2 = new int[lllIIllIl[1]];
                                        nArray2[ar.lllIIllIl[0]] = lllIIllIl[7];
                                        if (!ar.llIIIlIIIIlI(Inventory.getCount((int[])nArray2), lllIIllIl[1])) break block29;
                                    }
                                    int[] nArray = new int[lllIIllIl[1]];
                                    nArray[ar.lllIIllIl[0]] = lllIIllIl[8];
                                    if (!ar.llIIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray3 = new int[lllIIllIl[1]];
                                    nArray3[ar.lllIIllIl[0]] = lllIIllIl[8];
                                    if (!ar.llIIIlIIIIlI(Inventory.getCount((int[])nArray3), lllIIllIl[1])) break block29;
                                }
                                int[] nArray = new int[lllIIllIl[1]];
                                nArray[ar.lllIIllIl[0]] = lllIIllIl[9];
                                if (!ar.llIIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                int[] nArray4 = new int[lllIIllIl[1]];
                                nArray4[ar.lllIIllIl[0]] = lllIIllIl[9];
                                if (!ar.llIIIlIIIIlI(Inventory.getCount((int[])nArray4), lllIIllIl[1])) break block29;
                            }
                            int[] nArray = new int[lllIIllIl[1]];
                            nArray[ar.lllIIllIl[0]] = lllIIllIl[10];
                            if (!ar.llIIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray5 = new int[lllIIllIl[1]];
                            nArray5[ar.lllIIllIl[0]] = lllIIllIl[10];
                            if (!ar.llIIIlIIIIlI(Inventory.getCount((int[])nArray5), lllIIllIl[1])) break block29;
                        }
                        int[] nArray = new int[lllIIllIl[1]];
                        nArray[ar.lllIIllIl[0]] = lllIIllIl[11];
                        if (!ar.llIIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray6 = new int[lllIIllIl[1]];
                        nArray6[ar.lllIIllIl[0]] = lllIIllIl[11];
                        if (!ar.llIIIIlllllI(Inventory.getCount((int[])nArray6), lllIIllIl[1])) break block33;
                    }
                    ar.Q();
                    System.out.println(lllIIllII[lllIIllIl[12]]);
                    bv = lllIIllIl[1];
                    return;
                }
                int[] nArray = new int[lllIIllIl[1]];
                nArray[ar.lllIIllIl[0]] = lllIIllIl[7];
                if (ar.llIIIIllllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIllIl[7], (int)lllIIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIllIl[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIllIl[1]];
                        nArray[ar.lllIIllIl[0]] = lllIIllIl[7];
                        if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
                            bl = lllIIllIl[1];

                            if (3 == 2) {
                                return ((15 + 23 - -61 + 128 ^ 68 + 79 - 120 + 151) & (0x86 ^ 0xBB ^ (0x60 ^ 0xC) ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIIllIl[0];
                        }
                        return bl;
                    }, (int)lllIIllIl[5]);

                }
                int[] nArray7 = new int[lllIIllIl[1]];
                nArray7[ar.lllIIllIl[0]] = lllIIllIl[8];
                if (ar.llIIIIllllIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIllIl[8], (int)lllIIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIllIl[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIllIl[1]];
                        nArray[ar.lllIIllIl[0]] = lllIIllIl[8];
                        if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
                            bl = lllIIllIl[1];

                            if (2 == -1) {
                                return ((0x6F ^ 0x4A ^ (0xF9 ^ 0x82)) & (71 + 13 - -48 + 79 ^ 111 + 5 - 36 + 61 ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIIllIl[0];
                        }
                        return bl;
                    }, (int)lllIIllIl[5]);

                }
                int[] nArray8 = new int[lllIIllIl[1]];
                nArray8[ar.lllIIllIl[0]] = lllIIllIl[9];
                if (ar.llIIIIllllIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIllIl[9], (int)lllIIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIllIl[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIllIl[1]];
                        nArray[ar.lllIIllIl[0]] = lllIIllIl[9];
                        if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
                            bl = lllIIllIl[1];

                            if (3 < 0) {
                                return false;
                            }
                        } else {
                            bl = lllIIllIl[0];
                        }
                        return bl;
                    }, (int)lllIIllIl[5]);

                }
                int[] nArray9 = new int[lllIIllIl[1]];
                nArray9[ar.lllIIllIl[0]] = lllIIllIl[10];
                if (ar.llIIIIllllIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIllIl[10], (int)lllIIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIllIl[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIllIl[1]];
                        nArray[ar.lllIIllIl[0]] = lllIIllIl[10];
                        if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
                            bl = lllIIllIl[1];

                            if (((0x2D ^ 0x6F ^ (0x39 ^ 0x2F)) & (0x7D ^ 0x6A ^ (0x57 ^ 0x14) ^ -1)) != 0) {
                                return ((0x7C ^ 0x19 ^ (0x66 ^ 0x38)) & (0xEF ^ 0xAD ^ (0x1F ^ 0x66) ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIIllIl[0];
                        }
                        return bl;
                    }, (int)lllIIllIl[5]);

                }
                int[] nArray10 = new int[lllIIllIl[1]];
                nArray10[ar.lllIIllIl[0]] = lllIIllIl[11];
                if (ar.llIIIIllllIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIllIl[11], (int)lllIIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIllIl[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIllIl[1]];
                        nArray[ar.lllIIllIl[0]] = lllIIllIl[11];
                        if (ar.llIIIlIIIIII(Inventory.getCount((int[])nArray))) {
                            bl = lllIIllIl[1];

                            if (((0xC ^ 0x3B ^ 2) & (0x30 ^ 0x4D ^ (0xCA ^ 0x82) ^ -1)) != 0) {
                                return ((162 + 8 - 32 + 110 ^ 4 + 168 - 48 + 64) & (0xF3 ^ 0xB1 ^ (0x65 ^ 0x63) ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIIllIl[0];
                        }
                        return bl;
                    }, (int)lllIIllIl[5]);

                }
            }
            if (ar.llIIIIllllIl(ar.an() ? 1 : 0)) {
                if (ar.llIIIIllllIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderGWD.c = lllIIllII[lllIIllIl[13]];
                    System.out.println(lllIIllII[lllIIllIl[14]]);
                    Inventory.getAll((int[])my).stream().forEach(Item::drop);
                }
                if (ar.llIIIIllllll(Inventory.isFull() ? 1 : 0)) {
                    if (ar.llIIIIlllllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[15])) {
                        if (ar.llIIIIllllll(mM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIllII[lllIIllIl[16]];
                            Movement.walkTo((WorldPoint)mM.toWorldPoint());

                            Time.sleepTicks((int)lllIIllIl[6]);

                        }
                        if (ar.llIIIIllllIl(mM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIllII[lllIIllIl[17]];
                            lllIllIlIlIII = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])mP);
                            if (ar.llIIIIllllll(Players.getLocal().isAnimating() ? 1 : 0) && ar.llIIIIllllll(Players.getLocal().isMoving() ? 1 : 0) && ar.llIIIlIIIIIl(lllIllIlIlIII)) {
                                System.out.println(lllIIllII[lllIIllIl[18]]);
                                lllIllIlIlIII.interact(lllIIllII[lllIIllIl[19]]);
                                Time.sleepTicks((int)lllIIllIl[4]);

                            }
                        }
                    }
                    if (ar.llIIIlIIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIllIl[15])) {
                        if (ar.llIIIIllllll(mN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIllII[lllIIllIl[20]];
                            Movement.walkTo((WorldPoint)mO);

                            Time.sleepTicks((int)lllIIllIl[6]);

                        }
                        if (ar.llIIIIllllIl(mN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIllII[lllIIllIl[21]];
                            lllIllIlIlIII = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])mQ);
                            if (ar.llIIIIllllll(Players.getLocal().isAnimating() ? 1 : 0) && ar.llIIIIllllll(Players.getLocal().isMoving() ? 1 : 0) && ar.llIIIlIIIIIl(lllIllIlIlIII)) {
                                System.out.println(lllIIllII[lllIIllIl[22]]);
                                lllIllIlIlIII.interact(lllIIllII[lllIIllIl[15]]);
                                Time.sleepTicks((int)lllIIllIl[4]);

                            }
                        }
                    }
                }
            }
        }
    }
}

