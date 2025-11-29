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
package gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks;

import gg.squire.account.AccBuilderRat;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.AHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.BHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.DHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.FHelper;
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

public class MHelper {
    public static  boolean by;
    private static  int cr;
    
    private static  int cq;

    public static  List<d> bA;

    private static boolean lIlIIllIlIlIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIllIlIlIllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIllIlIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIllIlIlIlII(int n2) {
        return n2 == 0;
    }

    public static void W() {
        d var1;
        Object var2;
        int[] nArray = new int[lIIIlllllllII[1]];
        nArray[m.lIIIlllllllII[0]] = cq;
        if (m.lIlIIllIlIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(cq, lIIIlllllllII[1], lIIIlllllllII[21]);
            bA.add(d2);

        }
        int[] nArray2 = new int[lIIIlllllllII[1]];
        nArray2[m.lIIIlllllllII[0]] = cr;
        if (m.lIlIIllIlIlIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var2 = new DHelper(cr, lIIIlllllllII[1], lIIIlllllllII[22]);
            bA.add((DHelper) ar2);

        }
        int[] nArray3 = new int[lIIIlllllllII[1]];
        nArray3[m.lIIIlllllllII[0]] = lIIIlllllllII[8];
        if (m.lIlIIllIlIlIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var2 = new DHelper(lIIIlllllllII[8], lIIIlllllllII[1], lIIIlllllllII[23]);
            bA.add((DHelper) ar2);

        }
        int[] nArray4 = new int[lIIIlllllllII[1]];
        nArray4[m.lIIIlllllllII[0]] = lIIIlllllllII[7];
        if (m.lIlIIllIlIlIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var2 = new DHelper(lIIIlllllllII[7], lIIIlllllllII[1], lIIIlllllllII[24]);
            bA.add((DHelper) ar2);

        }
        int[] nArray5 = new int[lIIIlllllllII[1]];
        nArray5[m.lIIIlllllllII[0]] = lIIIlllllllII[25];
        if (m.lIlIIllIlIlIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var2 = new DHelper(lIIIlllllllII[25], lIIIlllllllII[5], lIIIlllllllII[13]);
            bA.add((DHelper) ar2);

        }
        int[] nArray6 = new int[lIIIlllllllII[1]];
        nArray6[m.lIIIlllllllII[0]] = lIIIlllllllII[26];
        if (m.lIlIIllIlIlIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var2 = new DHelper(lIIIlllllllII[26], lIIIlllllllII[27], lIIIlllllllII[13]);
            bA.add((DHelper) ar2);

        }
        int[] nArray7 = new int[lIIIlllllllII[1]];
        nArray7[m.lIIIlllllllII[0]] = lIIIlllllllII[28];
        if (m.lIlIIllIlIlIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var2 = new DHelper(lIIIlllllllII[28], lIIIlllllllII[29], lIIIlllllllII[13]);
            bA.add((DHelper) ar2);

        }
        int[] nArray8 = new int[lIIIlllllllII[1]];
        nArray8[m.lIIIlllllllII[0]] = lIIIlllllllII[30];
        if (m.lIlIIllIlIlIlII(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var2 = new DHelper(lIIIlllllllII[30], lIIIlllllllII[31], lIIIlllllllII[13]);
            bA.add((DHelper) ar2);

        }
        int[] nArray9 = new int[lIIIlllllllII[1]];
        nArray9[m.lIIIlllllllII[0]] = lIIIlllllllII[25];
        if (m.lIlIIllIlIlIIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
            int[] nArray10 = new int[lIIIlllllllII[1]];
            nArray10[m.lIIIlllllllII[0]] = lIIIlllllllII[25];
            if (m.lIlIIllIlIlIIll(Bank.getFirst((int[])nArray10).getQuantity(), lIIIlllllllII[32])) {
                var2 = new DHelper(lIIIlllllllII[25], lIIIlllllllII[5], lIIIlllllllII[13]);
                bA.add((DHelper) ar2);

            }
        }
        int[] nArray11 = new int[lIIIlllllllII[1]];
        nArray11[m.lIIIlllllllII[0]] = lIIIlllllllII[26];
        if (m.lIlIIllIlIlIIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
            int[] nArray12 = new int[lIIIlllllllII[1]];
            nArray12[m.lIIIlllllllII[0]] = lIIIlllllllII[26];
            if (m.lIlIIllIlIlIIll(Bank.getFirst((int[])nArray12).getQuantity(), lIIIlllllllII[32])) {
                var2 = new DHelper(lIIIlllllllII[26], lIIIlllllllII[27], lIIIlllllllII[13]);
                bA.add((DHelper) ar2);

            }
        }
        int[] nArray13 = new int[lIIIlllllllII[1]];
        nArray13[m.lIIIlllllllII[0]] = lIIIlllllllII[28];
        if (m.lIlIIllIlIlIIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
            int[] nArray14 = new int[lIIIlllllllII[1]];
            nArray14[m.lIIIlllllllII[0]] = lIIIlllllllII[28];
            if (m.lIlIIllIlIlIIll(Bank.getFirst((int[])nArray14).getQuantity(), lIIIlllllllII[32])) {
                var2 = new DHelper(lIIIlllllllII[28], lIIIlllllllII[29], lIIIlllllllII[13]);
                bA.add((DHelper) ar2);

            }
        }
        int[] nArray15 = new int[lIIIlllllllII[1]];
        nArray15[m.lIIIlllllllII[0]] = lIIIlllllllII[30];
        if (m.lIlIIllIlIlIIlI(Bank.contains((int[])nArray15) ? 1 : 0)) {
            int[] nArray16 = new int[lIIIlllllllII[1]];
            nArray16[m.lIIIlllllllII[0]] = lIIIlllllllII[30];
            if (m.lIlIIllIlIlIIll(Bank.getFirst((int[])nArray16).getQuantity(), lIIIlllllllII[32])) {
                var2 = new DHelper(lIIIlllllllII[30], lIIIlllllllII[31], lIIIlllllllII[13]);
                bA.add((DHelper) ar2);

            }
        }
        if (m.lIlIIllIlIlIlII(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(lIIIllllllIll[lIIIlllllllII[40]]))) ? 1 : 0)) {
            var1 = new DHelper(lIIIlllllllII[33], lIIIlllllllII[6], lIIIlllllllII[34]);
            bA.add(var1);

        }
        int[] nArray17 = new int[lIIIlllllllII[1]];
        nArray17[m.lIIIlllllllII[0]] = lIIIlllllllII[35];
        if (m.lIlIIllIlIlIlII(Bank.contains((int[])nArray17) ? 1 : 0)) {
            var1 = new DHelper(lIIIlllllllII[35], lIIIlllllllII[36], lIIIlllllllII[37]);
            bA.add(var1);

        }
    }

    private static boolean lIlIIllIlIlIlIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIllIlIlIIlI(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean av() {
        int n2;
        String[] stringArray = new String[lIIIlllllllII[1]];
        stringArray[m.lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[19]];
        if (m.lIlIIllIlIlIIlI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIIIlllllllII[1]];
            nArray[m.lIIIlllllllII[0]] = lIIIlllllllII[8];
            if (m.lIlIIllIlIlIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIlllllllII[1]];
                nArray2[m.lIIIlllllllII[0]] = lIIIlllllllII[7];
                if (m.lIlIIllIlIlIIlI(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIlllllllII[1]];
                    stringArray2[m.lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[20]];
                    if (m.lIlIIllIlIlIIlI(Equipment.contains((String[])stringArray2) ? 1 : 0)) {
                        n2 = lIIIlllllllII[1];

                        if (3 == 3) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = lIIIlllllllII[0];
        return n2 != 0;
    }

    static {
        m.lIlIIllIlIlIIIl();
        m.lIlIIllIlIlIIII();
        bA = new ArrayList<d>();
        cq = lIIIlllllllII[41];
        cr = lIIIlllllllII[42];
        int[] nArray = new int[lIIIlllllllII[4]];
        nArray[m.lIIIlllllllII[0]] = cq;
        nArray[m.lIIIlllllllII[1]] = cr;
        nArray[m.lIIIlllllllII[2]] = lIIIlllllllII[8];
        nArray[m.lIIIlllllllII[3]] = lIIIlllllllII[7];
        cs = nArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean au() {
        int n2;
        String[] stringArray = new String[lIIIlllllllII[1]];
        stringArray[m.lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[17]];
        if (m.lIlIIllIlIlIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIIIlllllllII[1]];
            nArray[m.lIIIlllllllII[0]] = lIIIlllllllII[8];
            if (m.lIlIIllIlIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lIIIlllllllII[1]];
                stringArray2[m.lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[18]];
                if (m.lIlIIllIlIlIIlI(Inventory.contains((String[])stringArray2) ? 1 : 0) && m.lIlIIllIlIlIIlI(Inventory.contains((int[])f.aS) ? 1 : 0)) {
                    n2 = lIIIlllllllII[1];

                    if (null == null) return n2 != 0;
                    return ((0xD0 ^ 0xA8 ^ (0xF6 ^ 0x84)) & (84 + 67 - 53 + 32 ^ 77 + 101 - 98 + 56 ^ -1)) != 0;
                }
            }
        }
        n2 = lIIIlllllllII[0];
        return n2 != 0;
    }

    public static void at() {
        block28: {
            block29: {
                block34: {
                    block31: {
                        block33: {
                            block32: {
                                block30: {
                                    if (m.lIlIIllIlIlIIlI(by ? 1 : 0)) {
                                        AccBuilderRat.c = lIIIllllllIll[lIIIlllllllII[0]];
                                        b.a(bA);
                                        if (m.lIlIIllIlIlIIll(bA.size(), lIIIlllllllII[1])) {
                                            System.out.println(lIIIllllllIll[lIIIlllllllII[1]]);
                                            by = lIIIlllllllII[0];
                                        }
                                    }
                                    if (!m.lIlIIllIlIlIlII(by ? 1 : 0) || !m.lIlIIllIlIlIlII(m.av() ? 1 : 0)) break block28;
                                    System.out.println(lIIIllllllIll[lIIIlllllllII[2]]);
                                    if (!m.lIlIIllIlIlIlII(m.au() ? 1 : 0)) break block29;
                                    BankLocation var3 = BankLocation.getNearest();
                                    if (m.lIlIIllIlIlIlIl(var3) && m.lIlIIllIlIlIlII(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIIllllllIll[lIIIlllllllII[3]];
                                        a.a(var3);
                                    }
                                    if (!m.lIlIIllIlIlIlIl(var3) || !m.lIlIIllIlIlIIlI(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block29;
                                    if (m.lIlIIllIlIlIlII(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderRat.c = lIIIllllllIll[lIIIlllllllII[4]];
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllllllII[5]);

                                    }
                                    if (!m.lIlIIllIlIlIIlI(Bank.isOpen() ? 1 : 0)) break block29;
                                    AccBuilderRat.c = lIIIllllllIll[lIIIlllllllII[6]];
                                    if (m.lIlIIllIlIlIllI(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIIIlllllllII[3]);

                                    }
                                    if (m.lIlIIllIlIlIllI(Equipment.getAll().size()) && m.lIlIIllIlIlIlII(m.av() ? 1 : 0)) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIIIlllllllII[2]);

                                    }
                                    int[] nArray = new int[lIIIlllllllII[1]];
                                    nArray[m.lIIIlllllllII[0]] = cr;
                                    if (!m.lIlIIllIlIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray2 = new int[lIIIlllllllII[1]];
                                    nArray2[m.lIIIlllllllII[0]] = cr;
                                    if (!m.lIlIIllIlIlIlll(Inventory.getCount((int[])nArray2), lIIIlllllllII[1])) break block31;
                                }
                                int[] nArray = new int[lIIIlllllllII[1]];
                                nArray[m.lIIIlllllllII[0]] = cq;
                                if (!m.lIlIIllIlIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                                int[] nArray3 = new int[lIIIlllllllII[1]];
                                nArray3[m.lIIIlllllllII[0]] = cq;
                                if (!m.lIlIIllIlIlIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block31;
                            }
                            int[] nArray = new int[lIIIlllllllII[1]];
                            nArray[m.lIIIlllllllII[0]] = lIIIlllllllII[7];
                            if (!m.lIlIIllIlIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                            int[] nArray4 = new int[lIIIlllllllII[1]];
                            nArray4[m.lIIIlllllllII[0]] = lIIIlllllllII[7];
                            if (!m.lIlIIllIlIlIlll(Inventory.getCount((int[])nArray4), lIIIlllllllII[1])) break block31;
                        }
                        int[] nArray = new int[lIIIlllllllII[1]];
                        nArray[m.lIIIlllllllII[0]] = lIIIlllllllII[8];
                        if (!m.lIlIIllIlIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray5 = new int[lIIIlllllllII[1]];
                        nArray5[m.lIIIlllllllII[0]] = lIIIlllllllII[8];
                        if (!m.lIlIIllIlIlIIll(Inventory.getCount((int[])nArray5), lIIIlllllllII[1])) break block34;
                    }
                    m.W();
                    System.out.println(lIIIllllllIll[lIIIlllllllII[9]]);
                    by = lIIIlllllllII[1];
                    return;
                }
                int[] nArray = new int[lIIIlllllllII[1]];
                nArray[m.lIIIlllllllII[0]] = cq;
                if (m.lIlIIllIlIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[lIIIlllllllII[1]];
                    nArray6[m.lIIIlllllllII[0]] = cq;
                    if (m.lIlIIllIlIlIIll(Inventory.getCount((int[])nArray6), lIIIlllllllII[1])) {
                        Bank.withdraw((int)cq, (int)lIIIlllllllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIlllllllII[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllllllII[1]];
                            nArray[m.lIIIlllllllII[0]] = cq;
                            if (m.lIlIIllIlIlIllI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllllllII[1];

                                }
                            } else {
                                bl = lIIIlllllllII[0];
                            }
                            return bl;
                        }, (int)lIIIlllllllII[5]);

                    }
                }
                int[] nArray7 = new int[lIIIlllllllII[1]];
                nArray7[m.lIIIlllllllII[0]] = cr;
                if (m.lIlIIllIlIlIIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIlllllllII[1]];
                    nArray8[m.lIIIlllllllII[0]] = cr;
                    if (m.lIlIIllIlIlIIll(Inventory.getCount((int[])nArray8), lIIIlllllllII[1])) {
                        Bank.withdraw((int)cr, (int)lIIIlllllllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIlllllllII[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllllllII[1]];
                            nArray[m.lIIIlllllllII[0]] = cr;
                            if (m.lIlIIllIlIlIllI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllllllII[1];

                                if (1 >= 3) {
                                    return ((0x5E ^ 0x6F ^ (0x2A ^ 0x27)) & (99 + 60 - 95 + 80 ^ 140 + 50 - 39 + 21 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIlllllllII[0];
                            }
                            return bl;
                        }, (int)lIIIlllllllII[5]);

                    }
                }
                int[] nArray9 = new int[lIIIlllllllII[1]];
                nArray9[m.lIIIlllllllII[0]] = lIIIlllllllII[7];
                if (m.lIlIIllIlIlIIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    int[] nArray10 = new int[lIIIlllllllII[1]];
                    nArray10[m.lIIIlllllllII[0]] = lIIIlllllllII[7];
                    if (m.lIlIIllIlIlIIll(Inventory.getCount((int[])nArray10), lIIIlllllllII[1])) {
                        Bank.withdraw((int)lIIIlllllllII[7], (int)lIIIlllllllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIlllllllII[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllllllII[1]];
                            nArray[m.lIIIlllllllII[0]] = lIIIlllllllII[7];
                            if (m.lIlIIllIlIlIllI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllllllII[1];

                                if (-1 > 1) {
                                    return ((0x76 ^ 0x21 ^ (0x12 ^ 0x5D)) & (0x80 ^ 0x9B ^ 3 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIlllllllII[0];
                            }
                            return bl;
                        }, (int)lIIIlllllllII[5]);

                    }
                }
                int[] nArray11 = new int[lIIIlllllllII[1]];
                nArray11[m.lIIIlllllllII[0]] = lIIIlllllllII[8];
                if (m.lIlIIllIlIlIIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    int[] nArray12 = new int[lIIIlllllllII[1]];
                    nArray12[m.lIIIlllllllII[0]] = lIIIlllllllII[8];
                    if (m.lIlIIllIlIlIIll(Inventory.getCount((int[])nArray12), lIIIlllllllII[1])) {
                        Bank.withdraw((int)lIIIlllllllII[8], (int)lIIIlllllllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIlllllllII[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllllllII[1]];
                            nArray[m.lIIIlllllllII[0]] = lIIIlllllllII[8];
                            if (m.lIlIIllIlIlIllI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllllllII[1];

                                if ((0x91 ^ 0x87 ^ (0xA5 ^ 0xB6)) <= 0) {
                                    return ((0x40 ^ 0x39 ^ (0xF3 ^ 0x99)) & (0x54 ^ 0x38 ^ 15 + 70 - 76 + 118 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIlllllllII[0];
                            }
                            return bl;
                        }, (int)lIIIlllllllII[5]);

                    }
                }
            }
            if (m.lIlIIllIlIlIIlI(m.au() ? 1 : 0)) {
                if (m.lIlIIllIlIlIIlI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (m.lIlIIllIlIlIlII(Bank.isOpen() ? 1 : 0)) {
                    if (m.lIlIIllIlIlIIlI(GrandExchange.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepTicks((int)lIIIlllllllII[1]);

                    }
                    int var3 = lIIIlllllllII[0];
                    while (m.lIlIIllIlIlIIll(var3, cs.length)) {
                        int[] nArray = new int[lIIIlllllllII[1]];
                        nArray[m.lIIIlllllllII[0]] = cs[var3];
                        Item var4 = Inventory.getFirst((int[])nArray);
                        if (m.lIlIIllIlIlIlIl(var4)) {
                            int[] nArray13 = new int[lIIIlllllllII[1]];
                            nArray13[m.lIIIlllllllII[0]] = var4.getId();
                            if (m.lIlIIllIlIlIIlI(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                String[] stringArray = new String[lIIIlllllllII[1]];
                                stringArray[m.lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[10]];
                                if (m.lIlIIllIlIlIIlI(var4.hasAction(stringArray) ? 1 : 0)) {
                                    var4.interact(lIIIllllllIll[lIIIlllllllII[11]]);
                                    Time.sleepTicks((int)lIIIlllllllII[1]);

                                }
                                String[] stringArray2 = new String[lIIIlllllllII[1]];
                                stringArray2[m.lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[12]];
                                if (m.lIlIIllIlIlIIlI(var4.hasAction(stringArray2) ? 1 : 0)) {
                                    var4.interact(lIIIllllllIll[lIIIlllllllII[13]]);
                                    Time.sleepTicks((int)lIIIlllllllII[1]);

                                }
                                String[] stringArray3 = new String[lIIIlllllllII[1]];
                                stringArray3[m.lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[14]];
                                if (m.lIlIIllIlIlIIlI(var4.hasAction(stringArray3) ? 1 : 0)) {
                                    var4.interact(lIIIllllllIll[lIIIlllllllII[15]]);
                                    Time.sleepTicks((int)lIIIlllllllII[1]);

                                }
                                Time.sleepTicks((int)lIIIlllllllII[1]);

                            }
                        }
                        ++var3;

                        if ((0xB0 ^ 0x99 ^ (0x5E ^ 0x73)) <= (0x14 ^ 0x69 ^ (0x53 ^ 0x2A))) continue;
                        return;
                    }
                    if (m.lIlIIllIlIlIIlI(m.av() ? 1 : 0) && m.lIlIIllIlIlIlII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllllllII[16]);

                    }
                }
            }
        }
    }

    private static void lIlIIllIlIlIIII() {
        lIIIllllllIll = new String[lIIIlllllllII[43]];
        m.lIIIllllllIll[m.lIIIlllllllII[0]] = "Buying items";
        m.lIIIllllllIll[m.lIIIlllllllII[1]] = "Finished buying items, switching back to gearing";
        m.lIIIllllllIll[m.lIIIlllllllII[2]] = "Get Mage Gear Util";
        m.lIIIllllllIll[m.lIIIlllllllII[3]] = "Navigating to bank";
        m.lIIIllllllIll[m.lIIIlllllllII[4]] = "Opening bank";
        m.lIIIllllllIll[m.lIIIlllllllII[6]] = "Handling banking";
        m.lIIIllllllIll[m.lIIIlllllllII[9]] = "We are missing supplies, switching to BUYING Util";
        m.lIIIllllllIll[m.lIIIlllllllII[10]] = "Wear";
        m.lIIIllllllIll[m.lIIIlllllllII[11]] = "Wear";
        m.lIIIllllllIll[m.lIIIlllllllII[12]] = "Wield";
        m.lIIIllllllIll[m.lIIIlllllllII[13]] = "Wield";
        m.lIIIllllllIll[m.lIIIlllllllII[14]] = "w";
        m.lIIIllllllIll[m.lIIIlllllllII[15]] = "Equip";
        m.lIIIllllllIll[m.lIIIlllllllII[17]] = "Staff of air";
        m.lIIIllllllIll[m.lIIIlllllllII[18]] = "Leather gloves";
        m.lIIIllllllIll[m.lIIIlllllllII[19]] = "Staff of air";
        m.lIIIllllllIll[m.lIIIlllllllII[20]] = "Leather gloves";
        m.lIIIllllllIll[m.lIIIlllllllII[38]] = "Wear";
        m.lIIIllllllIll[m.lIIIlllllllII[39]] = "Wear";
        m.lIIIllllllIll[m.lIIIlllllllII[40]] = "ring of wealth (";
    }

        return String.valueOf(var5);
    }

    public static void aw() {
        if (m.lIlIIllIlIlIIlI(Inventory.contains((int[])f.bk) ? 1 : 0) && m.lIlIIllIlIlIlII(Equipment.contains((int[])f.bk) ? 1 : 0)) {
            Inventory.getFirst((int[])f.bk).interact(lIIIllllllIll[lIIIlllllllII[38]]);
            Time.sleepTicks((int)lIIIlllllllII[1]);

        }
        if (m.lIlIIllIlIlIIlI(Inventory.contains((int[])f.aW) ? 1 : 0) && m.lIlIIllIlIlIlII(Equipment.contains((int[])f.aW) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aW).interact(lIIIllllllIll[lIIIlllllllII[39]]);
            Time.sleepTicks((int)lIIIlllllllII[1]);

        }
    }
}

