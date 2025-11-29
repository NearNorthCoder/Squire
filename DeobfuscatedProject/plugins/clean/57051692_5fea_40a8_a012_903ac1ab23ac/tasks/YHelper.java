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
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.AHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.BHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.DHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.FHelper;
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

public class YHelper {
    public static  boolean bn;
    
    public static  List<d> bp;
    private static  int dT;
    
    private static  int dU;

    private static void lIIlllIIlIlII() {
        lIlllIIlII = new String[lIlllIIlIl[43]];
        y.lIlllIIlII[y.lIlllIIlIl[0]] = "Buying items";
        y.lIlllIIlII[y.lIlllIIlIl[1]] = "Finished buying items, switching back to gearing";
        y.lIlllIIlII[y.lIlllIIlIl[2]] = "Get Mage Gear Util";
        y.lIlllIIlII[y.lIlllIIlIl[3]] = "Navigating to bank";
        y.lIlllIIlII[y.lIlllIIlIl[4]] = "Opening bank";
        y.lIlllIIlII[y.lIlllIIlIl[6]] = "Handling banking";
        y.lIlllIIlII[y.lIlllIIlIl[9]] = "We are missing supplies, switching to BUYING Util";
        y.lIlllIIlII[y.lIlllIIlIl[10]] = "Wear";
        y.lIlllIIlII[y.lIlllIIlIl[11]] = "Wear";
        y.lIlllIIlII[y.lIlllIIlIl[12]] = "Wield";
        y.lIlllIIlII[y.lIlllIIlIl[13]] = "Wield";
        y.lIlllIIlII[y.lIlllIIlIl[14]] = "Equip";
        y.lIlllIIlII[y.lIlllIIlIl[15]] = "Equip";
        y.lIlllIIlII[y.lIlllIIlIl[17]] = "Staff of air";
        y.lIlllIIlII[y.lIlllIIlIl[18]] = "Leather gloves";
        y.lIlllIIlII[y.lIlllIIlIl[19]] = "Staff of air";
        y.lIlllIIlII[y.lIlllIIlIl[20]] = "Leather gloves";
        y.lIlllIIlII[y.lIlllIIlIl[38]] = "Wear";
        y.lIlllIIlII[y.lIlllIIlIl[39]] = "Wear";
        y.lIlllIIlII[y.lIlllIIlIl[40]] = "ring of wealth (";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bv() {
        int n2;
        String[] stringArray = new String[lIlllIIlIl[1]];
        stringArray[y.lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[19]];
        if (y.lIIlllIIlIllI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIlllIIlIl[1]];
            nArray[y.lIlllIIlIl[0]] = lIlllIIlIl[8];
            if (y.lIIlllIIlIllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlllIIlIl[1]];
                nArray2[y.lIlllIIlIl[0]] = lIlllIIlIl[7];
                if (y.lIIlllIIlIllI(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIlllIIlIl[1]];
                    stringArray2[y.lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[20]];
                    if (y.lIIlllIIlIllI(Equipment.contains((String[])stringArray2) ? 1 : 0)) {
                        n2 = lIlllIIlIl[1];

                        if ((0xC1 ^ 0xC5) >= ((0x93 ^ 0x85) & ~(0x1D ^ 0xB))) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = lIlllIIlIl[0];
        return n2 != 0;
    }

    public static void bw() {
        if (y.lIIlllIIlIllI(Inventory.contains((int[])f.be) ? 1 : 0) && y.lIIlllIIllIII(Equipment.contains((int[])f.be) ? 1 : 0)) {
            Inventory.getFirst((int[])f.be).interact(lIlllIIlII[lIlllIIlIl[38]]);
            Time.sleepTicks((int)lIlllIIlIl[1]);

        }
        if (y.lIIlllIIlIllI(Inventory.contains((int[])f.aQ) ? 1 : 0) && y.lIIlllIIllIII(Equipment.contains((int[])f.aQ) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aQ).interact(lIlllIIlII[lIlllIIlIl[39]]);
            Time.sleepTicks((int)lIlllIIlIl[1]);

        }
    }

    public static void O() {
        d var1;
        Object var2;
        int[] nArray = new int[lIlllIIlIl[1]];
        nArray[y.lIlllIIlIl[0]] = dT;
        if (y.lIIlllIIllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(dT, lIlllIIlIl[1], lIlllIIlIl[21]);
            bp.add(d2);

        }
        int[] nArray2 = new int[lIlllIIlIl[1]];
        nArray2[y.lIlllIIlIl[0]] = dU;
        if (y.lIIlllIIllIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var2 = new DHelper(dU, lIlllIIlIl[1], lIlllIIlIl[22]);
            bp.add((DHelper) ar2);

        }
        int[] nArray3 = new int[lIlllIIlIl[1]];
        nArray3[y.lIlllIIlIl[0]] = lIlllIIlIl[8];
        if (y.lIIlllIIllIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var2 = new DHelper(lIlllIIlIl[8], lIlllIIlIl[1], lIlllIIlIl[23]);
            bp.add((DHelper) ar2);

        }
        int[] nArray4 = new int[lIlllIIlIl[1]];
        nArray4[y.lIlllIIlIl[0]] = lIlllIIlIl[7];
        if (y.lIIlllIIllIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var2 = new DHelper(lIlllIIlIl[7], lIlllIIlIl[1], lIlllIIlIl[24]);
            bp.add((DHelper) ar2);

        }
        int[] nArray5 = new int[lIlllIIlIl[1]];
        nArray5[y.lIlllIIlIl[0]] = lIlllIIlIl[25];
        if (y.lIIlllIIllIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var2 = new DHelper(lIlllIIlIl[25], lIlllIIlIl[5], lIlllIIlIl[13]);
            bp.add((DHelper) ar2);

        }
        int[] nArray6 = new int[lIlllIIlIl[1]];
        nArray6[y.lIlllIIlIl[0]] = lIlllIIlIl[26];
        if (y.lIIlllIIllIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var2 = new DHelper(lIlllIIlIl[26], lIlllIIlIl[27], lIlllIIlIl[13]);
            bp.add((DHelper) ar2);

        }
        int[] nArray7 = new int[lIlllIIlIl[1]];
        nArray7[y.lIlllIIlIl[0]] = lIlllIIlIl[28];
        if (y.lIIlllIIllIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var2 = new DHelper(lIlllIIlIl[28], lIlllIIlIl[29], lIlllIIlIl[13]);
            bp.add((DHelper) ar2);

        }
        int[] nArray8 = new int[lIlllIIlIl[1]];
        nArray8[y.lIlllIIlIl[0]] = lIlllIIlIl[30];
        if (y.lIIlllIIllIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var2 = new DHelper(lIlllIIlIl[30], lIlllIIlIl[31], lIlllIIlIl[13]);
            bp.add((DHelper) ar2);

        }
        int[] nArray9 = new int[lIlllIIlIl[1]];
        nArray9[y.lIlllIIlIl[0]] = lIlllIIlIl[25];
        if (y.lIIlllIIlIllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
            int[] nArray10 = new int[lIlllIIlIl[1]];
            nArray10[y.lIlllIIlIl[0]] = lIlllIIlIl[25];
            if (y.lIIlllIIlIlll(Bank.getFirst((int[])nArray10).getQuantity(), lIlllIIlIl[32])) {
                var2 = new DHelper(lIlllIIlIl[25], lIlllIIlIl[5], lIlllIIlIl[13]);
                bp.add((DHelper) ar2);

            }
        }
        int[] nArray11 = new int[lIlllIIlIl[1]];
        nArray11[y.lIlllIIlIl[0]] = lIlllIIlIl[26];
        if (y.lIIlllIIlIllI(Bank.contains((int[])nArray11) ? 1 : 0)) {
            int[] nArray12 = new int[lIlllIIlIl[1]];
            nArray12[y.lIlllIIlIl[0]] = lIlllIIlIl[26];
            if (y.lIIlllIIlIlll(Bank.getFirst((int[])nArray12).getQuantity(), lIlllIIlIl[32])) {
                var2 = new DHelper(lIlllIIlIl[26], lIlllIIlIl[27], lIlllIIlIl[13]);
                bp.add((DHelper) ar2);

            }
        }
        int[] nArray13 = new int[lIlllIIlIl[1]];
        nArray13[y.lIlllIIlIl[0]] = lIlllIIlIl[28];
        if (y.lIIlllIIlIllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
            int[] nArray14 = new int[lIlllIIlIl[1]];
            nArray14[y.lIlllIIlIl[0]] = lIlllIIlIl[28];
            if (y.lIIlllIIlIlll(Bank.getFirst((int[])nArray14).getQuantity(), lIlllIIlIl[32])) {
                var2 = new DHelper(lIlllIIlIl[28], lIlllIIlIl[29], lIlllIIlIl[13]);
                bp.add((DHelper) ar2);

            }
        }
        int[] nArray15 = new int[lIlllIIlIl[1]];
        nArray15[y.lIlllIIlIl[0]] = lIlllIIlIl[30];
        if (y.lIIlllIIlIllI(Bank.contains((int[])nArray15) ? 1 : 0)) {
            int[] nArray16 = new int[lIlllIIlIl[1]];
            nArray16[y.lIlllIIlIl[0]] = lIlllIIlIl[30];
            if (y.lIIlllIIlIlll(Bank.getFirst((int[])nArray16).getQuantity(), lIlllIIlIl[32])) {
                var2 = new DHelper(lIlllIIlIl[30], lIlllIIlIl[31], lIlllIIlIl[13]);
                bp.add((DHelper) ar2);

            }
        }
        if (y.lIIlllIIllIII(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(lIlllIIlII[lIlllIIlIl[40]]))) ? 1 : 0)) {
            var1 = new DHelper(lIlllIIlIl[33], lIlllIIlIl[6], lIlllIIlIl[34]);
            bp.add(var1);

        }
        int[] nArray17 = new int[lIlllIIlIl[1]];
        nArray17[y.lIlllIIlIl[0]] = lIlllIIlIl[35];
        if (y.lIIlllIIllIII(Bank.contains((int[])nArray17) ? 1 : 0)) {
            var1 = new DHelper(lIlllIIlIl[35], lIlllIIlIl[36], lIlllIIlIl[37]);
            bp.add(var1);

        }
    }

    private static boolean lIIlllIIllIIl(Object object) {
        return object != null;
    }

    private static boolean lIIlllIIllIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlllIIlIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlllIIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllIIllIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlllIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean bu() {
        int n2;
        String[] stringArray = new String[lIlllIIlIl[1]];
        stringArray[y.lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[17]];
        if (y.lIIlllIIlIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIlllIIlIl[1]];
            nArray[y.lIlllIIlIl[0]] = lIlllIIlIl[8];
            if (y.lIIlllIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lIlllIIlIl[1]];
                stringArray2[y.lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[18]];
                if (y.lIIlllIIlIllI(Inventory.contains((String[])stringArray2) ? 1 : 0) && y.lIIlllIIlIllI(Inventory.contains((int[])f.aM) ? 1 : 0)) {
                    n2 = lIlllIIlIl[1];

                    if (-(0x21 ^ 0x66 ^ (0x76 ^ 0x34)) < 0) return n2 != 0;
                    return ((6 + 60 - 47 + 183 ^ 138 + 2 - -1 + 16) & (0xDC ^ 0xC1 ^ (0x61 ^ 0x2B) ^ -1)) != 0;
                }
            }
        }
        n2 = lIlllIIlIl[0];
        return n2 != 0;
    }

        return String.valueOf(var3);
    }

    static {
        y.lIIlllIIlIlIl();
        y.lIIlllIIlIlII();
        bp = new ArrayList<d>();
        dT = lIlllIIlIl[41];
        dU = lIlllIIlIl[42];
        int[] nArray = new int[lIlllIIlIl[4]];
        nArray[y.lIlllIIlIl[0]] = dT;
        nArray[y.lIlllIIlIl[1]] = dU;
        nArray[y.lIlllIIlIl[2]] = lIlllIIlIl[8];
        nArray[y.lIlllIIlIl[3]] = lIlllIIlIl[7];
        dV = nArray;
    }

    public static void bt() {
        block28: {
            block29: {
                block34: {
                    block31: {
                        block33: {
                            block32: {
                                block30: {
                                    if (y.lIIlllIIlIllI(bn ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlllIIlII[lIlllIIlIl[0]];
                                        b.a(bp);
                                        if (y.lIIlllIIlIlll(bp.size(), lIlllIIlIl[1])) {
                                            System.out.println(lIlllIIlII[lIlllIIlIl[1]]);
                                            bn = lIlllIIlIl[0];
                                        }
                                    }
                                    if (!y.lIIlllIIllIII(bn ? 1 : 0) || !y.lIIlllIIllIII(y.bv() ? 1 : 0)) break block28;
                                    System.out.println(lIlllIIlII[lIlllIIlIl[2]]);
                                    if (!y.lIIlllIIllIII(y.bu() ? 1 : 0)) break block29;
                                    BankLocation var4 = BankLocation.getNearest();
                                    if (y.lIIlllIIllIIl(var4) && y.lIIlllIIllIII(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlllIIlII[lIlllIIlIl[3]];
                                        a.a(var4);
                                    }
                                    if (!y.lIIlllIIllIIl(var4) || !y.lIIlllIIlIllI(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block29;
                                    if (y.lIIlllIIllIII(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlllIIlII[lIlllIIlIl[4]];
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIIlIl[5]);

                                    }
                                    if (!y.lIIlllIIlIllI(Bank.isOpen() ? 1 : 0)) break block29;
                                    AccBuilderShamans.c = lIlllIIlII[lIlllIIlIl[6]];
                                    if (y.lIIlllIIllIlI(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIlllIIlIl[3]);

                                    }
                                    if (y.lIIlllIIllIlI(Equipment.getAll().size()) && y.lIIlllIIllIII(y.bv() ? 1 : 0)) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIlllIIlIl[2]);

                                    }
                                    int[] nArray = new int[lIlllIIlIl[1]];
                                    nArray[y.lIlllIIlIl[0]] = dU;
                                    if (!y.lIIlllIIllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray2 = new int[lIlllIIlIl[1]];
                                    nArray2[y.lIlllIIlIl[0]] = dU;
                                    if (!y.lIIlllIIllIll(Inventory.getCount((int[])nArray2), lIlllIIlIl[1])) break block31;
                                }
                                int[] nArray = new int[lIlllIIlIl[1]];
                                nArray[y.lIlllIIlIl[0]] = dT;
                                if (!y.lIIlllIIllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                                int[] nArray3 = new int[lIlllIIlIl[1]];
                                nArray3[y.lIlllIIlIl[0]] = dT;
                                if (!y.lIIlllIIlIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block31;
                            }
                            int[] nArray = new int[lIlllIIlIl[1]];
                            nArray[y.lIlllIIlIl[0]] = lIlllIIlIl[7];
                            if (!y.lIIlllIIllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                            int[] nArray4 = new int[lIlllIIlIl[1]];
                            nArray4[y.lIlllIIlIl[0]] = lIlllIIlIl[7];
                            if (!y.lIIlllIIllIll(Inventory.getCount((int[])nArray4), lIlllIIlIl[1])) break block31;
                        }
                        int[] nArray = new int[lIlllIIlIl[1]];
                        nArray[y.lIlllIIlIl[0]] = lIlllIIlIl[8];
                        if (!y.lIIlllIIllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray5 = new int[lIlllIIlIl[1]];
                        nArray5[y.lIlllIIlIl[0]] = lIlllIIlIl[8];
                        if (!y.lIIlllIIlIlll(Inventory.getCount((int[])nArray5), lIlllIIlIl[1])) break block34;
                    }
                    y.O();
                    System.out.println(lIlllIIlII[lIlllIIlIl[9]]);
                    bn = lIlllIIlIl[1];
                    return;
                }
                int[] nArray = new int[lIlllIIlIl[1]];
                nArray[y.lIlllIIlIl[0]] = dT;
                if (y.lIIlllIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[lIlllIIlIl[1]];
                    nArray6[y.lIlllIIlIl[0]] = dT;
                    if (y.lIIlllIIlIlll(Inventory.getCount((int[])nArray6), lIlllIIlIl[1])) {
                        Bank.withdraw((int)dT, (int)lIlllIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIlllIIlIl[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIlIl[1]];
                            nArray[y.lIlllIIlIl[0]] = dT;
                            if (y.lIIlllIIllIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIlIl[1];

                                if (((0x1F ^ 9) & ~(0x84 ^ 0x92)) != 0) {
                                    return false;
                                }
                            } else {
                                bl = lIlllIIlIl[0];
                            }
                            return bl;
                        }, (int)lIlllIIlIl[5]);

                    }
                }
                int[] nArray7 = new int[lIlllIIlIl[1]];
                nArray7[y.lIlllIIlIl[0]] = dU;
                if (y.lIIlllIIlIllI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIlllIIlIl[1]];
                    nArray8[y.lIlllIIlIl[0]] = dU;
                    if (y.lIIlllIIlIlll(Inventory.getCount((int[])nArray8), lIlllIIlIl[1])) {
                        Bank.withdraw((int)dU, (int)lIlllIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIlllIIlIl[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIlIl[1]];
                            nArray[y.lIlllIIlIl[0]] = dU;
                            if (y.lIIlllIIllIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIlIl[1];

                                if (1 <= -1) {
                                    return ((217 + 17 - 163 + 165 ^ 142 + 136 - 203 + 101) & (0x3F ^ 0x5F ^ (0x9F ^ 0xA3) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlllIIlIl[0];
                            }
                            return bl;
                        }, (int)lIlllIIlIl[5]);

                    }
                }
                int[] nArray9 = new int[lIlllIIlIl[1]];
                nArray9[y.lIlllIIlIl[0]] = lIlllIIlIl[7];
                if (y.lIIlllIIlIllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    int[] nArray10 = new int[lIlllIIlIl[1]];
                    nArray10[y.lIlllIIlIl[0]] = lIlllIIlIl[7];
                    if (y.lIIlllIIlIlll(Inventory.getCount((int[])nArray10), lIlllIIlIl[1])) {
                        Bank.withdraw((int)lIlllIIlIl[7], (int)lIlllIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIlllIIlIl[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIlIl[1]];
                            nArray[y.lIlllIIlIl[0]] = lIlllIIlIl[7];
                            if (y.lIIlllIIllIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIlIl[1];

                                if (-1 != -1) {
                                    return false;
                                }
                            } else {
                                bl = lIlllIIlIl[0];
                            }
                            return bl;
                        }, (int)lIlllIIlIl[5]);

                    }
                }
                int[] nArray11 = new int[lIlllIIlIl[1]];
                nArray11[y.lIlllIIlIl[0]] = lIlllIIlIl[8];
                if (y.lIIlllIIlIllI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    int[] nArray12 = new int[lIlllIIlIl[1]];
                    nArray12[y.lIlllIIlIl[0]] = lIlllIIlIl[8];
                    if (y.lIIlllIIlIlll(Inventory.getCount((int[])nArray12), lIlllIIlIl[1])) {
                        Bank.withdraw((int)lIlllIIlIl[8], (int)lIlllIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIlllIIlIl[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIlIl[1]];
                            nArray[y.lIlllIIlIl[0]] = lIlllIIlIl[8];
                            if (y.lIIlllIIllIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIlIl[1];

                                if (((0xA1 ^ 0x8A) & ~(6 ^ 0x2D)) <= -1) {
                                    return false;
                                }
                            } else {
                                bl = lIlllIIlIl[0];
                            }
                            return bl;
                        }, (int)lIlllIIlIl[5]);

                    }
                }
            }
            if (y.lIIlllIIlIllI(y.bu() ? 1 : 0)) {
                if (y.lIIlllIIlIllI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (y.lIIlllIIllIII(Bank.isOpen() ? 1 : 0)) {
                    if (y.lIIlllIIlIllI(GrandExchange.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepTicks((int)lIlllIIlIl[1]);

                    }
                    int var4 = lIlllIIlIl[0];
                    while (y.lIIlllIIlIlll(var4, dV.length)) {
                        int[] nArray = new int[lIlllIIlIl[1]];
                        nArray[y.lIlllIIlIl[0]] = dV[var4];
                        Item var5 = Inventory.getFirst((int[])nArray);
                        if (y.lIIlllIIllIIl(var5)) {
                            int[] nArray13 = new int[lIlllIIlIl[1]];
                            nArray13[y.lIlllIIlIl[0]] = var5.getId();
                            if (y.lIIlllIIlIllI(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                String[] stringArray = new String[lIlllIIlIl[1]];
                                stringArray[y.lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[10]];
                                if (y.lIIlllIIlIllI(var5.hasAction(stringArray) ? 1 : 0)) {
                                    var5.interact(lIlllIIlII[lIlllIIlIl[11]]);
                                    Time.sleepTicks((int)lIlllIIlIl[1]);

                                }
                                String[] stringArray2 = new String[lIlllIIlIl[1]];
                                stringArray2[y.lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[12]];
                                if (y.lIIlllIIlIllI(var5.hasAction(stringArray2) ? 1 : 0)) {
                                    var5.interact(lIlllIIlII[lIlllIIlIl[13]]);
                                    Time.sleepTicks((int)lIlllIIlIl[1]);

                                }
                                String[] stringArray3 = new String[lIlllIIlIl[1]];
                                stringArray3[y.lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[14]];
                                if (y.lIIlllIIlIllI(var5.hasAction(stringArray3) ? 1 : 0)) {
                                    var5.interact(lIlllIIlII[lIlllIIlIl[15]]);
                                    Time.sleepTicks((int)lIlllIIlIl[1]);

                                }
                                Time.sleepTicks((int)lIlllIIlIl[1]);

                            }
                        }
                        ++var4;

                        return;
                    }
                    if (y.lIIlllIIlIllI(y.bv() ? 1 : 0) && y.lIIlllIIllIII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIIlIl[16]);

                    }
                }
            }
        }
    }
}

