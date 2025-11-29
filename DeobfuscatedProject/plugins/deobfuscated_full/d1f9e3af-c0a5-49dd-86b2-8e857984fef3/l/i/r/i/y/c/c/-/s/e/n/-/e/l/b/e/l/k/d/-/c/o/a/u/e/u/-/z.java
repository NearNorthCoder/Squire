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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import net.runelite.api.Item;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class z {
    private static /* synthetic */ String[] lIIIlIIII;
    private static /* synthetic */ int dx;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ int[] lIIIlIIIl;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int dy;
    private static /* synthetic */ int[] dz;

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
            d d2 = new d(dx, lIIIlIIIl[1], lIIIlIIIl[21]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIlIIIl[1]];
        nArray2[z.lIIIlIIIl[0]] = dy;
        if (z.lllIIIlIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIlIIIlIlIlIIl = new d(dy, lIIIlIIIl[1], lIIIlIIIl[22]);
            bv.add((d)lIIlIIIlIlIlIIl);
            0;
        }
        int[] nArray3 = new int[lIIIlIIIl[1]];
        nArray3[z.lIIIlIIIl[0]] = lIIIlIIIl[8];
        if (z.lllIIIlIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIlIIIlIlIlIIl = new d(lIIIlIIIl[8], lIIIlIIIl[1], lIIIlIIIl[23]);
            bv.add((d)lIIlIIIlIlIlIIl);
            0;
        }
        int[] nArray4 = new int[lIIIlIIIl[1]];
        nArray4[z.lIIIlIIIl[0]] = lIIIlIIIl[7];
        if (z.lllIIIlIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIlIIIlIlIlIIl = new d(lIIIlIIIl[7], lIIIlIIIl[1], lIIIlIIIl[24]);
            bv.add((d)lIIlIIIlIlIlIIl);
            0;
        }
        int[] nArray5 = new int[lIIIlIIIl[1]];
        nArray5[z.lIIIlIIIl[0]] = lIIIlIIIl[25];
        if (z.lllIIIlIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIlIIIlIlIlIIl = new d(lIIIlIIIl[25], lIIIlIIIl[5], lIIIlIIIl[13]);
            bv.add((d)lIIlIIIlIlIlIIl);
            0;
        }
        int[] nArray6 = new int[lIIIlIIIl[1]];
        nArray6[z.lIIIlIIIl[0]] = lIIIlIIIl[26];
        if (z.lllIIIlIIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIIlIIIlIlIlIIl = new d(lIIIlIIIl[26], lIIIlIIIl[27], lIIIlIIIl[13]);
            bv.add((d)lIIlIIIlIlIlIIl);
            0;
        }
        int[] nArray7 = new int[lIIIlIIIl[1]];
        nArray7[z.lIIIlIIIl[0]] = lIIIlIIIl[28];
        if (z.lllIIIlIIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIIlIIIlIlIlIIl = new d(lIIIlIIIl[28], lIIIlIIIl[29], lIIIlIIIl[13]);
            bv.add((d)lIIlIIIlIlIlIIl);
            0;
        }
        int[] nArray8 = new int[lIIIlIIIl[1]];
        nArray8[z.lIIIlIIIl[0]] = lIIIlIIIl[30];
        if (z.lllIIIlIIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lIIlIIIlIlIlIIl = new d(lIIIlIIIl[30], lIIIlIIIl[31], lIIIlIIIl[13]);
            bv.add((d)lIIlIIIlIlIlIIl);
            0;
        }
        int[] nArray9 = new int[lIIIlIIIl[1]];
        nArray9[z.lIIIlIIIl[0]] = lIIIlIIIl[25];
        if (z.lllIIIIlllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
            int[] nArray10 = new int[lIIIlIIIl[1]];
            nArray10[z.lIIIlIIIl[0]] = lIIIlIIIl[25];
            if (z.lllIIIIllll(Bank.getFirst((int[])nArray10).getQuantity(), lIIIlIIIl[32])) {
                lIIlIIIlIlIlIIl = new d(lIIIlIIIl[25], lIIIlIIIl[5], lIIIlIIIl[13]);
                bv.add((d)lIIlIIIlIlIlIIl);
                0;
            }
        }
        int[] nArray11 = new int[lIIIlIIIl[1]];
        nArray11[z.lIIIlIIIl[0]] = lIIIlIIIl[26];
        if (z.lllIIIIlllI(Bank.contains((int[])nArray11) ? 1 : 0)) {
            int[] nArray12 = new int[lIIIlIIIl[1]];
            nArray12[z.lIIIlIIIl[0]] = lIIIlIIIl[26];
            if (z.lllIIIIllll(Bank.getFirst((int[])nArray12).getQuantity(), lIIIlIIIl[32])) {
                lIIlIIIlIlIlIIl = new d(lIIIlIIIl[26], lIIIlIIIl[27], lIIIlIIIl[13]);
                bv.add((d)lIIlIIIlIlIlIIl);
                0;
            }
        }
        int[] nArray13 = new int[lIIIlIIIl[1]];
        nArray13[z.lIIIlIIIl[0]] = lIIIlIIIl[28];
        if (z.lllIIIIlllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
            int[] nArray14 = new int[lIIIlIIIl[1]];
            nArray14[z.lIIIlIIIl[0]] = lIIIlIIIl[28];
            if (z.lllIIIIllll(Bank.getFirst((int[])nArray14).getQuantity(), lIIIlIIIl[32])) {
                lIIlIIIlIlIlIIl = new d(lIIIlIIIl[28], lIIIlIIIl[29], lIIIlIIIl[13]);
                bv.add((d)lIIlIIIlIlIlIIl);
                0;
            }
        }
        int[] nArray15 = new int[lIIIlIIIl[1]];
        nArray15[z.lIIIlIIIl[0]] = lIIIlIIIl[30];
        if (z.lllIIIIlllI(Bank.contains((int[])nArray15) ? 1 : 0)) {
            int[] nArray16 = new int[lIIIlIIIl[1]];
            nArray16[z.lIIIlIIIl[0]] = lIIIlIIIl[30];
            if (z.lllIIIIllll(Bank.getFirst((int[])nArray16).getQuantity(), lIIIlIIIl[32])) {
                lIIlIIIlIlIlIIl = new d(lIIIlIIIl[30], lIIIlIIIl[31], lIIIlIIIl[13]);
                bv.add((d)lIIlIIIlIlIlIIl);
                0;
            }
        }
        if (z.lllIIIlIIII(Bank.contains((Predicate)(lIIlIIIlIlIlIIl = item -> item.getName().toLowerCase().contains(lIIIlIIII[lIIIlIIIl[40]]))) ? 1 : 0)) {
            lIIlIIIlIlIlIII = new d(lIIIlIIIl[33], lIIIlIIIl[6], lIIIlIIIl[34]);
            bv.add(lIIlIIIlIlIlIII);
            0;
        }
        int[] nArray17 = new int[lIIIlIIIl[1]];
        nArray17[z.lIIIlIIIl[0]] = lIIIlIIIl[35];
        if (z.lllIIIlIIII(Bank.contains((int[])nArray17) ? 1 : 0)) {
            lIIlIIIlIlIlIII = new d(lIIIlIIIl[35], lIIIlIIIl[36], lIIIlIIIl[37]);
            bv.add(lIIlIIIlIlIlIII);
            0;
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
                        0;
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
                                        0;
                                    }
                                    if (!z.lllIIIIlllI(Bank.isOpen() ? 1 : 0)) break block29;
                                    AccBuilderEasyClues.c = lIIIlIIII[lIIIlIIIl[6]];
                                    if (z.lllIIIlIIlI(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIIIlIIIl[3]);
                                        0;
                                    }
                                    if (z.lllIIIlIIlI(Equipment.getAll().size()) && z.lllIIIlIIII(z.bi() ? 1 : 0)) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIIIlIIIl[2]);
                                        0;
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
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlIIIl[1]];
                            nArray[z.lIIIlIIIl[0]] = dx;
                            if (z.lllIIIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlIIIl[1];
                                0;
                                if (2 == 1) {
                                    return false;
                                }
                            } else {
                                bl = lIIIlIIIl[0];
                            }
                            return bl;
                        }, (int)lIIIlIIIl[5]);
                        0;
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
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlIIIl[1]];
                            nArray[z.lIIIlIIIl[0]] = dy;
                            if (z.lllIIIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlIIIl[1];
                                0;
                                
                                }
                            } else {
                                bl = lIIIlIIIl[0];
                            }
                            return bl;
                        }, (int)lIIIlIIIl[5]);
                        0;
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
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlIIIl[1]];
                            nArray[z.lIIIlIIIl[0]] = lIIIlIIIl[7];
                            if (z.lllIIIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlIIIl[1];
                                0;
                                if ((3 ^ (0x5A ^ 0x5D)) < 1) {
                                    return ((82 + 24 - 47 + 191 ^ 99 + 164 - 209 + 123) & (0xE2 ^ 0x93 ^ (3 ^ 0x39) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIlIIIl[0];
                            }
                            return bl;
                        }, (int)lIIIlIIIl[5]);
                        0;
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
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlIIIl[1]];
                            nArray[z.lIIIlIIIl[0]] = lIIIlIIIl[8];
                            if (z.lllIIIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlIIIl[1];
                                0;
                                if (1 < ((9 ^ 0x4D ^ (0x94 ^ 0xB0)) & (74 + 203 - 238 + 168 ^ 24 + 120 - 92 + 123 ^ -1))) {
                                    return ((1 ^ 0x17 ^ (0x42 ^ 0x5F)) & (32 + 19 - 42 + 156 ^ 102 + 20 - 70 + 122 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIlIIIl[0];
                            }
                            return bl;
                        }, (int)lIIIlIIIl[5]);
                        0;
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
                        0;
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
                                    0;
                                }
                                String[] stringArray2 = new String[lIIIlIIIl[1]];
                                stringArray2[z.lIIIlIIIl[0]] = lIIIlIIII[lIIIlIIIl[12]];
                                if (z.lllIIIIlllI(lIIlIIIlIlIllII.hasAction(stringArray2) ? 1 : 0)) {
                                    lIIlIIIlIlIllII.interact(lIIIlIIII[lIIIlIIIl[13]]);
                                    Time.sleepTicks((int)lIIIlIIIl[1]);
                                    0;
                                }
                                String[] stringArray3 = new String[lIIIlIIIl[1]];
                                stringArray3[z.lIIIlIIIl[0]] = lIIIlIIII[lIIIlIIIl[14]];
                                if (z.lllIIIIlllI(lIIlIIIlIlIllII.hasAction(stringArray3) ? 1 : 0)) {
                                    lIIlIIIlIlIllII.interact(lIIIlIIII[lIIIlIIIl[15]]);
                                    Time.sleepTicks((int)lIIIlIIIl[1]);
                                    0;
                                }
                                Time.sleepTicks((int)lIIIlIIIl[1]);
                                0;
                            }
                        }
                        ++lIIlIIIlIlIllIl;
                        0;
                        if (((0xBD ^ 0xAC ^ (0xFD ^ 0xB3)) & (213 + 213 - 357 + 164 ^ 55 + 36 - 20 + 111 ^ -1)) == 0) continue;
                        return;
                    }
                    if (z.lllIIIIlllI(z.bi() ? 1 : 0) && z.lllIIIlIIII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIIIl[16]);
                        0;
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

    private static String lllIIIIlIIl(String lIIlIIIIllllIll, String lIIlIIIIllllIlI) {
        try {
            SecretKeySpec lIIlIIIIllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIIIIllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIIIIlllllIl = Cipher.getInstance("Blowfish");
            lIIlIIIIlllllIl.init(lIIIlIIIl[2], lIIlIIIIllllllI);
            return new String(lIIlIIIIlllllIl.doFinal(Base64.getDecoder().decode(lIIlIIIIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIIIlllllII) {
            lIIlIIIIlllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lllIIIIlIlI(String lIIlIIIlIIllIII, String lIIlIIIlIIlllII) {
        lIIlIIIlIIllIII = new String(Base64.getDecoder().decode(lIIlIIIlIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIIIlIIllIll = new StringBuilder();
        char[] lIIlIIIlIIllIlI = lIIlIIIlIIlllII.toCharArray();
        int lIIlIIIlIIllIIl = lIIIlIIIl[0];
        char[] lIIlIIIlIIlIIll = lIIlIIIlIIllIII.toCharArray();
        int lIIlIIIlIIlIIlI = lIIlIIIlIIlIIll.length;
        int lIIlIIIlIIlIIIl = lIIIlIIIl[0];
        while (z.lllIIIIllll(lIIlIIIlIIlIIIl, lIIlIIIlIIlIIlI)) {
            char lIIlIIIlIIllllI = lIIlIIIlIIlIIll[lIIlIIIlIIlIIIl];
            lIIlIIIlIIllIll.append((char)(lIIlIIIlIIllllI ^ lIIlIIIlIIllIlI[lIIlIIIlIIllIIl % lIIlIIIlIIllIlI.length]));
            0;
            ++lIIlIIIlIIllIIl;
            ++lIIlIIIlIIlIIIl;
            0;
            if (-1 != (1 & ~1)) continue;
            return null;
        }
        return String.valueOf(lIIlIIIlIIllIll);
    }

    private static String lllIIIIlIll(String lIIlIIIlIIIIllI, String lIIlIIIlIIIIlll) {
        try {
            SecretKeySpec lIIlIIIlIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIIIlIIIIlll.getBytes(StandardCharsets.UTF_8)), lIIIlIIIl[11]), "DES");
            Cipher lIIlIIIlIIIlIlI = Cipher.getInstance("DES");
            lIIlIIIlIIIlIlI.init(lIIIlIIIl[2], lIIlIIIlIIIlIll);
            return new String(lIIlIIIlIIIlIlI.doFinal(Base64.getDecoder().decode(lIIlIIIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIIlIIIlIIl) {
            lIIlIIIlIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlIIII(int n2) {
        return n2 == 0;
    }

    public static void bj() {
        if (z.lllIIIIlllI(Inventory.contains((int[])f.bf) ? 1 : 0) && z.lllIIIlIIII(Equipment.contains((int[])f.bf) ? 1 : 0)) {
            Inventory.getFirst((int[])f.bf).interact(lIIIlIIII[lIIIlIIIl[38]]);
            Time.sleepTicks((int)lIIIlIIIl[1]);
            0;
        }
        if (z.lllIIIIlllI(Inventory.contains((int[])f.aR) ? 1 : 0) && z.lllIIIlIIII(Equipment.contains((int[])f.aR) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aR).interact(lIIIlIIII[lIIIlIIIl[39]]);
            Time.sleepTicks((int)lIIIlIIIl[1]);
            0;
        }
    }

    private static void lllIIIIllIl() {
        lIIIlIIIl = new int[44];
        z.lIIIlIIIl[0] = (0x22 ^ 0x1C ^ (0x1A ^ 0x67)) & (0x8E ^ 0xB6 ^ (0x54 ^ 0x2F) ^ -1);
        z.lIIIlIIIl[1] = 1;
        z.lIIIlIIIl[2] = 2;
        z.lIIIlIIIl[3] = 3;
        z.lIIIlIIIl[4] = 148 + 119 - 255 + 153 ^ 154 + 107 - 237 + 137;
        z.lIIIlIIIl[5] = -(0xFFFFF57C & 0x6ABB) & (0xFFFFFBBF & 0x77FF);
        z.lIIIlIIIl[6] = 0x9B ^ 0x9E;
        z.lIIIlIIIl[7] = 0xFFFFDBFC & 0x2DFB;
        z.lIIIlIIIl[8] = 0xFFFFBEFF & 0x47A8;
        z.lIIIlIIIl[9] = 0xB7 ^ 0xC3 ^ (0xD3 ^ 0xA1);
        z.lIIIlIIIl[10] = 118 + 110 - 70 + 34 ^ 32 + 160 - 102 + 109;
        z.lIIIlIIIl[11] = 9 ^ 0x52 ^ (0xD ^ 0x5E);
        z.lIIIlIIIl[12] = 0x2B ^ 0x22;
        z.lIIIlIIIl[13] = 0xA5 ^ 0xAF;
        z.lIIIlIIIl[14] = 0xB3 ^ 0x85 ^ (0x9A ^ 0xA7);
        z.lIIIlIIIl[15] = 0x92 ^ 0x9E;
        z.lIIIlIIIl[16] = 0xFFFFFFFE & 0x1965;
        z.lIIIlIIIl[17] = 0x6F ^ 0x62;
        z.lIIIlIIIl[18] = 0x39 ^ 0x37;
        z.lIIIlIIIl[19] = 0x26 ^ 0x29;
        z.lIIIlIIIl[20] = 0x53 ^ 1 ^ (0x70 ^ 0x32);
        z.lIIIlIIIl[21] = -2 & (0xFFFFECDF & 0x33FB);
        z.lIIIlIIIl[22] = 0xFFFFBFEF & 0x45F6;
        z.lIIIlIIIl[23] = 0xFFFFFFDE & 0x6F7F;
        z.lIIIlIIIl[24] = -(0xFFFFFFFD & 0x2A97) & (0xFFFFBFDF & 0x7FFE);
        z.lIIIlIIIl[25] = -(0xFFFFF136 & 0x2FDB) & (0xFFFFEBBF & 0x377F);
        z.lIIIlIIIl[26] = 0xFFFF8F6B & 0x72BF;
        z.lIIIlIIIl[27] = -(0xFFFFBB57 & 0x54EB) & (0xFFFF9FFA & 0x7BFF);
        z.lIIIlIIIl[28] = 0xFFFFF62F & 0xBFD;
        z.lIIIlIIIl[29] = -(0xF4 ^ 0xB2) & (0xFFFFAFEF & 0x5FF5);
        z.lIIIlIIIl[30] = 0xFFFFD32A & 0x2EFF;
        z.lIIIlIIIl[31] = 0xFFFFFFCB & 0x1F74;
        z.lIIIlIIIl[32] = -(0xFFFFDF2B & 0x7CDD) & (0xFFFFDDFF & 0x7FFC);
        z.lIIIlIIIl[33] = -(0xFFFFEDE6 & 0x533B) & (0xFFFFFFED & 0x6FFF);
        z.lIIIlIIIl[34] = -(0xFFFFBFB4 & 0x565F) & (0xFFFFF7BF & 0x7FFB);
        z.lIIIlIIIl[35] = -(0xFFFFFE93 & 0x217D) & (0xFFFFBF57 & Short.MAX_VALUE);
        z.lIIIlIIIl[36] = 0xFFFFABD4 & 0x55BB;
        z.lIIIlIIIl[37] = 0xFFFFB3D7 & 0x4FAC;
        z.lIIIlIIIl[38] = 0x3F ^ 0x2E;
        z.lIIIlIIIl[39] = 0x86 ^ 0x94;
        z.lIIIlIIIl[40] = 9 + 198 - 93 + 97 ^ 130 + 156 - 226 + 132;
        z.lIIIlIIIl[41] = -(0xFFFFFF9D & 0x58F3) & (0xFFFFFDF5 & 0x5FFF);
        z.lIIIlIIIl[42] = -(0xFFFFFFBD & 0x785F) & (0xFFFFFFFF & 0x7C3F);
        z.lIIIlIIIl[43] = 56 + 62 - 76 + 145 ^ 123 + 151 - 182 + 83;
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
                    0;
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
        z.lIIIlIIII[z.lIIIlIIIl[0]] = z."Buying items";
        z.lIIIlIIII[z.lIIIlIIIl[1]] = z."Finished buying items, switching back to gearing";
        z.lIIIlIIII[z.lIIIlIIIl[2]] = z."Get Mage Gear Util";
        z.lIIIlIIII[z.lIIIlIIIl[3]] = z."Navigating to bank";
        z.lIIIlIIII[z.lIIIlIIIl[4]] = z."Opening bank";
        z.lIIIlIIII[z.lIIIlIIIl[6]] = z."Handling banking";
        z.lIIIlIIII[z.lIIIlIIIl[9]] = z."We are missing supplies, switching to BUYING Util";
        z.lIIIlIIII[z.lIIIlIIIl[10]] = z."Wear";
        z.lIIIlIIII[z.lIIIlIIIl[11]] = z."Wear";
        z.lIIIlIIII[z.lIIIlIIIl[12]] = z."Wield";
        z.lIIIlIIII[z.lIIIlIIIl[13]] = z."Wield";
        z.lIIIlIIII[z.lIIIlIIIl[14]] = z."Equip";
        z.lIIIlIIII[z.lIIIlIIIl[15]] = z."Equip";
        z.lIIIlIIII[z.lIIIlIIIl[17]] = z."Staff of air";
        z.lIIIlIIII[z.lIIIlIIIl[18]] = z."Leather gloves";
        z.lIIIlIIII[z.lIIIlIIIl[19]] = z."Staff of air";
        z.lIIIlIIII[z.lIIIlIIIl[20]] = z."Leather gloves";
        z.lIIIlIIII[z.lIIIlIIIl[38]] = z."Wear";
        z.lIIIlIIII[z.lIIIlIIIl[39]] = z."Wear";
        z.lIIIlIIII[z.lIIIlIIIl[40]] = z."ring of wealth (";
    }
}

