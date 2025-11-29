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
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.BHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.FHelper;
import gg.squire.account.AccBuilderRogues;
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

public class VHelper {
    private static  int db;
    private static  int dc;
    public static  List<d> bv;
    
    public static  boolean bt;

    public static void af() {
        d llIIlllIlllI;
        Object llIIlllIllll;
        int[] nArray = new int[lIIIIlllll[1]];
        nArray[v.lIIIIlllll[0]] = db;
        if (v.lllIIllIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(db, lIIIIlllll[1], lIIIIlllll[21]);
            bv.add(d2);

        }
        int[] nArray2 = new int[lIIIIlllll[1]];
        nArray2[v.lIIIIlllll[0]] = dc;
        if (v.lllIIllIllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llIIlllIllll = new DHelper(dc, lIIIIlllll[1], lIIIIlllll[22]);
            bv.add((DHelper) lIIlllIllll);

        }
        int[] nArray3 = new int[lIIIIlllll[1]];
        nArray3[v.lIIIIlllll[0]] = lIIIIlllll[8];
        if (v.lllIIllIllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llIIlllIllll = new DHelper(lIIIIlllll[8], lIIIIlllll[1], lIIIIlllll[23]);
            bv.add((DHelper) lIIlllIllll);

        }
        int[] nArray4 = new int[lIIIIlllll[1]];
        nArray4[v.lIIIIlllll[0]] = lIIIIlllll[7];
        if (v.lllIIllIllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llIIlllIllll = new DHelper(lIIIIlllll[7], lIIIIlllll[1], lIIIIlllll[24]);
            bv.add((DHelper) lIIlllIllll);

        }
        int[] nArray5 = new int[lIIIIlllll[1]];
        nArray5[v.lIIIIlllll[0]] = lIIIIlllll[25];
        if (v.lllIIllIllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llIIlllIllll = new DHelper(lIIIIlllll[25], lIIIIlllll[5], lIIIIlllll[13]);
            bv.add((DHelper) lIIlllIllll);

        }
        int[] nArray6 = new int[lIIIIlllll[1]];
        nArray6[v.lIIIIlllll[0]] = lIIIIlllll[26];
        if (v.lllIIllIllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            llIIlllIllll = new DHelper(lIIIIlllll[26], lIIIIlllll[27], lIIIIlllll[13]);
            bv.add((DHelper) lIIlllIllll);

        }
        int[] nArray7 = new int[lIIIIlllll[1]];
        nArray7[v.lIIIIlllll[0]] = lIIIIlllll[28];
        if (v.lllIIllIllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            llIIlllIllll = new DHelper(lIIIIlllll[28], lIIIIlllll[29], lIIIIlllll[13]);
            bv.add((DHelper) lIIlllIllll);

        }
        int[] nArray8 = new int[lIIIIlllll[1]];
        nArray8[v.lIIIIlllll[0]] = lIIIIlllll[30];
        if (v.lllIIllIllII(Bank.contains((int[])nArray8) ? 1 : 0)) {
            llIIlllIllll = new DHelper(lIIIIlllll[30], lIIIIlllll[31], lIIIIlllll[13]);
            bv.add((DHelper) lIIlllIllll);

        }
        int[] nArray9 = new int[lIIIIlllll[1]];
        nArray9[v.lIIIIlllll[0]] = lIIIIlllll[25];
        if (v.lllIIllIlIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
            int[] nArray10 = new int[lIIIIlllll[1]];
            nArray10[v.lIIIIlllll[0]] = lIIIIlllll[25];
            if (v.lllIIllIlIll(Bank.getFirst((int[])nArray10).getQuantity(), lIIIIlllll[32])) {
                llIIlllIllll = new DHelper(lIIIIlllll[25], lIIIIlllll[5], lIIIIlllll[13]);
                bv.add((DHelper) lIIlllIllll);

            }
        }
        int[] nArray11 = new int[lIIIIlllll[1]];
        nArray11[v.lIIIIlllll[0]] = lIIIIlllll[26];
        if (v.lllIIllIlIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
            int[] nArray12 = new int[lIIIIlllll[1]];
            nArray12[v.lIIIIlllll[0]] = lIIIIlllll[26];
            if (v.lllIIllIlIll(Bank.getFirst((int[])nArray12).getQuantity(), lIIIIlllll[32])) {
                llIIlllIllll = new DHelper(lIIIIlllll[26], lIIIIlllll[27], lIIIIlllll[13]);
                bv.add((DHelper) lIIlllIllll);

            }
        }
        int[] nArray13 = new int[lIIIIlllll[1]];
        nArray13[v.lIIIIlllll[0]] = lIIIIlllll[28];
        if (v.lllIIllIlIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
            int[] nArray14 = new int[lIIIIlllll[1]];
            nArray14[v.lIIIIlllll[0]] = lIIIIlllll[28];
            if (v.lllIIllIlIll(Bank.getFirst((int[])nArray14).getQuantity(), lIIIIlllll[32])) {
                llIIlllIllll = new DHelper(lIIIIlllll[28], lIIIIlllll[29], lIIIIlllll[13]);
                bv.add((DHelper) lIIlllIllll);

            }
        }
        int[] nArray15 = new int[lIIIIlllll[1]];
        nArray15[v.lIIIIlllll[0]] = lIIIIlllll[30];
        if (v.lllIIllIlIlI(Bank.contains((int[])nArray15) ? 1 : 0)) {
            int[] nArray16 = new int[lIIIIlllll[1]];
            nArray16[v.lIIIIlllll[0]] = lIIIIlllll[30];
            if (v.lllIIllIlIll(Bank.getFirst((int[])nArray16).getQuantity(), lIIIIlllll[32])) {
                llIIlllIllll = new DHelper(lIIIIlllll[30], lIIIIlllll[31], lIIIIlllll[13]);
                bv.add((DHelper) lIIlllIllll);

            }
        }
        if (v.lllIIllIllII(Bank.contains((Predicate)(llIIlllIllll = item -> item.getName().toLowerCase().contains(lIIIIllllI[lIIIIlllll[40]]))) ? 1 : 0)) {
            llIIlllIlllI = new DHelper(lIIIIlllll[33], lIIIIlllll[6], lIIIIlllll[34]);
            bv.add(llIIlllIlllI);

        }
        int[] nArray17 = new int[lIIIIlllll[1]];
        nArray17[v.lIIIIlllll[0]] = lIIIIlllll[35];
        if (v.lllIIllIllII(Bank.contains((int[])nArray17) ? 1 : 0)) {
            llIIlllIlllI = new DHelper(lIIIIlllll[35], lIIIIlllll[36], lIIIIlllll[37]);
            bv.add(llIIlllIlllI);

        }
    }

        return String.valueOf(llIIlllIIIIl);
    }

    static {
        v.lllIIllIlIIl();
        v.lllIIllIlIII();
        bv = new ArrayList<d>();
        db = lIIIIlllll[41];
        dc = lIIIIlllll[42];
        int[] nArray = new int[lIIIIlllll[4]];
        nArray[v.lIIIIlllll[0]] = db;
        nArray[v.lIIIIlllll[1]] = dc;
        nArray[v.lIIIIlllll[2]] = lIIIIlllll[8];
        nArray[v.lIIIIlllll[3]] = lIIIIlllll[7];
        dd = nArray;
    }

    private static boolean lllIIllIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aW() {
        int n2;
        String[] stringArray = new String[lIIIIlllll[1]];
        stringArray[v.lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[17]];
        if (v.lllIIllIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIIIIlllll[1]];
            nArray[v.lIIIIlllll[0]] = lIIIIlllll[8];
            if (v.lllIIllIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lIIIIlllll[1]];
                stringArray2[v.lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[18]];
                if (v.lllIIllIlIlI(Inventory.contains((String[])stringArray2) ? 1 : 0) && v.lllIIllIlIlI(Inventory.contains((int[])f.aN) ? 1 : 0)) {
                    n2 = lIIIIlllll[1];

                    if (-1 <= -1) return n2 != 0;
                    return ((0x32 ^ 0x66 ^ (0xFF ^ 0x86)) & (130 + 73 - 202 + 150 ^ 132 + 180 - 282 + 156 ^ -1)) != 0;
                }
            }
        }
        n2 = lIIIIlllll[0];
        return n2 != 0;
    }

    private static void lllIIllIlIII() {
        lIIIIllllI = new String[lIIIIlllll[43]];
        v.lIIIIllllI[v.lIIIIlllll[0]] = "Buying items";
        v.lIIIIllllI[v.lIIIIlllll[1]] = "Finished buying items, switching back to gearing";
        v.lIIIIllllI[v.lIIIIlllll[2]] = "Get Mage Gear Util";
        v.lIIIIllllI[v.lIIIIlllll[3]] = "Navigating to bank";
        v.lIIIIllllI[v.lIIIIlllll[4]] = "Opening bank";
        v.lIIIIllllI[v.lIIIIlllll[6]] = "Handling banking";
        v.lIIIIllllI[v.lIIIIlllll[9]] = "We are missing supplies, switching to BUYING Util";
        v.lIIIIllllI[v.lIIIIlllll[10]] = "Wear";
        v.lIIIIllllI[v.lIIIIlllll[11]] = "Wear";
        v.lIIIIllllI[v.lIIIIlllll[12]] = "Wield";
        v.lIIIIllllI[v.lIIIIlllll[13]] = "Wield";
        v.lIIIIllllI[v.lIIIIlllll[14]] = "Equip";
        v.lIIIIllllI[v.lIIIIlllll[15]] = "Equip";
        v.lIIIIllllI[v.lIIIIlllll[17]] = "Staff of air";
        v.lIIIIllllI[v.lIIIIlllll[18]] = "Leather gloves";
        v.lIIIIllllI[v.lIIIIlllll[19]] = "Staff of air";
        v.lIIIIllllI[v.lIIIIlllll[20]] = "Leather gloves";
        v.lIIIIllllI[v.lIIIIlllll[38]] = "Wear";
        v.lIIIIllllI[v.lIIIIlllll[39]] = "Wear";
        v.lIIIIllllI[v.lIIIIlllll[40]] = "ring of wealth (";
    }

    public static void aY() {
        if (v.lllIIllIlIlI(Inventory.contains((int[])f.bf) ? 1 : 0) && v.lllIIllIllII(Equipment.contains((int[])f.bf) ? 1 : 0)) {
            Inventory.getFirst((int[])f.bf).interact(lIIIIllllI[lIIIIlllll[38]]);
            Time.sleepTicks((int)lIIIIlllll[1]);

        }
        if (v.lllIIllIlIlI(Inventory.contains((int[])f.aR) ? 1 : 0) && v.lllIIllIllII(Equipment.contains((int[])f.aR) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aR).interact(lIIIIllllI[lIIIIlllll[39]]);
            Time.sleepTicks((int)lIIIIlllll[1]);

        }
    }

    private static boolean lllIIllIlllI(int n2) {
        return n2 > 0;
    }

    private static boolean lllIIllIllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIIllIllIl(Object object) {
        return object != null;
    }

    public static void aV() {
        block28: {
            block29: {
                block34: {
                    block31: {
                        block33: {
                            block32: {
                                block30: {
                                    if (v.lllIIllIlIlI(bt ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIIIllllI[lIIIIlllll[0]];
                                        b.a(bv);
                                        if (v.lllIIllIlIll(bv.size(), lIIIIlllll[1])) {
                                            System.out.println(lIIIIllllI[lIIIIlllll[1]]);
                                            bt = lIIIIlllll[0];
                                        }
                                    }
                                    if (!v.lllIIllIllII(bt ? 1 : 0) || !v.lllIIllIllII(v.aX() ? 1 : 0)) break block28;
                                    System.out.println(lIIIIllllI[lIIIIlllll[2]]);
                                    if (!v.lllIIllIllII(v.aW() ? 1 : 0)) break block29;
                                    BankLocation llIIllllIIll = BankLocation.getNearest();
                                    if (v.lllIIllIllIl(llIIllllIIll) && v.lllIIllIllII(llIIllllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIIIllllI[lIIIIlllll[3]];
                                        a.a(llIIllllIIll);
                                    }
                                    if (!v.lllIIllIllIl(llIIllllIIll) || !v.lllIIllIlIlI(llIIllllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block29;
                                    if (v.lllIIllIllII(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIIIllllI[lIIIIlllll[4]];
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIlllll[5]);

                                    }
                                    if (!v.lllIIllIlIlI(Bank.isOpen() ? 1 : 0)) break block29;
                                    AccBuilderRogues.c = lIIIIllllI[lIIIIlllll[6]];
                                    if (v.lllIIllIlllI(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIIIIlllll[3]);

                                    }
                                    if (v.lllIIllIlllI(Equipment.getAll().size()) && v.lllIIllIllII(v.aX() ? 1 : 0)) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIIIIlllll[2]);

                                    }
                                    int[] nArray = new int[lIIIIlllll[1]];
                                    nArray[v.lIIIIlllll[0]] = dc;
                                    if (!v.lllIIllIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray2 = new int[lIIIIlllll[1]];
                                    nArray2[v.lIIIIlllll[0]] = dc;
                                    if (!v.lllIIllIllll(Inventory.getCount((int[])nArray2), lIIIIlllll[1])) break block31;
                                }
                                int[] nArray = new int[lIIIIlllll[1]];
                                nArray[v.lIIIIlllll[0]] = db;
                                if (!v.lllIIllIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                                int[] nArray3 = new int[lIIIIlllll[1]];
                                nArray3[v.lIIIIlllll[0]] = db;
                                if (!v.lllIIllIlIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block31;
                            }
                            int[] nArray = new int[lIIIIlllll[1]];
                            nArray[v.lIIIIlllll[0]] = lIIIIlllll[7];
                            if (!v.lllIIllIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                            int[] nArray4 = new int[lIIIIlllll[1]];
                            nArray4[v.lIIIIlllll[0]] = lIIIIlllll[7];
                            if (!v.lllIIllIllll(Inventory.getCount((int[])nArray4), lIIIIlllll[1])) break block31;
                        }
                        int[] nArray = new int[lIIIIlllll[1]];
                        nArray[v.lIIIIlllll[0]] = lIIIIlllll[8];
                        if (!v.lllIIllIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray5 = new int[lIIIIlllll[1]];
                        nArray5[v.lIIIIlllll[0]] = lIIIIlllll[8];
                        if (!v.lllIIllIlIll(Inventory.getCount((int[])nArray5), lIIIIlllll[1])) break block34;
                    }
                    v.af();
                    System.out.println(lIIIIllllI[lIIIIlllll[9]]);
                    bt = lIIIIlllll[1];
                    return;
                }
                int[] nArray = new int[lIIIIlllll[1]];
                nArray[v.lIIIIlllll[0]] = db;
                if (v.lllIIllIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[lIIIIlllll[1]];
                    nArray6[v.lIIIIlllll[0]] = db;
                    if (v.lllIIllIlIll(Inventory.getCount((int[])nArray6), lIIIIlllll[1])) {
                        Bank.withdraw((int)db, (int)lIIIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIIlllll[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIIlllll[1]];
                            nArray[v.lIIIIlllll[0]] = db;
                            if (v.lllIIllIlllI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIIlllll[1];

                                if (1 != 1) {
                                    return false;
                                }
                            } else {
                                bl = lIIIIlllll[0];
                            }
                            return bl;
                        }, (int)lIIIIlllll[5]);

                    }
                }
                int[] nArray7 = new int[lIIIIlllll[1]];
                nArray7[v.lIIIIlllll[0]] = dc;
                if (v.lllIIllIlIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIIlllll[1]];
                    nArray8[v.lIIIIlllll[0]] = dc;
                    if (v.lllIIllIlIll(Inventory.getCount((int[])nArray8), lIIIIlllll[1])) {
                        Bank.withdraw((int)dc, (int)lIIIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIIlllll[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIIlllll[1]];
                            nArray[v.lIIIIlllll[0]] = dc;
                            if (v.lllIIllIlllI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIIlllll[1];

                                }
                            } else {
                                bl = lIIIIlllll[0];
                            }
                            return bl;
                        }, (int)lIIIIlllll[5]);

                    }
                }
                int[] nArray9 = new int[lIIIIlllll[1]];
                nArray9[v.lIIIIlllll[0]] = lIIIIlllll[7];
                if (v.lllIIllIlIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    int[] nArray10 = new int[lIIIIlllll[1]];
                    nArray10[v.lIIIIlllll[0]] = lIIIIlllll[7];
                    if (v.lllIIllIlIll(Inventory.getCount((int[])nArray10), lIIIIlllll[1])) {
                        Bank.withdraw((int)lIIIIlllll[7], (int)lIIIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIIlllll[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIIlllll[1]];
                            nArray[v.lIIIIlllll[0]] = lIIIIlllll[7];
                            if (v.lllIIllIlllI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIIlllll[1];

                                if (2 <= ((51 + 20 - 55 + 134 ^ 153 + 110 - 231 + 129) & (0x5A ^ 4 ^ (0xA8 ^ 0xC1) ^ -1))) {
                                    return ((58 + 42 - 13 + 92 ^ 154 + 136 - 177 + 61) & (0x9D ^ 0x8B ^ (0x3C ^ 0x37) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIIlllll[0];
                            }
                            return bl;
                        }, (int)lIIIIlllll[5]);

                    }
                }
                int[] nArray11 = new int[lIIIIlllll[1]];
                nArray11[v.lIIIIlllll[0]] = lIIIIlllll[8];
                if (v.lllIIllIlIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    int[] nArray12 = new int[lIIIIlllll[1]];
                    nArray12[v.lIIIIlllll[0]] = lIIIIlllll[8];
                    if (v.lllIIllIlIll(Inventory.getCount((int[])nArray12), lIIIIlllll[1])) {
                        Bank.withdraw((int)lIIIIlllll[8], (int)lIIIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIIlllll[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIIlllll[1]];
                            nArray[v.lIIIIlllll[0]] = lIIIIlllll[8];
                            if (v.lllIIllIlllI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIIlllll[1];

                                if (3 == 0) {
                                    return false;
                                }
                            } else {
                                bl = lIIIIlllll[0];
                            }
                            return bl;
                        }, (int)lIIIIlllll[5]);

                    }
                }
            }
            if (v.lllIIllIlIlI(v.aW() ? 1 : 0)) {
                if (v.lllIIllIlIlI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (v.lllIIllIllII(Bank.isOpen() ? 1 : 0)) {
                    if (v.lllIIllIlIlI(GrandExchange.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepTicks((int)lIIIIlllll[1]);

                    }
                    int llIIllllIIll = lIIIIlllll[0];
                    while (v.lllIIllIlIll(llIIllllIIll, dd.length)) {
                        int[] nArray = new int[lIIIIlllll[1]];
                        nArray[v.lIIIIlllll[0]] = dd[llIIllllIIll];
                        Item llIIllllIIlI = Inventory.getFirst((int[])nArray);
                        if (v.lllIIllIllIl(llIIllllIIlI)) {
                            int[] nArray13 = new int[lIIIIlllll[1]];
                            nArray13[v.lIIIIlllll[0]] = llIIllllIIlI.getId();
                            if (v.lllIIllIlIlI(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                String[] stringArray = new String[lIIIIlllll[1]];
                                stringArray[v.lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[10]];
                                if (v.lllIIllIlIlI(llIIllllIIlI.hasAction(stringArray) ? 1 : 0)) {
                                    llIIllllIIlI.interact(lIIIIllllI[lIIIIlllll[11]]);
                                    Time.sleepTicks((int)lIIIIlllll[1]);

                                }
                                String[] stringArray2 = new String[lIIIIlllll[1]];
                                stringArray2[v.lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[12]];
                                if (v.lllIIllIlIlI(llIIllllIIlI.hasAction(stringArray2) ? 1 : 0)) {
                                    llIIllllIIlI.interact(lIIIIllllI[lIIIIlllll[13]]);
                                    Time.sleepTicks((int)lIIIIlllll[1]);

                                }
                                String[] stringArray3 = new String[lIIIIlllll[1]];
                                stringArray3[v.lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[14]];
                                if (v.lllIIllIlIlI(llIIllllIIlI.hasAction(stringArray3) ? 1 : 0)) {
                                    llIIllllIIlI.interact(lIIIIllllI[lIIIIlllll[15]]);
                                    Time.sleepTicks((int)lIIIIlllll[1]);

                                }
                                Time.sleepTicks((int)lIIIIlllll[1]);

                            }
                        }
                        ++llIIllllIIll;

                        if (3 >= 1) continue;
                        return;
                    }
                    if (v.lllIIllIlIlI(v.aX() ? 1 : 0) && v.lllIIllIllII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIlllll[16]);

                    }
                }
            }
        }
    }

    private static boolean lllIIllIllII(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aX() {
        int n2;
        String[] stringArray = new String[lIIIIlllll[1]];
        stringArray[v.lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[19]];
        if (v.lllIIllIlIlI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIIIIlllll[1]];
            nArray[v.lIIIIlllll[0]] = lIIIIlllll[8];
            if (v.lllIIllIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIIlllll[1]];
                nArray2[v.lIIIIlllll[0]] = lIIIIlllll[7];
                if (v.lllIIllIlIlI(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIIlllll[1]];
                    stringArray2[v.lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[20]];
                    if (v.lllIIllIlIlI(Equipment.contains((String[])stringArray2) ? 1 : 0)) {
                        n2 = lIIIIlllll[1];

                        if (-1 <= 0) return n2 != 0;
                        return ((0x2E ^ 1 ^ (0x1D ^ 0x6F)) & (44 + 135 - 127 + 157 ^ 33 + 50 - -3 + 54 ^ -1)) != 0;
                    }
                }
            }
        }
        n2 = lIIIIlllll[0];
        return n2 != 0;
    }
}

