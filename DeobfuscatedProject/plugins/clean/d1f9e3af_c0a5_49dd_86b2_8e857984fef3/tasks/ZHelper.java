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
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import net.runelite.api.Item;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class ZHelper {
    
    private static  int dx;
    public static  List<d> bv;
    
    public static  boolean bt;
    private static  int dy;

    private static boolean lllIIIIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIIlIIIl(Object object) {
        return object != null;
    }

    public static void af() {
        d lIIlIIIlIlIlIII;
        Object lIIlIIIlIlIlIIl;
        int[] nArray = new int[lIIIlIIIl[1]];
        nArray[z.lIIIlIIIl[0]] = dx;
        if (z.lllIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(dx, lIIIlIIIl[1], lIIIlIIIl[21]);
            bv.add(d2);

        }
        int[] nArray2 = new int[lIIIlIIIl[1]];
        nArray2[z.lIIIlIIIl[0]] = dy;
        if (z.lllIIIlIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIlIIIlIlIlIIl = new DHelper(dy, lIIIlIIIl[1], lIIIlIIIl[22]);
            bv.add((DHelper) IIlIIIlIlIlIIl);

        }
        int[] nArray3 = new int[lIIIlIIIl[1]];
        nArray3[z.lIIIlIIIl[0]] = lIIIlIIIl[8];
        if (z.lllIIIlIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIlIIIlIlIlIIl = new DHelper(lIIIlIIIl[8], lIIIlIIIl[1], lIIIlIIIl[23]);
            bv.add((DHelper) IIlIIIlIlIlIIl);

        }
        int[] nArray4 = new int[lIIIlIIIl[1]];
        nArray4[z.lIIIlIIIl[0]] = lIIIlIIIl[7];
        if (z.lllIIIlIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIlIIIlIlIlIIl = new DHelper(lIIIlIIIl[7], lIIIlIIIl[1], lIIIlIIIl[24]);
            bv.add((DHelper) IIlIIIlIlIlIIl);

        }
        int[] nArray5 = new int[lIIIlIIIl[1]];
        nArray5[z.lIIIlIIIl[0]] = lIIIlIIIl[25];
        if (z.lllIIIlIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIlIIIlIlIlIIl = new DHelper(lIIIlIIIl[25], lIIIlIIIl[5], lIIIlIIIl[13]);
            bv.add((DHelper) IIlIIIlIlIlIIl);

        }
        int[] nArray6 = new int[lIIIlIIIl[1]];
        nArray6[z.lIIIlIIIl[0]] = lIIIlIIIl[26];
        if (z.lllIIIlIIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIIlIIIlIlIlIIl = new DHelper(lIIIlIIIl[26], lIIIlIIIl[27], lIIIlIIIl[13]);
            bv.add((DHelper) IIlIIIlIlIlIIl);

        }
        int[] nArray7 = new int[lIIIlIIIl[1]];
        nArray7[z.lIIIlIIIl[0]] = lIIIlIIIl[28];
        if (z.lllIIIlIIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIIlIIIlIlIlIIl = new DHelper(lIIIlIIIl[28], lIIIlIIIl[29], lIIIlIIIl[13]);
            bv.add((DHelper) IIlIIIlIlIlIIl);

        }
        int[] nArray8 = new int[lIIIlIIIl[1]];
        nArray8[z.lIIIlIIIl[0]] = lIIIlIIIl[30];
        if (z.lllIIIlIIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lIIlIIIlIlIlIIl = new DHelper(lIIIlIIIl[30], lIIIlIIIl[31], lIIIlIIIl[13]);
            bv.add((DHelper) IIlIIIlIlIlIIl);

        }
        int[] nArray9 = new int[lIIIlIIIl[1]];
        nArray9[z.lIIIlIIIl[0]] = lIIIlIIIl[25];
        if (z.lllIIIIlllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
            int[] nArray10 = new int[lIIIlIIIl[1]];
            nArray10[z.lIIIlIIIl[0]] = lIIIlIIIl[25];
            if (z.lllIIIIllll(Bank.getFirst((int[])nArray10).getQuantity(), lIIIlIIIl[32])) {
                lIIlIIIlIlIlIIl = new DHelper(lIIIlIIIl[25], lIIIlIIIl[5], lIIIlIIIl[13]);
                bv.add((DHelper) IIlIIIlIlIlIIl);

            }
        }
        int[] nArray11 = new int[lIIIlIIIl[1]];
        nArray11[z.lIIIlIIIl[0]] = lIIIlIIIl[26];
        if (z.lllIIIIlllI(Bank.contains((int[])nArray11) ? 1 : 0)) {
            int[] nArray12 = new int[lIIIlIIIl[1]];
            nArray12[z.lIIIlIIIl[0]] = lIIIlIIIl[26];
            if (z.lllIIIIllll(Bank.getFirst((int[])nArray12).getQuantity(), lIIIlIIIl[32])) {
                lIIlIIIlIlIlIIl = new DHelper(lIIIlIIIl[26], lIIIlIIIl[27], lIIIlIIIl[13]);
                bv.add((DHelper) IIlIIIlIlIlIIl);

            }
        }
        int[] nArray13 = new int[lIIIlIIIl[1]];
        nArray13[z.lIIIlIIIl[0]] = lIIIlIIIl[28];
        if (z.lllIIIIlllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
            int[] nArray14 = new int[lIIIlIIIl[1]];
            nArray14[z.lIIIlIIIl[0]] = lIIIlIIIl[28];
            if (z.lllIIIIllll(Bank.getFirst((int[])nArray14).getQuantity(), lIIIlIIIl[32])) {
                lIIlIIIlIlIlIIl = new DHelper(lIIIlIIIl[28], lIIIlIIIl[29], lIIIlIIIl[13]);
                bv.add((DHelper) IIlIIIlIlIlIIl);

            }
        }
        int[] nArray15 = new int[lIIIlIIIl[1]];
        nArray15[z.lIIIlIIIl[0]] = lIIIlIIIl[30];
        if (z.lllIIIIlllI(Bank.contains((int[])nArray15) ? 1 : 0)) {
            int[] nArray16 = new int[lIIIlIIIl[1]];
            nArray16[z.lIIIlIIIl[0]] = lIIIlIIIl[30];
            if (z.lllIIIIllll(Bank.getFirst((int[])nArray16).getQuantity(), lIIIlIIIl[32])) {
                lIIlIIIlIlIlIIl = new DHelper(lIIIlIIIl[30], lIIIlIIIl[31], lIIIlIIIl[13]);
                bv.add((DHelper) IIlIIIlIlIlIIl);

            }
        }
        if (z.lllIIIlIIII(Bank.contains((Predicate)(lIIlIIIlIlIlIIl = item -> item.getName().toLowerCase().contains(lIIIlIIII[lIIIlIIIl[40]]))) ? 1 : 0)) {
            lIIlIIIlIlIlIII = new DHelper(lIIIlIIIl[33], lIIIlIIIl[6], lIIIlIIIl[34]);
            bv.add(lIIlIIIlIlIlIII);

        }
        int[] nArray17 = new int[lIIIlIIIl[1]];
        nArray17[z.lIIIlIIIl[0]] = lIIIlIIIl[35];
        if (z.lllIIIlIIII(Bank.contains((int[])nArray17) ? 1 : 0)) {
            lIIlIIIlIlIlIII = new DHelper(lIIIlIIIl[35], lIIIlIIIl[36], lIIIlIIIl[37]);
            bv.add(lIIlIIIlIlIlIII);

        }
    }

    private static boolean lllIIIlIIlI(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bi() {
        int n2;
        String[] stringArray = new String[lIIIlIIIl[1]];
        stringArray[z.lIIIlIIIl[0]] = lIIIlIIII[lIIIlIIIl[19]];
        if (z.lllIIIIlllI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIIIlIIIl[1]];
            nArray[z.lIIIlIIIl[0]] = lIIIlIIIl[8];
            if (z.lllIIIIlllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIlIIIl[1]];
                nArray2[z.lIIIlIIIl[0]] = lIIIlIIIl[7];
                if (z.lllIIIIlllI(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIlIIIl[1]];
                    stringArray2[z.lIIIlIIIl[0]] = lIIIlIIII[lIIIlIIIl[20]];
                    if (z.lllIIIIlllI(Equipment.contains((String[])stringArray2) ? 1 : 0)) {
                        n2 = lIIIlIIIl[1];

                        if (-1 < 0) return n2 != 0;
                        return ((0x90 ^ 0x9C ^ (0x94 ^ 0xA4)) & (74 + 28 - 40 + 66 ^ 178 + 82 - 173 + 101 ^ -1)) != 0;
                    }
                }
            }
        }
        n2 = lIIIlIIIl[0];
        return n2 != 0;
    }

    public static void bg() {
        block28: {
            block29: {
                block34: {
                    block31: {
                        block33: {
                            block32: {
                                block30: {
                                    if (z.lllIIIIlllI(bt ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIIlIIII[lIIIlIIIl[0]];
                                        b.a(bv);
                                        if (z.lllIIIIllll(bv.size(), lIIIlIIIl[1])) {
                                            System.out.println(lIIIlIIII[lIIIlIIIl[1]]);
                                            bt = lIIIlIIIl[0];
                                        }
                                    }
                                    if (!z.lllIIIlIIII(bt ? 1 : 0) || !z.lllIIIlIIII(z.bi() ? 1 : 0)) break block28;
                                    System.out.println(lIIIlIIII[lIIIlIIIl[2]]);
                                    if (!z.lllIIIlIIII(z.bh() ? 1 : 0)) break block29;
                                    BankLocation lIIlIIIlIlIllIl = BankLocation.getNearest();
                                    if (z.lllIIIlIIIl(lIIlIIIlIlIllIl) && z.lllIIIlIIII(lIIlIIIlIlIllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIIlIIII[lIIIlIIIl[3]];
                                        a.a(lIIlIIIlIlIllIl);
                                    }
                                    if (!z.lllIIIlIIIl(lIIlIIIlIlIllIl) || !z.lllIIIIlllI(lIIlIIIlIlIllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block29;
                                    if (z.lllIIIlIIII(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIIlIIII[lIIIlIIIl[4]];
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIIIl[5]);

                                    }
                                    if (!z.lllIIIIlllI(Bank.isOpen() ? 1 : 0)) break block29;
                                    AccBuilderEasyClues.c = lIIIlIIII[lIIIlIIIl[6]];
                                    if (z.lllIIIlIIlI(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIIIlIIIl[3]);

                                    }
                                    if (z.lllIIIlIIlI(Equipment.getAll().size()) && z.lllIIIlIIII(z.bi() ? 1 : 0)) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIIIlIIIl[2]);

                                    }
                                    int[] nArray = new int[lIIIlIIIl[1]];
                                    nArray[z.lIIIlIIIl[0]] = dy;
                                    if (!z.lllIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray2 = new int[lIIIlIIIl[1]];
                                    nArray2[z.lIIIlIIIl[0]] = dy;
                                    if (!z.lllIIIlIIll(Inventory.getCount((int[])nArray2), lIIIlIIIl[1])) break block31;
                                }
                                int[] nArray = new int[lIIIlIIIl[1]];
                                nArray[z.lIIIlIIIl[0]] = dx;
                                if (!z.lllIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                                int[] nArray3 = new int[lIIIlIIIl[1]];
                                nArray3[z.lIIIlIIIl[0]] = dx;
                                if (!z.lllIIIIlllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block31;
                            }
                            int[] nArray = new int[lIIIlIIIl[1]];
                            nArray[z.lIIIlIIIl[0]] = lIIIlIIIl[7];
                            if (!z.lllIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                            int[] nArray4 = new int[lIIIlIIIl[1]];
                            nArray4[z.lIIIlIIIl[0]] = lIIIlIIIl[7];
                            if (!z.lllIIIlIIll(Inventory.getCount((int[])nArray4), lIIIlIIIl[1])) break block31;
                        }
                        int[] nArray = new int[lIIIlIIIl[1]];
                        nArray[z.lIIIlIIIl[0]] = lIIIlIIIl[8];
                        if (!z.lllIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray5 = new int[lIIIlIIIl[1]];
                        nArray5[z.lIIIlIIIl[0]] = lIIIlIIIl[8];
                        if (!z.lllIIIIllll(Inventory.getCount((int[])nArray5), lIIIlIIIl[1])) break block34;
                    }
                    z.af();
                    System.out.println(lIIIlIIII[lIIIlIIIl[9]]);
                    bt = lIIIlIIIl[1];
                    return;
                }
                int[] nArray = new int[lIIIlIIIl[1]];
                nArray[z.lIIIlIIIl[0]] = dx;
                if (z.lllIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[lIIIlIIIl[1]];
                    nArray6[z.lIIIlIIIl[0]] = dx;
                    if (z.lllIIIIllll(Inventory.getCount((int[])nArray6), lIIIlIIIl[1])) {
                        Bank.withdraw((int)dx, (int)lIIIlIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIlIIIl[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlIIIl[1]];
                            nArray[z.lIIIlIIIl[0]] = dx;
                            if (z.lllIIIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlIIIl[1];

                                if (2 == 1) {
                                    return false;
                                }
                            } else {
                                bl = lIIIlIIIl[0];
                            }
                            return bl;
                        }, (int)lIIIlIIIl[5]);

                    }
                }
                int[] nArray7 = new int[lIIIlIIIl[1]];
                nArray7[z.lIIIlIIIl[0]] = dy;
                if (z.lllIIIIlllI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIlIIIl[1]];
                    nArray8[z.lIIIlIIIl[0]] = dy;
                    if (z.lllIIIIllll(Inventory.getCount((int[])nArray8), lIIIlIIIl[1])) {
                        Bank.withdraw((int)dy, (int)lIIIlIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIlIIIl[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlIIIl[1]];
                            nArray[z.lIIIlIIIl[0]] = dy;
                            if (z.lllIIIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlIIIl[1];

                                }
                            } else {
                                bl = lIIIlIIIl[0];
                            }
                            return bl;
                        }, (int)lIIIlIIIl[5]);

                    }
                }
                int[] nArray9 = new int[lIIIlIIIl[1]];
                nArray9[z.lIIIlIIIl[0]] = lIIIlIIIl[7];
                if (z.lllIIIIlllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    int[] nArray10 = new int[lIIIlIIIl[1]];
                    nArray10[z.lIIIlIIIl[0]] = lIIIlIIIl[7];
                    if (z.lllIIIIllll(Inventory.getCount((int[])nArray10), lIIIlIIIl[1])) {
                        Bank.withdraw((int)lIIIlIIIl[7], (int)lIIIlIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIlIIIl[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlIIIl[1]];
                            nArray[z.lIIIlIIIl[0]] = lIIIlIIIl[7];
                            if (z.lllIIIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlIIIl[1];

                                if ((3 ^ (0x5A ^ 0x5D)) < 1) {
                                    return ((82 + 24 - 47 + 191 ^ 99 + 164 - 209 + 123) & (0xE2 ^ 0x93 ^ (3 ^ 0x39) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIlIIIl[0];
                            }
                            return bl;
                        }, (int)lIIIlIIIl[5]);

                    }
                }
                int[] nArray11 = new int[lIIIlIIIl[1]];
                nArray11[z.lIIIlIIIl[0]] = lIIIlIIIl[8];
                if (z.lllIIIIlllI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    int[] nArray12 = new int[lIIIlIIIl[1]];
                    nArray12[z.lIIIlIIIl[0]] = lIIIlIIIl[8];
                    if (z.lllIIIIllll(Inventory.getCount((int[])nArray12), lIIIlIIIl[1])) {
                        Bank.withdraw((int)lIIIlIIIl[8], (int)lIIIlIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIlIIIl[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlIIIl[1]];
                            nArray[z.lIIIlIIIl[0]] = lIIIlIIIl[8];
                            if (z.lllIIIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlIIIl[1];

                                if (1 < ((9 ^ 0x4D ^ (0x94 ^ 0xB0)) & (74 + 203 - 238 + 168 ^ 24 + 120 - 92 + 123 ^ -1))) {
                                    return ((1 ^ 0x17 ^ (0x42 ^ 0x5F)) & (32 + 19 - 42 + 156 ^ 102 + 20 - 70 + 122 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIlIIIl[0];
                            }
                            return bl;
                        }, (int)lIIIlIIIl[5]);

                    }
                }
            }
            if (z.lllIIIIlllI(z.bh() ? 1 : 0)) {
                if (z.lllIIIIlllI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (z.lllIIIlIIII(Bank.isOpen() ? 1 : 0)) {
                    if (z.lllIIIIlllI(GrandExchange.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepTicks((int)lIIIlIIIl[1]);

                    }
                    int lIIlIIIlIlIllIl = lIIIlIIIl[0];
                    while (z.lllIIIIllll(lIIlIIIlIlIllIl, dz.length)) {
                        int[] nArray = new int[lIIIlIIIl[1]];
                        nArray[z.lIIIlIIIl[0]] = dz[lIIlIIIlIlIllIl];
                        Item lIIlIIIlIlIllII = Inventory.getFirst((int[])nArray);
                        if (z.lllIIIlIIIl(lIIlIIIlIlIllII)) {
                            int[] nArray13 = new int[lIIIlIIIl[1]];
                            nArray13[z.lIIIlIIIl[0]] = lIIlIIIlIlIllII.getId();
                            if (z.lllIIIIlllI(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                String[] stringArray = new String[lIIIlIIIl[1]];
                                stringArray[z.lIIIlIIIl[0]] = lIIIlIIII[lIIIlIIIl[10]];
                                if (z.lllIIIIlllI(lIIlIIIlIlIllII.hasAction(stringArray) ? 1 : 0)) {
                                    lIIlIIIlIlIllII.interact(lIIIlIIII[lIIIlIIIl[11]]);
                                    Time.sleepTicks((int)lIIIlIIIl[1]);

                                }
                                String[] stringArray2 = new String[lIIIlIIIl[1]];
                                stringArray2[z.lIIIlIIIl[0]] = lIIIlIIII[lIIIlIIIl[12]];
                                if (z.lllIIIIlllI(lIIlIIIlIlIllII.hasAction(stringArray2) ? 1 : 0)) {
                                    lIIlIIIlIlIllII.interact(lIIIlIIII[lIIIlIIIl[13]]);
                                    Time.sleepTicks((int)lIIIlIIIl[1]);

                                }
                                String[] stringArray3 = new String[lIIIlIIIl[1]];
                                stringArray3[z.lIIIlIIIl[0]] = lIIIlIIII[lIIIlIIIl[14]];
                                if (z.lllIIIIlllI(lIIlIIIlIlIllII.hasAction(stringArray3) ? 1 : 0)) {
                                    lIIlIIIlIlIllII.interact(lIIIlIIII[lIIIlIIIl[15]]);
                                    Time.sleepTicks((int)lIIIlIIIl[1]);

                                }
                                Time.sleepTicks((int)lIIIlIIIl[1]);

                            }
                        }
                        ++lIIlIIIlIlIllIl;

                        if (((0xBD ^ 0xAC ^ (0xFD ^ 0xB3)) & (213 + 213 - 357 + 164 ^ 55 + 36 - 20 + 111 ^ -1)) == 0) continue;
                        return;
                    }
                    if (z.lllIIIIlllI(z.bi() ? 1 : 0) && z.lllIIIlIIII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIIIl[16]);

                    }
                }
            }
        }
    }

    private static boolean lllIIIIlllI(int n2) {
        return n2 != 0;
    }

    static {
        z.lllIIIIllIl();
        z.lllIIIIllII();
        bv = new ArrayList<d>();
        dx = lIIIlIIIl[41];
        dy = lIIIlIIIl[42];
        int[] nArray = new int[lIIIlIIIl[4]];
        nArray[z.lIIIlIIIl[0]] = dx;
        nArray[z.lIIIlIIIl[1]] = dy;
        nArray[z.lIIIlIIIl[2]] = lIIIlIIIl[8];
        nArray[z.lIIIlIIIl[3]] = lIIIlIIIl[7];
        dz = nArray;
    }

    private static boolean lllIIIlIIll(int n2, int n3) {
        return n2 >= n3;
    }

        return String.valueOf(lIIlIIIlIIllIll);
    }

    private static boolean lllIIIlIIII(int n2) {
        return n2 == 0;
    }

    public static void bj() {
        if (z.lllIIIIlllI(Inventory.contains((int[])f.bf) ? 1 : 0) && z.lllIIIlIIII(Equipment.contains((int[])f.bf) ? 1 : 0)) {
            Inventory.getFirst((int[])f.bf).interact(lIIIlIIII[lIIIlIIIl[38]]);
            Time.sleepTicks((int)lIIIlIIIl[1]);

        }
        if (z.lllIIIIlllI(Inventory.contains((int[])f.aR) ? 1 : 0) && z.lllIIIlIIII(Equipment.contains((int[])f.aR) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aR).interact(lIIIlIIII[lIIIlIIIl[39]]);
            Time.sleepTicks((int)lIIIlIIIl[1]);

        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean bh() {
        int n2;
        String[] stringArray = new String[lIIIlIIIl[1]];
        stringArray[z.lIIIlIIIl[0]] = lIIIlIIII[lIIIlIIIl[17]];
        if (z.lllIIIIlllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIIIlIIIl[1]];
            nArray[z.lIIIlIIIl[0]] = lIIIlIIIl[8];
            if (z.lllIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lIIIlIIIl[1]];
                stringArray2[z.lIIIlIIIl[0]] = lIIIlIIII[lIIIlIIIl[18]];
                if (z.lllIIIIlllI(Inventory.contains((String[])stringArray2) ? 1 : 0) && z.lllIIIIlllI(Inventory.contains((int[])f.aN) ? 1 : 0)) {
                    n2 = lIIIlIIIl[1];

                    if (2 >= 0) return n2 != 0;
                    return ((0x11 ^ 0x3B ^ (0x4D ^ 0x5B)) & (0x35 ^ 0x11 ^ (0x6F ^ 0x77) ^ -1)) != 0;
                }
            }
        }
        n2 = lIIIlIIIl[0];
        return n2 != 0;
    }

    private static void lllIIIIllII() {
        lIIIlIIII = new String[lIIIlIIIl[43]];
        z.lIIIlIIII[z.lIIIlIIIl[0]] = "Buying items";
        z.lIIIlIIII[z.lIIIlIIIl[1]] = "Finished buying items, switching back to gearing";
        z.lIIIlIIII[z.lIIIlIIIl[2]] = "Get Mage Gear Util";
        z.lIIIlIIII[z.lIIIlIIIl[3]] = "Navigating to bank";
        z.lIIIlIIII[z.lIIIlIIIl[4]] = "Opening bank";
        z.lIIIlIIII[z.lIIIlIIIl[6]] = "Handling banking";
        z.lIIIlIIII[z.lIIIlIIIl[9]] = "We are missing supplies, switching to BUYING Util";
        z.lIIIlIIII[z.lIIIlIIIl[10]] = "Wear";
        z.lIIIlIIII[z.lIIIlIIIl[11]] = "Wear";
        z.lIIIlIIII[z.lIIIlIIIl[12]] = "Wield";
        z.lIIIlIIII[z.lIIIlIIIl[13]] = "Wield";
        z.lIIIlIIII[z.lIIIlIIIl[14]] = "Equip";
        z.lIIIlIIII[z.lIIIlIIIl[15]] = "Equip";
        z.lIIIlIIII[z.lIIIlIIIl[17]] = "Staff of air";
        z.lIIIlIIII[z.lIIIlIIIl[18]] = "Leather gloves";
        z.lIIIlIIII[z.lIIIlIIIl[19]] = "Staff of air";
        z.lIIIlIIII[z.lIIIlIIIl[20]] = "Leather gloves";
        z.lIIIlIIII[z.lIIIlIIIl[38]] = "Wear";
        z.lIIIlIIII[z.lIIIlIIIl[39]] = "Wear";
        z.lIIIlIIII[z.lIIIlIIIl[40]] = "ring of wealth (";
    }
}

