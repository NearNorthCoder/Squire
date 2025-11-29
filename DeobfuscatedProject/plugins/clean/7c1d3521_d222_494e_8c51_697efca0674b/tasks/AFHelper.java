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
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import gg.squire.account.AccBuilderSotf;
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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;

public class AFHelper
implements ac {
    public static final  WorldArea pz;
    public static final  int pv;
    public static final  WorldArea pA;
    public static final  int pu;
    public static  int[] ox;
    public static final  int py;
    public static  int[] oy;
    
    public static final  int px;
    public static  List<d> bv;
    public static  int[] ow;
    
    public static final  WorldPoint pB;
    public static  boolean bt;
    public static final  int pw;

    public static void Q() {
        d var1;
        Object var2;
        int[] nArray = new int[lllIIlllll[1]];
        nArray[aF.lllIIlllll[0]] = lllIIlllll[7];
        if (aF.llIIIIlllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lllIIlllll[7], lllIIlllll[1], lllIIlllll[5]);
            bv.add(d2);

        }
        int[] nArray2 = new int[lllIIlllll[1]];
        nArray2[aF.lllIIlllll[0]] = lllIIlllll[8];
        if (aF.llIIIIlllIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var2 = new DHelper(lllIIlllll[8], lllIIlllll[1], lllIIlllll[5]);
            bv.add((DHelper) ar2);

        }
        int[] nArray3 = new int[lllIIlllll[1]];
        nArray3[aF.lllIIlllll[0]] = lllIIlllll[9];
        if (aF.llIIIIlllIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var2 = new DHelper(lllIIlllll[9], lllIIlllll[1], lllIIlllll[26]);
            bv.add((DHelper) ar2);

        }
        int[] nArray4 = new int[lllIIlllll[1]];
        nArray4[aF.lllIIlllll[0]] = lllIIlllll[10];
        if (aF.llIIIIlllIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var2 = new DHelper(lllIIlllll[10], lllIIlllll[1], lllIIlllll[27]);
            bv.add((DHelper) ar2);

        }
        int[] nArray5 = new int[lllIIlllll[1]];
        nArray5[aF.lllIIlllll[0]] = lllIIlllll[11];
        if (aF.llIIIIlllIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var2 = new DHelper(lllIIlllll[11], lllIIlllll[1], lllIIlllll[28]);
            bv.add((DHelper) ar2);

        }
        if (aF.llIIIIlllIIlI(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(lllIIllllI[lllIIlllll[36]]))) ? 1 : 0)) {
            var1 = new DHelper(lllIIlllll[29], lllIIlllll[12], lllIIlllll[28]);
            bv.add(var1);

        }
        int[] nArray6 = new int[lllIIlllll[1]];
        nArray6[aF.lllIIlllll[0]] = lllIIlllll[30];
        if (aF.llIIIIlllIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var1 = new DHelper(lllIIlllll[30], lllIIlllll[31], lllIIlllll[32]);
            bv.add(var1);

        }
    }

    private static boolean llIIIIlllIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIIlllIlII(Object object) {
        return object != null;
    }

    @Override
    public String ag() {
        return lllIIllllI[lllIIlllll[34]];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean an() {
        int n2;
        if (aF.llIIIIlllIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[23])) {
            boolean bl;
            int[] nArray = new int[lllIIlllll[1]];
            nArray[aF.lllIIlllll[0]] = lllIIlllll[11];
            if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
                bl = lllIIlllll[1];

                if (3 >= 0) return bl;
                return ((0x39 ^ 0x3C ^ (4 ^ 0x1E)) & (0xD9 ^ 0xB9 ^ 36 + 55 - 67 + 103 ^ -1)) != 0;
            }
            bl = lllIIlllll[0];
            return bl;
        }
        if (aF.llIIIIlllIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[24]) && aF.llIIIIlllIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[23])) {
            int n3;
            int[] nArray = new int[lllIIlllll[1]];
            nArray[aF.lllIIlllll[0]] = lllIIlllll[11];
            if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lllIIlllll[1]];
                nArray2[aF.lllIIlllll[0]] = lllIIlllll[10];
                if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray2))) {
                    n3 = lllIIlllll[1];

                    if (3 < (9 ^ 0x33 ^ (0x5E ^ 0x60))) return n3 != 0;
                    return false;
                }
            }
            n3 = lllIIlllll[0];
            return n3 != 0;
        }
        if (aF.llIIIIlllIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[25]) && aF.llIIIIlllIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[24])) {
            int n4;
            int[] nArray = new int[lllIIlllll[1]];
            nArray[aF.lllIIlllll[0]] = lllIIlllll[11];
            if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[lllIIlllll[1]];
                nArray3[aF.lllIIlllll[0]] = lllIIlllll[10];
                if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray3))) {
                    int[] nArray4 = new int[lllIIlllll[1]];
                    nArray4[aF.lllIIlllll[0]] = lllIIlllll[9];
                    if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray4))) {
                        n4 = lllIIlllll[1];

                        if (((29 + 1 - -138 + 82 ^ 119 + 24 - 53 + 86) & (0x11 ^ 9 ^ (0xEE ^ 0xBC) ^ -1)) <= 0) return n4 != 0;
                        return ((0x3A ^ 0x6F ^ (0x59 ^ 2)) & (95 + 175 - 100 + 14 ^ 88 + 24 - -68 + 2 ^ -1)) != 0;
                    }
                }
            }
            n4 = lllIIlllll[0];
            return n4 != 0;
        }
        if (aF.llIIIIlllIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[13]) && aF.llIIIIlllIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[25])) {
            int n5;
            int[] nArray = new int[lllIIlllll[1]];
            nArray[aF.lllIIlllll[0]] = lllIIlllll[11];
            if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
                int[] nArray5 = new int[lllIIlllll[1]];
                nArray5[aF.lllIIlllll[0]] = lllIIlllll[10];
                if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray5))) {
                    int[] nArray6 = new int[lllIIlllll[1]];
                    nArray6[aF.lllIIlllll[0]] = lllIIlllll[9];
                    if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray6))) {
                        int[] nArray7 = new int[lllIIlllll[1]];
                        nArray7[aF.lllIIlllll[0]] = lllIIlllll[8];
                        if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray7))) {
                            n5 = lllIIlllll[1];

                            if ((0xB5 ^ 0xBC ^ (0x5A ^ 0x57)) > 0) return n5 != 0;
                            return ((177 + 108 - 227 + 125 ^ 120 + 49 - 70 + 48) & (0x1D ^ 0x47 ^ (0x32 ^ 0x4C) ^ -1)) != 0;
                        }
                    }
                }
            }
            n5 = lllIIlllll[0];
            return n5 != 0;
        }
        int[] nArray = new int[lllIIlllll[1]];
        nArray[aF.lllIIlllll[0]] = lllIIlllll[11];
        if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
            int[] nArray8 = new int[lllIIlllll[1]];
            nArray8[aF.lllIIlllll[0]] = lllIIlllll[10];
            if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray8))) {
                int[] nArray9 = new int[lllIIlllll[1]];
                nArray9[aF.lllIIlllll[0]] = lllIIlllll[9];
                if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray9))) {
                    int[] nArray10 = new int[lllIIlllll[1]];
                    nArray10[aF.lllIIlllll[0]] = lllIIlllll[8];
                    if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray10))) {
                        int[] nArray11 = new int[lllIIlllll[1]];
                        nArray11[aF.lllIIlllll[0]] = lllIIlllll[7];
                        if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray11))) {
                            n2 = lllIIlllll[1];

                            if ((0x25 ^ 2 ^ (0x50 ^ 0x73)) == (0x2F ^ 0x7F ^ (0xE0 ^ 0xB4))) return n2 != 0;
                            return ((0xBB ^ 0xAA ^ (0x19 ^ 0x11)) & (65 + 61 - 28 + 47 ^ 113 + 94 - 111 + 40 ^ -1)) != 0;
                        }
                    }
                }
            }
        }
        n2 = lllIIlllll[0];
        return n2 != 0;
    }

    static {
        aF.llIIIIllIllll();
        aF.llIIIIllIlllI();
        py = lllIIlllll[11];
        pw = lllIIlllll[9];
        pv = lllIIlllll[8];
        px = lllIIlllll[10];
        pu = lllIIlllll[7];
        pz = new WorldArea(lllIIlllll[37], lllIIlllll[38], lllIIlllll[34], lllIIlllll[39], lllIIlllll[0]);
        pA = new WorldArea(lllIIlllll[40], lllIIlllll[41], lllIIlllll[22], lllIIlllll[34], lllIIlllll[0]);
        pB = new WorldPoint(lllIIlllll[42], lllIIlllll[43], lllIIlllll[0]);
        int[] nArray = new int[lllIIlllll[6]];
        nArray[aF.lllIIlllll[0]] = lllIIlllll[44];
        nArray[aF.lllIIlllll[1]] = lllIIlllll[45];
        nArray[aF.lllIIlllll[3]] = lllIIlllll[46];
        nArray[aF.lllIIlllll[4]] = lllIIlllll[47];
        ow = nArray;
        int[] nArray2 = new int[lllIIlllll[1]];
        nArray2[aF.lllIIlllll[0]] = lllIIlllll[48];
        ox = nArray2;
        int[] nArray3 = new int[lllIIlllll[4]];
        nArray3[aF.lllIIlllll[0]] = lllIIlllll[49];
        nArray3[aF.lllIIlllll[1]] = lllIIlllll[50];
        nArray3[aF.lllIIlllll[3]] = lllIIlllll[51];
        oy = nArray3;
        bv = new ArrayList<d>();
    }

    @Override
    public boolean ae() {
        return lllIIlllll[0];
    }

    private static void llIIIIllIlllI() {
        lllIIllllI = new String[lllIIlllll[52]];
        aF.lllIIllllI[aF.lllIIlllll[0]] = "Buying items";
        aF.lllIIllllI[aF.lllIIlllll[1]] = "Finished buying items, switching back to woodcutting";
        aF.lllIIllllI[aF.lllIIlllll[3]] = "Navigating to bank";
        aF.lllIIllllI[aF.lllIIlllll[4]] = "Opening bank";
        aF.lllIIllllI[aF.lllIIlllll[6]] = "Handling banking";
        aF.lllIIllllI[aF.lllIIlllll[12]] = "We are missing pickaxes, switching to BUYING";
        aF.lllIIllllI[aF.lllIIlllll[13]] = "Dropping logs";
        aF.lllIIllllI[aF.lllIIlllll[14]] = "Dropping logs";
        aF.lllIIllllI[aF.lllIIlllll[16]] = "Walking to trees";
        aF.lllIIllllI[aF.lllIIlllll[17]] = "Chopping";
        aF.lllIIllllI[aF.lllIIlllll[18]] = "Chopping logs";
        aF.lllIIllllI[aF.lllIIlllll[19]] = "Chop down";
        aF.lllIIllllI[aF.lllIIlllll[20]] = "Walking to oak trees";
        aF.lllIIllllI[aF.lllIIlllll[21]] = "Chopping oaks";
        aF.lllIIllllI[aF.lllIIlllll[22]] = "Chopping oak logs";
        aF.lllIIllllI[aF.lllIIlllll[15]] = "Chop down";
        aF.lllIIllllI[aF.lllIIlllll[34]] = "Woodcutting";
        aF.lllIIllllI[aF.lllIIlllll[36]] = "ring of wealth (";
    }

    private static boolean llIIIIlllIIII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aF.llIIIIlllIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[35])) {
            bl = lllIIlllll[1];

            }
        } else {
            bl = lllIIlllll[0];
        }
        return bl;
    }

    private static boolean llIIIIlllIIIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var3);
    }

    @Override
    public int af() {
        aF.gs();
        return lllIIlllll[33];
    }

    private static boolean llIIIIlllIIll(int n2) {
        return n2 > 0;
    }

    private static boolean llIIIIlllIIlI(int n2) {
        return n2 == 0;
    }

    public static void gs() {
        block25: {
            BankLocation var4;
            block27: {
                block33: {
                    block29: {
                        block32: {
                            block31: {
                                block30: {
                                    block28: {
                                        block26: {
                                            if (aF.llIIIIlllIIII(bt ? 1 : 0)) {
                                                AccBuilderSotf.c = lllIIllllI[lllIIlllll[0]];
                                                b.a(bv);
                                                if (aF.llIIIIlllIIIl(bv.size(), lllIIlllll[1])) {
                                                    System.out.println(lllIIllllI[lllIIlllll[1]]);
                                                    bt = lllIIlllll[0];
                                                }
                                            }
                                            if (!aF.llIIIIlllIIlI(bt ? 1 : 0)) break block25;
                                            if (!aF.llIIIIlllIIII(aF.an() ? 1 : 0)) break block26;
                                            int[] nArray = new int[lllIIlllll[1]];
                                            nArray[aF.lllIIlllll[0]] = lllIIlllll[2];
                                            if (!aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) break block27;
                                        }
                                        if (aF.llIIIIlllIlII(var4 = BankLocation.getNearest()) && aF.llIIIIlllIIlI(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderSotf.c = lllIIllllI[lllIIlllll[3]];
                                            a.a(var4);
                                        }
                                        if (!aF.llIIIIlllIlII(var4) || !aF.llIIIIlllIIII(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block27;
                                        if (aF.llIIIIlllIIlI(Bank.isOpen() ? 1 : 0)) {
                                            AccBuilderSotf.c = lllIIllllI[lllIIlllll[4]];
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIlllll[5]);

                                        }
                                        if (!aF.llIIIIlllIIII(Bank.isOpen() ? 1 : 0)) break block27;
                                        AccBuilderSotf.c = lllIIllllI[lllIIlllll[6]];
                                        if (aF.llIIIIlllIIll(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lllIIlllll[6]);

                                        }
                                        if (aF.llIIIIlllIIll(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lllIIlllll[3]);

                                        }
                                        int[] nArray = new int[lllIIlllll[1]];
                                        nArray[aF.lllIIlllll[0]] = lllIIlllll[7];
                                        if (!aF.llIIIIlllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray2 = new int[lllIIlllll[1]];
                                        nArray2[aF.lllIIlllll[0]] = lllIIlllll[7];
                                        if (!aF.llIIIIlllIlIl(Inventory.getCount((int[])nArray2), lllIIlllll[1])) break block29;
                                    }
                                    int[] nArray = new int[lllIIlllll[1]];
                                    nArray[aF.lllIIlllll[0]] = lllIIlllll[8];
                                    if (!aF.llIIIIlllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray3 = new int[lllIIlllll[1]];
                                    nArray3[aF.lllIIlllll[0]] = lllIIlllll[8];
                                    if (!aF.llIIIIlllIlIl(Inventory.getCount((int[])nArray3), lllIIlllll[1])) break block29;
                                }
                                int[] nArray = new int[lllIIlllll[1]];
                                nArray[aF.lllIIlllll[0]] = lllIIlllll[9];
                                if (!aF.llIIIIlllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                int[] nArray4 = new int[lllIIlllll[1]];
                                nArray4[aF.lllIIlllll[0]] = lllIIlllll[9];
                                if (!aF.llIIIIlllIlIl(Inventory.getCount((int[])nArray4), lllIIlllll[1])) break block29;
                            }
                            int[] nArray = new int[lllIIlllll[1]];
                            nArray[aF.lllIIlllll[0]] = lllIIlllll[10];
                            if (!aF.llIIIIlllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray5 = new int[lllIIlllll[1]];
                            nArray5[aF.lllIIlllll[0]] = lllIIlllll[10];
                            if (!aF.llIIIIlllIlIl(Inventory.getCount((int[])nArray5), lllIIlllll[1])) break block29;
                        }
                        int[] nArray = new int[lllIIlllll[1]];
                        nArray[aF.lllIIlllll[0]] = lllIIlllll[11];
                        if (!aF.llIIIIlllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray6 = new int[lllIIlllll[1]];
                        nArray6[aF.lllIIlllll[0]] = lllIIlllll[11];
                        if (!aF.llIIIIlllIIIl(Inventory.getCount((int[])nArray6), lllIIlllll[1])) break block33;
                    }
                    aF.Q();
                    System.out.println(lllIIllllI[lllIIlllll[12]]);
                    bt = lllIIlllll[1];
                    return;
                }
                int[] nArray = new int[lllIIlllll[1]];
                nArray[aF.lllIIlllll[0]] = lllIIlllll[7];
                if (aF.llIIIIlllIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIlllll[7], (int)lllIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlllll[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIlllll[1]];
                        nArray[aF.lllIIlllll[0]] = lllIIlllll[7];
                        if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
                            bl = lllIIlllll[1];

                            if (3 < 1) {
                                return false;
                            }
                        } else {
                            bl = lllIIlllll[0];
                        }
                        return bl;
                    }, (int)lllIIlllll[5]);

                }
                int[] nArray7 = new int[lllIIlllll[1]];
                nArray7[aF.lllIIlllll[0]] = lllIIlllll[8];
                if (aF.llIIIIlllIIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIlllll[8], (int)lllIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlllll[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIlllll[1]];
                        nArray[aF.lllIIlllll[0]] = lllIIlllll[8];
                        if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
                            bl = lllIIlllll[1];

                            if (-(161 + 180 - 257 + 114 ^ 37 + 16 - -9 + 132) >= 0) {
                                return ((0x5B ^ 0x7A ^ (0x30 ^ 0x43)) & (0xEA ^ 0xAF ^ (0xA1 ^ 0xB6) ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIIlllll[0];
                        }
                        return bl;
                    }, (int)lllIIlllll[5]);

                }
                int[] nArray8 = new int[lllIIlllll[1]];
                nArray8[aF.lllIIlllll[0]] = lllIIlllll[9];
                if (aF.llIIIIlllIIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIlllll[9], (int)lllIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlllll[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIlllll[1]];
                        nArray[aF.lllIIlllll[0]] = lllIIlllll[9];
                        if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
                            bl = lllIIlllll[1];

                            }
                        } else {
                            bl = lllIIlllll[0];
                        }
                        return bl;
                    }, (int)lllIIlllll[5]);

                }
                int[] nArray9 = new int[lllIIlllll[1]];
                nArray9[aF.lllIIlllll[0]] = lllIIlllll[10];
                if (aF.llIIIIlllIIII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIlllll[10], (int)lllIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlllll[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIlllll[1]];
                        nArray[aF.lllIIlllll[0]] = lllIIlllll[10];
                        if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
                            bl = lllIIlllll[1];

                            }
                        } else {
                            bl = lllIIlllll[0];
                        }
                        return bl;
                    }, (int)lllIIlllll[5]);

                }
                int[] nArray10 = new int[lllIIlllll[1]];
                nArray10[aF.lllIIlllll[0]] = lllIIlllll[11];
                if (aF.llIIIIlllIIII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    Bank.withdraw((int)lllIIlllll[11], (int)lllIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlllll[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIlllll[1]];
                        nArray[aF.lllIIlllll[0]] = lllIIlllll[11];
                        if (aF.llIIIIlllIIll(Inventory.getCount((int[])nArray))) {
                            bl = lllIIlllll[1];

                            if (-1 == (0x6A ^ 0x6E)) {
                                return false;
                            }
                        } else {
                            bl = lllIIlllll[0];
                        }
                        return bl;
                    }, (int)lllIIlllll[5]);

                }
            }
            if (aF.llIIIIlllIIII(aF.an() ? 1 : 0)) {
                if (aF.llIIIIlllIIII(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIllllI[lllIIlllll[13]];
                    System.out.println(lllIIllllI[lllIIlllll[14]]);
                    Inventory.getAll((int[])oy).stream().forEach(Item::drop);
                }
                if (aF.llIIIIlllIIlI(Inventory.isFull() ? 1 : 0)) {
                    if (aF.llIIIIlllIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[15])) {
                        if (aF.llIIIIlllIIlI(pz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIllllI[lllIIlllll[16]];
                            Movement.walkTo((WorldPoint)pz.toWorldPoint());

                            Time.sleepTicks((int)lllIIlllll[6]);

                        }
                        if (aF.llIIIIlllIIII(pz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIllllI[lllIIlllll[17]];
                            var4 = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])ow);
                            if (aF.llIIIIlllIIlI(Players.getLocal().isAnimating() ? 1 : 0) && aF.llIIIIlllIIlI(Players.getLocal().isMoving() ? 1 : 0) && aF.llIIIIlllIlII(var4)) {
                                System.out.println(lllIIllllI[lllIIlllll[18]]);
                                var4.interact(lllIIllllI[lllIIlllll[19]]);
                                Time.sleepTicks((int)lllIIlllll[4]);

                            }
                        }
                    }
                    if (aF.llIIIIlllIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIlllll[15])) {
                        if (aF.llIIIIlllIIlI(pA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIllllI[lllIIlllll[20]];
                            Movement.walkTo((WorldPoint)pB);

                            Time.sleepTicks((int)lllIIlllll[6]);

                        }
                        if (aF.llIIIIlllIIII(pA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIllllI[lllIIlllll[21]];
                            var4 = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])ox);
                            if (aF.llIIIIlllIIlI(Players.getLocal().isAnimating() ? 1 : 0) && aF.llIIIIlllIIlI(Players.getLocal().isMoving() ? 1 : 0) && aF.llIIIIlllIlII(var4)) {
                                System.out.println(lllIIllllI[lllIIlllll[22]]);
                                var4.interact(lllIIllllI[lllIIlllll[15]]);
                                Time.sleepTicks((int)lllIIlllll[4]);

                            }
                        }
                    }
                }
            }
        }
    }
}

