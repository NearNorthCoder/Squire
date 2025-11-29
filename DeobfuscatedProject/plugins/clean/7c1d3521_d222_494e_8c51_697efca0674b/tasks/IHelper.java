/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
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
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;

public class IHelper {
    private static  int gd;
    
    public static  boolean bt;
    
    public static  List<d> bv;
    private static  int gc;

        return String.valueOf(var1);
    }

    public static void cp() {
        if (I.llIIIIlIIIlII(Inventory.contains((int[])f.bk) ? 1 : 0) && I.llIIIIlIIIllI(Equipment.contains((int[])f.bk) ? 1 : 0)) {
            Inventory.getFirst((int[])f.bk).interact(lllIIllIIl[lllIIllIlI[38]]);
            Time.sleepTicks((int)lllIIllIlI[1]);

        }
        if (I.llIIIIlIIIlII(Inventory.contains((int[])f.aW) ? 1 : 0) && I.llIIIIlIIIllI(Equipment.contains((int[])f.aW) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aW).interact(lllIIllIIl[lllIIllIlI[39]]);
            Time.sleepTicks((int)lllIIllIlI[1]);

        }
    }

    private static boolean llIIIIlIIIllI(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean cn() {
        int n2;
        String[] stringArray = new String[lllIIllIlI[1]];
        stringArray[I.lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[17]];
        if (I.llIIIIlIIIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lllIIllIlI[1]];
            nArray[I.lllIIllIlI[0]] = lllIIllIlI[8];
            if (I.llIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lllIIllIlI[1]];
                stringArray2[I.lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[18]];
                if (I.llIIIIlIIIlII(Inventory.contains((String[])stringArray2) ? 1 : 0) && I.llIIIIlIIIlII(Inventory.contains((int[])f.aS) ? 1 : 0)) {
                    n2 = lllIIllIlI[1];

                    if (3 == 3) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lllIIllIlI[0];
        return n2 != 0;
    }

    private static boolean llIIIIlIIIlll(Object object) {
        return object != null;
    }

    private static boolean llIIIIlIIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIIlIIIlII(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean co() {
        int n2;
        String[] stringArray = new String[lllIIllIlI[1]];
        stringArray[I.lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[19]];
        if (I.llIIIIlIIIlII(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lllIIllIlI[1]];
            nArray[I.lllIIllIlI[0]] = lllIIllIlI[8];
            if (I.llIIIIlIIIlII(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIIllIlI[1]];
                nArray2[I.lllIIllIlI[0]] = lllIIllIlI[7];
                if (I.llIIIIlIIIlII(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    String[] stringArray2 = new String[lllIIllIlI[1]];
                    stringArray2[I.lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[20]];
                    if (I.llIIIIlIIIlII(Equipment.contains((String[])stringArray2) ? 1 : 0)) {
                        n2 = lllIIllIlI[1];

                        if ((0x29 ^ 0x2D) > 0) return n2 != 0;
                        return (1 & ~1) != 0;
                    }
                }
            }
        }
        n2 = lllIIllIlI[0];
        return n2 != 0;
    }

    public static void cm() {
        block28: {
            block29: {
                block34: {
                    block31: {
                        block33: {
                            block32: {
                                block30: {
                                    if (I.llIIIIlIIIlII(bt ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIIllIIl[lllIIllIlI[0]];
                                        b.a(bv);
                                        if (I.llIIIIlIIIlIl(bv.size(), lllIIllIlI[1])) {
                                            System.out.println(lllIIllIIl[lllIIllIlI[1]]);
                                            bt = lllIIllIlI[0];
                                        }
                                    }
                                    if (!I.llIIIIlIIIllI(bt ? 1 : 0) || !I.llIIIIlIIIllI(I.co() ? 1 : 0)) break block28;
                                    System.out.println(lllIIllIIl[lllIIllIlI[2]]);
                                    if (!I.llIIIIlIIIllI(I.cn() ? 1 : 0)) break block29;
                                    BankLocation var2 = BankLocation.getNearest();
                                    if (I.llIIIIlIIIlll(var2) && I.llIIIIlIIIllI(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIIllIIl[lllIIllIlI[3]];
                                        a.a(var2);
                                    }
                                    if (!I.llIIIIlIIIlll(var2) || !I.llIIIIlIIIlII(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block29;
                                    if (I.llIIIIlIIIllI(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIIllIIl[lllIIllIlI[4]];
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIllIlI[5]);

                                    }
                                    if (!I.llIIIIlIIIlII(Bank.isOpen() ? 1 : 0)) break block29;
                                    AccBuilderSotf.c = lllIIllIIl[lllIIllIlI[6]];
                                    if (I.llIIIIlIIlIII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lllIIllIlI[3]);

                                    }
                                    if (I.llIIIIlIIlIII(Equipment.getAll().size()) && I.llIIIIlIIIllI(I.co() ? 1 : 0)) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lllIIllIlI[2]);

                                    }
                                    int[] nArray = new int[lllIIllIlI[1]];
                                    nArray[I.lllIIllIlI[0]] = gd;
                                    if (!I.llIIIIlIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray2 = new int[lllIIllIlI[1]];
                                    nArray2[I.lllIIllIlI[0]] = gd;
                                    if (!I.llIIIIlIIlIIl(Inventory.getCount((int[])nArray2), lllIIllIlI[1])) break block31;
                                }
                                int[] nArray = new int[lllIIllIlI[1]];
                                nArray[I.lllIIllIlI[0]] = gc;
                                if (!I.llIIIIlIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                                int[] nArray3 = new int[lllIIllIlI[1]];
                                nArray3[I.lllIIllIlI[0]] = gc;
                                if (!I.llIIIIlIIIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block31;
                            }
                            int[] nArray = new int[lllIIllIlI[1]];
                            nArray[I.lllIIllIlI[0]] = lllIIllIlI[7];
                            if (!I.llIIIIlIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                            int[] nArray4 = new int[lllIIllIlI[1]];
                            nArray4[I.lllIIllIlI[0]] = lllIIllIlI[7];
                            if (!I.llIIIIlIIlIIl(Inventory.getCount((int[])nArray4), lllIIllIlI[1])) break block31;
                        }
                        int[] nArray = new int[lllIIllIlI[1]];
                        nArray[I.lllIIllIlI[0]] = lllIIllIlI[8];
                        if (!I.llIIIIlIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray5 = new int[lllIIllIlI[1]];
                        nArray5[I.lllIIllIlI[0]] = lllIIllIlI[8];
                        if (!I.llIIIIlIIIlIl(Inventory.getCount((int[])nArray5), lllIIllIlI[1])) break block34;
                    }
                    I.Q();
                    System.out.println(lllIIllIIl[lllIIllIlI[9]]);
                    bt = lllIIllIlI[1];
                    return;
                }
                int[] nArray = new int[lllIIllIlI[1]];
                nArray[I.lllIIllIlI[0]] = gc;
                if (I.llIIIIlIIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[lllIIllIlI[1]];
                    nArray6[I.lllIIllIlI[0]] = gc;
                    if (I.llIIIIlIIIlIl(Inventory.getCount((int[])nArray6), lllIIllIlI[1])) {
                        Bank.withdraw((int)gc, (int)lllIIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lllIIllIlI[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIIllIlI[1]];
                            nArray[I.lllIIllIlI[0]] = gc;
                            if (I.llIIIIlIIlIII(Inventory.getCount((int[])nArray))) {
                                bl = lllIIllIlI[1];

                                if (2 < 0) {
                                    return false;
                                }
                            } else {
                                bl = lllIIllIlI[0];
                            }
                            return bl;
                        }, (int)lllIIllIlI[5]);

                    }
                }
                int[] nArray7 = new int[lllIIllIlI[1]];
                nArray7[I.lllIIllIlI[0]] = gd;
                if (I.llIIIIlIIIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lllIIllIlI[1]];
                    nArray8[I.lllIIllIlI[0]] = gd;
                    if (I.llIIIIlIIIlIl(Inventory.getCount((int[])nArray8), lllIIllIlI[1])) {
                        Bank.withdraw((int)gd, (int)lllIIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lllIIllIlI[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIIllIlI[1]];
                            nArray[I.lllIIllIlI[0]] = gd;
                            if (I.llIIIIlIIlIII(Inventory.getCount((int[])nArray))) {
                                bl = lllIIllIlI[1];

                                if (-1 > 1) {
                                    return false;
                                }
                            } else {
                                bl = lllIIllIlI[0];
                            }
                            return bl;
                        }, (int)lllIIllIlI[5]);

                    }
                }
                int[] nArray9 = new int[lllIIllIlI[1]];
                nArray9[I.lllIIllIlI[0]] = lllIIllIlI[7];
                if (I.llIIIIlIIIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    int[] nArray10 = new int[lllIIllIlI[1]];
                    nArray10[I.lllIIllIlI[0]] = lllIIllIlI[7];
                    if (I.llIIIIlIIIlIl(Inventory.getCount((int[])nArray10), lllIIllIlI[1])) {
                        Bank.withdraw((int)lllIIllIlI[7], (int)lllIIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lllIIllIlI[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIIllIlI[1]];
                            nArray[I.lllIIllIlI[0]] = lllIIllIlI[7];
                            if (I.llIIIIlIIlIII(Inventory.getCount((int[])nArray))) {
                                bl = lllIIllIlI[1];

                                if (2 == 0) {
                                    return ((123 + 37 - 54 + 97 ^ 93 + 101 - 96 + 43) & (0x98 ^ 0xBD ^ (0x7A ^ 0x19) ^ -1)) != 0;
                                }
                            } else {
                                bl = lllIIllIlI[0];
                            }
                            return bl;
                        }, (int)lllIIllIlI[5]);

                    }
                }
                int[] nArray11 = new int[lllIIllIlI[1]];
                nArray11[I.lllIIllIlI[0]] = lllIIllIlI[8];
                if (I.llIIIIlIIIlII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    int[] nArray12 = new int[lllIIllIlI[1]];
                    nArray12[I.lllIIllIlI[0]] = lllIIllIlI[8];
                    if (I.llIIIIlIIIlIl(Inventory.getCount((int[])nArray12), lllIIllIlI[1])) {
                        Bank.withdraw((int)lllIIllIlI[8], (int)lllIIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lllIIllIlI[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIIllIlI[1]];
                            nArray[I.lllIIllIlI[0]] = lllIIllIlI[8];
                            if (I.llIIIIlIIlIII(Inventory.getCount((int[])nArray))) {
                                bl = lllIIllIlI[1];

                                if ((0x16 ^ 0x12) <= ((0x48 ^ 3) & ~(0xF8 ^ 0xB3))) {
                                    return false;
                                }
                            } else {
                                bl = lllIIllIlI[0];
                            }
                            return bl;
                        }, (int)lllIIllIlI[5]);

                    }
                }
            }
            if (I.llIIIIlIIIlII(I.cn() ? 1 : 0)) {
                if (I.llIIIIlIIIlII(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (I.llIIIIlIIIllI(Bank.isOpen() ? 1 : 0)) {
                    if (I.llIIIIlIIIlII(GrandExchange.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepTicks((int)lllIIllIlI[1]);

                    }
                    int var2 = lllIIllIlI[0];
                    while (I.llIIIIlIIIlIl(var2, ge.length)) {
                        int[] nArray = new int[lllIIllIlI[1]];
                        nArray[I.lllIIllIlI[0]] = ge[var2];
                        Item var3 = Inventory.getFirst((int[])nArray);
                        if (I.llIIIIlIIIlll(var3)) {
                            int[] nArray13 = new int[lllIIllIlI[1]];
                            nArray13[I.lllIIllIlI[0]] = var3.getId();
                            if (I.llIIIIlIIIlII(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                String[] stringArray = new String[lllIIllIlI[1]];
                                stringArray[I.lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[10]];
                                if (I.llIIIIlIIIlII(var3.hasAction(stringArray) ? 1 : 0)) {
                                    var3.interact(lllIIllIIl[lllIIllIlI[11]]);
                                    Time.sleepTicks((int)lllIIllIlI[1]);

                                }
                                String[] stringArray2 = new String[lllIIllIlI[1]];
                                stringArray2[I.lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[12]];
                                if (I.llIIIIlIIIlII(var3.hasAction(stringArray2) ? 1 : 0)) {
                                    var3.interact(lllIIllIIl[lllIIllIlI[13]]);
                                    Time.sleepTicks((int)lllIIllIlI[1]);

                                }
                                String[] stringArray3 = new String[lllIIllIlI[1]];
                                stringArray3[I.lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[14]];
                                if (I.llIIIIlIIIlII(var3.hasAction(stringArray3) ? 1 : 0)) {
                                    var3.interact(lllIIllIIl[lllIIllIlI[15]]);
                                    Time.sleepTicks((int)lllIIllIlI[1]);

                                }
                                Time.sleepTicks((int)lllIIllIlI[1]);

                            }
                        }
                        ++var2;

                        if (-(0x84 ^ 0x80) <= 0) continue;
                        return;
                    }
                    if (I.llIIIIlIIIlII(I.co() ? 1 : 0) && I.llIIIIlIIIllI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIllIlI[16]);

                    }
                }
            }
        }
    }

    private static boolean llIIIIlIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public static void Q() {
        d var4;
        Object var5;
        int[] nArray = new int[lllIIllIlI[1]];
        nArray[I.lllIIllIlI[0]] = gc;
        if (I.llIIIIlIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(gc, lllIIllIlI[1], lllIIllIlI[21]);
            bv.add(d2);

        }
        int[] nArray2 = new int[lllIIllIlI[1]];
        nArray2[I.lllIIllIlI[0]] = gd;
        if (I.llIIIIlIIIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var5 = new DHelper(gd, lllIIllIlI[1], lllIIllIlI[22]);
            bv.add((DHelper) ar5);

        }
        int[] nArray3 = new int[lllIIllIlI[1]];
        nArray3[I.lllIIllIlI[0]] = lllIIllIlI[8];
        if (I.llIIIIlIIIllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var5 = new DHelper(lllIIllIlI[8], lllIIllIlI[1], lllIIllIlI[23]);
            bv.add((DHelper) ar5);

        }
        int[] nArray4 = new int[lllIIllIlI[1]];
        nArray4[I.lllIIllIlI[0]] = lllIIllIlI[7];
        if (I.llIIIIlIIIllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var5 = new DHelper(lllIIllIlI[7], lllIIllIlI[1], lllIIllIlI[24]);
            bv.add((DHelper) ar5);

        }
        int[] nArray5 = new int[lllIIllIlI[1]];
        nArray5[I.lllIIllIlI[0]] = lllIIllIlI[25];
        if (I.llIIIIlIIIllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var5 = new DHelper(lllIIllIlI[25], lllIIllIlI[5], lllIIllIlI[13]);
            bv.add((DHelper) ar5);

        }
        int[] nArray6 = new int[lllIIllIlI[1]];
        nArray6[I.lllIIllIlI[0]] = lllIIllIlI[26];
        if (I.llIIIIlIIIllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var5 = new DHelper(lllIIllIlI[26], lllIIllIlI[27], lllIIllIlI[13]);
            bv.add((DHelper) ar5);

        }
        int[] nArray7 = new int[lllIIllIlI[1]];
        nArray7[I.lllIIllIlI[0]] = lllIIllIlI[28];
        if (I.llIIIIlIIIllI(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var5 = new DHelper(lllIIllIlI[28], lllIIllIlI[29], lllIIllIlI[13]);
            bv.add((DHelper) ar5);

        }
        int[] nArray8 = new int[lllIIllIlI[1]];
        nArray8[I.lllIIllIlI[0]] = lllIIllIlI[30];
        if (I.llIIIIlIIIllI(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var5 = new DHelper(lllIIllIlI[30], lllIIllIlI[31], lllIIllIlI[13]);
            bv.add((DHelper) ar5);

        }
        int[] nArray9 = new int[lllIIllIlI[1]];
        nArray9[I.lllIIllIlI[0]] = lllIIllIlI[25];
        if (I.llIIIIlIIIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
            int[] nArray10 = new int[lllIIllIlI[1]];
            nArray10[I.lllIIllIlI[0]] = lllIIllIlI[25];
            if (I.llIIIIlIIIlIl(Bank.getFirst((int[])nArray10).getQuantity(), lllIIllIlI[32])) {
                var5 = new DHelper(lllIIllIlI[25], lllIIllIlI[5], lllIIllIlI[13]);
                bv.add((DHelper) ar5);

            }
        }
        int[] nArray11 = new int[lllIIllIlI[1]];
        nArray11[I.lllIIllIlI[0]] = lllIIllIlI[26];
        if (I.llIIIIlIIIlII(Bank.contains((int[])nArray11) ? 1 : 0)) {
            int[] nArray12 = new int[lllIIllIlI[1]];
            nArray12[I.lllIIllIlI[0]] = lllIIllIlI[26];
            if (I.llIIIIlIIIlIl(Bank.getFirst((int[])nArray12).getQuantity(), lllIIllIlI[32])) {
                var5 = new DHelper(lllIIllIlI[26], lllIIllIlI[27], lllIIllIlI[13]);
                bv.add((DHelper) ar5);

            }
        }
        int[] nArray13 = new int[lllIIllIlI[1]];
        nArray13[I.lllIIllIlI[0]] = lllIIllIlI[28];
        if (I.llIIIIlIIIlII(Bank.contains((int[])nArray13) ? 1 : 0)) {
            int[] nArray14 = new int[lllIIllIlI[1]];
            nArray14[I.lllIIllIlI[0]] = lllIIllIlI[28];
            if (I.llIIIIlIIIlIl(Bank.getFirst((int[])nArray14).getQuantity(), lllIIllIlI[32])) {
                var5 = new DHelper(lllIIllIlI[28], lllIIllIlI[29], lllIIllIlI[13]);
                bv.add((DHelper) ar5);

            }
        }
        int[] nArray15 = new int[lllIIllIlI[1]];
        nArray15[I.lllIIllIlI[0]] = lllIIllIlI[30];
        if (I.llIIIIlIIIlII(Bank.contains((int[])nArray15) ? 1 : 0)) {
            int[] nArray16 = new int[lllIIllIlI[1]];
            nArray16[I.lllIIllIlI[0]] = lllIIllIlI[30];
            if (I.llIIIIlIIIlIl(Bank.getFirst((int[])nArray16).getQuantity(), lllIIllIlI[32])) {
                var5 = new DHelper(lllIIllIlI[30], lllIIllIlI[31], lllIIllIlI[13]);
                bv.add((DHelper) ar5);

            }
        }
        if (I.llIIIIlIIIllI(Bank.contains((Predicate)(var5 = item -> item.getName().toLowerCase().contains(lllIIllIIl[lllIIllIlI[40]]))) ? 1 : 0)) {
            var4 = new DHelper(lllIIllIlI[33], lllIIllIlI[6], lllIIllIlI[34]);
            bv.add(var4);

        }
        int[] nArray17 = new int[lllIIllIlI[1]];
        nArray17[I.lllIIllIlI[0]] = lllIIllIlI[35];
        if (I.llIIIIlIIIllI(Bank.contains((int[])nArray17) ? 1 : 0)) {
            var4 = new DHelper(lllIIllIlI[35], lllIIllIlI[36], lllIIllIlI[37]);
            bv.add(var4);

        }
    }

    private static void llIIIIlIIIIlI() {
        lllIIllIIl = new String[lllIIllIlI[43]];
        I.lllIIllIIl[I.lllIIllIlI[0]] = "Buying items";
        I.lllIIllIIl[I.lllIIllIlI[1]] = "Finished buying items, switching back to gearing";
        I.lllIIllIIl[I.lllIIllIlI[2]] = "Get Mage Gear Util";
        I.lllIIllIIl[I.lllIIllIlI[3]] = "Navigating to bank";
        I.lllIIllIIl[I.lllIIllIlI[4]] = "Opening bank";
        I.lllIIllIIl[I.lllIIllIlI[6]] = "Handling banking";
        I.lllIIllIIl[I.lllIIllIlI[9]] = "We are missing supplies, switching to BUYING Util";
        I.lllIIllIIl[I.lllIIllIlI[10]] = "Wear";
        I.lllIIllIIl[I.lllIIllIlI[11]] = "Wear";
        I.lllIIllIIl[I.lllIIllIlI[12]] = "Wield";
        I.lllIIllIIl[I.lllIIllIlI[13]] = "Wield";
        I.lllIIllIIl[I.lllIIllIlI[14]] = "Equip";
        I.lllIIllIIl[I.lllIIllIlI[15]] = "Equip";
        I.lllIIllIIl[I.lllIIllIlI[17]] = "Staff of air";
        I.lllIIllIIl[I.lllIIllIlI[18]] = "Leather gloves";
        I.lllIIllIIl[I.lllIIllIlI[19]] = "Staff of air";
        I.lllIIllIIl[I.lllIIllIlI[20]] = "Leather gloves";
        I.lllIIllIIl[I.lllIIllIlI[38]] = "Wear";
        I.lllIIllIIl[I.lllIIllIlI[39]] = "Wear";
        I.lllIIllIIl[I.lllIIllIlI[40]] = "ring of wealth (";
    }

    static {
        I.llIIIIlIIIIll();
        I.llIIIIlIIIIlI();
        bv = new ArrayList<d>();
        gc = lllIIllIlI[41];
        gd = lllIIllIlI[42];
        int[] nArray = new int[lllIIllIlI[4]];
        nArray[I.lllIIllIlI[0]] = gc;
        nArray[I.lllIIllIlI[1]] = gd;
        nArray[I.lllIIllIlI[2]] = lllIIllIlI[8];
        nArray[I.lllIIllIlI[3]] = lllIIllIlI[7];
        ge = nArray;
    }

    private static boolean llIIIIlIIlIII(int n2) {
        return n2 > 0;
    }
}

