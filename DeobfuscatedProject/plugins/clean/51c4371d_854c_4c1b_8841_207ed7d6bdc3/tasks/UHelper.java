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
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.AHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.BHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.DHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.FHelper;
import gg.squire.account.AccBuilderBarrows;
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

public class UHelper {
    public static  List<d> bB;
    private static  int da;
    public static  boolean bz;

    private static  int cZ;

    private static boolean lIIlIIlllIl(Object object) {
        return object != null;
    }

        return String.valueOf(lIlllIlIIlllllI);
    }

    static {
        u.lIIlIIllIIl();
        u.lIIlIIllIII();
        bB = new ArrayList<d>();
        cZ = lIllIIII[41];
        da = lIllIIII[42];
        int[] nArray = new int[lIllIIII[4]];
        nArray[u.lIllIIII[0]] = cZ;
        nArray[u.lIllIIII[1]] = da;
        nArray[u.lIllIIII[2]] = lIllIIII[8];
        nArray[u.lIllIIII[3]] = lIllIIII[7];
        db = nArray;
    }

    private static boolean lIIlIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIlllll(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aV() {
        int n2;
        String[] stringArray = new String[lIllIIII[1]];
        stringArray[u.lIllIIII[0]] = lIlIllll[lIllIIII[19]];
        if (u.lIIlIIllIlI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIllIIII[1]];
            nArray[u.lIllIIII[0]] = lIllIIII[8];
            if (u.lIIlIIllIlI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIllIIII[1]];
                nArray2[u.lIllIIII[0]] = lIllIIII[7];
                if (u.lIIlIIllIlI(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIllIIII[1]];
                    stringArray2[u.lIllIIII[0]] = lIlIllll[lIllIIII[20]];
                    if (u.lIIlIIllIlI(Equipment.contains((String[])stringArray2) ? 1 : 0)) {
                        n2 = lIllIIII[1];

                        if (2 != -1) return n2 != 0;
                        return ((0x7F ^ 0x3E ^ (0x62 ^ 0x3A)) & (50 + 54 - 32 + 88 ^ 17 + 142 - 125 + 151 ^ -1)) != 0;
                    }
                }
            }
        }
        n2 = lIllIIII[0];
        return n2 != 0;
    }

    public static void aW() {
        if (u.lIIlIIllIlI(Inventory.contains((int[])f.bl) ? 1 : 0) && u.lIIlIIlllII(Equipment.contains((int[])f.bl) ? 1 : 0)) {
            Inventory.getFirst((int[])f.bl).interact(lIlIllll[lIllIIII[38]]);
            Time.sleepTicks((int)lIllIIII[1]);

        }
        if (u.lIIlIIllIlI(Inventory.contains((int[])f.aX) ? 1 : 0) && u.lIIlIIlllII(Equipment.contains((int[])f.aX) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aX).interact(lIlIllll[lIllIIII[39]]);
            Time.sleepTicks((int)lIllIIII[1]);

        }
    }

    public static void aT() {
        block28: {
            block29: {
                block34: {
                    block31: {
                        block33: {
                            block32: {
                                block30: {
                                    if (u.lIIlIIllIlI(bz ? 1 : 0)) {
                                        AccBuilderBarrows.c = lIlIllll[lIllIIII[0]];
                                        b.a(bB);
                                        if (u.lIIlIIllIll(bB.size(), lIllIIII[1])) {
                                            System.out.println(lIlIllll[lIllIIII[1]]);
                                            bz = lIllIIII[0];
                                        }
                                    }
                                    if (!u.lIIlIIlllII(bz ? 1 : 0) || !u.lIIlIIlllII(u.aV() ? 1 : 0)) break block28;
                                    System.out.println(lIlIllll[lIllIIII[2]]);
                                    if (!u.lIIlIIlllII(u.aU() ? 1 : 0)) break block29;
                                    BankLocation lIlllIlIlIlIIII = BankLocation.getNearest();
                                    if (u.lIIlIIlllIl(lIlllIlIlIlIIII) && u.lIIlIIlllII(lIlllIlIlIlIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderBarrows.c = lIlIllll[lIllIIII[3]];
                                        a.a(lIlllIlIlIlIIII);
                                    }
                                    if (!u.lIIlIIlllIl(lIlllIlIlIlIIII) || !u.lIIlIIllIlI(lIlllIlIlIlIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block29;
                                    if (u.lIIlIIlllII(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderBarrows.c = lIlIllll[lIllIIII[4]];
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIII[5]);

                                    }
                                    if (!u.lIIlIIllIlI(Bank.isOpen() ? 1 : 0)) break block29;
                                    AccBuilderBarrows.c = lIlIllll[lIllIIII[6]];
                                    if (u.lIIlIIllllI(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIllIIII[3]);

                                    }
                                    if (u.lIIlIIllllI(Equipment.getAll().size()) && u.lIIlIIlllII(u.aV() ? 1 : 0)) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIllIIII[2]);

                                    }
                                    int[] nArray = new int[lIllIIII[1]];
                                    nArray[u.lIllIIII[0]] = da;
                                    if (!u.lIIlIIlllII(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray2 = new int[lIllIIII[1]];
                                    nArray2[u.lIllIIII[0]] = da;
                                    if (!u.lIIlIIlllll(Inventory.getCount((int[])nArray2), lIllIIII[1])) break block31;
                                }
                                int[] nArray = new int[lIllIIII[1]];
                                nArray[u.lIllIIII[0]] = cZ;
                                if (!u.lIIlIIlllII(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                                int[] nArray3 = new int[lIllIIII[1]];
                                nArray3[u.lIllIIII[0]] = cZ;
                                if (!u.lIIlIIllIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block31;
                            }
                            int[] nArray = new int[lIllIIII[1]];
                            nArray[u.lIllIIII[0]] = lIllIIII[7];
                            if (!u.lIIlIIlllII(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                            int[] nArray4 = new int[lIllIIII[1]];
                            nArray4[u.lIllIIII[0]] = lIllIIII[7];
                            if (!u.lIIlIIlllll(Inventory.getCount((int[])nArray4), lIllIIII[1])) break block31;
                        }
                        int[] nArray = new int[lIllIIII[1]];
                        nArray[u.lIllIIII[0]] = lIllIIII[8];
                        if (!u.lIIlIIlllII(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray5 = new int[lIllIIII[1]];
                        nArray5[u.lIllIIII[0]] = lIllIIII[8];
                        if (!u.lIIlIIllIll(Inventory.getCount((int[])nArray5), lIllIIII[1])) break block34;
                    }
                    u.ag();
                    System.out.println(lIlIllll[lIllIIII[9]]);
                    bz = lIllIIII[1];
                    return;
                }
                int[] nArray = new int[lIllIIII[1]];
                nArray[u.lIllIIII[0]] = cZ;
                if (u.lIIlIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[lIllIIII[1]];
                    nArray6[u.lIllIIII[0]] = cZ;
                    if (u.lIIlIIllIll(Inventory.getCount((int[])nArray6), lIllIIII[1])) {
                        Bank.withdraw((int)cZ, (int)lIllIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIllIIII[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIllIIII[1]];
                            nArray[u.lIllIIII[0]] = cZ;
                            if (u.lIIlIIllllI(Inventory.getCount((int[])nArray))) {
                                bl = lIllIIII[1];

                            } else {
                                bl = lIllIIII[0];
                            }
                            return bl;
                        }, (int)lIllIIII[5]);

                    }
                }
                int[] nArray7 = new int[lIllIIII[1]];
                nArray7[u.lIllIIII[0]] = da;
                if (u.lIIlIIllIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIllIIII[1]];
                    nArray8[u.lIllIIII[0]] = da;
                    if (u.lIIlIIllIll(Inventory.getCount((int[])nArray8), lIllIIII[1])) {
                        Bank.withdraw((int)da, (int)lIllIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIllIIII[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIllIIII[1]];
                            nArray[u.lIllIIII[0]] = da;
                            if (u.lIIlIIllllI(Inventory.getCount((int[])nArray))) {
                                bl = lIllIIII[1];

                                if ((0xE ^ 0xA) != (0xC5 ^ 0xC1)) {
                                    return false;
                                }
                            } else {
                                bl = lIllIIII[0];
                            }
                            return bl;
                        }, (int)lIllIIII[5]);

                    }
                }
                int[] nArray9 = new int[lIllIIII[1]];
                nArray9[u.lIllIIII[0]] = lIllIIII[7];
                if (u.lIIlIIllIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    int[] nArray10 = new int[lIllIIII[1]];
                    nArray10[u.lIllIIII[0]] = lIllIIII[7];
                    if (u.lIIlIIllIll(Inventory.getCount((int[])nArray10), lIllIIII[1])) {
                        Bank.withdraw((int)lIllIIII[7], (int)lIllIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIllIIII[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIllIIII[1]];
                            nArray[u.lIllIIII[0]] = lIllIIII[7];
                            if (u.lIIlIIllllI(Inventory.getCount((int[])nArray))) {
                                bl = lIllIIII[1];

                                }
                            } else {
                                bl = lIllIIII[0];
                            }
                            return bl;
                        }, (int)lIllIIII[5]);

                    }
                }
                int[] nArray11 = new int[lIllIIII[1]];
                nArray11[u.lIllIIII[0]] = lIllIIII[8];
                if (u.lIIlIIllIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    int[] nArray12 = new int[lIllIIII[1]];
                    nArray12[u.lIllIIII[0]] = lIllIIII[8];
                    if (u.lIIlIIllIll(Inventory.getCount((int[])nArray12), lIllIIII[1])) {
                        Bank.withdraw((int)lIllIIII[8], (int)lIllIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIllIIII[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIllIIII[1]];
                            nArray[u.lIllIIII[0]] = lIllIIII[8];
                            if (u.lIIlIIllllI(Inventory.getCount((int[])nArray))) {
                                bl = lIllIIII[1];

                                if (2 == 0) {
                                    return false;
                                }
                            } else {
                                bl = lIllIIII[0];
                            }
                            return bl;
                        }, (int)lIllIIII[5]);

                    }
                }
            }
            if (u.lIIlIIllIlI(u.aU() ? 1 : 0)) {
                if (u.lIIlIIllIlI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (u.lIIlIIlllII(Bank.isOpen() ? 1 : 0)) {
                    if (u.lIIlIIllIlI(GrandExchange.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepTicks((int)lIllIIII[1]);

                    }
                    int lIlllIlIlIlIIII = lIllIIII[0];
                    while (u.lIIlIIllIll(lIlllIlIlIlIIII, db.length)) {
                        int[] nArray = new int[lIllIIII[1]];
                        nArray[u.lIllIIII[0]] = db[lIlllIlIlIlIIII];
                        Item lIlllIlIlIIllll = Inventory.getFirst((int[])nArray);
                        if (u.lIIlIIlllIl(lIlllIlIlIIllll)) {
                            int[] nArray13 = new int[lIllIIII[1]];
                            nArray13[u.lIllIIII[0]] = lIlllIlIlIIllll.getId();
                            if (u.lIIlIIllIlI(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                String[] stringArray = new String[lIllIIII[1]];
                                stringArray[u.lIllIIII[0]] = lIlIllll[lIllIIII[10]];
                                if (u.lIIlIIllIlI(lIlllIlIlIIllll.hasAction(stringArray) ? 1 : 0)) {
                                    lIlllIlIlIIllll.interact(lIlIllll[lIllIIII[11]]);
                                    Time.sleepTicks((int)lIllIIII[1]);

                                }
                                String[] stringArray2 = new String[lIllIIII[1]];
                                stringArray2[u.lIllIIII[0]] = lIlIllll[lIllIIII[12]];
                                if (u.lIIlIIllIlI(lIlllIlIlIIllll.hasAction(stringArray2) ? 1 : 0)) {
                                    lIlllIlIlIIllll.interact(lIlIllll[lIllIIII[13]]);
                                    Time.sleepTicks((int)lIllIIII[1]);

                                }
                                String[] stringArray3 = new String[lIllIIII[1]];
                                stringArray3[u.lIllIIII[0]] = lIlIllll[lIllIIII[14]];
                                if (u.lIIlIIllIlI(lIlllIlIlIIllll.hasAction(stringArray3) ? 1 : 0)) {
                                    lIlllIlIlIIllll.interact(lIlIllll[lIllIIII[15]]);
                                    Time.sleepTicks((int)lIllIIII[1]);

                                }
                                Time.sleepTicks((int)lIllIIII[1]);

                            }
                        }
                        ++lIlllIlIlIlIIII;

                        if (1 <= 1) continue;
                        return;
                    }
                    if (u.lIIlIIllIlI(u.aV() ? 1 : 0) && u.lIIlIIlllII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIII[16]);

                    }
                }
            }
        }
    }

    private static boolean lIIlIIllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIllllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIlllII(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aU() {
        int n2;
        String[] stringArray = new String[lIllIIII[1]];
        stringArray[u.lIllIIII[0]] = lIlIllll[lIllIIII[17]];
        if (u.lIIlIIllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIllIIII[1]];
            nArray[u.lIllIIII[0]] = lIllIIII[8];
            if (u.lIIlIIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lIllIIII[1]];
                stringArray2[u.lIllIIII[0]] = lIlIllll[lIllIIII[18]];
                if (u.lIIlIIllIlI(Inventory.contains((String[])stringArray2) ? 1 : 0) && u.lIIlIIllIlI(Inventory.contains((int[])f.aT) ? 1 : 0)) {
                    n2 = lIllIIII[1];

                    if (null == null) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIllIIII[0];
        return n2 != 0;
    }

    private static void lIIlIIllIII() {
        lIlIllll = new String[lIllIIII[43]];
        u.lIlIllll[u.lIllIIII[0]] = "Buying items";
        u.lIlIllll[u.lIllIIII[1]] = "Finished buying items, switching back to gearing";
        u.lIlIllll[u.lIllIIII[2]] = "Get Mage Gear Util";
        u.lIlIllll[u.lIllIIII[3]] = "Navigating to bank";
        u.lIlIllll[u.lIllIIII[4]] = "Opening bank";
        u.lIlIllll[u.lIllIIII[6]] = "Handling banking";
        u.lIlIllll[u.lIllIIII[9]] = "We are missing supplies, switching to BUYING Util";
        u.lIlIllll[u.lIllIIII[10]] = "Wear";
        u.lIlIllll[u.lIllIIII[11]] = "Wear";
        u.lIlIllll[u.lIllIIII[12]] = "Wield";
        u.lIlIllll[u.lIllIIII[13]] = "Wield";
        u.lIlIllll[u.lIllIIII[14]] = "Equip";
        u.lIlIllll[u.lIllIIII[15]] = "Equip";
        u.lIlIllll[u.lIllIIII[17]] = "Staff of air";
        u.lIlIllll[u.lIllIIII[18]] = "Leather gloves";
        u.lIlIllll[u.lIllIIII[19]] = "Staff of air";
        u.lIlIllll[u.lIllIIII[20]] = "Leather gloves";
        u.lIlIllll[u.lIllIIII[38]] = "Wear";
        u.lIlIllll[u.lIllIIII[39]] = "Wear";
        u.lIlIllll[u.lIllIIII[40]] = "ring of wealth (";
    }

    public static void ag() {
        d lIlllIlIlIIlIll;
        Object lIlllIlIlIIllII;
        int[] nArray = new int[lIllIIII[1]];
        nArray[u.lIllIIII[0]] = cZ;
        if (u.lIIlIIlllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(cZ, lIllIIII[1], lIllIIII[21]);
            bB.add(d2);

        }
        int[] nArray2 = new int[lIllIIII[1]];
        nArray2[u.lIllIIII[0]] = da;
        if (u.lIIlIIlllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIlllIlIlIIllII = new DHelper(da, lIllIIII[1], lIllIIII[22]);
            bB.add((DHelper) IlllIlIlIIllII);

        }
        int[] nArray3 = new int[lIllIIII[1]];
        nArray3[u.lIllIIII[0]] = lIllIIII[8];
        if (u.lIIlIIlllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIlllIlIlIIllII = new DHelper(lIllIIII[8], lIllIIII[1], lIllIIII[23]);
            bB.add((DHelper) IlllIlIlIIllII);

        }
        int[] nArray4 = new int[lIllIIII[1]];
        nArray4[u.lIllIIII[0]] = lIllIIII[7];
        if (u.lIIlIIlllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIlllIlIlIIllII = new DHelper(lIllIIII[7], lIllIIII[1], lIllIIII[24]);
            bB.add((DHelper) IlllIlIlIIllII);

        }
        int[] nArray5 = new int[lIllIIII[1]];
        nArray5[u.lIllIIII[0]] = lIllIIII[25];
        if (u.lIIlIIlllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIlllIlIlIIllII = new DHelper(lIllIIII[25], lIllIIII[5], lIllIIII[13]);
            bB.add((DHelper) IlllIlIlIIllII);

        }
        int[] nArray6 = new int[lIllIIII[1]];
        nArray6[u.lIllIIII[0]] = lIllIIII[26];
        if (u.lIIlIIlllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIlllIlIlIIllII = new DHelper(lIllIIII[26], lIllIIII[27], lIllIIII[13]);
            bB.add((DHelper) IlllIlIlIIllII);

        }
        int[] nArray7 = new int[lIllIIII[1]];
        nArray7[u.lIllIIII[0]] = lIllIIII[28];
        if (u.lIIlIIlllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIlllIlIlIIllII = new DHelper(lIllIIII[28], lIllIIII[29], lIllIIII[13]);
            bB.add((DHelper) IlllIlIlIIllII);

        }
        int[] nArray8 = new int[lIllIIII[1]];
        nArray8[u.lIllIIII[0]] = lIllIIII[30];
        if (u.lIIlIIlllII(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lIlllIlIlIIllII = new DHelper(lIllIIII[30], lIllIIII[31], lIllIIII[13]);
            bB.add((DHelper) IlllIlIlIIllII);

        }
        int[] nArray9 = new int[lIllIIII[1]];
        nArray9[u.lIllIIII[0]] = lIllIIII[25];
        if (u.lIIlIIllIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
            int[] nArray10 = new int[lIllIIII[1]];
            nArray10[u.lIllIIII[0]] = lIllIIII[25];
            if (u.lIIlIIllIll(Bank.getFirst((int[])nArray10).getQuantity(), lIllIIII[32])) {
                lIlllIlIlIIllII = new DHelper(lIllIIII[25], lIllIIII[5], lIllIIII[13]);
                bB.add((DHelper) IlllIlIlIIllII);

            }
        }
        int[] nArray11 = new int[lIllIIII[1]];
        nArray11[u.lIllIIII[0]] = lIllIIII[26];
        if (u.lIIlIIllIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
            int[] nArray12 = new int[lIllIIII[1]];
            nArray12[u.lIllIIII[0]] = lIllIIII[26];
            if (u.lIIlIIllIll(Bank.getFirst((int[])nArray12).getQuantity(), lIllIIII[32])) {
                lIlllIlIlIIllII = new DHelper(lIllIIII[26], lIllIIII[27], lIllIIII[13]);
                bB.add((DHelper) IlllIlIlIIllII);

            }
        }
        int[] nArray13 = new int[lIllIIII[1]];
        nArray13[u.lIllIIII[0]] = lIllIIII[28];
        if (u.lIIlIIllIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
            int[] nArray14 = new int[lIllIIII[1]];
            nArray14[u.lIllIIII[0]] = lIllIIII[28];
            if (u.lIIlIIllIll(Bank.getFirst((int[])nArray14).getQuantity(), lIllIIII[32])) {
                lIlllIlIlIIllII = new DHelper(lIllIIII[28], lIllIIII[29], lIllIIII[13]);
                bB.add((DHelper) IlllIlIlIIllII);

            }
        }
        int[] nArray15 = new int[lIllIIII[1]];
        nArray15[u.lIllIIII[0]] = lIllIIII[30];
        if (u.lIIlIIllIlI(Bank.contains((int[])nArray15) ? 1 : 0)) {
            int[] nArray16 = new int[lIllIIII[1]];
            nArray16[u.lIllIIII[0]] = lIllIIII[30];
            if (u.lIIlIIllIll(Bank.getFirst((int[])nArray16).getQuantity(), lIllIIII[32])) {
                lIlllIlIlIIllII = new DHelper(lIllIIII[30], lIllIIII[31], lIllIIII[13]);
                bB.add((DHelper) IlllIlIlIIllII);

            }
        }
        if (u.lIIlIIlllII(Bank.contains((Predicate)(lIlllIlIlIIllII = item -> item.getName().toLowerCase().contains(lIlIllll[lIllIIII[40]]))) ? 1 : 0)) {
            lIlllIlIlIIlIll = new DHelper(lIllIIII[33], lIllIIII[6], lIllIIII[34]);
            bB.add(lIlllIlIlIIlIll);

        }
        int[] nArray17 = new int[lIllIIII[1]];
        nArray17[u.lIllIIII[0]] = lIllIIII[35];
        if (u.lIIlIIlllII(Bank.contains((int[])nArray17) ? 1 : 0)) {
            lIlllIlIlIIlIll = new DHelper(lIllIIII[35], lIllIIII[36], lIllIIII[37]);
            bB.add(lIlllIlIlIIlIll);

        }
    }
}

